package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.support.v4.view.ViewPropertyAnimatorUpdateListener;
import android.support.v7.app.ActionBar.LayoutParams;
import android.support.v7.app.ActionBar.OnMenuVisibilityListener;
import android.support.v7.app.ActionBar.Tab;
import android.support.v7.appcompat.R;
import android.support.v7.view.ActionBarPolicy;
import android.support.v7.view.ActionMode;
import android.support.v7.view.ActionMode.Callback;
import android.support.v7.view.SupportMenuInflater;
import android.support.v7.view.ViewPropertyAnimatorCompatSet;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback;
import android.support.v7.widget.DecorToolbar;
import android.support.v7.widget.ScrollingTabContainerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.v;
import org.whispersystems.at;

public class WindowDecorActionBar extends ActionBar implements ActionBarVisibilityCallback {
    static final boolean $assertionsDisabled;
    private static final boolean ALLOW_SHOW_HIDE_ANIMATIONS;
    private static final Interpolator sHideInterpolator;
    private static final Interpolator sShowInterpolator;
    private static final String[] z;
    ActionModeImpl mActionMode;
    private Activity mActivity;
    private ActionBarContainer mContainerView;
    private boolean mContentAnimations;
    private View mContentView;
    private Context mContext;
    private ActionBarContextView mContextView;
    private int mCurWindowVisibility;
    private ViewPropertyAnimatorCompatSet mCurrentShowAnim;
    private DecorToolbar mDecorToolbar;
    ActionMode mDeferredDestroyActionMode;
    Callback mDeferredModeDestroyCallback;
    private Dialog mDialog;
    private boolean mDisplayHomeAsUpSet;
    private boolean mHasEmbeddedTabs;
    private boolean mHiddenByApp;
    private boolean mHiddenBySystem;
    final ViewPropertyAnimatorListener mHideListener;
    boolean mHideOnContentScroll;
    private boolean mLastMenuVisibility;
    private ArrayList mMenuVisibilityListeners;
    private boolean mNowShowing;
    private ActionBarOverlayLayout mOverlayLayout;
    private int mSavedTabPosition;
    private boolean mShowHideAnimationEnabled;
    final ViewPropertyAnimatorListener mShowListener;
    private boolean mShowingForMode;
    private ScrollingTabContainerView mTabScrollView;
    private ArrayList mTabs;
    private Context mThemedContext;
    final ViewPropertyAnimatorUpdateListener mUpdateListener;

    class 1 extends ViewPropertyAnimatorListenerAdapter {
        final WindowDecorActionBar this$0;

        1(WindowDecorActionBar windowDecorActionBar) {
            this.this$0 = windowDecorActionBar;
        }

        public void onAnimationEnd(View view) {
            if (WindowDecorActionBar.access$000(this.this$0) && WindowDecorActionBar.access$100(this.this$0) != null) {
                ViewCompat.setTranslationY(WindowDecorActionBar.access$100(this.this$0), 0.0f);
                ViewCompat.setTranslationY(WindowDecorActionBar.access$200(this.this$0), 0.0f);
            }
            WindowDecorActionBar.access$200(this.this$0).setVisibility(8);
            WindowDecorActionBar.access$200(this.this$0).setTransitioning(false);
            WindowDecorActionBar.access$302(this.this$0, null);
            this.this$0.completeDeferredDestroyActionMode();
            if (WindowDecorActionBar.access$400(this.this$0) != null) {
                ViewCompat.requestApplyInsets(WindowDecorActionBar.access$400(this.this$0));
            }
        }
    }

    class 2 extends ViewPropertyAnimatorListenerAdapter {
        final WindowDecorActionBar this$0;

        2(WindowDecorActionBar windowDecorActionBar) {
            this.this$0 = windowDecorActionBar;
        }

        public void onAnimationEnd(View view) {
            WindowDecorActionBar.access$302(this.this$0, null);
            WindowDecorActionBar.access$200(this.this$0).requestLayout();
        }
    }

    class 3 implements ViewPropertyAnimatorUpdateListener {
        final WindowDecorActionBar this$0;

        public void onAnimationUpdate(View view) {
            ((View) WindowDecorActionBar.access$200(this.this$0).getParent()).invalidate();
        }

        3(WindowDecorActionBar windowDecorActionBar) {
            this.this$0 = windowDecorActionBar;
        }
    }

    public class ActionModeImpl extends ActionMode implements MenuBuilder.Callback {
        private final Context mActionModeContext;
        private Callback mCallback;
        private WeakReference mCustomView;
        private final MenuBuilder mMenu;
        final WindowDecorActionBar this$0;

        public boolean isTitleOptional() {
            return WindowDecorActionBar.access$800(this.this$0).isTitleOptional();
        }

        public View getCustomView() {
            return this.mCustomView != null ? (View) this.mCustomView.get() : null;
        }

        public void setTitleOptionalHint(boolean z) {
            super.setTitleOptionalHint(z);
            WindowDecorActionBar.access$800(this.this$0).setTitleOptional(z);
        }

        public void setTitle(int i) {
            setTitle(WindowDecorActionBar.access$1000(this.this$0).getResources().getString(i));
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void finish() {
            /*
            r4 = this;
            r3 = 0;
            r2 = 0;
            r0 = r4.this$0;
            r0 = r0.mActionMode;
            if (r0 == r4) goto L_0x0009;
        L_0x0008:
            return;
        L_0x0009:
            r0 = r4.this$0;
            r0 = android.support.v7.app.WindowDecorActionBar.access$500(r0);
            r1 = r4.this$0;
            r1 = android.support.v7.app.WindowDecorActionBar.access$600(r1);
            r0 = android.support.v7.app.WindowDecorActionBar.access$700(r0, r1, r2);
            if (r0 != 0) goto L_0x0029;
        L_0x001b:
            r0 = r4.this$0;
            r0.mDeferredDestroyActionMode = r4;
            r0 = r4.this$0;
            r1 = r4.mCallback;
            r0.mDeferredModeDestroyCallback = r1;
            r0 = android.support.v7.app.ActionBar.a;
            if (r0 == 0) goto L_0x002e;
        L_0x0029:
            r0 = r4.mCallback;
            r0.onDestroyActionMode(r4);
        L_0x002e:
            r4.mCallback = r3;
            r0 = r4.this$0;
            r0.animateToMode(r2);
            r0 = r4.this$0;
            r0 = android.support.v7.app.WindowDecorActionBar.access$800(r0);
            r0.closeMode();
            r0 = r4.this$0;
            r0 = android.support.v7.app.WindowDecorActionBar.access$900(r0);
            r0 = r0.getViewGroup();
            r1 = 32;
            r0.sendAccessibilityEvent(r1);
            r0 = r4.this$0;
            r0 = android.support.v7.app.WindowDecorActionBar.access$400(r0);
            r1 = r4.this$0;
            r1 = r1.mHideOnContentScroll;
            r0.setHideOnContentScrollEnabled(r1);
            r0 = r4.this$0;
            r0.mActionMode = r3;
            goto L_0x0008;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.WindowDecorActionBar.ActionModeImpl.finish():void");
        }

        public boolean dispatchOnCreate() {
            this.mMenu.stopDispatchingItemsChanged();
            try {
                boolean onCreateActionMode = this.mCallback.onCreateActionMode(this, this.mMenu);
                return onCreateActionMode;
            } finally {
                this.mMenu.startDispatchingItemsChanged();
            }
        }

        public void onMenuModeChange(MenuBuilder menuBuilder) {
            if (this.mCallback != null) {
                invalidate();
                WindowDecorActionBar.access$800(this.this$0).showOverflowMenu();
            }
        }

        public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
            return this.mCallback != null ? this.mCallback.onActionItemClicked(this, menuItem) : false;
        }

        public CharSequence getSubtitle() {
            return WindowDecorActionBar.access$800(this.this$0).getSubtitle();
        }

        public void setTitle(CharSequence charSequence) {
            WindowDecorActionBar.access$800(this.this$0).setTitle(charSequence);
        }

        public CharSequence getTitle() {
            return WindowDecorActionBar.access$800(this.this$0).getTitle();
        }

        public void setSubtitle(CharSequence charSequence) {
            WindowDecorActionBar.access$800(this.this$0).setSubtitle(charSequence);
        }

        public void setCustomView(View view) {
            WindowDecorActionBar.access$800(this.this$0).setCustomView(view);
            this.mCustomView = new WeakReference(view);
        }

        public Menu getMenu() {
            return this.mMenu;
        }

        public void invalidate() {
            if (this.this$0.mActionMode == this) {
                this.mMenu.stopDispatchingItemsChanged();
                try {
                    this.mCallback.onPrepareActionMode(this, this.mMenu);
                } finally {
                    this.mMenu.startDispatchingItemsChanged();
                }
            }
        }

        public void setSubtitle(int i) {
            setSubtitle(WindowDecorActionBar.access$1000(this.this$0).getResources().getString(i));
        }

        public MenuInflater getMenuInflater() {
            return new SupportMenuInflater(this.mActionModeContext);
        }

        public ActionModeImpl(WindowDecorActionBar windowDecorActionBar, Context context, Callback callback) {
            this.this$0 = windowDecorActionBar;
            this.mActionModeContext = context;
            this.mCallback = callback;
            this.mMenu = new MenuBuilder(context).setDefaultShowAsAction(1);
            this.mMenu.setCallback(this);
        }
    }

    public class TabImpl extends Tab {
    }

    public void setTitle(CharSequence charSequence) {
        this.mDecorToolbar.setTitle(charSequence);
    }

    public void onContentScrollStarted() {
        try {
            if (this.mCurrentShowAnim != null) {
                this.mCurrentShowAnim.cancel();
                this.mCurrentShowAnim = null;
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void setDisplayOptions(int i, int i2) {
        int displayOptions = this.mDecorToolbar.getDisplayOptions();
        if ((i2 & 4) != 0) {
            try {
                this.mDisplayHomeAsUpSet = true;
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        this.mDecorToolbar.setDisplayOptions((displayOptions & (i2 ^ -1)) | (i & i2));
    }

    private DecorToolbar getDecorToolbar(View view) {
        try {
            if (view instanceof DecorToolbar) {
                return (DecorToolbar) view;
            }
            try {
                if (view instanceof Toolbar) {
                    return ((Toolbar) view).getWrapper();
                }
                try {
                    throw new IllegalStateException(new StringBuilder().append(z[0]).append(view).toString() != null ? view.getClass().getSimpleName() : z[1]);
                } catch (IllegalStateException e) {
                    throw e;
                }
            } catch (IllegalStateException e2) {
                throw e2;
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    public void setWindowTitle(CharSequence charSequence) {
        this.mDecorToolbar.setWindowTitle(charSequence);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setHasEmbeddedTabs(boolean r7) {
        /*
        r6 = this;
        r1 = 1;
        r2 = 0;
        r3 = android.support.v7.app.ActionBar.a;
        r6.mHasEmbeddedTabs = r7;	 Catch:{ IllegalStateException -> 0x0064 }
        r0 = r6.mHasEmbeddedTabs;	 Catch:{ IllegalStateException -> 0x0064 }
        if (r0 != 0) goto L_0x0019;
    L_0x000a:
        r0 = r6.mDecorToolbar;	 Catch:{ IllegalStateException -> 0x0066 }
        r4 = 0;
        r0.setEmbeddedTabView(r4);	 Catch:{ IllegalStateException -> 0x0066 }
        r0 = r6.mContainerView;	 Catch:{ IllegalStateException -> 0x0066 }
        r4 = r6.mTabScrollView;	 Catch:{ IllegalStateException -> 0x0066 }
        r0.setTabContainer(r4);	 Catch:{ IllegalStateException -> 0x0066 }
        if (r3 == 0) goto L_0x0026;
    L_0x0019:
        r0 = r6.mContainerView;	 Catch:{ IllegalStateException -> 0x0066 }
        r4 = 0;
        r0.setTabContainer(r4);	 Catch:{ IllegalStateException -> 0x0066 }
        r0 = r6.mDecorToolbar;	 Catch:{ IllegalStateException -> 0x0066 }
        r4 = r6.mTabScrollView;	 Catch:{ IllegalStateException -> 0x0066 }
        r0.setEmbeddedTabView(r4);	 Catch:{ IllegalStateException -> 0x0066 }
    L_0x0026:
        r0 = r6.getNavigationMode();	 Catch:{ IllegalStateException -> 0x0068 }
        r4 = 2;
        if (r0 != r4) goto L_0x006a;
    L_0x002d:
        r0 = r1;
    L_0x002e:
        r4 = r6.mTabScrollView;	 Catch:{ IllegalStateException -> 0x006c }
        if (r4 == 0) goto L_0x004c;
    L_0x0032:
        if (r0 == 0) goto L_0x0045;
    L_0x0034:
        r4 = r6.mTabScrollView;	 Catch:{ IllegalStateException -> 0x0070 }
        r5 = 0;
        r4.setVisibility(r5);	 Catch:{ IllegalStateException -> 0x0070 }
        r4 = r6.mOverlayLayout;	 Catch:{ IllegalStateException -> 0x0070 }
        if (r4 == 0) goto L_0x004c;
    L_0x003e:
        r4 = r6.mOverlayLayout;	 Catch:{ IllegalStateException -> 0x0072 }
        android.support.v4.view.ViewCompat.requestApplyInsets(r4);	 Catch:{ IllegalStateException -> 0x0072 }
        if (r3 == 0) goto L_0x004c;
    L_0x0045:
        r3 = r6.mTabScrollView;	 Catch:{ IllegalStateException -> 0x0072 }
        r4 = 8;
        r3.setVisibility(r4);	 Catch:{ IllegalStateException -> 0x0072 }
    L_0x004c:
        r4 = r6.mDecorToolbar;	 Catch:{ IllegalStateException -> 0x0074 }
        r3 = r6.mHasEmbeddedTabs;	 Catch:{ IllegalStateException -> 0x0074 }
        if (r3 != 0) goto L_0x0078;
    L_0x0052:
        if (r0 == 0) goto L_0x0078;
    L_0x0054:
        r3 = r1;
    L_0x0055:
        r4.setCollapsible(r3);	 Catch:{ IllegalStateException -> 0x007a }
        r3 = r6.mOverlayLayout;	 Catch:{ IllegalStateException -> 0x007a }
        r4 = r6.mHasEmbeddedTabs;	 Catch:{ IllegalStateException -> 0x007a }
        if (r4 != 0) goto L_0x007e;
    L_0x005e:
        if (r0 == 0) goto L_0x007e;
    L_0x0060:
        r3.setHasNonEmbeddedTabs(r1);
        return;
    L_0x0064:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0066 }
    L_0x0066:
        r0 = move-exception;
        throw r0;
    L_0x0068:
        r0 = move-exception;
        throw r0;
    L_0x006a:
        r0 = r2;
        goto L_0x002e;
    L_0x006c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x006e }
    L_0x006e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0070 }
    L_0x0070:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0072 }
    L_0x0072:
        r0 = move-exception;
        throw r0;
    L_0x0074:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0076 }
    L_0x0076:
        r0 = move-exception;
        throw r0;
    L_0x0078:
        r3 = r2;
        goto L_0x0055;
    L_0x007a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x007c }
    L_0x007c:
        r0 = move-exception;
        throw r0;
    L_0x007e:
        r1 = r2;
        goto L_0x0060;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.WindowDecorActionBar.setHasEmbeddedTabs(boolean):void");
    }

    public void dispatchMenuVisibilityChanged(boolean z) {
        boolean z2 = ActionBar.a;
        try {
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
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void setShowHideAnimationEnabled(boolean z) {
        try {
            this.mShowHideAnimationEnabled = z;
            if (!z) {
                if (this.mCurrentShowAnim != null) {
                    this.mCurrentShowAnim.cancel();
                }
            }
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public void setElevation(float f) {
        ViewCompat.setElevation(this.mContainerView, f);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        this.mContainerView.setPrimaryBackground(drawable);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void animateToMode(boolean r9) {
        /*
        r8 = this;
        r6 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r4 = 100;
        r3 = 0;
        r2 = android.support.v7.app.ActionBar.a;
        if (r9 == 0) goto L_0x000e;
    L_0x0009:
        r8.showForActionMode();	 Catch:{ IllegalStateException -> 0x003c }
        if (r2 == 0) goto L_0x0011;
    L_0x000e:
        r8.hideForActionMode();	 Catch:{ IllegalStateException -> 0x003c }
    L_0x0011:
        if (r9 == 0) goto L_0x0022;
    L_0x0013:
        r0 = r8.mDecorToolbar;
        r1 = 4;
        r0 = r0.setupAnimatorToVisibility(r1, r4);
        r1 = r8.mContextView;
        r1 = r1.setupAnimatorToVisibility(r3, r6);
        if (r2 == 0) goto L_0x0030;
    L_0x0022:
        r0 = r8.mDecorToolbar;
        r1 = r0.setupAnimatorToVisibility(r3, r6);
        r0 = r8.mContextView;
        r2 = 8;
        r0 = r0.setupAnimatorToVisibility(r2, r4);
    L_0x0030:
        r2 = new android.support.v7.view.ViewPropertyAnimatorCompatSet;
        r2.<init>();
        r2.playSequentially(r0, r1);
        r2.start();
        return;
    L_0x003c:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.WindowDecorActionBar.animateToMode(boolean):void");
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z) {
            try {
                if (!this.mOverlayLayout.isInOverlayMode()) {
                    throw new IllegalStateException(z[4]);
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        this.mHideOnContentScroll = z;
        this.mOverlayLayout.setHideOnContentScrollEnabled(z);
    }

    public ActionMode startActionMode(Callback callback) {
        try {
            if (this.mActionMode != null) {
                this.mActionMode.finish();
            }
            this.mOverlayLayout.setHideOnContentScrollEnabled(false);
            this.mContextView.killMode();
            ActionMode actionModeImpl = new ActionModeImpl(this, this.mContextView.getContext(), callback);
            try {
                if (!actionModeImpl.dispatchOnCreate()) {
                    return null;
                }
                actionModeImpl.invalidate();
                this.mContextView.initForMode(actionModeImpl);
                animateToMode(true);
                this.mContextView.sendAccessibilityEvent(32);
                this.mActionMode = actionModeImpl;
                return actionModeImpl;
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public void showForSystem() {
        try {
            if (this.mHiddenBySystem) {
                this.mHiddenBySystem = false;
                updateVisibility(true);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void setCustomView(View view, LayoutParams layoutParams) {
        view.setLayoutParams(layoutParams);
        this.mDecorToolbar.setCustomView(view);
    }

    static ActionBarOverlayLayout access$400(WindowDecorActionBar windowDecorActionBar) {
        return windowDecorActionBar.mOverlayLayout;
    }

    public int getDisplayOptions() {
        return this.mDecorToolbar.getDisplayOptions();
    }

    public void setHomeAsUpIndicator(Drawable drawable) {
        this.mDecorToolbar.setNavigationIcon(drawable);
    }

    static boolean access$600(WindowDecorActionBar windowDecorActionBar) {
        return windowDecorActionBar.mHiddenBySystem;
    }

    private void hideForActionMode() {
        try {
            if (this.mShowingForMode) {
                this.mShowingForMode = false;
                if (this.mOverlayLayout != null) {
                    this.mOverlayLayout.setShowingForActionMode(false);
                }
                updateVisibility(false);
            }
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    static ViewPropertyAnimatorCompatSet access$302(WindowDecorActionBar windowDecorActionBar, ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet) {
        windowDecorActionBar.mCurrentShowAnim = viewPropertyAnimatorCompatSet;
        return viewPropertyAnimatorCompatSet;
    }

    static boolean access$000(WindowDecorActionBar windowDecorActionBar) {
        return windowDecorActionBar.mContentAnimations;
    }

    void completeDeferredDestroyActionMode() {
        try {
            if (this.mDeferredModeDestroyCallback != null) {
                this.mDeferredModeDestroyCallback.onDestroyActionMode(this.mDeferredDestroyActionMode);
                this.mDeferredDestroyActionMode = null;
                this.mDeferredModeDestroyCallback = null;
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    static View access$100(WindowDecorActionBar windowDecorActionBar) {
        return windowDecorActionBar.mContentView;
    }

    public void onWindowVisibilityChanged(int i) {
        this.mCurWindowVisibility = i;
    }

    public void hideForSystem() {
        try {
            if (!this.mHiddenBySystem) {
                this.mHiddenBySystem = true;
                updateVisibility(true);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void setDisplayShowTitleEnabled(boolean z) {
        int i;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        setDisplayOptions(i, 8);
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

    static Context access$1000(WindowDecorActionBar windowDecorActionBar) {
        return windowDecorActionBar.mContext;
    }

    static {
        boolean z = true;
        String[] strArr = new String[5];
        String str = "{iTt\u0002\u0018e[8\u0013\u0018i\u001a7\u0013[gHs\u0002WgV1\u0017J(U&\u0002\u0018g\\s";
        boolean z2 = true;
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
                        i3 = 56;
                        break;
                    case at.g /*1*/:
                        i3 = 8;
                        break;
                    case at.i /*2*/:
                        i3 = 58;
                        break;
                    case at.o /*3*/:
                        i3 = 83;
                        break;
                    default:
                        i3 = 118;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z2) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "OaN;VY(Y<\u001bHiN:\u0014Tm\u001a$\u001fVlU$V\\mY<\u0004\u0018d[*\u0019M|";
                    i = 2;
                    strArr2 = strArr3;
                    z2 = true;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0018k[=VWfV*VZm\u001a&\u0005]l\u001a";
                    i = 3;
                    strArr2 = strArr3;
                    z2 = true;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "ykN:\u0019V(X2\u0004\u0018eO \u0002\u0018j_s\u001fV(U%\u0013Jd[*VUg^6V\u0010_S=\u0012W\u007f\u0014\u00153y\\o\u00013gGl\u0016$tIc\f7{\\s\u001c8gJ{\u0001_\u0018|Us\u0013ViX?\u0013\u0018`S7\u0013\u0018gTs\u0015WfN6\u0018L(I0\u0004WdV";
                    z2 = true;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    z = strArr3;
                    try {
                        if (WindowDecorActionBar.class.desiredAssertionStatus()) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        try {
                            $assertionsDisabled = z2;
                            sHideInterpolator = new AccelerateInterpolator();
                            sShowInterpolator = new DecelerateInterpolator();
                            if (VERSION.SDK_INT < 14) {
                                z = false;
                            }
                            ALLOW_SHOW_HIDE_ANIMATIONS = z;
                            return;
                        } catch (IllegalStateException e) {
                            throw e;
                        }
                    } catch (IllegalStateException e2) {
                        throw e2;
                    }
                default:
                    strArr2[i] = str;
                    str = "V}V?";
                    i = 1;
                    strArr2 = strArr3;
                    z2 = false;
                    break;
            }
        }
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

    private void showForActionMode() {
        try {
            if (!this.mShowingForMode) {
                this.mShowingForMode = true;
                if (this.mOverlayLayout != null) {
                    this.mOverlayLayout.setShowingForActionMode(true);
                }
                updateVisibility(false);
            }
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public WindowDecorActionBar(Dialog dialog) {
        this.mTabs = new ArrayList();
        this.mSavedTabPosition = -1;
        this.mMenuVisibilityListeners = new ArrayList();
        this.mCurWindowVisibility = 0;
        this.mContentAnimations = true;
        this.mNowShowing = true;
        this.mHideListener = new 1(this);
        this.mShowListener = new 2(this);
        this.mUpdateListener = new 3(this);
        this.mDialog = dialog;
        init(dialog.getWindow().getDecorView());
    }

    public int getNavigationMode() {
        return this.mDecorToolbar.getNavigationMode();
    }

    public boolean collapseActionView() {
        try {
            if (this.mDecorToolbar != null) {
                if (this.mDecorToolbar.hasExpandedActionView()) {
                    this.mDecorToolbar.collapseActionView();
                    return true;
                }
            }
            return false;
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public void setHomeButtonEnabled(boolean z) {
        this.mDecorToolbar.setHomeButtonEnabled(z);
    }

    private void init(View view) {
        boolean z = true;
        try {
            this.mOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
            if (this.mOverlayLayout != null) {
                this.mOverlayLayout.setActionBarVisibilityCallback(this);
            }
            try {
                this.mDecorToolbar = getDecorToolbar(view.findViewById(R.id.action_bar));
                this.mContextView = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
                this.mContainerView = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
                if (this.mDecorToolbar != null) {
                    if (this.mContextView != null) {
                        try {
                            if (this.mContainerView != null) {
                                boolean z2;
                                this.mContext = this.mDecorToolbar.getContext();
                                if ((this.mDecorToolbar.getDisplayOptions() & 4) != 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    try {
                                        this.mDisplayHomeAsUpSet = true;
                                    } catch (IllegalStateException e) {
                                        throw e;
                                    }
                                }
                                ActionBarPolicy actionBarPolicy = ActionBarPolicy.get(this.mContext);
                                try {
                                    if (!(actionBarPolicy.enableHomeButtonByDefault() || z2)) {
                                        z = false;
                                    }
                                    setHomeButtonEnabled(z);
                                    setHasEmbeddedTabs(actionBarPolicy.hasEmbeddedTabs());
                                    TypedArray obtainStyledAttributes = this.mContext.obtainStyledAttributes(null, R.styleable.ActionBar, R.attr.actionBarStyle, 0);
                                    try {
                                        if (obtainStyledAttributes.getBoolean(R.styleable.ActionBar_hideOnContentScroll, false)) {
                                            setHideOnContentScrollEnabled(true);
                                        }
                                        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ActionBar_elevation, 0);
                                        if (dimensionPixelSize != 0) {
                                            try {
                                                setElevation((float) dimensionPixelSize);
                                            } catch (IllegalStateException e2) {
                                                throw e2;
                                            }
                                        }
                                        obtainStyledAttributes.recycle();
                                        return;
                                    } catch (IllegalStateException e22) {
                                        throw e22;
                                    }
                                } catch (IllegalStateException e222) {
                                    throw e222;
                                } catch (IllegalStateException e2222) {
                                    throw e2222;
                                }
                            }
                        } catch (IllegalStateException e22222) {
                            throw e22222;
                        }
                    }
                }
                throw new IllegalStateException(getClass().getSimpleName() + z[3] + z[2]);
            } catch (IllegalStateException e222222) {
                throw e222222;
            } catch (IllegalStateException e2222222) {
                throw e2222222;
            }
        } catch (IllegalStateException e22222222) {
            throw e22222222;
        }
    }

    static ActionBarContextView access$800(WindowDecorActionBar windowDecorActionBar) {
        return windowDecorActionBar.mContextView;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.Context getThemedContext() {
        /*
        r4 = this;
        r0 = r4.mThemedContext;
        if (r0 != 0) goto L_0x002a;
    L_0x0004:
        r0 = new android.util.TypedValue;
        r0.<init>();
        r1 = r4.mContext;
        r1 = r1.getTheme();
        r2 = android.support.v7.appcompat.R.attr.actionBarWidgetTheme;
        r3 = 1;
        r1.resolveAttribute(r2, r0, r3);
        r0 = r0.resourceId;
        if (r0 == 0) goto L_0x0026;
    L_0x0019:
        r1 = new android.view.ContextThemeWrapper;	 Catch:{ IllegalStateException -> 0x002d }
        r2 = r4.mContext;	 Catch:{ IllegalStateException -> 0x002d }
        r1.<init>(r2, r0);	 Catch:{ IllegalStateException -> 0x002d }
        r4.mThemedContext = r1;	 Catch:{ IllegalStateException -> 0x002d }
        r0 = android.support.v7.app.ActionBar.a;	 Catch:{ IllegalStateException -> 0x002d }
        if (r0 == 0) goto L_0x002a;
    L_0x0026:
        r0 = r4.mContext;	 Catch:{ IllegalStateException -> 0x002d }
        r4.mThemedContext = r0;	 Catch:{ IllegalStateException -> 0x002d }
    L_0x002a:
        r0 = r4.mThemedContext;
        return r0;
    L_0x002d:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.WindowDecorActionBar.getThemedContext():android.content.Context");
    }

    public void onConfigurationChanged(Configuration configuration) {
        setHasEmbeddedTabs(ActionBarPolicy.get(this.mContext).hasEmbeddedTabs());
    }

    public void enableContentAnimations(boolean z) {
        this.mContentAnimations = z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void doShow(boolean r5) {
        /*
        r4 = this;
        r3 = 0;
        r0 = r4.mCurrentShowAnim;	 Catch:{ IllegalStateException -> 0x00b7 }
        if (r0 == 0) goto L_0x000a;
    L_0x0005:
        r0 = r4.mCurrentShowAnim;	 Catch:{ IllegalStateException -> 0x00b7 }
        r0.cancel();	 Catch:{ IllegalStateException -> 0x00b7 }
    L_0x000a:
        r0 = r4.mContainerView;	 Catch:{ IllegalStateException -> 0x00b9 }
        r1 = 0;
        r0.setVisibility(r1);	 Catch:{ IllegalStateException -> 0x00b9 }
        r0 = r4.mCurWindowVisibility;	 Catch:{ IllegalStateException -> 0x00b9 }
        if (r0 != 0) goto L_0x008c;
    L_0x0014:
        r0 = ALLOW_SHOW_HIDE_ANIMATIONS;	 Catch:{ IllegalStateException -> 0x00bb }
        if (r0 == 0) goto L_0x008c;
    L_0x0018:
        r0 = r4.mShowHideAnimationEnabled;	 Catch:{ IllegalStateException -> 0x00bd }
        if (r0 != 0) goto L_0x001e;
    L_0x001c:
        if (r5 == 0) goto L_0x008c;
    L_0x001e:
        r0 = r4.mContainerView;
        android.support.v4.view.ViewCompat.setTranslationY(r0, r3);
        r0 = r4.mContainerView;
        r0 = r0.getHeight();
        r0 = -r0;
        r0 = (float) r0;
        if (r5 == 0) goto L_0x003d;
    L_0x002d:
        r1 = 2;
        r1 = new int[r1];
        r1 = {0, 0};
        r2 = r4.mContainerView;
        r2.getLocationInWindow(r1);
        r2 = 1;
        r1 = r1[r2];
        r1 = (float) r1;
        r0 = r0 - r1;
    L_0x003d:
        r1 = r4.mContainerView;
        android.support.v4.view.ViewCompat.setTranslationY(r1, r0);
        r1 = new android.support.v7.view.ViewPropertyAnimatorCompatSet;
        r1.<init>();
        r2 = r4.mContainerView;
        r2 = android.support.v4.view.ViewCompat.animate(r2);
        r2 = r2.translationY(r3);
        r3 = r4.mUpdateListener;	 Catch:{ IllegalStateException -> 0x00bf }
        r2.setUpdateListener(r3);	 Catch:{ IllegalStateException -> 0x00bf }
        r1.play(r2);	 Catch:{ IllegalStateException -> 0x00bf }
        r2 = r4.mContentAnimations;	 Catch:{ IllegalStateException -> 0x00bf }
        if (r2 == 0) goto L_0x0074;
    L_0x005d:
        r2 = r4.mContentView;	 Catch:{ IllegalStateException -> 0x00c1 }
        if (r2 == 0) goto L_0x0074;
    L_0x0061:
        r2 = r4.mContentView;	 Catch:{ IllegalStateException -> 0x00c1 }
        android.support.v4.view.ViewCompat.setTranslationY(r2, r0);	 Catch:{ IllegalStateException -> 0x00c1 }
        r0 = r4.mContentView;	 Catch:{ IllegalStateException -> 0x00c1 }
        r0 = android.support.v4.view.ViewCompat.animate(r0);	 Catch:{ IllegalStateException -> 0x00c1 }
        r2 = 0;
        r0 = r0.translationY(r2);	 Catch:{ IllegalStateException -> 0x00c1 }
        r1.play(r0);	 Catch:{ IllegalStateException -> 0x00c1 }
    L_0x0074:
        r0 = sShowInterpolator;	 Catch:{ IllegalStateException -> 0x00c3 }
        r1.setInterpolator(r0);	 Catch:{ IllegalStateException -> 0x00c3 }
        r2 = 250; // 0xfa float:3.5E-43 double:1.235E-321;
        r1.setDuration(r2);	 Catch:{ IllegalStateException -> 0x00c3 }
        r0 = r4.mShowListener;	 Catch:{ IllegalStateException -> 0x00c3 }
        r1.setListener(r0);	 Catch:{ IllegalStateException -> 0x00c3 }
        r4.mCurrentShowAnim = r1;	 Catch:{ IllegalStateException -> 0x00c3 }
        r1.start();	 Catch:{ IllegalStateException -> 0x00c3 }
        r0 = android.support.v7.app.ActionBar.a;	 Catch:{ IllegalStateException -> 0x00c3 }
        if (r0 == 0) goto L_0x00ad;
    L_0x008c:
        r0 = r4.mContainerView;	 Catch:{ IllegalStateException -> 0x00c5 }
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        android.support.v4.view.ViewCompat.setAlpha(r0, r1);	 Catch:{ IllegalStateException -> 0x00c5 }
        r0 = r4.mContainerView;	 Catch:{ IllegalStateException -> 0x00c5 }
        r1 = 0;
        android.support.v4.view.ViewCompat.setTranslationY(r0, r1);	 Catch:{ IllegalStateException -> 0x00c5 }
        r0 = r4.mContentAnimations;	 Catch:{ IllegalStateException -> 0x00c5 }
        if (r0 == 0) goto L_0x00a7;
    L_0x009d:
        r0 = r4.mContentView;	 Catch:{ IllegalStateException -> 0x00c7 }
        if (r0 == 0) goto L_0x00a7;
    L_0x00a1:
        r0 = r4.mContentView;	 Catch:{ IllegalStateException -> 0x00c7 }
        r1 = 0;
        android.support.v4.view.ViewCompat.setTranslationY(r0, r1);	 Catch:{ IllegalStateException -> 0x00c7 }
    L_0x00a7:
        r0 = r4.mShowListener;
        r1 = 0;
        r0.onAnimationEnd(r1);
    L_0x00ad:
        r0 = r4.mOverlayLayout;	 Catch:{ IllegalStateException -> 0x00c9 }
        if (r0 == 0) goto L_0x00b6;
    L_0x00b1:
        r0 = r4.mOverlayLayout;	 Catch:{ IllegalStateException -> 0x00c9 }
        android.support.v4.view.ViewCompat.requestApplyInsets(r0);	 Catch:{ IllegalStateException -> 0x00c9 }
    L_0x00b6:
        return;
    L_0x00b7:
        r0 = move-exception;
        throw r0;
    L_0x00b9:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00bb }
    L_0x00bb:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00bd }
    L_0x00bd:
        r0 = move-exception;
        throw r0;
    L_0x00bf:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00c1 }
    L_0x00c1:
        r0 = move-exception;
        throw r0;
    L_0x00c3:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00c5 }
    L_0x00c5:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00c7 }
    L_0x00c7:
        r0 = move-exception;
        throw r0;
    L_0x00c9:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.WindowDecorActionBar.doShow(boolean):void");
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

    public void show() {
        try {
            if (this.mHiddenByApp) {
                this.mHiddenByApp = false;
                updateVisibility(false);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private static boolean checkShowingFlags(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        if (z || z2) {
            return false;
        }
        return true;
    }

    static ActionBarContainer access$200(WindowDecorActionBar windowDecorActionBar) {
        return windowDecorActionBar.mContainerView;
    }

    public void hide() {
        try {
            if (!this.mHiddenByApp) {
                this.mHiddenByApp = true;
                updateVisibility(false);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void setCustomView(View view) {
        this.mDecorToolbar.setCustomView(view);
    }

    public WindowDecorActionBar(Activity activity, boolean z) {
        this.mTabs = new ArrayList();
        this.mSavedTabPosition = -1;
        this.mMenuVisibilityListeners = new ArrayList();
        this.mCurWindowVisibility = 0;
        this.mContentAnimations = true;
        this.mNowShowing = true;
        this.mHideListener = new 1(this);
        this.mShowListener = new 2(this);
        this.mUpdateListener = new 3(this);
        this.mActivity = activity;
        View decorView = activity.getWindow().getDecorView();
        try {
            init(decorView);
            if (!z) {
                this.mContentView = decorView.findViewById(16908290);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void onContentScrollStopped() {
    }

    private void updateVisibility(boolean z) {
        if (checkShowingFlags(this.mHiddenByApp, this.mHiddenBySystem, this.mShowingForMode)) {
            try {
                if (!this.mNowShowing) {
                    this.mNowShowing = true;
                    doShow(z);
                    if (!ActionBar.a) {
                        return;
                    }
                }
                return;
            } catch (IllegalStateException e) {
                throw e;
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }
        try {
            if (this.mNowShowing) {
                this.mNowShowing = false;
                doHide(z);
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    static boolean access$700(boolean z, boolean z2, boolean z3) {
        return checkShowingFlags(z, z2, z3);
    }

    public void setIcon(Drawable drawable) {
        this.mDecorToolbar.setIcon(drawable);
    }

    public void setTitle(int i) {
        setTitle(this.mContext.getString(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        this.mDecorToolbar.setSubtitle(charSequence);
    }

    static boolean access$500(WindowDecorActionBar windowDecorActionBar) {
        return windowDecorActionBar.mHiddenByApp;
    }

    static DecorToolbar access$900(WindowDecorActionBar windowDecorActionBar) {
        return windowDecorActionBar.mDecorToolbar;
    }

    public void doHide(boolean z) {
        try {
            if (this.mCurrentShowAnim != null) {
                this.mCurrentShowAnim.cancel();
            }
            try {
                if (this.mCurWindowVisibility == 0) {
                    if (ALLOW_SHOW_HIDE_ANIMATIONS) {
                        try {
                            if (this.mShowHideAnimationEnabled || z) {
                                ViewCompat.setAlpha(this.mContainerView, 1.0f);
                                this.mContainerView.setTransitioning(true);
                                ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = new ViewPropertyAnimatorCompatSet();
                                float f = (float) (-this.mContainerView.getHeight());
                                if (z) {
                                    int[] iArr = new int[]{0, 0};
                                    this.mContainerView.getLocationInWindow(iArr);
                                    f -= (float) iArr[1];
                                }
                                ViewPropertyAnimatorCompat translationY = ViewCompat.animate(this.mContainerView).translationY(f);
                                try {
                                    translationY.setUpdateListener(this.mUpdateListener);
                                    viewPropertyAnimatorCompatSet.play(translationY);
                                    if (this.mContentAnimations) {
                                        if (this.mContentView != null) {
                                            viewPropertyAnimatorCompatSet.play(ViewCompat.animate(this.mContentView).translationY(f));
                                        }
                                    }
                                    try {
                                        viewPropertyAnimatorCompatSet.setInterpolator(sHideInterpolator);
                                        viewPropertyAnimatorCompatSet.setDuration(250);
                                        viewPropertyAnimatorCompatSet.setListener(this.mHideListener);
                                        this.mCurrentShowAnim = viewPropertyAnimatorCompatSet;
                                        viewPropertyAnimatorCompatSet.start();
                                        if (!ActionBar.a) {
                                            return;
                                        }
                                    } catch (IllegalStateException e) {
                                        throw e;
                                    }
                                } catch (IllegalStateException e2) {
                                    throw e2;
                                } catch (IllegalStateException e22) {
                                    throw e22;
                                }
                            }
                        } catch (IllegalStateException e222) {
                            throw e222;
                        }
                    }
                }
                this.mHideListener.onAnimationEnd(null);
            } catch (IllegalStateException e2222) {
                throw e2222;
            } catch (IllegalStateException e22222) {
                throw e22222;
            }
        } catch (IllegalStateException e222222) {
            throw e222222;
        }
    }

    public void setDefaultDisplayHomeAsUpEnabled(boolean z) {
        try {
            if (!this.mDisplayHomeAsUpSet) {
                setDisplayHomeAsUpEnabled(z);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }
}
