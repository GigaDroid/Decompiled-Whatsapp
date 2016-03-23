package com.whatsapp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.RelativeLayout;

public class ConversationContentLayout extends RelativeLayout {
    private int a;
    private boolean b;

    public ConversationContentLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.b) {
            super.onLayout(z, i, i2, i3, i2 + this.a);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    public void setFreezeHeight() {
        setFreezeHeight(getHeight());
    }

    protected void onMeasure(int i, int i2) {
        if (this.b) {
            super.onMeasure(i, MeasureSpec.makeMeasureSpec(this.a, Integer.MIN_VALUE));
            if (!DialogToastActivity.f) {
                return;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setUnfreezeHeight() {
        if (this.b) {
            this.b = false;
            requestLayout();
        }
    }

    public ConversationContentLayout(Context context) {
        super(context);
    }

    public void setFreezeHeight(int i) {
        if (!this.b || this.a != i) {
            this.b = true;
            this.a = i;
            requestLayout();
        }
    }

    public ConversationContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationContentLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
