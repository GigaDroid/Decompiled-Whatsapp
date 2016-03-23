import com.whatsapp.arj;
import com.whatsapp.l5;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class a {
    private static final HashSet A;
    private static final Pattern B;
    private static final String[] C;
    private static final HashSet a;
    static boolean d;
    private static final HashSet h;
    private static final HashSet n;
    private static final Pattern s;
    static String z;
    private long b;
    private long c;
    protected HashSet e;
    private long f;
    protected BufferedReader g;
    private long i;
    private int j;
    protected k k;
    private long l;
    private boolean m;
    protected String o;
    private long p;
    private long q;
    protected final String r;
    private long t;
    private long u;
    private long v;
    private long w;
    private long x;
    private String y;

    protected String f() {
        z = null;
        z = c();
        if (z == null) {
            throw new d(C[42]);
        } else if (z.trim().length() <= 0) {
            return null;
        } else {
            d = true;
            return z;
        }
    }

    protected String b(char c) {
        if (c == '\\' || c == ';' || c == ':' || c == ',') {
            return String.valueOf(c);
        }
        return null;
    }

    protected void i(String str) {
        int i = 0;
        boolean z = q.h;
        String[] split = str.split("-");
        if (split.length > 2) {
            throw new d(C[4] + str + "\"");
        }
        String str2 = split[0];
        int length = str2.length();
        int i2 = 0;
        while (i2 < length) {
            if (a(str2.charAt(i2))) {
                i2++;
                if (z) {
                    break;
                }
            }
            throw new d(C[2] + str + "\"");
        }
        if (split.length > 1) {
            String str3 = split[1];
            int length2 = str3.length();
            while (i < length2) {
                if (a(str3.charAt(i))) {
                    i++;
                    if (z) {
                        break;
                    }
                }
                throw new d(C[3] + str + "\"");
            }
        }
        if (this.k != null) {
            this.k.e(C[1]);
            this.k.b(str);
        }
    }

    protected void g(String str) {
        if (!(A.contains(str) || str.startsWith(C[47]) || this.e.contains(str))) {
            this.e.add(str);
            Log.w(C[48] + str);
        }
        if (this.k != null) {
            this.k.e(C[49]);
            this.k.b(str);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected boolean a(boolean r9) {
        /*
        r8 = this;
        r7 = 2;
        r1 = 1;
        r0 = 0;
    L_0x0003:
        r2 = r8.c();
        if (r2 != 0) goto L_0x000a;
    L_0x0009:
        return r0;
    L_0x000a:
        r3 = r2.trim();
        r3 = r3.length();
        if (r3 <= 0) goto L_0x0003;
    L_0x0014:
        r3 = ":";
        r3 = r2.split(r3, r7);
        r4 = r3.length;
        if (r4 != r7) goto L_0x0044;
    L_0x001e:
        r4 = r3[r0];
        r4 = r4.trim();
        r5 = C;
        r6 = 73;
        r5 = r5[r6];
        r4 = r4.equalsIgnoreCase(r5);
        if (r4 == 0) goto L_0x0044;
    L_0x0030:
        r3 = r3[r1];
        r3 = r3.trim();
        r4 = C;
        r5 = 77;
        r4 = r4[r5];
        r3 = r3.equalsIgnoreCase(r4);
        if (r3 == 0) goto L_0x0044;
    L_0x0042:
        r0 = r1;
        goto L_0x0009;
    L_0x0044:
        if (r9 != 0) goto L_0x0074;
    L_0x0046:
        r1 = r8.j;
        if (r1 <= 0) goto L_0x004d;
    L_0x004a:
        r8.y = r2;
        goto L_0x0009;
    L_0x004d:
        r0 = new d;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = C;
        r4 = 74;
        r3 = r3[r4];
        r1 = r1.append(r3);
        r1 = r1.append(r2);
        r2 = C;
        r3 = 75;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0074:
        if (r9 != 0) goto L_0x0003;
    L_0x0076:
        r0 = new d;
        r1 = C;
        r2 = 76;
        r1 = r1[r2];
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a(boolean):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a(boolean r8, boolean r9) {
        /*
        r7 = this;
        r6 = 2;
        r1 = 0;
        r2 = q.h;
    L_0x0004:
        if (r8 == 0) goto L_0x000a;
    L_0x0006:
        r0 = r7.y;
        if (r2 == 0) goto L_0x0026;
    L_0x000a:
        r0 = r7.c();
        if (r0 != 0) goto L_0x001c;
    L_0x0010:
        r0 = new d;
        r1 = C;
        r2 = 31;
        r1 = r1[r2];
        r0.<init>(r1);
        throw r0;
    L_0x001c:
        r3 = r0.trim();
        r3 = r3.length();
        if (r3 <= 0) goto L_0x000a;
    L_0x0026:
        r3 = ":";
        r0 = r0.split(r3, r6);
        r3 = r0.length;
        if (r3 != r6) goto L_0x0056;
    L_0x0030:
        r3 = r0[r1];
        r3 = r3.trim();
        r4 = C;
        r5 = 33;
        r4 = r4[r5];
        r3 = r3.equalsIgnoreCase(r4);
        if (r3 == 0) goto L_0x0056;
    L_0x0042:
        r3 = 1;
        r0 = r0[r3];
        r0 = r0.trim();
        r3 = C;
        r4 = 34;
        r3 = r3[r4];
        r0 = r0.equalsIgnoreCase(r3);
        if (r0 == 0) goto L_0x0056;
    L_0x0055:
        return;
    L_0x0056:
        if (r9 != 0) goto L_0x007e;
    L_0x0058:
        r0 = new d;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = C;
        r3 = 32;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r7.y;
        r1 = r1.append(r2);
        r2 = "\"";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x007e:
        if (r9 == 0) goto L_0x0055;
    L_0x0080:
        r8 = r1;
        goto L_0x0004;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a(boolean, boolean):void");
    }

    protected void a() {
        boolean z = q.h;
        if (this.k != null) {
            long currentTimeMillis = System.currentTimeMillis();
            this.k.e();
            this.f = (System.currentTimeMillis() - currentTimeMillis) + this.f;
        }
        boolean d = d();
        if (!(this.k == null || d)) {
            currentTimeMillis = System.currentTimeMillis();
            this.k.c();
            this.w = (System.currentTimeMillis() - currentTimeMillis) + this.w;
        }
        while (!d) {
            if (this.k != null) {
                currentTimeMillis = System.currentTimeMillis();
                this.k.e();
                this.f = (System.currentTimeMillis() - currentTimeMillis) + this.f;
            }
            d = d();
            if (!(this.k == null || d)) {
                currentTimeMillis = System.currentTimeMillis();
                this.k.c();
                this.w = (System.currentTimeMillis() - currentTimeMillis) + this.w;
                if (z) {
                    return;
                }
            }
        }
    }

    protected void m(String str) {
        if (n(str) || str.startsWith(C[51])) {
            if (this.k != null) {
                this.k.e(C[52]);
                this.k.b(str);
            }
            this.o = str;
            if (!q.h) {
                return;
            }
        }
        throw new d(C[50] + str + "\"");
    }

    protected boolean d(String str) {
        if (!(n.contains(str.toUpperCase()) || str.startsWith(C[43]) || this.e.contains(str))) {
            this.e.add(str);
            Log.w(C[44] + str);
        }
        return true;
    }

    protected void e(String str) {
        if (a.contains(str.toUpperCase()) || str.startsWith(C[27])) {
            if (this.k != null) {
                this.k.e(C[29]);
                this.k.b(str);
                if (!q.h) {
                    return;
                }
            }
            return;
        }
        throw new d(C[28] + str + "\"");
    }

    protected String k(String str) {
        boolean z = q.h;
        if (!str.trim().endsWith("=")) {
            return str;
        }
        String c;
        int length = str.length() - 1;
        do {
        } while (str.charAt(length) != '=');
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str.substring(0, length + 1));
        stringBuilder.append(C[55]);
        do {
            c = c();
            if (c != null) {
                if (!c.trim().endsWith("=")) {
                    break;
                }
                int length2 = c.length() - 1;
                do {
                } while (c.charAt(length2) != '=');
                stringBuilder.append(c.substring(0, length2 + 1));
                stringBuilder.append(C[53]);
            } else {
                throw new d(C[54]);
            }
        } while (!z);
        stringBuilder.append(c);
        return stringBuilder.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void f(java.lang.String r8) {
        /*
        r7 = this;
        r3 = 2;
        r6 = 0;
        r0 = q.h;
        r1 = "=";
        r1 = r8.split(r1, r3);
        r2 = r1.length;
        if (r2 != r3) goto L_0x00b5;
    L_0x000e:
        r2 = r1[r6];
        r2 = r2.trim();
        r3 = 1;
        r3 = r1[r3];
        r3 = r3.trim();
        r4 = C;
        r5 = 8;
        r4 = r4[r5];
        r4 = r2.equalsIgnoreCase(r4);
        if (r4 == 0) goto L_0x002c;
    L_0x0027:
        r7.g(r3);
        if (r0 == 0) goto L_0x00b3;
    L_0x002c:
        r4 = C;
        r5 = 10;
        r4 = r4[r5];
        r4 = r2.equals(r4);
        if (r4 == 0) goto L_0x003d;
    L_0x0038:
        r7.e(r3);
        if (r0 == 0) goto L_0x00b3;
    L_0x003d:
        r4 = C;
        r5 = 5;
        r4 = r4[r5];
        r4 = r2.equals(r4);
        if (r4 == 0) goto L_0x004d;
    L_0x0048:
        r7.m(r3);
        if (r0 == 0) goto L_0x00b3;
    L_0x004d:
        r4 = C;
        r5 = 6;
        r4 = r4[r5];
        r4 = r2.equals(r4);
        if (r4 == 0) goto L_0x005d;
    L_0x0058:
        r7.c(r3);
        if (r0 == 0) goto L_0x00b3;
    L_0x005d:
        r4 = C;
        r5 = 11;
        r4 = r4[r5];
        r4 = r2.equals(r4);
        if (r4 == 0) goto L_0x006e;
    L_0x0069:
        r7.i(r3);
        if (r0 == 0) goto L_0x00b3;
    L_0x006e:
        r4 = C;
        r5 = 9;
        r4 = r4[r5];
        r4 = r2.startsWith(r4);
        if (r4 == 0) goto L_0x007f;
    L_0x007a:
        r7.c(r2, r3);
        if (r0 == 0) goto L_0x00b3;
    L_0x007f:
        r4 = C;
        r5 = 12;
        r4 = r4[r5];
        r4 = r2.equalsIgnoreCase(r4);
        if (r4 == 0) goto L_0x0090;
    L_0x008b:
        r7.b(r3);
        if (r0 == 0) goto L_0x00b3;
    L_0x0090:
        r0 = new d;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = C;
        r4 = 7;
        r3 = r3[r4];
        r1 = r1.append(r3);
        r1 = r1.append(r2);
        r2 = "\"";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x00b3:
        if (r0 == 0) goto L_0x00ba;
    L_0x00b5:
        r0 = r1[r6];
        r7.g(r0);
    L_0x00ba:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f(java.lang.String):void");
    }

    protected boolean d() {
        this.o = C[21];
        String g = g();
        long currentTimeMillis = System.currentTimeMillis();
        String[] o = o(g);
        if (o == null) {
            return true;
        }
        if (o.length != 2) {
            throw new d(C[25] + g + "\"");
        }
        g = o[0].toUpperCase();
        String str = o[1];
        this.p = (System.currentTimeMillis() - currentTimeMillis) + this.p;
        if (this.k != null) {
            this.k.c(g);
        }
        if (g.equals(C[16]) || g.equals(C[15]) || g.equals("N")) {
            currentTimeMillis = System.currentTimeMillis();
            a(g, str);
            this.b += System.currentTimeMillis() - currentTimeMillis;
            return false;
        } else if (g.equals(C[17])) {
            j(str);
            return false;
        } else if (!d(g)) {
            throw new d(C[23] + g + "\"");
        } else if (g.equals(C[22])) {
            if (str.equals(C[18])) {
                throw new e(C[20]);
            }
            throw new d(C[24] + str);
        } else if (!g.equals(C[14]) || str.equals(b())) {
            currentTimeMillis = System.currentTimeMillis();
            b(g, str);
            this.q += System.currentTimeMillis() - currentTimeMillis;
            return false;
        } else {
            throw new f(C[26] + str + C[19] + b());
        }
    }

    protected String a(String str) {
        boolean z = q.h;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        do {
            String c = c();
            if (c != null) {
                if (c.length() == 0 && !z) {
                    break;
                }
                stringBuilder.append(c);
            } else {
                throw new d(C[41]);
            }
        } while (!z);
        return stringBuilder.toString();
    }

    protected void b(String str) {
        if (this.k != null) {
            this.k.e(C[64]);
            this.k.b(str);
        }
    }

    protected String b() {
        return C[78];
    }

    static {
        String[] strArr = new String[161];
        String str = "\u0016?HK]!>\tM[ zFN\u0015&/ONP6t";
        boolean z = true;
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
                        i3 = 68;
                        break;
                    case at.g /*1*/:
                        i3 = 90;
                        break;
                    case at.i /*2*/:
                        i3 = 41;
                        break;
                    case at.o /*3*/:
                        i3 = 40;
                        break;
                    default:
                        i3 = 53;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\r4_IY->\tdT*=\\IR!`\t\n";
                    i = 2;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\r4_IY->\tdT*=\\IR!`\t\n";
                    i = 3;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\r4_IY->\tdT*=\\IR!`\t\n";
                    i = 4;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0001\u0014jgq\r\u0014n";
                    z = true;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0007\u0012hzf\u0001\u000e";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u00114BFZ34\t\\L4?\t\n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0010\u0003ym";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u001cw";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u0012\u001be}p";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\b\u001bgo`\u0005\u001dl";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u0013\u001b`l";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u0007\u0012hzf\u0001\u000e";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u0012\u001f{{|\u000b\u0014";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\u000b\bn";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u0005\u001e{";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\u0005\u001dlfa";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\u0012\u0019hzq";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "d{\u0014\b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "\u00102@[\u00152\u0019HZQd2H[\u0015*?Z\\P z_kT6>\tLT0;\tA[d3]\u0006";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "|\u0018`|";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "\u0006\u001fna{";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\u00114BFZ34\tXG+*LZA=zGIX!`\t\n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "\u00114BFZ34\tjp\u0003\u0013g\bA=*L\u0012\u0015";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\r4_IY->\tD\\*?\t\n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "\r4JGX4;]AW(?\t^P6)@G[~z";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "\u001cw";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "\u00114BFZ34\t^T(/L\b\u0017";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "\u0012\u001be}p";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "\u0012\u0019hzq";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "\u0001\"YMV0?M\bp\n\u001e\u0013~v\u0005\bm\bB%)\tFZ0zOG@*>\u0007";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "\u0001\u0014m\u0012c\u0007\u001b{l\u0015eg\t\n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "\u0001\u0014m";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "\u0012\u0019hzq";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "\u0004)\u0007_]%.ZIE4tGMA";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "3;@L";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "0#YM";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "\u0004)\u0007_]%.ZIE4tGMA";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "3;@L";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "\u001cwhjy%8LD";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "\u00023EM\u0015!4MMQd>\\Z\\*=\tXT6)@FRd\u0018h{prn\tJ\\*;[Q";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "\u0016?HK]!>\tM[ zFN\u0015&/ONP6t";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "\u001cw";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "\u0014(FXP6.P\b[%7L\b@*)\\XE+(]MQd8P\bC\u0007;[L\u0015vt\u0018\u0012\u0015";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = ");]K]!(\t[]+/EL\u0015,;_M\u0015\"5\\FQd";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "d?G\\G=z@F\u00152\u0019HZQd<FZ\u0015(3GM\u000fd";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "\u001cw";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "\u0010#YM\u001514Z]E45[\\P zKQ\u00152\u0019HZQdh\u0007\u0019\u000fd";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "\u0010\u0003ym";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "\u00114BFZ34\tM['5MA[#z\u000b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "\u001cw";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "\u0001\u0014jgq\r\u0014n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "IP";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "\u00023EM\u0015!4MMQd>\\Z\\*=\tXT6)@FRd+\\GA!>\u0004XG-4]IW(?\t{A63GO";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "IP";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "-.LE";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "\u0001\u0014m";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "\u0001\u0014m";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "\r4_IY->\tD\\*?\u0013\b\u0017";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "lW#T88PU\"8m";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "\u0005\u001e{";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "0#YM";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "\u001cwhjt\u0000\b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "3;`L";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "s\u0018`|";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "\u0006\u001bzm\u0003p";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "\u001cw";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "\u0015\u000ff|p\u0000wyz|\n\u000ehjy\u0001";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    strArr2[i] = str;
                    i = 69;
                    str = "\u00102L\bP*9FL\\*=\t][7/YXZ6.LL\u0015&#\t^v%(M\bF4?J\u0012\u0015f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    strArr2[i] = str;
                    i = 70;
                    str = "ft";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeight /*69*/:
                    strArr2[i] = str;
                    i = 71;
                    str = "29HZQ4;[[P6uF]Ai5O\u0005X!7FZLd";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightSmall /*70*/:
                    strArr2[i] = str;
                    i = 72;
                    str = "|\u0018`|";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightLarge /*71*/:
                    strArr2[i] = str;
                    i = 73;
                    str = "\u0006\u001fna{";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingLeft /*72*/:
                    strArr2[i] = str;
                    i = 74;
                    str = "\u0001\"YMV0?M\bf0(@FRdxkmr\r\u0014\u0013~v\u0005\bm\n\u0015 3M\b[+.\tKZ)?\t\u0000|*)]MT v\t\n";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingRight /*73*/:
                    strArr2[i] = str;
                    i = 75;
                    str = "fzJIX!s";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropDownListViewStyle /*74*/:
                    strArr2[i] = str;
                    i = 76;
                    str = "\u0016?HK]!>\t_]!(L\bX1)]\b[+.\tJPd(LIV,?M\u0006";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPopupWindowStyle /*75*/:
                    strArr2[i] = str;
                    i = 77;
                    str = "\u0012\u0019hzq";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItem /*76*/:
                    strArr2[i] = str;
                    i = 78;
                    str = "vt\u0018";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItemSmall /*77*/:
                    strArr2[i] = str;
                    i = 79;
                    str = "|\u0018`|";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelBackground /*78*/:
                    strArr2[i] = str;
                    i = 80;
                    str = "\u0005\u001dlfad\n[GE!(]Q\u0015-)\tFZ0zZ]E45[\\P t";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListWidth /*79*/:
                    strArr2[i] = str;
                    i = 81;
                    str = "\u0015\u000ff|p\u0000wyz|\n\u000ehjy\u0001";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListTheme /*80*/:
                    strArr2[i] = str;
                    i = 82;
                    str = "\u0005\u001e{";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listChoiceBackgroundIndicator /*81*/:
                    strArr2[i] = str;
                    i = 83;
                    str = "\u0015\u000ff|p\u0000wyz|\n\u000ehjy\u0001";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimary /*82*/:
                    strArr2[i] = str;
                    i = 84;
                    str = "\u0014\u0019d";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimaryDark /*83*/:
                    strArr2[i] = str;
                    i = 85;
                    str = "\u0010\u0000";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorAccent /*84*/:
                    strArr2[i] = str;
                    i = 86;
                    str = "\u0014\u0013j|";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlNormal /*85*/:
                    strArr2[i] = str;
                    i = 87;
                    str = "\u0007\u0013z";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlActivated /*86*/:
                    strArr2[i] = str;
                    i = 88;
                    str = "\r\u0018det\r\u0016";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlHighlight /*87*/:
                    strArr2[i] = str;
                    i = 89;
                    str = "\u0015\u000e`ep";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorButtonNormal /*88*/:
                    strArr2[i] = str;
                    i = 90;
                    str = "\u0014\u0015z|t\b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorSwitchThumbNormal /*89*/:
                    strArr2[i] = str;
                    i = 91;
                    str = "\u0007\u0013m";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_controlBackground /*90*/:
                    strArr2[i] = str;
                    i = 92;
                    str = "\r\u0014ea{\u0001";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogStyle /*91*/:
                    strArr2[i] = str;
                    i = 93;
                    str = "\u0007\u0015g|p\n\u000e\u0004aq";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogButtonGroupStyle /*92*/:
                    strArr2[i] = str;
                    i = 94;
                    str = "\t\u001b`dp\u0016";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogCenterButtons /*93*/:
                    strArr2[i] = str;
                    i = 95;
                    str = "\u0006\u001ehq";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogTheme /*94*/:
                    strArr2[i] = str;
                    i = 96;
                    str = "\u0012\u001f{{|\u000b\u0014";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorAlertDialogListItem /*95*/:
                    strArr2[i] = str;
                    i = 97;
                    str = "s\u0018`|";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarPositiveButtonStyle /*96*/:
                    strArr2[i] = str;
                    i = 98;
                    str = "\t\u001f}";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNegativeButtonStyle /*97*/:
                    strArr2[i] = str;
                    i = 99;
                    str = "\t\tn";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNeutralButtonStyle /*98*/:
                    strArr2[i] = str;
                    i = 100;
                    str = "\u0017\u0015|fq";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_autoCompleteTextViewStyle /*99*/:
                    strArr2[i] = str;
                    i = arj.Theme_buttonStyleSmall;
                    str = "\u0014\u001bnmg";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyle /*100*/:
                    strArr2[i] = str;
                    i = arj.Theme_checkboxStyle;
                    str = "\u0014\u001b{kp\b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyleSmall /*101*/:
                    strArr2[i] = str;
                    i = arj.Theme_checkedTextViewStyle;
                    str = "\u0013\u0015{c";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_checkboxStyle /*102*/:
                    strArr2[i] = str;
                    i = arj.Theme_editTextStyle;
                    str = "\u0014\u0015~mg\u0017\u0012hzp";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_checkedTextViewStyle /*103*/:
                    strArr2[i] = str;
                    i = arj.Theme_radioButtonStyle;
                    str = "\u0012\u0015`kp";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextStyle /*104*/:
                    strArr2[i] = str;
                    i = arj.Theme_ratingBarStyle;
                    str = "\t\u0015mmx";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_radioButtonStyle /*105*/:
                    strArr2[i] = str;
                    i = arj.Theme_seekBarStyle;
                    str = "\u0005\f`";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_ratingBarStyle /*106*/:
                    strArr2[i] = str;
                    i = arj.Theme_spinnerStyle;
                    str = "\u000f\u001fp";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_seekBarStyle /*107*/:
                    strArr2[i] = str;
                    i = arj.Theme_switchStyle;
                    str = "\u0006\u0018z";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerStyle /*108*/:
                    strArr2[i] = str;
                    i = 110;
                    str = "\u0011\u0013m";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_switchStyle /*109*/:
                    strArr2[i] = str;
                    i = 111;
                    str = "\u0005\u0013on";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 112;
                    str = "\u0006\u0017y";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 113;
                    str = "\u001cn\u0019\u0018";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 114;
                    str = "\u001co\u0019\u0011";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 115;
                    str = "|\u0018`|";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 116;
                    str = "\u0005\u0015e";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 117;
                    str = "\b\u001bkmy";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 118;
                    str = "\u0003\u001ff";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 119;
                    str = "\u0010\u0013on";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 120;
                    str = "\u0014\bln";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 121;
                    str = "\r\u0014}d";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 122;
                    str = "\u0014\u001dy";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 123;
                    str = "\u0012\u0013mmz";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 124;
                    str = "\u0007\u001b{";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 125;
                    str = "\r\u0014}mg\n\u001f}";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 126;
                    str = "\u0013\u0017o";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 127;
                    str = "\u0006\u001bzm\u0003p";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 128;
                    str = "\u0014\u0012f|z";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 129;
                    str = "\u0010\u0013}dp";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 130;
                    str = "\u0014\u001eo";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 131;
                    str = "\u0014\u0017k";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 132;
                    str = "\u0014\bfl|\u0003\u0003";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 133;
                    str = "\f\u0015dm";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 134;
                    str = "\u000e\nlo";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 135;
                    str = "\u0016\u0015em";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 136;
                    str = "\u0011\be";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 137;
                    str = "\u0016\u001f\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 138;
                    str = "\u0007\u001dd";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 139;
                    str = "\u0000\u0015d";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 140;
                    str = "\u0005\nydp\b\u0013gc";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 141;
                    str = "\u0013\u001b\u007fm";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 142;
                    str = "\u0001\u0017hay";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 143;
                    str = "\u0011\be";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 144;
                    str = "\t\nlo";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 145;
                    str = "\u0014\t";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 146;
                    str = "\u0000\u0013k";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 147;
                    str = "\r\tmf";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 148;
                    str = "\t\u0019`et\r\u0016";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 149;
                    str = "\u0003\u0013o";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 150;
                    str = "\u0006\u001fna{";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 151;
                    str = "\u0002\u001bq";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 152;
                    str = "\u0002\u0014";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 153;
                    str = "\u0001\rfzy\u0000";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 154;
                    str = "\u0007\u001fed";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 155;
                    str = "\u0010\u001fe";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 156;
                    str = "\u0005\u000e}et\r\u0016";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 157;
                    str = "\b\u0015ng";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 158;
                    str = "\n\u0015}m";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 159;
                    str = "\u0010\u0016q";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 160;
                    str = "\t\nlo\u0007";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    C = strArr3;
                    A = new HashSet(Arrays.asList(new String[]{C[139], C[121], C[90], C[arj.Theme_checkboxStyle], C[133], C[arj.Theme_checkedTextViewStyle], C[120], C[arj.Theme_radioButtonStyle], C[151], C[99], C[154], C[arj.Theme_buttonStyleSmall], C[arj.Theme_switchStyle], C[arj.Theme_ratingBarStyle], C[124], C[147], C[123], C[116], C[140], C[156], C[87], C[153], C[125], C[88], C[148], C[arj.Theme_editTextStyle], C[132], C[159], C[113], C[149], C[138], C[126], C[112], C[98], C[131], C[146], C[86], C[119], C[130], C[145], C[134], C[89], C[144], C[160], C[arj.Theme_seekBarStyle], C[141], C[111], C[84], C[114], C[122]}));
                    a = new HashSet(Arrays.asList(new String[]{C[92], C[143], C[93], C[91]}));
                    n = new HashSet(Arrays.asList(new String[]{C[150], C[157], C[128], C[117], C[152], C[129], C[100], C[96], C[155], C[142], C[85], C[118], C[158], C[136], C[95], C[135], C[137], C[110], C[arj.Theme_spinnerStyle], C[94]}));
                    h = new HashSet(Arrays.asList(new String[]{C[97], C[115], C[83], C[127], "B"}));
                    String str2 = "0#YM\blt\u0003\u0017\u001c\u001f`\u0012u";
                    z = true;
                    while (true) {
                        char[] toCharArray2 = str2.toCharArray();
                        int length2 = toCharArray2.length;
                        char[] cArr2 = toCharArray2;
                        for (int i4 = 0; length2 > i4; i4++) {
                            int i5;
                            char c2 = cArr2[i4];
                            switch (i4 % 5) {
                                case v.m /*0*/:
                                    i5 = 68;
                                    break;
                                case at.g /*1*/:
                                    i5 = 90;
                                    break;
                                case at.i /*2*/:
                                    i5 = 41;
                                    break;
                                case at.o /*3*/:
                                    i5 = 40;
                                    break;
                                default:
                                    i5 = 53;
                                    break;
                            }
                            cArr2[i4] = (char) (i5 ^ c2);
                        }
                        str2 = new String(cArr2).intern();
                        switch (z) {
                            case v.m /*0*/:
                                s = Pattern.compile(str2);
                                d = false;
                                return;
                            default:
                                B = Pattern.compile(str2);
                                str2 = "3;@L\blt\u0003\u0017\u001c\u001f`\u0012u";
                                z = false;
                        }
                    }
                default:
                    strArr2[i] = str;
                    str = "\b\u001bgo`\u0005\u001dl";
                    i = 1;
                    strArr2 = strArr3;
                    z = false;
                    break;
            }
        }
    }

    protected String h(String str) {
        return str;
    }

    protected void a(String str, String[] strArr) {
        boolean z = q.h;
        if (str.contains(C[37]) && str.contains(C[39])) {
            g(a(B, str));
            String a = a(s, str);
            b(a);
            strArr[1] = l5.h(a + C[38]);
            if (!z) {
                return;
            }
        }
        if (str.contains(C[36])) {
            a = g();
            g(a.substring(a.lastIndexOf(":") + 1));
            a = a(s, str);
            b(a);
            strArr[1] = l5.h(a + C[35]);
            if (!z) {
                return;
            }
        }
        String g = g();
        if (g.substring(g.indexOf(".") + 1, g.lastIndexOf(":")).equals(C[40])) {
            g(g.substring(g.lastIndexOf(":") + 1));
        }
    }

    protected void c(String str) {
        if (this.k != null) {
            this.k.e(C[13]);
            this.k.b(str);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String l(java.lang.String r7) {
        /*
        r6 = this;
        r2 = q.h;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r1 = 64;
        r0 = ".";
        r0 = r7.indexOf(r0);
        r0 = r0 + 1;
    L_0x0012:
        r4 = r7.length();
        if (r0 >= r4) goto L_0x004c;
    L_0x0018:
        r4 = r7.charAt(r0);
        r5 = 65;
        if (r4 < r5) goto L_0x0035;
    L_0x0020:
        r4 = r7.charAt(r0);
        r5 = 90;
        if (r4 > r5) goto L_0x0035;
    L_0x0028:
        r1 = r7.charAt(r0);
        r3.append(r1);
        r1 = r7.charAt(r0);
        if (r2 == 0) goto L_0x0048;
    L_0x0035:
        r4 = r7.charAt(r0);
        r5 = 45;
        if (r4 != r5) goto L_0x004c;
    L_0x003d:
        r4 = 88;
        if (r1 != r4) goto L_0x004c;
    L_0x0041:
        r4 = r7.charAt(r0);
        r3.append(r4);
    L_0x0048:
        r0 = r0 + 1;
        if (r2 == 0) goto L_0x0012;
    L_0x004c:
        r0 = r3.toString();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.l(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected java.lang.String[] o(java.lang.String r14) {
        /*
        r13 = this;
        r12 = 59;
        r11 = 58;
        r3 = 2;
        r1 = 0;
        r2 = 1;
        r7 = q.h;
        r8 = r14.length();
        r4 = new java.lang.String[r3];
        r0 = C;
        r5 = 56;
        r0 = r0[r5];
        r0 = r14.startsWith(r0);
        if (r0 == 0) goto L_0x00f9;
    L_0x001b:
        r0 = ":";
        r5 = r14.split(r0);
        r0 = r5.length;
        if (r0 >= r3) goto L_0x0027;
    L_0x0025:
        r0 = 0;
    L_0x0026:
        return r0;
    L_0x0027:
        r0 = r5[r1];
        r0 = r13.l(r0);
        r4[r1] = r0;
        r0 = r5[r2];
        r6 = C;
        r8 = 60;
        r6 = r6[r8];
        r8 = "";
        r0 = r0.replaceAll(r6, r8);
        r4[r2] = r0;
        r0 = r4[r1];
        r6 = C;
        r8 = 61;
        r6 = r6[r8];
        r0 = r0.equals(r6);
        if (r0 == 0) goto L_0x00c7;
    L_0x004e:
        r0 = C;
        r6 = 62;
        r0 = r0[r6];
        r0 = r14.contains(r0);
        if (r0 == 0) goto L_0x00f6;
    L_0x005a:
        r0 = "=";
        r0 = r14.indexOf(r0);
        r0 = r0 + 1;
        r6 = ":";
        r6 = r14.indexOf(r6);
        r0 = r14.substring(r0, r6);
        r13.g(r0);
        r0 = r1;
    L_0x0072:
        r6 = r13.f();
        if (r6 == 0) goto L_0x00af;
    L_0x0078:
        r8 = C;
        r9 = 63;
        r8 = r8[r9];
        r8 = r6.contains(r8);
        if (r8 == 0) goto L_0x00af;
    L_0x0084:
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r9 = r4[r2];
        r8 = r8.append(r9);
        r9 = ";";
        r8 = r8.append(r9);
        r9 = ":";
        r9 = r6.lastIndexOf(r9);
        r9 = r9 + 1;
        r6 = r6.substring(r9);
        r6 = r8.append(r6);
        r6 = r6.toString();
        r4[r2] = r6;
        d = r1;
    L_0x00af:
        if (r0 == 0) goto L_0x00c5;
    L_0x00b1:
        r0 = r13.g();
        r1 = ":";
        r1 = r0.lastIndexOf(r1);
        r1 = r1 + 1;
        r0 = r0.substring(r1);
        r13.g(r0);
    L_0x00c5:
        if (r7 == 0) goto L_0x00f3;
    L_0x00c7:
        r0 = r5.length;
        if (r0 <= r3) goto L_0x00f0;
    L_0x00ca:
        r0 = r3;
    L_0x00cb:
        r1 = r5.length;
        if (r0 >= r1) goto L_0x00f0;
    L_0x00ce:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = r4[r2];
        r1 = r1.append(r3);
        r3 = ":";
        r1 = r1.append(r3);
        r3 = r5[r0];
        r1 = r1.append(r3);
        r1 = r1.toString();
        r4[r2] = r1;
        r0 = r0 + 1;
        if (r7 == 0) goto L_0x00cb;
    L_0x00f0:
        r13.a(r14, r4);
    L_0x00f3:
        r0 = r4;
        goto L_0x0026;
    L_0x00f6:
        r0 = r2;
        goto L_0x0072;
    L_0x00f9:
        r6 = r1;
        r0 = r1;
        r5 = r1;
    L_0x00fc:
        if (r6 >= r8) goto L_0x0109;
    L_0x00fe:
        r9 = r14.charAt(r6);
        switch(r5) {
            case 0: goto L_0x012b;
            case 1: goto L_0x018b;
            case 2: goto L_0x01be;
            default: goto L_0x0105;
        };
    L_0x0105:
        r6 = r6 + 1;
        if (r7 == 0) goto L_0x00fc;
    L_0x0109:
        r0 = new d;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = C;
        r2 = r2[r12];
        r1 = r1.append(r2);
        r1 = r1.append(r14);
        r2 = "\"";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x012b:
        if (r9 != r11) goto L_0x015a;
    L_0x012d:
        r0 = r14.substring(r0, r6);
        r3 = C;
        r5 = 57;
        r3 = r3[r5];
        r3 = r0.equalsIgnoreCase(r3);
        if (r3 == 0) goto L_0x0142;
    L_0x013d:
        r13.y = r14;
        r0 = 0;
        goto L_0x0026;
    L_0x0142:
        r4[r1] = r0;
        r0 = r8 + -1;
        if (r6 >= r0) goto L_0x0152;
    L_0x0148:
        r0 = r6 + 1;
        r0 = r14.substring(r0);
        r4[r2] = r0;
        if (r7 == 0) goto L_0x0157;
    L_0x0152:
        r0 = "";
        r4[r2] = r0;
    L_0x0157:
        r0 = r4;
        goto L_0x0026;
    L_0x015a:
        r10 = 46;
        if (r9 != r10) goto L_0x016f;
    L_0x015e:
        r0 = r14.substring(r0, r6);
        r10 = r13.k;
        if (r10 == 0) goto L_0x016b;
    L_0x0166:
        r10 = r13.k;
        r10.a(r0);
    L_0x016b:
        r0 = r6 + 1;
        if (r7 == 0) goto L_0x0105;
    L_0x016f:
        if (r9 != r12) goto L_0x0105;
    L_0x0171:
        r0 = r14.substring(r0, r6);
        r5 = C;
        r5 = r5[r11];
        r5 = r0.equalsIgnoreCase(r5);
        if (r5 == 0) goto L_0x0184;
    L_0x017f:
        r13.y = r14;
        r0 = 0;
        goto L_0x0026;
    L_0x0184:
        r4[r1] = r0;
        r0 = r6 + 1;
        if (r7 == 0) goto L_0x01c8;
    L_0x018a:
        r5 = r2;
    L_0x018b:
        r10 = 34;
        if (r9 != r10) goto L_0x0192;
    L_0x018f:
        if (r7 == 0) goto L_0x01c5;
    L_0x0191:
        r5 = r3;
    L_0x0192:
        if (r9 != r12) goto L_0x019f;
    L_0x0194:
        r0 = r14.substring(r0, r6);
        r13.f(r0);
        r0 = r6 + 1;
        if (r7 == 0) goto L_0x0105;
    L_0x019f:
        if (r9 != r11) goto L_0x0105;
    L_0x01a1:
        r0 = r14.substring(r0, r6);
        r13.f(r0);
        r0 = r8 + -1;
        if (r6 >= r0) goto L_0x01b6;
    L_0x01ac:
        r0 = r6 + 1;
        r0 = r14.substring(r0);
        r4[r2] = r0;
        if (r7 == 0) goto L_0x01bb;
    L_0x01b6:
        r0 = "";
        r4[r2] = r0;
    L_0x01bb:
        r0 = r4;
        goto L_0x0026;
    L_0x01be:
        r10 = 34;
        if (r9 != r10) goto L_0x0105;
    L_0x01c2:
        r5 = r2;
        goto L_0x0105;
    L_0x01c5:
        r5 = r3;
        goto L_0x0105;
    L_0x01c8:
        r5 = r2;
        goto L_0x0105;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.o(java.lang.String):java.lang.String[]");
    }

    public a() {
        this.k = null;
        this.o = null;
        this.r = C[79];
        this.e = new HashSet();
    }

    protected void c(String str, String str2) {
        if (this.k != null) {
            this.k.e(str);
            this.k.b(str2);
        }
    }

    protected void j(String str) {
        throw new d(C[80]);
    }

    protected String g() {
        if (d) {
            d = false;
            return z;
        }
        String c = c();
        if (c == null) {
            throw new d(C[0]);
        } else if (c.trim().length() <= 0) {
            return null;
        } else {
            return c;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void b(java.lang.String r9, java.lang.String r10) {
        /*
        r8 = this;
        r1 = q.h;
        r0 = r8.o;
        r2 = C;
        r3 = 68;
        r2 = r2[r3];
        r0 = r0.equalsIgnoreCase(r2);
        if (r0 == 0) goto L_0x0036;
    L_0x0010:
        r2 = java.lang.System.currentTimeMillis();
        r0 = r8.k(r10);
        r4 = r8.k;
        if (r4 == 0) goto L_0x0029;
    L_0x001c:
        r4 = new java.util.ArrayList;
        r4.<init>();
        r4.add(r0);
        r0 = r8.k;
        r0.a(r4);
    L_0x0029:
        r4 = r8.v;	 Catch:{ OutOfMemoryError -> 0x00f2 }
        r6 = java.lang.System.currentTimeMillis();	 Catch:{ OutOfMemoryError -> 0x00f2 }
        r2 = r6 - r2;
        r2 = r2 + r4;
        r8.v = r2;	 Catch:{ OutOfMemoryError -> 0x00f2 }
        if (r1 == 0) goto L_0x00f1;
    L_0x0036:
        r0 = r8.o;	 Catch:{ OutOfMemoryError -> 0x00f2 }
        r2 = C;	 Catch:{ OutOfMemoryError -> 0x00f2 }
        r3 = 66;
        r2 = r2[r3];	 Catch:{ OutOfMemoryError -> 0x00f2 }
        r0 = r0.equalsIgnoreCase(r2);	 Catch:{ OutOfMemoryError -> 0x00f2 }
        if (r0 != 0) goto L_0x004f;
    L_0x0044:
        r0 = r8.o;	 Catch:{ OutOfMemoryError -> 0x00f4 }
        r2 = "B";
        r0 = r0.equalsIgnoreCase(r2);	 Catch:{ OutOfMemoryError -> 0x00f4 }
        if (r0 == 0) goto L_0x0075;
    L_0x004f:
        r2 = java.lang.System.currentTimeMillis();
        r0 = r8.a(r10);	 Catch:{ OutOfMemoryError -> 0x00f6 }
        r4 = r8.k;	 Catch:{ OutOfMemoryError -> 0x00f6 }
        if (r4 == 0) goto L_0x0068;
    L_0x005b:
        r4 = new java.util.ArrayList;	 Catch:{ OutOfMemoryError -> 0x00f6 }
        r4.<init>();	 Catch:{ OutOfMemoryError -> 0x00f6 }
        r4.add(r0);	 Catch:{ OutOfMemoryError -> 0x00f6 }
        r0 = r8.k;	 Catch:{ OutOfMemoryError -> 0x00f6 }
        r0.a(r4);	 Catch:{ OutOfMemoryError -> 0x00f6 }
    L_0x0068:
        r4 = r8.u;	 Catch:{ OutOfMemoryError -> 0x0123 }
        r6 = java.lang.System.currentTimeMillis();	 Catch:{ OutOfMemoryError -> 0x0123 }
        r2 = r6 - r2;
        r2 = r2 + r4;
        r8.u = r2;	 Catch:{ OutOfMemoryError -> 0x0123 }
        if (r1 == 0) goto L_0x00f1;
    L_0x0075:
        r0 = r8.o;	 Catch:{ OutOfMemoryError -> 0x0125 }
        if (r0 == 0) goto L_0x00cd;
    L_0x0079:
        r0 = r8.o;	 Catch:{ OutOfMemoryError -> 0x0127 }
        r1 = C;	 Catch:{ OutOfMemoryError -> 0x0127 }
        r2 = 65;
        r1 = r1[r2];	 Catch:{ OutOfMemoryError -> 0x0127 }
        r0 = r0.equalsIgnoreCase(r1);	 Catch:{ OutOfMemoryError -> 0x0127 }
        if (r0 != 0) goto L_0x00cd;
    L_0x0087:
        r0 = r8.o;	 Catch:{ OutOfMemoryError -> 0x0129 }
        r1 = C;	 Catch:{ OutOfMemoryError -> 0x0129 }
        r2 = 72;
        r1 = r1[r2];	 Catch:{ OutOfMemoryError -> 0x0129 }
        r0 = r0.equalsIgnoreCase(r1);	 Catch:{ OutOfMemoryError -> 0x0129 }
        if (r0 != 0) goto L_0x00cd;
    L_0x0095:
        r0 = r8.o;	 Catch:{ OutOfMemoryError -> 0x012b }
        r0 = r0.toUpperCase();	 Catch:{ OutOfMemoryError -> 0x012b }
        r1 = C;	 Catch:{ OutOfMemoryError -> 0x012b }
        r2 = 67;
        r1 = r1[r2];	 Catch:{ OutOfMemoryError -> 0x012b }
        r0 = r0.startsWith(r1);	 Catch:{ OutOfMemoryError -> 0x012b }
        if (r0 != 0) goto L_0x00cd;
    L_0x00a7:
        r0 = new java.lang.StringBuilder;	 Catch:{ OutOfMemoryError -> 0x012b }
        r0.<init>();	 Catch:{ OutOfMemoryError -> 0x012b }
        r1 = C;	 Catch:{ OutOfMemoryError -> 0x012b }
        r2 = 69;
        r1 = r1[r2];	 Catch:{ OutOfMemoryError -> 0x012b }
        r0 = r0.append(r1);	 Catch:{ OutOfMemoryError -> 0x012b }
        r1 = r8.o;	 Catch:{ OutOfMemoryError -> 0x012b }
        r0 = r0.append(r1);	 Catch:{ OutOfMemoryError -> 0x012b }
        r1 = C;	 Catch:{ OutOfMemoryError -> 0x012b }
        r2 = 70;
        r1 = r1[r2];	 Catch:{ OutOfMemoryError -> 0x012b }
        r0 = r0.append(r1);	 Catch:{ OutOfMemoryError -> 0x012b }
        r0 = r0.toString();	 Catch:{ OutOfMemoryError -> 0x012b }
        com.whatsapp.util.Log.w(r0);	 Catch:{ OutOfMemoryError -> 0x012b }
    L_0x00cd:
        r0 = java.lang.System.currentTimeMillis();
        r2 = r8.k;
        if (r2 == 0) goto L_0x00e6;
    L_0x00d5:
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r8.h(r10);
        r2.add(r3);
        r3 = r8.k;
        r3.a(r2);
    L_0x00e6:
        r2 = r8.c;
        r4 = java.lang.System.currentTimeMillis();
        r0 = r4 - r0;
        r0 = r0 + r2;
        r8.c = r0;
    L_0x00f1:
        return;
    L_0x00f2:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x00f4 }
    L_0x00f4:
        r0 = move-exception;
        throw r0;
    L_0x00f6:
        r0 = move-exception;
        r4 = new java.lang.StringBuilder;	 Catch:{ OutOfMemoryError -> 0x0121 }
        r4.<init>();	 Catch:{ OutOfMemoryError -> 0x0121 }
        r5 = C;	 Catch:{ OutOfMemoryError -> 0x0121 }
        r6 = 71;
        r5 = r5[r6];	 Catch:{ OutOfMemoryError -> 0x0121 }
        r4 = r4.append(r5);	 Catch:{ OutOfMemoryError -> 0x0121 }
        r0 = r0.toString();	 Catch:{ OutOfMemoryError -> 0x0121 }
        r0 = r4.append(r0);	 Catch:{ OutOfMemoryError -> 0x0121 }
        r0 = r0.toString();	 Catch:{ OutOfMemoryError -> 0x0121 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ OutOfMemoryError -> 0x0121 }
        r0 = r8.k;	 Catch:{ OutOfMemoryError -> 0x0121 }
        if (r0 == 0) goto L_0x0068;
    L_0x0119:
        r0 = r8.k;	 Catch:{ OutOfMemoryError -> 0x0121 }
        r4 = 0;
        r0.a(r4);	 Catch:{ OutOfMemoryError -> 0x0121 }
        goto L_0x0068;
    L_0x0121:
        r0 = move-exception;
        throw r0;
    L_0x0123:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x0125 }
    L_0x0125:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x0127 }
    L_0x0127:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x0129 }
    L_0x0129:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x012b }
    L_0x012b:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b(java.lang.String, java.lang.String):void");
    }

    private boolean a(char c) {
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            return false;
        }
        return true;
    }

    private boolean b(boolean z) {
        boolean z2;
        boolean z3 = q.h;
        if (!z || this.j <= 0) {
            z2 = false;
        } else {
            int i = 0;
            z2 = false;
            while (i < this.j) {
                if (!a(z2)) {
                    return false;
                }
                i++;
                if (z3) {
                    z2 = true;
                    break;
                }
                z2 = true;
            }
        }
        if (!a(z2)) {
            return false;
        }
        long currentTimeMillis;
        if (this.k != null) {
            currentTimeMillis = System.currentTimeMillis();
            this.k.d(C[30]);
            this.i = (System.currentTimeMillis() - currentTimeMillis) + this.i;
        }
        currentTimeMillis = System.currentTimeMillis();
        a();
        this.l = (System.currentTimeMillis() - currentTimeMillis) + this.l;
        a(true, false);
        if (this.k != null) {
            long currentTimeMillis2 = System.currentTimeMillis();
            this.k.a();
            this.t = (System.currentTimeMillis() - currentTimeMillis2) + this.t;
        }
        return true;
    }

    public boolean a(InputStream inputStream, String str, k kVar) {
        this.g = new r(new InputStreamReader(inputStream, str));
        this.k = kVar;
        long currentTimeMillis = System.currentTimeMillis();
        if (this.k != null) {
            this.k.b();
        }
        e();
        if (this.k != null) {
            this.k.d();
        }
        this.x = (System.currentTimeMillis() - currentTimeMillis) + this.x;
        return true;
    }

    protected boolean n(String str) {
        return h.contains(str.toUpperCase());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void e() {
        /*
        r6 = this;
        r1 = 1;
        r2 = 0;
        r4 = q.h;
        r0 = r1;
    L_0x0005:
        r3 = r6.m;
        if (r3 == 0) goto L_0x000b;
    L_0x0009:
        if (r4 == 0) goto L_0x0015;
    L_0x000b:
        r0 = r6.b(r0);
        if (r0 != 0) goto L_0x0013;
    L_0x0011:
        if (r4 == 0) goto L_0x0015;
    L_0x0013:
        if (r4 == 0) goto L_0x0029;
    L_0x0015:
        r0 = r6.j;
        if (r0 <= 0) goto L_0x0026;
    L_0x0019:
        r0 = r2;
        r3 = r1;
    L_0x001b:
        r5 = r6.j;
        if (r0 >= r5) goto L_0x0026;
    L_0x001f:
        r6.a(r3, r1);
        r0 = r0 + 1;
        if (r4 == 0) goto L_0x0027;
    L_0x0026:
        return;
    L_0x0027:
        r3 = r2;
        goto L_0x001b;
    L_0x0029:
        r0 = r2;
        goto L_0x0005;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a(java.lang.String r9, java.lang.String r10) {
        /*
        r8 = this;
        r3 = q.h;
        r0 = r8.o;
        r1 = C;
        r2 = 81;
        r1 = r1[r2];
        r0 = r0.equalsIgnoreCase(r1);
        if (r0 == 0) goto L_0x0014;
    L_0x0010:
        r10 = r8.k(r10);
    L_0x0014:
        r0 = r8.k;
        if (r0 == 0) goto L_0x0081;
    L_0x0018:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r4 = new java.util.ArrayList;
        r4.<init>();
        r5 = r10.length();
        r0 = 0;
    L_0x0027:
        if (r0 >= r5) goto L_0x0075;
    L_0x0029:
        r6 = r10.charAt(r0);
        r2 = 92;
        if (r6 != r2) goto L_0x0059;
    L_0x0031:
        r2 = r5 + -1;
        if (r0 >= r2) goto L_0x0059;
    L_0x0035:
        r2 = C;
        r7 = 82;
        r2 = r2[r7];
        r2 = r9.equals(r2);
        if (r2 != 0) goto L_0x0059;
    L_0x0041:
        r2 = r0 + 1;
        r2 = r10.charAt(r2);
        r2 = r8.b(r2);
        if (r2 == 0) goto L_0x0054;
    L_0x004d:
        r1.append(r2);
        r0 = r0 + 1;
        if (r3 == 0) goto L_0x0057;
    L_0x0054:
        r1.append(r6);
    L_0x0057:
        if (r3 == 0) goto L_0x0071;
    L_0x0059:
        r2 = r0;
        r0 = 59;
        if (r6 != r0) goto L_0x0085;
    L_0x005e:
        r0 = r1.toString();
        r4.add(r0);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        if (r3 == 0) goto L_0x0082;
    L_0x006c:
        r0.append(r6);
        r1 = r0;
        r0 = r2;
    L_0x0071:
        r0 = r0 + 1;
        if (r3 == 0) goto L_0x0027;
    L_0x0075:
        r0 = r1.toString();
        r4.add(r0);
        r0 = r8.k;
        r0.a(r4);
    L_0x0081:
        return;
    L_0x0082:
        r1 = r0;
        r0 = r2;
        goto L_0x0071;
    L_0x0085:
        r0 = r1;
        goto L_0x006c;
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a(java.lang.String, java.lang.String):void");
    }

    protected String a(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        Log.d(C[45] + pattern.pattern() + C[46] + str);
        return null;
    }

    protected String c() {
        return this.g.readLine();
    }
}
