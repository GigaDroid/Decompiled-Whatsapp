package android.support.v4.content;

import android.content.Context;
import android.support.v4.util.DebugUtils;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class Loader {
    private static final String[] z;
    boolean mAbandoned;
    boolean mContentChanged;
    Context mContext;
    int mId;
    OnLoadCompleteListener mListener;
    OnLoadCanceledListener mOnLoadCanceledListener;
    boolean mProcessingChange;
    boolean mReset;
    boolean mStarted;

    public interface OnLoadCompleteListener {
        void onLoadComplete(Loader loader, Object obj);
    }

    public interface OnLoadCanceledListener {
        void onLoadCanceled(Loader loader);
    }

    static {
        String[] strArr = new String[14];
        String str = "`\u0014\u0000\u000bZQ\u0014\u001d\u0000P\u0001\u0014\u001bNBO\u0012\u0011\t^R\u0014\u0011\u001c\u0017U\b\u0011N@S\u000f\u001a\t\u0017M\t\u0007\u001aRO\u0005\u0006";
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
                        i3 = 33;
                        break;
                    case at.g /*1*/:
                        i3 = 96;
                        break;
                    case at.i /*2*/:
                        i3 = 116;
                        break;
                    case at.o /*3*/:
                        i3 = 110;
                        break;
                    default:
                        i3 = 55;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "u\b\u0011\u001cR\u0001\t\u0007NVM\u0012\u0011\u000fSX@\u0015N[H\u0013\u0000\u000bYD\u0012T\u001cRF\t\u0007\u001aRS\u0005\u0010";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "u\b\u0011\u001cR\u0001\t\u0007NVM\u0012\u0011\u000fSX@\u0015N[H\u0013\u0000\u000bYD\u0012T\u001cRF\t\u0007\u001aRS\u0005\u0010";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u0001\t\u0010S";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "o\u000fT\u0002^R\u0014\u0011\u0000RS@\u0006\u000bPH\u0013\u0000\u000bE";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "`\u0014\u0000\u000bZQ\u0014\u001d\u0000P\u0001\u0014\u001bNBO\u0012\u0011\t^R\u0014\u0011\u001c\u0017U\b\u0011N@S\u000f\u001a\t\u0017M\t\u0007\u001aRO\u0005\u0006";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0001\r$\u001cXB\u0005\u0007\u001d^O\u00077\u0006VO\u0007\u0011S";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0001\r8\u0007DU\u0005\u001a\u000bE\u001c";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0001\r7\u0001YU\u0005\u001a\u001atI\u0001\u001a\tRE]";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u0001\r&\u000bDD\u0014I";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "L!\u0016\u000fYE\u000f\u001a\u000bS\u001c";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "L)\u0010S";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "L3\u0000\u000fEU\u0005\u0010S";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "o\u000fT\u0002^R\u0014\u0011\u0000RS@\u0006\u000bPH\u0013\u0000\u000bE";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected void onForceLoad() {
    }

    public int getId() {
        return this.mId;
    }

    public boolean takeContentChanged() {
        boolean z = this.mContentChanged;
        this.mContentChanged = false;
        this.mProcessingChange |= z;
        return z;
    }

    protected void onReset() {
    }

    public final void startLoading() {
        this.mStarted = true;
        this.mReset = false;
        this.mAbandoned = false;
        onStartLoading();
    }

    public boolean isReset() {
        return this.mReset;
    }

    public void stopLoading() {
        this.mStarted = false;
        onStopLoading();
    }

    protected void onStopLoading() {
    }

    public boolean cancelLoad() {
        return onCancelLoad();
    }

    public void forceLoad() {
        onForceLoad();
    }

    public void reset() {
        onReset();
        this.mReset = true;
        this.mStarted = false;
        this.mAbandoned = false;
        this.mContentChanged = false;
        this.mProcessingChange = false;
    }

    protected void onStartLoading() {
    }

    public void abandon() {
        this.mAbandoned = true;
        onAbandon();
    }

    public void commitContentChanged() {
        this.mProcessingChange = false;
    }

    public boolean isStarted() {
        return this.mStarted;
    }

    public boolean isAbandoned() {
        return this.mAbandoned;
    }

    public void unregisterOnLoadCanceledListener(OnLoadCanceledListener onLoadCanceledListener) {
        try {
            if (this.mOnLoadCanceledListener == null) {
                throw new IllegalStateException(z[5]);
            }
            try {
                if (this.mOnLoadCanceledListener != onLoadCanceledListener) {
                    throw new IllegalArgumentException(z[6]);
                }
                this.mOnLoadCanceledListener = null;
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public void unregisterListener(OnLoadCompleteListener onLoadCompleteListener) {
        try {
            if (this.mListener == null) {
                throw new IllegalStateException(z[1]);
            }
            try {
                if (this.mListener != onLoadCompleteListener) {
                    throw new IllegalArgumentException(z[0]);
                }
                this.mListener = null;
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    protected boolean onCancelLoad() {
        return false;
    }

    public void rollbackContentChanged() {
        try {
            if (this.mProcessingChange) {
                this.mContentChanged = true;
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void registerOnLoadCanceledListener(OnLoadCanceledListener onLoadCanceledListener) {
        try {
            if (this.mOnLoadCanceledListener != null) {
                throw new IllegalStateException(z[3]);
            }
            this.mOnLoadCanceledListener = onLoadCanceledListener;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    protected void onAbandon() {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dump(java.lang.String r3, java.io.FileDescriptor r4, java.io.PrintWriter r5, java.lang.String[] r6) {
        /*
        r2 = this;
        r5.print(r3);	 Catch:{ IllegalStateException -> 0x007f }
        r0 = z;	 Catch:{ IllegalStateException -> 0x007f }
        r1 = 12;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x007f }
        r5.print(r0);	 Catch:{ IllegalStateException -> 0x007f }
        r0 = r2.mId;	 Catch:{ IllegalStateException -> 0x007f }
        r5.print(r0);	 Catch:{ IllegalStateException -> 0x007f }
        r0 = z;	 Catch:{ IllegalStateException -> 0x007f }
        r1 = 8;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x007f }
        r5.print(r0);	 Catch:{ IllegalStateException -> 0x007f }
        r0 = r2.mListener;	 Catch:{ IllegalStateException -> 0x007f }
        r5.println(r0);	 Catch:{ IllegalStateException -> 0x007f }
        r0 = r2.mStarted;	 Catch:{ IllegalStateException -> 0x007f }
        if (r0 != 0) goto L_0x002b;
    L_0x0023:
        r0 = r2.mContentChanged;	 Catch:{ IllegalStateException -> 0x0081 }
        if (r0 != 0) goto L_0x002b;
    L_0x0027:
        r0 = r2.mProcessingChange;	 Catch:{ IllegalStateException -> 0x0083 }
        if (r0 == 0) goto L_0x0057;
    L_0x002b:
        r5.print(r3);	 Catch:{ IllegalStateException -> 0x0083 }
        r0 = z;	 Catch:{ IllegalStateException -> 0x0083 }
        r1 = 13;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x0083 }
        r5.print(r0);	 Catch:{ IllegalStateException -> 0x0083 }
        r0 = r2.mStarted;	 Catch:{ IllegalStateException -> 0x0083 }
        r5.print(r0);	 Catch:{ IllegalStateException -> 0x0083 }
        r0 = z;	 Catch:{ IllegalStateException -> 0x0083 }
        r1 = 9;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x0083 }
        r5.print(r0);	 Catch:{ IllegalStateException -> 0x0083 }
        r0 = r2.mContentChanged;	 Catch:{ IllegalStateException -> 0x0083 }
        r5.print(r0);	 Catch:{ IllegalStateException -> 0x0083 }
        r0 = z;	 Catch:{ IllegalStateException -> 0x0083 }
        r1 = 7;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x0083 }
        r5.print(r0);	 Catch:{ IllegalStateException -> 0x0083 }
        r0 = r2.mProcessingChange;	 Catch:{ IllegalStateException -> 0x0083 }
        r5.println(r0);	 Catch:{ IllegalStateException -> 0x0083 }
    L_0x0057:
        r0 = r2.mAbandoned;	 Catch:{ IllegalStateException -> 0x0085 }
        if (r0 != 0) goto L_0x005f;
    L_0x005b:
        r0 = r2.mReset;	 Catch:{ IllegalStateException -> 0x0087 }
        if (r0 == 0) goto L_0x007e;
    L_0x005f:
        r5.print(r3);	 Catch:{ IllegalStateException -> 0x0087 }
        r0 = z;	 Catch:{ IllegalStateException -> 0x0087 }
        r1 = 11;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x0087 }
        r5.print(r0);	 Catch:{ IllegalStateException -> 0x0087 }
        r0 = r2.mAbandoned;	 Catch:{ IllegalStateException -> 0x0087 }
        r5.print(r0);	 Catch:{ IllegalStateException -> 0x0087 }
        r0 = z;	 Catch:{ IllegalStateException -> 0x0087 }
        r1 = 10;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x0087 }
        r5.print(r0);	 Catch:{ IllegalStateException -> 0x0087 }
        r0 = r2.mReset;	 Catch:{ IllegalStateException -> 0x0087 }
        r5.println(r0);	 Catch:{ IllegalStateException -> 0x0087 }
    L_0x007e:
        return;
    L_0x007f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0081 }
    L_0x0081:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0083 }
    L_0x0083:
        r0 = move-exception;
        throw r0;
    L_0x0085:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0087 }
    L_0x0087:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.content.Loader.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    public void deliverResult(Object obj) {
        try {
            if (this.mListener != null) {
                this.mListener.onLoadComplete(this, obj);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public String dataToString(Object obj) {
        StringBuilder stringBuilder = new StringBuilder(64);
        DebugUtils.buildShortClassTag(obj, stringBuilder);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(64);
        DebugUtils.buildShortClassTag(this, stringBuilder);
        stringBuilder.append(z[4]);
        stringBuilder.append(this.mId);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public void registerListener(int i, OnLoadCompleteListener onLoadCompleteListener) {
        try {
            if (this.mListener != null) {
                throw new IllegalStateException(z[2]);
            }
            this.mListener = onLoadCompleteListener;
            this.mId = i;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void deliverCancellation() {
        try {
            if (this.mOnLoadCanceledListener != null) {
                this.mOnLoadCanceledListener.onLoadCanceled(this);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public Loader(Context context) {
        this.mStarted = false;
        this.mAbandoned = false;
        this.mReset = true;
        this.mContentChanged = false;
        this.mProcessingChange = false;
        this.mContext = context.getApplicationContext();
    }
}
