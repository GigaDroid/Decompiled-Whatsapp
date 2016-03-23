package com.whatsapp;

import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.view.View;
import android.view.View.OnClickListener;
import org.v;
import org.whispersystems.at;

class aia implements OnClickListener {
    private static final String z;
    final GroupChatInfo a;

    static {
        char[] toCharArray = "UjA".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 63;
                    break;
                case at.g /*1*/:
                    i2 = 3;
                    break;
                case at.i /*2*/:
                    i2 = 37;
                    break;
                case at.o /*3*/:
                    i2 = 4;
                    break;
                default:
                    i2 = 113;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onClick(View view) {
        boolean z = DialogToastActivity.f;
        if (!qm.h(GroupChatInfo.q(this.a))) {
            this.a.f(this.a.getString(2131231146));
            if (!z) {
                return;
            }
        }
        if (GroupChatInfo.z(this.a).a) {
            Intent intent = new Intent(this.a, ViewProfilePhoto.class);
            intent.putExtra(z, GroupChatInfo.z(this.a).p);
            ActivityCompat.startActivityForResult(this.a, intent, 14, ActivityOptionsCompat.makeSceneTransitionAnimation(this.a, GroupChatInfo.t(this.a), this.a.getString(2131232335)).toBundle());
            if (!z) {
                return;
            }
        }
        GroupChatInfo.A(this.a);
    }

    aia(GroupChatInfo groupChatInfo) {
        this.a = groupChatInfo;
    }
}
