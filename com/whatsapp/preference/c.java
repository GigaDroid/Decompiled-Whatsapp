package com.whatsapp.preference;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class c implements OnClickListener {
    final WaFontListPreference a;

    public void onClick(DialogInterface dialogInterface, int i) {
        WaFontListPreference.a(this.a, i);
        this.a.onClick(dialogInterface, -1);
        dialogInterface.dismiss();
    }

    c(WaFontListPreference waFontListPreference) {
        this.a = waFontListPreference;
    }
}
