package com.whatsapp;

import android.view.View.OnClickListener;
import org.v;
import org.whispersystems.at;

class vp implements OnClickListener {
    private static final String[] z;
    final DeleteAccount a;

    static {
        String[] strArr = new String[7];
        String str = "@}\u001bL\rA5\u0016J\u001aKm\u0019]VTp\u0018G\u001c\u000b{\u0014\u0014";
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
                        i3 = 24;
                        break;
                    case at.i /*2*/:
                        i3 = 119;
                        break;
                    case at.o /*3*/:
                        i3 = 41;
                        break;
                    default:
                        i3 = 121;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "x\\";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u000bv\u0002D\u001bAjJ";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "@}\u001bL\rA5\u0016J\u001aKm\u0019]VWm\u0015D\u0010P7\u0014JY";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0004r\u001eMD";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "@}\u001bL\rA5\u0016J\u001aKm\u0019]VTp\u0018G\u001c\u0004~\u0016@\u0015A|W]\u000bMu;L\u0018@q\u0019N#Aj\u0018\t\u001fVw\u001a\t:Km\u0019]\u000b]H\u001fF\u0017AQ\u0019O\u0016";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0004h\u001f\u0014";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r9) {
        /*
        r8 = this;
        r7 = 4;
        r6 = 0;
        r5 = 1;
        r0 = r8.a;
        r0 = r0.p;
        r0 = r0.getText();
        r0 = r0.toString();
        r1 = r0.trim();
        r0 = r8.a;
        r0 = r0.u;
        r0 = r0.getText();
        r0 = r0.toString();
        r2 = com.whatsapp.EnterPhoneNumber.a(r1, r0);
        switch(r2) {
            case 1: goto L_0x00f8;
            case 2: goto L_0x00fc;
            case 3: goto L_0x0110;
            case 4: goto L_0x012a;
            case 5: goto L_0x013a;
            case 6: goto L_0x015c;
            case 7: goto L_0x017f;
            default: goto L_0x0026;
        };
    L_0x0026:
        r2 = java.lang.Integer.parseInt(r1);
        r3 = z;
        r4 = 2;
        r3 = r3[r4];
        r4 = "";
        r0 = r0.replaceAll(r3, r4);
        r0 = com.whatsapp.u0.a(r2, r0);	 Catch:{ IOException -> 0x01a2 }
    L_0x003a:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r3 = r3[r6];
        r2 = r2.append(r3);
        r2 = r2.append(r1);
        r3 = z;
        r4 = 3;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r0);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        com.whatsapp.DeleteAccount.c(r1);
        com.whatsapp.DeleteAccount.b(r0);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r1 = r1[r7];
        r0 = r0.append(r1);
        r1 = com.whatsapp.DeleteAccount.b();
        r0 = r0.append(r1);
        r1 = z;
        r1 = r1[r5];
        r0 = r0.append(r1);
        r1 = com.whatsapp.DeleteAccount.a();
        r0 = r0.append(r1);
        r1 = z;
        r2 = 5;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = com.whatsapp.App.ay;
        r1 = r1.jabber_id;
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
        r0 = r8.a;
        r0.showDialog(r5);
        r0 = r8.a;
        r0 = com.whatsapp.DeleteAccount.b(r0);
        r2 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        r0.sendEmptyMessageDelayed(r7, r2);
        r0 = new com.whatsapp.a5k;
        r0.<init>(r8);
        r1 = new com.whatsapp.d0;
        r1.<init>(r8);
        r2 = com.whatsapp.DeleteAccount.b();	 Catch:{ IOException -> 0x01ad }
        r3 = com.whatsapp.DeleteAccount.a();	 Catch:{ IOException -> 0x01ad }
        r0 = com.whatsapp.App.a(r2, r3, r0, r1);	 Catch:{ IOException -> 0x01ad }
        if (r0 != 0) goto L_0x00f7;
    L_0x00ca:
        r0 = r8.a;	 Catch:{ IOException -> 0x01ad }
        r0 = com.whatsapp.DeleteAccount.b(r0);	 Catch:{ IOException -> 0x01ad }
        r1 = 4;
        r0.removeMessages(r1);	 Catch:{ IOException -> 0x01ad }
        r0 = r8.a;	 Catch:{ IOException -> 0x01ad }
        r1 = 1;
        r0.removeDialog(r1);	 Catch:{ IOException -> 0x01ad }
        r0 = r8.a;	 Catch:{ IOException -> 0x01ad }
        r1 = r8.a;	 Catch:{ IOException -> 0x01ad }
        r2 = 2131231746; // 0x7f080402 float:1.8079582E38 double:1.052968389E-314;
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ IOException -> 0x01ad }
        r4 = 0;
        r5 = r8.a;	 Catch:{ IOException -> 0x01ad }
        r6 = 2131230939; // 0x7f0800db float:1.8077945E38 double:1.0529679903E-314;
        r5 = r5.getString(r6);	 Catch:{ IOException -> 0x01ad }
        r3[r4] = r5;	 Catch:{ IOException -> 0x01ad }
        r1 = r1.getString(r2, r3);	 Catch:{ IOException -> 0x01ad }
        r0.f(r1);	 Catch:{ IOException -> 0x01ad }
    L_0x00f7:
        return;
    L_0x00f8:
        r2 = com.whatsapp.DialogToastActivity.f;	 Catch:{ IOException -> 0x010e }
        if (r2 == 0) goto L_0x0026;
    L_0x00fc:
        r0 = r8.a;	 Catch:{ IOException -> 0x010c }
        r1 = 2131231738; // 0x7f0803fa float:1.8079565E38 double:1.052968385E-314;
        r0.a(r1);	 Catch:{ IOException -> 0x010c }
        r0 = r8.a;	 Catch:{ IOException -> 0x010c }
        r0 = r0.p;	 Catch:{ IOException -> 0x010c }
        r0.requestFocus();	 Catch:{ IOException -> 0x010c }
        goto L_0x00f7;
    L_0x010c:
        r0 = move-exception;
        throw r0;
    L_0x010e:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x010c }
    L_0x0110:
        r0 = r8.a;
        r1 = 2131231739; // 0x7f0803fb float:1.8079568E38 double:1.0529683856E-314;
        r0.a(r1);
        r0 = r8.a;
        r0 = r0.p;
        r1 = "";
        r0.setText(r1);
        r0 = r8.a;
        r0 = r0.p;
        r0.requestFocus();
        goto L_0x00f7;
    L_0x012a:
        r0 = r8.a;
        r1 = 2131231752; // 0x7f080408 float:1.8079594E38 double:1.052968392E-314;
        r0.a(r1);
        r0 = r8.a;
        r0 = r0.u;
        r0.requestFocus();
        goto L_0x00f7;
    L_0x013a:
        r0 = r8.a;
        r1 = r8.a;
        r2 = 2131231744; // 0x7f080400 float:1.8079578E38 double:1.052968388E-314;
        r3 = new java.lang.Object[r5];
        r4 = r8.a;
        r4 = r4.v;
        r4 = r4.getText();
        r3[r6] = r4;
        r1 = r1.getString(r2, r3);
        r0.f(r1);
        r0 = r8.a;
        r0 = r0.u;
        r0.requestFocus();
        goto L_0x00f7;
    L_0x015c:
        r0 = r8.a;
        r1 = r8.a;
        r2 = 2131231743; // 0x7f0803ff float:1.8079576E38 double:1.0529683875E-314;
        r3 = new java.lang.Object[r5];
        r4 = r8.a;
        r4 = r4.v;
        r4 = r4.getText();
        r3[r6] = r4;
        r1 = r1.getString(r2, r3);
        r0.f(r1);
        r0 = r8.a;
        r0 = r0.u;
        r0.requestFocus();
        goto L_0x00f7;
    L_0x017f:
        r0 = r8.a;
        r1 = r8.a;
        r2 = 2131231742; // 0x7f0803fe float:1.8079574E38 double:1.052968387E-314;
        r3 = new java.lang.Object[r5];
        r4 = r8.a;
        r4 = r4.v;
        r4 = r4.getText();
        r3[r6] = r4;
        r1 = r1.getString(r2, r3);
        r0.f(r1);
        r0 = r8.a;
        r0 = r0.u;
        r0.requestFocus();
        goto L_0x00f7;
    L_0x01a2:
        r2 = move-exception;
        r3 = z;
        r4 = 6;
        r3 = r3[r4];
        com.whatsapp.util.Log.b(r3, r2);
        goto L_0x003a;
    L_0x01ad:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.vp.onClick(android.view.View):void");
    }

    vp(DeleteAccount deleteAccount) {
        this.a = deleteAccount;
    }
}
