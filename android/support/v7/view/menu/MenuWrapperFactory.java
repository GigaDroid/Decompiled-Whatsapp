package android.support.v7.view.menu;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.internal.view.SupportMenuItem;
import android.support.v4.internal.view.SupportSubMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

public final class MenuWrapperFactory {
    public static SubMenu wrapSupportSubMenu(Context context, SupportSubMenu supportSubMenu) {
        try {
            if (VERSION.SDK_INT >= 14) {
                return new SubMenuWrapperICS(context, supportSubMenu);
            }
            throw new UnsupportedOperationException();
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public static Menu wrapSupportMenu(Context context, SupportMenu supportMenu) {
        try {
            if (VERSION.SDK_INT >= 14) {
                return new MenuWrapperICS(context, supportMenu);
            }
            throw new UnsupportedOperationException();
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public static MenuItem wrapSupportMenuItem(Context context, SupportMenuItem supportMenuItem) {
        try {
            if (VERSION.SDK_INT >= 16) {
                return new MenuItemWrapperJB(context, supportMenuItem);
            }
            try {
                if (VERSION.SDK_INT >= 14) {
                    return new MenuItemWrapperICS(context, supportMenuItem);
                }
                throw new UnsupportedOperationException();
            } catch (UnsupportedOperationException e) {
                throw e;
            }
        } catch (UnsupportedOperationException e2) {
            throw e2;
        }
    }
}
