package com.whatsapp;

class asw implements Runnable {
    final HomeActivity a;

    public void run() {
        HomeActivity.j(this.a);
    }

    asw(HomeActivity homeActivity) {
        this.a = homeActivity;
    }
}
