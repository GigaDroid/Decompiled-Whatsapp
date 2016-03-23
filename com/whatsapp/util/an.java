package com.whatsapp.util;

import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;

final class an extends at {
    private final OpusPlayer a;

    public void g() {
        this.a.prepare();
    }

    public int a() {
        try {
            return (int) this.a.getCurrentPosition();
        } catch (Throwable e) {
            Log.a(e);
            return 0;
        }
    }

    public boolean f() {
        try {
            return this.a.isPlaying();
        } catch (Throwable e) {
            Log.a(e);
            return false;
        }
    }

    public void a(OnPreparedListener onPreparedListener) {
    }

    public void a(OnErrorListener onErrorListener) {
    }

    public int d() {
        try {
            return (int) this.a.getLength();
        } catch (Throwable e) {
            Log.a(e);
            return 0;
        }
    }

    public void h() {
        this.a.close();
    }

    public void e() {
        try {
            this.a.stop();
        } catch (Throwable e) {
            Log.a(e);
        }
    }

    public void b() {
    }

    public an(String str, int i) {
        this.a = new OpusPlayer(str, i);
    }

    public void c() {
        this.a.start();
    }

    public void i() {
        try {
            this.a.pause();
        } catch (Throwable e) {
            Log.a(e);
        }
    }

    public void a(int i) {
        this.a.seek((long) i);
    }
}
