package com.whatsapp;

import android.content.Intent;
import org.v;
import org.whispersystems.at;

class v6 implements Runnable {
    private static final String[] z;
    final String a;
    final String b;
    final int c;
    final VoiceService d;

    static {
        String[] strArr = new String[3];
        String str = "\u001b\r[";
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
                        i3 = 113;
                        break;
                    case at.g /*1*/:
                        i3 = 100;
                        break;
                    case at.i /*2*/:
                        i3 = 63;
                        break;
                    case at.o /*3*/:
                        i3 = 9;
                        break;
                    default:
                        i3 = 45;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "\u001c\u0001LzL\u0016\u0001";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0003\u0001^zB\u001f";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void run() {
        Intent intent = new Intent(App.z(), VoipNotAllowedActivity.class);
        intent.putExtra(z[0], this.b);
        intent.putExtra(z[1], this.c);
        if (this.a != null) {
            intent.putExtra(z[2], this.a);
        }
        intent.setFlags(268435456);
        this.d.startActivity(intent);
    }

    v6(VoiceService voiceService, String str, int i, String str2) {
        this.d = voiceService;
        this.b = str;
        this.c = i;
        this.a = str2;
    }
}
