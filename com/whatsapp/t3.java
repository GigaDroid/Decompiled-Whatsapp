package com.whatsapp;

class t3 implements Runnable {
    final GroupChatLiveLocationsActivity a;

    public void run() {
        if (GroupChatLiveLocationsActivity.f(this.a).j.size() == 0) {
            GroupChatLiveLocationsActivity.g(this.a).b(GroupChatLiveLocationsActivity.b(this.a).getMyLocation());
        }
    }

    t3(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        this.a = groupChatLiveLocationsActivity;
    }
}
