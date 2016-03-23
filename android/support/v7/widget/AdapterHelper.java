package android.support.v7.widget;

import android.support.v4.util.Pools.Pool;
import android.support.v4.util.Pools.SimplePool;
import android.support.v7.widget.RecyclerView.ViewHolder;
import com.whatsapp.arj;
import java.util.ArrayList;
import java.util.List;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class AdapterHelper implements Callback {
    private static final String[] z;
    final Callback mCallback;
    final boolean mDisableRecycler;
    private int mExistingUpdateTypes;
    Runnable mOnItemProcessedCallback;
    final OpReorderer mOpReorderer;
    final ArrayList mPendingUpdates;
    final ArrayList mPostponedList;
    private Pool mUpdateOpPool;

    interface Callback {
        ViewHolder findViewHolder(int i);

        void markViewHoldersUpdated(int i, int i2, Object obj);

        void offsetPositionsForAdd(int i, int i2);

        void offsetPositionsForMove(int i, int i2);

        void offsetPositionsForRemovingInvisible(int i, int i2);

        void offsetPositionsForRemovingLaidOutOrNewView(int i, int i2);

        void onDispatchFirstPass(UpdateOp updateOp);

        void onDispatchSecondPass(UpdateOp updateOp);
    }

    class UpdateOp {
        private static final String[] z;
        int cmd;
        int itemCount;
        Object payload;
        int positionStart;

        static {
            String[] strArr = new String[8];
            String str = "-\u000e";
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
                            i3 = 64;
                            break;
                        case at.g /*1*/:
                            i3 = 120;
                            break;
                        case at.i /*2*/:
                            i3 = 116;
                            break;
                        case at.o /*3*/:
                            i3 = 60;
                            break;
                        default:
                            i3 = 60;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "5\b";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        str = "\u007fG";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        str = "!\u001c\u0010";
                        i = 4;
                        strArr2 = strArr3;
                        obj = 3;
                        break;
                    case at.o /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        strArr2 = strArr3;
                        str = "l\u000bN";
                        obj = 4;
                        break;
                    case at.p /*4*/:
                        strArr2[i] = str;
                        i = 6;
                        str = "l\bN";
                        obj = 5;
                        strArr2 = strArr3;
                        break;
                    case at.m /*5*/:
                        strArr2[i] = str;
                        i = 7;
                        str = "#B";
                        obj = 6;
                        strArr2 = strArr3;
                        break;
                    case Y.f /*6*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "2\u0015";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        UpdateOp(int i, int i2, int i3, Object obj) {
            this.cmd = i;
            this.positionStart = i2;
            this.itemCount = i3;
            this.payload = obj;
        }

        String cmdToString() {
            switch (this.cmd) {
                case at.g /*1*/:
                    return z[4];
                case at.i /*2*/:
                    return z[1];
                case at.p /*4*/:
                    return z[2];
                case aF.u /*8*/:
                    return z[0];
                default:
                    return z[3];
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            UpdateOp updateOp = (UpdateOp) obj;
            if (this.cmd != updateOp.cmd) {
                return false;
            }
            if (this.cmd == 8 && Math.abs(this.itemCount - this.positionStart) == 1 && this.itemCount == updateOp.positionStart && this.positionStart == updateOp.itemCount) {
                return true;
            }
            if (this.itemCount != updateOp.itemCount) {
                return false;
            }
            if (this.positionStart != updateOp.positionStart) {
                return false;
            }
            if (this.payload != null) {
                if (this.payload.equals(updateOp.payload)) {
                    return true;
                }
                return false;
            } else if (updateOp.payload != null) {
                return false;
            } else {
                return true;
            }
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + cmdToString() + z[5] + this.positionStart + z[7] + this.itemCount + z[6] + this.payload + "]";
        }

        public int hashCode() {
            return (((this.cmd * 31) + this.positionStart) * 31) + this.itemCount;
        }
    }

    static {
        String[] strArr = new String[4];
        String str = "{G\teal\u000f\b\u007fy(K\u000fc}i[\u0005x-iK\u00020bz\u000f\u000b\u007f{m\u000f\u0000\u007f\u007f(_\u0014u-dN\u001f\u007fx|";
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
                        i3 = 8;
                        break;
                    case at.g /*1*/:
                        i3 = 47;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_checkboxStyle;
                        break;
                    case at.o /*3*/:
                        i3 = 16;
                        break;
                    default:
                        i3 = 13;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "gA\ni-zJ\u000b\u007f{m\u000f\u0007~i(Z\u0016tl|JF\u007f}{\u000f\u0005qc(M\u00030ia\\\u0016qykG\u0003t-aAFvdz\\\u00120}i\\\u0015";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "]A\r~b\u007fAFe}lN\u0012u-g_FdtxJFvbz\u000f";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "g_FcegZ\nt-jJFbhe@\u0010u-g]Fe}lN\u0012u#";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void consumeUpdatesInOnePass() {
        /*
        r9 = this;
        r2 = 0;
        r3 = android.support.v7.widget.RecyclerView.ViewHolder.a;
        r9.consumePostponedUpdates();
        r0 = r9.mPendingUpdates;
        r4 = r0.size();
        r1 = r2;
    L_0x000d:
        if (r1 >= r4) goto L_0x0029;
    L_0x000f:
        r0 = r9.mPendingUpdates;
        r0 = r0.get(r1);
        r0 = (android.support.v7.widget.AdapterHelper.UpdateOp) r0;
        r5 = r0.cmd;	 Catch:{ IllegalArgumentException -> 0x0074 }
        switch(r5) {
            case 1: goto L_0x0031;
            case 2: goto L_0x0041;
            case 3: goto L_0x001c;
            case 4: goto L_0x0051;
            case 5: goto L_0x001c;
            case 6: goto L_0x001c;
            case 7: goto L_0x001c;
            case 8: goto L_0x0063;
            default: goto L_0x001c;
        };
    L_0x001c:
        r0 = r9.mOnItemProcessedCallback;	 Catch:{ IllegalArgumentException -> 0x007a }
        if (r0 == 0) goto L_0x0025;
    L_0x0020:
        r0 = r9.mOnItemProcessedCallback;	 Catch:{ IllegalArgumentException -> 0x007a }
        r0.run();	 Catch:{ IllegalArgumentException -> 0x007a }
    L_0x0025:
        r0 = r1 + 1;
        if (r3 == 0) goto L_0x007c;
    L_0x0029:
        r0 = r9.mPendingUpdates;
        r9.recycleUpdateOpsAndClearList(r0);
        r9.mExistingUpdateTypes = r2;
        return;
    L_0x0031:
        r5 = r9.mCallback;	 Catch:{ IllegalArgumentException -> 0x0076 }
        r5.onDispatchSecondPass(r0);	 Catch:{ IllegalArgumentException -> 0x0076 }
        r5 = r9.mCallback;	 Catch:{ IllegalArgumentException -> 0x0076 }
        r6 = r0.positionStart;	 Catch:{ IllegalArgumentException -> 0x0076 }
        r7 = r0.itemCount;	 Catch:{ IllegalArgumentException -> 0x0076 }
        r5.offsetPositionsForAdd(r6, r7);	 Catch:{ IllegalArgumentException -> 0x0076 }
        if (r3 == 0) goto L_0x001c;
    L_0x0041:
        r5 = r9.mCallback;	 Catch:{ IllegalArgumentException -> 0x0078 }
        r5.onDispatchSecondPass(r0);	 Catch:{ IllegalArgumentException -> 0x0078 }
        r5 = r9.mCallback;	 Catch:{ IllegalArgumentException -> 0x0078 }
        r6 = r0.positionStart;	 Catch:{ IllegalArgumentException -> 0x0078 }
        r7 = r0.itemCount;	 Catch:{ IllegalArgumentException -> 0x0078 }
        r5.offsetPositionsForRemovingInvisible(r6, r7);	 Catch:{ IllegalArgumentException -> 0x0078 }
        if (r3 == 0) goto L_0x001c;
    L_0x0051:
        r5 = r9.mCallback;	 Catch:{ IllegalArgumentException -> 0x0072 }
        r5.onDispatchSecondPass(r0);	 Catch:{ IllegalArgumentException -> 0x0072 }
        r5 = r9.mCallback;	 Catch:{ IllegalArgumentException -> 0x0072 }
        r6 = r0.positionStart;	 Catch:{ IllegalArgumentException -> 0x0072 }
        r7 = r0.itemCount;	 Catch:{ IllegalArgumentException -> 0x0072 }
        r8 = r0.payload;	 Catch:{ IllegalArgumentException -> 0x0072 }
        r5.markViewHoldersUpdated(r6, r7, r8);	 Catch:{ IllegalArgumentException -> 0x0072 }
        if (r3 == 0) goto L_0x001c;
    L_0x0063:
        r5 = r9.mCallback;	 Catch:{ IllegalArgumentException -> 0x0072 }
        r5.onDispatchSecondPass(r0);	 Catch:{ IllegalArgumentException -> 0x0072 }
        r5 = r9.mCallback;	 Catch:{ IllegalArgumentException -> 0x0072 }
        r6 = r0.positionStart;	 Catch:{ IllegalArgumentException -> 0x0072 }
        r0 = r0.itemCount;	 Catch:{ IllegalArgumentException -> 0x0072 }
        r5.offsetPositionsForMove(r6, r0);	 Catch:{ IllegalArgumentException -> 0x0072 }
        goto L_0x001c;
    L_0x0072:
        r0 = move-exception;
        throw r0;
    L_0x0074:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0076 }
    L_0x0076:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0078 }
    L_0x0078:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0072 }
    L_0x007a:
        r0 = move-exception;
        throw r0;
    L_0x007c:
        r1 = r0;
        goto L_0x000d;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.AdapterHelper.consumeUpdatesInOnePass():void");
    }

    void recycleUpdateOpsAndClearList(List list) {
        int i = ViewHolder.a;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            recycleUpdateOp((UpdateOp) list.get(i2));
            int i3 = i2 + 1;
            if (i != 0) {
                break;
            }
            i2 = i3;
        }
        list.clear();
    }

    AdapterHelper(Callback callback) {
        this(callback, false);
    }

    private void applyMove(UpdateOp updateOp) {
        postponeAndUpdateViewHolders(updateOp);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void applyUpdate(android.support.v7.widget.AdapterHelper.UpdateOp r12) {
        /*
        r11 = this;
        r5 = 1;
        r9 = 4;
        r1 = 0;
        r6 = android.support.v7.widget.RecyclerView.ViewHolder.a;
        r2 = r12.positionStart;
        r0 = r12.positionStart;
        r3 = r12.itemCount;
        r7 = r0 + r3;
        r4 = -1;
        r3 = r12.positionStart;
        r0 = r1;
    L_0x0011:
        if (r3 >= r7) goto L_0x006e;
    L_0x0013:
        r8 = r11.mCallback;
        r8 = r8.findViewHolder(r3);
        if (r8 != 0) goto L_0x0021;
    L_0x001b:
        r8 = r11.canFindInPreLayout(r3);	 Catch:{ IllegalArgumentException -> 0x0061 }
        if (r8 == 0) goto L_0x0031;
    L_0x0021:
        if (r4 != 0) goto L_0x002e;
    L_0x0023:
        r4 = r12.payload;
        r0 = r11.obtainUpdateOp(r9, r2, r0, r4);
        r11.dispatchAndUpdateViewHolders(r0);
        r0 = r1;
        r2 = r3;
    L_0x002e:
        if (r6 == 0) goto L_0x006a;
    L_0x0030:
        r4 = r5;
    L_0x0031:
        if (r4 != r5) goto L_0x003e;
    L_0x0033:
        r4 = r12.payload;
        r0 = r11.obtainUpdateOp(r9, r2, r0, r4);
        r11.postponeAndUpdateViewHolders(r0);
        r0 = r1;
        r2 = r3;
    L_0x003e:
        r4 = r2;
        r2 = r0;
        r0 = r1;
    L_0x0041:
        r2 = r2 + 1;
        r3 = r3 + 1;
        if (r6 == 0) goto L_0x0065;
    L_0x0047:
        r1 = r2;
        r2 = r4;
    L_0x0049:
        r3 = r12.itemCount;
        if (r1 == r3) goto L_0x0056;
    L_0x004d:
        r3 = r12.payload;
        r11.recycleUpdateOp(r12);
        r12 = r11.obtainUpdateOp(r9, r2, r1, r3);
    L_0x0056:
        if (r0 != 0) goto L_0x005d;
    L_0x0058:
        r11.dispatchAndUpdateViewHolders(r12);	 Catch:{ IllegalArgumentException -> 0x0063 }
        if (r6 == 0) goto L_0x0060;
    L_0x005d:
        r11.postponeAndUpdateViewHolders(r12);	 Catch:{ IllegalArgumentException -> 0x0063 }
    L_0x0060:
        return;
    L_0x0061:
        r0 = move-exception;
        throw r0;
    L_0x0063:
        r0 = move-exception;
        throw r0;
    L_0x0065:
        r10 = r0;
        r0 = r2;
        r2 = r4;
        r4 = r10;
        goto L_0x0011;
    L_0x006a:
        r4 = r2;
        r2 = r0;
        r0 = r5;
        goto L_0x0041;
    L_0x006e:
        r1 = r0;
        r0 = r4;
        goto L_0x0049;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.AdapterHelper.applyUpdate(android.support.v7.widget.AdapterHelper$UpdateOp):void");
    }

    boolean hasPendingUpdates() {
        try {
            return this.mPendingUpdates.size() > 0;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void dispatchFirstPassAndUpdateViewHolders(android.support.v7.widget.AdapterHelper.UpdateOp r5, int r6) {
        /*
        r4 = this;
        r0 = android.support.v7.widget.RecyclerView.ViewHolder.a;
        r1 = r4.mCallback;	 Catch:{ IllegalArgumentException -> 0x002e }
        r1.onDispatchFirstPass(r5);	 Catch:{ IllegalArgumentException -> 0x002e }
        r1 = r5.cmd;	 Catch:{ IllegalArgumentException -> 0x002e }
        switch(r1) {
            case 2: goto L_0x0019;
            case 3: goto L_0x000c;
            case 4: goto L_0x0022;
            default: goto L_0x000c;
        };
    L_0x000c:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0017 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0017 }
        r2 = 2;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0017 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0017 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0017 }
    L_0x0017:
        r0 = move-exception;
        throw r0;
    L_0x0019:
        r1 = r4.mCallback;	 Catch:{ IllegalArgumentException -> 0x0030 }
        r2 = r5.itemCount;	 Catch:{ IllegalArgumentException -> 0x0030 }
        r1.offsetPositionsForRemovingInvisible(r6, r2);	 Catch:{ IllegalArgumentException -> 0x0030 }
        if (r0 == 0) goto L_0x002d;
    L_0x0022:
        r1 = r4.mCallback;	 Catch:{ IllegalArgumentException -> 0x0017 }
        r2 = r5.itemCount;	 Catch:{ IllegalArgumentException -> 0x0017 }
        r3 = r5.payload;	 Catch:{ IllegalArgumentException -> 0x0017 }
        r1.markViewHoldersUpdated(r6, r2, r3);	 Catch:{ IllegalArgumentException -> 0x0017 }
        if (r0 != 0) goto L_0x000c;
    L_0x002d:
        return;
    L_0x002e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0030 }
    L_0x0030:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0017 }
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.AdapterHelper.dispatchFirstPassAndUpdateViewHolders(android.support.v7.widget.AdapterHelper$UpdateOp, int):void");
    }

    AdapterHelper(Callback callback, boolean z) {
        this.mUpdateOpPool = new SimplePool(30);
        this.mPendingUpdates = new ArrayList();
        this.mPostponedList = new ArrayList();
        this.mExistingUpdateTypes = 0;
        this.mCallback = callback;
        this.mDisableRecycler = z;
        this.mOpReorderer = new OpReorderer(this);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.support.v7.widget.AdapterHelper.UpdateOp obtainUpdateOp(int r3, int r4, int r5, java.lang.Object r6) {
        /*
        r2 = this;
        r0 = r2.mUpdateOpPool;
        r0 = r0.acquire();
        r0 = (android.support.v7.widget.AdapterHelper.UpdateOp) r0;
        if (r0 != 0) goto L_0x0013;
    L_0x000a:
        r0 = new android.support.v7.widget.AdapterHelper$UpdateOp;
        r0.<init>(r3, r4, r5, r6);
        r1 = android.support.v7.widget.RecyclerView.ViewHolder.a;	 Catch:{ IllegalArgumentException -> 0x001c }
        if (r1 == 0) goto L_0x001b;
    L_0x0013:
        r0.cmd = r3;	 Catch:{ IllegalArgumentException -> 0x001c }
        r0.positionStart = r4;	 Catch:{ IllegalArgumentException -> 0x001c }
        r0.itemCount = r5;	 Catch:{ IllegalArgumentException -> 0x001c }
        r0.payload = r6;	 Catch:{ IllegalArgumentException -> 0x001c }
    L_0x001b:
        return r0;
    L_0x001c:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.AdapterHelper.obtainUpdateOp(int, int, int, java.lang.Object):android.support.v7.widget.AdapterHelper$UpdateOp");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int applyPendingUpdatesToPosition(int r8) {
        /*
        r7 = this;
        r3 = android.support.v7.widget.RecyclerView.ViewHolder.a;
        r0 = r7.mPendingUpdates;
        r4 = r0.size();
        r0 = 0;
        r2 = r0;
        r1 = r8;
    L_0x000b:
        if (r2 >= r4) goto L_0x005e;
    L_0x000d:
        r0 = r7.mPendingUpdates;
        r0 = r0.get(r2);
        r0 = (android.support.v7.widget.AdapterHelper.UpdateOp) r0;
        r5 = r0.cmd;	 Catch:{ IllegalArgumentException -> 0x0036 }
        switch(r5) {
            case 1: goto L_0x0020;
            case 2: goto L_0x0029;
            case 8: goto L_0x003f;
            default: goto L_0x001a;
        };	 Catch:{ IllegalArgumentException -> 0x0036 }
    L_0x001a:
        r0 = r1;
    L_0x001b:
        r1 = r2 + 1;
        if (r3 == 0) goto L_0x005b;
    L_0x001f:
        return r0;
    L_0x0020:
        r5 = r0.positionStart;	 Catch:{ IllegalArgumentException -> 0x0036 }
        if (r5 > r1) goto L_0x001a;
    L_0x0024:
        r5 = r0.itemCount;
        r1 = r1 + r5;
        if (r3 == 0) goto L_0x001a;
    L_0x0029:
        r5 = r0.positionStart;	 Catch:{ IllegalArgumentException -> 0x0038 }
        if (r5 > r1) goto L_0x001a;
    L_0x002d:
        r5 = r0.positionStart;
        r6 = r0.itemCount;
        r5 = r5 + r6;
        if (r5 <= r1) goto L_0x003a;
    L_0x0034:
        r0 = -1;
        goto L_0x001f;
    L_0x0036:
        r0 = move-exception;
        throw r0;
    L_0x0038:
        r0 = move-exception;
        throw r0;
    L_0x003a:
        r5 = r0.itemCount;
        r1 = r1 - r5;
        if (r3 == 0) goto L_0x001a;
    L_0x003f:
        r5 = r0.positionStart;	 Catch:{ IllegalArgumentException -> 0x0055 }
        if (r5 != r1) goto L_0x0047;
    L_0x0043:
        r1 = r0.itemCount;
        if (r3 == 0) goto L_0x001a;
    L_0x0047:
        r5 = r0.positionStart;	 Catch:{ IllegalArgumentException -> 0x0057 }
        if (r5 >= r1) goto L_0x004d;
    L_0x004b:
        r1 = r1 + -1;
    L_0x004d:
        r0 = r0.itemCount;	 Catch:{ IllegalArgumentException -> 0x0059 }
        if (r0 > r1) goto L_0x001a;
    L_0x0051:
        r1 = r1 + 1;
        r0 = r1;
        goto L_0x001b;
    L_0x0055:
        r0 = move-exception;
        throw r0;
    L_0x0057:
        r0 = move-exception;
        throw r0;
    L_0x0059:
        r0 = move-exception;
        throw r0;
    L_0x005b:
        r2 = r1;
        r1 = r0;
        goto L_0x000b;
    L_0x005e:
        r0 = r1;
        goto L_0x001f;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.AdapterHelper.applyPendingUpdatesToPosition(int):int");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void dispatchAndUpdateViewHolders(android.support.v7.widget.AdapterHelper.UpdateOp r12) {
        /*
        r11 = this;
        r2 = 0;
        r1 = 1;
        r9 = android.support.v7.widget.RecyclerView.ViewHolder.a;
        r0 = r12.cmd;	 Catch:{ IllegalArgumentException -> 0x001b }
        if (r0 == r1) goto L_0x000e;
    L_0x0008:
        r0 = r12.cmd;	 Catch:{ IllegalArgumentException -> 0x0019 }
        r3 = 8;
        if (r0 != r3) goto L_0x001d;
    L_0x000e:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0019 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0019 }
        r2 = 0;
        r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0019 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0019 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0019 }
    L_0x0019:
        r0 = move-exception;
        throw r0;
    L_0x001b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0019 }
    L_0x001d:
        r0 = r12.positionStart;
        r3 = r12.cmd;
        r4 = r11.updatePositionWithPostponed(r0, r3);
        r3 = r12.positionStart;
        r0 = r12.cmd;
        switch(r0) {
            case 2: goto L_0x004c;
            case 3: goto L_0x002c;
            case 4: goto L_0x004a;
            default: goto L_0x002c;
        };
    L_0x002c:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0048 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0048 }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x0048 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0048 }
        r3 = 1;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0048 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0048 }
        r1 = r1.append(r12);	 Catch:{ IllegalArgumentException -> 0x0048 }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x0048 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0048 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0048 }
    L_0x0048:
        r0 = move-exception;
        throw r0;
    L_0x004a:
        if (r9 == 0) goto L_0x00af;
    L_0x004c:
        if (r9 != 0) goto L_0x002c;
    L_0x004e:
        r0 = r2;
    L_0x004f:
        r5 = r1;
        r6 = r4;
        r4 = r3;
        r3 = r1;
    L_0x0053:
        r7 = r12.itemCount;
        if (r3 >= r7) goto L_0x0088;
    L_0x0057:
        r7 = r12.positionStart;
        r8 = r0 * r3;
        r7 = r7 + r8;
        r8 = r12.cmd;
        r8 = r11.updatePositionWithPostponed(r7, r8);
        r7 = r12.cmd;	 Catch:{ IllegalArgumentException -> 0x00a7 }
        switch(r7) {
            case 2: goto L_0x00a3;
            case 3: goto L_0x0067;
            case 4: goto L_0x009c;
            default: goto L_0x0067;
        };
    L_0x0067:
        r7 = r2;
    L_0x0068:
        if (r7 == 0) goto L_0x006e;
    L_0x006a:
        r5 = r5 + 1;
        if (r9 == 0) goto L_0x0084;
    L_0x006e:
        r7 = r12.cmd;
        r10 = r12.payload;
        r6 = r11.obtainUpdateOp(r7, r6, r5, r10);
        r11.dispatchFirstPassAndUpdateViewHolders(r6, r4);
        r11.recycleUpdateOp(r6);
        r6 = r12.cmd;
        r7 = 4;
        if (r6 != r7) goto L_0x0082;
    L_0x0081:
        r4 = r4 + r5;
    L_0x0082:
        r5 = r1;
        r6 = r8;
    L_0x0084:
        r3 = r3 + 1;
        if (r9 == 0) goto L_0x0053;
    L_0x0088:
        r0 = r12.payload;
        r11.recycleUpdateOp(r12);
        if (r5 <= 0) goto L_0x009b;
    L_0x008f:
        r1 = r12.cmd;
        r0 = r11.obtainUpdateOp(r1, r6, r5, r0);
        r11.dispatchFirstPassAndUpdateViewHolders(r0, r4);
        r11.recycleUpdateOp(r0);
    L_0x009b:
        return;
    L_0x009c:
        r7 = r6 + 1;
        if (r8 != r7) goto L_0x00ab;
    L_0x00a0:
        r7 = r1;
    L_0x00a1:
        if (r9 == 0) goto L_0x0068;
    L_0x00a3:
        if (r8 != r6) goto L_0x00ad;
    L_0x00a5:
        r7 = r1;
        goto L_0x0068;
    L_0x00a7:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00a9 }
    L_0x00a9:
        r0 = move-exception;
        throw r0;
    L_0x00ab:
        r7 = r2;
        goto L_0x00a1;
    L_0x00ad:
        r7 = r2;
        goto L_0x0068;
    L_0x00af:
        r0 = r1;
        goto L_0x004f;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.AdapterHelper.dispatchAndUpdateViewHolders(android.support.v7.widget.AdapterHelper$UpdateOp):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void preProcess() {
        /*
        r5 = this;
        r2 = android.support.v7.widget.RecyclerView.ViewHolder.a;
        r0 = r5.mOpReorderer;
        r1 = r5.mPendingUpdates;
        r0.reorderOps(r1);
        r0 = r5.mPendingUpdates;
        r3 = r0.size();
        r0 = 0;
        r1 = r0;
    L_0x0011:
        if (r1 >= r3) goto L_0x002d;
    L_0x0013:
        r0 = r5.mPendingUpdates;
        r0 = r0.get(r1);
        r0 = (android.support.v7.widget.AdapterHelper.UpdateOp) r0;
        r4 = r0.cmd;	 Catch:{ IllegalArgumentException -> 0x0048 }
        switch(r4) {
            case 1: goto L_0x0033;
            case 2: goto L_0x0038;
            case 3: goto L_0x0020;
            case 4: goto L_0x003d;
            case 5: goto L_0x0020;
            case 6: goto L_0x0020;
            case 7: goto L_0x0020;
            case 8: goto L_0x0042;
            default: goto L_0x0020;
        };
    L_0x0020:
        r0 = r5.mOnItemProcessedCallback;	 Catch:{ IllegalArgumentException -> 0x004e }
        if (r0 == 0) goto L_0x0029;
    L_0x0024:
        r0 = r5.mOnItemProcessedCallback;	 Catch:{ IllegalArgumentException -> 0x004e }
        r0.run();	 Catch:{ IllegalArgumentException -> 0x004e }
    L_0x0029:
        r0 = r1 + 1;
        if (r2 == 0) goto L_0x0050;
    L_0x002d:
        r0 = r5.mPendingUpdates;
        r0.clear();
        return;
    L_0x0033:
        r5.applyAdd(r0);	 Catch:{ IllegalArgumentException -> 0x004a }
        if (r2 == 0) goto L_0x0020;
    L_0x0038:
        r5.applyRemove(r0);	 Catch:{ IllegalArgumentException -> 0x004c }
        if (r2 == 0) goto L_0x0020;
    L_0x003d:
        r5.applyUpdate(r0);	 Catch:{ IllegalArgumentException -> 0x0046 }
        if (r2 == 0) goto L_0x0020;
    L_0x0042:
        r5.applyMove(r0);	 Catch:{ IllegalArgumentException -> 0x0046 }
        goto L_0x0020;
    L_0x0046:
        r0 = move-exception;
        throw r0;
    L_0x0048:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x004a }
    L_0x004a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x004c }
    L_0x004c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0046 }
    L_0x004e:
        r0 = move-exception;
        throw r0;
    L_0x0050:
        r1 = r0;
        goto L_0x0011;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.AdapterHelper.preProcess():void");
    }

    void reset() {
        recycleUpdateOpsAndClearList(this.mPendingUpdates);
        recycleUpdateOpsAndClearList(this.mPostponedList);
        this.mExistingUpdateTypes = 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int updatePositionWithPostponed(int r10, int r11) {
        /*
        r9 = this;
        r8 = 8;
        r7 = 2;
        r6 = 1;
        r5 = android.support.v7.widget.RecyclerView.ViewHolder.a;
        r0 = r9.mPostponedList;
        r0 = r0.size();
        r0 = r0 + -1;
        r4 = r0;
        r1 = r10;
    L_0x0010:
        if (r4 < 0) goto L_0x00b4;
    L_0x0012:
        r0 = r9.mPostponedList;
        r0 = r0.get(r4);
        r0 = (android.support.v7.widget.AdapterHelper.UpdateOp) r0;
        r2 = r0.cmd;	 Catch:{ IllegalArgumentException -> 0x00f0 }
        if (r2 != r8) goto L_0x0086;
    L_0x001e:
        r2 = r0.positionStart;	 Catch:{ IllegalArgumentException -> 0x00f0 }
        r3 = r0.itemCount;	 Catch:{ IllegalArgumentException -> 0x00f0 }
        if (r2 >= r3) goto L_0x002a;
    L_0x0024:
        r3 = r0.positionStart;
        r2 = r0.itemCount;
        if (r5 == 0) goto L_0x002e;
    L_0x002a:
        r3 = r0.itemCount;
        r2 = r0.positionStart;
    L_0x002e:
        if (r1 < r3) goto L_0x0062;
    L_0x0030:
        if (r1 > r2) goto L_0x0062;
    L_0x0032:
        r2 = r0.positionStart;	 Catch:{ IllegalArgumentException -> 0x00f2 }
        if (r3 != r2) goto L_0x004c;
    L_0x0036:
        if (r11 != r6) goto L_0x0040;
    L_0x0038:
        r2 = r0.itemCount;	 Catch:{ IllegalArgumentException -> 0x00f6 }
        r2 = r2 + 1;
        r0.itemCount = r2;	 Catch:{ IllegalArgumentException -> 0x00f6 }
        if (r5 == 0) goto L_0x0048;
    L_0x0040:
        if (r11 != r7) goto L_0x0048;
    L_0x0042:
        r2 = r0.itemCount;	 Catch:{ IllegalArgumentException -> 0x00f8 }
        r2 = r2 + -1;
        r0.itemCount = r2;	 Catch:{ IllegalArgumentException -> 0x00f8 }
    L_0x0048:
        r1 = r1 + 1;
        if (r5 == 0) goto L_0x0084;
    L_0x004c:
        if (r11 != r6) goto L_0x0056;
    L_0x004e:
        r2 = r0.positionStart;	 Catch:{ IllegalArgumentException -> 0x00fa }
        r2 = r2 + 1;
        r0.positionStart = r2;	 Catch:{ IllegalArgumentException -> 0x00fa }
        if (r5 == 0) goto L_0x005e;
    L_0x0056:
        if (r11 != r7) goto L_0x005e;
    L_0x0058:
        r2 = r0.positionStart;	 Catch:{ IllegalArgumentException -> 0x00fc }
        r2 = r2 + -1;
        r0.positionStart = r2;	 Catch:{ IllegalArgumentException -> 0x00fc }
    L_0x005e:
        r1 = r1 + -1;
        if (r5 == 0) goto L_0x0084;
    L_0x0062:
        r2 = r0.positionStart;	 Catch:{ IllegalArgumentException -> 0x00fe }
        if (r1 >= r2) goto L_0x0084;
    L_0x0066:
        if (r11 != r6) goto L_0x0076;
    L_0x0068:
        r2 = r0.positionStart;	 Catch:{ IllegalArgumentException -> 0x0102 }
        r2 = r2 + 1;
        r0.positionStart = r2;	 Catch:{ IllegalArgumentException -> 0x0102 }
        r2 = r0.itemCount;	 Catch:{ IllegalArgumentException -> 0x0102 }
        r2 = r2 + 1;
        r0.itemCount = r2;	 Catch:{ IllegalArgumentException -> 0x0102 }
        if (r5 == 0) goto L_0x0084;
    L_0x0076:
        if (r11 != r7) goto L_0x0084;
    L_0x0078:
        r2 = r0.positionStart;	 Catch:{ IllegalArgumentException -> 0x0104 }
        r2 = r2 + -1;
        r0.positionStart = r2;	 Catch:{ IllegalArgumentException -> 0x0104 }
        r2 = r0.itemCount;	 Catch:{ IllegalArgumentException -> 0x0104 }
        r2 = r2 + -1;
        r0.itemCount = r2;	 Catch:{ IllegalArgumentException -> 0x0104 }
    L_0x0084:
        if (r5 == 0) goto L_0x011e;
    L_0x0086:
        r2 = r0.positionStart;	 Catch:{ IllegalArgumentException -> 0x0106 }
        if (r2 > r1) goto L_0x009c;
    L_0x008a:
        r2 = r0.cmd;	 Catch:{ IllegalArgumentException -> 0x0106 }
        if (r2 != r6) goto L_0x0093;
    L_0x008e:
        r2 = r0.itemCount;
        r1 = r1 - r2;
        if (r5 == 0) goto L_0x011e;
    L_0x0093:
        r2 = r0.cmd;	 Catch:{ IllegalArgumentException -> 0x0108 }
        if (r2 != r7) goto L_0x011e;
    L_0x0097:
        r2 = r0.itemCount;
        r1 = r1 + r2;
        if (r5 == 0) goto L_0x011e;
    L_0x009c:
        if (r11 != r6) goto L_0x00a6;
    L_0x009e:
        r2 = r0.positionStart;	 Catch:{ IllegalArgumentException -> 0x010a }
        r2 = r2 + 1;
        r0.positionStart = r2;	 Catch:{ IllegalArgumentException -> 0x010a }
        if (r5 == 0) goto L_0x011e;
    L_0x00a6:
        if (r11 != r7) goto L_0x011e;
    L_0x00a8:
        r2 = r0.positionStart;	 Catch:{ IllegalArgumentException -> 0x010c }
        r2 = r2 + -1;
        r0.positionStart = r2;	 Catch:{ IllegalArgumentException -> 0x010c }
        r0 = r1;
    L_0x00af:
        r1 = r4 + -1;
        if (r5 == 0) goto L_0x011a;
    L_0x00b3:
        r1 = r0;
    L_0x00b4:
        r0 = r9.mPostponedList;
        r0 = r0.size();
        r0 = r0 + -1;
        r2 = r0;
    L_0x00bd:
        if (r2 < 0) goto L_0x00ef;
    L_0x00bf:
        r0 = r9.mPostponedList;
        r0 = r0.get(r2);
        r0 = (android.support.v7.widget.AdapterHelper.UpdateOp) r0;
        r3 = r0.cmd;	 Catch:{ IllegalArgumentException -> 0x010e }
        if (r3 != r8) goto L_0x00df;
    L_0x00cb:
        r3 = r0.itemCount;	 Catch:{ IllegalArgumentException -> 0x0110 }
        r4 = r0.positionStart;	 Catch:{ IllegalArgumentException -> 0x0110 }
        if (r3 == r4) goto L_0x00d5;
    L_0x00d1:
        r3 = r0.itemCount;	 Catch:{ IllegalArgumentException -> 0x0112 }
        if (r3 >= 0) goto L_0x00eb;
    L_0x00d5:
        r3 = r9.mPostponedList;	 Catch:{ IllegalArgumentException -> 0x0114 }
        r3.remove(r2);	 Catch:{ IllegalArgumentException -> 0x0114 }
        r9.recycleUpdateOp(r0);	 Catch:{ IllegalArgumentException -> 0x0114 }
        if (r5 == 0) goto L_0x00eb;
    L_0x00df:
        r3 = r0.itemCount;	 Catch:{ IllegalArgumentException -> 0x0116 }
        if (r3 > 0) goto L_0x00eb;
    L_0x00e3:
        r3 = r9.mPostponedList;	 Catch:{ IllegalArgumentException -> 0x0116 }
        r3.remove(r2);	 Catch:{ IllegalArgumentException -> 0x0116 }
        r9.recycleUpdateOp(r0);	 Catch:{ IllegalArgumentException -> 0x0116 }
    L_0x00eb:
        r0 = r2 + -1;
        if (r5 == 0) goto L_0x0118;
    L_0x00ef:
        return r1;
    L_0x00f0:
        r0 = move-exception;
        throw r0;
    L_0x00f2:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00f4 }
    L_0x00f4:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00f6 }
    L_0x00f6:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00f8 }
    L_0x00f8:
        r0 = move-exception;
        throw r0;
    L_0x00fa:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00fc }
    L_0x00fc:
        r0 = move-exception;
        throw r0;
    L_0x00fe:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0100 }
    L_0x0100:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0102 }
    L_0x0102:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0104 }
    L_0x0104:
        r0 = move-exception;
        throw r0;
    L_0x0106:
        r0 = move-exception;
        throw r0;
    L_0x0108:
        r0 = move-exception;
        throw r0;
    L_0x010a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x010c }
    L_0x010c:
        r0 = move-exception;
        throw r0;
    L_0x010e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0110 }
    L_0x0110:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0112 }
    L_0x0112:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0114 }
    L_0x0114:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0116 }
    L_0x0116:
        r0 = move-exception;
        throw r0;
    L_0x0118:
        r2 = r0;
        goto L_0x00bd;
    L_0x011a:
        r4 = r1;
        r1 = r0;
        goto L_0x0010;
    L_0x011e:
        r0 = r1;
        goto L_0x00af;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.AdapterHelper.updatePositionWithPostponed(int, int):int");
    }

    private boolean canFindInPreLayout(int i) {
        int i2 = ViewHolder.a;
        int size = this.mPostponedList.size();
        int i3 = 0;
        while (i3 < size) {
            UpdateOp updateOp = (UpdateOp) this.mPostponedList.get(i3);
            try {
                int i4;
                if (updateOp.cmd == 8) {
                    if (findPositionOffset(updateOp.itemCount, i3 + 1) == i) {
                        return true;
                    }
                } else if (updateOp.cmd == 1) {
                    int i5 = updateOp.positionStart + updateOp.itemCount;
                    i4 = updateOp.positionStart;
                    while (i4 < i5) {
                        try {
                            if (findPositionOffset(i4, i3 + 1) != i) {
                                i4++;
                                if (i2 != 0) {
                                    break;
                                }
                            }
                            return true;
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    }
                }
                i4 = i3 + 1;
                if (i2 != 0) {
                    break;
                }
                i3 = i4;
            } catch (IllegalArgumentException e2) {
                throw e2;
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        }
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    int findPositionOffset(int r7, int r8) {
        /*
        r6 = this;
        r2 = android.support.v7.widget.RecyclerView.ViewHolder.a;
        r0 = r6.mPostponedList;
        r3 = r0.size();
        r1 = r7;
    L_0x0009:
        if (r8 >= r3) goto L_0x0066;
    L_0x000b:
        r0 = r6.mPostponedList;
        r0 = r0.get(r8);
        r0 = (android.support.v7.widget.AdapterHelper.UpdateOp) r0;
        r4 = r0.cmd;	 Catch:{ IllegalArgumentException -> 0x0041 }
        r5 = 8;
        if (r4 != r5) goto L_0x002f;
    L_0x0019:
        r4 = r0.positionStart;	 Catch:{ IllegalArgumentException -> 0x0041 }
        if (r4 != r1) goto L_0x0021;
    L_0x001d:
        r1 = r0.itemCount;
        if (r2 == 0) goto L_0x0064;
    L_0x0021:
        r4 = r0.positionStart;	 Catch:{ IllegalArgumentException -> 0x0043 }
        if (r4 >= r1) goto L_0x0027;
    L_0x0025:
        r1 = r1 + -1;
    L_0x0027:
        r4 = r0.itemCount;	 Catch:{ IllegalArgumentException -> 0x0045 }
        if (r4 > r1) goto L_0x0064;
    L_0x002b:
        r1 = r1 + 1;
        if (r2 == 0) goto L_0x0064;
    L_0x002f:
        r4 = r0.positionStart;	 Catch:{ IllegalArgumentException -> 0x0049 }
        if (r4 > r1) goto L_0x0064;
    L_0x0033:
        r4 = r0.cmd;	 Catch:{ IllegalArgumentException -> 0x004b }
        r5 = 2;
        if (r4 != r5) goto L_0x0054;
    L_0x0038:
        r4 = r0.positionStart;	 Catch:{ IllegalArgumentException -> 0x004d }
        r5 = r0.itemCount;	 Catch:{ IllegalArgumentException -> 0x004d }
        r4 = r4 + r5;
        if (r1 >= r4) goto L_0x004f;
    L_0x003f:
        r0 = -1;
    L_0x0040:
        return r0;
    L_0x0041:
        r0 = move-exception;
        throw r0;
    L_0x0043:
        r0 = move-exception;
        throw r0;
    L_0x0045:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0047 }
    L_0x0047:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0049 }
    L_0x0049:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x004b }
    L_0x004b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x004d }
    L_0x004d:
        r0 = move-exception;
        throw r0;
    L_0x004f:
        r4 = r0.itemCount;
        r1 = r1 - r4;
        if (r2 == 0) goto L_0x0064;
    L_0x0054:
        r4 = r0.cmd;	 Catch:{ IllegalArgumentException -> 0x0062 }
        r5 = 1;
        if (r4 != r5) goto L_0x0064;
    L_0x0059:
        r0 = r0.itemCount;
        r0 = r0 + r1;
    L_0x005c:
        r8 = r8 + 1;
        if (r2 != 0) goto L_0x0040;
    L_0x0060:
        r1 = r0;
        goto L_0x0009;
    L_0x0062:
        r0 = move-exception;
        throw r0;
    L_0x0064:
        r0 = r1;
        goto L_0x005c;
    L_0x0066:
        r0 = r1;
        goto L_0x0040;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.AdapterHelper.findPositionOffset(int, int):int");
    }

    boolean hasAnyUpdateTypes(int i) {
        try {
            return (this.mExistingUpdateTypes & i) != 0;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    int findPositionOffset(int i) {
        return findPositionOffset(i, 0);
    }

    void consumePostponedUpdates() {
        int i = ViewHolder.a;
        int size = this.mPostponedList.size();
        int i2 = 0;
        while (i2 < size) {
            this.mCallback.onDispatchSecondPass((UpdateOp) this.mPostponedList.get(i2));
            int i3 = i2 + 1;
            if (i != 0) {
                break;
            }
            i2 = i3;
        }
        recycleUpdateOpsAndClearList(this.mPostponedList);
        this.mExistingUpdateTypes = 0;
    }

    private void applyRemove(UpdateOp updateOp) {
        int i = ViewHolder.a;
        int i2 = updateOp.positionStart;
        int i3 = updateOp.positionStart + updateOp.itemCount;
        Object obj = -1;
        int i4 = updateOp.positionStart;
        int i5 = 0;
        while (i4 < i3) {
            Object obj2;
            int i6;
            if (this.mCallback.findViewHolder(i4) == null) {
                try {
                    if (!canFindInPreLayout(i4)) {
                        obj2 = obj;
                        obj = null;
                        if (obj2 == 1) {
                            postponeAndUpdateViewHolders(obtainUpdateOp(2, i2, i5, null));
                            obj = 1;
                        }
                        obj2 = null;
                        if (obj != null) {
                            i6 = i4 - i5;
                            i4 = i3 - i5;
                            if (i != 0) {
                                i3 = 1;
                            } else {
                                i5 = 1;
                                i6++;
                                if (i != 0) {
                                    obj = obj2;
                                    break;
                                }
                                i3 = i4;
                                i4 = i6;
                                obj = obj2;
                            }
                        } else {
                            i6 = i4;
                            i4 = i3;
                            i3 = i5;
                        }
                        i5 = i3 + 1;
                        i6++;
                        if (i != 0) {
                            obj = obj2;
                            break;
                        }
                        i3 = i4;
                        i4 = i6;
                        obj = obj2;
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            if (obj == null) {
                dispatchAndUpdateViewHolders(obtainUpdateOp(2, i2, i5, null));
                obj = 1;
            } else {
                obj = null;
            }
            if (i == 0) {
                int i7 = 1;
                if (obj != null) {
                    i6 = i4 - i5;
                    i4 = i3 - i5;
                    if (i != 0) {
                        i3 = 1;
                    } else {
                        i5 = 1;
                        i6++;
                        if (i != 0) {
                            obj = obj2;
                            break;
                        }
                        i3 = i4;
                        i4 = i6;
                        obj = obj2;
                    }
                } else {
                    i6 = i4;
                    i4 = i3;
                    i3 = i5;
                }
                i5 = i3 + 1;
                i6++;
                if (i != 0) {
                    obj = obj2;
                    break;
                }
                i3 = i4;
                i4 = i6;
                obj = obj2;
            } else {
                obj2 = 1;
                if (obj2 == 1) {
                    postponeAndUpdateViewHolders(obtainUpdateOp(2, i2, i5, null));
                    obj = 1;
                }
                obj2 = null;
                if (obj != null) {
                    i6 = i4;
                    i4 = i3;
                    i3 = i5;
                } else {
                    i6 = i4 - i5;
                    i4 = i3 - i5;
                    if (i != 0) {
                        i5 = 1;
                        i6++;
                        if (i != 0) {
                            obj = obj2;
                            break;
                        }
                        i3 = i4;
                        i4 = i6;
                        obj = obj2;
                    } else {
                        i3 = 1;
                    }
                }
                i5 = i3 + 1;
                i6++;
                if (i != 0) {
                    obj = obj2;
                    break;
                }
                i3 = i4;
                i4 = i6;
                obj = obj2;
            }
        }
        if (i5 != updateOp.itemCount) {
            recycleUpdateOp(updateOp);
            updateOp = obtainUpdateOp(2, i2, i5, null);
        }
        if (obj == null) {
            try {
                dispatchAndUpdateViewHolders(updateOp);
                if (i == 0) {
                    return;
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        postponeAndUpdateViewHolders(updateOp);
    }

    public void recycleUpdateOp(UpdateOp updateOp) {
        try {
            if (!this.mDisableRecycler) {
                updateOp.payload = null;
                this.mUpdateOpPool.release(updateOp);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private void applyAdd(UpdateOp updateOp) {
        postponeAndUpdateViewHolders(updateOp);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void postponeAndUpdateViewHolders(android.support.v7.widget.AdapterHelper.UpdateOp r6) {
        /*
        r5 = this;
        r0 = android.support.v7.widget.RecyclerView.ViewHolder.a;
        r1 = r5.mPostponedList;	 Catch:{ IllegalArgumentException -> 0x0059 }
        r1.add(r6);	 Catch:{ IllegalArgumentException -> 0x0059 }
        r1 = r6.cmd;	 Catch:{ IllegalArgumentException -> 0x0059 }
        switch(r1) {
            case 1: goto L_0x002a;
            case 2: goto L_0x0040;
            case 3: goto L_0x000c;
            case 4: goto L_0x004b;
            case 5: goto L_0x000c;
            case 6: goto L_0x000c;
            case 7: goto L_0x000c;
            case 8: goto L_0x0035;
            default: goto L_0x000c;
        };
    L_0x000c:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0028 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x0028 }
        r1.<init>();	 Catch:{ IllegalArgumentException -> 0x0028 }
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0028 }
        r3 = 3;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0028 }
        r1 = r1.append(r2);	 Catch:{ IllegalArgumentException -> 0x0028 }
        r1 = r1.append(r6);	 Catch:{ IllegalArgumentException -> 0x0028 }
        r1 = r1.toString();	 Catch:{ IllegalArgumentException -> 0x0028 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0028 }
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0028 }
    L_0x0028:
        r0 = move-exception;
        throw r0;
    L_0x002a:
        r1 = r5.mCallback;	 Catch:{ IllegalArgumentException -> 0x005b }
        r2 = r6.positionStart;	 Catch:{ IllegalArgumentException -> 0x005b }
        r3 = r6.itemCount;	 Catch:{ IllegalArgumentException -> 0x005b }
        r1.offsetPositionsForAdd(r2, r3);	 Catch:{ IllegalArgumentException -> 0x005b }
        if (r0 == 0) goto L_0x0058;
    L_0x0035:
        r1 = r5.mCallback;	 Catch:{ IllegalArgumentException -> 0x005d }
        r2 = r6.positionStart;	 Catch:{ IllegalArgumentException -> 0x005d }
        r3 = r6.itemCount;	 Catch:{ IllegalArgumentException -> 0x005d }
        r1.offsetPositionsForMove(r2, r3);	 Catch:{ IllegalArgumentException -> 0x005d }
        if (r0 == 0) goto L_0x0058;
    L_0x0040:
        r1 = r5.mCallback;	 Catch:{ IllegalArgumentException -> 0x005f }
        r2 = r6.positionStart;	 Catch:{ IllegalArgumentException -> 0x005f }
        r3 = r6.itemCount;	 Catch:{ IllegalArgumentException -> 0x005f }
        r1.offsetPositionsForRemovingLaidOutOrNewView(r2, r3);	 Catch:{ IllegalArgumentException -> 0x005f }
        if (r0 == 0) goto L_0x0058;
    L_0x004b:
        r1 = r5.mCallback;	 Catch:{ IllegalArgumentException -> 0x0028 }
        r2 = r6.positionStart;	 Catch:{ IllegalArgumentException -> 0x0028 }
        r3 = r6.itemCount;	 Catch:{ IllegalArgumentException -> 0x0028 }
        r4 = r6.payload;	 Catch:{ IllegalArgumentException -> 0x0028 }
        r1.markViewHoldersUpdated(r2, r3, r4);	 Catch:{ IllegalArgumentException -> 0x0028 }
        if (r0 != 0) goto L_0x000c;
    L_0x0058:
        return;
    L_0x0059:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x005b }
    L_0x005b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x005d }
    L_0x005d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x005f }
    L_0x005f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0028 }
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.AdapterHelper.postponeAndUpdateViewHolders(android.support.v7.widget.AdapterHelper$UpdateOp):void");
    }
}
