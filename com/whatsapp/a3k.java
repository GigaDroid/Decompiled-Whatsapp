package com.whatsapp;

import java.util.Vector;

class a3k extends a3i {
    final GroupChatInfo j;

    a3k(GroupChatInfo groupChatInfo, String str, String str2, Vector vector, int i) {
        this.j = groupChatInfo;
        super(str, str2, vector, i);
    }

    public void a() {
        GroupChatInfo.k(this.j);
    }
}
