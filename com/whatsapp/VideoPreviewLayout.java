package com.whatsapp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;

public class VideoPreviewLayout extends ViewGroup {
    public VideoPreviewLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public VideoPreviewLayout(Context context) {
        super(context);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        int measuredHeight2;
        int measuredHeight3;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        View findViewById = findViewById(2131755395);
        View findViewById2 = findViewById(2131755396);
        if (findViewById2.getVisibility() == 8) {
            findViewById2 = findViewById(2131755454);
        }
        View findViewById3 = findViewById(2131755946);
        View findViewById4 = findViewById(2131755949);
        if (i6 > i5) {
            measuredHeight = findViewById2.getMeasuredHeight();
            measuredHeight2 = findViewById3.getMeasuredHeight();
            measuredHeight3 = findViewById4.getMeasuredHeight();
            findViewById.layout(i, i2, i3, i2 + measuredHeight);
            findViewById3.layout(i, i2 + measuredHeight, i3, (i2 + measuredHeight) + measuredHeight2);
            findViewById4.layout(i, (i2 + measuredHeight) + measuredHeight2, i3, ((measuredHeight + i2) + measuredHeight2) + measuredHeight3);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        int measuredWidth = (findViewById2.getMeasuredWidth() + findViewById.getPaddingLeft()) + findViewById.getPaddingRight();
        i5 = ((i5 - ((i5 / 2) + measuredWidth)) / 2) + i;
        findViewById.layout(i5, i2, i5 + measuredWidth, i4);
        int measuredHeight4 = findViewById3.getMeasuredHeight();
        measuredHeight = findViewById3.getMeasuredWidth();
        measuredHeight2 = findViewById4.getMeasuredHeight();
        measuredHeight3 = findViewById4.getMeasuredWidth();
        i6 = ((i6 - measuredHeight4) - measuredHeight2) / 2;
        findViewById3.layout(i5 + measuredWidth, i2 + i6, measuredHeight + (i5 + measuredWidth), (i2 + i6) + measuredHeight4);
        findViewById4.layout(i5 + measuredWidth, (i2 + i6) + measuredHeight4, (measuredWidth + i5) + measuredHeight3, ((i2 + i6) + measuredHeight4) + measuredHeight2);
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        View findViewById = findViewById(2131755395);
        View findViewById2 = findViewById(2131755946);
        View findViewById3 = findViewById(2131755949);
        if (measuredHeight > measuredWidth) {
            findViewById2.measure(i, MeasureSpec.makeMeasureSpec(0, 0));
            findViewById3.measure(i, MeasureSpec.makeMeasureSpec(0, 0));
            findViewById.measure(i, MeasureSpec.makeMeasureSpec((measuredHeight - findViewById2.getMeasuredHeight()) - findViewById3.getMeasuredHeight(), 1073741824));
            if (!DialogToastActivity.f) {
                return;
            }
        }
        findViewById.measure(MeasureSpec.makeMeasureSpec(measuredWidth / 2, Integer.MIN_VALUE), i2);
        findViewById2.measure(MeasureSpec.makeMeasureSpec(measuredWidth / 2, 1073741824), MeasureSpec.makeMeasureSpec(0, 0));
        findViewById3.measure(MeasureSpec.makeMeasureSpec(measuredWidth / 2, 1073741824), MeasureSpec.makeMeasureSpec(0, 0));
    }

    public VideoPreviewLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
