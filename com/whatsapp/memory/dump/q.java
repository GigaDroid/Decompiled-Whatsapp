package com.whatsapp.memory.dump;

import android.os.Build;
import android.os.Build.VERSION;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class q {
    private static final String[] z;
    private String a;
    private String b;
    private String c;
    private int d;
    private final File e;
    private String f;
    private String g;
    private int h;
    private String i;

    static {
        String[] strArr = new String[11];
        String str = "G2b:\u0015";
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
                        i3 = 37;
                        break;
                    case at.g /*1*/:
                        i3 = 64;
                        break;
                    case at.i /*2*/:
                        i3 = 3;
                        break;
                    case at.o /*3*/:
                        i3 = 84;
                        break;
                    default:
                        i3 = 113;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "D.g&\u001eL$\\\"\u0014W3j;\u001f";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "P)g";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "U2l7\u0014V3\\:\u0010H%";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "H%n7\u001dD3p";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "H/g1\u001d";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "A5n$.F!v'\u0014";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "D0s\u000b\u0007@2p=\u001eK\u001fm5\u001c@";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "D0s\u000b\u0007@2p=\u001eK\u001f`;\u0015@";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "D0s";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "^`$1\u0003W/qsQ\u001f`$q\u0002\u0002`~";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public String c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(z[9], this.h);
            jSONObject.put(z[0], Build.BRAND);
            jSONObject.put(z[5], this.d);
            jSONObject.put(z[6], Build.MODEL);
            jSONObject.put(z[2], VERSION.RELEASE);
            jSONObject.put(z[8], this.g);
            jSONObject.put(z[10], this.a);
            jSONObject.put(z[4], this.f);
            jSONObject.put(z[3], this.b);
            jSONObject.put(z[7], this.c);
            return jSONObject.toString();
        } catch (JSONException e) {
            return String.format(z[1], new Object[]{e.getMessage()});
        }
    }

    public q(File file, int i, int i2, String str, String str2, String str3, String str4, String str5, String str6) {
        this.e = file;
        this.h = i;
        this.d = i2;
        this.i = str;
        this.g = str2;
        this.a = str3;
        this.f = str4;
        this.b = str5;
        this.c = str6;
    }

    public String a() {
        return this.i;
    }

    public File b() {
        return this.e;
    }
}
