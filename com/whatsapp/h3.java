package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

class h3 implements OnCancelListener {
    final br a;

    h3(br brVar) {
        this.a = brVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        if (br.a(this.a) != null) {
            br.a(this.a).dismiss();
        }
        br.a(this.a, null);
        this.a.cancel(true);
        if (WebImagePicker.h(this.a.a) == this.a) {
            WebImagePicker.a(this.a.a, null);
        }
    }
}
