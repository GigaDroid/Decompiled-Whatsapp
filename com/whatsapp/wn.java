package com.whatsapp;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.backport.util.Base64;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.hardware.TriggerEventListener;
import android.location.Location;
import android.location.LocationListener;
import android.os.Build.VERSION;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import com.whatsapp.util.bq;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.v;
import org.whispersystems.ag;
import org.whispersystems.at;
import org.whispersystems.b8;
import org.whispersystems.bx;
import org.whispersystems.e;

public final class wn {
    public static ala a;
    public static String b;
    private static boolean c;
    private static AtomicReference d;
    public static String e;
    public static boolean f;
    private static Sensor g;
    private static final a_s h;
    private static i_ i;
    private static Map j;
    public static byte[] k;
    public static final Map l;
    public static final List m;
    public static byte[] n;
    public static byte[] o;
    private static TriggerEventListener p;
    public static String q;
    private static boolean r;
    public static String s;
    private static final File t;
    private static final SecureRandom u;
    private static SensorManager v;
    private static boolean w;
    private static final List x;
    private static final AtomicInteger y;
    private static final String[] z;

    public static void a(long j) {
        w = false;
        a(j, b);
    }

    private static String z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 18;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_buttonStyleSmall;
                    break;
                case at.i /*2*/:
                    i2 = 35;
                    break;
                case at.o /*3*/:
                    i2 = 36;
                    break;
                default:
                    i2 = 118;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    private static char[] z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 118);
        }
        return toCharArray;
    }

    static SecureRandom f() {
        return u;
    }

    public static void d(String str, String str2) {
        i6 i6Var = (i6) j().get(str);
        if (i6Var != null) {
            Object decode = Base64.decode(i6Var.h, 0);
            Object obj = new byte[32];
            System.arraycopy(decode, 0, obj, 0, 32);
            Object obj2 = new byte[32];
            System.arraycopy(decode, 32, obj2, 0, 32);
            byte[] a = ft.a(obj2, obj);
            if (a != null && Base64.encodeToString(a, 2).equals(str2)) {
                m(str);
                A();
            }
        }
    }

    private static void d() {
        try {
            synchronized (l) {
                ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(t));
                for (Entry entry : ((Map) objectInputStream.readObject()).entrySet()) {
                    try {
                        if (((Integer) entry.getValue()).intValue() > 0) {
                            l.put(entry.getKey(), entry.getValue());
                        }
                    } catch (Exception e) {
                        throw e;
                    }
                }
                objectInputStream.close();
            }
        } catch (Exception e2) {
        }
    }

    public static void a(boolean z, boolean z2, boolean z3) {
        boolean z4 = DialogToastActivity.f;
        if (q()) {
            Intent intent = new Intent(z[4]).setPackage(z[2]);
            if (PendingIntent.getBroadcast(App.z(), 0, intent, 536870912) == null) {
                intent.putExtra(z[1], z);
                intent.putExtra(z[0], z2);
                intent.putExtra(z[3], z3);
                PendingIntent broadcast = PendingIntent.getBroadcast(App.z(), 0, intent, 0);
                AlarmManager alarmManager = (AlarmManager) App.z().getSystemService(z[5]);
                if (VERSION.SDK_INT >= 23) {
                    alarmManager.setExactAndAllowWhileIdle(2, SystemClock.elapsedRealtime() + 20000, broadcast);
                    if (!z4) {
                        return;
                    }
                }
                if (VERSION.SDK_INT >= 19) {
                    alarmManager.setExact(2, SystemClock.elapsedRealtime() + 20000, broadcast);
                    if (!z4) {
                        return;
                    }
                }
                alarmManager.set(2, SystemClock.elapsedRealtime() + 20000, broadcast);
            }
        }
    }

    public static void s() {
        Editor edit = App.z().getSharedPreferences(z[48], 0).edit();
        s = null;
        edit.remove(z[49]);
        if (!edit.commit()) {
            Log.e(z[50]);
        }
    }

    public static void a(long j, String str) {
        if (str != null && j > 0) {
            i6 i6Var = (i6) j().get(str);
            if (i6Var != null) {
                i6Var.f = j;
                w().b(str, i6Var.f);
                A();
            }
        }
    }

    private static i_ w() {
        if (i == null) {
            i = i_.a(App.z());
        }
        return i;
    }

    private static boolean f(String str) {
        b = str;
        return b(z[44], z[43], str);
    }

    private static Map j() {
        boolean z = DialogToastActivity.f;
        if (j == null) {
            j = new LinkedHashMap();
            for (i6 i6Var : w().a()) {
                j.put(i6Var.c, i6Var);
                if (z) {
                    break;
                }
            }
        }
        return j;
    }

    private static boolean a(String str, String str2, boolean z) {
        Editor edit = App.z().getSharedPreferences(str, 0).edit();
        edit.putBoolean(str2, z);
        return edit.commit();
    }

    public static void y() {
        w = true;
        A();
    }

    public static void a(Context context) {
        File file = new File(App.a3, z[33]);
        if (file.exists()) {
            try {
                if (App.r(new Scanner(file).nextLine()) == null) {
                    App.b(context, z[34], 1);
                    return;
                }
                return;
            } catch (Exception e) {
                throw e;
            } catch (Exception e2) {
                try {
                    App.b(context, z[32], 1);
                    if (!DialogToastActivity.f) {
                        return;
                    }
                } catch (Exception e3) {
                    throw e3;
                }
            }
        }
        App.b(context, z[35], 1);
    }

    static boolean f(String str, String str2) {
        return c(str, str2);
    }

    public static boolean i() {
        return s != null;
    }

    public static String u() {
        return z[47] + Integer.toHexString(y.getAndIncrement());
    }

    public static boolean d(String str) {
        return b != null && b.equals(str);
    }

    static i_ r() {
        return w();
    }

    public static boolean h(String str) {
        return str != null && str.equals(q);
    }

    public static String v() {
        byte[] bArr = new byte[32];
        u.nextBytes(bArr);
        return Base64.encodeToString(bArr, 2);
    }

    public static void b(String str, int i) {
        if (q == null || q.equals(str)) {
            if (!n()) {
                Log.e(z[46]);
            }
            a(i);
        }
    }

    public static String b(String str, String str2) {
        i6 k = k(str);
        if (k == null || !k.i.equals(str2)) {
            return null;
        }
        return k.h;
    }

    public static void m(String str) {
        if (d(str)) {
            l();
        }
        j().remove(str);
        w().a(str);
    }

    private static boolean b(String str, String str2, String str3) {
        Editor edit = App.z().getSharedPreferences(str, 0).edit();
        edit.putString(str2, str3);
        return edit.commit();
    }

    static boolean b() {
        return n();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean c(boolean r8) {
        /*
        r7 = 0;
        r6 = 0;
        r0 = com.whatsapp.App.z();
        r1 = z;
        r2 = 39;
        r1 = r1[r2];
        r0 = r0.getSharedPreferences(r1, r7);
        r1 = r0.edit();
        q = r6;
        r0 = z;
        r2 = 36;
        r0 = r0[r2];
        r1.remove(r0);
        if (r8 == 0) goto L_0x0052;
    L_0x0021:
        r0 = b;
        m(r0);
        o = r6;
        n = r6;
        k = r6;
        s = r6;
        b = r6;
        r0 = z;
        r2 = 37;
        r0 = r0[r2];
        r1.remove(r0);
        r0 = z;
        r2 = 40;
        r0 = r0[r2];
        r1.remove(r0);
        r0 = z;
        r2 = 38;
        r0 = r0[r2];
        r1.remove(r0);
        A();
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x0079;
    L_0x0052:
        r0 = j();
        r2 = b;
        r0 = r0.get(r2);
        r0 = (com.whatsapp.i6) r0;
        if (r0 == 0) goto L_0x0079;
    L_0x0060:
        r2 = r0.g;
        if (r2 == 0) goto L_0x0079;
    L_0x0064:
        r2 = java.lang.System.currentTimeMillis();
        r4 = 600000; // 0x927c0 float:8.40779E-40 double:2.964394E-318;
        r2 = r2 + r4;
        r0.k = r2;
        r2 = w();
        r3 = b;
        r4 = r0.k;
        r2.a(r3, r4);
    L_0x0079:
        r0 = m;
        r0.clear();
        a = r6;
        c = r7;
        C();
        r0 = r1.commit();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wn.c(boolean):boolean");
    }

    private static boolean c(String str, String str2) {
        Editor edit = App.z().getSharedPreferences(str, 0).edit();
        edit.remove(str2);
        return edit.commit();
    }

    private static i6 k(String str) {
        return a((i6) j().get(str));
    }

    public static void a(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        boolean z2 = false;
        if (!d(str3)) {
            y.getAndSet(0);
            Log.i(z[16]);
            e = null;
            l();
        }
        if (!d(str3)) {
            z2 = true;
        }
        if (!a(z2)) {
            Log.e(z[17]);
        }
        if (!g(str)) {
            Log.e(z[19]);
        }
        if (!e(str4)) {
            Log.e(z[15]);
        }
        if (!(str2 == null || b(str2))) {
            Log.e(z[13]);
        }
        if (!(str3 == null || f(str3))) {
            Log.e(z[14]);
        }
        if (!a(str3, str2, str4, str5, str6, z)) {
            Log.e(z[18]);
        }
    }

    static boolean t() {
        return w;
    }

    private static boolean a(String str, String str2, String str3, String str4, String str5, boolean z) {
        if (str != null) {
            i6 i6Var;
            Log.i(z[6] + str + ' ' + str3 + ' ' + str4 + ' ' + str5);
            i6 i6Var2 = (i6) j().get(str);
            if (i6Var2 == null) {
                i6Var2 = new i6(str, str2, str3, str4, str5, z);
                j().put(str, i6Var2);
                if (!DialogToastActivity.f) {
                    i6Var = i6Var2;
                    i6Var.f = System.currentTimeMillis();
                    w().a(str, str2, str3, str4, str5, z);
                    A();
                    b(i6Var);
                }
            }
            i6Var2.h = str2;
            i6Var2.i = str3;
            i6Var2.d = str4;
            i6Var2.b = str5;
            i6Var2.g = z;
            i6Var2.k = 0;
            i6Var = i6Var2;
            i6Var.f = System.currentTimeMillis();
            w().a(str, str2, str3, str4, str5, z);
            A();
            b(i6Var);
        }
        return true;
    }

    public static void D() {
        if (q()) {
            PendingIntent broadcast = PendingIntent.getBroadcast(App.z(), 0, new Intent(z[27]).setPackage(z[25]), 536870912);
            if (broadcast != null) {
                ((AlarmManager) App.z().getSystemService(z[26])).cancel(broadcast);
                broadcast.cancel();
            }
        }
    }

    public static String a(String str, byte[] bArr) {
        e a = bx.a();
        try {
            Object b = ag.a(3).b(bx.a(bx.a(ft.b(new byte[]{(byte) 5}, Base64.decode(str, 0)), 0), a.a()), null, 80);
            Object obj = new byte[32];
            System.arraycopy(b, 0, obj, 0, 32);
            Object obj2 = new byte[32];
            System.arraycopy(b, 32, obj2, 0, 32);
            Object obj3 = new byte[16];
            System.arraycopy(b, 64, obj3, 0, 16);
            byte[] a2 = ft.a(obj, obj3, bArr);
            byte[] b2 = ((b8) a.b()).b();
            byte[] a3 = ft.a(obj2, ft.b(b2, a2));
            if (a3 != null && a2 != null) {
                return Base64.encodeToString(ft.b(b2, ft.b(a3, a2)), 2);
            }
            try {
                boolean z;
                StringBuilder append = new StringBuilder().append(z[12]);
                if (a2 == null) {
                    z = true;
                } else {
                    z = false;
                }
                try {
                    StringBuilder append2 = append.append(z).append(z[11]);
                    if (a3 == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Log.e(append2.append(z).toString());
                    return null;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Exception e22) {
            Log.e(z[10] + e22);
            return null;
        }
    }

    public static uj i(String str) {
        String str2 = null;
        String[] split = str.split(",");
        if (split.length < 2) {
            Log.e(z[7]);
            return null;
        }
        String str3 = split[0];
        String str4 = split[1];
        if (split.length >= 3) {
            str2 = split[2];
        }
        return new uj(str3, str4, str2);
    }

    public static void k() {
        App.z().getSharedPreferences(z[45], 0).edit().clear().commit();
        j().clear();
        w().b();
        l();
        o = null;
        n = null;
        k = null;
        s = null;
        b = null;
        A();
    }

    private static boolean a(boolean z) {
        f = z;
        return a(z[9], z[8], z);
    }

    private static void l() {
        l.clear();
        h.b();
    }

    static void c() {
        B();
    }

    public static boolean z() {
        return !j().isEmpty();
    }

    public static void e(String str, String str2) {
        boolean z;
        if (str2 == null || !str2.equals(q)) {
            z = false;
        } else {
            z = true;
        }
        App.a(str, str2, z);
    }

    public static void a(String str, int i) {
        l.put(str, Integer.valueOf(i));
        h.a();
    }

    public static boolean j(String str) {
        return j().containsKey(str);
    }

    public static boolean q() {
        return q != null;
    }

    public static String a(String str, String str2, String str3) {
        i6 i6Var = (i6) j().get(str);
        if (i6Var == null) {
            return null;
        }
        Object obj = new byte[32];
        System.arraycopy(Base64.decode(i6Var.h, 0), 32, obj, 0, 32);
        byte[] a = ft.a(obj, Base64.decode(str3, 0));
        if (a == null) {
            return null;
        }
        return Base64.encodeToString(a, 2).equals(str2) ? i6Var.h : null;
    }

    private static boolean g(String str) {
        q = str;
        return b(z[21], z[20], str);
    }

    private static void b(i6 i6Var) {
        di diVar = new di(App.z());
        Location a = diVar.a(2);
        if (a != null && a.getTime() + 120000 > System.currentTimeMillis()) {
            Log.i(z[30] + a.getTime());
            bq.a(new a5(i6Var, a));
            if (!DialogToastActivity.f) {
                return;
            }
        }
        LocationListener tsVar = new ts(i6Var, diVar);
        diVar.a(2, 0, 0.0f, tsVar);
        App.p.M().postDelayed(new a95(diVar, tsVar), 60000);
    }

    public static boolean a(String str) {
        return str != null && str.equals(b) && a();
    }

    public static String a(String str, String str2, String str3, String str4) {
        if (a != null && a.a(str, str2, str3, str4)) {
            return a.a;
        }
        String v = v();
        a = new ala(v, str, str2, str3, str4);
        return v;
    }

    public static void x() {
        if (!n()) {
            Log.e(z[31]);
        }
    }

    public static boolean a() {
        return q() && w;
    }

    static boolean d(boolean z) {
        c = z;
        return z;
    }

    static void g() {
        A();
    }

    @TargetApi(18)
    private static void B() {
        if (r) {
            v.requestTriggerSensor(p, g);
        }
    }

    public static ala a(String str, String str2) {
        ala com_whatsapp_ala = a;
        if (com_whatsapp_ala == null || !com_whatsapp_ala.a(str, str2)) {
            return null;
        }
        a = null;
        return com_whatsapp_ala;
    }

    private static boolean a(String str, boolean z) {
        o = Base64.decode(str, 0);
        if (o.length == 64) {
            n = new byte[32];
            k = new byte[32];
            System.arraycopy(o, 0, n, 0, 32);
            System.arraycopy(o, 32, k, 0, 32);
        }
        if (!z || b(z[28], z[29], str)) {
            return true;
        }
        return false;
    }

    public static void a(nh nhVar) {
        if (!x.contains(nhVar)) {
            x.add(nhVar);
        }
    }

    public static List e() {
        boolean z = DialogToastActivity.f;
        Iterator it = new ArrayList(j().values()).iterator();
        while (it.hasNext()) {
            a((i6) it.next());
            if (z) {
                break;
            }
        }
        return new ArrayList(j().values());
    }

    public static void l(String str) {
        if (!a(str, false)) {
            Log.e(z[24]);
        }
    }

    public static void n(String str) {
        if (j(str)) {
            m(str);
            A();
        }
    }

    private static boolean b(String str) {
        return a(str, true);
    }

    public static void m() {
        if (m.size() > 0) {
            bq.a(new in());
        }
    }

    static boolean c(String str, String str2, String str3) {
        return b(str, str2, str3);
    }

    public static azv a(int i, boolean z, boolean z2) {
        azv com_whatsapp_azv = new azv(i, z, z2, null);
        if (com_whatsapp_azv.equals((azv) d.getAndSet(com_whatsapp_azv))) {
            return null;
        }
        return com_whatsapp_azv;
    }

    private static void A() {
        boolean z = DialogToastActivity.f;
        for (nh a : x) {
            a.a();
            if (z) {
                return;
            }
        }
    }

    public static void b(boolean z) {
        if (!c(z)) {
            Log.e(z[42]);
        }
    }

    public static void c(String str) {
        if (str != null && !str.equals(e)) {
            e = str;
            l.clear();
        }
    }

    private static boolean n() {
        return c(false);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static {
        /*
        r1 = -1;
        r3 = 1;
        r4 = 32;
        r2 = 0;
        r9 = 0;
        r0 = 52;
        r5 = new java.lang.String[r0];
        r0 = "|\nsK\u0006g\u0015";
        r6 = r2;
        r7 = r5;
        r8 = r5;
        r5 = r0;
        r0 = r1;
    L_0x0012:
        r5 = z(r5);
        r5 = z(r5);
        switch(r0) {
            case 0: goto L_0x0027;
            case 1: goto L_0x0032;
            case 2: goto L_0x003b;
            case 3: goto L_0x0044;
            case 4: goto L_0x004d;
            case 5: goto L_0x0056;
            case 6: goto L_0x005f;
            case 7: goto L_0x0069;
            case 8: goto L_0x0074;
            case 9: goto L_0x007f;
            case 10: goto L_0x008a;
            case 11: goto L_0x0096;
            case 12: goto L_0x00a2;
            case 13: goto L_0x00ae;
            case 14: goto L_0x00ba;
            case 15: goto L_0x00c6;
            case 16: goto L_0x00d2;
            case 17: goto L_0x00de;
            case 18: goto L_0x00ea;
            case 19: goto L_0x00f6;
            case 20: goto L_0x0102;
            case 21: goto L_0x010e;
            case 22: goto L_0x011a;
            case 23: goto L_0x0126;
            case 24: goto L_0x0132;
            case 25: goto L_0x013e;
            case 26: goto L_0x014a;
            case 27: goto L_0x0156;
            case 28: goto L_0x0162;
            case 29: goto L_0x016e;
            case 30: goto L_0x017a;
            case 31: goto L_0x0185;
            case 32: goto L_0x0192;
            case 33: goto L_0x019e;
            case 34: goto L_0x01aa;
            case 35: goto L_0x01b6;
            case 36: goto L_0x01c2;
            case 37: goto L_0x01ce;
            case 38: goto L_0x01da;
            case 39: goto L_0x01e6;
            case 40: goto L_0x01f2;
            case 41: goto L_0x01fe;
            case 42: goto L_0x020a;
            case 43: goto L_0x0216;
            case 44: goto L_0x0222;
            case 45: goto L_0x022e;
            case 46: goto L_0x023a;
            case 47: goto L_0x0246;
            case 48: goto L_0x0252;
            case 49: goto L_0x025e;
            case 50: goto L_0x026a;
            default: goto L_0x001d;
        };
    L_0x001d:
        r7[r6] = r5;
        r0 = "|\u0000Ti\u0013a\u0016BC\u0013";
        r5 = r0;
        r6 = r3;
        r7 = r8;
        r0 = r2;
        goto L_0x0012;
    L_0x0027:
        r7[r6] = r5;
        r5 = 2;
        r0 = "q\nN\n\u0001z\u0004WW\u0017b\u0015";
        r6 = r5;
        r7 = r8;
        r5 = r0;
        r0 = r3;
        goto L_0x0012;
    L_0x0032:
        r7[r6] = r5;
        r6 = 3;
        r5 = "{\u0016bJ\u0012`\nJ@!w\u0004Qv\u0013t\u0017FW\u001e";
        r0 = 2;
        r7 = r8;
        goto L_0x0012;
    L_0x003b:
        r7[r6] = r5;
        r6 = 4;
        r5 = "q\nN\n\u0001z\u0004WW\u0017b\u0015\rE\u001as\u0017N\n!W'|v3\\*wm0K";
        r0 = 3;
        r7 = r8;
        goto L_0x0012;
    L_0x0044:
        r7[r6] = r5;
        r6 = 5;
        r5 = "s\tBV\u001b";
        r0 = 4;
        r7 = r8;
        goto L_0x0012;
    L_0x004d:
        r7[r6] = r5;
        r6 = 6;
        r5 = "c\u0017PA\u0005a\fLJYa\u0000W{\u0014`\nTW\u0013`E";
        r0 = 5;
        r7 = r8;
        goto L_0x0012;
    L_0x0056:
        r7[r6] = r5;
        r6 = 7;
        r5 = "c\u0017PA\u0005a\fLJYb\u0017LG\u0013a\u0016rvYw\u0017QK\u0004=\fMR\u0017~\fG{\u0015}\u0001F\u0004\u0006s\u0017WW";
        r0 = 6;
        r7 = r8;
        goto L_0x0012;
    L_0x005f:
        r7[r6] = r5;
        r6 = 8;
        r5 = "p\u0017LS\u0005w\u0017|G\u001es\u000bDA\u0012";
        r0 = 7;
        r7 = r8;
        goto L_0x0012;
    L_0x0069:
        r7[r6] = r5;
        r6 = 9;
        r5 = "c\u0017|@\u0017f\u0004";
        r0 = 8;
        r7 = r8;
        goto L_0x0012;
    L_0x0074:
        r7[r6] = r5;
        r6 = 10;
        r5 = "c\u0017PA\u0005a\fLJYw\u000b@V\u000fb\u0011pA\u0015`\u0000W\u000b\u0015g\u0017UAVw\u0017QK\u00042";
        r0 = 9;
        r7 = r8;
        goto L_0x0012;
    L_0x007f:
        r7[r6] = r5;
        r6 = 11;
        r5 = "2\rNE\u0015(E";
        r0 = 10;
        r7 = r8;
        goto L_0x0012;
    L_0x008a:
        r7[r6] = r5;
        r6 = 12;
        r5 = "c\u0017PA\u0005a\fLJYw\u000b@V\u000fb\u0011pA\u0015`\u0000W\u0004\u0010s\fO\u0004\u0018g\tO\u0004\u0013|\u0006\u0019\u0004";
        r0 = 11;
        r7 = r8;
        goto L_0x0012;
    L_0x0096:
        r7[r6] = r5;
        r6 = 13;
        r5 = "c\u0017PA\u0005a\fLJY}\u000brv%k\u000b@\u000b\u0005g\u0006@A\u0005aJ@K\u001b\u007f\fW{\u0010s\fOA\u0012M\u0016FG\u0004w\u0011";
        r0 = 12;
        r7 = r8;
        goto L_0x0012;
    L_0x00a2:
        r7[r6] = r5;
        r6 = 14;
        r5 = "c\u0017PA\u0005a\fLJY}\u000brv%k\u000b@\u000b\u0005g\u0006@A\u0005aJ@K\u001b\u007f\fW{\u0010s\fOA\u0012M\u0006VV\u0004M\u0007QK\u0001a\u0000Q";
        r0 = 13;
        r7 = r8;
        goto L_0x0012;
    L_0x00ae:
        r7[r6] = r5;
        r6 = 15;
        r5 = "c\u0017PA\u0005a\fLJY}\u000brV%k\u000b@\u000b\u0005g\u0006@A\u0005aJ@K\u001b\u007f\fW{\u0010s\fOA\u0012M\u0011LO\u0013|";
        r0 = 14;
        r7 = r8;
        goto L_0x0012;
    L_0x00ba:
        r7[r6] = r5;
        r6 = 16;
        r5 = "c\u0017PA\u0005a\fLJY}\u000brV%k\u000b@\u000b\u0015~\u0000BVVw\u0015LG\u001e2\fGG\u0017q\rF";
        r0 = 15;
        r7 = r8;
        goto L_0x0012;
    L_0x00c6:
        r7[r6] = r5;
        r6 = 17;
        r5 = "c\u0017PA\u0005a\fLJY}\u000brV%k\u000b@\u000b\u0005g\u0006@A\u0005aJ@K\u001b\u007f\fW{\u0010s\fOA\u0012M\u0007QK\u0001a\u0000Q{\u0015z\u0004MC\u0013";
        r0 = 16;
        r7 = r8;
        goto L_0x0012;
    L_0x00d2:
        r7[r6] = r5;
        r6 = 18;
        r5 = "c\u0017PA\u0005a\fLJY}\u000brv%k\u000b@\u000b\u0005g\u0006@A\u0005aJ@K\u001b\u007f\fW{\u0010s\fOA\u0012M\u0007QK\u0001a\u0000Q{\u001f|\u0003L";
        r0 = 17;
        r7 = r8;
        goto L_0x0012;
    L_0x00de:
        r7[r6] = r5;
        r6 = 19;
        r5 = "c\u0017PA\u0005a\fLJY}\u000brV%k\u000b@\u000b\u0005g\u0006@A\u0005aJ@K\u001b\u007f\fW{\u0010s\fOA\u0012M\u0017FB";
        r0 = 18;
        r7 = r8;
        goto L_0x0012;
    L_0x00ea:
        r7[r6] = r5;
        r6 = 20;
        r5 = "`\u0000E";
        r0 = 19;
        r7 = r8;
        goto L_0x0012;
    L_0x00f6:
        r7[r6] = r5;
        r6 = 21;
        r5 = "c\u0017|@\u0017f\u0004";
        r0 = 20;
        r7 = r8;
        goto L_0x0012;
    L_0x0102:
        r7[r6] = r5;
        r6 = 22;
        r5 = "c\u0017|@\u0017f\u0004";
        r0 = 21;
        r7 = r8;
        goto L_0x0012;
    L_0x010e:
        r7[r6] = r5;
        r6 = 23;
        r5 = "f\nHA\u0018";
        r0 = 22;
        r7 = r8;
        goto L_0x0012;
    L_0x011a:
        r7[r6] = r5;
        r6 = 24;
        r5 = "c\u0017PA\u0005a\fLJYp\u0000EK\u0004w4qw\u000f|\u0006\fG\u0019\u007f\bJP)t\u0004JH\u0013v:PA\u0015`\u0000W";
        r0 = 23;
        r7 = r8;
        goto L_0x0012;
    L_0x0126:
        r7[r6] = r5;
        r6 = 25;
        r5 = "q\nN\n\u0001z\u0004WW\u0017b\u0015";
        r0 = 24;
        r7 = r8;
        goto L_0x0012;
    L_0x0132:
        r7[r6] = r5;
        r6 = 26;
        r5 = "s\tBV\u001b";
        r0 = 25;
        r7 = r8;
        goto L_0x0012;
    L_0x013e:
        r7[r6] = r5;
        r6 = 27;
        r5 = "q\nN\n\u0001z\u0004WW\u0017b\u0015\rE\u001as\u0017N\n!W'|v3\\*wm0K";
        r0 = 26;
        r7 = r8;
        goto L_0x0012;
    L_0x014a:
        r7[r6] = r5;
        r6 = 28;
        r5 = "c\u0017|@\u0017f\u0004";
        r0 = 27;
        r7 = r8;
        goto L_0x0012;
    L_0x0156:
        r7[r6] = r5;
        r6 = 29;
        r5 = "y\u0000Z";
        r0 = 28;
        r7 = r8;
        goto L_0x0012;
    L_0x0162:
        r7[r6] = r5;
        r6 = 30;
        r5 = "c\u0017PA\u0005a\fLJY~\n@E\u0002{\nM\u000b\u001as\u0016W\u0004";
        r0 = 29;
        r7 = r8;
        goto L_0x0012;
    L_0x016e:
        r7[r6] = r5;
        r6 = 31;
        r5 = "c\u0017PA\u0005a\fLJY`\u0000PA\u0002A\u0011BP\u0013=\u0000QV\u0019`J@K\u001b\u007f\fW{\u0010s\fOA\u0012";
        r0 = 30;
        r7 = r8;
        goto L_0x0012;
    L_0x017a:
        r7[r6] = r5;
        r5 = "g\u000bBF\u001awEWKV`\u0000B@VS\u0010WK\u001bs\u0011JK\u0018C7`K\u0012wKW\\\u0002";
        r0 = 31;
        r6 = r4;
        r7 = r8;
        goto L_0x0012;
    L_0x0185:
        r7[r6] = r5;
        r5 = 33;
        r0 = "S\u0010WK\u001bs\u0011JK\u0018C7`K\u0012wKW\\\u0002";
        r6 = r5;
        r7 = r8;
        r5 = r0;
        r0 = r4;
        goto L_0x0012;
    L_0x0192:
        r7[r6] = r5;
        r6 = 34;
        r5 = "{\u000bUE\u001a{\u0001\u0003u$Q\nGAV{\u000b\u0003e\u0003f\nNE\u0002{\nMu$Q\nGAXf\u001dW";
        r0 = 33;
        r7 = r8;
        goto L_0x0012;
    L_0x019e:
        r7[r6] = r5;
        r6 = 35;
        r5 = "S\u0010WK\u001bs\u0011JK\u0018C7`K\u0012wKW\\\u00022\fP\u0004\u001b{\u0016PM\u0018u";
        r0 = 34;
        r7 = r8;
        goto L_0x0012;
    L_0x01aa:
        r7[r6] = r5;
        r6 = 36;
        r5 = "`\u0000E";
        r0 = 35;
        r7 = r8;
        goto L_0x0012;
    L_0x01b6:
        r7[r6] = r5;
        r6 = 37;
        r5 = "y\u0000Z";
        r0 = 36;
        r7 = r8;
        goto L_0x0012;
    L_0x01c2:
        r7[r6] = r5;
        r6 = 38;
        r5 = "p\u0017LS\u0005w\u0017";
        r0 = 37;
        r7 = r8;
        goto L_0x0012;
    L_0x01ce:
        r7[r6] = r5;
        r6 = 39;
        r5 = "c\u0017|@\u0017f\u0004";
        r0 = 38;
        r7 = r8;
        goto L_0x0012;
    L_0x01da:
        r7[r6] = r5;
        r6 = 40;
        r5 = "f\nHA\u0018";
        r0 = 39;
        r7 = r8;
        goto L_0x0012;
    L_0x01e6:
        r7[r6] = r5;
        r6 = 41;
        r5 = "e\u0000Aw\u0013a\u0016JK\u0018=\u0002FP#|\u0000[T\u001f`\u0000Gw\u0013a\u0016JK\u00182\u0007QK\u0001a\u0000Q\u0004\u0002{\bF@V}\u0010W\u0004";
        r0 = 40;
        r7 = r8;
        goto L_0x0012;
    L_0x01f2:
        r7[r6] = r5;
        r6 = 42;
        r5 = "c\u0017PA\u0005a\fLJY}\u000brV\"w\u0017NM\u0018s\u0011F\u000b\u0013`\u0017LVYq\nNI\u001ff:EE\u001f~\u0000G";
        r0 = 41;
        r7 = r8;
        goto L_0x0012;
    L_0x01fe:
        r7[r6] = r5;
        r6 = 43;
        r5 = "p\u0017LS\u0005w\u0017";
        r0 = 42;
        r7 = r8;
        goto L_0x0012;
    L_0x020a:
        r7[r6] = r5;
        r6 = 44;
        r5 = "c\u0017|@\u0017f\u0004";
        r0 = 43;
        r7 = r8;
        goto L_0x0012;
    L_0x0216:
        r7[r6] = r5;
        r6 = 45;
        r5 = "c\u0017|@\u0017f\u0004";
        r0 = 44;
        r7 = r8;
        goto L_0x0012;
    L_0x0222:
        r7[r6] = r5;
        r6 = 46;
        r5 = "c\u0017PA\u0005a\fLJY}\u000brV%k\u000b@\u000b\u0013`\u0017LVYq\nNI\u001ff:EE\u001f~\u0000G";
        r0 = 45;
        r7 = r8;
        goto L_0x0012;
    L_0x022e:
        r7[r6] = r5;
        r6 = 47;
        r5 = "<H\u000e";
        r0 = 46;
        r7 = r8;
        goto L_0x0012;
    L_0x023a:
        r7[r6] = r5;
        r6 = 48;
        r5 = "c\u0017|@\u0017f\u0004";
        r0 = 47;
        r7 = r8;
        goto L_0x0012;
    L_0x0246:
        r7[r6] = r5;
        r6 = 49;
        r5 = "f\nHA\u0018";
        r0 = 48;
        r7 = r8;
        goto L_0x0012;
    L_0x0252:
        r7[r6] = r5;
        r6 = 50;
        r5 = "c\u0017PA\u0005a\fLJYq\tFE\u0004^\nDM\u0018F\nHA\u0018=\u0000QV\u0019`J@K\u001b\u007f\fW{\u0010s\fOA\u0012";
        r0 = 49;
        r7 = r8;
        goto L_0x0012;
    L_0x025e:
        r7[r6] = r5;
        r6 = 51;
        r5 = "E\u0000Ae\u0015f\fLJ?v&BG\u001ew";
        r0 = 50;
        r7 = r8;
        goto L_0x0012;
    L_0x026a:
        r7[r6] = r5;
        z = r8;
        r0 = new java.security.SecureRandom;
        r0.<init>();
        u = r0;
        r0 = new java.util.concurrent.atomic.AtomicInteger;
        r0.<init>();
        y = r0;
        r0 = new java.util.concurrent.atomic.AtomicReference;
        r0.<init>();
        d = r0;
        w = r2;
        q = r9;
        o = r9;
        n = r9;
        k = r9;
        s = r9;
        b = r9;
        e = r9;
        r0 = new com.whatsapp.adx;
        r0.<init>();
        r0 = java.util.Collections.synchronizedMap(r0);
        l = r0;
        r0 = new com.whatsapp.a_s;
        r0.<init>();
        h = r0;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r0 = java.util.Collections.synchronizedList(r0);
        m = r0;
        a = r9;
        r0 = com.whatsapp.App.z();
        r4 = "c\u0017|@\u0017f\u0004";
        r4 = z(r4);
        r4 = z(r4);
        r6 = r0.getSharedPreferences(r4, r2);
        r0 = "`\u0000E";
        r4 = r0;
        r5 = r6;
        r0 = r1;
    L_0x02cb:
        r4 = z(r4);
        r4 = z(r4);
        switch(r0) {
            case 0: goto L_0x02e3;
            default: goto L_0x02d6;
        };
    L_0x02d6:
        r0 = r5.getString(r4, r9);
        q = r0;
        r0 = "y\u0000Z";
        r4 = r0;
        r5 = r6;
        r0 = r2;
        goto L_0x02cb;
    L_0x02e3:
        r0 = r5.getString(r4, r9);
        if (r0 != 0) goto L_0x03af;
    L_0x02e9:
        r0 = r9;
    L_0x02ea:
        o = r0;	 Catch:{ Exception -> 0x03b5 }
        r0 = 0;
        n = r0;	 Catch:{ Exception -> 0x03b5 }
        r0 = 0;
        k = r0;	 Catch:{ Exception -> 0x03b5 }
        r0 = o;	 Catch:{ Exception -> 0x03b5 }
        if (r0 == 0) goto L_0x0319;
    L_0x02f6:
        r0 = 32;
        r0 = new byte[r0];	 Catch:{ Exception -> 0x03b5 }
        n = r0;	 Catch:{ Exception -> 0x03b5 }
        r0 = 32;
        r0 = new byte[r0];	 Catch:{ Exception -> 0x03b5 }
        k = r0;	 Catch:{ Exception -> 0x03b5 }
        r0 = o;	 Catch:{ Exception -> 0x03b5 }
        r4 = 0;
        r5 = n;	 Catch:{ Exception -> 0x03b5 }
        r7 = 0;
        r8 = 32;
        java.lang.System.arraycopy(r0, r4, r5, r7, r8);	 Catch:{ Exception -> 0x03b5 }
        r0 = o;	 Catch:{ Exception -> 0x03b5 }
        r4 = 32;
        r5 = k;	 Catch:{ Exception -> 0x03b5 }
        r7 = 0;
        r8 = 32;
        java.lang.System.arraycopy(r0, r4, r5, r7, r8);	 Catch:{ Exception -> 0x03b5 }
    L_0x0319:
        r0 = "f\nHA\u0018";
        r4 = r6;
    L_0x031d:
        r0 = z(r0);
        r0 = z(r0);
        switch(r1) {
            case 0: goto L_0x03b7;
            case 1: goto L_0x03c4;
            case 2: goto L_0x0334;
            default: goto L_0x0328;
        };
    L_0x0328:
        r0 = r4.getString(r0, r9);
        s = r0;
        r0 = "p\u0017LS\u0005w\u0017";
        r1 = r2;
        r4 = r6;
        goto L_0x031d;
    L_0x0334:
        r0 = r4.getBoolean(r0, r2);
        f = r0;
        r0 = "s\u000bGV\u0019{\u0001\rL\u0017`\u0001TE\u0004wKwV\u001fu\u0002FV3d\u0000MP:{\u0016WA\u0018w\u0017";
        r0 = z(r0);
        r0 = z(r0);
        java.lang.Class.forName(r0);	 Catch:{ Exception -> 0x03d1 }
        r0 = r3;
    L_0x0349:
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x03d5 }
        r4 = 18;
        if (r1 < r4) goto L_0x037d;
    L_0x034f:
        if (r0 == 0) goto L_0x037d;
    L_0x0351:
        r0 = com.whatsapp.App.z();	 Catch:{ Exception -> 0x03d9 }
        r1 = "a\u0000MW\u0019`";
        r1 = z(r1);
        r1 = z(r1);
        r0 = r0.getSystemService(r1);	 Catch:{ Exception -> 0x03d9 }
        r0 = (android.hardware.SensorManager) r0;	 Catch:{ Exception -> 0x03d9 }
        v = r0;	 Catch:{ Exception -> 0x03d9 }
        r0 = v;	 Catch:{ Exception -> 0x03d9 }
        if (r0 == 0) goto L_0x03db;
    L_0x036c:
        r0 = v;	 Catch:{ Exception -> 0x03d9 }
        r1 = 17;
        r0 = r0.getDefaultSensor(r1);	 Catch:{ Exception -> 0x03d9 }
    L_0x0374:
        g = r0;
        r0 = new com.whatsapp.aq9;
        r0.<init>();
        p = r0;
    L_0x037d:
        r0 = v;	 Catch:{ Exception -> 0x03dd }
        if (r0 == 0) goto L_0x03e1;
    L_0x0381:
        r0 = g;	 Catch:{ Exception -> 0x03df }
        if (r0 == 0) goto L_0x03e1;
    L_0x0385:
        r = r3;	 Catch:{ Exception -> 0x03e3 }
        r0 = new java.io.File;	 Catch:{ Exception -> 0x03e3 }
        r1 = com.whatsapp.App.z();	 Catch:{ Exception -> 0x03e3 }
        r1 = r1.getCacheDir();	 Catch:{ Exception -> 0x03e3 }
        r2 = z;	 Catch:{ Exception -> 0x03e3 }
        r3 = 51;
        r2 = r2[r3];	 Catch:{ Exception -> 0x03e3 }
        r0.<init>(r1, r2);	 Catch:{ Exception -> 0x03e3 }
        t = r0;	 Catch:{ Exception -> 0x03e3 }
        r0 = t;	 Catch:{ Exception -> 0x03e3 }
        r0 = r0.exists();	 Catch:{ Exception -> 0x03e3 }
        if (r0 == 0) goto L_0x03a7;
    L_0x03a4:
        d();	 Catch:{ Exception -> 0x03e3 }
    L_0x03a7:
        r0 = new java.util.ArrayList;
        r0.<init>();
        x = r0;
        return;
    L_0x03af:
        r0 = android.backport.util.Base64.decode(r0, r2);
        goto L_0x02ea;
    L_0x03b5:
        r0 = move-exception;
        throw r0;
    L_0x03b7:
        r0 = r4.getString(r0, r9);
        b = r0;
        r0 = "w\u0015LG\u001e";
        r1 = r3;
        r4 = r6;
        goto L_0x031d;
    L_0x03c4:
        r0 = r4.getString(r0, r9);
        e = r0;
        r0 = "p\u0017LS\u0005w\u0017|G\u001es\u000bDA\u0012";
        r1 = 2;
        r4 = r6;
        goto L_0x031d;
    L_0x03d1:
        r0 = move-exception;
        r0 = r2;
        goto L_0x0349;
    L_0x03d5:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x03d7 }
    L_0x03d7:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x03d9 }
    L_0x03d9:
        r0 = move-exception;
        throw r0;
    L_0x03db:
        r0 = r9;
        goto L_0x0374;
    L_0x03dd:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x03df }
    L_0x03df:
        r0 = move-exception;
        throw r0;
    L_0x03e1:
        r3 = r2;
        goto L_0x0385;
    L_0x03e3:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wn.<clinit>():void");
    }

    public static void p() {
        if (q()) {
            c = true;
            B();
        }
    }

    public static void b(nh nhVar) {
        x.remove(nhVar);
    }

    private static void a(int i) {
        boolean z = DialogToastActivity.f;
        for (nh a : x) {
            a.a(i);
            if (z) {
                return;
            }
        }
    }

    static File o() {
        return t;
    }

    private static boolean e(String str) {
        s = str;
        return b(z[22], z[23], str);
    }

    public static boolean h() {
        return q() && c;
    }

    private static i6 a(i6 i6Var) {
        if (i6Var == null) {
            return null;
        }
        if (!i6Var.g || i6Var.k == 0 || i6Var.k >= System.currentTimeMillis()) {
            return i6Var;
        }
        Log.i(z[41] + i6Var.c);
        m(i6Var.c);
        A();
        return null;
    }

    @TargetApi(18)
    private static void C() {
        if (r) {
            v.cancelTriggerSensor(p, g);
        }
    }
}
