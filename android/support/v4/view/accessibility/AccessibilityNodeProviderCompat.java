package android.support.v4.view.accessibility;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import java.util.ArrayList;
import java.util.List;

public class AccessibilityNodeProviderCompat {
    private static final AccessibilityNodeProviderImpl IMPL;
    private final Object mProvider;

    interface AccessibilityNodeProviderImpl {
        Object newAccessibilityNodeProviderBridge(AccessibilityNodeProviderCompat accessibilityNodeProviderCompat);
    }

    class AccessibilityNodeProviderStubImpl implements AccessibilityNodeProviderImpl {
        AccessibilityNodeProviderStubImpl() {
        }

        public Object newAccessibilityNodeProviderBridge(AccessibilityNodeProviderCompat accessibilityNodeProviderCompat) {
            return null;
        }
    }

    class AccessibilityNodeProviderJellyBeanImpl extends AccessibilityNodeProviderStubImpl {

        class 1 implements AccessibilityNodeInfoBridge {
            final AccessibilityNodeProviderJellyBeanImpl this$0;
            final AccessibilityNodeProviderCompat val$compat;

            public boolean performAction(int i, int i2, Bundle bundle) {
                return this.val$compat.performAction(i, i2, bundle);
            }

            1(AccessibilityNodeProviderJellyBeanImpl accessibilityNodeProviderJellyBeanImpl, AccessibilityNodeProviderCompat accessibilityNodeProviderCompat) {
                this.this$0 = accessibilityNodeProviderJellyBeanImpl;
                this.val$compat = accessibilityNodeProviderCompat;
            }

            public Object createAccessibilityNodeInfo(int i) {
                AccessibilityNodeInfoCompat createAccessibilityNodeInfo = this.val$compat.createAccessibilityNodeInfo(i);
                if (createAccessibilityNodeInfo == null) {
                    return null;
                }
                return createAccessibilityNodeInfo.getInfo();
            }

            public List findAccessibilityNodeInfosByText(String str, int i) {
                int i2 = AccessibilityNodeInfoCompat.a;
                List findAccessibilityNodeInfosByText = this.val$compat.findAccessibilityNodeInfosByText(str, i);
                List arrayList = new ArrayList();
                int size = findAccessibilityNodeInfosByText.size();
                int i3 = 0;
                while (i3 < size) {
                    arrayList.add(((AccessibilityNodeInfoCompat) findAccessibilityNodeInfosByText.get(i3)).getInfo());
                    int i4 = i3 + 1;
                    if (i2 != 0) {
                        break;
                    }
                    i3 = i4;
                }
                if (FragmentActivity.a != 0) {
                    AccessibilityNodeInfoCompat.a = i2 + 1;
                }
                return arrayList;
            }
        }

        public Object newAccessibilityNodeProviderBridge(AccessibilityNodeProviderCompat accessibilityNodeProviderCompat) {
            return AccessibilityNodeProviderCompatJellyBean.newAccessibilityNodeProviderBridge(new 1(this, accessibilityNodeProviderCompat));
        }

        AccessibilityNodeProviderJellyBeanImpl() {
        }
    }

    class AccessibilityNodeProviderKitKatImpl extends AccessibilityNodeProviderStubImpl {

        class 1 implements AccessibilityNodeInfoBridge {
            final AccessibilityNodeProviderKitKatImpl this$0;
            final AccessibilityNodeProviderCompat val$compat;

            public Object findFocus(int i) {
                AccessibilityNodeInfoCompat findFocus = this.val$compat.findFocus(i);
                if (findFocus == null) {
                    return null;
                }
                return findFocus.getInfo();
            }

            public List findAccessibilityNodeInfosByText(String str, int i) {
                int i2 = AccessibilityNodeInfoCompat.a;
                List findAccessibilityNodeInfosByText = this.val$compat.findAccessibilityNodeInfosByText(str, i);
                List arrayList = new ArrayList();
                int size = findAccessibilityNodeInfosByText.size();
                int i3 = 0;
                while (i3 < size) {
                    arrayList.add(((AccessibilityNodeInfoCompat) findAccessibilityNodeInfosByText.get(i3)).getInfo());
                    int i4 = i3 + 1;
                    if (i2 != 0) {
                        break;
                    }
                    i3 = i4;
                }
                return arrayList;
            }

            public Object createAccessibilityNodeInfo(int i) {
                AccessibilityNodeInfoCompat createAccessibilityNodeInfo = this.val$compat.createAccessibilityNodeInfo(i);
                if (createAccessibilityNodeInfo == null) {
                    return null;
                }
                return createAccessibilityNodeInfo.getInfo();
            }

            1(AccessibilityNodeProviderKitKatImpl accessibilityNodeProviderKitKatImpl, AccessibilityNodeProviderCompat accessibilityNodeProviderCompat) {
                this.this$0 = accessibilityNodeProviderKitKatImpl;
                this.val$compat = accessibilityNodeProviderCompat;
            }

            public boolean performAction(int i, int i2, Bundle bundle) {
                return this.val$compat.performAction(i, i2, bundle);
            }
        }

        AccessibilityNodeProviderKitKatImpl() {
        }

        public Object newAccessibilityNodeProviderBridge(AccessibilityNodeProviderCompat accessibilityNodeProviderCompat) {
            return AccessibilityNodeProviderCompatKitKat.newAccessibilityNodeProviderBridge(new 1(this, accessibilityNodeProviderCompat));
        }
    }

    public boolean performAction(int i, int i2, Bundle bundle) {
        return false;
    }

    public AccessibilityNodeProviderCompat() {
        this.mProvider = IMPL.newAccessibilityNodeProviderBridge(this);
    }

    public AccessibilityNodeInfoCompat findFocus(int i) {
        return null;
    }

    public AccessibilityNodeProviderCompat(Object obj) {
        this.mProvider = obj;
    }

    public Object getProvider() {
        return this.mProvider;
    }

    public AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int i) {
        return null;
    }

    static {
        if (VERSION.SDK_INT >= 19) {
            IMPL = new AccessibilityNodeProviderKitKatImpl();
        } else if (VERSION.SDK_INT >= 16) {
            IMPL = new AccessibilityNodeProviderJellyBeanImpl();
        } else {
            IMPL = new AccessibilityNodeProviderStubImpl();
        }
    }

    public List findAccessibilityNodeInfosByText(String str, int i) {
        return null;
    }
}
