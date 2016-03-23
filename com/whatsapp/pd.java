package com.whatsapp;

class pd implements Runnable {
    final GroupChatInfo a;

    public void run() {
        GroupChatInfo.a(this.a);
    }

    pd(GroupChatInfo groupChatInfo) {
        this.a = groupChatInfo;
    }
}
