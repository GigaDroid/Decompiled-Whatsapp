package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class p4 implements OnClickListener {
    final HomeActivity a;

    p4(HomeActivity homeActivity) {
        this.a = homeActivity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        HomeActivity.c(this.a);
    }
}
