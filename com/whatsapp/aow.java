package com.whatsapp;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

class aow extends ClickableSpan {
    final TosUpdateActivity a;

    aow(TosUpdateActivity tosUpdateActivity) {
        this.a = tosUpdateActivity;
    }

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(-12417548);
    }

    public void onClick(View view) {
        TosUpdateActivity.b(this.a);
    }
}
