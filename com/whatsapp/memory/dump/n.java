package com.whatsapp.memory.dump;

import com.whatsapp.App;
import com.whatsapp.fieldstats.ay;
import com.whatsapp.fieldstats.bj;
import com.whatsapp.fieldstats.i;

public class n {
    public static boolean a;

    public static void g() {
        a(bj.FAILED_NO_WIFI);
    }

    public static void c() {
        a(bj.FAILED_DUMP);
    }

    public static void b() {
        a(bj.SUCCESSFUL);
    }

    public static void f() {
        a(bj.FAILED_PI_CLEANING);
    }

    public static void a() {
        a(bj.FAILED_MULTIPLE_FILES);
    }

    public static void e() {
        a(bj.FAILED_NO_WIFI_2);
    }

    private static void a(bj bjVar) {
        av ayVar = new ay();
        ayVar.a = Double.valueOf((double) bjVar.getCode());
        i.a(App.z().getApplicationContext(), ayVar);
    }

    public static void d() {
        a(bj.FAILED_NETWORK_UPLOAD);
    }
}
