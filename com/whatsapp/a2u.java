package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.CheckBox;

class a2u implements OnClickListener {
    final Conversation a;
    final CheckBox b;

    a2u(Conversation conversation, CheckBox checkBox) {
        this.a = conversation;
        this.b = checkBox;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        Conversation.b(this.a, 0);
        if (this.b.isChecked()) {
            App.aK.L(this.a.aI.p);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        App.aK.A(this.a.aI.p);
    }
}
