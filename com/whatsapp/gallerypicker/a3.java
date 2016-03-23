package com.whatsapp.gallerypicker;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.MediaStore.Images.Thumbnails;
import com.whatsapp.memory.a;
import com.whatsapp.util.Log;
import com.whatsapp.util.ag;
import org.v;
import org.whispersystems.at;

public class a3 extends a9 implements f {
    private static final String[] l;
    private static final String z;
    private int m;

    private static boolean a() {
        return VERSION.SDK_INT <= 18;
    }

    public a3(h hVar, ContentResolver contentResolver, long j, int i, Uri uri, String str, String str2, long j2, String str3, int i2) {
        super(hVar, contentResolver, j, i, uri, str, str2, j2, str3);
        this.m = i2;
    }

    static {
        char[] toCharArray = "V\b\"\u0012\"S\u0014!\u00194R\u0015!\u001a\u0006\u001b\u0006#\u000fV^\u0019/\u001e\u0006O\b#\u0015".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 59;
                    break;
                case at.g /*1*/:
                    i2 = 97;
                    break;
                case at.i /*2*/:
                    i2 = 76;
                    break;
                case at.o /*3*/:
                    i2 = 123;
                    break;
                default:
                    i2 = 118;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
        String[] strArr = new String[3];
        String str = "d\b(";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        length = 0;
        while (true) {
            cArr = str.toCharArray();
            int length2 = cArr.length;
            char[] cArr2 = cArr;
            for (int i3 = 0; length2 > i3; i3++) {
                int i4;
                char c2 = cArr2[i3];
                switch (i3 % 5) {
                    case v.m /*0*/:
                        i4 = 59;
                        break;
                    case at.g /*1*/:
                        i4 = 97;
                        break;
                    case at.i /*2*/:
                        i4 = 76;
                        break;
                    case at.o /*3*/:
                        i4 = 123;
                        break;
                    default:
                        i4 = 118;
                        break;
                }
                cArr2[i3] = (char) (i4 ^ c2);
            }
            str = new String(cArr2).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[length] = str;
                    length = 2;
                    strArr2 = strArr3;
                    str = "S\u0004%\u001c\u001eO";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[length] = str;
                    l = strArr3;
                    return;
                default:
                    strArr2[length] = str;
                    str = "L\b(\u000f\u001e";
                    length = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public int m732a() {
        return this.m;
    }

    public Bitmap a(int i) {
        Bitmap decodeByteArray;
        if (VERSION.SDK_INT < 14) {
            byte[] thumbnail;
            try {
                thumbnail = new ExifInterface(this.k).getThumbnail();
            } catch (Throwable th) {
                thumbnail = null;
            }
            if (thumbnail != null) {
                Options options = new Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeByteArray(thumbnail, 0, thumbnail.length, options);
                if (options.outWidth >= i && options.outHeight >= i) {
                    options.inSampleSize = ad.a(options, i, (i * i) * 2);
                    options.inJustDecodeBounds = false;
                    options.inDither = false;
                    options.inPreferredConfig = Config.ARGB_8888;
                    options.inInputShareable = true;
                    options.inPurgeable = true;
                    decodeByteArray = BitmapFactory.decodeByteArray(thumbnail, 0, thumbnail.length, options);
                    if (decodeByteArray != null) {
                        decodeByteArray = ad.a(decodeByteArray, a());
                    }
                    if (decodeByteArray != null) {
                        return a(i, (i * i) * 2);
                    }
                    return decodeByteArray;
                }
            }
            decodeByteArray = null;
            if (decodeByteArray != null) {
                decodeByteArray = ad.a(decodeByteArray, a());
            }
            if (decodeByteArray != null) {
                return decodeByteArray;
            }
            return a(i, (i * i) * 2);
        }
        if (i < 144) {
            try {
                decodeByteArray = m.a().a(this.b, this.h, 3, null, false);
                boolean z = false;
            } catch (Throwable th2) {
                Log.b(z, th2);
                return null;
            }
        }
        Options options2 = new Options();
        options2.inDither = false;
        options2.inPreferredConfig = Config.ARGB_8888;
        if (a()) {
            options2.inInputShareable = true;
            options2.inPurgeable = true;
            z = true;
        } else {
            z = false;
        }
        Cursor queryMiniThumbnail = Thumbnails.queryMiniThumbnail(this.b, this.h, 1, l);
        if (queryMiniThumbnail != null) {
            if (queryMiniThumbnail.moveToFirst()) {
                options2.outWidth = queryMiniThumbnail.getInt(1);
                options2.outHeight = queryMiniThumbnail.getInt(2);
                options2.inSampleSize = ad.a(options2, i, (i * i) * 2);
            }
            queryMiniThumbnail.close();
        }
        decodeByteArray = m.a().a(this.b, this.h, 1, options2, false);
        int a = a();
        if (!(decodeByteArray == null || a == 0)) {
            decodeByteArray = ad.a(decodeByteArray, a());
            z = false;
        }
        if (decodeByteArray == null || r7) {
            return decodeByteArray;
        }
        if (a.a()) {
            return ag.b(decodeByteArray);
        }
        return decodeByteArray;
    }
}
