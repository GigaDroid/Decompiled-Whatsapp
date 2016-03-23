package com.whatsapp;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;
import com.whatsapp.util.Log;
import com.whatsapp.util.u;
import org.v;
import org.whispersystems.at;

class anm implements OnTouchListener {
    private static final String z;
    final FrameLayout a;
    final a_p b;
    final Activity c;

    static {
        char[] toCharArray = "\"<*bl+81sz3?7mk,?qw}6&=b{*'0v{*$-".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 67;
                    break;
                case at.g /*1*/:
                    i2 = 72;
                    break;
                case at.i /*2*/:
                    i2 = 94;
                    break;
                case at.o /*3*/:
                    i2 = 3;
                    break;
                default:
                    i2 = 15;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    anm(a_p com_whatsapp_a_p, FrameLayout frameLayout, Activity activity) {
        this.b = com_whatsapp_a_p;
        this.a = frameLayout;
        this.c = activity;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 4) {
            this.b.dismiss();
            return true;
        }
        if (App.j == 3) {
            Log.i(z);
            u.a(this.a, this.c, true);
        }
        return false;
    }
}
