package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class avy implements OnClickListener {
    final VideoPreviewActivity a;

    avy(VideoPreviewActivity videoPreviewActivity) {
        this.a = videoPreviewActivity;
    }

    public void onClick(View view) {
        this.a.setResult(2);
        this.a.finish();
    }
}
