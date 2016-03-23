package com.whatsapp;

import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;

class b3 implements Callback {
    final VideoView a;

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        Object obj = 1;
        VideoView.a(this.a, i2);
        VideoView.b(this.a, i3);
        Object obj2;
        if (VideoView.g(this.a) == 3) {
            obj2 = 1;
        } else {
            obj2 = null;
        }
        if (!(VideoView.d(this.a) == i2 && VideoView.a(this.a) == i3)) {
            obj = null;
        }
        if (VideoView.c(this.a) != null && r0 != null && r1 != null) {
            if (VideoView.i(this.a) != 0) {
                this.a.seekTo(VideoView.i(this.a));
            }
            this.a.start();
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        VideoView.a(this.a, null);
        VideoView.b(this.a, true);
    }

    b3(VideoView videoView) {
        this.a = videoView;
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        VideoView.a(this.a, surfaceHolder);
        VideoView.f(this.a);
    }
}
