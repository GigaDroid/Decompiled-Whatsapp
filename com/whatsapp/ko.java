package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.Conversation.CapturePictureOrVideoDialogFragment;

class ko implements OnClickListener {
    final Conversation a;
    final boolean b;

    public void onClick(View view) {
        Conversation.k(this.a).dismiss();
        if (this.b) {
            this.a.b(new CapturePictureOrVideoDialogFragment());
            if (!DialogToastActivity.f) {
                return;
            }
        }
        Conversation.T(this.a);
    }

    ko(Conversation conversation, boolean z) {
        this.a = conversation;
        this.b = z;
    }
}
