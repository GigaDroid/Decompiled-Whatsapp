package com.whatsapp.camera;

import android.content.Context;
import android.support.v7.appcompat.R;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import org.v;
import org.whispersystems.at;

public class CameraLayout extends FrameLayout {
    private static final String z;
    private l a;
    private Display b;

    static {
        char[] toCharArray = "7u9|u7".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 64;
                    break;
                case at.g /*1*/:
                    i2 = 28;
                    break;
                case at.i /*2*/:
                    i2 = 87;
                    break;
                case at.o /*3*/:
                    i2 = 24;
                    break;
                default:
                    i2 = 26;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        a(this.b.getOrientation(), i, i2, i3, i4);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.disable();
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.enable();
    }

    static void a(CameraLayout cameraLayout, int i, int i2, int i3, int i4, int i5) {
        cameraLayout.a(i, i2, i3, i4, i5);
    }

    public CameraLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = ((WindowManager) getContext().getSystemService(z)).getDefaultDisplay();
        this.a = new l(this, context);
    }

    private void a(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7 = CameraActivity.I;
        View findViewById = findViewById(2131755390);
        View findViewById2 = findViewById(2131755392);
        View findViewById3 = findViewById(2131755391);
        int measuredWidth = findViewById.getMeasuredWidth();
        int measuredHeight = findViewById.getMeasuredHeight();
        int measuredWidth2 = findViewById2.getMeasuredWidth();
        int measuredHeight2 = findViewById2.getMeasuredHeight();
        int measuredWidth3 = findViewById3.getMeasuredWidth();
        int measuredHeight3 = findViewById3.getMeasuredHeight();
        if (i5 - i3 > i4 - i2) {
            findViewById.layout(((i2 + i4) - measuredWidth) / 2, i5 - measuredHeight, ((i2 + i4) + measuredWidth) / 2, i5);
            i6 = ((i4 - i2) - measuredWidth) / 4;
            findViewById3.layout((i4 - i6) - (measuredWidth3 / 2), (i5 - (measuredHeight / 2)) - (measuredHeight3 / 2), (i4 - i6) + (measuredWidth3 / 2), (i5 - (measuredHeight / 2)) + (measuredHeight3 / 2));
            findViewById2.layout((i2 + i6) - (measuredWidth2 / 2), (i5 - (measuredHeight / 2)) - (measuredHeight2 / 2), (i6 + i2) + (measuredWidth2 / 2), (i5 - (measuredHeight / 2)) + (measuredHeight2 / 2));
            if (i7 == 0) {
                return;
            }
        }
        i6 = findViewById(R.id.title).getMeasuredHeight() + i3;
        if (i == 0 || i == 1) {
            findViewById.layout(i4 - measuredWidth, ((i6 + i5) - measuredHeight) / 2, i4, ((i6 + i5) + measuredHeight) / 2);
            int i8 = ((i5 - i6) - measuredHeight) / 4;
            findViewById3.layout((i4 - (measuredWidth / 2)) - (measuredWidth3 / 2), (i6 + i8) - (measuredHeight3 / 2), (i4 - (measuredWidth / 2)) + (measuredWidth3 / 2), (i6 + i8) + (measuredHeight3 / 2));
            findViewById2.layout((i4 - (measuredWidth / 2)) - (measuredWidth2 / 2), (i5 - i8) - (measuredHeight2 / 2), (i4 - (measuredWidth / 2)) + (measuredWidth2 / 2), (i5 - i8) + (measuredHeight2 / 2));
            if (i7 == 0) {
                return;
            }
        }
        findViewById.layout(i2, ((i6 + i5) - measuredHeight) / 2, i2 + measuredWidth, ((i6 + i5) + measuredHeight) / 2);
        i7 = ((i5 - i6) - measuredHeight) / 4;
        findViewById3.layout(((measuredWidth / 2) + i2) - (measuredWidth3 / 2), (i6 + i7) - (measuredHeight3 / 2), (measuredWidth3 / 2) + ((measuredWidth / 2) + i2), (measuredHeight3 / 2) + (i6 + i7));
        findViewById2.layout(((measuredWidth / 2) + i2) - (measuredWidth2 / 2), (i5 - i7) - (measuredHeight2 / 2), ((measuredWidth / 2) + i2) + (measuredWidth2 / 2), (i5 - i7) + (measuredHeight2 / 2));
    }

    public CameraLayout(Context context) {
        this(context, null);
    }

    static Display a(CameraLayout cameraLayout) {
        return cameraLayout.b;
    }

    public CameraLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
