package android.support.v4.media;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.support.v4.os.ResultReceiver;
import org.v;
import org.whispersystems.at;

public interface IMediaBrowserServiceCompat extends IInterface {

    public abstract class Stub extends Binder implements IMediaBrowserServiceCompat {
        private static final String[] z;

        static {
            String[] strArr = new String[7];
            String str = "z;OL>r1\u0005M$k%DL%5#\u001f\u0010<~1B_\u007fR\u0018NZ8z\u0017YQ&h0Ym4i#B]4X:FN0o";
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
                            i3 = 27;
                            break;
                        case at.g /*1*/:
                            i3 = 85;
                            break;
                        case at.i /*2*/:
                            i3 = 43;
                            break;
                        case at.o /*3*/:
                            i3 = 62;
                            break;
                        default:
                            i3 = 81;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "z;OL>r1\u0005M$k%DL%5#\u001f\u0010<~1B_\u007fR\u0018NZ8z\u0017YQ&h0Ym4i#B]4X:FN0o";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        str = "z;OL>r1\u0005M$k%DL%5#\u001f\u0010<~1B_\u007fR\u0018NZ8z\u0017YQ&h0Ym4i#B]4X:FN0o";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        str = "z;OL>r1\u0005M$k%DL%5#\u001f\u0010<~1B_\u007fR\u0018NZ8z\u0017YQ&h0Ym4i#B]4X:FN0o";
                        i = 4;
                        strArr2 = strArr3;
                        obj = 3;
                        break;
                    case at.o /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        strArr2 = strArr3;
                        str = "z;OL>r1\u0005M$k%DL%5#\u001f\u0010<~1B_\u007fR\u0018NZ8z\u0017YQ&h0Ym4i#B]4X:FN0o";
                        obj = 4;
                        break;
                    case at.p /*4*/:
                        strArr2[i] = str;
                        i = 6;
                        str = "z;OL>r1\u0005M$k%DL%5#\u001f\u0010<~1B_\u007fR\u0018NZ8z\u0017YQ&h0Ym4i#B]4X:FN0o";
                        obj = 5;
                        strArr2 = strArr3;
                        break;
                    case at.m /*5*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "z;OL>r1\u0005M$k%DL%5#\u001f\u0010<~1B_\u007fR\u0018NZ8z\u0017YQ&h0Ym4i#B]4X:FN0o";
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

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r6, android.os.Parcel r7, android.os.Parcel r8, int r9) {
            /*
            r5 = this;
            r1 = 0;
            r2 = 1;
            r3 = android.support.v4.media.MediaBrowserServiceCompat.a;
            switch(r6) {
                case 1: goto L_0x0015;
                case 2: goto L_0x003f;
                case 3: goto L_0x0054;
                case 4: goto L_0x006d;
                case 5: goto L_0x0086;
                case 1598968902: goto L_0x000c;
                default: goto L_0x0007;
            };
        L_0x0007:
            r0 = super.onTransact(r6, r7, r8, r9);
        L_0x000b:
            return r0;
        L_0x000c:
            r0 = z;
            r0 = r0[r2];
            r8.writeString(r0);
            r0 = r2;
            goto L_0x000b;
        L_0x0015:
            r0 = z;
            r4 = 4;
            r0 = r0[r4];
            r7.enforceInterface(r0);
            r4 = r7.readString();
            r0 = r7.readInt();
            if (r0 == 0) goto L_0x0031;
        L_0x0027:
            r0 = android.os.Bundle.CREATOR;
            r0 = r0.createFromParcel(r7);
            r0 = (android.os.Bundle) r0;
            if (r3 == 0) goto L_0x0032;
        L_0x0031:
            r0 = r1;
        L_0x0032:
            r1 = r7.readStrongBinder();
            r1 = android.support.v4.media.IMediaBrowserServiceCompatCallbacks.Stub.asInterface(r1);
            r5.connect(r4, r0, r1);
            r0 = r2;
            goto L_0x000b;
        L_0x003f:
            r0 = z;
            r1 = 2;
            r0 = r0[r1];
            r7.enforceInterface(r0);
            r0 = r7.readStrongBinder();
            r0 = android.support.v4.media.IMediaBrowserServiceCompatCallbacks.Stub.asInterface(r0);
            r5.disconnect(r0);
            r0 = r2;
            goto L_0x000b;
        L_0x0054:
            r0 = z;
            r1 = 0;
            r0 = r0[r1];
            r7.enforceInterface(r0);
            r0 = r7.readString();
            r1 = r7.readStrongBinder();
            r1 = android.support.v4.media.IMediaBrowserServiceCompatCallbacks.Stub.asInterface(r1);
            r5.addSubscription(r0, r1);
            r0 = r2;
            goto L_0x000b;
        L_0x006d:
            r0 = z;
            r1 = 3;
            r0 = r0[r1];
            r7.enforceInterface(r0);
            r0 = r7.readString();
            r1 = r7.readStrongBinder();
            r1 = android.support.v4.media.IMediaBrowserServiceCompatCallbacks.Stub.asInterface(r1);
            r5.removeSubscription(r0, r1);
            r0 = r2;
            goto L_0x000b;
        L_0x0086:
            r0 = z;
            r4 = 5;
            r0 = r0[r4];
            r7.enforceInterface(r0);
            r4 = r7.readString();
            r0 = r7.readInt();
            if (r0 == 0) goto L_0x00a2;
        L_0x0098:
            r0 = android.support.v4.os.ResultReceiver.CREATOR;
            r0 = r0.createFromParcel(r7);
            r0 = (android.support.v4.os.ResultReceiver) r0;
            if (r3 == 0) goto L_0x00a3;
        L_0x00a2:
            r0 = r1;
        L_0x00a3:
            r5.getMediaItem(r4, r0);
            r0 = r2;
            goto L_0x000b;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.IMediaBrowserServiceCompat.Stub.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }

        public Stub() {
            attachInterface(this, z[6]);
        }
    }

    void addSubscription(String str, IMediaBrowserServiceCompatCallbacks iMediaBrowserServiceCompatCallbacks);

    void connect(String str, Bundle bundle, IMediaBrowserServiceCompatCallbacks iMediaBrowserServiceCompatCallbacks);

    void disconnect(IMediaBrowserServiceCompatCallbacks iMediaBrowserServiceCompatCallbacks);

    void getMediaItem(String str, ResultReceiver resultReceiver);

    void removeSubscription(String str, IMediaBrowserServiceCompatCallbacks iMediaBrowserServiceCompatCallbacks);
}
