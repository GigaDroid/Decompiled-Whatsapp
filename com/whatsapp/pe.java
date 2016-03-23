package com.whatsapp;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;

class pe implements OnCompletionListener {
    final VideoView a;

    public void onCompletion(MediaPlayer mediaPlayer) {
        VideoView.c(this.a, 5);
        VideoView.e(this.a, 5);
        if (VideoView.e(this.a) != null) {
            VideoView.e(this.a).onCompletion(VideoView.c(this.a));
        }
    }

    pe(VideoView videoView) {
        this.a = videoView;
    }
}
