package com.google.android.gms.iid;

import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class MessengerCompat implements Parcelable {
    public static final Creator CREATOR;
    public static int a;
    Messenger zzaBc;
    zzb zzaBd;

    final class 1 implements Creator {
        1() {
        }

        public Object createFromParcel(Parcel parcel) {
            return zzen(parcel);
        }

        public Object[] newArray(int i) {
            return zzgA(i);
        }

        public MessengerCompat zzen(Parcel parcel) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            return readStrongBinder != null ? new MessengerCompat(readStrongBinder) : null;
        }

        public MessengerCompat[] zzgA(int i) {
            return new MessengerCompat[i];
        }
    }

    final class zza extends com.google.android.gms.iid.zzb.zza {
        Handler handler;
        final MessengerCompat zzaBe;

        zza(MessengerCompat messengerCompat, Handler handler) {
            this.zzaBe = messengerCompat;
            this.handler = handler;
        }

        public void send(Message message) {
            message.arg2 = Binder.getCallingUid();
            this.handler.dispatchMessage(message);
        }
    }

    static {
        CREATOR = new 1();
    }

    public MessengerCompat(Handler handler) {
        if (VERSION.SDK_INT >= 21) {
            try {
                this.zzaBc = new Messenger(handler);
                if (a == 0) {
                    return;
                }
            } catch (ClassCastException e) {
                throw e;
            }
        }
        this.zzaBd = new zza(this, handler);
    }

    public MessengerCompat(IBinder iBinder) {
        if (VERSION.SDK_INT >= 21) {
            try {
                this.zzaBc = new Messenger(iBinder);
                if (a == 0) {
                    return;
                }
            } catch (ClassCastException e) {
                throw e;
            }
        }
        this.zzaBd = com.google.android.gms.iid.zzb.zza.zzbV(iBinder);
    }

    public static int zzc(Message message) {
        try {
            return VERSION.SDK_INT >= 21 ? zzd(message) : message.arg2;
        } catch (ClassCastException e) {
            throw e;
        }
    }

    private static int zzd(Message message) {
        return message.sendingUid;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null) {
            try {
                z = getBinder().equals(((MessengerCompat) obj).getBinder());
            } catch (ClassCastException e) {
            }
        }
        return z;
    }

    public IBinder getBinder() {
        try {
            return this.zzaBc != null ? this.zzaBc.getBinder() : this.zzaBd.asBinder();
        } catch (ClassCastException e) {
            throw e;
        }
    }

    public int hashCode() {
        return getBinder().hashCode();
    }

    public void send(Message message) {
        try {
            if (this.zzaBc != null) {
                this.zzaBc.send(message);
                if (a == 0) {
                    return;
                }
            }
            this.zzaBd.send(message);
        } catch (ClassCastException e) {
            throw e;
        } catch (ClassCastException e2) {
            throw e2;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        try {
            if (this.zzaBc != null) {
                parcel.writeStrongBinder(this.zzaBc.getBinder());
                if (a == 0) {
                    return;
                }
            }
            parcel.writeStrongBinder(this.zzaBd.asBinder());
        } catch (ClassCastException e) {
            throw e;
        } catch (ClassCastException e2) {
            throw e2;
        }
    }
}
