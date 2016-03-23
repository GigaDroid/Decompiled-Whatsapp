package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import org.v;
import org.whispersystems.at;

class d6 implements OnClickListener {
    private static final String z;
    final GroupChatInfo a;

    static {
        char[] toCharArray = "[\u000ez".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 49;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_checkedTextViewStyle;
                    break;
                case at.i /*2*/:
                    i2 = 30;
                    break;
                case at.o /*3*/:
                    i2 = 115;
                    break;
                default:
                    i2 = 54;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    d6(GroupChatInfo groupChatInfo) {
        this.a = groupChatInfo;
    }

    public void onClick(View view) {
        Class cls = null;
        if (App.A()) {
            cls = GroupChatLiveLocationsActivity2.class;
        } else if (App.aA()) {
            cls = GroupChatLiveLocationsActivity.class;
        } else if (App.a2()) {
            cls = GroupChatLiveLocationsActivity.class;
        }
        if (cls != null) {
            Intent intent = new Intent(this.a, cls);
            intent.putExtra(z, GroupChatInfo.q(this.a));
            this.a.startActivity(intent);
        }
    }
}
