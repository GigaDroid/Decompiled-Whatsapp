package com.whatsapp;

public final class azv {
    private final int a;
    private final boolean b;
    private final boolean c;

    azv(int i, boolean z, boolean z2, adx com_whatsapp_adx) {
        this(i, z, z2);
    }

    private azv(int i, boolean z, boolean z2) {
        this.a = i;
        this.c = z;
        this.b = z2;
    }

    public boolean b() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        azv com_whatsapp_azv = (azv) obj;
        if (this.a == com_whatsapp_azv.a && this.c == com_whatsapp_azv.c && this.b == com_whatsapp_azv.b) {
            return true;
        }
        return false;
    }

    public boolean c() {
        return this.b;
    }

    public int hashCode() {
        int i = 1;
        int i2 = ((this.c ? 1 : 0) + (this.a * 31)) * 31;
        if (!this.b) {
            i = 0;
        }
        return i2 + i;
    }

    public int a() {
        return this.a;
    }
}
