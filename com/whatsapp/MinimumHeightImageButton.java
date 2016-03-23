package com.whatsapp;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import org.v;
import org.whispersystems.at;

public class MinimumHeightImageButton extends ImageButton {
    static int b;
    private static final String z;
    private Context a;

    protected void onMeasure(int i, int i2) {
        float intrinsicHeight = ((float) getDrawable().getIntrinsicHeight()) + a4d.a().p;
        int intrinsicWidth = (int) (((float) getDrawable().getIntrinsicWidth()) + a4d.a().p);
        if (intrinsicHeight < ((float) b)) {
            intrinsicHeight = (float) b;
        }
        setMeasuredDimension(intrinsicWidth, (int) intrinsicHeight);
    }

    public MinimumHeightImageButton(Context context, AttributeSet attributeSet) {
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
        char[] toCharArray = "OIm&\"S".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 39;
                    break;
                case at.g /*1*/:
                    i2 = 44;
                    break;
                case at.i /*2*/:
                    i2 = 4;
                    break;
                case at.o /*3*/:
                    i2 = 65;
                    break;
                default:
                    i2 = 74;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
        b = 0;
    }
}
