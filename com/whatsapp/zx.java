package com.whatsapp;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import com.whatsapp.util.ap;

class zx extends ap {
    final CheckBox b;
    final TosUpdateDetailsActivity c;

    zx(TosUpdateDetailsActivity tosUpdateDetailsActivity, CheckBox checkBox) {
        this.c = tosUpdateDetailsActivity;
        this.b = checkBox;
    }

    public void a(View view) {
        boolean z;
        boolean z2 = true;
        this.c.setResult(-1);
        Context baseContext = this.c.getBaseContext();
        if (this.b.isChecked()) {
            z = false;
        } else {
            z = true;
        }
        vh.b(baseContext, z);
        if (this.b.isChecked()) {
            z2 = false;
        }
        App.k(z2);
        this.c.finish();
    }
}
