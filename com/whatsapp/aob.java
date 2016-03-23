package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;

class aob implements OnClickListener {
    final RegisterName a;

    public void onClick(View view) {
        ((CheckBox) this.a.findViewById(2131755865)).toggle();
    }

    aob(RegisterName registerName) {
        this.a = registerName;
    }
}
