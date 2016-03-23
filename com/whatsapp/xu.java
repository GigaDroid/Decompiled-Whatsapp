package com.whatsapp;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

class xu implements OnSeekBarChangeListener {
    final VideoPreviewActivity a;

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        if (!VideoPreviewActivity.i(this.a).isPlaying()) {
            VideoPreviewActivity.c(this.a).a((long) seekBar.getProgress());
        }
        VideoPreviewActivity.i(this.a).seekTo(seekBar.getProgress());
        VideoPreviewActivity.c(this.a, false);
    }

    xu(VideoPreviewActivity videoPreviewActivity) {
        this.a = videoPreviewActivity;
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            VideoPreviewActivity.i(this.a).seekTo(i);
        }
    }
}
