package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class am2 implements OnClickListener {
    final UserFeedbackActivity a;

    am2(UserFeedbackActivity userFeedbackActivity) {
        this.a = userFeedbackActivity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(123);
    }
}
