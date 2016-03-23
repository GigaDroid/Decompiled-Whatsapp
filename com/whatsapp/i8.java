package com.whatsapp;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.media.MediaPlayer;
import android.media.audiofx.Visualizer;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import com.whatsapp.util.at;
import java.io.IOException;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;

public class i8 {
    private static final String[] B;
    private static AudioManager a;
    private static byte[] f;
    private static String[] n;
    public static i8 p;
    private Handler A;
    private SensorManager b;
    private MediaPlayer c;
    private Activity d;
    private akb e;
    private SensorEventListener g;
    private at h;
    private co i;
    private boolean j;
    @NonNull
    private final BroadcastReceiver k;
    @Nullable
    private final WakeLock l;
    private int m;
    private int o;
    private Sensor q;
    private int r;
    private ey s;
    private boolean t;
    private long u;
    private boolean v;
    private float w;
    private Visualizer x;
    private OnAudioFocusChangeListener y;
    private boolean z;

    private void b(int i) {
        int i2 = 0;
        boolean z = DialogToastActivity.f;
        try {
            this.r = i;
            if (this.s != null) {
                this.s.a(i);
            }
            try {
                if (this.e == null) {
                    return;
                }
                if (this.x == null) {
                    this.o++;
                    if (f == null) {
                        f = new byte[128];
                        int i3 = 0;
                        while (i3 < f.length) {
                            f[i3] = (byte) ((int) ((((Math.sin(((((double) i3) * 3.141592653589793d) * 32.0d) / ((double) f.length)) * Math.abs(Math.sin(((((double) i3) * 3.141592653589793d) * 4.0d) / ((double) f.length)))) * Math.abs(Math.sin(((((double) i3) * 3.141592653589793d) * 1.0d) / ((double) f.length)))) * 64.0d) + 128.0d));
                            i3++;
                            if (z) {
                                break;
                            }
                        }
                    }
                    if (this.o % 4 == 0) {
                        while (i2 < f.length) {
                            f[i2] = (byte) (256 - f[i2]);
                            i2++;
                            if (z) {
                                break;
                            }
                        }
                    }
                    this.e.a(f);
                }
            } catch (IllegalStateException e) {
                throw e;
            } catch (IllegalStateException e2) {
                throw e2;
            }
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    private OnAudioFocusChangeListener y() {
        try {
            if (this.y == null) {
                this.y = new c9(null);
            }
            return this.y;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    static void h(i8 i8Var) {
        i8Var.s();
    }

    private void z() {
        try {
            if (this.v) {
                this.d.unregisterReceiver(this.k);
                this.v = false;
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void a(ey eyVar) {
        this.s = eyVar;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void v() {
        /*
        r4 = this;
        r3 = 0;
        r2 = 0;
        r0 = B;	 Catch:{ IllegalStateException -> 0x0061 }
        r1 = 11;
        r0 = r0[r1];	 Catch:{ IllegalStateException -> 0x0061 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IllegalStateException -> 0x0061 }
        r0 = r4.h;	 Catch:{ IllegalStateException -> 0x0061 }
        if (r0 == 0) goto L_0x001c;
    L_0x000f:
        r0 = r4.h;	 Catch:{ IllegalStateException -> 0x0061 }
        r0.b();	 Catch:{ IllegalStateException -> 0x0061 }
        r0 = r4.h;	 Catch:{ IllegalStateException -> 0x0061 }
        r0.h();	 Catch:{ IllegalStateException -> 0x0061 }
        r0 = 0;
        r4.h = r0;	 Catch:{ IllegalStateException -> 0x0061 }
    L_0x001c:
        r0 = r4.c;	 Catch:{ IllegalStateException -> 0x0063 }
        if (r0 == 0) goto L_0x002d;
    L_0x0020:
        r0 = r4.c;	 Catch:{ IllegalStateException -> 0x0063 }
        r0.reset();	 Catch:{ IllegalStateException -> 0x0063 }
        r0 = r4.c;	 Catch:{ IllegalStateException -> 0x0063 }
        r0.release();	 Catch:{ IllegalStateException -> 0x0063 }
        r0 = 0;
        r4.c = r0;	 Catch:{ IllegalStateException -> 0x0063 }
    L_0x002d:
        r0 = r4.x;	 Catch:{ IllegalStateException -> 0x0065 }
        if (r0 == 0) goto L_0x003a;
    L_0x0031:
        r0 = r4.x;	 Catch:{ IllegalStateException -> 0x0065 }
        r1 = 0;
        r0.setEnabled(r1);	 Catch:{ IllegalStateException -> 0x0065 }
        r0 = 0;
        r4.x = r0;	 Catch:{ IllegalStateException -> 0x0065 }
    L_0x003a:
        r0 = r4.l;	 Catch:{ IllegalStateException -> 0x0067 }
        if (r0 != 0) goto L_0x0042;
    L_0x003e:
        r0 = r4.j;	 Catch:{ IllegalStateException -> 0x0069 }
        if (r0 != 0) goto L_0x0045;
    L_0x0042:
        r4.b();	 Catch:{ IllegalStateException -> 0x0069 }
    L_0x0045:
        r4.p();
        r0 = r4.d;
        r1 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r0.setVolumeControlStream(r1);
        r4.r = r2;
        r4.t = r2;
        r0 = r4.A;
        r0.removeMessages(r2);
        p = r3;
        r4.z();
        r4.t();
        return;
    L_0x0061:
        r0 = move-exception;
        throw r0;
    L_0x0063:
        r0 = move-exception;
        throw r0;
    L_0x0065:
        r0 = move-exception;
        throw r0;
    L_0x0067:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0069 }
    L_0x0069:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.i8.v():void");
    }

    private void k() {
        try {
            if (this.s != null) {
                this.s.c();
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private void c() {
        try {
            if (this.s != null) {
                this.s.d();
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    static void b(i8 i8Var) {
        i8Var.b();
    }

    public static boolean a(co coVar) {
        try {
            if (p != null) {
                if (p.b(coVar)) {
                    return true;
                }
            }
            return false;
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i8(android.app.Activity r5) {
        /*
        r4 = this;
        r4.<init>();
        r0 = 0;
        r4.v = r0;
        r0 = new com.whatsapp.a3p;
        r1 = android.os.Looper.getMainLooper();
        r0.<init>(r4, r1);
        r4.A = r0;
        r4.d = r5;
        r0 = a;
        if (r0 != 0) goto L_0x002a;
    L_0x0017:
        r0 = r4.d;
        r0 = r0.getApplicationContext();
        r1 = B;
        r2 = 3;
        r1 = r1[r2];
        r0 = r0.getSystemService(r1);
        r0 = (android.media.AudioManager) r0;
        a = r0;
    L_0x002a:
        r0 = r4.l();	 Catch:{ IllegalStateException -> 0x0060 }
        r1 = -1;
        if (r0 == r1) goto L_0x0051;
    L_0x0031:
        r0 = r4.d;	 Catch:{ IllegalStateException -> 0x0062 }
        r1 = B;	 Catch:{ IllegalStateException -> 0x0062 }
        r2 = 1;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0062 }
        r0 = r0.getSystemService(r1);	 Catch:{ IllegalStateException -> 0x0062 }
        r0 = (android.os.PowerManager) r0;	 Catch:{ IllegalStateException -> 0x0062 }
        r1 = r4.l();	 Catch:{ IllegalStateException -> 0x0062 }
        r2 = B;	 Catch:{ IllegalStateException -> 0x0062 }
        r3 = 2;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x0062 }
        r0 = r0.newWakeLock(r1, r2);	 Catch:{ IllegalStateException -> 0x0062 }
        r4.l = r0;	 Catch:{ IllegalStateException -> 0x0062 }
        r0 = com.whatsapp.DialogToastActivity.f;	 Catch:{ IllegalStateException -> 0x0062 }
        if (r0 == 0) goto L_0x0054;
    L_0x0051:
        r0 = 0;
        r4.l = r0;	 Catch:{ IllegalStateException -> 0x0062 }
    L_0x0054:
        r0 = com.whatsapp.App.t;
        r4.z = r0;
        r0 = new com.whatsapp.MessageAudioPlayer$2;
        r0.<init>(r4);
        r4.k = r0;
        return;
    L_0x0060:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0062 }
    L_0x0062:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.i8.<init>(android.app.Activity):void");
    }

    static Sensor d(i8 i8Var) {
        return i8Var.q;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h() {
        /*
        r9 = this;
        r8 = 10;
        r7 = 9;
        r1 = 1;
        r2 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = p;	 Catch:{ IOException -> 0x0153 }
        if (r0 == r9) goto L_0x0015;
    L_0x000c:
        r0 = p;	 Catch:{ IOException -> 0x0153 }
        if (r0 == 0) goto L_0x0015;
    L_0x0010:
        r0 = p;	 Catch:{ IOException -> 0x0155 }
        r0.v();	 Catch:{ IOException -> 0x0155 }
    L_0x0015:
        r0 = com.whatsapp.App.g;	 Catch:{ IOException -> 0x0157 }
        r0.stop();	 Catch:{ IOException -> 0x0157 }
        r0 = r9.d;	 Catch:{ IOException -> 0x0157 }
        r0 = com.whatsapp.App.y(r0);	 Catch:{ IOException -> 0x0157 }
        if (r0 != 0) goto L_0x0028;
    L_0x0022:
        r0 = r9.d;	 Catch:{ IOException -> 0x0157 }
        r4 = 3;
        r0.setVolumeControlStream(r4);	 Catch:{ IOException -> 0x0157 }
    L_0x0028:
        r9.w();	 Catch:{ IOException -> 0x0159 }
        r9.u();	 Catch:{ IOException -> 0x0159 }
        r4 = java.lang.System.currentTimeMillis();	 Catch:{ IOException -> 0x0159 }
        r9.u = r4;	 Catch:{ IOException -> 0x0159 }
        r0 = r9.h;	 Catch:{ IOException -> 0x0159 }
        if (r0 != 0) goto L_0x012d;
    L_0x0038:
        r0 = B;	 Catch:{ IOException -> 0x0159 }
        r4 = 7;
        r0 = r0[r4];	 Catch:{ IOException -> 0x0159 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x0159 }
        r0 = r9.e;	 Catch:{ IOException -> 0x0159 }
        if (r0 == 0) goto L_0x008b;
    L_0x0044:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IOException -> 0x015b }
        r4 = 17;
        if (r0 < r4) goto L_0x008b;
    L_0x004a:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IOException -> 0x015d }
        r4 = 18;
        if (r0 > r4) goto L_0x008b;
    L_0x0050:
        r0 = B;	 Catch:{ IOException -> 0x015f }
        r4 = 8;
        r0 = r0[r4];	 Catch:{ IOException -> 0x015f }
        r4 = android.os.Build.MANUFACTURER;	 Catch:{ IOException -> 0x015f }
        r0 = r0.equals(r4);	 Catch:{ IOException -> 0x015f }
        if (r0 == 0) goto L_0x008b;
    L_0x005e:
        r0 = n;	 Catch:{ IOException -> 0x0161 }
        r4 = android.os.Build.MODEL;	 Catch:{ IOException -> 0x0161 }
        r0 = com.whatsapp.util.ax.a(r0, r4);	 Catch:{ IOException -> 0x0161 }
        if (r0 == 0) goto L_0x008b;
    L_0x0068:
        r0 = r9.i;	 Catch:{ IOException -> 0x0163 }
        r0 = r0.Q;	 Catch:{ IOException -> 0x0163 }
        r0 = (com.whatsapp.MediaData) r0;	 Catch:{ IOException -> 0x0163 }
        r4 = new android.media.MediaPlayer;	 Catch:{ IOException -> 0x0163 }
        r4.<init>();	 Catch:{ IOException -> 0x0163 }
        r9.c = r4;	 Catch:{ IOException -> 0x0163 }
        r4 = r9.c;	 Catch:{ IOException -> 0x0163 }
        r0 = r0.file;	 Catch:{ IOException -> 0x0163 }
        r0 = r0.getAbsolutePath();	 Catch:{ IOException -> 0x0163 }
        r4.setDataSource(r0);	 Catch:{ IOException -> 0x0163 }
        r0 = r9.c;	 Catch:{ IOException -> 0x0163 }
        r4 = 3;
        r0.setAudioStreamType(r4);	 Catch:{ IOException -> 0x0163 }
        r0 = r9.c;	 Catch:{ IOException -> 0x0163 }
        r0.prepare();	 Catch:{ IOException -> 0x0163 }
    L_0x008b:
        r0 = r9.i;	 Catch:{ IOException -> 0x0171 }
        r0 = r0.Q;	 Catch:{ IOException -> 0x0171 }
        r0 = (com.whatsapp.MediaData) r0;	 Catch:{ IOException -> 0x0171 }
        r0 = r0.file;	 Catch:{ IOException -> 0x0169 }
        r0 = r0.getAbsolutePath();	 Catch:{ IOException -> 0x0169 }
        r4 = 3;
        r0 = com.whatsapp.util.at.a(r0, r4);	 Catch:{ IOException -> 0x0169 }
        r9.h = r0;	 Catch:{ IOException -> 0x0169 }
        r0 = r9.h;	 Catch:{ IOException -> 0x0169 }
        r0.g();	 Catch:{ IOException -> 0x0169 }
        r0 = r9.h;	 Catch:{ IOException -> 0x0169 }
        r4 = r9.r;	 Catch:{ IOException -> 0x0169 }
        r0.a(r4);	 Catch:{ IOException -> 0x0169 }
        r0 = r9.h;	 Catch:{ IOException -> 0x0169 }
        r0.c();	 Catch:{ IOException -> 0x0169 }
        r0 = r9.h;	 Catch:{ IOException -> 0x0169 }
        r0 = r0.d();	 Catch:{ IOException -> 0x0169 }
        r9.m = r0;	 Catch:{ IOException -> 0x0169 }
        r0 = r9.A;	 Catch:{ IOException -> 0x0169 }
        r4 = 0;
        r0.sendEmptyMessage(r4);	 Catch:{ IOException -> 0x0169 }
        r0 = r9.i;	 Catch:{ IOException -> 0x0169 }
        r0 = r0.k;	 Catch:{ IOException -> 0x0169 }
        r0 = r0.a;	 Catch:{ IOException -> 0x0169 }
        if (r0 != 0) goto L_0x00e7;
    L_0x00c5:
        r0 = r9.i;	 Catch:{ IOException -> 0x0169 }
        r0 = r0.r;	 Catch:{ IOException -> 0x0169 }
        if (r0 != r1) goto L_0x00e7;
    L_0x00cb:
        r0 = r9.i;	 Catch:{ IOException -> 0x016b }
        r0 = r0.d;	 Catch:{ IOException -> 0x016b }
        if (r0 == r7) goto L_0x00e7;
    L_0x00d1:
        r0 = r9.i;	 Catch:{ IOException -> 0x016d }
        r0 = r0.d;	 Catch:{ IOException -> 0x016d }
        if (r0 == r8) goto L_0x00e7;
    L_0x00d7:
        r0 = com.whatsapp.App.aK;	 Catch:{ IOException -> 0x016f }
        r4 = r9.i;	 Catch:{ IOException -> 0x016f }
        r4 = r4.k;	 Catch:{ IOException -> 0x016f }
        r5 = 9;
        r0.b(r4, r5);	 Catch:{ IOException -> 0x016f }
        r0 = r9.i;	 Catch:{ IOException -> 0x016f }
        com.whatsapp.App.s(r0);	 Catch:{ IOException -> 0x016f }
    L_0x00e7:
        r0 = r1;
    L_0x00e8:
        if (r0 == 0) goto L_0x0128;
    L_0x00ea:
        r0 = r9.e;	 Catch:{ IOException -> 0x0184 }
        if (r0 == 0) goto L_0x011e;
    L_0x00ee:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IOException -> 0x0186 }
        if (r0 < r7) goto L_0x011e;
    L_0x00f2:
        r0 = new android.media.audiofx.Visualizer;	 Catch:{ Exception -> 0x0188 }
        r1 = 0;
        r0.<init>(r1);	 Catch:{ Exception -> 0x0188 }
        r9.x = r0;	 Catch:{ Exception -> 0x0188 }
        r0 = r9.x;	 Catch:{ Exception -> 0x0188 }
        r1 = android.media.audiofx.Visualizer.getCaptureSizeRange();	 Catch:{ Exception -> 0x0188 }
        r4 = 1;
        r1 = r1[r4];	 Catch:{ Exception -> 0x0188 }
        r0.setCaptureSize(r1);	 Catch:{ Exception -> 0x0188 }
        r0 = r9.x;	 Catch:{ Exception -> 0x0188 }
        r1 = new com.whatsapp.qs;	 Catch:{ Exception -> 0x0188 }
        r1.<init>(r9);	 Catch:{ Exception -> 0x0188 }
        r4 = android.media.audiofx.Visualizer.getMaxCaptureRate();	 Catch:{ Exception -> 0x0188 }
        r4 = r4 / 2;
        r5 = 1;
        r6 = 1;
        r0.setDataCaptureListener(r1, r4, r5, r6);	 Catch:{ Exception -> 0x0188 }
        r0 = r9.x;	 Catch:{ Exception -> 0x0188 }
        r1 = 1;
        r0.setEnabled(r1);	 Catch:{ Exception -> 0x0188 }
    L_0x011e:
        r9.c();	 Catch:{ IOException -> 0x01a7 }
        r9.g();	 Catch:{ IOException -> 0x01a7 }
        p = r9;	 Catch:{ IOException -> 0x01a7 }
        if (r3 == 0) goto L_0x012b;
    L_0x0128:
        r9.v();	 Catch:{ IOException -> 0x01a7 }
    L_0x012b:
        if (r3 == 0) goto L_0x0152;
    L_0x012d:
        r0 = B;
        r0 = r0[r8];
        com.whatsapp.util.Log.i(r0);
        r0 = r9.h;	 Catch:{ IllegalStateException -> 0x01a9, IOException -> 0x01b7 }
        r1 = r9.r;	 Catch:{ IllegalStateException -> 0x01a9, IOException -> 0x01b7 }
        r0.a(r1);	 Catch:{ IllegalStateException -> 0x01a9, IOException -> 0x01b7 }
        r0 = r9.h;	 Catch:{ IllegalStateException -> 0x01a9, IOException -> 0x01b7 }
        r0.c();	 Catch:{ IllegalStateException -> 0x01a9, IOException -> 0x01b7 }
        r0 = 0;
        r9.t = r0;	 Catch:{ IllegalStateException -> 0x01a9, IOException -> 0x01b7 }
        r0 = r9.A;	 Catch:{ IllegalStateException -> 0x01a9, IOException -> 0x01b7 }
        r1 = 0;
        r0.sendEmptyMessage(r1);	 Catch:{ IllegalStateException -> 0x01a9, IOException -> 0x01b7 }
        r9.u();	 Catch:{ IllegalStateException -> 0x01a9, IOException -> 0x01b7 }
        r9.g();	 Catch:{ IllegalStateException -> 0x01a9, IOException -> 0x01b7 }
        r9.k();	 Catch:{ IllegalStateException -> 0x01a9, IOException -> 0x01b7 }
    L_0x0152:
        return;
    L_0x0153:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0155 }
    L_0x0155:
        r0 = move-exception;
        throw r0;
    L_0x0157:
        r0 = move-exception;
        throw r0;
    L_0x0159:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x015b }
    L_0x015b:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x015d }
    L_0x015d:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x015f }
    L_0x015f:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0161 }
    L_0x0161:
        r0 = move-exception;
        throw r0;
    L_0x0163:
        r0 = move-exception;
        com.whatsapp.util.Log.a(r0);
        goto L_0x008b;
    L_0x0169:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x016b }
    L_0x016b:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x016d }
    L_0x016d:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x016f }
    L_0x016f:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0171 }
    L_0x0171:
        r0 = move-exception;
        com.whatsapp.util.Log.a(r0);
        r0 = r9.d;
        r0 = r0.getApplicationContext();
        r1 = 2131231156; // 0x7f0801b4 float:1.8078385E38 double:1.0529680975E-314;
        com.whatsapp.App.a(r0, r1, r2);
        r0 = r2;
        goto L_0x00e8;
    L_0x0184:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0186 }
    L_0x0186:
        r0 = move-exception;
        throw r0;
    L_0x0188:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r4 = B;
        r4 = r4[r7];
        r1 = r1.append(r4);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        goto L_0x011e;
    L_0x01a7:
        r0 = move-exception;
        throw r0;
    L_0x01a9:
        r0 = move-exception;
    L_0x01aa:
        r0 = r9.d;
        r0 = r0.getApplicationContext();
        r1 = 2131231156; // 0x7f0801b4 float:1.8078385E38 double:1.0529680975E-314;
        com.whatsapp.App.a(r0, r1, r2);
        goto L_0x0152;
    L_0x01b7:
        r0 = move-exception;
        goto L_0x01aa;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.i8.h():void");
    }

    public boolean j() {
        try {
            return this.l != null;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public boolean n() {
        try {
            if (this.h != null) {
                if (this.h.f()) {
                    return true;
                }
            }
            return false;
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    private void t() {
        try {
            if (this.s != null) {
                this.s.a();
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public static void m() {
        try {
            if (p != null) {
                p.e();
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void a(akb com_whatsapp_akb) {
        this.e = com_whatsapp_akb;
    }

    private void o() {
        try {
            if (this.l == null) {
                return;
            }
            if (!this.l.isHeld()) {
                try {
                    if (!this.z) {
                        try {
                            if (this.h.f()) {
                                this.l.acquire();
                                Log.i(B[13]);
                            }
                        } catch (IllegalStateException e) {
                            throw e;
                        }
                    }
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            }
        } catch (IllegalStateException e22) {
            throw e22;
        } catch (IllegalStateException e222) {
            throw e222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void s() {
        /*
        r2 = this;
        r0 = r2.l;	 Catch:{ IllegalStateException -> 0x002a }
        if (r0 == 0) goto L_0x0029;
    L_0x0004:
        r0 = r2.l;	 Catch:{ IllegalStateException -> 0x002c }
        r0 = r0.isHeld();	 Catch:{ IllegalStateException -> 0x002c }
        if (r0 == 0) goto L_0x0029;
    L_0x000c:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IllegalStateException -> 0x002e }
        r1 = 21;
        if (r0 < r1) goto L_0x001c;
    L_0x0012:
        r0 = r2.l;	 Catch:{ IllegalStateException -> 0x0030 }
        r1 = 1;
        r0.release(r1);	 Catch:{ IllegalStateException -> 0x0030 }
        r0 = com.whatsapp.DialogToastActivity.f;	 Catch:{ IllegalStateException -> 0x0030 }
        if (r0 == 0) goto L_0x0021;
    L_0x001c:
        r0 = r2.l;	 Catch:{ IllegalStateException -> 0x0030 }
        r0.release();	 Catch:{ IllegalStateException -> 0x0030 }
    L_0x0021:
        r0 = B;
        r1 = 0;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
    L_0x0029:
        return;
    L_0x002a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x002c }
    L_0x002c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x002e }
    L_0x002e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0030 }
    L_0x0030:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.i8.s():void");
    }

    private void w() {
        int i = 1;
        try {
            if (VERSION.SDK_INT > 7) {
                AudioManager audioManager = a;
                OnAudioFocusChangeListener y = y();
                if (this.i.r == 1) {
                    i = 3;
                }
                audioManager.requestAudioFocus(y, 3, i);
            }
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    static {
        String[] strArr = new String[17];
        String str = "\u000b\b*Zp\u0001\b8\\u\u000f\u0002)Ep\u001f\b+\u0006b\u0012\f+]A\u0014\u0002!@|\u000f\u0019 ex\u0015\u0019<Gt\u0014M+L}\u0003\f*LuF\u001d+Fi\u000f\u00000]h1\f2L]\t\u000e2";
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
                        i3 = arj.Theme_checkboxStyle;
                        break;
                    case org.whispersystems.at.g /*1*/:
                        i3 = arj.Theme_switchStyle;
                        break;
                    case org.whispersystems.at.i /*2*/:
                        i3 = 89;
                        break;
                    case org.whispersystems.at.o /*3*/:
                        i3 = 41;
                        break;
                    default:
                        i3 = 17;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "1\u00058]b'\u001d)\t\\\u0003\u001e*Hv\u0003,,Mx\t=5Hh\u0003\u001fyyc\t\u00150Dx\u0012\u0014\u000eHz\u0003!6Jz";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case org.whispersystems.at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0007\u0018=@~";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case org.whispersystems.at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u0015\b7Z~\u0014";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case org.whispersystems.at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0007\u0018=@~";
                    obj = 4;
                    break;
                case org.whispersystems.at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u000b\b*Zp\u0001\b8\\u\u000f\u0002)Ep\u001f\b+\u0006~\b\b8[a\u0014\u0002!@|\u000f\u0019 \t";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case org.whispersystems.at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u000b\b*Zp\u0001\b8\\u\u000f\u0002)Ep\u001f\b+\u0006b\u0012\f+]";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0015\f4Zd\b\n";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0010\u0004*\\p\n\u0000<Mx\u0007\u001d5Hh\u0003\u001fvZe\u0007\u001f-\t";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u000b\b*Zp\u0001\b8\\u\u000f\u0002)Ep\u001f\b+\u0006c\u0003\u001e,Dt";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u000b\b*Zp\u0001\b8\\u\u000f\u0002)Ep\u001f\b+\u0006b\u0012\u0002)";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u0007\u0003=[~\u000f\tw@\u007f\u0012\b7]?\u0007\u000e-@~\bC\u0011lP\">\u001c}N6!\fn";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u000b\b*Zp\u0001\b8\\u\u000f\u0002)Ep\u001f\b+\u0006b\u0012\f+]A\u0014\u0002!@|\u000f\u0019 ex\u0015\u0019<Gt\u0014M8J`\u0013\u0004+LuF\u001d+Fi\u000f\u00000]h1\f2L]\t\u000e2";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "6?\u0016qX+$\rpN5.\u000blT(2\u0016oW9:\u0018bT9!\u0016jZ";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\b\u0002yyC)5\u0010dX24\u0006zR4(\u001cgN)+\u001fvF'&\u001cv]).\u0012\tw\u000f\b5M1\u000f\u0003yy~\u0011\b+dp\b\f>Lc";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\u0013\u00038K}\u0003M-F1\u0007\u000e:Lb\u0015M\t{^>$\u0014`E?2\njC#(\u0017v^ +\u0006~P-(\u0006e^%&yOx\u0003\u0001=\tx\bM\tFf\u0003\u001f\u0014H\u007f\u0007\n<[";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    B = strArr3;
                    strArr = new String[11];
                    str = "!9t`(S]l";
                    obj = 16;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i = 0;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    str = "!9t`(S]o";
                    obj = 17;
                    i = 1;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    str = "!9t`(S]ln";
                    obj = 18;
                    i = 2;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    str = "5*\u0011\u0004XU^n";
                    obj = 19;
                    i = 3;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    str = "5*\u0011\u0004\\_\\`";
                    obj = 20;
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "5.\u0011\u0004XSYl";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "5=\u0011\u0004]Q_i";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "5.\u0011\u0004C_Zi";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "!9t`(S]a";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "5*\u0011\u0004_VYl";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "5.t\u0019%#";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    n = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0016\u0002.Lc";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void c(co coVar) {
        this.i = coVar;
    }

    static void a(i8 i8Var) {
        i8Var.o();
    }

    public static void f() {
        try {
            if (p != null) {
                p.v();
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private void p() {
        try {
            if (VERSION.SDK_INT > 7) {
                a.abandonAudioFocus(y());
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public int x() {
        return this.m;
    }

    static boolean c(i8 i8Var) {
        return i8Var.z;
    }

    public void a(int i) {
        try {
            if (this.h != null) {
                this.h.a(i);
            }
            this.r = i;
        } catch (IOException e) {
            throw e;
        } catch (Throwable e2) {
            Log.a(e2);
        }
    }

    private int l() {
        try {
            if (VERSION.SDK_INT >= 21) {
                return 32;
            }
            try {
                return PowerManager.class.getDeclaredField(B[14]).getInt(null);
            } catch (NoSuchFieldException e) {
                Log.w(B[15]);
                return -1;
            } catch (IllegalAccessException e2) {
                Log.w(B[16]);
                return -1;
            }
        } catch (NoSuchFieldException e3) {
            throw e3;
        }
    }

    static boolean g(i8 i8Var) {
        return i8Var.t;
    }

    static at f(i8 i8Var) {
        return i8Var.h;
    }

    public boolean b(co coVar) {
        return coVar.k.equals(this.i.k);
    }

    static void a(i8 i8Var, int i) {
        i8Var.b(i);
    }

    static boolean a(i8 i8Var, boolean z) {
        i8Var.z = z;
        return z;
    }

    public static boolean q() {
        try {
            if (p != null) {
                if (p.j) {
                    return true;
                }
            }
            return false;
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    static akb e(i8 i8Var) {
        return i8Var.e;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a(boolean r7) {
        /*
        r6 = this;
        r2 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = com.whatsapp.App.t;
        if (r0 == 0) goto L_0x0008;
    L_0x0007:
        r7 = r2;
    L_0x0008:
        r0 = r6.j;	 Catch:{ IllegalStateException -> 0x000d }
        if (r0 != r7) goto L_0x000f;
    L_0x000c:
        return;
    L_0x000d:
        r0 = move-exception;
        throw r0;
    L_0x000f:
        if (r7 == 0) goto L_0x001d;
    L_0x0011:
        r0 = r6.h;	 Catch:{ IllegalStateException -> 0x00fc }
        if (r0 == 0) goto L_0x000c;
    L_0x0015:
        r0 = r6.h;	 Catch:{ IllegalStateException -> 0x00fe }
        r0 = r0.f();	 Catch:{ IllegalStateException -> 0x00fe }
        if (r0 == 0) goto L_0x000c;
    L_0x001d:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = B;
        r4 = 6;
        r1 = r1[r4];
        r0 = r0.append(r1);
        r0 = r0.append(r7);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r6.j = r7;
        r0 = r6.l;
        if (r0 != 0) goto L_0x005a;
    L_0x003c:
        r0 = r6.d;
        r0 = r0.getWindow();
        r1 = r0.getAttributes();
        if (r7 == 0) goto L_0x0053;
    L_0x0048:
        r4 = r1.screenBrightness;	 Catch:{ IllegalStateException -> 0x0102 }
        r6.w = r4;	 Catch:{ IllegalStateException -> 0x0102 }
        r4 = 1036831949; // 0x3dcccccd float:0.1 double:5.122630465E-315;
        r1.screenBrightness = r4;	 Catch:{ IllegalStateException -> 0x0102 }
        if (r3 == 0) goto L_0x0057;
    L_0x0053:
        r4 = r6.w;	 Catch:{ IllegalStateException -> 0x0104 }
        r1.screenBrightness = r4;	 Catch:{ IllegalStateException -> 0x0104 }
    L_0x0057:
        r0.setAttributes(r1);
    L_0x005a:
        r0 = r6.s;	 Catch:{ IllegalStateException -> 0x0106 }
        if (r0 == 0) goto L_0x0063;
    L_0x005e:
        r0 = r6.s;	 Catch:{ IllegalStateException -> 0x0106 }
        r0.a(r7);	 Catch:{ IllegalStateException -> 0x0106 }
    L_0x0063:
        r0 = r6.h;	 Catch:{ IllegalStateException -> 0x0108 }
        if (r0 == 0) goto L_0x000c;
    L_0x0067:
        r0 = r6.h;	 Catch:{ IllegalStateException -> 0x0108 }
        r0 = r0.f();	 Catch:{ IllegalStateException -> 0x0108 }
        if (r0 == 0) goto L_0x000c;
    L_0x006f:
        r0 = r6.h;
        r4 = r0.a();
        r0 = r6.h;
        r0.b();
        r0 = r6.h;
        r0.h();
        r0 = 0;
        r6.h = r0;
        r0 = r6.i;
        r0 = r0.Q;
        r0 = (com.whatsapp.MediaData) r0;
        if (r7 == 0) goto L_0x010a;
    L_0x008a:
        r1 = r2;
    L_0x008b:
        r0 = r0.file;	 Catch:{ IllegalStateException -> 0x00ed, IOException -> 0x0110 }
        r0 = r0.getAbsolutePath();	 Catch:{ IllegalStateException -> 0x00ed, IOException -> 0x0110 }
        r0 = com.whatsapp.util.at.a(r0, r1);	 Catch:{ IllegalStateException -> 0x00ed, IOException -> 0x0110 }
        r6.h = r0;	 Catch:{ IllegalStateException -> 0x00ed, IOException -> 0x0110 }
        r0 = r6.d;	 Catch:{ IllegalStateException -> 0x00ed, IOException -> 0x0110 }
        r0.setVolumeControlStream(r1);	 Catch:{ IllegalStateException -> 0x00ed, IOException -> 0x0110 }
        if (r7 == 0) goto L_0x00af;
    L_0x009e:
        r0 = r6.d;	 Catch:{ IllegalStateException -> 0x00ed, IOException -> 0x0110 }
        r1 = B;	 Catch:{ IllegalStateException -> 0x00ed, IOException -> 0x0110 }
        r5 = 5;
        r1 = r1[r5];	 Catch:{ IllegalStateException -> 0x00ed, IOException -> 0x0110 }
        r0 = r0.getSystemService(r1);	 Catch:{ IllegalStateException -> 0x00ed, IOException -> 0x0110 }
        r0 = (android.media.AudioManager) r0;	 Catch:{ IllegalStateException -> 0x00ed, IOException -> 0x0110 }
        r1 = 0;
        r0.setSpeakerphoneOn(r1);	 Catch:{ IllegalStateException -> 0x00ed, IOException -> 0x0110 }
    L_0x00af:
        r0 = r6.h;	 Catch:{ IllegalStateException -> 0x010c, IOException -> 0x0110 }
        r0.g();	 Catch:{ IllegalStateException -> 0x010c, IOException -> 0x0110 }
        r0 = 0;
        r1 = r4 + -1000;
        r0 = java.lang.Math.max(r0, r1);	 Catch:{ IllegalStateException -> 0x010c, IOException -> 0x0110 }
        r6.r = r0;	 Catch:{ IllegalStateException -> 0x010c, IOException -> 0x0110 }
        r0 = r6.h;	 Catch:{ IllegalStateException -> 0x010c, IOException -> 0x0110 }
        r1 = r6.r;	 Catch:{ IllegalStateException -> 0x010c, IOException -> 0x0110 }
        r0.a(r1);	 Catch:{ IllegalStateException -> 0x010c, IOException -> 0x0110 }
        if (r7 != 0) goto L_0x00d3;
    L_0x00c6:
        r0 = java.lang.System.currentTimeMillis();	 Catch:{ IllegalStateException -> 0x010c, IOException -> 0x0110 }
        r4 = r6.u;	 Catch:{ IllegalStateException -> 0x010c, IOException -> 0x0110 }
        r0 = r0 - r4;
        r4 = 1500; // 0x5dc float:2.102E-42 double:7.41E-321;
        r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r0 >= 0) goto L_0x00da;
    L_0x00d3:
        r0 = r6.h;	 Catch:{ IllegalStateException -> 0x010e, IOException -> 0x0110 }
        r0.c();	 Catch:{ IllegalStateException -> 0x010e, IOException -> 0x0110 }
        if (r3 == 0) goto L_0x000c;
    L_0x00da:
        r0 = 1;
        r6.t = r0;	 Catch:{ IllegalStateException -> 0x00eb, IOException -> 0x0110 }
        r6.i();	 Catch:{ IllegalStateException -> 0x00eb, IOException -> 0x0110 }
        r6.z();	 Catch:{ IllegalStateException -> 0x00eb, IOException -> 0x0110 }
        r6.s();	 Catch:{ IllegalStateException -> 0x00eb, IOException -> 0x0110 }
        r6.p();	 Catch:{ IllegalStateException -> 0x00eb, IOException -> 0x0110 }
        goto L_0x000c;
    L_0x00eb:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00ed, IOException -> 0x0110 }
    L_0x00ed:
        r0 = move-exception;
    L_0x00ee:
        r0 = r6.d;
        r0 = r0.getApplicationContext();
        r1 = 2131231156; // 0x7f0801b4 float:1.8078385E38 double:1.0529680975E-314;
        com.whatsapp.App.a(r0, r1, r2);
        goto L_0x000c;
    L_0x00fc:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00fe }
    L_0x00fe:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0100 }
    L_0x0100:
        r0 = move-exception;
        throw r0;
    L_0x0102:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0104 }
    L_0x0104:
        r0 = move-exception;
        throw r0;
    L_0x0106:
        r0 = move-exception;
        throw r0;
    L_0x0108:
        r0 = move-exception;
        throw r0;
    L_0x010a:
        r1 = 3;
        goto L_0x008b;
    L_0x010c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x010e, IOException -> 0x0110 }
    L_0x010e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00eb, IOException -> 0x0110 }
    L_0x0110:
        r0 = move-exception;
        goto L_0x00ee;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.i8.a(boolean):void");
    }

    private void b() {
        try {
            if (this.b != null) {
                this.b.unregisterListener(this.g, this.q);
                this.b = null;
            }
            s();
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private void u() {
        try {
            if (VERSION.SDK_INT < 21) {
                return;
            }
            if (!this.v) {
                this.d.registerReceiver(this.k, new IntentFilter(B[12]));
                this.v = true;
            }
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public int a() {
        try {
            if (this.h == null) {
                return 0;
            }
            return Math.max(this.r, this.h.a());
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private void g() {
        try {
            o();
            if (this.b == null) {
                this.b = (SensorManager) this.d.getSystemService(B[4]);
                this.q = this.b.getDefaultSensor(8);
                this.g = new aoh(this);
                this.b.registerListener(this.g, this.q, 2);
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public static boolean r() {
        try {
            if (p != null) {
                if (p.n()) {
                    return true;
                }
            }
            return false;
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    private void i() {
        try {
            if (this.s != null) {
                this.s.b();
            }
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d() {
        /*
        r1 = this;
        r0 = p;	 Catch:{ IllegalStateException -> 0x0024 }
        if (r0 == r1) goto L_0x000d;
    L_0x0004:
        r0 = p;	 Catch:{ IllegalStateException -> 0x0026 }
        if (r0 == 0) goto L_0x000d;
    L_0x0008:
        r0 = p;	 Catch:{ IllegalStateException -> 0x0026 }
        r0.v();	 Catch:{ IllegalStateException -> 0x0026 }
    L_0x000d:
        r0 = r1.h;	 Catch:{ IllegalStateException -> 0x0028 }
        if (r0 == 0) goto L_0x0019;
    L_0x0011:
        r0 = r1.h;	 Catch:{ IllegalStateException -> 0x002a }
        r0 = r0.f();	 Catch:{ IllegalStateException -> 0x002a }
        if (r0 != 0) goto L_0x0020;
    L_0x0019:
        r1.h();	 Catch:{ IllegalStateException -> 0x002c }
        r0 = com.whatsapp.DialogToastActivity.f;	 Catch:{ IllegalStateException -> 0x002c }
        if (r0 == 0) goto L_0x0023;
    L_0x0020:
        r1.e();	 Catch:{ IllegalStateException -> 0x002c }
    L_0x0023:
        return;
    L_0x0024:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0026 }
    L_0x0026:
        r0 = move-exception;
        throw r0;
    L_0x0028:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x002a }
    L_0x002a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x002c }
    L_0x002c:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.i8.d():void");
    }

    public void e() {
        try {
            if (this.h != null) {
                if (this.h.f()) {
                    this.h.i();
                    this.t = true;
                    i();
                    z();
                    s();
                }
            }
            p();
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }
}
