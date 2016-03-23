package com.whatsapp.protocol;

import java.util.Vector;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class ct {
    private static final String[] z;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;

    static {
        String[] strArr = new String[13];
        String str = "5Ov6l&Gt#k1";
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
                        i3 = 69;
                        break;
                    case at.g /*1*/:
                        i3 = 46;
                        break;
                    case at.i /*2*/:
                        i3 = 4;
                        break;
                    case at.o /*3*/:
                        i3 = 66;
                        break;
                    default:
                        i3 = 5;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "!Kh+s \\}";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "1Wt'";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "7Kg'l5Z";
                    obj = 3;
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    str = ",J";
                    i = 5;
                    strArr2 = strArr3;
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    strArr2 = strArr3;
                    str = "1A";
                    obj = 5;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "eG`\u007f";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "eMh18";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "eZ}2`x";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "e^e0q,Mm2d+Z9";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u001e}p#k?OO'|";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "eHv-hx";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "&Be1v";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ct ctVar = (ct) obj;
        if (this.a == null) {
            if (ctVar.a != null) {
                return false;
            }
        } else if (!this.a.equals(ctVar.a)) {
            return false;
        }
        if (this.e == null) {
            if (ctVar.e != null) {
                return false;
            }
        } else if (!this.e.equals(ctVar.e)) {
            return false;
        }
        if (this.b == null) {
            if (ctVar.b != null) {
                return false;
            }
        } else if (!this.b.equals(ctVar.b)) {
            return false;
        }
        if (this.d == null) {
            if (ctVar.d != null) {
                return false;
            }
        } else if (!this.d.equals(ctVar.d)) {
            return false;
        }
        if (this.c == null) {
            if (ctVar.c != null) {
                return false;
            }
            return true;
        } else if (this.c.equals(ctVar.c)) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.d == null ? 0 : this.d.hashCode()) + (((this.b == null ? 0 : this.b.hashCode()) + (((this.e == null ? 0 : this.e.hashCode()) + (((this.a == null ? 0 : this.a.hashCode()) + 31) * 31)) * 31)) * 31)) * 31;
        if (this.c != null) {
            i = this.c.hashCode();
        }
        return hashCode + i;
    }

    public cw a() {
        return null;
    }

    public ct(ct ctVar) {
        this.e = ctVar.e;
        this.a = ctVar.a;
        this.b = ctVar.b;
        this.c = ctVar.c;
        this.d = ctVar.d;
    }

    public Vector b() {
        String str = this.e;
        String str2 = this.a;
        String str3 = this.c;
        String str4 = this.b;
        String str5 = this.d;
        if (z[4].equals(str2) && z[2].equals(str3)) {
            str3 = null;
        }
        Vector vector = new Vector(10);
        vector.addElement(new ce(z[6], str));
        vector.addElement(new ce(z[1], str2));
        if (str3 != null) {
            vector.addElement(new ce(z[3], str3));
        }
        vector.addElement(new ce(z[5], str4));
        if (str5 != null && str5.length() > 0) {
            vector.addElement(new ce(z[0], str5));
        }
        return vector;
    }

    public String toString() {
        return z[11] + (this.e == null ? "" : z[12] + this.e) + (this.a == null ? "" : z[8] + this.a) + (this.b == null ? "" : z[7] + this.b) + (this.c == null ? "" : z[9] + this.c) + (this.d == null ? "" : z[10] + this.d) + "]";
    }
}
