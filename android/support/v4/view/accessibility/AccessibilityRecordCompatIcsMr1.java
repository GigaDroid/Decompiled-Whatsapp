package android.support.v4.view.accessibility;

import android.view.accessibility.AccessibilityRecord;

class AccessibilityRecordCompatIcsMr1 {
    public static void setMaxScrollX(Object obj, int i) {
        ((AccessibilityRecord) obj).setMaxScrollX(i);
    }

    public static void setMaxScrollY(Object obj, int i) {
        ((AccessibilityRecord) obj).setMaxScrollY(i);
    }
}
