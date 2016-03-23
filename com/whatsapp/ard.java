package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;

class ard implements OnClickListener {
    final CallRatingActivity a;

    public void onClick(View view) {
        ((CheckBox) this.a.findViewById(((Integer) view.getTag()).intValue())).performClick();
    }

    ard(CallRatingActivity callRatingActivity) {
        this.a = callRatingActivity;
    }
}
