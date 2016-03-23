package com.whatsapp;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.ActivityCompat;
import android.view.View;
import android.view.View.OnClickListener;
import org.v;
import org.whispersystems.at;

class b4 implements OnClickListener {
    private static final String z;
    final QuickContactActivity a;

    static {
        char[] toCharArray = "\u0012n[".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 120;
                    break;
                case at.g /*1*/:
                    i2 = 7;
                    break;
                case at.i /*2*/:
                    i2 = 63;
                    break;
                case at.o /*3*/:
                    i2 = 38;
                    break;
                default:
                    i2 = 63;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    b4(QuickContactActivity quickContactActivity) {
        this.a = quickContactActivity;
    }

    public void onClick(View view) {
        if (!QuickContactActivity.a(this.a).a) {
            return;
        }
        if ((QuickContactActivity.a(this.a).m && !QuickContactActivity.a(this.a).m()) || QuickContactActivity.a(this.a).c()) {
            Intent intent = new Intent(this.a.getApplicationContext(), ViewProfilePhoto.class);
            intent.putExtra(z, QuickContactActivity.a(this.a).p);
            if (VERSION.SDK_INT < 21) {
                this.a.startActivity(intent);
                QuickContactActivity.a(this.a, false);
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            ActivityCompat.startActivity(this.a, intent, ActivityOptions.makeSceneTransitionAnimation(this.a, QuickContactActivity.b(this.a), this.a.getString(2131232335)).toBundle());
            new Handler(Looper.getMainLooper()).postDelayed(new um(this), (long) this.a.getResources().getInteger(17694721));
        }
    }
}
