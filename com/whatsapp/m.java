package com.whatsapp;

import com.whatsapp.protocol.be;
import com.whatsapp.util.Log;
import java.util.Map;
import org.json.JSONObject;
import org.v;
import org.whispersystems.at;

class m implements ui {
    private static final String[] z;
    final sx a;

    static {
        String[] strArr = new String[6];
        String str = "#EiEc$_m";
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
                        i3 = 69;
                        break;
                    case at.g /*1*/:
                        i3 = 44;
                        break;
                    case at.i /*2*/:
                        i3 = 5;
                        break;
                    case at.o /*3*/:
                        i3 = 32;
                        break;
                    default:
                        i3 = 11;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "6E\u007fE";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "(EhE\u007f<\\`";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "0^i";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "!YwA\u007f,Ck";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "(IaIj0\\iOj!\u0003oSd+I}Cn5XlOe";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(Map map, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.a.f = new be();
            this.a.f.c = jSONObject.optString(z[3]);
            this.a.f.a = jSONObject.optString(z[4]);
            this.a.f.d = jSONObject.optLong(z[2]);
            this.a.f.f = jSONObject.optInt(z[5]);
            this.a.f.e = jSONObject.optString(z[0]);
            this.a.e = true;
        } catch (Throwable e) {
            Log.b(z[1], e);
        }
    }

    public void a(long j) {
        sx.a(this.a, new Long[]{Long.valueOf(j)});
    }

    m(sx sxVar) {
        this.a = sxVar;
    }
}
