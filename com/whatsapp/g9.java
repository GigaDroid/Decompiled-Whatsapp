package com.whatsapp;

import android.view.View;

class g9 extends ge {
    final ConversationRow f;

    public void a(View view) {
        b2 k = this.f.k();
        if (k != null) {
            int a = k.a(this.f.e);
            if (a == 0) {
                a = 1;
            }
            k.a(this.f.e, a + 1);
            this.f.i();
        }
    }

    public g9(ConversationRow conversationRow, int i) {
        this.f = conversationRow;
        super(i, -65536, 0);
    }
}
