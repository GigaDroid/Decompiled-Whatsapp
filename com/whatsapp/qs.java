package com.whatsapp;

import android.media.audiofx.Visualizer;
import android.media.audiofx.Visualizer.OnDataCaptureListener;

class qs implements OnDataCaptureListener {
    final i8 a;

    public void onFftDataCapture(Visualizer visualizer, byte[] bArr, int i) {
    }

    qs(i8 i8Var) {
        this.a = i8Var;
    }

    public void onWaveFormDataCapture(Visualizer visualizer, byte[] bArr, int i) {
        if (i8.e(this.a) != null) {
            i8.e(this.a).a(bArr);
        }
    }
}
