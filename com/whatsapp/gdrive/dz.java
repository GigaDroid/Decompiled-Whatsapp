package com.whatsapp.gdrive;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class dz implements OnClickListener {
    final int a;
    final SingleChoiceListDialogFragment b;

    dz(SingleChoiceListDialogFragment singleChoiceListDialogFragment, int i) {
        this.b = singleChoiceListDialogFragment;
        this.a = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        SingleChoiceListDialogFragment.a(this.b).e(this.a);
        dialogInterface.dismiss();
    }
}
