package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class zg implements OnClickListener {
    final QuickContactActivity a;

    zg(QuickContactActivity quickContactActivity) {
        this.a = quickContactActivity;
    }

    public void onClick(View view) {
        this.a.startActivity(Conversation.a(QuickContactActivity.a(this.a)));
        QuickContactActivity.a(this.a, false);
    }
}
