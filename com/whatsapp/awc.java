package com.whatsapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.protocol.bz;
import com.whatsapp.protocol.c3;
import com.whatsapp.util.Log;
import de.greenrobot.event.h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.v;
import org.whispersystems.I;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.aM;
import org.whispersystems.ab;
import org.whispersystems.at;
import org.whispersystems.av;
import org.whispersystems.aw;
import org.whispersystems.b0;
import org.whispersystems.b5;
import org.whispersystems.bp;
import org.whispersystems.bx;
import org.whispersystems.j;
import org.whispersystems.k;
import org.whispersystems.u;
import org.whispersystems.y;

public class awc implements ab, aM, I {
    private static volatile awc d;
    public static final ExecutorService e;
    public static boolean g;
    private static final String[] z;
    private final Context a;
    private final a2r b;
    private final art c;
    private final a5q f;

    private b0 d(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor query = sQLiteDatabase.query(z[115], new String[]{z[114]}, z[117], new String[]{str}, null, null, null);
        try {
            if (query.moveToNext()) {
                byte[] blob = query.getBlob(0);
                query.close();
                try {
                    b0 b0Var = new b0(blob);
                    a(b0Var);
                    return b0Var;
                } catch (Throwable e) {
                    Log.b(z[119] + str + z[112], e);
                    sQLiteDatabase.delete(z[113], z[116], new String[]{str});
                    return new b0();
                }
            }
            query.close();
            Log.i(z[118] + str);
            return new b0();
        } catch (IOException e2) {
            throw e2;
        }
    }

    public void a(String str) {
        a(this.b.getWritableDatabase(), str);
    }

    @NonNull
    private axk c(@NonNull SQLiteDatabase sQLiteDatabase, @NonNull String str) {
        bp bpVar = null;
        Cursor query = sQLiteDatabase.query(z[55], new String[]{z[56], z[58]}, z[59], new String[]{str}, null, null, null);
        try {
            if (query.moveToNext()) {
                byte[] blob = query.getBlob(0);
                Date date = new Date(query.getLong(1) * 1000);
                query.close();
                if (blob != null) {
                    try {
                        bpVar = new bp(blob, 0);
                    } catch (Throwable e) {
                        Log.b(z[52] + str + z[60], e);
                        sQLiteDatabase.delete(z[57], z[53], new String[]{str});
                        return new axk(null, null);
                    }
                }
                Log.i(z[51] + str + z[54] + date);
                return new axk(bpVar, date);
            }
            query.close();
            Log.i(z[61] + str);
            return new axk(null, null);
        } catch (av e2) {
            throw e2;
        }
    }

    public k b() {
        return f(this.b.getWritableDatabase());
    }

    public void c(c3 c3Var) {
        b(this.b.getWritableDatabase(), c3Var);
    }

    public a5q c() {
        return this.f;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void e() {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.b;	 Catch:{ all -> 0x0056 }
        r0.close();	 Catch:{ all -> 0x0056 }
        r0 = r4.a;	 Catch:{ all -> 0x0056 }
        r1 = z;	 Catch:{ all -> 0x0056 }
        r2 = 31;
        r1 = r1[r2];	 Catch:{ all -> 0x0056 }
        r0 = r0.getDatabasePath(r1);	 Catch:{ all -> 0x0056 }
        r1 = r0.delete();	 Catch:{ NullPointerException -> 0x0052 }
        if (r1 == 0) goto L_0x0036;
    L_0x0018:
        r1 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x0054 }
        r1.<init>();	 Catch:{ NullPointerException -> 0x0054 }
        r2 = z;	 Catch:{ NullPointerException -> 0x0054 }
        r3 = 32;
        r2 = r2[r3];	 Catch:{ NullPointerException -> 0x0054 }
        r1 = r1.append(r2);	 Catch:{ NullPointerException -> 0x0054 }
        r1 = r1.append(r0);	 Catch:{ NullPointerException -> 0x0054 }
        r1 = r1.toString();	 Catch:{ NullPointerException -> 0x0054 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NullPointerException -> 0x0054 }
        r1 = g;	 Catch:{ NullPointerException -> 0x0054 }
        if (r1 == 0) goto L_0x0050;
    L_0x0036:
        r1 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x0054 }
        r1.<init>();	 Catch:{ NullPointerException -> 0x0054 }
        r2 = z;	 Catch:{ NullPointerException -> 0x0054 }
        r3 = 33;
        r2 = r2[r3];	 Catch:{ NullPointerException -> 0x0054 }
        r1 = r1.append(r2);	 Catch:{ NullPointerException -> 0x0054 }
        r0 = r1.append(r0);	 Catch:{ NullPointerException -> 0x0054 }
        r0 = r0.toString();	 Catch:{ NullPointerException -> 0x0054 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ NullPointerException -> 0x0054 }
    L_0x0050:
        monitor-exit(r4);
        return;
    L_0x0052:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0054 }
    L_0x0054:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0056 }
    L_0x0056:
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.awc.e():void");
    }

    private int e(SQLiteDatabase sQLiteDatabase) {
        Cursor query = sQLiteDatabase.query(z[50], new String[]{z[46]}, z[47], new String[]{String.valueOf(-1)}, null, null, null);
        try {
            if (query.moveToNext()) {
                int i = query.getInt(0);
                query.close();
                Log.i(z[49] + i);
                return i;
            }
            query.close();
            throw new SQLiteException(z[48]);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public void c(int i) {
        a(this.b.getWritableDatabase(), i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(@android.support.annotation.NonNull android.database.sqlite.SQLiteDatabase r9, @android.support.annotation.NonNull java.lang.String r10, @android.support.annotation.Nullable org.whispersystems.bp r11) {
        /*
        r8 = this;
        r0 = r8.c(r9, r10);
        r0 = r0.b();
        r1 = new android.content.ContentValues;
        r1.<init>();
        r2 = z;	 Catch:{ NullPointerException -> 0x00ad }
        r3 = 23;
        r2 = r2[r3];	 Catch:{ NullPointerException -> 0x00ad }
        r1.put(r2, r10);	 Catch:{ NullPointerException -> 0x00ad }
        if (r11 == 0) goto L_0x002d;
    L_0x0018:
        r2 = z;	 Catch:{ NullPointerException -> 0x00af }
        r3 = 24;
        r2 = r2[r3];	 Catch:{ NullPointerException -> 0x00af }
        r3 = r11.a();	 Catch:{ NullPointerException -> 0x00af }
        r3 = r3.a();	 Catch:{ NullPointerException -> 0x00af }
        r1.put(r2, r3);	 Catch:{ NullPointerException -> 0x00af }
        r2 = g;	 Catch:{ NullPointerException -> 0x00af }
        if (r2 == 0) goto L_0x0036;
    L_0x002d:
        r2 = z;	 Catch:{ NullPointerException -> 0x00af }
        r3 = 30;
        r2 = r2[r3];	 Catch:{ NullPointerException -> 0x00af }
        r1.putNull(r2);	 Catch:{ NullPointerException -> 0x00af }
    L_0x0036:
        r2 = z;
        r3 = 26;
        r2 = r2[r3];
        r4 = java.lang.System.currentTimeMillis();
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r4 = r4 / r6;
        r3 = java.lang.Long.valueOf(r4);
        r1.put(r2, r3);
        r2 = z;
        r3 = 28;
        r2 = r2[r3];
        r3 = 0;
        r2 = r9.replaceOrThrow(r2, r3, r1);
        r1 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x00b1 }
        r1.<init>();	 Catch:{ NullPointerException -> 0x00b1 }
        r4 = z;	 Catch:{ NullPointerException -> 0x00b1 }
        r5 = 27;
        r4 = r4[r5];	 Catch:{ NullPointerException -> 0x00b1 }
        r1 = r1.append(r4);	 Catch:{ NullPointerException -> 0x00b1 }
        r1 = r1.append(r10);	 Catch:{ NullPointerException -> 0x00b1 }
        r4 = z;	 Catch:{ NullPointerException -> 0x00b1 }
        r5 = 29;
        r4 = r4[r5];	 Catch:{ NullPointerException -> 0x00b1 }
        r1 = r1.append(r4);	 Catch:{ NullPointerException -> 0x00b1 }
        r1 = r1.append(r2);	 Catch:{ NullPointerException -> 0x00b1 }
        r1 = r1.toString();	 Catch:{ NullPointerException -> 0x00b1 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NullPointerException -> 0x00b1 }
        if (r11 != 0) goto L_0x0081;
    L_0x007f:
        if (r0 != 0) goto L_0x0089;
    L_0x0081:
        if (r11 == 0) goto L_0x00ac;
    L_0x0083:
        r1 = r11.equals(r0);	 Catch:{ NullPointerException -> 0x00b7 }
        if (r1 != 0) goto L_0x00ac;
    L_0x0089:
        r1 = de.greenrobot.event.h.b();	 Catch:{ NullPointerException -> 0x00b7 }
        r2 = new com.whatsapp.b_;	 Catch:{ NullPointerException -> 0x00b7 }
        r3 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x00b7 }
        r3.<init>();	 Catch:{ NullPointerException -> 0x00b7 }
        r3 = r3.append(r10);	 Catch:{ NullPointerException -> 0x00b7 }
        r4 = z;	 Catch:{ NullPointerException -> 0x00b7 }
        r5 = 25;
        r4 = r4[r5];	 Catch:{ NullPointerException -> 0x00b7 }
        r3 = r3.append(r4);	 Catch:{ NullPointerException -> 0x00b7 }
        r3 = r3.toString();	 Catch:{ NullPointerException -> 0x00b7 }
        r2.<init>(r3, r0, r11);	 Catch:{ NullPointerException -> 0x00b7 }
        r1.a(r2);	 Catch:{ NullPointerException -> 0x00b7 }
    L_0x00ac:
        return;
    L_0x00ad:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00af }
    L_0x00af:
        r0 = move-exception;
        throw r0;
    L_0x00b1:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00b3 }
    L_0x00b3:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00b5 }
    L_0x00b5:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00b7 }
    L_0x00b7:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.awc.b(android.database.sqlite.SQLiteDatabase, java.lang.String, org.whispersystems.bp):void");
    }

    public int a() {
        return e(this.b.getWritableDatabase());
    }

    private k f(SQLiteDatabase sQLiteDatabase) {
        Cursor query = sQLiteDatabase.query(z[136], new String[]{z[134], z[137]}, z[135], new String[]{String.valueOf(-1)}, null, null, null);
        try {
            if (query.moveToNext()) {
                byte[] blob = query.getBlob(0);
                byte[] blob2 = query.getBlob(1);
                query.close();
                try {
                    bp bpVar = new bp(blob, 0);
                    u a = bx.a(blob2);
                    Log.i(z[133]);
                    return new k(bpVar, a);
                } catch (av e) {
                    throw new SQLiteException(z[138]);
                }
            }
            query.close();
            throw new SQLiteException(z[132]);
        } catch (av e2) {
            throw e2;
        }
    }

    public void a(c3 c3Var, byte[] bArr) {
        a(this.b.getWritableDatabase(), c3Var, bArr);
    }

    public bz[] a(int[] iArr) {
        return a(this.b.getWritableDatabase(), iArr);
    }

    public static j e(String str) {
        if (str == null) {
            try {
                throw new NullPointerException(z[90]);
            } catch (NullPointerException e) {
                throw e;
            }
        }
        try {
            if (str.endsWith(z[89])) {
                return new j(str.substring(0, str.indexOf(z[94])), 0);
            }
            throw new IllegalArgumentException(z[91] + str + z[92] + z[93]);
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    public b0 a(j jVar) {
        try {
            if (jVar.a() == 0) {
                return f(jVar.b());
            }
            throw new IllegalArgumentException(z[140]);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public void a(@NonNull String str, @Nullable bp bpVar) {
        b(this.b.getWritableDatabase(), str, bpVar);
    }

    public void b(@NonNull j jVar) {
        try {
            if (jVar.a() != 0) {
                throw new IllegalArgumentException(z[16]);
            }
            d(jVar.b());
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public axk c(String str) {
        return c(this.b.getWritableDatabase(), str);
    }

    public bz[] g() {
        return d(this.b.getWritableDatabase());
    }

    public void m450a(j jVar) {
        try {
            if (jVar.a() != 0) {
                throw new IllegalArgumentException(z[22]);
            }
            a(jVar.b());
        } catch (NullPointerException e) {
            throw e;
        }
    }

    private bz[] a(SQLiteDatabase sQLiteDatabase, int[] iArr) {
        int i;
        boolean z = g;
        ArrayList arrayList = new ArrayList(iArr.length);
        Map hashMap = new HashMap(iArr.length);
        Cursor query = sQLiteDatabase.query(z[86], new String[]{z[88], z[87]}, null, null, null, null, null);
        while (query.moveToNext()) {
            i = query.getInt(0);
            try {
                Object a = new b5(query.getBlob(1)).c().b().a();
                Object obj = new byte[(a.length - 1)];
                System.arraycopy(a, 1, obj, 0, obj.length);
                hashMap.put(Integer.valueOf(i), new bz(aw.b(i), obj, null));
                continue;
            } catch (Throwable e) {
                Log.b(z[83] + i, e);
                continue;
            }
            if (z) {
                break;
            }
        }
        i = iArr.length;
        int i2 = 0;
        while (i2 < i) {
            Integer valueOf = Integer.valueOf(iArr[i2]);
            try {
                if (hashMap.containsKey(valueOf)) {
                    arrayList.add(hashMap.get(valueOf));
                    i2++;
                    if (z) {
                        break;
                    }
                }
                return null;
            } catch (IOException e2) {
                throw e2;
            }
        }
        query.close();
        Log.i(z[84] + arrayList.size() + z[85]);
        return (bz[]) arrayList.toArray(new bz[arrayList.size()]);
    }

    public art i() {
        return this.c;
    }

    private void a(b0 b0Var) {
        byte[] j = b0Var.a().j();
        if (j != null) {
            try {
                if (j.length != 0) {
                    return;
                }
            } catch (NullPointerException e) {
                throw e;
            }
        }
        throw new IOException(z[97]);
    }

    public boolean a(j jVar, c3 c3Var) {
        try {
            if (jVar.a() == 0) {
                return a(jVar.b(), c3Var);
            }
            throw new IllegalArgumentException(z[98]);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public byte[] f() {
        Object b = b().b().b();
        Object obj = new byte[(b.length - 1)];
        System.arraycopy(b, 1, obj, 0, obj.length);
        Log.i(z[15]);
        return obj;
    }

    private byte[] a(SQLiteDatabase sQLiteDatabase, c3 c3Var) {
        String b = b(c3Var);
        Cursor query = sQLiteDatabase.query(z[96], new String[]{z[95]}, b, new String[]{c3Var.c, c3Var.b}, null, null, null);
        try {
            if (query.moveToNext()) {
                byte[] blob = query.getBlob(0);
                query.close();
                return blob;
            }
            query.close();
            return null;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    @NonNull
    public static awc a(@NonNull Context context) {
        awc com_whatsapp_awc = d;
        if (com_whatsapp_awc == null) {
            synchronized (awc.class) {
                com_whatsapp_awc = d;
                if (com_whatsapp_awc == null) {
                    Context applicationContext = context.getApplicationContext();
                    try {
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        com_whatsapp_awc = new awc(context);
                        d = com_whatsapp_awc;
                    } catch (NullPointerException e) {
                        throw e;
                    }
                }
            }
        }
        return com_whatsapp_awc;
    }

    private b5 b(SQLiteDatabase sQLiteDatabase, int i) {
        Cursor query = sQLiteDatabase.query(z[155], new String[]{z[152]}, z[148], new String[]{String.valueOf(i)}, null, null, null);
        try {
            if (query.moveToNext()) {
                byte[] blob = query.getBlob(0);
                query.close();
                try {
                    Log.i(z[156] + i);
                    return new b5(blob);
                } catch (Throwable e) {
                    Log.b(z[151] + i + z[149], e);
                    sQLiteDatabase.delete(z[150], z[153], new String[]{String.valueOf(i)});
                    throw new y(e);
                }
            }
            query.close();
            throw new y(z[154] + i);
        } catch (IOException e2) {
            throw e2;
        }
    }

    public void a(String str, b0 b0Var) {
        a(this.b.getWritableDatabase(), str, b0Var);
    }

    public byte[] a(c3 c3Var) {
        return a(this.b.getWritableDatabase(), c3Var);
    }

    public void b(String str) {
        a(str);
    }

    private void a(SQLiteDatabase sQLiteDatabase, c3 c3Var, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(z[122], c3Var.c);
        contentValues.put(z[121], Boolean.valueOf(c3Var.a));
        contentValues.put(z[124], c3Var.b);
        contentValues.put(z[123], bArr);
        contentValues.put(z[120], Long.valueOf(System.currentTimeMillis() / 1000));
        Log.i(z[126] + c3Var + z[125] + sQLiteDatabase.replaceOrThrow(z[127], null, contentValues));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.database.sqlite.SQLiteDatabase r10, java.lang.String r11, org.whispersystems.b0 r12) {
        /*
        r9 = this;
        r9.a(r12);	 Catch:{ IOException -> 0x00ed }
        r10.beginTransaction();
        r8 = new android.content.ContentValues;	 Catch:{ all -> 0x00fc }
        r8.<init>();	 Catch:{ all -> 0x00fc }
        r0 = z;	 Catch:{ all -> 0x00fc }
        r1 = 74;
        r0 = r0[r1];	 Catch:{ all -> 0x00fc }
        r8.put(r0, r11);	 Catch:{ all -> 0x00fc }
        r0 = z;	 Catch:{ all -> 0x00fc }
        r1 = 69;
        r0 = r0[r1];	 Catch:{ all -> 0x00fc }
        r1 = r12.d();	 Catch:{ all -> 0x00fc }
        r8.put(r0, r1);	 Catch:{ all -> 0x00fc }
        r0 = z;	 Catch:{ all -> 0x00fc }
        r1 = 80;
        r1 = r0[r1];	 Catch:{ all -> 0x00fc }
        r0 = 1;
        r2 = new java.lang.String[r0];	 Catch:{ all -> 0x00fc }
        r0 = 0;
        r3 = z;	 Catch:{ all -> 0x00fc }
        r4 = 81;
        r3 = r3[r4];	 Catch:{ all -> 0x00fc }
        r2[r0] = r3;	 Catch:{ all -> 0x00fc }
        r0 = z;	 Catch:{ all -> 0x00fc }
        r3 = 72;
        r3 = r0[r3];	 Catch:{ all -> 0x00fc }
        r0 = 1;
        r4 = new java.lang.String[r0];	 Catch:{ all -> 0x00fc }
        r0 = 0;
        r4[r0] = r11;	 Catch:{ all -> 0x00fc }
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r0 = r10;
        r0 = r0.query(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ all -> 0x00fc }
        r1 = r0.moveToNext();	 Catch:{ IOException -> 0x00fa }
        if (r1 == 0) goto L_0x0083;
    L_0x004d:
        r0.close();	 Catch:{ IOException -> 0x00fa }
        r1 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x00fa }
        r1.<init>();	 Catch:{ IOException -> 0x00fa }
        r2 = z;	 Catch:{ IOException -> 0x00fa }
        r3 = 82;
        r2 = r2[r3];	 Catch:{ IOException -> 0x00fa }
        r1 = r1.append(r2);	 Catch:{ IOException -> 0x00fa }
        r1 = r1.append(r11);	 Catch:{ IOException -> 0x00fa }
        r1 = r1.toString();	 Catch:{ IOException -> 0x00fa }
        com.whatsapp.util.Log.i(r1);	 Catch:{ IOException -> 0x00fa }
        r1 = z;	 Catch:{ IOException -> 0x00fa }
        r2 = 78;
        r1 = r1[r2];	 Catch:{ IOException -> 0x00fa }
        r2 = z;	 Catch:{ IOException -> 0x00fa }
        r3 = 70;
        r2 = r2[r3];	 Catch:{ IOException -> 0x00fa }
        r3 = 1;
        r3 = new java.lang.String[r3];	 Catch:{ IOException -> 0x00fa }
        r4 = 0;
        r3[r4] = r11;	 Catch:{ IOException -> 0x00fa }
        r10.update(r1, r8, r2, r3);	 Catch:{ IOException -> 0x00fa }
        r1 = g;	 Catch:{ IOException -> 0x00fa }
        if (r1 == 0) goto L_0x00cc;
    L_0x0083:
        r0.close();	 Catch:{ all -> 0x00fc }
        r0 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x00fc }
        r2 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0 = r0 / r2;
        r2 = z;	 Catch:{ all -> 0x00fc }
        r3 = 73;
        r2 = r2[r3];	 Catch:{ all -> 0x00fc }
        r3 = java.lang.Long.valueOf(r0);	 Catch:{ all -> 0x00fc }
        r8.put(r2, r3);	 Catch:{ all -> 0x00fc }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00fc }
        r2.<init>();	 Catch:{ all -> 0x00fc }
        r3 = z;	 Catch:{ all -> 0x00fc }
        r4 = 75;
        r3 = r3[r4];	 Catch:{ all -> 0x00fc }
        r2 = r2.append(r3);	 Catch:{ all -> 0x00fc }
        r2 = r2.append(r11);	 Catch:{ all -> 0x00fc }
        r3 = z;	 Catch:{ all -> 0x00fc }
        r4 = 71;
        r3 = r3[r4];	 Catch:{ all -> 0x00fc }
        r2 = r2.append(r3);	 Catch:{ all -> 0x00fc }
        r0 = r2.append(r0);	 Catch:{ all -> 0x00fc }
        r0 = r0.toString();	 Catch:{ all -> 0x00fc }
        com.whatsapp.util.Log.i(r0);	 Catch:{ all -> 0x00fc }
        r0 = z;	 Catch:{ all -> 0x00fc }
        r1 = 79;
        r0 = r0[r1];	 Catch:{ all -> 0x00fc }
        r1 = 0;
        r10.insert(r0, r1, r8);	 Catch:{ all -> 0x00fc }
    L_0x00cc:
        r10.setTransactionSuccessful();	 Catch:{ all -> 0x00fc }
        r10.endTransaction();
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 77;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r11);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        return;
    L_0x00ed:
        r0 = move-exception;
        r1 = new java.lang.IllegalArgumentException;
        r2 = z;
        r3 = 76;
        r2 = r2[r3];
        r1.<init>(r2, r0);
        throw r1;
    L_0x00fa:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00fc }
    L_0x00fc:
        r0 = move-exception;
        r10.endTransaction();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.awc.a(android.database.sqlite.SQLiteDatabase, java.lang.String, org.whispersystems.b0):void");
    }

    public boolean b(int i) {
        return c(this.b.getWritableDatabase(), i);
    }

    private void b(SQLiteDatabase sQLiteDatabase, c3 c3Var) {
        int i;
        String b = b(c3Var);
        long delete = (long) sQLiteDatabase.delete(z[19], b, new String[]{c3Var.c, c3Var.b});
        if (delete > 0) {
            i = 3;
        } else {
            i = 4;
        }
        Log.b(i, z[21] + delete + z[20] + c3Var);
    }

    public boolean b(String str, bp bpVar) {
        return a(this.b.getWritableDatabase(), str, bpVar);
    }

    static {
        String[] strArr = new String[157];
        String str = "K\u001a\u0004T-B\u001b";
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
                        i4 = 59;
                        break;
                    case at.g /*1*/:
                        i4 = arj.Theme_editTextStyle;
                        break;
                    case at.i /*2*/:
                        i4 = 97;
                        break;
                    case at.o /*3*/:
                        i4 = 63;
                        break;
                    default:
                        i4 = 72;
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
                    str = "\u001b\u0018\u0013ZhP\r\u0018LhL\u0001\u0015WhR\fA";
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    i2 = 3;
                    str = "Z\u0010\u000eS'O\u0004A[-W\r\u0015Z,\u001b";
                    i = 2;
                    strArr2 = strArr3;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    str = "\u001bUA";
                    i = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "\u001bI\\\u001f";
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "\u000bH q\f\u001b";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "V\u001b\u0006`#^\u0011>M-V\u0007\u0015Z\u0017Q\u0001\u0005\u001fu\u001bWA~\u0006\u007fH\fL/d\u0003\u0004F\u0017]\u001a\u000eR\u0017V\r";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "V\u001b\u0006`#^\u0011>V,";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "\u001bUA\u0000";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "K\u001a\u0004T-B\u001b";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "\u0001H";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "I\r\u0002P:_";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "K\u001a\u0004T-B7\b[h\u0006H^";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "Z\u0010\u000eS'O\u0004AW)HH\u0000\u001f8I\rAT-BH\u0016V<SH\b[h";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "Z\u0010\u000eS'O\u0004AY-O\u000b\tZ,\u001b\u0001\u0005Z&O\u0001\u0015FhP\r\u0018\u001f.T\u001aAL-U\f\bQ/";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "v\u001d\rK!K\u0004\u0004\u001f,^\u001e\b\\-\u001b\u001b\u0014O8T\u001a\u0015\u001f&T\u001cAV%K\u0004\u0004R-U\u001c\u0004[";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "Z\u0010\u000eS'O\u0004AK:N\u001b\u0015V&\\H";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "\u001b\u0003\u0004FhK\t\bM";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "V\r\u0012L)\\\r>])H\r>T-B";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "\u001b\u0005\u0004L;Z\u000f\u0004\u001f*Z\u001b\u0004\u001f#^\u0011AM'L\u001bAY'IH";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = "Z\u0010\u000eS'O\u0004A[-W\r\u0015Z,\u001b";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = "v\u001d\rK!K\u0004\u0004\u001f,^\u001e\b\\-\u001b\u001b\u0014O8T\u001a\u0015\u001f&T\u001cAV%K\u0004\u0004R-U\u001c\u0004[";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "I\r\u0002V8R\r\u000fK\u0017R\f";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = "K\u001d\u0003S!X7\nZ1";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = "{\u001bOH Z\u001c\u0012^8KF\u000fZ<";
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = "O\u0001\fZ;O\t\fO";
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i2] = str;
                    i2 = 27;
                    str = "Z\u0010\u000eS'O\u0004AL)M\r\u0005\u001f!_\r\u000fK!O\u0011AY'IH";
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i2] = str;
                    i2 = 28;
                    str = "R\f\u0004Q<R\u001c\bZ;";
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    str = "\u001b\u001f\bK \u001b\u001a\u0004L=W\u001c\u0000Q<\u001b\u001a\u000eHhR\fA";
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i2] = str;
                    i2 = 30;
                    str = "K\u001d\u0003S!X7\nZ1";
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i2] = str;
                    i2 = 31;
                    str = "Z\u0010\u000eS'O\u0004O[*";
                    i = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i2] = str;
                    i2 = 32;
                    str = "_\r\rZ<^\fA";
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i2] = str;
                    i2 = 33;
                    str = "]\t\bS-_H\u0015Ph_\r\rZ<^H";
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i2] = str;
                    i2 = 34;
                    str = "H\r\u000fK\u0017O\u0007>L-I\u001e\u0004Mh\u001aUA\u000f";
                    i = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i2] = str;
                    i2 = 35;
                    str = "H\r\u000fK\u0017O\u0007>L-I\u001e\u0004M";
                    i = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i2] = str;
                    i2 = 36;
                    str = "Z\u0010\u000eS'O\u0004AM-X\u0007\u0013[-_H\u000fPhK\u001a\u0004T-B\u001bA^;\u001b\u001a\u0004\\-R\u001e\u0004[hY\u0011AL-I\u001e\u0004M";
                    i = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i2] = str;
                    i2 = 37;
                    str = "K\u001a\u0004T-B\u001b";
                    i = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i2] = str;
                    i2 = 38;
                    str = "K\u001a\u0004T-B\u001b";
                    i = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i2] = str;
                    i2 = 39;
                    str = "H\r\u000fK\u0017O\u0007>L-I\u001e\u0004M";
                    i = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i2] = str;
                    i2 = 40;
                    str = "H\r\u000fK\u0017O\u0007>L-I\u001e\u0004Mh\u0006HQ";
                    i = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i2] = str;
                    i2 = 41;
                    str = "Z\u0010\u000eS'O\u0004AM-X\u0007\u0013[-_H\u0000S$\u001b\u0018\u0013Z#^\u0011\u0012\u001f)HH\u0013Z+^\u0001\u0017Z,\u001b\n\u0018\u001f;^\u001a\u0017Z:";
                    i = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i2] = str;
                    i2 = 42;
                    str = "H\r\u0012L!T\u0006\u0012";
                    i = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i2] = str;
                    i2 = 43;
                    str = "I\r\u0002V8R\r\u000fK\u0017R\fA\u0002h\u0004";
                    i = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i2] = str;
                    i2 = 44;
                    str = "Z\u0010\u000eS'O\u0004A[-W\r\u0015Z,\u001b";
                    i = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i2] = str;
                    i2 = 45;
                    str = "\u001b\u001b\u0004L;R\u0007\u000fLhL\u0001\u0015Wh";
                    i = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i2] = str;
                    i2 = 46;
                    str = "I\r\u0006V;O\u001a\u0000K!T\u0006>V,";
                    i = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i2] = str;
                    i2 = 47;
                    str = "I\r\u0002V8R\r\u000fK\u0017R\fA\u0002h\u0004";
                    i = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i2] = str;
                    i2 = 48;
                    str = "v\u0001\u0012L!U\u000fAZ&O\u001a\u0018\u001f.T\u001aAL-W\u000eAV&\u001b\u0001\u0005Z&O\u0001\u0015V-HH\u0015^*W\r";
                    i = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i2] = str;
                    i2 = 49;
                    str = "Z\u0010\u000eS'O\u0004AY-O\u000b\tZ,\u001b\u0004\u000e\\)WH\u0013Z/R\u001b\u0015M)O\u0001\u000eQhR\f[\u001f";
                    i = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i2] = str;
                    i2 = 50;
                    str = "R\f\u0004Q<R\u001c\bZ;";
                    i = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i2] = str;
                    i2 = 51;
                    str = "Z\u0010\u000eS'O\u0004AY'N\u0006\u0005\u001f)UH\b[-U\u001c\bK1\u001b\r\u000fK:BH\u0007P:\u001b";
                    i = 50;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i2] = str;
                    i2 = 52;
                    str = "Z\u0010\u000eS'O\u0004AV,^\u0006\u0015V<BH\nZ1\u001b\u000e\u000eMh";
                    i = 51;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i2] = str;
                    i2 = 53;
                    str = "I\r\u0002V8R\r\u000fK\u0017R\fA\u0002h\u0004";
                    i = 52;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i2] = str;
                    i2 = 54;
                    str = "\u001b\f\u0000K-_H";
                    i = 53;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i2] = str;
                    i2 = 55;
                    str = "R\f\u0004Q<R\u001c\bZ;";
                    i = 54;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i2] = str;
                    i2 = 56;
                    str = "K\u001d\u0003S!X7\nZ1";
                    i = 55;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i2] = str;
                    i2 = 57;
                    str = "R\f\u0004Q<R\u001c\bZ;";
                    i = 56;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i2] = str;
                    i2 = 58;
                    str = "O\u0001\fZ;O\t\fO";
                    i = 57;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i2] = str;
                    str = "I\r\u0002V8R\r\u000fK\u0017R\fA\u0002h\u0004";
                    i = 58;
                    i2 = 59;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i2] = str;
                    i2 = 60;
                    strArr2 = strArr3;
                    str = "\u001b\f\u0004\\'_\r\u0005\u001f)HH\bQ>Z\u0004\b[s\u001b\f\u0004S-O\u0001\u000fX";
                    i = 59;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i2] = str;
                    i2 = 61;
                    str = "Z\u0010\u000eS'O\u0004AY'N\u0006\u0005\u001f&TH\b[-U\u001c\bK1\u001b\r\u000fK:BH\u0007P:\u001b";
                    i = 60;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i2] = str;
                    i2 = 62;
                    str = "I\r\u0002P:_";
                    i = 61;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i2] = str;
                    str = "K\u001a\u0004T-B\u001b";
                    i = 62;
                    i2 = 63;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i2] = str;
                    i2 = 64;
                    strArr2 = strArr3;
                    str = "^\u001a\u0013P:\u001b\u001a\u0004^,R\u0006\u0006\u001f8I\r\nZ1\u001b";
                    i = 63;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i2] = str;
                    i2 = 65;
                    str = "H\r\u000fK\u0017O\u0007>L-I\u001e\u0004Mh\u0006H^";
                    i = 64;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i2] = str;
                    i2 = 66;
                    str = "K\u001a\u0004T-B7\b[";
                    i = 65;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr2[i2] = str;
                    i2 = 67;
                    str = "\u001b\u0018\u0013Z#^\u0011\u0012\u001f.T\u001aAL-U\f\bQ/\u001b\u001c\u000e\u001f<S\rAL-I\u001e\u0004M";
                    i = 66;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    strArr2[i2] = str;
                    i2 = 68;
                    str = "Z\u0010\u000eS'O\u0004AM-K\u0007\u0013K!U\u000fA])X\u0003A";
                    i = 67;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    strArr2[i2] = str;
                    i2 = 69;
                    str = "I\r\u0002P:_";
                    i = 68;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    strArr2[i2] = str;
                    i2 = 70;
                    str = "I\r\u0002V8R\r\u000fK\u0017R\fA\u0002h\u0004";
                    i = 69;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeight /*69*/:
                    strArr2[i2] = str;
                    i2 = 71;
                    str = "\u001b\t\u0015\u001f";
                    i = 70;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightSmall /*70*/:
                    strArr2[i2] = str;
                    str = "I\r\u0002V8R\r\u000fK\u0017R\fA\u0002h\u0004";
                    i = 71;
                    i2 = 72;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightLarge /*71*/:
                    strArr2[i2] = str;
                    i2 = 73;
                    strArr2 = strArr3;
                    str = "O\u0001\fZ;O\t\fO";
                    i = 72;
                    break;
                case arj.Theme_listPreferredItemPaddingLeft /*72*/:
                    strArr2[i2] = str;
                    i2 = 74;
                    str = "I\r\u0002V8R\r\u000fK\u0017R\f";
                    i = 73;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingRight /*73*/:
                    strArr2[i2] = str;
                    i2 = 75;
                    str = "Z\u0010\u000eS'W\u001cAV&H\r\u0013K!U\u000fAQ-LH\u0012Z;H\u0001\u000eQh]\u0007\u0013\u001f";
                    i = 74;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropDownListViewStyle /*74*/:
                    strArr2[i2] = str;
                    i2 = 76;
                    str = "x\t\u000fQ'OH\u0012K'I\rAV&M\t\rV,\u001b\u001b\u0004L;R\u0007\u000f";
                    i = 75;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPopupWindowStyle /*75*/:
                    strArr2[i2] = str;
                    i2 = 77;
                    str = "Z\u0010\u000eS'O\u0004AL<T\u001a\u0004[hH\r\u0012L!T\u0006AY'IH";
                    i = 76;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItem /*76*/:
                    strArr2[i2] = str;
                    i2 = 78;
                    str = "H\r\u0012L!T\u0006\u0012";
                    i = 77;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItemSmall /*77*/:
                    strArr2[i2] = str;
                    i2 = 79;
                    str = "H\r\u0012L!T\u0006\u0012";
                    i = 78;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelBackground /*78*/:
                    strArr2[i2] = str;
                    i2 = 80;
                    str = "H\r\u0012L!T\u0006\u0012";
                    i = 79;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListWidth /*79*/:
                    strArr2[i2] = str;
                    i2 = 81;
                    str = "d\u0001\u0005";
                    i = 80;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListTheme /*80*/:
                    strArr2[i2] = str;
                    i2 = 82;
                    str = "Z\u0010\u000eS'W\u001cAJ8_\t\u0015V&\\H\u0012Z;H\u0001\u000eQh]\u0007\u0013\u001f";
                    i = 81;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listChoiceBackgroundIndicator /*81*/:
                    strArr2[i2] = str;
                    i2 = 83;
                    str = "^\u001a\u0013P:\u001b\u001a\u0004^,R\u0006\u0006\u001f8I\r\nZ1\u001b";
                    i = 82;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimary /*82*/:
                    strArr2[i2] = str;
                    i2 = 84;
                    str = "Z\u0010\u000eS'O\u0004AM-K\u0007\u0013K!U\u000fA])X\u0003A";
                    i = 83;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimaryDark /*83*/:
                    strArr2[i2] = str;
                    i2 = 85;
                    str = "\u001b\u001b\u0004N=^\u0006\u0002Z,\u001b\u0018\u0013Z#^\u0011\u0012";
                    i = 84;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorAccent /*84*/:
                    strArr2[i2] = str;
                    i2 = 86;
                    str = "K\u001a\u0004T-B\u001b";
                    i = 85;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlNormal /*85*/:
                    strArr2[i2] = str;
                    i2 = 87;
                    str = "I\r\u0002P:_";
                    i = 86;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlActivated /*86*/:
                    strArr2[i2] = str;
                    i2 = 88;
                    str = "K\u001a\u0004T-B7\b[";
                    i = 87;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlHighlight /*87*/:
                    strArr2[i2] = str;
                    i2 = 89;
                    str = "{\u001bOH Z\u001c\u0012^8KF\u000fZ<";
                    i = 88;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorButtonNormal /*88*/:
                    strArr2[i2] = str;
                    i2 = 90;
                    str = "k\u001a\u000eI!_\r\u0005\u001f\"R\fAR=H\u001cAQ'OH\u0003ZhU\u001d\rS";
                    i = 89;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorSwitchThumbNormal /*89*/:
                    strArr2[i2] = str;
                    i2 = 91;
                    str = "q\u0001\u0005\u001f";
                    i = 90;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_controlBackground /*90*/:
                    strArr2[i2] = str;
                    i2 = 92;
                    str = "\u001b\u0001\u0012\u001f&T\u001cAY=W\u0004\u0018\u001f9N\t\rV.R\r\u0005\u0004hH\u0000\u000eJ$_H\u0004Q,\u001b\u001f\bK \u001b";
                    i = 91;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogStyle /*91*/:
                    strArr2[i2] = str;
                    i2 = 93;
                    str = "{\u001bOH Z\u001c\u0012^8KF\u000fZ<";
                    i = 92;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogButtonGroupStyle /*92*/:
                    strArr2[i2] = str;
                    i2 = 94;
                    str = "{\u001bOH Z\u001c\u0012^8KF\u000fZ<";
                    i = 93;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogCenterButtons /*93*/:
                    strArr2[i2] = str;
                    i2 = 95;
                    str = "W\t\u0012K\u0017Z\u0004\b\\-d\n\u0000L-d\u0003\u0004F";
                    i = 94;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogTheme /*94*/:
                    strArr2[i2] = str;
                    i2 = 96;
                    str = "V\r\u0012L)\\\r>])H\r>T-B";
                    i = 95;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorAlertDialogListItem /*95*/:
                    strArr2[i2] = str;
                    i2 = 97;
                    str = "z\u0004\b\\-\u001b\n\u0000L-\u001b\u0003\u0004FhV\u0001\u0012L!U\u000fAY:T\u0005AL-H\u001b\bP&";
                    i = 96;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarPositiveButtonStyle /*96*/:
                    strArr2[i2] = str;
                    i2 = 98;
                    str = "v\u001d\rK!K\u0004\u0004\u001f,^\u001e\b\\-\u001b\u001b\u0014O8T\u001a\u0015\u001f&T\u001cAV%K\u0004\u0004R-U\u001c\u0004[";
                    i = 97;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNegativeButtonStyle /*97*/:
                    strArr2[i2] = str;
                    i2 = 99;
                    str = "I\r\u0002V8R\r\u000fK\u0017R\fA\u0002h\u0004";
                    i = 98;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNeutralButtonStyle /*98*/:
                    strArr2[i2] = str;
                    i2 = 100;
                    str = "Z\u0010\u000eS'O\u0004A[-W\r\u0015Z,\u001b";
                    i = 99;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_autoCompleteTextViewStyle /*99*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_buttonStyleSmall;
                    str = "\u001b\u0001\u0005Z&R\u001c\bZ;\u001b\u000e\u000eMh";
                    i = 100;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyle /*100*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_checkboxStyle;
                    str = "R\f\u0004Q<R\u001c\bZ;";
                    i = arj.Theme_buttonStyleSmall;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyleSmall /*101*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_checkedTextViewStyle;
                    str = "{\u001bOH Z\u001c\u0012^8KF\u000fZ<";
                    i = arj.Theme_checkboxStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_checkboxStyle /*102*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_editTextStyle;
                    str = "H\r\u0012L!T\u0006\u0012";
                    i = arj.Theme_checkedTextViewStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_checkedTextViewStyle /*103*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_radioButtonStyle;
                    str = "I\r\u0002P:_";
                    i = arj.Theme_editTextStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextStyle /*104*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_ratingBarStyle;
                    str = "H\r\u0012L!T\u0006\u0012";
                    i = arj.Theme_radioButtonStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_radioButtonStyle /*105*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_seekBarStyle;
                    str = "Z\u0010\u000eS'O\u0004AW)HH\u000fPhH\r\u0012L!T\u0006AM-X\u0007\u0013[h]\u0007\u0013\u001f";
                    i = arj.Theme_ratingBarStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_ratingBarStyle /*106*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_spinnerStyle;
                    str = "I\r\u0002V8R\r\u000fK\u0017R\fA\u0002h\u0004";
                    i = arj.Theme_seekBarStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_seekBarStyle /*107*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_switchStyle;
                    str = "I\r\u0002V8R\r\u000fK\u0017R\fA\u0002h\u0004";
                    i = arj.Theme_spinnerStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerStyle /*108*/:
                    strArr2[i2] = str;
                    i2 = 110;
                    str = "\u0000H\u0005Z$^\u001c\bQ/";
                    i = arj.Theme_switchStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_switchStyle /*109*/:
                    strArr2[i2] = str;
                    i2 = 111;
                    str = "^\u001a\u0013P:\u001b\u001a\u0004^,R\u0006\u0006\u001f;^\u001b\u0012V'UH\u0013Z+T\u001a\u0005\u001f";
                    i = 110;
                    strArr2 = strArr3;
                    break;
                case 110:
                    strArr2[i2] = str;
                    i2 = 112;
                    str = "\u0000H\u0005Z$^\u001c\bQ/";
                    i = 111;
                    strArr2 = strArr3;
                    break;
                case 111:
                    strArr2[i2] = str;
                    i2 = 113;
                    str = "H\r\u0012L!T\u0006\u0012";
                    i = 112;
                    strArr2 = strArr3;
                    break;
                case 112:
                    strArr2[i2] = str;
                    i2 = 114;
                    str = "I\r\u0002P:_";
                    i = 113;
                    strArr2 = strArr3;
                    break;
                case 113:
                    strArr2[i2] = str;
                    i2 = 115;
                    str = "H\r\u0012L!T\u0006\u0012";
                    i = 114;
                    strArr2 = strArr3;
                    break;
                case 114:
                    strArr2[i2] = str;
                    i2 = 116;
                    str = "I\r\u0002V8R\r\u000fK\u0017R\fA\u0002h\u0004";
                    i = 115;
                    strArr2 = strArr3;
                    break;
                case 115:
                    strArr2[i2] = str;
                    i2 = 117;
                    str = "I\r\u0002V8R\r\u000fK\u0017R\fA\u0002h\u0004";
                    i = 116;
                    strArr2 = strArr3;
                    break;
                case 116:
                    strArr2[i2] = str;
                    i2 = 118;
                    str = "Z\u0010\u000eS'O\u0004AW)HH\u000fPhH\r\u0012L!T\u0006AM-X\u0007\u0013[h]\u0007\u0013\u001f";
                    i = 117;
                    strArr2 = strArr3;
                    break;
                case 117:
                    strArr2[i2] = str;
                    i2 = 119;
                    str = "^\u001a\u0013P:\u001b\u001a\u0004^,R\u0006\u0006\u001f;^\u001b\u0012V'UH\u0013Z+T\u001a\u0005\u001f";
                    i = 118;
                    strArr2 = strArr3;
                    break;
                case 118:
                    strArr2[i2] = str;
                    i2 = 120;
                    str = "O\u0001\fZ;O\t\fO";
                    i = 119;
                    strArr2 = strArr3;
                    break;
                case 119:
                    strArr2[i2] = str;
                    i2 = 121;
                    str = "V\u001b\u0006`#^\u0011>Y:T\u0005>R-";
                    i = 120;
                    strArr2 = strArr3;
                    break;
                case 120:
                    strArr2[i2] = str;
                    i2 = 122;
                    str = "V\u001b\u0006`#^\u0011>M-V\u0007\u0015Z\u0017Q\u0001\u0005";
                    i = 121;
                    strArr2 = strArr3;
                    break;
                case 121:
                    strArr2[i2] = str;
                    i2 = 123;
                    str = "W\t\u0012K\u0017Z\u0004\b\\-d\n\u0000L-d\u0003\u0004F";
                    i = 122;
                    strArr2 = strArr3;
                    break;
                case 122:
                    strArr2[i2] = str;
                    i2 = 124;
                    str = "V\u001b\u0006`#^\u0011>V,";
                    i = 123;
                    strArr2 = strArr3;
                    break;
                case 123:
                    strArr2[i2] = str;
                    i2 = 125;
                    str = "\u001b\u001f\bK \u001b\u001a\u000eHhR\fA";
                    i = 124;
                    strArr2 = strArr3;
                    break;
                case 124:
                    strArr2[i2] = str;
                    i2 = 126;
                    str = "Z\u0010\u000eS'O\u0004AL)M\r\u0005\u001f)\u001b\u0005\u0004L;Z\u000f\u0004\u001f*Z\u001b\u0004\u001f#^\u0011AY'IH";
                    i = 125;
                    strArr2 = strArr3;
                    break;
                case 125:
                    strArr2[i2] = str;
                    i2 = 127;
                    str = "V\r\u0012L)\\\r>])H\r>T-B";
                    i = 126;
                    strArr2 = strArr3;
                    break;
                case 126:
                    strArr2[i2] = str;
                    i2 = 128;
                    str = "v\u001d\rK!K\u0004\u0004\u001f,^\u001e\b\\-\u001b\u001b\u0014O8T\u001a\u0015\u001f&T\u001cAV%K\u0004\u0004R-U\u001c\u0004[";
                    i = 127;
                    strArr2 = strArr3;
                    break;
                case 127:
                    strArr2[i2] = str;
                    i2 = 129;
                    str = "n\u0006\u0000]$^H\u0015PhX\u0007\u0014Q<\u001b\u001d\u000fL-U\u001cAZ&O\u001a\bZ;\u001b\u0001\u000f\u001f8I\r\nZ1HH\u0015^*W\r";
                    i = 128;
                    strArr2 = strArr3;
                    break;
                case 128:
                    strArr2[i2] = str;
                    i2 = 130;
                    str = "h--z\u000boH\"p\u001du<I\u0015a\u001b.3p\u0005\u001b\u0018\u0013Z#^\u0011\u0012\u001f\u001fs-3zhH\r\u000fK\u0017O\u0007>L-I\u001e\u0004Mh\u0006HQ";
                    i = 129;
                    strArr2 = strArr3;
                    break;
                case 129:
                    strArr2[i2] = str;
                    i2 = 131;
                    str = "Z\u0010\u000eS'O\u0004AW)HH\u0014Q;^\u0006\u0015\u001f8I\r\nZ1HRA";
                    i = 130;
                    strArr2 = strArr3;
                    break;
                case 130:
                    strArr2[i2] = str;
                    i2 = 132;
                    str = "v\u0001\u0012L!U\u000fAZ&O\u001a\u0018\u001f.T\u001aAL-W\u000eAV&\u001b\u0001\u0005Z&O\u0001\u0015V-HH\u0015^*W\r";
                    i = 131;
                    strArr2 = strArr3;
                    break;
                case 131:
                    strArr2[i2] = str;
                    i2 = 133;
                    str = "Z\u0010\u000eS'O\u0004AS'Z\f\bQ/\u001b\u0001\u0005Z&O\u0001\u0015FhP\r\u0018\u001f8Z\u0001\u0013";
                    i = 132;
                    strArr2 = strArr3;
                    break;
                case 132:
                    strArr2[i2] = str;
                    i2 = 134;
                    str = "K\u001d\u0003S!X7\nZ1";
                    i = 133;
                    strArr2 = strArr3;
                    break;
                case 133:
                    strArr2[i2] = str;
                    i2 = 135;
                    str = "I\r\u0002V8R\r\u000fK\u0017R\fA\u0002h\u0004";
                    i = 134;
                    strArr2 = strArr3;
                    break;
                case 134:
                    strArr2[i2] = str;
                    i2 = 136;
                    str = "R\f\u0004Q<R\u001c\bZ;";
                    i = 135;
                    strArr2 = strArr3;
                    break;
                case 135:
                    strArr2[i2] = str;
                    i2 = 137;
                    str = "K\u001a\bI)O\r>T-B";
                    i = 136;
                    strArr2 = strArr3;
                    break;
                case 136:
                    strArr2[i2] = str;
                    i2 = 138;
                    str = "r\u0006\u0017^$R\fAO=Y\u0004\b\\hP\r\u0018\u001f;O\u0007\u0013Z,\u001b\u0001\u000f\u001f!_\r\u000fK!O\u0001\u0004LhO\t\u0003S-";
                    i = 137;
                    strArr2 = strArr3;
                    break;
                case 137:
                    strArr2[i2] = str;
                    i2 = 139;
                    str = "v\u001d\rK!K\u0004\u0004\u001f,^\u001e\b\\-\u001b\u001b\u0014O8T\u001a\u0015\u001f&T\u001cAV%K\u0004\u0004R-U\u001c\u0004[";
                    i = 138;
                    strArr2 = strArr3;
                    break;
                case 138:
                    strArr2[i2] = str;
                    i2 = 140;
                    str = "v\u001d\rK!K\u0004\u0004\u001f,^\u001e\b\\-\u001b\u001b\u0014O8T\u001a\u0015\u001f&T\u001cAV%K\u0004\u0004R-U\u001c\u0004[";
                    i = 139;
                    strArr2 = strArr3;
                    break;
                case 139:
                    strArr2[i2] = str;
                    i2 = 141;
                    str = "_\u0001\u0007Y-I\r\u000fK";
                    i = 140;
                    strArr2 = strArr3;
                    break;
                case 140:
                    strArr2[i2] = str;
                    i2 = 142;
                    str = "Z\u0010\u000eS'O\u0004AW)HH";
                    i = 141;
                    strArr2 = strArr3;
                    break;
                case 141:
                    strArr2[i2] = str;
                    i2 = 143;
                    str = "\u001b\u001b\u0000I-_H\u0003^;^H\nZ1\u001b\t\u000f[hH\r\u0012L!T\u0006AY'IH";
                    i = 142;
                    strArr2 = strArr3;
                    break;
                case 142:
                    strArr2[i2] = str;
                    i2 = 144;
                    str = "Z\u0010\u000eS'O\u0004AW)HH\u000fPhH\t\u0017Z,\u001b\n\u0000L-\u001b\u0003\u0004Fh]\u0007\u0013\u001f";
                    i = 143;
                    strArr2 = strArr3;
                    break;
                case 143:
                    strArr2[i2] = str;
                    i2 = 145;
                    str = "V\t\u0015\\ R\u0006\u0006";
                    i = 144;
                    strArr2 = strArr3;
                    break;
                case 144:
                    strArr2[i2] = str;
                    i2 = 146;
                    str = "\u001b\t\u000f[h";
                    i = 145;
                    strArr2 = strArr3;
                    break;
                case 145:
                    strArr2[i2] = str;
                    i2 = 147;
                    str = "Z\u0010\u000eS'O\u0004AW)HH\u000fPhH\r\u0012L!T\u0006AY'IH";
                    i = 146;
                    strArr2 = strArr3;
                    break;
                case 146:
                    strArr2[i2] = str;
                    i2 = 148;
                    str = "K\u001a\u0004T-B7\b[h\u0006H^";
                    i = 147;
                    strArr2 = strArr3;
                    break;
                case 147:
                    strArr2[i2] = str;
                    i2 = 149;
                    str = "\u0000H\u0005Z$^\u001c\bQ/";
                    i = 148;
                    strArr2 = strArr3;
                    break;
                case 148:
                    strArr2[i2] = str;
                    i2 = 150;
                    str = "K\u001a\u0004T-B\u001b";
                    i = 149;
                    strArr2 = strArr3;
                    break;
                case 149:
                    strArr2[i2] = str;
                    i2 = 151;
                    str = "^\u001a\u0013P:\u001b\u001a\u0004^,R\u0006\u0006\u001f8I\r\nZ1\u001b";
                    i = 150;
                    strArr2 = strArr3;
                    break;
                case 150:
                    strArr2[i2] = str;
                    i2 = 152;
                    str = "I\r\u0002P:_";
                    i = 151;
                    strArr2 = strArr3;
                    break;
                case 151:
                    strArr2[i2] = str;
                    i2 = 153;
                    str = "K\u001a\u0004T-B7\b[h\u0006H^";
                    i = 152;
                    strArr2 = strArr3;
                    break;
                case 152:
                    strArr2[i2] = str;
                    i2 = 154;
                    str = "u\u0007AO:^\u0003\u0004Fh]\u0007\u0014Q,\u001b\u001f\bK \u001b\u0001\u0005\u001f";
                    i = 153;
                    strArr2 = strArr3;
                    break;
                case 153:
                    strArr2[i2] = str;
                    i2 = 155;
                    str = "K\u001a\u0004T-B\u001b";
                    i = 154;
                    strArr2 = strArr3;
                    break;
                case 154:
                    strArr2[i2] = str;
                    i2 = 156;
                    str = "Z\u0010\u000eS'O\u0004AY'N\u0006\u0005\u001f)\u001b\u0018\u0013ZhP\r\u0018\u001f?R\u001c\t\u001f!_H";
                    i = 155;
                    strArr2 = strArr3;
                    break;
                case 155:
                    strArr2[i2] = str;
                    z = strArr3;
                    e = new ThreadPoolExecutor(0, 1, 300, TimeUnit.SECONDS, new LinkedBlockingQueue(), new anz());
                    return;
                default:
                    strArr2[i2] = str;
                    str = "K\u001a\u0004T-B7\b[h\u0006H^";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private boolean c(SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(z[35], Boolean.valueOf(false));
        int update = sQLiteDatabase.update(z[37], contentValues, z[34], null);
        try {
            Log.i(z[36]);
            if (update > 0) {
                return true;
            }
            return false;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    private b0 f(String str) {
        return d(this.b.getWritableDatabase(), str);
    }

    private boolean e(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor query = sQLiteDatabase.query(z[arj.Theme_editTextStyle], new String[]{z[arj.Theme_radioButtonStyle]}, z[arj.Theme_spinnerStyle], new String[]{str}, null, null, null);
        try {
            if (query.moveToNext()) {
                byte[] blob = query.getBlob(0);
                query.close();
                try {
                    a(new b0(blob));
                    return true;
                } catch (Throwable e) {
                    Log.b(z[111] + str + z[110], e);
                    sQLiteDatabase.delete(z[arj.Theme_ratingBarStyle], z[arj.Theme_switchStyle], new String[]{str});
                    return false;
                }
            }
            query.close();
            Log.i(z[arj.Theme_seekBarStyle] + str);
            return false;
        } catch (IOException e2) {
            throw e2;
        }
    }

    private boolean a(String str, c3 c3Var) {
        byte[] a = a(c3Var);
        if (a == null) {
            try {
                Log.i(z[144] + c3Var);
                return false;
            } catch (NullPointerException e) {
                throw e;
            }
        }
        b0 f = f(str);
        if (f == null) {
            try {
                Log.i(z[147] + str);
                return false;
            } catch (NullPointerException e2) {
                throw e2;
            }
        }
        boolean equals = Arrays.equals(a, f.a().j());
        try {
            String str2;
            StringBuilder append = new StringBuilder().append(z[142]);
            if (equals) {
                str2 = z[145];
            } else {
                str2 = z[141];
            }
            Log.i(append.append(str2).append(z[143]).append(c3Var).append(z[146]).append(str).toString());
            return equals;
        } catch (NullPointerException e22) {
            throw e22;
        }
    }

    private bz[] d(SQLiteDatabase sQLiteDatabase) {
        boolean z = g;
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        Cursor query = sQLiteDatabase2.query(z[63], new String[]{z[66], z[62]}, z[65], new String[]{String.valueOf(0)}, null, null, null, String.valueOf(1000));
        while (query.moveToNext()) {
            int i = query.getInt(0);
            try {
                Object a = new b5(query.getBlob(1)).c().b().a();
                Object obj = new byte[(a.length - 1)];
                System.arraycopy(a, 1, obj, 0, obj.length);
                arrayList.add(new bz(aw.b(i), obj, null));
                continue;
            } catch (Throwable e) {
                Log.b(z[64] + i, e);
                continue;
            }
            if (z) {
                break;
            }
        }
        query.close();
        Log.i(z[68] + arrayList.size() + z[67]);
        return (bz[]) arrayList.toArray(new bz[arrayList.size()]);
    }

    private boolean b(SQLiteDatabase sQLiteDatabase) {
        boolean z = false;
        Cursor rawQuery = sQLiteDatabase.rawQuery(z[130], null);
        try {
            if (rawQuery.moveToNext()) {
                try {
                    if (rawQuery.getInt(0) != 0) {
                        z = true;
                    }
                    rawQuery.close();
                    Log.i(z[131] + z);
                    return z;
                } catch (NullPointerException e) {
                    throw e;
                }
            }
            rawQuery.close();
            throw new SQLiteException(z[129]);
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    public boolean h() {
        return b(this.b.getWritableDatabase());
    }

    public b5 a(int i) {
        return b(this.b.getWritableDatabase(), i);
    }

    private boolean c(SQLiteDatabase sQLiteDatabase, int i) {
        Cursor query = sQLiteDatabase.query(z[10], new String[]{z[12]}, z[13], new String[]{String.valueOf(i)}, null, null, null);
        boolean moveToNext = query.moveToNext();
        query.close();
        Log.i(z[14] + i + z[11] + moveToNext);
        return moveToNext;
    }

    private void b(@NonNull SQLiteDatabase sQLiteDatabase, @NonNull String str) {
        bp b = c(sQLiteDatabase, str).b();
        try {
            Log.i(z[100] + ((long) sQLiteDatabase.delete(z[arj.Theme_checkboxStyle], z[99], new String[]{str})) + z[arj.Theme_buttonStyleSmall] + str);
            if (b != null) {
                h.b().a(new b_(str + z[arj.Theme_checkedTextViewStyle], b, null));
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    public void a(j jVar, b0 b0Var) {
        try {
            if (jVar.a() != 0) {
                throw new IllegalArgumentException(z[128]);
            }
            a(jVar.b(), b0Var);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    private void a(SQLiteDatabase sQLiteDatabase, int i) {
        Log.i(z[3] + ((long) sQLiteDatabase.delete(z[0], z[1], new String[]{String.valueOf(i)})) + z[2] + i);
    }

    private boolean a(SQLiteDatabase sQLiteDatabase, String str, bp bpVar) {
        Log.i(z[17] + str + z[18]);
        return true;
    }

    public void d(@NonNull String str) {
        b(this.b.getWritableDatabase(), str);
    }

    private boolean a(SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(z[39], Boolean.valueOf(true));
        int update = sQLiteDatabase.update(z[38], contentValues, z[40], null);
        try {
            Log.i(z[41]);
            if (update > 0) {
                return true;
            }
            return false;
        } catch (NullPointerException e) {
            throw e;
        }
    }

    private String b(c3 c3Var) {
        try {
            return z[7] + (c3Var.a ? z[5] : z[4]) + z[6] + z[8] + z[9];
        } catch (NullPointerException e) {
            throw e;
        }
    }

    private boolean g(String str) {
        return e(this.b.getWritableDatabase(), str);
    }

    private void a(SQLiteDatabase sQLiteDatabase, String str) {
        Log.i(z[44] + ((long) sQLiteDatabase.delete(z[42], z[43], new String[]{str})) + z[45] + str);
    }

    public void m452b() {
        this.b.c(this.b.getWritableDatabase());
    }

    public boolean m453b(j jVar) {
        try {
            if (jVar.a() == 0) {
                return g(jVar.b());
            }
            throw new IllegalArgumentException(z[139]);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    private awc(@NonNull Context context) {
        this.a = (Context) auv.a((Object) context);
        this.b = new a2r(context);
        this.f = new a5q(this.b);
        this.c = new art(this.b);
    }

    public boolean m451a() {
        return c(this.b.getWritableDatabase());
    }

    public boolean d() {
        return a(this.b.getWritableDatabase());
    }
}
