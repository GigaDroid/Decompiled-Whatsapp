package android.support.v4.widget;

import android.widget.PopupWindow;

class PopupWindowCompatApi23 {
    static void setWindowLayoutType(PopupWindow popupWindow, int i) {
        popupWindow.setWindowLayoutType(i);
    }

    static void setOverlapAnchor(PopupWindow popupWindow, boolean z) {
        popupWindow.setOverlapAnchor(z);
    }
}
