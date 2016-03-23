package com.whatsapp;

import android.view.View;
import com.whatsapp.fieldstats.c;
import com.whatsapp.fieldstats.k;
import com.whatsapp.util.ap;

class yj extends ap {
    final ConversationsFragment b;

    yj(ConversationsFragment conversationsFragment) {
        this.b = conversationsFragment;
    }

    public void a(View view) {
        nf.a(k.TELL_A_FRIEND, c.EMPTY_CONVERSATIONS);
        App.b(this.b.getActivity());
    }
}
