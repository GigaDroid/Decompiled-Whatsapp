package com.whatsapp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.v4.app.NotificationCompat.Builder;
import java.util.HashMap;
import org.v;
import org.whispersystems.at;

public class MediaTranscodeService extends Service {
    private static final HashMap c;
    private static final String[] z;
    private boolean a;
    private int b;
    private String d;

    public static void a() {
        App.aK.b(new ata());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int onStartCommand(android.content.Intent r13, int r14, int r15) {
        /*
        r12 = this;
        r4 = com.whatsapp.DialogToastActivity.f;
        r0 = c;	 Catch:{ SecurityException -> 0x01bb }
        r0 = r0.isEmpty();	 Catch:{ SecurityException -> 0x01bb }
        if (r0 == 0) goto L_0x000f;
    L_0x000a:
        r12.stopSelf();	 Catch:{ SecurityException -> 0x01bb }
        if (r4 == 0) goto L_0x01b9;
    L_0x000f:
        r5 = r12.a;
        r0 = 1;
        r12.a = r0;
        r2 = -1;
        r6 = new java.util.HashSet;
        r6.<init>();
        r0 = c;
        r0 = r0.size();
        r1 = 1;
        if (r0 != r1) goto L_0x008d;
    L_0x0023:
        r0 = c;
        r0 = r0.values();
        r0 = r0.iterator();
        r0 = r0.next();
        r0 = (com.whatsapp.protocol.co) r0;
        r1 = com.whatsapp.App.as;
        r3 = r0.k;
        r3 = r3.c;
        r7 = r1.b(r3);
        r1 = r0.c;
        switch(r1) {
            case 2: goto L_0x01c2;
            case 3: goto L_0x01bd;
            default: goto L_0x0042;
        };
    L_0x0042:
        r1 = 2131231872; // 0x7f080480 float:1.8079837E38 double:1.0529684513E-314;
    L_0x0045:
        r3 = 1;
        r3 = new java.lang.Object[r3];
        r8 = 0;
        r9 = r7.a(r12);
        r9 = com.whatsapp.a28.b(r9);
        r3[r8] = r9;
        r3 = r12.getString(r1, r3);
        r1 = android.os.Build.VERSION.SDK_INT;
        r8 = 11;
        if (r1 < r8) goto L_0x007e;
    L_0x005d:
        r1 = r0.Q;
        r1 = (com.whatsapp.MediaData) r1;
        if (r1 == 0) goto L_0x007e;
    L_0x0063:
        r8 = r1.progress;
        r2 = (int) r8;
        r8 = r1.transcoder;	 Catch:{ SecurityException -> 0x01c9 }
        if (r8 == 0) goto L_0x007e;
    L_0x006a:
        r8 = r1.transcoder;	 Catch:{ SecurityException -> 0x01c9 }
        r8 = r8.a();	 Catch:{ SecurityException -> 0x01c9 }
        if (r8 == 0) goto L_0x007e;
    L_0x0072:
        r1 = r1.uploader;	 Catch:{ SecurityException -> 0x01cb }
        if (r1 != 0) goto L_0x0260;
    L_0x0076:
        r1 = r2 / 2;
        if (r4 == 0) goto L_0x025d;
    L_0x007a:
        r1 = r1 / 2;
        r2 = r1 + 50;
    L_0x007e:
        r1 = com.whatsapp.Conversation.a(r7);
        r0 = r0.c;
        r0 = java.lang.Byte.valueOf(r0);
        r6.add(r0);
        if (r4 == 0) goto L_0x0258;
    L_0x008d:
        r1 = new java.util.HashSet;
        r1.<init>();
        r0 = c;
        r0 = r0.values();
        r3 = r0.iterator();
    L_0x009c:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x00ba;
    L_0x00a2:
        r0 = r3.next();
        r0 = (com.whatsapp.protocol.co) r0;
        r7 = r0.k;
        r7 = r7.c;
        r1.add(r7);
        r0 = r0.c;
        r0 = java.lang.Byte.valueOf(r0);
        r6.add(r0);
        if (r4 == 0) goto L_0x009c;
    L_0x00ba:
        r0 = r1.size();
        r3 = 1;
        if (r0 != r3) goto L_0x01db;
    L_0x00c1:
        r3 = com.whatsapp.App.as;
        r0 = r1.iterator();
        r0 = r0.next();
        r0 = (java.lang.String) r0;
        r1 = r3.b(r0);
        r0 = r6.size();	 Catch:{ SecurityException -> 0x01cd }
        r3 = 1;
        if (r0 != r3) goto L_0x00ee;
    L_0x00d8:
        r0 = r6.iterator();	 Catch:{ SecurityException -> 0x01cd }
        r0 = r0.next();	 Catch:{ SecurityException -> 0x01cd }
        r0 = (java.lang.Byte) r0;	 Catch:{ SecurityException -> 0x01cd }
        r0 = r0.byteValue();	 Catch:{ SecurityException -> 0x01cd }
        switch(r0) {
            case 2: goto L_0x01d4;
            case 3: goto L_0x01cf;
            default: goto L_0x00e9;
        };
    L_0x00e9:
        r0 = 2131296313; // 0x7f090039 float:1.821054E38 double:1.0530002894E-314;
        if (r4 == 0) goto L_0x00f1;
    L_0x00ee:
        r0 = 2131296313; // 0x7f090039 float:1.821054E38 double:1.0530002894E-314;
    L_0x00f1:
        r3 = com.whatsapp.App.az;
        r7 = c;
        r7 = r7.size();
        r0 = r3.a(r0, r7);
        r3 = 2;
        r3 = new java.lang.Object[r3];
        r7 = 0;
        r8 = c;
        r8 = r8.size();
        r8 = java.lang.Integer.valueOf(r8);
        r3[r7] = r8;
        r7 = 1;
        r8 = r1.a(r12);
        r8 = com.whatsapp.a28.b(r8);
        r3[r7] = r8;
        r0 = java.lang.String.format(r0, r3);
        r1 = com.whatsapp.Conversation.a(r1);
        r3 = r1;
        r1 = r0;
    L_0x0122:
        r7 = new android.support.v4.app.NotificationCompat$Builder;
        r0 = com.whatsapp.App.z();
        r7.<init>(r0);
        r12.a(r7, r2, r1, r5);
        r0 = android.os.Build.VERSION.SDK_INT;
        r8 = 21;
        if (r0 < r8) goto L_0x0187;
    L_0x0134:
        r8 = new android.support.v4.app.NotificationCompat$Builder;
        r0 = com.whatsapp.App.z();
        r8.<init>(r0);
        r0 = r6.size();	 Catch:{ SecurityException -> 0x0231 }
        r9 = 1;
        if (r0 != r9) goto L_0x015a;
    L_0x0144:
        r0 = r6.iterator();	 Catch:{ SecurityException -> 0x0231 }
        r0 = r0.next();	 Catch:{ SecurityException -> 0x0231 }
        r0 = (java.lang.Byte) r0;	 Catch:{ SecurityException -> 0x0231 }
        r0 = r0.byteValue();	 Catch:{ SecurityException -> 0x0231 }
        switch(r0) {
            case 2: goto L_0x0238;
            case 3: goto L_0x0233;
            default: goto L_0x0155;
        };
    L_0x0155:
        r0 = 2131296314; // 0x7f09003a float:1.8210541E38 double:1.05300029E-314;
        if (r4 == 0) goto L_0x015d;
    L_0x015a:
        r0 = 2131296314; // 0x7f09003a float:1.8210541E38 double:1.05300029E-314;
    L_0x015d:
        r6 = com.whatsapp.App.az;
        r9 = c;
        r9 = r9.size();
        r0 = r6.a(r0, r9);
        r6 = 1;
        r6 = new java.lang.Object[r6];
        r9 = 0;
        r10 = c;
        r10 = r10.size();
        r10 = java.lang.Integer.valueOf(r10);
        r6[r9] = r10;
        r0 = java.lang.String.format(r0, r6);
        r12.a(r8, r2, r0, r5);
        r0 = r8.build();
        r7.setPublicVersion(r0);
    L_0x0187:
        r0 = 1;
        r6 = 134217728; // 0x8000000 float:3.85186E-34 double:6.63123685E-316;
        r0 = android.app.PendingIntent.getActivity(r12, r0, r3, r6);
        r7.setContentIntent(r0);	 Catch:{ SecurityException -> 0x023f }
        if (r5 != 0) goto L_0x019d;
    L_0x0193:
        r0 = 4;
        r3 = r7.build();	 Catch:{ SecurityException -> 0x023f }
        r12.startForeground(r0, r3);	 Catch:{ SecurityException -> 0x023f }
        if (r4 == 0) goto L_0x01b5;
    L_0x019d:
        r0 = r12.b;	 Catch:{ SecurityException -> 0x0241 }
        if (r0 != r2) goto L_0x01a9;
    L_0x01a1:
        r0 = r12.d;	 Catch:{ SecurityException -> 0x0243 }
        r0 = android.text.TextUtils.equals(r1, r0);	 Catch:{ SecurityException -> 0x0243 }
        if (r0 != 0) goto L_0x01b5;
    L_0x01a9:
        r0 = android.support.v4.app.NotificationManagerCompat.from(r12);	 Catch:{ SecurityException -> 0x0245 }
        r3 = 4;
        r4 = r7.build();	 Catch:{ SecurityException -> 0x0245 }
        r0.notify(r3, r4);	 Catch:{ SecurityException -> 0x0245 }
    L_0x01b5:
        r12.b = r2;
        r12.d = r1;
    L_0x01b9:
        r0 = 2;
        return r0;
    L_0x01bb:
        r0 = move-exception;
        throw r0;
    L_0x01bd:
        r1 = 2131231873; // 0x7f080481 float:1.807984E38 double:1.052968452E-314;
        if (r4 == 0) goto L_0x0045;
    L_0x01c2:
        r1 = 2131231871; // 0x7f08047f float:1.8079835E38 double:1.052968451E-314;
        if (r4 == 0) goto L_0x0045;
    L_0x01c7:
        goto L_0x0042;
    L_0x01c9:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x01cb }
    L_0x01cb:
        r0 = move-exception;
        throw r0;
    L_0x01cd:
        r0 = move-exception;
        throw r0;
    L_0x01cf:
        r0 = 2131296315; // 0x7f09003b float:1.8210543E38 double:1.0530002903E-314;
        if (r4 == 0) goto L_0x00f1;
    L_0x01d4:
        r0 = 2131296311; // 0x7f090037 float:1.8210535E38 double:1.0530002884E-314;
        if (r4 == 0) goto L_0x00f1;
    L_0x01d9:
        goto L_0x00e9;
    L_0x01db:
        r0 = r6.size();	 Catch:{ SecurityException -> 0x0223 }
        r1 = 1;
        if (r0 != r1) goto L_0x022d;
    L_0x01e2:
        r0 = r6.iterator();	 Catch:{ SecurityException -> 0x0223 }
        r0 = r0.next();	 Catch:{ SecurityException -> 0x0223 }
        r0 = (java.lang.Byte) r0;	 Catch:{ SecurityException -> 0x0223 }
        r0 = r0.byteValue();	 Catch:{ SecurityException -> 0x0223 }
        switch(r0) {
            case 2: goto L_0x0229;
            case 3: goto L_0x0225;
            default: goto L_0x01f3;
        };
    L_0x01f3:
        r0 = 2131296314; // 0x7f09003a float:1.8210541E38 double:1.05300029E-314;
    L_0x01f6:
        r1 = new android.content.Intent;
        r3 = com.whatsapp.Main.e();
        r1.<init>(r12, r3);
        r3 = com.whatsapp.App.az;
        r7 = c;
        r7 = r7.size();
        r0 = r3.a(r0, r7);
        r3 = 1;
        r3 = new java.lang.Object[r3];
        r7 = 0;
        r8 = c;
        r8 = r8.size();
        r8 = java.lang.Integer.valueOf(r8);
        r3[r7] = r8;
        r0 = java.lang.String.format(r0, r3);
        r3 = r1;
        r1 = r0;
        goto L_0x0122;
    L_0x0223:
        r0 = move-exception;
        throw r0;
    L_0x0225:
        r0 = 2131296316; // 0x7f09003c float:1.8210545E38 double:1.053000291E-314;
        goto L_0x01f6;
    L_0x0229:
        r0 = 2131296312; // 0x7f090038 float:1.8210537E38 double:1.053000289E-314;
        goto L_0x01f6;
    L_0x022d:
        r0 = 2131296314; // 0x7f09003a float:1.8210541E38 double:1.05300029E-314;
        goto L_0x01f6;
    L_0x0231:
        r0 = move-exception;
        throw r0;
    L_0x0233:
        r0 = 2131296316; // 0x7f09003c float:1.8210545E38 double:1.053000291E-314;
        if (r4 == 0) goto L_0x015d;
    L_0x0238:
        r0 = 2131296312; // 0x7f090038 float:1.8210537E38 double:1.053000289E-314;
        if (r4 == 0) goto L_0x015d;
    L_0x023d:
        goto L_0x0155;
    L_0x023f:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0241 }
    L_0x0241:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0243 }
    L_0x0243:
        r0 = move-exception;
        throw r0;
    L_0x0245:
        r0 = move-exception;
        r3 = r0.toString();	 Catch:{ SecurityException -> 0x0256 }
        r4 = z;	 Catch:{ SecurityException -> 0x0256 }
        r5 = 1;
        r4 = r4[r5];	 Catch:{ SecurityException -> 0x0256 }
        r3 = r3.contains(r4);	 Catch:{ SecurityException -> 0x0256 }
        if (r3 != 0) goto L_0x01b5;
    L_0x0255:
        throw r0;	 Catch:{ SecurityException -> 0x0256 }
    L_0x0256:
        r0 = move-exception;
        throw r0;
    L_0x0258:
        r11 = r3;
        r3 = r1;
        r1 = r11;
        goto L_0x0122;
    L_0x025d:
        r2 = r1;
        goto L_0x007e;
    L_0x0260:
        r1 = r2;
        goto L_0x007a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.MediaTranscodeService.onStartCommand(android.content.Intent, int, int):int");
    }

    public MediaTranscodeService() {
        this.a = false;
        this.b = -1;
    }

    static HashMap b() {
        return c;
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    static {
        String[] strArr = new String[2];
        String str = "4\nxcj!\u000bd";
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
                        i3 = 68;
                        break;
                    case at.g /*1*/:
                        i3 = 120;
                        break;
                    case at.i /*2*/:
                        i3 = 23;
                        break;
                    case at.o /*3*/:
                        i3 = 4;
                        break;
                    default:
                        i3 = 24;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    c = new HashMap();
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "%\u0016svw-\u001c9t}6\u0015~wk-\u0017y*M\u0014<VP]\u001b9GTG\u000b(D[K\u00109CW";
                    obj = null;
            }
        }
    }

    private void a(Builder builder, int i, String str, boolean z) {
        boolean z2 = false;
        try {
            builder.setCategory(z[0]);
            builder.setSmallIcon(17301640);
            builder.setWhen(System.currentTimeMillis());
            builder.setContentTitle(getString(2131232306));
            if (i >= 0) {
                if (i == 0) {
                    z2 = true;
                }
                builder.setProgress(100, i, z2);
            }
            try {
                builder.setContentText(str);
                if (!z) {
                    builder.setTicker(str);
                }
            } catch (SecurityException e) {
                throw e;
            }
        } catch (SecurityException e2) {
            throw e2;
        } catch (SecurityException e22) {
            throw e22;
        }
    }

    public void onDestroy() {
        try {
            if (this.a) {
                this.a = false;
                stopForeground(true);
            }
        } catch (SecurityException e) {
            throw e;
        }
    }
}
