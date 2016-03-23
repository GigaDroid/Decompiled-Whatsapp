package com.google;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

final class af {
    private static final String[] z;
    private final Appendable a;
    private boolean b;
    private final StringBuilder c;

    static {
        String[] strArr = new String[2];
        char[] toCharArray = "\u0018l\u0012i7]M\u00135z\u0018T\u000ei;WV\u0013=>YW\u0004u:VDGT=\\F\ti{\u0011\r".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 56;
                    break;
                case at.g /*1*/:
                    i2 = 35;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_checkedTextViewStyle;
                    break;
                case at.o /*3*/:
                    i2 = 29;
                    break;
                default:
                    i2 = 83;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "\u0018\u0003".toCharArray();
        int length2 = toCharArray.length;
        cArr = toCharArray;
        for (length = 0; length2 > length; length++) {
            c = cArr[length];
            switch (length % 5) {
                case v.m /*0*/:
                    i2 = 56;
                    break;
                case at.g /*1*/:
                    i2 = 35;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_checkedTextViewStyle;
                    break;
                case at.o /*3*/:
                    i2 = 29;
                    break;
                default:
                    i2 = 83;
                    break;
            }
            cArr[length] = (char) (i2 ^ c);
        }
        strArr[1] = new String(cArr).intern();
        z = strArr;
    }

    private af(Appendable appendable) {
        this.c = new StringBuilder();
        this.b = true;
        this.a = appendable;
    }

    public void b() {
        this.c.append(z[1]);
    }

    private void a(CharSequence charSequence, int i) {
        if (i != 0) {
            try {
                if (this.b) {
                    this.b = false;
                    this.a.append(this.c);
                }
                this.a.append(charSequence);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    public void a(CharSequence charSequence) {
        int i = 0;
        boolean z = bA.b;
        int length = charSequence.length();
        int i2 = 0;
        while (i2 < length) {
            if (charSequence.charAt(i2) == '\n') {
                a(charSequence.subSequence(i, length), (i2 - i) + 1);
                i = i2 + 1;
                this.b = true;
            }
            i2++;
            if (z) {
                break;
            }
        }
        a(charSequence.subSequence(i, length), length - i);
    }

    af(Appendable appendable, b_ b_Var) {
        this(appendable);
    }

    public void a() {
        int length = this.c.length();
        if (length == 0) {
            try {
                throw new IllegalArgumentException(z[0]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        this.c.delete(length - 2, length);
    }
}
