package com.whatsapp;

import android.text.format.DateUtils;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

class a_n implements OnSeekBarChangeListener {
    final RecordAudio a;

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            try {
                RecordAudio.l(this.a).setText(DateUtils.formatElapsedTime((long) (i / 1000)));
            } catch (IllegalStateException e) {
                throw e;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onStopTrackingTouch(android.widget.SeekBar r3) {
        /*
        r2 = this;
        r0 = r2.a;	 Catch:{ IllegalStateException -> 0x003e }
        r0 = com.whatsapp.RecordAudio.f(r0);	 Catch:{ IllegalStateException -> 0x003e }
        if (r0 == 0) goto L_0x004d;
    L_0x0008:
        r0 = r2.a;	 Catch:{ IllegalStateException -> 0x003e }
        r0 = com.whatsapp.RecordAudio.a(r0);	 Catch:{ IllegalStateException -> 0x003e }
        r1 = 3;
        if (r0 != r1) goto L_0x003d;
    L_0x0011:
        r0 = r2.a;	 Catch:{ IllegalStateException -> 0x0040, IOException -> 0x0054 }
        r0 = com.whatsapp.RecordAudio.f(r0);	 Catch:{ IllegalStateException -> 0x0040, IOException -> 0x0054 }
        r1 = r3.getProgress();	 Catch:{ IllegalStateException -> 0x0040, IOException -> 0x0054 }
        r0.a(r1);	 Catch:{ IllegalStateException -> 0x0040, IOException -> 0x0054 }
        r0 = r2.a;	 Catch:{ IllegalStateException -> 0x0040, IOException -> 0x0054 }
        r0 = com.whatsapp.RecordAudio.f(r0);	 Catch:{ IllegalStateException -> 0x0040, IOException -> 0x0054 }
        r0.c();	 Catch:{ IllegalStateException -> 0x0040, IOException -> 0x0054 }
        r0 = r2.a;	 Catch:{ IllegalStateException -> 0x0040, IOException -> 0x0054 }
        r0 = com.whatsapp.RecordAudio.c(r0);	 Catch:{ IllegalStateException -> 0x0040, IOException -> 0x0054 }
        r1 = 0;
        r0.sendEmptyMessage(r1);	 Catch:{ IllegalStateException -> 0x0040, IOException -> 0x0054 }
        r0 = r2.a;	 Catch:{ IllegalStateException -> 0x0040, IOException -> 0x0054 }
        r0 = com.whatsapp.RecordAudio.m(r0);	 Catch:{ IllegalStateException -> 0x0040, IOException -> 0x0054 }
        r1 = 2130839675; // 0x7f02087b float:1.7284367E38 double:1.05277468E-314;
        r0.setImageResource(r1);	 Catch:{ IllegalStateException -> 0x0040, IOException -> 0x0054 }
    L_0x003d:
        return;
    L_0x003e:
        r0 = move-exception;
        throw r0;
    L_0x0040:
        r0 = move-exception;
    L_0x0041:
        r0 = r2.a;	 Catch:{ IllegalStateException -> 0x0052 }
        r1 = 2131231156; // 0x7f0801b4 float:1.8078385E38 double:1.0529680975E-314;
        r0.a(r1);	 Catch:{ IllegalStateException -> 0x0052 }
        r0 = com.whatsapp.DialogToastActivity.f;	 Catch:{ IllegalStateException -> 0x0052 }
        if (r0 == 0) goto L_0x003d;
    L_0x004d:
        r0 = 0;
        r3.setProgress(r0);	 Catch:{ IllegalStateException -> 0x0052 }
        goto L_0x003d;
    L_0x0052:
        r0 = move-exception;
        throw r0;
    L_0x0054:
        r0 = move-exception;
        goto L_0x0041;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a_n.onStopTrackingTouch(android.widget.SeekBar):void");
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        try {
            if (RecordAudio.f(this.a) != null) {
                if (RecordAudio.f(this.a).f()) {
                    RecordAudio.f(this.a).i();
                }
            }
            RecordAudio.c(this.a).removeMessages(0);
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    a_n(RecordAudio recordAudio) {
        this.a = recordAudio;
    }
}
