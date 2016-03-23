package android.support.v4.view;

import android.os.Build.VERSION;
import android.support.v4.internal.view.SupportMenuItem;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import org.v;
import org.whispersystems.at;

public class MenuItemCompat {
    static final MenuVersionImpl IMPL;
    private static final String[] z;

    interface MenuVersionImpl {
        boolean expandActionView(MenuItem menuItem);

        View getActionView(MenuItem menuItem);

        boolean isActionViewExpanded(MenuItem menuItem);

        MenuItem setActionView(MenuItem menuItem, int i);

        MenuItem setActionView(MenuItem menuItem, View view);

        MenuItem setOnActionExpandListener(MenuItem menuItem, OnActionExpandListener onActionExpandListener);

        void setShowAsAction(MenuItem menuItem, int i);
    }

    class BaseMenuVersionImpl implements MenuVersionImpl {
        public void setShowAsAction(MenuItem menuItem, int i) {
        }

        public MenuItem setOnActionExpandListener(MenuItem menuItem, OnActionExpandListener onActionExpandListener) {
            return menuItem;
        }

        public MenuItem setActionView(MenuItem menuItem, int i) {
            return menuItem;
        }

        BaseMenuVersionImpl() {
        }

        public MenuItem setActionView(MenuItem menuItem, View view) {
            return menuItem;
        }

        public boolean expandActionView(MenuItem menuItem) {
            return false;
        }

        public boolean isActionViewExpanded(MenuItem menuItem) {
            return false;
        }

        public View getActionView(MenuItem menuItem) {
            return null;
        }
    }

    class HoneycombMenuVersionImpl implements MenuVersionImpl {
        public boolean isActionViewExpanded(MenuItem menuItem) {
            return false;
        }

        public void setShowAsAction(MenuItem menuItem, int i) {
            MenuItemCompatHoneycomb.setShowAsAction(menuItem, i);
        }

        public boolean expandActionView(MenuItem menuItem) {
            return false;
        }

        HoneycombMenuVersionImpl() {
        }

        public MenuItem setActionView(MenuItem menuItem, View view) {
            return MenuItemCompatHoneycomb.setActionView(menuItem, view);
        }

        public View getActionView(MenuItem menuItem) {
            return MenuItemCompatHoneycomb.getActionView(menuItem);
        }

        public MenuItem setActionView(MenuItem menuItem, int i) {
            return MenuItemCompatHoneycomb.setActionView(menuItem, i);
        }

        public MenuItem setOnActionExpandListener(MenuItem menuItem, OnActionExpandListener onActionExpandListener) {
            return menuItem;
        }
    }

    class IcsMenuVersionImpl extends HoneycombMenuVersionImpl {

        class 1 implements SupportActionExpandProxy {
            final IcsMenuVersionImpl this$0;
            final OnActionExpandListener val$listener;

            1(IcsMenuVersionImpl icsMenuVersionImpl, OnActionExpandListener onActionExpandListener) {
                this.this$0 = icsMenuVersionImpl;
                this.val$listener = onActionExpandListener;
            }

            public boolean onMenuItemActionCollapse(MenuItem menuItem) {
                return this.val$listener.onMenuItemActionCollapse(menuItem);
            }

            public boolean onMenuItemActionExpand(MenuItem menuItem) {
                return this.val$listener.onMenuItemActionExpand(menuItem);
            }
        }

        IcsMenuVersionImpl() {
        }

        public boolean isActionViewExpanded(MenuItem menuItem) {
            return MenuItemCompatIcs.isActionViewExpanded(menuItem);
        }

        public boolean expandActionView(MenuItem menuItem) {
            return MenuItemCompatIcs.expandActionView(menuItem);
        }

        public MenuItem setOnActionExpandListener(MenuItem menuItem, OnActionExpandListener onActionExpandListener) {
            if (onActionExpandListener == null) {
                return MenuItemCompatIcs.setOnActionExpandListener(menuItem, null);
            }
            return MenuItemCompatIcs.setOnActionExpandListener(menuItem, new 1(this, onActionExpandListener));
        }
    }

    public interface OnActionExpandListener {
        boolean onMenuItemActionCollapse(MenuItem menuItem);

        boolean onMenuItemActionExpand(MenuItem menuItem);
    }

    public static View getActionView(MenuItem menuItem) {
        return menuItem instanceof SupportMenuItem ? ((SupportMenuItem) menuItem).getActionView() : IMPL.getActionView(menuItem);
    }

    public static MenuItem setActionView(MenuItem menuItem, View view) {
        return menuItem instanceof SupportMenuItem ? ((SupportMenuItem) menuItem).setActionView(view) : IMPL.setActionView(menuItem, view);
    }

    public static MenuItem setActionProvider(MenuItem menuItem, ActionProvider actionProvider) {
        if (menuItem instanceof SupportMenuItem) {
            return ((SupportMenuItem) menuItem).setSupportActionProvider(actionProvider);
        }
        Log.w(z[1], z[0]);
        return menuItem;
    }

    static {
        String[] strArr = new String[2];
        String str = "JY=3rMU&\u001cAKS?\u001bu\\NsRxMY$RuVY:R\u007fVHi\u001b|IP,\u001ftWHi!dIL&\u0000etY'\u0007XMY$I1P['\u001dcPR.";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = 57;
                        break;
                    case at.g /*1*/:
                        i3 = 60;
                        break;
                    case at.i /*2*/:
                        i3 = 73;
                        break;
                    case at.o /*3*/:
                        i3 = 114;
                        break;
                    default:
                        i3 = 17;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    int i4 = VERSION.SDK_INT;
                    if (i4 >= 14) {
                        IMPL = new IcsMenuVersionImpl();
                        return;
                    } else if (i4 >= 11) {
                        IMPL = new HoneycombMenuVersionImpl();
                        return;
                    } else {
                        IMPL = new BaseMenuVersionImpl();
                        return;
                    }
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "tY'\u0007XMY$1~TL(\u0006";
                    obj = null;
            }
        }
    }

    public static void setShowAsAction(MenuItem menuItem, int i) {
        if (menuItem instanceof SupportMenuItem) {
            ((SupportMenuItem) menuItem).setShowAsAction(i);
            if (ViewCompat.a == 0) {
                return;
            }
        }
        IMPL.setShowAsAction(menuItem, i);
    }

    public static boolean isActionViewExpanded(MenuItem menuItem) {
        return menuItem instanceof SupportMenuItem ? ((SupportMenuItem) menuItem).isActionViewExpanded() : IMPL.isActionViewExpanded(menuItem);
    }

    public static boolean expandActionView(MenuItem menuItem) {
        return menuItem instanceof SupportMenuItem ? ((SupportMenuItem) menuItem).expandActionView() : IMPL.expandActionView(menuItem);
    }

    public static MenuItem setOnActionExpandListener(MenuItem menuItem, OnActionExpandListener onActionExpandListener) {
        if (menuItem instanceof SupportMenuItem) {
            return ((SupportMenuItem) menuItem).setSupportOnActionExpandListener(onActionExpandListener);
        }
        return IMPL.setOnActionExpandListener(menuItem, onActionExpandListener);
    }

    public static MenuItem setActionView(MenuItem menuItem, int i) {
        if (menuItem instanceof SupportMenuItem) {
            return ((SupportMenuItem) menuItem).setActionView(i);
        }
        return IMPL.setActionView(menuItem, i);
    }
}
