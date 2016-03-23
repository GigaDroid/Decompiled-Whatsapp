package com.tonicartos.widget.stickygridheaders;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

public class StickyGridHeadersBaseAdapterWrapper$ReferenceView extends FrameLayout {
    private int a;
    final a b;
    private boolean c;
    private View[] d;
    private int e;

    protected LayoutParams m443generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    public Object getTag(int i) {
        return getChildAt(0).getTag(i);
    }

    private void a(int i, int i2) {
        boolean z = StickyGridHeadersGridView.a;
        if (!this.c) {
            this.c = true;
            View[] viewArr = this.d;
            int length = viewArr.length;
            int i3 = 0;
            while (i3 < length) {
                View view = viewArr[i3];
                if (view != null) {
                    view.measure(i, i2);
                }
                i3++;
                if (z) {
                    break;
                }
            }
            this.c = false;
        }
    }

    protected void onMeasure(int i, int i2) {
        boolean z = StickyGridHeadersGridView.a;
        super.onMeasure(i, i2);
        if (this.e != 1 && a.b(this.b) != null) {
            if (this.a % this.e == this.e - 1) {
                a(i, i2);
            }
            int measuredHeight = getMeasuredHeight();
            View[] viewArr = this.d;
            int length = viewArr.length;
            int i3 = 0;
            int i4 = measuredHeight;
            while (i3 < length) {
                View view = viewArr[i3];
                if (view != null) {
                    i4 = Math.max(i4, view.getMeasuredHeight());
                }
                i3++;
                if (z) {
                    break;
                }
            }
            if (i4 != measuredHeight) {
                super.onMeasure(i, MeasureSpec.makeMeasureSpec(i4, 1073741824));
            }
        }
    }

    public void setNumColumns(int i) {
        this.e = i;
    }

    public void setPosition(int i) {
        this.a = i;
    }

    public View a() {
        return getChildAt(0);
    }

    public void setTag(int i, Object obj) {
        getChildAt(0).setTag(i, obj);
    }

    public void setTag(Object obj) {
        getChildAt(0).setTag(obj);
    }

    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return generateDefaultLayoutParams();
    }

    @SuppressLint({"NewApi"})
    public void setRowSiblings(View[] viewArr) {
        this.d = viewArr;
    }

    @TargetApi(11)
    public StickyGridHeadersBaseAdapterWrapper$ReferenceView(a aVar, Context context, AttributeSet attributeSet, int i) {
        this.b = aVar;
        super(context, attributeSet, i);
    }

    public StickyGridHeadersBaseAdapterWrapper$ReferenceView(a aVar, Context context) {
        this.b = aVar;
        super(context);
    }

    public Object getTag() {
        return getChildAt(0).getTag();
    }

    public StickyGridHeadersBaseAdapterWrapper$ReferenceView(a aVar, Context context, AttributeSet attributeSet) {
        this.b = aVar;
        super(context, attributeSet);
    }
}
