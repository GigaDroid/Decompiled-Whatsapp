package com.whatsapp;

import java.util.Vector;

class a3e extends a3i {
    final GroupChatInfo j;

    a3e(GroupChatInfo groupChatInfo, String str, String str2, Vector vector, int i) {
        this.j = groupChatInfo;
        super(str, str2, vector, i);
    }

    public void a() {
        super.a();
        GroupChatInfo.k(this.j);
    }
}
