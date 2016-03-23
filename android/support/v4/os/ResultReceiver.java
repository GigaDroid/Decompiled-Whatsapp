package android.support.v4.os;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.support.v4.app.FragmentActivity;
import android.support.v4.os.IResultReceiver.Stub;

public class ResultReceiver implements Parcelable {
    public static final Creator CREATOR;
    final Handler mHandler;
    final boolean mLocal;
    IResultReceiver mReceiver;

    final class 1 implements Creator {
        1() {
        }

        public ResultReceiver[] newArray(int i) {
            return new ResultReceiver[i];
        }

        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        public Object m55createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }

        public Object[] m56newArray(int i) {
            return newArray(i);
        }
    }

    class MyResultReceiver extends Stub {
        final ResultReceiver this$0;

        MyResultReceiver(ResultReceiver resultReceiver) {
            this.this$0 = resultReceiver;
        }

        public void send(int i, Bundle bundle) {
            if (this.this$0.mHandler != null) {
                this.this$0.mHandler.post(new MyRunnable(this.this$0, i, bundle));
                if (!CancellationSignal.a) {
                    return;
                }
            }
            this.this$0.onReceiveResult(i, bundle);
        }
    }

    class MyRunnable implements Runnable {
        final int mResultCode;
        final Bundle mResultData;
        final ResultReceiver this$0;

        public void run() {
            this.this$0.onReceiveResult(this.mResultCode, this.mResultData);
        }

        MyRunnable(ResultReceiver resultReceiver, int i, Bundle bundle) {
            this.this$0 = resultReceiver;
            this.mResultCode = i;
            this.mResultData = bundle;
        }
    }

    public int describeContents() {
        return 0;
    }

    protected void onReceiveResult(int i, Bundle bundle) {
    }

    ResultReceiver(Parcel parcel) {
        this.mLocal = false;
        this.mHandler = null;
        this.mReceiver = Stub.asInterface(parcel.readStrongBinder());
    }

    public void send(int i, Bundle bundle) {
        try {
            if (this.mLocal) {
                if (this.mHandler != null) {
                    this.mHandler.post(new MyRunnable(this, i, bundle));
                    if (!CancellationSignal.a) {
                        return;
                    }
                }
                try {
                    onReceiveResult(i, bundle);
                } catch (RemoteException e) {
                    throw e;
                }
            } else if (this.mReceiver != null) {
                try {
                    this.mReceiver.send(i, bundle);
                } catch (RemoteException e2) {
                }
            }
        } catch (RemoteException e3) {
            throw e3;
        } catch (RemoteException e32) {
            throw e32;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        boolean z = CancellationSignal.a;
        synchronized (this) {
            if (this.mReceiver == null) {
                this.mReceiver = new MyResultReceiver(this);
            }
            parcel.writeStrongBinder(this.mReceiver.asBinder());
        }
        if (FragmentActivity.a != 0) {
            CancellationSignal.a = !z;
        }
    }

    static {
        CREATOR = new 1();
    }
}
