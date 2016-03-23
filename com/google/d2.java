package com.google;

import com.whatsapp.arj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.v;
import org.whispersystems.at;

public class d2 {
    private static final String[] C;
    private static final Pattern d;
    private static final Pattern l;
    private static final ho p;
    private static final Pattern q;
    private static final Pattern t;
    private static final Pattern z;
    private int A;
    private ho B;
    private boolean a;
    private int b;
    private boolean c;
    private boolean e;
    private StringBuilder f;
    private StringBuilder g;
    private ho h;
    private StringBuilder i;
    private String j;
    private boolean k;
    private String m;
    private String n;
    private String o;
    private int r;
    private final e2 s;
    private aa u;
    private StringBuilder v;
    private StringBuilder w;
    private boolean x;
    private List y;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String a(char r5, boolean r6) {
        /*
        r4 = this;
        r3 = 1;
        r2 = 0;
        r0 = com.google.e2.F;
        r1 = r4.v;
        r1.append(r5);
        if (r6 == 0) goto L_0x0013;
    L_0x000b:
        r1 = r4.v;
        r1 = r1.length();
        r4.A = r1;
    L_0x0013:
        r1 = r4.c(r5);
        if (r1 != 0) goto L_0x001f;
    L_0x0019:
        r4.a = r2;
        r4.k = r3;
        if (r0 == 0) goto L_0x0023;
    L_0x001f:
        r5 = r4.b(r5, r6);
    L_0x0023:
        r1 = r4.a;
        if (r1 != 0) goto L_0x005c;
    L_0x0027:
        r0 = r4.k;
        if (r0 == 0) goto L_0x0032;
    L_0x002b:
        r0 = r4.v;
        r0 = r0.toString();
    L_0x0031:
        return r0;
    L_0x0032:
        r0 = r4.l();
        if (r0 == 0) goto L_0x0043;
    L_0x0038:
        r0 = r4.j();
        if (r0 == 0) goto L_0x0055;
    L_0x003e:
        r0 = r4.c();
        goto L_0x0031;
    L_0x0043:
        r0 = r4.b();
        if (r0 == 0) goto L_0x0055;
    L_0x0049:
        r0 = r4.f;
        r1 = 32;
        r0.append(r1);
        r0 = r4.c();
        goto L_0x0031;
    L_0x0055:
        r0 = r4.v;
        r0 = r0.toString();
        goto L_0x0031;
    L_0x005c:
        r1 = r4.g;
        r1 = r1.length();
        switch(r1) {
            case 0: goto L_0x008b;
            case 1: goto L_0x008b;
            case 2: goto L_0x008b;
            case 3: goto L_0x0092;
            default: goto L_0x0065;
        };
    L_0x0065:
        r0 = r4.c;
        if (r0 == 0) goto L_0x00a7;
    L_0x0069:
        r0 = r4.j();
        if (r0 == 0) goto L_0x0071;
    L_0x006f:
        r4.c = r2;
    L_0x0071:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = r4.f;
        r0 = r0.append(r1);
        r1 = r4.w;
        r1 = r1.toString();
        r0 = r0.append(r1);
        r0 = r0.toString();
        goto L_0x0031;
    L_0x008b:
        r0 = r4.v;
        r0 = r0.toString();
        goto L_0x0031;
    L_0x0092:
        r1 = r4.l();
        if (r1 == 0) goto L_0x009c;
    L_0x0098:
        r4.c = r3;
        if (r0 == 0) goto L_0x0065;
    L_0x009c:
        r0 = r4.d();
        r4.o = r0;
        r0 = r4.a();
        goto L_0x0031;
    L_0x00a7:
        r0 = r4.y;
        r0 = r0.size();
        if (r0 <= 0) goto L_0x00e4;
    L_0x00af:
        r1 = r4.d(r5);
        r0 = r4.e();
        r2 = r0.length();
        if (r2 > 0) goto L_0x0031;
    L_0x00bd:
        r0 = r4.w;
        r0 = r0.toString();
        r4.b(r0);
        r0 = r4.i();
        if (r0 == 0) goto L_0x00d2;
    L_0x00cc:
        r0 = r4.h();
        goto L_0x0031;
    L_0x00d2:
        r0 = r4.a;
        if (r0 == 0) goto L_0x00dc;
    L_0x00d6:
        r0 = r4.d(r1);
        goto L_0x0031;
    L_0x00dc:
        r0 = r4.v;
        r0 = r0.toString();
        goto L_0x0031;
    L_0x00e4:
        r0 = r4.a();
        goto L_0x0031;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d2.a(char, boolean):java.lang.String");
    }

    private boolean b() {
        if (this.o.length() > 0) {
            this.w.insert(0, this.o);
            this.f.setLength(this.f.lastIndexOf(this.o));
        }
        if (this.o.equals(d())) {
            return false;
        }
        return true;
    }

    private String d() {
        int i;
        String substring;
        if (k()) {
            this.f.append('1').append(' ');
            this.x = true;
            if (e2.F != 0) {
                i = 1;
            } else {
                i = 1;
                substring = this.w.substring(0, i);
                this.w.delete(0, i);
                return substring;
            }
        }
        i = 0;
        if (this.B.m()) {
            Matcher matcher = this.u.a(this.B.z()).matcher(this.w);
            if (matcher.lookingAt()) {
                this.x = true;
                i = matcher.end();
                this.f.append(this.w.substring(0, i));
            }
        }
        substring = this.w.substring(0, i);
        this.w.delete(0, i);
        return substring;
    }

    private String c() {
        this.a = true;
        this.c = false;
        this.y.clear();
        return a();
    }

    private String d(String str) {
        int length = this.f.length();
        return (!this.e || length <= 0 || this.f.charAt(length - 1) == ' ') ? this.f + str : new String(this.f) + ' ' + str;
    }

    private void a(String str) {
        int i = e2.F;
        List r;
        if (!this.x || this.B.D() <= 0) {
            r = this.B.r();
        } else {
            r = this.B.M();
        }
        boolean t = this.B.t();
        for (b5 b5Var : r0) {
            if (!(!t || this.x || b5Var.f())) {
                e2 e2Var = this.s;
                if (!e2.j(b5Var.k())) {
                    continue;
                    if (i != 0) {
                        break;
                    }
                }
            }
            if (e(b5Var.e())) {
                this.y.add(b5Var);
                continue;
            } else {
                continue;
            }
            if (i != 0) {
                break;
            }
        }
        b(str);
    }

    public int g() {
        int i = 0;
        int i2 = e2.F;
        if (!this.a) {
            return this.A;
        }
        int i3 = 0;
        while (i3 < this.b && i < this.n.length()) {
            if (this.g.charAt(i3) == this.n.charAt(i)) {
                i3++;
            }
            i++;
            if (i2 != 0) {
                return i;
            }
        }
        return i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean j() {
        /*
        r4 = this;
        r0 = 0;
        r1 = r4.w;
        r1 = r1.length();
        if (r1 != 0) goto L_0x000a;
    L_0x0009:
        return r0;
    L_0x000a:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = r4.s;
        r3 = r4.w;
        r2 = r2.a(r3, r1);
        if (r2 == 0) goto L_0x0009;
    L_0x0019:
        r3 = r4.w;
        r3.setLength(r0);
        r0 = r4.w;
        r0.append(r1);
        r0 = r4.s;
        r0 = r0.b(r2);
        r1 = C;
        r3 = 2;
        r1 = r1[r3];
        r1 = r1.equals(r0);
        if (r1 == 0) goto L_0x0040;
    L_0x0034:
        r1 = r4.s;
        r1 = r1.a(r2);
        r4.B = r1;
        r1 = com.google.e2.F;
        if (r1 == 0) goto L_0x004e;
    L_0x0040:
        r1 = r4.j;
        r1 = r0.equals(r1);
        if (r1 != 0) goto L_0x004e;
    L_0x0048:
        r0 = r4.c(r0);
        r4.B = r0;
    L_0x004e:
        r0 = java.lang.Integer.toString(r2);
        r1 = r4.f;
        r0 = r1.append(r0);
        r1 = 32;
        r0.append(r1);
        r0 = 1;
        goto L_0x0009;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d2.j():boolean");
    }

    private String a() {
        if (this.w.length() < 3) {
            return d(this.w.toString());
        }
        a(this.w.substring(0, 3));
        return i() ? h() : this.v.toString();
    }

    private String d(char c) {
        Matcher matcher = z.matcher(this.i);
        if (matcher.find(this.r)) {
            String replaceFirst = matcher.replaceFirst(Character.toString(c));
            this.i.replace(0, replaceFirst.length(), replaceFirst);
            this.r = matcher.start();
            return this.i.substring(0, this.r + 1);
        }
        if (this.y.size() == 1) {
            this.a = false;
        }
        this.m = "";
        return this.v.toString();
    }

    private String h() {
        int i = e2.F;
        int length = this.w.length();
        if (length <= 0) {
            return this.f.toString();
        }
        String str = "";
        int i2 = 0;
        while (i2 < length) {
            str = d(this.w.charAt(i2));
            i2++;
            if (i != 0) {
                break;
            }
        }
        return this.a ? d(str) : this.v.toString();
    }

    static {
        String[] strArr = new String[5];
        String str = "q\u0007\\Kqq\u0007\\Kqq\u0007\\Kq";
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
                        i3 = 72;
                        break;
                    case at.g /*1*/:
                        i3 = 62;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_buttonStyleSmall;
                        break;
                    case at.o /*3*/:
                        i3 = 114;
                        break;
                    default:
                        i3 = 72;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "x\u000eT";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u0014b\u0001";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "\u0014b\u0001";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    int i4;
                    char c2;
                    strArr2[i] = str;
                    C = strArr3;
                    ho hoVar = new ho();
                    char[] toCharArray2 = "\u0006\u007f".toCharArray();
                    i = toCharArray2.length;
                    toCharArray = toCharArray2;
                    for (i4 = 0; i > i4; i4++) {
                        int i5;
                        c2 = toCharArray[i4];
                        switch (i4 % 5) {
                            case v.m /*0*/:
                                i5 = 72;
                                break;
                            case at.g /*1*/:
                                i5 = 62;
                                break;
                            case at.i /*2*/:
                                i5 = arj.Theme_buttonStyleSmall;
                                break;
                            case at.o /*3*/:
                                i5 = 114;
                                break;
                            default:
                                i5 = 72;
                                break;
                        }
                        toCharArray[i4] = (char) (i5 ^ c2);
                    }
                    p = hoVar.g(new String(toCharArray).intern());
                    str = "\u0014eM)\u0016\u0014e9/\u0015a\u00149/";
                    obj = -1;
                    while (true) {
                        toCharArray = str.toCharArray();
                        i4 = toCharArray.length;
                        char[] cArr2 = toCharArray;
                        for (int i6 = 0; i4 > i6; i6++) {
                            c2 = cArr2[i6];
                            switch (i6 % 5) {
                                case v.m /*0*/:
                                    i3 = 72;
                                    break;
                                case at.g /*1*/:
                                    i3 = 62;
                                    break;
                                case at.i /*2*/:
                                    i3 = arj.Theme_buttonStyleSmall;
                                    break;
                                case at.o /*3*/:
                                    i3 = 114;
                                    break;
                                default:
                                    i3 = 72;
                                    break;
                            }
                            cArr2[i6] = (char) (i3 ^ c2);
                        }
                        str = new String(cArr2).intern();
                        switch (obj) {
                            case v.m /*0*/:
                                d = Pattern.compile(str);
                                str = "\u0013\u0013\u001d\u2062e\u205d\u222c\u3099\uff7fe\uff47\u001e\u00c5\u00df\u2043\u2028\u303eM[\uff40\uff41\uff05\uff58\\\u0014\u0013b8]6\u201b\u2202\uff3b/b`bA.,\u0013\u0013\u001d\u2062e\u205d\u222c\u3099\uff7fe\uff47\u001e\u00c5\u00df\u2043\u2028\u303eM[\uff40\uff41\uff05\uff58\\\u0014\u0013b8]6\u201b\u2202\uff3b/ba\u0015";
                                obj = 1;
                                break;
                            case at.g /*1*/:
                                t = Pattern.compile(str);
                                str = "\u0013\u0013E/";
                                obj = 2;
                                break;
                            case at.i /*2*/:
                                l = Pattern.compile(str);
                                z = Pattern.compile("\u2008");
                                return;
                            default:
                                q = Pattern.compile(str);
                                str = "\u0014ZMMu\u0013`I\u000f\u0015\u0013`I\u000f\u0015a";
                                obj = null;
                                break;
                        }
                    }
                default:
                    strArr2[i] = str;
                    str = "\u0014\u0015\u0019";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private void b(String str) {
        int i = e2.F;
        int length = str.length() - 3;
        Iterator it = this.y.iterator();
        while (it.hasNext()) {
            b5 b5Var = (b5) it.next();
            if (b5Var.g() > length && !this.u.a(b5Var.a(length)).matcher(str).lookingAt()) {
                it.remove();
                continue;
            }
            if (i != 0) {
                return;
            }
        }
    }

    d2(String str) {
        this.n = "";
        this.i = new StringBuilder();
        this.m = "";
        this.v = new StringBuilder();
        this.g = new StringBuilder();
        this.a = true;
        this.k = false;
        this.x = false;
        this.c = false;
        this.s = e2.a();
        this.r = 0;
        this.A = 0;
        this.b = 0;
        this.f = new StringBuilder();
        this.e = false;
        this.o = "";
        this.w = new StringBuilder();
        this.y = new ArrayList();
        this.u = new aa(64);
        this.j = str;
        this.B = c(this.j);
        this.h = this.B;
    }

    private boolean l() {
        Matcher matcher = this.u.a(C[1] + this.B.a()).matcher(this.g);
        if (!matcher.lookingAt()) {
            return false;
        }
        this.x = true;
        int end = matcher.end();
        this.w.setLength(0);
        this.w.append(this.g.substring(end));
        this.f.setLength(0);
        this.f.append(this.g.substring(0, end));
        if (this.g.charAt(0) == '+') {
            return true;
        }
        this.f.append(' ');
        return true;
    }

    private boolean c(char c) {
        if (Character.isDigit(c)) {
            return true;
        }
        if (this.v.length() == 1 && e2.g.matcher(Character.toString(c)).matches()) {
            return true;
        }
        return false;
    }

    private boolean a(b5 b5Var) {
        CharSequence i = b5Var.i();
        if (i.indexOf(124) != -1) {
            return false;
        }
        String replaceAll = d.matcher(q.matcher(i).replaceAll(C[3])).replaceAll(C[4]);
        this.i.setLength(0);
        replaceAll = a(replaceAll, b5Var.e());
        if (replaceAll.length() <= 0) {
            return false;
        }
        this.i.append(replaceAll);
        return true;
    }

    private boolean i() {
        int i = e2.F;
        Iterator it = this.y.iterator();
        while (it.hasNext()) {
            b5 b5Var = (b5) it.next();
            String i2 = b5Var.i();
            if (!this.m.equals(i2)) {
                if (!a(b5Var)) {
                    it.remove();
                    if (i != 0) {
                        break;
                    }
                }
                this.m = i2;
                this.e = l.matcher(b5Var.k()).find();
                this.r = 0;
                return true;
            }
            return false;
        }
        this.a = false;
        return false;
    }

    private String a(String str, String str2) {
        Matcher matcher = this.u.a(str).matcher(C[0]);
        matcher.find();
        String group = matcher.group();
        if (group.length() < this.w.length()) {
            return "";
        }
        return group.replaceAll(str, str2).replaceAll("9", "\u2008");
    }

    String e() {
        int i = e2.F;
        for (b5 b5Var : this.y) {
            Matcher matcher = this.u.a(b5Var.i()).matcher(this.w);
            if (!matcher.matches()) {
                if (i != 0) {
                    break;
                }
            }
            this.e = l.matcher(b5Var.k()).find();
            return d(matcher.replaceAll(b5Var.e()));
        }
        return "";
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private char b(char r3, boolean r4) {
        /*
        r2 = this;
        r0 = 43;
        if (r3 != r0) goto L_0x000d;
    L_0x0004:
        r0 = r2.g;
        r0.append(r3);
        r0 = com.google.e2.F;
        if (r0 == 0) goto L_0x0021;
    L_0x000d:
        r0 = 10;
        r1 = java.lang.Character.digit(r3, r0);
        r3 = java.lang.Character.forDigit(r1, r0);
        r0 = r2.g;
        r0.append(r3);
        r0 = r2.w;
        r0.append(r3);
    L_0x0021:
        if (r4 == 0) goto L_0x002b;
    L_0x0023:
        r0 = r2.g;
        r0 = r0.length();
        r2.b = r0;
    L_0x002b:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d2.b(char, boolean):char");
    }

    public String a(char c) {
        this.n = a(c, true);
        return this.n;
    }

    private boolean k() {
        if (this.B.L() != 1 || this.w.charAt(0) != '1' || this.w.charAt(1) == '0' || this.w.charAt(1) == '1') {
            return false;
        }
        return true;
    }

    private boolean e(String str) {
        return t.matcher(str).matches();
    }

    public String b(char c) {
        this.n = a(c, false);
        return this.n;
    }

    public void f() {
        this.n = "";
        this.v.setLength(0);
        this.g.setLength(0);
        this.i.setLength(0);
        this.r = 0;
        this.m = "";
        this.f.setLength(0);
        this.o = "";
        this.w.setLength(0);
        this.a = true;
        this.k = false;
        this.b = 0;
        this.A = 0;
        this.x = false;
        this.c = false;
        this.y.clear();
        this.e = false;
        if (!this.B.equals(this.h)) {
            this.B = c(this.j);
        }
    }

    private ho c(String str) {
        ho e = this.s.e(this.s.b(this.s.d(str)));
        return e != null ? e : p;
    }
}
