package com.whatsapp.util;

import android.content.Context;
import android.text.format.Time;
import com.whatsapp.App;
import com.whatsapp.aam;
import com.whatsapp.aqu;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class cs {
    private static final String[] z;

    static {
        String[] strArr = new String[15];
        String str = "\u0003\u0010z,Z\u0003";
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
                        i3 = 35;
                        break;
                    case at.g /*1*/:
                        i3 = 113;
                        break;
                    case at.i /*2*/:
                        i3 = 90;
                        break;
                    case at.o /*3*/:
                        i3 = 64;
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
                    str = "F\u001f";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "G\u0014";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "F\u0002";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "F\u0002";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "f4\u001f";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "F\u0002";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u000b*\u0004\u001cKX060SB\f}\u001dG\u000bV\u0001\u001cKX060SB\f\u0007k\u001c\nXp9\u0010\u000b*\u0004\u001cKX060SB\f}\u001dG\u000bV\u0001\u001cKX060SB\f\u0007k\u001c\nXp";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u000b*\u0004\u001cKX060SB\f}\u001dG\u000bV\u0001\u001cKX060SB\f\u0007k\u001c\nXp9\u0010\u000b*\u0004\u001cKX060SB\f}\u001dG\u000bV\u0001\u001cKX060SB\f\u0007k\u001c\nXp";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "g\u0010.%\u001bP\u0005()UDQ}";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "n<\u0017`_G]z9BZ\b";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "Z\b#9\u0016n<w$_";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u0004Q4/O\u0003\u00184`]L\u00037!O\u0003\u001e<`\u0007n<\u0017`_G]z9BZ\bd";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "Z\b#9vn\u0015>";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0003\u0010z,ZPQ";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static String o(Context context, long j) {
        if (a(j)) {
            return c(context, j);
        }
        return k(context, j).toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.CharSequence k(android.content.Context r9, long r10) {
        /*
        r8 = 1;
        r1 = com.whatsapp.util.Log.h;
        r2 = java.lang.System.currentTimeMillis();
        r2 = c(r2, r10);
        if (r2 != 0) goto L_0x0047;
    L_0x000d:
        r4 = java.lang.System.currentTimeMillis();
        r4 = r4 - r10;
        r6 = 60000; // 0xea60 float:8.4078E-41 double:2.9644E-319;
        r4 = r4 / r6;
        r3 = (int) r4;
        if (r3 >= r8) goto L_0x0022;
    L_0x0019:
        r0 = 2131231389; // 0x7f08029d float:1.8078858E38 double:1.0529682126E-314;
        r0 = r9.getString(r0);
        if (r1 == 0) goto L_0x0045;
    L_0x0022:
        r0 = 60;
        if (r3 >= r0) goto L_0x003e;
    L_0x0026:
        r0 = com.whatsapp.App.az;
        r4 = 2131296287; // 0x7f09001f float:1.8210486E38 double:1.0530002765E-314;
        r0 = r0.a(r4, r3);
        r4 = new java.lang.Object[r8];
        r5 = 0;
        r3 = java.lang.Integer.valueOf(r3);
        r4[r5] = r3;
        r0 = java.lang.String.format(r0, r4);
        if (r1 == 0) goto L_0x0045;
    L_0x003e:
        r0 = 2131232150; // 0x7f080596 float:1.8080401E38 double:1.0529685886E-314;
        r0 = r9.getString(r0);
    L_0x0045:
        if (r1 == 0) goto L_0x0066;
    L_0x0047:
        if (r2 != r8) goto L_0x0052;
    L_0x0049:
        r0 = 2131232299; // 0x7f08062b float:1.8080703E38 double:1.052968662E-314;
        r0 = r9.getString(r0);
        if (r1 == 0) goto L_0x0066;
    L_0x0052:
        r2 = java.lang.System.currentTimeMillis();
        r0 = b(r2, r10);
        if (r0 == 0) goto L_0x0062;
    L_0x005c:
        r0 = e(r9, r10);
        if (r1 == 0) goto L_0x0066;
    L_0x0062:
        r0 = m(r9, r10);
    L_0x0066:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = r1.append(r0);
        r1 = com.whatsapp.aam.b();
        r0 = r0.append(r1);
        r1 = " ";
        r0 = r0.append(r1);
        r1 = c(r9, r10);
        r0 = r0.append(r1);
        r0 = r0.toString();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.cs.k(android.content.Context, long):java.lang.CharSequence");
    }

    private static DateFormat c() {
        return DateFormat.getDateInstance(1, aqu.f());
    }

    public static int c(long j, long j2) {
        Time time = new Time();
        time.set(j);
        int i = (int) (((time.gmtoff * 1000) + j) / 86400000);
        time.set(j2);
        return i - ((int) (((time.gmtoff * 1000) + j2) / 86400000));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.CharSequence d(android.content.Context r7, long r8) {
        /*
        r5 = 1;
        r4 = 0;
        r1 = com.whatsapp.util.Log.h;
        r2 = java.lang.System.currentTimeMillis();
        r0 = c(r2, r8);
        if (r0 != 0) goto L_0x001e;
    L_0x000e:
        r0 = 2131231511; // 0x7f080317 float:1.8079105E38 double:1.052968273E-314;
        r1 = new java.lang.Object[r5];
        r2 = c(r7, r8);
        r1[r4] = r2;
        r0 = r7.getString(r0, r1);
    L_0x001d:
        return r0;
    L_0x001e:
        r2 = -1;
        if (r0 != r2) goto L_0x0031;
    L_0x0021:
        r0 = 2131231512; // 0x7f080318 float:1.8079107E38 double:1.0529682734E-314;
        r1 = new java.lang.Object[r5];
        r2 = c(r7, r8);
        r1[r4] = r2;
        r0 = r7.getString(r0, r1);
        goto L_0x001d;
    L_0x0031:
        r2 = -30;
        if (r0 <= r2) goto L_0x005f;
    L_0x0035:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = e(r7, r8);
        r0 = r0.append(r2);
        r2 = com.whatsapp.aam.b();
        r0 = r0.append(r2);
        r2 = " ";
        r0 = r0.append(r2);
        r2 = c(r7, r8);
        r0 = r0.append(r2);
        r0 = r0.toString();
        if (r1 == 0) goto L_0x0073;
    L_0x005f:
        r2 = java.lang.System.currentTimeMillis();
        r0 = b(r2, r8);
        if (r0 == 0) goto L_0x006f;
    L_0x0069:
        r0 = e(r7, r8);
        if (r1 == 0) goto L_0x0073;
    L_0x006f:
        r0 = m(r7, r8);
    L_0x0073:
        r1 = 2131231510; // 0x7f080316 float:1.8079103E38 double:1.0529682724E-314;
        r2 = new java.lang.Object[r5];
        r2[r4] = r0;
        r0 = r7.getString(r1, r2);
        goto L_0x001d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.cs.d(android.content.Context, long):java.lang.CharSequence");
    }

    public static DateFormat a(Context context) {
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) c();
        simpleDateFormat.applyPattern(simpleDateFormat.toPattern().replaceAll(z[9], ""));
        return simpleDateFormat;
    }

    public static String e(Context context, long j) {
        return b(context).format(new Date(j));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.CharSequence a(android.content.Context r5, long r6, boolean r8) {
        /*
        r3 = 0;
        r2 = 1;
        r0 = java.lang.System.currentTimeMillis();
        r0 = c(r0, r6);
        if (r8 == 0) goto L_0x0014;
    L_0x000c:
        r0 = 2131232280; // 0x7f080618 float:1.8080665E38 double:1.052968653E-314;
        r0 = r5.getString(r0);
    L_0x0013:
        return r0;
    L_0x0014:
        if (r0 != 0) goto L_0x0026;
    L_0x0016:
        r0 = 2131232283; // 0x7f08061b float:1.808067E38 double:1.0529686543E-314;
        r1 = new java.lang.Object[r2];
        r2 = c(r5, r6);
        r1[r3] = r2;
        r0 = r5.getString(r0, r1);
        goto L_0x0013;
    L_0x0026:
        if (r0 != r2) goto L_0x0038;
    L_0x0028:
        r0 = 2131232284; // 0x7f08061c float:1.8080673E38 double:1.052968655E-314;
        r1 = new java.lang.Object[r2];
        r2 = c(r5, r6);
        r1[r3] = r2;
        r0 = r5.getString(r0, r1);
        goto L_0x0013;
    L_0x0038:
        r0 = java.lang.System.currentTimeMillis();
        r0 = b(r0, r6);
        if (r0 == 0) goto L_0x004a;
    L_0x0042:
        r0 = e(r5, r6);
        r1 = com.whatsapp.util.Log.h;
        if (r1 == 0) goto L_0x004e;
    L_0x004a:
        r0 = m(r5, r6);
    L_0x004e:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = r1.append(r0);
        r1 = com.whatsapp.aam.b();
        r0 = r0.append(r1);
        r1 = " ";
        r0 = r0.append(r1);
        r1 = c(r5, r6);
        r0 = r0.append(r1);
        r0 = r0.toString();
        r1 = 2131232282; // 0x7f08061a float:1.8080669E38 double:1.052968654E-314;
        r2 = new java.lang.Object[r2];
        r2[r3] = r0;
        r0 = r5.getString(r1, r2);
        goto L_0x0013;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.cs.a(android.content.Context, long, boolean):java.lang.CharSequence");
    }

    private static DateFormat c(Context context) {
        return new SimpleDateFormat(((SimpleDateFormat) android.text.format.DateFormat.getTimeFormat(context)).toPattern(), aqu.f());
    }

    public static String j(Context context, long j) {
        int c = c(System.currentTimeMillis(), j);
        if (c == 0) {
            return c(context, j);
        }
        return c == 1 ? context.getString(2131232299) : m(context, j);
    }

    public static boolean a(long j, long j2) {
        Calendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(j);
        Calendar gregorianCalendar2 = new GregorianCalendar();
        gregorianCalendar2.setTimeInMillis(j2);
        if (gregorianCalendar.get(1) == gregorianCalendar2.get(1) && gregorianCalendar.get(2) == gregorianCalendar2.get(2) && gregorianCalendar.get(5) == gregorianCalendar2.get(5)) {
            return true;
        }
        return false;
    }

    private static String a(Context context, String str, long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        int i = instance.get(11);
        return (i == 1 || (i == 13 && !android.text.format.DateFormat.is24HourFormat(context))) ? str.replace(z[1], z[0]) : str;
    }

    private static DateFormat b() {
        return DateFormat.getDateInstance(3, aqu.f());
    }

    public static String a(String str) {
        try {
            str = new SimpleDateFormat(z[12], Locale.US).format(new SimpleDateFormat(z[11], Locale.US).parse(str));
        } catch (ParseException e) {
            Log.e(z[10] + str + z[13]);
        }
        return str;
    }

    public static String f(Context context, long j) {
        long j2 = j / 3600000;
        long j3 = (j - (3600000 * j2)) / 60000;
        if (j2 == 0) {
            if (j3 == 0) {
                return String.format(App.az.a(2131296310, (int) (j / 1000)), new Object[]{Integer.valueOf((int) j2)});
            }
            return String.format(App.az.a(2131296286, (int) j3), new Object[]{Integer.valueOf((int) j3)});
        } else if (j3 == 0) {
            return String.format(App.az.a(2131296281, (int) j2), new Object[]{Integer.valueOf((int) j2)});
        } else {
            String format = String.format(App.az.a(2131296286, (int) j3), new Object[]{Integer.valueOf((int) j3)});
            String format2 = String.format(App.az.a(2131296281, (int) j2), new Object[]{Integer.valueOf((int) j2)});
            return context.getString(2131231352, new Object[]{format2, format});
        }
    }

    public static String l(Context context, long j) {
        return m(context, j) + aam.b() + " " + c(context, j);
    }

    public static String b(Context context, long j) {
        int c = c(System.currentTimeMillis(), j);
        if (c == 0) {
            return context.getString(2131232150, new Object[]{c(context, j)});
        } else if (c != 1) {
            return c().format(new Date(j));
        } else {
            return context.getString(2131232299, new Object[]{c(context, j)});
        }
    }

    public static DateFormat b(Context context) {
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) c();
        simpleDateFormat.applyPattern(simpleDateFormat.toPattern().replaceAll(z[8], ""));
        return simpleDateFormat;
    }

    public static String h(Context context, long j) {
        return l(context, j);
    }

    private static DateFormat d() {
        return DateFormat.getDateInstance(2, aqu.f());
    }

    public static String m(Context context, long j) {
        return b().format(new Date(j));
    }

    public static boolean a(long j) {
        return c(System.currentTimeMillis(), j) == 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String i(android.content.Context r7, long r8) {
        /*
        r6 = 0;
        r5 = 1;
        r1 = com.whatsapp.util.Log.h;
        r2 = java.lang.System.currentTimeMillis();
        r2 = c(r2, r8);
        if (r2 != 0) goto L_0x001f;
    L_0x000e:
        r0 = 2131232151; // 0x7f080597 float:1.8080403E38 double:1.052968589E-314;
        r3 = new java.lang.Object[r5];
        r4 = c(r7, r8);
        r3[r6] = r4;
        r0 = r7.getString(r0, r3);
        if (r1 == 0) goto L_0x0040;
    L_0x001f:
        if (r2 != r5) goto L_0x0032;
    L_0x0021:
        r0 = 2131232300; // 0x7f08062c float:1.8080705E38 double:1.0529686627E-314;
        r3 = new java.lang.Object[r5];
        r4 = c(r7, r8);
        r3[r6] = r4;
        r0 = r7.getString(r0, r3);
        if (r1 == 0) goto L_0x0040;
    L_0x0032:
        r0 = 30;
        if (r2 > r0) goto L_0x003c;
    L_0x0036:
        r0 = l(r7, r8);
        if (r1 == 0) goto L_0x0040;
    L_0x003c:
        r0 = m(r7, r8);
    L_0x0040:
        r1 = z;
        r2 = 7;
        r1 = r1[r2];
        r2 = com.whatsapp.aqu.g();
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x0053;
    L_0x004f:
        r0 = a(r7, r0, r8);
    L_0x0053:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.cs.i(android.content.Context, long):java.lang.String");
    }

    public static String a(Context context, long j) {
        return c(context, j);
    }

    public static boolean b(long j, long j2) {
        Calendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(j);
        Calendar gregorianCalendar2 = new GregorianCalendar();
        gregorianCalendar2.setTimeInMillis(j2);
        if (gregorianCalendar.get(1) == gregorianCalendar2.get(1)) {
            return true;
        }
        return false;
    }

    public static String a() {
        return new SimpleDateFormat(z[14], Locale.US).format(new Date());
    }

    public static String c(Context context, long j) {
        return c(context).format(new Date(j));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String n(android.content.Context r13, long r14) {
        /*
        r11 = 2131231017; // 0x7f080129 float:1.8078103E38 double:1.052968029E-314;
        r10 = 30;
        r6 = 6;
        r9 = 0;
        r8 = 1;
        r1 = com.whatsapp.util.Log.h;
        r2 = java.lang.System.currentTimeMillis();
        r2 = c(r2, r14);
        r3 = com.whatsapp.aqu.g();
        if (r2 != 0) goto L_0x0029;
    L_0x0018:
        r0 = 2131232151; // 0x7f080597 float:1.8080403E38 double:1.052968589E-314;
        r4 = new java.lang.Object[r8];
        r5 = c(r13, r14);
        r4[r9] = r5;
        r0 = r13.getString(r0, r4);
        if (r1 == 0) goto L_0x0109;
    L_0x0029:
        if (r2 != r8) goto L_0x003c;
    L_0x002b:
        r0 = 2131232300; // 0x7f08062c float:1.8080705E38 double:1.0529686627E-314;
        r4 = new java.lang.Object[r8];
        r5 = c(r13, r14);
        r4[r9] = r5;
        r0 = r13.getString(r0, r4);
        if (r1 == 0) goto L_0x0109;
    L_0x003c:
        r0 = z;
        r4 = 2;
        r0 = r0[r4];
        r0 = r0.equals(r3);
        if (r0 != 0) goto L_0x005d;
    L_0x0047:
        r0 = z;
        r4 = 3;
        r0 = r0[r4];
        r0 = r0.equals(r3);
        if (r0 != 0) goto L_0x005d;
    L_0x0052:
        r0 = z;
        r4 = 4;
        r0 = r0[r4];
        r0 = r0.equals(r3);
        if (r0 == 0) goto L_0x00ea;
    L_0x005d:
        if (r2 > r6) goto L_0x009a;
    L_0x005f:
        r0 = new java.text.SimpleDateFormat;
        r4 = z;
        r4 = r4[r6];
        r0.<init>(r4);
        r4 = 2131231018; // 0x7f08012a float:1.8078105E38 double:1.0529680293E-314;
        r5 = new java.lang.Object[r8];
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r7 = new java.util.Date;
        r7.<init>(r14);
        r0 = r0.format(r7);
        r0 = r6.append(r0);
        r6 = " ";
        r0 = r0.append(r6);
        r6 = c(r13, r14);
        r0 = r0.append(r6);
        r0 = r0.toString();
        r5[r9] = r0;
        r0 = r13.getString(r4, r5);
        if (r1 == 0) goto L_0x0109;
    L_0x009a:
        if (r2 > r10) goto L_0x00d1;
    L_0x009c:
        r0 = 2131232147; // 0x7f080593 float:1.8080395E38 double:1.052968587E-314;
        r4 = new java.lang.Object[r8];
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = g(r13, r14);
        r5 = r5.append(r6);
        r6 = com.whatsapp.aam.b();
        r5 = r5.append(r6);
        r6 = " ";
        r5 = r5.append(r6);
        r6 = c(r13, r14);
        r5 = r5.append(r6);
        r5 = r5.toString();
        r4[r9] = r5;
        r0 = r13.getString(r0, r4);
        if (r1 == 0) goto L_0x0109;
    L_0x00d1:
        r0 = d();
        r0 = (java.text.SimpleDateFormat) r0;
        r4 = new java.lang.Object[r8];
        r5 = new java.util.Date;
        r5.<init>(r14);
        r0 = r0.format(r5);
        r4[r9] = r0;
        r0 = r13.getString(r11, r4);
        if (r1 == 0) goto L_0x0109;
    L_0x00ea:
        if (r2 > r10) goto L_0x00fd;
    L_0x00ec:
        r0 = 2131232147; // 0x7f080593 float:1.8080395E38 double:1.052968587E-314;
        r2 = new java.lang.Object[r8];
        r4 = l(r13, r14);
        r2[r9] = r4;
        r0 = r13.getString(r0, r2);
        if (r1 == 0) goto L_0x0109;
    L_0x00fd:
        r0 = new java.lang.Object[r8];
        r1 = m(r13, r14);
        r0[r9] = r1;
        r0 = r13.getString(r11, r0);
    L_0x0109:
        r1 = z;
        r2 = 5;
        r1 = r1[r2];
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0118;
    L_0x0114:
        r0 = a(r13, r0, r14);
    L_0x0118:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.cs.n(android.content.Context, long):java.lang.String");
    }

    public static String g(Context context, long j) {
        return a(context).format(new Date(j));
    }
}
