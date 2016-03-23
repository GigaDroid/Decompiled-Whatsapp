package com.whatsapp.qrcode;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;

public class QrEducationView extends View {
    private final float a;
    private Drawable b;
    private final float c;
    private final float d;
    private Drawable e;
    private Paint f;
    private Drawable g;
    private Drawable h;
    private long i;
    private int j;
    private final float k;
    private Drawable l;
    private final float m;
    private r n;
    private float o;
    private final float p;
    private final float q;
    private final float r;
    private Drawable s;

    protected void onVisibilityChanged(View view, int i) {
        if (getVisibility() == 0) {
            if (getAnimation() == null && this.n != null) {
                startAnimation(this.n);
                if (!QrCodeView.g) {
                    return;
                }
            }
            return;
        }
        clearAnimation();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r22) {
        /*
        r21 = this;
        r7 = com.whatsapp.qrcode.QrCodeView.g;
        r8 = r21.getWidth();
        r9 = r21.getHeight();
        r2 = java.lang.Math.min(r8, r9);
        r3 = r8 - r2;
        r3 = r3 / 2;
        r4 = r9 - r2;
        r4 = r4 / 2;
        r5 = r3 + r2;
        r2 = r2 + r4;
        r0 = r22;
        r0.clipRect(r3, r4, r5, r2);
        r2 = r8 / 2;
        r2 = (float) r2;
        r3 = r9 / 2;
        r3 = (float) r3;
        r0 = r22;
        r0.translate(r2, r3);
        r0 = r21;
        r2 = r0.e;
        r2 = r2.getIntrinsicHeight();
        r0 = r21;
        r3 = r0.e;
        r3 = r3.getIntrinsicWidth();
        r3 = r3 / 3;
        r2 = r2 + r3;
        if (r2 <= r9) goto L_0x0059;
    L_0x003e:
        r2 = (float) r9;
        r0 = r21;
        r3 = r0.e;
        r3 = r3.getIntrinsicHeight();
        r0 = r21;
        r4 = r0.e;
        r4 = r4.getIntrinsicWidth();
        r4 = r4 / 3;
        r3 = r3 + r4;
        r3 = (float) r3;
        r2 = r2 / r3;
        r0 = r22;
        r0.scale(r2, r2);
    L_0x0059:
        r0 = r21;
        r2 = r0.o;
        r3 = 1041194025; // 0x3e0f5c29 float:0.14 double:5.144181984E-315;
        r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1));
        if (r3 >= 0) goto L_0x006b;
    L_0x0064:
        r2 = r2 * r2;
        r3 = 1041194025; // 0x3e0f5c29 float:0.14 double:5.144181984E-315;
        r2 = r2 / r3;
        if (r7 == 0) goto L_0x03f7;
    L_0x006b:
        r3 = 1045220557; // 0x3e4ccccd float:0.2 double:5.164075695E-315;
        r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1));
        if (r3 < 0) goto L_0x03f7;
    L_0x0072:
        r3 = 1050253722; // 0x3e99999a float:0.3 double:5.188942835E-315;
        r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1));
        if (r3 >= 0) goto L_0x03f7;
    L_0x0079:
        r3 = 1045220557; // 0x3e4ccccd float:0.2 double:5.164075695E-315;
        r4 = 1045220557; // 0x3e4ccccd float:0.2 double:5.164075695E-315;
        r2 = r2 - r4;
        r4 = (double) r2;
        r4 = java.lang.Math.sqrt(r4);
        r10 = 4591870180711202816; // 0x3fb99999c0000000 float:-2.0 double:0.10000000894069672;
        r10 = java.lang.Math.sqrt(r10);
        r4 = r4 * r10;
        r2 = (float) r4;
        r2 = r2 + r3;
        r6 = r2;
    L_0x0092:
        r3 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r4 = 1041194025; // 0x3e0f5c29 float:0.14 double:5.144181984E-315;
        r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r4 >= 0) goto L_0x00ab;
    L_0x009d:
        r2 = 1132396544; // 0x437f0000 float:255.0 double:5.5947823E-315;
        r2 = r2 * r6;
        r3 = 1041194025; // 0x3e0f5c29 float:0.14 double:5.144181984E-315;
        r2 = r2 / r3;
        r3 = (int) r2;
        r2 = 1063004406; // 0x3f5c28f6 float:0.86 double:5.251939584E-315;
        r2 = r2 + r6;
        if (r7 == 0) goto L_0x03f0;
    L_0x00ab:
        r4 = 1045220557; // 0x3e4ccccd float:0.2 double:5.164075695E-315;
        r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r4 < 0) goto L_0x03f0;
    L_0x00b2:
        r3 = 1045220557; // 0x3e4ccccd float:0.2 double:5.164075695E-315;
        r4 = 1050253722; // 0x3e99999a float:0.3 double:5.188942835E-315;
        r5 = 1132396544; // 0x437f0000 float:255.0 double:5.5947823E-315;
        r10 = 1125515264; // 0x43160000 float:150.0 double:5.56078426E-315;
        r3 = a(r3, r4, r6, r5, r10);
        r3 = (int) r3;
        r20 = r2;
        r2 = r3;
        r3 = r20;
    L_0x00c6:
        r4 = 1063675494; // 0x3f666666 float:0.9 double:5.2552552E-315;
        r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r4 <= 0) goto L_0x00d9;
    L_0x00cd:
        r4 = 1063675494; // 0x3f666666 float:0.9 double:5.2552552E-315;
        r5 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r2 = (float) r2;
        r10 = 0;
        r2 = a(r4, r5, r6, r2, r10);
        r2 = (int) r2;
    L_0x00d9:
        r4 = 1045220557; // 0x3e4ccccd float:0.2 double:5.164075695E-315;
        r5 = 1050253722; // 0x3e99999a float:0.3 double:5.188942835E-315;
        r10 = 0;
        r0 = r21;
        r11 = r0.b;
        r11 = r11.getIntrinsicWidth();
        r11 = r11 / 8;
        r11 = (float) r11;
        r4 = a(r4, r5, r6, r10, r11);
        r0 = r21;
        r5 = r0.b;
        r5.setAlpha(r2);
        r0 = r21;
        r2 = r0.b;
        r2 = r2.getIntrinsicWidth();
        r2 = (float) r2;
        r2 = r2 * r3;
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = r2 / r5;
        r0 = r21;
        r5 = r0.b;
        r5 = r5.getIntrinsicHeight();
        r5 = (float) r5;
        r3 = r3 * r5;
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r3 = r3 / r5;
        r0 = r21;
        r5 = r0.b;
        r10 = r2 + r4;
        r10 = (int) r10;
        r10 = -r10;
        r11 = (int) r3;
        r11 = -r11;
        r2 = r2 - r4;
        r2 = (int) r2;
        r3 = (int) r3;
        r5.setBounds(r10, r11, r2, r3);
        r0 = r21;
        r2 = r0.b;
        r0 = r22;
        r2.draw(r0);
        r2 = 1045220557; // 0x3e4ccccd float:0.2 double:5.164075695E-315;
        r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1));
        if (r2 < 0) goto L_0x03d5;
    L_0x0130:
        r0 = r21;
        r2 = r0.e;
        r2 = r2.getIntrinsicWidth();
        r2 = r2 / 2;
        r10 = (float) r2;
        r0 = r21;
        r2 = r0.e;
        r2 = r2.getIntrinsicHeight();
        r2 = r2 / 2;
        r3 = (float) r2;
        r2 = -r10;
        r4 = 1045220557; // 0x3e4ccccd float:0.2 double:5.164075695E-315;
        r5 = 1050253722; // 0x3e99999a float:0.3 double:5.188942835E-315;
        r11 = r8 / 2;
        r11 = (float) r11;
        r12 = -r10;
        r13 = 1082130432; // 0x40800000 float:4.0 double:5.34643471E-315;
        r12 = r12 / r13;
        r4 = a(r4, r5, r6, r11, r12);
        r11 = r2 - r4;
        r2 = 0;
        r4 = 1051931443; // 0x3eb33333 float:0.35 double:5.19723188E-315;
        r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r4 <= 0) goto L_0x0182;
    L_0x0162:
        r4 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r4 >= 0) goto L_0x0182;
    L_0x0168:
        r4 = 1051931443; // 0x3eb33333 float:0.35 double:5.19723188E-315;
        r5 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r12 = 0;
        r13 = 1078530011; // 0x40490fdb float:3.1415927 double:5.328646264E-315;
        r4 = a(r4, r5, r6, r12, r13);
        r12 = (double) r2;
        r4 = (double) r4;
        r4 = java.lang.Math.sin(r4);
        r14 = (double) r10;
        r4 = r4 * r14;
        r14 = 4613937818241073152; // 0x4008000000000000 float:0.0 double:3.0;
        r4 = r4 / r14;
        r4 = r4 + r12;
        r2 = (float) r4;
    L_0x0182:
        r0 = r21;
        r4 = r0.e;
        r5 = (int) r10;
        r5 = -r5;
        r12 = (int) r11;
        r5 = r5 - r12;
        r12 = (int) r3;
        r12 = -r12;
        r13 = (int) r2;
        r12 = r12 + r13;
        r13 = (int) r10;
        r14 = (int) r11;
        r13 = r13 - r14;
        r3 = (int) r3;
        r14 = (int) r2;
        r3 = r3 + r14;
        r4.setBounds(r5, r12, r13, r3);
        r3 = 1063675494; // 0x3f666666 float:0.9 double:5.2552552E-315;
        r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r5 = 1132396544; // 0x437f0000 float:255.0 double:5.5947823E-315;
        r12 = 0;
        r3 = a(r3, r4, r6, r5, r12);
        r5 = (int) r3;
        r0 = r21;
        r3 = r0.e;
        r3.setAlpha(r5);
        r0 = r21;
        r3 = r0.e;
        r0 = r22;
        r3.draw(r0);
        r0 = r21;
        r3 = r0.e;
        r3 = r3.getBounds();
        r3 = r3.left;
        r0 = r21;
        r4 = r0.e;
        r4 = r4.getBounds();
        r4 = r4.right;
        r12 = r4 - r3;
        r12 = r12 / 7;
        r3 = r3 + r12;
        r0 = r21;
        r13 = r0.e;
        r13 = r13.getBounds();
        r13 = r13.top;
        r4 = r4 - r12;
        r0 = r21;
        r12 = r0.e;
        r12 = r12.getBounds();
        r12 = r12.bottom;
        r0 = r22;
        r0.clipRect(r3, r13, r4, r12);
        r3 = 1045220557; // 0x3e4ccccd float:0.2 double:5.164075695E-315;
        r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1));
        if (r3 <= 0) goto L_0x0321;
    L_0x01ee:
        r0 = r21;
        r3 = r0.g;
        r3 = r3.getIntrinsicWidth();
        r3 = r3 / 2;
        r4 = (float) r3;
        r0 = r21;
        r3 = r0.g;
        r3 = r3.getIntrinsicHeight();
        r3 = r3 / 2;
        r12 = (float) r3;
        r3 = -r10;
        r13 = 1082130432; // 0x40800000 float:4.0 double:5.34643471E-315;
        r13 = r10 / r13;
        r3 = r3 + r13;
        r13 = 1045220557; // 0x3e4ccccd float:0.2 double:5.164075695E-315;
        r14 = 1050253722; // 0x3e99999a float:0.3 double:5.188942835E-315;
        r0 = r21;
        r15 = r0.o;
        r16 = 1090519040; // 0x41000000 float:8.0 double:5.38787994E-315;
        r16 = r10 / r16;
        r17 = 0;
        r13 = a(r13, r14, r15, r16, r17);
        r13 = r3 - r13;
        r3 = -r10;
        r14 = 1077936128; // 0x40400000 float:3.0 double:5.325712093E-315;
        r3 = r3 / r14;
        r14 = 1051931443; // 0x3eb33333 float:0.35 double:5.19723188E-315;
        r14 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1));
        if (r14 <= 0) goto L_0x024f;
    L_0x022b:
        r14 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r14 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1));
        if (r14 >= 0) goto L_0x024f;
    L_0x0231:
        r3 = 1051931443; // 0x3eb33333 float:0.35 double:5.19723188E-315;
        r14 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r15 = 1070141403; // 0x3fc90fdb float:1.5707964 double:5.287201034E-315;
        r16 = 1078530011; // 0x40490fdb float:3.1415927 double:5.328646264E-315;
        r0 = r16;
        r3 = a(r3, r14, r6, r15, r0);
        r3 = -r3;
        r14 = (double) r3;
        r14 = java.lang.Math.sin(r14);
        r3 = (float) r14;
        r3 = r3 * r10;
        r14 = 1077936128; // 0x40400000 float:3.0 double:5.325712093E-315;
        r3 = r3 / r14;
        if (r7 == 0) goto L_0x0256;
    L_0x024f:
        r14 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r14 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1));
        if (r14 < 0) goto L_0x0256;
    L_0x0255:
        r3 = 0;
    L_0x0256:
        r0 = r21;
        r14 = r0.g;
        r15 = (int) r4;
        r15 = -r15;
        r0 = (int) r13;
        r16 = r0;
        r15 = r15 - r16;
        r0 = (int) r12;
        r16 = r0;
        r0 = r16;
        r0 = -r0;
        r16 = r0;
        r0 = (int) r3;
        r17 = r0;
        r16 = r16 + r17;
        r0 = (int) r4;
        r17 = r0;
        r0 = (int) r13;
        r18 = r0;
        r17 = r17 - r18;
        r0 = (int) r12;
        r18 = r0;
        r0 = (int) r3;
        r19 = r0;
        r18 = r18 + r19;
        r14.setBounds(r15, r16, r17, r18);
        r0 = r21;
        r14 = r0.h;
        r15 = (int) r4;
        r15 = -r15;
        r0 = (int) r13;
        r16 = r0;
        r15 = r15 - r16;
        r0 = (int) r12;
        r16 = r0;
        r0 = r16;
        r0 = -r0;
        r16 = r0;
        r0 = (int) r3;
        r17 = r0;
        r16 = r16 + r17;
        r4 = (int) r4;
        r13 = (int) r13;
        r4 = r4 - r13;
        r12 = (int) r12;
        r3 = (int) r3;
        r3 = r3 + r12;
        r0 = r16;
        r14.setBounds(r15, r0, r4, r3);
        r3 = 1063675494; // 0x3f666666 float:0.9 double:5.2552552E-315;
        r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1));
        if (r3 <= 0) goto L_0x02b4;
    L_0x02ab:
        r3 = 0;
        r4 = 150; // 0x96 float:2.1E-43 double:7.4E-322;
        r4 = java.lang.Math.min(r4, r5);
        if (r7 == 0) goto L_0x0301;
    L_0x02b4:
        r3 = 1057803469; // 0x3f0ccccd float:0.55 double:5.22624354E-315;
        r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1));
        if (r3 <= 0) goto L_0x02cd;
    L_0x02bb:
        r3 = 0;
        r4 = 1057803469; // 0x3f0ccccd float:0.55 double:5.22624354E-315;
        r12 = 1058642330; // 0x3f19999a float:0.6 double:5.230388065E-315;
        r13 = 1132396544; // 0x437f0000 float:255.0 double:5.5947823E-315;
        r14 = 1125515264; // 0x43160000 float:150.0 double:5.56078426E-315;
        r4 = a(r4, r12, r6, r13, r14);
        r4 = (int) r4;
        if (r7 == 0) goto L_0x0301;
    L_0x02cd:
        r3 = 1045220557; // 0x3e4ccccd float:0.2 double:5.164075695E-315;
        r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1));
        if (r3 <= 0) goto L_0x02ff;
    L_0x02d4:
        r12 = 1051931443; // 0x3eb33333 float:0.35 double:5.19723188E-315;
        r3 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1));
        if (r3 >= 0) goto L_0x02e9;
    L_0x02db:
        r4 = 0;
        r3 = 1045220557; // 0x3e4ccccd float:0.2 double:5.164075695E-315;
        r13 = 0;
        r14 = 1132396544; // 0x437f0000 float:255.0 double:5.5947823E-315;
        r3 = a(r3, r12, r6, r13, r14);
        r3 = (int) r3;
        if (r7 == 0) goto L_0x02fd;
    L_0x02e9:
        r3 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r4 = 0;
        r13 = 1132396544; // 0x437f0000 float:255.0 double:5.5947823E-315;
        r3 = a(r12, r3, r6, r4, r13);
        r4 = (int) r3;
        r3 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r13 = 1132396544; // 0x437f0000 float:255.0 double:5.5947823E-315;
        r14 = 0;
        r3 = a(r12, r3, r6, r13, r14);
        r3 = (int) r3;
    L_0x02fd:
        if (r7 == 0) goto L_0x0301;
    L_0x02ff:
        r3 = 0;
        r4 = 0;
    L_0x0301:
        r0 = r21;
        r12 = r0.g;
        r12.setAlpha(r4);
        r0 = r21;
        r4 = r0.h;
        r4.setAlpha(r3);
        r0 = r21;
        r3 = r0.g;
        r0 = r22;
        r3.draw(r0);
        r0 = r21;
        r3 = r0.h;
        r0 = r22;
        r3.draw(r0);
    L_0x0321:
        r0 = r21;
        r3 = r0.s;
        r3 = r3.getIntrinsicWidth();
        r3 = r3 / 2;
        r3 = (float) r3;
        r0 = r21;
        r4 = r0.s;
        r4 = r4.getIntrinsicHeight();
        r4 = r4 / 2;
        r4 = (float) r4;
        r0 = r21;
        r12 = r0.s;
        r13 = (int) r3;
        r13 = -r13;
        r14 = (int) r11;
        r13 = r13 - r14;
        r14 = (int) r4;
        r14 = -r14;
        r15 = (int) r2;
        r14 = r14 + r15;
        r3 = (int) r3;
        r11 = (int) r11;
        r3 = r3 - r11;
        r4 = (int) r4;
        r2 = (int) r2;
        r2 = r2 + r4;
        r12.setBounds(r13, r14, r3, r2);
        r0 = r21;
        r2 = r0.s;
        r2.setAlpha(r5);
        r0 = r21;
        r2 = r0.s;
        r0 = r22;
        r2.draw(r0);
        r2 = 1057803469; // 0x3f0ccccd float:0.55 double:5.22624354E-315;
        r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1));
        if (r2 <= 0) goto L_0x03d5;
    L_0x0363:
        r0 = r21;
        r2 = r0.l;
        r2 = r2.getIntrinsicWidth();
        r2 = r2 / 2;
        r4 = (float) r2;
        r0 = r21;
        r2 = r0.l;
        r2 = r2.getIntrinsicHeight();
        r2 = r2 / 2;
        r11 = (float) r2;
        r2 = -r10;
        r3 = 1082130432; // 0x40800000 float:4.0 double:5.34643471E-315;
        r3 = r10 / r3;
        r10 = r2 + r3;
        r12 = 0;
        r2 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r13 = 1063675494; // 0x3f666666 float:0.9 double:5.2552552E-315;
        r13 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1));
        if (r13 <= 0) goto L_0x038f;
    L_0x038c:
        if (r7 == 0) goto L_0x03ee;
    L_0x038e:
        r2 = r5;
    L_0x038f:
        r3 = 1057803469; // 0x3f0ccccd float:0.55 double:5.22624354E-315;
        r5 = 1058642330; // 0x3f19999a float:0.6 double:5.230388065E-315;
        r13 = 0;
        r14 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r3 = a(r3, r5, r6, r13, r14);
        r5 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r6 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r6 = r6 - r3;
        r13 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r3 = r13 - r3;
        r3 = r3 * r6;
        r3 = r5 - r3;
        r5 = r2;
        r2 = r3;
    L_0x03aa:
        r0 = r21;
        r3 = r0.l;
        r3.setAlpha(r5);
        r0 = r21;
        r3 = r0.l;
        r5 = r4 * r2;
        r5 = (int) r5;
        r5 = -r5;
        r6 = (int) r10;
        r5 = r5 - r6;
        r6 = r11 * r2;
        r6 = (int) r6;
        r6 = -r6;
        r13 = (int) r12;
        r6 = r6 + r13;
        r4 = r4 * r2;
        r4 = (int) r4;
        r10 = (int) r10;
        r4 = r4 - r10;
        r2 = r2 * r11;
        r2 = (int) r2;
        r10 = (int) r12;
        r2 = r2 + r10;
        r3.setBounds(r5, r6, r4, r2);
        r0 = r21;
        r2 = r0.l;
        r0 = r22;
        r2.draw(r0);
    L_0x03d5:
        r2 = -r8;
        r2 = r2 / 2;
        r2 = (float) r2;
        r3 = -r9;
        r3 = r3 / 2;
        r3 = (float) r3;
        r0 = r22;
        r0.translate(r2, r3);
        r2 = com.whatsapp.WAAppCompatActivity.c;
        if (r2 == 0) goto L_0x03eb;
    L_0x03e6:
        if (r7 == 0) goto L_0x03ec;
    L_0x03e8:
        r2 = 0;
    L_0x03e9:
        com.whatsapp.qrcode.QrCodeView.g = r2;
    L_0x03eb:
        return;
    L_0x03ec:
        r2 = 1;
        goto L_0x03e9;
    L_0x03ee:
        r2 = r3;
        goto L_0x03aa;
    L_0x03f0:
        r20 = r2;
        r2 = r3;
        r3 = r20;
        goto L_0x00c6;
    L_0x03f7:
        r6 = r2;
        goto L_0x0092;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.qrcode.QrEducationView.onDraw(android.graphics.Canvas):void");
    }

    public QrEducationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.k = 0.14f;
        this.c = 0.2f;
        this.m = 0.3f;
        this.q = 0.35f;
        this.p = 0.5f;
        this.d = 0.55f;
        this.r = 0.6f;
        this.a = 0.9f;
        this.f = new Paint();
        a(context);
    }

    private void a(Context context) {
        Resources resources = context.getResources();
        this.g = resources.getDrawable(2130837590);
        this.h = resources.getDrawable(2130837589);
        this.b = resources.getDrawable(2130837587);
        this.e = resources.getDrawable(2130837588);
        this.s = resources.getDrawable(2130837586);
        this.l = resources.getDrawable(2130837585);
    }

    public QrEducationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = 0.14f;
        this.c = 0.2f;
        this.m = 0.3f;
        this.q = 0.35f;
        this.p = 0.5f;
        this.d = 0.55f;
        this.r = 0.6f;
        this.a = 0.9f;
        this.f = new Paint();
        a(context);
    }

    private static float a(float f, float f2, float f3) {
        if (f3 <= f) {
            return 0.0f;
        }
        if (f3 >= f2) {
            return 1.0f;
        }
        return (f3 - f) / (f2 - f);
    }

    protected void onMeasure(int i, int i2) {
        int min = Math.min(getDefaultSize(getSuggestedMinimumWidth(), i), getDefaultSize(getSuggestedMinimumHeight(), i2));
        setMeasuredDimension(min, min);
    }

    private static float a(float f, float f2, float f3, float f4, float f5) {
        return ((f5 - f4) * a(f, f2, f3)) + f4;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearAnimation();
    }

    static float a(QrEducationView qrEducationView, float f) {
        qrEducationView.o = f;
        return f;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n = new r(this, null);
        this.n.setDuration(8000);
        this.n.setRepeatCount(-1);
        this.n.setInterpolator(new LinearInterpolator());
        startAnimation(this.n);
        this.j = 0;
        this.i = 0;
    }

    public QrEducationView(Context context) {
        super(context);
        this.k = 0.14f;
        this.c = 0.2f;
        this.m = 0.3f;
        this.q = 0.35f;
        this.p = 0.5f;
        this.d = 0.55f;
        this.r = 0.6f;
        this.a = 0.9f;
        this.f = new Paint();
        a(context);
    }
}
