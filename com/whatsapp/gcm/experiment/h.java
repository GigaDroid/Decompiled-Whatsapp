package com.whatsapp.gcm.experiment;

import com.whatsapp.WAAppCompatActivity;
import com.whatsapp.arj;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class h {
    private static final String[] z;
    public final boolean a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    static {
        String[] strArr = new String[16];
        String str = "c(";
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
                        i3 = 79;
                        break;
                    case at.g /*1*/:
                        i3 = 8;
                        break;
                    case at.i /*2*/:
                        i3 = 20;
                        break;
                    case at.o /*3*/:
                        i3 = 4;
                        break;
                    default:
                        i3 = 52;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "c(";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "+mxeM\u0002{qg\t";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "c(";
                    obj = 3;
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "7edtw fzaW;EGaWr";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0001m`s[=c@mY*d}jQaZqwA#|.$";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "+mxeM\u000bi`eu9i}hU-dq9";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    str = "<}wgQ<{rqX\u001fazcGr";
                    obj = 7;
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    strArr2 = strArr3;
                    str = "+mbmW*K{jZ*k`aP\u000b}fmZ(LqhU65";
                    obj = 8;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "c(";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "?azcw }zp\t";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "7edtw fzaW;LupUr";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "c(";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "c(";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "?azcw'mwop.|u9";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "c(";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public String toString() {
        boolean z = d.d;
        StringBuilder stringBuilder = new StringBuilder(z[6]);
        stringBuilder.append(z[3]).append(this.d).append(z[0]).append(z[7]).append(this.h).append(z[14]).append(z[9]).append(this.a).append(z[10]).append(z[12]).append(this.f).append(z[1]).append(z[5]).append(this.e).append(z[2]).append(z[15]).append(this.g).append(z[13]).append(z[11]).append(this.c).append(z[4]).append(z[8]).append(this.b);
        String stringBuilder2 = stringBuilder.toString();
        if (z) {
            WAAppCompatActivity.c++;
        }
        return stringBuilder2;
    }

    public h(long j, boolean z, boolean z2, boolean z3, long j2, boolean z4, int i, int i2) {
        this.d = j;
        this.h = z;
        this.a = z2;
        this.f = z3;
        this.e = j2;
        this.g = z4;
        this.c = i;
        this.b = i2;
    }
}
