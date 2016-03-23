import org.v;
import org.whispersystems.at;

public class g {
    private static final String[] z;
    public int a;
    public String b;
    public String c;
    public String d;
    public boolean e;

    static {
        String[] strArr = new String[3];
        String str = "X(h(";
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
                        i3 = 93;
                        break;
                    case at.i /*2*/:
                        i3 = 4;
                        break;
                    case at.o /*3*/:
                        i3 = 68;
                        break;
                    default:
                        i3 = 2;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "~\u0012I\u0001";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "X(h(";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(g r5, g r6) {
        /*
        r4 = 1;
        r2 = -1;
        r0 = q.h;
        r1 = r5.a;
        if (r1 != r2) goto L_0x0010;
    L_0x0008:
        r1 = r6.a;
        if (r1 != r2) goto L_0x0010;
    L_0x000c:
        r5.a = r4;
        if (r0 == 0) goto L_0x0028;
    L_0x0010:
        r1 = r5.a;
        if (r1 == r2) goto L_0x001c;
    L_0x0014:
        r1 = r5.a;
        if (r1 != 0) goto L_0x0028;
    L_0x0018:
        r1 = r6.a;
        if (r1 == r2) goto L_0x0028;
    L_0x001c:
        r1 = r6.a;
        r5.a = r1;
        r1 = r5.a;
        if (r1 != 0) goto L_0x0028;
    L_0x0024:
        r1 = r6.d;
        r5.d = r1;
    L_0x0028:
        r1 = r5.d;
        if (r1 == 0) goto L_0x0039;
    L_0x002c:
        r1 = r5.d;
        r2 = z;
        r3 = 0;
        r2 = r2[r3];
        r1 = r1.equalsIgnoreCase(r2);
        if (r1 == 0) goto L_0x004f;
    L_0x0039:
        r1 = r6.d;
        if (r1 == 0) goto L_0x004f;
    L_0x003d:
        r1 = r6.d;
        r2 = z;
        r2 = r2[r4];
        r1 = r1.equalsIgnoreCase(r2);
        if (r1 != 0) goto L_0x004f;
    L_0x0049:
        r1 = r6.d;
        r5.d = r1;
        if (r0 == 0) goto L_0x005a;
    L_0x004f:
        r0 = r5.d;
        if (r0 != 0) goto L_0x005a;
    L_0x0053:
        r0 = z;
        r1 = 2;
        r0 = r0[r1];
        r5.d = r0;
    L_0x005a:
        r0 = r5.e;
        if (r0 != 0) goto L_0x0062;
    L_0x005e:
        r0 = r6.e;
        if (r0 == 0) goto L_0x0064;
    L_0x0062:
        r5.e = r4;
    L_0x0064:
        r0 = r5.b;
        if (r0 != 0) goto L_0x0070;
    L_0x0068:
        r0 = r6.b;
        if (r0 == 0) goto L_0x0070;
    L_0x006c:
        r0 = r6.b;
        r5.b = r0;
    L_0x0070:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a(g, g):void");
    }
}
