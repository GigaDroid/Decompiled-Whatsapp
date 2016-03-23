package com.whatsapp;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;
import android.widget.TextView.BufferType;

public class CondensedTextView extends TextView {
    private float a;
    private TextPaint b;

    public CondensedTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = 0.8f;
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            a(getText().toString());
        }
    }

    private void a(String str) {
        boolean z = DialogToastActivity.f;
        if (this.b == null || this.b.getTextSize() != getPaint().getTextSize()) {
            this.b = new TextPaint(getPaint());
            this.b.setTextScaleX(1.0f);
        }
        float measureText = this.b.measureText(str);
        if (measureText > 0.0f) {
            int measuredWidth = (getMeasuredWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight();
            if (measuredWidth > 0) {
                measureText = ((float) measuredWidth) / measureText;
                if (measureText < 1.0f) {
                    float max = Math.max(this.a, measureText);
                    setTextScaleX(max);
                    measureText = getPaint().measureText(str);
                    while (measureText > ((float) measuredWidth) && max > this.a) {
                        max *= 0.99f;
                        setTextScaleX(max);
                        measureText = getPaint().measureText(str);
                        if (z) {
                            break;
                        }
                    }
                    setSingleLine(true);
                    setHorizontallyScrolling(false);
                    if (!z) {
                        return;
                    }
                }
                if (getTextScaleX() != 1.0f) {
                    setTextScaleX(1.0f);
                }
            }
        }
    }

    public CondensedTextView(Context context) {
        super(context);
        this.a = 0.8f;
    }

    public CondensedTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0.8f;
    }

    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        a(getText().toString());
    }

    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        this.b.setTextSize(getPaint().getTextSize());
        a(getText().toString());
    }

    public void setText(CharSequence charSequence, BufferType bufferType) {
        super.setText(charSequence, bufferType);
        a(charSequence.toString());
    }
}
