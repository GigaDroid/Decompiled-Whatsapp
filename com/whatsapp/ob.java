package com.whatsapp;

class ob implements Runnable {
    final HomeActivity a;
    final String b;

    ob(HomeActivity homeActivity, String str) {
        this.a = homeActivity;
        this.b = str;
    }

    public void run() {
        try {
            Thread.sleep(300);
            App.q(this.b);
        } catch (InterruptedException e) {
        }
    }
}
