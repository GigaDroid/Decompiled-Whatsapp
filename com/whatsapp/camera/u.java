package com.whatsapp.camera;

import com.whatsapp.util.ap;
import org.v;
import org.whispersystems.at;

class u extends ap {
    private static final String[] z;
    final CameraActivity b;

    static {
        String[] strArr = new String[6];
        String str = "XDiJIZDg[RMLpV\u0014HQk_MRAa@XZUpZI^\u0005";
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
                        i3 = 59;
                        break;
                    case at.g /*1*/:
                        i3 = 37;
                        break;
                    case at.i /*2*/:
                        i3 = 4;
                        break;
                    case at.o /*3*/:
                        i3 = 47;
                        break;
                    default:
                        i3 = 59;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "XDt[RTK";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "HNm_dKWaYR^R";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "uJ$\\KZFa";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "ML`JT\u0014\u000f";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "ZK`]TRA*FUO@j[\u0015^]p]Z\u0015vP}~zh";
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
        r10 = 3;
        r9 = 1;
        r8 = 0;
        r7 = com.whatsapp.camera.CameraActivity.I;
        r0 = r11.b;
        r0 = com.whatsapp.camera.CameraActivity.f(r0);
        r0 = r0.getText();
        r6 = r0.toString();
        r0 = r11.b;
        r0 = com.whatsapp.camera.CameraActivity.e(r0);
        if (r0 == 0) goto L_0x0097;
    L_0x001b:
        r0 = r11.b;	 Catch:{ IOException -> 0x0046 }
        r1 = r11.b;	 Catch:{ IOException -> 0x0046 }
        r1 = com.whatsapp.camera.CameraActivity.e(r1);	 Catch:{ IOException -> 0x0046 }
        r1 = r1.p;	 Catch:{ IOException -> 0x0046 }
        r2 = r11.b;	 Catch:{ IOException -> 0x0046 }
        r2 = com.whatsapp.camera.CameraActivity.w(r2);	 Catch:{ IOException -> 0x0046 }
        r3 = 3;
        r4 = 0;
        r5 = 0;
        com.whatsapp.util.ag.a(r0, r1, r2, r3, r4, r5, r6);	 Catch:{ IOException -> 0x0046 }
    L_0x0031:
        r0 = r11.b;
        r1 = r11.b;
        r1 = com.whatsapp.camera.CameraActivity.w(r1);
        r1 = android.net.Uri.fromFile(r1);
        com.whatsapp.util.ag.a(r0, r1);
        r0 = r11.b;
        r0.finish();
        return;
    L_0x0046:
        r0 = move-exception;
        r1 = r0.getMessage();	 Catch:{ IOException -> 0x00e2 }
        if (r1 == 0) goto L_0x006c;
    L_0x004d:
        r1 = r0.getMessage();	 Catch:{ IOException -> 0x00e4 }
        r2 = z;	 Catch:{ IOException -> 0x00e4 }
        r3 = 4;
        r2 = r2[r3];	 Catch:{ IOException -> 0x00e4 }
        r1 = r1.contains(r2);	 Catch:{ IOException -> 0x00e4 }
        if (r1 == 0) goto L_0x006c;
    L_0x005c:
        r1 = r11.b;	 Catch:{ IOException -> 0x00e6 }
        r2 = r11.b;	 Catch:{ IOException -> 0x00e6 }
        r3 = 2131231112; // 0x7f080188 float:1.8078296E38 double:1.052968076E-314;
        r2 = r2.getString(r3);	 Catch:{ IOException -> 0x00e6 }
        com.whatsapp.App.a(r1, r2);	 Catch:{ IOException -> 0x00e6 }
        if (r7 == 0) goto L_0x0079;
    L_0x006c:
        r1 = r11.b;	 Catch:{ IOException -> 0x00e6 }
        r1 = r1.getBaseContext();	 Catch:{ IOException -> 0x00e6 }
        r2 = 2131232022; // 0x7f080516 float:1.8080142E38 double:1.0529685254E-314;
        r3 = 0;
        com.whatsapp.App.a(r1, r2, r3);	 Catch:{ IOException -> 0x00e6 }
    L_0x0079:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r2 = r2[r8];
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        if (r7 == 0) goto L_0x0031;
    L_0x0097:
        r1 = new android.content.Intent;
        r0 = r11.b;
        r0 = r0.getBaseContext();
        r2 = com.whatsapp.ContactPicker.class;
        r1.<init>(r0, r2);
        r0 = z;
        r2 = 5;
        r0 = r0[r2];
        r1.setType(r0);
        r0 = r11.b;
        r0 = com.whatsapp.camera.CameraActivity.w(r0);
        r0 = android.net.Uri.fromFile(r0);
        r2 = android.text.TextUtils.isEmpty(r6);
        if (r2 != 0) goto L_0x00cd;
    L_0x00bc:
        r0 = r0.buildUpon();
        r2 = z;
        r3 = 2;
        r2 = r2[r3];
        r0 = r0.appendQueryParameter(r2, r6);
        r0 = r0.build();
    L_0x00cd:
        r2 = z;
        r2 = r2[r9];
        r1.putExtra(r2, r0);
        r0 = z;
        r0 = r0[r10];
        r1.putExtra(r0, r9);
        r0 = r11.b;
        r0.startActivity(r1);
        goto L_0x0031;
    L_0x00e2:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00e4 }
    L_0x00e4:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00e6 }
    L_0x00e6:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.u.a(android.view.View):void");
    }

    u(CameraActivity cameraActivity) {
        this.b = cameraActivity;
    }
}
