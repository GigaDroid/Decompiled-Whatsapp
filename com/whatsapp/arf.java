package com.whatsapp;

final class arf implements Runnable {
    public void run() {
        if (CallRatingActivity.c() != null) {
            CallRatingActivity.c().finish();
        }
    }

    arf() {
    }
}
