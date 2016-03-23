package com.whatsapp.gdrive;

import com.whatsapp.App;
import com.whatsapp.a_3;
import de.greenrobot.event.h;

class a5 {
    final cy a;

    public void onEventAsync(a_3 com_whatsapp_a_3) {
        if (((Integer) cy.c(this.a).get()).intValue() == 28 && (App.az() == 2 || App.az() == 0)) {
            cy.c(this.a).set(Integer.valueOf(10));
            this.a.d((long) cy.d(this.a), 100);
        }
        if (((Integer) cy.c(this.a).get()).intValue() != 16) {
            return;
        }
        if (App.az() == 2 || App.az() == 0) {
            cy.c(this.a).set(Integer.valueOf(10));
            this.a.j((long) cy.d(this.a), 100);
        }
    }

    a5(cy cyVar) {
        this.a = cyVar;
        h.b().e(this);
    }
}
