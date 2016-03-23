package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

class kp implements OnCancelListener {
    final BroadcastDetails a;

    kp(BroadcastDetails broadcastDetails) {
        this.a = broadcastDetails;
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.a.removeDialog(3);
    }
}
