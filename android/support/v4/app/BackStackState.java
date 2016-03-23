package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

/* compiled from: BackStackRecord */
final class BackStackState implements Parcelable {
    public static final Creator CREATOR;
    private static final String[] z;
    final int mBreadCrumbShortTitleRes;
    final CharSequence mBreadCrumbShortTitleText;
    final int mBreadCrumbTitleRes;
    final CharSequence mBreadCrumbTitleText;
    final int mIndex;
    final String mName;
    final int[] mOps;
    final ArrayList mSharedElementSourceNames;
    final ArrayList mSharedElementTargetNames;
    final int mTransition;
    final int mTransitionStyle;

    final class 1 implements Creator {
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        public Object[] m34newArray(int i) {
            return newArray(i);
        }

        public Object m33createFromParcel(Parcel parcel) {
            return createFromParcel(parcel);
        }

        public BackStackState[] newArray(int i) {
            return new BackStackState[i];
        }

        1() {
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.mOps);
        parcel.writeInt(this.mTransition);
        parcel.writeInt(this.mTransitionStyle);
        parcel.writeString(this.mName);
        parcel.writeInt(this.mIndex);
        parcel.writeInt(this.mBreadCrumbTitleRes);
        TextUtils.writeToParcel(this.mBreadCrumbTitleText, parcel, 0);
        parcel.writeInt(this.mBreadCrumbShortTitleRes);
        TextUtils.writeToParcel(this.mBreadCrumbShortTitleText, parcel, 0);
        parcel.writeStringList(this.mSharedElementSourceNames);
        parcel.writeStringList(this.mSharedElementTargetNames);
    }

    public BackStackState(Parcel parcel) {
        this.mOps = parcel.createIntArray();
        this.mTransition = parcel.readInt();
        this.mTransitionStyle = parcel.readInt();
        this.mName = parcel.readString();
        this.mIndex = parcel.readInt();
        this.mBreadCrumbTitleRes = parcel.readInt();
        this.mBreadCrumbTitleText = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.mBreadCrumbShortTitleRes = parcel.readInt();
        this.mBreadCrumbShortTitleText = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.mSharedElementSourceNames = parcel.createStringArrayList();
        this.mSharedElementTargetNames = parcel.createStringArrayList();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BackStackState(android.support.v4.app.BackStackRecord r10) {
        /*
        r9 = this;
        r4 = 0;
        r6 = android.support.v4.app.Fragment.a;
        r9.<init>();
        r0 = r10.mHead;
        r1 = r0;
        r0 = r4;
    L_0x000a:
        if (r1 == 0) goto L_0x001b;
    L_0x000c:
        r2 = r1.removed;
        if (r2 == 0) goto L_0x0017;
    L_0x0010:
        r2 = r1.removed;
        r2 = r2.size();
        r0 = r0 + r2;
    L_0x0017:
        r1 = r1.next;
        if (r6 == 0) goto L_0x000a;
    L_0x001b:
        r1 = r10.mNumOp;	 Catch:{ IllegalStateException -> 0x0033 }
        r1 = r1 * 7;
        r0 = r0 + r1;
        r0 = new int[r0];	 Catch:{ IllegalStateException -> 0x0033 }
        r9.mOps = r0;	 Catch:{ IllegalStateException -> 0x0033 }
        r0 = r10.mAddToBackStack;	 Catch:{ IllegalStateException -> 0x0033 }
        if (r0 != 0) goto L_0x0035;
    L_0x0028:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x0033 }
        r1 = z;	 Catch:{ IllegalStateException -> 0x0033 }
        r2 = 7;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0033 }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x0033 }
        throw r0;	 Catch:{ IllegalStateException -> 0x0033 }
    L_0x0033:
        r0 = move-exception;
        throw r0;
    L_0x0035:
        r0 = r10.mHead;
        r5 = r0;
        r0 = r4;
    L_0x0039:
        if (r5 == 0) goto L_0x00a7;
    L_0x003b:
        r1 = r9.mOps;	 Catch:{ IllegalStateException -> 0x00d0 }
        r2 = r0 + 1;
        r3 = r5.cmd;	 Catch:{ IllegalStateException -> 0x00d0 }
        r1[r0] = r3;	 Catch:{ IllegalStateException -> 0x00d0 }
        r1 = r9.mOps;	 Catch:{ IllegalStateException -> 0x00d0 }
        r3 = r2 + 1;
        r0 = r5.fragment;	 Catch:{ IllegalStateException -> 0x00d0 }
        if (r0 == 0) goto L_0x00d2;
    L_0x004b:
        r0 = r5.fragment;	 Catch:{ IllegalStateException -> 0x00d0 }
        r0 = r0.mIndex;	 Catch:{ IllegalStateException -> 0x00d0 }
    L_0x004f:
        r1[r2] = r0;
        r0 = r9.mOps;
        r1 = r3 + 1;
        r2 = r5.enterAnim;
        r0[r3] = r2;
        r0 = r9.mOps;
        r2 = r1 + 1;
        r3 = r5.exitAnim;
        r0[r1] = r3;
        r0 = r9.mOps;
        r1 = r2 + 1;
        r3 = r5.popEnterAnim;
        r0[r2] = r3;
        r2 = r9.mOps;
        r0 = r1 + 1;
        r3 = r5.popExitAnim;
        r2[r1] = r3;
        r1 = r5.removed;
        if (r1 == 0) goto L_0x009b;
    L_0x0075:
        r1 = r5.removed;
        r7 = r1.size();
        r1 = r9.mOps;
        r2 = r0 + 1;
        r1[r0] = r7;
        r3 = r4;
    L_0x0082:
        if (r3 >= r7) goto L_0x00dd;
    L_0x0084:
        r8 = r9.mOps;
        r1 = r2 + 1;
        r0 = r5.removed;
        r0 = r0.get(r3);
        r0 = (android.support.v4.app.Fragment) r0;
        r0 = r0.mIndex;
        r8[r2] = r0;
        r0 = r3 + 1;
        if (r6 == 0) goto L_0x00da;
    L_0x0098:
        r0 = r1;
    L_0x0099:
        if (r6 == 0) goto L_0x00a3;
    L_0x009b:
        r1 = r0;
        r2 = r9.mOps;	 Catch:{ IllegalStateException -> 0x00d5 }
        r0 = r1 + 1;
        r3 = 0;
        r2[r1] = r3;	 Catch:{ IllegalStateException -> 0x00d5 }
    L_0x00a3:
        r1 = r5.next;
        if (r6 == 0) goto L_0x00d7;
    L_0x00a7:
        r0 = r10.mTransition;
        r9.mTransition = r0;
        r0 = r10.mTransitionStyle;
        r9.mTransitionStyle = r0;
        r0 = r10.mName;
        r9.mName = r0;
        r0 = r10.mIndex;
        r9.mIndex = r0;
        r0 = r10.mBreadCrumbTitleRes;
        r9.mBreadCrumbTitleRes = r0;
        r0 = r10.mBreadCrumbTitleText;
        r9.mBreadCrumbTitleText = r0;
        r0 = r10.mBreadCrumbShortTitleRes;
        r9.mBreadCrumbShortTitleRes = r0;
        r0 = r10.mBreadCrumbShortTitleText;
        r9.mBreadCrumbShortTitleText = r0;
        r0 = r10.mSharedElementSourceNames;
        r9.mSharedElementSourceNames = r0;
        r0 = r10.mSharedElementTargetNames;
        r9.mSharedElementTargetNames = r0;
        return;
    L_0x00d0:
        r0 = move-exception;
        throw r0;
    L_0x00d2:
        r0 = -1;
        goto L_0x004f;
    L_0x00d5:
        r0 = move-exception;
        throw r0;
    L_0x00d7:
        r5 = r1;
        goto L_0x0039;
    L_0x00da:
        r3 = r0;
        r2 = r1;
        goto L_0x0082;
    L_0x00dd:
        r0 = r2;
        goto L_0x0099;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.BackStackState.<init>(android.support.v4.app.BackStackRecord):void");
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.support.v4.app.BackStackRecord instantiate(android.support.v4.app.FragmentManagerImpl r14) {
        /*
        r13 = this;
        r12 = 1;
        r2 = 0;
        r5 = android.support.v4.app.Fragment.a;
        r6 = new android.support.v4.app.BackStackRecord;
        r6.<init>(r14);
        r1 = r2;
        r0 = r2;
    L_0x000b:
        r3 = r13.mOps;
        r3 = r3.length;
        if (r0 >= r3) goto L_0x00f8;
    L_0x0010:
        r7 = new android.support.v4.app.BackStackRecord$Op;
        r7.<init>();
        r3 = r13.mOps;	 Catch:{ IllegalStateException -> 0x0126 }
        r4 = r0 + 1;
        r0 = r3[r0];	 Catch:{ IllegalStateException -> 0x0126 }
        r7.cmd = r0;	 Catch:{ IllegalStateException -> 0x0126 }
        r0 = android.support.v4.app.FragmentManagerImpl.DEBUG;	 Catch:{ IllegalStateException -> 0x0126 }
        if (r0 == 0) goto L_0x005d;
    L_0x0021:
        r0 = z;	 Catch:{ IllegalStateException -> 0x0126 }
        r3 = 0;
        r0 = r0[r3];	 Catch:{ IllegalStateException -> 0x0126 }
        r3 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0126 }
        r3.<init>();	 Catch:{ IllegalStateException -> 0x0126 }
        r8 = z;	 Catch:{ IllegalStateException -> 0x0126 }
        r9 = 1;
        r8 = r8[r9];	 Catch:{ IllegalStateException -> 0x0126 }
        r3 = r3.append(r8);	 Catch:{ IllegalStateException -> 0x0126 }
        r3 = r3.append(r6);	 Catch:{ IllegalStateException -> 0x0126 }
        r8 = z;	 Catch:{ IllegalStateException -> 0x0126 }
        r9 = 3;
        r8 = r8[r9];	 Catch:{ IllegalStateException -> 0x0126 }
        r3 = r3.append(r8);	 Catch:{ IllegalStateException -> 0x0126 }
        r3 = r3.append(r1);	 Catch:{ IllegalStateException -> 0x0126 }
        r8 = z;	 Catch:{ IllegalStateException -> 0x0126 }
        r9 = 2;
        r8 = r8[r9];	 Catch:{ IllegalStateException -> 0x0126 }
        r3 = r3.append(r8);	 Catch:{ IllegalStateException -> 0x0126 }
        r8 = r13.mOps;	 Catch:{ IllegalStateException -> 0x0126 }
        r8 = r8[r4];	 Catch:{ IllegalStateException -> 0x0126 }
        r3 = r3.append(r8);	 Catch:{ IllegalStateException -> 0x0126 }
        r3 = r3.toString();	 Catch:{ IllegalStateException -> 0x0126 }
        android.util.Log.v(r0, r3);	 Catch:{ IllegalStateException -> 0x0126 }
    L_0x005d:
        r0 = r13.mOps;
        r3 = r4 + 1;
        r0 = r0[r4];
        if (r0 < 0) goto L_0x0071;
    L_0x0065:
        r4 = r14.mActive;
        r0 = r4.get(r0);
        r0 = (android.support.v4.app.Fragment) r0;
        r7.fragment = r0;	 Catch:{ IllegalStateException -> 0x0128 }
        if (r5 == 0) goto L_0x0074;
    L_0x0071:
        r0 = 0;
        r7.fragment = r0;	 Catch:{ IllegalStateException -> 0x0128 }
    L_0x0074:
        r0 = r13.mOps;
        r4 = r3 + 1;
        r0 = r0[r3];
        r7.enterAnim = r0;
        r0 = r13.mOps;
        r3 = r4 + 1;
        r0 = r0[r4];
        r7.exitAnim = r0;
        r0 = r13.mOps;
        r4 = r3 + 1;
        r0 = r0[r3];
        r7.popEnterAnim = r0;
        r0 = r13.mOps;
        r8 = r4 + 1;
        r0 = r0[r4];
        r7.popExitAnim = r0;
        r0 = r13.mOps;
        r3 = r8 + 1;
        r8 = r0[r8];
        if (r8 <= 0) goto L_0x00f1;
    L_0x009c:
        r0 = new java.util.ArrayList;
        r0.<init>(r8);
        r7.removed = r0;
        r4 = r2;
        r0 = r3;
    L_0x00a5:
        if (r4 >= r8) goto L_0x0134;
    L_0x00a7:
        r3 = android.support.v4.app.FragmentManagerImpl.DEBUG;	 Catch:{ IllegalStateException -> 0x012a }
        if (r3 == 0) goto L_0x00da;
    L_0x00ab:
        r3 = z;	 Catch:{ IllegalStateException -> 0x012a }
        r9 = 5;
        r3 = r3[r9];	 Catch:{ IllegalStateException -> 0x012a }
        r9 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x012a }
        r9.<init>();	 Catch:{ IllegalStateException -> 0x012a }
        r10 = z;	 Catch:{ IllegalStateException -> 0x012a }
        r11 = 6;
        r10 = r10[r11];	 Catch:{ IllegalStateException -> 0x012a }
        r9 = r9.append(r10);	 Catch:{ IllegalStateException -> 0x012a }
        r9 = r9.append(r6);	 Catch:{ IllegalStateException -> 0x012a }
        r10 = z;	 Catch:{ IllegalStateException -> 0x012a }
        r11 = 4;
        r10 = r10[r11];	 Catch:{ IllegalStateException -> 0x012a }
        r9 = r9.append(r10);	 Catch:{ IllegalStateException -> 0x012a }
        r10 = r13.mOps;	 Catch:{ IllegalStateException -> 0x012a }
        r10 = r10[r0];	 Catch:{ IllegalStateException -> 0x012a }
        r9 = r9.append(r10);	 Catch:{ IllegalStateException -> 0x012a }
        r9 = r9.toString();	 Catch:{ IllegalStateException -> 0x012a }
        android.util.Log.v(r3, r9);	 Catch:{ IllegalStateException -> 0x012a }
    L_0x00da:
        r9 = r14.mActive;
        r10 = r13.mOps;
        r3 = r0 + 1;
        r0 = r10[r0];
        r0 = r9.get(r0);
        r0 = (android.support.v4.app.Fragment) r0;
        r9 = r7.removed;
        r9.add(r0);
        r0 = r4 + 1;
        if (r5 == 0) goto L_0x0130;
    L_0x00f1:
        r6.addOp(r7);
        r0 = r1 + 1;
        if (r5 == 0) goto L_0x012c;
    L_0x00f8:
        r0 = r13.mTransition;
        r6.mTransition = r0;
        r0 = r13.mTransitionStyle;
        r6.mTransitionStyle = r0;
        r0 = r13.mName;
        r6.mName = r0;
        r0 = r13.mIndex;
        r6.mIndex = r0;
        r6.mAddToBackStack = r12;
        r0 = r13.mBreadCrumbTitleRes;
        r6.mBreadCrumbTitleRes = r0;
        r0 = r13.mBreadCrumbTitleText;
        r6.mBreadCrumbTitleText = r0;
        r0 = r13.mBreadCrumbShortTitleRes;
        r6.mBreadCrumbShortTitleRes = r0;
        r0 = r13.mBreadCrumbShortTitleText;
        r6.mBreadCrumbShortTitleText = r0;
        r0 = r13.mSharedElementSourceNames;
        r6.mSharedElementSourceNames = r0;
        r0 = r13.mSharedElementTargetNames;
        r6.mSharedElementTargetNames = r0;
        r6.bumpBackStackNesting(r12);
        return r6;
    L_0x0126:
        r0 = move-exception;
        throw r0;
    L_0x0128:
        r0 = move-exception;
        throw r0;
    L_0x012a:
        r0 = move-exception;
        throw r0;
    L_0x012c:
        r1 = r0;
        r0 = r3;
        goto L_0x000b;
    L_0x0130:
        r4 = r0;
        r0 = r3;
        goto L_0x00a5;
    L_0x0134:
        r3 = r0;
        goto L_0x00f1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.BackStackState.instantiate(android.support.v4.app.FragmentManagerImpl):android.support.v4.app.BackStackRecord");
    }

    static {
        String[] strArr = new String[8];
        String str = "[Mq'1xQd\r=s^w%.";
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
                        i3 = 29;
                        break;
                    case at.g /*1*/:
                        i3 = 63;
                        break;
                    case at.i /*2*/:
                        i3 = 16;
                        break;
                    case at.o /*3*/:
                        i3 = 64;
                        break;
                    default:
                        i3 = 92;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "=]q39=Yb!;pZ~4|>";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "=P``\u007f";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "=Lu4|oZ}/*x\u001fv2=zRu.(=\u001c";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "[Mq'1xQd\r=s^w%.";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "TQc4=sKy!(x\u001f";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "SPd`3s\u001fr!?v\u001fc4=~T";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                    CREATOR = new 1();
                    return;
                default:
                    strArr2[i] = str;
                    str = "TQc4=sKy!(x\u001f";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }
}
