package com.whatsapp;

class a2f implements Runnable {
    final String a;
    final HomeActivity b;

    a2f(HomeActivity homeActivity, String str) {
        this.b = homeActivity;
        this.a = str;
    }

    public void run() {
        try {
            Thread.sleep(300);
            App.a(this.a, null);
        } catch (InterruptedException e) {
        }
    }
}
