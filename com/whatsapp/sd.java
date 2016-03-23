package com.whatsapp;

import com.whatsapp.protocol.co;

class sd extends sx {
    final co u;
    final adn v;

    public void onPostExecute(Object obj) {
        a((aki) obj);
    }

    public void a(aki com_whatsapp_aki) {
        super.a(com_whatsapp_aki);
        if (com_whatsapp_aki == aki.SUCCESS && this.e) {
            a();
            this.u.M = true;
            App.a(this.u, false, 0);
        }
    }

    sd(adn com_whatsapp_adn, co coVar, boolean z, boolean z2, co coVar2) {
        this.v = com_whatsapp_adn;
        this.u = coVar2;
        super(coVar, z, z2);
    }
}
