package com.whatsapp;

class u5 implements nh {
    final WebSessionsActivity a;

    public void a(int i) {
    }

    public void a() {
        if (!this.a.isFinishing()) {
            this.a.runOnUiThread(new avm(this));
        }
    }

    u5(WebSessionsActivity webSessionsActivity) {
        this.a = webSessionsActivity;
    }
}
