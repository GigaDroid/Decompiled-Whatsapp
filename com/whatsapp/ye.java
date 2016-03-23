package com.whatsapp;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.fieldstats.Events$Call;
import com.whatsapp.util.ap;

class ye extends ap {
    final CallRatingActivity b;

    public void a(View view) {
        String str = null;
        if (((double) CallRatingActivity.h(this.b).getRating()) >= 4.0d || CallRatingActivity.f(this.b).getVisibility() == 0) {
            if (CallRatingActivity.c(this.b) != null) {
                Double d;
                CallRatingActivity.c(this.b).userRating = Double.valueOf((double) CallRatingActivity.h(this.b).getRating());
                Events$Call c = CallRatingActivity.c(this.b);
                if (CallRatingActivity.b(this.b) == null) {
                    d = null;
                } else {
                    d = Double.valueOf(CallRatingActivity.b(this.b).doubleValue());
                }
                c.userProblems = d;
                CharSequence trim = CallRatingActivity.g(this.b).getText().toString().trim();
                c = CallRatingActivity.c(this.b);
                if (!TextUtils.isEmpty(trim)) {
                    CharSequence charSequence = trim;
                }
                c.userDescription = str;
            }
            this.b.finish();
            if (!DialogToastActivity.f) {
                return;
            }
        }
        CallRatingActivity.d(this.b).setVisibility(8);
        CallRatingActivity.f(this.b).setVisibility(0);
        ((TextView) this.b.findViewById(2131755357)).setText(2131230872);
        CallRatingActivity.a(this.b, Integer.valueOf(0));
    }

    ye(CallRatingActivity callRatingActivity) {
        this.b = callRatingActivity;
    }
}
