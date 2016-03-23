package com.whatsapp;

import android.support.annotation.UiThread;
import android.text.TextUtils;
import com.whatsapp.util.ac;
import com.whatsapp.util.bf;
import com.whatsapp.util.bq;
import java.util.ArrayList;
import java.util.HashMap;

public class ae2 {
    private static HashMap a;
    private static bf b;

    static HashMap a() {
        return a;
    }

    static bf b() {
        return b;
    }

    private static void b(String str, pi piVar, boolean z) {
        App.p.M().post(new am4(z, str, piVar));
    }

    static {
        b = new bf(16);
        a = new HashMap();
    }

    @UiThread
    public static pi a(String str) {
        return str == null ? null : (pi) b.get(str);
    }

    static void a(String str, pi piVar, boolean z) {
        b(str, piVar, z);
    }

    @UiThread
    public static void a(String str, av1 com_whatsapp_av1) {
        if (!TextUtils.isEmpty(str) && !ac.a((CharSequence) str)) {
            pi a = a(str);
            if (a == null) {
                ArrayList arrayList = (ArrayList) a.get(str);
                if (arrayList != null) {
                    arrayList.add(com_whatsapp_av1);
                    return;
                }
                arrayList = new ArrayList(1);
                arrayList.add(com_whatsapp_av1);
                a.put(str, arrayList);
                bq.a(new gs(new pi(str), str));
            } else if (com_whatsapp_av1 != null) {
                com_whatsapp_av1.a(a);
            }
        } else if (com_whatsapp_av1 != null) {
            com_whatsapp_av1.a(null);
        }
    }
}
