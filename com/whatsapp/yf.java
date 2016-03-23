package com.whatsapp;

import android.view.View;
import com.whatsapp.ChatInfoActivity.EncryptionExplanationDialogFragment;
import com.whatsapp.util.ap;

class yf extends ap {
    final GroupChatInfo b;

    yf(GroupChatInfo groupChatInfo) {
        this.b = groupChatInfo;
    }

    public void a(View view) {
        EncryptionExplanationDialogFragment.a(GroupChatInfo.q(this.b)).show(this.b.getSupportFragmentManager(), null);
    }
}
