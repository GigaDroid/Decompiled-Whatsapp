package android.support.v4.media.session;

import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class MediaSessionCompat {

    public final class Token implements Parcelable {
        public static final Creator CREATOR;
        public static int a;
        private final Object mInner;

        final class 1 implements Creator {
            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public android.support.v4.media.session.MediaSessionCompat.Token createFromParcel(android.os.Parcel r4) {
                /*
                r3 = this;
                r1 = android.support.v4.media.session.MediaSessionCompat.Token.a;
                r0 = android.os.Build.VERSION.SDK_INT;
                r2 = 21;
                if (r0 < r2) goto L_0x000f;
            L_0x0008:
                r0 = 0;
                r0 = r4.readParcelable(r0);
                if (r1 == 0) goto L_0x0013;
            L_0x000f:
                r0 = r4.readStrongBinder();
            L_0x0013:
                r2 = new android.support.v4.media.session.MediaSessionCompat$Token;
                r2.<init>(r0);
                r0 = android.support.v4.app.FragmentActivity.a;
                if (r0 == 0) goto L_0x0020;
            L_0x001c:
                r0 = r1 + 1;
                android.support.v4.media.session.MediaSessionCompat.Token.a = r0;
            L_0x0020:
                return r2;
                */
                throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.Token.1.createFromParcel(android.os.Parcel):android.support.v4.media.session.MediaSessionCompat$Token");
            }

            public Object m57createFromParcel(Parcel parcel) {
                return createFromParcel(parcel);
            }

            public Object[] m58newArray(int i) {
                return newArray(i);
            }

            1() {
            }

            public Token[] newArray(int i) {
                return new Token[i];
            }
        }

        static {
            CREATOR = new 1();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            if (VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.mInner, i);
                if (a == 0) {
                    return;
                }
            }
            parcel.writeStrongBinder((IBinder) this.mInner);
        }

        Token(Object obj) {
            this.mInner = obj;
        }

        public Object getToken() {
            return this.mInner;
        }
    }
}
