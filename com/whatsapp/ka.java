package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import org.v;
import org.whispersystems.at;

class ka implements OnClickListener {
    private static final String z;
    final GroupChatInfo a;

    static {
        char[] toCharArray = "\u001b\u0002v".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 113;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_seekBarStyle;
                    break;
                case at.i /*2*/:
                    i2 = 18;
                    break;
                case at.o /*3*/:
                    i2 = 121;
                    break;
                default:
                    i2 = 12;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    ka(GroupChatInfo groupChatInfo) {
        this.a = groupChatInfo;
    }

    public void onClick(View view) {
        this.a.startActivity(new Intent(this.a, StarredMessagesActivity.class).putExtra(z, GroupChatInfo.z(this.a).p));
    }
}
