package com.google;

import java.util.Map.Entry;
import org.v;
import org.whispersystems.at;

class R implements Entry {
    private static final String z;
    private Entry a;

    static {
        char[] toCharArray = "h +Z\u0000M$=GfJ.&\u0003)J-(\u00033W$5\u0003 K3qn#W20D#w$%\u000ffE/5\u00032L$qU'H44\u0003)Ba\u001cF5W 6F\u0015A5qN3W5qA#\u0004 ?\u0003/J2%B(G$qL \u0004\f4P5E&4o/P$".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 36;
                    break;
                case at.g /*1*/:
                    i2 = 65;
                    break;
                case at.i /*2*/:
                    i2 = 81;
                    break;
                case at.o /*3*/:
                    i2 = 35;
                    break;
                default:
                    i2 = 70;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public Object getValue() {
        hY hYVar = (hY) this.a.getValue();
        if (hYVar == null) {
            return null;
        }
        return hYVar.b();
    }

    private R(Entry entry) {
        this.a = entry;
    }

    R(Entry entry, u uVar) {
        this(entry);
    }

    public Object getKey() {
        return this.a.getKey();
    }

    public hY a() {
        return (hY) this.a.getValue();
    }

    public Object setValue(Object obj) {
        try {
            if (obj instanceof fO) {
                return ((hY) this.a.getValue()).a((fO) obj);
            }
            throw new IllegalArgumentException(z);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }
}
