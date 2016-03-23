package com.whatsapp.gallerypicker;

import android.view.View;
import android.view.View.OnClickListener;

class b4 implements OnClickListener {
    final ImagePreview a;
    final ThumbImageView b;

    public void onClick(View view) {
        ImagePreview.e(this.b.B).setCurrentItem(ImagePreview.c(this.b.B).indexOf(ThumbImageView.a(this.b)));
    }

    b4(ThumbImageView thumbImageView, ImagePreview imagePreview) {
        this.b = thumbImageView;
        this.a = imagePreview;
    }
}
