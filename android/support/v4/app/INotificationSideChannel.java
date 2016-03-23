package android.support.v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

public interface INotificationSideChannel extends IInterface {

    public abstract class Stub extends Binder implements INotificationSideChannel {
        private static final String[] z;

        class Proxy implements INotificationSideChannel {
            private static final String[] z;
            private IBinder mRemote;

            static {
                String[] strArr = new String[3];
                String str = "\u0018^a\"n\u0010T+#t\t@j\"uWF1~`\t@+\u0019O\u0016Dl6h\u001aQq9n\u0017cl4d:Xd>o\u001c\\";
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
                                i3 = 121;
                                break;
                            case at.g /*1*/:
                                i3 = 48;
                                break;
                            case at.i /*2*/:
                                i3 = 5;
                                break;
                            case at.o /*3*/:
                                i3 = 80;
                                break;
                            default:
                                i3 = 1;
                                break;
                        }
                        cArr[i2] = (char) (i3 ^ c);
                    }
                    str = new String(cArr).intern();
                    switch (obj) {
                        case v.m /*0*/:
                            strArr2[i] = str;
                            i = 2;
                            strArr2 = strArr3;
                            str = "\u0018^a\"n\u0010T+#t\t@j\"uWF1~`\t@+\u0019O\u0016Dl6h\u001aQq9n\u0017cl4d:Xd>o\u001c\\";
                            obj = 1;
                            break;
                        case at.g /*1*/:
                            strArr2[i] = str;
                            z = strArr3;
                            return;
                        default:
                            strArr2[i] = str;
                            str = "\u0018^a\"n\u0010T+#t\t@j\"uWF1~`\t@+\u0019O\u0016Dl6h\u001aQq9n\u0017cl4d:Xd>o\u001c\\";
                            i = 1;
                            strArr2 = strArr3;
                            obj = null;
                            break;
                    }
                }
            }

            public void cancelAll(String str) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(z[1]);
                    obtain.writeString(str);
                    this.mRemote.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void notify(java.lang.String r6, int r7, java.lang.String r8, android.app.Notification r9) {
                /*
                r5 = this;
                r1 = android.os.Parcel.obtain();
                r0 = z;	 Catch:{ all -> 0x0033 }
                r2 = 2;
                r0 = r0[r2];	 Catch:{ all -> 0x0033 }
                r1.writeInterfaceToken(r0);	 Catch:{ all -> 0x0033 }
                r1.writeString(r6);	 Catch:{ all -> 0x0033 }
                r1.writeInt(r7);	 Catch:{ all -> 0x0033 }
                r1.writeString(r8);	 Catch:{ all -> 0x0033 }
                if (r9 == 0) goto L_0x0023;
            L_0x0017:
                r0 = 1;
                r1.writeInt(r0);	 Catch:{ all -> 0x0033 }
                r0 = 0;
                r9.writeToParcel(r1, r0);	 Catch:{ all -> 0x0033 }
                r0 = android.support.v4.app.Fragment.a;	 Catch:{ all -> 0x0033 }
                if (r0 == 0) goto L_0x0027;
            L_0x0023:
                r0 = 0;
                r1.writeInt(r0);	 Catch:{ all -> 0x0033 }
            L_0x0027:
                r0 = r5.mRemote;	 Catch:{ all -> 0x0033 }
                r2 = 1;
                r3 = 0;
                r4 = 1;
                r0.transact(r2, r1, r3, r4);	 Catch:{ all -> 0x0033 }
                r1.recycle();
                return;
            L_0x0033:
                r0 = move-exception;
                r1.recycle();
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.INotificationSideChannel.Stub.Proxy.notify(java.lang.String, int, java.lang.String, android.app.Notification):void");
            }

            public void cancel(String str, int i, String str2) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(z[0]);
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    this.mRemote.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.mRemote;
            }
        }

        static {
            String[] strArr = new String[6];
            String str = "h\n]T\t`\u0000\u0017U\u0013y\u0014VT\u0012'\u0012\r\b\u0007y\u0014\u0017o(f\u0010P@\u000fj\u0005MO\tg7PB\u0003J\fXH\bl\b";
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
                            i3 = 9;
                            break;
                        case at.g /*1*/:
                            i3 = 100;
                            break;
                        case at.i /*2*/:
                            i3 = 57;
                            break;
                        case at.o /*3*/:
                            i3 = 38;
                            break;
                        default:
                            i3 = arj.Theme_checkboxStyle;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "h\n]T\t`\u0000\u0017U\u0013y\u0014VT\u0012'\u0012\r\b\u0007y\u0014\u0017o(f\u0010P@\u000fj\u0005MO\tg7PB\u0003J\fXH\bl\b";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        str = "h\n]T\t`\u0000\u0017U\u0013y\u0014VT\u0012'\u0012\r\b\u0007y\u0014\u0017o(f\u0010P@\u000fj\u0005MO\tg7PB\u0003J\fXH\bl\b";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        str = "h\n]T\t`\u0000\u0017U\u0013y\u0014VT\u0012'\u0012\r\b\u0007y\u0014\u0017o(f\u0010P@\u000fj\u0005MO\tg7PB\u0003J\fXH\bl\b";
                        i = 4;
                        strArr2 = strArr3;
                        obj = 3;
                        break;
                    case at.o /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        strArr2 = strArr3;
                        str = "h\n]T\t`\u0000\u0017U\u0013y\u0014VT\u0012'\u0012\r\b\u0007y\u0014\u0017o(f\u0010P@\u000fj\u0005MO\tg7PB\u0003J\fXH\bl\b";
                        obj = 4;
                        break;
                    case at.p /*4*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "h\n]T\t`\u0000\u0017U\u0013y\u0014VT\u0012'\u0012\r\b\u0007y\u0014\u0017o(f\u0010P@\u000fj\u0005MO\tg7PB\u0003J\fXH\bl\b";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, z[0]);
        }

        public static INotificationSideChannel asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(z[5]);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof INotificationSideChannel)) {
                return new Proxy(iBinder);
            }
            return (INotificationSideChannel) queryLocalInterface;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r7, android.os.Parcel r8, android.os.Parcel r9, int r10) {
            /*
            r6 = this;
            r1 = 1;
            switch(r7) {
                case 1: goto L_0x0013;
                case 2: goto L_0x003f;
                case 3: goto L_0x0058;
                case 1598968902: goto L_0x0009;
                default: goto L_0x0004;
            };
        L_0x0004:
            r0 = super.onTransact(r7, r8, r9, r10);
        L_0x0008:
            return r0;
        L_0x0009:
            r0 = z;
            r2 = 4;
            r0 = r0[r2];
            r9.writeString(r0);
            r0 = r1;
            goto L_0x0008;
        L_0x0013:
            r0 = z;
            r2 = 3;
            r0 = r0[r2];
            r8.enforceInterface(r0);
            r2 = r8.readString();
            r3 = r8.readInt();
            r4 = r8.readString();
            r0 = r8.readInt();
            if (r0 == 0) goto L_0x0039;
        L_0x002d:
            r0 = android.app.Notification.CREATOR;
            r0 = r0.createFromParcel(r8);
            r0 = (android.app.Notification) r0;
            r5 = android.support.v4.app.Fragment.a;
            if (r5 == 0) goto L_0x003a;
        L_0x0039:
            r0 = 0;
        L_0x003a:
            r6.notify(r2, r3, r4, r0);
            r0 = r1;
            goto L_0x0008;
        L_0x003f:
            r0 = z;
            r2 = 2;
            r0 = r0[r2];
            r8.enforceInterface(r0);
            r0 = r8.readString();
            r2 = r8.readInt();
            r3 = r8.readString();
            r6.cancel(r0, r2, r3);
            r0 = r1;
            goto L_0x0008;
        L_0x0058:
            r0 = z;
            r0 = r0[r1];
            r8.enforceInterface(r0);
            r0 = r8.readString();
            r6.cancelAll(r0);
            r0 = r1;
            goto L_0x0008;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.INotificationSideChannel.Stub.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    void cancel(String str, int i, String str2);

    void cancelAll(String str);

    void notify(String str, int i, String str2, Notification notification);
}
