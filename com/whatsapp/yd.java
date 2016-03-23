package com.whatsapp;

import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.view.View;
import com.whatsapp.util.ap;
import com.whatsapp.util.bu;

class yd extends ap {
    final ConversationRowContact b;

    yd(ConversationRowContact conversationRowContact, ee eeVar) {
        this(conversationRowContact);
    }

    private yd(ConversationRowContact conversationRowContact) {
        this.b = conversationRowContact;
    }

    public void a(View view) {
        if (VERSION.SDK_INT < 11) {
            if (ConversationRowContact.c(this.b) != null) {
                l5 f = App.as.f(ConversationRowContact.c(this.b));
                if (f != null) {
                    Bitmap g = f.g();
                    if (g != null) {
                        ConversationRowContact.a(this.b, g);
                    }
                }
            }
            bu.a(ConversationRowContact.e(this.b), ConversationRowContact.b(this.b), ConversationRowContact.a(this.b), ConversationRowContact.d(this.b), (DialogToastActivity) this.b.getContext());
            if (!DialogToastActivity.f) {
                return;
            }
        }
        this.b.b();
    }
}
