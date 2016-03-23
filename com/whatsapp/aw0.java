package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.fieldstats.cd;

class aw0 implements OnClickListener {
    final QuickContactActivity a;

    aw0(QuickContactActivity quickContactActivity) {
        this.a = quickContactActivity;
    }

    public void onClick(View view) {
        if (App.a(QuickContactActivity.a(this.a), this.a, cd.QUICK_CONTACT_INFO, true)) {
            QuickContactActivity.a(this.a, false);
        }
    }
}
