package com.whatsapp.camera;

import android.net.Uri;
import com.whatsapp.util.ap;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

class s extends ap {
    private static final String[] z;
    final CameraActivity b;
    final Uri c;

    static {
        String[] strArr = new String[8];
        String str = "E%a\u0012#K";
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
                        i3 = 35;
                        break;
                    case at.g /*1*/:
                        i3 = 73;
                        break;
                    case at.i /*2*/:
                        i3 = 8;
                        break;
                    case at.o /*3*/:
                        i3 = 98;
                        break;
                    default:
                        i3 = 14;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "B'l\u0010aJ-&\u000b`W,f\u0016 F1|\u0010o\r\u001a\\0Kb\u0004";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "@(e\u0007|B";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "J$i\u0005k\fc";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "Q&|\u0003zJ&f";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "P\"a\u0012QS;m\u0014gF>";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "E%a\u0012#K";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "@(x\u0016gL'";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.view.View r8) {
        /*
        r7 = this;
        r6 = 1;
        r4 = 8;
        r5 = 0;
        r1 = com.whatsapp.camera.CameraActivity.I;
        r0 = r7.b;
        r2 = 2131755404; // 0x7f10018c float:1.9141686E38 double:1.0532271105E-314;
        r0 = r0.findViewById(r2);
        r0.setVisibility(r4);
        r0 = r7.b;
        r2 = 2131755369; // 0x7f100169 float:1.9141615E38 double:1.053227093E-314;
        r0 = r0.findViewById(r2);
        r0.setVisibility(r4);
        r0 = r7.b;
        r0 = com.whatsapp.camera.CameraActivity.f(r0);
        r0 = r0.getText();
        r0 = r0.toString();
        r2 = com.whatsapp.a28.a(r0);
        r0 = r7.b;
        r0 = com.whatsapp.camera.CameraActivity.g(r0);
        if (r0 != 0) goto L_0x00f6;
    L_0x0038:
        r0 = r7.c;
    L_0x003a:
        r0 = r0.buildUpon();
        r3 = android.text.TextUtils.isEmpty(r2);
        if (r3 != 0) goto L_0x0056;
    L_0x0044:
        r3 = z;
        r3 = r3[r6];
        r0.appendQueryParameter(r3, r2);
        r2 = r7.b;
        r2 = com.whatsapp.camera.CameraActivity.f(r2);
        r2.setEnabled(r5);
        if (r1 == 0) goto L_0x0062;
    L_0x0056:
        r2 = r7.b;
        r3 = 2131755402; // 0x7f10018a float:1.9141682E38 double:1.0532271095E-314;
        r2 = r2.findViewById(r3);
        r2.setVisibility(r4);
    L_0x0062:
        r2 = r7.b;
        r2 = com.whatsapp.camera.CameraActivity.s(r2);
        if (r2 == 0) goto L_0x007c;
    L_0x006a:
        r2 = z;
        r3 = 5;
        r2 = r2[r3];
        r3 = r7.b;
        r3 = com.whatsapp.camera.CameraActivity.s(r3);
        r3 = java.lang.Integer.toString(r3);
        r0.appendQueryParameter(r2, r3);
    L_0x007c:
        r2 = r7.c;
        r3 = z;
        r4 = 7;
        r3 = r3[r4];
        r2 = r2.getQueryParameter(r3);
        if (r2 == 0) goto L_0x0093;
    L_0x0089:
        r2 = z;
        r2 = r2[r5];
        r3 = "1";
        r0.appendQueryParameter(r2, r3);
    L_0x0093:
        r0 = r0.build();
        r2 = r7.b;
        r2 = com.whatsapp.camera.CameraActivity.e(r2);
        if (r2 == 0) goto L_0x00b7;
    L_0x009f:
        r2 = r7.b;
        r3 = 2131755410; // 0x7f100192 float:1.9141698E38 double:1.0532271134E-314;
        r2 = r2.findViewById(r3);
        r2.setVisibility(r5);
        r2 = new com.whatsapp.camera.at;
        r2.<init>(r7, r0);
        r3 = new java.lang.Void[r5];
        com.whatsapp.util.bq.a(r2, r3);
        if (r1 == 0) goto L_0x00e6;
    L_0x00b7:
        r2 = new android.content.Intent;
        r3 = r7.b;
        r3 = r3.getBaseContext();
        r4 = com.whatsapp.ContactPicker.class;
        r2.<init>(r3, r4);
        r3 = z;
        r4 = 4;
        r3 = r3[r4];
        r2.setType(r3);
        r3 = z;
        r4 = 2;
        r3 = r3[r4];
        r2.putExtra(r3, r0);
        r0 = z;
        r3 = 6;
        r0 = r0[r3];
        r2.putExtra(r0, r6);
        r0 = r7.b;
        r0.startActivity(r2);
        r0 = r7.b;
        r0.finish();
    L_0x00e6:
        r0 = r7.b;
        r2 = r7.c;
        com.whatsapp.util.ag.a(r0, r2);
        r0 = com.whatsapp.WAAppCompatActivity.c;
        if (r0 == 0) goto L_0x00f5;
    L_0x00f1:
        r0 = r1 + 1;
        com.whatsapp.camera.CameraActivity.I = r0;
    L_0x00f5:
        return;
    L_0x00f6:
        r0 = z;
        r3 = 3;
        r0 = r0[r3];
        r0 = com.whatsapp.App.j(r0);
        r0 = android.net.Uri.fromFile(r0);
        goto L_0x003a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.s.a(android.view.View):void");
    }

    s(CameraActivity cameraActivity, Uri uri) {
        this.b = cameraActivity;
        this.c = uri;
    }
}
