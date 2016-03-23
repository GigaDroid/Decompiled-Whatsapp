package com.whatsapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class vh {
    private static String a;
    private static String b;
    private static String c;
    private static String d;
    private static String e;
    private static String f;
    private static String g;
    private static String h;
    private static final int[] i;
    private static final String[] z;

    public static synchronized void b(Context context, boolean z) {
        boolean z2 = true;
        synchronized (vh.class) {
            Log.i(z[0] + z);
            Editor edit = context.getSharedPreferences(z[2], 0).edit();
            edit.putLong(a, App.av());
            edit.putBoolean(h, z);
            String str = b;
            if (z) {
                z2 = false;
            }
            edit.putBoolean(str, z2);
            if (!edit.commit()) {
                Log.e(z[1]);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a(android.content.Context r9, long r10, boolean r12) {
        /*
        r6 = 0;
        r1 = com.whatsapp.vh.class;
        monitor-enter(r1);
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00ae }
        r0.<init>();	 Catch:{ all -> 0x00ae }
        r2 = z;	 Catch:{ all -> 0x00ae }
        r3 = 32;
        r2 = r2[r3];	 Catch:{ all -> 0x00ae }
        r0 = r0.append(r2);	 Catch:{ all -> 0x00ae }
        r0 = r0.append(r10);	 Catch:{ all -> 0x00ae }
        r2 = z;	 Catch:{ all -> 0x00ae }
        r3 = 29;
        r2 = r2[r3];	 Catch:{ all -> 0x00ae }
        r0 = r0.append(r2);	 Catch:{ all -> 0x00ae }
        r0 = r0.append(r12);	 Catch:{ all -> 0x00ae }
        r0 = r0.toString();	 Catch:{ all -> 0x00ae }
        com.whatsapp.util.Log.i(r0);	 Catch:{ all -> 0x00ae }
        r0 = z;	 Catch:{ all -> 0x00ae }
        r2 = 28;
        r0 = r0[r2];	 Catch:{ all -> 0x00ae }
        r2 = 0;
        r0 = r9.getSharedPreferences(r0, r2);	 Catch:{ all -> 0x00ae }
        r2 = a;	 Catch:{ all -> 0x00ae }
        r4 = 0;
        r2 = r0.getLong(r2, r4);	 Catch:{ all -> 0x00ae }
        r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r4 <= 0) goto L_0x0089;
    L_0x0044:
        r4 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1));
        if (r4 != 0) goto L_0x0089;
    L_0x0048:
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00ae }
        r4.<init>();	 Catch:{ all -> 0x00ae }
        r5 = z;	 Catch:{ all -> 0x00ae }
        r6 = 31;
        r5 = r5[r6];	 Catch:{ all -> 0x00ae }
        r4 = r4.append(r5);	 Catch:{ all -> 0x00ae }
        r2 = r4.append(r2);	 Catch:{ all -> 0x00ae }
        r2 = r2.toString();	 Catch:{ all -> 0x00ae }
        com.whatsapp.util.Log.i(r2);	 Catch:{ all -> 0x00ae }
        r2 = r0.edit();	 Catch:{ all -> 0x00ae }
        r3 = d;	 Catch:{ all -> 0x00ae }
        r4 = 0;
        r2.putBoolean(r3, r4);	 Catch:{ all -> 0x00ae }
        r2 = r2.commit();	 Catch:{ all -> 0x00ae }
        if (r2 != 0) goto L_0x007b;
    L_0x0072:
        r2 = z;	 Catch:{ all -> 0x00ae }
        r3 = 30;
        r2 = r2[r3];	 Catch:{ all -> 0x00ae }
        com.whatsapp.util.Log.e(r2);	 Catch:{ all -> 0x00ae }
    L_0x007b:
        r2 = h;	 Catch:{ all -> 0x00ae }
        r3 = 0;
        r2 = r0.getBoolean(r2, r3);	 Catch:{ all -> 0x00ae }
        com.whatsapp.App.k(r2);	 Catch:{ all -> 0x00ae }
        r2 = com.whatsapp.DialogToastActivity.f;	 Catch:{ all -> 0x00ae }
        if (r2 == 0) goto L_0x00ac;
    L_0x0089:
        r0 = r0.edit();	 Catch:{ all -> 0x00ae }
        r2 = a;	 Catch:{ all -> 0x00ae }
        r0.putLong(r2, r10);	 Catch:{ all -> 0x00ae }
        r2 = d;	 Catch:{ all -> 0x00ae }
        r3 = 1;
        r0.putBoolean(r2, r3);	 Catch:{ all -> 0x00ae }
        r2 = b;	 Catch:{ all -> 0x00ae }
        r0.putBoolean(r2, r12);	 Catch:{ all -> 0x00ae }
        r0 = r0.commit();	 Catch:{ all -> 0x00ae }
        if (r0 != 0) goto L_0x00ac;
    L_0x00a3:
        r0 = z;	 Catch:{ all -> 0x00ae }
        r2 = 27;
        r0 = r0[r2];	 Catch:{ all -> 0x00ae }
        com.whatsapp.util.Log.e(r0);	 Catch:{ all -> 0x00ae }
    L_0x00ac:
        monitor-exit(r1);
        return;
    L_0x00ae:
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.vh.a(android.content.Context, long, boolean):void");
    }

    public static synchronized long c(Context context) {
        long j = 0;
        synchronized (vh.class) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(z[36], 0);
            if (sharedPreferences.getLong(a, 0) == 0 && a59.b()) {
                j = sharedPreferences.getLong(c + 1, 0) + a59.a(1);
            }
        }
        return j;
    }

    public static synchronized void m(Context context) {
        synchronized (vh.class) {
            Log.i(z[23]);
            Editor edit = context.getSharedPreferences(z[22], 0).edit();
            edit.remove(a);
            edit.remove(d);
            edit.remove(h);
            edit.remove(b);
            if (!edit.commit()) {
                Log.e(z[21]);
            }
        }
    }

    public static synchronized void b(Context context) {
        synchronized (vh.class) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(z[16], 0);
            int i = sharedPreferences.getInt(e, 0);
            if (!(i == 0 || sharedPreferences.getBoolean(g + i, false))) {
                App.b(i);
            }
            if (!(sharedPreferences.getLong(a, 0) == 0 || sharedPreferences.getBoolean(d, false))) {
                App.k(sharedPreferences.getBoolean(h, false));
            }
        }
    }

    public static synchronized void h(Context context) {
        int i = 0;
        synchronized (vh.class) {
            boolean z = DialogToastActivity.f;
            Log.i(z[18]);
            Editor edit = context.getSharedPreferences(z[17], 0).edit();
            edit.remove(e);
            edit.remove(f);
            int[] iArr = i;
            int length = iArr.length;
            while (i < length) {
                int i2 = iArr[i];
                edit.remove(c + i2);
                edit.remove(g + i2);
                i++;
                if (z) {
                    break;
                }
            }
            if (!edit.commit()) {
                Log.e(z[19]);
            }
        }
    }

    public static synchronized boolean i(Context context) {
        boolean z = false;
        synchronized (vh.class) {
            if (context.getSharedPreferences(z[37], 0).getLong(a, 0) > 0) {
                z = true;
            }
        }
        return z;
    }

    public static synchronized int k(Context context) {
        int i = 0;
        synchronized (vh.class) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(z[14], 0);
            if (sharedPreferences.getLong(a, 0) == 0 && a59.b()) {
                i = sharedPreferences.getInt(e, 0);
            }
        }
        return i;
    }

    public static synchronized void l(Context context) {
        synchronized (vh.class) {
            h(context);
            m(context);
            a59.a();
        }
    }

    public static synchronized int a(Context context) {
        int i = 3;
        synchronized (vh.class) {
            boolean z = DialogToastActivity.f;
            SharedPreferences sharedPreferences = context.getSharedPreferences(z[7], 0);
            if (sharedPreferences.getLong(a, 0) == 0 && a59.b()) {
                int i2 = sharedPreferences.getInt(e, 0);
                if (i2 != 3) {
                    int i3;
                    if (i2 == 0) {
                        i3 = 1;
                        if (!sharedPreferences.edit().putInt(e, 1).commit()) {
                            Log.e(z[10]);
                        }
                    } else {
                        i3 = i2;
                    }
                    long j = sharedPreferences.getLong(c + i3, 0);
                    if (j == 0) {
                        j = App.av();
                        Log.i(z[3] + i3 + z[9] + j);
                        if (!sharedPreferences.edit().putLong(c + i3, j).commit()) {
                            Log.e(z[6]);
                        }
                    }
                    if (j + a59.a(i3) <= App.av()) {
                        i3++;
                        while (a59.a(i3) == 0 && i3 < 3) {
                            i3++;
                            if (z) {
                                break;
                            }
                        }
                        i = i3;
                        j = App.av();
                        Editor edit = sharedPreferences.edit();
                        edit.putInt(e, i);
                        edit.putLong(c + i, j);
                        Log.i(z[4] + i + z[8] + j);
                        if (!edit.commit()) {
                            Log.e(z[5]);
                        }
                    } else {
                        i = i3;
                    }
                    if (i2 != i) {
                        App.b(i);
                    }
                }
            } else {
                i = 0;
            }
        }
        return i;
    }

    static {
        String[] strArr = new String[39];
        String str = "9\u001eLG\u001b)\u0010KWD\"\u001fk]\u0018\f\u0012\\W\u001b9\u0014[\u0012\u0004=\u0005pG\u001fw";
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
                        i4 = 77;
                        break;
                    case at.g /*1*/:
                        i4 = 113;
                        break;
                    case at.i /*2*/:
                        i4 = 63;
                        break;
                    case at.o /*3*/:
                        i4 = 50;
                        break;
                    default:
                        i4 = arj.Theme_seekBarStyle;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = ".\u001eR\u001c\u001c%\u0010KA\n=\u0001`B\u0019(\u0017Z@\u000e#\u0012ZA";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "9\u001eLG\u001b)\u0010KWD$\u001fVFK>\u0005^U\u000ew";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "9\u001eLG\u001b)\u0010KWD,\u0015IS\u0005.\u0014\u001fA\u001f,\u0016Z\b";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "9\u001eLG\u001b)\u0010KWD.\u001eR_\u00029QYS\u0002!\u0014[";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "9\u001eLG\u001b)\u0010KWD.\u001eR_\u00029QYS\u0002!\u0014[\u0012\u001e=\u0015^F\u000em\u0002KS\u00199QK[\u0006(";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = ".\u001eR\u001c\u001c%\u0010KA\n=\u0001`B\u0019(\u0017Z@\u000e#\u0012ZA";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "m\u0002KS\u00199K";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "m\u0002KS\u00199K";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "9\u001eLG\u001b)\u0010KWD.\u001eR_\u00029QYS\u0002!\u0014[\u0012\u001e=\u0015^F\u000em\u0002KS\f(Q\u000e";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "9\u001eLG\u001b)\u0010KWD\"\u001fk]\u0018\u001e\u0005^U\u000e\f\u0012T\u001d\b\"\u001cR[\u001fm\u0017^[\u0007(\u0015";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = ".\u001eR\u001c\u001c%\u0010KA\n=\u0001`B\u0019(\u0017Z@\u000e#\u0012ZA";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "9\u001eLG\u001b)\u0010KWD\"\u001fk]\u0018\u001e\u0005^U\u000e\f\u0012T\u0012\u00189\u0010XWQ";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = ".\u001eR\u001c\u001c%\u0010KA\n=\u0001`B\u0019(\u0017Z@\u000e#\u0012ZA";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = ".\u001eR\u001c\u001c%\u0010KA\n=\u0001`B\u0019(\u0017Z@\u000e#\u0012ZA";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = ".\u001eR\u001c\u001c%\u0010KA\n=\u0001`B\u0019(\u0017Z@\u000e#\u0012ZA";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = ".\u001eR\u001c\u001c%\u0010KA\n=\u0001`B\u0019(\u0017Z@\u000e#\u0012ZA";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "9\u001eLG\u001b)\u0010KWD?\u0014LW\u001f\u0019\u001eLg\u001b)\u0010KW";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "9\u001eLG\u001b)\u0010KWD?\u0014LW\u001f\u0019\u001eLg\u001b)\u0010KWD.\u001eR_\u00029QYS\u0002!\u0014[";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = ".\u001eR\u001c\u001c%\u0010KA\n=\u0001`B\u0019(\u0017Z@\u000e#\u0012ZA";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = "9\u001eLG\u001b)\u0010KWD?\u0014LW\u001f\u0019\u001eLs\b.\u0014OF\n#\u0012Z\u001d\b\"\u001cR[\u001fm\u0017^[\u0007(\u0015";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = ".\u001eR\u001c\u001c%\u0010KA\n=\u0001`B\u0019(\u0017Z@\u000e#\u0012ZA";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "9\u001eLG\u001b)\u0010KWD?\u0014LW\u001f\u0019\u001eLs\b.\u0014OF\n#\u0012Z";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = "9\u001eLG\u001b)\u0010KWD\"\u001fk]\u0018\u001e\u0005^U\u000e\u0002\u001fZv\u0002>\u001cVA\u0018(\u0015";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = ".\u001eR\u001c\u001c%\u0010KA\n=\u0001`B\u0019(\u0017Z@\u000e#\u0012ZA";
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = "9\u001eLG\u001b)\u0010KWD\"\u001fk]\u0018\u001e\u0005^U\u000e\u0002\u001fZv\u0002>\u001cVA\u0018(\u0015\u0010Q\u0004 \u001cVFK+\u0010V^\u000e)";
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i2] = str;
                    i2 = 27;
                    str = "9\u001eLG\u001b)\u0010KWD\"\u001fk]\u0018\u001e\u0005^F\u000e\u000b\u0003P_8(\u0003IW\u0019b\u0012P_\u0006$\u0005\u001fT\n$\u001dZV";
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i2] = str;
                    i2 = 28;
                    str = ".\u001eR\u001c\u001c%\u0010KA\n=\u0001`B\u0019(\u0017Z@\u000e#\u0012ZA";
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    str = "m\u0010S^\u0004:>OF$8\u0005\u0005";
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i2] = str;
                    i2 = 30;
                    str = "9\u001eLG\u001b)\u0010KWD\"\u001fk]\u0018\u001e\u0005^F\u000e\u000b\u0003P_8(\u0003IW\u0019b\u0012P_\u0006$\u0005\u001fT\n$\u001dZV";
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i2] = str;
                    i2 = 31;
                    str = "9\u001eLG\u001b)\u0010KWD\"\u001fk]\u0018\u001e\u0005^F\u000e\u000b\u0003P_8(\u0003IW\u0019b\u0003ZA\u000e#\u0015\u001fS\b.\u0014OFK9\u001eL\u0012\b!\u0018Z\\\u001f\u0019\u0018RW*.\u0012ZB\u001f(\u0015\u0002";
                    i = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i2] = str;
                    i2 = 32;
                    str = "9\u001eLG\u001b)\u0010KWD\"\u001fk]\u0018\u001e\u0005^F\u000e\u000b\u0003P_8(\u0003IW\u0019m\u0005V_\u000e\f\u0012\\W\u001b9\u0014[\b";
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i2] = str;
                    i2 = 33;
                    str = ".\u001eR\u001c\u001c%\u0010KA\n=\u0001`B\u0019(\u0017Z@\u000e#\u0012ZA";
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i2] = str;
                    i2 = 34;
                    str = "9\u001eLG\u001b)\u0010KWD\"\u001fk]\u0018\f\u0012Tt\u0019\"\u001clW\u0019;\u0014M\u001d\b\"\u001cR[\u001fm\u0017^[\u0007(\u0015";
                    i = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i2] = str;
                    i2 = 35;
                    str = "9\u001eLG\u001b)\u0010KWD\"\u001fk]\u0018\f\u0012Tt\u0019\"\u001clW\u0019;\u0014M\u0012\u0004=\u0005pG\u001fw";
                    i = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i2] = str;
                    i2 = 36;
                    str = ".\u001eR\u001c\u001c%\u0010KA\n=\u0001`B\u0019(\u0017Z@\u000e#\u0012ZA";
                    i = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i2] = str;
                    i2 = 37;
                    str = ".\u001eR\u001c\u001c%\u0010KA\n=\u0001`B\u0019(\u0017Z@\u000e#\u0012ZA";
                    i = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i2] = str;
                    i2 = 38;
                    str = ".\u001eR\u001c\u001c%\u0010KA\n=\u0001`B\u0019(\u0017Z@\u000e#\u0012ZA";
                    i = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    str = "9\u001eLm\n.\u0012ZB\u001f(\u0015`F\u0002 \u0014";
                    i = -1;
                    while (true) {
                        toCharArray = str.toCharArray();
                        int length2 = toCharArray.length;
                        char[] cArr2 = toCharArray;
                        for (int i5 = 0; length2 > i5; i5++) {
                            char c2 = cArr2[i5];
                            switch (i5 % 5) {
                                case v.m /*0*/:
                                    i4 = 77;
                                    break;
                                case at.g /*1*/:
                                    i4 = 113;
                                    break;
                                case at.i /*2*/:
                                    i4 = 63;
                                    break;
                                case at.o /*3*/:
                                    i4 = 50;
                                    break;
                                default:
                                    i4 = arj.Theme_seekBarStyle;
                                    break;
                            }
                            cArr2[i5] = (char) (i4 ^ c2);
                        }
                        str = new String(cArr2).intern();
                        switch (i) {
                            case v.m /*0*/:
                                d = str;
                                str = "9\u001eLm\b8\u0003MW\u00059.LF\n*\u0014`[\u000f";
                                i = 1;
                                break;
                            case at.g /*1*/:
                                e = str;
                                str = "9\u001eLm\u00189\u0010XW4>\u0005^@\u001f\u0012\u0005V_\u000e";
                                i = 2;
                                break;
                            case at.i /*2*/:
                                c = str;
                                str = "9\u001eLm\u00189\u0010XW4>\u0005^@\u001f\u0012\u0010\\Y";
                                i = 3;
                                break;
                            case at.o /*3*/:
                                g = str;
                                str = "9\u001eLm\u0004=\u0005ZV4\"\u0004K";
                                i = 4;
                                break;
                            case at.p /*4*/:
                                h = str;
                                str = "9\u001eLm\n!\u001dPE4\"\u0001Km\u00048\u0005";
                                i = 5;
                                break;
                            case at.m /*5*/:
                                b = str;
                                str = "9\u001eLm\u0007,\u0002Km\u00189\u0010XW4|.[[\u0018=\u001d^K49\u0018RW";
                                i = 6;
                                break;
                            case Y.f /*6*/:
                                f = str;
                                i = new int[]{1, 3, 3};
                                return;
                            default:
                                a = str;
                                str = "9\u001eLm\n.\u0012ZB\u001f(\u0015`S\b&";
                                i = 0;
                                break;
                        }
                    }
                default:
                    strArr2[i2] = str;
                    str = "9\u001eLG\u001b)\u0010KWD\"\u001fk]\u0018\f\u0012\\W\u001b9\u0014[\u001d\b\"\u001cR[\u001fm\u0017^[\u0007(\u0015";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public static synchronized boolean g(Context context) {
        boolean z;
        synchronized (vh.class) {
            z = context.getSharedPreferences(z[20], 0).getBoolean(h, false);
        }
        return z;
    }

    public static synchronized void d(Context context) {
        synchronized (vh.class) {
            Log.i(z[24]);
            Editor edit = context.getSharedPreferences(z[25], 0).edit();
            edit.putLong(f, App.av());
            if (!edit.commit()) {
                Log.e(z[26]);
            }
        }
    }

    public static synchronized boolean j(Context context) {
        boolean z;
        synchronized (vh.class) {
            int k = k(context);
            z = (k == 2 || k == 3) ? false : true;
        }
        return z;
    }

    public static synchronized void a(Context context, int i) {
        synchronized (vh.class) {
            Log.i(z[13] + i);
            Editor edit = context.getSharedPreferences(z[12], 0).edit();
            edit.putBoolean(g + i, true);
            if (!edit.commit()) {
                Log.e(z[11]);
            }
        }
    }

    public static synchronized boolean f(Context context) {
        boolean z = true;
        synchronized (vh.class) {
            int k = k(context);
            if (k == 1) {
                if (context.getSharedPreferences(z[15], 0).getLong(f, 0) + 86400000 >= App.av()) {
                    z = false;
                }
            } else if (!(k == 2 || k == 3)) {
                z = false;
            }
        }
        return z;
    }

    public static synchronized boolean e(Context context) {
        boolean z = false;
        synchronized (vh.class) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(z[38], 0);
            long j = sharedPreferences.getLong(a, 0);
            if (j != 0 && j + 2592000000L > App.av() && sharedPreferences.getBoolean(b, false)) {
                z = true;
            }
        }
        return z;
    }

    public static synchronized void a(Context context, boolean z) {
        boolean z2 = true;
        synchronized (vh.class) {
            Log.i(z[35] + z);
            SharedPreferences sharedPreferences = context.getSharedPreferences(z[33], 0);
            Editor edit = sharedPreferences.edit();
            if (sharedPreferences.getLong(a, 0) == 0) {
                edit.putLong(a, App.av());
            }
            edit.putBoolean(d, true);
            edit.putBoolean(h, z);
            String str = b;
            if (z) {
                z2 = false;
            }
            edit.putBoolean(str, z2);
            if (!edit.commit()) {
                Log.e(z[34]);
            }
        }
    }
}
