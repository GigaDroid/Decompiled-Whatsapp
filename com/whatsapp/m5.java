package com.whatsapp;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import com.whatsapp.contact.b;
import com.whatsapp.contact.f;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class m5 extends AsyncTask {
    private static final String[] z;
    Activity a;
    HashMap b;
    String c;
    boolean d;
    by e;
    boolean f;

    static {
        String[] strArr = new String[19];
        String str = "`\u0006rS2";
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
                        i3 = 14;
                        break;
                    case at.g /*1*/:
                        i3 = 99;
                        break;
                    case at.i /*2*/:
                        i3 = 4;
                        break;
                    case at.o /*3*/:
                        i3 = 54;
                        break;
                    default:
                        i3 = 64;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "o\u0001kC4!\u0014mP)}\u000faS0!";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "o\u0001kC4!\u0014mP)}\u000faS0!\rkBmh\fqX$";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "o\u0001kC4!\u0014mP)}\u000faS0!\u0006vD/|C";
                    obj = 3;
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "j\u0006bW5b\u0017";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "y\nb_\u001f}\u000faS0Q\u0013kZ)m\u001a";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "{\roX/y\r";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "m\u000baU+}\u001awB%c\u0010pW4{\u0010+S2|\fv\u0016";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = ".K";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "m\u000baU+}\u001awB%c\u0010pW4{\u0010+_/k\u0011vY2.";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "o\u0001kC4!\u0000kX4o\u0000pEom\fqX4.";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "#\u0016j].a\u0014j";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "m\u000baU+}\u001awB%c\u0010pW4{\u0010+X/#\u0000kX.k\u0000p_6g\u0017}";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    str = "m\u000baU+}\u001awB%c\u0010pW4{\u0010+X/#\u0010aD6k\u0011)E4o\u0017qE";
                    obj = 13;
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    strArr2 = strArr3;
                    str = "m\u000beB";
                    obj = 14;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "k\u000ee_,";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "x\u0006vE)a\r";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "|\u0006c";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "`\u0006rS2#\u0014l_,kNtZ5i\u0004aR";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public m5(Activity activity, by byVar, boolean z, boolean z2, String str) {
        this.d = false;
        this.a = activity;
        this.e = byVar;
        this.d = z;
        this.f = z2;
        this.c = str;
    }

    protected void a(Integer num) {
        Boolean bool;
        Integer num2 = null;
        boolean z = DialogToastActivity.f;
        this.a.removeDialog(122);
        if (!App.Q()) {
            Log.i(z[13]);
            this.e.f(this.a.getString(2131231746, new Object[]{this.a.getString(2131230939)}));
            if (!z) {
                return;
            }
        }
        if (this.b == null || this.b.size() == 0) {
            Log.i(z[14]);
            if (this.d) {
                if (!this.a.isFinishing()) {
                    this.a.showDialog(123);
                    if (!z) {
                        return;
                    }
                }
                return;
            }
            UserFeedbackActivity.a(this.a, this.c, (this.f ? z[15] : z[18]) + z[12], this.f ? Integer.valueOf(1) : null);
            if (!z) {
                return;
            }
        }
        Boolean bool2 = Boolean.TRUE;
        Boolean bool3 = Boolean.TRUE;
        ArrayList arrayList = new ArrayList();
        Boolean bool4 = bool2;
        bool2 = bool3;
        for (String str : this.b.keySet()) {
            if (z[17].equals(str)) {
                bool2 = (Boolean) this.b.get(str);
                if (!z) {
                    bool3 = bool2;
                    bool2 = bool4;
                    if (!z) {
                        bool = bool3;
                        bool4 = bool2;
                        break;
                    }
                    bool4 = bool2;
                    bool2 = bool3;
                }
            }
            bool = bool2;
            if (z[16].equals(str)) {
                bool2 = (Boolean) this.b.get(str);
                if (!z) {
                    bool3 = bool;
                    if (!z) {
                        bool = bool3;
                        bool4 = bool2;
                        break;
                    }
                    bool4 = bool2;
                    bool2 = bool3;
                } else {
                    bool4 = bool2;
                }
            }
            if (!((Boolean) this.b.get(str)).booleanValue()) {
                arrayList.add(str);
            }
            bool3 = bool;
            bool2 = bool4;
            if (!z) {
                bool = bool3;
                bool4 = bool2;
                break;
            }
            bool4 = bool2;
            bool2 = bool3;
        }
        bool = bool2;
        if (arrayList.size() == 0 && bool.booleanValue() && !this.d) {
            UserFeedbackActivity.a(this.a, this.c, null, this.f ? Integer.valueOf(1) : null);
            if (!z) {
                return;
            }
        }
        Context context = this.a;
        String str2 = this.c;
        if (this.f) {
            num2 = Integer.valueOf(1);
        }
        SystemStatusActivity.a(context, str2, num2, bool4.booleanValue(), bool.booleanValue(), arrayList, this.d);
    }

    protected Integer a(String[] strArr) {
        try {
            this.b = amb.b();
            if (!this.d) {
                a();
                Log.i(z[11] + b.a(f.INVISIBLE_ONLY) + "/" + b.a(f.BOTH) + z[9] + App.C(App.z()) + ")");
            }
            return Integer.valueOf(0);
        } catch (IOException e) {
            Log.w(z[10] + e.toString());
            this.b = null;
            return Integer.valueOf(-1);
        } catch (Exception e2) {
            Log.w(z[8] + e2.toString());
            this.b = null;
            return Integer.valueOf(-1);
        }
    }

    protected void onPostExecute(Object obj) {
        a((Integer) obj);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void a() {
        /*
        r4 = this;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = r4.a;	 Catch:{ SettingNotFoundException -> 0x0049, Exception -> 0x0053 }
        r0 = r0.getContentResolver();	 Catch:{ SettingNotFoundException -> 0x0049, Exception -> 0x0053 }
        r2 = z;	 Catch:{ SettingNotFoundException -> 0x0049, Exception -> 0x0053 }
        r3 = 6;
        r2 = r2[r3];	 Catch:{ SettingNotFoundException -> 0x0049, Exception -> 0x0053 }
        r0 = android.provider.Settings.System.getInt(r0, r2);	 Catch:{ SettingNotFoundException -> 0x0049, Exception -> 0x0053 }
        switch(r0) {
            case 0: goto L_0x0033;
            case 1: goto L_0x0041;
            case 2: goto L_0x003a;
            default: goto L_0x0014;
        };	 Catch:{ SettingNotFoundException -> 0x0049, Exception -> 0x0053 }
    L_0x0014:
        r0 = z;	 Catch:{ SettingNotFoundException -> 0x0049, Exception -> 0x0053 }
        r1 = 7;
        r0 = r0[r1];	 Catch:{ SettingNotFoundException -> 0x0049, Exception -> 0x0053 }
    L_0x0019:
        r1 = new java.lang.StringBuilder;	 Catch:{ SettingNotFoundException -> 0x0049, Exception -> 0x0053 }
        r1.<init>();	 Catch:{ SettingNotFoundException -> 0x0049, Exception -> 0x0053 }
        r2 = z;	 Catch:{ SettingNotFoundException -> 0x0049, Exception -> 0x0053 }
        r3 = 2;
        r2 = r2[r3];	 Catch:{ SettingNotFoundException -> 0x0049, Exception -> 0x0053 }
        r1 = r1.append(r2);	 Catch:{ SettingNotFoundException -> 0x0049, Exception -> 0x0053 }
        r0 = r1.append(r0);	 Catch:{ SettingNotFoundException -> 0x0049, Exception -> 0x0053 }
        r0 = r0.toString();	 Catch:{ SettingNotFoundException -> 0x0049, Exception -> 0x0053 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ SettingNotFoundException -> 0x0049, Exception -> 0x0053 }
    L_0x0032:
        return;
    L_0x0033:
        r0 = z;	 Catch:{ SettingNotFoundException -> 0x0049, Exception -> 0x0053 }
        r2 = 5;
        r0 = r0[r2];	 Catch:{ SettingNotFoundException -> 0x0049, Exception -> 0x0053 }
        if (r1 == 0) goto L_0x0019;
    L_0x003a:
        r0 = z;	 Catch:{ SettingNotFoundException -> 0x0049, Exception -> 0x0053 }
        r2 = 0;
        r0 = r0[r2];	 Catch:{ SettingNotFoundException -> 0x0049, Exception -> 0x0053 }
        if (r1 == 0) goto L_0x0019;
    L_0x0041:
        r0 = z;	 Catch:{ SettingNotFoundException -> 0x0049, Exception -> 0x0053 }
        r2 = 1;
        r0 = r0[r2];	 Catch:{ SettingNotFoundException -> 0x0049, Exception -> 0x0053 }
        if (r1 == 0) goto L_0x0019;
    L_0x0048:
        goto L_0x0014;
    L_0x0049:
        r0 = move-exception;
        r0 = z;
        r1 = 3;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        goto L_0x0032;
    L_0x0053:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 4;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        goto L_0x0032;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.m5.a():void");
    }

    protected Object doInBackground(Object[] objArr) {
        return a((String[]) objArr);
    }

    protected void onPreExecute() {
        this.a.showDialog(122);
    }
}
