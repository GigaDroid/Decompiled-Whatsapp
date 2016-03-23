package com.whatsapp;

import com.whatsapp.protocol.bb;
import java.util.Vector;

class a35 extends a3i {
    final GroupChatInfo j;

    a35(GroupChatInfo groupChatInfo, String str, String str2, Vector vector, int i, bb bbVar) {
        this.j = groupChatInfo;
        super(str, str2, vector, i, bbVar);
    }

    public void a() {
        super.a();
        if (!this.j.isFinishing()) {
            GroupChatInfo.d(this.j).postDelayed(new ku(this), 300);
        }
    }

    public void a(int i) {
        this.j.runOnUiThread(new re(this, i));
    }
}
