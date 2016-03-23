package com.whatsapp;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class a58 implements OnErrorListener {
    private static final String z;
    final VideoView a;

    static {
        char[] toCharArray = "U\u001dD\u00152U\u001dE\u0007r\u00031R\u00022QN\u0000".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 35;
                    break;
                case at.g /*1*/:
                    i2 = 116;
                    break;
                case at.i /*2*/:
                    i2 = 32;
                    break;
                case at.o /*3*/:
                    i2 = 112;
                    break;
                default:
                    i2 = 93;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Log.w(z + i + "," + i2);
        VideoView.c(this.a, -1);
        VideoView.e(this.a, -1);
        return (VideoView.k(this.a) == null || VideoView.k(this.a).onError(VideoView.c(this.a), i, i2)) ? true : true;
    }

    a58(VideoView videoView) {
        this.a = videoView;
    }
}
