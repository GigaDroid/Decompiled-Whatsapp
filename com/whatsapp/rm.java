package com.whatsapp;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

class rm implements OnEditorActionListener {
    final aqx a;

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3 && (keyEvent == null || keyEvent.getKeyCode() != 66 || keyEvent.getAction() != 0)) {
            return false;
        }
        Conversation.e(this.a.a, true);
        return true;
    }

    rm(aqx com_whatsapp_aqx) {
        this.a = com_whatsapp_aqx;
    }
}
