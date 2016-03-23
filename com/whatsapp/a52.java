package com.whatsapp;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

class a52 extends Drawable {
    final ConversationRow a;

    public boolean setState(int[] iArr) {
        invalidateSelf();
        return true;
    }

    public void draw(Canvas canvas) {
    }

    a52(ConversationRow conversationRow) {
        this.a = conversationRow;
    }

    public boolean isStateful() {
        return true;
    }

    protected boolean onStateChange(int[] iArr) {
        return true;
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    protected boolean onLevelChange(int i) {
        return true;
    }
}
