package com.whatsapp;

final class jm implements as8 {
    final DialogToastActivity a;

    public void a(String str) {
        if (!this.a.isFinishing()) {
            this.a.a(2131231076, App.V() ? 2131230981 : 2131230982, new String[0]);
        }
    }

    public void b(String str) {
        if (!this.a.isFinishing()) {
            int i;
            DialogToastActivity dialogToastActivity = this.a;
            if (App.V()) {
                i = 2131230983;
            } else {
                i = 2131230984;
            }
            dialogToastActivity.a(2131231076, i, new String[0]);
        }
    }

    jm(DialogToastActivity dialogToastActivity) {
        this.a = dialogToastActivity;
    }

    public void b() {
        RequestPermissionActivity.a(this.a, 2131231660, 2131231659);
    }

    public void a() {
        RequestPermissionActivity.a(this.a, 2131231660, 2131231659);
    }
}
