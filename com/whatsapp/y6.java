package com.whatsapp;

import android.view.View;
import com.whatsapp.ChatInfoActivity.EncryptionExplanationDialogFragment;
import com.whatsapp.util.ap;

class y6 extends ap {
    final ListChatInfo b;

    public void a(View view) {
        EncryptionExplanationDialogFragment.a(ListChatInfo.f(this.b).p).show(this.b.getSupportFragmentManager(), null);
    }

    y6(ListChatInfo listChatInfo) {
        this.b = listChatInfo;
    }
}
