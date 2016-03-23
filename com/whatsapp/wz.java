package com.whatsapp;

import com.whatsapp.protocol.co;
import java.util.HashMap;

class wz implements be {
    final HashMap a;
    final Conversation b;

    wz(Conversation conversation, HashMap hashMap) {
        this.b = conversation;
        this.a = hashMap;
    }

    public void a() {
        boolean z = DialogToastActivity.f;
        if (Conversation.g(this.b) && Conversation.f(this.b) > 0) {
            int a = a4l.a(this.b.bd);
            if (this.b.bd.getCount() > a + 1) {
                co b = this.b.bd.b(a + 1);
                for (co coVar : this.a.values()) {
                    if (coVar.b >= b.b) {
                        Conversation.b(this.b, 0);
                        if (!z) {
                            break;
                        }
                    }
                    if (z) {
                        break;
                    }
                }
            }
        }
        this.b.b();
    }
}
