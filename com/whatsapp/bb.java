package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import org.v;
import org.whispersystems.at;

class bb implements OnClickListener {
    private static final String z;
    final HomeActivity a;

    static {
        char[] toCharArray = ".\u001d\u000e".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 68;
                    break;
                case at.g /*1*/:
                    i2 = 116;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_ratingBarStyle;
                    break;
                case at.o /*3*/:
                    i2 = 115;
                    break;
                default:
                    i2 = 123;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    bb(HomeActivity homeActivity) {
        this.a = homeActivity;
    }

    public void onClick(View view) {
        String peerJid = Voip.getPeerJid();
        if (peerJid != null) {
            Intent intent = new Intent(this.a, VoipActivity.class);
            intent.putExtra(z, peerJid);
            this.a.startActivity(intent);
        }
    }
}
