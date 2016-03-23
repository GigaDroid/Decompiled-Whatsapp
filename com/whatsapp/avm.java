package com.whatsapp;

class avm implements Runnable {
    final u5 a;

    avm(u5 u5Var) {
        this.a = u5Var;
    }

    public void run() {
        WebSessionsActivity.c(this.a.a).a(wn.e());
        if (WebSessionsActivity.c(this.a.a).getCount() > 0) {
            WebSessionsActivity.d(this.a.a).setVisibility(0);
            WebSessionsActivity.a(this.a.a).setVisibility(0);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        WebSessionsActivity.d(this.a.a).setVisibility(8);
        WebSessionsActivity.a(this.a.a).setVisibility(8);
    }
}
