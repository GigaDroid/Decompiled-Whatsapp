package com.whatsapp;

import java.util.Vector;

class a33 extends a3i {
    final GroupChatInfo j;

    a33(GroupChatInfo groupChatInfo, String str, String str2, Vector vector, int i) {
        this.j = groupChatInfo;
        super(str, str2, vector, i);
    }

    public void a() {
        GroupChatInfo.k(this.j);
    }
}
