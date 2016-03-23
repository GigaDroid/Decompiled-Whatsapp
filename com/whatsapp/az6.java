package com.whatsapp;

import android.content.SharedPreferences;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Pair;
import com.whatsapp.fieldstats.f;
import com.whatsapp.fieldstats.i;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class az6 extends AsyncTask {
    private static final String[] z;
    private long a;
    final DescribeProblemActivity b;
    private boolean c;
    private String d;
    private long e;

    static {
        String[] strArr = new String[14];
        String str = "oeHU{gn";
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
                        i3 = 10;
                        break;
                    case at.i /*2*/:
                        i3 = 61;
                        break;
                    case at.o /*3*/:
                        i3 = 59;
                        break;
                    default:
                        i3 = 15;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "oeHU{gnbI`";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "foNX}khXK}mhQ^bciIRyk~D\u0014zrfRZk/fR\\|\"fR\\/qcG^/*/Y\u0012/ky\u001dYfemXI/vb\\U/okE\u001bnv~\\XgooSO/qcG^/*/Y\u0012#\"\u007fMW`cnX_/fcO^lvfD\u0017/po[\u001bff0\u001d\u001e|";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "aeP\u0015xjkIHnrzbK}glXIjliXH";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "foNX\u007fpe_\u0014\u007fpcK\u0014\u007fki\u0000";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "rxTMnasbK}mlTWj]zUT{m";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "rxTMnasbWnq~bHjgd";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "foNX\u007fpe_\u0014\u007fpcK\u0014}gkYIjaoTK{q7";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "po\\_Ppo^^fr~Ndjlk_Wjf";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    str = "foNX\u007fpe_";
                    obj = 9;
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    strArr2 = strArr3;
                    str = "foNX\u007fpe_\u0014\u007fpcK\u0014ccyI\u0006";
                    obj = 10;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "foNX\u007fpe_\u0014\u007fpcK\u0014|vkIN|?";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "rxTMnasbH{c~HH";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "foNX}khXK}mhQ^bciIRyk~D\u0014jz~XIacfNO`pkZ^ c|\\Rc\"oEOjpd\\W/q~RIneo\u001dU`v*^Zca\u007fQZ{gn\u0011\u001b|vkI^2";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected void a(Pair pair) {
        boolean z = DialogToastActivity.f;
        String str = (String) pair.first;
        File file = (File) pair.second;
        this.b.removeDialog(1);
        ArrayList arrayList = new ArrayList();
        Uri[] b = DescribeProblemActivity.b(this.b);
        int length = b.length;
        int i = 0;
        while (i < length) {
            Object obj = b[i];
            if (obj != null) {
                arrayList.add(obj);
            }
            i++;
            if (z) {
                break;
            }
        }
        DescribeProblemActivity.d(this.b).m = Double.valueOf((double) f.EMAIL_SEND.getCode());
        i.a(this.b, DescribeProblemActivity.d(this.b));
        asx.a(this.b, DescribeProblemActivity.c(this.b), DescribeProblemActivity.a(this.b).getText().toString().trim(), arrayList, DescribeProblemActivity.g(this.b), str, file, this.a, this.e, this.d, this.c);
        DescribeProblemActivity.a(this.b, null);
        this.b.finish();
    }

    protected az6(DescribeProblemActivity describeProblemActivity) {
        this.b = describeProblemActivity;
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected android.util.Pair a(java.lang.Void[] r13) {
        /*
        r12 = this;
        r0 = com.whatsapp.App.ak();
        r12.e = r0;
        r0 = android.os.Environment.getExternalStorageState();
        r12.d = r0;
        r0 = z;
        r1 = 0;
        r0 = r0[r1];
        r1 = r12.d;
        r0 = r0.equals(r1);
        if (r0 != 0) goto L_0x0026;
    L_0x0019:
        r0 = z;
        r1 = 2;
        r0 = r0[r1];
        r1 = r12.d;
        r0 = r0.equals(r1);
        if (r0 == 0) goto L_0x0030;
    L_0x0026:
        r0 = com.whatsapp.App.T();
        r12.a = r0;
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x004f;
    L_0x0030:
        r0 = -2;
        r12.a = r0;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 1;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r12.d;
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
    L_0x004f:
        r1 = r12.b;
        r0 = r12.b;
        r2 = com.whatsapp.DescribeProblemActivity.c(r0);
        r0 = r12.b;
        r3 = com.whatsapp.DescribeProblemActivity.g(r0);
        r4 = 0;
        r5 = 1;
        r6 = r12.a;
        r8 = r12.e;
        r10 = r12.d;
        r11 = com.whatsapp.asx.d();
        r0 = com.whatsapp.asx.a(r1, r2, r3, r4, r5, r6, r8, r10, r11);
        com.whatsapp.util.Log.i(r0);
        r3 = com.whatsapp.asx.b(r0);
        com.whatsapp.util.Log.a();
        com.whatsapp.util.Log.b();
        r1 = com.whatsapp.asx.a(r3);
        r0 = 0;
        if (r1 != 0) goto L_0x0094;
    L_0x0081:
        r0 = com.whatsapp.asx.c();
        r2 = r1;
        r1 = r0;
    L_0x0087:
        if (r3 == 0) goto L_0x00d5;
    L_0x0089:
        if (r2 == 0) goto L_0x00d5;
    L_0x008b:
        r0 = 1;
    L_0x008c:
        r12.c = r0;
        r0 = new android.util.Pair;
        r0.<init>(r1, r2);
        return r0;
    L_0x0094:
        r4 = r1.length();
        r6 = 5242880; // 0x500000 float:7.34684E-39 double:2.590327E-317;
        r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r2 <= 0) goto L_0x00d7;
    L_0x009f:
        r2 = com.whatsapp.App.am;
        r4 = 3;
        if (r2 == r4) goto L_0x00d7;
    L_0x00a4:
        r0 = com.whatsapp.asx.c();
        r2 = java.util.Locale.ENGLISH;
        r4 = z;
        r5 = 3;
        r4 = r4[r5];
        r5 = 3;
        r5 = new java.lang.Object[r5];
        r6 = 0;
        r8 = r1.length();
        r1 = java.lang.Long.valueOf(r8);
        r5[r6] = r1;
        r1 = 1;
        r6 = 5242880; // 0x500000 float:7.34684E-39 double:2.590327E-317;
        r6 = java.lang.Long.valueOf(r6);
        r5[r1] = r6;
        r1 = 2;
        r5[r1] = r0;
        r1 = java.lang.String.format(r2, r4, r5);
        com.whatsapp.util.Log.i(r1);
        r1 = 0;
        r2 = r1;
        r1 = r0;
        goto L_0x0087;
    L_0x00d5:
        r0 = 0;
        goto L_0x008c;
    L_0x00d7:
        r2 = r1;
        r1 = r0;
        goto L_0x0087;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.az6.a(java.lang.Void[]):android.util.Pair");
    }

    protected void onPreExecute() {
        this.b.showDialog(1);
        SharedPreferences sharedPreferences = this.b.getSharedPreferences(z[4], 0);
        Log.i(z[11] + SettingsPrivacy.a(sharedPreferences.getInt(z[7], 0)));
        Log.i(z[5] + SettingsPrivacy.a(sharedPreferences.getInt(z[6], 0)));
        Log.i(z[12] + SettingsPrivacy.a(sharedPreferences.getInt(z[13], 0)));
        Log.i(z[8] + sharedPreferences.getBoolean(z[9], true));
        a3b.a(this.b.getBaseContext()).d(z[10]);
    }

    protected void onPostExecute(Object obj) {
        a((Pair) obj);
    }
}
