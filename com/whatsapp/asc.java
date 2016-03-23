package com.whatsapp;

import org.whispersystems.at;

class asc implements Runnable {
    final ro a;
    final IdentityVerificationActivity b;

    public void run() {
        boolean z = DialogToastActivity.f;
        switch (awg.a[this.a.ordinal()]) {
            case at.g /*1*/:
                IdentityVerificationActivity.c(this.b).setText(this.b.getString(2131232205, new Object[]{IdentityVerificationActivity.a(this.b).i()}));
                IdentityVerificationActivity.c(this.b).setVisibility(0);
                IdentityVerificationActivity.h(this.b);
                if (!z) {
                    return;
                }
                break;
            case at.i /*2*/:
                break;
            case at.o /*3*/:
            case at.p /*4*/:
                break;
            default:
                return;
        }
        IdentityVerificationActivity.c(this.b).setText(this.b.getString(2131232206, new Object[]{IdentityVerificationActivity.a(this.b).i()}));
        IdentityVerificationActivity.c(this.b).setVisibility(0);
        IdentityVerificationActivity.h(this.b);
        if (!z) {
            return;
        }
        IdentityVerificationActivity.a(this.b, new alw(this));
    }

    asc(IdentityVerificationActivity identityVerificationActivity, ro roVar) {
        this.b = identityVerificationActivity;
        this.a = roVar;
    }
}
