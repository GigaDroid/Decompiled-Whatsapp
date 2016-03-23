package com.whatsapp.gallerypicker;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout.LayoutParams;
import org.v;
import org.whispersystems.at;

class bn implements OnTouchListener {
    final ImagePreview a;
    final ThumbImageView b;

    bn(ThumbImageView thumbImageView, ImagePreview imagePreview) {
        this.b = thumbImageView;
        this.a = imagePreview;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case v.m /*0*/:
                ImagePreview.a(this.b.B, this.b);
                ImagePreview.a(this.b.B, ThumbImageView.a(this.b));
                ImagePreview.s(this.b.B).setImageDrawable(this.b.getDrawable());
                ImagePreview.s(this.b.B).setMaxWidth(this.b.getWidth());
                ImagePreview.s(this.b.B).setMaxHeight(this.b.getHeight());
                ImagePreview.s(this.b.B).setLayoutParams(new LayoutParams(this.b.getWidth(), this.b.getHeight()));
                ImagePreview.b(this.b.B, motionEvent.getY());
                ImagePreview.a(this.b.B, motionEvent.getX());
                ImagePreview.f(this.b.B).invalidate();
                if (ImagePreview.o(this.b.B) >= 0) {
                    View childAt = ImagePreview.h(this.b.B).getChildAt(ImagePreview.o(this.b.B));
                    if (childAt != ImagePreview.f(this.b.B)) {
                        childAt.setSelected(false);
                    }
                }
                ImagePreview.j(this.b.B).removeCallbacks(ImagePreview.t(this.b.B));
                ImagePreview.j(this.b.B).postDelayed(ImagePreview.t(this.b.B), 100);
                ImagePreview.l(this.b.B).setBackgroundColor(0);
                ImagePreview.x(this.b.B).setTextColor(0);
                ImagePreview.q(this.b.B).setAlpha(0);
                ImagePreview.p(this.b.B).setVisibility(0);
                ImagePreview.w(this.b.B).getLocationOnScreen(ImagePreview.a(this.b.B));
                int i = ImagePreview.a(this.b.B)[0];
                int i2 = ImagePreview.a(this.b.B)[1];
                ImagePreview.f(this.b.B).getLocationOnScreen(ImagePreview.a(this.b.B));
                ImagePreview.w(this.b.B).setPadding(ImagePreview.a(this.b.B)[0] - i, ImagePreview.a(this.b.B)[1] - i2, 0, 0);
                ImagePreview.l(this.b.B).setPadding(0, 0, 0, ImagePreview.p(this.b.B).getHeight() - ImagePreview.e(this.b.B).getHeight());
                ImagePreview.x(this.b.B).getLocationOnScreen(ImagePreview.a(this.b.B));
                break;
            case at.g /*1*/:
            case at.o /*3*/:
                ImagePreview.j(this.b.B).removeCallbacks(ImagePreview.t(this.b.B));
                break;
        }
        return false;
    }
}
