package com.google;

import java.lang.Character.UnicodeBlock;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.v;
import org.whispersystems.at;

final class fz implements Iterator {
    private static final Pattern d;
    private static final Pattern e;
    private static final Pattern g;
    private static final Pattern i;
    private static final Pattern j;
    private static final Pattern k;
    private static final Pattern n;
    private static final Pattern o;
    private static final String z;
    private final String a;
    private long b;
    private h5 c;
    private eo f;
    private int h;
    private final e2 l;
    private final CharSequence m;
    private final go p;

    private static String z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 36;
                    break;
                case at.g /*1*/:
                    i2 = 83;
                    break;
                case at.i /*2*/:
                    i2 = 62;
                    break;
                case at.o /*3*/:
                    i2 = 28;
                    break;
                default:
                    i2 = 96;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    private static char[] z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 96);
        }
        return toCharArray;
    }

    static {
        String str = "\u0000b";
        int i = -1;
        while (true) {
            String z = z(z(str));
            switch (i) {
                case v.m /*0*/:
                    i = Pattern.compile(z);
                    str = "\fl\u00044_\u001e\b\u000e1SylbxO\u007fc\u000fA_x7\u0017`H\u001bie,QylbxO\u007fc\u0013/=\u001b\u000fZ5I\u000b{\u0001&;\u0015ac@\u0004\rlbx\u001b\u0016.";
                    i = 1;
                    break;
                case at.g /*1*/:
                    o = Pattern.compile(z);
                    str = "\u007fb\fA<@(\ra;\t|c#;\u0014bc@\u0004\u007f~\u0011A_\u007fc\u0013/=x7\u001eGP\tac@\u0004\u0000";
                    i = 2;
                    break;
                case at.i /*2*/:
                    k = Pattern.compile(z);
                    str = "\u001e\b\u000e1Uy\u000fZ";
                    i = 3;
                    break;
                case at.o /*3*/:
                    g = Pattern.compile(z);
                    str = "\f\u000fe\uff14\uff5b";
                    i = 4;
                    break;
                case at.p /*4*/:
                    String z2 = z(z("\r\u000fc\uff15\uff5d"));
                    String str2 = z(z("\u007f\r")) + z + z2 + "]";
                    String a = a(0, 3);
                    StringBuilder stringBuilder = new StringBuilder();
                    str = "\fl\u0004G";
                    i = -1;
                    while (true) {
                        str = z(z(str));
                        switch (i) {
                            case v.m /*0*/:
                                stringBuilder = stringBuilder.append(str);
                                str = "\fl\u0004";
                                i = 1;
                                break;
                            case at.g /*1*/:
                                stringBuilder = stringBuilder.append(str).append(str2).append("+").append("[").append(z2);
                                str = "yz\u0001";
                                i = 2;
                                break;
                            case at.i /*2*/:
                                stringBuilder = stringBuilder.append(str).append(str2).append("+");
                                str = "\fl\u0004G";
                                i = 3;
                                break;
                            case at.o /*3*/:
                                stringBuilder = stringBuilder.append(str).append(z).append("]").append(str2);
                                str = "\u000f\b";
                                i = 4;
                                break;
                            case at.p /*4*/:
                                stringBuilder = stringBuilder.append(str).append(z2);
                                str = "yz";
                                i = 5;
                                break;
                            case at.m /*5*/:
                                j = Pattern.compile(stringBuilder.append(str).append(a).append(str2).append("*").toString());
                                z2 = a(0, 2);
                                String a2 = a(0, 4);
                                str2 = a(0, 19);
                                a = z(z("\u007f~F\u200cM\u2031\u2241\u30c2\uff11M\uff2bs\u009e\u00b1\u206b\u2044\u3053\u00165\uff68\uff2d\uff68\uff032<\u007f\u000fc3\u001e\u2077\u226f\uff60A")) + a2;
                                String str3 = z(z("x#ER\u0004Y")) + a(1, 19);
                                z = z + z(z("\u000f\uff58"));
                                String str4 = "[" + z + "]";
                                e = Pattern.compile(str4);
                                stringBuilder = new StringBuilder();
                                str = "x#EF\u001d\u007f\r";
                                i = -1;
                                while (true) {
                                    str = z(z(str));
                                    switch (i) {
                                        case v.m /*0*/:
                                            n = Pattern.compile(stringBuilder.append(str).toString());
                                            stringBuilder = new StringBuilder();
                                            str = "\fl\u0004";
                                            i = 1;
                                            break;
                                        case at.g /*1*/:
                                            stringBuilder = stringBuilder.append(str).append(str4).append(a).append(")").append(z2).append(str3);
                                            str = "\fl\u0004";
                                            i = 2;
                                            break;
                                        case at.i /*2*/:
                                            stringBuilder = stringBuilder.append(str).append(a).append(str3).append(")").append(str2);
                                            str = "\fl\u0004";
                                            i = 3;
                                            break;
                                        case at.o /*3*/:
                                            stringBuilder = stringBuilder.append(str).append(e2.C);
                                            str = "\rl";
                                            i = 4;
                                            break;
                                        case at.p /*4*/:
                                            d = Pattern.compile(stringBuilder.append(str).toString(), 66);
                                            return;
                                        default:
                                            stringBuilder = stringBuilder.append(str).append(z);
                                            str = "x#ER\u0004Y\u000e\u0014";
                                            i = 0;
                                            break;
                                    }
                                }
                            default:
                                stringBuilder = stringBuilder.append(str).append(z);
                                str = "yz\u0001";
                                i = 0;
                                break;
                        }
                    }
                default:
                    z = z;
                    str = "x7E-L\u0011.\u00137<@(\u000f0UY\u000fMgP\bgC@Hx7E-L\u0010.";
                    i = 0;
                    break;
            }
        }
    }

    private static String a(int i, int i2) {
        if (i >= 0 && i2 > 0 && i2 >= i) {
            return "{" + i + "," + i2 + "}";
        }
        try {
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    static boolean a(ae aeVar, String str, e2 e2Var, ai aiVar) {
        int i = e2.F;
        StringBuilder a = e2.a(str, true);
        try {
            if (aiVar.a(e2Var, aeVar, a, a(e2Var, aeVar, null))) {
                return true;
            }
            ho b = dw.b(aeVar.n());
            if (b != null) {
                for (b5 a2 : b.r()) {
                    try {
                        if (!aiVar.a(e2Var, aeVar, a, a(e2Var, aeVar, a2))) {
                            if (i != 0) {
                                break;
                            }
                        }
                        return true;
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
            }
            return false;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    fz(e2 e2Var, CharSequence charSequence, String str, go goVar, long j) {
        this.f = eo.NOT_READY;
        this.c = null;
        this.h = 0;
        if (e2Var == null || goVar == null) {
            try {
                throw new NullPointerException();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } else if (j < 0) {
            try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } else {
            try {
                this.l = e2Var;
                if (charSequence == null) {
                    charSequence = "";
                }
                this.m = charSequence;
                this.a = str;
                this.p = goVar;
                this.b = j;
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean hasNext() {
        /*
        r2 = this;
        r0 = r2.f;	 Catch:{ IllegalArgumentException -> 0x002e }
        r1 = com.google.eo.NOT_READY;	 Catch:{ IllegalArgumentException -> 0x002e }
        if (r0 != r1) goto L_0x0026;
    L_0x0006:
        r0 = r2.h;	 Catch:{ IllegalArgumentException -> 0x0030 }
        r0 = r2.a(r0);	 Catch:{ IllegalArgumentException -> 0x0030 }
        r2.c = r0;	 Catch:{ IllegalArgumentException -> 0x0030 }
        r0 = r2.c;	 Catch:{ IllegalArgumentException -> 0x0030 }
        if (r0 != 0) goto L_0x001a;
    L_0x0012:
        r0 = com.google.eo.DONE;	 Catch:{ IllegalArgumentException -> 0x0032 }
        r2.f = r0;	 Catch:{ IllegalArgumentException -> 0x0032 }
        r0 = com.google.e2.F;	 Catch:{ IllegalArgumentException -> 0x0032 }
        if (r0 == 0) goto L_0x0026;
    L_0x001a:
        r0 = r2.c;	 Catch:{ IllegalArgumentException -> 0x0032 }
        r0 = r0.b();	 Catch:{ IllegalArgumentException -> 0x0032 }
        r2.h = r0;	 Catch:{ IllegalArgumentException -> 0x0032 }
        r0 = com.google.eo.READY;	 Catch:{ IllegalArgumentException -> 0x0032 }
        r2.f = r0;	 Catch:{ IllegalArgumentException -> 0x0032 }
    L_0x0026:
        r0 = r2.f;	 Catch:{ IllegalArgumentException -> 0x0034 }
        r1 = com.google.eo.READY;	 Catch:{ IllegalArgumentException -> 0x0034 }
        if (r0 != r1) goto L_0x0036;
    L_0x002c:
        r0 = 1;
    L_0x002d:
        return r0;
    L_0x002e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0030 }
    L_0x0030:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0032 }
    L_0x0032:
        r0 = move-exception;
        throw r0;
    L_0x0034:
        r0 = move-exception;
        throw r0;
    L_0x0036:
        r0 = 0;
        goto L_0x002d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.fz.hasNext():boolean");
    }

    private static CharSequence a(Pattern pattern, CharSequence charSequence) {
        Matcher matcher = pattern.matcher(charSequence);
        return matcher.find() ? charSequence.subSequence(0, matcher.start()) : charSequence;
    }

    static boolean b(char c) {
        try {
            if (!Character.isLetter(c)) {
                if (Character.getType(c) != 6) {
                    return false;
                }
            }
            UnicodeBlock of = UnicodeBlock.of(c);
            try {
                if (!of.equals(UnicodeBlock.BASIC_LATIN)) {
                    if (!of.equals(UnicodeBlock.LATIN_1_SUPPLEMENT)) {
                        try {
                            if (!of.equals(UnicodeBlock.LATIN_EXTENDED_A)) {
                                try {
                                    if (!of.equals(UnicodeBlock.LATIN_EXTENDED_ADDITIONAL)) {
                                        try {
                                            if (!of.equals(UnicodeBlock.LATIN_EXTENDED_B)) {
                                                try {
                                                    if (!of.equals(UnicodeBlock.COMBINING_DIACRITICAL_MARKS)) {
                                                        return false;
                                                    }
                                                } catch (IllegalArgumentException e) {
                                                    throw e;
                                                }
                                            }
                                        } catch (IllegalArgumentException e2) {
                                            throw e2;
                                        }
                                    }
                                } catch (IllegalArgumentException e22) {
                                    throw e22;
                                }
                            }
                        } catch (IllegalArgumentException e222) {
                            throw e222;
                        }
                    }
                }
                return true;
            } catch (IllegalArgumentException e2222) {
                throw e2222;
            } catch (IllegalArgumentException e22222) {
                throw e22222;
            }
        } catch (IllegalArgumentException e222222) {
            throw e222222;
        } catch (IllegalArgumentException e2222222) {
            throw e2222222;
        }
    }

    private h5 a(String str, int i) {
        try {
            if (!j.matcher(str).matches()) {
                return null;
            }
            try {
                if (this.p.compareTo(go.VALID) >= 0) {
                    char charAt;
                    if (i > 0) {
                        if (!e.matcher(str).lookingAt()) {
                            charAt = this.m.charAt(i - 1);
                            try {
                                if (a(charAt) || b(charAt)) {
                                    return null;
                                }
                            } catch (ao e) {
                                throw e;
                            } catch (ao e2) {
                                throw e2;
                            } catch (ao e3) {
                                return null;
                            }
                        }
                    }
                    int length = str.length() + i;
                    if (length < this.m.length()) {
                        charAt = this.m.charAt(length);
                        if (a(charAt) || b(charAt)) {
                            return null;
                        }
                    }
                }
                ae c = this.l.c(str, this.a);
                if (!this.p.a(c, str, this.l)) {
                    return null;
                }
                c.l();
                c.v();
                c.s();
                return new h5(i, str, c);
            } catch (ao e22) {
                throw e22;
            } catch (ao e222) {
                throw e222;
            }
        } catch (IllegalArgumentException e4) {
            throw e4;
        }
    }

    static boolean a(ae aeVar, e2 e2Var) {
        try {
            if (aeVar.k() != aw.FROM_DEFAULT_COUNTRY) {
                return true;
            }
            ho e = e2Var.e(e2Var.b(aeVar.n()));
            if (e == null) {
                return true;
            }
            b5 a = e2Var.a(e.r(), e2Var.b(aeVar));
            if (a == null) {
                return true;
            }
            try {
                if (a.k().length() <= 0) {
                    return true;
                }
                if (a.f()) {
                    return true;
                }
                String k = a.k();
                try {
                    if (e2.g(k.substring(0, k.indexOf(z))).length() != 0) {
                        return e2Var.a(new StringBuilder(e2.g(aeVar.q())), e, null);
                    }
                    return true;
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            } catch (IllegalArgumentException e22) {
                throw e22;
            } catch (IllegalArgumentException e222) {
                throw e222;
            }
        } catch (IllegalArgumentException e2222) {
            throw e2222;
        }
    }

    public Object next() {
        return a();
    }

    static boolean b(e2 e2Var, ae aeVar, StringBuilder stringBuilder, String[] strArr) {
        int i = e2.F;
        int i2 = 0;
        int i3 = 0;
        while (i2 < strArr.length) {
            i3 = stringBuilder.indexOf(strArr[i2], i3);
            if (i3 >= 0) {
                i3 += strArr[i2].length();
                if (i2 == 0) {
                    try {
                        if (i3 < stringBuilder.length() && Character.isDigit(stringBuilder.charAt(i3))) {
                            return stringBuilder.substring(i3 - strArr[i2].length()).startsWith(e2Var.b(aeVar));
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
                i2++;
                if (i != 0) {
                    break;
                }
            }
            return false;
        }
        return stringBuilder.substring(i3).contains(aeVar.r());
    }

    private h5 a(int i) {
        int i2 = e2.F;
        Matcher matcher = d.matcher(this.m);
        while (this.b > 0 && matcher.find(r9)) {
            int start = matcher.start();
            CharSequence a = a(e2.I, this.m.subSequence(start, matcher.end()));
            h5 a2 = a(a, start);
            if (a2 == null) {
                i = start + a.length();
                this.b--;
                if (i2 != 0) {
                    break;
                }
            }
            return a2;
        }
        return null;
    }

    private static boolean a(char c) {
        if (c != '%') {
            try {
                if (Character.getType(c) != 26) {
                    return false;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return true;
    }

    private static String[] a(e2 e2Var, ae aeVar, b5 b5Var) {
        if (b5Var != null) {
            return e2Var.a(e2Var.b(aeVar), b5Var, e5.RFC3966).split("-");
        }
        String a = e2Var.a(aeVar, e5.RFC3966);
        int indexOf = a.indexOf(59);
        if (indexOf < 0) {
            indexOf = a.length();
        }
        return a.substring(a.indexOf(45) + 1, indexOf).split("-");
    }

    private h5 b(String str, int i) {
        int i2 = e2.F;
        Matcher matcher = n.matcher(str);
        if (matcher.find()) {
            CharSequence a = a(e2.w, str.substring(0, matcher.start()));
            h5 a2 = a(a.toString(), i);
            if (a2 != null) {
                return a2;
            }
            this.b--;
            int end = matcher.end();
            h5 a3 = a(a(e2.w, str.substring(end)).toString(), i + end);
            if (a3 != null) {
                return a3;
            }
            this.b--;
            if (this.b > 0) {
                while (matcher.find()) {
                    end = matcher.start();
                    if (i2 != 0) {
                        break;
                    }
                }
                CharSequence a4 = a(e2.w, str.substring(0, end));
                try {
                    if (a4.equals(a)) {
                        return null;
                    }
                    a2 = a(a4.toString(), i);
                    if (a2 != null) {
                        return a2;
                    }
                    this.b--;
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
        }
        return null;
    }

    public h5 a() {
        try {
            if (hasNext()) {
                h5 h5Var = this.c;
                this.c = null;
                this.f = eo.NOT_READY;
                return h5Var;
            }
            throw new NoSuchElementException();
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    static boolean a(String str) {
        int indexOf = str.indexOf(47);
        if (indexOf > 0) {
            try {
                if (str.substring(indexOf + 1).contains("/")) {
                    return true;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return false;
    }

    static boolean a(ae aeVar, String str, e2 e2Var) {
        int i = e2.F;
        int i2 = 0;
        while (i2 < str.length() - 1) {
            char charAt = str.charAt(i2);
            if (charAt == 'x' || charAt == 'X') {
                charAt = str.charAt(i2 + 1);
                if (charAt == 'x' || charAt == 'X') {
                    i2++;
                    try {
                        if (e2Var.b(aeVar, str.substring(i2)) != d5.NSN_MATCH) {
                            return false;
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
                try {
                    if (!e2.g(str.substring(i2)).equals(aeVar.r())) {
                        return false;
                    }
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
            i2++;
            if (i != 0) {
                break;
            }
        }
        return true;
    }

    private h5 a(CharSequence charSequence, int i) {
        try {
            if (i.matcher(charSequence).find()) {
                return null;
            }
            if (o.matcher(charSequence).find()) {
                return null;
            }
            if (k.matcher(charSequence).find()) {
                try {
                    if (g.matcher(this.m.toString().substring(charSequence.length() + i)).lookingAt()) {
                        return null;
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            String charSequence2 = charSequence.toString();
            h5 a = a(charSequence2, i);
            if (a == null) {
                return b(charSequence2, i);
            }
            return a;
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    static boolean a(e2 e2Var, ae aeVar, StringBuilder stringBuilder, String[] strArr) {
        int i = e2.F;
        String[] split = e2.H.split(stringBuilder.toString());
        try {
            int length;
            if (aeVar.o()) {
                length = split.length - 2;
            } else {
                length = split.length - 1;
            }
            try {
                if (split.length != 1) {
                    if (!split[length].contains(e2Var.b(aeVar))) {
                        boolean z;
                        int length2 = strArr.length - 1;
                        while (length2 > 0 && length >= 0) {
                            try {
                                if (split[length].equals(strArr[length2])) {
                                    length2--;
                                    length--;
                                    if (i != 0) {
                                        break;
                                    }
                                }
                                return false;
                            } catch (IllegalArgumentException e) {
                                throw e;
                            }
                        }
                        if (length >= 0) {
                            try {
                                if (split[length].endsWith(strArr[0])) {
                                    z = true;
                                    return z;
                                }
                            } catch (IllegalArgumentException e2) {
                                throw e2;
                            }
                        }
                        z = false;
                        return z;
                    }
                }
                return true;
            } catch (IllegalArgumentException e22) {
                throw e22;
            } catch (IllegalArgumentException e222) {
                throw e222;
            }
        } catch (IllegalArgumentException e2222) {
            throw e2222;
        }
    }
}
