package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.appcompat.R;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;

public class ButtonBarLayout extends LinearLayout {
    private boolean mAllowStacking;
    private int mLastWidthSize;

    private boolean isStacked() {
        return getOrientation() == 1;
    }

    protected void onMeasure(int i, int i2) {
        int makeMeasureSpec;
        boolean z;
        boolean z2 = false;
        int size = MeasureSpec.getSize(i);
        if (this.mAllowStacking) {
            if (size > this.mLastWidthSize && isStacked()) {
                setStacked(false);
            }
            this.mLastWidthSize = size;
        }
        if (!isStacked() && MeasureSpec.getMode(i) == 1073741824) {
            makeMeasureSpec = MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            if (LinearLayoutCompat.a) {
                z2 = true;
            } else {
                z = true;
                super.onMeasure(makeMeasureSpec, i2);
                if (this.mAllowStacking && !isStacked() && (getMeasuredWidthAndState() & -16777216) == 16777216) {
                    setStacked(true);
                    z = true;
                }
                if (z) {
                    super.onMeasure(i, i2);
                }
            }
        }
        z = z2;
        makeMeasureSpec = i;
        super.onMeasure(makeMeasureSpec, i2);
        setStacked(true);
        z = true;
        if (z) {
            super.onMeasure(i, i2);
        }
    }

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mLastWidthSize = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ButtonBarLayout);
        this.mAllowStacking = obtainStyledAttributes.getBoolean(R.styleable.ButtonBarLayout_allowStacking, false);
        obtainStyledAttributes.recycle();
    }

    private void setStacked(boolean z) {
        int i;
        boolean z2 = LinearLayoutCompat.a;
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        setOrientation(i);
        setGravity(z ? 5 : 80);
        View findViewById = findViewById(R.id.spacer);
        if (findViewById != null) {
            if (z) {
                i = 8;
            } else {
                i = 4;
            }
            findViewById.setVisibility(i);
        }
        i = getChildCount() - 2;
        while (i >= 0) {
            bringChildToFront(getChildAt(i));
            i--;
            if (z2) {
                return;
            }
        }
    }
}
