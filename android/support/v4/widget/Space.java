package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import org.v;

public class Space extends View {
    public Space(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Space(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getVisibility() == 0) {
            setVisibility(4);
        }
    }

    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(getDefaultSize2(getSuggestedMinimumWidth(), i), getDefaultSize2(getSuggestedMinimumHeight(), i2));
    }

    public Space(Context context) {
        this(context, null);
    }

    private static int getDefaultSize2(int i, int i2) {
        int i3 = CursorAdapter.a;
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        switch (mode) {
            case Integer.MIN_VALUE:
                break;
            case v.m /*0*/:
                if (i3 == 0) {
                    return i;
                }
                break;
            case 1073741824:
                break;
            default:
                return i;
        }
        i = Math.min(i, size);
        if (i3 == 0) {
            return i;
        }
        return size;
    }

    public void draw(Canvas canvas) {
    }
}
