package com.whatsapp;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

class aeu implements OnGlobalLayoutListener {
    final VideoPreviewActivity a;

    public void onGlobalLayout() {
        int i = 0;
        if (VideoPreviewActivity.j(this.a) != null) {
            Rect rect = new Rect();
            VideoPreviewActivity.j(this.a).getWindowVisibleDisplayFrame(rect);
            int i2 = ((float) (VideoPreviewActivity.j(this.a).getRootView().getHeight() - (rect.bottom - rect.top))) > a4d.a().g * 128.0f ? 1 : 0;
            View findViewById = this.a.findViewById(2131755754);
            if (i2 == 0) {
                i = 8;
            }
            findViewById.setVisibility(i);
            if (i2 == 0) {
                VideoPreviewActivity.f(this.a).dismiss();
            }
        }
    }

    aeu(VideoPreviewActivity videoPreviewActivity) {
        this.a = videoPreviewActivity;
    }
}
