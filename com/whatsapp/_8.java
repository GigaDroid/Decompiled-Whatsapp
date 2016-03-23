package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class _8 implements OnClickListener {
    final Conversation a;

    public void onClick(View view) {
        if (this.a.bc.getLastVisiblePosition() >= (this.a.bc.getCount() - this.a.bc.getFooterViewsCount()) - 1) {
            this.a.bc.setTranscriptMode(2);
            Conversation.Y(this.a);
        }
        this.a.bc.setFastScrollEnabled(false);
    }

    _8(Conversation conversation) {
        this.a = conversation;
    }
}
