package com.whatsapp;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.MediaController.MediaPlayerControl;
import java.util.Map;
import org.v;
import org.whispersystems.at;

public class VideoView extends SurfaceView implements MediaPlayerControl {
    private static final String[] B;
    private String A;
    private boolean a;
    private Map b;
    private int c;
    private int d;
    private OnErrorListener e;
    private int f;
    private boolean g;
    private boolean h;
    private int i;
    private OnCompletionListener j;
    private int k;
    private int l;
    OnVideoSizeChangedListener m;
    private OnPreparedListener n;
    private Uri o;
    Callback p;
    OnPreparedListener q;
    private MediaPlayer r;
    private int s;
    private OnBufferingUpdateListener t;
    private SurfaceHolder u;
    private int v;
    private OnCompletionListener w;
    private OnInfoListener x;
    private OnErrorListener y;
    private int z;

    static {
        String[] strArr = new String[7];
        String str = "raI\u0011\rraH\u0003";
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
                        i3 = 36;
                        break;
                    case at.g /*1*/:
                        i3 = 8;
                        break;
                    case at.i /*2*/:
                        i3 = 45;
                        break;
                    case at.o /*3*/:
                        i3 = 116;
                        break;
                    default:
                        i3 = 98;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "RaI\u0011\rRaH\u0003M\u0004]C\u0015\u0000Hm\r\u0000\r\u0004g]\u0011\f\u0004kB\u001a\u0016AfYNB";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "TiX\u0007\u0007";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "Gg@Z\u0003Jl_\u001b\u000b@&@\u0001\u0011Mk\u0003\u0019\u0017WaN\u0007\u0007V~D\u0017\u0007Gg@\u0019\u0003Jl";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "RaI\u0011\rRaH\u0003M\u0004]C\u0015\u0000Hm\r\u0000\r\u0004g]\u0011\f\u0004kB\u001a\u0016AfYNB";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "raI\u0011\rraH\u0003";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    B = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "Gg@\u0019\u0003Jl";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static int e(VideoView videoView, int i) {
        videoView.l = i;
        return i;
    }

    static OnErrorListener k(VideoView videoView) {
        return videoView.e;
    }

    static int c(VideoView videoView, int i) {
        videoView.z = i;
        return i;
    }

    private boolean a() {
        try {
            if (this.r != null) {
                if (this.z != -1) {
                    try {
                        if (this.z != 0) {
                            try {
                                if (this.z != 1) {
                                    return true;
                                }
                            } catch (IllegalArgumentException e) {
                                throw e;
                            }
                        }
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                }
            }
            return false;
        } catch (IllegalArgumentException e22) {
            throw e22;
        } catch (IllegalArgumentException e222) {
            throw e222;
        }
    }

    static OnPreparedListener h(VideoView videoView) {
        return videoView.n;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(VideoView.class.getName());
    }

    static int g(VideoView videoView, int i) {
        videoView.i = i;
        return i;
    }

    public boolean canSeekForward() {
        return this.a;
    }

    private void c() {
        this.i = 0;
        this.d = 0;
        getHolder().addCallback(this.p);
        getHolder().setType(3);
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.z = 0;
        this.l = 0;
    }

    public void start() {
        try {
            if (a()) {
                this.r.start();
                this.z = 3;
            }
            this.l = 3;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    static int a(VideoView videoView, int i) {
        videoView.v = i;
        return i;
    }

    public void setVideoPath(String str) {
        setVideoURI(Uri.parse(str));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
        r7 = this;
        r3 = 3;
        r6 = 0;
        r5 = -1;
        r4 = 1;
        r0 = r7.o;	 Catch:{ IOException -> 0x000d }
        if (r0 == 0) goto L_0x000c;
    L_0x0008:
        r0 = r7.u;	 Catch:{ IOException -> 0x000d }
        if (r0 != 0) goto L_0x0011;
    L_0x000c:
        return;
    L_0x000d:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x000f }
    L_0x000f:
        r0 = move-exception;
        throw r0;
    L_0x0011:
        r0 = new android.content.Intent;
        r1 = B;
        r2 = 4;
        r1 = r1[r2];
        r0.<init>(r1);
        r1 = B;
        r1 = r1[r4];
        r2 = B;
        r2 = r2[r3];
        r0.putExtra(r1, r2);
        r1 = r7.getContext();
        r1.sendBroadcast(r0);
        r7.a(r6);
        r0 = new android.media.MediaPlayer;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d8 }
        r0.<init>();	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d8 }
        r7.r = r0;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d8 }
        r0 = r7.c;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d8 }
        if (r0 == 0) goto L_0x0046;
    L_0x003b:
        r0 = r7.r;	 Catch:{ IOException -> 0x00d4, IllegalArgumentException -> 0x00d8 }
        r1 = r7.c;	 Catch:{ IOException -> 0x00d4, IllegalArgumentException -> 0x00d8 }
        r0.setAudioSessionId(r1);	 Catch:{ IOException -> 0x00d4, IllegalArgumentException -> 0x00d8 }
        r0 = com.whatsapp.DialogToastActivity.f;	 Catch:{ IOException -> 0x00d4, IllegalArgumentException -> 0x00d8 }
        if (r0 == 0) goto L_0x0054;
    L_0x0046:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IOException -> 0x00d4, IllegalArgumentException -> 0x00d8 }
        r1 = 9;
        if (r0 < r1) goto L_0x0054;
    L_0x004c:
        r0 = r7.r;	 Catch:{ IOException -> 0x00d6, IllegalArgumentException -> 0x00d8 }
        r0 = r0.getAudioSessionId();	 Catch:{ IOException -> 0x00d6, IllegalArgumentException -> 0x00d8 }
        r7.c = r0;	 Catch:{ IOException -> 0x00d6, IllegalArgumentException -> 0x00d8 }
    L_0x0054:
        r0 = r7.r;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d8 }
        r1 = r7.q;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d8 }
        r0.setOnPreparedListener(r1);	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d8 }
        r0 = r7.r;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d8 }
        r1 = r7.m;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d8 }
        r0.setOnVideoSizeChangedListener(r1);	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d8 }
        r0 = r7.r;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d8 }
        r1 = r7.j;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d8 }
        r0.setOnCompletionListener(r1);	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d8 }
        r0 = r7.r;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d8 }
        r1 = r7.y;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d8 }
        r0.setOnErrorListener(r1);	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d8 }
        r0 = r7.r;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d8 }
        r1 = r7.x;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d8 }
        r0.setOnInfoListener(r1);	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d8 }
        r0 = r7.r;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d8 }
        r1 = r7.t;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d8 }
        r0.setOnBufferingUpdateListener(r1);	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d8 }
        r0 = 0;
        r7.s = r0;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d8 }
        r0 = r7.r;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d8 }
        r1 = r7.getContext();	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d8 }
        r2 = r7.o;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d8 }
        r3 = r7.b;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d8 }
        r0.setDataSource(r1, r2, r3);	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d8 }
        r0 = r7.r;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d8 }
        r1 = r7.u;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d8 }
        r0.setDisplay(r1);	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d8 }
        r0 = r7.r;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d8 }
        r1 = 3;
        r0.setAudioStreamType(r1);	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d8 }
        r0 = r7.r;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d8 }
        r1 = 1;
        r0.setScreenOnWhilePlaying(r1);	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d8 }
        r0 = r7.r;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d8 }
        r0.prepareAsync();	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d8 }
        r0 = 1;
        r7.z = r0;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d8 }
        goto L_0x000c;
    L_0x00ab:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = B;
        r3 = 2;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r7.o;
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.c(r1, r0);
        r7.z = r5;
        r7.l = r5;
        r0 = r7.y;
        r1 = r7.r;
        r0.onError(r1, r4, r6);
        goto L_0x000c;
    L_0x00d4:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00d6, IllegalArgumentException -> 0x00d8 }
    L_0x00d6:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00ab, IllegalArgumentException -> 0x00d8 }
    L_0x00d8:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = B;
        r3 = 5;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r7.o;
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.c(r1, r0);
        r7.z = r5;
        r7.l = r5;
        r0 = r7.y;
        r1 = r7.r;
        r0.onError(r1, r4, r6);
        goto L_0x000c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VideoView.b():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onMeasure(int r11, int r12) {
        /*
        r10 = this;
        r9 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r8 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r4 = com.whatsapp.DialogToastActivity.f;
        r0 = r10.i;
        r1 = getDefaultSize(r0, r11);
        r0 = r10.d;
        r0 = getDefaultSize(r0, r12);
        r2 = r10.i;	 Catch:{ IllegalArgumentException -> 0x0088 }
        if (r2 <= 0) goto L_0x0084;
    L_0x0016:
        r2 = r10.d;	 Catch:{ IllegalArgumentException -> 0x0088 }
        if (r2 <= 0) goto L_0x0084;
    L_0x001a:
        r5 = android.view.View.MeasureSpec.getMode(r11);
        r3 = android.view.View.MeasureSpec.getSize(r11);
        r6 = android.view.View.MeasureSpec.getMode(r12);
        r0 = android.view.View.MeasureSpec.getSize(r12);
        if (r5 != r9) goto L_0x004f;
    L_0x002c:
        if (r6 != r9) goto L_0x004f;
    L_0x002e:
        r1 = r10.i;
        r1 = r1 * r0;
        r2 = r10.d;
        r2 = r2 * r3;
        if (r1 >= r2) goto L_0x0099;
    L_0x0036:
        r1 = r10.i;
        r1 = r1 * r0;
        r2 = r10.d;
        r1 = r1 / r2;
        if (r4 == 0) goto L_0x0084;
    L_0x003e:
        r2 = r1;
    L_0x003f:
        r1 = r10.i;	 Catch:{ IllegalArgumentException -> 0x008a }
        r1 = r1 * r0;
        r7 = r10.d;	 Catch:{ IllegalArgumentException -> 0x008a }
        r7 = r7 * r2;
        if (r1 <= r7) goto L_0x0097;
    L_0x0047:
        r1 = r10.d;
        r1 = r1 * r2;
        r7 = r10.i;
        r1 = r1 / r7;
        if (r4 == 0) goto L_0x0094;
    L_0x004f:
        if (r5 != r9) goto L_0x005d;
    L_0x0051:
        r1 = r10.d;
        r1 = r1 * r3;
        r2 = r10.i;
        r1 = r1 / r2;
        if (r6 != r8) goto L_0x0091;
    L_0x0059:
        if (r1 <= r0) goto L_0x0091;
    L_0x005b:
        if (r4 == 0) goto L_0x008f;
    L_0x005d:
        if (r6 != r9) goto L_0x006b;
    L_0x005f:
        r1 = r10.i;
        r1 = r1 * r0;
        r2 = r10.d;
        r1 = r1 / r2;
        if (r5 != r8) goto L_0x0084;
    L_0x0067:
        if (r1 <= r3) goto L_0x0084;
    L_0x0069:
        if (r4 == 0) goto L_0x008f;
    L_0x006b:
        r2 = r10.i;
        r1 = r10.d;
        if (r6 != r8) goto L_0x008c;
    L_0x0071:
        if (r1 <= r0) goto L_0x008c;
    L_0x0073:
        r1 = r10.i;
        r1 = r1 * r0;
        r2 = r10.d;
        r1 = r1 / r2;
    L_0x0079:
        if (r5 != r8) goto L_0x0084;
    L_0x007b:
        if (r1 <= r3) goto L_0x0084;
    L_0x007d:
        r0 = r10.d;
        r0 = r0 * r3;
        r1 = r10.i;
        r0 = r0 / r1;
        r1 = r3;
    L_0x0084:
        r10.setMeasuredDimension(r1, r0);
        return;
    L_0x0088:
        r0 = move-exception;
        throw r0;
    L_0x008a:
        r0 = move-exception;
        throw r0;
    L_0x008c:
        r0 = r1;
        r1 = r2;
        goto L_0x0079;
    L_0x008f:
        r1 = r3;
        goto L_0x0084;
    L_0x0091:
        r0 = r1;
        r1 = r3;
        goto L_0x0084;
    L_0x0094:
        r0 = r1;
        r1 = r2;
        goto L_0x0084;
    L_0x0097:
        r1 = r2;
        goto L_0x0084;
    L_0x0099:
        r2 = r3;
        goto L_0x003f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VideoView.onMeasure(int, int):void");
    }

    public void setVideoURI(Uri uri) {
        setVideoURI(uri, null);
    }

    static int f(VideoView videoView, int i) {
        videoView.s = i;
        return i;
    }

    static int d(VideoView videoView, int i) {
        videoView.d = i;
        return i;
    }

    public int getBufferPercentage() {
        try {
            if (this.r != null) {
                return this.s;
            }
            return 0;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void seekTo(int i) {
        try {
            if (a()) {
                this.r.seekTo(i);
                this.f = 0;
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            this.f = i;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public void setOnPreparedListener(OnPreparedListener onPreparedListener) {
        this.n = onPreparedListener;
    }

    public int getDuration() {
        try {
            return a() ? this.r.getDuration() : -1;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public void d() {
        a(false);
    }

    static SurfaceHolder a(VideoView videoView, SurfaceHolder surfaceHolder) {
        videoView.u = surfaceHolder;
        return surfaceHolder;
    }

    public VideoView(Context context) {
        super(context);
        this.A = B[0];
        this.z = 0;
        this.l = 0;
        this.u = null;
        this.r = null;
        this.m = new og(this);
        this.q = new az1(this);
        this.j = new pe(this);
        this.y = new a58(this);
        this.t = new ej(this);
        this.p = new b3(this);
        c();
    }

    public VideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        c();
    }

    public VideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A = B[6];
        this.z = 0;
        this.l = 0;
        this.u = null;
        this.r = null;
        this.m = new og(this);
        this.q = new az1(this);
        this.j = new pe(this);
        this.y = new a58(this);
        this.t = new ej(this);
        this.p = new b3(this);
        c();
    }

    static int b(VideoView videoView) {
        return videoView.k;
    }

    static void b(VideoView videoView, boolean z) {
        videoView.a(z);
    }

    private void a(boolean z) {
        try {
            if (this.r != null) {
                this.r.reset();
                this.r.release();
                this.r = null;
                this.z = 0;
                if (z) {
                    this.l = 0;
                }
            }
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    static int a(VideoView videoView) {
        return videoView.d;
    }

    static OnCompletionListener e(VideoView videoView) {
        return videoView.w;
    }

    static int j(VideoView videoView) {
        return videoView.v;
    }

    public void pause() {
        try {
            if (a()) {
                if (this.r.isPlaying()) {
                    this.r.pause();
                    this.z = 4;
                }
            }
            this.l = 4;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    static int g(VideoView videoView) {
        return videoView.l;
    }

    static boolean c(VideoView videoView, boolean z) {
        videoView.h = z;
        return z;
    }

    public boolean isPlaying() {
        try {
            if (a()) {
                if (this.r.isPlaying()) {
                    return true;
                }
            }
            return false;
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    static int d(VideoView videoView) {
        return videoView.i;
    }

    static MediaPlayer c(VideoView videoView) {
        return videoView.r;
    }

    public boolean canSeekBackward() {
        return this.g;
    }

    static void f(VideoView videoView) {
        videoView.b();
    }

    static boolean a(VideoView videoView, boolean z) {
        videoView.g = z;
        return z;
    }

    public boolean canPause() {
        return this.h;
    }

    static int b(VideoView videoView, int i) {
        videoView.k = i;
        return i;
    }

    public void setVideoURI(Uri uri, Map map) {
        this.o = uri;
        this.b = map;
        this.f = 0;
        b();
        requestLayout();
        invalidate();
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(VideoView.class.getName());
    }

    static int i(VideoView videoView) {
        return videoView.f;
    }

    public int getCurrentPosition() {
        try {
            return a() ? this.r.getCurrentPosition() : 0;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    static boolean d(VideoView videoView, boolean z) {
        videoView.a = z;
        return z;
    }

    public int getAudioSessionId() {
        if (this.c == 0) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.c = mediaPlayer.getAudioSessionId();
            mediaPlayer.release();
        }
        return this.c;
    }
}
