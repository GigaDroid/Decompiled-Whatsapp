package com.whatsapp.notification;

import android.text.format.DateUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.whatsapp.ey;
import com.whatsapp.i8;

class r implements ey {
    final PopupNotification a;
    final ImageButton b;
    int c;
    final i8 d;
    final TextView e;
    final ProgressBar f;

    r(PopupNotification popupNotification, ImageButton imageButton, ProgressBar progressBar, i8 i8Var, TextView textView) {
        this.a = popupNotification;
        this.b = imageButton;
        this.f = progressBar;
        this.d = i8Var;
        this.e = textView;
        this.c = -1;
    }

    public void b() {
        this.b.setImageResource(2130839590);
    }

    public void a(int i) {
        int min = Math.min(i, this.f.getMax());
        if (this.c != min / 1000) {
            this.c = min / 1000;
            this.e.setText(DateUtils.formatElapsedTime((long) this.c));
        }
        if (this.f.getProgress() < min) {
            this.f.setProgress(min);
        }
    }

    public void a() {
        this.b.setImageResource(2130839590);
        this.f.setProgress(0);
        this.e.setText(DateUtils.formatElapsedTime((long) (this.d.x() / 1000)));
        this.a.findViewById(2131755486).setVisibility(4);
    }

    public void d() {
        this.b.setImageResource(2130839587);
        this.f.setMax(this.d.x());
        this.c = -1;
    }

    public void a(boolean z) {
        if (!this.d.j()) {
            int i;
            View findViewById = this.a.findViewById(2131755486);
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            findViewById.setVisibility(i);
        }
    }

    public void c() {
        this.b.setImageResource(2130839587);
    }
}
