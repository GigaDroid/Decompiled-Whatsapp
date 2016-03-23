package com.whatsapp;

import android.content.Intent;
import android.view.View;
import com.whatsapp.ChatInfoActivity.EncryptionExplanationDialogFragment;
import com.whatsapp.util.ap;
import org.v;
import org.whispersystems.at;

class y5 extends ap {
    private static final String z;
    final ContactInfo b;

    static {
        char[] toCharArray = "\u000e{\t".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 100;
                    break;
                case at.g /*1*/:
                    i2 = 18;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_switchStyle;
                    break;
                case at.o /*3*/:
                    i2 = 73;
                    break;
                default:
                    i2 = 7;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void a(View view) {
        if (App.as.a(ContactInfo.h(this.b).p, it.ALLOW)) {
            Intent intent = new Intent(this.b, IdentityVerificationActivity.class);
            intent.putExtra(z, ContactInfo.h(this.b).p);
            this.b.startActivity(intent);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        EncryptionExplanationDialogFragment.a(ContactInfo.h(this.b).p).show(this.b.getSupportFragmentManager(), null);
    }

    y5(ContactInfo contactInfo) {
        this.b = contactInfo;
    }
}
