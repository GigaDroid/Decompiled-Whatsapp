package com.whatsapp.gallerypicker;

import android.view.View;
import android.view.View.OnClickListener;

class an implements OnClickListener {
    final ImagePreview a;

    public void onClick(View view) {
        this.a.setResult(2);
        this.a.finish();
    }

    an(ImagePreview imagePreview) {
        this.a = imagePreview;
    }
}
