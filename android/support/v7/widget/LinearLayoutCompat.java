package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.appcompat.R;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.v;
import org.whispersystems.at;

public class LinearLayoutCompat extends ViewGroup {
    public static boolean a;
    private static final String[] z;
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;

    public class LayoutParams extends MarginLayoutParams {
        public int gravity;
        public float weight;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.gravity = -1;
            this.weight = 0.0f;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.gravity = -1;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.gravity = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.LinearLayoutCompat_Layout);
            this.weight = obtainStyledAttributes.getFloat(R.styleable.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.gravity = obtainStyledAttributes.getInt(R.styleable.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            obtainStyledAttributes.recycle();
        }
    }

    static {
        String[] strArr = new String[3];
        String str = "D\u0001+}BE*$kfE*-`BM\u0000\"gKM\n$jBQc%h\u0007e*$kF[\u000f+wH\\7j~H@->}\u0007],jo\u0007\u007f*/y\u0007]++z\u0007M,/}I\u000e7jeIF4jfH^c>a\u0007N&>.N]0jlFZ&&gILm";
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
                        i3 = 41;
                        break;
                    case at.g /*1*/:
                        i3 = 67;
                        break;
                    case at.i /*2*/:
                        i3 = 74;
                        break;
                    case at.o /*3*/:
                        i3 = 14;
                        break;
                    default:
                        i3 = 39;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "hc)fNE'jaA\t\u000f#`BH1\u0006o^F6>.P@7\".NG'/v\u0007E&9}\u0007]++`\u0007D\u0001+}BE*$kfE*-`BM\u0000\"gKM\n$jBQc\"oT\t4/g@A7j0\u0007\u0019ojyO@ \".PF-mz\u0007^,8e\t\tc\u000fgSA&8.UL.%xB\t7\"k\u0007^&#iO]ojaU\t'%`\u0000]c9kS\t.\boTL/#`Bh/#iIL'\tfNE'\u0003`CL;d";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "D\u0001+}BE*$kfE*-`BM\u0000\"gKM\n$jBQc%h\u0007e*$kF[\u000f+wH\\7j}B]c>a\u0007H-jgIM&2.SA\">.NZc%{S\t,,.EF6$jT\u0007";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        try {
            if (this.mOrientation == 1) {
                layoutVertical(i, i2, i3, i4);
                if (!a) {
                    return;
                }
            }
            layoutHorizontal(i, i2, i3, i4);
        } catch (RuntimeException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    View getVirtualChildAt(int i) {
        return getChildAt(i);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    protected boolean hasDividerBeforeChildAt(int i) {
        boolean z = false;
        boolean z2 = a;
        if (i == 0) {
            try {
                if ((this.mShowDividers & 1) != 0) {
                    return true;
                }
                return false;
            } catch (RuntimeException e) {
                throw e;
            }
        }
        try {
            if (i == getChildCount()) {
                if ((this.mShowDividers & 4) == 0) {
                    return false;
                }
                return true;
            } else if ((this.mShowDividers & 2) == 0) {
                return false;
            } else {
                int i2 = i - 1;
                while (i2 >= 0) {
                    if (getChildAt(i2).getVisibility() != 8) {
                        if (!z2) {
                            return true;
                        }
                        z = true;
                    }
                    i2--;
                    if (z2) {
                        return z;
                    }
                }
                return z;
            }
        } catch (RuntimeException e2) {
            throw e2;
        } catch (RuntimeException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void drawDividersVertical(android.graphics.Canvas r7) {
        /*
        r6 = this;
        r2 = a;
        r3 = r6.getVirtualChildCount();
        r0 = 0;
        r1 = r0;
    L_0x0008:
        if (r1 >= r3) goto L_0x0036;
    L_0x000a:
        r4 = r6.getVirtualChildAt(r1);
        if (r4 == 0) goto L_0x0032;
    L_0x0010:
        r0 = r4.getVisibility();	 Catch:{ RuntimeException -> 0x0063 }
        r5 = 8;
        if (r0 == r5) goto L_0x0032;
    L_0x0018:
        r0 = r6.hasDividerBeforeChildAt(r1);	 Catch:{ RuntimeException -> 0x0063 }
        if (r0 == 0) goto L_0x0032;
    L_0x001e:
        r0 = r4.getLayoutParams();
        r0 = (android.support.v7.widget.LinearLayoutCompat.LayoutParams) r0;
        r4 = r4.getTop();
        r0 = r0.topMargin;
        r0 = r4 - r0;
        r4 = r6.mDividerHeight;
        r0 = r0 - r4;
        r6.drawHorizontalDivider(r7, r0);
    L_0x0032:
        r0 = r1 + 1;
        if (r2 == 0) goto L_0x0065;
    L_0x0036:
        r0 = r6.hasDividerBeforeChildAt(r3);
        if (r0 == 0) goto L_0x0062;
    L_0x003c:
        r0 = r3 + -1;
        r1 = r6.getVirtualChildAt(r0);
        if (r1 != 0) goto L_0x0052;
    L_0x0044:
        r0 = r6.getHeight();
        r3 = r6.getPaddingBottom();
        r0 = r0 - r3;
        r3 = r6.mDividerHeight;
        r0 = r0 - r3;
        if (r2 == 0) goto L_0x005f;
    L_0x0052:
        r0 = r1.getLayoutParams();
        r0 = (android.support.v7.widget.LinearLayoutCompat.LayoutParams) r0;
        r1 = r1.getBottom();
        r0 = r0.bottomMargin;
        r0 = r0 + r1;
    L_0x005f:
        r6.drawHorizontalDivider(r7, r0);
    L_0x0062:
        return;
    L_0x0063:
        r0 = move-exception;
        throw r0;
    L_0x0065:
        r1 = r0;
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutCompat.drawDividersVertical(android.graphics.Canvas):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void measureVertical(int r29, int r30) {
        /*
        r28 = this;
        r21 = a;
        r3 = 0;
        r0 = r28;
        r0.mTotalLength = r3;
        r18 = 0;
        r17 = 0;
        r13 = 0;
        r16 = 0;
        r15 = 1;
        r7 = 0;
        r22 = r28.getVirtualChildCount();
        r23 = android.view.View.MeasureSpec.getMode(r29);
        r24 = android.view.View.MeasureSpec.getMode(r30);
        r12 = 0;
        r6 = 0;
        r0 = r28;
        r0 = r0.mBaselineAlignedChildIndex;
        r25 = r0;
        r0 = r28;
        r0 = r0.mUseLargestChild;
        r26 = r0;
        r14 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r3 = 0;
    L_0x002d:
        r0 = r22;
        if (r3 >= r0) goto L_0x047e;
    L_0x0031:
        r0 = r28;
        r4 = r0.getVirtualChildAt(r3);
        if (r4 != 0) goto L_0x004a;
    L_0x0039:
        r0 = r28;
        r5 = r0.mTotalLength;	 Catch:{ RuntimeException -> 0x0122 }
        r0 = r28;
        r8 = r0.measureNullChild(r3);	 Catch:{ RuntimeException -> 0x0122 }
        r5 = r5 + r8;
        r0 = r28;
        r0.mTotalLength = r5;	 Catch:{ RuntimeException -> 0x0122 }
        if (r21 == 0) goto L_0x0472;
    L_0x004a:
        r5 = r4.getVisibility();	 Catch:{ RuntimeException -> 0x0122 }
        r8 = 8;
        if (r5 != r8) goto L_0x005b;
    L_0x0052:
        r0 = r28;
        r5 = r0.getChildrenSkipCount(r4, r3);
        r3 = r3 + r5;
        if (r21 == 0) goto L_0x0472;
    L_0x005b:
        r5 = r3;
        r0 = r28;
        r3 = r0.hasDividerBeforeChildAt(r5);	 Catch:{ RuntimeException -> 0x0124 }
        if (r3 == 0) goto L_0x0071;
    L_0x0064:
        r0 = r28;
        r3 = r0.mTotalLength;	 Catch:{ RuntimeException -> 0x0124 }
        r0 = r28;
        r8 = r0.mDividerHeight;	 Catch:{ RuntimeException -> 0x0124 }
        r3 = r3 + r8;
        r0 = r28;
        r0.mTotalLength = r3;	 Catch:{ RuntimeException -> 0x0124 }
    L_0x0071:
        r3 = r4.getLayoutParams();
        r10 = r3;
        r10 = (android.support.v7.widget.LinearLayoutCompat.LayoutParams) r10;
        r3 = r10.weight;
        r20 = r7 + r3;
        r3 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = r24;
        if (r0 != r3) goto L_0x046f;
    L_0x0082:
        r3 = r10.height;	 Catch:{ RuntimeException -> 0x0126 }
        if (r3 != 0) goto L_0x046f;
    L_0x0086:
        r3 = r10.weight;	 Catch:{ RuntimeException -> 0x0126 }
        r7 = 0;
        r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1));
        if (r3 <= 0) goto L_0x046f;
    L_0x008d:
        r0 = r28;
        r3 = r0.mTotalLength;
        r6 = r10.topMargin;
        r6 = r6 + r3;
        r7 = r10.bottomMargin;
        r6 = r6 + r7;
        r3 = java.lang.Math.max(r3, r6);
        r0 = r28;
        r0.mTotalLength = r3;
        r3 = 1;
        if (r21 == 0) goto L_0x046b;
    L_0x00a2:
        r11 = r3;
    L_0x00a3:
        r3 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r6 = r10.height;	 Catch:{ RuntimeException -> 0x0128 }
        if (r6 != 0) goto L_0x00b4;
    L_0x00a9:
        r6 = r10.weight;	 Catch:{ RuntimeException -> 0x0128 }
        r7 = 0;
        r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1));
        if (r6 <= 0) goto L_0x00b4;
    L_0x00b0:
        r3 = 0;
        r6 = -2;
        r10.height = r6;
    L_0x00b4:
        r19 = r3;
        r7 = 0;
        r3 = 0;
        r3 = (r20 > r3 ? 1 : (r20 == r3 ? 0 : -1));
        if (r3 != 0) goto L_0x012c;
    L_0x00bc:
        r0 = r28;
        r9 = r0.mTotalLength;	 Catch:{ RuntimeException -> 0x012a }
    L_0x00c0:
        r3 = r28;
        r6 = r29;
        r8 = r30;
        r3.measureChildBeforeLayout(r4, r5, r6, r7, r8, r9);	 Catch:{ RuntimeException -> 0x012e }
        r3 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r0 = r19;
        if (r0 == r3) goto L_0x00d3;
    L_0x00cf:
        r0 = r19;
        r10.height = r0;	 Catch:{ RuntimeException -> 0x012e }
    L_0x00d3:
        r3 = r4.getMeasuredHeight();
        r0 = r28;
        r6 = r0.mTotalLength;
        r7 = r6 + r3;
        r8 = r10.topMargin;
        r7 = r7 + r8;
        r8 = r10.bottomMargin;
        r7 = r7 + r8;
        r0 = r28;
        r8 = r0.getNextLocationOffset(r4);
        r7 = r7 + r8;
        r6 = java.lang.Math.max(r6, r7);
        r0 = r28;
        r0.mTotalLength = r6;
        if (r26 == 0) goto L_0x0467;
    L_0x00f4:
        r14 = java.lang.Math.max(r3, r14);
        r19 = r11;
    L_0x00fa:
        if (r25 < 0) goto L_0x010a;
    L_0x00fc:
        r3 = r5 + 1;
        r0 = r25;
        if (r0 != r3) goto L_0x010a;
    L_0x0102:
        r0 = r28;
        r3 = r0.mTotalLength;	 Catch:{ RuntimeException -> 0x0130 }
        r0 = r28;
        r0.mBaselineChildTop = r3;	 Catch:{ RuntimeException -> 0x0130 }
    L_0x010a:
        r0 = r25;
        if (r5 >= r0) goto L_0x0132;
    L_0x010e:
        r3 = r10.weight;	 Catch:{ RuntimeException -> 0x0120 }
        r6 = 0;
        r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1));
        if (r3 <= 0) goto L_0x0132;
    L_0x0115:
        r3 = new java.lang.RuntimeException;	 Catch:{ RuntimeException -> 0x0120 }
        r4 = z;	 Catch:{ RuntimeException -> 0x0120 }
        r5 = 2;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x0120 }
        r3.<init>(r4);	 Catch:{ RuntimeException -> 0x0120 }
        throw r3;	 Catch:{ RuntimeException -> 0x0120 }
    L_0x0120:
        r3 = move-exception;
        throw r3;
    L_0x0122:
        r3 = move-exception;
        throw r3;
    L_0x0124:
        r3 = move-exception;
        throw r3;
    L_0x0126:
        r3 = move-exception;
        throw r3;
    L_0x0128:
        r3 = move-exception;
        throw r3;
    L_0x012a:
        r3 = move-exception;
        throw r3;
    L_0x012c:
        r9 = 0;
        goto L_0x00c0;
    L_0x012e:
        r3 = move-exception;
        throw r3;
    L_0x0130:
        r3 = move-exception;
        throw r3;
    L_0x0132:
        r3 = 0;
        r6 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = r23;
        if (r0 == r6) goto L_0x0464;
    L_0x0139:
        r6 = r10.width;	 Catch:{ RuntimeException -> 0x03eb }
        r7 = -1;
        if (r6 != r7) goto L_0x0464;
    L_0x013e:
        r6 = 1;
        r3 = 1;
    L_0x0140:
        r7 = r10.leftMargin;
        r8 = r10.rightMargin;
        r9 = r7 + r8;
        r7 = r4.getMeasuredWidth();
        r11 = r7 + r9;
        r0 = r18;
        r18 = java.lang.Math.max(r0, r11);
        r7 = android.support.v4.view.ViewCompat.getMeasuredState(r4);
        r0 = r17;
        r17 = android.support.v7.widget.ViewUtils.combineMeasuredStates(r0, r7);
        if (r15 == 0) goto L_0x03ef;
    L_0x015e:
        r7 = r10.width;	 Catch:{ RuntimeException -> 0x03ed }
        r8 = -1;
        if (r7 != r8) goto L_0x03ef;
    L_0x0163:
        r7 = 1;
    L_0x0164:
        r8 = r10.weight;	 Catch:{ RuntimeException -> 0x03f2 }
        r10 = 0;
        r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r8 <= 0) goto L_0x0460;
    L_0x016b:
        if (r3 == 0) goto L_0x03f6;
    L_0x016d:
        r8 = r9;
    L_0x016e:
        r0 = r16;
        r8 = java.lang.Math.max(r0, r8);
        if (r21 == 0) goto L_0x045c;
    L_0x0176:
        if (r3 == 0) goto L_0x03f9;
    L_0x0178:
        r3 = java.lang.Math.max(r13, r9);
        r27 = r8;
        r8 = r3;
        r3 = r27;
    L_0x0181:
        r0 = r28;
        r4 = r0.getChildrenSkipCount(r4, r5);
        r4 = r4 + r5;
        r10 = r4;
        r12 = r6;
        r5 = r20;
        r13 = r8;
        r9 = r18;
        r4 = r7;
        r8 = r17;
        r6 = r19;
        r7 = r3;
        r3 = r14;
    L_0x0196:
        r10 = r10 + 1;
        if (r21 == 0) goto L_0x0450;
    L_0x019a:
        r14 = r3;
        r11 = r6;
        r15 = r12;
        r16 = r7;
        r6 = r4;
        r7 = r13;
    L_0x01a1:
        r0 = r28;
        r3 = r0.mTotalLength;	 Catch:{ RuntimeException -> 0x03fc }
        if (r3 <= 0) goto L_0x01be;
    L_0x01a7:
        r0 = r28;
        r1 = r22;
        r3 = r0.hasDividerBeforeChildAt(r1);	 Catch:{ RuntimeException -> 0x03fe }
        if (r3 == 0) goto L_0x01be;
    L_0x01b1:
        r0 = r28;
        r3 = r0.mTotalLength;	 Catch:{ RuntimeException -> 0x03fe }
        r0 = r28;
        r4 = r0.mDividerHeight;	 Catch:{ RuntimeException -> 0x03fe }
        r3 = r3 + r4;
        r0 = r28;
        r0.mTotalLength = r3;	 Catch:{ RuntimeException -> 0x03fe }
    L_0x01be:
        if (r26 == 0) goto L_0x0226;
    L_0x01c0:
        r3 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r0 = r24;
        if (r0 == r3) goto L_0x01c8;
    L_0x01c6:
        if (r24 != 0) goto L_0x0226;
    L_0x01c8:
        r3 = 0;
        r0 = r28;
        r0.mTotalLength = r3;
        r3 = 0;
    L_0x01ce:
        r0 = r22;
        if (r3 >= r0) goto L_0x0226;
    L_0x01d2:
        r0 = r28;
        r10 = r0.getVirtualChildAt(r3);
        if (r10 != 0) goto L_0x01eb;
    L_0x01da:
        r0 = r28;
        r4 = r0.mTotalLength;	 Catch:{ RuntimeException -> 0x0400 }
        r0 = r28;
        r12 = r0.measureNullChild(r3);	 Catch:{ RuntimeException -> 0x0400 }
        r4 = r4 + r12;
        r0 = r28;
        r0.mTotalLength = r4;	 Catch:{ RuntimeException -> 0x0400 }
        if (r21 == 0) goto L_0x0222;
    L_0x01eb:
        r4 = r10.getVisibility();	 Catch:{ RuntimeException -> 0x0400 }
        r12 = 8;
        if (r4 != r12) goto L_0x01fc;
    L_0x01f3:
        r0 = r28;
        r4 = r0.getChildrenSkipCount(r10, r3);
        r3 = r3 + r4;
        if (r21 == 0) goto L_0x0222;
    L_0x01fc:
        r4 = r3;
        r3 = r10.getLayoutParams();
        r3 = (android.support.v7.widget.LinearLayoutCompat.LayoutParams) r3;
        r0 = r28;
        r12 = r0.mTotalLength;
        r13 = r12 + r14;
        r0 = r3.topMargin;
        r17 = r0;
        r13 = r13 + r17;
        r3 = r3.bottomMargin;
        r3 = r3 + r13;
        r0 = r28;
        r10 = r0.getNextLocationOffset(r10);
        r3 = r3 + r10;
        r3 = java.lang.Math.max(r12, r3);
        r0 = r28;
        r0.mTotalLength = r3;
        r3 = r4;
    L_0x0222:
        r3 = r3 + 1;
        if (r21 == 0) goto L_0x01ce;
    L_0x0226:
        r0 = r28;
        r3 = r0.mTotalLength;
        r4 = r28.getPaddingTop();
        r10 = r28.getPaddingBottom();
        r4 = r4 + r10;
        r3 = r3 + r4;
        r0 = r28;
        r0.mTotalLength = r3;
        r0 = r28;
        r3 = r0.mTotalLength;
        r4 = r28.getSuggestedMinimumHeight();
        r3 = java.lang.Math.max(r3, r4);
        r4 = 0;
        r0 = r30;
        r17 = android.support.v4.view.ViewCompat.resolveSizeAndState(r3, r0, r4);
        r3 = 16777215; // 0xffffff float:2.3509886E-38 double:8.2890456E-317;
        r3 = r3 & r17;
        r0 = r28;
        r4 = r0.mTotalLength;
        r10 = r3 - r4;
        if (r11 != 0) goto L_0x025f;
    L_0x0258:
        if (r10 == 0) goto L_0x044a;
    L_0x025a:
        r3 = 0;
        r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1));
        if (r3 <= 0) goto L_0x044a;
    L_0x025f:
        r0 = r28;
        r3 = r0.mWeightSum;	 Catch:{ RuntimeException -> 0x0402 }
        r4 = 0;
        r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1));
        if (r3 <= 0) goto L_0x0404;
    L_0x0268:
        r0 = r28;
        r3 = r0.mWeightSum;	 Catch:{ RuntimeException -> 0x0402 }
    L_0x026c:
        r4 = 0;
        r0 = r28;
        r0.mTotalLength = r4;
        r4 = 0;
        r13 = r4;
        r5 = r3;
        r11 = r7;
        r12 = r9;
        r7 = r8;
        r27 = r10;
        r10 = r6;
        r6 = r27;
    L_0x027c:
        r0 = r22;
        if (r13 >= r0) goto L_0x0445;
    L_0x0280:
        r0 = r28;
        r18 = r0.getVirtualChildAt(r13);
        r3 = r18.getVisibility();	 Catch:{ RuntimeException -> 0x0407 }
        r4 = 8;
        if (r3 != r4) goto L_0x0290;
    L_0x028e:
        if (r21 == 0) goto L_0x043e;
    L_0x0290:
        r3 = r18.getLayoutParams();
        r3 = (android.support.v7.widget.LinearLayoutCompat.LayoutParams) r3;
        r8 = r3.weight;
        r4 = 0;
        r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1));
        if (r4 <= 0) goto L_0x0439;
    L_0x029d:
        r4 = (float) r6;
        r4 = r4 * r8;
        r4 = r4 / r5;
        r4 = (int) r4;
        r5 = r5 - r8;
        r6 = r6 - r4;
        r8 = r28.getPaddingLeft();
        r9 = r28.getPaddingRight();
        r8 = r8 + r9;
        r9 = r3.leftMargin;
        r8 = r8 + r9;
        r9 = r3.rightMargin;
        r8 = r8 + r9;
        r9 = r3.width;
        r0 = r29;
        r9 = getChildMeasureSpec(r0, r8, r9);
        r8 = r3.height;	 Catch:{ RuntimeException -> 0x0409 }
        if (r8 != 0) goto L_0x02c4;
    L_0x02be:
        r8 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = r24;
        if (r0 == r8) goto L_0x02db;
    L_0x02c4:
        r8 = r18.getMeasuredHeight();
        r8 = r8 + r4;
        if (r8 >= 0) goto L_0x02cc;
    L_0x02cb:
        r8 = 0;
    L_0x02cc:
        r19 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = r19;
        r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r0);	 Catch:{ RuntimeException -> 0x040b }
        r0 = r18;
        r0.measure(r9, r8);	 Catch:{ RuntimeException -> 0x040b }
        if (r21 == 0) goto L_0x02e8;
    L_0x02db:
        if (r4 <= 0) goto L_0x040f;
    L_0x02dd:
        r8 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r8);
        r0 = r18;
        r0.measure(r9, r4);
    L_0x02e8:
        r4 = android.support.v4.view.ViewCompat.getMeasuredState(r18);
        r4 = r4 & -256;
        r4 = android.support.v7.widget.ViewUtils.combineMeasuredStates(r7, r4);
        r27 = r5;
        r5 = r6;
        r6 = r4;
        r4 = r27;
    L_0x02f8:
        r7 = r3.leftMargin;
        r8 = r3.rightMargin;
        r8 = r8 + r7;
        r7 = r18.getMeasuredWidth();
        r9 = r7 + r8;
        r12 = java.lang.Math.max(r12, r9);
        r7 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = r23;
        if (r0 == r7) goto L_0x0414;
    L_0x030d:
        r7 = r3.width;	 Catch:{ RuntimeException -> 0x0412 }
        r19 = -1;
        r0 = r19;
        if (r7 != r0) goto L_0x0414;
    L_0x0315:
        r7 = 1;
    L_0x0316:
        if (r7 == 0) goto L_0x0417;
    L_0x0318:
        r7 = r8;
    L_0x0319:
        r11 = java.lang.Math.max(r11, r7);
        if (r10 == 0) goto L_0x041c;
    L_0x031f:
        r7 = r3.width;	 Catch:{ RuntimeException -> 0x041a }
        r8 = -1;
        if (r7 != r8) goto L_0x041c;
    L_0x0324:
        r7 = 1;
    L_0x0325:
        r0 = r28;
        r8 = r0.mTotalLength;
        r9 = r18.getMeasuredHeight();
        r9 = r9 + r8;
        r10 = r3.topMargin;
        r9 = r9 + r10;
        r3 = r3.bottomMargin;
        r3 = r3 + r9;
        r0 = r28;
        r1 = r18;
        r9 = r0.getNextLocationOffset(r1);
        r3 = r3 + r9;
        r3 = java.lang.Math.max(r8, r3);
        r0 = r28;
        r0.mTotalLength = r3;
        r8 = r5;
        r3 = r7;
        r7 = r6;
        r5 = r12;
        r6 = r4;
        r4 = r11;
    L_0x034b:
        r9 = r13 + 1;
        if (r21 == 0) goto L_0x0431;
    L_0x034f:
        r0 = r28;
        r6 = r0.mTotalLength;
        r8 = r28.getPaddingTop();
        r9 = r28.getPaddingBottom();
        r8 = r8 + r9;
        r6 = r6 + r8;
        r0 = r28;
        r0.mTotalLength = r6;
        if (r21 == 0) goto L_0x042a;
    L_0x0363:
        r27 = r3;
        r3 = r4;
        r4 = r27;
    L_0x0368:
        r0 = r16;
        r6 = java.lang.Math.max(r3, r0);
        if (r26 == 0) goto L_0x03b2;
    L_0x0370:
        r3 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = r24;
        if (r0 == r3) goto L_0x03b2;
    L_0x0376:
        r3 = 0;
        r8 = r3;
    L_0x0378:
        r0 = r22;
        if (r8 >= r0) goto L_0x03b2;
    L_0x037c:
        r0 = r28;
        r9 = r0.getVirtualChildAt(r8);
        if (r9 == 0) goto L_0x03ae;
    L_0x0384:
        r3 = r9.getVisibility();	 Catch:{ RuntimeException -> 0x041f }
        r10 = 8;
        if (r3 != r10) goto L_0x038e;
    L_0x038c:
        if (r21 == 0) goto L_0x03ae;
    L_0x038e:
        r3 = r9.getLayoutParams();
        r3 = (android.support.v7.widget.LinearLayoutCompat.LayoutParams) r3;
        r3 = r3.weight;
        r10 = 0;
        r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1));
        if (r3 <= 0) goto L_0x03ae;
    L_0x039b:
        r3 = r9.getMeasuredWidth();	 Catch:{ RuntimeException -> 0x0421 }
        r10 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r10);	 Catch:{ RuntimeException -> 0x0421 }
        r10 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r10 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r10);	 Catch:{ RuntimeException -> 0x0421 }
        r9.measure(r3, r10);	 Catch:{ RuntimeException -> 0x0421 }
    L_0x03ae:
        r3 = r8 + 1;
        if (r21 == 0) goto L_0x0427;
    L_0x03b2:
        r3 = r6;
        r27 = r4;
        r4 = r5;
        r5 = r27;
    L_0x03b8:
        if (r5 != 0) goto L_0x0425;
    L_0x03ba:
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = r23;
        if (r0 == r5) goto L_0x0425;
    L_0x03c0:
        r4 = r28.getPaddingLeft();
        r5 = r28.getPaddingRight();
        r4 = r4 + r5;
        r3 = r3 + r4;
        r4 = r28.getSuggestedMinimumWidth();
        r3 = java.lang.Math.max(r3, r4);
        r0 = r29;
        r3 = android.support.v4.view.ViewCompat.resolveSizeAndState(r3, r0, r7);	 Catch:{ RuntimeException -> 0x0423 }
        r0 = r28;
        r1 = r17;
        r0.setMeasuredDimension(r3, r1);	 Catch:{ RuntimeException -> 0x0423 }
        if (r15 == 0) goto L_0x03ea;
    L_0x03e1:
        r0 = r28;
        r1 = r22;
        r2 = r30;
        r0.forceUniformWidth(r1, r2);	 Catch:{ RuntimeException -> 0x0423 }
    L_0x03ea:
        return;
    L_0x03eb:
        r3 = move-exception;
        throw r3;
    L_0x03ed:
        r3 = move-exception;
        throw r3;
    L_0x03ef:
        r7 = 0;
        goto L_0x0164;
    L_0x03f2:
        r3 = move-exception;
        throw r3;	 Catch:{ RuntimeException -> 0x03f4 }
    L_0x03f4:
        r3 = move-exception;
        throw r3;
    L_0x03f6:
        r8 = r11;
        goto L_0x016e;
    L_0x03f9:
        r9 = r11;
        goto L_0x0178;
    L_0x03fc:
        r3 = move-exception;
        throw r3;	 Catch:{ RuntimeException -> 0x03fe }
    L_0x03fe:
        r3 = move-exception;
        throw r3;
    L_0x0400:
        r3 = move-exception;
        throw r3;
    L_0x0402:
        r3 = move-exception;
        throw r3;
    L_0x0404:
        r3 = r5;
        goto L_0x026c;
    L_0x0407:
        r3 = move-exception;
        throw r3;
    L_0x0409:
        r3 = move-exception;
        throw r3;
    L_0x040b:
        r3 = move-exception;
        throw r3;	 Catch:{ RuntimeException -> 0x040d }
    L_0x040d:
        r3 = move-exception;
        throw r3;
    L_0x040f:
        r4 = 0;
        goto L_0x02dd;
    L_0x0412:
        r3 = move-exception;
        throw r3;
    L_0x0414:
        r7 = 0;
        goto L_0x0316;
    L_0x0417:
        r7 = r9;
        goto L_0x0319;
    L_0x041a:
        r3 = move-exception;
        throw r3;
    L_0x041c:
        r7 = 0;
        goto L_0x0325;
    L_0x041f:
        r3 = move-exception;
        throw r3;
    L_0x0421:
        r3 = move-exception;
        throw r3;
    L_0x0423:
        r3 = move-exception;
        throw r3;
    L_0x0425:
        r3 = r4;
        goto L_0x03c0;
    L_0x0427:
        r8 = r3;
        goto L_0x0378;
    L_0x042a:
        r27 = r3;
        r3 = r4;
        r4 = r5;
        r5 = r27;
        goto L_0x03b8;
    L_0x0431:
        r13 = r9;
        r10 = r3;
        r11 = r4;
        r12 = r5;
        r5 = r6;
        r6 = r8;
        goto L_0x027c;
    L_0x0439:
        r4 = r5;
        r5 = r6;
        r6 = r7;
        goto L_0x02f8;
    L_0x043e:
        r8 = r6;
        r3 = r10;
        r4 = r11;
        r6 = r5;
        r5 = r12;
        goto L_0x034b;
    L_0x0445:
        r3 = r10;
        r4 = r11;
        r5 = r12;
        goto L_0x034f;
    L_0x044a:
        r4 = r6;
        r3 = r7;
        r5 = r9;
        r7 = r8;
        goto L_0x0368;
    L_0x0450:
        r14 = r3;
        r15 = r4;
        r16 = r7;
        r17 = r8;
        r18 = r9;
        r3 = r10;
        r7 = r5;
        goto L_0x002d;
    L_0x045c:
        r3 = r8;
        r8 = r13;
        goto L_0x0181;
    L_0x0460:
        r8 = r16;
        goto L_0x0176;
    L_0x0464:
        r6 = r12;
        goto L_0x0140;
    L_0x0467:
        r19 = r11;
        goto L_0x00fa;
    L_0x046b:
        r19 = r3;
        goto L_0x00fa;
    L_0x046f:
        r11 = r6;
        goto L_0x00a3;
    L_0x0472:
        r10 = r3;
        r5 = r7;
        r4 = r15;
        r8 = r17;
        r9 = r18;
        r3 = r14;
        r7 = r16;
        goto L_0x0196;
    L_0x047e:
        r11 = r6;
        r5 = r7;
        r8 = r17;
        r9 = r18;
        r7 = r13;
        r6 = r15;
        r15 = r12;
        goto L_0x01a1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutCompat.measureVertical(int, int):void");
    }

    void measureChildBeforeLayout(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    private void forceUniformHeight(int i, int i2) {
        boolean z = a;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        int i3 = 0;
        while (i3 < i) {
            View virtualChildAt = getVirtualChildAt(i3);
            if (virtualChildAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (layoutParams.height == -1) {
                    int i4 = layoutParams.width;
                    layoutParams.width = virtualChildAt.getMeasuredWidth();
                    measureChildWithMargins(virtualChildAt, i2, 0, makeMeasureSpec, 0);
                    layoutParams.width = i4;
                }
            }
            int i5 = i3 + 1;
            if (!z) {
                i3 = i5;
            } else {
                return;
            }
        }
    }

    private void forceUniformWidth(int i, int i2) {
        boolean z = a;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int i3 = 0;
        while (i3 < i) {
            View virtualChildAt = getVirtualChildAt(i3);
            if (virtualChildAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (layoutParams.width == -1) {
                    int i4 = layoutParams.height;
                    layoutParams.height = virtualChildAt.getMeasuredHeight();
                    measureChildWithMargins(virtualChildAt, makeMeasureSpec, 0, i2, 0);
                    layoutParams.height = i4;
                }
            }
            int i5 = i3 + 1;
            if (!z) {
                i3 = i5;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setDividerDrawable(android.graphics.drawable.Drawable r3) {
        /*
        r2 = this;
        r0 = 0;
        r1 = r2.mDivider;	 Catch:{ RuntimeException -> 0x0006 }
        if (r3 != r1) goto L_0x0008;
    L_0x0005:
        return;
    L_0x0006:
        r0 = move-exception;
        throw r0;
    L_0x0008:
        r2.mDivider = r3;	 Catch:{ RuntimeException -> 0x002c }
        if (r3 == 0) goto L_0x001c;
    L_0x000c:
        r1 = r3.getIntrinsicWidth();	 Catch:{ RuntimeException -> 0x002e }
        r2.mDividerWidth = r1;	 Catch:{ RuntimeException -> 0x002e }
        r1 = r3.getIntrinsicHeight();	 Catch:{ RuntimeException -> 0x002e }
        r2.mDividerHeight = r1;	 Catch:{ RuntimeException -> 0x002e }
        r1 = a;	 Catch:{ RuntimeException -> 0x002e }
        if (r1 == 0) goto L_0x0022;
    L_0x001c:
        r1 = 0;
        r2.mDividerWidth = r1;	 Catch:{ RuntimeException -> 0x002e }
        r1 = 0;
        r2.mDividerHeight = r1;	 Catch:{ RuntimeException -> 0x002e }
    L_0x0022:
        if (r3 != 0) goto L_0x0025;
    L_0x0024:
        r0 = 1;
    L_0x0025:
        r2.setWillNotDraw(r0);
        r2.requestLayout();
        goto L_0x0005;
    L_0x002c:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x002e }
    L_0x002e:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutCompat.setDividerDrawable(android.graphics.drawable.Drawable):void");
    }

    private void setChildFrame(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i + i3, i2 + i4);
    }

    public void setGravity(int i) {
        try {
            if (this.mGravity != i) {
                int i2;
                if ((8388615 & i) == 0) {
                    i2 = 8388611 | i;
                } else {
                    i2 = i;
                }
                if ((i2 & 112) == 0) {
                    i2 |= 48;
                }
                this.mGravity = i2;
                requestLayout();
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void layoutVertical(int r16, int r17, int r18, int r19) {
        /*
        r15 = this;
        r9 = a;
        r10 = r15.getPaddingLeft();
        r0 = r18 - r16;
        r1 = r15.getPaddingRight();
        r11 = r0 - r1;
        r0 = r0 - r10;
        r1 = r15.getPaddingRight();
        r12 = r0 - r1;
        r13 = r15.getVirtualChildCount();
        r0 = r15.mGravity;
        r0 = r0 & 112;
        r1 = r15.mGravity;
        r2 = 8388615; // 0x800007 float:1.1754953E-38 double:4.1445265E-317;
        r7 = r1 & r2;
        switch(r0) {
            case 16: goto L_0x00a1;
            case 80: goto L_0x0094;
            default: goto L_0x0027;
        };
    L_0x0027:
        r0 = r15.getPaddingTop();
    L_0x002b:
        r8 = 0;
        r3 = r0;
    L_0x002d:
        if (r8 >= r13) goto L_0x0093;
    L_0x002f:
        r1 = r15.getVirtualChildAt(r8);
        if (r1 != 0) goto L_0x003c;
    L_0x0035:
        r0 = r15.measureNullChild(r8);
        r3 = r3 + r0;
        if (r9 == 0) goto L_0x00cc;
    L_0x003c:
        r0 = r1.getVisibility();	 Catch:{ RuntimeException -> 0x00b1 }
        r2 = 8;
        if (r0 == r2) goto L_0x00cc;
    L_0x0044:
        r4 = r1.getMeasuredWidth();
        r5 = r1.getMeasuredHeight();
        r0 = r1.getLayoutParams();
        r6 = r0;
        r6 = (android.support.v7.widget.LinearLayoutCompat.LayoutParams) r6;
        r0 = r6.gravity;
        if (r0 >= 0) goto L_0x0058;
    L_0x0057:
        r0 = r7;
    L_0x0058:
        r2 = android.support.v4.view.ViewCompat.getLayoutDirection(r15);
        r0 = android.support.v4.view.GravityCompat.getAbsoluteGravity(r0, r2);
        r0 = r0 & 7;
        switch(r0) {
            case 1: goto L_0x00b3;
            case 5: goto L_0x00c1;
            default: goto L_0x0065;
        };
    L_0x0065:
        r0 = r6.leftMargin;
        r2 = r10 + r0;
    L_0x0069:
        r0 = r15.hasDividerBeforeChildAt(r8);
        if (r0 == 0) goto L_0x00ca;
    L_0x006f:
        r0 = r15.mDividerHeight;
        r0 = r0 + r3;
    L_0x0072:
        r3 = r6.topMargin;
        r14 = r0 + r3;
        r0 = r15.getLocationOffset(r1);
        r3 = r14 + r0;
        r0 = r15;
        r0.setChildFrame(r1, r2, r3, r4, r5);
        r0 = r6.bottomMargin;
        r0 = r0 + r5;
        r2 = r15.getNextLocationOffset(r1);
        r0 = r0 + r2;
        r3 = r14 + r0;
        r0 = r15.getChildrenSkipCount(r1, r8);
        r0 = r0 + r8;
    L_0x008f:
        r8 = r0 + 1;
        if (r9 == 0) goto L_0x002d;
    L_0x0093:
        return;
    L_0x0094:
        r0 = r15.getPaddingTop();
        r0 = r0 + r19;
        r0 = r0 - r17;
        r1 = r15.mTotalLength;
        r0 = r0 - r1;
        if (r9 == 0) goto L_0x002b;
    L_0x00a1:
        r0 = r15.getPaddingTop();
        r1 = r19 - r17;
        r2 = r15.mTotalLength;
        r1 = r1 - r2;
        r1 = r1 / 2;
        r0 = r0 + r1;
        if (r9 == 0) goto L_0x002b;
    L_0x00af:
        goto L_0x0027;
    L_0x00b1:
        r0 = move-exception;
        throw r0;
    L_0x00b3:
        r0 = r12 - r4;
        r0 = r0 / 2;
        r0 = r0 + r10;
        r2 = r6.leftMargin;
        r0 = r0 + r2;
        r2 = r6.rightMargin;
        r2 = r0 - r2;
        if (r9 == 0) goto L_0x0069;
    L_0x00c1:
        r0 = r11 - r4;
        r2 = r6.rightMargin;
        r2 = r0 - r2;
        if (r9 == 0) goto L_0x0069;
    L_0x00c9:
        goto L_0x0065;
    L_0x00ca:
        r0 = r3;
        goto L_0x0072;
    L_0x00cc:
        r0 = r8;
        goto L_0x008f;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutCompat.layoutVertical(int, int, int, int):void");
    }

    protected android.view.ViewGroup.LayoutParams m11generateDefaultLayoutParams() {
        return generateDefaultLayoutParams();
    }

    public void setBaselineAligned(boolean z) {
        this.mBaselineAligned = z;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        try {
            if (VERSION.SDK_INT >= 14) {
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                accessibilityEvent.setClassName(LinearLayoutCompat.class.getName());
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    protected LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    protected LayoutParams generateDefaultLayoutParams() {
        try {
            if (this.mOrientation == 0) {
                return new LayoutParams(-2, -2);
            }
            try {
                return this.mOrientation == 1 ? new LayoutParams(-1, -2) : null;
            } catch (RuntimeException e) {
                throw e;
            }
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void measureHorizontal(int r32, int r33) {
        /*
        r31 = this;
        r22 = a;
        r3 = 0;
        r0 = r31;
        r0.mTotalLength = r3;
        r19 = 0;
        r18 = 0;
        r15 = 0;
        r17 = 0;
        r16 = 1;
        r7 = 0;
        r23 = r31.getVirtualChildCount();
        r24 = android.view.View.MeasureSpec.getMode(r32);
        r25 = android.view.View.MeasureSpec.getMode(r33);
        r14 = 0;
        r6 = 0;
        r0 = r31;
        r3 = r0.mMaxAscent;	 Catch:{ RuntimeException -> 0x057b }
        if (r3 == 0) goto L_0x002b;
    L_0x0025:
        r0 = r31;
        r3 = r0.mMaxDescent;	 Catch:{ RuntimeException -> 0x057d }
        if (r3 != 0) goto L_0x0039;
    L_0x002b:
        r3 = 4;
        r3 = new int[r3];	 Catch:{ RuntimeException -> 0x057d }
        r0 = r31;
        r0.mMaxAscent = r3;	 Catch:{ RuntimeException -> 0x057d }
        r3 = 4;
        r3 = new int[r3];	 Catch:{ RuntimeException -> 0x057d }
        r0 = r31;
        r0.mMaxDescent = r3;	 Catch:{ RuntimeException -> 0x057d }
    L_0x0039:
        r0 = r31;
        r0 = r0.mMaxAscent;
        r26 = r0;
        r0 = r31;
        r0 = r0.mMaxDescent;
        r27 = r0;
        r3 = 0;
        r4 = 1;
        r5 = 2;
        r8 = 3;
        r9 = -1;
        r26[r8] = r9;
        r26[r5] = r9;
        r26[r4] = r9;
        r26[r3] = r9;
        r3 = 0;
        r4 = 1;
        r5 = 2;
        r8 = 3;
        r9 = -1;
        r27[r8] = r9;
        r27[r5] = r9;
        r27[r4] = r9;
        r27[r3] = r9;
        r0 = r31;
        r0 = r0.mBaselineAligned;
        r28 = r0;
        r0 = r31;
        r0 = r0.mUseLargestChild;
        r29 = r0;
        r3 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = r24;
        if (r0 != r3) goto L_0x057f;
    L_0x0071:
        r3 = 1;
        r11 = r3;
    L_0x0073:
        r13 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r3 = 0;
    L_0x0076:
        r0 = r23;
        if (r3 >= r0) goto L_0x064f;
    L_0x007a:
        r0 = r31;
        r4 = r0.getVirtualChildAt(r3);
        if (r4 != 0) goto L_0x0093;
    L_0x0082:
        r0 = r31;
        r5 = r0.mTotalLength;	 Catch:{ RuntimeException -> 0x0583 }
        r0 = r31;
        r8 = r0.measureNullChild(r3);	 Catch:{ RuntimeException -> 0x0583 }
        r5 = r5 + r8;
        r0 = r31;
        r0.mTotalLength = r5;	 Catch:{ RuntimeException -> 0x0583 }
        if (r22 == 0) goto L_0x0642;
    L_0x0093:
        r5 = r4.getVisibility();	 Catch:{ RuntimeException -> 0x0583 }
        r8 = 8;
        if (r5 != r8) goto L_0x00a4;
    L_0x009b:
        r0 = r31;
        r5 = r0.getChildrenSkipCount(r4, r3);
        r3 = r3 + r5;
        if (r22 == 0) goto L_0x0642;
    L_0x00a4:
        r5 = r3;
        r0 = r31;
        r3 = r0.hasDividerBeforeChildAt(r5);	 Catch:{ RuntimeException -> 0x0585 }
        if (r3 == 0) goto L_0x00ba;
    L_0x00ad:
        r0 = r31;
        r3 = r0.mTotalLength;	 Catch:{ RuntimeException -> 0x0585 }
        r0 = r31;
        r8 = r0.mDividerWidth;	 Catch:{ RuntimeException -> 0x0585 }
        r3 = r3 + r8;
        r0 = r31;
        r0.mTotalLength = r3;	 Catch:{ RuntimeException -> 0x0585 }
    L_0x00ba:
        r3 = r4.getLayoutParams();
        r10 = r3;
        r10 = (android.support.v7.widget.LinearLayoutCompat.LayoutParams) r10;
        r3 = r10.weight;
        r20 = r7 + r3;
        r3 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = r24;
        if (r0 != r3) goto L_0x063f;
    L_0x00cb:
        r3 = r10.width;	 Catch:{ RuntimeException -> 0x0587 }
        if (r3 != 0) goto L_0x063f;
    L_0x00cf:
        r3 = r10.weight;	 Catch:{ RuntimeException -> 0x0589 }
        r7 = 0;
        r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1));
        if (r3 <= 0) goto L_0x063f;
    L_0x00d6:
        if (r11 == 0) goto L_0x00e8;
    L_0x00d8:
        r0 = r31;
        r3 = r0.mTotalLength;	 Catch:{ RuntimeException -> 0x058b }
        r7 = r10.leftMargin;	 Catch:{ RuntimeException -> 0x058b }
        r8 = r10.rightMargin;	 Catch:{ RuntimeException -> 0x058b }
        r7 = r7 + r8;
        r3 = r3 + r7;
        r0 = r31;
        r0.mTotalLength = r3;	 Catch:{ RuntimeException -> 0x058b }
        if (r22 == 0) goto L_0x00fa;
    L_0x00e8:
        r0 = r31;
        r3 = r0.mTotalLength;
        r7 = r10.leftMargin;
        r7 = r7 + r3;
        r8 = r10.rightMargin;
        r7 = r7 + r8;
        r3 = java.lang.Math.max(r3, r7);
        r0 = r31;
        r0.mTotalLength = r3;
    L_0x00fa:
        if (r28 == 0) goto L_0x0107;
    L_0x00fc:
        r3 = 0;
        r7 = 0;
        r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r7);
        r4.measure(r3, r3);
        if (r22 == 0) goto L_0x063b;
    L_0x0107:
        r3 = 1;
        if (r22 == 0) goto L_0x0637;
    L_0x010a:
        r12 = r3;
    L_0x010b:
        r3 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r6 = r10.width;	 Catch:{ RuntimeException -> 0x058d }
        if (r6 != 0) goto L_0x011c;
    L_0x0111:
        r6 = r10.weight;	 Catch:{ RuntimeException -> 0x058d }
        r7 = 0;
        r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1));
        if (r6 <= 0) goto L_0x011c;
    L_0x0118:
        r3 = 0;
        r6 = -2;
        r10.width = r6;
    L_0x011c:
        r21 = r3;
        r3 = 0;
        r3 = (r20 > r3 ? 1 : (r20 == r3 ? 0 : -1));
        if (r3 != 0) goto L_0x0591;
    L_0x0123:
        r0 = r31;
        r7 = r0.mTotalLength;	 Catch:{ RuntimeException -> 0x058f }
    L_0x0127:
        r9 = 0;
        r3 = r31;
        r6 = r32;
        r8 = r33;
        r3.measureChildBeforeLayout(r4, r5, r6, r7, r8, r9);	 Catch:{ RuntimeException -> 0x0594 }
        r3 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r0 = r21;
        if (r0 == r3) goto L_0x013b;
    L_0x0137:
        r0 = r21;
        r10.width = r0;	 Catch:{ RuntimeException -> 0x0594 }
    L_0x013b:
        r3 = r4.getMeasuredWidth();
        if (r11 == 0) goto L_0x0159;
    L_0x0141:
        r0 = r31;
        r6 = r0.mTotalLength;	 Catch:{ RuntimeException -> 0x0596 }
        r7 = r10.leftMargin;	 Catch:{ RuntimeException -> 0x0596 }
        r7 = r7 + r3;
        r8 = r10.rightMargin;	 Catch:{ RuntimeException -> 0x0596 }
        r7 = r7 + r8;
        r0 = r31;
        r8 = r0.getNextLocationOffset(r4);	 Catch:{ RuntimeException -> 0x0596 }
        r7 = r7 + r8;
        r6 = r6 + r7;
        r0 = r31;
        r0.mTotalLength = r6;	 Catch:{ RuntimeException -> 0x0596 }
        if (r22 == 0) goto L_0x0174;
    L_0x0159:
        r0 = r31;
        r6 = r0.mTotalLength;
        r7 = r6 + r3;
        r8 = r10.leftMargin;
        r7 = r7 + r8;
        r8 = r10.rightMargin;
        r7 = r7 + r8;
        r0 = r31;
        r8 = r0.getNextLocationOffset(r4);
        r7 = r7 + r8;
        r6 = java.lang.Math.max(r6, r7);
        r0 = r31;
        r0.mTotalLength = r6;
    L_0x0174:
        if (r29 == 0) goto L_0x0634;
    L_0x0176:
        r3 = java.lang.Math.max(r3, r13);
    L_0x017a:
        r6 = 0;
        r7 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = r25;
        if (r0 == r7) goto L_0x0631;
    L_0x0181:
        r7 = r10.height;	 Catch:{ RuntimeException -> 0x0598 }
        r8 = -1;
        if (r7 != r8) goto L_0x0631;
    L_0x0186:
        r7 = 1;
        r6 = 1;
    L_0x0188:
        r8 = r10.topMargin;
        r9 = r10.bottomMargin;
        r13 = r8 + r9;
        r8 = r4.getMeasuredHeight();
        r14 = r8 + r13;
        r8 = android.support.v4.view.ViewCompat.getMeasuredState(r4);
        r0 = r18;
        r18 = android.support.v7.widget.ViewUtils.combineMeasuredStates(r0, r8);
        if (r28 == 0) goto L_0x01cd;
    L_0x01a0:
        r9 = r4.getBaseline();
        r8 = -1;
        if (r9 == r8) goto L_0x01cd;
    L_0x01a7:
        r8 = r10.gravity;	 Catch:{ RuntimeException -> 0x059a }
        if (r8 >= 0) goto L_0x059c;
    L_0x01ab:
        r0 = r31;
        r8 = r0.mGravity;	 Catch:{ RuntimeException -> 0x059a }
    L_0x01af:
        r8 = r8 & 112;
        r8 = r8 >> 4;
        r8 = r8 & -2;
        r8 = r8 >> 1;
        r21 = r26[r8];
        r0 = r21;
        r21 = java.lang.Math.max(r0, r9);
        r26[r8] = r21;
        r21 = r27[r8];
        r9 = r14 - r9;
        r0 = r21;
        r9 = java.lang.Math.max(r0, r9);
        r27[r8] = r9;
    L_0x01cd:
        r0 = r19;
        r19 = java.lang.Math.max(r0, r14);
        if (r16 == 0) goto L_0x05a2;
    L_0x01d5:
        r8 = r10.height;	 Catch:{ RuntimeException -> 0x05a0 }
        r9 = -1;
        if (r8 != r9) goto L_0x05a2;
    L_0x01da:
        r8 = 1;
    L_0x01db:
        r9 = r10.weight;	 Catch:{ RuntimeException -> 0x05a5 }
        r10 = 0;
        r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1));
        if (r9 <= 0) goto L_0x062d;
    L_0x01e2:
        if (r6 == 0) goto L_0x05a9;
    L_0x01e4:
        r9 = r13;
    L_0x01e5:
        r0 = r17;
        r9 = java.lang.Math.max(r0, r9);
        if (r22 == 0) goto L_0x0629;
    L_0x01ed:
        if (r6 == 0) goto L_0x05ac;
    L_0x01ef:
        r6 = java.lang.Math.max(r15, r13);
        r30 = r9;
        r9 = r6;
        r6 = r30;
    L_0x01f8:
        r0 = r31;
        r4 = r0.getChildrenSkipCount(r4, r5);
        r4 = r4 + r5;
        r10 = r4;
        r13 = r3;
        r14 = r7;
        r5 = r20;
        r3 = r8;
        r4 = r6;
        r7 = r9;
        r6 = r12;
        r8 = r18;
        r9 = r19;
    L_0x020c:
        r10 = r10 + 1;
        if (r22 == 0) goto L_0x061c;
    L_0x0210:
        r15 = r13;
        r12 = r6;
        r16 = r14;
        r17 = r4;
        r6 = r3;
    L_0x0217:
        r0 = r31;
        r3 = r0.mTotalLength;	 Catch:{ RuntimeException -> 0x05af }
        if (r3 <= 0) goto L_0x0234;
    L_0x021d:
        r0 = r31;
        r1 = r23;
        r3 = r0.hasDividerBeforeChildAt(r1);	 Catch:{ RuntimeException -> 0x05b1 }
        if (r3 == 0) goto L_0x0234;
    L_0x0227:
        r0 = r31;
        r3 = r0.mTotalLength;	 Catch:{ RuntimeException -> 0x05b1 }
        r0 = r31;
        r4 = r0.mDividerWidth;	 Catch:{ RuntimeException -> 0x05b1 }
        r3 = r3 + r4;
        r0 = r31;
        r0.mTotalLength = r3;	 Catch:{ RuntimeException -> 0x05b1 }
    L_0x0234:
        r3 = 1;
        r3 = r26[r3];	 Catch:{ RuntimeException -> 0x05b3 }
        r4 = -1;
        if (r3 != r4) goto L_0x024c;
    L_0x023a:
        r3 = 0;
        r3 = r26[r3];	 Catch:{ RuntimeException -> 0x05b5 }
        r4 = -1;
        if (r3 != r4) goto L_0x024c;
    L_0x0240:
        r3 = 2;
        r3 = r26[r3];	 Catch:{ RuntimeException -> 0x05b7 }
        r4 = -1;
        if (r3 != r4) goto L_0x024c;
    L_0x0246:
        r3 = 3;
        r3 = r26[r3];	 Catch:{ RuntimeException -> 0x05b7 }
        r4 = -1;
        if (r3 == r4) goto L_0x0281;
    L_0x024c:
        r3 = 3;
        r3 = r26[r3];
        r4 = 0;
        r4 = r26[r4];
        r10 = 1;
        r10 = r26[r10];
        r13 = 2;
        r13 = r26[r13];
        r10 = java.lang.Math.max(r10, r13);
        r4 = java.lang.Math.max(r4, r10);
        r3 = java.lang.Math.max(r3, r4);
        r4 = 3;
        r4 = r27[r4];
        r10 = 0;
        r10 = r27[r10];
        r13 = 1;
        r13 = r27[r13];
        r14 = 2;
        r14 = r27[r14];
        r13 = java.lang.Math.max(r13, r14);
        r10 = java.lang.Math.max(r10, r13);
        r4 = java.lang.Math.max(r4, r10);
        r3 = r3 + r4;
        r9 = java.lang.Math.max(r9, r3);
    L_0x0281:
        if (r29 == 0) goto L_0x0307;
    L_0x0283:
        r3 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r0 = r24;
        if (r0 == r3) goto L_0x028b;
    L_0x0289:
        if (r24 != 0) goto L_0x0307;
    L_0x028b:
        r3 = 0;
        r0 = r31;
        r0.mTotalLength = r3;
        r3 = 0;
    L_0x0291:
        r0 = r23;
        if (r3 >= r0) goto L_0x0307;
    L_0x0295:
        r0 = r31;
        r10 = r0.getVirtualChildAt(r3);
        if (r10 != 0) goto L_0x02ae;
    L_0x029d:
        r0 = r31;
        r4 = r0.mTotalLength;	 Catch:{ RuntimeException -> 0x05b9 }
        r0 = r31;
        r13 = r0.measureNullChild(r3);	 Catch:{ RuntimeException -> 0x05b9 }
        r4 = r4 + r13;
        r0 = r31;
        r0.mTotalLength = r4;	 Catch:{ RuntimeException -> 0x05b9 }
        if (r22 == 0) goto L_0x0303;
    L_0x02ae:
        r4 = r10.getVisibility();	 Catch:{ RuntimeException -> 0x05b9 }
        r13 = 8;
        if (r4 != r13) goto L_0x02bf;
    L_0x02b6:
        r0 = r31;
        r4 = r0.getChildrenSkipCount(r10, r3);
        r3 = r3 + r4;
        if (r22 == 0) goto L_0x0303;
    L_0x02bf:
        r4 = r3;
        r3 = r10.getLayoutParams();
        r3 = (android.support.v7.widget.LinearLayoutCompat.LayoutParams) r3;
        if (r11 == 0) goto L_0x02e4;
    L_0x02c8:
        r0 = r31;
        r13 = r0.mTotalLength;	 Catch:{ RuntimeException -> 0x05bb }
        r14 = r3.leftMargin;	 Catch:{ RuntimeException -> 0x05bb }
        r14 = r14 + r15;
        r0 = r3.rightMargin;	 Catch:{ RuntimeException -> 0x05bb }
        r18 = r0;
        r14 = r14 + r18;
        r0 = r31;
        r18 = r0.getNextLocationOffset(r10);	 Catch:{ RuntimeException -> 0x05bb }
        r14 = r14 + r18;
        r13 = r13 + r14;
        r0 = r31;
        r0.mTotalLength = r13;	 Catch:{ RuntimeException -> 0x05bb }
        if (r22 == 0) goto L_0x0302;
    L_0x02e4:
        r0 = r31;
        r13 = r0.mTotalLength;
        r14 = r13 + r15;
        r0 = r3.leftMargin;
        r18 = r0;
        r14 = r14 + r18;
        r3 = r3.rightMargin;
        r3 = r3 + r14;
        r0 = r31;
        r10 = r0.getNextLocationOffset(r10);
        r3 = r3 + r10;
        r3 = java.lang.Math.max(r13, r3);
        r0 = r31;
        r0.mTotalLength = r3;
    L_0x0302:
        r3 = r4;
    L_0x0303:
        r3 = r3 + 1;
        if (r22 == 0) goto L_0x0291;
    L_0x0307:
        r0 = r31;
        r3 = r0.mTotalLength;
        r4 = r31.getPaddingLeft();
        r10 = r31.getPaddingRight();
        r4 = r4 + r10;
        r3 = r3 + r4;
        r0 = r31;
        r0.mTotalLength = r3;
        r0 = r31;
        r3 = r0.mTotalLength;
        r4 = r31.getSuggestedMinimumWidth();
        r3 = java.lang.Math.max(r3, r4);
        r4 = 0;
        r0 = r32;
        r18 = android.support.v4.view.ViewCompat.resolveSizeAndState(r3, r0, r4);
        r3 = 16777215; // 0xffffff float:2.3509886E-38 double:8.2890456E-317;
        r3 = r3 & r18;
        r0 = r31;
        r4 = r0.mTotalLength;
        r10 = r3 - r4;
        if (r12 != 0) goto L_0x0340;
    L_0x0339:
        if (r10 == 0) goto L_0x0616;
    L_0x033b:
        r3 = 0;
        r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1));
        if (r3 <= 0) goto L_0x0616;
    L_0x0340:
        r0 = r31;
        r3 = r0.mWeightSum;	 Catch:{ RuntimeException -> 0x05bd }
        r4 = 0;
        r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1));
        if (r3 <= 0) goto L_0x05bf;
    L_0x0349:
        r0 = r31;
        r3 = r0.mWeightSum;	 Catch:{ RuntimeException -> 0x05bd }
    L_0x034d:
        r4 = 0;
        r5 = 1;
        r9 = 2;
        r12 = 3;
        r13 = -1;
        r26[r12] = r13;
        r26[r9] = r13;
        r26[r5] = r13;
        r26[r4] = r13;
        r4 = 0;
        r5 = 1;
        r9 = 2;
        r12 = 3;
        r13 = -1;
        r27[r12] = r13;
        r27[r9] = r13;
        r27[r5] = r13;
        r27[r4] = r13;
        r9 = -1;
        r4 = 0;
        r0 = r31;
        r0.mTotalLength = r4;
        r4 = 0;
        r14 = r4;
        r5 = r8;
        r8 = r7;
        r7 = r6;
        r6 = r3;
    L_0x0373:
        r0 = r23;
        if (r14 >= r0) goto L_0x0611;
    L_0x0377:
        r0 = r31;
        r19 = r0.getVirtualChildAt(r14);
        if (r19 == 0) goto L_0x060a;
    L_0x037f:
        r3 = r19.getVisibility();	 Catch:{ RuntimeException -> 0x05c2 }
        r4 = 8;
        if (r3 != r4) goto L_0x0389;
    L_0x0387:
        if (r22 == 0) goto L_0x060a;
    L_0x0389:
        r3 = r19.getLayoutParams();
        r3 = (android.support.v7.widget.LinearLayoutCompat.LayoutParams) r3;
        r12 = r3.weight;
        r4 = 0;
        r4 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1));
        if (r4 <= 0) goto L_0x0605;
    L_0x0396:
        r4 = (float) r10;
        r4 = r4 * r12;
        r4 = r4 / r6;
        r4 = (int) r4;
        r6 = r6 - r12;
        r12 = r10 - r4;
        r10 = r31.getPaddingTop();
        r13 = r31.getPaddingBottom();
        r10 = r10 + r13;
        r13 = r3.topMargin;
        r10 = r10 + r13;
        r13 = r3.bottomMargin;
        r10 = r10 + r13;
        r13 = r3.height;
        r0 = r33;
        r13 = getChildMeasureSpec(r0, r10, r13);
        r10 = r3.width;	 Catch:{ RuntimeException -> 0x05c4 }
        if (r10 != 0) goto L_0x03be;
    L_0x03b8:
        r10 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = r24;
        if (r0 == r10) goto L_0x03d5;
    L_0x03be:
        r10 = r19.getMeasuredWidth();
        r10 = r10 + r4;
        if (r10 >= 0) goto L_0x03c6;
    L_0x03c5:
        r10 = 0;
    L_0x03c6:
        r20 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = r20;
        r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r0);	 Catch:{ RuntimeException -> 0x05c6 }
        r0 = r19;
        r0.measure(r10, r13);	 Catch:{ RuntimeException -> 0x05c6 }
        if (r22 == 0) goto L_0x03e2;
    L_0x03d5:
        if (r4 <= 0) goto L_0x05ca;
    L_0x03d7:
        r10 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r10);
        r0 = r19;
        r0.measure(r4, r13);
    L_0x03e2:
        r4 = android.support.v4.view.ViewCompat.getMeasuredState(r19);
        r10 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r4 = r4 & r10;
        r13 = android.support.v7.widget.ViewUtils.combineMeasuredStates(r5, r4);
        r10 = r6;
    L_0x03ee:
        if (r11 == 0) goto L_0x040e;
    L_0x03f0:
        r0 = r31;
        r4 = r0.mTotalLength;	 Catch:{ RuntimeException -> 0x05cd }
        r5 = r19.getMeasuredWidth();	 Catch:{ RuntimeException -> 0x05cd }
        r6 = r3.leftMargin;	 Catch:{ RuntimeException -> 0x05cd }
        r5 = r5 + r6;
        r6 = r3.rightMargin;	 Catch:{ RuntimeException -> 0x05cd }
        r5 = r5 + r6;
        r0 = r31;
        r1 = r19;
        r6 = r0.getNextLocationOffset(r1);	 Catch:{ RuntimeException -> 0x05cd }
        r5 = r5 + r6;
        r4 = r4 + r5;
        r0 = r31;
        r0.mTotalLength = r4;	 Catch:{ RuntimeException -> 0x05cd }
        if (r22 == 0) goto L_0x042e;
    L_0x040e:
        r0 = r31;
        r4 = r0.mTotalLength;
        r5 = r19.getMeasuredWidth();
        r5 = r5 + r4;
        r6 = r3.leftMargin;
        r5 = r5 + r6;
        r6 = r3.rightMargin;
        r5 = r5 + r6;
        r0 = r31;
        r1 = r19;
        r6 = r0.getNextLocationOffset(r1);
        r5 = r5 + r6;
        r4 = java.lang.Math.max(r4, r5);
        r0 = r31;
        r0.mTotalLength = r4;
    L_0x042e:
        r4 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = r25;
        if (r0 == r4) goto L_0x05d1;
    L_0x0434:
        r4 = r3.height;	 Catch:{ RuntimeException -> 0x05cf }
        r5 = -1;
        if (r4 != r5) goto L_0x05d1;
    L_0x0439:
        r4 = 1;
    L_0x043a:
        r5 = r3.topMargin;
        r6 = r3.bottomMargin;
        r5 = r5 + r6;
        r6 = r19.getMeasuredHeight();
        r6 = r6 + r5;
        r9 = java.lang.Math.max(r9, r6);
        if (r4 == 0) goto L_0x05d4;
    L_0x044a:
        r4 = r5;
    L_0x044b:
        r8 = java.lang.Math.max(r8, r4);
        if (r7 == 0) goto L_0x05d9;
    L_0x0451:
        r4 = r3.height;	 Catch:{ RuntimeException -> 0x05d7 }
        r5 = -1;
        if (r4 != r5) goto L_0x05d9;
    L_0x0456:
        r7 = 1;
    L_0x0457:
        if (r28 == 0) goto L_0x0482;
    L_0x0459:
        r4 = r19.getBaseline();
        r5 = -1;
        if (r4 == r5) goto L_0x0482;
    L_0x0460:
        r5 = r3.gravity;	 Catch:{ RuntimeException -> 0x05dc }
        if (r5 >= 0) goto L_0x05de;
    L_0x0464:
        r0 = r31;
        r3 = r0.mGravity;	 Catch:{ RuntimeException -> 0x05dc }
    L_0x0468:
        r3 = r3 & 112;
        r3 = r3 >> 4;
        r3 = r3 & -2;
        r3 = r3 >> 1;
        r5 = r26[r3];
        r5 = java.lang.Math.max(r5, r4);
        r26[r3] = r5;
        r5 = r27[r3];
        r4 = r6 - r4;
        r4 = java.lang.Math.max(r5, r4);
        r27[r3] = r4;
    L_0x0482:
        r3 = r7;
        r4 = r8;
        r5 = r13;
        r6 = r9;
        r7 = r10;
        r8 = r12;
    L_0x0488:
        r9 = r14 + 1;
        if (r22 == 0) goto L_0x05fd;
    L_0x048c:
        r0 = r31;
        r7 = r0.mTotalLength;	 Catch:{ RuntimeException -> 0x05e2 }
        r8 = r31.getPaddingLeft();	 Catch:{ RuntimeException -> 0x05e2 }
        r9 = r31.getPaddingRight();	 Catch:{ RuntimeException -> 0x05e2 }
        r8 = r8 + r9;
        r7 = r7 + r8;
        r0 = r31;
        r0.mTotalLength = r7;	 Catch:{ RuntimeException -> 0x05e2 }
        r7 = 1;
        r7 = r26[r7];	 Catch:{ RuntimeException -> 0x05e2 }
        r8 = -1;
        if (r7 != r8) goto L_0x04b6;
    L_0x04a4:
        r7 = 0;
        r7 = r26[r7];	 Catch:{ RuntimeException -> 0x05e4 }
        r8 = -1;
        if (r7 != r8) goto L_0x04b6;
    L_0x04aa:
        r7 = 2;
        r7 = r26[r7];	 Catch:{ RuntimeException -> 0x05e6 }
        r8 = -1;
        if (r7 != r8) goto L_0x04b6;
    L_0x04b0:
        r7 = 3;
        r7 = r26[r7];	 Catch:{ RuntimeException -> 0x05e6 }
        r8 = -1;
        if (r7 == r8) goto L_0x04eb;
    L_0x04b6:
        r7 = 3;
        r7 = r26[r7];
        r8 = 0;
        r8 = r26[r8];
        r9 = 1;
        r9 = r26[r9];
        r10 = 2;
        r10 = r26[r10];
        r9 = java.lang.Math.max(r9, r10);
        r8 = java.lang.Math.max(r8, r9);
        r7 = java.lang.Math.max(r7, r8);
        r8 = 3;
        r8 = r27[r8];
        r9 = 0;
        r9 = r27[r9];
        r10 = 1;
        r10 = r27[r10];
        r11 = 2;
        r11 = r27[r11];
        r10 = java.lang.Math.max(r10, r11);
        r9 = java.lang.Math.max(r9, r10);
        r8 = java.lang.Math.max(r8, r9);
        r7 = r7 + r8;
        r6 = java.lang.Math.max(r6, r7);
    L_0x04eb:
        if (r22 == 0) goto L_0x05f4;
    L_0x04ed:
        r30 = r3;
        r3 = r4;
        r4 = r30;
    L_0x04f2:
        r0 = r17;
        r7 = java.lang.Math.max(r3, r0);
        if (r29 == 0) goto L_0x053c;
    L_0x04fa:
        r3 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = r24;
        if (r0 == r3) goto L_0x053c;
    L_0x0500:
        r3 = 0;
        r8 = r3;
    L_0x0502:
        r0 = r23;
        if (r8 >= r0) goto L_0x053c;
    L_0x0506:
        r0 = r31;
        r9 = r0.getVirtualChildAt(r8);
        if (r9 == 0) goto L_0x0538;
    L_0x050e:
        r3 = r9.getVisibility();	 Catch:{ RuntimeException -> 0x05e8 }
        r10 = 8;
        if (r3 != r10) goto L_0x0518;
    L_0x0516:
        if (r22 == 0) goto L_0x0538;
    L_0x0518:
        r3 = r9.getLayoutParams();
        r3 = (android.support.v7.widget.LinearLayoutCompat.LayoutParams) r3;
        r3 = r3.weight;
        r10 = 0;
        r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1));
        if (r3 <= 0) goto L_0x0538;
    L_0x0525:
        r3 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r3 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r3);	 Catch:{ RuntimeException -> 0x05ea }
        r10 = r9.getMeasuredHeight();	 Catch:{ RuntimeException -> 0x05ea }
        r11 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r11);	 Catch:{ RuntimeException -> 0x05ea }
        r9.measure(r3, r10);	 Catch:{ RuntimeException -> 0x05ea }
    L_0x0538:
        r3 = r8 + 1;
        if (r22 == 0) goto L_0x05f1;
    L_0x053c:
        r3 = r7;
        r30 = r4;
        r4 = r6;
        r6 = r5;
        r5 = r30;
    L_0x0543:
        if (r5 != 0) goto L_0x05ee;
    L_0x0545:
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = r25;
        if (r0 == r5) goto L_0x05ee;
    L_0x054b:
        r4 = r31.getPaddingTop();
        r5 = r31.getPaddingBottom();
        r4 = r4 + r5;
        r3 = r3 + r4;
        r4 = r31.getSuggestedMinimumHeight();
        r3 = java.lang.Math.max(r3, r4);
        r4 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r4 = r4 & r6;
        r4 = r4 | r18;
        r5 = r6 << 16;
        r0 = r33;
        r3 = android.support.v4.view.ViewCompat.resolveSizeAndState(r3, r0, r5);	 Catch:{ RuntimeException -> 0x05ec }
        r0 = r31;
        r0.setMeasuredDimension(r4, r3);	 Catch:{ RuntimeException -> 0x05ec }
        if (r16 == 0) goto L_0x057a;
    L_0x0571:
        r0 = r31;
        r1 = r23;
        r2 = r32;
        r0.forceUniformHeight(r1, r2);	 Catch:{ RuntimeException -> 0x05ec }
    L_0x057a:
        return;
    L_0x057b:
        r3 = move-exception;
        throw r3;	 Catch:{ RuntimeException -> 0x057d }
    L_0x057d:
        r3 = move-exception;
        throw r3;
    L_0x057f:
        r3 = 0;
        r11 = r3;
        goto L_0x0073;
    L_0x0583:
        r3 = move-exception;
        throw r3;
    L_0x0585:
        r3 = move-exception;
        throw r3;
    L_0x0587:
        r3 = move-exception;
        throw r3;	 Catch:{ RuntimeException -> 0x0589 }
    L_0x0589:
        r3 = move-exception;
        throw r3;	 Catch:{ RuntimeException -> 0x058b }
    L_0x058b:
        r3 = move-exception;
        throw r3;
    L_0x058d:
        r3 = move-exception;
        throw r3;
    L_0x058f:
        r3 = move-exception;
        throw r3;
    L_0x0591:
        r7 = 0;
        goto L_0x0127;
    L_0x0594:
        r3 = move-exception;
        throw r3;
    L_0x0596:
        r3 = move-exception;
        throw r3;
    L_0x0598:
        r3 = move-exception;
        throw r3;
    L_0x059a:
        r3 = move-exception;
        throw r3;
    L_0x059c:
        r8 = r10.gravity;
        goto L_0x01af;
    L_0x05a0:
        r3 = move-exception;
        throw r3;
    L_0x05a2:
        r8 = 0;
        goto L_0x01db;
    L_0x05a5:
        r3 = move-exception;
        throw r3;	 Catch:{ RuntimeException -> 0x05a7 }
    L_0x05a7:
        r3 = move-exception;
        throw r3;
    L_0x05a9:
        r9 = r14;
        goto L_0x01e5;
    L_0x05ac:
        r13 = r14;
        goto L_0x01ef;
    L_0x05af:
        r3 = move-exception;
        throw r3;	 Catch:{ RuntimeException -> 0x05b1 }
    L_0x05b1:
        r3 = move-exception;
        throw r3;
    L_0x05b3:
        r3 = move-exception;
        throw r3;	 Catch:{ RuntimeException -> 0x05b5 }
    L_0x05b5:
        r3 = move-exception;
        throw r3;	 Catch:{ RuntimeException -> 0x05b7 }
    L_0x05b7:
        r3 = move-exception;
        throw r3;
    L_0x05b9:
        r3 = move-exception;
        throw r3;
    L_0x05bb:
        r3 = move-exception;
        throw r3;
    L_0x05bd:
        r3 = move-exception;
        throw r3;
    L_0x05bf:
        r3 = r5;
        goto L_0x034d;
    L_0x05c2:
        r3 = move-exception;
        throw r3;
    L_0x05c4:
        r3 = move-exception;
        throw r3;
    L_0x05c6:
        r3 = move-exception;
        throw r3;	 Catch:{ RuntimeException -> 0x05c8 }
    L_0x05c8:
        r3 = move-exception;
        throw r3;
    L_0x05ca:
        r4 = 0;
        goto L_0x03d7;
    L_0x05cd:
        r3 = move-exception;
        throw r3;
    L_0x05cf:
        r3 = move-exception;
        throw r3;
    L_0x05d1:
        r4 = 0;
        goto L_0x043a;
    L_0x05d4:
        r4 = r6;
        goto L_0x044b;
    L_0x05d7:
        r3 = move-exception;
        throw r3;
    L_0x05d9:
        r7 = 0;
        goto L_0x0457;
    L_0x05dc:
        r3 = move-exception;
        throw r3;
    L_0x05de:
        r3 = r3.gravity;
        goto L_0x0468;
    L_0x05e2:
        r3 = move-exception;
        throw r3;	 Catch:{ RuntimeException -> 0x05e4 }
    L_0x05e4:
        r3 = move-exception;
        throw r3;	 Catch:{ RuntimeException -> 0x05e6 }
    L_0x05e6:
        r3 = move-exception;
        throw r3;
    L_0x05e8:
        r3 = move-exception;
        throw r3;
    L_0x05ea:
        r3 = move-exception;
        throw r3;
    L_0x05ec:
        r3 = move-exception;
        throw r3;
    L_0x05ee:
        r3 = r4;
        goto L_0x054b;
    L_0x05f1:
        r8 = r3;
        goto L_0x0502;
    L_0x05f4:
        r30 = r3;
        r3 = r4;
        r4 = r6;
        r6 = r5;
        r5 = r30;
        goto L_0x0543;
    L_0x05fd:
        r14 = r9;
        r10 = r8;
        r8 = r4;
        r9 = r6;
        r6 = r7;
        r7 = r3;
        goto L_0x0373;
    L_0x0605:
        r12 = r10;
        r13 = r5;
        r10 = r6;
        goto L_0x03ee;
    L_0x060a:
        r3 = r7;
        r4 = r8;
        r7 = r6;
        r8 = r10;
        r6 = r9;
        goto L_0x0488;
    L_0x0611:
        r3 = r7;
        r4 = r8;
        r6 = r9;
        goto L_0x048c;
    L_0x0616:
        r4 = r6;
        r3 = r7;
        r5 = r8;
        r6 = r9;
        goto L_0x04f2;
    L_0x061c:
        r16 = r3;
        r17 = r4;
        r15 = r7;
        r18 = r8;
        r19 = r9;
        r7 = r5;
        r3 = r10;
        goto L_0x0076;
    L_0x0629:
        r6 = r9;
        r9 = r15;
        goto L_0x01f8;
    L_0x062d:
        r9 = r17;
        goto L_0x01ed;
    L_0x0631:
        r7 = r14;
        goto L_0x0188;
    L_0x0634:
        r3 = r13;
        goto L_0x017a;
    L_0x0637:
        r12 = r3;
        r3 = r13;
        goto L_0x017a;
    L_0x063b:
        r3 = r13;
        r12 = r6;
        goto L_0x017a;
    L_0x063f:
        r12 = r6;
        goto L_0x010b;
    L_0x0642:
        r10 = r3;
        r5 = r7;
        r4 = r17;
        r8 = r18;
        r9 = r19;
        r3 = r16;
        r7 = r15;
        goto L_0x020c;
    L_0x064f:
        r12 = r6;
        r5 = r7;
        r8 = r18;
        r9 = r19;
        r6 = r16;
        r7 = r15;
        r16 = r14;
        r15 = r13;
        goto L_0x0217;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutCompat.measureHorizontal(int, int):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void drawDividersHorizontal(android.graphics.Canvas r9) {
        /*
        r8 = this;
        r3 = a;
        r4 = r8.getVirtualChildCount();
        r5 = android.support.v7.widget.ViewUtils.isLayoutRtl(r8);
        r0 = 0;
        r2 = r0;
    L_0x000c:
        if (r2 >= r4) goto L_0x0045;
    L_0x000e:
        r6 = r8.getVirtualChildAt(r2);
        if (r6 == 0) goto L_0x0041;
    L_0x0014:
        r0 = r6.getVisibility();	 Catch:{ RuntimeException -> 0x0088 }
        r1 = 8;
        if (r0 == r1) goto L_0x0041;
    L_0x001c:
        r0 = r8.hasDividerBeforeChildAt(r2);	 Catch:{ RuntimeException -> 0x0088 }
        if (r0 == 0) goto L_0x0041;
    L_0x0022:
        r0 = r6.getLayoutParams();
        r0 = (android.support.v7.widget.LinearLayoutCompat.LayoutParams) r0;
        if (r5 == 0) goto L_0x0033;
    L_0x002a:
        r1 = r6.getRight();
        r7 = r0.rightMargin;
        r1 = r1 + r7;
        if (r3 == 0) goto L_0x008f;
    L_0x0033:
        r1 = r6.getLeft();
        r0 = r0.leftMargin;
        r0 = r1 - r0;
        r1 = r8.mDividerWidth;
        r0 = r0 - r1;
    L_0x003e:
        r8.drawVerticalDivider(r9, r0);
    L_0x0041:
        r0 = r2 + 1;
        if (r3 == 0) goto L_0x008c;
    L_0x0045:
        r0 = r8.hasDividerBeforeChildAt(r4);
        if (r0 == 0) goto L_0x0087;
    L_0x004b:
        r0 = r4 + -1;
        r2 = r8.getVirtualChildAt(r0);
        if (r2 != 0) goto L_0x0069;
    L_0x0053:
        if (r5 == 0) goto L_0x005b;
    L_0x0055:
        r0 = r8.getPaddingLeft();
        if (r3 == 0) goto L_0x0084;
    L_0x005b:
        r0 = r8.getWidth();
        r1 = r8.getPaddingRight();
        r0 = r0 - r1;
        r1 = r8.mDividerWidth;
        r0 = r0 - r1;
        if (r3 == 0) goto L_0x0084;
    L_0x0069:
        r0 = r2.getLayoutParams();
        r0 = (android.support.v7.widget.LinearLayoutCompat.LayoutParams) r0;
        if (r5 == 0) goto L_0x007d;
    L_0x0071:
        r1 = r2.getLeft();
        r4 = r0.leftMargin;
        r1 = r1 - r4;
        r4 = r8.mDividerWidth;
        r1 = r1 - r4;
        if (r3 == 0) goto L_0x008a;
    L_0x007d:
        r1 = r2.getRight();
        r0 = r0.rightMargin;
        r0 = r0 + r1;
    L_0x0084:
        r8.drawVerticalDivider(r9, r0);
    L_0x0087:
        return;
    L_0x0088:
        r0 = move-exception;
        throw r0;
    L_0x008a:
        r0 = r1;
        goto L_0x0084;
    L_0x008c:
        r2 = r0;
        goto L_0x000c;
    L_0x008f:
        r0 = r1;
        goto L_0x003e;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutCompat.drawDividersHorizontal(android.graphics.Canvas):void");
    }

    int getNextLocationOffset(View view) {
        return 0;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        try {
            if (VERSION.SDK_INT >= 14) {
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(LinearLayoutCompat.class.getName());
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public android.view.ViewGroup.LayoutParams m12generateLayoutParams(AttributeSet attributeSet) {
        return generateLayoutParams(attributeSet);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void layoutHorizontal(int r24, int r25, int r26, int r27) {
        /*
        r23 = this;
        r15 = a;
        r4 = android.support.v7.widget.ViewUtils.isLayoutRtl(r23);
        r11 = r23.getPaddingTop();
        r2 = r27 - r25;
        r3 = r23.getPaddingBottom();
        r16 = r2 - r3;
        r2 = r2 - r11;
        r3 = r23.getPaddingBottom();
        r17 = r2 - r3;
        r18 = r23.getVirtualChildCount();
        r0 = r23;
        r2 = r0.mGravity;
        r3 = 8388615; // 0x800007 float:1.1754953E-38 double:4.1445265E-317;
        r2 = r2 & r3;
        r0 = r23;
        r3 = r0.mGravity;
        r14 = r3 & 112;
        r0 = r23;
        r0 = r0.mBaselineAligned;
        r19 = r0;
        r0 = r23;
        r0 = r0.mMaxAscent;
        r20 = r0;
        r0 = r23;
        r0 = r0.mMaxDescent;
        r21 = r0;
        r3 = android.support.v4.view.ViewCompat.getLayoutDirection(r23);
        r2 = android.support.v4.view.GravityCompat.getAbsoluteGravity(r2, r3);
        switch(r2) {
            case 1: goto L_0x00ea;
            case 5: goto L_0x00da;
            default: goto L_0x0048;
        };
    L_0x0048:
        r12 = r23.getPaddingLeft();
    L_0x004c:
        r3 = 0;
        r2 = 1;
        if (r4 == 0) goto L_0x013e;
    L_0x0050:
        r3 = r18 + -1;
        r2 = -1;
        r9 = r2;
        r10 = r3;
    L_0x0055:
        r13 = 0;
    L_0x0056:
        r0 = r18;
        if (r13 >= r0) goto L_0x00d9;
    L_0x005a:
        r2 = r9 * r13;
        r22 = r10 + r2;
        r0 = r23;
        r1 = r22;
        r3 = r0.getVirtualChildAt(r1);
        if (r3 != 0) goto L_0x0073;
    L_0x0068:
        r0 = r23;
        r1 = r22;
        r2 = r0.measureNullChild(r1);
        r12 = r12 + r2;
        if (r15 == 0) goto L_0x013c;
    L_0x0073:
        r2 = r3.getVisibility();	 Catch:{ RuntimeException -> 0x00fd }
        r4 = 8;
        if (r2 == r4) goto L_0x013c;
    L_0x007b:
        r6 = r3.getMeasuredWidth();
        r7 = r3.getMeasuredHeight();
        r4 = -1;
        r2 = r3.getLayoutParams();
        r8 = r2;
        r8 = (android.support.v7.widget.LinearLayoutCompat.LayoutParams) r8;
        if (r19 == 0) goto L_0x0139;
    L_0x008d:
        r2 = r8.height;	 Catch:{ RuntimeException -> 0x00ff }
        r5 = -1;
        if (r2 == r5) goto L_0x0139;
    L_0x0092:
        r2 = r3.getBaseline();
    L_0x0096:
        r4 = r8.gravity;
        if (r4 >= 0) goto L_0x009b;
    L_0x009a:
        r4 = r14;
    L_0x009b:
        r4 = r4 & 112;
        switch(r4) {
            case 16: goto L_0x010f;
            case 48: goto L_0x0101;
            case 80: goto L_0x011d;
            default: goto L_0x00a0;
        };
    L_0x00a0:
        r5 = r11;
    L_0x00a1:
        r0 = r23;
        r1 = r22;
        r2 = r0.hasDividerBeforeChildAt(r1);
        if (r2 == 0) goto L_0x0136;
    L_0x00ab:
        r0 = r23;
        r2 = r0.mDividerWidth;
        r2 = r2 + r12;
    L_0x00b0:
        r4 = r8.leftMargin;
        r12 = r2 + r4;
        r0 = r23;
        r2 = r0.getLocationOffset(r3);
        r4 = r12 + r2;
        r2 = r23;
        r2.setChildFrame(r3, r4, r5, r6, r7);
        r2 = r8.rightMargin;
        r2 = r2 + r6;
        r0 = r23;
        r4 = r0.getNextLocationOffset(r3);
        r2 = r2 + r4;
        r12 = r12 + r2;
        r0 = r23;
        r1 = r22;
        r2 = r0.getChildrenSkipCount(r3, r1);
        r2 = r2 + r13;
    L_0x00d5:
        r13 = r2 + 1;
        if (r15 == 0) goto L_0x0056;
    L_0x00d9:
        return;
    L_0x00da:
        r2 = r23.getPaddingLeft();
        r2 = r2 + r26;
        r2 = r2 - r24;
        r0 = r23;
        r3 = r0.mTotalLength;
        r12 = r2 - r3;
        if (r15 == 0) goto L_0x004c;
    L_0x00ea:
        r2 = r23.getPaddingLeft();
        r3 = r26 - r24;
        r0 = r23;
        r5 = r0.mTotalLength;
        r3 = r3 - r5;
        r3 = r3 / 2;
        r12 = r2 + r3;
        if (r15 == 0) goto L_0x004c;
    L_0x00fb:
        goto L_0x0048;
    L_0x00fd:
        r2 = move-exception;
        throw r2;
    L_0x00ff:
        r2 = move-exception;
        throw r2;
    L_0x0101:
        r4 = r8.topMargin;
        r5 = r11 + r4;
        r4 = -1;
        if (r2 == r4) goto L_0x00a1;
    L_0x0108:
        r4 = 1;
        r4 = r20[r4];
        r4 = r4 - r2;
        r5 = r5 + r4;
        if (r15 == 0) goto L_0x00a1;
    L_0x010f:
        r4 = r17 - r7;
        r4 = r4 / 2;
        r4 = r4 + r11;
        r5 = r8.topMargin;
        r4 = r4 + r5;
        r5 = r8.bottomMargin;
        r5 = r4 - r5;
        if (r15 == 0) goto L_0x00a1;
    L_0x011d:
        r4 = r16 - r7;
        r5 = r8.bottomMargin;
        r5 = r4 - r5;
        r4 = -1;
        if (r2 == r4) goto L_0x00a1;
    L_0x0126:
        r4 = r3.getMeasuredHeight();
        r2 = r4 - r2;
        r4 = 2;
        r4 = r21[r4];
        r2 = r4 - r2;
        r5 = r5 - r2;
        if (r15 == 0) goto L_0x00a1;
    L_0x0134:
        goto L_0x00a0;
    L_0x0136:
        r2 = r12;
        goto L_0x00b0;
    L_0x0139:
        r2 = r4;
        goto L_0x0096;
    L_0x013c:
        r2 = r13;
        goto L_0x00d5;
    L_0x013e:
        r9 = r2;
        r10 = r3;
        goto L_0x0055;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutCompat.layoutHorizontal(int, int, int, int):void");
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.mUseLargestChild = z;
    }

    protected android.view.ViewGroup.LayoutParams m13generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return generateLayoutParams(layoutParams);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getBaseline() {
        /*
        r5 = this;
        r4 = 1;
        r0 = -1;
        r1 = r5.mBaselineAlignedChildIndex;	 Catch:{ RuntimeException -> 0x000b }
        if (r1 >= 0) goto L_0x000d;
    L_0x0006:
        r0 = super.getBaseline();	 Catch:{ RuntimeException -> 0x000b }
    L_0x000a:
        return r0;
    L_0x000b:
        r0 = move-exception;
        throw r0;
    L_0x000d:
        r1 = r5.getChildCount();	 Catch:{ RuntimeException -> 0x0020 }
        r2 = r5.mBaselineAlignedChildIndex;	 Catch:{ RuntimeException -> 0x0020 }
        if (r1 > r2) goto L_0x0022;
    L_0x0015:
        r0 = new java.lang.RuntimeException;	 Catch:{ RuntimeException -> 0x0020 }
        r1 = z;	 Catch:{ RuntimeException -> 0x0020 }
        r2 = 1;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x0020 }
        r0.<init>(r1);	 Catch:{ RuntimeException -> 0x0020 }
        throw r0;	 Catch:{ RuntimeException -> 0x0020 }
    L_0x0020:
        r0 = move-exception;
        throw r0;
    L_0x0022:
        r1 = r5.mBaselineAlignedChildIndex;
        r2 = r5.getChildAt(r1);
        r3 = r2.getBaseline();
        if (r3 != r0) goto L_0x003f;
    L_0x002e:
        r1 = r5.mBaselineAlignedChildIndex;	 Catch:{ RuntimeException -> 0x003d }
        if (r1 == 0) goto L_0x000a;
    L_0x0032:
        r0 = new java.lang.RuntimeException;
        r1 = z;
        r2 = 0;
        r1 = r1[r2];
        r0.<init>(r1);
        throw r0;
    L_0x003d:
        r0 = move-exception;
        throw r0;
    L_0x003f:
        r0 = r5.mBaselineChildTop;
        r1 = r5.mOrientation;
        if (r1 != r4) goto L_0x0050;
    L_0x0045:
        r1 = r5.mGravity;
        r1 = r1 & 112;
        r4 = 48;
        if (r1 == r4) goto L_0x0050;
    L_0x004d:
        switch(r1) {
            case 16: goto L_0x0071;
            case 80: goto L_0x005c;
            default: goto L_0x0050;
        };
    L_0x0050:
        r1 = r0;
    L_0x0051:
        r0 = r2.getLayoutParams();
        r0 = (android.support.v7.widget.LinearLayoutCompat.LayoutParams) r0;
        r0 = r0.topMargin;
        r0 = r0 + r1;
        r0 = r0 + r3;
        goto L_0x000a;
    L_0x005c:
        r0 = r5.getBottom();
        r1 = r5.getTop();
        r0 = r0 - r1;
        r1 = r5.getPaddingBottom();
        r0 = r0 - r1;
        r1 = r5.mTotalLength;
        r0 = r0 - r1;
        r1 = a;
        if (r1 == 0) goto L_0x0050;
    L_0x0071:
        r1 = r5.getBottom();
        r4 = r5.getTop();
        r1 = r1 - r4;
        r4 = r5.getPaddingTop();
        r1 = r1 - r4;
        r4 = r5.getPaddingBottom();
        r1 = r1 - r4;
        r4 = r5.mTotalLength;
        r1 = r1 - r4;
        r1 = r1 / 2;
        r0 = r0 + r1;
        r1 = r0;
        goto L_0x0051;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutCompat.getBaseline():int");
    }

    protected void onDraw(Canvas canvas) {
        try {
            if (this.mDivider != null) {
                try {
                    if (this.mOrientation == 1) {
                        drawDividersVertical(canvas);
                        if (!a) {
                            return;
                        }
                    }
                    drawDividersHorizontal(canvas);
                } catch (RuntimeException e) {
                    throw e;
                } catch (RuntimeException e2) {
                    throw e2;
                }
            }
        } catch (RuntimeException e22) {
            throw e22;
        }
    }

    void drawHorizontalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i);
        this.mDivider.draw(canvas);
    }

    int getLocationOffset(View view) {
        return 0;
    }

    int measureNullChild(int i) {
        return 0;
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mBaselineChildTop = 0;
        this.mGravity = 8388659;
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, R.styleable.LinearLayoutCompat, i, 0);
        int i2 = obtainStyledAttributes.getInt(R.styleable.LinearLayoutCompat_android_orientation, -1);
        if (i2 >= 0) {
            try {
                setOrientation(i2);
            } catch (RuntimeException e) {
                throw e;
            }
        }
        i2 = obtainStyledAttributes.getInt(R.styleable.LinearLayoutCompat_android_gravity, -1);
        if (i2 >= 0) {
            try {
                setGravity(i2);
            } catch (RuntimeException e2) {
                throw e2;
            }
        }
        boolean z = obtainStyledAttributes.getBoolean(R.styleable.LinearLayoutCompat_android_baselineAligned, true);
        if (!z) {
            try {
                setBaselineAligned(z);
            } catch (RuntimeException e22) {
                throw e22;
            }
        }
        this.mWeightSum = obtainStyledAttributes.getFloat(R.styleable.LinearLayoutCompat_android_weightSum, -1.0f);
        this.mBaselineAlignedChildIndex = obtainStyledAttributes.getInt(R.styleable.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.mUseLargestChild = obtainStyledAttributes.getBoolean(R.styleable.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(obtainStyledAttributes.getDrawable(R.styleable.LinearLayoutCompat_divider));
        this.mShowDividers = obtainStyledAttributes.getInt(R.styleable.LinearLayoutCompat_showDividers, 0);
        this.mDividerPadding = obtainStyledAttributes.getDimensionPixelSize(R.styleable.LinearLayoutCompat_dividerPadding, 0);
        obtainStyledAttributes.recycle();
    }

    int getChildrenSkipCount(View view, int i) {
        return 0;
    }

    public void setOrientation(int i) {
        try {
            if (this.mOrientation != i) {
                this.mOrientation = i;
                requestLayout();
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    void drawVerticalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(i, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    protected void onMeasure(int i, int i2) {
        try {
            if (this.mOrientation == 1) {
                measureVertical(i, i2);
                if (!a) {
                    return;
                }
            }
            measureHorizontal(i, i2);
        } catch (RuntimeException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw e2;
        }
    }
}
