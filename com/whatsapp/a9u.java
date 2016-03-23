package com.whatsapp;

import android.database.AbstractCursor;
import android.database.Cursor;
import android.net.Uri;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import java.io.File;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class a9u extends AbstractCursor {
    public static final String[] a;
    private static final String[] z;
    private int b;
    private String c;
    private Cursor d;

    public int getInt(int i) {
        return 0;
    }

    private boolean b() {
        int i = 0;
        boolean z = DialogToastActivity.f;
        boolean z2 = false;
        while (this.d.moveToPrevious()) {
            if (d()) {
                z2 = true;
                if (!z) {
                    break;
                }
            }
            i++;
            if (z) {
                break;
            }
        }
        if (i > 0) {
            Log.i(z[8] + i);
        }
        if (!z2) {
            this.d.moveToPosition(-1);
            Log.i(z[7]);
        }
        return z2;
    }

    public boolean isNull(int i) {
        return false;
    }

    private boolean d() {
        co a = App.aK.a(a(), this.c);
        if (a.Q != null) {
            MediaData mediaData = (MediaData) a.Q;
            if ((a.k.a || mediaData.transferred) && mediaData.file != null && new File(Uri.fromFile(mediaData.file).getPath()).exists()) {
                return true;
            }
        }
        return false;
    }

    public void close() {
        super.close();
        this.d.close();
    }

    public short getShort(int i) {
        return (short) 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getString(int r5) {
        /*
        r4 = this;
        switch(r5) {
            case 0: goto L_0x0007;
            case 1: goto L_0x0021;
            case 2: goto L_0x0044;
            case 3: goto L_0x0059;
            case 4: goto L_0x005d;
            default: goto L_0x0003;
        };
    L_0x0003:
        r0 = "";
    L_0x0006:
        return r0;
    L_0x0007:
        r0 = r4.a();
        r1 = r4.a();
        r2 = z;
        r3 = 1;
        r2 = r2[r3];
        r1 = r1.getColumnIndex(r2);
        r0 = r0.getLong(r1);
        r0 = java.lang.Long.toString(r0);
        goto L_0x0006;
    L_0x0021:
        r0 = com.whatsapp.App.aK;
        r1 = r4.a();
        r2 = r4.c;
        r0 = r0.a(r1, r2);
        if (r0 == 0) goto L_0x0003;
    L_0x002f:
        r0 = r0.Q;
        r0 = (com.whatsapp.MediaData) r0;
        if (r0 == 0) goto L_0x0040;
    L_0x0035:
        r1 = r0.file;
        if (r1 == 0) goto L_0x0040;
    L_0x0039:
        r0 = r0.file;
        r0 = r0.getAbsolutePath();
        goto L_0x0006;
    L_0x0040:
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x0003;
    L_0x0044:
        r0 = com.whatsapp.App.aK;
        r1 = r4.a();
        r2 = r4.c;
        r0 = r0.a(r1, r2);
        if (r0 == 0) goto L_0x0003;
    L_0x0052:
        r0 = r0.b;
        r0 = java.lang.Long.toString(r0);
        goto L_0x0006;
    L_0x0059:
        r0 = "";
        goto L_0x0006;
    L_0x005d:
        r0 = com.whatsapp.App.aK;
        r1 = r4.a();
        r2 = r4.c;
        r0 = r0.a(r1, r2);
        r1 = r0.c;
        switch(r1) {
            case 1: goto L_0x006f;
            case 2: goto L_0x0075;
            case 3: goto L_0x007b;
            case 4: goto L_0x006e;
            case 5: goto L_0x006e;
            case 6: goto L_0x006e;
            case 7: goto L_0x006e;
            case 8: goto L_0x006e;
            case 9: goto L_0x0081;
            default: goto L_0x006e;
        };
    L_0x006e:
        goto L_0x0003;
    L_0x006f:
        r0 = z;
        r1 = 2;
        r0 = r0[r1];
        goto L_0x0006;
    L_0x0075:
        r0 = z;
        r1 = 3;
        r0 = r0[r1];
        goto L_0x0006;
    L_0x007b:
        r0 = z;
        r1 = 0;
        r0 = r0[r1];
        goto L_0x0006;
    L_0x0081:
        r0 = r0.n;
        goto L_0x0006;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a9u.getString(int):java.lang.String");
    }

    public Cursor a() {
        return this.d;
    }

    public void a(Cursor cursor) {
        this.d.close();
        this.d = cursor;
        this.b = -1;
        moveToPosition(-1);
    }

    public String[] getColumnNames() {
        return a;
    }

    public long getLong(int i) {
        switch (i) {
            case v.m /*0*/:
                return a().getLong(a().getColumnIndex(z[6]));
            case at.i /*2*/:
                return App.aK.a(a(), this.c).b;
            case at.m /*5*/:
                co a = App.aK.a(a(), this.c);
                return a.c == 9 ? (long) a.R : (long) a.H;
            default:
                return 0;
        }
    }

    public float getFloat(int i) {
        return 0.0f;
    }

    public co e() {
        return App.aK.a(a(), this.c);
    }

    public a9u(String str, Cursor cursor) {
        this.b = -1;
        this.d = cursor;
        this.c = str;
        moveToPosition(0);
    }

    public int getType(int i) {
        switch (i) {
            case v.m /*0*/:
            case at.i /*2*/:
            case at.m /*5*/:
                return 1;
            case at.g /*1*/:
                return 3;
            case at.o /*3*/:
                return 3;
            case at.p /*4*/:
                return 3;
            default:
                return 3;
        }
    }

    public boolean onMove(int i, int i2) {
        int i3 = -1;
        boolean z = DialogToastActivity.f;
        if (i > i2 * 2) {
            this.d.moveToPosition(-1);
        } else {
            i3 = i;
        }
        while (i2 > i3) {
            if (c()) {
                i3++;
                if (z) {
                    break;
                }
            }
            onChange(true);
            return false;
        }
        while (i2 < i3) {
            if (b()) {
                i3--;
                if (z) {
                    break;
                }
            }
            onChange(true);
            return false;
        }
        return true;
    }

    public double getDouble(int i) {
        return 0.0d;
    }

    private boolean c() {
        int i = 0;
        boolean z = DialogToastActivity.f;
        boolean z2 = false;
        while (this.d.moveToNext()) {
            if (d()) {
                z2 = true;
                if (!z) {
                    break;
                }
            }
            i++;
            if (z) {
                break;
            }
        }
        if (i > 0) {
            Log.i(z[4] + i);
        }
        if (!z2) {
            this.b = getPosition() + 1;
            this.d.moveToPosition(-1);
            Log.i(z[5] + this.b);
        }
        return z2;
    }

    public int getCount() {
        if (this.b < 0) {
            int count = this.d.getCount();
            if (!DialogToastActivity.f) {
                return count;
            }
        }
        return this.b;
    }

    static {
        String[] strArr = new String[9];
        String str = "l5\u0017?\u00075v";
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
                        i3 = 26;
                        break;
                    case at.g /*1*/:
                        i3 = 92;
                        break;
                    case at.i /*2*/:
                        i3 = 115;
                        break;
                    case at.o /*3*/:
                        i3 = 90;
                        break;
                    default:
                        i3 = arj.Theme_editTextStyle;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "s1\u0012=\r56\u0003?\u000f";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "{)\u00173\u00075v";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "w9\u00173\ty)\u0001)\u0007hs\u001d?\u0010ns\u00001\u0001j|";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "w9\u00173\ty)\u0001)\u0007hs\u001d?\u0010ns\u0001?\tv?\u001c/\u0006n|";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "E5\u0017";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "w9\u00173\ty)\u0001)\u0007hs\u0003(\rls\u001d5\u001c|3\u00064\f";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "w9\u00173\ty)\u0001)\u0007hs\u0003(\rls\u00001\u0001j|";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    z = strArr3;
                    strArr = new String[6];
                    str = "E5\u0017";
                    obj = 8;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i = 0;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    str = "E8\u0012.\t";
                    obj = 9;
                    i = 1;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    str = "~=\u0007?\u001c{7\u00164";
                    obj = 10;
                    i = 2;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    str = "n5\u00076\r";
                    obj = 11;
                    i = 3;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    str = "w5\u001e?7n%\u0003?";
                    obj = 12;
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "~)\u0001;\u001cs3\u001d";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    a = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "E5\u0017";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }
}
