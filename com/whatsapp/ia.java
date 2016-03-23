package com.whatsapp;

import android.graphics.drawable.Drawable;
import org.v;
import org.whispersystems.at;

class ia implements Runnable {
    private static final String[] z;
    Drawable a;
    long b;
    final ConversationRowVideo c;
    long d;
    MediaData e;

    static {
        String[] strArr = new String[2];
        String str = "y\u0004`My\u007f\u001fa^\u007fj\u001a+Os{\u001bmLs`\u0019l]{m";
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
                        i3 = 15;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_switchStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 4;
                        break;
                    case at.o /*3*/:
                        i3 = 40;
                        break;
                    default:
                        i3 = 22;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "y\u0004`My\u007f\u001fa^\u007fj\u001a+Os{\u001bmLs`\u0019l]{m";
                    obj = null;
            }
        }
    }

    void a() {
        ConversationRowVideo.a().post(new avk(this));
        this.c.post(new awa(this));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.annotation.TargetApi(10)
    public void run() {
        /*
        r12 = this;
        r8 = 2000; // 0x7d0 float:2.803E-42 double:9.88E-321;
        r0 = 1;
        r1 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        r2 = r12.e;	 Catch:{ Exception -> 0x0038 }
        if (r2 == 0) goto L_0x0034;
    L_0x000a:
        r2 = r12.e;	 Catch:{ Exception -> 0x0038 }
        r4 = r12.c;	 Catch:{ Exception -> 0x0038 }
        r4 = r4.e;	 Catch:{ Exception -> 0x0038 }
        r4 = r4.Q;	 Catch:{ Exception -> 0x0038 }
        if (r2 != r4) goto L_0x0034;
    L_0x0014:
        r2 = r12.c;	 Catch:{ Exception -> 0x003a }
        r2 = r2.isShown();	 Catch:{ Exception -> 0x003a }
        if (r2 == 0) goto L_0x0034;
    L_0x001c:
        r2 = r12.c;	 Catch:{ Exception -> 0x003c }
        r2 = com.whatsapp.ConversationRowVideo.a(r2);	 Catch:{ Exception -> 0x003c }
        if (r2 != r12) goto L_0x0034;
    L_0x0024:
        r2 = r12.e;	 Catch:{ Exception -> 0x003e }
        r2 = r2.file;	 Catch:{ Exception -> 0x003e }
        if (r2 == 0) goto L_0x0034;
    L_0x002a:
        r2 = r12.e;	 Catch:{ Exception -> 0x0040 }
        r2 = r2.file;	 Catch:{ Exception -> 0x0040 }
        r2 = r2.exists();	 Catch:{ Exception -> 0x0040 }
        if (r2 != 0) goto L_0x0044;
    L_0x0034:
        r12.a();	 Catch:{ Exception -> 0x0042 }
    L_0x0037:
        return;
    L_0x0038:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x003a }
    L_0x003a:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x003c }
    L_0x003c:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x003e }
    L_0x003e:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0040 }
    L_0x0040:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0042 }
    L_0x0042:
        r0 = move-exception;
        throw r0;
    L_0x0044:
        r2 = r12.c;
        r4 = r2.getDrawingTime();
        r6 = r12.d;	 Catch:{ Exception -> 0x0054 }
        r2 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r2 != 0) goto L_0x0056;
    L_0x0050:
        r12.a();	 Catch:{ Exception -> 0x0054 }
        goto L_0x0037;
    L_0x0054:
        r0 = move-exception;
        throw r0;
    L_0x0056:
        r12.d = r4;
        r4 = new android.media.MediaMetadataRetriever;
        r4.<init>();
        r2 = r12.e;	 Catch:{ Exception -> 0x00ce, NoSuchMethodError -> 0x00f2 }
        r2 = r2.file;	 Catch:{ Exception -> 0x00ce, NoSuchMethodError -> 0x00f2 }
        r2 = r2.getAbsolutePath();	 Catch:{ Exception -> 0x00ce, NoSuchMethodError -> 0x00f2 }
        r4.setDataSource(r2);	 Catch:{ Exception -> 0x00ce, NoSuchMethodError -> 0x00f2 }
        r6 = r12.b;	 Catch:{ Exception -> 0x00ce, NoSuchMethodError -> 0x00f2 }
        r2 = r4.getFrameAtTime(r6);	 Catch:{ Exception -> 0x00ce, NoSuchMethodError -> 0x00f2 }
        r5 = 9;
        r5 = r4.extractMetadata(r5);	 Catch:{ Exception -> 0x00ce, NoSuchMethodError -> 0x00f2 }
        r6 = java.lang.Long.parseLong(r5);	 Catch:{ Exception -> 0x00ce, NoSuchMethodError -> 0x00f2 }
        r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r5 <= 0) goto L_0x010f;
    L_0x007c:
        r8 = r12.b;	 Catch:{ Exception -> 0x00c8, NoSuchMethodError -> 0x00f2 }
        r10 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r6 = r6 * r10;
        r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1));
        if (r5 <= 0) goto L_0x008b;
    L_0x0085:
        r6 = 0;
        r12.b = r6;	 Catch:{ Exception -> 0x00ca, NoSuchMethodError -> 0x00f2 }
        if (r3 == 0) goto L_0x0093;
    L_0x008b:
        r6 = r12.b;	 Catch:{ Exception -> 0x00cc, NoSuchMethodError -> 0x00f2 }
        r8 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r6 = r6 + r8;
        r12.b = r6;	 Catch:{ Exception -> 0x00cc, NoSuchMethodError -> 0x00f2 }
    L_0x0093:
        if (r2 == 0) goto L_0x010f;
    L_0x0095:
        r5 = r12.e;	 Catch:{ Exception -> 0x00ee, NoSuchMethodError -> 0x00f2 }
        r6 = r12.c;	 Catch:{ Exception -> 0x00ee, NoSuchMethodError -> 0x00f2 }
        r6 = r6.e;	 Catch:{ Exception -> 0x00ee, NoSuchMethodError -> 0x00f2 }
        r6 = r6.Q;	 Catch:{ Exception -> 0x00ee, NoSuchMethodError -> 0x00f2 }
        if (r5 != r6) goto L_0x010f;
    L_0x009f:
        r5 = r12.c;	 Catch:{ Exception -> 0x00f0, NoSuchMethodError -> 0x00f2 }
        r5 = r5.isShown();	 Catch:{ Exception -> 0x00f0, NoSuchMethodError -> 0x00f2 }
        if (r5 == 0) goto L_0x010f;
    L_0x00a7:
        r5 = r12.c;	 Catch:{ Exception -> 0x0115, NoSuchMethodError -> 0x0111 }
        r6 = new com.whatsapp.ez;	 Catch:{ Exception -> 0x0115, NoSuchMethodError -> 0x0111 }
        r6.<init>(r12, r2);	 Catch:{ Exception -> 0x0115, NoSuchMethodError -> 0x0111 }
        r5.post(r6);	 Catch:{ Exception -> 0x0115, NoSuchMethodError -> 0x0111 }
    L_0x00b1:
        r4.release();
        if (r0 == 0) goto L_0x00c1;
    L_0x00b6:
        r0 = com.whatsapp.ConversationRowVideo.a();	 Catch:{ Exception -> 0x00c6 }
        r4 = 2000; // 0x7d0 float:2.803E-42 double:9.88E-321;
        r0.postDelayed(r12, r4);	 Catch:{ Exception -> 0x00c6 }
        if (r3 == 0) goto L_0x0037;
    L_0x00c1:
        r12.a();	 Catch:{ Exception -> 0x00c6 }
        goto L_0x0037;
    L_0x00c6:
        r0 = move-exception;
        throw r0;
    L_0x00c8:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x00ca, NoSuchMethodError -> 0x00f2 }
    L_0x00ca:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x00cc, NoSuchMethodError -> 0x00f2 }
    L_0x00cc:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x00ce, NoSuchMethodError -> 0x00f2 }
    L_0x00ce:
        r0 = move-exception;
        r2 = r0;
        r0 = r1;
    L_0x00d1:
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = z;
        r1 = r6[r1];
        r1 = r5.append(r1);
        r2 = r2.toString();
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.e(r1);
        goto L_0x00b1;
    L_0x00ee:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x00f0, NoSuchMethodError -> 0x00f2 }
    L_0x00f0:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x00ce, NoSuchMethodError -> 0x00f2 }
    L_0x00f2:
        r2 = move-exception;
    L_0x00f3:
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = z;
        r0 = r6[r0];
        r0 = r5.append(r0);
        r2 = r2.toString();
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
    L_0x010f:
        r0 = r1;
        goto L_0x00b1;
    L_0x0111:
        r1 = move-exception;
        r2 = r1;
        r1 = r0;
        goto L_0x00f3;
    L_0x0115:
        r2 = move-exception;
        goto L_0x00d1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ia.run():void");
    }

    ia(ConversationRowVideo conversationRowVideo, MediaData mediaData) {
        this.c = conversationRowVideo;
        this.b = 1000000;
        this.e = mediaData;
    }
}
