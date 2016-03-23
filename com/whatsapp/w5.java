package com.whatsapp;

class w5 implements Runnable {
    final anv a;

    public void run() {
        if (this.a.m == null) {
            App.b((by) this.a.e);
            if (!this.a.e.isFinishing()) {
                App.a(null, App.z().getString(this.a.d ? 2131230844 : 2131232179));
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            return;
        }
        wn.a(this.a.m.b, 500);
    }

    w5(anv com_whatsapp_anv) {
        this.a = com_whatsapp_anv;
    }
}
