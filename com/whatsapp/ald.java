package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class ald implements OnClickListener {
    final DialogToastPreferenceActivity a;

    ald(DialogToastPreferenceActivity dialogToastPreferenceActivity) {
        this.a = dialogToastPreferenceActivity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(500);
    }
}
