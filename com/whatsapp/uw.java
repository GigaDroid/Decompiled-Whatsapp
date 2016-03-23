package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class uw implements OnClickListener {
    private static final String z;
    final RecordAudio a;

    static {
        char[] toCharArray = "\u001f\frC\u0014\t\bdH\u000f\u0002FrM\b\u000e\f}".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = arj.Theme_switchStyle;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.i /*2*/:
                    i2 = 17;
                    break;
                case at.o /*3*/:
                    i2 = 44;
                    break;
                default:
                    i2 = arj.Theme_checkboxStyle;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    uw(RecordAudio recordAudio) {
        this.a = recordAudio;
    }

    public void onClick(View view) {
        Log.i(z);
        this.a.finish();
        if (!RecordAudio.g(this.a) && RecordAudio.n(this.a) != null && RecordAudio.n(this.a).exists()) {
            RecordAudio.n(this.a).delete();
        }
    }
}
