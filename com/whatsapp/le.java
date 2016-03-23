package com.whatsapp;

class le implements Runnable {
    final ChatInfoLayout a;

    public void run() {
        ChatInfoLayout.e(this.a).setSelectionFromTop(0, 0);
    }

    le(ChatInfoLayout chatInfoLayout) {
        this.a = chatInfoLayout;
    }
}
