package android.support.design.widget;

import android.view.View;
import android.view.ViewOutlineProvider;

class ViewUtilsLollipop {
    static void setBoundsViewOutlineProvider(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }
}
