package com.whatsapp;

import android.location.Location;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.whatsapp.fieldstats.a3;
import com.whatsapp.fieldstats.br;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class k1 implements Serializable {
    private static final String[] B;
    private static int b = 0;
    private static final String c;
    private static final String g;
    private static ArrayList h = null;
    private static String l = null;
    private static final int m = 30;
    private static int r = 0;
    private static final long serialVersionUID = 1;
    private static int u;
    private static final String y;
    private String A;
    private final int a;
    private String d;
    private final double e;
    private final String f;
    private final ArrayList i;
    private boolean j;
    private long k;
    private boolean n;
    private final int o;
    private String p;
    private int q;
    private final double s;
    private int t;
    private String v;
    private transient Location w;
    private String x;
    private a3 z;

    @WorkerThread
    @NonNull
    private static k1 c(Location location, int i, String str) {
        return a(location, i, str, 0);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.support.annotation.WorkerThread
    @android.support.annotation.NonNull
    private static com.whatsapp.k1 a(android.location.Location r10, int r11, java.lang.String r12, int r13) {
        /*
        r3 = 1;
        r0 = android.os.SystemClock.uptimeMillis();
        r2 = new com.whatsapp.k1;
        r2.<init>(r3, r10, r11, r12);
        r3 = new java.util.ArrayList;
        r3.<init>();
        r4 = new org.apache.http.message.BasicNameValuePair;	 Catch:{ NumberFormatException -> 0x0140 }
        r5 = B;	 Catch:{ NumberFormatException -> 0x0140 }
        r6 = 36;
        r5 = r5[r6];	 Catch:{ NumberFormatException -> 0x0140 }
        r6 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0140 }
        r6.<init>();	 Catch:{ NumberFormatException -> 0x0140 }
        r8 = r10.getLatitude();	 Catch:{ NumberFormatException -> 0x0140 }
        r6 = r6.append(r8);	 Catch:{ NumberFormatException -> 0x0140 }
        r7 = ",";
        r6 = r6.append(r7);	 Catch:{ NumberFormatException -> 0x0140 }
        r8 = r10.getLongitude();	 Catch:{ NumberFormatException -> 0x0140 }
        r6 = r6.append(r8);	 Catch:{ NumberFormatException -> 0x0140 }
        r6 = r6.toString();	 Catch:{ NumberFormatException -> 0x0140 }
        r4.<init>(r5, r6);	 Catch:{ NumberFormatException -> 0x0140 }
        r3.add(r4);	 Catch:{ NumberFormatException -> 0x0140 }
        r4 = android.text.TextUtils.isEmpty(r12);	 Catch:{ NumberFormatException -> 0x0140 }
        if (r4 != 0) goto L_0x0066;
    L_0x0043:
        r4 = new org.apache.http.message.BasicNameValuePair;	 Catch:{ NumberFormatException -> 0x0140 }
        r5 = B;	 Catch:{ NumberFormatException -> 0x0140 }
        r6 = 29;
        r5 = r5[r6];	 Catch:{ NumberFormatException -> 0x0140 }
        r6 = 4999; // 0x1387 float:7.005E-42 double:2.47E-320;
        r6 = java.lang.Math.min(r11, r6);	 Catch:{ NumberFormatException -> 0x0140 }
        r6 = java.lang.Integer.toString(r6);	 Catch:{ NumberFormatException -> 0x0140 }
        r4.<init>(r5, r6);	 Catch:{ NumberFormatException -> 0x0140 }
        r3.add(r4);	 Catch:{ NumberFormatException -> 0x0140 }
        r4 = new org.apache.http.message.BasicNameValuePair;	 Catch:{ NumberFormatException -> 0x0140 }
        r5 = "q";
        r4.<init>(r5, r12);	 Catch:{ NumberFormatException -> 0x0140 }
        r3.add(r4);	 Catch:{ NumberFormatException -> 0x0140 }
    L_0x0066:
        r4 = new org.apache.http.message.BasicNameValuePair;	 Catch:{ NumberFormatException -> 0x0142 }
        r5 = B;	 Catch:{ NumberFormatException -> 0x0142 }
        r6 = 31;
        r5 = r5[r6];	 Catch:{ NumberFormatException -> 0x0142 }
        r6 = B;	 Catch:{ NumberFormatException -> 0x0142 }
        r7 = 42;
        r6 = r6[r7];	 Catch:{ NumberFormatException -> 0x0142 }
        r4.<init>(r5, r6);	 Catch:{ NumberFormatException -> 0x0142 }
        r3.add(r4);	 Catch:{ NumberFormatException -> 0x0142 }
        r4 = new org.apache.http.message.BasicNameValuePair;	 Catch:{ NumberFormatException -> 0x0142 }
        r5 = B;	 Catch:{ NumberFormatException -> 0x0142 }
        r6 = 32;
        r5 = r5[r6];	 Catch:{ NumberFormatException -> 0x0142 }
        r6 = 30;
        r6 = java.lang.Integer.toString(r6);	 Catch:{ NumberFormatException -> 0x0142 }
        r4.<init>(r5, r6);	 Catch:{ NumberFormatException -> 0x0142 }
        r3.add(r4);	 Catch:{ NumberFormatException -> 0x0142 }
        r4 = new org.apache.http.message.BasicNameValuePair;	 Catch:{ NumberFormatException -> 0x0142 }
        r5 = B;	 Catch:{ NumberFormatException -> 0x0142 }
        r6 = 30;
        r5 = r5[r6];	 Catch:{ NumberFormatException -> 0x0142 }
        r6 = B;	 Catch:{ NumberFormatException -> 0x0142 }
        r7 = 39;
        r6 = r6[r7];	 Catch:{ NumberFormatException -> 0x0142 }
        r4.<init>(r5, r6);	 Catch:{ NumberFormatException -> 0x0142 }
        r3.add(r4);	 Catch:{ NumberFormatException -> 0x0142 }
        if (r13 == 0) goto L_0x00b6;
    L_0x00a4:
        r4 = new org.apache.http.message.BasicNameValuePair;	 Catch:{ NumberFormatException -> 0x0142 }
        r5 = B;	 Catch:{ NumberFormatException -> 0x0142 }
        r6 = 33;
        r5 = r5[r6];	 Catch:{ NumberFormatException -> 0x0142 }
        r6 = java.lang.Integer.toString(r13);	 Catch:{ NumberFormatException -> 0x0142 }
        r4.<init>(r5, r6);	 Catch:{ NumberFormatException -> 0x0142 }
        r3.add(r4);	 Catch:{ NumberFormatException -> 0x0142 }
    L_0x00b6:
        r4 = com.whatsapp.App.z();
        r4 = r4.getResources();
        r4 = r4.getConfiguration();
        r4 = r4.locale;
        if (r4 == 0) goto L_0x00d8;
    L_0x00c6:
        r5 = new org.apache.http.message.BasicNameValuePair;	 Catch:{ NumberFormatException -> 0x0144 }
        r6 = B;	 Catch:{ NumberFormatException -> 0x0144 }
        r7 = 34;
        r6 = r6[r7];	 Catch:{ NumberFormatException -> 0x0144 }
        r4 = r4.getLanguage();	 Catch:{ NumberFormatException -> 0x0144 }
        r5.<init>(r6, r4);	 Catch:{ NumberFormatException -> 0x0144 }
        r3.add(r5);	 Catch:{ NumberFormatException -> 0x0144 }
    L_0x00d8:
        r4 = new org.apache.http.params.BasicHttpParams;
        r4.<init>();
        r5 = 15000; // 0x3a98 float:2.102E-41 double:7.411E-320;
        org.apache.http.params.HttpConnectionParams.setConnectionTimeout(r4, r5);
        r5 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        org.apache.http.params.HttpConnectionParams.setSoTimeout(r4, r5);
        r5 = com.whatsapp.vn.a();
        org.apache.http.params.HttpProtocolParams.setUserAgent(r4, r5);
        r5 = new org.apache.http.impl.client.DefaultHttpClient;
        r5.<init>(r4);
        r4 = new org.apache.http.client.methods.HttpGet;
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r7 = com.whatsapp.azx.n;
        r6 = r6.append(r7);
        r7 = B;
        r8 = 40;
        r7 = r7[r8];
        r6 = r6.append(r7);
        r7 = com.whatsapp.azx.a;
        r6 = r6.append(r7);
        r7 = "&";
        r6 = r6.append(r7);
        r7 = B;
        r8 = 43;
        r7 = r7[r8];
        r3 = org.apache.http.client.utils.URLEncodedUtils.format(r3, r7);
        r3 = r6.append(r3);
        r3 = r3.toString();
        r4.<init>(r3);
        r3 = r5.execute(r4);
        if (r3 != 0) goto L_0x0146;
    L_0x0132:
        r0 = new java.io.IOException;	 Catch:{ NumberFormatException -> 0x013e }
        r1 = B;	 Catch:{ NumberFormatException -> 0x013e }
        r2 = 41;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x013e }
        r0.<init>(r1);	 Catch:{ NumberFormatException -> 0x013e }
        throw r0;	 Catch:{ NumberFormatException -> 0x013e }
    L_0x013e:
        r0 = move-exception;
        throw r0;
    L_0x0140:
        r0 = move-exception;
        throw r0;
    L_0x0142:
        r0 = move-exception;
        throw r0;
    L_0x0144:
        r0 = move-exception;
        throw r0;
    L_0x0146:
        r4 = r3.getStatusLine();
        r4 = r4.getStatusCode();
        r5 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r4 != r5) goto L_0x0194;
    L_0x0152:
        r4 = r3.getEntity();
        r4 = org.apache.http.util.EntityUtils.toString(r4);
        r5 = new org.json.JSONObject;
        r5.<init>(r4);
        r2.b(r5);
        r4 = B;
        r6 = 44;
        r4 = r4[r6];
        r4 = r5.has(r4);
        if (r4 == 0) goto L_0x018b;
    L_0x016e:
        r4 = B;
        r6 = 38;
        r4 = r4[r6];
        r4 = r5.getJSONObject(r4);
        r5 = B;	 Catch:{ NumberFormatException -> 0x01cb }
        r6 = 37;
        r5 = r5[r6];	 Catch:{ NumberFormatException -> 0x01cb }
        r4 = r4.has(r5);	 Catch:{ NumberFormatException -> 0x01cb }
        if (r4 == 0) goto L_0x018b;
    L_0x0184:
        r4 = 1;
        r2.n = r4;	 Catch:{ NumberFormatException -> 0x01cb }
        r4 = r13 + 30;
        r2.t = r4;	 Catch:{ NumberFormatException -> 0x01cb }
    L_0x018b:
        if (r13 != 0) goto L_0x0190;
    L_0x018d:
        a(r2);	 Catch:{ NumberFormatException -> 0x01cd }
    L_0x0190:
        r4 = com.whatsapp.DialogToastActivity.f;	 Catch:{ NumberFormatException -> 0x01cf }
        if (r4 == 0) goto L_0x01c2;
    L_0x0194:
        r4 = com.whatsapp.fieldstats.a3.FAILED_OTHER;	 Catch:{ NumberFormatException -> 0x01cf }
        r2.z = r4;	 Catch:{ NumberFormatException -> 0x01cf }
        r3 = r3.getStatusLine();	 Catch:{ NumberFormatException -> 0x01cf }
        r3 = r3.getStatusCode();	 Catch:{ NumberFormatException -> 0x01cf }
        r3 = java.lang.String.valueOf(r3);	 Catch:{ NumberFormatException -> 0x01cf }
        r2.A = r3;	 Catch:{ NumberFormatException -> 0x01cf }
        r3 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x01cf }
        r3.<init>();	 Catch:{ NumberFormatException -> 0x01cf }
        r4 = B;	 Catch:{ NumberFormatException -> 0x01cf }
        r5 = 35;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x01cf }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x01cf }
        r4 = r2.A;	 Catch:{ NumberFormatException -> 0x01cf }
        r3 = r3.append(r4);	 Catch:{ NumberFormatException -> 0x01cf }
        r3 = r3.toString();	 Catch:{ NumberFormatException -> 0x01cf }
        com.whatsapp.util.Log.e(r3);	 Catch:{ NumberFormatException -> 0x01cf }
    L_0x01c2:
        r4 = android.os.SystemClock.uptimeMillis();
        r0 = r4 - r0;
        r2.k = r0;
        return r2;
    L_0x01cb:
        r0 = move-exception;
        throw r0;
    L_0x01cd:
        r0 = move-exception;
        throw r0;
    L_0x01cf:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.k1.a(android.location.Location, int, java.lang.String, int):com.whatsapp.k1");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int[] m() {
        /*
        r3 = 3;
        r1 = 2;
        r0 = 1;
        r2 = com.whatsapp.DialogToastActivity.f;
        r3 = new int[r3];
        r4 = 0;
        r5 = j();	 Catch:{ NumberFormatException -> 0x0021 }
        r3[r4] = r5;	 Catch:{ NumberFormatException -> 0x0021 }
        r4 = java.lang.Math.random();	 Catch:{ NumberFormatException -> 0x0021 }
        r6 = 4602678819172646912; // 0x3fe0000000000000 float:0.0 double:0.5;
        r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r4 < 0) goto L_0x0023;
    L_0x0018:
        r1 = 3 - r0;
        r4 = 0;
        r4 = r3[r4];	 Catch:{ NumberFormatException -> 0x003e }
        switch(r4) {
            case 1: goto L_0x0025;
            case 2: goto L_0x002d;
            case 3: goto L_0x0035;
            default: goto L_0x0020;
        };
    L_0x0020:
        return r3;
    L_0x0021:
        r0 = move-exception;
        throw r0;
    L_0x0023:
        r0 = r1;
        goto L_0x0018;
    L_0x0025:
        r4 = 2;
        r3[r0] = r4;	 Catch:{ NumberFormatException -> 0x0040 }
        r4 = 3;
        r3[r1] = r4;	 Catch:{ NumberFormatException -> 0x0040 }
        if (r2 == 0) goto L_0x0020;
    L_0x002d:
        r4 = 1;
        r3[r0] = r4;	 Catch:{ NumberFormatException -> 0x003c }
        r4 = 3;
        r3[r1] = r4;	 Catch:{ NumberFormatException -> 0x003c }
        if (r2 == 0) goto L_0x0020;
    L_0x0035:
        r2 = 1;
        r3[r0] = r2;	 Catch:{ NumberFormatException -> 0x003c }
        r0 = 2;
        r3[r1] = r0;	 Catch:{ NumberFormatException -> 0x003c }
        goto L_0x0020;
    L_0x003c:
        r0 = move-exception;
        throw r0;
    L_0x003e:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0040 }
    L_0x0040:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x003c }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.k1.m():int[]");
    }

    private static void b(k1 k1Var) {
        nf.a(App.z(), c(k1Var.b()), c(c()), k1Var.z, k1Var.A, k1Var.q, k1Var.q(), k1Var.g(), k1Var.o(), k1Var.d());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.support.annotation.WorkerThread
    @android.support.annotation.NonNull
    private static com.whatsapp.k1 e(android.location.Location r10, int r11, java.lang.String r12) {
        /*
        r2 = android.os.SystemClock.uptimeMillis();
        r1 = new com.whatsapp.k1;
        r0 = 3;
        r1.<init>(r0, r10, r11, r12);
        r0 = new java.util.ArrayList;
        r0.<init>();
        r4 = new org.apache.http.message.BasicNameValuePair;	 Catch:{ NumberFormatException -> 0x00bb }
        r5 = B;	 Catch:{ NumberFormatException -> 0x00bb }
        r6 = 10;
        r5 = r5[r6];	 Catch:{ NumberFormatException -> 0x00bb }
        r6 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x00bb }
        r6.<init>();	 Catch:{ NumberFormatException -> 0x00bb }
        r8 = r10.getLatitude();	 Catch:{ NumberFormatException -> 0x00bb }
        r6 = r6.append(r8);	 Catch:{ NumberFormatException -> 0x00bb }
        r7 = ",";
        r6 = r6.append(r7);	 Catch:{ NumberFormatException -> 0x00bb }
        r8 = r10.getLongitude();	 Catch:{ NumberFormatException -> 0x00bb }
        r6 = r6.append(r8);	 Catch:{ NumberFormatException -> 0x00bb }
        r6 = r6.toString();	 Catch:{ NumberFormatException -> 0x00bb }
        r4.<init>(r5, r6);	 Catch:{ NumberFormatException -> 0x00bb }
        r0.add(r4);	 Catch:{ NumberFormatException -> 0x00bb }
        r4 = new org.apache.http.message.BasicNameValuePair;	 Catch:{ NumberFormatException -> 0x00bb }
        r5 = B;	 Catch:{ NumberFormatException -> 0x00bb }
        r6 = 16;
        r5 = r5[r6];	 Catch:{ NumberFormatException -> 0x00bb }
        r6 = 99999; // 0x1869f float:1.40128E-40 double:4.9406E-319;
        r6 = java.lang.Math.min(r11, r6);	 Catch:{ NumberFormatException -> 0x00bb }
        r6 = java.lang.Integer.toString(r6);	 Catch:{ NumberFormatException -> 0x00bb }
        r4.<init>(r5, r6);	 Catch:{ NumberFormatException -> 0x00bb }
        r0.add(r4);	 Catch:{ NumberFormatException -> 0x00bb }
        r4 = android.text.TextUtils.isEmpty(r12);	 Catch:{ NumberFormatException -> 0x00bb }
        if (r4 != 0) goto L_0x006a;
    L_0x005c:
        r4 = new org.apache.http.message.BasicNameValuePair;	 Catch:{ NumberFormatException -> 0x00bb }
        r5 = B;	 Catch:{ NumberFormatException -> 0x00bb }
        r6 = 12;
        r5 = r5[r6];	 Catch:{ NumberFormatException -> 0x00bb }
        r4.<init>(r5, r12);	 Catch:{ NumberFormatException -> 0x00bb }
        r0.add(r4);	 Catch:{ NumberFormatException -> 0x00bb }
    L_0x006a:
        r4 = new org.apache.http.params.BasicHttpParams;
        r4.<init>();
        r5 = 15000; // 0x3a98 float:2.102E-41 double:7.411E-320;
        org.apache.http.params.HttpConnectionParams.setConnectionTimeout(r4, r5);
        r5 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        org.apache.http.params.HttpConnectionParams.setSoTimeout(r4, r5);
        r5 = com.whatsapp.vn.a();
        org.apache.http.params.HttpProtocolParams.setUserAgent(r4, r5);
        r5 = new org.apache.http.impl.client.DefaultHttpClient;
        r5.<init>(r4);
        r4 = new org.apache.http.client.methods.HttpGet;
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r7 = com.whatsapp.azx.m;
        r6 = r6.append(r7);
        r7 = B;
        r8 = 14;
        r7 = r7[r8];
        r0 = org.apache.http.client.utils.URLEncodedUtils.format(r0, r7);
        r0 = r6.append(r0);
        r0 = r0.toString();
        r4.<init>(r0);
        r4 = r5.execute(r4);
        if (r4 != 0) goto L_0x00bd;
    L_0x00ad:
        r0 = new java.io.IOException;	 Catch:{ NumberFormatException -> 0x00b9 }
        r1 = B;	 Catch:{ NumberFormatException -> 0x00b9 }
        r2 = 9;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x00b9 }
        r0.<init>(r1);	 Catch:{ NumberFormatException -> 0x00b9 }
        throw r0;	 Catch:{ NumberFormatException -> 0x00b9 }
    L_0x00b9:
        r0 = move-exception;
        throw r0;
    L_0x00bb:
        r0 = move-exception;
        throw r0;
    L_0x00bd:
        r0 = B;
        r5 = 17;
        r0 = r0[r5];
        r0 = r4.getFirstHeader(r0);
        if (r0 == 0) goto L_0x00e6;
    L_0x00c9:
        r5 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0182 }
        r5.<init>();	 Catch:{ NumberFormatException -> 0x0182 }
        r6 = B;	 Catch:{ NumberFormatException -> 0x0182 }
        r7 = 7;
        r6 = r6[r7];	 Catch:{ NumberFormatException -> 0x0182 }
        r5 = r5.append(r6);	 Catch:{ NumberFormatException -> 0x0182 }
        r0 = r0.getValue();	 Catch:{ NumberFormatException -> 0x0182 }
        r0 = r5.append(r0);	 Catch:{ NumberFormatException -> 0x0182 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x0182 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x0182 }
    L_0x00e6:
        r0 = B;
        r5 = 13;
        r0 = r0[r5];
        r0 = r4.getFirstHeader(r0);
        if (r0 == 0) goto L_0x0128;
    L_0x00f2:
        r0 = r0.getValue();
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = B;
        r7 = 8;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r5 = r5.append(r0);
        r5 = r5.toString();
        com.whatsapp.util.Log.i(r5);
        r5 = android.text.TextUtils.isEmpty(r0);
        if (r5 != 0) goto L_0x0128;
    L_0x0116:
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ NumberFormatException -> 0x0186 }
        if (r0 != 0) goto L_0x0128;
    L_0x011c:
        r0 = com.whatsapp.fieldstats.a3.FAILED_OUT_OF_QUOTA;	 Catch:{ NumberFormatException -> 0x0184 }
        r1.z = r0;	 Catch:{ NumberFormatException -> 0x0184 }
        r0 = B;	 Catch:{ NumberFormatException -> 0x0184 }
        r5 = 11;
        r0 = r0[r5];	 Catch:{ NumberFormatException -> 0x0184 }
        r1.A = r0;	 Catch:{ NumberFormatException -> 0x0184 }
    L_0x0128:
        r0 = r4.getStatusLine();
        r0 = r0.getStatusCode();
        r5 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r0 != r5) goto L_0x014b;
    L_0x0134:
        r0 = r4.getEntity();
        r0 = org.apache.http.util.EntityUtils.toString(r0);
        r5 = new org.json.JSONObject;
        r5.<init>(r0);
        r1.c(r5);	 Catch:{ NumberFormatException -> 0x0188 }
        a(r1);	 Catch:{ NumberFormatException -> 0x0188 }
        r0 = com.whatsapp.DialogToastActivity.f;	 Catch:{ NumberFormatException -> 0x0188 }
        if (r0 == 0) goto L_0x0179;
    L_0x014b:
        r0 = com.whatsapp.fieldstats.a3.FAILED_OTHER;	 Catch:{ NumberFormatException -> 0x0188 }
        r1.z = r0;	 Catch:{ NumberFormatException -> 0x0188 }
        r0 = r4.getStatusLine();	 Catch:{ NumberFormatException -> 0x0188 }
        r0 = r0.getStatusCode();	 Catch:{ NumberFormatException -> 0x0188 }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ NumberFormatException -> 0x0188 }
        r1.A = r0;	 Catch:{ NumberFormatException -> 0x0188 }
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0188 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x0188 }
        r4 = B;	 Catch:{ NumberFormatException -> 0x0188 }
        r5 = 15;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0188 }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x0188 }
        r4 = r1.A;	 Catch:{ NumberFormatException -> 0x0188 }
        r0 = r0.append(r4);	 Catch:{ NumberFormatException -> 0x0188 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x0188 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NumberFormatException -> 0x0188 }
    L_0x0179:
        r4 = android.os.SystemClock.uptimeMillis();
        r2 = r4 - r2;
        r1.k = r2;
        return r1;
    L_0x0182:
        r0 = move-exception;
        throw r0;
    L_0x0184:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0186 }
    L_0x0186:
        r0 = move-exception;
        goto L_0x0128;
    L_0x0188:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.k1.e(android.location.Location, int, java.lang.String):com.whatsapp.k1");
    }

    private void b(JSONObject jSONObject) {
        boolean z = DialogToastActivity.f;
        JSONArray jSONArray = jSONObject.getJSONArray(B[26]);
        int i = 0;
        while (i < jSONArray.length()) {
            try {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                PlaceInfo placeInfo = new PlaceInfo();
                placeInfo.fromJsonFacebook(jSONObject2);
                this.i.add(placeInfo);
            } catch (Throwable e) {
                Log.b(B[25], e);
            }
            i++;
            if (z) {
                return;
            }
        }
    }

    public PlaceInfo b(String str) {
        boolean z = DialogToastActivity.f;
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            PlaceInfo placeInfo = (PlaceInfo) it.next();
            try {
                if (!str.equalsIgnoreCase(placeInfo.name)) {
                    if (z) {
                        break;
                    }
                }
                return placeInfo;
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        return null;
    }

    public boolean q() {
        return this.j;
    }

    public k1() {
        this.i = new ArrayList();
        this.n = false;
        this.d = null;
        this.t = 0;
        this.a = 0;
        this.s = Double.MAX_VALUE;
        this.e = Double.MAX_VALUE;
        this.o = 0;
        this.f = "";
        this.n = false;
        this.d = null;
        this.t = -1;
    }

    public int b() {
        return this.a;
    }

    public static void a(int i) {
        b = i;
    }

    public String s() {
        return this.p;
    }

    public a3 f() {
        return this.z;
    }

    public int h() {
        return this.q;
    }

    public static void e() {
        l = UUID.randomUUID().toString();
        u = 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.support.annotation.WorkerThread
    public static com.whatsapp.k1 b(android.location.Location r9, int r10, java.lang.String r11) {
        /*
        r8 = 1;
        r2 = com.whatsapp.DialogToastActivity.f;
        if (r11 != 0) goto L_0x0008;
    L_0x0005:
        r11 = "";
    L_0x0008:
        r0 = a(r9, r10, r11);
        if (r0 == 0) goto L_0x001e;
    L_0x000e:
        r1 = 1;
        r0.j = r1;	 Catch:{ JSONException -> 0x0063 }
        r1 = l;	 Catch:{ JSONException -> 0x0063 }
        r0.x = r1;	 Catch:{ JSONException -> 0x0063 }
        r1 = u;	 Catch:{ JSONException -> 0x0063 }
        r0.q = r1;	 Catch:{ JSONException -> 0x0063 }
        b(r0);	 Catch:{ JSONException -> 0x0063 }
        if (r2 == 0) goto L_0x0053;
    L_0x001e:
        r3 = m();
        r4 = r3.length;
        r1 = 0;
    L_0x0024:
        if (r1 >= r4) goto L_0x0053;
    L_0x0026:
        r5 = r3[r1];
        a(r5);
        switch(r5) {
            case 1: goto L_0x0065;
            case 2: goto L_0x006b;
            case 3: goto L_0x0071;
            default: goto L_0x002e;
        };
    L_0x002e:
        r6 = r0.z;	 Catch:{ JSONException -> 0x0076, IOException -> 0x0092 }
        if (r6 != 0) goto L_0x0036;
    L_0x0032:
        r6 = com.whatsapp.fieldstats.a3.OK;	 Catch:{ JSONException -> 0x0076, IOException -> 0x0092 }
        r0.z = r6;	 Catch:{ JSONException -> 0x0076, IOException -> 0x0092 }
    L_0x0036:
        r5 = l;	 Catch:{ JSONException -> 0x00ac }
        r0.x = r5;	 Catch:{ JSONException -> 0x00ac }
        r5 = u;	 Catch:{ JSONException -> 0x00ac }
        r0.q = r5;	 Catch:{ JSONException -> 0x00ac }
        b(r0);	 Catch:{ JSONException -> 0x00ac }
        r5 = r0.k();	 Catch:{ JSONException -> 0x00ac }
        if (r5 == 0) goto L_0x0053;
    L_0x0047:
        r5 = r0.z;	 Catch:{ JSONException -> 0x00ae }
        r6 = com.whatsapp.fieldstats.a3.FAILED_COMMUNICATION;	 Catch:{ JSONException -> 0x00ae }
        if (r5 != r6) goto L_0x004f;
    L_0x004d:
        if (r2 == 0) goto L_0x0053;
    L_0x004f:
        r1 = r1 + 1;
        if (r2 == 0) goto L_0x0024;
    L_0x0053:
        r1 = u;	 Catch:{ JSONException -> 0x00b2 }
        r1 = r1 + 1;
        u = r1;	 Catch:{ JSONException -> 0x00b2 }
        r1 = r0.b();	 Catch:{ JSONException -> 0x00b2 }
        if (r1 == r8) goto L_0x0062;
    L_0x005f:
        r0.a(r9);	 Catch:{ JSONException -> 0x00b2 }
    L_0x0062:
        return r0;
    L_0x0063:
        r0 = move-exception;
        throw r0;
    L_0x0065:
        r0 = c(r9, r10, r11);	 Catch:{ JSONException -> 0x0078, IOException -> 0x0092 }
        if (r2 == 0) goto L_0x002e;
    L_0x006b:
        r0 = d(r9, r10, r11);	 Catch:{ JSONException -> 0x0078, IOException -> 0x0092 }
        if (r2 == 0) goto L_0x002e;
    L_0x0071:
        r0 = e(r9, r10, r11);	 Catch:{ JSONException -> 0x0078, IOException -> 0x0092 }
        goto L_0x002e;
    L_0x0076:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x0078, IOException -> 0x0092 }
    L_0x0078:
        r0 = move-exception;
        r6 = B;
        r7 = 3;
        r6 = r6[r7];
        com.whatsapp.util.Log.b(r6, r0);
        r0 = new com.whatsapp.k1;
        r0.<init>(r5, r9, r10, r11);
        r5 = com.whatsapp.fieldstats.a3.FAILED_OTHER;
        r0.z = r5;
        r5 = B;
        r6 = 4;
        r5 = r5[r6];
        r0.A = r5;
        goto L_0x0036;
    L_0x0092:
        r0 = move-exception;
        r6 = B;
        r7 = 6;
        r6 = r6[r7];
        com.whatsapp.util.Log.b(r6, r0);
        r0 = new com.whatsapp.k1;
        r0.<init>(r5, r9, r10, r11);
        r5 = com.whatsapp.fieldstats.a3.FAILED_COMMUNICATION;
        r0.z = r5;
        r5 = B;
        r6 = 5;
        r5 = r5[r6];
        r0.A = r5;
        goto L_0x0036;
    L_0x00ac:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x00ae }
    L_0x00ae:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x00b0 }
    L_0x00b0:
        r0 = move-exception;
        throw r0;
    L_0x00b2:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.k1.b(android.location.Location, int, java.lang.String):com.whatsapp.k1");
    }

    public static br c(int i) {
        switch (i) {
            case at.g /*1*/:
                return br.FACEBOOK;
            case at.i /*2*/:
                try {
                    return br.GOOGLE;
                } catch (NumberFormatException e) {
                    throw e;
                }
            case at.o /*3*/:
                return br.FOURSQUARE;
            default:
                return br.APPLE;
        }
    }

    private void c(JSONObject jSONObject) {
        int i = 0;
        boolean z = DialogToastActivity.f;
        JSONArray jSONArray = jSONObject.getJSONObject(B[1]).getJSONArray(B[0]);
        while (i < jSONArray.length()) {
            try {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                PlaceInfo placeInfo = new PlaceInfo();
                placeInfo.fromJsonFoursquare(jSONObject2);
                this.i.add(placeInfo);
            } catch (Throwable e) {
                Log.b(B[2], e);
            }
            i++;
            if (z) {
                return;
            }
        }
    }

    public List p() {
        return this.i;
    }

    @WorkerThread
    public static void c(k1 k1Var) {
        try {
            if (b != 0) {
                try {
                    if (k1Var.n) {
                        k1 a;
                        try {
                            switch (k1Var.b()) {
                                case at.g /*1*/:
                                    if (k1Var.t != 0) {
                                        a = a(k1Var.a(), k1Var.o, k1Var.f, k1Var.t);
                                        break;
                                    } else {
                                        k1Var.n = false;
                                        return;
                                    }
                                case at.i /*2*/:
                                    if (!TextUtils.isEmpty(k1Var.d)) {
                                        a = a(k1Var.a(), k1Var.o, k1Var.f, k1Var.d);
                                        break;
                                    } else {
                                        k1Var.n = false;
                                        return;
                                    }
                                default:
                                    k1Var.n = false;
                                    return;
                            }
                        } catch (JSONException e) {
                            throw e;
                        } catch (Throwable e2) {
                            Log.b(B[28], e2);
                            a = null;
                        } catch (Throwable e22) {
                            Log.b(B[27], e22);
                            a = null;
                        }
                        if (a != null) {
                            try {
                                if (a.b() != 1) {
                                    a.a(k1Var.a());
                                }
                                try {
                                    if (!a.k()) {
                                        k1Var.i.addAll(a.i);
                                        k1Var.n = a.n;
                                        k1Var.d = a.d;
                                        k1Var.t = a.t;
                                    }
                                } catch (JSONException e3) {
                                    throw e3;
                                }
                            } catch (JSONException e32) {
                                throw e32;
                            }
                        }
                    }
                } catch (JSONException e322) {
                    throw e322;
                }
            }
        } catch (JSONException e3222) {
            throw e3222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int c() {
        /*
        r1 = 3;
        r4 = 1;
        r2 = com.whatsapp.DialogToastActivity.f;
        r0 = r;	 Catch:{ NumberFormatException -> 0x004c }
        if (r0 != 0) goto L_0x0049;
    L_0x0008:
        r0 = com.whatsapp.a59.g;	 Catch:{ NumberFormatException -> 0x004e }
        if (r0 < r4) goto L_0x0010;
    L_0x000c:
        r0 = com.whatsapp.a59.g;	 Catch:{ NumberFormatException -> 0x004e }
        if (r0 <= r1) goto L_0x003e;
    L_0x0010:
        r0 = com.whatsapp.App.ad();
        if (r0 == 0) goto L_0x003c;
    L_0x0016:
        r3 = r0.length();	 Catch:{ NumberFormatException -> 0x0050 }
        if (r3 <= r4) goto L_0x003c;
    L_0x001c:
        r3 = r0.hashCode();	 Catch:{ NumberFormatException -> 0x0052 }
        r3 = r3 % 3;
        if (r3 != 0) goto L_0x0029;
    L_0x0024:
        r3 = 1;
        r = r3;	 Catch:{ NumberFormatException -> 0x0052 }
        if (r2 == 0) goto L_0x003c;
    L_0x0029:
        r3 = r0.length();
        r3 = r3 + -2;
        r0 = r0.charAt(r3);
        r0 = r0 + -48;
        r0 = r0 % 2;
        if (r0 != r4) goto L_0x0056;
    L_0x0039:
        r0 = 2;
    L_0x003a:
        r = r0;
    L_0x003c:
        if (r2 == 0) goto L_0x0042;
    L_0x003e:
        r0 = com.whatsapp.a59.g;	 Catch:{ NumberFormatException -> 0x0058 }
        r = r0;	 Catch:{ NumberFormatException -> 0x0058 }
    L_0x0042:
        r0 = com.whatsapp.App.am;	 Catch:{ NumberFormatException -> 0x005a }
        if (r0 != r1) goto L_0x0049;
    L_0x0046:
        r0 = 1;
        r = r0;	 Catch:{ NumberFormatException -> 0x005a }
    L_0x0049:
        r0 = r;
        return r0;
    L_0x004c:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x004e }
    L_0x004e:
        r0 = move-exception;
        throw r0;
    L_0x0050:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0052 }
    L_0x0052:
        r0 = move-exception;
        throw r0;
    L_0x0054:
        r0 = move-exception;
        throw r0;
    L_0x0056:
        r0 = r1;
        goto L_0x003a;
    L_0x0058:
        r0 = move-exception;
        throw r0;
    L_0x005a:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.k1.c():int");
    }

    public int o() {
        return this.i.size();
    }

    public static void i() {
        a(d(b));
    }

    public k1(int i, Location location, int i2, String str) {
        this.i = new ArrayList();
        this.n = false;
        this.d = null;
        this.t = 0;
        this.a = i;
        this.s = location.getLatitude();
        this.e = location.getLongitude();
        this.o = i2;
        if (str == null) {
            str = "";
        }
        this.f = str;
        this.n = false;
        this.d = null;
        this.t = -1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.support.annotation.WorkerThread
    @android.support.annotation.NonNull
    private static com.whatsapp.k1 a(android.location.Location r10, int r11, java.lang.String r12, java.lang.String r13) {
        /*
        r1 = com.whatsapp.DialogToastActivity.f;
        r2 = android.os.SystemClock.uptimeMillis();
        r4 = new com.whatsapp.k1;
        r0 = 2;
        r4.<init>(r0, r10, r11, r12);
        r0 = new java.util.ArrayList;
        r0.<init>();
        r5 = new org.apache.http.message.BasicNameValuePair;	 Catch:{ NumberFormatException -> 0x00ec }
        r6 = B;	 Catch:{ NumberFormatException -> 0x00ec }
        r7 = 57;
        r6 = r6[r7];	 Catch:{ NumberFormatException -> 0x00ec }
        r7 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x00ec }
        r7.<init>();	 Catch:{ NumberFormatException -> 0x00ec }
        r8 = r10.getLatitude();	 Catch:{ NumberFormatException -> 0x00ec }
        r7 = r7.append(r8);	 Catch:{ NumberFormatException -> 0x00ec }
        r8 = ",";
        r7 = r7.append(r8);	 Catch:{ NumberFormatException -> 0x00ec }
        r8 = r10.getLongitude();	 Catch:{ NumberFormatException -> 0x00ec }
        r7 = r7.append(r8);	 Catch:{ NumberFormatException -> 0x00ec }
        r7 = r7.toString();	 Catch:{ NumberFormatException -> 0x00ec }
        r5.<init>(r6, r7);	 Catch:{ NumberFormatException -> 0x00ec }
        r0.add(r5);	 Catch:{ NumberFormatException -> 0x00ec }
        r5 = new org.apache.http.message.BasicNameValuePair;	 Catch:{ NumberFormatException -> 0x00ec }
        r6 = B;	 Catch:{ NumberFormatException -> 0x00ec }
        r7 = 46;
        r6 = r6[r7];	 Catch:{ NumberFormatException -> 0x00ec }
        r7 = java.lang.Integer.toString(r11);	 Catch:{ NumberFormatException -> 0x00ec }
        r5.<init>(r6, r7);	 Catch:{ NumberFormatException -> 0x00ec }
        r0.add(r5);	 Catch:{ NumberFormatException -> 0x00ec }
        r5 = android.text.TextUtils.isEmpty(r12);	 Catch:{ NumberFormatException -> 0x00ec }
        if (r5 != 0) goto L_0x0065;
    L_0x0057:
        r5 = new org.apache.http.message.BasicNameValuePair;	 Catch:{ NumberFormatException -> 0x00ec }
        r6 = B;	 Catch:{ NumberFormatException -> 0x00ec }
        r7 = 50;
        r6 = r6[r7];	 Catch:{ NumberFormatException -> 0x00ec }
        r5.<init>(r6, r12);	 Catch:{ NumberFormatException -> 0x00ec }
        r0.add(r5);	 Catch:{ NumberFormatException -> 0x00ec }
    L_0x0065:
        r5 = com.whatsapp.App.z();
        r5 = r5.getResources();
        r5 = r5.getConfiguration();
        r5 = r5.locale;
        if (r5 == 0) goto L_0x0087;
    L_0x0075:
        r6 = new org.apache.http.message.BasicNameValuePair;	 Catch:{ NumberFormatException -> 0x00ee }
        r7 = B;	 Catch:{ NumberFormatException -> 0x00ee }
        r8 = 47;
        r7 = r7[r8];	 Catch:{ NumberFormatException -> 0x00ee }
        r5 = r5.getLanguage();	 Catch:{ NumberFormatException -> 0x00ee }
        r6.<init>(r7, r5);	 Catch:{ NumberFormatException -> 0x00ee }
        r0.add(r6);	 Catch:{ NumberFormatException -> 0x00ee }
    L_0x0087:
        r5 = android.text.TextUtils.isEmpty(r13);	 Catch:{ NumberFormatException -> 0x00f0 }
        if (r5 != 0) goto L_0x009b;
    L_0x008d:
        r5 = new org.apache.http.message.BasicNameValuePair;	 Catch:{ NumberFormatException -> 0x00f0 }
        r6 = B;	 Catch:{ NumberFormatException -> 0x00f0 }
        r7 = 56;
        r6 = r6[r7];	 Catch:{ NumberFormatException -> 0x00f0 }
        r5.<init>(r6, r13);	 Catch:{ NumberFormatException -> 0x00f0 }
        r0.add(r5);	 Catch:{ NumberFormatException -> 0x00f0 }
    L_0x009b:
        r5 = new org.apache.http.params.BasicHttpParams;
        r5.<init>();
        r6 = 15000; // 0x3a98 float:2.102E-41 double:7.411E-320;
        org.apache.http.params.HttpConnectionParams.setConnectionTimeout(r5, r6);
        r6 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        org.apache.http.params.HttpConnectionParams.setSoTimeout(r5, r6);
        r6 = com.whatsapp.vn.a();
        org.apache.http.params.HttpProtocolParams.setUserAgent(r5, r6);
        r6 = new org.apache.http.impl.client.DefaultHttpClient;
        r6.<init>(r5);
        r5 = new org.apache.http.client.methods.HttpGet;
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r8 = com.whatsapp.azx.l;
        r7 = r7.append(r8);
        r8 = B;
        r9 = 60;
        r8 = r8[r9];
        r0 = org.apache.http.client.utils.URLEncodedUtils.format(r0, r8);
        r0 = r7.append(r0);
        r0 = r0.toString();
        r5.<init>(r0);
        r5 = r6.execute(r5);
        if (r5 != 0) goto L_0x00f2;
    L_0x00de:
        r0 = new java.io.IOException;	 Catch:{ NumberFormatException -> 0x00ea }
        r1 = B;	 Catch:{ NumberFormatException -> 0x00ea }
        r2 = 52;
        r1 = r1[r2];	 Catch:{ NumberFormatException -> 0x00ea }
        r0.<init>(r1);	 Catch:{ NumberFormatException -> 0x00ea }
        throw r0;	 Catch:{ NumberFormatException -> 0x00ea }
    L_0x00ea:
        r0 = move-exception;
        throw r0;
    L_0x00ec:
        r0 = move-exception;
        throw r0;
    L_0x00ee:
        r0 = move-exception;
        throw r0;
    L_0x00f0:
        r0 = move-exception;
        throw r0;
    L_0x00f2:
        r0 = r5.getStatusLine();
        r0 = r0.getStatusCode();
        r6 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r0 != r6) goto L_0x019c;
    L_0x00fe:
        r0 = r5.getEntity();
        r0 = org.apache.http.util.EntityUtils.toString(r0);
        r6 = new org.json.JSONObject;
        r6.<init>(r0);
        r0 = B;
        r7 = 48;
        r0 = r0[r7];
        r7 = r6.getString(r0);
        r0 = B;	 Catch:{ NumberFormatException -> 0x01d2 }
        r8 = 49;
        r0 = r0[r8];	 Catch:{ NumberFormatException -> 0x01d2 }
        r0 = r0.equals(r7);	 Catch:{ NumberFormatException -> 0x01d2 }
        if (r0 == 0) goto L_0x012f;
    L_0x0121:
        r0 = com.whatsapp.fieldstats.a3.FAILED_OUT_OF_QUOTA;	 Catch:{ NumberFormatException -> 0x01d4 }
        r4.z = r0;	 Catch:{ NumberFormatException -> 0x01d4 }
        r0 = B;	 Catch:{ NumberFormatException -> 0x01d4 }
        r8 = 55;
        r0 = r0[r8];	 Catch:{ NumberFormatException -> 0x01d4 }
        r4.A = r0;	 Catch:{ NumberFormatException -> 0x01d4 }
        if (r1 == 0) goto L_0x019a;
    L_0x012f:
        r0 = B;	 Catch:{ NumberFormatException -> 0x01d6 }
        r8 = 51;
        r0 = r0[r8];	 Catch:{ NumberFormatException -> 0x01d6 }
        r0 = r0.equals(r7);	 Catch:{ NumberFormatException -> 0x01d6 }
        if (r0 == 0) goto L_0x016c;
    L_0x013b:
        r4.a(r6);	 Catch:{ NumberFormatException -> 0x01d8 }
        r0 = B;	 Catch:{ NumberFormatException -> 0x01d8 }
        r8 = 53;
        r0 = r0[r8];	 Catch:{ NumberFormatException -> 0x01d8 }
        r0 = r6.has(r0);	 Catch:{ NumberFormatException -> 0x01d8 }
        if (r0 == 0) goto L_0x0161;
    L_0x014a:
        r0 = B;	 Catch:{ NumberFormatException -> 0x01da }
        r8 = 54;
        r0 = r0[r8];	 Catch:{ NumberFormatException -> 0x01da }
        r0 = r6.getString(r0);	 Catch:{ NumberFormatException -> 0x01da }
        r4.d = r0;	 Catch:{ NumberFormatException -> 0x01da }
        r0 = r4.d;	 Catch:{ NumberFormatException -> 0x01da }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ NumberFormatException -> 0x01da }
        if (r0 != 0) goto L_0x01dc;
    L_0x015e:
        r0 = 1;
    L_0x015f:
        r4.n = r0;
    L_0x0161:
        r0 = android.text.TextUtils.isEmpty(r13);	 Catch:{ NumberFormatException -> 0x01de }
        if (r0 == 0) goto L_0x019a;
    L_0x0167:
        a(r4);	 Catch:{ NumberFormatException -> 0x01e0 }
        if (r1 == 0) goto L_0x019a;
    L_0x016c:
        r0 = B;	 Catch:{ NumberFormatException -> 0x01e2 }
        r6 = 59;
        r0 = r0[r6];	 Catch:{ NumberFormatException -> 0x01e2 }
        r0 = r0.equals(r7);	 Catch:{ NumberFormatException -> 0x01e2 }
        if (r0 != 0) goto L_0x019a;
    L_0x0178:
        r0 = com.whatsapp.fieldstats.a3.FAILED_OTHER;	 Catch:{ NumberFormatException -> 0x01e2 }
        r4.z = r0;	 Catch:{ NumberFormatException -> 0x01e2 }
        r4.A = r7;	 Catch:{ NumberFormatException -> 0x01e2 }
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x01e2 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x01e2 }
        r6 = B;	 Catch:{ NumberFormatException -> 0x01e2 }
        r7 = 58;
        r6 = r6[r7];	 Catch:{ NumberFormatException -> 0x01e2 }
        r0 = r0.append(r6);	 Catch:{ NumberFormatException -> 0x01e2 }
        r6 = r4.A;	 Catch:{ NumberFormatException -> 0x01e2 }
        r0 = r0.append(r6);	 Catch:{ NumberFormatException -> 0x01e2 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x01e2 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NumberFormatException -> 0x01e2 }
    L_0x019a:
        if (r1 == 0) goto L_0x01ca;
    L_0x019c:
        r0 = com.whatsapp.fieldstats.a3.FAILED_OTHER;	 Catch:{ NumberFormatException -> 0x01e4 }
        r4.z = r0;	 Catch:{ NumberFormatException -> 0x01e4 }
        r0 = r5.getStatusLine();	 Catch:{ NumberFormatException -> 0x01e4 }
        r0 = r0.getStatusCode();	 Catch:{ NumberFormatException -> 0x01e4 }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ NumberFormatException -> 0x01e4 }
        r4.A = r0;	 Catch:{ NumberFormatException -> 0x01e4 }
        r0 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x01e4 }
        r0.<init>();	 Catch:{ NumberFormatException -> 0x01e4 }
        r1 = B;	 Catch:{ NumberFormatException -> 0x01e4 }
        r5 = 45;
        r1 = r1[r5];	 Catch:{ NumberFormatException -> 0x01e4 }
        r0 = r0.append(r1);	 Catch:{ NumberFormatException -> 0x01e4 }
        r1 = r4.A;	 Catch:{ NumberFormatException -> 0x01e4 }
        r0 = r0.append(r1);	 Catch:{ NumberFormatException -> 0x01e4 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x01e4 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NumberFormatException -> 0x01e4 }
    L_0x01ca:
        r0 = android.os.SystemClock.uptimeMillis();
        r0 = r0 - r2;
        r4.k = r0;
        return r4;
    L_0x01d2:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x01d4 }
    L_0x01d4:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x01d6 }
    L_0x01d6:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x01d8 }
    L_0x01d8:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x01da }
    L_0x01da:
        r0 = move-exception;
        throw r0;
    L_0x01dc:
        r0 = 0;
        goto L_0x015f;
    L_0x01de:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x01e0 }
    L_0x01e0:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x01e2 }
    L_0x01e2:
        r0 = move-exception;
        throw r0;
    L_0x01e4:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.k1.a(android.location.Location, int, java.lang.String, java.lang.String):com.whatsapp.k1");
    }

    public boolean l() {
        return this.n;
    }

    public int a(PlaceInfo placeInfo) {
        return this.i.indexOf(placeInfo);
    }

    @WorkerThread
    @NonNull
    private static k1 d(Location location, int i, String str) {
        return a(location, i, str, null);
    }

    private static void a(k1 k1Var) {
        try {
            h.add(k1Var);
            if (h.size() > 12) {
                h.remove(0);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public PlaceInfo b(int i) {
        return (PlaceInfo) this.i.get(i);
    }

    public long d() {
        return this.k;
    }

    public static void r() {
        h.clear();
    }

    public boolean k() {
        return this.i.isEmpty();
    }

    public static int j() {
        try {
            if (b == 0) {
                b = c();
            }
            return b;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public String n() {
        return this.A;
    }

    private static k1 a(Location location, int i, String str) {
        boolean z = DialogToastActivity.f;
        Iterator it = h.iterator();
        while (it.hasNext()) {
            k1 k1Var = (k1) it.next();
            if (k1Var.f.equalsIgnoreCase(str)) {
                double d = ((double) ((k1Var.o + i) / 2)) * 0.2d;
                if (((double) k1Var.a().distanceTo(location)) < d) {
                    try {
                        if (((double) Math.abs(k1Var.o - i)) < d) {
                            return k1Var;
                        }
                    } catch (NumberFormatException e) {
                        throw e;
                    }
                }
                continue;
            }
            if (z) {
                break;
            }
        }
        return null;
    }

    public void a(Location location) {
        boolean z = DialogToastActivity.f;
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            PlaceInfo placeInfo = (PlaceInfo) it.next();
            placeInfo.dist = (double) placeInfo.getLocation().distanceTo(location);
            if (z) {
                break;
            }
        }
        Collections.sort(this.i, new ay(this));
    }

    public String g() {
        return this.f;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(org.json.JSONObject r9) {
        /*
        r8 = this;
        r1 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = B;
        r2 = 22;
        r0 = r0[r2];
        r4 = r9.getJSONArray(r0);
        r0 = r1;
    L_0x000e:
        r2 = r4.length();
        if (r0 >= r2) goto L_0x003c;
    L_0x0014:
        r2 = r4.getJSONObject(r0);	 Catch:{ JSONException -> 0x0096 }
        r5 = new com.whatsapp.PlaceInfo;	 Catch:{ JSONException -> 0x0096 }
        r5.<init>();	 Catch:{ JSONException -> 0x0096 }
        r6 = 0;
        r5.fromJsonGoogle(r2, r6);	 Catch:{ JSONException -> 0x0092 }
        r2 = r5.icon;	 Catch:{ JSONException -> 0x0092 }
        if (r2 == 0) goto L_0x0033;
    L_0x0025:
        r2 = r5.icon;	 Catch:{ JSONException -> 0x0092 }
        r6 = B;	 Catch:{ JSONException -> 0x0092 }
        r7 = 24;
        r6 = r6[r7];	 Catch:{ JSONException -> 0x0092 }
        r2 = r2.endsWith(r6);	 Catch:{ JSONException -> 0x0092 }
        if (r2 != 0) goto L_0x0038;
    L_0x0033:
        r2 = r8.i;	 Catch:{ JSONException -> 0x0094 }
        r2.add(r5);	 Catch:{ JSONException -> 0x0094 }
    L_0x0038:
        r0 = r0 + 1;
        if (r3 == 0) goto L_0x000e;
    L_0x003c:
        r0 = B;	 Catch:{ JSONException -> 0x00a3 }
        r2 = 19;
        r0 = r0[r2];	 Catch:{ JSONException -> 0x00a3 }
        r0 = r9.getJSONArray(r0);	 Catch:{ JSONException -> 0x00a3 }
        r2 = r0.length();	 Catch:{ JSONException -> 0x00a3 }
        if (r2 <= 0) goto L_0x0091;
    L_0x004c:
        r2 = "";
        r8.p = r2;	 Catch:{ JSONException -> 0x00a3 }
    L_0x0051:
        r2 = r0.length();	 Catch:{ JSONException -> 0x00a3 }
        if (r1 >= r2) goto L_0x0091;
    L_0x0057:
        if (r1 <= 0) goto L_0x0074;
    L_0x0059:
        r2 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x00a1 }
        r2.<init>();	 Catch:{ JSONException -> 0x00a1 }
        r4 = r8.p;	 Catch:{ JSONException -> 0x00a1 }
        r2 = r2.append(r4);	 Catch:{ JSONException -> 0x00a1 }
        r4 = B;	 Catch:{ JSONException -> 0x00a1 }
        r5 = 23;
        r4 = r4[r5];	 Catch:{ JSONException -> 0x00a1 }
        r2 = r2.append(r4);	 Catch:{ JSONException -> 0x00a1 }
        r2 = r2.toString();	 Catch:{ JSONException -> 0x00a1 }
        r8.p = r2;	 Catch:{ JSONException -> 0x00a1 }
    L_0x0074:
        r2 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x00a3 }
        r2.<init>();	 Catch:{ JSONException -> 0x00a3 }
        r4 = r8.p;	 Catch:{ JSONException -> 0x00a3 }
        r2 = r2.append(r4);	 Catch:{ JSONException -> 0x00a3 }
        r4 = r0.getString(r1);	 Catch:{ JSONException -> 0x00a3 }
        r2 = r2.append(r4);	 Catch:{ JSONException -> 0x00a3 }
        r2 = r2.toString();	 Catch:{ JSONException -> 0x00a3 }
        r8.p = r2;	 Catch:{ JSONException -> 0x00a3 }
        r1 = r1 + 1;
        if (r3 == 0) goto L_0x0051;
    L_0x0091:
        return;
    L_0x0092:
        r2 = move-exception;
        throw r2;	 Catch:{ JSONException -> 0x0094 }
    L_0x0094:
        r2 = move-exception;
        throw r2;	 Catch:{ JSONException -> 0x0096 }
    L_0x0096:
        r2 = move-exception;
        r5 = B;
        r6 = 20;
        r5 = r5[r6];
        com.whatsapp.util.Log.b(r5, r2);
        goto L_0x0038;
    L_0x00a1:
        r0 = move-exception;
        throw r0;	 Catch:{ JSONException -> 0x00a3 }
    L_0x00a3:
        r0 = move-exception;
        r1 = B;
        r2 = 21;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        goto L_0x0091;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.k1.a(org.json.JSONObject):void");
    }

    public Location a() {
        try {
            if (this.s != Double.MAX_VALUE) {
                if (this.e != Double.MAX_VALUE) {
                    try {
                        if (this.w == null) {
                            this.w = new Location("");
                            this.w.setLatitude(this.s);
                            this.w.setLongitude(this.e);
                        }
                        return this.w;
                    } catch (NumberFormatException e) {
                        throw e;
                    }
                }
            }
            return null;
        } catch (NumberFormatException e2) {
            throw e2;
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    static {
        String[] strArr = new String[61];
        String str = "v\u000bJ?ZL\u0016M$w|\u001fg!]|\rY";
        int i = 60;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case v.m /*0*/:
                        i4 = 19;
                        break;
                    case at.g /*1*/:
                        i4 = 121;
                        break;
                    case at.i /*2*/:
                        i4 = 56;
                        break;
                    case at.o /*3*/:
                        i4 = 80;
                        break;
                    default:
                        i4 = 40;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    i2 = 2;
                    strArr2 = strArr3;
                    str = "c\u0015Y3M\u007f\u0010K$\u0007t\u001cL Dr\u001a]#\u0007u\u0016M\"[b\fY\"M<\u0013K?F>\u001c@3Mc\rQ?F";
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    i2 = 3;
                    str = "c\u0015Y3M\u007f\u0010K$\u0007t\u001cL Dr\u001a]#\u0007y\nW>\u0005v\u0001[5Xg\u0010W>";
                    i = 2;
                    strArr2 = strArr3;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    str = "v\u000bJ?ZL\u0013K?F";
                    i = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "v\u000bJ?ZL\u001aW=Ef\u0017Q3Ig\u0010W>";
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "c\u0015Y3M\u007f\u0010K$\u0007t\u001cL Dr\u001a]#\u0007z\u0016\u00155Pp\u001cH$A|\u0017";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "c\u0015Y3M\u007f\u0010K$\u0007t\u001cL Dr\u001a]#\u0007u\u0016M\"[b\fY\"M<!\u0015\u0002Ig\u001ct9Ez\r\u0015\u001cA~\u0010Lj";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "c\u0015Y3M\u007f\u0010K$\u0007t\u001cL Dr\u001a]#\u0007u\u0016M\"[b\fY\"M<!\u0015\u0002Ig\u001ct9Ez\r\u0015\u0002M~\u0018Q>A}\u001e\u0002";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "}\u0016\u0018\"M`\tW>[v";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "\u007f\u0015";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "v\u000bJ?ZL\u0016M$w|\u001fg!]|\rY";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "b\f]\"Q";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "KTj1\\v5Q=AgTj5Er\u0010V9Ft";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "F-~}\u0010";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "c\u0015Y3M\u007f\u0010K$\u0007t\u001cL Dr\u001a]#\u0007u\u0016M\"[b\fY\"M<\u001cJ\"GaTK$Ig\fKj";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "a\u0018\\9]`";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "KTj1\\v5Q=AgTt9Ez\r";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "Z\u0017N1Dz\u001d\u0018 Dr\u001a]#\b`\u0016M\"Kv";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i2] = str;
                    str = "{\rU<wr\rL\"Aq\fL9G}\n";
                    i = 18;
                    i2 = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    strArr2 = strArr3;
                    str = "c\u0015Y3M\u007f\u0010K$\u0007t\u001cL Dr\u001a]#\u0007t\u0016W7DvVR#G}T](Kv\tL9G}";
                    i = 19;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = "c\u0015Y3M\u007f\u0010K$\u0007t\u001cL Dr\u001a]#\u0007t\u0016W7DvVR#G}T](Kv\tL9G}";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = "a\u001cK%Dg\n";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "/\u001bJp\u0007-";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = "t\u001cW3Gw\u001c\u0015g\u0019=\tV7";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = "c\u0015Y3M\u007f\u0010K$\u0007t\u001cL Dr\u001a]#\u0007u\u0018[5J|\u0016S\u007fB`\u0016V}Mk\u001a] \\z\u0016V";
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = "w\u0018L1";
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i2] = str;
                    i2 = 27;
                    str = "c\u0015Y3M\u007f\u0010K$\u0007t\u001cL>Mk\rH<Ip\u001cK\u007fB`\u0016V}Mk\u001a] \\z\u0016V";
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i2] = str;
                    i2 = 28;
                    str = "c\u0015Y3M\u007f\u0010K$\u0007t\u001cL>Mk\rH<Ip\u001cK\u007fA|T](Kv\tL9G}";
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    str = "w\u0010K$I}\u001a]";
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i2] = str;
                    i2 = m;
                    str = "u\u0010]<L`";
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i2] = str;
                    i2 = 31;
                    str = "g\u0000H5";
                    i = m;
                    strArr2 = strArr3;
                    break;
                case m /*30*/:
                    strArr2[i2] = str;
                    i2 = 32;
                    str = "\u007f\u0010U9\\";
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i2] = str;
                    i2 = 33;
                    str = "|\u001f^#Mg";
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i2] = str;
                    i2 = 34;
                    str = "\u007f\u0016[1Dv";
                    i = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i2] = str;
                    i2 = 35;
                    str = "c\u0015Y3M\u007f\u0010K$\u0007t\u001cL Dr\u001a]#\u0007u\u0018[5J|\u0016S\u007fMa\u000bW\"\u0005`\rY$]`C";
                    i = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i2] = str;
                    i2 = 36;
                    str = "p\u001cV$Ma";
                    i = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i2] = str;
                    i2 = 37;
                    str = "}\u001c@$";
                    i = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i2] = str;
                    i2 = 38;
                    str = "c\u0018_9Ft";
                    i = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i2] = str;
                    i2 = 39;
                    str = "}\u0018U5\u0004\u007f\u0016[1\\z\u0016V|Dz\u0017S|X\u007f\u0018[5wg\u0016H9K`WT9Ez\r\u0010a\u0001h\u0010[?FL\fJ<U";
                    i = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i2] = str;
                    str = "`\u001cY\"K{F";
                    i = 39;
                    i2 = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i2] = str;
                    i2 = 41;
                    strArr2 = strArr3;
                    str = "}\u0016\u0018\"M`\tW>[v";
                    i = 40;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i2] = str;
                    i2 = 42;
                    str = "c\u0015Y3M";
                    i = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i2] = str;
                    i2 = 43;
                    str = "F-~}\u0010";
                    i = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i2] = str;
                    i2 = 44;
                    str = "c\u0018_9Ft";
                    i = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i2] = str;
                    i2 = 45;
                    str = "c\u0015Y3M\u007f\u0010K$\u0007t\u001cL Dr\u001a]#\u0007t\u0016W7DvV]\"Z|\u000b\u0015#\\r\rM#\u0012";
                    i = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i2] = str;
                    i2 = 46;
                    str = "a\u0018\\9]`";
                    i = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i2] = str;
                    i2 = 47;
                    str = "\u007f\u0018V7]r\u001e]";
                    i = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i2] = str;
                    i2 = 48;
                    str = "`\rY$]`";
                    i = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i2] = str;
                    i2 = 49;
                    str = "\\/}\u0002wB,}\u0002qL5q\u001daG";
                    i = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i2] = str;
                    i2 = 50;
                    str = "x\u001cA'Ga\u001d";
                    i = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i2] = str;
                    i2 = 51;
                    str = "\\2";
                    i = 50;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i2] = str;
                    i2 = 52;
                    str = "}\u0016\u0018\"M`\tW>[v";
                    i = 51;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i2] = str;
                    i2 = 53;
                    str = "}\u001c@$wc\u0018_5wg\u0016S5F";
                    i = 52;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i2] = str;
                    i2 = 54;
                    str = "}\u001c@$wc\u0018_5wg\u0016S5F";
                    i = 53;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i2] = str;
                    i2 = 55;
                    str = "v\u000bJ?ZL\u0016M$w|\u001fg!]|\rY";
                    i = 54;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i2] = str;
                    str = "c\u0018_5\\|\u0012]>";
                    i = 55;
                    i2 = 56;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i2] = str;
                    i2 = 57;
                    strArr2 = strArr3;
                    str = "\u007f\u0016[1\\z\u0016V";
                    i = 56;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i2] = str;
                    i2 = 58;
                    str = "c\u0015Y3M\u007f\u0010K$\u0007t\u001cL Dr\u001a]#\u0007t\u0016W7DvV]\"Z|\u000b\u0015#\\r\rM#\u0012";
                    i = 57;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i2] = str;
                    i2 = 59;
                    str = "I<j\u001fwA<k\u0005dG*";
                    i = 58;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i2] = str;
                    i2 = 60;
                    str = "F-~}\u0010";
                    i = 59;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i2] = str;
                    B = strArr3;
                    h = new ArrayList();
                    b = 0;
                    r = 0;
                    return;
                case arj.Theme_popupMenuStyle /*60*/:
                    g = str;
                    str = "v\u000bJ?ZL\u0013K?F";
                    i = 61;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    y = str;
                    str = "v\u000bJ?ZL\u001aW=Ef\u0017Q3Ig\u0010W>";
                    i = 62;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    c = str;
                    str = "e\u001cV%M`";
                    i = -1;
                    break;
                default:
                    strArr2[i2] = str;
                    str = "a\u001cK G}\n]";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public PlaceInfo a(String str) {
        boolean z = DialogToastActivity.f;
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            PlaceInfo placeInfo = (PlaceInfo) it.next();
            try {
                if (!str.equalsIgnoreCase(placeInfo.placeId)) {
                    if (z) {
                        break;
                    }
                }
                return placeInfo;
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        return null;
    }

    public static int d(int i) {
        switch (i) {
            case at.g /*1*/:
                return 2;
            case at.i /*2*/:
                return 3;
            case at.o /*3*/:
                return 1;
            default:
                auv.a(false, B[18]);
                return i;
        }
    }
}
