package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.whatsapp.gdrive.fn;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import com.whatsapp.util.ak;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class azf {
    private static final File a;
    private static final File b;
    private static final File c;
    private static final File d;
    private static final File e;
    private static final File f;
    private static final File g;
    private static final File h;
    private static final File j;
    private static final File l;
    private static final File m;
    private static final String[] z;
    private HashMap i;
    private final Context k;
    private gj n;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(com.whatsapp.ael r25, java.io.File r26, int r27, int r28, boolean r29) {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:com.whatsapp.azf.a(com.whatsapp.ael, java.io.File, int, int, boolean):boolean. bs: [B:26:0x00cc, B:208:0x042e]
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:86)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:57)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:281)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:161)
*/
        /*
        r24 = this;
        r18 = com.whatsapp.l5.s;
        r16 = 0;
        r4 = r26.exists();
        if (r4 == 0) goto L_0x058d;
    L_0x000a:
        r6 = 0;
        r5 = 0;
        r4 = r26.getName();
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r8 = z;
        r9 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        r8 = r8[r9];
        r7 = r7.append(r8);
        r7 = r7.append(r4);
        r8 = z;
        r9 = 137; // 0x89 float:1.92E-43 double:6.77E-322;
        r8 = r8[r9];
        r7 = r7.append(r8);
        r8 = r26.length();
        r7 = r7.append(r8);
        r7 = r7.toString();
        com.whatsapp.util.Log.i(r7);
        r8 = 0;
        r7 = z;	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        r9 = 117; // 0x75 float:1.64E-43 double:5.8E-322;	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        r7 = r7[r9];	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        r9 = r4.endsWith(r7);	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        r7 = z;	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        r10 = 125; // 0x7d float:1.75E-43 double:6.2E-322;	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        r7 = r7[r10];	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        r10 = r4.endsWith(r7);	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        r7 = z;	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        r11 = 139; // 0x8b float:1.95E-43 double:6.87E-322;	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        r7 = r7[r11];	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        r11 = r4.endsWith(r7);	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        r7 = z;	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        r12 = 124; // 0x7c float:1.74E-43 double:6.13E-322;	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        r7 = r7[r12];	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        r12 = r4.endsWith(r7);	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        r7 = z;	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        r13 = 143; // 0x8f float:2.0E-43 double:7.07E-322;	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        r7 = r7[r13];	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        r17 = r4.endsWith(r7);	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        r7 = z;	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        r13 = 120; // 0x78 float:1.68E-43 double:5.93E-322;	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        r7 = r7[r13];	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        r19 = r4.endsWith(r7);	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        r7 = z;	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        r13 = 134; // 0x86 float:1.88E-43 double:6.6E-322;	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        r7 = r7[r13];	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        r20 = r4.endsWith(r7);	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        r7 = z;	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        r13 = 135; // 0x87 float:1.89E-43 double:6.67E-322;	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        r7 = r7[r13];	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        r21 = r4.endsWith(r7);	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        r7 = z;	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        r13 = 154; // 0x9a float:2.16E-43 double:7.6E-322;	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        r7 = r7[r13];	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        r22 = r4.endsWith(r7);	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        if (r21 == 0) goto L_0x0116;
    L_0x0099:
        if (r9 != 0) goto L_0x00ab;
    L_0x009b:
        if (r10 != 0) goto L_0x00ab;
    L_0x009d:
        if (r11 != 0) goto L_0x00ab;
    L_0x009f:
        if (r12 != 0) goto L_0x00ab;
    L_0x00a1:
        if (r17 != 0) goto L_0x00ab;
    L_0x00a3:
        if (r19 != 0) goto L_0x00ab;
    L_0x00a5:
        if (r20 != 0) goto L_0x00ab;
    L_0x00a7:
        if (r21 != 0) goto L_0x00ab;
    L_0x00a9:
        if (r22 == 0) goto L_0x041e;
    L_0x00ab:
        r4 = com.whatsapp.util.b2.a();	 Catch:{ Exception -> 0x034b, all -> 0x034d }
        r4 = r4.b();	 Catch:{ Exception -> 0x034b, all -> 0x034d }
        if (r4 == 0) goto L_0x0413;
    L_0x00b5:
        r4 = 0;
        r14 = 0;
        r15 = 0;
        r7 = new com.whatsapp.util.q;	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        r13 = com.whatsapp.App.J;	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        r23 = com.whatsapp.ael.X;	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        r0 = r23;	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        r7.<init>(r13, r0);	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        r6 = new java.io.FileInputStream;	 Catch:{ Exception -> 0x0565, all -> 0x0556 }
        r0 = r26;	 Catch:{ Exception -> 0x0565, all -> 0x0556 }
        r6.<init>(r0);	 Catch:{ Exception -> 0x0565, all -> 0x0556 }
        if (r9 == 0) goto L_0x00d0;
    L_0x00cc:
        r13 = com.whatsapp.util.z.CRYPT1;	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
        if (r18 == 0) goto L_0x0589;	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
    L_0x00d0:
        if (r10 == 0) goto L_0x00d6;	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
    L_0x00d2:
        r13 = com.whatsapp.util.z.CRYPT2;	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
        if (r18 == 0) goto L_0x0589;	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
    L_0x00d6:
        if (r11 == 0) goto L_0x00dc;	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
    L_0x00d8:
        r13 = com.whatsapp.util.z.CRYPT3;	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
        if (r18 == 0) goto L_0x0589;	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
    L_0x00dc:
        if (r12 == 0) goto L_0x00e2;	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
    L_0x00de:
        r13 = com.whatsapp.util.z.CRYPT4;	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
        if (r18 == 0) goto L_0x0589;	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
    L_0x00e2:
        if (r17 == 0) goto L_0x00e8;	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
    L_0x00e4:
        r13 = com.whatsapp.util.z.CRYPT5;	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
        if (r18 == 0) goto L_0x0589;	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
    L_0x00e8:
        r5 = com.whatsapp.ve.a(r6);	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
        r4 = new com.whatsapp.an8;	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
        r8 = r5.e;	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
        r9 = r5.a;	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
        r4.<init>(r8, r9);	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
        r0 = r24;	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
        r8 = r0.i;	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
        r4 = r8.get(r4);	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
        r4 = (com.whatsapp.a5o) r4;	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
        if (r4 != 0) goto L_0x039e;	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
    L_0x0101:
        r4 = z;	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
        r5 = 148; // 0x94 float:2.07E-43 double:7.3E-322;	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
        r4 = r4[r5];	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
        com.whatsapp.util.Log.e(r4);	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
        r4 = 0;
        if (r6 == 0) goto L_0x0110;
    L_0x010d:
        r6.close();	 Catch:{ Exception -> 0x035a }
    L_0x0110:
        if (r7 == 0) goto L_0x0115;
    L_0x0112:
        r7.close();	 Catch:{ IOException -> 0x037d, IllegalStateException -> 0x037b }
    L_0x0115:
        return r4;
    L_0x0116:
        r14 = r26.length();	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        r0 = r24;	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        r0.a(r14);	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        goto L_0x0099;
    L_0x0121:
        r4 = move-exception;
        r7 = r6;
        r6 = r5;
    L_0x0124:
        r5 = z;	 Catch:{ all -> 0x0561 }
        r8 = 152; // 0x98 float:2.13E-43 double:7.5E-322;	 Catch:{ all -> 0x0561 }
        r5 = r5[r8];	 Catch:{ all -> 0x0561 }
        com.whatsapp.util.Log.c(r5, r4);	 Catch:{ all -> 0x0561 }
        if (r6 == 0) goto L_0x0132;
    L_0x012f:
        r6.close();	 Catch:{ Exception -> 0x0489 }
    L_0x0132:
        if (r7 == 0) goto L_0x0581;
    L_0x0134:
        r7.close();	 Catch:{ IOException -> 0x04ac, IllegalStateException -> 0x04aa }
        r4 = r16;
    L_0x0139:
        if (r4 == 0) goto L_0x032f;
    L_0x013b:
        r5 = com.whatsapp.ael.X;
        r5 = com.whatsapp.ael.b(r5);
        r5 = r5 & r4;
        if (r5 == 0) goto L_0x057e;
    L_0x0144:
        r4 = com.whatsapp.ael.X;
        r7 = com.whatsapp.ael.c(r4);
        if (r7 != 0) goto L_0x0515;
    L_0x014c:
        r4 = -1;
    L_0x014d:
        r6 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0519 }
        r6.<init>();	 Catch:{ Exception -> 0x0519 }
        r8 = z;	 Catch:{ Exception -> 0x0519 }
        r9 = 141; // 0x8d float:1.98E-43 double:6.97E-322;	 Catch:{ Exception -> 0x0519 }
        r8 = r8[r9];	 Catch:{ Exception -> 0x0519 }
        r6 = r6.append(r8);	 Catch:{ Exception -> 0x0519 }
        r8 = r6.append(r4);	 Catch:{ Exception -> 0x0519 }
        if (r7 == 0) goto L_0x051b;	 Catch:{ Exception -> 0x0519 }
    L_0x0162:
        r6 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0519 }
        r6.<init>();	 Catch:{ Exception -> 0x0519 }
        r9 = z;	 Catch:{ Exception -> 0x0519 }
        r10 = 132; // 0x84 float:1.85E-43 double:6.5E-322;	 Catch:{ Exception -> 0x0519 }
        r9 = r9[r10];	 Catch:{ Exception -> 0x0519 }
        r6 = r6.append(r9);	 Catch:{ Exception -> 0x0519 }
        r9 = r7.a;	 Catch:{ Exception -> 0x0519 }
        r9 = r9.size();	 Catch:{ Exception -> 0x0519 }
        r6 = r6.append(r9);	 Catch:{ Exception -> 0x0519 }
        r9 = z;	 Catch:{ Exception -> 0x0519 }
        r10 = 155; // 0x9b float:2.17E-43 double:7.66E-322;	 Catch:{ Exception -> 0x0519 }
        r9 = r9[r10];	 Catch:{ Exception -> 0x0519 }
        r6 = r6.append(r9);	 Catch:{ Exception -> 0x0519 }
        r9 = r7.b;	 Catch:{ Exception -> 0x0519 }
        r9 = r9.size();	 Catch:{ Exception -> 0x0519 }
        r6 = r6.append(r9);	 Catch:{ Exception -> 0x0519 }
        r6 = r6.toString();	 Catch:{ Exception -> 0x0519 }
    L_0x0193:
        r6 = r8.append(r6);	 Catch:{ Exception -> 0x0520 }
        r6 = r6.toString();	 Catch:{ Exception -> 0x0520 }
        com.whatsapp.util.Log.i(r6);	 Catch:{ Exception -> 0x0520 }
        if (r4 == 0) goto L_0x057e;
    L_0x01a0:
        if (r29 == 0) goto L_0x02ea;
    L_0x01a2:
        if (r7 == 0) goto L_0x052a;
    L_0x01a4:
        r4 = r7.a;	 Catch:{ Exception -> 0x0526 }
        r4 = r4.size();	 Catch:{ Exception -> 0x0526 }
        if (r4 <= 0) goto L_0x052a;
    L_0x01ac:
        r4 = r7.b;	 Catch:{ Exception -> 0x0528 }
        r4 = r4.size();	 Catch:{ Exception -> 0x0528 }
        if (r4 != 0) goto L_0x052a;
    L_0x01b4:
        r4 = 1;
        r8 = r4;
    L_0x01b6:
        if (r8 == 0) goto L_0x057b;
    L_0x01b8:
        com.whatsapp.ael.L();
        r5 = 0;
        r4 = 0;
        r6 = r7.a;
        r6 = r6.entrySet();
        r9 = r6.iterator();
        r6 = r4;
        r7 = r5;
    L_0x01c9:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x0578;
    L_0x01cf:
        r4 = r9.next();
        r4 = (java.util.Map.Entry) r4;
        r5 = r4.getKey();
        r5 = (java.lang.String) r5;
        r0 = r24;
        r5 = r0.a(r5);
        r10 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x052e }
        r10.<init>();	 Catch:{ Exception -> 0x052e }
        r11 = z;	 Catch:{ Exception -> 0x052e }
        r12 = 127; // 0x7f float:1.78E-43 double:6.27E-322;	 Catch:{ Exception -> 0x052e }
        r11 = r11[r12];	 Catch:{ Exception -> 0x052e }
        r10 = r10.append(r11);	 Catch:{ Exception -> 0x052e }
        r4 = r4.getKey();	 Catch:{ Exception -> 0x052e }
        r4 = (java.lang.String) r4;	 Catch:{ Exception -> 0x052e }
        r10 = r10.append(r4);	 Catch:{ Exception -> 0x052e }
        if (r5 == 0) goto L_0x0530;	 Catch:{ Exception -> 0x052e }
    L_0x01fc:
        r4 = z;	 Catch:{ Exception -> 0x052e }
        r11 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ Exception -> 0x052e }
        r4 = r4[r11];	 Catch:{ Exception -> 0x052e }
    L_0x0202:
        r4 = r10.append(r4);	 Catch:{ Exception -> 0x0538 }
        r4 = r4.toString();	 Catch:{ Exception -> 0x0538 }
        com.whatsapp.util.Log.i(r4);	 Catch:{ Exception -> 0x0538 }
        r4 = r6 + 1;
        if (r5 == 0) goto L_0x0216;
    L_0x0211:
        r5 = r7 + 1;
        if (r18 == 0) goto L_0x0574;
    L_0x0215:
        r7 = r5;
    L_0x0216:
        r5 = com.whatsapp.ael.X;
        r5 = com.whatsapp.ael.e(r5);
        r6 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x053a }
        r6.<init>();	 Catch:{ Exception -> 0x053a }
        r9 = z;	 Catch:{ Exception -> 0x053a }
        r10 = 122; // 0x7a float:1.71E-43 double:6.03E-322;	 Catch:{ Exception -> 0x053a }
        r9 = r9[r10];	 Catch:{ Exception -> 0x053a }
        r9 = r6.append(r9);	 Catch:{ Exception -> 0x053a }
        if (r5 == 0) goto L_0x053c;	 Catch:{ Exception -> 0x053a }
    L_0x022d:
        r6 = z;	 Catch:{ Exception -> 0x053a }
        r10 = 145; // 0x91 float:2.03E-43 double:7.16E-322;	 Catch:{ Exception -> 0x053a }
        r6 = r6[r10];	 Catch:{ Exception -> 0x053a }
    L_0x0233:
        r6 = r9.append(r6);	 Catch:{ Exception -> 0x0544 }
        r6 = r6.toString();	 Catch:{ Exception -> 0x0544 }
        com.whatsapp.util.Log.i(r6);	 Catch:{ Exception -> 0x0544 }
        r6 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0544 }
        r6.<init>();	 Catch:{ Exception -> 0x0544 }
        r9 = z;	 Catch:{ Exception -> 0x0544 }
        r10 = 142; // 0x8e float:1.99E-43 double:7.0E-322;	 Catch:{ Exception -> 0x0544 }
        r9 = r9[r10];	 Catch:{ Exception -> 0x0544 }
        r6 = r6.append(r9);	 Catch:{ Exception -> 0x0544 }
        r6 = r6.append(r7);	 Catch:{ Exception -> 0x0544 }
        r7 = "/";	 Catch:{ Exception -> 0x0544 }
        r6 = r6.append(r7);	 Catch:{ Exception -> 0x0544 }
        r4 = r6.append(r4);	 Catch:{ Exception -> 0x0544 }
        r4 = r4.toString();	 Catch:{ Exception -> 0x0544 }
        com.whatsapp.util.Log.i(r4);	 Catch:{ Exception -> 0x0544 }
        r4 = com.whatsapp.App.z();	 Catch:{ Exception -> 0x0544 }
        r6 = com.whatsapp.fieldstats.bn.DATABASE_REINDEXING_RESULT;	 Catch:{ Exception -> 0x0544 }
        r7 = java.lang.Boolean.valueOf(r5);	 Catch:{ Exception -> 0x0544 }
        com.whatsapp.fieldstats.i.a(r4, r6, r7);	 Catch:{ Exception -> 0x0544 }
        if (r5 != 0) goto L_0x0571;
    L_0x0272:
        r4 = com.whatsapp.App.j;	 Catch:{ Exception -> 0x0546 }
        r6 = 1;
        if (r4 != r6) goto L_0x0289;
    L_0x0277:
        r4 = com.whatsapp.auq.a();	 Catch:{ Exception -> 0x0548 }
        r6 = 7;	 Catch:{ Exception -> 0x0548 }
        if (r4 > r6) goto L_0x0289;	 Catch:{ Exception -> 0x0548 }
    L_0x027e:
        r4 = z;	 Catch:{ Exception -> 0x0548 }
        r6 = 147; // 0x93 float:2.06E-43 double:7.26E-322;	 Catch:{ Exception -> 0x0548 }
        r4 = r4[r6];	 Catch:{ Exception -> 0x0548 }
        r6 = 0;	 Catch:{ Exception -> 0x0548 }
        r7 = 0;	 Catch:{ Exception -> 0x0548 }
        com.whatsapp.App.a(r4, r6, r7);	 Catch:{ Exception -> 0x0548 }
    L_0x0289:
        r4 = r5;
        com.whatsapp.ael.T();
    L_0x028d:
        if (r8 == 0) goto L_0x0291;
    L_0x028f:
        if (r4 != 0) goto L_0x02e8;
    L_0x0291:
        r4 = com.whatsapp.ael.X;
        r0 = r24;
        r4 = r0.e(r4);
        r5 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x054a }
        r5.<init>();	 Catch:{ Exception -> 0x054a }
        r6 = z;	 Catch:{ Exception -> 0x054a }
        r7 = 153; // 0x99 float:2.14E-43 double:7.56E-322;	 Catch:{ Exception -> 0x054a }
        r6 = r6[r7];	 Catch:{ Exception -> 0x054a }
        r5 = r5.append(r6);	 Catch:{ Exception -> 0x054a }
        r5 = r5.append(r4);	 Catch:{ Exception -> 0x054a }
        r5 = r5.toString();	 Catch:{ Exception -> 0x054a }
        com.whatsapp.util.Log.i(r5);	 Catch:{ Exception -> 0x054a }
        r5 = com.whatsapp.App.z();	 Catch:{ Exception -> 0x054a }
        r6 = com.whatsapp.fieldstats.bn.DATABASE_DUMP_AND_RESTORE_RESULT;	 Catch:{ Exception -> 0x054a }
        r7 = java.lang.Boolean.valueOf(r4);	 Catch:{ Exception -> 0x054a }
        com.whatsapp.fieldstats.i.a(r5, r6, r7);	 Catch:{ Exception -> 0x054a }
        if (r8 == 0) goto L_0x02e8;
    L_0x02c2:
        r5 = com.whatsapp.App.z();	 Catch:{ Exception -> 0x054c }
        r6 = com.whatsapp.fieldstats.bn.DATABASE_DUMP_AND_RESTORE_AFTER_REINDEX_RESULT;	 Catch:{ Exception -> 0x054c }
        r7 = java.lang.Boolean.valueOf(r4);	 Catch:{ Exception -> 0x054c }
        com.whatsapp.fieldstats.i.a(r5, r6, r7);	 Catch:{ Exception -> 0x054c }
        r5 = com.whatsapp.App.j;	 Catch:{ Exception -> 0x054c }
        r6 = 1;
        if (r5 != r6) goto L_0x02e8;
    L_0x02d4:
        r5 = com.whatsapp.auq.a();	 Catch:{ Exception -> 0x054e }
        r6 = 7;
        if (r5 > r6) goto L_0x02e8;
    L_0x02db:
        if (r4 != 0) goto L_0x02e8;
    L_0x02dd:
        r5 = z;	 Catch:{ Exception -> 0x0550 }
        r6 = 116; // 0x74 float:1.63E-43 double:5.73E-322;	 Catch:{ Exception -> 0x0550 }
        r5 = r5[r6];	 Catch:{ Exception -> 0x0550 }
        r6 = 0;	 Catch:{ Exception -> 0x0550 }
        r7 = 0;	 Catch:{ Exception -> 0x0550 }
        com.whatsapp.App.a(r5, r6, r7);	 Catch:{ Exception -> 0x0550 }
    L_0x02e8:
        if (r18 == 0) goto L_0x02f8;
    L_0x02ea:
        r4 = com.whatsapp.ael.X;	 Catch:{ Exception -> 0x0552 }
        r4 = r4.exists();	 Catch:{ Exception -> 0x0552 }
        if (r4 == 0) goto L_0x02f7;	 Catch:{ Exception -> 0x0552 }
    L_0x02f2:
        r4 = com.whatsapp.ael.X;	 Catch:{ Exception -> 0x0552 }
        r4.delete();	 Catch:{ Exception -> 0x0552 }
    L_0x02f7:
        r4 = 0;
    L_0x02f8:
        if (r4 == 0) goto L_0x02ff;
    L_0x02fa:
        r5 = r25.D();
        r4 = r4 & r5;
    L_0x02ff:
        if (r4 == 0) goto L_0x032f;
    L_0x0301:
        if (r29 == 0) goto L_0x032f;
    L_0x0303:
        r0 = r24;
        r5 = r0.k;
        r6 = z;
        r7 = 119; // 0x77 float:1.67E-43 double:5.9E-322;
        r6 = r6[r7];
        r7 = 0;
        r5 = r5.getSharedPreferences(r6, r7);
        r5 = r5.edit();
        r6 = z;	 Catch:{ Exception -> 0x0554 }
        r7 = 150; // 0x96 float:2.1E-43 double:7.4E-322;	 Catch:{ Exception -> 0x0554 }
        r6 = r6[r7];	 Catch:{ Exception -> 0x0554 }
        r7 = 1;	 Catch:{ Exception -> 0x0554 }
        r5.putBoolean(r6, r7);	 Catch:{ Exception -> 0x0554 }
        r5 = r5.commit();	 Catch:{ Exception -> 0x0554 }
        if (r5 != 0) goto L_0x032f;	 Catch:{ Exception -> 0x0554 }
    L_0x0326:
        r5 = z;	 Catch:{ Exception -> 0x0554 }
        r6 = 136; // 0x88 float:1.9E-43 double:6.7E-322;	 Catch:{ Exception -> 0x0554 }
        r5 = r5[r6];	 Catch:{ Exception -> 0x0554 }
        com.whatsapp.util.Log.e(r5);	 Catch:{ Exception -> 0x0554 }
    L_0x032f:
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = z;
        r7 = 138; // 0x8a float:1.93E-43 double:6.8E-322;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r5 = r5.append(r4);
        r5 = r5.toString();
        com.whatsapp.util.Log.i(r5);
        goto L_0x0115;
    L_0x034b:
        r4 = move-exception;
        throw r4;	 Catch:{ Exception -> 0x0121, all -> 0x034d }
    L_0x034d:
        r4 = move-exception;
        r7 = r6;
    L_0x034f:
        if (r5 == 0) goto L_0x0354;
    L_0x0351:
        r5.close();	 Catch:{ Exception -> 0x04d1 }
    L_0x0354:
        if (r7 == 0) goto L_0x0359;
    L_0x0356:
        r7.close();	 Catch:{ IOException -> 0x04f4, IllegalStateException -> 0x04f2 }
    L_0x0359:
        throw r4;
    L_0x035a:
        r5 = move-exception;
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r8 = z;
        r9 = 118; // 0x76 float:1.65E-43 double:5.83E-322;
        r8 = r8[r9];
        r6 = r6.append(r8);
        r5 = r5.toString();
        r5 = r6.append(r5);
        r5 = r5.toString();
        com.whatsapp.util.Log.e(r5);
        goto L_0x0110;
    L_0x037b:
        r4 = move-exception;
        throw r4;
    L_0x037d:
        r5 = move-exception;
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r7 = z;
        r8 = 129; // 0x81 float:1.81E-43 double:6.37E-322;
        r7 = r7[r8];
        r6 = r6.append(r7);
        r5 = r5.toString();
        r5 = r6.append(r5);
        r5 = r5.toString();
        com.whatsapp.util.Log.e(r5);
        goto L_0x0115;
    L_0x039e:
        if (r19 == 0) goto L_0x03a4;
    L_0x03a0:
        r13 = com.whatsapp.util.z.CRYPT6;	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
        if (r18 == 0) goto L_0x03b2;	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
    L_0x03a4:
        if (r20 == 0) goto L_0x03aa;	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
    L_0x03a6:
        r13 = com.whatsapp.util.z.CRYPT7;	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
        if (r18 == 0) goto L_0x03b2;	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
    L_0x03aa:
        if (r21 == 0) goto L_0x03b0;	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
    L_0x03ac:
        r13 = com.whatsapp.util.z.CRYPT8;	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
        if (r18 == 0) goto L_0x03b2;	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
    L_0x03b0:
        r13 = com.whatsapp.util.z.CRYPT9;	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
    L_0x03b2:
        r14 = r4.b;	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
        r15 = r5.d;	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
        r17 = r4;	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
        r4 = r5;	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
    L_0x03b9:
        r5 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
        r5.<init>();	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
        r8 = z;	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
        r9 = 131; // 0x83 float:1.84E-43 double:6.47E-322;	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
        r8 = r8[r9];	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
        r5 = r5.append(r8);	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
        r5 = r5.append(r13);	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
        r5 = r5.toString();	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
        com.whatsapp.util.Log.i(r5);	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
        r5 = com.whatsapp.util.b2.a();	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
        r10 = r26.length();	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
        r0 = r24;	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
        r12 = r0.n;	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
        r8 = r27;	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
        r9 = r28;	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
        r5.a(r6, r7, r8, r9, r10, r12, r13, r14, r15);	 Catch:{ Exception -> 0x0569, all -> 0x0559 }
        r5 = 1;
        if (r20 != 0) goto L_0x03ed;
    L_0x03e9:
        if (r21 != 0) goto L_0x03ed;
    L_0x03eb:
        if (r22 == 0) goto L_0x0403;
    L_0x03ed:
        r12 = r4.e;	 Catch:{ Exception -> 0x056c, all -> 0x0559 }
        r13 = r4.a;	 Catch:{ Exception -> 0x056c, all -> 0x0559 }
        r0 = r17;	 Catch:{ Exception -> 0x056c, all -> 0x0559 }
        r15 = r0.c;	 Catch:{ Exception -> 0x056c, all -> 0x0559 }
        r0 = r4.b;	 Catch:{ Exception -> 0x056c, all -> 0x0559 }
        r16 = r0;	 Catch:{ Exception -> 0x056c, all -> 0x0559 }
        r0 = r4.d;	 Catch:{ Exception -> 0x056c, all -> 0x0559 }
        r17 = r0;	 Catch:{ Exception -> 0x056c, all -> 0x0559 }
        com.whatsapp.ve.a(r12, r13, r14, r15, r16, r17);	 Catch:{ Exception -> 0x056c, all -> 0x0559 }
        com.whatsapp.ve.f();	 Catch:{ Exception -> 0x056c, all -> 0x0559 }
    L_0x0403:
        r16 = r5;
    L_0x0405:
        if (r6 == 0) goto L_0x040a;
    L_0x0407:
        r6.close();	 Catch:{ Exception -> 0x0442 }
    L_0x040a:
        if (r7 == 0) goto L_0x0581;
    L_0x040c:
        r7.close();	 Catch:{ IOException -> 0x0464, IllegalStateException -> 0x0462 }
        r4 = r16;
        goto L_0x0139;
    L_0x0413:
        r4 = z;	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        r7 = 126; // 0x7e float:1.77E-43 double:6.23E-322;	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        r4 = r4[r7];	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        com.whatsapp.util.Log.i(r4);	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        if (r18 == 0) goto L_0x0585;	 Catch:{ Exception -> 0x0121, all -> 0x034d }
    L_0x041e:
        r7 = new com.whatsapp.util.q;	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        r4 = com.whatsapp.App.J;	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        r8 = com.whatsapp.ael.X;	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        r7.<init>(r4, r8);	 Catch:{ Exception -> 0x0121, all -> 0x034d }
        r6 = new java.io.FileInputStream;	 Catch:{ Exception -> 0x0565, all -> 0x0556 }
        r0 = r26;	 Catch:{ Exception -> 0x0565, all -> 0x0556 }
        r6.<init>(r0);	 Catch:{ Exception -> 0x0565, all -> 0x0556 }
        r4 = r6.getChannel();	 Catch:{ Exception -> 0x0569, all -> 0x055d }
        r5 = java.nio.channels.Channels.newChannel(r7);	 Catch:{ Exception -> 0x0569, all -> 0x055d }
        r0 = r24;	 Catch:{ Exception -> 0x0569, all -> 0x055d }
        r1 = r27;	 Catch:{ Exception -> 0x0569, all -> 0x055d }
        r2 = r28;	 Catch:{ Exception -> 0x0569, all -> 0x055d }
        r0.a(r4, r5, r1, r2);	 Catch:{ Exception -> 0x0569, all -> 0x055d }
        r16 = 1;
        goto L_0x0405;
    L_0x0442:
        r4 = move-exception;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = z;
        r8 = 133; // 0x85 float:1.86E-43 double:6.57E-322;
        r6 = r6[r8];
        r5 = r5.append(r6);
        r4 = r4.toString();
        r4 = r5.append(r4);
        r4 = r4.toString();
        com.whatsapp.util.Log.e(r4);
        goto L_0x040a;
    L_0x0462:
        r4 = move-exception;
        throw r4;
    L_0x0464:
        r4 = move-exception;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = z;
        r7 = 144; // 0x90 float:2.02E-43 double:7.1E-322;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r4 = r4.toString();
        r4 = r5.append(r4);
        r4 = r4.toString();
        com.whatsapp.util.Log.e(r4);
        r16 = 0;
        r4 = r16;
        goto L_0x0139;
    L_0x0489:
        r4 = move-exception;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = z;
        r8 = 149; // 0x95 float:2.09E-43 double:7.36E-322;
        r6 = r6[r8];
        r5 = r5.append(r6);
        r4 = r4.toString();
        r4 = r5.append(r4);
        r4 = r4.toString();
        com.whatsapp.util.Log.e(r4);
        goto L_0x0132;
    L_0x04aa:
        r4 = move-exception;
        throw r4;
    L_0x04ac:
        r4 = move-exception;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = z;
        r7 = 140; // 0x8c float:1.96E-43 double:6.9E-322;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r4 = r4.toString();
        r4 = r5.append(r4);
        r4 = r4.toString();
        com.whatsapp.util.Log.e(r4);
        r16 = 0;
        r4 = r16;
        goto L_0x0139;
    L_0x04d1:
        r5 = move-exception;
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r8 = z;
        r9 = 121; // 0x79 float:1.7E-43 double:6.0E-322;
        r8 = r8[r9];
        r6 = r6.append(r8);
        r5 = r5.toString();
        r5 = r6.append(r5);
        r5 = r5.toString();
        com.whatsapp.util.Log.e(r5);
        goto L_0x0354;
    L_0x04f2:
        r4 = move-exception;
        throw r4;
    L_0x04f4:
        r5 = move-exception;
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r7 = z;
        r8 = 151; // 0x97 float:2.12E-43 double:7.46E-322;
        r7 = r7[r8];
        r6 = r6.append(r7);
        r5 = r5.toString();
        r5 = r6.append(r5);
        r5 = r5.toString();
        com.whatsapp.util.Log.e(r5);
        goto L_0x0359;
    L_0x0515:
        r4 = r7.c;
        goto L_0x014d;
    L_0x0519:
        r4 = move-exception;
        throw r4;
    L_0x051b:
        r6 = "";
        goto L_0x0193;
    L_0x0520:
        r4 = move-exception;
        throw r4;	 Catch:{ Exception -> 0x0522 }
    L_0x0522:
        r4 = move-exception;
        throw r4;	 Catch:{ Exception -> 0x0524 }
    L_0x0524:
        r4 = move-exception;
        throw r4;	 Catch:{ Exception -> 0x0526 }
    L_0x0526:
        r4 = move-exception;
        throw r4;	 Catch:{ Exception -> 0x0528 }
    L_0x0528:
        r4 = move-exception;
        throw r4;
    L_0x052a:
        r4 = 0;
        r8 = r4;
        goto L_0x01b6;
    L_0x052e:
        r4 = move-exception;
        throw r4;
    L_0x0530:
        r4 = z;
        r11 = 130; // 0x82 float:1.82E-43 double:6.4E-322;
        r4 = r4[r11];
        goto L_0x0202;
    L_0x0538:
        r4 = move-exception;
        throw r4;
    L_0x053a:
        r4 = move-exception;
        throw r4;
    L_0x053c:
        r6 = z;
        r10 = 146; // 0x92 float:2.05E-43 double:7.2E-322;
        r6 = r6[r10];
        goto L_0x0233;
    L_0x0544:
        r4 = move-exception;
        throw r4;	 Catch:{ Exception -> 0x0546 }
    L_0x0546:
        r4 = move-exception;
        throw r4;	 Catch:{ Exception -> 0x0548 }
    L_0x0548:
        r4 = move-exception;
        throw r4;
    L_0x054a:
        r4 = move-exception;
        throw r4;	 Catch:{ Exception -> 0x054c }
    L_0x054c:
        r4 = move-exception;
        throw r4;	 Catch:{ Exception -> 0x054e }
    L_0x054e:
        r4 = move-exception;
        throw r4;	 Catch:{ Exception -> 0x0550 }
    L_0x0550:
        r4 = move-exception;
        throw r4;
    L_0x0552:
        r4 = move-exception;
        throw r4;
    L_0x0554:
        r4 = move-exception;
        throw r4;
    L_0x0556:
        r4 = move-exception;
        goto L_0x034f;
    L_0x0559:
        r4 = move-exception;
        r5 = r6;
        goto L_0x034f;
    L_0x055d:
        r4 = move-exception;
        r5 = r6;
        goto L_0x034f;
    L_0x0561:
        r4 = move-exception;
        r5 = r6;
        goto L_0x034f;
    L_0x0565:
        r4 = move-exception;
        r6 = r5;
        goto L_0x0124;
    L_0x0569:
        r4 = move-exception;
        goto L_0x0124;
    L_0x056c:
        r4 = move-exception;
        r16 = r5;
        goto L_0x0124;
    L_0x0571:
        r4 = r5;
        goto L_0x028d;
    L_0x0574:
        r6 = r4;
        r7 = r5;
        goto L_0x01c9;
    L_0x0578:
        r4 = r6;
        goto L_0x0216;
    L_0x057b:
        r4 = r5;
        goto L_0x028d;
    L_0x057e:
        r4 = r5;
        goto L_0x02f8;
    L_0x0581:
        r4 = r16;
        goto L_0x0139;
    L_0x0585:
        r7 = r6;
        r6 = r5;
        goto L_0x0405;
    L_0x0589:
        r17 = r8;
        goto L_0x03b9;
    L_0x058d:
        r4 = r16;
        goto L_0x032f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.azf.a(com.whatsapp.ael, java.io.File, int, int, boolean):boolean");
    }

    @Nullable
    public File g() {
        boolean z = l5.s;
        String externalStorageState = Environment.getExternalStorageState();
        try {
            if (App.b(externalStorageState)) {
                ArrayList h = h();
                int size = h.size() - 1;
                while (size >= 0) {
                    File file = (File) h.get(size);
                    try {
                        if (file.length() > 0) {
                            Log.i(z[3] + file.getName() + z[0] + file.length());
                            return file;
                        }
                        int i = size - 1;
                        if (z) {
                            break;
                        }
                        size = i;
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
                return null;
            }
            Log.i(z[2] + externalStorageState);
            throw new IOException(z[1]);
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public azf(Context context) {
        this.k = context;
        this.i = new HashMap();
    }

    public com.whatsapp.j3 a(boolean r12, java.lang.Object r13, @android.support.annotation.Nullable com.whatsapp.gdrive.d9 r14) {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:com.whatsapp.azf.a(boolean, java.lang.Object, com.whatsapp.gdrive.d9):com.whatsapp.j3. bs: [B:35:0x00f2, B:38:0x00f7, B:67:0x0209, B:70:0x020e, B:82:0x0225, B:85:0x022a, B:117:0x0283, B:120:0x0288]
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:86)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:57)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:281)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:161)
*/
        /*
        r11 = this;
        r2 = 0;
        r10 = 0;
        r0 = z;	 Catch:{ Exception -> 0x001f }
        r1 = 96;	 Catch:{ Exception -> 0x001f }
        r0 = r0[r1];	 Catch:{ Exception -> 0x001f }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x001f }
        r0 = com.whatsapp.App.E;	 Catch:{ Exception -> 0x001f }
        if (r0 != 0) goto L_0x0013;	 Catch:{ Exception -> 0x001f }
    L_0x000f:
        r0 = com.whatsapp.App.aX;	 Catch:{ Exception -> 0x001f }
        if (r0 == 0) goto L_0x0023;
    L_0x0013:
        r0 = z;	 Catch:{ Exception -> 0x0021 }
        r1 = 104; // 0x68 float:1.46E-43 double:5.14E-322;	 Catch:{ Exception -> 0x0021 }
        r0 = r0[r1];	 Catch:{ Exception -> 0x0021 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x0021 }
        r0 = com.whatsapp.j3.FAILED_GENERIC;	 Catch:{ Exception -> 0x0021 }
    L_0x001e:
        return r0;	 Catch:{ Exception -> 0x0021 }
    L_0x001f:
        r0 = move-exception;	 Catch:{ Exception -> 0x0021 }
        throw r0;	 Catch:{ Exception -> 0x0021 }
    L_0x0021:
        r0 = move-exception;
        throw r0;
    L_0x0023:
        r9 = new com.whatsapp.util.ab;
        r0 = z;
        r1 = 97;
        r0 = r0[r1];
        r9.<init>(r0);
        r0 = c;
        r0 = r0.getParentFile();
        r1 = r0.exists();	 Catch:{ Exception -> 0x01ec }
        if (r1 != 0) goto L_0x0049;	 Catch:{ Exception -> 0x01ec }
    L_0x003a:
        r1 = z;	 Catch:{ Exception -> 0x01ec }
        r3 = 101; // 0x65 float:1.42E-43 double:5.0E-322;	 Catch:{ Exception -> 0x01ec }
        r1 = r1[r3];	 Catch:{ Exception -> 0x01ec }
        com.whatsapp.util.Log.i(r1);	 Catch:{ Exception -> 0x01ec }
        r0.mkdirs();	 Catch:{ Exception -> 0x01ec }
        r0.mkdir();	 Catch:{ Exception -> 0x01ec }
    L_0x0049:
        r0 = f;
        r11.d(r0);
        r0 = d;
        r11.d(r0);
        r0 = a;
        r11.d(r0);
        r0 = h;
        r11.d(r0);
        r0 = m;
        r11.d(r0);
        r0 = b;
        r11.d(r0);
        r0 = e;
        r11.d(r0);
        r0 = g;
        r11.d(r0);
        r0 = c;
        r11.d(r0);
        monitor-enter(r13);
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x01ee }
        r0.<init>();	 Catch:{ Exception -> 0x01ee }
        r1 = z;	 Catch:{ Exception -> 0x01ee }
        r3 = 105; // 0x69 float:1.47E-43 double:5.2E-322;	 Catch:{ Exception -> 0x01ee }
        r1 = r1[r3];	 Catch:{ Exception -> 0x01ee }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x01ee }
        r1 = com.whatsapp.ael.X;	 Catch:{ Exception -> 0x01ee }
        r4 = r1.length();	 Catch:{ Exception -> 0x01ee }
        r0 = r0.append(r4);	 Catch:{ Exception -> 0x01ee }
        r0 = r0.toString();	 Catch:{ Exception -> 0x01ee }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x01ee }
        if (r12 == 0) goto L_0x0234;	 Catch:{ Exception -> 0x01ee }
    L_0x0099:
        r0 = com.whatsapp.util.b2.a();	 Catch:{ Exception -> 0x01ee }
        r0 = r0.b();	 Catch:{ Exception -> 0x01ee }
        if (r0 == 0) goto L_0x0234;
    L_0x00a3:
        r0 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x01f0, all -> 0x0296 }
        r0.<init>();	 Catch:{ IOException -> 0x01f0, all -> 0x0296 }
        r1 = z;	 Catch:{ IOException -> 0x01f0, all -> 0x0296 }
        r3 = 106; // 0x6a float:1.49E-43 double:5.24E-322;	 Catch:{ IOException -> 0x01f0, all -> 0x0296 }
        r1 = r1[r3];	 Catch:{ IOException -> 0x01f0, all -> 0x0296 }
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x01f0, all -> 0x0296 }
        r1 = c;	 Catch:{ IOException -> 0x01f0, all -> 0x0296 }
        r1 = r1.getName();	 Catch:{ IOException -> 0x01f0, all -> 0x0296 }
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x01f0, all -> 0x0296 }
        r0 = r0.toString();	 Catch:{ IOException -> 0x01f0, all -> 0x0296 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x01f0, all -> 0x0296 }
        r4 = new com.whatsapp.util.q;	 Catch:{ IOException -> 0x01f0, all -> 0x0296 }
        r0 = com.whatsapp.App.e;	 Catch:{ IOException -> 0x01f0, all -> 0x0296 }
        r1 = c;	 Catch:{ IOException -> 0x01f0, all -> 0x0296 }
        r4.<init>(r0, r1);	 Catch:{ IOException -> 0x01f0, all -> 0x0296 }
        r1 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x02a1, all -> 0x0299 }
        r0 = com.whatsapp.ael.X;	 Catch:{ IOException -> 0x02a1, all -> 0x0299 }
        r1.<init>(r0);	 Catch:{ IOException -> 0x02a1, all -> 0x0299 }
        r7 = com.whatsapp.ve.f();	 Catch:{ Exception -> 0x0217 }
        com.whatsapp.ve.a(r4, r7);	 Catch:{ IOException -> 0x02a6, all -> 0x029b }
        r0 = com.whatsapp.util.b2.a();	 Catch:{ IOException -> 0x02a6, all -> 0x029b }
        r2 = com.whatsapp.ael.X;	 Catch:{ IOException -> 0x02a6, all -> 0x029b }
        r2 = r2.length();	 Catch:{ IOException -> 0x02a6, all -> 0x029b }
        r5 = com.whatsapp.util.z.CRYPT9;	 Catch:{ IOException -> 0x02a6, all -> 0x029b }
        r6 = r7.a;	 Catch:{ IOException -> 0x02a6, all -> 0x029b }
        r7 = r7.c;	 Catch:{ IOException -> 0x02a6, all -> 0x029b }
        r7 = r7.d;	 Catch:{ IOException -> 0x02a6, all -> 0x029b }
        r8 = r14;	 Catch:{ IOException -> 0x02a6, all -> 0x029b }
        r0.a(r1, r2, r4, r5, r6, r7, r8);	 Catch:{ IOException -> 0x02a6, all -> 0x029b }
    L_0x00f0:
        if (r1 == 0) goto L_0x00f5;
    L_0x00f2:
        r1.close();	 Catch:{ Exception -> 0x0275 }
    L_0x00f5:
        if (r4 == 0) goto L_0x00fa;
    L_0x00f7:
        r4.close();	 Catch:{ Exception -> 0x0277 }
    L_0x00fa:
        monitor-exit(r13);	 Catch:{ all -> 0x0214 }
        r0 = f;	 Catch:{ Exception -> 0x0290 }
        r1 = 7;	 Catch:{ Exception -> 0x0290 }
        r2 = "";	 Catch:{ Exception -> 0x0290 }
        r3 = 0;	 Catch:{ Exception -> 0x0290 }
        com.whatsapp.util.ak.a(r0, r1, r2, r3);	 Catch:{ Exception -> 0x0290 }
        r0 = d;	 Catch:{ Exception -> 0x0290 }
        r1 = 7;	 Catch:{ Exception -> 0x0290 }
        r2 = "";	 Catch:{ Exception -> 0x0290 }
        r3 = 0;	 Catch:{ Exception -> 0x0290 }
        com.whatsapp.util.ak.a(r0, r1, r2, r3);	 Catch:{ Exception -> 0x0290 }
        r0 = a;	 Catch:{ Exception -> 0x0290 }
        r1 = 7;	 Catch:{ Exception -> 0x0290 }
        r2 = "";	 Catch:{ Exception -> 0x0290 }
        r3 = 0;	 Catch:{ Exception -> 0x0290 }
        com.whatsapp.util.ak.a(r0, r1, r2, r3);	 Catch:{ Exception -> 0x0290 }
        r0 = h;	 Catch:{ Exception -> 0x0290 }
        r1 = 7;	 Catch:{ Exception -> 0x0290 }
        r2 = "";	 Catch:{ Exception -> 0x0290 }
        r3 = 0;	 Catch:{ Exception -> 0x0290 }
        com.whatsapp.util.ak.a(r0, r1, r2, r3);	 Catch:{ Exception -> 0x0290 }
        r0 = m;	 Catch:{ Exception -> 0x0290 }
        r1 = 7;	 Catch:{ Exception -> 0x0290 }
        r2 = "";	 Catch:{ Exception -> 0x0290 }
        r3 = 0;	 Catch:{ Exception -> 0x0290 }
        com.whatsapp.util.ak.a(r0, r1, r2, r3);	 Catch:{ Exception -> 0x0290 }
        r0 = b;	 Catch:{ Exception -> 0x0290 }
        r1 = 7;	 Catch:{ Exception -> 0x0290 }
        r2 = "";	 Catch:{ Exception -> 0x0290 }
        r3 = 0;	 Catch:{ Exception -> 0x0290 }
        com.whatsapp.util.ak.a(r0, r1, r2, r3);	 Catch:{ Exception -> 0x0290 }
        r0 = e;	 Catch:{ Exception -> 0x0290 }
        r1 = 7;	 Catch:{ Exception -> 0x0290 }
        r2 = "";	 Catch:{ Exception -> 0x0290 }
        r3 = 0;	 Catch:{ Exception -> 0x0290 }
        com.whatsapp.util.ak.a(r0, r1, r2, r3);	 Catch:{ Exception -> 0x0290 }
        r0 = g;	 Catch:{ Exception -> 0x0290 }
        r1 = 7;	 Catch:{ Exception -> 0x0290 }
        r2 = "";	 Catch:{ Exception -> 0x0290 }
        r3 = 0;	 Catch:{ Exception -> 0x0290 }
        com.whatsapp.util.ak.a(r0, r1, r2, r3);	 Catch:{ Exception -> 0x0290 }
        r0 = c;	 Catch:{ Exception -> 0x0290 }
        r1 = 7;	 Catch:{ Exception -> 0x0290 }
        r2 = "";	 Catch:{ Exception -> 0x0290 }
        r3 = 0;	 Catch:{ Exception -> 0x0290 }
        com.whatsapp.util.ak.a(r0, r1, r2, r3);	 Catch:{ Exception -> 0x0290 }
        r0 = l;	 Catch:{ Exception -> 0x0290 }
        r1 = 7;	 Catch:{ Exception -> 0x0290 }
        r2 = "";	 Catch:{ Exception -> 0x0290 }
        r3 = 0;	 Catch:{ Exception -> 0x0290 }
        com.whatsapp.util.ak.a(r0, r1, r2, r3);	 Catch:{ Exception -> 0x0290 }
        r0 = com.whatsapp.util.b2.a();	 Catch:{ Exception -> 0x0290 }
        r0 = r0.b();	 Catch:{ Exception -> 0x0290 }
        if (r0 == 0) goto L_0x01a3;
    L_0x0169:
        r0 = l;	 Catch:{ Exception -> 0x0292 }
        r0 = r0.exists();	 Catch:{ Exception -> 0x0292 }
        if (r0 == 0) goto L_0x01a3;
    L_0x0171:
        r0 = java.lang.System.currentTimeMillis();	 Catch:{ Exception -> 0x0294 }
        r2 = l;	 Catch:{ Exception -> 0x0294 }
        r2 = r2.lastModified();	 Catch:{ Exception -> 0x0294 }
        r0 = r0 - r2;	 Catch:{ Exception -> 0x0294 }
        r2 = 604800000; // 0x240c8400 float:3.046947E-17 double:2.988109026E-315;	 Catch:{ Exception -> 0x0294 }
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));	 Catch:{ Exception -> 0x0294 }
        if (r0 <= 0) goto L_0x01a3;	 Catch:{ Exception -> 0x0294 }
    L_0x0183:
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0294 }
        r0.<init>();	 Catch:{ Exception -> 0x0294 }
        r1 = z;	 Catch:{ Exception -> 0x0294 }
        r2 = 95;	 Catch:{ Exception -> 0x0294 }
        r1 = r1[r2];	 Catch:{ Exception -> 0x0294 }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x0294 }
        r1 = l;	 Catch:{ Exception -> 0x0294 }
        r1 = r1.delete();	 Catch:{ Exception -> 0x0294 }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x0294 }
        r0 = r0.toString();	 Catch:{ Exception -> 0x0294 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x0294 }
    L_0x01a3:
        r0 = java.util.Locale.ENGLISH;
        r1 = z;
        r2 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r1 = r1[r2];
        r2 = 1;
        r2 = new java.lang.Object[r2];
        r4 = r9.b();
        r4 = (double) r4;
        r6 = 4652007308841189376; // 0x408f400000000000 float:0.0 double:1000.0;
        r4 = r4 / r6;
        r3 = java.lang.Double.valueOf(r4);
        r2[r10] = r3;
        r0 = java.lang.String.format(r0, r1, r2);
        com.whatsapp.App.v(r0);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 100;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r2 = r9.b();
        r1 = java.lang.Long.valueOf(r2);
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = com.whatsapp.j3.SUCCESS;
        goto L_0x001e;
    L_0x01ec:
        r0 = move-exception;
        throw r0;
    L_0x01ee:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01f0, all -> 0x0296 }
    L_0x01f0:
        r0 = move-exception;
        r1 = r2;
    L_0x01f2:
        r4 = com.whatsapp.App.T();	 Catch:{ all -> 0x027e }
        r6 = 0;	 Catch:{ all -> 0x027e }
        r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));	 Catch:{ all -> 0x027e }
        if (r3 != 0) goto L_0x027d;	 Catch:{ all -> 0x027e }
    L_0x01fc:
        r0 = z;	 Catch:{ all -> 0x027e }
        r3 = 98;	 Catch:{ all -> 0x027e }
        r0 = r0[r3];	 Catch:{ all -> 0x027e }
        com.whatsapp.util.Log.w(r0);	 Catch:{ all -> 0x027e }
        r0 = com.whatsapp.j3.FAILED_OUT_OF_SPACE;	 Catch:{ all -> 0x027e }
        if (r1 == 0) goto L_0x020c;
    L_0x0209:
        r1.close();	 Catch:{ Exception -> 0x0279 }
    L_0x020c:
        if (r2 == 0) goto L_0x0211;
    L_0x020e:
        r2.close();	 Catch:{ Exception -> 0x027b }
    L_0x0211:
        monitor-exit(r13);	 Catch:{ all -> 0x0214 }
        goto L_0x001e;	 Catch:{ all -> 0x0214 }
    L_0x0214:
        r0 = move-exception;	 Catch:{ all -> 0x0214 }
        monitor-exit(r13);	 Catch:{ all -> 0x0214 }
        throw r0;
    L_0x0217:
        r0 = move-exception;
        r2 = z;	 Catch:{ IOException -> 0x02a6, all -> 0x029b }
        r3 = 99;	 Catch:{ IOException -> 0x02a6, all -> 0x029b }
        r2 = r2[r3];	 Catch:{ IOException -> 0x02a6, all -> 0x029b }
        com.whatsapp.util.Log.c(r2, r0);	 Catch:{ IOException -> 0x02a6, all -> 0x029b }
        r0 = com.whatsapp.j3.FAILED_GENERIC;	 Catch:{ IOException -> 0x02a6, all -> 0x029b }
        if (r1 == 0) goto L_0x0228;
    L_0x0225:
        r1.close();	 Catch:{ Exception -> 0x0230 }
    L_0x0228:
        if (r4 == 0) goto L_0x022d;
    L_0x022a:
        r4.close();	 Catch:{ Exception -> 0x0232 }
    L_0x022d:
        monitor-exit(r13);	 Catch:{ all -> 0x0214 }
        goto L_0x001e;	 Catch:{ all -> 0x0214 }
    L_0x0230:
        r0 = move-exception;	 Catch:{ all -> 0x0214 }
        throw r0;	 Catch:{ all -> 0x0214 }
    L_0x0232:
        r0 = move-exception;	 Catch:{ all -> 0x0214 }
        throw r0;	 Catch:{ all -> 0x0214 }
    L_0x0234:
        r0 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x01f0, all -> 0x0296 }
        r0.<init>();	 Catch:{ IOException -> 0x01f0, all -> 0x0296 }
        r1 = z;	 Catch:{ IOException -> 0x01f0, all -> 0x0296 }
        r3 = 102; // 0x66 float:1.43E-43 double:5.04E-322;	 Catch:{ IOException -> 0x01f0, all -> 0x0296 }
        r1 = r1[r3];	 Catch:{ IOException -> 0x01f0, all -> 0x0296 }
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x01f0, all -> 0x0296 }
        r1 = l;	 Catch:{ IOException -> 0x01f0, all -> 0x0296 }
        r1 = r1.getName();	 Catch:{ IOException -> 0x01f0, all -> 0x0296 }
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x01f0, all -> 0x0296 }
        r0 = r0.toString();	 Catch:{ IOException -> 0x01f0, all -> 0x0296 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x01f0, all -> 0x0296 }
        r4 = new com.whatsapp.util.q;	 Catch:{ IOException -> 0x01f0, all -> 0x0296 }
        r0 = com.whatsapp.App.e;	 Catch:{ IOException -> 0x01f0, all -> 0x0296 }
        r1 = l;	 Catch:{ IOException -> 0x01f0, all -> 0x0296 }
        r4.<init>(r0, r1);	 Catch:{ IOException -> 0x01f0, all -> 0x0296 }
        r1 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x02aa, all -> 0x0299 }
        r0 = com.whatsapp.ael.X;	 Catch:{ IOException -> 0x02aa, all -> 0x0299 }
        r1.<init>(r0);	 Catch:{ IOException -> 0x02aa, all -> 0x0299 }
        r0 = r1.getChannel();	 Catch:{ IOException -> 0x0271, all -> 0x029e }
        r2 = java.nio.channels.Channels.newChannel(r4);	 Catch:{ IOException -> 0x0271, all -> 0x029e }
        com.whatsapp.util.ak.a(r0, r2);	 Catch:{ IOException -> 0x0271, all -> 0x029e }
        goto L_0x00f0;
    L_0x0271:
        r0 = move-exception;
        r2 = r4;
        goto L_0x01f2;
    L_0x0275:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0214 }
    L_0x0277:
        r0 = move-exception;	 Catch:{ all -> 0x0214 }
        throw r0;	 Catch:{ all -> 0x0214 }
    L_0x0279:
        r0 = move-exception;	 Catch:{ all -> 0x0214 }
        throw r0;	 Catch:{ all -> 0x0214 }
    L_0x027b:
        r0 = move-exception;	 Catch:{ all -> 0x0214 }
        throw r0;	 Catch:{ all -> 0x0214 }
    L_0x027d:
        throw r0;	 Catch:{ all -> 0x027e }
    L_0x027e:
        r0 = move-exception;
        r4 = r2;
        r2 = r1;
    L_0x0281:
        if (r2 == 0) goto L_0x0286;
    L_0x0283:
        r2.close();	 Catch:{ Exception -> 0x028c }
    L_0x0286:
        if (r4 == 0) goto L_0x028b;
    L_0x0288:
        r4.close();	 Catch:{ Exception -> 0x028e }
    L_0x028b:
        throw r0;	 Catch:{ all -> 0x0214 }
    L_0x028c:
        r0 = move-exception;	 Catch:{ all -> 0x0214 }
        throw r0;	 Catch:{ all -> 0x0214 }
    L_0x028e:
        r0 = move-exception;	 Catch:{ all -> 0x0214 }
        throw r0;	 Catch:{ all -> 0x0214 }
    L_0x0290:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0292 }
    L_0x0292:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0294 }
    L_0x0294:
        r0 = move-exception;
        throw r0;
    L_0x0296:
        r0 = move-exception;
        r4 = r2;
        goto L_0x0281;
    L_0x0299:
        r0 = move-exception;
        goto L_0x0281;
    L_0x029b:
        r0 = move-exception;
        r2 = r1;
        goto L_0x0281;
    L_0x029e:
        r0 = move-exception;
        r2 = r1;
        goto L_0x0281;
    L_0x02a1:
        r0 = move-exception;
        r1 = r2;
        r2 = r4;
        goto L_0x01f2;
    L_0x02a6:
        r0 = move-exception;
        r2 = r4;
        goto L_0x01f2;
    L_0x02aa:
        r0 = move-exception;
        r1 = r2;
        r2 = r4;
        goto L_0x01f2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.azf.a(boolean, java.lang.Object, com.whatsapp.gdrive.d9):com.whatsapp.j3");
    }

    private static boolean a(@NonNull File file) {
        boolean z = l5.s;
        File file2 = new File(file.getAbsolutePath() + z[200]);
        try {
            if (file2.exists()) {
                Log.i(z[204] + file2);
                if (!file2.delete()) {
                    Log.w(z[206] + file2);
                    return false;
                }
            }
            BufferedReader c = c(file);
            BufferedWriter f = f(file2);
            String readLine = c.readLine();
            while (readLine != null) {
                String readLine2 = c.readLine();
                if (readLine2 == null) {
                    try {
                        if (readLine.toUpperCase().contains(z[198])) {
                            Log.i(z[203] + readLine);
                            readLine = readLine.toUpperCase().replace(z[205], z[202]);
                        }
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
                if (readLine.toUpperCase().startsWith(z[201])) {
                    Log.i(z[199] + readLine);
                    readLine = "";
                }
                f.write(readLine);
                f.write("\n");
                if (!z) {
                    readLine = readLine2;
                }
            }
            try {
                boolean z2;
                break;
                c.close();
                f.close();
                if (file.delete()) {
                    if (file2.renameTo(file)) {
                        z2 = true;
                        return z2;
                    }
                }
                z2 = false;
                return z2;
            } catch (IllegalStateException e2) {
                throw e2;
            } catch (IllegalStateException e22) {
                throw e22;
            }
        } catch (IllegalStateException e222) {
            throw e222;
        } catch (IllegalStateException e2222) {
            throw e2222;
        }
    }

    private static boolean b(@NonNull File file) {
        boolean z = l5.s;
        File file2 = new File(file.getAbsolutePath() + z[84]);
        try {
            if (file2.exists()) {
                Log.i(z[90] + file2);
                if (!file2.delete()) {
                    Log.w(z[85] + file2);
                    return false;
                }
            }
            Log.i(z[86] + file.getAbsolutePath());
            BufferedReader c = c(file);
            BufferedWriter f = f(file2);
            String readLine = c.readLine();
            boolean z2 = true;
            while (readLine != null) {
                String str;
                boolean z3;
                String readLine2 = c.readLine();
                if (readLine2 == null) {
                    try {
                        if (readLine.toUpperCase().contains(z[87])) {
                            Log.i(z[92] + readLine);
                            readLine = readLine.toUpperCase().replace(z[93], z[94]);
                        }
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
                if (readLine.toUpperCase().startsWith(z[88])) {
                    Log.i(z[89] + readLine);
                    readLine = "";
                }
                if (z2) {
                    try {
                        if (readLine.toUpperCase().startsWith(z[83])) {
                            Log.i(z[91] + readLine);
                            readLine = "";
                        }
                        str = readLine;
                        z3 = false;
                    } catch (IllegalStateException e2) {
                        throw e2;
                    }
                }
                boolean z4 = z2;
                str = readLine;
                z3 = z4;
                if (str.toUpperCase().startsWith(z[82])) {
                    Log.i(z[81] + str);
                    str = "";
                }
                f.write(str);
                f.write("\n");
                if (!z) {
                    z2 = z3;
                    readLine = readLine2;
                }
            }
            try {
                break;
                c.close();
                f.close();
                if (!file.delete()) {
                    return false;
                }
                if (file2.renameTo(file)) {
                    return true;
                }
                return false;
            } catch (IllegalStateException e22) {
                throw e22;
            } catch (IllegalStateException e222) {
                throw e222;
            }
        } catch (IllegalStateException e2222) {
            throw e2222;
        } catch (IllegalStateException e22222) {
            throw e22222;
        }
    }

    public void d() {
        ak.a(f, -1, "", false);
        ak.a(d, -1, "", false);
        ak.a(a, -1, "", false);
        ak.a(h, -1, "", false);
        ak.a(m, -1, "", false);
        ak.a(b, -1, "", false);
        ak.a(e, -1, "", false);
        ak.a(g, -1, "", false);
        ak.a(c, -1, "", false);
        ak.a(l, -1, "", false);
    }

    private ArrayList h() {
        return a(false);
    }

    public int a(Runnable runnable) {
        boolean z = l5.s;
        ArrayList a = ak.a(l, 7, new String[]{z[176]});
        a.addAll(ak.a(l, -1, new String[]{z[175]}));
        a.addAll(ak.a(l, -1, new String[]{z[174]}));
        a.addAll(ak.a(l, -1, new String[]{z[177]}));
        HashSet hashSet = new HashSet();
        Iterator it = a.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            aae b = ve.b(file);
            if (b != null) {
                try {
                    hashSet.add(new dc(b.e, b.a, ve.a(b.b, b.c, file.getName().endsWith(z[171]))));
                    if (!z) {
                        continue;
                        if (z) {
                            break;
                        }
                    }
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
            Log.i(z[172]);
            continue;
            if (z) {
                break;
            }
        }
        int size = hashSet.size();
        Log.i(z[173] + size + z[178] + a.size() + ")");
        this.i.clear();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            dc dcVar = (dc) it2.next();
            App.a(dc.b(dcVar), dc.a(dcVar), dc.c(dcVar), new uc(this, size, runnable));
            if (z) {
                break;
            }
        }
        return size;
    }

    private void d(File file) {
        try {
            if (file.exists()) {
                if (System.currentTimeMillis() - file.lastModified() >= 604800000) {
                    try {
                        Log.i(z[207] + new Date(file.lastModified()));
                        Log.i(z[208] + file.getName() + " " + file.delete());
                        if (!l5.s) {
                            return;
                        }
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
                ak.b(file, "");
            }
        } catch (IllegalStateException e2) {
            throw e2;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(com.whatsapp.ael r22, int r23) {
        /*
        r21 = this;
        r17 = com.whatsapp.l5.s;
        r4 = 0;
        r2 = 1;
        r0 = r21;
        r18 = r0.a(r2);
        r3 = -1;
        r2 = r18.size();
        if (r2 <= 0) goto L_0x01a7;
    L_0x0011:
        r5 = r18.iterator();
    L_0x0015:
        r2 = r5.hasNext();
        if (r2 == 0) goto L_0x005a;
    L_0x001b:
        r2 = r5.next();
        r2 = (java.io.File) r2;
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r7 = z;
        r8 = 163; // 0xa3 float:2.28E-43 double:8.05E-322;
        r7 = r7[r8];
        r6 = r6.append(r7);
        r7 = r2.getName();
        r6 = r6.append(r7);
        r7 = z;
        r8 = 156; // 0x9c float:2.19E-43 double:7.7E-322;
        r7 = r7[r8];
        r6 = r6.append(r7);
        r8 = r2.length();
        r2 = r6.append(r8);
        r6 = ")";
        r2 = r2.append(r6);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        if (r17 == 0) goto L_0x0015;
    L_0x005a:
        r2 = com.whatsapp.ael.X;
        r5 = r2.getParentFile();
        r6 = r5.exists();	 Catch:{ IllegalStateException -> 0x0177 }
        if (r6 != 0) goto L_0x006b;
    L_0x0066:
        r5.mkdirs();	 Catch:{ IllegalStateException -> 0x0179 }
        if (r17 == 0) goto L_0x006e;
    L_0x006b:
        r2.delete();	 Catch:{ IllegalStateException -> 0x0179 }
    L_0x006e:
        r5 = 0;
        r2 = r18.size();
        r2 = r2 * 2;
        r6 = r23 / r2;
        r2 = 2;
        r0 = new boolean[r2];
        r19 = r0;
        r19 = {1, 0};
        r0 = r19;
        r0 = r0.length;
        r20 = r0;
        r2 = 0;
        r16 = r2;
    L_0x0087:
        r0 = r16;
        r1 = r20;
        if (r0 >= r1) goto L_0x01a4;
    L_0x008d:
        r7 = r19[r16];
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x017b }
        r2.<init>();	 Catch:{ IllegalStateException -> 0x017b }
        r8 = z;	 Catch:{ IllegalStateException -> 0x017b }
        r9 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        r8 = r8[r9];	 Catch:{ IllegalStateException -> 0x017b }
        r8 = r2.append(r8);	 Catch:{ IllegalStateException -> 0x017b }
        if (r7 == 0) goto L_0x017d;
    L_0x00a0:
        r2 = z;	 Catch:{ IllegalStateException -> 0x017b }
        r9 = 164; // 0xa4 float:2.3E-43 double:8.1E-322;
        r2 = r2[r9];	 Catch:{ IllegalStateException -> 0x017b }
    L_0x00a6:
        r2 = r8.append(r2);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r2 = r18.size();
        r8 = r2 + -1;
        r9 = r3;
        r10 = r4;
    L_0x00b9:
        if (r8 < 0) goto L_0x01a1;
    L_0x00bb:
        if (r10 != 0) goto L_0x01a1;
    L_0x00bd:
        r0 = r18;
        r4 = r0.get(r8);
        r4 = (java.io.File) r4;
        r2 = r21;
        r3 = r22;
        r2 = r2.a(r3, r4, r5, r6, r7);
        if (r2 == 0) goto L_0x019d;
    L_0x00cf:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r9 = 158; // 0x9e float:2.21E-43 double:7.8E-322;
        r3 = r3[r9];
        r2 = r2.append(r3);
        r3 = r4.getName();
        r2 = r2.append(r3);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r2 = 1;
        if (r17 == 0) goto L_0x019a;
    L_0x00f0:
        r3 = r2;
        r2 = r8;
    L_0x00f2:
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r10 = z;
        r11 = 162; // 0xa2 float:2.27E-43 double:8.0E-322;
        r10 = r10[r11];
        r9 = r9.append(r10);
        r4 = r4.getName();
        r4 = r9.append(r4);
        r4 = r4.toString();
        com.whatsapp.util.Log.w(r4);
        r14 = r5 + r6;
        r0 = r21;
        r9 = r0.n;
        r10 = 0;
        r12 = 1;
        r15 = 0;
        r9.a(r10, r12, r14, r15);
        r8 = r8 + -1;
        if (r17 == 0) goto L_0x0195;
    L_0x0122:
        r5 = r14;
    L_0x0123:
        r4 = r16 + 1;
        if (r17 == 0) goto L_0x018f;
    L_0x0127:
        if (r3 != 0) goto L_0x0135;
    L_0x0129:
        r4 = z;	 Catch:{ IllegalStateException -> 0x0185 }
        r5 = 159; // 0x9f float:2.23E-43 double:7.86E-322;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x0185 }
        com.whatsapp.util.Log.i(r4);	 Catch:{ IllegalStateException -> 0x0185 }
        r22.r();	 Catch:{ IllegalStateException -> 0x0185 }
    L_0x0135:
        if (r17 == 0) goto L_0x0140;
    L_0x0137:
        r4 = z;	 Catch:{ IllegalStateException -> 0x0187 }
        r5 = 157; // 0x9d float:2.2E-43 double:7.76E-322;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x0187 }
        com.whatsapp.util.Log.i(r4);	 Catch:{ IllegalStateException -> 0x0187 }
    L_0x0140:
        r4 = com.whatsapp.App.z();	 Catch:{ IllegalStateException -> 0x0189 }
        r5 = com.whatsapp.fieldstats.bn.DATABASE_RESTORE_SUCCEEDED_EVENTUALLY;	 Catch:{ IllegalStateException -> 0x0189 }
        r6 = java.lang.Boolean.valueOf(r3);	 Catch:{ IllegalStateException -> 0x0189 }
        com.whatsapp.fieldstats.i.a(r4, r5, r6);	 Catch:{ IllegalStateException -> 0x0189 }
        r4 = com.whatsapp.App.z();	 Catch:{ IllegalStateException -> 0x0189 }
        r5 = com.whatsapp.fieldstats.bn.ANDROID_IS_SD_CARD_REMOVABLE;	 Catch:{ IllegalStateException -> 0x0189 }
        r6 = com.whatsapp.App.V();	 Catch:{ IllegalStateException -> 0x0189 }
        r6 = java.lang.Boolean.valueOf(r6);	 Catch:{ IllegalStateException -> 0x0189 }
        com.whatsapp.fieldstats.i.a(r4, r5, r6);	 Catch:{ IllegalStateException -> 0x0189 }
        r4 = com.whatsapp.App.z();	 Catch:{ IllegalStateException -> 0x0189 }
        r5 = com.whatsapp.fieldstats.bn.DATABASE_RESTORE_SUCCEEDED_ON_FIRST_BACKUP_FILE;	 Catch:{ IllegalStateException -> 0x0189 }
        if (r3 == 0) goto L_0x018d;
    L_0x0166:
        r6 = r18.size();	 Catch:{ IllegalStateException -> 0x018b }
        r6 = r6 + -1;
        if (r2 != r6) goto L_0x018d;
    L_0x016e:
        r2 = 1;
    L_0x016f:
        r2 = java.lang.Boolean.valueOf(r2);
        com.whatsapp.fieldstats.i.a(r4, r5, r2);
        return r3;
    L_0x0177:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0179 }
    L_0x0179:
        r2 = move-exception;
        throw r2;
    L_0x017b:
        r2 = move-exception;
        throw r2;
    L_0x017d:
        r2 = z;
        r9 = 161; // 0xa1 float:2.26E-43 double:7.95E-322;
        r2 = r2[r9];
        goto L_0x00a6;
    L_0x0185:
        r2 = move-exception;
        throw r2;
    L_0x0187:
        r2 = move-exception;
        throw r2;
    L_0x0189:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x018b }
    L_0x018b:
        r2 = move-exception;
        throw r2;
    L_0x018d:
        r2 = 0;
        goto L_0x016f;
    L_0x018f:
        r16 = r4;
        r4 = r3;
        r3 = r2;
        goto L_0x0087;
    L_0x0195:
        r5 = r14;
        r9 = r2;
        r10 = r3;
        goto L_0x00b9;
    L_0x019a:
        r3 = r2;
        r2 = r8;
        goto L_0x0123;
    L_0x019d:
        r2 = r9;
        r3 = r10;
        goto L_0x00f2;
    L_0x01a1:
        r2 = r9;
        r3 = r10;
        goto L_0x0123;
    L_0x01a4:
        r2 = r3;
        r3 = r4;
        goto L_0x0127;
    L_0x01a7:
        r2 = r3;
        r3 = r4;
        goto L_0x0137;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.azf.a(com.whatsapp.ael, int):boolean");
    }

    private ArrayList a(boolean z) {
        if (z) {
            ArrayList a = ak.a(l, -1, new String[]{z[193], z[180], z[191]});
            a.addAll(ak.a(l, 7, new String[]{z[181], z[196], z[187], z[185], z[190], z[192]}));
            return ak.a(a);
        }
        return ak.a(l, 7, new String[]{z[188], z[194], z[197], z[184], z[182], z[195], z[189], z[183], z[186]});
    }

    @NonNull
    private static BufferedReader c(@NonNull File file) {
        return new BufferedReader(new InputStreamReader(new FileInputStream(file), z[115]));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e(java.io.File r20) {
        /*
        r19 = this;
        r5 = com.whatsapp.l5.s;
        r2 = z;	 Catch:{ UnsatisfiedLinkError -> 0x00f8 }
        r3 = 68;
        r2 = r2[r3];	 Catch:{ UnsatisfiedLinkError -> 0x00f8 }
        java.lang.System.loadLibrary(r2);	 Catch:{ UnsatisfiedLinkError -> 0x00f8 }
        r6 = new java.io.File;
        r2 = com.whatsapp.App.z();
        r2 = r2.getFilesDir();
        r3 = z;
        r4 = 28;
        r3 = r3[r4];
        r6.<init>(r2, r3);
        r7 = new java.io.File;
        r2 = com.whatsapp.App.z();
        r2 = r2.getFilesDir();
        r3 = z;
        r4 = 19;
        r3 = r3[r4];
        r7.<init>(r2, r3);
        r8 = new java.io.File;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = r20.getAbsolutePath();
        r2 = r2.append(r3);
        r3 = z;
        r4 = 22;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.toString();
        r8.<init>(r2);
        r3 = 0;
        r2 = r8.exists();	 Catch:{ UnsatisfiedLinkError -> 0x0104 }
        if (r2 == 0) goto L_0x0078;
    L_0x0058:
        r2 = r8.delete();	 Catch:{ UnsatisfiedLinkError -> 0x0104 }
        if (r2 != 0) goto L_0x0078;
    L_0x005e:
        r2 = new java.lang.StringBuilder;	 Catch:{ UnsatisfiedLinkError -> 0x0106 }
        r2.<init>();	 Catch:{ UnsatisfiedLinkError -> 0x0106 }
        r4 = z;	 Catch:{ UnsatisfiedLinkError -> 0x0106 }
        r9 = 23;
        r4 = r4[r9];	 Catch:{ UnsatisfiedLinkError -> 0x0106 }
        r2 = r2.append(r4);	 Catch:{ UnsatisfiedLinkError -> 0x0106 }
        r2 = r2.append(r8);	 Catch:{ UnsatisfiedLinkError -> 0x0106 }
        r2 = r2.toString();	 Catch:{ UnsatisfiedLinkError -> 0x0106 }
        com.whatsapp.util.Log.w(r2);	 Catch:{ UnsatisfiedLinkError -> 0x0106 }
    L_0x0078:
        r2 = r20.exists();	 Catch:{ Exception -> 0x0285 }
        if (r2 != 0) goto L_0x0112;
    L_0x007e:
        r2 = z;	 Catch:{ Exception -> 0x0285 }
        r4 = 51;
        r2 = r2[r4];	 Catch:{ Exception -> 0x0285 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ Exception -> 0x0285 }
        r2 = 0;
        r3 = com.whatsapp.App.am;	 Catch:{ UnsatisfiedLinkError -> 0x0108 }
        r4 = 3;
        if (r3 != r4) goto L_0x008d;
    L_0x008d:
        r3 = r6.delete();	 Catch:{ UnsatisfiedLinkError -> 0x010a }
        if (r3 != 0) goto L_0x00ad;
    L_0x0093:
        r3 = new java.lang.StringBuilder;	 Catch:{ UnsatisfiedLinkError -> 0x010c }
        r3.<init>();	 Catch:{ UnsatisfiedLinkError -> 0x010c }
        r4 = z;	 Catch:{ UnsatisfiedLinkError -> 0x010c }
        r8 = 54;
        r4 = r4[r8];	 Catch:{ UnsatisfiedLinkError -> 0x010c }
        r3 = r3.append(r4);	 Catch:{ UnsatisfiedLinkError -> 0x010c }
        r3 = r3.append(r6);	 Catch:{ UnsatisfiedLinkError -> 0x010c }
        r3 = r3.toString();	 Catch:{ UnsatisfiedLinkError -> 0x010c }
        com.whatsapp.util.Log.w(r3);	 Catch:{ UnsatisfiedLinkError -> 0x010c }
    L_0x00ad:
        r3 = r7.delete();	 Catch:{ UnsatisfiedLinkError -> 0x010e }
        if (r3 != 0) goto L_0x00f7;
    L_0x00b3:
        r3 = new java.lang.StringBuilder;	 Catch:{ UnsatisfiedLinkError -> 0x010e }
        r3.<init>();	 Catch:{ UnsatisfiedLinkError -> 0x010e }
        r4 = z;	 Catch:{ UnsatisfiedLinkError -> 0x010e }
        r8 = 41;
        r4 = r4[r8];	 Catch:{ UnsatisfiedLinkError -> 0x010e }
        r3 = r3.append(r4);	 Catch:{ UnsatisfiedLinkError -> 0x010e }
        r3 = r3.append(r7);	 Catch:{ UnsatisfiedLinkError -> 0x010e }
        r3 = r3.toString();	 Catch:{ UnsatisfiedLinkError -> 0x010e }
        com.whatsapp.util.Log.w(r3);	 Catch:{ UnsatisfiedLinkError -> 0x010e }
        if (r5 == 0) goto L_0x00f7;
    L_0x00cf:
        r3 = new java.lang.StringBuilder;	 Catch:{ UnsatisfiedLinkError -> 0x0110 }
        r3.<init>();	 Catch:{ UnsatisfiedLinkError -> 0x0110 }
        r4 = z;	 Catch:{ UnsatisfiedLinkError -> 0x0110 }
        r5 = 10;
        r4 = r4[r5];	 Catch:{ UnsatisfiedLinkError -> 0x0110 }
        r3 = r3.append(r4);	 Catch:{ UnsatisfiedLinkError -> 0x0110 }
        r3 = r3.append(r6);	 Catch:{ UnsatisfiedLinkError -> 0x0110 }
        r4 = z;	 Catch:{ UnsatisfiedLinkError -> 0x0110 }
        r5 = 73;
        r4 = r4[r5];	 Catch:{ UnsatisfiedLinkError -> 0x0110 }
        r3 = r3.append(r4);	 Catch:{ UnsatisfiedLinkError -> 0x0110 }
        r3 = r3.append(r7);	 Catch:{ UnsatisfiedLinkError -> 0x0110 }
        r3 = r3.toString();	 Catch:{ UnsatisfiedLinkError -> 0x0110 }
        com.whatsapp.util.Log.i(r3);	 Catch:{ UnsatisfiedLinkError -> 0x0110 }
    L_0x00f7:
        return r2;
    L_0x00f8:
        r2 = move-exception;
        r2 = z;
        r3 = 44;
        r2 = r2[r3];
        com.whatsapp.util.Log.e(r2);
        r2 = 0;
        goto L_0x00f7;
    L_0x0104:
        r2 = move-exception;
        throw r2;	 Catch:{ UnsatisfiedLinkError -> 0x0106 }
    L_0x0106:
        r2 = move-exception;
        throw r2;
    L_0x0108:
        r2 = move-exception;
        throw r2;	 Catch:{ UnsatisfiedLinkError -> 0x010a }
    L_0x010a:
        r2 = move-exception;
        throw r2;	 Catch:{ UnsatisfiedLinkError -> 0x010c }
    L_0x010c:
        r2 = move-exception;
        throw r2;
    L_0x010e:
        r2 = move-exception;
        throw r2;	 Catch:{ UnsatisfiedLinkError -> 0x0110 }
    L_0x0110:
        r2 = move-exception;
        throw r2;
    L_0x0112:
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ UnsatisfiedLinkError -> 0x0283 }
        r4 = 9;
        if (r2 < r4) goto L_0x0124;
    L_0x0118:
        r10 = 2;
        r12 = r20.length();	 Catch:{ UnsatisfiedLinkError -> 0x0283 }
        r10 = r10 * r12;
        r0 = r19;
        r0.a(r10);	 Catch:{ UnsatisfiedLinkError -> 0x0283 }
    L_0x0124:
        r2 = r6.exists();	 Catch:{ UnsatisfiedLinkError -> 0x031a }
        if (r2 == 0) goto L_0x014a;
    L_0x012a:
        r2 = r6.delete();	 Catch:{ UnsatisfiedLinkError -> 0x031a }
        if (r2 != 0) goto L_0x014a;
    L_0x0130:
        r2 = new java.lang.StringBuilder;	 Catch:{ UnsatisfiedLinkError -> 0x031c }
        r2.<init>();	 Catch:{ UnsatisfiedLinkError -> 0x031c }
        r4 = z;	 Catch:{ UnsatisfiedLinkError -> 0x031c }
        r9 = 29;
        r4 = r4[r9];	 Catch:{ UnsatisfiedLinkError -> 0x031c }
        r2 = r2.append(r4);	 Catch:{ UnsatisfiedLinkError -> 0x031c }
        r2 = r2.append(r6);	 Catch:{ UnsatisfiedLinkError -> 0x031c }
        r2 = r2.toString();	 Catch:{ UnsatisfiedLinkError -> 0x031c }
        com.whatsapp.util.Log.w(r2);	 Catch:{ UnsatisfiedLinkError -> 0x031c }
    L_0x014a:
        r2 = r7.exists();	 Catch:{ UnsatisfiedLinkError -> 0x0391 }
        if (r2 == 0) goto L_0x0170;
    L_0x0150:
        r2 = r7.delete();	 Catch:{ UnsatisfiedLinkError -> 0x0391 }
        if (r2 != 0) goto L_0x0170;
    L_0x0156:
        r2 = new java.lang.StringBuilder;	 Catch:{ UnsatisfiedLinkError -> 0x0393 }
        r2.<init>();	 Catch:{ UnsatisfiedLinkError -> 0x0393 }
        r4 = z;	 Catch:{ UnsatisfiedLinkError -> 0x0393 }
        r9 = 75;
        r4 = r4[r9];	 Catch:{ UnsatisfiedLinkError -> 0x0393 }
        r2 = r2.append(r4);	 Catch:{ UnsatisfiedLinkError -> 0x0393 }
        r2 = r2.append(r7);	 Catch:{ UnsatisfiedLinkError -> 0x0393 }
        r2 = r2.toString();	 Catch:{ UnsatisfiedLinkError -> 0x0393 }
        com.whatsapp.util.Log.w(r2);	 Catch:{ UnsatisfiedLinkError -> 0x0393 }
    L_0x0170:
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0285 }
        r2.<init>();	 Catch:{ Exception -> 0x0285 }
        r4 = z;	 Catch:{ Exception -> 0x0285 }
        r9 = 55;
        r4 = r4[r9];	 Catch:{ Exception -> 0x0285 }
        r2 = r2.append(r4);	 Catch:{ Exception -> 0x0285 }
        r4 = r20.getAbsolutePath();	 Catch:{ Exception -> 0x0285 }
        r2 = r2.append(r4);	 Catch:{ Exception -> 0x0285 }
        r4 = z;	 Catch:{ Exception -> 0x0285 }
        r9 = 79;
        r4 = r4[r9];	 Catch:{ Exception -> 0x0285 }
        r2 = r2.append(r4);	 Catch:{ Exception -> 0x0285 }
        r10 = r20.length();	 Catch:{ Exception -> 0x0285 }
        r2 = r2.append(r10);	 Catch:{ Exception -> 0x0285 }
        r4 = ")";
        r2 = r2.append(r4);	 Catch:{ Exception -> 0x0285 }
        r2 = r2.toString();	 Catch:{ Exception -> 0x0285 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ Exception -> 0x0285 }
        r2 = z;	 Catch:{ Exception -> 0x0285 }
        r4 = 8;
        r2 = r2[r4];	 Catch:{ Exception -> 0x0285 }
        r4 = r20.getAbsolutePath();	 Catch:{ Exception -> 0x0285 }
        r9 = r6.getAbsolutePath();	 Catch:{ Exception -> 0x0285 }
        r3 = com.whatsapp.SqliteShell.dump(r4, r9, r2);	 Catch:{ Exception -> 0x0285 }
        if (r3 == 0) goto L_0x039d;
    L_0x01bb:
        r4 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0285 }
        r4.<init>();	 Catch:{ Exception -> 0x0285 }
        r8 = z;	 Catch:{ Exception -> 0x0285 }
        r9 = 62;
        r8 = r8[r9];	 Catch:{ Exception -> 0x0285 }
        r4 = r4.append(r8);	 Catch:{ Exception -> 0x0285 }
        r4 = r4.append(r2);	 Catch:{ Exception -> 0x0285 }
        r8 = "\"";
        r4 = r4.append(r8);	 Catch:{ Exception -> 0x0285 }
        r4 = r4.toString();	 Catch:{ Exception -> 0x0285 }
        com.whatsapp.util.Log.e(r4);	 Catch:{ Exception -> 0x0285 }
        r4 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0285 }
        r4.<init>();	 Catch:{ Exception -> 0x0285 }
        r8 = z;	 Catch:{ Exception -> 0x0285 }
        r9 = 36;
        r8 = r8[r9];	 Catch:{ Exception -> 0x0285 }
        r4 = r4.append(r8);	 Catch:{ Exception -> 0x0285 }
        r2 = r4.append(r2);	 Catch:{ Exception -> 0x0285 }
        r4 = z;	 Catch:{ Exception -> 0x0285 }
        r8 = 66;
        r4 = r4[r8];	 Catch:{ Exception -> 0x0285 }
        r2 = r2.append(r4);	 Catch:{ Exception -> 0x0285 }
        r4 = new java.io.FileInputStream;	 Catch:{ Exception -> 0x0285 }
        r4.<init>(r6);	 Catch:{ Exception -> 0x0285 }
        r4 = com.whatsapp.gdrive.fn.a(r4);	 Catch:{ Exception -> 0x0285 }
        r2 = r2.append(r4);	 Catch:{ Exception -> 0x0285 }
        r2 = r2.toString();	 Catch:{ Exception -> 0x0285 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ Exception -> 0x0285 }
        r2 = 0;
        r4 = com.whatsapp.App.am;	 Catch:{ UnsatisfiedLinkError -> 0x0395 }
        r8 = 3;
        if (r4 != r8) goto L_0x0215;
    L_0x0213:
        if (r3 != 0) goto L_0x0257;
    L_0x0215:
        r3 = r6.delete();	 Catch:{ UnsatisfiedLinkError -> 0x0397 }
        if (r3 != 0) goto L_0x0235;
    L_0x021b:
        r3 = new java.lang.StringBuilder;	 Catch:{ UnsatisfiedLinkError -> 0x0399 }
        r3.<init>();	 Catch:{ UnsatisfiedLinkError -> 0x0399 }
        r4 = z;	 Catch:{ UnsatisfiedLinkError -> 0x0399 }
        r8 = 16;
        r4 = r4[r8];	 Catch:{ UnsatisfiedLinkError -> 0x0399 }
        r3 = r3.append(r4);	 Catch:{ UnsatisfiedLinkError -> 0x0399 }
        r3 = r3.append(r6);	 Catch:{ UnsatisfiedLinkError -> 0x0399 }
        r3 = r3.toString();	 Catch:{ UnsatisfiedLinkError -> 0x0399 }
        com.whatsapp.util.Log.w(r3);	 Catch:{ UnsatisfiedLinkError -> 0x0399 }
    L_0x0235:
        r3 = r7.delete();	 Catch:{ UnsatisfiedLinkError -> 0x039b }
        if (r3 != 0) goto L_0x00f7;
    L_0x023b:
        r3 = new java.lang.StringBuilder;	 Catch:{ UnsatisfiedLinkError -> 0x039b }
        r3.<init>();	 Catch:{ UnsatisfiedLinkError -> 0x039b }
        r4 = z;	 Catch:{ UnsatisfiedLinkError -> 0x039b }
        r8 = 38;
        r4 = r4[r8];	 Catch:{ UnsatisfiedLinkError -> 0x039b }
        r3 = r3.append(r4);	 Catch:{ UnsatisfiedLinkError -> 0x039b }
        r3 = r3.append(r7);	 Catch:{ UnsatisfiedLinkError -> 0x039b }
        r3 = r3.toString();	 Catch:{ UnsatisfiedLinkError -> 0x039b }
        com.whatsapp.util.Log.w(r3);	 Catch:{ UnsatisfiedLinkError -> 0x039b }
        if (r5 == 0) goto L_0x00f7;
    L_0x0257:
        r3 = new java.lang.StringBuilder;	 Catch:{ UnsatisfiedLinkError -> 0x0281 }
        r3.<init>();	 Catch:{ UnsatisfiedLinkError -> 0x0281 }
        r4 = z;	 Catch:{ UnsatisfiedLinkError -> 0x0281 }
        r5 = 80;
        r4 = r4[r5];	 Catch:{ UnsatisfiedLinkError -> 0x0281 }
        r3 = r3.append(r4);	 Catch:{ UnsatisfiedLinkError -> 0x0281 }
        r3 = r3.append(r6);	 Catch:{ UnsatisfiedLinkError -> 0x0281 }
        r4 = z;	 Catch:{ UnsatisfiedLinkError -> 0x0281 }
        r5 = 56;
        r4 = r4[r5];	 Catch:{ UnsatisfiedLinkError -> 0x0281 }
        r3 = r3.append(r4);	 Catch:{ UnsatisfiedLinkError -> 0x0281 }
        r3 = r3.append(r7);	 Catch:{ UnsatisfiedLinkError -> 0x0281 }
        r3 = r3.toString();	 Catch:{ UnsatisfiedLinkError -> 0x0281 }
        com.whatsapp.util.Log.i(r3);	 Catch:{ UnsatisfiedLinkError -> 0x0281 }
        goto L_0x00f7;
    L_0x0281:
        r2 = move-exception;
        throw r2;
    L_0x0283:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0285 }
    L_0x0285:
        r2 = move-exception;
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x031e }
        r4.<init>();	 Catch:{ all -> 0x031e }
        r8 = z;	 Catch:{ all -> 0x031e }
        r9 = 32;
        r8 = r8[r9];	 Catch:{ all -> 0x031e }
        r4 = r4.append(r8);	 Catch:{ all -> 0x031e }
        r8 = r20.getAbsolutePath();	 Catch:{ all -> 0x031e }
        r4 = r4.append(r8);	 Catch:{ all -> 0x031e }
        r4 = r4.toString();	 Catch:{ all -> 0x031e }
        com.whatsapp.util.Log.b(r4, r2);	 Catch:{ all -> 0x031e }
        r2 = 0;
        r4 = com.whatsapp.App.am;	 Catch:{ UnsatisfiedLinkError -> 0x08d3 }
        r8 = 3;
        if (r4 != r8) goto L_0x02ac;
    L_0x02aa:
        if (r3 != 0) goto L_0x02ee;
    L_0x02ac:
        r3 = r6.delete();	 Catch:{ UnsatisfiedLinkError -> 0x08d5 }
        if (r3 != 0) goto L_0x02cc;
    L_0x02b2:
        r3 = new java.lang.StringBuilder;	 Catch:{ UnsatisfiedLinkError -> 0x08d7 }
        r3.<init>();	 Catch:{ UnsatisfiedLinkError -> 0x08d7 }
        r4 = z;	 Catch:{ UnsatisfiedLinkError -> 0x08d7 }
        r8 = 15;
        r4 = r4[r8];	 Catch:{ UnsatisfiedLinkError -> 0x08d7 }
        r3 = r3.append(r4);	 Catch:{ UnsatisfiedLinkError -> 0x08d7 }
        r3 = r3.append(r6);	 Catch:{ UnsatisfiedLinkError -> 0x08d7 }
        r3 = r3.toString();	 Catch:{ UnsatisfiedLinkError -> 0x08d7 }
        com.whatsapp.util.Log.w(r3);	 Catch:{ UnsatisfiedLinkError -> 0x08d7 }
    L_0x02cc:
        r3 = r7.delete();	 Catch:{ UnsatisfiedLinkError -> 0x08d9 }
        if (r3 != 0) goto L_0x00f7;
    L_0x02d2:
        r3 = new java.lang.StringBuilder;	 Catch:{ UnsatisfiedLinkError -> 0x08d9 }
        r3.<init>();	 Catch:{ UnsatisfiedLinkError -> 0x08d9 }
        r4 = z;	 Catch:{ UnsatisfiedLinkError -> 0x08d9 }
        r8 = 63;
        r4 = r4[r8];	 Catch:{ UnsatisfiedLinkError -> 0x08d9 }
        r3 = r3.append(r4);	 Catch:{ UnsatisfiedLinkError -> 0x08d9 }
        r3 = r3.append(r7);	 Catch:{ UnsatisfiedLinkError -> 0x08d9 }
        r3 = r3.toString();	 Catch:{ UnsatisfiedLinkError -> 0x08d9 }
        com.whatsapp.util.Log.w(r3);	 Catch:{ UnsatisfiedLinkError -> 0x08d9 }
        if (r5 == 0) goto L_0x00f7;
    L_0x02ee:
        r3 = new java.lang.StringBuilder;	 Catch:{ UnsatisfiedLinkError -> 0x0318 }
        r3.<init>();	 Catch:{ UnsatisfiedLinkError -> 0x0318 }
        r4 = z;	 Catch:{ UnsatisfiedLinkError -> 0x0318 }
        r5 = 40;
        r4 = r4[r5];	 Catch:{ UnsatisfiedLinkError -> 0x0318 }
        r3 = r3.append(r4);	 Catch:{ UnsatisfiedLinkError -> 0x0318 }
        r3 = r3.append(r6);	 Catch:{ UnsatisfiedLinkError -> 0x0318 }
        r4 = z;	 Catch:{ UnsatisfiedLinkError -> 0x0318 }
        r5 = 65;
        r4 = r4[r5];	 Catch:{ UnsatisfiedLinkError -> 0x0318 }
        r3 = r3.append(r4);	 Catch:{ UnsatisfiedLinkError -> 0x0318 }
        r3 = r3.append(r7);	 Catch:{ UnsatisfiedLinkError -> 0x0318 }
        r3 = r3.toString();	 Catch:{ UnsatisfiedLinkError -> 0x0318 }
        com.whatsapp.util.Log.i(r3);	 Catch:{ UnsatisfiedLinkError -> 0x0318 }
        goto L_0x00f7;
    L_0x0318:
        r2 = move-exception;
        throw r2;
    L_0x031a:
        r2 = move-exception;
        throw r2;	 Catch:{ UnsatisfiedLinkError -> 0x031c }
    L_0x031c:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0285 }
    L_0x031e:
        r2 = move-exception;
        r4 = com.whatsapp.App.am;	 Catch:{ UnsatisfiedLinkError -> 0x08db }
        r8 = 3;
        if (r4 != r8) goto L_0x0326;
    L_0x0324:
        if (r3 != 0) goto L_0x0368;
    L_0x0326:
        r3 = r6.delete();	 Catch:{ UnsatisfiedLinkError -> 0x08df }
        if (r3 != 0) goto L_0x0346;
    L_0x032c:
        r3 = new java.lang.StringBuilder;	 Catch:{ UnsatisfiedLinkError -> 0x08df }
        r3.<init>();	 Catch:{ UnsatisfiedLinkError -> 0x08df }
        r4 = z;	 Catch:{ UnsatisfiedLinkError -> 0x08df }
        r8 = 61;
        r4 = r4[r8];	 Catch:{ UnsatisfiedLinkError -> 0x08df }
        r3 = r3.append(r4);	 Catch:{ UnsatisfiedLinkError -> 0x08df }
        r3 = r3.append(r6);	 Catch:{ UnsatisfiedLinkError -> 0x08df }
        r3 = r3.toString();	 Catch:{ UnsatisfiedLinkError -> 0x08df }
        com.whatsapp.util.Log.w(r3);	 Catch:{ UnsatisfiedLinkError -> 0x08df }
    L_0x0346:
        r3 = r7.delete();	 Catch:{ UnsatisfiedLinkError -> 0x08e1 }
        if (r3 != 0) goto L_0x0390;
    L_0x034c:
        r3 = new java.lang.StringBuilder;	 Catch:{ UnsatisfiedLinkError -> 0x08e3 }
        r3.<init>();	 Catch:{ UnsatisfiedLinkError -> 0x08e3 }
        r4 = z;	 Catch:{ UnsatisfiedLinkError -> 0x08e3 }
        r8 = 72;
        r4 = r4[r8];	 Catch:{ UnsatisfiedLinkError -> 0x08e3 }
        r3 = r3.append(r4);	 Catch:{ UnsatisfiedLinkError -> 0x08e3 }
        r3 = r3.append(r7);	 Catch:{ UnsatisfiedLinkError -> 0x08e3 }
        r3 = r3.toString();	 Catch:{ UnsatisfiedLinkError -> 0x08e3 }
        com.whatsapp.util.Log.w(r3);	 Catch:{ UnsatisfiedLinkError -> 0x08e3 }
        if (r5 == 0) goto L_0x0390;
    L_0x0368:
        r3 = new java.lang.StringBuilder;	 Catch:{ UnsatisfiedLinkError -> 0x08e3 }
        r3.<init>();	 Catch:{ UnsatisfiedLinkError -> 0x08e3 }
        r4 = z;	 Catch:{ UnsatisfiedLinkError -> 0x08e3 }
        r5 = 33;
        r4 = r4[r5];	 Catch:{ UnsatisfiedLinkError -> 0x08e3 }
        r3 = r3.append(r4);	 Catch:{ UnsatisfiedLinkError -> 0x08e3 }
        r3 = r3.append(r6);	 Catch:{ UnsatisfiedLinkError -> 0x08e3 }
        r4 = z;	 Catch:{ UnsatisfiedLinkError -> 0x08e3 }
        r5 = 25;
        r4 = r4[r5];	 Catch:{ UnsatisfiedLinkError -> 0x08e3 }
        r3 = r3.append(r4);	 Catch:{ UnsatisfiedLinkError -> 0x08e3 }
        r3 = r3.append(r7);	 Catch:{ UnsatisfiedLinkError -> 0x08e3 }
        r3 = r3.toString();	 Catch:{ UnsatisfiedLinkError -> 0x08e3 }
        com.whatsapp.util.Log.i(r3);	 Catch:{ UnsatisfiedLinkError -> 0x08e3 }
    L_0x0390:
        throw r2;
    L_0x0391:
        r2 = move-exception;
        throw r2;	 Catch:{ UnsatisfiedLinkError -> 0x0393 }
    L_0x0393:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0285 }
    L_0x0395:
        r2 = move-exception;
        throw r2;	 Catch:{ UnsatisfiedLinkError -> 0x0397 }
    L_0x0397:
        r2 = move-exception;
        throw r2;	 Catch:{ UnsatisfiedLinkError -> 0x0399 }
    L_0x0399:
        r2 = move-exception;
        throw r2;
    L_0x039b:
        r2 = move-exception;
        throw r2;	 Catch:{ UnsatisfiedLinkError -> 0x0281 }
    L_0x039d:
        r4 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0285 }
        r4.<init>();	 Catch:{ Exception -> 0x0285 }
        r9 = z;	 Catch:{ Exception -> 0x0285 }
        r10 = 78;
        r9 = r9[r10];	 Catch:{ Exception -> 0x0285 }
        r4 = r4.append(r9);	 Catch:{ Exception -> 0x0285 }
        r2 = r4.append(r2);	 Catch:{ Exception -> 0x0285 }
        r4 = "\"";
        r2 = r2.append(r4);	 Catch:{ Exception -> 0x0285 }
        r2 = r2.toString();	 Catch:{ Exception -> 0x0285 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ Exception -> 0x0285 }
        a(r6);	 Catch:{ Exception -> 0x0285 }
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0285 }
        r2.<init>();	 Catch:{ Exception -> 0x0285 }
        r4 = z;	 Catch:{ Exception -> 0x0285 }
        r9 = 18;
        r4 = r4[r9];	 Catch:{ Exception -> 0x0285 }
        r2 = r2.append(r4);	 Catch:{ Exception -> 0x0285 }
        r4 = r6.getAbsolutePath();	 Catch:{ Exception -> 0x0285 }
        r2 = r2.append(r4);	 Catch:{ Exception -> 0x0285 }
        r2 = r2.toString();	 Catch:{ Exception -> 0x0285 }
        r4 = r8.getAbsolutePath();	 Catch:{ Exception -> 0x0285 }
        r9 = z;	 Catch:{ Exception -> 0x0285 }
        r10 = 14;
        r9 = r9[r10];	 Catch:{ Exception -> 0x0285 }
        r3 = com.whatsapp.SqliteShell.dump(r4, r9, r2);	 Catch:{ Exception -> 0x0285 }
        if (r3 == 0) goto L_0x046a;
    L_0x03ec:
        r2 = 0;
        r4 = com.whatsapp.App.am;	 Catch:{ UnsatisfiedLinkError -> 0x0462 }
        r8 = 3;
        if (r4 != r8) goto L_0x03f4;
    L_0x03f2:
        if (r3 != 0) goto L_0x0436;
    L_0x03f4:
        r3 = r6.delete();	 Catch:{ UnsatisfiedLinkError -> 0x0464 }
        if (r3 != 0) goto L_0x0414;
    L_0x03fa:
        r3 = new java.lang.StringBuilder;	 Catch:{ UnsatisfiedLinkError -> 0x0466 }
        r3.<init>();	 Catch:{ UnsatisfiedLinkError -> 0x0466 }
        r4 = z;	 Catch:{ UnsatisfiedLinkError -> 0x0466 }
        r8 = 76;
        r4 = r4[r8];	 Catch:{ UnsatisfiedLinkError -> 0x0466 }
        r3 = r3.append(r4);	 Catch:{ UnsatisfiedLinkError -> 0x0466 }
        r3 = r3.append(r6);	 Catch:{ UnsatisfiedLinkError -> 0x0466 }
        r3 = r3.toString();	 Catch:{ UnsatisfiedLinkError -> 0x0466 }
        com.whatsapp.util.Log.w(r3);	 Catch:{ UnsatisfiedLinkError -> 0x0466 }
    L_0x0414:
        r3 = r7.delete();	 Catch:{ UnsatisfiedLinkError -> 0x0468 }
        if (r3 != 0) goto L_0x00f7;
    L_0x041a:
        r3 = new java.lang.StringBuilder;	 Catch:{ UnsatisfiedLinkError -> 0x0468 }
        r3.<init>();	 Catch:{ UnsatisfiedLinkError -> 0x0468 }
        r4 = z;	 Catch:{ UnsatisfiedLinkError -> 0x0468 }
        r8 = 30;
        r4 = r4[r8];	 Catch:{ UnsatisfiedLinkError -> 0x0468 }
        r3 = r3.append(r4);	 Catch:{ UnsatisfiedLinkError -> 0x0468 }
        r3 = r3.append(r7);	 Catch:{ UnsatisfiedLinkError -> 0x0468 }
        r3 = r3.toString();	 Catch:{ UnsatisfiedLinkError -> 0x0468 }
        com.whatsapp.util.Log.w(r3);	 Catch:{ UnsatisfiedLinkError -> 0x0468 }
        if (r5 == 0) goto L_0x00f7;
    L_0x0436:
        r3 = new java.lang.StringBuilder;	 Catch:{ UnsatisfiedLinkError -> 0x0460 }
        r3.<init>();	 Catch:{ UnsatisfiedLinkError -> 0x0460 }
        r4 = z;	 Catch:{ UnsatisfiedLinkError -> 0x0460 }
        r5 = 50;
        r4 = r4[r5];	 Catch:{ UnsatisfiedLinkError -> 0x0460 }
        r3 = r3.append(r4);	 Catch:{ UnsatisfiedLinkError -> 0x0460 }
        r3 = r3.append(r6);	 Catch:{ UnsatisfiedLinkError -> 0x0460 }
        r4 = z;	 Catch:{ UnsatisfiedLinkError -> 0x0460 }
        r5 = 39;
        r4 = r4[r5];	 Catch:{ UnsatisfiedLinkError -> 0x0460 }
        r3 = r3.append(r4);	 Catch:{ UnsatisfiedLinkError -> 0x0460 }
        r3 = r3.append(r7);	 Catch:{ UnsatisfiedLinkError -> 0x0460 }
        r3 = r3.toString();	 Catch:{ UnsatisfiedLinkError -> 0x0460 }
        com.whatsapp.util.Log.i(r3);	 Catch:{ UnsatisfiedLinkError -> 0x0460 }
        goto L_0x00f7;
    L_0x0460:
        r2 = move-exception;
        throw r2;
    L_0x0462:
        r2 = move-exception;
        throw r2;	 Catch:{ UnsatisfiedLinkError -> 0x0464 }
    L_0x0464:
        r2 = move-exception;
        throw r2;	 Catch:{ UnsatisfiedLinkError -> 0x0466 }
    L_0x0466:
        r2 = move-exception;
        throw r2;
    L_0x0468:
        r2 = move-exception;
        throw r2;	 Catch:{ UnsatisfiedLinkError -> 0x0460 }
    L_0x046a:
        r2 = z;	 Catch:{ Exception -> 0x0285 }
        r4 = 37;
        r2 = r2[r4];	 Catch:{ Exception -> 0x0285 }
        r4 = r20.getAbsolutePath();	 Catch:{ Exception -> 0x0285 }
        r9 = r7.getAbsolutePath();	 Catch:{ Exception -> 0x0285 }
        r3 = com.whatsapp.SqliteShell.dump(r4, r9, r2);	 Catch:{ Exception -> 0x0285 }
        if (r3 == 0) goto L_0x051c;
    L_0x047e:
        r4 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0285 }
        r4.<init>();	 Catch:{ Exception -> 0x0285 }
        r8 = z;	 Catch:{ Exception -> 0x0285 }
        r9 = 13;
        r8 = r8[r9];	 Catch:{ Exception -> 0x0285 }
        r4 = r4.append(r8);	 Catch:{ Exception -> 0x0285 }
        r2 = r4.append(r2);	 Catch:{ Exception -> 0x0285 }
        r4 = "\"";
        r2 = r2.append(r4);	 Catch:{ Exception -> 0x0285 }
        r2 = r2.toString();	 Catch:{ Exception -> 0x0285 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ Exception -> 0x0285 }
        r2 = 0;
        r4 = com.whatsapp.App.am;	 Catch:{ UnsatisfiedLinkError -> 0x0514 }
        r8 = 3;
        if (r4 != r8) goto L_0x04a7;
    L_0x04a5:
        if (r3 != 0) goto L_0x04e9;
    L_0x04a7:
        r3 = r6.delete();	 Catch:{ UnsatisfiedLinkError -> 0x0516 }
        if (r3 != 0) goto L_0x04c7;
    L_0x04ad:
        r3 = new java.lang.StringBuilder;	 Catch:{ UnsatisfiedLinkError -> 0x0518 }
        r3.<init>();	 Catch:{ UnsatisfiedLinkError -> 0x0518 }
        r4 = z;	 Catch:{ UnsatisfiedLinkError -> 0x0518 }
        r8 = 60;
        r4 = r4[r8];	 Catch:{ UnsatisfiedLinkError -> 0x0518 }
        r3 = r3.append(r4);	 Catch:{ UnsatisfiedLinkError -> 0x0518 }
        r3 = r3.append(r6);	 Catch:{ UnsatisfiedLinkError -> 0x0518 }
        r3 = r3.toString();	 Catch:{ UnsatisfiedLinkError -> 0x0518 }
        com.whatsapp.util.Log.w(r3);	 Catch:{ UnsatisfiedLinkError -> 0x0518 }
    L_0x04c7:
        r3 = r7.delete();	 Catch:{ UnsatisfiedLinkError -> 0x051a }
        if (r3 != 0) goto L_0x00f7;
    L_0x04cd:
        r3 = new java.lang.StringBuilder;	 Catch:{ UnsatisfiedLinkError -> 0x051a }
        r3.<init>();	 Catch:{ UnsatisfiedLinkError -> 0x051a }
        r4 = z;	 Catch:{ UnsatisfiedLinkError -> 0x051a }
        r8 = 26;
        r4 = r4[r8];	 Catch:{ UnsatisfiedLinkError -> 0x051a }
        r3 = r3.append(r4);	 Catch:{ UnsatisfiedLinkError -> 0x051a }
        r3 = r3.append(r7);	 Catch:{ UnsatisfiedLinkError -> 0x051a }
        r3 = r3.toString();	 Catch:{ UnsatisfiedLinkError -> 0x051a }
        com.whatsapp.util.Log.w(r3);	 Catch:{ UnsatisfiedLinkError -> 0x051a }
        if (r5 == 0) goto L_0x00f7;
    L_0x04e9:
        r3 = new java.lang.StringBuilder;	 Catch:{ UnsatisfiedLinkError -> 0x0512 }
        r3.<init>();	 Catch:{ UnsatisfiedLinkError -> 0x0512 }
        r4 = z;	 Catch:{ UnsatisfiedLinkError -> 0x0512 }
        r5 = 6;
        r4 = r4[r5];	 Catch:{ UnsatisfiedLinkError -> 0x0512 }
        r3 = r3.append(r4);	 Catch:{ UnsatisfiedLinkError -> 0x0512 }
        r3 = r3.append(r6);	 Catch:{ UnsatisfiedLinkError -> 0x0512 }
        r4 = z;	 Catch:{ UnsatisfiedLinkError -> 0x0512 }
        r5 = 46;
        r4 = r4[r5];	 Catch:{ UnsatisfiedLinkError -> 0x0512 }
        r3 = r3.append(r4);	 Catch:{ UnsatisfiedLinkError -> 0x0512 }
        r3 = r3.append(r7);	 Catch:{ UnsatisfiedLinkError -> 0x0512 }
        r3 = r3.toString();	 Catch:{ UnsatisfiedLinkError -> 0x0512 }
        com.whatsapp.util.Log.i(r3);	 Catch:{ UnsatisfiedLinkError -> 0x0512 }
        goto L_0x00f7;
    L_0x0512:
        r2 = move-exception;
        throw r2;
    L_0x0514:
        r2 = move-exception;
        throw r2;	 Catch:{ UnsatisfiedLinkError -> 0x0516 }
    L_0x0516:
        r2 = move-exception;
        throw r2;	 Catch:{ UnsatisfiedLinkError -> 0x0518 }
    L_0x0518:
        r2 = move-exception;
        throw r2;
    L_0x051a:
        r2 = move-exception;
        throw r2;	 Catch:{ UnsatisfiedLinkError -> 0x0512 }
    L_0x051c:
        r4 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0285 }
        r4.<init>();	 Catch:{ Exception -> 0x0285 }
        r9 = z;	 Catch:{ Exception -> 0x0285 }
        r10 = 70;
        r9 = r9[r10];	 Catch:{ Exception -> 0x0285 }
        r4 = r4.append(r9);	 Catch:{ Exception -> 0x0285 }
        r2 = r4.append(r2);	 Catch:{ Exception -> 0x0285 }
        r4 = z;	 Catch:{ Exception -> 0x0285 }
        r9 = 71;
        r4 = r4[r9];	 Catch:{ Exception -> 0x0285 }
        r2 = r2.append(r4);	 Catch:{ Exception -> 0x0285 }
        r10 = r6.length();	 Catch:{ Exception -> 0x0285 }
        r2 = r2.append(r10);	 Catch:{ Exception -> 0x0285 }
        r2 = r2.toString();	 Catch:{ Exception -> 0x0285 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ Exception -> 0x0285 }
        r9 = g(r7);	 Catch:{ Exception -> 0x0285 }
        r4 = 0;
        r10 = r9.length;	 Catch:{ Exception -> 0x0285 }
        r2 = 0;
        r18 = r2;
        r2 = r4;
        r4 = r18;
    L_0x0554:
        if (r4 >= r10) goto L_0x0660;
    L_0x0556:
        r11 = r9[r4];	 Catch:{ Exception -> 0x0285 }
        r11 = r11.trim();	 Catch:{ Exception -> 0x0285 }
        r12 = r11.length();	 Catch:{ UnsatisfiedLinkError -> 0x07a6 }
        if (r12 != 0) goto L_0x056d;
    L_0x0562:
        r12 = z;	 Catch:{ UnsatisfiedLinkError -> 0x07a6 }
        r13 = 67;
        r12 = r12[r13];	 Catch:{ UnsatisfiedLinkError -> 0x07a6 }
        com.whatsapp.util.Log.w(r12);	 Catch:{ UnsatisfiedLinkError -> 0x07a6 }
        if (r5 == 0) goto L_0x065c;
    L_0x056d:
        r12 = r7.exists();	 Catch:{ UnsatisfiedLinkError -> 0x07a8 }
        if (r12 == 0) goto L_0x0593;
    L_0x0573:
        r12 = r7.delete();	 Catch:{ UnsatisfiedLinkError -> 0x07aa }
        if (r12 != 0) goto L_0x0593;
    L_0x0579:
        r12 = new java.lang.StringBuilder;	 Catch:{ UnsatisfiedLinkError -> 0x07ac }
        r12.<init>();	 Catch:{ UnsatisfiedLinkError -> 0x07ac }
        r13 = z;	 Catch:{ UnsatisfiedLinkError -> 0x07ac }
        r14 = 45;
        r13 = r13[r14];	 Catch:{ UnsatisfiedLinkError -> 0x07ac }
        r12 = r12.append(r13);	 Catch:{ UnsatisfiedLinkError -> 0x07ac }
        r12 = r12.append(r7);	 Catch:{ UnsatisfiedLinkError -> 0x07ac }
        r12 = r12.toString();	 Catch:{ UnsatisfiedLinkError -> 0x07ac }
        com.whatsapp.util.Log.w(r12);	 Catch:{ UnsatisfiedLinkError -> 0x07ac }
    L_0x0593:
        r12 = java.util.Locale.ENGLISH;	 Catch:{ Exception -> 0x0285 }
        r13 = z;	 Catch:{ Exception -> 0x0285 }
        r14 = 11;
        r13 = r13[r14];	 Catch:{ Exception -> 0x0285 }
        r14 = 3;
        r14 = new java.lang.Object[r14];	 Catch:{ Exception -> 0x0285 }
        r15 = 0;
        r16 = r2 + 1;
        r16 = java.lang.Integer.valueOf(r16);	 Catch:{ Exception -> 0x0285 }
        r14[r15] = r16;	 Catch:{ Exception -> 0x0285 }
        r15 = 1;
        r0 = r9.length;	 Catch:{ Exception -> 0x0285 }
        r16 = r0;
        r16 = java.lang.Integer.valueOf(r16);	 Catch:{ Exception -> 0x0285 }
        r14[r15] = r16;	 Catch:{ Exception -> 0x0285 }
        r15 = 2;
        r14[r15] = r11;	 Catch:{ Exception -> 0x0285 }
        r12 = java.lang.String.format(r12, r13, r14);	 Catch:{ Exception -> 0x0285 }
        com.whatsapp.util.Log.i(r12);	 Catch:{ Exception -> 0x0285 }
        r12 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0285 }
        r12.<init>();	 Catch:{ Exception -> 0x0285 }
        r13 = z;	 Catch:{ Exception -> 0x0285 }
        r14 = 43;
        r13 = r13[r14];	 Catch:{ Exception -> 0x0285 }
        r12 = r12.append(r13);	 Catch:{ Exception -> 0x0285 }
        r11 = r12.append(r11);	 Catch:{ Exception -> 0x0285 }
        r11 = r11.toString();	 Catch:{ Exception -> 0x0285 }
        r12 = r20.getAbsolutePath();	 Catch:{ Exception -> 0x0285 }
        r13 = r7.getAbsolutePath();	 Catch:{ Exception -> 0x0285 }
        r12 = com.whatsapp.SqliteShell.dump(r12, r13, r11);	 Catch:{ Exception -> 0x0285 }
        if (r12 == 0) goto L_0x0603;
    L_0x05e0:
        r12 = new java.lang.StringBuilder;	 Catch:{ UnsatisfiedLinkError -> 0x07ae }
        r12.<init>();	 Catch:{ UnsatisfiedLinkError -> 0x07ae }
        r13 = z;	 Catch:{ UnsatisfiedLinkError -> 0x07ae }
        r14 = 49;
        r13 = r13[r14];	 Catch:{ UnsatisfiedLinkError -> 0x07ae }
        r12 = r12.append(r13);	 Catch:{ UnsatisfiedLinkError -> 0x07ae }
        r12 = r12.append(r11);	 Catch:{ UnsatisfiedLinkError -> 0x07ae }
        r13 = "\"";
        r12 = r12.append(r13);	 Catch:{ UnsatisfiedLinkError -> 0x07ae }
        r12 = r12.toString();	 Catch:{ UnsatisfiedLinkError -> 0x07ae }
        com.whatsapp.util.Log.e(r12);	 Catch:{ UnsatisfiedLinkError -> 0x07ae }
        if (r5 == 0) goto L_0x062f;
    L_0x0603:
        r12 = new java.lang.StringBuilder;	 Catch:{ UnsatisfiedLinkError -> 0x07b0 }
        r12.<init>();	 Catch:{ UnsatisfiedLinkError -> 0x07b0 }
        r13 = z;	 Catch:{ UnsatisfiedLinkError -> 0x07b0 }
        r14 = 34;
        r13 = r13[r14];	 Catch:{ UnsatisfiedLinkError -> 0x07b0 }
        r12 = r12.append(r13);	 Catch:{ UnsatisfiedLinkError -> 0x07b0 }
        r11 = r12.append(r11);	 Catch:{ UnsatisfiedLinkError -> 0x07b0 }
        r12 = z;	 Catch:{ UnsatisfiedLinkError -> 0x07b0 }
        r13 = 24;
        r12 = r12[r13];	 Catch:{ UnsatisfiedLinkError -> 0x07b0 }
        r11 = r11.append(r12);	 Catch:{ UnsatisfiedLinkError -> 0x07b0 }
        r12 = r7.length();	 Catch:{ UnsatisfiedLinkError -> 0x07b0 }
        r11 = r11.append(r12);	 Catch:{ UnsatisfiedLinkError -> 0x07b0 }
        r11 = r11.toString();	 Catch:{ UnsatisfiedLinkError -> 0x07b0 }
        com.whatsapp.util.Log.i(r11);	 Catch:{ UnsatisfiedLinkError -> 0x07b0 }
    L_0x062f:
        b(r7);	 Catch:{ Exception -> 0x0285 }
        r11 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0285 }
        r11.<init>();	 Catch:{ Exception -> 0x0285 }
        r12 = z;	 Catch:{ Exception -> 0x0285 }
        r13 = 64;
        r12 = r12[r13];	 Catch:{ Exception -> 0x0285 }
        r11 = r11.append(r12);	 Catch:{ Exception -> 0x0285 }
        r12 = r7.getAbsolutePath();	 Catch:{ Exception -> 0x0285 }
        r11 = r11.append(r12);	 Catch:{ Exception -> 0x0285 }
        r11 = r11.toString();	 Catch:{ Exception -> 0x0285 }
        r12 = r8.getAbsolutePath();	 Catch:{ Exception -> 0x0285 }
        r13 = z;	 Catch:{ Exception -> 0x0285 }
        r14 = 27;
        r13 = r13[r14];	 Catch:{ Exception -> 0x0285 }
        com.whatsapp.SqliteShell.dump(r12, r13, r11);	 Catch:{ Exception -> 0x0285 }
        r2 = r2 + 1;
    L_0x065c:
        r4 = r4 + 1;
        if (r5 == 0) goto L_0x0554;
    L_0x0660:
        r2 = r8.getAbsolutePath();	 Catch:{ Exception -> 0x0285 }
        r4 = 0;
        r9 = 16;
        r2 = android.database.sqlite.SQLiteDatabase.openDatabase(r2, r4, r9);	 Catch:{ Exception -> 0x0285 }
        r4 = 1;
        r2.setVersion(r4);	 Catch:{ Exception -> 0x0285 }
        r2.close();	 Catch:{ Exception -> 0x0285 }
        r2 = com.whatsapp.ael.a(r20);	 Catch:{ Exception -> 0x0285 }
        r10 = (long) r2;	 Catch:{ Exception -> 0x0285 }
        r2 = com.whatsapp.ael.a(r8);	 Catch:{ Exception -> 0x0285 }
        r12 = (long) r2;	 Catch:{ Exception -> 0x0285 }
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0285 }
        r2.<init>();	 Catch:{ Exception -> 0x0285 }
        r4 = z;	 Catch:{ Exception -> 0x0285 }
        r9 = 53;
        r4 = r4[r9];	 Catch:{ Exception -> 0x0285 }
        r2 = r2.append(r4);	 Catch:{ Exception -> 0x0285 }
        r4 = r20.getAbsolutePath();	 Catch:{ Exception -> 0x0285 }
        r2 = r2.append(r4);	 Catch:{ Exception -> 0x0285 }
        r4 = z;	 Catch:{ Exception -> 0x0285 }
        r9 = 42;
        r4 = r4[r9];	 Catch:{ Exception -> 0x0285 }
        r2 = r2.append(r4);	 Catch:{ Exception -> 0x0285 }
        r2 = r2.append(r10);	 Catch:{ Exception -> 0x0285 }
        r2 = r2.toString();	 Catch:{ Exception -> 0x0285 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ Exception -> 0x0285 }
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0285 }
        r2.<init>();	 Catch:{ Exception -> 0x0285 }
        r4 = z;	 Catch:{ Exception -> 0x0285 }
        r9 = 74;
        r4 = r4[r9];	 Catch:{ Exception -> 0x0285 }
        r2 = r2.append(r4);	 Catch:{ Exception -> 0x0285 }
        r4 = r6.getAbsolutePath();	 Catch:{ Exception -> 0x0285 }
        r2 = r2.append(r4);	 Catch:{ Exception -> 0x0285 }
        r4 = z;	 Catch:{ Exception -> 0x0285 }
        r9 = 20;
        r4 = r4[r9];	 Catch:{ Exception -> 0x0285 }
        r2 = r2.append(r4);	 Catch:{ Exception -> 0x0285 }
        r14 = r6.length();	 Catch:{ Exception -> 0x0285 }
        r2 = r2.append(r14);	 Catch:{ Exception -> 0x0285 }
        r2 = r2.toString();	 Catch:{ Exception -> 0x0285 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ Exception -> 0x0285 }
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0285 }
        r2.<init>();	 Catch:{ Exception -> 0x0285 }
        r4 = z;	 Catch:{ Exception -> 0x0285 }
        r9 = 77;
        r4 = r4[r9];	 Catch:{ Exception -> 0x0285 }
        r2 = r2.append(r4);	 Catch:{ Exception -> 0x0285 }
        r4 = r8.getAbsolutePath();	 Catch:{ Exception -> 0x0285 }
        r2 = r2.append(r4);	 Catch:{ Exception -> 0x0285 }
        r4 = z;	 Catch:{ Exception -> 0x0285 }
        r9 = 9;
        r4 = r4[r9];	 Catch:{ Exception -> 0x0285 }
        r2 = r2.append(r4);	 Catch:{ Exception -> 0x0285 }
        r2 = r2.append(r12);	 Catch:{ Exception -> 0x0285 }
        r2 = r2.toString();	 Catch:{ Exception -> 0x0285 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ Exception -> 0x0285 }
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0285 }
        r2.<init>();	 Catch:{ Exception -> 0x0285 }
        r4 = z;	 Catch:{ Exception -> 0x0285 }
        r9 = 21;
        r4 = r4[r9];	 Catch:{ Exception -> 0x0285 }
        r2 = r2.append(r4);	 Catch:{ Exception -> 0x0285 }
        r14 = 4636737291354636288; // 0x4059000000000000 float:0.0 double:100.0;
        r0 = (double) r12;	 Catch:{ Exception -> 0x0285 }
        r16 = r0;
        r14 = r14 * r16;
        r0 = (double) r10;	 Catch:{ Exception -> 0x0285 }
        r16 = r0;
        r14 = r14 / r16;
        r2 = r2.append(r14);	 Catch:{ Exception -> 0x0285 }
        r2 = r2.toString();	 Catch:{ Exception -> 0x0285 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ Exception -> 0x0285 }
        r14 = 0;
        r2 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1));
        if (r2 >= 0) goto L_0x07ba;
    L_0x0730:
        r2 = 0;
        r4 = com.whatsapp.App.am;	 Catch:{ UnsatisfiedLinkError -> 0x07b2 }
        r8 = 3;
        if (r4 != r8) goto L_0x0738;
    L_0x0736:
        if (r3 != 0) goto L_0x077a;
    L_0x0738:
        r3 = r6.delete();	 Catch:{ UnsatisfiedLinkError -> 0x07b4 }
        if (r3 != 0) goto L_0x0758;
    L_0x073e:
        r3 = new java.lang.StringBuilder;	 Catch:{ UnsatisfiedLinkError -> 0x07b6 }
        r3.<init>();	 Catch:{ UnsatisfiedLinkError -> 0x07b6 }
        r4 = z;	 Catch:{ UnsatisfiedLinkError -> 0x07b6 }
        r8 = 47;
        r4 = r4[r8];	 Catch:{ UnsatisfiedLinkError -> 0x07b6 }
        r3 = r3.append(r4);	 Catch:{ UnsatisfiedLinkError -> 0x07b6 }
        r3 = r3.append(r6);	 Catch:{ UnsatisfiedLinkError -> 0x07b6 }
        r3 = r3.toString();	 Catch:{ UnsatisfiedLinkError -> 0x07b6 }
        com.whatsapp.util.Log.w(r3);	 Catch:{ UnsatisfiedLinkError -> 0x07b6 }
    L_0x0758:
        r3 = r7.delete();	 Catch:{ UnsatisfiedLinkError -> 0x07b8 }
        if (r3 != 0) goto L_0x00f7;
    L_0x075e:
        r3 = new java.lang.StringBuilder;	 Catch:{ UnsatisfiedLinkError -> 0x07b8 }
        r3.<init>();	 Catch:{ UnsatisfiedLinkError -> 0x07b8 }
        r4 = z;	 Catch:{ UnsatisfiedLinkError -> 0x07b8 }
        r8 = 69;
        r4 = r4[r8];	 Catch:{ UnsatisfiedLinkError -> 0x07b8 }
        r3 = r3.append(r4);	 Catch:{ UnsatisfiedLinkError -> 0x07b8 }
        r3 = r3.append(r7);	 Catch:{ UnsatisfiedLinkError -> 0x07b8 }
        r3 = r3.toString();	 Catch:{ UnsatisfiedLinkError -> 0x07b8 }
        com.whatsapp.util.Log.w(r3);	 Catch:{ UnsatisfiedLinkError -> 0x07b8 }
        if (r5 == 0) goto L_0x00f7;
    L_0x077a:
        r3 = new java.lang.StringBuilder;	 Catch:{ UnsatisfiedLinkError -> 0x07a4 }
        r3.<init>();	 Catch:{ UnsatisfiedLinkError -> 0x07a4 }
        r4 = z;	 Catch:{ UnsatisfiedLinkError -> 0x07a4 }
        r5 = 31;
        r4 = r4[r5];	 Catch:{ UnsatisfiedLinkError -> 0x07a4 }
        r3 = r3.append(r4);	 Catch:{ UnsatisfiedLinkError -> 0x07a4 }
        r3 = r3.append(r6);	 Catch:{ UnsatisfiedLinkError -> 0x07a4 }
        r4 = z;	 Catch:{ UnsatisfiedLinkError -> 0x07a4 }
        r5 = 35;
        r4 = r4[r5];	 Catch:{ UnsatisfiedLinkError -> 0x07a4 }
        r3 = r3.append(r4);	 Catch:{ UnsatisfiedLinkError -> 0x07a4 }
        r3 = r3.append(r7);	 Catch:{ UnsatisfiedLinkError -> 0x07a4 }
        r3 = r3.toString();	 Catch:{ UnsatisfiedLinkError -> 0x07a4 }
        com.whatsapp.util.Log.i(r3);	 Catch:{ UnsatisfiedLinkError -> 0x07a4 }
        goto L_0x00f7;
    L_0x07a4:
        r2 = move-exception;
        throw r2;
    L_0x07a6:
        r2 = move-exception;
        throw r2;	 Catch:{ UnsatisfiedLinkError -> 0x07a8 }
    L_0x07a8:
        r2 = move-exception;
        throw r2;	 Catch:{ UnsatisfiedLinkError -> 0x07aa }
    L_0x07aa:
        r2 = move-exception;
        throw r2;	 Catch:{ UnsatisfiedLinkError -> 0x07ac }
    L_0x07ac:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0285 }
    L_0x07ae:
        r2 = move-exception;
        throw r2;	 Catch:{ UnsatisfiedLinkError -> 0x07b0 }
    L_0x07b0:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0285 }
    L_0x07b2:
        r2 = move-exception;
        throw r2;	 Catch:{ UnsatisfiedLinkError -> 0x07b4 }
    L_0x07b4:
        r2 = move-exception;
        throw r2;	 Catch:{ UnsatisfiedLinkError -> 0x07b6 }
    L_0x07b6:
        r2 = move-exception;
        throw r2;
    L_0x07b8:
        r2 = move-exception;
        throw r2;	 Catch:{ UnsatisfiedLinkError -> 0x07a4 }
    L_0x07ba:
        r14 = 0;
        r2 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1));
        if (r2 >= 0) goto L_0x07c6;
    L_0x07c0:
        r14 = 0;
        r2 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1));
        if (r2 > 0) goto L_0x07d3;
    L_0x07c6:
        r12 = (double) r12;
        r10 = (double) r10;
        r10 = r12 / r10;
        r12 = 4599075939470750515; // 0x3fd3333333333333 float:4.172325E-8 double:0.3;
        r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r2 < 0) goto L_0x0855;
    L_0x07d3:
        r0 = r20;
        r2 = r8.renameTo(r0);	 Catch:{ Exception -> 0x0285 }
        r4 = com.whatsapp.App.am;	 Catch:{ UnsatisfiedLinkError -> 0x084d }
        r8 = 3;
        if (r4 != r8) goto L_0x07e0;
    L_0x07de:
        if (r3 != 0) goto L_0x0822;
    L_0x07e0:
        r3 = r6.delete();	 Catch:{ UnsatisfiedLinkError -> 0x084f }
        if (r3 != 0) goto L_0x0800;
    L_0x07e6:
        r3 = new java.lang.StringBuilder;	 Catch:{ UnsatisfiedLinkError -> 0x0851 }
        r3.<init>();	 Catch:{ UnsatisfiedLinkError -> 0x0851 }
        r4 = z;	 Catch:{ UnsatisfiedLinkError -> 0x0851 }
        r8 = 17;
        r4 = r4[r8];	 Catch:{ UnsatisfiedLinkError -> 0x0851 }
        r3 = r3.append(r4);	 Catch:{ UnsatisfiedLinkError -> 0x0851 }
        r3 = r3.append(r6);	 Catch:{ UnsatisfiedLinkError -> 0x0851 }
        r3 = r3.toString();	 Catch:{ UnsatisfiedLinkError -> 0x0851 }
        com.whatsapp.util.Log.w(r3);	 Catch:{ UnsatisfiedLinkError -> 0x0851 }
    L_0x0800:
        r3 = r7.delete();	 Catch:{ UnsatisfiedLinkError -> 0x0853 }
        if (r3 != 0) goto L_0x00f7;
    L_0x0806:
        r3 = new java.lang.StringBuilder;	 Catch:{ UnsatisfiedLinkError -> 0x0853 }
        r3.<init>();	 Catch:{ UnsatisfiedLinkError -> 0x0853 }
        r4 = z;	 Catch:{ UnsatisfiedLinkError -> 0x0853 }
        r8 = 12;
        r4 = r4[r8];	 Catch:{ UnsatisfiedLinkError -> 0x0853 }
        r3 = r3.append(r4);	 Catch:{ UnsatisfiedLinkError -> 0x0853 }
        r3 = r3.append(r7);	 Catch:{ UnsatisfiedLinkError -> 0x0853 }
        r3 = r3.toString();	 Catch:{ UnsatisfiedLinkError -> 0x0853 }
        com.whatsapp.util.Log.w(r3);	 Catch:{ UnsatisfiedLinkError -> 0x0853 }
        if (r5 == 0) goto L_0x00f7;
    L_0x0822:
        r3 = new java.lang.StringBuilder;	 Catch:{ UnsatisfiedLinkError -> 0x084b }
        r3.<init>();	 Catch:{ UnsatisfiedLinkError -> 0x084b }
        r4 = z;	 Catch:{ UnsatisfiedLinkError -> 0x084b }
        r5 = 7;
        r4 = r4[r5];	 Catch:{ UnsatisfiedLinkError -> 0x084b }
        r3 = r3.append(r4);	 Catch:{ UnsatisfiedLinkError -> 0x084b }
        r3 = r3.append(r6);	 Catch:{ UnsatisfiedLinkError -> 0x084b }
        r4 = z;	 Catch:{ UnsatisfiedLinkError -> 0x084b }
        r5 = 58;
        r4 = r4[r5];	 Catch:{ UnsatisfiedLinkError -> 0x084b }
        r3 = r3.append(r4);	 Catch:{ UnsatisfiedLinkError -> 0x084b }
        r3 = r3.append(r7);	 Catch:{ UnsatisfiedLinkError -> 0x084b }
        r3 = r3.toString();	 Catch:{ UnsatisfiedLinkError -> 0x084b }
        com.whatsapp.util.Log.i(r3);	 Catch:{ UnsatisfiedLinkError -> 0x084b }
        goto L_0x00f7;
    L_0x084b:
        r2 = move-exception;
        throw r2;
    L_0x084d:
        r2 = move-exception;
        throw r2;	 Catch:{ UnsatisfiedLinkError -> 0x084f }
    L_0x084f:
        r2 = move-exception;
        throw r2;	 Catch:{ UnsatisfiedLinkError -> 0x0851 }
    L_0x0851:
        r2 = move-exception;
        throw r2;
    L_0x0853:
        r2 = move-exception;
        throw r2;	 Catch:{ UnsatisfiedLinkError -> 0x084b }
    L_0x0855:
        r2 = 0;
        r4 = com.whatsapp.App.am;	 Catch:{ UnsatisfiedLinkError -> 0x08cb }
        r8 = 3;
        if (r4 != r8) goto L_0x085d;
    L_0x085b:
        if (r3 != 0) goto L_0x089f;
    L_0x085d:
        r3 = r6.delete();	 Catch:{ UnsatisfiedLinkError -> 0x08cd }
        if (r3 != 0) goto L_0x087d;
    L_0x0863:
        r3 = new java.lang.StringBuilder;	 Catch:{ UnsatisfiedLinkError -> 0x08cf }
        r3.<init>();	 Catch:{ UnsatisfiedLinkError -> 0x08cf }
        r4 = z;	 Catch:{ UnsatisfiedLinkError -> 0x08cf }
        r8 = 59;
        r4 = r4[r8];	 Catch:{ UnsatisfiedLinkError -> 0x08cf }
        r3 = r3.append(r4);	 Catch:{ UnsatisfiedLinkError -> 0x08cf }
        r3 = r3.append(r6);	 Catch:{ UnsatisfiedLinkError -> 0x08cf }
        r3 = r3.toString();	 Catch:{ UnsatisfiedLinkError -> 0x08cf }
        com.whatsapp.util.Log.w(r3);	 Catch:{ UnsatisfiedLinkError -> 0x08cf }
    L_0x087d:
        r3 = r7.delete();	 Catch:{ UnsatisfiedLinkError -> 0x08d1 }
        if (r3 != 0) goto L_0x00f7;
    L_0x0883:
        r3 = new java.lang.StringBuilder;	 Catch:{ UnsatisfiedLinkError -> 0x08d1 }
        r3.<init>();	 Catch:{ UnsatisfiedLinkError -> 0x08d1 }
        r4 = z;	 Catch:{ UnsatisfiedLinkError -> 0x08d1 }
        r8 = 52;
        r4 = r4[r8];	 Catch:{ UnsatisfiedLinkError -> 0x08d1 }
        r3 = r3.append(r4);	 Catch:{ UnsatisfiedLinkError -> 0x08d1 }
        r3 = r3.append(r7);	 Catch:{ UnsatisfiedLinkError -> 0x08d1 }
        r3 = r3.toString();	 Catch:{ UnsatisfiedLinkError -> 0x08d1 }
        com.whatsapp.util.Log.w(r3);	 Catch:{ UnsatisfiedLinkError -> 0x08d1 }
        if (r5 == 0) goto L_0x00f7;
    L_0x089f:
        r3 = new java.lang.StringBuilder;	 Catch:{ UnsatisfiedLinkError -> 0x08c9 }
        r3.<init>();	 Catch:{ UnsatisfiedLinkError -> 0x08c9 }
        r4 = z;	 Catch:{ UnsatisfiedLinkError -> 0x08c9 }
        r5 = 48;
        r4 = r4[r5];	 Catch:{ UnsatisfiedLinkError -> 0x08c9 }
        r3 = r3.append(r4);	 Catch:{ UnsatisfiedLinkError -> 0x08c9 }
        r3 = r3.append(r6);	 Catch:{ UnsatisfiedLinkError -> 0x08c9 }
        r4 = z;	 Catch:{ UnsatisfiedLinkError -> 0x08c9 }
        r5 = 57;
        r4 = r4[r5];	 Catch:{ UnsatisfiedLinkError -> 0x08c9 }
        r3 = r3.append(r4);	 Catch:{ UnsatisfiedLinkError -> 0x08c9 }
        r3 = r3.append(r7);	 Catch:{ UnsatisfiedLinkError -> 0x08c9 }
        r3 = r3.toString();	 Catch:{ UnsatisfiedLinkError -> 0x08c9 }
        com.whatsapp.util.Log.i(r3);	 Catch:{ UnsatisfiedLinkError -> 0x08c9 }
        goto L_0x00f7;
    L_0x08c9:
        r2 = move-exception;
        throw r2;
    L_0x08cb:
        r2 = move-exception;
        throw r2;	 Catch:{ UnsatisfiedLinkError -> 0x08cd }
    L_0x08cd:
        r2 = move-exception;
        throw r2;	 Catch:{ UnsatisfiedLinkError -> 0x08cf }
    L_0x08cf:
        r2 = move-exception;
        throw r2;
    L_0x08d1:
        r2 = move-exception;
        throw r2;	 Catch:{ UnsatisfiedLinkError -> 0x08c9 }
    L_0x08d3:
        r2 = move-exception;
        throw r2;	 Catch:{ UnsatisfiedLinkError -> 0x08d5 }
    L_0x08d5:
        r2 = move-exception;
        throw r2;	 Catch:{ UnsatisfiedLinkError -> 0x08d7 }
    L_0x08d7:
        r2 = move-exception;
        throw r2;
    L_0x08d9:
        r2 = move-exception;
        throw r2;	 Catch:{ UnsatisfiedLinkError -> 0x0318 }
    L_0x08db:
        r2 = move-exception;
        throw r2;	 Catch:{ UnsatisfiedLinkError -> 0x08dd }
    L_0x08dd:
        r2 = move-exception;
        throw r2;	 Catch:{ UnsatisfiedLinkError -> 0x08df }
    L_0x08df:
        r2 = move-exception;
        throw r2;
    L_0x08e1:
        r2 = move-exception;
        throw r2;	 Catch:{ UnsatisfiedLinkError -> 0x08e3 }
    L_0x08e3:
        r2 = move-exception;
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.azf.e(java.io.File):boolean");
    }

    public Runnable a(Runnable runnable, Runnable runnable2) {
        return new aid(this, runnable2, runnable);
    }

    private void a(FileChannel fileChannel, WritableByteChannel writableByteChannel, int i, int i2) {
        boolean z = l5.s;
        long j = 0;
        long j2 = 0;
        while (j < fileChannel.size()) {
            long transferTo = j2 + fileChannel.transferTo(j, Math.min(131072, fileChannel.size() - j), writableByteChannel);
            try {
                if (this.n != null && i2 > 0) {
                    this.n.a(transferTo, fileChannel.size(), i, i2);
                }
                j += 131072;
                if (!z) {
                    j2 = transferTo;
                } else {
                    return;
                }
            } catch (IllegalStateException e) {
                throw e;
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }
    }

    public long b() {
        try {
            File g = g();
            if (g != null) {
                return g.lastModified();
            }
            return 0;
        } catch (IOException e) {
            throw e;
        } catch (Throwable e2) {
            Log.a(z[170], e2);
            return -1;
        }
    }

    private void a(long j) {
        boolean z = l5.s;
        try {
            if (App.ak() < j) {
                this.k.startActivity(new Intent(this.k, InsufficientStorageSpaceActivity.class).setFlags(268435456).putExtra(z[166], j));
            }
            while (App.ak() < j) {
                try {
                    try {
                        Thread.sleep(200);
                    } catch (Throwable e) {
                        Log.b(z[165], e);
                        if (z) {
                            return;
                        }
                    }
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            }
        } catch (InterruptedException e3) {
            throw e3;
        }
    }

    @NonNull
    private static BufferedWriter f(File file) {
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), z[179]));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(java.lang.String r7) {
        /*
        r6 = this;
        r0 = 0;
        r2 = new com.whatsapp.util.ab;
        r1 = z;
        r3 = 111; // 0x6f float:1.56E-43 double:5.5E-322;
        r1 = r1[r3];
        r2.<init>(r1);
        r1 = com.whatsapp.ael.X;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0062, SQLiteConstraintException -> 0x007b, SQLiteFullException -> 0x00a7, SQLiteException -> 0x00be, all -> 0x0130 }
        r1 = r1.getAbsolutePath();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0062, SQLiteConstraintException -> 0x007b, SQLiteFullException -> 0x00a7, SQLiteException -> 0x00be, all -> 0x0130 }
        r3 = 0;
        r4 = 16;
        r1 = android.database.sqlite.SQLiteDatabase.openDatabase(r1, r3, r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0062, SQLiteConstraintException -> 0x007b, SQLiteFullException -> 0x00a7, SQLiteException -> 0x00be, all -> 0x0130 }
        r0 = new java.lang.StringBuilder;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0142, SQLiteConstraintException -> 0x013f, SQLiteFullException -> 0x013c, SQLiteException -> 0x013a }
        r0.<init>();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0142, SQLiteConstraintException -> 0x013f, SQLiteFullException -> 0x013c, SQLiteException -> 0x013a }
        r3 = z;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0142, SQLiteConstraintException -> 0x013f, SQLiteFullException -> 0x013c, SQLiteException -> 0x013a }
        r4 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        r3 = r3[r4];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0142, SQLiteConstraintException -> 0x013f, SQLiteFullException -> 0x013c, SQLiteException -> 0x013a }
        r0 = r0.append(r3);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0142, SQLiteConstraintException -> 0x013f, SQLiteFullException -> 0x013c, SQLiteException -> 0x013a }
        r0 = r0.append(r7);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0142, SQLiteConstraintException -> 0x013f, SQLiteFullException -> 0x013c, SQLiteException -> 0x013a }
        r0 = r0.toString();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0142, SQLiteConstraintException -> 0x013f, SQLiteFullException -> 0x013c, SQLiteException -> 0x013a }
        r1.execSQL(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0142, SQLiteConstraintException -> 0x013f, SQLiteFullException -> 0x013c, SQLiteException -> 0x013a }
        r0 = new java.lang.StringBuilder;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0142, SQLiteConstraintException -> 0x013f, SQLiteFullException -> 0x013c, SQLiteException -> 0x013a }
        r0.<init>();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0142, SQLiteConstraintException -> 0x013f, SQLiteFullException -> 0x013c, SQLiteException -> 0x013a }
        r3 = z;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0142, SQLiteConstraintException -> 0x013f, SQLiteFullException -> 0x013c, SQLiteException -> 0x013a }
        r4 = 113; // 0x71 float:1.58E-43 double:5.6E-322;
        r3 = r3[r4];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0142, SQLiteConstraintException -> 0x013f, SQLiteFullException -> 0x013c, SQLiteException -> 0x013a }
        r0 = r0.append(r3);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0142, SQLiteConstraintException -> 0x013f, SQLiteFullException -> 0x013c, SQLiteException -> 0x013a }
        r2 = r2.b();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0142, SQLiteConstraintException -> 0x013f, SQLiteFullException -> 0x013c, SQLiteException -> 0x013a }
        r0 = r0.append(r2);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0142, SQLiteConstraintException -> 0x013f, SQLiteFullException -> 0x013c, SQLiteException -> 0x013a }
        r0 = r0.toString();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0142, SQLiteConstraintException -> 0x013f, SQLiteFullException -> 0x013c, SQLiteException -> 0x013a }
        com.whatsapp.util.Log.i(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0142, SQLiteConstraintException -> 0x013f, SQLiteFullException -> 0x013c, SQLiteException -> 0x013a }
        r0 = 1;
        if (r1 == 0) goto L_0x005d;
    L_0x0054:
        r2 = r1.isOpen();	 Catch:{ SQLiteDatabaseCorruptException -> 0x005e }
        if (r2 == 0) goto L_0x005d;
    L_0x005a:
        r1.close();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0060 }
    L_0x005d:
        return r0;
    L_0x005e:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0060 }
    L_0x0060:
        r0 = move-exception;
        throw r0;
    L_0x0062:
        r1 = move-exception;
    L_0x0063:
        r1 = z;	 Catch:{ all -> 0x0135 }
        r2 = 112; // 0x70 float:1.57E-43 double:5.53E-322;
        r1 = r1[r2];	 Catch:{ all -> 0x0135 }
        com.whatsapp.util.Log.w(r1);	 Catch:{ all -> 0x0135 }
        if (r0 == 0) goto L_0x0077;
    L_0x006e:
        r1 = r0.isOpen();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0079 }
        if (r1 == 0) goto L_0x0077;
    L_0x0074:
        r0.close();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0079 }
    L_0x0077:
        r0 = 0;
        goto L_0x005d;
    L_0x0079:
        r0 = move-exception;
        throw r0;
    L_0x007b:
        r1 = move-exception;
        r5 = r1;
        r1 = r0;
        r0 = r5;
    L_0x007f:
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x011f }
        r2.<init>();	 Catch:{ all -> 0x011f }
        r3 = z;	 Catch:{ all -> 0x011f }
        r4 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        r3 = r3[r4];	 Catch:{ all -> 0x011f }
        r2 = r2.append(r3);	 Catch:{ all -> 0x011f }
        r0 = r2.append(r0);	 Catch:{ all -> 0x011f }
        r0 = r0.toString();	 Catch:{ all -> 0x011f }
        com.whatsapp.util.Log.w(r0);	 Catch:{ all -> 0x011f }
        if (r1 == 0) goto L_0x0077;
    L_0x009b:
        r0 = r1.isOpen();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00a5 }
        if (r0 == 0) goto L_0x0077;
    L_0x00a1:
        r1.close();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00a5 }
        goto L_0x0077;
    L_0x00a5:
        r0 = move-exception;
        throw r0;
    L_0x00a7:
        r1 = move-exception;
        r1 = r0;
    L_0x00a9:
        r0 = com.whatsapp.App.z();	 Catch:{ all -> 0x011f }
        com.whatsapp.util.p.a(r0);	 Catch:{ all -> 0x011f }
        if (r1 == 0) goto L_0x0077;
    L_0x00b2:
        r0 = r1.isOpen();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00bc }
        if (r0 == 0) goto L_0x0077;
    L_0x00b8:
        r1.close();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00bc }
        goto L_0x0077;
    L_0x00bc:
        r0 = move-exception;
        throw r0;
    L_0x00be:
        r1 = move-exception;
        r5 = r1;
        r1 = r0;
        r0 = r5;
    L_0x00c2:
        r2 = r0.toString();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0119 }
        r3 = z;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0119 }
        r4 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        r3 = r3[r4];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0119 }
        r2 = r2.contains(r3);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0119 }
        if (r2 == 0) goto L_0x00e8;
    L_0x00d2:
        r2 = com.whatsapp.App.z();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0119 }
        r3 = com.whatsapp.App.z();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0119 }
        r4 = 2131231124; // 0x7f080194 float:1.807832E38 double:1.0529680817E-314;
        r3 = r3.getString(r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0119 }
        com.whatsapp.util.p.a(r2, r3);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0119 }
        r2 = com.whatsapp.l5.s;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0119 }
        if (r2 == 0) goto L_0x010a;
    L_0x00e8:
        r0 = r0.toString();	 Catch:{ SQLiteDatabaseCorruptException -> 0x011b }
        r2 = z;	 Catch:{ SQLiteDatabaseCorruptException -> 0x011b }
        r3 = 114; // 0x72 float:1.6E-43 double:5.63E-322;
        r2 = r2[r3];	 Catch:{ SQLiteDatabaseCorruptException -> 0x011b }
        r0 = r0.contains(r2);	 Catch:{ SQLiteDatabaseCorruptException -> 0x011b }
        if (r0 == 0) goto L_0x010a;
    L_0x00f8:
        r0 = com.whatsapp.App.z();	 Catch:{ SQLiteDatabaseCorruptException -> 0x011d }
        r2 = com.whatsapp.App.z();	 Catch:{ SQLiteDatabaseCorruptException -> 0x011d }
        r3 = 2131231125; // 0x7f080195 float:1.8078322E38 double:1.052968082E-314;
        r2 = r2.getString(r3);	 Catch:{ SQLiteDatabaseCorruptException -> 0x011d }
        com.whatsapp.util.p.a(r0, r2);	 Catch:{ SQLiteDatabaseCorruptException -> 0x011d }
    L_0x010a:
        if (r1 == 0) goto L_0x0077;
    L_0x010c:
        r0 = r1.isOpen();	 Catch:{ SQLiteDatabaseCorruptException -> 0x012c }
        if (r0 == 0) goto L_0x0077;
    L_0x0112:
        r1.close();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0117 }
        goto L_0x0077;
    L_0x0117:
        r0 = move-exception;
        throw r0;
    L_0x0119:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x011b }
    L_0x011b:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x011d }
    L_0x011d:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x011f }
    L_0x011f:
        r0 = move-exception;
    L_0x0120:
        if (r1 == 0) goto L_0x012b;
    L_0x0122:
        r2 = r1.isOpen();	 Catch:{ SQLiteDatabaseCorruptException -> 0x012e }
        if (r2 == 0) goto L_0x012b;
    L_0x0128:
        r1.close();	 Catch:{ SQLiteDatabaseCorruptException -> 0x012e }
    L_0x012b:
        throw r0;
    L_0x012c:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0117 }
    L_0x012e:
        r0 = move-exception;
        throw r0;
    L_0x0130:
        r1 = move-exception;
        r5 = r1;
        r1 = r0;
        r0 = r5;
        goto L_0x0120;
    L_0x0135:
        r1 = move-exception;
        r5 = r1;
        r1 = r0;
        r0 = r5;
        goto L_0x0120;
    L_0x013a:
        r0 = move-exception;
        goto L_0x00c2;
    L_0x013c:
        r0 = move-exception;
        goto L_0x00a9;
    L_0x013f:
        r0 = move-exception;
        goto L_0x007f;
    L_0x0142:
        r0 = move-exception;
        r0 = r1;
        goto L_0x0063;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.azf.a(java.lang.String):boolean");
    }

    public void a(int i, byte[] bArr, String str, byte[] bArr2, byte[] bArr3) {
        this.i.put(new an8(str, bArr2), new a5o(i, bArr, bArr3));
    }

    public static File c() {
        boolean z = l5.s;
        File[] f = f();
        try {
            if (f.length == 0) {
                throw new IllegalStateException(z[169]);
            }
            int length = f.length;
            int i = 0;
            while (i < length) {
                File file = f[i];
                try {
                    if (file.exists()) {
                        Log.i(z[167] + file.getAbsolutePath());
                        return file;
                    }
                    int i2 = i + 1;
                    if (z) {
                        break;
                    }
                    i = i2;
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
            Log.i(z[168] + f[0].getAbsolutePath());
            return f[0];
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public int e() {
        return a(true).size();
    }

    @NonNull
    public static File[] f() {
        return new File[]{c, g};
    }

    public static String a() {
        return z[arj.Theme_seekBarStyle];
    }

    public void a(gj gjVar) {
        this.n = gjVar;
    }

    static HashMap a(azf com_whatsapp_azf) {
        return com_whatsapp_azf.i;
    }

    static {
        String[] strArr = new String[220];
        String str = "3^v\u0016S.";
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
                        i3 = 19;
                        break;
                    case at.g /*1*/:
                        i3 = 45;
                        break;
                    case at.i /*2*/:
                        i3 = 31;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_spinnerStyle;
                        break;
                    default:
                        i3 = 54;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    str = "~^x\u001fB|_zCZr^k\u000eWpFj\u001cPzAz\u0018_~H0\u0001SwD~3C}Li\r_\u007fL}\u0000S3";
                    obj = 1;
                    strArr2 = strArr3;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "~^x\u001fB|_zCZr^k\u000eWpFj\u001cPzAzCPzAzL";
                    obj = 2;
                    strArr2 = strArr3;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "~^x\u001fB|_zCDvL{ABrOs\t\u001b}Lr\tE<\r";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "Hqk0XO_3Lk";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "~^x\u001fB|_zCRf@oAW}I2\u001eS`Yp\u001eS<Iz\u000eCt\u0000}\u0019_\u007fI0\n_\u007fHlAX|Y2\bS\u007fHk\tR3";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "~^x\u001fB|_zCRf@oAW}I2\u001eS`Yp\u001eS<Iz\u000eCt\u0000}\u0019_\u007fI0\n_\u007fHlAX|Y2\bS\u007fHk\tR3";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "=^|\u0004S~L";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "1\rv\u001f\u0016";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "~^x\u001fB|_zCRf@oAW}I2\u001eS`Yp\u001eS<Iz\u000eCt\u0000}\u0019_\u007fI0\n_\u007fHlAX|Y2\bS\u007fHk\tR3";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "~^x\u001fB|_zCRf@oAW}I2\u001eS`Yp\u001eS<_z\rRzCxABrOs\t\u00166I0IR)\r:\u001f";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "~^x\u001fB|_zCRf@oAW}I2\u001eS`Yp\u001eS3K~\u0005ZvI?\u0018Y3Iz\u0000SgH?";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "~^x\u001fB|_zCRf@oAW}I2\u001eS`Yp\u001eS<K~\u0005ZvI?N";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "<Iz\u001a\u0019}Xs\u0000";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "~^x\u001fB|_zCRf@oAW}I2\u001eS`Yp\u001eS3K~\u0005ZvI?\u0018Y3Iz\u0000SgH?";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "~^x\u001fB|_zCRf@oAW}I2\u001eS`Yp\u001eS3K~\u0005ZvI?\u0018Y3Iz\u0000SgH?";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "~^x\u001fB|_zCRf@oAW}I2\u001eS`Yp\u001eS3K~\u0005ZvI?\u0018Y3Iz\u0000SgH?";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "=_z\rR3";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    str = "g@o3Rqr{\u0019[crk\rT\u007fH";
                    obj = 18;
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    strArr2 = strArr3;
                    str = "1\rv\u001f\u0016";
                    obj = 19;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "~^x\u001fB|_zCRf@oAW}I2\u001eS`Yp\u001eS<_~\u0018_|\r";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "LCz\u001b";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "~^x\u001fB|_zCRf@oAW}I2\u001eS`Yp\u001eS3K~\u0005ZvI?\u0018Y3Iz\u0000SgH?";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "1\r{\u0019[c\rl\u0005Lv\u0017";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "3Lq\b\u0016";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "~^x\u001fB|_zCRf@oAW}I2\u001eS`Yp\u001eS3K~\u0005ZvI?\u0018Y3Iz\u0000SgH?";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "<Iz\u001a\u0019}Xs\u0000";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "g@o3Rqr{\u0019[crl\u000f^v@~";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "~^x\u001fB|_zCRf@oAW}I2\u001eS`Yp\u001eS<]m\tFr_zLPrDs\tR3YpLRvAz\u0018S3";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "~^x\u001fB|_zCRf@oAW}I2\u001eS`Yp\u001eS3K~\u0005ZvI?\u0018Y3Iz\u0000SgH?";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    str = "~^x\u001fB|_zCRf@oAW}I2\u001eS`Yp\u001eS<Iz\u000eCt\u0000}\u0019_\u007fI0\n_\u007fHlAX|Y2\bS\u007fHk\tR3";
                    obj = 30;
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    strArr2 = strArr3;
                    str = "V_m\u0003D3Zw\u0005Zv\rm\tEgBm\u0005Xt\r{\u000epzAzL";
                    obj = 31;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "~^x\u001fB|_zCRf@oAW}I2\u001eS`Yp\u001eS<Iz\u000eCt\u0000}\u0019_\u007fI0\n_\u007fHlAX|Y2\bS\u007fHk\tR3";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "~^x\u001fB|_zCRf@oAW}I2\u001eS`Yp\u001eS<^j\u000fUv^lL\u0014";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "3Lq\b\u0016";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "~^x\u001fB|_zCRf@oAW}I2\u001eS`Yp\u001eS<_z\u001fC\u007fY?\u0003P3Np\u0001[rC{L\u0014";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "=Y~\u000eZv^";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "~^x\u001fB|_zCRf@oAW}I2\u001eS`Yp\u001eS3K~\u0005ZvI?\u0018Y3Iz\u0000SgH?";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "3Lq\b\u0016";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "~^x\u001fB|_zCRf@oAW}I2\u001eS`Yp\u001eS<Iz\u000eCt\u0000}\u0019_\u007fI0\n_\u007fHlAX|Y2\bS\u007fHk\tR3";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "~^x\u001fB|_zCRf@oAW}I2\u001eS`Yp\u001eS3K~\u0005ZvI?\u0018Y3Iz\u0000SgH?";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "1\rv\u001f\u0016";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "=Ij\u0001F3";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "\u007fD}\u001fG\u007fDk\t\u0016z^?\u0002Yg\ro\u001eS`Hq\u0018\u0016|C?\bSeD|\t\u001a3N~\u0002X|Y?\u001cSaKp\u001e[3Ij\u0001F3Lq\b\u0016aHl\u0018YaH1";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    str = "~^x\u001fB|_zCRf@oAW}I2\u001eS`Yp\u001eS<]m\tFr_zLPrDs\tR3YpLRvAz\u0018S3";
                    obj = 44;
                    i = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    strArr2 = strArr3;
                    str = "3Lq\b\u0016";
                    obj = 45;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "~^x\u001fB|_zCRf@oAW}I2\u001eS`Yp\u001eS3K~\u0005ZvI?\u0018Y3Iz\u0000SgH?";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "~^x\u001fB|_zCRf@oAW}I2\u001eS`Yp\u001eS<Iz\u000eCt\u0000}\u0019_\u007fI0\n_\u007fHlAX|Y2\bS\u007fHk\tR3";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "~^x\u001fB|_zCRf@oAW}I2\u001eS`Yp\u001eS<K~\u0005ZvI?N";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "~^x\u001fB|_zCRf@oAW}I2\u001eS`Yp\u001eS<Iz\u000eCt\u0000}\u0019_\u007fI0\n_\u007fHlAX|Y2\bS\u007fHk\tR3";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "~^x\u001fB|_zCRf@oAW}I2\u001eS`Yp\u001eS3Bm\u0005QzC~\u0000\u0016wLk\rTr^zLR|HlLX|Y?\tNz^kB";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "~^x\u001fB|_zCRf@oAW}I2\u001eS`Yp\u001eS3K~\u0005ZvI?\u0018Y3Iz\u0000SgH?";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "~^x\u001fB|_zCRf@oAW}I2\u001eS`Yp\u001eS<Bm\u0005Q3Cj\u0001Tv_?\u0003P3@z\u001fErJz\u001f\u00161";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    str = "~^x\u001fB|_zCRf@oAW}I2\u001eS`Yp\u001eS3K~\u0005ZvI?\u0018Y3Iz\u0000SgH?";
                    obj = 53;
                    i = 54;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    strArr2 = strArr3;
                    str = "~^x\u001fB|_zCRf@oAW}I2\u001eS`Yp\u001eS3I}*_\u007fH?\u0005E3";
                    obj = 54;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "3Lq\b\u0016";
                    obj = 55;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "3Lq\b\u0016";
                    obj = 56;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "3Lq\b\u0016";
                    obj = 57;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "~^x\u001fB|_zCRf@oAW}I2\u001eS`Yp\u001eS3K~\u0005ZvI?\u0018Y3Iz\u0000SgH?";
                    obj = 58;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "~^x\u001fB|_zCRf@oAW}I2\u001eS`Yp\u001eS3K~\u0005ZvI?\u0018Y3Iz\u0000SgH?";
                    obj = 59;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "~^x\u001fB|_zCRf@oAW}I2\u001eS`Yp\u001eS3K~\u0005ZvI?\u0018Y3Iz\u0000SgH?";
                    obj = 60;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "~^x\u001fB|_zCRf@oAW}I2\u001eS`Yp\u001eS<K~\u0005ZvI?N";
                    obj = 61;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "~^x\u001fB|_zCRf@oAW}I2\u001eS`Yp\u001eS3K~\u0005ZvI?\u0018Y3Iz\u0000SgH?";
                    obj = 62;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "=_z\rR3";
                    obj = 63;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "3Lq\b\u0016";
                    obj = 64;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "1\rv\u001f\u0016";
                    obj = 65;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "~^x\u001fB|_zARf@oAW}I2\u001eS`Yp\u001eS<Dx\u0002YaDq\u000b\u001bv@o\u0018O>Y~\u000eZv\u0000q\r[v";
                    obj = 66;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "`\\s\u0005Bv";
                    obj = 67;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    strArr2[i] = str;
                    i = 69;
                    str = "~^x\u001fB|_zCRf@oAW}I2\u001eS`Yp\u001eS3K~\u0005ZvI?\u0018Y3Iz\u0000SgH?";
                    obj = 68;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    strArr2[i] = str;
                    i = 70;
                    str = "~^x\u001fB|_zCRf@oAW}I2\u001eS`Yp\u001eS<^j\u000fUv^lL\u0014";
                    obj = 69;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeight /*69*/:
                    strArr2[i] = str;
                    i = 71;
                    str = "1\r{\u0019[c\rl\u0005Lv\u0017";
                    obj = 70;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightSmall /*70*/:
                    strArr2[i] = str;
                    i = 72;
                    str = "~^x\u001fB|_zCRf@oAW}I2\u001eS`Yp\u001eS3K~\u0005ZvI?\u0018Y3Iz\u0000SgH?";
                    obj = 71;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightLarge /*71*/:
                    strArr2[i] = str;
                    i = 73;
                    str = "3Lq\b\u0016";
                    obj = 72;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingLeft /*72*/:
                    strArr2[i] = str;
                    i = 74;
                    str = "~^x\u001fB|_zCRf@oAW}I2\u001eS`Yp\u001eS3^v\u0016S3ByLRf@oLPzAzL\u0014";
                    obj = 73;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingRight /*73*/:
                    strArr2[i] = str;
                    i = 75;
                    str = "~^x\u001fB|_zCRf@oAW}I2\u001eS`Yp\u001eS<]m\tFr_zLPrDs\tR3YpLRvAz\u0018S3";
                    obj = 74;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropDownListViewStyle /*74*/:
                    strArr2[i] = str;
                    i = 76;
                    str = "~^x\u001fB|_zCRf@oAW}I2\u001eS`Yp\u001eS3K~\u0005ZvI?\u0018Y3Iz\u0000SgH?";
                    obj = 75;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPopupWindowStyle /*75*/:
                    strArr2[i] = str;
                    i = 77;
                    str = "~^x\u001fB|_zCRf@oAW}I2\u001eS`Yp\u001eS<Cz\u001b\u0016}Xr\u000eSa\rp\n\u0016~Hl\u001fWtHlL\u0014";
                    obj = 76;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItem /*76*/:
                    strArr2[i] = str;
                    i = 78;
                    str = "~^x\u001fB|_zCRf@oAW}I2\u001eS`Yp\u001eS<^j\u000fUv^lL\u0014";
                    obj = 77;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItemSmall /*77*/:
                    strArr2[i] = str;
                    i = 79;
                    str = "3\u0005L\u0005Lv\u0017?";
                    obj = 78;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelBackground /*78*/:
                    strArr2[i] = str;
                    i = 80;
                    str = "~^x\u001fB|_zCRf@oAW}I2\u001eS`Yp\u001eS<Iz\u000eCt\u0000}\u0019_\u007fI0\n_\u007fHlAX|Y2\bS\u007fHk\tR3";
                    obj = 79;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListWidth /*79*/:
                    strArr2[i] = str;
                    i = 81;
                    str = "~^x\u001fB|_zCU\u007fH~\u0002Cc\u0000o\tD>Y~\u000eZv\u0000{\u0019[c\u0000y\u0005Zv\rv\u000bX|_v\u0002Q)\r";
                    obj = 80;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListTheme /*80*/:
                    strArr2[i] = str;
                    i = 82;
                    str = "ZcL)dG\rV\"b\\\rL=zZyZ3{R~K)d";
                    obj = 81;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listChoiceBackgroundIndicator /*81*/:
                    strArr2[i] = str;
                    i = 83;
                    str = "P\u007fZ-bV\rK-t_h?";
                    obj = 82;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimary /*82*/:
                    strArr2[i] = str;
                    i = 84;
                    str = "=Yr\u001c";
                    obj = 83;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimaryDark /*83*/:
                    strArr2[i] = str;
                    i = 85;
                    str = "~^x\u001fB|_zCU\u007fH~\u0002Cc\u0000o\tD>Y~\u000eZv\u0000{\u0019[c\u0000y\u0005Zv\ry\r_\u007fH{LB|\r{\tZvYzL";
                    obj = 84;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorAccent /*84*/:
                    strArr2[i] = str;
                    i = 86;
                    str = "~^x\u001fB|_zCU\u007fH~\u0002Cc\u0000o\tD>Y~\u000eZv\u0000{\u0019[c\u0000y\u0005Zv\r";
                    obj = 85;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlNormal /*85*/:
                    strArr2[i] = str;
                    i = 87;
                    str = "AbS tRnTW";
                    obj = 86;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlActivated /*86*/:
                    strArr2[i] = str;
                    i = 88;
                    str = "P\u007fZ-bV\rK-t_h?K{V~L-qV~@*b@r";
                    obj = 87;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlHighlight /*87*/:
                    strArr2[i] = str;
                    i = 89;
                    str = "~^x\u001fB|_zCU\u007fH~\u0002Cc\u0000o\tD>Y~\u000eZv\u0000{\u0019[c\u0000y\u0005Zv\r|\u001eSrYv\u0003X3ByL@z_k\u0019W\u007f\rk\rT\u007fH?\u0001S`^~\u000bS`ry\u0018E3Zv\u0000Z3Y~\u0007S3N~\u001eS3ByLB{Dl@\u0016zJq\u0003DzCxV\u0016";
                    obj = 88;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorButtonNormal /*88*/:
                    strArr2[i] = str;
                    i = 90;
                    str = "~^x\u001fB|_zCU\u007fH~\u0002Cc\u0000o\tD>Y~\u000eZv\u0000{\u0019[c\u0000y\u0005Zv\r{\tZvYv\u0002Q3";
                    obj = 89;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorSwitchThumbNormal /*89*/:
                    strArr2[i] = str;
                    i = 91;
                    str = "~^x\u001fB|_zCU\u007fH~\u0002Cc\u0000o\tD>Y~\u000eZv\u0000{\u0019[c\u0000y\u0005Zv\rk\u001eW}^~\u000fBzBqLEgLm\u0018Sw\u0001?\u0005Q}Bm\u0005Xt\u0017?";
                    obj = 90;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_controlBackground /*90*/:
                    strArr2[i] = str;
                    i = 92;
                    str = "~^x\u001fB|_zCU\u007fH~\u0002Cc\u0000o\tD>Y~\u000eZv\u0000{\u0019[c\u0000y\u0005Zv\rm\tF\u007fL|\u0005Xt\ry\u0003Z\u007fBh\u0005Xt\rl\u0018WgHr\tXg\rh\u0005B{\r8\u000fY~@v\u0018\u0016g_~\u0002ErNk\u0005Y}\n%L";
                    obj = 91;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogStyle /*91*/:
                    strArr2[i] = str;
                    i = 93;
                    str = "AbS tRnTW";
                    obj = 92;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogButtonGroupStyle /*92*/:
                    strArr2[i] = str;
                    i = 94;
                    str = "PbR!\u007fG\rK>w]~^/bZbQW";
                    obj = 93;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogCenterButtons /*93*/:
                    strArr2[i] = str;
                    i = 95;
                    str = "~^x\u001fB|_zCTrNt\u0019F<O~\u001fSuDs\tiwHs\tBv\r";
                    obj = 94;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogTheme /*94*/:
                    strArr2[i] = str;
                    i = 96;
                    str = "~^x\u001fB|_zCTrNt\u0019F";
                    obj = 95;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorAlertDialogListItem /*95*/:
                    strArr2[i] = str;
                    i = 97;
                    str = "~^x\u001fB|_zCTrNt\u0019F";
                    obj = 96;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarPositiveButtonStyle /*96*/:
                    strArr2[i] = str;
                    i = 98;
                    str = "~^x\u001fB|_zCTrNt\u0019F<Bj\u0018\u001b|K2\u001fFrNz";
                    obj = 97;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNegativeButtonStyle /*97*/:
                    strArr2[i] = str;
                    i = 99;
                    str = "~^x\u001fB|_zCTrNt\u0019F<Fz\u0015\u0019v_m\u0003D";
                    obj = 98;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNeutralButtonStyle /*98*/:
                    strArr2[i] = str;
                    i = 100;
                    str = "~^x\u001fB|_zCTrNt\u0019F3Q?\u0018_~H?\u001fFvCkV\u0016";
                    obj = 99;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_autoCompleteTextViewStyle /*99*/:
                    strArr2[i] = str;
                    i = arj.Theme_buttonStyleSmall;
                    str = "~^x\u001fB|_zCTrNt\u0019F<Nm\tWgH{\u0005D";
                    obj = 100;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyle /*100*/:
                    strArr2[i] = str;
                    i = arj.Theme_checkboxStyle;
                    str = "~^x\u001fB|_zCTrNt\u0019F<YpL";
                    obj = arj.Theme_buttonStyleSmall;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyleSmall /*101*/:
                    strArr2[i] = str;
                    i = arj.Theme_checkedTextViewStyle;
                    str = "~^x\u001fB|_zLTrNt\u0019F3Yv\u0001S3^o\tXg\u0017?I\u0018!K";
                    obj = arj.Theme_checkboxStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_checkboxStyle /*102*/:
                    strArr2[i] = str;
                    i = arj.Theme_editTextStyle;
                    str = "~^x\u001fB|_zCTrNt\u0019F<^t\u0005F3CpL[vIv\r\u0016|_?\u001eSrI2\u0003X\u007fT?\u0001SwD~";
                    obj = arj.Theme_checkedTextViewStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_checkedTextViewStyle /*103*/:
                    strArr2[i] = str;
                    i = arj.Theme_radioButtonStyle;
                    str = "~^x\u001fB|_zCTrNt\u0019F<^v\u0016S3";
                    obj = arj.Theme_editTextStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextStyle /*104*/:
                    strArr2[i] = str;
                    i = arj.Theme_ratingBarStyle;
                    str = "~^x\u001fB|_zCTrNt\u0019F<YpL";
                    obj = arj.Theme_radioButtonStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_radioButtonStyle /*105*/:
                    strArr2[i] = str;
                    i = arj.Theme_seekBarStyle;
                    str = "~^x\u001fB|_zBRq";
                    obj = arj.Theme_ratingBarStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_ratingBarStyle /*106*/:
                    strArr2[i] = str;
                    i = arj.Theme_spinnerStyle;
                    str = "~^x\u001fB|_zCDvDq\bSk\u0002|\u0003X`Ym\r_}Yz\u0014Uv]k\u0005Y}\r";
                    obj = arj.Theme_seekBarStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_seekBarStyle /*107*/:
                    strArr2[i] = str;
                    i = arj.Theme_switchStyle;
                    str = "fC~\u000eZv\rk\u0003\u0016|]z\u0002";
                    obj = arj.Theme_spinnerStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerStyle /*108*/:
                    strArr2[i] = str;
                    i = 110;
                    str = "AhV\"rVu?";
                    obj = arj.Theme_switchStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_switchStyle /*109*/:
                    strArr2[i] = str;
                    i = 111;
                    str = "~^x\u001fB|_zCDvDq\bSk";
                    obj = 110;
                    strArr2 = strArr3;
                    break;
                case 110:
                    strArr2[i] = str;
                    i = 112;
                    str = "~^x\u001fB|_zCDvDq\bSk\u0002{\u000eU|_m\u0019Fg";
                    obj = 111;
                    strArr2 = strArr3;
                    break;
                case 111:
                    strArr2[i] = str;
                    i = 113;
                    str = "~^x\u001fB|_zCDvDq\bSk\rcLBz@zLEcHq\u0018\f";
                    obj = 112;
                    strArr2 = strArr3;
                    break;
                case 112:
                    strArr2[i] = str;
                    i = 114;
                    str = "rYk\t[cY?\u0018Y3Zm\u0005Bv\r~LDvL{\u0003X\u007fT?\bWgL}\rEv";
                    obj = 113;
                    strArr2 = strArr3;
                    break;
                case 113:
                    strArr2[i] = str;
                    i = 115;
                    str = "Z~PA\u000e+\u0018&A\u0007";
                    obj = 114;
                    strArr2 = strArr3;
                    break;
                case 114:
                    strArr2[i] = str;
                    i = 116;
                    str = "WXr\u001c\u0016rC{LDv^k\u0003Dv\ry\r_\u007fH{LWuYz\u001e\u0016aHv\u0002RvU?\nWzAz\b";
                    obj = 115;
                    strArr2 = strArr3;
                    break;
                case 115:
                    strArr2[i] = str;
                    i = 117;
                    str = "=Nm\u0015Fg";
                    obj = 116;
                    strArr2 = strArr3;
                    break;
                case 116:
                    strArr2[i] = str;
                    i = 118;
                    str = "~^x\u001fB|_zCDv^k\u0003Dv\u0002v\u0002\u0019zBz\u001eD|_?";
                    obj = 117;
                    strArr2 = strArr3;
                    break;
                case 117:
                    strArr2[i] = str;
                    i = 119;
                    str = "pBrBA{Lk\u001fWc]@\u001cDvKz\u001eS}Nz\u001f";
                    obj = 118;
                    strArr2 = strArr3;
                    break;
                case 118:
                    strArr2[i] = str;
                    i = 120;
                    str = "=Nm\u0015Fg\u001b";
                    obj = 119;
                    strArr2 = strArr3;
                    break;
                case 119:
                    strArr2[i] = str;
                    i = 121;
                    str = "~^x\u001fB|_zCDv^k\u0003Dv\u0002v\u0002\u0019zBz\u001eD|_?";
                    obj = 120;
                    strArr2 = strArr3;
                    break;
                case 120:
                    strArr2[i] = str;
                    i = 122;
                    str = "~^x\u001fB|_zCDv^k\u0003Dv\u0002m\t_}Iz\u0014Dv^j\u0000B<I}\u0005XgHx\u001e_gT?";
                    obj = 121;
                    strArr2 = strArr3;
                    break;
                case 121:
                    strArr2[i] = str;
                    i = 123;
                    str = "~^x\u001fB|_zCDv^k\u0003Dv\u0002|\u0003Fj\r";
                    obj = 122;
                    strArr2 = strArr3;
                    break;
                case 122:
                    strArr2[i] = str;
                    i = 124;
                    str = "=Nm\u0015Fg\u0019";
                    obj = 123;
                    strArr2 = strArr3;
                    break;
                case 123:
                    strArr2[i] = str;
                    i = 125;
                    str = "=Nm\u0015Fg\u001f";
                    obj = 124;
                    strArr2 = strArr3;
                    break;
                case 124:
                    strArr2[i] = str;
                    i = 126;
                    str = "~^x\u001fB|_zCDv^k\u0003Dv\u0002z\u0002UaTo\u0018Swry\u0005Zvrq\u0003BL^j\u001cF|_k\tR3\u0005l\u0007_c\u0004";
                    obj = 125;
                    strArr2 = strArr3;
                    break;
                case 125:
                    strArr2[i] = str;
                    i = 127;
                    str = "~^x\u001fB|_zCDv^k\u0003Dv\u0002m\t_}Iz\u0014\u0019xHfV\u0016";
                    obj = 126;
                    strArr2 = strArr3;
                    break;
                case 126:
                    strArr2[i] = str;
                    i = 128;
                    str = "3Bt";
                    obj = 127;
                    strArr2 = strArr3;
                    break;
                case 127:
                    strArr2[i] = str;
                    i = 129;
                    str = "~^x\u001fB|_zCDv^k\u0003Dv\u0002v\u0003Sa_p\u001e\u0016";
                    obj = 128;
                    strArr2 = strArr3;
                    break;
                case 128:
                    strArr2[i] = str;
                    i = 130;
                    str = "3K~\u0005ZvI";
                    obj = 129;
                    strArr2 = strArr3;
                    break;
                case 129:
                    strArr2[i] = str;
                    i = 131;
                    str = "~^x\u001fB|_zCDv^k\u0003Dv\u0002t\tO3";
                    obj = 130;
                    strArr2 = strArr3;
                    break;
                case 130:
                    strArr2[i] = str;
                    i = 132;
                    str = "3Dq\bSk\u0010";
                    obj = 131;
                    strArr2 = strArr3;
                    break;
                case 131:
                    strArr2[i] = str;
                    i = 133;
                    str = "~^x\u001fB|_zCDv^k\u0003Dv\u0002v\u0002\u0019zBz\u001eD|_?";
                    obj = 132;
                    strArr2 = strArr3;
                    break;
                case 132:
                    strArr2[i] = str;
                    i = 134;
                    str = "=Nm\u0015Fg\u001a";
                    obj = 133;
                    strArr2 = strArr3;
                    break;
                case 133:
                    strArr2[i] = str;
                    i = 135;
                    str = "=Nm\u0015Fg\u0015";
                    obj = 134;
                    strArr2 = strArr3;
                    break;
                case 134:
                    strArr2[i] = str;
                    i = 136;
                    str = "ULv\u0000Sw\rk\u0003\u0016`HkLfAhY3{RdQ8wZc@(tLdQ8sT\u007fV8o3YpLBaXz@\u0016wLv\u0000O3O~\u000f]f]lLAzAsLX|Y?\u000bY3Yw\u001eYfJwLRf@o-Xw\u007fz\u001fB|_zL\u001egB?\u0001WzCk\r_}\rv\u0002BvJm\u0005Bj\u00043LE|\u0001?\u0018^vT?\u0001_tEkLWpNj\u0001C\u007fLk\t\u0016zCk\tQaDk\u0015\u0016z^l\u0019S`\rp\u001aSa\rk\u0005[v\u0001?\u0018^z^?\u0005E3Cp\u0018\u0016uLk\rZ=";
                    obj = 135;
                    strArr2 = strArr3;
                    break;
                case 135:
                    strArr2[i] = str;
                    i = 137;
                    str = "3^v\u0016S)\r";
                    obj = 136;
                    strArr2 = strArr3;
                    break;
                case 136:
                    strArr2[i] = str;
                    i = 138;
                    str = "~^x\u001fB|_zCDv^k\u0003Dv\u0002m\tEfAkC";
                    obj = 137;
                    strArr2 = strArr3;
                    break;
                case 137:
                    strArr2[i] = str;
                    i = 139;
                    str = "=Nm\u0015Fg\u001e";
                    obj = 138;
                    strArr2 = strArr3;
                    break;
                case 138:
                    strArr2[i] = str;
                    i = 140;
                    str = "~^x\u001fB|_zCDv^k\u0003Dv\u0002v\u0003Sa_p\u001e\u0016";
                    obj = 139;
                    strArr2 = strArr3;
                    break;
                case 139:
                    strArr2[i] = str;
                    i = 141;
                    str = "~^x\u001fB|_zCDv^k\u0003Dv\u0002z\u001eD|_lCU|Xq\u0018\u0016";
                    obj = 140;
                    strArr2 = strArr3;
                    break;
                case 140:
                    strArr2[i] = str;
                    i = 142;
                    str = "~^x\u001fB|_zCDv^k\u0003Dv\u0002m\t_}Iz\u0014Dv^j\u0000B<_z\u0005XwHg\tR3";
                    obj = 141;
                    strArr2 = strArr3;
                    break;
                case 141:
                    strArr2[i] = str;
                    i = 143;
                    str = "=Nm\u0015Fg\u0018";
                    obj = 142;
                    strArr2 = strArr3;
                    break;
                case 142:
                    strArr2[i] = str;
                    i = 144;
                    str = "~^x\u001fB|_zCDv^k\u0003Dv\u0002v\u0003Sa_p\u001e\u0016";
                    obj = 143;
                    strArr2 = strArr3;
                    break;
                case 143:
                    strArr2[i] = str;
                    i = 145;
                    str = "|F";
                    obj = 144;
                    strArr2 = strArr3;
                    break;
                case 144:
                    strArr2[i] = str;
                    i = 146;
                    str = "uLv\u0000Sw";
                    obj = 145;
                    strArr2 = strArr3;
                    break;
                case 145:
                    strArr2[i] = str;
                    i = 147;
                    str = "WLk\rTr^zLDvDq\bSkDq\u000b\u0016uLv\u0000Sw";
                    obj = 146;
                    strArr2 = strArr3;
                    break;
                case 146:
                    strArr2[i] = str;
                    i = 148;
                    str = "~^x\u001fB|_zCDv^k\u0003Dv\u0002o\rDr@lCXfAs";
                    obj = 147;
                    strArr2 = strArr3;
                    break;
                case 147:
                    strArr2[i] = str;
                    i = 149;
                    str = "~^x\u001fB|_zCDv^k\u0003Dv\u0002v\u0002\u0019zBz\u001eD|_?";
                    obj = 148;
                    strArr2 = strArr3;
                    break;
                case 148:
                    strArr2[i] = str;
                    i = 150;
                    str = "~Lv\u0002BrDq3Rqrv\u0002BvJm\u0005Bj";
                    obj = 149;
                    strArr2 = strArr3;
                    break;
                case 149:
                    strArr2[i] = str;
                    i = 151;
                    str = "~^x\u001fB|_zCDv^k\u0003Dv\u0002v\u0003Sa_p\u001e\u0016";
                    obj = 150;
                    strArr2 = strArr3;
                    break;
                case 150:
                    strArr2[i] = str;
                    i = 152;
                    str = "~^x\u001fB|_zCDv^k\u0003Dv\u0002z\u001eD|_";
                    obj = 151;
                    strArr2 = strArr3;
                    break;
                case 151:
                    strArr2[i] = str;
                    i = 153;
                    str = "~^x\u001fB|_zCDv^k\u0003Dv\u0002{\u0019[clq\bdv^k\u0003Dv\u007fz\u001fC\u007fY0";
                    obj = 152;
                    strArr2 = strArr3;
                    break;
                case 152:
                    strArr2[i] = str;
                    i = 154;
                    str = "=Nm\u0015Fg\u0014";
                    obj = 153;
                    strArr2 = strArr3;
                    break;
                case 153:
                    strArr2[i] = str;
                    i = 155;
                    str = "3Bk\u0004Sa\u0010";
                    obj = 154;
                    strArr2 = strArr3;
                    break;
                case 154:
                    strArr2[i] = str;
                    i = 156;
                    str = "3\u0005";
                    obj = 155;
                    strArr2 = strArr3;
                    break;
                case 155:
                    strArr2[i] = str;
                    i = 157;
                    str = "~^x\u001fB|_zCDv^k\u0003Dv\u0002}\rUxXo\n_\u007fHlL\u0006";
                    obj = 156;
                    strArr2 = strArr3;
                    break;
                case 156:
                    strArr2[i] = str;
                    i = 158;
                    str = "~^x\u001fB|_zCDv^k\u0003Dv\u0002l\u0019UpHl\u001f\u0016";
                    obj = 157;
                    strArr2 = strArr3;
                    break;
                case 157:
                    strArr2[i] = str;
                    i = 159;
                    str = "~^x\u001fB|_zCDv^k\u0003Dv\u0002q\u0003B{Dq\u000b\u001baHl\u0018YaH{";
                    obj = 158;
                    strArr2 = strArr3;
                    break;
                case 158:
                    strArr2[i] = str;
                    i = 160;
                    str = "~^x\u001fB|_zCDv^k\u0003Dv\u0002";
                    obj = 159;
                    strArr2 = strArr3;
                    break;
                case 159:
                    strArr2[i] = str;
                    i = 161;
                    str = "rYk\t[cYv\u0002Q>Zv\u0018^>_z\u001cWz_2\b_`L}\u0000Sw";
                    obj = 160;
                    strArr2 = strArr3;
                    break;
                case 160:
                    strArr2[i] = str;
                    i = 162;
                    str = "~^x\u001fB|_zCDv^k\u0003Dv\u0002y\r_\u007fXm\t\u0016";
                    obj = 161;
                    strArr2 = strArr3;
                    break;
                case 161:
                    strArr2[i] = str;
                    i = 163;
                    str = "~^x\u001fB|_zCDv^k\u0003Dv\u0002}\rUxXo\n_\u007fHlL";
                    obj = 162;
                    strArr2 = strArr3;
                    break;
                case 162:
                    strArr2[i] = str;
                    i = 164;
                    str = "rYk\t[cYv\u0002Q>Zv\u0018^>_z\u001cWz_2\tXrOs\tR";
                    obj = 163;
                    strArr2 = strArr3;
                    break;
                case 163:
                    strArr2[i] = str;
                    i = 165;
                    str = "~^x\u001fB|_zCT\u007fB|\u0007bzAs%XgHm\u0002W\u007f~k\u0003DrJz%ER[~\u0005ZrOs\t";
                    obj = 164;
                    strArr2 = strArr3;
                    break;
                case 164:
                    strArr2[i] = str;
                    i = 166;
                    str = "`]~\u000fS]Hz\bSwdq.OgHl";
                    obj = 165;
                    strArr2 = strArr3;
                    break;
                case 165:
                    strArr2[i] = str;
                    i = 167;
                    str = "~^x\u001fB|_zCQvY2\u0000WgHl\u0018\u001bwO2\u000eWpFj\u001c\u001buBmAQw_v\u001aS3";
                    obj = 166;
                    strArr2 = strArr3;
                    break;
                case 166:
                    strArr2[i] = str;
                    i = 168;
                    str = "~^x\u001fB|_zCQvY2\u0000WgHl\u0018\u001bwO2\u000eWpFj\u001c\u001buBmAQw_v\u001aS<CpAPzAzASkDl\u0018E3";
                    obj = 167;
                    strArr2 = strArr3;
                    break;
                case 167:
                    strArr2[i] = str;
                    i = 169;
                    str = "~^x\u001fB|_zCTrNt\u0019F<Av\u001fB>ByATrNt\u0019F>Kv\u0000S`\u0000v\u001f\u001b}Xs\u0000";
                    obj = 168;
                    strArr2 = strArr3;
                    break;
                case 168:
                    strArr2[i] = str;
                    i = 170;
                    str = "~^x\u001fB|_zCZr^k\u000eWpFj\u001cPzAz\u0018_~H";
                    obj = 169;
                    strArr2 = strArr3;
                    break;
                case 169:
                    strArr2[i] = str;
                    i = 171;
                    str = "=Nm\u0015Fg\u001b";
                    obj = 170;
                    strArr2 = strArr3;
                    break;
                case 170:
                    strArr2[i] = str;
                    i = 172;
                    str = "~^x\u001fB|_zCQvYt\tO`Kp\u001eTrNt\u0019F`\u0002q\u0003\u001bpDo\u0004Sa\u0002l\u0007_c";
                    obj = 171;
                    strArr2 = strArr3;
                    break;
                case 171:
                    strArr2[i] = str;
                    i = 173;
                    str = "~^x\u001fB|_zCQvYt\tO`\u0002l\u0005Lv\r";
                    obj = 172;
                    strArr2 = strArr3;
                    break;
                case 172:
                    strArr2[i] = str;
                    i = 174;
                    str = "=Nm\u0015Fg\u0015";
                    obj = 173;
                    strArr2 = strArr3;
                    break;
                case 173:
                    strArr2[i] = str;
                    i = 175;
                    str = "=Nm\u0015Fg\u001a";
                    obj = 174;
                    strArr2 = strArr3;
                    break;
                case 174:
                    strArr2[i] = str;
                    i = 176;
                    str = "=Nm\u0015Fg\u001b";
                    obj = 175;
                    strArr2 = strArr3;
                    break;
                case 175:
                    strArr2[i] = str;
                    i = 177;
                    str = "=Nm\u0015Fg\u0014";
                    obj = 176;
                    strArr2 = strArr3;
                    break;
                case 176:
                    strArr2[i] = str;
                    i = 178;
                    str = "3\u0005}\rUxXo\u001f\u000b";
                    obj = 177;
                    strArr2 = strArr3;
                    break;
                case 177:
                    strArr2[i] = str;
                    i = 179;
                    str = "Z~PA\u000e+\u0018&A\u0007";
                    obj = 178;
                    strArr2 = strArr3;
                    break;
                case 178:
                    strArr2[i] = str;
                    i = 180;
                    str = "=Nm\u0015Fg\u0015";
                    obj = 179;
                    strArr2 = strArr3;
                    break;
                case 179:
                    strArr2[i] = str;
                    i = 181;
                    str = "=Nm\u0015Fg";
                    obj = 180;
                    strArr2 = strArr3;
                    break;
                case 180:
                    strArr2[i] = str;
                    i = 182;
                    str = "=Nm\u0015Fg\u0018";
                    obj = 181;
                    strArr2 = strArr3;
                    break;
                case 181:
                    strArr2[i] = str;
                    i = 183;
                    str = "=Nm\u0015Fg\u0015";
                    obj = 182;
                    strArr2 = strArr3;
                    break;
                case 182:
                    strArr2[i] = str;
                    i = 184;
                    str = "=Nm\u0015Fg\u0019";
                    obj = 183;
                    strArr2 = strArr3;
                    break;
                case 183:
                    strArr2[i] = str;
                    i = 185;
                    str = "=Nm\u0015Fg\u0019";
                    obj = 184;
                    strArr2 = strArr3;
                    break;
                case 184:
                    strArr2[i] = str;
                    i = 186;
                    str = "=Nm\u0015Fg\u0014";
                    obj = 185;
                    strArr2 = strArr3;
                    break;
                case 185:
                    strArr2[i] = str;
                    i = 187;
                    str = "=Nm\u0015Fg\u001e";
                    obj = 186;
                    strArr2 = strArr3;
                    break;
                case 186:
                    strArr2[i] = str;
                    i = 188;
                    str = "=Nm\u0015Fg";
                    obj = 187;
                    strArr2 = strArr3;
                    break;
                case 187:
                    strArr2[i] = str;
                    i = 189;
                    str = "=Nm\u0015Fg\u001a";
                    obj = 188;
                    strArr2 = strArr3;
                    break;
                case 188:
                    strArr2[i] = str;
                    i = 190;
                    str = "=Nm\u0015Fg\u0018";
                    obj = 189;
                    strArr2 = strArr3;
                    break;
                case 189:
                    strArr2[i] = str;
                    i = 191;
                    str = "=Nm\u0015Fg\u0014";
                    obj = 190;
                    strArr2 = strArr3;
                    break;
                case 190:
                    strArr2[i] = str;
                    i = 192;
                    str = "=Nm\u0015Fg\u001b";
                    obj = 191;
                    strArr2 = strArr3;
                    break;
                case 191:
                    strArr2[i] = str;
                    i = 193;
                    str = "=Nm\u0015Fg\u001a";
                    obj = 192;
                    strArr2 = strArr3;
                    break;
                case 192:
                    strArr2[i] = str;
                    i = 194;
                    str = "=Nm\u0015Fg\u001f";
                    obj = 193;
                    strArr2 = strArr3;
                    break;
                case 193:
                    strArr2[i] = str;
                    i = 195;
                    str = "=Nm\u0015Fg\u001b";
                    obj = 194;
                    strArr2 = strArr3;
                    break;
                case 194:
                    strArr2[i] = str;
                    i = 196;
                    str = "=Nm\u0015Fg\u001f";
                    obj = 195;
                    strArr2 = strArr3;
                    break;
                case 195:
                    strArr2[i] = str;
                    i = 197;
                    str = "=Nm\u0015Fg\u001e";
                    obj = 196;
                    strArr2 = strArr3;
                    break;
                case 196:
                    strArr2[i] = str;
                    i = 198;
                    str = "AbS tRnTW";
                    obj = 197;
                    strArr2 = strArr3;
                    break;
                case 197:
                    strArr2[i] = str;
                    i = 199;
                    str = "~^x\u001fB|_zCRf@oAW}I2\u001eS`Yp\u001eS3Nm\tWgDp\u0002\u0016|K?\u001a_aYj\rZ3Y~\u000eZv\rr\tE`Lx\tELKk\u001f\u0016dDs\u0000\u0016gLt\t\u0016pLm\t\u0016|K?\u0018^z^3L_tCp\u001e_}J%L";
                    obj = 198;
                    strArr2 = strArr3;
                    break;
                case 198:
                    strArr2[i] = str;
                    i = 200;
                    str = "=Yr\u001c";
                    obj = 199;
                    strArr2 = strArr3;
                    break;
                case 199:
                    strArr2[i] = str;
                    i = 201;
                    str = "P\u007fZ-bV\rK-t_h?K{V~L-qV~@*b@r";
                    obj = 200;
                    strArr2 = strArr3;
                    break;
                case 200:
                    strArr2[i] = str;
                    i = 202;
                    str = "PbR!\u007fG\rK>w]~^/bZbQW";
                    obj = 201;
                    strArr2 = strArr3;
                    break;
                case 201:
                    strArr2[i] = str;
                    i = 203;
                    str = "~^x\u001fB|_zCU|Ci\tDg\u0000m\u0003Z\u007fO~\u000f]>YpAU|@r\u0005B3_z\u001cZrNv\u0002Q3Kp\u0000Z|Zv\u0002Q3^k\rBv@z\u0002B3Zv\u0018^3\n|\u0003[~DkLBaLq\u001fWpYv\u0003X4\u0017?";
                    obj = 202;
                    strArr2 = strArr3;
                    break;
                case 202:
                    strArr2[i] = str;
                    i = 204;
                    str = "~^x\u001fB|_zCU|Ci\tDg\u0000m\u0003Z\u007fO~\u000f]>YpAU|@r\u0005B3Iz\u0000SgDq\u000b\u0016";
                    obj = 203;
                    strArr2 = strArr3;
                    break;
                case 203:
                    strArr2[i] = str;
                    i = 205;
                    str = "AbS tRnTW";
                    obj = 204;
                    strArr2 = strArr3;
                    break;
                case 204:
                    strArr2[i] = str;
                    i = 206;
                    str = "~^x\u001fB|_zCU|Ci\tDg\u0000m\u0003Z\u007fO~\u000f]>YpAU|@r\u0005B3K~\u0005ZvI?\u0018Y3Iz\u0000SgH?";
                    obj = 205;
                    strArr2 = strArr3;
                    break;
                case 205:
                    strArr2[i] = str;
                    i = 207;
                    str = "~^x\u001fB|_zCTrNt\u0019F<Yp\u0003i|A{L";
                    obj = 206;
                    strArr2 = strArr3;
                    break;
                case 206:
                    strArr2[i] = str;
                    i = 208;
                    str = "~^x\u001fB|_zCTrNt\u0019F<Iz\u0000SgH?";
                    obj = 207;
                    strArr2 = strArr3;
                    break;
                case 207:
                    strArr2[i] = str;
                    i = 209;
                    str = "~^x\u001fB|_zBRq\u0003|\u001eOcY";
                    obj = 208;
                    strArr2 = strArr3;
                    break;
                case 208:
                    strArr2[i] = str;
                    i = 210;
                    str = "~^x\u001fB|_zBRq\u0003|\u001eOcY,";
                    obj = 209;
                    strArr2 = strArr3;
                    break;
                case 209:
                    strArr2[i] = str;
                    i = 211;
                    str = "~^x\u001fB|_zBRq\u0003|\u001eOcY(";
                    obj = 210;
                    strArr2 = strArr3;
                    break;
                case 210:
                    strArr2[i] = str;
                    i = 212;
                    str = "~^x\u001fB|_zBRq\u0003|\u001eOcY&";
                    obj = 211;
                    strArr2 = strArr3;
                    break;
                case 211:
                    strArr2[i] = str;
                    i = 213;
                    str = "~^x\u001fB|_zBRq\u0003|\u001eOcY)";
                    obj = 212;
                    strArr2 = strArr3;
                    break;
                case 212:
                    strArr2[i] = str;
                    i = 214;
                    str = "~^x\u001fB|_zBRq";
                    obj = 213;
                    strArr2 = strArr3;
                    break;
                case 213:
                    strArr2[i] = str;
                    i = 215;
                    str = "WLk\rTr^z\u001f";
                    obj = 214;
                    strArr2 = strArr3;
                    break;
                case 214:
                    strArr2[i] = str;
                    i = 216;
                    str = "~^x\u001fB|_zBRq\u0003|\u001eOcY-";
                    obj = 215;
                    strArr2 = strArr3;
                    break;
                case 215:
                    strArr2[i] = str;
                    i = 217;
                    str = "~^x\u001fB|_zBRq\u0003|\u001eOcY+";
                    obj = 216;
                    strArr2 = strArr3;
                    break;
                case 216:
                    strArr2[i] = str;
                    i = 218;
                    str = "~^x\u001fB|_zBRq\u0003|\u001eOcY*";
                    obj = 217;
                    strArr2 = strArr3;
                    break;
                case 217:
                    strArr2[i] = str;
                    i = 219;
                    str = "~^x\u001fB|_zBRq\u0003|\u001eOcY'";
                    obj = 218;
                    strArr2 = strArr3;
                    break;
                case 218:
                    strArr2[i] = str;
                    z = strArr3;
                    j = new File(App.a3, z[215]);
                    f = new File(j, z[209]);
                    d = new File(j, z[216]);
                    a = new File(j, z[210]);
                    h = new File(j, z[217]);
                    m = new File(j, z[218]);
                    b = new File(j, z[213]);
                    e = new File(j, z[211]);
                    g = new File(j, z[219]);
                    c = new File(j, z[212]);
                    l = new File(j, z[214]);
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "VUk\tD}LsL[vIv\r\u0016}BkLDvL{\rT\u007fH";
                    obj = null;
                    break;
            }
        }
    }

    private static String[] g(@NonNull File file) {
        boolean z = l5.s;
        String[] split = TextUtils.split(fn.a(new FileInputStream(file)), z[5]);
        List arrayList = new ArrayList();
        int length = split.length;
        int i = 0;
        while (i < length) {
            String trim = split[i].trim();
            try {
                if (trim.length() > 0) {
                    arrayList.add(trim);
                }
                i++;
                if (z) {
                    break;
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        Log.i(z[4] + TextUtils.join(",", arrayList));
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
