package com.whatsapp.camera;

import android.view.View;
import android.widget.SeekBar;
import com.whatsapp.VideoView;

class i implements Runnable {
    final SeekBar a;
    final VideoView b;
    final View c;
    final CameraActivity d;

    i(CameraActivity cameraActivity, VideoView videoView, SeekBar seekBar, View view) {
        this.d = cameraActivity;
        this.b = videoView;
        this.a = seekBar;
        this.c = view;
    }

    public void run() {
        if (this.b.isPlaying()) {
            this.a.setProgress(this.b.getCurrentPosition());
            this.b.postDelayed(this, 50);
            if (CameraActivity.I == 0) {
                return;
            }
        }
        CameraActivity.a(this.d, true, this.c);
    }
}
