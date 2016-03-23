package com.whatsapp.gdrive;

import android.text.style.ClickableSpan;
import android.view.View;

class e7 extends ClickableSpan {
    final au a;

    e7(au auVar) {
        this.a = auVar;
    }

    public void onClick(View view) {
        GoogleDriveActivity.t(this.a.a.a);
    }
}
