package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.protocol.co;

class h5 implements OnClickListener {
    final ChatInfoActivity a;
    final co b;

    h5(ChatInfoActivity chatInfoActivity, co coVar) {
        this.a = chatInfoActivity;
        this.b = coVar;
    }

    public void onClick(View view) {
        this.a.startActivity(MediaView.a(this.b, this.a.a(), this.a.getBaseContext(), view));
    }
}
