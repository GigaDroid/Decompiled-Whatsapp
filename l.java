import com.whatsapp.arj;
import java.io.ByteArrayInputStream;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class l {
    private static final String[] z;
    a a;
    String b;

    static {
        String[] strArr = new String[17];
        String str = "6+#";
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
                        i3 = 4;
                        break;
                    case at.g /*1*/:
                        i3 = 5;
                        break;
                    case at.i /*2*/:
                        i3 = 18;
                        break;
                    case at.o /*3*/:
                        i3 = 29;
                        break;
                    default:
                        i3 = 23;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u000eSWODMJ\\'";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "rfsos6+#";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "7+\"";
                    obj = 3;
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    str = "rfsos7+\"";
                    i = 5;
                    strArr2 = strArr3;
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    strArr2 = strArr3;
                    str = "rfsos6+#";
                    obj = 5;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "rfsos7+\"";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "rfsos6+#";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "QV?\\DGL[";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\t\u000f";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\t\u000f";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\t\u000f";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\t\u000f";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "rfsos7+\"";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "rfsos6+#";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "td`nr$cst{aa<5rr`|=bw`2.94%b|ew``4";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "rfsos6+#";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public boolean a(String str, h hVar) {
        return a(str, z[9], hVar);
    }

    private void a(String str) {
        this.b = str;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String c(java.lang.String r8) {
        /*
        r7 = this;
        r1 = q.h;
        r7.b(r8);
        r0 = z;
        r2 = 10;
        r0 = r0[r2];
        r2 = "\n";
        r0 = r8.replaceAll(r0, r2);
        r2 = "\n";
        r2 = r0.split(r2);
        r3 = new java.lang.StringBuilder;
        r0 = "";
        r3.<init>(r0);
        r0 = 0;
    L_0x0022:
        r4 = r2.length;
        if (r0 >= r4) goto L_0x0086;
    L_0x0025:
        r4 = r2[r0];
        r5 = ":";
        r4 = r4.indexOf(r5);
        if (r4 >= 0) goto L_0x0073;
    L_0x0030:
        r4 = r2[r0];
        r4 = r4.length();
        if (r4 != 0) goto L_0x005b;
    L_0x0038:
        r4 = r0 + 1;
        r5 = r2.length;
        if (r4 >= r5) goto L_0x005b;
    L_0x003d:
        r4 = r0 + 1;
        r4 = r2[r4];
        r5 = ":";
        r4 = r4.indexOf(r5);
        if (r4 <= 0) goto L_0x005b;
    L_0x004a:
        r4 = r2[r0];
        r4 = r3.append(r4);
        r5 = z;
        r6 = 13;
        r5 = r5[r6];
        r4.append(r5);
        if (r1 == 0) goto L_0x0082;
    L_0x005b:
        r4 = " ";
        r4 = r3.append(r4);
        r5 = r2[r0];
        r4 = r4.append(r5);
        r5 = z;
        r6 = 11;
        r5 = r5[r6];
        r4.append(r5);
        if (r1 == 0) goto L_0x0082;
    L_0x0073:
        r4 = r2[r0];
        r4 = r3.append(r4);
        r5 = z;
        r6 = 12;
        r5 = r5[r6];
        r4.append(r5);
    L_0x0082:
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x0022;
    L_0x0086:
        r0 = r3.toString();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: l.c(java.lang.String):java.lang.String");
    }

    public l() {
        this.a = null;
        this.b = null;
    }

    public boolean a(String str, String str2, h hVar) {
        String c = c(str);
        if (this.a.a(new ByteArrayInputStream(c.getBytes(str2)), str2, hVar)) {
            return true;
        }
        if (this.b.equals(z[15])) {
            a(z[14]);
            return a(c, hVar);
        }
        throw new d(z[16]);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(java.lang.String r5) {
        /*
        r4 = this;
        r0 = q.h;
        r1 = r4.b;
        if (r1 != 0) goto L_0x0058;
    L_0x0006:
        r1 = z;
        r2 = 2;
        r1 = r1[r2];
        r1 = r5.indexOf(r1);
        r2 = -1;
        if (r1 != r2) goto L_0x001c;
    L_0x0012:
        r2 = z;
        r3 = 8;
        r2 = r2[r3];
        r4.b = r2;
        if (r0 == 0) goto L_0x0058;
    L_0x001c:
        r2 = "\n";
        r3 = r1 + 1;
        r2 = r5.indexOf(r2, r3);
        r1 = r5.substring(r1, r2);
        r2 = z;
        r3 = 0;
        r2 = r2[r3];
        r2 = r1.indexOf(r2);
        if (r2 <= 0) goto L_0x003d;
    L_0x0034:
        r2 = z;
        r3 = 3;
        r2 = r2[r3];
        r4.b = r2;
        if (r0 == 0) goto L_0x0058;
    L_0x003d:
        r2 = z;
        r3 = 4;
        r2 = r2[r3];
        r1 = r1.indexOf(r2);
        if (r1 <= 0) goto L_0x0051;
    L_0x0048:
        r1 = z;
        r2 = 5;
        r1 = r1[r2];
        r4.b = r1;
        if (r0 == 0) goto L_0x0058;
    L_0x0051:
        r0 = z;
        r1 = 1;
        r0 = r0[r1];
        r4.b = r0;
    L_0x0058:
        r0 = r4.b;
        r1 = z;
        r2 = 6;
        r1 = r1[r2];
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x006c;
    L_0x0065:
        r0 = new a;
        r0.<init>();
        r4.a = r0;
    L_0x006c:
        r0 = r4.b;
        r1 = z;
        r2 = 7;
        r1 = r1[r2];
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0080;
    L_0x0079:
        r0 = new b;
        r0.<init>();
        r4.a = r0;
    L_0x0080:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: l.b(java.lang.String):void");
    }
}
