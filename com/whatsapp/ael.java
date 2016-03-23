package com.whatsapp;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteStatement;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.OperationCanceledException;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.os.CancellationSignal;
import android.text.TextUtils;
import com.whatsapp.fieldstats.k;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.protocol.b7;
import com.whatsapp.protocol.c3;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import com.whatsapp.util.a1;
import com.whatsapp.util.ab;
import com.whatsapp.util.ac;
import com.whatsapp.util.ag;
import com.whatsapp.util.bf;
import com.whatsapp.util.bk;
import com.whatsapp.util.l;
import com.whatsapp.util.p;
import java.io.File;
import java.text.BreakIterator;
import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class ael {
    private static final String B;
    private static final String E;
    private static final String I;
    private static final boolean M;
    private static final String Q;
    private static final String V;
    static final File X;
    private static final String[] Y;
    private static final String d;
    private static final String g;
    private static final String i;
    private static final String k;
    static final File m;
    public static final Pattern q;
    private static final String r;
    private static final Pattern s;
    private SQLiteStatement A;
    private SQLiteStatement C;
    private final List D;
    private SQLiteStatement F;
    private final Context G;
    private boolean H;
    private SQLiteStatement J;
    private SQLiteStatement K;
    private int L;
    private boolean N;
    @SuppressLint({"HandlerLeak"})
    private final Handler O;
    private final AtomicBoolean P;
    private final Map R;
    private SQLiteStatement S;
    @SuppressLint({"HandlerLeak"})
    private final Handler T;
    private final cn U;
    private SQLiteStatement W;
    private final a5f a;
    private final mq b;
    private SQLiteStatement c;
    private SQLiteStatement e;
    private final bf f;
    private SQLiteStatement h;
    @SuppressLint({"HandlerLeak"})
    private final Handler j;
    private final ConcurrentHashMap l;
    private final uz n;
    private final Hashtable o;
    private final bf p;
    private final azf t;
    private boolean u;
    private final HandlerThread v;
    private SQLiteStatement w;
    private SQLiteStatement x;
    private SQLiteStatement y;
    private final Map z;

    private static String z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 13;
                    break;
                case at.g /*1*/:
                    i2 = 63;
                    break;
                case at.i /*2*/:
                    i2 = 126;
                    break;
                case at.o /*3*/:
                    i2 = 40;
                    break;
                default:
                    i2 = 50;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    private static char[] m449z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 50);
        }
        return toCharArray;
    }

    private void a(int i, co coVar) {
        boolean z = l5.s;
        long[] jArr = (long[]) this.o.get(coVar);
        if (jArr != null) {
            try {
                jArr[1] = System.currentTimeMillis();
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        g(Y[458]);
        ol b = b(coVar, 1);
        try {
            if (b.b) {
                if (coVar.k.a) {
                    try {
                        if (b7.a(coVar.d, 4) < 0) {
                            this.z.put(coVar.k, coVar);
                        }
                    } catch (IllegalStateException e2) {
                        throw e2;
                    }
                }
                try {
                    this.o.remove(coVar);
                    g(Y[456]);
                    if (b.d) {
                        Message.obtain(this.T, 4, i, 0, coVar).sendToTarget();
                        if (!z) {
                            return;
                        }
                    }
                    try {
                        Message.obtain(this.T, 5, i, 0, coVar).sendToTarget();
                        if (b.c) {
                            try {
                                Message.obtain(this.T, 6, i, 0, coVar).sendToTarget();
                                if (!z) {
                                    return;
                                }
                            } catch (IllegalStateException e22) {
                                throw e22;
                            }
                        } else {
                            return;
                        }
                    } catch (IllegalStateException e222) {
                        throw e222;
                    }
                } catch (IllegalStateException e2222) {
                    throw e2222;
                } catch (IllegalStateException e22222) {
                    throw e22222;
                }
            }
            try {
                if (b.a) {
                    this.o.remove(coVar);
                    g(Y[457]);
                    Message.obtain(this.T, 3, coVar).sendToTarget();
                }
            } catch (IllegalStateException e222222) {
                throw e222222;
            }
        } catch (IllegalStateException e2222222) {
            throw e2222222;
        } catch (IllegalStateException e22222222) {
            throw e22222222;
        }
    }

    public Cursor a(String str, int i, co coVar, nt ntVar) {
        a5w com_whatsapp_a5w = (a5w) this.l.get(str);
        if (com_whatsapp_a5w != null) {
            try {
                if (a5w.k(com_whatsapp_a5w) == 1) {
                    a5w.b(com_whatsapp_a5w, b(coVar));
                }
                a5w.b(com_whatsapp_a5w, d(str, i));
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        return a(str, i, ntVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void f(com.whatsapp.protocol.co r6) {
        /*
        r5 = this;
        r4 = 1;
        r0 = new java.lang.StringBuilder;	 Catch:{ InterruptedException -> 0x00c9 }
        r0.<init>();	 Catch:{ InterruptedException -> 0x00c9 }
        r1 = Y;	 Catch:{ InterruptedException -> 0x00c9 }
        r2 = 704; // 0x2c0 float:9.87E-43 double:3.48E-321;
        r1 = r1[r2];	 Catch:{ InterruptedException -> 0x00c9 }
        r1 = r0.append(r1);	 Catch:{ InterruptedException -> 0x00c9 }
        r0 = r6.k;	 Catch:{ InterruptedException -> 0x00c9 }
        r0 = r0.a;	 Catch:{ InterruptedException -> 0x00c9 }
        if (r0 == 0) goto L_0x00cb;
    L_0x0016:
        r0 = Y;	 Catch:{ InterruptedException -> 0x00c9 }
        r2 = 705; // 0x2c1 float:9.88E-43 double:3.483E-321;
        r0 = r0[r2];	 Catch:{ InterruptedException -> 0x00c9 }
    L_0x001c:
        r0 = r1.append(r0);	 Catch:{ InterruptedException -> 0x00d3 }
        r1 = r6.k;	 Catch:{ InterruptedException -> 0x00d3 }
        r1 = r1.c;	 Catch:{ InterruptedException -> 0x00d3 }
        r0 = r0.append(r1);	 Catch:{ InterruptedException -> 0x00d3 }
        r1 = " ";
        r0 = r0.append(r1);	 Catch:{ InterruptedException -> 0x00d3 }
        r1 = r6.k;	 Catch:{ InterruptedException -> 0x00d3 }
        r1 = r1.b;	 Catch:{ InterruptedException -> 0x00d3 }
        r0 = r0.append(r1);	 Catch:{ InterruptedException -> 0x00d3 }
        r1 = " ";
        r0 = r0.append(r1);	 Catch:{ InterruptedException -> 0x00d3 }
        r1 = r6.c;	 Catch:{ InterruptedException -> 0x00d3 }
        r0 = r0.append(r1);	 Catch:{ InterruptedException -> 0x00d3 }
        r0 = r0.toString();	 Catch:{ InterruptedException -> 0x00d3 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ InterruptedException -> 0x00d3 }
        r0 = r6.k;	 Catch:{ InterruptedException -> 0x00d3 }
        r0 = r0.a;	 Catch:{ InterruptedException -> 0x00d3 }
        if (r0 == 0) goto L_0x007f;
    L_0x0051:
        r0 = r6.d;	 Catch:{ InterruptedException -> 0x00d3 }
        r1 = 6;
        if (r0 == r1) goto L_0x007f;
    L_0x0056:
        r0 = new java.lang.StringBuilder;	 Catch:{ InterruptedException -> 0x00d5 }
        r0.<init>();	 Catch:{ InterruptedException -> 0x00d5 }
        r1 = com.whatsapp.App.ad();	 Catch:{ InterruptedException -> 0x00d5 }
        r0 = r0.append(r1);	 Catch:{ InterruptedException -> 0x00d5 }
        r1 = Y;	 Catch:{ InterruptedException -> 0x00d5 }
        r2 = 703; // 0x2bf float:9.85E-43 double:3.473E-321;
        r1 = r1[r2];	 Catch:{ InterruptedException -> 0x00d5 }
        r0 = r0.append(r1);	 Catch:{ InterruptedException -> 0x00d5 }
        r0 = r0.toString();	 Catch:{ InterruptedException -> 0x00d5 }
        r1 = r6.k;	 Catch:{ InterruptedException -> 0x00d5 }
        r1 = r1.c;	 Catch:{ InterruptedException -> 0x00d5 }
        r0 = r0.equals(r1);	 Catch:{ InterruptedException -> 0x00d5 }
        if (r0 == 0) goto L_0x007f;
    L_0x007b:
        r0 = 13;
        r6.d = r0;
    L_0x007f:
        r0 = android.os.Looper.myLooper();
        r1 = android.os.Looper.getMainLooper();
        if (r0 == r1) goto L_0x00a7;
    L_0x0089:
        r0 = new java.util.concurrent.CountDownLatch;
        r0.<init>(r4);
        r1 = com.whatsapp.App.p;
        r1 = r1.M();
        r2 = new com.whatsapp.aoz;
        r2.<init>(r5, r6, r0);
        r1.post(r2);
        r2 = 5;
        r1 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ InterruptedException -> 0x00d7 }
        r0.await(r2, r1);	 Catch:{ InterruptedException -> 0x00d7 }
    L_0x00a3:
        r0 = com.whatsapp.l5.s;	 Catch:{ InterruptedException -> 0x00dc }
        if (r0 == 0) goto L_0x00ac;
    L_0x00a7:
        r0 = r5.U;	 Catch:{ InterruptedException -> 0x00dc }
        r0.c(r6);	 Catch:{ InterruptedException -> 0x00dc }
    L_0x00ac:
        r0 = 2;
        r0 = new long[r0];
        r1 = 0;
        r2 = java.lang.System.currentTimeMillis();
        r0[r1] = r2;
        r2 = -1;
        r0[r4] = r2;
        r1 = r5.o;
        r1.put(r6, r0);
        r0 = Y;
        r1 = 706; // 0x2c2 float:9.9E-43 double:3.49E-321;
        r0 = r0[r1];
        r5.g(r0);
        return;
    L_0x00c9:
        r0 = move-exception;
        throw r0;
    L_0x00cb:
        r0 = Y;
        r2 = 702; // 0x2be float:9.84E-43 double:3.47E-321;
        r0 = r0[r2];
        goto L_0x001c;
    L_0x00d3:
        r0 = move-exception;
        throw r0;	 Catch:{ InterruptedException -> 0x00d5 }
    L_0x00d5:
        r0 = move-exception;
        throw r0;
    L_0x00d7:
        r0 = move-exception;
        com.whatsapp.util.Log.a(r0);
        goto L_0x00a3;
    L_0x00dc:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.f(com.whatsapp.protocol.co):void");
    }

    public List a(String str, c3 c3Var, Integer num) {
        boolean z = l5.s;
        if (c3Var == null) {
            try {
                long p = p(str);
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        p = b(a(c3Var));
        if (p == 1) {
            try {
                Log.i(Y[312] + c3Var);
                return null;
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }
        String str2;
        if (num != null) {
            try {
                str2 = Y[310] + num.toString();
            } catch (IllegalStateException e22) {
                throw e22;
            }
        }
        str2 = "";
        str2 = Y[313] + str2;
        String[] strArr = new String[]{str, String.valueOf(p)};
        synchronized (this.a) {
            Cursor rawQuery = this.a.getReadableDatabase().rawQuery(str2, strArr);
        }
        if (rawQuery == null) {
            try {
                Log.i(Y[311] + c3Var);
                return null;
            } catch (IllegalStateException e222) {
                throw e222;
            }
        }
        List arrayList = new ArrayList();
        while (rawQuery.moveToNext()) {
            co a = a(rawQuery, str);
            if (a != null) {
                try {
                    arrayList.add(a);
                } catch (IllegalStateException e2222) {
                    throw e2222;
                }
            }
            if (z) {
                break;
            }
        }
        rawQuery.close();
        return arrayList;
    }

    private boolean e() {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:com.whatsapp.ael.e():boolean. bs: [B:35:0x00b3, B:108:0x0179]
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
        r1 = 0;
        r0 = 1;
        r4 = com.whatsapp.l5.s;
        r3 = Y;
        r5 = 497; // 0x1f1 float:6.96E-43 double:2.456E-321;
        r3 = r3[r5];
        com.whatsapp.util.Log.i(r3);
        r5 = new com.whatsapp.util.ab;
        r3 = Y;
        r6 = 501; // 0x1f5 float:7.02E-43 double:2.475E-321;
        r3 = r3[r6];
        r5.<init>(r3);
        r3 = X;	 Catch:{ SQLiteDatabaseCorruptException -> 0x01b7, SQLiteException -> 0x01b1, all -> 0x01a9 }
        r3 = r3.getAbsolutePath();	 Catch:{ SQLiteDatabaseCorruptException -> 0x01b7, SQLiteException -> 0x01b1, all -> 0x01a9 }
        r6 = 0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x01b7, SQLiteException -> 0x01b1, all -> 0x01a9 }
        r7 = 16;	 Catch:{ SQLiteDatabaseCorruptException -> 0x01b7, SQLiteException -> 0x01b1, all -> 0x01a9 }
        r3 = android.database.sqlite.SQLiteDatabase.openDatabase(r3, r6, r7);	 Catch:{ SQLiteDatabaseCorruptException -> 0x01b7, SQLiteException -> 0x01b1, all -> 0x01a9 }
        r2 = Y;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c9, SQLiteException -> 0x00f3 }
        r6 = 498; // 0x1f2 float:6.98E-43 double:2.46E-321;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c9, SQLiteException -> 0x00f3 }
        r2 = r2[r6];	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c9, SQLiteException -> 0x00f3 }
        r6 = 0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c9, SQLiteException -> 0x00f3 }
        r6 = r3.rawQuery(r2, r6);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c9, SQLiteException -> 0x00f3 }
        if (r6 == 0) goto L_0x01c0;
    L_0x0033:
        r2 = new java.lang.StringBuilder;	 Catch:{ SQLiteFullException -> 0x00ae, SQLiteException -> 0x015d }
        r2.<init>();	 Catch:{ SQLiteFullException -> 0x00ae, SQLiteException -> 0x015d }
        r7 = Y;	 Catch:{ SQLiteFullException -> 0x00ae, SQLiteException -> 0x015d }
        r8 = 491; // 0x1eb float:6.88E-43 double:2.426E-321;	 Catch:{ SQLiteFullException -> 0x00ae, SQLiteException -> 0x015d }
        r7 = r7[r8];	 Catch:{ SQLiteFullException -> 0x00ae, SQLiteException -> 0x015d }
        r2 = r2.append(r7);	 Catch:{ SQLiteFullException -> 0x00ae, SQLiteException -> 0x015d }
        r7 = r6.getCount();	 Catch:{ SQLiteFullException -> 0x00ae, SQLiteException -> 0x015d }
        r2 = r2.append(r7);	 Catch:{ SQLiteFullException -> 0x00ae, SQLiteException -> 0x015d }
        r2 = r2.toString();	 Catch:{ SQLiteFullException -> 0x00ae, SQLiteException -> 0x015d }
        com.whatsapp.util.Log.i(r2);	 Catch:{ SQLiteFullException -> 0x00ae, SQLiteException -> 0x015d }
        r2 = r6.moveToNext();	 Catch:{ SQLiteFullException -> 0x00ae, SQLiteException -> 0x015d }
        if (r2 == 0) goto L_0x0123;	 Catch:{ SQLiteFullException -> 0x00ae, SQLiteException -> 0x015d }
    L_0x0057:
        r2 = 0;	 Catch:{ SQLiteFullException -> 0x00ae, SQLiteException -> 0x015d }
        r2 = r6.getInt(r2);	 Catch:{ SQLiteFullException -> 0x00ae, SQLiteException -> 0x015d }
        r11.L = r2;	 Catch:{ SQLiteFullException -> 0x00ae, SQLiteException -> 0x015d }
        r2 = r11.L;	 Catch:{ SQLiteFullException -> 0x00ae, SQLiteException -> 0x015d }
        if (r2 <= 0) goto L_0x0068;
    L_0x0062:
        r2 = r11.L;	 Catch:{ SQLiteFullException -> 0x00b0, SQLiteException -> 0x015d }
        r2 = r2 + -1;	 Catch:{ SQLiteFullException -> 0x00b0, SQLiteException -> 0x015d }
        r11.L = r2;	 Catch:{ SQLiteFullException -> 0x00b0, SQLiteException -> 0x015d }
    L_0x0068:
        r2 = new java.lang.StringBuilder;	 Catch:{ SQLiteFullException -> 0x00b2, SQLiteException -> 0x015d }
        r2.<init>();	 Catch:{ SQLiteFullException -> 0x00b2, SQLiteException -> 0x015d }
        r7 = Y;	 Catch:{ SQLiteFullException -> 0x00b2, SQLiteException -> 0x015d }
        r8 = 493; // 0x1ed float:6.91E-43 double:2.436E-321;	 Catch:{ SQLiteFullException -> 0x00b2, SQLiteException -> 0x015d }
        r7 = r7[r8];	 Catch:{ SQLiteFullException -> 0x00b2, SQLiteException -> 0x015d }
        r2 = r2.append(r7);	 Catch:{ SQLiteFullException -> 0x00b2, SQLiteException -> 0x015d }
        r7 = r11.L;	 Catch:{ SQLiteFullException -> 0x00b2, SQLiteException -> 0x015d }
        r2 = r2.append(r7);	 Catch:{ SQLiteFullException -> 0x00b2, SQLiteException -> 0x015d }
        r7 = Y;	 Catch:{ SQLiteFullException -> 0x00b2, SQLiteException -> 0x015d }
        r8 = 502; // 0x1f6 float:7.03E-43 double:2.48E-321;	 Catch:{ SQLiteFullException -> 0x00b2, SQLiteException -> 0x015d }
        r7 = r7[r8];	 Catch:{ SQLiteFullException -> 0x00b2, SQLiteException -> 0x015d }
        r2 = r2.append(r7);	 Catch:{ SQLiteFullException -> 0x00b2, SQLiteException -> 0x015d }
        r8 = r5.b();	 Catch:{ SQLiteFullException -> 0x00b2, SQLiteException -> 0x015d }
        r2 = r2.append(r8);	 Catch:{ SQLiteFullException -> 0x00b2, SQLiteException -> 0x015d }
        r2 = r2.toString();	 Catch:{ SQLiteFullException -> 0x00b2, SQLiteException -> 0x015d }
        com.whatsapp.util.Log.i(r2);	 Catch:{ SQLiteFullException -> 0x00b2, SQLiteException -> 0x015d }
        r6.close();	 Catch:{ SQLiteFullException -> 0x00f1 }
        r2 = r3.isOpen();	 Catch:{ SQLiteFullException -> 0x00f1 }
        if (r2 == 0) goto L_0x00a2;	 Catch:{ SQLiteFullException -> 0x00f1 }
    L_0x009f:
        r3.close();	 Catch:{ SQLiteFullException -> 0x00f1 }
    L_0x00a2:
        if (r3 == 0) goto L_0x00ad;
    L_0x00a4:
        r1 = r3.isOpen();	 Catch:{ SQLiteFullException -> 0x011f }
        if (r1 == 0) goto L_0x00ad;
    L_0x00aa:
        r3.close();	 Catch:{ SQLiteFullException -> 0x0121 }
    L_0x00ad:
        return r0;
    L_0x00ae:
        r2 = move-exception;
        throw r2;	 Catch:{ SQLiteFullException -> 0x00b0, SQLiteException -> 0x015d }
    L_0x00b0:
        r2 = move-exception;
        throw r2;	 Catch:{ SQLiteFullException -> 0x00b2, SQLiteException -> 0x015d }
    L_0x00b2:
        r2 = move-exception;
        r5 = com.whatsapp.App.z();	 Catch:{ all -> 0x00bb }
        com.whatsapp.util.p.a(r5);	 Catch:{ all -> 0x00bb }
        throw r2;	 Catch:{ all -> 0x00bb }
    L_0x00bb:
        r2 = move-exception;
        r6.close();	 Catch:{ SQLiteFullException -> 0x018c }
        r5 = r3.isOpen();	 Catch:{ SQLiteFullException -> 0x018c }
        if (r5 == 0) goto L_0x00c8;	 Catch:{ SQLiteFullException -> 0x018c }
    L_0x00c5:
        r3.close();	 Catch:{ SQLiteFullException -> 0x018c }
    L_0x00c8:
        throw r2;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c9, SQLiteException -> 0x00f3 }
    L_0x00c9:
        r2 = move-exception;
        r2 = r3;
    L_0x00cb:
        r3 = Y;	 Catch:{ all -> 0x01ad }
        r4 = 492; // 0x1ec float:6.9E-43 double:2.43E-321;	 Catch:{ all -> 0x01ad }
        r3 = r3[r4];	 Catch:{ all -> 0x01ad }
        com.whatsapp.util.Log.w(r3);	 Catch:{ all -> 0x01ad }
        if (r2 == 0) goto L_0x00df;
    L_0x00d6:
        r3 = r2.isOpen();	 Catch:{ SQLiteFullException -> 0x0190 }
        if (r3 == 0) goto L_0x00df;
    L_0x00dc:
        r2.close();	 Catch:{ SQLiteFullException -> 0x0192 }
    L_0x00df:
        if (r0 == 0) goto L_0x00ef;
    L_0x00e1:
        r0 = Y;	 Catch:{ SQLiteFullException -> 0x01a7 }
        r2 = 490; // 0x1ea float:6.87E-43 double:2.42E-321;	 Catch:{ SQLiteFullException -> 0x01a7 }
        r0 = r0[r2];	 Catch:{ SQLiteFullException -> 0x01a7 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ SQLiteFullException -> 0x01a7 }
        r0 = r11.a;	 Catch:{ SQLiteFullException -> 0x01a7 }
        com.whatsapp.a5f.b(r0);	 Catch:{ SQLiteFullException -> 0x01a7 }
    L_0x00ef:
        r0 = r1;
        goto L_0x00ad;
    L_0x00f1:
        r2 = move-exception;
        throw r2;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c9, SQLiteException -> 0x00f3 }
    L_0x00f3:
        r2 = move-exception;
    L_0x00f4:
        r5 = r2.toString();	 Catch:{ all -> 0x0112 }
        r6 = Y;	 Catch:{ all -> 0x0112 }
        r7 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;	 Catch:{ all -> 0x0112 }
        r6 = r6[r7];	 Catch:{ all -> 0x0112 }
        r5 = r5.contains(r6);	 Catch:{ all -> 0x0112 }
        if (r5 == 0) goto L_0x010f;	 Catch:{ all -> 0x0112 }
    L_0x0104:
        r5 = Y;	 Catch:{ all -> 0x0112 }
        r6 = 495; // 0x1ef float:6.94E-43 double:2.446E-321;	 Catch:{ all -> 0x0112 }
        r5 = r5[r6];	 Catch:{ all -> 0x0112 }
        com.whatsapp.util.Log.w(r5);	 Catch:{ all -> 0x0112 }
        if (r4 == 0) goto L_0x0194;
    L_0x010f:
        throw r2;	 Catch:{ SQLiteFullException -> 0x0110 }
    L_0x0110:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0112 }
    L_0x0112:
        r0 = move-exception;
    L_0x0113:
        if (r3 == 0) goto L_0x011e;
    L_0x0115:
        r1 = r3.isOpen();	 Catch:{ SQLiteFullException -> 0x01a5 }
        if (r1 == 0) goto L_0x011e;	 Catch:{ SQLiteFullException -> 0x01a5 }
    L_0x011b:
        r3.close();	 Catch:{ SQLiteFullException -> 0x01a5 }
    L_0x011e:
        throw r0;
    L_0x011f:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteFullException -> 0x0121 }
    L_0x0121:
        r0 = move-exception;
        throw r0;
    L_0x0123:
        r6.close();	 Catch:{ SQLiteFullException -> 0x015b }
        r2 = r3.isOpen();	 Catch:{ SQLiteFullException -> 0x015b }
        if (r2 == 0) goto L_0x01c0;	 Catch:{ SQLiteFullException -> 0x015b }
    L_0x012c:
        r3.close();	 Catch:{ SQLiteFullException -> 0x015b }
        r2 = r1;
    L_0x0130:
        r6 = new java.lang.StringBuilder;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c9, SQLiteException -> 0x00f3 }
        r6.<init>();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c9, SQLiteException -> 0x00f3 }
        r7 = Y;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c9, SQLiteException -> 0x00f3 }
        r8 = 496; // 0x1f0 float:6.95E-43 double:2.45E-321;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c9, SQLiteException -> 0x00f3 }
        r7 = r7[r8];	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c9, SQLiteException -> 0x00f3 }
        r6 = r6.append(r7);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c9, SQLiteException -> 0x00f3 }
        r8 = r5.b();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c9, SQLiteException -> 0x00f3 }
        r5 = r6.append(r8);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c9, SQLiteException -> 0x00f3 }
        r5 = r5.toString();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c9, SQLiteException -> 0x00f3 }
        com.whatsapp.util.Log.i(r5);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c9, SQLiteException -> 0x00f3 }
        if (r3 == 0) goto L_0x01ba;
    L_0x0150:
        r0 = r3.isOpen();	 Catch:{ SQLiteFullException -> 0x018e }
        if (r0 == 0) goto L_0x01ba;	 Catch:{ SQLiteFullException -> 0x018e }
    L_0x0156:
        r3.close();	 Catch:{ SQLiteFullException -> 0x018e }
        r0 = r2;
        goto L_0x00df;
    L_0x015b:
        r2 = move-exception;
        throw r2;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c9, SQLiteException -> 0x00f3 }
    L_0x015d:
        r2 = move-exception;
        r7 = r2.toString();	 Catch:{ all -> 0x00bb }
        r8 = Y;	 Catch:{ all -> 0x00bb }
        r9 = 499; // 0x1f3 float:6.99E-43 double:2.465E-321;	 Catch:{ all -> 0x00bb }
        r8 = r8[r9];	 Catch:{ all -> 0x00bb }
        r7 = r7.contains(r8);	 Catch:{ all -> 0x00bb }
        if (r7 == 0) goto L_0x0179;	 Catch:{ all -> 0x00bb }
    L_0x016e:
        r7 = Y;	 Catch:{ all -> 0x00bb }
        r8 = 494; // 0x1ee float:6.92E-43 double:2.44E-321;	 Catch:{ all -> 0x00bb }
        r7 = r7[r8];	 Catch:{ all -> 0x00bb }
        com.whatsapp.util.Log.w(r7);	 Catch:{ all -> 0x00bb }
        if (r4 == 0) goto L_0x017c;
    L_0x0179:
        throw r2;	 Catch:{ SQLiteFullException -> 0x017a }
    L_0x017a:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x00bb }
    L_0x017c:
        r6.close();	 Catch:{ SQLiteFullException -> 0x018a }
        r2 = r3.isOpen();	 Catch:{ SQLiteFullException -> 0x018a }
        if (r2 == 0) goto L_0x01bd;	 Catch:{ SQLiteFullException -> 0x018a }
    L_0x0185:
        r3.close();	 Catch:{ SQLiteFullException -> 0x018a }
        r2 = r0;
        goto L_0x0130;
    L_0x018a:
        r2 = move-exception;
        throw r2;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c9, SQLiteException -> 0x00f3 }
    L_0x018c:
        r2 = move-exception;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c9, SQLiteException -> 0x00f3 }
        throw r2;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c9, SQLiteException -> 0x00f3 }
    L_0x018e:
        r0 = move-exception;
        throw r0;
    L_0x0190:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteFullException -> 0x0192 }
    L_0x0192:
        r0 = move-exception;
        throw r0;
    L_0x0194:
        if (r3 == 0) goto L_0x00df;
    L_0x0196:
        r2 = r3.isOpen();	 Catch:{ SQLiteFullException -> 0x01a3 }
        if (r2 == 0) goto L_0x00df;
    L_0x019c:
        r3.close();	 Catch:{ SQLiteFullException -> 0x01a1 }
        goto L_0x00df;
    L_0x01a1:
        r0 = move-exception;
        throw r0;
    L_0x01a3:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteFullException -> 0x01a1 }
    L_0x01a5:
        r0 = move-exception;
        throw r0;
    L_0x01a7:
        r0 = move-exception;
        throw r0;
    L_0x01a9:
        r0 = move-exception;
        r3 = r2;
        goto L_0x0113;
    L_0x01ad:
        r0 = move-exception;
        r3 = r2;
        goto L_0x0113;
    L_0x01b1:
        r3 = move-exception;
        r10 = r3;
        r3 = r2;
        r2 = r10;
        goto L_0x00f4;
    L_0x01b7:
        r3 = move-exception;
        goto L_0x00cb;
    L_0x01ba:
        r0 = r2;
        goto L_0x00df;
    L_0x01bd:
        r2 = r0;
        goto L_0x0130;
    L_0x01c0:
        r2 = r1;
        goto L_0x0130;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.e():boolean");
    }

    public static String D(String str) {
        boolean z = l5.s;
        try {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            StringBuilder stringBuilder = new StringBuilder(str.length());
            BreakIterator a = l.a();
            a.setText(str);
            int first = a.first();
            int next = a.next();
            while (next != -1) {
                stringBuilder.append(o(str.substring(first, next))).append(' ');
                first = a.next();
                if (!z) {
                    int i = first;
                    first = next;
                    next = i;
                }
            }
            try {
                break;
                if (stringBuilder.length() > 0) {
                    stringBuilder.setLength(stringBuilder.length() - 1);
                }
                return stringBuilder.toString();
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.whatsapp.ol b(com.whatsapp.protocol.co r23, int r24) {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:com.whatsapp.ael.b(com.whatsapp.protocol.co, int):com.whatsapp.ol. bs: [B:139:0x0286, B:165:0x02bb, B:169:0x02c1, B:184:0x0305, B:204:0x0330, B:289:0x03b9, B:309:0x03d2, B:317:0x03ef, B:343:0x0440, B:363:0x0459, B:371:0x0476, B:401:0x04c9, B:421:0x04e2, B:429:0x04ff, B:442:0x0529, B:470:0x0582, B:490:0x059b, B:499:0x05ba, B:530:0x0613, B:550:0x062c, B:558:0x0649]
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
        r22 = this;
        r12 = com.whatsapp.l5.s;
        r7 = 0;
        r6 = 0;
        r10 = 0;
        r0 = r23;
        r4 = r0.k;
        r13 = r4.c;
        r9 = 0;
        r5 = 0;
        r4 = com.whatsapp.qm.i(r13);
        r0 = r23;
        r8 = r0.k;
        r8 = r8.c;
        r8 = com.whatsapp.l5.g(r8);
        if (r4 == 0) goto L_0x0049;
    L_0x001d:
        r0 = r23;	 Catch:{ SQLiteDatabaseCorruptException -> 0x02a8 }
        r11 = r0.t;	 Catch:{ SQLiteDatabaseCorruptException -> 0x02a8 }
        if (r11 != 0) goto L_0x0049;
    L_0x0023:
        r0 = r23;	 Catch:{ SQLiteDatabaseCorruptException -> 0x02aa }
        r11 = r0.k;	 Catch:{ SQLiteDatabaseCorruptException -> 0x02aa }
        r11 = r11.a;	 Catch:{ SQLiteDatabaseCorruptException -> 0x02aa }
        if (r11 != 0) goto L_0x0049;
    L_0x002b:
        r11 = new java.lang.StringBuilder;	 Catch:{ SQLiteDatabaseCorruptException -> 0x02ac }
        r11.<init>();	 Catch:{ SQLiteDatabaseCorruptException -> 0x02ac }
        r14 = Y;	 Catch:{ SQLiteDatabaseCorruptException -> 0x02ac }
        r15 = 738; // 0x2e2 float:1.034E-42 double:3.646E-321;	 Catch:{ SQLiteDatabaseCorruptException -> 0x02ac }
        r14 = r14[r15];	 Catch:{ SQLiteDatabaseCorruptException -> 0x02ac }
        r11 = r11.append(r14);	 Catch:{ SQLiteDatabaseCorruptException -> 0x02ac }
        r14 = com.whatsapp.util.Log.a(r23);	 Catch:{ SQLiteDatabaseCorruptException -> 0x02ac }
        r11 = r11.append(r14);	 Catch:{ SQLiteDatabaseCorruptException -> 0x02ac }
        r11 = r11.toString();	 Catch:{ SQLiteDatabaseCorruptException -> 0x02ac }
        com.whatsapp.util.Log.e(r11);	 Catch:{ SQLiteDatabaseCorruptException -> 0x02ac }
    L_0x0049:
        if (r4 != 0) goto L_0x004d;
    L_0x004b:
        if (r8 == 0) goto L_0x006c;
    L_0x004d:
        r0 = r23;
        r8 = r0.k;
        r8 = r8.c;
        r8 = com.whatsapp.qm.c(r8);
        r11 = r8.a();	 Catch:{ SQLiteDatabaseCorruptException -> 0x02ae }
        r0 = r23;	 Catch:{ SQLiteDatabaseCorruptException -> 0x02ae }
        r0.g = r11;	 Catch:{ SQLiteDatabaseCorruptException -> 0x02ae }
        r8 = r8.b();	 Catch:{ SQLiteDatabaseCorruptException -> 0x02ae }
        if (r4 == 0) goto L_0x02b0;
    L_0x0065:
        r4 = 1;
    L_0x0066:
        r4 = r8 - r4;
        r0 = r23;
        r0.L = r4;
    L_0x006c:
        r0 = r22;
        r14 = r0.a;
        monitor-enter(r14);
        r8 = 0;
        r0 = r22;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r4 = r0.a;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r5 = r4.getWritableDatabase();	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r22.O();	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r16 = java.lang.System.currentTimeMillis();	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r5.beginTransaction();	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r18 = java.lang.System.currentTimeMillis();	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r16 = r18 - r16;
        r18 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r4 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1));
        if (r4 <= 0) goto L_0x00b1;
    L_0x0091:
        r4 = new java.lang.StringBuilder;	 Catch:{ SQLiteDatabaseCorruptException -> 0x02b3, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r4.<init>();	 Catch:{ SQLiteDatabaseCorruptException -> 0x02b3, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r11 = Y;	 Catch:{ SQLiteDatabaseCorruptException -> 0x02b3, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r15 = 746; // 0x2ea float:1.045E-42 double:3.686E-321;	 Catch:{ SQLiteDatabaseCorruptException -> 0x02b3, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r11 = r11[r15];	 Catch:{ SQLiteDatabaseCorruptException -> 0x02b3, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r4 = r4.append(r11);	 Catch:{ SQLiteDatabaseCorruptException -> 0x02b3, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r18 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ SQLiteDatabaseCorruptException -> 0x02b3, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r16 = r16 / r18;	 Catch:{ SQLiteDatabaseCorruptException -> 0x02b3, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r0 = r16;	 Catch:{ SQLiteDatabaseCorruptException -> 0x02b3, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r4 = r4.append(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x02b3, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r4 = r4.toString();	 Catch:{ SQLiteDatabaseCorruptException -> 0x02b3, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        com.whatsapp.util.Log.w(r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x02b3, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
    L_0x00b1:
        r0 = r23;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r4 = r0.c;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r4 = com.whatsapp.App.b(r4);	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r0 = r23;	 Catch:{ SQLiteDatabaseCorruptException -> 0x02ca, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r11 = r0.k;	 Catch:{ SQLiteDatabaseCorruptException -> 0x02ca, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r11 = r11.a;	 Catch:{ SQLiteDatabaseCorruptException -> 0x02ca, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        if (r11 == 0) goto L_0x0155;
    L_0x00c1:
        if (r4 == 0) goto L_0x0155;
    L_0x00c3:
        r0 = r23;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r4 = r0.Q;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r4 = (com.whatsapp.MediaData) r4;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r11 = r4.file;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        if (r11 == 0) goto L_0x00cd;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
    L_0x00cd:
        r11 = r4.file;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r11 = com.whatsapp.dg.d(r11);	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        if (r11 == 0) goto L_0x0155;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
    L_0x00d5:
        r11 = 0;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r15 = r4.forward;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        if (r15 == 0) goto L_0x00dd;
    L_0x00da:
        r11 = 1;
        if (r12 == 0) goto L_0x00f5;
    L_0x00dd:
        r0 = r23;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0312, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r15 = r0.k;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0312, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r15 = r15.c;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0312, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r15 = com.whatsapp.l5.e(r15);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0312, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        if (r15 == 0) goto L_0x00f5;
    L_0x00e9:
        r0 = r23;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r11 = r0.t;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r15 = ",";	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r11 = r11.split(r15);	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r11 = r11.length;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
    L_0x00f5:
        if (r11 <= 0) goto L_0x0155;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
    L_0x00f7:
        r15 = r4.file;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r15 = r15.getAbsolutePath();	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r0 = r22;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r15 = r0.c(r15);	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        if (r15 != 0) goto L_0x0131;
    L_0x0105:
        r0 = r22;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0337, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r0 = r0.e;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0337, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r16 = r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0337, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r17 = 1;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0337, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r0 = r4.file;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0337, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r18 = r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0337, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r18 = r18.getAbsolutePath();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0337, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r16.bindString(r17, r18);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0337, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r0 = r22;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0337, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r0 = r0.e;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0337, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r16 = r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0337, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r17 = 2;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0337, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r0 = (long) r11;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0337, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r18 = r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0337, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r16.bindLong(r17, r18);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0337, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r0 = r22;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0337, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r0 = r0.e;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0337, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r16 = r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0337, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r16.execute();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0337, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        if (r12 == 0) goto L_0x0155;
    L_0x0131:
        r0 = r22;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0339, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r0 = r0.S;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0339, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r16 = r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0339, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r17 = 1;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0339, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r11 = r11 + r15;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0339, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r0 = (long) r11;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0339, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r18 = r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0339, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r16.bindLong(r17, r18);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0339, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r0 = r22;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0339, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r11 = r0.S;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0339, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r15 = 2;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0339, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r4 = r4.file;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0339, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r4 = r4.getAbsolutePath();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0339, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r11.bindString(r15, r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0339, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r0 = r22;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0339, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r4 = r0.S;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0339, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r4.execute();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0339, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
    L_0x0155:
        r0 = r23;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0348, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r4 = r0.k;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0348, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r4 = r4.c;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0348, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r4 = com.whatsapp.l5.e(r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0348, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        if (r4 == 0) goto L_0x0208;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0348, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
    L_0x0161:
        r0 = r23;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0348, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r4 = r0.k;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0348, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r4 = r4.a;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0348, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        if (r4 == 0) goto L_0x0208;
    L_0x0169:
        r0 = r23;	 Catch:{ SQLiteDatabaseCorruptException -> 0x034a, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r4 = r0.d;	 Catch:{ SQLiteDatabaseCorruptException -> 0x034a, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        if (r4 == 0) goto L_0x0176;
    L_0x016f:
        r0 = r23;	 Catch:{ SQLiteDatabaseCorruptException -> 0x034c, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r4 = r0.d;	 Catch:{ SQLiteDatabaseCorruptException -> 0x034c, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r11 = 2;
        if (r4 != r11) goto L_0x0208;
    L_0x0176:
        r4 = 1;
        r0 = r23;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r0.x = r4;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r0 = r23;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r4 = r0.t;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r11 = ",";	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r11 = r4.split(r11);	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r15 = r11.length;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r4 = 0;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
    L_0x0188:
        if (r4 >= r15) goto L_0x0208;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
    L_0x018a:
        r16 = r11[r4];	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r17 = new com.whatsapp.protocol.co;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r0 = r17;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r1 = r23;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r0.<init>(r1);	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r18 = new com.whatsapp.protocol.c3;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0353, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r19 = 1;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0353, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r0 = r23;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0353, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r0 = r0.k;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0353, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r20 = r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0353, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r0 = r20;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0353, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r0 = r0.b;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0353, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r20 = r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0353, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r0 = r18;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0353, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r1 = r16;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0353, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r2 = r19;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0353, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r3 = r20;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0353, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r0.<init>(r1, r2, r3);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0353, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r0 = r18;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0353, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r1 = r17;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0353, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r1.k = r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0353, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r0 = r22;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0353, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r0 = r0.l;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0353, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r18 = r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0353, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r0 = r18;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0353, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r1 = r16;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0353, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r18 = r0.get(r1);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0353, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        if (r18 != 0) goto L_0x01e3;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0353, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
    L_0x01c6:
        r18 = com.whatsapp.App.aZ();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0353, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        if (r18 == 0) goto L_0x01e3;
    L_0x01cc:
        r18 = com.whatsapp.App.as;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0355, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r0 = r18;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0355, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r1 = r16;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0355, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r18 = r0.j(r1);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0355, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        if (r18 == 0) goto L_0x01e3;
    L_0x01d8:
        r18 = com.whatsapp.qm.a(r13);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0357, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r0 = r22;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0357, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r1 = r18;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0357, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r0.d(r1);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0357, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
    L_0x01e3:
        r0 = r22;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r1 = r17;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r18 = r0.d(r1);	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r0 = r22;	 Catch:{ SQLiteDatabaseCorruptException -> 0x035b, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r0 = r0.l;	 Catch:{ SQLiteDatabaseCorruptException -> 0x035b, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r20 = r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x035b, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r0 = r20;	 Catch:{ SQLiteDatabaseCorruptException -> 0x035b, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r1 = r16;	 Catch:{ SQLiteDatabaseCorruptException -> 0x035b, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r16 = r0.containsKey(r1);	 Catch:{ SQLiteDatabaseCorruptException -> 0x035b, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        if (r16 == 0) goto L_0x0204;	 Catch:{ SQLiteDatabaseCorruptException -> 0x035b, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
    L_0x01fb:
        r0 = r22;	 Catch:{ SQLiteDatabaseCorruptException -> 0x035b, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r1 = r17;	 Catch:{ SQLiteDatabaseCorruptException -> 0x035b, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r2 = r18;	 Catch:{ SQLiteDatabaseCorruptException -> 0x035b, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r0.a(r5, r1, r2);	 Catch:{ SQLiteDatabaseCorruptException -> 0x035b, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
    L_0x0204:
        r4 = r4 + 1;
        if (r12 == 0) goto L_0x0188;
    L_0x0208:
        r0 = r22;	 Catch:{ SQLiteDatabaseCorruptException -> 0x035d, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r4 = r0.l;	 Catch:{ SQLiteDatabaseCorruptException -> 0x035d, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r4 = r4.get(r13);	 Catch:{ SQLiteDatabaseCorruptException -> 0x035d, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        if (r4 != 0) goto L_0x0229;	 Catch:{ SQLiteDatabaseCorruptException -> 0x035d, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
    L_0x0212:
        r4 = com.whatsapp.App.aZ();	 Catch:{ SQLiteDatabaseCorruptException -> 0x035d, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        if (r4 == 0) goto L_0x0229;
    L_0x0218:
        r4 = com.whatsapp.App.as;	 Catch:{ SQLiteDatabaseCorruptException -> 0x035f, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r4 = r4.j(r13);	 Catch:{ SQLiteDatabaseCorruptException -> 0x035f, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        if (r4 == 0) goto L_0x0229;
    L_0x0220:
        r4 = com.whatsapp.qm.a(r13);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0361, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r0 = r22;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0361, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r0.d(r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0361, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
    L_0x0229:
        r16 = r22.d(r23);	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r18 = -1;
        r4 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1));
        if (r4 != 0) goto L_0x023e;
    L_0x0233:
        r4 = Y;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0363, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r11 = 739; // 0x2e3 float:1.036E-42 double:3.65E-321;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0363, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        r4 = r4[r11];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0363, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        com.whatsapp.util.Log.e(r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0363, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        if (r12 == 0) goto L_0x068a;
    L_0x023e:
        r4 = i(r23);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0365, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        if (r4 == 0) goto L_0x0266;
    L_0x0244:
        r0 = r22;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r4 = r0.l;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r4 = r4.get(r13);	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r4 = (com.whatsapp.a5w) r4;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        if (r4 == 0) goto L_0x025a;
    L_0x0250:
        r11 = com.whatsapp.a5w.i(r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0367, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
        if (r11 == 0) goto L_0x025a;
    L_0x0256:
        r6 = k(r23);	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
    L_0x025a:
        if (r4 != 0) goto L_0x025d;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
    L_0x025c:
        r7 = 1;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
    L_0x025d:
        r0 = r22;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r1 = r23;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r2 = r16;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r0.a(r5, r1, r2);	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
    L_0x0266:
        r0 = r22;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r1 = r23;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r0.a(r5, r1);	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r5.setTransactionSuccessful();	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r0 = r22;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r4 = r0.p;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r0 = r23;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r11 = r0.k;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r0 = r23;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r4.put(r11, r0);	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        r4 = 1;
    L_0x027e:
        if (r5 == 0) goto L_0x0683;
    L_0x0280:
        r9 = r5.inTransaction();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0369 }
        if (r9 == 0) goto L_0x0683;
    L_0x0286:
        r5.endTransaction();	 Catch:{ SQLiteDatabaseCorruptException -> 0x036d, SQLiteException -> 0x037a }
        r5 = r4;
        r4 = r8;
        r8 = r7;
        r7 = r6;
        r6 = r10;
    L_0x028e:
        if (r4 == 0) goto L_0x064c;
    L_0x0290:
        if (r24 <= 0) goto L_0x064c;
    L_0x0292:
        r0 = r22;	 Catch:{ all -> 0x0334 }
        r4 = r0.a;	 Catch:{ all -> 0x0334 }
        r4.close();	 Catch:{ all -> 0x0334 }
        r22.P();	 Catch:{ all -> 0x0334 }
        r4 = r24 + -1;	 Catch:{ all -> 0x0334 }
        r0 = r22;	 Catch:{ all -> 0x0334 }
        r1 = r23;	 Catch:{ all -> 0x0334 }
        r4 = r0.b(r1, r4);	 Catch:{ all -> 0x0334 }
        monitor-exit(r14);	 Catch:{ all -> 0x0334 }
    L_0x02a7:
        return r4;
    L_0x02a8:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteDatabaseCorruptException -> 0x02aa }
    L_0x02aa:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteDatabaseCorruptException -> 0x02ac }
    L_0x02ac:
        r4 = move-exception;
        throw r4;
    L_0x02ae:
        r4 = move-exception;
        throw r4;
    L_0x02b0:
        r4 = 0;
        goto L_0x0066;
    L_0x02b3:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
    L_0x02b5:
        r4 = move-exception;
        com.whatsapp.util.Log.a(r4);	 Catch:{ all -> 0x0327 }
        if (r5 == 0) goto L_0x067c;
    L_0x02bb:
        r4 = r5.inTransaction();	 Catch:{ IOException -> 0x03f2 }
        if (r4 == 0) goto L_0x067c;
    L_0x02c1:
        r5.endTransaction();	 Catch:{ SQLiteDatabaseCorruptException -> 0x03f4, SQLiteException -> 0x0401 }
        r4 = r8;
        r5 = r9;
        r8 = r7;
        r7 = r6;
        r6 = r10;
        goto L_0x028e;
    L_0x02ca:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
    L_0x02cc:
        r4 = move-exception;
        r10 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0327 }
        r10.<init>();	 Catch:{ all -> 0x0327 }
        r11 = Y;	 Catch:{ all -> 0x0327 }
        r12 = 749; // 0x2ed float:1.05E-42 double:3.7E-321;	 Catch:{ all -> 0x0327 }
        r11 = r11[r12];	 Catch:{ all -> 0x0327 }
        r10 = r10.append(r11);	 Catch:{ all -> 0x0327 }
        r0 = r23;	 Catch:{ all -> 0x0327 }
        r11 = r0.k;	 Catch:{ all -> 0x0327 }
        r11 = r11.b;	 Catch:{ all -> 0x0327 }
        r10 = r10.append(r11);	 Catch:{ all -> 0x0327 }
        r11 = " ";	 Catch:{ all -> 0x0327 }
        r10 = r10.append(r11);	 Catch:{ all -> 0x0327 }
        r4 = r4.toString();	 Catch:{ all -> 0x0327 }
        r4 = r10.append(r4);	 Catch:{ all -> 0x0327 }
        r4 = r4.toString();	 Catch:{ all -> 0x0327 }
        com.whatsapp.util.Log.i(r4);	 Catch:{ all -> 0x0327 }
        r4 = 1;
        if (r5 == 0) goto L_0x0672;
    L_0x02ff:
        r10 = r5.inTransaction();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0479 }
        if (r10 == 0) goto L_0x0672;
    L_0x0305:
        r5.endTransaction();	 Catch:{ SQLiteDatabaseCorruptException -> 0x047d, SQLiteException -> 0x048a }
        r5 = r9;
        r21 = r8;
        r8 = r7;
        r7 = r6;
        r6 = r4;
        r4 = r21;
        goto L_0x028e;
    L_0x0312:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
    L_0x0314:
        r4 = move-exception;
        if (r24 != 0) goto L_0x0502;
    L_0x0317:
        com.whatsapp.util.Log.a(r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0325 }
        r6 = com.whatsapp.App.z();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0325 }
        r7 = 2131231111; // 0x7f080187 float:1.8078294E38 double:1.0529680753E-314;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0325 }
        com.whatsapp.util.p.a(r6, r7);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0325 }
        throw r4;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0325 }
    L_0x0325:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x0327 }
    L_0x0327:
        r4 = move-exception;
        if (r5 == 0) goto L_0x0333;
    L_0x032a:
        r6 = r5.inTransaction();	 Catch:{ SQLiteDatabaseCorruptException -> 0x05c3 }
        if (r6 == 0) goto L_0x0333;
    L_0x0330:
        r5.endTransaction();	 Catch:{ SQLiteDatabaseCorruptException -> 0x05c7, SQLiteException -> 0x05d4 }
    L_0x0333:
        throw r4;	 Catch:{ all -> 0x0334 }
    L_0x0334:
        r4 = move-exception;	 Catch:{ all -> 0x0334 }
        monitor-exit(r14);	 Catch:{ all -> 0x0334 }
        throw r4;
    L_0x0337:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0339, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
    L_0x0339:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
    L_0x033b:
        r4 = move-exception;
        com.whatsapp.util.Log.a(r4);	 Catch:{ all -> 0x0327 }
        r22.r();	 Catch:{ all -> 0x0327 }
        r6 = new java.lang.AssertionError;	 Catch:{ all -> 0x0327 }
        r6.<init>(r4);	 Catch:{ all -> 0x0327 }
        throw r6;	 Catch:{ all -> 0x0327 }
    L_0x0348:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteDatabaseCorruptException -> 0x034a, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
    L_0x034a:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteDatabaseCorruptException -> 0x034c, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
    L_0x034c:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
    L_0x034e:
        r4 = move-exception;
    L_0x034f:
        com.whatsapp.util.Log.a(r4);	 Catch:{ all -> 0x0327 }
        throw r4;	 Catch:{ all -> 0x0327 }
    L_0x0353:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0355, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
    L_0x0355:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0357, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
    L_0x0357:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
    L_0x0359:
        r4 = move-exception;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        goto L_0x034f;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
    L_0x035b:
        r4 = move-exception;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        throw r4;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
    L_0x035d:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteDatabaseCorruptException -> 0x035f, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
    L_0x035f:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0361, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
    L_0x0361:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
    L_0x0363:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0365, IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, RuntimeException -> 0x034e, Error -> 0x0359 }
    L_0x0365:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
    L_0x0367:
        r4 = move-exception;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
        throw r4;	 Catch:{ IOException -> 0x02b5, SQLiteConstraintException -> 0x02cc, SQLiteDiskIOException -> 0x0314, SQLiteDatabaseCorruptException -> 0x033b, RuntimeException -> 0x034e, Error -> 0x0359 }
    L_0x0369:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x036b }
    L_0x036b:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x0334 }
    L_0x036d:
        r4 = move-exception;	 Catch:{ all -> 0x0334 }
        com.whatsapp.util.Log.a(r4);	 Catch:{ all -> 0x0334 }
        r22.r();	 Catch:{ all -> 0x0334 }
        r5 = new java.lang.AssertionError;	 Catch:{ all -> 0x0334 }
        r5.<init>(r4);	 Catch:{ all -> 0x0334 }
        throw r5;	 Catch:{ all -> 0x0334 }
    L_0x037a:
        r4 = move-exception;
        r5 = new java.lang.StringBuilder;	 Catch:{ SQLiteDatabaseCorruptException -> 0x03bc }
        r5.<init>();	 Catch:{ SQLiteDatabaseCorruptException -> 0x03bc }
        r6 = Y;	 Catch:{ SQLiteDatabaseCorruptException -> 0x03bc }
        r7 = 740; // 0x2e4 float:1.037E-42 double:3.656E-321;	 Catch:{ SQLiteDatabaseCorruptException -> 0x03bc }
        r6 = r6[r7];	 Catch:{ SQLiteDatabaseCorruptException -> 0x03bc }
        r5 = r5.append(r6);	 Catch:{ SQLiteDatabaseCorruptException -> 0x03bc }
        r0 = r24;	 Catch:{ SQLiteDatabaseCorruptException -> 0x03bc }
        r5 = r5.append(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x03bc }
        r5 = r5.toString();	 Catch:{ SQLiteDatabaseCorruptException -> 0x03bc }
        com.whatsapp.util.Log.b(r5, r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x03bc }
        r5 = r4 instanceof android.database.sqlite.SQLiteConstraintException;	 Catch:{ SQLiteDatabaseCorruptException -> 0x03bc }
        if (r5 != 0) goto L_0x03b1;	 Catch:{ SQLiteDatabaseCorruptException -> 0x03bc }
    L_0x039b:
        r5 = r4.getMessage();	 Catch:{ SQLiteDatabaseCorruptException -> 0x03bc }
        if (r5 == 0) goto L_0x03ef;
    L_0x03a1:
        r5 = r4.getMessage();	 Catch:{ SQLiteDatabaseCorruptException -> 0x03be }
        r6 = Y;	 Catch:{ SQLiteDatabaseCorruptException -> 0x03be }
        r7 = 745; // 0x2e9 float:1.044E-42 double:3.68E-321;	 Catch:{ SQLiteDatabaseCorruptException -> 0x03be }
        r6 = r6[r7];	 Catch:{ SQLiteDatabaseCorruptException -> 0x03be }
        r5 = r5.contains(r6);	 Catch:{ SQLiteDatabaseCorruptException -> 0x03be }
        if (r5 == 0) goto L_0x03ef;
    L_0x03b1:
        if (r24 == 0) goto L_0x03b9;
    L_0x03b3:
        r5 = r22.I();	 Catch:{ SQLiteDatabaseCorruptException -> 0x03c2 }
        if (r5 != 0) goto L_0x03c4;
    L_0x03b9:
        throw r4;	 Catch:{ SQLiteDatabaseCorruptException -> 0x03ba }
    L_0x03ba:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x0334 }
    L_0x03bc:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteDatabaseCorruptException -> 0x03be }
    L_0x03be:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteDatabaseCorruptException -> 0x03c0 }
    L_0x03c0:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteDatabaseCorruptException -> 0x03c2 }
    L_0x03c2:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteDatabaseCorruptException -> 0x03ba }
    L_0x03c4:
        r4 = Y;	 Catch:{ all -> 0x0334 }
        r5 = 734; // 0x2de float:1.029E-42 double:3.626E-321;	 Catch:{ all -> 0x0334 }
        r4 = r4[r5];	 Catch:{ all -> 0x0334 }
        r6 = 0;	 Catch:{ all -> 0x0334 }
        r0 = r22;	 Catch:{ all -> 0x0334 }
        r0.d(r4, r6);	 Catch:{ all -> 0x0334 }
        r4 = 0;
        r0 = r22;	 Catch:{ Exception -> 0x03e0 }
        r1 = r23;	 Catch:{ Exception -> 0x03e0 }
        r4 = r0.b(r1, r4);	 Catch:{ Exception -> 0x03e0 }
        r22.A();	 Catch:{ Exception -> 0x03e0 }
        monitor-exit(r14);	 Catch:{ all -> 0x0334 }
        goto L_0x02a7;	 Catch:{ all -> 0x0334 }
    L_0x03e0:
        r4 = move-exception;	 Catch:{ all -> 0x0334 }
        r5 = Y;	 Catch:{ all -> 0x0334 }
        r6 = 737; // 0x2e1 float:1.033E-42 double:3.64E-321;	 Catch:{ all -> 0x0334 }
        r5 = r5[r6];	 Catch:{ all -> 0x0334 }
        r6 = 1;	 Catch:{ all -> 0x0334 }
        r0 = r22;	 Catch:{ all -> 0x0334 }
        r0.d(r5, r6);	 Catch:{ all -> 0x0334 }
        throw r4;	 Catch:{ all -> 0x0334 }
    L_0x03ef:
        throw r4;	 Catch:{ SQLiteDatabaseCorruptException -> 0x03f0 }
    L_0x03f0:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x0334 }
    L_0x03f2:
        r4 = move-exception;	 Catch:{ all -> 0x0334 }
        throw r4;	 Catch:{ all -> 0x0334 }
    L_0x03f4:
        r4 = move-exception;	 Catch:{ all -> 0x0334 }
        com.whatsapp.util.Log.a(r4);	 Catch:{ all -> 0x0334 }
        r22.r();	 Catch:{ all -> 0x0334 }
        r5 = new java.lang.AssertionError;	 Catch:{ all -> 0x0334 }
        r5.<init>(r4);	 Catch:{ all -> 0x0334 }
        throw r5;	 Catch:{ all -> 0x0334 }
    L_0x0401:
        r4 = move-exception;
        r5 = new java.lang.StringBuilder;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0443 }
        r5.<init>();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0443 }
        r6 = Y;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0443 }
        r7 = 758; // 0x2f6 float:1.062E-42 double:3.745E-321;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0443 }
        r6 = r6[r7];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0443 }
        r5 = r5.append(r6);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0443 }
        r0 = r24;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0443 }
        r5 = r5.append(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0443 }
        r5 = r5.toString();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0443 }
        com.whatsapp.util.Log.b(r5, r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0443 }
        r5 = r4 instanceof android.database.sqlite.SQLiteConstraintException;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0443 }
        if (r5 != 0) goto L_0x0438;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0443 }
    L_0x0422:
        r5 = r4.getMessage();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0443 }
        if (r5 == 0) goto L_0x0476;
    L_0x0428:
        r5 = r4.getMessage();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0445 }
        r6 = Y;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0445 }
        r7 = 752; // 0x2f0 float:1.054E-42 double:3.715E-321;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0445 }
        r6 = r6[r7];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0445 }
        r5 = r5.contains(r6);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0445 }
        if (r5 == 0) goto L_0x0476;
    L_0x0438:
        if (r24 == 0) goto L_0x0440;
    L_0x043a:
        r5 = r22.I();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0449 }
        if (r5 != 0) goto L_0x044b;
    L_0x0440:
        throw r4;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0441 }
    L_0x0441:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x0334 }
    L_0x0443:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0445 }
    L_0x0445:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0447 }
    L_0x0447:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0449 }
    L_0x0449:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0441 }
    L_0x044b:
        r4 = Y;	 Catch:{ all -> 0x0334 }
        r5 = 751; // 0x2ef float:1.052E-42 double:3.71E-321;	 Catch:{ all -> 0x0334 }
        r4 = r4[r5];	 Catch:{ all -> 0x0334 }
        r6 = 0;	 Catch:{ all -> 0x0334 }
        r0 = r22;	 Catch:{ all -> 0x0334 }
        r0.d(r4, r6);	 Catch:{ all -> 0x0334 }
        r4 = 0;
        r0 = r22;	 Catch:{ Exception -> 0x0467 }
        r1 = r23;	 Catch:{ Exception -> 0x0467 }
        r4 = r0.b(r1, r4);	 Catch:{ Exception -> 0x0467 }
        r22.A();	 Catch:{ Exception -> 0x0467 }
        monitor-exit(r14);	 Catch:{ all -> 0x0334 }
        goto L_0x02a7;	 Catch:{ all -> 0x0334 }
    L_0x0467:
        r4 = move-exception;	 Catch:{ all -> 0x0334 }
        r5 = Y;	 Catch:{ all -> 0x0334 }
        r6 = 756; // 0x2f4 float:1.06E-42 double:3.735E-321;	 Catch:{ all -> 0x0334 }
        r5 = r5[r6];	 Catch:{ all -> 0x0334 }
        r6 = 1;	 Catch:{ all -> 0x0334 }
        r0 = r22;	 Catch:{ all -> 0x0334 }
        r0.d(r5, r6);	 Catch:{ all -> 0x0334 }
        throw r4;	 Catch:{ all -> 0x0334 }
    L_0x0476:
        throw r4;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0477 }
    L_0x0477:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x0334 }
    L_0x0479:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x047b }
    L_0x047b:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x0334 }
    L_0x047d:
        r4 = move-exception;	 Catch:{ all -> 0x0334 }
        com.whatsapp.util.Log.a(r4);	 Catch:{ all -> 0x0334 }
        r22.r();	 Catch:{ all -> 0x0334 }
        r5 = new java.lang.AssertionError;	 Catch:{ all -> 0x0334 }
        r5.<init>(r4);	 Catch:{ all -> 0x0334 }
        throw r5;	 Catch:{ all -> 0x0334 }
    L_0x048a:
        r4 = move-exception;
        r5 = new java.lang.StringBuilder;	 Catch:{ SQLiteDatabaseCorruptException -> 0x04cc }
        r5.<init>();	 Catch:{ SQLiteDatabaseCorruptException -> 0x04cc }
        r6 = Y;	 Catch:{ SQLiteDatabaseCorruptException -> 0x04cc }
        r7 = 742; // 0x2e6 float:1.04E-42 double:3.666E-321;	 Catch:{ SQLiteDatabaseCorruptException -> 0x04cc }
        r6 = r6[r7];	 Catch:{ SQLiteDatabaseCorruptException -> 0x04cc }
        r5 = r5.append(r6);	 Catch:{ SQLiteDatabaseCorruptException -> 0x04cc }
        r0 = r24;	 Catch:{ SQLiteDatabaseCorruptException -> 0x04cc }
        r5 = r5.append(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x04cc }
        r5 = r5.toString();	 Catch:{ SQLiteDatabaseCorruptException -> 0x04cc }
        com.whatsapp.util.Log.b(r5, r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x04cc }
        r5 = r4 instanceof android.database.sqlite.SQLiteConstraintException;	 Catch:{ SQLiteDatabaseCorruptException -> 0x04cc }
        if (r5 != 0) goto L_0x04c1;	 Catch:{ SQLiteDatabaseCorruptException -> 0x04cc }
    L_0x04ab:
        r5 = r4.getMessage();	 Catch:{ SQLiteDatabaseCorruptException -> 0x04cc }
        if (r5 == 0) goto L_0x04ff;
    L_0x04b1:
        r5 = r4.getMessage();	 Catch:{ SQLiteDatabaseCorruptException -> 0x04ce }
        r6 = Y;	 Catch:{ SQLiteDatabaseCorruptException -> 0x04ce }
        r7 = 753; // 0x2f1 float:1.055E-42 double:3.72E-321;	 Catch:{ SQLiteDatabaseCorruptException -> 0x04ce }
        r6 = r6[r7];	 Catch:{ SQLiteDatabaseCorruptException -> 0x04ce }
        r5 = r5.contains(r6);	 Catch:{ SQLiteDatabaseCorruptException -> 0x04ce }
        if (r5 == 0) goto L_0x04ff;
    L_0x04c1:
        if (r24 == 0) goto L_0x04c9;
    L_0x04c3:
        r5 = r22.I();	 Catch:{ SQLiteDatabaseCorruptException -> 0x04d2 }
        if (r5 != 0) goto L_0x04d4;
    L_0x04c9:
        throw r4;	 Catch:{ SQLiteDatabaseCorruptException -> 0x04ca }
    L_0x04ca:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x0334 }
    L_0x04cc:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteDatabaseCorruptException -> 0x04ce }
    L_0x04ce:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteDatabaseCorruptException -> 0x04d0 }
    L_0x04d0:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteDatabaseCorruptException -> 0x04d2 }
    L_0x04d2:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteDatabaseCorruptException -> 0x04ca }
    L_0x04d4:
        r4 = Y;	 Catch:{ all -> 0x0334 }
        r5 = 741; // 0x2e5 float:1.038E-42 double:3.66E-321;	 Catch:{ all -> 0x0334 }
        r4 = r4[r5];	 Catch:{ all -> 0x0334 }
        r6 = 0;	 Catch:{ all -> 0x0334 }
        r0 = r22;	 Catch:{ all -> 0x0334 }
        r0.d(r4, r6);	 Catch:{ all -> 0x0334 }
        r4 = 0;
        r0 = r22;	 Catch:{ Exception -> 0x04f0 }
        r1 = r23;	 Catch:{ Exception -> 0x04f0 }
        r4 = r0.b(r1, r4);	 Catch:{ Exception -> 0x04f0 }
        r22.A();	 Catch:{ Exception -> 0x04f0 }
        monitor-exit(r14);	 Catch:{ all -> 0x0334 }
        goto L_0x02a7;	 Catch:{ all -> 0x0334 }
    L_0x04f0:
        r4 = move-exception;	 Catch:{ all -> 0x0334 }
        r5 = Y;	 Catch:{ all -> 0x0334 }
        r6 = 754; // 0x2f2 float:1.057E-42 double:3.725E-321;	 Catch:{ all -> 0x0334 }
        r5 = r5[r6];	 Catch:{ all -> 0x0334 }
        r6 = 1;	 Catch:{ all -> 0x0334 }
        r0 = r22;	 Catch:{ all -> 0x0334 }
        r0.d(r5, r6);	 Catch:{ all -> 0x0334 }
        throw r4;	 Catch:{ all -> 0x0334 }
    L_0x04ff:
        throw r4;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0500 }
    L_0x0500:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x0334 }
    L_0x0502:
        r8 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0327 }
        r8.<init>();	 Catch:{ all -> 0x0327 }
        r11 = Y;	 Catch:{ all -> 0x0327 }
        r12 = 747; // 0x2eb float:1.047E-42 double:3.69E-321;	 Catch:{ all -> 0x0327 }
        r11 = r11[r12];	 Catch:{ all -> 0x0327 }
        r8 = r8.append(r11);	 Catch:{ all -> 0x0327 }
        r4 = r4.toString();	 Catch:{ all -> 0x0327 }
        r4 = r8.append(r4);	 Catch:{ all -> 0x0327 }
        r4 = r4.toString();	 Catch:{ all -> 0x0327 }
        com.whatsapp.util.Log.w(r4);	 Catch:{ all -> 0x0327 }
        r4 = 1;
        if (r5 == 0) goto L_0x066c;
    L_0x0523:
        r8 = r5.inTransaction();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0532 }
        if (r8 == 0) goto L_0x066c;
    L_0x0529:
        r5.endTransaction();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0536, SQLiteException -> 0x0543 }
        r5 = r9;
        r8 = r7;
        r7 = r6;
        r6 = r10;
        goto L_0x028e;
    L_0x0532:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0534 }
    L_0x0534:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x0334 }
    L_0x0536:
        r4 = move-exception;	 Catch:{ all -> 0x0334 }
        com.whatsapp.util.Log.a(r4);	 Catch:{ all -> 0x0334 }
        r22.r();	 Catch:{ all -> 0x0334 }
        r5 = new java.lang.AssertionError;	 Catch:{ all -> 0x0334 }
        r5.<init>(r4);	 Catch:{ all -> 0x0334 }
        throw r5;	 Catch:{ all -> 0x0334 }
    L_0x0543:
        r5 = move-exception;
        r8 = new java.lang.StringBuilder;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0585 }
        r8.<init>();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0585 }
        r11 = Y;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0585 }
        r12 = 743; // 0x2e7 float:1.041E-42 double:3.67E-321;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0585 }
        r11 = r11[r12];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0585 }
        r8 = r8.append(r11);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0585 }
        r0 = r24;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0585 }
        r8 = r8.append(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0585 }
        r8 = r8.toString();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0585 }
        com.whatsapp.util.Log.b(r8, r5);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0585 }
        r8 = r5 instanceof android.database.sqlite.SQLiteConstraintException;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0585 }
        if (r8 != 0) goto L_0x057a;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0585 }
    L_0x0564:
        r8 = r5.getMessage();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0585 }
        if (r8 == 0) goto L_0x05b8;
    L_0x056a:
        r8 = r5.getMessage();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0587 }
        r11 = Y;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0587 }
        r12 = 748; // 0x2ec float:1.048E-42 double:3.696E-321;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0587 }
        r11 = r11[r12];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0587 }
        r8 = r8.contains(r11);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0587 }
        if (r8 == 0) goto L_0x05b8;
    L_0x057a:
        if (r24 == 0) goto L_0x0582;
    L_0x057c:
        r4 = r22.I();	 Catch:{ SQLiteDatabaseCorruptException -> 0x058b }
        if (r4 != 0) goto L_0x058d;
    L_0x0582:
        throw r5;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0583 }
    L_0x0583:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x0334 }
    L_0x0585:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0587 }
    L_0x0587:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0589 }
    L_0x0589:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteDatabaseCorruptException -> 0x058b }
    L_0x058b:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0583 }
    L_0x058d:
        r4 = Y;	 Catch:{ all -> 0x0334 }
        r5 = 735; // 0x2df float:1.03E-42 double:3.63E-321;	 Catch:{ all -> 0x0334 }
        r4 = r4[r5];	 Catch:{ all -> 0x0334 }
        r6 = 0;	 Catch:{ all -> 0x0334 }
        r0 = r22;	 Catch:{ all -> 0x0334 }
        r0.d(r4, r6);	 Catch:{ all -> 0x0334 }
        r4 = 0;
        r0 = r22;	 Catch:{ Exception -> 0x05a9 }
        r1 = r23;	 Catch:{ Exception -> 0x05a9 }
        r4 = r0.b(r1, r4);	 Catch:{ Exception -> 0x05a9 }
        r22.A();	 Catch:{ Exception -> 0x05a9 }
        monitor-exit(r14);	 Catch:{ all -> 0x0334 }
        goto L_0x02a7;	 Catch:{ all -> 0x0334 }
    L_0x05a9:
        r4 = move-exception;	 Catch:{ all -> 0x0334 }
        r5 = Y;	 Catch:{ all -> 0x0334 }
        r6 = 736; // 0x2e0 float:1.031E-42 double:3.636E-321;	 Catch:{ all -> 0x0334 }
        r5 = r5[r6];	 Catch:{ all -> 0x0334 }
        r6 = 1;	 Catch:{ all -> 0x0334 }
        r0 = r22;	 Catch:{ all -> 0x0334 }
        r0.d(r5, r6);	 Catch:{ all -> 0x0334 }
        throw r4;	 Catch:{ all -> 0x0334 }
    L_0x05b8:
        if (r24 != 0) goto L_0x05bd;
    L_0x05ba:
        throw r5;	 Catch:{ SQLiteDatabaseCorruptException -> 0x05bb }
    L_0x05bb:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x0334 }
    L_0x05bd:
        r5 = r9;
        r8 = r7;
        r7 = r6;
        r6 = r10;
        goto L_0x028e;
    L_0x05c3:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x05c5 }
    L_0x05c5:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x0334 }
    L_0x05c7:
        r4 = move-exception;	 Catch:{ all -> 0x0334 }
        com.whatsapp.util.Log.a(r4);	 Catch:{ all -> 0x0334 }
        r22.r();	 Catch:{ all -> 0x0334 }
        r5 = new java.lang.AssertionError;	 Catch:{ all -> 0x0334 }
        r5.<init>(r4);	 Catch:{ all -> 0x0334 }
        throw r5;	 Catch:{ all -> 0x0334 }
    L_0x05d4:
        r4 = move-exception;
        r5 = new java.lang.StringBuilder;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0616 }
        r5.<init>();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0616 }
        r6 = Y;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0616 }
        r7 = 744; // 0x2e8 float:1.043E-42 double:3.676E-321;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0616 }
        r6 = r6[r7];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0616 }
        r5 = r5.append(r6);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0616 }
        r0 = r24;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0616 }
        r5 = r5.append(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0616 }
        r5 = r5.toString();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0616 }
        com.whatsapp.util.Log.b(r5, r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0616 }
        r5 = r4 instanceof android.database.sqlite.SQLiteConstraintException;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0616 }
        if (r5 != 0) goto L_0x060b;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0616 }
    L_0x05f5:
        r5 = r4.getMessage();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0616 }
        if (r5 == 0) goto L_0x0649;
    L_0x05fb:
        r5 = r4.getMessage();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0618 }
        r6 = Y;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0618 }
        r7 = 757; // 0x2f5 float:1.061E-42 double:3.74E-321;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0618 }
        r6 = r6[r7];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0618 }
        r5 = r5.contains(r6);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0618 }
        if (r5 == 0) goto L_0x0649;
    L_0x060b:
        if (r24 == 0) goto L_0x0613;
    L_0x060d:
        r5 = r22.I();	 Catch:{ SQLiteDatabaseCorruptException -> 0x061c }
        if (r5 != 0) goto L_0x061e;
    L_0x0613:
        throw r4;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0614 }
    L_0x0614:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x0334 }
    L_0x0616:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0618 }
    L_0x0618:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteDatabaseCorruptException -> 0x061a }
    L_0x061a:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteDatabaseCorruptException -> 0x061c }
    L_0x061c:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0614 }
    L_0x061e:
        r4 = Y;	 Catch:{ all -> 0x0334 }
        r5 = 750; // 0x2ee float:1.051E-42 double:3.705E-321;	 Catch:{ all -> 0x0334 }
        r4 = r4[r5];	 Catch:{ all -> 0x0334 }
        r6 = 0;	 Catch:{ all -> 0x0334 }
        r0 = r22;	 Catch:{ all -> 0x0334 }
        r0.d(r4, r6);	 Catch:{ all -> 0x0334 }
        r4 = 0;
        r0 = r22;	 Catch:{ Exception -> 0x063a }
        r1 = r23;	 Catch:{ Exception -> 0x063a }
        r4 = r0.b(r1, r4);	 Catch:{ Exception -> 0x063a }
        r22.A();	 Catch:{ Exception -> 0x063a }
        monitor-exit(r14);	 Catch:{ all -> 0x0334 }
        goto L_0x02a7;	 Catch:{ all -> 0x0334 }
    L_0x063a:
        r4 = move-exception;	 Catch:{ all -> 0x0334 }
        r5 = Y;	 Catch:{ all -> 0x0334 }
        r6 = 755; // 0x2f3 float:1.058E-42 double:3.73E-321;	 Catch:{ all -> 0x0334 }
        r5 = r5[r6];	 Catch:{ all -> 0x0334 }
        r6 = 1;	 Catch:{ all -> 0x0334 }
        r0 = r22;	 Catch:{ all -> 0x0334 }
        r0.d(r5, r6);	 Catch:{ all -> 0x0334 }
        throw r4;	 Catch:{ all -> 0x0334 }
    L_0x0649:
        throw r4;	 Catch:{ SQLiteDatabaseCorruptException -> 0x064a }
    L_0x064a:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x0334 }
    L_0x064c:
        monitor-exit(r14);	 Catch:{ all -> 0x0334 }
        r0 = r23;
        r4 = r0.j;
        if (r4 == 0) goto L_0x0662;
    L_0x0653:
        r0 = r22;
        r9 = r0.D;
        monitor-enter(r9);
        r0 = r22;	 Catch:{ all -> 0x0669 }
        r4 = r0.D;	 Catch:{ all -> 0x0669 }
        r0 = r23;	 Catch:{ all -> 0x0669 }
        r4.add(r0);	 Catch:{ all -> 0x0669 }
        monitor-exit(r9);	 Catch:{ all -> 0x0669 }
    L_0x0662:
        r4 = new com.whatsapp.ol;
        r4.<init>(r5, r8, r7, r6);
        goto L_0x02a7;
    L_0x0669:
        r4 = move-exception;
        monitor-exit(r9);	 Catch:{ all -> 0x0669 }
        throw r4;
    L_0x066c:
        r5 = r9;
        r8 = r7;
        r7 = r6;
        r6 = r10;
        goto L_0x028e;
    L_0x0672:
        r5 = r9;
        r21 = r8;
        r8 = r7;
        r7 = r6;
        r6 = r4;
        r4 = r21;
        goto L_0x028e;
    L_0x067c:
        r4 = r8;
        r5 = r9;
        r8 = r7;
        r7 = r6;
        r6 = r10;
        goto L_0x028e;
    L_0x0683:
        r5 = r4;
        r4 = r8;
        r8 = r7;
        r7 = r6;
        r6 = r10;
        goto L_0x028e;
    L_0x068a:
        r4 = r9;
        goto L_0x027e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.b(com.whatsapp.protocol.co, int):com.whatsapp.ol");
    }

    public java.util.ArrayList a(java.lang.String r9, int r10, com.whatsapp.a57 r11) {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:com.whatsapp.ael.a(java.lang.String, int, com.whatsapp.a57):java.util.ArrayList. bs: [B:43:0x00af, B:58:0x00e6]
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
        r8 = this;
        r1 = com.whatsapp.l5.s;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = Y;
        r3 = 197; // 0xc5 float:2.76E-43 double:9.73E-322;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r0 = r0.append(r9);
        r2 = Y;
        r3 = 193; // 0xc1 float:2.7E-43 double:9.54E-322;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r0 = r0.append(r10);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r2 = new com.whatsapp.util.ab;
        r2.<init>();
        r0 = Y;
        r3 = 195; // 0xc3 float:2.73E-43 double:9.63E-322;
        r0 = r0[r3];
        r2.b(r0);
        r3 = new java.util.ArrayList;
        r3.<init>();
        r4 = r8.a;
        monitor-enter(r4);
        r0 = r8.a;	 Catch:{ all -> 0x00ea }
        r0 = r0.getReadableDatabase();	 Catch:{ all -> 0x00ea }
        r5 = Y;	 Catch:{ all -> 0x00ea }
        r6 = 196; // 0xc4 float:2.75E-43 double:9.7E-322;	 Catch:{ all -> 0x00ea }
        r5 = r5[r6];	 Catch:{ all -> 0x00ea }
        r6 = 1;	 Catch:{ all -> 0x00ea }
        r6 = new java.lang.String[r6];	 Catch:{ all -> 0x00ea }
        r7 = 0;	 Catch:{ all -> 0x00ea }
        r6[r7] = r9;	 Catch:{ all -> 0x00ea }
        r5 = r0.rawQuery(r5, r6);	 Catch:{ all -> 0x00ea }
        if (r5 == 0) goto L_0x00a4;
    L_0x0058:
        r0 = r5.moveToNext();	 Catch:{ SQLiteDiskIOException -> 0x00d5 }
        if (r0 == 0) goto L_0x00ad;
    L_0x005e:
        if (r11 == 0) goto L_0x0066;
    L_0x0060:
        r0 = r11.a();	 Catch:{ SQLiteDiskIOException -> 0x00ed }
        if (r0 != 0) goto L_0x00ad;
    L_0x0066:
        r6 = r8.a(r5, r9);	 Catch:{ SQLiteDiskIOException -> 0x00d7 }
        r0 = r6.Q;	 Catch:{ SQLiteDiskIOException -> 0x00d7 }
        if (r0 == 0) goto L_0x00a2;	 Catch:{ SQLiteDiskIOException -> 0x00d7 }
    L_0x006e:
        r0 = r6.Q;	 Catch:{ SQLiteDiskIOException -> 0x00d7 }
        r0 = (com.whatsapp.MediaData) r0;	 Catch:{ SQLiteDiskIOException -> 0x00d7 }
        r7 = r6.k;	 Catch:{ SQLiteDiskIOException -> 0x00ef }
        r7 = r7.a;	 Catch:{ SQLiteDiskIOException -> 0x00ef }
        if (r7 != 0) goto L_0x007c;	 Catch:{ SQLiteDiskIOException -> 0x00ef }
    L_0x0078:
        r7 = r0.transferred;	 Catch:{ SQLiteDiskIOException -> 0x00ef }
        if (r7 == 0) goto L_0x00a2;
    L_0x007c:
        r7 = r0.file;	 Catch:{ SQLiteDiskIOException -> 0x00f1 }
        if (r7 == 0) goto L_0x00a2;
    L_0x0080:
        r0 = r0.file;	 Catch:{ SQLiteDiskIOException -> 0x00d7 }
        r0 = android.net.Uri.fromFile(r0);	 Catch:{ SQLiteDiskIOException -> 0x00d7 }
        r7 = new java.io.File;	 Catch:{ SQLiteDiskIOException -> 0x00d7 }
        r0 = r0.getPath();	 Catch:{ SQLiteDiskIOException -> 0x00d7 }
        r7.<init>(r0);	 Catch:{ SQLiteDiskIOException -> 0x00d7 }
        r0 = r7.exists();	 Catch:{ SQLiteDiskIOException -> 0x00f3 }
        if (r0 == 0) goto L_0x00a2;	 Catch:{ SQLiteDiskIOException -> 0x00f3 }
    L_0x0095:
        r3.add(r6);	 Catch:{ SQLiteDiskIOException -> 0x00f3 }
        if (r10 < 0) goto L_0x00a2;
    L_0x009a:
        r0 = r3.size();	 Catch:{ SQLiteDiskIOException -> 0x00f5 }
        if (r0 < r10) goto L_0x00a2;
    L_0x00a0:
        if (r1 == 0) goto L_0x00ad;
    L_0x00a2:
        if (r1 == 0) goto L_0x0058;
    L_0x00a4:
        r0 = Y;	 Catch:{ SQLiteDiskIOException -> 0x00d7 }
        r1 = 194; // 0xc2 float:2.72E-43 double:9.6E-322;	 Catch:{ SQLiteDiskIOException -> 0x00d7 }
        r0 = r0[r1];	 Catch:{ SQLiteDiskIOException -> 0x00d7 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ SQLiteDiskIOException -> 0x00d7 }
    L_0x00ad:
        if (r5 == 0) goto L_0x00b2;
    L_0x00af:
        r5.close();	 Catch:{ SQLiteDiskIOException -> 0x00fb }
    L_0x00b2:
        monitor-exit(r4);	 Catch:{ all -> 0x00ea }
        r2.b();
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = Y;
        r2 = 192; // 0xc0 float:2.69E-43 double:9.5E-322;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r3.size();
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        return r3;
    L_0x00d5:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x00d7 }
    L_0x00d7:
        r0 = move-exception;
        r1 = com.whatsapp.App.z();	 Catch:{ all -> 0x00e3 }
        r2 = 2131231111; // 0x7f080187 float:1.8078294E38 double:1.0529680753E-314;	 Catch:{ all -> 0x00e3 }
        com.whatsapp.util.p.a(r1, r2);	 Catch:{ all -> 0x00e3 }
        throw r0;	 Catch:{ all -> 0x00e3 }
    L_0x00e3:
        r0 = move-exception;
        if (r5 == 0) goto L_0x00e9;
    L_0x00e6:
        r5.close();	 Catch:{ SQLiteDiskIOException -> 0x00fd }
    L_0x00e9:
        throw r0;	 Catch:{ all -> 0x00ea }
    L_0x00ea:
        r0 = move-exception;	 Catch:{ all -> 0x00ea }
        monitor-exit(r4);	 Catch:{ all -> 0x00ea }
        throw r0;
    L_0x00ed:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x00d7 }
    L_0x00ef:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x00f1 }
    L_0x00f1:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x00d7 }
    L_0x00f3:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x00f5 }
    L_0x00f5:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x00f7 }
    L_0x00f7:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x00f9 }
    L_0x00f9:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x00d7 }
    L_0x00fb:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00ea }
    L_0x00fd:
        r0 = move-exception;	 Catch:{ all -> 0x00ea }
        throw r0;	 Catch:{ all -> 0x00ea }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.a(java.lang.String, int, com.whatsapp.a57):java.util.ArrayList");
    }

    public int a(Runnable runnable) {
        return this.t.a(runnable);
    }

    public void L(String str) {
        a(str, true);
    }

    public static boolean e(File file) {
        boolean z = false;
        try {
            if (file.exists()) {
                SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(file.getAbsolutePath(), null, 16);
                String stringForQuery = DatabaseUtils.stringForQuery(openDatabase, Y[673], null);
                openDatabase.close();
                Log.i(Y[672] + stringForQuery);
                z = Y[674].equalsIgnoreCase(stringForQuery);
            }
        } catch (Exception e) {
            Log.e(Y[671] + e.toString());
        }
        return z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean i(com.whatsapp.protocol.co r4) {
        /*
        r0 = r4.c;	 Catch:{ IllegalStateException -> 0x0015 }
        r1 = 8;
        if (r0 == r1) goto L_0x001b;
    L_0x0006:
        r0 = r4.d;	 Catch:{ IllegalStateException -> 0x0017 }
        r1 = 6;
        if (r0 != r1) goto L_0x0013;
    L_0x000b:
        r0 = r4.z;	 Catch:{ IllegalStateException -> 0x0019 }
        r2 = 19;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 == 0) goto L_0x001b;
    L_0x0013:
        r0 = 1;
    L_0x0014:
        return r0;
    L_0x0015:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0017 }
    L_0x0017:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0019 }
    L_0x0019:
        r0 = move-exception;
        throw r0;
    L_0x001b:
        r0 = 0;
        goto L_0x0014;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.i(com.whatsapp.protocol.co):boolean");
    }

    public boolean O(String str) {
        a5w com_whatsapp_a5w = (a5w) this.l.get(str);
        if (com_whatsapp_a5w == null) {
            return false;
        }
        try {
            if (a5w.j(com_whatsapp_a5w) == 1) {
                a5w.e(com_whatsapp_a5w, p(str));
            }
            try {
                if (a5w.j(com_whatsapp_a5w) == 1) {
                    return false;
                }
                try {
                    boolean z;
                    if (a5w.j(com_whatsapp_a5w) < a5w.k(com_whatsapp_a5w)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return z;
                } catch (IllegalStateException e) {
                    throw e;
                }
            } catch (IllegalStateException e2) {
                throw e2;
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    private long d(co coVar) {
        long j = 0;
        boolean z = l5.s;
        SQLiteStatement sQLiteStatement = this.w;
        try {
            long j2;
            sQLiteStatement.bindString(1, coVar.k.c);
            if (coVar.k.a) {
                j2 = 1;
            } else {
                j2 = 0;
            }
            try {
                sQLiteStatement.bindLong(2, j2);
                sQLiteStatement.bindString(3, coVar.k.b);
                sQLiteStatement.bindLong(4, (long) coVar.d);
                if (coVar.x) {
                    j = 2;
                }
                try {
                    sQLiteStatement.bindLong(5, j);
                    a(coVar, sQLiteStatement, 22, 6);
                    sQLiteStatement.bindLong(7, coVar.b);
                    a5f.a(8, coVar.q, sQLiteStatement);
                    a5f.a(9, coVar.n, sQLiteStatement);
                    sQLiteStatement.bindLong(10, (long) coVar.c);
                    sQLiteStatement.bindLong(11, coVar.z);
                    a5f.a(12, coVar.A, sQLiteStatement);
                    a5f.a(13, coVar.a, sQLiteStatement);
                    a5f.a(14, coVar.o, sQLiteStatement);
                    if (coVar.c == 9) {
                        j = (long) coVar.R;
                    } else {
                        j = (long) coVar.H;
                    }
                    sQLiteStatement.bindLong(15, j);
                    sQLiteStatement.bindLong(16, (long) coVar.r);
                    sQLiteStatement.bindDouble(17, coVar.m);
                    sQLiteStatement.bindDouble(18, coVar.l);
                    a5f.a(19, a(coVar.Q), sQLiteStatement);
                    a5f.a(20, coVar.t, sQLiteStatement);
                    sQLiteStatement.bindLong(21, System.currentTimeMillis());
                    a5f.a(23, coVar.g, sQLiteStatement);
                    sQLiteStatement.bindLong(24, (long) coVar.L);
                    j2 = sQLiteStatement.executeInsert();
                    try {
                        String D;
                        coVar.I = j2;
                        if (M && I()) {
                            Object c;
                            switch (coVar.c) {
                                case v.m /*0*/:
                                    c = coVar.c();
                                    if (!TextUtils.isEmpty(coVar.a)) {
                                        c = c + " " + coVar.a;
                                    }
                                    if (!TextUtils.isEmpty(coVar.A)) {
                                        c = c + " " + coVar.A;
                                    }
                                    if (!TextUtils.isEmpty(coVar.q)) {
                                        c = c + " " + coVar.q;
                                        break;
                                    }
                                    break;
                                case at.g /*1*/:
                                case at.o /*3*/:
                                case Y.l /*9*/:
                                    c = coVar.a + " " + ag.c(coVar.n);
                                    break;
                                case at.p /*4*/:
                                case at.m /*5*/:
                                    c = coVar.A;
                                    break;
                                default:
                                    c = null;
                                    break;
                            }
                            if (!TextUtils.isEmpty(c)) {
                                D = D(c);
                                ContentValues contentValues = new ContentValues(2);
                                contentValues.put(Y[566], Long.valueOf(j2));
                                contentValues.put(Y[560], D);
                                this.a.getWritableDatabase().insert(Y[564], null, contentValues);
                            }
                        }
                        if (d()) {
                            switch (coVar.c) {
                                case v.m /*0*/:
                                    D = coVar.c();
                                    break;
                                case at.g /*1*/:
                                case at.o /*3*/:
                                    D = coVar.a;
                                    break;
                                default:
                                    D = null;
                                    break;
                            }
                            ArrayList g = ac.g(D);
                            if (g != null) {
                                int i = 0;
                                while (i < g.size()) {
                                    ContentValues contentValues2 = new ContentValues(3);
                                    contentValues2.put(Y[561], Long.valueOf(j2));
                                    contentValues2.put(Y[563], coVar.k.c);
                                    contentValues2.put(Y[565], Integer.toString(i));
                                    this.a.getWritableDatabase().insert(Y[562], null, contentValues2);
                                    i++;
                                    if (z) {
                                    }
                                }
                            }
                        }
                        return j2;
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            } catch (IllegalStateException e22) {
                throw e22;
            }
        } catch (IllegalStateException e222) {
            throw e222;
        }
    }

    private String f(String str) {
        CharSequence trim = D(str).trim();
        try {
            if (TextUtils.isEmpty(trim)) {
                return trim;
            }
            int i;
            String trim2;
            if (trim.startsWith("\"")) {
                try {
                    if (trim.endsWith("\"")) {
                        try {
                            if (trim.length() > 2) {
                                i = 1;
                                if (i != 0) {
                                    trim = trim.substring(1, trim.length() - 1);
                                }
                                trim2 = q.matcher(trim).replaceAll(" ").trim();
                                if (!TextUtils.isEmpty(trim2)) {
                                    return trim2;
                                }
                                if (i != 0) {
                                    trim2 = "\"" + trim2 + "\"";
                                    if (!l5.s) {
                                        return trim2;
                                    }
                                }
                                return trim2 + "*";
                            }
                        } catch (IllegalStateException e) {
                            throw e;
                        }
                    }
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            }
            i = 0;
            if (i != 0) {
                trim = trim.substring(1, trim.length() - 1);
            }
            trim2 = q.matcher(trim).replaceAll(" ").trim();
            try {
                if (!TextUtils.isEmpty(trim2)) {
                    return trim2;
                }
                if (i != 0) {
                    trim2 = "\"" + trim2 + "\"";
                    if (l5.s) {
                        return trim2;
                    }
                }
                return trim2 + "*";
            } catch (IllegalStateException e22) {
                throw e22;
            }
        } catch (IllegalStateException e222) {
            throw e222;
        } catch (IllegalStateException e2222) {
            throw e2222;
        }
    }

    public void j() {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:com.whatsapp.ael.j():void. bs: [B:20:0x0047, B:29:0x004f, B:42:0x007b]
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
        r8 = this;
        r1 = 0;
        r0 = com.whatsapp.l5.s;
        r2 = Y;
        r3 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r2 = r2[r3];
        com.whatsapp.util.Log.i(r2);
        r4 = r8.a;
        monitor-enter(r4);
        r2 = Y;	 Catch:{ all -> 0x0073 }
        r3 = 198; // 0xc6 float:2.77E-43 double:9.8E-322;	 Catch:{ all -> 0x0073 }
        r2 = r2[r3];	 Catch:{ all -> 0x0073 }
        r3 = r8.a;	 Catch:{ SQLiteDiskIOException -> 0x004e }
        r3 = r3.getReadableDatabase();	 Catch:{ SQLiteDiskIOException -> 0x004e }
        r5 = 0;	 Catch:{ SQLiteDiskIOException -> 0x004e }
        r1 = r3.rawQuery(r2, r5);	 Catch:{ SQLiteDiskIOException -> 0x004e }
        if (r1 == 0) goto L_0x0045;
    L_0x0022:
        r2 = r1.moveToNext();	 Catch:{ SQLiteDiskIOException -> 0x004c }
        if (r2 == 0) goto L_0x0045;
    L_0x0028:
        r2 = 0;
        r5 = r1.getString(r2);	 Catch:{ SQLiteDiskIOException -> 0x004e }
        r2 = 1;	 Catch:{ SQLiteDiskIOException -> 0x004e }
        r6 = r1.getString(r2);	 Catch:{ SQLiteDiskIOException -> 0x004e }
        r2 = 0;	 Catch:{ SQLiteDiskIOException -> 0x004e }
        r7 = 2;	 Catch:{ SQLiteDiskIOException -> 0x004e }
        r7 = r1.isNull(r7);	 Catch:{ SQLiteDiskIOException -> 0x004e }
        if (r7 != 0) goto L_0x0040;	 Catch:{ SQLiteDiskIOException -> 0x004e }
    L_0x003b:
        r2 = 2;	 Catch:{ SQLiteDiskIOException -> 0x004e }
        r2 = r1.getLong(r2);	 Catch:{ SQLiteDiskIOException -> 0x004e }
    L_0x0040:
        com.whatsapp.qa.a(r5, r6, r2);	 Catch:{ SQLiteDiskIOException -> 0x004e }
        if (r0 == 0) goto L_0x0022;
    L_0x0045:
        if (r1 == 0) goto L_0x004a;
    L_0x0047:
        r1.close();	 Catch:{ SQLiteDiskIOException -> 0x0076 }
    L_0x004a:
        monitor-exit(r4);	 Catch:{ all -> 0x0073 }
        return;
    L_0x004c:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x004e }
    L_0x004e:
        r0 = move-exception;
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0078 }
        r2.<init>();	 Catch:{ all -> 0x0078 }
        r3 = Y;	 Catch:{ all -> 0x0078 }
        r5 = 199; // 0xc7 float:2.79E-43 double:9.83E-322;	 Catch:{ all -> 0x0078 }
        r3 = r3[r5];	 Catch:{ all -> 0x0078 }
        r2 = r2.append(r3);	 Catch:{ all -> 0x0078 }
        r0 = r0.toString();	 Catch:{ all -> 0x0078 }
        r0 = r2.append(r0);	 Catch:{ all -> 0x0078 }
        r0 = r0.toString();	 Catch:{ all -> 0x0078 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ all -> 0x0078 }
        if (r1 == 0) goto L_0x004a;
    L_0x006f:
        r1.close();	 Catch:{ all -> 0x0073 }
        goto L_0x004a;	 Catch:{ all -> 0x0073 }
    L_0x0073:
        r0 = move-exception;	 Catch:{ all -> 0x0073 }
        monitor-exit(r4);	 Catch:{ all -> 0x0073 }
        throw r0;
    L_0x0076:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0073 }
    L_0x0078:
        r0 = move-exception;
        if (r1 == 0) goto L_0x007e;
    L_0x007b:
        r1.close();	 Catch:{ SQLiteDiskIOException -> 0x007f }
    L_0x007e:
        throw r0;	 Catch:{ all -> 0x0073 }
    L_0x007f:
        r0 = move-exception;	 Catch:{ all -> 0x0073 }
        throw r0;	 Catch:{ all -> 0x0073 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.j():void");
    }

    public ArrayList a(String str, int i, int i2) {
        try {
            if (M) {
                if (I()) {
                    return b(str, i, i2);
                }
            }
            return new ArrayList();
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public ArrayList G() {
        boolean z = l5.s;
        ab abVar = new ab();
        abVar.b(Y[384]);
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = this.a.getReadableDatabase().rawQuery(Y[382], null);
        if (rawQuery != null) {
            int columnIndex = rawQuery.getColumnIndex(Y[388]);
            while (rawQuery.moveToNext()) {
                try {
                    String string = rawQuery.getString(columnIndex);
                    if (string == null) {
                        Log.w(Y[381]);
                        if (!z) {
                            continue;
                        }
                    }
                    co a = a(rawQuery, string);
                    Log.i(Y[386] + a.k.b + " " + a.c);
                    arrayList.add(a);
                    if (z) {
                        break;
                    }
                } catch (IllegalStateException e) {
                    throw e;
                } catch (SQLiteDatabaseCorruptException e2) {
                    r();
                    throw new AssertionError(e2);
                } catch (SQLiteFullException e3) {
                    p.a(App.z());
                    throw e3;
                } catch (IllegalStateException e4) {
                    try {
                        Log.i(Y[385] + e4.toString());
                    } finally {
                        rawQuery.close();
                    }
                }
            }
            rawQuery.close();
        }
        Log.i(Y[383] + arrayList.size() + Y[387] + abVar.b());
        return arrayList;
    }

    public void a(int i, byte[] bArr, String str, byte[] bArr2, byte[] bArr3) {
        this.t.a(i, bArr, str, bArr2, bArr3);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int a(com.whatsapp.protocol.co r19, boolean r20, boolean r21) {
        /*
        r18 = this;
        r4 = 0;
        r5 = 0;
        r0 = r19;
        r2 = r0.k;
        r8 = r2.c;
        r3 = 0;
        r0 = r18;
        r9 = r0.a;
        monitor-enter(r9);
        r0 = r18;
        r2 = r0.p;	 Catch:{ all -> 0x0168 }
        r0 = r19;
        r6 = r0.k;	 Catch:{ all -> 0x0168 }
        r2.remove(r6);	 Catch:{ all -> 0x0168 }
        r0 = r18;
        r2 = r0.a;	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r4 = r2.getWritableDatabase();	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r18.O();	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r4.beginTransaction();	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r0 = r18;
        r2 = r0.y;	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r6 = 1;
        r2.bindString(r6, r8);	 Catch:{ SQLiteDoneException -> 0x0158, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r10 = 2;
        r0 = r19;
        r6 = r0.k;	 Catch:{ SQLiteDoneException -> 0x0158, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r6 = r6.a;	 Catch:{ SQLiteDoneException -> 0x0158, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        if (r6 == 0) goto L_0x016b;
    L_0x0038:
        r6 = 1;
    L_0x003a:
        r2.bindLong(r10, r6);	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r6 = 3;
        r0 = r19;
        r7 = r0.k;	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r7 = r7.b;	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r2.bindString(r6, r7);	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r6 = r2.simpleQueryForLong();	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r6 = java.lang.Long.valueOf(r6);	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r0 = r19;
        r2 = r0.c;	 Catch:{ SQLiteDoneException -> 0x016f, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r2 = com.whatsapp.App.b(r2);	 Catch:{ SQLiteDoneException -> 0x016f, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        if (r2 == 0) goto L_0x005c;
    L_0x0059:
        r18.a(r19, r20);	 Catch:{ SQLiteDoneException -> 0x016f, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
    L_0x005c:
        r0 = r18;
        r2 = r0.c;	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r7 = 1;
        r10 = r6.longValue();	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r2.bindLong(r7, r10);	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r2.execute();	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r0 = r18;
        r2 = r0.l;	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r2 = r2.get(r8);	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r2 = (com.whatsapp.a5w) r2;	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        if (r2 == 0) goto L_0x014a;
    L_0x0077:
        if (r21 == 0) goto L_0x007d;
    L_0x0079:
        r3 = H();	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
    L_0x007d:
        r10 = com.whatsapp.a5w.h(r2);	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r12 = r6.longValue();	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r7 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r7 != 0) goto L_0x018f;
    L_0x0089:
        r0 = r18;
        r10 = r0.n(r8);	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r7 = new android.content.ContentValues;	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r12 = 2;
        r7.<init>(r12);	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r12 = Y;	 Catch:{ SQLiteDoneException -> 0x0184, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r13 = 7;
        r12 = r12[r13];	 Catch:{ SQLiteDoneException -> 0x0184, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r13 = java.lang.Long.valueOf(r10);	 Catch:{ SQLiteDoneException -> 0x0184, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r7.put(r12, r13);	 Catch:{ SQLiteDoneException -> 0x0184, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        if (r21 == 0) goto L_0x00b0;
    L_0x00a3:
        r12 = Y;	 Catch:{ SQLiteDoneException -> 0x0184, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r13 = 10;
        r12 = r12[r13];	 Catch:{ SQLiteDoneException -> 0x0184, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r13 = java.lang.Integer.valueOf(r3);	 Catch:{ SQLiteDoneException -> 0x0184, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r7.put(r12, r13);	 Catch:{ SQLiteDoneException -> 0x0184, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
    L_0x00b0:
        r12 = 1;
        r12 = new java.lang.String[r12];	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r13 = 0;
        r12[r13] = r8;	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r13 = Y;	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r14 = 6;
        r13 = r13[r14];	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r14 = Y;	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r15 = 0;
        r14 = r14[r15];	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r13 = r4.update(r13, r7, r14, r12);	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        if (r13 != 0) goto L_0x00fa;
    L_0x00c6:
        r13 = Y;	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r14 = 12;
        r13 = r13[r14];	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r7.put(r13, r8);	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r13 = Y;	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r14 = 13;
        r13 = r13[r14];	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r14 = 0;
        r14 = r4.insert(r13, r14, r7);	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r16 = -1;
        r7 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1));
        if (r7 != 0) goto L_0x00fa;
    L_0x00e0:
        r7 = new java.lang.StringBuilder;	 Catch:{ SQLiteDoneException -> 0x018b, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r7.<init>();	 Catch:{ SQLiteDoneException -> 0x018b, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r13 = Y;	 Catch:{ SQLiteDoneException -> 0x018b, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r14 = 14;
        r13 = r13[r14];	 Catch:{ SQLiteDoneException -> 0x018b, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r7 = r7.append(r13);	 Catch:{ SQLiteDoneException -> 0x018b, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r7 = r7.append(r8);	 Catch:{ SQLiteDoneException -> 0x018b, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r7 = r7.toString();	 Catch:{ SQLiteDoneException -> 0x018b, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        com.whatsapp.util.Log.e(r7);	 Catch:{ SQLiteDoneException -> 0x018b, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
    L_0x00fa:
        r14 = 1;
        r7 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1));
        if (r7 == 0) goto L_0x0130;
    L_0x0100:
        r0 = r18;
        r5 = r0.r(r8);	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        if (r5 == 0) goto L_0x0130;
    L_0x0108:
        r14 = r5.b;	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        com.whatsapp.a5w.f(r2, r14);	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r7 = new android.content.ContentValues;	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r8 = 1;
        r7.<init>(r8);	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r8 = Y;	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r13 = 15;
        r8 = r8[r13];	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r14 = r5.b;	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r13 = java.lang.Long.valueOf(r14);	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r7.put(r8, r13);	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r8 = Y;	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r13 = 9;
        r8 = r8[r13];	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r13 = Y;	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r14 = 2;
        r13 = r13[r14];	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r4.update(r8, r7, r13, r12);	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
    L_0x0130:
        com.whatsapp.a5w.c(r2, r10);	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        com.whatsapp.a5w.a(r2, r5);	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
    L_0x0136:
        r10 = com.whatsapp.a5w.j(r2);	 Catch:{ SQLiteDoneException -> 0x01ee, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r6 = r6.longValue();	 Catch:{ SQLiteDoneException -> 0x01ee, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1));
        if (r5 != 0) goto L_0x0147;
    L_0x0142:
        r6 = 1;
        com.whatsapp.a5w.e(r2, r6);	 Catch:{ SQLiteDoneException -> 0x01ee, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
    L_0x0147:
        com.whatsapp.a5w.b(r2, r3);	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
    L_0x014a:
        r4.setTransactionSuccessful();	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r2 = r4.inTransaction();	 Catch:{ all -> 0x0168 }
        if (r2 == 0) goto L_0x0156;
    L_0x0153:
        r4.endTransaction();	 Catch:{ all -> 0x0168 }
    L_0x0156:
        monitor-exit(r9);	 Catch:{ all -> 0x0168 }
        return r3;
    L_0x0158:
        r2 = move-exception;
        throw r2;	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
    L_0x015a:
        r2 = move-exception;
        com.whatsapp.util.Log.a(r2);	 Catch:{ all -> 0x0179 }
        r2 = r4.inTransaction();	 Catch:{ all -> 0x0168 }
        if (r2 == 0) goto L_0x0156;
    L_0x0164:
        r4.endTransaction();	 Catch:{ all -> 0x0168 }
        goto L_0x0156;
    L_0x0168:
        r2 = move-exception;
        monitor-exit(r9);	 Catch:{ all -> 0x0168 }
        throw r2;
    L_0x016b:
        r6 = 0;
        goto L_0x003a;
    L_0x016f:
        r2 = move-exception;
        throw r2;	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
    L_0x0171:
        r2 = move-exception;
        r18.r();	 Catch:{ all -> 0x0179 }
        com.whatsapp.util.Log.a(r2);	 Catch:{ all -> 0x0179 }
        throw r2;	 Catch:{ all -> 0x0179 }
    L_0x0179:
        r2 = move-exception;
        r3 = r4.inTransaction();	 Catch:{ SQLiteDoneException -> 0x01f0 }
        if (r3 == 0) goto L_0x0183;
    L_0x0180:
        r4.endTransaction();	 Catch:{ SQLiteDoneException -> 0x01f0 }
    L_0x0183:
        throw r2;	 Catch:{ all -> 0x0168 }
    L_0x0184:
        r2 = move-exception;
        throw r2;	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
    L_0x0186:
        r2 = move-exception;
    L_0x0187:
        com.whatsapp.util.Log.a(r2);	 Catch:{ all -> 0x0179 }
        throw r2;	 Catch:{ all -> 0x0179 }
    L_0x018b:
        r2 = move-exception;
        throw r2;	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
    L_0x018d:
        r2 = move-exception;
        goto L_0x0187;
    L_0x018f:
        r5 = new android.content.ContentValues;	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r7 = 2;
        r5.<init>(r7);	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r7 = Y;	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r10 = 11;
        r7 = r7[r10];	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r10 = java.lang.Integer.valueOf(r3);	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r5.put(r7, r10);	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r7 = 1;
        r7 = new java.lang.String[r7];	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r10 = 0;
        r7[r10] = r8;	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r10 = Y;	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r11 = 1;
        r10 = r10[r11];	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r11 = Y;	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r12 = 5;
        r11 = r11[r12];	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r7 = r4.update(r10, r5, r11, r7);	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        if (r7 != 0) goto L_0x0136;
    L_0x01b8:
        r7 = Y;	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r10 = 3;
        r7 = r7[r10];	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r5.put(r7, r8);	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r7 = Y;	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r10 = 4;
        r7 = r7[r10];	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r10 = 0;
        r10 = r4.insert(r7, r10, r5);	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r12 = -1;
        r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r5 != 0) goto L_0x0136;
    L_0x01d0:
        r5 = new java.lang.StringBuilder;	 Catch:{ SQLiteDoneException -> 0x01ec, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r5.<init>();	 Catch:{ SQLiteDoneException -> 0x01ec, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r7 = Y;	 Catch:{ SQLiteDoneException -> 0x01ec, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r10 = 8;
        r7 = r7[r10];	 Catch:{ SQLiteDoneException -> 0x01ec, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r5 = r5.append(r7);	 Catch:{ SQLiteDoneException -> 0x01ec, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r5 = r5.append(r8);	 Catch:{ SQLiteDoneException -> 0x01ec, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        r5 = r5.toString();	 Catch:{ SQLiteDoneException -> 0x01ec, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        com.whatsapp.util.Log.e(r5);	 Catch:{ SQLiteDoneException -> 0x01ec, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
        goto L_0x0136;
    L_0x01ec:
        r2 = move-exception;
        throw r2;	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
    L_0x01ee:
        r2 = move-exception;
        throw r2;	 Catch:{ SQLiteDoneException -> 0x015a, SQLiteDatabaseCorruptException -> 0x0171, RuntimeException -> 0x0186, Error -> 0x018d }
    L_0x01f0:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x0168 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.a(com.whatsapp.protocol.co, boolean, boolean):int");
    }

    public String i(String str) {
        Cursor rawQuery = this.a.getReadableDatabase().rawQuery(Y[469], new String[]{str});
        if (rawQuery != null) {
            try {
                if (rawQuery.moveToNext()) {
                    String string = rawQuery.getString(0);
                    rawQuery.close();
                    return string;
                }
                rawQuery.close();
            } catch (SQLiteDatabaseCorruptException e) {
                r();
                throw new AssertionError(e);
            } catch (IllegalStateException e2) {
                Log.i(Y[468] + e2.toString());
                rawQuery.close();
            } catch (Throwable th) {
                rawQuery.close();
            }
        }
        return null;
    }

    public void a(co coVar, boolean z, int i) {
        if (z) {
            try {
                Message.obtain(this.b, 2, i, 0, coVar).sendToTarget();
                if (!l5.s) {
                    return;
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        this.U.a(coVar, i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long K(@android.support.annotation.NonNull java.lang.String r9) {
        /*
        r8 = this;
        r2 = com.whatsapp.l5.s;
        r0 = 0;
        r3 = r8.a;
        monitor-enter(r3);
        r4 = r8.a;	 Catch:{ all -> 0x0073 }
        com.whatsapp.a5f.a(r4);	 Catch:{ all -> 0x0073 }
        r4 = r8.a;	 Catch:{ all -> 0x0073 }
        r4 = r4.getReadableDatabase();	 Catch:{ all -> 0x0073 }
        r5 = Y;	 Catch:{ all -> 0x0073 }
        r6 = 463; // 0x1cf float:6.49E-43 double:2.288E-321;
        r5 = r5[r6];	 Catch:{ all -> 0x0073 }
        r6 = 1;
        r6 = new java.lang.String[r6];	 Catch:{ all -> 0x0073 }
        r7 = 0;
        r6[r7] = r9;	 Catch:{ all -> 0x0073 }
        r4 = r4.rawQuery(r5, r6);	 Catch:{ all -> 0x0073 }
        if (r4 == 0) goto L_0x0050;
    L_0x0024:
        r5 = r4.moveToNext();	 Catch:{ all -> 0x006e }
        if (r5 == 0) goto L_0x0031;
    L_0x002a:
        r0 = 0;
        r0 = r4.getLong(r0);	 Catch:{ all -> 0x006e }
        if (r2 == 0) goto L_0x004b;
    L_0x0031:
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x006c }
        r5.<init>();	 Catch:{ IllegalStateException -> 0x006c }
        r6 = Y;	 Catch:{ IllegalStateException -> 0x006c }
        r7 = 464; // 0x1d0 float:6.5E-43 double:2.29E-321;
        r6 = r6[r7];	 Catch:{ IllegalStateException -> 0x006c }
        r5 = r5.append(r6);	 Catch:{ IllegalStateException -> 0x006c }
        r5 = r5.append(r9);	 Catch:{ IllegalStateException -> 0x006c }
        r5 = r5.toString();	 Catch:{ IllegalStateException -> 0x006c }
        com.whatsapp.util.Log.i(r5);	 Catch:{ IllegalStateException -> 0x006c }
    L_0x004b:
        r4.close();	 Catch:{ all -> 0x0073 }
        if (r2 == 0) goto L_0x006a;
    L_0x0050:
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0076 }
        r2.<init>();	 Catch:{ IllegalStateException -> 0x0076 }
        r4 = Y;	 Catch:{ IllegalStateException -> 0x0076 }
        r5 = 465; // 0x1d1 float:6.52E-43 double:2.297E-321;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x0076 }
        r2 = r2.append(r4);	 Catch:{ IllegalStateException -> 0x0076 }
        r2 = r2.append(r9);	 Catch:{ IllegalStateException -> 0x0076 }
        r2 = r2.toString();	 Catch:{ IllegalStateException -> 0x0076 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IllegalStateException -> 0x0076 }
    L_0x006a:
        monitor-exit(r3);	 Catch:{ all -> 0x0073 }
        return r0;
    L_0x006c:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x006e }
    L_0x006e:
        r0 = move-exception;
        r4.close();	 Catch:{ all -> 0x0073 }
        throw r0;	 Catch:{ all -> 0x0073 }
    L_0x0073:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0073 }
        throw r0;
    L_0x0076:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0073 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.K(java.lang.String):long");
    }

    private Cursor a(String str, String[] strArr, CancellationSignal cancellationSignal) {
        try {
            if (VERSION.SDK_INT < 16) {
                if (cancellationSignal != null) {
                    cancellationSignal.throwIfCanceled();
                }
                return this.a.getReadableDatabase().rawQuery(str, strArr);
            }
            try {
                android.os.CancellationSignal cancellationSignal2;
                SQLiteDatabase readableDatabase = this.a.getReadableDatabase();
                if (cancellationSignal != null) {
                    cancellationSignal2 = (android.os.CancellationSignal) cancellationSignal.getCancellationSignalObject();
                } else {
                    cancellationSignal2 = null;
                }
                return readableDatabase.rawQuery(str, strArr, cancellationSignal2);
            } catch (Exception e) {
                throw e;
            } catch (Exception e2) {
                try {
                    if (e2 instanceof OperationCanceledException) {
                        throw new android.support.v4.os.OperationCanceledException();
                    }
                    throw e2;
                } catch (Exception e22) {
                    throw e22;
                }
            }
        } catch (Exception e222) {
            throw e222;
        } catch (Exception e2222) {
            throw e2222;
        }
    }

    public void d(co coVar, int i) {
        this.U.a(coVar, i);
        this.n.b(coVar.k.c);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void M() {
        /*
        r12 = this;
        r11 = 7;
        r1 = com.whatsapp.l5.s;
        r2 = r12.P;
        monitor-enter(r2);
        r0 = r12.P;	 Catch:{ all -> 0x011f }
        r0 = r0.get();	 Catch:{ all -> 0x011f }
        if (r0 == 0) goto L_0x0010;
    L_0x000e:
        monitor-exit(r2);	 Catch:{ all -> 0x011f }
    L_0x000f:
        return;
    L_0x0010:
        r3 = new java.util.ArrayList;	 Catch:{ all -> 0x011f }
        r3.<init>();	 Catch:{ all -> 0x011f }
        r4 = new com.whatsapp.util.ab;	 Catch:{ all -> 0x011f }
        r4.<init>();	 Catch:{ all -> 0x011f }
        r0 = Y;	 Catch:{ all -> 0x011f }
        r5 = 24;
        r0 = r0[r5];	 Catch:{ all -> 0x011f }
        r4.b(r0);	 Catch:{ all -> 0x011f }
        r6 = com.whatsapp.App.av();	 Catch:{ all -> 0x011f }
        r8 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r6 = r6 - r8;
        r0 = r12.a;	 Catch:{ all -> 0x011f }
        r0 = r0.getReadableDatabase();	 Catch:{ all -> 0x011f }
        r5 = I;	 Catch:{ all -> 0x011f }
        r8 = 2;
        r8 = new java.lang.String[r8];	 Catch:{ all -> 0x011f }
        r9 = 0;
        r10 = 4;
        r10 = java.lang.String.valueOf(r10);	 Catch:{ all -> 0x011f }
        r8[r9] = r10;	 Catch:{ all -> 0x011f }
        r9 = 1;
        r6 = java.lang.String.valueOf(r6);	 Catch:{ all -> 0x011f }
        r8[r9] = r6;	 Catch:{ all -> 0x011f }
        r5 = r0.rawQuery(r5, r8);	 Catch:{ all -> 0x011f }
        if (r5 == 0) goto L_0x00c0;
    L_0x004b:
        r0 = Y;	 Catch:{ all -> 0x011f }
        r6 = 21;
        r0 = r0[r6];	 Catch:{ all -> 0x011f }
        r0 = r5.getColumnIndex(r0);	 Catch:{ all -> 0x011f }
    L_0x0055:
        r6 = r5.moveToNext();	 Catch:{ IllegalStateException -> 0x0124, SQLiteDatabaseCorruptException -> 0x014c, SQLiteFullException -> 0x015b }
        if (r6 == 0) goto L_0x00bd;
    L_0x005b:
        r6 = r5.getString(r0);	 Catch:{ IllegalStateException -> 0x0124, SQLiteDatabaseCorruptException -> 0x014c, SQLiteFullException -> 0x015b }
        if (r6 != 0) goto L_0x006c;
    L_0x0061:
        r7 = Y;	 Catch:{ IllegalStateException -> 0x0122, SQLiteDatabaseCorruptException -> 0x014c, SQLiteFullException -> 0x015b }
        r8 = 19;
        r7 = r7[r8];	 Catch:{ IllegalStateException -> 0x0122, SQLiteDatabaseCorruptException -> 0x014c, SQLiteFullException -> 0x015b }
        com.whatsapp.util.Log.w(r7);	 Catch:{ IllegalStateException -> 0x0122, SQLiteDatabaseCorruptException -> 0x014c, SQLiteFullException -> 0x015b }
        if (r1 == 0) goto L_0x0055;
    L_0x006c:
        r6 = r12.a(r5, r6);	 Catch:{ IllegalStateException -> 0x0124, SQLiteDatabaseCorruptException -> 0x014c, SQLiteFullException -> 0x015b }
        r7 = r6.c;	 Catch:{ IllegalStateException -> 0x0124, SQLiteDatabaseCorruptException -> 0x014c, SQLiteFullException -> 0x015b }
        r8 = 8;
        if (r7 == r8) goto L_0x0055;
    L_0x0076:
        r7 = r6.c;	 Catch:{ IllegalStateException -> 0x0124, SQLiteDatabaseCorruptException -> 0x014c, SQLiteFullException -> 0x015b }
        if (r7 == r11) goto L_0x0055;
    L_0x007a:
        r7 = r6.d;	 Catch:{ IllegalStateException -> 0x0148, SQLiteDatabaseCorruptException -> 0x014c, SQLiteFullException -> 0x015b }
        if (r7 != r11) goto L_0x008d;
    L_0x007e:
        r7 = r6.k;	 Catch:{ IllegalStateException -> 0x0148, SQLiteDatabaseCorruptException -> 0x014c, SQLiteFullException -> 0x015b }
        r7 = r7.c;	 Catch:{ IllegalStateException -> 0x0148, SQLiteDatabaseCorruptException -> 0x014c, SQLiteFullException -> 0x015b }
        r8 = "-";
        r7 = r7.contains(r8);	 Catch:{ IllegalStateException -> 0x0148, SQLiteDatabaseCorruptException -> 0x014c, SQLiteFullException -> 0x015b }
        if (r7 == 0) goto L_0x008d;
    L_0x008b:
        if (r1 == 0) goto L_0x0055;
    L_0x008d:
        r7 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0124, SQLiteDatabaseCorruptException -> 0x014c, SQLiteFullException -> 0x015b }
        r7.<init>();	 Catch:{ IllegalStateException -> 0x0124, SQLiteDatabaseCorruptException -> 0x014c, SQLiteFullException -> 0x015b }
        r8 = Y;	 Catch:{ IllegalStateException -> 0x0124, SQLiteDatabaseCorruptException -> 0x014c, SQLiteFullException -> 0x015b }
        r9 = 20;
        r8 = r8[r9];	 Catch:{ IllegalStateException -> 0x0124, SQLiteDatabaseCorruptException -> 0x014c, SQLiteFullException -> 0x015b }
        r7 = r7.append(r8);	 Catch:{ IllegalStateException -> 0x0124, SQLiteDatabaseCorruptException -> 0x014c, SQLiteFullException -> 0x015b }
        r8 = r6.k;	 Catch:{ IllegalStateException -> 0x0124, SQLiteDatabaseCorruptException -> 0x014c, SQLiteFullException -> 0x015b }
        r8 = r8.b;	 Catch:{ IllegalStateException -> 0x0124, SQLiteDatabaseCorruptException -> 0x014c, SQLiteFullException -> 0x015b }
        r7 = r7.append(r8);	 Catch:{ IllegalStateException -> 0x0124, SQLiteDatabaseCorruptException -> 0x014c, SQLiteFullException -> 0x015b }
        r8 = " ";
        r7 = r7.append(r8);	 Catch:{ IllegalStateException -> 0x0124, SQLiteDatabaseCorruptException -> 0x014c, SQLiteFullException -> 0x015b }
        r8 = r6.c;	 Catch:{ IllegalStateException -> 0x0124, SQLiteDatabaseCorruptException -> 0x014c, SQLiteFullException -> 0x015b }
        r7 = r7.append(r8);	 Catch:{ IllegalStateException -> 0x0124, SQLiteDatabaseCorruptException -> 0x014c, SQLiteFullException -> 0x015b }
        r7 = r7.toString();	 Catch:{ IllegalStateException -> 0x0124, SQLiteDatabaseCorruptException -> 0x014c, SQLiteFullException -> 0x015b }
        com.whatsapp.util.Log.i(r7);	 Catch:{ IllegalStateException -> 0x0124, SQLiteDatabaseCorruptException -> 0x014c, SQLiteFullException -> 0x015b }
        r3.add(r6);	 Catch:{ IllegalStateException -> 0x0124, SQLiteDatabaseCorruptException -> 0x014c, SQLiteFullException -> 0x015b }
        if (r1 == 0) goto L_0x0055;
    L_0x00bd:
        r5.close();	 Catch:{ all -> 0x011f }
    L_0x00c0:
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x011f }
        r0.<init>();	 Catch:{ all -> 0x011f }
        r5 = Y;	 Catch:{ all -> 0x011f }
        r6 = 23;
        r5 = r5[r6];	 Catch:{ all -> 0x011f }
        r0 = r0.append(r5);	 Catch:{ all -> 0x011f }
        r5 = r3.size();	 Catch:{ all -> 0x011f }
        r0 = r0.append(r5);	 Catch:{ all -> 0x011f }
        r5 = Y;	 Catch:{ all -> 0x011f }
        r6 = 25;
        r5 = r5[r6];	 Catch:{ all -> 0x011f }
        r0 = r0.append(r5);	 Catch:{ all -> 0x011f }
        r4 = r4.b();	 Catch:{ all -> 0x011f }
        r0 = r0.append(r4);	 Catch:{ all -> 0x011f }
        r0 = r0.toString();	 Catch:{ all -> 0x011f }
        com.whatsapp.util.Log.i(r0);	 Catch:{ all -> 0x011f }
        r3 = r3.iterator();	 Catch:{ all -> 0x011f }
    L_0x00f4:
        r0 = r3.hasNext();	 Catch:{ all -> 0x011f }
        if (r0 == 0) goto L_0x0109;
    L_0x00fa:
        r0 = r3.next();	 Catch:{ all -> 0x011f }
        r0 = (com.whatsapp.protocol.co) r0;	 Catch:{ all -> 0x011f }
        r4 = r12.z;	 Catch:{ all -> 0x011f }
        r5 = r0.k;	 Catch:{ all -> 0x011f }
        r4.put(r5, r0);	 Catch:{ all -> 0x011f }
        if (r1 == 0) goto L_0x00f4;
    L_0x0109:
        r0 = r12.P;	 Catch:{ IllegalStateException -> 0x0164 }
        r1 = 0;
        r3 = 1;
        r0 = r0.compareAndSet(r1, r3);	 Catch:{ IllegalStateException -> 0x0164 }
        if (r0 != 0) goto L_0x011c;
    L_0x0113:
        r0 = Y;	 Catch:{ IllegalStateException -> 0x0164 }
        r1 = 26;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x0164 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IllegalStateException -> 0x0164 }
    L_0x011c:
        monitor-exit(r2);	 Catch:{ all -> 0x011f }
        goto L_0x000f;
    L_0x011f:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x011f }
        throw r0;
    L_0x0122:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0124, SQLiteDatabaseCorruptException -> 0x014c, SQLiteFullException -> 0x015b }
    L_0x0124:
        r0 = move-exception;
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0156 }
        r6.<init>();	 Catch:{ all -> 0x0156 }
        r7 = Y;	 Catch:{ all -> 0x0156 }
        r8 = 22;
        r7 = r7[r8];	 Catch:{ all -> 0x0156 }
        r6 = r6.append(r7);	 Catch:{ all -> 0x0156 }
        r0 = r0.toString();	 Catch:{ all -> 0x0156 }
        r0 = r6.append(r0);	 Catch:{ all -> 0x0156 }
        r0 = r0.toString();	 Catch:{ all -> 0x0156 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ all -> 0x0156 }
        r5.close();	 Catch:{ all -> 0x011f }
        goto L_0x00c0;
    L_0x0148:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x014a, SQLiteDatabaseCorruptException -> 0x014c, SQLiteFullException -> 0x015b }
    L_0x014a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0124, SQLiteDatabaseCorruptException -> 0x014c, SQLiteFullException -> 0x015b }
    L_0x014c:
        r0 = move-exception;
        r12.r();	 Catch:{ all -> 0x0156 }
        r1 = new java.lang.AssertionError;	 Catch:{ all -> 0x0156 }
        r1.<init>(r0);	 Catch:{ all -> 0x0156 }
        throw r1;	 Catch:{ all -> 0x0156 }
    L_0x0156:
        r0 = move-exception;
        r5.close();	 Catch:{ all -> 0x011f }
        throw r0;	 Catch:{ all -> 0x011f }
    L_0x015b:
        r0 = move-exception;
        r1 = com.whatsapp.App.z();	 Catch:{ all -> 0x0156 }
        com.whatsapp.util.p.a(r1);	 Catch:{ all -> 0x0156 }
        throw r0;	 Catch:{ all -> 0x0156 }
    L_0x0164:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x011f }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.M():void");
    }

    public ArrayList b(String str, a57 com_whatsapp_a57) {
        return a(str, -1, com_whatsapp_a57);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long d(java.lang.String r13, int r14) {
        /*
        r12 = this;
        r2 = 1;
        r5 = com.whatsapp.l5.s;
        r0 = r12.l;
        r0 = r0.get(r13);
        r0 = (com.whatsapp.a5w) r0;
        if (r0 != 0) goto L_0x0010;
    L_0x000e:
        r0 = r2;
    L_0x000f:
        return r0;
    L_0x0010:
        r6 = r12.a;
        monitor-enter(r6);
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00b7 }
        r1.<init>();	 Catch:{ all -> 0x00b7 }
        r4 = Y;	 Catch:{ all -> 0x00b7 }
        r7 = 766; // 0x2fe float:1.073E-42 double:3.785E-321;
        r4 = r4[r7];	 Catch:{ all -> 0x00b7 }
        r4 = r1.append(r4);	 Catch:{ all -> 0x00b7 }
        r8 = com.whatsapp.a5w.k(r0);	 Catch:{ all -> 0x00b7 }
        r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1));
        if (r1 != 0) goto L_0x00ad;
    L_0x002a:
        r1 = "";
    L_0x002d:
        r1 = r4.append(r1);	 Catch:{ all -> 0x00b7 }
        r4 = Y;	 Catch:{ all -> 0x00b7 }
        r7 = 769; // 0x301 float:1.078E-42 double:3.8E-321;
        r4 = r4[r7];	 Catch:{ all -> 0x00b7 }
        r1 = r1.append(r4);	 Catch:{ all -> 0x00b7 }
        r1 = r1.append(r14);	 Catch:{ all -> 0x00b7 }
        r7 = r1.toString();	 Catch:{ all -> 0x00b7 }
        r1 = 2;
        r4 = new java.lang.String[r1];	 Catch:{ all -> 0x00b7 }
        r1 = 0;
        r4[r1] = r13;	 Catch:{ all -> 0x00b7 }
        r1 = 1;
        r8 = com.whatsapp.a5w.k(r0);	 Catch:{ all -> 0x00b7 }
        r8 = java.lang.String.valueOf(r8);	 Catch:{ all -> 0x00b7 }
        r4[r1] = r8;	 Catch:{ all -> 0x00b7 }
        r1 = 1;
        r1 = new java.lang.String[r1];	 Catch:{ all -> 0x00b7 }
        r8 = 0;
        r1[r8] = r13;	 Catch:{ all -> 0x00b7 }
        r8 = r12.a;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00b5 }
        r8 = r8.getReadableDatabase();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00b5 }
        r10 = com.whatsapp.a5w.k(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00b5 }
        r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1));
        if (r2 != 0) goto L_0x00ba;
    L_0x0068:
        r1 = r8.rawQuery(r7, r1);	 Catch:{ all -> 0x00b7 }
        if (r1 == 0) goto L_0x009d;
    L_0x006e:
        r2 = r1.moveToLast();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00bc }
        if (r2 == 0) goto L_0x007e;
    L_0x0074:
        r2 = 0;
        r2 = r1.getLong(r2);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00bc }
        com.whatsapp.a5w.b(r0, r2);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00bc }
        if (r5 == 0) goto L_0x0098;
    L_0x007e:
        r2 = new java.lang.StringBuilder;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00be }
        r2.<init>();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00be }
        r3 = Y;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00be }
        r4 = 767; // 0x2ff float:1.075E-42 double:3.79E-321;
        r3 = r3[r4];	 Catch:{ SQLiteDatabaseCorruptException -> 0x00be }
        r2 = r2.append(r3);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00be }
        r2 = r2.append(r13);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00be }
        r2 = r2.toString();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00be }
        com.whatsapp.util.Log.w(r2);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00be }
    L_0x0098:
        r1.close();	 Catch:{ all -> 0x00b7 }
        if (r5 == 0) goto L_0x00a6;
    L_0x009d:
        r1 = Y;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00cf }
        r2 = 768; // 0x300 float:1.076E-42 double:3.794E-321;
        r1 = r1[r2];	 Catch:{ SQLiteDatabaseCorruptException -> 0x00cf }
        com.whatsapp.util.Log.e(r1);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00cf }
    L_0x00a6:
        monitor-exit(r6);	 Catch:{ all -> 0x00b7 }
        r0 = com.whatsapp.a5w.k(r0);
        goto L_0x000f;
    L_0x00ad:
        r1 = Y;	 Catch:{ all -> 0x00b7 }
        r7 = 765; // 0x2fd float:1.072E-42 double:3.78E-321;
        r1 = r1[r7];	 Catch:{ all -> 0x00b7 }
        goto L_0x002d;
    L_0x00b5:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00b7 }
    L_0x00b7:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x00b7 }
        throw r0;
    L_0x00ba:
        r1 = r4;
        goto L_0x0068;
    L_0x00bc:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00be }
    L_0x00be:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c0 }
    L_0x00c0:
        r0 = move-exception;
        r12.r();	 Catch:{ all -> 0x00ca }
        r2 = new java.lang.AssertionError;	 Catch:{ all -> 0x00ca }
        r2.<init>(r0);	 Catch:{ all -> 0x00ca }
        throw r2;	 Catch:{ all -> 0x00ca }
    L_0x00ca:
        r0 = move-exception;
        r1.close();	 Catch:{ all -> 0x00b7 }
        throw r0;	 Catch:{ all -> 0x00b7 }
    L_0x00cf:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00b7 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.d(java.lang.String, int):long");
    }

    @Nullable
    public Set b(@NonNull String str, @Nullable String str2) {
        Set a;
        synchronized (this.a) {
            a = a(this.a.getWritableDatabase(), str, str2);
        }
        return a;
    }

    public Cursor a(String str, CancellationSignal cancellationSignal) {
        Cursor a;
        CharSequence charSequence = null;
        synchronized (this.a) {
            a5f.a(this.a);
            if (!TextUtils.isEmpty(str)) {
                charSequence = f(str);
            }
            if (TextUtils.isEmpty(charSequence)) {
                a = a(Y[379], null, cancellationSignal);
            } else {
                a = a(Y[380], new String[]{charSequence}, cancellationSignal);
            }
        }
        return a;
    }

    public static Long n() {
        File file = X;
        if (file.exists()) {
            return Long.valueOf(file.length());
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.whatsapp.ats c(java.io.File r12) {
        /*
        r0 = 0;
        r5 = 1;
        r3 = 0;
        r6 = com.whatsapp.l5.s;
        r2 = new com.whatsapp.ats;
        r2.<init>();
        r1 = new java.util.HashMap;
        r1.<init>();
        r2.a = r1;
        r1 = new java.util.ArrayList;
        r1.<init>();
        r2.b = r1;
        r1 = Y;
        r4 = 328; // 0x148 float:4.6E-43 double:1.62E-321;
        r1 = r1[r4];
        r7 = java.util.regex.Pattern.compile(r1);
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x01c1, all -> 0x01b2 }
        r4 = 11;
        if (r1 < r4) goto L_0x006a;
    L_0x0028:
        r1 = r12.getAbsolutePath();	 Catch:{ Exception -> 0x01c1, all -> 0x01b2 }
        r4 = 0;
        r8 = 16;
        r9 = new com.whatsapp.ow;	 Catch:{ Exception -> 0x01c1, all -> 0x01b2 }
        r9.<init>(r12);	 Catch:{ Exception -> 0x01c1, all -> 0x01b2 }
        r4 = android.database.sqlite.SQLiteDatabase.openDatabase(r1, r4, r8, r9);	 Catch:{ Exception -> 0x01c1, all -> 0x01b2 }
    L_0x0038:
        r1 = Y;	 Catch:{ Exception -> 0x00fd, all -> 0x01bc }
        r8 = 334; // 0x14e float:4.68E-43 double:1.65E-321;
        r1 = r1[r8];	 Catch:{ Exception -> 0x00fd, all -> 0x01bc }
        r8 = 0;
        r8 = r4.rawQuery(r1, r8);	 Catch:{ Exception -> 0x00fd, all -> 0x01bc }
        if (r8 == 0) goto L_0x00e5;
    L_0x0045:
        r1 = r8.moveToNext();	 Catch:{ Exception -> 0x0078 }
        if (r1 == 0) goto L_0x00de;
    L_0x004b:
        r1 = r0 + 1;
        r0 = 0;
        r9 = r8.getString(r0);	 Catch:{ Exception -> 0x0078 }
        if (r1 != r5) goto L_0x008c;
    L_0x0054:
        r0 = Y;	 Catch:{ Exception -> 0x0076 }
        r10 = 329; // 0x149 float:4.61E-43 double:1.625E-321;
        r0 = r0[r10];	 Catch:{ Exception -> 0x0076 }
        r0 = r0.equalsIgnoreCase(r9);	 Catch:{ Exception -> 0x0076 }
        if (r0 == 0) goto L_0x008c;
    L_0x0060:
        r8.close();	 Catch:{ Exception -> 0x00fd, all -> 0x01bc }
        if (r4 == 0) goto L_0x0068;
    L_0x0065:
        r4.close();
    L_0x0068:
        r0 = r2;
    L_0x0069:
        return r0;
    L_0x006a:
        r1 = r12.getAbsolutePath();	 Catch:{ Exception -> 0x01c1, all -> 0x01b2 }
        r4 = 0;
        r8 = 16;
        r4 = android.database.sqlite.SQLiteDatabase.openDatabase(r1, r4, r8);	 Catch:{ Exception -> 0x01c1, all -> 0x01b2 }
        goto L_0x0038;
    L_0x0076:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0078 }
    L_0x0078:
        r0 = move-exception;
        r1 = Y;	 Catch:{ all -> 0x00f8 }
        r2 = 333; // 0x14d float:4.67E-43 double:1.645E-321;
        r1 = r1[r2];	 Catch:{ all -> 0x00f8 }
        com.whatsapp.util.Log.b(r1, r0);	 Catch:{ all -> 0x00f8 }
        r8.close();	 Catch:{ Exception -> 0x00fd, all -> 0x01bc }
        if (r4 == 0) goto L_0x008a;
    L_0x0087:
        r4.close();
    L_0x008a:
        r0 = r3;
        goto L_0x0069;
    L_0x008c:
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0078 }
        r0.<init>();	 Catch:{ Exception -> 0x0078 }
        r10 = Y;	 Catch:{ Exception -> 0x0078 }
        r11 = 332; // 0x14c float:4.65E-43 double:1.64E-321;
        r10 = r10[r11];	 Catch:{ Exception -> 0x0078 }
        r0 = r0.append(r10);	 Catch:{ Exception -> 0x0078 }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x0078 }
        r10 = " ";
        r0 = r0.append(r10);	 Catch:{ Exception -> 0x0078 }
        r0 = r0.append(r9);	 Catch:{ Exception -> 0x0078 }
        r0 = r0.toString();	 Catch:{ Exception -> 0x0078 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x0078 }
        r0 = r7.matcher(r9);	 Catch:{ Exception -> 0x0078 }
        r10 = r0.find();	 Catch:{ Exception -> 0x0078 }
        if (r10 == 0) goto L_0x00d6;
    L_0x00bb:
        r10 = 1;
        r10 = r0.group(r10);	 Catch:{ Exception -> 0x0078 }
        r0 = r2.a;	 Catch:{ Exception -> 0x0078 }
        r0 = r0.get(r10);	 Catch:{ Exception -> 0x0078 }
        r0 = (java.lang.Integer) r0;	 Catch:{ Exception -> 0x0078 }
        r11 = r2.a;	 Catch:{ Exception -> 0x00f6 }
        if (r0 != 0) goto L_0x0125;
    L_0x00cc:
        r0 = r5;
    L_0x00cd:
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ Exception -> 0x012c }
        r11.put(r10, r0);	 Catch:{ Exception -> 0x012c }
        if (r6 == 0) goto L_0x00db;
    L_0x00d6:
        r0 = r2.b;	 Catch:{ Exception -> 0x012c }
        r0.add(r9);	 Catch:{ Exception -> 0x012c }
    L_0x00db:
        if (r6 == 0) goto L_0x01c5;
    L_0x00dd:
        r0 = r1;
    L_0x00de:
        r2.c = r0;	 Catch:{ Exception -> 0x0078 }
        r8.close();	 Catch:{ Exception -> 0x00fd, all -> 0x01bc }
        if (r6 == 0) goto L_0x0130;
    L_0x00e5:
        r0 = Y;	 Catch:{ Exception -> 0x00fd, all -> 0x01bc }
        r1 = 336; // 0x150 float:4.71E-43 double:1.66E-321;
        r0 = r0[r1];	 Catch:{ Exception -> 0x00fd, all -> 0x01bc }
        com.whatsapp.util.Log.w(r0);	 Catch:{ Exception -> 0x00fd, all -> 0x01bc }
        if (r4 == 0) goto L_0x00f3;
    L_0x00f0:
        r4.close();	 Catch:{ Exception -> 0x012e }
    L_0x00f3:
        r0 = r3;
        goto L_0x0069;
    L_0x00f6:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0078 }
    L_0x00f8:
        r0 = move-exception;
        r8.close();	 Catch:{ Exception -> 0x00fd, all -> 0x01bc }
        throw r0;	 Catch:{ Exception -> 0x00fd, all -> 0x01bc }
    L_0x00fd:
        r0 = move-exception;
        r1 = r4;
    L_0x00ff:
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01be }
        r2.<init>();	 Catch:{ all -> 0x01be }
        r4 = Y;	 Catch:{ all -> 0x01be }
        r5 = 330; // 0x14a float:4.62E-43 double:1.63E-321;
        r4 = r4[r5];	 Catch:{ all -> 0x01be }
        r2 = r2.append(r4);	 Catch:{ all -> 0x01be }
        r0 = r0.toString();	 Catch:{ all -> 0x01be }
        r0 = r2.append(r0);	 Catch:{ all -> 0x01be }
        r0 = r0.toString();	 Catch:{ all -> 0x01be }
        com.whatsapp.util.Log.e(r0);	 Catch:{ all -> 0x01be }
        if (r1 == 0) goto L_0x0122;
    L_0x011f:
        r1.close();	 Catch:{ Exception -> 0x01b0 }
    L_0x0122:
        r0 = r3;
        goto L_0x0069;
    L_0x0125:
        r0 = r0.intValue();	 Catch:{ Exception -> 0x0078 }
        r0 = r0 + 1;
        goto L_0x00cd;
    L_0x012c:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0078 }
    L_0x012e:
        r0 = move-exception;
        throw r0;
    L_0x0130:
        r0 = r2.a;	 Catch:{ Exception -> 0x00fd, all -> 0x01bc }
        r0 = r0.keySet();	 Catch:{ Exception -> 0x00fd, all -> 0x01bc }
        r5 = r0.iterator();	 Catch:{ Exception -> 0x00fd, all -> 0x01bc }
    L_0x013a:
        r0 = r5.hasNext();	 Catch:{ Exception -> 0x00fd, all -> 0x01bc }
        if (r0 == 0) goto L_0x0178;
    L_0x0140:
        r0 = r5.next();	 Catch:{ Exception -> 0x00fd, all -> 0x01bc }
        r0 = (java.lang.String) r0;	 Catch:{ Exception -> 0x00fd, all -> 0x01bc }
        r1 = r2.a;	 Catch:{ Exception -> 0x00fd, all -> 0x01bc }
        r1 = r1.get(r0);	 Catch:{ Exception -> 0x00fd, all -> 0x01bc }
        r1 = (java.lang.Integer) r1;	 Catch:{ Exception -> 0x00fd, all -> 0x01bc }
        r7 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00fd, all -> 0x01bc }
        r7.<init>();	 Catch:{ Exception -> 0x00fd, all -> 0x01bc }
        r8 = Y;	 Catch:{ Exception -> 0x00fd, all -> 0x01bc }
        r9 = 331; // 0x14b float:4.64E-43 double:1.635E-321;
        r8 = r8[r9];	 Catch:{ Exception -> 0x00fd, all -> 0x01bc }
        r7 = r7.append(r8);	 Catch:{ Exception -> 0x00fd, all -> 0x01bc }
        r0 = r7.append(r0);	 Catch:{ Exception -> 0x00fd, all -> 0x01bc }
        r7 = Y;	 Catch:{ Exception -> 0x00fd, all -> 0x01bc }
        r8 = 337; // 0x151 float:4.72E-43 double:1.665E-321;
        r7 = r7[r8];	 Catch:{ Exception -> 0x00fd, all -> 0x01bc }
        r0 = r0.append(r7);	 Catch:{ Exception -> 0x00fd, all -> 0x01bc }
        r0 = r0.append(r1);	 Catch:{ Exception -> 0x00fd, all -> 0x01bc }
        r0 = r0.toString();	 Catch:{ Exception -> 0x00fd, all -> 0x01bc }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x00fd, all -> 0x01bc }
        if (r6 == 0) goto L_0x013a;
    L_0x0178:
        r0 = r2.b;	 Catch:{ Exception -> 0x00fd, all -> 0x01bc }
        r1 = r0.iterator();	 Catch:{ Exception -> 0x00fd, all -> 0x01bc }
    L_0x017e:
        r0 = r1.hasNext();	 Catch:{ Exception -> 0x00fd, all -> 0x01bc }
        if (r0 == 0) goto L_0x01a6;
    L_0x0184:
        r0 = r1.next();	 Catch:{ Exception -> 0x00fd, all -> 0x01bc }
        r0 = (java.lang.String) r0;	 Catch:{ Exception -> 0x00fd, all -> 0x01bc }
        r5 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00fd, all -> 0x01bc }
        r5.<init>();	 Catch:{ Exception -> 0x00fd, all -> 0x01bc }
        r7 = Y;	 Catch:{ Exception -> 0x00fd, all -> 0x01bc }
        r8 = 335; // 0x14f float:4.7E-43 double:1.655E-321;
        r7 = r7[r8];	 Catch:{ Exception -> 0x00fd, all -> 0x01bc }
        r5 = r5.append(r7);	 Catch:{ Exception -> 0x00fd, all -> 0x01bc }
        r0 = r5.append(r0);	 Catch:{ Exception -> 0x00fd, all -> 0x01bc }
        r0 = r0.toString();	 Catch:{ Exception -> 0x00fd, all -> 0x01bc }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x00fd, all -> 0x01bc }
        if (r6 == 0) goto L_0x017e;
    L_0x01a6:
        if (r4 == 0) goto L_0x01ab;
    L_0x01a8:
        r4.close();	 Catch:{ Exception -> 0x01ae }
    L_0x01ab:
        r0 = r2;
        goto L_0x0069;
    L_0x01ae:
        r0 = move-exception;
        throw r0;
    L_0x01b0:
        r0 = move-exception;
        throw r0;
    L_0x01b2:
        r0 = move-exception;
        r4 = r3;
    L_0x01b4:
        if (r4 == 0) goto L_0x01b9;
    L_0x01b6:
        r4.close();	 Catch:{ Exception -> 0x01ba }
    L_0x01b9:
        throw r0;
    L_0x01ba:
        r0 = move-exception;
        throw r0;
    L_0x01bc:
        r0 = move-exception;
        goto L_0x01b4;
    L_0x01be:
        r0 = move-exception;
        r4 = r1;
        goto L_0x01b4;
    L_0x01c1:
        r0 = move-exception;
        r1 = r3;
        goto L_0x00ff;
    L_0x01c5:
        r0 = r1;
        goto L_0x0045;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.c(java.io.File):com.whatsapp.ats");
    }

    public void A(String str) {
        e(str, true);
    }

    public void a(String str, co coVar) {
        try {
            Object obj;
            StringBuilder append = new StringBuilder().append(Y[213]).append(str).append("/");
            if (coVar != null) {
                obj = coVar.k;
            } else {
                obj = null;
            }
            Log.i(append.append(obj).toString());
            a5w com_whatsapp_a5w = (a5w) this.l.get(str);
            if (com_whatsapp_a5w != null) {
                long b = b(coVar);
                long e = a5w.e(com_whatsapp_a5w);
                if (b == 1) {
                    try {
                        b = a5w.h(com_whatsapp_a5w);
                    } catch (IllegalStateException e2) {
                        throw e2;
                    }
                }
                if (e < b) {
                    try {
                        a5w.a(com_whatsapp_a5w, b);
                        this.b.post(new o2(this, str, b));
                    } catch (IllegalStateException e22) {
                        throw e22;
                    }
                }
            }
        } catch (IllegalStateException e222) {
            throw e222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void s(@android.support.annotation.NonNull java.lang.String r5) {
        /*
        r4 = this;
        r0 = r4.l;
        r0 = r0.get(r5);
        r0 = (com.whatsapp.a5w) r0;
        r1 = com.whatsapp.App.aZ();	 Catch:{ IllegalStateException -> 0x003d }
        if (r1 == 0) goto L_0x003f;
    L_0x000e:
        r1 = 1;
    L_0x000f:
        if (r0 == 0) goto L_0x0018;
    L_0x0011:
        com.whatsapp.a5w.a(r0, r1);	 Catch:{ IllegalStateException -> 0x0041 }
        r0 = com.whatsapp.l5.s;	 Catch:{ IllegalStateException -> 0x0041 }
        if (r0 == 0) goto L_0x0032;
    L_0x0018:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0041 }
        r0.<init>();	 Catch:{ IllegalStateException -> 0x0041 }
        r2 = Y;	 Catch:{ IllegalStateException -> 0x0041 }
        r3 = 63;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0041 }
        r0 = r0.append(r2);	 Catch:{ IllegalStateException -> 0x0041 }
        r0 = r0.append(r5);	 Catch:{ IllegalStateException -> 0x0041 }
        r0 = r0.toString();	 Catch:{ IllegalStateException -> 0x0041 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ IllegalStateException -> 0x0041 }
    L_0x0032:
        r0 = r4.b;
        r2 = new com.whatsapp.a5l;
        r2.<init>(r4, r1, r5);
        r0.post(r2);
        return;
    L_0x003d:
        r0 = move-exception;
        throw r0;
    L_0x003f:
        r1 = 2;
        goto L_0x000f;
    L_0x0041:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.s(java.lang.String):void");
    }

    private void g(String str) {
    }

    private int c(java.lang.String r7) {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:com.whatsapp.ael.c(java.lang.String):int. bs: [B:15:0x0029, B:29:0x003f]
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
        r6 = this;
        r0 = 0;
        r1 = r6.a;
        monitor-enter(r1);
        r2 = r6.a;	 Catch:{ all -> 0x0043 }
        r2 = r2.getReadableDatabase();	 Catch:{ all -> 0x0043 }
        r3 = Y;	 Catch:{ all -> 0x0043 }
        r4 = 69;	 Catch:{ all -> 0x0043 }
        r3 = r3[r4];	 Catch:{ all -> 0x0043 }
        r4 = 1;	 Catch:{ all -> 0x0043 }
        r4 = new java.lang.String[r4];	 Catch:{ all -> 0x0043 }
        r5 = 0;	 Catch:{ all -> 0x0043 }
        r4[r5] = r7;	 Catch:{ all -> 0x0043 }
        r2 = r2.rawQuery(r3, r4);	 Catch:{ all -> 0x0043 }
        if (r2 == 0) goto L_0x0027;
    L_0x001c:
        r3 = r2.moveToNext();	 Catch:{ SQLiteDiskIOException -> 0x002e }
        if (r3 == 0) goto L_0x0027;
    L_0x0022:
        r0 = 0;
        r0 = r2.getInt(r0);	 Catch:{ SQLiteDiskIOException -> 0x0030 }
    L_0x0027:
        if (r2 == 0) goto L_0x002c;
    L_0x0029:
        r2.close();	 Catch:{ SQLiteDiskIOException -> 0x0046 }
    L_0x002c:
        monitor-exit(r1);	 Catch:{ all -> 0x0043 }
        return r0;
    L_0x002e:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x0030 }
    L_0x0030:
        r0 = move-exception;
        r3 = com.whatsapp.App.z();	 Catch:{ all -> 0x003c }
        r4 = 2131231111; // 0x7f080187 float:1.8078294E38 double:1.0529680753E-314;	 Catch:{ all -> 0x003c }
        com.whatsapp.util.p.a(r3, r4);	 Catch:{ all -> 0x003c }
        throw r0;	 Catch:{ all -> 0x003c }
    L_0x003c:
        r0 = move-exception;
        if (r2 == 0) goto L_0x0042;
    L_0x003f:
        r2.close();	 Catch:{ SQLiteDiskIOException -> 0x0048 }
    L_0x0042:
        throw r0;	 Catch:{ all -> 0x0043 }
    L_0x0043:
        r0 = move-exception;	 Catch:{ all -> 0x0043 }
        monitor-exit(r1);	 Catch:{ all -> 0x0043 }
        throw r0;
    L_0x0046:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0043 }
    L_0x0048:
        r0 = move-exception;	 Catch:{ all -> 0x0043 }
        throw r0;	 Catch:{ all -> 0x0043 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.c(java.lang.String):int");
    }

    public boolean j(String str) {
        try {
            return a(str, 1, null).size() > 0;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public Map N(String str) {
        boolean z = l5.s;
        Map concurrentHashMap = new ConcurrentHashMap();
        synchronized (this.a) {
            Cursor rawQuery = this.a.getReadableDatabase().rawQuery(Y[707], new String[]{str});
            if (rawQuery != null) {
                do {
                    if (rawQuery.moveToNext()) {
                        String str2;
                        CharSequence string = rawQuery.getString(0);
                        if (TextUtils.isEmpty(string)) {
                            str2 = App.as.e().p;
                        } else {
                            CharSequence charSequence = string;
                        }
                        try {
                            boolean z2;
                            boolean z3;
                            boolean z4;
                            int i = rawQuery.isNull(3) ? 0 : rawQuery.getInt(3);
                            if (rawQuery.getInt(1) == 1) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (rawQuery.getInt(2) == 1) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (i == 1) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            adl com_whatsapp_adl = new adl(str2, z2, z3, z4);
                            concurrentHashMap.put(com_whatsapp_adl.e, com_whatsapp_adl);
                        } catch (IllegalStateException e) {
                            throw e;
                        } catch (IllegalStateException e2) {
                            throw e2;
                        } catch (Throwable th) {
                            rawQuery.close();
                        }
                    }
                    rawQuery.close();
                } while (!z);
                rawQuery.close();
            }
        }
        return concurrentHashMap;
    }

    public Cursor a(String str, byte b) {
        Cursor rawQuery;
        synchronized (this.a) {
            rawQuery = this.a.getReadableDatabase().rawQuery(Y[733], new String[]{Byte.toString(b), str});
        }
        return rawQuery;
    }

    private static void b(File file, String str) {
        boolean z = l5.s;
        File[] listFiles = file.getParentFile().listFiles();
        if (listFiles != null) {
            try {
                if (listFiles.length > 0) {
                    int length = listFiles.length;
                    int i = 0;
                    while (i < length) {
                        File file2 = listFiles[i];
                        try {
                            try {
                                String str2;
                                StringBuilder append = new StringBuilder().append(str).append(file2.getName()).append(" ").append(file2.length()).append(Y[730]).append(file2.isDirectory() ? "1" : "0");
                                if (file2.canRead()) {
                                    str2 = "1";
                                } else {
                                    str2 = "0";
                                }
                                try {
                                    append = append.append(str2);
                                    if (file2.canWrite()) {
                                        str2 = "1";
                                    } else {
                                        str2 = "0";
                                    }
                                    Log.i(append.append(str2).toString());
                                    int i2 = i + 1;
                                    if (!z) {
                                        i = i2;
                                    } else {
                                        return;
                                    }
                                } catch (IllegalStateException e) {
                                    throw e;
                                }
                            } catch (IllegalStateException e2) {
                                throw e2;
                            }
                        } catch (IllegalStateException e22) {
                            throw e22;
                        }
                    }
                }
            } catch (IllegalStateException e222) {
                throw e222;
            }
        }
    }

    public void A() {
        ab abVar = new ab(Y[203]);
        SQLiteDatabase readableDatabase = this.a.getReadableDatabase();
        try {
            readableDatabase.beginTransaction();
            readableDatabase.execSQL(Y[206]);
            readableDatabase.execSQL(Y[202]);
            d(Y[204], 0);
            d(Y[207], 0);
            d(Y[201], 0);
            readableDatabase.setTransactionSuccessful();
            Log.i(Y[205] + abVar.b());
        } finally {
            try {
                if (readableDatabase.inTransaction()) {
                    readableDatabase.endTransaction();
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }
    }

    public int F(@NonNull String str) {
        a5w com_whatsapp_a5w = (a5w) this.l.get(str);
        return com_whatsapp_a5w == null ? 0 : a5w.d(com_whatsapp_a5w);
    }

    public Cursor c(String str, String str2, CancellationSignal cancellationSignal) {
        Cursor a;
        synchronized (this.a) {
            CharSequence charSequence;
            if (TextUtils.isEmpty(str2)) {
                charSequence = null;
            } else {
                charSequence = f(str2);
            }
            if (TextUtils.isEmpty(charSequence)) {
                a = a(Y[488], new String[]{str}, cancellationSignal);
            } else {
                a = a(Y[487], new String[]{str, charSequence}, cancellationSignal);
            }
        }
        return a;
    }

    private static int H() {
        return new Random().nextInt(999999) + 1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.whatsapp.nj a(java.lang.String r11, long r12, int r14, com.whatsapp.nt r15) {
        /*
        r10 = this;
        r3 = com.whatsapp.l5.s;
        r4 = new com.whatsapp.util.ab;
        r0 = Y;
        r1 = 679; // 0x2a7 float:9.51E-43 double:3.355E-321;
        r0 = r0[r1];
        r4.<init>(r0);
        r0 = 0;
        r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1));
        if (r0 > 0) goto L_0x0015;
    L_0x0013:
        r0 = 0;
    L_0x0014:
        return r0;
    L_0x0015:
        r0 = r10.l;
        r0 = r0.get(r11);
        r0 = (com.whatsapp.a5w) r0;
        if (r0 != 0) goto L_0x003d;
    L_0x001f:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x003b }
        r0.<init>();	 Catch:{ IllegalStateException -> 0x003b }
        r1 = Y;	 Catch:{ IllegalStateException -> 0x003b }
        r2 = 681; // 0x2a9 float:9.54E-43 double:3.365E-321;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x003b }
        r0 = r0.append(r1);	 Catch:{ IllegalStateException -> 0x003b }
        r0 = r0.append(r11);	 Catch:{ IllegalStateException -> 0x003b }
        r0 = r0.toString();	 Catch:{ IllegalStateException -> 0x003b }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IllegalStateException -> 0x003b }
        r0 = 0;
        goto L_0x0014;
    L_0x003b:
        r0 = move-exception;
        throw r0;
    L_0x003d:
        r6 = com.whatsapp.a5w.k(r0);	 Catch:{ IllegalStateException -> 0x0120 }
        r8 = 1;
        r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r1 != 0) goto L_0x0122;
    L_0x0047:
        r1 = 1;
    L_0x0048:
        if (r1 == 0) goto L_0x0051;
    L_0x004a:
        r6 = r10.d(r11, r14);	 Catch:{ IllegalStateException -> 0x0125 }
        com.whatsapp.a5w.b(r0, r6);	 Catch:{ IllegalStateException -> 0x0125 }
    L_0x0051:
        r2 = new com.whatsapp.nj;
        r2.<init>();
        r6 = com.whatsapp.a5w.k(r0);	 Catch:{ IllegalStateException -> 0x0127 }
        r5 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1));
        if (r5 >= 0) goto L_0x006a;
    L_0x005e:
        com.whatsapp.a5w.b(r0, r12);	 Catch:{ IllegalStateException -> 0x0127 }
        r5 = 0;
        r5 = r10.a(r11, r14, r5, r15);	 Catch:{ IllegalStateException -> 0x0127 }
        r2.a = r5;	 Catch:{ IllegalStateException -> 0x0127 }
        if (r3 == 0) goto L_0x0072;
    L_0x006a:
        if (r1 == 0) goto L_0x0072;
    L_0x006c:
        r1 = r10.a(r11, r14, r15);	 Catch:{ IllegalStateException -> 0x012b }
        r2.a = r1;	 Catch:{ IllegalStateException -> 0x012b }
    L_0x0072:
        r1 = 3;
        r1 = new java.lang.String[r1];
        r5 = 0;
        r1[r5] = r11;
        r5 = 1;
        r6 = com.whatsapp.a5w.k(r0);
        r0 = java.lang.Long.toString(r6);
        r1[r5] = r0;
        r0 = 2;
        r5 = java.lang.Long.toString(r12);
        r1[r0] = r5;
        r0 = r10.a;
        r0 = r0.getReadableDatabase();
        r5 = Y;
        r6 = 675; // 0x2a3 float:9.46E-43 double:3.335E-321;
        r5 = r5[r6];
        r1 = r0.rawQuery(r5, r1);
        if (r1 == 0) goto L_0x00e6;
    L_0x009c:
        r0 = r1.moveToNext();	 Catch:{ IllegalStateException -> 0x012d }
        if (r0 == 0) goto L_0x00c7;
    L_0x00a2:
        r0 = 0;
        r0 = r1.getInt(r0);	 Catch:{ IllegalStateException -> 0x012d }
        r2.b = r0;	 Catch:{ IllegalStateException -> 0x012d }
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x012d }
        r0.<init>();	 Catch:{ IllegalStateException -> 0x012d }
        r5 = Y;	 Catch:{ IllegalStateException -> 0x012d }
        r6 = 678; // 0x2a6 float:9.5E-43 double:3.35E-321;
        r5 = r5[r6];	 Catch:{ IllegalStateException -> 0x012d }
        r0 = r0.append(r5);	 Catch:{ IllegalStateException -> 0x012d }
        r5 = r2.b;	 Catch:{ IllegalStateException -> 0x012d }
        r0 = r0.append(r5);	 Catch:{ IllegalStateException -> 0x012d }
        r0 = r0.toString();	 Catch:{ IllegalStateException -> 0x012d }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x012d }
        if (r3 == 0) goto L_0x00e1;
    L_0x00c7:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x012f }
        r0.<init>();	 Catch:{ IllegalStateException -> 0x012f }
        r5 = Y;	 Catch:{ IllegalStateException -> 0x012f }
        r6 = 677; // 0x2a5 float:9.49E-43 double:3.345E-321;
        r5 = r5[r6];	 Catch:{ IllegalStateException -> 0x012f }
        r0 = r0.append(r5);	 Catch:{ IllegalStateException -> 0x012f }
        r0 = r0.append(r11);	 Catch:{ IllegalStateException -> 0x012f }
        r0 = r0.toString();	 Catch:{ IllegalStateException -> 0x012f }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x012f }
    L_0x00e1:
        r1.close();
        if (r3 == 0) goto L_0x00ef;
    L_0x00e6:
        r0 = Y;	 Catch:{ IllegalStateException -> 0x0136 }
        r1 = 682; // 0x2aa float:9.56E-43 double:3.37E-321;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x0136 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IllegalStateException -> 0x0136 }
    L_0x00ef:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = Y;
        r3 = 680; // 0x2a8 float:9.53E-43 double:3.36E-321;
        r1 = r1[r3];
        r0 = r0.append(r1);
        r1 = r2.b;
        r0 = r0.append(r1);
        r1 = Y;
        r3 = 676; // 0x2a4 float:9.47E-43 double:3.34E-321;
        r1 = r1[r3];
        r0 = r0.append(r1);
        r4 = r4.b();
        r0 = r0.append(r4);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r2;
        goto L_0x0014;
    L_0x0120:
        r0 = move-exception;
        throw r0;
    L_0x0122:
        r1 = 0;
        goto L_0x0048;
    L_0x0125:
        r0 = move-exception;
        throw r0;
    L_0x0127:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0129 }
    L_0x0129:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x012b }
    L_0x012b:
        r0 = move-exception;
        throw r0;
    L_0x012d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x012f }
    L_0x012f:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0131 }
    L_0x0131:
        r0 = move-exception;
        r1.close();
        throw r0;
    L_0x0136:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.a(java.lang.String, long, int, com.whatsapp.nt):com.whatsapp.nj");
    }

    private void a(sw swVar) {
        boolean z = l5.s;
        for (co a : this.p.values()) {
            swVar.a(a);
            if (z) {
                break;
            }
        }
        for (co a2 : this.z.values()) {
            swVar.a(a2);
            if (z) {
                break;
            }
        }
        for (a5w com_whatsapp_a5w : this.l.values()) {
            try {
                if (a5w.c(com_whatsapp_a5w) != null) {
                    swVar.a(a5w.c(com_whatsapp_a5w));
                    continue;
                }
                if (z) {
                    break;
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        for (co a22 : v.b()) {
            swVar.a(a22);
            if (z) {
                return;
            }
        }
    }

    public boolean E() {
        return this.u;
    }

    static boolean z() {
        return M;
    }

    static uz e(ael com_whatsapp_ael) {
        return com_whatsapp_ael.n;
    }

    public co a(long j) {
        co coVar = null;
        synchronized (this.a) {
            Cursor rawQuery = this.a.getReadableDatabase().rawQuery(Y[454], new String[]{String.valueOf(j)});
            if (rawQuery != null) {
                int columnIndex = rawQuery.getColumnIndex(Y[455]);
                try {
                    if (rawQuery.moveToLast()) {
                        coVar = a(rawQuery, rawQuery.getString(columnIndex));
                    }
                    rawQuery.close();
                } catch (Throwable th) {
                    rawQuery.close();
                }
            } else {
                Log.e(Y[453]);
            }
        }
        return coVar;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList b(long r10, int r12) {
        /*
        r9 = this;
        r1 = com.whatsapp.l5.s;
        r2 = new com.whatsapp.util.ab;
        r2.<init>();
        r0 = Y;
        r3 = 356; // 0x164 float:4.99E-43 double:1.76E-321;
        r0 = r0[r3];
        r2.b(r0);
        r3 = new java.util.ArrayList;
        r3.<init>();
        r0 = r9.a;
        r0 = r0.getReadableDatabase();
        r4 = Y;
        r5 = 353; // 0x161 float:4.95E-43 double:1.744E-321;
        r4 = r4[r5];
        r5 = 1;
        r5 = new java.lang.String[r5];
        r6 = 0;
        r7 = java.lang.Long.toString(r10);
        r5[r6] = r7;
        r4 = r0.rawQuery(r4, r5);
        r0 = Y;	 Catch:{ IllegalStateException -> 0x00b1, SQLiteDiskIOException -> 0x00d8 }
        r5 = 354; // 0x162 float:4.96E-43 double:1.75E-321;
        r0 = r0[r5];	 Catch:{ IllegalStateException -> 0x00b1, SQLiteDiskIOException -> 0x00d8 }
        r5 = r4.getColumnIndex(r0);	 Catch:{ IllegalStateException -> 0x00b1, SQLiteDiskIOException -> 0x00d8 }
        if (r4 == 0) goto L_0x0079;
    L_0x003b:
        r0 = r4.moveToNext();	 Catch:{ IllegalStateException -> 0x00af, SQLiteDiskIOException -> 0x00d8 }
        if (r0 == 0) goto L_0x0079;
    L_0x0041:
        r0 = r4.getString(r5);	 Catch:{ IllegalStateException -> 0x00b1, SQLiteDiskIOException -> 0x00d8 }
        if (r0 != 0) goto L_0x0052;
    L_0x0047:
        r6 = Y;	 Catch:{ IllegalStateException -> 0x00d6, SQLiteDiskIOException -> 0x00d8 }
        r7 = 350; // 0x15e float:4.9E-43 double:1.73E-321;
        r6 = r6[r7];	 Catch:{ IllegalStateException -> 0x00d6, SQLiteDiskIOException -> 0x00d8 }
        com.whatsapp.util.Log.w(r6);	 Catch:{ IllegalStateException -> 0x00d6, SQLiteDiskIOException -> 0x00d8 }
        if (r1 == 0) goto L_0x003b;
    L_0x0052:
        r6 = r9.a(r4, r0);	 Catch:{ IllegalStateException -> 0x00b1, SQLiteDiskIOException -> 0x00d8 }
        r0 = r6.Q;	 Catch:{ IllegalStateException -> 0x00b1, SQLiteDiskIOException -> 0x00d8 }
        if (r0 == 0) goto L_0x006d;
    L_0x005a:
        r0 = r6.Q;	 Catch:{ IllegalStateException -> 0x00b1, SQLiteDiskIOException -> 0x00d8 }
        r0 = (com.whatsapp.MediaData) r0;	 Catch:{ IllegalStateException -> 0x00b1, SQLiteDiskIOException -> 0x00d8 }
        r7 = r0.transferred;	 Catch:{ IllegalStateException -> 0x00eb, SQLiteDiskIOException -> 0x00d8 }
        if (r7 != 0) goto L_0x006d;
    L_0x0062:
        r7 = r0.transferring;	 Catch:{ IllegalStateException -> 0x00eb, SQLiteDiskIOException -> 0x00d8 }
        if (r7 != 0) goto L_0x006d;
    L_0x0066:
        r0 = r0.autodownloadRetryEnabled;	 Catch:{ IllegalStateException -> 0x00ed, SQLiteDiskIOException -> 0x00d8 }
        if (r0 == 0) goto L_0x006d;
    L_0x006a:
        r3.add(r6);	 Catch:{ IllegalStateException -> 0x00ef, SQLiteDiskIOException -> 0x00d8 }
    L_0x006d:
        if (r12 < 0) goto L_0x0077;
    L_0x006f:
        r0 = r3.size();	 Catch:{ IllegalStateException -> 0x00f1, SQLiteDiskIOException -> 0x00d8 }
        if (r0 < r12) goto L_0x0077;
    L_0x0075:
        if (r1 == 0) goto L_0x0079;
    L_0x0077:
        if (r1 == 0) goto L_0x003b;
    L_0x0079:
        if (r4 == 0) goto L_0x007e;
    L_0x007b:
        r4.close();	 Catch:{ IllegalStateException -> 0x00f7 }
    L_0x007e:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = Y;
        r4 = 352; // 0x160 float:4.93E-43 double:1.74E-321;
        r1 = r1[r4];
        r0 = r0.append(r1);
        r1 = r3.size();
        r0 = r0.append(r1);
        r1 = Y;
        r4 = 355; // 0x163 float:4.97E-43 double:1.754E-321;
        r1 = r1[r4];
        r0 = r0.append(r1);
        r4 = r2.b();
        r0 = r0.append(r4);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        return r3;
    L_0x00af:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00b1, SQLiteDiskIOException -> 0x00d8 }
    L_0x00b1:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00e4 }
        r1.<init>();	 Catch:{ all -> 0x00e4 }
        r5 = Y;	 Catch:{ all -> 0x00e4 }
        r6 = 351; // 0x15f float:4.92E-43 double:1.734E-321;
        r5 = r5[r6];	 Catch:{ all -> 0x00e4 }
        r1 = r1.append(r5);	 Catch:{ all -> 0x00e4 }
        r0 = r0.toString();	 Catch:{ all -> 0x00e4 }
        r0 = r1.append(r0);	 Catch:{ all -> 0x00e4 }
        r0 = r0.toString();	 Catch:{ all -> 0x00e4 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ all -> 0x00e4 }
        if (r4 == 0) goto L_0x007e;
    L_0x00d2:
        r4.close();
        goto L_0x007e;
    L_0x00d6:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00b1, SQLiteDiskIOException -> 0x00d8 }
    L_0x00d8:
        r0 = move-exception;
        r1 = com.whatsapp.App.z();	 Catch:{ all -> 0x00e4 }
        r2 = 2131231111; // 0x7f080187 float:1.8078294E38 double:1.0529680753E-314;
        com.whatsapp.util.p.a(r1, r2);	 Catch:{ all -> 0x00e4 }
        throw r0;	 Catch:{ all -> 0x00e4 }
    L_0x00e4:
        r0 = move-exception;
        if (r4 == 0) goto L_0x00ea;
    L_0x00e7:
        r4.close();	 Catch:{ IllegalStateException -> 0x00f9 }
    L_0x00ea:
        throw r0;
    L_0x00eb:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00ed, SQLiteDiskIOException -> 0x00d8 }
    L_0x00ed:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00ef, SQLiteDiskIOException -> 0x00d8 }
    L_0x00ef:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00b1, SQLiteDiskIOException -> 0x00d8 }
    L_0x00f1:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00f3, SQLiteDiskIOException -> 0x00d8 }
    L_0x00f3:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00f5, SQLiteDiskIOException -> 0x00d8 }
    L_0x00f5:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00b1, SQLiteDiskIOException -> 0x00d8 }
    L_0x00f7:
        r0 = move-exception;
        throw r0;
    L_0x00f9:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.b(long, int):java.util.ArrayList");
    }

    public void q() {
        SQLiteDatabase sQLiteDatabase = null;
        Log.i(Y[46]);
        ab abVar = new ab(Y[49]);
        this.z.clear();
        synchronized (this.a) {
            try {
                sQLiteDatabase = this.a.getWritableDatabase();
                sQLiteDatabase.beginTransaction();
                sQLiteDatabase.execSQL(Y[50]);
                sQLiteDatabase.execSQL(Y[52]);
                sQLiteDatabase.delete(Y[47], null, null);
                sQLiteDatabase.delete(Y[45], null, null);
                sQLiteDatabase.delete(Y[51], null, null);
                sQLiteDatabase.delete(Y[48], null, null);
                sQLiteDatabase.setTransactionSuccessful();
                if (sQLiteDatabase != null) {
                    if (sQLiteDatabase.inTransaction()) {
                        sQLiteDatabase.endTransaction();
                    }
                }
            } catch (IllegalStateException e) {
                throw e;
            } catch (Throwable th) {
                if (sQLiteDatabase != null) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (IllegalStateException e2) {
                        throw e2;
                    } catch (IllegalStateException e22) {
                        throw e22;
                    }
                }
            }
        }
        bk.a(dg.i());
        Message.obtain(this.j, 8).sendToTarget();
        Log.i(Y[53] + abVar.b());
    }

    static {
        Object obj = -1;
        boolean z = true;
        String[] strArr = new String[772];
        int i = 0;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        String str = "fZ\u0007w@hR\u0011\\WRU\u0017L\u000f2";
        boolean z2 = true;
        while (true) {
            str = z(z(str));
            switch (z2) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "fZ\u0007w@hR\u0011\\WRU\u0017L\u000f2";
                    i = 2;
                    strArr2 = strArr3;
                    z2 = true;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "fZ\u0007w@hR\u0011\\WRU\u0017L";
                    z2 = true;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "nW\u001f\\maV\r\\";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "fZ\u0007w@hR\u0011\\WRU\u0017L\u000f2";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "nW\u001f\\maV\r\\";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "`Z\r[SjZ!\\SoS\u001bw[i";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    str = "`L\u0019[FbM\u001b\u0007VhS\u001b\\W`L\u0019\u0007Qe^\nD[~KQA\\~Z\f\\\u001dk^\u0017DWi\u001f\u0019AV0";
                    z2 = true;
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    strArr2 = strArr3;
                    str = "nW\u001f\\maV\r\\";
                    z2 = true;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "`P\u001awFlX";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "`P\u001awFlX";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "fZ\u0007w@hR\u0011\\WRU\u0017L";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "nW\u001f\\maV\r\\";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "`L\u0019[FbM\u001b\u0007VhS\u001b\\W`L\u0019\u0007Qe^\nD[~KQA\\~Z\f\\\u001dk^\u0017DWi\u001f\u0019AV0";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "~P\f\\myV\u0013MAy^\u0013X";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "fZ\u0007w@hR\u0011\\WRU\u0017L\u000f2\u001f?fv-T\u001bQmkM\u0011Em`ZC\u0017\u0012Lq:\bYhF!AV0\u0000";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "`Z\r[SjZ\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "~K\u001f\\G~";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "`L\u0019[FbM\u001b\u0007GcL\u001bFF\"U\u0017L\u0012dL^FGaS_";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "`L\u0019[FbM\u001b\u0007GcL\u001bFF\"^\u001aL\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "fZ\u0007w@hR\u0011\\WRU\u0017L";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "`L\u0019[FbM\u001b\u0007GcL\u001bFF\"v\u0012DWj^\u0012{FlK\u001bmJnZ\u000e\\[bQ^";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "`L\u0019[FbM\u001b\u0007GcL\u001bFF-";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "`L\u0019[FbM\u001b\u0007GcL\u001bFV`Z\r[SjZ\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "-C^\\[`Z^[BhQ\n\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "xQ\rM\\y\u001f\u0013MA~^\u0019MA-\\\u001fKZh\u001f\u0017F[yV\u001fD[w^\nA]c\u001f\u0018I[aZ\u001a\bFb\u001f\u001d@ScX\u001b\bFeZ^ZWa^\nMV-Y\u0012IU";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "`L\u0019[FbM\u001b\u0007VhS\u001b\\W`L\u0019[\u001dgV\u001a\b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "gV\u001a";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "jU\u0017L\u000f2";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "jM\u0011]BRO\u001fZFd\\\u0017XScK\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "`L\u0019[FbM\u001b\u0007G}[\u001f\\Wy^\fOWyL\nIFxLQF]~J\u001d@_hL\rIUh\u0005^";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "`L\u0019[FbM\u001b\u0007G}[\u001f\\Wy^\fOWyL\nIFxLQA\\{^\u0012AV`Z\r[SjZD\b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "-\\\u000bZ@hQ\n\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "-\\\u000bZ@hQ\n\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "`L\u0019[FbM\u001b\u0007G}[\u001f\\Wy^\fOWyL\nIFxLQF]~J\u001d@_hL\rIUh\u001f\u0018G@-]\fGSi\\\u001f[F7\u001f";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "`L\u0019[FbM\u001b\u0007G}[\u001f\\Wy^\fOWyL\nIFxLQM@\u007fP\f\b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "-Q\u001b_\b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "`L\u0019[FbM\u001b\u0007G}[\u001f\\Wy^\fOWyL\nIFxLQ[FlK\u000b[VbH\u0010O@l[\u001b\u0012\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "-Q\u001b_\b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "`L\u0019[FbM\u001b\u0007G}[\u001f\\Wy^\fOWyL\nIFxLQ[FlK\u000b[VbH\u0010O@l[\u001b\u0012\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "`L\u0019[FbM\u001b\u0007UhK\u0019Z]xO\u0017FTb\u0010\u0019AV-";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "^z2mqY\u001f\r]PgZ\u001d\\\u001e-\\\fMSyV\u0011F\u0012Km1e\u0012nW\u001f\\maV\r\\\u0012Zw;zw-T\u001bQm\u007fZ\u0013GFh`\u0014AV0\u0000";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "`L\u0019[FbM\u001b\u0007UhK\u0019Z]xO\u0017FTb\u0010\u0019AV\"V\u0010^SaV\u001a\b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "`L\u0019[FbM\u001b\u0007U\u007fP\u000bX[cY\u0011\u0007W\u007fM\u0011Z\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "`Z\u001aASRM\u001bNA";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "`L\u0019[FbM\u001b\u0007QaZ\u001fZSaS\u0013[U~";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "\u007fZ\u001dM[}K\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "`Z\r[SjZ\rw^dQ\u0015[";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "`L\u0019[FbM\u001b\u0007QaZ\u001fZSaS\u0013[U~";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "Iz2mfH\u001f8z}@\u001f\u0013MA~^\u0019MA-h6m`H\u001f!AV,\u0002O\bsC{^EWiV\u001fwEl`\nQBh\u001f_\u0015\u00125";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "`Z\r[SjZ\rwTyL";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "Xo:ifH\u001f\u001d@Sy`\u0012AAy\u001f-mf-R\u001b[AlX\u001bwFl]\u0012Mmd[C\u0019\u001e-R\u0011Lmy^\u0019\u0015\u0002";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "`L\u0019[FbM\u001b\u0007QaZ\u001fZSaS\u0013[U~\u001f\nA_h\u001f\rXWcKD";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "-K\u0017EW-L\u000eM\\y\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "`L\u0019[FbM\u001b\u0007VhS\u001b\\W`L\u0019[";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "-L\u000bKQhL\r\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "Iz2mfH\u001f8z}@\u001f\u001d@Sy`\u0012AAy\u001f)`w_z^CWt`\fM_bK\u001bwXd[C\u0017";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "`L\u0019[FbM\u001b\u0007VhS\u001b\\W`L\u0019[\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "Iz2mfH\u001f8z}@\u001f\fMQhV\u000e\\A-h6m`H\u001f\u0015MKRM\u001bE]yZ!B[i\u0002A";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "jU\u0017L\u000f2";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "Iz2mfH\u001f8z}@\u001f\u0013MA~^\u0019MA-h6m`H\u001f\u0015MKRM\u001bE]yZ!B[i\u0002A\bsC{^EWiV\u001fwEl`\nQBh\u001eC\u0010";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "jM\u0011]BRO\u001fZFd\\\u0017XScK\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "`V\r[[cX^KZlK^A\\kPE\bXd[C";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "`L\u0019[FbM\u001b\u0007QlS\u0012[\u001dgV\u001a\b[~\u001f\u0010]^a\u001e";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "`L\u0019[FbM\u001b\u0007QlS\u0012[\u001di]QKG\u007fL\u0011Z\u0012dL^FGaS";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "`L\u0019[FbM\u001b\u0007QlS\u0012[\u001d~V\u0004M\b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "fZ\u0007w@hR\u0011\\WRU\u0017L";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "^z2mqY\u001f\u0015MKRY\fG_RR\u001b\u0004\u0012fZ\u0007w[i\u0013^[FlK\u000b[\u001e-Q\u001bMV~`\u000e]Ae\u0013^LSy^R\bFdR\u001b[FlR\u000e\u0004\u0012`Z\u001aASRJ\fD\u001e-R\u001bL[l`\u0013A_h`\nQBh\u0013^EWiV\u001fwEl`\nQBh\u0013^EWiV\u001fwAdE\u001b\u0004\u0012`Z\u001aASRQ\u001fEW!\u001f\u0013MVd^!KS}K\u0017G\\!\u001f\u0013MVd^!@S~WR\b_h[\u0017ImiJ\fIFdP\u0010\u0004\u0012bM\u0017O[c\u0013^DSyV\n]Vh\u0013^D]cX\u0017\\GiZR\bFeJ\u0013JmdR\u001fOW!\u001f\fM_bK\u001bw@hL\u0011]@nZR\b@lH!LSy^R\b@h\\\u0017X[hQ\nwQbJ\u0010\\\u001e-O\u001fZFd\\\u0017XScK!@S~WR\bAy^\fZWi\u0013^w[i\u0013^CWt`\fM_bK\u001bwXd[^n`Br^EW~L\u001fOW~\u001f)`w_z^EWiV\u001fwEl`\nQBh\u0002F\b}_{;z\u0012Of^w[i\u001f:maN\u001f2a\u007fDk^\u0017\u001e2";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    strArr2[i] = str;
                    i = 69;
                    str = "^z2mqY\u001f\fMTR\\\u0011]\\y\u001f8z}@\u001f\u0013MVd^!ZWkL^\u007fzHm;\bBlK\u0016\u0015\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    strArr2[i] = str;
                    i = 70;
                    str = "`L\u0019[FbM\u001b\u0007[cV\nASaV\u0004M";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeight /*69*/:
                    strArr2[i] = str;
                    i = 71;
                    str = "^z2mqY\u001f\u0015MKRY\fG_RR\u001b\u0004\u0012fZ\u0007w[i\u0013^[FlK\u000b[\u001e-Q\u001bMV~`\u000e]Ae\u0013^LSy^R\bFdR\u001b[FlR\u000e\u0004\u0012`Z\u001aASRJ\fD\u001e-R\u001bL[l`\u0013A_h`\nQBh\u0013^EWiV\u001fwEl`\nQBh\u0013^EWiV\u001fwAdE\u001b\u0004\u0012`Z\u001aASRQ\u001fEW!\u001f\u0013MVd^!KS}K\u0017G\\!\u001f\u0013MVd^!@S~WR\b_h[\u0017ImiJ\fIFdP\u0010\u0004\u0012bM\u0017O[c\u0013^DSyV\n]Vh\u0013^D]cX\u0017\\GiZR\bFeJ\u0013JmdR\u001fOW!\u001f\fM_bK\u001bw@hL\u0011]@nZR\b@lH!LSy^R\b@h\\\u0017X[hQ\nwQbJ\u0010\\\u001e-O\u001fZFd\\\u0017XScK!@S~WR\bAy^\fZWi\u0013^w[i\u0013^CWt`\fM_bK\u001bwXd[^n`Br^EW~L\u001fOW~\u001f)`w_z^w[i\u001f7f\u0012%l;dwNk^L]nV\u001a\bt_p3\b_hL\rIUhL!NF~\u0013^EW~L\u001fOW~\u001f)`w_z^CWt`\fM_bK\u001bwXd[^\u0015\u00122\u001f?fv-\\\u0011FFhQ\n\b\u007fLk=`\u00122\u001f?fv-R\u001b[AlX\u001b[mkK\r\u0006Vb\\\u0017L\u00120\u001f\u0013MA~^\u0019MA#`\u0017L\u0012Lq:\b_hL\rIUhLP[FlM\fMV-\u0002^\u0019\u001b-p,lw_\u001f<q\u0012RV\u001a\bvHl=";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightSmall /*70*/:
                    strArr2[i] = str;
                    i = 72;
                    str = "^z2mqY\u001f\u0015MKRY\fG_RR\u001b\u0004\u0012fZ\u0007w[i\u0013^[FlK\u000b[\u001e-Q\u001bMV~`\u000e]Ae\u0013^LSy^R\bFdR\u001b[FlR\u000e\u0004\u0012`Z\u001aASRJ\fD\u001e-R\u001bL[l`\u0013A_h`\nQBh\u0013^EWiV\u001fwEl`\nQBh\u0013^EWiV\u001fwAdE\u001b\u0004\u0012`Z\u001aASRQ\u001fEW!\u001f\u0013MVd^!KS}K\u0017G\\!\u001f\u0013MVd^!@S~WR\b_h[\u0017ImiJ\fIFdP\u0010\u0004\u0012bM\u0017O[c\u0013^DSyV\n]Vh\u0013^D]cX\u0017\\GiZR\bFeJ\u0013JmdR\u001fOW!\u001f\fM_bK\u001bw@hL\u0011]@nZR\b@lH!LSy^R\b@h\\\u0017X[hQ\nwQbJ\u0010\\\u001e-O\u001fZFd\\\u0017XScK!@S~WR\bAy^\fZWi\u0013^w[i\u0013^CWt`\fM_bK\u001bwXd[^n`Br^EW~L\u001fOW~\u001f)`w_z^CWt`\fM_bK\u001bwXd[^\u0015\u00122\u001f?fv-L\nI@\u007fZ\u001a\u0015\u0003-p,lw_\u001f<q\u0012RV\u001a\bvHl=";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightLarge /*71*/:
                    strArr2[i] = str;
                    i = 73;
                    str = "-V\u0010LWu\u0002";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingLeft /*72*/:
                    strArr2[i] = str;
                    i = 74;
                    str = "aV\u0010CARV\u0010LWu`\u001f\\FhR\u000e\\mnP\u000bFF";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingRight /*73*/:
                    strArr2[i] = str;
                    i = 75;
                    str = "`L\u0019[FbM\u001b\u0007Pl\\\u0015]B\"Z\fZ]\u007fLQK]xQ\n\b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropDownListViewStyle /*74*/:
                    strArr2[i] = str;
                    i = 76;
                    str = "@Z\r[SjZ-\\]\u007fZ]jSnT\u000bXvo";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPopupWindowStyle /*75*/:
                    strArr2[i] = str;
                    i = 77;
                    str = "a^\r\\mkK\rw[c[\u001bPm~K\u001fZF";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItem /*76*/:
                    strArr2[i] = str;
                    i = 78;
                    str = "`L\u0019[FbM\u001b\u0007Pl\\\u0015]Bi]QJWkP\fMQaP\rM\u001daV\r\\\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItemSmall /*77*/:
                    strArr2[i] = str;
                    i = 79;
                    str = "a^\r\\mkK\rw[c[\u001bPm~K\u001fZF";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelBackground /*78*/:
                    strArr2[i] = str;
                    i = 80;
                    str = "a^\r\\maV\u0010CARV\u0010LWu`\r\\S\u007fK";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListWidth /*79*/:
                    strArr2[i] = str;
                    i = 81;
                    str = "-P\n@W\u007f\u0002";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListTheme /*80*/:
                    strArr2[i] = str;
                    i = 82;
                    str = "kK\rw[c[\u001bPmlK\nM_}K!K]xQ\n";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listChoiceBackgroundIndicator /*81*/:
                    strArr2[i] = str;
                    i = 83;
                    str = "nP\u0013\u0006Ee^\n[S}O!X@hY\u001bZWc\\\u001b[";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimary /*82*/:
                    strArr2[i] = str;
                    i = 84;
                    str = "a^\r\\maV\u0010CARV\u0010LWu`\r\\S\u007fK";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimaryDark /*83*/:
                    strArr2[i] = str;
                    i = 85;
                    str = "aV\u0010CARV\u0010LWu`\u001f\\FhR\u000e\\mnP\u000bFF";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorAccent /*84*/:
                    strArr2[i] = str;
                    i = 86;
                    str = "kK\rw[c[\u001bPm~K\u001fZF";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlNormal /*85*/:
                    strArr2[i] = str;
                    i = 87;
                    str = "nP\u0013\u0006Ee^\n[S}O!X@hY\u001bZWc\\\u001b[";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlActivated /*86*/:
                    strArr2[i] = str;
                    i = 88;
                    str = "`L\u0019[FbM\u001b\u0007Pl\\\u0015]Bi]QJSnT\u000bX\u001dhM\fG@-";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlHighlight /*87*/:
                    strArr2[i] = str;
                    i = 89;
                    str = "aV\u0010CARV\u0010LWu`\r\\S\u007fK";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorButtonNormal /*88*/:
                    strArr2[i] = str;
                    i = 90;
                    str = "`L\u0019[FbM\u001b\u0007Pl\\\u0015]Bi]QITyZ\fK^bL\u001b\u0007^dL\n\b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorSwitchThumbNormal /*89*/:
                    strArr2[i] = str;
                    i = 91;
                    str = "`L\u0019[FbM\u001b\u0007Pl\\\u0015]Bi]QKZh\\\u0015\u0007[cI\u001fD[i";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_controlBackground /*90*/:
                    strArr2[i] = str;
                    i = 92;
                    str = "kK\rw[c[\u001bPmlK\nM_}K!K]xQ\n";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogStyle /*91*/:
                    strArr2[i] = str;
                    i = 93;
                    str = "cZ\twBe^\r@";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogButtonGroupStyle /*92*/:
                    strArr2[i] = str;
                    i = 94;
                    str = "gV\u001a";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogCenterButtons /*93*/:
                    strArr2[i] = str;
                    i = 95;
                    str = "l[\u0013A\\";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogTheme /*94*/:
                    strArr2[i] = str;
                    i = 96;
                    str = "}Z\u0010L[cX";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorAlertDialogListItem /*95*/:
                    strArr2[i] = str;
                    i = 97;
                    str = "}Z\u0010L[cX";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarPositiveButtonStyle /*96*/:
                    strArr2[i] = str;
                    i = 98;
                    str = "jU\u0017L\u000f2\u001f\u001fFV-U\u0017L\u000f2";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNegativeButtonStyle /*97*/:
                    strArr2[i] = str;
                    i = 99;
                    str = "gV\u001a";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNeutralButtonStyle /*98*/:
                    strArr2[i] = str;
                    i = 100;
                    str = "jU\u0017L";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_autoCompleteTextViewStyle /*99*/:
                    strArr2[i] = str;
                    i = arj.Theme_buttonStyleSmall;
                    str = "jM\u0011]BRO\u001fZFd\\\u0017XScK\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyle /*100*/:
                    strArr2[i] = str;
                    i = arj.Theme_checkboxStyle;
                    str = "jM\u0011]BRO\u001fZFd\\\u0017XScK\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyleSmall /*101*/:
                    strArr2[i] = str;
                    i = arj.Theme_checkedTextViewStyle;
                    str = "~Z\u0010\\m~Z\u0010LW\u007f`\u0015MK";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_checkboxStyle /*102*/:
                    strArr2[i] = str;
                    i = arj.Theme_editTextStyle;
                    str = "jM\u0011]BRO\u001fZFd\\\u0017XScK\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_checkedTextViewStyle /*103*/:
                    strArr2[i] = str;
                    i = arj.Theme_radioButtonStyle;
                    str = "bS\u001awBe^\r@";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextStyle /*104*/:
                    strArr2[i] = str;
                    i = arj.Theme_ratingBarStyle;
                    str = "jU\u0017L\u000f2\u001f\u001fFV-U\u0017L\u000f2";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_radioButtonStyle /*105*/:
                    strArr2[i] = str;
                    i = arj.Theme_seekBarStyle;
                    str = "gV\u001a";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_ratingBarStyle /*106*/:
                    strArr2[i] = str;
                    i = arj.Theme_spinnerStyle;
                    str = "jM\u0011]BRO\u001fZFd\\\u0017XScK\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_seekBarStyle /*107*/:
                    strArr2[i] = str;
                    i = arj.Theme_switchStyle;
                    str = "jM\u0011]BRO\u001fZFd\\\u0017XScK\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerStyle /*108*/:
                    strArr2[i] = str;
                    i = 110;
                    str = "yV\u0013MAy^\u0013X";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_switchStyle /*109*/:
                    strArr2[i] = str;
                    i = 111;
                    str = "~Z\u0010\\m~Z\u0010LW\u007f`\u0015MK";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 112;
                    str = "jM\u0011]BRO\u001fZFd\\\u0017XScK\rwZdL\nG@t";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 113;
                    str = "jU\u0017L";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 114;
                    str = "jU\u0017L";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 115;
                    str = "~Z\u0010\\m~Z\u0010LW\u007f`\u0015MK";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 116;
                    str = "gV\u001a";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 117;
                    str = "l\\\nA]c";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 118;
                    str = "jM\u0011]BRO\u001fZFd\\\u0017XScK\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 119;
                    str = "gV\u001a";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 120;
                    str = "bS\u001awBe^\r@";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 121;
                    str = "jM\u0011]BRO\u001fZFd\\\u0017XScK\rwZdL\nG@t";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 122;
                    str = "jU\u0017L";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 123;
                    str = "gV\u001a";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 124;
                    str = "jU\u0017L\u000f2";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 125;
                    str = "jU\u0017L";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 126;
                    str = "jM\u0011]BRO\u001fZFd\\\u0017XScK\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 127;
                    str = "}Z\u0010L[cX";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 128;
                    str = "gV\u001a";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 129;
                    str = "}Z\u0010L[cX";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 130;
                    str = "l[\u0013A\\";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 131;
                    str = "jU\u0017L";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 132;
                    str = "jU\u0017L\u000f2\u001f\u001fFV-U\u0017L\u000f2";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 133;
                    str = "gV\u001a";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 134;
                    str = "jU\u0017L";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 135;
                    str = "jM\u0011]BRO\u001fZFd\\\u0017XScK\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 136;
                    str = "jM\u0011]BRO\u001fZFd\\\u0017XScK\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 137;
                    str = "cZ\twBe^\r@";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 138;
                    str = "l[\u0013A\\";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 139;
                    str = "yV\u0013MAy^\u0013X";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 140;
                    str = "cZ\twBe^\r@";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 141;
                    str = "jM\u0011]BRO\u001fZFd\\\u0017XScK\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 142;
                    str = "jU\u0017L\u000f2\u001f\u001fFV-U\u0017L\u000f2";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 143;
                    str = "l\\\nA]c";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 144;
                    str = "jU\u0017L";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 145;
                    str = "}Z\u0010L[cX";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 146;
                    str = "l\\\nA]c";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 147;
                    str = "jM\u0011]BRO\u001fZFd\\\u0017XScK\rwZdL\nG@t";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 148;
                    str = "jM\u0011]BRO\u001fZFd\\\u0017XScK\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 149;
                    str = "jU\u0017L\u000f2";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 150;
                    str = "jM\u0011]BRO\u001fZFd\\\u0017XScK\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 151;
                    str = "gV\u001a";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 152;
                    str = "yV\u0013MAy^\u0013X";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 153;
                    str = "bS\u001awBe^\r@";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 154;
                    str = "jU\u0017L";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 155;
                    str = "l\\\nA]c";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 156;
                    str = "l\\\nA]c";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 157;
                    str = "gV\u001a";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 158;
                    str = "gV\u001a";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 159;
                    str = "bS\u001awBe^\r@";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 160;
                    str = "yV\u0013MAy^\u0013X";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 161;
                    str = "jU\u0017L\u000f2\u001f\u001fFV-U\u0017L\u000f2";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 162;
                    str = "jM\u0011]BRO\u001fZFd\\\u0017XScK\rwZdL\nG@t";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 163;
                    str = "jU\u0017L\u000f2";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 164;
                    str = "jM\u0011]BRO\u001fZFd\\\u0017XScK\rwZdL\nG@t";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 165;
                    str = "bS\u001awBe^\r@";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 166;
                    str = "jM\u0011]BRO\u001fZFd\\\u0017XScK\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 167;
                    str = "jU\u0017L";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 168;
                    str = "jM\u0011]BRO\u001fZFd\\\u0017XScK\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 169;
                    str = "cZ\twBe^\r@";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 170;
                    str = "jM\u0011]BRO\u001fZFd\\\u0017XScK\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 171;
                    str = "jU\u0017L\u000f2\u001f\u001fFV-U\u0017L\u000f2";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 172;
                    str = "jU\u0017L\u000f2\u001f\u001fFV-U\u0017L\u000f2";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 173;
                    str = "yV\u0013MAy^\u0013X";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 174;
                    str = "}Z\u0010L[cX";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 175;
                    str = "jU\u0017L";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 176;
                    str = "jM\u0011]BRO\u001fZFd\\\u0017XScK\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 177;
                    str = "}Z\u0010L[cX";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 178;
                    str = "jM\u0011]BRO\u001fZFd\\\u0017XScK\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 179;
                    str = "jM\u0011]BRO\u001fZFd\\\u0017XScK\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 180;
                    str = "jM\u0011]BRO\u001fZFd\\\u0017XScK\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 181;
                    str = "cZ\twBe^\r@";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 182;
                    str = "jU\u0017L\u000f2\u001f\u001fFV-U\u0017L\u000f2";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 183;
                    str = "jU\u0017L";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 184;
                    str = "jU\u0017L\u000f2\u001f\u001fFV-U\u0017L\u000f2";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 185;
                    str = "`L\u0019[FbM\u001b\u0007TyLQ[WlM\u001d@\u001d|J\u001bZK7";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 186;
                    str = "-R\u001f\\Qe\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 187;
                    str = "iP\u001dAV";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 188;
                    str = "-Y\u0011]\\i\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 189;
                    str = "`L\u0019[FbM\u001b\u0007TyLQ[WlM\u001d@";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 190;
                    str = "`L\u0019[FbM\u001b\u0007TyLQ[WlM\u001d@\u0012yV\u0013M\u0012~O\u001bFF7";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 191;
                    str = "^z2mqY\u001f\u001aGQd[R\bQbQ\nM\\y\u001f8z}@\u001f\u0013MA~^\u0019MARY\n[\u0012Zw;zw-\\\u0011FFhQ\n\b\u007fLk=`\u00122\u001f1zvHm^jk-[\u0011K[i\u001f:maN\u001f^d{@v*\b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 192;
                    str = "`L\u0019[FbM\u001b\u0007UhK3MVd^3MA~^\u0019MA\"L\u0017RW7";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 193;
                    str = "-S\u0017E[y\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 194;
                    str = "`L\u0019[FbM\u001b\u0007UhK3MVd^3MA~^\u0019MA\"[\u001c\u0007QxM\rG@-V\r\b\\xS\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 195;
                    str = "`L\u0019[FbM\u001b\u0007UhK3MVd^3MA~^\u0019MA\"";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 196;
                    str = "^z2mqY\u001f\u0015MKRY\fG_RR\u001b\u0004\u0012fZ\u0007w[i\u0013^[FlK\u000b[\u001e-Q\u001bMV~`\u000e]Ae\u0013^LSy^R\bFdR\u001b[FlR\u000e\u0004\u0012`Z\u001aASRJ\fD\u001e-R\u001bL[l`\u0013A_h`\nQBh\u0013^EWiV\u001fwEl`\nQBh\u0013^EWiV\u001fwAdE\u001b\u0004\u0012`Z\u001aASRQ\u001fEW!\u001f\u0013MVd^!KS}K\u0017G\\!\u001f\u0013MVd^!@S~WR\b_h[\u0017ImiJ\fIFdP\u0010\u0004\u0012bM\u0017O[c\u0013^DSyV\n]Vh\u0013^D]cX\u0017\\GiZR\bFeJ\u0013JmdR\u001fOW!\u001f\fM_bK\u001bw@hL\u0011]@nZR\b@lH!LSy^R\b@h\\\u0017X[hQ\nwQbJ\u0010\\\u001e-O\u001fZFd\\\u0017XScK!@S~WR\bAy^\fZWi\u0013^w[i\u001f8z}@\u001f\u0013MA~^\u0019MA-h6m`H\u001f^EWiV\u001fwEl`\nQBh\u001f\u0017F\u0012%\u0018L\u000f\u0012!\u001fY\u0019\u0015-\u0013^\u000f\u0001*\u001fW\bsC{^\u0000]\u007fV\u0019A\\-v-\b|Xs2\b}_\u001f\u0011Z[jV\u0010\t\u000f<\u0016^i|I\u001f\u0015MKRM\u001bE]yZ!B[i\u0002A\b}_{;z\u0012Of^w[i\u001f:maN";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 197;
                    str = "`L\u0019[FbM\u001b\u0007UhK3MVd^3MA~^\u0019MA7";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 198;
                    str = "^z2mqY\u001f\u0015MKRM\u001bE]yZ!B[i\u0013^[GoU\u001bKF!\u001f\u001dZWlK\u0017G\\-y,g\u007f-\\\u0016IFRS\u0017[F-h6m`H\u001f\u0015MKRM\u001bE]yZ!B[i\u001f2ayH\u001fY\rroM\u0011IVn^\r\\\u0015";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 199;
                    str = "`L\u0019[FbM\u001b\u0007]c{\u001f\\So^\rM`hL\nG@h[QM@\u007fP\f\b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 200;
                    str = "`L\u0019[FbM\u001b\u0007]c{\u001f\\So^\rM`hL\nG@h[";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 201;
                    str = "kK\rwFbT\u001bF[wZ\fwDhM\rA]c";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 202;
                    str = "Im1x\u0012Ym7ouHm^at-z&aaYl^EW~L\u001fOW~`\u001cLmyM\u0017OUhM";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 203;
                    str = "`L\u0019[FbM\u001b\u0007TyLQL@bO";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 204;
                    str = "kK\rw[c[\u001bPm~K\u001fZF";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 205;
                    str = "`L\u0019[FbM\u001b\u0007TyLQL@bO^\\[`Z^[BhQ\n\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 206;
                    str = "Im1x\u0012Y~<dw-v8\bwUv-|a-R\u001b[AlX\u001b[mkK\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 207;
                    str = "kK\rw@h^\u001aQ";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 208;
                    str = "`L\u0019[FbM\u001b\u0007VhS\u001b\\W`Z\u001aAS";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 209;
                    str = "-[\u001bDWyZSN[aZ\r\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 210;
                    str = "-K\u0017EW-L\u000eM\\y\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 211;
                    str = "^z2mqY\u001f\u0015MKRY\fG_RR\u001b\u0004\u0012fZ\u0007w[i\u0013^[FlK\u000b[\u001e-Q\u001bMV~`\u000e]Ae\u0013^LSy^R\bFdR\u001b[FlR\u000e\u0004\u0012`Z\u001aASRJ\fD\u001e-R\u001bL[l`\u0013A_h`\nQBh\u0013^EWiV\u001fwEl`\nQBh\u0013^EWiV\u001fwAdE\u001b\u0004\u0012`Z\u001aASRQ\u001fEW!\u001f\u0013MVd^!KS}K\u0017G\\!\u001f\u0013MVd^!@S~WR\b_h[\u0017ImiJ\fIFdP\u0010\u0004\u0012bM\u0017O[c\u0013^DSyV\n]Vh\u0013^D]cX\u0017\\GiZR\bFeJ\u0013JmdR\u001fOW!\u001f\fM_bK\u001bw@hL\u0011]@nZR\b@lH!LSy^R\b@h\\\u0017X[hQ\nwQbJ\u0010\\\u001e-O\u001fZFd\\\u0017XScK!@S~WR\bAy^\fZWi\u0013^w[i\u001f8z}@\u001f\u0013MA~^\u0019MA-h6m`H\u001f^EWiV\u001fwEl`\nQBh\u001f\u0017F\u0012%\u0018L\u000f\u0012!\u001fY\u0019\u0015-\u0013^\u000f\u0001*\u001fR\b\u00154\u0018^\u0001\u0012Lq:\bYhF!ZW`P\nMmgV\u001a\u0015\r-p,lw_\u001f<q\u0012RV\u001a\bvHl=";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 212;
                    str = "`L\u0019[FbM\u001b\u0007VhS\u001b\\W`Z\u001aAS-";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 213;
                    str = "`L\u0019[FbM\u001b\u0007AhK\u001d@SyM\u001bIV\"";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 214;
                    str = "`L\u0019[FbM\u001b\u0007AhK\u001d@SyM\u001bIV\u007fZ\u001dM[}K\r[WcKQ";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 215;
                    str = "`L\u0019[FbM\u001b\u0007AhK\u001d@SyM\u001bIV\u007fZ\u001dM[}K\r[WcKQF]-\\\u0016IF-Y\u0011Z\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 216;
                    str = "Iz2mfH\u001f8z}@\u001f\u0013MA~^\u0019MA-h6m`H\u001f!AV0\u0000";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 217;
                    str = "Dq-m`Y\u001f7ffB\u001f\u0013MVd^!ZWkL^\u0000BlK\u0016\u0004\u0012\u007fZ\u0018wQbJ\u0010\\\u001b-i?dgHl^\u0000\r!\u001fA\u0001";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 218;
                    str = "Xo:ifH\u001f\u0013MA~^\u0019MA-l;|\u0012~K\u001f\\G~\u0002A\u0004\u0012\u007fZ\u001dM[}K![W\u007fI\u001bZmyV\u0013MAy^\u0013X\u000f2\u0013^ZWnV\u000eAWcK!K]xQ\n\u0015\r-h6m`H\u001f\u0015MKRM\u001bE]yZ!B[i\u0002A\bsC{^CWt`\u0018Z]``\u0013M\u000f2\u001f?fv-T\u001bQmd[C\u0017";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 219;
                    str = "Xo:ifH\u001f\u0013MVd^!ZWkL^{wY\u001f\fMTR\\\u0011]\\y\u0002A\beEz,m\u0012}^\n@\u000f2";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 220;
                    str = "Xo:ifH\u001f\u0013MA~^\u0019MA-l;|\u0012~K\u001f\\G~\u0002A\u0004\u0012cZ\u001bLARO\u000b[Z0\u0000R\bVlK\u001f\u0015\r!\u001f\fIER[\u001f\\S0\u0000R\bFdR\u001b[FlR\u000e\u0015\r!\u001f\u0013MVd^!]@a\u0002A\u0004\u0012`Z\u001aASRR\u0017EWRK\u0007XW0\u0000R\b_h[\u0017Imz^!\\K}ZC\u0017\u001e-R\u001bL[l`\rAHh\u0002A\u0004\u0012`Z\u001aASRQ\u001fEW0\u0000R\b_h[\u0017Imn^\u000e\\[bQC\u0017\u001e-R\u001bL[l`\u0016IAe\u0002A\u0004\u0012`Z\u001aASR[\u000bZSyV\u0011F\u000f2\u0013^G@dX\u0017F\u000f2\u0013^DSyV\n]Vh\u0002A\u0004\u0012aP\u0010O[yJ\u001aM\u000f2\u0013^\\ZxR\u001cw[`^\u0019M\u000f2\u001f)`w_z^CWt`\fM_bK\u001bwXd[C\u0017\u0012Lq:\bYhF!N@bR!EW0\u0000^i|I\u001f\u0015MKRV\u001a\u0015\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 221;
                    str = "^z2mqY\u001f!AV-y,g\u007f-R\u001b[AlX\u001b[\u0012Zw;zw-T\u001bQm\u007fZ\u0013GFh`\u0014AV0\u0000^i|I\u001f\u0015MKRY\fG_RR\u001b\u0015\r-~0l\u0012fZ\u0007w[i\u0002A";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 222;
                    str = "Dq-m`Y\u001f7ffB\u001f\u0013MA~^\u0019MA%T\u001bQm\u007fZ\u0013GFh`\u0014AV!\u001f\u0015MKRY\fG_RR\u001b\u0004\u0012fZ\u0007w[i\u0013^[FlK\u000b[\u001e-Q\u001bMV~`\u000e]Ae\u0013^LSy^R\bFdR\u001b[FlR\u000e\u0004\u0012`Z\u001aASRJ\fD\u001e-R\u001bL[l`\u0013A_h`\nQBh\u0013^EWiV\u001fwEl`\nQBh\u0013^EWiV\u001fwAdE\u001b\u0004\u0012`Z\u001aASRQ\u001fEW!\u001f\u0013MVd^!KS}K\u0017G\\!\u001f\u0013MVd^!@S~WR\b_h[\u0017ImiJ\fIFdP\u0010\u0004\u0012bM\u0017O[c\u0013^DSyV\n]Vh\u0013^D]cX\u0017\\GiZR\bFeJ\u0013JmdR\u001fOW!\u001f\fM_bK\u001bw@hL\u0011]@nZR\b@h\\\u001bADh[!\\[`Z\r\\S`OR\bAhQ\u001awFdR\u001b[FlR\u000e\u0004\u0012\u007fZ\u001dM[}K![W\u007fI\u001bZmyV\u0013MAy^\u0013X\u001e-M\u001bKWdO\nwVhI\u0017KWRK\u0017EW~K\u001fEB!\u001f\fIER[\u001f\\S!\u001f\u000eI@yV\u001dABlQ\nwZlL\u0016\u0004\u0012\u007fZ\u001dABdZ\u0010\\mnP\u000bFF$\u001f(i~Xz-\b\u001a2\u0013^\u0017\u001e-\u0000R\b\r!\u001fA\u0004\u00122\u0013^\u0017\u001e-\u0000R\b\r!\u001fA\u0004\u00122\u0013^\u0017\u001e-\u0000R\b\r!\u001fA\u0004\u00122\u0013^\u0017\u001e-\u0000R\b\r!\u001fA\u0004\u00122\u0013^\u0005\u0003!\u001fS\u0019\u001e-\u0012O\u0004\u00122\u0013^\u0017\u001e-\u0000W";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 223;
                    str = "`L\u0019[FbM\u001b\u0007@hL\u001b\\Ay^\nM_hQ\n[";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 224;
                    str = "Xo:ifH\u001f\u0013MA~^\u0019MA-l;|\u0012~K\u001f\\G~\u0002A\u0004\u0012~Z\u0010LmyV\u0013MAy^\u0013X\u000f2\u0013^ZWnV\u000eAWcK!K]xQ\n\u0015\r!\u001f\fM_bK\u001bw@hL\u0011]@nZC\u0017\u0012Zw;zw-T\u001bQm\u007fZ\u0013GFh`\u0014AV0\u0000^i|I\u001f\u0015MKRY\fG_RR\u001b\u0015\r-~0l\u0012fZ\u0007w[i\u0002A";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 225;
                    str = "Xo:ifH\u001f\u0013MA~^\u0019MA-l;|\u0012~K\u001f\\G~\u0002A\u0004\u0012\u007fZ\u001dM[}K![W\u007fI\u001bZmyV\u0013MAy^\u0013X\u000f2\u0013^ZWnV\u000eAWcK!K]xQ\n\u0015\r-h6m`H\u001f\nA_hL\nI_}\u0002A\bsC{^CWt`\u0018Z]``\u0013M\u000f2\u001f?fv-T\u001bQmd[C\u0017";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 226;
                    str = "Xo:ifH\u001f\u0013MA~^\u0019MA-l;|\u0012~K\u001f\\G~\u0002A\beEz,m\u0012fZ\u0007w@hR\u0011\\WRU\u0017L\u000f2\u001f?fv-T\u001bQmkM\u0011Em`ZC\u0017\u0012Lq:\bYhF!AV0\u0000";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 227;
                    str = "Iz2mfH\u001f8z}@\u001f\u0013MVd^!ZWkL^\u007fzHm;\bBlK\u0016\u0015\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 228;
                    str = "Xo:ifH\u001f\u0013MA~^\u0019MA-l;|\u0012~K\u001f\\G~\u0002A\u0004\u0012}S\u001fQWi`\u001aMDd\\\u001bwFdR\u001b[FlR\u000e\u0015\r-h6m`H\u001f\u0015MKRM\u001bE]yZ!B[i\u0002A\bsC{^CWt`\u0018Z]``\u0013M\u000f2\u001f?fv-T\u001bQmd[C\u0017";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 229;
                    str = "`L\u0019[FbM\u001b\u0007UhK\u0013[U\"V\u001a\b[~\u001f\u0010]^a\u001f\u0011Z\u0012cP^EW~L\u001fOW~\u001f\u0018G@-U\u0017L\u000f";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 230;
                    str = "@Z\u001aAS\"h\u0016IF~~\u000eX\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 231;
                    str = " \u000e";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 232;
                    str = "fZ\u0007w@hR\u0011\\WRU\u0017L\u000f2";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 233;
                    str = "a^\r\\m\u007fZ\u001fLm`Z\r[SjZ!\\SoS\u001bw[i";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 234;
                    str = "nW\u001f\\maV\r\\";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 235;
                    str = "fZ\u0007w@hR\u0011\\WRU\u0017L\u00120\u001fA\bsC{^EWiV\u001fwEl`\nQBh\u001f_\u0015\u00122\u001f?fv-\u0017\r\\S\u007fM\u001bL\u0012Dl^fgAs^g`-L\nI@\u007fZ\u001a\b\u000f-\u000fW";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 236;
                    str = "`L\u0019[FbM\u001b\u0007Si[\u0013[U\"\\\u0016IFaV\r\\\u001ddQ\rM@y\u0010\u0018I[aZ\u001a\bUd[C";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 237;
                    str = "`L\u0019[FbM\u001b\u0007QaZ\u001fZ_~X\rw\\bK![FlM\fMV-";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 238;
                    str = "nW\u001f\\maV\r\\";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 239;
                    str = "`Z\r[SjZ!\\SoS\u001bw[i";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 240;
                    str = "`L\u0019[FbM\u001b\u0007QaZ\u001fZ_~X\rw\\bK![FlM\fMV";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 241;
                    str = "`Z\r[SjZ\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 242;
                    str = "`P\u001awFlX";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 243;
                    str = "-L\u000bKQhL\r\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 244;
                    str = "a^\r\\m\u007fZ\u001fLm\u007fZ\u001dM[}K![WcK!EW~L\u001fOWRK\u001fJ^h`\u0017L";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 245;
                    str = "fZ\u0007w@hR\u0011\\WRU\u0017L";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 246;
                    str = "-K\u0017EW-L\u000eM\\y\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 247;
                    str = "`L\u0019[]\u007fZQK^h^\fEAjL!F]y`\r\\S\u007fM\u001bL\u001diZ\u0012MFh[D";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 248;
                    str = "^z2mqY\u001f\u0015MKRY\fG_RR\u001b\u0004\u0012fZ\u0007w[i\u0013^[FlK\u000b[\u001e-Q\u001bMV~`\u000e]Ae\u0013^LSy^R\bFdR\u001b[FlR\u000e\u0004\u0012`Z\u001aASRJ\fD\u001e-R\u001bL[l`\u0013A_h`\nQBh\u0013^EWiV\u001fwEl`\nQBh\u0013^EWiV\u001fwAdE\u001b\u0004\u0012`Z\u001aASRQ\u001fEW!\u001f\u0013MVd^!KS}K\u0017G\\!\u001f\u0013MVd^!@S~WR\b_h[\u0017ImiJ\fIFdP\u0010\u0004\u0012bM\u0017O[c\u0013^DSyV\n]Vh\u0013^D]cX\u0017\\GiZR\bFeJ\u0013JmdR\u001fOW!\u001f\fM_bK\u001bw@hL\u0011]@nZR\b@lH!LSy^R\b@h\\\u0017X[hQ\nwQbJ\u0010\\\u001e-O\u001fZFd\\\u0017XScK!@S~WR\bAy^\fZWi\u0013^w[i\u0013^CWt`\fM_bK\u001bwXd[^n`Br^EW~L\u001fOW~\u001f)`w_z^CWt`\u0018Z]``\u0013M\u000f=\u001f?fv-R\u001bL[l`\tImyF\u000eM\u000f5\u001f?fv-R\u001bL[l`\u001a]@lK\u0017G\\0\u000f^i|I\u001f\u0013MVd^![[wZC\u0018\u0012Lq:\bFdR\u001b[FlR\u000e\u0016\u000f2\u001f1zvHm^jk-`\u0017L\u0012Iz-k\u0012Av3af-\u000eN\u0018";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 249;
                    str = "fZ\u0007w@hR\u0011\\WRU\u0017L";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 250;
                    str = "`L\u0019[FbM\u001b\u0007QlS\u0012[\u001dgV\u001a\b[~\u001f\u0010]^a\u001e";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 251;
                    str = "`L\u0019[FbM\u001b\u0007_dL\rMVn^\u0012DA\"L\u0017RW7";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 252;
                    str = "`L\u0019[FbM\u001b\u0007_dL\rMVn^\u0012DA\"[\u001c\u0007QxM\rG@-V\r\b\\xS\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 253;
                    str = "`L\u0019[FbM\u001b\u0007QlQ\u000bXVlK\u001b\bN-K\u0017EW-L\u000eM\\y\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 254;
                    str = "Xo:ifH\u001f\u0013MA~^\u0019MA-l;|\u0012~Z\u0010LmyV\u0013MAy^\u0013X\u000f \u000e^\u007fzHm;\bmd[C\u0019";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 255;
                    str = "`L\u0019[FbM\u001b\u0007QlQ\u000bXVlK\u001b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 256;
                    str = "`L\u0019[FbM\u001b\u0007QlQ\u000bXVlK\u001b\u0007Vo\\\u0011Z@xO\n";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 257;
                    str = "lK\nM_}K^\\]-H\fAFh\u001f\u001f\b@h^\u001aG\\aF^LSy^\u001cIAh";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 258;
                    str = "`L\u0019[FbM\u001b\u0007QlQ\u000bXVlK\u001b\u0007VhS\u001b\\Wi]";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 259;
                    str = "`L\u0019[FbM\u001b\u0007QlQ\u000bXVlK\u001b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 260;
                    str = "xQ\u001fJ^h\u001f\nG\u0012bO\u001bF";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 261;
                    str = "`L\u0019[FbM\u001b\u0007GcL\u001bFV`Z\r[SjZ\r\u0007Ql\\\u0016MV7";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 262;
                    str = "jM\u0011]BRO\u001fZFd\\\u0017XScK\rwZdL\nG@t";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 263;
                    str = "yV\u0013MAy^\u0013X\u00121\u001fA";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 264;
                    str = "`L\u0019[FbM\u001b\u0007GcL\u001bFF\"v\u0012DWj^\u0012{FlK\u001bmJnZ\u000e\\[bQ^";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 265;
                    str = "`L\u0019[FbM\u001b\u0007GcL\u001bFV`Z\r[SjZ\rn]\u007fu\u0017LbhM:IK";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 266;
                    str = "~Z\u0012MQy\u001f\u001dGGcKV\u0002\u001b-Y\fG_-R\u001b[AlX\u001b[";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 267;
                    str = "`L\u0019[FbM\u001b\u0007UhK3MA~^\u0019MqbJ\u0010\\{c{\u001c\bW\u007fM\u0011Z\u0012zW\u0017DW-K\fQ[cX^\\]-M\u001b\\@dZ\bM\u0012`Z\r[SjZ\r\bQbJ\u0010\\\u0012dQ^";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 268;
                    str = "`L\u0019[FbM\u001b\u0007UhK3MVd^3MA~^\u0019MANJ\f[]\u007f\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 269;
                    str = "^z2mqY\u001f\u0015MKRY\fG_RR\u001b\u0004\u0012fZ\u0007w[i\u0013^[FlK\u000b[\u001e-Q\u001bMV~`\u000e]Ae\u0013^LSy^R\bFdR\u001b[FlR\u000e\u0004\u0012`Z\u001aASRJ\fD\u001e-R\u001bL[l`\u0013A_h`\nQBh\u0013^EWiV\u001fwEl`\nQBh\u0013^EWiV\u001fwAdE\u001b\u0004\u0012`Z\u001aASRQ\u001fEW!\u001f\u0013MVd^!KS}K\u0017G\\!\u001f\u0013MVd^!@S~WR\b_h[\u0017ImiJ\fIFdP\u0010\u0004\u0012bM\u0017O[c\u0013^DSyV\n]Vh\u0013^D]cX\u0017\\GiZR\bFeJ\u0013JmdR\u001fOW!\u001f\fM_bK\u001bw@hL\u0011]@nZR\b@lH!LSy^R\b@h\\\u0017X[hQ\nwQbJ\u0010\\\u001e-O\u001fZFd\\\u0017XScK!@S~WR\bAy^\fZWi\u0013^w[i\u001f8z}@\u001f\u0013MA~^\u0019MA-h6m`H\u001f^EWiV\u001fwEl`\nQBh\u001f\u0017F\u0012%\u0018L\u000f\u0012!\u001fY\u0019\u0015-\u0013^\u000f\u0001*\u001fW\bsC{^\u0000]\u007fV\u0019A\\-v-\b|Xs2\b}_\u001f\u0011Z[jV\u0010\t\u000f<\u0016^i|I\u001f\u0015MKRM\u001bE]yZ!B[i\u0002A\b}_{;z\u0012Of^w[i\u001f:maN";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 270;
                    str = "`L\u0019[FbM\u001b\u0007^dT\u001b\u0007Ah^\fKZkP\fB[i\u001f\nA_h\u001f\rXWcKD";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 271;
                    str = "%R\u001bL[l`\u0010I_h\u001f2ayH\u001fY\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 272;
                    str = "RV\u001a";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 273;
                    str = "-{;{q";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 274;
                    str = "Q\u001a";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 275;
                    str = "-p,\b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 276;
                    str = "-~0l\u0012RV\u001a\u0014";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 277;
                    str = "(\u0018^maN~.m\u0012*cY\bsC{^f}Y\u001f\u0013MVd^!_SRK\u0007XW0";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 278;
                    str = "`L\u0019[FbM\u001b\u0007TdQ\u001a\u0007Vo\u0010\u001d]@~P\f\b[~\u001f\u0010]^a";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 279;
                    str = "-s7e{Y\u001fO";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 280;
                    str = "%R\u001bL[l`\u001dIByV\u0011F\u0012Av5m\u0012*\u001a";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 281;
                    str = "(\u0018^maN~.m\u0012*cY\bsC{^EWiV\u001fwEl`\nQBh\u0002";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 282;
                    str = "`L\u0019[FbM\u001b\u0007^dT\u001b\u0007Ah^\fKZkP\fB[i";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 283;
                    str = "`L\u0019[FbM\u001b\u0007^dT\u001b\u0007Ah^\fKZkP\fB[i\u0010\r\\S\u007fK\u0017L\u00121\u001fN";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 284;
                    str = "%[\u001f\\S-s7cw-\u0018[";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 285;
                    str = "-p,lw_\u001f<q\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 286;
                    str = "RV\u001a";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 287;
                    str = "-p,lw_\u001f<q\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 288;
                    str = "-~-k";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 289;
                    str = "$\u001f";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 290;
                    str = "(\u0018^maN~.m\u0012*cY\bsC{^EWiV\u001fwEl`\nQBh\u0002";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 291;
                    str = "RV\u001a";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 292;
                    str = "-p,\b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 293;
                    str = "^z2mqY\u001f!AV-y,g\u007f-R\u001b[AlX\u001b[\u0012Zw;zw-T\u001bQm\u007fZ\u0013GFh`\u0014AV0\u0000^i|I\u001f\u0013MVd^!_SRK\u0007XW,\u0002F\bsC{^";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 294;
                    str = "*\u0018";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 295;
                    str = "$\u001f";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 296;
                    str = "$\u001f";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 297;
                    str = "-~0l\u0012RV\u001a\u0016";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 298;
                    str = "-Y\u0011]\\i\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 299;
                    str = "`L\u0019[FbM\u001b\u0007@h\\\u001bADh[\u001cQAhM\bM@\"L\nIFxL\u001aGEcX\fIVh\u0005^";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 300;
                    str = "`L\u0019[FbM\u001b\u0007@h\\\u001bADh[\u001cQAhM\bM@\"Q\u0011[GnW\u0013MA~^\u0019M\b-";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 301;
                    str = "-V\u001a\u0015";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 302;
                    str = "-\\\u000bZ@hQ\n\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 303;
                    str = "-Q\u001b_\b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 304;
                    str = "`L\u0019[FbM\u001b\u0007@h\\\u001bADh[\u001cQAhM\bM@\"Z\fZ]\u007f\u001f";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 305;
                    str = "`L\u0019[FbM\u001b\u0007@h\\\u001bADh[\u001cQAhM\bM@\"M\u001bKWdO\n\u0007AhM\bM@\"[\u001bDSt\u001f";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 306;
                    str = "`L\u0019[FbM\u001b\u0007G}[\u001f\\W`Z\r[SjZ\u0017FPl\\\u0015O@bJ\u0010L\u0012iJ\u000eD[n^\nM";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 307;
                    str = "`L\u0019[FbM\u001b\u0007UhKQFFe\u001f\u001dI\\*K^OWy\u001f\u0013MA~^\u0019M\b-";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 308;
                    str = "`L\u0019[FbM\u001b\u0007UhKQFFe\u001f\u0010G\u0012`Z\r[SjZD\b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 309;
                    str = "^z2mqY\u001f\u0015MKRY\fG_RR\u001b\u0004\u0012fZ\u0007w[i\u0013^[FlK\u000b[\u001e-Q\u001bMV~`\u000e]Ae\u0013^LSy^R\bFdR\u001b[FlR\u000e\u0004\u0012`Z\u001aASRJ\fD\u001e-R\u001bL[l`\u0013A_h`\nQBh\u0013^EWiV\u001fwEl`\nQBh\u0013^EWiV\u001fwAdE\u001b\u0004\u0012`Z\u001aASRQ\u001fEW!\u001f\u0013MVd^!KS}K\u0017G\\!\u001f\u0013MVd^!@S~WR\b_h[\u0017ImiJ\fIFdP\u0010\u0004\u0012bM\u0017O[c\u0013^DSyV\n]Vh\u0013^D]cX\u0017\\GiZR\bFeJ\u0013JmdR\u001fOW!\u001f\fM_bK\u001bw@hL\u0011]@nZR\b@lH!LSy^R\b@h\\\u0017X[hQ\nwQbJ\u0010\\\u001e-O\u001fZFd\\\u0017XScK!@S~WR\bAy^\fZWi\u0013^w[i\u001f8z}@\u001f\u0013MA~^\u0019MA-h6m`H\u001f\u0015MKRM\u001bE]yZ!B[i\u0002A\b\u0012Lq:\b_h[\u0017Imz^!\\K}Z_\u0015\n-p,lw_\u001f<q\u0012RV\u001a\bvHl=\b~Dr7|\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 310;
                    str = "-s7e{Y\u001f";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 311;
                    str = "`L\u0019[FbM\u001b\u0007UhKQFWzZ\f\b\\b\u001f\u0010MEhM^EW~L\u001fOW~\u001f\u0018G@-";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 312;
                    str = "`L\u0019[FbM\u001b\u0007UhKQFWzZ\f\b\\b\u001f\u0017L\u0012kP\f\b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 313;
                    str = "^z2mqY\u001f\u0015MKRY\fG_RR\u001b\u0004\u0012fZ\u0007w[i\u0013^[FlK\u000b[\u001e-Q\u001bMV~`\u000e]Ae\u0013^LSy^R\bFdR\u001b[FlR\u000e\u0004\u0012`Z\u001aASRJ\fD\u001e-R\u001bL[l`\u0013A_h`\nQBh\u0013^EWiV\u001fwEl`\nQBh\u0013^EWiV\u001fwAdE\u001b\u0004\u0012`Z\u001aASRQ\u001fEW!\u001f\u0013MVd^!KS}K\u0017G\\!\u001f\u0013MVd^!@S~WR\b_h[\u0017ImiJ\fIFdP\u0010\u0004\u0012bM\u0017O[c\u0013^DSyV\n]Vh\u0013^D]cX\u0017\\GiZR\bFeJ\u0013JmdR\u001fOW!\u001f\fM_bK\u001bw@hL\u0011]@nZR\b@lH!LSy^R\b@h\\\u0017X[hQ\nwQbJ\u0010\\\u001e-O\u001fZFd\\\u0017XScK!@S~WR\bAy^\fZWi\u0013^w[i\u001f8z}@\u001f\u0013MA~^\u0019MA-h6m`H\u001f\u0015MKRM\u001bE]yZ!B[i\u0002A\bsC{^EWiV\u001fwEl`\nQBh\u001eC\u0010\u0012Lq:\bmd[@\u0017\u0012Bm:m`-}'\bmd[^iaN";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 314;
                    str = "`L\u0019[FbM\u001b\u0007QeZ\u001dCVo\u0010\u0012AAy\u001f";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 315;
                    str = "`L\u0019[FbM\u001b\u0007QeZ\u001dCVo\u0010\u0010GVo\u0010\rY^hM\fG@";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 316;
                    str = "`L\u0019[FbM\u001b\u0007QeZ\u001dCVo\u0010\bM@~V\u0011F\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 317;
                    str = "`L\u0019[FbM\u001b\u0006Vo";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 318;
                    str = "`L\u0019[FbM\u001b\u0007QeZ\u001dCVo\u0010\u001dG@\u007fJ\u000e\\";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 319;
                    str = "`L\u0019[FbM\u001b\u0007QeZ\u001dCVo\u0010\r\\SnT^";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 320;
                    str = "`L\u0019[FbM\u001b\u0007QeZ\u001dCVo";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 321;
                    str = "`L\u0019[FbM\u001b\u0007QeZ\u001dCVo\u0010\u0010G\u001fkV\u0012M";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 322;
                    str = "\"H\u0017D^ M\u001b\\@t\u001f";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 323;
                    str = "Iz2mfH\u001f8z}@\u001f\u0013MA~^\u0019MA-h6m`H\u001f\u0013MVd^!_SRK\u0007XW0\u0007";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 324;
                    str = "`L\u0019[FbM\u001b\u0007QaZ\u001fZQlS\u0012D]j\u0010";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 325;
                    str = "`L\u0019[FbM\u001b\u0007AhK\u000bX";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 326;
                    str = "`L\u0019[FbM\u001b\u0007UhK9Z]xO2GQlK\u0017G\\@Z\r[SjZ\r\u0007AdE\u001b\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 327;
                    str = "`L\u0019[FbM\u001b\u0007UhK9Z]xO2GQlK\u0017G\\@Z\r[SjZ\r\u0007Vo\u0010\u001d]@~P\f\b[~\u001f\u0010]^a";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 328;
                    str = "dQ\u001aMJ-\u0017\"_\u0019$\u001b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 329;
                    str = "bT";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 330;
                    str = "`L\u0019[FbM\u001b\u0007[cK\u001bO@dK\u0007KZh\\\u0015\u0007W\u007fM\u0011Z\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 331;
                    str = "`L\u0019[FbM\u001b\u0007[cK\u001bO@dK\u0007KZh\\\u0015\u0007W\u007fM\u0011Z\u001fiZ\nI[aLQA\\iZ\u0006\u0007";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 332;
                    str = "`L\u0019[FbM\u001b\u0007[cK\u001bO@dK\u0007KZh\\\u0015\u0007Q-";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 333;
                    str = "`L\u0019[FbM\u001b\u0007[cK\u001bO@dK\u0007KZh\\\u0015\u0007Q\"Z\fZ]\u007f";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 334;
                    str = "]m?o\u007fL\u001f\u0017FFhX\fAFt`\u001d@WnT";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 335;
                    str = "`L\u0019[FbM\u001b\u0007[cK\u001bO@dK\u0007KZh\\\u0015\u0007W\u007fM\u0011Z\u001fiZ\nI[aLQGFeZ\f\u0007";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 336;
                    str = "`L\u0019[FbM\u001b\u0007[cK\u001bO@dK\u0007KZh\\\u0015\u0007CxZ\fQ\u001fk^\u0017DWi";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 337;
                    str = "-\\\u0010\\\u000f";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 338;
                    str = "gV\u001a";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 339;
                    str = "~Z\u0010\\m~Z\u0010LW\u007f`\u0015MK";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 340;
                    str = "l[\u0013A\\";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 341;
                    str = "jM\u0011]BRO\u001fZFd\\\u0017XScK\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 342;
                    str = "`L\u0019[FbM\u001b\u0007AlI\u001bo@bJ\u000exS\u007fK\u0017K[}^\u0010\\A\"";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 343;
                    str = "jM\u0011]BRO\u001fZFd\\\u0017XScK\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 344;
                    str = "}Z\u0010L[cX";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 345;
                    str = "jU\u0017L\u000f2";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 346;
                    str = "jU\u0017L";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 347;
                    str = "`L\u0019[FbM\u001b\u0007UhK\u0018A@~K\fMT\"\\\u000bZAbM^AA-Q\u000bD^";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 348;
                    str = "`L\u0019[FbM\u001b\u0007UhK\u0018A@~K\fMT-\\\u001fF\u0015y\u001f\u0019MF-I\u001fDGh\u001f\u0018G@-";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 349;
                    str = "^z2mqY\u001f!AV-y,g\u007f-R\u001b[AlX\u001b[\u0012Zw;zw-T\u001bQm\u007fZ\u0013GFh`\u0014AV0\u0000^i|I\u001f\u0013MVd^!_SRK\u0007XW,\u0002F\b}_{;z\u0012Of^w[i\u001f?{q-s7e{Y\u001fO";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 350;
                    str = "`L\u0019[FbM\u001b\u0007UhK,MF\u007fF?]Fb[\u0011_\\aP\u001fL\u007fhL\rIUhLQB[i\u001f\u0017[\u0012cJ\u0012D\u0013";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 351;
                    str = "`L\u0019[FbM\u001b\u0007UhK,MF\u007fF?]Fb[\u0011_\\aP\u001fL\u007fhL\rIUhLQa^aZ\u0019I^^K\u001f\\WHG\u001dMByV\u0011F\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 352;
                    str = "`L\u0019[FbM\u001b\u0007UhK,MF\u007fF?]Fb[\u0011_\\aP\u001fL\u007fhL\rIUhL^";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 353;
                    str = "^z2mqY\u001f\u0015MKRY\fG_RR\u001b\u0004\u0012fZ\u0007w[i\u0013^[FlK\u000b[\u001e-Q\u001bMV~`\u000e]Ae\u0013^LSy^R\bFdR\u001b[FlR\u000e\u0004\u0012`Z\u001aASRJ\fD\u001e-R\u001bL[l`\u0013A_h`\nQBh\u0013^EWiV\u001fwEl`\nQBh\u0013^EWiV\u001fwAdE\u001b\u0004\u0012`Z\u001aASRQ\u001fEW!\u001f\u0013MVd^!KS}K\u0017G\\!\u001f\u0013MVd^!@S~WR\b_h[\u0017ImiJ\fIFdP\u0010\u0004\u0012bM\u0017O[c\u0013^DSyV\n]Vh\u0013^D]cX\u0017\\GiZR\bFeJ\u0013JmdR\u001fOW!\u001f\fM_bK\u001bw@hL\u0011]@nZR\b@lH!LSy^R\b@h\\\u0017X[hQ\nwQbJ\u0010\\\u001e-O\u001fZFd\\\u0017XScK!@S~WR\bAy^\fZWi\u0013^w[i\u0013^CWt`\fM_bK\u001bwXd[^n`Br^EW~L\u001fOW~\u001f)`w_z^\b_h[\u0017Imz^!\\K}Z^A\\-\u0017Y\u001a\u0015-\u0013^\u000f\u0003*\u001fR\b\u0015>\u0018^\u0004\u0012*\u0006Y\b\u001b-~0l\u0012fZ\u0007wT\u007fP\u0013w_h\u0002N\bsC{^\\[`Z\r\\S`O@\u0017\u0012Bm:m`-}'\bmd[^iaN";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 354;
                    str = "fZ\u0007w@hR\u0011\\WRU\u0017L";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 355;
                    str = "-C^\\[`Z^[BhQ\n\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 356;
                    str = "`L\u0019[FbM\u001b\u0007UhK,MF\u007fF?]Fb[\u0011_\\aP\u001fL\u007fhL\rIUhL";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 357;
                    str = "`L\u0019[FbM\u001b\u0007S\u007f\\\u0016ADh\u0010\u0010G\u0012nW\u001f\\\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 358;
                    str = "`L\u0019[FbM\u001b\u0007S\u007f\\\u0016ADh\u0010\u0010GB-";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 359;
                    str = "fZ\u0007w@hR\u0011\\WRU\u0017L";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 360;
                    str = "`L\u0019[FbM\u001b\u0007QaZ\u001fZ_~X\r\b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 361;
                    str = "-K\u0017EW-L\u000eM\\y\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 362;
                    str = "nW\u001f\\maV\r\\";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 363;
                    str = "Iz2mfH\u001f8z}@\u001f\fMQhV\u000e\\A-h6m`H\u001f\u0015MKRM\u001bE]yZ!B[i\u0002A";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 364;
                    str = "fZ\u0007w@hR\u0011\\WRU\u0017L\u000f2";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 365;
                    str = "`L\u0019[FbM\u001b\u0007QaZ\u001fZ_~X\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 366;
                    str = "`Z\r[SjZ!\\SoS\u001bw[i";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 367;
                    str = "`P\u001awFlX";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 368;
                    str = "a^\r\\m\u007fZ\u001fLm\u007fZ\u001dM[}K![WcK!EW~L\u001fOWRK\u001fJ^h`\u0017L";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 369;
                    str = "-L\u000bKQhL\r\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 370;
                    str = "`L\u0019[FbM\u001b\u0007Si[\u0013[U\"\\\u0016IFaV\r\\\u001ddQ\rM@y\u0010\u0018I[aZ\u001a\bUd[C";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 371;
                    str = "a^\r\\m\u007fZ\u001fLm`Z\r[SjZ!\\SoS\u001bw[i";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 372;
                    str = "Iz2mfH\u001f8z}@\u001f\u0013MA~^\u0019MA-h6m`H\u001f\u0015MKRM\u001bE]yZ!B[i\u0002A\bsC{^EWiV\u001fwEl`\nQBh\u001eC\u0010";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 373;
                    str = "nW\u001f\\maV\r\\";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 374;
                    str = "`L\u0019[FbM\u001b\u0007G}[\u001f\\W\"M\u001bKWdO\n\u0007AhM\bM@\"[\u001bDSt\u001f";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 375;
                    str = "-Q\u001b_\b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 376;
                    str = "`L\u0019[FbM\u001b\u0007G}[\u001f\\W\"Q\u0011[GnW\u0013MA~^\u0019M\b-";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 377;
                    str = "`L\u0019[FbM\u001b\u0007G}[\u001f\\W\"L\nIFxL\u001aGEcX\fIVh\u0005^";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 378;
                    str = "-\\\u000bZ@hQ\n\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 379;
                    str = "^z2mqY\u001f\u0015MKRY\fG_RR\u001b\u0004\u0012fZ\u0007w[i\u0013^[FlK\u000b[\u001e-Q\u001bMV~`\u000e]Ae\u0013^LSy^R\bFdR\u001b[FlR\u000e\u0004\u0012`Z\u001aASRJ\fD\u001e-R\u001bL[l`\u0013A_h`\nQBh\u0013^EWiV\u001fwEl`\nQBh\u0013^EWiV\u001fwAdE\u001b\u0004\u0012`Z\u001aASRQ\u001fEW!\u001f\u0013MVd^!KS}K\u0017G\\!\u001f\u0013MVd^!@S~WR\b_h[\u0017ImiJ\fIFdP\u0010\u0004\u0012bM\u0017O[c\u0013^DSyV\n]Vh\u0013^D]cX\u0017\\GiZR\bFeJ\u0013JmdR\u001fOW!\u001f\fM_bK\u001bw@hL\u0011]@nZR\b@lH!LSy^R\b@h\\\u0017X[hQ\nwQbJ\u0010\\\u001e-O\u001fZFd\\\u0017XScK!@S~WR\bAy^\fZWi\u0013^w[i\u0013^CWt`\fM_bK\u001bwXd[^n`Br^EW~L\u001fOW~\u001f)`w_z^[FlM\fMV0\u000e^g`Iz,\bpT\u001f!AV-{;{q";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 380;
                    str = "^z2mqY\u001f\u0015MKRY\fG_RR\u001b\u0004\u0012fZ\u0007w[i\u0013^[FlK\u000b[\u001e-Q\u001bMV~`\u000e]Ae\u0013^LSy^R\bFdR\u001b[FlR\u000e\u0004\u0012`Z\u001aASRJ\fD\u001e-R\u001bL[l`\u0013A_h`\nQBh\u0013^EWiV\u001fwEl`\nQBh\u0013^EWiV\u001fwAdE\u001b\u0004\u0012`Z\u001aASRQ\u001fEW!\u001f\u0013MVd^!KS}K\u0017G\\!\u001f\u0013MVd^!@S~WR\b_h[\u0017ImiJ\fIFdP\u0010\u0004\u0012bM\u0017O[c\u0013^DSyV\n]Vh\u0013^D]cX\u0017\\GiZR\bFeJ\u0013JmdR\u001fOW!\u001f\fM_bK\u001bw@hL\u0011]@nZR\b@lH!LSy^R\b@h\\\u0017X[hQ\nwQbJ\u0010\\\u001e-O\u001fZFd\\\u0017XScK!@S~WR\bAy^\fZWi\u0013^w[i\u0013^CWt`\fM_bK\u001bwXd[^n`Br^EW~L\u001fOW~\u001f)`w_z^w[i\u001f7f\u0012%l;dwNk^L]nV\u001a\bt_p3\b_hL\rIUhL!NF~\u0013^EW~L\u001fOW~\u001f)`w_z^K]cK\u001bFF-r?|qE\u001fA\bsC{^EW~L\u001fOW~`\u0018\\A#[\u0011K[i\u001fC\b_hL\rIUhLPw[i\u001f?fv-R\u001b[AlX\u001b[\u001c~K\u001fZ@h[^\u0015\u0012<\u0016^g`Iz,\bpT\u001f!AV-{;{q";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 381;
                    str = "`L\u0019[FbM\u001b\u0007GcL\u001bFF`Z\r[SjZ\r\\SyJ\rMA\"U\u0017L\u0012dL^FGaS_";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 382;
                    str = "^z2mqY\u001f\u0015MKRY\fG_RR\u001b\u0004\u0012fZ\u0007w[i\u0013^[FlK\u000b[\u001e-Q\u001bMV~`\u000e]Ae\u0013^LSy^R\bFdR\u001b[FlR\u000e\u0004\u0012`Z\u001aASRJ\fD\u001e-R\u001bL[l`\u0013A_h`\nQBh\u0013^EWiV\u001fwEl`\nQBh\u0013^EWiV\u001fwAdE\u001b\u0004\u0012`Z\u001aASRQ\u001fEW!\u001f\u0013MVd^!KS}K\u0017G\\!\u001f\u0013MVd^!@S~WR\b_h[\u0017ImiJ\fIFdP\u0010\u0004\u0012bM\u0017O[c\u0013^DSyV\n]Vh\u0013^D]cX\u0017\\GiZR\bFeJ\u0013JmdR\u001fOW!\u001f\fM_bK\u001bw@hL\u0011]@nZR\b@lH!LSy^R\b@h\\\u0017X[hQ\nwQbJ\u0010\\\u001e-O\u001fZFd\\\u0017XScK!@S~WR\bAy^\fZWi\u0013^w[i\u0013^CWt`\fM_bK\u001bwXd[^n`Br^EW~L\u001fOW~\u001f)`w_z^CWt`\u0018Z]``\u0013M\u000f=\u001f?fv-L\nIFxL^a|%\u0006R\u0019\u0003$\u001f1zvHm^jk-`\u0017L\u0012Iz-k\u0012Av3af-\u000bN\u0011\u0004";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 383;
                    str = "`L\u0019[FbM\u001b\u0007GcL\u001bFF`Z\r[SjZ\r\\SyJ\rMA-";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 384;
                    str = "`L\u0019[FbM\u001b\u0007GcL\u001bFV~K\u001f\\G~Z\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 385;
                    str = "`L\u0019[FbM\u001b\u0007GcL\u001bFF`Z\r[SjZ\r\\SyJ\rMA\"v\u0012DWj^\u0012{FlK\u001bmJnZ\u000e\\[bQ^";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 386;
                    str = "`L\u0019[FbM\u001b\u0007GcL\u001bFF`Z\r[SjZ\r\\SyJ\rMA\"^\u001aL\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 387;
                    str = "-C^\\[`Z^[BhQ\n\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 388;
                    str = "fZ\u0007w@hR\u0011\\WRU\u0017L";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 389;
                    str = "Xo:ifH\u001f\u0019Z]xO!XS\u007fK\u0017K[}^\u0010\\A-l;|\u0012~Z\u0010\\m~Z\u0010LW\u007f`\u0015MK0\u000e^\u007fzHm;\bUgV\u001a\u0015\r-~0l\u0012gV\u001a\u0015\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 390;
                    str = "`L\u0019[FbM\u001b\u0007_lM\u0015xS\u007fK\u0017K[}^\u0010\\ALL6IDdQ\u0019{Wc[\u001bZyhFQ";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 391;
                    str = "^z2mqY\u001f!AV-y,g\u007f-R\u001b[AlX\u001b[\u0012Zw;zw-T\u001bQm\u007fZ\u0013GFh`\u0014AV0\u0000^i|I\u001f\u0013MVd^!_SRK\u0007XW,\u0002F\b}_{;z\u0012Of^ZWnZ\u0017^Wi`\nA_hL\nI_}\u001f:maN\u001f2a\u007fDk^\u0019";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 392;
                    str = "`L\u0019[FbM\u001b\u0007^lL\nEAjV\u001a\u0007QbJ\u0010\\\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 393;
                    str = "Lq:\bmd[@\u0015\r-";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 394;
                    str = "Bm:m`-}'\bmd[^lw^|";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 395;
                    str = "^z2mqY\u001f\u0015MKRY\fG_RR\u001b\u0004\u0012fZ\u0007w[i\u0013^[FlK\u000b[\u001e-Q\u001bMV~`\u000e]Ae\u0013^LSy^R\bFdR\u001b[FlR\u000e\u0004\u0012`Z\u001aASRJ\fD\u001e-R\u001bL[l`\u0013A_h`\nQBh\u0013^EWiV\u001fwEl`\nQBh\u0013^EWiV\u001fwAdE\u001b\u0004\u0012`Z\u001aASRQ\u001fEW!\u001f\u0013MVd^!KS}K\u0017G\\!\u001f\u0013MVd^!@S~WR\b_h[\u0017ImiJ\fIFdP\u0010\u0004\u0012bM\u0017O[c\u0013^DSyV\n]Vh\u0013^D]cX\u0017\\GiZR\bFeJ\u0013JmdR\u001fOW!\u001f\fM_bK\u001bw@hL\u0011]@nZR\b@lH!LSy^R\b@h\\\u0017X[hQ\nwQbJ\u0010\\\u001e-O\u001fZFd\\\u0017XScK!@S~WR\bAy^\fZWi\u0013^w[i\u001f8z}@\u001f\u0013MA~^\u0019MA-h6m`H\u001f\u0015MKRM\u001bE]yZ!B[i\u0002A\bsC{^EWiV\u001fwEl`\nQBh\u001eC\u0010\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 396;
                    str = "^z2mqY\u001f\n@G`]!A_lX\u001b\bt_p3\b_hL\rIUhL^\u007fzHm;\b_h[\u0017Ime^\r@\u000f2\u001f?fv-\u001f\u0013MVd^!_SRK\u0007XW-V\u0010\b\u001a*\rY\b\u001e-\u0018O\u000f\u0012!\u001fY\u001b\u0015-\u0013^\u000f\u000b*\u001fW\b}_{;z\u0012Of^w[i\u001f:maN";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 397;
                    str = "`L\u0019[FbM\u001b\u0007UhK3MVd^3MA~^\u0019Mptw\u001f[Z\"[\u001c\u0007QxM\rG@-V\r\b\\xS\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 398;
                    str = "`L\u0019[FbM\u001b\u0007UhK3MVd^3MA~^\u0019MANP\u000bFF\"\\\u0011]\\y\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 399;
                    str = "`L\u0019[FbM\u001b\u0007UhK3MVd^3MA~^\u0019MANP\u000bFF\"[\u001c\u0007QxM\rG@-V\r\b\\xS\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 400;
                    str = "^z2mqY\u001f\u0015MKRY\fG_RR\u001b\u0004\u0012fZ\u0007w[i\u0013^[FlK\u000b[\u001e-Q\u001bMV~`\u000e]Ae\u0013^LSy^R\bFdR\u001b[FlR\u000e\u0004\u0012`Z\u001aASRJ\fD\u001e-R\u001bL[l`\u0013A_h`\nQBh\u0013^EWiV\u001fwEl`\nQBh\u0013^EWiV\u001fwAdE\u001b\u0004\u0012`Z\u001aASRQ\u001fEW!\u001f\u0013MVd^!KS}K\u0017G\\!\u001f\u0013MVd^!@S~WR\b_h[\u0017ImiJ\fIFdP\u0010\u0004\u0012bM\u0017O[c\u0013^DSyV\n]Vh\u0013^D]cX\u0017\\GiZR\bFeJ\u0013JmdR\u001fOW!\u001f\fM_bK\u001bw@hL\u0011]@nZR\b@lH!LSy^R\b@h\\\u0017X[hQ\nwQbJ\u0010\\\u001e-O\u001fZFd\\\u0017XScK!@S~WR\bAy^\fZWi\u0013^w[i\u001f8z}@\u001f\u0013MA~^\u0019MA-h6m`H\u001f^EWiV\u001fwEl`\nQBh\u001f\u0017F\u0012%\u0018L\u000f\u0012!\u001fY\u0019\u0015-\u0013^\u000f\u0001*\u001fW\bsC{^\u0000]\u007fV\u0019A\\-v-\b|Xs2\b}_\u001f\u0011Z[jV\u0010\t\u000f<\u0016^i|I\u001f\u0015MKRM\u001bE]yZ!B[i\u0002A\b}_{;z\u0012Of^w[i\u001f:maN";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 401;
                    str = "`L\u0019[FbM\u001b\u0007UhK3MVd^3MA~^\u0019MANP\u000bFF7";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 402;
                    str = "`L\u0019[FbM\u001b\u0007UhK3MVd^3MA~^\u0019MANP\u000bFF\"";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 403;
                    str = "fZ\u0007w@hR\u0011\\WRU\u0017L\u000f2";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 404;
                    str = "`F!EW~L\u001fOW~";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 405;
                    str = "nM\u001bIFdP\u0010";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 406;
                    str = "`L\u0019[FbM\u001b\u0007Si[\u0013[U\"\\\u0016IFaV\r\\\u001ddQ\rM@y\u0010\u0018I[aZ\u001a\bUd[C";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 407;
                    str = "`L\u0019[FbM\u001b\u0007Qe^\n\u0007Si[^";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 408;
                    str = "nW\u001f\\maV\r\\";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 409;
                    str = "`F!EW~L\u001fOW~";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 410;
                    str = "}S\u001fA\\yZ\u0006\\miV\rIPaZ\u001a";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 411;
                    str = "a^\r\\m\u007fZ\u001fLm`Z\r[SjZ!\\SoS\u001bw[i";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 412;
                    str = "~P\f\\myV\u0013MAy^\u0013X";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 413;
                    str = "fZ\u0007w@hR\u0011\\WRU\u0017L";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 414;
                    str = "`Z\r[SjZ!\\SoS\u001bw[i";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 415;
                    str = "~J\u001cBWnK";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 416;
                    str = "nW\u001f\\maV\r\\";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 417;
                    str = "lM\u001d@[{Z\u001a";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 418;
                    str = "~J\u001cBWnK";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 419;
                    str = "nW\u001f\\maV\r\\";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 420;
                    str = "jZ\u0010";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 421;
                    str = "a^\r\\m\u007fZ\u001fLm\u007fZ\u001dM[}K![WcK!EW~L\u001fOWRK\u001fJ^h`\u0017L";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 422;
                    str = "jZ\u0010";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 423;
                    str = "fZ\u0007w@hR\u0011\\WRU\u0017L\u000f2";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 424;
                    str = "bS\u001awBe^\r@";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 425;
                    str = "l\\\nA]c";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 426;
                    str = "cZ\twBe^\r@";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 427;
                    str = "yV\u0013MAy^\u0013X\u0012Iz-k";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 428;
                    str = "jU\u0017L\u00120\u001fA";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 429;
                    str = "gV\u001a";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 430;
                    str = "jM\u0011]BRO\u001fZFd\\\u0017XScK\rwZdL\nG@t";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 431;
                    str = "^z2mqY\u001f\u0015MKRY\fG_RR\u001b\u0004\u0012fZ\u0007w[i\u0013^[FlK\u000b[\u001e-Q\u001bMV~`\u000e]Ae\u0013^LSy^R\bFdR\u001b[FlR\u000e\u0004\u0012`Z\u001aASRJ\fD\u001e-R\u001bL[l`\u0013A_h`\nQBh\u0013^EWiV\u001fwEl`\nQBh\u0013^EWiV\u001fwAdE\u001b\u0004\u0012`Z\u001aASRQ\u001fEW!\u001f\u0013MVd^!KS}K\u0017G\\!\u001f\u0013MVd^!@S~WR\b_h[\u0017ImiJ\fIFdP\u0010\u0004\u0012bM\u0017O[c\u0013^DSyV\n]Vh\u0013^D]cX\u0017\\GiZR\bFeJ\u0013JmdR\u001fOW!\u001f\fM_bK\u001bw@hL\u0011]@nZR\b@lH!LSy^R\b@h\\\u0017X[hQ\nwQbJ\u0010\\\u001e-O\u001fZFd\\\u0017XScK!@S~WR\bAy^\fZWi\u0013^w[i\u001f8z}@\u001f\u0013MA~^\u0019MA-h6m`H\u001f\u0015MKRM\u001bE]yZ!B[i\u0002A\bsC{^CWt`\u0018Z]``\u0013M\u000f2\u001f?fv-T\u001bQmd[C\u0017";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 432;
                    str = "`L\u0019[FbM\u001b\u0007UhK\u0013MA~^\u0019M\u0012cP^KG\u007fL\u0011Z\u0013";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 433;
                    str = "`L\u0019[FbM\u001b\u0007]kY\u0012A\\h\u0012\u001dG_}S\u001b\\W";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 434;
                    str = "fZ\u0007w@hR\u0011\\WRU\u0017L";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 435;
                    str = "@{K";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 436;
                    str = "}S\u001fA\\yZ\u0006\\miV\rIPaZ\u001a\t\u000f2";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 437;
                    str = "`L\u0019{FbM\u001b\u0007Ba^\u0017FFhG\nwVdL\u001fJ^h[!KZh\\\u0015[G`\u0010\u0010Gm`[K";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 438;
                    str = "nW\u001f\\maV\r\\";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 439;
                    str = "-V\u0010K@h^\rM\b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 440;
                    str = "-L\nI@y\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 441;
                    str = "aV\u0010CARI\u001bZAdP\u0010";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 442;
                    str = "`L\u0019[FbM\u001b\u0007TyLQX]}J\u0012IFh";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 443;
                    str = "`L\u0019[FbM\u001b\u0007^dQ\u0015[\u001d}P\u000e]^lK\u001b\bFdR\u001b\bA}Z\u0010\\\b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 444;
                    str = "aV\u0010CARM\u001bIVt";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 445;
                    str = "`L\u0019[FbM\u001b\u0007^dQ\u0015[\u001d}P\u000e]^lK\u001b\u0007Wc[QLP-L\u0017RW7";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 446;
                    str = "`L\u0019[FbM\u001b\u0007^dQ\u0015[\u001d}P\u000e]^lK\u001b\u0007PhX\u0017FU\"[\u001c\bAdE\u001b\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 447;
                    str = "kK\rw[c[\u001bPm~K\u001fZF";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 448;
                    str = "`L\u0019[FbM\u001b\u0007GcL\nI@lS\u0012\u0012\u0012-";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 449;
                    str = "~K\u001fZ@h[";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 450;
                    str = "-~0l\u0012fZ\u0007w@hR\u0011\\WRU\u0017L\u000f2";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 451;
                    str = "`Z\r[SjZ\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 452;
                    str = "~K\u001fZ@h[C\u0017";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 453;
                    str = "`L\u0019[FbM\u001b\u0007UhK\u0013MA~^\u0019M\u0012cP^KG\u007fL\u0011Z\u0013";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 454;
                    str = "^z2mqY\u001f\u0015MKRY\fG_RR\u001b\u0004\u0012fZ\u0007w[i\u0013^[FlK\u000b[\u001e-Q\u001bMV~`\u000e]Ae\u0013^LSy^R\bFdR\u001b[FlR\u000e\u0004\u0012`Z\u001aASRJ\fD\u001e-R\u001bL[l`\u0013A_h`\nQBh\u0013^EWiV\u001fwEl`\nQBh\u0013^EWiV\u001fwAdE\u001b\u0004\u0012`Z\u001aASRQ\u001fEW!\u001f\u0013MVd^!KS}K\u0017G\\!\u001f\u0013MVd^!@S~WR\b_h[\u0017ImiJ\fIFdP\u0010\u0004\u0012bM\u0017O[c\u0013^DSyV\n]Vh\u0013^D]cX\u0017\\GiZR\bFeJ\u0013JmdR\u001fOW!\u001f\fM_bK\u001bw@hL\u0011]@nZR\b@lH!LSy^R\b@h\\\u0017X[hQ\nwQbJ\u0010\\\u001e-O\u001fZFd\\\u0017XScK!@S~WR\bAy^\fZWi\u0013^w[i\u0013^CWt`\fM_bK\u001bwXd[^n`Br^EW~L\u001fOW~\u001f)`w_z^w[i\u0002A";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 455;
                    str = "fZ\u0007w@hR\u0011\\WRU\u0017L";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 456;
                    str = "`L\u0019[FbM\u001b\u0007Si[\u0013MA~^\u0019M\u001dl\\Q@\u001d~J\u001dKW~L";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 457;
                    str = "`L\u0019[FbM\u001b\u0007Si[\u0013MA~^\u0019M\u001dl\\Q@\u001diJ\u000e";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 458;
                    str = "`L\u0019[FbM\u001b\u0007Si[\u0013MA~^\u0019M\u001dl\\Q@";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 459;
                    str = "`L\u0019[FbM\u001b\u0007QaZ\u001fZ_~X\r\u0007Xd[^";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 460;
                    str = "`L\u0019[FbM\u001b\u0007UhK\nGBNP\u0010^W\u007fL\u001f\\[bQ\r\u0007Vo\u0010\u001d]@~P\f\b[~\u001f\u0010]^a";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 461;
                    str = "fZ\u0007w@hR\u0011\\WRU\u0017L";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 462;
                    str = "^z2mqY\u001f\u0015MKRM\u001bE]yZ!B[i\u0013^k}Xq*\u0000YhF!ZW`P\nMmgV\u001a\u0001\u0012lL^K]xQ\nwAhQ\n\bt_p3\b_hL\rIUhL^\u007fzHm;\bYhF!N@bR!EW0\u000e^i|I\u001f\nA_hL\nI_}\u0001A\bu_p+x\u0012Of^CWt`\fM_bK\u001bwXd[^g`Iz,\bpT\u001f\u001dGGcK![WcK^lw^|^d{@v*\b\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 463;
                    str = "^z2mqY\u001f\u001dGGcKV\u0002\u001b-y,g\u007f-R\u001b[AlX\u001b[\u0012Zw;zw-T\u001bQm\u007fZ\u0013GFh`\u0014AV0\u0000^\bsC{^[FlM\fMV0\u000e";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 464;
                    str = "`L\u0019[FbM\u001b\u0007QbJ\u0010\\ay^\fZWir\u001b[AlX\u001b[\u001di]^F]-R\u001b[AlX\u001b\bTbM^";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 465;
                    str = "`L\u0019[FbM\u001b\u0007QbJ\u0010\\ay^\fZWir\u001b[AlX\u001b[\u001di]^F]-\\\u000bZAbM^N]\u007f\u001f";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 466;
                    str = "`L\u0019[FbM\u001b\u0007QaZ\u001fZ_~X\rwWu\\\u0012]VhL\nI@\u007fZ\u001a\u0007Xd[^";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 467;
                    str = "fZ\u0007w@hR\u0011\\WRU\u0017L";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 468;
                    str = "`L\u0019[FbM\u001b\u0007UhK\u0012IAyR\u001b[AlX\u001b[TbM\u0010GFdY\u0017KSyV\u0011F\u001dDS\u0012MUlS-\\SyZ;PQhO\nA]c\u001f";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 469;
                    str = "^z2mqY\u001f\fM_bK\u001bw@hL\u0011]@nZ^n`Br^EW~L\u001fOW~\u001f)`w_z^CWt`\fM_bK\u001bwXd[C\u0017\u0012Lq:\b_h[\u0017Imz^!\\K}ZC\u0018\u0012Lq:\bYhF!N@bR!EW0\u000e^i|I\u001f\r\\SyJ\r\u0015\u0004-~0l\u0012`Z\u001aASRL\u0017RW0\u000eL\bsC{^EWiV\u001fwVxM\u001f\\[bQC\u0019\u0012Bm:m`-}'\bmd[^lw^|^d{@v*\b\u0003";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 470;
                    str = "Iz2mfH\u001f8z}@\u001f\fMQhV\u000e\\A-h6m`H\u001f\u0015MKRM\u001bE]yZ!B[i\u0002A";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 471;
                    str = "jU\u0017L";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 472;
                    str = "jM\u0011]BRO\u001fZFd\\\u0017XScK\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 473;
                    str = "Iz2mfH\u001f8z}@\u001f\u0013MA~^\u0019MA-h6m`H\u001f\u0015MKRM\u001bE]yZ!B[i\u0002A\bsC{^EWiV\u001fwEl`\nQBh\u001eC\u0010";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 474;
                    str = "Iz2mfH\u001f8z}@\u001f\u001d@Sy`\u0012AAy\u001f)`w_z^CWt`\fM_bK\u001bwXd[C\u0017";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 475;
                    str = "jU\u0017L\u000f2";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 476;
                    str = "^z2mqY\u001f!AV-y,g\u007f-R\u001b[AlX\u001b[\u0012Zw;zw-T\u001bQm\u007fZ\u0013GFh`\u0014AV0\u0000^i|I\u001f\u0015MKRY\fG_RR\u001b\u0015\r-~0l\u0012fZ\u0007w[i\u0002A";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 477;
                    str = "`L\u0019[FbM\u001b\u0007UhK\u0017LTbM\u0013[U-Q\u0011\bQxM\rG@,";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 478;
                    str = "`L\u0019[FbM\u001b\u0007S\u007f\\\u0016ADh^\u0012D\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 479;
                    str = "~K\u001f\\G~";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 480;
                    str = "`Z\r[SjZ\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 481;
                    str = "fZ\u0007wT\u007fP\u0013w_h\u0002O\bsC{^CWt`\fM_bK\u001bwXd[C\u0017\u0012Lq:\bAy^\n]A0\u0000";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 482;
                    str = "`L\u0019[FbM\u001b\u0007TdQ\u0017[Z";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 483;
                    str = "`L\u0019[FbM\u001b\u0007TdQ\u0017[Z";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 484;
                    str = "R[\u001f\\S0\u0000";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 485;
                    str = "`L\u0019[FbM\u001b\u0007]c{\u001bDWyZ3MVd^3MA~^\u0019M";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 486;
                    str = "`L\u0019[FbM\u001b\u0007]c{\u001bDWyZ3MVd^3MA~^\u0019M";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 487;
                    str = "^z2mqY\u001f\u0015MKRY\fG_RR\u001b\u0004\u0012fZ\u0007w[i\u0013^[FlK\u000b[\u001e-Q\u001bMV~`\u000e]Ae\u0013^LSy^R\bFdR\u001b[FlR\u000e\u0004\u0012`Z\u001aASRJ\fD\u001e-R\u001bL[l`\u0013A_h`\nQBh\u0013^EWiV\u001fwEl`\nQBh\u0013^EWiV\u001fwAdE\u001b\u0004\u0012`Z\u001aASRQ\u001fEW!\u001f\u0013MVd^!KS}K\u0017G\\!\u001f\u0013MVd^!@S~WR\b_h[\u0017ImiJ\fIFdP\u0010\u0004\u0012bM\u0017O[c\u0013^DSyV\n]Vh\u0013^D]cX\u0017\\GiZR\bFeJ\u0013JmdR\u001fOW!\u001f\fM_bK\u001bw@hL\u0011]@nZR\b@lH!LSy^R\b@h\\\u0017X[hQ\nwQbJ\u0010\\\u001e-O\u001fZFd\\\u0017XScK!@S~WR\bAy^\fZWi\u0013^w[i\u0013^D[cT\r\u0006^dQ\u0015w[c[\u001bP\u0012Ll^D[cT!A\\iZ\u0006\bt_p3\b_hL\rIUhLR\b\u001a^z2mqY\u001f\u0013MA~^\u0019Mm\u007fP\tw[i\u0013^D[cT!A\\iZ\u0006\bt_p3\b_hL\rIUhL!D[cT\r\beEz,m\u0012`Z\r[SjZ\rw^dQ\u0015[\u001cfZ\u0007w@hR\u0011\\WRU\u0017L\u000f2\u001f?fv-R\u001b[AlX\u001bw@bH!AV-v0\b\u001a-l;dwNk^L]nV\u001a\bt_p3\b_hL\rIUhL!NF~\u0013^EW~L\u001fOW~\u001f)`w_z^K]cK\u001bFF-r?|qE\u001fA\bsC{^EW~L\u001fOW~`\u0018\\A#[\u0011K[i\u001fC\b_hL\rIUhLPw[i\u0016W\b^dQ\u0015[\u0012Zw;zw-R\u001b[AlX\u001b[\u001cRV\u001a\b\u000f-S\u0017FY~\u0011\u0013MA~^\u0019Mm\u007fP\tw[i\u001f1zvHm^jk-`\u0017L\u0012Iz-k";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 488;
                    str = "^z2mqY\u001f\u0015MKRY\fG_RR\u001b\u0004\u0012fZ\u0007w[i\u0013^[FlK\u000b[\u001e-Q\u001bMV~`\u000e]Ae\u0013^LSy^R\bFdR\u001b[FlR\u000e\u0004\u0012`Z\u001aASRJ\fD\u001e-R\u001bL[l`\u0013A_h`\nQBh\u0013^EWiV\u001fwEl`\nQBh\u0013^EWiV\u001fwAdE\u001b\u0004\u0012`Z\u001aASRQ\u001fEW!\u001f\u0013MVd^!KS}K\u0017G\\!\u001f\u0013MVd^!@S~WR\b_h[\u0017ImiJ\fIFdP\u0010\u0004\u0012bM\u0017O[c\u0013^DSyV\n]Vh\u0013^D]cX\u0017\\GiZR\bFeJ\u0013JmdR\u001fOW!\u001f\fM_bK\u001bw@hL\u0011]@nZR\b@lH!LSy^R\b@h\\\u0017X[hQ\nwQbJ\u0010\\\u001e-O\u001fZFd\\\u0017XScK!@S~WR\bAy^\fZWi\u0013^w[i\u0013^D[cT\r\u0006^dQ\u0015w[c[\u001bP\u0012Ll^D[cT!A\\iZ\u0006\bt_p3\b_hL\rIUhLR\b\u001a^z2mqY\u001f\u0013MA~^\u0019Mm\u007fP\tw[i\u0013^D[cT!A\\iZ\u0006\bt_p3\b_hL\rIUhL!D[cT\r\beEz,m\u0012`Z\r[SjZ\rw^dQ\u0015[\u001cfZ\u0007w@hR\u0011\\WRU\u0017L\u000f2\u0016^D[cT\r\beEz,m\u0012`Z\r[SjZ\r\u0006md[^\u0015\u0012aV\u0010CA#R\u001b[AlX\u001bw@bH!AV-p,lw_\u001f<q\u0012RV\u001a\bvHl=";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 489;
                    str = "aV\u0010CARM\u001bIVt";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 490;
                    str = "`L\u0019[FbM\u001b\u0007QlQ\u000f]W\u007fFQLWaZ\nMVo";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 491;
                    str = "`L\u0019[FbM\u001b\u0007QlQ\u000f]W\u007fFQK]xQ\n\b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 492;
                    str = "`L\u0019[FbM\u001b\u0007QlQ\u000f]W\u007fFQLPnP\fZG}K";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 493;
                    str = "`L\u0019[FbM\u001b\u0007QlQ\u000f]W\u007fF^";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 494;
                    str = "`L\u0019[FbM\u001b\u0007QlQ\u000f]W\u007fFQKG\u007fL\u0011Z\u001dhQ\u001dZK}K\u001bL\u001fkV\u0012M\u001fhM\fG@";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 495;
                    str = "`L\u0019[FbM\u001b\u0007QlQ\u000f]W\u007fFQM\\nM\u0007XFh[SN[aZSM@\u007fP\f";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 496;
                    str = "`L\u0019[FbM\u001b\u0007QlQ\u000f]W\u007fFQF]nJ\f[]\u007f\u001f\u0002\bFdR\u001b\bA}Z\u0010\\\b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 497;
                    str = "`L\u0019[FbM\u001b\u0007QlQ\u000f]W\u007fF";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 498;
                    str = "^z2mqY\u001f=ggCkV\u0002\u001b-y,g\u007f-R\u001b[AlX\u001b[";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 499;
                    str = "kV\u0012M\u0012dL^M\\nM\u0007XFh[";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 500;
                    str = "kV\u0012M\u0012dL^M\\nM\u0007XFh[";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 501;
                    str = "`L\u0019[FbM\u001b\u0007QlQ\u000f]W\u007fF";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 502;
                    str = "-C^\\[`Z^[BhQ\n\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 503;
                    str = "^z2mqY\u001f\u0015MKRY\fG_RR\u001b\u0004\u0012fZ\u0007w[i\u0013^[FlK\u000b[\u001e-Q\u001bMV~`\u000e]Ae\u0013^LSy^R\bFdR\u001b[FlR\u000e\u0004\u0012`Z\u001aASRJ\fD\u001e-R\u001bL[l`\u0013A_h`\nQBh\u0013^EWiV\u001fwEl`\nQBh\u0013^EWiV\u001fwAdE\u001b\u0004\u0012`Z\u001aASRQ\u001fEW!\u001f\u0013MVd^!KS}K\u0017G\\!\u001f\u0013MVd^!@S~WR\b_h[\u0017ImiJ\fIFdP\u0010\u0004\u0012bM\u0017O[c\u0013^DSyV\n]Vh\u0013^D]cX\u0017\\GiZR\bFeJ\u0013JmdR\u001fOW!\u001f\fM_bK\u001bw@hL\u0011]@nZR\b@lH!LSy^R\b@h\\\u0017X[hQ\nwQbJ\u0010\\\u001e-O\u001fZFd\\\u0017XScK!@S~WR\bAy^\fZWi\u0013^w[i\u001f8z}@\u001f\u0013MA~^\u0019MA-h6m`H\u001f\u0015MKRM\u001bE]yZ!B[i\u0002A\bsC{^EWiV\u001fwEl`\nQBh\u001eC\u0010\u0012Lq:\bYhF!N@bR!EW0\u000f^g`Iz,\bpT\u001f!AV-{;{q-s7e{Y\u001f";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 504;
                    str = "`L\u0019[FbM\u001b\u0007UhK\u0012IAyR\u001b[AlX\u001b[TbM\u0010GFdY\u0017KSyV\u0011F\u001dDS\u0012MUlS-\\SyZ;PQhO\nA]c\u001f";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 505;
                    str = "`Z\r[SjZ\rwTyL";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 506;
                    str = "`L\u0019[FbM\u001b\u0007TyLQX]}J\u0012IFh\u0010\u001bFV\"[\u001c\bAdE\u001b\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 507;
                    str = "kK\rw@h^\u001aQ";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 508;
                    str = "-V\u0010K@h^\rM\b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 509;
                    str = "`L\u0019[FbM\u001b\u0007TyLQX]}J\u0012IFh\u0010\u001cMUdQ\u0019\u0007Vo\u001f\rAHh\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 510;
                    str = "`L\u0019[FbM\u001b\u0007TyLQGByV\u0013AHh";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 511;
                    str = "`L\u0019[FbM\u001b\u0007TyLQGByV\u0013AHh\u001f\nA_h\u001f\rXWcKD";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 512;
                    str = "bO\nA_dE\u001b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 513;
                    str = "`L\u0019[FbM\u001b\u0007TyLQX]}J\u0012IFh\u001f\nA_h\u001f\rXWcKD";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 514;
                    str = "kK\rw[c[\u001bPm~K\u001fZF";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 515;
                    str = "`Z\r[SjZ\rwTyL";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 516;
                    str = "-L\nI@y\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 517;
                    str = "kK\rwFbT\u001bF[wZ\fwDhM\rA]c";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 518;
                    str = "`L\u0019[FbM\u001b\u0007TyLQX]}J\u0012IFh";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 519;
                    str = "`L\u0019[FbM\u001b\u0007G}[\u001f\\WjM\u0011]BnW\u001f\\\u001d";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 520;
                    str = "-\\\fMSyV\u0011F\u000f";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 521;
                    str = "`L\u0019[FbM\u001b\u0007VhS\u001b\\W`Z\r[SjZ\r\b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 522;
                    str = "^z2mqY\u001f\u0015MKRY\fG_RR\u001b\u0004\u0012fZ\u0007w[i\u0013^[FlK\u000b[\u001e-Q\u001bMV~`\u000e]Ae\u0013^LSy^R\bFdR\u001b[FlR\u000e\u0004\u0012`Z\u001aASRJ\fD\u001e-R\u001bL[l`\u0013A_h`\nQBh\u0013^EWiV\u001fwEl`\nQBh\u0013^EWiV\u001fwAdE\u001b\u0004\u0012`Z\u001aASRQ\u001fEW!\u001f\u0013MVd^!KS}K\u0017G\\!\u001f\u0013MVd^!@S~WR\b_h[\u0017ImiJ\fIFdP\u0010\u0004\u0012bM\u0017O[c\u0013^DSyV\n]Vh\u0013^D]cX\u0017\\GiZR\bFeJ\u0013JmdR\u001fOW!\u001f\fM_bK\u001bw@hL\u0011]@nZR\b@lH!LSy^R\b@h\\\u0017X[hQ\nwQbJ\u0010\\\u001e-O\u001fZFd\\\u0017XScK!@S~WR\bAy^\fZWi\u0013^w[i\u001f8z}@\u001f\u0013MA~^\u0019MA-h6m`H\u001f\u0015MKRM\u001bE]yZ!B[i\u0002A\bsC{^EWiV\u001fwEl`\nQBh\u001eC\u0010\u0012Bm:m`-}'\bmd[^lw^|^d{@v*\b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 523;
                    str = "#I\u001dN";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 524;
                    str = "Xk8\u0005\n";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 525;
                    str = "aP\u001fLTbM\u001bESdSQ^QlM\u001a\u0005_~X\r\u0007E\u007fV\nM\u001fk^\u0017DWi";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 526;
                    str = "V\u0000Dt\u001d'\u001dB\u0016NQGN\u0018\u001fQGOno";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 527;
                    str = "`L\u0019[FbM\u001b\u0007W`^\u0017DmnP\u0010^W\u007fL\u001f\\[bQQE[~L\u0017FURM\u0013\\m~M\u001d\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 528;
                    str = "eK\nXA7\u0010QES}LPO]bX\u0012M\u001cnP\u0013\u0007\r|\u0002";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 529;
                    str = "-\u0012^";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 530;
                    str = "Xk8\u0005\n";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 531;
                    str = "aP\u001fLTbM\u001bESdSQM@\u007fP\f\b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 532;
                    str = "aP\u001fLTbM\u001bESdSQF] L\u000eIQh";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 533;
                    str = "`L\u0019[FbM\u001b\u0007^b^\u001aN]\u007fZ\u0013I[a\u0010";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 534;
                    str = "V\u0000Dt\u001d'\u001dB\u0016NQGN\u0018\u001fQGOno";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 535;
                    str = "`L\u0019[FbM\u001b\u0007^b^\u001aN]\u007fZ\u0013I[a\u001f\u001dI\\cP\n\bQ\u007fZ\u001f\\W-^\n\\SnW\u0013M\\y\u001f\u0018A^h";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 536;
                    str = "aP\u001fLTbM\u001bESdSQ\\]y^\u0012\bQbJ\u0010\\\b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 537;
                    str = "aP\u001fLTbM\u001bESdSQ\\Jy\u0012\u0013[U~\u0010\tZ[yZSNSdS\u001bL";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 538;
                    str = "7\u001f";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 539;
                    str = "^z2mqY\u001f\u0015MKRY\fG_RR\u001b\u0004\u0012fZ\u0007w[i\u0013^[FlK\u000b[\u001e-Q\u001bMV~`\u000e]Ae\u0013^LSy^R\bFdR\u001b[FlR\u000e\u0004\u0012`Z\u001aASRJ\fD\u001e-R\u001bL[l`\u0013A_h`\nQBh\u0013^EWiV\u001fwEl`\nQBh\u0013^EWiV\u001fwAdE\u001b\u0004\u0012`Z\u001aASRQ\u001fEW!\u001f\u0013MVd^!KS}K\u0017G\\!\u001f\u0013MVd^!@S~WR\b_h[\u0017ImiJ\fIFdP\u0010\u0004\u0012bM\u0017O[c\u0013^DSyV\n]Vh\u0013^D]cX\u0017\\GiZR\bFeJ\u0013JmdR\u001fOW!\u001f\fM_bK\u001bw@hL\u0011]@nZR\b@lH!LSy^R\b@h\\\u0017X[hQ\nwQbJ\u0010\\\u001e-O\u001fZFd\\\u0017XScK!@S~WR\bAy^\fZWi\u0013^w[i\u001f8z}@\u001f\u0013MA~^\u0019MA-h6m`H\u001f\u0015MKRM\u001bE]yZ!B[i\u0002A\bsC{^w[i\u0001C\u0017\u0012Lq:\b_h[\u0017Imz^!\\K}Z_\u0015\n-p,lw_\u001f<q\u0012RV\u001a\bs^|";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 540;
                    str = "aP\u001fLTbM\u001bESdSQ\\K}ZQ]\\fQ\u0011_\\7\u001f";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 541;
                    str = "V\u0000Dt\u001d'\u001dB\u0016NP";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 542;
                    str = "#I\u001dN";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 543;
                    str = "#K\u0006\\";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 544;
                    str = "\"K\u0011\\Sa\u001f\rAHh\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 545;
                    str = "CP^[Bl\\\u001b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 546;
                    str = "\"K\u0011\\Sa\u001f\u001f\\Fl\\\u0016\bTdS\u001b\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 547;
                    str = "aP\u001fLTbM\u001bESdSQM@\u007fP\f\b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 548;
                    str = "`L\u0019[FbM\u001b\u0007G}[\u001f\\WJM\u0011]B]^\f\\[nV\u000eI\\yLQ";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 549;
                    str = "@Z\r[SjZ\r\bs~F\u0010K\u0012NP\u0013E[y\u001f*@@h^\u001a";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 550;
                    str = "`Z\u001aASRM\u001bNA";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 551;
                    str = "`L\u0019[FbM\u001b\u0007VhS\u001b\\WlS\u0012EAjL";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 552;
                    str = "Iz2mfH\u001f8z}@\u001f\u001d@Sy`\u0012AAy\u001f)`w_z^CWt`\fM_bK\u001bwXd[^f}Y\u001f2ayH\u0018[\u0005\u0017*";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 553;
                    str = "Iz2mfH\u001f8z}@\u001f\u0013MA~^\u0019MA-h6m`H\u001f!AV,\u0002O\bsC{^EWiV\u001fwEl`\nQBh\u001f_\u0015\u00125";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 554;
                    str = "`Z\r[SjZ\rwTyL";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 555;
                    str = "\u007fZ\u001dM[}K\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 556;
                    str = "`Z\r[SjZ\rw^dQ\u0015[";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 557;
                    str = "`L\u0019[FbM\u001b\u0007VhS\u001b\\WlS\u0012EAjL";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 558;
                    str = "`L\u0019[FbM\u001b\u0007VhS\u001b\\WlS\u0012EAjL^\\[`Z^[BhQ\n\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 559;
                    str = "Xo:ifH\u001f\u001d@Sy`\u0012AAy\u001f-mf-R\u001b[AlX\u001bwFl]\u0012Mmd[C\u0019\u001e-R\u0011Lmy^\u0019\u0015\u0002";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 560;
                    str = "nP\u0010\\WcK";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 561;
                    str = "`Z\r[SjZ!Z]z`\u0017L";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 562;
                    str = "`Z\r[SjZ\rw^dQ\u0015[";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 563;
                    str = "fZ\u0007w@hR\u0011\\WRU\u0017L";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 564;
                    str = "`Z\r[SjZ\rwTyL";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 565;
                    str = "aV\u0010CmdQ\u001aMJ";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 566;
                    str = "iP\u001dAV";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 567;
                    str = "^z2mqY\u001f\u0015MKRY\fG_RR\u001b\u0004\u0012fZ\u0007w[i\u0013^[FlK\u000b[\u001e-Q\u001bMV~`\u000e]Ae\u0013^LSy^R\bFdR\u001b[FlR\u000e\u0004\u0012`Z\u001aASRJ\fD\u001e-R\u001bL[l`\u0013A_h`\nQBh\u0013^EWiV\u001fwEl`\nQBh\u0013^EWiV\u001fwAdE\u001b\u0004\u0012`Z\u001aASRQ\u001fEW!\u001f\u0013MVd^!KS}K\u0017G\\!\u001f\u0013MVd^!@S~WR\b_h[\u0017ImiJ\fIFdP\u0010\u0004\u0012bM\u0017O[c\u0013^DSyV\n]Vh\u0013^D]cX\u0017\\GiZR\bFeJ\u0013JmdR\u001fOW!\u001f\fM_bK\u001bw@hL\u0011]@nZR\b@lH!LSy^R\b@h\\\u0017X[hQ\nwQbJ\u0010\\\u001e-O\u001fZFd\\\u0017XScK!@S~WR\bAy^\fZWi\u0013^w[i\u001f8z}@\u001f\u0013MA~^\u0019MA-h6m`H\u001f\u0015MKRM\u001bE]yZ!B[i\u0002A\bsC{^EWiV\u001fwEl`\nQBh\u001eC\u0010\u0012Bm:m`-}'\bmd[^lw^|";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 568;
                    str = "oM\u0011IVn^\r\\";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 569;
                    str = "`L\u0019[FbM\u001b\u0007^lL\n\u0007_hL\rIUh\u0010\u0014AV-V\r\b\\xS\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 570;
                    str = "`L\u0019[FbM\u001b\u0007^lL\n\u0007_hL\rIUh\u0010\u0010G\u0012nW\u001f\\\u0012kP\f\b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 571;
                    str = "^z2mqY\u001f!AV-y,g\u007f-R\u001b[AlX\u001b[\u0012Zw;zw-M\u001bE]yZ!ZW~P\u000bZQh\u0002A\b~Dr7|\u0012<";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 572;
                    str = "^z2mqY\u001f\u0015MKRM\u001bE]yZ!B[i\u0013^ZWnZ\u0017XFR[\u001b^[nZ!\\[`Z\r\\S`OR\b@h^\u001awVhI\u0017KWRK\u0017EW~K\u001fEB!\u001f\u000eDStZ\u001awVhI\u0017KWRK\u0017EW~K\u001fEB-y,g\u007f-R\u001b[AlX\u001b[\u0012Zw;zw-T\u001bQm\u007fZ\u0013GFh`\u0014AV0\u0000^i|I\u001f\u0015MKRV\u001a\u0015\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 573;
                    str = "^z2mqY\u001f\fM_bK\u001bw@hL\u0011]@nZR\b@h\\\u001bABy`\u001aMDd\\\u001bwFdR\u001b[FlR\u000e\u0004\u0012\u007fZ\u001fLmiZ\bAQh`\nA_hL\nI_}\u0013^X^lF\u001bLmiZ\bAQh`\nA_hL\nI_}\u001f8z}@\u001f\fMQhV\u000e\\A-h6m`H\u001f\u0015MKRM\u001bE]yZ!B[i\u0002A\bsC{^CWt`\u0017L\u000f2";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 574;
                    str = "-~0l\u0012RV\u001a\u0014";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 575;
                    str = "iP\u001dAV";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 576;
                    str = "^z2mqY\u001f\u001aGQd[R\bQbQ\nM\\y\u001f8z}@\u001f\u0013MA~^\u0019MARY\n[\u001e-R\u001b[AlX\u001b[\u0012Zw;zw-\\\u0011FFhQ\n\b\u007fLk=`\u00122\u001f?fv-R\u001b[AlX\u001b[mkK\r\u0006Vb\\\u0017L\u00120\u001f\u0013MA~^\u0019MA#`\u0017L\u0012Lq:\b_hL\rIUhLPCWt`\fM_bK\u001bwXd[^\u0015\u00122";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 577;
                    str = "-{;{q";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 578;
                    str = "RV\u001a";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 579;
                    str = "-p,lw_\u001f<q\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 580;
                    str = "-s7e{Y\u001fO";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 581;
                    str = "`L\u0019[FbM\u001b\u0007TyLQ[WlM\u001d@TbM\u0014AV\"L\nI@yV\u001a\b\u000e-\u000f";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 582;
                    str = "`L\u0019[FbM\u001b\u0007TyLQ[WlM\u001d@TbM\u0014AV-K\u0017EW-L\u000eM\\y\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 583;
                    str = "`L\u0019[FbM\u001b\u0007TyLQ[WlM\u001d@TbM\u0014AV\"\\\u000bZAbM^AA-Q\u000bD^";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 584;
                    str = "`L\u0019[FbM\u001b\u0007TyLQ[WlM\u001d@TbM\u0014AV";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 585;
                    str = "-~-k";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 586;
                    str = "-Y\u0011]\\i\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 587;
                    str = "RV\u001a";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 588;
                    str = "-~0l\u0012RV\u001a\u0016";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 589;
                    str = "-p,lw_\u001f<q\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 590;
                    str = "`L\u0019[FbM\u001b\u0007GcL\u001bFV\u007fZ\u001fL@h\\\u001bAByL";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 591;
                    str = "`L\u0019[FbM\u001b\u0007GcL\u001bFV\u007fZ\u001fL@h\\\u001bAByLQB[i\u001f\u0017[\u0012cJ\u0012D\u0013";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 592;
                    str = "`L\u0019[FbM\u001b\u0007GcL\u001bFV\u007fZ\u001fL@h\\\u001bAByLQa^aZ\u0019I^^K\u001f\\WHG\u001dMByV\u0011F\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 593;
                    str = "`L\u0019[FbM\u001b\u0007GcL\u001bFV\u007fZ\u001fL@h\\\u001bAByL^";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 594;
                    str = "-C^\\[`Z^[BhQ\n\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 595;
                    str = "`Z\r[SjZ\rwYhF!ZW`P\nMmgV\u001a";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 596;
                    str = "`L\u0019[FbM\u001b\u0007UhK\u000eZ]}\u001f";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 597;
                    str = "^z2mqY\u001f\bI^xZ^n`Br^X@bO\r\beEz,m\u0012fZ\u0007\u0015\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 598;
                    str = "kK\rw@h^\u001aQ";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 599;
                    str = "fZ\u0007w@hR\u0011\\WRU\u0017L\u000f2\u001f?fv-T\u001bQmd[C\u0017\u0012Lq:\b@hR\u0011\\WRM\u001b[]xM\u001dM\u000f2";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 600;
                    str = "\u007fZ\u001dM[}K!LW{V\u001dMmyV\u0013MAy^\u0013X";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 601;
                    str = "-Y\u0011Z\u0012`Z\r[SjZ^";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 602;
                    str = "\u007fZ\u001dM[}K\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 603;
                    str = "fZ\u0007w@hR\u0011\\WRU\u0017L\u000f2\u001f?fv-T\u001bQmkM\u0011Em`ZC\u0017\u0012Lq:\bYhF!AV0\u0000";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 604;
                    str = "~K\u001f\\G~";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 605;
                    str = "}S\u001fQWi`\u001aMDd\\\u001bwFdR\u001b[FlR\u000e";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 606;
                    str = "\u007fZ\u001dM[}K!LW{V\u001dMmyV\u0013MAy^\u0013X";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 607;
                    str = "}S\u001fQWi`\u001aMDd\\\u001bwFdR\u001b[FlR\u000e";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 608;
                    str = "XQ\u001bPBh\\\nMV-L\nIFxL^";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 609;
                    str = "XQ\u001bPBh\\\nMV-L\nIFxL^";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 610;
                    str = "`Z\r[SjZ\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 611;
                    str = "\u007fZ\u0013GFh`\fMAbJ\fKW";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 612;
                    str = "\u007fZ\u001fLmiZ\bAQh`\nA_hL\nI_}";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 613;
                    str = "\u007fZ\u001dM[}K\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 614;
                    str = "\u007fZ\u001fLmiZ\bAQh`\nA_hL\nI_}";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 615;
                    str = "~K\u001f\\G~";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 616;
                    str = "-Y\u0011Z\u0012`Z\r[SjZ^";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 617;
                    str = "fZ\u0007w[i";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 618;
                    str = "`Z\r[SjZ\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 619;
                    str = "fZ\u0007w@hR\u0011\\WRU\u0017L";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 620;
                    str = "\u007fZ\u001dM[}K!LW{V\u001dMmyV\u0013MAy^\u0013X";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 621;
                    str = "@Z\r[SjZ^F]y\u001f\u0018Z]`\u001f\u0013M\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 622;
                    str = "`L\u0019[FbM\u001b\u0007G}[\u001f\\W`Z\r[SjZ\nI@jZ\n[FlK\u000b[[c]\u001fKYjM\u0011]\\i\u0010\u0017FAhM\n\u0007TlV\u0012MV-";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 623;
                    str = "`L\u0019[FbM\u001b\u0007G}[\u001f\\W`Z\r[SjZ\nI@jZ\n[FlK\u000b[[c]\u001fKYjM\u0011]\\i\u0010\u000bXVlK\u001b\u0007TlV\u0012MV-";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 624;
                    str = "`L\u0019[FbM\u001b\u0007G}[\u001f\\W`Z\r[SjZ\nI@jZ\n[FlK\u000b[[c]\u001fKYjM\u0011]\\i\u0010\u000bXVlK\u001b\u0007TlV\u0012MV-";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 625;
                    str = "XQ\u001bPBh\\\nMV-L\nIFxL^";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 626;
                    str = "fZ\u0007w@hR\u0011\\WRU\u0017L\u000f2\u001f?fv-T\u001bQmkM\u0011Em`ZC\u0017\u0012Lq:\bYhF!AV0\u0000";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 627;
                    str = "}S\u001fQWi`\u001aMDd\\\u001bwFdR\u001b[FlR\u000e";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 628;
                    str = "\u007fZ\u001fLmiZ\bAQh`\nA_hL\nI_}";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 629;
                    str = "-Y\u0011Z\u0012`Z\r[SjZ^";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 630;
                    str = "^z2mqY\u001f\u0015MKRY\fG_RR\u001b\u0004\u0012fZ\u0007w[i\u0013^[FlK\u000b[\u001e-Q\u001bMV~`\u000e]Ae\u0013^LSy^R\bFdR\u001b[FlR\u000e\u0004\u0012`Z\u001aASRJ\fD\u001e-R\u001bL[l`\u0013A_h`\nQBh\u0013^EWiV\u001fwEl`\nQBh\u0013^EWiV\u001fwAdE\u001b\u0004\u0012`Z\u001aASRQ\u001fEW!\u001f\u0013MVd^!KS}K\u0017G\\!\u001f\u0013MVd^!@S~WR\b_h[\u0017ImiJ\fIFdP\u0010\u0004\u0012bM\u0017O[c\u0013^DSyV\n]Vh\u0013^D]cX\u0017\\GiZR\bFeJ\u0013JmdR\u001fOW!\u001f\fM_bK\u001bw@hL\u0011]@nZR\b@lH!LSy^R\b@h\\\u0017X[hQ\nwQbJ\u0010\\\u001e-O\u001fZFd\\\u0017XScK!@S~WR\bAy^\fZWi\u0013^w[i\u001f8z}@\u001f\u0013MA~^\u0019MA-h6m`H\u001f\u0015MKRM\u001bE]yZ!B[i\u0002A\bsC{^EWiV\u001fwEl`\nQBh\u001eC\u0010\u0012Lq:\bmd[B\u0017\u0012Bm:m`-}'\bmd[^lw^|^d{@v*\b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 631;
                    str = "`L\u0019[FbM\u001b\u0007UhKQX@hI\u0017GG~\u001f\u001d]@~P\f\b\\xS\u0012\b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 632;
                    str = "`L\u0019[FbM\u001b\u0007UhKQX@hI\u0017GG~\u001f\u0010G\u0012d[^N]\u007f\u001f";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 633;
                    str = "`L\u0019[FbM\u001b\u0007QbO\u0007JSnT\u000bXFb[\u001c\u0007TlV\u0012MV-K\u0011\bVhS\u001b\\W-[\u001c\bPhY\u0011ZW-\\\u0011XKdQ\u0019\bT\u007fP\u0013\bPl\\\u0015]B-J\u000e\u0006";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 634;
                    str = "`L\u0019[FbM\u001b\u0007QbO\u0007JSnT\u000bXFb[\u001c\u0007\\b\u001f\u001cIQfJ\u000e\bVo\u001f\nG\u0012nP\u000eQ\u001c";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 635;
                    str = "`Z\u001aASR\\\u001fXFdP\u0010";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 636;
                    str = "`Z\u001aASRQ\u001fEW";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 637;
                    str = "i^\nI";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 638;
                    str = "RV\u001a";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 639;
                    str = "kK\rw[c[\u001bPm~K\u001fZF";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 640;
                    str = "^z2mqY\u001f!AV!\u001f\u001aIFl\u0013^EWiV\u001fwQlO\nA]c\u0013^EWiV\u001fw\\lR\u001b\u0004\u0012`Z\u001aASRJ\fD\u001e-R\u001bL[l`\tImyF\u000eM\u0012Km1e\u0012`Z\r[SjZ\r\beEz,m\u0012RV\u001a\u0016\r-p,lw_\u001f<q\u0012RV\u001a\bs^|^d{@v*\b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 641;
                    str = "`Z\u001aASRH\u001fwFtO\u001b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 642;
                    str = "`Z\u001aASRJ\fD";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 643;
                    str = "iP\u001dAV";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 644;
                    str = "kK\rw[c[\u001bPm~K\u001fZF";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 645;
                    str = "nP\u0010\\WcK";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 646;
                    str = "`Z\r[SjZ\rwTyL";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 647;
                    str = "`L\u0019[FbM\u001b\u0007UhK\u0012IAyR\u001b[AlX\u001b[TbM\u0010GFdY\u0017KSyV\u0011F\u001dDS\u0012MUlS-\\SyZ;PQhO\nA]c\u001f";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 648;
                    str = "^z2mqY\u001f\u0015MKRY\fG_RR\u001b\u0004\u0012fZ\u0007w[i\u0013^[FlK\u000b[\u001e-Q\u001bMV~`\u000e]Ae\u0013^LSy^R\bFdR\u001b[FlR\u000e\u0004\u0012`Z\u001aASRJ\fD\u001e-R\u001bL[l`\u0013A_h`\nQBh\u0013^EWiV\u001fwEl`\nQBh\u0013^EWiV\u001fwAdE\u001b\u0004\u0012`Z\u001aASRQ\u001fEW!\u001f\u0013MVd^!KS}K\u0017G\\!\u001f\u0013MVd^!@S~WR\b_h[\u0017ImiJ\fIFdP\u0010\u0004\u0012bM\u0017O[c\u0013^DSyV\n]Vh\u0013^D]cX\u0017\\GiZR\bFeJ\u0013JmdR\u001fOW!\u001f\fM_bK\u001bw@hL\u0011]@nZR\b@lH!LSy^R\b@h\\\u0017X[hQ\nwQbJ\u0010\\\u001e-O\u001fZFd\\\u0017XScK!@S~WR\bAy^\fZWi\u0013^w[i\u001f8z}@\u001f\u0013MA~^\u0019MA-h6m`H\u001f\u0015MKRM\u001bE]yZ!B[i\u0002A\bsC{^EWiV\u001fwEl`\nQBh\u001eC\u0010\u0012Lq:\b\u001afZ\u0007wT\u007fP\u0013w_h\u0002N\b}_\u001fV[FlK\u000b[\u000f;\u001f?fv-R\u001bL[l`\rAHh\u0002O\u0001\u0012Bm^\u0000Ay^\n]A0\t^i|I\u001f\u0013MVd^![[wZC\u001c\u0012Lq:\b_h[\u0017ImiJ\fIFdP\u0010\u0015\u0003$\u001f1z\u0012%L\nIFxLC\u001e\u0012Lq:\b_h[\u0017Im~V\u0004M\u000f<\r^i|I\u001f\u0013MVd^!LG\u007f^\nA]c\u0002O\u0001\u001b-p,lw_\u001f<q\u0012RV\u001a\bvHl=\b~Dr7|\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 649;
                    str = "`L\u0019[FbM\u001b\u0007B\u007fZ\u000eI@hL\nIFhR\u001bFF~";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 650;
                    str = "Dq-m`Y\u001f7ffB\u001f\u0013MVd^!ZWkL^\u0000BlK\u0016\u0004\u0012\u007fZ\u0018wQbJ\u0010\\\u001b-i?dgHl^\u0000\r!\u001fA\u0001";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 651;
                    str = "Xo:ifH\u001f\u0013MA~^\u0019MA-l;|\u0012~K\u001f\\G~\u0002A\u0004\u0012\u007fZ\u001dM[}K![W\u007fI\u001bZmyV\u0013MAy^\u0013X\u000f2\u0013^ZWnV\u000eAWcK!K]xQ\n\u0015\r-h6m`H\u001f\u0015MKRM\u001bE]yZ!B[i\u0002A\bsC{^CWt`\u0018Z]``\u0013M\u000f2\u001f?fv-T\u001bQmd[C\u0017";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 652;
                    str = "Xo:ifH\u001f\u0013MA~^\u0019MA-l;|\u0012~K\u001f\\G~\u0002A\u0004\u0012\u007fZ\u001dM[}K![W\u007fI\u001bZmyV\u0013MAy^\u0013X\u000f2\u0013^ZWnV\u000eAWcK!K]xQ\n\u0015\r-h6m`H\u001f\nA_hL\nI_}\u0002A\bsC{^CWt`\u0018Z]``\u0013M\u000f2\u001f?fv-T\u001bQmd[C\u0017";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 653;
                    str = "Xo:ifH\u001f\u0013MA~^\u0019MA-l;|\u0012~K\u001f\\G~\u0002A\beEz,m\u0012fZ\u0007w@hR\u0011\\WRU\u0017L\u000f2\u001f?fv-T\u001bQmkM\u0011Em`ZC\u0017\u0012Lq:\bYhF!AV0\u0000";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 654;
                    str = "^z2mqY\u001f!AV-y,g\u007f-R\u001b[AlX\u001b[\u0012Zw;zw-T\u001bQm\u007fZ\u0013GFh`\u0014AV0\u0000^i|I\u001f\u0015MKRY\fG_RR\u001b\u0015\r-~0l\u0012fZ\u0007w[i\u0002A";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 655;
                    str = "Iz2mfH\u001f8z}@\u001f\u0013MA~^\u0019MA-h6m`H\u001f!AV0\u0000";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 656;
                    str = "Iz2mfH\u001f8z}@\u001f\u0013MVd^!ZWkL^\u007fzHm;\bBlK\u0016\u0015\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 657;
                    str = "Xo:ifH\u001f\u0013MA~^\u0019MA-l;|\u0012~K\u001f\\G~\u0002A\u0004\u0012cZ\u001bLARO\u000b[Z0\u0000R\bVlK\u001f\u0015\r!\u001f\fIER[\u001f\\S0\u0000R\bFdR\u001b[FlR\u000e\u0015\r!\u001f\u0013MVd^!]@a\u0002A\u0004\u0012`Z\u001aASRR\u0017EWRK\u0007XW0\u0000R\b_h[\u0017Imz^!\\K}ZC\u0017\u001e-R\u001bL[l`\rAHh\u0002A\u0004\u0012`Z\u001aASRQ\u001fEW0\u0000R\b_h[\u0017Imn^\u000e\\[bQC\u0017\u001e-R\u001bL[l`\u0016IAe\u0002A\u0004\u0012`Z\u001aASR[\u000bZSyV\u0011F\u000f2\u0013^G@dX\u0017F\u000f2\u0013^DSyV\n]Vh\u0002A\u0004\u0012aP\u0010O[yJ\u001aM\u000f2\u0013^\\ZxR\u001cw[`^\u0019M\u000f2\u001f)`w_z^CWt`\fM_bK\u001bwXd[C\u0017\u0012Lq:\bYhF!N@bR!EW0\u0000^i|I\u001f\u0015MKRV\u001a\u0015\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 658;
                    str = "Xo:ifH\u001f\u0013MA~^\u0019MA-l;|\u0012~K\u001f\\G~\u0002A\u0004\u0012~Z\u0010LmyV\u0013MAy^\u0013X\u000f2\u0013^ZWnV\u000eAWcK!K]xQ\n\u0015\r!\u001f\fM_bK\u001bw@hL\u0011]@nZC\u0017\u0012Zw;zw-T\u001bQm\u007fZ\u0013GFh`\u0014AV0\u0000^i|I\u001f\u0015MKRY\fG_RR\u001b\u0015\r-~0l\u0012fZ\u0007w[i\u0002A";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 659;
                    str = "Xo:ifH\u001f\u0013MVd^!ZWkL^{wY\u001f\fMTR\\\u0011]\\y\u0002A\beEz,m\u0012}^\n@\u000f2";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 660;
                    str = "Dq-m`Y\u001f7ffB\u001f\u0013MA~^\u0019MA%T\u001bQm\u007fZ\u0013GFh`\u0014AV!\u001f\u0015MKRY\fG_RR\u001b\u0004\u0012fZ\u0007w[i\u0013^[FlK\u000b[\u001e-Q\u001bMV~`\u000e]Ae\u0013^LSy^R\bFdR\u001b[FlR\u000e\u0004\u0012`Z\u001aASRJ\fD\u001e-R\u001bL[l`\u0013A_h`\nQBh\u0013^EWiV\u001fwEl`\nQBh\u0013^EWiV\u001fwAdE\u001b\u0004\u0012`Z\u001aASRQ\u001fEW!\u001f\u0013MVd^!KS}K\u0017G\\!\u001f\u0013MVd^!@S~WR\b_h[\u0017ImiJ\fIFdP\u0010\u0004\u0012bM\u0017O[c\u0013^DSyV\n]Vh\u0013^D]cX\u0017\\GiZR\bFeJ\u0013JmdR\u001fOW!\u001f\fM_bK\u001bw@hL\u0011]@nZR\b@h\\\u001bADh[!\\[`Z\r\\S`OR\bAhQ\u001awFdR\u001b[FlR\u000e\u0004\u0012\u007fZ\u001dM[}K![W\u007fI\u001bZmyV\u0013MAy^\u0013X\u001e-M\u001bKWdO\nwVhI\u0017KWRK\u0017EW~K\u001fEB!\u001f\fIER[\u001f\\S!\u001f\u000eI@yV\u001dABlQ\nwZlL\u0016\u0004\u0012\u007fZ\u001dABdZ\u0010\\mnP\u000bFF$\u001f(i~Xz-\b\u001a2\u0013^\u0017\u001e-\u0000R\b\r!\u001fA\u0004\u00122\u0013^\u0017\u001e-\u0000R\b\r!\u001fA\u0004\u00122\u0013^\u0017\u001e-\u0000R\b\r!\u001fA\u0004\u00122\u0013^\u0017\u001e-\u0000R\b\r!\u001fA\u0004\u00122\u0013^\u0005\u0003!\u001fS\u0019\u001e-\u0012O\u0004\u00122\u0013^\u0017\u001e-\u0000W";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 661;
                    str = "Xo:ifH\u001f\u0013MA~^\u0019MA-l;|\u0012~K\u001f\\G~\u0002A\u0004\u0012}S\u001fQWi`\u001aMDd\\\u001bwFdR\u001b[FlR\u000e\u0015\r-h6m`H\u001f\u0015MKRM\u001bE]yZ!B[i\u0002A\bsC{^CWt`\u0018Z]``\u0013M\u000f2\u001f?fv-T\u001bQmd[C\u0017";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 662;
                    str = "`L\u0019[FbM\u001b\u0007QbO\u0007LPyP\u001cIQfJ\u000e\u0007\\b\u001f\u001aJ\u0012yP^JSnT\u000bX\u001c";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 663;
                    str = "`L\u0019[FbM\u001b\u0007QbO\u0007LPyP\u001cIQfJ\u000e\u0007TlV\u0012MV-K\u0011\bVhS\u001b\\W-]\u001fKYxO^N[aZ^JWkP\fM\u0012nP\u000eQ[cX^N@bR^LP#";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 664;
                    str = "nM\u001bIFdP\u0010";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 665;
                    str = "~J\u001cBWnK";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 666;
                    str = "nW\u001f\\maV\r\\";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 667;
                    str = "nW\u001f\\maV\r\\";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 668;
                    str = "fZ\u0007w@hR\u0011\\WRU\u0017L";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 669;
                    str = "fZ\u0007w@hR\u0011\\WRU\u0017L\u000f2";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 670;
                    str = "`L\u0019[FbM\u001b\u0007Si[\u0013[U\"\\\u0016IFaV\r\\\u001ddQ\rM@y\u0010\u0018I[aZ\u001a\bUd[C";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 671;
                    str = "`L\u0019[FbM\u001b\u0007TdZ\u0012LAy^\n\u0007[~[\u001f\\So^\rM[cK\u001bO@dK\u0007GY\"Z\fZ]\u007f\u001f";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 672;
                    str = "`L\u0019[FbM\u001b\u0007TdZ\u0012LAy^\n\u0007[~[\u001f\\So^\rM[cK\u001bO@dK\u0007GY-";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 673;
                    str = "]m?o\u007fL\u001f\u0017FFhX\fAFt`\u001d@WnT";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 674;
                    str = "bT";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 675;
                    str = "^z2mqY\u001f\u001dGGcKV\u0002\u001b-y,g\u007f-R\u001b[AlX\u001b[\u0012Zw;zw-T\u001bQm\u007fZ\u0013GFh`\u0014AV0\u0000^\bsC{^EWiV\u001fwEl`\nQBh\u001eC\u0010\u0012Lq:\bmd[@\u0017\u0012Lq:\bmd[B\u0015\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 676;
                    str = "-K\u0017EW-L\u000eM\\y\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 677;
                    str = "`L\u0019[FbM\u001b\u0007UhK\u0013MA~^\u0019MAlK\u0017L\u001di]^F]-R\u001b[AlX\u001b\bTbM^";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 678;
                    str = "`L\u0019[FbM\u001b\u0007UhK\u0013MA~^\u0019MAlK\u0017L\u001d}P\r\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 679;
                    str = "`L\u0019[FbM\u001b\u0007UhK\u0013MA~^\u0019MAlK\u0017L";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 680;
                    str = "`L\u0019[FbM\u001b\u0007UhK\u0013MA~^\u0019MAlK\u0017L\u0012}P\r\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 681;
                    str = "`L\u0019[FbM\u001b\u0007UhK\u0013MA~^\u0019MAlK\u0017L\u001dcP^KZlK^N]\u007f\u001f";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 682;
                    str = "`L\u0019[FbM\u001b\u0007UhK\u0013MA~^\u0019MAlK\u0017L\u001dnJ\f[]\u007f\u001f\u0017[\u0012cJ\u0012D";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 683;
                    str = "`L\u0019[FbM\u001b\u0007UhKQZWnZ\u0017XF~\u0010\u0010MEhM^";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 684;
                    str = "`L\u0019[FbM\u001b\u0007UhKQZWnZ\u0017XF~\u0010\u0010MEhM^F]-V\u001a\bTbM^";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 685;
                    str = "oV\u0010L\u007fhL\rIUh{\u001f\\S\"]\u001f[W;\u000bSLWnP\u001aM\u001d`Z\r[SjZPM\\nP\u001aA\\j\u0005";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 686;
                    str = "oV\u0010L\u007fhL\rIUh{\u001f\\S\"]\u001f[W;\u000bSLWnP\u001aM\u001d`Z\r[SjZPLSy^D";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 687;
                    str = "oV\u0010L\u007fhL\rIUh{\u001f\\S\"]\u001f[W;\u000bSLWnP\u001aM\u001dhM\fG@";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 688;
                    str = "`L\u0019[FbM\u001b\u0007G}[\u001f\\WjM\u0011]BnW\u001f\\Ax]\u0014MQy\u0010";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 689;
                    str = "`L\u0019[FbM\u001b\u0007[cV\nASaV\u0004M\u001dnW\u001f\\A\"U\u0017L\u0012dL^FGaS_";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 690;
                    str = "^z2mqY\u001f\u0015MKRM\u001bE]yZ!B[i\u0013^EW~L\u001fOWRK\u001fJ^h`\u0017L\u001e-S\u001f[FRM\u001bIVRR\u001b[AlX\u001bwFl]\u0012Mmd[R\b^lL\nw@h^\u001aw@h\\\u001bABy`\rM\\y`\u0013MA~^\u0019Mmy^\u001cDWRV\u001a\u0004\u0012lM\u001d@[{Z\u001a\u0004\u0012~P\f\\myV\u0013MAy^\u0013X\u001e-R\u0011Lmy^\u0019\u0004\u0012jZ\u0010\u0004\u0012`F!EW~L\u001fOW~\u0013^X^lV\u0010\\WuK!L[~^\u001cDWi\u001f8z}@\u001f\u001d@Sy`\u0012AAy";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 691;
                    str = "`L\u0019[FbM\u001b\u0007[cV\nASaV\u0004M\u001dxO\u001aIFh\u0012\u0019Z]xOS[Kc\\SNSdS\u001bL\u001f`L\u0019";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 692;
                    str = "`L\u0019[FbM\u001b\u0007[cV\nASaV\u0004M\u001dnW\u001f\\A";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 693;
                    str = "`L\u0019[FbM\u001b\u0007[cV\nASaV\u0004M\u001dxO\u001aIFh\u0012\u0019Z]xOSK@h^\nM\u001fk^\u0017DWi\u0012\u0013[U";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 694;
                    str = "jM\u0011]BRQ\u0011\\[nZ>\\W`O";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 695;
                    str = "`L\u0019[FbM\u001b\u0007[cV\nASaV\u0004M\u001dnW\u001f\\A-";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 696;
                    str = "}S\u001fA\\yZ\u0006\\miV\rIPaZ\u001a";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 697;
                    str = "{^\u0012]W";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 698;
                    str = "}M\u0011XA";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 699;
                    str = "fZ\u0007";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 700;
                    str = "`L\u0019[FbM\u001b\u0007AhK\u000eZ]}\u001f";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 701;
                    str = "!c\r\u0003";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 702;
                    str = "\u007fZ\u001d^\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 703;
                    str = "MLP_ZlK\rIB}\u0011\u0010MF";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 704;
                    str = "`L\u0019[FbM\u001b\u0007Si[Q";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 705;
                    str = "~Z\u0010L\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 706;
                    str = "`L\u0019[FbM\u001b\u0007Si[\u0013MA~^\u0019M\u001d`K";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 707;
                    str = "^z2mqY\u001f\u0014AV!\u001f\u001fL_dQR\bBhQ\u001aA\\j\u0013^[WcK![Wc[\u001bZmfZ\u0007\bt_p3\bU\u007fP\u000bXm}^\f\\[nV\u000eI\\yL^\u007fzHm;\bUgV\u001a\u0015\r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 708;
                    str = "`L\u0019[FbM\u001b\u0007^lL\n\u0007Vo\u0010\u001d]@~P\f\b[~\u001f\u0010]^a";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 709;
                    str = "`L\u0019[FbM\u001b\u0007^lL\n\u0007Vo\u001f\u0010G\u0012`Z\r[SjZ^N]\u007f\u001f";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 710;
                    str = "`L\u0019[FbM\u001b\u0007QeZ\u001dCZh^\u0012\\Z\"]\u001fKY\"[\u001bDWyZ^";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 711;
                    str = "`L\u0019[FbM\u001b\u0007QeZ\u001dCZh^\u0012\\Z-";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 712;
                    str = " U\u0011]@c^\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 713;
                    str = "`L\u0019[FbM\u001b\u0007QeZ\u001dCZh^\u0012\\Z";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 714;
                    str = "`L\u0019[FbM\u001b\u0007QeZ\u001dCZh^\u0012\\Z\"U\u0011]@c^\u0012\u0007VhS\u001b\\W-";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 715;
                    str = "#]\u001fKY";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 716;
                    str = "`L\u0019[FbM\u001b\u0007VhS\u001b\\Wn^\u0012D^bX\r\b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 717;
                    str = "^z2mqY\u001f!AV!\u001f\u0015MKRM\u001bE]yZ!B[i\u0013^LSy^R\b_h[\u0017Imn^\u000e\\[bQR\b_h[\u0017Imz^!\\K}Z^n`Br^EW~L\u001fOW~\u001f)`w_z^w[i\u0001A\b}_{;z\u0012Of^w[i\u001f?{q-s7e{Y\u001f";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 718;
                    str = "`Z\r[SjZ!Z]z`\u0017L";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 719;
                    str = "aV\u0010CARV\u0010LWu`\r\\S\u007fK";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 720;
                    str = "i^\nI";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 721;
                    str = "RV\u001a";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 722;
                    str = "aV\u0010CARV\u0010LWu`\r\\S\u007fK";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 723;
                    str = "fZ\u0007w@hR\u0011\\WRU\u0017L";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 724;
                    str = "aV\u0010CmdQ\u001aMJ";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 725;
                    str = "`Z\u001aASRH\u001fwFtO\u001b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 726;
                    str = "`Z\r[SjZ\rw^dQ\u0015[";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 727;
                    str = "fZ\u0007w@hR\u0011\\WRU\u0017L";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 728;
                    str = "`Z\u001aASR\\\u001fXFdP\u0010";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 729;
                    str = "`L\u0019[FbM\u001b\u0007[c\\\fM_hQ\n\u0005@hYSK]xQ\n";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 730;
                    str = "-[\f_\u000f";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 731;
                    str = "^z2mqY\u001f\u0015MKRY\fG_RR\u001b\u0004\u0012fZ\u0007w[i\u0013^[FlK\u000b[\u001e-Q\u001bMV~`\u000e]Ae\u0013^LSy^R\bFdR\u001b[FlR\u000e\u0004\u0012`Z\u001aASRJ\fD\u001e-R\u001bL[l`\u0013A_h`\nQBh\u0013^EWiV\u001fwEl`\nQBh\u0013^EWiV\u001fwAdE\u001b\u0004\u0012`Z\u001aASRQ\u001fEW!\u001f\u0013MVd^!KS}K\u0017G\\!\u001f\u0013MVd^!@S~WR\b_h[\u0017ImiJ\fIFdP\u0010\u0004\u0012bM\u0017O[c\u0013^DSyV\n]Vh\u0013^D]cX\u0017\\GiZR\bFeJ\u0013JmdR\u001fOW!\u001f\fM_bK\u001bw@hL\u0011]@nZR\b@lH!LSy^R\b@h\\\u0017X[hQ\nwQbJ\u0010\\\u001e-O\u001fZFd\\\u0017XScK!@S~WR\bAy^\fZWi\u0013^w[i\u001f8z}@\u001f\u0013MA~^\u0019MA-h6m`H\u001f!AV-v0\b\u001a^z2mqY\u001f\u001aGQd[^n`Br^EW~L\u001fOW~`\u0018\\A!\u001f\u0013MA~^\u0019MA-h6m`H\u001f\u001dG\\yZ\u0010\\\u0012@~*kz-\u0000^i|I\u001f\u0013MA~^\u0019MARY\n[\u001ciP\u001dAV-\u0002^EW~L\u001fOW~\u0011!AV-~0l\u0012`Z\r[SjZ\r\u0006_h[\u0017Imz^!\\K}Z^\u0015\u00124\u001f?fv-R\u001b[AlX\u001b[\u001cfZ\u0007w@hR\u0011\\WRU\u0017L\u000f2\u0016^g`Iz,\bpT\u001f!AV-{;{q";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 732;
                    str = "^z2mqY\u001f\u0015MKRY\fG_RR\u001b\u0004\u0012fZ\u0007w[i\u0013^[FlK\u000b[\u001e-Q\u001bMV~`\u000e]Ae\u0013^LSy^R\bFdR\u001b[FlR\u000e\u0004\u0012`Z\u001aASRJ\fD\u001e-R\u001bL[l`\u0013A_h`\nQBh\u0013^EWiV\u001fwEl`\nQBh\u0013^EWiV\u001fwAdE\u001b\u0004\u0012`Z\u001aASRQ\u001fEW!\u001f\u0013MVd^!KS}K\u0017G\\!\u001f\u0013MVd^!@S~WR\b_h[\u0017ImiJ\fIFdP\u0010\u0004\u0012bM\u0017O[c\u0013^DSyV\n]Vh\u0013^D]cX\u0017\\GiZR\bFeJ\u0013JmdR\u001fOW!\u001f\fM_bK\u001bw@hL\u0011]@nZR\b@lH!LSy^R\b@h\\\u0017X[hQ\nwQbJ\u0010\\\u001e-O\u001fZFd\\\u0017XScK!@S~WR\bAy^\fZWi\u0013^w[i\u001f8z}@\u001f\u0013MA~^\u0019MA-h6m`H\u001f^EWiV\u001fwEl`\nQBh\u0002G\bsC{^CWt`\fM_bK\u001bwXd[C\u0017\u0012Bm:m`-}'\bmd[^lw^|";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 733;
                    str = "^z2mqY\u001f\u0015MKRY\fG_RR\u001b\u0004\u0012fZ\u0007w[i\u0013^[FlK\u000b[\u001e-Q\u001bMV~`\u000e]Ae\u0013^LSy^R\bFdR\u001b[FlR\u000e\u0004\u0012`Z\u001aASRJ\fD\u001e-R\u001bL[l`\u0013A_h`\nQBh\u0013^EWiV\u001fwEl`\nQBh\u0013^EWiV\u001fwAdE\u001b\u0004\u0012`Z\u001aASRQ\u001fEW!\u001f\u0013MVd^!KS}K\u0017G\\!\u001f\u0013MVd^!@S~WR\b_h[\u0017ImiJ\fIFdP\u0010\u0004\u0012bM\u0017O[c\u0013^DSyV\n]Vh\u0013^D]cX\u0017\\GiZR\bFeJ\u0013JmdR\u001fOW!\u001f\fM_bK\u001bw@hL\u0011]@nZR\b@lH!LSy^R\b@h\\\u0017X[hQ\nwQbJ\u0010\\\u001e-O\u001fZFd\\\u0017XScK!@S~WR\bAy^\fZWi\u0013^w[i\u001f8z}@\u001f\u0013MA~^\u0019MA-h6m`H\u001f^EWiV\u001fwEl`\nQBh\u0002A\bsC{^CWt`\fM_bK\u001bwXd[C\u0017\u0012Bm:m`-}'\bmd[^lw^|";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 734;
                    str = "kK\rw@h^\u001aQ";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 735;
                    str = "kK\rw@h^\u001aQ";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 736;
                    str = "kK\rw@h^\u001aQ";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 737;
                    str = "kK\rw@h^\u001aQ";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 738;
                    str = "`L\u0019[FbM\u001b\u0007Si[\u0013[U\"Z\fZ]\u007f\u0010\u0019Z]xOQZW`P\nMm\u007fZ\rGG\u007f\\\u001b\b[~\u001f\u0010]^a\u001e^";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 739;
                    str = "`L\u0019[FbM\u001b\u0007Si[\u0013[U-Y\u001fA^h[^\\]-V\u0010[W\u007fK_";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 740;
                    str = "`L\u0019[FbM\u001b\u0007Wc[^\\@lQ\rIQyV\u0011F\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 741;
                    str = "kK\rw@h^\u001aQ";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 742;
                    str = "`L\u0019[FbM\u001b\u0007Wc[^\\@lQ\rIQyV\u0011F\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 743;
                    str = "`L\u0019[FbM\u001b\u0007Wc[^\\@lQ\rIQyV\u0011F\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 744;
                    str = "`L\u0019[FbM\u001b\u0007Wc[^\\@lQ\rIQyV\u0011F\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 745;
                    str = "^n2\b^bX\u0017K\u0012hM\fG@-P\f\b_dL\rA\\j\u001f\u001aIFl]\u001f[W";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 746;
                    str = "`L\u0019[FbM\u001b\u0007Si[\u0013[U\"]\u001fKYjM\u0011]\\i\u0010\nZScL\u001fKFdP\u0010\u0005VhS\u001fQWi\u001f";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 747;
                    str = "`L\u0019[FbM\u001b\u0007Si[\u0013[U\"H\u0017D^-M\u001b\\@t\u001f";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 748;
                    str = "^n2\b^bX\u0017K\u0012hM\fG@-P\f\b_dL\rA\\j\u001f\u001aIFl]\u001f[W";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 749;
                    str = "`L\u0019[FbM\u001b\u0007Si[\u0013[U-[\u000bX^d\\\u001f\\W-";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 750;
                    str = "kK\rw@h^\u001aQ";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 751;
                    str = "kK\rw@h^\u001aQ";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 752;
                    str = "^n2\b^bX\u0017K\u0012hM\fG@-P\f\b_dL\rA\\j\u001f\u001aIFl]\u001f[W";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 753;
                    str = "^n2\b^bX\u0017K\u0012hM\fG@-P\f\b_dL\rA\\j\u001f\u001aIFl]\u001f[W";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 754;
                    str = "kK\rw@h^\u001aQ";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 755;
                    str = "kK\rw@h^\u001aQ";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 756;
                    str = "kK\rw@h^\u001aQ";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 757;
                    str = "^n2\b^bX\u0017K\u0012hM\fG@-P\f\b_dL\rA\\j\u001f\u001aIFl]\u001f[W";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 758;
                    str = "`L\u0019[FbM\u001b\u0007Wc[^\\@lQ\rIQyV\u0011F\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 759;
                    str = "`L\u0019[FbM\u001b\u0007GcL\u001bFF\u007fZ\u001fL@h\\\u001bAByL\u0018G@gV\u001a\u0007\\b\u001f\u001d@Sy\u001f\u0018G@-";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 760;
                    str = "-C^\\[`Z^[BhQ\n\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 761;
                    str = "`L\u0019[FbM\u001b\u0007GcL\u001bFF\u007fZ\u001fL@h\\\u001bAByL\u0018G@gV\u001a\u0007{aS\u001bOSal\nIFhz\u0006KW}K\u0017G\\-";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 762;
                    str = "`L\u0019[FbM\u001b\u0007GcL\u001bFF\u007fZ\u001fL@h\\\u001bAByL\u0018G@gV\u001a\b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 763;
                    str = "`L\u0019[FbM\u001b\u0007GcL\u001bFF\u007fZ\u001fL@h\\\u001bAByL\u0018G@gV\u001a";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 764;
                    str = "^z2mqY\u001f\u0015MKRY\fG_RR\u001b\u0004\u0012fZ\u0007w[i\u0013^[FlK\u000b[\u001e-Q\u001bMV~`\u000e]Ae\u0013^LSy^R\bFdR\u001b[FlR\u000e\u0004\u0012`Z\u001aASRJ\fD\u001e-R\u001bL[l`\u0013A_h`\nQBh\u0013^EWiV\u001fwEl`\nQBh\u0013^EWiV\u001fwAdE\u001b\u0004\u0012`Z\u001aASRQ\u001fEW!\u001f\u0013MVd^!KS}K\u0017G\\!\u001f\u0013MVd^!@S~WR\b_h[\u0017ImiJ\fIFdP\u0010\u0004\u0012bM\u0017O[c\u0013^DSyV\n]Vh\u0013^D]cX\u0017\\GiZR\bFeJ\u0013JmdR\u001fOW!\u001f\fM_bK\u001bw@hL\u0011]@nZR\b@lH!LSy^R\b@h\\\u0017X[hQ\nwQbJ\u0010\\\u001e-O\u001fZFd\\\u0017XScK!@S~WR\bAy^\fZWi\u0013^w[i\u001f8z}@\u001f\u0013MA~^\u0019MA-h6m`H\u001f\u0015MKRM\u001bE]yZ!B[i\u0002A\bsC{^CWt`\u0018Z]``\u0013M\u000f=\u001f?fv-\u0000@\u0015md[^i|I\u001fA\u0014md[^i|I\u001f\u0013MVd^!_SRK\u0007XW,\u0002F\bsC{^\\[`Z\r\\S`O@\u0017\u0012Bm:m`-}'\bmd[^lw^|^d{@v*\b\u0006=\u0006H";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 765;
                    str = "Lq:\bmd[B\u0017\u0012";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 766;
                    str = "^z2mqY\u001f!AV-y,g\u007f-R\u001b[AlX\u001b[\u0012Zw;zw-T\u001bQm\u007fZ\u0013GFh`\u0014AV0\u0000^i|I\u001f\u0013MVd^!_SRK\u0007XW,\u0002F\b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 767;
                    str = "`L\u0019[FbM\u001b\u0007Ay^\f\\@hY^KSc\u0018\n\bUhK^^SaJ\u001b\bTbM^";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 768;
                    str = "`L\u0019[FbM\u001b\u0007Ay^\f\\@hYQKG\u007fL\u0011Z\u0012dL^FGaS";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 769;
                    str = "Bm:m`-}'\bmd[^lw^|^d{@v*\b";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 770;
                    str = "`L\u0019[FbM\u001b\u0007@hR\u0011^WJM\u0011]B]^\f\\[nV\u000eI\\yLQ";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    i = 771;
                    str = "`L\u0019[FbM\u001b\u0007VhS\u001b\\Wi]QZW~J\u0012\\\u001d";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case true:
                    strArr2[i] = str;
                    Y = strArr3;
                    Application z3 = App.z();
                    str = "`L\u0019[FbM\u001b\u0006Vo";
                    Object obj2 = -1;
                    while (true) {
                        str = z(z(str));
                        switch (obj2) {
                            case v.m /*0*/:
                                m = z3.getDatabasePath(str);
                                StringBuilder stringBuilder = new StringBuilder();
                                str = "%Q\u001bMV~`\u000e]Ae\u001eC";
                                z2 = true;
                                while (true) {
                                    StringBuilder stringBuilder2;
                                    String str2;
                                    str = z(z(str));
                                    switch (z2) {
                                        case v.m /*0*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "oM\u0011IVn^\r\\";
                                            z2 = true;
                                            continue;
                                        case at.g /*1*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "*\u0016";
                                            z2 = true;
                                            continue;
                                        case at.i /*2*/:
                                            Q = stringBuilder.append(str).toString();
                                            stringBuilder = new StringBuilder();
                                            str = "^z2mqY\u001f\u0015MKRM\u001bE]yZ!B[i\u001f8z}@\u001f\u0013MA~^\u0019MA-h6m`H\u001f\u0015MKRY\fG_RR\u001b\u0015\u0003-~0l\u0012~K\u001f\\G~\u0002A\bsC{^\\[`Z\r\\S`O@\u0017\u0012Lq:\b";
                                            z2 = true;
                                            continue;
                                        case at.o /*3*/:
                                            stringBuilder = stringBuilder.append(str).append(Q);
                                            str = "-p,lw_\u001f<q\u0012yV\u0013MAy^\u0013X\u0012Ll=";
                                            z2 = true;
                                            continue;
                                        case at.p /*4*/:
                                            d = stringBuilder.append(str).toString();
                                            stringBuilder = new StringBuilder();
                                            str = "^z2mqY\u001f\u0015MKRY\fG_RR\u001b\u0004\u0012fZ\u0007w[i\u0013^[FlK\u000b[\u001e-Q\u001bMV~`\u000e]Ae\u0013^LSy^R\bFdR\u001b[FlR\u000e\u0004\u0012`Z\u001aASRJ\fD\u001e-R\u001bL[l`\u0013A_h`\nQBh\u0013^EWiV\u001fwEl`\nQBh\u0013^EWiV\u001fwAdE\u001b\u0004\u0012`Z\u001aASRQ\u001fEW!\u001f\u0013MVd^!KS}K\u0017G\\!\u001f\u0013MVd^!@S~WR\b_h[\u0017ImiJ\fIFdP\u0010\u0004\u0012bM\u0017O[c\u0013^DSyV\n]Vh\u0013^D]cX\u0017\\GiZR\bFeJ\u0013JmdR\u001fOW!\u001f\fM_bK\u001bw@hL\u0011]@nZR\b@lH!LSy^R\b@h\\\u0017X[hQ\nwQbJ\u0010\\\u001e-O\u001fZFd\\\u0017XScK!@S~WR\bAy^\fZWi\u0013^w[i\u0013^CWt`\fM_bK\u001bwXd[^n`Br^EW~L\u001fOW~\u001f)`w_z^CWt`\u0018Z]``\u0013M\u000f<\u001f?fv-L\nIFxLB\u0017\u0012Lq:\bFdR\u001b[FlR\u000e\u0016\r-~0l\u0012";
                                            z2 = true;
                                            continue;
                                        case at.m /*5*/:
                                            stringBuilder = stringBuilder.append(str).append(Q);
                                            str = "-p,lw_\u001f<q\u0012yV\u0013MAy^\u0013X\u0012Ll=";
                                            z2 = true;
                                            continue;
                                        case Y.f /*6*/:
                                            I = stringBuilder.append(str).toString();
                                            stringBuilder = new StringBuilder();
                                            str = "^z2mqY\u001f\u0015MKRY\fG_RR\u001b\u0004\u0012fZ\u0007w[i\u0013^[FlK\u000b[\u001e-Q\u001bMV~`\u000e]Ae\u0013^LSy^R\bFdR\u001b[FlR\u000e\u0004\u0012`Z\u001aASRJ\fD\u001e-R\u001bL[l`\u0013A_h`\nQBh\u0013^EWiV\u001fwEl`\nQBh\u0013^EWiV\u001fwAdE\u001b\u0004\u0012`Z\u001aASRQ\u001fEW!\u001f\u0013MVd^!KS}K\u0017G\\!\u001f\u0013MVd^!@S~WR\b_h[\u0017ImiJ\fIFdP\u0010\u0004\u0012bM\u0017O[c\u0013^DSyV\n]Vh\u0013^D]cX\u0017\\GiZR\bFeJ\u0013JmdR\u001fOW!\u001f\fM_bK\u001bw@hL\u0011]@nZR\b@lH!LSy^R\b@h\\\u0017X[hQ\nwQbJ\u0010\\\u001e-O\u001fZFd\\\u0017XScK!@S~WR\bAy^\fZWi\u0013^w[i\u0013^CWt`\fM_bK\u001bwXd[^n`Br^EW~L\u001fOW~\u001f)`w_z^CWt`\u0018Z]``\u0013M\u000f<\u001f?fv-T\u001bQm\u007fZ\u0013GFh`\u0014AV0\u0000^i|I\u001f\r\\SyJ\r\u0014\r-~0l\u0012yV\u0013MAy^\u0013X\f2\u001f?fv-K\u0017EW~K\u001fEB1\u0000^i|I\u001f";
                                            z2 = true;
                                            continue;
                                        case aF.v /*7*/:
                                            stringBuilder = stringBuilder.append(str).append(Q);
                                            str = "-p,lw_\u001f<q\u0012yV\u0013MAy^\u0013X\u0012Ll=";
                                            z2 = true;
                                            continue;
                                        case aF.u /*8*/:
                                            i = stringBuilder.append(str).toString();
                                            stringBuilder = new StringBuilder();
                                            str = "^z2mqY\u001f";
                                            z2 = true;
                                            continue;
                                        case Y.l /*9*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "`Z\r[SjZ\r";
                                            z2 = true;
                                            continue;
                                        case Y.t /*10*/:
                                            stringBuilder2 = stringBuilder;
                                            str2 = str;
                                            str = "fZ\u0007wT\u007fP\u0013w_h\u0013^CWt`\u0017L\u001e-L\nIFxLR\b\\hZ\u001a[m}J\r@\u001e-[\u001f\\S!\u001f\nA_hL\nI_}\u0013^EWiV\u001fwG\u007fSR\b_h[\u0017Im`V\u0013MmyF\u000eM\u001e-R\u001bL[l`\tImyF\u000eM\u001e-R\u001bL[l`\rAHh\u0013^EWiV\u001fw\\lR\u001b\u0004\u0012`Z\u001aASR\\\u001fXFdP\u0010\u0004\u0012`Z\u001aASRW\u001f[Z!\u001f\u0013MVd^!LG\u007f^\nA]c\u0013^G@dX\u0017F\u001e-S\u001f\\[yJ\u001aM\u001e-S\u0011FUdK\u000bLW!\u001f\n@G`]!A_lX\u001b\u0004\u0012\u007fZ\u0013GFh`\fMAbJ\fKW!\u001f\fIER[\u001f\\S!\u001f\fMQdO\u0017M\\y`\u001dGGcKR\bBlM\nAQdO\u001fFFRW\u001f[Z!\u001f\r\\S\u007fM\u001bL\u001e-`\u0017L";
                                            z2 = true;
                                            break;
                                        case Y.j /*11*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "`Z\r[SjZ\r";
                                            z2 = true;
                                            continue;
                                        case Y.p /*12*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "#T\u001bQm\u007fZ\u0013GFh`\u0014AV-~-\b_hL\rIUhL!CWt`\fM_bK\u001bwXd[";
                                            z2 = true;
                                            continue;
                                        case Y.q /*13*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "-y,g\u007f-";
                                            z2 = true;
                                            continue;
                                        case arj.Toolbar_titleMarginEnd /*14*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "`Z\r[SjZ\r";
                                            z2 = true;
                                            continue;
                                        case arj.Toolbar_titleMarginTop /*15*/:
                                            stringBuilder = stringBuilder.append(str).append(",");
                                            str = "nW\u001f\\maV\r\\";
                                            z2 = true;
                                            continue;
                                        case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "-h6m`H\u001f";
                                            z2 = true;
                                            continue;
                                        case arj.Toolbar_maxButtonHeight /*17*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "`Z\r[SjZ\r";
                                            z2 = true;
                                            continue;
                                        case arj.Toolbar_collapseIcon /*18*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "#T\u001bQm\u007fZ\u0013GFh`\u0014AV0";
                                            z2 = true;
                                            continue;
                                        case arj.Toolbar_collapseContentDescription /*19*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "nW\u001f\\maV\r\\";
                                            z2 = true;
                                            continue;
                                        case arj.Toolbar_navigationIcon /*20*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "#T\u001bQm\u007fZ\u0013GFh`\u0014AV";
                                            z2 = true;
                                            continue;
                                        case arj.Toolbar_navigationContentDescription /*21*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "-~0l\u0012";
                                            z2 = true;
                                            continue;
                                        case arj.Toolbar_logoDescription /*22*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "`Z\r[SjZ\r";
                                            z2 = true;
                                            continue;
                                        case arj.Toolbar_titleTextColor /*23*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "#T\u001bQmkM\u0011Em`ZC\u0018";
                                            z2 = true;
                                            continue;
                                        case arj.Toolbar_subtitleTextColor /*24*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "-~0l\u0012";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_actionMenuTextAppearance /*25*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "nW\u001f\\maV\r\\";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_actionMenuTextColor /*26*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "#S\u001f[FRM\u001bIVRR\u001b[AlX\u001bwFl]\u0012Mmd[@\u0015";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_actionModeStyle /*27*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "`Z\r[SjZ\r";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_actionModeCloseButtonStyle /*28*/:
                                            stringBuilder = stringBuilder.append(str).append(".");
                                            str = "RV\u001a";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_actionModeBackground /*29*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "-~0l\u0012";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_actionModeSplitBackground /*30*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "nW\u001f\\maV\r\\";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_actionModeCloseDrawable /*31*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "#S\u001f[FRM\u001bIVRM\u001bKWdO\nwAhQ\nw_hL\rIUh`\nIPaZ!AV1";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_actionModeCutDrawable /*32*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "`Z\r[SjZ\r";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_actionModeCopyDrawable /*33*/:
                                            stringBuilder = stringBuilder.append(str).append(".");
                                            str = "RV\u001a";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_actionModePasteDrawable /*34*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "-~0l\u0012";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_actionModeSelectAllDrawable /*35*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "nW\u001f\\maV\r\\";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_actionModeShareDrawable /*36*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "#S\u001f[FRM\u001bIVRM\u001bKWdO\nwAhQ\nw_hL\rIUh`\nIPaZ!AV3\u000f";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_actionModeFindDrawable /*37*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "-~0l\u0012";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_actionModeWebSearchDrawable /*38*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "`Z\r[SjZ\r";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_actionModePopupWindowStyle /*39*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "#R\u001bL[l`\tImyF\u000eM\u00130";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                                            stringBuilder = stringBuilder.append(str).append(8);
                                            str = "-~0l\u0012";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "`Z\r[SjZ\r";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_dialogTheme /*42*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "#K\u0017EW~K\u001fEB3\u0000";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_dialogPreferredPadding /*43*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "-p,lw_\u001f<q\u0012";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_listDividerAlertDialog /*44*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "`Z\r[SjZ\r";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_actionDropDownStyle /*45*/:
                                            stringBuilder = stringBuilder.append(str).append(".");
                                            str = "RV\u001a";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "-{;{q-s7e{Y\u001fJ\u0018\u000b;";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_spinnerDropDownItemStyle /*47*/:
                                            g = stringBuilder.append(str).toString();
                                            stringBuilder = new StringBuilder();
                                            str = "^z2mqY\u001f\u0015MKRV\u001a\u0004\u0012fZ\u0007wT\u007fP\u0013w_h\u0013^ZWnZ\u0017XFRL\u001bZDhM!\\[`Z\r\\S`OR\b@h\\\u001bABy`\u001aMDd\\\u001bwFdR\u001b[FlR\u000e\u0004\u0012\u007fZ\u001fLmiZ\bAQh`\nA_hL\nI_}\u0013^X^lF\u001bLmiZ\bAQh`\nA_hL\nI_}\u0013^[FlK\u000b[\u0012Km1e\u0012`Z\r[SjZ\r\beEz,m\u0012fZ\u0007w@hR\u0011\\WRU\u0017L\u000f2\u001f?fv-\u0017\u0015MKRY\fG_RR\u001b\u0015\u0003-p,\b\u001a`Z\u001aASRH\u001fwFtO\u001b\u0015";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_homeAsUpIndicator /*48*/:
                                            stringBuilder = stringBuilder.append(str).append(Integer.toString(2));
                                            str = "-~0l\u0012bM\u0017O[c\u0002";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_actionButtonStyle /*49*/:
                                            stringBuilder = stringBuilder.append(str).append(Integer.toString(1));
                                            str = "$\u0016^";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_buttonBarStyle /*50*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "Lq:\bmd[@\u0017\u0012";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_buttonBarButtonStyle /*51*/:
                                            V = stringBuilder.append(str).toString();
                                            stringBuilder = new StringBuilder();
                                            str = "^z2mqY\u001f";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_selectableItemBackground /*52*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "`Z\r[SjZ\r";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                                            stringBuilder2 = stringBuilder;
                                            str2 = str;
                                            str = "fZ\u0007wT\u007fP\u0013w_h\u0013^CWt`\u0017L\u001e-L\nIFxLR\b\\hZ\u001a[m}J\r@\u001e-[\u001f\\S!\u001f\nA_hL\nI_}\u0013^EWiV\u001fwG\u007fSR\b_h[\u0017Im`V\u0013MmyF\u000eM\u001e-R\u001bL[l`\tImyF\u000eM\u001e-R\u001bL[l`\rAHh\u0013^EWiV\u001fw\\lR\u001b\u0004\u0012`Z\u001aASR\\\u001fXFdP\u0010\u0004\u0012`Z\u001aASRW\u001f[Z!\u001f\u0013MVd^!LG\u007f^\nA]c\u0013^G@dX\u0017F\u001e-S\u001f\\[yJ\u001aM\u001e-S\u0011FUdK\u000bLW!\u001f\n@G`]!A_lX\u001b\u0004\u0012\u007fZ\u0013GFh`\fMAbJ\fKW!\u001f\fIER[\u001f\\S!\u001f\fMQdO\u0017M\\y`\u001dGGcKR\bBlM\nAQdO\u001fFFRW\u001f[Z!\u001f\r\\S\u007fM\u001bL\u001e-`\u0017L";
                                            z2 = false;
                                            break;
                                        case arj.Theme_borderlessButtonStyle /*54*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "`Z\r[SjZ\r";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_dividerVertical /*55*/:
                                            stringBuilder = stringBuilder.append(str).append(",");
                                            str = "nW\u001f\\maV\r\\";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_dividerHorizontal /*56*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "-h6m`H\u001f";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_activityChooserViewStyle /*57*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "`Z\r[SjZ\r";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_toolbarStyle /*58*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "#T\u001bQm\u007fZ\u0013GFh`\u0014AV0";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "nW\u001f\\maV\r\\";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_popupMenuStyle /*60*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "#T\u001bQm\u007fZ\u0013GFh`\u0014AV";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_popupWindowStyle /*61*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "-~0l\u0012`Z\r[SjZ!\\SoS\u001bw[i\u0002";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_editTextColor /*62*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "`Z\r[SjZ\r";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_editTextBackground /*63*/:
                                            stringBuilder = stringBuilder.append(str).append(".");
                                            str = "RV\u001a";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_imageButtonStyle /*64*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "-~0l\u0012";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "nW\u001f\\maV\r\\";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "#T\u001bQm\u007fZ\u0013GFh`\u0014AV0\u0000";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_textColorSearchUrl /*67*/:
                                            B = stringBuilder.append(str).toString();
                                            stringBuilder = new StringBuilder();
                                            str = "^z2mqY\u001f";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_searchViewStyle /*68*/:
                                            stringBuilder2 = stringBuilder.append(str);
                                            str2 = "c";
                                            str = "fZ\u0007wT\u007fP\u0013w_h\u0013^CWt`\u0017L\u001e-L\nIFxLR\b\\hZ\u001a[m}J\r@\u001e-[\u001f\\S!\u001f\nA_hL\nI_}\u0013^EWiV\u001fwG\u007fSR\b_h[\u0017Im`V\u0013MmyF\u000eM\u001e-R\u001bL[l`\tImyF\u000eM\u001e-R\u001bL[l`\rAHh\u0013^EWiV\u001fw\\lR\u001b\u0004\u0012`Z\u001aASR\\\u001fXFdP\u0010\u0004\u0012`Z\u001aASRW\u001f[Z!\u001f\u0013MVd^!LG\u007f^\nA]c\u0013^G@dX\u0017F\u001e-S\u001f\\[yJ\u001aM\u001e-S\u0011FUdK\u000bLW!\u001f\n@G`]!A_lX\u001b\u0004\u0012\u007fZ\u0013GFh`\fMAbJ\fKW!\u001f\fIER[\u001f\\S!\u001f\fMQdO\u0017M\\y`\u001dGGcKR\bBlM\nAQdO\u001fFFRW\u001f[Z!\u001f\r\\S\u007fM\u001bL\u001e-`\u0017L";
                                            z2 = true;
                                            break;
                                        case arj.Theme_listPreferredItemHeight /*69*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "-h6m`H\u001f\u0015MKRM\u001bE]yZ!B[i\u0002A\bsC{^CWt`\u0018Z]``\u0013M\u000f=\u001f?fv-K\u0017EW~K\u001fEB3\u0000^i|I\u001f\u0013MVd^!_SRK\u0007XW0";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_listPreferredItemHeightSmall /*70*/:
                                            stringBuilder = stringBuilder.append(str).append(5);
                                            str = "-x,gg]\u001f<q\u0012\u007fZ\u0013GFh`\fMAbJ\fKW-\u0016^J\u0012Bq^K\u001c\u007fZ\u0013GFh`\fMAbJ\fKW0]PZW`P\nMm\u007fZ\rGG\u007f\\\u001b\bsC{^K\u001cRV\u001a\u0015P#R\u001fP[i\u001f1zvHm^jk-`\u0017L\u0012Iz-k";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_listPreferredItemHeightLarge /*71*/:
                                            k = stringBuilder.append(str).toString();
                                            stringBuilder = new StringBuilder();
                                            str = "^z2mqY\u001f\u0015MKRM\u001bE]yZ!B[i\u0013^ZWnZ\u0017XFR[\u001b^[nZ!\\[`Z\r\\S`OR\b@h^\u001awVhI\u0017KWRK\u0017EW~K\u001fEB!\u001f\u000eDStZ\u001awVhI\u0017KWRK\u0017EW~K\u001fEB-y,g\u007f-R\u001b[AlX\u001b[\u0012Zw;zw-T\u001bQmd[C\u0017\u0012Lq:\bYhF!N@bR!EW0\u000e^i|I\u001f\u0010MWiL!XG~WC";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_listPreferredItemPaddingLeft /*72*/:
                                            stringBuilder = stringBuilder.append(str).append(Integer.toString(2));
                                            str = "-~0l\u0012Cp*\b\u001afZ\u0007w@hR\u0011\\WRU\u0017L\u0012Av5m\u0012*\u001a>";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_listPreferredItemPaddingRight /*73*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "oM\u0011IVn^\r\\";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_dropDownListViewStyle /*74*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "*\u0016";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_listPopupWindowStyle /*75*/:
                                            stringBuilder = stringBuilder.append(str);
                                            str = "-~0l\u0012%M\u001bKWdO\nwVhI\u0017KWRK\u0017EW~K\u001fEB3\u000f^g`-M\u001bIVR[\u001b^[nZ!\\[`Z\r\\S`O@\u0018\u0012Bm^X^lF\u001bLmiZ\bAQh`\nA_hL\nI_}\u0001N\u0001";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_textAppearanceListItem /*76*/:
                                            E = stringBuilder.append(str).toString();
                                            stringBuilder = new StringBuilder();
                                            str = "Xo:ifH\u001f\u0013MA~^\u0019MA-l;|\u0012~K\u001f\\G~\u0002A\u0004\u0012cZ\u001bLARO\u000b[Z0\u0000R\bVlK\u001f\u0015\r!\u001f\fIER[\u001f\\S0\u0000R\bFdR\u001b[FlR\u000e\u0015\r!\u001f\u0013MVd^!]@a\u0002A\u0004\u0012`Z\u001aASRR\u0017EWRK\u0007XW0\u0000R\b_h[\u0017Imz^!\\K}ZC\u0017\u001e-R\u001bL[l`\rAHh\u0002A\u0004\u0012`Z\u001aASRQ\u001fEW0\u0000R\b_h[\u0017Imn^\u000e\\[bQC\u0017\u001e-R\u001bL[l`\u0016IAe\u0002A\u0004\u0012`Z\u001aASR[\u000bZSyV\u0011F\u000f2\u0013^G@dX\u0017F\u000f2\u0013^DSyV\n]Vh\u0002A\u0004\u0012aP\u0010O[yJ\u001aM\u000f2\u0013^\\ZxR\u001cw[`^\u0019M\u000f2\u001f)`w_z^FWh[\rwBxL\u0016\u0015";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_textAppearanceListItemSmall /*77*/:
                                            stringBuilder = stringBuilder.append(str).append(Integer.toString(2));
                                            str = "-~0l\u0012fZ\u0007wT\u007fP\u0013w_h\u0002O\bsC{^CWt`\u0017L\u000f2";
                                            z2 = true;
                                            continue;
                                        case arj.Theme_panelBackground /*78*/:
                                            r = stringBuilder.append(str).toString();
                                            if (VERSION.SDK_INT < 8) {
                                                z = false;
                                            }
                                            M = z;
                                            String str3 = "QO\u0005e\\p\u0014";
                                            while (true) {
                                                str3 = z(z(str3));
                                                switch (obj) {
                                                    case v.m /*0*/:
                                                        q = Pattern.compile(str3);
                                                        return;
                                                    default:
                                                        s = Pattern.compile(str3);
                                                        str3 = "Vc\u000eSs^|7aO+\u0019%vn}D?D\\xR\u0003uo";
                                                        obj = null;
                                                }
                                            }
                                        default:
                                            stringBuilder = stringBuilder.append(str).append(Integer.toString(2));
                                            str = "-p,\bYhF!ZW`P\nMmgV\u001a\b~Dt;\b\u0015(";
                                            z2 = false;
                                            continue;
                                    }
                                    str = z(z(str));
                                    switch (z2) {
                                        case v.m /*0*/:
                                            stringBuilder = stringBuilder2.append(f(str2, str));
                                            str = "-y,g\u007f-";
                                            z2 = true;
                                            break;
                                        case at.g /*1*/:
                                            stringBuilder = stringBuilder2.append(f(str2, str));
                                            str = "-y,g\u007f-R\u001b[AlX\u001b[\u0012n\u001f7f|Hm^b}Dq^\u0000\u0012^z2mqY\u001f\fM_bK\u001bw@hL\u0011]@nZRESu\u0017!AV$\u001f?{\u0012`^\u0006AV-y,g\u007f-R\u001b[AlX\u001b[\u0012";
                                            z2 = true;
                                            break;
                                        default:
                                            stringBuilder = stringBuilder2.append(f(str2, str));
                                            str = "!\u001f";
                                            z2 = true;
                                            break;
                                    }
                                }
                            default:
                                try {
                                    X = z3.getDatabasePath(str);
                                    z3 = App.z();
                                    str = "`L\u0019[FbM\u001b\u0006Vo\u0012\u001cIQfJ\u000e";
                                    obj2 = null;
                                } catch (IllegalStateException e) {
                                    throw e;
                                }
                        }
                        throw e;
                    }
                default:
                    strArr2[i] = str;
                    str = "nW\u001f\\maV\r\\";
                    i = 1;
                    strArr2 = strArr3;
                    z2 = false;
                    break;
            }
        }
    }

    public void a(List list) {
        boolean z = l5.s;
        for (String obtain : list) {
            Message.obtain(this.b, 13, obtain).sendToTarget();
            if (z) {
                return;
            }
        }
    }

    public nj a(String str, co coVar, boolean z, String str2, int i, nt ntVar) {
        try {
            long b;
            if (M) {
                if (I()) {
                    b = b(str, coVar, z, str2);
                    if (b > 0) {
                        return null;
                    }
                    return a(str, b, i, ntVar);
                }
            }
            b = a(str, coVar, z, str2);
            if (b > 0) {
                return a(str, b, i, ntVar);
            }
            return null;
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    static int a(ael com_whatsapp_ael, co coVar, boolean z, boolean z2) {
        return com_whatsapp_ael.a(coVar, z, z2);
    }

    @NonNull
    private ArrayList b(long j) {
        boolean z = l5.s;
        Iterator it = this.z.entrySet().iterator();
        while (it.hasNext()) {
            try {
                if (((co) ((Entry) it.next()).getValue()).b + 86400000 < j) {
                    it.remove();
                    continue;
                }
                if (z) {
                    break;
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        Log.i(Y[261] + this.z.size());
        Object arrayList = new ArrayList(this.z.size());
        for (co add : this.z.values()) {
            arrayList.add(add);
            if (z) {
                break;
            }
        }
        Collections.sort(arrayList, new ao(this));
        return arrayList;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList a(long r8, int r10) {
        /*
        r7 = this;
        r0 = com.whatsapp.l5.s;
        r1 = new java.util.ArrayList;
        r1.<init>();
        r2 = r7.a;
        monitor-enter(r2);
        r4 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x006c }
        r4 = r4 - r8;
        r3 = 2;
        r3 = new java.lang.String[r3];	 Catch:{ all -> 0x006c }
        r6 = 0;
        r4 = java.lang.Long.toString(r4);	 Catch:{ all -> 0x006c }
        r3[r6] = r4;	 Catch:{ all -> 0x006c }
        r4 = 1;
        r5 = java.lang.Integer.toString(r10);	 Catch:{ all -> 0x006c }
        r3[r4] = r5;	 Catch:{ all -> 0x006c }
        r4 = r7.a;	 Catch:{ all -> 0x006c }
        r4 = r4.getReadableDatabase();	 Catch:{ all -> 0x006c }
        r5 = Y;	 Catch:{ all -> 0x006c }
        r6 = 462; // 0x1ce float:6.47E-43 double:2.283E-321;
        r5 = r5[r6];	 Catch:{ all -> 0x006c }
        r3 = r4.rawQuery(r5, r3);	 Catch:{ all -> 0x006c }
        if (r3 == 0) goto L_0x005a;
    L_0x0032:
        r4 = Y;	 Catch:{ all -> 0x006c }
        r5 = 461; // 0x1cd float:6.46E-43 double:2.28E-321;
        r4 = r4[r5];	 Catch:{ all -> 0x006c }
        r4 = r3.getColumnIndex(r4);	 Catch:{ all -> 0x006c }
    L_0x003c:
        r5 = r3.moveToNext();	 Catch:{ all -> 0x0067 }
        if (r5 == 0) goto L_0x0055;
    L_0x0042:
        r5 = com.whatsapp.App.as;	 Catch:{ all -> 0x0067 }
        r6 = r3.getString(r4);	 Catch:{ all -> 0x0067 }
        r5 = r5.f(r6);	 Catch:{ all -> 0x0067 }
        if (r5 == 0) goto L_0x0053;
    L_0x004e:
        r5 = r5.p;	 Catch:{ IllegalStateException -> 0x0065 }
        r1.add(r5);	 Catch:{ IllegalStateException -> 0x0065 }
    L_0x0053:
        if (r0 == 0) goto L_0x003c;
    L_0x0055:
        r3.close();	 Catch:{ all -> 0x006c }
        if (r0 == 0) goto L_0x0063;
    L_0x005a:
        r0 = Y;	 Catch:{ IllegalStateException -> 0x006f }
        r3 = 460; // 0x1cc float:6.45E-43 double:2.273E-321;
        r0 = r0[r3];	 Catch:{ IllegalStateException -> 0x006f }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IllegalStateException -> 0x006f }
    L_0x0063:
        monitor-exit(r2);	 Catch:{ all -> 0x006c }
        return r1;
    L_0x0065:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0067 }
    L_0x0067:
        r0 = move-exception;
        r3.close();	 Catch:{ all -> 0x006c }
        throw r0;	 Catch:{ all -> 0x006c }
    L_0x006c:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x006c }
        throw r0;
    L_0x006f:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x006c }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.a(long, int):java.util.ArrayList");
    }

    public boolean t(String str) {
        return this.l.containsKey(str);
    }

    public int a(java.lang.String r9, com.whatsapp.a57 r10) {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:com.whatsapp.ael.a(java.lang.String, com.whatsapp.a57):int. bs: [B:39:0x0094, B:54:0x00c7]
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
        r8 = this;
        r0 = 0;
        r2 = com.whatsapp.l5.s;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = Y;
        r4 = 401; // 0x191 float:5.62E-43 double:1.98E-321;
        r3 = r3[r4];
        r1 = r1.append(r3);
        r1 = r1.append(r9);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r3 = new com.whatsapp.util.ab;
        r3.<init>();
        r1 = Y;
        r4 = 402; // 0x192 float:5.63E-43 double:1.986E-321;
        r1 = r1[r4];
        r3.b(r1);
        r4 = r8.a;
        monitor-enter(r4);
        r1 = r8.a;	 Catch:{ all -> 0x00cb }
        r1 = r1.getReadableDatabase();	 Catch:{ all -> 0x00cb }
        r5 = Y;	 Catch:{ all -> 0x00cb }
        r6 = 400; // 0x190 float:5.6E-43 double:1.976E-321;	 Catch:{ all -> 0x00cb }
        r5 = r5[r6];	 Catch:{ all -> 0x00cb }
        r6 = 1;	 Catch:{ all -> 0x00cb }
        r6 = new java.lang.String[r6];	 Catch:{ all -> 0x00cb }
        r7 = 0;	 Catch:{ all -> 0x00cb }
        r6[r7] = r9;	 Catch:{ all -> 0x00cb }
        r5 = r1.rawQuery(r5, r6);	 Catch:{ all -> 0x00cb }
        if (r5 == 0) goto L_0x0089;
    L_0x0046:
        r1 = r0;
        r0 = r5.moveToNext();	 Catch:{ SQLiteDiskIOException -> 0x00b6 }
        if (r0 == 0) goto L_0x00dc;
    L_0x004d:
        if (r10 == 0) goto L_0x0055;
    L_0x004f:
        r0 = r10.a();	 Catch:{ SQLiteDiskIOException -> 0x00ce }
        if (r0 != 0) goto L_0x00dc;
    L_0x0055:
        r6 = r8.a(r5, r9);	 Catch:{ SQLiteDiskIOException -> 0x00b8 }
        r0 = r6.Q;	 Catch:{ SQLiteDiskIOException -> 0x00b8 }
        if (r0 == 0) goto L_0x00da;	 Catch:{ SQLiteDiskIOException -> 0x00b8 }
    L_0x005d:
        r0 = r6.Q;	 Catch:{ SQLiteDiskIOException -> 0x00b8 }
        r0 = (com.whatsapp.MediaData) r0;	 Catch:{ SQLiteDiskIOException -> 0x00b8 }
        r6 = r6.k;	 Catch:{ SQLiteDiskIOException -> 0x00d0 }
        r6 = r6.a;	 Catch:{ SQLiteDiskIOException -> 0x00d0 }
        if (r6 != 0) goto L_0x006b;	 Catch:{ SQLiteDiskIOException -> 0x00d0 }
    L_0x0067:
        r6 = r0.transferred;	 Catch:{ SQLiteDiskIOException -> 0x00d0 }
        if (r6 == 0) goto L_0x00da;
    L_0x006b:
        r6 = r0.file;	 Catch:{ SQLiteDiskIOException -> 0x00d2 }
        if (r6 == 0) goto L_0x00da;
    L_0x006f:
        r0 = r0.file;	 Catch:{ SQLiteDiskIOException -> 0x00b8 }
        r0 = android.net.Uri.fromFile(r0);	 Catch:{ SQLiteDiskIOException -> 0x00b8 }
        r6 = new java.io.File;	 Catch:{ SQLiteDiskIOException -> 0x00b8 }
        r0 = r0.getPath();	 Catch:{ SQLiteDiskIOException -> 0x00b8 }
        r6.<init>(r0);	 Catch:{ SQLiteDiskIOException -> 0x00b8 }
        r0 = r6.exists();	 Catch:{ SQLiteDiskIOException -> 0x00d4 }
        if (r0 == 0) goto L_0x00da;
    L_0x0084:
        r1 = r1 + 1;
        r0 = r1;
    L_0x0087:
        if (r2 == 0) goto L_0x0046;
    L_0x0089:
        r1 = Y;	 Catch:{ SQLiteDiskIOException -> 0x00b8 }
        r2 = 399; // 0x18f float:5.59E-43 double:1.97E-321;	 Catch:{ SQLiteDiskIOException -> 0x00b8 }
        r1 = r1[r2];	 Catch:{ SQLiteDiskIOException -> 0x00b8 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ SQLiteDiskIOException -> 0x00b8 }
    L_0x0092:
        if (r5 == 0) goto L_0x0097;
    L_0x0094:
        r5.close();	 Catch:{ SQLiteDiskIOException -> 0x00d6 }
    L_0x0097:
        monitor-exit(r4);	 Catch:{ all -> 0x00cb }
        r3.b();
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = Y;
        r3 = 398; // 0x18e float:5.58E-43 double:1.966E-321;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r0);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        return r0;
    L_0x00b6:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x00b8 }
    L_0x00b8:
        r0 = move-exception;
        r1 = com.whatsapp.App.z();	 Catch:{ all -> 0x00c4 }
        r2 = 2131231111; // 0x7f080187 float:1.8078294E38 double:1.0529680753E-314;	 Catch:{ all -> 0x00c4 }
        com.whatsapp.util.p.a(r1, r2);	 Catch:{ all -> 0x00c4 }
        throw r0;	 Catch:{ all -> 0x00c4 }
    L_0x00c4:
        r0 = move-exception;
        if (r5 == 0) goto L_0x00ca;
    L_0x00c7:
        r5.close();	 Catch:{ SQLiteDiskIOException -> 0x00d8 }
    L_0x00ca:
        throw r0;	 Catch:{ all -> 0x00cb }
    L_0x00cb:
        r0 = move-exception;	 Catch:{ all -> 0x00cb }
        monitor-exit(r4);	 Catch:{ all -> 0x00cb }
        throw r0;
    L_0x00ce:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x00b8 }
    L_0x00d0:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x00d2 }
    L_0x00d2:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x00b8 }
    L_0x00d4:
        r0 = move-exception;	 Catch:{ SQLiteDiskIOException -> 0x00b8 }
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x00b8 }
    L_0x00d6:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00cb }
    L_0x00d8:
        r0 = move-exception;	 Catch:{ all -> 0x00cb }
        throw r0;	 Catch:{ all -> 0x00cb }
    L_0x00da:
        r0 = r1;
        goto L_0x0087;
    L_0x00dc:
        r0 = r1;
        goto L_0x0092;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.a(java.lang.String, com.whatsapp.a57):int");
    }

    public void a(String str, boolean z) {
        try {
            nf.a(k.CHAT_CLEAR);
            Log.i(Y[466] + str);
            Message.obtain(this.b, 13, str).sendToTarget();
            if (str != null && z) {
                com.whatsapp.protocol.bf bfVar = new com.whatsapp.protocol.bf(str, 1, 0);
                bfVar.c = false;
                App.a(bfVar, 0);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private boolean M(String str) {
        Throwable e;
        SQLiteDatabase sQLiteDatabase = null;
        ab abVar = new ab(Y[365]);
        d(str, false);
        Object[] objArr = new Object[]{str};
        synchronized (this.a) {
            try {
                sQLiteDatabase = this.a.getWritableDatabase();
                sQLiteDatabase.beginTransaction();
                sQLiteDatabase.execSQL(Y[372], objArr);
                sQLiteDatabase.execSQL(Y[363], objArr);
                ContentValues contentValues = new ContentValues(2);
                contentValues.put(Y[366], Integer.valueOf(1));
                contentValues.put(Y[371], Integer.valueOf(1));
                contentValues.put(Y[368], Integer.valueOf(1));
                int H = H();
                contentValues.put(Y[367], Integer.valueOf(H));
                if (sQLiteDatabase.update(Y[362], contentValues, Y[364], new String[]{str}) == 0) {
                    contentValues.put(Y[359], str);
                    if (sQLiteDatabase.insert(Y[373], null, contentValues) == -1) {
                        Log.e(Y[370] + str);
                    }
                }
                a5w com_whatsapp_a5w = (a5w) this.l.get(str);
                if (com_whatsapp_a5w == null) {
                    com_whatsapp_a5w = new a5w();
                    this.l.put(str, com_whatsapp_a5w);
                }
                a5w.c(com_whatsapp_a5w, 1);
                a5w.a(com_whatsapp_a5w, null);
                a5w.a(com_whatsapp_a5w, 1);
                a5w.d(com_whatsapp_a5w, 1);
                a5w.b(com_whatsapp_a5w, 1);
                a5w.e(com_whatsapp_a5w, 1);
                a5w.b(com_whatsapp_a5w, H);
                sQLiteDatabase.setTransactionSuccessful();
                if (sQLiteDatabase != null) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (SQLiteDatabaseCorruptException e2) {
                        throw e2;
                    } catch (SQLiteDatabaseCorruptException e22) {
                        throw e22;
                    }
                }
            } catch (SQLiteDatabaseCorruptException e222) {
                throw e222;
            } catch (RuntimeException e3) {
                e = e3;
                Log.a(e);
                throw e;
            } catch (Error e4) {
                e = e4;
                Log.a(e);
                throw e;
            } catch (Throwable e5) {
                try {
                    Log.a(e5);
                    r();
                    throw new AssertionError(e5);
                } catch (Throwable th) {
                    if (sQLiteDatabase != null) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (SQLiteDatabaseCorruptException e2222) {
                            throw e2222;
                        } catch (SQLiteDatabaseCorruptException e22222) {
                            throw e22222;
                        }
                    }
                }
            }
        }
        Log.i(Y[360] + str + Y[369] + true + Y[361] + abVar.b());
        return true;
    }

    public void a(String str, String str2, long j) {
        Log.i(Y[519] + str + Y[520] + j);
        e4 e4Var = new e4(null);
        e4Var.b = str;
        e4Var.a = str2;
        e4Var.c = Long.valueOf(j);
        Message.obtain(this.b, 10, 0, 0, e4Var).sendToTarget();
    }

    static void a(ael com_whatsapp_ael, sw swVar) {
        com_whatsapp_ael.a(swVar);
    }

    private co d(c3 c3Var) {
        co coVar = (co) this.p.get(c3Var);
        if (coVar != null) {
            return coVar;
        }
        co a = v.a(c3Var);
        if (a != null) {
            return a;
        }
        a5w com_whatsapp_a5w = (a5w) this.l.get(c3Var.c);
        if (com_whatsapp_a5w != null) {
            try {
                if (a5w.c(com_whatsapp_a5w) != null && c3Var.equals(a5w.c(com_whatsapp_a5w).k)) {
                    coVar = a5w.c(com_whatsapp_a5w);
                    return coVar != null ? (co) this.z.get(c3Var) : coVar;
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        coVar = a;
        if (coVar != null) {
        }
    }

    public void a(@android.support.annotation.NonNull java.lang.String r8, @android.support.annotation.NonNull java.util.Collection r9) {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:com.whatsapp.ael.a(java.lang.String, java.util.Collection):void. bs: [B:22:0x007d, B:33:0x008b]
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
        r7 = this;
        r1 = com.whatsapp.l5.s;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = Y;
        r3 = 390; // 0x186 float:5.47E-43 double:1.927E-321;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r0 = r0.append(r8);
        r2 = 47;
        r0 = r0.append(r2);
        r0 = r0.append(r9);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r2 = r7.a;
        monitor-enter(r2);
        r0 = r7.a;	 Catch:{ all -> 0x0095 }
        r3 = r0.getWritableDatabase();	 Catch:{ all -> 0x0095 }
        r0 = Y;	 Catch:{ all -> 0x0095 }
        r4 = 389; // 0x185 float:5.45E-43 double:1.92E-321;	 Catch:{ all -> 0x0095 }
        r0 = r0[r4];	 Catch:{ all -> 0x0095 }
        r4 = r3.compileStatement(r0);	 Catch:{ all -> 0x0095 }
        r0 = 1;	 Catch:{ all -> 0x0095 }
        r4.bindString(r0, r8);	 Catch:{ all -> 0x0095 }
        r3.beginTransaction();	 Catch:{ all -> 0x0095 }
        r5 = r9.iterator();	 Catch:{ all -> 0x008a }
    L_0x0044:
        r0 = r5.hasNext();	 Catch:{ all -> 0x008a }
        if (r0 == 0) goto L_0x0059;	 Catch:{ all -> 0x008a }
    L_0x004a:
        r0 = r5.next();	 Catch:{ all -> 0x008a }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x008a }
        r6 = 2;	 Catch:{ all -> 0x008a }
        r4.bindString(r6, r0);	 Catch:{ all -> 0x008a }
        r4.execute();	 Catch:{ all -> 0x008a }
        if (r1 == 0) goto L_0x0044;	 Catch:{ all -> 0x008a }
    L_0x0059:
        r3.setTransactionSuccessful();	 Catch:{ all -> 0x008a }
        r4 = com.whatsapp.qm.c(r8);	 Catch:{ all -> 0x008a }
        if (r4 == 0) goto L_0x007d;	 Catch:{ all -> 0x008a }
    L_0x0062:
        r5 = r9.iterator();	 Catch:{ all -> 0x008a }
    L_0x0066:
        r0 = r5.hasNext();	 Catch:{ all -> 0x008a }
        if (r0 == 0) goto L_0x007d;	 Catch:{ all -> 0x008a }
    L_0x006c:
        r0 = r5.next();	 Catch:{ all -> 0x008a }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x008a }
        r0 = r4.a(r0);	 Catch:{ all -> 0x008a }
        if (r0 == 0) goto L_0x007b;
    L_0x0078:
        r6 = 1;
        r0.a = r6;	 Catch:{ IllegalStateException -> 0x0088 }
    L_0x007b:
        if (r1 == 0) goto L_0x0066;
    L_0x007d:
        r0 = r3.inTransaction();	 Catch:{ IllegalStateException -> 0x0098 }
        if (r0 == 0) goto L_0x0086;	 Catch:{ IllegalStateException -> 0x0098 }
    L_0x0083:
        r3.endTransaction();	 Catch:{ IllegalStateException -> 0x0098 }
    L_0x0086:
        monitor-exit(r2);	 Catch:{ all -> 0x0095 }
        return;
    L_0x0088:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x008a }
    L_0x008a:
        r0 = move-exception;
        r1 = r3.inTransaction();	 Catch:{ IllegalStateException -> 0x009a }
        if (r1 == 0) goto L_0x0094;	 Catch:{ IllegalStateException -> 0x009a }
    L_0x0091:
        r3.endTransaction();	 Catch:{ IllegalStateException -> 0x009a }
    L_0x0094:
        throw r0;	 Catch:{ all -> 0x0095 }
    L_0x0095:
        r0 = move-exception;	 Catch:{ all -> 0x0095 }
        monitor-exit(r2);	 Catch:{ all -> 0x0095 }
        throw r0;
    L_0x0098:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0095 }
    L_0x009a:
        r0 = move-exception;	 Catch:{ all -> 0x0095 }
        throw r0;	 Catch:{ all -> 0x0095 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.a(java.lang.String, java.util.Collection):void");
    }

    public void P(String str) {
        a5w com_whatsapp_a5w = (a5w) this.l.get(str);
        if (com_whatsapp_a5w != null) {
            try {
                a5w.b(com_whatsapp_a5w, 1);
            } catch (IllegalStateException e) {
                throw e;
            }
        }
    }

    public void d(String str, String str2) {
        Log.i(Y[770] + str + " " + str2);
        this.b.post(new aum(this, str, str2));
    }

    private int a(int i) {
        boolean z = l5.s;
        SQLiteDatabase readableDatabase = this.a.getReadableDatabase();
        long b = b(Y[722], 0);
        Cursor rawQuery = readableDatabase.rawQuery(Y[717] + i, new String[]{String.valueOf(b)});
        int i2 = 0;
        if (rawQuery != null) {
            long j;
            long j2;
            readableDatabase.beginTransaction();
            int columnIndex = rawQuery.getColumnIndex(Y[721]);
            int columnIndex2 = rawQuery.getColumnIndex(Y[723]);
            int columnIndex3 = rawQuery.getColumnIndex(Y[720]);
            int columnIndex4 = rawQuery.getColumnIndex(Y[728]);
            int columnIndex5 = rawQuery.getColumnIndex(Y[725]);
            int i3 = 0;
            int i4 = 0;
            b = 0;
            while (rawQuery.moveToNext()) {
                String string;
                switch (rawQuery.getInt(columnIndex5)) {
                    case v.m /*0*/:
                        try {
                            string = rawQuery.getString(columnIndex3);
                            break;
                        } catch (IllegalStateException e) {
                            throw e;
                        } catch (Throwable th) {
                            try {
                                rawQuery.close();
                                if (readableDatabase.inTransaction()) {
                                    readableDatabase.endTransaction();
                                }
                            } catch (IllegalStateException e2) {
                                throw e2;
                            }
                        }
                    case at.g /*1*/:
                    case at.o /*3*/:
                        string = rawQuery.getString(columnIndex4);
                        break;
                    default:
                        string = null;
                        break;
                }
                b = rawQuery.getLong(columnIndex);
                String string2 = rawQuery.getString(columnIndex2);
                ArrayList g = ac.g(string);
                if (g != null) {
                    int i5 = 0;
                    while (i5 < g.size()) {
                        ContentValues contentValues = new ContentValues(3);
                        contentValues.put(Y[718], Long.valueOf(b));
                        contentValues.put(Y[727], string2);
                        contentValues.put(Y[724], Integer.toString(i5));
                        readableDatabase.insert(Y[726], null, contentValues);
                        i3++;
                        i5++;
                        if (z) {
                        }
                    }
                }
                i4++;
                if (z) {
                    j = b;
                    i2 = i4;
                    j2 = j;
                    if (j2 != 0) {
                        d(Y[719], j2);
                    }
                    readableDatabase.setTransactionSuccessful();
                    rawQuery.close();
                    if (readableDatabase.inTransaction()) {
                        readableDatabase.endTransaction();
                    }
                }
            }
            j = b;
            i2 = i4;
            j2 = j;
            if (j2 != 0) {
                d(Y[719], j2);
            }
            readableDatabase.setTransactionSuccessful();
            rawQuery.close();
            if (readableDatabase.inTransaction()) {
                readableDatabase.endTransaction();
            }
        }
        return i2;
    }

    public void r() {
        synchronized (this.a) {
            this.a.close();
            h();
            Log.i(Y[771] + a5f.b(this.a));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean c(com.whatsapp.protocol.co r13, int r14) {
        /*
        r12 = this;
        r0 = 0;
        r6 = 1;
        r4 = com.whatsapp.l5.s;
        r2 = java.lang.Boolean.valueOf(r0);
        r1 = 0;
        r5 = r12.a;
        monitor-enter(r5);
        r3 = r12.a;	 Catch:{ IOException -> 0x00bf }
        r1 = r3.getWritableDatabase();	 Catch:{ IOException -> 0x00bf }
        r12.O();	 Catch:{ SQLiteConstraintException -> 0x00b7 }
        r1.beginTransaction();	 Catch:{ SQLiteConstraintException -> 0x00b7 }
        r3 = r13.k;	 Catch:{ SQLiteConstraintException -> 0x00b7 }
        r3 = r3.a;	 Catch:{ SQLiteConstraintException -> 0x00b7 }
        if (r3 == 0) goto L_0x008f;
    L_0x001e:
        r3 = r13.x;	 Catch:{ SQLiteConstraintException -> 0x00b7 }
        if (r3 == 0) goto L_0x008f;
    L_0x0022:
        r3 = r13.k;	 Catch:{ SQLiteConstraintException -> 0x00b9 }
        r3 = r3.c;	 Catch:{ SQLiteConstraintException -> 0x00b9 }
        r3 = com.whatsapp.l5.g(r3);	 Catch:{ SQLiteConstraintException -> 0x00b9 }
        if (r3 == 0) goto L_0x008f;
    L_0x002c:
        r3 = 4;
        if (r14 == r3) goto L_0x0031;
    L_0x002f:
        if (r14 != r6) goto L_0x0088;
    L_0x0031:
        r3 = r13.t;	 Catch:{ IOException -> 0x00bf }
        r6 = ",";
        r6 = r3.split(r6);	 Catch:{ IOException -> 0x00bf }
        r7 = r6.length;	 Catch:{ IOException -> 0x00bf }
        r3 = r0;
    L_0x003c:
        if (r3 >= r7) goto L_0x0081;
    L_0x003e:
        r0 = r6[r3];	 Catch:{ IOException -> 0x00bf }
        r8 = new com.whatsapp.protocol.co;	 Catch:{ SQLiteConstraintException -> 0x00d6 }
        r8.<init>(r13);	 Catch:{ SQLiteConstraintException -> 0x00d6 }
        r9 = new com.whatsapp.protocol.c3;	 Catch:{ SQLiteConstraintException -> 0x00d0 }
        r10 = 1;
        r11 = r13.k;	 Catch:{ SQLiteConstraintException -> 0x00d0 }
        r11 = r11.b;	 Catch:{ SQLiteConstraintException -> 0x00d0 }
        r9.<init>(r0, r10, r11);	 Catch:{ SQLiteConstraintException -> 0x00d0 }
        r8.k = r9;	 Catch:{ SQLiteConstraintException -> 0x00d0 }
        r9 = r12.l;	 Catch:{ SQLiteConstraintException -> 0x00d0 }
        r9 = r9.get(r0);	 Catch:{ SQLiteConstraintException -> 0x00d0 }
        if (r9 != 0) goto L_0x006e;
    L_0x0059:
        r9 = com.whatsapp.App.aZ();	 Catch:{ SQLiteConstraintException -> 0x00d0 }
        if (r9 == 0) goto L_0x006e;
    L_0x005f:
        r9 = com.whatsapp.App.as;	 Catch:{ SQLiteConstraintException -> 0x00d2 }
        r9 = r9.j(r0);	 Catch:{ SQLiteConstraintException -> 0x00d2 }
        if (r9 == 0) goto L_0x006e;
    L_0x0067:
        r9 = com.whatsapp.qm.a(r0);	 Catch:{ SQLiteConstraintException -> 0x00d4 }
        r12.d(r9);	 Catch:{ SQLiteConstraintException -> 0x00d4 }
    L_0x006e:
        r10 = r12.d(r8);	 Catch:{ SQLiteConstraintException -> 0x00d6 }
        r9 = r12.l;	 Catch:{ SQLiteConstraintException -> 0x00f1 }
        r0 = r9.containsKey(r0);	 Catch:{ SQLiteConstraintException -> 0x00f1 }
        if (r0 == 0) goto L_0x007d;
    L_0x007a:
        r12.a(r1, r8, r10);	 Catch:{ SQLiteConstraintException -> 0x00f1 }
    L_0x007d:
        r0 = r3 + 1;
        if (r4 == 0) goto L_0x00ff;
    L_0x0081:
        r0 = r12.h;	 Catch:{ IOException -> 0x00bf }
        a(r13, r0);	 Catch:{ IOException -> 0x00bf }
        if (r4 == 0) goto L_0x0094;
    L_0x0088:
        r0 = r12.J;	 Catch:{ IOException -> 0x00bf }
        b(r13, r0);	 Catch:{ IOException -> 0x00bf }
        if (r4 == 0) goto L_0x0094;
    L_0x008f:
        r0 = r12.h;	 Catch:{ IOException -> 0x00bf }
        a(r13, r0);	 Catch:{ IOException -> 0x00bf }
    L_0x0094:
        r0.execute();	 Catch:{ IOException -> 0x00bf }
        r1.setTransactionSuccessful();	 Catch:{ IOException -> 0x00bf }
        r0 = r12.p;	 Catch:{ IOException -> 0x00bf }
        r3 = r13.k;	 Catch:{ IOException -> 0x00bf }
        r0.put(r3, r13);	 Catch:{ IOException -> 0x00bf }
        r0 = 1;
        r0 = java.lang.Boolean.valueOf(r0);	 Catch:{ IOException -> 0x00bf }
        if (r1 == 0) goto L_0x00b1;
    L_0x00a8:
        r2 = r1.inTransaction();	 Catch:{ SQLiteConstraintException -> 0x00f3 }
        if (r2 == 0) goto L_0x00b1;
    L_0x00ae:
        r1.endTransaction();	 Catch:{ SQLiteConstraintException -> 0x00f5 }
    L_0x00b1:
        monitor-exit(r5);	 Catch:{ all -> 0x00ee }
        r0 = r0.booleanValue();
        return r0;
    L_0x00b7:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteConstraintException -> 0x00b9 }
    L_0x00b9:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteConstraintException -> 0x00bb }
    L_0x00bb:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteConstraintException -> 0x00bd }
    L_0x00bd:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00bf }
    L_0x00bf:
        r0 = move-exception;
        com.whatsapp.util.Log.a(r0);	 Catch:{ all -> 0x00e1 }
        if (r1 == 0) goto L_0x00fd;
    L_0x00c5:
        r0 = r1.inTransaction();	 Catch:{ SQLiteConstraintException -> 0x00f7 }
        if (r0 == 0) goto L_0x00fd;
    L_0x00cb:
        r1.endTransaction();	 Catch:{ SQLiteConstraintException -> 0x00f7 }
        r0 = r2;
        goto L_0x00b1;
    L_0x00d0:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteConstraintException -> 0x00d2 }
    L_0x00d2:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteConstraintException -> 0x00d4 }
    L_0x00d4:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteConstraintException -> 0x00d6 }
    L_0x00d6:
        r0 = move-exception;
        r8 = Y;	 Catch:{ IOException -> 0x00bf }
        r9 = 306; // 0x132 float:4.29E-43 double:1.51E-321;
        r8 = r8[r9];	 Catch:{ IOException -> 0x00bf }
        com.whatsapp.util.Log.a(r8, r0);	 Catch:{ IOException -> 0x00bf }
        goto L_0x007d;
    L_0x00e1:
        r0 = move-exception;
        if (r1 == 0) goto L_0x00ed;
    L_0x00e4:
        r2 = r1.inTransaction();	 Catch:{ SQLiteConstraintException -> 0x00f9 }
        if (r2 == 0) goto L_0x00ed;
    L_0x00ea:
        r1.endTransaction();	 Catch:{ SQLiteConstraintException -> 0x00fb }
    L_0x00ed:
        throw r0;	 Catch:{ all -> 0x00ee }
    L_0x00ee:
        r0 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x00ee }
        throw r0;
    L_0x00f1:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteConstraintException -> 0x00d6 }
    L_0x00f3:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteConstraintException -> 0x00f5 }
    L_0x00f5:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00ee }
    L_0x00f7:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00ee }
    L_0x00f9:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteConstraintException -> 0x00fb }
    L_0x00fb:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00ee }
    L_0x00fd:
        r0 = r2;
        goto L_0x00b1;
    L_0x00ff:
        r3 = r0;
        goto L_0x003c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.c(com.whatsapp.protocol.co, int):boolean");
    }

    private void O() {
        try {
            if (!this.H) {
                synchronized (this.a) {
                    if (this.H) {
                        return;
                    }
                    Log.i(Y[649]);
                    this.w = this.a.getWritableDatabase().compileStatement(Y[660]);
                    this.C = this.a.getWritableDatabase().compileStatement(Y[658]);
                    this.K = this.a.getWritableDatabase().compileStatement(Y[651]);
                    this.W = this.a.getWritableDatabase().compileStatement(Y[652]);
                    this.x = this.a.getWritableDatabase().compileStatement(Y[653]);
                    this.F = this.a.getWritableDatabase().compileStatement(Y[661]);
                    this.h = this.a.getWritableDatabase().compileStatement(Y[657]);
                    this.J = this.a.getWritableDatabase().compileStatement(r);
                    this.c = this.a.getWritableDatabase().compileStatement(Y[655]);
                    this.y = this.a.getReadableDatabase().compileStatement(Y[654]);
                    this.e = this.a.getReadableDatabase().compileStatement(Y[650]);
                    this.S = this.a.getReadableDatabase().compileStatement(Y[659]);
                    this.A = this.a.getReadableDatabase().compileStatement(Y[656]);
                    this.H = true;
                }
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.database.sqlite.SQLiteDatabase r16, com.whatsapp.protocol.co r17, long r18) {
        /*
        r15 = this;
        r5 = com.whatsapp.l5.s;
        r0 = r17;
        r2 = r0.k;
        r7 = r2.c;
        r2 = r15.l;
        r2 = r2.get(r7);
        r2 = (com.whatsapp.a5w) r2;
        if (r2 != 0) goto L_0x0028;
    L_0x0012:
        r0 = r17;
        r3 = r0.d;	 Catch:{ IllegalStateException -> 0x0024 }
        r4 = 6;
        if (r3 != r4) goto L_0x0028;
    L_0x0019:
        r0 = r17;
        r8 = r0.z;	 Catch:{ IllegalStateException -> 0x0026 }
        r10 = 18;
        r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r3 != 0) goto L_0x0028;
    L_0x0023:
        return;
    L_0x0024:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0026 }
    L_0x0026:
        r2 = move-exception;
        throw r2;
    L_0x0028:
        r8 = new android.content.ContentValues;
        r3 = 2;
        r8.<init>(r3);
        r3 = Y;	 Catch:{ IllegalStateException -> 0x031d }
        r4 = 414; // 0x19e float:5.8E-43 double:2.045E-321;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x031d }
        r4 = java.lang.Long.valueOf(r18);	 Catch:{ IllegalStateException -> 0x031d }
        r8.put(r3, r4);	 Catch:{ IllegalStateException -> 0x031d }
        r0 = r17;
        r3 = r0.d;	 Catch:{ IllegalStateException -> 0x031d }
        r4 = 13;
        if (r3 != r4) goto L_0x0050;
    L_0x0043:
        r3 = Y;	 Catch:{ IllegalStateException -> 0x031d }
        r4 = 411; // 0x19b float:5.76E-43 double:2.03E-321;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x031d }
        r4 = java.lang.Long.valueOf(r18);	 Catch:{ IllegalStateException -> 0x031d }
        r8.put(r3, r4);	 Catch:{ IllegalStateException -> 0x031d }
    L_0x0050:
        if (r2 == 0) goto L_0x005c;
    L_0x0052:
        r10 = com.whatsapp.a5w.a(r2);	 Catch:{ IllegalStateException -> 0x031f }
        r12 = 0;
        r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r3 != 0) goto L_0x006d;
    L_0x005c:
        r3 = Y;	 Catch:{ IllegalStateException -> 0x031f }
        r4 = 421; // 0x1a5 float:5.9E-43 double:2.08E-321;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x031f }
        r10 = 1;
        r10 = r18 - r10;
        r4 = java.lang.Long.valueOf(r10);	 Catch:{ IllegalStateException -> 0x031f }
        r8.put(r3, r4);	 Catch:{ IllegalStateException -> 0x031f }
    L_0x006d:
        r0 = r17;
        r3 = r0.d;	 Catch:{ IllegalStateException -> 0x0321 }
        r4 = 6;
        if (r3 != r4) goto L_0x00bf;
    L_0x0074:
        r0 = r17;
        r10 = r0.z;	 Catch:{ IllegalStateException -> 0x0323 }
        r12 = 9;
        r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r3 == 0) goto L_0x0088;
    L_0x007e:
        r0 = r17;
        r10 = r0.z;	 Catch:{ IllegalStateException -> 0x0325 }
        r12 = 11;
        r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r3 != 0) goto L_0x00a8;
    L_0x0088:
        r3 = Y;	 Catch:{ IllegalStateException -> 0x0327 }
        r4 = 418; // 0x1a2 float:5.86E-43 double:2.065E-321;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x0327 }
        r4 = r17.c();	 Catch:{ IllegalStateException -> 0x0327 }
        r8.put(r3, r4);	 Catch:{ IllegalStateException -> 0x0327 }
        r3 = Y;	 Catch:{ IllegalStateException -> 0x0327 }
        r4 = 405; // 0x195 float:5.68E-43 double:2.0E-321;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x0327 }
        r0 = r17;
        r10 = r0.b;	 Catch:{ IllegalStateException -> 0x0327 }
        r4 = java.lang.Long.valueOf(r10);	 Catch:{ IllegalStateException -> 0x0327 }
        r8.put(r3, r4);	 Catch:{ IllegalStateException -> 0x0327 }
        if (r5 == 0) goto L_0x00bf;
    L_0x00a8:
        r0 = r17;
        r10 = r0.z;	 Catch:{ IllegalStateException -> 0x0329 }
        r12 = 1;
        r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r3 != 0) goto L_0x00bf;
    L_0x00b2:
        r3 = Y;	 Catch:{ IllegalStateException -> 0x0329 }
        r4 = 415; // 0x19f float:5.82E-43 double:2.05E-321;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x0329 }
        r4 = r17.c();	 Catch:{ IllegalStateException -> 0x0329 }
        r8.put(r3, r4);	 Catch:{ IllegalStateException -> 0x0329 }
    L_0x00bf:
        if (r2 == 0) goto L_0x00df;
    L_0x00c1:
        r3 = com.whatsapp.a5w.i(r2);	 Catch:{ IllegalStateException -> 0x032b }
        if (r3 == 0) goto L_0x00df;
    L_0x00c7:
        r3 = k(r17);	 Catch:{ IllegalStateException -> 0x032d }
        if (r3 == 0) goto L_0x00df;
    L_0x00cd:
        r3 = 0;
        com.whatsapp.a5w.a(r2, r3);	 Catch:{ IllegalStateException -> 0x032d }
        r3 = Y;	 Catch:{ IllegalStateException -> 0x032d }
        r4 = 417; // 0x1a1 float:5.84E-43 double:2.06E-321;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x032d }
        r4 = 0;
        r4 = java.lang.Boolean.valueOf(r4);	 Catch:{ IllegalStateException -> 0x032d }
        r8.put(r3, r4);	 Catch:{ IllegalStateException -> 0x032d }
    L_0x00df:
        r4 = 1;
        r0 = r17;
        r3 = r0.d;	 Catch:{ IllegalStateException -> 0x032f }
        r6 = 6;
        if (r3 != r6) goto L_0x0389;
    L_0x00e7:
        r0 = r17;
        r10 = r0.z;	 Catch:{ IllegalStateException -> 0x0331 }
        r12 = 11;
        r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r3 == 0) goto L_0x0389;
    L_0x00f1:
        r0 = r17;
        r10 = r0.z;	 Catch:{ IllegalStateException -> 0x0333 }
        r12 = 2;
        r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r3 == 0) goto L_0x0389;
    L_0x00fb:
        r0 = r17;
        r10 = r0.z;	 Catch:{ IllegalStateException -> 0x0335 }
        r12 = 3;
        r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r3 == 0) goto L_0x0389;
    L_0x0105:
        r0 = r17;
        r10 = r0.z;	 Catch:{ IllegalStateException -> 0x0337 }
        r12 = 9;
        r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r3 == 0) goto L_0x0389;
    L_0x010f:
        r0 = r17;
        r10 = r0.z;	 Catch:{ IllegalStateException -> 0x0339 }
        r12 = 1;
        r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r3 == 0) goto L_0x0389;
    L_0x0119:
        r0 = r17;
        r10 = r0.z;	 Catch:{ IllegalStateException -> 0x033b }
        r12 = 12;
        r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r3 == 0) goto L_0x012d;
    L_0x0123:
        r0 = r17;
        r10 = r0.z;	 Catch:{ IllegalStateException -> 0x033b }
        r12 = 14;
        r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r3 != 0) goto L_0x0386;
    L_0x012d:
        r0 = r17;
        r3 = r0.Q;
        r3 = (java.util.Vector) r3;
        r6 = com.whatsapp.App.as;
        r6 = r6.e();
        r6 = r6.p;
        r3 = r3.contains(r6);
        if (r3 != 0) goto L_0x0383;
    L_0x0141:
        r3 = 0;
    L_0x0142:
        if (r5 == 0) goto L_0x0380;
    L_0x0144:
        r0 = r17;
        r10 = r0.z;	 Catch:{ IllegalStateException -> 0x033d }
        r12 = 4;
        r4 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r4 == 0) goto L_0x0158;
    L_0x014e:
        r0 = r17;
        r10 = r0.z;	 Catch:{ IllegalStateException -> 0x033f }
        r12 = 7;
        r4 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r4 != 0) goto L_0x0167;
    L_0x0158:
        r4 = com.whatsapp.App.as;	 Catch:{ IllegalStateException -> 0x033f }
        r0 = r17;
        r6 = r0.t;	 Catch:{ IllegalStateException -> 0x033f }
        r4 = r4.d(r6);	 Catch:{ IllegalStateException -> 0x033f }
        if (r4 != 0) goto L_0x0380;
    L_0x0164:
        r3 = 0;
        if (r5 == 0) goto L_0x0380;
    L_0x0167:
        r3 = 0;
        if (r5 == 0) goto L_0x0380;
    L_0x016a:
        r4 = e(r17);	 Catch:{ IllegalStateException -> 0x0341 }
        if (r4 == 0) goto L_0x0380;
    L_0x0170:
        r3 = 0;
        r6 = r3;
    L_0x0172:
        if (r6 == 0) goto L_0x0185;
    L_0x0174:
        r3 = Y;	 Catch:{ IllegalStateException -> 0x0343 }
        r4 = 412; // 0x19c float:5.77E-43 double:2.036E-321;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x0343 }
        r0 = r17;
        r10 = r0.b;	 Catch:{ IllegalStateException -> 0x0343 }
        r4 = java.lang.Long.valueOf(r10);	 Catch:{ IllegalStateException -> 0x0343 }
        r8.put(r3, r4);	 Catch:{ IllegalStateException -> 0x0343 }
    L_0x0185:
        r0 = r17;
        r3 = r0.k;	 Catch:{ IllegalStateException -> 0x0345 }
        r3 = r3.a;	 Catch:{ IllegalStateException -> 0x0345 }
        if (r3 != 0) goto L_0x0204;
    L_0x018d:
        r3 = com.whatsapp.util.a6.b();	 Catch:{ IllegalStateException -> 0x0347 }
        if (r3 == 0) goto L_0x0204;
    L_0x0193:
        r0 = r17;
        r3 = r0.c;	 Catch:{ IllegalStateException -> 0x0349 }
        if (r3 != 0) goto L_0x0204;
    L_0x0199:
        r0 = r17;
        r3 = r0.k;	 Catch:{ IllegalStateException -> 0x034b }
        r3 = r3.c;	 Catch:{ IllegalStateException -> 0x034b }
        r3 = com.whatsapp.qm.i(r3);	 Catch:{ IllegalStateException -> 0x034b }
        if (r3 == 0) goto L_0x034d;
    L_0x01a5:
        r0 = r17;
        r3 = r0.t;	 Catch:{ IllegalStateException -> 0x034b }
        r4 = r3;
    L_0x01aa:
        r3 = r15.l;
        r3 = r3.get(r4);
        r3 = (com.whatsapp.a5w) r3;
        if (r3 == 0) goto L_0x0204;
    L_0x01b4:
        r9 = r17.c();	 Catch:{ IllegalStateException -> 0x0356 }
        r10 = com.whatsapp.util.a6.a(r9);	 Catch:{ IllegalStateException -> 0x0356 }
        r9 = com.whatsapp.a5w.a(r3, r10);	 Catch:{ IllegalStateException -> 0x0356 }
        if (r9 == 0) goto L_0x0204;
    L_0x01c2:
        if (r3 != r2) goto L_0x01d7;
    L_0x01c4:
        r9 = Y;	 Catch:{ IllegalStateException -> 0x0358 }
        r10 = 422; // 0x1a6 float:5.91E-43 double:2.085E-321;
        r9 = r9[r10];	 Catch:{ IllegalStateException -> 0x0358 }
        r10 = com.whatsapp.a5w.b(r3);	 Catch:{ IllegalStateException -> 0x0358 }
        r10 = java.lang.Double.valueOf(r10);	 Catch:{ IllegalStateException -> 0x0358 }
        r8.put(r9, r10);	 Catch:{ IllegalStateException -> 0x0358 }
        if (r5 == 0) goto L_0x0204;
    L_0x01d7:
        r9 = 1;
        r9 = new java.lang.String[r9];
        r10 = 0;
        r9[r10] = r4;
        r4 = new android.content.ContentValues;
        r4.<init>();
        r10 = Y;
        r11 = 420; // 0x1a4 float:5.89E-43 double:2.075E-321;
        r10 = r10[r11];
        r12 = com.whatsapp.a5w.b(r3);
        r3 = java.lang.Double.valueOf(r12);
        r4.put(r10, r3);
        r3 = Y;
        r10 = 419; // 0x1a3 float:5.87E-43 double:2.07E-321;
        r3 = r3[r10];
        r10 = Y;
        r11 = 423; // 0x1a7 float:5.93E-43 double:2.09E-321;
        r10 = r10[r11];
        r0 = r16;
        r0.update(r3, r4, r10, r9);
    L_0x0204:
        r0 = r17;
        r3 = r0.k;	 Catch:{ IllegalStateException -> 0x035a }
        r3 = r3.a;	 Catch:{ IllegalStateException -> 0x035a }
        if (r3 == 0) goto L_0x035e;
    L_0x020c:
        r0 = r17;
        r3 = r0.d;	 Catch:{ IllegalStateException -> 0x035c }
        r4 = 6;
        if (r3 == r4) goto L_0x035e;
    L_0x0213:
        r3 = 1;
    L_0x0214:
        if (r2 != 0) goto L_0x0228;
    L_0x0216:
        r4 = Y;	 Catch:{ IllegalStateException -> 0x0361 }
        r9 = 404; // 0x194 float:5.66E-43 double:1.996E-321;
        r9 = r4[r9];	 Catch:{ IllegalStateException -> 0x0361 }
        if (r3 == 0) goto L_0x0363;
    L_0x021e:
        r4 = 1;
    L_0x021f:
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ IllegalStateException -> 0x0366 }
        r8.put(r9, r4);	 Catch:{ IllegalStateException -> 0x0366 }
        if (r5 == 0) goto L_0x0249;
    L_0x0228:
        r4 = com.whatsapp.a5w.g(r2);	 Catch:{ IllegalStateException -> 0x0368 }
        r5 = -1;
        if (r4 == r5) goto L_0x0235;
    L_0x022f:
        r4 = com.whatsapp.a5w.g(r2);	 Catch:{ IllegalStateException -> 0x036a }
        if (r4 != 0) goto L_0x0249;
    L_0x0235:
        if (r3 == 0) goto L_0x0249;
    L_0x0237:
        r4 = 1;
        com.whatsapp.a5w.c(r2, r4);	 Catch:{ IllegalStateException -> 0x036c }
        r4 = Y;	 Catch:{ IllegalStateException -> 0x036c }
        r5 = 409; // 0x199 float:5.73E-43 double:2.02E-321;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x036c }
        r5 = 1;
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ IllegalStateException -> 0x036c }
        r8.put(r4, r5);	 Catch:{ IllegalStateException -> 0x036c }
    L_0x0249:
        r4 = 0;
        if (r2 != 0) goto L_0x0268;
    L_0x024c:
        r5 = com.whatsapp.App.as;	 Catch:{ IllegalStateException -> 0x036e }
        r5 = r5.j(r7);	 Catch:{ IllegalStateException -> 0x036e }
        if (r5 == 0) goto L_0x0268;
    L_0x0254:
        r4 = com.whatsapp.App.aZ();	 Catch:{ IllegalStateException -> 0x0370 }
        if (r4 == 0) goto L_0x0372;
    L_0x025a:
        r4 = 1;
    L_0x025b:
        r5 = Y;
        r9 = 410; // 0x19a float:5.75E-43 double:2.026E-321;
        r5 = r5[r9];
        r9 = java.lang.Integer.valueOf(r4);
        r8.put(r5, r9);
    L_0x0268:
        r5 = 1;
        r5 = new java.lang.String[r5];
        r9 = 0;
        r5[r9] = r7;
        r9 = Y;
        r10 = 416; // 0x1a0 float:5.83E-43 double:2.055E-321;
        r9 = r9[r10];
        r10 = Y;
        r11 = 403; // 0x193 float:5.65E-43 double:1.99E-321;
        r10 = r10[r11];
        r0 = r16;
        r5 = r0.update(r9, r8, r10, r5);
        if (r5 != 0) goto L_0x02b8;
    L_0x0282:
        r5 = Y;
        r9 = 413; // 0x19d float:5.79E-43 double:2.04E-321;
        r5 = r5[r9];
        r8.put(r5, r7);
        r5 = Y;
        r9 = 408; // 0x198 float:5.72E-43 double:2.016E-321;
        r5 = r5[r9];
        r9 = 0;
        r0 = r16;
        r8 = r0.insert(r5, r9, r8);
        r10 = -1;
        r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r5 != 0) goto L_0x02b8;
    L_0x029e:
        r5 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0375 }
        r5.<init>();	 Catch:{ IllegalStateException -> 0x0375 }
        r8 = Y;	 Catch:{ IllegalStateException -> 0x0375 }
        r9 = 406; // 0x196 float:5.69E-43 double:2.006E-321;
        r8 = r8[r9];	 Catch:{ IllegalStateException -> 0x0375 }
        r5 = r5.append(r8);	 Catch:{ IllegalStateException -> 0x0375 }
        r5 = r5.append(r7);	 Catch:{ IllegalStateException -> 0x0375 }
        r5 = r5.toString();	 Catch:{ IllegalStateException -> 0x0375 }
        com.whatsapp.util.Log.e(r5);	 Catch:{ IllegalStateException -> 0x0375 }
    L_0x02b8:
        if (r2 != 0) goto L_0x02e8;
    L_0x02ba:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r5 = Y;
        r8 = 407; // 0x197 float:5.7E-43 double:2.01E-321;
        r5 = r5[r8];
        r2 = r2.append(r5);
        r2 = r2.append(r7);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r5 = new com.whatsapp.a5w;
        r5.<init>();
        r2 = r15.l;	 Catch:{ IllegalStateException -> 0x0377 }
        r2.put(r7, r5);	 Catch:{ IllegalStateException -> 0x0377 }
        if (r3 == 0) goto L_0x0379;
    L_0x02e0:
        r2 = 1;
    L_0x02e1:
        com.whatsapp.a5w.c(r5, r2);
        com.whatsapp.a5w.a(r5, r4);
        r2 = r5;
    L_0x02e8:
        if (r6 == 0) goto L_0x02f1;
    L_0x02ea:
        r0 = r17;
        r4 = r0.b;	 Catch:{ IllegalStateException -> 0x037c }
        com.whatsapp.a5w.f(r2, r4);	 Catch:{ IllegalStateException -> 0x037c }
    L_0x02f1:
        r0 = r17;
        com.whatsapp.a5w.a(r2, r0);	 Catch:{ IllegalStateException -> 0x037e }
        r0 = r18;
        com.whatsapp.a5w.c(r2, r0);	 Catch:{ IllegalStateException -> 0x037e }
        r0 = r17;
        r3 = r0.d;	 Catch:{ IllegalStateException -> 0x037e }
        r4 = 13;
        if (r3 != r4) goto L_0x0308;
    L_0x0303:
        r0 = r18;
        com.whatsapp.a5w.a(r2, r0);	 Catch:{ IllegalStateException -> 0x037e }
    L_0x0308:
        r4 = com.whatsapp.a5w.a(r2);	 Catch:{ IllegalStateException -> 0x031b }
        r6 = 0;
        r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r3 != 0) goto L_0x0023;
    L_0x0312:
        r4 = 1;
        r4 = r18 - r4;
        com.whatsapp.a5w.d(r2, r4);	 Catch:{ IllegalStateException -> 0x031b }
        goto L_0x0023;
    L_0x031b:
        r2 = move-exception;
        throw r2;
    L_0x031d:
        r2 = move-exception;
        throw r2;
    L_0x031f:
        r2 = move-exception;
        throw r2;
    L_0x0321:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0323 }
    L_0x0323:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0325 }
    L_0x0325:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0327 }
    L_0x0327:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0329 }
    L_0x0329:
        r2 = move-exception;
        throw r2;
    L_0x032b:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x032d }
    L_0x032d:
        r2 = move-exception;
        throw r2;
    L_0x032f:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0331 }
    L_0x0331:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0333 }
    L_0x0333:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0335 }
    L_0x0335:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0337 }
    L_0x0337:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0339 }
    L_0x0339:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x033b }
    L_0x033b:
        r2 = move-exception;
        throw r2;
    L_0x033d:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x033f }
    L_0x033f:
        r2 = move-exception;
        throw r2;
    L_0x0341:
        r2 = move-exception;
        throw r2;
    L_0x0343:
        r2 = move-exception;
        throw r2;
    L_0x0345:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0347 }
    L_0x0347:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0349 }
    L_0x0349:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x034b }
    L_0x034b:
        r2 = move-exception;
        throw r2;
    L_0x034d:
        r0 = r17;
        r3 = r0.k;
        r3 = r3.c;
        r4 = r3;
        goto L_0x01aa;
    L_0x0356:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0358 }
    L_0x0358:
        r2 = move-exception;
        throw r2;
    L_0x035a:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x035c }
    L_0x035c:
        r2 = move-exception;
        throw r2;
    L_0x035e:
        r3 = 0;
        goto L_0x0214;
    L_0x0361:
        r2 = move-exception;
        throw r2;
    L_0x0363:
        r4 = -1;
        goto L_0x021f;
    L_0x0366:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0368 }
    L_0x0368:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x036a }
    L_0x036a:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x036c }
    L_0x036c:
        r2 = move-exception;
        throw r2;
    L_0x036e:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0370 }
    L_0x0370:
        r2 = move-exception;
        throw r2;
    L_0x0372:
        r4 = 2;
        goto L_0x025b;
    L_0x0375:
        r2 = move-exception;
        throw r2;
    L_0x0377:
        r2 = move-exception;
        throw r2;
    L_0x0379:
        r2 = -1;
        goto L_0x02e1;
    L_0x037c:
        r2 = move-exception;
        throw r2;
    L_0x037e:
        r2 = move-exception;
        throw r2;
    L_0x0380:
        r6 = r3;
        goto L_0x0172;
    L_0x0383:
        r3 = r4;
        goto L_0x0142;
    L_0x0386:
        r3 = r4;
        goto L_0x0144;
    L_0x0389:
        r3 = r4;
        goto L_0x016a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.a(android.database.sqlite.SQLiteDatabase, com.whatsapp.protocol.co, long):void");
    }

    private co r(String str) {
        co coVar = null;
        String[] strArr = new String[]{str};
        synchronized (this.a) {
            Cursor rawQuery = this.a.getReadableDatabase().rawQuery(B, strArr);
            if (rawQuery != null) {
                try {
                    if (rawQuery.moveToNext()) {
                        coVar = a(rawQuery, str);
                    } else {
                        Log.w(Y[709] + str);
                    }
                    rawQuery.close();
                } catch (Throwable th) {
                    rawQuery.close();
                }
            } else {
                Log.e(Y[708]);
            }
        }
        return coVar;
    }

    static boolean b(ael com_whatsapp_ael, String str) {
        return com_whatsapp_ael.l(str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(com.whatsapp.protocol.c3 r11, java.lang.String r12, int r13, long r14) {
        /*
        r10 = this;
        r8 = 1;
        r4 = -1;
        r0 = 0;
        r1 = r11.a;	 Catch:{ IllegalStateException -> 0x0031 }
        if (r1 != 0) goto L_0x0033;
    L_0x0007:
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0031 }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x0031 }
        r2 = Y;	 Catch:{ IllegalStateException -> 0x0031 }
        r3 = 36;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0031 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x0031 }
        r2 = r11.c;	 Catch:{ IllegalStateException -> 0x0031 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x0031 }
        r2 = " ";
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x0031 }
        r2 = r11.b;	 Catch:{ IllegalStateException -> 0x0031 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x0031 }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x0031 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ IllegalStateException -> 0x0031 }
    L_0x0030:
        return r0;
    L_0x0031:
        r0 = move-exception;
        throw r0;
    L_0x0033:
        r1 = r10.z;
        r1.remove(r11);
        r3 = r10.a(r11);
        if (r3 != 0) goto L_0x005b;
    L_0x003e:
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0059 }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x0059 }
        r2 = Y;	 Catch:{ IllegalStateException -> 0x0059 }
        r3 = 31;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0059 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x0059 }
        r1 = r1.append(r11);	 Catch:{ IllegalStateException -> 0x0059 }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x0059 }
        com.whatsapp.util.Log.w(r1);	 Catch:{ IllegalStateException -> 0x0059 }
        goto L_0x0030;
    L_0x0059:
        r0 = move-exception;
        throw r0;
    L_0x005b:
        r1 = r3.d;	 Catch:{ IllegalStateException -> 0x007b }
        r2 = 6;
        if (r1 != r2) goto L_0x007d;
    L_0x0060:
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x007b }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x007b }
        r2 = Y;	 Catch:{ IllegalStateException -> 0x007b }
        r3 = 32;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x007b }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x007b }
        r1 = r1.append(r11);	 Catch:{ IllegalStateException -> 0x007b }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x007b }
        com.whatsapp.util.Log.w(r1);	 Catch:{ IllegalStateException -> 0x007b }
        goto L_0x0030;
    L_0x007b:
        r0 = move-exception;
        throw r0;
    L_0x007d:
        r1 = r3.k;
        r1 = r1.c;
        r1 = com.whatsapp.l5.e(r1);
        if (r1 == 0) goto L_0x010d;
    L_0x0087:
        r1 = new com.whatsapp.protocol.c3;
        r2 = r3.k;
        r2 = r2.b;
        r1.<init>(r12, r8, r2);
        r1 = r10.a(r1);
        if (r1 != 0) goto L_0x00bf;
    L_0x0096:
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x00bd }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x00bd }
        r2 = Y;	 Catch:{ IllegalStateException -> 0x00bd }
        r3 = 35;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x00bd }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x00bd }
        r1 = r1.append(r11);	 Catch:{ IllegalStateException -> 0x00bd }
        r2 = " ";
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x00bd }
        r1 = r1.append(r12);	 Catch:{ IllegalStateException -> 0x00bd }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x00bd }
        com.whatsapp.util.Log.w(r1);	 Catch:{ IllegalStateException -> 0x00bd }
        goto L_0x0030;
    L_0x00bd:
        r0 = move-exception;
        throw r0;
    L_0x00bf:
        r2 = r1.d;	 Catch:{ IllegalStateException -> 0x0101 }
        r2 = com.whatsapp.protocol.b7.a(r2, r13);	 Catch:{ IllegalStateException -> 0x0101 }
        if (r2 < 0) goto L_0x0103;
    L_0x00c7:
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0101 }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x0101 }
        r2 = Y;	 Catch:{ IllegalStateException -> 0x0101 }
        r4 = 38;
        r2 = r2[r4];	 Catch:{ IllegalStateException -> 0x0101 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x0101 }
        r1 = r1.append(r11);	 Catch:{ IllegalStateException -> 0x0101 }
        r2 = Y;	 Catch:{ IllegalStateException -> 0x0101 }
        r4 = 33;
        r2 = r2[r4];	 Catch:{ IllegalStateException -> 0x0101 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x0101 }
        r2 = r3.d;	 Catch:{ IllegalStateException -> 0x0101 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x0101 }
        r2 = Y;	 Catch:{ IllegalStateException -> 0x0101 }
        r3 = 39;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0101 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x0101 }
        r1 = r1.append(r13);	 Catch:{ IllegalStateException -> 0x0101 }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x0101 }
        com.whatsapp.util.Log.w(r1);	 Catch:{ IllegalStateException -> 0x0101 }
        goto L_0x0030;
    L_0x0101:
        r0 = move-exception;
        throw r0;
    L_0x0103:
        r1.d = r13;	 Catch:{ IllegalStateException -> 0x015b }
        r2 = -1;
        r10.d(r1, r2);	 Catch:{ IllegalStateException -> 0x015b }
        r1 = com.whatsapp.l5.s;	 Catch:{ IllegalStateException -> 0x015b }
        if (r1 == 0) goto L_0x0164;
    L_0x010d:
        r1 = r3.k;	 Catch:{ IllegalStateException -> 0x015d }
        r1 = r1.c;	 Catch:{ IllegalStateException -> 0x015d }
        r1 = com.whatsapp.qm.i(r1);	 Catch:{ IllegalStateException -> 0x015d }
        if (r1 != 0) goto L_0x0164;
    L_0x0117:
        r1 = r3.d;	 Catch:{ IllegalStateException -> 0x0159 }
        r1 = com.whatsapp.protocol.b7.a(r1, r13);	 Catch:{ IllegalStateException -> 0x0159 }
        if (r1 < 0) goto L_0x015f;
    L_0x011f:
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0159 }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x0159 }
        r2 = Y;	 Catch:{ IllegalStateException -> 0x0159 }
        r4 = 40;
        r2 = r2[r4];	 Catch:{ IllegalStateException -> 0x0159 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x0159 }
        r1 = r1.append(r11);	 Catch:{ IllegalStateException -> 0x0159 }
        r2 = Y;	 Catch:{ IllegalStateException -> 0x0159 }
        r4 = 34;
        r2 = r2[r4];	 Catch:{ IllegalStateException -> 0x0159 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x0159 }
        r2 = r3.d;	 Catch:{ IllegalStateException -> 0x0159 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x0159 }
        r2 = Y;	 Catch:{ IllegalStateException -> 0x0159 }
        r3 = 37;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0159 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x0159 }
        r1 = r1.append(r13);	 Catch:{ IllegalStateException -> 0x0159 }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x0159 }
        com.whatsapp.util.Log.w(r1);	 Catch:{ IllegalStateException -> 0x0159 }
        goto L_0x0030;
    L_0x0159:
        r0 = move-exception;
        throw r0;
    L_0x015b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x015d }
    L_0x015d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0159 }
    L_0x015f:
        r3.d = r13;
        r10.d(r3, r4);
    L_0x0164:
        r0 = r10.b;
        r1 = new com.whatsapp.ax5;
        r2 = r10;
        r4 = r12;
        r5 = r13;
        r6 = r14;
        r1.<init>(r2, r3, r4, r5, r6);
        r0.post(r1);
        r0 = r8;
        goto L_0x0030;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.a(com.whatsapp.protocol.c3, java.lang.String, int, long):boolean");
    }

    private void a(String str, String str2) {
        Log.i(Y[700] + str + ":" + str2);
        SQLiteDatabase readableDatabase = this.a.getReadableDatabase();
        ContentValues contentValues = new ContentValues(2);
        contentValues.put(Y[699], str);
        contentValues.put(Y[697], str2);
        readableDatabase.replaceOrThrow(Y[698], null, contentValues);
        this.R.put(str, str2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void d(java.io.File r6) {
        /*
        r1 = com.whatsapp.l5.s;
        r2 = r6.listFiles();
        if (r2 == 0) goto L_0x0020;
    L_0x0008:
        r3 = r2.length;
        r0 = 0;
    L_0x000a:
        if (r0 >= r3) goto L_0x0020;
    L_0x000c:
        r4 = r2[r0];
        r5 = r4.isDirectory();	 Catch:{ IllegalStateException -> 0x0024 }
        if (r5 == 0) goto L_0x0019;
    L_0x0014:
        d(r4);	 Catch:{ IllegalStateException -> 0x0026 }
        if (r1 == 0) goto L_0x001c;
    L_0x0019:
        r4.delete();	 Catch:{ IllegalStateException -> 0x0026 }
    L_0x001c:
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x000a;
    L_0x0020:
        r6.delete();
        return;
    L_0x0024:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0026 }
    L_0x0026:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.d(java.io.File):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(com.whatsapp.protocol.co r9) {
        /*
        r8 = this;
        r6 = 9;
        r5 = 2;
        r3 = 1;
        r1 = com.whatsapp.l5.s;
        r4 = r8.a;
        monitor-enter(r4);
        r8.O();	 Catch:{ all -> 0x00a6 }
        r0 = r9.d;	 Catch:{ all -> 0x00a6 }
        if (r0 == r6) goto L_0x0026;
    L_0x0010:
        r0 = r9.d;	 Catch:{ IllegalStateException -> 0x0096 }
        r2 = 10;
        if (r0 == r2) goto L_0x0026;
    L_0x0016:
        r0 = r9.d;	 Catch:{ IllegalStateException -> 0x0096 }
        r2 = 11;
        if (r0 == r2) goto L_0x0026;
    L_0x001c:
        r0 = r9.d;	 Catch:{ IllegalStateException -> 0x0098 }
        r2 = 12;
        if (r0 == r2) goto L_0x0026;
    L_0x0022:
        r0 = r9.d;	 Catch:{ IllegalStateException -> 0x009a }
        if (r0 != 0) goto L_0x0094;
    L_0x0026:
        r0 = r9.k;	 Catch:{ IllegalStateException -> 0x009c }
        r0 = r0.a;	 Catch:{ IllegalStateException -> 0x009c }
        if (r0 != 0) goto L_0x006d;
    L_0x002c:
        r0 = r9.c;	 Catch:{ IllegalStateException -> 0x009e }
        if (r0 != r5) goto L_0x006d;
    L_0x0030:
        r0 = r9.r;	 Catch:{ IllegalStateException -> 0x00a0 }
        if (r0 != r3) goto L_0x006d;
    L_0x0034:
        r0 = r9.d;	 Catch:{ IllegalStateException -> 0x00a2 }
        if (r0 == r6) goto L_0x003e;
    L_0x0038:
        r0 = r9.d;	 Catch:{ IllegalStateException -> 0x00a4 }
        r2 = 10;
        if (r0 != r2) goto L_0x006d;
    L_0x003e:
        r0 = r8.F;	 Catch:{ all -> 0x00a6 }
        r2 = 1;
        r3 = r9.d;	 Catch:{ IllegalStateException -> 0x00a9 }
        r6 = (long) r3;	 Catch:{ IllegalStateException -> 0x00a9 }
        r0.bindLong(r2, r6);	 Catch:{ IllegalStateException -> 0x00a9 }
        r2 = 2;
        r6 = java.lang.System.currentTimeMillis();	 Catch:{ IllegalStateException -> 0x00a9 }
        r0.bindLong(r2, r6);	 Catch:{ IllegalStateException -> 0x00a9 }
        r2 = 3;
        r3 = r9.k;	 Catch:{ IllegalStateException -> 0x00a9 }
        r3 = r3.c;	 Catch:{ IllegalStateException -> 0x00a9 }
        r0.bindString(r2, r3);	 Catch:{ IllegalStateException -> 0x00a9 }
        r5 = 4;
        r2 = r9.k;	 Catch:{ IllegalStateException -> 0x00a9 }
        r2 = r2.a;	 Catch:{ IllegalStateException -> 0x00a9 }
        if (r2 == 0) goto L_0x00ab;
    L_0x005e:
        r2 = 1;
    L_0x0060:
        r0.bindLong(r5, r2);	 Catch:{ all -> 0x00a6 }
        r2 = 5;
        r3 = r9.k;	 Catch:{ all -> 0x00a6 }
        r3 = r3.b;	 Catch:{ all -> 0x00a6 }
        r0.bindString(r2, r3);	 Catch:{ all -> 0x00a6 }
        if (r1 == 0) goto L_0x00b3;
    L_0x006d:
        r0 = r8.x;	 Catch:{ all -> 0x00a6 }
        r2 = 1;
        r3 = r9.d;	 Catch:{ IllegalStateException -> 0x00ae }
        r6 = (long) r3;	 Catch:{ IllegalStateException -> 0x00ae }
        r0.bindLong(r2, r6);	 Catch:{ IllegalStateException -> 0x00ae }
        r2 = 2;
        r3 = r9.k;	 Catch:{ IllegalStateException -> 0x00ae }
        r3 = r3.c;	 Catch:{ IllegalStateException -> 0x00ae }
        r0.bindString(r2, r3);	 Catch:{ IllegalStateException -> 0x00ae }
        r5 = 3;
        r2 = r9.k;	 Catch:{ IllegalStateException -> 0x00ae }
        r2 = r2.a;	 Catch:{ IllegalStateException -> 0x00ae }
        if (r2 == 0) goto L_0x00b0;
    L_0x0085:
        r2 = 1;
    L_0x0087:
        r0.bindLong(r5, r2);	 Catch:{ all -> 0x00a6 }
        r2 = 4;
        r3 = r9.k;	 Catch:{ all -> 0x00a6 }
        r3 = r3.b;	 Catch:{ all -> 0x00a6 }
        r0.bindString(r2, r3);	 Catch:{ all -> 0x00a6 }
        if (r1 == 0) goto L_0x00b3;
    L_0x0094:
        monitor-exit(r4);	 Catch:{ all -> 0x00a6 }
    L_0x0095:
        return;
    L_0x0096:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0098 }
    L_0x0098:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x009a }
    L_0x009a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x009c }
    L_0x009c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x009e }
    L_0x009e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00a0 }
    L_0x00a0:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00a2 }
    L_0x00a2:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00a4 }
    L_0x00a4:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00a6 }
    L_0x00a6:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x00a6 }
        throw r0;
    L_0x00a9:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00a6 }
    L_0x00ab:
        r2 = 0;
        goto L_0x0060;
    L_0x00ae:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00a6 }
    L_0x00b0:
        r2 = 0;
        goto L_0x0087;
    L_0x00b3:
        r0.execute();	 Catch:{ all -> 0x00a6 }
        monitor-exit(r4);	 Catch:{ all -> 0x00a6 }
        goto L_0x0095;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.g(com.whatsapp.protocol.co):void");
    }

    private void a(String str, String str2, Long l) {
        Throwable e;
        SQLiteDatabase sQLiteDatabase = null;
        synchronized (this.a) {
            try {
                sQLiteDatabase = this.a.getWritableDatabase();
                sQLiteDatabase.beginTransaction();
                ContentValues contentValues = new ContentValues(3);
                if (l != null) {
                    contentValues.put(Y[664], l);
                }
                contentValues.put(Y[665], str2);
                if (sQLiteDatabase.update(Y[666], contentValues, Y[669], new String[]{str}) == 0) {
                    contentValues.put(Y[668], str);
                    if (sQLiteDatabase.insert(Y[667], null, contentValues) == -1) {
                        Log.e(Y[670] + str);
                    }
                }
                sQLiteDatabase.setTransactionSuccessful();
                if (sQLiteDatabase != null) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (SQLiteDatabaseCorruptException e2) {
                        throw e2;
                    }
                }
            } catch (SQLiteDatabaseCorruptException e22) {
                throw e22;
            } catch (RuntimeException e3) {
                e = e3;
                Log.a(e);
                throw e;
            } catch (Error e4) {
                e = e4;
                Log.a(e);
                throw e;
            } catch (SQLiteDatabaseCorruptException e222) {
                throw e222;
            } catch (Throwable e5) {
                try {
                    Log.a(e5);
                    r();
                    throw new AssertionError(e5);
                } catch (Throwable th) {
                    if (sQLiteDatabase != null) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (SQLiteDatabaseCorruptException e2222) {
                            throw e2222;
                        } catch (SQLiteDatabaseCorruptException e22222) {
                            throw e22222;
                        }
                    }
                }
            }
        }
    }

    public void a(co coVar) {
        a(coVar, -1);
    }

    public void m() {
        try {
            Log.i(Y[482]);
            if (this.u) {
                try {
                    u();
                } catch (Throwable e) {
                    Log.b(Y[483], e);
                    this.a.close();
                    P();
                    u();
                }
            }
            App.Z = true;
        } catch (SQLiteDatabaseCorruptException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File a(java.lang.String r10) {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:com.whatsapp.ael.a(java.lang.String):java.io.File. bs: [B:41:0x0079, B:54:0x008f, B:83:0x00b4]
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
        r9 = this;
        r1 = 0;
        r3 = com.whatsapp.l5.s;
        com.whatsapp.auv.b();
        r4 = r9.a;
        monitor-enter(r4);
        r0 = r9.a;	 Catch:{ all -> 0x0093 }
        com.whatsapp.a5f.c(r0);	 Catch:{ all -> 0x0093 }
        r0 = r9.a;	 Catch:{ all -> 0x0093 }
        r0 = r0.getReadableDatabase();	 Catch:{ all -> 0x0093 }
        r2 = Y;	 Catch:{ all -> 0x0093 }
        r5 = 396; // 0x18c float:5.55E-43 double:1.956E-321;	 Catch:{ all -> 0x0093 }
        r2 = r2[r5];	 Catch:{ all -> 0x0093 }
        r5 = 1;	 Catch:{ all -> 0x0093 }
        r5 = new java.lang.String[r5];	 Catch:{ all -> 0x0093 }
        r6 = 0;	 Catch:{ all -> 0x0093 }
        r5[r6] = r10;	 Catch:{ all -> 0x0093 }
        r5 = r0.rawQuery(r2, r5);	 Catch:{ all -> 0x0093 }
        if (r5 == 0) goto L_0x00a9;
    L_0x0026:
        r0 = r5.moveToNext();	 Catch:{ IOException -> 0x007e }
        if (r0 == 0) goto L_0x00b2;
    L_0x002c:
        r0 = 0;
        r0 = r5.getBlob(r0);	 Catch:{ SQLiteDiskIOException -> 0x0080 }
        if (r0 == 0) goto L_0x00a7;
    L_0x0033:
        r2 = new java.io.ObjectInputStream;	 Catch:{ IOException -> 0x00ef, ClassNotFoundException -> 0x00ea, all -> 0x00d5 }
        r6 = new java.io.ByteArrayInputStream;	 Catch:{ IOException -> 0x00ef, ClassNotFoundException -> 0x00ea, all -> 0x00d5 }
        r6.<init>(r0);	 Catch:{ IOException -> 0x00ef, ClassNotFoundException -> 0x00ea, all -> 0x00d5 }
        r2.<init>(r6);	 Catch:{ IOException -> 0x00ef, ClassNotFoundException -> 0x00ea, all -> 0x00d5 }
        r0 = r2.readObject();	 Catch:{ IOException -> 0x009e, ClassNotFoundException -> 0x00ed }
        r0 = (com.whatsapp.MediaData) r0;	 Catch:{ IOException -> 0x009e, ClassNotFoundException -> 0x00ed }
        r6 = r0.file;	 Catch:{ IOException -> 0x009e, ClassNotFoundException -> 0x00ed }
        if (r6 == 0) goto L_0x0047;
    L_0x0047:
        if (r0 == 0) goto L_0x00c3;
    L_0x0049:
        r6 = r0.transferred;	 Catch:{ IOException -> 0x0096, ClassNotFoundException -> 0x00ed }
        if (r6 == 0) goto L_0x00c3;
    L_0x004d:
        r6 = r0.file;	 Catch:{ IOException -> 0x0098, ClassNotFoundException -> 0x00ed }
        if (r6 == 0) goto L_0x00c3;
    L_0x0051:
        r6 = r0.file;	 Catch:{ IOException -> 0x009a, ClassNotFoundException -> 0x00ed }
        r6 = r6.isAbsolute();	 Catch:{ IOException -> 0x009a, ClassNotFoundException -> 0x00ed }
        if (r6 != 0) goto L_0x0068;
    L_0x0059:
        r6 = new java.io.File;	 Catch:{ IOException -> 0x009c, ClassNotFoundException -> 0x00ed }
        r7 = com.whatsapp.App.a3;	 Catch:{ IOException -> 0x009c, ClassNotFoundException -> 0x00ed }
        r8 = r0.file;	 Catch:{ IOException -> 0x009c, ClassNotFoundException -> 0x00ed }
        r8 = r8.getPath();	 Catch:{ IOException -> 0x009c, ClassNotFoundException -> 0x00ed }
        r6.<init>(r7, r8);	 Catch:{ IOException -> 0x009c, ClassNotFoundException -> 0x00ed }
        r0.file = r6;	 Catch:{ IOException -> 0x009c, ClassNotFoundException -> 0x00ed }
    L_0x0068:
        r6 = r0.file;	 Catch:{ IOException -> 0x009e, ClassNotFoundException -> 0x00ed }
        r6 = r6.exists();	 Catch:{ IOException -> 0x009e, ClassNotFoundException -> 0x00ed }
        if (r6 == 0) goto L_0x00c3;	 Catch:{ IOException -> 0x009e, ClassNotFoundException -> 0x00ed }
    L_0x0070:
        r0 = r0.file;	 Catch:{ IOException -> 0x009e, ClassNotFoundException -> 0x00ed }
        if (r2 == 0) goto L_0x0077;
    L_0x0074:
        r2.close();	 Catch:{ IOException -> 0x00bc, ClassNotFoundException -> 0x00ba }
    L_0x0077:
        if (r5 == 0) goto L_0x007c;
    L_0x0079:
        r5.close();	 Catch:{ IOException -> 0x00c1 }
    L_0x007c:
        monitor-exit(r4);	 Catch:{ all -> 0x0093 }
    L_0x007d:
        return r0;
    L_0x007e:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x0080 }
    L_0x0080:
        r0 = move-exception;
        r1 = com.whatsapp.App.z();	 Catch:{ all -> 0x008c }
        r2 = 2131231111; // 0x7f080187 float:1.8078294E38 double:1.0529680753E-314;	 Catch:{ all -> 0x008c }
        com.whatsapp.util.p.a(r1, r2);	 Catch:{ all -> 0x008c }
        throw r0;	 Catch:{ all -> 0x008c }
    L_0x008c:
        r0 = move-exception;
        if (r5 == 0) goto L_0x0092;
    L_0x008f:
        r5.close();	 Catch:{ IOException -> 0x00e6 }
    L_0x0092:
        throw r0;	 Catch:{ all -> 0x0093 }
    L_0x0093:
        r0 = move-exception;	 Catch:{ all -> 0x0093 }
        monitor-exit(r4);	 Catch:{ all -> 0x0093 }
        throw r0;
    L_0x0096:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0098, ClassNotFoundException -> 0x00ed }
    L_0x0098:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x009a, ClassNotFoundException -> 0x00ed }
    L_0x009a:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x009c, ClassNotFoundException -> 0x00ed }
    L_0x009c:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x009e, ClassNotFoundException -> 0x00ed }
    L_0x009e:
        r0 = move-exception;
    L_0x009f:
        com.whatsapp.util.Log.a(r0);	 Catch:{ all -> 0x00e8 }
        if (r2 == 0) goto L_0x00a7;
    L_0x00a4:
        r2.close();	 Catch:{ IOException -> 0x00d0 }
    L_0x00a7:
        if (r3 == 0) goto L_0x0026;
    L_0x00a9:
        r0 = Y;	 Catch:{ SQLiteDiskIOException -> 0x0080 }
        r2 = 397; // 0x18d float:5.56E-43 double:1.96E-321;	 Catch:{ SQLiteDiskIOException -> 0x0080 }
        r0 = r0[r2];	 Catch:{ SQLiteDiskIOException -> 0x0080 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ SQLiteDiskIOException -> 0x0080 }
    L_0x00b2:
        if (r5 == 0) goto L_0x00b7;
    L_0x00b4:
        r5.close();	 Catch:{ IOException -> 0x00e4 }
    L_0x00b7:
        monitor-exit(r4);	 Catch:{ all -> 0x0093 }
        r0 = r1;
        goto L_0x007d;
    L_0x00ba:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x0080 }
    L_0x00bc:
        r1 = move-exception;	 Catch:{ SQLiteDiskIOException -> 0x0080 }
        com.whatsapp.util.Log.a(r1);	 Catch:{ SQLiteDiskIOException -> 0x0080 }
        goto L_0x0077;
    L_0x00c1:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0093 }
    L_0x00c3:
        if (r2 == 0) goto L_0x00a7;
    L_0x00c5:
        r2.close();	 Catch:{ IOException -> 0x00c9, ClassNotFoundException -> 0x00ce }
        goto L_0x00a7;
    L_0x00c9:
        r0 = move-exception;
        com.whatsapp.util.Log.a(r0);	 Catch:{ SQLiteDiskIOException -> 0x0080 }
        goto L_0x00a7;	 Catch:{ SQLiteDiskIOException -> 0x0080 }
    L_0x00ce:
        r0 = move-exception;	 Catch:{ SQLiteDiskIOException -> 0x0080 }
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x0080 }
    L_0x00d0:
        r0 = move-exception;	 Catch:{ SQLiteDiskIOException -> 0x0080 }
        com.whatsapp.util.Log.a(r0);	 Catch:{ SQLiteDiskIOException -> 0x0080 }
        goto L_0x00a7;
    L_0x00d5:
        r0 = move-exception;
        r2 = r1;
    L_0x00d7:
        if (r2 == 0) goto L_0x00dc;
    L_0x00d9:
        r2.close();	 Catch:{ IOException -> 0x00df, ClassNotFoundException -> 0x00dd }
    L_0x00dc:
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x0080 }
    L_0x00dd:
        r0 = move-exception;	 Catch:{ SQLiteDiskIOException -> 0x0080 }
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x0080 }
    L_0x00df:
        r1 = move-exception;	 Catch:{ SQLiteDiskIOException -> 0x0080 }
        com.whatsapp.util.Log.a(r1);	 Catch:{ SQLiteDiskIOException -> 0x0080 }
        goto L_0x00dc;
    L_0x00e4:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0093 }
    L_0x00e6:
        r0 = move-exception;	 Catch:{ all -> 0x0093 }
        throw r0;	 Catch:{ all -> 0x0093 }
    L_0x00e8:
        r0 = move-exception;
        goto L_0x00d7;
    L_0x00ea:
        r0 = move-exception;
        r2 = r1;
        goto L_0x009f;
    L_0x00ed:
        r0 = move-exception;
        goto L_0x009f;
    L_0x00ef:
        r0 = move-exception;
        r2 = r1;
        goto L_0x009f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.a(java.lang.String):java.io.File");
    }

    public boolean x(String str) {
        boolean z = true;
        String[] strArr = new String[]{str};
        synchronized (this.a) {
            Cursor rawQuery = this.a.getReadableDatabase().rawQuery(Y[571], strArr);
            if (rawQuery != null) {
                try {
                    if (rawQuery.getCount() != 1) {
                        z = false;
                    }
                    rawQuery.close();
                    return z;
                } catch (IllegalStateException e) {
                    throw e;
                } catch (Throwable th) {
                    rawQuery.close();
                }
            } else {
                return false;
            }
        }
    }

    public co v(String str) {
        ArrayList b = b(str, 1);
        try {
            return b.isEmpty() ? null : (co) b.get(0);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public List k() {
        List arrayList;
        synchronized (this.D) {
            arrayList = new ArrayList(this.D);
        }
        return arrayList;
    }

    public List a(c3 c3Var, int i) {
        List list = null;
        boolean z = l5.s;
        if (b(a(c3Var)) == 1) {
            try {
                Log.i(Y[632] + c3Var);
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        String str = Y[630] + i;
        String[] strArr = new String[]{c3Var.c, String.valueOf(r2)};
        synchronized (this.a) {
            Cursor rawQuery = this.a.getReadableDatabase().rawQuery(str, strArr);
        }
        if (rawQuery != null) {
            list = new LinkedList();
            while (rawQuery.moveToNext()) {
                co a = a(rawQuery, c3Var.c);
                if (a != null) {
                    try {
                        list.addFirst(a);
                    } catch (IllegalStateException e2) {
                        throw e2;
                    }
                }
                if (z) {
                    break;
                }
            }
            rawQuery.close();
        } else {
            Log.i(Y[631] + c3Var);
        }
        return list;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList b(java.lang.String r31, boolean r32) {
        /*
        r30 = this;
        r18 = com.whatsapp.l5.s;
        if (r31 == 0) goto L_0x000f;
    L_0x0004:
        r4 = "";
        r0 = r31;
        r4 = r0.equals(r4);	 Catch:{ IOException -> 0x0017 }
        if (r4 == 0) goto L_0x0019;
    L_0x000f:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ IOException -> 0x0015 }
        r4.<init>();	 Catch:{ IOException -> 0x0015 }
        throw r4;	 Catch:{ IOException -> 0x0015 }
    L_0x0015:
        r4 = move-exception;
        throw r4;
    L_0x0017:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0015 }
    L_0x0019:
        r19 = new com.whatsapp.util.ab;
        r19.<init>();
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = Y;
        r6 = 533; // 0x215 float:7.47E-43 double:2.633E-321;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r0 = r31;
        r4 = r4.append(r0);
        r4 = r4.toString();
        r0 = r19;
        r0.b(r4);
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = com.whatsapp.App.z();
        r6 = 2131231091; // 0x7f080173 float:1.8078253E38 double:1.0529680654E-314;
        r7 = 1;
        r7 = new java.lang.Object[r7];
        r8 = 0;
        r9 = com.whatsapp.App.as;
        r0 = r31;
        r9 = r9.b(r0);
        r10 = com.whatsapp.App.z();
        r9 = r9.a(r10);
        r7[r8] = r9;
        r5 = r5.getString(r6, r7);
        r6 = Y;
        r7 = 541; // 0x21d float:7.58E-43 double:2.673E-321;
        r6 = r6[r7];
        r7 = "";
        r5 = r5.replaceAll(r6, r7);
        r4 = r4.append(r5);
        r5 = Y;
        r6 = 543; // 0x21f float:7.61E-43 double:2.683E-321;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r5 = r4.toString();
        r4 = com.whatsapp.App.j(r5);
        r4.createNewFile();	 Catch:{ IOException -> 0x0303 }
        r17 = r4;
    L_0x008a:
        r4 = r17.exists();	 Catch:{ IOException -> 0x0310 }
        if (r4 == 0) goto L_0x0093;
    L_0x0090:
        r17.delete();	 Catch:{ IOException -> 0x0310 }
    L_0x0093:
        r5 = 0;
        r6 = new java.io.FileOutputStream;	 Catch:{ FileNotFoundException -> 0x0312, Exception -> 0x031e }
        r0 = r17;
        r6.<init>(r0);	 Catch:{ FileNotFoundException -> 0x0312, Exception -> 0x031e }
        r4 = new java.io.OutputStreamWriter;	 Catch:{ FileNotFoundException -> 0x0312, Exception -> 0x031e }
        r7 = Y;	 Catch:{ FileNotFoundException -> 0x0312, Exception -> 0x031e }
        r8 = 530; // 0x212 float:7.43E-43 double:2.62E-321;
        r7 = r7[r8];	 Catch:{ FileNotFoundException -> 0x0312, Exception -> 0x031e }
        r4.<init>(r6, r7);	 Catch:{ FileNotFoundException -> 0x0312, Exception -> 0x031e }
        r5 = r4;
    L_0x00a7:
        r20 = com.whatsapp.qm.i(r31);
        r8 = new java.util.ArrayList;
        r8.<init>();
        r9 = 0;
        r12 = 0;
        if (r32 == 0) goto L_0x0324;
    L_0x00b5:
        r4 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
        r6 = r4;
    L_0x00b8:
        r0 = r30;
        r0 = r0.a;
        r21 = r0;
        monitor-enter(r21);
        r10 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r0 = r30;
        r4 = r0.a;	 Catch:{ all -> 0x032c }
        r4 = r4.getReadableDatabase();	 Catch:{ all -> 0x032c }
        r7 = new java.lang.StringBuilder;	 Catch:{ all -> 0x032c }
        r7.<init>();	 Catch:{ all -> 0x032c }
        r14 = Y;	 Catch:{ all -> 0x032c }
        r15 = 522; // 0x20a float:7.31E-43 double:2.58E-321;
        r14 = r14[r15];	 Catch:{ all -> 0x032c }
        r7 = r7.append(r14);	 Catch:{ all -> 0x032c }
        r7 = r7.append(r6);	 Catch:{ all -> 0x032c }
        r7 = r7.toString();	 Catch:{ all -> 0x032c }
        r14 = 1;
        r14 = new java.lang.String[r14];	 Catch:{ all -> 0x032c }
        r15 = 0;
        r14[r15] = r31;	 Catch:{ all -> 0x032c }
        r22 = r4.rawQuery(r7, r14);	 Catch:{ all -> 0x032c }
        if (r22 == 0) goto L_0x05f1;
    L_0x00ef:
        r4 = r22.moveToNext();	 Catch:{ IOException -> 0x032a }
        if (r4 == 0) goto L_0x05ee;
    L_0x00f5:
        r4 = 0;
        r14 = 0;
    L_0x00f8:
        r0 = r30;
        r1 = r22;
        r2 = r31;
        r23 = r0.a(r1, r2);	 Catch:{ SQLiteException -> 0x0345 }
        if (r23 != 0) goto L_0x0106;
    L_0x0104:
        if (r18 == 0) goto L_0x0153;
    L_0x0106:
        r16 = r4 + 1;
        r24 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r14 = r14 + r24;
        r7 = 0;
        r0 = r23;
        r4 = r0.c;	 Catch:{ IOException -> 0x0341 }
        switch(r4) {
            case 1: goto L_0x032f;
            case 2: goto L_0x032f;
            case 3: goto L_0x032f;
            case 4: goto L_0x036a;
            case 5: goto L_0x0114;
            case 6: goto L_0x0114;
            case 7: goto L_0x0114;
            case 8: goto L_0x0114;
            case 9: goto L_0x032f;
            default: goto L_0x0114;
        };
    L_0x0114:
        r4 = r23.a();	 Catch:{ SQLiteException -> 0x0345 }
        if (r4 == 0) goto L_0x0124;
    L_0x011a:
        r4 = r23.e();	 Catch:{ SQLiteException -> 0x0345 }
        r4 = r4.length;	 Catch:{ SQLiteException -> 0x0345 }
        r0 = (long) r4;
        r24 = r0;
        r14 = r14 + r24;
    L_0x0124:
        if (r7 == 0) goto L_0x0132;
    L_0x0126:
        r4 = r7.exists();	 Catch:{ IOException -> 0x0417 }
        if (r4 == 0) goto L_0x0132;
    L_0x012c:
        r24 = r7.length();	 Catch:{ SQLiteException -> 0x0345 }
        r14 = r14 + r24;
    L_0x0132:
        r0 = r16;
        if (r0 >= r6) goto L_0x0159;
    L_0x0136:
        r24 = 15000000; // 0xe4e1c0 float:2.1019477E-38 double:7.4109847E-317;
        r4 = (r14 > r24 ? 1 : (r14 == r24 ? 0 : -1));
        if (r4 >= 0) goto L_0x0159;
    L_0x013d:
        r4 = 23;
        r0 = r22;
        r10 = r0.getLong(r4);	 Catch:{ SQLiteException -> 0x0345 }
        if (r7 == 0) goto L_0x05ea;
    L_0x0147:
        r4 = r7.exists();	 Catch:{ IOException -> 0x0419 }
        if (r4 == 0) goto L_0x05ea;
    L_0x014d:
        r4 = 0;
        r8.add(r4, r7);	 Catch:{ IOException -> 0x041b }
        r4 = r16;
    L_0x0153:
        r7 = r22.moveToNext();	 Catch:{ SQLiteException -> 0x0345 }
        if (r7 != 0) goto L_0x00f8;
    L_0x0159:
        r6 = r10;
        r22.close();	 Catch:{ all -> 0x032c }
    L_0x015d:
        if (r18 == 0) goto L_0x0162;
    L_0x015f:
        r22.close();	 Catch:{ IOException -> 0x041d }
    L_0x0162:
        r0 = r30;
        r4 = r0.a;	 Catch:{ all -> 0x032c }
        r4 = r4.getReadableDatabase();	 Catch:{ all -> 0x032c }
        r10 = Y;	 Catch:{ all -> 0x032c }
        r11 = 539; // 0x21b float:7.55E-43 double:2.663E-321;
        r10 = r10[r11];	 Catch:{ all -> 0x032c }
        r11 = 2;
        r11 = new java.lang.String[r11];	 Catch:{ all -> 0x032c }
        r14 = 0;
        r11[r14] = r31;	 Catch:{ all -> 0x032c }
        r14 = 1;
        r6 = java.lang.Long.toString(r6);	 Catch:{ all -> 0x032c }
        r11[r14] = r6;	 Catch:{ all -> 0x032c }
        r10 = r4.rawQuery(r10, r11);	 Catch:{ all -> 0x032c }
        if (r10 == 0) goto L_0x02b2;
    L_0x0183:
        r4 = r10.moveToFirst();	 Catch:{ IOException -> 0x041f }
        if (r4 == 0) goto L_0x02af;
    L_0x0189:
        r11 = new java.lang.StringBuilder;	 Catch:{ SQLiteException -> 0x05e6 }
        r11.<init>();	 Catch:{ SQLiteException -> 0x05e6 }
        r6 = r12;
    L_0x018f:
        r0 = r30;
        r1 = r31;
        r12 = r0.a(r10, r1);	 Catch:{ SQLiteException -> 0x0433 }
        if (r12 != 0) goto L_0x019b;
    L_0x0199:
        if (r18 == 0) goto L_0x02a3;
    L_0x019b:
        r9 = r9 + 1;
        r4 = com.whatsapp.App.z();	 Catch:{ IOException -> 0x0421 }
        r4 = r4.getApplicationContext();	 Catch:{ IOException -> 0x0421 }
        r14 = com.whatsapp.App.o(r12);	 Catch:{ IOException -> 0x0421 }
        r4 = com.whatsapp.util.cs.h(r4, r14);	 Catch:{ IOException -> 0x0421 }
        r11.append(r4);	 Catch:{ IOException -> 0x0421 }
        r4 = Y;	 Catch:{ IOException -> 0x0421 }
        r13 = 529; // 0x211 float:7.41E-43 double:2.614E-321;
        r4 = r4[r13];	 Catch:{ IOException -> 0x0421 }
        r11.append(r4);	 Catch:{ IOException -> 0x0421 }
        r4 = r12.c;	 Catch:{ IOException -> 0x0421 }
        if (r4 != 0) goto L_0x01c2;
    L_0x01bd:
        r4 = r12.d;	 Catch:{ IOException -> 0x0423 }
        r13 = 6;
        if (r4 == r13) goto L_0x0240;
    L_0x01c2:
        r4 = r12.k;	 Catch:{ IOException -> 0x0425 }
        r4 = r4.a;	 Catch:{ IOException -> 0x0425 }
        if (r4 == 0) goto L_0x01d9;
    L_0x01c8:
        r4 = com.whatsapp.App.z();	 Catch:{ IOException -> 0x0427 }
        r4 = r4.getApplicationContext();	 Catch:{ IOException -> 0x0427 }
        r4 = com.whatsapp.App.h(r4);	 Catch:{ IOException -> 0x0427 }
        r11.append(r4);	 Catch:{ IOException -> 0x0427 }
        if (r18 == 0) goto L_0x0237;
    L_0x01d9:
        if (r20 == 0) goto L_0x0222;
    L_0x01db:
        r4 = r12.t;	 Catch:{ IOException -> 0x042b }
        if (r4 == 0) goto L_0x01f4;
    L_0x01df:
        r4 = com.whatsapp.App.as;	 Catch:{ IOException -> 0x042d }
        r13 = r12.t;	 Catch:{ IOException -> 0x042d }
        r4 = r4.b(r13);	 Catch:{ IOException -> 0x042d }
        r13 = com.whatsapp.App.z();	 Catch:{ IOException -> 0x042d }
        r4 = r4.a(r13);	 Catch:{ IOException -> 0x042d }
        r11.append(r4);	 Catch:{ IOException -> 0x042d }
        if (r18 == 0) goto L_0x0237;
    L_0x01f4:
        r4 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x042f }
        r4.<init>();	 Catch:{ IOException -> 0x042f }
        r13 = Y;	 Catch:{ IOException -> 0x042f }
        r14 = 527; // 0x20f float:7.38E-43 double:2.604E-321;
        r13 = r13[r14];	 Catch:{ IOException -> 0x042f }
        r4 = r4.append(r13);	 Catch:{ IOException -> 0x042f }
        r13 = com.whatsapp.util.Log.a(r12);	 Catch:{ IOException -> 0x042f }
        r4 = r4.append(r13);	 Catch:{ IOException -> 0x042f }
        r4 = r4.toString();	 Catch:{ IOException -> 0x042f }
        com.whatsapp.util.Log.e(r4);	 Catch:{ IOException -> 0x042f }
        r4 = com.whatsapp.App.z();	 Catch:{ IOException -> 0x042f }
        r13 = 2131232182; // 0x7f0805b6 float:1.8080466E38 double:1.0529686044E-314;
        r4 = r4.getString(r13);	 Catch:{ IOException -> 0x042f }
        r11.append(r4);	 Catch:{ IOException -> 0x042f }
        if (r18 == 0) goto L_0x0237;
    L_0x0222:
        r4 = com.whatsapp.App.as;	 Catch:{ IOException -> 0x0431 }
        r13 = r12.k;	 Catch:{ IOException -> 0x0431 }
        r13 = r13.c;	 Catch:{ IOException -> 0x0431 }
        r4 = r4.b(r13);	 Catch:{ IOException -> 0x0431 }
        r13 = com.whatsapp.App.z();	 Catch:{ IOException -> 0x0431 }
        r4 = r4.a(r13);	 Catch:{ IOException -> 0x0431 }
        r11.append(r4);	 Catch:{ IOException -> 0x0431 }
    L_0x0237:
        r4 = Y;	 Catch:{ SQLiteException -> 0x0433 }
        r13 = 538; // 0x21a float:7.54E-43 double:2.66E-321;
        r4 = r4[r13];	 Catch:{ SQLiteException -> 0x0433 }
        r11.append(r4);	 Catch:{ SQLiteException -> 0x0433 }
    L_0x0240:
        r4 = r12.c;	 Catch:{ IOException -> 0x0570 }
        switch(r4) {
            case 1: goto L_0x0458;
            case 2: goto L_0x0458;
            case 3: goto L_0x0458;
            case 4: goto L_0x04cb;
            case 5: goto L_0x0504;
            case 6: goto L_0x0245;
            case 7: goto L_0x0245;
            case 8: goto L_0x0245;
            case 9: goto L_0x0458;
            default: goto L_0x0245;
        };
    L_0x0245:
        r4 = r12.c;	 Catch:{ IOException -> 0x05a4 }
        if (r4 == 0) goto L_0x0265;
    L_0x0249:
        r4 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x05a6 }
        r4.<init>();	 Catch:{ IOException -> 0x05a6 }
        r13 = Y;	 Catch:{ IOException -> 0x05a6 }
        r14 = 540; // 0x21c float:7.57E-43 double:2.67E-321;
        r13 = r13[r14];	 Catch:{ IOException -> 0x05a6 }
        r4 = r4.append(r13);	 Catch:{ IOException -> 0x05a6 }
        r13 = r12.c;	 Catch:{ IOException -> 0x05a6 }
        r4 = r4.append(r13);	 Catch:{ IOException -> 0x05a6 }
        r4 = r4.toString();	 Catch:{ IOException -> 0x05a6 }
        com.whatsapp.util.Log.w(r4);	 Catch:{ IOException -> 0x05a6 }
    L_0x0265:
        r4 = r12.d;	 Catch:{ IOException -> 0x05a8 }
        r13 = 6;
        if (r4 != r13) goto L_0x0273;
    L_0x026a:
        r4 = com.whatsapp.ConversationRowDivider.b(r12);	 Catch:{ IOException -> 0x05a8 }
        r11.append(r4);	 Catch:{ IOException -> 0x05a8 }
        if (r18 == 0) goto L_0x027a;
    L_0x0273:
        r4 = r12.c();	 Catch:{ IOException -> 0x05aa }
        r11.append(r4);	 Catch:{ IOException -> 0x05aa }
    L_0x027a:
        r4 = r11.length();	 Catch:{ SQLiteException -> 0x05ac }
        if (r4 <= 0) goto L_0x02a3;
    L_0x0280:
        r4 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x05ae }
        r4.<init>();	 Catch:{ IOException -> 0x05ae }
        r12 = r11.toString();	 Catch:{ IOException -> 0x05ae }
        r4 = r4.append(r12);	 Catch:{ IOException -> 0x05ae }
        r12 = "\n";
        r4 = r4.append(r12);	 Catch:{ IOException -> 0x05ae }
        r4 = r4.toString();	 Catch:{ IOException -> 0x05ae }
        r5.write(r4);	 Catch:{ IOException -> 0x05ae }
    L_0x029b:
        r4 = 0;
        r12 = r11.length();	 Catch:{ SQLiteException -> 0x0433 }
        r11.delete(r4, r12);	 Catch:{ SQLiteException -> 0x0433 }
    L_0x02a3:
        r4 = r10.moveToNext();	 Catch:{ SQLiteException -> 0x0433 }
        if (r4 != 0) goto L_0x018f;
    L_0x02a9:
        r10.close();	 Catch:{ all -> 0x032c }
        r12 = r6;
    L_0x02ad:
        if (r18 == 0) goto L_0x02b2;
    L_0x02af:
        r10.close();	 Catch:{ IOException -> 0x05de }
    L_0x02b2:
        monitor-exit(r21);	 Catch:{ all -> 0x032c }
        r5.flush();	 Catch:{ IOException -> 0x05e0 }
        r5.close();	 Catch:{ IOException -> 0x05e0 }
    L_0x02b9:
        r4 = r17.length();
        r4 = r4 + r12;
        r6 = 0;
        r0 = r17;
        r8.add(r6, r0);
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r7 = Y;
        r10 = 536; // 0x218 float:7.51E-43 double:2.65E-321;
        r7 = r7[r10];
        r6 = r6.append(r7);
        r6 = r6.append(r9);
        r7 = Y;
        r9 = 546; // 0x222 float:7.65E-43 double:2.7E-321;
        r7 = r7[r9];
        r6 = r6.append(r7);
        r7 = r8.size();
        r6 = r6.append(r7);
        r7 = Y;
        r9 = 544; // 0x220 float:7.62E-43 double:2.69E-321;
        r7 = r7[r9];
        r6 = r6.append(r7);
        r4 = r6.append(r4);
        r4 = r4.toString();
        com.whatsapp.util.Log.i(r4);
        r19.b();
        r4 = r8;
    L_0x0302:
        return r4;
    L_0x0303:
        r4 = move-exception;
        r4 = com.whatsapp.a28.a(r5);
        r4 = com.whatsapp.App.j(r4);
        r17 = r4;
        goto L_0x008a;
    L_0x0310:
        r4 = move-exception;
        throw r4;
    L_0x0312:
        r4 = move-exception;
        r4 = Y;
        r5 = 535; // 0x217 float:7.5E-43 double:2.643E-321;
        r4 = r4[r5];
        com.whatsapp.util.Log.e(r4);
        r4 = 0;
        goto L_0x0302;
    L_0x031e:
        r4 = move-exception;
        com.whatsapp.util.Log.a(r4);
        goto L_0x00a7;
    L_0x0324:
        r4 = 40000; // 0x9c40 float:5.6052E-41 double:1.97626E-319;
        r6 = r4;
        goto L_0x00b8;
    L_0x032a:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x032c }
    L_0x032c:
        r4 = move-exception;
        monitor-exit(r21);	 Catch:{ all -> 0x032c }
        throw r4;
    L_0x032f:
        if (r32 == 0) goto L_0x0124;
    L_0x0331:
        r0 = r23;
        r4 = r0.Q;	 Catch:{ IOException -> 0x0343 }
        if (r4 == 0) goto L_0x0124;
    L_0x0337:
        r0 = r23;
        r4 = r0.Q;	 Catch:{ SQLiteException -> 0x0345 }
        r4 = (com.whatsapp.MediaData) r4;	 Catch:{ SQLiteException -> 0x0345 }
        r7 = r4.file;	 Catch:{ SQLiteException -> 0x0345 }
        goto L_0x0124;
    L_0x0341:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0343 }
    L_0x0343:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteException -> 0x0345 }
    L_0x0345:
        r4 = move-exception;
        r6 = r10;
        r10 = new java.lang.StringBuilder;	 Catch:{ all -> 0x03e0 }
        r10.<init>();	 Catch:{ all -> 0x03e0 }
        r11 = Y;	 Catch:{ all -> 0x03e0 }
        r14 = 547; // 0x223 float:7.67E-43 double:2.703E-321;
        r11 = r11[r14];	 Catch:{ all -> 0x03e0 }
        r10 = r10.append(r11);	 Catch:{ all -> 0x03e0 }
        r4 = r4.toString();	 Catch:{ all -> 0x03e0 }
        r4 = r10.append(r4);	 Catch:{ all -> 0x03e0 }
        r4 = r4.toString();	 Catch:{ all -> 0x03e0 }
        com.whatsapp.util.Log.e(r4);	 Catch:{ all -> 0x03e0 }
        r22.close();	 Catch:{ all -> 0x032c }
        goto L_0x015d;
    L_0x036a:
        r24 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x03de }
        r24.<init>();	 Catch:{ IOException -> 0x03de }
        r0 = r23;
        r4 = r0.A;	 Catch:{ IOException -> 0x03de }
        if (r4 != 0) goto L_0x03e5;
    L_0x0375:
        r4 = "";
    L_0x0378:
        r0 = r24;
        r4 = r0.append(r4);	 Catch:{ SQLiteException -> 0x0345 }
        r24 = Y;	 Catch:{ SQLiteException -> 0x0345 }
        r25 = 523; // 0x20b float:7.33E-43 double:2.584E-321;
        r24 = r24[r25];	 Catch:{ SQLiteException -> 0x0345 }
        r0 = r24;
        r4 = r4.append(r0);	 Catch:{ SQLiteException -> 0x0345 }
        r4 = r4.toString();	 Catch:{ SQLiteException -> 0x0345 }
        r4 = com.whatsapp.App.j(r4);	 Catch:{ SQLiteException -> 0x0345 }
        r24 = r4.exists();	 Catch:{ IOException -> 0x03fc }
        if (r24 == 0) goto L_0x03ac;
    L_0x0398:
        r24 = r4.lastModified();	 Catch:{ IOException -> 0x03fc }
        r26 = java.lang.System.currentTimeMillis();	 Catch:{ IOException -> 0x03fc }
        r28 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r26 = r26 - r28;
        r24 = (r24 > r26 ? 1 : (r24 == r26 ? 0 : -1));
        if (r24 >= 0) goto L_0x03ac;
    L_0x03a9:
        r4.delete();	 Catch:{ IOException -> 0x03fe }
    L_0x03ac:
        r24 = r4.exists();	 Catch:{ SQLiteException -> 0x0345 }
        if (r24 != 0) goto L_0x040e;
    L_0x03b2:
        r24 = new java.io.OutputStreamWriter;	 Catch:{ IOException -> 0x0400 }
        r25 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x0400 }
        r0 = r25;
        r0.<init>(r4);	 Catch:{ IOException -> 0x0400 }
        r26 = Y;	 Catch:{ IOException -> 0x0400 }
        r27 = 524; // 0x20c float:7.34E-43 double:2.59E-321;
        r26 = r26[r27];	 Catch:{ IOException -> 0x0400 }
        r24.<init>(r25, r26);	 Catch:{ IOException -> 0x0400 }
        r23 = r23.c();	 Catch:{ IOException -> 0x0400 }
        r0 = r24;
        r1 = r23;
        r0.write(r1);	 Catch:{ IOException -> 0x0400 }
        r24.flush();	 Catch:{ IOException -> 0x0400 }
        r24.close();	 Catch:{ IOException -> 0x0400 }
        r23 = r8.contains(r4);	 Catch:{ IOException -> 0x0400 }
        if (r23 != 0) goto L_0x040c;
    L_0x03db:
        r7 = r4;
        goto L_0x0124;
    L_0x03de:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteException -> 0x0345 }
    L_0x03e0:
        r4 = move-exception;
        r22.close();	 Catch:{ all -> 0x032c }
        throw r4;	 Catch:{ all -> 0x032c }
    L_0x03e5:
        r0 = r23;
        r4 = r0.A;	 Catch:{ SQLiteException -> 0x0345 }
        r25 = Y;	 Catch:{ SQLiteException -> 0x0345 }
        r26 = 526; // 0x20e float:7.37E-43 double:2.6E-321;
        r25 = r25[r26];	 Catch:{ SQLiteException -> 0x0345 }
        r26 = "";
        r0 = r25;
        r1 = r26;
        r4 = r4.replaceAll(r0, r1);	 Catch:{ SQLiteException -> 0x0345 }
        goto L_0x0378;
    L_0x03fc:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x03fe }
    L_0x03fe:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteException -> 0x0345 }
    L_0x0400:
        r4 = move-exception;
        r23 = Y;	 Catch:{ SQLiteException -> 0x0345 }
        r24 = 525; // 0x20d float:7.36E-43 double:2.594E-321;
        r23 = r23[r24];	 Catch:{ SQLiteException -> 0x0345 }
        r0 = r23;
        com.whatsapp.util.Log.b(r0, r4);	 Catch:{ SQLiteException -> 0x0345 }
    L_0x040c:
        r4 = r7;
        goto L_0x03db;
    L_0x040e:
        r23 = r8.contains(r4);	 Catch:{ SQLiteException -> 0x0345 }
        if (r23 != 0) goto L_0x0124;
    L_0x0414:
        r7 = r4;
        goto L_0x0124;
    L_0x0417:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteException -> 0x0345 }
    L_0x0419:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x041b }
    L_0x041b:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteException -> 0x0345 }
    L_0x041d:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x032c }
    L_0x041f:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x032c }
    L_0x0421:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0423 }
    L_0x0423:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0425 }
    L_0x0425:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0427 }
    L_0x0427:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0429 }
    L_0x0429:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x042b }
    L_0x042b:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x042d }
    L_0x042d:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x042f }
    L_0x042f:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0431 }
    L_0x0431:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteException -> 0x0433 }
    L_0x0433:
        r4 = move-exception;
    L_0x0434:
        r11 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0574 }
        r11.<init>();	 Catch:{ all -> 0x0574 }
        r12 = Y;	 Catch:{ all -> 0x0574 }
        r13 = 531; // 0x213 float:7.44E-43 double:2.623E-321;
        r12 = r12[r13];	 Catch:{ all -> 0x0574 }
        r11 = r11.append(r12);	 Catch:{ all -> 0x0574 }
        r4 = r4.toString();	 Catch:{ all -> 0x0574 }
        r4 = r11.append(r4);	 Catch:{ all -> 0x0574 }
        r4 = r4.toString();	 Catch:{ all -> 0x0574 }
        com.whatsapp.util.Log.e(r4);	 Catch:{ all -> 0x0574 }
        r10.close();	 Catch:{ all -> 0x032c }
        r12 = r6;
        goto L_0x02ad;
    L_0x0458:
        if (r32 == 0) goto L_0x04bb;
    L_0x045a:
        r4 = r12.Q;	 Catch:{ IOException -> 0x0572 }
        if (r4 == 0) goto L_0x04ab;
    L_0x045e:
        r4 = r12.Q;	 Catch:{ SQLiteException -> 0x0433 }
        r4 = (com.whatsapp.MediaData) r4;	 Catch:{ SQLiteException -> 0x0433 }
        r4 = r4.file;	 Catch:{ SQLiteException -> 0x0433 }
        if (r4 == 0) goto L_0x049b;
    L_0x0466:
        r13 = r4.exists();	 Catch:{ IOException -> 0x0579 }
        if (r13 == 0) goto L_0x049b;
    L_0x046c:
        r14 = r4.length();	 Catch:{ SQLiteException -> 0x0433 }
        r6 = r6 + r14;
        r13 = com.whatsapp.App.z();	 Catch:{ IOException -> 0x057b }
        r14 = 2131231092; // 0x7f080174 float:1.8078255E38 double:1.052968066E-314;
        r15 = 1;
        r15 = new java.lang.Object[r15];	 Catch:{ IOException -> 0x057b }
        r16 = 0;
        r4 = r4.getName();	 Catch:{ IOException -> 0x057b }
        r15[r16] = r4;	 Catch:{ IOException -> 0x057b }
        r4 = r13.getString(r14, r15);	 Catch:{ IOException -> 0x057b }
        r11.append(r4);	 Catch:{ IOException -> 0x057b }
        r4 = r12.a;	 Catch:{ IOException -> 0x057b }
        if (r4 == 0) goto L_0x04a9;
    L_0x048e:
        r4 = "\n";
        r11.append(r4);	 Catch:{ IOException -> 0x057b }
        r4 = r12.a;	 Catch:{ IOException -> 0x057b }
        r11.append(r4);	 Catch:{ IOException -> 0x057b }
        if (r18 == 0) goto L_0x04a9;
    L_0x049b:
        r4 = com.whatsapp.App.z();	 Catch:{ IOException -> 0x057d }
        r13 = 2131231094; // 0x7f080176 float:1.807826E38 double:1.052968067E-314;
        r4 = r4.getString(r13);	 Catch:{ IOException -> 0x057d }
        r11.append(r4);	 Catch:{ IOException -> 0x057d }
    L_0x04a9:
        if (r18 == 0) goto L_0x027a;
    L_0x04ab:
        r4 = com.whatsapp.App.z();	 Catch:{ IOException -> 0x057f }
        r13 = 2131231094; // 0x7f080176 float:1.807826E38 double:1.052968067E-314;
        r4 = r4.getString(r13);	 Catch:{ IOException -> 0x057f }
        r11.append(r4);	 Catch:{ IOException -> 0x057f }
        if (r18 == 0) goto L_0x027a;
    L_0x04bb:
        r4 = com.whatsapp.App.z();	 Catch:{ IOException -> 0x0581 }
        r13 = 2131231094; // 0x7f080176 float:1.807826E38 double:1.052968067E-314;
        r4 = r4.getString(r13);	 Catch:{ IOException -> 0x0581 }
        r11.append(r4);	 Catch:{ IOException -> 0x0581 }
        if (r18 == 0) goto L_0x027a;
    L_0x04cb:
        r13 = com.whatsapp.App.z();	 Catch:{ IOException -> 0x0583 }
        r14 = 2131231092; // 0x7f080174 float:1.8078255E38 double:1.052968066E-314;
        r4 = 1;
        r15 = new java.lang.Object[r4];	 Catch:{ IOException -> 0x0583 }
        r16 = 0;
        r22 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0583 }
        r22.<init>();	 Catch:{ IOException -> 0x0583 }
        r4 = r12.A;	 Catch:{ IOException -> 0x0583 }
        if (r4 != 0) goto L_0x0587;
    L_0x04e0:
        r4 = "";
    L_0x04e3:
        r0 = r22;
        r4 = r0.append(r4);	 Catch:{ IOException -> 0x059c }
        r22 = Y;	 Catch:{ IOException -> 0x059c }
        r23 = 542; // 0x21e float:7.6E-43 double:2.68E-321;
        r22 = r22[r23];	 Catch:{ IOException -> 0x059c }
        r0 = r22;
        r4 = r4.append(r0);	 Catch:{ IOException -> 0x059c }
        r4 = r4.toString();	 Catch:{ IOException -> 0x059c }
        r15[r16] = r4;	 Catch:{ IOException -> 0x059c }
        r4 = r13.getString(r14, r15);	 Catch:{ IOException -> 0x059c }
        r11.append(r4);	 Catch:{ IOException -> 0x059c }
        if (r18 == 0) goto L_0x027a;
    L_0x0504:
        r4 = r12.A;	 Catch:{ IOException -> 0x059c }
        if (r4 == 0) goto L_0x0513;
    L_0x0508:
        r4 = r12.A;	 Catch:{ IOException -> 0x059e }
        r11.append(r4);	 Catch:{ IOException -> 0x059e }
        r4 = "\n";
        r11.append(r4);	 Catch:{ IOException -> 0x059e }
    L_0x0513:
        r4 = r12.q;	 Catch:{ IOException -> 0x05a0 }
        if (r4 == 0) goto L_0x051e;
    L_0x0517:
        r4 = r12.q;	 Catch:{ IOException -> 0x05a0 }
        r11.append(r4);	 Catch:{ IOException -> 0x05a0 }
        if (r18 == 0) goto L_0x027a;
    L_0x051e:
        r4 = com.whatsapp.App.z();	 Catch:{ IOException -> 0x05a2 }
        r13 = 2131231093; // 0x7f080175 float:1.8078257E38 double:1.0529680664E-314;
        r14 = 1;
        r14 = new java.lang.Object[r14];	 Catch:{ IOException -> 0x05a2 }
        r15 = 0;
        r16 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x05a2 }
        r16.<init>();	 Catch:{ IOException -> 0x05a2 }
        r22 = Y;	 Catch:{ IOException -> 0x05a2 }
        r23 = 528; // 0x210 float:7.4E-43 double:2.61E-321;
        r22 = r22[r23];	 Catch:{ IOException -> 0x05a2 }
        r0 = r16;
        r1 = r22;
        r16 = r0.append(r1);	 Catch:{ IOException -> 0x05a2 }
        r0 = r12.m;	 Catch:{ IOException -> 0x05a2 }
        r22 = r0;
        r0 = r16;
        r1 = r22;
        r16 = r0.append(r1);	 Catch:{ IOException -> 0x05a2 }
        r22 = ",";
        r0 = r16;
        r1 = r22;
        r16 = r0.append(r1);	 Catch:{ IOException -> 0x05a2 }
        r0 = r12.l;	 Catch:{ IOException -> 0x05a2 }
        r22 = r0;
        r0 = r16;
        r1 = r22;
        r16 = r0.append(r1);	 Catch:{ IOException -> 0x05a2 }
        r16 = r16.toString();	 Catch:{ IOException -> 0x05a2 }
        r14[r15] = r16;	 Catch:{ IOException -> 0x05a2 }
        r4 = r4.getString(r13, r14);	 Catch:{ IOException -> 0x05a2 }
        r11.append(r4);	 Catch:{ IOException -> 0x05a2 }
        if (r18 == 0) goto L_0x027a;
    L_0x056e:
        goto L_0x0245;
    L_0x0570:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0572 }
    L_0x0572:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteException -> 0x0433 }
    L_0x0574:
        r4 = move-exception;
        r10.close();	 Catch:{ all -> 0x032c }
        throw r4;	 Catch:{ all -> 0x032c }
    L_0x0579:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteException -> 0x0433 }
    L_0x057b:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x057d }
    L_0x057d:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteException -> 0x0433 }
    L_0x057f:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0581 }
    L_0x0581:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0583 }
    L_0x0583:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x0585 }
    L_0x0585:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteException -> 0x0433 }
    L_0x0587:
        r4 = r12.A;	 Catch:{ SQLiteException -> 0x0433 }
        r23 = Y;	 Catch:{ SQLiteException -> 0x0433 }
        r24 = 534; // 0x216 float:7.48E-43 double:2.64E-321;
        r23 = r23[r24];	 Catch:{ SQLiteException -> 0x0433 }
        r24 = "";
        r0 = r23;
        r1 = r24;
        r4 = r4.replaceAll(r0, r1);	 Catch:{ SQLiteException -> 0x0433 }
        goto L_0x04e3;
    L_0x059c:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x059e }
    L_0x059e:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteException -> 0x0433 }
    L_0x05a0:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x05a2 }
    L_0x05a2:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x05a4 }
    L_0x05a4:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x05a6 }
    L_0x05a6:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteException -> 0x0433 }
    L_0x05a8:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x05aa }
    L_0x05aa:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteException -> 0x0433 }
    L_0x05ac:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteException -> 0x0433 }
    L_0x05ae:
        r4 = move-exception;
        r12 = r4.getMessage();	 Catch:{ IOException -> 0x05d1 }
        if (r12 == 0) goto L_0x05d3;
    L_0x05b5:
        r12 = r4.getMessage();	 Catch:{ IOException -> 0x05d1 }
        r13 = Y;	 Catch:{ IOException -> 0x05d1 }
        r14 = 545; // 0x221 float:7.64E-43 double:2.693E-321;
        r13 = r13[r14];	 Catch:{ IOException -> 0x05d1 }
        r12 = r12.contains(r13);	 Catch:{ IOException -> 0x05d1 }
        if (r12 == 0) goto L_0x05d3;
    L_0x05c5:
        r11 = Y;	 Catch:{ IOException -> 0x05cf }
        r12 = 532; // 0x214 float:7.45E-43 double:2.63E-321;
        r11 = r11[r12];	 Catch:{ IOException -> 0x05cf }
        com.whatsapp.util.Log.e(r11);	 Catch:{ IOException -> 0x05cf }
        throw r4;	 Catch:{ IOException -> 0x05cf }
    L_0x05cf:
        r4 = move-exception;
        throw r4;	 Catch:{ SQLiteException -> 0x0433 }
    L_0x05d1:
        r4 = move-exception;
        throw r4;	 Catch:{ IOException -> 0x05cf }
    L_0x05d3:
        r12 = Y;	 Catch:{ SQLiteException -> 0x0433 }
        r13 = 537; // 0x219 float:7.52E-43 double:2.653E-321;
        r12 = r12[r13];	 Catch:{ SQLiteException -> 0x0433 }
        com.whatsapp.util.Log.b(r12, r4);	 Catch:{ SQLiteException -> 0x0433 }
        goto L_0x029b;
    L_0x05de:
        r4 = move-exception;
        throw r4;	 Catch:{ all -> 0x032c }
    L_0x05e0:
        r4 = move-exception;
        com.whatsapp.util.Log.a(r4);
        goto L_0x02b9;
    L_0x05e6:
        r4 = move-exception;
        r6 = r12;
        goto L_0x0434;
    L_0x05ea:
        r4 = r16;
        goto L_0x0153;
    L_0x05ee:
        r6 = r10;
        goto L_0x015f;
    L_0x05f1:
        r6 = r10;
        goto L_0x0162;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.b(java.lang.String, boolean):java.util.ArrayList");
    }

    public void a() {
        synchronized (this.a) {
            long currentTimeMillis = (System.currentTimeMillis() - 2592000000L) / 1000;
            this.a.getWritableDatabase().delete(Y[262], Y[263], new String[]{String.valueOf(currentTimeMillis)});
        }
    }

    public co a(String str, int i) {
        co coVar = null;
        if (str != null && i >= 0) {
            Cursor rawQuery;
            String str2 = Y[309] + i;
            String[] strArr = new String[]{str};
            synchronized (this.a) {
                rawQuery = this.a.getReadableDatabase().rawQuery(str2, strArr);
            }
            if (rawQuery == null) {
                try {
                    Log.i(Y[308] + str + " " + i);
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
            if (rawQuery.moveToLast()) {
                coVar = a(rawQuery, str);
            } else {
                Log.w(Y[307] + str + " " + i);
            }
            rawQuery.close();
        }
        return coVar;
    }

    public boolean R() {
        boolean z;
        synchronized (this.D) {
            z = this.D.size() > 0;
        }
        return z;
    }

    static void a(ael com_whatsapp_ael, String str, String str2, Long l) {
        com_whatsapp_ael.a(str, str2, l);
    }

    public boolean b(c3 c3Var, int i) {
        co a = a(c3Var);
        if (a == null) {
            try {
                Log.w(Y[376] + c3Var);
                return false;
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        try {
            if (b7.a(a.d, i) >= 0) {
                Log.w(Y[377] + c3Var + Y[378] + a.d + Y[375] + i);
                return false;
            }
            a.d = i;
            if (i == 4) {
                Log.i(Y[374] + (System.currentTimeMillis() - a.b));
            }
            if (!(i == 11 || i == 12)) {
                try {
                    d(a, -1);
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            }
            Message.obtain(this.b, 3, -1, 0, a).sendToTarget();
            return true;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    static void b(ael com_whatsapp_ael, co coVar) {
        com_whatsapp_ael.f(coVar);
    }

    private long n(String str) {
        long j = 1;
        String[] strArr = new String[]{str};
        synchronized (this.a) {
            Cursor rawQuery = this.a.getReadableDatabase().rawQuery(Y[391], strArr);
            if (rawQuery != null) {
                try {
                    Log.i(Y[392] + rawQuery.getCount());
                    if (rawQuery.moveToNext()) {
                        j = rawQuery.getLong(0);
                    }
                    rawQuery.close();
                } catch (Throwable th) {
                    rawQuery.close();
                }
            }
        }
        return j;
    }

    public boolean d() {
        try {
            return b(Y[489], 0) != 0;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean k(com.whatsapp.protocol.co r4) {
        /*
        r0 = e(r4);	 Catch:{ IllegalStateException -> 0x0023 }
        if (r0 != 0) goto L_0x002d;
    L_0x0006:
        r0 = r4.c;	 Catch:{ IllegalStateException -> 0x0025 }
        r1 = 8;
        if (r0 == r1) goto L_0x002d;
    L_0x000c:
        r0 = r4.d;	 Catch:{ IllegalStateException -> 0x0027 }
        r1 = 6;
        if (r0 != r1) goto L_0x0021;
    L_0x0011:
        r0 = r4.z;	 Catch:{ IllegalStateException -> 0x0029 }
        r2 = 18;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 == 0) goto L_0x002d;
    L_0x0019:
        r0 = r4.z;	 Catch:{ IllegalStateException -> 0x002b }
        r2 = 19;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 == 0) goto L_0x002d;
    L_0x0021:
        r0 = 1;
    L_0x0022:
        return r0;
    L_0x0023:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0025 }
    L_0x0025:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0027 }
    L_0x0027:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0029 }
    L_0x0029:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x002b }
    L_0x002b:
        r0 = move-exception;
        throw r0;
    L_0x002d:
        r0 = 0;
        goto L_0x0022;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.k(com.whatsapp.protocol.co):boolean");
    }

    private long b(String str, long j) {
        String u = u(str);
        return u == null ? j : Long.parseLong(u);
    }

    @Nullable
    public File t() {
        return this.t.g();
    }

    public void f(@Nullable String str, boolean z) {
        synchronized (this.a) {
            SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            try {
                String str2;
                contentValues.put(Y[449], Integer.valueOf(0));
                StringBuilder append = new StringBuilder().append(Y[452]);
                if (str != null) {
                    str2 = Y[450];
                } else {
                    str2 = "";
                }
                int update = writableDatabase.update(Y[451], contentValues, append.append(str2).toString(), str != null ? new String[]{"1", str} : new String[]{"1"});
                if (update != 0) {
                    Log.i(Y[448] + update);
                }
                a(new adu(this, str));
            } catch (SQLiteDatabaseCorruptException e) {
                throw e;
            } catch (SQLiteDatabaseCorruptException e2) {
                throw e2;
            } catch (SQLiteDatabaseCorruptException e22) {
                throw e22;
            } catch (Throwable e3) {
                Log.a(e3);
                r();
                throw new AssertionError(e3);
            }
        }
        if (z) {
            try {
                App.a(8, str, 0, 0);
            } catch (SQLiteDatabaseCorruptException e222) {
                throw e222;
            }
        }
        this.O.post(new lk(this, str));
    }

    static boolean a(ael com_whatsapp_ael, co coVar, int i) {
        return com_whatsapp_ael.c(coVar, i);
    }

    public void J() {
        SQLiteDatabase sQLiteDatabase = null;
        Log.i(Y[551]);
        ab abVar = new ab(Y[557]);
        this.z.clear();
        synchronized (this.a) {
            try {
                sQLiteDatabase = this.a.getWritableDatabase();
                sQLiteDatabase.beginTransaction();
                sQLiteDatabase.execSQL(Y[553]);
                sQLiteDatabase.execSQL(Y[559]);
                sQLiteDatabase.execSQL(Y[552]);
                sQLiteDatabase.delete(Y[555], null, null);
                sQLiteDatabase.delete(Y[550], null, null);
                sQLiteDatabase.delete(Y[554], null, null);
                sQLiteDatabase.delete(Y[556], null, null);
                sQLiteDatabase.setTransactionSuccessful();
                if (sQLiteDatabase != null) {
                    if (sQLiteDatabase.inTransaction()) {
                        sQLiteDatabase.endTransaction();
                    }
                }
            } catch (IllegalStateException e) {
                throw e;
            } catch (Throwable th) {
                if (sQLiteDatabase != null) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (IllegalStateException e2) {
                        throw e2;
                    } catch (IllegalStateException e22) {
                        throw e22;
                    }
                }
            }
        }
        Log.i(Y[558] + abVar.b());
        bk.a(dg.i());
        Message.obtain(this.j, 9).sendToTarget();
    }

    public void a(co coVar, int i) {
        f(coVar);
        Message.obtain(this.b, 1, i, 0, coVar).sendToTarget();
    }

    private void d(String str, long j) {
        a(str, String.valueOf(j));
    }

    public int p() {
        return this.L;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.whatsapp.protocol.co j(com.whatsapp.protocol.co r7) {
        /*
        r6 = this;
        r0 = r7.k;	 Catch:{ IllegalStateException -> 0x005b }
        r0 = r0.a;	 Catch:{ IllegalStateException -> 0x005b }
        if (r0 != 0) goto L_0x006b;
    L_0x0006:
        r0 = r7.q;	 Catch:{ IllegalStateException -> 0x005d }
        if (r0 == 0) goto L_0x006b;
    L_0x000a:
        r0 = r7.c;	 Catch:{ IllegalStateException -> 0x005d }
        r0 = com.whatsapp.App.b(r0);	 Catch:{ IllegalStateException -> 0x005d }
        if (r0 == 0) goto L_0x006b;
    L_0x0012:
        r0 = r7.k;
        r1 = r6.a(r0);
        if (r1 == 0) goto L_0x006b;
    L_0x001a:
        r2 = r1.b;	 Catch:{ IllegalStateException -> 0x005f }
        r4 = r7.b;	 Catch:{ IllegalStateException -> 0x005f }
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 >= 0) goto L_0x006b;
    L_0x0022:
        r2 = r1.G;	 Catch:{ IllegalStateException -> 0x0061 }
        r4 = r7.b;	 Catch:{ IllegalStateException -> 0x0061 }
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 >= 0) goto L_0x006b;
    L_0x002a:
        r0 = r7.q;	 Catch:{ IllegalStateException -> 0x0063 }
        r2 = r1.q;	 Catch:{ IllegalStateException -> 0x0063 }
        r0 = r0.equals(r2);	 Catch:{ IllegalStateException -> 0x0063 }
        if (r0 != 0) goto L_0x006b;
    L_0x0034:
        r0 = r7.q;	 Catch:{ IllegalStateException -> 0x0065 }
        r1.q = r0;	 Catch:{ IllegalStateException -> 0x0065 }
        r2 = r7.b;	 Catch:{ IllegalStateException -> 0x0065 }
        r1.G = r2;	 Catch:{ IllegalStateException -> 0x0065 }
        r0 = r1.d;	 Catch:{ IllegalStateException -> 0x0065 }
        r2 = 11;
        if (r0 == r2) goto L_0x0048;
    L_0x0042:
        r0 = r1.d;	 Catch:{ IllegalStateException -> 0x0067 }
        r2 = 12;
        if (r0 != r2) goto L_0x004b;
    L_0x0048:
        r0 = 0;
        r1.d = r0;	 Catch:{ IllegalStateException -> 0x0067 }
    L_0x004b:
        r0 = -1;
        r6.c(r1, r0);
        r0 = r7.Q;
        r0 = (com.whatsapp.MediaData) r0;
        if (r0 == 0) goto L_0x006b;
    L_0x0055:
        r0 = r0.transferred;	 Catch:{ IllegalStateException -> 0x0069 }
        if (r0 != 0) goto L_0x006b;
    L_0x0059:
        r0 = r1;
    L_0x005a:
        return r0;
    L_0x005b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x005d }
    L_0x005d:
        r0 = move-exception;
        throw r0;
    L_0x005f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0061 }
    L_0x0061:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0063 }
    L_0x0063:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0065 }
    L_0x0065:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0067 }
    L_0x0067:
        r0 = move-exception;
        throw r0;
    L_0x0069:
        r0 = move-exception;
        throw r0;
    L_0x006b:
        r0 = 0;
        goto L_0x005a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.j(com.whatsapp.protocol.co):com.whatsapp.protocol.co");
    }

    public long S() {
        return this.t.b();
    }

    private int b(int i) {
        boolean z = l5.s;
        SQLiteDatabase readableDatabase = this.a.getReadableDatabase();
        long b = b(Y[639], 0);
        Cursor rawQuery = readableDatabase.rawQuery(Y[640] + i, new String[]{String.valueOf(b)});
        int i2 = 0;
        if (rawQuery != null) {
            long j;
            long j2;
            readableDatabase.beginTransaction();
            int columnIndex = rawQuery.getColumnIndex(Y[637]);
            int columnIndex2 = rawQuery.getColumnIndex(Y[638]);
            int columnIndex3 = rawQuery.getColumnIndex(Y[635]);
            int columnIndex4 = rawQuery.getColumnIndex(Y[636]);
            int columnIndex5 = rawQuery.getColumnIndex(Y[641]);
            int columnIndex6 = rawQuery.getColumnIndex(Y[642]);
            int i3 = 0;
            b = 0;
            while (rawQuery.moveToNext()) {
                String str;
                Object obj;
                switch (rawQuery.getInt(columnIndex5)) {
                    case v.m /*0*/:
                        try {
                            String string = rawQuery.getString(columnIndex);
                            Object string2 = rawQuery.getString(columnIndex3);
                            if (!TextUtils.isEmpty(string2)) {
                                string = string + " " + string2;
                            }
                            string2 = rawQuery.getString(columnIndex4);
                            if (!TextUtils.isEmpty(string2)) {
                                string = string + " " + string2;
                            }
                            string2 = rawQuery.getString(columnIndex6);
                            if (!TextUtils.isEmpty(string2)) {
                                str = string + " " + string2;
                                break;
                            }
                            str = string;
                            break;
                        } catch (IllegalStateException e) {
                            throw e;
                        } catch (Throwable th) {
                            try {
                                rawQuery.close();
                                if (readableDatabase.inTransaction()) {
                                    readableDatabase.endTransaction();
                                }
                            } catch (IllegalStateException e2) {
                                throw e2;
                            }
                        }
                    case at.g /*1*/:
                    case at.o /*3*/:
                    case Y.l /*9*/:
                        str = rawQuery.getString(columnIndex3);
                        break;
                    case at.p /*4*/:
                    case at.m /*5*/:
                        str = rawQuery.getString(columnIndex4);
                        break;
                    default:
                        obj = null;
                        break;
                }
                b = rawQuery.getLong(columnIndex2);
                if (!TextUtils.isEmpty(obj)) {
                    str = D(obj);
                    ContentValues contentValues = new ContentValues(2);
                    contentValues.put(Y[643], Long.valueOf(b));
                    contentValues.put(Y[645], str);
                    readableDatabase.insert(Y[646], null, contentValues);
                }
                i3++;
                if (z) {
                    j = b;
                    i2 = i3;
                    j2 = j;
                    if (j2 != 0) {
                        d(Y[644], j2);
                    }
                    readableDatabase.setTransactionSuccessful();
                    rawQuery.close();
                    if (readableDatabase.inTransaction()) {
                        readableDatabase.endTransaction();
                    }
                }
            }
            j = b;
            i2 = i3;
            j2 = j;
            if (j2 != 0) {
                d(Y[644], j2);
            }
            readableDatabase.setTransactionSuccessful();
            rawQuery.close();
            if (readableDatabase.inTransaction()) {
                readableDatabase.endTransaction();
            }
        }
        return i2;
    }

    public boolean b(String str) {
        a5w com_whatsapp_a5w = (a5w) this.l.get(str);
        if (com_whatsapp_a5w != null) {
            try {
                if (a5w.i(com_whatsapp_a5w)) {
                    return true;
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        return false;
    }

    public boolean l() {
        Log.i(Y[325]);
        synchronized (this.a) {
            this.a.getWritableDatabase();
            O();
            this.u = true;
        }
        return true;
    }

    public com.whatsapp.auy I(java.lang.String r9) {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:com.whatsapp.ael.I(java.lang.String):com.whatsapp.auy. bs: [B:30:0x0086, B:42:0x0091, B:51:0x00ba]
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
        r8 = this;
        r4 = 0;
        r3 = 1;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = Y;
        r2 = 41;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r9);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = new com.whatsapp.auy;
        r0.<init>();
        if (r9 == 0) goto L_0x002c;
    L_0x0023:
        r1 = "";	 Catch:{ SQLiteDiskIOException -> 0x0047 }
        r1 = r1.equals(r9);	 Catch:{ SQLiteDiskIOException -> 0x0047 }
        if (r1 == 0) goto L_0x004b;
    L_0x002c:
        r1 = new java.lang.StringBuilder;	 Catch:{ SQLiteDiskIOException -> 0x0049 }
        r1.<init>();	 Catch:{ SQLiteDiskIOException -> 0x0049 }
        r2 = Y;	 Catch:{ SQLiteDiskIOException -> 0x0049 }
        r3 = 43;	 Catch:{ SQLiteDiskIOException -> 0x0049 }
        r2 = r2[r3];	 Catch:{ SQLiteDiskIOException -> 0x0049 }
        r1 = r1.append(r2);	 Catch:{ SQLiteDiskIOException -> 0x0049 }
        r1 = r1.append(r9);	 Catch:{ SQLiteDiskIOException -> 0x0049 }
        r1 = r1.toString();	 Catch:{ SQLiteDiskIOException -> 0x0049 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ SQLiteDiskIOException -> 0x0049 }
    L_0x0046:
        return r0;	 Catch:{ SQLiteDiskIOException -> 0x0049 }
    L_0x0047:
        r0 = move-exception;	 Catch:{ SQLiteDiskIOException -> 0x0049 }
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x0049 }
    L_0x0049:
        r0 = move-exception;
        throw r0;
    L_0x004b:
        r1 = new java.lang.String[r3];
        r1[r4] = r9;
        r2 = Y;
        r3 = 42;
        r2 = r2[r3];
        r3 = r8.a;
        monitor-enter(r3);
        r4 = r8.a;	 Catch:{ all -> 0x008b }
        r4 = r4.getReadableDatabase();	 Catch:{ all -> 0x008b }
        r2 = r4.rawQuery(r2, r1);	 Catch:{ all -> 0x008b }
        if (r2 == 0) goto L_0x0084;
    L_0x0064:
        r1 = r2.moveToNext();	 Catch:{ SQLiteDiskIOException -> 0x008e }
        if (r1 == 0) goto L_0x0084;
    L_0x006a:
        r1 = 0;
        r4 = r2.getString(r1);	 Catch:{ SQLiteDiskIOException -> 0x0090 }
        r1 = 0;	 Catch:{ SQLiteDiskIOException -> 0x0090 }
        r5 = 1;	 Catch:{ SQLiteDiskIOException -> 0x0090 }
        r5 = r2.isNull(r5);	 Catch:{ SQLiteDiskIOException -> 0x0090 }
        if (r5 != 0) goto L_0x0080;	 Catch:{ SQLiteDiskIOException -> 0x0090 }
    L_0x0077:
        r1 = 1;	 Catch:{ SQLiteDiskIOException -> 0x0090 }
        r6 = r2.getLong(r1);	 Catch:{ SQLiteDiskIOException -> 0x0090 }
        r1 = java.lang.Long.valueOf(r6);	 Catch:{ SQLiteDiskIOException -> 0x0090 }
    L_0x0080:
        r0.b = r4;	 Catch:{ SQLiteDiskIOException -> 0x0090 }
        r0.a = r1;	 Catch:{ SQLiteDiskIOException -> 0x0090 }
    L_0x0084:
        if (r2 == 0) goto L_0x0089;
    L_0x0086:
        r2.close();	 Catch:{ SQLiteDiskIOException -> 0x00b5 }
    L_0x0089:
        monitor-exit(r3);	 Catch:{ all -> 0x008b }
        goto L_0x0046;	 Catch:{ all -> 0x008b }
    L_0x008b:
        r0 = move-exception;	 Catch:{ all -> 0x008b }
        monitor-exit(r3);	 Catch:{ all -> 0x008b }
        throw r0;
    L_0x008e:
        r1 = move-exception;
        throw r1;	 Catch:{ SQLiteDiskIOException -> 0x0090 }
    L_0x0090:
        r1 = move-exception;
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00b7 }
        r4.<init>();	 Catch:{ all -> 0x00b7 }
        r5 = Y;	 Catch:{ all -> 0x00b7 }
        r6 = 44;	 Catch:{ all -> 0x00b7 }
        r5 = r5[r6];	 Catch:{ all -> 0x00b7 }
        r4 = r4.append(r5);	 Catch:{ all -> 0x00b7 }
        r1 = r1.toString();	 Catch:{ all -> 0x00b7 }
        r1 = r4.append(r1);	 Catch:{ all -> 0x00b7 }
        r1 = r1.toString();	 Catch:{ all -> 0x00b7 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ all -> 0x00b7 }
        if (r2 == 0) goto L_0x0089;
    L_0x00b1:
        r2.close();	 Catch:{ all -> 0x008b }
        goto L_0x0089;	 Catch:{ all -> 0x008b }
    L_0x00b5:
        r0 = move-exception;	 Catch:{ all -> 0x008b }
        throw r0;	 Catch:{ all -> 0x008b }
    L_0x00b7:
        r0 = move-exception;
        if (r2 == 0) goto L_0x00bd;
    L_0x00ba:
        r2.close();	 Catch:{ SQLiteDiskIOException -> 0x00be }
    L_0x00bd:
        throw r0;	 Catch:{ all -> 0x008b }
    L_0x00be:
        r0 = move-exception;	 Catch:{ all -> 0x008b }
        throw r0;	 Catch:{ all -> 0x008b }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.I(java.lang.String):com.whatsapp.auy");
    }

    private ArrayList b(String str, int i, int i2) {
        boolean z = l5.s;
        ArrayList arrayList = new ArrayList();
        Object f = f(str);
        try {
            if (!TextUtils.isEmpty(f)) {
                Cursor rawQuery = this.a.getReadableDatabase().rawQuery(Y[191] + i2, new String[]{f});
                Log.i(Y[185] + str + Y[186] + f);
                ab abVar = new ab(Y[189]);
                if (rawQuery != null) {
                    int columnIndex = rawQuery.getColumnIndex(Y[187]);
                    while (rawQuery.moveToNext()) {
                        long j = rawQuery.getLong(columnIndex);
                        arrayList.add(new q7(a(j), j));
                        if (z) {
                            break;
                        }
                    }
                }
                Log.i(Y[190] + abVar.b() + Y[188] + arrayList.size());
            }
            return arrayList;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void y() {
        long length = X.length();
        Log.i(Y[446] + length + Y[440] + b(Y[447], 0));
        ab abVar = new ab(Y[442]);
        do {
            try {
            } catch (IllegalStateException e) {
                throw e;
            }
        } while (a(2048) == 2048);
        Log.i(Y[443] + abVar.b());
        d(Y[444], 1);
        d(Y[441], 1);
        long length2 = X.length();
        Log.i(Y[445] + length2 + Y[439] + (((double) length2) / ((double) length)));
    }

    static Handler g(ael com_whatsapp_ael) {
        return com_whatsapp_ael.j;
    }

    private void d(java.lang.String r8, boolean r9) {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:com.whatsapp.ael.d(java.lang.String, boolean):void. bs: [B:14:0x0039, B:29:0x0089]
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
        r7 = this;
        r0 = com.whatsapp.l5.s;
        r1 = new com.whatsapp.util.ab;
        r2 = Y;
        r3 = 208; // 0xd0 float:2.91E-43 double:1.03E-321;
        r2 = r2[r3];
        r1.<init>(r2);
        r2 = r7.a;
        monitor-enter(r2);
        r3 = r7.a;	 Catch:{ all -> 0x008d }
        r3 = r3.getReadableDatabase();	 Catch:{ all -> 0x008d }
        r4 = Y;	 Catch:{ all -> 0x008d }
        r5 = 211; // 0xd3 float:2.96E-43 double:1.042E-321;	 Catch:{ all -> 0x008d }
        r4 = r4[r5];	 Catch:{ all -> 0x008d }
        r5 = 1;	 Catch:{ all -> 0x008d }
        r5 = new java.lang.String[r5];	 Catch:{ all -> 0x008d }
        r6 = 0;	 Catch:{ all -> 0x008d }
        r5[r6] = r8;	 Catch:{ all -> 0x008d }
        r3 = r3.rawQuery(r4, r5);	 Catch:{ all -> 0x008d }
        if (r3 == 0) goto L_0x0037;
    L_0x0028:
        r4 = r3.moveToNext();	 Catch:{ SQLiteDiskIOException -> 0x0078 }
        if (r4 == 0) goto L_0x0037;
    L_0x002e:
        r4 = r7.a(r3, r8);	 Catch:{ SQLiteDiskIOException -> 0x007a }
        r7.a(r4, r9);	 Catch:{ SQLiteDiskIOException -> 0x007a }
        if (r0 == 0) goto L_0x0028;
    L_0x0037:
        if (r3 == 0) goto L_0x003c;
    L_0x0039:
        r3.close();	 Catch:{ SQLiteDiskIOException -> 0x0090 }
    L_0x003c:
        monitor-exit(r2);	 Catch:{ all -> 0x008d }
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = Y;
        r3 = 212; // 0xd4 float:2.97E-43 double:1.047E-321;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r0 = r0.append(r8);
        r2 = Y;
        r3 = 209; // 0xd1 float:2.93E-43 double:1.033E-321;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r0 = r0.append(r9);
        r2 = Y;
        r3 = 210; // 0xd2 float:2.94E-43 double:1.04E-321;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r2 = r1.b();
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        return;
    L_0x0078:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x007a }
    L_0x007a:
        r0 = move-exception;
        r1 = com.whatsapp.App.z();	 Catch:{ all -> 0x0086 }
        r4 = 2131231111; // 0x7f080187 float:1.8078294E38 double:1.0529680753E-314;	 Catch:{ all -> 0x0086 }
        com.whatsapp.util.p.a(r1, r4);	 Catch:{ all -> 0x0086 }
        throw r0;	 Catch:{ all -> 0x0086 }
    L_0x0086:
        r0 = move-exception;
        if (r3 == 0) goto L_0x008c;
    L_0x0089:
        r3.close();	 Catch:{ SQLiteDiskIOException -> 0x0092 }
    L_0x008c:
        throw r0;	 Catch:{ all -> 0x008d }
    L_0x008d:
        r0 = move-exception;	 Catch:{ all -> 0x008d }
        monitor-exit(r2);	 Catch:{ all -> 0x008d }
        throw r0;
    L_0x0090:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x008d }
    L_0x0092:
        r0 = move-exception;	 Catch:{ all -> 0x008d }
        throw r0;	 Catch:{ all -> 0x008d }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.d(java.lang.String, boolean):void");
    }

    @Nullable
    private Set a(@NonNull SQLiteDatabase sQLiteDatabase, @NonNull String str, @Nullable String str2) {
        boolean z = l5.s;
        Collection a = a(sQLiteDatabase, str);
        try {
            if (TextUtils.equals(aoy.a(a), str2)) {
                return a;
            }
            Cursor query = sQLiteDatabase.query(Y[430], new String[]{Y[429], Y[425], Y[424], Y[426]}, Y[428], new String[]{str}, null, null, Y[427]);
            do {
                try {
                    if (!query.moveToNext()) {
                        break;
                    }
                    String string = query.getString(0);
                    int i = query.getInt(1);
                    CharSequence string2 = query.getString(2);
                    if (TextUtils.equals(query.getString(3), str2)) {
                        query.close();
                        return a;
                    } else if (!a(a, i, string)) {
                        query.close();
                        return null;
                    } else if (TextUtils.equals(string2, str2) || TextUtils.equals(aoy.a(a), str2)) {
                        query.close();
                        return a;
                    }
                } catch (IllegalStateException e) {
                    throw e;
                } catch (Throwable th) {
                    query.close();
                }
            } while (!z);
            query.close();
            return null;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList a(int r9, int r10, com.whatsapp.a57 r11) {
        /*
        r8 = this;
        r0 = com.whatsapp.l5.s;
        r1 = new java.util.ArrayList;
        r1.<init>();
        r2 = 2;
        r2 = new java.lang.String[r2];
        r3 = 0;
        r4 = java.lang.Integer.toString(r9);
        r2[r3] = r4;
        r3 = 1;
        r4 = java.lang.Integer.toString(r10);
        r2[r3] = r4;
        r3 = r8.a;
        monitor-enter(r3);
        r4 = r8.a;	 Catch:{ all -> 0x00a0 }
        r4 = r4.getReadableDatabase();	 Catch:{ all -> 0x00a0 }
        r5 = Y;	 Catch:{ all -> 0x00a0 }
        r6 = 68;
        r5 = r5[r6];	 Catch:{ all -> 0x00a0 }
        r2 = r4.rawQuery(r5, r2);	 Catch:{ all -> 0x00a0 }
        if (r2 == 0) goto L_0x0064;
    L_0x002d:
        r4 = Y;	 Catch:{ all -> 0x00a0 }
        r5 = 67;
        r4 = r4[r5];	 Catch:{ all -> 0x00a0 }
        r4 = r2.getColumnIndex(r4);	 Catch:{ all -> 0x00a0 }
    L_0x0037:
        r5 = r2.moveToNext();	 Catch:{ SQLiteDiskIOException -> 0x008f }
        if (r5 == 0) goto L_0x005f;
    L_0x003d:
        if (r11 == 0) goto L_0x0045;
    L_0x003f:
        r5 = r11.a();	 Catch:{ SQLiteDiskIOException -> 0x008d }
        if (r5 != 0) goto L_0x005f;
    L_0x0045:
        r5 = r2.getString(r4);	 Catch:{ SQLiteDiskIOException -> 0x008f }
        if (r5 != 0) goto L_0x0056;
    L_0x004b:
        r6 = Y;	 Catch:{ SQLiteDiskIOException -> 0x00a3 }
        r7 = 64;
        r6 = r6[r7];	 Catch:{ SQLiteDiskIOException -> 0x00a3 }
        com.whatsapp.util.Log.w(r6);	 Catch:{ SQLiteDiskIOException -> 0x00a3 }
        if (r0 == 0) goto L_0x0037;
    L_0x0056:
        r5 = r8.a(r2, r5);	 Catch:{ SQLiteDiskIOException -> 0x008f }
        r1.add(r5);	 Catch:{ SQLiteDiskIOException -> 0x008f }
        if (r0 == 0) goto L_0x0037;
    L_0x005f:
        r2.close();	 Catch:{ all -> 0x00a0 }
        if (r0 == 0) goto L_0x006d;
    L_0x0064:
        r0 = Y;	 Catch:{ SQLiteDiskIOException -> 0x00a5 }
        r2 = 65;
        r0 = r0[r2];	 Catch:{ SQLiteDiskIOException -> 0x00a5 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ SQLiteDiskIOException -> 0x00a5 }
    L_0x006d:
        monitor-exit(r3);	 Catch:{ all -> 0x00a0 }
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = Y;
        r3 = 66;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r2 = r1.size();
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        return r1;
    L_0x008d:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x008f }
    L_0x008f:
        r0 = move-exception;
        r1 = com.whatsapp.App.z();	 Catch:{ all -> 0x009b }
        r4 = 2131231111; // 0x7f080187 float:1.8078294E38 double:1.0529680753E-314;
        com.whatsapp.util.p.a(r1, r4);	 Catch:{ all -> 0x009b }
        throw r0;	 Catch:{ all -> 0x009b }
    L_0x009b:
        r0 = move-exception;
        r2.close();	 Catch:{ all -> 0x00a0 }
        throw r0;	 Catch:{ all -> 0x00a0 }
    L_0x00a0:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x00a0 }
        throw r0;
    L_0x00a3:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x008f }
    L_0x00a5:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00a0 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.a(int, int, com.whatsapp.a57):java.util.ArrayList");
    }

    private SQLiteStatement a(SQLiteStatement sQLiteStatement, String str) {
        if (sQLiteStatement != null) {
            try {
                sQLiteStatement.close();
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        return this.a.getWritableDatabase().compileStatement(str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.whatsapp.axj a(boolean r6, com.whatsapp.gj r7) {
        /*
        r5 = this;
        r1 = 0;
        r2 = com.whatsapp.axj.FAILED;
        r3 = r5.a;
        monitor-enter(r3);
        r0 = r5.t;	 Catch:{ all -> 0x005c }
        r0.a(r7);	 Catch:{ all -> 0x005c }
        r0 = Y;	 Catch:{ all -> 0x005c }
        r4 = 70;
        r0 = r0[r4];	 Catch:{ all -> 0x005c }
        com.whatsapp.util.Log.i(r0);	 Catch:{ all -> 0x005c }
        r0 = r5.u;	 Catch:{ all -> 0x005c }
        if (r0 != 0) goto L_0x006b;
    L_0x0018:
        r5.r();	 Catch:{ IllegalStateException -> 0x005a }
        if (r6 == 0) goto L_0x005f;
    L_0x001d:
        r0 = r5.t;	 Catch:{ IllegalStateException -> 0x005a }
        r0 = r0.e();	 Catch:{ IllegalStateException -> 0x005a }
    L_0x0023:
        if (r6 == 0) goto L_0x002a;
    L_0x0025:
        r1 = r0 * 100;
        r0 = r0 + 1;
        r1 = r1 / r0;
    L_0x002a:
        if (r6 == 0) goto L_0x0069;
    L_0x002c:
        r0 = r5.t;	 Catch:{ IllegalStateException -> 0x0063 }
        r0 = r0.a(r5, r1);	 Catch:{ IllegalStateException -> 0x0063 }
        if (r0 == 0) goto L_0x0069;
    L_0x0034:
        r0 = r5.D();	 Catch:{ IllegalStateException -> 0x0065 }
        if (r0 == 0) goto L_0x0069;
    L_0x003a:
        r5.O();	 Catch:{ all -> 0x005c }
        r0 = r5.a;	 Catch:{ all -> 0x005c }
        com.whatsapp.a5f.e(r0);	 Catch:{ all -> 0x005c }
        r0 = r5.a;	 Catch:{ all -> 0x005c }
        com.whatsapp.a5f.d(r0);	 Catch:{ all -> 0x005c }
        r0 = com.whatsapp.axj.SUCCESS_RESTORED;	 Catch:{ all -> 0x005c }
        r1 = 1;
        r5.u = r1;	 Catch:{ IllegalStateException -> 0x0067 }
        r1 = com.whatsapp.l5.s;	 Catch:{ IllegalStateException -> 0x0067 }
        if (r1 == 0) goto L_0x0058;
    L_0x0050:
        r1 = r5.l();	 Catch:{ IllegalStateException -> 0x0067 }
        if (r1 == 0) goto L_0x0058;
    L_0x0056:
        r0 = com.whatsapp.axj.SUCCESS_CREATED;	 Catch:{ all -> 0x005c }
    L_0x0058:
        monitor-exit(r3);	 Catch:{ all -> 0x005c }
        return r0;
    L_0x005a:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x005c }
    L_0x005c:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x005c }
        throw r0;
    L_0x005f:
        r0 = r1;
        goto L_0x0023;
    L_0x0061:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x005c }
    L_0x0063:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0065 }
    L_0x0065:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x005c }
    L_0x0067:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x005c }
    L_0x0069:
        r0 = r2;
        goto L_0x0050;
    L_0x006b:
        r0 = r2;
        goto L_0x0058;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.a(boolean, com.whatsapp.gj):com.whatsapp.axj");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b(java.lang.String r11, com.whatsapp.protocol.co r12) {
        /*
        r10 = this;
        r0 = 1;
        r2 = com.whatsapp.l5.s;
        r3 = r10.a;
        monitor-enter(r3);
        r4 = r10.c(r11);	 Catch:{ all -> 0x0057 }
        r1 = r12.k;	 Catch:{ all -> 0x0057 }
        r1 = r1.c;	 Catch:{ all -> 0x0057 }
        r1 = com.whatsapp.l5.e(r1);	 Catch:{ all -> 0x0057 }
        if (r1 == 0) goto L_0x0022;
    L_0x0014:
        r1 = r12.t;	 Catch:{ all -> 0x0057 }
        r5 = ",";
        r1 = r1.split(r5);	 Catch:{ all -> 0x0057 }
        r1 = r1.length;	 Catch:{ all -> 0x0057 }
        r1 = r1 + 1;
        if (r2 == 0) goto L_0x0023;
    L_0x0022:
        r1 = r0;
    L_0x0023:
        if (r4 != 0) goto L_0x0039;
    L_0x0025:
        r5 = r10.e;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0053 }
        r6 = 1;
        r5.bindString(r6, r11);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0053 }
        r5 = r10.e;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0053 }
        r6 = 2;
        r8 = (long) r1;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0053 }
        r5.bindLong(r6, r8);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0053 }
        r5 = r10.e;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0053 }
        r5.execute();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0053 }
        if (r2 == 0) goto L_0x004c;
    L_0x0039:
        r2 = r10.S;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0055 }
        r5 = 1;
        r1 = r1 + r4;
        r6 = (long) r1;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0055 }
        r2.bindLong(r5, r6);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0055 }
        r1 = r10.S;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0055 }
        r2 = 2;
        r1.bindString(r2, r11);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0055 }
        r1 = r10.S;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0055 }
        r1.execute();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0055 }
    L_0x004c:
        r1 = r10.S;	 Catch:{ SQLiteDatabaseCorruptException -> 0x005a }
        r1.execute();	 Catch:{ SQLiteDatabaseCorruptException -> 0x005a }
        monitor-exit(r3);	 Catch:{ all -> 0x0057 }
    L_0x0052:
        return r0;
    L_0x0053:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0055 }
    L_0x0055:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0057 }
    L_0x0057:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0057 }
        throw r0;
    L_0x005a:
        r0 = move-exception;
        r1 = Y;	 Catch:{ all -> 0x0057 }
        r2 = 729; // 0x2d9 float:1.022E-42 double:3.6E-321;
        r1 = r1[r2];	 Catch:{ all -> 0x0057 }
        com.whatsapp.util.Log.b(r1, r0);	 Catch:{ all -> 0x0057 }
        r0 = 0;
        monitor-exit(r3);	 Catch:{ all -> 0x0057 }
        goto L_0x0052;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.b(java.lang.String, com.whatsapp.protocol.co):boolean");
    }

    public boolean J(String str) {
        return E(str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.whatsapp.j3 a(boolean r13, boolean r14, @android.support.annotation.Nullable com.whatsapp.gdrive.d9 r15) {
        /*
        r12 = this;
        r3 = com.whatsapp.l5.s;
        r0 = Y;
        r1 = 76;
        r0 = r0[r1];
        r4 = com.whatsapp.tp.a(r0);
        r4.e();
        r0 = com.whatsapp.ve.E();
        if (r0 != 0) goto L_0x0023;
    L_0x0015:
        r0 = Y;	 Catch:{ Exception -> 0x0021 }
        r1 = 91;
        r0 = r0[r1];	 Catch:{ Exception -> 0x0021 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ Exception -> 0x0021 }
        r0 = com.whatsapp.j3.FAILED_INVALID;	 Catch:{ Exception -> 0x0021 }
    L_0x0020:
        return r0;
    L_0x0021:
        r0 = move-exception;
        throw r0;
    L_0x0023:
        r1 = com.whatsapp.j3.FAILED_GENERIC;
        r5 = r12.a;
        monitor-enter(r5);
        r0 = X;	 Catch:{ all -> 0x019a }
        r2 = Y;	 Catch:{ all -> 0x019a }
        r6 = 78;
        r2 = r2[r6];	 Catch:{ all -> 0x019a }
        b(r0, r2);	 Catch:{ all -> 0x019a }
        r0 = r12.a;	 Catch:{ all -> 0x019a }
        com.whatsapp.a5f.e(r0);	 Catch:{ all -> 0x019a }
        r0 = r12.a;	 Catch:{ all -> 0x019a }
        com.whatsapp.a5f.d(r0);	 Catch:{ all -> 0x019a }
        r0 = r12.a;	 Catch:{ all -> 0x019a }
        com.whatsapp.a5f.a(r0);	 Catch:{ all -> 0x019a }
        r0 = r12.a;	 Catch:{ all -> 0x019a }
        r0.close();	 Catch:{ all -> 0x019a }
        r0 = X;	 Catch:{ all -> 0x019a }
        r2 = Y;	 Catch:{ all -> 0x019a }
        r6 = 90;
        r2 = r2[r6];	 Catch:{ all -> 0x019a }
        b(r0, r2);	 Catch:{ all -> 0x019a }
        if (r14 == 0) goto L_0x00be;
    L_0x0054:
        r0 = X;	 Catch:{ all -> 0x019a }
        r2 = c(r0);	 Catch:{ all -> 0x019a }
        if (r2 != 0) goto L_0x0194;
    L_0x005c:
        r0 = -1;
    L_0x005d:
        r6 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0198 }
        r6.<init>();	 Catch:{ Exception -> 0x0198 }
        r7 = Y;	 Catch:{ Exception -> 0x0198 }
        r8 = 75;
        r7 = r7[r8];	 Catch:{ Exception -> 0x0198 }
        r6 = r6.append(r7);	 Catch:{ Exception -> 0x0198 }
        r6 = r6.append(r0);	 Catch:{ Exception -> 0x0198 }
        if (r2 == 0) goto L_0x019d;
    L_0x0072:
        r7 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0198 }
        r7.<init>();	 Catch:{ Exception -> 0x0198 }
        r8 = Y;	 Catch:{ Exception -> 0x0198 }
        r9 = 73;
        r8 = r8[r9];	 Catch:{ Exception -> 0x0198 }
        r7 = r7.append(r8);	 Catch:{ Exception -> 0x0198 }
        r8 = r2.a;	 Catch:{ Exception -> 0x0198 }
        r8 = r8.size();	 Catch:{ Exception -> 0x0198 }
        r7 = r7.append(r8);	 Catch:{ Exception -> 0x0198 }
        r8 = Y;	 Catch:{ Exception -> 0x0198 }
        r9 = 81;
        r8 = r8[r9];	 Catch:{ Exception -> 0x0198 }
        r7 = r7.append(r8);	 Catch:{ Exception -> 0x0198 }
        r2 = r2.b;	 Catch:{ Exception -> 0x0198 }
        r2 = r2.size();	 Catch:{ Exception -> 0x0198 }
        r2 = r7.append(r2);	 Catch:{ Exception -> 0x0198 }
        r2 = r2.toString();	 Catch:{ Exception -> 0x0198 }
    L_0x00a3:
        r2 = r6.append(r2);	 Catch:{ Exception -> 0x01a2 }
        r2 = r2.toString();	 Catch:{ Exception -> 0x01a2 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ Exception -> 0x01a2 }
        if (r0 != 0) goto L_0x01a4;
    L_0x00b0:
        r0 = 1;
    L_0x00b1:
        r2 = com.whatsapp.App.z();	 Catch:{ all -> 0x019a }
        r6 = com.whatsapp.fieldstats.bn.DATABASE_INTEGRITY_CHECK_RESULT;	 Catch:{ all -> 0x019a }
        r0 = java.lang.Boolean.valueOf(r0);	 Catch:{ all -> 0x019a }
        com.whatsapp.fieldstats.i.a(r2, r6, r0);	 Catch:{ all -> 0x019a }
    L_0x00be:
        r0 = r12.t;	 Catch:{ Exception -> 0x01a7 }
        r2 = r12.a;	 Catch:{ Exception -> 0x01a7 }
        r0 = r0.a(r13, r2, r15);	 Catch:{ Exception -> 0x01a7 }
    L_0x00c6:
        r1 = r12.a;	 Catch:{ Exception -> 0x01c9 }
        r1.getWritableDatabase();	 Catch:{ Exception -> 0x01c9 }
        r12.P();	 Catch:{ Exception -> 0x01c9 }
        r1 = M;	 Catch:{ Exception -> 0x01c9 }
        if (r1 == 0) goto L_0x0130;
    L_0x00d2:
        r1 = r12.I();	 Catch:{ Exception -> 0x01c9 }
        if (r1 != 0) goto L_0x0130;
    L_0x00d8:
        r1 = r12.G;	 Catch:{ all -> 0x019a }
        r2 = Y;	 Catch:{ all -> 0x019a }
        r6 = 87;
        r2 = r2[r6];	 Catch:{ all -> 0x019a }
        r6 = 0;
        r1 = r1.getSharedPreferences(r2, r6);	 Catch:{ all -> 0x019a }
        r2 = Y;	 Catch:{ all -> 0x019a }
        r6 = 82;
        r2 = r2[r6];	 Catch:{ all -> 0x019a }
        r6 = 0;
        r2 = r1.getInt(r2, r6);	 Catch:{ all -> 0x019a }
        r6 = 5;
        if (r2 >= r6) goto L_0x0130;
    L_0x00f3:
        r6 = Y;	 Catch:{ all -> 0x019a }
        r7 = 79;
        r6 = r6[r7];	 Catch:{ all -> 0x019a }
        r8 = 0;
        r6 = r1.getLong(r6, r8);	 Catch:{ all -> 0x019a }
        r8 = Y;	 Catch:{ all -> 0x019a }
        r9 = 86;
        r8 = r8[r9];	 Catch:{ all -> 0x019a }
        r10 = 0;
        r8 = r12.b(r8, r10);	 Catch:{ all -> 0x019a }
        r10 = r1.edit();	 Catch:{ all -> 0x019a }
        r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1));
        if (r1 != 0) goto L_0x0117;
    L_0x0113:
        r1 = r2 + 1;
        if (r3 == 0) goto L_0x0121;
    L_0x0117:
        r1 = 0;
        r2 = Y;	 Catch:{ all -> 0x019a }
        r6 = 77;
        r2 = r2[r6];	 Catch:{ all -> 0x019a }
        r10.putLong(r2, r8);	 Catch:{ all -> 0x019a }
    L_0x0121:
        r2 = Y;	 Catch:{ all -> 0x019a }
        r6 = 92;
        r2 = r2[r6];	 Catch:{ all -> 0x019a }
        r10.putInt(r2, r1);	 Catch:{ all -> 0x019a }
        r10.commit();	 Catch:{ all -> 0x019a }
        r12.o();	 Catch:{ all -> 0x019a }
    L_0x0130:
        r1 = r12.d();	 Catch:{ all -> 0x019a }
        if (r1 != 0) goto L_0x018e;
    L_0x0136:
        r1 = r12.G;	 Catch:{ all -> 0x019a }
        r2 = Y;	 Catch:{ all -> 0x019a }
        r6 = 83;
        r2 = r2[r6];	 Catch:{ all -> 0x019a }
        r6 = 0;
        r1 = r1.getSharedPreferences(r2, r6);	 Catch:{ all -> 0x019a }
        r2 = Y;	 Catch:{ all -> 0x019a }
        r6 = 85;
        r2 = r2[r6];	 Catch:{ all -> 0x019a }
        r6 = 0;
        r2 = r1.getInt(r2, r6);	 Catch:{ all -> 0x019a }
        r6 = 5;
        if (r2 >= r6) goto L_0x018e;
    L_0x0151:
        r6 = Y;	 Catch:{ all -> 0x019a }
        r7 = 80;
        r6 = r6[r7];	 Catch:{ all -> 0x019a }
        r8 = 0;
        r6 = r1.getLong(r6, r8);	 Catch:{ all -> 0x019a }
        r8 = Y;	 Catch:{ all -> 0x019a }
        r9 = 89;
        r8 = r8[r9];	 Catch:{ all -> 0x019a }
        r10 = 0;
        r8 = r12.b(r8, r10);	 Catch:{ all -> 0x019a }
        r10 = r1.edit();	 Catch:{ all -> 0x019a }
        r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1));
        if (r1 != 0) goto L_0x0175;
    L_0x0171:
        r1 = r2 + 1;
        if (r3 == 0) goto L_0x017f;
    L_0x0175:
        r1 = 0;
        r2 = Y;	 Catch:{ all -> 0x019a }
        r3 = 84;
        r2 = r2[r3];	 Catch:{ all -> 0x019a }
        r10.putLong(r2, r8);	 Catch:{ all -> 0x019a }
    L_0x017f:
        r2 = Y;	 Catch:{ all -> 0x019a }
        r3 = 74;
        r2 = r2[r3];	 Catch:{ all -> 0x019a }
        r10.putInt(r2, r1);	 Catch:{ all -> 0x019a }
        r10.commit();	 Catch:{ all -> 0x019a }
        r12.y();	 Catch:{ all -> 0x019a }
    L_0x018e:
        monitor-exit(r5);	 Catch:{ all -> 0x019a }
        r4.d();
        goto L_0x0020;
    L_0x0194:
        r0 = r2.c;	 Catch:{ all -> 0x019a }
        goto L_0x005d;
    L_0x0198:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x019a }
    L_0x019a:
        r0 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x019a }
        throw r0;
    L_0x019d:
        r2 = "";
        goto L_0x00a3;
    L_0x01a2:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x019a }
    L_0x01a4:
        r0 = 0;
        goto L_0x00b1;
    L_0x01a7:
        r0 = move-exception;
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x019a }
        r2.<init>();	 Catch:{ all -> 0x019a }
        r6 = Y;	 Catch:{ all -> 0x019a }
        r7 = 88;
        r6 = r6[r7];	 Catch:{ all -> 0x019a }
        r2 = r2.append(r6);	 Catch:{ all -> 0x019a }
        r0 = r0.toString();	 Catch:{ all -> 0x019a }
        r0 = r2.append(r0);	 Catch:{ all -> 0x019a }
        r0 = r0.toString();	 Catch:{ all -> 0x019a }
        com.whatsapp.util.Log.w(r0);	 Catch:{ all -> 0x019a }
        r0 = r1;
        goto L_0x00c6;
    L_0x01c9:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x019a }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.a(boolean, boolean, com.whatsapp.gdrive.d9):com.whatsapp.j3");
    }

    public void a(c_ c_Var) {
        try {
            this.n.registerObserver(c_Var);
        } catch (IllegalStateException e) {
        }
    }

    private static boolean e(co coVar) {
        try {
            if (coVar.x) {
                if (coVar.k.a) {
                    try {
                        if (!l5.g(coVar.k.c)) {
                            return true;
                        }
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
            }
            return false;
        } catch (IllegalStateException e2) {
            throw e2;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    private boolean a(Collection collection, int i, String str) {
        switch (i) {
            case at.g /*1*/:
                try {
                    collection.removeAll(Arrays.asList(TextUtils.split(str, ",")));
                    return true;
                } catch (IllegalStateException e) {
                    throw e;
                }
            case at.i /*2*/:
                collection.addAll(Arrays.asList(TextUtils.split(str, ",")));
                return true;
            case at.o /*3*/:
                String[] split = TextUtils.split(str, ",");
                try {
                    if (split.length != 2) {
                        return false;
                    }
                    collection.remove(split[1]);
                    collection.add(split[0]);
                    return true;
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            default:
                return false;
        }
    }

    public ArrayList a(String str, long j) {
        boolean z = l5.s;
        new ab().b(Y[265]);
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        long timeInMillis = 86400000 + instance.getTimeInMillis();
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = this.a.getReadableDatabase().rawQuery(i, new String[]{str, String.valueOf(4), String.valueOf(r2), String.valueOf(timeInMillis)});
        if (rawQuery != null) {
            do {
                try {
                    if (!rawQuery.moveToNext()) {
                        break;
                    }
                    arrayList.add(a(rawQuery, str));
                } catch (IllegalStateException e) {
                    Log.i(Y[264] + e.toString());
                    rawQuery.close();
                } catch (SQLiteDatabaseCorruptException e2) {
                    r();
                    throw new AssertionError(e2);
                } catch (SQLiteFullException e3) {
                    p.a(App.z());
                    throw e3;
                } catch (Throwable th) {
                    rawQuery.close();
                }
            } while (!z);
            rawQuery.close();
        }
        return arrayList;
    }

    public ArrayList K() {
        boolean z = l5.s;
        ab abVar = new ab();
        abVar.b(Y[590]);
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = this.a.getReadableDatabase().rawQuery(g, new String[]{String.valueOf(1415214000000L)});
        if (rawQuery != null) {
            int columnIndex = rawQuery.getColumnIndex(Y[595]);
            while (rawQuery.moveToNext()) {
                try {
                    String string = rawQuery.getString(columnIndex);
                    if (string == null) {
                        Log.w(Y[591]);
                        if (!z) {
                            continue;
                        }
                    }
                    if (App.C(string) || z) {
                        co a = a(rawQuery, string);
                        arrayList.add(new q7(a, a.I));
                        if (z) {
                            break;
                        }
                    }
                } catch (IllegalStateException e) {
                    throw e;
                } catch (SQLiteDatabaseCorruptException e2) {
                    r();
                    throw new AssertionError(e2);
                } catch (SQLiteFullException e3) {
                    p.a(App.z());
                    throw e3;
                } catch (IllegalStateException e4) {
                    throw e4;
                } catch (IllegalStateException e42) {
                    Log.i(Y[592] + e42.toString());
                    rawQuery.close();
                } catch (Throwable th) {
                    rawQuery.close();
                }
            }
            rawQuery.close();
        }
        Log.i(Y[593] + arrayList.size() + Y[594] + abVar.b());
        return arrayList;
    }

    static cn f(ael com_whatsapp_ael) {
        return com_whatsapp_ael.U;
    }

    public boolean I() {
        try {
            return b(Y[598], 0) != 0;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public ael(Context context) {
        boolean z = l5.s;
        this.H = false;
        this.N = false;
        this.u = false;
        this.U = new cn(null);
        this.n = new uz();
        this.l = new ConcurrentHashMap();
        this.p = new bf(250);
        this.f = new bf(250);
        this.z = new ConcurrentHashMap();
        this.P = new AtomicBoolean();
        this.T = new aa(this, Looper.getMainLooper());
        this.O = new a2(this, Looper.getMainLooper());
        this.j = new aah(this, Looper.getMainLooper());
        this.R = new HashMap();
        this.v = new HandlerThread(Y[549]);
        this.v.start();
        this.b = new mq(this, this.v.getLooper(), null);
        this.G = context;
        this.t = new azf(this.G);
        this.a = new a5f(context);
        this.D = new ArrayList();
        this.o = new Hashtable();
        if (z) {
            WAAppCompatActivity.c++;
        }
    }

    public co m(String str) {
        if (str == null) {
            try {
                Log.e(Y[569]);
                return null;
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        a5w com_whatsapp_a5w = (a5w) this.l.get(str);
        if (com_whatsapp_a5w == null) {
            try {
                Log.w(Y[570] + str);
                return null;
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }
        try {
            if (a5w.c(com_whatsapp_a5w) != null) {
                return a5w.c(com_whatsapp_a5w);
            }
            a5w.a(com_whatsapp_a5w, r(str));
            return a5w.c(com_whatsapp_a5w);
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String B() {
        /*
        r9 = this;
        r6 = 1;
        r5 = 0;
        r7 = 0;
        r8 = com.whatsapp.l5.s;
        r0 = r9.a;
        r0 = r0.getReadableDatabase();
        r1 = Y;
        r2 = 438; // 0x1b6 float:6.14E-43 double:2.164E-321;
        r1 = r1[r2];
        r2 = new java.lang.String[r6];
        r3 = Y;
        r4 = 434; // 0x1b2 float:6.08E-43 double:2.144E-321;
        r3 = r3[r4];
        r2[r7] = r3;
        r3 = Y;
        r4 = 436; // 0x1b4 float:6.11E-43 double:2.154E-321;
        r3 = r3[r4];
        r4 = new java.lang.String[r6];
        r6 = java.lang.Integer.toString(r7);
        r4[r7] = r6;
        r6 = r5;
        r7 = r5;
        r1 = r0.query(r1, r2, r3, r4, r5, r6, r7);
        r0 = Y;	 Catch:{ NoSuchAlgorithmException -> 0x005e }
        r2 = 435; // 0x1b3 float:6.1E-43 double:2.15E-321;
        r0 = r0[r2];	 Catch:{ NoSuchAlgorithmException -> 0x005e }
        r0 = java.security.MessageDigest.getInstance(r0);	 Catch:{ NoSuchAlgorithmException -> 0x005e }
    L_0x0039:
        r2 = r1.moveToNext();	 Catch:{ NoSuchAlgorithmException -> 0x005e }
        if (r2 == 0) goto L_0x004f;
    L_0x003f:
        r2 = 0;
        r2 = r1.getString(r2);	 Catch:{ NoSuchAlgorithmException -> 0x005e }
        if (r2 == 0) goto L_0x004d;
    L_0x0046:
        r2 = r2.getBytes();	 Catch:{ NoSuchAlgorithmException -> 0x005c }
        r0.update(r2);	 Catch:{ NoSuchAlgorithmException -> 0x005c }
    L_0x004d:
        if (r8 == 0) goto L_0x0039;
    L_0x004f:
        r0 = r0.digest();	 Catch:{ NoSuchAlgorithmException -> 0x005e }
        r1.close();
    L_0x0056:
        r1 = 2;
        r0 = android.backport.util.Base64.encodeToString(r0, r1);
        return r0;
    L_0x005c:
        r0 = move-exception;
        throw r0;	 Catch:{ NoSuchAlgorithmException -> 0x005e }
    L_0x005e:
        r0 = move-exception;
        r0 = Y;	 Catch:{ all -> 0x006f }
        r2 = 437; // 0x1b5 float:6.12E-43 double:2.16E-321;
        r0 = r0[r2];	 Catch:{ all -> 0x006f }
        com.whatsapp.util.Log.e(r0);	 Catch:{ all -> 0x006f }
        r0 = 0;
        r0 = new byte[r0];	 Catch:{ all -> 0x006f }
        r1.close();
        goto L_0x0056;
    L_0x006f:
        r0 = move-exception;
        r1.close();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.B():java.lang.String");
    }

    public void b() {
        synchronized (this.D) {
            this.D.clear();
        }
    }

    static void a(ael com_whatsapp_ael, co coVar, String str, int i, long j) {
        com_whatsapp_ael.a(coVar, str, i, j);
    }

    private String u(String str) {
        try {
            if (this.R.containsKey(str)) {
                return (String) this.R.get(str);
            }
            String str2 = null;
            Cursor rawQuery = this.a.getReadableDatabase().rawQuery(Y[597], new String[]{str});
            if (rawQuery != null) {
                try {
                    if (rawQuery.moveToNext()) {
                        str2 = rawQuery.getString(0);
                    }
                    rawQuery.close();
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
            this.R.put(str, str2);
            Log.i(Y[596] + str + ":" + str2);
            return str2;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    private boolean l(String str) {
        ab abVar = new ab(Y[55]);
        d(str, false);
        String[] strArr = new String[]{str};
        SQLiteDatabase sQLiteDatabase = null;
        synchronized (this.a) {
            try {
                sQLiteDatabase = this.a.getWritableDatabase();
                sQLiteDatabase.beginTransaction();
                sQLiteDatabase.execSQL(Y[61], strArr);
                sQLiteDatabase.execSQL(Y[59], strArr);
                sQLiteDatabase.execSQL(Y[57], strArr);
                this.l.remove(str);
                sQLiteDatabase.delete(Y[62], Y[60], strArr);
                sQLiteDatabase.setTransactionSuccessful();
                if (sQLiteDatabase != null) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (IllegalStateException e) {
                        throw e;
                    } catch (IllegalStateException e2) {
                        throw e2;
                    }
                }
            } catch (Throwable th) {
                if (sQLiteDatabase != null) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (IllegalStateException e22) {
                        throw e22;
                    } catch (IllegalStateException e222) {
                        throw e222;
                    }
                }
            }
        }
        Log.i(Y[58] + str + Y[56] + true + Y[54] + abVar.b());
        return true;
    }

    public static int q(String str) {
        boolean z = l5.s;
        if (str == null) {
            return 0;
        }
        Iterator it = App.aK.C().iterator();
        int i = 0;
        while (it.hasNext()) {
            try {
                int i2 = str.equals(((co) it.next()).k.c) ? i + 1 : i;
                if (z) {
                    return i2;
                }
                i = i2;
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        return i;
    }

    public void a(akc com_whatsapp_akc) {
        this.U.unregisterObserver(com_whatsapp_akc);
    }

    private static String f(String str, String str2) {
        return str + "." + str2.replaceAll(Y[701], "," + str + ".");
    }

    public void c(String str, boolean z) {
        a(str, z, true);
    }

    public int y(String str) {
        a5w com_whatsapp_a5w = (a5w) this.l.get(str);
        if (com_whatsapp_a5w == null) {
            return 0;
        }
        return a5w.f(com_whatsapp_a5w);
    }

    public boolean E(String str) {
        boolean z = true;
        ContentValues contentValues = new ContentValues();
        contentValues.put(Y[479], Integer.valueOf(0));
        synchronized (this.a) {
            if (this.a.getWritableDatabase().update(Y[480], contentValues, Y[481], new String[]{str, String.valueOf(14)}) <= 0) {
                z = false;
            }
            if (z) {
                try {
                    a(new awi(this, str));
                    this.P.set(false);
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
        }
        return z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void u() {
        /*
        r12 = this;
        r1 = com.whatsapp.l5.s;
        r0 = Y;
        r2 = 692; // 0x2b4 float:9.7E-43 double:3.42E-321;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        r2 = r12.a;
        monitor-enter(r2);
        r0 = r12.N;	 Catch:{ all -> 0x0129 }
        if (r0 == 0) goto L_0x0014;
    L_0x0012:
        monitor-exit(r2);	 Catch:{ all -> 0x0129 }
    L_0x0013:
        return;
    L_0x0014:
        r0 = r12.a;	 Catch:{ all -> 0x0129 }
        r0 = r0.getReadableDatabase();	 Catch:{ all -> 0x0129 }
        r3 = Y;	 Catch:{ all -> 0x0129 }
        r4 = 690; // 0x2b2 float:9.67E-43 double:3.41E-321;
        r3 = r3[r4];	 Catch:{ all -> 0x0129 }
        r4 = 0;
        r3 = r0.rawQuery(r3, r4);	 Catch:{ all -> 0x0129 }
        if (r3 == 0) goto L_0x00f5;
    L_0x0027:
        r0 = Y;	 Catch:{ all -> 0x0129 }
        r4 = 696; // 0x2b8 float:9.75E-43 double:3.44E-321;
        r0 = r0[r4];	 Catch:{ all -> 0x0129 }
        r4 = r3.getColumnIndexOrThrow(r0);	 Catch:{ all -> 0x0129 }
    L_0x0031:
        r0 = r3.moveToNext();	 Catch:{ SQLiteDatabaseCorruptException -> 0x011a, SQLiteFullException -> 0x0130 }
        if (r0 == 0) goto L_0x00ef;
    L_0x0037:
        r0 = 0;
        r5 = r3.getString(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x011a, SQLiteFullException -> 0x0130 }
        if (r5 != 0) goto L_0x0049;
    L_0x003e:
        r0 = Y;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0118, SQLiteFullException -> 0x0130 }
        r6 = 689; // 0x2b1 float:9.65E-43 double:3.404E-321;
        r0 = r0[r6];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0118, SQLiteFullException -> 0x0130 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0118, SQLiteFullException -> 0x0130 }
        if (r1 == 0) goto L_0x0031;
    L_0x0049:
        r0 = 1;
        r6 = r3.getLong(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x011a, SQLiteFullException -> 0x0130 }
        r0 = 0;
        r8 = 1;
        r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r8 == 0) goto L_0x0059;
    L_0x0055:
        r0 = r12.r(r5);	 Catch:{ SQLiteDatabaseCorruptException -> 0x011a, SQLiteFullException -> 0x0130 }
    L_0x0059:
        if (r0 == 0) goto L_0x0094;
    L_0x005b:
        r8 = Y;	 Catch:{ SQLiteDatabaseCorruptException -> 0x012c, SQLiteFullException -> 0x0130 }
        r9 = 694; // 0x2b6 float:9.73E-43 double:3.43E-321;
        r8 = r8[r9];	 Catch:{ SQLiteDatabaseCorruptException -> 0x012c, SQLiteFullException -> 0x0130 }
        r8 = r5.contains(r8);	 Catch:{ SQLiteDatabaseCorruptException -> 0x012c, SQLiteFullException -> 0x0130 }
        if (r8 == 0) goto L_0x0079;
    L_0x0067:
        r8 = Y;	 Catch:{ SQLiteDatabaseCorruptException -> 0x012e, SQLiteFullException -> 0x0130 }
        r9 = 691; // 0x2b3 float:9.68E-43 double:3.414E-321;
        r8 = r8[r9];	 Catch:{ SQLiteDatabaseCorruptException -> 0x012e, SQLiteFullException -> 0x0130 }
        com.whatsapp.util.Log.i(r8);	 Catch:{ SQLiteDatabaseCorruptException -> 0x012e, SQLiteFullException -> 0x0130 }
        r12.l(r5);	 Catch:{ SQLiteDatabaseCorruptException -> 0x012e, SQLiteFullException -> 0x0130 }
        r8 = 1;
        com.whatsapp.qm.a(r8);	 Catch:{ SQLiteDatabaseCorruptException -> 0x012e, SQLiteFullException -> 0x0130 }
        if (r1 == 0) goto L_0x0031;
    L_0x0079:
        r8 = com.whatsapp.qm.g(r5);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0139, SQLiteFullException -> 0x0130 }
        if (r8 == 0) goto L_0x0094;
    L_0x007f:
        r8 = r0.z;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0139, SQLiteFullException -> 0x0130 }
        r10 = 2;
        r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r8 != 0) goto L_0x0094;
    L_0x0087:
        r8 = Y;	 Catch:{ SQLiteDatabaseCorruptException -> 0x013b, SQLiteFullException -> 0x0130 }
        r9 = 693; // 0x2b5 float:9.71E-43 double:3.424E-321;
        r8 = r8[r9];	 Catch:{ SQLiteDatabaseCorruptException -> 0x013b, SQLiteFullException -> 0x0130 }
        com.whatsapp.util.Log.i(r8);	 Catch:{ SQLiteDatabaseCorruptException -> 0x013b, SQLiteFullException -> 0x0130 }
        r8 = 3;
        r0.z = r8;	 Catch:{ SQLiteDatabaseCorruptException -> 0x013b, SQLiteFullException -> 0x0130 }
    L_0x0094:
        r8 = new com.whatsapp.a5w;	 Catch:{ SQLiteDatabaseCorruptException -> 0x011a, SQLiteFullException -> 0x0130 }
        r8.<init>();	 Catch:{ SQLiteDatabaseCorruptException -> 0x011a, SQLiteFullException -> 0x0130 }
        com.whatsapp.a5w.c(r8, r6);	 Catch:{ SQLiteDatabaseCorruptException -> 0x013d, SQLiteFullException -> 0x0130 }
        com.whatsapp.a5w.a(r8, r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x013d, SQLiteFullException -> 0x0130 }
        r0 = 2;
        r6 = r3.getLong(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x013d, SQLiteFullException -> 0x0130 }
        com.whatsapp.a5w.a(r8, r6);	 Catch:{ SQLiteDatabaseCorruptException -> 0x013d, SQLiteFullException -> 0x0130 }
        r0 = 3;
        r6 = r3.getLong(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x013d, SQLiteFullException -> 0x0130 }
        com.whatsapp.a5w.d(r8, r6);	 Catch:{ SQLiteDatabaseCorruptException -> 0x013d, SQLiteFullException -> 0x0130 }
        r0 = 4;
        r0 = r3.getInt(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x013d, SQLiteFullException -> 0x0130 }
        r6 = 1;
        if (r0 != r6) goto L_0x013f;
    L_0x00b7:
        r0 = 1;
    L_0x00b8:
        com.whatsapp.a5w.a(r8, r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x011a, SQLiteFullException -> 0x0130 }
        r0 = 5;
        r6 = r3.getLong(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x011a, SQLiteFullException -> 0x0130 }
        com.whatsapp.a5w.f(r8, r6);	 Catch:{ SQLiteDatabaseCorruptException -> 0x011a, SQLiteFullException -> 0x0130 }
        r0 = 6;
        r0 = r3.getInt(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x011a, SQLiteFullException -> 0x0130 }
        com.whatsapp.a5w.b(r8, r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x011a, SQLiteFullException -> 0x0130 }
        r0 = 7;
        r6 = r3.getDouble(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x011a, SQLiteFullException -> 0x0130 }
        com.whatsapp.a5w.b(r8, r6);	 Catch:{ SQLiteDatabaseCorruptException -> 0x011a, SQLiteFullException -> 0x0130 }
        r0 = 8;
        r0 = r3.getInt(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x011a, SQLiteFullException -> 0x0130 }
        com.whatsapp.a5w.c(r8, r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x011a, SQLiteFullException -> 0x0130 }
        r0 = r3.getInt(r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x011a, SQLiteFullException -> 0x0130 }
        com.whatsapp.a5w.a(r8, r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x011a, SQLiteFullException -> 0x0130 }
        r0 = r12.l;	 Catch:{ SQLiteDatabaseCorruptException -> 0x011a, SQLiteFullException -> 0x0130 }
        r0.put(r5, r8);	 Catch:{ SQLiteDatabaseCorruptException -> 0x011a, SQLiteFullException -> 0x0130 }
        r0 = r12.n;	 Catch:{ SQLiteDatabaseCorruptException -> 0x011a, SQLiteFullException -> 0x0130 }
        r0.a(r5);	 Catch:{ SQLiteDatabaseCorruptException -> 0x011a, SQLiteFullException -> 0x0130 }
        if (r1 == 0) goto L_0x0031;
    L_0x00ef:
        r0 = 1;
        r12.N = r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x011a, SQLiteFullException -> 0x0130 }
        r3.close();	 Catch:{ all -> 0x0129 }
    L_0x00f5:
        monitor-exit(r2);	 Catch:{ all -> 0x0129 }
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = Y;
        r2 = 695; // 0x2b7 float:9.74E-43 double:3.434E-321;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r12.l;
        r1 = r1.size();
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        goto L_0x0013;
    L_0x0118:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x011a, SQLiteFullException -> 0x0130 }
    L_0x011a:
        r0 = move-exception;
        r12.r();	 Catch:{ all -> 0x0124 }
        r1 = new java.lang.AssertionError;	 Catch:{ all -> 0x0124 }
        r1.<init>(r0);	 Catch:{ all -> 0x0124 }
        throw r1;	 Catch:{ all -> 0x0124 }
    L_0x0124:
        r0 = move-exception;
        r3.close();	 Catch:{ all -> 0x0129 }
        throw r0;	 Catch:{ all -> 0x0129 }
    L_0x0129:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0129 }
        throw r0;
    L_0x012c:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x012e, SQLiteFullException -> 0x0130 }
    L_0x012e:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x011a, SQLiteFullException -> 0x0130 }
    L_0x0130:
        r0 = move-exception;
        r1 = com.whatsapp.App.z();	 Catch:{ all -> 0x0124 }
        com.whatsapp.util.p.a(r1);	 Catch:{ all -> 0x0124 }
        throw r0;	 Catch:{ all -> 0x0124 }
    L_0x0139:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x013b, SQLiteFullException -> 0x0130 }
    L_0x013b:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x011a, SQLiteFullException -> 0x0130 }
    L_0x013d:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x011a, SQLiteFullException -> 0x0130 }
    L_0x013f:
        r0 = 0;
        goto L_0x00b8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.u():void");
    }

    public boolean e(String str, String str2) {
        String[] strArr = new String[]{str};
        SQLiteDatabase sQLiteDatabase = null;
        synchronized (this.a) {
            try {
                sQLiteDatabase = this.a.getWritableDatabase();
                sQLiteDatabase.beginTransaction();
                sQLiteDatabase.execSQL(Y[473], strArr);
                sQLiteDatabase.execSQL(Y[470], strArr);
                sQLiteDatabase.execSQL(Y[474], strArr);
                this.l.remove(str);
                ContentValues contentValues = new ContentValues(1);
                contentValues.put(Y[471], str2);
                sQLiteDatabase.update(Y[472], contentValues, Y[475], strArr);
                sQLiteDatabase.setTransactionSuccessful();
                if (sQLiteDatabase != null) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (IllegalStateException e) {
                        throw e;
                    } catch (IllegalStateException e2) {
                        throw e2;
                    }
                }
            } catch (Throwable th) {
                if (sQLiteDatabase != null) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (IllegalStateException e22) {
                        throw e22;
                    } catch (IllegalStateException e222) {
                        throw e222;
                    }
                }
            }
        }
        return true;
    }

    public ArrayList C(String str) {
        boolean z = l5.s;
        ab abVar = new ab();
        abVar.b(Y[763]);
        ArrayList arrayList = new ArrayList();
        try {
            if (!App.C(str)) {
                return arrayList;
            }
            a5w com_whatsapp_a5w = (a5w) this.l.get(str);
            if (com_whatsapp_a5w == null) {
                try {
                    Log.w(Y[759] + str);
                    return arrayList;
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
            try {
                if (a5w.e(com_whatsapp_a5w) == a5w.a(com_whatsapp_a5w)) {
                    return arrayList;
                }
                Cursor rawQuery = this.a.getReadableDatabase().rawQuery(Y[764], new String[]{str, String.valueOf(a5w.e(com_whatsapp_a5w)), String.valueOf(a5w.a(com_whatsapp_a5w)), String.valueOf(1415214000000L)});
                if (rawQuery != null) {
                    do {
                        try {
                            if (!rawQuery.moveToNext()) {
                                break;
                            }
                            co a = a(rawQuery, str);
                            arrayList.add(new q7(a, a.I));
                        } catch (IllegalStateException e2) {
                            Log.i(Y[761] + e2.toString());
                            rawQuery.close();
                        } catch (SQLiteDatabaseCorruptException e3) {
                            r();
                            throw new AssertionError(e3);
                        } catch (SQLiteFullException e4) {
                            p.a(App.z());
                            throw e4;
                        } catch (Throwable th) {
                            rawQuery.close();
                        }
                    } while (!z);
                    rawQuery.close();
                }
                Log.i(Y[762] + arrayList.size() + Y[760] + abVar.b());
                return arrayList;
            } catch (IllegalStateException e22) {
                throw e22;
            }
        } catch (IllegalStateException e222) {
            throw e222;
        }
    }

    static int g() {
        return H();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @android.support.annotation.NonNull
    public com.whatsapp.am3 e(@android.support.annotation.NonNull com.whatsapp.protocol.c3 r9) {
        /*
        r8 = this;
        r3 = com.whatsapp.l5.s;
        r4 = r8.a;
        monitor-enter(r4);
        r0 = r8.f;	 Catch:{ all -> 0x00b7 }
        r0 = r0.get(r9);	 Catch:{ all -> 0x00b7 }
        r0 = (com.whatsapp.am3) r0;	 Catch:{ all -> 0x00b7 }
        if (r0 == 0) goto L_0x0011;
    L_0x000f:
        monitor-exit(r4);	 Catch:{ all -> 0x00b7 }
    L_0x0010:
        return r0;
    L_0x0011:
        r0 = r9.c;	 Catch:{ all -> 0x00b7 }
        r0 = com.whatsapp.qm.i(r0);	 Catch:{ all -> 0x00b7 }
        if (r0 == 0) goto L_0x0038;
    L_0x0019:
        r0 = 2;
        r0 = new java.lang.String[r0];	 Catch:{ all -> 0x00b7 }
        r1 = 0;
        r2 = r9.c;	 Catch:{ all -> 0x00b7 }
        r0[r1] = r2;	 Catch:{ all -> 0x00b7 }
        r1 = 1;
        r2 = r9.b;	 Catch:{ all -> 0x00b7 }
        r0[r1] = r2;	 Catch:{ all -> 0x00b7 }
        r1 = r8.a;	 Catch:{ all -> 0x00b7 }
        r1 = r1.getReadableDatabase();	 Catch:{ all -> 0x00b7 }
        r2 = Y;	 Catch:{ all -> 0x00b7 }
        r5 = 573; // 0x23d float:8.03E-43 double:2.83E-321;
        r2 = r2[r5];	 Catch:{ all -> 0x00b7 }
        r0 = r1.rawQuery(r2, r0);	 Catch:{ all -> 0x00b7 }
        if (r3 == 0) goto L_0x00c1;
    L_0x0038:
        r0 = r9.c;	 Catch:{ IllegalStateException -> 0x00ba }
        r0 = com.whatsapp.l5.e(r0);	 Catch:{ IllegalStateException -> 0x00ba }
        if (r0 == 0) goto L_0x0056;
    L_0x0040:
        r0 = 1;
        r0 = new java.lang.String[r0];	 Catch:{ all -> 0x00b7 }
        r1 = 0;
        r2 = r9.b;	 Catch:{ all -> 0x00b7 }
        r0[r1] = r2;	 Catch:{ all -> 0x00b7 }
        r1 = r8.a;	 Catch:{ all -> 0x00b7 }
        r1 = r1.getReadableDatabase();	 Catch:{ all -> 0x00b7 }
        r2 = E;	 Catch:{ all -> 0x00b7 }
        r0 = r1.rawQuery(r2, r0);	 Catch:{ all -> 0x00b7 }
        if (r3 == 0) goto L_0x00c1;
    L_0x0056:
        r0 = 2;
        r0 = new java.lang.String[r0];	 Catch:{ all -> 0x00b7 }
        r1 = 0;
        r2 = r9.c;	 Catch:{ all -> 0x00b7 }
        r0[r1] = r2;	 Catch:{ all -> 0x00b7 }
        r1 = 1;
        r2 = r9.b;	 Catch:{ all -> 0x00b7 }
        r0[r1] = r2;	 Catch:{ all -> 0x00b7 }
        r1 = r8.a;	 Catch:{ all -> 0x00b7 }
        r1 = r1.getReadableDatabase();	 Catch:{ all -> 0x00b7 }
        r2 = Y;	 Catch:{ all -> 0x00b7 }
        r5 = 572; // 0x23c float:8.02E-43 double:2.826E-321;
        r2 = r2[r5];	 Catch:{ all -> 0x00b7 }
        r0 = r1.rawQuery(r2, r0);	 Catch:{ all -> 0x00b7 }
        r2 = r0;
    L_0x0074:
        r0 = new com.whatsapp.am3;	 Catch:{ all -> 0x00b7 }
        r0.<init>();	 Catch:{ all -> 0x00b7 }
        if (r2 == 0) goto L_0x00af;
    L_0x007b:
        r1 = r2.moveToNext();	 Catch:{ all -> 0x00bc }
        if (r1 == 0) goto L_0x00ac;
    L_0x0081:
        r1 = 0;
        r1 = r2.getString(r1);	 Catch:{ all -> 0x00bc }
        if (r1 != 0) goto L_0x008b;
    L_0x0088:
        r1 = "";
    L_0x008b:
        r5 = new com.whatsapp.x4;	 Catch:{ all -> 0x00bc }
        r5.<init>();	 Catch:{ all -> 0x00bc }
        r6 = 1;
        r6 = r2.getLong(r6);	 Catch:{ all -> 0x00bc }
        r5.d = r6;	 Catch:{ all -> 0x00bc }
        r6 = 2;
        r6 = r2.getLong(r6);	 Catch:{ all -> 0x00bc }
        r5.a = r6;	 Catch:{ all -> 0x00bc }
        r6 = 3;
        r6 = r2.getLong(r6);	 Catch:{ all -> 0x00bc }
        r5.c = r6;	 Catch:{ all -> 0x00bc }
        r6 = r0.a;	 Catch:{ all -> 0x00bc }
        r6.put(r1, r5);	 Catch:{ all -> 0x00bc }
        if (r3 == 0) goto L_0x007b;
    L_0x00ac:
        r2.close();	 Catch:{ all -> 0x00b7 }
    L_0x00af:
        r1 = r8.f;	 Catch:{ all -> 0x00b7 }
        r1.put(r9, r0);	 Catch:{ all -> 0x00b7 }
        monitor-exit(r4);	 Catch:{ all -> 0x00b7 }
        goto L_0x0010;
    L_0x00b7:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x00b7 }
        throw r0;
    L_0x00ba:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00b7 }
    L_0x00bc:
        r0 = move-exception;
        r2.close();	 Catch:{ all -> 0x00b7 }
        throw r0;	 Catch:{ all -> 0x00b7 }
    L_0x00c1:
        r2 = r0;
        goto L_0x0074;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.e(com.whatsapp.protocol.c3):com.whatsapp.am3");
    }

    public void a(String str, adl com_whatsapp_adl) {
        Log.i(Y[548] + str + " " + com_whatsapp_adl);
        this.b.post(new zl(this, str, com_whatsapp_adl));
    }

    public ArrayList c(String str, int i) {
        boolean z = l5.s;
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = this.a.getReadableDatabase().rawQuery(Y[503] + i, new String[]{str});
        if (rawQuery != null) {
            while (rawQuery.moveToNext()) {
                try {
                    co a = a(rawQuery, str);
                    if (a != null || z) {
                        arrayList.add(a);
                        if (z) {
                            break;
                        }
                    }
                } catch (SQLiteDatabaseCorruptException e) {
                    r();
                    throw new AssertionError(e);
                } catch (IllegalStateException e2) {
                    Log.i(Y[504] + e2.toString());
                    rawQuery.close();
                } catch (Throwable th) {
                    rawQuery.close();
                }
            }
            rawQuery.close();
        }
        return arrayList;
    }

    public void B(String str) {
        boolean z = l5.s;
        Log.i(Y[27] + str);
        for (c3 c3Var : new HashSet(this.z.keySet())) {
            try {
                if (str.equals(c3Var.c)) {
                    this.z.remove(c3Var);
                    continue;
                }
                if (z) {
                    break;
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        Message.obtain(this.b, 6, str).sendToTarget();
    }

    static void a(File file, String str) {
        b(file, str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(java.io.File r11) {
        /*
        r3 = 0;
        r7 = -1;
        r0 = 1;
        r1 = 0;
        r2 = new java.lang.StringBuilder;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0045 }
        r2.<init>();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0045 }
        r4 = Y;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0045 }
        r5 = 320; // 0x140 float:4.48E-43 double:1.58E-321;
        r4 = r4[r5];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0045 }
        r2 = r2.append(r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0045 }
        r4 = com.whatsapp.App.z();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0045 }
        r5 = Y;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0045 }
        r6 = 317; // 0x13d float:4.44E-43 double:1.566E-321;
        r5 = r5[r6];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0045 }
        r4 = r4.getDatabasePath(r5);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0045 }
        r2 = r2.append(r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0045 }
        r2 = r2.toString();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0045 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0045 }
        r2 = Y;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0045 }
        r4 = 314; // 0x13a float:4.4E-43 double:1.55E-321;
        r2 = r2[r4];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0045 }
        b(r11, r2);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0045 }
        r2 = r11.exists();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0045 }
        if (r2 != 0) goto L_0x0047;
    L_0x003b:
        r0 = Y;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0045 }
        r2 = 321; // 0x141 float:4.5E-43 double:1.586E-321;
        r0 = r0[r2];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0045 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0045 }
    L_0x0044:
        return r1;
    L_0x0045:
        r0 = move-exception;
        throw r0;
    L_0x0047:
        r5 = r1;
        r6 = r1;
        r4 = r7;
    L_0x004a:
        r2 = r11.getAbsolutePath();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0091, SQLiteException -> 0x00af }
        r8 = 0;
        r9 = 16;
        r3 = android.database.sqlite.SQLiteDatabase.openDatabase(r2, r8, r9);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0091, SQLiteException -> 0x00af }
        r4 = r3.getVersion();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0091, SQLiteException -> 0x00af }
        r2 = new java.lang.StringBuilder;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0091, SQLiteException -> 0x00af }
        r2.<init>();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0091, SQLiteException -> 0x00af }
        r8 = Y;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0091, SQLiteException -> 0x00af }
        r9 = 316; // 0x13c float:4.43E-43 double:1.56E-321;
        r8 = r8[r9];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0091, SQLiteException -> 0x00af }
        r2 = r2.append(r8);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0091, SQLiteException -> 0x00af }
        r2 = r2.append(r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0091, SQLiteException -> 0x00af }
        r2 = r2.toString();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0091, SQLiteException -> 0x00af }
        com.whatsapp.util.Log.i(r2);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0091, SQLiteException -> 0x00af }
        if (r3 == 0) goto L_0x013f;
    L_0x0075:
        r2 = r3.isOpen();	 Catch:{ SQLiteDatabaseCorruptException -> 0x008f }
        if (r2 == 0) goto L_0x013f;
    L_0x007b:
        r3.close();	 Catch:{ SQLiteDatabaseCorruptException -> 0x008f }
        r10 = r6;
        r6 = r3;
        r3 = r10;
    L_0x0081:
        if (r3 == 0) goto L_0x0087;
    L_0x0083:
        r2 = r5 + 1;
        if (r5 == 0) goto L_0x012e;
    L_0x0087:
        if (r6 == 0) goto L_0x0128;
    L_0x0089:
        if (r4 <= 0) goto L_0x0128;
    L_0x008b:
        if (r4 > r0) goto L_0x0128;
    L_0x008d:
        r1 = r0;
        goto L_0x0044;
    L_0x008f:
        r0 = move-exception;
        throw r0;
    L_0x0091:
        r2 = move-exception;
        r4 = Y;	 Catch:{ all -> 0x012b }
        r8 = 318; // 0x13e float:4.46E-43 double:1.57E-321;
        r4 = r4[r8];	 Catch:{ all -> 0x012b }
        com.whatsapp.util.Log.b(r4, r2);	 Catch:{ all -> 0x012b }
        if (r3 == 0) goto L_0x0139;
    L_0x009d:
        r2 = r3.isOpen();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00ab }
        if (r2 == 0) goto L_0x0139;
    L_0x00a3:
        r3.close();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00ad }
        r4 = r7;
        r10 = r6;
        r6 = r3;
        r3 = r10;
        goto L_0x0081;
    L_0x00ab:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00ad }
    L_0x00ad:
        r0 = move-exception;
        throw r0;
    L_0x00af:
        r2 = move-exception;
        r10 = r4;
        r4 = r3;
        r3 = r10;
        r6 = new java.lang.StringBuilder;	 Catch:{ SQLiteDatabaseCorruptException -> 0x010d }
        r6.<init>();	 Catch:{ SQLiteDatabaseCorruptException -> 0x010d }
        r8 = Y;	 Catch:{ SQLiteDatabaseCorruptException -> 0x010d }
        r9 = 315; // 0x13b float:4.41E-43 double:1.556E-321;
        r8 = r8[r9];	 Catch:{ SQLiteDatabaseCorruptException -> 0x010d }
        r8 = r6.append(r8);	 Catch:{ SQLiteDatabaseCorruptException -> 0x010d }
        if (r5 != 0) goto L_0x011c;
    L_0x00c4:
        r6 = Y;	 Catch:{ SQLiteDatabaseCorruptException -> 0x010d }
        r9 = 322; // 0x142 float:4.51E-43 double:1.59E-321;
        r6 = r6[r9];	 Catch:{ SQLiteDatabaseCorruptException -> 0x010d }
    L_0x00ca:
        r6 = r8.append(r6);	 Catch:{ all -> 0x010f }
        r2 = r2.toString();	 Catch:{ all -> 0x010f }
        r2 = r6.append(r2);	 Catch:{ all -> 0x010f }
        r2 = r2.toString();	 Catch:{ all -> 0x010f }
        com.whatsapp.util.Log.w(r2);	 Catch:{ all -> 0x010f }
        if (r5 <= 0) goto L_0x00fd;
    L_0x00df:
        r2 = new java.lang.StringBuilder;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0120 }
        r2.<init>();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0120 }
        r6 = Y;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0120 }
        r8 = 319; // 0x13f float:4.47E-43 double:1.576E-321;
        r6 = r6[r8];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0120 }
        r2 = r2.append(r6);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0120 }
        r6 = com.whatsapp.util.g.a();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0120 }
        r2 = r2.append(r6);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0120 }
        r2 = r2.toString();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0120 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0120 }
    L_0x00fd:
        if (r4 == 0) goto L_0x0134;
    L_0x00ff:
        r2 = r4.isOpen();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0122 }
        if (r2 == 0) goto L_0x0134;
    L_0x0105:
        r4.close();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0124 }
        r6 = r4;
        r4 = r3;
        r3 = r0;
        goto L_0x0081;
    L_0x010d:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x010f }
    L_0x010f:
        r0 = move-exception;
    L_0x0110:
        if (r4 == 0) goto L_0x011b;
    L_0x0112:
        r1 = r4.isOpen();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0126 }
        if (r1 == 0) goto L_0x011b;
    L_0x0118:
        r4.close();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0126 }
    L_0x011b:
        throw r0;
    L_0x011c:
        r6 = " ";
        goto L_0x00ca;
    L_0x0120:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x010f }
    L_0x0122:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0124 }
    L_0x0124:
        r0 = move-exception;
        throw r0;
    L_0x0126:
        r0 = move-exception;
        throw r0;
    L_0x0128:
        r0 = r1;
        goto L_0x008d;
    L_0x012b:
        r0 = move-exception;
        r4 = r3;
        goto L_0x0110;
    L_0x012e:
        r5 = r2;
        r10 = r3;
        r3 = r6;
        r6 = r10;
        goto L_0x004a;
    L_0x0134:
        r6 = r4;
        r4 = r3;
        r3 = r0;
        goto L_0x0081;
    L_0x0139:
        r4 = r7;
        r10 = r6;
        r6 = r3;
        r3 = r10;
        goto L_0x0081;
    L_0x013f:
        r10 = r6;
        r6 = r3;
        r3 = r10;
        goto L_0x0081;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.b(java.io.File):boolean");
    }

    private void a(com.whatsapp.protocol.co r11, java.lang.String r12, int r13, long r14) {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:com.whatsapp.ael.a(com.whatsapp.protocol.co, java.lang.String, int, long):void. bs: [B:15:0x0057, B:40:0x0127, B:48:0x015d, B:55:0x0179, B:88:0x0225, B:99:0x0283, B:131:0x0333, B:141:0x0373]
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
        r10 = this;
        r2 = com.whatsapp.l5.s;
        r0 = r11.k;	 Catch:{ IllegalStateException -> 0x0032 }
        r0 = r0.a;	 Catch:{ IllegalStateException -> 0x0032 }
        if (r0 != 0) goto L_0x0034;	 Catch:{ IllegalStateException -> 0x0032 }
    L_0x0008:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalStateException -> 0x0032 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0032 }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x0032 }
        r2 = Y;	 Catch:{ IllegalStateException -> 0x0032 }
        r3 = 621; // 0x26d float:8.7E-43 double:3.07E-321;	 Catch:{ IllegalStateException -> 0x0032 }
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0032 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x0032 }
        r2 = r11.k;	 Catch:{ IllegalStateException -> 0x0032 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x0032 }
        r2 = " ";	 Catch:{ IllegalStateException -> 0x0032 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x0032 }
        r1 = r1.append(r12);	 Catch:{ IllegalStateException -> 0x0032 }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x0032 }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x0032 }
        throw r0;	 Catch:{ IllegalStateException -> 0x0032 }
    L_0x0032:
        r0 = move-exception;
        throw r0;
    L_0x0034:
        r3 = r10.a;
        monitor-enter(r3);
        r10.O();	 Catch:{ all -> 0x0091 }
        r1 = 0;	 Catch:{ all -> 0x0091 }
        r0 = r11.k;	 Catch:{ all -> 0x0091 }
        r0 = r0.c;	 Catch:{ all -> 0x0091 }
        r0 = com.whatsapp.qm.i(r0);	 Catch:{ all -> 0x0091 }
        if (r0 == 0) goto L_0x015d;	 Catch:{ all -> 0x0091 }
    L_0x0045:
        r0 = r11.k;	 Catch:{ all -> 0x0091 }
        r0 = r10.e(r0);	 Catch:{ all -> 0x0091 }
        r0.a(r12, r13, r14);	 Catch:{ all -> 0x0091 }
        r4 = new android.content.ContentValues;	 Catch:{ all -> 0x0091 }
        r5 = 1;	 Catch:{ all -> 0x0091 }
        r4.<init>(r5);	 Catch:{ all -> 0x0091 }
        switch(r13) {
            case 5: goto L_0x0094;
            case 8: goto L_0x00b2;
            case 13: goto L_0x00a3;
            default: goto L_0x0057;
        };
    L_0x0057:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalStateException -> 0x008f }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x008f }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x008f }
        r2 = Y;	 Catch:{ IllegalStateException -> 0x008f }
        r4 = 608; // 0x260 float:8.52E-43 double:3.004E-321;	 Catch:{ IllegalStateException -> 0x008f }
        r2 = r2[r4];	 Catch:{ IllegalStateException -> 0x008f }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x008f }
        r1 = r1.append(r13);	 Catch:{ IllegalStateException -> 0x008f }
        r2 = Y;	 Catch:{ IllegalStateException -> 0x008f }
        r4 = 616; // 0x268 float:8.63E-43 double:3.043E-321;	 Catch:{ IllegalStateException -> 0x008f }
        r2 = r2[r4];	 Catch:{ IllegalStateException -> 0x008f }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x008f }
        r2 = r11.k;	 Catch:{ IllegalStateException -> 0x008f }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x008f }
        r2 = " ";	 Catch:{ IllegalStateException -> 0x008f }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x008f }
        r1 = r1.append(r12);	 Catch:{ IllegalStateException -> 0x008f }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x008f }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x008f }
        throw r0;	 Catch:{ IllegalStateException -> 0x008f }
    L_0x008f:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0091 }
    L_0x0091:
        r0 = move-exception;	 Catch:{ all -> 0x0091 }
        monitor-exit(r3);	 Catch:{ all -> 0x0091 }
        throw r0;
    L_0x0094:
        r5 = Y;	 Catch:{ IllegalStateException -> 0x01b3 }
        r6 = 620; // 0x26c float:8.69E-43 double:3.063E-321;	 Catch:{ IllegalStateException -> 0x01b3 }
        r5 = r5[r6];	 Catch:{ IllegalStateException -> 0x01b3 }
        r6 = java.lang.Long.valueOf(r14);	 Catch:{ IllegalStateException -> 0x01b3 }
        r4.put(r5, r6);	 Catch:{ IllegalStateException -> 0x01b3 }
        if (r2 == 0) goto L_0x00c1;
    L_0x00a3:
        r5 = Y;	 Catch:{ IllegalStateException -> 0x01b5 }
        r6 = 612; // 0x264 float:8.58E-43 double:3.024E-321;	 Catch:{ IllegalStateException -> 0x01b5 }
        r5 = r5[r6];	 Catch:{ IllegalStateException -> 0x01b5 }
        r6 = java.lang.Long.valueOf(r14);	 Catch:{ IllegalStateException -> 0x01b5 }
        r4.put(r5, r6);	 Catch:{ IllegalStateException -> 0x01b5 }
        if (r2 == 0) goto L_0x00c1;
    L_0x00b2:
        r5 = Y;	 Catch:{ IllegalStateException -> 0x01b7 }
        r6 = 605; // 0x25d float:8.48E-43 double:2.99E-321;	 Catch:{ IllegalStateException -> 0x01b7 }
        r5 = r5[r6];	 Catch:{ IllegalStateException -> 0x01b7 }
        r6 = java.lang.Long.valueOf(r14);	 Catch:{ IllegalStateException -> 0x01b7 }
        r4.put(r5, r6);	 Catch:{ IllegalStateException -> 0x01b7 }
        if (r2 != 0) goto L_0x0057;
    L_0x00c1:
        r5 = 3;
        r5 = new java.lang.String[r5];	 Catch:{ all -> 0x0091 }
        r6 = 0;	 Catch:{ all -> 0x0091 }
        r7 = r11.k;	 Catch:{ all -> 0x0091 }
        r7 = r7.c;	 Catch:{ all -> 0x0091 }
        r5[r6] = r7;	 Catch:{ all -> 0x0091 }
        r6 = 1;	 Catch:{ all -> 0x0091 }
        r7 = r11.k;	 Catch:{ all -> 0x0091 }
        r7 = r7.b;	 Catch:{ all -> 0x0091 }
        r5[r6] = r7;	 Catch:{ all -> 0x0091 }
        r6 = 2;	 Catch:{ all -> 0x0091 }
        r5[r6] = r12;	 Catch:{ all -> 0x0091 }
        r6 = r10.a;	 Catch:{ all -> 0x0091 }
        r6 = r6.getWritableDatabase();	 Catch:{ all -> 0x0091 }
        r7 = Y;	 Catch:{ all -> 0x0091 }
        r8 = 602; // 0x25a float:8.44E-43 double:2.974E-321;	 Catch:{ all -> 0x0091 }
        r7 = r7[r8];	 Catch:{ all -> 0x0091 }
        r8 = Y;	 Catch:{ all -> 0x0091 }
        r9 = 599; // 0x257 float:8.4E-43 double:2.96E-321;	 Catch:{ all -> 0x0091 }
        r8 = r8[r9];	 Catch:{ all -> 0x0091 }
        r5 = r6.update(r7, r4, r8, r5);	 Catch:{ all -> 0x0091 }
        if (r5 != 0) goto L_0x014e;	 Catch:{ all -> 0x0091 }
    L_0x00ed:
        r5 = Y;	 Catch:{ all -> 0x0091 }
        r6 = 619; // 0x26b float:8.67E-43 double:3.06E-321;	 Catch:{ all -> 0x0091 }
        r5 = r5[r6];	 Catch:{ all -> 0x0091 }
        r6 = r11.k;	 Catch:{ all -> 0x0091 }
        r6 = r6.c;	 Catch:{ all -> 0x0091 }
        r4.put(r5, r6);	 Catch:{ all -> 0x0091 }
        r5 = Y;	 Catch:{ all -> 0x0091 }
        r6 = 617; // 0x269 float:8.65E-43 double:3.05E-321;	 Catch:{ all -> 0x0091 }
        r5 = r5[r6];	 Catch:{ all -> 0x0091 }
        r6 = r11.k;	 Catch:{ all -> 0x0091 }
        r6 = r6.b;	 Catch:{ all -> 0x0091 }
        r4.put(r5, r6);	 Catch:{ all -> 0x0091 }
        r5 = Y;	 Catch:{ all -> 0x0091 }
        r6 = 611; // 0x263 float:8.56E-43 double:3.02E-321;	 Catch:{ all -> 0x0091 }
        r5 = r5[r6];	 Catch:{ all -> 0x0091 }
        r4.put(r5, r12);	 Catch:{ all -> 0x0091 }
        r5 = r10.a;	 Catch:{ all -> 0x0091 }
        r5 = r5.getWritableDatabase();	 Catch:{ all -> 0x0091 }
        r6 = Y;	 Catch:{ all -> 0x0091 }
        r7 = 613; // 0x265 float:8.59E-43 double:3.03E-321;	 Catch:{ all -> 0x0091 }
        r6 = r6[r7];	 Catch:{ all -> 0x0091 }
        r7 = 0;	 Catch:{ all -> 0x0091 }
        r4 = r5.insert(r6, r7, r4);	 Catch:{ all -> 0x0091 }
        r6 = -1;
        r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r4 != 0) goto L_0x014e;
    L_0x0127:
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x01b9 }
        r4.<init>();	 Catch:{ IllegalStateException -> 0x01b9 }
        r5 = Y;	 Catch:{ IllegalStateException -> 0x01b9 }
        r6 = 622; // 0x26e float:8.72E-43 double:3.073E-321;	 Catch:{ IllegalStateException -> 0x01b9 }
        r5 = r5[r6];	 Catch:{ IllegalStateException -> 0x01b9 }
        r4 = r4.append(r5);	 Catch:{ IllegalStateException -> 0x01b9 }
        r5 = r11.k;	 Catch:{ IllegalStateException -> 0x01b9 }
        r4 = r4.append(r5);	 Catch:{ IllegalStateException -> 0x01b9 }
        r5 = " ";	 Catch:{ IllegalStateException -> 0x01b9 }
        r4 = r4.append(r5);	 Catch:{ IllegalStateException -> 0x01b9 }
        r4 = r4.append(r12);	 Catch:{ IllegalStateException -> 0x01b9 }
        r4 = r4.toString();	 Catch:{ IllegalStateException -> 0x01b9 }
        com.whatsapp.util.Log.e(r4);	 Catch:{ IllegalStateException -> 0x01b9 }
    L_0x014e:
        r4 = r11.L;	 Catch:{ all -> 0x0091 }
        r0 = r0.a(r4);	 Catch:{ all -> 0x0091 }
        r4 = r11.d;	 Catch:{ all -> 0x0091 }
        if (r0 == r4) goto L_0x015b;	 Catch:{ all -> 0x0091 }
    L_0x0158:
        r11.d = r0;	 Catch:{ all -> 0x0091 }
        r1 = 1;
    L_0x015b:
        if (r2 == 0) goto L_0x03a0;
    L_0x015d:
        r0 = r11.k;	 Catch:{ IllegalStateException -> 0x01bb }
        r0 = r0.c;	 Catch:{ IllegalStateException -> 0x01bb }
        r0 = com.whatsapp.l5.e(r0);	 Catch:{ IllegalStateException -> 0x01bb }
        if (r0 == 0) goto L_0x0270;
    L_0x0167:
        r0 = r11.k;	 Catch:{ all -> 0x0091 }
        r0 = r10.e(r0);	 Catch:{ all -> 0x0091 }
        r0.a(r12, r13, r14);	 Catch:{ all -> 0x0091 }
        r0 = new android.content.ContentValues;	 Catch:{ all -> 0x0091 }
        r4 = 2;	 Catch:{ all -> 0x0091 }
        r0.<init>(r4);	 Catch:{ all -> 0x0091 }
        switch(r13) {
            case 5: goto L_0x01bd;
            case 8: goto L_0x01db;
            case 13: goto L_0x01cc;
            default: goto L_0x0179;
        };
    L_0x0179:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalStateException -> 0x01b1 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x01b1 }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x01b1 }
        r2 = Y;	 Catch:{ IllegalStateException -> 0x01b1 }
        r4 = 625; // 0x271 float:8.76E-43 double:3.09E-321;	 Catch:{ IllegalStateException -> 0x01b1 }
        r2 = r2[r4];	 Catch:{ IllegalStateException -> 0x01b1 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x01b1 }
        r1 = r1.append(r13);	 Catch:{ IllegalStateException -> 0x01b1 }
        r2 = Y;	 Catch:{ IllegalStateException -> 0x01b1 }
        r4 = 629; // 0x275 float:8.81E-43 double:3.11E-321;	 Catch:{ IllegalStateException -> 0x01b1 }
        r2 = r2[r4];	 Catch:{ IllegalStateException -> 0x01b1 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x01b1 }
        r2 = r11.k;	 Catch:{ IllegalStateException -> 0x01b1 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x01b1 }
        r2 = " ";	 Catch:{ IllegalStateException -> 0x01b1 }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x01b1 }
        r1 = r1.append(r12);	 Catch:{ IllegalStateException -> 0x01b1 }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x01b1 }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x01b1 }
        throw r0;	 Catch:{ IllegalStateException -> 0x01b1 }
    L_0x01b1:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0091 }
    L_0x01b3:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x01b5 }
    L_0x01b5:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x01b7 }
    L_0x01b7:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x008f }
    L_0x01b9:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0091 }
    L_0x01bb:
        r0 = move-exception;	 Catch:{ all -> 0x0091 }
        throw r0;	 Catch:{ all -> 0x0091 }
    L_0x01bd:
        r4 = Y;	 Catch:{ IllegalStateException -> 0x02bd }
        r5 = 600; // 0x258 float:8.41E-43 double:2.964E-321;	 Catch:{ IllegalStateException -> 0x02bd }
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x02bd }
        r5 = java.lang.Long.valueOf(r14);	 Catch:{ IllegalStateException -> 0x02bd }
        r0.put(r4, r5);	 Catch:{ IllegalStateException -> 0x02bd }
        if (r2 == 0) goto L_0x01ea;
    L_0x01cc:
        r4 = Y;	 Catch:{ IllegalStateException -> 0x02bf }
        r5 = 628; // 0x274 float:8.8E-43 double:3.103E-321;	 Catch:{ IllegalStateException -> 0x02bf }
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x02bf }
        r5 = java.lang.Long.valueOf(r14);	 Catch:{ IllegalStateException -> 0x02bf }
        r0.put(r4, r5);	 Catch:{ IllegalStateException -> 0x02bf }
        if (r2 == 0) goto L_0x01ea;
    L_0x01db:
        r4 = Y;	 Catch:{ IllegalStateException -> 0x02c1 }
        r5 = 607; // 0x25f float:8.5E-43 double:3.0E-321;	 Catch:{ IllegalStateException -> 0x02c1 }
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x02c1 }
        r5 = java.lang.Long.valueOf(r14);	 Catch:{ IllegalStateException -> 0x02c1 }
        r0.put(r4, r5);	 Catch:{ IllegalStateException -> 0x02c1 }
        if (r2 != 0) goto L_0x0179;
    L_0x01ea:
        r4 = Y;	 Catch:{ all -> 0x0091 }
        r5 = 615; // 0x267 float:8.62E-43 double:3.04E-321;	 Catch:{ all -> 0x0091 }
        r4 = r4[r5];	 Catch:{ all -> 0x0091 }
        r5 = java.lang.Integer.valueOf(r13);	 Catch:{ all -> 0x0091 }
        r0.put(r4, r5);	 Catch:{ all -> 0x0091 }
        r4 = 3;	 Catch:{ all -> 0x0091 }
        r4 = new java.lang.String[r4];	 Catch:{ all -> 0x0091 }
        r5 = 0;	 Catch:{ all -> 0x0091 }
        r4[r5] = r12;	 Catch:{ all -> 0x0091 }
        r5 = 1;	 Catch:{ all -> 0x0091 }
        r6 = 1;	 Catch:{ all -> 0x0091 }
        r6 = java.lang.String.valueOf(r6);	 Catch:{ all -> 0x0091 }
        r4[r5] = r6;	 Catch:{ all -> 0x0091 }
        r5 = 2;	 Catch:{ all -> 0x0091 }
        r6 = r11.k;	 Catch:{ all -> 0x0091 }
        r6 = r6.b;	 Catch:{ all -> 0x0091 }
        r4[r5] = r6;	 Catch:{ all -> 0x0091 }
        r5 = r10.a;	 Catch:{ all -> 0x0091 }
        r5 = r5.getWritableDatabase();	 Catch:{ all -> 0x0091 }
        r6 = Y;	 Catch:{ all -> 0x0091 }
        r7 = 618; // 0x26a float:8.66E-43 double:3.053E-321;	 Catch:{ all -> 0x0091 }
        r6 = r6[r7];	 Catch:{ all -> 0x0091 }
        r7 = Y;	 Catch:{ all -> 0x0091 }
        r8 = 603; // 0x25b float:8.45E-43 double:2.98E-321;	 Catch:{ all -> 0x0091 }
        r7 = r7[r8];	 Catch:{ all -> 0x0091 }
        r0 = r5.update(r6, r0, r7, r4);	 Catch:{ all -> 0x0091 }
        r4 = 1;
        if (r0 == r4) goto L_0x024c;
    L_0x0225:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x02c3 }
        r0.<init>();	 Catch:{ IllegalStateException -> 0x02c3 }
        r4 = Y;	 Catch:{ IllegalStateException -> 0x02c3 }
        r5 = 624; // 0x270 float:8.74E-43 double:3.083E-321;	 Catch:{ IllegalStateException -> 0x02c3 }
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x02c3 }
        r0 = r0.append(r4);	 Catch:{ IllegalStateException -> 0x02c3 }
        r4 = r11.k;	 Catch:{ IllegalStateException -> 0x02c3 }
        r0 = r0.append(r4);	 Catch:{ IllegalStateException -> 0x02c3 }
        r4 = " ";	 Catch:{ IllegalStateException -> 0x02c3 }
        r0 = r0.append(r4);	 Catch:{ IllegalStateException -> 0x02c3 }
        r0 = r0.append(r12);	 Catch:{ IllegalStateException -> 0x02c3 }
        r0 = r0.toString();	 Catch:{ IllegalStateException -> 0x02c3 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IllegalStateException -> 0x02c3 }
    L_0x024c:
        r0 = r10.f;	 Catch:{ all -> 0x0091 }
        r4 = new com.whatsapp.protocol.c3;	 Catch:{ all -> 0x0091 }
        r5 = 1;	 Catch:{ all -> 0x0091 }
        r6 = r11.k;	 Catch:{ all -> 0x0091 }
        r6 = r6.b;	 Catch:{ all -> 0x0091 }
        r4.<init>(r12, r5, r6);	 Catch:{ all -> 0x0091 }
        r0.remove(r4);	 Catch:{ all -> 0x0091 }
        r0 = r11.k;	 Catch:{ all -> 0x0091 }
        r0 = r10.e(r0);	 Catch:{ all -> 0x0091 }
        r4 = r11.L;	 Catch:{ all -> 0x0091 }
        r0 = r0.a(r4);	 Catch:{ all -> 0x0091 }
        r4 = r11.d;	 Catch:{ all -> 0x0091 }
        if (r0 == r4) goto L_0x026e;	 Catch:{ all -> 0x0091 }
    L_0x026b:
        r11.d = r0;	 Catch:{ all -> 0x0091 }
        r1 = 1;	 Catch:{ all -> 0x0091 }
    L_0x026e:
        if (r2 == 0) goto L_0x03a0;	 Catch:{ all -> 0x0091 }
    L_0x0270:
        r0 = 1;	 Catch:{ all -> 0x0091 }
    L_0x0271:
        if (r0 == 0) goto L_0x0381;	 Catch:{ all -> 0x0091 }
    L_0x0273:
        r0 = r10.f;	 Catch:{ all -> 0x0091 }
        r1 = r11.k;	 Catch:{ all -> 0x0091 }
        r0.remove(r1);	 Catch:{ all -> 0x0091 }
        r0 = new android.content.ContentValues;	 Catch:{ all -> 0x0091 }
        r1 = 2;	 Catch:{ all -> 0x0091 }
        r0.<init>(r1);	 Catch:{ all -> 0x0091 }
        switch(r13) {
            case 4: goto L_0x02f2;
            case 5: goto L_0x02c5;
            case 8: goto L_0x02e3;
            case 13: goto L_0x02d4;
            default: goto L_0x0283;
        };
    L_0x0283:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalStateException -> 0x02bb }
        r1 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x02bb }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x02bb }
        r2 = Y;	 Catch:{ IllegalStateException -> 0x02bb }
        r4 = 609; // 0x261 float:8.53E-43 double:3.01E-321;	 Catch:{ IllegalStateException -> 0x02bb }
        r2 = r2[r4];	 Catch:{ IllegalStateException -> 0x02bb }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x02bb }
        r1 = r1.append(r13);	 Catch:{ IllegalStateException -> 0x02bb }
        r2 = Y;	 Catch:{ IllegalStateException -> 0x02bb }
        r4 = 601; // 0x259 float:8.42E-43 double:2.97E-321;	 Catch:{ IllegalStateException -> 0x02bb }
        r2 = r2[r4];	 Catch:{ IllegalStateException -> 0x02bb }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x02bb }
        r2 = r11.k;	 Catch:{ IllegalStateException -> 0x02bb }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x02bb }
        r2 = " ";	 Catch:{ IllegalStateException -> 0x02bb }
        r1 = r1.append(r2);	 Catch:{ IllegalStateException -> 0x02bb }
        r1 = r1.append(r12);	 Catch:{ IllegalStateException -> 0x02bb }
        r1 = r1.toString();	 Catch:{ IllegalStateException -> 0x02bb }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x02bb }
        throw r0;	 Catch:{ IllegalStateException -> 0x02bb }
    L_0x02bb:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0091 }
    L_0x02bd:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x02bf }
    L_0x02bf:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x02c1 }
    L_0x02c1:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x01b1 }
    L_0x02c3:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0091 }
    L_0x02c5:
        r1 = Y;	 Catch:{ IllegalStateException -> 0x0390 }
        r4 = 606; // 0x25e float:8.49E-43 double:2.994E-321;	 Catch:{ IllegalStateException -> 0x0390 }
        r1 = r1[r4];	 Catch:{ IllegalStateException -> 0x0390 }
        r4 = java.lang.Long.valueOf(r14);	 Catch:{ IllegalStateException -> 0x0390 }
        r0.put(r1, r4);	 Catch:{ IllegalStateException -> 0x0390 }
        if (r2 == 0) goto L_0x02f4;
    L_0x02d4:
        r1 = Y;	 Catch:{ IllegalStateException -> 0x0392 }
        r4 = 614; // 0x266 float:8.6E-43 double:3.034E-321;	 Catch:{ IllegalStateException -> 0x0392 }
        r1 = r1[r4];	 Catch:{ IllegalStateException -> 0x0392 }
        r4 = java.lang.Long.valueOf(r14);	 Catch:{ IllegalStateException -> 0x0392 }
        r0.put(r1, r4);	 Catch:{ IllegalStateException -> 0x0392 }
        if (r2 == 0) goto L_0x02f4;
    L_0x02e3:
        r1 = Y;	 Catch:{ IllegalStateException -> 0x0394 }
        r4 = 627; // 0x273 float:8.79E-43 double:3.1E-321;	 Catch:{ IllegalStateException -> 0x0394 }
        r1 = r1[r4];	 Catch:{ IllegalStateException -> 0x0394 }
        r4 = java.lang.Long.valueOf(r14);	 Catch:{ IllegalStateException -> 0x0394 }
        r0.put(r1, r4);	 Catch:{ IllegalStateException -> 0x0394 }
        if (r2 == 0) goto L_0x02f4;
    L_0x02f2:
        if (r2 != 0) goto L_0x0283;
    L_0x02f4:
        r1 = Y;	 Catch:{ all -> 0x0091 }
        r4 = 604; // 0x25c float:8.46E-43 double:2.984E-321;	 Catch:{ all -> 0x0091 }
        r1 = r1[r4];	 Catch:{ all -> 0x0091 }
        r4 = java.lang.Integer.valueOf(r13);	 Catch:{ all -> 0x0091 }
        r0.put(r1, r4);	 Catch:{ all -> 0x0091 }
        r1 = 3;	 Catch:{ all -> 0x0091 }
        r1 = new java.lang.String[r1];	 Catch:{ all -> 0x0091 }
        r4 = 0;	 Catch:{ all -> 0x0091 }
        r5 = r11.k;	 Catch:{ all -> 0x0091 }
        r5 = r5.c;	 Catch:{ all -> 0x0091 }
        r1[r4] = r5;	 Catch:{ all -> 0x0091 }
        r4 = 1;	 Catch:{ all -> 0x0091 }
        r5 = 1;	 Catch:{ all -> 0x0091 }
        r5 = java.lang.String.valueOf(r5);	 Catch:{ all -> 0x0091 }
        r1[r4] = r5;	 Catch:{ all -> 0x0091 }
        r4 = 2;	 Catch:{ all -> 0x0091 }
        r5 = r11.k;	 Catch:{ all -> 0x0091 }
        r5 = r5.b;	 Catch:{ all -> 0x0091 }
        r1[r4] = r5;	 Catch:{ all -> 0x0091 }
        r4 = r10.a;	 Catch:{ all -> 0x0091 }
        r4 = r4.getWritableDatabase();	 Catch:{ all -> 0x0091 }
        r5 = Y;	 Catch:{ all -> 0x0091 }
        r6 = 610; // 0x262 float:8.55E-43 double:3.014E-321;	 Catch:{ all -> 0x0091 }
        r5 = r5[r6];	 Catch:{ all -> 0x0091 }
        r6 = Y;	 Catch:{ all -> 0x0091 }
        r7 = 626; // 0x272 float:8.77E-43 double:3.093E-321;	 Catch:{ all -> 0x0091 }
        r6 = r6[r7];	 Catch:{ all -> 0x0091 }
        r0 = r4.update(r5, r0, r6, r1);	 Catch:{ all -> 0x0091 }
        r1 = 1;
        if (r0 == r1) goto L_0x035a;
    L_0x0333:
        r0 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0398 }
        r0.<init>();	 Catch:{ IllegalStateException -> 0x0398 }
        r1 = Y;	 Catch:{ IllegalStateException -> 0x0398 }
        r4 = 623; // 0x26f float:8.73E-43 double:3.08E-321;	 Catch:{ IllegalStateException -> 0x0398 }
        r1 = r1[r4];	 Catch:{ IllegalStateException -> 0x0398 }
        r0 = r0.append(r1);	 Catch:{ IllegalStateException -> 0x0398 }
        r1 = r11.k;	 Catch:{ IllegalStateException -> 0x0398 }
        r0 = r0.append(r1);	 Catch:{ IllegalStateException -> 0x0398 }
        r1 = " ";	 Catch:{ IllegalStateException -> 0x0398 }
        r0 = r0.append(r1);	 Catch:{ IllegalStateException -> 0x0398 }
        r0 = r0.append(r12);	 Catch:{ IllegalStateException -> 0x0398 }
        r0 = r0.toString();	 Catch:{ IllegalStateException -> 0x0398 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IllegalStateException -> 0x0398 }
    L_0x035a:
        r0 = r11.k;	 Catch:{ IllegalStateException -> 0x039a }
        r0 = r0.c;	 Catch:{ IllegalStateException -> 0x039a }
        r0 = com.whatsapp.l5.e(r0);	 Catch:{ IllegalStateException -> 0x039a }
        if (r0 != 0) goto L_0x036e;	 Catch:{ IllegalStateException -> 0x039a }
    L_0x0364:
        r0 = r11.k;	 Catch:{ IllegalStateException -> 0x039a }
        r0 = r0.c;	 Catch:{ IllegalStateException -> 0x039a }
        r0 = com.whatsapp.qm.i(r0);	 Catch:{ IllegalStateException -> 0x039a }
        if (r0 == 0) goto L_0x0373;
    L_0x036e:
        r0 = r11.k;	 Catch:{ IllegalStateException -> 0x039c }
        com.whatsapp.App.a(r0, r13);	 Catch:{ IllegalStateException -> 0x039c }
    L_0x0373:
        r0 = r10.O;	 Catch:{ IllegalStateException -> 0x039e }
        r1 = 2;	 Catch:{ IllegalStateException -> 0x039e }
        r4 = -1;	 Catch:{ IllegalStateException -> 0x039e }
        r5 = 0;	 Catch:{ IllegalStateException -> 0x039e }
        r0 = android.os.Message.obtain(r0, r1, r4, r5, r11);	 Catch:{ IllegalStateException -> 0x039e }
        r0.sendToTarget();	 Catch:{ IllegalStateException -> 0x039e }
        if (r2 == 0) goto L_0x038e;	 Catch:{ IllegalStateException -> 0x039e }
    L_0x0381:
        r0 = r10.O;	 Catch:{ IllegalStateException -> 0x039e }
        r1 = 11;	 Catch:{ IllegalStateException -> 0x039e }
        r2 = -1;	 Catch:{ IllegalStateException -> 0x039e }
        r4 = 0;	 Catch:{ IllegalStateException -> 0x039e }
        r0 = android.os.Message.obtain(r0, r1, r2, r4, r11);	 Catch:{ IllegalStateException -> 0x039e }
        r0.sendToTarget();	 Catch:{ IllegalStateException -> 0x039e }
    L_0x038e:
        monitor-exit(r3);	 Catch:{ all -> 0x0091 }
        return;
    L_0x0390:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0392 }
    L_0x0392:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0394 }
    L_0x0394:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0396 }
    L_0x0396:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x02bb }
    L_0x0398:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0091 }
    L_0x039a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x039c }
    L_0x039c:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0091 }
    L_0x039e:
        r0 = move-exception;	 Catch:{ all -> 0x0091 }
        throw r0;	 Catch:{ all -> 0x0091 }
    L_0x03a0:
        r13 = r0;
        r0 = r1;
        goto L_0x0271;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.a(com.whatsapp.protocol.co, java.lang.String, int, long):void");
    }

    public Cursor b(String str, String str2, CancellationSignal cancellationSignal) {
        Cursor a;
        synchronized (this.a) {
            CharSequence charSequence;
            a5f.a(this.a);
            if (TextUtils.isEmpty(str2)) {
                charSequence = null;
            } else {
                charSequence = f(str2);
            }
            if (TextUtils.isEmpty(charSequence)) {
                a = a(Y[72], new String[]{str}, cancellationSignal);
            } else {
                a = a(Y[71], new String[]{str, charSequence}, cancellationSignal);
            }
        }
        return a;
    }

    public static ArrayList h(String str) {
        boolean z = l5.s;
        ArrayList arrayList = new ArrayList();
        try {
            if (!TextUtils.isEmpty(str)) {
                String replaceAll = q.matcher(str).replaceAll(" ");
                BreakIterator a = l.a();
                a.setText(replaceAll);
                int first = a.first();
                int next = a.next();
                while (next != -1) {
                    Object o = o(replaceAll.substring(first, next));
                    try {
                        if (!TextUtils.isEmpty(o)) {
                            if (!Character.isSpaceChar(o.codePointAt(0)) || z) {
                                try {
                                    arrayList.add(o);
                                } catch (IllegalStateException e) {
                                    throw e;
                                }
                            }
                        }
                        first = a.next();
                        if (z) {
                            break;
                        }
                        int i = first;
                        first = next;
                        next = i;
                    } catch (IllegalStateException e2) {
                        throw e2;
                    } catch (IllegalStateException e22) {
                        throw e22;
                    }
                }
            }
            return arrayList;
        } catch (IllegalStateException e222) {
            throw e222;
        }
    }

    static co a(ael com_whatsapp_ael, co coVar) {
        return com_whatsapp_ael.j(coVar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long p(java.lang.String r8) {
        /*
        r7 = this;
        r2 = 1;
        r6 = 0;
        r1 = com.whatsapp.l5.s;
        r0 = r7.l;
        r0 = r0.get(r8);
        r0 = (com.whatsapp.a5w) r0;
        if (r0 != 0) goto L_0x0011;
    L_0x000f:
        r0 = r2;
    L_0x0010:
        return r0;
    L_0x0011:
        r4 = com.whatsapp.a5w.j(r0);	 Catch:{ IllegalStateException -> 0x001e }
        r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r2 == 0) goto L_0x0020;
    L_0x0019:
        r0 = com.whatsapp.a5w.j(r0);	 Catch:{ IllegalStateException -> 0x001e }
        goto L_0x0010;
    L_0x001e:
        r0 = move-exception;
        throw r0;
    L_0x0020:
        r2 = 1;
        r2 = new java.lang.String[r2];
        r2[r6] = r8;
        r3 = r7.a;
        monitor-enter(r3);
        r4 = r7.a;	 Catch:{ all -> 0x0081 }
        r4 = r4.getReadableDatabase();	 Catch:{ all -> 0x0081 }
        r5 = Y;	 Catch:{ all -> 0x0081 }
        r6 = 349; // 0x15d float:4.89E-43 double:1.724E-321;
        r5 = r5[r6];	 Catch:{ all -> 0x0081 }
        r2 = r4.rawQuery(r5, r2);	 Catch:{ all -> 0x0081 }
        if (r2 == 0) goto L_0x0069;
    L_0x003a:
        r4 = r2.moveToFirst();	 Catch:{ IllegalStateException -> 0x0078 }
        if (r4 == 0) goto L_0x004a;
    L_0x0040:
        r4 = 0;
        r4 = r2.getLong(r4);	 Catch:{ IllegalStateException -> 0x0078 }
        com.whatsapp.a5w.e(r0, r4);	 Catch:{ IllegalStateException -> 0x0078 }
        if (r1 == 0) goto L_0x0064;
    L_0x004a:
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x007a }
        r4.<init>();	 Catch:{ IllegalStateException -> 0x007a }
        r5 = Y;	 Catch:{ IllegalStateException -> 0x007a }
        r6 = 348; // 0x15c float:4.88E-43 double:1.72E-321;
        r5 = r5[r6];	 Catch:{ IllegalStateException -> 0x007a }
        r4 = r4.append(r5);	 Catch:{ IllegalStateException -> 0x007a }
        r4 = r4.append(r8);	 Catch:{ IllegalStateException -> 0x007a }
        r4 = r4.toString();	 Catch:{ IllegalStateException -> 0x007a }
        com.whatsapp.util.Log.w(r4);	 Catch:{ IllegalStateException -> 0x007a }
    L_0x0064:
        r2.close();	 Catch:{ all -> 0x0081 }
        if (r1 == 0) goto L_0x0072;
    L_0x0069:
        r1 = Y;	 Catch:{ IllegalStateException -> 0x0084 }
        r2 = 347; // 0x15b float:4.86E-43 double:1.714E-321;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0084 }
        com.whatsapp.util.Log.w(r1);	 Catch:{ IllegalStateException -> 0x0084 }
    L_0x0072:
        monitor-exit(r3);	 Catch:{ all -> 0x0081 }
        r0 = com.whatsapp.a5w.j(r0);
        goto L_0x0010;
    L_0x0078:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x007a }
    L_0x007a:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x007c }
    L_0x007c:
        r0 = move-exception;
        r2.close();	 Catch:{ all -> 0x0081 }
        throw r0;	 Catch:{ all -> 0x0081 }
    L_0x0081:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0081 }
        throw r0;
    L_0x0084:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0081 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.p(java.lang.String):long");
    }

    public static boolean Q() {
        return X.exists();
    }

    public Cursor e(String str) {
        Cursor rawQuery;
        Log.i(Y[268] + str);
        synchronized (this.a) {
            rawQuery = this.a.getReadableDatabase().rawQuery(Y[269], new String[]{str});
        }
        return rawQuery;
    }

    public Cursor a(String str, String str2, CancellationSignal cancellationSignal) {
        Cursor a;
        synchronized (this.a) {
            CharSequence charSequence;
            if (TextUtils.isEmpty(str2)) {
                charSequence = null;
            } else {
                charSequence = f(str2);
            }
            if (TextUtils.isEmpty(charSequence)) {
                a = a(Y[732], new String[]{str}, cancellationSignal);
            } else {
                a = a(Y[731], new String[]{charSequence, str}, cancellationSignal);
            }
        }
        return a;
    }

    public int k(String str) {
        a5w com_whatsapp_a5w = (a5w) this.l.get(str);
        if (com_whatsapp_a5w == null) {
            return 0;
        }
        return a5w.g(com_whatsapp_a5w);
    }

    public void b(Collection collection) {
        Log.i(Y[716] + collection.size());
        this.b.post(new io(this, collection));
    }

    public ArrayList G(String str) {
        return a(str, -1, null);
    }

    public boolean a(c3 c3Var, int i, long j) {
        try {
            if (c3Var.a) {
                this.z.remove(c3Var);
                co a = a(c3Var);
                if (a == null) {
                    try {
                        Log.w(Y[300] + c3Var);
                        return false;
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
                try {
                    if (b7.a(a.d, 4) >= 0) {
                        Log.w(Y[299] + c3Var + Y[302] + a.d + Y[303] + 4);
                        return false;
                    }
                    a.d = 4;
                    a.L = i;
                    long currentTimeMillis = System.currentTimeMillis() - a.b;
                    Log.i(Y[305] + currentTimeMillis + Y[301] + c3Var.b);
                    wo.b(a, currentTimeMillis);
                    d(a, -1);
                    this.b.post(new axb(this, a, j));
                    return true;
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            }
            Log.e(Y[304] + c3Var.c + " " + c3Var.b);
            return false;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    public void v() {
        boolean z = l5.s;
        auv.b();
        for (String a : this.l.keySet()) {
            App.as.a(a, it.ALLOW);
            if (z) {
                return;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long a(java.lang.String r11, com.whatsapp.protocol.co r12, boolean r13, java.lang.String r14) {
        /*
        r10 = this;
        r2 = com.whatsapp.l5.s;
        r3 = new com.whatsapp.util.ab;
        r0 = Y;
        r1 = 282; // 0x11a float:3.95E-43 double:1.393E-321;
        r0 = r0[r1];
        r3.<init>(r0);
        r4 = r10.b(r12);
        r0 = 1;
        r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r0 != 0) goto L_0x0025;
    L_0x0017:
        r0 = Y;	 Catch:{ IllegalStateException -> 0x0023 }
        r1 = 283; // 0x11b float:3.97E-43 double:1.4E-321;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x0023 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IllegalStateException -> 0x0023 }
        r0 = 0;
    L_0x0022:
        return r0;
    L_0x0023:
        r0 = move-exception;
        throw r0;
    L_0x0025:
        r0 = "'";
        r1 = Y;
        r6 = 294; // 0x126 float:4.12E-43 double:1.453E-321;
        r1 = r1[r6];
        r0 = r14.replace(r0, r1);
        r1 = "%";
        r6 = Y;
        r7 = 274; // 0x112 float:3.84E-43 double:1.354E-321;
        r6 = r6[r7];
        r0 = r0.replace(r1, r6);
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r6 = Y;
        r7 = 284; // 0x11c float:3.98E-43 double:1.403E-321;
        r6 = r6[r7];
        r1 = r1.append(r6);
        r1 = r1.append(r0);
        r6 = Y;
        r7 = 281; // 0x119 float:3.94E-43 double:1.39E-321;
        r6 = r6[r7];
        r1 = r1.append(r6);
        r6 = 0;
        r1 = r1.append(r6);
        r6 = Y;
        r7 = 295; // 0x127 float:4.13E-43 double:1.457E-321;
        r6 = r6[r7];
        r1 = r1.append(r6);
        r1 = r1.toString();
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r7 = Y;
        r8 = 271; // 0x10f float:3.8E-43 double:1.34E-321;
        r7 = r7[r8];
        r6 = r6.append(r7);
        r6 = r6.append(r0);
        r7 = Y;
        r8 = 290; // 0x122 float:4.06E-43 double:1.433E-321;
        r7 = r7[r8];
        r6 = r6.append(r7);
        r7 = 5;
        r6 = r6.append(r7);
        r7 = Y;
        r8 = 289; // 0x121 float:4.05E-43 double:1.43E-321;
        r7 = r7[r8];
        r6 = r6.append(r7);
        r6 = r6.toString();
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r8 = Y;
        r9 = 280; // 0x118 float:3.92E-43 double:1.383E-321;
        r8 = r8[r9];
        r7 = r7.append(r8);
        r0 = r7.append(r0);
        r7 = Y;
        r8 = 277; // 0x115 float:3.88E-43 double:1.37E-321;
        r7 = r7[r8];
        r0 = r0.append(r7);
        r7 = 0;
        r0 = r0.append(r7);
        r7 = Y;
        r8 = 296; // 0x128 float:4.15E-43 double:1.46E-321;
        r7 = r7[r8];
        r0 = r0.append(r7);
        r0 = r0.toString();
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r8 = "(";
        r7 = r7.append(r8);
        r1 = r7.append(r1);
        r7 = Y;
        r8 = 292; // 0x124 float:4.09E-43 double:1.443E-321;
        r7 = r7[r8];
        r1 = r1.append(r7);
        r1 = r1.append(r6);
        r6 = Y;
        r7 = 275; // 0x113 float:3.85E-43 double:1.36E-321;
        r6 = r6[r7];
        r1 = r1.append(r6);
        r0 = r1.append(r0);
        r1 = ")";
        r0 = r0.append(r1);
        r0 = r0.toString();
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r6 = Y;
        r7 = 293; // 0x125 float:4.1E-43 double:1.45E-321;
        r6 = r6[r7];
        r1 = r1.append(r6);
        r0 = r1.append(r0);
        r0 = r0.toString();
        if (r13 == 0) goto L_0x015a;
    L_0x011f:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = r1.append(r0);
        r1 = Y;
        r6 = 276; // 0x114 float:3.87E-43 double:1.364E-321;
        r1 = r1[r6];
        r0 = r0.append(r1);
        r0 = r0.append(r4);
        r1 = Y;
        r6 = 287; // 0x11f float:4.02E-43 double:1.42E-321;
        r1 = r1[r6];
        r0 = r0.append(r1);
        r1 = Y;
        r6 = 286; // 0x11e float:4.01E-43 double:1.413E-321;
        r1 = r1[r6];
        r0 = r0.append(r1);
        r1 = Y;
        r6 = 273; // 0x111 float:3.83E-43 double:1.35E-321;
        r1 = r1[r6];
        r0 = r0.append(r1);
        r0 = r0.toString();
        if (r2 == 0) goto L_0x0193;
    L_0x015a:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = r1.append(r0);
        r1 = Y;
        r6 = 297; // 0x129 float:4.16E-43 double:1.467E-321;
        r1 = r1[r6];
        r0 = r0.append(r1);
        r0 = r0.append(r4);
        r1 = Y;
        r4 = 285; // 0x11d float:4.0E-43 double:1.41E-321;
        r1 = r1[r4];
        r0 = r0.append(r1);
        r1 = Y;
        r4 = 272; // 0x110 float:3.81E-43 double:1.344E-321;
        r1 = r1[r4];
        r0 = r0.append(r1);
        r1 = Y;
        r4 = 288; // 0x120 float:4.04E-43 double:1.423E-321;
        r1 = r1[r4];
        r0 = r0.append(r1);
        r0 = r0.toString();
    L_0x0193:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = r1.append(r0);
        r1 = Y;
        r4 = 279; // 0x117 float:3.91E-43 double:1.38E-321;
        r1 = r1[r4];
        r0 = r0.append(r1);
        r4 = r0.toString();
        r0 = 0;
        r5 = r10.a;
        monitor-enter(r5);
        r6 = 1;
        r6 = new java.lang.String[r6];	 Catch:{ all -> 0x0217 }
        r7 = 0;
        r6[r7] = r11;	 Catch:{ all -> 0x0217 }
        r7 = r10.a;	 Catch:{ all -> 0x0217 }
        r7 = r7.getReadableDatabase();	 Catch:{ all -> 0x0217 }
        r4 = r7.rawQuery(r4, r6);	 Catch:{ all -> 0x0217 }
        if (r4 == 0) goto L_0x01da;
    L_0x01c1:
        r6 = r4.moveToNext();	 Catch:{ all -> 0x0212 }
        if (r6 == 0) goto L_0x01d5;
    L_0x01c7:
        r0 = Y;	 Catch:{ all -> 0x0212 }
        r1 = 291; // 0x123 float:4.08E-43 double:1.44E-321;
        r0 = r0[r1];	 Catch:{ all -> 0x0212 }
        r0 = r4.getColumnIndex(r0);	 Catch:{ all -> 0x0212 }
        r0 = r4.getLong(r0);	 Catch:{ all -> 0x0212 }
    L_0x01d5:
        r4.close();	 Catch:{ all -> 0x0217 }
        if (r2 == 0) goto L_0x01e3;
    L_0x01da:
        r2 = Y;	 Catch:{ IllegalStateException -> 0x021a }
        r4 = 278; // 0x116 float:3.9E-43 double:1.374E-321;
        r2 = r2[r4];	 Catch:{ IllegalStateException -> 0x021a }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IllegalStateException -> 0x021a }
    L_0x01e3:
        monitor-exit(r5);	 Catch:{ all -> 0x0217 }
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r4 = Y;
        r5 = 270; // 0x10e float:3.78E-43 double:1.334E-321;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r4 = r3.b();
        r2 = r2.append(r4);
        r3 = Y;
        r4 = 298; // 0x12a float:4.18E-43 double:1.47E-321;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r0);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        goto L_0x0022;
    L_0x0212:
        r0 = move-exception;
        r4.close();	 Catch:{ all -> 0x0217 }
        throw r0;	 Catch:{ all -> 0x0217 }
    L_0x0217:
        r0 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x0217 }
        throw r0;
    L_0x021a:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0217 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.a(java.lang.String, com.whatsapp.protocol.co, boolean, java.lang.String):long");
    }

    public void o() {
        long length = X.length();
        Log.i(Y[509] + length + Y[516] + b(Y[514], 0));
        ab abVar = new ab(Y[518]);
        do {
            try {
            } catch (IllegalStateException e) {
                throw e;
            }
        } while (b(2048) == 2048);
        Log.i(Y[513] + abVar.b());
        abVar = new ab(Y[510]);
        ContentValues contentValues = new ContentValues(1);
        contentValues.put(Y[515], Y[512]);
        this.a.getReadableDatabase().insert(Y[505], null, contentValues);
        Log.i(Y[511] + abVar.b());
        d(Y[507], 1);
        d(Y[517], 1);
        long length2 = X.length();
        Log.i(Y[506] + length2 + Y[508] + (((double) length2) / ((double) length)));
    }

    private Set a(SQLiteDatabase sQLiteDatabase, String str) {
        boolean z = l5.s;
        Set hashSet = new HashSet();
        Cursor query = sQLiteDatabase.query(Y[30], new String[]{Y[28]}, Y[29], new String[]{str}, null, null, null);
        do {
            try {
                if (!query.moveToNext()) {
                    break;
                }
                CharSequence string = query.getString(0);
                try {
                    if (TextUtils.isEmpty(string)) {
                        hashSet.add(App.as.e().p);
                        if (!z) {
                            continue;
                        }
                    }
                    hashSet.add(string);
                } catch (IllegalStateException e) {
                    throw e;
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            } catch (Throwable th) {
                query.close();
            }
        } while (!z);
        query.close();
        return hashSet;
    }

    static Handler a(ael com_whatsapp_ael) {
        return com_whatsapp_ael.O;
    }

    static void a(ael com_whatsapp_ael, co coVar, long j) {
        com_whatsapp_ael.a(coVar, j);
    }

    public void b(c3 c3Var) {
        Object obj = 1;
        ContentValues contentValues = new ContentValues();
        contentValues.put(Y[18], Integer.valueOf(14));
        synchronized (this.a) {
            String str;
            SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
            String str2 = Y[17];
            String str3 = Y[16];
            String[] strArr = new String[3];
            strArr[0] = c3Var.c;
            if (c3Var.a) {
                str = "1";
            } else {
                str = "0";
            }
            try {
                strArr[1] = str;
                strArr[2] = c3Var.b;
                if (writableDatabase.update(str2, contentValues, str3, strArr) <= 0) {
                    obj = null;
                }
                if (obj != null) {
                    a(new aef(this, c3Var));
                }
            } catch (IllegalStateException e) {
                throw e;
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }
    }

    public ArrayList C() {
        long av = App.av();
        try {
            if (!this.P.get()) {
                M();
            }
            return b(av);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public long d(String str) {
        a5w com_whatsapp_a5w = (a5w) this.l.get(str);
        if (com_whatsapp_a5w == null) {
            return 0;
        }
        return a5w.l(com_whatsapp_a5w);
    }

    boolean D() {
        boolean z;
        synchronized (this.a) {
            if (e()) {
                try {
                    if (x()) {
                        z = true;
                    }
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
            z = false;
        }
        return z;
    }

    private static void b(co coVar, SQLiteStatement sQLiteStatement) {
        try {
            long j;
            sQLiteStatement.bindLong(1, (long) coVar.d);
            sQLiteStatement.bindLong(2, 2);
            a(coVar, sQLiteStatement, 4, 3);
            sQLiteStatement.bindLong(5, coVar.b);
            a5f.a(6, coVar.q, sQLiteStatement);
            a5f.a(7, coVar.n, sQLiteStatement);
            sQLiteStatement.bindLong(8, (long) coVar.c);
            sQLiteStatement.bindLong(9, coVar.z);
            a5f.a(10, coVar.A, sQLiteStatement);
            a5f.a(11, coVar.a, sQLiteStatement);
            a5f.a(12, coVar.o, sQLiteStatement);
            if (coVar.c == 9) {
                j = (long) coVar.R;
            } else {
                j = (long) coVar.H;
            }
            sQLiteStatement.bindLong(13, j);
            sQLiteStatement.bindLong(14, (long) coVar.r);
            sQLiteStatement.bindDouble(15, coVar.m);
            sQLiteStatement.bindDouble(16, coVar.l);
            a5f.a(17, a(coVar.Q), sQLiteStatement);
            sQLiteStatement.bindString(18, coVar.k.b);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long b(com.whatsapp.protocol.co r11) {
        /*
        r10 = this;
        r1 = 1;
        r2 = 0;
        r4 = 1;
        if (r11 != 0) goto L_0x0008;
    L_0x0006:
        r0 = r4;
    L_0x0007:
        return r0;
    L_0x0008:
        r0 = 3;
        r3 = new java.lang.String[r0];	 Catch:{ IllegalStateException -> 0x0065 }
        r0 = 0;
        r6 = r11.k;	 Catch:{ IllegalStateException -> 0x0065 }
        r6 = r6.c;	 Catch:{ IllegalStateException -> 0x0065 }
        r3[r0] = r6;	 Catch:{ IllegalStateException -> 0x0065 }
        r0 = r11.k;	 Catch:{ IllegalStateException -> 0x0065 }
        r0 = r0.a;	 Catch:{ IllegalStateException -> 0x0065 }
        if (r0 == 0) goto L_0x0067;
    L_0x0018:
        r0 = r1;
    L_0x0019:
        r0 = java.lang.String.valueOf(r0);
        r3[r1] = r0;
        r0 = 2;
        r6 = r11.k;
        r6 = r6.b;
        r3[r0] = r6;
        r6 = r10.a;
        monitor-enter(r6);
        r0 = r10.a;	 Catch:{ all -> 0x0062 }
        r0 = r0.getReadableDatabase();	 Catch:{ all -> 0x0062 }
        r7 = Y;	 Catch:{ all -> 0x0062 }
        r8 = 476; // 0x1dc float:6.67E-43 double:2.35E-321;
        r7 = r7[r8];	 Catch:{ all -> 0x0062 }
        r3 = r0.rawQuery(r7, r3);	 Catch:{ all -> 0x0062 }
        if (r3 == 0) goto L_0x0072;
    L_0x003b:
        r0 = r3.moveToLast();	 Catch:{ all -> 0x006b }
        if (r0 == 0) goto L_0x004f;
    L_0x0041:
        r0 = 0;
        r4 = r3.getLong(r0);	 Catch:{ all -> 0x006b }
        r8 = 0;
        r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r0 < 0) goto L_0x0069;
    L_0x004c:
        com.whatsapp.util.Log.b(r1);	 Catch:{ all -> 0x006b }
    L_0x004f:
        r0 = r4;
        r3.close();	 Catch:{ all -> 0x0062 }
        r2 = com.whatsapp.l5.s;	 Catch:{ IllegalStateException -> 0x0070 }
        if (r2 == 0) goto L_0x0060;
    L_0x0057:
        r2 = Y;	 Catch:{ IllegalStateException -> 0x0070 }
        r3 = 477; // 0x1dd float:6.68E-43 double:2.357E-321;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0070 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IllegalStateException -> 0x0070 }
    L_0x0060:
        monitor-exit(r6);	 Catch:{ all -> 0x0062 }
        goto L_0x0007;
    L_0x0062:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0062 }
        throw r0;
    L_0x0065:
        r0 = move-exception;
        throw r0;
    L_0x0067:
        r0 = r2;
        goto L_0x0019;
    L_0x0069:
        r1 = r2;
        goto L_0x004c;
    L_0x006b:
        r0 = move-exception;
        r3.close();	 Catch:{ all -> 0x0062 }
        throw r0;	 Catch:{ all -> 0x0062 }
    L_0x0070:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0062 }
    L_0x0072:
        r0 = r4;
        goto L_0x0057;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.b(com.whatsapp.protocol.co):long");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList b(java.lang.String r9, int r10) {
        /*
        r8 = this;
        r7 = 2;
        r6 = 1;
        r2 = com.whatsapp.l5.s;
        r1 = new java.util.ArrayList;
        r1.<init>();
        if (r10 != r6) goto L_0x0047;
    L_0x000b:
        r3 = r8.m(r9);
        if (r3 != 0) goto L_0x0013;
    L_0x0011:
        r0 = r1;
    L_0x0012:
        return r0;
    L_0x0013:
        r0 = r3.k;	 Catch:{ SQLiteDatabaseCorruptException -> 0x003b }
        r0 = r0.a;	 Catch:{ SQLiteDatabaseCorruptException -> 0x003b }
        if (r0 == 0) goto L_0x001f;
    L_0x0019:
        r0 = com.whatsapp.qm.a(r3);	 Catch:{ SQLiteDatabaseCorruptException -> 0x003b }
        if (r0 == 0) goto L_0x0047;
    L_0x001f:
        r0 = r3.c;	 Catch:{ SQLiteDatabaseCorruptException -> 0x003d }
        if (r0 != r7) goto L_0x0036;
    L_0x0023:
        r0 = r3.r;	 Catch:{ SQLiteDatabaseCorruptException -> 0x003f }
        if (r0 != r6) goto L_0x0036;
    L_0x0027:
        r0 = r3.Q;
        r0 = (com.whatsapp.MediaData) r0;
        if (r0 == 0) goto L_0x0034;
    L_0x002d:
        r0 = r0.transferred;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0041 }
        if (r0 == 0) goto L_0x0034;
    L_0x0031:
        r1.add(r3);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0043 }
    L_0x0034:
        if (r2 == 0) goto L_0x0039;
    L_0x0036:
        r1.add(r3);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0045 }
    L_0x0039:
        r0 = r1;
        goto L_0x0012;
    L_0x003b:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x003d }
    L_0x003d:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x003f }
    L_0x003f:
        r0 = move-exception;
        throw r0;
    L_0x0041:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0043 }
    L_0x0043:
        r0 = move-exception;
        throw r0;
    L_0x0045:
        r0 = move-exception;
        throw r0;
    L_0x0047:
        r0 = r8.a;
        r0 = r0.getReadableDatabase();
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = Y;
        r5 = 648; // 0x288 float:9.08E-43 double:3.2E-321;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r3 = r3.append(r10);
        r3 = r3.toString();
        r4 = new java.lang.String[r6];
        r5 = 0;
        r4[r5] = r9;
        r3 = r0.rawQuery(r3, r4);
        if (r3 == 0) goto L_0x009c;
    L_0x006f:
        r0 = r3.moveToNext();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00a1, IllegalStateException -> 0x00b4 }
        if (r0 == 0) goto L_0x0099;
    L_0x0075:
        r4 = r8.a(r3, r9);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00a1, IllegalStateException -> 0x00b4 }
        if (r4 != 0) goto L_0x007d;
    L_0x007b:
        if (r2 == 0) goto L_0x006f;
    L_0x007d:
        r0 = r4.c;	 Catch:{ SQLiteDatabaseCorruptException -> 0x009f, IllegalStateException -> 0x00b4 }
        if (r0 != r7) goto L_0x0094;
    L_0x0081:
        r0 = r4.r;	 Catch:{ SQLiteDatabaseCorruptException -> 0x009f, IllegalStateException -> 0x00b4 }
        if (r0 != r6) goto L_0x0094;
    L_0x0085:
        r0 = r4.Q;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00a1, IllegalStateException -> 0x00b4 }
        r0 = (com.whatsapp.MediaData) r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00a1, IllegalStateException -> 0x00b4 }
        if (r0 == 0) goto L_0x0092;
    L_0x008b:
        r0 = r0.transferred;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00b0, IllegalStateException -> 0x00b4 }
        if (r0 == 0) goto L_0x0092;
    L_0x008f:
        r1.add(r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00b2, IllegalStateException -> 0x00b4 }
    L_0x0092:
        if (r2 == 0) goto L_0x0097;
    L_0x0094:
        r1.add(r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00d7, IllegalStateException -> 0x00b4 }
    L_0x0097:
        if (r2 == 0) goto L_0x006f;
    L_0x0099:
        r3.close();
    L_0x009c:
        r0 = r1;
        goto L_0x0012;
    L_0x009f:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00a1, IllegalStateException -> 0x00b4 }
    L_0x00a1:
        r0 = move-exception;
        r8.r();	 Catch:{ all -> 0x00ab }
        r1 = new java.lang.AssertionError;	 Catch:{ all -> 0x00ab }
        r1.<init>(r0);	 Catch:{ all -> 0x00ab }
        throw r1;	 Catch:{ all -> 0x00ab }
    L_0x00ab:
        r0 = move-exception;
        r3.close();
        throw r0;
    L_0x00b0:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00b2, IllegalStateException -> 0x00b4 }
    L_0x00b2:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00a1, IllegalStateException -> 0x00b4 }
    L_0x00b4:
        r0 = move-exception;
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00ab }
        r2.<init>();	 Catch:{ all -> 0x00ab }
        r4 = Y;	 Catch:{ all -> 0x00ab }
        r5 = 647; // 0x287 float:9.07E-43 double:3.197E-321;
        r4 = r4[r5];	 Catch:{ all -> 0x00ab }
        r2 = r2.append(r4);	 Catch:{ all -> 0x00ab }
        r0 = r0.toString();	 Catch:{ all -> 0x00ab }
        r0 = r2.append(r0);	 Catch:{ all -> 0x00ab }
        r0 = r0.toString();	 Catch:{ all -> 0x00ab }
        com.whatsapp.util.Log.i(r0);	 Catch:{ all -> 0x00ab }
        r3.close();
        goto L_0x009c;
    L_0x00d7:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00a1, IllegalStateException -> 0x00b4 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.b(java.lang.String, int):java.util.ArrayList");
    }

    public void a(Collection collection) {
        boolean z = l5.s;
        Log.i(Y[342] + Arrays.deepToString(Collections.list(Collections.enumeration(collection)).toArray()));
        synchronized (this.a) {
            SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
            writableDatabase.beginTransaction();
            for (aoy com_whatsapp_aoy : collection) {
                writableDatabase.delete(Y[343], Y[345], new String[]{com_whatsapp_aoy.h()});
                for (adl com_whatsapp_adl : com_whatsapp_aoy.c()) {
                    ContentValues contentValues = new ContentValues();
                    try {
                        String str;
                        int i;
                        contentValues.put(Y[346], com_whatsapp_aoy.h());
                        String str2 = Y[338];
                        if (com_whatsapp_adl.a()) {
                            str = "";
                        } else {
                            str = com_whatsapp_adl.e;
                        }
                        contentValues.put(str2, str);
                        contentValues.put(Y[340], Integer.valueOf(com_whatsapp_adl.d ? 1 : 0));
                        str2 = Y[344];
                        if (com_whatsapp_adl.b) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        contentValues.put(str2, Integer.valueOf(i));
                        contentValues.put(Y[339], Boolean.valueOf(com_whatsapp_adl.a));
                        writableDatabase.insert(Y[341], null, contentValues);
                        if (z) {
                            break;
                            continue;
                        }
                    } catch (IllegalStateException e) {
                        throw e;
                    } catch (IllegalStateException e2) {
                        throw e2;
                    } catch (IllegalStateException e22) {
                        throw e22;
                    } catch (Throwable th) {
                        try {
                            if (writableDatabase.inTransaction()) {
                                writableDatabase.endTransaction();
                            }
                        } catch (IllegalStateException e222) {
                            throw e222;
                        }
                    }
                }
                if (z) {
                    break;
                }
            }
            writableDatabase.setTransactionSuccessful();
            if (writableDatabase.inTransaction()) {
                writableDatabase.endTransaction();
            }
        }
    }

    public Cursor w() {
        Cursor rawQuery;
        String[] strArr = new String[]{Y[568]};
        synchronized (this.a) {
            rawQuery = this.a.getReadableDatabase().rawQuery(Y[567], strArr);
        }
        return rawQuery;
    }

    static boolean a(ael com_whatsapp_ael, String str) {
        return com_whatsapp_ael.M(str);
    }

    static void T() {
        try {
            if (X.exists()) {
                if (!X.delete()) {
                    Log.w(Y[633]);
                }
            }
            try {
                if (m.exists()) {
                    a1.a(m, X);
                    if (!l5.s) {
                        return;
                    }
                }
                Log.w(Y[634]);
            } catch (IllegalStateException e) {
                throw e;
            } catch (IllegalStateException e2) {
                throw e2;
            }
        } catch (IllegalStateException e22) {
            throw e22;
        } catch (IllegalStateException e222) {
            throw e222;
        }
    }

    static void a(ael com_whatsapp_ael, int i, co coVar) {
        com_whatsapp_ael.a(i, coVar);
    }

    public void a(co coVar, int i, boolean z, int i2) {
        if (!z && i2 == 0) {
            try {
                if (!coVar.k.a) {
                    a4r F = Conversation.F();
                    try {
                        if (F.a()) {
                            if (F.b().ae.equals(coVar.k.c)) {
                                coVar.d = 13;
                            }
                        }
                    } catch (IllegalStateException e) {
                        throw e;
                    } catch (IllegalStateException e2) {
                        throw e2;
                    }
                }
            } catch (IllegalStateException e22) {
                throw e22;
            }
        }
        f(coVar);
        a(i, coVar);
    }

    public ArrayList H(String str) {
        boolean z = l5.s;
        ArrayList arrayList = new ArrayList();
        synchronized (this.a) {
            Calendar.getInstance().add(5, -1);
            Cursor rawQuery = this.a.getReadableDatabase().rawQuery(k, new String[]{str, Long.toString(r3.getTimeInMillis())});
            if (rawQuery != null) {
                do {
                    try {
                        if (!rawQuery.moveToNext()) {
                            break;
                        }
                        arrayList.add(a(rawQuery, str));
                    } catch (SQLiteDiskIOException e) {
                        p.a(App.z(), 2131231111);
                        throw e;
                    } catch (Throwable th) {
                        rawQuery.close();
                    }
                } while (!z);
                Log.i(Y[326] + arrayList.size());
                rawQuery.close();
            } else {
                Log.e(Y[327]);
            }
        }
        return arrayList;
    }

    public Collection i() {
        boolean z = l5.s;
        Collection hashSet = new HashSet();
        long currentTimeMillis = System.currentTimeMillis() - 86400000;
        Cursor rawQuery = this.a.getReadableDatabase().rawQuery(d, new String[]{String.valueOf(14), String.valueOf(currentTimeMillis)});
        if (rawQuery != null) {
            do {
                try {
                    if (!rawQuery.moveToNext()) {
                        break;
                    }
                    hashSet.add(rawQuery.getString(0));
                } catch (Throwable th) {
                    rawQuery.close();
                }
            } while (!z);
            rawQuery.close();
        }
        return hashSet;
    }

    public int F() {
        return this.t.e();
    }

    public void a(String str, boolean z, boolean z2) {
        a5w com_whatsapp_a5w = (a5w) this.l.get(str);
        if (com_whatsapp_a5w == null) {
            try {
                Log.w(Y[357] + str + " " + z);
                return;
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        try {
            if (a5w.i(com_whatsapp_a5w) == z) {
                Log.w(Y[358] + str + " " + z);
                return;
            }
            try {
                a5w.a(com_whatsapp_a5w, z);
                this.n.a(str, true);
                this.b.post(new rk(this, z, str));
                if (z2) {
                    int i;
                    if (z) {
                        i = 3;
                    } else {
                        i = 4;
                    }
                    App.a(i, str, 0, 0);
                }
            } catch (IllegalStateException e2) {
                throw e2;
            } catch (IllegalStateException e22) {
                throw e22;
            }
        } catch (IllegalStateException e222) {
            throw e222;
        }
    }

    public void b(akc com_whatsapp_akc) {
        this.U.registerObserver(com_whatsapp_akc);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.concurrent.ConcurrentLinkedQueue a(long r10, com.whatsapp.a57 r12) {
        /*
        r9 = this;
        r0 = com.whatsapp.l5.s;
        r1 = new java.util.concurrent.ConcurrentLinkedQueue;
        r1.<init>();
        r2 = r9.a;
        monitor-enter(r2);
        r3 = r9.a;	 Catch:{ all -> 0x0099 }
        r3 = r3.getReadableDatabase();	 Catch:{ all -> 0x0099 }
        r4 = Y;	 Catch:{ all -> 0x0099 }
        r5 = 248; // 0xf8 float:3.48E-43 double:1.225E-321;
        r4 = r4[r5];	 Catch:{ all -> 0x0099 }
        r5 = 1;
        r5 = new java.lang.String[r5];	 Catch:{ all -> 0x0099 }
        r6 = 0;
        r7 = java.lang.Long.toString(r10);	 Catch:{ all -> 0x0099 }
        r5[r6] = r7;	 Catch:{ all -> 0x0099 }
        r3 = r3.rawQuery(r4, r5);	 Catch:{ all -> 0x0099 }
        if (r3 == 0) goto L_0x005d;
    L_0x0026:
        r4 = Y;	 Catch:{ all -> 0x0099 }
        r5 = 249; // 0xf9 float:3.49E-43 double:1.23E-321;
        r4 = r4[r5];	 Catch:{ all -> 0x0099 }
        r4 = r3.getColumnIndex(r4);	 Catch:{ all -> 0x0099 }
    L_0x0030:
        r5 = r3.moveToNext();	 Catch:{ SQLiteDiskIOException -> 0x0088 }
        if (r5 == 0) goto L_0x0058;
    L_0x0036:
        if (r12 == 0) goto L_0x003e;
    L_0x0038:
        r5 = r12.a();	 Catch:{ SQLiteDiskIOException -> 0x0086 }
        if (r5 != 0) goto L_0x0058;
    L_0x003e:
        r5 = r3.getString(r4);	 Catch:{ SQLiteDiskIOException -> 0x0088 }
        if (r5 != 0) goto L_0x004f;
    L_0x0044:
        r6 = Y;	 Catch:{ SQLiteDiskIOException -> 0x009c }
        r7 = 250; // 0xfa float:3.5E-43 double:1.235E-321;
        r6 = r6[r7];	 Catch:{ SQLiteDiskIOException -> 0x009c }
        com.whatsapp.util.Log.w(r6);	 Catch:{ SQLiteDiskIOException -> 0x009c }
        if (r0 == 0) goto L_0x0030;
    L_0x004f:
        r5 = r9.a(r3, r5);	 Catch:{ SQLiteDiskIOException -> 0x0088 }
        r1.add(r5);	 Catch:{ SQLiteDiskIOException -> 0x0088 }
        if (r0 == 0) goto L_0x0030;
    L_0x0058:
        r3.close();	 Catch:{ all -> 0x0099 }
        if (r0 == 0) goto L_0x0066;
    L_0x005d:
        r0 = Y;	 Catch:{ SQLiteDiskIOException -> 0x009e }
        r3 = 252; // 0xfc float:3.53E-43 double:1.245E-321;
        r0 = r0[r3];	 Catch:{ SQLiteDiskIOException -> 0x009e }
        com.whatsapp.util.Log.e(r0);	 Catch:{ SQLiteDiskIOException -> 0x009e }
    L_0x0066:
        monitor-exit(r2);	 Catch:{ all -> 0x0099 }
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = Y;
        r3 = 251; // 0xfb float:3.52E-43 double:1.24E-321;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r2 = r1.size();
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        return r1;
    L_0x0086:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x0088 }
    L_0x0088:
        r0 = move-exception;
        r1 = com.whatsapp.App.z();	 Catch:{ all -> 0x0094 }
        r4 = 2131231111; // 0x7f080187 float:1.8078294E38 double:1.0529680753E-314;
        com.whatsapp.util.p.a(r1, r4);	 Catch:{ all -> 0x0094 }
        throw r0;	 Catch:{ all -> 0x0094 }
    L_0x0094:
        r0 = move-exception;
        r3.close();	 Catch:{ all -> 0x0099 }
        throw r0;	 Catch:{ all -> 0x0099 }
    L_0x0099:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0099 }
        throw r0;
    L_0x009c:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDiskIOException -> 0x0088 }
    L_0x009e:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0099 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.a(long, com.whatsapp.a57):java.util.concurrent.ConcurrentLinkedQueue");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.whatsapp.protocol.co r11, boolean r12) {
        /*
        r10 = this;
        r7 = 2;
        r1 = 0;
        r2 = 1;
        r4 = com.whatsapp.l5.s;
        r0 = r11.Q;
        r0 = (com.whatsapp.MediaData) r0;
        if (r0 == 0) goto L_0x0018;
    L_0x000b:
        r3 = r0.file;	 Catch:{ IOException -> 0x0050 }
        if (r3 == 0) goto L_0x0018;
    L_0x000f:
        r3 = r0.file;	 Catch:{ IOException -> 0x0052 }
        r3 = com.whatsapp.dg.d(r3);	 Catch:{ IOException -> 0x0052 }
        if (r3 == 0) goto L_0x0018;
    L_0x0017:
        r1 = r2;
    L_0x0018:
        if (r1 == 0) goto L_0x004f;
    L_0x001a:
        r1 = r11.c;	 Catch:{ IOException -> 0x0061 }
        if (r1 != r7) goto L_0x0023;
    L_0x001e:
        r1 = r11.r;	 Catch:{ IOException -> 0x0063 }
        if (r1 != r2) goto L_0x0023;
    L_0x0022:
        r12 = r2;
    L_0x0023:
        r1 = r0.file;
        r1 = r1.getAbsolutePath();
        r3 = r10.c(r1);
        if (r3 != 0) goto L_0x0073;
    L_0x002f:
        if (r12 == 0) goto L_0x0073;
    L_0x0031:
        r1 = r0.file;	 Catch:{ IOException -> 0x0065 }
        r1.delete();	 Catch:{ IOException -> 0x0065 }
        r1 = com.whatsapp.App.at;	 Catch:{ UnsupportedOperationException -> 0x0067, IllegalArgumentException -> 0x00a9, SecurityException -> 0x00ab }
        r5 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI;	 Catch:{ UnsupportedOperationException -> 0x0067, IllegalArgumentException -> 0x00a9, SecurityException -> 0x00ab }
        r6 = Y;	 Catch:{ UnsupportedOperationException -> 0x0067, IllegalArgumentException -> 0x00a9, SecurityException -> 0x00ab }
        r7 = 484; // 0x1e4 float:6.78E-43 double:2.39E-321;
        r6 = r6[r7];	 Catch:{ UnsupportedOperationException -> 0x0067, IllegalArgumentException -> 0x00a9, SecurityException -> 0x00ab }
        r7 = 1;
        r7 = new java.lang.String[r7];	 Catch:{ UnsupportedOperationException -> 0x0067, IllegalArgumentException -> 0x00a9, SecurityException -> 0x00ab }
        r8 = 0;
        r9 = r0.file;	 Catch:{ UnsupportedOperationException -> 0x0067, IllegalArgumentException -> 0x00a9, SecurityException -> 0x00ab }
        r9 = r9.getAbsolutePath();	 Catch:{ UnsupportedOperationException -> 0x0067, IllegalArgumentException -> 0x00a9, SecurityException -> 0x00ab }
        r7[r8] = r9;	 Catch:{ UnsupportedOperationException -> 0x0067, IllegalArgumentException -> 0x00a9, SecurityException -> 0x00ab }
        r1.delete(r5, r6, r7);	 Catch:{ UnsupportedOperationException -> 0x0067, IllegalArgumentException -> 0x00a9, SecurityException -> 0x00ab }
    L_0x004f:
        return;
    L_0x0050:
        r3 = move-exception;
        throw r3;	 Catch:{ IOException -> 0x0052 }
    L_0x0052:
        r3 = move-exception;
        throw r3;	 Catch:{ IOException -> 0x0054 }
    L_0x0054:
        r3 = move-exception;
        throw r3;	 Catch:{ IOException -> 0x0056 }
    L_0x0056:
        r3 = move-exception;
        r5 = Y;
        r6 = 485; // 0x1e5 float:6.8E-43 double:2.396E-321;
        r5 = r5[r6];
        com.whatsapp.util.Log.b(r5, r3);
        goto L_0x0018;
    L_0x0061:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0063 }
    L_0x0063:
        r0 = move-exception;
        throw r0;
    L_0x0065:
        r0 = move-exception;
        throw r0;
    L_0x0067:
        r1 = move-exception;
    L_0x0068:
        r5 = Y;	 Catch:{ IOException -> 0x00a5 }
        r6 = 486; // 0x1e6 float:6.81E-43 double:2.4E-321;
        r5 = r5[r6];	 Catch:{ IOException -> 0x00a5 }
        com.whatsapp.util.Log.b(r5, r1);	 Catch:{ IOException -> 0x00a5 }
        if (r4 == 0) goto L_0x004f;
    L_0x0073:
        if (r3 != r2) goto L_0x0088;
    L_0x0075:
        r1 = r10.A;	 Catch:{ IOException -> 0x00a3 }
        r2 = 1;
        r5 = r0.file;	 Catch:{ IOException -> 0x00a3 }
        r5 = r5.getAbsolutePath();	 Catch:{ IOException -> 0x00a3 }
        r1.bindString(r2, r5);	 Catch:{ IOException -> 0x00a3 }
        r1 = r10.A;	 Catch:{ IOException -> 0x00a3 }
        r1.execute();	 Catch:{ IOException -> 0x00a3 }
        if (r4 == 0) goto L_0x004f;
    L_0x0088:
        r1 = r10.S;	 Catch:{ IOException -> 0x00a3 }
        r2 = 1;
        r3 = r3 + -1;
        r4 = (long) r3;	 Catch:{ IOException -> 0x00a3 }
        r1.bindLong(r2, r4);	 Catch:{ IOException -> 0x00a3 }
        r1 = r10.S;	 Catch:{ IOException -> 0x00a3 }
        r2 = 2;
        r0 = r0.file;	 Catch:{ IOException -> 0x00a3 }
        r0 = r0.getAbsolutePath();	 Catch:{ IOException -> 0x00a3 }
        r1.bindString(r2, r0);	 Catch:{ IOException -> 0x00a3 }
        r0 = r10.S;	 Catch:{ IOException -> 0x00a3 }
        r0.execute();	 Catch:{ IOException -> 0x00a3 }
        goto L_0x004f;
    L_0x00a3:
        r0 = move-exception;
        throw r0;
    L_0x00a5:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00a7 }
    L_0x00a7:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00a3 }
    L_0x00a9:
        r1 = move-exception;
        goto L_0x0068;
    L_0x00ab:
        r1 = move-exception;
        goto L_0x0068;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.a(com.whatsapp.protocol.co, boolean):void");
    }

    static void L() {
        try {
            if (m.exists()) {
                if (!m.delete()) {
                    Log.w(Y[663]);
                }
            }
            try {
                if (X.exists()) {
                    a1.a(X, m);
                    if (!l5.s) {
                        return;
                    }
                }
                Log.w(Y[662]);
            } catch (IllegalStateException e) {
                throw e;
            } catch (IllegalStateException e2) {
                throw e2;
            }
        } catch (IllegalStateException e22) {
            throw e22;
        } catch (IllegalStateException e222) {
            throw e222;
        }
    }

    public void N() {
        this.t.d();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.database.sqlite.SQLiteDatabase r13, com.whatsapp.protocol.co r14) {
        /*
        r12 = this;
        r2 = com.whatsapp.l5.s;
        r0 = r14.d;	 Catch:{ IllegalStateException -> 0x001c }
        r1 = 6;
        if (r0 != r1) goto L_0x001b;
    L_0x0007:
        r0 = r14.k;	 Catch:{ IllegalStateException -> 0x001c }
        r0 = r0.a;	 Catch:{ IllegalStateException -> 0x001c }
        if (r0 == 0) goto L_0x001b;
    L_0x000d:
        r0 = com.whatsapp.App.as;
        r1 = r14.t;
        r3 = r0.d(r1);
        r0 = r14.z;	 Catch:{ IllegalStateException -> 0x0699 }
        r0 = (int) r0;
        switch(r0) {
            case 2: goto L_0x052a;
            case 3: goto L_0x052a;
            case 4: goto L_0x001e;
            case 5: goto L_0x0205;
            case 6: goto L_0x001b;
            case 7: goto L_0x0205;
            case 8: goto L_0x001b;
            case 9: goto L_0x0623;
            case 10: goto L_0x043f;
            case 11: goto L_0x001b;
            case 12: goto L_0x00ea;
            case 13: goto L_0x02c6;
            case 14: goto L_0x02c6;
            case 15: goto L_0x03b3;
            case 16: goto L_0x03b3;
            case 17: goto L_0x05a0;
            default: goto L_0x001b;
        };
    L_0x001b:
        return;
    L_0x001c:
        r0 = move-exception;
        throw r0;
    L_0x001e:
        if (r3 == 0) goto L_0x069d;
    L_0x0020:
        r0 = "";
    L_0x0023:
        r1 = new android.content.ContentValues;
        r4 = 3;
        r1.<init>(r4);
        r4 = Y;
        r5 = 167; // 0xa7 float:2.34E-43 double:8.25E-322;
        r4 = r4[r5];
        r5 = r14.k;
        r5 = r5.c;
        r1.put(r4, r5);
        r4 = Y;
        r5 = 119; // 0x77 float:1.67E-43 double:5.9E-322;
        r4 = r4[r5];
        r1.put(r4, r0);
        r4 = Y;
        r5 = 97;
        r4 = r4[r5];
        r5 = 0;
        r5 = java.lang.Boolean.valueOf(r5);
        r1.put(r4, r5);
        r4 = 2;
        r4 = new java.lang.String[r4];
        r5 = 0;
        r6 = r14.k;
        r6 = r6.c;
        r4[r5] = r6;
        r5 = 1;
        r4[r5] = r0;
        r0 = r14.k;
        r0 = r0.c;
        r0 = r12.b(r13, r0);
        r5 = Y;	 Catch:{ IllegalStateException -> 0x06a1 }
        r6 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        r5 = r5[r6];	 Catch:{ IllegalStateException -> 0x06a1 }
        r6 = Y;	 Catch:{ IllegalStateException -> 0x06a1 }
        r7 = 98;
        r6 = r6[r7];	 Catch:{ IllegalStateException -> 0x06a1 }
        r4 = r13.update(r5, r1, r6, r4);	 Catch:{ IllegalStateException -> 0x06a1 }
        if (r4 != 0) goto L_0x007e;
    L_0x0074:
        r4 = Y;	 Catch:{ IllegalStateException -> 0x06a1 }
        r5 = 178; // 0xb2 float:2.5E-43 double:8.8E-322;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x06a1 }
        r5 = 0;
        r13.insert(r4, r5, r1);	 Catch:{ IllegalStateException -> 0x06a1 }
    L_0x007e:
        r1 = r14.k;
        r1 = r1.c;
        r1 = r12.b(r13, r1);
        r4 = android.text.TextUtils.equals(r0, r1);
        if (r4 != 0) goto L_0x001b;
    L_0x008c:
        r4 = new android.content.ContentValues;
        r5 = 6;
        r4.<init>(r5);
        r5 = Y;
        r6 = 173; // 0xad float:2.42E-43 double:8.55E-322;
        r5 = r5[r6];
        r6 = java.lang.System.currentTimeMillis();
        r8 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r6 = r6 / r8;
        r6 = java.lang.Long.valueOf(r6);
        r4.put(r5, r6);
        r5 = Y;
        r6 = 183; // 0xb7 float:2.56E-43 double:9.04E-322;
        r5 = r5[r6];
        r6 = r14.k;
        r6 = r6.c;
        r4.put(r5, r6);
        r5 = Y;
        r6 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        r5 = r5[r6];
        r6 = r14.t;
        r4.put(r5, r6);
        r5 = Y;
        r6 = 117; // 0x75 float:1.64E-43 double:5.8E-322;
        r5 = r5[r6];
        r6 = 1;
        r6 = java.lang.Integer.valueOf(r6);
        r4.put(r5, r6);
        r5 = Y;
        r6 = 165; // 0xa5 float:2.31E-43 double:8.15E-322;
        r5 = r5[r6];
        r4.put(r5, r0);
        r0 = Y;
        r5 = 93;
        r0 = r0[r5];
        r4.put(r0, r1);
        r0 = Y;
        r1 = 121; // 0x79 float:1.7E-43 double:6.0E-322;
        r0 = r0[r1];
        r1 = 0;
        r13.insert(r0, r1, r4);
        if (r2 == 0) goto L_0x001b;
    L_0x00ea:
        r0 = r14.Q;
        r0 = (java.util.Vector) r0;
        r1 = r14.k;
        r1 = r1.c;
        r4 = r12.b(r13, r1);
        r5 = new java.util.HashSet;
        r5.<init>();
        r6 = r0.iterator();
    L_0x00ff:
        r0 = r6.hasNext();
        if (r0 == 0) goto L_0x0194;
    L_0x0105:
        r0 = r6.next();
        r0 = (java.lang.String) r0;
        r1 = com.whatsapp.App.as;	 Catch:{ IllegalStateException -> 0x06a3 }
        r1 = r1.d(r0);	 Catch:{ IllegalStateException -> 0x06a3 }
        if (r1 == 0) goto L_0x06a5;
    L_0x0113:
        r0 = "";
        r1 = r0;
    L_0x0117:
        r7 = new android.content.ContentValues;
        r0 = 3;
        r7.<init>(r0);
        r0 = Y;
        r8 = 114; // 0x72 float:1.6E-43 double:5.63E-322;
        r0 = r0[r8];
        r8 = r14.k;
        r8 = r8.c;
        r7.put(r0, r8);
        r0 = Y;
        r8 = 99;
        r0 = r0[r8];
        r7.put(r0, r1);
        r0 = Y;
        r8 = 177; // 0xb1 float:2.48E-43 double:8.74E-322;
        r0 = r0[r8];
        r8 = 0;
        r8 = java.lang.Boolean.valueOf(r8);
        r7.put(r0, r8);
        r0 = r14 instanceof com.whatsapp.ax9;
        if (r0 == 0) goto L_0x015f;
    L_0x0145:
        r0 = r14;
        r0 = (com.whatsapp.ax9) r0;
        r8 = r0.U;	 Catch:{ IllegalStateException -> 0x06a8 }
        if (r8 == 0) goto L_0x015f;
    L_0x014c:
        r8 = Y;	 Catch:{ IllegalStateException -> 0x06a8 }
        r9 = 138; // 0x8a float:1.93E-43 double:6.8E-322;
        r8 = r8[r9];	 Catch:{ IllegalStateException -> 0x06a8 }
        r0 = r0.U;	 Catch:{ IllegalStateException -> 0x06a8 }
        r0 = r0.c(r1);	 Catch:{ IllegalStateException -> 0x06a8 }
        r0 = java.lang.Boolean.valueOf(r0);	 Catch:{ IllegalStateException -> 0x06a8 }
        r7.put(r8, r0);	 Catch:{ IllegalStateException -> 0x06a8 }
    L_0x015f:
        r0 = 2;
        r0 = new java.lang.String[r0];
        r8 = 0;
        r9 = r14.k;
        r9 = r9.c;
        r0[r8] = r9;
        r8 = 1;
        r0[r8] = r1;
        r8 = Y;
        r9 = 176; // 0xb0 float:2.47E-43 double:8.7E-322;
        r8 = r8[r9];
        r9 = Y;
        r10 = 184; // 0xb8 float:2.58E-43 double:9.1E-322;
        r9 = r9[r10];
        r0 = r13.update(r8, r7, r9, r0);
        if (r0 != 0) goto L_0x0192;
    L_0x017e:
        r0 = Y;
        r8 = 179; // 0xb3 float:2.51E-43 double:8.84E-322;
        r0 = r0[r8];
        r8 = 0;
        r8 = r13.insert(r0, r8, r7);
        r10 = 0;
        r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r0 < 0) goto L_0x0192;
    L_0x018f:
        r5.add(r1);	 Catch:{ IllegalStateException -> 0x06aa }
    L_0x0192:
        if (r2 == 0) goto L_0x00ff;
    L_0x0194:
        r0 = r14.k;
        r0 = r0.c;
        r0 = r12.b(r13, r0);
        r1 = android.text.TextUtils.equals(r4, r0);
        if (r1 != 0) goto L_0x001b;
    L_0x01a2:
        r1 = ",";
        r1 = android.text.TextUtils.join(r1, r5);
        r5 = new android.content.ContentValues;
        r6 = 6;
        r5.<init>(r6);
        r6 = Y;	 Catch:{ IllegalStateException -> 0x06ac }
        r7 = 160; // 0xa0 float:2.24E-43 double:7.9E-322;
        r6 = r6[r7];	 Catch:{ IllegalStateException -> 0x06ac }
        r8 = java.lang.System.currentTimeMillis();	 Catch:{ IllegalStateException -> 0x06ac }
        r10 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r8 = r8 / r10;
        r7 = java.lang.Long.valueOf(r8);	 Catch:{ IllegalStateException -> 0x06ac }
        r5.put(r6, r7);	 Catch:{ IllegalStateException -> 0x06ac }
        r6 = Y;	 Catch:{ IllegalStateException -> 0x06ac }
        r7 = 125; // 0x7d float:1.75E-43 double:6.2E-322;
        r6 = r6[r7];	 Catch:{ IllegalStateException -> 0x06ac }
        r7 = r14.k;	 Catch:{ IllegalStateException -> 0x06ac }
        r7 = r7.c;	 Catch:{ IllegalStateException -> 0x06ac }
        r5.put(r6, r7);	 Catch:{ IllegalStateException -> 0x06ac }
        r6 = Y;	 Catch:{ IllegalStateException -> 0x06ac }
        r7 = 151; // 0x97 float:2.12E-43 double:7.46E-322;
        r6 = r6[r7];	 Catch:{ IllegalStateException -> 0x06ac }
        r5.put(r6, r1);	 Catch:{ IllegalStateException -> 0x06ac }
        r1 = Y;	 Catch:{ IllegalStateException -> 0x06ac }
        r6 = 146; // 0x92 float:2.05E-43 double:7.2E-322;
        r1 = r1[r6];	 Catch:{ IllegalStateException -> 0x06ac }
        r6 = 1;
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ IllegalStateException -> 0x06ac }
        r5.put(r1, r6);	 Catch:{ IllegalStateException -> 0x06ac }
        r1 = Y;	 Catch:{ IllegalStateException -> 0x06ac }
        r6 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        r1 = r1[r6];	 Catch:{ IllegalStateException -> 0x06ac }
        r5.put(r1, r4);	 Catch:{ IllegalStateException -> 0x06ac }
        r1 = Y;	 Catch:{ IllegalStateException -> 0x06ac }
        r4 = 181; // 0xb5 float:2.54E-43 double:8.94E-322;
        r1 = r1[r4];	 Catch:{ IllegalStateException -> 0x06ac }
        r5.put(r1, r0);	 Catch:{ IllegalStateException -> 0x06ac }
        r0 = Y;	 Catch:{ IllegalStateException -> 0x06ac }
        r1 = 162; // 0xa2 float:2.27E-43 double:8.0E-322;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x06ac }
        r1 = 0;
        r13.insert(r0, r1, r5);	 Catch:{ IllegalStateException -> 0x06ac }
        if (r2 == 0) goto L_0x001b;
    L_0x0205:
        r0 = 2;
        r1 = new java.lang.String[r0];	 Catch:{ IllegalStateException -> 0x06ae }
        r0 = 0;
        r4 = r14.k;	 Catch:{ IllegalStateException -> 0x06ae }
        r4 = r4.c;	 Catch:{ IllegalStateException -> 0x06ae }
        r1[r0] = r4;	 Catch:{ IllegalStateException -> 0x06ae }
        r4 = 1;
        if (r3 == 0) goto L_0x06b0;
    L_0x0212:
        r0 = "";
    L_0x0215:
        r1[r4] = r0;
        r0 = r14.k;
        r0 = r0.c;
        r0 = r12.b(r13, r0);
        r4 = Y;
        r5 = 150; // 0x96 float:2.1E-43 double:7.4E-322;
        r4 = r4[r5];
        r5 = Y;
        r6 = 142; // 0x8e float:1.99E-43 double:7.0E-322;
        r5 = r5[r6];
        r13.delete(r4, r5, r1);
        r1 = r14.k;
        r1 = r1.c;
        r1 = r12.b(r13, r1);
        r4 = android.text.TextUtils.equals(r0, r1);
        if (r4 != 0) goto L_0x001b;
    L_0x023c:
        r4 = new android.content.ContentValues;
        r4.<init>();
        r5 = Y;
        r6 = 111; // 0x6f float:1.56E-43 double:5.5E-322;
        r5 = r5[r6];
        r6 = 0;
        r6 = java.lang.Boolean.valueOf(r6);
        r4.put(r5, r6);
        r5 = Y;
        r6 = 136; // 0x88 float:1.9E-43 double:6.7E-322;
        r5 = r5[r6];
        r6 = Y;
        r7 = 163; // 0xa3 float:2.28E-43 double:8.05E-322;
        r6 = r6[r7];
        r7 = 1;
        r7 = new java.lang.String[r7];
        r8 = 0;
        r9 = r14.k;
        r9 = r9.c;
        r7[r8] = r9;
        r13.update(r5, r4, r6, r7);
        r4 = new android.content.ContentValues;
        r5 = 6;
        r4.<init>(r5);
        r5 = Y;
        r6 = 152; // 0x98 float:2.13E-43 double:7.5E-322;
        r5 = r5[r6];
        r6 = java.lang.System.currentTimeMillis();
        r8 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r6 = r6 / r8;
        r6 = java.lang.Long.valueOf(r6);
        r4.put(r5, r6);
        r5 = Y;
        r6 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        r5 = r5[r6];
        r6 = r14.k;
        r6 = r6.c;
        r4.put(r5, r6);
        r5 = Y;
        r6 = 123; // 0x7b float:1.72E-43 double:6.1E-322;
        r5 = r5[r6];
        r6 = r14.t;
        r4.put(r5, r6);
        r5 = Y;
        r6 = 143; // 0x8f float:2.0E-43 double:7.07E-322;
        r5 = r5[r6];
        r6 = 2;
        r6 = java.lang.Integer.valueOf(r6);
        r4.put(r5, r6);
        r5 = Y;
        r6 = 153; // 0x99 float:2.14E-43 double:7.56E-322;
        r5 = r5[r6];
        r4.put(r5, r0);
        r0 = Y;
        r5 = 169; // 0xa9 float:2.37E-43 double:8.35E-322;
        r0 = r0[r5];
        r4.put(r0, r1);
        r0 = Y;
        r1 = 112; // 0x70 float:1.57E-43 double:5.53E-322;
        r0 = r0[r1];
        r1 = 0;
        r13.insert(r0, r1, r4);
        if (r2 == 0) goto L_0x001b;
    L_0x02c6:
        r0 = r14.Q;
        r0 = (java.util.Vector) r0;
        r1 = r14.k;
        r1 = r1.c;
        r4 = r12.b(r13, r1);
        r5 = new java.util.HashSet;
        r5.<init>();
        r6 = r0.iterator();
    L_0x02db:
        r0 = r6.hasNext();
        if (r0 == 0) goto L_0x0316;
    L_0x02e1:
        r0 = r6.next();
        r0 = (java.lang.String) r0;
        r1 = com.whatsapp.App.as;
        r1 = r1.d(r0);
        r7 = 2;
        r7 = new java.lang.String[r7];	 Catch:{ IllegalStateException -> 0x06b4 }
        r8 = 0;
        r9 = r14.k;	 Catch:{ IllegalStateException -> 0x06b4 }
        r9 = r9.c;	 Catch:{ IllegalStateException -> 0x06b4 }
        r7[r8] = r9;	 Catch:{ IllegalStateException -> 0x06b4 }
        r8 = 1;
        if (r1 == 0) goto L_0x06b6;
    L_0x02fa:
        r1 = "";
    L_0x02fd:
        r7[r8] = r1;
        r1 = Y;
        r8 = 170; // 0xaa float:2.38E-43 double:8.4E-322;
        r1 = r1[r8];
        r8 = Y;
        r9 = 182; // 0xb6 float:2.55E-43 double:9.0E-322;
        r8 = r8[r9];
        r1 = r13.delete(r1, r8, r7);
        if (r1 <= 0) goto L_0x0314;
    L_0x0311:
        r5.add(r0);	 Catch:{ IllegalStateException -> 0x06b9 }
    L_0x0314:
        if (r2 == 0) goto L_0x02db;
    L_0x0316:
        r0 = r14.k;
        r0 = r0.c;
        r0 = r12.b(r13, r0);
        r1 = android.text.TextUtils.equals(r4, r0);
        if (r1 != 0) goto L_0x001b;
    L_0x0324:
        r1 = new android.content.ContentValues;
        r1.<init>();
        r6 = Y;
        r7 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        r6 = r6[r7];
        r7 = 0;
        r7 = java.lang.Boolean.valueOf(r7);
        r1.put(r6, r7);
        r6 = Y;
        r7 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
        r6 = r6[r7];
        r7 = Y;
        r8 = 149; // 0x95 float:2.09E-43 double:7.36E-322;
        r7 = r7[r8];
        r8 = 1;
        r8 = new java.lang.String[r8];
        r9 = 0;
        r10 = r14.k;
        r10 = r10.c;
        r8[r9] = r10;
        r13.update(r6, r1, r7, r8);
        r1 = ",";
        r1 = android.text.TextUtils.join(r1, r5);
        r5 = new android.content.ContentValues;
        r6 = 6;
        r5.<init>(r6);
        r6 = Y;
        r7 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        r6 = r6[r7];
        r8 = java.lang.System.currentTimeMillis();
        r10 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r8 = r8 / r10;
        r7 = java.lang.Long.valueOf(r8);
        r5.put(r6, r7);
        r6 = Y;
        r7 = 131; // 0x83 float:1.84E-43 double:6.47E-322;
        r6 = r6[r7];
        r7 = r14.k;
        r7 = r7.c;
        r5.put(r6, r7);
        r6 = Y;
        r7 = 157; // 0x9d float:2.2E-43 double:7.76E-322;
        r6 = r6[r7];
        r5.put(r6, r1);
        r1 = Y;
        r6 = 156; // 0x9c float:2.19E-43 double:7.7E-322;
        r1 = r1[r6];
        r6 = 2;
        r6 = java.lang.Integer.valueOf(r6);
        r5.put(r1, r6);
        r1 = Y;
        r6 = 159; // 0x9f float:2.23E-43 double:7.86E-322;
        r1 = r1[r6];
        r5.put(r1, r4);
        r1 = Y;
        r4 = 140; // 0x8c float:1.96E-43 double:6.9E-322;
        r1 = r1[r4];
        r5.put(r1, r0);
        r0 = Y;
        r1 = 164; // 0xa4 float:2.3E-43 double:8.1E-322;
        r0 = r0[r1];
        r1 = 0;
        r13.insert(r0, r1, r5);
        if (r2 == 0) goto L_0x001b;
    L_0x03b3:
        r0 = r14.Q;
        r0 = (java.util.Vector) r0;
        r4 = r0.iterator();
    L_0x03bb:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x043d;
    L_0x03c1:
        r0 = r4.next();
        r0 = (java.lang.String) r0;
        r1 = com.whatsapp.App.as;
        r1 = r1.d(r0);
        if (r1 == 0) goto L_0x03d2;
    L_0x03cf:
        r0 = "";
    L_0x03d2:
        r5 = new android.content.ContentValues;
        r1 = 3;
        r5.<init>(r1);
        r1 = Y;	 Catch:{ IllegalStateException -> 0x06bd }
        r6 = 100;
        r1 = r1[r6];	 Catch:{ IllegalStateException -> 0x06bd }
        r6 = r14.k;	 Catch:{ IllegalStateException -> 0x06bd }
        r6 = r6.c;	 Catch:{ IllegalStateException -> 0x06bd }
        r5.put(r1, r6);	 Catch:{ IllegalStateException -> 0x06bd }
        r1 = Y;	 Catch:{ IllegalStateException -> 0x06bd }
        r6 = 116; // 0x74 float:1.63E-43 double:5.73E-322;
        r1 = r1[r6];	 Catch:{ IllegalStateException -> 0x06bd }
        r5.put(r1, r0);	 Catch:{ IllegalStateException -> 0x06bd }
        r1 = Y;	 Catch:{ IllegalStateException -> 0x06bd }
        r6 = 174; // 0xae float:2.44E-43 double:8.6E-322;
        r1 = r1[r6];	 Catch:{ IllegalStateException -> 0x06bd }
        r6 = 0;
        r6 = java.lang.Boolean.valueOf(r6);	 Catch:{ IllegalStateException -> 0x06bd }
        r5.put(r1, r6);	 Catch:{ IllegalStateException -> 0x06bd }
        r1 = Y;	 Catch:{ IllegalStateException -> 0x06bd }
        r6 = 95;
        r6 = r1[r6];	 Catch:{ IllegalStateException -> 0x06bd }
        r8 = r14.z;	 Catch:{ IllegalStateException -> 0x06bd }
        r10 = 15;
        r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r1 != 0) goto L_0x06bf;
    L_0x040a:
        r1 = 1;
    L_0x040b:
        r1 = java.lang.Boolean.valueOf(r1);
        r5.put(r6, r1);
        r1 = 2;
        r1 = new java.lang.String[r1];
        r6 = 0;
        r7 = r14.k;
        r7 = r7.c;
        r1[r6] = r7;
        r6 = 1;
        r1[r6] = r0;
        r0 = Y;	 Catch:{ IllegalStateException -> 0x06c2 }
        r6 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r0 = r0[r6];	 Catch:{ IllegalStateException -> 0x06c2 }
        r6 = Y;	 Catch:{ IllegalStateException -> 0x06c2 }
        r7 = 106; // 0x6a float:1.49E-43 double:5.24E-322;
        r6 = r6[r7];	 Catch:{ IllegalStateException -> 0x06c2 }
        r0 = r13.update(r0, r5, r6, r1);	 Catch:{ IllegalStateException -> 0x06c2 }
        if (r0 != 0) goto L_0x043b;
    L_0x0431:
        r0 = Y;	 Catch:{ IllegalStateException -> 0x06c2 }
        r1 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x06c2 }
        r1 = 0;
        r13.insert(r0, r1, r5);	 Catch:{ IllegalStateException -> 0x06c2 }
    L_0x043b:
        if (r2 == 0) goto L_0x03bb;
    L_0x043d:
        if (r2 == 0) goto L_0x001b;
    L_0x043f:
        r1 = new android.content.ContentValues;
        r0 = 3;
        r1.<init>(r0);
        r0 = Y;	 Catch:{ IllegalStateException -> 0x06c4 }
        r4 = 154; // 0x9a float:2.16E-43 double:7.6E-322;
        r0 = r0[r4];	 Catch:{ IllegalStateException -> 0x06c4 }
        r4 = r14.k;	 Catch:{ IllegalStateException -> 0x06c4 }
        r4 = r4.c;	 Catch:{ IllegalStateException -> 0x06c4 }
        r1.put(r0, r4);	 Catch:{ IllegalStateException -> 0x06c4 }
        r0 = Y;	 Catch:{ IllegalStateException -> 0x06c4 }
        r4 = 133; // 0x85 float:1.86E-43 double:6.57E-322;
        r0 = r0[r4];	 Catch:{ IllegalStateException -> 0x06c4 }
        r4 = r14.Q;	 Catch:{ IllegalStateException -> 0x06c4 }
        r4 = r4.toString();	 Catch:{ IllegalStateException -> 0x06c4 }
        r1.put(r0, r4);	 Catch:{ IllegalStateException -> 0x06c4 }
        r0 = Y;	 Catch:{ IllegalStateException -> 0x06c4 }
        r4 = 129; // 0x81 float:1.81E-43 double:6.37E-322;
        r0 = r0[r4];	 Catch:{ IllegalStateException -> 0x06c4 }
        r4 = 0;
        r4 = java.lang.Boolean.valueOf(r4);	 Catch:{ IllegalStateException -> 0x06c4 }
        r1.put(r0, r4);	 Catch:{ IllegalStateException -> 0x06c4 }
        r0 = 2;
        r4 = new java.lang.String[r0];	 Catch:{ IllegalStateException -> 0x06c4 }
        r0 = 0;
        r5 = r14.k;	 Catch:{ IllegalStateException -> 0x06c4 }
        r5 = r5.c;	 Catch:{ IllegalStateException -> 0x06c4 }
        r4[r0] = r5;	 Catch:{ IllegalStateException -> 0x06c4 }
        r5 = 1;
        if (r3 == 0) goto L_0x06c6;
    L_0x047c:
        r0 = "";
    L_0x047f:
        r4[r5] = r0;
        r0 = r14.k;
        r0 = r0.c;
        r0 = r12.b(r13, r0);
        r3 = Y;	 Catch:{ IllegalStateException -> 0x06ca }
        r5 = 148; // 0x94 float:2.07E-43 double:7.3E-322;
        r3 = r3[r5];	 Catch:{ IllegalStateException -> 0x06ca }
        r5 = Y;	 Catch:{ IllegalStateException -> 0x06ca }
        r6 = 161; // 0xa1 float:2.26E-43 double:7.95E-322;
        r5 = r5[r6];	 Catch:{ IllegalStateException -> 0x06ca }
        r3 = r13.update(r3, r1, r5, r4);	 Catch:{ IllegalStateException -> 0x06ca }
        if (r3 != 0) goto L_0x04a5;
    L_0x049b:
        r3 = Y;	 Catch:{ IllegalStateException -> 0x06ca }
        r4 = 168; // 0xa8 float:2.35E-43 double:8.3E-322;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x06ca }
        r4 = 0;
        r13.insert(r3, r4, r1);	 Catch:{ IllegalStateException -> 0x06ca }
    L_0x04a5:
        r1 = r14.k;
        r1 = r1.c;
        r1 = r12.b(r13, r1);
        r3 = android.text.TextUtils.equals(r0, r1);
        if (r3 != 0) goto L_0x001b;
    L_0x04b3:
        r3 = new android.content.ContentValues;
        r4 = 6;
        r3.<init>(r4);
        r4 = Y;
        r5 = 139; // 0x8b float:1.95E-43 double:6.87E-322;
        r4 = r4[r5];
        r6 = java.lang.System.currentTimeMillis();
        r8 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r6 = r6 / r8;
        r5 = java.lang.Long.valueOf(r6);
        r3.put(r4, r5);
        r4 = Y;
        r5 = 144; // 0x90 float:2.02E-43 double:7.1E-322;
        r4 = r4[r5];
        r5 = r14.k;
        r5 = r5.c;
        r3.put(r4, r5);
        r4 = Y;
        r5 = 158; // 0x9e float:2.21E-43 double:7.8E-322;
        r4 = r4[r5];
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = r14.t;
        r5 = r5.append(r6);
        r6 = 44;
        r5 = r5.append(r6);
        r6 = r14.Q;
        r5 = r5.append(r6);
        r5 = r5.toString();
        r3.put(r4, r5);
        r4 = Y;
        r5 = 155; // 0x9b float:2.17E-43 double:7.66E-322;
        r4 = r4[r5];
        r5 = 3;
        r5 = java.lang.Integer.valueOf(r5);
        r3.put(r4, r5);
        r4 = Y;
        r5 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
        r4 = r4[r5];
        r3.put(r4, r0);
        r0 = Y;
        r4 = 137; // 0x89 float:1.92E-43 double:6.77E-322;
        r0 = r0[r4];
        r3.put(r0, r1);
        r0 = Y;
        r1 = 147; // 0x93 float:2.06E-43 double:7.26E-322;
        r0 = r0[r1];
        r1 = 0;
        r13.insert(r0, r1, r3);
        if (r2 == 0) goto L_0x001b;
    L_0x052a:
        r0 = r14.Q;
        r0 = (java.util.Vector) r0;
        r1 = r0.iterator();
    L_0x0532:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x059e;
    L_0x0538:
        r0 = r1.next();
        r0 = (java.lang.String) r0;
        r3 = com.whatsapp.App.as;
        r3 = r3.d(r0);
        if (r3 == 0) goto L_0x0549;
    L_0x0546:
        r0 = "";
    L_0x0549:
        r3 = new android.content.ContentValues;
        r4 = 3;
        r3.<init>(r4);
        r4 = Y;
        r5 = 175; // 0xaf float:2.45E-43 double:8.65E-322;
        r4 = r4[r5];
        r5 = r14.k;
        r5 = r5.c;
        r3.put(r4, r5);
        r4 = Y;
        r5 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
        r4 = r4[r5];
        r3.put(r4, r0);
        r4 = Y;
        r5 = 96;
        r4 = r4[r5];
        r5 = 1;
        r5 = java.lang.Boolean.valueOf(r5);
        r3.put(r4, r5);
        r4 = 2;
        r4 = new java.lang.String[r4];
        r5 = 0;
        r6 = r14.k;
        r6 = r6.c;
        r4[r5] = r6;
        r5 = 1;
        r4[r5] = r0;
        r0 = Y;	 Catch:{ IllegalStateException -> 0x06ce }
        r5 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        r0 = r0[r5];	 Catch:{ IllegalStateException -> 0x06ce }
        r5 = Y;	 Catch:{ IllegalStateException -> 0x06ce }
        r6 = 172; // 0xac float:2.41E-43 double:8.5E-322;
        r5 = r5[r6];	 Catch:{ IllegalStateException -> 0x06ce }
        r0 = r13.update(r0, r3, r5, r4);	 Catch:{ IllegalStateException -> 0x06ce }
        if (r0 != 0) goto L_0x059c;
    L_0x0592:
        r0 = Y;	 Catch:{ IllegalStateException -> 0x06ce }
        r4 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r0 = r0[r4];	 Catch:{ IllegalStateException -> 0x06ce }
        r4 = 0;
        r13.insert(r0, r4, r3);	 Catch:{ IllegalStateException -> 0x06ce }
    L_0x059c:
        if (r2 == 0) goto L_0x0532;
    L_0x059e:
        if (r2 == 0) goto L_0x001b;
    L_0x05a0:
        r0 = 2;
        r0 = new java.lang.String[r0];
        r1 = 0;
        r3 = r14.k;
        r3 = r3.c;
        r0[r1] = r3;
        r1 = 1;
        r3 = "";
        r0[r1] = r3;
        r1 = Y;
        r3 = 118; // 0x76 float:1.65E-43 double:5.83E-322;
        r1 = r1[r3];
        r3 = Y;
        r4 = 171; // 0xab float:2.4E-43 double:8.45E-322;
        r3 = r3[r4];
        r13.delete(r1, r3, r0);
        r0 = new android.content.ContentValues;
        r0.<init>();
        r1 = Y;
        r3 = 134; // 0x86 float:1.88E-43 double:6.6E-322;
        r1 = r1[r3];
        r3 = r14.k;
        r3 = r3.c;
        r0.put(r1, r3);
        r1 = Y;
        r3 = 145; // 0x91 float:2.03E-43 double:7.16E-322;
        r1 = r1[r3];
        r3 = 0;
        r3 = java.lang.Boolean.valueOf(r3);
        r0.put(r1, r3);
        r1 = Y;
        r3 = 130; // 0x82 float:1.82E-43 double:6.4E-322;
        r1 = r1[r3];
        r3 = 0;
        r3 = java.lang.Boolean.valueOf(r3);
        r0.put(r1, r3);
        r1 = Y;
        r3 = 103; // 0x67 float:1.44E-43 double:5.1E-322;
        r1 = r1[r3];
        r3 = 0;
        r3 = java.lang.Boolean.valueOf(r3);
        r0.put(r1, r3);
        r1 = 1;
        r1 = new java.lang.String[r1];
        r3 = 0;
        r4 = r14.k;
        r4 = r4.c;
        r1[r3] = r4;
        r3 = Y;	 Catch:{ IllegalStateException -> 0x06d0 }
        r4 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x06d0 }
        r4 = Y;	 Catch:{ IllegalStateException -> 0x06d0 }
        r5 = 124; // 0x7c float:1.74E-43 double:6.13E-322;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x06d0 }
        r1 = r13.update(r3, r0, r4, r1);	 Catch:{ IllegalStateException -> 0x06d0 }
        if (r1 != 0) goto L_0x001b;
    L_0x0617:
        r1 = Y;	 Catch:{ IllegalStateException -> 0x06d0 }
        r3 = 135; // 0x87 float:1.89E-43 double:6.67E-322;
        r1 = r1[r3];	 Catch:{ IllegalStateException -> 0x06d0 }
        r3 = 0;
        r13.insert(r1, r3, r0);	 Catch:{ IllegalStateException -> 0x06d0 }
        if (r2 == 0) goto L_0x001b;
    L_0x0623:
        r0 = r14.Q;
        r0 = (java.util.Vector) r0;
        r1 = r0.iterator();
    L_0x062b:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x001b;
    L_0x0631:
        r0 = r1.next();
        r0 = (java.lang.String) r0;
        r3 = com.whatsapp.App.as;
        r3 = r3.d(r0);
        if (r3 == 0) goto L_0x0642;
    L_0x063f:
        r0 = "";
    L_0x0642:
        r3 = new android.content.ContentValues;
        r4 = 3;
        r3.<init>(r4);
        r4 = Y;
        r5 = 113; // 0x71 float:1.58E-43 double:5.6E-322;
        r4 = r4[r5];
        r5 = r14.k;
        r5 = r5.c;
        r3.put(r4, r5);
        r4 = Y;
        r5 = 94;
        r4 = r4[r5];
        r3.put(r4, r0);
        r4 = Y;
        r5 = 127; // 0x7f float:1.78E-43 double:6.27E-322;
        r4 = r4[r5];
        r5 = 0;
        r5 = java.lang.Boolean.valueOf(r5);
        r3.put(r4, r5);
        r4 = 2;
        r4 = new java.lang.String[r4];
        r5 = 0;
        r6 = r14.k;
        r6 = r6.c;
        r4[r5] = r6;
        r5 = 1;
        r4[r5] = r0;
        r0 = Y;	 Catch:{ IllegalStateException -> 0x06d4 }
        r5 = 166; // 0xa6 float:2.33E-43 double:8.2E-322;
        r0 = r0[r5];	 Catch:{ IllegalStateException -> 0x06d4 }
        r5 = Y;	 Catch:{ IllegalStateException -> 0x06d4 }
        r6 = 132; // 0x84 float:1.85E-43 double:6.5E-322;
        r5 = r5[r6];	 Catch:{ IllegalStateException -> 0x06d4 }
        r0 = r13.update(r0, r3, r5, r4);	 Catch:{ IllegalStateException -> 0x06d4 }
        if (r0 != 0) goto L_0x0695;
    L_0x068b:
        r0 = Y;	 Catch:{ IllegalStateException -> 0x06d4 }
        r4 = 141; // 0x8d float:1.98E-43 double:6.97E-322;
        r0 = r0[r4];	 Catch:{ IllegalStateException -> 0x06d4 }
        r4 = 0;
        r13.insert(r0, r4, r3);	 Catch:{ IllegalStateException -> 0x06d4 }
    L_0x0695:
        if (r2 == 0) goto L_0x062b;
    L_0x0697:
        goto L_0x001b;
    L_0x0699:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x069b }
    L_0x069b:
        r0 = move-exception;
        throw r0;
    L_0x069d:
        r0 = r14.t;
        goto L_0x0023;
    L_0x06a1:
        r0 = move-exception;
        throw r0;
    L_0x06a3:
        r0 = move-exception;
        throw r0;
    L_0x06a5:
        r1 = r0;
        goto L_0x0117;
    L_0x06a8:
        r0 = move-exception;
        throw r0;
    L_0x06aa:
        r0 = move-exception;
        throw r0;
    L_0x06ac:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x06ae }
    L_0x06ae:
        r0 = move-exception;
        throw r0;
    L_0x06b0:
        r0 = r14.t;
        goto L_0x0215;
    L_0x06b4:
        r0 = move-exception;
        throw r0;
    L_0x06b6:
        r1 = r0;
        goto L_0x02fd;
    L_0x06b9:
        r0 = move-exception;
        throw r0;
    L_0x06bb:
        r0 = move-exception;
        throw r0;
    L_0x06bd:
        r0 = move-exception;
        throw r0;
    L_0x06bf:
        r1 = 0;
        goto L_0x040b;
    L_0x06c2:
        r0 = move-exception;
        throw r0;
    L_0x06c4:
        r0 = move-exception;
        throw r0;
    L_0x06c6:
        r0 = r14.t;
        goto L_0x047f;
    L_0x06ca:
        r0 = move-exception;
        throw r0;
    L_0x06cc:
        r0 = move-exception;
        throw r0;
    L_0x06ce:
        r0 = move-exception;
        throw r0;
    L_0x06d0:
        r0 = move-exception;
        throw r0;
    L_0x06d2:
        r0 = move-exception;
        throw r0;
    L_0x06d4:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.a(android.database.sqlite.SQLiteDatabase, com.whatsapp.protocol.co):void");
    }

    public void b(Collection collection, boolean z, boolean z2) {
        boolean z3 = l5.s;
        for (co coVar : collection) {
            coVar.P = z;
            if (z3) {
                break;
            }
        }
        this.b.post(new k6(this, z2, collection, z));
    }

    public Map c(c3 c3Var) {
        boolean z = l5.s;
        Log.i(Y[683] + c3Var);
        Map hashMap = new HashMap();
        if (b(a(c3Var)) == 1) {
            try {
                Log.i(Y[684] + c3Var);
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        Cursor rawQuery = this.a.getReadableDatabase().rawQuery(V, new String[]{c3Var.c, String.valueOf(b(a(c3Var)))});
        if (rawQuery != null) {
            do {
                if (!rawQuery.moveToNext()) {
                    break;
                }
                x4 x4Var = new x4();
                String string = rawQuery.getString(0);
                try {
                    boolean z2;
                    if (rawQuery.getLong(1) > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    x4Var.b = rawQuery.getLong(2);
                    x4Var.d = rawQuery.getLong(3);
                    x4Var.a = rawQuery.getLong(4);
                    x4Var.c = rawQuery.getLong(5);
                    int i = rawQuery.getInt(6);
                    if (!z2) {
                        try {
                            if (!co.a(i)) {
                                continue;
                            }
                        } catch (IllegalStateException e2) {
                            throw e2;
                        } catch (IllegalStateException e22) {
                            throw e22;
                        }
                    }
                    hashMap.put(new c3(c3Var.c, z2, string), x4Var);
                } catch (IllegalStateException e222) {
                    throw e222;
                } catch (Throwable th) {
                    rawQuery.close();
                }
            } while (!z);
            rawQuery.close();
        }
        return hashMap;
    }

    public void c(String str, long j) {
        Log.i(Y[214] + str + " " + j);
        a5w com_whatsapp_a5w = (a5w) this.l.get(str);
        if (com_whatsapp_a5w == null) {
            try {
                Log.w(Y[215] + str);
                return;
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        try {
            if (j > a5w.a(com_whatsapp_a5w)) {
                a5w.d(com_whatsapp_a5w, j);
                this.b.post(new axe(this, j, str));
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public void h() {
        synchronized (this.a) {
            this.N = false;
            this.H = false;
            this.u = false;
            this.l.clear();
        }
    }

    static ConcurrentHashMap c(ael com_whatsapp_ael) {
        return com_whatsapp_ael.l;
    }

    public void s() {
        Log.i(Y[324]);
        synchronized (this.a) {
            this.a.getWritableDatabase().execSQL(Y[323]);
        }
    }

    public void h(co coVar) {
        Message.obtain(this.b, 11, -1, 0, coVar).sendToTarget();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean x() {
        /*
        r6 = this;
        r0 = 0;
        r1 = Y;
        r2 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r1 = r1[r2];
        com.whatsapp.util.Log.i(r1);
        r2 = new com.whatsapp.util.ab;
        r1 = Y;
        r3 = 259; // 0x103 float:3.63E-43 double:1.28E-321;
        r1 = r1[r3];
        r2.<init>(r1);
        r1 = X;	 Catch:{ SQLiteDatabaseCorruptException -> 0x006b, SQLiteFullException -> 0x009f, SQLiteException -> 0x00c1, all -> 0x011a }
        r1 = r1.getAbsolutePath();	 Catch:{ SQLiteDatabaseCorruptException -> 0x006b, SQLiteFullException -> 0x009f, SQLiteException -> 0x00c1, all -> 0x011a }
        r3 = 0;
        r4 = 16;
        r1 = android.database.sqlite.SQLiteDatabase.openDatabase(r1, r3, r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x006b, SQLiteFullException -> 0x009f, SQLiteException -> 0x00c1, all -> 0x011a }
        r0 = Y;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0129, SQLiteFullException -> 0x0126, SQLiteException -> 0x0124 }
        r3 = 254; // 0xfe float:3.56E-43 double:1.255E-321;
        r0 = r0[r3];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0129, SQLiteFullException -> 0x0126, SQLiteException -> 0x0124 }
        r1.beginTransaction();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0129, SQLiteFullException -> 0x0126, SQLiteException -> 0x0124 }
        r1.execSQL(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0129, SQLiteFullException -> 0x0126, SQLiteException -> 0x0124 }
        r1.setTransactionSuccessful();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0129, SQLiteFullException -> 0x0126, SQLiteException -> 0x0124 }
        r0 = new java.lang.StringBuilder;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0129, SQLiteFullException -> 0x0126, SQLiteException -> 0x0124 }
        r0.<init>();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0129, SQLiteFullException -> 0x0126, SQLiteException -> 0x0124 }
        r3 = Y;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0129, SQLiteFullException -> 0x0126, SQLiteException -> 0x0124 }
        r4 = 253; // 0xfd float:3.55E-43 double:1.25E-321;
        r3 = r3[r4];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0129, SQLiteFullException -> 0x0126, SQLiteException -> 0x0124 }
        r0 = r0.append(r3);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0129, SQLiteFullException -> 0x0126, SQLiteException -> 0x0124 }
        r2 = r2.b();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0129, SQLiteFullException -> 0x0126, SQLiteException -> 0x0124 }
        r0 = r0.append(r2);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0129, SQLiteFullException -> 0x0126, SQLiteException -> 0x0124 }
        r0 = r0.toString();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0129, SQLiteFullException -> 0x0126, SQLiteException -> 0x0124 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0129, SQLiteFullException -> 0x0126, SQLiteException -> 0x0124 }
        r0 = 1;
        if (r1 == 0) goto L_0x0064;
    L_0x0052:
        r2 = r1.inTransaction();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0065 }
        if (r2 == 0) goto L_0x005b;
    L_0x0058:
        r1.endTransaction();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0067 }
    L_0x005b:
        r2 = r1.isOpen();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0069 }
        if (r2 == 0) goto L_0x0064;
    L_0x0061:
        r1.close();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0069 }
    L_0x0064:
        return r0;
    L_0x0065:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0067 }
    L_0x0067:
        r0 = move-exception;
        throw r0;
    L_0x0069:
        r0 = move-exception;
        throw r0;
    L_0x006b:
        r1 = move-exception;
    L_0x006c:
        r1 = Y;	 Catch:{ all -> 0x011f }
        r2 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        r1 = r1[r2];	 Catch:{ all -> 0x011f }
        com.whatsapp.util.Log.w(r1);	 Catch:{ all -> 0x011f }
        if (r0 == 0) goto L_0x0089;
    L_0x0077:
        r1 = r0.inTransaction();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0099 }
        if (r1 == 0) goto L_0x0080;
    L_0x007d:
        r0.endTransaction();	 Catch:{ SQLiteDatabaseCorruptException -> 0x009b }
    L_0x0080:
        r1 = r0.isOpen();	 Catch:{ SQLiteDatabaseCorruptException -> 0x009d }
        if (r1 == 0) goto L_0x0089;
    L_0x0086:
        r0.close();	 Catch:{ SQLiteDatabaseCorruptException -> 0x009d }
    L_0x0089:
        r0 = Y;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0118 }
        r1 = 258; // 0x102 float:3.62E-43 double:1.275E-321;
        r0 = r0[r1];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0118 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0118 }
        r0 = r6.a;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0118 }
        com.whatsapp.a5f.b(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0118 }
        r0 = 0;
        goto L_0x0064;
    L_0x0099:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x009b }
    L_0x009b:
        r0 = move-exception;
        throw r0;
    L_0x009d:
        r0 = move-exception;
        throw r0;
    L_0x009f:
        r1 = move-exception;
        r5 = r1;
        r1 = r0;
        r0 = r5;
    L_0x00a3:
        r2 = com.whatsapp.App.z();	 Catch:{ all -> 0x00ab }
        com.whatsapp.util.p.a(r2);	 Catch:{ all -> 0x00ab }
        throw r0;	 Catch:{ all -> 0x00ab }
    L_0x00ab:
        r0 = move-exception;
    L_0x00ac:
        if (r1 == 0) goto L_0x00c0;
    L_0x00ae:
        r2 = r1.inTransaction();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0114 }
        if (r2 == 0) goto L_0x00b7;
    L_0x00b4:
        r1.endTransaction();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0114 }
    L_0x00b7:
        r2 = r1.isOpen();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0116 }
        if (r2 == 0) goto L_0x00c0;
    L_0x00bd:
        r1.close();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0116 }
    L_0x00c0:
        throw r0;
    L_0x00c1:
        r1 = move-exception;
        r5 = r1;
        r1 = r0;
        r0 = r5;
    L_0x00c5:
        r2 = r0.toString();	 Catch:{ SQLiteDatabaseCorruptException -> 0x010e }
        r3 = Y;	 Catch:{ SQLiteDatabaseCorruptException -> 0x010e }
        r4 = 260; // 0x104 float:3.64E-43 double:1.285E-321;
        r3 = r3[r4];	 Catch:{ SQLiteDatabaseCorruptException -> 0x010e }
        r2 = r2.contains(r3);	 Catch:{ SQLiteDatabaseCorruptException -> 0x010e }
        if (r2 == 0) goto L_0x00eb;
    L_0x00d5:
        r2 = com.whatsapp.App.z();	 Catch:{ SQLiteDatabaseCorruptException -> 0x010e }
        r3 = com.whatsapp.App.z();	 Catch:{ SQLiteDatabaseCorruptException -> 0x010e }
        r4 = 2131231124; // 0x7f080194 float:1.807832E38 double:1.0529680817E-314;
        r3 = r3.getString(r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x010e }
        com.whatsapp.util.p.a(r2, r3);	 Catch:{ SQLiteDatabaseCorruptException -> 0x010e }
        r2 = com.whatsapp.l5.s;	 Catch:{ SQLiteDatabaseCorruptException -> 0x010e }
        if (r2 == 0) goto L_0x010d;
    L_0x00eb:
        r2 = r0.toString();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0110 }
        r3 = Y;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0110 }
        r4 = 257; // 0x101 float:3.6E-43 double:1.27E-321;
        r3 = r3[r4];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0110 }
        r2 = r2.contains(r3);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0110 }
        if (r2 == 0) goto L_0x010d;
    L_0x00fb:
        r2 = com.whatsapp.App.z();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0112 }
        r3 = com.whatsapp.App.z();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0112 }
        r4 = 2131231125; // 0x7f080195 float:1.8078322E38 double:1.052968082E-314;
        r3 = r3.getString(r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0112 }
        com.whatsapp.util.p.a(r2, r3);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0112 }
    L_0x010d:
        throw r0;	 Catch:{ all -> 0x00ab }
    L_0x010e:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0110 }
    L_0x0110:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0112 }
    L_0x0112:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00ab }
    L_0x0114:
        r0 = move-exception;
        throw r0;
    L_0x0116:
        r0 = move-exception;
        throw r0;
    L_0x0118:
        r0 = move-exception;
        throw r0;
    L_0x011a:
        r1 = move-exception;
        r5 = r1;
        r1 = r0;
        r0 = r5;
        goto L_0x00ac;
    L_0x011f:
        r1 = move-exception;
        r5 = r1;
        r1 = r0;
        r0 = r5;
        goto L_0x00ac;
    L_0x0124:
        r0 = move-exception;
        goto L_0x00c5;
    L_0x0126:
        r0 = move-exception;
        goto L_0x00a3;
    L_0x0129:
        r0 = move-exception;
        r0 = r1;
        goto L_0x006c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.x():boolean");
    }

    private boolean z(String str) {
        SQLiteDatabase sQLiteDatabase = null;
        ab abVar = new ab(Y[240]);
        synchronized (this.a) {
            sQLiteDatabase = this.a.getWritableDatabase();
            sQLiteDatabase.beginTransaction();
            Log.i(Y[247] + sQLiteDatabase.delete(Y[241], Y[235], new String[]{str, Integer.toString(8)}));
            long n = n(str);
            int H = H();
            a5w com_whatsapp_a5w = (a5w) this.l.get(str);
            if (com_whatsapp_a5w == null) {
                com_whatsapp_a5w = new a5w();
                this.l.put(str, com_whatsapp_a5w);
            }
            try {
                a5w.c(com_whatsapp_a5w, 1);
                a5w.a(com_whatsapp_a5w, null);
                a5w.a(com_whatsapp_a5w, 1);
                a5w.d(com_whatsapp_a5w, 1);
                a5w.b(com_whatsapp_a5w, 1);
                a5w.e(com_whatsapp_a5w, 1);
                a5w.b(com_whatsapp_a5w, H);
                if (n != 1) {
                    a5w.a(com_whatsapp_a5w, r(str));
                    a5w.c(com_whatsapp_a5w, n);
                    a5w.a(com_whatsapp_a5w, n);
                    a5w.d(com_whatsapp_a5w, n);
                }
                ContentValues contentValues = new ContentValues(3);
                contentValues.put(Y[242], Integer.valueOf(a5w.f(com_whatsapp_a5w)));
                contentValues.put(Y[239], Long.valueOf(a5w.h(com_whatsapp_a5w)));
                contentValues.put(Y[233], Long.valueOf(a5w.e(com_whatsapp_a5w)));
                contentValues.put(Y[244], Long.valueOf(a5w.a(com_whatsapp_a5w)));
                if (sQLiteDatabase.update(Y[234], contentValues, Y[232], new String[]{str}) == 0) {
                    contentValues.put(Y[245], str);
                    if (sQLiteDatabase.insert(Y[238], null, contentValues) == -1) {
                        Log.e(Y[236] + str);
                    }
                }
                sQLiteDatabase.setTransactionSuccessful();
                if (sQLiteDatabase != null) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (IllegalStateException e) {
                        throw e;
                    } catch (IllegalStateException e2) {
                        throw e2;
                    }
                }
            } catch (IllegalStateException e22) {
                throw e22;
            } catch (IllegalStateException e222) {
                throw e222;
            } catch (Throwable th) {
                if (sQLiteDatabase != null) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (IllegalStateException e2222) {
                        throw e2222;
                    } catch (IllegalStateException e22222) {
                        throw e22222;
                    }
                }
            }
        }
        Log.i(Y[237] + str + Y[243] + true + Y[246] + abVar.b());
        return true;
    }

    public void a(String str, int i, boolean z) {
        a5w com_whatsapp_a5w = (a5w) this.l.get(str);
        if (com_whatsapp_a5w != null) {
            try {
                if (a5w.g(com_whatsapp_a5w) != i) {
                    a5w.c(com_whatsapp_a5w, i);
                    this.b.post(new ar4(this, i, str));
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        if (com_whatsapp_a5w != null && z && i != -1) {
            try {
                App.a(9, str, 0, 0);
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }
    }

    public void a(boolean z) {
        boolean z2 = l5.s;
        Log.i(Y[478] + z);
        for (a5w a : this.l.values()) {
            a5w.a(a, z);
            if (z2) {
                break;
            }
        }
        this.O.post(new al5(this, z));
        this.b.post(new l1(this, z));
    }

    private static void a(co coVar, SQLiteStatement sQLiteStatement) {
        long j = 0;
        try {
            long j2;
            sQLiteStatement.bindLong(1, (long) coVar.d);
            if (coVar.x) {
                j2 = 2;
            } else {
                j2 = 0;
            }
            try {
                sQLiteStatement.bindLong(2, j2);
                a(coVar, sQLiteStatement, 4, 3);
                sQLiteStatement.bindLong(5, coVar.b);
                a5f.a(6, coVar.q, sQLiteStatement);
                a5f.a(7, coVar.n, sQLiteStatement);
                sQLiteStatement.bindLong(8, (long) coVar.c);
                sQLiteStatement.bindLong(9, coVar.z);
                a5f.a(10, coVar.A, sQLiteStatement);
                a5f.a(11, coVar.a, sQLiteStatement);
                a5f.a(12, coVar.o, sQLiteStatement);
                if (coVar.c == 9) {
                    j2 = (long) coVar.R;
                } else {
                    j2 = (long) coVar.H;
                }
                try {
                    sQLiteStatement.bindLong(13, j2);
                    sQLiteStatement.bindLong(14, (long) coVar.r);
                    sQLiteStatement.bindDouble(15, coVar.m);
                    sQLiteStatement.bindDouble(16, coVar.l);
                    a5f.a(17, a(coVar.Q), sQLiteStatement);
                    sQLiteStatement.bindString(18, coVar.k.c);
                    if (coVar.k.a) {
                        j = 1;
                    }
                    sQLiteStatement.bindLong(19, j);
                    sQLiteStatement.bindString(20, coVar.k.b);
                } catch (IllegalStateException e) {
                    throw e;
                }
            } catch (IllegalStateException e2) {
                throw e2;
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    static boolean c(ael com_whatsapp_ael, String str) {
        return com_whatsapp_ael.z(str);
    }

    public void a(Collection collection, boolean z, boolean z2) {
        boolean z3 = l5.s;
        Log.i(Y[521] + collection.size());
        for (co coVar : collection) {
            this.z.remove(coVar.k);
            if (z3) {
                break;
            }
        }
        this.b.post(new azm(this, collection, z, z2));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.whatsapp.protocol.co a(com.whatsapp.protocol.c3 r10) {
        /*
        r9 = this;
        r1 = 1;
        r2 = 0;
        if (r10 != 0) goto L_0x0006;
    L_0x0004:
        r0 = 0;
    L_0x0005:
        return r0;
    L_0x0006:
        r3 = r9.a;
        monitor-enter(r3);
        r0 = r9.d(r10);	 Catch:{ all -> 0x0011 }
        if (r0 == 0) goto L_0x0014;
    L_0x000f:
        monitor-exit(r3);	 Catch:{ all -> 0x0011 }
        goto L_0x0005;
    L_0x0011:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0011 }
        throw r0;
    L_0x0014:
        r4 = r9.a;	 Catch:{ IllegalStateException -> 0x0065 }
        r4 = r4.getReadableDatabase();	 Catch:{ IllegalStateException -> 0x0065 }
        r5 = Y;	 Catch:{ IllegalStateException -> 0x0065 }
        r6 = 431; // 0x1af float:6.04E-43 double:2.13E-321;
        r5 = r5[r6];	 Catch:{ IllegalStateException -> 0x0065 }
        r6 = 3;
        r6 = new java.lang.String[r6];	 Catch:{ IllegalStateException -> 0x0065 }
        r7 = 0;
        r8 = r10.c;	 Catch:{ IllegalStateException -> 0x0065 }
        r6[r7] = r8;	 Catch:{ IllegalStateException -> 0x0065 }
        r7 = 1;
        r8 = r10.a;	 Catch:{ IllegalStateException -> 0x0065 }
        if (r8 == 0) goto L_0x0067;
    L_0x002d:
        r1 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x0011 }
        r6[r7] = r1;	 Catch:{ all -> 0x0011 }
        r1 = 2;
        r2 = r10.b;	 Catch:{ all -> 0x0011 }
        r6[r1] = r2;	 Catch:{ all -> 0x0011 }
        r1 = r4.rawQuery(r5, r6);	 Catch:{ all -> 0x0011 }
        if (r1 == 0) goto L_0x0051;
    L_0x003e:
        r2 = r1.moveToLast();	 Catch:{ all -> 0x0069 }
        if (r2 == 0) goto L_0x004a;
    L_0x0044:
        r0 = r10.c;	 Catch:{ all -> 0x0069 }
        r0 = r9.a(r1, r0);	 Catch:{ all -> 0x0069 }
    L_0x004a:
        r1.close();	 Catch:{ all -> 0x0011 }
        r1 = com.whatsapp.l5.s;	 Catch:{ IllegalStateException -> 0x006e }
        if (r1 == 0) goto L_0x005a;
    L_0x0051:
        r1 = Y;	 Catch:{ IllegalStateException -> 0x006e }
        r2 = 432; // 0x1b0 float:6.05E-43 double:2.134E-321;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x006e }
        com.whatsapp.util.Log.e(r1);	 Catch:{ IllegalStateException -> 0x006e }
    L_0x005a:
        if (r0 == 0) goto L_0x0063;
    L_0x005c:
        r1 = r9.p;	 Catch:{ IllegalStateException -> 0x0070 }
        r2 = r0.k;	 Catch:{ IllegalStateException -> 0x0070 }
        r1.put(r2, r0);	 Catch:{ IllegalStateException -> 0x0070 }
    L_0x0063:
        monitor-exit(r3);	 Catch:{ all -> 0x0011 }
        goto L_0x0005;
    L_0x0065:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0011 }
    L_0x0067:
        r1 = r2;
        goto L_0x002d;
    L_0x0069:
        r0 = move-exception;
        r1.close();	 Catch:{ all -> 0x0011 }
        throw r0;	 Catch:{ all -> 0x0011 }
    L_0x006e:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0011 }
    L_0x0070:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0011 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.a(com.whatsapp.protocol.c3):com.whatsapp.protocol.co");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.whatsapp.protocol.co r7, long r8) {
        /*
        r6 = this;
        r1 = r6.a;
        monitor-enter(r1);
        r6.O();	 Catch:{ all -> 0x008b }
        r0 = r7.k;	 Catch:{ all -> 0x008b }
        r0 = r0.c;	 Catch:{ all -> 0x008b }
        r0 = com.whatsapp.l5.e(r0);	 Catch:{ all -> 0x008b }
        if (r0 == 0) goto L_0x0042;
    L_0x0010:
        r0 = r6.W;	 Catch:{ all -> 0x008b }
        r2 = 1;
        r3 = r7.d;	 Catch:{ IllegalStateException -> 0x0089 }
        r4 = (long) r3;	 Catch:{ IllegalStateException -> 0x0089 }
        r0.bindLong(r2, r4);	 Catch:{ IllegalStateException -> 0x0089 }
        r2 = 2;
        r0.bindLong(r2, r8);	 Catch:{ IllegalStateException -> 0x0089 }
        r2 = 3;
        r3 = r7.L;	 Catch:{ IllegalStateException -> 0x0089 }
        r4 = (long) r3;	 Catch:{ IllegalStateException -> 0x0089 }
        r0.bindLong(r2, r4);	 Catch:{ IllegalStateException -> 0x0089 }
        r2 = 4;
        r4 = r7.b;	 Catch:{ IllegalStateException -> 0x0089 }
        r0.bindLong(r2, r4);	 Catch:{ IllegalStateException -> 0x0089 }
        r4 = 5;
        r2 = r7.k;	 Catch:{ IllegalStateException -> 0x0089 }
        r2 = r2.a;	 Catch:{ IllegalStateException -> 0x0089 }
        if (r2 == 0) goto L_0x008e;
    L_0x0031:
        r2 = 1;
    L_0x0033:
        r0.bindLong(r4, r2);	 Catch:{ all -> 0x008b }
        r2 = 6;
        r3 = r7.k;	 Catch:{ all -> 0x008b }
        r3 = r3.b;	 Catch:{ all -> 0x008b }
        r0.bindString(r2, r3);	 Catch:{ all -> 0x008b }
        r2 = com.whatsapp.l5.s;	 Catch:{ all -> 0x008b }
        if (r2 == 0) goto L_0x0072;
    L_0x0042:
        r0 = r6.K;	 Catch:{ all -> 0x008b }
        r2 = 1;
        r3 = r7.d;	 Catch:{ IllegalStateException -> 0x0091 }
        r4 = (long) r3;	 Catch:{ IllegalStateException -> 0x0091 }
        r0.bindLong(r2, r4);	 Catch:{ IllegalStateException -> 0x0091 }
        r2 = 2;
        r0.bindLong(r2, r8);	 Catch:{ IllegalStateException -> 0x0091 }
        r2 = 3;
        r3 = r7.L;	 Catch:{ IllegalStateException -> 0x0091 }
        r4 = (long) r3;	 Catch:{ IllegalStateException -> 0x0091 }
        r0.bindLong(r2, r4);	 Catch:{ IllegalStateException -> 0x0091 }
        r2 = 4;
        r3 = r7.k;	 Catch:{ IllegalStateException -> 0x0091 }
        r3 = r3.c;	 Catch:{ IllegalStateException -> 0x0091 }
        r0.bindString(r2, r3);	 Catch:{ IllegalStateException -> 0x0091 }
        r4 = 5;
        r2 = r7.k;	 Catch:{ IllegalStateException -> 0x0091 }
        r2 = r2.a;	 Catch:{ IllegalStateException -> 0x0091 }
        if (r2 == 0) goto L_0x0093;
    L_0x0065:
        r2 = 1;
    L_0x0067:
        r0.bindLong(r4, r2);	 Catch:{ all -> 0x008b }
        r2 = 6;
        r3 = r7.k;	 Catch:{ all -> 0x008b }
        r3 = r3.b;	 Catch:{ all -> 0x008b }
        r0.bindString(r2, r3);	 Catch:{ all -> 0x008b }
    L_0x0072:
        r0.execute();	 Catch:{ IllegalStateException -> 0x0096 }
        r0 = r7.k;	 Catch:{ IllegalStateException -> 0x0096 }
        r0 = r0.c;	 Catch:{ IllegalStateException -> 0x0096 }
        r0 = com.whatsapp.l5.e(r0);	 Catch:{ IllegalStateException -> 0x0096 }
        if (r0 == 0) goto L_0x0087;
    L_0x007f:
        r0 = new com.whatsapp.arv;	 Catch:{ IllegalStateException -> 0x0096 }
        r0.<init>(r6, r7);	 Catch:{ IllegalStateException -> 0x0096 }
        r6.a(r0);	 Catch:{ IllegalStateException -> 0x0096 }
    L_0x0087:
        monitor-exit(r1);	 Catch:{ all -> 0x008b }
        return;
    L_0x0089:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x008b }
    L_0x008b:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x008b }
        throw r0;
    L_0x008e:
        r2 = 0;
        goto L_0x0033;
    L_0x0091:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x008b }
    L_0x0093:
        r2 = 0;
        goto L_0x0067;
    L_0x0096:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x008b }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.a(com.whatsapp.protocol.co, long):void");
    }

    public double w(String str) {
        a5w com_whatsapp_a5w = (a5w) this.l.get(str);
        if (com_whatsapp_a5w == null) {
            return 0.0d;
        }
        return a5w.b(com_whatsapp_a5w);
    }

    public void e(String str, boolean z) {
        try {
            nf.a(k.CHAT_CLEAR);
            Log.i(Y[459] + str);
            Message.obtain(this.b, 5, str).sendToTarget();
            if (str != null && z) {
                com.whatsapp.protocol.bf bfVar = new com.whatsapp.protocol.bf(str, 1, 0);
                bfVar.c = true;
                App.a(bfVar, 0);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.whatsapp.protocol.co a(android.database.Cursor r13, java.lang.String r14) {
        /*
        r12 = this;
        r11 = 9;
        r10 = 2;
        r1 = 0;
        r4 = 0;
        r3 = 1;
        r5 = com.whatsapp.l5.s;
        if (r13 == 0) goto L_0x000c;
    L_0x000a:
        if (r14 != 0) goto L_0x000e;
    L_0x000c:
        r0 = r1;
    L_0x000d:
        return r0;
    L_0x000e:
        r0 = r13.getColumnCount();	 Catch:{ IOException -> 0x001e }
        if (r0 != r3) goto L_0x0020;
    L_0x0014:
        r0 = 0;
        r0 = r13.getLong(r0);	 Catch:{ IOException -> 0x001e }
        r0 = r12.a(r0);	 Catch:{ IOException -> 0x001e }
        goto L_0x000d;
    L_0x001e:
        r0 = move-exception;
        throw r0;
    L_0x0020:
        r6 = r12.a;
        monitor-enter(r6);
        r0 = 1;
        r2 = r13.getString(r0);	 Catch:{ all -> 0x0055 }
        if (r2 == 0) goto L_0x0036;
    L_0x002a:
        r0 = Y;	 Catch:{ IOException -> 0x0053 }
        r7 = 231; // 0xe7 float:3.24E-43 double:1.14E-321;
        r0 = r0[r7];	 Catch:{ IOException -> 0x0053 }
        r0 = r2.equals(r0);	 Catch:{ IOException -> 0x0053 }
        if (r0 == 0) goto L_0x0058;
    L_0x0036:
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0055 }
        r0.<init>();	 Catch:{ all -> 0x0055 }
        r2 = Y;	 Catch:{ all -> 0x0055 }
        r3 = 229; // 0xe5 float:3.21E-43 double:1.13E-321;
        r2 = r2[r3];	 Catch:{ all -> 0x0055 }
        r0 = r0.append(r2);	 Catch:{ all -> 0x0055 }
        r0 = r0.append(r14);	 Catch:{ all -> 0x0055 }
        r0 = r0.toString();	 Catch:{ all -> 0x0055 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ all -> 0x0055 }
        monitor-exit(r6);	 Catch:{ all -> 0x0055 }
        r0 = r1;
        goto L_0x000d;
    L_0x0053:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0055 }
    L_0x0055:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0055 }
        throw r0;
    L_0x0058:
        r0 = 0;
        r0 = r13.getInt(r0);	 Catch:{ IOException -> 0x006d }
        if (r0 != r3) goto L_0x006f;
    L_0x005f:
        r0 = r3;
    L_0x0060:
        r7 = new com.whatsapp.protocol.c3;	 Catch:{ all -> 0x0055 }
        r7.<init>(r14, r0, r2);	 Catch:{ all -> 0x0055 }
        r0 = r12.d(r7);	 Catch:{ all -> 0x0055 }
        if (r0 == 0) goto L_0x0071;
    L_0x006b:
        monitor-exit(r6);	 Catch:{ all -> 0x0055 }
        goto L_0x000d;
    L_0x006d:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0055 }
    L_0x006f:
        r0 = r4;
        goto L_0x0060;
    L_0x0071:
        r2 = new com.whatsapp.protocol.co;	 Catch:{ all -> 0x0055 }
        r2.<init>(r7);	 Catch:{ all -> 0x0055 }
        r0 = 8;
        r0 = r13.getInt(r0);	 Catch:{ IOException -> 0x01f3 }
        r0 = (byte) r0;	 Catch:{ IOException -> 0x01f3 }
        r2.c = r0;	 Catch:{ IOException -> 0x01f3 }
        r0 = r2.c;	 Catch:{ IOException -> 0x01f3 }
        if (r0 == r3) goto L_0x0095;
    L_0x0083:
        r0 = r2.c;	 Catch:{ IOException -> 0x01f3 }
        r7 = 5;
        if (r0 == r7) goto L_0x0095;
    L_0x0088:
        r0 = r2.c;	 Catch:{ IOException -> 0x01f5 }
        r7 = 3;
        if (r0 == r7) goto L_0x0095;
    L_0x008d:
        r0 = r2.c;	 Catch:{ IOException -> 0x01f7 }
        if (r0 == r10) goto L_0x0095;
    L_0x0091:
        r0 = r2.c;	 Catch:{ IOException -> 0x01f9 }
        if (r0 != r11) goto L_0x00af;
    L_0x0095:
        r0 = 19;
        r0 = r13.getBlob(r0);	 Catch:{ all -> 0x0055 }
        if (r0 == 0) goto L_0x00a5;
    L_0x009d:
        r2.a(r0);	 Catch:{ IOException -> 0x01fb }
        r0 = 1;
        r2.u = r0;	 Catch:{ IOException -> 0x01fb }
        if (r5 == 0) goto L_0x00ad;
    L_0x00a5:
        r0 = 4;
        r0 = r13.getString(r0);	 Catch:{ IOException -> 0x01fd }
        r2.b(r0);	 Catch:{ IOException -> 0x01fd }
    L_0x00ad:
        if (r5 == 0) goto L_0x00b7;
    L_0x00af:
        r0 = 4;
        r0 = r13.getString(r0);	 Catch:{ IOException -> 0x01ff }
        r2.b(r0);	 Catch:{ IOException -> 0x01ff }
    L_0x00b7:
        r0 = r2.u;	 Catch:{ IOException -> 0x0201 }
        if (r0 != 0) goto L_0x00c7;
    L_0x00bb:
        r0 = r2.c();	 Catch:{ IOException -> 0x0201 }
        if (r0 != 0) goto L_0x00c7;
    L_0x00c1:
        r0 = "";
        r2.b(r0);	 Catch:{ IOException -> 0x0203 }
    L_0x00c7:
        r0 = 23;
        r8 = r13.getLong(r0);	 Catch:{ IOException -> 0x0205 }
        r2.I = r8;	 Catch:{ IOException -> 0x0205 }
        r0 = 3;
        r0 = r13.getInt(r0);	 Catch:{ IOException -> 0x0205 }
        if (r0 != r10) goto L_0x0207;
    L_0x00d6:
        r0 = r3;
    L_0x00d7:
        r2.x = r0;	 Catch:{ IOException -> 0x020a }
        r0 = 2;
        r0 = r13.getInt(r0);	 Catch:{ IOException -> 0x020a }
        r2.d = r0;	 Catch:{ IOException -> 0x020a }
        r0 = 5;
        r8 = r13.getLong(r0);	 Catch:{ IOException -> 0x020a }
        r2.b = r8;	 Catch:{ IOException -> 0x020a }
        r0 = 6;
        r0 = r13.getString(r0);	 Catch:{ IOException -> 0x020a }
        r2.q = r0;	 Catch:{ IOException -> 0x020a }
        r0 = 7;
        r0 = r13.getString(r0);	 Catch:{ IOException -> 0x020a }
        r2.n = r0;	 Catch:{ IOException -> 0x020a }
        r0 = 9;
        r8 = r13.getLong(r0);	 Catch:{ IOException -> 0x020a }
        r2.z = r8;	 Catch:{ IOException -> 0x020a }
        r0 = 10;
        r0 = r13.getString(r0);	 Catch:{ IOException -> 0x020a }
        r2.A = r0;	 Catch:{ IOException -> 0x020a }
        r0 = 11;
        r0 = r13.getString(r0);	 Catch:{ IOException -> 0x020a }
        r2.a = r0;	 Catch:{ IOException -> 0x020a }
        r0 = 12;
        r0 = r13.getString(r0);	 Catch:{ IOException -> 0x020a }
        r2.o = r0;	 Catch:{ IOException -> 0x020a }
        r0 = r2.c;	 Catch:{ IOException -> 0x020a }
        if (r0 != r11) goto L_0x0123;
    L_0x0119:
        r0 = 13;
        r0 = r13.getInt(r0);	 Catch:{ IOException -> 0x020a }
        r2.R = r0;	 Catch:{ IOException -> 0x020a }
        if (r5 == 0) goto L_0x012b;
    L_0x0123:
        r0 = 13;
        r0 = r13.getInt(r0);	 Catch:{ IOException -> 0x020c }
        r2.H = r0;	 Catch:{ IOException -> 0x020c }
    L_0x012b:
        r0 = 14;
        r0 = r13.getInt(r0);	 Catch:{ IOException -> 0x020e }
        r2.r = r0;	 Catch:{ IOException -> 0x020e }
        r0 = 15;
        r8 = r13.getDouble(r0);	 Catch:{ IOException -> 0x020e }
        r2.m = r8;	 Catch:{ IOException -> 0x020e }
        r0 = 16;
        r8 = r13.getDouble(r0);	 Catch:{ IOException -> 0x020e }
        r2.l = r8;	 Catch:{ IOException -> 0x020e }
        r0 = 18;
        r0 = r13.getString(r0);	 Catch:{ IOException -> 0x020e }
        r2.t = r0;	 Catch:{ IOException -> 0x020e }
        r0 = 20;
        r0 = r13.getInt(r0);	 Catch:{ IOException -> 0x020e }
        r2.L = r0;	 Catch:{ IOException -> 0x020e }
        r0 = 21;
        r0 = r13.getString(r0);	 Catch:{ IOException -> 0x020e }
        r2.g = r0;	 Catch:{ IOException -> 0x020e }
        r0 = 22;
        r0 = r13.getInt(r0);	 Catch:{ IOException -> 0x020e }
        if (r0 != r3) goto L_0x0210;
    L_0x0163:
        r0 = r3;
    L_0x0164:
        r2.P = r0;	 Catch:{ all -> 0x0055 }
        r0 = 17;
        r0 = r13.getBlob(r0);	 Catch:{ all -> 0x0055 }
        if (r0 != 0) goto L_0x0173;
    L_0x016e:
        r3 = 0;
        r2.Q = r3;	 Catch:{ IOException -> 0x0213 }
        if (r5 == 0) goto L_0x01e8;
    L_0x0173:
        r3 = new java.io.ObjectInputStream;	 Catch:{ IOException -> 0x0257, ClassNotFoundException -> 0x021b }
        r4 = new java.io.ByteArrayInputStream;	 Catch:{ IOException -> 0x0257, ClassNotFoundException -> 0x021b }
        r4.<init>(r0);	 Catch:{ IOException -> 0x0257, ClassNotFoundException -> 0x021b }
        r3.<init>(r4);	 Catch:{ IOException -> 0x0257, ClassNotFoundException -> 0x021b }
        r0 = r3.readObject();	 Catch:{ IOException -> 0x0259, ClassNotFoundException -> 0x0254, all -> 0x0251 }
        r2.Q = r0;	 Catch:{ IOException -> 0x0259, ClassNotFoundException -> 0x0254, all -> 0x0251 }
        if (r3 == 0) goto L_0x0188;
    L_0x0185:
        r3.close();	 Catch:{ IOException -> 0x0215 }
    L_0x0188:
        r0 = r2.Q;	 Catch:{ all -> 0x0055 }
        r0 = r0 instanceof com.whatsapp.MediaData;	 Catch:{ all -> 0x0055 }
        if (r0 == 0) goto L_0x01e8;
    L_0x018e:
        r0 = r2.Q;	 Catch:{ all -> 0x0055 }
        r0 = (com.whatsapp.MediaData) r0;	 Catch:{ all -> 0x0055 }
        r1 = r0.file;	 Catch:{ IOException -> 0x0249 }
        if (r1 == 0) goto L_0x01e8;
    L_0x0196:
        r1 = r0.file;	 Catch:{ IOException -> 0x0249 }
        r1 = r1.isAbsolute();	 Catch:{ IOException -> 0x0249 }
        if (r1 != 0) goto L_0x01af;
    L_0x019e:
        r1 = new java.io.File;	 Catch:{ IOException -> 0x024b }
        r3 = com.whatsapp.App.a3;	 Catch:{ IOException -> 0x024b }
        r4 = r0.file;	 Catch:{ IOException -> 0x024b }
        r4 = r4.getPath();	 Catch:{ IOException -> 0x024b }
        r1.<init>(r3, r4);	 Catch:{ IOException -> 0x024b }
        r0.file = r1;	 Catch:{ IOException -> 0x024b }
        if (r5 == 0) goto L_0x01e8;
    L_0x01af:
        r1 = r0.file;	 Catch:{ IOException -> 0x024d }
        r1 = r1.getAbsolutePath();	 Catch:{ IOException -> 0x024d }
        r3 = android.os.Environment.getExternalStorageDirectory();	 Catch:{ IOException -> 0x024d }
        r3 = r3.getAbsolutePath();	 Catch:{ IOException -> 0x024d }
        r1 = r1.startsWith(r3);	 Catch:{ IOException -> 0x024d }
        if (r1 != 0) goto L_0x01e8;
    L_0x01c3:
        r1 = r0.file;	 Catch:{ all -> 0x0055 }
        r1 = r1.getAbsolutePath();	 Catch:{ all -> 0x0055 }
        r3 = Y;	 Catch:{ all -> 0x0055 }
        r4 = 230; // 0xe6 float:3.22E-43 double:1.136E-321;
        r3 = r3[r4];	 Catch:{ all -> 0x0055 }
        r1 = r1.indexOf(r3);	 Catch:{ all -> 0x0055 }
        if (r1 <= 0) goto L_0x01e8;
    L_0x01d5:
        r3 = new java.io.File;	 Catch:{ IOException -> 0x024f }
        r4 = com.whatsapp.App.a3;	 Catch:{ IOException -> 0x024f }
        r5 = r0.file;	 Catch:{ IOException -> 0x024f }
        r5 = r5.getAbsolutePath();	 Catch:{ IOException -> 0x024f }
        r1 = r5.substring(r1);	 Catch:{ IOException -> 0x024f }
        r3.<init>(r4, r1);	 Catch:{ IOException -> 0x024f }
        r0.file = r3;	 Catch:{ IOException -> 0x024f }
    L_0x01e8:
        r0 = r12.p;	 Catch:{ all -> 0x0055 }
        r1 = r2.k;	 Catch:{ all -> 0x0055 }
        r0.put(r1, r2);	 Catch:{ all -> 0x0055 }
        monitor-exit(r6);	 Catch:{ all -> 0x0055 }
        r0 = r2;
        goto L_0x000d;
    L_0x01f3:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01f5 }
    L_0x01f5:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01f7 }
    L_0x01f7:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01f9 }
    L_0x01f9:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0055 }
    L_0x01fb:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01fd }
    L_0x01fd:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0055 }
    L_0x01ff:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0055 }
    L_0x0201:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0203 }
    L_0x0203:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0055 }
    L_0x0205:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0055 }
    L_0x0207:
        r0 = r4;
        goto L_0x00d7;
    L_0x020a:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x020c }
    L_0x020c:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0055 }
    L_0x020e:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0055 }
    L_0x0210:
        r0 = r4;
        goto L_0x0164;
    L_0x0213:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0055 }
    L_0x0215:
        r0 = move-exception;
        com.whatsapp.util.Log.a(r0);	 Catch:{ all -> 0x0055 }
        goto L_0x0188;
    L_0x021b:
        r0 = move-exception;
    L_0x021c:
        com.whatsapp.util.Log.a(r0);	 Catch:{ IOException -> 0x0237 }
        r0 = r2.c;	 Catch:{ IOException -> 0x0237 }
        if (r0 == 0) goto L_0x022a;
    L_0x0223:
        r0 = new com.whatsapp.MediaData;	 Catch:{ IOException -> 0x0237 }
        r0.<init>();	 Catch:{ IOException -> 0x0237 }
        r2.Q = r0;	 Catch:{ IOException -> 0x0237 }
    L_0x022a:
        if (r1 == 0) goto L_0x0188;
    L_0x022c:
        r1.close();	 Catch:{ IOException -> 0x0231, ClassNotFoundException -> 0x0240 }
        goto L_0x0188;
    L_0x0231:
        r0 = move-exception;
        com.whatsapp.util.Log.a(r0);	 Catch:{ all -> 0x0055 }
        goto L_0x0188;
    L_0x0237:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0239 }
    L_0x0239:
        r0 = move-exception;
    L_0x023a:
        if (r1 == 0) goto L_0x023f;
    L_0x023c:
        r1.close();	 Catch:{ IOException -> 0x0244, ClassNotFoundException -> 0x0242 }
    L_0x023f:
        throw r0;	 Catch:{ all -> 0x0055 }
    L_0x0240:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0055 }
    L_0x0242:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0055 }
    L_0x0244:
        r1 = move-exception;
        com.whatsapp.util.Log.a(r1);	 Catch:{ all -> 0x0055 }
        goto L_0x023f;
    L_0x0249:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x024b }
    L_0x024b:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x024d }
    L_0x024d:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0055 }
    L_0x024f:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0055 }
    L_0x0251:
        r0 = move-exception;
        r1 = r3;
        goto L_0x023a;
    L_0x0254:
        r0 = move-exception;
        r1 = r3;
        goto L_0x021c;
    L_0x0257:
        r0 = move-exception;
        goto L_0x021c;
    L_0x0259:
        r0 = move-exception;
        r1 = r3;
        goto L_0x021c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.a(android.database.Cursor, java.lang.String):com.whatsapp.protocol.co");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(com.whatsapp.protocol.co r7, android.database.sqlite.SQLiteStatement r8, int r9, int r10) {
        /*
        r2 = 1;
        r1 = 0;
        r0 = r7.c;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x005b }
        if (r0 == r2) goto L_0x001b;
    L_0x0006:
        r0 = r7.c;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x005b }
        r2 = 5;
        if (r0 == r2) goto L_0x001b;
    L_0x000b:
        r0 = r7.c;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x005d }
        r2 = 3;
        if (r0 == r2) goto L_0x001b;
    L_0x0010:
        r0 = r7.c;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x005f }
        r2 = 2;
        if (r0 == r2) goto L_0x001b;
    L_0x0015:
        r0 = r7.c;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0061 }
        r2 = 9;
        if (r0 != r2) goto L_0x004f;
    L_0x001b:
        r0 = r7.u;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0063 }
        if (r0 != 0) goto L_0x00cc;
    L_0x001f:
        r0 = r7.c();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0063 }
        if (r0 == 0) goto L_0x00cc;
    L_0x0025:
        r0 = r7.c();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0065, StringIndexOutOfBoundsException -> 0x00d6, IllegalArgumentException -> 0x00d4 }
        r0 = r0.length();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0065, StringIndexOutOfBoundsException -> 0x00d6, IllegalArgumentException -> 0x00d4 }
        if (r0 == 0) goto L_0x0038;
    L_0x002f:
        r0 = r7.c();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0065, StringIndexOutOfBoundsException -> 0x00d6, IllegalArgumentException -> 0x00d4 }
        r2 = 0;
        r1 = android.backport.util.Base64.decode(r0, r2);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0065, StringIndexOutOfBoundsException -> 0x00d6, IllegalArgumentException -> 0x00d4 }
    L_0x0038:
        r0 = 0;
        r0 = (java.lang.String) r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0065, StringIndexOutOfBoundsException -> 0x00d6, IllegalArgumentException -> 0x00d4 }
        r7.b(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0065, StringIndexOutOfBoundsException -> 0x00d6, IllegalArgumentException -> 0x00d4 }
        r7.a(r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0065, StringIndexOutOfBoundsException -> 0x00d6, IllegalArgumentException -> 0x00d4 }
        r0 = 1;
        r7.u = r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0065, StringIndexOutOfBoundsException -> 0x00d6, IllegalArgumentException -> 0x00d4 }
    L_0x0044:
        com.whatsapp.a5f.a(r9, r1, r8);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00d2 }
        r0 = 0;
        com.whatsapp.a5f.a(r10, r0, r8);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00d2 }
        r0 = com.whatsapp.l5.s;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00d2 }
        if (r0 == 0) goto L_0x005a;
    L_0x004f:
        r0 = r7.c();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00d2 }
        com.whatsapp.a5f.a(r10, r0, r8);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00d2 }
        r0 = 0;
        com.whatsapp.a5f.a(r9, r0, r8);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00d2 }
    L_0x005a:
        return;
    L_0x005b:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x005d }
    L_0x005d:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x005f }
    L_0x005f:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0061 }
    L_0x0061:
        r0 = move-exception;
        throw r0;
    L_0x0063:
        r0 = move-exception;
        throw r0;
    L_0x0065:
        r0 = move-exception;
    L_0x0066:
        r2 = new java.lang.StringBuilder;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00c8 }
        r2.<init>();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00c8 }
        r3 = Y;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00c8 }
        r4 = 685; // 0x2ad float:9.6E-43 double:3.384E-321;
        r3 = r3[r4];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00c8 }
        r2 = r2.append(r3);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00c8 }
        r3 = r7.u;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00c8 }
        r2 = r2.append(r3);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00c8 }
        r2 = r2.toString();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00c8 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00c8 }
        r2 = r7.u;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00c8 }
        if (r2 != 0) goto L_0x00bd;
    L_0x0086:
        r2 = r7.c();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00ca }
        if (r2 == 0) goto L_0x00bd;
    L_0x008c:
        r2 = new java.lang.StringBuilder;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00ca }
        r2.<init>();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00ca }
        r3 = Y;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00ca }
        r4 = 686; // 0x2ae float:9.61E-43 double:3.39E-321;
        r3 = r3[r4];	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00ca }
        r2 = r2.append(r3);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00ca }
        r3 = r7.c();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00ca }
        r4 = 0;
        r5 = 100;
        r6 = r7.c();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00ca }
        r6 = r6.length();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00ca }
        r5 = java.lang.Math.min(r5, r6);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00ca }
        r3 = r3.substring(r4, r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00ca }
        r2 = r2.append(r3);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00ca }
        r2 = r2.toString();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00ca }
        com.whatsapp.util.Log.e(r2);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00ca }
    L_0x00bd:
        r2 = Y;
        r3 = 687; // 0x2af float:9.63E-43 double:3.394E-321;
        r2 = r2[r3];
        com.whatsapp.util.Log.b(r2, r0);
        goto L_0x0044;
    L_0x00c8:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x00ca }
    L_0x00ca:
        r0 = move-exception;
        throw r0;
    L_0x00cc:
        r1 = r7.e();
        goto L_0x0044;
    L_0x00d2:
        r0 = move-exception;
        throw r0;
    L_0x00d4:
        r0 = move-exception;
        goto L_0x0066;
    L_0x00d6:
        r0 = move-exception;
        goto L_0x0066;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.a(com.whatsapp.protocol.co, android.database.sqlite.SQLiteStatement, int, int):void");
    }

    public List f() {
        boolean z = l5.s;
        try {
            List arrayList = new ArrayList();
            Cursor a = a(null, null);
            while (a.moveToNext()) {
                co a2 = a(a, a.getString(a.getColumnIndex(Y[467])));
                if (a2 != null) {
                    arrayList.add(a2);
                }
                if (z) {
                    return arrayList;
                }
            }
            return arrayList;
        } catch (Exception e) {
            throw e;
        } catch (Exception e2) {
            return null;
        }
    }

    public static int a(File file) {
        SQLiteDatabase openDatabase;
        Throwable e;
        Throwable th;
        int i = -1;
        Cursor cursor = null;
        try {
            openDatabase = SQLiteDatabase.openDatabase(file.getAbsolutePath(), null, 16);
            try {
                cursor = openDatabase.rawQuery(Y[266], null);
                if (cursor == null) {
                    if (cursor != null) {
                        try {
                            cursor.close();
                        } catch (Exception e2) {
                            throw e2;
                        }
                    }
                    if (openDatabase != null) {
                        try {
                            openDatabase.close();
                        } catch (Exception e22) {
                            throw e22;
                        }
                    }
                } else if (cursor.moveToNext()) {
                    i = cursor.getInt(0) - 1;
                    if (cursor != null) {
                        try {
                            cursor.close();
                        } catch (Exception e222) {
                            throw e222;
                        }
                    }
                    if (openDatabase != null) {
                        try {
                            openDatabase.close();
                        } catch (Exception e2222) {
                            throw e2222;
                        }
                    }
                } else {
                    if (cursor != null) {
                        try {
                            cursor.close();
                        } catch (Exception e22222) {
                            throw e22222;
                        }
                    }
                    if (openDatabase != null) {
                        try {
                            openDatabase.close();
                        } catch (Exception e222222) {
                            throw e222222;
                        }
                    }
                }
            } catch (Exception e3) {
                e = e3;
                try {
                    Log.b(Y[267] + file.getAbsolutePath(), e);
                    if (cursor != null) {
                        try {
                            cursor.close();
                        } catch (Exception e2222222) {
                            throw e2222222;
                        }
                    }
                    if (openDatabase != null) {
                        try {
                            openDatabase.close();
                        } catch (Exception e22222222) {
                            throw e22222222;
                        }
                    }
                    return i;
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        try {
                            cursor.close();
                        } catch (Exception e222222222) {
                            throw e222222222;
                        }
                    }
                    if (openDatabase != null) {
                        try {
                            openDatabase.close();
                        } catch (Exception e2222222222) {
                            throw e2222222222;
                        }
                    }
                    throw th;
                }
            }
        } catch (Exception e4) {
            e = e4;
            openDatabase = cursor;
            Log.b(Y[267] + file.getAbsolutePath(), e);
            if (cursor != null) {
                cursor.close();
            }
            if (openDatabase != null) {
                openDatabase.close();
            }
            return i;
        } catch (Throwable th3) {
            th = th3;
            openDatabase = cursor;
            if (cursor != null) {
                cursor.close();
            }
            if (openDatabase != null) {
                openDatabase.close();
            }
            throw th;
        }
        return i;
    }

    public boolean c() {
        Log.i(Y[713]);
        synchronized (this.a) {
            if (!this.u) {
                File file = new File(X.getParent(), X.getName() + Y[712]);
                if (file.exists()) {
                    App.a(App.w.getRunningAppProcesses());
                }
                Log.i(Y[714] + file.delete());
                Log.i(Y[710] + new File(X.getParent(), X.getName() + Y[715]).delete());
                try {
                    if (b(X)) {
                        if (D()) {
                            O();
                            this.u = true;
                        }
                    }
                } catch (SQLiteDatabaseCorruptException e) {
                    throw e;
                } catch (SQLiteDatabaseCorruptException e2) {
                    Log.e(Y[711] + e2.toString());
                    r();
                }
            }
        }
        return this.u;
    }

    public static String o(String str) {
        try {
            return VERSION.SDK_INT < 9 ? s.matcher(str).replaceAll("").toLowerCase() : s.matcher(Normalizer.normalize(str, Form.NFKD)).replaceAll("").toLowerCase();
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long b(java.lang.String r12, com.whatsapp.protocol.co r13, boolean r14, java.lang.String r15) {
        /*
        r11 = this;
        r2 = 0;
        r4 = com.whatsapp.l5.s;
        r5 = new com.whatsapp.util.ab;
        r0 = Y;
        r1 = 584; // 0x248 float:8.18E-43 double:2.885E-321;
        r0 = r0[r1];
        r5.<init>(r0);
        r6 = r11.b(r13);
        r0 = 1;
        r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1));
        if (r0 != 0) goto L_0x0025;
    L_0x0019:
        r0 = Y;	 Catch:{ IllegalStateException -> 0x0023 }
        r1 = 581; // 0x245 float:8.14E-43 double:2.87E-321;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x0023 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IllegalStateException -> 0x0023 }
    L_0x0022:
        return r2;
    L_0x0023:
        r0 = move-exception;
        throw r0;
    L_0x0025:
        r1 = r11.f(r15);
        r0 = android.text.TextUtils.isEmpty(r1);	 Catch:{ IllegalStateException -> 0x0128 }
        if (r0 != 0) goto L_0x0022;
    L_0x002f:
        r0 = r11.a;
        r8 = r0.getReadableDatabase();
        r0 = Y;
        r9 = 576; // 0x240 float:8.07E-43 double:2.846E-321;
        r0 = r0[r9];
        if (r14 == 0) goto L_0x0078;
    L_0x003d:
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r0 = r9.append(r0);
        r9 = Y;
        r10 = 574; // 0x23e float:8.04E-43 double:2.836E-321;
        r9 = r9[r10];
        r0 = r0.append(r9);
        r0 = r0.append(r6);
        r9 = Y;
        r10 = 589; // 0x24d float:8.25E-43 double:2.91E-321;
        r9 = r9[r10];
        r0 = r0.append(r9);
        r9 = Y;
        r10 = 578; // 0x242 float:8.1E-43 double:2.856E-321;
        r9 = r9[r10];
        r0 = r0.append(r9);
        r9 = Y;
        r10 = 577; // 0x241 float:8.09E-43 double:2.85E-321;
        r9 = r9[r10];
        r0 = r0.append(r9);
        r0 = r0.toString();
        if (r4 == 0) goto L_0x00b1;
    L_0x0078:
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r0 = r9.append(r0);
        r9 = Y;
        r10 = 588; // 0x24c float:8.24E-43 double:2.905E-321;
        r9 = r9[r10];
        r0 = r0.append(r9);
        r0 = r0.append(r6);
        r6 = Y;
        r7 = 579; // 0x243 float:8.11E-43 double:2.86E-321;
        r6 = r6[r7];
        r0 = r0.append(r6);
        r6 = Y;
        r7 = 587; // 0x24b float:8.23E-43 double:2.9E-321;
        r6 = r6[r7];
        r0 = r0.append(r6);
        r6 = Y;
        r7 = 585; // 0x249 float:8.2E-43 double:2.89E-321;
        r6 = r6[r7];
        r0 = r0.append(r6);
        r0 = r0.toString();
    L_0x00b1:
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r0 = r6.append(r0);
        r6 = Y;
        r7 = 580; // 0x244 float:8.13E-43 double:2.866E-321;
        r6 = r6[r7];
        r0 = r0.append(r6);
        r0 = r0.toString();
        r6 = 2;
        r6 = new java.lang.String[r6];
        r7 = 0;
        r6[r7] = r1;
        r1 = 1;
        r6[r1] = r12;
        r6 = r8.rawQuery(r0, r6);
        if (r6 == 0) goto L_0x0133;
    L_0x00d7:
        r0 = r6.moveToNext();	 Catch:{ all -> 0x012a }
        if (r0 == 0) goto L_0x0131;
    L_0x00dd:
        r0 = Y;	 Catch:{ all -> 0x012a }
        r1 = 575; // 0x23f float:8.06E-43 double:2.84E-321;
        r0 = r0[r1];	 Catch:{ all -> 0x012a }
        r0 = r6.getColumnIndex(r0);	 Catch:{ all -> 0x012a }
        r0 = r6.getLong(r0);	 Catch:{ all -> 0x012a }
    L_0x00eb:
        r6.close();
        if (r4 == 0) goto L_0x00f9;
    L_0x00f0:
        r2 = Y;	 Catch:{ IllegalStateException -> 0x012f }
        r3 = 583; // 0x247 float:8.17E-43 double:2.88E-321;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x012f }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IllegalStateException -> 0x012f }
    L_0x00f9:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = Y;
        r4 = 582; // 0x246 float:8.16E-43 double:2.875E-321;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r4 = r5.b();
        r2 = r2.append(r4);
        r3 = Y;
        r4 = 586; // 0x24a float:8.21E-43 double:2.895E-321;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r0);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r2 = r0;
        goto L_0x0022;
    L_0x0128:
        r0 = move-exception;
        throw r0;
    L_0x012a:
        r0 = move-exception;
        r6.close();
        throw r0;
    L_0x012f:
        r0 = move-exception;
        throw r0;
    L_0x0131:
        r0 = r2;
        goto L_0x00eb;
    L_0x0133:
        r0 = r2;
        goto L_0x00f0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ael.b(java.lang.String, com.whatsapp.protocol.co, boolean, java.lang.String):long");
    }

    public Runnable a(Runnable runnable, Runnable runnable2) {
        return this.t.a(runnable, runnable2);
    }

    private void P() {
        Log.i(Y[223]);
        synchronized (this.a) {
            this.w = a(this.w, Y[222]);
            this.C = a(this.C, Y[224]);
            this.K = a(this.K, Y[218]);
            this.W = a(this.W, Y[225]);
            this.x = a(this.x, Y[226]);
            this.F = a(this.F, Y[228]);
            this.h = a(this.h, Y[220]);
            this.J = a(this.J, r);
            this.c = a(this.c, Y[216]);
            this.y = a(this.y, Y[221]);
            this.e = a(this.e, Y[217]);
            this.S = a(this.S, Y[219]);
            this.A = a(this.A, Y[227]);
        }
        this.H = true;
    }

    public Cursor a(String str, int i, nt ntVar) {
        long j;
        String str2;
        String stringBuilder;
        String[] strArr;
        String[] strArr2;
        Cursor com_whatsapp_axz;
        a5w com_whatsapp_a5w = (a5w) this.l.get(str);
        if (com_whatsapp_a5w == null) {
            try {
                if (!l5.s) {
                    j = 1;
                    StringBuilder append = new StringBuilder().append(Y[395]);
                    if (j != 1) {
                        str2 = "";
                    } else {
                        str2 = Y[393];
                    }
                    stringBuilder = append.append(str2).append(Y[394]).toString();
                    strArr = new String[]{str, String.valueOf(j)};
                    strArr2 = new String[]{str};
                    synchronized (this.a) {
                        SQLiteDatabase readableDatabase = this.a.getReadableDatabase();
                        if (j != 1) {
                            strArr2 = strArr;
                        }
                        com_whatsapp_axz = new axz(readableDatabase.rawQuery(stringBuilder, strArr2), ntVar);
                    }
                    return com_whatsapp_axz;
                }
            } catch (IllegalStateException e) {
                throw e;
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }
        if (a5w.k(com_whatsapp_a5w) == 1) {
            a5w.b(com_whatsapp_a5w, d(str, i));
        }
        j = a5w.k(com_whatsapp_a5w);
        try {
            StringBuilder append2 = new StringBuilder().append(Y[395]);
            if (j != 1) {
                str2 = Y[393];
            } else {
                str2 = "";
            }
            stringBuilder = append2.append(str2).append(Y[394]).toString();
            strArr = new String[]{str, String.valueOf(j)};
            strArr2 = new String[]{str};
            synchronized (this.a) {
                SQLiteDatabase readableDatabase2 = this.a.getReadableDatabase();
                if (j != 1) {
                    strArr2 = strArr;
                }
                com_whatsapp_axz = new axz(readableDatabase2.rawQuery(stringBuilder, strArr2), ntVar);
            }
            return com_whatsapp_axz;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    public void c(co coVar) {
        a(coVar, true, -1);
    }

    private String b(SQLiteDatabase sQLiteDatabase, String str) {
        return aoy.a(a(sQLiteDatabase, str));
    }

    static Handler d(ael com_whatsapp_ael) {
        return com_whatsapp_ael.T;
    }

    public void U() {
        Log.i(Y[433]);
        Message.obtain(this.b, 12).sendToTarget();
    }

    static a5f b(ael com_whatsapp_ael) {
        return com_whatsapp_ael.a;
    }

    private static Object a(Object obj) {
        if (!(obj instanceof MediaData)) {
            return obj;
        }
        MediaData mediaData = (MediaData) obj;
        try {
            if (mediaData.file == null || !mediaData.file.isAbsolute()) {
                return obj;
            }
            obj = mediaData.createSerializableCopy();
            obj.file = new File(App.a3.toURI().relativize(obj.file.toURI()).getPath());
            return obj;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void c(String str, String str2) {
        Log.i(Y[688] + str);
        e4 e4Var = new e4(null);
        e4Var.b = str;
        e4Var.a = str2;
        Message.obtain(this.b, 10, 0, 0, e4Var).sendToTarget();
    }
}
