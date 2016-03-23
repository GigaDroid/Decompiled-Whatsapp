package com.whatsapp;

import android.os.AsyncTask;
import org.json.JSONArray;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class as9 extends AsyncTask {
    private static final String[] z;
    final DescribeProblemActivity a;
    private String b;
    private JSONArray c;

    static {
        String[] strArr = new String[12];
        String str = "H8";
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
                        i3 = 36;
                        break;
                    case at.g /*1*/:
                        i3 = 95;
                        break;
                    case at.i /*2*/:
                        i3 = 100;
                        break;
                    case at.o /*3*/:
                        i3 = 113;
                        break;
                    default:
                        i3 = 20;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "L+\u0010\u0001g\u001epK\u0006cSq\u0013\u0019uP,\u0005\u0001d\n<\u000b\u001c;B>\u0015^wH6\u0001\u001f`{,\u0001\u0010fG7J\u0001|T`";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "H<";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "U*\u0001\u0003m";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "@:\u0017\u0012dV0\u0006^gA>\u0016\u0012|\u0004";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "E1\u0000\u0003{M;";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "q\u000b\"\\,";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "@:\u0017\u0012dV0\u0006^gA>\u0016\u0012|\u000b-\u0001\u0002aH+K\u0012{Q1\u0010Q";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "P6\u0010\u001dq";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "Q-\b";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "@:\u0017\u0012fM/\u0010\u0018{J";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "T3\u0005\u0005rK-\t";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected void onPostExecute(Object obj) {
        a((Void) obj);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected java.lang.Void a(java.lang.Void[] r8) {
        /*
        r7 = this;
        r2 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = new java.util.ArrayList;	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r0.<init>();	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r1 = new org.apache.http.message.BasicNameValuePair;	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r4 = z;	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r5 = 1;
        r4 = r4[r5];	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r5 = z;	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r6 = 6;
        r5 = r5[r6];	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r1.<init>(r4, r5);	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r0.add(r1);	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r1 = new org.apache.http.message.BasicNameValuePair;	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r4 = z;	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r5 = 0;
        r4 = r4[r5];	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r5 = com.whatsapp.aqu.g();	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r1.<init>(r4, r5);	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r0.add(r1);	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r1 = new org.apache.http.message.BasicNameValuePair;	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r4 = z;	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r5 = 3;
        r4 = r4[r5];	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r5 = com.whatsapp.aqu.c();	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r1.<init>(r4, r5);	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r0.add(r1);	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r1 = new org.apache.http.message.BasicNameValuePair;	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r4 = z;	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r5 = 4;
        r4 = r4[r5];	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r5 = r7.b;	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r1.<init>(r4, r5);	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r0.add(r1);	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r1 = new java.net.URL;	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r4 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r4.<init>();	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r5 = z;	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r6 = 2;
        r5 = r5[r6];	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r5 = z;	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r6 = 7;
        r5 = r5[r6];	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r0 = org.apache.http.client.utils.URLEncodedUtils.format(r0, r5);	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r0 = r4.append(r0);	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r0 = r0.toString();	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r1.<init>(r0);	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r0 = r1.openConnection();	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r1 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        r0.setConnectTimeout(r1);	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r1 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        r0.setReadTimeout(r1);	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r0 = r0.getInputStream();	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r4 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r4.<init>();	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r1 = new java.io.BufferedReader;	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r5 = new java.io.InputStreamReader;	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r5.<init>(r0);	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r1.<init>(r5);	 Catch:{ Exception -> 0x00d6, all -> 0x00ce }
        r0 = r1.readLine();	 Catch:{ Exception -> 0x00c1 }
    L_0x0094:
        if (r0 == 0) goto L_0x009f;
    L_0x0096:
        r4.append(r0);	 Catch:{ Exception -> 0x00c1 }
        r0 = r1.readLine();	 Catch:{ Exception -> 0x00c1 }
        if (r3 == 0) goto L_0x0094;
    L_0x009f:
        r0 = r4.toString();	 Catch:{ Exception -> 0x00c1 }
        r4 = android.text.TextUtils.isEmpty(r0);	 Catch:{ Exception -> 0x00bd }
        if (r4 == 0) goto L_0x00b2;
    L_0x00a9:
        r4 = new org.json.JSONArray;	 Catch:{ Exception -> 0x00bd }
        r4.<init>();	 Catch:{ Exception -> 0x00bd }
        r7.c = r4;	 Catch:{ Exception -> 0x00bd }
        if (r3 == 0) goto L_0x00b9;
    L_0x00b2:
        r3 = new org.json.JSONArray;	 Catch:{ Exception -> 0x00bf }
        r3.<init>(r0);	 Catch:{ Exception -> 0x00bf }
        r7.c = r3;	 Catch:{ Exception -> 0x00bf }
    L_0x00b9:
        com.whatsapp.util.ao.a(r1);
    L_0x00bc:
        return r2;
    L_0x00bd:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00bf }
    L_0x00bf:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00c1 }
    L_0x00c1:
        r0 = move-exception;
    L_0x00c2:
        r3 = z;	 Catch:{ all -> 0x00d3 }
        r4 = 5;
        r3 = r3[r4];	 Catch:{ all -> 0x00d3 }
        com.whatsapp.util.Log.b(r3, r0);	 Catch:{ all -> 0x00d3 }
        com.whatsapp.util.ao.a(r1);
        goto L_0x00bc;
    L_0x00ce:
        r0 = move-exception;
    L_0x00cf:
        com.whatsapp.util.ao.a(r2);
        throw r0;
    L_0x00d3:
        r0 = move-exception;
        r2 = r1;
        goto L_0x00cf;
    L_0x00d6:
        r0 = move-exception;
        r1 = r2;
        goto L_0x00c2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.as9.a(java.lang.Void[]):java.lang.Void");
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    protected void onPreExecute() {
        this.a.showDialog(2);
        this.b = DescribeProblemActivity.a(this.a).getText().toString().trim();
    }

    protected as9(DescribeProblemActivity describeProblemActivity) {
        this.a = describeProblemActivity;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a(java.lang.Void r12) {
        /*
        r11 = this;
        r9 = 0;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = r11.a;
        r2 = 2;
        r0.removeDialog(r2);
        r0 = r11.c;	 Catch:{ Exception -> 0x00b7 }
        if (r0 == 0) goto L_0x00bb;
    L_0x000d:
        r0 = r11.c;	 Catch:{ Exception -> 0x00b7 }
        r5 = r0.length();	 Catch:{ Exception -> 0x00b7 }
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00b7 }
        r0.<init>();	 Catch:{ Exception -> 0x00b7 }
        r2 = z;	 Catch:{ Exception -> 0x00b7 }
        r3 = 8;
        r2 = r2[r3];	 Catch:{ Exception -> 0x00b7 }
        r0 = r0.append(r2);	 Catch:{ Exception -> 0x00b7 }
        r0 = r0.append(r5);	 Catch:{ Exception -> 0x00b7 }
        r0 = r0.toString();	 Catch:{ Exception -> 0x00b7 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x00b7 }
        if (r5 <= 0) goto L_0x00bb;
    L_0x002f:
        r6 = new java.util.ArrayList;	 Catch:{ Exception -> 0x00b7 }
        r6.<init>(r5);	 Catch:{ Exception -> 0x00b7 }
        r7 = new java.util.ArrayList;	 Catch:{ Exception -> 0x00b7 }
        r7.<init>(r5);	 Catch:{ Exception -> 0x00b7 }
        r8 = new java.util.ArrayList;	 Catch:{ Exception -> 0x00b7 }
        r8.<init>(r5);	 Catch:{ Exception -> 0x00b7 }
        r0 = r9;
    L_0x003f:
        if (r0 >= r5) goto L_0x0072;
    L_0x0041:
        r2 = r11.c;	 Catch:{ Exception -> 0x00b7 }
        r2 = r2.optJSONObject(r0);	 Catch:{ Exception -> 0x00b7 }
        r3 = z;	 Catch:{ Exception -> 0x00b7 }
        r4 = 9;
        r3 = r3[r4];	 Catch:{ Exception -> 0x00b7 }
        r3 = r2.getString(r3);	 Catch:{ Exception -> 0x00b7 }
        r6.add(r3);	 Catch:{ Exception -> 0x00b7 }
        r3 = z;	 Catch:{ Exception -> 0x00b7 }
        r4 = 11;
        r3 = r3[r4];	 Catch:{ Exception -> 0x00b7 }
        r3 = r2.getString(r3);	 Catch:{ Exception -> 0x00b7 }
        r7.add(r3);	 Catch:{ Exception -> 0x00b7 }
        r3 = z;	 Catch:{ Exception -> 0x00b7 }
        r4 = 10;
        r3 = r3[r4];	 Catch:{ Exception -> 0x00b7 }
        r2 = r2.getString(r3);	 Catch:{ Exception -> 0x00b7 }
        r8.add(r2);	 Catch:{ Exception -> 0x00b7 }
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x003f;
    L_0x0072:
        r3 = new java.util.ArrayList;	 Catch:{ Exception -> 0x00b7 }
        r3.<init>();	 Catch:{ Exception -> 0x00b7 }
        r0 = r11.a;	 Catch:{ Exception -> 0x00b7 }
        r2 = com.whatsapp.DescribeProblemActivity.b(r0);	 Catch:{ Exception -> 0x00b7 }
        r4 = r2.length;	 Catch:{ Exception -> 0x00b7 }
        r0 = r9;
    L_0x007f:
        if (r0 >= r4) goto L_0x008c;
    L_0x0081:
        r10 = r2[r0];	 Catch:{ Exception -> 0x00b7 }
        if (r10 == 0) goto L_0x0088;
    L_0x0085:
        r3.add(r10);	 Catch:{ Exception -> 0x00b5 }
    L_0x0088:
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x007f;
    L_0x008c:
        r0 = r11.a;	 Catch:{ Exception -> 0x00b7 }
        r1 = r11.a;	 Catch:{ Exception -> 0x00b7 }
        r1 = com.whatsapp.DescribeProblemActivity.c(r1);	 Catch:{ Exception -> 0x00b7 }
        r2 = r11.a;	 Catch:{ Exception -> 0x00b7 }
        r2 = com.whatsapp.DescribeProblemActivity.a(r2);	 Catch:{ Exception -> 0x00b7 }
        r2 = r2.getText();	 Catch:{ Exception -> 0x00b7 }
        r2 = r2.toString();	 Catch:{ Exception -> 0x00b7 }
        r2 = r2.trim();	 Catch:{ Exception -> 0x00b7 }
        r4 = r11.a;	 Catch:{ Exception -> 0x00b7 }
        r4 = com.whatsapp.DescribeProblemActivity.g(r4);	 Catch:{ Exception -> 0x00b7 }
        com.whatsapp.SearchFAQ.a(r0, r1, r2, r3, r4, r5, r6, r7, r8);	 Catch:{ Exception -> 0x00b7 }
        r0 = r11.a;	 Catch:{ Exception -> 0x00b7 }
        r0.finish();	 Catch:{ Exception -> 0x00b7 }
    L_0x00b4:
        return;
    L_0x00b5:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00b7 }
    L_0x00b7:
        r0 = move-exception;
        com.whatsapp.util.Log.a(r0);
    L_0x00bb:
        r0 = r11.a;
        r1 = 0;
        com.whatsapp.DescribeProblemActivity.a(r0, r1);
        r0 = r11.a;
        r0 = com.whatsapp.DescribeProblemActivity.e(r0);
        r1 = new java.lang.Void[r9];
        com.whatsapp.util.bq.a(r0, r1);
        goto L_0x00b4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.as9.a(java.lang.Void):void");
    }
}
