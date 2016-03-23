package com.whatsapp;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;

public class TextAndDateLayout extends FrameLayout {
    public TextAndDateLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    private int a() {
        TextView textView = (TextView) getChildAt(0);
        if (!aam.d) {
            return (textView.getGravity() & 7) == 5 ? -1 : 1;
        } else {
            Layout layout = textView.getLayout();
            return layout.getParagraphDirection(layout.getLineCount() - 1);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onMeasure(int r11, int r12) {
        /*
        r10 = this;
        r1 = 0;
        r2 = 1;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = r10.getChildAt(r1);
        r0 = (android.widget.TextView) r0;
        r4 = r10.getChildAt(r2);
        r5 = r0.getLayout();
        if (r5 != 0) goto L_0x0015;
    L_0x0014:
        r1 = r2;
    L_0x0015:
        super.onMeasure(r11, r12);
        r5 = android.view.View.MeasureSpec.getSize(r11);
        r6 = r0.getLayout();
        r7 = r6.getLineCount();
        r7 = r7 + -1;
        r7 = r6.getLineStart(r7);
        r8 = r6.getLineCount();
        r8 = r8 + -1;
        r8 = r6.getLineEnd(r8);
        r9 = r0.getText();
        r7 = r9.subSequence(r7, r8);
        r8 = r0.getPaint();
        r7 = android.text.Layout.getDesiredWidth(r7, r8);
        r7 = (int) r7;
        r6 = r6.getLineCount();
        if (r6 <= r2) goto L_0x00d6;
    L_0x004b:
        r2 = r0.getMeasuredWidth();
        if (r1 != 0) goto L_0x011f;
    L_0x0051:
        r1 = r0.getText();
        if (r1 == 0) goto L_0x011f;
    L_0x0057:
        r1 = r0.getText();
        r6 = 10;
        r1 = android.text.TextUtils.indexOf(r1, r6);
        if (r1 < 0) goto L_0x011f;
    L_0x0063:
        r1 = r0.getText();
        r6 = r0.getPaint();
        r1 = android.text.Layout.getDesiredWidth(r1, r6);
        r8 = (double) r1;
        r8 = java.lang.Math.ceil(r8);
        r1 = (int) r8;
        r6 = r0.getPaddingRight();
        r1 = r1 + r6;
        r6 = r0.getPaddingLeft();
        r1 = r1 + r6;
        r1 = java.lang.Math.min(r2, r1);
    L_0x0083:
        r2 = r10.getPaddingLeft();
        r2 = r5 - r2;
        r6 = r10.getPaddingRight();
        r2 = r2 - r6;
        r6 = r4.getMeasuredWidth();
        r6 = r6 + r1;
        if (r2 < r6) goto L_0x00ad;
    L_0x0095:
        r2 = r4.getMeasuredWidth();
        r2 = r2 + r1;
        r6 = r10.getPaddingLeft();
        r2 = r2 + r6;
        r6 = r10.getPaddingRight();
        r2 = r2 + r6;
        r6 = r10.getMeasuredHeight();
        r10.setMeasuredDimension(r2, r6);
        if (r3 == 0) goto L_0x00d4;
    L_0x00ad:
        r2 = r0.getPaddingLeft();
        r1 = r1 - r2;
        r2 = r0.getPaddingRight();
        r1 = r1 - r2;
        r2 = r4.getMeasuredWidth();
        r2 = r2 + r7;
        if (r1 < r2) goto L_0x00c4;
    L_0x00be:
        r1 = r10.b();
        if (r1 == 0) goto L_0x00d4;
    L_0x00c4:
        r1 = r10.getMeasuredWidth();
        r2 = r10.getMeasuredHeight();
        r6 = r4.getMeasuredHeight();
        r2 = r2 + r6;
        r10.setMeasuredDimension(r1, r2);
    L_0x00d4:
        if (r3 == 0) goto L_0x011e;
    L_0x00d6:
        r1 = r10.getPaddingLeft();
        r1 = r5 - r1;
        r2 = r10.getPaddingRight();
        r1 = r1 - r2;
        r2 = r0.getMeasuredWidth();
        r5 = r4.getMeasuredWidth();
        r2 = r2 + r5;
        if (r1 < r2) goto L_0x010e;
    L_0x00ec:
        r0 = r0.getMeasuredWidth();
        r1 = r4.getMeasuredWidth();
        r0 = r0 + r1;
        r1 = r10.getPaddingLeft();
        r0 = r0 + r1;
        r1 = r10.getPaddingRight();
        r0 = r0 + r1;
        r1 = r10.getMeasuredWidth();
        if (r0 <= r1) goto L_0x010c;
    L_0x0105:
        r1 = r10.getMeasuredHeight();
        r10.setMeasuredDimension(r0, r1);
    L_0x010c:
        if (r3 == 0) goto L_0x011e;
    L_0x010e:
        r0 = r10.getMeasuredWidth();
        r1 = r10.getMeasuredHeight();
        r2 = r4.getMeasuredHeight();
        r1 = r1 + r2;
        r10.setMeasuredDimension(r0, r1);
    L_0x011e:
        return;
    L_0x011f:
        r1 = r2;
        goto L_0x0083;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.TextAndDateLayout.onMeasure(int, int):void");
    }

    public TextAndDateLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TextAndDateLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    private boolean b() {
        int a = a();
        if (a == -1 && App.a1()) {
            return true;
        }
        if (a != 1 || App.a1()) {
            return false;
        }
        return true;
    }

    public TextAndDateLayout(Context context) {
        super(context);
    }
}
