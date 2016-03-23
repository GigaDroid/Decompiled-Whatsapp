package com.whatsapp;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.whatsapp.util.Log;
import java.io.IOException;

class ae0 implements OnSeekBarChangeListener {
    final MediaView a;

    public void onStopTrackingTouch(SeekBar seekBar) {
        boolean z = DialogToastActivity.f;
        try {
            if (MediaView.r(this.a) != null) {
                if (MediaView.p(this.a) == 4) {
                    try {
                        MediaView.r(this.a).a((int) (((float) MediaView.r(this.a).d()) * (((float) MediaView.h(this.a).b()) / ((float) MediaView.h(this.a).d()))));
                        MediaView.r(this.a).c();
                        MediaView.u(this.a).sendEmptyMessage(0);
                        MediaView.s(this.a).setImageResource(2130839675);
                        return;
                    } catch (Throwable e) {
                        try {
                            Log.a(e);
                            this.a.a(2131231156);
                            if (!z) {
                                return;
                            }
                        } catch (IOException e2) {
                            throw e2;
                        } catch (IOException e22) {
                            throw e22;
                        }
                    }
                }
                MediaView.f(this.a, (int) (((float) MediaView.r(this.a).d()) * (((float) MediaView.h(this.a).b()) / ((float) MediaView.h(this.a).d()))));
                if (!z) {
                    return;
                }
            }
            MediaView.h(this.a).setProgress(0);
        } catch (IOException e222) {
            throw e222;
        }
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
    }

    ae0(MediaView mediaView, ao_ com_whatsapp_ao_) {
        this(mediaView);
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        if (MediaView.r(this.a) != null && MediaView.r(this.a).f()) {
            MediaView.r(this.a).i();
        }
        MediaView.u(this.a).removeMessages(0);
    }

    private ae0(MediaView mediaView) {
        this.a = mediaView;
    }
}
