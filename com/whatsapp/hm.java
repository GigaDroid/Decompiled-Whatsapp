package com.whatsapp;

import android.text.Editable;
import android.widget.EditText;
import android.widget.TextView;

class hm extends hu {
    final CallRatingActivity f;

    public void afterTextChanged(Editable editable) {
        super.afterTextChanged(editable);
        CallRatingActivity.e(this.f);
    }

    hm(CallRatingActivity callRatingActivity, EditText editText, TextView textView, int i) {
        this.f = callRatingActivity;
        super(editText, textView, i);
    }
}
