package com.whatsapp;

import com.whatsapp.protocol.co;
import java.util.Collection;
import java.util.Map;

class ate extends akc {
    final StarredMessagesActivity a;

    ate(StarredMessagesActivity starredMessagesActivity) {
        this.a = starredMessagesActivity;
    }

    public void b(co coVar, int i) {
        if (coVar != null && coVar.P) {
            StarredMessagesActivity.a(this.a, coVar);
        }
    }

    public void a(Collection collection, String str, Map map, boolean z) {
        if ((collection != null && !collection.isEmpty() && map != null) || (collection == null && map == null)) {
            StarredMessagesActivity.e(this.a);
        }
    }

    public void a(Collection collection, Map map) {
        boolean z = DialogToastActivity.f;
        for (co coVar : collection) {
            if (coVar.P) {
                StarredMessagesActivity.e(this.a);
                if (!z) {
                    return;
                }
            }
            if (z) {
                return;
            }
        }
    }
}
