package com.tonicartos.widget.stickygridheaders;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

public class StickyGridHeadersBaseAdapterWrapper$HeaderFillerView extends FrameLayout {
    final a a;
    private int b;
    private int c;

    public void setHeaderWidth(int i) {
        this.b = i;
    }

    protected LayoutParams m442generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    protected void onMeasure(int i, int i2) {
        View view = (View) getTag();
        if (view.getLayoutParams() == null) {
            view.setLayoutParams(generateDefaultLayoutParams());
        }
        if (view.getVisibility() != 8 && view.getMeasuredHeight() == 0) {
            view.measure(MeasureSpec.makeMeasureSpec(this.b, 1073741824), MeasureSpec.makeMeasureSpec(0, 0));
        }
        setMeasuredDimension(MeasureSpec.getSize(i), view.getMeasuredHeight());
    }

    public void setHeaderId(int i) {
        this.c = i;
    }

    public StickyGridHeadersBaseAdapterWrapper$HeaderFillerView(a aVar, Context context, AttributeSet attributeSet, int i) {
        this.a = aVar;
        super(context, attributeSet, i);
    }

    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return generateDefaultLayoutParams();
    }

    public StickyGridHeadersBaseAdapterWrapper$HeaderFillerView(a aVar, Context context) {
        this.a = aVar;
        super(context);
    }

    public int a() {
        return this.c;
    }

    public StickyGridHeadersBaseAdapterWrapper$HeaderFillerView(a aVar, Context context, AttributeSet attributeSet) {
        this.a = aVar;
        super(context, attributeSet);
    }
}
