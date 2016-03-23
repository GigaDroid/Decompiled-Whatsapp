package com.whatsapp;

import android.widget.ScrollView;

class awh implements Runnable {
    final ContactPickerHelp a;

    public void run() {
        ((ScrollView) this.a.findViewById(2131755411)).fullScroll(130);
    }

    awh(ContactPickerHelp contactPickerHelp) {
        this.a = contactPickerHelp;
    }
}
