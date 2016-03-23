package com.whatsapp;

import com.whatsapp.protocol.co;

class ati extends akc {
    final MessageDetailsActivity a;

    public void a(co coVar) {
        d(coVar);
    }

    ati(MessageDetailsActivity messageDetailsActivity) {
        this.a = messageDetailsActivity;
    }

    public void a(String str) {
        if (str != null && str.equals(MessageDetailsActivity.e(this.a).k.c) && App.aK.a(MessageDetailsActivity.e(this.a).k) == null) {
            this.a.finish();
        }
    }

    private void d(co coVar) {
        this.a.runOnUiThread(new aaq(this, coVar));
    }

    public void b(co coVar, int i) {
        d(coVar);
    }
}
