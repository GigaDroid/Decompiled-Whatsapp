package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

public class ContentFrameLayout extends FrameLayout {
    private OnAttachListener mAttachListener;
    private final Rect mDecorPadding;
    private TypedValue mFixedHeightMajor;
    private TypedValue mFixedHeightMinor;
    private TypedValue mFixedWidthMajor;
    private TypedValue mFixedWidthMinor;
    private TypedValue mMinWidthMajor;
    private TypedValue mMinWidthMinor;

    public interface OnAttachListener {
        void onAttachedFromWindow();

        void onDetachedFromWindow();
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mAttachListener != null) {
            this.mAttachListener.onDetachedFromWindow();
        }
    }

    public void setDecorPadding(int i, int i2, int i3, int i4) {
        this.mDecorPadding.set(i, i2, i3, i4);
        if (ViewCompat.isLaidOut(this)) {
            requestLayout();
        }
    }

    public TypedValue getFixedWidthMajor() {
        if (this.mFixedWidthMajor == null) {
            this.mFixedWidthMajor = new TypedValue();
        }
        return this.mFixedWidthMajor;
    }

    public void dispatchFitSystemWindows(Rect rect) {
        fitSystemWindows(rect);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mAttachListener != null) {
            this.mAttachListener.onAttachedFromWindow();
        }
    }

    public TypedValue getFixedWidthMinor() {
        if (this.mFixedWidthMinor == null) {
            this.mFixedWidthMinor = new TypedValue();
        }
        return this.mFixedWidthMinor;
    }

    public TypedValue getMinWidthMajor() {
        if (this.mMinWidthMajor == null) {
            this.mMinWidthMajor = new TypedValue();
        }
        return this.mMinWidthMajor;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onMeasure(int r11, int r12) {
        /*
        r10 = this;
        r4 = android.support.v7.widget.LinearLayoutCompat.a;
        r0 = r10.getContext();
        r0 = r0.getResources();
        r5 = r0.getDisplayMetrics();
        r0 = r5.widthPixels;
        r1 = r5.heightPixels;
        if (r0 >= r1) goto L_0x0103;
    L_0x0014:
        r0 = 1;
    L_0x0015:
        r6 = android.view.View.MeasureSpec.getMode(r11);
        r7 = android.view.View.MeasureSpec.getMode(r12);
        r2 = 0;
        r1 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r6 != r1) goto L_0x0117;
    L_0x0022:
        if (r0 == 0) goto L_0x0106;
    L_0x0024:
        r1 = r10.mFixedWidthMinor;
        r3 = r1;
    L_0x0027:
        if (r3 == 0) goto L_0x0117;
    L_0x0029:
        r1 = r3.type;
        if (r1 == 0) goto L_0x0117;
    L_0x002d:
        r1 = 0;
        r8 = r3.type;
        r9 = 5;
        if (r8 != r9) goto L_0x003a;
    L_0x0033:
        r1 = r3.getDimension(r5);
        r1 = (int) r1;
        if (r4 == 0) goto L_0x004a;
    L_0x003a:
        r8 = r3.type;
        r9 = 6;
        if (r8 != r9) goto L_0x004a;
    L_0x003f:
        r1 = r5.widthPixels;
        r1 = (float) r1;
        r8 = r5.widthPixels;
        r8 = (float) r8;
        r1 = r3.getFraction(r1, r8);
        r1 = (int) r1;
    L_0x004a:
        if (r1 <= 0) goto L_0x0117;
    L_0x004c:
        r2 = r10.mDecorPadding;
        r2 = r2.left;
        r3 = r10.mDecorPadding;
        r3 = r3.right;
        r2 = r2 + r3;
        r1 = r1 - r2;
        r2 = android.view.View.MeasureSpec.getSize(r11);
        r1 = java.lang.Math.min(r1, r2);
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r11 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r2);
        r1 = 1;
        r3 = r1;
    L_0x0066:
        r1 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r7 != r1) goto L_0x00ac;
    L_0x006a:
        if (r0 == 0) goto L_0x010b;
    L_0x006c:
        r1 = r10.mFixedHeightMajor;
        r2 = r1;
    L_0x006f:
        if (r2 == 0) goto L_0x00ac;
    L_0x0071:
        r1 = r2.type;
        if (r1 == 0) goto L_0x00ac;
    L_0x0075:
        r1 = 0;
        r7 = r2.type;
        r8 = 5;
        if (r7 != r8) goto L_0x0082;
    L_0x007b:
        r1 = r2.getDimension(r5);
        r1 = (int) r1;
        if (r4 == 0) goto L_0x0092;
    L_0x0082:
        r7 = r2.type;
        r8 = 6;
        if (r7 != r8) goto L_0x0092;
    L_0x0087:
        r1 = r5.heightPixels;
        r1 = (float) r1;
        r7 = r5.heightPixels;
        r7 = (float) r7;
        r1 = r2.getFraction(r1, r7);
        r1 = (int) r1;
    L_0x0092:
        if (r1 <= 0) goto L_0x00ac;
    L_0x0094:
        r2 = r10.mDecorPadding;
        r2 = r2.top;
        r7 = r10.mDecorPadding;
        r7 = r7.bottom;
        r2 = r2 + r7;
        r1 = r1 - r2;
        r2 = android.view.View.MeasureSpec.getSize(r12);
        r1 = java.lang.Math.min(r1, r2);
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r12 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r2);
    L_0x00ac:
        super.onMeasure(r11, r12);
        r7 = r10.getMeasuredWidth();
        r1 = 0;
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r2);
        if (r3 != 0) goto L_0x0114;
    L_0x00bc:
        r3 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r6 != r3) goto L_0x0114;
    L_0x00c0:
        if (r0 == 0) goto L_0x0110;
    L_0x00c2:
        r0 = r10.mMinWidthMinor;
        r3 = r0;
    L_0x00c5:
        if (r3 == 0) goto L_0x0114;
    L_0x00c7:
        r0 = r3.type;
        if (r0 == 0) goto L_0x0114;
    L_0x00cb:
        r0 = 0;
        r6 = r3.type;
        r8 = 5;
        if (r6 != r8) goto L_0x00d8;
    L_0x00d1:
        r0 = r3.getDimension(r5);
        r0 = (int) r0;
        if (r4 == 0) goto L_0x00e8;
    L_0x00d8:
        r4 = r3.type;
        r6 = 6;
        if (r4 != r6) goto L_0x00e8;
    L_0x00dd:
        r0 = r5.widthPixels;
        r0 = (float) r0;
        r4 = r5.widthPixels;
        r4 = (float) r4;
        r0 = r3.getFraction(r0, r4);
        r0 = (int) r0;
    L_0x00e8:
        if (r0 <= 0) goto L_0x00f4;
    L_0x00ea:
        r3 = r10.mDecorPadding;
        r3 = r3.left;
        r4 = r10.mDecorPadding;
        r4 = r4.right;
        r3 = r3 + r4;
        r0 = r0 - r3;
    L_0x00f4:
        if (r7 >= r0) goto L_0x0114;
    L_0x00f6:
        r1 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1);
        r0 = 1;
    L_0x00fd:
        if (r0 == 0) goto L_0x0102;
    L_0x00ff:
        super.onMeasure(r1, r12);
    L_0x0102:
        return;
    L_0x0103:
        r0 = 0;
        goto L_0x0015;
    L_0x0106:
        r1 = r10.mFixedWidthMajor;
        r3 = r1;
        goto L_0x0027;
    L_0x010b:
        r1 = r10.mFixedHeightMinor;
        r2 = r1;
        goto L_0x006f;
    L_0x0110:
        r0 = r10.mMinWidthMajor;
        r3 = r0;
        goto L_0x00c5;
    L_0x0114:
        r0 = r1;
        r1 = r2;
        goto L_0x00fd;
    L_0x0117:
        r3 = r2;
        goto L_0x0066;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public TypedValue getFixedHeightMinor() {
        if (this.mFixedHeightMinor == null) {
            this.mFixedHeightMinor = new TypedValue();
        }
        return this.mFixedHeightMinor;
    }

    public TypedValue getFixedHeightMajor() {
        if (this.mFixedHeightMajor == null) {
            this.mFixedHeightMajor = new TypedValue();
        }
        return this.mFixedHeightMajor;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mDecorPadding = new Rect();
    }

    public void setAttachListener(OnAttachListener onAttachListener) {
        this.mAttachListener = onAttachListener;
    }

    public TypedValue getMinWidthMinor() {
        if (this.mMinWidthMinor == null) {
            this.mMinWidthMinor = new TypedValue();
        }
        return this.mMinWidthMinor;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }
}
