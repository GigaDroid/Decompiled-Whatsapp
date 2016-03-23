package com.whatsapp;

import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class dg {
    private static File a;
    private static File b;
    private static File c;
    private static File d;
    private static File e;
    private static File f;
    private static SimpleDateFormat g;
    private static boolean h;
    private static File i;
    private static File j;
    private static File k;
    private static File l;
    private static File m;
    private static File n;
    private static File o;
    private static final String[] z;

    public static boolean d(File file) {
        if (!h) {
            a();
        }
        return file != null && file.getCanonicalPath().startsWith(e.getCanonicalPath());
    }

    public static boolean a(boolean z) {
        return z ? a(h(), 0, 0) : a(h(), 86400000, 524288000);
    }

    private static File a(File file) {
        return a(file, false);
    }

    public static File e() {
        if (!h) {
            a();
        }
        return b;
    }

    public static File i() {
        if (!h) {
            a();
        }
        return a;
    }

    public static boolean c(File file) {
        if (!h) {
            a();
        }
        return file != null && file.getCanonicalPath().startsWith(b.getCanonicalPath());
    }

    public static File c() {
        if (!h) {
            a();
        }
        return c;
    }

    public static boolean b(File file) {
        if (!h) {
            a();
        }
        return file != null && file.getCanonicalPath().startsWith(d.getCanonicalPath());
    }

    public static File g() {
        if (!h) {
            a();
        }
        return a(e);
    }

    public static boolean e(File file) {
        if (!h) {
            a();
        }
        return file != null && file.getCanonicalPath().startsWith(c.getCanonicalPath());
    }

    public static File k() {
        if (!h) {
            a();
        }
        return j;
    }

    public static File f() {
        if (!h) {
            a();
        }
        return a(d);
    }

    public static void a() {
        e = a(new File(App.a3, z[14]));
        j = a(new File(e, z[3]));
        a = a(new File(e, z[6]), true);
        c = a(new File(e, z[4]));
        b = a(new File(e, z[8]));
        d = a(new File(e, z[12]));
        o = a(new File(e, z[5]));
        l = a(new File(e, z[10]));
        f = a(new File(e, z[15]), true);
        k = a(new File(j, z[11]), true);
        m = a(new File(c, z[7]), true);
        n = a(new File(b, z[13]), true);
        i = a(new File(d, z[9]), true);
        h = true;
    }

    static {
        String[] strArr = new String[32];
        String str = "Ek5X\u0017\u000e\\";
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
                        i3 = arj.Theme_seekBarStyle;
                        break;
                    case at.g /*1*/:
                        i3 = 56;
                        break;
                    case at.i /*2*/:
                        i3 = 93;
                        break;
                    case at.o /*3*/:
                        i3 = 57;
                        break;
                    default:
                        i3 = arj.Theme_buttonStyleSmall;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\rU8J\u0016\n_8P\nDH/\\\u0015\nJ8\u007f\n\u0007\\8KE";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "<P<M\u0016*H-\u0019$\u001e\\4V";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "<P<M\u0016*H-\u00193\u0002\\8V";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "<Y1U5\nH8K";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "<P<M\u0016*H-\u00193\u0004Q>\\E%W)\\\u0016";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "8]3M";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "<P<M\u0016*H-\u0019,\u0006Y:\\\u0016";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "8]3M";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "<P<M\u0016*H-\u00195\u0019W;P\t\u000e\u0018\rQ\n\u001fW.";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "8]3M";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "<P<M\u0016*H-\u0019!\u0004[(T\u0000\u0005L.";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "8]3M";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "&]9P\u0004";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "<P<M\u0016*H-\u0019&\nT1J";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "KK8Z\n\u0005\\.\u0015E\u000fQ/\u0019\u0016\u0002B8\u0019\t\u0002U4ME";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "EV2T\u0000\u000fQ<";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "KQ.\u0019\u000b\u0004L}XE\u000fQ/";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "K\\2\\\u0016KV2ME\u000e@4J\u0011";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "\rU8J\u0016\n_8P\nD[1\\\u0004\u0019~2U\u0001\u000eJ}";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "K]/K\n\u0019\u0018*Q\u0000\u0005\u00189\\\t\u000eL4W\u0002K";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "K[<WE\u0005W)\u0019\t\u0002K)\u0019\u0003\u0002T8J";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\rU8J\u0016\n_8P\nD[1\\\u0004\u0019~2U\u0001\u000eJ}";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "K^4U\u0000KU<@E\u0007Q+\\E\rW/\u0019";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\rU8J\u0016\n_8P\nD[1\\\u0004\u0019~2U\u0001\u000eJ}";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "\rU8J\u0016\n_8P\nD[1\\\u0004\u0019~2U\u0001\u000eJ}";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "\rU8J\u0016\n_8P\nD[1\\\u0004\u0019~2U\u0001\u000eJ}";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "K\\8U\u0000\u001f]9\u0019";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "\rU8J\u0016\n_8P\nD[1\\\u0004\u0019~2U\u0001\u000eJ}";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "&]9P\u0004";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "\u0012A$@\u0012\u001c";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    z = strArr3;
                    g = new SimpleDateFormat(z[31], Locale.US);
                    return;
                default:
                    strArr2[i] = str;
                    str = "EV2T\u0000\u000fQ<";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File a(byte r6, int r7, boolean r8) {
        /*
        r5 = 1;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = h;
        if (r0 != 0) goto L_0x000a;
    L_0x0007:
        a();
    L_0x000a:
        r0 = 2;
        if (r6 != r0) goto L_0x0029;
    L_0x000d:
        if (r7 != r5) goto L_0x0023;
    L_0x000f:
        r0 = new java.io.File;
        r2 = a;
        r3 = g;
        r4 = new java.util.Date;
        r4.<init>();
        r3 = r3.format(r4);
        r0.<init>(r2, r3);
        if (r1 == 0) goto L_0x0051;
    L_0x0023:
        if (r8 == 0) goto L_0x0056;
    L_0x0025:
        r0 = k;
    L_0x0027:
        if (r1 == 0) goto L_0x0051;
    L_0x0029:
        if (r6 != r5) goto L_0x0031;
    L_0x002b:
        if (r8 == 0) goto L_0x0059;
    L_0x002d:
        r0 = n;
    L_0x002f:
        if (r1 == 0) goto L_0x0051;
    L_0x0031:
        r0 = 3;
        if (r6 != r0) goto L_0x003a;
    L_0x0034:
        if (r8 == 0) goto L_0x005c;
    L_0x0036:
        r0 = m;
    L_0x0038:
        if (r1 == 0) goto L_0x0051;
    L_0x003a:
        r0 = 9;
        if (r6 != r0) goto L_0x0044;
    L_0x003e:
        if (r8 == 0) goto L_0x005f;
    L_0x0040:
        r0 = i;
    L_0x0042:
        if (r1 == 0) goto L_0x0051;
    L_0x0044:
        r0 = new java.io.File;
        r1 = com.whatsapp.App.a3;
        r2 = z;
        r3 = 30;
        r2 = r2[r3];
        r0.<init>(r1, r2);
    L_0x0051:
        r0 = a(r0, r8);
        return r0;
    L_0x0056:
        r0 = j;
        goto L_0x0027;
    L_0x0059:
        r0 = b;
        goto L_0x002f;
    L_0x005c:
        r0 = c;
        goto L_0x0038;
    L_0x005f:
        r0 = d;
        goto L_0x0042;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.dg.a(byte, int, boolean):java.io.File");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(java.io.File r17, long r18, long r20) {
        /*
        r5 = com.whatsapp.DialogToastActivity.f;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 27;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r17;
        r2 = r2.append(r0);
        r3 = z;
        r4 = 24;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r6 = r18 / r6;
        r2 = r2.append(r6);
        r3 = z;
        r4 = 16;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r20;
        r2 = r2.append(r0);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        if (r17 == 0) goto L_0x0048;
    L_0x0042:
        r2 = r17.exists();
        if (r2 != 0) goto L_0x0070;
    L_0x0048:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 23;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r17;
        r2 = r2.append(r0);
        r3 = z;
        r4 = 19;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.toString();
        com.whatsapp.util.Log.e(r2);
        r2 = 0;
    L_0x006f:
        return r2;
    L_0x0070:
        r2 = r17.isDirectory();
        if (r2 != 0) goto L_0x009e;
    L_0x0076:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 26;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r17;
        r2 = r2.append(r0);
        r3 = z;
        r4 = 18;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.toString();
        com.whatsapp.util.Log.e(r2);
        r2 = 0;
        goto L_0x006f;
    L_0x009e:
        r6 = r17.listFiles();
        if (r6 != 0) goto L_0x00cc;
    L_0x00a4:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 25;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r17;
        r2 = r2.append(r0);
        r3 = z;
        r4 = 22;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.toString();
        com.whatsapp.util.Log.e(r2);
        r2 = 0;
        goto L_0x006f;
    L_0x00cc:
        r2 = new com.whatsapp.a_a;
        r2.<init>();
        java.util.Arrays.sort(r6, r2);
        r2 = java.lang.System.currentTimeMillis();
        r8 = r2 - r18;
        r7 = r6.length;
        r2 = 0;
        r4 = r2;
        r2 = r20;
    L_0x00df:
        if (r4 >= r7) goto L_0x0168;
    L_0x00e1:
        r10 = r6[r4];
        r12 = r10.length();
        r11 = r10.getName();
        r14 = z;
        r15 = 17;
        r14 = r14[r15];
        r11 = r11.equals(r14);
        if (r11 == 0) goto L_0x00f9;
    L_0x00f7:
        if (r5 == 0) goto L_0x0164;
    L_0x00f9:
        r14 = r10.lastModified();
        r11 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1));
        if (r11 < 0) goto L_0x0108;
    L_0x0101:
        r11 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1));
        if (r11 > 0) goto L_0x0108;
    L_0x0105:
        r2 = r2 - r12;
        if (r5 == 0) goto L_0x0164;
    L_0x0108:
        r11 = r10.delete();
        if (r11 == 0) goto L_0x013a;
    L_0x010e:
        r11 = new java.lang.StringBuilder;
        r11.<init>();
        r12 = z;
        r13 = 20;
        r12 = r12[r13];
        r11 = r11.append(r12);
        r0 = r17;
        r11 = r11.append(r0);
        r12 = z;
        r13 = 28;
        r12 = r12[r13];
        r11 = r11.append(r12);
        r11 = r11.append(r10);
        r11 = r11.toString();
        com.whatsapp.util.Log.i(r11);
        if (r5 == 0) goto L_0x0164;
    L_0x013a:
        r11 = new java.lang.StringBuilder;
        r11.<init>();
        r12 = z;
        r13 = 29;
        r12 = r12[r13];
        r11 = r11.append(r12);
        r0 = r17;
        r11 = r11.append(r0);
        r12 = z;
        r13 = 21;
        r12 = r12[r13];
        r11 = r11.append(r12);
        r10 = r11.append(r10);
        r10 = r10.toString();
        com.whatsapp.util.Log.e(r10);
    L_0x0164:
        r4 = r4 + 1;
        if (r5 == 0) goto L_0x00df;
    L_0x0168:
        r2 = 1;
        goto L_0x006f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.dg.a(java.io.File, long, long):boolean");
    }

    public static File b() {
        return new File(App.a3, z[0]);
    }

    public static File h() {
        if (!h) {
            a();
        }
        return f;
    }

    private static File a(File file, boolean z) {
        int i = 0;
        try {
            if (file.exists()) {
                if (file.isFile()) {
                    file.delete();
                } else if (file.isDirectory()) {
                    i = 1;
                }
            }
            if (i == 0) {
                try {
                    file.mkdirs();
                } catch (IOException e) {
                    throw e;
                }
            }
            if (z) {
                File file2 = new File(file, z[1]);
                if (!file2.exists()) {
                    try {
                        file2.createNewFile();
                    } catch (IOException e2) {
                        Log.e(z[2] + file + " " + e2.toString());
                    }
                }
            }
            return file;
        } catch (IOException e22) {
            throw e22;
        } catch (IOException e222) {
            throw e222;
        }
    }

    public static File j() {
        if (!h) {
            a();
        }
        return a(l);
    }

    public static File d() {
        if (!h) {
            a();
        }
        return a(o);
    }
}
