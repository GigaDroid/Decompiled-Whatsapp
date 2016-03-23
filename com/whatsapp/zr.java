package com.whatsapp;

import android.view.View;
import com.whatsapp.WebSessionsActivity.LogoutAllConfirmationDialogFragment;
import com.whatsapp.util.ap;

class zr extends ap {
    final WebSessionsActivity b;

    zr(WebSessionsActivity webSessionsActivity) {
        this.b = webSessionsActivity;
    }

    public void a(View view) {
        new LogoutAllConfirmationDialogFragment().show(this.b.getSupportFragmentManager(), null);
    }
}
