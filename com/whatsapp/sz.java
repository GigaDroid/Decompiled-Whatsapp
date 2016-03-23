package com.whatsapp;

class sz implements Runnable {
    final axm a;

    public void run() {
        GroupChatRecentLocationsActivity.a(this.a.a).getController().animateTo(GroupChatRecentLocationsActivity.c(this.a.a).getMyLocation());
        GroupChatRecentLocationsActivity.a(this.a.a).getController().setZoom(17);
        this.a.a.runOnUiThread(new lv(this));
    }

    sz(axm com_whatsapp_axm) {
        this.a = com_whatsapp_axm;
    }
}
