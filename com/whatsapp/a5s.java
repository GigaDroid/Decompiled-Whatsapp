package com.whatsapp;

import java.util.Collection;

class a5s implements tm {
    final MessageDetailsActivity a;

    a5s(MessageDetailsActivity messageDetailsActivity) {
        this.a = messageDetailsActivity;
    }

    public void c(String str) {
    }

    public void a(Collection collection) {
    }

    public void d(String str) {
        if (MessageDetailsActivity.a(this.a, str)) {
            MessageDetailsActivity.g(this.a).notifyDataSetChanged();
        }
    }

    public void a(String str) {
    }

    public void b(String str) {
    }

    public void a() {
        MessageDetailsActivity.g(this.a).notifyDataSetChanged();
    }
}
