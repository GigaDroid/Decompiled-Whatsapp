package com.whatsapp;

import android.content.Context;
import android.os.AsyncTask;
import com.amazon.device.home.GroupedListHeroWidget;
import com.amazon.device.home.HomeManager;
import com.whatsapp.util.bq;

public class a5e {
    public static boolean c;
    private AsyncTask a;
    private GroupedListHeroWidget b;
    private HomeManager d;
    private Context e;

    static String[] b(String str, int i) {
        return a(str, i);
    }

    static Context c(a5e com_whatsapp_a5e) {
        return com_whatsapp_a5e.e;
    }

    static HomeManager a(a5e com_whatsapp_a5e) {
        return com_whatsapp_a5e.d;
    }

    static GroupedListHeroWidget b(a5e com_whatsapp_a5e) {
        return com_whatsapp_a5e.b;
    }

    static GroupedListHeroWidget a(a5e com_whatsapp_a5e, GroupedListHeroWidget groupedListHeroWidget) {
        com_whatsapp_a5e.b = groupedListHeroWidget;
        return groupedListHeroWidget;
    }

    public void a() {
        boolean z = false;
        boolean z2 = c;
        if (this.a != null) {
            this.a.cancel(true);
        }
        this.a = new hy(this);
        bq.a(this.a, new Void[0]);
        if (WAAppCompatActivity.c != 0) {
            if (!z2) {
                z = true;
            }
            c = z;
        }
    }

    public a5e(Context context) {
        this.e = context;
        this.d = HomeManager.getInstance(context);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String[] a(java.lang.String r4, int r5) {
        /*
        r3 = 1;
        r2 = 0;
        r0 = 2;
        r1 = new java.lang.String[r0];
        r0 = r4.length();
        if (r0 > r5) goto L_0x0016;
    L_0x000b:
        r1[r2] = r4;
        r0 = "";
        r1[r3] = r0;
        r0 = c;
        if (r0 == 0) goto L_0x002f;
    L_0x0016:
        r0 = com.whatsapp.util.l.a();
        r0.setText(r4);
        r0 = r0.preceding(r5);
        if (r0 != 0) goto L_0x0030;
    L_0x0023:
        r0 = r4.substring(r2, r5);
        r1[r2] = r0;
        r0 = r4.substring(r5);
        r1[r3] = r0;
    L_0x002f:
        return r1;
    L_0x0030:
        r5 = r0;
        goto L_0x0023;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a5e.a(java.lang.String, int):java.lang.String[]");
    }
}
