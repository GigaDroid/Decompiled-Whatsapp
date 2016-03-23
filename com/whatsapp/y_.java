package com.whatsapp;

import android.view.View;
import com.whatsapp.util.ap;
import com.whatsapp.util.bu;
import java.util.Iterator;

class y_ extends ap {
    final ConversationRowContact b;

    y_(ConversationRowContact conversationRowContact, ee eeVar) {
        this(conversationRowContact);
    }

    private y_(ConversationRowContact conversationRowContact) {
        this.b = conversationRowContact;
    }

    public void a(View view) {
        boolean z = DialogToastActivity.f;
        if (ConversationRowContact.f(this.b) == 1) {
            Iterator it = ConversationRowContact.d(this.b).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str != null) {
                    bu.a(str, this.b.getContext());
                    if (!z) {
                        break;
                    }
                }
                if (z) {
                    break;
                }
            }
            if (!z) {
                return;
            }
        }
        this.b.a();
    }
}
