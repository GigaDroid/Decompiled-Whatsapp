package com.google.android.gms.common.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.PendingResult.BatchCallback;
import com.google.android.gms.common.internal.zzq;
import com.google.android.gms.common.internal.zzx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.whispersystems.at;

public abstract class zzb implements PendingResult {
    private boolean zzL;
    private final Object zzYD;
    protected final zza zzYE;
    private final ArrayList zzYF;
    private ResultCallback zzYG;
    private volatile Result zzYH;
    private volatile boolean zzYI;
    private boolean zzYJ;
    private zzq zzYK;
    private final CountDownLatch zzoR;

    public class zza extends Handler {
        public zza() {
            this(Looper.getMainLooper());
        }

        public zza(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case at.g /*1*/:
                    Pair pair = (Pair) message.obj;
                    zzb((ResultCallback) pair.first, (Result) pair.second);
                case at.i /*2*/:
                    ((zzb) message.obj).zzw(Status.zzaaG);
                default:
                    Log.wtf("AbstractPendingResult", "Don't know how to handle this message.");
            }
        }

        public void zza(ResultCallback resultCallback, Result result) {
            sendMessage(obtainMessage(1, new Pair(resultCallback, result)));
        }

        protected void zzb(ResultCallback resultCallback, Result result) {
            try {
                resultCallback.onResult(result);
            } catch (RuntimeException e) {
                zzb.zzc(result);
                throw e;
            }
        }

        public void zzna() {
            removeMessages(2);
        }
    }

    protected zzb(Looper looper) {
        this.zzYD = new Object();
        this.zzoR = new CountDownLatch(1);
        this.zzYF = new ArrayList();
        this.zzYE = new zza(looper);
    }

    private Result get() {
        Result result;
        boolean z = true;
        synchronized (this.zzYD) {
            if (this.zzYI) {
                z = false;
            }
            zzx.zza(z, "Result has already been consumed.");
            zzx.zza(isReady(), "Result is not ready.");
            result = this.zzYH;
            this.zzYH = null;
            this.zzYG = null;
            this.zzYI = true;
        }
        zzmZ();
        return result;
    }

    private void zzb(Result result) {
        boolean z = Api.a;
        this.zzYH = result;
        this.zzYK = null;
        this.zzoR.countDown();
        Status status = this.zzYH.getStatus();
        try {
            if (this.zzYG != null) {
                this.zzYE.zzna();
                if (!this.zzL) {
                    this.zzYE.zza(this.zzYG, get());
                }
            }
            Iterator it = this.zzYF.iterator();
            while (it.hasNext()) {
                ((BatchCallback) it.next()).onComplete(status);
                if (z) {
                    break;
                }
            }
            this.zzYF.clear();
        } catch (RuntimeException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    static void zzc(Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).release();
            } catch (Throwable e) {
                Log.w("AbstractPendingResult", "Unable to release " + result, e);
            }
        }
    }

    public final Result await() {
        boolean z = true;
        try {
            try {
                zzx.zza(Looper.myLooper() != Looper.getMainLooper(), "await must not be called on the UI thread");
                if (this.zzYI) {
                    z = false;
                }
                zzx.zza(z, "Result has already been consumed");
                try {
                    this.zzoR.await();
                } catch (InterruptedException e) {
                    zzw(Status.zzaaE);
                }
                zzx.zza(isReady(), "Result is not ready.");
                return get();
            } catch (InterruptedException e2) {
                throw e2;
            }
        } catch (InterruptedException e22) {
            throw e22;
        }
    }

    public void cancel() {
        synchronized (this.zzYD) {
            if (this.zzL || this.zzYI) {
                return;
            }
            try {
                if (this.zzYK != null) {
                    try {
                        this.zzYK.cancel();
                    } catch (RemoteException e) {
                    }
                }
                zzc(this.zzYH);
                this.zzYG = null;
                this.zzL = true;
                zzb(zzb(Status.zzaaH));
            } catch (RuntimeException e2) {
                throw e2;
            }
        }
    }

    public final boolean isReady() {
        try {
            return this.zzoR.getCount() == 0;
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public final void zza(Result result) {
        boolean z = true;
        synchronized (this.zzYD) {
            if (this.zzYJ || this.zzL) {
                zzc(result);
                return;
            }
            try {
                zzx.zza(!isReady(), "Results have already been set");
                if (this.zzYI) {
                    z = false;
                }
                zzx.zza(z, "Result has already been consumed");
                zzb(result);
            } catch (RuntimeException e) {
                throw e;
            } catch (RuntimeException e2) {
                throw e2;
            }
        }
    }

    protected abstract Result zzb(Status status);

    protected void zzmZ() {
    }

    public final void zzw(Status status) {
        synchronized (this.zzYD) {
            if (!isReady()) {
                zza(zzb(status));
                this.zzYJ = true;
            }
        }
    }
}
