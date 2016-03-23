package com.whatsapp.gallerypicker;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore.Images.Media;
import java.util.HashMap;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class j extends h {
    private static final String[] i;
    private static final String[] z;

    public j(ContentResolver contentResolver, Uri uri, int i, String str) {
        super(contentResolver, uri, i, str);
    }

    public HashMap c() {
        int i = MediaGalleryFragmentBase.e;
        Uri build = this.h.buildUpon().appendQueryParameter(z[1], z[0]).build();
        Cursor query = Media.query(this.f, build, new String[]{z[3], z[2]}, b(), c(), a());
        try {
            HashMap hashMap = new HashMap();
            while (query.moveToNext()) {
                hashMap.put(query.getString(1), query.getString(0));
                if (i != 0) {
                    break;
                }
            }
            query.close();
            return hashMap;
        } catch (Throwable th) {
            query.close();
        }
    }

    protected String[] m743c() {
        return null;
    }

    protected f m741a(Cursor cursor) {
        return a(cursor);
    }

    static {
        String[] strArr = new String[5];
        String str = "zU^\u001d";
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
                        i3 = 14;
                        break;
                    case at.g /*1*/:
                        i3 = 39;
                        break;
                    case at.i /*2*/:
                        i3 = 43;
                        break;
                    case at.o /*3*/:
                        i3 = 120;
                        break;
                    default:
                        i3 = 80;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "lRH\u00135zxB\u001c";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "lRH\u00135zxO\u0011#~KJ\u0001\u000f`FF\u001d";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "lRH\u00135zxB\u001cp3\u0007\f";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    String[] strArr4 = new String[7];
                    i = 0;
                    strArr2 = strArr4;
                    strArr3 = strArr4;
                    str = "QNO";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    str = "QCJ\f1";
                    obj = 5;
                    i = 1;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    str = "jF_\u001d$oLN\u0016";
                    obj = 6;
                    i = 2;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    str = "zN_\u00145";
                    obj = 7;
                    i = 3;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    str = "cNE\u0011\u000fzO^\u00152QJJ\u001f9m";
                    obj = 8;
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "cNF\u001d\u000fz^[\u001d";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "jF_\u001d\u000fcHO\u00116gBO";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "jNX\f9`D_";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected a9 a(Cursor cursor) {
        long j = cursor.getLong(0);
        String string = cursor.getString(1);
        long j2 = cursor.getLong(2);
        if (j2 == 0) {
            j2 = cursor.getLong(6) * 1000;
        }
        String string2 = cursor.getString(3);
        String string3 = cursor.getString(5);
        if (string2 == null || string2.length() == 0) {
            string2 = string;
        }
        return new ak(this, this.f, j, cursor.getPosition(), a(j), string, string3, j2, string2);
    }

    protected String m742b() {
        return this.g != null ? z[4] + this.g + "'" : null;
    }

    protected Cursor b() {
        return Media.query(this.f, this.h, i, b(), c(), a());
    }
}
