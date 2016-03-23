package com.whatsapp.util;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;

final class a5 extends at {
    private final MediaPlayer a;

    public boolean f() {
        return this.a.isPlaying();
    }

    public a5(String str, int i) {
        this.a = new MediaPlayer();
        this.a.setDataSource(str);
        this.a.setAudioStreamType(i);
    }

    public void a(OnErrorListener onErrorListener) {
        this.a.setOnErrorListener(onErrorListener);
    }

    public void b() {
        this.a.reset();
    }

    public void c() {
        this.a.start();
    }

    public int a() {
        return this.a.getCurrentPosition();
    }

    public void e() {
        this.a.stop();
    }

    public void a(int i) {
        this.a.seekTo(i);
    }

    public void i() {
        this.a.pause();
    }

    public int d() {
        return this.a.getDuration();
    }

    public void a(OnPreparedListener onPreparedListener) {
        this.a.setOnPreparedListener(onPreparedListener);
    }

    public void h() {
        this.a.release();
    }

    public void g() {
        this.a.prepare();
    }
}
