package com.whatsapp.util;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import java.lang.ref.WeakReference;
import org.v;
import org.whispersystems.at;

public class ah extends ImageSpan {
    private static final String z;
    private WeakReference a;

    static {
        char[] toCharArray = "1,".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 20;
                    break;
                case at.g /*1*/:
                    i2 = 95;
                    break;
                case at.i /*2*/:
                    i2 = 100;
                    break;
                case at.o /*3*/:
                    i2 = 95;
                    break;
                default:
                    i2 = 27;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public static CharSequence a(CharSequence charSequence, Drawable drawable, Paint paint, int i, int i2) {
        CharSequence spannableStringBuilder = new SpannableStringBuilder(charSequence);
        int textSize = (int) paint.getTextSize();
        drawable.setBounds(0, 0, (drawable.getIntrinsicWidth() * textSize) / drawable.getIntrinsicHeight(), textSize);
        spannableStringBuilder.setSpan(new ah(drawable), i, i2, 33);
        return spannableStringBuilder;
    }

    public static CharSequence a(CharSequence charSequence, Drawable drawable, Paint paint) {
        return a(charSequence, drawable, paint, z);
    }

    public ah(Drawable drawable) {
        super(drawable);
    }

    protected Drawable a() {
        WeakReference weakReference = this.a;
        Drawable drawable = null;
        if (weakReference != null) {
            drawable = (Drawable) weakReference.get();
        }
        if (drawable != null) {
            return drawable;
        }
        drawable = getDrawable();
        this.a = new WeakReference(drawable);
        return drawable;
    }

    public static CharSequence a(CharSequence charSequence, Drawable drawable, Paint paint, String str) {
        int indexOf = TextUtils.indexOf(charSequence, str);
        return a(charSequence, drawable, paint, indexOf, str.length() + indexOf);
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable a = a();
        canvas.save();
        Rect bounds = a.getBounds();
        FontMetrics fontMetrics = paint.getFontMetrics();
        canvas.translate(f, (((fontMetrics.descent + fontMetrics.ascent) - ((float) bounds.height())) / 2.0f) + ((float) i4));
        a.draw(canvas);
        canvas.restore();
    }
}
