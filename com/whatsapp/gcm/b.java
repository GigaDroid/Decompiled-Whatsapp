package com.whatsapp.gcm;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.whatsapp.WAAppCompatActivity;
import com.whatsapp.arj;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class b {
    private static final String[] z;
    private final Context a;

    static {
        String[] strArr = new String[14];
        String str = "E\b\u0018\u0000WT_\u001b2aB";
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
                        i3 = 38;
                        break;
                    case at.g /*1*/:
                        i3 = 58;
                        break;
                    case at.i /*2*/:
                        i3 = 124;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_switchStyle;
                        break;
                    default:
                        i3 = 8;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "E\b\u0018\u0000WT_\u001b2aB";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "E\b\u0018\u0000WT_\b\u001fqyY\u0013\u0018fR";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "E\b\u0018\u0000WGJ\f2~CH\u000f";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "t_\u001b\u0004{RH\u001d\u0019aIT/\u0019gT[\u001b\b@CV\f\bz\u001c\u001a\u0018\bdCN\u0015\u0003o\u0006J\t\u001e`\u0006N\u0013\u0006mH\u001a\u0015\u0003nIH\u0011\f|OU\u0012";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "EU\u0011C\u007fN[\b\u001eiVJ#\u001dzC\\\u0019\u001fmHY\u0019\u001e";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "A_\b.}TH\u0019\u0003|gJ\f\u0001aE[\b\u0004gHl\u0019\u001f{OU\u0012";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    str = "E\b\u0018\u0000WT_\b\u001fqyY\u0013\u0018fR";
                    obj = 7;
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    strArr2 = strArr3;
                    str = "E\b\u0018\u0000WT_\u001b2aB";
                    obj = 8;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "E\b\u0018\u0000WT_\u001b2aB";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "E\b\u0018\u0000WT_\b\u001fqyY\u0013\u0018fR";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "E\b\u0018\u0000WGJ\f2~CH\u000f";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "E\b\u0018\u0000WT_\b\u001fqyY\u0013\u0018fR";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "E\b\u0018\u0000WGJ\f2~CH\u000f";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public int c() {
        return f().getInt(z[1], 0);
    }

    private SharedPreferences f() {
        return this.a.getSharedPreferences(z[6], 0);
    }

    public void h() {
        int i = RegistrationIntentService.b;
        Log.w(z[5]);
        Editor edit = f().edit();
        edit.remove(z[2]);
        edit.remove(z[4]);
        edit.remove(z[3]);
        Log.b(edit.commit());
        if (i != 0) {
            WAAppCompatActivity.c++;
        }
    }

    public boolean d() {
        return f().contains(z[9]);
    }

    public String i() {
        return f().getString(z[10], null);
    }

    public int e() {
        try {
            return this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0).versionCode;
        } catch (Throwable e) {
            Log.b(z[7], e);
            return -1;
        }
    }

    public b(Context context) {
        this.a = context;
    }

    public void a(int i) {
        Log.b(f().edit().putInt(z[12], i).commit());
    }

    public void a() {
        Log.b(f().edit().remove(z[11]).commit());
    }

    public int g() {
        return f().getInt(z[8], 0);
    }

    public void a(String str) {
        Log.b(f().edit().putString(z[0], str).commit());
    }

    public void b() {
        int g = g();
        if (g < Integer.MAX_VALUE) {
            g++;
        }
        Log.b(f().edit().putInt(z[13], g).commit());
    }
}
