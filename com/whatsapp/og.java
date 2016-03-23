package com.whatsapp;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnVideoSizeChangedListener;

class og implements OnVideoSizeChangedListener {
    final VideoView a;

    og(VideoView videoView) {
        this.a = videoView;
    }

    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        VideoView.g(this.a, mediaPlayer.getVideoWidth());
        VideoView.d(this.a, mediaPlayer.getVideoHeight());
        if (VideoView.d(this.a) != 0 && VideoView.a(this.a) != 0) {
            this.a.getHolder().setFixedSize(VideoView.d(this.a), VideoView.a(this.a));
            this.a.requestLayout();
        }
    }
}
