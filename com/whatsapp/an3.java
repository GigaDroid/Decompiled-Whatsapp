package com.whatsapp;

import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Environment;
import android.util.Pair;
import com.whatsapp.fieldstats.f;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Locale;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class an3 extends AsyncTask {
    private static final String[] z;
    private boolean a;
    final SearchFAQ b;
    private final as8 c;
    private String d;
    private long e;
    private long f;

    static {
        String[] strArr = new String[11];
        String str = "(Z,/U(Z..c*K>\u0014o4^/'o>";
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
                        i3 = 90;
                        break;
                    case at.g /*1*/:
                        i3 = 63;
                        break;
                    case at.i /*2*/:
                        i3 = 77;
                        break;
                    case at.o /*3*/:
                        i3 = 75;
                        break;
                    default:
                        i3 = 10;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = ">Z>(z(P/dz(V;dx?^)9o9Z$;~)\u0002";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "*M$=k9F\u0012;x5Y$'o\u0005O%$~5";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = ">Z>(z(P/dz(V;df;L9v";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "*M$=k9F\u0012'k)K\u00128o?Q";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "9P e}2^98k*O\u0012;x?Y(9o4\\(8";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = ">Z>(z(P/dz(V;dz3\\p";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = ">Z>(z(P/";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = ">Z>(z(P/dz(V;dy.^9>yg";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = ">Z>(x3](;x5]!.g;\\9\"|3K4d\u007f*S\"*nwS\",yzS\",*)V7.*r\u001a)b*3Lm)c=X(9*.W,%*7^5kk.K,(b7Z#?*)V7.*r\u001a)b&zJ='e;[(/*>V?.i.S4g*(Z+kc>\u0005mny";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "*M$=k9F\u00128~;K88";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected void onPostExecute(Object obj) {
        a((Pair) obj);
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    protected an3(SearchFAQ searchFAQ) {
        this.b = searchFAQ;
        this.c = new azw(this);
    }

    protected void onPreExecute() {
        this.b.showDialog(1);
        SharedPreferences sharedPreferences = this.b.getSharedPreferences(z[6], 0);
        Log.i(z[4] + SettingsPrivacy.a(sharedPreferences.getInt(z[5], 0)));
        Log.i(z[7] + SettingsPrivacy.a(sharedPreferences.getInt(z[3], 0)));
        Log.i(z[9] + SettingsPrivacy.a(sharedPreferences.getInt(z[1], 0)));
        Log.i(z[2] + sharedPreferences.getBoolean(z[0], true));
        a3b.a(this.b.getBaseContext()).d(z[8]);
    }

    static long a(an3 com_whatsapp_an3, long j) {
        com_whatsapp_an3.f = j;
        return j;
    }

    protected Pair a(Void[] voidArr) {
        Object obj;
        Object c;
        boolean z;
        this.e = App.ak();
        this.d = Environment.getExternalStorageState();
        if (App.b(this.c)) {
            this.f = App.T();
        }
        String a = asx.a(this.b, SearchFAQ.c(this.b), SearchFAQ.d(this.b), null, true, this.f, this.e, this.d, asx.d());
        Log.i(a);
        File b = asx.b(a);
        Log.a();
        Log.b();
        File a2 = asx.a(b);
        if (a2 == null) {
            obj = a2;
            c = asx.c();
        } else if (a2.length() <= 5242880 || App.am == 3) {
            File file = a2;
            c = null;
        } else {
            a = asx.c();
            Log.i(String.format(Locale.ENGLISH, z[10], new Object[]{Long.valueOf(a2.length()), Long.valueOf(5242880), a}));
            obj = null;
            String str = a;
        }
        if (b == null || obj == null) {
            z = false;
        } else {
            z = true;
        }
        this.a = z;
        return new Pair(c, obj);
    }

    protected void a(Pair pair) {
        String str = (String) pair.first;
        File file = (File) pair.second;
        this.b.removeDialog(1);
        SearchFAQ.a(this.b, f.EMAIL_SEND.getCode());
        SearchFAQ.b(this.b);
        if (asx.a(this.b, SearchFAQ.c(this.b), SearchFAQ.a(this.b), SearchFAQ.e(this.b), SearchFAQ.d(this.b), str, file, this.f, this.e, this.d, this.a)) {
            this.b.finish();
        }
    }

    static String a(an3 com_whatsapp_an3) {
        return com_whatsapp_an3.d;
    }
}
