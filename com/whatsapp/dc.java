package com.whatsapp;

import java.util.Arrays;

public class dc {
    private byte[] a;
    private String b;
    private byte[] c;

    static String b(dc dcVar) {
        return dcVar.b;
    }

    static byte[] a(dc dcVar) {
        return dcVar.a;
    }

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
        dc dcVar = (dc) obj;
        if (!Arrays.equals(this.c, dcVar.c)) {
            return false;
        }
        if (!Arrays.equals(this.a, dcVar.a)) {
            return false;
        }
        if (this.b == null) {
            if (dcVar.b != null) {
                return false;
            }
            return true;
        } else if (this.b.equals(dcVar.b)) {
            return true;
        } else {
            return false;
        }
    }

    static byte[] c(dc dcVar) {
        return dcVar.c;
    }

    public dc(String str, byte[] bArr, byte[] bArr2) {
        this.b = str;
        this.a = bArr;
        this.c = bArr2;
    }

    public int hashCode() {
        return (this.b == null ? 0 : this.b.hashCode()) + ((((Arrays.hashCode(this.c) + 31) * 31) + Arrays.hashCode(this.a)) * 31);
    }
}
