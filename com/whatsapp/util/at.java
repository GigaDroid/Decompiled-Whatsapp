package com.whatsapp.util;

import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import org.v;

public abstract class at {
    private static final String z;

    static {
        char[] toCharArray = "\u001bT}rP".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 53;
                    break;
                case org.whispersystems.at.g /*1*/:
                    i2 = 59;
                    break;
                case org.whispersystems.at.i /*2*/:
                    i2 = 13;
                    break;
                case org.whispersystems.at.o /*3*/:
                    i2 = 7;
                    break;
                default:
                    i2 = 35;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public abstract int a();

    public abstract void a(int i);

    public abstract void a(OnErrorListener onErrorListener);

    public abstract void a(OnPreparedListener onPreparedListener);

    public abstract void b();

    public abstract void c();

    public abstract int d();

    public abstract void e();

    public abstract boolean f();

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public static at a(String str, int i) {
        if (str.endsWith(z)) {
            return new an(str, i);
        }
        return new a5(str, i);
    }
}
