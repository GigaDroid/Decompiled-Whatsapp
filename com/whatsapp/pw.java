package com.whatsapp;

class pw implements Runnable {
    final MessageDetailsActivity a;

    pw(MessageDetailsActivity messageDetailsActivity) {
        this.a = messageDetailsActivity;
    }

    public void run() {
        MessageDetailsActivity.g(this.a).notifyDataSetChanged();
        MessageDetailsActivity.c(this.a);
    }
}
