package android.support.design.widget;

import android.content.Context;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import java.util.List;

abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior {
    abstract View findFirstDependency(List list);

    int getScrollRange(View view) {
        return view.getMeasuredHeight();
    }

    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        int i5 = view.getLayoutParams().height;
        if (i5 != -1 && i5 != -2) {
            return false;
        }
        List dependencies = coordinatorLayout.getDependencies(view);
        if (dependencies.isEmpty()) {
            return false;
        }
        View findFirstDependency = findFirstDependency(dependencies);
        if (findFirstDependency == null || !ViewCompat.isLaidOut(findFirstDependency)) {
            return false;
        }
        if (ViewCompat.getFitsSystemWindows(findFirstDependency)) {
            ViewCompat.setFitsSystemWindows(view, true);
        }
        int size = MeasureSpec.getSize(i3);
        if (size == 0) {
            size = coordinatorLayout.getHeight();
        }
        coordinatorLayout.onMeasureChild(view, i, i2, MeasureSpec.makeMeasureSpec(getScrollRange(findFirstDependency) + (size - findFirstDependency.getMeasuredHeight()), i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
        return true;
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
