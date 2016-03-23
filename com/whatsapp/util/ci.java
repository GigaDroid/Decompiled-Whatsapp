package com.whatsapp.util;

import com.whatsapp.arj;
import java.io.RandomAccessFile;
import org.v;
import org.whispersystems.at;

public class ci extends ca {
    private static final String z;
    String d;
    int e;
    String f;
    String g;
    String h;

    static {
        char[] toCharArray = "\u0012\u0000\u001d".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 50;
                    break;
                case at.g /*1*/:
                    i2 = 45;
                    break;
                case at.i /*2*/:
                    i2 = 61;
                    break;
                case at.o /*3*/:
                    i2 = arj.Theme_checkedTextViewStyle;
                    break;
                default:
                    i2 = 91;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public ci(long j, String str, RandomAccessFile randomAccessFile) {
        super(j, str, randomAccessFile);
        this.e = ck.e(randomAccessFile);
        ck.a(randomAccessFile);
        this.d = ck.a(randomAccessFile, 4);
        this.h = ck.a(randomAccessFile, 4);
        this.f = ck.a(randomAccessFile, 4);
        ck.d(randomAccessFile);
        ck.d(randomAccessFile);
        int e = ck.e(randomAccessFile);
        if (((long) e) != j - 33) {
            e = ((int) j) - 33;
            randomAccessFile.seek(randomAccessFile.getFilePointer() - 1);
        }
        byte[] bArr = new byte[e];
        randomAccessFile.read(bArr, 0, e);
        this.g = new String(bArr);
    }

    public String toString() {
        return super.toString() + "[" + this.d + "/" + this.h + z + this.g + "]";
    }
}
