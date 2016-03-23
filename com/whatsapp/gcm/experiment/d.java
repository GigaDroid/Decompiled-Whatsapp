package com.whatsapp.gcm.experiment;

import android.app.Application;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.support.annotation.Nullable;
import com.whatsapp.App;
import com.whatsapp.a47;
import com.whatsapp.amm;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import com.whatsapp.util.bq;
import de.greenrobot.event.h;
import java.util.ArrayList;
import java.util.List;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class d {
    public static d c;
    public static boolean d;
    private static final String[] z;
    private Boolean a;
    private final Handler b;
    private final c e;

    static {
        String[] strArr = new String[21];
        String str = "\u001e{\u001c -\u0002u7#+\u001d{\u0004>,\u0015";
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
                        i3 = 112;
                        break;
                    case at.g /*1*/:
                        i3 = 30;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_editTextStyle;
                        break;
                    case at.o /*3*/:
                        i3 = 87;
                        break;
                    default:
                        i3 = 66;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0004w\u000521\u0004\u007f\u0005'";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = ">{\u001c -\u0002u<>/\u0015r\u00019'_y\r#";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = ">{\u001c -\u0002u<>/\u0015r\u00019'_";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u001e{\u001c -\u0002u7#+\u001d{\u0004>,\u0015";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "/w\f";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0004w\u000521\u0004\u007f\u0005'bN>W";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0004w\u000521\u0004\u007f\u0005'b1M+";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0004w\u000521\u0004\u007f\u0005'";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u0002{\t$-\u001e";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0004w\u000521\u0004\u007f\u0005'bL>W";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u001e{\u001c -\u0002u7#+\u001d{\u0004>,\u0015";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = ">{\u001c -\u0002u<>/\u0015r\u00019'_n\t%1\u00151\u000b8,\u001e{\u000b#nPj\u0001:'M3";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = ">{\u001c -\u0002u<>/\u0015r\u00019'_n\t%1\u00151\t'2]r\t\",\u0013vDw6\u0019s\rjo";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = ">{\u001c -\u0002u<>/\u0015r\u00019'_n\t%1\u00151\f>1\u0013q\u00069'\u0013jDw6\u0019s\rjo";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u00032H37\u0002\u007f\u001c>-\u001e#";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = ">{\u001c -\u0002u<>/\u0015r\u00019'_n\t%1\u00151\u0018>,\u0017A\u000e6+\u001c2H#+\u001d{Uz";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = ">{\u001c -\u0002u<>/\u0015r\u00019'_n\t%1\u00151\u0018>,\u0017A\u001b\"!\u0013{\u001b$nPj\u0001:'M3";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = ">{\u001c -\u0002u<>/\u0015r\u00019'_n\t%1\u00151\u001d90\u0015}\u00070,\u0019d\r3b\u0002{\t$-\u001e>Uw";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "\u0019p\u001e6.\u0019zH#+\u001d{\u001b##\u001dnH%'\u0013{\u0001!'\u0014>\u00019b\u0013,\f:b\u0000k\u001b?xP";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0002{\t$-\u001e";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public d(c cVar) {
        this.e = cVar;
        this.b = new Handler();
    }

    private static long a(long j, long j2) {
        return (j2 - j) / 1000;
    }

    private static long d() {
        return ((amm) h.b().b(amm.class)).a();
    }

    private synchronized void e() {
        synchronized (this.e) {
            long d = d() - 2880000;
            SQLiteDatabase writableDatabase = this.e.getWritableDatabase();
            writableDatabase.delete(z[12], z[11], new String[]{String.valueOf(d)});
            writableDatabase.close();
        }
    }

    static d c() {
        return b();
    }

    public static void a(Application application) {
        try {
            if (a()) {
                c = new d(new c(application));
                h.b().e(c);
                c.e();
                PingCheckSchedulerService.a(application);
                c.f();
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    private void f() {
        this.b.post(new a(this, d()));
    }

    private void a(boolean z) {
        this.b.post(new b(this, z, d()));
    }

    static void a(d dVar, int i, long j) {
        dVar.a(i, j);
    }

    private synchronized void a(int i, long j) {
        synchronized (this.e) {
            SQLiteDatabase writableDatabase = this.e.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(z[1], Integer.valueOf(i));
            contentValues.put(z[2], Long.valueOf(j));
            writableDatabase.insert(z[0], null, contentValues);
            writableDatabase.close();
        }
    }

    private static boolean a() {
        try {
            return App.am >= 1;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public void onEventAsync(a47 com_whatsapp_a47) {
        this.b.post(new e(this, com_whatsapp_a47, d()));
    }

    private synchronized List a(long j) {
        List arrayList;
        boolean z = d;
        arrayList = new ArrayList();
        synchronized (this.e) {
            SQLiteDatabase readableDatabase = this.e.getReadableDatabase();
            String[] strArr = new String[]{z[6], z[10], z[9]};
            String str = z[8];
            Cursor query = readableDatabase.query(z[5], strArr, z[7], new String[]{"" + (d() - j)}, null, null, str);
            while (query.moveToNext()) {
                arrayList.add(new i(this, query.getInt(0), query.getInt(1), query.getLong(2)));
                if (z) {
                    break;
                }
            }
            query.close();
            readableDatabase.close();
        }
        return arrayList;
    }

    static Boolean a(d dVar) {
        return dVar.a;
    }

    public static void a(String str) {
        try {
            if (a()) {
                try {
                    long parseLong = 1000 * Long.parseLong(str);
                    long a = ((amm) h.b().b(amm.class)).a();
                    parseLong = a - parseLong;
                    if (parseLong > 30000) {
                        try {
                            bq.a(new f(parseLong, a));
                        } catch (NumberFormatException e) {
                            throw e;
                        }
                    }
                } catch (NumberFormatException e2) {
                    Log.e(z[20] + str);
                }
            }
        } catch (NumberFormatException e3) {
            throw e3;
        }
    }

    @Nullable
    private static d b() {
        return c;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.whatsapp.gcm.experiment.h a(long r18, long r20, java.util.List r22) {
        /*
        r17 = this;
        r12 = d;
        r8 = 0;
        r7 = 0;
        r6 = 0;
        r3 = 0;
        r4 = -1;
        r2 = 0;
        r13 = r22.iterator();
        r10 = r8;
        r8 = r7;
        r7 = r6;
        r6 = r3;
        r3 = r2;
    L_0x0013:
        r2 = r13.hasNext();
        if (r2 == 0) goto L_0x0181;
    L_0x0019:
        r2 = r13.next();
        r2 = (com.whatsapp.gcm.experiment.i) r2;
        r9 = r2.c;
        switch(r9) {
            case 1: goto L_0x0068;
            case 2: goto L_0x0096;
            case 3: goto L_0x0108;
            case 4: goto L_0x00da;
            case 5: goto L_0x0138;
            default: goto L_0x0024;
        };
    L_0x0024:
        r9 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x016f }
        r9.<init>();	 Catch:{ NumberFormatException -> 0x016f }
        r14 = z;	 Catch:{ NumberFormatException -> 0x016f }
        r15 = 19;
        r14 = r14[r15];	 Catch:{ NumberFormatException -> 0x016f }
        r9 = r9.append(r14);	 Catch:{ NumberFormatException -> 0x016f }
        r2 = r2.c;	 Catch:{ NumberFormatException -> 0x016f }
        r2 = r9.append(r2);	 Catch:{ NumberFormatException -> 0x016f }
        r2 = r2.toString();	 Catch:{ NumberFormatException -> 0x016f }
        com.whatsapp.util.Log.e(r2);	 Catch:{ NumberFormatException -> 0x016f }
        r2 = r3;
        r3 = r6;
        r6 = r7;
        r7 = r8;
        r8 = r10;
    L_0x0045:
        if (r12 == 0) goto L_0x017a;
    L_0x0047:
        r12 = r3;
        r11 = r6;
        r10 = r7;
    L_0x004a:
        if (r2 == 0) goto L_0x004f;
    L_0x004c:
        r2 = r20 - r4;
        r8 = r8 + r2;
    L_0x004f:
        r2 = 0;
        r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1));
        if (r2 <= 0) goto L_0x0171;
    L_0x0055:
        r7 = 1;
    L_0x0056:
        if (r7 != 0) goto L_0x005a;
    L_0x0058:
        if (r10 == 0) goto L_0x0174;
    L_0x005a:
        r5 = 1;
    L_0x005b:
        if (r12 > 0) goto L_0x005f;
    L_0x005d:
        if (r7 == 0) goto L_0x0177;
    L_0x005f:
        r6 = 1;
    L_0x0060:
        r2 = new com.whatsapp.gcm.experiment.h;
        r3 = r18;
        r2.<init>(r3, r5, r6, r7, r8, r10, r11, r12);
        return r2;
    L_0x0068:
        r3 = 1;
        r4 = r2.d;
        r9 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x016d }
        r9.<init>();	 Catch:{ NumberFormatException -> 0x016d }
        r14 = z;	 Catch:{ NumberFormatException -> 0x016d }
        r15 = 13;
        r14 = r14[r15];	 Catch:{ NumberFormatException -> 0x016d }
        r9 = r9.append(r14);	 Catch:{ NumberFormatException -> 0x016d }
        r14 = r2.d;	 Catch:{ NumberFormatException -> 0x016d }
        r0 = r20;
        r14 = a(r14, r0);	 Catch:{ NumberFormatException -> 0x016d }
        r9 = r9.append(r14);	 Catch:{ NumberFormatException -> 0x016d }
        r14 = "s";
        r9 = r9.append(r14);	 Catch:{ NumberFormatException -> 0x016d }
        r9 = r9.toString();	 Catch:{ NumberFormatException -> 0x016d }
        com.whatsapp.util.Log.i(r9);	 Catch:{ NumberFormatException -> 0x016d }
        if (r12 == 0) goto L_0x0166;
    L_0x0096:
        if (r3 == 0) goto L_0x009c;
    L_0x0098:
        r14 = r2.d;
        r14 = r14 - r4;
        r10 = r10 + r14;
    L_0x009c:
        r3 = 0;
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r14 = z;
        r15 = 15;
        r14 = r14[r15];
        r9 = r9.append(r14);
        r14 = r2.d;
        r0 = r20;
        r14 = a(r14, r0);
        r9 = r9.append(r14);
        r14 = z;
        r15 = 16;
        r14 = r14[r15];
        r9 = r9.append(r14);
        r14 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r14 = r10 / r14;
        r9 = r9.append(r14);
        r14 = "s";
        r9 = r9.append(r14);
        r9 = r9.toString();
        com.whatsapp.util.Log.i(r9);
        if (r12 == 0) goto L_0x0166;
    L_0x00da:
        r8 = 1;
        r7 = r7 + 1;
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r14 = z;
        r15 = 17;
        r14 = r14[r15];
        r9 = r9.append(r14);
        r14 = r2.d;
        r0 = r20;
        r14 = a(r14, r0);
        r9 = r9.append(r14);
        r14 = "s";
        r9 = r9.append(r14);
        r9 = r9.toString();
        com.whatsapp.util.Log.i(r9);
        if (r12 == 0) goto L_0x0166;
    L_0x0108:
        r8 = 1;
        r7 = r7 + 1;
        r6 = r6 + 1;
        r9 = new java.lang.StringBuilder;
        r9.<init>();
        r14 = z;
        r15 = 18;
        r14 = r14[r15];
        r9 = r9.append(r14);
        r14 = r2.d;
        r0 = r20;
        r14 = a(r14, r0);
        r9 = r9.append(r14);
        r14 = "s";
        r9 = r9.append(r14);
        r9 = r9.toString();
        com.whatsapp.util.Log.i(r9);
        if (r12 == 0) goto L_0x0166;
    L_0x0138:
        r3 = 0;
        r4 = -1;
        r9 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x016f }
        r9.<init>();	 Catch:{ NumberFormatException -> 0x016f }
        r14 = z;	 Catch:{ NumberFormatException -> 0x016f }
        r15 = 14;
        r14 = r14[r15];	 Catch:{ NumberFormatException -> 0x016f }
        r9 = r9.append(r14);	 Catch:{ NumberFormatException -> 0x016f }
        r14 = r2.d;	 Catch:{ NumberFormatException -> 0x016f }
        r0 = r20;
        r14 = a(r14, r0);	 Catch:{ NumberFormatException -> 0x016f }
        r9 = r9.append(r14);	 Catch:{ NumberFormatException -> 0x016f }
        r14 = "s";
        r9 = r9.append(r14);	 Catch:{ NumberFormatException -> 0x016f }
        r9 = r9.toString();	 Catch:{ NumberFormatException -> 0x016f }
        com.whatsapp.util.Log.i(r9);	 Catch:{ NumberFormatException -> 0x016f }
        if (r12 != 0) goto L_0x0024;
    L_0x0166:
        r2 = r3;
        r3 = r6;
        r6 = r7;
        r7 = r8;
        r8 = r10;
        goto L_0x0045;
    L_0x016d:
        r2 = move-exception;
        throw r2;
    L_0x016f:
        r2 = move-exception;
        throw r2;
    L_0x0171:
        r7 = 0;
        goto L_0x0056;
    L_0x0174:
        r5 = 0;
        goto L_0x005b;
    L_0x0177:
        r6 = 0;
        goto L_0x0060;
    L_0x017a:
        r10 = r8;
        r8 = r7;
        r7 = r6;
        r6 = r3;
        r3 = r2;
        goto L_0x0013;
    L_0x0181:
        r2 = r3;
        r12 = r6;
        r16 = r8;
        r8 = r10;
        r11 = r7;
        r10 = r16;
        goto L_0x004a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gcm.experiment.d.a(long, long, java.util.List):com.whatsapp.gcm.experiment.h");
    }

    static void a(d dVar, boolean z) {
        dVar.a(z);
    }

    public h b(long j, long j2) {
        Log.i(z[3]);
        h a = a(j, j2, a(j));
        Log.i(z[4] + a.toString());
        return a;
    }

    static Boolean a(d dVar, Boolean bool) {
        dVar.a = bool;
        return bool;
    }
}
