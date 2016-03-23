package com.whatsapp;

import java.util.Arrays;

final class an8 {
    private final byte[] a;
    private final String b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        an8 com_whatsapp_an8 = (an8) obj;
        if (!Arrays.equals(this.a, com_whatsapp_an8.a)) {
            return false;
        }
        if (this.b == null) {
            if (com_whatsapp_an8.b != null) {
                return false;
            }
            return true;
        } else if (this.b.equals(com_whatsapp_an8.b)) {
            return true;
        } else {
            return false;
        }
    }

    public an8(String str, byte[] bArr) {
        this.b = str;
        this.a = bArr;
    }

    public int hashCode() {
        return (this.b == null ? 0 : this.b.hashCode()) + ((Arrays.hashCode(this.a) + 31) * 31);
    }
}
