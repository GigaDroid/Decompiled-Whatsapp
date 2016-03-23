package android.support.v7.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.NavUtils;
import android.support.v4.view.LayoutInflaterCompat;
import android.support.v4.view.LayoutInflaterFactory;
import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewConfigurationCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.support.v4.view.WindowInsetsCompat;
import android.support.v7.appcompat.R;
import android.support.v7.view.ActionMode;
import android.support.v7.view.menu.ListMenuPresenter;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuBuilder.Callback;
import android.support.v7.view.menu.MenuPresenter;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ContentFrameLayout;
import android.support.v7.widget.ContentFrameLayout.OnAttachListener;
import android.support.v7.widget.DecorContentParent;
import android.support.v7.widget.FitWindowsViewGroup.OnFitSystemWindowsListener;
import android.support.v7.widget.TintManager;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class AppCompatDelegateImplV7 extends AppCompatDelegateImplBase implements Callback, LayoutInflaterFactory {
    private static final String[] z;
    private ActionMenuPresenterCallback mActionMenuPresenterCallback;
    ActionMode mActionMode;
    PopupWindow mActionModePopup;
    ActionBarContextView mActionModeView;
    private AppCompatViewInflater mAppCompatViewInflater;
    private boolean mClosingActionMenu;
    private DecorContentParent mDecorContentParent;
    private boolean mEnableDefaultActionBarUp;
    ViewPropertyAnimatorCompat mFadeAnim;
    private boolean mFeatureIndeterminateProgress;
    private boolean mFeatureProgress;
    private int mInvalidatePanelMenuFeatures;
    private boolean mInvalidatePanelMenuPosted;
    private final Runnable mInvalidatePanelMenuRunnable;
    private boolean mLongPressBackDown;
    private PanelMenuPresenterCallback mPanelMenuPresenterCallback;
    private PanelFeatureState[] mPanels;
    private PanelFeatureState mPreparedPanel;
    Runnable mShowActionModePopup;
    private View mStatusGuard;
    private ViewGroup mSubDecor;
    private boolean mSubDecorInstalled;
    private Rect mTempRect1;
    private Rect mTempRect2;
    private TextView mTitleView;
    private ViewGroup mWindowDecor;

    class 1 implements Runnable {
        final AppCompatDelegateImplV7 this$0;

        1(AppCompatDelegateImplV7 appCompatDelegateImplV7) {
            this.this$0 = appCompatDelegateImplV7;
        }

        public void run() {
            if ((AppCompatDelegateImplV7.access$000(this.this$0) & 1) != 0) {
                AppCompatDelegateImplV7.access$100(this.this$0, 0);
            }
            if ((AppCompatDelegateImplV7.access$000(this.this$0) & 4096) != 0) {
                AppCompatDelegateImplV7.access$100(this.this$0, arj.Theme_spinnerStyle);
            }
            AppCompatDelegateImplV7.access$202(this.this$0, false);
            AppCompatDelegateImplV7.access$002(this.this$0, 0);
        }
    }

    class 2 implements OnApplyWindowInsetsListener {
        final AppCompatDelegateImplV7 this$0;

        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
            int access$300 = AppCompatDelegateImplV7.access$300(this.this$0, systemWindowInsetTop);
            if (systemWindowInsetTop != access$300) {
                windowInsetsCompat = windowInsetsCompat.replaceSystemWindowInsets(windowInsetsCompat.getSystemWindowInsetLeft(), access$300, windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
            }
            return ViewCompat.onApplyWindowInsets(view, windowInsetsCompat);
        }

        2(AppCompatDelegateImplV7 appCompatDelegateImplV7) {
            this.this$0 = appCompatDelegateImplV7;
        }
    }

    class 3 implements OnFitSystemWindowsListener {
        final AppCompatDelegateImplV7 this$0;

        public void onFitSystemWindows(Rect rect) {
            rect.top = AppCompatDelegateImplV7.access$300(this.this$0, rect.top);
        }

        3(AppCompatDelegateImplV7 appCompatDelegateImplV7) {
            this.this$0 = appCompatDelegateImplV7;
        }
    }

    class 4 implements OnAttachListener {
        final AppCompatDelegateImplV7 this$0;

        4(AppCompatDelegateImplV7 appCompatDelegateImplV7) {
            this.this$0 = appCompatDelegateImplV7;
        }

        public void onAttachedFromWindow() {
        }

        public void onDetachedFromWindow() {
            AppCompatDelegateImplV7.access$400(this.this$0);
        }
    }

    class 5 implements Runnable {
        final AppCompatDelegateImplV7 this$0;

        class 1 extends ViewPropertyAnimatorListenerAdapter {
            final 5 this$1;

            public void onAnimationEnd(View view) {
                ViewCompat.setAlpha(this.this$1.this$0.mActionModeView, 1.0f);
                this.this$1.this$0.mFadeAnim.setListener(null);
                this.this$1.this$0.mFadeAnim = null;
            }

            1(5 5) {
                this.this$1 = 5;
            }

            public void onAnimationStart(View view) {
                this.this$1.this$0.mActionModeView.setVisibility(0);
            }
        }

        public void run() {
            this.this$0.mActionModePopup.showAtLocation(this.this$0.mActionModeView, 55, 0, 0);
            AppCompatDelegateImplV7.access$500(this.this$0);
            ViewCompat.setAlpha(this.this$0.mActionModeView, 0.0f);
            this.this$0.mFadeAnim = ViewCompat.animate(this.this$0.mActionModeView).alpha(1.0f);
            this.this$0.mFadeAnim.setListener(new 1(this));
        }

        5(AppCompatDelegateImplV7 appCompatDelegateImplV7) {
            this.this$0 = appCompatDelegateImplV7;
        }
    }

    class 6 extends ViewPropertyAnimatorListenerAdapter {
        final AppCompatDelegateImplV7 this$0;

        6(AppCompatDelegateImplV7 appCompatDelegateImplV7) {
            this.this$0 = appCompatDelegateImplV7;
        }

        public void onAnimationEnd(View view) {
            ViewCompat.setAlpha(this.this$0.mActionModeView, 1.0f);
            this.this$0.mFadeAnim.setListener(null);
            this.this$0.mFadeAnim = null;
        }

        public void onAnimationStart(View view) {
            this.this$0.mActionModeView.setVisibility(0);
            this.this$0.mActionModeView.sendAccessibilityEvent(32);
            if (this.this$0.mActionModeView.getParent() != null) {
                ViewCompat.requestApplyInsets((View) this.this$0.mActionModeView.getParent());
            }
        }
    }

    final class ActionMenuPresenterCallback implements MenuPresenter.Callback {
        final AppCompatDelegateImplV7 this$0;

        public boolean onOpenSubMenu(MenuBuilder menuBuilder) {
            Window.Callback windowCallback = this.this$0.getWindowCallback();
            if (windowCallback != null) {
                windowCallback.onMenuOpened(arj.Theme_spinnerStyle, menuBuilder);
            }
            return true;
        }

        ActionMenuPresenterCallback(AppCompatDelegateImplV7 appCompatDelegateImplV7, 1 1) {
            this(appCompatDelegateImplV7);
        }

        private ActionMenuPresenterCallback(AppCompatDelegateImplV7 appCompatDelegateImplV7) {
            this.this$0 = appCompatDelegateImplV7;
        }

        public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
            AppCompatDelegateImplV7.access$1100(this.this$0, menuBuilder);
        }
    }

    class ActionModeCallbackWrapperV7 implements ActionMode.Callback {
        private ActionMode.Callback mWrapped;
        final AppCompatDelegateImplV7 this$0;

        class 1 extends ViewPropertyAnimatorListenerAdapter {
            final ActionModeCallbackWrapperV7 this$1;

            1(ActionModeCallbackWrapperV7 actionModeCallbackWrapperV7) {
                this.this$1 = actionModeCallbackWrapperV7;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onAnimationEnd(android.view.View r4) {
                /*
                r3 = this;
                r2 = 0;
                r0 = r3.this$1;
                r0 = r0.this$0;
                r0 = r0.mActionModeView;
                r1 = 8;
                r0.setVisibility(r1);
                r0 = r3.this$1;
                r0 = r0.this$0;
                r0 = r0.mActionModePopup;
                if (r0 == 0) goto L_0x0021;
            L_0x0014:
                r0 = r3.this$1;
                r0 = r0.this$0;
                r0 = r0.mActionModePopup;
                r0.dismiss();
                r0 = android.support.v7.app.ActionBar.a;
                if (r0 == 0) goto L_0x003e;
            L_0x0021:
                r0 = r3.this$1;
                r0 = r0.this$0;
                r0 = r0.mActionModeView;
                r0 = r0.getParent();
                r0 = r0 instanceof android.view.View;
                if (r0 == 0) goto L_0x003e;
            L_0x002f:
                r0 = r3.this$1;
                r0 = r0.this$0;
                r0 = r0.mActionModeView;
                r0 = r0.getParent();
                r0 = (android.view.View) r0;
                android.support.v4.view.ViewCompat.requestApplyInsets(r0);
            L_0x003e:
                r0 = r3.this$1;
                r0 = r0.this$0;
                r0 = r0.mActionModeView;
                r0.removeAllViews();
                r0 = r3.this$1;
                r0 = r0.this$0;
                r0 = r0.mFadeAnim;
                r0.setListener(r2);
                r0 = r3.this$1;
                r0 = r0.this$0;
                r0.mFadeAnim = r2;
                return;
                */
                throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AppCompatDelegateImplV7.ActionModeCallbackWrapperV7.1.onAnimationEnd(android.view.View):void");
            }
        }

        public void onDestroyActionMode(ActionMode actionMode) {
            this.mWrapped.onDestroyActionMode(actionMode);
            if (this.this$0.mActionModePopup != null) {
                this.this$0.mWindow.getDecorView().removeCallbacks(this.this$0.mShowActionModePopup);
            }
            if (this.this$0.mActionModeView != null) {
                AppCompatDelegateImplV7.access$500(this.this$0);
                this.this$0.mFadeAnim = ViewCompat.animate(this.this$0.mActionModeView).alpha(0.0f);
                this.this$0.mFadeAnim.setListener(new 1(this));
            }
            if (this.this$0.mAppCompatCallback != null) {
                this.this$0.mAppCompatCallback.onSupportActionModeFinished(this.this$0.mActionMode);
            }
            this.this$0.mActionMode = null;
        }

        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return this.mWrapped.onPrepareActionMode(actionMode, menu);
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.mWrapped.onCreateActionMode(actionMode, menu);
        }

        public ActionModeCallbackWrapperV7(AppCompatDelegateImplV7 appCompatDelegateImplV7, ActionMode.Callback callback) {
            this.this$0 = appCompatDelegateImplV7;
            this.mWrapped = callback;
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.mWrapped.onActionItemClicked(actionMode, menuItem);
        }
    }

    class ListMenuDecorView extends ContentFrameLayout {
        final AppCompatDelegateImplV7 this$0;

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.this$0.dispatchKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !isOutOfBounds((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            AppCompatDelegateImplV7.access$1400(this.this$0, 0);
            return true;
        }

        public void setBackgroundResource(int i) {
            setBackgroundDrawable(TintManager.getDrawable(getContext(), i));
        }

        public ListMenuDecorView(AppCompatDelegateImplV7 appCompatDelegateImplV7, Context context) {
            this.this$0 = appCompatDelegateImplV7;
            super(context);
        }

        private boolean isOutOfBounds(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }
    }

    final class PanelFeatureState {
        int background;
        View createdPanelView;
        ViewGroup decorView;
        int featureId;
        Bundle frozenActionViewState;
        int gravity;
        boolean isHandled;
        boolean isOpen;
        boolean isPrepared;
        ListMenuPresenter listMenuPresenter;
        Context listPresenterContext;
        MenuBuilder menu;
        public boolean qwertyMode;
        boolean refreshDecorView;
        boolean refreshMenuContent;
        View shownPanelView;
        int windowAnimations;
        int x;
        int y;

        public boolean hasPanelItems() {
            if (this.shownPanelView == null) {
                return false;
            }
            if (this.createdPanelView != null || this.listMenuPresenter.getAdapter().getCount() > 0) {
                return true;
            }
            return false;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        void setStyle(android.content.Context r7) {
            /*
            r6 = this;
            r0 = 0;
            r1 = 1;
            r2 = android.support.v7.app.ActionBar.a;
            r3 = new android.util.TypedValue;
            r3.<init>();
            r4 = r7.getResources();
            r4 = r4.newTheme();
            r5 = r7.getTheme();
            r4.setTo(r5);
            r5 = android.support.v7.appcompat.R.attr.actionBarPopupTheme;
            r4.resolveAttribute(r5, r3, r1);
            r5 = r3.resourceId;
            if (r5 == 0) goto L_0x0026;
        L_0x0021:
            r5 = r3.resourceId;
            r4.applyStyle(r5, r1);
        L_0x0026:
            r5 = android.support.v7.appcompat.R.attr.panelMenuListTheme;
            r4.resolveAttribute(r5, r3, r1);
            r5 = r3.resourceId;
            if (r5 == 0) goto L_0x0036;
        L_0x002f:
            r3 = r3.resourceId;
            r4.applyStyle(r3, r1);
            if (r2 == 0) goto L_0x003b;
        L_0x0036:
            r3 = android.support.v7.appcompat.R.style.Theme_AppCompat_CompactMenu;
            r4.applyStyle(r3, r1);
        L_0x003b:
            r3 = new android.support.v7.view.ContextThemeWrapper;
            r3.<init>(r7, r0);
            r5 = r3.getTheme();
            r5.setTo(r4);
            r6.listPresenterContext = r3;
            r4 = android.support.v7.appcompat.R.styleable.Theme;
            r3 = r3.obtainStyledAttributes(r4);
            r4 = android.support.v7.appcompat.R.styleable.Theme_panelBackground;
            r4 = r3.getResourceId(r4, r0);
            r6.background = r4;
            r4 = android.support.v7.appcompat.R.styleable.Theme_android_windowAnimationStyle;
            r4 = r3.getResourceId(r4, r0);
            r6.windowAnimations = r4;
            r3.recycle();
            r3 = android.support.v7.app.AppCompatActivity.b;
            if (r3 == 0) goto L_0x006a;
        L_0x0066:
            if (r2 == 0) goto L_0x006b;
        L_0x0068:
            android.support.v7.app.ActionBar.a = r0;
        L_0x006a:
            return;
        L_0x006b:
            r0 = r1;
            goto L_0x0068;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AppCompatDelegateImplV7.PanelFeatureState.setStyle(android.content.Context):void");
        }

        void setMenu(MenuBuilder menuBuilder) {
            if (menuBuilder != this.menu) {
                if (this.menu != null) {
                    this.menu.removeMenuPresenter(this.listMenuPresenter);
                }
                this.menu = menuBuilder;
                if (menuBuilder != null && this.listMenuPresenter != null) {
                    menuBuilder.addMenuPresenter(this.listMenuPresenter);
                }
            }
        }

        PanelFeatureState(int i) {
            this.featureId = i;
            this.refreshDecorView = false;
        }

        MenuView getListMenuView(MenuPresenter.Callback callback) {
            if (this.menu == null) {
                return null;
            }
            if (this.listMenuPresenter == null) {
                this.listMenuPresenter = new ListMenuPresenter(this.listPresenterContext, R.layout.abc_list_menu_item_layout);
                this.listMenuPresenter.setCallback(callback);
                this.menu.addMenuPresenter(this.listMenuPresenter);
            }
            return this.listMenuPresenter.getMenuView(this.decorView);
        }
    }

    final class PanelMenuPresenterCallback implements MenuPresenter.Callback {
        final AppCompatDelegateImplV7 this$0;

        public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
            MenuBuilder rootMenu = menuBuilder.getRootMenu();
            boolean z2 = rootMenu != menuBuilder;
            AppCompatDelegateImplV7 appCompatDelegateImplV7 = this.this$0;
            if (z2) {
                menuBuilder = rootMenu;
            }
            PanelFeatureState access$800 = AppCompatDelegateImplV7.access$800(appCompatDelegateImplV7, menuBuilder);
            if (access$800 != null) {
                if (z2) {
                    AppCompatDelegateImplV7.access$900(this.this$0, access$800.featureId, access$800, rootMenu);
                    AppCompatDelegateImplV7.access$1000(this.this$0, access$800, true);
                    if (!ActionBar.a) {
                        return;
                    }
                }
                AppCompatDelegateImplV7.access$1000(this.this$0, access$800, z);
            }
        }

        public boolean onOpenSubMenu(MenuBuilder menuBuilder) {
            if (menuBuilder == null && this.this$0.mHasActionBar) {
                Window.Callback windowCallback = this.this$0.getWindowCallback();
                if (!(windowCallback == null || this.this$0.isDestroyed())) {
                    windowCallback.onMenuOpened(arj.Theme_spinnerStyle, menuBuilder);
                }
            }
            return true;
        }

        private PanelMenuPresenterCallback(AppCompatDelegateImplV7 appCompatDelegateImplV7) {
            this.this$0 = appCompatDelegateImplV7;
        }

        PanelMenuPresenterCallback(AppCompatDelegateImplV7 appCompatDelegateImplV7, 1 1) {
            this(appCompatDelegateImplV7);
        }
    }

    static {
        String[] strArr = new String[21];
        String str = "E\nK\u0013\u001ei\nZ$5a\u0016^7\u0010p\u001f";
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
                        i3 = 4;
                        break;
                    case at.g /*1*/:
                        i3 = 122;
                        break;
                    case at.i /*2*/:
                        i3 = 59;
                        break;
                    case at.o /*3*/:
                        i3 = 80;
                        break;
                    default:
                        i3 = 113;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "E\nK\u0013\u001ei\nZ$5a\u0016^7\u0010p\u001f";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "]\u0015Np\u0002l\u0015N<\u0015$\u0014T'Qq\t^p\u0005l\u001f\u001b\u0011\u0001t9T=\u0001e\u000e\u007f5\u001da\u001dZ$\u0014*<~\u0011%Q(~\u000f\"Q*k\u001f#P%z\u0013%M5u\u000f3E(\u001b9\u0015$\rS5\u001f$\b^!\u0004a\tO9\u001fcZO8\u0018wZ]5\u0010p\u000fI5_";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "E\nK\u0013\u001ei\nZ$5a\u0016^7\u0010p\u001f";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "P\u0012^p0g\u000eR&\u0018p\u0003\u001c#QH\u001bB?\u0004p3U6\u001de\u000e^\"Qe\u0016I5\u0010`\u0003\u001b8\u0010wZZp7e\u0019O?\u0003}ZR>\u0002p\u001bW<\u0014`ZH?Qs\u001f\u001b3\u0010jZU?\u0005$\u0013U#\u0005e\u0016Wp0t\nx?\u001ct\u001bOw\u0002";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "E\u0019O9\u001ej7T4\u0014$\u0019Z<\u001df\u001bX;Qg\u001bUp\u001fk\u000e\u001b2\u0014$\u0014N<\u001d*";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "S\u0013U4\u001esZ]5\u0010p\u000fI5Qi\u000fH$Qf\u001f\u001b\"\u0014u\u000f^#\u0005a\u001e\u001b2\u0014b\u0015I5Qe\u001e_9\u001fcZX?\u001fp\u001fU$";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "E\nK\u0013\u001ei\nZ$Q`\u0015^#Qj\u0015Op\u0002q\nK?\u0003pZO8\u0014$\u0019N\"\u0003a\u0014Op\u0005l\u001fV5Qb\u001fZ$\u0004v\u001fHjQ\u007fZL9\u001f`\u0015L\u0011\u0012p\u0013T>3e\b\u0001p";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "]\u0015Np\u001fa\u001f_p\u0005kZN#\u0014$\u001b\u001b\u0004\u0019a\u0017^~0t\nx?\u001ct\u001bOp\u0005l\u001fV5Q,\u0015Ip\u0015a\tX5\u001f`\u001bU$X$\rR$\u0019$\u000eS9\u0002$\u001bX$\u0018r\u0013O)_";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "(ZL9\u001f`\u0015L\u0011\u0012p\u0013T>3e\bt&\u0014v\u0016Z)K$";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "(ZL9\u001f`\u0015L\u001e\u001eP\u0013O<\u0014>Z";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "(ZL9\u001f`\u0015L\u0011\u0012p\u0013T><k\u001e^\u001f\u0007a\bW1\b>Z";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "(ZZ>\u0015v\u0015R4Ks\u0013U4\u001es3H\u0016\u001dk\u001bO9\u001fc@\u001b";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "$\u0007";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "s\u0013U4\u001es";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "G\u0015N<\u0015j]Op\u0016a\u000e\u001b1\u0004`\u0013Tp\u001ce\u0014Z7\u0014v";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "E\nK\u0013\u001ei\nZ$5a\u0016^7\u0010p\u001f";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "e\u000f_9\u001e";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "s\u0013U4\u001es";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "P\u0012R#QE\u0019O9\u0007m\u000eBp\u0010h\b^1\u0015}ZS1\u0002$\u001bUp\u0010g\u000eR?\u001f$\u0018Z\"Qw\u000fK \u001dm\u001f_p\u0013}ZO8\u0014$\rR>\u0015k\r\u001b4\u0014g\u0015I~Q@\u0015\u001b>\u001epZI5\u0000q\u001fH$QS\u0013U4\u001esT}\u00150P/i\u0015.W/k\u0000>V.d\u00112P3t\u001e.F;ip\u0010j\u001e\u001b#\u0014pZL9\u001f`\u0015L\u0011\u0012p\u0013T>3e\b\u001b$\u001e$\u001cZ<\u0002aZR>Q}\u0015N\"Qp\u0012^=\u0014$\u000eTp\u0004w\u001f\u001b1QP\u0015T<\u0013e\b\u001b9\u001fw\u000e^1\u0015*";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "]\u0015Np\u0002l\u0015N<\u0015$\u0014T'Qq\t^p\u0005l\u001f\u001b\u0011\u0001t9T=\u0001e\u000e\u007f5\u001da\u001dZ$\u0014*<~\u0011%Q(~\u000f\"Q*k\u001f#P%z\u0013%M5u\u000f3E(d\u001f'A(w\u0011($\u0013_p\u0006l\u001fUp\u0003a\u000bN5\u0002p\u0013U7Qp\u0012R#Qb\u001fZ$\u0004v\u001f\u0015";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    void onPanelClosed(int i, Menu menu) {
        if (i == arj.Theme_spinnerStyle) {
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                try {
                    supportActionBar.dispatchMenuVisibilityChanged(false);
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
            try {
                if (!ActionBar.a) {
                    return;
                }
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }
        if (i == 0) {
            PanelFeatureState panelState = getPanelState(i, true);
            try {
                if (panelState.isOpen) {
                    closePanel(panelState, false);
                }
            } catch (IllegalStateException e22) {
                throw e22;
            }
        }
    }

    static void access$1400(AppCompatDelegateImplV7 appCompatDelegateImplV7, int i) {
        appCompatDelegateImplV7.closePanel(i);
    }

    private void invalidatePanelMenu(int i) {
        try {
            this.mInvalidatePanelMenuFeatures |= 1 << i;
            if (!this.mInvalidatePanelMenuPosted) {
                if (this.mWindowDecor != null) {
                    ViewCompat.postOnAnimation(this.mWindowDecor, this.mInvalidatePanelMenuRunnable);
                    this.mInvalidatePanelMenuPosted = true;
                }
            }
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    private void endOnGoingFadeAnimation() {
        try {
            if (this.mFadeAnim != null) {
                this.mFadeAnim.cancel();
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void installViewFactory() {
        LayoutInflater from = LayoutInflater.from(this.mContext);
        try {
            if (from.getFactory() == null) {
                LayoutInflaterCompat.setFactory(from, this);
                if (!ActionBar.a) {
                    return;
                }
            }
            Log.i(z[4], z[5]);
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public void onMenuModeChange(MenuBuilder menuBuilder) {
        reopenMenu(menuBuilder, true);
    }

    private int sanitizeWindowFeatureId(int i) {
        if (i == 8) {
            try {
                Log.i(z[0], z[3]);
                return arj.Theme_spinnerStyle;
            } catch (IllegalStateException e) {
                throw e;
            }
        } else if (i != 9) {
            return i;
        } else {
            try {
                Log.i(z[2], z[1]);
                return arj.Theme_switchStyle;
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }
    }

    public void setSupportActionBar(Toolbar toolbar) {
        try {
            if (this.mOriginalWindowCallback instanceof Activity) {
                try {
                    if (getSupportActionBar() instanceof WindowDecorActionBar) {
                        throw new IllegalStateException(z[20]);
                    }
                    this.mMenuInflater = null;
                    ActionBar toolbarActionBar = new ToolbarActionBar(toolbar, ((Activity) this.mContext).getTitle(), this.mAppCompatWindowCallback);
                    this.mActionBar = toolbarActionBar;
                    this.mWindow.setCallback(toolbarActionBar.getWrappedWindowCallback());
                    toolbarActionBar.invalidateOptionsMenu();
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    void onSubDecorInstalled(ViewGroup viewGroup) {
    }

    public View createView(View view, String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        try {
            boolean z;
            if (VERSION.SDK_INT < 21) {
                z = true;
            } else {
                z = false;
            }
            try {
                boolean z2;
                if (this.mAppCompatViewInflater == null) {
                    this.mAppCompatViewInflater = new AppCompatViewInflater();
                }
                if (z) {
                    try {
                        if (this.mSubDecorInstalled) {
                            if (shouldInheritContext((ViewParent) view)) {
                                z2 = true;
                                return this.mAppCompatViewInflater.createView(view, str, context, attributeSet, z2, z, true);
                            }
                        }
                    } catch (IllegalStateException e) {
                        throw e;
                    } catch (IllegalStateException e2) {
                        throw e2;
                    }
                }
                z2 = false;
                return this.mAppCompatViewInflater.createView(view, str, context, attributeSet, z2, z, true);
            } catch (IllegalStateException e22) {
                throw e22;
            }
        } catch (IllegalStateException e222) {
            throw e222;
        }
    }

    public void setContentView(View view) {
        ensureSubDecor();
        ViewGroup viewGroup = (ViewGroup) this.mSubDecor.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.mOriginalWindowCallback.onContentChanged();
    }

    boolean onKeyUp(int i, KeyEvent keyEvent) {
        switch (i) {
            case at.p /*4*/:
                boolean z = this.mLongPressBackDown;
                this.mLongPressBackDown = false;
                PanelFeatureState panelState = getPanelState(0, false);
                if (panelState != null) {
                    try {
                        if (panelState.isOpen) {
                            if (z) {
                                return true;
                            }
                            closePanel(panelState, true);
                            return true;
                        }
                    } catch (IllegalStateException e) {
                        throw e;
                    } catch (IllegalStateException e2) {
                        throw e2;
                    }
                }
                try {
                    if (onBackPressed()) {
                        return true;
                    }
                } catch (IllegalStateException e22) {
                    throw e22;
                }
                break;
            case arj.Theme_colorPrimary /*82*/:
                try {
                    onKeyUpPanel(0, keyEvent);
                    return true;
                } catch (IllegalStateException e222) {
                    throw e222;
                }
        }
        return false;
    }

    private void reopenMenu(MenuBuilder menuBuilder, boolean z) {
        try {
            if (this.mDecorContentParent != null) {
                if (this.mDecorContentParent.canShowOverflowMenu()) {
                    try {
                        if (!ViewConfigurationCompat.hasPermanentMenuKey(ViewConfiguration.get(this.mContext)) || this.mDecorContentParent.isOverflowMenuShowPending()) {
                            Window.Callback windowCallback = getWindowCallback();
                            try {
                                if (!(this.mDecorContentParent.isOverflowMenuShowing() && z)) {
                                    if (windowCallback != null) {
                                        try {
                                            if (!isDestroyed()) {
                                                try {
                                                    if (this.mInvalidatePanelMenuPosted) {
                                                        try {
                                                            if ((this.mInvalidatePanelMenuFeatures & 1) != 0) {
                                                                this.mWindowDecor.removeCallbacks(this.mInvalidatePanelMenuRunnable);
                                                                this.mInvalidatePanelMenuRunnable.run();
                                                            }
                                                        } catch (IllegalStateException e) {
                                                            throw e;
                                                        }
                                                    }
                                                    PanelFeatureState panelState = getPanelState(0, true);
                                                    try {
                                                        if (panelState.menu != null) {
                                                            if (!panelState.refreshMenuContent) {
                                                                try {
                                                                    if (windowCallback.onPreparePanel(0, panelState.createdPanelView, panelState.menu)) {
                                                                        windowCallback.onMenuOpened(arj.Theme_spinnerStyle, panelState.menu);
                                                                        this.mDecorContentParent.showOverflowMenu();
                                                                    }
                                                                } catch (IllegalStateException e2) {
                                                                    throw e2;
                                                                }
                                                            }
                                                        }
                                                        try {
                                                            if (!ActionBar.a) {
                                                                return;
                                                            }
                                                        } catch (IllegalStateException e22) {
                                                            throw e22;
                                                        }
                                                    } catch (IllegalStateException e222) {
                                                        throw e222;
                                                    } catch (IllegalStateException e2222) {
                                                        throw e2222;
                                                    }
                                                } catch (IllegalStateException e22222) {
                                                    throw e22222;
                                                }
                                            } else {
                                                return;
                                            }
                                        } catch (IllegalStateException e222222) {
                                            throw e222222;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                                this.mDecorContentParent.hideOverflowMenu();
                                if (!isDestroyed()) {
                                    windowCallback.onPanelClosed(arj.Theme_spinnerStyle, getPanelState(0, true).menu);
                                    return;
                                }
                                return;
                            } catch (IllegalStateException e2222222) {
                                throw e2222222;
                            } catch (IllegalStateException e22222222) {
                                try {
                                    throw e22222222;
                                } catch (IllegalStateException e222222222) {
                                    throw e222222222;
                                }
                            }
                        }
                    } catch (IllegalStateException e2222222222) {
                        throw e2222222222;
                    }
                }
            }
            PanelFeatureState panelState2 = getPanelState(0, true);
            panelState2.refreshDecorView = true;
            closePanel(panelState2, false);
            openPanel(panelState2, null);
        } catch (IllegalStateException e22222222222) {
            throw e22222222222;
        } catch (IllegalStateException e222222222222) {
            throw e222222222222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void openPanel(android.support.v7.app.AppCompatDelegateImplV7.PanelFeatureState r11, android.view.KeyEvent r12) {
        /*
        r10 = this;
        r4 = -1;
        r3 = 0;
        r9 = 1;
        r2 = -2;
        r0 = r11.isOpen;	 Catch:{ IllegalStateException -> 0x000f }
        if (r0 != 0) goto L_0x000e;
    L_0x0008:
        r0 = r10.isDestroyed();	 Catch:{ IllegalStateException -> 0x0011 }
        if (r0 == 0) goto L_0x0013;
    L_0x000e:
        return;
    L_0x000f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0011 }
    L_0x0011:
        r0 = move-exception;
        throw r0;
    L_0x0013:
        r0 = r11.featureId;
        if (r0 != 0) goto L_0x0038;
    L_0x0017:
        r1 = r10.mContext;
        r0 = r1.getResources();
        r0 = r0.getConfiguration();
        r0 = r0.screenLayout;	 Catch:{ IllegalStateException -> 0x004f }
        r0 = r0 & 15;
        r5 = 4;
        if (r0 != r5) goto L_0x0051;
    L_0x0028:
        r0 = r9;
    L_0x0029:
        r1 = r1.getApplicationInfo();	 Catch:{ IllegalStateException -> 0x0053 }
        r1 = r1.targetSdkVersion;	 Catch:{ IllegalStateException -> 0x0053 }
        r5 = 11;
        if (r1 < r5) goto L_0x0055;
    L_0x0033:
        r1 = r9;
    L_0x0034:
        if (r0 == 0) goto L_0x0038;
    L_0x0036:
        if (r1 != 0) goto L_0x000e;
    L_0x0038:
        r0 = r10.getWindowCallback();
        if (r0 == 0) goto L_0x0057;
    L_0x003e:
        r1 = r11.featureId;	 Catch:{ IllegalStateException -> 0x004d }
        r5 = r11.menu;	 Catch:{ IllegalStateException -> 0x004d }
        r0 = r0.onMenuOpened(r1, r5);	 Catch:{ IllegalStateException -> 0x004d }
        if (r0 != 0) goto L_0x0057;
    L_0x0048:
        r0 = 1;
        r10.closePanel(r11, r0);	 Catch:{ IllegalStateException -> 0x004d }
        goto L_0x000e;
    L_0x004d:
        r0 = move-exception;
        throw r0;
    L_0x004f:
        r0 = move-exception;
        throw r0;
    L_0x0051:
        r0 = r3;
        goto L_0x0029;
    L_0x0053:
        r0 = move-exception;
        throw r0;
    L_0x0055:
        r1 = r3;
        goto L_0x0034;
    L_0x0057:
        r0 = r10.mContext;
        r1 = z;
        r5 = 15;
        r1 = r1[r5];
        r0 = r0.getSystemService(r1);
        r8 = r0;
        r8 = (android.view.WindowManager) r8;
        if (r8 == 0) goto L_0x000e;
    L_0x0068:
        r0 = r10.preparePanel(r11, r12);	 Catch:{ IllegalStateException -> 0x0102 }
        if (r0 == 0) goto L_0x000e;
    L_0x006e:
        r0 = r11.decorView;	 Catch:{ IllegalStateException -> 0x0104 }
        if (r0 == 0) goto L_0x0076;
    L_0x0072:
        r0 = r11.refreshDecorView;	 Catch:{ IllegalStateException -> 0x0106 }
        if (r0 == 0) goto L_0x00d0;
    L_0x0076:
        r0 = r11.decorView;	 Catch:{ IllegalStateException -> 0x0108 }
        if (r0 != 0) goto L_0x010e;
    L_0x007a:
        r0 = r10.initializePanelDecor(r11);	 Catch:{ IllegalStateException -> 0x010a }
        if (r0 == 0) goto L_0x000e;
    L_0x0080:
        r0 = r11.decorView;	 Catch:{ IllegalStateException -> 0x010c }
        if (r0 == 0) goto L_0x000e;
    L_0x0084:
        r0 = r10.initializePanelContent(r11);	 Catch:{ IllegalStateException -> 0x0125 }
        if (r0 == 0) goto L_0x000e;
    L_0x008a:
        r0 = r11.hasPanelItems();	 Catch:{ IllegalStateException -> 0x0127 }
        if (r0 == 0) goto L_0x000e;
    L_0x0090:
        r0 = r11.shownPanelView;
        r0 = r0.getLayoutParams();
        if (r0 != 0) goto L_0x0133;
    L_0x0098:
        r0 = new android.view.ViewGroup$LayoutParams;
        r0.<init>(r2, r2);
        r1 = r0;
    L_0x009e:
        r0 = r11.background;
        r5 = r11.decorView;
        r5.setBackgroundResource(r0);
        r0 = r11.shownPanelView;
        r0 = r0.getParent();
        if (r0 == 0) goto L_0x00b8;
    L_0x00ad:
        r5 = r0 instanceof android.view.ViewGroup;	 Catch:{ IllegalStateException -> 0x0129 }
        if (r5 == 0) goto L_0x00b8;
    L_0x00b1:
        r0 = (android.view.ViewGroup) r0;	 Catch:{ IllegalStateException -> 0x0129 }
        r5 = r11.shownPanelView;	 Catch:{ IllegalStateException -> 0x0129 }
        r0.removeView(r5);	 Catch:{ IllegalStateException -> 0x0129 }
    L_0x00b8:
        r0 = r11.decorView;	 Catch:{ IllegalStateException -> 0x012b }
        r5 = r11.shownPanelView;	 Catch:{ IllegalStateException -> 0x012b }
        r0.addView(r5, r1);	 Catch:{ IllegalStateException -> 0x012b }
        r0 = r11.shownPanelView;	 Catch:{ IllegalStateException -> 0x012b }
        r0 = r0.hasFocus();	 Catch:{ IllegalStateException -> 0x012b }
        if (r0 != 0) goto L_0x00cc;
    L_0x00c7:
        r0 = r11.shownPanelView;	 Catch:{ IllegalStateException -> 0x012b }
        r0.requestFocus();	 Catch:{ IllegalStateException -> 0x012b }
    L_0x00cc:
        r0 = android.support.v7.app.ActionBar.a;	 Catch:{ IllegalStateException -> 0x012d }
        if (r0 == 0) goto L_0x0131;
    L_0x00d0:
        r0 = r11.createdPanelView;	 Catch:{ IllegalStateException -> 0x012d }
        if (r0 == 0) goto L_0x0131;
    L_0x00d4:
        r0 = r11.createdPanelView;
        r0 = r0.getLayoutParams();
        if (r0 == 0) goto L_0x0131;
    L_0x00dc:
        r0 = r0.width;	 Catch:{ IllegalStateException -> 0x012f }
        if (r0 != r4) goto L_0x0131;
    L_0x00e0:
        r1 = r4;
    L_0x00e1:
        r11.isHandled = r3;
        r0 = new android.view.WindowManager$LayoutParams;
        r3 = r11.x;
        r4 = r11.y;
        r5 = 1002; // 0x3ea float:1.404E-42 double:4.95E-321;
        r6 = 8519680; // 0x820000 float:1.1938615E-38 double:4.209281E-317;
        r7 = -3;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7);
        r1 = r11.gravity;
        r0.gravity = r1;
        r1 = r11.windowAnimations;
        r0.windowAnimations = r1;
        r1 = r11.decorView;
        r8.addView(r1, r0);
        r11.isOpen = r9;
        goto L_0x000e;
    L_0x0102:
        r0 = move-exception;
        throw r0;
    L_0x0104:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0106 }
    L_0x0106:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0108 }
    L_0x0108:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x010a }
    L_0x010a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x010c }
    L_0x010c:
        r0 = move-exception;
        throw r0;
    L_0x010e:
        r0 = r11.refreshDecorView;	 Catch:{ IllegalStateException -> 0x0123 }
        if (r0 == 0) goto L_0x0084;
    L_0x0112:
        r0 = r11.decorView;	 Catch:{ IllegalStateException -> 0x0121 }
        r0 = r0.getChildCount();	 Catch:{ IllegalStateException -> 0x0121 }
        if (r0 <= 0) goto L_0x0084;
    L_0x011a:
        r0 = r11.decorView;	 Catch:{ IllegalStateException -> 0x0121 }
        r0.removeAllViews();	 Catch:{ IllegalStateException -> 0x0121 }
        goto L_0x0084;
    L_0x0121:
        r0 = move-exception;
        throw r0;
    L_0x0123:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0121 }
    L_0x0125:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0127 }
    L_0x0127:
        r0 = move-exception;
        throw r0;
    L_0x0129:
        r0 = move-exception;
        throw r0;
    L_0x012b:
        r0 = move-exception;
        throw r0;
    L_0x012d:
        r0 = move-exception;
        throw r0;
    L_0x012f:
        r0 = move-exception;
        throw r0;
    L_0x0131:
        r1 = r2;
        goto L_0x00e1;
    L_0x0133:
        r1 = r0;
        goto L_0x009e;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AppCompatDelegateImplV7.openPanel(android.support.v7.app.AppCompatDelegateImplV7$PanelFeatureState, android.view.KeyEvent):void");
    }

    private void closePanel(int i) {
        closePanel(getPanelState(i, true), true);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean onKeyUpPanel(int r7, android.view.KeyEvent r8) {
        /*
        r6 = this;
        r2 = 1;
        r0 = 0;
        r3 = android.support.v7.app.ActionBar.a;
        r1 = r6.mActionMode;	 Catch:{ IllegalStateException -> 0x0009 }
        if (r1 == 0) goto L_0x000b;
    L_0x0008:
        return r0;
    L_0x0009:
        r0 = move-exception;
        throw r0;
    L_0x000b:
        r4 = r6.getPanelState(r7, r2);
        if (r7 != 0) goto L_0x00af;
    L_0x0011:
        r1 = r6.mDecorContentParent;	 Catch:{ IllegalStateException -> 0x009b }
        if (r1 == 0) goto L_0x00af;
    L_0x0015:
        r1 = r6.mDecorContentParent;	 Catch:{ IllegalStateException -> 0x009d }
        r1 = r1.canShowOverflowMenu();	 Catch:{ IllegalStateException -> 0x009d }
        if (r1 == 0) goto L_0x00af;
    L_0x001d:
        r1 = r6.mContext;	 Catch:{ IllegalStateException -> 0x009f }
        r1 = android.view.ViewConfiguration.get(r1);	 Catch:{ IllegalStateException -> 0x009f }
        r1 = android.support.v4.view.ViewConfigurationCompat.hasPermanentMenuKey(r1);	 Catch:{ IllegalStateException -> 0x009f }
        if (r1 != 0) goto L_0x00af;
    L_0x0029:
        r1 = r6.mDecorContentParent;	 Catch:{ IllegalStateException -> 0x00a1 }
        r1 = r1.isOverflowMenuShowing();	 Catch:{ IllegalStateException -> 0x00a1 }
        if (r1 != 0) goto L_0x0045;
    L_0x0031:
        r1 = r6.isDestroyed();	 Catch:{ IllegalStateException -> 0x00a3 }
        if (r1 != 0) goto L_0x00ad;
    L_0x0037:
        r1 = r6.preparePanel(r4, r8);	 Catch:{ IllegalStateException -> 0x00a3 }
        if (r1 == 0) goto L_0x00ad;
    L_0x003d:
        r1 = r6.mDecorContentParent;
        r1 = r1.showOverflowMenu();
        if (r3 == 0) goto L_0x0071;
    L_0x0045:
        r1 = r6.mDecorContentParent;
        r1 = r1.hideOverflowMenu();
        if (r3 == 0) goto L_0x0071;
    L_0x004d:
        r5 = r4.isOpen;	 Catch:{ IllegalStateException -> 0x00a5 }
        if (r5 != 0) goto L_0x0055;
    L_0x0051:
        r5 = r4.isHandled;	 Catch:{ IllegalStateException -> 0x00a5 }
        if (r5 == 0) goto L_0x005d;
    L_0x0055:
        r1 = r4.isOpen;
        r5 = 1;
        r6.closePanel(r4, r5);	 Catch:{ IllegalStateException -> 0x00a7 }
        if (r3 == 0) goto L_0x0071;
    L_0x005d:
        r5 = r4.isPrepared;	 Catch:{ IllegalStateException -> 0x00a7 }
        if (r5 == 0) goto L_0x0071;
    L_0x0061:
        r5 = r4.refreshMenuContent;
        if (r5 == 0) goto L_0x00ab;
    L_0x0065:
        r4.isPrepared = r0;
        r0 = r6.preparePanel(r4, r8);
    L_0x006b:
        if (r0 == 0) goto L_0x0071;
    L_0x006d:
        r6.openPanel(r4, r8);
        r1 = r2;
    L_0x0071:
        if (r1 == 0) goto L_0x0098;
    L_0x0073:
        r0 = r6.mContext;
        r2 = z;
        r4 = 18;
        r2 = r2[r4];
        r0 = r0.getSystemService(r2);
        r0 = (android.media.AudioManager) r0;
        if (r0 == 0) goto L_0x0089;
    L_0x0083:
        r2 = 0;
        r0.playSoundEffect(r2);	 Catch:{ IllegalStateException -> 0x00a9 }
        if (r3 == 0) goto L_0x0098;
    L_0x0089:
        r0 = z;	 Catch:{ IllegalStateException -> 0x00a9 }
        r2 = 17;
        r0 = r0[r2];	 Catch:{ IllegalStateException -> 0x00a9 }
        r2 = z;	 Catch:{ IllegalStateException -> 0x00a9 }
        r3 = 16;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x00a9 }
        android.util.Log.w(r0, r2);	 Catch:{ IllegalStateException -> 0x00a9 }
    L_0x0098:
        r0 = r1;
        goto L_0x0008;
    L_0x009b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x009d }
    L_0x009d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x009f }
    L_0x009f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00a1 }
    L_0x00a1:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00a3 }
    L_0x00a3:
        r0 = move-exception;
        throw r0;
    L_0x00a5:
        r0 = move-exception;
        throw r0;
    L_0x00a7:
        r0 = move-exception;
        throw r0;
    L_0x00a9:
        r0 = move-exception;
        throw r0;
    L_0x00ab:
        r0 = r2;
        goto L_0x006b;
    L_0x00ad:
        r1 = r0;
        goto L_0x0071;
    L_0x00af:
        r1 = r0;
        goto L_0x004d;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AppCompatDelegateImplV7.onKeyUpPanel(int, android.view.KeyEvent):boolean");
    }

    private void dismissPopups() {
        try {
            if (this.mDecorContentParent != null) {
                this.mDecorContentParent.dismissPopups();
            }
            try {
                if (this.mActionModePopup != null) {
                    try {
                        this.mWindowDecor.removeCallbacks(this.mShowActionModePopup);
                        if (this.mActionModePopup.isShowing()) {
                            try {
                                this.mActionModePopup.dismiss();
                            } catch (IllegalArgumentException e) {
                            }
                        }
                        this.mActionModePopup = null;
                    } catch (IllegalStateException e2) {
                        throw e2;
                    }
                }
                endOnGoingFadeAnimation();
                PanelFeatureState panelState = getPanelState(0, false);
                if (panelState != null) {
                    try {
                        if (panelState.menu != null) {
                            panelState.menu.close();
                        }
                    } catch (IllegalArgumentException e3) {
                        throw e3;
                    }
                }
            } catch (IllegalArgumentException e32) {
                throw e32;
            }
        } catch (IllegalArgumentException e322) {
            throw e322;
        }
    }

    void onTitleChanged(CharSequence charSequence) {
        boolean z = ActionBar.a;
        try {
            if (this.mDecorContentParent != null) {
                this.mDecorContentParent.setWindowTitle(charSequence);
                if (!z) {
                    return;
                }
            }
            try {
                if (peekSupportActionBar() != null) {
                    try {
                        peekSupportActionBar().setWindowTitle(charSequence);
                        if (!z) {
                            return;
                        }
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
            } catch (IllegalStateException e2) {
                throw e2;
            }
            try {
                if (this.mTitleView != null) {
                    this.mTitleView.setText(charSequence);
                }
            } catch (IllegalStateException e22) {
                throw e22;
            }
        } catch (IllegalStateException e222) {
            throw e222;
        } catch (IllegalStateException e2222) {
            throw e2222;
        }
    }

    AppCompatDelegateImplV7(Context context, Window window, AppCompatCallback appCompatCallback) {
        super(context, window, appCompatCallback);
        this.mFadeAnim = null;
        this.mInvalidatePanelMenuRunnable = new 1(this);
    }

    public void onConfigurationChanged(Configuration configuration) {
        try {
            if (this.mHasActionBar && this.mSubDecorInstalled) {
                ActionBar supportActionBar = getSupportActionBar();
                if (supportActionBar != null) {
                    try {
                        supportActionBar.onConfigurationChanged(configuration);
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    private void closePanel(PanelFeatureState panelFeatureState, boolean z) {
        if (z) {
            try {
                if (panelFeatureState.featureId == 0) {
                    if (this.mDecorContentParent != null) {
                        try {
                            if (this.mDecorContentParent.isOverflowMenuShowing()) {
                                checkCloseActionMenu(panelFeatureState.menu);
                                return;
                            }
                        } catch (IllegalStateException e) {
                            throw e;
                        }
                    }
                }
            } catch (IllegalStateException e2) {
                throw e2;
            } catch (IllegalStateException e22) {
                throw e22;
            }
        }
        WindowManager windowManager = (WindowManager) this.mContext.getSystemService(z[19]);
        if (windowManager != null) {
            try {
                if (panelFeatureState.isOpen) {
                    if (panelFeatureState.decorView != null) {
                        try {
                            windowManager.removeView(panelFeatureState.decorView);
                            if (z) {
                                callOnPanelClosed(panelFeatureState.featureId, panelFeatureState, null);
                            }
                        } catch (IllegalStateException e222) {
                            throw e222;
                        }
                    }
                }
            } catch (IllegalStateException e2222) {
                throw e2222;
            } catch (IllegalStateException e22222) {
                throw e22222;
            }
        }
        try {
            panelFeatureState.isPrepared = false;
            panelFeatureState.isHandled = false;
            panelFeatureState.isOpen = false;
            panelFeatureState.shownPanelView = null;
            panelFeatureState.refreshDecorView = true;
            if (this.mPreparedPanel == panelFeatureState) {
                this.mPreparedPanel = null;
            }
        } catch (IllegalStateException e222222) {
            throw e222222;
        }
    }

    static void access$900(AppCompatDelegateImplV7 appCompatDelegateImplV7, int i, PanelFeatureState panelFeatureState, Menu menu) {
        appCompatDelegateImplV7.callOnPanelClosed(i, panelFeatureState, menu);
    }

    public ActionMode startSupportActionMode(ActionMode.Callback callback) {
        if (callback == null) {
            try {
                throw new IllegalArgumentException(z[6]);
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        try {
            if (this.mActionMode != null) {
                this.mActionMode.finish();
            }
            ActionMode.Callback actionModeCallbackWrapperV7 = new ActionModeCallbackWrapperV7(this, callback);
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                try {
                    this.mActionMode = supportActionBar.startActionMode(actionModeCallbackWrapperV7);
                    if (this.mActionMode != null) {
                        if (this.mAppCompatCallback != null) {
                            this.mAppCompatCallback.onSupportActionModeStarted(this.mActionMode);
                        }
                    }
                } catch (IllegalStateException e2) {
                    throw e2;
                } catch (IllegalStateException e22) {
                    throw e22;
                }
            }
            try {
                if (this.mActionMode == null) {
                    this.mActionMode = startSupportActionModeFromWindow(actionModeCallbackWrapperV7);
                }
                return this.mActionMode;
            } catch (IllegalStateException e222) {
                throw e222;
            }
        } catch (IllegalStateException e2222) {
            throw e2222;
        }
    }

    public boolean requestWindowFeature(int i) {
        int sanitizeWindowFeatureId = sanitizeWindowFeatureId(i);
        try {
            if (this.mWindowNoTitle && sanitizeWindowFeatureId == arj.Theme_spinnerStyle) {
                return false;
            }
            try {
                if (this.mHasActionBar && sanitizeWindowFeatureId == 1) {
                    this.mHasActionBar = false;
                }
                switch (sanitizeWindowFeatureId) {
                    case at.g /*1*/:
                        throwFeatureRequestIfSubDecorInstalled();
                        this.mWindowNoTitle = true;
                        return true;
                    case at.i /*2*/:
                        throwFeatureRequestIfSubDecorInstalled();
                        this.mFeatureProgress = true;
                        return true;
                    case at.m /*5*/:
                        throwFeatureRequestIfSubDecorInstalled();
                        this.mFeatureIndeterminateProgress = true;
                        return true;
                    case Y.t /*10*/:
                        throwFeatureRequestIfSubDecorInstalled();
                        this.mOverlayActionMode = true;
                        return true;
                    case arj.Theme_spinnerStyle /*108*/:
                        try {
                            throwFeatureRequestIfSubDecorInstalled();
                            this.mHasActionBar = true;
                            return true;
                        } catch (IllegalStateException e) {
                            throw e;
                        }
                    case arj.Theme_switchStyle /*109*/:
                        throwFeatureRequestIfSubDecorInstalled();
                        this.mOverlayActionBar = true;
                        return true;
                    default:
                        return this.mWindow.requestFeature(sanitizeWindowFeatureId);
                }
            } catch (IllegalStateException e2) {
                throw e2;
            } catch (IllegalStateException e22) {
                throw e22;
            }
        } catch (IllegalStateException e222) {
            throw e222;
        } catch (IllegalStateException e2222) {
            throw e2222;
        }
    }

    public void invalidateOptionsMenu() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            try {
                if (supportActionBar.invalidateOptionsMenu()) {
                    return;
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        invalidatePanelMenu(0);
    }

    private void callOnPanelClosed(int i, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i >= 0) {
                try {
                    if (i < this.mPanels.length) {
                        panelFeatureState = this.mPanels[i];
                    }
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.menu;
            }
        }
        if (panelFeatureState != null) {
            try {
                if (!panelFeatureState.isOpen) {
                    return;
                }
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }
        try {
            if (!isDestroyed()) {
                this.mOriginalWindowCallback.onPanelClosed(i, menu);
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    private void applyFixedSizeWindow() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.mSubDecor.findViewById(16908290);
        contentFrameLayout.setDecorPadding(this.mWindowDecor.getPaddingLeft(), this.mWindowDecor.getPaddingTop(), this.mWindowDecor.getPaddingRight(), this.mWindowDecor.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.mContext.obtainStyledAttributes(R.styleable.Theme);
        try {
            obtainStyledAttributes.getValue(R.styleable.Theme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
            obtainStyledAttributes.getValue(R.styleable.Theme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
            if (obtainStyledAttributes.hasValue(R.styleable.Theme_windowFixedWidthMajor)) {
                obtainStyledAttributes.getValue(R.styleable.Theme_windowFixedWidthMajor, contentFrameLayout.getFixedWidthMajor());
            }
            try {
                if (obtainStyledAttributes.hasValue(R.styleable.Theme_windowFixedWidthMinor)) {
                    obtainStyledAttributes.getValue(R.styleable.Theme_windowFixedWidthMinor, contentFrameLayout.getFixedWidthMinor());
                }
                try {
                    if (obtainStyledAttributes.hasValue(R.styleable.Theme_windowFixedHeightMajor)) {
                        obtainStyledAttributes.getValue(R.styleable.Theme_windowFixedHeightMajor, contentFrameLayout.getFixedHeightMajor());
                    }
                    try {
                        if (obtainStyledAttributes.hasValue(R.styleable.Theme_windowFixedHeightMinor)) {
                            obtainStyledAttributes.getValue(R.styleable.Theme_windowFixedHeightMinor, contentFrameLayout.getFixedHeightMinor());
                        }
                        obtainStyledAttributes.recycle();
                        contentFrameLayout.requestLayout();
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            } catch (IllegalStateException e22) {
                throw e22;
            }
        } catch (IllegalStateException e222) {
            throw e222;
        }
    }

    private PanelFeatureState findMenuPanel(Menu menu) {
        boolean z = ActionBar.a;
        PanelFeatureState[] panelFeatureStateArr = this.mPanels;
        if (panelFeatureStateArr != null) {
            try {
                int length = panelFeatureStateArr.length;
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        length = 0;
        int i = 0;
        while (i < length) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
            if (panelFeatureState != null) {
                try {
                    if (panelFeatureState.menu == menu) {
                        return panelFeatureState;
                    }
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            }
            int i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        return null;
    }

    static void access$100(AppCompatDelegateImplV7 appCompatDelegateImplV7, int i) {
        appCompatDelegateImplV7.doInvalidatePanelMenu(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean preparePanel(android.support.v7.app.AppCompatDelegateImplV7.PanelFeatureState r8, android.view.KeyEvent r9) {
        /*
        r7 = this;
        r2 = 1;
        r1 = 0;
        r0 = r7.isDestroyed();	 Catch:{ IllegalStateException -> 0x0009 }
        if (r0 == 0) goto L_0x000b;
    L_0x0008:
        return r1;
    L_0x0009:
        r0 = move-exception;
        throw r0;
    L_0x000b:
        r0 = r8.isPrepared;	 Catch:{ IllegalStateException -> 0x0011 }
        if (r0 == 0) goto L_0x0013;
    L_0x000f:
        r1 = r2;
        goto L_0x0008;
    L_0x0011:
        r0 = move-exception;
        throw r0;
    L_0x0013:
        r0 = r7.mPreparedPanel;	 Catch:{ IllegalStateException -> 0x00a9 }
        if (r0 == 0) goto L_0x0021;
    L_0x0017:
        r0 = r7.mPreparedPanel;	 Catch:{ IllegalStateException -> 0x00ab }
        if (r0 == r8) goto L_0x0021;
    L_0x001b:
        r0 = r7.mPreparedPanel;	 Catch:{ IllegalStateException -> 0x00ab }
        r3 = 0;
        r7.closePanel(r0, r3);	 Catch:{ IllegalStateException -> 0x00ab }
    L_0x0021:
        r3 = r7.getWindowCallback();
        if (r3 == 0) goto L_0x002f;
    L_0x0027:
        r0 = r8.featureId;	 Catch:{ IllegalStateException -> 0x00ad }
        r0 = r3.onCreatePanelView(r0);	 Catch:{ IllegalStateException -> 0x00ad }
        r8.createdPanelView = r0;	 Catch:{ IllegalStateException -> 0x00ad }
    L_0x002f:
        r0 = r8.featureId;	 Catch:{ IllegalStateException -> 0x00af }
        if (r0 == 0) goto L_0x0039;
    L_0x0033:
        r0 = r8.featureId;	 Catch:{ IllegalStateException -> 0x00b1 }
        r4 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        if (r0 != r4) goto L_0x00b3;
    L_0x0039:
        r0 = r2;
    L_0x003a:
        if (r0 == 0) goto L_0x0045;
    L_0x003c:
        r4 = r7.mDecorContentParent;	 Catch:{ IllegalStateException -> 0x00b5 }
        if (r4 == 0) goto L_0x0045;
    L_0x0040:
        r4 = r7.mDecorContentParent;	 Catch:{ IllegalStateException -> 0x00b5 }
        r4.setMenuPrepared();	 Catch:{ IllegalStateException -> 0x00b5 }
    L_0x0045:
        r4 = r8.createdPanelView;	 Catch:{ IllegalStateException -> 0x00b7 }
        if (r4 != 0) goto L_0x012b;
    L_0x0049:
        if (r0 == 0) goto L_0x0053;
    L_0x004b:
        r4 = r7.peekSupportActionBar();	 Catch:{ IllegalStateException -> 0x00bb }
        r4 = r4 instanceof android.support.v7.app.ToolbarActionBar;	 Catch:{ IllegalStateException -> 0x00bb }
        if (r4 != 0) goto L_0x012b;
    L_0x0053:
        r4 = r8.menu;	 Catch:{ IllegalStateException -> 0x00bd }
        if (r4 == 0) goto L_0x005b;
    L_0x0057:
        r4 = r8.refreshMenuContent;	 Catch:{ IllegalStateException -> 0x00bf }
        if (r4 == 0) goto L_0x00d1;
    L_0x005b:
        r4 = r8.menu;	 Catch:{ IllegalStateException -> 0x00c1 }
        if (r4 != 0) goto L_0x0069;
    L_0x005f:
        r4 = r7.initializePanelMenu(r8);	 Catch:{ IllegalStateException -> 0x00c3 }
        if (r4 == 0) goto L_0x0008;
    L_0x0065:
        r4 = r8.menu;	 Catch:{ IllegalStateException -> 0x00c5 }
        if (r4 == 0) goto L_0x0008;
    L_0x0069:
        if (r0 == 0) goto L_0x0084;
    L_0x006b:
        r4 = r7.mDecorContentParent;	 Catch:{ IllegalStateException -> 0x00c7 }
        if (r4 == 0) goto L_0x0084;
    L_0x006f:
        r4 = r7.mActionMenuPresenterCallback;	 Catch:{ IllegalStateException -> 0x00c9 }
        if (r4 != 0) goto L_0x007b;
    L_0x0073:
        r4 = new android.support.v7.app.AppCompatDelegateImplV7$ActionMenuPresenterCallback;	 Catch:{ IllegalStateException -> 0x00c9 }
        r5 = 0;
        r4.<init>(r7, r5);	 Catch:{ IllegalStateException -> 0x00c9 }
        r7.mActionMenuPresenterCallback = r4;	 Catch:{ IllegalStateException -> 0x00c9 }
    L_0x007b:
        r4 = r7.mDecorContentParent;
        r5 = r8.menu;
        r6 = r7.mActionMenuPresenterCallback;
        r4.setMenu(r5, r6);
    L_0x0084:
        r4 = r8.menu;	 Catch:{ IllegalStateException -> 0x00cb }
        r4.stopDispatchingItemsChanged();	 Catch:{ IllegalStateException -> 0x00cb }
        r4 = r8.featureId;	 Catch:{ IllegalStateException -> 0x00cb }
        r5 = r8.menu;	 Catch:{ IllegalStateException -> 0x00cb }
        r4 = r3.onCreatePanelMenu(r4, r5);	 Catch:{ IllegalStateException -> 0x00cb }
        if (r4 != 0) goto L_0x00cf;
    L_0x0093:
        r2 = 0;
        r8.setMenu(r2);	 Catch:{ IllegalStateException -> 0x00cd }
        if (r0 == 0) goto L_0x0008;
    L_0x0099:
        r0 = r7.mDecorContentParent;	 Catch:{ IllegalStateException -> 0x00a7 }
        if (r0 == 0) goto L_0x0008;
    L_0x009d:
        r0 = r7.mDecorContentParent;	 Catch:{ IllegalStateException -> 0x00a7 }
        r2 = 0;
        r3 = r7.mActionMenuPresenterCallback;	 Catch:{ IllegalStateException -> 0x00a7 }
        r0.setMenu(r2, r3);	 Catch:{ IllegalStateException -> 0x00a7 }
        goto L_0x0008;
    L_0x00a7:
        r0 = move-exception;
        throw r0;
    L_0x00a9:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00ab }
    L_0x00ab:
        r0 = move-exception;
        throw r0;
    L_0x00ad:
        r0 = move-exception;
        throw r0;
    L_0x00af:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00b1 }
    L_0x00b1:
        r0 = move-exception;
        throw r0;
    L_0x00b3:
        r0 = r1;
        goto L_0x003a;
    L_0x00b5:
        r0 = move-exception;
        throw r0;
    L_0x00b7:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00b9 }
    L_0x00b9:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00bb }
    L_0x00bb:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00bd }
    L_0x00bd:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00bf }
    L_0x00bf:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00c1 }
    L_0x00c1:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00c3 }
    L_0x00c3:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00c5 }
    L_0x00c5:
        r0 = move-exception;
        throw r0;
    L_0x00c7:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00c9 }
    L_0x00c9:
        r0 = move-exception;
        throw r0;
    L_0x00cb:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00cd }
    L_0x00cd:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00a7 }
    L_0x00cf:
        r8.refreshMenuContent = r1;
    L_0x00d1:
        r4 = r8.menu;	 Catch:{ IllegalStateException -> 0x0104 }
        r4.stopDispatchingItemsChanged();	 Catch:{ IllegalStateException -> 0x0104 }
        r4 = r8.frozenActionViewState;	 Catch:{ IllegalStateException -> 0x0104 }
        if (r4 == 0) goto L_0x00e4;
    L_0x00da:
        r4 = r8.menu;	 Catch:{ IllegalStateException -> 0x0104 }
        r5 = r8.frozenActionViewState;	 Catch:{ IllegalStateException -> 0x0104 }
        r4.restoreActionViewStates(r5);	 Catch:{ IllegalStateException -> 0x0104 }
        r4 = 0;
        r8.frozenActionViewState = r4;	 Catch:{ IllegalStateException -> 0x0104 }
    L_0x00e4:
        r4 = 0;
        r5 = r8.createdPanelView;	 Catch:{ IllegalStateException -> 0x0106 }
        r6 = r8.menu;	 Catch:{ IllegalStateException -> 0x0106 }
        r3 = r3.onPreparePanel(r4, r5, r6);	 Catch:{ IllegalStateException -> 0x0106 }
        if (r3 != 0) goto L_0x010c;
    L_0x00ef:
        if (r0 == 0) goto L_0x00fd;
    L_0x00f1:
        r0 = r7.mDecorContentParent;	 Catch:{ IllegalStateException -> 0x010a }
        if (r0 == 0) goto L_0x00fd;
    L_0x00f5:
        r0 = r7.mDecorContentParent;	 Catch:{ IllegalStateException -> 0x010a }
        r2 = 0;
        r3 = r7.mActionMenuPresenterCallback;	 Catch:{ IllegalStateException -> 0x010a }
        r0.setMenu(r2, r3);	 Catch:{ IllegalStateException -> 0x010a }
    L_0x00fd:
        r0 = r8.menu;
        r0.startDispatchingItemsChanged();
        goto L_0x0008;
    L_0x0104:
        r0 = move-exception;
        throw r0;
    L_0x0106:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0108 }
    L_0x0108:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x010a }
    L_0x010a:
        r0 = move-exception;
        throw r0;
    L_0x010c:
        if (r9 == 0) goto L_0x0136;
    L_0x010e:
        r0 = r9.getDeviceId();	 Catch:{ IllegalStateException -> 0x0134 }
    L_0x0112:
        r0 = android.view.KeyCharacterMap.load(r0);
        r0 = r0.getKeyboardType();	 Catch:{ IllegalStateException -> 0x0138 }
        if (r0 == r2) goto L_0x013a;
    L_0x011c:
        r0 = r2;
    L_0x011d:
        r8.qwertyMode = r0;
        r0 = r8.menu;
        r3 = r8.qwertyMode;
        r0.setQwertyMode(r3);
        r0 = r8.menu;
        r0.startDispatchingItemsChanged();
    L_0x012b:
        r8.isPrepared = r2;
        r8.isHandled = r1;
        r7.mPreparedPanel = r8;
        r1 = r2;
        goto L_0x0008;
    L_0x0134:
        r0 = move-exception;
        throw r0;
    L_0x0136:
        r0 = -1;
        goto L_0x0112;
    L_0x0138:
        r0 = move-exception;
        throw r0;
    L_0x013a:
        r0 = r1;
        goto L_0x011d;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AppCompatDelegateImplV7.preparePanel(android.support.v7.app.AppCompatDelegateImplV7$PanelFeatureState, android.view.KeyEvent):boolean");
    }

    public void onPostResume() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            try {
                supportActionBar.setShowHideAnimationEnabled(true);
            } catch (IllegalStateException e) {
                throw e;
            }
        }
    }

    private boolean initializePanelDecor(PanelFeatureState panelFeatureState) {
        panelFeatureState.setStyle(getActionBarThemedContext());
        panelFeatureState.decorView = new ListMenuDecorView(this, panelFeatureState.listPresenterContext);
        panelFeatureState.gravity = 81;
        return true;
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        ensureSubDecor();
        ((ViewGroup) this.mSubDecor.findViewById(16908290)).addView(view, layoutParams);
        this.mOriginalWindowCallback.onContentChanged();
    }

    static void access$500(AppCompatDelegateImplV7 appCompatDelegateImplV7) {
        appCompatDelegateImplV7.endOnGoingFadeAnimation();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.ViewGroup createSubDecor() {
        /*
        r8 = this;
        r7 = 1;
        r2 = 0;
        r6 = 0;
        r4 = android.support.v7.app.ActionBar.a;
        r1 = r8.mContext;
        r3 = android.support.v7.appcompat.R.styleable.Theme;
        r1 = r1.obtainStyledAttributes(r3);
        r3 = android.support.v7.appcompat.R.styleable.Theme_windowActionBar;	 Catch:{ IllegalStateException -> 0x0024 }
        r3 = r1.hasValue(r3);	 Catch:{ IllegalStateException -> 0x0024 }
        if (r3 != 0) goto L_0x0026;
    L_0x0015:
        r1.recycle();	 Catch:{ IllegalStateException -> 0x0024 }
        r1 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x0024 }
        r2 = z;	 Catch:{ IllegalStateException -> 0x0024 }
        r3 = 9;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0024 }
        r1.<init>(r2);	 Catch:{ IllegalStateException -> 0x0024 }
        throw r1;	 Catch:{ IllegalStateException -> 0x0024 }
    L_0x0024:
        r1 = move-exception;
        throw r1;
    L_0x0026:
        r3 = android.support.v7.appcompat.R.styleable.Theme_windowNoTitle;	 Catch:{ IllegalStateException -> 0x00f2 }
        r5 = 0;
        r3 = r1.getBoolean(r3, r5);	 Catch:{ IllegalStateException -> 0x00f2 }
        if (r3 == 0) goto L_0x0035;
    L_0x002f:
        r3 = 1;
        r8.requestWindowFeature(r3);	 Catch:{ IllegalStateException -> 0x00f4 }
        if (r4 == 0) goto L_0x0043;
    L_0x0035:
        r3 = android.support.v7.appcompat.R.styleable.Theme_windowActionBar;	 Catch:{ IllegalStateException -> 0x00f6 }
        r5 = 0;
        r3 = r1.getBoolean(r3, r5);	 Catch:{ IllegalStateException -> 0x00f6 }
        if (r3 == 0) goto L_0x0043;
    L_0x003e:
        r3 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        r8.requestWindowFeature(r3);	 Catch:{ IllegalStateException -> 0x00f6 }
    L_0x0043:
        r3 = android.support.v7.appcompat.R.styleable.Theme_windowActionBarOverlay;	 Catch:{ IllegalStateException -> 0x00f8 }
        r5 = 0;
        r3 = r1.getBoolean(r3, r5);	 Catch:{ IllegalStateException -> 0x00f8 }
        if (r3 == 0) goto L_0x0051;
    L_0x004c:
        r3 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        r8.requestWindowFeature(r3);	 Catch:{ IllegalStateException -> 0x00f8 }
    L_0x0051:
        r3 = android.support.v7.appcompat.R.styleable.Theme_windowActionModeOverlay;	 Catch:{ IllegalStateException -> 0x00fa }
        r5 = 0;
        r3 = r1.getBoolean(r3, r5);	 Catch:{ IllegalStateException -> 0x00fa }
        if (r3 == 0) goto L_0x005f;
    L_0x005a:
        r3 = 10;
        r8.requestWindowFeature(r3);	 Catch:{ IllegalStateException -> 0x00fa }
    L_0x005f:
        r3 = android.support.v7.appcompat.R.styleable.Theme_android_windowIsFloating;
        r3 = r1.getBoolean(r3, r6);
        r8.mIsFloating = r3;
        r1.recycle();
        r1 = r8.mContext;
        r1 = android.view.LayoutInflater.from(r1);
        r3 = r8.mWindowNoTitle;	 Catch:{ IllegalStateException -> 0x00fc }
        if (r3 != 0) goto L_0x016a;
    L_0x0074:
        r3 = r8.mIsFloating;	 Catch:{ IllegalStateException -> 0x00fc }
        if (r3 == 0) goto L_0x00fe;
    L_0x0078:
        r3 = android.support.v7.appcompat.R.layout.abc_dialog_title_material;
        r1 = r1.inflate(r3, r2);
        r1 = (android.view.ViewGroup) r1;
        r8.mOverlayActionBar = r6;
        r8.mHasActionBar = r6;
        r3 = r1;
    L_0x0085:
        if (r3 != 0) goto L_0x01a4;
    L_0x0087:
        r1 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalStateException -> 0x00f0 }
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x00f0 }
        r2.<init>();	 Catch:{ IllegalStateException -> 0x00f0 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x00f0 }
        r4 = 8;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x00f0 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x00f0 }
        r3 = r8.mHasActionBar;	 Catch:{ IllegalStateException -> 0x00f0 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x00f0 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x00f0 }
        r4 = 10;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x00f0 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x00f0 }
        r3 = r8.mOverlayActionBar;	 Catch:{ IllegalStateException -> 0x00f0 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x00f0 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x00f0 }
        r4 = 13;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x00f0 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x00f0 }
        r3 = r8.mIsFloating;	 Catch:{ IllegalStateException -> 0x00f0 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x00f0 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x00f0 }
        r4 = 12;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x00f0 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x00f0 }
        r3 = r8.mOverlayActionMode;	 Catch:{ IllegalStateException -> 0x00f0 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x00f0 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x00f0 }
        r4 = 11;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x00f0 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x00f0 }
        r3 = r8.mWindowNoTitle;	 Catch:{ IllegalStateException -> 0x00f0 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x00f0 }
        r3 = z;	 Catch:{ IllegalStateException -> 0x00f0 }
        r4 = 14;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x00f0 }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x00f0 }
        r2 = r2.toString();	 Catch:{ IllegalStateException -> 0x00f0 }
        r1.<init>(r2);	 Catch:{ IllegalStateException -> 0x00f0 }
        throw r1;	 Catch:{ IllegalStateException -> 0x00f0 }
    L_0x00f0:
        r1 = move-exception;
        throw r1;
    L_0x00f2:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalStateException -> 0x00f4 }
    L_0x00f4:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalStateException -> 0x00f6 }
    L_0x00f6:
        r1 = move-exception;
        throw r1;
    L_0x00f8:
        r1 = move-exception;
        throw r1;
    L_0x00fa:
        r1 = move-exception;
        throw r1;
    L_0x00fc:
        r1 = move-exception;
        throw r1;
    L_0x00fe:
        r1 = r8.mHasActionBar;
        if (r1 == 0) goto L_0x0203;
    L_0x0102:
        r3 = new android.util.TypedValue;
        r3.<init>();
        r1 = r8.mContext;
        r1 = r1.getTheme();
        r5 = android.support.v7.appcompat.R.attr.actionBarTheme;
        r1.resolveAttribute(r5, r3, r7);
        r1 = r3.resourceId;
        if (r1 == 0) goto L_0x0121;
    L_0x0116:
        r1 = new android.support.v7.view.ContextThemeWrapper;
        r5 = r8.mContext;
        r3 = r3.resourceId;
        r1.<init>(r5, r3);
        if (r4 == 0) goto L_0x0123;
    L_0x0121:
        r1 = r8.mContext;
    L_0x0123:
        r1 = android.view.LayoutInflater.from(r1);
        r3 = android.support.v7.appcompat.R.layout.abc_screen_toolbar;
        r1 = r1.inflate(r3, r2);
        r1 = (android.view.ViewGroup) r1;
        r2 = android.support.v7.appcompat.R.id.decor_content_parent;	 Catch:{ IllegalStateException -> 0x0164 }
        r2 = r1.findViewById(r2);	 Catch:{ IllegalStateException -> 0x0164 }
        r2 = (android.support.v7.widget.DecorContentParent) r2;	 Catch:{ IllegalStateException -> 0x0164 }
        r8.mDecorContentParent = r2;	 Catch:{ IllegalStateException -> 0x0164 }
        r2 = r8.mDecorContentParent;	 Catch:{ IllegalStateException -> 0x0164 }
        r3 = r8.getWindowCallback();	 Catch:{ IllegalStateException -> 0x0164 }
        r2.setWindowCallback(r3);	 Catch:{ IllegalStateException -> 0x0164 }
        r2 = r8.mOverlayActionBar;	 Catch:{ IllegalStateException -> 0x0164 }
        if (r2 == 0) goto L_0x014d;
    L_0x0146:
        r2 = r8.mDecorContentParent;	 Catch:{ IllegalStateException -> 0x0164 }
        r3 = 109; // 0x6d float:1.53E-43 double:5.4E-322;
        r2.initFeature(r3);	 Catch:{ IllegalStateException -> 0x0164 }
    L_0x014d:
        r2 = r8.mFeatureProgress;	 Catch:{ IllegalStateException -> 0x0166 }
        if (r2 == 0) goto L_0x0157;
    L_0x0151:
        r2 = r8.mDecorContentParent;	 Catch:{ IllegalStateException -> 0x0166 }
        r3 = 2;
        r2.initFeature(r3);	 Catch:{ IllegalStateException -> 0x0166 }
    L_0x0157:
        r2 = r8.mFeatureIndeterminateProgress;	 Catch:{ IllegalStateException -> 0x0168 }
        if (r2 == 0) goto L_0x0161;
    L_0x015b:
        r2 = r8.mDecorContentParent;	 Catch:{ IllegalStateException -> 0x0168 }
        r3 = 5;
        r2.initFeature(r3);	 Catch:{ IllegalStateException -> 0x0168 }
    L_0x0161:
        r3 = r1;
        goto L_0x0085;
    L_0x0164:
        r1 = move-exception;
        throw r1;
    L_0x0166:
        r1 = move-exception;
        throw r1;
    L_0x0168:
        r1 = move-exception;
        throw r1;
    L_0x016a:
        r3 = r8.mOverlayActionMode;
        if (r3 == 0) goto L_0x0196;
    L_0x016e:
        r3 = android.support.v7.appcompat.R.layout.abc_screen_simple_overlay_action_mode;
        r1 = r1.inflate(r3, r2);
        r1 = (android.view.ViewGroup) r1;
        r2 = r1;
    L_0x0177:
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalStateException -> 0x01a0 }
        r3 = 21;
        if (r1 < r3) goto L_0x0187;
    L_0x017d:
        r1 = new android.support.v7.app.AppCompatDelegateImplV7$2;	 Catch:{ IllegalStateException -> 0x01a2 }
        r1.<init>(r8);	 Catch:{ IllegalStateException -> 0x01a2 }
        android.support.v4.view.ViewCompat.setOnApplyWindowInsetsListener(r2, r1);	 Catch:{ IllegalStateException -> 0x01a2 }
        if (r4 == 0) goto L_0x0200;
    L_0x0187:
        r0 = r2;
        r0 = (android.support.v7.widget.FitWindowsViewGroup) r0;	 Catch:{ IllegalStateException -> 0x01a2 }
        r1 = r0;
        r3 = new android.support.v7.app.AppCompatDelegateImplV7$3;	 Catch:{ IllegalStateException -> 0x01a2 }
        r3.<init>(r8);	 Catch:{ IllegalStateException -> 0x01a2 }
        r1.setOnFitSystemWindowsListener(r3);	 Catch:{ IllegalStateException -> 0x01a2 }
        r3 = r2;
        goto L_0x0085;
    L_0x0196:
        r3 = android.support.v7.appcompat.R.layout.abc_screen_simple;
        r1 = r1.inflate(r3, r2);
        r1 = (android.view.ViewGroup) r1;
        r2 = r1;
        goto L_0x0177;
    L_0x01a0:
        r1 = move-exception;
        throw r1;	 Catch:{ IllegalStateException -> 0x01a2 }
    L_0x01a2:
        r1 = move-exception;
        throw r1;
    L_0x01a4:
        r1 = r8.mDecorContentParent;	 Catch:{ IllegalStateException -> 0x01fc }
        if (r1 != 0) goto L_0x01b2;
    L_0x01a8:
        r1 = android.support.v7.appcompat.R.id.title;	 Catch:{ IllegalStateException -> 0x01fc }
        r1 = r3.findViewById(r1);	 Catch:{ IllegalStateException -> 0x01fc }
        r1 = (android.widget.TextView) r1;	 Catch:{ IllegalStateException -> 0x01fc }
        r8.mTitleView = r1;	 Catch:{ IllegalStateException -> 0x01fc }
    L_0x01b2:
        android.support.v7.widget.ViewUtils.makeOptionalFitsSystemWindows(r3);
        r1 = r8.mWindow;
        r2 = 16908290; // 0x1020002 float:2.3877235E-38 double:8.353805E-317;
        r1 = r1.findViewById(r2);
        r1 = (android.view.ViewGroup) r1;
        r2 = android.support.v7.appcompat.R.id.action_bar_activity_content;
        r2 = r3.findViewById(r2);
        r2 = (android.support.v7.widget.ContentFrameLayout) r2;
    L_0x01c8:
        r5 = r1.getChildCount();
        if (r5 <= 0) goto L_0x01da;
    L_0x01ce:
        r5 = r1.getChildAt(r6);
        r1.removeViewAt(r6);
        r2.addView(r5);
        if (r4 == 0) goto L_0x01c8;
    L_0x01da:
        r4 = r8.mWindow;	 Catch:{ IllegalStateException -> 0x01fe }
        r4.setContentView(r3);	 Catch:{ IllegalStateException -> 0x01fe }
        r4 = -1;
        r1.setId(r4);	 Catch:{ IllegalStateException -> 0x01fe }
        r4 = 16908290; // 0x1020002 float:2.3877235E-38 double:8.353805E-317;
        r2.setId(r4);	 Catch:{ IllegalStateException -> 0x01fe }
        r4 = r1 instanceof android.widget.FrameLayout;	 Catch:{ IllegalStateException -> 0x01fe }
        if (r4 == 0) goto L_0x01f3;
    L_0x01ed:
        r1 = (android.widget.FrameLayout) r1;	 Catch:{ IllegalStateException -> 0x01fe }
        r4 = 0;
        r1.setForeground(r4);	 Catch:{ IllegalStateException -> 0x01fe }
    L_0x01f3:
        r1 = new android.support.v7.app.AppCompatDelegateImplV7$4;
        r1.<init>(r8);
        r2.setAttachListener(r1);
        return r3;
    L_0x01fc:
        r1 = move-exception;
        throw r1;
    L_0x01fe:
        r1 = move-exception;
        throw r1;
    L_0x0200:
        r3 = r2;
        goto L_0x0085;
    L_0x0203:
        r3 = r2;
        goto L_0x0085;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AppCompatDelegateImplV7.createSubDecor():android.view.ViewGroup");
    }

    static void access$400(AppCompatDelegateImplV7 appCompatDelegateImplV7) {
        appCompatDelegateImplV7.dismissPopups();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.support.v7.app.AppCompatDelegateImplV7.PanelFeatureState getPanelState(int r6, boolean r7) {
        /*
        r5 = this;
        r0 = r5.mPanels;
        if (r0 == 0) goto L_0x0007;
    L_0x0004:
        r1 = r0.length;	 Catch:{ IllegalStateException -> 0x0023 }
        if (r1 > r6) goto L_0x0016;
    L_0x0007:
        r1 = r6 + 1;
        r1 = new android.support.v7.app.AppCompatDelegateImplV7.PanelFeatureState[r1];
        if (r0 == 0) goto L_0x0013;
    L_0x000d:
        r2 = 0;
        r3 = 0;
        r4 = r0.length;	 Catch:{ IllegalStateException -> 0x0025 }
        java.lang.System.arraycopy(r0, r2, r1, r3, r4);	 Catch:{ IllegalStateException -> 0x0025 }
    L_0x0013:
        r5.mPanels = r1;
        r0 = r1;
    L_0x0016:
        r1 = r0[r6];
        if (r1 != 0) goto L_0x0027;
    L_0x001a:
        r1 = new android.support.v7.app.AppCompatDelegateImplV7$PanelFeatureState;
        r1.<init>(r6);
        r0[r6] = r1;
        r0 = r1;
    L_0x0022:
        return r0;
    L_0x0023:
        r0 = move-exception;
        throw r0;
    L_0x0025:
        r0 = move-exception;
        throw r0;
    L_0x0027:
        r0 = r1;
        goto L_0x0022;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AppCompatDelegateImplV7.getPanelState(int, boolean):android.support.v7.app.AppCompatDelegateImplV7$PanelFeatureState");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initWindowDecorActionBar() {
        /*
        r3 = this;
        r3.ensureSubDecor();	 Catch:{ IllegalStateException -> 0x000c }
        r0 = r3.mHasActionBar;	 Catch:{ IllegalStateException -> 0x000c }
        if (r0 == 0) goto L_0x000b;
    L_0x0007:
        r0 = r3.mActionBar;	 Catch:{ IllegalStateException -> 0x000e }
        if (r0 == 0) goto L_0x0010;
    L_0x000b:
        return;
    L_0x000c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x000e }
    L_0x000e:
        r0 = move-exception;
        throw r0;
    L_0x0010:
        r0 = r3.mOriginalWindowCallback;	 Catch:{ IllegalStateException -> 0x0046 }
        r0 = r0 instanceof android.app.Activity;	 Catch:{ IllegalStateException -> 0x0046 }
        if (r0 == 0) goto L_0x0027;
    L_0x0016:
        r1 = new android.support.v7.app.WindowDecorActionBar;	 Catch:{ IllegalStateException -> 0x0048 }
        r0 = r3.mOriginalWindowCallback;	 Catch:{ IllegalStateException -> 0x0048 }
        r0 = (android.app.Activity) r0;	 Catch:{ IllegalStateException -> 0x0048 }
        r2 = r3.mOverlayActionBar;	 Catch:{ IllegalStateException -> 0x0048 }
        r1.<init>(r0, r2);	 Catch:{ IllegalStateException -> 0x0048 }
        r3.mActionBar = r1;	 Catch:{ IllegalStateException -> 0x0048 }
        r0 = android.support.v7.app.ActionBar.a;	 Catch:{ IllegalStateException -> 0x0048 }
        if (r0 == 0) goto L_0x0038;
    L_0x0027:
        r0 = r3.mOriginalWindowCallback;	 Catch:{ IllegalStateException -> 0x004a }
        r0 = r0 instanceof android.app.Dialog;	 Catch:{ IllegalStateException -> 0x004a }
        if (r0 == 0) goto L_0x0038;
    L_0x002d:
        r1 = new android.support.v7.app.WindowDecorActionBar;	 Catch:{ IllegalStateException -> 0x004a }
        r0 = r3.mOriginalWindowCallback;	 Catch:{ IllegalStateException -> 0x004a }
        r0 = (android.app.Dialog) r0;	 Catch:{ IllegalStateException -> 0x004a }
        r1.<init>(r0);	 Catch:{ IllegalStateException -> 0x004a }
        r3.mActionBar = r1;	 Catch:{ IllegalStateException -> 0x004a }
    L_0x0038:
        r0 = r3.mActionBar;	 Catch:{ IllegalStateException -> 0x0044 }
        if (r0 == 0) goto L_0x000b;
    L_0x003c:
        r0 = r3.mActionBar;	 Catch:{ IllegalStateException -> 0x0044 }
        r1 = r3.mEnableDefaultActionBarUp;	 Catch:{ IllegalStateException -> 0x0044 }
        r0.setDefaultDisplayHomeAsUpEnabled(r1);	 Catch:{ IllegalStateException -> 0x0044 }
        goto L_0x000b;
    L_0x0044:
        r0 = move-exception;
        throw r0;
    L_0x0046:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0048 }
    L_0x0048:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x004a }
    L_0x004a:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AppCompatDelegateImplV7.initWindowDecorActionBar():void");
    }

    boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z = true;
        switch (i) {
            case at.p /*4*/:
                try {
                    if ((keyEvent.getFlags() & 128) == 0) {
                        z = false;
                    }
                    this.mLongPressBackDown = z;
                    break;
                } catch (IllegalStateException e) {
                    throw e;
                }
            case arj.Theme_colorPrimary /*82*/:
                try {
                    onKeyDownPanel(0, keyEvent);
                    return true;
                } catch (IllegalStateException e2) {
                    throw e2;
                }
        }
        try {
            if (VERSION.SDK_INT < 11) {
                onKeyShortcut(i, keyEvent);
            }
            return false;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    private boolean initializePanelContent(PanelFeatureState panelFeatureState) {
        try {
            if (panelFeatureState.createdPanelView != null) {
                panelFeatureState.shownPanelView = panelFeatureState.createdPanelView;
                return true;
            }
            try {
                if (panelFeatureState.menu == null) {
                    return false;
                }
                try {
                    if (this.mPanelMenuPresenterCallback == null) {
                        this.mPanelMenuPresenterCallback = new PanelMenuPresenterCallback(this, null);
                    }
                    try {
                        boolean z;
                        panelFeatureState.shownPanelView = (View) panelFeatureState.getListMenuView(this.mPanelMenuPresenterCallback);
                        if (panelFeatureState.shownPanelView != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        return z;
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            } catch (IllegalStateException e22) {
                throw e22;
            }
        } catch (IllegalStateException e222) {
            throw e222;
        }
    }

    static void access$1000(AppCompatDelegateImplV7 appCompatDelegateImplV7, PanelFeatureState panelFeatureState, boolean z) {
        appCompatDelegateImplV7.closePanel(panelFeatureState, z);
    }

    private boolean shouldInheritContext(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        ViewParent viewParent2 = viewParent;
        while (viewParent2 != null) {
            try {
                if (viewParent2 != this.mWindowDecor) {
                    if (viewParent2 instanceof View) {
                        try {
                            if (!ViewCompat.isAttachedToWindow((View) viewParent2)) {
                                viewParent2 = viewParent2.getParent();
                            }
                        } catch (IllegalStateException e) {
                            throw e;
                        }
                    }
                }
                return false;
            } catch (IllegalStateException e2) {
                throw e2;
            } catch (IllegalStateException e22) {
                throw e22;
            }
        }
        return true;
    }

    public void setContentView(int i) {
        ensureSubDecor();
        ViewGroup viewGroup = (ViewGroup) this.mSubDecor.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.mContext).inflate(i, viewGroup);
        this.mOriginalWindowCallback.onContentChanged();
    }

    static int access$000(AppCompatDelegateImplV7 appCompatDelegateImplV7) {
        return appCompatDelegateImplV7.mInvalidatePanelMenuFeatures;
    }

    public void onStop() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            try {
                supportActionBar.setShowHideAnimationEnabled(false);
            } catch (IllegalStateException e) {
                throw e;
            }
        }
    }

    View callActivityOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (this.mOriginalWindowCallback instanceof Factory) {
            View onCreateView = ((Factory) this.mOriginalWindowCallback).onCreateView(str, context, attributeSet);
            if (onCreateView != null) {
                return onCreateView;
            }
        }
        return null;
    }

    static int access$002(AppCompatDelegateImplV7 appCompatDelegateImplV7, int i) {
        appCompatDelegateImplV7.mInvalidatePanelMenuFeatures = i;
        return i;
    }

    static boolean access$202(AppCompatDelegateImplV7 appCompatDelegateImplV7, boolean z) {
        appCompatDelegateImplV7.mInvalidatePanelMenuPosted = z;
        return z;
    }

    public void onCreate(Bundle bundle) {
        try {
            this.mWindowDecor = (ViewGroup) this.mWindow.getDecorView();
            if ((this.mOriginalWindowCallback instanceof Activity) && NavUtils.getParentActivityName((Activity) this.mOriginalWindowCallback) != null) {
                ActionBar peekSupportActionBar = peekSupportActionBar();
                if (peekSupportActionBar == null) {
                    try {
                        this.mEnableDefaultActionBarUp = true;
                        if (!ActionBar.a) {
                            return;
                        }
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
                peekSupportActionBar.setDefaultDisplayHomeAsUpEnabled(true);
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public void onPostCreate(Bundle bundle) {
        ensureSubDecor();
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View callActivityOnCreateView = callActivityOnCreateView(view, str, context, attributeSet);
        return callActivityOnCreateView != null ? callActivityOnCreateView : createView(view, str, context, attributeSet);
    }

    boolean onKeyShortcut(int i, KeyEvent keyEvent) {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            try {
                if (supportActionBar.onKeyShortcut(i, keyEvent)) {
                    return true;
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        if (this.mPreparedPanel == null || !performPanelShortcut(this.mPreparedPanel, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.mPreparedPanel == null) {
                PanelFeatureState panelState = getPanelState(0, true);
                preparePanel(panelState, keyEvent);
                boolean performPanelShortcut = performPanelShortcut(panelState, keyEvent.getKeyCode(), keyEvent, 1);
                try {
                    panelState.isPrepared = false;
                    if (performPanelShortcut) {
                        return true;
                    }
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            }
            return false;
        }
        try {
            if (this.mPreparedPanel == null) {
                return true;
            }
            this.mPreparedPanel.isHandled = true;
            return true;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
        Window.Callback windowCallback = getWindowCallback();
        if (windowCallback != null) {
            try {
                if (!isDestroyed()) {
                    PanelFeatureState findMenuPanel = findMenuPanel(menuBuilder.getRootMenu());
                    if (findMenuPanel != null) {
                        try {
                            return windowCallback.onMenuItemSelected(findMenuPanel.featureId, menuItem);
                        } catch (IllegalStateException e) {
                            throw e;
                        }
                    }
                }
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean performPanelShortcut(android.support.v7.app.AppCompatDelegateImplV7.PanelFeatureState r3, int r4, android.view.KeyEvent r5, int r6) {
        /*
        r2 = this;
        r0 = 0;
        r1 = r5.isSystem();	 Catch:{ IllegalStateException -> 0x0008 }
        if (r1 == 0) goto L_0x000a;
    L_0x0007:
        return r0;
    L_0x0008:
        r0 = move-exception;
        throw r0;
    L_0x000a:
        r1 = r3.isPrepared;	 Catch:{ IllegalStateException -> 0x002f }
        if (r1 != 0) goto L_0x0014;
    L_0x000e:
        r1 = r2.preparePanel(r3, r5);	 Catch:{ IllegalStateException -> 0x0031 }
        if (r1 == 0) goto L_0x001e;
    L_0x0014:
        r1 = r3.menu;	 Catch:{ IllegalStateException -> 0x0031 }
        if (r1 == 0) goto L_0x001e;
    L_0x0018:
        r0 = r3.menu;
        r0 = r0.performShortcut(r4, r5, r6);
    L_0x001e:
        if (r0 == 0) goto L_0x0007;
    L_0x0020:
        r1 = r6 & 1;
        if (r1 != 0) goto L_0x0007;
    L_0x0024:
        r1 = r2.mDecorContentParent;	 Catch:{ IllegalStateException -> 0x002d }
        if (r1 != 0) goto L_0x0007;
    L_0x0028:
        r1 = 1;
        r2.closePanel(r3, r1);	 Catch:{ IllegalStateException -> 0x002d }
        goto L_0x0007;
    L_0x002d:
        r0 = move-exception;
        throw r0;
    L_0x002f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0031 }
    L_0x0031:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AppCompatDelegateImplV7.performPanelShortcut(android.support.v7.app.AppCompatDelegateImplV7$PanelFeatureState, int, android.view.KeyEvent, int):boolean");
    }

    private void throwFeatureRequestIfSubDecorInstalled() {
        try {
            if (this.mSubDecorInstalled) {
                throw new AndroidRuntimeException(z[7]);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = true;
        try {
            if (keyEvent.getKeyCode() == 82) {
                if (this.mOriginalWindowCallback.dispatchKeyEvent(keyEvent)) {
                    return true;
                }
            }
            int keyCode = keyEvent.getKeyCode();
            if (keyEvent.getAction() != 0) {
                z = false;
            }
            if (!z) {
                return onKeyUp(keyCode, keyEvent);
            }
            try {
                return onKeyDown(keyCode, keyEvent);
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    android.support.v7.view.ActionMode startSupportActionModeFromWindow(android.support.v7.view.ActionMode.Callback r10) {
        /*
        r9 = this;
        r2 = 0;
        r3 = 0;
        r1 = 1;
        r4 = android.support.v7.app.ActionBar.a;
        r9.endOnGoingFadeAnimation();	 Catch:{ AbstractMethodError -> 0x014f }
        r0 = r9.mActionMode;	 Catch:{ AbstractMethodError -> 0x014f }
        if (r0 == 0) goto L_0x0011;
    L_0x000c:
        r0 = r9.mActionMode;	 Catch:{ AbstractMethodError -> 0x014f }
        r0.finish();	 Catch:{ AbstractMethodError -> 0x014f }
    L_0x0011:
        r5 = new android.support.v7.app.AppCompatDelegateImplV7$ActionModeCallbackWrapperV7;
        r5.<init>(r9, r10);
        r0 = r9.mAppCompatCallback;	 Catch:{ AbstractMethodError -> 0x0151 }
        if (r0 == 0) goto L_0x016d;
    L_0x001a:
        r0 = r9.isDestroyed();	 Catch:{ AbstractMethodError -> 0x0151 }
        if (r0 != 0) goto L_0x016d;
    L_0x0020:
        r0 = r9.mAppCompatCallback;	 Catch:{ AbstractMethodError -> 0x0153 }
        r0 = r0.onWindowStartingSupportActionMode(r5);	 Catch:{ AbstractMethodError -> 0x0153 }
    L_0x0026:
        if (r0 == 0) goto L_0x002c;
    L_0x0028:
        r9.mActionMode = r0;	 Catch:{ AbstractMethodError -> 0x0157 }
        if (r4 == 0) goto L_0x013d;
    L_0x002c:
        r0 = r9.mActionModeView;	 Catch:{ AbstractMethodError -> 0x0159 }
        if (r0 != 0) goto L_0x00d9;
    L_0x0030:
        r0 = r9.mIsFloating;	 Catch:{ AbstractMethodError -> 0x0159 }
        if (r0 == 0) goto L_0x00ba;
    L_0x0034:
        r6 = new android.util.TypedValue;
        r6.<init>();
        r0 = r9.mContext;
        r0 = r0.getTheme();
        r7 = android.support.v7.appcompat.R.attr.actionBarTheme;
        r0.resolveAttribute(r7, r6, r1);
        r7 = r6.resourceId;
        if (r7 == 0) goto L_0x006a;
    L_0x0048:
        r7 = r9.mContext;
        r7 = r7.getResources();
        r7 = r7.newTheme();
        r7.setTo(r0);
        r0 = r6.resourceId;
        r7.applyStyle(r0, r1);
        r0 = new android.support.v7.view.ContextThemeWrapper;
        r8 = r9.mContext;
        r0.<init>(r8, r2);
        r8 = r0.getTheme();
        r8.setTo(r7);
        if (r4 == 0) goto L_0x006c;
    L_0x006a:
        r0 = r9.mContext;
    L_0x006c:
        r7 = new android.support.v7.widget.ActionBarContextView;
        r7.<init>(r0);
        r9.mActionModeView = r7;
        r7 = new android.widget.PopupWindow;
        r8 = android.support.v7.appcompat.R.attr.actionModePopupWindowStyle;
        r7.<init>(r0, r3, r8);
        r9.mActionModePopup = r7;
        r3 = r9.mActionModePopup;
        r7 = 2;
        android.support.v4.widget.PopupWindowCompat.setWindowLayoutType(r3, r7);
        r3 = r9.mActionModePopup;
        r7 = r9.mActionModeView;
        r3.setContentView(r7);
        r3 = r9.mActionModePopup;
        r7 = -1;
        r3.setWidth(r7);
        r3 = r0.getTheme();
        r7 = android.support.v7.appcompat.R.attr.actionBarSize;
        r3.resolveAttribute(r7, r6, r1);
        r3 = r6.data;
        r0 = r0.getResources();
        r0 = r0.getDisplayMetrics();
        r0 = android.util.TypedValue.complexToDimensionPixelSize(r3, r0);
        r3 = r9.mActionModeView;
        r3.setContentHeight(r0);
        r0 = r9.mActionModePopup;
        r3 = -2;
        r0.setHeight(r3);
        r0 = new android.support.v7.app.AppCompatDelegateImplV7$5;
        r0.<init>(r9);
        r9.mShowActionModePopup = r0;
        if (r4 == 0) goto L_0x00d9;
    L_0x00ba:
        r0 = r9.mSubDecor;
        r3 = android.support.v7.appcompat.R.id.action_mode_bar_stub;
        r0 = r0.findViewById(r3);
        r0 = (android.support.v7.widget.ViewStubCompat) r0;
        if (r0 == 0) goto L_0x00d9;
    L_0x00c6:
        r3 = r9.getActionBarThemedContext();	 Catch:{ AbstractMethodError -> 0x015b }
        r3 = android.view.LayoutInflater.from(r3);	 Catch:{ AbstractMethodError -> 0x015b }
        r0.setLayoutInflater(r3);	 Catch:{ AbstractMethodError -> 0x015b }
        r0 = r0.inflate();	 Catch:{ AbstractMethodError -> 0x015b }
        r0 = (android.support.v7.widget.ActionBarContextView) r0;	 Catch:{ AbstractMethodError -> 0x015b }
        r9.mActionModeView = r0;	 Catch:{ AbstractMethodError -> 0x015b }
    L_0x00d9:
        r0 = r9.mActionModeView;	 Catch:{ AbstractMethodError -> 0x015d }
        if (r0 == 0) goto L_0x013d;
    L_0x00dd:
        r9.endOnGoingFadeAnimation();	 Catch:{ AbstractMethodError -> 0x015f }
        r0 = r9.mActionModeView;	 Catch:{ AbstractMethodError -> 0x015f }
        r0.killMode();	 Catch:{ AbstractMethodError -> 0x015f }
        r3 = new android.support.v7.view.StandaloneActionMode;	 Catch:{ AbstractMethodError -> 0x015f }
        r0 = r9.mActionModeView;	 Catch:{ AbstractMethodError -> 0x015f }
        r6 = r0.getContext();	 Catch:{ AbstractMethodError -> 0x015f }
        r7 = r9.mActionModeView;	 Catch:{ AbstractMethodError -> 0x015f }
        r0 = r9.mActionModePopup;	 Catch:{ AbstractMethodError -> 0x015f }
        if (r0 != 0) goto L_0x0161;
    L_0x00f3:
        r0 = r1;
    L_0x00f4:
        r3.<init>(r6, r7, r5, r0);
        r0 = r3.getMenu();	 Catch:{ AbstractMethodError -> 0x0163 }
        r0 = r10.onCreateActionMode(r3, r0);	 Catch:{ AbstractMethodError -> 0x0163 }
        if (r0 == 0) goto L_0x013a;
    L_0x0101:
        r3.invalidate();	 Catch:{ AbstractMethodError -> 0x0165 }
        r0 = r9.mActionModeView;	 Catch:{ AbstractMethodError -> 0x0165 }
        r0.initForMode(r3);	 Catch:{ AbstractMethodError -> 0x0165 }
        r9.mActionMode = r3;	 Catch:{ AbstractMethodError -> 0x0165 }
        r0 = r9.mActionModeView;	 Catch:{ AbstractMethodError -> 0x0165 }
        r1 = 0;
        android.support.v4.view.ViewCompat.setAlpha(r0, r1);	 Catch:{ AbstractMethodError -> 0x0165 }
        r0 = r9.mActionModeView;	 Catch:{ AbstractMethodError -> 0x0165 }
        r0 = android.support.v4.view.ViewCompat.animate(r0);	 Catch:{ AbstractMethodError -> 0x0165 }
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = r0.alpha(r1);	 Catch:{ AbstractMethodError -> 0x0165 }
        r9.mFadeAnim = r0;	 Catch:{ AbstractMethodError -> 0x0165 }
        r0 = r9.mFadeAnim;	 Catch:{ AbstractMethodError -> 0x0165 }
        r1 = new android.support.v7.app.AppCompatDelegateImplV7$6;	 Catch:{ AbstractMethodError -> 0x0165 }
        r1.<init>(r9);	 Catch:{ AbstractMethodError -> 0x0165 }
        r0.setListener(r1);	 Catch:{ AbstractMethodError -> 0x0165 }
        r0 = r9.mActionModePopup;	 Catch:{ AbstractMethodError -> 0x0165 }
        if (r0 == 0) goto L_0x013d;
    L_0x012d:
        r0 = r9.mWindow;	 Catch:{ AbstractMethodError -> 0x0167 }
        r0 = r0.getDecorView();	 Catch:{ AbstractMethodError -> 0x0167 }
        r1 = r9.mShowActionModePopup;	 Catch:{ AbstractMethodError -> 0x0167 }
        r0.post(r1);	 Catch:{ AbstractMethodError -> 0x0167 }
        if (r4 == 0) goto L_0x013d;
    L_0x013a:
        r0 = 0;
        r9.mActionMode = r0;	 Catch:{ AbstractMethodError -> 0x0167 }
    L_0x013d:
        r0 = r9.mActionMode;	 Catch:{ AbstractMethodError -> 0x0169 }
        if (r0 == 0) goto L_0x014c;
    L_0x0141:
        r0 = r9.mAppCompatCallback;	 Catch:{ AbstractMethodError -> 0x016b }
        if (r0 == 0) goto L_0x014c;
    L_0x0145:
        r0 = r9.mAppCompatCallback;	 Catch:{ AbstractMethodError -> 0x016b }
        r1 = r9.mActionMode;	 Catch:{ AbstractMethodError -> 0x016b }
        r0.onSupportActionModeStarted(r1);	 Catch:{ AbstractMethodError -> 0x016b }
    L_0x014c:
        r0 = r9.mActionMode;
        return r0;
    L_0x014f:
        r0 = move-exception;
        throw r0;
    L_0x0151:
        r0 = move-exception;
        throw r0;
    L_0x0153:
        r0 = move-exception;
        r0 = r3;
        goto L_0x0026;
    L_0x0157:
        r0 = move-exception;
        throw r0;	 Catch:{ AbstractMethodError -> 0x0159 }
    L_0x0159:
        r0 = move-exception;
        throw r0;
    L_0x015b:
        r0 = move-exception;
        throw r0;
    L_0x015d:
        r0 = move-exception;
        throw r0;	 Catch:{ AbstractMethodError -> 0x015f }
    L_0x015f:
        r0 = move-exception;
        throw r0;
    L_0x0161:
        r0 = r2;
        goto L_0x00f4;
    L_0x0163:
        r0 = move-exception;
        throw r0;	 Catch:{ AbstractMethodError -> 0x0165 }
    L_0x0165:
        r0 = move-exception;
        throw r0;	 Catch:{ AbstractMethodError -> 0x0167 }
    L_0x0167:
        r0 = move-exception;
        throw r0;
    L_0x0169:
        r0 = move-exception;
        throw r0;	 Catch:{ AbstractMethodError -> 0x016b }
    L_0x016b:
        r0 = move-exception;
        throw r0;
    L_0x016d:
        r0 = r3;
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AppCompatDelegateImplV7.startSupportActionModeFromWindow(android.support.v7.view.ActionMode$Callback):android.support.v7.view.ActionMode");
    }

    static PanelFeatureState access$800(AppCompatDelegateImplV7 appCompatDelegateImplV7, Menu menu) {
        return appCompatDelegateImplV7.findMenuPanel(menu);
    }

    private boolean onKeyDownPanel(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            PanelFeatureState panelState = getPanelState(i, true);
            try {
                if (!panelState.isOpen) {
                    return preparePanel(panelState, keyEvent);
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        return false;
    }

    private void ensureSubDecor() {
        if (!this.mSubDecorInstalled) {
            this.mSubDecor = createSubDecor();
            CharSequence title = getTitle();
            try {
                if (!TextUtils.isEmpty(title)) {
                    onTitleChanged(title);
                }
                applyFixedSizeWindow();
                onSubDecorInstalled(this.mSubDecor);
                this.mSubDecorInstalled = true;
                PanelFeatureState panelState = getPanelState(0, false);
                try {
                    if (!isDestroyed()) {
                        if (panelState != null) {
                            try {
                                if (panelState.menu != null) {
                                    return;
                                }
                            } catch (IllegalStateException e) {
                                throw e;
                            }
                        }
                        invalidatePanelMenu(arj.Theme_spinnerStyle);
                    }
                } catch (IllegalStateException e2) {
                    throw e2;
                } catch (IllegalStateException e22) {
                    throw e22;
                }
            } catch (IllegalStateException e222) {
                throw e222;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int updateStatusGuard(int r11) {
        /*
        r10 = this;
        r3 = 1;
        r2 = 0;
        r5 = android.support.v7.app.ActionBar.a;
        r0 = r10.mActionModeView;	 Catch:{ IllegalStateException -> 0x00ba }
        if (r0 == 0) goto L_0x00e7;
    L_0x0008:
        r0 = r10.mActionModeView;	 Catch:{ IllegalStateException -> 0x00ba }
        r0 = r0.getLayoutParams();	 Catch:{ IllegalStateException -> 0x00ba }
        r0 = r0 instanceof android.view.ViewGroup.MarginLayoutParams;	 Catch:{ IllegalStateException -> 0x00ba }
        if (r0 == 0) goto L_0x00e7;
    L_0x0012:
        r0 = r10.mActionModeView;
        r0 = r0.getLayoutParams();
        r0 = (android.view.ViewGroup.MarginLayoutParams) r0;
        r1 = r10.mActionModeView;	 Catch:{ IllegalStateException -> 0x00bc }
        r1 = r1.isShown();	 Catch:{ IllegalStateException -> 0x00bc }
        if (r1 == 0) goto L_0x00e4;
    L_0x0022:
        r1 = r10.mTempRect1;	 Catch:{ IllegalStateException -> 0x00be }
        if (r1 != 0) goto L_0x0034;
    L_0x0026:
        r1 = new android.graphics.Rect;	 Catch:{ IllegalStateException -> 0x00be }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x00be }
        r10.mTempRect1 = r1;	 Catch:{ IllegalStateException -> 0x00be }
        r1 = new android.graphics.Rect;	 Catch:{ IllegalStateException -> 0x00be }
        r1.<init>();	 Catch:{ IllegalStateException -> 0x00be }
        r10.mTempRect2 = r1;	 Catch:{ IllegalStateException -> 0x00be }
    L_0x0034:
        r1 = r10.mTempRect1;
        r4 = r10.mTempRect2;
        r6 = 0;
        r7 = 0;
        r8 = 0;
        r1.set(r6, r11, r7, r8);	 Catch:{ IllegalStateException -> 0x00c0 }
        r6 = r10.mSubDecor;	 Catch:{ IllegalStateException -> 0x00c0 }
        android.support.v7.widget.ViewUtils.computeFitSystemWindows(r6, r1, r4);	 Catch:{ IllegalStateException -> 0x00c0 }
        r1 = r4.top;	 Catch:{ IllegalStateException -> 0x00c0 }
        if (r1 != 0) goto L_0x00c2;
    L_0x0047:
        r1 = r11;
    L_0x0048:
        r4 = r0.topMargin;
        if (r4 == r1) goto L_0x00e2;
    L_0x004c:
        r0.topMargin = r11;	 Catch:{ IllegalStateException -> 0x00c4 }
        r1 = r10.mStatusGuard;	 Catch:{ IllegalStateException -> 0x00c4 }
        if (r1 != 0) goto L_0x007c;
    L_0x0052:
        r1 = new android.view.View;	 Catch:{ IllegalStateException -> 0x00c4 }
        r4 = r10.mContext;	 Catch:{ IllegalStateException -> 0x00c4 }
        r1.<init>(r4);	 Catch:{ IllegalStateException -> 0x00c4 }
        r10.mStatusGuard = r1;	 Catch:{ IllegalStateException -> 0x00c4 }
        r1 = r10.mStatusGuard;	 Catch:{ IllegalStateException -> 0x00c4 }
        r4 = r10.mContext;	 Catch:{ IllegalStateException -> 0x00c4 }
        r4 = r4.getResources();	 Catch:{ IllegalStateException -> 0x00c4 }
        r6 = android.support.v7.appcompat.R.color.abc_input_method_navigation_guard;	 Catch:{ IllegalStateException -> 0x00c4 }
        r4 = r4.getColor(r6);	 Catch:{ IllegalStateException -> 0x00c4 }
        r1.setBackgroundColor(r4);	 Catch:{ IllegalStateException -> 0x00c4 }
        r1 = r10.mSubDecor;	 Catch:{ IllegalStateException -> 0x00c4 }
        r4 = r10.mStatusGuard;	 Catch:{ IllegalStateException -> 0x00c4 }
        r6 = -1;
        r7 = new android.view.ViewGroup$LayoutParams;	 Catch:{ IllegalStateException -> 0x00c4 }
        r8 = -1;
        r7.<init>(r8, r11);	 Catch:{ IllegalStateException -> 0x00c4 }
        r1.addView(r4, r6, r7);	 Catch:{ IllegalStateException -> 0x00c4 }
        if (r5 == 0) goto L_0x00e0;
    L_0x007c:
        r1 = r10.mStatusGuard;
        r1 = r1.getLayoutParams();
        r4 = r1.height;	 Catch:{ IllegalStateException -> 0x00c6 }
        if (r4 == r11) goto L_0x00e0;
    L_0x0086:
        r1.height = r11;	 Catch:{ IllegalStateException -> 0x00c6 }
        r4 = r10.mStatusGuard;	 Catch:{ IllegalStateException -> 0x00c6 }
        r4.setLayoutParams(r1);	 Catch:{ IllegalStateException -> 0x00c6 }
        r4 = r3;
    L_0x008e:
        r1 = r10.mStatusGuard;	 Catch:{ IllegalStateException -> 0x00c8 }
        if (r1 == 0) goto L_0x00ca;
    L_0x0092:
        r1 = r3;
    L_0x0093:
        r6 = r10.mOverlayActionMode;	 Catch:{ IllegalStateException -> 0x00cc }
        if (r6 != 0) goto L_0x009a;
    L_0x0097:
        if (r1 == 0) goto L_0x009a;
    L_0x0099:
        r11 = r2;
    L_0x009a:
        if (r5 == 0) goto L_0x00de;
    L_0x009c:
        r9 = r4;
        r4 = r1;
        r1 = r9;
    L_0x009f:
        r5 = r0.topMargin;	 Catch:{ IllegalStateException -> 0x00ce }
        if (r5 == 0) goto L_0x00db;
    L_0x00a3:
        r0.topMargin = r2;
        r1 = r4;
    L_0x00a6:
        if (r3 == 0) goto L_0x00d9;
    L_0x00a8:
        r3 = r10.mActionModeView;	 Catch:{ IllegalStateException -> 0x00d0 }
        r3.setLayoutParams(r0);	 Catch:{ IllegalStateException -> 0x00d0 }
        r0 = r1;
    L_0x00ae:
        r1 = r10.mStatusGuard;	 Catch:{ IllegalStateException -> 0x00d2 }
        if (r1 == 0) goto L_0x00b9;
    L_0x00b2:
        r1 = r10.mStatusGuard;	 Catch:{ IllegalStateException -> 0x00d4 }
        if (r0 == 0) goto L_0x00d6;
    L_0x00b6:
        r1.setVisibility(r2);
    L_0x00b9:
        return r11;
    L_0x00ba:
        r0 = move-exception;
        throw r0;
    L_0x00bc:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00be }
    L_0x00be:
        r0 = move-exception;
        throw r0;
    L_0x00c0:
        r0 = move-exception;
        throw r0;
    L_0x00c2:
        r1 = r2;
        goto L_0x0048;
    L_0x00c4:
        r0 = move-exception;
        throw r0;
    L_0x00c6:
        r0 = move-exception;
        throw r0;
    L_0x00c8:
        r0 = move-exception;
        throw r0;
    L_0x00ca:
        r1 = r2;
        goto L_0x0093;
    L_0x00cc:
        r0 = move-exception;
        throw r0;
    L_0x00ce:
        r0 = move-exception;
        throw r0;
    L_0x00d0:
        r0 = move-exception;
        throw r0;
    L_0x00d2:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00d4 }
    L_0x00d4:
        r0 = move-exception;
        throw r0;
    L_0x00d6:
        r2 = 8;
        goto L_0x00b6;
    L_0x00d9:
        r0 = r1;
        goto L_0x00ae;
    L_0x00db:
        r3 = r1;
        r1 = r4;
        goto L_0x00a6;
    L_0x00de:
        r3 = r4;
        goto L_0x00a6;
    L_0x00e0:
        r4 = r3;
        goto L_0x008e;
    L_0x00e2:
        r4 = r2;
        goto L_0x008e;
    L_0x00e4:
        r1 = r2;
        r4 = r2;
        goto L_0x009f;
    L_0x00e7:
        r0 = r2;
        goto L_0x00ae;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AppCompatDelegateImplV7.updateStatusGuard(int):int");
    }

    private void doInvalidatePanelMenu(int i) {
        PanelFeatureState panelState = getPanelState(i, true);
        if (panelState.menu != null) {
            Bundle bundle = new Bundle();
            try {
                panelState.menu.saveActionViewStates(bundle);
                if (bundle.size() > 0) {
                    panelState.frozenActionViewState = bundle;
                }
                panelState.menu.stopDispatchingItemsChanged();
                panelState.menu.clear();
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        try {
            panelState.refreshMenuContent = true;
            panelState.refreshDecorView = true;
            if (i != arj.Theme_spinnerStyle && i != 0) {
                return;
            }
            if (this.mDecorContentParent != null) {
                panelState = getPanelState(0, false);
                if (panelState != null) {
                    try {
                        panelState.isPrepared = false;
                        preparePanel(panelState, null);
                    } catch (IllegalStateException e2) {
                        throw e2;
                    }
                }
            }
        } catch (IllegalStateException e22) {
            throw e22;
        } catch (IllegalStateException e222) {
            throw e222;
        }
    }

    boolean onBackPressed() {
        try {
            if (this.mActionMode != null) {
                this.mActionMode.finish();
                return true;
            }
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                try {
                    if (supportActionBar.collapseActionView()) {
                        return true;
                    }
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
            return false;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    private void checkCloseActionMenu(MenuBuilder menuBuilder) {
        try {
            if (!this.mClosingActionMenu) {
                this.mClosingActionMenu = true;
                this.mDecorContentParent.dismissPopups();
                Window.Callback windowCallback = getWindowCallback();
                if (windowCallback != null) {
                    try {
                        if (!isDestroyed()) {
                            windowCallback.onPanelClosed(arj.Theme_spinnerStyle, menuBuilder);
                        }
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
                this.mClosingActionMenu = false;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    boolean onMenuOpened(int i, Menu menu) {
        if (i != arj.Theme_spinnerStyle) {
            return false;
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar == null) {
            return true;
        }
        try {
            supportActionBar.dispatchMenuVisibilityChanged(true);
            return true;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    static int access$300(AppCompatDelegateImplV7 appCompatDelegateImplV7, int i) {
        return appCompatDelegateImplV7.updateStatusGuard(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean initializePanelMenu(android.support.v7.app.AppCompatDelegateImplV7.PanelFeatureState r7) {
        /*
        r6 = this;
        r5 = 1;
        r1 = r6.mContext;
        r0 = r7.featureId;	 Catch:{ IllegalStateException -> 0x006b }
        if (r0 == 0) goto L_0x000d;
    L_0x0007:
        r0 = r7.featureId;	 Catch:{ IllegalStateException -> 0x006d }
        r2 = 108; // 0x6c float:1.51E-43 double:5.34E-322;
        if (r0 != r2) goto L_0x0077;
    L_0x000d:
        r0 = r6.mDecorContentParent;	 Catch:{ IllegalStateException -> 0x006d }
        if (r0 == 0) goto L_0x0077;
    L_0x0011:
        r2 = new android.util.TypedValue;
        r2.<init>();
        r3 = r1.getTheme();
        r0 = android.support.v7.appcompat.R.attr.actionBarTheme;
        r3.resolveAttribute(r0, r2, r5);
        r0 = 0;
        r4 = r2.resourceId;
        if (r4 == 0) goto L_0x006f;
    L_0x0024:
        r0 = r1.getResources();
        r0 = r0.newTheme();
        r0.setTo(r3);
        r4 = r2.resourceId;
        r0.applyStyle(r4, r5);
        r4 = android.support.v7.appcompat.R.attr.actionBarWidgetTheme;
        r0.resolveAttribute(r4, r2, r5);
    L_0x0039:
        r4 = r2.resourceId;	 Catch:{ IllegalStateException -> 0x0075 }
        if (r4 == 0) goto L_0x004f;
    L_0x003d:
        if (r0 != 0) goto L_0x004a;
    L_0x003f:
        r0 = r1.getResources();
        r0 = r0.newTheme();
        r0.setTo(r3);
    L_0x004a:
        r2 = r2.resourceId;
        r0.applyStyle(r2, r5);
    L_0x004f:
        r2 = r0;
        if (r2 == 0) goto L_0x0077;
    L_0x0052:
        r0 = new android.support.v7.view.ContextThemeWrapper;
        r3 = 0;
        r0.<init>(r1, r3);
        r1 = r0.getTheme();
        r1.setTo(r2);
    L_0x005f:
        r1 = new android.support.v7.view.menu.MenuBuilder;
        r1.<init>(r0);
        r1.setCallback(r6);
        r7.setMenu(r1);
        return r5;
    L_0x006b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x006d }
    L_0x006d:
        r0 = move-exception;
        throw r0;
    L_0x006f:
        r4 = android.support.v7.appcompat.R.attr.actionBarWidgetTheme;
        r3.resolveAttribute(r4, r2, r5);
        goto L_0x0039;
    L_0x0075:
        r0 = move-exception;
        throw r0;
    L_0x0077:
        r0 = r1;
        goto L_0x005f;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.app.AppCompatDelegateImplV7.initializePanelMenu(android.support.v7.app.AppCompatDelegateImplV7$PanelFeatureState):boolean");
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        ensureSubDecor();
        ViewGroup viewGroup = (ViewGroup) this.mSubDecor.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.mOriginalWindowCallback.onContentChanged();
    }

    static void access$1100(AppCompatDelegateImplV7 appCompatDelegateImplV7, MenuBuilder menuBuilder) {
        appCompatDelegateImplV7.checkCloseActionMenu(menuBuilder);
    }
}
