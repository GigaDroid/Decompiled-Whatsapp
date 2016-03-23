package com.whatsapp;

import android.support.v4.content.ContextCompat;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.PopupWindow;

class l_ extends PopupWindow {
    final EmojiPicker$EmojiImageView a;
    int[] b;
    final aol c;
    View d;

    public void a(View view, MotionEvent motionEvent) {
        boolean z = DialogToastActivity.f;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        ViewGroup viewGroup = (ViewGroup) getContentView();
        view.getLocationOnScreen(this.b);
        int i = this.b[0] + x;
        int i2 = y + this.b[1];
        boolean childCount = viewGroup.getChildCount();
        View view2 = this.d;
        this.d = null;
        boolean z2 = false;
        boolean z3 = false;
        while (z2 < childCount) {
            View childAt = viewGroup.getChildAt(z2);
            childAt.getLocationOnScreen(this.b);
            if (i > this.b[0] && i < this.b[0] + childAt.getWidth() && i2 > this.b[1] && i2 < this.b[1] + childAt.getHeight()) {
                childAt.setPressed(true);
                this.d = childAt;
                if (!z) {
                    boolean z4 = z2;
                    break;
                }
                z3 = z2;
            }
            z2++;
            if (z) {
                break;
            }
        }
        int i3 = z3;
        if (!(view2 == null || view2 == this.d)) {
            view2.setPressed(false);
        }
        if (motionEvent.getAction() == 1 && this.d != null) {
            a(i3);
        }
    }

    public l_(aol com_whatsapp_aol, EmojiPicker$EmojiImageView emojiPicker$EmojiImageView) {
        boolean z = DialogToastActivity.f;
        this.c = com_whatsapp_aol;
        super(new LinearLayout(emojiPicker$EmojiImageView.getContext()), -2, -2);
        this.b = new int[2];
        this.a = emojiPicker$EmojiImageView;
        LinearLayout linearLayout = (LinearLayout) getContentView();
        linearLayout.setOrientation(0);
        linearLayout.setFocusableInTouchMode(true);
        linearLayout.setFocusable(true);
        int dimensionPixelSize = emojiPicker$EmojiImageView.getContext().getResources().getDimensionPixelSize(2131427483);
        int dimensionPixelSize2 = (dimensionPixelSize - emojiPicker$EmojiImageView.getContext().getResources().getDimensionPixelSize(2131427482)) / 2;
        int i = 0;
        while (i <= 5) {
            View imageView = new ImageView(emojiPicker$EmojiImageView.getContext());
            imageView.setLayoutParams(new LayoutParams(dimensionPixelSize, dimensionPixelSize));
            imageView.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
            int[] iArr = new int[2];
            iArr[0] = EmojiPicker$EmojiImageView.a(emojiPicker$EmojiImageView)[0];
            iArr[1] = i == 0 ? 0 : (127995 + i) - 1;
            imageView.setImageDrawable(_3.a(emojiPicker$EmojiImageView.getContext(), er.a(new a_9(iArr))));
            imageView.setTag(Integer.valueOf(i));
            imageView.setOnClickListener(new a31(this, com_whatsapp_aol));
            imageView.setBackgroundResource(2130839767);
            linearLayout.addView(imageView);
            int i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        linearLayout.measure(MeasureSpec.makeMeasureSpec(0, 0), MeasureSpec.makeMeasureSpec(0, 0));
        setTouchable(true);
        setFocusable(true);
        setOutsideTouchable(true);
        setInputMethodMode(2);
        setBackgroundDrawable(ContextCompat.getDrawable(emojiPicker$EmojiImageView.getContext(), 2130839689));
        linearLayout.requestFocus();
        emojiPicker$EmojiImageView.getParent().requestDisallowInterceptTouchEvent(true);
    }

    private void a(int i) {
        int i2;
        if (i == 0) {
            i2 = 0;
        } else {
            i2 = (127995 + i) - 1;
        }
        int[] iArr = i == 0 ? new int[]{EmojiPicker$EmojiImageView.a(this.a)[0]} : new int[]{EmojiPicker$EmojiImageView.a(this.a)[0], i2};
        aol.a(this.c, iArr);
        this.a.setEmoji(iArr);
        aol.l().edit().putInt(Integer.toString(EmojiPicker$EmojiImageView.a(this.a)[0]), i2).commit();
        this.a.invalidate();
        dismiss();
    }

    static void a(l_ l_Var, int i) {
        l_Var.a(i);
    }
}
