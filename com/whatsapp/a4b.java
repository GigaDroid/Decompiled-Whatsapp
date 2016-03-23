package com.whatsapp;

import android.support.v7.widget.PopupMenu.OnMenuItemClickListener;
import android.view.MenuItem;

class a4b implements OnMenuItemClickListener {
    final ano a;

    public boolean onMenuItemClick(MenuItem menuItem) {
        DeleteAccountFeedback.a(this.a.a, menuItem.getItemId());
        this.a.b.setText(menuItem.getTitle());
        DeleteAccountFeedback.a(this.a.a).setHint(DeleteAccountFeedback.c(this.a.a) == 3 ? 2131231022 : 2131231021);
        return false;
    }

    a4b(ano com_whatsapp_ano) {
        this.a = com_whatsapp_ano;
    }
}
