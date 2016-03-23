package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import org.v;
import org.whispersystems.at;

class id implements OnClickListener {
    private static final String z;
    final GroupChatInfo a;

    static {
        char[] toCharArray = "h\u0018\u001b".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 2;
                    break;
                case at.g /*1*/:
                    i2 = 113;
                    break;
                case at.i /*2*/:
                    i2 = 127;
                    break;
                case at.o /*3*/:
                    i2 = 57;
                    break;
                default:
                    i2 = 97;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(View view) {
        if (App.aA()) {
            Intent intent = new Intent(this.a, GroupChatRecentLocationsActivity.class);
            intent.putExtra(z, GroupChatInfo.q(this.a));
            this.a.startActivity(intent);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        App.a(this.a, 2131231268, 0);
    }

    id(GroupChatInfo groupChatInfo) {
        this.a = groupChatInfo;
    }
}
