package com.whatsapp.gallerypicker;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.net.Uri;
import com.whatsapp.util.bd;
import java.io.File;
import org.v;
import org.whispersystems.at;

public class t extends r implements f {
    private static final String z;
    private long b;
    private final e c;
    private final Uri d;
    private final ContentResolver e;
    private String f;
    private long g;

    static {
        char[] toCharArray = "G\u000e\u000eK*E\u001f\nN,HQT".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 38;
                    break;
                case at.g /*1*/:
                    i2 = 126;
                    break;
                case at.i /*2*/:
                    i2 = 126;
                    break;
                case at.o /*3*/:
                    i2 = 39;
                    break;
                default:
                    i2 = 67;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public String b() {
        return this.d.getPath();
    }

    public Bitmap a(int i, int i2) {
        return bd.a(this.a);
    }

    public t(e eVar, ContentResolver contentResolver, String str, long j, long j2, String str2) {
        this.c = eVar;
        this.e = contentResolver;
        this.d = Uri.fromFile(new File(str));
        this.b = j;
        this.g = j2;
        this.f = str2;
    }

    public String d() {
        return this.f == null ? z : this.f;
    }

    public long a() {
        return this.g;
    }

    public long e() {
        return this.b;
    }

    public Bitmap a(int i) {
        return a(0, 0);
    }

    public Uri c() {
        return this.d;
    }
}
