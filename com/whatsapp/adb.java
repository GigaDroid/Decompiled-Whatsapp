package com.whatsapp;

import android.app.Activity;
import android.support.v7.view.ActionMode;
import android.view.MenuItem;
import java.util.Map;

class adb extends adp {
    final Conversation o;

    public void f() {
        if (this.o.v != null) {
            this.o.v.finish();
        }
    }

    public void onDestroyActionMode(ActionMode actionMode) {
        super.onDestroyActionMode(actionMode);
        this.o.u = null;
        this.o.bd.notifyDataSetChanged();
        this.o.v = null;
    }

    public Map a() {
        return this.o.u;
    }

    adb(Conversation conversation, Activity activity) {
        this.o = conversation;
        super(activity);
    }

    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        if (this.o.u == null || this.o.u.size() == 0) {
            return true;
        }
        if (menuItem.getItemId() != 2131755014 && menuItem.getItemId() != 2131755015 && menuItem.getItemId() != 2131755038 && menuItem.getItemId() != 2131755017) {
            return super.onActionItemClicked(actionMode, menuItem);
        }
        this.o.a(menuItem.getItemId(), qm.c(b()));
        f();
        return true;
    }
}
