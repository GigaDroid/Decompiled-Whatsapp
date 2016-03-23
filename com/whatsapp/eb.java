package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import org.v;
import org.whispersystems.at;

class eb implements OnClickListener {
    private static final String z;
    final GroupChatInfo a;

    static {
        char[] toCharArray = "oH,".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 5;
                    break;
                case at.g /*1*/:
                    i2 = 33;
                    break;
                case at.i /*2*/:
                    i2 = 72;
                    break;
                case at.o /*3*/:
                    i2 = 114;
                    break;
                default:
                    i2 = 3;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.a, MediaGallery.class);
        intent.putExtra(z, GroupChatInfo.q(this.a));
        this.a.startActivity(intent);
    }

    eb(GroupChatInfo groupChatInfo) {
        this.a = groupChatInfo;
    }
}
