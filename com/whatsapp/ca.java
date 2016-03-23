package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.util.List;

class ca implements OnClickListener {
    final ys a;
    final List b;

    public void onClick(DialogInterface dialogInterface, int i) {
        if (i < ConversationRowContact.a(this.a.b).size()) {
            ys.a(this.a, (String) this.b.get(i));
            if (!DialogToastActivity.f) {
                return;
            }
        }
        ys.b(this.a, (String) this.b.get(i));
    }

    ca(ys ysVar, List list) {
        this.a = ysVar;
        this.b = list;
    }
}
