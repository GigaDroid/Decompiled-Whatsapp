package com.whatsapp.util.undobar;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.animation.Animation;
import com.whatsapp.WAAppCompatActivity;
import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

public class f implements Parcelable {
    public static final Creator CREATOR;
    private static final String[] z;
    int a;
    long b;
    Animation c;
    int d;
    int e;
    Animation f;

    static {
        String[] strArr = new String[6];
        String str = "F/\u0018\u0017\u0003\u000b{\u0015\r\u001fW";
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
                        i3 = arj.Theme_ratingBarStyle;
                        break;
                    case at.g /*1*/:
                        i3 = 15;
                        break;
                    case at.i /*2*/:
                        i3 = 124;
                        break;
                    case at.o /*3*/:
                        i3 = 98;
                        break;
                    default:
                        i3 = 113;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "?a\u0018\r3\u000b}/\u0016\b\u0006j\u0007\u000b\u0012\u0005a.\u0007\u0002W";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "F/\u0015\f0\u0004f\u0011\u0003\u0005\u0003`\u0012_";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "F/\b\u000b\u0005\u0006j.\u0007\u0002W";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "F/\u001e\u0005#\u000f|A";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                    CREATOR = new g();
                    return;
                default:
                    strArr2[i] = str;
                    str = "F/\u0013\u0017\u0005+a\u0015\u000f\u0010\u001ef\u0013\fL";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeLong(this.b);
    }

    public String toString() {
        boolean z = false;
        boolean z2 = UndoBarController.h;
        String str = z[2] + this.a + z[4] + this.d + z[5] + this.e + z[0] + this.b + z[3] + this.f + z[1] + this.c + '}';
        if (WAAppCompatActivity.c != 0) {
            if (!z2) {
                z = true;
            }
            UndoBarController.h = z;
        }
        return str;
    }

    public f(int i, int i2, long j) {
        this(i, i2);
        this.b = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        f fVar = (f) obj;
        if (this.e == fVar.e && this.b == fVar.b && this.a == fVar.a && this.d == fVar.d) {
            return true;
        }
        return false;
    }

    public f(Parcel parcel) {
        this.b = 5000;
        this.a = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.b = parcel.readLong();
    }

    public int describeContents() {
        return 0;
    }

    public f(int i, int i2) {
        this.b = 5000;
        this.a = i;
        this.d = i2;
    }
}
