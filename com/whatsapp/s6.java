package com.whatsapp;

import com.whatsapp.protocol.co;
import java.util.Collection;
import org.v;
import org.whispersystems.at;

public class s6 extends sc {
    private static final String z;
    Collection b;
    String c;
    int d;

    static {
        char[] toCharArray = "\u0014#Qy\u0003\t\u000ecn\u0001\u0016q".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_buttonStyleSmall;
                    break;
                case at.g /*1*/:
                    i2 = 81;
                    break;
                case at.i /*2*/:
                    i2 = 14;
                    break;
                case at.o /*3*/:
                    i2 = 29;
                    break;
                default:
                    i2 = arj.Theme_checkboxStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public String c() {
        boolean z = DialogToastActivity.f;
        StringBuilder stringBuilder = new StringBuilder();
        for (co coVar : this.b) {
            stringBuilder.append(" ");
            stringBuilder.append(coVar.k.toString());
            if (z) {
                break;
            }
        }
        return z + this.c + stringBuilder.toString() + " " + this.d;
    }

    public void b() {
        App.a(this.c, this.b, this.d);
    }

    public s6(String str, Collection collection, int i) {
        this.c = str;
        this.b = collection;
        this.d = i;
    }
}
