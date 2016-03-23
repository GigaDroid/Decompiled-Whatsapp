package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class xx implements OnClickListener {
    final CallLogActivity a;

    xx(CallLogActivity callLogActivity) {
        this.a = callLogActivity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        aup.a(this.a, true, CallLogActivity.a(this.a).p);
    }
}
