package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.fieldstats.a;
import com.whatsapp.fieldstats.co;
import com.whatsapp.fieldstats.i;

class x2 implements OnClickListener {
    final ConversationsFragment a;

    public void onClick(View view) {
        i.a(App.z(), a.GROUP_CREATE_BANNER_CLICK, Integer.valueOf(1));
        NewGroup.a(this.a.getActivity(), co.BANNER, null);
    }

    x2(ConversationsFragment conversationsFragment) {
        this.a = conversationsFragment;
    }
}
