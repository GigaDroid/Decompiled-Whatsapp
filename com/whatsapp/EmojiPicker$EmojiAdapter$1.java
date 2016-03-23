package com.whatsapp;

import android.content.Context;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;

class EmojiPicker$EmojiAdapter$1 extends ViewGroup {
    final a_2 a;

    EmojiPicker$EmojiAdapter$1(a_2 com_whatsapp_a_2, Context context) {
        this.a = com_whatsapp_a_2;
        super(context);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = DialogToastActivity.f;
        int i5 = i4 - i2;
        float k = ((float) (i3 - i)) / ((float) aol.k(this.a.b));
        int childCount = getChildCount();
        int i6 = 0;
        while (i6 < childCount) {
            float f = ((float) i6) * k;
            getChildAt(i6).layout((int) f, 0, (int) (f + k), i5);
            i6++;
            if (z2) {
                return;
            }
        }
    }

    protected void onMeasure(int i, int i2) {
        boolean z = DialogToastActivity.f;
        int size = MeasureSpec.getSize(i);
        int childCount = getChildCount();
        float k = (float) (size / aol.k(this.a.b));
        size = 0;
        while (size < childCount) {
            float f = ((float) size) * k;
            getChildAt(size).measure(MeasureSpec.makeMeasureSpec(((int) (f + k)) - ((int) f), 1073741824), MeasureSpec.makeMeasureSpec(0, 0));
            size++;
            if (z) {
                break;
            }
        }
        setMeasuredDimension(MeasureSpec.getSize(i), aol.g(this.a.b));
    }
}
