package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.v4.app.FragmentActivity;
import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

public interface IResultReceiver extends IInterface {

    public abstract class Stub extends Binder implements IResultReceiver {
        private static final String[] z;

        class Proxy implements IResultReceiver {
            private static final String z;
            private IBinder mRemote;

            static {
                char[] toCharArray = "\u0015+;\u0004\u007f\u001d!q\u0005e\u000450\u0004dZ3kX\u007f\u0007k\u0016$u\u000703\u0002B\u0011&:\u001ff\u00117".toCharArray();
                int length = toCharArray.length;
                char[] cArr = toCharArray;
                for (int i = 0; length > i; i++) {
                    int i2;
                    char c = cArr[i];
                    switch (i % 5) {
                        case v.m /*0*/:
                            i2 = 116;
                            break;
                        case at.g /*1*/:
                            i2 = 69;
                            break;
                        case at.i /*2*/:
                            i2 = 95;
                            break;
                        case at.o /*3*/:
                            i2 = 118;
                            break;
                        default:
                            i2 = 16;
                            break;
                    }
                    cArr[i] = (char) (i2 ^ c);
                }
                z = new String(cArr).intern();
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public void send(int i, Bundle bundle) {
                boolean z = CancellationSignal.a;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(z);
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                        if (z) {
                            FragmentActivity.a++;
                        }
                        this.mRemote.transact(1, obtain, null, 1);
                    }
                    obtain.writeInt(0);
                    this.mRemote.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }
        }

        static {
            String[] strArr = new String[4];
            String str = "^\u007f\u000f.aVuE/{Oa\u0004.z\u0011g_raL?\"\u000ekLd\u0007(\\Zr\u000e5xZc";
            Object obj = -1;
            String[] strArr2 = strArr;
            String[] strArr3 = strArr;
            int i = 0;
            while (true) {
                char[] toCharArray = str.toCharArray();
                int length = toCharArray.length;
                char[] cArr = toCharArray;
                for (int i2 = 0; length > i2; i2++) {
                    int i3;
                    char c = cArr[i2];
                    switch (i2 % 5) {
                        case v.m /*0*/:
                            i3 = 63;
                            break;
                        case at.g /*1*/:
                            i3 = 17;
                            break;
                        case at.i /*2*/:
                            i3 = arj.Theme_seekBarStyle;
                            break;
                        case at.o /*3*/:
                            i3 = 92;
                            break;
                        default:
                            i3 = 14;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "^\u007f\u000f.aVuE/{Oa\u0004.z\u0011g_raL?\"\u000ekLd\u0007(\\Zr\u000e5xZc";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        i = 3;
                        strArr2 = strArr3;
                        str = "^\u007f\u000f.aVuE/{Oa\u0004.z\u0011g_raL?\"\u000ekLd\u0007(\\Zr\u000e5xZc";
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "^\u007f\u000f.aVuE/{Oa\u0004.z\u0011g_raL?\"\u000ekLd\u0007(\\Zr\u000e5xZc";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public static IResultReceiver asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(z[0]);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IResultReceiver)) {
                return new Proxy(iBinder);
            }
            return (IResultReceiver) queryLocalInterface;
        }

        public Stub() {
            attachInterface(this, z[1]);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
            /*
            r4 = this;
            r1 = 1;
            switch(r5) {
                case 1: goto L_0x0013;
                case 1598968902: goto L_0x0009;
                default: goto L_0x0004;
            };
        L_0x0004:
            r0 = super.onTransact(r5, r6, r7, r8);
        L_0x0008:
            return r0;
        L_0x0009:
            r0 = z;
            r2 = 3;
            r0 = r0[r2];
            r7.writeString(r0);
            r0 = r1;
            goto L_0x0008;
        L_0x0013:
            r0 = z;
            r2 = 2;
            r0 = r0[r2];
            r6.enforceInterface(r0);
            r2 = r6.readInt();
            r0 = r6.readInt();
            if (r0 == 0) goto L_0x0031;
        L_0x0025:
            r0 = android.os.Bundle.CREATOR;
            r0 = r0.createFromParcel(r6);
            r0 = (android.os.Bundle) r0;
            r3 = android.support.v4.os.CancellationSignal.a;
            if (r3 == 0) goto L_0x0032;
        L_0x0031:
            r0 = 0;
        L_0x0032:
            r4.send(r2, r0);
            r0 = r1;
            goto L_0x0008;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.os.IResultReceiver.Stub.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }

        public IBinder asBinder() {
            return this;
        }
    }

    void send(int i, Bundle bundle);
}
