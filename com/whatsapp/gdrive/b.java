package com.whatsapp.gdrive;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;

final class b implements OnClickListener {
    final OnCancelListener a;

    public void onClick(DialogInterface dialogInterface, int i) {
        if (this.a != null) {
            this.a.onCancel(dialogInterface);
        }
    }

    b(OnCancelListener onCancelListener) {
        this.a = onCancelListener;
    }
}
