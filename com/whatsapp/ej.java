package com.whatsapp;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;

class ej implements OnBufferingUpdateListener {
    final VideoView a;

    ej(VideoView videoView) {
        this.a = videoView;
    }

    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        VideoView.f(this.a, i);
    }
}
