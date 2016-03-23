import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import java.util.Arrays;
import java.util.HashSet;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class b extends a {
    private static final HashSet C;
    private static final HashSet D;
    private static final HashSet E;
    private static final String[] G;
    private String F;

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
                if (!(c.startsWith(" ") || c.startsWith("\t"))) {
                    this.F = c;
                    if (!z) {
                        break;
                    }
                }
                stringBuilder.append(c);
            } else {
                throw new d(G[8]);
            }
        } while (!z);
        return stringBuilder.toString();
    }

    protected String b() {
        return G[3];
    }

    protected void j(String str) {
        throw new d(G[10]);
    }

    protected boolean a(boolean z) {
        return super.a(z);
    }

    static {
        String[] strArr = new String[42];
        String str = "@K";
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
                        i4 = 77;
                        break;
                    case at.g /*1*/:
                        i4 = 65;
                        break;
                    case at.i /*2*/:
                        i4 = 17;
                        break;
                    case at.o /*3*/:
                        i4 = 121;
                        break;
                    default:
                        i4 = 92;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "\u0016\u001e5X`1\u007f0]\u0003\u0010";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "~o!";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    strArr2 = strArr3;
                    str = "\u0018/z\u00173:/1\t=? |\n|; }\f9wa";
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "\u0015l";
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "\u001f$p\u001a4(%1\u001c2)a~\u001f|/4w\u001f9?o";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "\u001e1p\u001a9m$i\u0010/921\u0018(m5y\u001c|/$v\u00102#(\u007f\u001e|\"'1\r4(a}\u00102(";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "\u000b(}\u001c|(/u\u001c8m%d\u000b5#&1\t=?2x\u0017;m\u0003P*\u0019{u1\u001b5# c\u0000";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "@K";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "\f\u0006T7\bm(\u007fY*\u000e c\u001d|~o!Y5>a\u007f\u0016(m2d\t,\"3e\u001c8m8t\rr";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "\u001b\u0004C*\u0015\u0002\u000f";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "\u001e\u000eC-q\u001e\u0015C0\u0012\n";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "\u0001\u000eV6";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "\u0001\u0000S<\u0010";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "\u0003\bR2\u0012\f\fT";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "\u001d\u0013^=\u0015\t";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i2] = str;
                    str = "\u0018\bU";
                    i = 16;
                    i2 = 17;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    strArr2 = strArr3;
                    str = "\u0019\bE5\u0019";
                    i = 17;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "\u0018\u0013]";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "\u000e\u0000E<\u001b\u0002\u0013X<\u000f";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = "\u001e\u000eD7\u0018";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = "\b\fP0\u0010";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "\u0000\u0000X5\u0019\u001f";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = "\u0003\u0000\\<";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = "\n\u0004^";
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = "\u001f\u000e]<";
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i2] = str;
                    i2 = 27;
                    str = "\u001f\u0004G";
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i2] = str;
                    i2 = 28;
                    str = "\u000e\rP*\u000f";
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    str = "\u000f\u0005P ";
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i2] = str;
                    i2 = 30;
                    str = "\u000f\u0004V0\u0012";
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i2] = str;
                    i2 = 31;
                    str = "u\u0003X-";
                    i = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i2] = str;
                    i2 = 32;
                    str = "\u0019\u0004]";
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i2] = str;
                    i2 = 33;
                    str = "\u000b\u000f";
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i2] = str;
                    i2 = 34;
                    str = "z\u0003X-";
                    i = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i2] = str;
                    i2 = 35;
                    str = "\u000f\u0000B<jy";
                    i = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i2] = str;
                    i2 = 36;
                    str = "\u001d\u0013^?\u0015\u0001\u0004";
                    i = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i2] = str;
                    i2 = 37;
                    str = "\u001e\u000eD+\u001f\b";
                    i = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i2] = str;
                    i2 = 38;
                    str = "\u0003\u000eE<";
                    i = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i2] = str;
                    i2 = 39;
                    str = "\u0019\u001b";
                    i = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i2] = str;
                    i2 = 40;
                    str = "\u001d\t^-\u0013";
                    i = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i2] = str;
                    i2 = 41;
                    str = "\u0006\u0004H";
                    i = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i2] = str;
                    G = strArr3;
                    C = new HashSet(Arrays.asList(new String[]{G[30], G[13], G[40], G[14], G[33], G[18], G[21], G[11], G[32], G[22], G[39], G[25], G[38], G[19], G[29], G[26], G[27], G[17], G[41], G[23], G[24], G[36], G[37], G[15], G[28], G[12], G[20], G[16]}));
                    E = new HashSet(Arrays.asList(new String[]{G[34], G[31], G[35], "B"}));
                    D = new HashSet();
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\u0019\u0018A<";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected java.lang.String h(java.lang.String r9) {
        /*
        r8 = this;
        r1 = 0;
        r2 = q.h;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = r9.length();
        r0 = r1;
    L_0x000d:
        if (r0 >= r4) goto L_0x003e;
    L_0x000f:
        r5 = r9.charAt(r0);
        r6 = 92;
        if (r5 != r6) goto L_0x0037;
    L_0x0017:
        r6 = r4 + -1;
        if (r0 >= r6) goto L_0x0037;
    L_0x001b:
        r0 = r0 + 1;
        r6 = r9.charAt(r0);
        r7 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        if (r6 == r7) goto L_0x0029;
    L_0x0025:
        r7 = 78;
        if (r6 != r7) goto L_0x0032;
    L_0x0029:
        r7 = G;
        r7 = r7[r1];
        r3.append(r7);
        if (r2 == 0) goto L_0x0035;
    L_0x0032:
        r3.append(r6);
    L_0x0035:
        if (r2 == 0) goto L_0x003a;
    L_0x0037:
        r3.append(r5);
    L_0x003a:
        r0 = r0 + 1;
        if (r2 == 0) goto L_0x000d;
    L_0x003e:
        r0 = r3.toString();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: b.h(java.lang.String):java.lang.String");
    }

    protected void a(boolean z, boolean z2) {
        super.a(z, z2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected java.lang.String g() {
        /*
        r8 = this;
        r7 = 1;
        r6 = 0;
        r1 = 0;
        r2 = q.h;
        r0 = a.d;
        if (r0 == 0) goto L_0x000e;
    L_0x0009:
        a.d = r6;
        r0 = a.z;
    L_0x000d:
        return r0;
    L_0x000e:
        r0 = r1;
    L_0x000f:
        r3 = r8.g;
        r3 = r3.readLine();
        if (r3 != 0) goto L_0x0032;
    L_0x0017:
        if (r0 == 0) goto L_0x001e;
    L_0x0019:
        r0 = r0.toString();
        goto L_0x000d;
    L_0x001e:
        r0 = r8.F;
        if (r0 == 0) goto L_0x0027;
    L_0x0022:
        r0 = r8.F;
        r8.F = r1;
        goto L_0x000d;
    L_0x0027:
        r0 = new d;
        r1 = G;
        r2 = 6;
        r1 = r1[r2];
        r0.<init>(r1);
        throw r0;
    L_0x0032:
        r4 = r3.length();
        if (r4 != 0) goto L_0x0048;
    L_0x0038:
        if (r0 == 0) goto L_0x003f;
    L_0x003a:
        r0 = r0.toString();
        goto L_0x000d;
    L_0x003f:
        r3 = r8.F;
        if (r3 == 0) goto L_0x000f;
    L_0x0043:
        r0 = r8.F;
        r8.F = r1;
        goto L_0x000d;
    L_0x0048:
        r4 = r3.charAt(r6);
        r5 = 32;
        if (r4 == r5) goto L_0x0058;
    L_0x0050:
        r4 = r3.charAt(r6);
        r5 = 9;
        if (r4 != r5) goto L_0x0087;
    L_0x0058:
        if (r0 == 0) goto L_0x0063;
    L_0x005a:
        r4 = r3.substring(r7);
        r0.append(r4);
        if (r2 == 0) goto L_0x000f;
    L_0x0063:
        r0 = r8.F;
        if (r0 == 0) goto L_0x007c;
    L_0x0067:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r4 = r8.F;
        r0.append(r4);
        r8.F = r1;
        r3 = r3.substring(r7);
        r0.append(r3);
        if (r2 == 0) goto L_0x000f;
    L_0x007c:
        r0 = new d;
        r1 = G;
        r2 = 7;
        r1 = r1[r2];
        r0.<init>(r1);
        throw r0;
    L_0x0087:
        r4 = r8.F;
        if (r4 != 0) goto L_0x0095;
    L_0x008b:
        r8.F = r3;
        if (r0 == 0) goto L_0x000f;
    L_0x008f:
        r0 = r0.toString();
        goto L_0x000d;
    L_0x0095:
        r0 = r8.F;
        r8.F = r3;
        goto L_0x000d;
        */
        throw new UnsupportedOperationException("Method not decompiled: b.g():java.lang.String");
    }

    protected boolean d(String str) {
        if (!(C.contains(str) || D.contains(str) || str.startsWith(G[5]) || this.e.contains(str))) {
            this.e.add(str);
        }
        return true;
    }

    protected String c() {
        if (this.F == null) {
            return this.g.readLine();
        }
        String str = this.F;
        this.F = null;
        return str;
    }

    protected boolean n(String str) {
        return E.contains(str.toUpperCase());
    }

    protected String b(char c) {
        if (c == 'n' || c == 'N') {
            return G[9];
        }
        return String.valueOf(c);
    }

    protected void f(String str) {
        try {
            super.f(str);
        } catch (d e) {
            throw e;
        } catch (d e2) {
            String[] split = str.split("=", 2);
            if (split.length == 2) {
                c(split[0], split[1]);
                if (!q.h) {
                    return;
                }
            }
            throw new d(G[4] + str);
        } catch (d e3) {
            throw e3;
        }
    }

    protected void c(String str, String str2) {
        super.c(str, str2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void g(java.lang.String r11) {
        /*
        r10 = this;
        r9 = 2;
        r8 = 1;
        r1 = q.h;
        r0 = ",";
        r2 = r11.split(r0);
        r0 = r10.k;
        r3 = G;
        r3 = r3[r8];
        r0.e(r3);
        r3 = r2.length;
        r0 = 0;
    L_0x0016:
        if (r0 >= r3) goto L_0x0057;
    L_0x0018:
        r4 = r2[r0];
        r5 = r4.length();
        if (r5 < r9) goto L_0x0043;
    L_0x0020:
        r5 = "\"";
        r5 = r4.startsWith(r5);
        if (r5 == 0) goto L_0x0043;
    L_0x0029:
        r5 = "\"";
        r5 = r4.endsWith(r5);
        if (r5 == 0) goto L_0x0043;
    L_0x0032:
        r5 = r10.k;
        r6 = r4.length();
        r6 = r6 + -1;
        r6 = r4.substring(r8, r6);
        r5.b(r6);
        if (r1 == 0) goto L_0x0053;
    L_0x0043:
        r5 = r10.k;
        r6 = G;
        r6 = r6[r9];
        r7 = "";
        r4 = r4.replaceAll(r6, r7);
        r5.b(r4);
    L_0x0053:
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x0016;
    L_0x0057:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: b.g(java.lang.String):void");
    }
}
