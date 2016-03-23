package com.whatsapp.gdrive;

import com.whatsapp.arj;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class v extends t {
    private static final String[] z;
    final bc a;
    final bs b;
    final StringBuffer c;
    final String d;

    static {
        String[] strArr = new String[11];
        String str = "\u00184^\u0000a\u001a}M\u0019~P!Y\fe\u0006}J\u0000{\u001a#\u0003\u0007r\u0007$\u0001\u0019v\u00185\u0001\u001dx\u00145BFy\u0010>I";
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
                    case org.v.m /*0*/:
                        i3 = 127;
                        break;
                    case at.g /*1*/:
                        i3 = 80;
                        break;
                    case at.i /*2*/:
                        i3 = 44;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_radioButtonStyle;
                        break;
                    default:
                        i3 = 23;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case org.v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u00184^\u0000a\u001a}M\u0019~P!Y\fe\u0006}J\u0000{\u001a#\f\u001ac\u001e$Y\u001a7\u00106\f\u001d\u007f\u001ap^\fd\u000f?B\u001ar_9_I";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0016$I\u0004d";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u00184^\u0000a\u001a}M\u0019~P!Y\fe\u0006}J\u0000{\u001a#\u0003\u001cy\u001a(\\\ft\u000b5HDr\r\"C\u001b:\u001c?H\f8";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u00184^\u0000a\u001a}M\u0019~P!Y\fe\u0006}J\u0000{\u001a#\u0003\u0000y\u000b5^\u001bb\u000f$I\r";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u00115T\u001dG\u001e7I=x\u00145B";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u00184^\u0000a\u001a}M\u0019~P!Y\fe\u0006}J\u0000{\u001a#\u0003\u0000y\u000b5^\u001bb\u000f$I\r";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u00184^\u0000a\u001a}M\u0019~P!Y\fe\u0006}J\u0000{\u001a#";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u00184^\u0000a\u001a}M\u0019~P!Y\fe\u0006}J\u0000{\u001a#\u0003\u0007b\u0012}J\u0000{\u001a#\u0003";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u00184^\u0000a\u001a}M\u0019~P!Y\fe\u0006}J\u0000{\u001a#\u0003\u0007r\u0007$\u0001\u0019v\u00185\u0001\u001dx\u00145BF";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u00184^\u0000a\u001a}M\u0019~P!Y\fe\u0006}J\u0000{\u001a#";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    v(bc bcVar, String str, bs bsVar, StringBuffer stringBuffer) {
        this.a = bcVar;
        this.d = str;
        this.b = bsVar;
        this.c = stringBuffer;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List m770a() {
        /*
        r14 = this;
        r8 = 1;
        r7 = 0;
        r0 = 0;
        r9 = com.whatsapp.gdrive.GoogleDriveService.c;
        r1 = new java.util.ArrayList;
        r1.<init>();
        r2 = r14.a;	 Catch:{ ClosedByInterruptException -> 0x01fe, IllegalStateException -> 0x01f5, IOException -> 0x01ec, all -> 0x01e1 }
        r3 = r14.d;	 Catch:{ ClosedByInterruptException -> 0x01fe, IllegalStateException -> 0x01f5, IOException -> 0x01ec, all -> 0x01e1 }
        r3 = com.whatsapp.gdrive.bc.a(r2, r3);	 Catch:{ ClosedByInterruptException -> 0x01fe, IllegalStateException -> 0x01f5, IOException -> 0x01ec, all -> 0x01e1 }
        r3.connect();	 Catch:{ ClosedByInterruptException -> 0x01d8, IllegalStateException -> 0x01fa, IOException -> 0x01f1, all -> 0x01e7 }
        r2 = r3.getResponseCode();	 Catch:{ ClosedByInterruptException -> 0x01d8, IllegalStateException -> 0x01fa, IOException -> 0x01f1, all -> 0x01e7 }
        r4 = new java.lang.StringBuilder;	 Catch:{ ClosedByInterruptException -> 0x01d8, IllegalStateException -> 0x01fa, IOException -> 0x01f1, all -> 0x01e7 }
        r4.<init>();	 Catch:{ ClosedByInterruptException -> 0x01d8, IllegalStateException -> 0x01fa, IOException -> 0x01f1, all -> 0x01e7 }
        r5 = z;	 Catch:{ ClosedByInterruptException -> 0x01d8, IllegalStateException -> 0x01fa, IOException -> 0x01f1, all -> 0x01e7 }
        r6 = 2;
        r5 = r5[r6];	 Catch:{ ClosedByInterruptException -> 0x01d8, IllegalStateException -> 0x01fa, IOException -> 0x01f1, all -> 0x01e7 }
        r4 = r4.append(r5);	 Catch:{ ClosedByInterruptException -> 0x01d8, IllegalStateException -> 0x01fa, IOException -> 0x01f1, all -> 0x01e7 }
        r4 = r4.append(r2);	 Catch:{ ClosedByInterruptException -> 0x01d8, IllegalStateException -> 0x01fa, IOException -> 0x01f1, all -> 0x01e7 }
        r5 = " ";
        r4 = r4.append(r5);	 Catch:{ ClosedByInterruptException -> 0x01d8, IllegalStateException -> 0x01fa, IOException -> 0x01f1, all -> 0x01e7 }
        r5 = r3.getResponseMessage();	 Catch:{ ClosedByInterruptException -> 0x01d8, IllegalStateException -> 0x01fa, IOException -> 0x01f1, all -> 0x01e7 }
        r4 = r4.append(r5);	 Catch:{ ClosedByInterruptException -> 0x01d8, IllegalStateException -> 0x01fa, IOException -> 0x01f1, all -> 0x01e7 }
        r4 = r4.toString();	 Catch:{ ClosedByInterruptException -> 0x01d8, IllegalStateException -> 0x01fa, IOException -> 0x01f1, all -> 0x01e7 }
        com.whatsapp.util.Log.i(r4);	 Catch:{ ClosedByInterruptException -> 0x01d8, IllegalStateException -> 0x01fa, IOException -> 0x01f1, all -> 0x01e7 }
        r4 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r2 != r4) goto L_0x0195;
    L_0x0045:
        r2 = new com.google.fh;	 Catch:{ ClosedByInterruptException -> 0x01d8, IllegalStateException -> 0x01fa, IOException -> 0x01f1, all -> 0x01e7 }
        r4 = new java.io.InputStreamReader;	 Catch:{ ClosedByInterruptException -> 0x01d8, IllegalStateException -> 0x01fa, IOException -> 0x01f1, all -> 0x01e7 }
        r5 = r3.getInputStream();	 Catch:{ ClosedByInterruptException -> 0x01d8, IllegalStateException -> 0x01fa, IOException -> 0x01f1, all -> 0x01e7 }
        r4.<init>(r5);	 Catch:{ ClosedByInterruptException -> 0x01d8, IllegalStateException -> 0x01fa, IOException -> 0x01f1, all -> 0x01e7 }
        r2.<init>(r4);	 Catch:{ ClosedByInterruptException -> 0x01d8, IllegalStateException -> 0x01fa, IOException -> 0x01f1, all -> 0x01e7 }
        r2.l();	 Catch:{ ClosedByInterruptException -> 0x00fe, IllegalStateException -> 0x011f, IOException -> 0x014f }
        r4 = r7;
        r5 = r0;
    L_0x0058:
        r6 = r2.d();	 Catch:{ ClosedByInterruptException -> 0x00fe, IllegalStateException -> 0x011f, IOException -> 0x014f }
        if (r6 == 0) goto L_0x007e;
    L_0x005e:
        r6 = r14.b;	 Catch:{ ClosedByInterruptException -> 0x00fe, IllegalStateException -> 0x011f, IOException -> 0x014f }
        r6 = r6.a();	 Catch:{ ClosedByInterruptException -> 0x00fe, IllegalStateException -> 0x011f, IOException -> 0x014f }
        if (r6 != 0) goto L_0x006d;
    L_0x0066:
        com.whatsapp.util.ao.a(r2);
        com.whatsapp.gdrive.bc.a(r3);
    L_0x006c:
        return r0;
    L_0x006d:
        r10 = r2.i();	 Catch:{ ClosedByInterruptException -> 0x00fe, IllegalStateException -> 0x011f, IOException -> 0x014f }
        r6 = -1;
        r11 = r10.hashCode();	 Catch:{ ClosedByInterruptException -> 0x00fc, IllegalStateException -> 0x011f, IOException -> 0x014f }
        switch(r11) {
            case -1386094857: goto L_0x00ee;
            case 100526016: goto L_0x00e0;
            default: goto L_0x0079;
        };
    L_0x0079:
        switch(r6) {
            case 0: goto L_0x0131;
            case 1: goto L_0x018b;
            default: goto L_0x007c;
        };
    L_0x007c:
        if (r9 == 0) goto L_0x0058;
    L_0x007e:
        r2.k();	 Catch:{ ClosedByInterruptException -> 0x0191, IllegalStateException -> 0x011f, IOException -> 0x014f }
        r2.close();	 Catch:{ ClosedByInterruptException -> 0x0191, IllegalStateException -> 0x011f, IOException -> 0x014f }
        r3.disconnect();	 Catch:{ ClosedByInterruptException -> 0x0191, IllegalStateException -> 0x011f, IOException -> 0x014f }
        r6 = new java.lang.StringBuilder;	 Catch:{ ClosedByInterruptException -> 0x0191, IllegalStateException -> 0x011f, IOException -> 0x014f }
        r6.<init>();	 Catch:{ ClosedByInterruptException -> 0x0191, IllegalStateException -> 0x011f, IOException -> 0x014f }
        r7 = z;	 Catch:{ ClosedByInterruptException -> 0x0191, IllegalStateException -> 0x011f, IOException -> 0x014f }
        r8 = 9;
        r7 = r7[r8];	 Catch:{ ClosedByInterruptException -> 0x0191, IllegalStateException -> 0x011f, IOException -> 0x014f }
        r6 = r6.append(r7);	 Catch:{ ClosedByInterruptException -> 0x0191, IllegalStateException -> 0x011f, IOException -> 0x014f }
        r4 = r6.append(r4);	 Catch:{ ClosedByInterruptException -> 0x0191, IllegalStateException -> 0x011f, IOException -> 0x014f }
        r4 = r4.toString();	 Catch:{ ClosedByInterruptException -> 0x0191, IllegalStateException -> 0x011f, IOException -> 0x014f }
        com.whatsapp.util.Log.i(r4);	 Catch:{ ClosedByInterruptException -> 0x0191, IllegalStateException -> 0x011f, IOException -> 0x014f }
        if (r5 != 0) goto L_0x00b3;
    L_0x00a3:
        r4 = z;	 Catch:{ ClosedByInterruptException -> 0x0191, IllegalStateException -> 0x011f, IOException -> 0x014f }
        r6 = 0;
        r4 = r4[r6];	 Catch:{ ClosedByInterruptException -> 0x0191, IllegalStateException -> 0x011f, IOException -> 0x014f }
        com.whatsapp.util.Log.i(r4);	 Catch:{ ClosedByInterruptException -> 0x0191, IllegalStateException -> 0x011f, IOException -> 0x014f }
        r4 = r14.c;	 Catch:{ ClosedByInterruptException -> 0x0191, IllegalStateException -> 0x011f, IOException -> 0x014f }
        r6 = 0;
        r4.setLength(r6);	 Catch:{ ClosedByInterruptException -> 0x0191, IllegalStateException -> 0x011f, IOException -> 0x014f }
        if (r9 == 0) goto L_0x00d8;
    L_0x00b3:
        r4 = new java.lang.StringBuilder;	 Catch:{ ClosedByInterruptException -> 0x0193, IllegalStateException -> 0x011f, IOException -> 0x014f }
        r4.<init>();	 Catch:{ ClosedByInterruptException -> 0x0193, IllegalStateException -> 0x011f, IOException -> 0x014f }
        r6 = z;	 Catch:{ ClosedByInterruptException -> 0x0193, IllegalStateException -> 0x011f, IOException -> 0x014f }
        r7 = 10;
        r6 = r6[r7];	 Catch:{ ClosedByInterruptException -> 0x0193, IllegalStateException -> 0x011f, IOException -> 0x014f }
        r4 = r4.append(r6);	 Catch:{ ClosedByInterruptException -> 0x0193, IllegalStateException -> 0x011f, IOException -> 0x014f }
        r4 = r4.append(r5);	 Catch:{ ClosedByInterruptException -> 0x0193, IllegalStateException -> 0x011f, IOException -> 0x014f }
        r4 = r4.toString();	 Catch:{ ClosedByInterruptException -> 0x0193, IllegalStateException -> 0x011f, IOException -> 0x014f }
        com.whatsapp.util.Log.i(r4);	 Catch:{ ClosedByInterruptException -> 0x0193, IllegalStateException -> 0x011f, IOException -> 0x014f }
        r4 = r14.c;	 Catch:{ ClosedByInterruptException -> 0x0193, IllegalStateException -> 0x011f, IOException -> 0x014f }
        r6 = 0;
        r4.setLength(r6);	 Catch:{ ClosedByInterruptException -> 0x0193, IllegalStateException -> 0x011f, IOException -> 0x014f }
        r4 = r14.c;	 Catch:{ ClosedByInterruptException -> 0x0193, IllegalStateException -> 0x011f, IOException -> 0x014f }
        r4.append(r5);	 Catch:{ ClosedByInterruptException -> 0x0193, IllegalStateException -> 0x011f, IOException -> 0x014f }
    L_0x00d8:
        com.whatsapp.util.ao.a(r2);
        com.whatsapp.gdrive.bc.a(r3);
        r0 = r1;
        goto L_0x006c;
    L_0x00e0:
        r11 = z;	 Catch:{ ClosedByInterruptException -> 0x00fc, IllegalStateException -> 0x011f, IOException -> 0x014f }
        r12 = 3;
        r11 = r11[r12];	 Catch:{ ClosedByInterruptException -> 0x00fc, IllegalStateException -> 0x011f, IOException -> 0x014f }
        r11 = r10.equals(r11);	 Catch:{ ClosedByInterruptException -> 0x00fc, IllegalStateException -> 0x011f, IOException -> 0x014f }
        if (r11 == 0) goto L_0x0079;
    L_0x00eb:
        if (r9 == 0) goto L_0x0205;
    L_0x00ed:
        r6 = r7;
    L_0x00ee:
        r11 = z;	 Catch:{ ClosedByInterruptException -> 0x011d, IllegalStateException -> 0x011f, IOException -> 0x014f }
        r12 = 6;
        r11 = r11[r12];	 Catch:{ ClosedByInterruptException -> 0x011d, IllegalStateException -> 0x011f, IOException -> 0x014f }
        r10 = r10.equals(r11);	 Catch:{ ClosedByInterruptException -> 0x011d, IllegalStateException -> 0x011f, IOException -> 0x014f }
        if (r10 == 0) goto L_0x0079;
    L_0x00f9:
        r6 = r8;
        goto L_0x0079;
    L_0x00fc:
        r1 = move-exception;
        throw r1;	 Catch:{ ClosedByInterruptException -> 0x00fe, IllegalStateException -> 0x011f, IOException -> 0x014f }
    L_0x00fe:
        r0 = move-exception;
        r1 = r2;
        r2 = r3;
    L_0x0101:
        r3 = z;	 Catch:{ all -> 0x0113 }
        r4 = 7;
        r3 = r3[r4];	 Catch:{ all -> 0x0113 }
        com.whatsapp.util.Log.a(r3, r0);	 Catch:{ all -> 0x0113 }
        r3 = new java.lang.InterruptedException;	 Catch:{ all -> 0x0113 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x0113 }
        r3.<init>(r0);	 Catch:{ all -> 0x0113 }
        throw r3;	 Catch:{ all -> 0x0113 }
    L_0x0113:
        r0 = move-exception;
        r3 = r2;
        r2 = r1;
    L_0x0116:
        com.whatsapp.util.ao.a(r2);
        com.whatsapp.gdrive.bc.a(r3);
        throw r0;
    L_0x011d:
        r1 = move-exception;
        throw r1;	 Catch:{ ClosedByInterruptException -> 0x00fe, IllegalStateException -> 0x011f, IOException -> 0x014f }
    L_0x011f:
        r1 = move-exception;
    L_0x0120:
        r4 = z;	 Catch:{ all -> 0x0173 }
        r5 = 8;
        r4 = r4[r5];	 Catch:{ all -> 0x0173 }
        com.whatsapp.util.Log.b(r4, r1);	 Catch:{ all -> 0x0173 }
        com.whatsapp.util.ao.a(r2);
        com.whatsapp.gdrive.bc.a(r3);
        goto L_0x006c;
    L_0x0131:
        r2.c();	 Catch:{ ClosedByInterruptException -> 0x0171, IllegalStateException -> 0x011f, IOException -> 0x014f }
    L_0x0134:
        r6 = r2.d();	 Catch:{ ClosedByInterruptException -> 0x00fe, IllegalStateException -> 0x011f, IOException -> 0x014f }
        if (r6 == 0) goto L_0x0186;
    L_0x013a:
        r6 = r14.a;	 Catch:{ ClosedByInterruptException -> 0x014d, IllegalStateException -> 0x011f, IOException -> 0x014f }
        r6 = r6.f();	 Catch:{ ClosedByInterruptException -> 0x014d, IllegalStateException -> 0x011f, IOException -> 0x014f }
        if (r6 == 0) goto L_0x0175;
    L_0x0142:
        r1 = new java.lang.InterruptedException;	 Catch:{ ClosedByInterruptException -> 0x014d, IllegalStateException -> 0x011f, IOException -> 0x014f }
        r4 = z;	 Catch:{ ClosedByInterruptException -> 0x014d, IllegalStateException -> 0x011f, IOException -> 0x014f }
        r5 = 5;
        r4 = r4[r5];	 Catch:{ ClosedByInterruptException -> 0x014d, IllegalStateException -> 0x011f, IOException -> 0x014f }
        r1.<init>(r4);	 Catch:{ ClosedByInterruptException -> 0x014d, IllegalStateException -> 0x011f, IOException -> 0x014f }
        throw r1;	 Catch:{ ClosedByInterruptException -> 0x014d, IllegalStateException -> 0x011f, IOException -> 0x014f }
    L_0x014d:
        r1 = move-exception;
        throw r1;	 Catch:{ ClosedByInterruptException -> 0x00fe, IllegalStateException -> 0x011f, IOException -> 0x014f }
    L_0x014f:
        r1 = move-exception;
    L_0x0150:
        r4 = z;	 Catch:{ ClosedByInterruptException -> 0x01df }
        r5 = 1;
        r4 = r4[r5];	 Catch:{ ClosedByInterruptException -> 0x01df }
        com.whatsapp.util.Log.b(r4, r1);	 Catch:{ ClosedByInterruptException -> 0x01df }
        r4 = r14.a;	 Catch:{ ClosedByInterruptException -> 0x01df }
        r1 = com.whatsapp.gdrive.bc.a(r4, r3, r1);	 Catch:{ ClosedByInterruptException -> 0x01df }
        if (r1 == 0) goto L_0x0169;
    L_0x0160:
        r1 = r14.a;	 Catch:{ ClosedByInterruptException -> 0x01df }
        r4 = java.lang.System.currentTimeMillis();	 Catch:{ ClosedByInterruptException -> 0x01df }
        com.whatsapp.gdrive.bc.a(r1, r4);	 Catch:{ ClosedByInterruptException -> 0x01df }
    L_0x0169:
        com.whatsapp.util.ao.a(r2);
        com.whatsapp.gdrive.bc.a(r3);
        goto L_0x006c;
    L_0x0171:
        r1 = move-exception;
        throw r1;	 Catch:{ ClosedByInterruptException -> 0x00fe, IllegalStateException -> 0x011f, IOException -> 0x014f }
    L_0x0173:
        r0 = move-exception;
        goto L_0x0116;
    L_0x0175:
        r2.l();	 Catch:{ ClosedByInterruptException -> 0x00fe, IllegalStateException -> 0x011f, IOException -> 0x014f }
        r6 = com.whatsapp.gdrive.fs.a(r2);	 Catch:{ ClosedByInterruptException -> 0x00fe, IllegalStateException -> 0x011f, IOException -> 0x014f }
        r1.add(r6);	 Catch:{ ClosedByInterruptException -> 0x00fe, IllegalStateException -> 0x011f, IOException -> 0x014f }
        r2.k();	 Catch:{ ClosedByInterruptException -> 0x00fe, IllegalStateException -> 0x011f, IOException -> 0x014f }
        r4 = r4 + 1;
        if (r9 == 0) goto L_0x0134;
    L_0x0186:
        r2.g();	 Catch:{ ClosedByInterruptException -> 0x00fe, IllegalStateException -> 0x011f, IOException -> 0x014f }
        if (r9 == 0) goto L_0x007c;
    L_0x018b:
        r5 = r2.f();	 Catch:{ ClosedByInterruptException -> 0x00fe, IllegalStateException -> 0x011f, IOException -> 0x014f }
        goto L_0x007c;
    L_0x0191:
        r1 = move-exception;
        throw r1;	 Catch:{ ClosedByInterruptException -> 0x0193, IllegalStateException -> 0x011f, IOException -> 0x014f }
    L_0x0193:
        r1 = move-exception;
        throw r1;	 Catch:{ ClosedByInterruptException -> 0x00fe, IllegalStateException -> 0x011f, IOException -> 0x014f }
    L_0x0195:
        r1 = 401; // 0x191 float:5.62E-43 double:1.98E-321;
        if (r2 != r1) goto L_0x01a6;
    L_0x0199:
        r1 = r14.a;	 Catch:{ ClosedByInterruptException -> 0x01d8, IllegalStateException -> 0x01fa, IOException -> 0x01f1, all -> 0x01e7 }
        com.whatsapp.gdrive.bc.a(r1);	 Catch:{ ClosedByInterruptException -> 0x01d8, IllegalStateException -> 0x01fa, IOException -> 0x01f1, all -> 0x01e7 }
        com.whatsapp.util.ao.a(r0);
        com.whatsapp.gdrive.bc.a(r3);
        goto L_0x006c;
    L_0x01a6:
        r1 = r3.getErrorStream();	 Catch:{ ClosedByInterruptException -> 0x01d8, IllegalStateException -> 0x01fa, IOException -> 0x01f1, all -> 0x01e7 }
        r1 = com.whatsapp.gdrive.fn.a(r1);	 Catch:{ ClosedByInterruptException -> 0x01d8, IllegalStateException -> 0x01fa, IOException -> 0x01f1, all -> 0x01e7 }
        r4 = new java.lang.StringBuilder;	 Catch:{ ClosedByInterruptException -> 0x01d8, IllegalStateException -> 0x01fa, IOException -> 0x01f1, all -> 0x01e7 }
        r4.<init>();	 Catch:{ ClosedByInterruptException -> 0x01d8, IllegalStateException -> 0x01fa, IOException -> 0x01f1, all -> 0x01e7 }
        r5 = z;	 Catch:{ ClosedByInterruptException -> 0x01d8, IllegalStateException -> 0x01fa, IOException -> 0x01f1, all -> 0x01e7 }
        r6 = 4;
        r5 = r5[r6];	 Catch:{ ClosedByInterruptException -> 0x01d8, IllegalStateException -> 0x01fa, IOException -> 0x01f1, all -> 0x01e7 }
        r4 = r4.append(r5);	 Catch:{ ClosedByInterruptException -> 0x01d8, IllegalStateException -> 0x01fa, IOException -> 0x01f1, all -> 0x01e7 }
        r2 = r4.append(r2);	 Catch:{ ClosedByInterruptException -> 0x01d8, IllegalStateException -> 0x01fa, IOException -> 0x01f1, all -> 0x01e7 }
        r4 = " ";
        r2 = r2.append(r4);	 Catch:{ ClosedByInterruptException -> 0x01d8, IllegalStateException -> 0x01fa, IOException -> 0x01f1, all -> 0x01e7 }
        r2 = r2.append(r1);	 Catch:{ ClosedByInterruptException -> 0x01d8, IllegalStateException -> 0x01fa, IOException -> 0x01f1, all -> 0x01e7 }
        r2 = r2.toString();	 Catch:{ ClosedByInterruptException -> 0x01d8, IllegalStateException -> 0x01fa, IOException -> 0x01f1, all -> 0x01e7 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ ClosedByInterruptException -> 0x01d8, IllegalStateException -> 0x01fa, IOException -> 0x01f1, all -> 0x01e7 }
        r2 = new com.whatsapp.gdrive.e3;	 Catch:{ ClosedByInterruptException -> 0x01d8, IllegalStateException -> 0x01fa, IOException -> 0x01f1, all -> 0x01e7 }
        r2.<init>(r1);	 Catch:{ ClosedByInterruptException -> 0x01d8, IllegalStateException -> 0x01fa, IOException -> 0x01f1, all -> 0x01e7 }
        throw r2;	 Catch:{ ClosedByInterruptException -> 0x01d8, IllegalStateException -> 0x01fa, IOException -> 0x01f1, all -> 0x01e7 }
    L_0x01d8:
        r1 = move-exception;
        r2 = r3;
        r13 = r0;
        r0 = r1;
        r1 = r13;
        goto L_0x0101;
    L_0x01df:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0173 }
    L_0x01e1:
        r1 = move-exception;
        r2 = r0;
        r3 = r0;
        r0 = r1;
        goto L_0x0116;
    L_0x01e7:
        r1 = move-exception;
        r2 = r0;
        r0 = r1;
        goto L_0x0116;
    L_0x01ec:
        r1 = move-exception;
        r2 = r0;
        r3 = r0;
        goto L_0x0150;
    L_0x01f1:
        r1 = move-exception;
        r2 = r0;
        goto L_0x0150;
    L_0x01f5:
        r1 = move-exception;
        r2 = r0;
        r3 = r0;
        goto L_0x0120;
    L_0x01fa:
        r1 = move-exception;
        r2 = r0;
        goto L_0x0120;
    L_0x01fe:
        r1 = move-exception;
        r2 = r0;
        r13 = r0;
        r0 = r1;
        r1 = r13;
        goto L_0x0101;
    L_0x0205:
        r6 = r7;
        goto L_0x0079;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.v.a():java.util.List");
    }

    public Object a() {
        return a();
    }
}
