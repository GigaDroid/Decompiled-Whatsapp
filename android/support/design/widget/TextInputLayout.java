package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.support.design.R;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.widget.Space;
import android.support.v7.widget.TintManager;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AccelerateInterpolator;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.v;
import org.whispersystems.at;

public class TextInputLayout extends LinearLayout {
    private static final String z;
    private ValueAnimatorCompat mAnimator;
    private final CollapsingTextHelper mCollapsingTextHelper;
    private boolean mCounterEnabled;
    private int mCounterMaxLength;
    private int mCounterOverflowTextAppearance;
    private boolean mCounterOverflowed;
    private int mCounterTextAppearance;
    private TextView mCounterView;
    private ColorStateList mDefaultTextColor;
    private EditText mEditText;
    private boolean mErrorEnabled;
    private boolean mErrorShown;
    private int mErrorTextAppearance;
    private TextView mErrorView;
    private ColorStateList mFocusedTextColor;
    private CharSequence mHint;
    private boolean mHintAnimationEnabled;
    private LinearLayout mIndicatorArea;
    private Paint mTmpPaint;

    class 1 implements TextWatcher {
        final TextInputLayout this$0;

        1(TextInputLayout textInputLayout) {
            this.this$0 = textInputLayout;
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void afterTextChanged(Editable editable) {
            TextInputLayout.access$100(this.this$0, true);
            if (TextInputLayout.access$200(this.this$0)) {
                TextInputLayout.access$300(this.this$0, editable.length());
            }
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    class 4 implements AnimatorUpdateListener {
        final TextInputLayout this$0;

        public void onAnimationUpdate(ValueAnimatorCompat valueAnimatorCompat) {
            TextInputLayout.access$400(this.this$0).setExpansionFraction(valueAnimatorCompat.getAnimatedFloatValue());
        }

        4(TextInputLayout textInputLayout) {
            this.this$0 = textInputLayout;
        }
    }

    class TextInputAccessibilityDelegate extends AccessibilityDelegateCompat {
        final TextInputLayout this$0;

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(TextInputLayout.class.getSimpleName());
        }

        private TextInputAccessibilityDelegate(TextInputLayout textInputLayout) {
            this.this$0 = textInputLayout;
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            CharSequence text = TextInputLayout.access$400(this.this$0).getText();
            if (!TextUtils.isEmpty(text)) {
                accessibilityEvent.getText().add(text);
            }
        }

        TextInputAccessibilityDelegate(TextInputLayout textInputLayout, 1 1) {
            this(textInputLayout);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setClassName(TextInputLayout.class.getSimpleName());
            CharSequence text = TextInputLayout.access$400(this.this$0).getText();
            if (!TextUtils.isEmpty(text)) {
                accessibilityNodeInfoCompat.setText(text);
            }
            if (TextInputLayout.access$500(this.this$0) != null) {
                accessibilityNodeInfoCompat.setLabelFor(TextInputLayout.access$500(this.this$0));
            }
            if (TextInputLayout.access$600(this.this$0) != null) {
                text = TextInputLayout.access$600(this.this$0).getText();
            } else {
                text = null;
            }
            if (!TextUtils.isEmpty(text)) {
                accessibilityNodeInfoCompat.setContentInvalid(true);
                accessibilityNodeInfoCompat.setError(text);
            }
        }
    }

    static {
        char[] toCharArray = "\u0015\u001a\u0012D&0\u001aSA3b\u0017SS/b\u001e\\\u0005\u000f&\u0016Fq/:\u000b\u001e\u0005)#\u0011\u0012J$.\u0006\u0012M+4\u001a\u0012J$'".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 66;
                    break;
                case at.g /*1*/:
                    i2 = 127;
                    break;
                case at.i /*2*/:
                    i2 = 50;
                    break;
                case at.o /*3*/:
                    i2 = 37;
                    break;
                default:
                    i2 = 74;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void updateLabelVisibility(boolean r7) {
        /*
        r6 = this;
        r1 = 1;
        r2 = 0;
        r3 = android.support.design.widget.CoordinatorLayout.a;
        r0 = r6.mEditText;	 Catch:{ IllegalArgumentException -> 0x0092 }
        if (r0 == 0) goto L_0x0096;
    L_0x0008:
        r0 = r6.mEditText;	 Catch:{ IllegalArgumentException -> 0x0094 }
        r0 = r0.getText();	 Catch:{ IllegalArgumentException -> 0x0094 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ IllegalArgumentException -> 0x0094 }
        if (r0 != 0) goto L_0x0096;
    L_0x0014:
        r0 = r1;
    L_0x0015:
        r4 = r6.getDrawableState();
        r5 = 16842908; // 0x101009c float:2.3693995E-38 double:8.321502E-317;
        r4 = arrayContains(r4, r5);
        r5 = r6.getError();	 Catch:{ IllegalArgumentException -> 0x0099 }
        r5 = android.text.TextUtils.isEmpty(r5);	 Catch:{ IllegalArgumentException -> 0x0099 }
        if (r5 != 0) goto L_0x009b;
    L_0x002a:
        r2 = r6.mDefaultTextColor;	 Catch:{ IllegalArgumentException -> 0x009d }
        if (r2 == 0) goto L_0x0039;
    L_0x002e:
        r2 = r6.mCollapsingTextHelper;	 Catch:{ IllegalArgumentException -> 0x009d }
        r5 = r6.mDefaultTextColor;	 Catch:{ IllegalArgumentException -> 0x009d }
        r5 = r5.getDefaultColor();	 Catch:{ IllegalArgumentException -> 0x009d }
        r2.setExpandedTextColor(r5);	 Catch:{ IllegalArgumentException -> 0x009d }
    L_0x0039:
        r2 = r6.mCounterOverflowed;	 Catch:{ IllegalArgumentException -> 0x009f }
        if (r2 == 0) goto L_0x004e;
    L_0x003d:
        r2 = r6.mCounterView;	 Catch:{ IllegalArgumentException -> 0x00a1 }
        if (r2 == 0) goto L_0x004e;
    L_0x0041:
        r2 = r6.mCollapsingTextHelper;	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r5 = r6.mCounterView;	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r5 = r5.getCurrentTextColor();	 Catch:{ IllegalArgumentException -> 0x00a3 }
        r2.setCollapsedTextColor(r5);	 Catch:{ IllegalArgumentException -> 0x00a3 }
        if (r3 == 0) goto L_0x0083;
    L_0x004e:
        if (r1 == 0) goto L_0x0061;
    L_0x0050:
        r2 = r6.mErrorView;	 Catch:{ IllegalArgumentException -> 0x00a7 }
        if (r2 == 0) goto L_0x0061;
    L_0x0054:
        r2 = r6.mCollapsingTextHelper;	 Catch:{ IllegalArgumentException -> 0x00a9 }
        r5 = r6.mErrorView;	 Catch:{ IllegalArgumentException -> 0x00a9 }
        r5 = r5.getCurrentTextColor();	 Catch:{ IllegalArgumentException -> 0x00a9 }
        r2.setCollapsedTextColor(r5);	 Catch:{ IllegalArgumentException -> 0x00a9 }
        if (r3 == 0) goto L_0x0083;
    L_0x0061:
        if (r4 == 0) goto L_0x0074;
    L_0x0063:
        r2 = r6.mFocusedTextColor;	 Catch:{ IllegalArgumentException -> 0x00ad }
        if (r2 == 0) goto L_0x0074;
    L_0x0067:
        r2 = r6.mCollapsingTextHelper;	 Catch:{ IllegalArgumentException -> 0x00af }
        r5 = r6.mFocusedTextColor;	 Catch:{ IllegalArgumentException -> 0x00af }
        r5 = r5.getDefaultColor();	 Catch:{ IllegalArgumentException -> 0x00af }
        r2.setCollapsedTextColor(r5);	 Catch:{ IllegalArgumentException -> 0x00af }
        if (r3 == 0) goto L_0x0083;
    L_0x0074:
        r2 = r6.mDefaultTextColor;	 Catch:{ IllegalArgumentException -> 0x00b1 }
        if (r2 == 0) goto L_0x0083;
    L_0x0078:
        r2 = r6.mCollapsingTextHelper;	 Catch:{ IllegalArgumentException -> 0x00b1 }
        r5 = r6.mDefaultTextColor;	 Catch:{ IllegalArgumentException -> 0x00b1 }
        r5 = r5.getDefaultColor();	 Catch:{ IllegalArgumentException -> 0x00b1 }
        r2.setCollapsedTextColor(r5);	 Catch:{ IllegalArgumentException -> 0x00b1 }
    L_0x0083:
        if (r0 != 0) goto L_0x0089;
    L_0x0085:
        if (r4 != 0) goto L_0x0089;
    L_0x0087:
        if (r1 == 0) goto L_0x008e;
    L_0x0089:
        r6.collapseHint(r7);	 Catch:{ IllegalArgumentException -> 0x00b3 }
        if (r3 == 0) goto L_0x0091;
    L_0x008e:
        r6.expandHint(r7);	 Catch:{ IllegalArgumentException -> 0x00b3 }
    L_0x0091:
        return;
    L_0x0092:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0094 }
    L_0x0094:
        r0 = move-exception;
        throw r0;
    L_0x0096:
        r0 = r2;
        goto L_0x0015;
    L_0x0099:
        r0 = move-exception;
        throw r0;
    L_0x009b:
        r1 = r2;
        goto L_0x002a;
    L_0x009d:
        r0 = move-exception;
        throw r0;
    L_0x009f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00a1 }
    L_0x00a1:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00a3 }
    L_0x00a3:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00a5 }
    L_0x00a5:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00a7 }
    L_0x00a7:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00a9 }
    L_0x00a9:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00ab }
    L_0x00ab:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00ad }
    L_0x00ad:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00af }
    L_0x00af:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00b1 }
    L_0x00b1:
        r0 = move-exception;
        throw r0;
    L_0x00b3:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.TextInputLayout.updateLabelVisibility(boolean):void");
    }

    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.mCollapsingTextHelper = new CollapsingTextHelper(this);
        ThemeUtils.checkAppCompatTheme(context);
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        this.mCollapsingTextHelper.setTextSizeInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
        this.mCollapsingTextHelper.setPositionInterpolator(new AccelerateInterpolator());
        this.mCollapsingTextHelper.setCollapsedTextGravity(8388659);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TextInputLayout, i, R.style.Widget_Design_TextInputLayout);
        try {
            setHint(obtainStyledAttributes.getText(R.styleable.TextInputLayout_android_hint));
            this.mHintAnimationEnabled = obtainStyledAttributes.getBoolean(R.styleable.TextInputLayout_hintAnimationEnabled, true);
            if (obtainStyledAttributes.hasValue(R.styleable.TextInputLayout_android_textColorHint)) {
                ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(R.styleable.TextInputLayout_android_textColorHint);
                this.mFocusedTextColor = colorStateList;
                this.mDefaultTextColor = colorStateList;
            }
            if (obtainStyledAttributes.getResourceId(R.styleable.TextInputLayout_hintTextAppearance, -1) != -1) {
                try {
                    setHintTextAppearance(obtainStyledAttributes.getResourceId(R.styleable.TextInputLayout_hintTextAppearance, 0));
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            this.mErrorTextAppearance = obtainStyledAttributes.getResourceId(R.styleable.TextInputLayout_errorTextAppearance, 0);
            boolean z = obtainStyledAttributes.getBoolean(R.styleable.TextInputLayout_errorEnabled, false);
            boolean z2 = obtainStyledAttributes.getBoolean(R.styleable.TextInputLayout_counterEnabled, false);
            try {
                setCounterMaxLength(obtainStyledAttributes.getInt(R.styleable.TextInputLayout_counterMaxLength, -1));
                this.mCounterTextAppearance = obtainStyledAttributes.getResourceId(R.styleable.TextInputLayout_counterTextAppearance, 0);
                this.mCounterOverflowTextAppearance = obtainStyledAttributes.getResourceId(R.styleable.TextInputLayout_counterOverflowTextAppearance, 0);
                obtainStyledAttributes.recycle();
                setErrorEnabled(z);
                setCounterEnabled(z2);
                if (ViewCompat.getImportantForAccessibility(this) == 0) {
                    ViewCompat.setImportantForAccessibility(this, 1);
                }
                ViewCompat.setAccessibilityDelegate(this, new TextInputAccessibilityDelegate(this, null));
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void updateCounter(int r9) {
        /*
        r8 = this;
        r1 = 1;
        r2 = 0;
        r3 = r8.mCounterOverflowed;
        r0 = r8.mCounterMaxLength;	 Catch:{ IllegalArgumentException -> 0x0063 }
        r4 = -1;
        if (r0 != r4) goto L_0x0019;
    L_0x0009:
        r0 = r8.mCounterView;	 Catch:{ IllegalArgumentException -> 0x0065 }
        r4 = java.lang.String.valueOf(r9);	 Catch:{ IllegalArgumentException -> 0x0065 }
        r0.setText(r4);	 Catch:{ IllegalArgumentException -> 0x0065 }
        r0 = 0;
        r8.mCounterOverflowed = r0;	 Catch:{ IllegalArgumentException -> 0x0065 }
        r0 = android.support.design.widget.CoordinatorLayout.a;	 Catch:{ IllegalArgumentException -> 0x0065 }
        if (r0 == 0) goto L_0x0053;
    L_0x0019:
        r0 = r8.mCounterMaxLength;	 Catch:{ IllegalArgumentException -> 0x0067 }
        if (r9 <= r0) goto L_0x0069;
    L_0x001d:
        r0 = r1;
    L_0x001e:
        r8.mCounterOverflowed = r0;	 Catch:{ IllegalArgumentException -> 0x006b }
        r0 = r8.mCounterOverflowed;	 Catch:{ IllegalArgumentException -> 0x006b }
        if (r3 == r0) goto L_0x0033;
    L_0x0024:
        r4 = r8.mCounterView;	 Catch:{ IllegalArgumentException -> 0x006d }
        r5 = r8.getContext();	 Catch:{ IllegalArgumentException -> 0x006d }
        r0 = r8.mCounterOverflowed;	 Catch:{ IllegalArgumentException -> 0x006d }
        if (r0 == 0) goto L_0x006f;
    L_0x002e:
        r0 = r8.mCounterOverflowTextAppearance;	 Catch:{ IllegalArgumentException -> 0x006d }
    L_0x0030:
        r4.setTextAppearance(r5, r0);
    L_0x0033:
        r0 = r8.mCounterView;
        r4 = r8.getContext();
        r5 = android.support.design.R.string.character_counter_pattern;
        r6 = 2;
        r6 = new java.lang.Object[r6];
        r7 = java.lang.Integer.valueOf(r9);
        r6[r2] = r7;
        r2 = r8.mCounterMaxLength;
        r2 = java.lang.Integer.valueOf(r2);
        r6[r1] = r2;
        r1 = r4.getString(r5, r6);
        r0.setText(r1);
    L_0x0053:
        r0 = r8.mEditText;	 Catch:{ IllegalArgumentException -> 0x0072 }
        if (r0 == 0) goto L_0x0062;
    L_0x0057:
        r0 = r8.mCounterOverflowed;	 Catch:{ IllegalArgumentException -> 0x0074 }
        if (r3 == r0) goto L_0x0062;
    L_0x005b:
        r0 = 0;
        r8.updateLabelVisibility(r0);	 Catch:{ IllegalArgumentException -> 0x0074 }
        r8.updateEditTextBackground();	 Catch:{ IllegalArgumentException -> 0x0074 }
    L_0x0062:
        return;
    L_0x0063:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0065 }
    L_0x0065:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0067 }
    L_0x0067:
        r0 = move-exception;
        throw r0;
    L_0x0069:
        r0 = r2;
        goto L_0x001e;
    L_0x006b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x006d }
    L_0x006d:
        r0 = move-exception;
        throw r0;
    L_0x006f:
        r0 = r8.mCounterTextAppearance;
        goto L_0x0030;
    L_0x0072:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0074 }
    L_0x0074:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.TextInputLayout.updateCounter(int):void");
    }

    @Nullable
    public CharSequence getError() {
        try {
            if (this.mErrorEnabled) {
                if (this.mErrorView != null) {
                    try {
                        if (this.mErrorView.getVisibility() == 0) {
                            return this.mErrorView.getText();
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
            }
            return null;
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setCounterEnabled(boolean r5) {
        /*
        r4 = this;
        r0 = android.support.design.widget.CoordinatorLayout.a;
        r1 = r4.mCounterEnabled;	 Catch:{ IllegalArgumentException -> 0x0054 }
        if (r1 == r5) goto L_0x0053;
    L_0x0006:
        if (r5 == 0) goto L_0x0049;
    L_0x0008:
        r1 = new android.widget.TextView;	 Catch:{ IllegalArgumentException -> 0x0058 }
        r2 = r4.getContext();	 Catch:{ IllegalArgumentException -> 0x0058 }
        r1.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0058 }
        r4.mCounterView = r1;	 Catch:{ IllegalArgumentException -> 0x0058 }
        r1 = r4.mCounterView;	 Catch:{ IllegalArgumentException -> 0x0058 }
        r2 = 1;
        r1.setMaxLines(r2);	 Catch:{ IllegalArgumentException -> 0x0058 }
        r1 = r4.mCounterView;	 Catch:{ IllegalArgumentException -> 0x0058 }
        r2 = r4.getContext();	 Catch:{ IllegalArgumentException -> 0x0058 }
        r3 = r4.mCounterTextAppearance;	 Catch:{ IllegalArgumentException -> 0x0058 }
        r1.setTextAppearance(r2, r3);	 Catch:{ IllegalArgumentException -> 0x0058 }
        r1 = r4.mCounterView;	 Catch:{ IllegalArgumentException -> 0x0058 }
        r2 = 1;
        android.support.v4.view.ViewCompat.setAccessibilityLiveRegion(r1, r2);	 Catch:{ IllegalArgumentException -> 0x0058 }
        r1 = r4.mCounterView;	 Catch:{ IllegalArgumentException -> 0x0058 }
        r2 = -1;
        r4.addIndicator(r1, r2);	 Catch:{ IllegalArgumentException -> 0x0058 }
        r1 = r4.mEditText;	 Catch:{ IllegalArgumentException -> 0x0058 }
        if (r1 != 0) goto L_0x003a;
    L_0x0034:
        r1 = 0;
        r4.updateCounter(r1);	 Catch:{ IllegalArgumentException -> 0x005a }
        if (r0 == 0) goto L_0x0051;
    L_0x003a:
        r1 = r4.mEditText;	 Catch:{ IllegalArgumentException -> 0x005c }
        r1 = r1.getText();	 Catch:{ IllegalArgumentException -> 0x005c }
        r1 = r1.length();	 Catch:{ IllegalArgumentException -> 0x005c }
        r4.updateCounter(r1);	 Catch:{ IllegalArgumentException -> 0x005c }
        if (r0 == 0) goto L_0x0051;
    L_0x0049:
        r0 = r4.mCounterView;	 Catch:{ IllegalArgumentException -> 0x005c }
        r4.removeIndicator(r0);	 Catch:{ IllegalArgumentException -> 0x005c }
        r0 = 0;
        r4.mCounterView = r0;	 Catch:{ IllegalArgumentException -> 0x005c }
    L_0x0051:
        r4.mCounterEnabled = r5;
    L_0x0053:
        return;
    L_0x0054:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0056 }
    L_0x0056:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0058 }
    L_0x0058:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x005a }
    L_0x005a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x005c }
    L_0x005c:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.TextInputLayout.setCounterEnabled(boolean):void");
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        try {
            if (view instanceof EditText) {
                setEditText((EditText) view);
                super.addView(view, 0, updateEditTextMargin(layoutParams));
                if (!CoordinatorLayout.a) {
                    return;
                }
            }
            super.addView(view, i, layoutParams);
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    private void removeIndicator(TextView textView) {
        try {
            if (this.mIndicatorArea != null) {
                this.mIndicatorArea.removeView(textView);
                if (this.mIndicatorArea.getChildCount() == 0) {
                    this.mIndicatorArea.setVisibility(8);
                }
            }
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }

    private void collapseHint(boolean z) {
        try {
            if (this.mAnimator != null) {
                if (this.mAnimator.isRunning()) {
                    this.mAnimator.cancel();
                }
            }
            if (z) {
                try {
                    if (this.mHintAnimationEnabled) {
                        animateToExpansionFraction(1.0f);
                        if (!CoordinatorLayout.a) {
                            return;
                        }
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
            this.mCollapsingTextHelper.setExpansionFraction(1.0f);
        } catch (IllegalArgumentException e22) {
            throw e22;
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }

    private void adjustIndicatorPadding() {
        ViewCompat.setPaddingRelative(this.mIndicatorArea, ViewCompat.getPaddingStart(this.mEditText), 0, ViewCompat.getPaddingEnd(this.mEditText), this.mEditText.getPaddingBottom());
    }

    private void expandHint(boolean z) {
        try {
            if (this.mAnimator != null) {
                if (this.mAnimator.isRunning()) {
                    this.mAnimator.cancel();
                }
            }
            if (z) {
                try {
                    if (this.mHintAnimationEnabled) {
                        animateToExpansionFraction(0.0f);
                        if (!CoordinatorLayout.a) {
                            return;
                        }
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
            this.mCollapsingTextHelper.setExpansionFraction(0.0f);
        } catch (IllegalArgumentException e22) {
            throw e22;
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }

    private void setEditText(EditText editText) {
        try {
            if (this.mEditText != null) {
                throw new IllegalArgumentException(z);
            }
            try {
                this.mEditText = editText;
                this.mCollapsingTextHelper.setTypefaces(this.mEditText.getTypeface());
                this.mCollapsingTextHelper.setExpandedTextSize(this.mEditText.getTextSize());
                this.mCollapsingTextHelper.setExpandedTextGravity(this.mEditText.getGravity());
                this.mEditText.addTextChangedListener(new 1(this));
                if (this.mDefaultTextColor == null) {
                    this.mDefaultTextColor = this.mEditText.getHintTextColors();
                }
                try {
                    if (TextUtils.isEmpty(this.mHint)) {
                        setHint(this.mEditText.getHint());
                        this.mEditText.setHint(null);
                    }
                    try {
                        if (this.mCounterView != null) {
                            updateCounter(this.mEditText.getText().length());
                        }
                        try {
                            if (this.mIndicatorArea != null) {
                                adjustIndicatorPadding();
                            }
                            updateLabelVisibility(false);
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                } catch (IllegalArgumentException e22) {
                    throw e22;
                }
            } catch (IllegalArgumentException e222) {
                throw e222;
            }
        } catch (IllegalArgumentException e2222) {
            throw e2222;
        }
    }

    private LinearLayout.LayoutParams updateEditTextMargin(LayoutParams layoutParams) {
        try {
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                layoutParams = (LinearLayout.LayoutParams) layoutParams;
            } else {
                layoutParams = new LinearLayout.LayoutParams(layoutParams);
            }
            try {
                if (this.mTmpPaint == null) {
                    this.mTmpPaint = new Paint();
                }
                this.mTmpPaint.setTypeface(this.mCollapsingTextHelper.getCollapsedTypeface());
                this.mTmpPaint.setTextSize(this.mCollapsingTextHelper.getCollapsedTextSize());
                layoutParams.topMargin = (int) (-this.mTmpPaint.ascent());
                return layoutParams;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    static boolean access$200(TextInputLayout textInputLayout) {
        return textInputLayout.mCounterEnabled;
    }

    public void setHintTextAppearance(@StyleRes int i) {
        this.mCollapsingTextHelper.setCollapsedTextAppearance(i);
        this.mFocusedTextColor = ColorStateList.valueOf(this.mCollapsingTextHelper.getCollapsedTextColor());
        if (this.mEditText != null) {
            updateLabelVisibility(false);
            this.mEditText.setLayoutParams(updateEditTextMargin(this.mEditText.getLayoutParams()));
            this.mEditText.requestLayout();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setCounterMaxLength(int r2) {
        /*
        r1 = this;
        r0 = r1.mCounterMaxLength;	 Catch:{ IllegalArgumentException -> 0x001c }
        if (r0 == r2) goto L_0x001b;
    L_0x0004:
        if (r2 <= 0) goto L_0x000c;
    L_0x0006:
        r1.mCounterMaxLength = r2;	 Catch:{ IllegalArgumentException -> 0x0020 }
        r0 = android.support.design.widget.CoordinatorLayout.a;	 Catch:{ IllegalArgumentException -> 0x0020 }
        if (r0 == 0) goto L_0x000f;
    L_0x000c:
        r0 = -1;
        r1.mCounterMaxLength = r0;	 Catch:{ IllegalArgumentException -> 0x0020 }
    L_0x000f:
        r0 = r1.mCounterEnabled;	 Catch:{ IllegalArgumentException -> 0x0022 }
        if (r0 == 0) goto L_0x001b;
    L_0x0013:
        r0 = r1.mEditText;	 Catch:{ IllegalArgumentException -> 0x0024 }
        if (r0 != 0) goto L_0x0026;
    L_0x0017:
        r0 = 0;
    L_0x0018:
        r1.updateCounter(r0);
    L_0x001b:
        return;
    L_0x001c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x001e }
    L_0x001e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0020 }
    L_0x0020:
        r0 = move-exception;
        throw r0;
    L_0x0022:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0024 }
    L_0x0024:
        r0 = move-exception;
        throw r0;
    L_0x0026:
        r0 = r1.mEditText;
        r0 = r0.getText();
        r0 = r0.length();
        goto L_0x0018;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.TextInputLayout.setCounterMaxLength(int):void");
    }

    public void setHint(@Nullable CharSequence charSequence) {
        this.mHint = charSequence;
        this.mCollapsingTextHelper.setText(charSequence);
        sendAccessibilityEvent(2048);
    }

    private void updateEditTextBackground() {
        boolean z = CoordinatorLayout.a;
        try {
            if (this.mErrorShown) {
                if (this.mErrorView != null) {
                    try {
                        ViewCompat.setBackgroundTintList(this.mEditText, ColorStateList.valueOf(this.mErrorView.getCurrentTextColor()));
                        if (!z) {
                            return;
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
            }
            try {
                if (this.mCounterOverflowed) {
                    try {
                        if (this.mCounterView != null) {
                            ViewCompat.setBackgroundTintList(this.mEditText, ColorStateList.valueOf(this.mCounterView.getCurrentTextColor()));
                            if (!z) {
                                return;
                            }
                        }
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                }
                ViewCompat.setBackgroundTintList(this.mEditText, TintManager.get(getContext()).getTintList(R.drawable.abc_edit_text_material));
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        } catch (IllegalArgumentException e222) {
            throw e222;
        } catch (IllegalArgumentException e2222) {
            throw e2222;
        }
    }

    static EditText access$500(TextInputLayout textInputLayout) {
        return textInputLayout.mEditText;
    }

    public void refreshDrawableState() {
        super.refreshDrawableState();
        updateLabelVisibility(ViewCompat.isLaidOut(this));
    }

    static void access$100(TextInputLayout textInputLayout, boolean z) {
        textInputLayout.updateLabelVisibility(z);
    }

    private void animateToExpansionFraction(float f) {
        try {
            if (this.mCollapsingTextHelper.getExpansionFraction() != f) {
                try {
                    if (this.mAnimator == null) {
                        this.mAnimator = ViewUtils.createAnimator();
                        this.mAnimator.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
                        this.mAnimator.setDuration(200);
                        this.mAnimator.setUpdateListener(new 4(this));
                    }
                    this.mAnimator.setFloatValues(this.mCollapsingTextHelper.getExpansionFraction(), f);
                    this.mAnimator.start();
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.mEditText != null) {
            int left = this.mEditText.getLeft() + this.mEditText.getCompoundPaddingLeft();
            int right = this.mEditText.getRight() - this.mEditText.getCompoundPaddingRight();
            this.mCollapsingTextHelper.setExpandedBounds(left, this.mEditText.getTop() + this.mEditText.getCompoundPaddingTop(), right, this.mEditText.getBottom() - this.mEditText.getCompoundPaddingBottom());
            this.mCollapsingTextHelper.setCollapsedBounds(left, getPaddingTop(), right, (i4 - i2) - getPaddingBottom());
            this.mCollapsingTextHelper.recalculate();
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        this.mCollapsingTextHelper.draw(canvas);
    }

    private void addIndicator(TextView textView, int i) {
        if (this.mIndicatorArea == null) {
            this.mIndicatorArea = new LinearLayout(getContext());
            this.mIndicatorArea.setOrientation(0);
            addView(this.mIndicatorArea, -1, -2);
            try {
                this.mIndicatorArea.addView(new Space(getContext()), new LinearLayout.LayoutParams(0, 0, 1.0f));
                if (this.mEditText != null) {
                    adjustIndicatorPadding();
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        this.mIndicatorArea.setVisibility(0);
        this.mIndicatorArea.addView(textView, i);
    }

    private static boolean arrayContains(int[] iArr, int i) {
        boolean z = CoordinatorLayout.a;
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            if (iArr[i2] == i) {
                return true;
            }
            i2++;
            if (z) {
                return false;
            }
        }
        return false;
    }

    static CollapsingTextHelper access$400(TextInputLayout textInputLayout) {
        return textInputLayout.mCollapsingTextHelper;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setErrorEnabled(boolean r4) {
        /*
        r3 = this;
        r0 = r3.mErrorEnabled;	 Catch:{ IllegalArgumentException -> 0x0050 }
        if (r0 == r4) goto L_0x004f;
    L_0x0004:
        r0 = r3.mErrorView;	 Catch:{ IllegalArgumentException -> 0x0052 }
        if (r0 == 0) goto L_0x0011;
    L_0x0008:
        r0 = r3.mErrorView;	 Catch:{ IllegalArgumentException -> 0x0052 }
        r0 = android.support.v4.view.ViewCompat.animate(r0);	 Catch:{ IllegalArgumentException -> 0x0052 }
        r0.cancel();	 Catch:{ IllegalArgumentException -> 0x0052 }
    L_0x0011:
        if (r4 == 0) goto L_0x003f;
    L_0x0013:
        r0 = new android.widget.TextView;	 Catch:{ IllegalArgumentException -> 0x0054 }
        r1 = r3.getContext();	 Catch:{ IllegalArgumentException -> 0x0054 }
        r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0054 }
        r3.mErrorView = r0;	 Catch:{ IllegalArgumentException -> 0x0054 }
        r0 = r3.mErrorView;	 Catch:{ IllegalArgumentException -> 0x0054 }
        r1 = r3.getContext();	 Catch:{ IllegalArgumentException -> 0x0054 }
        r2 = r3.mErrorTextAppearance;	 Catch:{ IllegalArgumentException -> 0x0054 }
        r0.setTextAppearance(r1, r2);	 Catch:{ IllegalArgumentException -> 0x0054 }
        r0 = r3.mErrorView;	 Catch:{ IllegalArgumentException -> 0x0054 }
        r1 = 4;
        r0.setVisibility(r1);	 Catch:{ IllegalArgumentException -> 0x0054 }
        r0 = r3.mErrorView;	 Catch:{ IllegalArgumentException -> 0x0054 }
        r1 = 1;
        android.support.v4.view.ViewCompat.setAccessibilityLiveRegion(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0054 }
        r0 = r3.mErrorView;	 Catch:{ IllegalArgumentException -> 0x0054 }
        r1 = 0;
        r3.addIndicator(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0054 }
        r0 = android.support.design.widget.CoordinatorLayout.a;	 Catch:{ IllegalArgumentException -> 0x0054 }
        if (r0 == 0) goto L_0x004d;
    L_0x003f:
        r0 = 0;
        r3.mErrorShown = r0;	 Catch:{ IllegalArgumentException -> 0x0054 }
        r3.updateEditTextBackground();	 Catch:{ IllegalArgumentException -> 0x0054 }
        r0 = r3.mErrorView;	 Catch:{ IllegalArgumentException -> 0x0054 }
        r3.removeIndicator(r0);	 Catch:{ IllegalArgumentException -> 0x0054 }
        r0 = 0;
        r3.mErrorView = r0;	 Catch:{ IllegalArgumentException -> 0x0054 }
    L_0x004d:
        r3.mErrorEnabled = r4;
    L_0x004f:
        return;
    L_0x0050:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0052 }
    L_0x0052:
        r0 = move-exception;
        throw r0;
    L_0x0054:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.TextInputLayout.setErrorEnabled(boolean):void");
    }

    static TextView access$600(TextInputLayout textInputLayout) {
        return textInputLayout.mErrorView;
    }

    static void access$300(TextInputLayout textInputLayout, int i) {
        textInputLayout.updateCounter(i);
    }
}
