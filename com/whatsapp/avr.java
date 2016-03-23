package com.whatsapp;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;

class avr implements OnPreparedListener {
    final VideoPreviewActivity a;

    public void onPrepared(MediaPlayer mediaPlayer) {
        this.a.findViewById(2131755950).setVisibility(8);
    }

    avr(VideoPreviewActivity videoPreviewActivity) {
        this.a = videoPreviewActivity;
    }
}
