package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.appcompat.R;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;

public class ActionBarContainer extends FrameLayout {
    private View mActionBarView;
    Drawable mBackground;
    private View mContextView;
    private int mHeight;
    boolean mIsSplit;
    boolean mIsStacked;
    private boolean mIsTransitioning;
    Drawable mSplitBackground;
    Drawable mStackedBackground;
    private View mTabContainer;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.mActionBarView = findViewById(R.id.action_bar);
        this.mContextView = findViewById(R.id.action_context_bar);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        /*
        r10 = this;
        r6 = 8;
        r1 = 1;
        r2 = 0;
        r4 = android.support.v7.widget.LinearLayoutCompat.a;
        super.onLayout(r11, r12, r13, r14, r15);
        r5 = r10.mTabContainer;
        if (r5 == 0) goto L_0x00cd;
    L_0x000d:
        r0 = r5.getVisibility();
        if (r0 == r6) goto L_0x00cd;
    L_0x0013:
        r3 = r1;
    L_0x0014:
        if (r5 == 0) goto L_0x0036;
    L_0x0016:
        r0 = r5.getVisibility();
        if (r0 == r6) goto L_0x0036;
    L_0x001c:
        r6 = r10.getMeasuredHeight();
        r0 = r5.getLayoutParams();
        r0 = (android.widget.FrameLayout.LayoutParams) r0;
        r7 = r5.getMeasuredHeight();
        r7 = r6 - r7;
        r8 = r0.bottomMargin;
        r7 = r7 - r8;
        r0 = r0.bottomMargin;
        r0 = r6 - r0;
        r5.layout(r12, r7, r14, r0);
    L_0x0036:
        r0 = r10.mIsSplit;
        if (r0 == 0) goto L_0x00d4;
    L_0x003a:
        r0 = r10.mSplitBackground;
        if (r0 == 0) goto L_0x00d2;
    L_0x003e:
        r0 = r10.mSplitBackground;
        r6 = r10.getMeasuredWidth();
        r7 = r10.getMeasuredHeight();
        r0.setBounds(r2, r2, r6, r7);
        if (r4 == 0) goto L_0x00c7;
    L_0x004d:
        r0 = r1;
    L_0x004e:
        r6 = r10.mBackground;
        if (r6 == 0) goto L_0x00aa;
    L_0x0052:
        r0 = r10.mActionBarView;
        r0 = r0.getVisibility();
        if (r0 != 0) goto L_0x0079;
    L_0x005a:
        r0 = r10.mBackground;
        r6 = r10.mActionBarView;
        r6 = r6.getLeft();
        r7 = r10.mActionBarView;
        r7 = r7.getTop();
        r8 = r10.mActionBarView;
        r8 = r8.getRight();
        r9 = r10.mActionBarView;
        r9 = r9.getBottom();
        r0.setBounds(r6, r7, r8, r9);
        if (r4 == 0) goto L_0x00a9;
    L_0x0079:
        r0 = r10.mContextView;
        if (r0 == 0) goto L_0x00a4;
    L_0x007d:
        r0 = r10.mContextView;
        r0 = r0.getVisibility();
        if (r0 != 0) goto L_0x00a4;
    L_0x0085:
        r0 = r10.mBackground;
        r6 = r10.mContextView;
        r6 = r6.getLeft();
        r7 = r10.mContextView;
        r7 = r7.getTop();
        r8 = r10.mContextView;
        r8 = r8.getRight();
        r9 = r10.mContextView;
        r9 = r9.getBottom();
        r0.setBounds(r6, r7, r8, r9);
        if (r4 == 0) goto L_0x00a9;
    L_0x00a4:
        r0 = r10.mBackground;
        r0.setBounds(r2, r2, r2, r2);
    L_0x00a9:
        r0 = r1;
    L_0x00aa:
        r10.mIsStacked = r3;
        if (r3 == 0) goto L_0x00d0;
    L_0x00ae:
        r2 = r10.mStackedBackground;
        if (r2 == 0) goto L_0x00d0;
    L_0x00b2:
        r0 = r10.mStackedBackground;
        r2 = r5.getLeft();
        r3 = r5.getTop();
        r4 = r5.getRight();
        r5 = r5.getBottom();
        r0.setBounds(r2, r3, r4, r5);
    L_0x00c7:
        if (r1 == 0) goto L_0x00cc;
    L_0x00c9:
        r10.invalidate();
    L_0x00cc:
        return;
    L_0x00cd:
        r3 = r2;
        goto L_0x0014;
    L_0x00d0:
        r1 = r0;
        goto L_0x00c7;
    L_0x00d2:
        r1 = r2;
        goto L_0x00c7;
    L_0x00d4:
        r0 = r2;
        goto L_0x004e;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        Drawable actionBarBackgroundDrawableV21;
        super(context, attributeSet);
        if (VERSION.SDK_INT >= 21) {
            actionBarBackgroundDrawableV21 = new ActionBarBackgroundDrawableV21(this);
        } else {
            actionBarBackgroundDrawableV21 = new ActionBarBackgroundDrawable(this);
        }
        setBackgroundDrawable(actionBarBackgroundDrawableV21);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ActionBar);
        this.mBackground = obtainStyledAttributes.getDrawable(R.styleable.ActionBar_background);
        this.mStackedBackground = obtainStyledAttributes.getDrawable(R.styleable.ActionBar_backgroundStacked);
        this.mHeight = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ActionBar_height, -1);
        if (getId() == R.id.split_action_bar) {
            this.mIsSplit = true;
            this.mSplitBackground = obtainStyledAttributes.getDrawable(R.styleable.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        boolean z = this.mIsSplit ? this.mSplitBackground == null : this.mBackground == null && this.mStackedBackground == null;
        setWillNotDraw(z);
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
        if (this.mTabContainer != null) {
            removeView(this.mTabContainer);
        }
        this.mTabContainer = scrollingTabContainerView;
        if (scrollingTabContainerView != null) {
            addView(scrollingTabContainerView);
            LayoutParams layoutParams = scrollingTabContainerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView.setAllowCollapse(false);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.mIsTransitioning || super.onInterceptTouchEvent(motionEvent);
    }

    public void jumpDrawablesToCurrentState() {
        if (VERSION.SDK_INT >= 11) {
            super.jumpDrawablesToCurrentState();
            if (this.mBackground != null) {
                this.mBackground.jumpToCurrentState();
            }
            if (this.mStackedBackground != null) {
                this.mStackedBackground.jumpToCurrentState();
            }
            if (this.mSplitBackground != null) {
                this.mSplitBackground.jumpToCurrentState();
            }
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.mBackground != null && this.mBackground.isStateful()) {
            this.mBackground.setState(getDrawableState());
        }
        if (this.mStackedBackground != null && this.mStackedBackground.isStateful()) {
            this.mStackedBackground.setState(getDrawableState());
        }
        if (this.mSplitBackground != null && this.mSplitBackground.isStateful()) {
            this.mSplitBackground.setState(getDrawableState());
        }
    }

    public ActionMode startActionModeForChild(View view, Callback callback) {
        return null;
    }

    public View getTabContainer() {
        return this.mTabContainer;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.mBackground && !this.mIsSplit) || ((drawable == this.mStackedBackground && this.mIsStacked) || ((drawable == this.mSplitBackground && this.mIsSplit) || super.verifyDrawable(drawable)));
    }

    public void setTransitioning(boolean z) {
        int i;
        this.mIsTransitioning = z;
        if (z) {
            i = 393216;
        } else {
            i = 262144;
        }
        setDescendantFocusability(i);
    }

    private boolean isCollapsed(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r6, int r7) {
        /*
        r5 = this;
        r4 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r1 = android.support.v7.widget.LinearLayoutCompat.a;
        r0 = r5.mActionBarView;
        if (r0 != 0) goto L_0x0020;
    L_0x0008:
        r0 = android.view.View.MeasureSpec.getMode(r7);
        if (r0 != r4) goto L_0x0020;
    L_0x000e:
        r0 = r5.mHeight;
        if (r0 < 0) goto L_0x0020;
    L_0x0012:
        r0 = r5.mHeight;
        r2 = android.view.View.MeasureSpec.getSize(r7);
        r0 = java.lang.Math.min(r0, r2);
        r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4);
    L_0x0020:
        super.onMeasure(r6, r7);
        r0 = r5.mActionBarView;
        if (r0 != 0) goto L_0x0028;
    L_0x0027:
        return;
    L_0x0028:
        r2 = android.view.View.MeasureSpec.getMode(r7);
        r0 = r5.mTabContainer;
        if (r0 == 0) goto L_0x0027;
    L_0x0030:
        r0 = r5.mTabContainer;
        r0 = r0.getVisibility();
        r3 = 8;
        if (r0 == r3) goto L_0x0027;
    L_0x003a:
        r0 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r2 == r0) goto L_0x0027;
    L_0x003e:
        r0 = r5.mActionBarView;
        r0 = r5.isCollapsed(r0);
        if (r0 != 0) goto L_0x004e;
    L_0x0046:
        r0 = r5.mActionBarView;
        r0 = r5.getMeasuredHeightWithMargins(r0);
        if (r1 == 0) goto L_0x007d;
    L_0x004e:
        r0 = r5.mContextView;
        r0 = r5.isCollapsed(r0);
        if (r0 != 0) goto L_0x005e;
    L_0x0056:
        r0 = r5.mContextView;
        r0 = r5.getMeasuredHeightWithMargins(r0);
        if (r1 == 0) goto L_0x007d;
    L_0x005e:
        r0 = 0;
        r1 = r0;
    L_0x0060:
        if (r2 != r4) goto L_0x0079;
    L_0x0062:
        r0 = android.view.View.MeasureSpec.getSize(r7);
    L_0x0066:
        r2 = r5.getMeasuredWidth();
        r3 = r5.mTabContainer;
        r3 = r5.getMeasuredHeightWithMargins(r3);
        r1 = r1 + r3;
        r0 = java.lang.Math.min(r1, r0);
        r5.setMeasuredDimension(r2, r0);
        goto L_0x0027;
    L_0x0079:
        r0 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        goto L_0x0066;
    L_0x007d:
        r1 = r0;
        goto L_0x0060;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    private int getMeasuredHeightWithMargins(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return layoutParams.bottomMargin + (view.getMeasuredHeight() + layoutParams.topMargin);
    }

    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.mBackground != null) {
            this.mBackground.setVisible(z, false);
        }
        if (this.mStackedBackground != null) {
            this.mStackedBackground.setVisible(z, false);
        }
        if (this.mSplitBackground != null) {
            this.mSplitBackground.setVisible(z, false);
        }
    }

    public void setPrimaryBackground(Drawable drawable) {
        boolean z = true;
        if (this.mBackground != null) {
            this.mBackground.setCallback(null);
            unscheduleDrawable(this.mBackground);
        }
        this.mBackground = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.mActionBarView != null) {
                this.mBackground.setBounds(this.mActionBarView.getLeft(), this.mActionBarView.getTop(), this.mActionBarView.getRight(), this.mActionBarView.getBottom());
            }
        }
        if (this.mIsSplit) {
            if (this.mSplitBackground != null) {
                z = false;
            }
        } else if (!(this.mBackground == null && this.mStackedBackground == null)) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }
}
