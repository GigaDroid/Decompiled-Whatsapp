package com.facebook.rebound.ui;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

class b implements OnSeekBarChangeListener {
    private static final String[] z;
    final SpringConfiguratorView a;

    static {
        String[] strArr = new String[2];
        String str = "_Q";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = 25;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_seekBarStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 66;
                        break;
                    case at.o /*3*/:
                        i3 = 114;
                        break;
                    default:
                        i3 = 30;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "MQ";
                    obj = null;
            }
        }
    }

    b(SpringConfiguratorView springConfiguratorView, d dVar) {
        this(springConfiguratorView);
    }

    private b(SpringConfiguratorView springConfiguratorView) {
        this.a = springConfiguratorView;
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (seekBar == SpringConfiguratorView.c(this.a)) {
            float f = ((200.0f * ((float) i)) / 100000.0f) + 0.0f;
            SpringConfiguratorView.g(this.a).a = com.facebook.rebound.b.a((double) f);
            SpringConfiguratorView.b(this.a).setText(z[1] + SpringConfiguratorView.b().format((double) f));
        }
        if (seekBar == SpringConfiguratorView.j(this.a)) {
            f = ((((float) i) * 50.0f) / 100000.0f) + 0.0f;
            SpringConfiguratorView.g(this.a).c = com.facebook.rebound.b.c((double) f);
            SpringConfiguratorView.h(this.a).setText(z[0] + SpringConfiguratorView.b().format((double) f));
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
    }
}
