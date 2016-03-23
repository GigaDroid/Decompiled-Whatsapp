package com.whatsapp;

import android.app.ProgressDialog;
import android.content.Context;
import android.view.KeyEvent;

public class ue extends ProgressDialog {
    public ue(Context context) {
        super(context);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 84) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }
}
