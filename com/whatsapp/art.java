package com.whatsapp;

import android.database.Cursor;
import com.whatsapp.protocol.bz;
import com.whatsapp.util.Log;
import java.io.IOException;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.aZ;
import org.whispersystems.ai;
import org.whispersystems.at;
import org.whispersystems.aw;
import org.whispersystems.y;

public final class art implements ai {
    private static final String[] z;
    private final a2r a;

    static {
        String[] strArr = new String[13];
        String str = " :/\u0013& 2/\u0006u\u0010\u0016\u00115";
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
                        i3 = 84;
                        break;
                    case at.g /*1*/:
                        i3 = 83;
                        break;
                    case at.i /*2*/:
                        i3 = 66;
                        break;
                    case at.o /*3*/:
                        i3 = 118;
                        break;
                    default:
                        i3 = 85;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "22+\u001a00s6\u0019u$20\u00050t'*\u0013u826\u0013& s1\u001f2:6&V%&6)\u0013,t!'\u0015:&7";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "&6!\u0019'0";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "':%\u001800\f2\u00040?6;\u0005";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "&6!\u0019'0";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = ":<b\u0005<3='\u0012u$!'\u001d0-s#\u00004=?#\u001491s5\u001f!<s+\u0012u";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "==4\u00179=7b\u0006'18'\u000fu&6!\u0019'0s5\u001f!<s+\u0012u";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "22+\u001a00s6\u0019u$20\u00050t +\u0011;17b\u0006'1s)\u0013,t!'\u0015:&7b\u0012 &:,\u0011u8<#\u0012u2<0V<0s";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "':%\u001800\f2\u00040?6;\u0005";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "5+-\u001a: ?b\u001a:57'\u0012u5s1\u001f2:6&V%&6b\u001d0-s5\u001f!<s+\u0012u";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "$!'\u001d0-\f+\u0012uis}";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "5+-\u001a: ?b\u001a:57'\u0012u ;'V95''\u0005!t +\u0011;17b\u0006'1s)\u0013,t5-\u0004u'6,\u0012<:4";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "5+-\u001a: ?b\u00040 !+\u0013#17b\u001a4 61\u0002u':%\u001800s2\u00040?6;V'10-\u00041t 7\u001561 1\u0010 8?;";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public bz b() {
        aZ a = a();
        Object a2 = a.c().b().a();
        Object obj = new byte[(a2.length - 1)];
        System.arraycopy(a2, 1, obj, 0, obj.length);
        bz bzVar = new bz(aw.b(a.d()), obj, a.b());
        Log.i(z[12]);
        return bzVar;
    }

    private aZ a() {
        Cursor query = this.a.getWritableDatabase().query(z[4], new String[]{z[3]}, null, null, null, null, z[0], "1");
        try {
            if (query.moveToNext()) {
                byte[] blob = query.getBlob(0);
                query.close();
                try {
                    aZ aZVar = new aZ(blob);
                    Log.i(z[1]);
                    return aZVar;
                } catch (Throwable e) {
                    Log.b(z[2], e);
                    return null;
                }
            }
            query.close();
            return null;
        } catch (IOException e2) {
            throw e2;
        }
    }

    art(a2r com_whatsapp_a2r) {
        this.a = com_whatsapp_a2r;
    }

    public aZ a(int i) {
        Cursor query = this.a.getWritableDatabase().query(z[9], new String[]{z[5]}, z[11], new String[]{String.valueOf(i)}, null, null, null);
        try {
            if (query.moveToNext()) {
                try {
                    aZ aZVar = new aZ(query.getBlob(0));
                    query.close();
                    Log.i(z[10] + i);
                    return aZVar;
                } catch (Throwable e) {
                    Log.b(z[8] + i, e);
                    throw new y(z[7] + i);
                }
            }
            query.close();
            throw new y(z[6] + i);
        } catch (IOException e2) {
            throw e2;
        }
    }
}
