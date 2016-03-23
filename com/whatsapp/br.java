package com.whatsapp;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.widget.Toast;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class br extends AsyncTask {
    private static final String[] z;
    final WebImagePicker a;
    private anw b;
    private ProgressDialog c;

    static {
        String[] strArr = new String[4];
        String str = "m+\u0002AZ{)\u0005\u0007Su9\u000eDX{*OJP5+\u0012ZXh";
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
                        i3 = 78;
                        break;
                    case at.i /*2*/:
                        i3 = 96;
                        break;
                    case at.o /*3*/:
                        i3 = 40;
                        break;
                    default:
                        i3 = 55;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "?|P";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "m+\u0002AZ{)\u0005\u0007Su9\u000eDX{*OMEh!\u0012\b";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "T!@[G{-\u0005";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static ProgressDialog a(br brVar, ProgressDialog progressDialog) {
        brVar.c = progressDialog;
        return progressDialog;
    }

    protected com.whatsapp.ot a(java.lang.Void[] r11) {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:com.whatsapp.br.a(java.lang.Void[]):com.whatsapp.ot. bs: [B:34:0x0090, B:51:0x00b0]
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:86)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:57)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:281)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:161)
*/
        /*
        r10 = this;
        r1 = 0;
        r4 = 0;
        r6 = com.whatsapp.DialogToastActivity.f;
        r0 = new java.net.URL;	 Catch:{ IOException -> 0x0073, Exception -> 0x00ae, all -> 0x00ce }
        r2 = r10.b;	 Catch:{ IOException -> 0x0073, Exception -> 0x00ae, all -> 0x00ce }
        r2 = r2.e;	 Catch:{ IOException -> 0x0073, Exception -> 0x00ae, all -> 0x00ce }
        r3 = " ";	 Catch:{ IOException -> 0x0073, Exception -> 0x00ae, all -> 0x00ce }
        r5 = z;	 Catch:{ IOException -> 0x0073, Exception -> 0x00ae, all -> 0x00ce }
        r7 = 2;	 Catch:{ IOException -> 0x0073, Exception -> 0x00ae, all -> 0x00ce }
        r5 = r5[r7];	 Catch:{ IOException -> 0x0073, Exception -> 0x00ae, all -> 0x00ce }
        r2 = r2.replace(r3, r5);	 Catch:{ IOException -> 0x0073, Exception -> 0x00ae, all -> 0x00ce }
        r0.<init>(r2);	 Catch:{ IOException -> 0x0073, Exception -> 0x00ae, all -> 0x00ce }
        r2 = r0.openStream();	 Catch:{ IOException -> 0x0073, Exception -> 0x00ae, all -> 0x00ce }
        r0 = com.whatsapp.App.at;	 Catch:{ IOException -> 0x00d3, Exception -> 0x00d1 }
        r3 = r10.a;	 Catch:{ IOException -> 0x00d3, Exception -> 0x00d1 }
        r3 = com.whatsapp.WebImagePicker.k(r3);	 Catch:{ IOException -> 0x00d3, Exception -> 0x00d1 }
        r1 = r0.openOutputStream(r3);	 Catch:{ IOException -> 0x00d3, Exception -> 0x00d1 }
        r0 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;	 Catch:{ IOException -> 0x00d3, Exception -> 0x00d1 }
        r7 = new byte[r0];	 Catch:{ IOException -> 0x00d3, Exception -> 0x00d1 }
        r3 = r4;	 Catch:{ IOException -> 0x00d3, Exception -> 0x00d1 }
        r0 = r4;	 Catch:{ IOException -> 0x00d3, Exception -> 0x00d1 }
    L_0x002f:
        r5 = r10.isCancelled();	 Catch:{ IOException -> 0x00d3, Exception -> 0x00d1 }
        if (r5 != 0) goto L_0x0064;	 Catch:{ IOException -> 0x00d3, Exception -> 0x00d1 }
    L_0x0035:
        r5 = 0;	 Catch:{ IOException -> 0x00d3, Exception -> 0x00d1 }
        r8 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;	 Catch:{ IOException -> 0x00d3, Exception -> 0x00d1 }
        r5 = r2.read(r7, r5, r8);	 Catch:{ IOException -> 0x00d3, Exception -> 0x00d1 }
        r8 = -1;	 Catch:{ IOException -> 0x00d3, Exception -> 0x00d1 }
        if (r5 != r8) goto L_0x0041;	 Catch:{ IOException -> 0x00d3, Exception -> 0x00d1 }
    L_0x003f:
        if (r6 == 0) goto L_0x0064;	 Catch:{ IOException -> 0x00d3, Exception -> 0x00d1 }
    L_0x0041:
        r8 = 0;	 Catch:{ IOException -> 0x00d3, Exception -> 0x00d1 }
        r1.write(r7, r8, r5);	 Catch:{ IOException -> 0x00d3, Exception -> 0x00d1 }
        r5 = r5 + r0;	 Catch:{ IOException -> 0x00d3, Exception -> 0x00d1 }
        r0 = r10.b;	 Catch:{ IOException -> 0x00d3, Exception -> 0x00d1 }
        r0 = r0.c;	 Catch:{ IOException -> 0x00d3, Exception -> 0x00d1 }
        if (r0 == 0) goto L_0x00db;	 Catch:{ IOException -> 0x00d3, Exception -> 0x00d1 }
    L_0x004c:
        r0 = r5 * 100;	 Catch:{ IOException -> 0x00d3, Exception -> 0x00d1 }
        r8 = r10.b;	 Catch:{ IOException -> 0x00d3, Exception -> 0x00d1 }
        r8 = r8.c;	 Catch:{ IOException -> 0x00d3, Exception -> 0x00d1 }
        r0 = r0 / r8;	 Catch:{ IOException -> 0x00d3, Exception -> 0x00d1 }
    L_0x0053:
        if (r0 == r3) goto L_0x00d9;	 Catch:{ IOException -> 0x00d3, Exception -> 0x00d1 }
    L_0x0055:
        r3 = 1;	 Catch:{ IOException -> 0x00d3, Exception -> 0x00d1 }
        r3 = new java.lang.Integer[r3];	 Catch:{ IOException -> 0x00d3, Exception -> 0x00d1 }
        r8 = 0;	 Catch:{ IOException -> 0x00d3, Exception -> 0x00d1 }
        r9 = java.lang.Integer.valueOf(r0);	 Catch:{ IOException -> 0x00d3, Exception -> 0x00d1 }
        r3[r8] = r9;	 Catch:{ IOException -> 0x00d3, Exception -> 0x00d1 }
        r10.publishProgress(r3);	 Catch:{ IOException -> 0x00d3, Exception -> 0x00d1 }
    L_0x0062:
        if (r6 == 0) goto L_0x00d5;
    L_0x0064:
        com.whatsapp.util.ao.a(r2);
        com.whatsapp.util.ao.a(r1);
        r0 = r10.isCancelled();	 Catch:{ IOException -> 0x00c9 }
        if (r0 != 0) goto L_0x00cb;	 Catch:{ IOException -> 0x00c9 }
    L_0x0070:
        r0 = com.whatsapp.ot.SUCCESS;	 Catch:{ IOException -> 0x00c9 }
    L_0x0072:
        return r0;
    L_0x0073:
        r0 = move-exception;
        r2 = r1;
    L_0x0075:
        r3 = r10.isCancelled();	 Catch:{ IOException -> 0x0099 }
        if (r3 != 0) goto L_0x00a5;	 Catch:{ IOException -> 0x0099 }
    L_0x007b:
        r3 = r0.getMessage();	 Catch:{ IOException -> 0x0099 }
        if (r3 == 0) goto L_0x00a5;
    L_0x0081:
        r0 = r0.getMessage();	 Catch:{ IOException -> 0x009b }
        r3 = z;	 Catch:{ IOException -> 0x009b }
        r4 = 1;	 Catch:{ IOException -> 0x009b }
        r3 = r3[r4];	 Catch:{ IOException -> 0x009b }
        r0 = r0.contains(r3);	 Catch:{ IOException -> 0x009b }
        if (r0 == 0) goto L_0x00a5;
    L_0x0090:
        r0 = com.whatsapp.ot.FAILED_OUT_OF_SPACE;	 Catch:{ all -> 0x009d }
        com.whatsapp.util.ao.a(r2);
        com.whatsapp.util.ao.a(r1);
        goto L_0x0072;
    L_0x0099:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x009b }
    L_0x009b:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x009d }
    L_0x009d:
        r0 = move-exception;
    L_0x009e:
        com.whatsapp.util.ao.a(r2);
        com.whatsapp.util.ao.a(r1);
        throw r0;
    L_0x00a5:
        r0 = com.whatsapp.ot.FAILED_GENERIC;	 Catch:{ all -> 0x009d }
        com.whatsapp.util.ao.a(r2);
        com.whatsapp.util.ao.a(r1);
        goto L_0x0072;
    L_0x00ae:
        r0 = move-exception;
        r2 = r1;
    L_0x00b0:
        r3 = r10.isCancelled();	 Catch:{ IOException -> 0x00c7 }
        if (r3 != 0) goto L_0x00be;	 Catch:{ IOException -> 0x00c7 }
    L_0x00b6:
        r3 = z;	 Catch:{ IOException -> 0x00c7 }
        r4 = 0;	 Catch:{ IOException -> 0x00c7 }
        r3 = r3[r4];	 Catch:{ IOException -> 0x00c7 }
        com.whatsapp.util.Log.b(r3, r0);	 Catch:{ IOException -> 0x00c7 }
    L_0x00be:
        r0 = com.whatsapp.ot.FAILED_GENERIC;	 Catch:{ all -> 0x009d }
        com.whatsapp.util.ao.a(r2);
        com.whatsapp.util.ao.a(r1);
        goto L_0x0072;
    L_0x00c7:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x009d }
    L_0x00c9:
        r0 = move-exception;
        throw r0;
    L_0x00cb:
        r0 = com.whatsapp.ot.FAILED_GENERIC;
        goto L_0x0072;
    L_0x00ce:
        r0 = move-exception;
        r2 = r1;
        goto L_0x009e;
    L_0x00d1:
        r0 = move-exception;
        goto L_0x00b0;
    L_0x00d3:
        r0 = move-exception;
        goto L_0x0075;
    L_0x00d5:
        r3 = r0;
        r0 = r5;
        goto L_0x002f;
    L_0x00d9:
        r0 = r3;
        goto L_0x0062;
    L_0x00db:
        r0 = r4;
        goto L_0x0053;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.br.a(java.lang.Void[]):com.whatsapp.ot");
    }

    protected void a(ot otVar) {
        boolean z = DialogToastActivity.f;
        if (this.c != null) {
            this.c.dismiss();
        }
        this.c = null;
        if (WebImagePicker.h(this.a) == this) {
            WebImagePicker.a(this.a, null);
        }
        if (otVar == ot.SUCCESS) {
            this.a.setResult(-1);
            this.a.finish();
            if (!z) {
                return;
            }
        }
        if (!isCancelled()) {
            Log.e(z[3] + otVar);
            if (otVar == ot.FAILED_OUT_OF_SPACE) {
                int i;
                WebImagePicker webImagePicker = this.a;
                if (App.V()) {
                    i = 2131231377;
                } else {
                    i = 2131231378;
                }
                webImagePicker.a(i);
                if (!z) {
                    return;
                }
            }
            Toast.makeText(this.a.getApplicationContext(), this.a.getString(2131231107), 1).show();
        }
    }

    br(WebImagePicker webImagePicker, anw com_whatsapp_anw) {
        this.a = webImagePicker;
        this.b = com_whatsapp_anw;
    }

    protected void onProgressUpdate(Object[] objArr) {
        a((Integer[]) objArr);
    }

    protected void onPreExecute() {
        this.c = new ProgressDialog(this.a);
        this.c.setProgressStyle(1);
        this.c.setMessage(this.a.getString(2131231684));
        this.c.setCancelable(true);
        this.c.setOnCancelListener(new h3(this));
        this.c.show();
    }

    static ProgressDialog a(br brVar) {
        return brVar.c;
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    protected void a(Integer[] numArr) {
        if (this.c != null) {
            this.c.setProgress(numArr[0].intValue());
        }
    }

    protected void onPostExecute(Object obj) {
        a((ot) obj);
    }
}
