package com.whatsapp;

class i5 implements Runnable {
    final WebSessionsActivity a;

    public void run() {
        WebSessionsActivity.c(this.a).notifyDataSetChanged();
        App.p.M().postDelayed(WebSessionsActivity.e(this.a), 30000);
    }

    i5(WebSessionsActivity webSessionsActivity) {
        this.a = webSessionsActivity;
    }
}
