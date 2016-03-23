package com.whatsapp;

import android.database.DataSetObserver;

class _9 extends DataSetObserver {
    final Conversation a;

    public void onInvalidated() {
        Conversation.m(this.a, false);
    }

    public void onChanged() {
        if (App.am < 1) {
        }
    }

    _9(Conversation conversation) {
        this.a = conversation;
    }
}
