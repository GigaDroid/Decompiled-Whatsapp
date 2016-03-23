package com.whatsapp.camera;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import org.v;
import org.whispersystems.at;

class x implements OnGlobalLayoutListener {
    private static final String z;
    final CameraActivity a;
    boolean b;

    static {
        char[] toCharArray = "J%j!1H%d0*_-s=lB&c\u001b0A+p*c".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 41;
                    break;
                case at.g /*1*/:
                    i2 = 68;
                    break;
                case at.i /*2*/:
                    i2 = 7;
                    break;
                case at.o /*3*/:
                    i2 = 68;
                    break;
                default:
                    i2 = 67;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGlobalLayout() {
        /*
        r10 = this;
        r9 = 2131755404; // 0x7f10018c float:1.9141686E38 double:1.0532271105E-314;
        r8 = 2131755398; // 0x7f100186 float:1.9141674E38 double:1.0532271075E-314;
        r7 = 2131755369; // 0x7f100169 float:1.9141615E38 double:1.053227093E-314;
        r6 = 8;
        r1 = 0;
        r2 = com.whatsapp.camera.CameraActivity.I;
        r0 = r10.a;
        r0 = com.whatsapp.camera.CameraActivity.v(r0);
        if (r0 == 0) goto L_0x0195;
    L_0x0016:
        r0 = r10.a;
        r0 = r0.getWindow();
        r0 = r0.getAttributes();
        r0 = r0.flags;
        r0 = r0 & 256;
        if (r0 == 0) goto L_0x0054;
    L_0x0026:
        r0 = new android.graphics.Rect;
        r0.<init>();
        r3 = r10.a;
        r3 = com.whatsapp.camera.CameraActivity.v(r3);
        r3 = r3.getRootView();
        r3.getWindowVisibleDisplayFrame(r0);
        r3 = r10.a;
        r3 = com.whatsapp.camera.CameraActivity.v(r3);
        r3 = r3.getRootView();
        r3 = r3.getRootView();
        r3 = r3.getHeight();
        r4 = r0.bottom;
        r0 = r0.top;
        r0 = r4 - r0;
        r0 = r3 - r0;
        if (r2 == 0) goto L_0x0071;
    L_0x0054:
        r0 = r10.a;
        r0 = r0.getWindowManager();
        r0 = r0.getDefaultDisplay();
        r0 = r0.getHeight();
        r3 = r10.a;
        r3 = com.whatsapp.camera.CameraActivity.v(r3);
        r3 = r3.getRootView();
        r3 = r3.getHeight();
        r0 = r0 - r3;
    L_0x0071:
        r0 = (float) r0;
        r3 = 1124073472; // 0x43000000 float:128.0 double:5.55366086E-315;
        r4 = com.whatsapp.a4d.a();
        r4 = r4.g;
        r3 = r3 * r4;
        r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r0 <= 0) goto L_0x0196;
    L_0x007f:
        r0 = 1;
    L_0x0080:
        r3 = r10.b;
        if (r3 == r0) goto L_0x0178;
    L_0x0084:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = z;
        r3 = r3.append(r4);
        r3 = r3.append(r0);
        r3 = r3.toString();
        com.whatsapp.util.Log.i(r3);
        r10.b = r0;
        r3 = new android.view.animation.AlphaAnimation;
        r4 = 0;
        r5 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r3.<init>(r4, r5);
        r4 = r10.a;
        r4 = r4.getResources();
        r5 = 17694721; // 0x10e0001 float:2.6081284E-38 double:8.742354E-317;
        r4 = r4.getInteger(r5);
        r4 = (long) r4;
        r3.setDuration(r4);
        if (r0 == 0) goto L_0x010c;
    L_0x00b7:
        r4 = new android.view.animation.DecelerateInterpolator;
        r4.<init>();
        r3.setInterpolator(r4);
        r4 = r10.a;
        r5 = 2131755754; // 0x7f1002ea float:1.9142396E38 double:1.0532272834E-314;
        r4 = r4.findViewById(r5);
        r4.setVisibility(r1);
        r4 = r10.a;
        r4 = r4.findViewById(r9);
        r4.setVisibility(r6);
        r4 = r10.a;
        r4 = r4.findViewById(r7);
        r4.setVisibility(r6);
        r4 = r10.a;
        r5 = 2131755403; // 0x7f10018b float:1.9141684E38 double:1.05322711E-314;
        r4 = r4.findViewById(r5);
        r4.setVisibility(r6);
        r4 = r10.a;
        r4 = r4.findViewById(r8);
        r4.setVisibility(r6);
        r4 = r10.a;
        r5 = 2131755394; // 0x7f100182 float:1.9141666E38 double:1.0532271055E-314;
        r4 = r4.findViewById(r5);
        r4.startAnimation(r3);
        r4 = r10.a;
        r5 = 2131755402; // 0x7f10018a float:1.9141682E38 double:1.0532271095E-314;
        r4 = r4.findViewById(r5);
        r4.startAnimation(r3);
        if (r2 == 0) goto L_0x0178;
    L_0x010c:
        r2 = r10.a;
        r4 = 2131755394; // 0x7f100182 float:1.9141666E38 double:1.0532271055E-314;
        r2 = r2.findViewById(r4);
        r2.startAnimation(r3);
        r2 = r10.a;
        r4 = 2131755754; // 0x7f1002ea float:1.9142396E38 double:1.0532272834E-314;
        r2 = r2.findViewById(r4);
        r2.setVisibility(r6);
        r2 = r10.a;
        r2 = r2.findViewById(r9);
        r2.setVisibility(r1);
        r2 = r10.a;
        r2 = r2.findViewById(r7);
        r2.setVisibility(r1);
        r2 = r10.a;
        r2 = r2.findViewById(r9);
        r2.startAnimation(r3);
        r2 = r10.a;
        r2 = r2.findViewById(r7);
        r2.startAnimation(r3);
        r2 = r10.a;
        r4 = 2131755403; // 0x7f10018b float:1.9141684E38 double:1.05322711E-314;
        r2 = r2.findViewById(r4);
        r2.setVisibility(r1);
        r2 = r10.a;
        r2 = r2.findViewById(r8);
        r2.setVisibility(r1);
        r1 = r10.a;
        r1 = r1.findViewById(r8);
        r1.startAnimation(r3);
        r1 = r10.a;
        r1 = com.whatsapp.camera.CameraActivity.t(r1);
        r1.dismiss();
        r1 = r10.a;
        r1 = com.whatsapp.camera.CameraActivity.f(r1);
        r1.clearFocus();
    L_0x0178:
        if (r0 != 0) goto L_0x0195;
    L_0x017a:
        r0 = r10.a;
        r0 = com.whatsapp.camera.CameraActivity.i(r0);
        if (r0 == 0) goto L_0x0195;
    L_0x0182:
        r0 = r10.a;
        r0 = com.whatsapp.camera.CameraActivity.i(r0);
        r1 = r10.a;
        r1 = com.whatsapp.camera.CameraActivity.v(r1);
        r1 = r1.getHeight();
        r0.setHeightForInitialScaleCalculation(r1);
    L_0x0195:
        return;
    L_0x0196:
        r0 = r1;
        goto L_0x0080;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.x.onGlobalLayout():void");
    }

    x(CameraActivity cameraActivity) {
        this.a = cameraActivity;
    }
}
