package com.whatsapp.camera;

import android.text.format.DateUtils;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.whatsapp.VideoView;

class o implements OnSeekBarChangeListener {
    final VideoView a;
    final TextView b;
    final CameraActivity c;

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            this.a.seekTo(i);
        }
        this.b.setText(DateUtils.formatElapsedTime((long) (i / 1000)));
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        this.a.seekTo(seekBar.getProgress());
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    o(CameraActivity cameraActivity, VideoView videoView, TextView textView) {
        this.c = cameraActivity;
        this.a = videoView;
        this.b = textView;
    }
}
