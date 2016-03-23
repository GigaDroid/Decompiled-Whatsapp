package com.whatsapp;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.Button;
import org.v;
import org.whispersystems.at;

public class MinimumWidthButton extends Button {
    static int b;
    private static final String z;
    private Context a;

    protected void onMeasure(int i, int i2) {
        float f;
        int i3 = 0;
        boolean z = DialogToastActivity.f;
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(getResources().getDimension(2131427455));
        textPaint.setTypeface(Typeface.DEFAULT_BOLD);
        float f2 = 0.0f;
        float[] fArr = new float[getText().length()];
        textPaint.getTextWidths(getText(), 0, getText().length(), fArr);
        while (i3 < fArr.length) {
            f2 += fArr[i3];
            i3++;
            if (z) {
                break;
            }
        }
        f2 += a4d.a().w;
        if (b > getSuggestedMinimumWidth()) {
            i3 = b;
        } else {
            i3 = getSuggestedMinimumWidth();
        }
        int resolveSize = resolveSize(getSuggestedMinimumHeight(), i2);
        if (((float) i3) > f2) {
            f = (float) i3;
        } else {
            f = f2;
        }
        setMeasuredDimension((int) f, resolveSize);
    }

    public MinimumWidthButton(Context context, AttributeSet attributeSet) {
        boolean z = DialogToastActivity.f;
        super(context, attributeSet);
        this.a = context;
        int i = 0;
        while (i < attributeSet.getAttributeCount()) {
            if (attributeSet.getAttributeName(i).equals(z)) {
                String attributeValue = attributeSet.getAttributeValue(i);
                b = (int) (((float) Integer.parseInt(attributeValue.substring(0, attributeValue.indexOf(".")))) * a4d.a().g);
                if (!z) {
                    return;
                }
            }
            i++;
            if (z) {
                return;
            }
        }
    }

    static {
        char[] toCharArray = "!\u0002.|j".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 86;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_seekBarStyle;
                    break;
                case at.i /*2*/:
                    i2 = 74;
                    break;
                case at.o /*3*/:
                    i2 = 8;
                    break;
                default:
                    i2 = 2;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
        b = 0;
    }
}
