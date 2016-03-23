package com.whatsapp;

import android.text.TextUtils;
import com.whatsapp.protocol.b7;
import java.util.Comparator;

class am9 implements Comparator {
    final MessageDetailsActivity a;
    a3d b;

    public int a(au7 com_whatsapp_au7, au7 com_whatsapp_au72) {
        int i = 0;
        int a = b7.a(com_whatsapp_au72.a(), com_whatsapp_au7.a());
        if (a != 0) {
            return a;
        }
        if (com_whatsapp_au7.a == null) {
            return 1;
        }
        if (com_whatsapp_au72.a == null) {
            return -1;
        }
        l5 b = App.as.b(com_whatsapp_au7.a);
        l5 b2 = App.as.b(com_whatsapp_au72.a);
        if (TextUtils.isEmpty(b.q)) {
            a = 0;
        } else {
            a = 1;
        }
        if (!TextUtils.isEmpty(b2.q)) {
            i = 1;
        }
        if (a == i) {
            return this.b.a(b, b2);
        }
        if (a != 0) {
            return -1;
        }
        return 1;
    }

    am9(MessageDetailsActivity messageDetailsActivity) {
        this.a = messageDetailsActivity;
        this.b = new a3d(this.a.getApplicationContext());
    }

    public int compare(Object obj, Object obj2) {
        return a((au7) obj, (au7) obj2);
    }
}
