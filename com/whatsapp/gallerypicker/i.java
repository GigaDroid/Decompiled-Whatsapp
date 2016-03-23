package com.whatsapp.gallerypicker;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore.Images.Media;
import com.whatsapp.arj;
import java.util.HashMap;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class i extends h implements e {
    static final String[] i;
    private static final String[] j;
    private static final String[] z;

    protected String m738b() {
        return this.g == null ? z[0] : z[1];
    }

    protected f m737a(Cursor cursor) {
        return a(cursor);
    }

    protected Cursor b() {
        return Media.query(this.f, this.h, i, b(), a(), a());
    }

    public i(ContentResolver contentResolver, Uri uri, int i, String str) {
        super(contentResolver, uri, i, str);
    }

    static {
        String[] strArr = new String[6];
        String str = "xf 3y\u000f\u007f0.ypb'~4o'ia0p4`w";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case v.m /*0*/:
                        i4 = 80;
                        break;
                    case at.g /*1*/:
                        i4 = 11;
                        break;
                    case at.i /*2*/:
                        i4 = 73;
                        break;
                    case at.o /*3*/:
                        i4 = 94;
                        break;
                    default:
                        i4 = 28;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "$y<;";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "2~*5y$T-7o g('C>j$;";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "2~*5y$T :";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "4b:*u>h=";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    strArr = new String[3];
                    str = "9f(9y\u007fa9;{";
                    i = 5;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    str = "9f(9y\u007f{'9";
                    i = 6;
                    i2 = 1;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    str = "9f(9y\u007fl 8";
                    i = 7;
                    i2 = 2;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    j = strArr3;
                    strArr = new String[8];
                    str = "\u000fb-";
                    i = 8;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    str = "\u000fo(*}";
                    i = 9;
                    i2 = 1;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    str = "4j=;h1`,0";
                    i = 10;
                    i2 = 2;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    str = "=b'7C$c<3~\u000ff(9u3";
                    i = 11;
                    i2 = 3;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    str = "?y ;r$j=7s>";
                    i = 12;
                    i2 = 4;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "$b=2y";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "=b$;C$r9;";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "4j=;C=d-7z9n-";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i2] = str;
                    i = strArr3;
                    return;
                default:
                    strArr2[i2] = str;
                    str = "xf 3y\u000f\u007f0.ypb'~4o'ia0p4`w<\u0011E\r~~%h\";h\u000fb-~!p4";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public HashMap c() {
        int i = MediaGalleryFragmentBase.e;
        Uri build = this.h.buildUpon().appendQueryParameter(z[5], z[2]).build();
        Cursor query = Media.query(this.f, build, new String[]{z[3], z[4]}, b(), a(), null);
        try {
            HashMap hashMap = new HashMap();
            while (query.moveToNext()) {
                Object string = query.getString(0);
                String string2 = query.getString(1);
                if (string == null) {
                    string = "";
                }
                hashMap.put(string2, string);
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

    protected a9 a(Cursor cursor) {
        long j = cursor.getLong(0);
        String string = cursor.getString(1);
        long j2 = cursor.getLong(2);
        if (j2 == 0) {
            j2 = cursor.getLong(7) * 1000;
        }
        int i = cursor.getInt(4);
        String string2 = cursor.getString(5);
        String string3 = cursor.getString(6);
        if (string2 == null || string2.length() == 0) {
            string2 = string;
        }
        return new a3(this, this.f, j, cursor.getPosition(), a(j), string, string3, j2, string2, i);
    }

    protected String[] a() {
        if (this.g == null) {
            return j;
        }
        int length = j.length;
        Object obj = new String[(length + 1)];
        System.arraycopy(j, 0, obj, 0, length);
        obj[length] = this.g;
        return obj;
    }
}
