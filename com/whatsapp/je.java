package com.whatsapp;

import android.text.Editable;
import android.text.TextWatcher;

class je implements TextWatcher {
    final Conversation a;

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    je(Conversation conversation) {
        this.a = conversation;
    }

    public void afterTextChanged(Editable editable) {
        if (!Conversation.ay(this.a)) {
            if (editable.toString().length() != 0) {
                App.b(this.a.aI.p, 0);
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            App.I(this.a.aI.p);
        }
    }
}
