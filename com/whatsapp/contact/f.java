package com.whatsapp.contact;

import android.database.DatabaseUtils;
import com.whatsapp.WAAppCompatActivity;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public enum f {
    ;
    
    public static final f BOTH;
    public static final f INVISIBLE_ONLY;
    public static final f VISIBLE_ONLY;
    private static final f[] a;
    private static final String[] z;
    private final String[] b;

    private f(String[] strArr) {
        this.b = strArr;
    }

    static {
        String[] strArr = new String[11];
        String str = "P@f\u000bl[N\u007fVzC_";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case v.m /*0*/:
                        i4 = 51;
                        break;
                    case at.g /*1*/:
                        i4 = 47;
                        break;
                    case at.i /*2*/:
                        i4 = 11;
                        break;
                    case at.o /*3*/:
                        i4 = 37;
                        break;
                    default:
                        i4 = 27;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "\u0012\u0012";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "RLhJn][TQbCJ";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    strArr2 = strArr3;
                    str = "\u000e\u0010";
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "\u0013nEa;";
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "RLhJn][TQbCJ";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "\u0013fX\u0005UfcG\u0005Ta\u000f";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    str = "q`_m";
                    i = 7;
                    i2 = 8;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    strArr2 = strArr3;
                    str = "efXlY\u007fjTjU\u007fv";
                    i = 8;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "za]lHzmG`D|aG|";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    BOTH = new f(z[8], 0, null);
                    VISIBLE_ONLY = new f(z[9], 1, new String[]{"1"});
                    INVISIBLE_ONLY = new f(z[10], 2, new String[]{"0"});
                    a = new f[]{BOTH, VISIBLE_ONLY, INVISIBLE_ONLY};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "ZATSr@FiI~lHyJnC";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public String[] getWhereArgs() {
        return this.b;
    }

    public String getWhereClause() {
        boolean z = i.d;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('(');
        stringBuilder.append(z[6]);
        stringBuilder.append(z[7]);
        stringBuilder.append(z[3]);
        stringBuilder.append(z[2]);
        DatabaseUtils.appendEscapedSQLString(stringBuilder, z[0]);
        stringBuilder.append(')');
        if (this.b != null) {
            stringBuilder.append(z[5]);
            stringBuilder.append(z[1]);
            stringBuilder.append(z[4]);
        }
        String stringBuilder2 = stringBuilder.toString();
        if (z) {
            WAAppCompatActivity.c++;
        }
        return stringBuilder2;
    }
}
