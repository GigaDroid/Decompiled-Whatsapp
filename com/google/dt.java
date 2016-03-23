package com.google;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public abstract class dt {
    public static boolean c;
    private static final String[] z;
    private final gd a;
    private final d_ b;

    static {
        String[] strArr = new String[17];
        String str = "\u00076";
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
                        i3 = 54;
                        break;
                    case at.g /*1*/:
                        i3 = 7;
                        break;
                    case at.i /*2*/:
                        i3 = 34;
                        break;
                    case at.o /*3*/:
                        i3 = 53;
                        break;
                    default:
                        i3 = 41;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u00055\u0012";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "CiI[FAi\u0002QLUhFP[\f'";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\u00056\u0012";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\u00072";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u00056\u0012";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    str = "\u00056\u0012";
                    obj = 6;
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    strArr2 = strArr3;
                    str = "\u00055\u0012";
                    obj = 7;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u00070";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u00074";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u00076";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u00074";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u00055\u0012";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u00072";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u00070";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u00055\u0012";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u00056\u0012";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public abstract String c();

    dt(d_ d_Var) {
        this.b = d_Var;
        this.a = new gd(d_Var);
    }

    protected final gd a() {
        return this.a;
    }

    protected final d_ b() {
        return this.b;
    }

    public static dt a(d_ d_Var) {
        try {
            if (d_Var.f(1)) {
                return new dl(d_Var);
            }
            try {
                if (!d_Var.f(2)) {
                    return new dq(d_Var);
                }
                switch (gd.a(d_Var, 1, 4)) {
                    case at.p /*4*/:
                        try {
                            return new du(d_Var);
                        } catch (IllegalStateException e) {
                            throw e;
                        }
                    case at.m /*5*/:
                        return new d9(d_Var);
                    default:
                        switch (gd.a(d_Var, 1, 5)) {
                            case Y.p /*12*/:
                                try {
                                    return new dY(d_Var);
                                } catch (IllegalStateException e2) {
                                    throw e2;
                                }
                            case Y.q /*13*/:
                                return new dU(d_Var);
                            default:
                                switch (gd.a(d_Var, 1, 7)) {
                                    case arj.Theme_dividerHorizontal /*56*/:
                                        try {
                                            return new da(d_Var, z[1], z[0]);
                                        } catch (IllegalStateException e22) {
                                            throw e22;
                                        }
                                    case arj.Theme_activityChooserViewStyle /*57*/:
                                        return new da(d_Var, z[13], z[11]);
                                    case arj.Theme_toolbarStyle /*58*/:
                                        return new da(d_Var, z[7], z[10]);
                                    case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                                        return new da(d_Var, z[2], z[12]);
                                    case arj.Theme_popupMenuStyle /*60*/:
                                        return new da(d_Var, z[4], z[14]);
                                    case arj.Theme_popupWindowStyle /*61*/:
                                        return new da(d_Var, z[16], z[5]);
                                    case arj.Theme_editTextColor /*62*/:
                                        return new da(d_Var, z[6], z[15]);
                                    case arj.Theme_editTextBackground /*63*/:
                                        return new da(d_Var, z[8], z[9]);
                                    default:
                                        throw new IllegalStateException(z[3] + d_Var);
                                }
                        }
                }
            } catch (IllegalStateException e222) {
                throw e222;
            }
        } catch (IllegalStateException e2222) {
            throw e2222;
        }
    }
}
