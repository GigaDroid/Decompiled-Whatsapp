package com.whatsapp;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.at;

class a_1 implements OnErrorListener {
    private static final String[] z;
    final RecordAudio a;

    static {
        String[] strArr = new String[2];
        String str = "J7}\u000f\u0017\u0018v\"";
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
                        i3 = arj.Theme_ratingBarStyle;
                        break;
                    case at.g /*1*/:
                        i3 = 23;
                        break;
                    case at.i /*2*/:
                        i3 = 24;
                        break;
                    case at.o /*3*/:
                        i3 = 119;
                        break;
                    default:
                        i3 = 99;
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
                    str = "\u0018r{\u0018\u0011\u000evm\u0013\n\u00058}\u0005\u0011\u0005e8\u0000\u000b\u000bc\"";
                    obj = null;
            }
        }
    }

    a_1(RecordAudio recordAudio) {
        this.a = recordAudio;
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Log.e(z[1] + i + z[0] + i2);
        return false;
    }
}
