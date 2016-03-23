package com.whatsapp;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class DividerView extends TextView {
    public DividerView(Context context) {
        super(context);
    }

    public DividerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DividerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
    }
}
