package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class fy implements OnItemClickListener {
    final ListChatInfo a;

    fy(ListChatInfo listChatInfo) {
        this.a = listChatInfo;
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        l5 l5Var = ((am0) view.getTag()).e;
        if (l5Var != null) {
            ListChatInfo.b(this.a, l5Var);
            view.showContextMenu();
        }
    }
}
