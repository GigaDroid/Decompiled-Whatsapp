package com.whatsapp.util;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatCheckBox;
import android.util.AttributeSet;
import com.whatsapp.App;

public class RtlCheckBox extends AppCompatCheckBox {
    private int a;
    private Drawable b;
    private int c;

    public void setButtonDrawable(Drawable drawable) {
        if (App.a1()) {
            super.setButtonDrawable(drawable);
            if (Log.h == 0) {
                return;
            }
        }
        this.b = drawable;
        super.setButtonDrawable(new a7(this, this.b, 0));
    }

    public int getCompoundPaddingRight() {
        if (App.a1()) {
            return super.getCompoundPaddingRight();
        }
        int paddingRight = super.getPaddingRight();
        Drawable drawable = this.b;
        if (drawable != null) {
            return paddingRight + Math.max(this.a, drawable.getIntrinsicWidth());
        }
        return paddingRight;
    }

    public RtlCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    private void a() {
        if (!App.a1()) {
            setBackgroundDrawable(null);
            this.a = getPaddingLeft();
            this.c = getPaddingRight();
            int min = Math.min(this.a, this.c);
            setPadding(min, getPaddingTop(), min, getPaddingBottom());
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onDraw(android.graphics.Canvas r6) {
        /*
        r5 = this;
        super.onDraw(r6);
        r0 = com.whatsapp.App.a1();
        if (r0 != 0) goto L_0x0030;
    L_0x0009:
        r1 = r5.b;
        if (r1 == 0) goto L_0x0030;
    L_0x000d:
        r0 = r5.getGravity();
        r2 = r0 & 112;
        r3 = r1.getIntrinsicHeight();
        r4 = r1.getIntrinsicWidth();
        r0 = 0;
        switch(r2) {
            case 16: goto L_0x003a;
            case 80: goto L_0x0031;
            default: goto L_0x001f;
        };
    L_0x001f:
        r2 = r0 + r3;
        r3 = r5.getWidth();
        r3 = r3 - r4;
        r4 = r5.getWidth();
        r1.setBounds(r3, r0, r4, r2);
        r1.draw(r6);
    L_0x0030:
        return;
    L_0x0031:
        r0 = r5.getHeight();
        r0 = r0 - r3;
        r2 = com.whatsapp.util.Log.h;
        if (r2 == 0) goto L_0x001f;
    L_0x003a:
        r0 = r5.getHeight();
        r0 = r0 - r3;
        r0 = r0 / 2;
        goto L_0x001f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.RtlCheckBox.onDraw(android.graphics.Canvas):void");
    }

    public RtlCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    public int getCompoundPaddingLeft() {
        if (App.a1()) {
            return super.getCompoundPaddingLeft();
        }
        return super.getPaddingLeft();
    }

    public RtlCheckBox(Context context) {
        this(context, null);
    }
}
