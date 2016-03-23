package com.google;

final class da extends dI {
    private final String d;
    private final String e;

    da(d_ d_Var, String str, String str2) {
        super(d_Var);
        this.e = str2;
        this.d = str;
    }

    protected void c(StringBuilder stringBuilder, int i) {
        int i2 = i / 100000;
        stringBuilder.append('(');
        stringBuilder.append(this.d);
        stringBuilder.append(i2);
        stringBuilder.append(')');
    }

    protected int a(int i) {
        return i % 100000;
    }

    public String c() {
        if (b().d() != 84) {
            throw aN.a();
        }
        StringBuilder stringBuilder = new StringBuilder();
        b(stringBuilder, 8);
        b(stringBuilder, 48, 20);
        d(stringBuilder, 68);
        return stringBuilder.toString();
    }

    private void d(StringBuilder stringBuilder, int i) {
        int a = a().a(i, 16);
        if (a != 38400) {
            stringBuilder.append('(');
            stringBuilder.append(this.e);
            stringBuilder.append(')');
            int i2 = a % 32;
            a /= 32;
            int i3 = (a % 12) + 1;
            a /= 12;
            if (a / 10 == 0) {
                stringBuilder.append('0');
            }
            stringBuilder.append(a);
            if (i3 / 10 == 0) {
                stringBuilder.append('0');
            }
            stringBuilder.append(i3);
            if (i2 / 10 == 0) {
                stringBuilder.append('0');
            }
            stringBuilder.append(i2);
        }
    }
}
