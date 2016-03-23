package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import org.v;
import org.whispersystems.at;

class aw3 implements OnClickListener {
    private static final String z;
    final ProfilePhotoReminder a;

    static {
        char[] toCharArray = "U z=jc#o<vS*".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 60;
                    break;
                case at.g /*1*/:
                    i2 = 78;
                    break;
                case at.i /*2*/:
                    i2 = 10;
                    break;
                case at.o /*3*/:
                    i2 = 72;
                    break;
                default:
                    i2 = 30;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    aw3(ProfilePhotoReminder profilePhotoReminder) {
        this.a = profilePhotoReminder;
    }

    public void onClick(View view) {
        ((InputMethodManager) this.a.getSystemService(z)).hideSoftInputFromWindow(ProfilePhotoReminder.b(this.a).getWindowToken(), 0);
        ProfilePhotoReminder.d(this.a).a(this.a.findViewById(2131755630));
    }
}
