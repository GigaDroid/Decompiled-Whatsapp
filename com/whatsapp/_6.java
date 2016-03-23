package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.util.bq;

class _6 implements OnClickListener {
    final DescribeProblemActivity a;

    _6(DescribeProblemActivity describeProblemActivity) {
        this.a = describeProblemActivity;
    }

    public void onClick(View view) {
        boolean z = DialogToastActivity.f;
        int length = DescribeProblemActivity.a(this.a).getText().toString().trim().getBytes().length;
        if (length < 10) {
            if (length == 0) {
                App.b(this.a.getBaseContext(), this.a.getString(2131231064), 0);
                if (!z) {
                    return;
                }
            }
            App.b(this.a.getBaseContext(), this.a.getString(2131231065), 0);
            if (!z) {
                return;
            }
        }
        DescribeProblemActivity.d(this.a).g = DescribeProblemActivity.a(this.a).getText().toString().trim();
        bq.a(DescribeProblemActivity.f(this.a), new Void[0]);
    }
}
