package android.support.v4.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.v4.app.FragmentActivity;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewConfiguration;

public class PagerTabStrip extends PagerTitleStrip {
    private boolean mDrawFullUnderline;
    private boolean mDrawFullUnderlineSet;
    private int mFullUnderlineHeight;
    private boolean mIgnoreTap;
    private int mIndicatorColor;
    private int mIndicatorHeight;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private int mMinPaddingBottom;
    private int mMinStripHeight;
    private int mMinTextSpacing;
    private int mTabAlpha;
    private int mTabPadding;
    private final Paint mTabPaint;
    private final Rect mTempRect;
    private int mTouchSlop;

    class 1 implements OnClickListener {
        final PagerTabStrip this$0;

        public void onClick(View view) {
            this.this$0.mPager.setCurrentItem(this.this$0.mPager.getCurrentItem() - 1);
        }

        1(PagerTabStrip pagerTabStrip) {
            this.this$0 = pagerTabStrip;
        }
    }

    class 2 implements OnClickListener {
        final PagerTabStrip this$0;

        2(PagerTabStrip pagerTabStrip) {
            this.this$0 = pagerTabStrip;
        }

        public void onClick(View view) {
            this.this$0.mPager.setCurrentItem(this.this$0.mPager.getCurrentItem() + 1);
        }
    }

    int getMinHeight() {
        return Math.max(super.getMinHeight(), this.mMinStripHeight);
    }

    public PagerTabStrip(Context context, AttributeSet attributeSet) {
        int i = ViewCompat.a;
        super(context, attributeSet);
        this.mTabPaint = new Paint();
        this.mTempRect = new Rect();
        this.mTabAlpha = 255;
        this.mDrawFullUnderline = false;
        this.mDrawFullUnderlineSet = false;
        this.mIndicatorColor = this.mTextColor;
        this.mTabPaint.setColor(this.mIndicatorColor);
        float f = context.getResources().getDisplayMetrics().density;
        this.mIndicatorHeight = (int) ((3.0f * f) + 0.5f);
        this.mMinPaddingBottom = (int) ((6.0f * f) + 0.5f);
        this.mMinTextSpacing = (int) (64.0f * f);
        this.mTabPadding = (int) ((16.0f * f) + 0.5f);
        this.mFullUnderlineHeight = (int) ((1.0f * f) + 0.5f);
        this.mMinStripHeight = (int) ((f * 32.0f) + 0.5f);
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.mPrevText.setFocusable(true);
        this.mPrevText.setOnClickListener(new 1(this));
        this.mNextText.setFocusable(true);
        this.mNextText.setOnClickListener(new 2(this));
        if (getBackground() == null) {
            this.mDrawFullUnderline = true;
        }
        if (i != 0) {
            FragmentActivity.a++;
        }
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        if (i4 < this.mMinPaddingBottom) {
            i4 = this.mMinPaddingBottom;
        }
        super.setPadding(i, i2, i3, i4);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
        r6 = this;
        r1 = 1;
        r0 = 0;
        r2 = android.support.v4.view.ViewCompat.a;
        r3 = r7.getAction();
        if (r3 == 0) goto L_0x000f;
    L_0x000a:
        r4 = r6.mIgnoreTap;
        if (r4 == 0) goto L_0x000f;
    L_0x000e:
        return r0;
    L_0x000f:
        r4 = r7.getX();
        r5 = r7.getY();
        switch(r3) {
            case 0: goto L_0x001c;
            case 1: goto L_0x0046;
            case 2: goto L_0x0024;
            default: goto L_0x001a;
        };
    L_0x001a:
        r0 = r1;
        goto L_0x000e;
    L_0x001c:
        r6.mInitialMotionX = r4;
        r6.mInitialMotionY = r5;
        r6.mIgnoreTap = r0;
        if (r2 == 0) goto L_0x001a;
    L_0x0024:
        r0 = r6.mInitialMotionX;
        r0 = r4 - r0;
        r0 = java.lang.Math.abs(r0);
        r3 = r6.mTouchSlop;
        r3 = (float) r3;
        r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r0 > 0) goto L_0x0042;
    L_0x0033:
        r0 = r6.mInitialMotionY;
        r0 = r5 - r0;
        r0 = java.lang.Math.abs(r0);
        r3 = r6.mTouchSlop;
        r3 = (float) r3;
        r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r0 <= 0) goto L_0x001a;
    L_0x0042:
        r6.mIgnoreTap = r1;
        if (r2 == 0) goto L_0x001a;
    L_0x0046:
        r0 = r6.mCurrText;
        r0 = r0.getLeft();
        r3 = r6.mTabPadding;
        r0 = r0 - r3;
        r0 = (float) r0;
        r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r0 >= 0) goto L_0x0063;
    L_0x0054:
        r0 = r6.mPager;
        r3 = r6.mPager;
        r3 = r3.getCurrentItem();
        r3 = r3 + -1;
        r0.setCurrentItem(r3);
        if (r2 == 0) goto L_0x001a;
    L_0x0063:
        r0 = r6.mCurrText;
        r0 = r0.getRight();
        r2 = r6.mTabPadding;
        r0 = r0 + r2;
        r0 = (float) r0;
        r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r0 <= 0) goto L_0x001a;
    L_0x0071:
        r0 = r6.mPager;
        r2 = r6.mPager;
        r2 = r2.getCurrentItem();
        r2 = r2 + 1;
        r0.setCurrentItem(r2);
        goto L_0x001a;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.PagerTabStrip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (!this.mDrawFullUnderlineSet) {
            boolean z;
            if (drawable == null) {
                z = true;
            } else {
                z = false;
            }
            this.mDrawFullUnderline = z;
        }
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.mCurrText.getLeft() - this.mTabPadding;
        int right = this.mCurrText.getRight() + this.mTabPadding;
        int i = height - this.mIndicatorHeight;
        this.mTabPaint.setColor((this.mTabAlpha << 24) | (this.mIndicatorColor & 16777215));
        canvas.drawRect((float) left, (float) i, (float) right, (float) height, this.mTabPaint);
        if (this.mDrawFullUnderline) {
            this.mTabPaint.setColor(-16777216 | (this.mIndicatorColor & 16777215));
            canvas.drawRect((float) getPaddingLeft(), (float) (height - this.mFullUnderlineHeight), (float) (getWidth() - getPaddingRight()), (float) height, this.mTabPaint);
        }
    }

    public void setBackgroundColor(@ColorInt int i) {
        super.setBackgroundColor(i);
        if (!this.mDrawFullUnderlineSet) {
            boolean z;
            if ((-16777216 & i) == 0) {
                z = true;
            } else {
                z = false;
            }
            this.mDrawFullUnderline = z;
        }
    }

    public PagerTabStrip(Context context) {
        this(context, null);
    }

    void updateTextPositions(int i, float f, boolean z) {
        Rect rect = this.mTempRect;
        int height = getHeight();
        int i2 = height - this.mIndicatorHeight;
        rect.set(this.mCurrText.getLeft() - this.mTabPadding, i2, this.mCurrText.getRight() + this.mTabPadding, height);
        super.updateTextPositions(i, f, z);
        this.mTabAlpha = (int) ((Math.abs(f - 0.5f) * 2.0f) * 255.0f);
        rect.union(this.mCurrText.getLeft() - this.mTabPadding, i2, this.mCurrText.getRight() + this.mTabPadding, height);
        invalidate(rect);
    }

    public void setTextSpacing(int i) {
        if (i < this.mMinTextSpacing) {
            i = this.mMinTextSpacing;
        }
        super.setTextSpacing(i);
    }

    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        if (!this.mDrawFullUnderlineSet) {
            boolean z;
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            this.mDrawFullUnderline = z;
        }
    }
}
