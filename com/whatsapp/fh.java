package com.whatsapp;

import android.view.KeyEvent;

class fh implements a23 {
    final VideoPreviewActivity a;

    public void a(int i) {
        int selectionStart = VideoPreviewActivity.m(this.a).getSelectionStart();
        int selectionEnd = VideoPreviewActivity.m(this.a).getSelectionEnd();
        if (selectionStart <= selectionEnd) {
            int i2 = selectionEnd;
            selectionEnd = selectionStart;
            selectionStart = i2;
        }
        CharSequence stringBuilder = new StringBuilder(VideoPreviewActivity.m(this.a).getText().toString());
        stringBuilder.replace(selectionEnd, selectionStart, a28.b(i));
        if (a28.c(stringBuilder) <= 1024) {
            VideoPreviewActivity.m(this.a).setText(stringBuilder);
            VideoPreviewActivity.m(this.a).setSelection(selectionEnd + a28.d(i));
            VideoPreviewActivity.f(this.a).dismiss();
        }
    }

    public void a() {
        VideoPreviewActivity.m(this.a).dispatchKeyEvent(new KeyEvent(0, 67));
    }

    fh(VideoPreviewActivity videoPreviewActivity) {
        this.a = videoPreviewActivity;
    }
}
