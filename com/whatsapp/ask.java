package com.whatsapp;

import java.util.Arrays;
import org.v;
import org.whispersystems.at;

public class ask {
    private static final String[] z;
    public byte[] a;
    public byte[] b;
    public aae c;

    static {
        String[] strArr = new String[3];
        String str = "rzR!g6?C\u0003r'g";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = 94;
                        break;
                    case at.g /*1*/:
                        i3 = 90;
                        break;
                    case at.i /*2*/:
                        i3 = 49;
                        break;
                    case at.o /*3*/:
                        i3 = 72;
                        break;
                    default:
                        i3 = 23;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "rzY)d6?U\u000fx1=]-^:g";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u001c;R#b.\u0011T17\u0005";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public String toString() {
        return z[1] + this.c.toString() + z[2] + Arrays.toString(this.b) + z[0] + Arrays.toString(this.a) + "]";
    }

    public ask(byte[] bArr, String str, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.c = new aae(bArr, str, bArr2, bArr3, bArr5);
        this.b = bArr4;
        this.a = bArr6;
    }
}
