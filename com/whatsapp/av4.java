package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.util.ArrayList;

class av4 implements OnClickListener {
    final ArrayList a;
    final BroadcastDetails b;

    public void onClick(DialogInterface dialogInterface, int i) {
        if (i < this.a.size()) {
            BroadcastDetails.a(this.b, BroadcastDetails.b(this.b), ((Integer) this.a.get(i)).intValue());
        }
        this.b.removeDialog(3);
    }

    av4(BroadcastDetails broadcastDetails, ArrayList arrayList) {
        this.b = broadcastDetails;
        this.a = arrayList;
    }
}
