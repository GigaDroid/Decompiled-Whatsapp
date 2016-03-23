package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import org.v;
import org.whispersystems.at;

class g_ implements OnClickListener {
    private static final String z;
    final GroupChatInfo a;

    static {
        char[] toCharArray = "l\u0005\u0014".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 6;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_spinnerStyle;
                    break;
                case at.i /*2*/:
                    i2 = 112;
                    break;
                case at.o /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 32;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(View view) {
        Intent intent = new Intent(this.a, GroupChatRecentLocationsActivity.class);
        intent.putExtra(z, GroupChatInfo.q(this.a));
        this.a.startActivity(intent);
    }

    g_(GroupChatInfo groupChatInfo) {
        this.a = groupChatInfo;
    }
}
