package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.support.v7.appcompat.R;
import android.support.v7.view.menu.ActionMenuItem;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuPresenter;
import android.support.v7.widget.Toolbar.LayoutParams;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window.Callback;
import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

public class ToolbarWidgetWrapper implements DecorToolbar {
    private static final String[] z;
    private ActionMenuPresenter mActionMenuPresenter;
    private View mCustomView;
    private int mDefaultNavigationContentDescription;
    private Drawable mDefaultNavigationIcon;
    private int mDisplayOpts;
    private CharSequence mHomeDescription;
    private Drawable mIcon;
    private Drawable mLogo;
    private boolean mMenuPrepared;
    private Drawable mNavIcon;
    private int mNavigationMode;
    private CharSequence mSubtitle;
    private View mTabView;
    private final TintManager mTintManager;
    private CharSequence mTitle;
    private boolean mTitleSet;
    private Toolbar mToolbar;
    private Callback mWindowCallback;

    class 1 implements OnClickListener {
        final ActionMenuItem mNavItem;
        final ToolbarWidgetWrapper this$0;

        1(ToolbarWidgetWrapper toolbarWidgetWrapper) {
            this.this$0 = toolbarWidgetWrapper;
            this.mNavItem = new ActionMenuItem(ToolbarWidgetWrapper.access$000(this.this$0).getContext(), 0, 16908332, 0, 0, ToolbarWidgetWrapper.access$100(this.this$0));
        }

        public void onClick(View view) {
            if (ToolbarWidgetWrapper.access$200(this.this$0) != null && ToolbarWidgetWrapper.access$300(this.this$0)) {
                ToolbarWidgetWrapper.access$200(this.this$0).onMenuItemSelected(0, this.mNavItem);
            }
        }
    }

    class 2 extends ViewPropertyAnimatorListenerAdapter {
        private boolean mCanceled;
        final ToolbarWidgetWrapper this$0;
        final int val$visibility;

        public void onAnimationEnd(View view) {
            if (!this.mCanceled) {
                ToolbarWidgetWrapper.access$000(this.this$0).setVisibility(this.val$visibility);
            }
        }

        public void onAnimationStart(View view) {
            ToolbarWidgetWrapper.access$000(this.this$0).setVisibility(0);
        }

        public void onAnimationCancel(View view) {
            this.mCanceled = true;
        }

        2(ToolbarWidgetWrapper toolbarWidgetWrapper, int i) {
            this.this$0 = toolbarWidgetWrapper;
            this.val$visibility = i;
            this.mCanceled = false;
        }
    }

    static {
        String[] strArr = new String[4];
        String str = "\u0012\u0012R\u0007_'\u000fj\u0002Y!\u0018I<O'\rM\u000eO";
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
                        i3 = 70;
                        break;
                    case at.g /*1*/:
                        i3 = 125;
                        break;
                    case at.i /*2*/:
                        i3 = 61;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_seekBarStyle;
                        break;
                    default:
                        i3 = 61;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0016\u000fR\fO#\u000eNKY/\u000eM\u0007\\?]H\u0005N3\rM\u0004O2\u0018Y";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u0012\u0012R\u0007_'\u000fj\u0002Y!\u0018I<O'\rM\u000eO";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0016\u000fR\fO#\u000eNKY/\u000eM\u0007\\?]H\u0005N3\rM\u0004O2\u0018Y";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private void updateHomeAccessibility() {
        if ((this.mDisplayOpts & 4) != 0) {
            if (TextUtils.isEmpty(this.mHomeDescription)) {
                this.mToolbar.setNavigationContentDescription(this.mDefaultNavigationContentDescription);
                if (!LinearLayoutCompat.a) {
                    return;
                }
            }
            this.mToolbar.setNavigationContentDescription(this.mHomeDescription);
        }
    }

    public int getNavigationMode() {
        return this.mNavigationMode;
    }

    public int getDisplayOptions() {
        return this.mDisplayOpts;
    }

    public void setCustomView(View view) {
        if (!(this.mCustomView == null || (this.mDisplayOpts & 16) == 0)) {
            this.mToolbar.removeView(this.mCustomView);
        }
        this.mCustomView = view;
        if (view != null && (this.mDisplayOpts & 16) != 0) {
            this.mToolbar.addView(this.mCustomView);
        }
    }

    private void updateNavigationIcon() {
        if ((this.mDisplayOpts & 4) != 0) {
            Drawable drawable;
            Toolbar toolbar = this.mToolbar;
            if (this.mNavIcon != null) {
                drawable = this.mNavIcon;
            } else {
                drawable = this.mDefaultNavigationIcon;
            }
            toolbar.setNavigationIcon(drawable);
        }
    }

    public Context getContext() {
        return this.mToolbar.getContext();
    }

    public boolean showOverflowMenu() {
        return this.mToolbar.showOverflowMenu();
    }

    public void setNavigationIcon(Drawable drawable) {
        this.mNavIcon = drawable;
        updateNavigationIcon();
    }

    private void setTitleInt(CharSequence charSequence) {
        this.mTitle = charSequence;
        if ((this.mDisplayOpts & 8) != 0) {
            this.mToolbar.setTitle(charSequence);
        }
    }

    private void updateToolbarLogo() {
        Drawable drawable = null;
        if ((this.mDisplayOpts & 2) != 0) {
            if ((this.mDisplayOpts & 1) == 0) {
                drawable = this.mIcon;
            } else if (this.mLogo != null) {
                drawable = this.mLogo;
            } else {
                drawable = this.mIcon;
            }
        }
        this.mToolbar.setLogo(drawable);
    }

    public boolean isOverflowMenuShowing() {
        return this.mToolbar.isOverflowMenuShowing();
    }

    static boolean access$300(ToolbarWidgetWrapper toolbarWidgetWrapper) {
        return toolbarWidgetWrapper.mMenuPrepared;
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        this.mHomeDescription = charSequence;
        updateHomeAccessibility();
    }

    public boolean hasExpandedActionView() {
        return this.mToolbar.hasExpandedActionView();
    }

    public ViewPropertyAnimatorCompat setupAnimatorToVisibility(int i, long j) {
        return ViewCompat.animate(this.mToolbar).alpha(i == 0 ? 1.0f : 0.0f).setDuration(j).setListener(new 2(this, i));
    }

    public ToolbarWidgetWrapper(Toolbar toolbar, boolean z) {
        this(toolbar, z, R.string.abc_action_bar_up_description, R.drawable.abc_ic_ab_back_mtrl_am_alpha);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        this.mToolbar.setBackgroundDrawable(drawable);
    }

    public void setEmbeddedTabView(ScrollingTabContainerView scrollingTabContainerView) {
        if (this.mTabView != null && this.mTabView.getParent() == this.mToolbar) {
            this.mToolbar.removeView(this.mTabView);
        }
        this.mTabView = scrollingTabContainerView;
        if (scrollingTabContainerView != null && this.mNavigationMode == 2) {
            this.mToolbar.addView(this.mTabView, 0);
            LayoutParams layoutParams = (LayoutParams) this.mTabView.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.gravity = 8388691;
            scrollingTabContainerView.setAllowCollapse(true);
        }
    }

    public void setHomeButtonEnabled(boolean z) {
    }

    public void setVisibility(int i) {
        this.mToolbar.setVisibility(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ToolbarWidgetWrapper(android.support.v7.widget.Toolbar r7, boolean r8, int r9, int r10) {
        /*
        r6 = this;
        r5 = -1;
        r1 = 0;
        r6.<init>();
        r6.mNavigationMode = r1;
        r6.mDefaultNavigationContentDescription = r1;
        r6.mToolbar = r7;
        r0 = r7.getTitle();
        r6.mTitle = r0;
        r0 = r7.getSubtitle();
        r6.mSubtitle = r0;
        r0 = r6.mTitle;
        if (r0 == 0) goto L_0x0142;
    L_0x001b:
        r0 = 1;
    L_0x001c:
        r6.mTitleSet = r0;
        r0 = r7.getNavigationIcon();
        r6.mNavIcon = r0;
        if (r8 == 0) goto L_0x0113;
    L_0x0026:
        r0 = r7.getContext();
        r2 = 0;
        r3 = android.support.v7.appcompat.R.styleable.ActionBar;
        r4 = android.support.v7.appcompat.R.attr.actionBarStyle;
        r0 = android.support.v7.widget.TintTypedArray.obtainStyledAttributes(r0, r2, r3, r4, r1);
        r2 = android.support.v7.appcompat.R.styleable.ActionBar_title;
        r2 = r0.getText(r2);
        r3 = android.text.TextUtils.isEmpty(r2);
        if (r3 != 0) goto L_0x0042;
    L_0x003f:
        r6.setTitle(r2);
    L_0x0042:
        r2 = android.support.v7.appcompat.R.styleable.ActionBar_subtitle;
        r2 = r0.getText(r2);
        r3 = android.text.TextUtils.isEmpty(r2);
        if (r3 != 0) goto L_0x0051;
    L_0x004e:
        r6.setSubtitle(r2);
    L_0x0051:
        r2 = android.support.v7.appcompat.R.styleable.ActionBar_logo;
        r2 = r0.getDrawable(r2);
        if (r2 == 0) goto L_0x005c;
    L_0x0059:
        r6.setLogo(r2);
    L_0x005c:
        r2 = android.support.v7.appcompat.R.styleable.ActionBar_icon;
        r2 = r0.getDrawable(r2);
        r3 = r6.mNavIcon;
        if (r3 != 0) goto L_0x006b;
    L_0x0066:
        if (r2 == 0) goto L_0x006b;
    L_0x0068:
        r6.setIcon(r2);
    L_0x006b:
        r2 = android.support.v7.appcompat.R.styleable.ActionBar_homeAsUpIndicator;
        r2 = r0.getDrawable(r2);
        if (r2 == 0) goto L_0x0076;
    L_0x0073:
        r6.setNavigationIcon(r2);
    L_0x0076:
        r2 = android.support.v7.appcompat.R.styleable.ActionBar_displayOptions;
        r2 = r0.getInt(r2, r1);
        r6.setDisplayOptions(r2);
        r2 = android.support.v7.appcompat.R.styleable.ActionBar_customNavigationLayout;
        r2 = r0.getResourceId(r2, r1);
        if (r2 == 0) goto L_0x00a1;
    L_0x0087:
        r3 = r6.mToolbar;
        r3 = r3.getContext();
        r3 = android.view.LayoutInflater.from(r3);
        r4 = r6.mToolbar;
        r2 = r3.inflate(r2, r4, r1);
        r6.setCustomView(r2);
        r2 = r6.mDisplayOpts;
        r2 = r2 | 16;
        r6.setDisplayOptions(r2);
    L_0x00a1:
        r2 = android.support.v7.appcompat.R.styleable.ActionBar_height;
        r2 = r0.getLayoutDimension(r2, r1);
        if (r2 <= 0) goto L_0x00b6;
    L_0x00a9:
        r3 = r6.mToolbar;
        r3 = r3.getLayoutParams();
        r3.height = r2;
        r2 = r6.mToolbar;
        r2.setLayoutParams(r3);
    L_0x00b6:
        r2 = android.support.v7.appcompat.R.styleable.ActionBar_contentInsetStart;
        r2 = r0.getDimensionPixelOffset(r2, r5);
        r3 = android.support.v7.appcompat.R.styleable.ActionBar_contentInsetEnd;
        r3 = r0.getDimensionPixelOffset(r3, r5);
        if (r2 >= 0) goto L_0x00c6;
    L_0x00c4:
        if (r3 < 0) goto L_0x00d3;
    L_0x00c6:
        r4 = r6.mToolbar;
        r2 = java.lang.Math.max(r2, r1);
        r3 = java.lang.Math.max(r3, r1);
        r4.setContentInsetsRelative(r2, r3);
    L_0x00d3:
        r2 = android.support.v7.appcompat.R.styleable.ActionBar_titleTextStyle;
        r2 = r0.getResourceId(r2, r1);
        if (r2 == 0) goto L_0x00e6;
    L_0x00db:
        r3 = r6.mToolbar;
        r4 = r6.mToolbar;
        r4 = r4.getContext();
        r3.setTitleTextAppearance(r4, r2);
    L_0x00e6:
        r2 = android.support.v7.appcompat.R.styleable.ActionBar_subtitleTextStyle;
        r2 = r0.getResourceId(r2, r1);
        if (r2 == 0) goto L_0x00f9;
    L_0x00ee:
        r3 = r6.mToolbar;
        r4 = r6.mToolbar;
        r4 = r4.getContext();
        r3.setSubtitleTextAppearance(r4, r2);
    L_0x00f9:
        r2 = android.support.v7.appcompat.R.styleable.ActionBar_popupTheme;
        r1 = r0.getResourceId(r2, r1);
        if (r1 == 0) goto L_0x0106;
    L_0x0101:
        r2 = r6.mToolbar;
        r2.setPopupTheme(r1);
    L_0x0106:
        r0.recycle();
        r0 = r0.getTintManager();
        r6.mTintManager = r0;
        r0 = android.support.v7.widget.LinearLayoutCompat.a;
        if (r0 == 0) goto L_0x0123;
    L_0x0113:
        r0 = r6.detectDisplayOptions();
        r6.mDisplayOpts = r0;
        r0 = r7.getContext();
        r0 = android.support.v7.widget.TintManager.get(r0);
        r6.mTintManager = r0;
    L_0x0123:
        r6.setDefaultNavigationContentDescription(r9);
        r0 = r6.mToolbar;
        r0 = r0.getNavigationContentDescription();
        r6.mHomeDescription = r0;
        r0 = r6.mTintManager;
        r0 = r0.getDrawable(r10);
        r6.setDefaultNavigationIcon(r0);
        r0 = r6.mToolbar;
        r1 = new android.support.v7.widget.ToolbarWidgetWrapper$1;
        r1.<init>(r6);
        r0.setNavigationOnClickListener(r1);
        return;
    L_0x0142:
        r0 = r1;
        goto L_0x001c;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ToolbarWidgetWrapper.<init>(android.support.v7.widget.Toolbar, boolean, int, int):void");
    }

    public void collapseActionView() {
        this.mToolbar.collapseActionView();
    }

    static Callback access$200(ToolbarWidgetWrapper toolbarWidgetWrapper) {
        return toolbarWidgetWrapper.mWindowCallback;
    }

    public boolean hideOverflowMenu() {
        return this.mToolbar.hideOverflowMenu();
    }

    public void dismissPopupMenus() {
        this.mToolbar.dismissPopupMenus();
    }

    public void setCollapsible(boolean z) {
        this.mToolbar.setCollapsible(z);
    }

    public boolean isOverflowMenuShowPending() {
        return this.mToolbar.isOverflowMenuShowPending();
    }

    public void setMenuPrepared() {
        this.mMenuPrepared = true;
    }

    private int detectDisplayOptions() {
        if (this.mToolbar.getNavigationIcon() != null) {
            return 15;
        }
        return 11;
    }

    public void setMenu(Menu menu, MenuPresenter.Callback callback) {
        if (this.mActionMenuPresenter == null) {
            this.mActionMenuPresenter = new ActionMenuPresenter(this.mToolbar.getContext());
            this.mActionMenuPresenter.setId(R.id.action_menu_presenter);
        }
        this.mActionMenuPresenter.setCallback(callback);
        this.mToolbar.setMenu((MenuBuilder) menu, this.mActionMenuPresenter);
    }

    static CharSequence access$100(ToolbarWidgetWrapper toolbarWidgetWrapper) {
        return toolbarWidgetWrapper.mTitle;
    }

    public Menu getMenu() {
        return this.mToolbar.getMenu();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setDisplayOptions(int r6) {
        /*
        r5 = this;
        r4 = 0;
        r0 = android.support.v7.widget.LinearLayoutCompat.a;
        r1 = r5.mDisplayOpts;
        r1 = r1 ^ r6;
        r5.mDisplayOpts = r6;
        if (r1 == 0) goto L_0x0064;
    L_0x000a:
        r2 = r1 & 4;
        if (r2 == 0) goto L_0x001f;
    L_0x000e:
        r2 = r6 & 4;
        if (r2 == 0) goto L_0x001a;
    L_0x0012:
        r5.updateNavigationIcon();
        r5.updateHomeAccessibility();
        if (r0 == 0) goto L_0x001f;
    L_0x001a:
        r2 = r5.mToolbar;
        r2.setNavigationIcon(r4);
    L_0x001f:
        r2 = r1 & 3;
        if (r2 == 0) goto L_0x0026;
    L_0x0023:
        r5.updateToolbarLogo();
    L_0x0026:
        r2 = r1 & 8;
        if (r2 == 0) goto L_0x0048;
    L_0x002a:
        r2 = r6 & 8;
        if (r2 == 0) goto L_0x003e;
    L_0x002e:
        r2 = r5.mToolbar;
        r3 = r5.mTitle;
        r2.setTitle(r3);
        r2 = r5.mToolbar;
        r3 = r5.mSubtitle;
        r2.setSubtitle(r3);
        if (r0 == 0) goto L_0x0048;
    L_0x003e:
        r2 = r5.mToolbar;
        r2.setTitle(r4);
        r2 = r5.mToolbar;
        r2.setSubtitle(r4);
    L_0x0048:
        r1 = r1 & 16;
        if (r1 == 0) goto L_0x0064;
    L_0x004c:
        r1 = r5.mCustomView;
        if (r1 == 0) goto L_0x0064;
    L_0x0050:
        r1 = r6 & 16;
        if (r1 == 0) goto L_0x005d;
    L_0x0054:
        r1 = r5.mToolbar;
        r2 = r5.mCustomView;
        r1.addView(r2);
        if (r0 == 0) goto L_0x0064;
    L_0x005d:
        r0 = r5.mToolbar;
        r1 = r5.mCustomView;
        r0.removeView(r1);
    L_0x0064:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ToolbarWidgetWrapper.setDisplayOptions(int):void");
    }

    public void setDefaultNavigationIcon(Drawable drawable) {
        if (this.mDefaultNavigationIcon != drawable) {
            this.mDefaultNavigationIcon = drawable;
            updateNavigationIcon();
        }
    }

    public void setIcon(Drawable drawable) {
        this.mIcon = drawable;
        updateToolbarLogo();
    }

    public void setLogo(Drawable drawable) {
        this.mLogo = drawable;
        updateToolbarLogo();
    }

    static Toolbar access$000(ToolbarWidgetWrapper toolbarWidgetWrapper) {
        return toolbarWidgetWrapper.mToolbar;
    }

    public void setMenuCallbacks(MenuPresenter.Callback callback, MenuBuilder.Callback callback2) {
        this.mToolbar.setMenuCallbacks(callback, callback2);
    }

    public void setDefaultNavigationContentDescription(int i) {
        if (i != this.mDefaultNavigationContentDescription) {
            this.mDefaultNavigationContentDescription = i;
            if (TextUtils.isEmpty(this.mToolbar.getNavigationContentDescription())) {
                setNavigationContentDescription(this.mDefaultNavigationContentDescription);
            }
        }
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.mTitleSet) {
            setTitleInt(charSequence);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.mTitleSet = true;
        setTitleInt(charSequence);
    }

    public void setWindowCallback(Callback callback) {
        this.mWindowCallback = callback;
    }

    public void setNavigationContentDescription(int i) {
        CharSequence charSequence;
        if (i == 0) {
            charSequence = null;
        } else {
            charSequence = getContext().getString(i);
        }
        setNavigationContentDescription(charSequence);
    }

    public void initIndeterminateProgress() {
        Log.i(z[3], z[2]);
    }

    public boolean canShowOverflowMenu() {
        return this.mToolbar.canShowOverflowMenu();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.mSubtitle = charSequence;
        if ((this.mDisplayOpts & 8) != 0) {
            this.mToolbar.setSubtitle(charSequence);
        }
    }

    public ViewGroup getViewGroup() {
        return this.mToolbar;
    }

    public void initProgress() {
        Log.i(z[0], z[1]);
    }
}
