package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import org.v;
import org.whispersystems.at;

class axl implements OnClickListener {
    private static final String z;
    final Conversation a;

    static {
        char[] toCharArray = "z\tH".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 16;
                    break;
                case at.g /*1*/:
                    i2 = 96;
                    break;
                case at.i /*2*/:
                    i2 = 44;
                    break;
                case at.o /*3*/:
                    i2 = 110;
                    break;
                default:
                    i2 = 28;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(View view) {
        String peerJid = Voip.getPeerJid();
        if (peerJid != null) {
            Intent intent = new Intent(this.a, VoipActivity.class);
            intent.putExtra(z, peerJid);
            this.a.startActivity(intent);
        }
    }

    axl(Conversation conversation) {
        this.a = conversation;
    }
}
