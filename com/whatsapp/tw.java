package com.whatsapp;

import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.support.annotation.MainThread;
import com.whatsapp.fieldstats.a1;
import com.whatsapp.fieldstats.i;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class tw {
    private static tw e;
    private static final String[] z;
    private Handler a;
    private WakeLock b;
    private xb c;
    private final ArrayList d;

    static {
        String[] strArr = new String[24];
        String str = "O:H`cZ=Mg\u007fm H`bi\n^{c|";
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
                        i3 = 14;
                        break;
                    case at.g /*1*/:
                        i3 = 79;
                        break;
                    case at.i /*2*/:
                        i3 = 44;
                        break;
                    case at.o /*3*/:
                        i3 = 9;
                        break;
                    default:
                        i3 = 12;
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
                    str = "@ \fz|o,I";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "c*H`mz=Mg\u007fm Hl}{*Yl#h&@lba;Jfy`+";
                    obj = 2;
                    strArr2 = strArr3;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "o:H`c.8Mz,` X)x|.Bzoa+Im,m ^{im;@p";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = " .Mj";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "c*H`mz=Mg\u007fm Hl}{*Yl#g#@lko#_}mz*";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "c*H`mz=Mg\u007fm Hl}{*Yl#\u007f:I|i.";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "@ \fz|o,I";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    str = " \"\\=";
                    obj = 8;
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    strArr2 = strArr3;
                    str = "c*H`mz=Mg\u007fm Hl}{*Yl#b&Nd|:\"Yqiv,Iyxg B";
                    obj = 9;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "c*H`mz=Mg\u007fm Hl}{*Yl#[!Mk`koXf,m=IhxkoO{m}'\f`b.9Emiao_lbz&Bl`.)Eei";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    str = "c*H`mz=Mg\u007fm Hl}{*Yl#z=Ed";
                    obj = 11;
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    strArr2 = strArr3;
                    str = "c*H`mz=Mg\u007fm Hl}{*Yl#m \\p";
                    obj = 12;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    str = "c*H`mz=Mg\u007fm Hl}{*Yl#h.EeijbXf!m=Ihxk`";
                    obj = 13;
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    strArr2 = strArr3;
                    str = "c*H`mz=Mg\u007fm Hl}{*Yl#m \\p";
                    obj = 14;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "x&Hlc.8Mz,` X)x|.Bzoa+Im,m ^{im;@p";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "c*H`mz=Mg\u007fm Hl}{*Yl#g#@lko#_}mz*";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "c*H`mz=Mg\u007fm Hl}{*Yl#l.H)zg+If";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "c*H`mz=Mg\u007fm Hl}{*Yl#h&@lba;Jfy`+";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "c*H`mz=Mg\u007fm Hl}{*Yl#m Yeh.!C},i*X)zg+If,z'Ydn";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "c*H`mz=Mg\u007fm Hl}{*Yl#g Iqok?X`c`";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "~ [l~";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "c*H`mz=Mg\u007fm Hl";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "X&HlcZ=Mg\u007fm H`bi\n^{c|";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static void a(tw twVar, co coVar) {
        twVar.b(coVar);
    }

    @MainThread
    public static synchronized tw a() {
        tw twVar;
        synchronized (tw.class) {
            try {
                auv.a();
                if (e == null) {
                    e = new tw();
                }
                twVar = e;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return twVar;
    }

    private static void b(Exception exception) {
        av a1Var = new a1();
        a1Var.a = z[1];
        a1Var.b = exception.toString();
        i.a(App.z(), a1Var);
    }

    public static void a(Exception exception) {
        av a1Var = new a1();
        a1Var.a = z[0];
        a1Var.b = exception.toString();
        i.a(App.z(), a1Var);
    }

    public void a(co coVar) {
        coVar.d = 1;
        MediaData mediaData = (MediaData) coVar.Q;
        mediaData.transferring = true;
        mediaData.progress = 0;
        App.aK.a(coVar, false, -1);
        synchronized (this.d) {
            if (mediaData.file != null) {
                Log.i(z[7] + coVar.k.b + " " + mediaData.file.getAbsolutePath());
            }
            this.d.add(coVar);
            this.d.notifyAll();
        }
        try {
            if (this.c == null) {
                this.c = new xb(this);
                this.c.setPriority(1);
                this.c.start();
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private tw() {
        this.d = new ArrayList();
        this.a = new Handler(Looper.getMainLooper());
        PowerManager powerManager = (PowerManager) App.z().getSystemService(z[22]);
        if (powerManager != null) {
            try {
                this.b = powerManager.newWakeLock(1, z[23]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    static void b(tw twVar, co coVar) {
        twVar.c(coVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(com.whatsapp.protocol.co r13) {
        /*
        r12 = this;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = r13.Q;
        r0 = (com.whatsapp.MediaData) r0;
        r1 = com.whatsapp.App.z();
        r2 = z;
        r4 = 5;
        r2 = r2[r4];
        r4 = r13.c;
        r5 = r13.r;
        r6 = 1;
        r4 = com.whatsapp.util.ag.a(r1, r2, r4, r5, r6);
        r1 = r0.file;
        r6 = com.whatsapp.util.ag.a(r1);
        r8 = 0;
        r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r1 != 0) goto L_0x00ea;
    L_0x0024:
        r1 = 96000; // 0x17700 float:1.34525E-40 double:4.74303E-319;
    L_0x0027:
        r2 = 12200; // 0x2fa8 float:1.7096E-41 double:6.0276E-320;
        r5 = 96000; // 0x17700 float:1.34525E-40 double:4.74303E-319;
        r1 = java.lang.Math.min(r1, r5);
        r1 = java.lang.Math.max(r2, r1);
        r2 = new com.whatsapp.mb;
        r5 = r0.file;
        r2.<init>(r5, r4);
        r1 = r2.a(r1);
        r5 = r1.a();
        r1 = new com.whatsapp.om;
        r1.<init>(r12, r13, r0);
        r5.a(r1);
        r0.transcoder = r5;
        r2 = 0;
        r1 = r12.b;	 Catch:{ IllegalStateException -> 0x00f8, FileNotFoundException -> 0x00fa, IOException -> 0x0124 }
        if (r1 == 0) goto L_0x0057;
    L_0x0052:
        r1 = r12.b;	 Catch:{ IllegalStateException -> 0x00f8, FileNotFoundException -> 0x00fa, IOException -> 0x0124 }
        r1.acquire();	 Catch:{ IllegalStateException -> 0x00f8, FileNotFoundException -> 0x00fa, IOException -> 0x0124 }
    L_0x0057:
        r5.d();	 Catch:{ IllegalStateException -> 0x0122, FileNotFoundException -> 0x00fa, IOException -> 0x0124 }
        r1 = r5.b();	 Catch:{ IllegalStateException -> 0x0122, FileNotFoundException -> 0x00fa, IOException -> 0x0124 }
        if (r1 != 0) goto L_0x0165;
    L_0x0060:
        r1 = com.whatsapp.util.b.b(r4);	 Catch:{ IllegalStateException -> 0x0122, FileNotFoundException -> 0x00fa, IOException -> 0x0124 }
        if (r1 == 0) goto L_0x0069;
    L_0x0066:
        r2 = 1;
        if (r3 == 0) goto L_0x0165;
    L_0x0069:
        r1 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x0074, FileNotFoundException -> 0x00fa, IOException -> 0x0124 }
        r6 = z;	 Catch:{ IllegalStateException -> 0x0074, FileNotFoundException -> 0x00fa, IOException -> 0x0124 }
        r7 = 4;
        r6 = r6[r7];	 Catch:{ IllegalStateException -> 0x0074, FileNotFoundException -> 0x00fa, IOException -> 0x0124 }
        r1.<init>(r6);	 Catch:{ IllegalStateException -> 0x0074, FileNotFoundException -> 0x00fa, IOException -> 0x0124 }
        throw r1;	 Catch:{ IllegalStateException -> 0x0074, FileNotFoundException -> 0x00fa, IOException -> 0x0124 }
    L_0x0074:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalStateException -> 0x0076, FileNotFoundException -> 0x00fa, IOException -> 0x0124 }
    L_0x0076:
        r1 = move-exception;
        r6 = z;	 Catch:{ all -> 0x0184 }
        r7 = 6;
        r6 = r6[r7];	 Catch:{ all -> 0x0184 }
        com.whatsapp.util.Log.b(r6, r1);	 Catch:{ all -> 0x0184 }
        a(r1);	 Catch:{ all -> 0x0184 }
        r1 = r12.a;	 Catch:{ all -> 0x0184 }
        r6 = new com.whatsapp.aih;	 Catch:{ all -> 0x0184 }
        r6.<init>(r12);	 Catch:{ all -> 0x0184 }
        r1.post(r6);	 Catch:{ all -> 0x0184 }
        r1 = r12.b;
        if (r1 == 0) goto L_0x009d;
    L_0x0090:
        r1 = r12.b;	 Catch:{ IllegalStateException -> 0x017c }
        r1 = r1.isHeld();	 Catch:{ IllegalStateException -> 0x017c }
        if (r1 == 0) goto L_0x009d;
    L_0x0098:
        r1 = r12.b;	 Catch:{ IllegalStateException -> 0x017c }
        r1.release();	 Catch:{ IllegalStateException -> 0x017c }
    L_0x009d:
        if (r2 == 0) goto L_0x00d3;
    L_0x009f:
        r0.file = r4;	 Catch:{ IllegalStateException -> 0x019d }
        r1 = 1;
        r0.transcoded = r1;	 Catch:{ IllegalStateException -> 0x019d }
        r1 = r0.file;	 Catch:{ IllegalStateException -> 0x019d }
        r6 = r1.length();	 Catch:{ IllegalStateException -> 0x019d }
        r0.fileSize = r6;	 Catch:{ IllegalStateException -> 0x019d }
        r1 = r0.file;	 Catch:{ IllegalStateException -> 0x019d }
        r1 = r1.getName();	 Catch:{ IllegalStateException -> 0x019d }
        r13.A = r1;	 Catch:{ IllegalStateException -> 0x019d }
        r6 = r0.fileSize;	 Catch:{ IllegalStateException -> 0x019d }
        r13.z = r6;	 Catch:{ IllegalStateException -> 0x019d }
        r1 = r0.file;	 Catch:{ IllegalStateException -> 0x019d }
        r1 = com.whatsapp.util.ag.c(r1);	 Catch:{ IllegalStateException -> 0x019d }
        r13.H = r1;	 Catch:{ IllegalStateException -> 0x019d }
        r1 = com.whatsapp.App.aK;	 Catch:{ IllegalStateException -> 0x019d }
        r2 = 1;
        r4 = -1;
        r1.a(r13, r2, r4);	 Catch:{ IllegalStateException -> 0x019d }
        r1 = r12.a;	 Catch:{ IllegalStateException -> 0x019d }
        r2 = new com.whatsapp.asp;	 Catch:{ IllegalStateException -> 0x019d }
        r2.<init>(r12, r13);	 Catch:{ IllegalStateException -> 0x019d }
        r1.post(r2);	 Catch:{ IllegalStateException -> 0x019d }
        if (r3 == 0) goto L_0x00e9;
    L_0x00d3:
        r1 = 0;
        r0.transferring = r1;	 Catch:{ IllegalStateException -> 0x019f }
        r1 = 0;
        r13.d = r1;	 Catch:{ IllegalStateException -> 0x019f }
        r1 = r5.b();	 Catch:{ IllegalStateException -> 0x019f }
        if (r1 == 0) goto L_0x00e2;
    L_0x00df:
        r1 = 0;
        r0.autodownloadRetryEnabled = r1;	 Catch:{ IllegalStateException -> 0x019f }
    L_0x00e2:
        r0 = com.whatsapp.App.aK;
        r1 = 1;
        r2 = -1;
        r0.a(r13, r1, r2);
    L_0x00e9:
        return;
    L_0x00ea:
        r1 = r0.file;
        r8 = r1.length();
        r10 = 8000; // 0x1f40 float:1.121E-41 double:3.9525E-320;
        r8 = r8 * r10;
        r6 = r8 / r6;
        r1 = (int) r6;
        goto L_0x0027;
    L_0x00f8:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalStateException -> 0x0076, FileNotFoundException -> 0x00fa, IOException -> 0x0124 }
    L_0x00fa:
        r1 = move-exception;
        r6 = z;	 Catch:{ all -> 0x0184 }
        r7 = 3;
        r6 = r6[r7];	 Catch:{ all -> 0x0184 }
        com.whatsapp.util.Log.b(r6, r1);	 Catch:{ all -> 0x0184 }
        r1 = r12.a;	 Catch:{ all -> 0x0184 }
        r6 = new com.whatsapp.am;	 Catch:{ all -> 0x0184 }
        r6.<init>(r12);	 Catch:{ all -> 0x0184 }
        r1.post(r6);	 Catch:{ all -> 0x0184 }
        r1 = r12.b;
        if (r1 == 0) goto L_0x009d;
    L_0x0111:
        r1 = r12.b;	 Catch:{ IllegalStateException -> 0x0120 }
        r1 = r1.isHeld();	 Catch:{ IllegalStateException -> 0x0120 }
        if (r1 == 0) goto L_0x009d;
    L_0x0119:
        r1 = r12.b;	 Catch:{ IllegalStateException -> 0x0120 }
        r1.release();	 Catch:{ IllegalStateException -> 0x0120 }
        goto L_0x009d;
    L_0x0120:
        r0 = move-exception;
        throw r0;
    L_0x0122:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalStateException -> 0x0076, FileNotFoundException -> 0x00fa, IOException -> 0x0124 }
    L_0x0124:
        r1 = move-exception;
        r6 = r1.getMessage();	 Catch:{ IllegalStateException -> 0x017e }
        if (r6 == 0) goto L_0x0146;
    L_0x012b:
        r1 = r1.getMessage();	 Catch:{ IllegalStateException -> 0x017e }
        r6 = z;	 Catch:{ IllegalStateException -> 0x017e }
        r7 = 2;
        r6 = r6[r7];	 Catch:{ IllegalStateException -> 0x017e }
        r1 = r1.contains(r6);	 Catch:{ IllegalStateException -> 0x017e }
        if (r1 == 0) goto L_0x0146;
    L_0x013a:
        r1 = r12.a;	 Catch:{ IllegalStateException -> 0x0180 }
        r6 = new com.whatsapp.axt;	 Catch:{ IllegalStateException -> 0x0180 }
        r6.<init>(r12);	 Catch:{ IllegalStateException -> 0x0180 }
        r1.post(r6);	 Catch:{ IllegalStateException -> 0x0180 }
        if (r3 == 0) goto L_0x0150;
    L_0x0146:
        r1 = r12.a;	 Catch:{ IllegalStateException -> 0x0182 }
        r6 = new com.whatsapp.a2s;	 Catch:{ IllegalStateException -> 0x0182 }
        r6.<init>(r12);	 Catch:{ IllegalStateException -> 0x0182 }
        r1.post(r6);	 Catch:{ IllegalStateException -> 0x0182 }
    L_0x0150:
        r1 = r12.b;	 Catch:{ IllegalStateException -> 0x0197 }
        if (r1 == 0) goto L_0x009d;
    L_0x0154:
        r1 = r12.b;	 Catch:{ IllegalStateException -> 0x0197 }
        r1 = r1.isHeld();	 Catch:{ IllegalStateException -> 0x0197 }
        if (r1 == 0) goto L_0x009d;
    L_0x015c:
        r1 = r12.b;	 Catch:{ IllegalStateException -> 0x0163 }
        r1.release();	 Catch:{ IllegalStateException -> 0x0163 }
        goto L_0x009d;
    L_0x0163:
        r0 = move-exception;
        throw r0;
    L_0x0165:
        r1 = r12.b;	 Catch:{ IllegalStateException -> 0x017a }
        if (r1 == 0) goto L_0x009d;
    L_0x0169:
        r1 = r12.b;	 Catch:{ IllegalStateException -> 0x017a }
        r1 = r1.isHeld();	 Catch:{ IllegalStateException -> 0x017a }
        if (r1 == 0) goto L_0x009d;
    L_0x0171:
        r1 = r12.b;	 Catch:{ IllegalStateException -> 0x0178 }
        r1.release();	 Catch:{ IllegalStateException -> 0x0178 }
        goto L_0x009d;
    L_0x0178:
        r0 = move-exception;
        throw r0;
    L_0x017a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0178 }
    L_0x017c:
        r0 = move-exception;
        throw r0;
    L_0x017e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0180 }
    L_0x0180:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0182 }
    L_0x0182:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0184 }
    L_0x0184:
        r0 = move-exception;
        r1 = r12.b;	 Catch:{ IllegalStateException -> 0x0199 }
        if (r1 == 0) goto L_0x0196;
    L_0x0189:
        r1 = r12.b;	 Catch:{ IllegalStateException -> 0x019b }
        r1 = r1.isHeld();	 Catch:{ IllegalStateException -> 0x019b }
        if (r1 == 0) goto L_0x0196;
    L_0x0191:
        r1 = r12.b;	 Catch:{ IllegalStateException -> 0x019b }
        r1.release();	 Catch:{ IllegalStateException -> 0x019b }
    L_0x0196:
        throw r0;
    L_0x0197:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0163 }
    L_0x0199:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x019b }
    L_0x019b:
        r0 = move-exception;
        throw r0;
    L_0x019d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x019f }
    L_0x019f:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.tw.c(com.whatsapp.protocol.co):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(com.whatsapp.protocol.co r15) {
        /*
        r14 = this;
        r8 = com.whatsapp.DialogToastActivity.f;
        r0 = r15.Q;
        r0 = (com.whatsapp.MediaData) r0;
        r1 = com.whatsapp.App.z();
        r2 = z;
        r3 = 9;
        r2 = r2[r3];
        r3 = r15.c;
        r4 = r15.r;
        r5 = 1;
        r3 = com.whatsapp.util.ag.a(r1, r2, r3, r4, r5);
        r1 = new com.whatsapp.akr;
        r2 = r0.file;
        r4 = r0.trimFrom;
        r6 = r0.trimTo;
        r1.<init>(r2, r3, r4, r6);
        r2 = new com.whatsapp.n3;
        r2.<init>(r14, r15, r0);
        r1.a(r2);
        r0.transcoder = r1;
        r4 = 0;
        r2 = com.whatsapp.App.a5;	 Catch:{ Exception -> 0x01df }
        r2 = r2.createNewFile();	 Catch:{ Exception -> 0x01df }
        if (r2 != 0) goto L_0x0057;
    L_0x0037:
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x01df }
        r2.<init>();	 Catch:{ Exception -> 0x01df }
        r5 = z;	 Catch:{ Exception -> 0x01df }
        r6 = 14;
        r5 = r5[r6];	 Catch:{ Exception -> 0x01df }
        r2 = r2.append(r5);	 Catch:{ Exception -> 0x01df }
        r5 = com.whatsapp.App.a5;	 Catch:{ Exception -> 0x01df }
        r5 = r5.getAbsolutePath();	 Catch:{ Exception -> 0x01df }
        r2 = r2.append(r5);	 Catch:{ Exception -> 0x01df }
        r2 = r2.toString();	 Catch:{ Exception -> 0x01df }
        com.whatsapp.util.Log.w(r2);	 Catch:{ Exception -> 0x01df }
    L_0x0057:
        r2 = com.whatsapp.App.a5;	 Catch:{ Exception -> 0x01e1 }
        r2 = r2.getAbsolutePath();	 Catch:{ Exception -> 0x01e1 }
        com.whatsapp.VideoFrameConverter.setLogFilePath(r2);	 Catch:{ Exception -> 0x01e1 }
    L_0x0060:
        r2 = r14.b;	 Catch:{ Exception -> 0x01ed }
        if (r2 == 0) goto L_0x0069;
    L_0x0064:
        r2 = r14.b;	 Catch:{ Exception -> 0x01ed }
        r2.acquire();	 Catch:{ Exception -> 0x01ed }
    L_0x0069:
        r2 = r0.file;	 Catch:{ IllegalStateException -> 0x0134, cq -> 0x01ef, FileNotFoundException -> 0x023c, IOException -> 0x0283, at_ -> 0x02f3 }
        r2 = com.whatsapp.akr.d(r2);	 Catch:{ IllegalStateException -> 0x0134, cq -> 0x01ef, FileNotFoundException -> 0x023c, IOException -> 0x0283, at_ -> 0x02f3 }
        if (r2 == 0) goto L_0x00f1;
    L_0x0071:
        r6 = new com.whatsapp.util.a4;	 Catch:{ IllegalStateException -> 0x0134, cq -> 0x01ef, FileNotFoundException -> 0x023c, IOException -> 0x0283, at_ -> 0x02f3 }
        r2 = r0.file;	 Catch:{ IllegalStateException -> 0x0134, cq -> 0x01ef, FileNotFoundException -> 0x023c, IOException -> 0x0283, at_ -> 0x02f3 }
        r6.<init>(r2);	 Catch:{ IllegalStateException -> 0x0134, cq -> 0x01ef, FileNotFoundException -> 0x023c, IOException -> 0x0283, at_ -> 0x02f3 }
        r7 = r6.a();	 Catch:{ IllegalStateException -> 0x0134, cq -> 0x01ef, FileNotFoundException -> 0x023c, IOException -> 0x0283, at_ -> 0x02f3 }
        r9 = r6.d();	 Catch:{ IllegalStateException -> 0x0134, cq -> 0x01ef, FileNotFoundException -> 0x023c, IOException -> 0x0283, at_ -> 0x02f3 }
        if (r7 < r9) goto L_0x0089;
    L_0x0082:
        r5 = 640; // 0x280 float:8.97E-43 double:3.16E-321;
        r2 = r9 * r5;
        r2 = r2 / r7;
        if (r8 == 0) goto L_0x008e;
    L_0x0089:
        r2 = 640; // 0x280 float:8.97E-43 double:3.16E-321;
        r5 = r7 * r2;
        r5 = r5 / r9;
    L_0x008e:
        r10 = r0.trimFrom;	 Catch:{ Exception -> 0x022c }
        r12 = 0;
        r7 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r7 < 0) goto L_0x00cb;
    L_0x0096:
        r10 = r0.trimTo;	 Catch:{ Exception -> 0x022c }
        r12 = 0;
        r7 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r7 <= 0) goto L_0x00cb;
    L_0x009e:
        r7 = r6.b();	 Catch:{ Exception -> 0x022e }
        if (r7 != 0) goto L_0x00ba;
    L_0x00a4:
        r7 = r0.file;	 Catch:{ Exception -> 0x0230 }
        r7 = com.whatsapp.akr.a(r7);	 Catch:{ Exception -> 0x0230 }
        if (r7 == 0) goto L_0x00ba;
    L_0x00ac:
        r7 = z;	 Catch:{ Exception -> 0x0232 }
        r9 = 12;
        r7 = r7[r9];	 Catch:{ Exception -> 0x0232 }
        com.whatsapp.util.Log.i(r7);	 Catch:{ Exception -> 0x0232 }
        r1.a();	 Catch:{ Exception -> 0x0232 }
        if (r8 == 0) goto L_0x00ef;
    L_0x00ba:
        r10 = r0.trimTo;	 Catch:{ Exception -> 0x0234 }
        r12 = r0.trimFrom;	 Catch:{ Exception -> 0x0234 }
        r10 = r10 - r12;
        r7 = com.whatsapp.util.ag.a(r5, r2, r10);	 Catch:{ Exception -> 0x0234 }
        r1.a(r7);	 Catch:{ Exception -> 0x0234 }
        r1.c();	 Catch:{ Exception -> 0x0234 }
        if (r8 == 0) goto L_0x00ef;
    L_0x00cb:
        r7 = r6.b();	 Catch:{ Exception -> 0x0236 }
        if (r7 != 0) goto L_0x00e1;
    L_0x00d1:
        r7 = z;	 Catch:{ Exception -> 0x0238 }
        r9 = 15;
        r7 = r7[r9];	 Catch:{ Exception -> 0x0238 }
        com.whatsapp.util.Log.i(r7);	 Catch:{ Exception -> 0x0238 }
        r7 = r0.file;	 Catch:{ Exception -> 0x0238 }
        com.whatsapp.util.ag.a(r7, r3);	 Catch:{ Exception -> 0x0238 }
        if (r8 == 0) goto L_0x00ef;
    L_0x00e1:
        r6 = r6.c();	 Catch:{ Exception -> 0x023a }
        r2 = com.whatsapp.util.ag.a(r5, r2, r6);	 Catch:{ Exception -> 0x023a }
        r1.a(r2);	 Catch:{ Exception -> 0x023a }
        r1.c();	 Catch:{ Exception -> 0x023a }
    L_0x00ef:
        if (r8 == 0) goto L_0x02d6;
    L_0x00f1:
        r6 = r0.trimFrom;	 Catch:{ Exception -> 0x0279 }
        r10 = 0;
        r2 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1));
        if (r2 < 0) goto L_0x0106;
    L_0x00f9:
        r6 = r0.trimTo;	 Catch:{ Exception -> 0x027b }
        r10 = 0;
        r2 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1));
        if (r2 <= 0) goto L_0x0106;
    L_0x0101:
        r1.a();	 Catch:{ Exception -> 0x027d }
        if (r8 == 0) goto L_0x02d6;
    L_0x0106:
        r2 = r0.file;	 Catch:{ Exception -> 0x027f }
        r6 = r2.length();	 Catch:{ Exception -> 0x027f }
        r6 = (double) r6;	 Catch:{ Exception -> 0x027f }
        r2 = com.whatsapp.a59.e;	 Catch:{ Exception -> 0x027f }
        r10 = (long) r2;
        r12 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r10 = r10 * r12;
        r10 = (double) r10;
        r12 = 4609434218613702656; // 0x3ff8000000000000 float:0.0 double:1.5;
        r10 = r10 * r12;
        r2 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1));
        if (r2 >= 0) goto L_0x012c;
    L_0x011c:
        r2 = z;	 Catch:{ Exception -> 0x0281 }
        r5 = 13;
        r2 = r2[r5];	 Catch:{ Exception -> 0x0281 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ Exception -> 0x0281 }
        r2 = r0.file;	 Catch:{ Exception -> 0x0281 }
        com.whatsapp.util.ag.a(r2, r3);	 Catch:{ Exception -> 0x0281 }
        if (r8 == 0) goto L_0x02d6;
    L_0x012c:
        r2 = new java.lang.IllegalArgumentException;	 Catch:{ Exception -> 0x0132 }
        r2.<init>();	 Catch:{ Exception -> 0x0132 }
        throw r2;	 Catch:{ Exception -> 0x0132 }
    L_0x0132:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0134, cq -> 0x01ef, FileNotFoundException -> 0x023c, IOException -> 0x0283, at_ -> 0x02f3 }
    L_0x0134:
        r2 = move-exception;
        r5 = z;	 Catch:{ all -> 0x0332 }
        r6 = 17;
        r5 = r5[r6];	 Catch:{ all -> 0x0332 }
        com.whatsapp.util.Log.b(r5, r2);	 Catch:{ all -> 0x0332 }
        b(r2);	 Catch:{ all -> 0x0332 }
        r2 = r14.a;	 Catch:{ all -> 0x0332 }
        r5 = new com.whatsapp.jz;	 Catch:{ all -> 0x0332 }
        r5.<init>(r14);	 Catch:{ all -> 0x0332 }
        r2.post(r5);	 Catch:{ all -> 0x0332 }
        r2 = 0;
        com.whatsapp.VideoFrameConverter.setLogFilePath(r2);
        r2 = r14.b;
        if (r2 == 0) goto L_0x0160;
    L_0x0153:
        r2 = r14.b;	 Catch:{ Exception -> 0x0380 }
        r2 = r2.isHeld();	 Catch:{ Exception -> 0x0380 }
        if (r2 == 0) goto L_0x0160;
    L_0x015b:
        r2 = r14.b;	 Catch:{ Exception -> 0x0380 }
        r2.release();	 Catch:{ Exception -> 0x0380 }
    L_0x0160:
        r2 = com.whatsapp.App.a5;	 Catch:{ Exception -> 0x0382 }
        r2 = r2.exists();	 Catch:{ Exception -> 0x0382 }
        if (r2 == 0) goto L_0x016d;
    L_0x0168:
        r2 = com.whatsapp.App.a5;	 Catch:{ Exception -> 0x0382 }
        r2.delete();	 Catch:{ Exception -> 0x0382 }
    L_0x016d:
        if (r4 == 0) goto L_0x01c8;
    L_0x016f:
        r0.file = r3;	 Catch:{ Exception -> 0x0398 }
        r2 = 1;
        r0.transcoded = r2;	 Catch:{ Exception -> 0x0398 }
        r2 = r0.file;	 Catch:{ Exception -> 0x0398 }
        r2 = r2.length();	 Catch:{ Exception -> 0x0398 }
        r0.fileSize = r2;	 Catch:{ Exception -> 0x0398 }
        r2 = r0.file;	 Catch:{ Exception -> 0x0398 }
        r2 = r2.getName();	 Catch:{ Exception -> 0x0398 }
        r15.A = r2;	 Catch:{ Exception -> 0x0398 }
        r2 = r0.fileSize;	 Catch:{ Exception -> 0x0398 }
        r15.z = r2;	 Catch:{ Exception -> 0x0398 }
        r2 = r0.file;	 Catch:{ Exception -> 0x0398 }
        r2 = com.whatsapp.util.ag.c(r2);	 Catch:{ Exception -> 0x0398 }
        r15.H = r2;	 Catch:{ Exception -> 0x0398 }
        r2 = r0.trimFrom;	 Catch:{ Exception -> 0x0398 }
        r4 = 0;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 <= 0) goto L_0x01b5;
    L_0x0198:
        com.whatsapp.util.bd.b(r15);
        r2 = r0.file;
        r2 = r2.getAbsolutePath();
        r2 = com.whatsapp.util.ag.b(r2);
        if (r2 == 0) goto L_0x01ac;
    L_0x01a7:
        r15.a(r2);	 Catch:{ Exception -> 0x039a }
        if (r8 == 0) goto L_0x01b5;
    L_0x01ac:
        r2 = z;	 Catch:{ Exception -> 0x039a }
        r3 = 20;
        r2 = r2[r3];	 Catch:{ Exception -> 0x039a }
        com.whatsapp.util.Log.w(r2);	 Catch:{ Exception -> 0x039a }
    L_0x01b5:
        r2 = com.whatsapp.App.aK;	 Catch:{ Exception -> 0x039c }
        r3 = 1;
        r4 = -1;
        r2.a(r15, r3, r4);	 Catch:{ Exception -> 0x039c }
        r2 = r14.a;	 Catch:{ Exception -> 0x039c }
        r3 = new com.whatsapp.o9;	 Catch:{ Exception -> 0x039c }
        r3.<init>(r14, r15);	 Catch:{ Exception -> 0x039c }
        r2.post(r3);	 Catch:{ Exception -> 0x039c }
        if (r8 == 0) goto L_0x01de;
    L_0x01c8:
        r2 = 0;
        r0.transferring = r2;	 Catch:{ Exception -> 0x039e }
        r2 = 0;
        r15.d = r2;	 Catch:{ Exception -> 0x039e }
        r1 = r1.h();	 Catch:{ Exception -> 0x039e }
        if (r1 == 0) goto L_0x01d7;
    L_0x01d4:
        r1 = 0;
        r0.autodownloadRetryEnabled = r1;	 Catch:{ Exception -> 0x039e }
    L_0x01d7:
        r0 = com.whatsapp.App.aK;
        r1 = 1;
        r2 = -1;
        r0.a(r15, r1, r2);
    L_0x01de:
        return;
    L_0x01df:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x01e1 }
    L_0x01e1:
        r2 = move-exception;
        r5 = z;
        r6 = 11;
        r5 = r5[r6];
        com.whatsapp.util.Log.b(r5, r2);
        goto L_0x0060;
    L_0x01ed:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0134, cq -> 0x01ef, FileNotFoundException -> 0x023c, IOException -> 0x0283, at_ -> 0x02f3 }
    L_0x01ef:
        r2 = move-exception;
        r5 = z;	 Catch:{ all -> 0x0332 }
        r6 = 18;
        r5 = r5[r6];	 Catch:{ all -> 0x0332 }
        com.whatsapp.util.Log.e(r5);	 Catch:{ all -> 0x0332 }
        b(r2);	 Catch:{ all -> 0x0332 }
        r2 = r14.a;	 Catch:{ all -> 0x0332 }
        r5 = new com.whatsapp.gw;	 Catch:{ all -> 0x0332 }
        r5.<init>(r14);	 Catch:{ all -> 0x0332 }
        r2.post(r5);	 Catch:{ all -> 0x0332 }
        r2 = 0;
        com.whatsapp.VideoFrameConverter.setLogFilePath(r2);
        r2 = r14.b;
        if (r2 == 0) goto L_0x021b;
    L_0x020e:
        r2 = r14.b;	 Catch:{ Exception -> 0x0384 }
        r2 = r2.isHeld();	 Catch:{ Exception -> 0x0384 }
        if (r2 == 0) goto L_0x021b;
    L_0x0216:
        r2 = r14.b;	 Catch:{ Exception -> 0x0384 }
        r2.release();	 Catch:{ Exception -> 0x0384 }
    L_0x021b:
        r2 = com.whatsapp.App.a5;	 Catch:{ Exception -> 0x022a }
        r2 = r2.exists();	 Catch:{ Exception -> 0x022a }
        if (r2 == 0) goto L_0x016d;
    L_0x0223:
        r2 = com.whatsapp.App.a5;	 Catch:{ Exception -> 0x022a }
        r2.delete();	 Catch:{ Exception -> 0x022a }
        goto L_0x016d;
    L_0x022a:
        r0 = move-exception;
        throw r0;
    L_0x022c:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x022e }
    L_0x022e:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0230 }
    L_0x0230:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0232 }
    L_0x0232:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0234 }
    L_0x0234:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0236 }
    L_0x0236:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0238 }
    L_0x0238:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x023a }
    L_0x023a:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0134, cq -> 0x01ef, FileNotFoundException -> 0x023c, IOException -> 0x0283, at_ -> 0x02f3 }
    L_0x023c:
        r2 = move-exception;
        r5 = z;	 Catch:{ all -> 0x0332 }
        r6 = 19;
        r5 = r5[r6];	 Catch:{ all -> 0x0332 }
        com.whatsapp.util.Log.b(r5, r2);	 Catch:{ all -> 0x0332 }
        b(r2);	 Catch:{ all -> 0x0332 }
        r2 = r14.a;	 Catch:{ all -> 0x0332 }
        r5 = new com.whatsapp.aie;	 Catch:{ all -> 0x0332 }
        r5.<init>(r14);	 Catch:{ all -> 0x0332 }
        r2.post(r5);	 Catch:{ all -> 0x0332 }
        r2 = 0;
        com.whatsapp.VideoFrameConverter.setLogFilePath(r2);
        r2 = r14.b;
        if (r2 == 0) goto L_0x0268;
    L_0x025b:
        r2 = r14.b;	 Catch:{ Exception -> 0x0386 }
        r2 = r2.isHeld();	 Catch:{ Exception -> 0x0386 }
        if (r2 == 0) goto L_0x0268;
    L_0x0263:
        r2 = r14.b;	 Catch:{ Exception -> 0x0386 }
        r2.release();	 Catch:{ Exception -> 0x0386 }
    L_0x0268:
        r2 = com.whatsapp.App.a5;	 Catch:{ Exception -> 0x0277 }
        r2 = r2.exists();	 Catch:{ Exception -> 0x0277 }
        if (r2 == 0) goto L_0x016d;
    L_0x0270:
        r2 = com.whatsapp.App.a5;	 Catch:{ Exception -> 0x0277 }
        r2.delete();	 Catch:{ Exception -> 0x0277 }
        goto L_0x016d;
    L_0x0277:
        r0 = move-exception;
        throw r0;
    L_0x0279:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x027b }
    L_0x027b:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x027d }
    L_0x027d:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x027f }
    L_0x027f:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0281 }
    L_0x0281:
        r2 = move-exception;
        throw r2;	 Catch:{ Exception -> 0x0132 }
    L_0x0283:
        r2 = move-exception;
        r5 = z;	 Catch:{ Exception -> 0x0388 }
        r6 = 21;
        r5 = r5[r6];	 Catch:{ Exception -> 0x0388 }
        com.whatsapp.util.Log.b(r5, r2);	 Catch:{ Exception -> 0x0388 }
        b(r2);	 Catch:{ Exception -> 0x0388 }
        r5 = r2.getMessage();	 Catch:{ Exception -> 0x0388 }
        if (r5 == 0) goto L_0x02b0;
    L_0x0296:
        r2 = r2.getMessage();	 Catch:{ Exception -> 0x0388 }
        r5 = z;	 Catch:{ Exception -> 0x0388 }
        r6 = 8;
        r5 = r5[r6];	 Catch:{ Exception -> 0x0388 }
        r2 = r2.contains(r5);	 Catch:{ Exception -> 0x0388 }
        if (r2 == 0) goto L_0x02b0;
    L_0x02a6:
        r2 = r14.a;	 Catch:{ Exception -> 0x038a }
        r5 = new com.whatsapp.aun;	 Catch:{ Exception -> 0x038a }
        r5.<init>(r14);	 Catch:{ Exception -> 0x038a }
        r2.post(r5);	 Catch:{ Exception -> 0x038a }
    L_0x02b0:
        r2 = 0;
        com.whatsapp.VideoFrameConverter.setLogFilePath(r2);	 Catch:{ Exception -> 0x038c }
        r2 = r14.b;	 Catch:{ Exception -> 0x038c }
        if (r2 == 0) goto L_0x02c5;
    L_0x02b8:
        r2 = r14.b;	 Catch:{ Exception -> 0x038c }
        r2 = r2.isHeld();	 Catch:{ Exception -> 0x038c }
        if (r2 == 0) goto L_0x02c5;
    L_0x02c0:
        r2 = r14.b;	 Catch:{ Exception -> 0x038e }
        r2.release();	 Catch:{ Exception -> 0x038e }
    L_0x02c5:
        r2 = com.whatsapp.App.a5;	 Catch:{ Exception -> 0x02d4 }
        r2 = r2.exists();	 Catch:{ Exception -> 0x02d4 }
        if (r2 == 0) goto L_0x016d;
    L_0x02cd:
        r2 = com.whatsapp.App.a5;	 Catch:{ Exception -> 0x02d4 }
        r2.delete();	 Catch:{ Exception -> 0x02d4 }
        goto L_0x016d;
    L_0x02d4:
        r0 = move-exception;
        throw r0;
    L_0x02d6:
        r2 = r1.h();	 Catch:{ Exception -> 0x0330 }
        if (r2 != 0) goto L_0x0356;
    L_0x02dc:
        r2 = com.whatsapp.util.b.e(r3);	 Catch:{ Exception -> 0x0330 }
        if (r2 == 0) goto L_0x02e5;
    L_0x02e2:
        r4 = 1;
        if (r8 == 0) goto L_0x0356;
    L_0x02e5:
        r2 = new java.lang.IllegalStateException;	 Catch:{ Exception -> 0x02f1 }
        r5 = z;	 Catch:{ Exception -> 0x02f1 }
        r6 = 16;
        r5 = r5[r6];	 Catch:{ Exception -> 0x02f1 }
        r2.<init>(r5);	 Catch:{ Exception -> 0x02f1 }
        throw r2;	 Catch:{ Exception -> 0x02f1 }
    L_0x02f1:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0134, cq -> 0x01ef, FileNotFoundException -> 0x023c, IOException -> 0x0283, at_ -> 0x02f3 }
    L_0x02f3:
        r2 = move-exception;
        r5 = z;	 Catch:{ all -> 0x0332 }
        r6 = 10;
        r5 = r5[r6];	 Catch:{ all -> 0x0332 }
        com.whatsapp.util.Log.b(r5, r2);	 Catch:{ all -> 0x0332 }
        b(r2);	 Catch:{ all -> 0x0332 }
        r2 = r14.a;	 Catch:{ all -> 0x0332 }
        r5 = new com.whatsapp.on;	 Catch:{ all -> 0x0332 }
        r5.<init>(r14);	 Catch:{ all -> 0x0332 }
        r2.post(r5);	 Catch:{ all -> 0x0332 }
        r2 = 0;
        com.whatsapp.VideoFrameConverter.setLogFilePath(r2);
        r2 = r14.b;
        if (r2 == 0) goto L_0x031f;
    L_0x0312:
        r2 = r14.b;	 Catch:{ Exception -> 0x0390 }
        r2 = r2.isHeld();	 Catch:{ Exception -> 0x0390 }
        if (r2 == 0) goto L_0x031f;
    L_0x031a:
        r2 = r14.b;	 Catch:{ Exception -> 0x0390 }
        r2.release();	 Catch:{ Exception -> 0x0390 }
    L_0x031f:
        r2 = com.whatsapp.App.a5;	 Catch:{ Exception -> 0x032e }
        r2 = r2.exists();	 Catch:{ Exception -> 0x032e }
        if (r2 == 0) goto L_0x016d;
    L_0x0327:
        r2 = com.whatsapp.App.a5;	 Catch:{ Exception -> 0x032e }
        r2.delete();	 Catch:{ Exception -> 0x032e }
        goto L_0x016d;
    L_0x032e:
        r0 = move-exception;
        throw r0;
    L_0x0330:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0134, cq -> 0x01ef, FileNotFoundException -> 0x023c, IOException -> 0x0283, at_ -> 0x02f3 }
    L_0x0332:
        r0 = move-exception;
        r1 = 0;
        com.whatsapp.VideoFrameConverter.setLogFilePath(r1);	 Catch:{ Exception -> 0x0392 }
        r1 = r14.b;	 Catch:{ Exception -> 0x0392 }
        if (r1 == 0) goto L_0x0348;
    L_0x033b:
        r1 = r14.b;	 Catch:{ Exception -> 0x0394 }
        r1 = r1.isHeld();	 Catch:{ Exception -> 0x0394 }
        if (r1 == 0) goto L_0x0348;
    L_0x0343:
        r1 = r14.b;	 Catch:{ Exception -> 0x0394 }
        r1.release();	 Catch:{ Exception -> 0x0394 }
    L_0x0348:
        r1 = com.whatsapp.App.a5;	 Catch:{ Exception -> 0x0396 }
        r1 = r1.exists();	 Catch:{ Exception -> 0x0396 }
        if (r1 == 0) goto L_0x0355;
    L_0x0350:
        r1 = com.whatsapp.App.a5;	 Catch:{ Exception -> 0x0396 }
        r1.delete();	 Catch:{ Exception -> 0x0396 }
    L_0x0355:
        throw r0;
    L_0x0356:
        r2 = 0;
        com.whatsapp.VideoFrameConverter.setLogFilePath(r2);	 Catch:{ Exception -> 0x037c }
        r2 = r14.b;	 Catch:{ Exception -> 0x037c }
        if (r2 == 0) goto L_0x036b;
    L_0x035e:
        r2 = r14.b;	 Catch:{ Exception -> 0x037c }
        r2 = r2.isHeld();	 Catch:{ Exception -> 0x037c }
        if (r2 == 0) goto L_0x036b;
    L_0x0366:
        r2 = r14.b;	 Catch:{ Exception -> 0x037e }
        r2.release();	 Catch:{ Exception -> 0x037e }
    L_0x036b:
        r2 = com.whatsapp.App.a5;	 Catch:{ Exception -> 0x037a }
        r2 = r2.exists();	 Catch:{ Exception -> 0x037a }
        if (r2 == 0) goto L_0x016d;
    L_0x0373:
        r2 = com.whatsapp.App.a5;	 Catch:{ Exception -> 0x037a }
        r2.delete();	 Catch:{ Exception -> 0x037a }
        goto L_0x016d;
    L_0x037a:
        r0 = move-exception;
        throw r0;
    L_0x037c:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x037e }
    L_0x037e:
        r0 = move-exception;
        throw r0;
    L_0x0380:
        r0 = move-exception;
        throw r0;
    L_0x0382:
        r0 = move-exception;
        throw r0;
    L_0x0384:
        r0 = move-exception;
        throw r0;
    L_0x0386:
        r0 = move-exception;
        throw r0;
    L_0x0388:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x038a }
    L_0x038a:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0332 }
    L_0x038c:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x038e }
    L_0x038e:
        r0 = move-exception;
        throw r0;
    L_0x0390:
        r0 = move-exception;
        throw r0;
    L_0x0392:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0394 }
    L_0x0394:
        r0 = move-exception;
        throw r0;
    L_0x0396:
        r0 = move-exception;
        throw r0;
    L_0x0398:
        r0 = move-exception;
        throw r0;
    L_0x039a:
        r0 = move-exception;
        throw r0;
    L_0x039c:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x039e }
    L_0x039e:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.tw.b(com.whatsapp.protocol.co):void");
    }

    static ArrayList a(tw twVar) {
        return twVar.d;
    }

    static Handler b(tw twVar) {
        return twVar.a;
    }
}
