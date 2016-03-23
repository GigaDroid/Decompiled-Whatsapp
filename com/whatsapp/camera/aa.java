package com.whatsapp.camera;

import android.view.View.OnLongClickListener;
import org.v;
import org.whispersystems.at;

class aa implements OnLongClickListener {
    private static final String[] z;
    final CameraActivity a;

    static {
        String[] strArr = new String[6];
        String str = "sEVDS{O\u001cFY`F[EO{D\\\u0018nWh}dxMjgru]";
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
                        i3 = 18;
                        break;
                    case at.g /*1*/:
                        i3 = 43;
                        break;
                    case at.i /*2*/:
                        i3 = 50;
                        break;
                    case at.o /*3*/:
                        i3 = 54;
                        break;
                    default:
                        i3 = 60;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "sEVDS{O\u001cFY`F[EO{D\\\u0018nWh}dxMjgru]";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "bN@[cvN\\_]~t_SOaJUSc{O";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "bN@[UaX[YRa";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "vYSA]pGWiUv";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u007fNAE]uNm_X";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onLongClick(android.view.View r9) {
        /*
        r8 = this;
        r7 = 0;
        r6 = 1;
        r0 = r8.a;
        r0 = com.whatsapp.camera.CameraActivity.u(r0);
        if (r0 != 0) goto L_0x0016;
    L_0x000a:
        r0 = com.whatsapp.App.p;
        r1 = z;
        r1 = r1[r7];
        r0 = r0.o(r1);
        if (r0 != 0) goto L_0x002b;
    L_0x0016:
        r0 = r8.a;
        r0 = com.whatsapp.camera.CameraActivity.c(r0);
        r1 = 2130837688; // 0x7f0200b8 float:1.7280337E38 double:1.0527736985E-314;
        r0.setImageResource(r1);
        r0 = r8.a;
        com.whatsapp.camera.CameraActivity.q(r0);
        r0 = com.whatsapp.camera.CameraActivity.I;
        if (r0 == 0) goto L_0x0073;
    L_0x002b:
        r0 = r8.a;
        com.whatsapp.camera.CameraActivity.a(r0, r6);
        r0 = r8.a;
        r1 = new android.content.Intent;
        r2 = r8.a;
        r3 = com.whatsapp.RequestPermissionActivity.class;
        r1.<init>(r2, r3);
        r2 = z;
        r3 = 5;
        r2 = r2[r3];
        r3 = 2130839701; // 0x7f020895 float:1.728442E38 double:1.052774693E-314;
        r1 = r1.putExtra(r2, r3);
        r2 = z;
        r2 = r2[r6];
        r3 = 2131231632; // 0x7f080390 float:1.807935E38 double:1.0529683327E-314;
        r1 = r1.putExtra(r2, r3);
        r2 = z;
        r3 = 3;
        r2 = r2[r3];
        r3 = 2131231631; // 0x7f08038f float:1.8079348E38 double:1.052968332E-314;
        r1 = r1.putExtra(r2, r3);
        r2 = z;
        r3 = 4;
        r2 = r2[r3];
        r3 = new java.lang.String[r6];
        r4 = z;
        r5 = 2;
        r4 = r4[r5];
        r3[r7] = r4;
        r1 = r1.putExtra(r2, r3);
        r0.startActivity(r1);
    L_0x0073:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.aa.onLongClick(android.view.View):boolean");
    }

    aa(CameraActivity cameraActivity) {
        this.a = cameraActivity;
    }
}
