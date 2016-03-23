package com.whatsapp;

import android.app.PendingIntent;
import android.support.v4.app.NotificationCompat.Builder;
import org.v;
import org.whispersystems.at;

class a2n implements Runnable {
    private static final String[] z;
    final l5 a;
    final PendingIntent b;
    final Builder c;
    final VoiceService d;
    final PendingIntent e;

    static {
        String[] strArr = new String[3];
        String str = "\u0004;J#\u0013\u0014t\t?\u0019\u0001 \u000fm\u0012\u000f \u0003+\u0015\u00035\u001e$\u0013\u000exJ:\u0019@5\u0018(\\\u000e;\u001em\u0015\u000et\u000bm\u001d\u0003 \u0003;\u0019@7\u000b!\u0010@;\u0018m\b\b1J.\u001d\f8J$\u000f@5\t.\u0019\u0010 \u000f)";
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
                        i3 = 96;
                        break;
                    case at.g /*1*/:
                        i3 = 84;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_ratingBarStyle;
                        break;
                    case at.o /*3*/:
                        i3 = 77;
                        break;
                    default:
                        i3 = 124;
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
                    str = "\u00035\u0006!";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u00035\u0006!#\u000e;\u001e$\u001a\t7\u000b9\u0015\u000f:5*\u000e\u000f!\u001a";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    a2n(VoiceService voiceService, Builder builder, l5 l5Var, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        this.d = voiceService;
        this.c = builder;
        this.a = l5Var;
        this.b = pendingIntent;
        this.e = pendingIntent2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r12 = this;
        r11 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        r10 = 5;
        r3 = 2;
        r1 = 0;
        r2 = 1;
        r4 = com.whatsapp.DialogToastActivity.f;
        r0 = com.whatsapp.notification.AndroidWear.a();
        if (r0 == 0) goto L_0x00fa;
    L_0x000e:
        r0 = r12.c;
        r5 = z;
        r5 = r5[r3];
        r0 = r0.setCategory(r5);
        r0 = r0.setPriority(r3);
        r5 = 2130837704; // 0x7f0200c8 float:1.728037E38 double:1.0527737064E-314;
        r0 = r0.setSmallIcon(r5);
        r5 = com.whatsapp.App.z();
        r5 = r5.getResources();
        r6 = 2131624053; // 0x7f0e0075 float:1.8875275E38 double:1.0531622144E-314;
        r5 = r5.getColor(r6);
        r0 = r0.setColor(r5);
        r0 = r0.setAutoCancel(r2);
        r5 = r12.d;
        r5 = r5.getResources();
        r6 = 2131231362; // 0x7f080282 float:1.8078803E38 double:1.0529681993E-314;
        r5 = r5.getString(r6);
        r0 = r0.setContentTitle(r5);
        r5 = r12.a;
        r6 = com.whatsapp.App.z();
        r5 = r5.a(r6);
        r0 = r0.setContentText(r5);
        r5 = com.whatsapp.App.z();
        r6 = 2131231362; // 0x7f080282 float:1.8078803E38 double:1.0529681993E-314;
        r7 = new java.lang.Object[r2];
        r8 = r12.a;
        r9 = com.whatsapp.App.z();
        r8 = r8.a(r9);
        r7[r1] = r8;
        r5 = r5.getString(r6, r7);
        r0 = r0.setTicker(r5);
        r5 = z;
        r5 = r5[r2];
        r0 = r0.setGroup(r5);
        r0 = r0.setGroupSummary(r1);
        r0 = r0.setOnlyAlertOnce(r2);
        r5 = 2130839495; // 0x7f0207c7 float:1.7284002E38 double:1.0527745913E-314;
        r6 = com.whatsapp.App.z();
        r7 = 2131230815; // 0x7f08005f float:1.8077693E38 double:1.052967929E-314;
        r6 = r6.getText(r7);
        r7 = r12.b;
        r0 = r0.addAction(r5, r6, r7);
        r5 = 2130839496; // 0x7f0207c8 float:1.7284004E38 double:1.052774592E-314;
        r6 = com.whatsapp.App.z();
        r7 = 2131231816; // 0x7f080448 float:1.8079724E38 double:1.0529684236E-314;
        r6 = r6.getText(r7);
        r7 = r12.e;
        r0.addAction(r5, r6, r7);
        r0 = com.whatsapp.App.z();
        r0 = com.whatsapp.a3b.a(r0);
        r5 = r12.a;
        r5 = r5.p;
        r0 = r0.b(r5);
        r5 = r0.d();
        r0 = -1;
        r6 = r5.hashCode();
        switch(r6) {
            case 48: goto L_0x011f;
            case 49: goto L_0x00fb;
            case 50: goto L_0x0107;
            case 51: goto L_0x0113;
            default: goto L_0x00c9;
        };
    L_0x00c9:
        switch(r0) {
            case 0: goto L_0x012a;
            case 1: goto L_0x0131;
            case 2: goto L_0x013d;
            default: goto L_0x00cc;
        };
    L_0x00cc:
        r0 = r12.a;
        r0 = r0.a(r11, r11);
        if (r0 == 0) goto L_0x00e5;
    L_0x00d4:
        r3 = new android.support.v4.app.NotificationCompat$WearableExtender;
        r3.<init>();
        r2 = r3.setHintHideIcon(r2);
        r2.setBackground(r0);
        r0 = r12.c;
        r0.extend(r3);
    L_0x00e5:
        r0 = com.whatsapp.Voip.getCallInfo();
        if (r0 == 0) goto L_0x00f3;
    L_0x00eb:
        r0 = r0.getCallState();
        r2 = com.whatsapp.Voip.CallState.RECEIVED_CALL;
        if (r0 == r2) goto L_0x0148;
    L_0x00f3:
        r0 = z;
        r0 = r0[r1];
        com.whatsapp.util.Log.w(r0);
    L_0x00fa:
        return;
    L_0x00fb:
        r6 = "1";
        r6 = r5.equals(r6);
        if (r6 == 0) goto L_0x00c9;
    L_0x0104:
        if (r4 == 0) goto L_0x0162;
    L_0x0106:
        r0 = r1;
    L_0x0107:
        r6 = "2";
        r6 = r5.equals(r6);
        if (r6 == 0) goto L_0x00c9;
    L_0x0110:
        if (r4 == 0) goto L_0x015f;
    L_0x0112:
        r0 = r2;
    L_0x0113:
        r6 = "3";
        r6 = r5.equals(r6);
        if (r6 == 0) goto L_0x00c9;
    L_0x011c:
        if (r4 == 0) goto L_0x015c;
    L_0x011e:
        r0 = r3;
    L_0x011f:
        r6 = "0";
        r5 = r5.equals(r6);
        if (r5 == 0) goto L_0x00c9;
    L_0x0128:
        r0 = 3;
        goto L_0x00c9;
    L_0x012a:
        r0 = r12.c;
        r0.setDefaults(r3);
        if (r4 == 0) goto L_0x00cc;
    L_0x0131:
        r0 = r12.c;
        r3 = new long[r10];
        r3 = {0, 300, 200, 300, 200};
        r0.setVibrate(r3);
        if (r4 == 0) goto L_0x00cc;
    L_0x013d:
        r0 = r12.c;
        r3 = new long[r10];
        r3 = {0, 750, 250, 750, 250};
        r0.setVibrate(r3);
        goto L_0x00cc;
    L_0x0148:
        r0 = com.whatsapp.App.z();
        r0 = android.support.v4.app.NotificationManagerCompat.from(r0);
        r1 = 10;
        r2 = r12.c;
        r2 = r2.build();
        r0.notify(r1, r2);
        goto L_0x00fa;
    L_0x015c:
        r0 = r3;
        goto L_0x00c9;
    L_0x015f:
        r0 = r2;
        goto L_0x00c9;
    L_0x0162:
        r0 = r1;
        goto L_0x00c9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a2n.run():void");
    }
}
