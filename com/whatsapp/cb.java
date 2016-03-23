package com.whatsapp;

class cb implements Runnable {
    final EmojiPopupWindow$2 a;

    public void run() {
        this.a.a.setOnDismissListener(null);
        this.a.a.dismiss();
        this.a.a.a(k3.c(this.a.a));
    }

    cb(EmojiPopupWindow$2 emojiPopupWindow$2) {
        this.a = emojiPopupWindow$2;
    }
}
