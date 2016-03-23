package com.whatsapp;

import java.util.Collection;

class ao_ implements tm {
    final MediaView a;

    public void d(String str) {
        if (MediaView.d(this.a) != null && MediaView.d(this.a).equals(str)) {
            this.a.removeDialog(1);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        l5 e = App.as.e();
        if (e != null && str.equals(e.p)) {
            this.a.removeDialog(0);
        }
    }

    public void b(String str) {
    }

    public void a(String str) {
    }

    public void c(String str) {
    }

    public void a() {
    }

    public void a(Collection collection) {
    }

    ao_(MediaView mediaView) {
        this.a = mediaView;
    }
}
