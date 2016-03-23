package android.support.design.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.R;
import android.support.design.widget.CoordinatorLayout.Behavior;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.widget.TintManager;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import org.v;
import org.whispersystems.at;

public class TabLayout extends HorizontalScrollView {
    private static final String[] z;
    private int mContentInsetStart;
    private ValueAnimatorCompat mIndicatorAnimator;
    private int mMode;
    private OnTabSelectedListener mOnTabSelectedListener;
    private final int mRequestedTabMaxWidth;
    private final int mRequestedTabMinWidth;
    private ValueAnimatorCompat mScrollAnimator;
    private final int mScrollableTabMinWidth;
    private Tab mSelectedTab;
    private final int mTabBackgroundResId;
    private OnClickListener mTabClickListener;
    private int mTabGravity;
    private int mTabMaxWidth;
    private int mTabPaddingBottom;
    private int mTabPaddingEnd;
    private int mTabPaddingStart;
    private int mTabPaddingTop;
    private final SlidingTabStrip mTabStrip;
    private int mTabTextAppearance;
    private ColorStateList mTabTextColors;
    private float mTabTextMultiLineSize;
    private float mTabTextSize;
    private final ArrayList mTabs;

    class 1 implements OnClickListener {
        final TabLayout this$0;

        public void onClick(View view) {
            ((TabView) view).getTab().select();
        }

        1(TabLayout tabLayout) {
            this.this$0 = tabLayout;
        }
    }

    class 2 implements AnimatorUpdateListener {
        final TabLayout this$0;

        public void onAnimationUpdate(ValueAnimatorCompat valueAnimatorCompat) {
            this.this$0.scrollTo(valueAnimatorCompat.getAnimatedIntValue(), 0);
        }

        2(TabLayout tabLayout) {
            this.this$0 = tabLayout;
        }
    }

    public interface OnTabSelectedListener {
        void onTabReselected(Tab tab);

        void onTabSelected(Tab tab);

        void onTabUnselected(Tab tab);
    }

    class SlidingTabStrip extends LinearLayout {
        private ValueAnimatorCompat mCurrentAnimator;
        private int mIndicatorLeft;
        private int mIndicatorRight;
        private int mSelectedIndicatorHeight;
        private final Paint mSelectedIndicatorPaint;
        private int mSelectedPosition;
        private float mSelectionOffset;
        final TabLayout this$0;

        class 1 implements AnimatorUpdateListener {
            final SlidingTabStrip this$1;
            final int val$startLeft;
            final int val$startRight;
            final int val$targetLeft;
            final int val$targetRight;

            1(SlidingTabStrip slidingTabStrip, int i, int i2, int i3, int i4) {
                this.this$1 = slidingTabStrip;
                this.val$startLeft = i;
                this.val$targetLeft = i2;
                this.val$startRight = i3;
                this.val$targetRight = i4;
            }

            public void onAnimationUpdate(ValueAnimatorCompat valueAnimatorCompat) {
                float animatedFraction = valueAnimatorCompat.getAnimatedFraction();
                SlidingTabStrip.access$1900(this.this$1, AnimationUtils.lerp(this.val$startLeft, this.val$targetLeft, animatedFraction), AnimationUtils.lerp(this.val$startRight, this.val$targetRight, animatedFraction));
            }
        }

        class 2 extends AnimatorListenerAdapter {
            final SlidingTabStrip this$1;
            final int val$position;

            2(SlidingTabStrip slidingTabStrip, int i) {
                this.this$1 = slidingTabStrip;
                this.val$position = i;
            }

            public void onAnimationEnd(ValueAnimatorCompat valueAnimatorCompat) {
                SlidingTabStrip.access$2002(this.this$1, this.val$position);
                SlidingTabStrip.access$2102(this.this$1, 0.0f);
            }

            public void onAnimationCancel(ValueAnimatorCompat valueAnimatorCompat) {
                SlidingTabStrip.access$2002(this.this$1, this.val$position);
                SlidingTabStrip.access$2102(this.this$1, 0.0f);
            }
        }

        public void draw(Canvas canvas) {
            super.draw(canvas);
            if (this.mIndicatorLeft >= 0 && this.mIndicatorRight > this.mIndicatorLeft) {
                canvas.drawRect((float) this.mIndicatorLeft, (float) (getHeight() - this.mSelectedIndicatorHeight), (float) this.mIndicatorRight, (float) getHeight(), this.mSelectedIndicatorPaint);
            }
        }

        void setSelectedIndicatorColor(int i) {
            if (this.mSelectedIndicatorPaint.getColor() != i) {
                this.mSelectedIndicatorPaint.setColor(i);
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        static int access$2002(SlidingTabStrip slidingTabStrip, int i) {
            slidingTabStrip.mSelectedPosition = i;
            return i;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        protected void onMeasure(int r11, int r12) {
            /*
            r10 = this;
            r9 = 0;
            r1 = 1;
            r4 = 0;
            r6 = android.support.design.widget.CoordinatorLayout.a;
            super.onMeasure(r11, r12);
            r0 = android.view.View.MeasureSpec.getMode(r11);
            r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
            if (r0 == r2) goto L_0x0011;
        L_0x0010:
            return;
        L_0x0011:
            r0 = r10.this$0;
            r0 = android.support.design.widget.TabLayout.access$1200(r0);
            if (r0 != r1) goto L_0x0010;
        L_0x0019:
            r0 = r10.this$0;
            r0 = android.support.design.widget.TabLayout.access$1600(r0);
            if (r0 != r1) goto L_0x0010;
        L_0x0021:
            r7 = r10.getChildCount();
            r2 = r4;
            r0 = r4;
        L_0x0027:
            if (r2 >= r7) goto L_0x003f;
        L_0x0029:
            r3 = r10.getChildAt(r2);
            r5 = r3.getVisibility();
            if (r5 != 0) goto L_0x003b;
        L_0x0033:
            r3 = r3.getMeasuredWidth();
            r0 = java.lang.Math.max(r0, r3);
        L_0x003b:
            r2 = r2 + 1;
            if (r6 == 0) goto L_0x0027;
        L_0x003f:
            r5 = r0;
            if (r5 <= 0) goto L_0x0010;
        L_0x0042:
            r0 = r10.this$0;
            r2 = 16;
            r0 = android.support.design.widget.TabLayout.access$1500(r0, r2);
            r2 = r5 * r7;
            r3 = r10.getMeasuredWidth();
            r0 = r0 * 2;
            r0 = r3 - r0;
            if (r2 > r0) goto L_0x0079;
        L_0x0056:
            r3 = r4;
            r2 = r4;
        L_0x0058:
            if (r3 >= r7) goto L_0x008f;
        L_0x005a:
            r0 = r10.getChildAt(r3);
            r0 = r0.getLayoutParams();
            r0 = (android.widget.LinearLayout.LayoutParams) r0;
            r8 = r0.width;
            if (r8 != r5) goto L_0x006e;
        L_0x0068:
            r8 = r0.weight;
            r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1));
            if (r8 == 0) goto L_0x008d;
        L_0x006e:
            r0.width = r5;
            r0.weight = r9;
            r0 = r1;
        L_0x0073:
            r2 = r3 + 1;
            if (r6 == 0) goto L_0x008a;
        L_0x0077:
            if (r6 == 0) goto L_0x0084;
        L_0x0079:
            r0 = r10.this$0;
            android.support.design.widget.TabLayout.access$1602(r0, r4);
            r0 = r10.this$0;
            android.support.design.widget.TabLayout.access$1700(r0, r4);
            r0 = r1;
        L_0x0084:
            if (r0 == 0) goto L_0x0010;
        L_0x0086:
            super.onMeasure(r11, r12);
            goto L_0x0010;
        L_0x008a:
            r3 = r2;
            r2 = r0;
            goto L_0x0058;
        L_0x008d:
            r0 = r2;
            goto L_0x0073;
        L_0x008f:
            r0 = r2;
            goto L_0x0077;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.TabLayout.SlidingTabStrip.onMeasure(int, int):void");
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void updateIndicatorPosition() {
            /*
            r6 = this;
            r5 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
            r0 = r6.mSelectedPosition;
            r0 = r6.getChildAt(r0);
            if (r0 == 0) goto L_0x0055;
        L_0x000a:
            r1 = r0.getWidth();
            if (r1 <= 0) goto L_0x0055;
        L_0x0010:
            r1 = r0.getLeft();
            r0 = r0.getRight();
            r2 = r6.mSelectionOffset;
            r3 = 0;
            r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1));
            if (r2 <= 0) goto L_0x0057;
        L_0x001f:
            r2 = r6.mSelectedPosition;
            r3 = r6.getChildCount();
            r3 = r3 + -1;
            if (r2 >= r3) goto L_0x0057;
        L_0x0029:
            r2 = r6.mSelectedPosition;
            r2 = r2 + 1;
            r2 = r6.getChildAt(r2);
            r3 = r6.mSelectionOffset;
            r4 = r2.getLeft();
            r4 = (float) r4;
            r3 = r3 * r4;
            r4 = r6.mSelectionOffset;
            r4 = r5 - r4;
            r1 = (float) r1;
            r1 = r1 * r4;
            r1 = r1 + r3;
            r1 = (int) r1;
            r3 = r6.mSelectionOffset;
            r2 = r2.getRight();
            r2 = (float) r2;
            r2 = r2 * r3;
            r3 = r6.mSelectionOffset;
            r3 = r5 - r3;
            r0 = (float) r0;
            r0 = r0 * r3;
            r0 = r0 + r2;
            r0 = (int) r0;
            r2 = android.support.design.widget.CoordinatorLayout.a;
            if (r2 == 0) goto L_0x0057;
        L_0x0055:
            r0 = -1;
            r1 = r0;
        L_0x0057:
            r6.setIndicatorPosition(r1, r0);
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.TabLayout.SlidingTabStrip.updateIndicatorPosition():void");
        }

        private void setIndicatorPosition(int i, int i2) {
            if (i != this.mIndicatorLeft || i2 != this.mIndicatorRight) {
                this.mIndicatorLeft = i;
                this.mIndicatorRight = i2;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        SlidingTabStrip(TabLayout tabLayout, Context context) {
            this.this$0 = tabLayout;
            super(context);
            this.mSelectedPosition = -1;
            this.mIndicatorLeft = -1;
            this.mIndicatorRight = -1;
            setWillNotDraw(false);
            this.mSelectedIndicatorPaint = new Paint();
        }

        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (this.mCurrentAnimator != null && this.mCurrentAnimator.isRunning()) {
                this.mCurrentAnimator.cancel();
                animateIndicatorToPosition(this.mSelectedPosition, Math.round(((float) this.mCurrentAnimator.getDuration()) * (1.0f - this.mCurrentAnimator.getAnimatedFraction())));
                if (!CoordinatorLayout.a) {
                    return;
                }
            }
            updateIndicatorPosition();
        }

        static void access$1900(SlidingTabStrip slidingTabStrip, int i, int i2) {
            slidingTabStrip.setIndicatorPosition(i, i2);
        }

        boolean childrenNeedLayout() {
            boolean z = CoordinatorLayout.a;
            int childCount = getChildCount();
            int i = 0;
            while (i < childCount) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
                i++;
                if (z) {
                    return false;
                }
            }
            return false;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        void animateIndicatorToPosition(int r8, int r9) {
            /*
            r7 = this;
            r1 = 1;
            r6 = android.support.design.widget.CoordinatorLayout.a;
            r0 = android.support.v4.view.ViewCompat.getLayoutDirection(r7);
            if (r0 != r1) goto L_0x0078;
        L_0x0009:
            r0 = r1;
        L_0x000a:
            r2 = r7.getChildAt(r8);
            r3 = r2.getLeft();
            r5 = r2.getRight();
            r2 = r7.mSelectedPosition;
            r2 = r8 - r2;
            r2 = java.lang.Math.abs(r2);
            if (r2 > r1) goto L_0x0026;
        L_0x0020:
            r2 = r7.mIndicatorLeft;
            r4 = r7.mIndicatorRight;
            if (r6 == 0) goto L_0x0045;
        L_0x0026:
            r1 = r7.this$0;
            r2 = 24;
            r1 = android.support.design.widget.TabLayout.access$1500(r1, r2);
            r2 = r7.mSelectedPosition;
            if (r8 >= r2) goto L_0x003c;
        L_0x0032:
            if (r0 == 0) goto L_0x0038;
        L_0x0034:
            r4 = r3 - r1;
            if (r6 == 0) goto L_0x007a;
        L_0x0038:
            r4 = r5 + r1;
            if (r6 == 0) goto L_0x007a;
        L_0x003c:
            if (r0 == 0) goto L_0x0042;
        L_0x003e:
            r4 = r5 + r1;
            if (r6 == 0) goto L_0x007a;
        L_0x0042:
            r4 = r3 - r1;
            r2 = r4;
        L_0x0045:
            if (r2 != r3) goto L_0x0049;
        L_0x0047:
            if (r4 == r5) goto L_0x0077;
        L_0x0049:
            r0 = r7.this$0;
            r1 = android.support.design.widget.ViewUtils.createAnimator();
            r6 = android.support.design.widget.TabLayout.access$1802(r0, r1);
            r0 = android.support.design.widget.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
            r6.setInterpolator(r0);
            r6.setDuration(r9);
            r0 = 0;
            r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
            r6.setFloatValues(r0, r1);
            r0 = new android.support.design.widget.TabLayout$SlidingTabStrip$1;
            r1 = r7;
            r0.<init>(r1, r2, r3, r4, r5);
            r6.setUpdateListener(r0);
            r0 = new android.support.design.widget.TabLayout$SlidingTabStrip$2;
            r0.<init>(r7, r8);
            r6.setListener(r0);
            r6.start();
            r7.mCurrentAnimator = r6;
        L_0x0077:
            return;
        L_0x0078:
            r0 = 0;
            goto L_0x000a;
        L_0x007a:
            r2 = r4;
            goto L_0x0045;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.TabLayout.SlidingTabStrip.animateIndicatorToPosition(int, int):void");
        }

        static float access$2102(SlidingTabStrip slidingTabStrip, float f) {
            slidingTabStrip.mSelectionOffset = f;
            return f;
        }

        void setSelectedIndicatorHeight(int i) {
            if (this.mSelectedIndicatorHeight != i) {
                this.mSelectedIndicatorHeight = i;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        void setIndicatorPositionFromTabPosition(int i, float f) {
            this.mSelectedPosition = i;
            this.mSelectionOffset = f;
            updateIndicatorPosition();
        }
    }

    public final class Tab {
        private CharSequence mContentDesc;
        private View mCustomView;
        private Drawable mIcon;
        private final TabLayout mParent;
        private int mPosition;
        private CharSequence mText;

        @Nullable
        public Drawable getIcon() {
            return this.mIcon;
        }

        @Nullable
        public View getCustomView() {
            return this.mCustomView;
        }

        Tab(TabLayout tabLayout) {
            this.mPosition = -1;
            this.mParent = tabLayout;
        }

        @Nullable
        public CharSequence getContentDescription() {
            return this.mContentDesc;
        }

        public void select() {
            this.mParent.selectTab(this);
        }

        void setPosition(int i) {
            this.mPosition = i;
        }

        @Nullable
        public CharSequence getText() {
            return this.mText;
        }

        static TabLayout access$000(Tab tab) {
            return tab.mParent;
        }

        public int getPosition() {
            return this.mPosition;
        }

        @NonNull
        public Tab setText(@Nullable CharSequence charSequence) {
            this.mText = charSequence;
            if (this.mPosition >= 0) {
                TabLayout.access$100(this.mParent, this.mPosition);
            }
            return this;
        }
    }

    public class TabLayoutOnPageChangeListener implements OnPageChangeListener {
        private int mPreviousScrollState;
        private int mScrollState;
        private final WeakReference mTabLayoutRef;

        public TabLayoutOnPageChangeListener(TabLayout tabLayout) {
            this.mTabLayoutRef = new WeakReference(tabLayout);
        }

        public void onPageSelected(int i) {
            TabLayout tabLayout = (TabLayout) this.mTabLayoutRef.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i) {
                tabLayout.selectTab(tabLayout.getTabAt(i), this.mScrollState == 0);
            }
        }

        public void onPageScrolled(int i, float f, int i2) {
            boolean z = true;
            TabLayout tabLayout = (TabLayout) this.mTabLayoutRef.get();
            if (tabLayout != null) {
                if (!(this.mScrollState == 1 || (this.mScrollState == 2 && this.mPreviousScrollState == 1))) {
                    z = false;
                }
                tabLayout.setScrollPosition(i, f, z);
            }
        }

        public void onPageScrollStateChanged(int i) {
            this.mPreviousScrollState = this.mScrollState;
            this.mScrollState = i;
        }
    }

    class TabView extends LinearLayout implements OnLongClickListener {
        private ImageView mCustomIconView;
        private TextView mCustomTextView;
        private View mCustomView;
        private int mDefaultMaxLines;
        private ImageView mIconView;
        private final Tab mTab;
        private TextView mTextView;
        final TabLayout this$0;

        public Tab getTab() {
            return this.mTab;
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

        private float approximateLineWidth(Layout layout, int i, float f) {
            return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }

        @TargetApi(14)
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(android.support.v7.app.ActionBar.Tab.class.getName());
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
                if (this.mTextView != null) {
                    this.mTextView.setSelected(z);
                }
                if (this.mIconView != null) {
                    this.mIconView.setSelected(z);
                }
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void updateTextAndIcon(android.support.design.widget.TabLayout.Tab r8, android.widget.TextView r9, android.widget.ImageView r10) {
            /*
            r7 = this;
            r6 = 0;
            r5 = 8;
            r2 = 0;
            r4 = android.support.design.widget.CoordinatorLayout.a;
            r0 = r8.getIcon();
            r1 = r8.getText();
            if (r10 == 0) goto L_0x002a;
        L_0x0010:
            if (r0 == 0) goto L_0x001d;
        L_0x0012:
            r10.setImageDrawable(r0);
            r10.setVisibility(r2);
            r7.setVisibility(r2);
            if (r4 == 0) goto L_0x0023;
        L_0x001d:
            r10.setVisibility(r5);
            r10.setImageDrawable(r6);
        L_0x0023:
            r0 = r8.getContentDescription();
            r10.setContentDescription(r0);
        L_0x002a:
            r0 = android.text.TextUtils.isEmpty(r1);
            if (r0 != 0) goto L_0x0085;
        L_0x0030:
            r0 = 1;
            r3 = r0;
        L_0x0032:
            if (r9 == 0) goto L_0x004e;
        L_0x0034:
            if (r3 == 0) goto L_0x0048;
        L_0x0036:
            r9.setText(r1);
            r0 = r8.getContentDescription();
            r9.setContentDescription(r0);
            r9.setVisibility(r2);
            r7.setVisibility(r2);
            if (r4 == 0) goto L_0x004e;
        L_0x0048:
            r9.setVisibility(r5);
            r9.setText(r6);
        L_0x004e:
            if (r10 == 0) goto L_0x006d;
        L_0x0050:
            r0 = r10.getLayoutParams();
            r0 = (android.view.ViewGroup.MarginLayoutParams) r0;
            if (r3 == 0) goto L_0x0087;
        L_0x0058:
            r1 = r10.getVisibility();
            if (r1 != 0) goto L_0x0087;
        L_0x005e:
            r1 = r7.this$0;
            r1 = android.support.design.widget.TabLayout.access$1500(r1, r5);
        L_0x0064:
            r5 = r0.bottomMargin;
            if (r1 == r5) goto L_0x006d;
        L_0x0068:
            r0.bottomMargin = r1;
            r10.requestLayout();
        L_0x006d:
            if (r3 != 0) goto L_0x007e;
        L_0x006f:
            r0 = r8.getContentDescription();
            r0 = android.text.TextUtils.isEmpty(r0);
            if (r0 != 0) goto L_0x007e;
        L_0x0079:
            r7.setOnLongClickListener(r7);
            if (r4 == 0) goto L_0x0084;
        L_0x007e:
            r7.setOnLongClickListener(r6);
            r7.setLongClickable(r2);
        L_0x0084:
            return;
        L_0x0085:
            r3 = r2;
            goto L_0x0032;
        L_0x0087:
            r1 = r2;
            goto L_0x0064;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.TabLayout.TabView.updateTextAndIcon(android.support.design.widget.TabLayout$Tab, android.widget.TextView, android.widget.ImageView):void");
        }

        public TabView(TabLayout tabLayout, Context context, Tab tab) {
            this.this$0 = tabLayout;
            super(context);
            this.mDefaultMaxLines = 2;
            this.mTab = tab;
            if (TabLayout.access$300(tabLayout) != 0) {
                setBackgroundDrawable(TintManager.getDrawable(context, TabLayout.access$300(tabLayout)));
            }
            ViewCompat.setPaddingRelative(this, TabLayout.access$400(tabLayout), TabLayout.access$500(tabLayout), TabLayout.access$600(tabLayout), TabLayout.access$700(tabLayout));
            setGravity(17);
            setOrientation(1);
            update();
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        final void update() {
            /*
            r7 = this;
            r6 = 8;
            r5 = 0;
            r4 = 0;
            r1 = android.support.design.widget.CoordinatorLayout.a;
            r2 = r7.mTab;
            r3 = r2.getCustomView();
            if (r3 == 0) goto L_0x005b;
        L_0x000e:
            r0 = r3.getParent();
            if (r0 == r7) goto L_0x001e;
        L_0x0014:
            if (r0 == 0) goto L_0x001b;
        L_0x0016:
            r0 = (android.view.ViewGroup) r0;
            r0.removeView(r3);
        L_0x001b:
            r7.addView(r3);
        L_0x001e:
            r7.mCustomView = r3;
            r0 = r7.mTextView;
            if (r0 == 0) goto L_0x0029;
        L_0x0024:
            r0 = r7.mTextView;
            r0.setVisibility(r6);
        L_0x0029:
            r0 = r7.mIconView;
            if (r0 == 0) goto L_0x0037;
        L_0x002d:
            r0 = r7.mIconView;
            r0.setVisibility(r6);
            r0 = r7.mIconView;
            r0.setImageDrawable(r4);
        L_0x0037:
            r0 = 16908308; // 0x1020014 float:2.3877285E-38 double:8.353814E-317;
            r0 = r3.findViewById(r0);
            r0 = (android.widget.TextView) r0;
            r7.mCustomTextView = r0;
            r0 = r7.mCustomTextView;
            if (r0 == 0) goto L_0x004e;
        L_0x0046:
            r0 = r7.mCustomTextView;
            r0 = android.support.v4.widget.TextViewCompat.getMaxLines(r0);
            r7.mDefaultMaxLines = r0;
        L_0x004e:
            r0 = 16908294; // 0x1020006 float:2.3877246E-38 double:8.353807E-317;
            r0 = r3.findViewById(r0);
            r0 = (android.widget.ImageView) r0;
            r7.mCustomIconView = r0;
            if (r1 == 0) goto L_0x006a;
        L_0x005b:
            r0 = r7.mCustomView;
            if (r0 == 0) goto L_0x0066;
        L_0x005f:
            r0 = r7.mCustomView;
            r7.removeView(r0);
            r7.mCustomView = r4;
        L_0x0066:
            r7.mCustomTextView = r4;
            r7.mCustomIconView = r4;
        L_0x006a:
            r0 = r7.mCustomView;
            if (r0 != 0) goto L_0x00d3;
        L_0x006e:
            r0 = r7.mIconView;
            if (r0 != 0) goto L_0x0087;
        L_0x0072:
            r0 = r7.getContext();
            r0 = android.view.LayoutInflater.from(r0);
            r3 = android.support.design.R.layout.design_layout_tab_icon;
            r0 = r0.inflate(r3, r7, r5);
            r0 = (android.widget.ImageView) r0;
            r7.addView(r0, r5);
            r7.mIconView = r0;
        L_0x0087:
            r0 = r7.mTextView;
            if (r0 != 0) goto L_0x00a8;
        L_0x008b:
            r0 = r7.getContext();
            r0 = android.view.LayoutInflater.from(r0);
            r3 = android.support.design.R.layout.design_layout_tab_text;
            r0 = r0.inflate(r3, r7, r5);
            r0 = (android.widget.TextView) r0;
            r7.addView(r0);
            r7.mTextView = r0;
            r0 = r7.mTextView;
            r0 = android.support.v4.widget.TextViewCompat.getMaxLines(r0);
            r7.mDefaultMaxLines = r0;
        L_0x00a8:
            r0 = r7.mTextView;
            r3 = r7.getContext();
            r4 = r7.this$0;
            r4 = android.support.design.widget.TabLayout.access$1300(r4);
            r0.setTextAppearance(r3, r4);
            r0 = r7.this$0;
            r0 = android.support.design.widget.TabLayout.access$1400(r0);
            if (r0 == 0) goto L_0x00ca;
        L_0x00bf:
            r0 = r7.mTextView;
            r3 = r7.this$0;
            r3 = android.support.design.widget.TabLayout.access$1400(r3);
            r0.setTextColor(r3);
        L_0x00ca:
            r0 = r7.mTextView;
            r3 = r7.mIconView;
            r7.updateTextAndIcon(r2, r0, r3);
            if (r1 == 0) goto L_0x00e2;
        L_0x00d3:
            r0 = r7.mCustomTextView;
            if (r0 != 0) goto L_0x00db;
        L_0x00d7:
            r0 = r7.mCustomIconView;
            if (r0 == 0) goto L_0x00e2;
        L_0x00db:
            r0 = r7.mCustomTextView;
            r1 = r7.mCustomIconView;
            r7.updateTextAndIcon(r2, r0, r1);
        L_0x00e2:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.TabLayout.TabView.update():void");
        }

        public void onMeasure(int i, int i2) {
            int i3 = 1;
            boolean z = CoordinatorLayout.a;
            int size = MeasureSpec.getSize(i);
            int mode = MeasureSpec.getMode(i);
            int access$800 = TabLayout.access$800(this.this$0);
            if (access$800 > 0 && (mode == 0 || size > access$800)) {
                size = MeasureSpec.makeMeasureSpec(TabLayout.access$900(this.this$0), mode);
                if (!z) {
                    i = size;
                }
            }
            super.onMeasure(i, i2);
            if (this.mTextView != null) {
                float textSize;
                int maxLines;
                Layout layout;
                getResources();
                float access$1000 = TabLayout.access$1000(this.this$0);
                size = this.mDefaultMaxLines;
                if (this.mIconView != null && this.mIconView.getVisibility() == 0) {
                    if (z) {
                        size = 1;
                    } else {
                        size = 1;
                        textSize = this.mTextView.getTextSize();
                        access$800 = this.mTextView.getLineCount();
                        maxLines = TextViewCompat.getMaxLines(this.mTextView);
                        if (access$1000 == textSize || (maxLines >= 0 && size != maxLines)) {
                            if (TabLayout.access$1200(this.this$0) == 1 && access$1000 > textSize && access$800 == 1) {
                                layout = this.mTextView.getLayout();
                                if (layout == null || approximateLineWidth(layout, 0, access$1000) > ((float) layout.getWidth())) {
                                    i3 = 0;
                                }
                            }
                            if (i3 != 0) {
                                this.mTextView.setTextSize(0, access$1000);
                                this.mTextView.setMaxLines(size);
                                super.onMeasure(i, i2);
                            }
                        }
                        return;
                    }
                }
                if (this.mTextView != null && this.mTextView.getLineCount() > 1) {
                    access$1000 = TabLayout.access$1100(this.this$0);
                }
                textSize = this.mTextView.getTextSize();
                access$800 = this.mTextView.getLineCount();
                maxLines = TextViewCompat.getMaxLines(this.mTextView);
                if (access$1000 == textSize) {
                }
                layout = this.mTextView.getLayout();
                i3 = 0;
                if (i3 != 0) {
                    this.mTextView.setTextSize(0, access$1000);
                    this.mTextView.setMaxLines(size);
                    super.onMeasure(i, i2);
                }
            }
        }

        @TargetApi(14)
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(android.support.v7.app.ActionBar.Tab.class.getName());
        }
    }

    public class ViewPagerOnTabSelectedListener implements OnTabSelectedListener {
        private final ViewPager mViewPager;

        public void onTabUnselected(Tab tab) {
        }

        public void onTabReselected(Tab tab) {
        }

        public void onTabSelected(Tab tab) {
            this.mViewPager.setCurrentItem(tab.getPosition());
        }

        public ViewPagerOnTabSelectedListener(ViewPager viewPager) {
            this.mViewPager = viewPager;
        }
    }

    static {
        String[] strArr = new String[2];
        String str = "&`9,A\u0011n9)1\u0014f9(1\u001ef({y\u0011\u007f9{pPY=<t\u0002H8:a\u0004l.{b\u0015}";
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
                        i3 = 112;
                        break;
                    case at.g /*1*/:
                        i3 = 9;
                        break;
                    case at.i /*2*/:
                        i3 = 92;
                        break;
                    case at.o /*3*/:
                        i3 = 91;
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
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "$h>{s\u0015e35v\u0003)(41\u0011)82w\u0016l.>\u007f\u0004)\b:s<h%4d\u0004'";
                    obj = null;
            }
        }
    }

    static int access$600(TabLayout tabLayout) {
        return tabLayout.mTabPaddingEnd;
    }

    public int getSelectedTabPosition() {
        try {
            return this.mSelectedTab != null ? this.mSelectedTab.getPosition() : -1;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    static int access$400(TabLayout tabLayout) {
        return tabLayout.mTabPaddingStart;
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setTabsFromPagerAdapter(@NonNull PagerAdapter pagerAdapter) {
        boolean z = CoordinatorLayout.a;
        removeAllTabs();
        int i = 0;
        int count = pagerAdapter.getCount();
        while (i < count) {
            addTab(newTab().setText(pagerAdapter.getPageTitle(i)));
            i++;
            if (z) {
                return;
            }
        }
    }

    private void updateTabViewLayoutParams(LayoutParams layoutParams) {
        try {
            if (this.mMode == 1) {
                if (this.mTabGravity == 0) {
                    try {
                        layoutParams.width = 0;
                        layoutParams.weight = 1.0f;
                        if (!CoordinatorLayout.a) {
                            return;
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
            }
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    static int access$1200(TabLayout tabLayout) {
        return tabLayout.mMode;
    }

    private static ColorStateList createColorStateList(int i, int i2) {
        r0 = new int[2][];
        int[] iArr = new int[]{SELECTED_STATE_SET, i2};
        r0[1] = EMPTY_STATE_SET;
        iArr[1] = i;
        return new ColorStateList(r0, iArr);
    }

    private int getTabMinWidth() {
        try {
            if (this.mRequestedTabMinWidth != -1) {
                return this.mRequestedTabMinWidth;
            }
            try {
                return this.mMode == 0 ? this.mScrollableTabMinWidth : 0;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    static float access$1100(TabLayout tabLayout) {
        return tabLayout.mTabTextMultiLineSize;
    }

    public void setOnTabSelectedListener(OnTabSelectedListener onTabSelectedListener) {
        this.mOnTabSelectedListener = onTabSelectedListener;
    }

    private TabView getTabView(int i) {
        return (TabView) this.mTabStrip.getChildAt(i);
    }

    private void updateTab(int i) {
        TabView tabView = getTabView(i);
        if (tabView != null) {
            try {
                tabView.update();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    static int access$1600(TabLayout tabLayout) {
        return tabLayout.mTabGravity;
    }

    private LayoutParams createLayoutParamsForTabs() {
        LayoutParams layoutParams = new LayoutParams(-2, -1);
        updateTabViewLayoutParams(layoutParams);
        return layoutParams;
    }

    static int access$900(TabLayout tabLayout) {
        return tabLayout.mTabMaxWidth;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onMeasure(int r8, int r9) {
        /*
        r7 = this;
        r6 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r1 = 1;
        r2 = 0;
        r3 = android.support.design.widget.CoordinatorLayout.a;
        r0 = r7.getDefaultHeight();
        r0 = r7.dpToPx(r0);
        r4 = r7.getPaddingTop();
        r0 = r0 + r4;
        r4 = r7.getPaddingBottom();
        r0 = r0 + r4;
        r4 = android.view.View.MeasureSpec.getMode(r9);
        switch(r4) {
            case -2147483648: goto L_0x0065;
            case 0: goto L_0x0073;
            default: goto L_0x001f;
        };
    L_0x001f:
        r0 = android.view.View.MeasureSpec.getSize(r8);
        r4 = android.view.View.MeasureSpec.getMode(r8);	 Catch:{ IllegalArgumentException -> 0x0078 }
        if (r4 == 0) goto L_0x0031;
    L_0x0029:
        r4 = r7.mRequestedTabMaxWidth;	 Catch:{ IllegalArgumentException -> 0x007a }
        if (r4 <= 0) goto L_0x007c;
    L_0x002d:
        r0 = r7.mRequestedTabMaxWidth;	 Catch:{ IllegalArgumentException -> 0x007a }
    L_0x002f:
        r7.mTabMaxWidth = r0;
    L_0x0031:
        super.onMeasure(r8, r9);
        r0 = r7.getChildCount();
        if (r0 != r1) goto L_0x0064;
    L_0x003a:
        r4 = r7.getChildAt(r2);
        r0 = r7.mMode;	 Catch:{ IllegalArgumentException -> 0x009d }
        switch(r0) {
            case 0: goto L_0x0084;
            case 1: goto L_0x0091;
            default: goto L_0x0043;
        };
    L_0x0043:
        r0 = r2;
    L_0x0044:
        if (r0 == 0) goto L_0x0064;
    L_0x0046:
        r0 = r7.getPaddingTop();
        r1 = r7.getPaddingBottom();
        r0 = r0 + r1;
        r1 = r4.getLayoutParams();
        r1 = r1.height;
        r0 = getChildMeasureSpec(r9, r0, r1);
        r1 = r7.getMeasuredWidth();
        r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r6);
        r4.measure(r1, r0);
    L_0x0064:
        return;
    L_0x0065:
        r4 = android.view.View.MeasureSpec.getSize(r9);
        r4 = java.lang.Math.min(r0, r4);
        r9 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r6);
        if (r3 == 0) goto L_0x001f;
    L_0x0073:
        r9 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r6);
        goto L_0x001f;
    L_0x0078:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x007a }
    L_0x007a:
        r0 = move-exception;
        throw r0;
    L_0x007c:
        r4 = 56;
        r4 = r7.dpToPx(r4);
        r0 = r0 - r4;
        goto L_0x002f;
    L_0x0084:
        r0 = r4.getMeasuredWidth();	 Catch:{ IllegalArgumentException -> 0x009f }
        r5 = r7.getMeasuredWidth();	 Catch:{ IllegalArgumentException -> 0x009f }
        if (r0 >= r5) goto L_0x00a1;
    L_0x008e:
        r0 = r1;
    L_0x008f:
        if (r3 == 0) goto L_0x0044;
    L_0x0091:
        r0 = r4.getMeasuredWidth();	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r3 = r7.getMeasuredWidth();	 Catch:{ IllegalArgumentException -> 0x00a3 }
        if (r0 == r3) goto L_0x00a5;
    L_0x009b:
        r0 = r1;
        goto L_0x0044;
    L_0x009d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x009f }
    L_0x009f:
        r0 = move-exception;
        throw r0;
    L_0x00a1:
        r0 = r2;
        goto L_0x008f;
    L_0x00a3:
        r0 = move-exception;
        throw r0;
    L_0x00a5:
        r1 = r2;
        goto L_0x009b;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.TabLayout.onMeasure(int, int):void");
    }

    public TabLayout(Context context) {
        this(context, null);
    }

    static ColorStateList access$1400(TabLayout tabLayout) {
        return tabLayout.mTabTextColors;
    }

    public void setTabTextColors(@Nullable ColorStateList colorStateList) {
        try {
            if (this.mTabTextColors != colorStateList) {
                this.mTabTextColors = colorStateList;
                updateAllTabs();
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void setTabTextColors(int i, int i2) {
        setTabTextColors(createColorStateList(i, i2));
    }

    private void addTabView(Tab tab, boolean z) {
        View createTabView = createTabView(tab);
        try {
            this.mTabStrip.addView(createTabView, createLayoutParamsForTabs());
            if (z) {
                createTabView.setSelected(true);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private int calculateScrollXForTab(int i, float f) {
        int i2 = 0;
        if (this.mMode != 0) {
            return 0;
        }
        View childAt = this.mTabStrip.getChildAt(i);
        try {
            int width;
            View childAt2 = i + 1 < this.mTabStrip.getChildCount() ? this.mTabStrip.getChildAt(i + 1) : null;
            if (childAt != null) {
                try {
                    width = childAt.getWidth();
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            width = 0;
            if (childAt2 != null) {
                try {
                    i2 = childAt2.getWidth();
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
            return ((childAt.getLeft() + ((int) ((((float) (width + i2)) * f) * 0.5f))) + (childAt.getWidth() / 2)) - (getWidth() / 2);
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    private int dpToPx(int i) {
        return Math.round(getResources().getDisplayMetrics().density * ((float) i));
    }

    public void addTab(@NonNull Tab tab) {
        addTab(tab, this.mTabs.isEmpty());
    }

    private int getDefaultHeight() {
        Object obj;
        boolean z = CoordinatorLayout.a;
        int size = this.mTabs.size();
        int i = 0;
        Object obj2 = null;
        while (i < size) {
            int i2;
            Tab tab = (Tab) this.mTabs.get(i);
            if (tab != null) {
                try {
                    if (!(tab.getIcon() == null || TextUtils.isEmpty(tab.getText()))) {
                        obj = 1;
                        if (!z) {
                            break;
                        }
                        i2 = i + 1;
                        if (z) {
                            break;
                        }
                        i = i2;
                        obj2 = obj;
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            obj = obj2;
            i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
            obj2 = obj;
        }
        obj = obj2;
        if (obj != null) {
            return 72;
        }
        return 48;
    }

    static int access$1300(TabLayout tabLayout) {
        return tabLayout.mTabTextAppearance;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void applyModeAndGravity() {
        /*
        r6 = this;
        r5 = 1;
        r0 = 0;
        r1 = r6.mMode;
        if (r1 != 0) goto L_0x000f;
    L_0x0006:
        r1 = r6.mContentInsetStart;
        r2 = r6.mTabPaddingStart;
        r1 = r1 - r2;
        r0 = java.lang.Math.max(r0, r1);
    L_0x000f:
        r1 = r6.mTabStrip;	 Catch:{ IllegalArgumentException -> 0x0035 }
        r2 = 0;
        r3 = 0;
        r4 = 0;
        android.support.v4.view.ViewCompat.setPaddingRelative(r1, r0, r2, r3, r4);	 Catch:{ IllegalArgumentException -> 0x0035 }
        r0 = r6.mMode;	 Catch:{ IllegalArgumentException -> 0x0035 }
        switch(r0) {
            case 0: goto L_0x002a;
            case 1: goto L_0x0020;
            default: goto L_0x001c;
        };
    L_0x001c:
        r6.updateTabViews(r5);
        return;
    L_0x0020:
        r0 = r6.mTabStrip;	 Catch:{ IllegalArgumentException -> 0x0033 }
        r1 = 1;
        r0.setGravity(r1);	 Catch:{ IllegalArgumentException -> 0x0033 }
        r0 = android.support.design.widget.CoordinatorLayout.a;	 Catch:{ IllegalArgumentException -> 0x0033 }
        if (r0 == 0) goto L_0x001c;
    L_0x002a:
        r0 = r6.mTabStrip;	 Catch:{ IllegalArgumentException -> 0x0033 }
        r1 = 8388611; // 0x800003 float:1.1754948E-38 double:4.1445245E-317;
        r0.setGravity(r1);	 Catch:{ IllegalArgumentException -> 0x0033 }
        goto L_0x001c;
    L_0x0033:
        r0 = move-exception;
        throw r0;
    L_0x0035:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0033 }
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.TabLayout.applyModeAndGravity():void");
    }

    public void setScrollPosition(int i, float f, boolean z) {
        try {
            if (this.mIndicatorAnimator != null) {
                if (this.mIndicatorAnimator.isRunning()) {
                    return;
                }
            }
            if (i >= 0) {
                try {
                    if (i < this.mTabStrip.getChildCount()) {
                        try {
                            this.mTabStrip.setIndicatorPositionFromTabPosition(i, f);
                            scrollTo(calculateScrollXForTab(i, f), 0);
                            if (z) {
                                setSelectedTabView(Math.round(((float) i) + f));
                            }
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    }
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }

    static int access$700(TabLayout tabLayout) {
        return tabLayout.mTabPaddingBottom;
    }

    public void addTab(@NonNull Tab tab, boolean z) {
        try {
            if (Tab.access$000(tab) != this) {
                throw new IllegalArgumentException(z[1]);
            }
            try {
                addTabView(tab, z);
                configureTab(tab, this.mTabs.size());
                if (z) {
                    tab.select();
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    private void updateAllTabs() {
        boolean z = CoordinatorLayout.a;
        int i = 0;
        int childCount = this.mTabStrip.getChildCount();
        while (i < childCount) {
            updateTab(i);
            i++;
            if (z) {
                return;
            }
        }
    }

    public void setupWithViewPager(@NonNull ViewPager viewPager) {
        PagerAdapter adapter = viewPager.getAdapter();
        if (adapter == null) {
            try {
                throw new IllegalArgumentException(z[0]);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        setTabsFromPagerAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayoutOnPageChangeListener(this));
        setOnTabSelectedListener(new ViewPagerOnTabSelectedListener(viewPager));
        if (adapter.getCount() > 0) {
            int currentItem = viewPager.getCurrentItem();
            try {
                if (getSelectedTabPosition() != currentItem) {
                    selectTab(getTabAt(currentItem));
                }
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }
    }

    static int access$500(TabLayout tabLayout) {
        return tabLayout.mTabPaddingTop;
    }

    static ValueAnimatorCompat access$1802(TabLayout tabLayout, ValueAnimatorCompat valueAnimatorCompat) {
        tabLayout.mIndicatorAnimator = valueAnimatorCompat;
        return valueAnimatorCompat;
    }

    static int access$1500(TabLayout tabLayout, int i) {
        return tabLayout.dpToPx(i);
    }

    private TabView createTabView(Tab tab) {
        TabView tabView = new TabView(this, getContext(), tab);
        try {
            tabView.setFocusable(true);
            tabView.setMinimumWidth(getTabMinWidth());
            if (this.mTabClickListener == null) {
                this.mTabClickListener = new 1(this);
            }
            tabView.setOnClickListener(this.mTabClickListener);
            return tabView;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    static int access$300(TabLayout tabLayout) {
        return tabLayout.mTabBackgroundResId;
    }

    static float access$1000(TabLayout tabLayout) {
        return tabLayout.mTabTextSize;
    }

    public void removeAllTabs() {
        boolean z = CoordinatorLayout.a;
        this.mTabStrip.removeAllViews();
        Iterator it = this.mTabs.iterator();
        while (it.hasNext()) {
            ((Tab) it.next()).setPosition(-1);
            it.remove();
            if (z) {
                break;
            }
        }
        this.mSelectedTab = null;
    }

    public TabLayout(Context context, AttributeSet attributeSet, int i) {
        Object obj = CoordinatorLayout.a;
        super(context, attributeSet, i);
        this.mTabs = new ArrayList();
        this.mTabMaxWidth = Integer.MAX_VALUE;
        ThemeUtils.checkAppCompatTheme(context);
        setHorizontalScrollBarEnabled(false);
        this.mTabStrip = new SlidingTabStrip(this, context);
        addView(this.mTabStrip, -2, -1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TabLayout, i, R.style.Widget_Design_TabLayout);
        this.mTabStrip.setSelectedIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabIndicatorHeight, 0));
        this.mTabStrip.setSelectedIndicatorColor(obtainStyledAttributes.getColor(R.styleable.TabLayout_tabIndicatorColor, 0));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabPadding, 0);
        this.mTabPaddingBottom = dimensionPixelSize;
        this.mTabPaddingEnd = dimensionPixelSize;
        this.mTabPaddingTop = dimensionPixelSize;
        this.mTabPaddingStart = dimensionPixelSize;
        this.mTabPaddingStart = obtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabPaddingStart, this.mTabPaddingStart);
        this.mTabPaddingTop = obtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabPaddingTop, this.mTabPaddingTop);
        this.mTabPaddingEnd = obtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabPaddingEnd, this.mTabPaddingEnd);
        this.mTabPaddingBottom = obtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabPaddingBottom, this.mTabPaddingBottom);
        this.mTabTextAppearance = obtainStyledAttributes.getResourceId(R.styleable.TabLayout_tabTextAppearance, R.style.TextAppearance_Design_Tab);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(this.mTabTextAppearance, R.styleable.TextAppearance);
        try {
            this.mTabTextSize = (float) obtainStyledAttributes2.getDimensionPixelSize(R.styleable.TextAppearance_android_textSize, 0);
            this.mTabTextColors = obtainStyledAttributes2.getColorStateList(R.styleable.TextAppearance_android_textColor);
            try {
                if (obtainStyledAttributes.hasValue(R.styleable.TabLayout_tabTextColor)) {
                    this.mTabTextColors = obtainStyledAttributes.getColorStateList(R.styleable.TabLayout_tabTextColor);
                }
                if (obtainStyledAttributes.hasValue(R.styleable.TabLayout_tabSelectedTextColor)) {
                    this.mTabTextColors = createColorStateList(this.mTabTextColors.getDefaultColor(), obtainStyledAttributes.getColor(R.styleable.TabLayout_tabSelectedTextColor, 0));
                }
                this.mRequestedTabMinWidth = obtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabMinWidth, -1);
                this.mRequestedTabMaxWidth = obtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabMaxWidth, -1);
                this.mTabBackgroundResId = obtainStyledAttributes.getResourceId(R.styleable.TabLayout_tabBackground, 0);
                this.mContentInsetStart = obtainStyledAttributes.getDimensionPixelSize(R.styleable.TabLayout_tabContentStart, 0);
                this.mMode = obtainStyledAttributes.getInt(R.styleable.TabLayout_tabMode, 1);
                this.mTabGravity = obtainStyledAttributes.getInt(R.styleable.TabLayout_tabGravity, 0);
                obtainStyledAttributes.recycle();
                Resources resources = getResources();
                this.mTabTextMultiLineSize = (float) resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
                this.mScrollableTabMinWidth = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
                applyModeAndGravity();
                if (obj != null) {
                    Behavior.a++;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } finally {
            obtainStyledAttributes2.recycle();
        }
    }

    static int access$1602(TabLayout tabLayout, int i) {
        tabLayout.mTabGravity = i;
        return i;
    }

    private void setSelectedTabView(int i) {
        boolean z = CoordinatorLayout.a;
        int childCount = this.mTabStrip.getChildCount();
        if (i < childCount) {
            try {
                if (!this.mTabStrip.getChildAt(i).isSelected()) {
                    int i2 = 0;
                    while (i2 < childCount) {
                        boolean z2;
                        View childAt = this.mTabStrip.getChildAt(i2);
                        if (i2 == i) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        childAt.setSelected(z2);
                        int i3 = i2 + 1;
                        if (!z) {
                            i2 = i3;
                        } else {
                            return;
                        }
                    }
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    static void access$100(TabLayout tabLayout, int i) {
        tabLayout.updateTab(i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void selectTab(android.support.design.widget.TabLayout.Tab r5, boolean r6) {
        /*
        r4 = this;
        r1 = -1;
        r2 = android.support.design.widget.CoordinatorLayout.a;
        r0 = r4.mSelectedTab;	 Catch:{ IllegalArgumentException -> 0x0065 }
        if (r0 != r5) goto L_0x001f;
    L_0x0007:
        r0 = r4.mSelectedTab;	 Catch:{ IllegalArgumentException -> 0x0067 }
        if (r0 == 0) goto L_0x0064;
    L_0x000b:
        r0 = r4.mOnTabSelectedListener;	 Catch:{ IllegalArgumentException -> 0x0069 }
        if (r0 == 0) goto L_0x0016;
    L_0x000f:
        r0 = r4.mOnTabSelectedListener;	 Catch:{ IllegalArgumentException -> 0x0069 }
        r3 = r4.mSelectedTab;	 Catch:{ IllegalArgumentException -> 0x0069 }
        r0.onTabReselected(r3);	 Catch:{ IllegalArgumentException -> 0x0069 }
    L_0x0016:
        r0 = r5.getPosition();	 Catch:{ IllegalArgumentException -> 0x006b }
        r4.animateToTab(r0);	 Catch:{ IllegalArgumentException -> 0x006b }
        if (r2 == 0) goto L_0x0064;
    L_0x001f:
        if (r6 == 0) goto L_0x0044;
    L_0x0021:
        if (r5 == 0) goto L_0x0071;
    L_0x0023:
        r0 = r5.getPosition();	 Catch:{ IllegalArgumentException -> 0x006f }
    L_0x0027:
        if (r0 == r1) goto L_0x002c;
    L_0x0029:
        r4.setSelectedTabView(r0);	 Catch:{ IllegalArgumentException -> 0x0073 }
    L_0x002c:
        r3 = r4.mSelectedTab;	 Catch:{ IllegalArgumentException -> 0x0075 }
        if (r3 == 0) goto L_0x0038;
    L_0x0030:
        r3 = r4.mSelectedTab;	 Catch:{ IllegalArgumentException -> 0x0077 }
        r3 = r3.getPosition();	 Catch:{ IllegalArgumentException -> 0x0077 }
        if (r3 != r1) goto L_0x0041;
    L_0x0038:
        if (r0 == r1) goto L_0x0041;
    L_0x003a:
        r1 = 0;
        r3 = 1;
        r4.setScrollPosition(r0, r1, r3);	 Catch:{ IllegalArgumentException -> 0x007b }
        if (r2 == 0) goto L_0x0044;
    L_0x0041:
        r4.animateToTab(r0);	 Catch:{ IllegalArgumentException -> 0x007b }
    L_0x0044:
        r0 = r4.mSelectedTab;	 Catch:{ IllegalArgumentException -> 0x007d }
        if (r0 == 0) goto L_0x0053;
    L_0x0048:
        r0 = r4.mOnTabSelectedListener;	 Catch:{ IllegalArgumentException -> 0x007f }
        if (r0 == 0) goto L_0x0053;
    L_0x004c:
        r0 = r4.mOnTabSelectedListener;	 Catch:{ IllegalArgumentException -> 0x007f }
        r1 = r4.mSelectedTab;	 Catch:{ IllegalArgumentException -> 0x007f }
        r0.onTabUnselected(r1);	 Catch:{ IllegalArgumentException -> 0x007f }
    L_0x0053:
        r4.mSelectedTab = r5;	 Catch:{ IllegalArgumentException -> 0x0081 }
        r0 = r4.mSelectedTab;	 Catch:{ IllegalArgumentException -> 0x0081 }
        if (r0 == 0) goto L_0x0064;
    L_0x0059:
        r0 = r4.mOnTabSelectedListener;	 Catch:{ IllegalArgumentException -> 0x0083 }
        if (r0 == 0) goto L_0x0064;
    L_0x005d:
        r0 = r4.mOnTabSelectedListener;	 Catch:{ IllegalArgumentException -> 0x0083 }
        r1 = r4.mSelectedTab;	 Catch:{ IllegalArgumentException -> 0x0083 }
        r0.onTabSelected(r1);	 Catch:{ IllegalArgumentException -> 0x0083 }
    L_0x0064:
        return;
    L_0x0065:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0067 }
    L_0x0067:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0069 }
    L_0x0069:
        r0 = move-exception;
        throw r0;
    L_0x006b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x006d }
    L_0x006d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x006f }
    L_0x006f:
        r0 = move-exception;
        throw r0;
    L_0x0071:
        r0 = r1;
        goto L_0x0027;
    L_0x0073:
        r0 = move-exception;
        throw r0;
    L_0x0075:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0077 }
    L_0x0077:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0079 }
    L_0x0079:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x007b }
    L_0x007b:
        r0 = move-exception;
        throw r0;
    L_0x007d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x007f }
    L_0x007f:
        r0 = move-exception;
        throw r0;
    L_0x0081:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0083 }
    L_0x0083:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.TabLayout.selectTab(android.support.design.widget.TabLayout$Tab, boolean):void");
    }

    private void configureTab(Tab tab, int i) {
        boolean z = CoordinatorLayout.a;
        tab.setPosition(i);
        this.mTabs.add(i, tab);
        int size = this.mTabs.size();
        int i2 = i + 1;
        while (i2 < size) {
            ((Tab) this.mTabs.get(i2)).setPosition(i2);
            int i3 = i2 + 1;
            if (!z) {
                i2 = i3;
            } else {
                return;
            }
        }
    }

    @NonNull
    public Tab newTab() {
        return new Tab(this);
    }

    void selectTab(Tab tab) {
        selectTab(tab, true);
    }

    static void access$1700(TabLayout tabLayout, boolean z) {
        tabLayout.updateTabViews(z);
    }

    private int getTabMaxWidth() {
        return this.mTabMaxWidth;
    }

    @Nullable
    public Tab getTabAt(int i) {
        return (Tab) this.mTabs.get(i);
    }

    private void animateToTab(int i) {
        if (i != -1) {
            try {
                if (getWindowToken() != null) {
                    if (ViewCompat.isLaidOut(this)) {
                        try {
                            if (!this.mTabStrip.childrenNeedLayout()) {
                                int scrollX = getScrollX();
                                int calculateScrollXForTab = calculateScrollXForTab(i, 0.0f);
                                if (scrollX != calculateScrollXForTab) {
                                    try {
                                        if (this.mScrollAnimator == null) {
                                            this.mScrollAnimator = ViewUtils.createAnimator();
                                            this.mScrollAnimator.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
                                            this.mScrollAnimator.setDuration(300);
                                            this.mScrollAnimator.setUpdateListener(new 2(this));
                                        }
                                        this.mScrollAnimator.setIntValues(scrollX, calculateScrollXForTab);
                                        this.mScrollAnimator.start();
                                    } catch (IllegalArgumentException e) {
                                        throw e;
                                    }
                                }
                                this.mTabStrip.animateIndicatorToPosition(i, 300);
                                return;
                            }
                        } catch (IllegalArgumentException e2) {
                            throw e2;
                        }
                    }
                }
                setScrollPosition(i, 0.0f, true);
            } catch (IllegalArgumentException e22) {
                throw e22;
            } catch (IllegalArgumentException e222) {
                throw e222;
            }
        }
    }

    static int access$800(TabLayout tabLayout) {
        return tabLayout.getTabMaxWidth();
    }

    private void updateTabViews(boolean z) {
        boolean z2 = CoordinatorLayout.a;
        int i = 0;
        while (i < this.mTabStrip.getChildCount()) {
            View childAt = this.mTabStrip.getChildAt(i);
            try {
                childAt.setMinimumWidth(getTabMinWidth());
                updateTabViewLayoutParams((LayoutParams) childAt.getLayoutParams());
                if (z) {
                    childAt.requestLayout();
                }
                int i2 = i + 1;
                if (!z2) {
                    i = i2;
                } else {
                    return;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }
}
