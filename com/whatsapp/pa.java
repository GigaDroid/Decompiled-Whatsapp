package com.whatsapp;

import android.app.Activity;

class pa extends pz {
    final VideoPreviewActivity k;

    public void dismiss() {
        super.dismiss();
        VideoPreviewActivity.b(this.k).setImageResource(2130839605);
    }

    pa(VideoPreviewActivity videoPreviewActivity, Activity activity) {
        this.k = videoPreviewActivity;
        super(activity);
    }
}
