package com.whatsapp;

class lv implements Runnable {
    final sz a;

    lv(sz szVar) {
        this.a = szVar;
    }

    public void run() {
        GroupChatRecentLocationsActivity.l(this.a.a.a).setText(this.a.a.a.getString(2131231513));
    }
}
