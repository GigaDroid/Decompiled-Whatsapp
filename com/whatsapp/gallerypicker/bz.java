package com.whatsapp.gallerypicker;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import org.v;
import org.whispersystems.at;

class bz implements f {
    private static final String[] z;
    private final e a;
    private final Uri b;
    private final ContentResolver c;

    static {
        String[] strArr = new String[3];
        String str = "_m69\u001ckx:";
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
                        i3 = 10;
                        break;
                    case at.g /*1*/:
                        i3 = 31;
                        break;
                    case at.i /*2*/:
                        i3 = 95;
                        break;
                    case at.o /*3*/:
                        i3 = 112;
                        break;
                    default:
                        i3 = 113;
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
                    str = "lv3\u0015";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "mp+P\u0014r|:\u0000\u0005cp1P\u0015o|0\u0014\u0018dx\u007f\u0012\u0018~r>\u0000Q";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public Bitmap a(int i, int i2) {
        try {
            return ad.a(i, i2, b());
        } catch (Throwable e) {
            Log.e(z[0], z[1], e);
            return null;
        }
    }

    public long m739a() {
        return 0;
    }

    public Uri c() {
        return this.b;
    }

    public String m740b() {
        return this.b.getPath();
    }

    private ParcelFileDescriptor b() {
        try {
            if (this.b.getScheme().equals(z[2])) {
                return ParcelFileDescriptor.open(new File(this.b.getPath()), 268435456);
            }
            return this.c.openFileDescriptor(this.b, "r");
        } catch (FileNotFoundException e) {
            return null;
        }
    }

    public Bitmap a(int i) {
        return a(i, (i * i) * 2);
    }

    public String d() {
        Options a = a();
        return (a == null || a.outMimeType == null) ? "" : a.outMimeType;
    }

    bz(e eVar, ContentResolver contentResolver, Uri uri) {
        this.a = eVar;
        this.c = contentResolver;
        this.b = uri;
    }

    public long e() {
        return 0;
    }

    private Options a() {
        ParcelFileDescriptor b = b();
        if (b == null) {
            return null;
        }
        try {
            Options options = new Options();
            options.inJustDecodeBounds = true;
            m.a().a(b.getFileDescriptor(), options);
            return options;
        } finally {
            ad.a(b);
        }
    }
}
