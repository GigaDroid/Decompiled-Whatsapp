package com.whatsapp.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.util.LruCache;
import android.widget.ImageView;
import com.whatsapp.MediaData;
import com.whatsapp.protocol.co;
import java.util.HashMap;
import java.util.HashSet;
import org.v;
import org.whispersystems.at;

public class bd {
    private static final HashMap a;
    private static bi d;
    public static Options f;
    private static long h;
    private static final bd k;
    private static final String[] z;
    private az b;
    private HashMap c;
    private am e;
    private Handler g;
    private LruCache i;
    private HashSet j;

    static Handler a(bd bdVar) {
        return bdVar.g;
    }

    static LruCache e(bd bdVar) {
        return bdVar.i;
    }

    static {
        String[] strArr = new String[5];
        String str = "\t\u001eXE\u0003\u0003\u001e_^\u0017\t\u0019HW\u0001\f\u001e\u0004U\r\n\b_D\u0017\u0007\u000f\u000b";
        boolean z = true;
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
                        i3 = 100;
                        break;
                    case at.g /*1*/:
                        i3 = 123;
                        break;
                    case at.i /*2*/:
                        i3 = 43;
                        break;
                    case at.o /*3*/:
                        i3 = 54;
                        break;
                    default:
                        i3 = 98;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\r\u0016JQ\u0007I\u000fCC\u000f\u0006TIW\u0011\u0001M\u001f\u001b\u0006\u0001\u0018DR\u0007K\u0016NE\u0011\u0005\u001cN\u0018\u0006\u0005\u000fJ\f";
                    i = 2;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "EZ\u000bD\u0007\u0007\u0002HZ\u0007\u0000[FS\u0011\u0017\u001aLSB\r\u0015\u000b^\u0003\u0016\u001f\u000bU\u0003\u0007\u0013N";
                    i = 3;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\r\u0016JQ\u0007I\u000fCC\u000f\u0006TIW\u0011\u0001M\u001f\u001b\u0006\u0001\u0018DR\u0007K\u0016NE\u0011\u0005\u001cN\u0018\u0007\n\u0018DR\u000b\n\u001c\u0011";
                    z = true;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    a = new HashMap();
                    k = new bd();
                    f = new Options();
                    f.inInputShareable = true;
                    f.inPurgeable = true;
                    f.inDither = true;
                    d = new cf();
                    return;
                default:
                    strArr2[i] = str;
                    str = "\r\u0016JQ\u0007I\u000fCC\u000f\u0006TIW\u0011\u0001M\u001f\u001b\u0006\u0001\u0018DR\u0007K\u001eYD\r\u0016";
                    i = 1;
                    strArr2 = strArr3;
                    z = false;
                    break;
            }
        }
    }

    public static boolean a() {
        try {
            return System.currentTimeMillis() - h < 1000;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    public static void b(co coVar) {
        k.c(coVar);
    }

    static am d(bd bdVar) {
        return bdVar.e;
    }

    private bd() {
        this.c = new HashMap();
        this.j = new HashSet();
        this.b = null;
        this.e = new am(this);
        int maxMemory = (int) ((Runtime.getRuntime().maxMemory() / 1024) / 8);
        Log.i(z[0] + maxMemory);
        this.i = new b8(this, maxMemory);
    }

    public static void b(co coVar, ImageView imageView, bi biVar) {
        if (imageView != null) {
            try {
                imageView.setTag(coVar.k);
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }
        }
        try {
            bd bdVar = k;
            if (biVar == null) {
                biVar = d;
            }
            bdVar.a(coVar, imageView, biVar);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw e2;
        }
    }

    static HashSet c(bd bdVar) {
        return bdVar.j;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.graphics.Bitmap a(com.whatsapp.protocol.co r10, android.widget.ImageView r11, com.whatsapp.util.bi r12) {
        /*
        r9 = this;
        r2 = 0;
        monitor-enter(r9);
        r3 = com.whatsapp.util.Log.h;	 Catch:{ all -> 0x000f }
        r0 = r10.a();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x000d }
        if (r0 != 0) goto L_0x0012;
    L_0x000a:
        r0 = r2;
    L_0x000b:
        monitor-exit(r9);
        return r0;
    L_0x000d:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x000f }
    L_0x000f:
        r0 = move-exception;
        monitor-exit(r9);
        throw r0;
    L_0x0012:
        r0 = r9.i;	 Catch:{ all -> 0x000f }
        r1 = r10.k;	 Catch:{ all -> 0x000f }
        r0 = r0.get(r1);	 Catch:{ all -> 0x000f }
        r0 = (android.graphics.Bitmap) r0;	 Catch:{ all -> 0x000f }
        if (r0 == 0) goto L_0x0024;
    L_0x001e:
        r1 = r0.isRecycled();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00f7 }
        if (r1 == 0) goto L_0x00d4;
    L_0x0024:
        if (r0 == 0) goto L_0x0034;
    L_0x0026:
        r0 = r0.isRecycled();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00fb }
        if (r0 == 0) goto L_0x0034;
    L_0x002c:
        r0 = z;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00fd }
        r1 = 3;
        r0 = r0[r1];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00fd }
        com.whatsapp.util.Log.e(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00fd }
    L_0x0034:
        r0 = r9.c;	 Catch:{ all -> 0x000f }
        r1 = r10.k;	 Catch:{ all -> 0x000f }
        r0 = r0.get(r1);	 Catch:{ all -> 0x000f }
        r0 = (java.lang.ref.SoftReference) r0;	 Catch:{ all -> 0x000f }
        if (r0 == 0) goto L_0x01aa;
    L_0x0040:
        r1 = r0.get();	 Catch:{ all -> 0x000f }
        r1 = (android.graphics.Bitmap) r1;	 Catch:{ all -> 0x000f }
    L_0x0046:
        if (r1 == 0) goto L_0x004e;
    L_0x0048:
        r4 = r1.isRecycled();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00ff }
        if (r4 == 0) goto L_0x01a7;
    L_0x004e:
        if (r0 == 0) goto L_0x0057;
    L_0x0050:
        r0 = r9.c;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0103 }
        r1 = r10.k;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0103 }
        r0.remove(r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0103 }
    L_0x0057:
        r0 = r10.u;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0105, StringIndexOutOfBoundsException -> 0x0191, IllegalArgumentException -> 0x0186 }
        if (r0 != 0) goto L_0x016b;
    L_0x005b:
        r0 = r10.c();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0105, StringIndexOutOfBoundsException -> 0x0191, IllegalArgumentException -> 0x0186 }
        if (r0 == 0) goto L_0x01a4;
    L_0x0061:
        r0 = r10.c();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0107, StringIndexOutOfBoundsException -> 0x0191, IllegalArgumentException -> 0x0186 }
        r0 = r0.length();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0107, StringIndexOutOfBoundsException -> 0x0191, IllegalArgumentException -> 0x0186 }
        if (r0 <= 0) goto L_0x01a4;
    L_0x006b:
        r0 = r10.c();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0109, StringIndexOutOfBoundsException -> 0x0191, IllegalArgumentException -> 0x0186 }
        r1 = 0;
        r0 = android.backport.util.Base64.decode(r0, r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0109, StringIndexOutOfBoundsException -> 0x0191, IllegalArgumentException -> 0x0186 }
    L_0x0074:
        if (r0 == 0) goto L_0x01a1;
    L_0x0076:
        r1 = 0;
        r4 = r0.length;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0109, StringIndexOutOfBoundsException -> 0x0191, IllegalArgumentException -> 0x0186 }
        r5 = f;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0109, StringIndexOutOfBoundsException -> 0x0191, IllegalArgumentException -> 0x0186 }
        r1 = android.graphics.BitmapFactory.decodeByteArray(r0, r1, r4, r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0109, StringIndexOutOfBoundsException -> 0x0191, IllegalArgumentException -> 0x0186 }
    L_0x007e:
        if (r1 == 0) goto L_0x0168;
    L_0x0080:
        if (r12 == 0) goto L_0x019e;
    L_0x0082:
        r0 = r10.Q;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0175, StringIndexOutOfBoundsException -> 0x0195, IllegalArgumentException -> 0x0189 }
        r0 = (com.whatsapp.MediaData) r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0175, StringIndexOutOfBoundsException -> 0x0195, IllegalArgumentException -> 0x0189 }
        r2 = r10.c;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0171, StringIndexOutOfBoundsException -> 0x0195, IllegalArgumentException -> 0x0189 }
        r4 = 9;
        if (r2 == r4) goto L_0x019e;
    L_0x008c:
        r2 = r0.file;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0171, StringIndexOutOfBoundsException -> 0x0195, IllegalArgumentException -> 0x0189 }
        if (r2 == 0) goto L_0x0098;
    L_0x0090:
        r0 = r0.file;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0173, StringIndexOutOfBoundsException -> 0x0195, IllegalArgumentException -> 0x0189 }
        r0 = r0.exists();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0173, StringIndexOutOfBoundsException -> 0x0195, IllegalArgumentException -> 0x0189 }
        if (r0 != 0) goto L_0x019e;
    L_0x0098:
        r0 = 1;
        r2 = 2;
        r0 = com.whatsapp.util.bt.a(r1, r0, r2);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0175, StringIndexOutOfBoundsException -> 0x0195, IllegalArgumentException -> 0x0189 }
        r1.recycle();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0175, StringIndexOutOfBoundsException -> 0x0195, IllegalArgumentException -> 0x0189 }
    L_0x00a1:
        r1 = r9.i;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0181, StringIndexOutOfBoundsException -> 0x0198, IllegalArgumentException -> 0x018b }
        r2 = r10.k;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0181, StringIndexOutOfBoundsException -> 0x0198, IllegalArgumentException -> 0x018b }
        r1.put(r2, r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0181, StringIndexOutOfBoundsException -> 0x0198, IllegalArgumentException -> 0x018b }
        r1 = r9.j;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0181, StringIndexOutOfBoundsException -> 0x0198, IllegalArgumentException -> 0x018b }
        r2 = r10.k;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0181, StringIndexOutOfBoundsException -> 0x0198, IllegalArgumentException -> 0x018b }
        r1.add(r2);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0181, StringIndexOutOfBoundsException -> 0x0198, IllegalArgumentException -> 0x018b }
    L_0x00af:
        if (r0 == 0) goto L_0x00d2;
    L_0x00b1:
        if (r12 == 0) goto L_0x00d2;
    L_0x00b3:
        r9.c(r10, r11, r12);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x017b }
        if (r3 == 0) goto L_0x00d2;
    L_0x00b8:
        if (r12 == 0) goto L_0x00d2;
    L_0x00ba:
        r1 = r12.a();	 Catch:{ all -> 0x000f }
        r1 = (float) r1;	 Catch:{ all -> 0x000f }
        r2 = com.whatsapp.a4d.a();	 Catch:{ all -> 0x000f }
        r2 = r2.g;	 Catch:{ all -> 0x000f }
        r1 = r1 / r2;
        r1 = (int) r1;
        r2 = r0.getWidth();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x017d }
        r2 = r2 * 2;
        if (r1 <= r2) goto L_0x00d2;
    L_0x00cf:
        r9.c(r10, r11, r12);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x017d }
    L_0x00d2:
        if (r3 == 0) goto L_0x00ee;
    L_0x00d4:
        if (r12 == 0) goto L_0x00ee;
    L_0x00d6:
        r1 = r12.a();	 Catch:{ all -> 0x000f }
        r1 = (float) r1;	 Catch:{ all -> 0x000f }
        r2 = com.whatsapp.a4d.a();	 Catch:{ all -> 0x000f }
        r2 = r2.g;	 Catch:{ all -> 0x000f }
        r1 = r1 / r2;
        r1 = (int) r1;
        r2 = r0.getWidth();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x017f }
        r2 = r2 * 2;
        if (r1 <= r2) goto L_0x00ee;
    L_0x00eb:
        r9.c(r10, r11, r12);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x017f }
    L_0x00ee:
        if (r12 == 0) goto L_0x000b;
    L_0x00f0:
        r12.a(r11, r0, r10);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00f5 }
        goto L_0x000b;
    L_0x00f5:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x000f }
    L_0x00f7:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00f9 }
    L_0x00f9:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00fb }
    L_0x00fb:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00fd }
    L_0x00fd:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x000f }
    L_0x00ff:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0101 }
    L_0x0101:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0103 }
    L_0x0103:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x000f }
    L_0x0105:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0107, StringIndexOutOfBoundsException -> 0x0191, IllegalArgumentException -> 0x0186 }
    L_0x0107:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0109, StringIndexOutOfBoundsException -> 0x0191, IllegalArgumentException -> 0x0186 }
    L_0x0109:
        r0 = move-exception;
        r1 = r2;
    L_0x010b:
        r2 = new java.lang.StringBuilder;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0177 }
        r2.<init>();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0177 }
        r4 = z;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0177 }
        r5 = 4;
        r4 = r4[r5];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0177 }
        r2 = r2.append(r4);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0177 }
        r4 = r10.u;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0177 }
        r2 = r2.append(r4);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0177 }
        r2 = r2.toString();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0177 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0177 }
        r2 = r10.u;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0177 }
        if (r2 != 0) goto L_0x0160;
    L_0x012a:
        r2 = r10.c();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0179 }
        if (r2 == 0) goto L_0x0160;
    L_0x0130:
        r2 = new java.lang.StringBuilder;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0179 }
        r2.<init>();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0179 }
        r4 = z;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0179 }
        r5 = 2;
        r4 = r4[r5];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0179 }
        r2 = r2.append(r4);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0179 }
        r4 = r10.c();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0179 }
        r5 = 0;
        r6 = 100;
        r7 = r10.c();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0179 }
        r7 = r7.length();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0179 }
        r6 = java.lang.Math.min(r6, r7);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0179 }
        r4 = r4.substring(r5, r6);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0179 }
        r2 = r2.append(r4);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0179 }
        r2 = r2.toString();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0179 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0179 }
    L_0x0160:
        r2 = z;	 Catch:{ all -> 0x000f }
        r4 = 1;
        r2 = r2[r4];	 Catch:{ all -> 0x000f }
        com.whatsapp.util.Log.b(r2, r0);	 Catch:{ all -> 0x000f }
    L_0x0168:
        r0 = r1;
        goto L_0x00af;
    L_0x016b:
        r0 = r10.e();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0109, StringIndexOutOfBoundsException -> 0x0191, IllegalArgumentException -> 0x0186 }
        goto L_0x0074;
    L_0x0171:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0173, StringIndexOutOfBoundsException -> 0x0195, IllegalArgumentException -> 0x0189 }
    L_0x0173:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0175, StringIndexOutOfBoundsException -> 0x0195, IllegalArgumentException -> 0x0189 }
    L_0x0175:
        r0 = move-exception;
        goto L_0x010b;
    L_0x0177:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0179 }
    L_0x0179:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x000f }
    L_0x017b:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x000f }
    L_0x017d:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x000f }
    L_0x017f:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x000f }
    L_0x0181:
        r1 = move-exception;
        r8 = r1;
        r1 = r0;
        r0 = r8;
        goto L_0x010b;
    L_0x0186:
        r0 = move-exception;
        r1 = r2;
        goto L_0x010b;
    L_0x0189:
        r0 = move-exception;
        goto L_0x010b;
    L_0x018b:
        r1 = move-exception;
        r8 = r1;
        r1 = r0;
        r0 = r8;
        goto L_0x010b;
    L_0x0191:
        r0 = move-exception;
        r1 = r2;
        goto L_0x010b;
    L_0x0195:
        r0 = move-exception;
        goto L_0x010b;
    L_0x0198:
        r1 = move-exception;
        r8 = r1;
        r1 = r0;
        r0 = r8;
        goto L_0x010b;
    L_0x019e:
        r0 = r1;
        goto L_0x00a1;
    L_0x01a1:
        r1 = r2;
        goto L_0x007e;
    L_0x01a4:
        r0 = r2;
        goto L_0x0074;
    L_0x01a7:
        r0 = r1;
        goto L_0x00b8;
    L_0x01aa:
        r1 = r2;
        goto L_0x0046;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.bd.a(com.whatsapp.protocol.co, android.widget.ImageView, com.whatsapp.util.bi):android.graphics.Bitmap");
    }

    private synchronized void c(co coVar) {
        this.i.remove(coVar.k);
        this.j.remove(coVar.k);
        this.c.remove(coVar.k);
    }

    public static void a(boolean z) {
        if (z) {
            try {
                h = System.currentTimeMillis();
                if (Log.h == 0) {
                    return;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }
        }
        h = 0;
    }

    private void c(co coVar, ImageView imageView, bi biVar) {
        try {
            if (this.g == null) {
                this.g = new Handler(Looper.getMainLooper());
            }
            synchronized (am.a(this.e)) {
                this.e.a(imageView);
                if (this.e.a(coVar)) {
                    return;
                }
                MediaData mediaData = (MediaData) coVar.Q;
                if (mediaData != null) {
                    try {
                        if (mediaData.file == null) {
                            return;
                        }
                        if (mediaData.file.exists()) {
                            bh bhVar = new bh(this, coVar, imageView, biVar);
                            synchronized (am.a(this.e)) {
                                am.a(this.e).add(0, bhVar);
                                am.a(this.e).notifyAll();
                            }
                            try {
                                if (this.b == null) {
                                    this.b = new az(this);
                                    this.b.setPriority(4);
                                    this.b.start();
                                }
                            } catch (ArrayIndexOutOfBoundsException e) {
                                throw e;
                            }
                        }
                    } catch (ArrayIndexOutOfBoundsException e2) {
                        throw e2;
                    } catch (ArrayIndexOutOfBoundsException e22) {
                        try {
                            throw e22;
                        } catch (ArrayIndexOutOfBoundsException e222) {
                            throw e222;
                        }
                    }
                }
            }
        } catch (ArrayIndexOutOfBoundsException e2222) {
            throw e2222;
        }
    }

    public static Bitmap a(co coVar) {
        return k.a(coVar, null, null);
    }

    static HashMap b(bd bdVar) {
        return bdVar.c;
    }
}
