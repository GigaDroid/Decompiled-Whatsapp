package android.support.v7.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v7.appcompat.R;
import android.support.v7.view.ActionMode;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

public class ActionBarContextView extends AbsActionBarView {
    private static final String[] z;
    private View mClose;
    private int mCloseItemLayout;
    private View mCustomView;
    private CharSequence mSubtitle;
    private int mSubtitleStyleRes;
    private TextView mSubtitleView;
    private CharSequence mTitle;
    private LinearLayout mTitleLayout;
    private boolean mTitleOptional;
    private int mTitleStyleRes;
    private TextView mTitleView;

    class 1 implements OnClickListener {
        final ActionBarContextView this$0;
        final ActionMode val$mode;

        public void onClick(View view) {
            this.val$mode.finish();
        }

        1(ActionBarContextView actionBarContextView, ActionMode actionMode) {
            this.this$0 = actionBarContextView;
            this.val$mode = actionMode;
        }
    }

    static {
        String[] strArr = new String[4];
        String str = "EJ[Nh\nGVYh\u0007L\u001aU;\u0000M\u001a";
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
                        i3 = arj.Theme_buttonStyleSmall;
                        break;
                    case at.g /*1*/:
                        i3 = 41;
                        break;
                    case at.i /*2*/:
                        i3 = 58;
                        break;
                    case at.o /*3*/:
                        i3 = 32;
                        break;
                    default:
                        i3 = 72;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "EJ[Nh\nGVYh\u0007L\u001aU;\u0000M\u001a";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u0012@NHh\u0004G^R'\fM\u0000L)\u001cFOT\u0017\u0012@^T X\u000bWA<\u0006AeP)\u0017LTTjE\u0001URh\u0003@VL\u0017\u0015HHE&\u0011\u0000";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0012@NHh\u0004G^R'\fM\u0000L)\u001cFOT\u0017\rLSG \u0011\u0014\u0018W:\u0004YeC'\u000b]_N<G";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    private void initTitle() {
        int i = 1;
        int i2 = 0;
        if (this.mTitleLayout == null) {
            try {
                LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
                this.mTitleLayout = (LinearLayout) getChildAt(getChildCount() - 1);
                this.mTitleView = (TextView) this.mTitleLayout.findViewById(R.id.action_bar_title);
                this.mSubtitleView = (TextView) this.mTitleLayout.findViewById(R.id.action_bar_subtitle);
                if (this.mTitleStyleRes != 0) {
                    this.mTitleView.setTextAppearance(getContext(), this.mTitleStyleRes);
                }
                try {
                    if (this.mSubtitleStyleRes != 0) {
                        this.mSubtitleView.setTextAppearance(getContext(), this.mSubtitleStyleRes);
                    }
                } catch (IllegalStateException e) {
                    throw e;
                }
            } catch (IllegalStateException e2) {
                throw e2;
            }
        }
        try {
            this.mTitleView.setText(this.mTitle);
            this.mSubtitleView.setText(this.mSubtitle);
            int i3 = !TextUtils.isEmpty(this.mTitle) ? 1 : 0;
            try {
                if (TextUtils.isEmpty(this.mSubtitle)) {
                    i = 0;
                }
                try {
                    try {
                        this.mSubtitleView.setVisibility(i != 0 ? 0 : 8);
                        LinearLayout linearLayout = this.mTitleLayout;
                        if (i3 == 0 && i == 0) {
                            i2 = 8;
                        }
                        try {
                            linearLayout.setVisibility(i2);
                            if (this.mTitleLayout.getParent() == null) {
                                addView(this.mTitleLayout);
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
            } catch (IllegalStateException e222222) {
                throw e222222;
            }
        } catch (IllegalStateException e2222222) {
            throw e2222222;
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        this.mSubtitle = charSequence;
        initTitle();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void closeMode() {
        try {
            if (this.mClose == null) {
                killMode();
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, R.styleable.ActionMode, i, 0);
        setBackgroundDrawable(obtainStyledAttributes.getDrawable(R.styleable.ActionMode_background));
        this.mTitleStyleRes = obtainStyledAttributes.getResourceId(R.styleable.ActionMode_titleTextStyle, 0);
        this.mSubtitleStyleRes = obtainStyledAttributes.getResourceId(R.styleable.ActionMode_subtitleTextStyle, 0);
        this.mContentHeight = obtainStyledAttributes.getLayoutDimension(R.styleable.ActionMode_height, 0);
        this.mCloseItemLayout = obtainStyledAttributes.getResourceId(R.styleable.ActionMode_closeItemLayout, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public boolean isTitleOptional() {
        return this.mTitleOptional;
    }

    public void setContentHeight(int i) {
        this.mContentHeight = i;
    }

    public void setTitleOptional(boolean z) {
        try {
            if (z != this.mTitleOptional) {
                requestLayout();
            }
            this.mTitleOptional = z;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public boolean showOverflowMenu() {
        try {
            return this.mActionMenuPresenter != null ? this.mActionMenuPresenter.showOverflowMenu() : false;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void setCustomView(View view) {
        try {
            if (this.mCustomView != null) {
                removeView(this.mCustomView);
            }
            try {
                this.mCustomView = view;
                if (view != null) {
                    if (this.mTitleLayout != null) {
                        removeView(this.mTitleLayout);
                        this.mTitleLayout = null;
                    }
                }
                if (view != null) {
                    try {
                        addView(view);
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
                requestLayout();
            } catch (IllegalStateException e2) {
                throw e2;
            } catch (IllegalStateException e22) {
                throw e22;
            }
        } catch (IllegalStateException e222) {
            throw e222;
        }
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public CharSequence getSubtitle() {
        return this.mSubtitle;
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new MarginLayoutParams(-1, -2);
    }

    public void killMode() {
        removeAllViews();
        this.mCustomView = null;
        this.mMenuView = null;
    }

    public CharSequence getTitle() {
        return this.mTitle;
    }

    public ViewPropertyAnimatorCompat setupAnimatorToVisibility(int i, long j) {
        return super.setupAnimatorToVisibility(i, j);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    public void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
            if (this.mActionMenuPresenter != null) {
                this.mActionMenuPresenter.hideOverflowMenu();
                this.mActionMenuPresenter.hideSubMenus();
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initForMode(android.support.v7.view.ActionMode r5) {
        /*
        r4 = this;
        r0 = r4.mClose;
        if (r0 != 0) goto L_0x001e;
    L_0x0004:
        r0 = r4.getContext();
        r0 = android.view.LayoutInflater.from(r0);
        r1 = r4.mCloseItemLayout;	 Catch:{ IllegalStateException -> 0x007f }
        r2 = 0;
        r0 = r0.inflate(r1, r4, r2);	 Catch:{ IllegalStateException -> 0x007f }
        r4.mClose = r0;	 Catch:{ IllegalStateException -> 0x007f }
        r0 = r4.mClose;	 Catch:{ IllegalStateException -> 0x007f }
        r4.addView(r0);	 Catch:{ IllegalStateException -> 0x007f }
        r0 = android.support.v7.widget.LinearLayoutCompat.a;	 Catch:{ IllegalStateException -> 0x007f }
        if (r0 == 0) goto L_0x002b;
    L_0x001e:
        r0 = r4.mClose;	 Catch:{ IllegalStateException -> 0x0081 }
        r0 = r0.getParent();	 Catch:{ IllegalStateException -> 0x0081 }
        if (r0 != 0) goto L_0x002b;
    L_0x0026:
        r0 = r4.mClose;	 Catch:{ IllegalStateException -> 0x0081 }
        r4.addView(r0);	 Catch:{ IllegalStateException -> 0x0081 }
    L_0x002b:
        r0 = r4.mClose;
        r1 = android.support.v7.appcompat.R.id.action_mode_close_button;
        r0 = r0.findViewById(r1);
        r1 = new android.support.v7.widget.ActionBarContextView$1;
        r1.<init>(r4, r5);
        r0.setOnClickListener(r1);
        r0 = r5.getMenu();
        r0 = (android.support.v7.view.menu.MenuBuilder) r0;
        r1 = r4.mActionMenuPresenter;	 Catch:{ IllegalStateException -> 0x0083 }
        if (r1 == 0) goto L_0x004a;
    L_0x0045:
        r1 = r4.mActionMenuPresenter;	 Catch:{ IllegalStateException -> 0x0083 }
        r1.dismissPopupMenus();	 Catch:{ IllegalStateException -> 0x0083 }
    L_0x004a:
        r1 = new android.support.v7.widget.ActionMenuPresenter;
        r2 = r4.getContext();
        r1.<init>(r2);
        r4.mActionMenuPresenter = r1;
        r1 = r4.mActionMenuPresenter;
        r2 = 1;
        r1.setReserveOverflow(r2);
        r1 = new android.view.ViewGroup$LayoutParams;
        r2 = -2;
        r3 = -1;
        r1.<init>(r2, r3);
        r2 = r4.mActionMenuPresenter;
        r3 = r4.mPopupContext;
        r0.addMenuPresenter(r2, r3);
        r0 = r4.mActionMenuPresenter;
        r0 = r0.getMenuView(r4);
        r0 = (android.support.v7.widget.ActionMenuView) r0;
        r4.mMenuView = r0;
        r0 = r4.mMenuView;
        r2 = 0;
        r0.setBackgroundDrawable(r2);
        r0 = r4.mMenuView;
        r4.addView(r0, r1);
        return;
    L_0x007f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0081 }
    L_0x0081:
        r0 = move-exception;
        throw r0;
    L_0x0083:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionBarContextView.initForMode(android.support.v7.view.ActionMode):void");
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new MarginLayoutParams(getContext(), attributeSet);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        try {
            if (VERSION.SDK_INT >= 14) {
                if (accessibilityEvent.getEventType() == 32) {
                    try {
                        accessibilityEvent.setSource(this);
                        accessibilityEvent.setClassName(getClass().getName());
                        accessibilityEvent.setPackageName(getContext().getPackageName());
                        accessibilityEvent.setContentDescription(this.mTitle);
                        if (!LinearLayoutCompat.a) {
                            return;
                        }
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
                super.onInitializeAccessibilityEvent(accessibilityEvent);
            }
        } catch (IllegalStateException e2) {
            throw e2;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean isLayoutRtl = ViewUtils.isLayoutRtl(this);
        if (isLayoutRtl) {
            try {
                int paddingRight = (i3 - i) - getPaddingRight();
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        paddingRight = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        try {
            int i5;
            if (this.mClose == null || this.mClose.getVisibility() == 8) {
                i5 = paddingRight;
            } else {
                int i6;
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.mClose.getLayoutParams();
                if (isLayoutRtl) {
                    try {
                        i5 = marginLayoutParams.rightMargin;
                    } catch (IllegalStateException e2) {
                        throw e2;
                    }
                }
                i5 = marginLayoutParams.leftMargin;
                if (isLayoutRtl) {
                    try {
                        i6 = marginLayoutParams.leftMargin;
                    } catch (IllegalStateException e22) {
                        throw e22;
                    }
                }
                i6 = marginLayoutParams.rightMargin;
                i5 = AbsActionBarView.next(paddingRight, i5, isLayoutRtl);
                i5 = AbsActionBarView.next(positionChild(this.mClose, i5, paddingTop, paddingTop2, isLayoutRtl) + i5, i6, isLayoutRtl);
            }
            try {
                int positionChild;
                if (this.mTitleLayout != null) {
                    if (this.mCustomView == null && this.mTitleLayout.getVisibility() != 8) {
                        i5 += positionChild(this.mTitleLayout, i5, paddingTop, paddingTop2, isLayoutRtl);
                    }
                }
                if (this.mCustomView != null) {
                    positionChild = positionChild(this.mCustomView, i5, paddingTop, paddingTop2, isLayoutRtl) + i5;
                }
                if (isLayoutRtl) {
                    try {
                        i5 = getPaddingLeft();
                    } catch (IllegalStateException e222) {
                        throw e222;
                    }
                }
                i5 = (i3 - i) - getPaddingRight();
                try {
                    if (this.mMenuView != null) {
                        View view = this.mMenuView;
                        if (isLayoutRtl) {
                            isLayoutRtl = false;
                        } else {
                            isLayoutRtl = true;
                        }
                        positionChild = positionChild(view, i5, paddingTop, paddingTop2, isLayoutRtl) + i5;
                    }
                } catch (IllegalStateException e2222) {
                    throw e2222;
                } catch (IllegalStateException e22222) {
                    throw e22222;
                }
            } catch (IllegalStateException e222222) {
                throw e222222;
            } catch (IllegalStateException e2222222) {
                throw e2222222;
            }
        } catch (IllegalStateException e22222222) {
            throw e22222222;
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.mTitle = charSequence;
        initTitle();
    }

    protected void onMeasure(int i, int i2) {
        boolean z = LinearLayoutCompat.a;
        if (MeasureSpec.getMode(i) != 1073741824) {
            try {
                throw new IllegalStateException(getClass().getSimpleName() + z[0] + z[3]);
            } catch (IllegalStateException e) {
                throw e;
            }
        } else if (MeasureSpec.getMode(i2) == 0) {
            try {
                throw new IllegalStateException(getClass().getSimpleName() + z[2] + z[1]);
            } catch (IllegalStateException e2) {
                throw e2;
            }
        } else {
            int size = MeasureSpec.getSize(i);
            try {
                int i3;
                int measureChildView;
                if (this.mContentHeight > 0) {
                    i3 = this.mContentHeight;
                } else {
                    i3 = MeasureSpec.getSize(i2);
                }
                int paddingTop = getPaddingTop() + getPaddingBottom();
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                int i4 = i3 - paddingTop;
                int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
                if (this.mClose != null) {
                    measureChildView = measureChildView(this.mClose, paddingLeft, makeMeasureSpec, 0);
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.mClose.getLayoutParams();
                    paddingLeft = measureChildView - (marginLayoutParams.rightMargin + marginLayoutParams.leftMargin);
                }
                try {
                    if (this.mMenuView != null && this.mMenuView.getParent() == this) {
                        paddingLeft = measureChildView(this.mMenuView, paddingLeft, makeMeasureSpec, 0);
                    }
                    try {
                        int i5;
                        if (this.mTitleLayout != null) {
                            if (this.mCustomView == null) {
                                if (this.mTitleOptional) {
                                    Object obj;
                                    this.mTitleLayout.measure(MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                                    int measuredWidth = this.mTitleLayout.getMeasuredWidth();
                                    if (measuredWidth <= paddingLeft) {
                                        obj = 1;
                                    } else {
                                        obj = null;
                                    }
                                    if (obj != null) {
                                        measureChildView = paddingLeft - measuredWidth;
                                    } else {
                                        measureChildView = paddingLeft;
                                    }
                                    try {
                                        LinearLayout linearLayout = this.mTitleLayout;
                                        if (obj != null) {
                                            paddingLeft = 0;
                                        } else {
                                            paddingLeft = 8;
                                        }
                                        linearLayout.setVisibility(paddingLeft);
                                        if (z) {
                                            paddingLeft = measureChildView;
                                        } else {
                                            paddingLeft = measureChildView;
                                        }
                                    } catch (IllegalStateException e22) {
                                        throw e22;
                                    }
                                }
                                paddingLeft = measureChildView(this.mTitleLayout, paddingLeft, makeMeasureSpec, 0);
                            }
                        }
                        if (this.mCustomView != null) {
                            LayoutParams layoutParams = this.mCustomView.getLayoutParams();
                            try {
                                measureChildView = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
                                try {
                                    if (layoutParams.width >= 0) {
                                        paddingLeft = Math.min(layoutParams.width, paddingLeft);
                                    }
                                    try {
                                        i5 = layoutParams.height != -2 ? 1073741824 : Integer.MIN_VALUE;
                                        try {
                                            if (layoutParams.height >= 0) {
                                                i4 = Math.min(layoutParams.height, i4);
                                            }
                                            this.mCustomView.measure(MeasureSpec.makeMeasureSpec(paddingLeft, measureChildView), MeasureSpec.makeMeasureSpec(i4, i5));
                                        } catch (IllegalStateException e222) {
                                            throw e222;
                                        }
                                    } catch (IllegalStateException e2222) {
                                        throw e2222;
                                    }
                                } catch (IllegalStateException e22222) {
                                    throw e22222;
                                }
                            } catch (IllegalStateException e222222) {
                                throw e222222;
                            }
                        }
                        if (this.mContentHeight <= 0) {
                            i4 = getChildCount();
                            i5 = 0;
                            paddingLeft = 0;
                            while (i5 < i4) {
                                measureChildView = getChildAt(i5).getMeasuredHeight() + paddingTop;
                                if (measureChildView > paddingLeft) {
                                    paddingLeft = measureChildView;
                                }
                                measureChildView = i5 + 1;
                                if (!z) {
                                    i5 = measureChildView;
                                }
                            }
                            try {
                                break;
                                setMeasuredDimension(size, paddingLeft);
                                if (!z) {
                                    return;
                                }
                            } catch (IllegalStateException e2222222) {
                                throw e2222222;
                            }
                        }
                        setMeasuredDimension(size, i3);
                    } catch (IllegalStateException e22222222) {
                        throw e22222222;
                    } catch (IllegalStateException e222222222) {
                        throw e222222222;
                    }
                } catch (IllegalStateException e2222222222) {
                    throw e2222222222;
                }
            } catch (IllegalStateException e22222222222) {
                throw e22222222222;
            }
        }
    }
}
