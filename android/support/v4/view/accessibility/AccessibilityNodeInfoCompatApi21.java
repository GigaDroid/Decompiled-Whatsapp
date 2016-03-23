package android.support.v4.view.accessibility;

import android.support.v4.app.NotificationCompatJellybean.Builder;
import android.support.v4.app.RemoteInputCompatBase.RemoteInput;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;

class AccessibilityNodeInfoCompatApi21 {
    public static void setError(Object obj, CharSequence charSequence) {
        ((AccessibilityNodeInfo) obj).setError(charSequence);
    }

    public static boolean removeAction(Object obj, Object obj2) {
        return ((AccessibilityNodeInfo) obj).removeAction((AccessibilityAction) obj2);
    }

    static Object newAccessibilityAction(int i, CharSequence charSequence) {
        return new AccessibilityAction(i, charSequence);
    }

    public static Object obtainCollectionItemInfo(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        int i5 = Builder.a;
        CollectionItemInfo obtain = CollectionItemInfo.obtain(i, i2, i3, i4, z, z2);
        if (i5 != 0) {
            RemoteInput.a++;
        }
        return obtain;
    }

    public static Object obtainCollectionInfo(int i, int i2, boolean z, int i3) {
        return CollectionInfo.obtain(i, i2, z, i3);
    }
}
