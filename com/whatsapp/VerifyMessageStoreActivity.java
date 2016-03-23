package com.whatsapp;

import android.app.Dialog;
import android.content.Intent;
import android.support.annotation.CallSuper;

public class VerifyMessageStoreActivity extends UserFeedbackActivity {
    private aqq n;

    @CallSuper
    protected void onActivityResult(int i, int i2, Intent intent) {
        boolean z = DialogToastActivity.f;
        if (i == 200) {
            if (i2 == -1) {
                if (a()) {
                    c();
                    if (!z) {
                        return;
                    }
                }
                return;
            }
            c(false);
            if (!z) {
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    protected void c(boolean z) {
        this.n.a(z, true);
    }

    protected void h(int i) {
    }

    protected final boolean f(boolean z) {
        return this.n.b(z);
    }

    protected final boolean a() {
        return this.n.b(true);
    }

    protected void e(boolean z) {
    }

    protected void d(boolean z) {
        this.n.d(z);
    }

    public VerifyMessageStoreActivity() {
        this.n = new aql(this, this);
    }

    protected void c() {
        this.n.b();
    }

    protected void b() {
    }

    protected Dialog onCreateDialog(int i) {
        Dialog b = this.n.b(i);
        if (b != null) {
            return b;
        }
        return super.onCreateDialog(i);
    }
}
