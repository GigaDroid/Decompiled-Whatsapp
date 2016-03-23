package com.whatsapp;

import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;

class bj implements OnPreDrawListener {
    final View a;
    final a9z b;

    bj(a9z com_whatsapp_a9z, View view) {
        this.b = com_whatsapp_a9z;
        this.a = view;
    }

    public boolean onPreDraw() {
        boolean z = DialogToastActivity.f;
        int width = this.a.getWidth();
        if (width > 0) {
            this.a.getViewTreeObserver().removeOnPreDrawListener(this);
            int compoundPaddingLeft = width - (a9z.d(this.b).getCompoundPaddingLeft() + a9z.d(this.b).getCompoundPaddingRight());
            String charSequence = a9z.d(this.b).getText().toString();
            float textSize = a9z.d(this.b).getTextSize();
            while (textSize > 1.0f && (a9z.d(this.b).getPaint().measureText(charSequence) >= ((float) compoundPaddingLeft) || z)) {
                textSize -= 1.0f;
                a9z.d(this.b).setTextSize(textSize);
                if (z) {
                    break;
                }
            }
        }
        return true;
    }
}
