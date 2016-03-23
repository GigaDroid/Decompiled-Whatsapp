package com.whatsapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;

class EmojiPicker$EmojiImageView extends View {
    private int a;
    private Drawable b;
    private int[] c;
    private boolean d;
    private Path e;
    final aol f;

    public EmojiPicker$EmojiImageView(aol com_whatsapp_aol, Context context) {
        this.f = com_whatsapp_aol;
        super(context);
        this.a = -1;
    }

    public void setEmoji(int[] iArr) {
        if (iArr == null) {
            this.c = null;
            this.a = -1;
            this.b = null;
            this.d = false;
            if (!DialogToastActivity.f) {
                return;
            }
        }
        int a = aol.a(iArr);
        if (this.a != a) {
            this.c = iArr;
            this.a = a;
            this.d = aqj.a(iArr);
            this.b = null;
            if (a != 0) {
                this.b = aol.c(a);
                if (this.b == null) {
                    Message.obtain(aol.d(), 0, a, 0, this).sendToTarget();
                }
            }
        }
    }

    static int[] a(EmojiPicker$EmojiImageView emojiPicker$EmojiImageView) {
        return emojiPicker$EmojiImageView.c;
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.d) {
            if (this.e == null) {
                this.e = new Path();
            }
            aol.f(this.f).setColor(285212672);
            this.e.reset();
            this.e.moveTo((float) ((getWidth() * 9) / 10), (float) ((getHeight() * 9) / 10));
            this.e.lineTo((float) ((getWidth() * 9) / 10), (float) ((getHeight() * 3) / 4));
            this.e.lineTo((float) ((getWidth() * 3) / 4), (float) ((getHeight() * 9) / 10));
            this.e.lineTo((float) ((getWidth() * 9) / 10), (float) ((getHeight() * 9) / 10));
            this.e.setFillType(FillType.WINDING);
            canvas.drawPath(this.e, aol.f(this.f));
        }
        if (this.b != null) {
            int c = aol.c(this.f);
            int c2 = aol.c(this.f);
            int width = (getWidth() - c) / 2;
            int height = (getHeight() - c2) / 2;
            this.b.setBounds(width, height, c + width, c2 + height);
            this.b.draw(canvas);
        }
    }

    public void setDrawable(int i, Drawable drawable) {
        if (this.a == i) {
            this.b = drawable;
            invalidate();
        }
    }
}
