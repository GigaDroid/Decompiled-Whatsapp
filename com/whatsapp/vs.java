package com.whatsapp;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class vs implements OnErrorListener {
    private static final String[] z;
    final MediaView a;

    static {
        String[] strArr = new String[2];
        String str = "u\u001c\u0006\u00192']Y";
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
                        i3 = 85;
                        break;
                    case at.g /*1*/:
                        i3 = 60;
                        break;
                    case at.i /*2*/:
                        i3 = 99;
                        break;
                    case at.o /*3*/:
                        i3 = 97;
                        break;
                    default:
                        i3 = 70;
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
                    str = "8Y\u0007\b'#U\u0006\u0016i0N\u0011\u000e4o\u001c\u0014\t'!\u0006";
                    obj = null;
            }
        }
    }

    vs(MediaView mediaView) {
        this.a = mediaView;
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Log.e(z[1] + i + z[0] + i2);
        return false;
    }
}
