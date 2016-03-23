package com.whatsapp.camera;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.VideoView;

class z implements OnClickListener {
    final Runnable a;
    final CameraActivity b;
    final VideoView c;
    final View d;

    z(CameraActivity cameraActivity, VideoView videoView, View view, Runnable runnable) {
        this.b = cameraActivity;
        this.c = videoView;
        this.d = view;
        this.a = runnable;
    }

    public void onClick(View view) {
        if (this.c.isPlaying()) {
            this.c.pause();
            CameraActivity.a(this.b, true, this.d);
            if (CameraActivity.I == 0) {
                return;
            }
        }
        if (view == this.d) {
            CameraActivity.a(this.b, false, this.d);
            this.c.setBackgroundDrawable(null);
            this.c.start();
            this.c.postDelayed(this.a, 0);
        }
    }
}
