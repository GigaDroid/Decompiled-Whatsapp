package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class _v implements OnClickListener {
    final NewGroup a;

    _v(NewGroup newGroup) {
        this.a = newGroup;
    }

    public void onClick(View view) {
        NewGroup.a(this.a).q = NewGroup.c(this.a).getText().toString();
        r.a(NewGroup.a(this.a), this.a, 12);
    }
}
