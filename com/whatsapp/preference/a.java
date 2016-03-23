package com.whatsapp.preference;

import android.content.DialogInterface;
import android.content.DialogInterface.OnMultiChoiceClickListener;

class a implements OnMultiChoiceClickListener {
    final WaMultiSelectListPreference a;

    a(WaMultiSelectListPreference waMultiSelectListPreference) {
        this.a = waMultiSelectListPreference;
    }

    public void onClick(DialogInterface dialogInterface, int i, boolean z) {
        WaMultiSelectListPreference.a(this.a)[i] = z;
    }
}
