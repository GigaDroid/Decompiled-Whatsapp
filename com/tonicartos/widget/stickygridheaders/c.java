package com.tonicartos.widget.stickygridheaders;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;
import org.v;
import org.whispersystems.at;

class c extends BaseSavedState {
    public static final Creator CREATOR;
    private static final String[] z;
    boolean a;

    static {
        String[] strArr = new String[2];
        String str = "1>2\u0014=\u001b\r)\u001e2*/:\u00133\u00109\u001c\u0005?\u0006\u001c2\u0012!L\u0019:\u00013\u0006\u0019/\u0016\"\u00071";
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
                        i3 = 98;
                        break;
                    case at.g /*1*/:
                        i3 = 74;
                        break;
                    case at.i /*2*/:
                        i3 = 91;
                        break;
                    case at.o /*3*/:
                        i3 = 119;
                        break;
                    default:
                        i3 = 86;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    CREATOR = new n();
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "B+)\u0012\u001e\u0007+?\u0012$\u0011\u0019/\u001e5\t3f";
                    obj = null;
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        super.writeToParcel(parcel, i);
        if (this.a) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        parcel.writeByte((byte) i2);
    }

    public String toString() {
        return z[0] + Integer.toHexString(System.identityHashCode(this)) + z[1] + this.a + "}";
    }

    c(Parcel parcel, m mVar) {
        this(parcel);
    }

    public c(Parcelable parcelable) {
        super(parcelable);
    }

    private c(Parcel parcel) {
        super(parcel);
        this.a = parcel.readByte() != null;
    }
}
