package com.whatsapp;

class aen implements Runnable {
    final QuickContactActivity a;

    public void run() {
        QuickContactActivity.c(this.a).d();
        QuickContactActivity.c(this.a).b(new ad4(this));
    }

    aen(QuickContactActivity quickContactActivity) {
        this.a = quickContactActivity;
    }
}
