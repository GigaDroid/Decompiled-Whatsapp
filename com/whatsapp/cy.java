package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class cy implements OnClickListener {
    final VoipActivity a;

    public void onClick(View view) {
        View findViewById = this.a.findViewById(2131755979);
        View findViewById2 = this.a.findViewById(2131755974);
        if (findViewById != null) {
            if (findViewById.getVisibility() == 0) {
                findViewById.setVisibility(8);
                findViewById2.setVisibility(0);
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            findViewById.setVisibility(0);
            findViewById2.setVisibility(8);
        }
    }

    cy(VoipActivity voipActivity) {
        this.a = voipActivity;
    }
}
