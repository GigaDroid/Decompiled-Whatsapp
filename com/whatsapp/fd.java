package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class fd implements OnClickListener {
    final RecordAudio a;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(0);
        this.a.finish();
    }

    fd(RecordAudio recordAudio) {
        this.a = recordAudio;
    }
}
