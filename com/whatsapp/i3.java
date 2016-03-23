package com.whatsapp;

class i3 implements Runnable {
    final ProfilePhotoReminder a;

    public void run() {
        if (ProfilePhotoReminder.a(this.a).o == 0 && ProfilePhotoReminder.a(this.a).c == 0) {
            ProfilePhotoReminder.c(this.a).setVisibility(4);
        }
    }

    i3(ProfilePhotoReminder profilePhotoReminder) {
        this.a = profilePhotoReminder;
    }
}
