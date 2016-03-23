package com.whatsapp.gallerypicker;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.whatsapp.arj;
import java.util.Locale;
import org.v;
import org.whispersystems.at;

public class bw implements Parcelable {
    public static final Creator CREATOR;
    private static final String z;
    public boolean a;
    public Uri b;
    public String c;
    public ar d;
    public int e;
    public int f;

    bw(Parcel parcel, b bVar) {
        this(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.d.ordinal());
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.a ? 1 : 0);
    }

    public int describeContents() {
        return 0;
    }

    private bw(Parcel parcel) {
        boolean z;
        this.d = ar.values()[parcel.readInt()];
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.c = parcel.readString();
        this.b = (Uri) parcel.readParcelable(null);
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.a = z;
    }

    public String toString() {
        return String.format(Locale.US, z, new Object[]{this.d, Integer.valueOf(this.e), Integer.valueOf(this.f), this.c, Boolean.valueOf(this.a), this.b});
    }

    static {
        char[] toCharArray = "fA\f\u000e2cE\u001e\u001d\u0007N^\f\u0004,CC\u000eTr\\\u0000\u0004\u00074\u0012\t\tE$@^\u0019TrK\u0000\u000f\u001c4DI\u0019Tr\\\u0000\b\u0004'[UPL5\u0003_\u0004\u00070CIPL$R".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 47;
                    break;
                case at.g /*1*/:
                    i2 = 44;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_switchStyle;
                    break;
                case at.o /*3*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                default:
                    i2 = 87;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
        CREATOR = new x();
    }
}
