package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class a5m implements OnClickListener {
    final MuteDialogFragment a;
    final int[] b;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.b[0] = i;
    }

    a5m(MuteDialogFragment muteDialogFragment, int[] iArr) {
        this.a = muteDialogFragment;
        this.b = iArr;
    }
}
