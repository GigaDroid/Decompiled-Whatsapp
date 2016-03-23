package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

class avl implements OnDismissListener {
    final RegisterPhone a;

    avl(RegisterPhone registerPhone) {
        this.a = registerPhone;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        RegisterPhone.a(this.a, null);
    }
}
