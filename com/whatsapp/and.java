package com.whatsapp;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class and implements OnPreparedListener {
    private static final String z;
    final RecordAudio a;

    static {
        char[] toCharArray = "=?fBm+;pIv uuA~6?w]m**d_z+".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 79;
                    break;
                case at.g /*1*/:
                    i2 = 90;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 45;
                    break;
                default:
                    i2 = 31;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        Log.i(z);
    }

    and(RecordAudio recordAudio) {
        this.a = recordAudio;
    }
}
