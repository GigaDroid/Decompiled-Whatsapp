package com.whatsapp;

import org.v;
import org.whispersystems.at;

public final class a4r {
    private static final String z;
    private final Conversation a;
    private final boolean b;

    static {
        char[] toCharArray = "52T)o/4\u0002-,(8\u0007;e43".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 91;
                    break;
                case at.g /*1*/:
                    i2 = 93;
                    break;
                case at.i /*2*/:
                    i2 = 116;
                    break;
                case at.o /*3*/:
                    i2 = 72;
                    break;
                default:
                    i2 = 12;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public boolean a() {
        return this.b;
    }

    public Conversation b() {
        if (a()) {
            return this.a;
        }
        throw new AssertionError(z);
    }

    public a4r(Conversation conversation, boolean z) {
        this.a = conversation;
        this.b = z;
    }

    static Conversation a(a4r com_whatsapp_a4r) {
        return com_whatsapp_a4r.a;
    }
}
