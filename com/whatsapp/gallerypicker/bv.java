package com.whatsapp.gallerypicker;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import org.v;
import org.whispersystems.at;

class bv implements OnGlobalLayoutListener {
    private static final String z;
    final ImagePreview a;

    static {
        char[] toCharArray = "P09z!I/=k-\\*wv&]\u0002+u+N3x".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 57;
                    break;
                case at.g /*1*/:
                    i2 = 93;
                    break;
                case at.i /*2*/:
                    i2 = 88;
                    break;
                case at.o /*3*/:
                    i2 = 29;
                    break;
                default:
                    i2 = 68;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    bv(ImagePreview imagePreview) {
        this.a = imagePreview;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGlobalLayout() {
        /*
        r11 = this;
        r10 = 2131755716; // 0x7f1002c4 float:1.914232E38 double:1.0532272646E-314;
        r9 = 2131755504; // 0x7f1001f0 float:1.914189E38 double:1.05322716E-314;
        r3 = 8;
        r2 = 0;
        r6 = com.whatsapp.gallerypicker.MediaGalleryFragmentBase.e;
        r0 = r11.a;
        r0 = com.whatsapp.gallerypicker.ImagePreview.n(r0);
        if (r0 == 0) goto L_0x0128;
    L_0x0013:
        r0 = new android.graphics.Rect;
        r0.<init>();
        r1 = r11.a;
        r1 = com.whatsapp.gallerypicker.ImagePreview.n(r1);
        r1.getWindowVisibleDisplayFrame(r0);
        r1 = com.whatsapp.a4d.a();
        r4 = r11.a;
        r4 = com.whatsapp.gallerypicker.ImagePreview.n(r4);
        r4 = r4.getRootView();
        r4 = r4.getHeight();
        r5 = r0.bottom;
        r0 = r0.top;
        r0 = r5 - r0;
        r0 = r4 - r0;
        r0 = (float) r0;
        r4 = 1124073472; // 0x43000000 float:128.0 double:5.55366086E-315;
        r1 = r1.g;
        r1 = r1 * r4;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 <= 0) goto L_0x0129;
    L_0x0045:
        r0 = 1;
        r1 = r0;
    L_0x0047:
        r0 = r11.a;
        r0 = com.whatsapp.gallerypicker.ImagePreview.r(r0);
        if (r1 == r0) goto L_0x0117;
    L_0x004f:
        r0 = r11.a;
        com.whatsapp.gallerypicker.ImagePreview.a(r0, r1);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r4 = z;
        r0 = r0.append(r4);
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r11.a;
        r0 = com.whatsapp.gallerypicker.ImagePreview.e(r0);
        r7 = r0.getChildCount();
        r5 = r2;
    L_0x0075:
        if (r5 >= r7) goto L_0x00aa;
    L_0x0077:
        r0 = r11.a;
        r0 = com.whatsapp.gallerypicker.ImagePreview.e(r0);
        r4 = r0.getChildAt(r5);
        r0 = 2131755754; // 0x7f1002ea float:1.9142396E38 double:1.0532272834E-314;
        r8 = r4.findViewById(r0);
        if (r8 == 0) goto L_0x0090;
    L_0x008a:
        if (r1 == 0) goto L_0x012c;
    L_0x008c:
        r0 = r2;
    L_0x008d:
        r8.setVisibility(r0);
    L_0x0090:
        r0 = 2131755394; // 0x7f100182 float:1.9141666E38 double:1.0532271055E-314;
        r0 = r4.findViewById(r0);
        r0 = (com.whatsapp.PhotoView) r0;
        if (r0 == 0) goto L_0x00a6;
    L_0x009b:
        if (r1 == 0) goto L_0x012f;
    L_0x009d:
        r4 = r11.a;
        r4 = com.whatsapp.gallerypicker.ImagePreview.m(r4);
    L_0x00a3:
        r0.setHeightForInitialScaleCalculation(r4);
    L_0x00a6:
        r0 = r5 + 1;
        if (r6 == 0) goto L_0x0132;
    L_0x00aa:
        r0 = new android.view.animation.AlphaAnimation;
        r4 = 0;
        r5 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0.<init>(r4, r5);
        r4 = new android.view.animation.DecelerateInterpolator;
        r4.<init>();
        r0.setInterpolator(r4);
        r4 = r11.a;
        r4 = r4.getResources();
        r5 = 17694721; // 0x10e0001 float:2.6081284E-38 double:8.742354E-317;
        r4 = r4.getInteger(r5);
        r4 = (long) r4;
        r0.setDuration(r4);
        if (r1 == 0) goto L_0x00e1;
    L_0x00cd:
        r4 = r11.a;
        r4 = r4.findViewById(r10);
        r4.setVisibility(r3);
        r4 = r11.a;
        r4 = r4.findViewById(r9);
        r4.setVisibility(r3);
        if (r6 == 0) goto L_0x010e;
    L_0x00e1:
        r3 = r11.a;
        r3 = r3.findViewById(r10);
        r3.setVisibility(r2);
        r3 = r11.a;
        r3 = r3.findViewById(r9);
        r3.setVisibility(r2);
        r2 = r11.a;
        r2 = com.whatsapp.gallerypicker.ImagePreview.u(r2);
        r2.dismiss();
        r2 = r11.a;
        r2 = r2.findViewById(r10);
        r2.startAnimation(r0);
        r2 = r11.a;
        r2 = r2.findViewById(r9);
        r2.startAnimation(r0);
    L_0x010e:
        r2 = r11.a;
        r2 = com.whatsapp.gallerypicker.ImagePreview.e(r2);
        r2.startAnimation(r0);
    L_0x0117:
        if (r1 != 0) goto L_0x0128;
    L_0x0119:
        r0 = r11.a;
        r1 = r11.a;
        r1 = com.whatsapp.gallerypicker.ImagePreview.e(r1);
        r1 = r1.getHeight();
        com.whatsapp.gallerypicker.ImagePreview.b(r0, r1);
    L_0x0128:
        return;
    L_0x0129:
        r1 = r2;
        goto L_0x0047;
    L_0x012c:
        r0 = r3;
        goto L_0x008d;
    L_0x012f:
        r4 = r2;
        goto L_0x00a3;
    L_0x0132:
        r5 = r0;
        goto L_0x0075;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.bv.onGlobalLayout():void");
    }
}
