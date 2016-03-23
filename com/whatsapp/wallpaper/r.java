package com.whatsapp.wallpaper;

import android.view.View;
import android.view.View.OnClickListener;

class r implements OnClickListener {
    final CropImage a;

    r(CropImage cropImage) {
        this.a = cropImage;
    }

    public void onClick(View view) {
        this.a.setResult(0);
        this.a.finish();
    }
}
