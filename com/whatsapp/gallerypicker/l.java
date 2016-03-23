package com.whatsapp.gallerypicker;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import com.whatsapp.a9u;
import java.util.HashMap;
import org.v;
import org.whispersystems.at;

public class l extends h {
    public static final Uri i;
    private static final String[] z;

    public void d() {
        c();
    }

    public void b(ContentObserver contentObserver) {
        if (this.b != null) {
            this.b.registerContentObserver(contentObserver);
        }
    }

    public HashMap c() {
        return new HashMap();
    }

    public void a(ContentObserver contentObserver) {
        if (this.b != null) {
            this.b.unregisterContentObserver(contentObserver);
        }
    }

    public l(ContentResolver contentResolver, int i, String str) {
        super(contentResolver, i, i, str);
    }

    protected f a(Cursor cursor) {
        return new v(this, this.f, cursor.getString(1), cursor.getLong(2), cursor.getLong(5));
    }

    static {
        String[] strArr = new String[3];
        String str = "\u001dEP;)\u0010N";
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
                        i3 = 116;
                        break;
                    case at.g /*1*/:
                        i3 = 43;
                        break;
                    case at.i /*2*/:
                        i3 = 51;
                        break;
                    case at.o /*3*/:
                        i3 = 87;
                        break;
                    default:
                        i3 = 92;
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
                    str = "\u0002BW23";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    char[] toCharArray2 = "\u0017D]#9\u001a_\txs\u0017D^y+\u001cJG$=\u0004[\u001d'.\u001b]Z39\u0006\u0005^28\u001dJ\u001c>(\u0011F@".toCharArray();
                    int length2 = toCharArray2.length;
                    char[] cArr2 = toCharArray2;
                    for (i3 = 0; length2 > i3; i3++) {
                        int i4;
                        char c2 = cArr2[i3];
                        switch (i3 % 5) {
                            case v.m /*0*/:
                                i4 = 116;
                                break;
                            case at.g /*1*/:
                                i4 = 43;
                                break;
                            case at.i /*2*/:
                                i4 = 51;
                                break;
                            case at.o /*3*/:
                                i4 = 87;
                                break;
                            default:
                                i4 = 92;
                                break;
                        }
                        cArr2[i3] = (char) (i4 ^ c2);
                    }
                    i = Uri.parse(new String(cArr2).intern());
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0016^P<9\u0000bW";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected Cursor b() {
        return this.f.query(this.h.buildUpon().appendQueryParameter(z[1], this.g).appendQueryParameter(z[0], z[2]).build(), a9u.a, null, null, a());
    }
}
