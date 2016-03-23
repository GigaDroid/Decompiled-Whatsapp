package com.whatsapp;

import android.content.Intent;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public final class vr {
    private static final String[] z;
    private final int a;
    private final int b;
    private final int c;
    private final int d;

    static {
        String[] strArr = new String[19];
        String str = "\u007f{X~967\t";
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
                        i3 = 83;
                        break;
                    case at.g /*1*/:
                        i3 = 91;
                        break;
                    case at.i /*2*/:
                        i3 = 52;
                        break;
                    case at.o /*3*/:
                        i3 = 27;
                        break;
                    default:
                        i3 = 79;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0011:@o*!\"ws.=<Q`'6:Xo'n";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u007f{Dw:4<Q\u007fr";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u007f{D~=0>Zor";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "25Pi :?\u001ar!'>Zoa28@r =uvZ\u001b\u0007\u001efB\u0010\u0010\u0013uU\b\u0016\u001f";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = ";>Uw;;";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u001a5@~!'{Yn<'{V~o25Pi :?\u001ar!'>Zoa28@r =uvZ\u001b\u0007\u001efB\u0010\u0010\u0013uU\b\u0016\u001f";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "?>B~#";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "#7A|(6?";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = " 8Uw*";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "&5Gk*02Rr*7\u0004Rz&?.F~";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "44[\u007f";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "&5_u $5";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "</\\~={";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "<-Qi'6:@";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "<-Qi\u0010%4Xo.4>";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "7>U\u007f";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "04X\u007f";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u007f{Gx.?>\t";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public String toString() {
        int i = amm.b;
        try {
            String str = z[2] + a() + z[0] + this.c + z[3] + this.a + z[1] + this.d + z[4] + b() + '}';
            if (WAAppCompatActivity.c != 0) {
                amm.b = i + 1;
            }
            return str;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String a() {
        /*
        r3 = this;
        r1 = com.whatsapp.amm.b;
        r0 = r3.b;
        switch(r0) {
            case 1: goto L_0x0027;
            case 2: goto L_0x002f;
            case 3: goto L_0x0037;
            case 4: goto L_0x003f;
            case 5: goto L_0x0047;
            case 6: goto L_0x004f;
            case 7: goto L_0x0057;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 14;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r3.b;
        r0 = r0.append(r1);
        r1 = 41;
        r0 = r0.append(r1);
        r0 = r0.toString();
    L_0x0026:
        return r0;
    L_0x0027:
        r0 = z;
        r2 = 13;
        r0 = r0[r2];
        if (r1 == 0) goto L_0x0026;
    L_0x002f:
        r0 = z;
        r2 = 12;
        r0 = r0[r2];
        if (r1 == 0) goto L_0x0026;
    L_0x0037:
        r0 = z;
        r2 = 15;
        r0 = r0[r2];
        if (r1 == 0) goto L_0x0026;
    L_0x003f:
        r0 = z;
        r2 = 17;
        r0 = r0[r2];
        if (r1 == 0) goto L_0x0026;
    L_0x0047:
        r0 = z;
        r2 = 16;
        r0 = r0[r2];
        if (r1 == 0) goto L_0x0026;
    L_0x004f:
        r0 = z;
        r2 = 11;
        r0 = r0[r2];
        if (r1 == 0) goto L_0x0026;
    L_0x0057:
        r0 = z;
        r2 = 18;
        r0 = r0[r2];
        if (r1 == 0) goto L_0x0026;
    L_0x005f:
        goto L_0x0007;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.vr.a():java.lang.String");
    }

    public boolean d() {
        try {
            return this.a != 0;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public boolean c() {
        double b = b();
        try {
            return d() || (b != Double.NaN && b > 20.0d);
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            try {
                throw e2;
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        }
    }

    public int hashCode() {
        return (((((this.b * 31) + this.c) * 31) + this.a) * 31) + this.d;
    }

    public vr(Intent intent) {
        int i = amm.b;
        if (z[5].equals(intent.getAction())) {
            this.b = intent.getIntExtra(z[6], 1);
            this.c = intent.getIntExtra(z[8], -1);
            this.a = intent.getIntExtra(z[9], 0);
            this.d = intent.getIntExtra(z[10], -1);
            if (i != 0) {
                WAAppCompatActivity.c++;
                return;
            }
            return;
        }
        throw new IllegalArgumentException(z[7]);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            try {
                if (getClass() == obj.getClass()) {
                    vr vrVar = (vr) obj;
                    try {
                        if (this.b == vrVar.b) {
                            if (this.c == vrVar.c) {
                                try {
                                    if (this.a == vrVar.a) {
                                        try {
                                            if (this.d == vrVar.d) {
                                                return true;
                                            }
                                        } catch (IllegalArgumentException e) {
                                            throw e;
                                        }
                                    }
                                } catch (IllegalArgumentException e2) {
                                    throw e2;
                                }
                            }
                        }
                        return false;
                    } catch (IllegalArgumentException e22) {
                        throw e22;
                    } catch (IllegalArgumentException e222) {
                        throw e222;
                    }
                }
            } catch (IllegalArgumentException e2222) {
                throw e2222;
            }
        }
        return false;
    }

    public double b() {
        try {
            if (this.c >= 0) {
                if (this.d > 0) {
                    return (((double) this.c) * 100.0d) / ((double) this.d);
                }
            }
            return Double.NaN;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }
}
