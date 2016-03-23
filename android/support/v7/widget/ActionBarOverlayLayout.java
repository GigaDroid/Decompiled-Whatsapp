package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.NestedScrollingParent;
import android.support.v4.view.NestedScrollingParentHelper;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.support.v4.widget.ScrollerCompat;
import android.support.v7.appcompat.R;
import android.support.v7.view.menu.MenuPresenter;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window.Callback;
import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

public class ActionBarOverlayLayout extends ViewGroup implements DecorContentParent, NestedScrollingParent {
    static final int[] ATTRS;
    private static final String z;
    private final int ACTION_BAR_ANIMATE_DELAY;
    private int mActionBarHeight;
    private ActionBarContainer mActionBarTop;
    private ActionBarVisibilityCallback mActionBarVisibilityCallback;
    private final Runnable mAddActionBarHideOffset;
    private boolean mAnimatingForFling;
    private final Rect mBaseContentInsets;
    private final Rect mBaseInnerInsets;
    private ContentFrameLayout mContent;
    private final Rect mContentInsets;
    private ViewPropertyAnimatorCompat mCurrentActionBarTopAnimator;
    private DecorToolbar mDecorToolbar;
    private ScrollerCompat mFlingEstimator;
    private boolean mHasNonEmbeddedTabs;
    private boolean mHideOnContentScroll;
    private int mHideOnContentScrollReference;
    private boolean mIgnoreWindowContentOverlay;
    private final Rect mInnerInsets;
    private final Rect mLastBaseContentInsets;
    private final Rect mLastInnerInsets;
    private int mLastSystemUiVisibility;
    private boolean mOverlayMode;
    private final NestedScrollingParentHelper mParentHelper;
    private final Runnable mRemoveActionBarHideOffset;
    private final ViewPropertyAnimatorListener mTopAnimatorListener;
    private Drawable mWindowContentOverlay;
    private int mWindowVisibility;

    public interface ActionBarVisibilityCallback {
        void enableContentAnimations(boolean z);

        void hideForSystem();

        void onContentScrollStarted();

        void onContentScrollStopped();

        void onWindowVisibilityChanged(int i);

        void showForSystem();
    }

    class 1 extends ViewPropertyAnimatorListenerAdapter {
        final ActionBarOverlayLayout this$0;

        public void onAnimationEnd(View view) {
            ActionBarOverlayLayout.access$002(this.this$0, null);
            ActionBarOverlayLayout.access$102(this.this$0, false);
        }

        public void onAnimationCancel(View view) {
            ActionBarOverlayLayout.access$002(this.this$0, null);
            ActionBarOverlayLayout.access$102(this.this$0, false);
        }

        1(ActionBarOverlayLayout actionBarOverlayLayout) {
            this.this$0 = actionBarOverlayLayout;
        }
    }

    class 2 implements Runnable {
        final ActionBarOverlayLayout this$0;

        2(ActionBarOverlayLayout actionBarOverlayLayout) {
            this.this$0 = actionBarOverlayLayout;
        }

        public void run() {
            ActionBarOverlayLayout.access$200(this.this$0);
            ActionBarOverlayLayout.access$002(this.this$0, ViewCompat.animate(ActionBarOverlayLayout.access$400(this.this$0)).translationY(0.0f).setListener(ActionBarOverlayLayout.access$300(this.this$0)));
        }
    }

    class 3 implements Runnable {
        final ActionBarOverlayLayout this$0;

        3(ActionBarOverlayLayout actionBarOverlayLayout) {
            this.this$0 = actionBarOverlayLayout;
        }

        public void run() {
            ActionBarOverlayLayout.access$200(this.this$0);
            ActionBarOverlayLayout.access$002(this.this$0, ViewCompat.animate(ActionBarOverlayLayout.access$400(this.this$0)).translationY((float) (-ActionBarOverlayLayout.access$400(this.this$0).getHeight())).setListener(ActionBarOverlayLayout.access$300(this.this$0)));
        }
    }

    public class LayoutParams extends MarginLayoutParams {
        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    private void postAddActionBarHideOffset() {
        haltActionBarHideOffsetAnimations();
        postDelayed(this.mAddActionBarHideOffset, 600);
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.mHasNonEmbeddedTabs = z;
    }

    public void initFeature(int i) {
        boolean z = LinearLayoutCompat.a;
        try {
            pullChildren();
            switch (i) {
                case at.i /*2*/:
                    this.mDecorToolbar.initProgress();
                    if (!z) {
                        return;
                    }
                    break;
                case at.m /*5*/:
                    break;
                case arj.Theme_switchStyle /*109*/:
                    break;
                default:
                    return;
            }
            try {
                this.mDecorToolbar.initIndeterminateProgress();
                if (!z) {
                    return;
                }
                setOverlayMode(true);
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    public void dismissPopups() {
        pullChildren();
        this.mDecorToolbar.dismissPopupMenus();
    }

    void pullChildren() {
        try {
            if (this.mContent == null) {
                this.mContent = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
                this.mActionBarTop = (ActionBarContainer) findViewById(R.id.action_bar_container);
                this.mDecorToolbar = getDecorToolbar(findViewById(R.id.action_bar));
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        try {
            this.mParentHelper.onNestedScrollAccepted(view, view2, i);
            this.mHideOnContentScrollReference = getActionBarHideOffset();
            haltActionBarHideOffsetAnimations();
            if (this.mActionBarVisibilityCallback != null) {
                this.mActionBarVisibilityCallback.onContentScrollStarted();
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mWindowVisibility = 0;
        this.mBaseContentInsets = new Rect();
        this.mLastBaseContentInsets = new Rect();
        this.mContentInsets = new Rect();
        this.mBaseInnerInsets = new Rect();
        this.mInnerInsets = new Rect();
        this.mLastInnerInsets = new Rect();
        this.ACTION_BAR_ANIMATE_DELAY = 600;
        this.mTopAnimatorListener = new 1(this);
        this.mRemoveActionBarHideOffset = new 2(this);
        this.mAddActionBarHideOffset = new 3(this);
        init(context);
        this.mParentHelper = new NestedScrollingParentHelper(this);
    }

    public void setMenuPrepared() {
        pullChildren();
        this.mDecorToolbar.setMenuPrepared();
    }

    static ViewPropertyAnimatorListener access$300(ActionBarOverlayLayout actionBarOverlayLayout) {
        return actionBarOverlayLayout.mTopAnimatorListener;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void setShowingForActionMode(boolean z) {
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
                throw new IllegalStateException(z + view.getClass().getSimpleName());
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    private void removeActionBarHideOffset() {
        haltActionBarHideOffsetAnimations();
        this.mRemoveActionBarHideOffset.run();
    }

    public boolean isOverflowMenuShowing() {
        pullChildren();
        return this.mDecorToolbar.isOverflowMenuShowing();
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    protected void onWindowVisibilityChanged(int i) {
        try {
            super.onWindowVisibilityChanged(i);
            this.mWindowVisibility = i;
            if (this.mActionBarVisibilityCallback != null) {
                this.mActionBarVisibilityCallback.onWindowVisibilityChanged(i);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void setWindowCallback(Callback callback) {
        pullChildren();
        this.mDecorToolbar.setWindowCallback(callback);
    }

    private void init(Context context) {
        boolean z = true;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(ATTRS);
        try {
            boolean z2;
            this.mActionBarHeight = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.mWindowContentOverlay = obtainStyledAttributes.getDrawable(1);
            if (this.mWindowContentOverlay == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            try {
                setWillNotDraw(z2);
                obtainStyledAttributes.recycle();
                if (context.getApplicationInfo().targetSdkVersion >= 19) {
                    z = false;
                }
                this.mIgnoreWindowContentOverlay = z;
                this.mFlingEstimator = ScrollerCompat.create(context);
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public void setOverlayMode(boolean z) {
        try {
            boolean z2;
            this.mOverlayMode = z;
            if (z) {
                if (getContext().getApplicationInfo().targetSdkVersion < 19) {
                    z2 = true;
                    this.mIgnoreWindowContentOverlay = z2;
                }
            }
            z2 = false;
            this.mIgnoreWindowContentOverlay = z2;
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    private void addActionBarHideOffset() {
        haltActionBarHideOffsetAnimations();
        this.mAddActionBarHideOffset.run();
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        this.mHideOnContentScrollReference += i2;
        setActionBarHideOffset(this.mHideOnContentScrollReference);
    }

    protected void onConfigurationChanged(Configuration configuration) {
        try {
            if (VERSION.SDK_INT >= 8) {
                super.onConfigurationChanged(configuration);
            }
            init(getContext());
            ViewCompat.requestApplyInsets(this);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public boolean isOverflowMenuShowPending() {
        pullChildren();
        return this.mDecorToolbar.isOverflowMenuShowPending();
    }

    static ActionBarContainer access$400(ActionBarOverlayLayout actionBarOverlayLayout) {
        return actionBarOverlayLayout.mActionBarTop;
    }

    protected android.view.ViewGroup.LayoutParams m72generateDefaultLayoutParams() {
        return generateDefaultLayoutParams();
    }

    public void setWindowTitle(CharSequence charSequence) {
        pullChildren();
        this.mDecorToolbar.setWindowTitle(charSequence);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onNestedFling(android.view.View r3, float r4, float r5, boolean r6) {
        /*
        r2 = this;
        r0 = 1;
        r1 = r2.mHideOnContentScroll;	 Catch:{ IllegalStateException -> 0x0009 }
        if (r1 == 0) goto L_0x0007;
    L_0x0005:
        if (r6 != 0) goto L_0x000d;
    L_0x0007:
        r0 = 0;
    L_0x0008:
        return r0;
    L_0x0009:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x000b }
    L_0x000b:
        r0 = move-exception;
        throw r0;
    L_0x000d:
        r1 = r2.shouldHideActionBarOnFling(r4, r5);	 Catch:{ IllegalStateException -> 0x0020 }
        if (r1 == 0) goto L_0x001a;
    L_0x0013:
        r2.addActionBarHideOffset();	 Catch:{ IllegalStateException -> 0x0022 }
        r1 = android.support.v7.widget.LinearLayoutCompat.a;	 Catch:{ IllegalStateException -> 0x0022 }
        if (r1 == 0) goto L_0x001d;
    L_0x001a:
        r2.removeActionBarHideOffset();	 Catch:{ IllegalStateException -> 0x0022 }
    L_0x001d:
        r2.mAnimatingForFling = r0;
        goto L_0x0008;
    L_0x0020:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0022 }
    L_0x0022:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionBarOverlayLayout.onNestedFling(android.view.View, float, float, boolean):boolean");
    }

    public boolean showOverflowMenu() {
        pullChildren();
        return this.mDecorToolbar.showOverflowMenu();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onMeasure(int r13, int r14) {
        /*
        r12 = this;
        r7 = android.support.v7.widget.LinearLayoutCompat.a;
        r12.pullChildren();
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r6 = 0;
        r11 = 0;
        r1 = r12.mActionBarTop;
        r3 = 0;
        r5 = 0;
        r0 = r12;
        r2 = r13;
        r4 = r14;
        r0.measureChildWithMargins(r1, r2, r3, r4, r5);
        r0 = r12.mActionBarTop;
        r0 = r0.getLayoutParams();
        r0 = (android.support.v7.widget.ActionBarOverlayLayout.LayoutParams) r0;
        r1 = r12.mActionBarTop;
        r1 = r1.getMeasuredWidth();
        r2 = r0.leftMargin;
        r1 = r1 + r2;
        r2 = r0.rightMargin;
        r1 = r1 + r2;
        r9 = java.lang.Math.max(r9, r1);
        r1 = r12.mActionBarTop;
        r1 = r1.getMeasuredHeight();
        r2 = r0.topMargin;
        r1 = r1 + r2;
        r0 = r0.bottomMargin;
        r0 = r0 + r1;
        r8 = java.lang.Math.max(r8, r0);
        r0 = r12.mActionBarTop;
        r0 = android.support.v4.view.ViewCompat.getMeasuredState(r0);
        r10 = android.support.v7.widget.ViewUtils.combineMeasuredStates(r10, r0);
        r0 = android.support.v4.view.ViewCompat.getWindowSystemUiVisibility(r12);
        r0 = r0 & 256;
        if (r0 == 0) goto L_0x0139;
    L_0x004e:
        r0 = 1;
        r1 = r0;
    L_0x0050:
        if (r1 == 0) goto L_0x0147;
    L_0x0052:
        r0 = r12.mActionBarHeight;
        r2 = r12.mHasNonEmbeddedTabs;
        if (r2 == 0) goto L_0x0075;
    L_0x0058:
        r2 = r12.mActionBarTop;
        r2 = r2.getTabContainer();
        if (r2 == 0) goto L_0x0063;
    L_0x0060:
        r2 = r12.mActionBarHeight;
        r0 = r0 + r2;
    L_0x0063:
        if (r7 == 0) goto L_0x0075;
    L_0x0065:
        r2 = r12.mActionBarTop;	 Catch:{ IllegalStateException -> 0x013d }
        r2 = r2.getVisibility();	 Catch:{ IllegalStateException -> 0x013d }
        r3 = 8;
        if (r2 == r3) goto L_0x0075;
    L_0x006f:
        r0 = r12.mActionBarTop;
        r0 = r0.getMeasuredHeight();
    L_0x0075:
        r2 = r12.mContentInsets;	 Catch:{ IllegalStateException -> 0x013f }
        r3 = r12.mBaseContentInsets;	 Catch:{ IllegalStateException -> 0x013f }
        r2.set(r3);	 Catch:{ IllegalStateException -> 0x013f }
        r2 = r12.mInnerInsets;	 Catch:{ IllegalStateException -> 0x013f }
        r3 = r12.mBaseInnerInsets;	 Catch:{ IllegalStateException -> 0x013f }
        r2.set(r3);	 Catch:{ IllegalStateException -> 0x013f }
        r2 = r12.mOverlayMode;	 Catch:{ IllegalStateException -> 0x013f }
        if (r2 != 0) goto L_0x0099;
    L_0x0087:
        if (r1 != 0) goto L_0x0099;
    L_0x0089:
        r1 = r12.mContentInsets;	 Catch:{ IllegalStateException -> 0x0143 }
        r2 = r1.top;	 Catch:{ IllegalStateException -> 0x0143 }
        r2 = r2 + r0;
        r1.top = r2;	 Catch:{ IllegalStateException -> 0x0143 }
        r1 = r12.mContentInsets;	 Catch:{ IllegalStateException -> 0x0143 }
        r2 = r1.bottom;	 Catch:{ IllegalStateException -> 0x0143 }
        r2 = r2 + r11;
        r1.bottom = r2;	 Catch:{ IllegalStateException -> 0x0143 }
        if (r7 == 0) goto L_0x00a7;
    L_0x0099:
        r1 = r12.mInnerInsets;	 Catch:{ IllegalStateException -> 0x0143 }
        r2 = r1.top;	 Catch:{ IllegalStateException -> 0x0143 }
        r0 = r0 + r2;
        r1.top = r0;	 Catch:{ IllegalStateException -> 0x0143 }
        r0 = r12.mInnerInsets;	 Catch:{ IllegalStateException -> 0x0143 }
        r1 = r0.bottom;	 Catch:{ IllegalStateException -> 0x0143 }
        r1 = r1 + r11;
        r0.bottom = r1;	 Catch:{ IllegalStateException -> 0x0143 }
    L_0x00a7:
        r1 = r12.mContent;	 Catch:{ IllegalStateException -> 0x0145 }
        r2 = r12.mContentInsets;	 Catch:{ IllegalStateException -> 0x0145 }
        r3 = 1;
        r4 = 1;
        r5 = 1;
        r6 = 1;
        r0 = r12;
        r0.applyInsets(r1, r2, r3, r4, r5, r6);	 Catch:{ IllegalStateException -> 0x0145 }
        r0 = r12.mLastInnerInsets;	 Catch:{ IllegalStateException -> 0x0145 }
        r1 = r12.mInnerInsets;	 Catch:{ IllegalStateException -> 0x0145 }
        r0 = r0.equals(r1);	 Catch:{ IllegalStateException -> 0x0145 }
        if (r0 != 0) goto L_0x00cb;
    L_0x00bd:
        r0 = r12.mLastInnerInsets;	 Catch:{ IllegalStateException -> 0x0145 }
        r1 = r12.mInnerInsets;	 Catch:{ IllegalStateException -> 0x0145 }
        r0.set(r1);	 Catch:{ IllegalStateException -> 0x0145 }
        r0 = r12.mContent;	 Catch:{ IllegalStateException -> 0x0145 }
        r1 = r12.mInnerInsets;	 Catch:{ IllegalStateException -> 0x0145 }
        r0.dispatchFitSystemWindows(r1);	 Catch:{ IllegalStateException -> 0x0145 }
    L_0x00cb:
        r1 = r12.mContent;
        r3 = 0;
        r5 = 0;
        r0 = r12;
        r2 = r13;
        r4 = r14;
        r0.measureChildWithMargins(r1, r2, r3, r4, r5);
        r0 = r12.mContent;
        r0 = r0.getLayoutParams();
        r0 = (android.support.v7.widget.ActionBarOverlayLayout.LayoutParams) r0;
        r1 = r12.mContent;
        r1 = r1.getMeasuredWidth();
        r2 = r0.leftMargin;
        r1 = r1 + r2;
        r2 = r0.rightMargin;
        r1 = r1 + r2;
        r1 = java.lang.Math.max(r9, r1);
        r2 = r12.mContent;
        r2 = r2.getMeasuredHeight();
        r3 = r0.topMargin;
        r2 = r2 + r3;
        r0 = r0.bottomMargin;
        r0 = r0 + r2;
        r0 = java.lang.Math.max(r8, r0);
        r2 = r12.mContent;
        r2 = android.support.v4.view.ViewCompat.getMeasuredState(r2);
        r2 = android.support.v7.widget.ViewUtils.combineMeasuredStates(r10, r2);
        r3 = r12.getPaddingLeft();
        r4 = r12.getPaddingRight();
        r3 = r3 + r4;
        r1 = r1 + r3;
        r3 = r12.getPaddingTop();
        r4 = r12.getPaddingBottom();
        r3 = r3 + r4;
        r0 = r0 + r3;
        r3 = r12.getSuggestedMinimumHeight();
        r0 = java.lang.Math.max(r0, r3);
        r3 = r12.getSuggestedMinimumWidth();
        r1 = java.lang.Math.max(r1, r3);
        r1 = android.support.v4.view.ViewCompat.resolveSizeAndState(r1, r13, r2);
        r2 = r2 << 16;
        r0 = android.support.v4.view.ViewCompat.resolveSizeAndState(r0, r14, r2);
        r12.setMeasuredDimension(r1, r0);
        return;
    L_0x0139:
        r0 = 0;
        r1 = r0;
        goto L_0x0050;
    L_0x013d:
        r0 = move-exception;
        throw r0;
    L_0x013f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0141 }
    L_0x0141:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0143 }
    L_0x0143:
        r0 = move-exception;
        throw r0;
    L_0x0145:
        r0 = move-exception;
        throw r0;
    L_0x0147:
        r0 = r6;
        goto L_0x0065;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        haltActionBarHideOffsetAnimations();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onWindowSystemUiVisibilityChanged(int r7) {
        /*
        r6 = this;
        r1 = 1;
        r2 = 0;
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalStateException -> 0x0047 }
        r3 = 16;
        if (r0 < r3) goto L_0x000b;
    L_0x0008:
        super.onWindowSystemUiVisibilityChanged(r7);	 Catch:{ IllegalStateException -> 0x0047 }
    L_0x000b:
        r6.pullChildren();
        r0 = r6.mLastSystemUiVisibility;
        r4 = r0 ^ r7;
        r6.mLastSystemUiVisibility = r7;	 Catch:{ IllegalStateException -> 0x0049 }
        r0 = r7 & 4;
        if (r0 != 0) goto L_0x004b;
    L_0x0018:
        r0 = r1;
    L_0x0019:
        r3 = r7 & 256;
        if (r3 == 0) goto L_0x004d;
    L_0x001d:
        r3 = r1;
    L_0x001e:
        r5 = r6.mActionBarVisibilityCallback;	 Catch:{ IllegalStateException -> 0x004f }
        if (r5 == 0) goto L_0x003b;
    L_0x0022:
        r5 = r6.mActionBarVisibilityCallback;	 Catch:{ IllegalStateException -> 0x0051 }
        if (r3 != 0) goto L_0x0053;
    L_0x0026:
        r5.enableContentAnimations(r1);	 Catch:{ IllegalStateException -> 0x0055 }
        if (r0 != 0) goto L_0x002d;
    L_0x002b:
        if (r3 != 0) goto L_0x0036;
    L_0x002d:
        r0 = r6.mActionBarVisibilityCallback;	 Catch:{ IllegalStateException -> 0x0059 }
        r0.showForSystem();	 Catch:{ IllegalStateException -> 0x0059 }
        r0 = android.support.v7.widget.LinearLayoutCompat.a;	 Catch:{ IllegalStateException -> 0x0059 }
        if (r0 == 0) goto L_0x003b;
    L_0x0036:
        r0 = r6.mActionBarVisibilityCallback;	 Catch:{ IllegalStateException -> 0x0059 }
        r0.hideForSystem();	 Catch:{ IllegalStateException -> 0x0059 }
    L_0x003b:
        r0 = r4 & 256;
        if (r0 == 0) goto L_0x0046;
    L_0x003f:
        r0 = r6.mActionBarVisibilityCallback;	 Catch:{ IllegalStateException -> 0x005b }
        if (r0 == 0) goto L_0x0046;
    L_0x0043:
        android.support.v4.view.ViewCompat.requestApplyInsets(r6);	 Catch:{ IllegalStateException -> 0x005b }
    L_0x0046:
        return;
    L_0x0047:
        r0 = move-exception;
        throw r0;
    L_0x0049:
        r0 = move-exception;
        throw r0;
    L_0x004b:
        r0 = r2;
        goto L_0x0019;
    L_0x004d:
        r3 = r2;
        goto L_0x001e;
    L_0x004f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0051 }
    L_0x0051:
        r0 = move-exception;
        throw r0;
    L_0x0053:
        r1 = r2;
        goto L_0x0026;
    L_0x0055:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0057 }
    L_0x0057:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0059 }
    L_0x0059:
        r0 = move-exception;
        throw r0;
    L_0x005b:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionBarOverlayLayout.onWindowSystemUiVisibilityChanged(int):void");
    }

    private void haltActionBarHideOffsetAnimations() {
        try {
            removeCallbacks(this.mRemoveActionBarHideOffset);
            removeCallbacks(this.mAddActionBarHideOffset);
            if (this.mCurrentActionBarTopAnimator != null) {
                this.mCurrentActionBarTopAnimator.cancel();
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public int getNestedScrollAxes() {
        return this.mParentHelper.getNestedScrollAxes();
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    static boolean access$102(ActionBarOverlayLayout actionBarOverlayLayout, boolean z) {
        actionBarOverlayLayout.mAnimatingForFling = z;
        return z;
    }

    private void postRemoveActionBarHideOffset() {
        haltActionBarHideOffsetAnimations();
        postDelayed(this.mRemoveActionBarHideOffset, 600);
    }

    protected boolean fitSystemWindows(Rect rect) {
        boolean applyInsets;
        pullChildren();
        if ((ViewCompat.getWindowSystemUiVisibility(this) & 256) != 0) {
            applyInsets = applyInsets(this.mActionBarTop, rect, true, true, false, true);
            this.mBaseInnerInsets.set(rect);
            ViewUtils.computeFitSystemWindows(this, this.mBaseInnerInsets, this.mBaseContentInsets);
        } else {
            applyInsets = applyInsets(this.mActionBarTop, rect, true, true, false, true);
            this.mBaseInnerInsets.set(rect);
            ViewUtils.computeFitSystemWindows(this, this.mBaseInnerInsets, this.mBaseContentInsets);
        }
        if (!this.mLastBaseContentInsets.equals(this.mBaseContentInsets)) {
            this.mLastBaseContentInsets.set(this.mBaseContentInsets);
            applyInsets = true;
        }
        if (applyInsets) {
            try {
                requestLayout();
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        return true;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        try {
            if (z != this.mHideOnContentScroll) {
                this.mHideOnContentScroll = z;
                if (!z) {
                    haltActionBarHideOffsetAnimations();
                    setActionBarHideOffset(0);
                }
            }
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public android.view.ViewGroup.LayoutParams m73generateLayoutParams(AttributeSet attributeSet) {
        return generateLayoutParams(attributeSet);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    private boolean shouldHideActionBarOnFling(float f, float f2) {
        this.mFlingEstimator.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        try {
            if (this.mFlingEstimator.getFinalY() > this.mActionBarTop.getHeight()) {
                return true;
            }
            return false;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) != 0) {
            try {
                if (this.mActionBarTop.getVisibility() == 0) {
                    return this.mHideOnContentScroll;
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        return false;
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void setMenu(Menu menu, MenuPresenter.Callback callback) {
        pullChildren();
        this.mDecorToolbar.setMenu(menu, callback);
    }

    public void setActionBarHideOffset(int i) {
        haltActionBarHideOffsetAnimations();
        ViewCompat.setTranslationY(this.mActionBarTop, (float) (-Math.max(0, Math.min(i, this.mActionBarTop.getHeight()))));
    }

    public boolean isInOverlayMode() {
        return this.mOverlayMode;
    }

    static ViewPropertyAnimatorCompat access$002(ActionBarOverlayLayout actionBarOverlayLayout, ViewPropertyAnimatorCompat viewPropertyAnimatorCompat) {
        actionBarOverlayLayout.mCurrentActionBarTopAnimator = viewPropertyAnimatorCompat;
        return viewPropertyAnimatorCompat;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = LinearLayoutCompat.a;
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i3 - i) - getPaddingRight();
        int paddingTop = getPaddingTop();
        paddingRight = (i4 - i2) - getPaddingBottom();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int i6 = layoutParams.leftMargin + paddingLeft;
                paddingRight = layoutParams.topMargin + paddingTop;
                childAt.layout(i6, paddingRight, childAt.getMeasuredWidth() + i6, childAt.getMeasuredHeight() + paddingRight);
            }
            paddingRight = i5 + 1;
            if (!z2) {
                i5 = paddingRight;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onStopNestedScroll(android.view.View r3) {
        /*
        r2 = this;
        r0 = r2.mHideOnContentScroll;	 Catch:{ IllegalStateException -> 0x0026 }
        if (r0 == 0) goto L_0x001c;
    L_0x0004:
        r0 = r2.mAnimatingForFling;	 Catch:{ IllegalStateException -> 0x0028 }
        if (r0 != 0) goto L_0x001c;
    L_0x0008:
        r0 = r2.mHideOnContentScrollReference;	 Catch:{ IllegalStateException -> 0x002a }
        r1 = r2.mActionBarTop;	 Catch:{ IllegalStateException -> 0x002a }
        r1 = r1.getHeight();	 Catch:{ IllegalStateException -> 0x002a }
        if (r0 > r1) goto L_0x0019;
    L_0x0012:
        r2.postRemoveActionBarHideOffset();	 Catch:{ IllegalStateException -> 0x002c }
        r0 = android.support.v7.widget.LinearLayoutCompat.a;	 Catch:{ IllegalStateException -> 0x002c }
        if (r0 == 0) goto L_0x001c;
    L_0x0019:
        r2.postAddActionBarHideOffset();	 Catch:{ IllegalStateException -> 0x002c }
    L_0x001c:
        r0 = r2.mActionBarVisibilityCallback;	 Catch:{ IllegalStateException -> 0x002e }
        if (r0 == 0) goto L_0x0025;
    L_0x0020:
        r0 = r2.mActionBarVisibilityCallback;	 Catch:{ IllegalStateException -> 0x002e }
        r0.onContentScrollStopped();	 Catch:{ IllegalStateException -> 0x002e }
    L_0x0025:
        return;
    L_0x0026:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0028 }
    L_0x0028:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x002a }
    L_0x002a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x002c }
    L_0x002c:
        r0 = move-exception;
        throw r0;
    L_0x002e:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionBarOverlayLayout.onStopNestedScroll(android.view.View):void");
    }

    public void setActionBarVisibilityCallback(ActionBarVisibilityCallback actionBarVisibilityCallback) {
        try {
            this.mActionBarVisibilityCallback = actionBarVisibilityCallback;
            if (getWindowToken() != null) {
                this.mActionBarVisibilityCallback.onWindowVisibilityChanged(this.mWindowVisibility);
                if (this.mLastSystemUiVisibility != 0) {
                    onWindowSystemUiVisibilityChanged(this.mLastSystemUiVisibility);
                    ViewCompat.requestApplyInsets(this);
                }
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private boolean applyInsets(View view, Rect rect, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = false;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (z) {
            try {
                if (layoutParams.leftMargin != rect.left) {
                    layoutParams.leftMargin = rect.left;
                    z5 = true;
                }
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        if (z2) {
            try {
                if (layoutParams.topMargin != rect.top) {
                    layoutParams.topMargin = rect.top;
                    z5 = true;
                }
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }
        if (z4) {
            try {
                if (layoutParams.rightMargin != rect.right) {
                    layoutParams.rightMargin = rect.right;
                    z5 = true;
                }
            } catch (IllegalStateException e22) {
                throw e22;
            }
        }
        if (z3) {
            try {
                if (layoutParams.bottomMargin != rect.bottom) {
                    layoutParams.bottomMargin = rect.bottom;
                    return true;
                }
            } catch (IllegalStateException e222) {
                throw e222;
            }
        }
        return z5;
    }

    public int getActionBarHideOffset() {
        try {
            return this.mActionBarTop != null ? -((int) ViewCompat.getTranslationY(this.mActionBarTop)) : 0;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    static {
        char[] toCharArray = "K)az\u0002(%n6\u0013()/9\u0013k'}}\u0002g'c?\u0017zh`(\u0002('i}".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 8;
                    break;
                case at.g /*1*/:
                    i2 = 72;
                    break;
                case at.i /*2*/:
                    i2 = 15;
                    break;
                case at.o /*3*/:
                    i2 = 93;
                    break;
                default:
                    i2 = 118;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
        ATTRS = new int[]{R.attr.actionBarSize, 16842841};
    }

    public boolean hideOverflowMenu() {
        pullChildren();
        return this.mDecorToolbar.hideOverflowMenu();
    }

    public void draw(Canvas canvas) {
        try {
            super.draw(canvas);
            if (this.mWindowContentOverlay == null) {
                return;
            }
            if (!this.mIgnoreWindowContentOverlay) {
                try {
                    int bottom;
                    if (this.mActionBarTop.getVisibility() == 0) {
                        bottom = (int) ((((float) this.mActionBarTop.getBottom()) + ViewCompat.getTranslationY(this.mActionBarTop)) + 0.5f);
                    } else {
                        bottom = 0;
                    }
                    this.mWindowContentOverlay.setBounds(0, bottom, getWidth(), this.mWindowContentOverlay.getIntrinsicHeight() + bottom);
                    this.mWindowContentOverlay.draw(canvas);
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
        } catch (IllegalStateException e2) {
            throw e2;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    static void access$200(ActionBarOverlayLayout actionBarOverlayLayout) {
        actionBarOverlayLayout.haltActionBarHideOffsetAnimations();
    }

    public boolean canShowOverflowMenu() {
        pullChildren();
        return this.mDecorToolbar.canShowOverflowMenu();
    }
}
