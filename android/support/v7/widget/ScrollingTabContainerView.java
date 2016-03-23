package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.support.v7.app.ActionBar.Tab;
import android.support.v7.appcompat.R;
import android.support.v7.view.ActionBarPolicy;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class ScrollingTabContainerView extends HorizontalScrollView implements OnItemSelectedListener {
    private static final Interpolator sAlphaInterpolator;
    private boolean mAllowCollapse;
    private int mContentHeight;
    int mMaxTabWidth;
    private int mSelectedTabIndex;
    int mStackedTabMaxWidth;
    private TabClickListener mTabClickListener;
    private LinearLayoutCompat mTabLayout;
    Runnable mTabSelector;
    private Spinner mTabSpinner;
    protected final VisibilityAnimListener mVisAnimListener;
    protected ViewPropertyAnimatorCompat mVisibilityAnim;

    class 1 implements Runnable {
        final ScrollingTabContainerView this$0;
        final View val$tabView;

        public void run() {
            this.this$0.smoothScrollTo(this.val$tabView.getLeft() - ((this.this$0.getWidth() - this.val$tabView.getWidth()) / 2), 0);
            this.this$0.mTabSelector = null;
        }

        1(ScrollingTabContainerView scrollingTabContainerView, View view) {
            this.this$0 = scrollingTabContainerView;
            this.val$tabView = view;
        }
    }

    class TabAdapter extends BaseAdapter {
        final ScrollingTabContainerView this$0;

        public Object getItem(int i) {
            return ((TabView) ScrollingTabContainerView.access$200(this.this$0).getChildAt(i)).getTab();
        }

        public int getCount() {
            return ScrollingTabContainerView.access$200(this.this$0).getChildCount();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.view.View getView(int r4, android.view.View r5, android.view.ViewGroup r6) {
            /*
            r3 = this;
            if (r5 != 0) goto L_0x0020;
        L_0x0002:
            r1 = r3.this$0;
            r0 = r3.getItem(r4);
            r0 = (android.support.v7.app.ActionBar.Tab) r0;
            r2 = 1;
            r1 = android.support.v7.widget.ScrollingTabContainerView.access$300(r1, r0, r2);
            r0 = android.support.v7.widget.LinearLayoutCompat.a;
            if (r0 == 0) goto L_0x001f;
        L_0x0013:
            r0 = r1;
            r0 = (android.support.v7.widget.ScrollingTabContainerView.TabView) r0;
            r2 = r3.getItem(r4);
            r2 = (android.support.v7.app.ActionBar.Tab) r2;
            r0.bindTab(r2);
        L_0x001f:
            return r1;
        L_0x0020:
            r1 = r5;
            goto L_0x0013;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ScrollingTabContainerView.TabAdapter.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
        }

        TabAdapter(ScrollingTabContainerView scrollingTabContainerView, 1 1) {
            this(scrollingTabContainerView);
        }

        private TabAdapter(ScrollingTabContainerView scrollingTabContainerView) {
            this.this$0 = scrollingTabContainerView;
        }
    }

    class TabClickListener implements OnClickListener {
        final ScrollingTabContainerView this$0;

        public void onClick(View view) {
            boolean z = LinearLayoutCompat.a;
            ((TabView) view).getTab().select();
            int childCount = ScrollingTabContainerView.access$200(this.this$0).getChildCount();
            int i = 0;
            while (i < childCount) {
                boolean z2;
                View childAt = ScrollingTabContainerView.access$200(this.this$0).getChildAt(i);
                if (childAt == view) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                childAt.setSelected(z2);
                int i2 = i + 1;
                if (!z) {
                    i = i2;
                } else {
                    return;
                }
            }
        }

        TabClickListener(ScrollingTabContainerView scrollingTabContainerView, 1 1) {
            this(scrollingTabContainerView);
        }

        private TabClickListener(ScrollingTabContainerView scrollingTabContainerView) {
            this.this$0 = scrollingTabContainerView;
        }
    }

    class TabView extends LinearLayoutCompat implements OnLongClickListener {
        private final int[] BG_ATTRS;
        private View mCustomView;
        private ImageView mIconView;
        private Tab mTab;
        private TextView mTextView;
        final ScrollingTabContainerView this$0;

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(Tab.class.getName());
        }

        public boolean onLongClick(View view) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            Context context = getContext();
            int width = getWidth();
            int height = getHeight();
            int i = context.getResources().getDisplayMetrics().widthPixels;
            Toast makeText = Toast.makeText(context, this.mTab.getContentDescription(), 0);
            makeText.setGravity(49, (iArr[0] + (width / 2)) - (i / 2), height);
            makeText.show();
            return true;
        }

        public void setSelected(boolean z) {
            Object obj;
            if (isSelected() != z) {
                obj = 1;
            } else {
                obj = null;
            }
            super.setSelected(z);
            if (obj != null && z) {
                sendAccessibilityEvent(4);
            }
        }

        public TabView(ScrollingTabContainerView scrollingTabContainerView, Context context, Tab tab, boolean z) {
            this.this$0 = scrollingTabContainerView;
            super(context, null, R.attr.actionBarTabStyle);
            this.BG_ATTRS = new int[]{16842964};
            this.mTab = tab;
            TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, null, this.BG_ATTRS, R.attr.actionBarTabStyle, 0);
            if (obtainStyledAttributes.hasValue(0)) {
                setBackgroundDrawable(obtainStyledAttributes.getDrawable(0));
            }
            obtainStyledAttributes.recycle();
            if (z) {
                setGravity(8388627);
            }
            update();
        }

        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (this.this$0.mMaxTabWidth > 0 && getMeasuredWidth() > this.this$0.mMaxTabWidth) {
                super.onMeasure(MeasureSpec.makeMeasureSpec(this.this$0.mMaxTabWidth, 1073741824), i2);
            }
        }

        public void bindTab(Tab tab) {
            this.mTab = tab;
            update();
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void update() {
            /*
            r12 = this;
            r11 = 16;
            r10 = 8;
            r9 = -2;
            r1 = 0;
            r8 = 0;
            r2 = android.support.v7.widget.LinearLayoutCompat.a;
            r3 = r12.mTab;
            r4 = r3.getCustomView();
            if (r4 == 0) goto L_0x003c;
        L_0x0011:
            r0 = r4.getParent();
            if (r0 == r12) goto L_0x0021;
        L_0x0017:
            if (r0 == 0) goto L_0x001e;
        L_0x0019:
            r0 = (android.view.ViewGroup) r0;
            r0.removeView(r4);
        L_0x001e:
            r12.addView(r4);
        L_0x0021:
            r12.mCustomView = r4;
            r0 = r12.mTextView;
            if (r0 == 0) goto L_0x002c;
        L_0x0027:
            r0 = r12.mTextView;
            r0.setVisibility(r10);
        L_0x002c:
            r0 = r12.mIconView;
            if (r0 == 0) goto L_0x003a;
        L_0x0030:
            r0 = r12.mIconView;
            r0.setVisibility(r10);
            r0 = r12.mIconView;
            r0.setImageDrawable(r8);
        L_0x003a:
            if (r2 == 0) goto L_0x00f1;
        L_0x003c:
            r0 = r12.mCustomView;
            if (r0 == 0) goto L_0x0047;
        L_0x0040:
            r0 = r12.mCustomView;
            r12.removeView(r0);
            r12.mCustomView = r8;
        L_0x0047:
            r0 = r3.getIcon();
            r4 = r3.getText();
            if (r0 == 0) goto L_0x0079;
        L_0x0051:
            r5 = r12.mIconView;
            if (r5 != 0) goto L_0x006d;
        L_0x0055:
            r5 = new android.widget.ImageView;
            r6 = r12.getContext();
            r5.<init>(r6);
            r6 = new android.support.v7.widget.LinearLayoutCompat$LayoutParams;
            r6.<init>(r9, r9);
            r6.gravity = r11;
            r5.setLayoutParams(r6);
            r12.addView(r5, r1);
            r12.mIconView = r5;
        L_0x006d:
            r5 = r12.mIconView;
            r5.setImageDrawable(r0);
            r0 = r12.mIconView;
            r0.setVisibility(r1);
            if (r2 == 0) goto L_0x0087;
        L_0x0079:
            r0 = r12.mIconView;
            if (r0 == 0) goto L_0x0087;
        L_0x007d:
            r0 = r12.mIconView;
            r0.setVisibility(r10);
            r0 = r12.mIconView;
            r0.setImageDrawable(r8);
        L_0x0087:
            r0 = android.text.TextUtils.isEmpty(r4);
            if (r0 != 0) goto L_0x00f2;
        L_0x008d:
            r0 = 1;
        L_0x008e:
            if (r0 == 0) goto L_0x00bf;
        L_0x0090:
            r5 = r12.mTextView;
            if (r5 != 0) goto L_0x00b3;
        L_0x0094:
            r5 = new android.support.v7.widget.AppCompatTextView;
            r6 = r12.getContext();
            r7 = android.support.v7.appcompat.R.attr.actionBarTabTextStyle;
            r5.<init>(r6, r8, r7);
            r6 = android.text.TextUtils.TruncateAt.END;
            r5.setEllipsize(r6);
            r6 = new android.support.v7.widget.LinearLayoutCompat$LayoutParams;
            r6.<init>(r9, r9);
            r6.gravity = r11;
            r5.setLayoutParams(r6);
            r12.addView(r5);
            r12.mTextView = r5;
        L_0x00b3:
            r5 = r12.mTextView;
            r5.setText(r4);
            r4 = r12.mTextView;
            r4.setVisibility(r1);
            if (r2 == 0) goto L_0x00cd;
        L_0x00bf:
            r4 = r12.mTextView;
            if (r4 == 0) goto L_0x00cd;
        L_0x00c3:
            r4 = r12.mTextView;
            r4.setVisibility(r10);
            r4 = r12.mTextView;
            r4.setText(r8);
        L_0x00cd:
            r4 = r12.mIconView;
            if (r4 == 0) goto L_0x00da;
        L_0x00d1:
            r4 = r12.mIconView;
            r5 = r3.getContentDescription();
            r4.setContentDescription(r5);
        L_0x00da:
            if (r0 != 0) goto L_0x00eb;
        L_0x00dc:
            r0 = r3.getContentDescription();
            r0 = android.text.TextUtils.isEmpty(r0);
            if (r0 != 0) goto L_0x00eb;
        L_0x00e6:
            r12.setOnLongClickListener(r12);
            if (r2 == 0) goto L_0x00f1;
        L_0x00eb:
            r12.setOnLongClickListener(r8);
            r12.setLongClickable(r1);
        L_0x00f1:
            return;
        L_0x00f2:
            r0 = r1;
            goto L_0x008e;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ScrollingTabContainerView.TabView.update():void");
        }

        public Tab getTab() {
            return this.mTab;
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            if (VERSION.SDK_INT >= 14) {
                accessibilityNodeInfo.setClassName(Tab.class.getName());
            }
        }
    }

    public class VisibilityAnimListener implements ViewPropertyAnimatorListener {
        private boolean mCanceled;
        private int mFinalVisibility;
        final ScrollingTabContainerView this$0;

        public void onAnimationStart(View view) {
            this.this$0.setVisibility(0);
            this.mCanceled = false;
        }

        public void onAnimationEnd(View view) {
            if (!this.mCanceled) {
                this.this$0.mVisibilityAnim = null;
                this.this$0.setVisibility(this.mFinalVisibility);
            }
        }

        protected VisibilityAnimListener(ScrollingTabContainerView scrollingTabContainerView) {
            this.this$0 = scrollingTabContainerView;
            this.mCanceled = false;
        }

        public void onAnimationCancel(View view) {
            this.mCanceled = true;
        }
    }

    public void setContentHeight(int i) {
        this.mContentHeight = i;
        requestLayout();
    }

    public void onNothingSelected(AdapterView adapterView) {
    }

    public void animateToTab(int i) {
        View childAt = this.mTabLayout.getChildAt(i);
        if (this.mTabSelector != null) {
            removeCallbacks(this.mTabSelector);
        }
        this.mTabSelector = new 1(this, childAt);
        post(this.mTabSelector);
    }

    public void setAllowCollapse(boolean z) {
        this.mAllowCollapse = z;
    }

    private void performCollapse() {
        if (!isCollapsed()) {
            if (this.mTabSpinner == null) {
                this.mTabSpinner = createSpinner();
            }
            removeView(this.mTabLayout);
            addView(this.mTabSpinner, new LayoutParams(-2, -1));
            if (this.mTabSpinner.getAdapter() == null) {
                this.mTabSpinner.setAdapter(new TabAdapter(this, null));
            }
            if (this.mTabSelector != null) {
                removeCallbacks(this.mTabSelector);
                this.mTabSelector = null;
            }
            this.mTabSpinner.setSelection(this.mSelectedTabIndex);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.support.v7.widget.ScrollingTabContainerView.TabView createTabView(android.support.v7.app.ActionBar.Tab r6, boolean r7) {
        /*
        r5 = this;
        r4 = 0;
        r0 = new android.support.v7.widget.ScrollingTabContainerView$TabView;
        r1 = r5.getContext();
        r0.<init>(r5, r1, r6, r7);
        if (r7 == 0) goto L_0x001e;
    L_0x000c:
        r0.setBackgroundDrawable(r4);
        r1 = new android.widget.AbsListView$LayoutParams;
        r2 = -1;
        r3 = r5.mContentHeight;
        r1.<init>(r2, r3);
        r0.setLayoutParams(r1);
        r1 = android.support.v7.widget.LinearLayoutCompat.a;
        if (r1 == 0) goto L_0x0032;
    L_0x001e:
        r1 = 1;
        r0.setFocusable(r1);
        r1 = r5.mTabClickListener;
        if (r1 != 0) goto L_0x002d;
    L_0x0026:
        r1 = new android.support.v7.widget.ScrollingTabContainerView$TabClickListener;
        r1.<init>(r5, r4);
        r5.mTabClickListener = r1;
    L_0x002d:
        r1 = r5.mTabClickListener;
        r0.setOnClickListener(r1);
    L_0x0032:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ScrollingTabContainerView.createTabView(android.support.v7.app.ActionBar$Tab, boolean):android.support.v7.widget.ScrollingTabContainerView$TabView");
    }

    public ScrollingTabContainerView(Context context) {
        super(context);
        this.mVisAnimListener = new VisibilityAnimListener(this);
        setHorizontalScrollBarEnabled(false);
        ActionBarPolicy actionBarPolicy = ActionBarPolicy.get(context);
        setContentHeight(actionBarPolicy.getTabContainerHeight());
        this.mStackedTabMaxWidth = actionBarPolicy.getStackedTabMaxWidth();
        this.mTabLayout = createTabLayout();
        addView(this.mTabLayout, new LayoutParams(-2, -1));
    }

    private boolean performExpand() {
        if (isCollapsed()) {
            removeView(this.mTabSpinner);
            addView(this.mTabLayout, new LayoutParams(-2, -1));
            setTabSelected(this.mTabSpinner.getSelectedItemPosition());
        }
        return false;
    }

    public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        ((TabView) view).getTab().select();
    }

    static LinearLayoutCompat access$200(ScrollingTabContainerView scrollingTabContainerView) {
        return scrollingTabContainerView.mTabLayout;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r9, int r10) {
        /*
        r8 = this;
        r7 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r1 = 1;
        r2 = 0;
        r3 = android.support.v7.widget.LinearLayoutCompat.a;
        r4 = android.view.View.MeasureSpec.getMode(r9);
        if (r4 != r7) goto L_0x0087;
    L_0x000c:
        r0 = r1;
    L_0x000d:
        r8.setFillViewport(r0);
        r5 = r8.mTabLayout;
        r5 = r5.getChildCount();
        if (r5 <= r1) goto L_0x0043;
    L_0x0018:
        if (r4 == r7) goto L_0x001e;
    L_0x001a:
        r6 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r4 != r6) goto L_0x0043;
    L_0x001e:
        r4 = 2;
        if (r5 <= r4) goto L_0x002f;
    L_0x0021:
        r4 = android.view.View.MeasureSpec.getSize(r9);
        r4 = (float) r4;
        r5 = 1053609165; // 0x3ecccccd float:0.4 double:5.205520926E-315;
        r4 = r4 * r5;
        r4 = (int) r4;
        r8.mMaxTabWidth = r4;
        if (r3 == 0) goto L_0x0037;
    L_0x002f:
        r4 = android.view.View.MeasureSpec.getSize(r9);
        r4 = r4 / 2;
        r8.mMaxTabWidth = r4;
    L_0x0037:
        r4 = r8.mMaxTabWidth;
        r5 = r8.mStackedTabMaxWidth;
        r4 = java.lang.Math.min(r4, r5);
        r8.mMaxTabWidth = r4;
        if (r3 == 0) goto L_0x0046;
    L_0x0043:
        r4 = -1;
        r8.mMaxTabWidth = r4;
    L_0x0046:
        r4 = r8.mContentHeight;
        r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r7);
        if (r0 != 0) goto L_0x0089;
    L_0x004e:
        r5 = r8.mAllowCollapse;
        if (r5 == 0) goto L_0x0089;
    L_0x0052:
        if (r1 == 0) goto L_0x006f;
    L_0x0054:
        r1 = r8.mTabLayout;
        r1.measure(r2, r4);
        r1 = r8.mTabLayout;
        r1 = r1.getMeasuredWidth();
        r2 = android.view.View.MeasureSpec.getSize(r9);
        if (r1 <= r2) goto L_0x006a;
    L_0x0065:
        r8.performCollapse();
        if (r3 == 0) goto L_0x0072;
    L_0x006a:
        r8.performExpand();
        if (r3 == 0) goto L_0x0072;
    L_0x006f:
        r8.performExpand();
    L_0x0072:
        r1 = r8.getMeasuredWidth();
        super.onMeasure(r9, r4);
        r2 = r8.getMeasuredWidth();
        if (r0 == 0) goto L_0x0086;
    L_0x007f:
        if (r1 == r2) goto L_0x0086;
    L_0x0081:
        r0 = r8.mSelectedTabIndex;
        r8.setTabSelected(r0);
    L_0x0086:
        return;
    L_0x0087:
        r0 = r2;
        goto L_0x000d;
    L_0x0089:
        r1 = r2;
        goto L_0x0052;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ScrollingTabContainerView.onMeasure(int, int):void");
    }

    private boolean isCollapsed() {
        return this.mTabSpinner != null && this.mTabSpinner.getParent() == this;
    }

    static {
        sAlphaInterpolator = new DecelerateInterpolator();
    }

    static TabView access$300(ScrollingTabContainerView scrollingTabContainerView, Tab tab, boolean z) {
        return scrollingTabContainerView.createTabView(tab, z);
    }

    private LinearLayoutCompat createTabLayout() {
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), null, R.attr.actionBarTabBarStyle);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        return linearLayoutCompat;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mTabSelector != null) {
            post(this.mTabSelector);
        }
    }

    public void setTabSelected(int i) {
        boolean z = LinearLayoutCompat.a;
        this.mSelectedTabIndex = i;
        int childCount = this.mTabLayout.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            boolean z2;
            View childAt = this.mTabLayout.getChildAt(i2);
            if (i2 == i) {
                z2 = true;
            } else {
                z2 = false;
            }
            childAt.setSelected(z2);
            if (z2) {
                animateToTab(i);
            }
            int i3 = i2 + 1;
            if (z) {
                break;
            }
            i2 = i3;
        }
        if (this.mTabSpinner != null && i >= 0) {
            this.mTabSpinner.setSelection(i);
        }
    }

    private Spinner createSpinner() {
        Spinner appCompatSpinner = new AppCompatSpinner(getContext(), null, R.attr.actionDropDownStyle);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mTabSelector != null) {
            removeCallbacks(this.mTabSelector);
        }
    }

    protected void onConfigurationChanged(Configuration configuration) {
        if (VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        ActionBarPolicy actionBarPolicy = ActionBarPolicy.get(getContext());
        setContentHeight(actionBarPolicy.getTabContainerHeight());
        this.mStackedTabMaxWidth = actionBarPolicy.getStackedTabMaxWidth();
    }
}
