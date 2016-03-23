package com.whatsapp.wallpaper;

import android.view.View;
import android.view.View.OnClickListener;

class n implements OnClickListener {
    final CropImage a;

    n(CropImage cropImage) {
        this.a = cropImage;
    }

    public void onClick(View view) {
        CropImage.a(this.a);
        this.a.finish();
    }
}
