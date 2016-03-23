package com.whatsapp;

import android.app.Dialog;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.NotificationCompat.Builder;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyManager;
import com.google.ae;
import com.google.e2;
import com.google.e5;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.registration.a;
import com.whatsapp.util.Log;
import com.whatsapp.util.a_;
import java.util.Random;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class VerifyNumber extends UserFeedbackActivity {
    protected static String s;
    private static final String[] z;
    private int n;
    private String o;
    int p;
    boolean q;
    private final PhoneStateListener r;
    boolean t;
    boolean u;

    protected void d(int i) {
        Log.i(z[2]);
        long currentTimeMillis = System.currentTimeMillis();
        CharSequence string = getString(2131232033);
        CharSequence string2 = getString(2131232037);
        CharSequence string3 = getString(2131232035);
        Builder builder = new Builder(this);
        builder.setSmallIcon(2130839686);
        builder.setTicker(string);
        builder.setWhen(currentTimeMillis);
        builder.setDefaults(3);
        builder.setAutoCancel(true);
        Intent intent = new Intent(this, getClass());
        if (i != -1) {
            try {
                intent.putExtra(z[3], i);
            } catch (SecurityException e) {
                throw e;
            }
        }
        intent.addFlags(536870912);
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 268435456);
        builder.setContentTitle(string2);
        builder.setContentText(string3);
        builder.setContentIntent(activity);
        NotificationManagerCompat.from(this).notify(1, builder.build());
    }

    static ne a(Context context, String str, String str2, String str3, String str4) {
        a a = a.a(context, str2);
        String string = App.z().getSharedPreferences(z[7], 0).getString(z[8], null);
        a_ a2 = a_.a(App.W.getNetworkOperator());
        a_ a3 = a_.a(App.W.getSimOperator());
        return amb.a(str, str + str2, str2, a2, a3, str3, str4, a.toString(), string);
    }

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case arj.Theme_switchStyle /*109*/:
                return new AlertDialog.Builder(this).setMessage(2131231791).setPositiveButton(2131230911, new iw(this)).setNegativeButton(2131230884, new as3(this)).create();
            case 114:
                return aro.a(this);
            case 122:
                Dialog progressDialog = new ProgressDialog(this);
                progressDialog.setMessage(getString(2131231749));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return progressDialog;
            default:
                return super.onCreateDialog(i);
        }
    }

    protected boolean c() {
        return true;
    }

    static boolean a(boolean z) {
        Editor edit = App.z().getSharedPreferences(z[23], 0).edit();
        try {
            edit.putBoolean(z[21], z);
            if (edit.commit()) {
                return true;
            }
            Log.w(z[24] + z + z[22]);
            return false;
        } catch (SecurityException e) {
            throw e;
        }
    }

    static String c(String str) {
        boolean z = DialogToastActivity.f;
        if (str == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            stringBuilder.append((char) (str.charAt(i) ^ 18));
            i += 6;
            if (z) {
                break;
            }
        }
        return stringBuilder.toString();
    }

    protected void d(String str) {
        s = str;
        App.c((Context) this, str);
    }

    protected static long a(@Nullable String str, long j) {
        if (str != null) {
            try {
                j = Long.parseLong(str);
            } catch (Throwable e) {
                Log.b(e);
            } catch (SecurityException e2) {
                throw e2;
            }
        }
        return j;
    }

    public VerifyNumber() {
        this.u = false;
        this.t = false;
        this.q = false;
        this.o = null;
        this.n = -1;
        this.r = new bw(this);
    }

    public void j(String str) {
        try {
            if (!this.t) {
                if (!isFinishing()) {
                    try {
                        super.f(str);
                        if (!DialogToastActivity.f) {
                            return;
                        }
                    } catch (SecurityException e) {
                        throw e;
                    }
                }
            }
            this.o = str;
        } catch (SecurityException e2) {
            throw e2;
        } catch (SecurityException e22) {
            throw e22;
        }
    }

    public void b(int i) {
        try {
            if (!this.t) {
                if (!isFinishing()) {
                    try {
                        a(i);
                        if (!DialogToastActivity.f) {
                            return;
                        }
                    } catch (SecurityException e) {
                        throw e;
                    }
                }
            }
            this.o = getString(i);
        } catch (SecurityException e2) {
            throw e2;
        } catch (SecurityException e22) {
            throw e22;
        }
    }

    protected void a(ServiceState serviceState) {
    }

    protected final void f() {
        App.W.listen(this.r, 0);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void c(int r2) {
        /*
        r1 = this;
        r0 = r1.t;	 Catch:{ SecurityException -> 0x0015 }
        if (r0 != 0) goto L_0x000a;
    L_0x0004:
        r0 = r1.isFinishing();	 Catch:{ SecurityException -> 0x0017 }
        if (r0 == 0) goto L_0x0011;
    L_0x000a:
        r1.d(r2);	 Catch:{ SecurityException -> 0x0019 }
        r0 = com.whatsapp.DialogToastActivity.f;	 Catch:{ SecurityException -> 0x0019 }
        if (r0 == 0) goto L_0x0014;
    L_0x0011:
        r1.showDialog(r2);	 Catch:{ SecurityException -> 0x0019 }
    L_0x0014:
        return;
    L_0x0015:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0017 }
    L_0x0017:
        r0 = move-exception;
        throw r0;	 Catch:{ SecurityException -> 0x0019 }
    L_0x0019:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VerifyNumber.c(int):void");
    }

    public static String j() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) App.z().getSystemService(z[5]);
            if (telephonyManager != null) {
                return telephonyManager.getLine1Number();
            }
            return null;
        } catch (Exception e) {
            Log.w(z[4] + e.toString());
            return null;
        }
    }

    @Nullable
    static String b(@Nullable String str, @Nullable String str2) {
        if (str == null || str2 == null) {
            try {
                Log.e(z[20]);
                return null;
            } catch (Exception e) {
                throw e;
            }
        }
        String str3 = "+" + str + " " + str2;
        e2 a = e2.a();
        try {
            ae b = a.b("+" + str + str2, z[18]);
            if (b != null) {
                return a.a(b, e5.INTERNATIONAL);
            }
            return str3;
        } catch (Throwable e2) {
            Log.b(z[17], e2);
            return str3;
        } catch (Throwable e22) {
            Log.b(z[19], e22);
            return str3;
        }
    }

    public void onResume() {
        try {
            this.t = false;
            super.onResume();
            s = App.f((Context) this);
            if (this.o != null) {
                f(this.o);
            }
            try {
                if (this.n != -1) {
                    showDialog(this.n);
                }
                this.o = null;
                this.n = -1;
            } catch (SecurityException e) {
                throw e;
            }
        } catch (SecurityException e2) {
            throw e2;
        }
    }

    static {
        String[] strArr = new String[25];
        String str = "Ql7/G^&+3LEl7iUU`(iDU{*4";
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
                        i3 = 39;
                        break;
                    case at.g /*1*/:
                        i3 = 9;
                        break;
                    case at.i /*2*/:
                        i3 = 69;
                        break;
                    case at.o /*3*/:
                        i3 = 70;
                        break;
                    default:
                        i3 = 33;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "Ql7/G^g0+CB{j(NS`#?\u000eRg3#SNo,#E";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "Df(hVOh15@Wyk0DU`#?ORd'#S\tm,'MHn";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "Ql7/G^g0+CB{j!DSy-)OBg+3LEl7iDU{*4\u0001";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "Wa*(D";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "Ql7/G^g0+CB{j(NS`#?\u000eQl7/GNl!";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "Df(hVOh15@Wy\u001a6SBo 4DIj 5";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "Df(hVOh15@Wyk\u0014D@`62DUY-)OB'(/RSp5#Exz1'UB";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    str = "Fg!4NNmk6DUd,5RNf+h`dJ\u0000\u0015rxJ\n\u0007stL\u001a\nndH\u0011\u000fni";
                    obj = 8;
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    strArr2 = strArr3;
                    str = "Ql7/G^g0+CB{j3OFk)#\u0001Sfe4D@`62DU)5.NIle*HT} (DU";
                    obj = 9;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "Fg!4NNmk6DUd,5RNf+hsbH\u0001\u0019qoF\u000b\u0003~t]\u0004\u0012d";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "Ql7/G^g0+CB{j6IHg \u0019U^y f";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "Wa*(D";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "Df(hVOh15@Wyk\u0014D@`62DUY-)OB'(/RSp5#Exz1'UB";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "J`62XWl!{\u0013\u0007!r\"\b";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "Df(hVOh15@Wy\u001a6SBo 4DIj 5";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "Ql7/G^g0+CB{j NUd$2UB{h#YDl52HHg";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "}S";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "Ql7/G^g0+CB{j NUd$2UB{h/ON}h#YDl52HHg";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "Ql7/G^g0+CB{j6SB}1?QU`+2\u000eDjh)S\ny-(TJ$,5\fI|)*";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "Il2\u0019KNm";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "\bj*+LN}e @Ne \"";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "Df(hVOh15@Wy\u001a6SBo 4DIj 5";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "Ql7/G^g0+CB{j5@Qlh(DP$//E\b";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    z = strArr3;
                    s = "";
                    return;
                default:
                    strArr2[i] = str;
                    str = "{M";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TelephonyManager telephonyManager = (TelephonyManager) App.z().getSystemService(z[13]);
        try {
            this.p = -1;
            if (telephonyManager != null) {
                this.p = telephonyManager.getPhoneType();
            }
            Log.i(z[12] + this.p);
        } catch (SecurityException e) {
            throw e;
        }
    }

    public void onPause() {
        this.t = true;
        super.onPause();
        App.c((Context) this, s);
    }

    static String b(String str) {
        boolean z = DialogToastActivity.f;
        if (str == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            stringBuilder.append((char) (str.charAt(i) ^ 18));
            int i2 = 1;
            while (i2 < 6) {
                stringBuilder.append((char) ((new Random().nextInt(10) + 48) ^ 18));
                i2++;
                if (z) {
                    break;
                }
            }
            i++;
            if (z) {
                break;
            }
        }
        return stringBuilder.toString();
    }

    static String a(String str, String str2) {
        String replaceAll = str2.replaceAll(z[1], "");
        String str3 = null;
        try {
            str3 = u0.a(Integer.parseInt(str), replaceAll);
        } catch (Throwable e) {
            Log.b(z[0], e);
        }
        if (str3 != null) {
            return b(str, replaceAll.substring(str.length()));
        }
        return replaceAll;
    }

    protected static void d() {
        try {
            if (App.j == 1 && auq.a() <= 7) {
                try {
                    if ("2".equals(App.z().getSharedPreferences(z[16], 0).getString(z[14], null))) {
                        App.a(z[15], false, null);
                    }
                } catch (SecurityException e) {
                    throw e;
                }
            }
        } catch (SecurityException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void b() {
        /*
        r8 = this;
        r7 = 1;
        r0 = z;
        r1 = 6;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = java.lang.System.currentTimeMillis();
        r2 = 2131232034; // 0x7f080522 float:1.8080166E38 double:1.0529685313E-314;
        r2 = r8.getString(r2);
        r3 = 2131232038; // 0x7f080526 float:1.8080174E38 double:1.0529685333E-314;
        r3 = r8.getString(r3);
        r4 = 2131232036; // 0x7f080524 float:1.808017E38 double:1.0529685323E-314;
        r4 = r8.getString(r4);
        r5 = new android.support.v7.app.NotificationCompat$Builder;
        r5.<init>(r8);
        r6 = 2130839686; // 0x7f020886 float:1.728439E38 double:1.0527746856E-314;
        r5.setSmallIcon(r6);
        r5.setTicker(r2);
        r5.setWhen(r0);
        r0 = 3;
        r5.setDefaults(r0);
        r5.setAutoCancel(r7);
        r0 = r8.q;
        if (r0 == 0) goto L_0x0049;
    L_0x003e:
        r0 = new android.content.Intent;
        r1 = com.whatsapp.Main.class;
        r0.<init>(r8, r1);
        r1 = com.whatsapp.DialogToastActivity.f;
        if (r1 == 0) goto L_0x0054;
    L_0x0049:
        r0 = new android.content.Intent;
        r1 = com.whatsapp.RegisterName.class;
        r0.<init>(r8, r1);
        r1 = 2;
        com.whatsapp.App.d(r8, r1);
    L_0x0054:
        r1 = 0;
        r2 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r0 = android.app.PendingIntent.getActivity(r8, r1, r0, r2);
        r5.setContentTitle(r3);
        r5.setContentText(r4);
        r5.setContentIntent(r0);
        r0 = android.support.v4.app.NotificationManagerCompat.from(r8);
        r1 = r5.build();
        r0.notify(r7, r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VerifyNumber.b():void");
    }

    public void e(int i) {
        try {
            if (!this.t) {
                if (!isFinishing()) {
                    try {
                        showDialog(i);
                        if (!DialogToastActivity.f) {
                            return;
                        }
                    } catch (SecurityException e) {
                        throw e;
                    }
                }
            }
            this.n = i;
        } catch (SecurityException e2) {
            throw e2;
        } catch (SecurityException e22) {
            throw e22;
        }
    }

    protected void a() {
        d(-1);
    }

    protected final void i() {
        int i;
        int i2 = 227;
        if (App.h(this, z[11]) == 0) {
            i2 = 495;
        }
        if (App.h(this, z[9]) == 0) {
            i2 |= 16;
            if (VERSION.SDK_INT >= 17) {
                i = i2 | 1024;
                App.W.listen(this.r, i);
            }
        }
        i = i2;
        try {
            App.W.listen(this.r, i);
        } catch (Throwable e) {
            Log.b(z[10] + i, e);
        }
    }

    protected void a(String str) {
        e(str);
    }
}
