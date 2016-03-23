package com.whatsapp;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.whatsapp.protocol.co;

class aew implements OnSeekBarChangeListener {
    final ConversationRowAudio a;
    boolean b;
    final co c;

    public void onStartTrackingTouch(SeekBar seekBar) {
        this.b = false;
        if (i8.a(this.c) && i8.r()) {
            i8.p.e();
            this.b = true;
        }
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        if (i8.a(this.c) && !i8.r() && this.b) {
            this.b = false;
            i8.p.a(ConversationRowAudio.c(this.a).b());
            i8.p.h();
        }
        ConversationRowAudio.b().put(this.c.k, Integer.valueOf(ConversationRowAudio.c(this.a).b()));
    }

    aew(ConversationRowAudio conversationRowAudio, co coVar) {
        this.a = conversationRowAudio;
        this.c = coVar;
    }
}
