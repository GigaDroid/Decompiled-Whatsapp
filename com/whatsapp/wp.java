package com.whatsapp;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

class wp extends ViewOutlineProvider {
    final Conversation a;

    public void getOutline(View view, Outline outline) {
        int i = (int) (a4d.a().g * 48.0f);
        outline.setOval(0, 0, i, i);
    }

    wp(Conversation conversation) {
        this.a = conversation;
    }
}
