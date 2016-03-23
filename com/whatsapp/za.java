package com.whatsapp;

import com.whatsapp.util.ap;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class za extends ap {
    private static final String[] z;
    final RegisterPhone b;

    static {
        String[] strArr = new String[13];
        String str = "n@;\u0012heN\"O~}_xnzjF%Hz\u007f\u007f>Sqh\u00015Sjc[$E@n@2Y";
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
                        i3 = 13;
                        break;
                    case at.g /*1*/:
                        i3 = 47;
                        break;
                    case at.i /*2*/:
                        i3 = 86;
                        break;
                    case at.o /*3*/:
                        i3 = 60;
                        break;
                    default:
                        i3 = 31;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\"A#Q}h]k";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u007fJ1UlyJ$\u0013oe@8Y0~J\"Qv~[/Lzi\\\"]kh\u00000]vaJ2";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u007fJ1UlyJ$\u0013oe@8Y0nG3_tk@$NzdA%H~aC";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "Qk";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u007fJ1UlyJ$LwbA3\u0013|n\u000f0]vaJ2\u001ck\u007fF;pzlK?RxWJ$S?k]9Q?N@#Rk\u007fV\u0006TpcJ\u001fRyb";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u007fJ1UlyJ$\u0013oe@8Y0~J\"Rj`M3Nl\"L9Qrd[vZ~dC3X";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "n@;\u0012heN\"O~}_\tLmhI3NzcL3O";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "Qk";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u007fJ1UlyJ$\u0013oe@8Y0nLk";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u007fJ1UlyJ$\u0013oe@8Y0nG3_t\u007fJ?RlyN:P0c@{_pcA3_kdY?Hf";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "n@;\u0012heN\"O~}_xnzjF%Hz\u007f\u007f>Sqh\u0001&TpcJ\tRj`M3N";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "n@;\u0012heN\"O~}_xnzjF%Hz\u007f\u007f>Sqh\u0001;UlyV&Y{R\\\"]kh";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.view.View r12) {
        /*
        r11 = this;
        r10 = 4;
        r9 = 3;
        r8 = 2;
        r7 = 1;
        r6 = 0;
        r0 = r11.b;	 Catch:{ IOException -> 0x000e }
        r0 = com.whatsapp.RegisterPhone.f(r0);	 Catch:{ IOException -> 0x000e }
        if (r0 == 0) goto L_0x0010;
    L_0x000d:
        return;
    L_0x000e:
        r0 = move-exception;
        throw r0;
    L_0x0010:
        r0 = r11.b;
        r1 = com.whatsapp.RegisterPhone.d(r0);
        r0 = r11.b;
        r0 = r0.o();
        r2 = z;
        r3 = 9;
        r2 = r2[r3];
        r3 = "";
        r2 = r0.replaceAll(r2, r3);
        r0 = r11.b;
        r0 = r0.m();
        r3 = com.whatsapp.EnterPhoneNumber.a(r2, r0);
        switch(r3) {
            case 1: goto L_0x00e4;
            case 2: goto L_0x00e8;
            case 3: goto L_0x00ff;
            case 4: goto L_0x011e;
            case 5: goto L_0x0131;
            case 6: goto L_0x0158;
            case 7: goto L_0x017f;
            default: goto L_0x0036;
        };
    L_0x0036:
        r3 = java.lang.Integer.parseInt(r2);
        r4 = z;
        r5 = 5;
        r4 = r4[r5];
        r5 = "";
        r0 = r0.replaceAll(r4, r5);
        r0 = com.whatsapp.u0.a(r3, r0);	 Catch:{ IOException -> 0x01a6 }
    L_0x004a:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = z;
        r5 = 10;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r3 = r3.append(r2);
        r4 = z;
        r4 = r4[r8];
        r3 = r3.append(r4);
        r3 = r3.append(r0);
        r3 = r3.toString();
        com.whatsapp.util.Log.i(r3);
        r3 = com.whatsapp.App.p;
        r3 = r3.aS;
        r4 = r11.b;
        r3.b(r4);
        r3 = z;
        r3 = r3[r10];
        com.whatsapp.util.Log.i(r3);
        r3 = 7;
        com.whatsapp.EnterPhoneNumber.C = r3;
        com.whatsapp.EnterPhoneNumber.w = r2;
        com.whatsapp.EnterPhoneNumber.A = r0;
        r0 = r11.b;
        r0 = r0.getPreferences(r6);
        r0 = r0.edit();
        r2 = z;	 Catch:{ IOException -> 0x01b1 }
        r3 = 0;
        r2 = r2[r3];	 Catch:{ IOException -> 0x01b1 }
        r3 = com.whatsapp.EnterPhoneNumber.w;	 Catch:{ IOException -> 0x01b1 }
        r0.putString(r2, r3);	 Catch:{ IOException -> 0x01b1 }
        r2 = z;	 Catch:{ IOException -> 0x01b1 }
        r3 = 12;
        r2 = r2[r3];	 Catch:{ IOException -> 0x01b1 }
        r3 = com.whatsapp.EnterPhoneNumber.A;	 Catch:{ IOException -> 0x01b1 }
        r0.putString(r2, r3);	 Catch:{ IOException -> 0x01b1 }
        r0 = r0.commit();	 Catch:{ IOException -> 0x01b1 }
        if (r0 != 0) goto L_0x00b4;
    L_0x00ac:
        r0 = z;	 Catch:{ IOException -> 0x01b1 }
        r2 = 7;
        r0 = r0[r2];	 Catch:{ IOException -> 0x01b1 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ IOException -> 0x01b1 }
    L_0x00b4:
        r0 = com.whatsapp.App.Q();	 Catch:{ IOException -> 0x00e2 }
        if (r0 != 0) goto L_0x01b3;
    L_0x00ba:
        r0 = z;	 Catch:{ IOException -> 0x00e2 }
        r1 = 11;
        r0 = r0[r1];	 Catch:{ IOException -> 0x00e2 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x00e2 }
        r0 = r11.b;	 Catch:{ IOException -> 0x00e2 }
        r1 = r11.b;	 Catch:{ IOException -> 0x00e2 }
        r2 = 2131231746; // 0x7f080402 float:1.8079582E38 double:1.052968389E-314;
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ IOException -> 0x00e2 }
        r4 = 0;
        r5 = r11.b;	 Catch:{ IOException -> 0x00e2 }
        r6 = 2131230939; // 0x7f0800db float:1.8077945E38 double:1.0529679903E-314;
        r5 = r5.getString(r6);	 Catch:{ IOException -> 0x00e2 }
        r3[r4] = r5;	 Catch:{ IOException -> 0x00e2 }
        r1 = r1.getString(r2, r3);	 Catch:{ IOException -> 0x00e2 }
        r0.j(r1);	 Catch:{ IOException -> 0x00e2 }
        goto L_0x000d;
    L_0x00e2:
        r0 = move-exception;
        throw r0;
    L_0x00e4:
        r3 = com.whatsapp.DialogToastActivity.f;	 Catch:{ IOException -> 0x00fd }
        if (r3 == 0) goto L_0x0036;
    L_0x00e8:
        r0 = r11.b;	 Catch:{ IOException -> 0x00fb }
        r1 = 2131231738; // 0x7f0803fa float:1.8079565E38 double:1.052968385E-314;
        r0.b(r1);	 Catch:{ IOException -> 0x00fb }
        r0 = r11.b;	 Catch:{ IOException -> 0x00fb }
        r0 = r0.v;	 Catch:{ IOException -> 0x00fb }
        r0 = r0.e;	 Catch:{ IOException -> 0x00fb }
        r0.requestFocus();	 Catch:{ IOException -> 0x00fb }
        goto L_0x000d;
    L_0x00fb:
        r0 = move-exception;
        throw r0;
    L_0x00fd:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00fb }
    L_0x00ff:
        r0 = r11.b;
        r1 = 2131231739; // 0x7f0803fb float:1.8079568E38 double:1.0529683856E-314;
        r0.b(r1);
        r0 = r11.b;
        r0 = r0.v;
        r0 = r0.e;
        r1 = "";
        r0.setText(r1);
        r0 = r11.b;
        r0 = r0.v;
        r0 = r0.e;
        r0.requestFocus();
        goto L_0x000d;
    L_0x011e:
        r0 = r11.b;
        r1 = 2131231752; // 0x7f080408 float:1.8079594E38 double:1.052968392E-314;
        r0.b(r1);
        r0 = r11.b;
        r0 = r0.v;
        r0 = r0.c;
        r0.requestFocus();
        goto L_0x000d;
    L_0x0131:
        r0 = r11.b;
        r1 = r11.b;
        r2 = 2131231744; // 0x7f080400 float:1.8079578E38 double:1.052968388E-314;
        r3 = new java.lang.Object[r7];
        r4 = r11.b;
        r4 = r4.v;
        r4 = r4.g;
        r4 = r4.getText();
        r3[r6] = r4;
        r1 = r1.getString(r2, r3);
        r0.j(r1);
        r0 = r11.b;
        r0 = r0.v;
        r0 = r0.c;
        r0.requestFocus();
        goto L_0x000d;
    L_0x0158:
        r0 = r11.b;
        r1 = r11.b;
        r2 = 2131231743; // 0x7f0803ff float:1.8079576E38 double:1.0529683875E-314;
        r3 = new java.lang.Object[r7];
        r4 = r11.b;
        r4 = r4.v;
        r4 = r4.g;
        r4 = r4.getText();
        r3[r6] = r4;
        r1 = r1.getString(r2, r3);
        r0.j(r1);
        r0 = r11.b;
        r0 = r0.v;
        r0 = r0.c;
        r0.requestFocus();
        goto L_0x000d;
    L_0x017f:
        r0 = r11.b;
        r1 = r11.b;
        r2 = 2131231742; // 0x7f0803fe float:1.8079574E38 double:1.052968387E-314;
        r3 = new java.lang.Object[r7];
        r4 = r11.b;
        r4 = r4.v;
        r4 = r4.g;
        r4 = r4.getText();
        r3[r6] = r4;
        r1 = r1.getString(r2, r3);
        r0.j(r1);
        r0 = r11.b;
        r0 = r0.v;
        r0 = r0.c;
        r0.requestFocus();
        goto L_0x000d;
    L_0x01a6:
        r3 = move-exception;
        r4 = z;
        r5 = 6;
        r4 = r4[r5];
        com.whatsapp.util.Log.b(r4, r3);
        goto L_0x004a;
    L_0x01b1:
        r0 = move-exception;
        throw r0;
    L_0x01b3:
        r0 = r11.b;
        com.whatsapp.RegisterPhone.g(r0);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = com.whatsapp.EnterPhoneNumber.w;
        r0 = r0.append(r2);
        r2 = com.whatsapp.EnterPhoneNumber.A;
        r0 = r0.append(r2);
        r0 = r0.toString();
        r2 = com.whatsapp.App.D(r0);
        r0 = com.whatsapp.ve.e(r2);
        if (r0 != 0) goto L_0x01de;
    L_0x01d7:
        r0 = com.whatsapp.ve.d();
        com.whatsapp.ve.a(r0, r2);
    L_0x01de:
        r2 = r11.b;
        r3 = com.whatsapp.EnterPhoneNumber.w;
        r4 = com.whatsapp.EnterPhoneNumber.A;
        r1 = com.whatsapp.RegisterPhone.a(r2, r1, r3, r4);
        r2 = r11.b;
        r3 = z;
        r4 = 8;
        r3 = r3[r4];
        r2 = r2.getSharedPreferences(r3, r6);
        r2 = r2.edit();
        r3 = z;	 Catch:{ IOException -> 0x023b }
        r4 = 1;
        r3 = r3[r4];	 Catch:{ IOException -> 0x023b }
        r2.putString(r3, r1);	 Catch:{ IOException -> 0x023b }
        r2 = r2.commit();	 Catch:{ IOException -> 0x023b }
        if (r2 != 0) goto L_0x020e;
    L_0x0206:
        r2 = z;	 Catch:{ IOException -> 0x023b }
        r3 = 3;
        r2 = r2[r3];	 Catch:{ IOException -> 0x023b }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IOException -> 0x023b }
    L_0x020e:
        r2 = new com.whatsapp.a3r;
        r3 = r11.b;
        r4 = 0;
        r5 = r11.b;
        r5 = com.whatsapp.RegisterPhone.e(r5);
        r2.<init>(r3, r4, r5);
        r3 = new byte[r10][];
        r4 = com.whatsapp.EnterPhoneNumber.w;
        r4 = r4.getBytes();
        r3[r6] = r4;
        r4 = com.whatsapp.EnterPhoneNumber.A;
        r4 = r4.getBytes();
        r3[r7] = r4;
        r3[r8] = r0;
        r0 = r1.getBytes();
        r3[r9] = r0;
        com.whatsapp.util.bq.a(r2, r3);
        goto L_0x000d;
    L_0x023b:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.za.a(android.view.View):void");
    }

    za(RegisterPhone registerPhone) {
        this.b = registerPhone;
    }
}
