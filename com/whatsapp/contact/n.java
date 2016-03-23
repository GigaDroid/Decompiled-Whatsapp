package com.whatsapp.contact;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.whatsapp.protocol.bg;
import org.v;
import org.whispersystems.at;

public class n implements Parcelable {
    public static final Creator CREATOR;
    private static final String z;
    private final bg a;

    public bg a() {
        return this.a;
    }

    static {
        char[] toCharArray = "OM]J5OQA\t\rIGG\t\u000eS@\u0013K\u0005\u001cZFE\f".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 60;
                    break;
                case at.g /*1*/:
                    i2 = 52;
                    break;
                case at.i /*2*/:
                    i2 = 51;
                    break;
                case at.o /*3*/:
                    i2 = 41;
                    break;
                default:
                    i2 = 96;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
        CREATOR = new m();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.b);
        parcel.writeString(this.a.c);
        parcel.writeInt(this.a.a);
    }

    public n(bg bgVar) {
        if (bgVar == null) {
            throw new NullPointerException(z);
        }
        this.a = bgVar;
    }
}
