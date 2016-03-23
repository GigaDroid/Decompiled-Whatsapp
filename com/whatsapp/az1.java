package com.whatsapp;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;

class az1 implements OnPreparedListener {
    final VideoView a;

    public void onPrepared(MediaPlayer mediaPlayer) {
        VideoView.c(this.a, 2);
        VideoView.c(this.a, VideoView.a(this.a, VideoView.d(this.a, true)));
        if (VideoView.h(this.a) != null) {
            VideoView.h(this.a).onPrepared(VideoView.c(this.a));
        }
        VideoView.g(this.a, mediaPlayer.getVideoWidth());
        VideoView.d(this.a, mediaPlayer.getVideoHeight());
        int i = VideoView.i(this.a);
        if (i != 0) {
            this.a.seekTo(i);
        }
        if (VideoView.d(this.a) != 0 && VideoView.a(this.a) != 0) {
            this.a.getHolder().setFixedSize(VideoView.d(this.a), VideoView.a(this.a));
            if (VideoView.j(this.a) == VideoView.d(this.a) && VideoView.b(this.a) == VideoView.a(this.a)) {
                if (VideoView.g(this.a) == 3) {
                    this.a.start();
                    if (!DialogToastActivity.f) {
                        return;
                    }
                }
                if (!this.a.isPlaying() && i == 0 && this.a.getCurrentPosition() <= 0) {
                }
            }
        } else if (VideoView.g(this.a) == 3) {
            this.a.start();
        }
    }

    az1(VideoView videoView) {
        this.a = videoView;
    }
}
