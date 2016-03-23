package com.whatsapp;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;

class a2j implements TextWatcher {
    final EditText a;
    final aqx b;

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        aam.a(this.a, charSequence);
    }

    public void afterTextChanged(Editable editable) {
        Conversation.c(this.b.a, editable.toString());
        Conversation.a(this.b.a, ael.h(Conversation.ap(this.b.a)));
        Conversation.h(this.b.a, Conversation.ap(this.b.a));
        if (TextUtils.isEmpty(Conversation.ap(this.b.a))) {
            Conversation.c(this.b.a);
        }
        this.b.a.bd.notifyDataSetChanged();
    }

    a2j(aqx com_whatsapp_aqx, EditText editText) {
        this.b = com_whatsapp_aqx;
        this.a = editText;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
