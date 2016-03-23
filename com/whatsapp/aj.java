package com.whatsapp;

class aj implements Runnable {
    final GroupChatInfo a;

    aj(GroupChatInfo groupChatInfo) {
        this.a = groupChatInfo;
    }

    public void run() {
        this.a.e();
    }
}
