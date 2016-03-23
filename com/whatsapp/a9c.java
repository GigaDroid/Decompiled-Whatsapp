package com.whatsapp;

class a9c implements Runnable {
    final a3g a;

    public void run() {
        GroupChatLiveLocationsActivity.g(this.a.a).getController().animateTo(GroupChatLiveLocationsActivity.b(this.a.a).getMyLocation());
        if (GroupChatLiveLocationsActivity.g(this.a.a).getZoomLevel() < 17) {
            GroupChatLiveLocationsActivity.g(this.a.a).getController().setZoom(17);
        }
    }

    a9c(a3g com_whatsapp_a3g) {
        this.a = com_whatsapp_a3g;
    }
}
