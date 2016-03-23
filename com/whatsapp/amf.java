package com.whatsapp;

import android.support.annotation.NonNull;
import com.whatsapp.fieldstats.b4;
import com.whatsapp.fieldstats.bz;
import com.whatsapp.fieldstats.i;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

final class amf implements Runnable {
    private static final String[] z;
    private final boolean a;
    private final co b;
    final App c;
    private final long d;

    static {
        String[] strArr = new String[9];
        String str = "L\u0015]\u00122_\u0004W\u000e0\u001e\u0015\f\u0005wS\u0015M\u00136Y\u0015\u001e\n8\\P\\\u00054_\u0005M\u0005wW\u0004\u0019\u0013wP\u001fJ@>PPJ\b2\u001e\u0003]\b2Z\u0005R\u00053\u001e\u001cW\u0013#\u0005PS\u0005$M\u0011Y\u0005yU\u0015G]";
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
                        i3 = 62;
                        break;
                    case at.g /*1*/:
                        i3 = 112;
                        break;
                    case at.i /*2*/:
                        i3 = 62;
                        break;
                    case at.o /*3*/:
                        i3 = 96;
                        break;
                    default:
                        i3 = 87;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u001e\u0019P\u00148\u001e\u0000[\u000e3W\u001eY@2\f\u0015\u001e\u00132M\u0003W\u000f9\u001e\u0003J\u0001#[PZ\u00152\u001e\u0004Q@9QPM\u0005$M\u0019Q\u000ew_\u001eZ@i\fD\u001e\b8K\u0002M@$W\u001e]\u0005wR\u0011M\u0014wU\u0015G@%[\u0001K\u0005$J";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "_\bQ\f8J\u001c\u001e\u0010\"J\u0004W\u000e0\u001e";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "J\u0002W\u00053\u001e\u0004Q@$[\u001eZ@6\u001e\u0000R\u0001>P\u0004[\u0018#\u001e\u001d[\u0013$_\u0017[@ W\u0004V@2P\u0013L\u0019'J\u0019Q\u000ewR\u001f]\u000b2ZPQ\u000el\u001e\u001d[\u0013$_\u0017[N<[\t\u0003";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "_\bQ\f8J\u001c\u001e\t0P\u001fL\t9YPS\u0005$M\u0011Y\u0005l\u001e\u001d[\u0013$_\u0017[N<[\t\u0003";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "_\bQ\f8J\u001c\u001e\u00132P\u0014W\u000e0\u001e\u0015P\u0003%G\u0000J\u00053\u001e\u001d[\u0013$_\u0017[[wS\u0015M\u00136Y\u0015\u0010\u000b2GM";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "_\bQ\f8J\u001c\u001e\u00059]\u0002G\u0010#W\u001fP@;Q\u0013U\u00053\u001e\u001fP@5K\u0004\u001e\u00176MPY\u000f>P\u0017\u001e\u00148\u001e\u0003[\u000e3\u001e\u0011\u001e\u0010;_\u0019P\u00142F\u0004\u001e\r2M\u0003_\u00072\u0005PS\u0005$M\u0011Y\u0005yU\u0015G]";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "_\bQ\f8J\u001c\u001e\u00132P\u0014W\u000e0\u001e\u0000R\u0001>P\u0004[\u0018#\u001e\u001d[\u0013$_\u0017[[wS\u0015M\u00136Y\u0015\u0010\u000b2GM";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "_\bQ\f8J\u001c\u001e\r6L\u001bW\u000e0\u001e\u001d[\u0013$_\u0017[@6MPK\u000e$[\u001eJ@%_\u0004V\u0005%\u001e\u0004V\u00019\u001e\u0000[\u000e3W\u001eY@2\f\u0015\u001e\u00132M\u0003W\u000f9\u0005PS\u0005$M\u0011Y\u0005yU\u0015G]";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r21 = this;
        r18 = com.whatsapp.DialogToastActivity.f;
        r0 = r21;
        r2 = r0.b;
        r2 = r2.k;
        r2 = r2.c;
        com.whatsapp.auv.a(r2);
        r0 = r21;
        r2 = r0.c;
        r2 = com.whatsapp.App.a(r2);
        r19 = com.whatsapp.awc.a(r2);
        r0 = r21;
        r2 = r0.b;
        r3 = 0;
        r2.a(r3);
        r0 = r21;
        r2 = r0.b;
        r3 = 0;
        r2.b(r3);
        r2 = de.greenrobot.event.h.b();
        r3 = com.whatsapp.amm.class;
        r2 = r2.b(r3);
        r2 = (com.whatsapp.amm) r2;
        r12 = r2.a();
        r0 = r21;
        r2 = r0.b;	 Catch:{ IllegalArgumentException -> 0x017a }
        r2 = r2.c;	 Catch:{ IllegalArgumentException -> 0x017a }
        if (r2 != 0) goto L_0x017c;
    L_0x0041:
        r2 = 1;
        r16 = r2;
    L_0x0044:
        if (r16 == 0) goto L_0x0181;
    L_0x0046:
        r2 = 0;
    L_0x0047:
        r0 = r21;
        r3 = r0.b;	 Catch:{ IllegalArgumentException -> 0x018b }
        r3 = r3.c;	 Catch:{ IllegalArgumentException -> 0x018b }
        r4 = 5;
        if (r3 != r4) goto L_0x018d;
    L_0x0050:
        r3 = 1;
    L_0x0051:
        r0 = r21;
        r4 = r0.b;	 Catch:{ IllegalArgumentException -> 0x0190 }
        r4 = r4.c;	 Catch:{ IllegalArgumentException -> 0x0190 }
        r5 = 4;
        if (r4 != r5) goto L_0x0192;
    L_0x005a:
        r4 = 1;
    L_0x005b:
        r0 = r21;
        r5 = r0.b;	 Catch:{ IllegalArgumentException -> 0x0195 }
        r5 = r5.c;	 Catch:{ IllegalArgumentException -> 0x0195 }
        r6 = 1;
        if (r5 != r6) goto L_0x0199;
    L_0x0064:
        r5 = r2.mediaKey;	 Catch:{ IllegalArgumentException -> 0x0195 }
        if (r5 == 0) goto L_0x0199;
    L_0x0068:
        r5 = 1;
    L_0x0069:
        r0 = r21;
        r6 = r0.b;	 Catch:{ IllegalArgumentException -> 0x019c }
        r6 = r6.c;	 Catch:{ IllegalArgumentException -> 0x019c }
        r7 = 9;
        if (r6 != r7) goto L_0x01a0;
    L_0x0073:
        r6 = r2.mediaKey;	 Catch:{ IllegalArgumentException -> 0x019c }
        if (r6 == 0) goto L_0x01a0;
    L_0x0077:
        r6 = 1;
    L_0x0078:
        r0 = r21;
        r7 = r0.b;	 Catch:{ IllegalArgumentException -> 0x01a3 }
        r7 = r7.c;	 Catch:{ IllegalArgumentException -> 0x01a3 }
        r8 = 2;
        if (r7 != r8) goto L_0x01a7;
    L_0x0081:
        r7 = r2.mediaKey;	 Catch:{ IllegalArgumentException -> 0x01a3 }
        if (r7 == 0) goto L_0x01a7;
    L_0x0085:
        r7 = 1;
    L_0x0086:
        r0 = r21;
        r8 = r0.b;	 Catch:{ IllegalArgumentException -> 0x01aa }
        r8 = r8.c;	 Catch:{ IllegalArgumentException -> 0x01aa }
        r9 = 3;
        if (r8 != r9) goto L_0x01ae;
    L_0x008f:
        r2 = r2.mediaKey;	 Catch:{ IllegalArgumentException -> 0x01aa }
        if (r2 == 0) goto L_0x01ae;
    L_0x0093:
        r2 = 1;
    L_0x0094:
        r0 = r21;
        r8 = r0.b;
        r8 = r8.k;
        r8 = r8.c;
        r9 = com.whatsapp.qm.i(r8);
        r0 = r21;
        r8 = r0.b;
        r8 = r8.k;
        r8 = r8.c;
        r10 = com.whatsapp.l5.e(r8);
        if (r9 != 0) goto L_0x01b1;
    L_0x00ae:
        if (r10 != 0) goto L_0x01b1;
    L_0x00b0:
        r8 = 1;
        r17 = r8;
    L_0x00b3:
        r0 = r21;
        r8 = r0.b;
        r8 = com.whatsapp.App.h(r8);
        r11 = com.whatsapp.App.as;
        r0 = r21;
        r14 = r0.b;
        r14 = r14.k;
        r14 = r14.c;
        r0 = r21;
        r15 = r0.b;
        r15 = r15.g;
        r20 = com.whatsapp.uq.ALLOW;
        r0 = r20;
        r11 = r11.a(r14, r15, r0);
        if (r8 == 0) goto L_0x00d7;
    L_0x00d5:
        if (r11 != 0) goto L_0x0167;
    L_0x00d7:
        if (r5 != 0) goto L_0x0167;
    L_0x00d9:
        if (r6 != 0) goto L_0x0167;
    L_0x00db:
        if (r7 != 0) goto L_0x0167;
    L_0x00dd:
        if (r2 != 0) goto L_0x0167;
    L_0x00df:
        if (r16 == 0) goto L_0x00fb;
    L_0x00e1:
        if (r17 == 0) goto L_0x00fb;
    L_0x00e3:
        r2 = com.whatsapp.App.as;	 Catch:{ IllegalArgumentException -> 0x01b6 }
        r0 = r21;
        r5 = r0.b;	 Catch:{ IllegalArgumentException -> 0x01b6 }
        r5 = r5.k;	 Catch:{ IllegalArgumentException -> 0x01b6 }
        r5 = r5.c;	 Catch:{ IllegalArgumentException -> 0x01b6 }
        r0 = r21;
        r6 = r0.b;	 Catch:{ IllegalArgumentException -> 0x01b6 }
        r6 = r6.g;	 Catch:{ IllegalArgumentException -> 0x01b6 }
        r7 = com.whatsapp.ms.ALLOW;	 Catch:{ IllegalArgumentException -> 0x01b6 }
        r2 = r2.a(r5, r6, r7);	 Catch:{ IllegalArgumentException -> 0x01b6 }
        if (r2 != 0) goto L_0x0167;
    L_0x00fb:
        if (r16 == 0) goto L_0x0117;
    L_0x00fd:
        if (r9 == 0) goto L_0x0117;
    L_0x00ff:
        r2 = com.whatsapp.App.as;	 Catch:{ IllegalArgumentException -> 0x01bc }
        r0 = r21;
        r5 = r0.b;	 Catch:{ IllegalArgumentException -> 0x01bc }
        r5 = r5.k;	 Catch:{ IllegalArgumentException -> 0x01bc }
        r5 = r5.c;	 Catch:{ IllegalArgumentException -> 0x01bc }
        r0 = r21;
        r6 = r0.b;	 Catch:{ IllegalArgumentException -> 0x01bc }
        r6 = r6.g;	 Catch:{ IllegalArgumentException -> 0x01bc }
        r7 = com.whatsapp.ms.ALLOW;	 Catch:{ IllegalArgumentException -> 0x01bc }
        r2 = r2.a(r5, r6, r7);	 Catch:{ IllegalArgumentException -> 0x01bc }
        if (r2 != 0) goto L_0x0167;
    L_0x0117:
        if (r16 == 0) goto L_0x0133;
    L_0x0119:
        if (r10 == 0) goto L_0x0133;
    L_0x011b:
        r2 = com.whatsapp.App.as;	 Catch:{ IllegalArgumentException -> 0x01c2 }
        r0 = r21;
        r5 = r0.b;	 Catch:{ IllegalArgumentException -> 0x01c2 }
        r5 = r5.k;	 Catch:{ IllegalArgumentException -> 0x01c2 }
        r5 = r5.c;	 Catch:{ IllegalArgumentException -> 0x01c2 }
        r0 = r21;
        r6 = r0.b;	 Catch:{ IllegalArgumentException -> 0x01c2 }
        r6 = r6.g;	 Catch:{ IllegalArgumentException -> 0x01c2 }
        r7 = com.whatsapp.a5i.ALLOW;	 Catch:{ IllegalArgumentException -> 0x01c2 }
        r2 = r2.a(r5, r6, r7);	 Catch:{ IllegalArgumentException -> 0x01c2 }
        if (r2 != 0) goto L_0x0167;
    L_0x0133:
        if (r3 == 0) goto L_0x014d;
    L_0x0135:
        r2 = com.whatsapp.App.as;	 Catch:{ IllegalArgumentException -> 0x01c6 }
        r0 = r21;
        r3 = r0.b;	 Catch:{ IllegalArgumentException -> 0x01c6 }
        r3 = r3.k;	 Catch:{ IllegalArgumentException -> 0x01c6 }
        r3 = r3.c;	 Catch:{ IllegalArgumentException -> 0x01c6 }
        r0 = r21;
        r5 = r0.b;	 Catch:{ IllegalArgumentException -> 0x01c6 }
        r5 = r5.g;	 Catch:{ IllegalArgumentException -> 0x01c6 }
        r6 = com.whatsapp.asu.ALLOW;	 Catch:{ IllegalArgumentException -> 0x01c6 }
        r2 = r2.a(r3, r5, r6);	 Catch:{ IllegalArgumentException -> 0x01c6 }
        if (r2 != 0) goto L_0x0167;
    L_0x014d:
        if (r4 == 0) goto L_0x0264;
    L_0x014f:
        r2 = com.whatsapp.App.as;	 Catch:{ IllegalArgumentException -> 0x01ca }
        r0 = r21;
        r3 = r0.b;	 Catch:{ IllegalArgumentException -> 0x01ca }
        r3 = r3.k;	 Catch:{ IllegalArgumentException -> 0x01ca }
        r3 = r3.c;	 Catch:{ IllegalArgumentException -> 0x01ca }
        r0 = r21;
        r4 = r0.b;	 Catch:{ IllegalArgumentException -> 0x01ca }
        r4 = r4.g;	 Catch:{ IllegalArgumentException -> 0x01ca }
        r5 = com.whatsapp.a2t.ALLOW;	 Catch:{ IllegalArgumentException -> 0x01ca }
        r2 = r2.a(r3, r4, r5);	 Catch:{ IllegalArgumentException -> 0x01ca }
        if (r2 == 0) goto L_0x0264;
    L_0x0167:
        r0 = r21;
        r2 = r0.b;
        r2 = r2.k;
        r2 = com.whatsapp.jobqueue.job.SendE2EMessageJob.a(r2);
        r0 = r21;
        r3 = r0.a;	 Catch:{ IllegalArgumentException -> 0x01cc }
        if (r3 == 0) goto L_0x01d0;
    L_0x0177:
        if (r2 == 0) goto L_0x01d0;
    L_0x0179:
        return;
    L_0x017a:
        r2 = move-exception;
        throw r2;
    L_0x017c:
        r2 = 0;
        r16 = r2;
        goto L_0x0044;
    L_0x0181:
        r0 = r21;
        r2 = r0.b;
        r2 = r2.Q;
        r2 = (com.whatsapp.MediaData) r2;
        goto L_0x0047;
    L_0x018b:
        r2 = move-exception;
        throw r2;
    L_0x018d:
        r3 = 0;
        goto L_0x0051;
    L_0x0190:
        r2 = move-exception;
        throw r2;
    L_0x0192:
        r4 = 0;
        goto L_0x005b;
    L_0x0195:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x0197 }
    L_0x0197:
        r2 = move-exception;
        throw r2;
    L_0x0199:
        r5 = 0;
        goto L_0x0069;
    L_0x019c:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x019e }
    L_0x019e:
        r2 = move-exception;
        throw r2;
    L_0x01a0:
        r6 = 0;
        goto L_0x0078;
    L_0x01a3:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x01a5 }
    L_0x01a5:
        r2 = move-exception;
        throw r2;
    L_0x01a7:
        r7 = 0;
        goto L_0x0086;
    L_0x01aa:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x01ac }
    L_0x01ac:
        r2 = move-exception;
        throw r2;
    L_0x01ae:
        r2 = 0;
        goto L_0x0094;
    L_0x01b1:
        r8 = 0;
        r17 = r8;
        goto L_0x00b3;
    L_0x01b6:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x01b8 }
    L_0x01b8:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x01ba }
    L_0x01ba:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x01bc }
    L_0x01bc:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x01be }
    L_0x01be:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x01c0 }
    L_0x01c0:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x01c2 }
    L_0x01c2:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x01c4 }
    L_0x01c4:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x01c6 }
    L_0x01c6:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x01c8 }
    L_0x01c8:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x01ca }
    L_0x01ca:
        r2 = move-exception;
        throw r2;
    L_0x01cc:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x01ce }
    L_0x01ce:
        r2 = move-exception;
        throw r2;
    L_0x01d0:
        r0 = r21;
        r2 = r0.a;	 Catch:{ IllegalArgumentException -> 0x02fb }
        if (r2 == 0) goto L_0x01f5;
    L_0x01d6:
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x02fb }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x02fb }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x02fb }
        r4 = 0;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x02fb }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x02fb }
        r0 = r21;
        r3 = r0.b;	 Catch:{ IllegalArgumentException -> 0x02fb }
        r3 = r3.k;	 Catch:{ IllegalArgumentException -> 0x02fb }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x02fb }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x02fb }
        com.whatsapp.util.Log.w(r2);	 Catch:{ IllegalArgumentException -> 0x02fb }
    L_0x01f5:
        r3 = com.whatsapp.proto.E2E.Message.newBuilder();
        r0 = r21;
        r4 = r0.b;	 Catch:{ IllegalArgumentException -> 0x02fd }
        if (r11 != 0) goto L_0x02ff;
    L_0x01ff:
        r2 = 1;
    L_0x0200:
        com.whatsapp.util.ai.a(r4, r3, r2);	 Catch:{ IllegalArgumentException -> 0x0302 }
        if (r10 != 0) goto L_0x021f;
    L_0x0205:
        if (r9 == 0) goto L_0x0308;
    L_0x0207:
        r2 = com.whatsapp.App.as;	 Catch:{ IllegalArgumentException -> 0x0304 }
        r0 = r21;
        r4 = r0.b;	 Catch:{ IllegalArgumentException -> 0x0304 }
        r4 = r4.k;	 Catch:{ IllegalArgumentException -> 0x0304 }
        r4 = r4.c;	 Catch:{ IllegalArgumentException -> 0x0304 }
        r0 = r21;
        r5 = r0.b;	 Catch:{ IllegalArgumentException -> 0x0304 }
        r5 = r5.g;	 Catch:{ IllegalArgumentException -> 0x0304 }
        r6 = com.whatsapp.ao4.ALLOW;	 Catch:{ IllegalArgumentException -> 0x0304 }
        r2 = r2.a(r4, r5, r6);	 Catch:{ IllegalArgumentException -> 0x0304 }
        if (r2 == 0) goto L_0x0308;
    L_0x021f:
        r11 = 1;
    L_0x0220:
        r0 = r21;
        r2 = r0.c;	 Catch:{ IllegalArgumentException -> 0x030b }
        r0 = r2.ai;	 Catch:{ IllegalArgumentException -> 0x030b }
        r20 = r0;
        r2 = new com.whatsapp.jobqueue.job.SendE2EMessageJob;	 Catch:{ IllegalArgumentException -> 0x030b }
        r3 = r3.build();	 Catch:{ IllegalArgumentException -> 0x030b }
        r0 = r21;
        r4 = r0.b;	 Catch:{ IllegalArgumentException -> 0x030b }
        r4 = r4.k;	 Catch:{ IllegalArgumentException -> 0x030b }
        r4 = r4.b;	 Catch:{ IllegalArgumentException -> 0x030b }
        r0 = r21;
        r5 = r0.b;	 Catch:{ IllegalArgumentException -> 0x030b }
        r5 = r5.k;	 Catch:{ IllegalArgumentException -> 0x030b }
        r5 = r5.c;	 Catch:{ IllegalArgumentException -> 0x030b }
        r6 = 0;
        r0 = r21;
        r7 = r0.b;	 Catch:{ IllegalArgumentException -> 0x030b }
        r7 = r7.C;	 Catch:{ IllegalArgumentException -> 0x030b }
        r0 = r21;
        r8 = r0.b;	 Catch:{ IllegalArgumentException -> 0x030b }
        r8 = r8.g;	 Catch:{ IllegalArgumentException -> 0x030b }
        r0 = r21;
        r9 = r0.b;	 Catch:{ IllegalArgumentException -> 0x030b }
        r9 = r9.J;	 Catch:{ IllegalArgumentException -> 0x030b }
        r10 = 0;
        r14 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r12 = r12 + r14;
        r0 = r21;
        r14 = r0.d;	 Catch:{ IllegalArgumentException -> 0x030b }
        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14);	 Catch:{ IllegalArgumentException -> 0x030b }
        r0 = r20;
        r0.a(r2);	 Catch:{ IllegalArgumentException -> 0x030b }
        if (r18 == 0) goto L_0x0179;
    L_0x0264:
        if (r16 == 0) goto L_0x03d4;
    L_0x0266:
        if (r17 == 0) goto L_0x03d4;
    L_0x0268:
        r0 = r21;
        r2 = r0.b;	 Catch:{ IllegalArgumentException -> 0x030f }
        r2 = r2.k;	 Catch:{ IllegalArgumentException -> 0x030f }
        r2 = r2.c;	 Catch:{ IllegalArgumentException -> 0x030f }
        r7 = com.whatsapp.awc.e(r2);	 Catch:{ IllegalArgumentException -> 0x030f }
        r2 = r7.b();
        r0 = r19;
        r2 = r0.c(r2);
        r2 = r2.a();
        r3 = java.util.Calendar.getInstance();
        r4 = 5;
        r5 = -1;
        r3.add(r4, r5);
        r0 = r19;
        r4 = r0.b(r7);
        if (r2 == 0) goto L_0x029d;
    L_0x0293:
        r3 = r3.getTime();	 Catch:{ IllegalArgumentException -> 0x0315 }
        r2 = r2.before(r3);	 Catch:{ IllegalArgumentException -> 0x0315 }
        if (r2 == 0) goto L_0x0317;
    L_0x029d:
        r2 = 1;
    L_0x029e:
        if (r4 != 0) goto L_0x0319;
    L_0x02a0:
        if (r2 == 0) goto L_0x0319;
    L_0x02a2:
        r0 = r21;
        r2 = r0.c;	 Catch:{ IllegalArgumentException -> 0x02f9 }
        r2 = r2.ai;	 Catch:{ IllegalArgumentException -> 0x02f9 }
        r3 = new com.whatsapp.jobqueue.job.GetPreKeyJob;	 Catch:{ IllegalArgumentException -> 0x02f9 }
        r0 = r21;
        r4 = r0.b;	 Catch:{ IllegalArgumentException -> 0x02f9 }
        r4 = r4.k;	 Catch:{ IllegalArgumentException -> 0x02f9 }
        r4 = r4.c;	 Catch:{ IllegalArgumentException -> 0x02f9 }
        r5 = 0;
        r3.<init>(r4, r5);	 Catch:{ IllegalArgumentException -> 0x02f9 }
        r2.a(r3);	 Catch:{ IllegalArgumentException -> 0x02f9 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x02f9 }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x02f9 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x02f9 }
        r4 = 3;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x02f9 }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x02f9 }
        r0 = r21;
        r3 = r0.b;	 Catch:{ IllegalArgumentException -> 0x02f9 }
        r3 = r3.k;	 Catch:{ IllegalArgumentException -> 0x02f9 }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x02f9 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x02f9 }
        r4 = 2;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x02f9 }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x02f9 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x02f9 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IllegalArgumentException -> 0x02f9 }
        r0 = r21;
        r2 = r0.b;	 Catch:{ IllegalArgumentException -> 0x02f9 }
        r3 = 14;
        r2.d = r3;	 Catch:{ IllegalArgumentException -> 0x02f9 }
        r2 = com.whatsapp.App.aK;	 Catch:{ IllegalArgumentException -> 0x02f9 }
        r0 = r21;
        r3 = r0.b;	 Catch:{ IllegalArgumentException -> 0x02f9 }
        r3 = r3.k;	 Catch:{ IllegalArgumentException -> 0x02f9 }
        r2.b(r3);	 Catch:{ IllegalArgumentException -> 0x02f9 }
        r21.a();	 Catch:{ IllegalArgumentException -> 0x02f9 }
        goto L_0x0179;
    L_0x02f9:
        r2 = move-exception;
        throw r2;
    L_0x02fb:
        r2 = move-exception;
        throw r2;
    L_0x02fd:
        r2 = move-exception;
        throw r2;
    L_0x02ff:
        r2 = 0;
        goto L_0x0200;
    L_0x0302:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x0304 }
    L_0x0304:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x0306 }
    L_0x0306:
        r2 = move-exception;
        throw r2;
    L_0x0308:
        r11 = 0;
        goto L_0x0220;
    L_0x030b:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x030d }
    L_0x030d:
        r2 = move-exception;
        throw r2;
    L_0x030f:
        r2 = move-exception;
        r21.a();
        goto L_0x0179;
    L_0x0315:
        r2 = move-exception;
        throw r2;
    L_0x0317:
        r2 = 0;
        goto L_0x029e;
    L_0x0319:
        if (r4 == 0) goto L_0x039f;
    L_0x031b:
        r2 = new org.whispersystems.i;
        r5 = r19.i();
        r3 = r19;
        r4 = r19;
        r6 = r19;
        r2.<init>(r3, r4, r5, r6, r7);
        r3 = com.whatsapp.App.as;
        r0 = r21;
        r4 = r0.b;
        r4 = r4.k;
        r4 = r4.c;
        r3 = r3.b(r4);
        r4 = com.whatsapp.App.as;
        r4.l(r3);
        r4 = com.whatsapp.ms.class;
        r3 = r3.a(r4);
        r3 = (com.whatsapp.ms) r3;
        r4 = com.whatsapp.ms.ALLOW;
        if (r3 != r4) goto L_0x0377;
    L_0x0349:
        r3 = 2;
        r4 = com.whatsapp.proto.E2E.Message.newBuilder();
        r0 = r21;
        r5 = r0.b;
        r5 = r5.c();
        r4 = r4.setConversation(r5);
        r4 = r4.build();
        r4 = r4.b();
        r5 = r4.length;
        r5 = r5 + 1;
        r5 = new byte[r5];
        r6 = 0;
        r7 = 0;
        r8 = r4.length;
        java.lang.System.arraycopy(r4, r6, r5, r7, r8);
        r4 = r4.length;
        r6 = 1;
        r5[r4] = r6;
        r4 = r2.a(r5);
        if (r18 == 0) goto L_0x0385;
    L_0x0377:
        r3 = 1;
        r0 = r21;
        r4 = r0.b;
        r4 = r4.e();
        r2 = r2.a(r4);
        r4 = r2;
    L_0x0385:
        r2 = r4.a();	 Catch:{ IllegalArgumentException -> 0x03db }
        r5 = 3;
        if (r2 != r5) goto L_0x03dd;
    L_0x038c:
        r2 = 1;
    L_0x038d:
        r0 = r21;
        r5 = r0.b;	 Catch:{ IllegalArgumentException -> 0x03df }
        r6 = new com.whatsapp.protocol.b1;	 Catch:{ IllegalArgumentException -> 0x03df }
        r4 = r4.b();	 Catch:{ IllegalArgumentException -> 0x03df }
        r6.<init>(r3, r2, r4);	 Catch:{ IllegalArgumentException -> 0x03df }
        r5.a(r6);	 Catch:{ IllegalArgumentException -> 0x03df }
        if (r18 == 0) goto L_0x03cf;
    L_0x039f:
        r0 = r21;
        r2 = r0.b;	 Catch:{ IllegalArgumentException -> 0x03e1 }
        r2 = r2.d;	 Catch:{ IllegalArgumentException -> 0x03e1 }
        r3 = 14;
        if (r2 != r3) goto L_0x03cf;
    L_0x03a9:
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalArgumentException -> 0x03e1 }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x03e1 }
        r3 = z;	 Catch:{ IllegalArgumentException -> 0x03e1 }
        r4 = 1;
        r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x03e1 }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x03e1 }
        r0 = r21;
        r3 = r0.b;	 Catch:{ IllegalArgumentException -> 0x03e1 }
        r3 = r3.k;	 Catch:{ IllegalArgumentException -> 0x03e1 }
        r2 = r2.append(r3);	 Catch:{ IllegalArgumentException -> 0x03e1 }
        r2 = r2.toString();	 Catch:{ IllegalArgumentException -> 0x03e1 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IllegalArgumentException -> 0x03e1 }
        r0 = r21;
        r2 = r0.b;	 Catch:{ IllegalArgumentException -> 0x03e1 }
        r3 = 0;
        r2.d = r3;	 Catch:{ IllegalArgumentException -> 0x03e1 }
    L_0x03cf:
        r21.a();	 Catch:{ IllegalArgumentException -> 0x03d9 }
        if (r18 == 0) goto L_0x0179;
    L_0x03d4:
        r21.a();	 Catch:{ IllegalArgumentException -> 0x03d9 }
        goto L_0x0179;
    L_0x03d9:
        r2 = move-exception;
        throw r2;
    L_0x03db:
        r2 = move-exception;
        throw r2;
    L_0x03dd:
        r2 = 0;
        goto L_0x038d;
    L_0x03df:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalArgumentException -> 0x03e1 }
    L_0x03e1:
        r2 = move-exception;
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.amf.run():void");
    }

    private void a() {
        boolean z = DialogToastActivity.f;
        boolean a = App.as.a(this.b.k.c, this.b.g, it.ALLOW);
        try {
            if (App.N()) {
                if (this.b.d != 14) {
                    try {
                        if (this.b.f()) {
                            try {
                                Log.i(z[6] + this.b.k);
                                App.aF().b(com.whatsapp.messaging.co.a(this.b.k, this.d, this.b.B.a, this.b.B.b, this.b.B.c, this.b.C, null, this.b.h, this.b.g, this.b.J, null));
                                if (!z) {
                                    return;
                                }
                            } catch (IllegalArgumentException e) {
                                throw e;
                            }
                        }
                        if (a) {
                            Log.e(z[7] + this.b.k);
                            auv.a(z[4] + this.b.k);
                            av bzVar = new bz();
                            try {
                                bzVar.a = Double.valueOf((double) b4.ORIGINAL_PLAINTEXT.getCode());
                                i.a(App.z(), bzVar);
                                App.aQ().post(new al9(this));
                                if (!z) {
                                    return;
                                }
                            } catch (IllegalArgumentException e2) {
                                throw e2;
                            } catch (IllegalArgumentException e22) {
                                throw e22;
                            }
                        }
                        Log.i(z[8] + this.b.k);
                        App.aF().b(com.whatsapp.messaging.co.d(this.b));
                        if (!z) {
                            return;
                        }
                    } catch (IllegalArgumentException e222) {
                        throw e222;
                    }
                }
            }
            Log.i(z[5] + this.b.k);
            App.aQ().post(new hg(this));
        } catch (IllegalArgumentException e2222) {
            throw e2222;
        } catch (IllegalArgumentException e22222) {
            throw e22222;
        }
    }

    public amf(@NonNull App app, co coVar, boolean z, long j) {
        this.c = app;
        this.b = (co) auv.a((Object) coVar);
        auv.a(coVar.k);
        this.a = z;
        this.d = j;
    }

    static co a(amf com_whatsapp_amf) {
        return com_whatsapp_amf.b;
    }
}
