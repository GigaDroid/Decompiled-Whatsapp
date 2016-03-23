package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.design.R;
import android.support.design.widget.AppBarLayout.OnOffsetChangedListener;
import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.WindowInsetsCompat;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;

public class CollapsingToolbarLayout extends FrameLayout {
    private final CollapsingTextHelper mCollapsingTextHelper;
    private boolean mCollapsingTitleEnabled;
    private Drawable mContentScrim;
    private int mCurrentOffset;
    private boolean mDrawCollapsingTitle;
    private View mDummyView;
    private int mExpandedMarginBottom;
    private int mExpandedMarginLeft;
    private int mExpandedMarginRight;
    private int mExpandedMarginTop;
    private WindowInsetsCompat mLastInsets;
    private OnOffsetChangedListener mOnOffsetChangedListener;
    private boolean mRefreshToolbar;
    private int mScrimAlpha;
    private ValueAnimatorCompat mScrimAnimator;
    private boolean mScrimsAreShown;
    private Drawable mStatusBarScrim;
    private final Rect mTmpRect;
    private Toolbar mToolbar;
    private int mToolbarId;

    class 1 implements OnApplyWindowInsetsListener {
        final CollapsingToolbarLayout this$0;

        1(CollapsingToolbarLayout collapsingToolbarLayout) {
            this.this$0 = collapsingToolbarLayout;
        }

        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            CollapsingToolbarLayout.access$002(this.this$0, windowInsetsCompat);
            this.this$0.requestLayout();
            return windowInsetsCompat.consumeSystemWindowInsets();
        }
    }

    class 2 implements AnimatorUpdateListener {
        final CollapsingToolbarLayout this$0;

        2(CollapsingToolbarLayout collapsingToolbarLayout) {
            this.this$0 = collapsingToolbarLayout;
        }

        public void onAnimationUpdate(ValueAnimatorCompat valueAnimatorCompat) {
            CollapsingToolbarLayout.access$200(this.this$0, valueAnimatorCompat.getAnimatedIntValue());
        }
    }

    public class LayoutParams extends android.widget.FrameLayout.LayoutParams {
        int mCollapseMode;
        float mParallaxMult;

        public void setParallaxMultiplier(float f) {
            this.mParallaxMult = f;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.mCollapseMode = 0;
            this.mParallaxMult = 0.5f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mCollapseMode = 0;
            this.mParallaxMult = 0.5f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CollapsingAppBarLayout_LayoutParams);
            this.mCollapseMode = obtainStyledAttributes.getInt(R.styleable.CollapsingAppBarLayout_LayoutParams_layout_collapseMode, 0);
            setParallaxMultiplier(obtainStyledAttributes.getFloat(R.styleable.CollapsingAppBarLayout_LayoutParams_layout_collapseParallaxMultiplier, 0.5f));
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(android.widget.FrameLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.mCollapseMode = 0;
            this.mParallaxMult = 0.5f;
        }
    }

    class OffsetUpdateListener implements OnOffsetChangedListener {
        final CollapsingToolbarLayout this$0;

        private OffsetUpdateListener(CollapsingToolbarLayout collapsingToolbarLayout) {
            this.this$0 = collapsingToolbarLayout;
        }

        OffsetUpdateListener(CollapsingToolbarLayout collapsingToolbarLayout, 1 1) {
            this(collapsingToolbarLayout);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onOffsetChanged(android.support.design.widget.AppBarLayout r11, int r12) {
            /*
            r10 = this;
            r2 = 0;
            r4 = android.support.design.widget.CoordinatorLayout.a;
            r0 = r10.this$0;
            android.support.design.widget.CollapsingToolbarLayout.access$302(r0, r12);
            r0 = r10.this$0;
            r0 = android.support.design.widget.CollapsingToolbarLayout.access$000(r0);
            if (r0 == 0) goto L_0x00a9;
        L_0x0010:
            r0 = r10.this$0;
            r0 = android.support.design.widget.CollapsingToolbarLayout.access$000(r0);
            r0 = r0.getSystemWindowInsetTop();
            r1 = r0;
        L_0x001b:
            r5 = r11.getTotalScrollRange();
            r0 = r10.this$0;
            r6 = r0.getChildCount();
            r3 = r2;
        L_0x0026:
            if (r3 >= r6) goto L_0x0041;
        L_0x0028:
            r0 = r10.this$0;
            r7 = r0.getChildAt(r3);
            r0 = r7.getLayoutParams();
            r0 = (android.support.design.widget.CollapsingToolbarLayout.LayoutParams) r0;
            r8 = android.support.design.widget.CollapsingToolbarLayout.access$400(r7);
            r9 = r0.mCollapseMode;
            switch(r9) {
                case 1: goto L_0x00ac;
                case 2: goto L_0x00c0;
                default: goto L_0x003d;
            };
        L_0x003d:
            r0 = r3 + 1;
            if (r4 == 0) goto L_0x00ce;
        L_0x0041:
            r0 = r10.this$0;
            r0 = android.support.design.widget.CollapsingToolbarLayout.access$500(r0);
            if (r0 != 0) goto L_0x0051;
        L_0x0049:
            r0 = r10.this$0;
            r0 = android.support.design.widget.CollapsingToolbarLayout.access$600(r0);
            if (r0 == 0) goto L_0x0067;
        L_0x0051:
            r0 = r10.this$0;
            r3 = r10.this$0;
            r3 = r3.getHeight();
            r3 = r3 + r12;
            r6 = r10.this$0;
            r6 = r6.getScrimTriggerOffset();
            r6 = r6 + r1;
            if (r3 >= r6) goto L_0x0064;
        L_0x0063:
            r2 = 1;
        L_0x0064:
            r0.setScrimsShown(r2);
        L_0x0067:
            r0 = r10.this$0;
            r0 = android.support.design.widget.CollapsingToolbarLayout.access$600(r0);
            if (r0 == 0) goto L_0x0076;
        L_0x006f:
            if (r1 <= 0) goto L_0x0076;
        L_0x0071:
            r0 = r10.this$0;
            android.support.v4.view.ViewCompat.postInvalidateOnAnimation(r0);
        L_0x0076:
            r0 = r10.this$0;
            r0 = r0.getHeight();
            r2 = r10.this$0;
            r2 = android.support.v4.view.ViewCompat.getMinimumHeight(r2);
            r0 = r0 - r2;
            r0 = r0 - r1;
            r1 = r10.this$0;
            r1 = android.support.design.widget.CollapsingToolbarLayout.access$700(r1);
            r2 = java.lang.Math.abs(r12);
            r2 = (float) r2;
            r0 = (float) r0;
            r0 = r2 / r0;
            r1.setExpansionFraction(r0);
            r0 = java.lang.Math.abs(r12);
            if (r0 != r5) goto L_0x00a4;
        L_0x009b:
            r0 = r11.getTargetElevation();
            android.support.v4.view.ViewCompat.setElevation(r11, r0);
            if (r4 == 0) goto L_0x00a8;
        L_0x00a4:
            r0 = 0;
            android.support.v4.view.ViewCompat.setElevation(r11, r0);
        L_0x00a8:
            return;
        L_0x00a9:
            r1 = r2;
            goto L_0x001b;
        L_0x00ac:
            r9 = r10.this$0;
            r9 = r9.getHeight();
            r9 = r9 - r1;
            r9 = r9 + r12;
            r7 = r7.getHeight();
            if (r9 < r7) goto L_0x003d;
        L_0x00ba:
            r7 = -r12;
            r8.setTopAndBottomOffset(r7);
            if (r4 == 0) goto L_0x003d;
        L_0x00c0:
            r7 = -r12;
            r7 = (float) r7;
            r0 = r0.mParallaxMult;
            r0 = r0 * r7;
            r0 = java.lang.Math.round(r0);
            r8.setTopAndBottomOffset(r0);
            goto L_0x003d;
        L_0x00ce:
            r3 = r0;
            goto L_0x0026;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CollapsingToolbarLayout.OffsetUpdateListener.onOffsetChanged(android.support.design.widget.AppBarLayout, int):void");
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = CoordinatorLayout.a;
        super.onLayout(z, i, i2, i3, i4);
        if (this.mCollapsingTitleEnabled && this.mDummyView != null) {
            this.mDrawCollapsingTitle = this.mDummyView.isShown();
            if (this.mDrawCollapsingTitle) {
                ViewGroupUtils.getDescendantRect(this, this.mDummyView, this.mTmpRect);
                this.mCollapsingTextHelper.setCollapsedBounds(this.mTmpRect.left, i4 - this.mTmpRect.height(), this.mTmpRect.right, i4);
                this.mCollapsingTextHelper.setExpandedBounds(this.mExpandedMarginLeft, this.mTmpRect.bottom + this.mExpandedMarginTop, (i3 - i) - this.mExpandedMarginRight, (i4 - i2) - this.mExpandedMarginBottom);
                this.mCollapsingTextHelper.recalculate();
            }
        }
        int i5 = 0;
        int childCount = getChildCount();
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            if (!(this.mLastInsets == null || ViewCompat.getFitsSystemWindows(childAt))) {
                int systemWindowInsetTop = this.mLastInsets.getSystemWindowInsetTop();
                if (childAt.getTop() < systemWindowInsetTop) {
                    childAt.offsetTopAndBottom(systemWindowInsetTop);
                }
            }
            getViewOffsetHelper(childAt).onViewLayout();
            i5++;
            if (z2) {
                break;
            }
        }
        if (this.mToolbar != null) {
            if (this.mCollapsingTitleEnabled && TextUtils.isEmpty(this.mCollapsingTextHelper.getText())) {
                this.mCollapsingTextHelper.setText(this.mToolbar.getTitle());
            }
            setMinimumHeight(this.mToolbar.getHeight());
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CollapsingToolbarLayout(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
        r7 = this;
        r1 = 1;
        r2 = 0;
        r3 = android.support.design.widget.CoordinatorLayout.a;
        r7.<init>(r8, r9, r10);
        r7.mRefreshToolbar = r1;
        r0 = new android.graphics.Rect;
        r0.<init>();
        r7.mTmpRect = r0;
        android.support.design.widget.ThemeUtils.checkAppCompatTheme(r8);
        r0 = new android.support.design.widget.CollapsingTextHelper;
        r0.<init>(r7);
        r7.mCollapsingTextHelper = r0;
        r0 = r7.mCollapsingTextHelper;
        r4 = android.support.design.widget.AnimationUtils.DECELERATE_INTERPOLATOR;
        r0.setTextSizeInterpolator(r4);
        r0 = android.support.design.R.styleable.CollapsingToolbarLayout;
        r4 = android.support.design.R.style.Widget_Design_CollapsingToolbar;
        r4 = r8.obtainStyledAttributes(r9, r0, r10, r4);
        r0 = r7.mCollapsingTextHelper;
        r5 = android.support.design.R.styleable.CollapsingToolbarLayout_expandedTitleGravity;
        r6 = 8388691; // 0x800053 float:1.175506E-38 double:4.144564E-317;
        r5 = r4.getInt(r5, r6);
        r0.setExpandedTextGravity(r5);
        r0 = r7.mCollapsingTextHelper;
        r5 = android.support.design.R.styleable.CollapsingToolbarLayout_collapsedTitleGravity;
        r6 = 8388627; // 0x800013 float:1.175497E-38 double:4.1445324E-317;
        r5 = r4.getInt(r5, r6);
        r0.setCollapsedTextGravity(r5);
        r0 = android.support.design.R.styleable.CollapsingToolbarLayout_expandedTitleMargin;
        r0 = r4.getDimensionPixelSize(r0, r2);
        r7.mExpandedMarginBottom = r0;
        r7.mExpandedMarginRight = r0;
        r7.mExpandedMarginTop = r0;
        r7.mExpandedMarginLeft = r0;
        r0 = android.support.v4.view.ViewCompat.getLayoutDirection(r7);
        if (r0 != r1) goto L_0x011d;
    L_0x0059:
        r0 = r1;
    L_0x005a:
        r5 = android.support.design.R.styleable.CollapsingToolbarLayout_expandedTitleMarginStart;
        r5 = r4.hasValue(r5);
        if (r5 == 0) goto L_0x0070;
    L_0x0062:
        r5 = android.support.design.R.styleable.CollapsingToolbarLayout_expandedTitleMarginStart;
        r5 = r4.getDimensionPixelSize(r5, r2);
        if (r0 == 0) goto L_0x006e;
    L_0x006a:
        r7.mExpandedMarginRight = r5;
        if (r3 == 0) goto L_0x0070;
    L_0x006e:
        r7.mExpandedMarginLeft = r5;
    L_0x0070:
        r5 = android.support.design.R.styleable.CollapsingToolbarLayout_expandedTitleMarginEnd;
        r5 = r4.hasValue(r5);
        if (r5 == 0) goto L_0x0086;
    L_0x0078:
        r5 = android.support.design.R.styleable.CollapsingToolbarLayout_expandedTitleMarginEnd;
        r5 = r4.getDimensionPixelSize(r5, r2);
        if (r0 == 0) goto L_0x0084;
    L_0x0080:
        r7.mExpandedMarginLeft = r5;
        if (r3 == 0) goto L_0x0086;
    L_0x0084:
        r7.mExpandedMarginRight = r5;
    L_0x0086:
        r0 = android.support.design.R.styleable.CollapsingToolbarLayout_expandedTitleMarginTop;
        r0 = r4.hasValue(r0);
        if (r0 == 0) goto L_0x0096;
    L_0x008e:
        r0 = android.support.design.R.styleable.CollapsingToolbarLayout_expandedTitleMarginTop;
        r0 = r4.getDimensionPixelSize(r0, r2);
        r7.mExpandedMarginTop = r0;
    L_0x0096:
        r0 = android.support.design.R.styleable.CollapsingToolbarLayout_expandedTitleMarginBottom;
        r0 = r4.hasValue(r0);
        if (r0 == 0) goto L_0x00a6;
    L_0x009e:
        r0 = android.support.design.R.styleable.CollapsingToolbarLayout_expandedTitleMarginBottom;
        r0 = r4.getDimensionPixelSize(r0, r2);
        r7.mExpandedMarginBottom = r0;
    L_0x00a6:
        r0 = android.support.design.R.styleable.CollapsingToolbarLayout_titleEnabled;
        r0 = r4.getBoolean(r0, r1);
        r7.mCollapsingTitleEnabled = r0;
        r0 = android.support.design.R.styleable.CollapsingToolbarLayout_title;
        r0 = r4.getText(r0);
        r7.setTitle(r0);
        r0 = r7.mCollapsingTextHelper;
        r5 = android.support.design.R.style.TextAppearance_Design_CollapsingToolbar_Expanded;
        r0.setExpandedTextAppearance(r5);
        r0 = r7.mCollapsingTextHelper;
        r5 = android.support.design.R.style.TextAppearance_AppCompat_Widget_ActionBar_Title;
        r0.setCollapsedTextAppearance(r5);
        r0 = android.support.design.R.styleable.CollapsingToolbarLayout_expandedTitleTextAppearance;
        r0 = r4.hasValue(r0);
        if (r0 == 0) goto L_0x00d8;
    L_0x00cd:
        r0 = r7.mCollapsingTextHelper;
        r5 = android.support.design.R.styleable.CollapsingToolbarLayout_expandedTitleTextAppearance;
        r5 = r4.getResourceId(r5, r2);
        r0.setExpandedTextAppearance(r5);
    L_0x00d8:
        r0 = android.support.design.R.styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance;
        r0 = r4.hasValue(r0);
        if (r0 == 0) goto L_0x00eb;
    L_0x00e0:
        r0 = r7.mCollapsingTextHelper;
        r5 = android.support.design.R.styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance;
        r5 = r4.getResourceId(r5, r2);
        r0.setCollapsedTextAppearance(r5);
    L_0x00eb:
        r0 = android.support.design.R.styleable.CollapsingToolbarLayout_contentScrim;
        r0 = r4.getDrawable(r0);
        r7.setContentScrim(r0);
        r0 = android.support.design.R.styleable.CollapsingToolbarLayout_statusBarScrim;
        r0 = r4.getDrawable(r0);
        r7.setStatusBarScrim(r0);
        r0 = android.support.design.R.styleable.CollapsingToolbarLayout_toolbarId;
        r5 = -1;
        r0 = r4.getResourceId(r0, r5);
        r7.mToolbarId = r0;
        r4.recycle();
        r7.setWillNotDraw(r2);
        r0 = new android.support.design.widget.CollapsingToolbarLayout$1;
        r0.<init>(r7);
        android.support.v4.view.ViewCompat.setOnApplyWindowInsetsListener(r7, r0);
        r0 = android.support.design.widget.CoordinatorLayout.Behavior.a;
        if (r0 == 0) goto L_0x011c;
    L_0x0118:
        if (r3 == 0) goto L_0x0120;
    L_0x011a:
        android.support.design.widget.CoordinatorLayout.a = r2;
    L_0x011c:
        return;
    L_0x011d:
        r0 = r2;
        goto L_0x005a;
    L_0x0120:
        r2 = r1;
        goto L_0x011a;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CollapsingToolbarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    static WindowInsetsCompat access$000(CollapsingToolbarLayout collapsingToolbarLayout) {
        return collapsingToolbarLayout.mLastInsets;
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return generateLayoutParams(layoutParams);
    }

    static ViewOffsetHelper access$400(View view) {
        return getViewOffsetHelper(view);
    }

    protected void onMeasure(int i, int i2) {
        ensureToolbar();
        super.onMeasure(i, i2);
    }

    protected android.widget.FrameLayout.LayoutParams m15generateDefaultLayoutParams() {
        return generateDefaultLayoutParams();
    }

    protected void onDetachedFromWindow() {
        ViewParent parent = getParent();
        if (this.mOnOffsetChangedListener != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).removeOnOffsetChangedListener(this.mOnOffsetChangedListener);
        }
        super.onDetachedFromWindow();
    }

    static int access$302(CollapsingToolbarLayout collapsingToolbarLayout, int i) {
        collapsingToolbarLayout.mCurrentOffset = i;
        return i;
    }

    private void ensureToolbar() {
        boolean z = CoordinatorLayout.a;
        if (this.mRefreshToolbar) {
            Toolbar toolbar;
            int childCount = getChildCount();
            Toolbar toolbar2 = null;
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof Toolbar) {
                    Toolbar toolbar3;
                    if (this.mToolbarId != -1) {
                        if (this.mToolbarId == childAt.getId()) {
                            toolbar3 = (Toolbar) childAt;
                            toolbar = toolbar2;
                            toolbar2 = toolbar3;
                            break;
                        } else if (toolbar2 == null) {
                            toolbar2 = (Toolbar) childAt;
                            if (z) {
                            }
                        } else {
                            continue;
                        }
                    }
                    toolbar3 = (Toolbar) childAt;
                    toolbar = toolbar2;
                    toolbar2 = toolbar3;
                    break;
                }
            }
            toolbar = toolbar2;
            toolbar2 = null;
            if (toolbar2 != null) {
                toolbar = toolbar2;
            }
            this.mToolbar = toolbar;
            updateDummyView();
            this.mRefreshToolbar = false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setScrimsShown(boolean r4, boolean r5) {
        /*
        r3 = this;
        r1 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r2 = 0;
        r0 = r3.mScrimsAreShown;
        if (r0 == r4) goto L_0x001a;
    L_0x0007:
        if (r5 == 0) goto L_0x0013;
    L_0x0009:
        if (r4 == 0) goto L_0x001b;
    L_0x000b:
        r0 = r1;
    L_0x000c:
        r3.animateScrim(r0);
        r0 = android.support.design.widget.CoordinatorLayout.a;
        if (r0 == 0) goto L_0x0018;
    L_0x0013:
        if (r4 == 0) goto L_0x001d;
    L_0x0015:
        r3.setScrimAlpha(r1);
    L_0x0018:
        r3.mScrimsAreShown = r4;
    L_0x001a:
        return;
    L_0x001b:
        r0 = r2;
        goto L_0x000c;
    L_0x001d:
        r1 = r2;
        goto L_0x0015;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CollapsingToolbarLayout.setScrimsShown(boolean, boolean):void");
    }

    static Drawable access$500(CollapsingToolbarLayout collapsingToolbarLayout) {
        return collapsingToolbarLayout.mContentScrim;
    }

    public void setStatusBarScrim(@Nullable Drawable drawable) {
        if (this.mStatusBarScrim != drawable) {
            if (this.mStatusBarScrim != null) {
                this.mStatusBarScrim.setCallback(null);
            }
            this.mStatusBarScrim = drawable;
            drawable.setCallback(this);
            drawable.mutate().setAlpha(this.mScrimAlpha);
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    protected android.view.ViewGroup.LayoutParams m14generateDefaultLayoutParams() {
        return generateDefaultLayoutParams();
    }

    public void setScrimsShown(boolean z) {
        boolean z2;
        if (!ViewCompat.isLaidOut(this) || isInEditMode()) {
            z2 = false;
        } else {
            z2 = true;
        }
        setScrimsShown(z, z2);
    }

    static void access$200(CollapsingToolbarLayout collapsingToolbarLayout, int i) {
        collapsingToolbarLayout.setScrimAlpha(i);
    }

    static WindowInsetsCompat access$002(CollapsingToolbarLayout collapsingToolbarLayout, WindowInsetsCompat windowInsetsCompat) {
        collapsingToolbarLayout.mLastInsets = windowInsetsCompat;
        return windowInsetsCompat;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        ensureToolbar();
        if (this.mToolbar == null && this.mContentScrim != null && this.mScrimAlpha > 0) {
            this.mContentScrim.mutate().setAlpha(this.mScrimAlpha);
            this.mContentScrim.draw(canvas);
        }
        if (this.mCollapsingTitleEnabled && this.mDrawCollapsingTitle) {
            this.mCollapsingTextHelper.draw(canvas);
        }
        if (this.mStatusBarScrim != null && this.mScrimAlpha > 0) {
            int systemWindowInsetTop;
            if (this.mLastInsets != null) {
                systemWindowInsetTop = this.mLastInsets.getSystemWindowInsetTop();
            } else {
                systemWindowInsetTop = 0;
            }
            if (systemWindowInsetTop > 0) {
                this.mStatusBarScrim.setBounds(0, -this.mCurrentOffset, getWidth(), systemWindowInsetTop - this.mCurrentOffset);
                this.mStatusBarScrim.mutate().setAlpha(this.mScrimAlpha);
                this.mStatusBarScrim.draw(canvas);
            }
        }
    }

    public CollapsingToolbarLayout(Context context) {
        this(context, null);
    }

    static Drawable access$600(CollapsingToolbarLayout collapsingToolbarLayout) {
        return collapsingToolbarLayout.mStatusBarScrim;
    }

    static CollapsingTextHelper access$700(CollapsingToolbarLayout collapsingToolbarLayout) {
        return collapsingToolbarLayout.mCollapsingTextHelper;
    }

    final int getScrimTriggerOffset() {
        return ViewCompat.getMinimumHeight(this) * 2;
    }

    public void setTitle(@Nullable CharSequence charSequence) {
        this.mCollapsingTextHelper.setText(charSequence);
    }

    public android.widget.FrameLayout.LayoutParams m16generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.mContentScrim != null) {
            this.mContentScrim.setBounds(0, 0, i, i2);
        }
    }

    protected boolean drawChild(Canvas canvas, View view, long j) {
        ensureToolbar();
        if (view == this.mToolbar && this.mContentScrim != null && this.mScrimAlpha > 0) {
            this.mContentScrim.mutate().setAlpha(this.mScrimAlpha);
            this.mContentScrim.draw(canvas);
        }
        return super.drawChild(canvas, view, j);
    }

    private static ViewOffsetHelper getViewOffsetHelper(View view) {
        ViewOffsetHelper viewOffsetHelper = (ViewOffsetHelper) view.getTag(R.id.view_offset_helper);
        if (viewOffsetHelper != null) {
            return viewOffsetHelper;
        }
        viewOffsetHelper = new ViewOffsetHelper(view);
        view.setTag(R.id.view_offset_helper, viewOffsetHelper);
        return viewOffsetHelper;
    }

    protected android.widget.FrameLayout.LayoutParams m17generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setContentScrim(@android.support.annotation.Nullable android.graphics.drawable.Drawable r5) {
        /*
        r4 = this;
        r3 = 0;
        r2 = 0;
        r0 = r4.mContentScrim;
        if (r0 == r5) goto L_0x0033;
    L_0x0006:
        r0 = r4.mContentScrim;
        if (r0 == 0) goto L_0x000f;
    L_0x000a:
        r0 = r4.mContentScrim;
        r0.setCallback(r3);
    L_0x000f:
        if (r5 == 0) goto L_0x002e;
    L_0x0011:
        r0 = r5.mutate();
        r4.mContentScrim = r0;
        r0 = r4.getWidth();
        r1 = r4.getHeight();
        r5.setBounds(r2, r2, r0, r1);
        r5.setCallback(r4);
        r0 = r4.mScrimAlpha;
        r5.setAlpha(r0);
        r0 = android.support.design.widget.CoordinatorLayout.a;
        if (r0 == 0) goto L_0x0030;
    L_0x002e:
        r4.mContentScrim = r3;
    L_0x0030:
        android.support.v4.view.ViewCompat.postInvalidateOnAnimation(r4);
    L_0x0033:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CollapsingToolbarLayout.setContentScrim(android.graphics.drawable.Drawable):void");
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(super.generateDefaultLayoutParams());
    }

    private void updateDummyView() {
        if (!(this.mCollapsingTitleEnabled || this.mDummyView == null)) {
            ViewParent parent = this.mDummyView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.mDummyView);
            }
        }
        if (this.mCollapsingTitleEnabled && this.mToolbar != null) {
            if (this.mDummyView == null) {
                this.mDummyView = new View(getContext());
            }
            if (this.mDummyView.getParent() == null) {
                this.mToolbar.addView(this.mDummyView, -1, -1);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void animateScrim(int r3) {
        /*
        r2 = this;
        r2.ensureToolbar();
        r0 = r2.mScrimAnimator;
        if (r0 != 0) goto L_0x0029;
    L_0x0007:
        r0 = android.support.design.widget.ViewUtils.createAnimator();
        r2.mScrimAnimator = r0;
        r0 = r2.mScrimAnimator;
        r1 = 600; // 0x258 float:8.41E-43 double:2.964E-321;
        r0.setDuration(r1);
        r0 = r2.mScrimAnimator;
        r1 = android.support.design.widget.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        r0.setInterpolator(r1);
        r0 = r2.mScrimAnimator;
        r1 = new android.support.design.widget.CollapsingToolbarLayout$2;
        r1.<init>(r2);
        r0.setUpdateListener(r1);
        r0 = android.support.design.widget.CoordinatorLayout.a;
        if (r0 == 0) goto L_0x0036;
    L_0x0029:
        r0 = r2.mScrimAnimator;
        r0 = r0.isRunning();
        if (r0 == 0) goto L_0x0036;
    L_0x0031:
        r0 = r2.mScrimAnimator;
        r0.cancel();
    L_0x0036:
        r0 = r2.mScrimAnimator;
        r1 = r2.mScrimAlpha;
        r0.setIntValues(r1, r3);
        r0 = r2.mScrimAnimator;
        r0.start();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CollapsingToolbarLayout.animateScrim(int):void");
    }

    private void setScrimAlpha(int i) {
        if (i != this.mScrimAlpha) {
            if (!(this.mContentScrim == null || this.mToolbar == null)) {
                ViewCompat.postInvalidateOnAnimation(this.mToolbar);
            }
            this.mScrimAlpha = i;
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateLayoutParams(attributeSet);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            if (this.mOnOffsetChangedListener == null) {
                this.mOnOffsetChangedListener = new OffsetUpdateListener(this, null);
            }
            ((AppBarLayout) parent).addOnOffsetChangedListener(this.mOnOffsetChangedListener);
        }
    }
}
