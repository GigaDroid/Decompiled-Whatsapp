package com.whatsapp;

class sl implements Runnable {
    final HomeActivity a;

    sl(HomeActivity homeActivity) {
        this.a = homeActivity;
    }

    public void run() {
        HomeActivity.b(this.a, false);
    }
}
