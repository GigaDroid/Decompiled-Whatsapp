package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.ActionBar.LayoutParams;
import android.support.v7.app.ActionBar.OnMenuVisibilityListener;
import android.support.v7.view.WindowCallbackWrapper;
import android.support.v7.view.menu.ListMenuPresenter;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuPresenter;
import android.support.v7.widget.DecorToolbar;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.Toolbar.OnMenuItemClickListener;
import android.support.v7.widget.ToolbarWidgetWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window.Callback;
import com.whatsapp.arj;
import java.util.ArrayList;
import org.v;

class ToolbarActionBar extends ActionBar {
    private DecorToolbar mDecorToolbar;
    private boolean mLastMenuVisibility;
    private ListMenuPresenter mListMenuPresenter;
    private boolean mMenuCallbackSet;
    private final OnMenuItemClickListener mMenuClicker;
    private final Runnable mMenuInvalidator;
    private ArrayList mMenuVisibilityListeners;
    private boolean mToolbarMenuPrepared;
    private Callback mWindowCallback;

    class 1 implements Runnable {
        final ToolbarActionBar this$0;

        public void run() {
            this.this$0.populateOptionsMenu();
        }

        1(ToolbarActionBar toolbarActionBar) {
            this.this$0 = toolbarActionBar;
        }
    }

    class 2 implements OnMenuItemClickListener {
        final ToolbarActionBar this$0;

        2(ToolbarActionBar toolbarActionBar) {
            this.this$0 = toolbarActionBar;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return ToolbarActionBar.access$000(this.this$0).onMenuItemSelected(0, menuItem);
        }
    }

    final class ActionMenuPresenterCallback implements MenuPresenter.Callback {
        private boolean mClosingActionMenu;
        final ToolbarActionBar this$0;

        ActionMenuPresenterCallback(ToolbarActionBar toolbarActionBar, 1 1) {
            this(toolbarActionBar);
        }

        public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
            if (!this.mClosingActionMenu) {
                this.mClosingActionMenu = true;
                ToolbarActionBar.access$300(this.this$0).dismissPopupMenus();
                if (ToolbarActionBar.access$000(this.this$0) != null) {
                    ToolbarActionBar.access$000(this.this$0).onPanelClosed(arj.Theme_spinnerStyle, menuBuilder);
                }
                this.mClosingActionMenu = false;
            }
        }

        private ActionMenuPresenterCallback(ToolbarActionBar toolbarActionBar) {
            this.this$0 = toolbarActionBar;
        }

        public boolean onOpenSubMenu(MenuBuilder menuBuilder) {
            if (ToolbarActionBar.access$000(this.this$0) == null) {
                return false;
            }
            ToolbarActionBar.access$000(this.this$0).onMenuOpened(arj.Theme_spinnerStyle, menuBuilder);
            return true;
        }
    }

    final class MenuBuilderCallback implements MenuBuilder.Callback {
        final ToolbarActionBar this$0;

        public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
            return false;
        }

        public void onMenuModeChange(MenuBuilder menuBuilder) {
            if (ToolbarActionBar.access$000(this.this$0) != null) {
                if (ToolbarActionBar.access$300(this.this$0).isOverflowMenuShowing()) {
                    ToolbarActionBar.access$000(this.this$0).onPanelClosed(arj.Theme_spinnerStyle, menuBuilder);
                    if (!ActionBar.a) {
                        return;
                    }
                }
                if (ToolbarActionBar.access$000(this.this$0).onPreparePanel(0, null, menuBuilder)) {
                    ToolbarActionBar.access$000(this.this$0).onMenuOpened(arj.Theme_spinnerStyle, menuBuilder);
                }
            }
        }

        MenuBuilderCallback(ToolbarActionBar toolbarActionBar, 1 1) {
            this(toolbarActionBar);
        }

        private MenuBuilderCallback(ToolbarActionBar toolbarActionBar) {
            this.this$0 = toolbarActionBar;
        }
    }

    final class PanelMenuPresenterCallback implements MenuPresenter.Callback {
        final ToolbarActionBar this$0;

        PanelMenuPresenterCallback(ToolbarActionBar toolbarActionBar, 1 1) {
            this(toolbarActionBar);
        }

        private PanelMenuPresenterCallback(ToolbarActionBar toolbarActionBar) {
            this.this$0 = toolbarActionBar;
        }

        public boolean onOpenSubMenu(MenuBuilder menuBuilder) {
            if (menuBuilder == null && ToolbarActionBar.access$000(this.this$0) != null) {
                ToolbarActionBar.access$000(this.this$0).onMenuOpened(0, menuBuilder);
            }
            return true;
        }

        public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
            if (ToolbarActionBar.access$000(this.this$0) != null) {
                ToolbarActionBar.access$000(this.this$0).onPanelClosed(0, menuBuilder);
            }
        }
    }

    class ToolbarCallbackWrapper extends WindowCallbackWrapper {
        final ToolbarActionBar this$0;

        public boolean onPreparePanel(int i, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (onPreparePanel && !ToolbarActionBar.access$200(this.this$0)) {
                ToolbarActionBar.access$300(this.this$0).setMenuPrepared();
                ToolbarActionBar.access$202(this.this$0, true);
            }
            return onPreparePanel;
        }

        public ToolbarCallbackWrapper(ToolbarActionBar toolbarActionBar, Callback callback) {
            this.this$0 = toolbarActionBar;
            super(callback);
        }

        public View onCreatePanelView(int i) {
            switch (i) {
                case v.m /*0*/:
                    Menu menu = ToolbarActionBar.access$300(this.this$0).getMenu();
                    if (onPreparePanel(i, null, menu) && onMenuOpened(i, menu)) {
                        return ToolbarActionBar.access$400(this.this$0, menu);
                    }
            }
            return super.onCreatePanelView(i);
        }
    }

    public void setWindowTitle(CharSequence charSequence) {
        this.mDecorToolbar.setWindowTitle(charSequence);
    }

    public void setCustomView(View view) {
        setCustomView(view, new LayoutParams(-2, -2));
    }

    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        this.mDecorToolbar.setBackgroundDrawable(drawable);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.mDecorToolbar.setSubtitle(charSequence);
    }

    public void hide() {
        this.mDecorToolbar.setVisibility(8);
    }

    static View access$400(ToolbarActionBar toolbarActionBar, Menu menu) {
        return toolbarActionBar.getListMenuView(menu);
    }

    private Menu getMenu() {
        if (!this.mMenuCallbackSet) {
            this.mDecorToolbar.setMenuCallbacks(new ActionMenuPresenterCallback(this, null), new MenuBuilderCallback(this, null));
            this.mMenuCallbackSet = true;
        }
        return this.mDecorToolbar.getMenu();
    }

    public Callback getWrappedWindowCallback() {
        return this.mWindowCallback;
    }

    void populateOptionsMenu() {
        MenuBuilder menuBuilder;
        Menu menu = getMenu();
        if (menu instanceof MenuBuilder) {
            menuBuilder = (MenuBuilder) menu;
        } else {
            menuBuilder = null;
        }
        if (menuBuilder != null) {
            menuBuilder.stopDispatchingItemsChanged();
        }
        try {
            menu.clear();
            if (!(this.mWindowCallback.onCreatePanelMenu(0, menu) && this.mWindowCallback.onPreparePanel(0, null, menu))) {
                menu.clear();
            }
            if (menuBuilder != null) {
                menuBuilder.startDispatchingItemsChanged();
            }
        } catch (Throwable th) {
            if (menuBuilder != null) {
                menuBuilder.startDispatchingItemsChanged();
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void ensureListMenuPresenter(android.view.Menu r6) {
        /*
        r5 = this;
        r4 = 1;
        r0 = r5.mListMenuPresenter;
        if (r0 != 0) goto L_0x0070;
    L_0x0005:
        r0 = r6 instanceof android.support.v7.view.menu.MenuBuilder;
        if (r0 == 0) goto L_0x0070;
    L_0x0009:
        r6 = (android.support.v7.view.menu.MenuBuilder) r6;
        r0 = r5.mDecorToolbar;
        r0 = r0.getContext();
        r1 = new android.util.TypedValue;
        r1.<init>();
        r2 = r0.getResources();
        r2 = r2.newTheme();
        r3 = r0.getTheme();
        r2.setTo(r3);
        r3 = android.support.v7.appcompat.R.attr.actionBarPopupTheme;
        r2.resolveAttribute(r3, r1, r4);
        r3 = r1.resourceId;
        if (r3 == 0) goto L_0x0033;
    L_0x002e:
        r3 = r1.resourceId;
        r2.applyStyle(r3, r4);
    L_0x0033:
        r3 = android.support.v7.appcompat.R.attr.panelMenuListTheme;
        r2.resolveAttribute(r3, r1, r4);
        r3 = r1.resourceId;
        if (r3 == 0) goto L_0x0045;
    L_0x003c:
        r1 = r1.resourceId;
        r2.applyStyle(r1, r4);
        r1 = android.support.v7.app.ActionBar.a;
        if (r1 == 0) goto L_0x004a;
    L_0x0045:
        r1 = android.support.v7.appcompat.R.style.Theme_AppCompat_CompactMenu;
        r2.applyStyle(r1, r4);
    L_0x004a:
        r1 = new android.view.ContextThemeWrapper;
        r3 = 0;
        r1.<init>(r0, r3);
        r0 = r1.getTheme();
        r0.setTo(r2);
        r0 = new android.support.v7.view.menu.ListMenuPresenter;
        r2 = android.support.v7.appcompat.R.layout.abc_list_menu_item_layout;
        r0.<init>(r1, r2);
        r5.mListMenuPresenter = r0;
        r0 = r5.mListMenuPresenter;
        r1 = new android.support.v7.app.ToolbarActionBar$PanelMenuPresenterCallback;
        r2 = 0;
        r1.<init>(r5, r2);
        r0.setCallback(r1);
        r0 = r5.mListMenuPresenter;
        r6.addMenuPresenter(r0);
    L_0x0070:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.ToolbarActionBar.ensureListMenuPresenter(android.view.Menu):void");
    }

    public ToolbarActionBar(Toolbar toolbar, CharSequence charSequence, Callback callback) {
        this.mMenuVisibilityListeners = new ArrayList();
        this.mMenuInvalidator = new 1(this);
        this.mMenuClicker = new 2(this);
        this.mDecorToolbar = new ToolbarWidgetWrapper(toolbar, false);
        this.mWindowCallback = new ToolbarCallbackWrapper(this, callback);
        this.mDecorToolbar.setWindowCallback(this.mWindowCallback);
        toolbar.setOnMenuItemClickListener(this.mMenuClicker);
        this.mDecorToolbar.setWindowTitle(charSequence);
    }

    static boolean access$202(ToolbarActionBar toolbarActionBar, boolean z) {
        toolbarActionBar.mToolbarMenuPrepared = z;
        return z;
    }

    static Callback access$000(ToolbarActionBar toolbarActionBar) {
        return toolbarActionBar.mWindowCallback;
    }

    public boolean collapseActionView() {
        if (!this.mDecorToolbar.hasExpandedActionView()) {
            return false;
        }
        this.mDecorToolbar.collapseActionView();
        return true;
    }

    public void setTitle(CharSequence charSequence) {
        this.mDecorToolbar.setTitle(charSequence);
    }

    public void setDefaultDisplayHomeAsUpEnabled(boolean z) {
    }

    public void setDisplayShowHomeEnabled(boolean z) {
        int i;
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        setDisplayOptions(i, 2);
    }

    public Context getThemedContext() {
        return this.mDecorToolbar.getContext();
    }

    public void setDisplayHomeAsUpEnabled(boolean z) {
        int i;
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        setDisplayOptions(i, 4);
    }

    public void setDisplayShowCustomEnabled(boolean z) {
        int i;
        if (z) {
            i = 16;
        } else {
            i = 0;
        }
        setDisplayOptions(i, 16);
    }

    public void setDisplayShowTitleEnabled(boolean z) {
        setDisplayOptions(z ? 8 : 0, 8);
    }

    public boolean invalidateOptionsMenu() {
        this.mDecorToolbar.getViewGroup().removeCallbacks(this.mMenuInvalidator);
        ViewCompat.postOnAnimation(this.mDecorToolbar.getViewGroup(), this.mMenuInvalidator);
        return true;
    }

    public void show() {
        this.mDecorToolbar.setVisibility(0);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void setCustomView(View view, LayoutParams layoutParams) {
        if (view != null) {
            view.setLayoutParams(layoutParams);
        }
        this.mDecorToolbar.setCustomView(view);
    }

    private View getListMenuView(Menu menu) {
        ensureListMenuPresenter(menu);
        if (menu == null || this.mListMenuPresenter == null || this.mListMenuPresenter.getAdapter().getCount() <= 0) {
            return null;
        }
        return (View) this.mListMenuPresenter.getMenuView(this.mDecorToolbar.getViewGroup());
    }

    static boolean access$200(ToolbarActionBar toolbarActionBar) {
        return toolbarActionBar.mToolbarMenuPrepared;
    }

    public int getDisplayOptions() {
        return this.mDecorToolbar.getDisplayOptions();
    }

    public boolean onKeyShortcut(int i, KeyEvent keyEvent) {
        Menu menu = getMenu();
        if (menu != null) {
            int deviceId;
            boolean z;
            if (keyEvent != null) {
                deviceId = keyEvent.getDeviceId();
            } else {
                deviceId = -1;
            }
            if (KeyCharacterMap.load(deviceId).getKeyboardType() != 1) {
                z = true;
            } else {
                z = false;
            }
            menu.setQwertyMode(z);
            menu.performShortcut(i, keyEvent, 0);
        }
        return true;
    }

    public void setDisplayOptions(int i, int i2) {
        this.mDecorToolbar.setDisplayOptions((this.mDecorToolbar.getDisplayOptions() & (i2 ^ -1)) | (i & i2));
    }

    static DecorToolbar access$300(ToolbarActionBar toolbarActionBar) {
        return toolbarActionBar.mDecorToolbar;
    }

    public void setTitle(int i) {
        CharSequence text;
        DecorToolbar decorToolbar = this.mDecorToolbar;
        if (i != 0) {
            text = this.mDecorToolbar.getContext().getText(i);
        } else {
            text = null;
        }
        decorToolbar.setTitle(text);
    }

    public void setShowHideAnimationEnabled(boolean z) {
    }

    public void setHomeAsUpIndicator(Drawable drawable) {
        this.mDecorToolbar.setNavigationIcon(drawable);
    }

    public void setIcon(Drawable drawable) {
        this.mDecorToolbar.setIcon(drawable);
    }

    public void setElevation(float f) {
        ViewCompat.setElevation(this.mDecorToolbar.getViewGroup(), f);
    }

    public void dispatchMenuVisibilityChanged(boolean z) {
        boolean z2 = ActionBar.a;
        if (z != this.mLastMenuVisibility) {
            this.mLastMenuVisibility = z;
            int size = this.mMenuVisibilityListeners.size();
            int i = 0;
            while (i < size) {
                ((OnMenuVisibilityListener) this.mMenuVisibilityListeners.get(i)).onMenuVisibilityChanged(z);
                int i2 = i + 1;
                if (!z2) {
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }
}
