package com.whatsapp.memory.dump;

import com.whatsapp.arj;
import com.whatsapp.util.Log;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

public class f {
    private static final String[] z;
    private final File a;
    private final File b;
    private e c;

    static {
        String[] strArr = new String[8];
        String str = " Oz|\u00038Zz`\n\u0006^dZ\u000b\u000ePK\u007f\u0000\tQmaJ\u001aJf<\u0000\u001aMga";
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
                        i3 = arj.Theme_editTextStyle;
                        break;
                    case at.g /*1*/:
                        i3 = 63;
                        break;
                    case at.i /*2*/:
                        i3 = 8;
                        break;
                    case at.o /*3*/:
                        i3 = 19;
                        break;
                    default:
                        i3 = arj.Theme_buttonStyleSmall;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = " Oz|\u00038Zz`\n\u0006^dZ\u000b\u000ePK\u007f\u0000\tQmaJ\u001aJf<\u0003\u0001Sm3";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = " Oz|\u00038Zz`\n\u0006^dZ\u000b\u000ePK\u007f\u0000\tQmaJ\u0018^{`WGhzz\u0011\u001cZf3\u0006\u0004Zi}E\u000bPxjE\u001cP(";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = " Oz|\u00038Zz`\n\u0006^dZ\u000b\u000ePK\u007f\u0000\tQmaJ\u0018^{`WGYa}\f\u001bWmwE\u0007Q(u\f\u0004Z(";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = " Oz|\u00038Zz`\n\u0006^dZ\u000b\u000ePK\u007f\u0000\tQmaJ\u0018^{`WGL|r\u0017\u001cVftE\u0007Q(u\f\u0004Z(";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = " Oz|\u00038Zz`\n\u0006^dZ\u000b\u000ePK\u007f\u0000\tQmaJ\u0018^{`TGL|r\u0017\u001cVftE\u0007Q(u\f\u0004Z(";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = " Oz|\u00038Zz`\n\u0006^dZ\u000b\u000ePK\u007f\u0000\tQmaJ\u0018^{`TGYa}\f\u001bWmwE\u0007Q(u\f\u0004Z(";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = " Oz|\u00038Zz`\n\u0006^dZ\u000b\u000ePK\u007f\u0000\tQmaJ\u001aJf<6\u001d\\kv\u0016\u001bY}\u007f\t\u0011\u001fk\u007f\u0000\tQmw";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public boolean b() {
        Throwable e;
        Log.i(z[2] + this.b.getPath());
        try {
            if (this.c == null) {
                this.c = a();
            }
            c();
            Log.i(z[1]);
            return true;
        } catch (IOException e2) {
            e = e2;
            Log.b(z[0], e);
            return false;
        } catch (OutOfMemoryError e3) {
            e = e3;
            Log.b(z[0], e);
            return false;
        }
    }

    private void c() {
        Log.i(z[5] + this.b.getPath());
        r rVar = new r(new a(this.b), new DataOutputStream(new BufferedOutputStream(new FileOutputStream(this.a))));
        new j(rVar, this.c).c();
        rVar.g();
        Log.i(z[4] + this.b.getPath());
        Log.i(z[3] + this.a.getPath());
    }

    public f(File file, File file2) {
        this.b = file;
        this.a = file2;
    }

    private e a() {
        Log.i(z[6] + this.b.getPath());
        g aVar = new a(this.b);
        i iVar = new i(aVar);
        iVar.c();
        aVar.g();
        Log.i(z[7] + this.b.getPath());
        return iVar.a();
    }
}
