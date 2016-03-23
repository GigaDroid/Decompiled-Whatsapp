package android.support.v4.view;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.annotation.FloatRange;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import org.v;
import org.whispersystems.at;

public class PagerTitleStrip extends ViewGroup implements Decor {
    private static final int[] ATTRS;
    private static final PagerTitleStripImpl IMPL;
    private static final int[] TEXT_ATTRS;
    private static final String[] z;
    TextView mCurrText;
    private int mGravity;
    private int mLastKnownCurrentPage;
    private float mLastKnownPositionOffset;
    TextView mNextText;
    private int mNonPrimaryAlpha;
    private final PageListener mPageListener;
    ViewPager mPager;
    TextView mPrevText;
    private int mScaledTextSpacing;
    int mTextColor;
    private boolean mUpdatingPositions;
    private boolean mUpdatingText;
    private WeakReference mWatchingAdapter;

    class PageListener extends DataSetObserver implements OnPageChangeListener, OnAdapterChangeListener {
        private int mScrollState;
        final PagerTitleStrip this$0;

        public void onAdapterChanged(PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            this.this$0.updateAdapter(pagerAdapter, pagerAdapter2);
        }

        public void onChanged() {
            float f = 0.0f;
            this.this$0.updateText(this.this$0.mPager.getCurrentItem(), this.this$0.mPager.getAdapter());
            if (PagerTitleStrip.access$100(this.this$0) >= 0.0f) {
                f = PagerTitleStrip.access$100(this.this$0);
            }
            this.this$0.updateTextPositions(this.this$0.mPager.getCurrentItem(), f, true);
        }

        public void onPageScrolled(int i, float f, int i2) {
            if (f > 0.5f) {
                i++;
            }
            this.this$0.updateTextPositions(i, f, false);
        }

        public void onPageSelected(int i) {
            float f = 0.0f;
            if (this.mScrollState == 0) {
                this.this$0.updateText(this.this$0.mPager.getCurrentItem(), this.this$0.mPager.getAdapter());
                if (PagerTitleStrip.access$100(this.this$0) >= 0.0f) {
                    f = PagerTitleStrip.access$100(this.this$0);
                }
                this.this$0.updateTextPositions(this.this$0.mPager.getCurrentItem(), f, true);
            }
        }

        PageListener(PagerTitleStrip pagerTitleStrip, 1 1) {
            this(pagerTitleStrip);
        }

        private PageListener(PagerTitleStrip pagerTitleStrip) {
            this.this$0 = pagerTitleStrip;
        }

        public void onPageScrollStateChanged(int i) {
            this.mScrollState = i;
        }
    }

    interface PagerTitleStripImpl {
        void setSingleLineAllCaps(TextView textView);
    }

    class PagerTitleStripImplBase implements PagerTitleStripImpl {
        PagerTitleStripImplBase() {
        }

        public void setSingleLineAllCaps(TextView textView) {
            textView.setSingleLine();
        }
    }

    class PagerTitleStripImplIcs implements PagerTitleStripImpl {
        public void setSingleLineAllCaps(TextView textView) {
            PagerTitleStripIcs.setSingleLineAllCaps(textView);
        }

        PagerTitleStripImplIcs() {
        }
    }

    public void setTextSpacing(int i) {
        this.mScaledTextSpacing = i;
        requestLayout();
    }

    public PagerTitleStrip(Context context) {
        this(context, null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void updateTextPositions(int r21, float r22, boolean r23) {
        /*
        r20 = this;
        r5 = android.support.v4.view.ViewCompat.a;
        r0 = r20;
        r2 = r0.mLastKnownCurrentPage;	 Catch:{ IllegalStateException -> 0x0026 }
        r0 = r21;
        if (r0 == r2) goto L_0x001b;
    L_0x000a:
        r0 = r20;
        r2 = r0.mPager;	 Catch:{ IllegalStateException -> 0x0028 }
        r2 = r2.getAdapter();	 Catch:{ IllegalStateException -> 0x0028 }
        r0 = r20;
        r1 = r21;
        r0.updateText(r1, r2);	 Catch:{ IllegalStateException -> 0x0028 }
        if (r5 == 0) goto L_0x002e;
    L_0x001b:
        if (r23 != 0) goto L_0x002e;
    L_0x001d:
        r0 = r20;
        r2 = r0.mLastKnownPositionOffset;	 Catch:{ IllegalStateException -> 0x002c }
        r2 = (r22 > r2 ? 1 : (r22 == r2 ? 0 : -1));
        if (r2 != 0) goto L_0x002e;
    L_0x0025:
        return;
    L_0x0026:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x0028 }
    L_0x0028:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x002a }
    L_0x002a:
        r2 = move-exception;
        throw r2;	 Catch:{ IllegalStateException -> 0x002c }
    L_0x002c:
        r2 = move-exception;
        throw r2;
    L_0x002e:
        r2 = 1;
        r0 = r20;
        r0.mUpdatingPositions = r2;
        r0 = r20;
        r2 = r0.mPrevText;
        r6 = r2.getMeasuredWidth();
        r0 = r20;
        r2 = r0.mCurrText;
        r3 = r2.getMeasuredWidth();
        r0 = r20;
        r2 = r0.mNextText;
        r7 = r2.getMeasuredWidth();
        r2 = r3 / 2;
        r8 = r20.getWidth();
        r9 = r20.getHeight();
        r10 = r20.getPaddingLeft();
        r11 = r20.getPaddingRight();
        r12 = r20.getPaddingTop();
        r13 = r20.getPaddingBottom();
        r4 = r10 + r2;
        r14 = r11 + r2;
        r2 = r8 - r4;
        r4 = r2 - r14;
        r2 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r2 = r2 + r22;
        r15 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r15 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1));
        if (r15 <= 0) goto L_0x007a;
    L_0x0077:
        r15 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r2 = r2 - r15;
    L_0x007a:
        r14 = r8 - r14;
        r4 = (float) r4;
        r2 = r2 * r4;
        r2 = (int) r2;
        r2 = r14 - r2;
        r4 = r3 / 2;
        r14 = r2 - r4;
        r15 = r14 + r3;
        r0 = r20;
        r2 = r0.mPrevText;
        r2 = r2.getBaseline();
        r0 = r20;
        r3 = r0.mCurrText;
        r3 = r3.getBaseline();
        r0 = r20;
        r4 = r0.mNextText;
        r4 = r4.getBaseline();
        r16 = java.lang.Math.max(r2, r3);
        r0 = r16;
        r16 = java.lang.Math.max(r0, r4);
        r17 = r16 - r2;
        r18 = r16 - r3;
        r16 = r16 - r4;
        r0 = r20;
        r2 = r0.mPrevText;
        r2 = r2.getMeasuredHeight();
        r2 = r2 + r17;
        r0 = r20;
        r3 = r0.mCurrText;
        r3 = r3.getMeasuredHeight();
        r3 = r3 + r18;
        r0 = r20;
        r4 = r0.mNextText;
        r4 = r4.getMeasuredHeight();
        r4 = r4 + r16;
        r2 = java.lang.Math.max(r2, r3);
        r19 = java.lang.Math.max(r2, r4);
        r0 = r20;
        r2 = r0.mGravity;
        r2 = r2 & 112;
        switch(r2) {
            case 16: goto L_0x00e6;
            case 80: goto L_0x00f5;
            default: goto L_0x00de;
        };
    L_0x00de:
        r4 = r12 + r17;
        r3 = r12 + r18;
        r2 = r12 + r16;
        if (r5 == 0) goto L_0x00ff;
    L_0x00e6:
        r2 = r9 - r12;
        r2 = r2 - r13;
        r2 = r2 - r19;
        r2 = r2 / 2;
        r4 = r2 + r17;
        r3 = r2 + r18;
        r2 = r2 + r16;
        if (r5 == 0) goto L_0x00ff;
    L_0x00f5:
        r2 = r9 - r13;
        r2 = r2 - r19;
        r4 = r2 + r17;
        r3 = r2 + r18;
        r2 = r2 + r16;
    L_0x00ff:
        r0 = r20;
        r5 = r0.mCurrText;
        r0 = r20;
        r9 = r0.mCurrText;
        r9 = r9.getMeasuredHeight();
        r9 = r9 + r3;
        r5.layout(r14, r3, r15, r9);
        r0 = r20;
        r3 = r0.mScaledTextSpacing;
        r3 = r14 - r3;
        r3 = r3 - r6;
        r3 = java.lang.Math.min(r10, r3);
        r0 = r20;
        r5 = r0.mPrevText;
        r6 = r6 + r3;
        r0 = r20;
        r9 = r0.mPrevText;
        r9 = r9.getMeasuredHeight();
        r9 = r9 + r4;
        r5.layout(r3, r4, r6, r9);
        r3 = r8 - r11;
        r3 = r3 - r7;
        r0 = r20;
        r4 = r0.mScaledTextSpacing;
        r4 = r4 + r15;
        r3 = java.lang.Math.max(r3, r4);
        r0 = r20;
        r4 = r0.mNextText;
        r5 = r3 + r7;
        r0 = r20;
        r6 = r0.mNextText;
        r6 = r6.getMeasuredHeight();
        r6 = r6 + r2;
        r4.layout(r3, r2, r5, r6);
        r0 = r22;
        r1 = r20;
        r1.mLastKnownPositionOffset = r0;
        r2 = 0;
        r0 = r20;
        r0.mUpdatingPositions = r2;
        goto L_0x0025;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.PagerTitleStrip.updateTextPositions(int, float, boolean):void");
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        try {
            if (parent instanceof ViewPager) {
                ViewPager viewPager = (ViewPager) parent;
                PagerAdapter adapter = viewPager.getAdapter();
                try {
                    PagerAdapter pagerAdapter;
                    viewPager.setInternalPageChangeListener(this.mPageListener);
                    viewPager.setOnAdapterChangeListener(this.mPageListener);
                    this.mPager = viewPager;
                    if (this.mWatchingAdapter != null) {
                        pagerAdapter = (PagerAdapter) this.mWatchingAdapter.get();
                    } else {
                        pagerAdapter = null;
                    }
                    updateAdapter(pagerAdapter, adapter);
                    return;
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
            throw new IllegalStateException(z[1]);
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public int getTextSpacing() {
        return this.mScaledTextSpacing;
    }

    private static void setSingleLineAllCaps(TextView textView) {
        IMPL.setSingleLineAllCaps(textView);
    }

    public void setTextSize(int i, float f) {
        this.mPrevText.setTextSize(i, f);
        this.mCurrText.setTextSize(i, f);
        this.mNextText.setTextSize(i, f);
    }

    static float access$100(PagerTitleStrip pagerTitleStrip) {
        return pagerTitleStrip.mLastKnownPositionOffset;
    }

    void updateText(int i, PagerAdapter pagerAdapter) {
        CharSequence charSequence;
        CharSequence charSequence2 = null;
        if (pagerAdapter != null) {
            try {
                int count = pagerAdapter.getCount();
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        count = 0;
        this.mUpdatingText = true;
        if (i < 1 || pagerAdapter == null) {
            charSequence = null;
        } else {
            charSequence = pagerAdapter.getPageTitle(i - 1);
        }
        try {
            this.mPrevText.setText(charSequence);
            TextView textView = this.mCurrText;
            if (pagerAdapter == null || i >= count) {
                charSequence = null;
            } else {
                charSequence = pagerAdapter.getPageTitle(i);
            }
            textView.setText(charSequence);
            if (i + 1 < count && pagerAdapter != null) {
                charSequence2 = pagerAdapter.getPageTitle(i + 1);
            }
            this.mNextText.setText(charSequence2);
            count = MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())) * 0.8f)), Integer.MIN_VALUE);
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
            try {
                this.mPrevText.measure(count, makeMeasureSpec);
                this.mCurrText.measure(count, makeMeasureSpec);
                this.mNextText.measure(count, makeMeasureSpec);
                this.mLastKnownCurrentPage = i;
                if (!this.mUpdatingPositions) {
                    updateTextPositions(i, this.mLastKnownPositionOffset, false);
                }
                this.mUpdatingText = false;
            } catch (IllegalStateException e2) {
                throw e2;
            }
        } catch (IllegalStateException e22) {
            throw e22;
        } catch (IllegalStateException e222) {
            throw e222;
        }
    }

    static {
        String[] strArr = new String[2];
        String str = "\b\ntkX(\u001afl\r7\u001a'h\u00111\u0017'~\u0016e\u001a\u007f~\u001b1_pv\u001c1\u0017";
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
                        i3 = 69;
                        break;
                    case at.g /*1*/:
                        i3 = 127;
                        break;
                    case at.i /*2*/:
                        i3 = 7;
                        break;
                    case at.o /*3*/:
                        i3 = 31;
                        break;
                    default:
                        i3 = 120;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    try {
                        ATTRS = new int[]{16842804, 16842901, 16842904, 16842927};
                        TEXT_ATTRS = new int[]{16843660};
                        if (VERSION.SDK_INT >= 14) {
                            IMPL = new PagerTitleStripImplIcs();
                            return;
                        } else {
                            IMPL = new PagerTitleStripImplBase();
                            return;
                        }
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                default:
                    strArr2[i] = str;
                    str = "\u0015\u001e`z\n\u0011\u0016ss\u001d\u0016\u000buv\be\u0012rl\fe\u001db?\u0019e\u001bnm\u001d&\u000b'|\u0010,\u0013c?\u0017#_f?.,\u001apO\u0019\"\u001au1";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
            }
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f = 0.0f;
        try {
            if (this.mPager != null) {
                if (this.mLastKnownPositionOffset >= 0.0f) {
                    f = this.mLastKnownPositionOffset;
                }
                updateTextPositions(this.mLastKnownCurrentPage, f, true);
            }
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onMeasure(int r8, int r9) {
        /*
        r7 = this;
        r6 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r5 = -2;
        r0 = android.view.View.MeasureSpec.getMode(r8);
        if (r0 == r6) goto L_0x0016;
    L_0x0009:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x0014 }
        r1 = z;	 Catch:{ IllegalStateException -> 0x0014 }
        r2 = 0;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0014 }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x0014 }
        throw r0;	 Catch:{ IllegalStateException -> 0x0014 }
    L_0x0014:
        r0 = move-exception;
        throw r0;
    L_0x0016:
        r0 = r7.getPaddingTop();
        r1 = r7.getPaddingBottom();
        r1 = r1 + r0;
        r0 = getChildMeasureSpec(r9, r1, r5);
        r2 = android.view.View.MeasureSpec.getSize(r8);
        r3 = (float) r2;
        r4 = 1045220557; // 0x3e4ccccd float:0.2 double:5.164075695E-315;
        r3 = r3 * r4;
        r3 = (int) r3;
        r3 = getChildMeasureSpec(r8, r3, r5);
        r4 = r7.mPrevText;
        r4.measure(r3, r0);
        r4 = r7.mCurrText;
        r4.measure(r3, r0);
        r4 = r7.mNextText;
        r4.measure(r3, r0);
        r0 = android.view.View.MeasureSpec.getMode(r9);
        if (r0 != r6) goto L_0x004e;
    L_0x0046:
        r0 = android.view.View.MeasureSpec.getSize(r9);
        r3 = android.support.v4.view.ViewCompat.a;
        if (r3 == 0) goto L_0x005d;
    L_0x004e:
        r0 = r7.mCurrText;
        r0 = r0.getMeasuredHeight();
        r3 = r7.getMinHeight();
        r0 = r0 + r1;
        r0 = java.lang.Math.max(r3, r0);
    L_0x005d:
        r1 = r7.mCurrText;
        r1 = android.support.v4.view.ViewCompat.getMeasuredState(r1);
        r1 = r1 << 16;
        r0 = android.support.v4.view.ViewCompat.resolveSizeAndState(r0, r9, r1);
        r7.setMeasuredDimension(r2, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.PagerTitleStrip.onMeasure(int, int):void");
    }

    public void setNonPrimaryAlpha(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        this.mNonPrimaryAlpha = ((int) (255.0f * f)) & 255;
        int i = (this.mNonPrimaryAlpha << 24) | (this.mTextColor & 16777215);
        this.mPrevText.setTextColor(i);
        this.mNextText.setTextColor(i);
    }

    public void requestLayout() {
        try {
            if (!this.mUpdatingText) {
                super.requestLayout();
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    void updateAdapter(PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        if (pagerAdapter != null) {
            try {
                pagerAdapter.unregisterDataSetObserver(this.mPageListener);
                this.mWatchingAdapter = null;
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        if (pagerAdapter2 != null) {
            try {
                pagerAdapter2.registerDataSetObserver(this.mPageListener);
                this.mWatchingAdapter = new WeakReference(pagerAdapter2);
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }
        try {
            if (this.mPager != null) {
                this.mLastKnownCurrentPage = -1;
                this.mLastKnownPositionOffset = -1.0f;
                updateText(this.mPager.getCurrentItem(), pagerAdapter2);
                requestLayout();
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    protected void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
            if (this.mPager != null) {
                updateAdapter(this.mPager.getAdapter(), null);
                this.mPager.setInternalPageChangeListener(null);
                this.mPager.setOnAdapterChangeListener(null);
                this.mPager = null;
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PagerTitleStrip(android.content.Context r8, android.util.AttributeSet r9) {
        /*
        r7 = this;
        r6 = 2;
        r0 = 0;
        r1 = android.support.v4.view.ViewCompat.a;
        r7.<init>(r8, r9);
        r2 = -1;
        r7.mLastKnownCurrentPage = r2;
        r2 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r7.mLastKnownPositionOffset = r2;
        r2 = new android.support.v4.view.PagerTitleStrip$PageListener;
        r3 = 0;
        r2.<init>(r7, r3);
        r7.mPageListener = r2;
        r2 = new android.widget.TextView;
        r2.<init>(r8);
        r7.mPrevText = r2;
        r7.addView(r2);
        r2 = new android.widget.TextView;
        r2.<init>(r8);
        r7.mCurrText = r2;
        r7.addView(r2);
        r2 = new android.widget.TextView;
        r2.<init>(r8);
        r7.mNextText = r2;
        r7.addView(r2);
        r2 = ATTRS;
        r2 = r8.obtainStyledAttributes(r9, r2);
        r3 = r2.getResourceId(r0, r0);
        if (r3 == 0) goto L_0x004f;
    L_0x0040:
        r4 = r7.mPrevText;	 Catch:{ IllegalStateException -> 0x00f1 }
        r4.setTextAppearance(r8, r3);	 Catch:{ IllegalStateException -> 0x00f1 }
        r4 = r7.mCurrText;	 Catch:{ IllegalStateException -> 0x00f1 }
        r4.setTextAppearance(r8, r3);	 Catch:{ IllegalStateException -> 0x00f1 }
        r4 = r7.mNextText;	 Catch:{ IllegalStateException -> 0x00f1 }
        r4.setTextAppearance(r8, r3);	 Catch:{ IllegalStateException -> 0x00f1 }
    L_0x004f:
        r4 = 1;
        r4 = r2.getDimensionPixelSize(r4, r0);
        if (r4 == 0) goto L_0x005b;
    L_0x0056:
        r5 = 0;
        r4 = (float) r4;
        r7.setTextSize(r5, r4);	 Catch:{ IllegalStateException -> 0x00f3 }
    L_0x005b:
        r4 = r2.hasValue(r6);
        if (r4 == 0) goto L_0x0074;
    L_0x0061:
        r4 = r2.getColor(r6, r0);
        r5 = r7.mPrevText;
        r5.setTextColor(r4);
        r5 = r7.mCurrText;
        r5.setTextColor(r4);
        r5 = r7.mNextText;
        r5.setTextColor(r4);
    L_0x0074:
        r4 = 3;
        r5 = 80;
        r4 = r2.getInteger(r4, r5);
        r7.mGravity = r4;
        r2.recycle();
        r2 = r7.mCurrText;
        r2 = r2.getTextColors();
        r2 = r2.getDefaultColor();
        r7.mTextColor = r2;
        r2 = 1058642330; // 0x3f19999a float:0.6 double:5.230388065E-315;
        r7.setNonPrimaryAlpha(r2);
        r2 = r7.mPrevText;
        r4 = android.text.TextUtils.TruncateAt.END;
        r2.setEllipsize(r4);
        r2 = r7.mCurrText;
        r4 = android.text.TextUtils.TruncateAt.END;
        r2.setEllipsize(r4);
        r2 = r7.mNextText;
        r4 = android.text.TextUtils.TruncateAt.END;
        r2.setEllipsize(r4);
        if (r3 == 0) goto L_0x00b6;
    L_0x00a9:
        r2 = TEXT_ATTRS;
        r2 = r8.obtainStyledAttributes(r3, r2);
        r0 = r2.getBoolean(r0, r0);
        r2.recycle();
    L_0x00b6:
        if (r0 == 0) goto L_0x00c9;
    L_0x00b8:
        r0 = r7.mPrevText;	 Catch:{ IllegalStateException -> 0x00f5 }
        setSingleLineAllCaps(r0);	 Catch:{ IllegalStateException -> 0x00f5 }
        r0 = r7.mCurrText;	 Catch:{ IllegalStateException -> 0x00f5 }
        setSingleLineAllCaps(r0);	 Catch:{ IllegalStateException -> 0x00f5 }
        r0 = r7.mNextText;	 Catch:{ IllegalStateException -> 0x00f5 }
        setSingleLineAllCaps(r0);	 Catch:{ IllegalStateException -> 0x00f5 }
        if (r1 == 0) goto L_0x00d8;
    L_0x00c9:
        r0 = r7.mPrevText;	 Catch:{ IllegalStateException -> 0x00f5 }
        r0.setSingleLine();	 Catch:{ IllegalStateException -> 0x00f5 }
        r0 = r7.mCurrText;	 Catch:{ IllegalStateException -> 0x00f5 }
        r0.setSingleLine();	 Catch:{ IllegalStateException -> 0x00f5 }
        r0 = r7.mNextText;	 Catch:{ IllegalStateException -> 0x00f5 }
        r0.setSingleLine();	 Catch:{ IllegalStateException -> 0x00f5 }
    L_0x00d8:
        r0 = r8.getResources();
        r0 = r0.getDisplayMetrics();
        r0 = r0.density;
        r2 = 1098907648; // 0x41800000 float:16.0 double:5.42932517E-315;
        r0 = r0 * r2;
        r0 = (int) r0;
        r7.mScaledTextSpacing = r0;	 Catch:{ IllegalStateException -> 0x00f7 }
        r0 = android.support.v4.app.FragmentActivity.a;	 Catch:{ IllegalStateException -> 0x00f7 }
        if (r0 == 0) goto L_0x00f0;
    L_0x00ec:
        r0 = r1 + 1;
        android.support.v4.view.ViewCompat.a = r0;	 Catch:{ IllegalStateException -> 0x00f7 }
    L_0x00f0:
        return;
    L_0x00f1:
        r0 = move-exception;
        throw r0;
    L_0x00f3:
        r0 = move-exception;
        throw r0;
    L_0x00f5:
        r0 = move-exception;
        throw r0;
    L_0x00f7:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.PagerTitleStrip.<init>(android.content.Context, android.util.AttributeSet):void");
    }
}
