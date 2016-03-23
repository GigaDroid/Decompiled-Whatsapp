package com.whatsapp;

class cm implements Runnable {
    final ProfileInfoActivity a;

    public void run() {
        if (ProfileInfoActivity.b(this.a).o == 0 && ProfileInfoActivity.b(this.a).c == 0) {
            ProfileInfoActivity.c(this.a).setVisibility(4);
        }
    }

    cm(ProfileInfoActivity profileInfoActivity) {
        this.a = profileInfoActivity;
    }
}
