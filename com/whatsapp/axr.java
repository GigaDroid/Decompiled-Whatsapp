package com.whatsapp;

import android.view.View.OnClickListener;
import org.v;
import org.whispersystems.at;

class axr implements OnClickListener {
    private static final String[] z;
    final RecordAudio a;

    static {
        String[] strArr = new String[3];
        String str = "q(\u0012/qk,\u0017\u0019dn";
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
                        i3 = 25;
                        break;
                    case at.g /*1*/:
                        i3 = 73;
                        break;
                    case at.i /*2*/:
                        i3 = 97;
                        break;
                    case at.o /*3*/:
                        i3 = 112;
                        break;
                    default:
                        i3 = 1;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "W&A\u0003qx*\u0004";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "k,\u0002\u001fs}(\u0014\u0014hvf\u0002\u001fom;\u000e\u001c.";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    axr(RecordAudio recordAudio) {
        this.a = recordAudio;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r7) {
        /*
        r6 = this;
        r5 = 4;
        r4 = 0;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x00f1 }
        r0.<init>();	 Catch:{ IOException -> 0x00f1 }
        r2 = z;	 Catch:{ IOException -> 0x00f1 }
        r3 = 1;
        r2 = r2[r3];	 Catch:{ IOException -> 0x00f1 }
        r0 = r0.append(r2);	 Catch:{ IOException -> 0x00f1 }
        r2 = r6.a;	 Catch:{ IOException -> 0x00f1 }
        r2 = com.whatsapp.RecordAudio.a(r2);	 Catch:{ IOException -> 0x00f1 }
        r0 = r0.append(r2);	 Catch:{ IOException -> 0x00f1 }
        r0 = r0.toString();	 Catch:{ IOException -> 0x00f1 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x00f1 }
        r0 = r6.a;	 Catch:{ IOException -> 0x00f1 }
        r0 = com.whatsapp.RecordAudio.a(r0);	 Catch:{ IOException -> 0x00f1 }
        switch(r0) {
            case 0: goto L_0x0038;
            case 1: goto L_0x008d;
            case 2: goto L_0x002c;
            case 3: goto L_0x009a;
            case 4: goto L_0x00b1;
            case 5: goto L_0x00b1;
            default: goto L_0x002c;
        };
    L_0x002c:
        r0 = r6.a;
        r1 = r6.a;
        r1 = com.whatsapp.RecordAudio.a(r1);
        com.whatsapp.RecordAudio.b(r0, r1);
        return;
    L_0x0038:
        r0 = r6.a;	 Catch:{ IOException -> 0x00f1 }
        r0 = com.whatsapp.RecordAudio.g(r0);	 Catch:{ IOException -> 0x00f1 }
        if (r0 == 0) goto L_0x0045;
    L_0x0040:
        r6.a();	 Catch:{ RuntimeException -> 0x00f5 }
        if (r1 == 0) goto L_0x002c;
    L_0x0045:
        r0 = r6.a;	 Catch:{  }
        r0 = com.whatsapp.RecordAudio.c(r0);	 Catch:{  }
        r2 = 0;
        r0.sendEmptyMessage(r2);	 Catch:{  }
        r0 = r6.a;	 Catch:{  }
        r0 = com.whatsapp.RecordAudio.d(r0);	 Catch:{  }
        r2 = 120000; // 0x1d4c0 float:1.68156E-40 double:5.9288E-319;
        r0.setMax(r2);	 Catch:{  }
        r0 = r6.a;	 Catch:{  }
        r2 = java.lang.System.currentTimeMillis();	 Catch:{  }
        com.whatsapp.RecordAudio.a(r0, r2);	 Catch:{  }
        r0 = r6.a;	 Catch:{ IOException -> 0x00f7 }
        r0 = com.whatsapp.RecordAudio.h(r0);	 Catch:{ IOException -> 0x00f7 }
        r0.d();	 Catch:{ IOException -> 0x00f7 }
    L_0x006d:
        r0 = r6.a;	 Catch:{ IOException -> 0x0121, RuntimeException -> 0x00fd }
        r0 = com.whatsapp.RecordAudio.h(r0);	 Catch:{ IOException -> 0x0121, RuntimeException -> 0x00fd }
        r0.c();	 Catch:{ IOException -> 0x0121, RuntimeException -> 0x00fd }
        r0 = r6.a;	 Catch:{ IOException -> 0x0121, RuntimeException -> 0x00fd }
        r2 = 1;
        com.whatsapp.RecordAudio.c(r0, r2);	 Catch:{ IOException -> 0x0121, RuntimeException -> 0x00fd }
    L_0x007c:
        r0 = r6.a;	 Catch:{ IOException -> 0x010b }
        r2 = r6.a;	 Catch:{ IOException -> 0x010b }
        r2 = com.whatsapp.RecordAudio.h(r2);	 Catch:{ IOException -> 0x010b }
        r2 = r2.a();	 Catch:{ IOException -> 0x010b }
        com.whatsapp.RecordAudio.a(r0, r2);	 Catch:{ IOException -> 0x010b }
        if (r1 == 0) goto L_0x002c;
    L_0x008d:
        r0 = r6.a;	 Catch:{ IOException -> 0x010b }
        com.whatsapp.RecordAudio.e(r0);	 Catch:{ IOException -> 0x010b }
        r0 = r6.a;	 Catch:{ IOException -> 0x010b }
        r2 = 4;
        com.whatsapp.RecordAudio.c(r0, r2);	 Catch:{ IOException -> 0x010b }
        if (r1 == 0) goto L_0x002c;
    L_0x009a:
        r0 = r6.a;
        r0 = com.whatsapp.RecordAudio.f(r0);
        r0.e();
        r0 = r6.a;	 Catch:{ IllegalStateException -> 0x010d, IOException -> 0x0112 }
        r0 = com.whatsapp.RecordAudio.f(r0);	 Catch:{ IllegalStateException -> 0x010d, IOException -> 0x0112 }
        r0.g();	 Catch:{ IllegalStateException -> 0x010d, IOException -> 0x0112 }
    L_0x00ac:
        r0 = r6.a;
        com.whatsapp.RecordAudio.c(r0, r5);
    L_0x00b1:
        r0 = r6.a;	 Catch:{ IOException -> 0x011f }
        r0 = com.whatsapp.RecordAudio.g(r0);	 Catch:{ IOException -> 0x011f }
        if (r0 == 0) goto L_0x00be;
    L_0x00b9:
        r6.a();	 Catch:{ IOException -> 0x011f }
        if (r1 == 0) goto L_0x002c;
    L_0x00be:
        r0 = new com.whatsapp.MediaData;
        r0.<init>();
        r1 = r6.a;
        r1 = com.whatsapp.RecordAudio.n(r1);
        r0.file = r1;
        r0 = new android.content.Intent;
        r0.<init>();
        r1 = r6.a;
        r1 = com.whatsapp.RecordAudio.n(r1);
        r1 = android.net.Uri.fromFile(r1);
        r0.setData(r1);
        r1 = z;
        r1 = r1[r4];
        r0.putExtra(r1, r4);
        r1 = r6.a;
        r2 = -1;
        r1.setResult(r2, r0);
        r0 = r6.a;
        r0.finish();
        goto L_0x002c;
    L_0x00f1:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00f3 }
    L_0x00f3:
        r0 = move-exception;
        throw r0;	 Catch:{  }
    L_0x00f5:
        r0 = move-exception;
        throw r0;
    L_0x00f7:
        r0 = move-exception;
        com.whatsapp.util.Log.a(r0);
        goto L_0x006d;
    L_0x00fd:
        r0 = move-exception;
    L_0x00fe:
        com.whatsapp.util.Log.a(r0);
        r0 = r6.a;
        r2 = 2131231123; // 0x7f080193 float:1.8078318E38 double:1.052968081E-314;
        r0.a(r2);
        goto L_0x007c;
    L_0x010b:
        r0 = move-exception;
        throw r0;
    L_0x010d:
        r0 = move-exception;
        com.whatsapp.util.Log.a(r0);
        goto L_0x00ac;
    L_0x0112:
        r0 = move-exception;
        com.whatsapp.util.Log.a(r0);
        r0 = r6.a;
        r2 = 2131231156; // 0x7f0801b4 float:1.8078385E38 double:1.0529680975E-314;
        r0.a(r2);
        goto L_0x00ac;
    L_0x011f:
        r0 = move-exception;
        throw r0;
    L_0x0121:
        r0 = move-exception;
        goto L_0x00fe;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.axr.onClick(android.view.View):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
        r10 = this;
        r9 = 2131232022; // 0x7f080516 float:1.8080142E38 double:1.0529685254E-314;
        r8 = 0;
        r0 = r10.a;	 Catch:{ FileNotFoundException -> 0x0043, IOException -> 0x0051 }
        r1 = r10.a;	 Catch:{ FileNotFoundException -> 0x0043, IOException -> 0x0051 }
        r2 = r10.a;	 Catch:{ FileNotFoundException -> 0x0043, IOException -> 0x0051 }
        r2 = com.whatsapp.RecordAudio.k(r2);	 Catch:{ FileNotFoundException -> 0x0043, IOException -> 0x0051 }
        r3 = r10.a;	 Catch:{ FileNotFoundException -> 0x0043, IOException -> 0x0051 }
        r3 = com.whatsapp.RecordAudio.n(r3);	 Catch:{ FileNotFoundException -> 0x0043, IOException -> 0x0051 }
        r4 = 2;
        r5 = 0;
        r6 = r10.a;	 Catch:{ FileNotFoundException -> 0x0043, IOException -> 0x0051 }
        r6 = com.whatsapp.RecordAudio.g(r6);	 Catch:{ FileNotFoundException -> 0x0043, IOException -> 0x0051 }
        r7 = 0;
        com.whatsapp.util.ag.a(r0, r1, r2, r3, r4, r5, r6, r7);	 Catch:{ FileNotFoundException -> 0x0043, IOException -> 0x0051 }
    L_0x0020:
        r0 = r10.a;	 Catch:{ FileNotFoundException -> 0x008f }
        r0 = com.whatsapp.RecordAudio.f(r0);	 Catch:{ FileNotFoundException -> 0x008f }
        if (r0 == 0) goto L_0x003d;
    L_0x0028:
        r0 = r10.a;	 Catch:{ FileNotFoundException -> 0x0091 }
        r0 = com.whatsapp.RecordAudio.f(r0);	 Catch:{ FileNotFoundException -> 0x0091 }
        r0 = r0.f();	 Catch:{ FileNotFoundException -> 0x0091 }
        if (r0 == 0) goto L_0x003d;
    L_0x0034:
        r0 = r10.a;	 Catch:{ FileNotFoundException -> 0x0091 }
        r0 = com.whatsapp.RecordAudio.f(r0);	 Catch:{ FileNotFoundException -> 0x0091 }
        r0.e();	 Catch:{ FileNotFoundException -> 0x0091 }
    L_0x003d:
        r0 = r10.a;
        r0.finish();
        return;
    L_0x0043:
        r0 = move-exception;
        com.whatsapp.util.Log.a(r0);
        r0 = r10.a;
        r0 = r0.getBaseContext();
        com.whatsapp.App.a(r0, r9, r8);
        goto L_0x0020;
    L_0x0051:
        r0 = move-exception;
        com.whatsapp.util.Log.a(r0);	 Catch:{ FileNotFoundException -> 0x008b }
        r1 = r0.getMessage();	 Catch:{ FileNotFoundException -> 0x008b }
        if (r1 == 0) goto L_0x007b;
    L_0x005b:
        r0 = r0.getMessage();	 Catch:{ FileNotFoundException -> 0x008d }
        r1 = z;	 Catch:{ FileNotFoundException -> 0x008d }
        r2 = 2;
        r1 = r1[r2];	 Catch:{ FileNotFoundException -> 0x008d }
        r0 = r0.contains(r1);	 Catch:{ FileNotFoundException -> 0x008d }
        if (r0 == 0) goto L_0x007b;
    L_0x006a:
        r0 = r10.a;	 Catch:{ FileNotFoundException -> 0x0089 }
        r0 = r0.getBaseContext();	 Catch:{ FileNotFoundException -> 0x0089 }
        r1 = 2131231112; // 0x7f080188 float:1.8078296E38 double:1.052968076E-314;
        r2 = 1;
        com.whatsapp.App.a(r0, r1, r2);	 Catch:{ FileNotFoundException -> 0x0089 }
        r0 = com.whatsapp.DialogToastActivity.f;	 Catch:{ FileNotFoundException -> 0x0089 }
        if (r0 == 0) goto L_0x0020;
    L_0x007b:
        r0 = r10.a;	 Catch:{ FileNotFoundException -> 0x0089 }
        r0 = r0.getBaseContext();	 Catch:{ FileNotFoundException -> 0x0089 }
        r1 = 2131232022; // 0x7f080516 float:1.8080142E38 double:1.0529685254E-314;
        r2 = 1;
        com.whatsapp.App.a(r0, r1, r2);	 Catch:{ FileNotFoundException -> 0x0089 }
        goto L_0x0020;
    L_0x0089:
        r0 = move-exception;
        throw r0;
    L_0x008b:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x008d }
    L_0x008d:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x0089 }
    L_0x008f:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x0091 }
    L_0x0091:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.axr.a():void");
    }
}
