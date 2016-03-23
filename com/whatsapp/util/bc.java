package com.whatsapp.util;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.CorruptInstallationActivity;

final class bc implements Runnable {
    final Context a;

    public void run() {
        this.a.startActivity(new Intent(this.a, CorruptInstallationActivity.class).setFlags(268435456));
    }

    bc(Context context) {
        this.a = context;
    }
}
