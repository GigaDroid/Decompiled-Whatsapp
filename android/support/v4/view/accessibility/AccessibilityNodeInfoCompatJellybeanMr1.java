package android.support.v4.view.accessibility;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

class AccessibilityNodeInfoCompatJellybeanMr1 {
    public static void setLabelFor(Object obj, View view) {
        ((AccessibilityNodeInfo) obj).setLabelFor(view);
    }
}
