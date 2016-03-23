package com.whatsapp.gallerypicker;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.net.Uri;
import com.whatsapp.util.ag;
import java.io.File;
import org.whispersystems.at;

public class v extends r implements f {
    private static final String z;
    private long b;
    private final Uri c;
    private final ContentResolver d;
    private final e e;
    private long f;

    static {
        char[] toCharArray = "!H# [x\u000b".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case org.v.m /*0*/:
                    i2 = 87;
                    break;
                case at.g /*1*/:
                    i2 = 33;
                    break;
                case at.i /*2*/:
                    i2 = 71;
                    break;
                case at.o /*3*/:
                    i2 = 69;
                    break;
                default:
                    i2 = 52;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public Uri c() {
        return this.c;
    }

    public Bitmap a(int i) {
        return a(i, (i * i) * 2);
    }

    public long e() {
        return this.f;
    }

    public String d() {
        return z;
    }

    public String b() {
        return this.c.getPath();
    }

    public long a() {
        return this.b;
    }

    public Bitmap a(int i, int i2) {
        return ag.e(b());
    }

    public v(e eVar, ContentResolver contentResolver, String str, long j, long j2) {
        this.e = eVar;
        this.d = contentResolver;
        this.c = Uri.fromFile(new File(str));
        this.f = j;
        this.b = j2;
    }
}
