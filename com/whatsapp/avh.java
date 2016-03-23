package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class avh implements OnClickListener {
    final ContactPickerHelp a;

    public void onClick(View view) {
        this.a.w.setChecked(!this.a.w.isChecked());
    }

    avh(ContactPickerHelp contactPickerHelp) {
        this.a = contactPickerHelp;
    }
}
