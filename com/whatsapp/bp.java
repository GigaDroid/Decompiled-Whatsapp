package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class bp implements OnClickListener {
    final SetStatus a;

    bp(SetStatus setStatus) {
        this.a = setStatus;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.removeDialog(3);
        SetStatus.v.clear();
        SetStatus.d(this.a);
        this.a.n.notifyDataSetChanged();
    }
}
