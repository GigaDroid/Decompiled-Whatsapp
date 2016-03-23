package com.whatsapp.messaging;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.hx;
import com.whatsapp.App;
import com.whatsapp.App.Me;
import com.whatsapp.ChangeNumber;
import com.whatsapp.Voip;
import com.whatsapp.aqu;
import com.whatsapp.arj;
import com.whatsapp.awx;
import com.whatsapp.phoneid.a;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.proto.Wa20.ClientPayload;
import com.whatsapp.proto.Wa20.ClientPayload.UserAgent;
import com.whatsapp.proto.Wa20.ClientPayload.UserAgent.AppVersion.Builder;
import com.whatsapp.proto.Wa20.ClientPayload.UserAgent.Platform;
import com.whatsapp.proto.Wa20.ClientPayload.UserAgent.ReleaseChannel;
import com.whatsapp.proto.Wa20.ClientPayload.WebInfo;
import com.whatsapp.proto.Wa20.ClientPayload.WebInfo.WebdPayload;
import com.whatsapp.protocol.b3;
import com.whatsapp.protocol.bc;
import com.whatsapp.protocol.by;
import com.whatsapp.protocol.c3;
import com.whatsapp.protocol.cw;
import com.whatsapp.protocol.cz;
import com.whatsapp.util.Log;
import com.whatsapp.util.a_;
import com.whatsapp.ve;
import java.net.Socket;
import java.util.List;
import java.util.Random;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

final class ah extends HandlerThread {
    private static int h;
    private static final String[] z;
    private final av a;
    private aa b;
    private final Random c;
    private q d;
    private Socket e;
    private boolean f;
    private final ar g;
    private v i;
    private final av j;
    private final av k;
    private by l;
    private final Context m;
    private ag n;

    private void l() {
        Log.i(z[8]);
        Me ag = App.ag();
        this.b.a(co.a(ag.jabber_id, ve.g(App.D(ag.jabber_id)), ChangeNumber.O, ChangeNumber.N));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(java.lang.String r27, byte[] r28, java.lang.String r29, boolean r30, boolean r31, java.util.List r32) {
        /*
        r26 = this;
        r20 = com.whatsapp.messaging.co.a;
        r0 = r26;
        r4 = r0.k;	 Catch:{ IOException -> 0x000d }
        r4 = r4.a();	 Catch:{ IOException -> 0x000d }
        if (r4 == 0) goto L_0x000f;
    L_0x000c:
        return;
    L_0x000d:
        r4 = move-exception;
        throw r4;
    L_0x000f:
        r4 = com.whatsapp.App.p;	 Catch:{ IOException -> 0x0028 }
        r4 = r4.F();	 Catch:{ IOException -> 0x0028 }
        if (r4 == 0) goto L_0x002a;
    L_0x0017:
        r4 = z;	 Catch:{ IOException -> 0x0028 }
        r5 = 20;
        r4 = r4[r5];	 Catch:{ IOException -> 0x0028 }
        com.whatsapp.util.Log.w(r4);	 Catch:{ IOException -> 0x0028 }
        r0 = r26;
        r4 = r0.g;	 Catch:{ IOException -> 0x0028 }
        r4.a();	 Catch:{ IOException -> 0x0028 }
        goto L_0x000c;
    L_0x0028:
        r4 = move-exception;
        throw r4;
    L_0x002a:
        r4 = com.whatsapp.App.aI();	 Catch:{ IOException -> 0x003a }
        if (r4 == 0) goto L_0x003c;
    L_0x0030:
        r4 = z;	 Catch:{ IOException -> 0x003a }
        r5 = 34;
        r4 = r4[r5];	 Catch:{ IOException -> 0x003a }
        com.whatsapp.util.Log.w(r4);	 Catch:{ IOException -> 0x003a }
        goto L_0x000c;
    L_0x003a:
        r4 = move-exception;
        throw r4;
    L_0x003c:
        r4 = com.whatsapp.App.a4();	 Catch:{ IOException -> 0x0053 }
        if (r4 == 0) goto L_0x0055;
    L_0x0042:
        r4 = z;	 Catch:{ IOException -> 0x0053 }
        r5 = 27;
        r4 = r4[r5];	 Catch:{ IOException -> 0x0053 }
        com.whatsapp.util.Log.w(r4);	 Catch:{ IOException -> 0x0053 }
        r0 = r26;
        r4 = r0.g;	 Catch:{ IOException -> 0x0053 }
        r4.d();	 Catch:{ IOException -> 0x0053 }
        goto L_0x000c;
    L_0x0053:
        r4 = move-exception;
        throw r4;
    L_0x0055:
        r4 = z;	 Catch:{ IOException -> 0x03e2 }
        r5 = 28;
        r4 = r4[r5];	 Catch:{ IOException -> 0x03e2 }
        com.whatsapp.util.Log.i(r4);	 Catch:{ IOException -> 0x03e2 }
        r0 = r26;
        r4 = r0.g;	 Catch:{ IOException -> 0x03e2 }
        r4.b();	 Catch:{ IOException -> 0x03e2 }
        r0 = r26;
        r4 = r0.e;	 Catch:{ IOException -> 0x03e2 }
        if (r4 == 0) goto L_0x0078;
    L_0x006b:
        r0 = r26;
        r4 = r0.e;	 Catch:{ IOException -> 0x03e2 }
        r4 = r4.isClosed();	 Catch:{ IOException -> 0x03e2 }
        if (r4 != 0) goto L_0x0078;
    L_0x0075:
        r26.a();	 Catch:{ IOException -> 0x03e4 }
    L_0x0078:
        r5 = 1;
        r22 = java.lang.System.currentTimeMillis();
        r21 = new com.whatsapp.messaging.ck;	 Catch:{ b3 -> 0x0685 }
        r0 = r26;
        r4 = r0.m;	 Catch:{ b3 -> 0x0685 }
        r4 = com.whatsapp.messaging.bu.a(r4);	 Catch:{ b3 -> 0x0685 }
        r0 = r26;
        r6 = r0.c;	 Catch:{ b3 -> 0x0685 }
        r0 = r21;
        r1 = r29;
        r2 = r32;
        r0.<init>(r4, r1, r2, r6);	 Catch:{ b3 -> 0x0685 }
    L_0x0094:
        r4 = r21.f();	 Catch:{ b3 -> 0x0685 }
        if (r4 == 0) goto L_0x038b;
    L_0x009a:
        r0 = r26;
        r4 = r0.k;	 Catch:{ b3 -> 0x0685 }
        r4 = r4.a();	 Catch:{ b3 -> 0x0685 }
        if (r4 != 0) goto L_0x038b;
    L_0x00a4:
        r4 = new java.lang.StringBuilder;	 Catch:{ b3 -> 0x0685 }
        r4.<init>();	 Catch:{ b3 -> 0x0685 }
        r6 = z;	 Catch:{ b3 -> 0x0685 }
        r7 = 30;
        r6 = r6[r7];	 Catch:{ b3 -> 0x0685 }
        r4 = r4.append(r6);	 Catch:{ b3 -> 0x0685 }
        r4 = r4.append(r5);	 Catch:{ b3 -> 0x0685 }
        r4 = r4.toString();	 Catch:{ b3 -> 0x0685 }
        com.whatsapp.util.Log.i(r4);	 Catch:{ b3 -> 0x0685 }
        r19 = r5 + 1;
        r5 = 0;
        r4 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        r0 = r21;
        r4 = r0.a(r4);	 Catch:{ IOException -> 0x069c, cz -> 0x0697, r -> 0x0692, all -> 0x0688 }
        r0 = r26;
        r0.e = r4;	 Catch:{ IOException -> 0x069c, cz -> 0x0697, r -> 0x0692, all -> 0x0688 }
        r0 = r26;
        r4 = r0.e;	 Catch:{ IOException -> 0x069c, cz -> 0x0697, r -> 0x0692, all -> 0x0688 }
        r6 = 30000; // 0x7530 float:4.2039E-41 double:1.4822E-319;
        r4.setSoTimeout(r6);	 Catch:{ IOException -> 0x069c, cz -> 0x0697, r -> 0x0692, all -> 0x0688 }
        r4 = z;	 Catch:{ IOException -> 0x069c, cz -> 0x0697, r -> 0x0692, all -> 0x0688 }
        r6 = 32;
        r4 = r4[r6];	 Catch:{ IOException -> 0x069c, cz -> 0x0697, r -> 0x0692, all -> 0x0688 }
        com.whatsapp.util.Log.i(r4);	 Catch:{ IOException -> 0x069c, cz -> 0x0697, r -> 0x0692, all -> 0x0688 }
        r18 = new com.whatsapp.messaging.ag;	 Catch:{ IOException -> 0x069c, cz -> 0x0697, r -> 0x0692, all -> 0x0688 }
        r0 = r18;
        r1 = r26;
        r0.<init>(r1);	 Catch:{ IOException -> 0x069c, cz -> 0x0697, r -> 0x0692, all -> 0x0688 }
        r24 = new com.whatsapp.messaging.b9;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r0 = r24;
        r1 = r18;
        r0.<init>(r1);	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r4 = com.whatsapp.App.aK;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r25 = r4.k();	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r0 = r26;
        r5 = r0.m;	 Catch:{ IOException -> 0x03e6, cz -> 0x04d7, r -> 0x0594 }
        r0 = r26;
        r4 = r0.m;	 Catch:{ IOException -> 0x03e6, cz -> 0x04d7, r -> 0x0594 }
        r7 = com.whatsapp.App.h(r4);	 Catch:{ IOException -> 0x03e6, cz -> 0x04d7, r -> 0x0594 }
        if (r31 == 0) goto L_0x010b;
    L_0x0105:
        r4 = r25.isEmpty();	 Catch:{ IOException -> 0x03e6, cz -> 0x04d7, r -> 0x0594 }
        if (r4 != 0) goto L_0x04d2;
    L_0x010b:
        r9 = 1;
    L_0x010c:
        r10 = com.whatsapp.wn.q;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r4 = r26;
        r6 = r27;
        r8 = r28;
        r5 = r4.a(r5, r6, r7, r8, r9, r10);	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r0 = r26;
        r4 = r0.m;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r10 = com.whatsapp.l9.a(r4);	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r8 = new com.whatsapp.vf;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r0 = r26;
        r4 = r0.e;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r0 = r21;
        r4 = r0.a(r4);	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r6 = 1;
        r8.<init>(r4, r6);	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r9 = new com.whatsapp.at2;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r0 = r26;
        r4 = r0.e;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r0 = r21;
        r4 = r0.b(r4);	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r6 = 1;
        r9.<init>(r4, r6);	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r4 = z;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r6 = 38;
        r4 = r4[r6];	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        com.whatsapp.util.Log.i(r4);	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r7 = r10.a();	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r4 = new org.a3;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r6 = r10.b();	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r4.<init>(r5, r6, r7, r8, r9);	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r6 = z;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r8 = 21;
        r6 = r6[r8];	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        com.whatsapp.util.Log.i(r6);	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r8 = r4.d();	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        if (r7 == 0) goto L_0x058f;
    L_0x0165:
        r6 = r7.a();	 Catch:{ IOException -> 0x04d5, cz -> 0x04d7, r -> 0x0594 }
    L_0x0169:
        r7 = r8.a();	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r6 = java.util.Arrays.equals(r6, r7);	 Catch:{ IOException -> 0x0592, cz -> 0x04d7, r -> 0x0594 }
        if (r6 != 0) goto L_0x0176;
    L_0x0173:
        r10.a(r8);	 Catch:{ IOException -> 0x0592, cz -> 0x04d7, r -> 0x0594 }
    L_0x0176:
        r9 = new com.whatsapp.messaging.b3;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r9.<init>();	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r6 = new com.whatsapp.protocol.bi;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r7 = r4.b();	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r8 = com.whatsapp.protocol.b7.b;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r10 = com.whatsapp.protocol.b7.d;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r6.<init>(r7, r9, r8, r10);	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r7 = com.whatsapp.App.am;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r8 = 1;
        if (r7 < r8) goto L_0x06ae;
    L_0x018d:
        r7 = new com.whatsapp.protocol.bm;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r8 = 0;
        r10 = new com.whatsapp.util.bp;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r10.<init>();	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r11 = z;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r12 = 14;
        r11 = r11[r12];	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r7.<init>(r6, r8, r10, r11);	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
    L_0x019e:
        r6 = new com.whatsapp.protocol.bw;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r4 = r4.a();	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r8 = com.whatsapp.protocol.b7.b;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r10 = com.whatsapp.protocol.b7.d;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r6.<init>(r4, r9, r8, r10);	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r4 = com.whatsapp.App.am;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r8 = 1;
        if (r4 < r8) goto L_0x06ab;
    L_0x01b0:
        r8 = new com.whatsapp.protocol.ck;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r4 = 0;
        r10 = new com.whatsapp.util.bp;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r10.<init>();	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r11 = z;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r12 = 22;
        r11 = r11[r12];	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r8.<init>(r6, r4, r10, r11);	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
    L_0x01c1:
        r4 = new com.whatsapp.protocol.bi;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r6 = 0;
        r10 = com.whatsapp.protocol.b7.a;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r11 = 0;
        r11 = new java.lang.String[r11];	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r4.<init>(r6, r9, r10, r11);	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r6 = com.whatsapp.App.am;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r10 = 1;
        if (r6 < r10) goto L_0x06a7;
    L_0x01d1:
        r16 = new com.whatsapp.protocol.bm;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r6 = 0;
        r10 = new com.whatsapp.util.bp;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r10.<init>();	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r11 = z;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r12 = 16;
        r11 = r11[r12];	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r0 = r16;
        r0.<init>(r6, r4, r10, r11);	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
    L_0x01e4:
        r4 = new com.whatsapp.protocol.bw;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r6 = 0;
        r10 = com.whatsapp.protocol.b7.a;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r11 = 0;
        r11 = new java.lang.String[r11];	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r4.<init>(r6, r9, r10, r11);	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r6 = com.whatsapp.App.am;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r9 = 1;
        if (r6 < r9) goto L_0x06a3;
    L_0x01f4:
        r17 = new com.whatsapp.protocol.ck;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r6 = 0;
        r9 = new com.whatsapp.util.bp;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r9.<init>();	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r10 = z;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r11 = 26;
        r10 = r10[r11];	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r0 = r17;
        r0.<init>(r6, r4, r9, r10);	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
    L_0x0207:
        r6 = new com.whatsapp.protocol.by;	 Catch:{ IOException -> 0x05d8, cz -> 0x04d7, r -> 0x0594 }
        r10 = com.whatsapp.App.ab;	 Catch:{ IOException -> 0x05d8, cz -> 0x04d7, r -> 0x0594 }
        r13 = com.whatsapp.j2.a;	 Catch:{ IOException -> 0x05d8, cz -> 0x04d7, r -> 0x0594 }
        r15 = new com.whatsapp.ft;	 Catch:{ IOException -> 0x05d8, cz -> 0x04d7, r -> 0x0594 }
        r15.<init>();	 Catch:{ IOException -> 0x05d8, cz -> 0x04d7, r -> 0x0594 }
        r9 = r24;
        r11 = r24;
        r12 = r24;
        r14 = r24;
        r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17);	 Catch:{ IOException -> 0x05d8, cz -> 0x04d7, r -> 0x0594 }
        r0 = r26;
        r0.l = r6;	 Catch:{ IOException -> 0x05d8, cz -> 0x04d7, r -> 0x0594 }
        r0 = r26;
        r4 = r0.l;	 Catch:{ IOException -> 0x05d8, cz -> 0x04d7, r -> 0x0594 }
        r0 = r24;
        a(r5, r4, r7, r0);	 Catch:{ IOException -> 0x05d8, cz -> 0x04d7, r -> 0x0594 }
        r4 = z;	 Catch:{ IOException -> 0x05d8, cz -> 0x04d7, r -> 0x0594 }
        r5 = 35;
        r4 = r4[r5];	 Catch:{ IOException -> 0x05d8, cz -> 0x04d7, r -> 0x0594 }
        com.whatsapp.util.Log.i(r4);	 Catch:{ IOException -> 0x05d8, cz -> 0x04d7, r -> 0x0594 }
        r0 = r26;
        r4 = r0.e;	 Catch:{ IOException -> 0x05d8, cz -> 0x04d7, r -> 0x0594 }
        r5 = 1020000; // 0xf9060 float:1.429324E-39 double:5.03947E-318;
        r4.setSoTimeout(r5);	 Catch:{ IOException -> 0x05d8, cz -> 0x04d7, r -> 0x0594 }
        r4 = com.whatsapp.aup.b();	 Catch:{ IOException -> 0x05d8, cz -> 0x04d7, r -> 0x0594 }
        if (r4 == 0) goto L_0x0253;
    L_0x0243:
        r4 = z;	 Catch:{ IOException -> 0x05d8, cz -> 0x04d7, r -> 0x0594 }
        r5 = 15;
        r4 = r4[r5];	 Catch:{ IOException -> 0x05d8, cz -> 0x04d7, r -> 0x0594 }
        com.whatsapp.util.Log.i(r4);	 Catch:{ IOException -> 0x05d8, cz -> 0x04d7, r -> 0x0594 }
        r0 = r26;
        r4 = r0.l;	 Catch:{ IOException -> 0x05d8, cz -> 0x04d7, r -> 0x0594 }
        r4.h();	 Catch:{ IOException -> 0x05d8, cz -> 0x04d7, r -> 0x0594 }
    L_0x0253:
        r4 = z;	 Catch:{ IOException -> 0x0612, cz -> 0x04d7, r -> 0x0594 }
        r5 = 17;
        r4 = r4[r5];	 Catch:{ IOException -> 0x0612, cz -> 0x04d7, r -> 0x0594 }
        com.whatsapp.util.Log.i(r4);	 Catch:{ IOException -> 0x0612, cz -> 0x04d7, r -> 0x0594 }
        r0 = r26;
        r4 = r0.l;	 Catch:{ IOException -> 0x0612, cz -> 0x04d7, r -> 0x0594 }
        r4.a();	 Catch:{ IOException -> 0x0612, cz -> 0x04d7, r -> 0x0594 }
        r0 = r26;
        r4 = r0.l;	 Catch:{ IOException -> 0x0612, cz -> 0x04d7, r -> 0x0594 }
        r4 = r4.g;	 Catch:{ IOException -> 0x0612, cz -> 0x04d7, r -> 0x0594 }
        if (r4 == 0) goto L_0x0280;
    L_0x026b:
        r0 = r26;
        r4 = r0.l;	 Catch:{ IOException -> 0x0612, cz -> 0x04d7, r -> 0x0594 }
        r4 = r4.g;	 Catch:{ IOException -> 0x0612, cz -> 0x04d7, r -> 0x0594 }
        r4 = r4.intValue();	 Catch:{ IOException -> 0x0612, cz -> 0x04d7, r -> 0x0594 }
        r5 = com.whatsapp.a59.a;	 Catch:{ IOException -> 0x0612, cz -> 0x04d7, r -> 0x0594 }
        if (r4 == r5) goto L_0x0280;
    L_0x0279:
        r0 = r26;
        r4 = r0.l;	 Catch:{ IOException -> 0x0614, cz -> 0x04d7, r -> 0x0594 }
        r4.b();	 Catch:{ IOException -> 0x0614, cz -> 0x04d7, r -> 0x0594 }
    L_0x0280:
        if (r30 == 0) goto L_0x0289;
    L_0x0282:
        r0 = r26;
        r4 = r0.l;	 Catch:{ IOException -> 0x0616, cz -> 0x04d7, r -> 0x0594 }
        r4.l();	 Catch:{ IOException -> 0x0616, cz -> 0x04d7, r -> 0x0594 }
    L_0x0289:
        r4 = new com.whatsapp.messaging.a;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r0 = r26;
        r5 = r0.l;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r0 = r18;
        r4.<init>(r0, r5);	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        r4.start();	 Catch:{ IOException -> 0x0618, cz -> 0x04d7, r -> 0x0594 }
        r0 = r26;
        r4 = r0.k;	 Catch:{ IOException -> 0x0618, cz -> 0x04d7, r -> 0x0594 }
        r5 = 1;
        r4.a(r5);	 Catch:{ IOException -> 0x0618, cz -> 0x04d7, r -> 0x0594 }
        r21.d();	 Catch:{ IOException -> 0x0618, cz -> 0x04d7, r -> 0x0594 }
        r0 = r18;
        r1 = r26;
        r1.n = r0;	 Catch:{ IOException -> 0x0618, cz -> 0x04d7, r -> 0x0594 }
        if (r31 == 0) goto L_0x02ce;
    L_0x02aa:
        r4 = r25.size();	 Catch:{ IOException -> 0x0618, cz -> 0x04d7, r -> 0x0594 }
        if (r4 <= 0) goto L_0x02ce;
    L_0x02b0:
        r0 = r26;
        r4 = r0.b;	 Catch:{ IOException -> 0x061a, cz -> 0x04d7, r -> 0x0594 }
        r5 = com.whatsapp.messaging.co.a(r25);	 Catch:{ IOException -> 0x061a, cz -> 0x04d7, r -> 0x0594 }
        r4.a(r5);	 Catch:{ IOException -> 0x061a, cz -> 0x04d7, r -> 0x0594 }
        r0 = r26;
        r4 = r0.b;	 Catch:{ IOException -> 0x061a, cz -> 0x04d7, r -> 0x0594 }
        r5 = 1;
        r5 = com.whatsapp.messaging.co.c(r5);	 Catch:{ IOException -> 0x061a, cz -> 0x04d7, r -> 0x0594 }
        r4.a(r5);	 Catch:{ IOException -> 0x061a, cz -> 0x04d7, r -> 0x0594 }
        r0 = r26;
        r4 = r0.d;	 Catch:{ IOException -> 0x061a, cz -> 0x04d7, r -> 0x0594 }
        r4.i();	 Catch:{ IOException -> 0x061a, cz -> 0x04d7, r -> 0x0594 }
    L_0x02ce:
        r4 = com.whatsapp.App.au();	 Catch:{ IOException -> 0x061c, cz -> 0x04d7, r -> 0x0594 }
        if (r4 == 0) goto L_0x02d7;
    L_0x02d4:
        com.whatsapp.App.aP();	 Catch:{ IOException -> 0x061c, cz -> 0x04d7, r -> 0x0594 }
    L_0x02d7:
        r4 = com.whatsapp.qm.a();	 Catch:{ IOException -> 0x061e, cz -> 0x04d7, r -> 0x0594 }
        if (r4 == 0) goto L_0x02ec;
    L_0x02dd:
        r4 = com.whatsapp.App.Z;	 Catch:{ IOException -> 0x061e, cz -> 0x04d7, r -> 0x0594 }
        if (r4 == 0) goto L_0x02ec;
    L_0x02e1:
        r0 = r26;
        r4 = r0.b;	 Catch:{ IOException -> 0x0620, cz -> 0x04d7, r -> 0x0594 }
        r5 = com.whatsapp.messaging.co.q();	 Catch:{ IOException -> 0x0620, cz -> 0x04d7, r -> 0x0594 }
        r4.a(r5);	 Catch:{ IOException -> 0x0620, cz -> 0x04d7, r -> 0x0594 }
    L_0x02ec:
        r4 = com.whatsapp.ChangeNumber.g();	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
        if (r4 == 0) goto L_0x02f7;
    L_0x02f2:
        if (r30 == 0) goto L_0x02f7;
    L_0x02f4:
        r26.l();	 Catch:{ IOException -> 0x0622, cz -> 0x04d7, r -> 0x0594 }
    L_0x02f7:
        r0 = r26;
        r4 = r0.l;	 Catch:{ IOException -> 0x0624, cz -> 0x04d7, r -> 0x0594 }
        r4 = r4.e;	 Catch:{ IOException -> 0x0624, cz -> 0x04d7, r -> 0x0594 }
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r4 = r4 * r6;
        r0 = r26;
        r6 = r0.l;	 Catch:{ IOException -> 0x0624, cz -> 0x04d7, r -> 0x0594 }
        r6 = r6.d;	 Catch:{ IOException -> 0x0624, cz -> 0x04d7, r -> 0x0594 }
        r8 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r6 = r6 * r8;
        com.whatsapp.App.a(r4, r6);	 Catch:{ IOException -> 0x0624, cz -> 0x04d7, r -> 0x0594 }
        r26.k();	 Catch:{ IOException -> 0x0624, cz -> 0x04d7, r -> 0x0594 }
        if (r31 == 0) goto L_0x0316;
    L_0x0311:
        r4 = 0;
        h = r4;	 Catch:{ IOException -> 0x0624, cz -> 0x04d7, r -> 0x0594 }
        if (r20 == 0) goto L_0x0351;
    L_0x0316:
        r0 = r26;
        r4 = r0.m;	 Catch:{ IOException -> 0x0626, cz -> 0x04d7, r -> 0x0594 }
        r4 = com.whatsapp.App.t(r4);	 Catch:{ IOException -> 0x0626, cz -> 0x04d7, r -> 0x0594 }
        r5 = 3;
        if (r4 != r5) goto L_0x034e;
    L_0x0321:
        r4 = h;	 Catch:{ IOException -> 0x0628, cz -> 0x04d7, r -> 0x0594 }
        r4 = r4 + 1;
        h = r4;	 Catch:{ IOException -> 0x0628, cz -> 0x04d7, r -> 0x0594 }
        r4 = h;	 Catch:{ IOException -> 0x0628, cz -> 0x04d7, r -> 0x0594 }
        r5 = 2;
        if (r4 != r5) goto L_0x0351;
    L_0x032c:
        r4 = com.whatsapp.App.j;	 Catch:{ IOException -> 0x062a, cz -> 0x04d7, r -> 0x0594 }
        r5 = 1;
        if (r4 == r5) goto L_0x033a;
    L_0x0331:
        r4 = com.whatsapp.App.j;	 Catch:{ IOException -> 0x062c, cz -> 0x04d7, r -> 0x0594 }
        if (r4 != 0) goto L_0x0351;
    L_0x0335:
        r4 = com.whatsapp.App.am;	 Catch:{ IOException -> 0x062e, cz -> 0x04d7, r -> 0x0594 }
        r5 = 2;
        if (r4 != r5) goto L_0x0351;
    L_0x033a:
        r4 = com.whatsapp.auq.a();	 Catch:{ IOException -> 0x0630, cz -> 0x04d7, r -> 0x0594 }
        r5 = 7;
        if (r4 > r5) goto L_0x034c;
    L_0x0341:
        r4 = z;	 Catch:{ IOException -> 0x0630, cz -> 0x04d7, r -> 0x0594 }
        r5 = 19;
        r4 = r4[r5];	 Catch:{ IOException -> 0x0630, cz -> 0x04d7, r -> 0x0594 }
        r5 = 0;
        r6 = 0;
        com.whatsapp.App.a(r4, r5, r6);	 Catch:{ IOException -> 0x0630, cz -> 0x04d7, r -> 0x0594 }
    L_0x034c:
        if (r20 == 0) goto L_0x0351;
    L_0x034e:
        r4 = 0;
        h = r4;	 Catch:{ IOException -> 0x0632, cz -> 0x04d7, r -> 0x0594 }
    L_0x0351:
        r0 = r26;
        r4 = r0.k;	 Catch:{ IOException -> 0x0634 }
        r4 = r4.a();	 Catch:{ IOException -> 0x0634 }
        if (r4 != 0) goto L_0x0387;
    L_0x035b:
        r21.e();	 Catch:{ IOException -> 0x0634 }
        r0 = r26;
        r4 = r0.e;	 Catch:{ IOException -> 0x0634 }
        if (r4 == 0) goto L_0x0373;
    L_0x0364:
        r0 = r26;
        r4 = r0.e;	 Catch:{ IOException -> 0x0636 }
        r4 = r4.isClosed();	 Catch:{ IOException -> 0x0636 }
        if (r4 != 0) goto L_0x0373;
    L_0x036e:
        r26.a();	 Catch:{ IOException -> 0x0638 }
        if (r20 == 0) goto L_0x0382;
    L_0x0373:
        r0 = r26;
        r4 = r0.e;	 Catch:{ IOException -> 0x063a }
        if (r4 == 0) goto L_0x0382;
    L_0x0379:
        r4 = z;	 Catch:{ IOException -> 0x063c }
        r5 = 37;
        r4 = r4[r5];	 Catch:{ IOException -> 0x063c }
        com.whatsapp.util.Log.i(r4);	 Catch:{ IOException -> 0x063c }
    L_0x0382:
        if (r18 == 0) goto L_0x0387;
    L_0x0384:
        r18.c();	 Catch:{ IOException -> 0x063e }
    L_0x0387:
        if (r20 == 0) goto L_0x069f;
    L_0x0389:
        r5 = r19;
    L_0x038b:
        r0 = r26;
        r4 = r0.m;	 Catch:{ IOException -> 0x0664 }
        r0 = r26;
        r6 = r0.k;	 Catch:{ IOException -> 0x0664 }
        r6 = r6.a();	 Catch:{ IOException -> 0x0664 }
        r5 = r5 + -1;
        r8 = java.lang.System.currentTimeMillis();	 Catch:{ IOException -> 0x0664 }
        r8 = r8 - r22;
        com.whatsapp.nf.a(r4, r6, r5, r8);	 Catch:{ IOException -> 0x0664 }
        r0 = r26;
        r4 = r0.k;	 Catch:{ IOException -> 0x0664 }
        r4 = r4.a();	 Catch:{ IOException -> 0x0664 }
        if (r4 == 0) goto L_0x0668;
    L_0x03ac:
        r0 = r26;
        r4 = r0.g;	 Catch:{ IOException -> 0x0664 }
        r4.c();	 Catch:{ IOException -> 0x0664 }
        r0 = r26;
        r4 = r0.b;	 Catch:{ IOException -> 0x0664 }
        r0 = r26;
        r5 = r0.l;	 Catch:{ IOException -> 0x0664 }
        r4.a(r5);	 Catch:{ IOException -> 0x0664 }
        r4 = com.whatsapp.App.Z;	 Catch:{ IOException -> 0x0664 }
        if (r4 == 0) goto L_0x000c;
    L_0x03c2:
        r4 = com.whatsapp.ve.I();	 Catch:{ IOException -> 0x0666 }
        if (r4 == 0) goto L_0x000c;
    L_0x03c8:
        r4 = com.whatsapp.ve.n();
        r5 = com.whatsapp.ve.a(r4);
        if (r5 == 0) goto L_0x000c;
    L_0x03d2:
        r0 = r26;
        r6 = r0.b;	 Catch:{ IOException -> 0x03e0 }
        r7 = 0;
        r4 = com.whatsapp.messaging.co.a(r5, r4, r7);	 Catch:{ IOException -> 0x03e0 }
        r6.a(r4);	 Catch:{ IOException -> 0x03e0 }
        goto L_0x000c;
    L_0x03e0:
        r4 = move-exception;
        throw r4;
    L_0x03e2:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x03e4 }
    L_0x03e4:
        r4 = move-exception;
        throw r4;
    L_0x03e6:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x03e8, cz -> 0x04d7, r -> 0x0594 }
    L_0x03e8:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
    L_0x03ea:
        r4 = move-exception;
        r5 = r18;
    L_0x03ed:
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x068d }
        r6.<init>();	 Catch:{ all -> 0x068d }
        r7 = z;	 Catch:{ all -> 0x068d }
        r8 = 39;
        r7 = r7[r8];	 Catch:{ all -> 0x068d }
        r6 = r6.append(r7);	 Catch:{ all -> 0x068d }
        r7 = r4.toString();	 Catch:{ all -> 0x068d }
        r6 = r6.append(r7);	 Catch:{ all -> 0x068d }
        r6 = r6.toString();	 Catch:{ all -> 0x068d }
        com.whatsapp.util.Log.a(r6, r4);	 Catch:{ all -> 0x068d }
        r0 = r26;
        r4 = r0.k;	 Catch:{ b3 -> 0x0445, all -> 0x0530 }
        r4 = r4.a();	 Catch:{ b3 -> 0x0445, all -> 0x0530 }
        if (r4 != 0) goto L_0x0387;
    L_0x0415:
        r21.e();	 Catch:{ IOException -> 0x0640 }
        r0 = r26;
        r4 = r0.e;	 Catch:{ IOException -> 0x0640 }
        if (r4 == 0) goto L_0x042d;
    L_0x041e:
        r0 = r26;
        r4 = r0.e;	 Catch:{ IOException -> 0x0640 }
        r4 = r4.isClosed();	 Catch:{ IOException -> 0x0640 }
        if (r4 != 0) goto L_0x042d;
    L_0x0428:
        r26.a();	 Catch:{ IOException -> 0x0642 }
        if (r20 == 0) goto L_0x043c;
    L_0x042d:
        r0 = r26;
        r4 = r0.e;	 Catch:{ IOException -> 0x0644 }
        if (r4 == 0) goto L_0x043c;
    L_0x0433:
        r4 = z;	 Catch:{ IOException -> 0x0646 }
        r6 = 18;
        r4 = r4[r6];	 Catch:{ IOException -> 0x0646 }
        com.whatsapp.util.Log.i(r4);	 Catch:{ IOException -> 0x0646 }
    L_0x043c:
        if (r5 == 0) goto L_0x0387;
    L_0x043e:
        r5.c();	 Catch:{ IOException -> 0x0443 }
        goto L_0x0387;
    L_0x0443:
        r4 = move-exception;
        throw r4;	 Catch:{ b3 -> 0x0445, all -> 0x0530 }
    L_0x0445:
        r4 = move-exception;
        r5 = r19;
    L_0x0448:
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0680 }
        r6.<init>();	 Catch:{ all -> 0x0680 }
        r7 = z;	 Catch:{ all -> 0x0680 }
        r8 = 23;
        r7 = r7[r8];	 Catch:{ all -> 0x0680 }
        r6 = r6.append(r7);	 Catch:{ all -> 0x0680 }
        r7 = r4.b;	 Catch:{ all -> 0x0680 }
        r6 = r6.append(r7);	 Catch:{ all -> 0x0680 }
        r7 = z;	 Catch:{ all -> 0x0680 }
        r8 = 33;
        r7 = r7[r8];	 Catch:{ all -> 0x0680 }
        r6 = r6.append(r7);	 Catch:{ all -> 0x0680 }
        r7 = r4.f;	 Catch:{ all -> 0x0680 }
        r6 = r6.append(r7);	 Catch:{ all -> 0x0680 }
        r6 = r6.toString();	 Catch:{ all -> 0x0680 }
        com.whatsapp.util.Log.w(r6);	 Catch:{ all -> 0x0680 }
        r0 = r26;
        r6 = r0.g;	 Catch:{ all -> 0x0680 }
        r6.a(r4);	 Catch:{ all -> 0x0680 }
        r0 = r26;
        r4 = r0.m;	 Catch:{ IOException -> 0x0674 }
        r0 = r26;
        r6 = r0.k;	 Catch:{ IOException -> 0x0674 }
        r6 = r6.a();	 Catch:{ IOException -> 0x0674 }
        r5 = r5 + -1;
        r8 = java.lang.System.currentTimeMillis();	 Catch:{ IOException -> 0x0674 }
        r8 = r8 - r22;
        com.whatsapp.nf.a(r4, r6, r5, r8);	 Catch:{ IOException -> 0x0674 }
        r0 = r26;
        r4 = r0.k;	 Catch:{ IOException -> 0x0674 }
        r4 = r4.a();	 Catch:{ IOException -> 0x0674 }
        if (r4 == 0) goto L_0x000c;
    L_0x049c:
        r0 = r26;
        r4 = r0.g;	 Catch:{ IOException -> 0x0674 }
        r4.c();	 Catch:{ IOException -> 0x0674 }
        r0 = r26;
        r4 = r0.b;	 Catch:{ IOException -> 0x0674 }
        r0 = r26;
        r5 = r0.l;	 Catch:{ IOException -> 0x0674 }
        r4.a(r5);	 Catch:{ IOException -> 0x0674 }
        r4 = com.whatsapp.App.Z;	 Catch:{ IOException -> 0x0674 }
        if (r4 == 0) goto L_0x000c;
    L_0x04b2:
        r4 = com.whatsapp.ve.I();	 Catch:{ IOException -> 0x0676 }
        if (r4 == 0) goto L_0x000c;
    L_0x04b8:
        r4 = com.whatsapp.ve.n();
        r5 = com.whatsapp.ve.a(r4);
        if (r5 == 0) goto L_0x000c;
    L_0x04c2:
        r0 = r26;
        r6 = r0.b;	 Catch:{ IOException -> 0x04d0 }
        r7 = 0;
        r4 = com.whatsapp.messaging.co.a(r5, r4, r7);	 Catch:{ IOException -> 0x04d0 }
        r6.a(r4);	 Catch:{ IOException -> 0x04d0 }
        goto L_0x000c;
    L_0x04d0:
        r4 = move-exception;
        throw r4;
    L_0x04d2:
        r9 = 0;
        goto L_0x010c;
    L_0x04d5:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
    L_0x04d7:
        r4 = move-exception;
    L_0x04d8:
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x05da }
        r5.<init>();	 Catch:{ all -> 0x05da }
        r6 = z;	 Catch:{ all -> 0x05da }
        r7 = 31;
        r6 = r6[r7];	 Catch:{ all -> 0x05da }
        r5 = r5.append(r6);	 Catch:{ all -> 0x05da }
        r6 = r4.toString();	 Catch:{ all -> 0x05da }
        r5 = r5.append(r6);	 Catch:{ all -> 0x05da }
        r5 = r5.toString();	 Catch:{ all -> 0x05da }
        com.whatsapp.util.Log.a(r5, r4);	 Catch:{ all -> 0x05da }
        r0 = r26;
        r4 = r0.k;	 Catch:{ b3 -> 0x0445, all -> 0x0530 }
        r4 = r4.a();	 Catch:{ b3 -> 0x0445, all -> 0x0530 }
        if (r4 != 0) goto L_0x0387;
    L_0x0500:
        r21.e();	 Catch:{ IOException -> 0x0648 }
        r0 = r26;
        r4 = r0.e;	 Catch:{ IOException -> 0x0648 }
        if (r4 == 0) goto L_0x0518;
    L_0x0509:
        r0 = r26;
        r4 = r0.e;	 Catch:{ IOException -> 0x0648 }
        r4 = r4.isClosed();	 Catch:{ IOException -> 0x0648 }
        if (r4 != 0) goto L_0x0518;
    L_0x0513:
        r26.a();	 Catch:{ IOException -> 0x064a }
        if (r20 == 0) goto L_0x0527;
    L_0x0518:
        r0 = r26;
        r4 = r0.e;	 Catch:{ IOException -> 0x064c }
        if (r4 == 0) goto L_0x0527;
    L_0x051e:
        r4 = z;	 Catch:{ IOException -> 0x064e }
        r5 = 24;
        r4 = r4[r5];	 Catch:{ IOException -> 0x064e }
        com.whatsapp.util.Log.i(r4);	 Catch:{ IOException -> 0x064e }
    L_0x0527:
        if (r18 == 0) goto L_0x0387;
    L_0x0529:
        r18.c();	 Catch:{ IOException -> 0x052e }
        goto L_0x0387;
    L_0x052e:
        r4 = move-exception;
        throw r4;	 Catch:{ b3 -> 0x0445, all -> 0x0530 }
    L_0x0530:
        r4 = move-exception;
    L_0x0531:
        r0 = r26;
        r5 = r0.m;	 Catch:{ IOException -> 0x0678 }
        r0 = r26;
        r6 = r0.k;	 Catch:{ IOException -> 0x0678 }
        r6 = r6.a();	 Catch:{ IOException -> 0x0678 }
        r7 = r19 + -1;
        r8 = java.lang.System.currentTimeMillis();	 Catch:{ IOException -> 0x0678 }
        r8 = r8 - r22;
        com.whatsapp.nf.a(r5, r6, r7, r8);	 Catch:{ IOException -> 0x0678 }
        r0 = r26;
        r5 = r0.k;	 Catch:{ IOException -> 0x0678 }
        r5 = r5.a();	 Catch:{ IOException -> 0x0678 }
        if (r5 == 0) goto L_0x0586;
    L_0x0552:
        r0 = r26;
        r5 = r0.g;	 Catch:{ IOException -> 0x067a }
        r5.c();	 Catch:{ IOException -> 0x067a }
        r0 = r26;
        r5 = r0.b;	 Catch:{ IOException -> 0x067a }
        r0 = r26;
        r6 = r0.l;	 Catch:{ IOException -> 0x067a }
        r5.a(r6);	 Catch:{ IOException -> 0x067a }
        r5 = com.whatsapp.App.Z;	 Catch:{ IOException -> 0x067a }
        if (r5 == 0) goto L_0x058e;
    L_0x0568:
        r5 = com.whatsapp.ve.I();	 Catch:{ IOException -> 0x067a }
        if (r5 == 0) goto L_0x058e;
    L_0x056e:
        r5 = com.whatsapp.ve.n();
        r6 = com.whatsapp.ve.a(r5);
        if (r6 == 0) goto L_0x0584;
    L_0x0578:
        r0 = r26;
        r7 = r0.b;	 Catch:{ IOException -> 0x067c }
        r8 = 0;
        r5 = com.whatsapp.messaging.co.a(r6, r5, r8);	 Catch:{ IOException -> 0x067c }
        r7.a(r5);	 Catch:{ IOException -> 0x067c }
    L_0x0584:
        if (r20 == 0) goto L_0x058e;
    L_0x0586:
        r0 = r26;
        r5 = r0.g;	 Catch:{ IOException -> 0x067e }
        r6 = 1;
        r5.a(r6);	 Catch:{ IOException -> 0x067e }
    L_0x058e:
        throw r4;
    L_0x058f:
        r6 = 0;
        goto L_0x0169;
    L_0x0592:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
    L_0x0594:
        r4 = move-exception;
    L_0x0595:
        r5 = z;	 Catch:{ all -> 0x05da }
        r6 = 29;
        r5 = r5[r6];	 Catch:{ all -> 0x05da }
        com.whatsapp.util.Log.c(r5, r4);	 Catch:{ all -> 0x05da }
        r0 = r26;
        r4 = r0.k;	 Catch:{ b3 -> 0x0445, all -> 0x0530 }
        r4 = r4.a();	 Catch:{ b3 -> 0x0445, all -> 0x0530 }
        if (r4 != 0) goto L_0x0387;
    L_0x05a8:
        r21.e();	 Catch:{ IOException -> 0x0650 }
        r0 = r26;
        r4 = r0.e;	 Catch:{ IOException -> 0x0650 }
        if (r4 == 0) goto L_0x05c0;
    L_0x05b1:
        r0 = r26;
        r4 = r0.e;	 Catch:{ IOException -> 0x0650 }
        r4 = r4.isClosed();	 Catch:{ IOException -> 0x0650 }
        if (r4 != 0) goto L_0x05c0;
    L_0x05bb:
        r26.a();	 Catch:{ IOException -> 0x0652 }
        if (r20 == 0) goto L_0x05cf;
    L_0x05c0:
        r0 = r26;
        r4 = r0.e;	 Catch:{ IOException -> 0x0654 }
        if (r4 == 0) goto L_0x05cf;
    L_0x05c6:
        r4 = z;	 Catch:{ IOException -> 0x0656 }
        r5 = 25;
        r4 = r4[r5];	 Catch:{ IOException -> 0x0656 }
        com.whatsapp.util.Log.i(r4);	 Catch:{ IOException -> 0x0656 }
    L_0x05cf:
        if (r18 == 0) goto L_0x0387;
    L_0x05d1:
        r18.c();	 Catch:{ IOException -> 0x05d6 }
        goto L_0x0387;
    L_0x05d6:
        r4 = move-exception;
        throw r4;	 Catch:{ b3 -> 0x0445, all -> 0x0530 }
    L_0x05d8:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
    L_0x05da:
        r4 = move-exception;
    L_0x05db:
        r0 = r26;
        r5 = r0.k;	 Catch:{ IOException -> 0x0658 }
        r5 = r5.a();	 Catch:{ IOException -> 0x0658 }
        if (r5 != 0) goto L_0x0611;
    L_0x05e5:
        r21.e();	 Catch:{ IOException -> 0x0658 }
        r0 = r26;
        r5 = r0.e;	 Catch:{ IOException -> 0x0658 }
        if (r5 == 0) goto L_0x05fd;
    L_0x05ee:
        r0 = r26;
        r5 = r0.e;	 Catch:{ IOException -> 0x065a }
        r5 = r5.isClosed();	 Catch:{ IOException -> 0x065a }
        if (r5 != 0) goto L_0x05fd;
    L_0x05f8:
        r26.a();	 Catch:{ IOException -> 0x065c }
        if (r20 == 0) goto L_0x060c;
    L_0x05fd:
        r0 = r26;
        r5 = r0.e;	 Catch:{ IOException -> 0x065e }
        if (r5 == 0) goto L_0x060c;
    L_0x0603:
        r5 = z;	 Catch:{ IOException -> 0x0660 }
        r6 = 36;
        r5 = r5[r6];	 Catch:{ IOException -> 0x0660 }
        com.whatsapp.util.Log.i(r5);	 Catch:{ IOException -> 0x0660 }
    L_0x060c:
        if (r18 == 0) goto L_0x0611;
    L_0x060e:
        r18.c();	 Catch:{ IOException -> 0x0662 }
    L_0x0611:
        throw r4;	 Catch:{ b3 -> 0x0445, all -> 0x0530 }
    L_0x0612:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0614, cz -> 0x04d7, r -> 0x0594 }
    L_0x0614:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
    L_0x0616:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
    L_0x0618:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x061a, cz -> 0x04d7, r -> 0x0594 }
    L_0x061a:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
    L_0x061c:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
    L_0x061e:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0620, cz -> 0x04d7, r -> 0x0594 }
    L_0x0620:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
    L_0x0622:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
    L_0x0624:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0626, cz -> 0x04d7, r -> 0x0594 }
    L_0x0626:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0628, cz -> 0x04d7, r -> 0x0594 }
    L_0x0628:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x062a, cz -> 0x04d7, r -> 0x0594 }
    L_0x062a:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x062c, cz -> 0x04d7, r -> 0x0594 }
    L_0x062c:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x062e, cz -> 0x04d7, r -> 0x0594 }
    L_0x062e:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
    L_0x0630:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
    L_0x0632:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x03ea, cz -> 0x04d7, r -> 0x0594 }
    L_0x0634:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0636 }
    L_0x0636:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0638 }
    L_0x0638:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x063a }
    L_0x063a:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x063c }
    L_0x063c:
        r4 = move-exception;
        throw r4;	 Catch:{ b3 -> 0x0445, all -> 0x0530 }
    L_0x063e:
        r4 = move-exception;
        throw r4;	 Catch:{ b3 -> 0x0445, all -> 0x0530 }
    L_0x0640:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0642 }
    L_0x0642:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0644 }
    L_0x0644:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0646 }
    L_0x0646:
        r4 = move-exception;
        throw r4;	 Catch:{ b3 -> 0x0445, all -> 0x0530 }
    L_0x0648:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x064a }
    L_0x064a:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x064c }
    L_0x064c:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x064e }
    L_0x064e:
        r4 = move-exception;
        throw r4;	 Catch:{ b3 -> 0x0445, all -> 0x0530 }
    L_0x0650:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0652 }
    L_0x0652:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0654 }
    L_0x0654:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0656 }
    L_0x0656:
        r4 = move-exception;
        throw r4;	 Catch:{ b3 -> 0x0445, all -> 0x0530 }
    L_0x0658:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x065a }
    L_0x065a:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x065c }
    L_0x065c:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x065e }
    L_0x065e:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0660 }
    L_0x0660:
        r4 = move-exception;
        throw r4;	 Catch:{ b3 -> 0x0445, all -> 0x0530 }
    L_0x0662:
        r4 = move-exception;
        throw r4;	 Catch:{ b3 -> 0x0445, all -> 0x0530 }
    L_0x0664:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0666 }
    L_0x0666:
        r4 = move-exception;
        throw r4;
    L_0x0668:
        r0 = r26;
        r4 = r0.g;	 Catch:{ IOException -> 0x0672 }
        r5 = 1;
        r4.a(r5);	 Catch:{ IOException -> 0x0672 }
        goto L_0x000c;
    L_0x0672:
        r4 = move-exception;
        throw r4;
    L_0x0674:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0676 }
    L_0x0676:
        r4 = move-exception;
        throw r4;
    L_0x0678:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x067a }
    L_0x067a:
        r4 = move-exception;
        throw r4;
    L_0x067c:
        r4 = move-exception;
        throw r4;
    L_0x067e:
        r4 = move-exception;
        throw r4;
    L_0x0680:
        r4 = move-exception;
        r19 = r5;
        goto L_0x0531;
    L_0x0685:
        r4 = move-exception;
        goto L_0x0448;
    L_0x0688:
        r4 = move-exception;
        r18 = r5;
        goto L_0x05db;
    L_0x068d:
        r4 = move-exception;
        r18 = r5;
        goto L_0x05db;
    L_0x0692:
        r4 = move-exception;
        r18 = r5;
        goto L_0x0595;
    L_0x0697:
        r4 = move-exception;
        r18 = r5;
        goto L_0x04d8;
    L_0x069c:
        r4 = move-exception;
        goto L_0x03ed;
    L_0x069f:
        r5 = r19;
        goto L_0x0094;
    L_0x06a3:
        r17 = r4;
        goto L_0x0207;
    L_0x06a7:
        r16 = r4;
        goto L_0x01e4;
    L_0x06ab:
        r8 = r6;
        goto L_0x01c1;
    L_0x06ae:
        r7 = r6;
        goto L_0x019e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.ah.b(java.lang.String, byte[], java.lang.String, boolean, boolean, java.util.List):void");
    }

    private void a(Builder builder) {
        String[] split = z[2].split(z[1], 3);
        try {
            if (split.length != 3) {
                throw new AssertionError(z[0]);
            }
            try {
                builder.setPrimary(Integer.parseInt(split[0]));
                builder.setSecondary(Integer.parseInt(split[1]));
                builder.setTertiary(Integer.parseInt(split[2]));
            } catch (Throwable e) {
                AssertionError assertionError = new AssertionError(z[3]);
                assertionError.initCause(e);
                throw assertionError;
            }
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    private void n() {
        try {
            if (Voip.d()) {
                Log.i(z[5]);
                this.d.g();
                g();
                if (co.a == 0) {
                    return;
                }
            }
            Log.i(z[4]);
            a();
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    private void b(boolean z) {
        int i = co.a;
        boolean h = this.d.h();
        try {
            this.d.c();
            if (this.k.a()) {
                if (!this.a.a()) {
                    if (z) {
                        try {
                            Log.i(z[6]);
                            if (this.n != null) {
                                this.n.c();
                            }
                            try {
                                a();
                                this.b.a();
                                this.g.a(true);
                                this.k.a(false);
                                k();
                                if (this.j.a()) {
                                    Log.i(z[7]);
                                    this.i.quit();
                                    quit();
                                    if (i == 0) {
                                        return;
                                    }
                                }
                                return;
                            } catch (NumberFormatException e) {
                                throw e;
                            } catch (NumberFormatException e2) {
                                throw e2;
                            }
                        } catch (NumberFormatException e22) {
                            throw e22;
                        }
                    }
                    try {
                        this.d.g();
                        this.b.a(co.m());
                        this.a.a(true);
                        if (i == 0) {
                            return;
                        }
                    } catch (NumberFormatException e222) {
                        try {
                            throw e222;
                        } catch (NumberFormatException e2222) {
                            throw e2222;
                        }
                    }
                }
            }
            if (h && z) {
                try {
                    this.d.e();
                } catch (NumberFormatException e22222) {
                    throw e22222;
                }
            }
        } catch (NumberFormatException e222222) {
            throw e222222;
        } catch (NumberFormatException e2222222) {
            try {
                throw e2222222;
            } catch (NumberFormatException e22222222) {
                throw e22222222;
            }
        }
    }

    private void a(by byVar) {
        try {
            if (byVar == this.l) {
                b(true);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    static void d(ah ahVar) {
        ahVar.j();
    }

    static void a(ah ahVar, String str, byte[] bArr, String str2, boolean z, boolean z2, List list) {
        ahVar.a(str, bArr, str2, z, z2, list);
    }

    static void a(ah ahVar) {
        ahVar.h();
    }

    static Context b(ah ahVar) {
        return ahVar.m;
    }

    private void j() {
        this.b.a(co.l());
    }

    private boolean o() {
        return this.d.h();
    }

    private void c() {
        a();
        a(false);
    }

    private void k() {
        PendingIntent broadcast = PendingIntent.getBroadcast(App.z(), 0, new Intent(z[53]).setPackage(z[55]), 1610612736);
        if (broadcast != null) {
            ((AlarmManager) App.z().getSystemService(z[54])).cancel(broadcast);
            broadcast.cancel();
        }
        this.f = false;
    }

    static void a(ah ahVar, Message message) {
        ahVar.a(message);
    }

    private void d() {
        a();
        a(true);
    }

    private void g() {
        i();
        this.b.a(co.p());
    }

    private void a() {
        Log.i(z[12]);
        try {
            if (!this.e.isOutputShutdown()) {
                this.e.shutdownOutput();
            }
        } catch (Exception e) {
        }
        try {
            if (!this.e.isInputShutdown()) {
                this.e.shutdownInput();
            }
        } catch (Exception e2) {
        }
        try {
            if (!this.e.isClosed()) {
                this.e.close();
            }
        } catch (Exception e3) {
            Log.i(z[13] + e3.toString());
        }
    }

    private void c(boolean z) {
        b(z);
    }

    private void b() {
        m();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(boolean r3) {
        /*
        r2 = this;
        r0 = r2.k;	 Catch:{ NumberFormatException -> 0x0046 }
        r1 = 0;
        r0.a(r1);	 Catch:{ NumberFormatException -> 0x0046 }
        r0 = r2.a;	 Catch:{ NumberFormatException -> 0x0046 }
        r1 = 0;
        r0.a(r1);	 Catch:{ NumberFormatException -> 0x0046 }
        r0 = r2.j;	 Catch:{ NumberFormatException -> 0x0046 }
        r0 = r0.a();	 Catch:{ NumberFormatException -> 0x0046 }
        if (r0 != 0) goto L_0x002c;
    L_0x0014:
        r0 = r2.d;	 Catch:{ NumberFormatException -> 0x0046 }
        r0.f();	 Catch:{ NumberFormatException -> 0x0046 }
        r0 = r2.b;	 Catch:{ NumberFormatException -> 0x0046 }
        r0.a();	 Catch:{ NumberFormatException -> 0x0046 }
        r0 = r2.f;	 Catch:{ NumberFormatException -> 0x0046 }
        if (r0 == 0) goto L_0x0023;
    L_0x0022:
        r3 = 1;
    L_0x0023:
        r0 = r2.g;	 Catch:{ NumberFormatException -> 0x0048 }
        r0.a(r3);	 Catch:{ NumberFormatException -> 0x0048 }
        r0 = com.whatsapp.messaging.co.a;	 Catch:{ NumberFormatException -> 0x0048 }
        if (r0 == 0) goto L_0x003d;
    L_0x002c:
        r0 = z;	 Catch:{ NumberFormatException -> 0x0048 }
        r1 = 78;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x0048 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x0048 }
        r0 = r2.i;	 Catch:{ NumberFormatException -> 0x0048 }
        r0.quit();	 Catch:{ NumberFormatException -> 0x0048 }
        r2.quit();	 Catch:{ NumberFormatException -> 0x0048 }
    L_0x003d:
        r2.k();
        r0 = r2.d;
        r0.c();
        return;
    L_0x0046:
        r0 = move-exception;
        throw r0;
    L_0x0048:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.ah.a(boolean):void");
    }

    static void i(ah ahVar) {
        ahVar.d();
    }

    public ah(Context context, ar arVar) {
        super(z[42]);
        this.k = new av(3, z[40]);
        this.a = new av(3, z[41]);
        this.j = new av(3, z[43]);
        this.g = arVar;
        this.m = context;
        this.c = new Random();
    }

    static void a(ah ahVar, aa aaVar) {
        ahVar.a(aaVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m() {
        /*
        r2 = this;
        r0 = z;	 Catch:{ NumberFormatException -> 0x002b }
        r1 = 9;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x002b }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x002b }
        r0 = r2.f;	 Catch:{ NumberFormatException -> 0x002b }
        if (r0 == 0) goto L_0x001e;
    L_0x000d:
        r0 = z;	 Catch:{ NumberFormatException -> 0x002d }
        r1 = 10;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x002d }
        com.whatsapp.App.v(r0);	 Catch:{ NumberFormatException -> 0x002d }
        r0 = 1;
        r2.c(r0);	 Catch:{ NumberFormatException -> 0x002d }
        r0 = com.whatsapp.messaging.co.a;	 Catch:{ NumberFormatException -> 0x002d }
        if (r0 == 0) goto L_0x0027;
    L_0x001e:
        r0 = z;	 Catch:{ NumberFormatException -> 0x002d }
        r1 = 11;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x002d }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x002d }
    L_0x0027:
        r0 = 0;
        r2.f = r0;
        return;
    L_0x002b:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x002d }
    L_0x002d:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.ah.m():void");
    }

    static void a(ah ahVar, by byVar) {
        ahVar.a(byVar);
    }

    static boolean f(ah ahVar) {
        return ahVar.o();
    }

    private static ReleaseChannel f() {
        try {
            switch (App.am) {
                case at.g /*1*/:
                    return ReleaseChannel.BETA;
                case at.i /*2*/:
                    return ReleaseChannel.ALPHA;
                case at.o /*3*/:
                    return ReleaseChannel.DEBUG;
                default:
                    return null;
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    private void a(String str, byte[] bArr, String str2, boolean z, boolean z2, List list) {
        b(str, bArr, str2, z, z2, list);
    }

    static void g(ah ahVar) {
        ahVar.e();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(android.os.Message r5) {
        /*
        r4 = this;
        r0 = com.whatsapp.messaging.co.d(r5);
        switch(r0) {
            case 7: goto L_0x0011;
            case 59: goto L_0x003c;
            case 64: goto L_0x003c;
            case 67: goto L_0x003c;
            case 102: goto L_0x0033;
            default: goto L_0x0007;
        };
    L_0x0007:
        r0 = r4.g;
        r1 = android.os.Message.obtain(r5);
        r0.a(r1);
    L_0x0010:
        return;
    L_0x0011:
        r0 = r5.getData();
        r1 = z;
        r2 = 81;
        r1 = r1[r2];
        r0 = r0.getLong(r1);
        r2 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0 = r0 * r2;
        r2 = java.lang.System.currentTimeMillis();
        com.whatsapp.App.a(r0, r2);
        r0 = r4.b;
        r1 = com.whatsapp.messaging.co.g();
        r0.a(r1);
        goto L_0x0010;
    L_0x0033:
        r0 = r4.d;	 Catch:{ NumberFormatException -> 0x0042 }
        r0.a();	 Catch:{ NumberFormatException -> 0x0042 }
        r0 = com.whatsapp.messaging.co.a;	 Catch:{ NumberFormatException -> 0x0042 }
        if (r0 == 0) goto L_0x0007;
    L_0x003c:
        r0 = r4.d;	 Catch:{ NumberFormatException -> 0x0042 }
        r0.d();	 Catch:{ NumberFormatException -> 0x0042 }
        goto L_0x0007;
    L_0x0042:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.ah.b(android.os.Message):void");
    }

    static {
        String[] strArr = new String[82];
        String str = "\u0000BH\u0014-\u0011_\\Q:\rH]\u0014n\u0015[J\u0005=ENWQ8\u0000HK\u0018!\u000b\u001aV\u0010#\u0000\u0001\u0018'\u000b7iq>\u0000:ty<\u000bX\b\u0016@|K\u000f\rA";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case v.m /*0*/:
                        i4 = arj.Theme_buttonStyleSmall;
                        break;
                    case at.g /*1*/:
                        i4 = 58;
                        break;
                    case at.i /*2*/:
                        i4 = 56;
                        break;
                    case at.o /*3*/:
                        i4 = 113;
                        break;
                    default:
                        i4 = 78;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    i2 = 2;
                    strArr2 = strArr3;
                    str = "W\u0014\tC`P\u000f\b";
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    i2 = 3;
                    str = "\u000bUVQ \u0010W]\u0003'\u0006\u001aH\u001e<\u0011SW\u001fn\n\\\u0018\u0007+\u0017IQ\u001e ETY\u001c+^\u001an4\u001c6sw?\u0011+{u4sW\u0014\tC`P\u000f\b";
                    i = 2;
                    strArr2 = strArr3;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    str = "\u001dWH\u0001a\u0006UV\u001f+\u0006NQ\u001e JVW\u0016!\u0010N\u0017\u0005'\b_W\u0004:JYT\u001e=\u0000\u0017K\u001e-\u000e_L";
                    i = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "\u001dWH\u0001a\u0006UV\u001f+\u0006NQ\u001e JVW\u0016!\u0010N\u0017\u0005'\b_W\u0004:JIS\u0018>HLW\u0018>H[[\u0005'\u0013_";
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "\u001dWH\u0001a\u0006UV\u001f+\u0006NQ\u001e J\\W\u0003-\u0000^g\u0015'\u0016YW\u001f \u0000YL^<\u0000[\\\u0014<:NP\u0003+\u0004^\u0017\u001c/\u0017Qg\u0017'\u000bSK\u0019+\u0001";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "\u001dWH\u0001a\u0006UV\u001f+\u0006NQ\u001e JKM\u0018:E^M\u0003'\u000b]\u0018\u0017!\u0017Y]\u0015n\u0001SK\u0012!\u000bT]\u0012:";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "\u001dWH\u0001a\u0006UV\u001f+\u0006NQ\u001e JI]\u001f*\u0006RY\u001f)\u0000TM\u001c,\u0000H";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "\u001dWH\u0001a\u0006UV\u001f+\u0006NQ\u001e JJQ\u001f)\u0011SU\u0014!\u0010N\u0017\u00146\u0015SJ\u0014*";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "\u0015SV\u0016n\u0011SU\u0014!\u0010N";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "\u001dWH\u0001a\u0006UV\u001f+\u0006NQ\u001e JJQ\u001f)\u0011SU\u0014!\u0010N\u0017\u00146\u0015SJ\u0014*JS_\u001f!\u0017_";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "\u001dWH\u0001a\u0006UV\u001f+\u0006NQ\u001e JIW\u0012%\u0000N\u0017\u0012\"\nI]";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "\u001dWH\u0001a\u0006UV\u001f+\u0006NQ\u001e JYT\u001e=\u0000iW\u0012%\u0000N\u0018";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "7\u007f{'n";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "\u0006RY\u0005*:YW\u001f \u0000YL\u0018!\u000b\u0000\u0018\u0017+\u0011YP\u0018 \u0002\u001aZ\u001d!\u0006QT\u0018=\u0011";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "2h}2\u0018E";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "\u0006RY\u0005*:YW\u001f \u0000YL\u0018!\u000b\u0000\u0018\u0017+\u0011YP\u0018 \u0002\u001a[\u001d'\u0000TLQ-\nT^\u0018)";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "\u001dWH\u0001a\u0006UV\u001f+\u0006NQ\u001e JIW\u0012%\u0000N\u0017\u0012\"\nI]\u0015";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "\u0015UK\u0005c\u0017__Q>\u0004IK\u00188\u0000\u001aT\u001e)\fT\u0018LnW\u001a\u0010F*L";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "\u001dWH\u0001a\u0006UV\u001f+\u0006NQ\u001e JYW\u001f \u0000YL^ \nN\u0015\u0010\"\tUO\u0014*JYT\u001e-\u000e";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = "\u0006RY\u0005*:YW\u001f \u0000YL\u0018!\u000b\u0000\u0018\u0012!\bJT\u0014:\u0000^\u0018\u001f!\fI]Q&\u0004T\\\u0002&\u0004Q]";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = "6\u007fv5n";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "\u001dWH\u0001a\u0006UV\u001f+\u0006NQ\u001e JVW\u0016'\u000b\u0015^\u0010'\tOJ\u0014n\u0011CH\u0014t";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = "\u001dWH\u0001a\u0006UV\u001f+\u0006NQ\u001e JIW\u0012%\u0000N\u0017\u0012\"\nI]\u0015";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = "\u001dWH\u0001a\u0006UV\u001f+\u0006NQ\u001e JIW\u0012%\u0000N\u0017\u0012\"\nI]\u0015";
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = "2i}?\nE";
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i2] = str;
                    i2 = 27;
                    str = "\u001dWH\u0001a\u0006UV\u001f+\u0006NQ\u001e JYW\u001f \u0000YL^ \nN\u0015\u0010\"\tUO\u0014*JIW\u0017:\u0012[J\u0014c\u0000BH\u0018<\u0000^";
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i2] = str;
                    i2 = 28;
                    str = "\u001dWH\u0001a\u0006UV\u001f+\u0006NQ\u001e JYW\u001f \u0000YL";
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    str = "\u001dWH\u0001a\u0006UV\u001f+\u0006NQ\u001e JIW\u0012%\u0000N\u0017\u0018 \u0013[T\u0018*HY]\u0003:\f\\Q\u0012/\u0011_\u0015\u00146\u0006_H\u0005'\nT";
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i2] = str;
                    i2 = 30;
                    str = "\u0006RY\u0005*:YW\u001f \u0000YL\u0018!\u000b\u0000\u0018\u0012!\u000bT]\u0012:\fT_Jn\u0004NL\u0014#\u0015N\u0005";
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i2] = str;
                    i2 = 31;
                    str = "\u001dWH\u0001a\u0006UV\u001f+\u0006NQ\u001e JIW\u0012%\u0000N\u0017\u001f+\u001dN\u0015\u0001!\u0017N\u0017\u0012!\u0017HM\u0001:HIL\u0003+\u0004W\u0015\u00146\u0006_H\u0005'\nT\u0018";
                    i = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i2] = str;
                    i2 = 32;
                    str = "\u0006RY\u0005*:YW\u001f \u0000YL\u0018!\u000b\u0000\u0018\u0002!\u0006Q]\u0005n\u0006UV\u001f+\u0006N]\u0015";
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i2] = str;
                    i2 = 33;
                    str = "EYW\u0015+_";
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i2] = str;
                    i2 = 34;
                    str = "\u001dWH\u0001a\u0006UV\u001f+\u0006NQ\u001e JYW\u001f \u0000YL^ \nN\u0015\u0010\"\tUO\u0014*JVW\u0016'\u000b\u0017^\u0010'\t_\\";
                    i = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i2] = str;
                    i2 = 35;
                    str = "\u0006RY\u0005*:YW\u001f \u0000YL\u0018!\u000b\u0000\u0018\u00029\fN[\u0019'\u000b]\u0018\u0005!E\u000b\u000fQ#\fTM\u0005+EH]\u0010*ENQ\u001c+\nOL";
                    i = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i2] = str;
                    i2 = 36;
                    str = "\u001dWH\u0001a\u0006UV\u001f+\u0006NQ\u001e JIW\u0012%\u0000N\u0017\u0012\"\nI]\u0015";
                    i = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i2] = str;
                    i2 = 37;
                    str = "\u001dWH\u0001a\u0006UV\u001f+\u0006NQ\u001e JIW\u0012%\u0000N\u0017\u0012\"\nI]\u0015";
                    i = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i2] = str;
                    i2 = 38;
                    str = "\u0006RY\u0005*:YW\u001f \u0000YL\u0018!\u000b\u0000\u0018\u0012<\u0000[L\u0014*EswQ=\u0011H]\u0010#\u0016";
                    i = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i2] = str;
                    i2 = 39;
                    str = "\u001dWH\u0001a\u0006UV\u001f+\u0006NQ\u001e JIW\u0012%\u0000N\u0017\u0015'\u0016YW\u001f \u0000YLQ";
                    i = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i2] = str;
                    i2 = 40;
                    str = "\u0006UV\u001f+\u0006NQ\u001e :NP\u0003+\u0004^\u0017\u001d!\u0002]]\u0015\u0011\u0003VY\u0016a\u0006UV\u001f+\u0006N]\u0015";
                    i = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i2] = str;
                    i2 = 41;
                    str = "\u0006UV\u001f+\u0006NQ\u001e :NP\u0003+\u0004^\u0017\u001d!\u0002]]\u0015\u0011\u0003VY\u0016a\u0001SK\u0012!\u000bT]\u0012:\fT_";
                    i = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i2] = str;
                    i2 = 42;
                    str = "&UV\u001f+\u0006NQ\u001e 1RJ\u0014/\u0001";
                    i = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i2] = str;
                    i2 = 43;
                    str = "\u0006UV\u001f+\u0006NQ\u001e :NP\u0003+\u0004^\u0017\u001d!\u0002]]\u0015\u0011\u0003VY\u0016a\u0014OQ\u0005";
                    i = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i2] = str;
                    i2 = 44;
                    str = "\u0004VY\u0003#";
                    i = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i2] = str;
                    i2 = 45;
                    str = "\u0006UU_9\r[L\u0002/\u0015J";
                    i = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i2] = str;
                    i2 = 46;
                    str = "\u001dWH\u0001a\u0006UV\u001f+\u0006NQ\u001e JJQ\u001f)\u0011SU\u0014!\u0010N\u0017\u0010\"\u0017_Y\u00157:I]\u0005";
                    i = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i2] = str;
                    i2 = 47;
                    str = "\u0006UU_9\r[L\u0002/\u0015J\u0016\u0010\"\u0004HU_\r)s}?\u001a:jq?\t:nq<\u000b*ol";
                    i = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i2] = str;
                    i2 = 48;
                    str = "\u0015RW\u001f+";
                    i = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i2] = str;
                    i2 = 49;
                    str = "\u000fS\\Q'\u0016\u001aV\u001e:ETM\u001c+\u0017S[Jn\u000fS\\L";
                    i = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i2] = str;
                    i2 = 50;
                    str = "\u001f@";
                    i = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i2] = str;
                    i2 = 51;
                    str = "U\u0014\u0000_z";
                    i = 50;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i2] = str;
                    i2 = 52;
                    str = "?`";
                    i = 51;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i2] = str;
                    i2 = 53;
                    str = "\u0006UU_9\r[L\u0002/\u0015J\u0016\u0010\"\u0004HU_\r)s}?\u001a:jq?\t:nq<\u000b*ol";
                    i = 52;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i2] = str;
                    i2 = 54;
                    str = "\u0004VY\u0003#";
                    i = 53;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i2] = str;
                    i2 = 55;
                    str = "\u0006UU_9\r[L\u0002/\u0015J";
                    i = 54;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i2] = str;
                    str = "\u0003[Q\u001d;\u0017_";
                    i = 55;
                    i2 = 56;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i2] = str;
                    i2 = 57;
                    strArr2 = strArr3;
                    str = "\bOT\u0005'\u0015V]Q9\u0000X\u0018\u001f!\u0001_KQ+\u000bYW\u0004 \u0011_J\u0014*EUVQ\"\n]Q\u001f";
                    i = 56;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i2] = str;
                    str = "\u0006U\\\u0014";
                    i = 57;
                    i2 = 58;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i2] = str;
                    i2 = 59;
                    strArr2 = strArr3;
                    str = "\fTN\u0010\"\f^\u0018\u0003+\u0011HAQ8\u0004VM\u0014uEH]\u0005<\u001ciL\u0003'\u000b]\u0005";
                    i = 58;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i2] = str;
                    i2 = 60;
                    str = "\u0006U\\\u0014";
                    i = 59;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i2] = str;
                    i2 = 61;
                    str = "\fTN\u0010\"\f^\u0018\u00146\u0015SJ\u0014n\u0013[T\u0004+^\u001a]\t>\fH]\":\u0017SV\u0016s";
                    i = 60;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i2] = str;
                    i2 = 62;
                    str = "\u000bU\\\u0014n\u0016NJ\u0014/\b\u001a]\u001f*\u0000^\u0018\u0004 \u0000BH\u0014-\u0011_\\\u001d7";
                    i = 61;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i2] = str;
                    i2 = 63;
                    str = "\u0000BH\u0018<\u0000";
                    i = 62;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i2] = str;
                    i2 = 64;
                    str = "\u0010T]\t>\u0000YL\u0014*ETW\u0015+EH]\u0012+\fL]\u0015n\u0001OJ\u0018 \u0002\u001aT\u001e)\fT\u0018\u0002+\u0014O]\u001f-\u0000\u0001\u0018\u001f!\u0001_\u0005";
                    i = 63;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i2] = str;
                    i2 = 65;
                    str = "\u0012_Z";
                    i = 64;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i2] = str;
                    i2 = 66;
                    str = "\fTN\u0010\"\f^\u0018\u0012!\u0001_\u0018\u0007/\tO]Jn\u0006U\\\u0014\u001d\u0011HQ\u001f)X";
                    i = 65;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr2[i2] = str;
                    i2 = 67;
                    str = "\u0017_L\u00037";
                    i = 66;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    strArr2[i2] = str;
                    i2 = 68;
                    str = "\fTN\u0010\"\f^\u0018\u0003+\u0004IW\u001fn\nT\u0018\u0017/\fVM\u0003+ETW\u0015+^\u001aJ\u0014/\u0016UV\":\u0017SV\u0016s";
                    i = 67;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    strArr2[i2] = str;
                    i2 = 69;
                    str = "\u0016O[\u0012+\u0016I";
                    i = 68;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    strArr2[i2] = str;
                    i2 = 70;
                    str = "\fTN\u0010\"\f^\u0018\u0001<\nJKQ8\u0000HK\u0018!\u000b\u0001\u0018\u0001<\nJK\":\u0017SV\u0016s";
                    i = 69;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeight /*69*/:
                    strArr2[i2] = str;
                    i2 = 71;
                    str = "\u0017_Y\u0002!\u000b";
                    i = 70;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightSmall /*70*/:
                    strArr2[i2] = str;
                    i2 = 72;
                    str = "\u0000HJ\u001e<";
                    i = 71;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightLarge /*71*/:
                    strArr2[i2] = str;
                    i2 = 73;
                    str = "\u0012_ZQ9\u0004I\u0018\u00146\u0015_[\u0005+\u0001\u001aZ\u0004:ETW\u0005n\u0016_]\u001fn\u0007_^\u001e<\u0000\u001aK\u0004-\u0006_K\u0002";
                    i = 72;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingLeft /*72*/:
                    strArr2[i2] = str;
                    i2 = 74;
                    str = "\fTN\u0010\"\f^\u0018\u0002+\u0017L]\u0003n\u0011SU\u0014uENQ\u001c+6NJ\u0018 \u0002\u0007";
                    i = 73;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingRight /*73*/:
                    strArr2[i2] = str;
                    i2 = 75;
                    str = "\fTN\u0010\"\f^\u0018\u0014<\u0017UJQ-\n^]Q!\u000b\u001aO\u0014,E_J\u0003!\u0017\u001aV\u001e*\u0000\u0001\u0018\u0014<\u0017UJ2!\u0001_k\u0005<\fT_L";
                    i = 74;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropDownListViewStyle /*74*/:
                    strArr2[i2] = str;
                    i2 = 76;
                    str = "\u0015HW\u0001=";
                    i = 75;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPopupWindowStyle /*75*/:
                    strArr2[i2] = str;
                    i2 = 77;
                    str = "\u0012_ZQ \n^]Q)\fL]\u001fn\u0001OJ\u0018 \u0002\u001aT\u001e)\fT\u0018\u0006'\u0011RW\u0004:E[V\bn\u0012_ZQ<\u0000\\\u0018\u0001<\nLQ\u0015+\u0001";
                    i = 76;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItem /*76*/:
                    strArr2[i2] = str;
                    str = "\u001dWH\u0001a\u0006UV\u001f+\u0006NQ\u001e JKM\u0018:";
                    i = 77;
                    i2 = 78;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItemSmall /*77*/:
                    strArr2[i2] = str;
                    i2 = 79;
                    strArr2 = strArr3;
                    str = "\u0017_[\u001e \u000b_[\u0005\u000f\u0003N]\u0003\u001a\fW]\u001e;\u0011";
                    i = 78;
                    break;
                case arj.Theme_panelBackground /*78*/:
                    strArr2[i2] = str;
                    i2 = 80;
                    str = "\u0017_[\u001e \u000b_[\u0005\u000f\u0003N]\u0003\u001a\fW]\u001e;\u0011";
                    i = 79;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListWidth /*79*/:
                    strArr2[i2] = str;
                    i2 = 81;
                    str = "\u0011SU\u0014=\u0011[U\u0001";
                    i = 80;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListTheme /*80*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    h = 0;
                    return;
                default:
                    strArr2[i2] = str;
                    str = "9\u0014";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private static void a(ClientPayload clientPayload, by byVar, bc bcVar, b9 b9Var) {
        String b;
        int i = co.a;
        boolean hasRefToken = clientPayload.getWebInfo().hasRefToken();
        cw a = bcVar.a();
        int i2 = 0;
        while (a != null) {
            try {
                if (cw.b(a, z[65])) {
                    if (i2 != 0) {
                        throw new cz(z[57]);
                    } else if (hasRefToken) {
                        cw f = a.f(z[72]);
                        if (f != null) {
                            String b2 = f.b(z[60]);
                            i2 = 500;
                            if (b2 != null) {
                                try {
                                    i2 = Integer.parseInt(b2);
                                } catch (NumberFormatException e) {
                                    throw new cz(z[75] + b2);
                                }
                            }
                            b9Var.c(clientPayload.getWebInfo().getRefToken(), i2);
                        }
                        if (i != 0) {
                            i2 = 1;
                        } else {
                            f = bcVar.a();
                            if (i != 0) {
                                break;
                            }
                            a = f;
                            i2 = 1;
                        }
                    } else {
                        try {
                            throw new cz(z[77]);
                        } catch (NumberFormatException e2) {
                            throw e2;
                        }
                    }
                }
                try {
                    if (cw.b(a, z[69])) {
                        if (hasRefToken && r0 == 0) {
                            try {
                                throw new cz(z[73]);
                            } catch (NumberFormatException e22) {
                                throw e22;
                            }
                        }
                        b = a.b("t");
                        if (b != null) {
                            try {
                                byVar.e = Long.parseLong(b);
                                byVar.d = System.currentTimeMillis() / 1000;
                            } catch (NumberFormatException e3) {
                                throw new cz(z[74] + b);
                            }
                        }
                        b = a.b(z[76]);
                        if (b != null) {
                            try {
                                byVar.g = Integer.valueOf(Integer.parseInt(b));
                            } catch (NumberFormatException e4) {
                                throw new cz(z[70] + b);
                            }
                        }
                        if (i == 0) {
                            i2 = 1;
                            if (i2 == 0) {
                                try {
                                    throw new cz(z[62]);
                                } catch (NumberFormatException e222) {
                                    throw e222;
                                }
                            }
                        }
                    }
                    try {
                        if (cw.b(a, z[56])) {
                            b = a.b(z[71]);
                            try {
                                switch (Integer.parseInt(b)) {
                                    case 402:
                                        b3 b3Var = new b3(2);
                                        String b3 = a.b(z[63]);
                                        try {
                                            b3Var.a = Integer.parseInt(b3);
                                            b3 = a.b(z[58]);
                                            try {
                                                b3Var.f = Integer.parseInt(b3);
                                                b3 = a.b(z[67]);
                                                try {
                                                    b3Var.d = Integer.parseInt(b3);
                                                    throw b3Var;
                                                } catch (NumberFormatException e5) {
                                                    throw new cz(z[59] + b3);
                                                }
                                            } catch (NumberFormatException e6) {
                                                throw new cz(z[66] + b3);
                                            }
                                        } catch (NumberFormatException e7) {
                                            throw new cz(z[61] + b3);
                                        }
                                    default:
                                        throw new b3(0);
                                }
                            } catch (NumberFormatException e8) {
                                throw new cz(z[68] + b);
                            }
                        }
                        throw new cz(z[64] + a.c);
                    } catch (NumberFormatException e2222) {
                        throw e2222;
                    }
                } catch (NumberFormatException e22222) {
                    throw e22222;
                } catch (NumberFormatException e222222) {
                    try {
                        throw e222222;
                    } catch (NumberFormatException e2222222) {
                        throw e2222222;
                    }
                }
            } catch (NumberFormatException e22222222) {
                throw e22222222;
            } catch (NumberFormatException e222222222) {
                throw e222222222;
            }
        }
        i2 = 0;
        if (i2 == 0) {
            throw new cz(z[62]);
        }
    }

    private void a(aa aaVar) {
        this.b = aaVar;
        this.g.a(new by(this));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void i() {
        /*
        r8 = this;
        r4 = 0;
        r1 = com.whatsapp.messaging.co.a;
        r0 = new android.content.Intent;
        r2 = z;
        r3 = 47;
        r2 = r2[r3];
        r0.<init>(r2);
        r2 = z;
        r3 = 45;
        r2 = r2[r3];
        r0 = r0.setPackage(r2);
        r2 = com.whatsapp.App.z();
        r3 = 1610612736; // 0x60000000 float:3.6893488E19 double:7.957484216E-315;
        r2 = android.app.PendingIntent.getBroadcast(r2, r4, r0, r3);
        if (r2 != 0) goto L_0x0063;
    L_0x0024:
        r2 = com.whatsapp.App.z();
        r3 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = android.app.PendingIntent.getBroadcast(r2, r4, r0, r3);
        r0 = com.whatsapp.App.z();
        r3 = z;
        r4 = 44;
        r3 = r3[r4];
        r0 = r0.getSystemService(r3);
        r0 = (android.app.AlarmManager) r0;
        r4 = android.os.SystemClock.elapsedRealtime();
        r6 = 32000; // 0x7d00 float:4.4842E-41 double:1.581E-319;
        r4 = r4 + r6;
        r3 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NumberFormatException -> 0x0070 }
        r6 = 23;
        if (r3 < r6) goto L_0x0051;
    L_0x004b:
        r3 = 2;
        r0.setExactAndAllowWhileIdle(r3, r4, r2);	 Catch:{ NumberFormatException -> 0x0072 }
        if (r1 == 0) goto L_0x0061;
    L_0x0051:
        r3 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NumberFormatException -> 0x0074 }
        r6 = 19;
        if (r3 < r6) goto L_0x005d;
    L_0x0057:
        r3 = 2;
        r0.setExact(r3, r4, r2);	 Catch:{ NumberFormatException -> 0x0076 }
        if (r1 == 0) goto L_0x0061;
    L_0x005d:
        r3 = 2;
        r0.set(r3, r4, r2);	 Catch:{ NumberFormatException -> 0x0076 }
    L_0x0061:
        if (r1 == 0) goto L_0x006c;
    L_0x0063:
        r0 = z;	 Catch:{ NumberFormatException -> 0x0078 }
        r1 = 46;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x0078 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ NumberFormatException -> 0x0078 }
    L_0x006c:
        r0 = 1;
        r8.f = r0;
        return;
    L_0x0070:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0072 }
    L_0x0072:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0074 }
    L_0x0074:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0076 }
    L_0x0076:
        r0 = move-exception;
        throw r0;
    L_0x0078:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.messaging.ah.i():void");
    }

    static ar k(ah ahVar) {
        return ahVar.g;
    }

    protected void onLooperPrepared() {
        this.d = new q(this);
        this.i = new v(new az(this));
        this.i.start();
    }

    static void a(ah ahVar, c3 c3Var) {
        ahVar.a(c3Var);
    }

    private void h() {
        this.j.a(true);
        b(false);
    }

    static void b(ah ahVar, Message message) {
        ahVar.b(message);
    }

    static void c(ah ahVar) {
        ahVar.c();
    }

    static void j(ah ahVar) {
        ahVar.n();
    }

    static void h(ah ahVar) {
        ahVar.b();
    }

    private void a(Message message) {
        int i = co.a;
        try {
            this.b.a(Message.obtain(message));
            switch (message.arg1) {
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    this.d.i();
                    if (i == 0) {
                        return;
                    }
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    break;
                default:
                    return;
            }
            Bundle bundle = (Bundle) message.obj;
            if (bundle != null) {
                try {
                    if (bundle.getBoolean(z[80], false)) {
                        bundle.putBoolean(z[79], false);
                        this.d.b();
                        if (i == 0) {
                            return;
                        }
                        this.d.d();
                    }
                } catch (NumberFormatException e) {
                    throw e;
                } catch (NumberFormatException e2) {
                    throw e2;
                }
            }
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    private void a(c3 c3Var) {
        this.d.a(c3Var);
    }

    static void a(ah ahVar, boolean z) {
        ahVar.c(z);
    }

    @NonNull
    private ClientPayload a(@NonNull Context context, @NonNull String str, @Nullable String str2, @Nullable byte[] bArr, boolean z, @Nullable String str3) {
        ClientPayload.Builder newBuilder = ClientPayload.newBuilder();
        try {
            newBuilder.setUsername(Long.parseLong(str));
            if (bArr != null) {
                try {
                    if (bArr.length > 0) {
                        newBuilder.setLegacyPassword(hx.a(bArr));
                    }
                } catch (NumberFormatException e) {
                    throw e;
                }
            }
            try {
                newBuilder.setPassive(z);
                if (!TextUtils.isEmpty(str2)) {
                    newBuilder.setPushName(str2);
                }
                UserAgent.Builder userAgentBuilder = newBuilder.getUserAgentBuilder();
                userAgentBuilder.setPlatform(Platform.ANDROID);
                a(userAgentBuilder.getAppVersionBuilder());
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(z[48]);
                if (telephonyManager != null) {
                    a_ a = a_.a(telephonyManager.getNetworkOperator());
                    userAgentBuilder.setMcc(a.a());
                    userAgentBuilder.setMnc(a.b());
                }
                userAgentBuilder.setOsVersion(VERSION.RELEASE);
                userAgentBuilder.setManufacturer(Build.MANUFACTURER);
                userAgentBuilder.setDevice(Build.DEVICE);
                userAgentBuilder.setOsBuildNumber(Build.DISPLAY);
                userAgentBuilder.setPhoneId(a.a(context).a().c);
                Object g = aqu.g();
                try {
                    if (!TextUtils.isEmpty(g)) {
                        if (!z[50].equals(g)) {
                            userAgentBuilder.setLocaleLanguageIso6391(g);
                        }
                    }
                    g = aqu.c();
                    try {
                        if (!TextUtils.isEmpty(g)) {
                            if (!z[52].equals(g)) {
                                userAgentBuilder.setLocaleCountryIso31661Alpha2(g);
                            }
                        }
                        ReleaseChannel f = f();
                        if (f != null) {
                            try {
                                userAgentBuilder.setReleaseChannel(f);
                            } catch (NumberFormatException e2) {
                                throw e2;
                            }
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            WebInfo.Builder webInfoBuilder = newBuilder.getWebInfoBuilder();
                            webInfoBuilder.setRefToken(str3);
                            webInfoBuilder.setVersion(z[51]);
                            WebdPayload.Builder webdPayloadBuilder = webInfoBuilder.getWebdPayloadBuilder();
                            webdPayloadBuilder.setSupportsUrlMessages(true);
                            webdPayloadBuilder.setSupportsStarredMessages(true);
                            webdPayloadBuilder.setSupportsE2EImage(true);
                            webdPayloadBuilder.setSupportsE2EVideo(true);
                            webdPayloadBuilder.setSupportsE2EAudio(true);
                            webdPayloadBuilder.setSupportsE2EDocument(awx.b);
                        }
                        return newBuilder.build();
                    } catch (NumberFormatException e22) {
                        throw e22;
                    } catch (NumberFormatException e222) {
                        throw e222;
                    }
                } catch (NumberFormatException e2222) {
                    throw e2222;
                } catch (NumberFormatException e22222) {
                    throw e22222;
                }
            } catch (NumberFormatException e222222) {
                throw e222222;
            }
        } catch (Throwable e3) {
            AssertionError assertionError = new AssertionError(z[49] + str);
            assertionError.initCause(e3);
            throw assertionError;
        }
    }

    private void e() {
        try {
            this.b.a(co.k());
            if (ChangeNumber.g()) {
                l();
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    static void e(ah ahVar) {
        ahVar.g();
    }

    static void l(ah ahVar) {
        ahVar.k();
    }
}
