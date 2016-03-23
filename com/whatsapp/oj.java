package com.whatsapp;

import android.media.AudioManager.OnAudioFocusChangeListener;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

final class oj implements OnAudioFocusChangeListener {
    private static final String z;

    static {
        char[] toCharArray = "\u0014\u000b9b3\u0003\u00114{|B\u0002?qf\u0011D3zr\f\u00035v)B".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 98;
                    break;
                case at.g /*1*/:
                    i2 = 100;
                    break;
                case at.i /*2*/:
                    i2 = 80;
                    break;
                case at.o /*3*/:
                    i2 = 18;
                    break;
                default:
                    i2 = 19;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    oj() {
    }

    public void onAudioFocusChange(int i) {
        Log.i(z + i);
    }
}
