package com.whatsapp;

import com.whatsapp.protocol.co;
import java.util.Collection;
import org.v;
import org.whispersystems.at;

public class sy extends sc {
    private static final String z;
    boolean b;
    String c;
    int d;
    Collection e;

    static {
        char[] toCharArray = "Y\u001b/CaI\u001b/]fO\u001aP".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 40;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.i /*2*/:
                    i2 = 112;
                    break;
                case at.o /*3*/:
                    i2 = 48;
                    break;
                default:
                    i2 = 21;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public sy(String str, boolean z, Collection collection, int i) {
        this.c = str;
        this.b = z;
        this.e = collection;
        this.d = i;
    }

    public String c() {
        boolean z = DialogToastActivity.f;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(z);
        stringBuilder.append(this.c + " ");
        stringBuilder.append(this.b + " ");
        stringBuilder.append(this.d);
        for (co coVar : this.e) {
            stringBuilder.append(" ");
            stringBuilder.append(coVar.k.toString());
            if (z) {
                break;
            }
        }
        return stringBuilder.toString();
    }

    public void b() {
        App.a(this.c, this.b, this.e, this.d);
    }
}
