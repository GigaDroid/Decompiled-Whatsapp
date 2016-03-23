package com.whatsapp.gallerypicker;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import com.whatsapp.a9u;
import java.util.HashMap;
import org.v;
import org.whispersystems.at;

public class k extends h {
    public static final Uri i;
    private static final String[] z;

    public void a(ContentObserver contentObserver) {
        if (this.b != null) {
            this.b.unregisterContentObserver(contentObserver);
        }
    }

    protected Cursor b() {
        return this.f.query(this.h.buildUpon().appendQueryParameter(z[0], this.g).appendQueryParameter(z[1], z[2]).build(), a9u.a, null, null, a());
    }

    public void b(ContentObserver contentObserver) {
        if (this.b != null) {
            this.b.registerContentObserver(contentObserver);
        }
    }

    protected f a(Cursor cursor) {
        return new u(this, this.f, cursor.getString(1), cursor.getLong(2));
    }

    public HashMap c() {
        return new HashMap();
    }

    public void d() {
        c();
    }

    public k(ContentResolver contentResolver, int i, String str) {
        super(contentResolver, i, i, str);
    }

    static {
        String[] strArr = new String[3];
        String str = "LGy,\u001cZ{~";
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
                        i3 = 46;
                        break;
                    case at.g /*1*/:
                        i3 = 50;
                        break;
                    case at.i /*2*/:
                        i3 = 26;
                        break;
                    case at.o /*3*/:
                        i3 = 71;
                        break;
                    default:
                        i3 = 121;
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
                    str = "G_{ \u001c]";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    char[] toCharArray2 = "M]t3\u001c@F hVM]wi\u000eFSn4\u0018^B47\u000bADs#\u001c\\\u001cw\"\u001dGS5.\rK_i".toCharArray();
                    int length2 = toCharArray2.length;
                    char[] cArr2 = toCharArray2;
                    for (i3 = 0; length2 > i3; i3++) {
                        int i4;
                        char c2 = cArr2[i3];
                        switch (i3 % 5) {
                            case v.m /*0*/:
                                i4 = 46;
                                break;
                            case at.g /*1*/:
                                i4 = 50;
                                break;
                            case at.i /*2*/:
                                i4 = 26;
                                break;
                            case at.o /*3*/:
                                i4 = 71;
                                break;
                            default:
                                i4 = 121;
                                break;
                        }
                        cArr2[i3] = (char) (i4 ^ c2);
                    }
                    i = Uri.parse(new String(cArr2).intern());
                    return;
                default:
                    strArr2[i] = str;
                    str = "G\\y+\fJW";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }
}
