package com.whatsapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.provider.Settings.System;
import android.text.TextUtils;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import com.whatsapp.util.bq;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class a3b {
    private static a3b a;
    private static final Object e;
    private static final String[] z;
    private final Map b;
    private Context c;
    private nr d;

    public void f() {
        ContentValues contentValues = new ContentValues(8);
        contentValues.put(z[98], Boolean.valueOf(false));
        contentValues.put(z[arj.Theme_radioButtonStyle], null);
        contentValues.put(z[arj.Theme_checkedTextViewStyle], null);
        contentValues.put(z[arj.Theme_ratingBarStyle], null);
        contentValues.put(z[arj.Theme_checkboxStyle], null);
        contentValues.put(z[100], null);
        contentValues.put(z[arj.Theme_editTextStyle], null);
        SQLiteDatabase writableDatabase = this.d.getWritableDatabase();
        writableDatabase.beginTransaction();
        writableDatabase.update(z[97], contentValues, null, null);
        writableDatabase.delete(z[arj.Theme_buttonStyleSmall], z[99], new String[]{Long.toString(System.currentTimeMillis())});
        writableDatabase.setTransactionSuccessful();
        writableDatabase.endTransaction();
        this.b.clear();
    }

    public void d(String str) {
        Throwable e;
        boolean z = DialogToastActivity.f;
        Cursor query;
        try {
            query = this.d.getWritableDatabase().query(z[16], new String[]{z[7], z[18], z[23], z[14], z[8], z[4], z[20], z[25], z[6], z[21]}, null, null, null, null, null);
            while (query != null) {
                try {
                    if (!query.moveToNext()) {
                        break;
                    }
                    Log.i(str + z[12] + query.getString(0) + z[19] + query.getLong(1) + z[24] + query.getInt(2) + z[9] + query.getInt(3) + z[10] + query.getString(4) + z[15] + query.getString(5) + z[17] + query.getString(6) + z[5] + query.getString(7) + z[13] + query.getString(8) + z[22] + query.getString(9));
                    if (z) {
                        break;
                    }
                } catch (Exception e2) {
                    throw e2;
                } catch (Exception e3) {
                    e = e3;
                }
            }
            if (query != null) {
                try {
                    query.close();
                } catch (Exception e22) {
                    throw e22;
                }
            }
        } catch (Exception e4) {
            e = e4;
            query = null;
            try {
                Log.b(str + z[11], e);
                if (query != null) {
                    query.close();
                }
            } catch (Throwable th) {
                e = th;
                if (query != null) {
                    try {
                        query.close();
                    } catch (Exception e222) {
                        throw e222;
                    }
                }
                throw e;
            }
        } catch (Throwable th2) {
            e = th2;
            query = null;
            if (query != null) {
                query.close();
            }
            throw e;
        }
    }

    public void a(String str, String str2) {
        a9q b = b(str);
        try {
            if (!TextUtils.equals(str2, a9q.g(b))) {
                a9q.c(b, str2);
                a(b);
            }
        } catch (SQLiteDatabaseCorruptException e) {
            throw e;
        }
    }

    public void b(String str, boolean z) {
        a(str, 0, a9q.n(b(str)), z);
    }

    public void b(String str, String str2) {
        a9q b = b(str);
        try {
            if (!TextUtils.equals(str2, a9q.k(b))) {
                a9q.d(b, str2);
                a(b);
            }
        } catch (SQLiteDatabaseCorruptException e) {
            throw e;
        }
    }

    public void e(String str, String str2) {
        a9q b = b(str);
        try {
            if (!TextUtils.equals(str2, a9q.c(b))) {
                a9q.g(b, str2);
                a(b);
            }
        } catch (SQLiteDatabaseCorruptException e) {
            throw e;
        }
    }

    public void d(String str, String str2) {
        a9q b = b(str);
        try {
            if (!TextUtils.equals(str2, a9q.d(b))) {
                a9q.f(b, str2);
                a(b);
            }
        } catch (SQLiteDatabaseCorruptException e) {
            throw e;
        }
    }

    public void a(String str, boolean z) {
        a9q b = b(str);
        try {
            if (z != a9q.i(b)) {
                a9q.c(b, z);
                a(b);
            }
        } catch (SQLiteDatabaseCorruptException e) {
            throw e;
        }
    }

    public Map e() {
        return Collections.unmodifiableMap(this.b);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r7, long r8, boolean r10, boolean r11) {
        /*
        r6 = this;
        r0 = r6.b(r7);
        r2 = com.whatsapp.a9q.e(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00af }
        r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1));
        if (r1 != 0) goto L_0x0012;
    L_0x000c:
        r1 = com.whatsapp.a9q.n(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00af }
        if (r10 == r1) goto L_0x00ae;
    L_0x0012:
        com.whatsapp.a9q.a(r0, r8);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00b1 }
        r2 = 0;
        r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1));
        if (r1 != 0) goto L_0x0046;
    L_0x001b:
        r1 = r0.k();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00b1 }
        if (r1 != 0) goto L_0x0046;
    L_0x0021:
        r1 = com.whatsapp.a9q.m(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00b3 }
        if (r1 == 0) goto L_0x0046;
    L_0x0027:
        r1 = r6.d;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00b5 }
        r1 = r1.getWritableDatabase();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00b5 }
        r2 = z;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00b5 }
        r3 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        r2 = r2[r3];	 Catch:{ SQLiteDatabaseCorruptException -> 0x00b5 }
        r3 = z;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00b5 }
        r4 = 112; // 0x70 float:1.57E-43 double:5.53E-322;
        r3 = r3[r4];	 Catch:{ SQLiteDatabaseCorruptException -> 0x00b5 }
        r4 = 1;
        r4 = new java.lang.String[r4];	 Catch:{ SQLiteDatabaseCorruptException -> 0x00b5 }
        r5 = 0;
        r4[r5] = r7;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00b5 }
        r1.delete(r2, r3, r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00b5 }
        r1 = com.whatsapp.DialogToastActivity.f;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00b5 }
        if (r1 == 0) goto L_0x00a4;
    L_0x0046:
        com.whatsapp.a9q.b(r0, r10);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00b7 }
        r1 = 1;
        com.whatsapp.a9q.a(r0, r1);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00b7 }
        r0 = new android.content.ContentValues;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00b7 }
        r1 = 2;
        r0.<init>(r1);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00b7 }
        r1 = z;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c5 }
        r2 = 110; // 0x6e float:1.54E-43 double:5.43E-322;
        r1 = r1[r2];	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c5 }
        r2 = java.lang.Long.valueOf(r8);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c5 }
        r0.put(r1, r2);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c5 }
        r1 = z;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c5 }
        r2 = 107; // 0x6b float:1.5E-43 double:5.3E-322;
        r1 = r1[r2];	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c5 }
        r2 = java.lang.Boolean.valueOf(r10);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c5 }
        r0.put(r1, r2);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c5 }
        r1 = r6.d;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c5 }
        r1 = r1.getWritableDatabase();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c5 }
        r2 = z;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c5 }
        r3 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        r2 = r2[r3];	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c5 }
        r3 = z;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c5 }
        r4 = 114; // 0x72 float:1.6E-43 double:5.63E-322;
        r3 = r3[r4];	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c5 }
        r4 = 1;
        r4 = new java.lang.String[r4];	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c5 }
        r5 = 0;
        r4[r5] = r7;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c5 }
        r1 = r1.update(r2, r0, r3, r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c5 }
        if (r1 != 0) goto L_0x00a4;
    L_0x008b:
        r1 = z;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c5 }
        r2 = 111; // 0x6f float:1.56E-43 double:5.5E-322;
        r1 = r1[r2];	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c5 }
        r0.put(r1, r7);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c5 }
        r1 = r6.d;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c5 }
        r1 = r1.getWritableDatabase();	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c5 }
        r2 = z;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c5 }
        r3 = 113; // 0x71 float:1.58E-43 double:5.6E-322;
        r2 = r2[r3];	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c5 }
        r3 = 0;
        r1.insert(r2, r3, r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c5 }
    L_0x00a4:
        com.whatsapp.App.l(r7);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c7 }
        if (r11 == 0) goto L_0x00ae;
    L_0x00a9:
        r0 = 5;
        r1 = 0;
        com.whatsapp.App.a(r0, r7, r8, r1);	 Catch:{ SQLiteDatabaseCorruptException -> 0x00c7 }
    L_0x00ae:
        return;
    L_0x00af:
        r0 = move-exception;
        throw r0;
    L_0x00b1:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00b3 }
    L_0x00b3:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00b5 }
    L_0x00b5:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00b7 }
    L_0x00b7:
        r0 = move-exception;
        r1 = z;
        r2 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        r1 = r1[r2];
        com.whatsapp.util.Log.a(r1, r0);
        r6.b();
        throw r0;
    L_0x00c5:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x00b7 }
    L_0x00c7:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a3b.a(java.lang.String, long, boolean, boolean):void");
    }

    public void c(String str, String str2) {
        a9q b = b(str);
        try {
            if (!TextUtils.equals(str2, a9q.a(b))) {
                a9q.b(b, str2);
                a(b);
            }
        } catch (SQLiteDatabaseCorruptException e) {
            throw e;
        }
    }

    private void a(a9q com_whatsapp_a9q) {
        int i = 0;
        ContentValues contentValues = new ContentValues(8);
        try {
            String str = z[93];
            if (com_whatsapp_a9q.k()) {
                i = 1;
            }
            contentValues.put(str, Integer.valueOf(i));
            contentValues.put(z[95], com_whatsapp_a9q.c());
            contentValues.put(z[87], com_whatsapp_a9q.l());
            contentValues.put(z[90], com_whatsapp_a9q.b());
            contentValues.put(z[86], com_whatsapp_a9q.e());
            contentValues.put(z[94], com_whatsapp_a9q.g());
            contentValues.put(z[96], com_whatsapp_a9q.d());
            a9q.a(com_whatsapp_a9q, true);
            try {
                if (this.d.getWritableDatabase().update(z[85], contentValues, z[91], new String[]{a9q.f(com_whatsapp_a9q)}) == 0) {
                    contentValues.put(z[88], a9q.f(com_whatsapp_a9q));
                    this.d.getWritableDatabase().insert(z[92], null, contentValues);
                }
            } catch (Throwable e) {
                Log.a(z[89], e);
                b();
                throw e;
            }
        } catch (SQLiteDatabaseCorruptException e2) {
            throw e2;
        }
    }

    public void g(String str) {
        a9q b = b(str);
        a9q h = a9q.h(b);
        a9q.c(b, h.c());
        a9q.f(b, h.l());
        a9q.a(b, h.b());
        a9q.g(b, h.e());
        a9q.d(b, h.g());
        a9q.b(b, h.d());
        a9q.c(b, false);
        a(b);
    }

    public void f(String str, String str2) {
        a9q b = b(str);
        try {
            if (!TextUtils.equals(str2, a9q.l(b))) {
                a9q.a(b, str2);
                a(b);
            }
        } catch (SQLiteDatabaseCorruptException e) {
            throw e;
        }
    }

    static void a(a3b com_whatsapp_a3b) {
        com_whatsapp_a3b.c();
    }

    private a3b(Context context) {
        this.b = new ConcurrentHashMap();
        this.c = context;
        this.d = new nr(context);
    }

    public void a(String str, long j, boolean z) {
        a(str, j, z, true);
    }

    public boolean f(String str) {
        return a9q.n(b(str));
    }

    static a3b a() {
        return a;
    }

    public void h(String str) {
        a9q b = b(str);
        if (b.k()) {
            a9q.b(b, System.currentTimeMillis());
            ContentValues contentValues = new ContentValues(1);
            try {
                contentValues.put(z[44], Long.valueOf(a9q.b(b)));
                this.d.getWritableDatabase().update(z[40], contentValues, z[41], new String[]{str});
                if (!DialogToastActivity.f) {
                    return;
                }
            } catch (SQLiteDatabaseCorruptException e) {
                throw e;
            }
        }
        this.b.remove(str);
        this.d.getWritableDatabase().delete(z[42], z[43], new String[]{str});
    }

    public long c(String str) {
        return b(str).h();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c() {
        /*
        r15 = this;
        r14 = 1;
        r1 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = z;
        r2 = 69;
        r0 = r0[r2];
        r4 = r15.b(r0);
        r0 = com.whatsapp.a9q.j(r4);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0015 }
        if (r0 == 0) goto L_0x0017;
    L_0x0014:
        return;
    L_0x0015:
        r0 = move-exception;
        throw r0;
    L_0x0017:
        r0 = r15.c;
        r2 = z;
        r5 = 66;
        r2 = r2[r5];
        r5 = r0.getSharedPreferences(r2, r1);
        r6 = new com.whatsapp.util.ab;
        r6.<init>();
        r0 = z;
        r2 = 58;
        r0 = r0[r2];
        r6.b(r0);
        r0 = z;
        r2 = 56;
        r0 = r0[r2];
        r2 = 0;
        r0 = r5.getString(r0, r2);
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r7 = z;
        r8 = 67;
        r7 = r7[r8];
        r2 = r2.append(r7);
        r2 = r2.append(r0);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r2 = android.text.TextUtils.isEmpty(r0);
        if (r2 != 0) goto L_0x0374;
    L_0x005c:
        r2 = ",";
        r7 = r0.split(r2);
        r0 = r15.d;
        r8 = r0.getWritableDatabase();
        r8.beginTransaction();
        r0 = r7.length;
        r0 = r0 + -1;
        r2 = r0;
        r0 = r1;
    L_0x0071:
        if (r2 < 0) goto L_0x00bb;
    L_0x0073:
        r9 = r7[r2];
        r10 = r9.length();
        if (r10 <= r14) goto L_0x00b7;
    L_0x007b:
        r0 = r0 + 1;
        r10 = "#";
        r9 = r9.split(r10);
        r10 = com.whatsapp.App.as;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0364 }
        r11 = 0;
        r11 = r9[r11];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0364 }
        r10 = r10.c(r11);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0364 }
        if (r10 == 0) goto L_0x00b7;
    L_0x008f:
        r10 = r9.length;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0366 }
        r11 = 3;
        if (r10 < r11) goto L_0x00a9;
    L_0x0093:
        r10 = 0;
        r10 = r9[r10];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0368 }
        r11 = 1;
        r11 = r9[r11];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0368 }
        r12 = java.lang.Long.parseLong(r11);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0368 }
        r11 = 2;
        r11 = r9[r11];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0368 }
        r11 = java.lang.Boolean.parseBoolean(r11);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0368 }
        r15.a(r10, r12, r11);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0368 }
        if (r3 == 0) goto L_0x00b7;
    L_0x00a9:
        r10 = 0;
        r10 = r9[r10];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0368 }
        r11 = 1;
        r9 = r9[r11];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0368 }
        r12 = java.lang.Long.parseLong(r9);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0368 }
        r9 = 1;
        r15.a(r10, r12, r9);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0368 }
    L_0x00b7:
        r2 = r2 + -1;
        if (r3 == 0) goto L_0x0071;
    L_0x00bb:
        r8.setTransactionSuccessful();
        r8.endTransaction();
        r2 = r5.edit();
        r7 = z;
        r8 = 84;
        r7 = r7[r8];
        r2 = r2.remove(r7);
        r2.commit();
    L_0x00d2:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r7 = z;
        r8 = 51;
        r7 = r7[r8];
        r2 = r2.append(r7);
        r0 = r2.append(r0);
        r2 = z;
        r7 = 55;
        r2 = r2[r7];
        r0 = r0.append(r2);
        r6 = r6.b();
        r0 = r0.append(r6);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = z;
        r2 = 53;
        r0 = r0[r2];
        r2 = r5.getBoolean(r0, r14);
        r0 = z;
        r6 = 70;
        r0 = r0[r6];
        r6 = r5.getBoolean(r0, r14);
        r0 = new com.whatsapp.util.ab;
        r0.<init>();
        r7 = z;
        r8 = 72;
        r7 = r7[r8];
        r0.b(r7);
        r7 = z;
        r8 = 71;
        r7 = r7[r8];
        r8 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI;
        r8 = r8.toString();
        r7 = r5.getString(r7, r8);
        com.whatsapp.a9q.c(r4, r7);
        r7 = z;
        r8 = 52;
        r7 = r7[r8];
        r8 = "1";
        r7 = r5.getString(r7, r8);
        com.whatsapp.a9q.f(r4, r7);
        r7 = z;
        r8 = 57;
        r7 = r7[r8];
        r8 = java.lang.Integer.toString(r1);
        r7 = r5.getString(r7, r8);
        com.whatsapp.a9q.a(r4, r7);
        r7 = z;
        r8 = 61;
        r7 = r7[r8];
        r8 = z;
        r9 = 79;
        r8 = r8[r9];
        r7 = r5.getString(r7, r8);
        com.whatsapp.a9q.g(r4, r7);
        r7 = z;
        r8 = 82;
        r7 = r7[r8];
        r8 = android.provider.Settings.System.DEFAULT_RINGTONE_URI;
        r8 = r8.toString();
        r7 = r5.getString(r7, r8);
        com.whatsapp.a9q.d(r4, r7);
        r7 = z;
        r8 = 48;
        r7 = r7[r8];
        r8 = "1";
        r7 = r5.getString(r7, r8);
        com.whatsapp.a9q.b(r4, r7);
        r15.a(r4);
        r4 = z;
        r7 = 63;
        r4 = r4[r7];
        r4 = r15.b(r4);
        r7 = z;
        r8 = 83;
        r7 = r7[r8];
        r8 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI;
        r8 = r8.toString();
        r7 = r5.getString(r7, r8);
        com.whatsapp.a9q.c(r4, r7);
        r7 = z;
        r8 = 54;
        r7 = r7[r8];
        r8 = "1";
        r7 = r5.getString(r7, r8);
        com.whatsapp.a9q.f(r4, r7);
        r7 = z;
        r8 = 75;
        r7 = r7[r8];
        r1 = java.lang.Integer.toString(r1);
        r1 = r5.getString(r7, r1);
        com.whatsapp.a9q.a(r4, r1);
        r1 = z;
        r7 = 80;
        r1 = r1[r7];
        r7 = z;
        r8 = 59;
        r7 = r7[r8];
        r1 = r5.getString(r1, r7);
        com.whatsapp.a9q.g(r4, r1);
        r15.a(r4);
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r4 = z;
        r7 = 45;
        r4 = r4[r7];
        r1 = r1.append(r4);
        r8 = r0.b();
        r0 = r1.append(r8);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r5.edit();
        r1 = z;
        r4 = 46;
        r1 = r1[r4];
        r0 = r0.remove(r1);
        r1 = z;
        r4 = 68;
        r1 = r1[r4];
        r0 = r0.remove(r1);
        r1 = z;
        r4 = 60;
        r1 = r1[r4];
        r0 = r0.remove(r1);
        r1 = z;
        r4 = 76;
        r1 = r1[r4];
        r0 = r0.remove(r1);
        r1 = z;
        r4 = 62;
        r1 = r1[r4];
        r0 = r0.remove(r1);
        r1 = z;
        r4 = 49;
        r1 = r1[r4];
        r0 = r0.remove(r1);
        r1 = z;
        r4 = 73;
        r1 = r1[r4];
        r0 = r0.remove(r1);
        r1 = z;
        r4 = 65;
        r1 = r1[r4];
        r0 = r0.remove(r1);
        r1 = z;
        r4 = 77;
        r1 = r1[r4];
        r0 = r0.remove(r1);
        r1 = z;
        r4 = 47;
        r1 = r1[r4];
        r0 = r0.remove(r1);
        r1 = z;
        r4 = 64;
        r1 = r1[r4];
        r0 = r0.remove(r1);
        r1 = z;
        r4 = 74;
        r1 = r1[r4];
        r0 = r0.remove(r1);
        r0.commit();
        r4 = new com.whatsapp.util.ab;
        r4.<init>();
        r0 = z;	 Catch:{ SQLiteDatabaseCorruptException -> 0x036a }
        r1 = 78;
        r0 = r0[r1];	 Catch:{ SQLiteDatabaseCorruptException -> 0x036a }
        r4.b(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x036a }
        if (r2 != 0) goto L_0x0290;
    L_0x028e:
        if (r6 == 0) goto L_0x0014;
    L_0x0290:
        r0 = com.whatsapp.qa.g();
        r5 = new java.util.HashMap;
        r5.<init>();
        r1 = r0.iterator();
    L_0x029d:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x02ca;
    L_0x02a3:
        r0 = r1.next();
        r0 = (java.lang.String) r0;
        r7 = com.whatsapp.qm.i(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x036c }
        if (r7 != 0) goto L_0x02c8;
    L_0x02af:
        r7 = com.whatsapp.l5.e(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x036c }
        if (r7 != 0) goto L_0x02c8;
    L_0x02b5:
        r7 = com.whatsapp.App.as;
        r7 = r7.b(r0);
        r7 = r7.v();
        r8 = android.text.TextUtils.isEmpty(r7);	 Catch:{ SQLiteDatabaseCorruptException -> 0x036e }
        if (r8 != 0) goto L_0x02c8;
    L_0x02c5:
        r5.put(r0, r7);	 Catch:{ SQLiteDatabaseCorruptException -> 0x036e }
    L_0x02c8:
        if (r3 == 0) goto L_0x029d;
    L_0x02ca:
        r0 = r5.isEmpty();
        if (r0 != 0) goto L_0x031c;
    L_0x02d0:
        r0 = r15.d;
        r7 = r0.getWritableDatabase();
        r7.beginTransaction();
        r0 = r5.entrySet();
        r8 = r0.iterator();
    L_0x02e1:
        r0 = r8.hasNext();
        if (r0 == 0) goto L_0x0316;
    L_0x02e7:
        r0 = r8.next();
        r0 = (java.util.Map.Entry) r0;
        r1 = r0.getKey();
        r1 = (java.lang.String) r1;
        r9 = r15.b(r1);
        r1 = 1;
        com.whatsapp.a9q.c(r9, r1);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0370 }
        if (r2 == 0) goto L_0x0306;
    L_0x02fd:
        r1 = r0.getValue();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0370 }
        r1 = (java.lang.String) r1;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0370 }
        com.whatsapp.a9q.c(r9, r1);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0370 }
    L_0x0306:
        if (r6 == 0) goto L_0x0311;
    L_0x0308:
        r0 = r0.getValue();	 Catch:{ SQLiteDatabaseCorruptException -> 0x0372 }
        r0 = (java.lang.String) r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0372 }
        com.whatsapp.a9q.d(r9, r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0372 }
    L_0x0311:
        r15.a(r9);
        if (r3 == 0) goto L_0x02e1;
    L_0x0316:
        r7.setTransactionSuccessful();
        r7.endTransaction();
    L_0x031c:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r3 = 81;
        r1 = r1[r3];
        r0 = r0.append(r1);
        r0 = r0.append(r2);
        r1 = " ";
        r0 = r0.append(r1);
        r0 = r0.append(r6);
        r1 = " ";
        r0 = r0.append(r1);
        r1 = r5.size();
        r0 = r0.append(r1);
        r1 = z;
        r2 = 50;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r2 = r4.b();
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        goto L_0x0014;
    L_0x0364:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0366 }
    L_0x0366:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0368 }
    L_0x0368:
        r0 = move-exception;
        throw r0;
    L_0x036a:
        r0 = move-exception;
        throw r0;
    L_0x036c:
        r0 = move-exception;
        throw r0;
    L_0x036e:
        r0 = move-exception;
        throw r0;
    L_0x0370:
        r0 = move-exception;
        throw r0;
    L_0x0372:
        r0 = move-exception;
        throw r0;
    L_0x0374:
        r0 = r1;
        goto L_0x00d2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a3b.c():void");
    }

    static {
        String[] strArr = new String[116];
        String str = "\u001c #8}\u001c";
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
                        i3 = 90;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_checkboxStyle;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_buttonStyleSmall;
                        break;
                    case at.o /*3*/:
                        i3 = 126;
                        break;
                    default:
                        i3 = 59;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    str = "\u001c #8}\u001c";
                    obj = 1;
                    strArr2 = strArr3;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "=\u0014\n\u000bK\u0005\u0005\r\u001fO\u0005\u0002\u0000\u0018Z/\n\u0011\r";
                    obj = 2;
                    strArr2 = strArr3;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "7\u0003\u0016\rZ=\u0003:\bR8\u0014\u0004\n^";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "z\u000b\u0000\rH;\u0001\u00002R=\u000e\u0011D";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "9\u0007\t\u0012d.\t\u000b\u001b";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "0\u000f\u0001";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "7\u0003\u0016\rZ=\u0003:\nT4\u0003";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "z\u0013\u0016\u001bx/\u0015\u0011\u0011V\u0014\t\u0011\u0017]3\u0005\u0004\nR5\b\u0016D";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "z\u000b\u0000\rH;\u0001\u0000*T4\u0003_";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "u\u0015\u0000\nO3\b\u0002\r\u0014?\u001e\u0006\u001bK.\u000f\n\u0010";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "u\u0015\u0000\nO3\b\u0002\r\u0014";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "z\u0005\u0004\u0012W\u000e\t\u000b\u001b\u0001";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "/\u0015\u0000!X/\u0015\u0011\u0011V\u0005\b\n\nR<\u000f\u0006\u001fO3\t\u000b\r";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "z\u000b\u0000\rH;\u0001\u0000(R8\u0014\u0004\n^`";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = ")\u0003\u0011\nR4\u0001\u0016";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "z\u000b\u0000\rH;\u0001\u0000.T*\u0013\u0015D";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "7\u0013\u0011\u001bd?\b\u0001";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "z\u000b\u0010\n^\u001f\b\u0001*R7\u0003_";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "7\u0003\u0016\rZ=\u0003:\u000eT*\u0013\u0015";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "9\u0007\t\u0012d,\u000f\u0007\fZ.\u0003";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "z\u0005\u0004\u0012W\f\u000f\u0007\fZ.\u0003_";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "7\u0013\u0011\u001b_\u0005\b\n\nR<\u000f\u0006\u001fO3\t\u000b\r";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "z\u0015\r\u0011L\u0014\t\u0011\u0017]3\u0005\u0004\nR5\b\u0016)S?\b(\u000bO?\u0002_";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "7\u0003\u0016\rZ=\u0003:\u0012R=\u000e\u0011";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "7\u0003\u0016\rZ=\u0003:\nT4\u0003";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "jVUN\u000bj";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "7\u0013\u0011\u001bd?\b\u0001";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "9\u0007\t\u0012d.\t\u000b\u001b";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "7\u0013\u0011\u001b_\u0005\b\n\nR<\u000f\u0006\u001fO3\t\u000b\r";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "7\u0003\u0016\rZ=\u0003:\u0012R=\u000e\u0011";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "0\u000f\u0001";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "/\u0015\u0000!X/\u0015\u0011\u0011V\u0005\b\n\nR<\u000f\u0006\u001fO3\t\u000b\r";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "9\u000e\u0004\nH?\u0012\u0011\u0017U=\u0015\u0016\rO5\u0014\u0000Q\\?\u0012";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "7\u0003\u0016\rZ=\u0003:\u000eT*\u0013\u0015";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "9\u0007\t\u0012d,\u000f\u0007\fZ.\u0003";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "0\u000f\u0001^\u0006zY";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = ")\u0003\u0011\nR4\u0001\u0016";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "7\u0003\u0016\rZ=\u0003:\bR8\u0014\u0004\n^";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = ")\u0003\u0011\nR4\u0001\u0016";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "0\u000f\u0001^\u0006zY";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = ")\u0003\u0011\nR4\u0001\u0016";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "0\u000f\u0001^\u0006zY";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = ">\u0003\t\u001bO?\u0002";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "9\u000e\u0004\nH?\u0012\u0011\u0017U=\u0015\u0016\rO5\u0014\u0000QV3\u0001\u0017\u001fO?I\u0016\u001bO.\u000f\u000b\u0019Hz\u001aE\nR7\u0003E\rK?\b\u0011D";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "4\t\u0011\u0017]#9\u0017\u0017U=\u0012\n\u0010^";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "=\u0014\n\u000bK\u0005\b\n\nR<\u001f:\bR8\u0014\u0004\n^\u0005\n\u0000\u0010\\.\u000e";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "9\u0007\t\u0012d,\u000f\u0007\fZ.\u0003:\u0012^4\u0001\u0011\u0016";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "9\u0007\t\u0012d9\u0013\u0016\nT79\u0017\u0017U=\u0012\n\u0010^";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "z\u001aE\nR7\u0003E\rK?\b\u0011D";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "9\u000e\u0004\nH?\u0012\u0011\u0017U=\u0015\u0016\rO5\u0014\u0000QV3\u0001\u0017\u001fO?I\b\u000bO?F";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "4\t\u0011\u0017]#9\u0013\u0017Y(\u0007\u0011\u001bd6\u0003\u000b\u0019O2";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "9\u0013\u0016\nT79\u0017\u0017U=\u0012\n\u0010^";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "=\u0014\n\u000bK\u0005\b\n\nR<\u001f:\bR8\u0014\u0004\n^\u0005\n\u0000\u0010\\.\u000e";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "z\u001aE\nR7\u0003E\rK?\b\u0011D";
                    obj = 54;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "7\u0013\u0011\u001bd3\b\u0003\u0011";
                    obj = 55;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "4\t\u0011\u0017]#9\u0015\u0011K/\u0016:\u0013T>\u0003";
                    obj = 56;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "9\u000e\u0004\nH?\u0012\u0011\u0017U=\u0015\u0016\rO5\u0014\u0000QV3\u0001\u0017\u001fO?I\b\u000bO?";
                    obj = 57;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i] = str;
                    str = "\u001c #8}\u001c";
                    obj = 58;
                    i = 59;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    strArr2 = strArr3;
                    str = "4\t\u0011\u0017]#9\u0013\u0017Y(\u0007\u0011\u001bd6\u0003\u000b\u0019O2";
                    obj = 59;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "4\t\u0011\u0017]#9\t\u0017\\2\u0012:\u001dT6\t\u0017";
                    obj = 60;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "4\t\u0011\u0017]#9\t\u0017\\2\u0012:\u001dT6\t\u0017";
                    obj = 61;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "=\u0014\n\u000bK\u0005\u0005\r\u001fO\u0005\u0002\u0000\u0018Z/\n\u0011\r";
                    obj = 62;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "=\u0014\n\u000bK\u0005\b\n\nR<\u001f:\u000eT*\u0013\u0015!V5\u0002\u0000";
                    obj = 63;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "9\u0007\t\u0012d,\u000f\u0007\fZ.\u0003:\u0012^4\u0001\u0011\u0016";
                    obj = 64;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "9\t\bPL2\u0007\u0011\rZ*\u0016:\u000eI?\u0000\u0000\f^4\u0005\u0000\r";
                    obj = 65;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "4\t\u0011\u0017]3\u0005\u0004\nR5\bJ\u0017U3\u0012:\u0013N.\u0003:\u0017U<\t_";
                    obj = 66;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "9\u0013\u0016\nT79\u0017\u0017U=\u0012\n\u0010^";
                    obj = 67;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    strArr2[i] = str;
                    i = 69;
                    str = "3\b\u0001\u0017M3\u0002\u0010\u001fW\u0005\u0005\r\u001fO\u0005\u0002\u0000\u0018Z/\n\u0011\r";
                    obj = 68;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    strArr2[i] = str;
                    i = 70;
                    str = "9\u0007\t\u0012d9\u0013\u0016\nT79\u0017\u0017U=\u0012\n\u0010^";
                    obj = 69;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeight /*69*/:
                    strArr2[i] = str;
                    i = 71;
                    str = "4\t\u0011\u0017]#9\u0017\u0017U=\u0012\n\u0010^";
                    obj = 70;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightSmall /*70*/:
                    strArr2[i] = str;
                    i = 72;
                    str = "9\u000e\u0004\nH?\u0012\u0011\u0017U=\u0015\u0016\rO5\u0014\u0000QV3\u0001\u0017\u001fO?I\u0016\u001bO.\u000f\u000b\u0019H";
                    obj = 71;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightLarge /*71*/:
                    strArr2[i] = str;
                    i = 73;
                    str = "9\u0007\t\u0012d(\u000f\u000b\u0019O5\b\u0000";
                    obj = 72;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingLeft /*72*/:
                    strArr2[i] = str;
                    i = 74;
                    str = "=\u0014\n\u000bK\u0005\b\n\nR<\u001f:\u0012R=\u000e\u0011!X5\n\n\f";
                    obj = 73;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingRight /*73*/:
                    strArr2[i] = str;
                    i = 75;
                    str = "=\u0014\n\u000bK\u0005\b\n\nR<\u001f:\u000eT*\u0013\u0015!V5\u0002\u0000";
                    obj = 74;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropDownListViewStyle /*74*/:
                    strArr2[i] = str;
                    i = 76;
                    str = "4\t\u0011\u0017]#9\u0015\u0011K/\u0016:\u0013T>\u0003";
                    obj = 75;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPopupWindowStyle /*75*/:
                    strArr2[i] = str;
                    i = 77;
                    str = "=\u0014\n\u000bK\u0005\b\n\nR<\u001f:\nT4\u0003";
                    obj = 76;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItem /*76*/:
                    strArr2[i] = str;
                    i = 78;
                    str = "9\u000e\u0004\nH?\u0012\u0011\u0017U=\u0015\u0016\rO5\u0014\u0000QV3\u0001\u0017\u001fO?I\u0017\u0017U=\u0012\n\u0010^)";
                    obj = 77;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItemSmall /*77*/:
                    strArr2[i] = str;
                    i = 79;
                    str = "\u001c #8}\u001c";
                    obj = 78;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelBackground /*78*/:
                    strArr2[i] = str;
                    i = 80;
                    str = "=\u0014\n\u000bK\u0005\b\n\nR<\u001f:\u0012R=\u000e\u0011!X5\n\n\f";
                    obj = 79;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListWidth /*79*/:
                    strArr2[i] = str;
                    i = 81;
                    str = "9\u000e\u0004\nH?\u0012\u0011\u0017U=\u0015\u0016\rO5\u0014\u0000QV3\u0001\u0017\u001fO?I\u0017\u0017U=\u0012\n\u0010^)F";
                    obj = 80;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListTheme /*80*/:
                    strArr2[i] = str;
                    i = 82;
                    str = "9\u0007\t\u0012d(\u000f\u000b\u0019O5\b\u0000";
                    obj = 81;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listChoiceBackgroundIndicator /*81*/:
                    strArr2[i] = str;
                    i = 83;
                    str = "=\u0014\n\u000bK\u0005\b\n\nR<\u001f:\nT4\u0003";
                    obj = 82;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimary /*82*/:
                    strArr2[i] = str;
                    i = 84;
                    str = "7\u0013\u0011\u001bd3\b\u0003\u0011";
                    obj = 83;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimaryDark /*83*/:
                    strArr2[i] = str;
                    i = 85;
                    str = ")\u0003\u0011\nR4\u0001\u0016";
                    obj = 84;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorAccent /*84*/:
                    strArr2[i] = str;
                    i = 86;
                    str = "7\u0003\u0016\rZ=\u0003:\u0012R=\u000e\u0011";
                    obj = 85;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlNormal /*85*/:
                    strArr2[i] = str;
                    i = 87;
                    str = "7\u0003\u0016\rZ=\u0003:\bR8\u0014\u0004\n^";
                    obj = 86;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlActivated /*86*/:
                    strArr2[i] = str;
                    i = 88;
                    str = "0\u000f\u0001";
                    obj = 87;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlHighlight /*87*/:
                    strArr2[i] = str;
                    i = 89;
                    str = "9\u000e\u0004\nH?\u0012\u0011\u0017U=\u0015\u0016\rO5\u0014\u0000QH;\u0010\u0000";
                    obj = 88;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorButtonNormal /*88*/:
                    strArr2[i] = str;
                    str = "7\u0003\u0016\rZ=\u0003:\u000eT*\u0013\u0015";
                    obj = 89;
                    i = 90;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorSwitchThumbNormal /*89*/:
                    strArr2[i] = str;
                    i = 91;
                    strArr2 = strArr3;
                    str = "0\u000f\u0001^\u0006zY";
                    obj = 90;
                    break;
                case arj.Theme_controlBackground /*90*/:
                    strArr2[i] = str;
                    i = 92;
                    str = ")\u0003\u0011\nR4\u0001\u0016";
                    obj = 91;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogStyle /*91*/:
                    strArr2[i] = str;
                    i = 93;
                    str = "/\u0015\u0000!X/\u0015\u0011\u0011V\u0005\b\n\nR<\u000f\u0006\u001fO3\t\u000b\r";
                    obj = 92;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogButtonGroupStyle /*92*/:
                    strArr2[i] = str;
                    i = 94;
                    str = "9\u0007\t\u0012d.\t\u000b\u001b";
                    obj = 93;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogCenterButtons /*93*/:
                    strArr2[i] = str;
                    i = 95;
                    str = "7\u0003\u0016\rZ=\u0003:\nT4\u0003";
                    obj = 94;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogTheme /*94*/:
                    strArr2[i] = str;
                    i = 96;
                    str = "9\u0007\t\u0012d,\u000f\u0007\fZ.\u0003";
                    obj = 95;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorAlertDialogListItem /*95*/:
                    strArr2[i] = str;
                    i = 97;
                    str = ")\u0003\u0011\nR4\u0001\u0016";
                    obj = 96;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarPositiveButtonStyle /*96*/:
                    strArr2[i] = str;
                    i = 98;
                    str = "/\u0015\u0000!X/\u0015\u0011\u0011V\u0005\b\n\nR<\u000f\u0006\u001fO3\t\u000b\r";
                    obj = 97;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNegativeButtonStyle /*97*/:
                    strArr2[i] = str;
                    i = 99;
                    str = "7\u0013\u0011\u001bd?\b\u0001^\u0007zY";
                    obj = 98;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNeutralButtonStyle /*98*/:
                    strArr2[i] = str;
                    i = 100;
                    str = "9\u0007\t\u0012d.\t\u000b\u001b";
                    obj = 99;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_autoCompleteTextViewStyle /*99*/:
                    strArr2[i] = str;
                    str = ")\u0003\u0011\nR4\u0001\u0016";
                    obj = 100;
                    i = arj.Theme_buttonStyleSmall;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyle /*100*/:
                    strArr2[i] = str;
                    str = "7\u0003\u0016\rZ=\u0003:\u0012R=\u000e\u0011";
                    i = arj.Theme_checkboxStyle;
                    strArr2 = strArr3;
                    obj = 101;
                    break;
                case arj.Theme_buttonStyleSmall /*101*/:
                    strArr2[i] = str;
                    i = arj.Theme_checkedTextViewStyle;
                    strArr2 = strArr3;
                    str = "7\u0003\u0016\rZ=\u0003:\bR8\u0014\u0004\n^";
                    obj = 102;
                    break;
                case arj.Theme_checkboxStyle /*102*/:
                    strArr2[i] = str;
                    i = arj.Theme_editTextStyle;
                    str = "9\u0007\t\u0012d,\u000f\u0007\fZ.\u0003";
                    obj = arj.Theme_checkedTextViewStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_checkedTextViewStyle /*103*/:
                    strArr2[i] = str;
                    i = arj.Theme_radioButtonStyle;
                    str = "7\u0003\u0016\rZ=\u0003:\nT4\u0003";
                    obj = arj.Theme_editTextStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextStyle /*104*/:
                    strArr2[i] = str;
                    i = arj.Theme_ratingBarStyle;
                    str = "7\u0003\u0016\rZ=\u0003:\u000eT*\u0013\u0015";
                    obj = arj.Theme_radioButtonStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_radioButtonStyle /*105*/:
                    strArr2[i] = str;
                    i = arj.Theme_seekBarStyle;
                    str = "7\u0013\u0011\u001b_\u0005\b\n\nR<\u000f\u0006\u001fO3\t\u000b\r";
                    obj = arj.Theme_ratingBarStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_ratingBarStyle /*106*/:
                    strArr2[i] = str;
                    i = arj.Theme_spinnerStyle;
                    str = ")\u0003\u0011\nR4\u0001\u0016";
                    obj = arj.Theme_seekBarStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_seekBarStyle /*107*/:
                    strArr2[i] = str;
                    i = arj.Theme_switchStyle;
                    str = ")\u0003\u0011\nR4\u0001\u0016";
                    obj = arj.Theme_spinnerStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerStyle /*108*/:
                    strArr2[i] = str;
                    i = 110;
                    str = "7\u0013\u0011\u001bd?\b\u0001";
                    obj = arj.Theme_switchStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_switchStyle /*109*/:
                    strArr2[i] = str;
                    i = 111;
                    str = "0\u000f\u0001";
                    obj = 110;
                    strArr2 = strArr3;
                    break;
                case 110:
                    strArr2[i] = str;
                    i = 112;
                    str = "0\u000f\u0001^\u0006zY";
                    obj = 111;
                    strArr2 = strArr3;
                    break;
                case 111:
                    strArr2[i] = str;
                    i = 113;
                    str = ")\u0003\u0011\nR4\u0001\u0016";
                    obj = 112;
                    strArr2 = strArr3;
                    break;
                case 112:
                    strArr2[i] = str;
                    i = 114;
                    str = "0\u000f\u0001^\u0006zY";
                    obj = 113;
                    strArr2 = strArr3;
                    break;
                case 113:
                    strArr2[i] = str;
                    i = 115;
                    str = "9\u000e\u0004\nH?\u0012\u0011\u0017U=\u0015\u0016\rO5\u0014\u0000QH?\u0012\b\u000bO?";
                    obj = 114;
                    strArr2 = strArr3;
                    break;
                case 114:
                    strArr2[i] = str;
                    z = strArr3;
                    e = new Object();
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "3\b\u0001\u0017M3\u0002\u0010\u001fW\u0005\u0005\r\u001fO\u0005\u0002\u0000\u0018Z/\n\u0011\r";
                    obj = null;
                    break;
            }
        }
    }

    public boolean e(String str) {
        return b(str).f();
    }

    public void b() {
        this.b.clear();
        this.d.c();
        a = null;
    }

    public a9q g() {
        a9q b = b(z[3]);
        try {
            if (a9q.g(b) == null) {
                a9q.c(b, System.DEFAULT_NOTIFICATION_URI.toString());
            }
            try {
                if (TextUtils.isEmpty(a9q.d(b))) {
                    a9q.f(b, "1");
                }
                try {
                    if (TextUtils.isEmpty(a9q.l(b))) {
                        a9q.a(b, Integer.toString(0));
                    }
                    try {
                        if (TextUtils.isEmpty(a9q.c(b))) {
                            a9q.g(b, z[2]);
                        }
                        return b;
                    } catch (SQLiteDatabaseCorruptException e) {
                        throw e;
                    }
                } catch (SQLiteDatabaseCorruptException e2) {
                    throw e2;
                }
            } catch (SQLiteDatabaseCorruptException e22) {
                throw e22;
            }
        } catch (SQLiteDatabaseCorruptException e222) {
            throw e222;
        }
    }

    public a9q b(String str) {
        Cursor query;
        Throwable e;
        a9q com_whatsapp_a9q = (a9q) this.b.get(str);
        if (com_whatsapp_a9q == null) {
            try {
                query = this.d.getWritableDatabase().query(z[38], new String[]{z[32], z[28], z[30], z[33], z[26], z[39], z[35], z[31], z[29], z[36]}, z[37], new String[]{str}, null, null, null);
                com_whatsapp_a9q = new a9q(null);
                try {
                    a9q.e(com_whatsapp_a9q, str);
                    if (query != null && query.moveToNext()) {
                        boolean z;
                        a9q.a(com_whatsapp_a9q, query.getLong(1));
                        if (query.getInt(2) == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        try {
                            a9q.b(com_whatsapp_a9q, z);
                            if (query.getInt(3) == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            a9q.c(com_whatsapp_a9q, z);
                            a9q.c(com_whatsapp_a9q, query.getString(4));
                            a9q.f(com_whatsapp_a9q, query.getString(5));
                            a9q.a(com_whatsapp_a9q, query.getString(6));
                            a9q.g(com_whatsapp_a9q, query.getString(7));
                            a9q.d(com_whatsapp_a9q, query.getString(8));
                            a9q.b(com_whatsapp_a9q, query.getString(9));
                            a9q.a(com_whatsapp_a9q, true);
                            if ("0".equals(a9q.c(com_whatsapp_a9q))) {
                                a9q.g(com_whatsapp_a9q, z[27]);
                            }
                        } catch (SQLiteDatabaseCorruptException e2) {
                            throw e2;
                        } catch (SQLiteDatabaseCorruptException e22) {
                            throw e22;
                        } catch (SQLiteDatabaseCorruptException e3) {
                            e = e3;
                        }
                    }
                    this.b.put(str, com_whatsapp_a9q);
                    if (query != null) {
                        query.close();
                    }
                } catch (SQLiteDatabaseCorruptException e222) {
                    throw e222;
                } catch (SQLiteDatabaseCorruptException e2222) {
                    try {
                        throw e2222;
                    } catch (SQLiteDatabaseCorruptException e22222) {
                        throw e22222;
                    }
                }
            } catch (SQLiteDatabaseCorruptException e4) {
                e = e4;
                query = null;
                try {
                    Log.a(z[34], e);
                    b();
                    throw e;
                } catch (Throwable th) {
                    e = th;
                    if (query != null) {
                        try {
                            query.close();
                        } catch (SQLiteDatabaseCorruptException e222222) {
                            throw e222222;
                        }
                    }
                    throw e;
                }
            } catch (Throwable th2) {
                e = th2;
                query = null;
                if (query != null) {
                    query.close();
                }
                throw e;
            }
        }
        return com_whatsapp_a9q;
    }

    public void a(String str) {
        b(str, true);
    }

    public static a3b a(Context context) {
        if (a == null) {
            synchronized (e) {
                if (a == null) {
                    a = new a3b(context.getApplicationContext());
                    bq.a(new ky());
                }
            }
        }
        return a;
    }

    public a9q d() {
        a9q b = b(z[1]);
        try {
            if (a9q.g(b) == null) {
                a9q.c(b, System.DEFAULT_NOTIFICATION_URI.toString());
            }
            try {
                if (TextUtils.isEmpty(a9q.d(b))) {
                    a9q.f(b, "1");
                }
                try {
                    if (TextUtils.isEmpty(a9q.l(b))) {
                        a9q.a(b, Integer.toString(0));
                    }
                    try {
                        if (TextUtils.isEmpty(a9q.c(b))) {
                            a9q.g(b, z[0]);
                        }
                        try {
                            if (a9q.k(b) == null) {
                                a9q.d(b, System.DEFAULT_RINGTONE_URI.toString());
                            }
                            try {
                                if (TextUtils.isEmpty(a9q.a(b))) {
                                    a9q.b(b, "1");
                                }
                                return b;
                            } catch (SQLiteDatabaseCorruptException e) {
                                throw e;
                            }
                        } catch (SQLiteDatabaseCorruptException e2) {
                            throw e2;
                        }
                    } catch (SQLiteDatabaseCorruptException e22) {
                        throw e22;
                    }
                } catch (SQLiteDatabaseCorruptException e222) {
                    throw e222;
                }
            } catch (SQLiteDatabaseCorruptException e2222) {
                throw e2222;
            }
        } catch (SQLiteDatabaseCorruptException e22222) {
            throw e22222;
        }
    }
}
