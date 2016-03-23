package com.whatsapp.gallerypicker;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.Log;
import com.whatsapp.util.ag;
import org.v;
import org.whispersystems.at;

public class ak extends a9 implements f {
    private static final String[] z;

    static {
        String[] strArr = new String[3];
        String str = "gXtE4bDwN\"cEwM\u0010*VuX@oIyI\u0010~XuB";
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
                        i3 = 49;
                        break;
                    case at.i /*2*/:
                        i3 = 26;
                        break;
                    case at.o /*3*/:
                        i3 = 44;
                        break;
                    default:
                        i3 = 96;
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
                    str = "\\X~I\u000fESpI\u0003~";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\\X~I\u000f";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public Bitmap a(int i) {
        Options options = new Options();
        options.inPurgeable = true;
        options.inInputShareable = true;
        if (i >= 144) {
            return a(i, (i * i) * 2);
        }
        try {
            return m.a().a(this.b, this.h, 3, options, true);
        } catch (Throwable th) {
            Log.e(z[1], z[0], th);
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ak)) {
            return false;
        }
        return c().equals(((ak) obj).c());
    }

    public Bitmap a(int i, int i2) {
        return VERSION.SDK_INT >= 8 ? ThumbnailUtils.createVideoThumbnail(this.k, 1) : ag.e(this.k);
    }

    public int hashCode() {
        return c().toString().hashCode();
    }

    protected ak(h hVar, ContentResolver contentResolver, long j, int i, Uri uri, String str, String str2, long j2, String str3) {
        super(hVar, contentResolver, j, i, uri, str, str2, j2, str3);
    }

    public String toString() {
        return new StringBuilder(z[2]).append(this.h).toString();
    }
}
