package com.whatsapp;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class au3 implements OnClickListener {
    final ConversationsFragment a;

    public void onClick(View view) {
        this.a.startActivity(new Intent(this.a.getActivity(), ArchivedConversationsActivity.class));
    }

    au3(ConversationsFragment conversationsFragment) {
        this.a = conversationsFragment;
    }
}
