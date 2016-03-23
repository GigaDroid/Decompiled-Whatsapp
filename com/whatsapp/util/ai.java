package com.whatsapp.util;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public final class ai {
    private static final String[] z;

    static {
        String[] strArr = new String[11];
        String str = "2\u0005bJ&\"KwGj4\u000emLj\"\u0005`Z37\u001ffLj*\u000egA+g\u0006f[9&\ff\b.2\u000e#\\%g\u0006j[9.\u0005d\b'\"\u000fjI\u0001\"\u00128\b'\"\u0018pI-\"EhM3z";
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
                        i3 = 71;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_seekBarStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 3;
                        break;
                    case at.o /*3*/:
                        i3 = 40;
                        break;
                    default:
                        i3 = 74;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "|KnM..\n\\_+\u0018\u001fzX/z";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "|KnM..\n\\_+\u0018\u001fzX/z";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "2\u0005qM)(\fmA0\"\u000f#E/#\u0002b\b>>\u001bf\b.2\u0019jF-g\u0018fF.|KnM94\ndMd,\u000ez\u0015";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "2\u0005bJ&\"KwGj4\u000emLj\"\u0005`Z37\u001ffLj*\u000egA+g\u0006f[9&\ff\b.2\u000e#\\%g\u0006j[9.\u0005d\b'\"\u000fjI\u0001\"\u00128\b'\"\u0018pI-\"EhM3z";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = ".\u0006bO/h\u0001sM-";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "|KnM..\n\\_+\u0018\u001fzX/z";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "|KnM..\n\\_+\u0018\u001fzX/z";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "2\u0005bJ&\"KwGj4\u000emLj\"\u0005`Z37\u001ffLj*\u000egA+g\u0006f[9&\ff\b.2\u000e#\\%g\u0006j[9.\u0005d\b'\"\u000fjI\u0001\"\u00128\b'\"\u0018pI-\"EhM3z";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "|KnM..\n\\_+\u0018\u001fzX/z";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "2\u0005bJ&\"KwGj4\u000emLj\"\u0005`Z37\u001ffLj*\u000egA+g\u0006f[9&\ff\b.2\u000e#\\%g\u0006j[9.\u0005d\b'\"\u000fjI\u0001\"\u00128\b'\"\u0018pI-\"EhM3z";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(com.whatsapp.protocol.co r11, com.whatsapp.proto.E2E.Message.Builder r12, boolean r13) {
        /*
        r10 = 4;
        r9 = 3;
        r8 = 2;
        r1 = 1;
        r2 = 0;
        r3 = com.whatsapp.util.Log.h;
        r0 = r11.c;
        if (r0 != 0) goto L_0x007c;
    L_0x000b:
        if (r13 != 0) goto L_0x001d;
    L_0x000d:
        r0 = r11.a;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x0026;
    L_0x0015:
        r0 = r11.A;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x0026;
    L_0x001d:
        r0 = r11.c();
        r12.setConversation(r0);
        if (r3 == 0) goto L_0x033d;
    L_0x0026:
        r4 = r12.getUrlMessageBuilder();
        r0 = r11.c();
        r4.setText(r0);
        r0 = r11.c();
        r0 = com.whatsapp.util.ac.c(r0);
        r5 = android.text.TextUtils.isEmpty(r0);
        if (r5 != 0) goto L_0x0042;
    L_0x003f:
        r4.setMatchedText(r0);
    L_0x0042:
        r0 = r11.a;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 != 0) goto L_0x004f;
    L_0x004a:
        r0 = r11.a;
        r4.setTitle(r0);
    L_0x004f:
        r0 = r11.A;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 != 0) goto L_0x005c;
    L_0x0057:
        r0 = r11.A;
        r4.setDescription(r0);
    L_0x005c:
        r0 = r11.q;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 != 0) goto L_0x0069;
    L_0x0064:
        r0 = r11.q;
        r4.setCanonicalUrl(r0);
    L_0x0069:
        r0 = r11.Q;
        if (r0 == 0) goto L_0x007a;
    L_0x006d:
        r0 = r11.Q;
        r0 = (byte[]) r0;
        r0 = (byte[]) r0;
        r0 = com.google.hx.a(r0);
        r4.setJpegThumbnail(r0);
    L_0x007a:
        if (r3 == 0) goto L_0x033d;
    L_0x007c:
        r0 = r11.c;
        if (r0 != r1) goto L_0x0103;
    L_0x0080:
        r0 = r11.Q;
        r0 = (com.whatsapp.MediaData) r0;
        r4 = r0.mediaKey;
        if (r4 == 0) goto L_0x00d7;
    L_0x0088:
        r4 = r12.getImageMessageBuilder();
        r5 = r11.q;
        r4.setUrl(r5);
        r5 = z;
        r6 = 6;
        r5 = r5[r6];
        r4.setMimetype(r5);
        r5 = r11.a;
        if (r5 == 0) goto L_0x00a2;
    L_0x009d:
        r5 = r11.a;
        r4.setCaption(r5);
    L_0x00a2:
        r5 = r11.o;
        r5 = android.backport.util.Base64.decode(r5, r2);
        r5 = com.google.hx.a(r5);
        r4.setFileSha256(r5);
        r6 = r11.z;
        r4.setFileLength(r6);
        r0 = r0.mediaKey;
        r0 = com.google.hx.a(r0);
        r4.setMediaKey(r0);
        r0 = r11.e();
        if (r0 == 0) goto L_0x00d5;
    L_0x00c3:
        r0 = r11.e();
        r0 = r0.length;
        if (r0 <= 0) goto L_0x00d5;
    L_0x00ca:
        r0 = r11.e();
        r0 = com.google.hx.a(r0);
        r4.setJpegThumbnail(r0);
    L_0x00d5:
        if (r3 == 0) goto L_0x0101;
    L_0x00d7:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r4 = z;
        r4 = r4[r1];
        r0 = r0.append(r4);
        r4 = r11.k;
        r0 = r0.append(r4);
        r4 = z;
        r5 = 8;
        r4 = r4[r5];
        r0 = r0.append(r4);
        r4 = r11.c;
        r0 = r0.append(r4);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
    L_0x0101:
        if (r3 == 0) goto L_0x033d;
    L_0x0103:
        r0 = r11.c;
        r4 = 9;
        if (r0 != r4) goto L_0x0199;
    L_0x0109:
        r0 = r11.Q;
        r0 = (com.whatsapp.MediaData) r0;
        r4 = r0.mediaKey;
        if (r4 == 0) goto L_0x016b;
    L_0x0111:
        r4 = r12.getDocumentMessageBuilder();
        r5 = r11.q;
        r4.setUrl(r5);
        r5 = r11.n;
        r4.setMimetype(r5);
        r5 = r11.a;
        if (r5 == 0) goto L_0x0128;
    L_0x0123:
        r5 = r11.a;
        r4.setTitle(r5);
    L_0x0128:
        r5 = r11.A;
        if (r5 == 0) goto L_0x0131;
    L_0x012c:
        r5 = r11.A;
        r4.setFileName(r5);
    L_0x0131:
        r5 = r11.R;
        r4.setPageCount(r5);
        r5 = r11.o;
        r5 = android.backport.util.Base64.decode(r5, r2);
        r5 = com.google.hx.a(r5);
        r4.setFileSha256(r5);
        r6 = r11.z;
        r4.setFileLength(r6);
        r0 = r0.mediaKey;
        r0 = com.google.hx.a(r0);
        r4.setMediaKey(r0);
        r0 = r11.e();
        if (r0 == 0) goto L_0x0169;
    L_0x0157:
        r0 = r11.e();
        r0 = r0.length;
        if (r0 <= 0) goto L_0x0169;
    L_0x015e:
        r0 = r11.e();
        r0 = com.google.hx.a(r0);
        r4.setJpegThumbnail(r0);
    L_0x0169:
        if (r3 == 0) goto L_0x0197;
    L_0x016b:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r4 = z;
        r5 = 9;
        r4 = r4[r5];
        r0 = r0.append(r4);
        r4 = r11.k;
        r0 = r0.append(r4);
        r4 = z;
        r5 = 10;
        r4 = r4[r5];
        r0 = r0.append(r4);
        r4 = r11.c;
        r0 = r0.append(r4);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
    L_0x0197:
        if (r3 == 0) goto L_0x033d;
    L_0x0199:
        r0 = r11.c;
        r4 = 5;
        if (r0 != r4) goto L_0x0201;
    L_0x019e:
        r0 = r12.getLocationMessageBuilder();
        r4 = r11.m;
        r0.setDegreesLatitude(r4);
        r4 = r11.l;
        r0.setDegreesLongitude(r4);
        r4 = r11.q;
        r4 = android.text.TextUtils.isEmpty(r4);
        if (r4 != 0) goto L_0x01b9;
    L_0x01b4:
        r4 = r11.q;
        r0.setUrl(r4);
    L_0x01b9:
        r4 = r11.A;
        r4 = android.text.TextUtils.isEmpty(r4);
        if (r4 != 0) goto L_0x01ef;
    L_0x01c1:
        r4 = r11.A;
        r5 = 10;
        r4 = r4.indexOf(r5);
        r5 = -1;
        if (r4 != r5) goto L_0x01d3;
    L_0x01cc:
        r5 = r11.A;
        r0.setName(r5);
        if (r3 == 0) goto L_0x01ef;
    L_0x01d3:
        r5 = r11.A;
        r5 = r5.substring(r2, r4);
        r0.setName(r5);
        r5 = r11.A;
        r5 = r5.length();
        if (r5 <= r4) goto L_0x01ef;
    L_0x01e4:
        r5 = r11.A;
        r4 = r4 + 1;
        r4 = r5.substring(r4);
        r0.setAddress(r4);
    L_0x01ef:
        r4 = r11.e();
        if (r4 == 0) goto L_0x01ff;
    L_0x01f5:
        r5 = r4.length;
        if (r5 <= 0) goto L_0x01ff;
    L_0x01f8:
        r4 = com.google.hx.a(r4);
        r0.setJpegThumbnail(r4);
    L_0x01ff:
        if (r3 == 0) goto L_0x033d;
    L_0x0201:
        r0 = r11.c;
        if (r0 != r10) goto L_0x021f;
    L_0x0205:
        r0 = r12.getContactMessageBuilder();
        r4 = r11.A;
        r4 = android.text.TextUtils.isEmpty(r4);
        if (r4 != 0) goto L_0x0216;
    L_0x0211:
        r4 = r11.A;
        r0.setDisplayName(r4);
    L_0x0216:
        r4 = r11.c();
        r0.setVcard(r4);
        if (r3 == 0) goto L_0x033d;
    L_0x021f:
        r0 = r11.c;
        if (r0 != r8) goto L_0x028d;
    L_0x0223:
        r0 = r11.Q;
        r0 = (com.whatsapp.MediaData) r0;
        r4 = r0.mediaKey;
        if (r4 == 0) goto L_0x0262;
    L_0x022b:
        r4 = r12.getAudioMessageBuilder();
        r5 = r11.q;
        r4.setUrl(r5);
        r5 = r11.n;
        r4.setMimetype(r5);
        r5 = r11.o;
        r5 = android.backport.util.Base64.decode(r5, r2);
        r5 = com.google.hx.a(r5);
        r4.setFileSha256(r5);
        r6 = r11.z;
        r4.setFileLength(r6);
        r5 = r11.H;
        r4.setSeconds(r5);
        r5 = r11.r;
        if (r5 != r1) goto L_0x033e;
    L_0x0254:
        r4.setPtt(r1);
        r0 = r0.mediaKey;
        r0 = com.google.hx.a(r0);
        r4.setMediaKey(r0);
        if (r3 == 0) goto L_0x028b;
    L_0x0262:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r11.k;
        r0 = r0.append(r1);
        r1 = z;
        r4 = 7;
        r1 = r1[r4];
        r0 = r0.append(r1);
        r1 = r11.c;
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
    L_0x028b:
        if (r3 == 0) goto L_0x033d;
    L_0x028d:
        r0 = r11.c;
        if (r0 != r9) goto L_0x0315;
    L_0x0291:
        r0 = r11.Q;
        r0 = (com.whatsapp.MediaData) r0;
        r1 = r0.mediaKey;
        if (r1 == 0) goto L_0x02ea;
    L_0x0299:
        r1 = r12.getVideoMessageBuilder();
        r4 = r11.q;
        r1.setUrl(r4);
        r4 = r11.n;
        r1.setMimetype(r4);
        r4 = r11.o;
        r2 = android.backport.util.Base64.decode(r4, r2);
        r2 = com.google.hx.a(r2);
        r1.setFileSha256(r2);
        r4 = r11.z;
        r1.setFileLength(r4);
        r2 = r11.H;
        r1.setSeconds(r2);
        r2 = r11.a;
        if (r2 == 0) goto L_0x02c7;
    L_0x02c2:
        r2 = r11.a;
        r1.setCaption(r2);
    L_0x02c7:
        r0 = r0.mediaKey;
        r0 = com.google.hx.a(r0);
        r1.setMediaKey(r0);
        r0 = r11.e();
        if (r0 == 0) goto L_0x02e8;
    L_0x02d6:
        r0 = r11.e();
        r0 = r0.length;
        if (r0 <= 0) goto L_0x02e8;
    L_0x02dd:
        r0 = r11.e();
        r0 = com.google.hx.a(r0);
        r1.setJpegThumbnail(r0);
    L_0x02e8:
        if (r3 == 0) goto L_0x0313;
    L_0x02ea:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 5;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r11.k;
        r0 = r0.append(r1);
        r1 = z;
        r1 = r1[r8];
        r0 = r0.append(r1);
        r1 = r11.c;
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
    L_0x0313:
        if (r3 == 0) goto L_0x033d;
    L_0x0315:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r1 = r1[r10];
        r0 = r0.append(r1);
        r1 = r11.k;
        r0 = r0.append(r1);
        r1 = z;
        r1 = r1[r9];
        r0 = r0.append(r1);
        r1 = r11.c;
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
    L_0x033d:
        return;
    L_0x033e:
        r1 = r2;
        goto L_0x0254;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.ai.a(com.whatsapp.protocol.co, com.whatsapp.proto.E2E$Message$Builder, boolean):void");
    }
}
