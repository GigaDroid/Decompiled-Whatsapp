package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class fu implements OnItemClickListener {
    final GroupChatInfo a;

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        l5 l5Var = ((an_) view.getTag()).d;
        if (l5Var != null && GroupChatInfo.r(this.a).containsKey(l5Var.p)) {
            GroupChatInfo.c(this.a, l5Var.p);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        if (l5Var != null) {
            GroupChatInfo.a(this.a, l5Var);
            view.showContextMenu();
        }
    }

    fu(GroupChatInfo groupChatInfo) {
        this.a = groupChatInfo;
    }
}
