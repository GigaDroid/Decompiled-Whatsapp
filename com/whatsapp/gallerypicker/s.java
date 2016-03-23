package com.whatsapp.gallerypicker;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.net.Uri;
import java.io.File;
import org.v;
import org.whispersystems.at;

public class s extends r implements f {
    private static final String z;
    private final Uri b;
    private final ContentResolver c;
    private long d;
    private final e e;
    private long f;

    static {
        char[] toCharArray = "5q#5:{.".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 84;
                    break;
                case at.g /*1*/:
                    i2 = 4;
                    break;
                case at.i /*2*/:
                    i2 = 71;
                    break;
                case at.o /*3*/:
                    i2 = 92;
                    break;
                default:
                    i2 = 85;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public Uri c() {
        return this.b;
    }

    public String d() {
        return z;
    }

    public String b() {
        return this.b.getPath();
    }

    public s(e eVar, ContentResolver contentResolver, String str, long j, long j2) {
        this.e = eVar;
        this.c = contentResolver;
        this.b = Uri.fromFile(new File(str));
        this.d = j;
        this.f = j2;
    }

    public long e() {
        return this.d;
    }

    public Bitmap a(int i, int i2) {
        return null;
    }

    public Bitmap a(int i) {
        return a(0, 0);
    }

    public long a() {
        return this.f;
    }
}
