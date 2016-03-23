package com.whatsapp;

import android.annotation.TargetApi;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import java.io.File;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

@TargetApi(16)
public class mn implements aiv {
    private static final int[] a;
    private static final String[] z;
    private final int b;
    private final long c;
    private final File d;
    private boolean e;
    private x5 f;
    private final long g;
    private final File h;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d() {
        /*
        r35 = this;
        r18 = com.whatsapp.DialogToastActivity.f;
        r2 = z;
        r3 = 22;
        r2 = r2[r3];
        r19 = com.whatsapp.tp.b(r2);
        r19.e();
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 36;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r35;
        r3 = r0.b;
        r2 = r2.append(r3);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r20 = new android.media.MediaExtractor;
        r20.<init>();
        r0 = r35;
        r2 = r0.h;
        r2 = r2.getAbsolutePath();
        r0 = r20;
        r0.setDataSource(r2);
        r4 = r20.getTrackCount();
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r5 = 11;
        r3 = r3[r5];
        r2 = r2.append(r3);
        r2 = r2.append(r4);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r3 = -1;
        r2 = 0;
    L_0x005f:
        if (r2 >= r4) goto L_0x0659;
    L_0x0061:
        r0 = r20;
        r5 = r0.getTrackFormat(r2);
        r6 = z;
        r7 = 37;
        r6 = r6[r7];
        r6 = r5.getString(r6);
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r8 = z;
        r9 = 34;
        r8 = r8[r9];
        r7 = r7.append(r8);
        r7 = r7.append(r2);
        r8 = z;
        r9 = 20;
        r8 = r8[r9];
        r7 = r7.append(r8);
        r7 = r7.append(r6);
        r8 = z;
        r9 = 42;
        r8 = r8[r9];
        r7 = r7.append(r8);
        r5 = r7.append(r5);
        r5 = r5.toString();
        com.whatsapp.util.Log.i(r5);
        r5 = z;
        r7 = 46;
        r5 = r5[r7];
        r5 = r6.startsWith(r5);
        if (r5 == 0) goto L_0x00b6;
    L_0x00b3:
        if (r18 == 0) goto L_0x0656;
    L_0x00b5:
        r3 = r2;
    L_0x00b6:
        r2 = r2 + 1;
        if (r18 == 0) goto L_0x005f;
    L_0x00ba:
        r7 = r3;
    L_0x00bb:
        if (r7 >= 0) goto L_0x00cc;
    L_0x00bd:
        r2 = z;	 Catch:{ IOException -> 0x00ca }
        r3 = 18;
        r2 = r2[r3];	 Catch:{ IOException -> 0x00ca }
        com.whatsapp.util.Log.w(r2);	 Catch:{ IOException -> 0x00ca }
        r20.release();	 Catch:{ IOException -> 0x00ca }
    L_0x00c9:
        return;
    L_0x00ca:
        r2 = move-exception;
        throw r2;
    L_0x00cc:
        r21 = new java.io.FileOutputStream;
        r0 = r35;
        r2 = r0.d;
        r0 = r21;
        r0.<init>(r2);
        r22 = r21.getChannel();
        r8 = android.media.MediaCodecList.getCodecCount();
        r4 = 0;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r5 = 24;
        r3 = r3[r5];
        r2 = r2.append(r3);
        r2 = r2.append(r8);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r2 = 0;
        r5 = r2;
    L_0x00fc:
        if (r5 >= r8) goto L_0x064f;
    L_0x00fe:
        if (r4 != 0) goto L_0x064f;
    L_0x0100:
        r6 = android.media.MediaCodecList.getCodecInfoAt(r5);
        r2 = r6.isEncoder();	 Catch:{ IOException -> 0x014e }
        if (r2 != 0) goto L_0x010c;
    L_0x010a:
        if (r18 == 0) goto L_0x064c;
    L_0x010c:
        r9 = r6.getSupportedTypes();
        r3 = 0;
        r2 = 0;
    L_0x0112:
        r10 = r9.length;
        if (r2 >= r10) goto L_0x012a;
    L_0x0115:
        if (r3 != 0) goto L_0x012a;
    L_0x0117:
        r10 = r9[r2];	 Catch:{ IOException -> 0x0150 }
        r11 = z;	 Catch:{ IOException -> 0x0150 }
        r12 = 31;
        r11 = r11[r12];	 Catch:{ IOException -> 0x0150 }
        r10 = r10.equals(r11);	 Catch:{ IOException -> 0x0150 }
        if (r10 == 0) goto L_0x0126;
    L_0x0125:
        r3 = 1;
    L_0x0126:
        r2 = r2 + 1;
        if (r18 == 0) goto L_0x0112;
    L_0x012a:
        if (r3 == 0) goto L_0x064c;
    L_0x012c:
        r2 = r6;
    L_0x012d:
        r3 = r5 + 1;
        if (r18 == 0) goto L_0x0652;
    L_0x0131:
        r3 = r2;
    L_0x0132:
        if (r3 != 0) goto L_0x0152;
    L_0x0134:
        r2 = z;	 Catch:{ IOException -> 0x014c }
        r3 = 23;
        r2 = r2[r3];	 Catch:{ IOException -> 0x014c }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IOException -> 0x014c }
        r20.release();	 Catch:{ IOException -> 0x014c }
        r2 = new java.io.FileNotFoundException;	 Catch:{ IOException -> 0x014c }
        r3 = z;	 Catch:{ IOException -> 0x014c }
        r4 = 30;
        r3 = r3[r4];	 Catch:{ IOException -> 0x014c }
        r2.<init>(r3);	 Catch:{ IOException -> 0x014c }
        throw r2;	 Catch:{ IOException -> 0x014c }
    L_0x014c:
        r2 = move-exception;
        throw r2;
    L_0x014e:
        r2 = move-exception;
        throw r2;
    L_0x0150:
        r2 = move-exception;
        throw r2;
    L_0x0152:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r4 = z;
        r5 = 43;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r4 = r3.getName();
        r2 = r2.append(r4);
        r4 = z;
        r5 = 47;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r4 = z;
        r5 = 19;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r0 = r20;
        r4 = r0.getTrackFormat(r7);
        r2 = z;
        r5 = 10;
        r2 = r2[r5];
        r5 = r4.getString(r2);
        r0 = r20;
        r0.selectTrack(r7);
        r2 = z;
        r6 = 41;
        r2 = r2[r6];
        r16 = r4.getLong(r2);
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r6 = z;
        r7 = 40;
        r6 = r6[r7];
        r2 = r2.append(r6);
        r6 = r4.toString();
        r2 = r2.append(r6);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r2 = android.media.MediaCodec.createDecoderByType(r5);
        if (r2 != 0) goto L_0x0203;
    L_0x01c7:
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0201 }
        r2.<init>();	 Catch:{ IOException -> 0x0201 }
        r3 = z;	 Catch:{ IOException -> 0x0201 }
        r4 = 32;
        r3 = r3[r4];	 Catch:{ IOException -> 0x0201 }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x0201 }
        r2 = r2.append(r5);	 Catch:{ IOException -> 0x0201 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x0201 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IOException -> 0x0201 }
        r20.release();	 Catch:{ IOException -> 0x0201 }
        r2 = new java.io.FileNotFoundException;	 Catch:{ IOException -> 0x0201 }
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0201 }
        r3.<init>();	 Catch:{ IOException -> 0x0201 }
        r4 = z;	 Catch:{ IOException -> 0x0201 }
        r6 = 25;
        r4 = r4[r6];	 Catch:{ IOException -> 0x0201 }
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x0201 }
        r3 = r3.append(r5);	 Catch:{ IOException -> 0x0201 }
        r3 = r3.toString();	 Catch:{ IOException -> 0x0201 }
        r2.<init>(r3);	 Catch:{ IOException -> 0x0201 }
        throw r2;	 Catch:{ IOException -> 0x0201 }
    L_0x0201:
        r2 = move-exception;
        throw r2;
    L_0x0203:
        r5 = z;
        r6 = 33;
        r5 = r5[r6];
        r5 = r4.getInteger(r5);
        r6 = z;
        r7 = 51;
        r6 = r6[r7];
        r6 = r4.getInteger(r6);
        r3 = r3.getName();
        r23 = android.media.MediaCodec.createByCodecName(r3);
        r3 = z;
        r7 = 48;
        r3 = r3[r7];
        r3 = android.media.MediaFormat.createAudioFormat(r3, r5, r6);
        r7 = z;
        r8 = 26;
        r7 = r7[r8];
        r0 = r35;
        r8 = r0.b;
        r3.setInteger(r7, r8);
        r7 = z;
        r8 = 50;
        r7 = r7[r8];
        r3.setInteger(r7, r5);
        r7 = z;
        r8 = 15;
        r7 = r7[r8];
        r3.setInteger(r7, r6);
        r7 = z;
        r8 = 12;
        r7 = r7[r8];
        r8 = 2;
        r3.setInteger(r7, r8);
        r7 = z;
        r8 = 27;
        r7 = r7[r8];
        r8 = 64000; // 0xfa00 float:8.9683E-41 double:3.162E-319;
        r3.setInteger(r7, r8);
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r8 = z;
        r9 = 28;
        r8 = r8[r9];
        r7 = r7.append(r8);
        r7 = r7.append(r3);
        r7 = r7.toString();
        com.whatsapp.util.Log.i(r7);
        r7 = 0;
        r8 = 0;
        r9 = 1;
        r0 = r23;
        r0.configure(r3, r7, r8, r9);
        r23.start();
        r24 = r23.getInputBuffers();
        r13 = r23.getOutputBuffers();
        r3 = 0;
        r7 = 0;
        r8 = 0;
        r2.configure(r4, r3, r7, r8);
        r2.start();
        r25 = r2.getInputBuffers();
        r15 = r2.getOutputBuffers();
        r26 = new android.media.MediaCodec$BufferInfo;
        r26.<init>();
        r27 = new android.media.MediaCodec$BufferInfo;
        r27.<init>();
        r12 = 0;
        r0 = r35;
        r8 = r0.c;	 Catch:{ IOException -> 0x05d8 }
        r10 = 0;
        r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r3 <= 0) goto L_0x02f1;
    L_0x02b1:
        r0 = r35;
        r8 = r0.c;	 Catch:{ IOException -> 0x05d8 }
        r10 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r8 = r8 * r10;
        r3 = 0;
        r0 = r20;
        r0.seekTo(r8, r3);	 Catch:{ IOException -> 0x05d8 }
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x05d8 }
        r3.<init>();	 Catch:{ IOException -> 0x05d8 }
        r4 = z;	 Catch:{ IOException -> 0x05d8 }
        r7 = 49;
        r4 = r4[r7];	 Catch:{ IOException -> 0x05d8 }
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x05d8 }
        r0 = r35;
        r8 = r0.c;	 Catch:{ IOException -> 0x05d8 }
        r10 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r8 = r8 * r10;
        r3 = r3.append(r8);	 Catch:{ IOException -> 0x05d8 }
        r4 = z;	 Catch:{ IOException -> 0x05d8 }
        r7 = 29;
        r4 = r4[r7];	 Catch:{ IOException -> 0x05d8 }
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x05d8 }
        r8 = r20.getSampleTime();	 Catch:{ IOException -> 0x05d8 }
        r3 = r3.append(r8);	 Catch:{ IOException -> 0x05d8 }
        r3 = r3.toString();	 Catch:{ IOException -> 0x05d8 }
        com.whatsapp.util.Log.i(r3);	 Catch:{ IOException -> 0x05d8 }
    L_0x02f1:
        r3 = 7;
        r0 = new byte[r3];
        r28 = r0;
        r3 = 0;
        r4 = -1;
        r28[r3] = r4;
        r3 = 1;
        r4 = -15;
        r28[r3] = r4;
        r3 = a(r5);
        r3 = (byte) r3;
        r0 = (byte) r6;
        r29 = r0;
        r4 = 2;
        r5 = 64;
        r28[r4] = r5;
        r4 = 2;
        r5 = r28[r4];
        r3 = r3 << 2;
        r3 = r3 | r5;
        r3 = (byte) r3;
        r28[r4] = r3;
        r3 = 2;
        r4 = r28[r3];
        r5 = r29 >> 2;
        r4 = r4 | r5;
        r4 = (byte) r4;
        r28[r3] = r4;
        r3 = 3;
        r4 = 0;
        r28[r3] = r4;
        r3 = 4;
        r4 = 0;
        r28[r3] = r4;
        r3 = 5;
        r4 = 0;
        r28[r3] = r4;
        r3 = 6;
        r4 = -4;
        r28[r3] = r4;
        r11 = 0;
        r14 = 0;
        r4 = 0;
    L_0x0331:
        if (r4 != 0) goto L_0x0649;
    L_0x0333:
        r0 = r35;
        r3 = r0.e;	 Catch:{ all -> 0x05dc }
        if (r3 != 0) goto L_0x0649;
    L_0x0339:
        r6 = 0;
        r3 = r2.dequeueInputBuffer(r6);	 Catch:{ all -> 0x05dc }
        if (r3 < 0) goto L_0x0646;
    L_0x0341:
        r5 = r25[r3];	 Catch:{ all -> 0x05dc }
        r6 = 0;
        r0 = r20;
        r10 = r0.readSampleData(r5, r6);	 Catch:{ all -> 0x05dc }
        if (r10 >= 0) goto L_0x0360;
    L_0x034c:
        r4 = z;	 Catch:{ all -> 0x05dc }
        r5 = 16;
        r4 = r4[r5];	 Catch:{ all -> 0x05dc }
        com.whatsapp.util.Log.i(r4);	 Catch:{ all -> 0x05dc }
        r4 = 0;
        r5 = 0;
        r6 = 0;
        r8 = 4;
        r2.queueInputBuffer(r3, r4, r5, r6, r8);	 Catch:{ all -> 0x05dc }
        r4 = 1;
        if (r18 == 0) goto L_0x0646;
    L_0x0360:
        r9 = r4;
        r4 = 0;
        r6 = r20.getSampleTime();	 Catch:{ IOException -> 0x05da }
        r8 = 0;
        r5 = r10;
        r2.queueInputBuffer(r3, r4, r5, r6, r8);	 Catch:{ IOException -> 0x05da }
        r20.advance();	 Catch:{ IOException -> 0x05da }
        r3 = r9;
    L_0x036f:
        r4 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r0 = r26;
        r30 = r2.dequeueOutputBuffer(r0, r4);	 Catch:{ all -> 0x05dc }
        if (r30 < 0) goto L_0x0641;
    L_0x037a:
        r0 = r26;
        r4 = r0.presentationTimeUs;	 Catch:{ IOException -> 0x05ed }
        r0 = r35;
        r6 = r0.c;	 Catch:{ IOException -> 0x05ed }
        r8 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r6 = r6 * r8;
        r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r4 < 0) goto L_0x063c;
    L_0x0389:
        r4 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r0 = r23;
        r5 = r0.dequeueInputBuffer(r4);	 Catch:{ all -> 0x05dc }
        if (r5 < 0) goto L_0x0639;
    L_0x0394:
        r4 = r24[r5];	 Catch:{ all -> 0x05dc }
        r31 = r15[r30];	 Catch:{ all -> 0x05dc }
        r0 = r26;
        r6 = r0.offset;	 Catch:{ IOException -> 0x05ef }
        r0 = r31;
        r0.position(r6);	 Catch:{ IOException -> 0x05ef }
        r0 = r26;
        r6 = r0.offset;	 Catch:{ IOException -> 0x05ef }
        r0 = r26;
        r7 = r0.size;	 Catch:{ IOException -> 0x05ef }
        r6 = r6 + r7;
        r0 = r31;
        r0.limit(r6);	 Catch:{ IOException -> 0x05ef }
        r4.clear();	 Catch:{ IOException -> 0x05ef }
        r0 = r31;
        r4.put(r0);	 Catch:{ IOException -> 0x05ef }
        r6 = 0;
        r0 = r26;
        r7 = r0.size;	 Catch:{ IOException -> 0x05ef }
        r0 = r26;
        r8 = r0.presentationTimeUs;	 Catch:{ IOException -> 0x05ef }
        r0 = r26;
        r10 = r0.flags;	 Catch:{ IOException -> 0x05ef }
        r4 = r23;
        r4.queueInputBuffer(r5, r6, r7, r8, r10);	 Catch:{ IOException -> 0x05ef }
        r0 = r26;
        r4 = r0.offset;	 Catch:{ IOException -> 0x05ef }
        r0 = r31;
        r0.position(r4);	 Catch:{ IOException -> 0x05ef }
        r0 = r26;
        r4 = r0.offset;	 Catch:{ IOException -> 0x05ef }
        r0 = r26;
        r5 = r0.size;	 Catch:{ IOException -> 0x05ef }
        r4 = r4 + r5;
        r0 = r31;
        r0.limit(r4);	 Catch:{ IOException -> 0x05ef }
        r0 = r35;
        r4 = r0.g;	 Catch:{ IOException -> 0x05ef }
        r6 = 0;
        r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r4 <= 0) goto L_0x03fa;
    L_0x03ea:
        r0 = r26;
        r4 = r0.presentationTimeUs;	 Catch:{ IOException -> 0x05ef }
        r0 = r35;
        r6 = r0.g;	 Catch:{ IOException -> 0x05ef }
        r8 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r6 = r6 * r8;
        r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r4 <= 0) goto L_0x03fa;
    L_0x03f9:
        r3 = 1;
    L_0x03fa:
        r4 = 0;
        r4 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1));
        if (r4 == 0) goto L_0x0639;
    L_0x0400:
        r0 = r35;
        r4 = r0.f;	 Catch:{ IOException -> 0x05f1 }
        if (r4 == 0) goto L_0x0639;
    L_0x0406:
        r0 = r35;
        r4 = r0.c;	 Catch:{ IOException -> 0x05f3 }
        r6 = 0;
        r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r4 > 0) goto L_0x05f7;
    L_0x0410:
        r4 = 0;
    L_0x0412:
        r0 = r35;
        r6 = r0.g;	 Catch:{ IOException -> 0x0600 }
        r8 = 0;
        r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r6 > 0) goto L_0x0602;
    L_0x041c:
        r6 = r16;
    L_0x041e:
        r8 = 100;
        r0 = r26;
        r0 = r0.presentationTimeUs;	 Catch:{ all -> 0x05dc }
        r32 = r0;
        r32 = r32 - r4;
        r8 = r8 * r32;
        r4 = r6 - r4;
        r4 = r8 / r4;
        r5 = (int) r4;	 Catch:{ all -> 0x05dc }
        if (r5 == r12) goto L_0x0639;
    L_0x0431:
        r0 = r35;
        r4 = r0.f;	 Catch:{ all -> 0x05dc }
        r4 = r4.a(r5);	 Catch:{ all -> 0x05dc }
        r0 = r35;
        r0.e = r4;	 Catch:{ all -> 0x05dc }
    L_0x043d:
        r6 = 0;
        r0 = r23;
        r1 = r27;
        r4 = r0.dequeueOutputBuffer(r1, r6);	 Catch:{ all -> 0x05dc }
        r7 = r4;
        r6 = r13;
        r4 = r11;
    L_0x044a:
        r8 = -1;
        if (r7 == r8) goto L_0x04f0;
    L_0x044d:
        if (r7 < 0) goto L_0x04b1;
    L_0x044f:
        r8 = r6[r7];	 Catch:{ all -> 0x05dc }
        r0 = r27;
        r9 = r0.offset;	 Catch:{ all -> 0x05dc }
        r8.position(r9);	 Catch:{ all -> 0x05dc }
        r0 = r27;
        r9 = r0.offset;	 Catch:{ all -> 0x05dc }
        r0 = r27;
        r10 = r0.size;	 Catch:{ all -> 0x05dc }
        r9 = r9 + r10;
        r8.limit(r9);	 Catch:{ all -> 0x05dc }
        r0 = r27;
        r9 = r0.flags;	 Catch:{ all -> 0x05dc }
        r9 = r9 & 2;
        if (r9 != 0) goto L_0x04a6;
    L_0x046c:
        r4 = r4 + 1;
        r0 = r27;
        r9 = r0.size;	 Catch:{ all -> 0x05dc }
        r0 = r27;
        r10 = r0.offset;	 Catch:{ all -> 0x05dc }
        r9 = r9 - r10;
        r9 = r9 + 7;
        r10 = r9 & 7;
        r11 = r9 >> 3;
        r11 = r11 & 255;
        r9 = r9 >> 11;
        r9 = r9 & 3;
        r12 = 3;
        r13 = r29 & 3;
        r13 = r13 << 6;
        r9 = r9 | r13;
        r9 = (byte) r9;	 Catch:{ all -> 0x05dc }
        r28[r12] = r9;	 Catch:{ all -> 0x05dc }
        r9 = 4;
        r11 = (byte) r11;	 Catch:{ all -> 0x05dc }
        r28[r9] = r11;	 Catch:{ all -> 0x05dc }
        r9 = 5;
        r10 = r10 << 5;
        r10 = r10 | 31;
        r10 = (byte) r10;	 Catch:{ all -> 0x05dc }
        r28[r9] = r10;	 Catch:{ all -> 0x05dc }
        r9 = java.nio.ByteBuffer.wrap(r28);	 Catch:{ all -> 0x05dc }
        r0 = r22;
        r0.write(r9);	 Catch:{ all -> 0x05dc }
        r0 = r22;
        r0.write(r8);	 Catch:{ all -> 0x05dc }
    L_0x04a6:
        r8.clear();	 Catch:{ IOException -> 0x060b }
        r8 = 0;
        r0 = r23;
        r0.releaseOutputBuffer(r7, r8);	 Catch:{ IOException -> 0x060b }
        if (r18 == 0) goto L_0x04e4;
    L_0x04b1:
        r8 = -3;
        if (r7 != r8) goto L_0x04c3;
    L_0x04b4:
        r6 = r23.getOutputBuffers();	 Catch:{ all -> 0x05dc }
        r8 = z;	 Catch:{ IOException -> 0x060d }
        r9 = 44;
        r8 = r8[r9];	 Catch:{ IOException -> 0x060d }
        com.whatsapp.util.Log.i(r8);	 Catch:{ IOException -> 0x060d }
        if (r18 == 0) goto L_0x04e4;
    L_0x04c3:
        r8 = -2;
        if (r7 != r8) goto L_0x04e4;
    L_0x04c6:
        r7 = r23.getOutputFormat();	 Catch:{ all -> 0x05dc }
        r8 = new java.lang.StringBuilder;	 Catch:{ all -> 0x05dc }
        r8.<init>();	 Catch:{ all -> 0x05dc }
        r9 = z;	 Catch:{ all -> 0x05dc }
        r10 = 45;
        r9 = r9[r10];	 Catch:{ all -> 0x05dc }
        r8 = r8.append(r9);	 Catch:{ all -> 0x05dc }
        r7 = r8.append(r7);	 Catch:{ all -> 0x05dc }
        r7 = r7.toString();	 Catch:{ all -> 0x05dc }
        com.whatsapp.util.Log.i(r7);	 Catch:{ all -> 0x05dc }
    L_0x04e4:
        r8 = 0;
        r0 = r23;
        r1 = r27;
        r7 = r0.dequeueOutputBuffer(r1, r8);	 Catch:{ all -> 0x05dc }
        if (r18 == 0) goto L_0x044a;
    L_0x04f0:
        if (r18 == 0) goto L_0x0635;
    L_0x04f2:
        r14 = r14 + 1;
        r11 = r4;
        r4 = r14;
    L_0x04f6:
        r7 = 0;
        r0 = r30;
        r2.releaseOutputBuffer(r0, r7);	 Catch:{ IOException -> 0x060f }
        if (r18 == 0) goto L_0x062c;
    L_0x04fe:
        r7 = r6;
    L_0x04ff:
        r6 = -3;
        r0 = r30;
        if (r0 != r6) goto L_0x0629;
    L_0x0504:
        r6 = r2.getOutputBuffers();	 Catch:{ all -> 0x05dc }
        r8 = z;	 Catch:{ IOException -> 0x0611 }
        r9 = 14;
        r8 = r8[r9];	 Catch:{ IOException -> 0x0611 }
        com.whatsapp.util.Log.i(r8);	 Catch:{ IOException -> 0x0611 }
        if (r18 == 0) goto L_0x0536;
    L_0x0513:
        r8 = -2;
        r0 = r30;
        if (r0 != r8) goto L_0x0536;
    L_0x0518:
        r8 = r2.getOutputFormat();	 Catch:{ all -> 0x05dc }
        r9 = new java.lang.StringBuilder;	 Catch:{ all -> 0x05dc }
        r9.<init>();	 Catch:{ all -> 0x05dc }
        r10 = z;	 Catch:{ all -> 0x05dc }
        r12 = 52;
        r10 = r10[r12];	 Catch:{ all -> 0x05dc }
        r9 = r9.append(r10);	 Catch:{ all -> 0x05dc }
        r8 = r9.append(r8);	 Catch:{ all -> 0x05dc }
        r8 = r8.toString();	 Catch:{ all -> 0x05dc }
        com.whatsapp.util.Log.i(r8);	 Catch:{ all -> 0x05dc }
    L_0x0536:
        r34 = r3;
        r3 = r4;
        r4 = r34;
    L_0x053b:
        r0 = r26;
        r8 = r0.flags;	 Catch:{ IOException -> 0x0613 }
        r8 = r8 & 4;
        if (r8 == 0) goto L_0x054e;
    L_0x0543:
        r8 = z;	 Catch:{ IOException -> 0x0613 }
        r9 = 13;
        r8 = r8[r9];	 Catch:{ IOException -> 0x0613 }
        com.whatsapp.util.Log.i(r8);	 Catch:{ IOException -> 0x0613 }
        if (r18 == 0) goto L_0x0550;
    L_0x054e:
        if (r18 == 0) goto L_0x0623;
    L_0x0550:
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x05dc }
        r4.<init>();	 Catch:{ all -> 0x05dc }
        r5 = z;	 Catch:{ all -> 0x05dc }
        r6 = 38;
        r5 = r5[r6];	 Catch:{ all -> 0x05dc }
        r4 = r4.append(r5);	 Catch:{ all -> 0x05dc }
        r4 = r4.append(r11);	 Catch:{ all -> 0x05dc }
        r5 = z;	 Catch:{ all -> 0x05dc }
        r6 = 17;
        r5 = r5[r6];	 Catch:{ all -> 0x05dc }
        r4 = r4.append(r5);	 Catch:{ all -> 0x05dc }
        r3 = r4.append(r3);	 Catch:{ all -> 0x05dc }
        r3 = r3.toString();	 Catch:{ all -> 0x05dc }
        com.whatsapp.util.Log.i(r3);	 Catch:{ all -> 0x05dc }
        r2.stop();
        r2.release();
        r23.stop();
        r23.release();
        r20.release();
        r22.close();	 Catch:{ IOException -> 0x0617 }
        r21.close();	 Catch:{ IOException -> 0x0617 }
    L_0x058d:
        r19.d();
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 35;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r4 = r19.a();
        r2 = r2.append(r4);
        r3 = z;
        r4 = 39;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r35;
        r3 = r0.e;
        r2 = r2.append(r3);
        r3 = z;
        r4 = 21;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r35;
        r3 = r0.d;
        r4 = r3.length();
        r2 = r2.append(r4);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        goto L_0x00c9;
    L_0x05d8:
        r2 = move-exception;
        throw r2;
    L_0x05da:
        r3 = move-exception;
        throw r3;	 Catch:{ all -> 0x05dc }
    L_0x05dc:
        r3 = move-exception;
        r2.stop();
        r2.release();
        r23.stop();
        r23.release();
        r20.release();
        throw r3;
    L_0x05ed:
        r3 = move-exception;
        throw r3;	 Catch:{ all -> 0x05dc }
    L_0x05ef:
        r3 = move-exception;
        throw r3;	 Catch:{ all -> 0x05dc }
    L_0x05f1:
        r3 = move-exception;
        throw r3;	 Catch:{ IOException -> 0x05f3 }
    L_0x05f3:
        r3 = move-exception;
        throw r3;	 Catch:{ IOException -> 0x05f5 }
    L_0x05f5:
        r3 = move-exception;
        throw r3;	 Catch:{ all -> 0x05dc }
    L_0x05f7:
        r0 = r35;
        r4 = r0.c;	 Catch:{ all -> 0x05dc }
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r4 = r4 * r6;
        goto L_0x0412;
    L_0x0600:
        r3 = move-exception;
        throw r3;	 Catch:{ all -> 0x05dc }
    L_0x0602:
        r0 = r35;
        r6 = r0.g;	 Catch:{ all -> 0x05dc }
        r8 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r6 = r6 * r8;
        goto L_0x041e;
    L_0x060b:
        r3 = move-exception;
        throw r3;	 Catch:{ all -> 0x05dc }
    L_0x060d:
        r3 = move-exception;
        throw r3;	 Catch:{ all -> 0x05dc }
    L_0x060f:
        r3 = move-exception;
        throw r3;	 Catch:{ all -> 0x05dc }
    L_0x0611:
        r3 = move-exception;
        throw r3;	 Catch:{ all -> 0x05dc }
    L_0x0613:
        r3 = move-exception;
        throw r3;	 Catch:{ IOException -> 0x0615 }
    L_0x0615:
        r3 = move-exception;
        throw r3;	 Catch:{ all -> 0x05dc }
    L_0x0617:
        r2 = move-exception;
        r3 = z;
        r4 = 9;
        r3 = r3[r4];
        com.whatsapp.util.Log.b(r3, r2);
        goto L_0x058d;
    L_0x0623:
        r14 = r3;
        r12 = r5;
        r15 = r6;
        r13 = r7;
        goto L_0x0331;
    L_0x0629:
        r6 = r15;
        goto L_0x0513;
    L_0x062c:
        r7 = r6;
        r6 = r15;
        r34 = r4;
        r4 = r3;
        r3 = r34;
        goto L_0x053b;
    L_0x0635:
        r11 = r4;
        r4 = r14;
        goto L_0x04f6;
    L_0x0639:
        r5 = r12;
        goto L_0x043d;
    L_0x063c:
        r4 = r11;
        r5 = r12;
        r6 = r13;
        goto L_0x04f2;
    L_0x0641:
        r4 = r14;
        r5 = r12;
        r7 = r13;
        goto L_0x04ff;
    L_0x0646:
        r3 = r4;
        goto L_0x036f;
    L_0x0649:
        r3 = r14;
        goto L_0x0550;
    L_0x064c:
        r2 = r4;
        goto L_0x012d;
    L_0x064f:
        r3 = r4;
        goto L_0x0132;
    L_0x0652:
        r5 = r3;
        r4 = r2;
        goto L_0x00fc;
    L_0x0656:
        r7 = r2;
        goto L_0x00bb;
    L_0x0659:
        r7 = r3;
        goto L_0x00bb;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mn.d():void");
    }

    public void c() {
        Log.i(z[1] + this.h.length());
        ce b = tp.b(z[6]);
        b.e();
        try {
            long j;
            File file = this.d;
            File file2 = this.h;
            long j2 = this.c;
            if (this.g > 0) {
                j = this.g - this.c;
            } else {
                j = 2147483647L;
            }
            Mp4Ops.a(null, file, file2, null, j2, 0, j);
            b.d();
            Log.i(z[4] + b.a() + z[2] + this.d.length());
        } catch (at_ e) {
            Log.b(z[3], (Throwable) e);
            Mp4Ops.a(this.h, e, z[5]);
            throw e;
        }
    }

    public void a(x5 x5Var) {
        this.f = x5Var;
    }

    private static int a(int i) {
        boolean z = DialogToastActivity.f;
        int i2 = 0;
        while (i2 < a.length) {
            if (i != a[i2]) {
                i2++;
                if (z) {
                    break;
                }
            }
            return i2;
        }
        Log.e(z[7] + i + z[8]);
        return 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.io.File r5) {
        /*
        r2 = 16;
        r0 = 0;
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x0008 }
        if (r1 >= r2) goto L_0x000a;
    L_0x0007:
        return r0;
    L_0x0008:
        r0 = move-exception;
        throw r0;
    L_0x000a:
        if (r5 == 0) goto L_0x0007;
    L_0x000c:
        r1 = r5.exists();	 Catch:{ Exception -> 0x002b }
        if (r1 == 0) goto L_0x0007;
    L_0x0012:
        r2 = new android.media.MediaMetadataRetriever;
        r2.<init>();
        r1 = r5.getAbsolutePath();	 Catch:{ Exception -> 0x002f }
        r2.setDataSource(r1);	 Catch:{ Exception -> 0x002f }
        r1 = 16;
        r1 = r2.extractMetadata(r1);	 Catch:{ Exception -> 0x002f }
        if (r1 == 0) goto L_0x0027;
    L_0x0026:
        r0 = 1;
    L_0x0027:
        r2.release();
        goto L_0x0007;
    L_0x002b:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x002d }
    L_0x002d:
        r0 = move-exception;
        throw r0;
    L_0x002f:
        r1 = move-exception;
        r3 = z;	 Catch:{ all -> 0x003c }
        r4 = 0;
        r3 = r3[r4];	 Catch:{ all -> 0x003c }
        com.whatsapp.util.Log.b(r3, r1);	 Catch:{ all -> 0x003c }
        r2.release();
        goto L_0x0007;
    L_0x003c:
        r0 = move-exception;
        r2.release();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mn.a(java.io.File):boolean");
    }

    mn(mb mbVar, o5 o5Var) {
        this(mbVar);
    }

    public boolean a() {
        return true;
    }

    public void b() {
        this.e = true;
    }

    static {
        String[] strArr = new String[53];
        String str = "\b\u0010iz=\u001d\u0017l}!\n\niv F\u0006l}&\u001b\u0004c`1\u0006\u0001h";
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
                        i4 = arj.Theme_radioButtonStyle;
                        break;
                    case at.g /*1*/:
                        i4 = arj.Theme_buttonStyleSmall;
                        break;
                    case at.i /*2*/:
                        i4 = 13;
                        break;
                    case at.o /*3*/:
                        i4 = 19;
                        break;
                    default:
                        i4 = 82;
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
                    str = "I\nxg\"\u001c\u00117";
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    i2 = 3;
                    str = "\b\u0010iz=\u001d\u0017l}!\n\niv F\tdq?\u0019Q`f*\f\u001dnv\"\u001d\fb}";
                    i = 2;
                    strArr2 = strArr3;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    str = "\b\u0010iz=\u001d\u0017l}!\n\niv I\u0003d};\u001a\rhwhI";
                    i = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "\b\u0010iz=";
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "(\u0010iz==\u0017l}!\n\niv 6\u0004ig![\b9r";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "\b\u0010iz=\u001d\u0017l}!\n\niv F\u0016l~\"\u0005\fctr\u001b\u0004yvr";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "I\u0007}`r\u0000\u0016-}=\u001dE~f\"\u0019\n\u007fg7\r";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "\b\u0010iz=\u001d\u0017l}!\n\niv F\u0006a|!\f";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "\u0004\f`v";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "\b\u0010iz=\u001d\u0017l}!\n\niv F+x~0\f\u0017-|4I\u0011\u007fr1\u0002\u00167";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    str = "\b\u0004n>\"\u001b\nkz>\f";
                    i = 11;
                    i2 = 12;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    str = "\b\u0010iz=\u001d\u0017l}!\n\niv F\u0001hp=\r\u0000\u007f3\u001d\u001c\u0011}f&+\u0010ku7\u001bEOF\u0014/ _L\u0014%$JL\u0017'!R\\\u001466YA\u0017((";
                    i2 = 13;
                    strArr2 = strArr3;
                    i = 12;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    strArr2 = strArr3;
                    str = "\b\u0010iz=\u001d\u0017l}!\n\niv F\u0001hp=\r\u0000\u007f3=\u001c\u0011}f&I\u0007xu4\f\u0017~3:\b\u0013h31\u0001\u0004ct7\rK";
                    i = 13;
                    break;
                case Y.q /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "\n\rl}<\f\t p=\u001c\u000by";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "\b\u0010iz=\u001d\u0017l}!\n\niv F\u0000ug \b\u0006y| I'XU\u0014,7RU\u001e(\"RV\u001c-:BU\r:1_V\u0013$";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "I\u0016fz\"\u0019\u0000i)";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "\b\u0010iz=\u001d\u0017l}!\n\niv F\u000bb33\u001c\u0001d|r\u001d\u0017lp9\u001a";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i2] = str;
                    str = "\b\u0010iz=F\b}'3D\tlg?";
                    i = 18;
                    i2 = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    strArr2 = strArr3;
                    str = "\u0004\f`vh";
                    i = 19;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = "I\nxg\"\u001c\u00117";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = "?\fiv==\u0017l}!\n\niv 6\u0011\u007fr<\u001a\u0006bw7(\u0010iz=";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "\b\u0010iz=\u001d\u0017l}!\n\niv FEc|r\n\niv1I\u0016xc\"\u0006\u0017yz<\u000eElf6\u0000\n\"~\"]\u0004 \u007f3\u001d\b";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = "\b\u0010iz=\u001d\u0017l}!\n\niv F\u000bx~0\f\u0017-|4I\u0006bw7\n\u001673";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = "*\u0004c4&I\u0006\u007fv3\u001d\u0000-w7\n\niv I\u0003bar";
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = "\u000b\fya3\u001d\u0000";
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i2] = str;
                    i2 = 27;
                    str = "\u0004\u0004u>;\u0007\u0015xg\u007f\u001a\fwv";
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i2] = str;
                    i2 = 28;
                    str = "\b\u0010iz=\u001d\u0017l}!\n\niv F\u0006b}4\u0000\u0002xa;\u0007\u0002-v<\n\niv I\u0012dg:I\nxg\"\u001c\u0011-u=\u001b\blgr";
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    str = "I\u0004ng'\b\t7";
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i2] = str;
                    i2 = 30;
                    str = "'\n-p=\r\u0000n3!\u001c\u0015}| \u001d\fctr\b\u0010iz=F\b}'3D\tlg?";
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i2] = str;
                    i2 = 31;
                    str = "\b\u0010iz=F\b}'3D\tlg?";
                    i = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i2] = str;
                    i2 = 32;
                    str = "\b\u0010iz=\u001d\u0017l}!\n\niv F\u0006l}u\u001dEna7\b\u0011h36\f\u0006bw7\u001bEk| I";
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i2] = str;
                    i2 = 33;
                    str = "\u001a\u0004`c>\fH\u007fr&\f";
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i2] = str;
                    i2 = 34;
                    str = "\b\u0010iz=\u001d\u0017l}!\n\niv F\u0011\u007fr1\u0002_";
                    i = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i2] = str;
                    i2 = 35;
                    str = "\b\u0010iz=\u001d\u0017l}!\n\niv I\u0003d};\u001a\rhwhI";
                    i = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i2] = str;
                    i2 = 36;
                    str = "\b\u0010iz=\u001d\u0017l}!\n\niv F\u0007dg \b\u0011h)";
                    i = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i2] = str;
                    i2 = 37;
                    str = "\u0004\f`v";
                    i = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i2] = str;
                    i2 = 38;
                    str = "\b\u0010iz=\u001d\u0017l}!\n\niv F\u0015\u007f|1\f\u0016~v6I\u0003\u007fr?\f\u00167";
                    i = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i2] = str;
                    i2 = 39;
                    str = "I\u0006l}1\f\tav6S";
                    i = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i2] = str;
                    i2 = 40;
                    str = "\b\u0010iz=\u001d\u0017l}!\n\niv F\u0001hp=\r\u0000\u007f34\u0006\u0017`r&S";
                    i = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i2] = str;
                    i2 = 41;
                    str = "\r\u0010\u007fr&\u0000\ncF!";
                    i = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i2] = str;
                    i2 = 42;
                    str = "I\u0003ba?\b\u00117";
                    i = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i2] = str;
                    i2 = 43;
                    str = "\b\u0010iz=\u001d\u0017l}!\n\niv F\u0003bf<\rE";
                    i = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i2] = str;
                    i2 = 44;
                    str = "\b\u0010iz=\u001d\u0017l}!\n\niv F\u0000cp=\r\u0000\u007f3=\u001c\u0011}f&I\u0007xu4\f\u0017~3:\b\u0013h31\u0001\u0004ct7\r";
                    i = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i2] = str;
                    i2 = 45;
                    str = "\b\u0010iz=\u001d\u0017l}!\n\niv F\u0000cp=\r\u0000\u007f3=\u001c\u0011}f&I\u0003ba?\b\u0011-{3\u001aEn{3\u0007\u0002hwr\u001d\n-";
                    i = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i2] = str;
                    i2 = 46;
                    str = "\b\u0010iz=";
                    i = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i2] = str;
                    i2 = 47;
                    str = "I\u0016xc\"\u0006\u0017yz<\u000eE";
                    i = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i2] = str;
                    i2 = 48;
                    str = "\b\u0010iz=F\b}'3D\tlg?";
                    i = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i2] = str;
                    i2 = 49;
                    str = "\b\u0010iz=\u001d\u0017l}!\n\niv F\u0016hv9I\u0011b)";
                    i = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i2] = str;
                    i2 = 50;
                    str = "\u001a\u0004`c>\fH\u007fr&\f";
                    i = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i2] = str;
                    i2 = 51;
                    str = "\n\rl}<\f\t p=\u001c\u000by";
                    i = 50;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i2] = str;
                    i2 = 52;
                    str = "\b\u0010iz=\u001d\u0017l}!\n\niv F\u0001hp=\r\u0000\u007f3=\u001c\u0011}f&I\u0003ba?\b\u0011-{3\u001aEn{3\u0007\u0002hwr\u001d\n-";
                    i = 51;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    a = new int[]{96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\b\u0010iz=\u001d\u0017l}!\n\niv F\u0004ig![\b9rr";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private mn(mb mbVar) {
        this.h = mb.a(mbVar);
        this.c = mb.c(mbVar);
        this.g = mb.d(mbVar);
        this.d = mb.b(mbVar);
        this.b = mb.e(mbVar);
    }

    public boolean m722b() {
        return this.e;
    }
}
