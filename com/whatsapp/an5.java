package com.whatsapp;

import android.os.CountDownTimer;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.at;

class an5 extends CountDownTimer {
    private static final String[] z;
    final RegisterPhone a;

    static {
        String[] strArr = new String[8];
        String str = ";c\t.";
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
                        i3 = 27;
                        break;
                    case at.g /*1*/:
                        i3 = 19;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_checkedTextViewStyle;
                        break;
                    case at.o /*3*/:
                        i3 = 19;
                        break;
                    default:
                        i3 = 48;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = ";`Z";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "GW";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "GW";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "iv\u0000zCov\u0015<@s|\tv\u001fhf\u0000tUhg\u0002w\u001fxpH";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = ";`\u0006~U&";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = ";w\u000e`@&";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = ";`\u0012tW~`\u0013.";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onTick(long j) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onFinish() {
        /*
        r14 = this;
        r13 = 31;
        r12 = 17;
        r11 = 0;
        r10 = 1;
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = r14.a;
        r1 = r1.o();
        r2 = r14.a;
        r2 = r2.m();
        if (r1 == 0) goto L_0x0021;
    L_0x0016:
        if (r2 == 0) goto L_0x0021;
    L_0x0018:
        r3 = "";
        r3 = r1.equals(r3);
        if (r3 == 0) goto L_0x0027;
    L_0x0021:
        r0 = r14.a;
        r0.k();
    L_0x0026:
        return;
    L_0x0027:
        r3 = com.whatsapp.VerifyNumber.j();
        r3 = com.whatsapp.RegisterPhone.a(r2, r1, r3);
        if (r3 == 0) goto L_0x01c6;
    L_0x0031:
        r4 = com.whatsapp.VerifyNumber.a(r1, r3);
        r5 = r4.length();
        r6 = r3.length();
        if (r5 >= r6) goto L_0x0045;
    L_0x003f:
        r0 = r14.a;
        r0.k();
        goto L_0x0026;
    L_0x0045:
        r5 = r14.a;
        r6 = 2131231761; // 0x7f080411 float:1.8079612E38 double:1.0529683964E-314;
        r7 = new java.lang.Object[r10];
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r9 = "\u202a";
        r8 = r8.append(r9);
        r4 = r8.append(r4);
        r8 = "\u202c";
        r4 = r4.append(r8);
        r4 = r4.toString();
        r7[r11] = r4;
        r4 = r5.getString(r6, r7);
        r5 = com.whatsapp.aak.a(r1, r2);
        r6 = r1.length();
        r6 = r3.substring(r6);
        r5 = com.whatsapp.RegisterPhone.b(r5, r6, r4);
        r6 = -2;
        if (r5 != r6) goto L_0x0086;
    L_0x0080:
        r0 = r14.a;
        r0.k();
        goto L_0x0026;
    L_0x0086:
        r6 = r14.a;
        r6 = com.whatsapp.RegisterPhone.c(r6);
        if (r6 == 0) goto L_0x0096;
    L_0x008e:
        r6 = r14.a;
        r6 = com.whatsapp.RegisterPhone.i(r6);
        if (r6 == r5) goto L_0x0026;
    L_0x0096:
        r6 = r14.a;
        com.whatsapp.RegisterPhone.a(r6, r5);
        r6 = r4.length();
        r6 = r6 + -2;
        if (r5 != r6) goto L_0x00a8;
    L_0x00a3:
        com.whatsapp.RegisterPhone.b(r10);
        if (r0 == 0) goto L_0x00ab;
    L_0x00a8:
        com.whatsapp.RegisterPhone.c(r10);
    L_0x00ab:
        r6 = r14.a;
        r6 = r6.K;
        r7 = r14.a;
        r7 = r7.G;
        r7 = r7.getBottom();
        r6.scrollTo(r11, r7);
        r6 = new android.text.SpannableString;
        r6.<init>(r4);
        r7 = new com.whatsapp.anc;
        r7.<init>(r14, r1, r3);
        r4 = r4.length();
        r6.setSpan(r7, r11, r4, r12);
        r4 = r14.a;
        r4 = r4.G;
        r7 = android.text.method.LinkMovementMethod.getInstance();
        r4.setMovementMethod(r7);
        r4 = -1;
        if (r5 == r4) goto L_0x00e5;
    L_0x00d9:
        r4 = new android.text.style.ForegroundColorSpan;
        r7 = -65536; // 0xffffffffffff0000 float:NaN double:NaN;
        r4.<init>(r7);
        r7 = r5 + 1;
        r6.setSpan(r4, r5, r7, r12);
    L_0x00e5:
        r4 = r6.toString();
        r5 = z;
        r7 = 4;
        r5 = r5[r7];
        r7 = "";
        r4 = r4.replaceAll(r5, r7);
        r5 = z;
        r7 = 3;
        r5 = r5[r7];
        r7 = "";
        r2 = r2.replaceAll(r5, r7);
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r7 = z;
        r8 = 5;
        r7 = r7[r8];
        r5 = r5.append(r7);
        r5 = r5.append(r1);
        r7 = z;
        r7 = r7[r11];
        r5 = r5.append(r7);
        r5 = r5.append(r2);
        r7 = z;
        r7 = r7[r10];
        r5 = r5.append(r7);
        r3 = r5.append(r3);
        r5 = z;
        r7 = 2;
        r5 = r5[r7];
        r3 = r3.append(r5);
        r5 = com.whatsapp.VerifyNumber.j();
        r3 = r3.append(r5);
        r5 = z;
        r7 = 7;
        r5 = r5[r7];
        r3 = r3.append(r5);
        r3 = r3.append(r4);
        r5 = z;
        r7 = 6;
        r5 = r5[r7];
        r3 = r3.append(r5);
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r5 = r5.append(r1);
        r1 = com.whatsapp.aak.a(r1, r2);
        r1 = r5.append(r1);
        r1 = r1.toString();
        r1 = r4.equals(r1);
        r1 = r3.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r1 = r14.a;
        com.whatsapp.RegisterPhone.a(r1, r10);
        r1 = r14.a;
        r1 = com.whatsapp.RegisterPhone.d(r1);
        if (r1 != r13) goto L_0x018c;
    L_0x0183:
        r1 = r14.a;
        r2 = 32;
        com.whatsapp.RegisterPhone.b(r1, r2);
        if (r0 == 0) goto L_0x019b;
    L_0x018c:
        r1 = r14.a;
        r1 = com.whatsapp.RegisterPhone.d(r1);
        r2 = 30;
        if (r1 != r2) goto L_0x019b;
    L_0x0196:
        r1 = r14.a;
        com.whatsapp.RegisterPhone.b(r1, r13);
    L_0x019b:
        r1 = r14.a;
        r1 = r1.G;
        r2 = android.widget.TextView.BufferType.SPANNABLE;
        r1.setText(r6, r2);
        r1 = new android.view.animation.AlphaAnimation;
        r2 = 0;
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r1.<init>(r2, r3);
        r2 = 150; // 0x96 float:2.1E-43 double:7.4E-322;
        r1.setDuration(r2);
        r2 = r14.a;
        r2 = r2.G;
        r2.startAnimation(r1);
        r1 = r14.a;
        r1 = r1.G;
        r1.setVisibility(r11);
        r1 = r14.a;
        com.whatsapp.RegisterPhone.d(r1, r10);
        if (r0 == 0) goto L_0x0026;
    L_0x01c6:
        r0 = r14.a;
        r0.k();
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.an5.onFinish():void");
    }

    an5(RegisterPhone registerPhone, long j, long j2) {
        this.a = registerPhone;
        super(j, j2);
    }
}
