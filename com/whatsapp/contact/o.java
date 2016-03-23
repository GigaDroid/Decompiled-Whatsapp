package com.whatsapp.contact;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

public enum o {
    ;
    
    public static final o BACKGROUND_DELTA;
    public static final o BACKGROUND_FULL;
    public static final o INTERACTIVE_DELTA;
    public static final o INTERACTIVE_FULL;
    public static final o NOTIFICATION_DELTA;
    public static final o REGISTRATION_FULL;
    private static final String[] z;
    private final h b;
    private final g c;

    public boolean isFullSync() {
        try {
            return this.c == g.FULL;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private static o a(h hVar, g gVar) {
        boolean z = i.d;
        o[] values = values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            o oVar = values[i];
            try {
                if (oVar.b == hVar) {
                    if (oVar.c == gVar) {
                        return oVar;
                    }
                }
                i++;
                if (z) {
                    break;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
        throw new IllegalArgumentException(z[1] + hVar + "/" + gVar + z[0]);
    }

    static {
        String[] strArr = new String[8];
        String str = "8\u000e\u00179H\u007fA\u0007v\u001at^\u00013\u001bt@\u0007v\t1\\\u00165\u0007v@\u001a,\ru\u000e /\u0006rz\n&\r";
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
                        i4 = 17;
                        break;
                    case at.g /*1*/:
                        i4 = 46;
                        break;
                    case at.i /*2*/:
                        i4 = 115;
                        break;
                    case at.o /*3*/:
                        i4 = 86;
                        break;
                    default:
                        i4 = arj.Theme_editTextStyle;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "So0\u001d/Ca&\u0018,Nh&\u001a$";
                    i = 1;
                    i2 = 2;
                    strArr2 = strArr3;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "X`'\u0013:Pm'\u001f>Tq5\u0003$]";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "_a'\u001f.Xm2\u0002!^`,\u0012-]z2";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    str = "Ck4\u001f;E|2\u0002!^`,\u0010=]b";
                    i2 = 5;
                    strArr2 = strArr3;
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    strArr2 = strArr3;
                    str = "X`'\u0013:Pm'\u001f>Tq7\u0013$Eo";
                    i = 5;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "So0\u001d/Ca&\u0018,Nj6\u001a<P";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    REGISTRATION_FULL = new o(z[5], 0, h.REGISTRATION, g.FULL);
                    INTERACTIVE_FULL = new o(z[3], 1, h.INTERACTIVE, g.FULL);
                    INTERACTIVE_DELTA = new o(z[6], 2, h.INTERACTIVE, g.DELTA);
                    BACKGROUND_FULL = new o(z[2], 3, h.BACKGROUND, g.FULL);
                    BACKGROUND_DELTA = new o(z[7], 4, h.BACKGROUND, g.DELTA);
                    NOTIFICATION_DELTA = new o(z[4], 5, h.NOTIFICATION, g.DELTA);
                    a = new o[]{REGISTRATION_FULL, INTERACTIVE_FULL, INTERACTIVE_DELTA, BACKGROUND_FULL, BACKGROUND_DELTA, NOTIFICATION_DELTA};
                    return;
                default:
                    strArr2[i2] = str;
                    i2 = 1;
                    strArr2 = strArr3;
                    str = "RA\u001d\"\riZ\\\u001b\u0007uKS~";
                    i = 0;
                    break;
            }
        }
    }

    public String getSyncMode() {
        return this.c.getModeString();
    }

    public static o combine(o oVar, o oVar2) {
        if (oVar == oVar2 || oVar2 == null) {
            return oVar;
        }
        if (oVar == null) {
            return oVar2;
        }
        h hVar = oVar.b;
        Enum enumR = oVar2.b;
        try {
            if (hVar.compareTo(enumR) >= 0) {
                Enum enumR2 = enumR;
            }
            g gVar = oVar.c;
            Enum enumR3 = oVar2.c;
            try {
                if (gVar.compareTo(enumR3) >= 0) {
                    enumR = enumR3;
                }
                return a(hVar, gVar);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public String getSyncContext() {
        return this.b.getContextString();
    }

    private o(h hVar, g gVar) {
        this.b = hVar;
        this.c = gVar;
    }
}
