package com.whatsapp;

import android.annotation.TargetApi;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

@TargetApi(16)
class o8 extends oh {
    private static final int[] d;
    private static final String[] z;
    private Exception e;
    private CountDownLatch f;
    private int g;
    private Thread h;
    private boolean i;

    static void a(o8 o8Var) {
        o8Var.a();
    }

    public o8(String str) {
        boolean z = true;
        boolean z2 = oh.b;
        this.g = 1;
        this.c = new File(str + z[17]);
        this.a = 32000;
        if (WAAppCompatActivity.c != 0) {
            if (z2) {
                z = false;
            }
            oh.b = z;
        }
    }

    public void e() {
        try {
            this.i = false;
            if (this.h != null) {
                try {
                    this.h.join();
                    this.h = null;
                } catch (Throwable e) {
                    Log.b(z[2], e);
                }
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public void a(int i) {
        this.g = i;
    }

    public void c() {
        try {
            if (this.h != null) {
                throw new IllegalStateException();
            }
            this.i = true;
            this.h = new Thread(new ax8(this));
            this.f = new CountDownLatch(1);
            this.h.start();
            try {
                this.f.await();
                if (this.e != null) {
                    throw new RuntimeException(z[0], this.e);
                }
            } catch (Throwable e) {
                Log.b(z[1], e);
            }
        } catch (InterruptedException e2) {
            throw e2;
        }
    }

    static {
        String[] strArr = new String[18];
        String str = "\u001d\u000b&a\u000eN\r\"p\u0015\u001c\u001b.}\u001dN\u0019&z\u0016\u000b\u001b";
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
                        i4 = 110;
                        break;
                    case at.g /*1*/:
                        i4 = 127;
                        break;
                    case at.i /*2*/:
                        i4 = 71;
                        break;
                    case at.o /*3*/:
                        i4 = 19;
                        break;
                    default:
                        i4 = 122;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "\u0018\u0010.p\u001f\u001c\u001a$|\b\n\u001a5r\u000f\n\u0016(a\u001f\r\u00105w";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "\r\u0017&}\u0014\u000b\u0013jp\u0015\u001b\u00113";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    strArr2 = strArr3;
                    str = "\u000f\n#z\u0015A\u00127'\u001bC\u0013&g\u0017";
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "\u0018\u0010.p\u001f\u001c\u001a$|\b\n\u001a5r\u000f\n\u0016(a\u001f\r\u00105wUN\u001a)p\u0015\n\u001a53\u0015\u001b\u000b7f\u000eN\u001d2u\u001c\u000b\r43\u0012\u000f\t\"3\u0019\u0006\u001e)t\u001f\nQ";
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "\u0018\u0010.p\u001f\u001c\u001a$|\b\n\u001a5r\u000f\n\u0016(a\u001f\r\u00105wUN";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "\u001d\u001e*c\u0016\u000bR5r\u000e\u000b";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "\u0003\u0016*v";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "\u000f\u001e$>\n\u001c\u0010!z\u0016\u000b";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "\f\u00163a\u001b\u001a\u001a";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "\u0018\u0010.p\u001f\u001c\u001a$|\b\n\u001a5r\u000f\n\u0016(a\u001f\r\u00105wUN";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    str = "\u0018\u0010.p\u001f\u001c\u001a$|\b\n\u001a5r\u000f\n\u0016(a\u001f\r\u00105wUN";
                    i = 11;
                    i2 = 12;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    strArr2 = strArr3;
                    str = "\u0003\u001e?>\u0013\u0000\u000f2gW\u001d\u0016=v";
                    i = 12;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "\u000f\n#z\u0015A\u00127'\u001bC\u0013&g\u0017";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "\u0018\u0010.p\u001f\u001c\u001a$|\b\n\u001a5r\u000f\n\u0016(a\u001f\r\u00105wUN";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "\u0018\u0010.p\u001f\u001c\u001a$|\b\n\u001a5r\u000f\n\u0016(a\u001f\r\u00105wUN\u001a)p\u0015\n\u001a53\u0015\u001b\u000b7f\u000eN\u0019(a\u0017\u000f\u000bg{\u001b\u001d_${\u001b\u0000\u0018\"wZ\u001a\u0010g";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "@\u001e&p";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    d = new int[]{96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\u0018\u0010.p\u001f\u001c\u001a$|\b\n\u001a5r\u000f\n\u0016(a\u001f\r\u00105w";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public void b() {
    }

    private static int b(int i) {
        boolean z = oh.b;
        int i2 = 0;
        while (i2 < d.length) {
            try {
                if (i != d[i2]) {
                    i2++;
                    if (z) {
                        break;
                    }
                }
                return i2;
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        return 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
        r22 = this;
        r16 = com.whatsapp.oh.b;
        r2 = 22050; // 0x5622 float:3.0899E-41 double:1.0894E-319;
        r3 = 16;
        r4 = 2;
        r2 = android.media.AudioRecord.getMinBufferSize(r2, r3, r4);
        r7 = 1;
    L_0x000c:
        if (r7 >= r2) goto L_0x0012;
    L_0x000e:
        r7 = r7 * 2;
        if (r16 == 0) goto L_0x000c;
    L_0x0012:
        r2 = z;
        r3 = 14;
        r2 = r2[r3];
        r8 = android.media.MediaCodec.createEncoderByType(r2);
        r2 = new android.media.MediaFormat;
        r2.<init>();
        r3 = z;
        r4 = 8;
        r3 = r3[r4];
        r4 = z;
        r5 = 4;
        r4 = r4[r5];
        r2.setString(r3, r4);
        r3 = z;
        r4 = 3;
        r3 = r3[r4];
        r4 = 1;
        r2.setInteger(r3, r4);
        r3 = z;
        r4 = 7;
        r3 = r3[r4];
        r4 = 22050; // 0x5622 float:3.0899E-41 double:1.0894E-319;
        r2.setInteger(r3, r4);
        r3 = z;
        r4 = 10;
        r3 = r3[r4];
        r4 = 32000; // 0x7d00 float:4.4842E-41 double:1.581E-319;
        r2.setInteger(r3, r4);
        r3 = z;
        r4 = 9;
        r3 = r3[r4];
        r4 = 2;
        r2.setInteger(r3, r4);
        r3 = z;
        r4 = 13;
        r3 = r3[r4];
        r2.setInteger(r3, r7);
        r3 = 0;
        r4 = 0;
        r5 = 1;
        r8.configure(r2, r3, r4, r5);	 Catch:{ IllegalStateException -> 0x01cc }
        r8.start();
        r17 = r8.getInputBuffers();
        r9 = r8.getOutputBuffers();
        r18 = new android.media.MediaCodec$BufferInfo;
        r18.<init>();
        r2 = 7;
        r0 = new byte[r2];
        r19 = r0;
        r2 = 0;
        r3 = -1;
        r19[r2] = r3;
        r2 = 1;
        r3 = -15;
        r19[r2] = r3;
        r2 = 22050; // 0x5622 float:3.0899E-41 double:1.0894E-319;
        r2 = b(r2);
        r2 = (byte) r2;
        r3 = 2;
        r4 = 64;
        r4 = (byte) r4;
        r19[r3] = r4;
        r3 = 2;
        r4 = r19[r3];
        r2 = r2 << 2;
        r2 = r2 | r4;
        r2 = (byte) r2;
        r19[r3] = r2;
        r2 = 2;
        r3 = r19[r2];
        r3 = r3 | 0;
        r3 = (byte) r3;
        r19[r2] = r3;
        r2 = 3;
        r3 = 0;
        r19[r2] = r3;
        r2 = 4;
        r3 = 0;
        r19[r2] = r3;
        r2 = 5;
        r3 = 0;
        r19[r2] = r3;
        r2 = 6;
        r3 = -4;
        r19[r2] = r3;
        r0 = new byte[r7];
        r20 = r0;
        r2 = new android.media.AudioRecord;
        r0 = r22;
        r3 = r0.g;
        r4 = 22050; // 0x5622 float:3.0899E-41 double:1.0894E-319;
        r5 = 16;
        r6 = 2;
        r2.<init>(r3, r4, r5, r6, r7);
        r2.startRecording();	 Catch:{ IllegalStateException -> 0x01df }
        r0 = r22;
        r3 = r0.f;
        r3.countDown();
        r6 = 0;
        r4 = 0;
        r5 = new java.io.FileOutputStream;	 Catch:{ all -> 0x024d }
        r3 = r22.a();	 Catch:{ all -> 0x024d }
        r5.<init>(r3);	 Catch:{ all -> 0x024d }
        r4 = r5.getChannel();	 Catch:{ all -> 0x01fb }
        r6 = r9;
    L_0x00de:
        r0 = r22;
        r3 = r0.i;	 Catch:{ all -> 0x01fb }
        if (r3 != 0) goto L_0x01f5;
    L_0x00e4:
        r3 = 1;
        r15 = r3;
    L_0x00e6:
        r3 = 0;
        r0 = r20;
        r11 = r2.read(r0, r3, r7);	 Catch:{ all -> 0x01fb }
        r12 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r9 = r8.dequeueInputBuffer(r12);	 Catch:{ all -> 0x01fb }
        if (r9 < 0) goto L_0x0109;
    L_0x00f6:
        r3 = r17[r9];	 Catch:{ all -> 0x01fb }
        r3.clear();	 Catch:{ IllegalStateException -> 0x01f9 }
        r0 = r20;
        r3.put(r0);	 Catch:{ IllegalStateException -> 0x01f9 }
        r10 = 0;
        r12 = 0;
        if (r15 == 0) goto L_0x0213;
    L_0x0105:
        r14 = 4;
    L_0x0106:
        r8.queueInputBuffer(r9, r10, r11, r12, r14);	 Catch:{ all -> 0x01fb }
    L_0x0109:
        r10 = 0;
        r0 = r18;
        r3 = r8.dequeueOutputBuffer(r0, r10);	 Catch:{ all -> 0x01fb }
        r21 = r3;
        r3 = r6;
        r6 = r21;
    L_0x0116:
        r9 = -1;
        if (r6 == r9) goto L_0x01af;
    L_0x0119:
        if (r6 < 0) goto L_0x0173;
    L_0x011b:
        r9 = r3[r6];	 Catch:{ all -> 0x01fb }
        r0 = r18;
        r10 = r0.offset;	 Catch:{ all -> 0x01fb }
        r9.position(r10);	 Catch:{ all -> 0x01fb }
        r0 = r18;
        r10 = r0.offset;	 Catch:{ all -> 0x01fb }
        r0 = r18;
        r11 = r0.size;	 Catch:{ all -> 0x01fb }
        r10 = r10 + r11;
        r9.limit(r10);	 Catch:{ all -> 0x01fb }
        r0 = r18;
        r10 = r0.flags;	 Catch:{ all -> 0x01fb }
        r10 = r10 & 2;
        r11 = 2;
        if (r10 == r11) goto L_0x016a;
    L_0x0139:
        r0 = r18;
        r10 = r0.size;	 Catch:{ all -> 0x01fb }
        r0 = r18;
        r11 = r0.offset;	 Catch:{ all -> 0x01fb }
        r10 = r10 - r11;
        r10 = r10 + 7;
        r11 = r10 & 7;
        r12 = r10 >> 3;
        r12 = r12 & 255;
        r10 = r10 >> 11;
        r10 = r10 & 3;
        r13 = 3;
        r10 = r10 | 64;
        r10 = (byte) r10;	 Catch:{ all -> 0x01fb }
        r19[r13] = r10;	 Catch:{ all -> 0x01fb }
        r10 = 4;
        r12 = (byte) r12;	 Catch:{ all -> 0x01fb }
        r19[r10] = r12;	 Catch:{ all -> 0x01fb }
        r10 = 5;
        r11 = r11 << 5;
        r11 = r11 | 31;
        r11 = (byte) r11;	 Catch:{ all -> 0x01fb }
        r19[r10] = r11;	 Catch:{ all -> 0x01fb }
        r10 = java.nio.ByteBuffer.wrap(r19);	 Catch:{ all -> 0x01fb }
        r4.write(r10);	 Catch:{ all -> 0x01fb }
        r4.write(r9);	 Catch:{ all -> 0x01fb }
    L_0x016a:
        r9.clear();	 Catch:{ IllegalStateException -> 0x0216 }
        r9 = 0;
        r8.releaseOutputBuffer(r6, r9);	 Catch:{ IllegalStateException -> 0x0216 }
        if (r16 == 0) goto L_0x01a5;
    L_0x0173:
        r9 = -3;
        if (r6 != r9) goto L_0x0184;
    L_0x0176:
        r3 = r8.getOutputBuffers();	 Catch:{ all -> 0x01fb }
        r9 = z;	 Catch:{ IllegalStateException -> 0x0218 }
        r10 = 5;
        r9 = r9[r10];	 Catch:{ IllegalStateException -> 0x0218 }
        com.whatsapp.util.Log.i(r9);	 Catch:{ IllegalStateException -> 0x0218 }
        if (r16 == 0) goto L_0x01a5;
    L_0x0184:
        r9 = -2;
        if (r6 != r9) goto L_0x01a5;
    L_0x0187:
        r6 = r8.getOutputFormat();	 Catch:{ all -> 0x01fb }
        r9 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01fb }
        r9.<init>();	 Catch:{ all -> 0x01fb }
        r10 = z;	 Catch:{ all -> 0x01fb }
        r11 = 16;
        r10 = r10[r11];	 Catch:{ all -> 0x01fb }
        r9 = r9.append(r10);	 Catch:{ all -> 0x01fb }
        r6 = r9.append(r6);	 Catch:{ all -> 0x01fb }
        r6 = r6.toString();	 Catch:{ all -> 0x01fb }
        com.whatsapp.util.Log.i(r6);	 Catch:{ all -> 0x01fb }
    L_0x01a5:
        r10 = 0;
        r0 = r18;
        r6 = r8.dequeueOutputBuffer(r0, r10);	 Catch:{ all -> 0x01fb }
        if (r16 == 0) goto L_0x0116;
    L_0x01af:
        if (r15 == 0) goto L_0x01b3;
    L_0x01b1:
        if (r16 == 0) goto L_0x01b5;
    L_0x01b3:
        if (r16 == 0) goto L_0x0250;
    L_0x01b5:
        r8.stop();	 Catch:{ IllegalStateException -> 0x021a }
        r8.release();	 Catch:{ IllegalStateException -> 0x021a }
        if (r5 == 0) goto L_0x01c0;
    L_0x01bd:
        r4.close();	 Catch:{ IOException -> 0x021c }
    L_0x01c0:
        if (r5 == 0) goto L_0x01c5;
    L_0x01c2:
        r5.close();	 Catch:{ IOException -> 0x0229, IllegalStateException -> 0x0227 }
    L_0x01c5:
        r2.stop();
        r2.release();
        return;
    L_0x01cc:
        r2 = move-exception;
        com.whatsapp.util.Log.a(r2);
        r0 = r22;
        r0.e = r2;
        r8.release();
        r0 = r22;
        r3 = r0.f;
        r3.countDown();
        throw r2;
    L_0x01df:
        r2 = move-exception;
        com.whatsapp.util.Log.a(r2);
        r0 = r22;
        r0.e = r2;
        r8.stop();
        r8.release();
        r0 = r22;
        r3 = r0.f;
        r3.countDown();
        throw r2;
    L_0x01f5:
        r3 = 0;
        r15 = r3;
        goto L_0x00e6;
    L_0x01f9:
        r3 = move-exception;
        throw r3;	 Catch:{ all -> 0x01fb }
    L_0x01fb:
        r3 = move-exception;
    L_0x01fc:
        r8.stop();	 Catch:{ IllegalStateException -> 0x0234 }
        r8.release();	 Catch:{ IllegalStateException -> 0x0234 }
        if (r5 == 0) goto L_0x0207;
    L_0x0204:
        r4.close();	 Catch:{ IOException -> 0x0236 }
    L_0x0207:
        if (r5 == 0) goto L_0x020c;
    L_0x0209:
        r5.close();	 Catch:{ IOException -> 0x0242, IllegalStateException -> 0x0240 }
    L_0x020c:
        r2.stop();
        r2.release();
        throw r3;
    L_0x0213:
        r14 = 0;
        goto L_0x0106;
    L_0x0216:
        r3 = move-exception;
        throw r3;	 Catch:{ all -> 0x01fb }
    L_0x0218:
        r3 = move-exception;
        throw r3;	 Catch:{ all -> 0x01fb }
    L_0x021a:
        r2 = move-exception;
        throw r2;
    L_0x021c:
        r3 = move-exception;
        r4 = z;
        r6 = 12;
        r4 = r4[r6];
        com.whatsapp.util.Log.b(r4, r3);
        goto L_0x01c0;
    L_0x0227:
        r2 = move-exception;
        throw r2;
    L_0x0229:
        r3 = move-exception;
        r4 = z;
        r5 = 11;
        r4 = r4[r5];
        com.whatsapp.util.Log.b(r4, r3);
        goto L_0x01c5;
    L_0x0234:
        r2 = move-exception;
        throw r2;
    L_0x0236:
        r4 = move-exception;
        r6 = z;
        r7 = 6;
        r6 = r6[r7];
        com.whatsapp.util.Log.b(r6, r4);
        goto L_0x0207;
    L_0x0240:
        r2 = move-exception;
        throw r2;
    L_0x0242:
        r4 = move-exception;
        r5 = z;
        r6 = 15;
        r5 = r5[r6];
        com.whatsapp.util.Log.b(r5, r4);
        goto L_0x020c;
    L_0x024d:
        r3 = move-exception;
        r5 = r6;
        goto L_0x01fc;
    L_0x0250:
        r6 = r3;
        goto L_0x00de;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.o8.a():void");
    }

    public void d() {
    }

    static boolean a(o8 o8Var, boolean z) {
        o8Var.i = z;
        return z;
    }
}
