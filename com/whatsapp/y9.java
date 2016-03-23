package com.whatsapp;

import android.view.View;
import com.whatsapp.fieldstats.c;
import com.whatsapp.fieldstats.k;
import com.whatsapp.util.ap;

class y9 extends ap {
    final CallsFragment b;

    y9(CallsFragment callsFragment) {
        this.b = callsFragment;
    }

    public void a(View view) {
        nf.a(k.TELL_A_FRIEND, c.EMPTY_CALLS);
        App.b(this.b.getActivity());
    }
}
