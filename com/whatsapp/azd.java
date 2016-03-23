package com.whatsapp;

import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.view.View;
import android.view.View.OnClickListener;
import org.v;
import org.whispersystems.at;

class azd implements OnClickListener {
    private static final String z;
    final ContactInfo a;

    static {
        char[] toCharArray = "@y*".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 16;
                    break;
                case at.i /*2*/:
                    i2 = 78;
                    break;
                case at.o /*3*/:
                    i2 = 98;
                    break;
                default:
                    i2 = 117;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(View view) {
        if (ContactInfo.h(this.a).a) {
            Intent intent = new Intent(this.a, ViewProfilePhoto.class);
            intent.putExtra(z, ContactInfo.h(this.a).p);
            ActivityCompat.startActivity(this.a, intent, ActivityOptionsCompat.makeSceneTransitionAnimation(this.a, ContactInfo.i(this.a), this.a.getString(2131232335)).toBundle());
            if (!DialogToastActivity.f) {
                return;
            }
        }
        App.a(this.a, 2131231564, 0);
        App.a(ContactInfo.h(this.a).p, ContactInfo.h(this.a).o, 2);
    }

    azd(ContactInfo contactInfo) {
        this.a = contactInfo;
    }
}
