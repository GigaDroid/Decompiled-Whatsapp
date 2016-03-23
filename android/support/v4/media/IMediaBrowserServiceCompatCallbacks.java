package android.support.v4.media;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.v4.app.FragmentActivity;
import android.support.v4.media.session.MediaSessionCompat.Token;
import java.util.List;
import org.v;
import org.whispersystems.at;

public interface IMediaBrowserServiceCompatCallbacks extends IInterface {

    public abstract class Stub extends Binder implements IMediaBrowserServiceCompatCallbacks {
        private static final String z;

        class Proxy implements IMediaBrowserServiceCompatCallbacks {
            private static final String[] z;
            private IBinder mRemote;

            static {
                String[] strArr = new String[3];
                String str = ":8*fO22`gU+&!fTu z:M>2'u\u000e\u0012\u001b+pI:\u0014<{W(3<GE) 'wE\u00189#dA/\u0015/xL97-\u007fS";
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
                                i3 = 91;
                                break;
                            case at.g /*1*/:
                                i3 = 86;
                                break;
                            case at.i /*2*/:
                                i3 = 78;
                                break;
                            case at.o /*3*/:
                                i3 = 20;
                                break;
                            default:
                                i3 = 32;
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
                            str = ":8*fO22`gU+&!fTu z:M>2'u\u000e\u0012\u001b+pI:\u0014<{W(3<GE) 'wE\u00189#dA/\u0015/xL97-\u007fS";
                            obj = 1;
                            break;
                        case at.g /*1*/:
                            strArr2[i] = str;
                            z = strArr3;
                            return;
                        default:
                            strArr2[i] = str;
                            str = ":8*fO22`gU+&!fTu z:M>2'u\u000e\u0012\u001b+pI:\u0014<{W(3<GE) 'wE\u00189#dA/\u0015/xL97-\u007fS";
                            i = 1;
                            strArr2 = strArr3;
                            obj = null;
                            break;
                    }
                }
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onConnect(java.lang.String r6, android.support.v4.media.session.MediaSessionCompat.Token r7, android.os.Bundle r8) {
                /*
                r5 = this;
                r0 = android.support.v4.media.MediaBrowserServiceCompat.a;
                r1 = android.os.Parcel.obtain();
                r2 = z;	 Catch:{ all -> 0x0043 }
                r3 = 1;
                r2 = r2[r3];	 Catch:{ all -> 0x0043 }
                r1.writeInterfaceToken(r2);	 Catch:{ all -> 0x0043 }
                r1.writeString(r6);	 Catch:{ all -> 0x0043 }
                if (r7 == 0) goto L_0x0023;
            L_0x0013:
                r2 = 1;
                r1.writeInt(r2);	 Catch:{ all -> 0x0043 }
                r2 = 0;
                r7.writeToParcel(r1, r2);	 Catch:{ all -> 0x0043 }
                if (r0 == 0) goto L_0x0027;
            L_0x001d:
                r2 = android.support.v4.app.FragmentActivity.a;	 Catch:{ all -> 0x0043 }
                r2 = r2 + 1;
                android.support.v4.app.FragmentActivity.a = r2;	 Catch:{ all -> 0x0043 }
            L_0x0023:
                r2 = 0;
                r1.writeInt(r2);	 Catch:{ all -> 0x0043 }
            L_0x0027:
                if (r8 == 0) goto L_0x0033;
            L_0x0029:
                r2 = 1;
                r1.writeInt(r2);	 Catch:{ all -> 0x0043 }
                r2 = 0;
                r8.writeToParcel(r1, r2);	 Catch:{ all -> 0x0043 }
                if (r0 == 0) goto L_0x0037;
            L_0x0033:
                r0 = 0;
                r1.writeInt(r0);	 Catch:{ all -> 0x0043 }
            L_0x0037:
                r0 = r5.mRemote;	 Catch:{ all -> 0x0043 }
                r2 = 1;
                r3 = 0;
                r4 = 1;
                r0.transact(r2, r1, r3, r4);	 Catch:{ all -> 0x0043 }
                r1.recycle();
                return;
            L_0x0043:
                r0 = move-exception;
                r1.recycle();
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.IMediaBrowserServiceCompatCallbacks.Stub.Proxy.onConnect(java.lang.String, android.support.v4.media.session.MediaSessionCompat$Token, android.os.Bundle):void");
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public void onLoadChildren(String str, List list) {
                int i = MediaBrowserServiceCompat.a;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(z[0]);
                    obtain.writeString(str);
                    obtain.writeList(list);
                    this.mRemote.transact(3, obtain, null, 1);
                    if (FragmentActivity.a != 0) {
                        MediaBrowserServiceCompat.a = i + 1;
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public void onConnectFailed() {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(z[2]);
                    this.mRemote.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }
        }

        static {
            char[] toCharArray = "GDwAPON=@JVZ|AK\b\\'\u001dRCNzR\u0011ogvWVGha\\HUOa`ZT\\zPZeE~C^Rir_SDKpXL".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 38;
                        break;
                    case at.g /*1*/:
                        i2 = 42;
                        break;
                    case at.i /*2*/:
                        i2 = 19;
                        break;
                    case at.o /*3*/:
                        i2 = 51;
                        break;
                    default:
                        i2 = 63;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        public static IMediaBrowserServiceCompatCallbacks asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(z);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IMediaBrowserServiceCompatCallbacks)) {
                return new Proxy(iBinder);
            }
            return (IMediaBrowserServiceCompatCallbacks) queryLocalInterface;
        }
    }

    void onConnect(String str, Token token, Bundle bundle);

    void onConnectFailed();

    void onLoadChildren(String str, List list);
}
