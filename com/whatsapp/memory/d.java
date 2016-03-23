package com.whatsapp.memory;

import android.app.Activity;
import com.whatsapp.App;
import com.whatsapp.WAAppCompatActivity;

public class d {
    public static int a;
    private static d b;

    public void a(Activity activity) {
        int i = a;
        App.p.M().postDelayed(new b(activity), 30000);
        if (i != 0) {
            WAAppCompatActivity.c++;
        }
    }

    public static d a() {
        if (b == null) {
            b = new d();
        }
        return b;
    }
}
