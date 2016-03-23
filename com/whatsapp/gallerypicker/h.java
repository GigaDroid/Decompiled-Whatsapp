package com.whatsapp.gallerypicker;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.support.v4.util.LruCache;
import com.whatsapp.util.Log;
import java.util.regex.Pattern;
import org.v;
import org.whispersystems.at;

public abstract class h implements e {
    private static final Pattern a;
    private static final String[] z;
    protected Cursor b;
    private final LruCache c;
    protected boolean d;
    protected int e;
    protected ContentResolver f;
    protected String g;
    protected Uri h;

    protected abstract f a(Cursor cursor);

    protected abstract Cursor b();

    public Uri a(long j) {
        try {
            if (ContentUris.parseId(this.h) != j) {
                Log.e(z[0]);
            }
            return this.h;
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            return ContentUris.withAppendedId(this.h, j);
        }
    }

    public f a(int i) {
        f fVar = (f) this.c.get(Integer.valueOf(i));
        if (fVar == null) {
            Cursor d = d();
            if (d == null) {
                return null;
            }
            synchronized (this) {
                fVar = d.moveToPosition(i) ? a(d) : null;
                if (fVar != null) {
                    try {
                        this.c.put(Integer.valueOf(i), fVar);
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
            }
        }
        return fVar;
    }

    public void c() {
        try {
            if (this.b != null) {
                this.b.deactivate();
                this.d = true;
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public int e() {
        Cursor d = d();
        if (d == null) {
            return 0;
        }
        int count;
        synchronized (this) {
            count = d.getCount();
        }
        return count;
    }

    public void m730d() {
    }

    public void m728a() {
        try {
            c();
        } catch (Throwable e) {
            Log.b(z[6], e);
        }
        try {
            this.f = null;
            if (this.b != null) {
                this.b.close();
                this.b = null;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public h(ContentResolver contentResolver, Uri uri, int i, String str) {
        this.c = new LruCache(512);
        this.d = false;
        this.e = i;
        this.h = uri;
        this.g = str;
        this.f = contentResolver;
        this.b = b();
        if (this.b == null) {
            Log.w(z[5]);
        }
        this.c.trimToSize(0);
    }

    public boolean m729b() {
        try {
            return e() == 0;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    static {
        String[] strArr = new String[7];
        String str = "oI}5:nEj(tkH912qAx(8j";
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
                        i3 = 2;
                        break;
                    case at.g /*1*/:
                        i3 = 44;
                        break;
                    case at.i /*2*/:
                        i3 = 25;
                        break;
                    case at.o /*3*/:
                        i3 = 92;
                        break;
                    default:
                        i3 = 91;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\"h\\\u000f\u0018";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\"mJ\u001f";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = ".\fF5?";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "oI}5:nEj(ta^|=/gol.(m^9.>vYk2(\"Bl07";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "oI}5:nEj(tgTz9+vEv2{uDp0>\"H|=8vEo=/kB~|8w^j3)";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                    char[] toCharArray2 = "*\u00023ut^H2".toCharArray();
                    int length2 = toCharArray2.length;
                    char[] cArr2 = toCharArray2;
                    for (int i4 = 0; length2 > i4; i4++) {
                        int i5;
                        char c2 = cArr2[i4];
                        switch (i4 % 5) {
                            case v.m /*0*/:
                                i5 = 2;
                                break;
                            case at.g /*1*/:
                                i5 = 44;
                                break;
                            case at.i /*2*/:
                                i5 = 25;
                                break;
                            case at.o /*3*/:
                                i5 = 92;
                                break;
                            default:
                                i5 = 91;
                                break;
                        }
                        cArr2[i4] = (char) (i5 ^ c2);
                    }
                    a = Pattern.compile(new String(cArr2).intern());
                    return;
                default:
                    strArr2[i] = str;
                    str = "aMj9{kJw)7n\u0004}=/gXx7>l\u0000)u{uD|2{2\fm4>l\f}=/gst3?kJp9?(\u001d)lk\"Iu/>\"Hx(>vMr95\"Iw8";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected String a() {
        try {
            String str;
            if (this.e == 1) {
                str = z[3];
            } else {
                str = z[2];
            }
            return z[1] + str + z[4] + str;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private Cursor d() {
        Cursor cursor;
        synchronized (this) {
            if (this.b == null) {
                cursor = null;
            } else {
                try {
                    if (this.d) {
                        this.b.requery();
                        this.d = false;
                    }
                    cursor = this.b;
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
        }
        return cursor;
    }

    public void b(ContentObserver contentObserver) {
    }

    public void a(ContentObserver contentObserver) {
    }
}
