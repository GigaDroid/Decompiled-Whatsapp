package com.google;

import com.whatsapp.arj;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import org.v;
import org.whispersystems.at;

final class el implements Serializable {
    private static final long serialVersionUID = 0;
    private static final String[] z;
    private byte[] a;
    private String b;

    static {
        int i;
        int i2;
        String[] strArr = new String[6];
        char[] toCharArray = "?[OPZ\u000f\u0015Z]\u0016\f\\@V\u0016\u001aGAFYJW[TP\u000fG\u000eQZ\u000bF]".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_ratingBarStyle;
                    break;
                case at.g /*1*/:
                    i2 = 53;
                    break;
                case at.i /*2*/:
                    i2 = 46;
                    break;
                case at.o /*3*/:
                    i2 = 50;
                    break;
                default:
                    i2 = 54;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "?[OPZ\u000f\u0015Z]\u0016\u001f[JWD\u0019AO\\RJE\\]B\u0005\u0015LGP\fP\\".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_ratingBarStyle;
                    break;
                case at.g /*1*/:
                    i2 = 53;
                    break;
                case at.i /*2*/:
                    i2 = 46;
                    break;
                case at.o /*3*/:
                    i2 = 50;
                    break;
                default:
                    i2 = 54;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "?[OPZ\u000f\u0015Z]\u0016\tTB^\u0016\u0004PYpC\u0003YJWDJXKF^\u0005Q".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_ratingBarStyle;
                    break;
                case at.g /*1*/:
                    i2 = 53;
                    break;
                case at.i /*2*/:
                    i2 = 46;
                    break;
                case at.o /*3*/:
                    i2 = 50;
                    break;
                default:
                    i2 = 54;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "/G\\]DJVO^Z\u0003[I\u0012X\u000fBlG_\u0006QK@".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_ratingBarStyle;
                    break;
                case at.g /*1*/:
                    i2 = 53;
                    break;
                case at.i /*2*/:
                    i2 = 46;
                    break;
                case at.o /*3*/:
                    i2 = 50;
                    break;
                default:
                    i2 = 54;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "\u0004PYpC\u0003YJWD".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_ratingBarStyle;
                    break;
                case at.g /*1*/:
                    i2 = 53;
                    break;
                case at.i /*2*/:
                    i2 = 46;
                    break;
                case at.o /*3*/:
                    i2 = 50;
                    break;
                default:
                    i2 = 54;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = "?[OPZ\u000f\u0015Z]\u0016\f\\@V\u0016\u0004PYpC\u0003YJWDJXKF^\u0005Q".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_ratingBarStyle;
                    break;
                case at.g /*1*/:
                    i2 = 53;
                    break;
                case at.i /*2*/:
                    i2 = 46;
                    break;
                case at.o /*3*/:
                    i2 = 50;
                    break;
                default:
                    i2 = 54;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[5] = new String(cArr).intern();
        z = strArr;
    }

    el(fO fOVar) {
        this.b = fOVar.getClass().getName();
        this.a = fOVar.b();
    }

    protected Object readResolve() {
        try {
            il ilVar = (il) Class.forName(this.b).getMethod(z[4], new Class[0]).invoke(null, new Object[0]);
            ilVar.a(this.a);
            return ilVar.buildPartial();
        } catch (Throwable e) {
            throw new RuntimeException(z[0], e);
        } catch (Throwable e2) {
            throw new RuntimeException(z[5], e2);
        } catch (Throwable e22) {
            throw new RuntimeException(z[2], e22);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(z[3], e3.getCause());
        } catch (Throwable e222) {
            throw new RuntimeException(z[1], e222);
        }
    }
}
