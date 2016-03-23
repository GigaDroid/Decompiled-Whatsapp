package com.whatsapp;

import android.content.SharedPreferences.Editor;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.HandlerThread;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class rp extends ContentObserver {
    private static int b;
    private static boolean c;
    private static int d;
    private static final String[] z;
    private final Handler a;
    private final Runnable e;
    private final Runnable f;

    public void b(boolean z) {
        a(z, true);
    }

    static Runnable b(rp rpVar) {
        return rpVar.f;
    }

    static void a(rp rpVar) {
        rpVar.b();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(boolean r7, boolean r8) {
        /*
        r6 = this;
        r1 = 1;
        r0 = 0;
        r2 = com.whatsapp.DialogToastActivity.f;
        r3 = z;
        r4 = 8;
        r3 = r3[r4];
        r4 = com.whatsapp.App.z();
        r3 = r4.getSharedPreferences(r3, r0);
        if (r3 == 0) goto L_0x002c;
    L_0x0014:
        r4 = z;
        r5 = 10;
        r4 = r4[r5];
        r4 = r3.getInt(r4, r0);
        if (r8 == 0) goto L_0x0026;
    L_0x0020:
        switch(r4) {
            case 0: goto L_0x002c;
            case 1: goto L_0x002f;
            case 2: goto L_0x002d;
            default: goto L_0x0023;
        };
    L_0x0023:
        r0 = r1;
    L_0x0024:
        if (r2 == 0) goto L_0x0035;
    L_0x0026:
        if (r7 == 0) goto L_0x002a;
    L_0x0028:
        if (r2 == 0) goto L_0x006d;
    L_0x002a:
        if (r4 != r1) goto L_0x0034;
    L_0x002c:
        return;
    L_0x002d:
        if (r2 == 0) goto L_0x0024;
    L_0x002f:
        if (r7 == 0) goto L_0x002c;
    L_0x0031:
        if (r2 == 0) goto L_0x0024;
    L_0x0033:
        goto L_0x002c;
    L_0x0034:
        r0 = 2;
    L_0x0035:
        r1 = r3.edit();
        r2 = z;
        r3 = 11;
        r2 = r2[r3];
        r1 = r1.putInt(r2, r0);
        r1 = r1.commit();
        if (r1 != 0) goto L_0x002c;
    L_0x0049:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 7;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r1.append(r0);
        r1 = z;
        r2 = 9;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        goto L_0x002c;
    L_0x006d:
        r0 = r1;
        goto L_0x0035;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.rp.a(boolean, boolean):void");
    }

    public void a(boolean z) {
        a(z, false);
    }

    public int a() {
        if (d == -1) {
            d = App.z().getSharedPreferences(z[0], 0).getInt(z[1], 0);
        }
        return d;
    }

    static {
        String[] strArr = new String[14];
        int i = 0;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        String str = "n\u0006HY\u000ee\bQ\u0004\u0018}\u0019z\u0007\u000bh\u000f@\u0005\u001cc\n@\u0004";
        int i2 = -1;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case v.m /*0*/:
                        i4 = 13;
                        break;
                    case at.g /*1*/:
                        i4 = arj.Theme_radioButtonStyle;
                        break;
                    case at.i /*2*/:
                        i4 = 37;
                        break;
                    case at.o /*3*/:
                        i4 = 119;
                        break;
                    default:
                        i4 = 121;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i2) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "n\u0006K\u0003\u0018n\u001d\n\u0018\u001b~\fW\u0001\u001c\u007fFV\u0012\r{\fW\u0004\u0010b\u0007\u0018";
                    i = 2;
                    strArr2 = strArr3;
                    i2 = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "-AU\u0005\u001c{T";
                    i = 3;
                    strArr2 = strArr3;
                    i2 = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "n\u0006K\u0003\u0018n\u001dz\u0001\u001c\u007f\u001aL\u0018\u0017";
                    i2 = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "n\u0006K\u0003\u0018n\u001d\n\u0018\u001b~\fW\u0001\u001c\u007fFV\u0012\r{\fW\u0004\u0010b\u0007V\u0002\u0014\"\u000fD\u001e\u0015h\r";
                    i2 = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "n\u0006HY\u000ee\bQ\u0004\u0018}\u0019z\u0007\u000bh\u000f@\u0005\u001cc\n@\u0004";
                    i2 = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "}\u001b@\u0011\n\"\u001a\\\u0019\u001ax\u0019A\u0016\rhI";
                    i2 = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "n\u0006HY\u000ee\bQ\u0004\u0018}\u0019z\u0007\u000bh\u000f@\u0005\u001cc\n@\u0004";
                    i2 = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "-\u000fD\u001e\u0015h\r";
                    i2 = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "~\u0010K\u0014&c\f@\u0013\u001ci";
                    i2 = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "~\u0010K\u0014&c\f@\u0013\u001ci";
                    i2 = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "n\u0006K\u0003\u0018n\u001d\n\u0018\u001b~\fW\u0001\u001c\u007fFV\u001c\u0010}FM\u0018\u0015i>M\u001e\u0015h(F\u0014\u0016x\u0007Q$\u0000c\n";
                    i2 = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "~\u0010K\u0014";
                    i2 = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    z = strArr3;
                    d = -1;
                    return;
                default:
                    strArr2[i] = str;
                    str = "n\u0006K\u0003\u0018n\u001dz\u0001\u001c\u007f\u001aL\u0018\u0017";
                    i = 1;
                    strArr2 = strArr3;
                    i2 = 0;
                    break;
            }
        }
    }

    public rp() {
        super(null);
        this.f = new ff(this);
        this.e = new ae(this);
        HandlerThread handlerThread = new HandlerThread(z[13], 10);
        handlerThread.start();
        this.a = new Handler(handlerThread.getLooper());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void c(boolean r5) {
        /*
        r4 = this;
        monitor-enter(r4);
        if (r5 == 0) goto L_0x001f;
    L_0x0003:
        r0 = b;	 Catch:{ all -> 0x003e }
        if (r0 != 0) goto L_0x0015;
    L_0x0007:
        r0 = 1;
        c = r0;	 Catch:{ all -> 0x003e }
        r0 = com.whatsapp.App.z();	 Catch:{ all -> 0x003e }
        r0 = r0.getContentResolver();	 Catch:{ all -> 0x003e }
        r0.unregisterContentObserver(r4);	 Catch:{ all -> 0x003e }
    L_0x0015:
        r0 = b;	 Catch:{ all -> 0x003e }
        r0 = r0 + 1;
        b = r0;	 Catch:{ all -> 0x003e }
        r0 = com.whatsapp.DialogToastActivity.f;	 Catch:{ all -> 0x003e }
        if (r0 == 0) goto L_0x003c;
    L_0x001f:
        r0 = b;	 Catch:{ all -> 0x003e }
        r0 = r0 + -1;
        b = r0;	 Catch:{ all -> 0x003e }
        r0 = b;	 Catch:{ all -> 0x003e }
        if (r0 != 0) goto L_0x003c;
    L_0x0029:
        r0 = 0;
        c = r0;	 Catch:{ all -> 0x003e }
        r0 = com.whatsapp.App.p;	 Catch:{ all -> 0x003e }
        r0 = r0.M();	 Catch:{ all -> 0x003e }
        r1 = new com.whatsapp._y;	 Catch:{ all -> 0x003e }
        r1.<init>(r4);	 Catch:{ all -> 0x003e }
        r2 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;
        r0.postDelayed(r1, r2);	 Catch:{ all -> 0x003e }
    L_0x003c:
        monitor-exit(r4);
        return;
    L_0x003e:
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.rp.c(boolean):void");
    }

    private synchronized void b() {
        this.a.removeCallbacks(this.e);
        this.a.post(this.e);
    }

    public void onChange(boolean z) {
        if (App.ay == null) {
            return;
        }
        if (c) {
            Log.i(z[12]);
        } else {
            b();
        }
    }

    public void a(int i) {
        int a = a();
        Log.i(z[2] + i + z[3] + a + ")");
        if (a != i) {
            d = i;
            Editor edit = App.z().getSharedPreferences(z[6], 0).edit();
            edit.putInt(z[4], i);
            if (!edit.commit()) {
                Log.e(z[5]);
            }
        }
    }
}
