package com.whatsapp.protocol;

import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import java.io.InputStream;
import java.util.Vector;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public final class cw {
    private static final String[] z;
    public final byte[] a;
    public final ce[] b;
    public final String c;
    public final cw[] d;
    public int e;
    public InputStream f;

    static {
        String[] strArr = new String[18];
        String str = "@T4=\tCU4*@";
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
                        i3 = 33;
                        break;
                    case at.g /*1*/:
                        i3 = 32;
                        break;
                    case at.i /*2*/:
                        i3 = 64;
                        break;
                    case at.o /*3*/:
                        i3 = 79;
                        break;
                    default:
                        i3 = 96;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0001I3o\u000eNT`&\u000eUE'=\u0001M\u001a`";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "@T4=\tCU4*@";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "SE1:\tSE$o\u0001UT2&\u0002TT%oG";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0006\u0000-&\u0013RI.(";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "GA)#\u0005E\u00002*\u0011TI2*N\u0001N/+\u0005\u0001I3o\u000eTL,";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "GA)#\u0005E\u00002*\u0011TI2*N\u0001N/+\u0005\u0001";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "GA)#\u0005E\u00002*\u0011TI2*N\u0001N/+\u0005\u0001";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0001D!;\u0001\u0001L%!\u0007UH`";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u0001M)<\u0013HN'o\u0004@T!";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0001\u0001}o\u0012DQ5&\u0012DD`#\u0005OG4'@";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "@T4=\tCU4*@";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u0001I3o\u000eNT`&\u000eUE'=\u0001M\u001a`";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "GA)#\u0005E\u00002*\u0011TI2*N\u0001N/+\u0005\u001b\u0000";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u0001S4=\tOGzo";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u0001I3o\u000eNT`&\u000eUE'=\u0001M\u001a`";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "@T4=\tCU4*@";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0001I3o\u000eNT`&\u000eUE'=\u0001M\u001a`";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public String a(String str, String str2) {
        boolean z = co.s;
        try {
            if (this.b != null) {
                int i = 0;
                while (i < this.b.length) {
                    ce ceVar = this.b[i];
                    try {
                        if (!str.equals(ceVar.a)) {
                            i++;
                            if (z) {
                                break;
                            }
                        }
                        str2 = ceVar.b;
                        break;
                    } catch (NumberFormatException e) {
                        throw e;
                    }
                }
            }
            return str2;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public String d(String str) {
        String a = a(str, null);
        if (a != null) {
            return a;
        }
        try {
            throw new cz(z[4] + str + z[5]);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public cw a(int i) {
        try {
            if (this.d != null) {
                if (this.d.length > i) {
                    return this.d[i];
                }
            }
            return null;
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public cw(String str, ce[] ceVarArr, InputStream inputStream, int i) {
        this.f = null;
        this.c = str;
        this.b = ceVarArr;
        this.d = null;
        this.a = null;
        this.f = inputStream;
        this.e = i;
    }

    public cw f(String str) {
        boolean z = co.s;
        try {
            if (this.d == null) {
                return null;
            }
            int i = 0;
            while (i < this.d.length) {
                try {
                    if (!str.equals(this.d[i].c)) {
                        i++;
                        if (z) {
                            break;
                        }
                    }
                    return this.d[i];
                } catch (NumberFormatException e) {
                    throw e;
                }
            }
            return null;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public static void a(cw cwVar, String str) {
        try {
            if (!b(cwVar, str)) {
                throw new cz(z[14] + cwVar + z[15] + str);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public cw(String str, ce[] ceVarArr, cw[] cwVarArr) {
        this.f = null;
        this.c = str;
        this.b = ceVarArr;
        this.d = cwVarArr;
        this.a = null;
    }

    public cw(String str, ce[] ceVarArr, String str2) {
        this.f = null;
        this.c = str;
        this.b = ceVarArr;
        this.d = null;
        if (str2 != null) {
            try {
                this.a = b7.a(str2);
                if (!co.s) {
                    return;
                }
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        this.a = null;
    }

    public Vector c(String str) {
        boolean z = co.s;
        Vector vector = new Vector();
        try {
            if (this.d == null) {
                return vector;
            }
            int i = 0;
            while (i < this.d.length) {
                try {
                    if (str.equals(this.d[i].c)) {
                        vector.addElement(this.d[i]);
                    }
                    i++;
                    if (z) {
                        break;
                    }
                } catch (NumberFormatException e) {
                    throw e;
                }
            }
            return vector;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public cw(String str, ce[] ceVarArr) {
        this.f = null;
        this.c = str;
        this.b = ceVarArr;
        this.d = null;
        this.a = null;
    }

    public static cw a(cw cwVar) {
        if (cwVar != null) {
            return cwVar;
        }
        try {
            throw new cz(z[6]);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public int a(String str, int i) {
        String b = b(str);
        if (b != null) {
            try {
                i = Integer.parseInt(b);
            } catch (NumberFormatException e) {
                throw new cz(z[3] + str + z[2] + b);
            }
        }
        return i;
    }

    public cw(String str, ce[] ceVarArr, byte[] bArr) {
        this.f = null;
        this.c = str;
        this.b = ceVarArr;
        this.d = null;
        this.a = bArr;
    }

    public int a(String str) {
        String d = d(str);
        try {
            return Integer.parseInt(d);
        } catch (NumberFormatException e) {
            throw new cz(z[17] + str + z[16] + d);
        }
    }

    public String b(String str) {
        return a(str, null);
    }

    public long e(String str) {
        String d = d(str);
        try {
            return Long.parseLong(d);
        } catch (NumberFormatException e) {
            throw new cz(z[0] + str + z[1] + d);
        }
    }

    public static byte[] a(cw cwVar, int i) {
        try {
            if (cwVar.a == null) {
                throw new cz(z[7] + cwVar + z[10]);
            }
            try {
                if (cwVar.a.length == i) {
                    return cwVar.a;
                }
                throw new cz(z[8] + cwVar + z[9] + cwVar.a.length + z[11] + i);
            } catch (NumberFormatException e) {
                throw e;
            }
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public String a() {
        try {
            if (this.a == null) {
                return null;
            }
            return b7.a(this.a);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public long b(String str, int i) {
        String b = b(str);
        if (b == null) {
            return (long) i;
        }
        try {
            return Long.parseLong(b);
        } catch (NumberFormatException e) {
            throw new cz(z[12] + str + z[13] + b);
        }
    }

    public cw(String str, ce[] ceVarArr, cw cwVar) {
        this.f = null;
        this.c = str;
        this.b = ceVarArr;
        this.d = cwVar == null ? null : new cw[]{cwVar};
        this.a = null;
    }

    public static boolean b(cw cwVar, String str) {
        if (cwVar != null) {
            try {
                if (cwVar.c != null) {
                    if (cwVar.c.equals(str)) {
                        return true;
                    }
                }
            } catch (NumberFormatException e) {
                throw e;
            } catch (NumberFormatException e2) {
                throw e2;
            }
        }
        return false;
    }
}
