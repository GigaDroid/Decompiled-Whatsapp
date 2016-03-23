package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;

class b6 implements OnClickListener {
    final VideoPreviewActivity a;

    b6(VideoPreviewActivity videoPreviewActivity) {
        this.a = videoPreviewActivity;
    }

    public void onClick(View view) {
        if (VideoPreviewActivity.f(this.a).isShowing()) {
            VideoPreviewActivity.f(this.a).dismiss();
            if (!DialogToastActivity.f) {
                return;
            }
        }
        VideoPreviewActivity.f(this.a).a(VideoPreviewActivity.b(this.a), VideoPreviewActivity.b(this.a), VideoPreviewActivity.b(this.a), VideoPreviewActivity.m(this.a));
        VideoPreviewActivity.b(this.a).setImageResource(2130839607);
    }
}
