package com.whatsapp.camera;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.hardware.Camera;
import android.hardware.Camera.Area;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PictureCallback;
import android.hardware.Camera.Size;
import android.media.MediaRecorder;
import android.os.Build.VERSION;
import android.support.v4.view.GestureDetectorCompat;
import android.util.AttributeSet;
import android.view.Display;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.WindowManager;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class CameraView extends SurfaceView implements Callback, OnGestureListener, OnScaleGestureListener {
    private static String[] p;
    private static String[] t;
    private static final String[] z;
    private Size a;
    private a9 b;
    private boolean c;
    private Camera d;
    private boolean e;
    private int f;
    private boolean g;
    private String h;
    private Display i;
    private boolean j;
    private MediaRecorder k;
    private an l;
    private SurfaceHolder m;
    private Size n;
    private int o;
    private ScaleGestureDetector q;
    private List r;
    private GestureDetectorCompat s;
    private float u;

    static SurfaceHolder h(CameraView cameraView) {
        return cameraView.m;
    }

    public CameraView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.u = 1.0f;
        SharedPreferences sharedPreferences = context.getSharedPreferences(z[3], 0);
        try {
            this.f = sharedPreferences.getInt(z[2], 0);
            this.h = sharedPreferences.getString(z[0], null);
            this.m = getHolder();
            this.m.addCallback(this);
            this.m.setType(3);
            this.s = new GestureDetectorCompat(context, this, null);
            if (VERSION.SDK_INT >= 8) {
                this.q = new ScaleGestureDetector(context, this);
            }
            this.i = ((WindowManager) context.getSystemService(z[1])).getDefaultDisplay();
            this.b = new a9(this, context);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public void a(File file, int i) {
        if (b(file, i)) {
            try {
                Log.i(z[27]);
                this.k.start();
                this.j = true;
                return;
            } catch (Throwable e) {
                try {
                    Log.b(z[26], e);
                    f();
                    b();
                    if (CameraActivity.I == 0) {
                        return;
                    }
                } catch (RuntimeException e2) {
                    throw e2;
                }
            }
        }
        Log.e(z[28]);
        f();
        b();
    }

    static an f(CameraView cameraView) {
        return cameraView.l;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onMeasure(int r15, int r16) {
        /*
        r14 = this;
        r8 = com.whatsapp.camera.CameraActivity.I;
        super.onMeasure(r15, r16);	 Catch:{ RuntimeException -> 0x0011 }
        r0 = r14.d;	 Catch:{ RuntimeException -> 0x0011 }
        if (r0 != 0) goto L_0x000c;
    L_0x0009:
        r14.h();	 Catch:{ RuntimeException -> 0x0011 }
    L_0x000c:
        r0 = r14.d;	 Catch:{ RuntimeException -> 0x0013 }
        if (r0 != 0) goto L_0x0015;
    L_0x0010:
        return;
    L_0x0011:
        r0 = move-exception;
        throw r0;
    L_0x0013:
        r0 = move-exception;
        throw r0;
    L_0x0015:
        r2 = r14.getMeasuredWidth();
        r3 = r14.getMeasuredHeight();
        r0 = r14.a;
        if (r0 == 0) goto L_0x0025;
    L_0x0021:
        r0 = r14.a;
        if (r8 == 0) goto L_0x007c;
    L_0x0025:
        r0 = r14.d;
        r0 = r0.getParameters();
        r0 = r0.getSupportedPreviewSizes();
        if (r0 != 0) goto L_0x0213;
    L_0x0031:
        r0 = r14.d();
        r1 = r0;
    L_0x0036:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r4 = z;
        r5 = 21;
        r4 = r4[r5];
        r0 = r0.append(r4);
        r4 = a(r1);
        r0 = r0.append(r4);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r14.getContext();
        r4 = z;
        r5 = 17;
        r4 = r4[r5];
        r0 = r0.getSystemService(r4);
        r0 = (android.view.WindowManager) r0;
        r0 = r0.getDefaultDisplay();
        r0 = r0.getOrientation();
        if (r0 == 0) goto L_0x0071;
    L_0x006e:
        r4 = 2;
        if (r0 != r4) goto L_0x01ef;
    L_0x0071:
        r0 = 1;
    L_0x0072:
        if (r0 == 0) goto L_0x01f2;
    L_0x0074:
        r4 = r3;
    L_0x0075:
        if (r0 == 0) goto L_0x01f5;
    L_0x0077:
        r0 = r2;
    L_0x0078:
        r0 = a(r1, r4, r0);
    L_0x007c:
        r4 = (double) r2;
        r6 = (double) r3;
        r4 = r4 / r6;
        r1 = r0.width;
        r6 = (double) r1;
        r1 = r0.height;
        r10 = (double) r1;
        r6 = r6 / r10;
        r4 = r4 - r6;
        r4 = java.lang.Math.abs(r4);
        r6 = (double) r3;
        r10 = (double) r2;
        r6 = r6 / r10;
        r1 = r0.width;
        r10 = (double) r1;
        r1 = r0.height;
        r12 = (double) r1;
        r10 = r10 / r12;
        r6 = r6 - r10;
        r6 = java.lang.Math.abs(r6);
        r4 = java.lang.Math.min(r4, r6);
        r1 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x01f8 }
        r1.<init>();	 Catch:{ RuntimeException -> 0x01f8 }
        r6 = z;	 Catch:{ RuntimeException -> 0x01f8 }
        r7 = 25;
        r6 = r6[r7];	 Catch:{ RuntimeException -> 0x01f8 }
        r1 = r1.append(r6);	 Catch:{ RuntimeException -> 0x01f8 }
        r6 = r0.width;	 Catch:{ RuntimeException -> 0x01f8 }
        r1 = r1.append(r6);	 Catch:{ RuntimeException -> 0x01f8 }
        r6 = "x";
        r1 = r1.append(r6);	 Catch:{ RuntimeException -> 0x01f8 }
        r6 = r0.height;	 Catch:{ RuntimeException -> 0x01f8 }
        r1 = r1.append(r6);	 Catch:{ RuntimeException -> 0x01f8 }
        r6 = z;	 Catch:{ RuntimeException -> 0x01f8 }
        r7 = 20;
        r6 = r6[r7];	 Catch:{ RuntimeException -> 0x01f8 }
        r1 = r1.append(r6);	 Catch:{ RuntimeException -> 0x01f8 }
        r1 = r1.append(r2);	 Catch:{ RuntimeException -> 0x01f8 }
        r6 = "x";
        r1 = r1.append(r6);	 Catch:{ RuntimeException -> 0x01f8 }
        r1 = r1.append(r3);	 Catch:{ RuntimeException -> 0x01f8 }
        r6 = z;	 Catch:{ RuntimeException -> 0x01f8 }
        r7 = 23;
        r6 = r6[r7];	 Catch:{ RuntimeException -> 0x01f8 }
        r1 = r1.append(r6);	 Catch:{ RuntimeException -> 0x01f8 }
        r1 = r1.append(r4);	 Catch:{ RuntimeException -> 0x01f8 }
        r1 = r1.toString();	 Catch:{ RuntimeException -> 0x01f8 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ RuntimeException -> 0x01f8 }
        r6 = 4591870180066957722; // 0x3fb999999999999a float:-1.5881868E-23 double:0.1;
        r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r1 <= 0) goto L_0x0010;
    L_0x00f7:
        if (r2 <= r3) goto L_0x01fc;
    L_0x00f9:
        r1 = 1;
        r4 = r1;
    L_0x00fb:
        r1 = r0.width;	 Catch:{ RuntimeException -> 0x0200 }
        r5 = r0.height;	 Catch:{ RuntimeException -> 0x0200 }
        if (r1 <= r5) goto L_0x0202;
    L_0x0101:
        r1 = 1;
    L_0x0102:
        if (r4 != r1) goto L_0x0165;
    L_0x0104:
        r4 = (double) r2;
        r1 = r0.width;
        r6 = (double) r1;
        r4 = r4 / r6;
        r6 = (double) r3;
        r1 = r0.height;
        r10 = (double) r1;
        r6 = r6 / r10;
        r4 = java.lang.Math.min(r4, r6);
        r6 = (double) r2;
        r1 = r0.width;
        r10 = (double) r1;
        r6 = r6 / r10;
        r10 = (double) r3;
        r1 = r0.height;
        r12 = (double) r1;
        r10 = r10 / r12;
        r6 = java.lang.Math.max(r6, r10);
        r1 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x0205 }
        r1.<init>();	 Catch:{ RuntimeException -> 0x0205 }
        r9 = z;	 Catch:{ RuntimeException -> 0x0205 }
        r10 = 22;
        r9 = r9[r10];	 Catch:{ RuntimeException -> 0x0205 }
        r1 = r1.append(r9);	 Catch:{ RuntimeException -> 0x0205 }
        r1 = r1.append(r4);	 Catch:{ RuntimeException -> 0x0205 }
        r9 = z;	 Catch:{ RuntimeException -> 0x0205 }
        r10 = 18;
        r9 = r9[r10];	 Catch:{ RuntimeException -> 0x0205 }
        r1 = r1.append(r9);	 Catch:{ RuntimeException -> 0x0205 }
        r1 = r1.append(r6);	 Catch:{ RuntimeException -> 0x0205 }
        r1 = r1.toString();	 Catch:{ RuntimeException -> 0x0205 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ RuntimeException -> 0x0205 }
        r10 = r6 / r4;
        r12 = 4607632778762754458; // 0x3ff199999999999a float:-1.5881868E-23 double:1.1;
        r1 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r1 <= 0) goto L_0x0209;
    L_0x0153:
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ RuntimeException -> 0x0207 }
        r9 = 9;
        if (r1 < r9) goto L_0x0209;
    L_0x0159:
        r1 = r0.width;
        r6 = (double) r1;
        r6 = r6 * r4;
        r6 = (int) r6;
        r1 = r0.height;
        r10 = (double) r1;
        r4 = r4 * r10;
        r1 = (int) r4;
        if (r8 == 0) goto L_0x0210;
    L_0x0165:
        r4 = (double) r2;
        r1 = r0.height;
        r6 = (double) r1;
        r4 = r4 / r6;
        r6 = (double) r3;
        r1 = r0.width;
        r8 = (double) r1;
        r6 = r6 / r8;
        r4 = java.lang.Math.min(r4, r6);
        r6 = (double) r2;
        r1 = r0.height;
        r8 = (double) r1;
        r6 = r6 / r8;
        r2 = (double) r3;
        r1 = r0.width;
        r8 = (double) r1;
        r2 = r2 / r8;
        r2 = java.lang.Math.max(r6, r2);
        r1 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x020c }
        r1.<init>();	 Catch:{ RuntimeException -> 0x020c }
        r6 = z;	 Catch:{ RuntimeException -> 0x020c }
        r7 = 19;
        r6 = r6[r7];	 Catch:{ RuntimeException -> 0x020c }
        r1 = r1.append(r6);	 Catch:{ RuntimeException -> 0x020c }
        r1 = r1.append(r4);	 Catch:{ RuntimeException -> 0x020c }
        r6 = z;	 Catch:{ RuntimeException -> 0x020c }
        r7 = 24;
        r6 = r6[r7];	 Catch:{ RuntimeException -> 0x020c }
        r1 = r1.append(r6);	 Catch:{ RuntimeException -> 0x020c }
        r1 = r1.append(r2);	 Catch:{ RuntimeException -> 0x020c }
        r1 = r1.toString();	 Catch:{ RuntimeException -> 0x020c }
        com.whatsapp.util.Log.i(r1);	 Catch:{ RuntimeException -> 0x020c }
        r6 = r2 / r4;
        r8 = 4607632778762754458; // 0x3ff199999999999a float:-1.5881868E-23 double:1.1;
        r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r1 <= 0) goto L_0x01bb;
    L_0x01b4:
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ RuntimeException -> 0x020e }
        r6 = 9;
        if (r1 < r6) goto L_0x01bb;
    L_0x01ba:
        r2 = r4;
    L_0x01bb:
        r1 = r0.height;
        r4 = (double) r1;
        r4 = r4 * r2;
        r1 = (int) r4;
        r0 = r0.width;
        r4 = (double) r0;
        r2 = r2 * r4;
        r0 = (int) r2;
    L_0x01c5:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 16;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r1);
        r3 = "x";
        r2 = r2.append(r3);
        r2 = r2.append(r0);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r14.setMeasuredDimension(r1, r0);
        goto L_0x0010;
    L_0x01ef:
        r0 = 0;
        goto L_0x0072;
    L_0x01f2:
        r4 = r2;
        goto L_0x0075;
    L_0x01f5:
        r0 = r3;
        goto L_0x0078;
    L_0x01f8:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x01fa }
    L_0x01fa:
        r0 = move-exception;
        throw r0;
    L_0x01fc:
        r1 = 0;
        r4 = r1;
        goto L_0x00fb;
    L_0x0200:
        r0 = move-exception;
        throw r0;
    L_0x0202:
        r1 = 0;
        goto L_0x0102;
    L_0x0205:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0207 }
    L_0x0207:
        r0 = move-exception;
        throw r0;
    L_0x0209:
        r4 = r6;
        goto L_0x0159;
    L_0x020c:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x020e }
    L_0x020e:
        r0 = move-exception;
        throw r0;
    L_0x0210:
        r0 = r1;
        r1 = r6;
        goto L_0x01c5;
    L_0x0213:
        r1 = r0;
        goto L_0x0036;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.CameraView.onMeasure(int, int):void");
    }

    static boolean a(CameraView cameraView) {
        return cameraView.g;
    }

    static boolean c(CameraView cameraView) {
        return cameraView.c;
    }

    public static Size a(List list, int i, int i2) {
        int i3 = CameraActivity.I;
        double d = ((double) i) / ((double) i2);
        if (list == null) {
            return null;
        }
        Size size;
        Size size2 = null;
        double d2 = Double.MAX_VALUE;
        for (Size size3 : list) {
            double abs;
            double d3 = ((double) size3.width) / ((double) size3.height);
            double d4 = ((double) size3.width) / ((double) i);
            try {
                if ((size3.width * size3.height >= 153600 || i3 != 0) && (d4 <= 1.5d || i3 != 0)) {
                    try {
                        if (Math.abs(d3 - d) <= 0.1d || i3 != 0) {
                            if (((double) Math.abs(size3.height - i2)) < d2) {
                                size = size3;
                                abs = (double) Math.abs(size3.height - i2);
                            } else {
                                double d5 = d2;
                                size = size2;
                                abs = d5;
                            }
                            if (i3 != 0) {
                                break;
                            }
                            size2 = size;
                            d2 = abs;
                        }
                    } catch (RuntimeException e) {
                        throw e;
                    }
                }
            } catch (RuntimeException e2) {
                throw e2;
            }
        }
        size = size2;
        if (size == null) {
            size2 = size;
            d2 = Double.MAX_VALUE;
            for (Size size32 : list) {
                if (((double) size32.width) / ((double) i) <= 1.5d || i3 != 0) {
                    if (((double) Math.abs(size32.height - i2)) < d2) {
                        size = size32;
                        abs = (double) Math.abs(size32.height - i2);
                    } else {
                        d5 = d2;
                        size = size2;
                        abs = d5;
                    }
                    if (i3 != 0) {
                        break;
                    }
                    size2 = size;
                    d2 = abs;
                }
            }
            size = size2;
        }
        if (size != null) {
            return size;
        }
        size2 = size;
        d2 = Double.MAX_VALUE;
        for (Size size322 : list) {
            if (((double) Math.abs(size322.height - i2)) < d2) {
                size = size322;
                abs = (double) Math.abs(size322.height - i2);
            } else {
                d5 = d2;
                size = size2;
                abs = d5;
            }
            if (i3 != 0) {
                return size;
            }
            size2 = size;
            d2 = abs;
        }
        return size2;
    }

    private void b() {
        try {
            if (this.l != null) {
                this.l.b();
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            this.s.onTouchEvent(motionEvent);
            if (this.q != null) {
                this.q.onTouchEvent(motionEvent);
            }
            return true;
        } catch (RuntimeException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int c() {
        /*
        r8 = this;
        r3 = 90;
        r1 = 1;
        r2 = 0;
        r4 = com.whatsapp.camera.CameraActivity.I;
        r0 = r8.getContext();
        r5 = z;
        r6 = 13;
        r5 = r5[r6];
        r0 = r0.getSystemService(r5);
        r0 = (android.view.WindowManager) r0;
        r5 = r0.getDefaultDisplay();
        r6 = r5.getOrientation();
        r8.g = r2;
        r0 = android.os.Build.VERSION.SDK_INT;
        r7 = 9;
        if (r0 < r7) goto L_0x003b;
    L_0x0026:
        r7 = new android.hardware.Camera$CameraInfo;
        r7.<init>();
        r0 = r8.f;	 Catch:{ RuntimeException -> 0x00a3 }
        android.hardware.Camera.getCameraInfo(r0, r7);	 Catch:{ RuntimeException -> 0x00a3 }
        r0 = r7.facing;	 Catch:{ RuntimeException -> 0x00a3 }
        if (r0 != r1) goto L_0x00a5;
    L_0x0034:
        r0 = r1;
    L_0x0035:
        r8.g = r0;
        r0 = r7.orientation;
        if (r4 == 0) goto L_0x00b6;
    L_0x003b:
        if (r6 == 0) goto L_0x0040;
    L_0x003d:
        r0 = 2;
        if (r6 != r0) goto L_0x004a;
    L_0x0040:
        r1 = r5.getWidth();
        r0 = r5.getHeight();
        if (r4 == 0) goto L_0x0052;
    L_0x004a:
        r1 = r5.getHeight();
        r0 = r5.getWidth();
    L_0x0052:
        if (r1 <= r0) goto L_0x0056;
    L_0x0054:
        if (r4 == 0) goto L_0x00b4;
    L_0x0056:
        r1 = r3;
    L_0x0057:
        switch(r6) {
            case 0: goto L_0x00a7;
            case 1: goto L_0x00a9;
            case 2: goto L_0x00ab;
            case 3: goto L_0x00af;
            default: goto L_0x005a;
        };
    L_0x005a:
        r0 = r8.g;
        if (r0 == 0) goto L_0x0066;
    L_0x005e:
        r0 = r1 + r2;
        r0 = r0 + 360;
        r0 = r0 % 360;
        if (r4 == 0) goto L_0x006c;
    L_0x0066:
        r0 = r1 - r2;
        r0 = r0 + 360;
        r0 = r0 % 360;
    L_0x006c:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = z;
        r5 = 15;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r2 = r3.append(r2);
        r3 = z;
        r4 = 12;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r1 = r2.append(r1);
        r2 = z;
        r3 = 14;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r0);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        return r0;
    L_0x00a3:
        r0 = move-exception;
        throw r0;
    L_0x00a5:
        r0 = r2;
        goto L_0x0035;
    L_0x00a7:
        if (r4 == 0) goto L_0x005a;
    L_0x00a9:
        if (r4 == 0) goto L_0x00b2;
    L_0x00ab:
        r2 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
        if (r4 == 0) goto L_0x005a;
    L_0x00af:
        r2 = 270; // 0x10e float:3.78E-43 double:1.334E-321;
        goto L_0x005a;
    L_0x00b2:
        r2 = r3;
        goto L_0x005a;
    L_0x00b4:
        r1 = r2;
        goto L_0x0057;
    L_0x00b6:
        r1 = r0;
        goto L_0x0057;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.CameraView.c():int");
    }

    static void j(CameraView cameraView) {
        cameraView.h();
    }

    static Camera e(CameraView cameraView) {
        return cameraView.d;
    }

    private void f() {
        try {
            if (this.k != null) {
                this.k.reset();
                this.k.release();
                this.k = null;
                this.d.lock();
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    private List d() {
        Log.i(z[arj.Theme_spinnerStyle]);
        List arrayList = new ArrayList();
        Camera camera = this.d;
        camera.getClass();
        arrayList.add(new Size(camera, 640, 480));
        return arrayList;
    }

    public int i() {
        return this.o;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.enable();
    }

    static {
        String[] strArr = new String[111];
        String str = "$ \r$\u000b\u001d!\u00033\u0006";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case v.m /*0*/:
                        i4 = 66;
                        break;
                    case at.g /*1*/:
                        i4 = 76;
                        break;
                    case at.i /*2*/:
                        i4 = arj.Theme_spinnerStyle;
                        break;
                    case at.o /*3*/:
                        i4 = 87;
                        break;
                    default:
                        i4 = 99;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "!-\u00012\u0011#\u0013\u00059\u0007'4";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "!#\u0001y\u0014*-\u0018$\u00022<3'\u0011'*\t%\u0006,/\t$";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "2%\u000f#\u00160)34\u0002. \u000e6\u0000)l\u0005$C,9\u0000;";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "!-\u00012\u0011#:\u00052\u0014m8\r<\u00062%\u000f#\u00160)L1\u0002+ \t3";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "!-\u00012\u0011#:\u00052\u0014m8\r<\u00062%\u000f#\u00160)L4\u0002/)\u001e6C+?L9\u0016. ";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "!-\u00012\u0011#:\u00052\u0014m8\r<\u00062%\u000f#\u00160)C$\u0017#>\u0018";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "!-\u00012\u0011#:\u00052\u0014m?\u0019%\u0005#/\t4\u000b#\"\u000b2\u0007xl\u00028C19\u001e1\u0002!)";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "!-\u00012\u0011#:\u00052\u0014m9\u001c3\u00026)/6\u000e'>\r\u0007\u0011':\u00052\u0014b";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "!-\u00012\u0011#:\u00052\u0014m?\u0019%\u0005#/\t4\u000b#\"\u000b2\u0007xl\u00028C!-\u00012\u0011#";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "!-\u00012\u0011#:\u00052\u0014m9\u001c3\u00026)/6\u000e'>\r\u0007\u0011':\u00052\u0014xl\t%\u0011->L$\u000668\u00059\u0004b<\u001e2\u0015+)\u001bw\u0007+?\u001c;\u0002;";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "b/\r:\u00060-V";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "5%\u00023\f5";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "b>\u0003#\u00026)V";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "!-\u00012\u0011#:\u00052\u0014m#\u001e>\u0006,8\r#\n-\"L3\n1<\u00006\u001ax";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "!-\u00012\u0011#:\u00052\u0014m!\t6\u00107>\tw\u0011'?\u0019;\u0017x";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "5%\u00023\f5";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = "b?\u000f6\u000f'\u0013\u00016\u001bx";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "!-\u00012\u0011#:\u00052\u0014m!\t6\u00107>\tw\f28\u0005:\u0002.<\u001e2\u0015+)\u001b$\n8)L$\u0000# \t\b\u000e+\"V";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "b!\t6\u00107>\t3Y";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = "!-\u00012\u0011#:\u00052\u0014m!\t6\u00107>\tx\u00130)\u001a>\u00065?\u0005-\u00061l";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = "!-\u00012\u0011#:\u00052\u0014m!\t6\u00107>\tw\f28\u0005:\u0002.<\u001e2\u0015+)\u001b$\n8)L$\u0000# \t\b\u000e+\"V";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "b-\u001f'\u0006!8L3\n$*V";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = "b?\u000f6\u000f'\u0013\u00016\u001bx";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = "!-\u00012\u0011#:\u00052\u0014m!\t6\u00107>\tw\f28\u0005:\u0002.<\u001e2\u0015+)\u001b$\n8)V";
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = "!-\u00012\u0011#:\u00052\u0014m?\u00186\u00116:\u00053\u0006-/\r'\u00177>\tw\u0005#%\u00002\u0007";
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i2] = str;
                    i2 = 27;
                    str = "!-\u00012\u0011#:\u00052\u0014m?\u00186\u00116l\u001a>\u0007'#";
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i2] = str;
                    i2 = 28;
                    str = "!-\u00012\u0011#:\u00052\u0014m?\u00186\u00116:\u00053\u0006-/\r'\u00177>\tw\u0005#%\u00002\u0007";
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    str = "b*\u001e8\r6v";
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i2] = str;
                    i2 = 30;
                    str = "!-\u00012\u0011#:\u00052\u0014m?\u00186\u00116<\u001e2\u0015+)\u001bw\r-l\u00168\f/";
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i2] = str;
                    i2 = 31;
                    str = "!#\u0002#\n,9\u0003\"\u0010o<\u00054\u00177>\t";
                    i = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i2] = str;
                    i2 = 32;
                    str = "!#\u0002#\n,9\u0003\"\u0010o<\u00054\u00177>\t";
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i2] = str;
                    i2 = 33;
                    str = "!-\u00012\u0011#:\u00052\u0014m?\u00186\u00116<\u001e2\u0015+)\u001bw\f28\u0005:\u0002.l\u001c%\u00064%\t C1%\u00162Y";
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i2] = str;
                    i2 = 34;
                    str = "!-\u00012\u0011#:\u00052\u0014m?\u00186\u00116<\u001e2\u0015+)\u001bw\u0007+?\u001c;\u0002;v";
                    i = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i2] = str;
                    i2 = 35;
                    str = "!-\u00012\u0011#:\u00052\u0014m?\u00186\u00116<\u001e2\u0015+)\u001bw\u0010'8L1\u000f#?\u0004w\u000e-(\tm";
                    i = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i2] = str;
                    i2 = 36;
                    str = "b/\r:\u00060-V";
                    i = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i2] = str;
                    i2 = 37;
                    str = "->\u00052\r6-\u0018>\f,";
                    i = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i2] = str;
                    i2 = 38;
                    str = "2#\u001e#\u0011#%\u0018";
                    i = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i2] = str;
                    i2 = 39;
                    str = "!-\u00012\u0011#:\u00052\u0014m?\u00186\u00116<\u001e2\u0015+)\u001bw\u00107<\u001c8\u00116)\bw\u0005.-\u001f?Y";
                    i = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i2] = str;
                    i2 = 40;
                    str = "!-\u00012\u0011#:\u00052\u0014m?\u00186\u00116<\u001e2\u0015+)\u001bw\u0019-#\u0001w\u0011#8\u00058\u0010x";
                    i = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i2] = str;
                    i2 = 41;
                    str = "!-\u00012\u0011#:\u00052\u0014m?\u00186\u00116<\u001e2\u0015+)\u001bw\u0000#!\t%\u0002b%\u001fw\r7 \u0000";
                    i = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i2] = str;
                    i2 = 42;
                    str = "b<\u001e2\u0015+)\u001bm";
                    i = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i2] = str;
                    i2 = 43;
                    str = "!-\u00012\u0011#:\u00052\u0014m?\u00186\u00116<\u001e2\u0015+)\u001bw\u0013+/\u0018\"\u0011'l\u001f>\u0019'l";
                    i = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i2] = str;
                    i2 = 44;
                    str = "!-\u00012\u0011#:\u00052\u0014m?\u00186\u00116<\u001e2\u0015+)\u001bw\u000e#43-\f-!V";
                    i = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i2] = str;
                    i2 = 45;
                    str = "!-\u00012\u0011#:\u00052\u0014m?\u00186\u00116<\u001e2\u0015+)\u001bw\u00107<\u001c8\u00116)\bw\u0005.-\u001f?Y,9\u0000;";
                    i = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i2] = str;
                    i2 = 46;
                    str = "0#\u00186\u0017+#\u0002";
                    i = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i2] = str;
                    i2 = 47;
                    str = "!-\u00012\u0011#:\u00052\u0014m?\u00186\u00116<\u001e2\u0015+)\u001bx\u0010'8\b>\u00102 \r.\f0%\t9\u0017#8\u00058\rb";
                    i = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i2] = str;
                    i2 = 48;
                    str = "1-\u0001$\u0016,+";
                    i = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i2] = str;
                    i2 = 49;
                    str = ".-\u00023\u0010!-\u001c2";
                    i = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i2] = str;
                    i2 = 50;
                    str = "!-\u00012\u0011#:\u00052\u0014m?\u00186\u00116<\u001e2\u0015+)\u001bw\u00107<\u001c8\u00116)\bw\u0005-/\u0019$Y";
                    i = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i2] = str;
                    i2 = 51;
                    str = "!-\u00012\u0011#:\u00052\u0014m?\u00186\u00116<\u001e2\u0015+)\u001bw\u00107<\u001c8\u00116)\bw\u0005-/\u0019$Y,9\u0000;";
                    i = 50;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i2] = str;
                    i2 = 52;
                    str = "!-\u00012\u0011#:\u00052\u0014m?\u00186\u00116<\u001e2\u0015+)\u001bw\u0013+/\u0018\"\u0011'?\u0005-\u00061v";
                    i = 51;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i2] = str;
                    i2 = 53;
                    str = "!-\u00012\u0011#:\u00052\u0014m?\u00188\u0013!-\u00012\u0011#l\t%\u0011->L$\u0017-<\u001c>\r%l\u000f6\u000e'>\rw\u00130)\u001a>\u00065";
                    i = 52;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i2] = str;
                    i2 = 54;
                    str = "!-\u00012\u0011#:\u00052\u0014m?\u00188\u0013!-\u00012\u0011#l\t%\u0011->L%\u0006.)\r$\u0006+\"\u000bw\u0000#!\t%\u0002";
                    i = 53;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i2] = str;
                    i2 = 55;
                    str = "!-\u00012\u0011#:\u00052\u0014m?\u00188\u0013!-\u00012\u0011#";
                    i = 54;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i2] = str;
                    i2 = 56;
                    str = "!#\u0001y\u0014*-\u0018$\u00022<3'\u0011'*\t%\u0006,/\t$";
                    i = 55;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i2] = str;
                    i2 = 57;
                    str = "!-\u00012\u0011#:\u00052\u0014m\"\t/\u0017b*\u00006\u0010*l\u00018\u0007'v";
                    i = 56;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i2] = str;
                    i2 = 58;
                    str = "$ \r$\u000b\u001d!\u00033\u0006";
                    i = 57;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i2] = str;
                    i2 = 59;
                    str = "-\"";
                    i = 58;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i2] = str;
                    i2 = 60;
                    str = "#9\u00188";
                    i = 59;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i2] = str;
                    i2 = 61;
                    str = "#9\u00188";
                    i = 60;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i2] = str;
                    i2 = 62;
                    str = "-*\n";
                    i = 61;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i2] = str;
                    i2 = 63;
                    str = "-\"";
                    i = 62;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i2] = str;
                    i2 = 64;
                    str = "-*\n";
                    i = 63;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i2] = str;
                    i2 = 65;
                    str = "nl";
                    i = 64;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i2] = str;
                    i2 = 66;
                    str = "!-\u00012\u0011#:\u00052\u0014m?\u00188\u00134%\b2\f!-\u001c#\u00160)L";
                    i = 65;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr2[i2] = str;
                    i2 = 67;
                    str = "!-\u00012\u0011#:\u00052\u0014m?\u00186\u00116/\r:\u00060-L2\u00110#\u001ew\f2)\u0002>\r%l\u000f6\u000e'>\r";
                    i = 66;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    strArr2[i2] = str;
                    i2 = 68;
                    str = "!-\u00012\u0011#:\u00052\u0014m?\u00186\u00116/\r:\u00060-L2\u00110#\u001ew\u0011'/\u00039\r'/\u0018>\r%l\u000f6\u000e'>\r";
                    i = 67;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    strArr2[i2] = str;
                    i2 = 69;
                    str = "!-\u00012\u00114%\t L0)\u000f8\u0011&\u0013\r\"\u0007+#L3\u0006,%\t3C5%\u0000;C0)\u000f8\u0011&l\u001b>\u0017*#\u0019#C1#\u00199\u0007l";
                    i = 68;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    strArr2[i2] = str;
                    i2 = 70;
                    str = "b:\u00053\u0006-\u000f\u00033\u0006!v";
                    i = 69;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeight /*69*/:
                    strArr2[i2] = str;
                    i2 = 71;
                    str = "!-\u00012\u0011#:\u00052\u0014ml\u000f6\r,#\u0018w\u0005+\"\bw\u0015+(\t8C1%\u00162";
                    i = 70;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightSmall /*70*/:
                    strArr2[i2] = str;
                    i2 = 72;
                    str = "!-\u00012\u0011#:\u00052\u0014m<\u001e2\u0013#>\t!\n&)\u0003w\u00050#\u0002#Y";
                    i = 71;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightLarge /*71*/:
                    strArr2[i2] = str;
                    i2 = 73;
                    str = "+\"\n>\r+8\u0015";
                    i = 72;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingLeft /*72*/:
                    strArr2[i2] = str;
                    i2 = 74;
                    str = "+\"\n>\r+8\u0015";
                    i = 73;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingRight /*73*/:
                    strArr2[i2] = str;
                    i2 = 75;
                    str = "!-\u00012\u0011#:\u00052\u0014ml\u001f\"\u00132#\u001e#\u0006&l\n8\u00007?V";
                    i = 74;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropDownListViewStyle /*74*/:
                    strArr2[i2] = str;
                    i2 = 76;
                    str = "1-\u0001$\u0016,+";
                    i = 75;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPopupWindowStyle /*75*/:
                    strArr2[i2] = str;
                    i2 = 77;
                    str = "b:\u00053\u0006-\u000e\u0005#1#8\tm";
                    i = 76;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItem /*76*/:
                    strArr2[i2] = str;
                    i2 = 78;
                    str = "!-\u00012\u0011#:\u00052\u0014ml\u001c%\f$%\u00002Y";
                    i = 77;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItemSmall /*77*/:
                    strArr2[i2] = str;
                    i2 = 79;
                    str = "!-\u00012\u0011#:\u00052\u0014ml\u0019$\u0006b<\u001e2\u0005'>\u001e2\u0007b:\u00053\u0006-l\u001f>\u0019'";
                    i = 78;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelBackground /*78*/:
                    strArr2[i2] = str;
                    i2 = 80;
                    str = "b<\u001e2\u0015+)\u001bm";
                    i = 79;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListWidth /*79*/:
                    strArr2[i2] = str;
                    i2 = 81;
                    str = "!-\u00012\u0011#:\u00052\u0014mlL2\u00110#\u001ew\u0010'8\u0018>\r%l\u001c%\u00064%\t C&%\u001f'\u000f#5";
                    i = 80;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListTheme /*80*/:
                    strArr2[i2] = str;
                    i2 = 82;
                    str = "!-\u00012\u0011#:\u00052\u0014ml\u001f\"\u00132#\u001e#\u0006&l\u001c%\u00064%\t C1%\u00162\u0010x";
                    i = 81;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listChoiceBackgroundIndicator /*81*/:
                    strArr2[i2] = str;
                    i2 = 83;
                    str = "!-\u00012\u0011#:\u00052\u0014ml\u0019$\u0006b<\u001e8\u0005+ \tm";
                    i = 82;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimary /*82*/:
                    strArr2[i2] = str;
                    i2 = 84;
                    str = "!-\u00012\u0011#:\u00052\u0014ml\u001f\"\u00132#\u001e#\u0006&l\n8\u00007?Vw\r7 \u0000";
                    i = 83;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimaryDark /*83*/:
                    strArr2[i2] = str;
                    i2 = 85;
                    str = "!-\u00012\u0011#:\u00052\u0014ml\u000f6\r,#\u0018w\u0005+\"\bw\u00130)\u001a>\u00065l\u001f>\u0019'l\u0018?\u00026l\u0005$C.-\u001e0\u00060l\u0018?\u0002,l\u001a>\u0007'#";
                    i = 84;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorAccent /*84*/:
                    strArr2[i2] = str;
                    i2 = 86;
                    str = "b:\u00053\u0006-\n\u001e6\u000e'\u001e\r#\u0006x";
                    i = 85;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlNormal /*85*/:
                    strArr2[i2] = str;
                    i2 = 87;
                    str = "!-\u00012\u0011#:\u00052\u0014ml\u000f6\r,#\u0018w\u0005+\"\bw\u00130)\u001a>\u00065l\u001f>\u0019'";
                    i = 86;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlActivated /*86*/:
                    strArr2[i2] = str;
                    i2 = 88;
                    str = "!#\u0002#\n,9\u0003\"\u0010o:\u00053\u0006-";
                    i = 87;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlHighlight /*87*/:
                    strArr2[i2] = str;
                    i2 = 89;
                    str = "!-\u00012\u0011#:\u00052\u0014ml\u001e2\u00106-\u001e#C2>\t!\n';";
                    i = 88;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorButtonNormal /*88*/:
                    strArr2[i2] = str;
                    i2 = 90;
                    str = "!-\u00012\u0011#:\u00052\u0014ml\u001f\"\u00132#\u001e#\u0006&l\u001a>\u0007'#L$\n8)\u001fm";
                    i = 89;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorSwitchThumbNormal /*89*/:
                    strArr2[i2] = str;
                    i2 = 91;
                    str = "!-\u00012\u0011#:\u00052\u0014ml\u00028C2>\u00031\n.)";
                    i = 90;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_controlBackground /*90*/:
                    strArr2[i2] = str;
                    i2 = 92;
                    str = "b-\u00193\n-\u000f\u00033\u0006!v";
                    i = 91;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogStyle /*91*/:
                    strArr2[i2] = str;
                    i2 = 93;
                    str = "b:\u00053\u0006-\u000e\u0005#1#8\tm";
                    i = 92;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogButtonGroupStyle /*92*/:
                    strArr2[i2] = str;
                    i2 = 94;
                    str = "!-\u0001\b\u000e-(\t";
                    i = 93;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogCenterButtons /*93*/:
                    strArr2[i2] = str;
                    i2 = 95;
                    str = "!#\u0002#\n,9\u0003\"\u0010o:\u00053\u0006-";
                    i = 94;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogTheme /*94*/:
                    strArr2[i2] = str;
                    i2 = 96;
                    str = "b*\u0005;\u0006\u0004#\u001e:\u00026v";
                    i = 95;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorAlertDialogListItem /*95*/:
                    strArr2[i2] = str;
                    i2 = 97;
                    str = "!-\u00012\u0011#:\u00052\u0014ml\u00028C19\u001c'\f08\t3C4%\b2\fb?\u0005-\u00061";
                    i = 96;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarPositiveButtonStyle /*96*/:
                    strArr2[i2] = str;
                    i2 = 98;
                    str = "#\"\b%\f+(B'\u00060!\u0005$\u0010+#\u0002y1\u0007\u000f#\u0005'\u001d\r9\u0013*\r";
                    i = 97;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNegativeButtonStyle /*97*/:
                    strArr2[i2] = str;
                    i2 = 99;
                    str = "#\"\b%\f+(B'\u00060!\u0005$\u0010+#\u0002y1\u0007\u000f#\u0005'\u001d\r9\u0013*\r";
                    i = 98;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNeutralButtonStyle /*98*/:
                    strArr2[i2] = str;
                    i2 = 100;
                    str = "!-\u00012\u0011#:\u00052\u0014ml\u001c%\u0006$)\u001e%\u0006&l\u001a>\u0007'#L'\u0011':\u00052\u0014b?\u0005-\u0006x";
                    i = 99;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_autoCompleteTextViewStyle /*99*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_buttonStyleSmall;
                    str = "!-\u00012\u0011#:\u00052\u0014ml\u001c%\u0006$)\u001e%\u0006&l\u001a>\u0007'#L'\u0011':\u00052\u0014b?\u0005-\u0006b%\u001fw\r7 \u0000";
                    i = 100;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyle /*100*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_checkboxStyle;
                    str = "\n\u0018/";
                    i = arj.Theme_buttonStyleSmall;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyleSmall /*101*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_checkedTextViewStyle;
                    str = "!-\u00012\u0011#\u0013\u00059\u0007'4";
                    i = arj.Theme_checkboxStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_checkboxStyle /*102*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_editTextStyle;
                    str = "!#\u0001y\u0014*-\u0018$\u00022<3'\u0011'*\t%\u0006,/\t$";
                    i = arj.Theme_checkedTextViewStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_checkedTextViewStyle /*103*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_radioButtonStyle;
                    str = "!-\u00012\u0011#:\u00052\u0014m\"\t/\u0017!-\u00012\u0011#l\t%\u0011->L$\u000668\u00059\u0004b<\u001e2\u0015+)\u001bw\u0007+?\u001c;\u0002;";
                    i = arj.Theme_editTextStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextStyle /*104*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_ratingBarStyle;
                    str = "!-\u00012\u0011#:\u00052\u0014m\"\t/\u0017!-\u00012\u0011#";
                    i = arj.Theme_radioButtonStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_radioButtonStyle /*105*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_seekBarStyle;
                    str = "!-\u00012\u0011#:\u00052\u0014m\"\t/\u0017!-\u00012\u0011#l";
                    i = arj.Theme_ratingBarStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_ratingBarStyle /*106*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_spinnerStyle;
                    str = "!-\u00012\u0011#:\u00052\u0014m*\r;\u000f -\u000f<\u00107<\u001c8\u00116)\b'\u0011':\u00052\u00141%\u00162\u0010";
                    i = arj.Theme_seekBarStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_seekBarStyle /*107*/:
                    strArr2[i2] = str;
                    i2 = arj.Theme_switchStyle;
                    str = "#9\u00188";
                    i = arj.Theme_spinnerStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerStyle /*108*/:
                    strArr2[i2] = str;
                    i2 = 110;
                    str = "#9\u00188";
                    i = arj.Theme_switchStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_switchStyle /*109*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    strArr = new String[11];
                    str = "\u0005\u0018A\u001eZw|Y";
                    i = 110;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case 110:
                    strArr2[i2] = str;
                    str = "\u0005\u0018A\u001eZw|Z";
                    i = 111;
                    i2 = 1;
                    strArr2 = strArr3;
                    break;
                case 111:
                    strArr2[i2] = str;
                    str = "\u0005\u0018A\u001eZw|Y\u0010";
                    i = 112;
                    i2 = 2;
                    strArr2 = strArr3;
                    break;
                case 112:
                    strArr2[i2] = str;
                    str = "\u0011\u000b$z*q\u007f[";
                    i = 113;
                    i2 = 3;
                    strArr2 = strArr3;
                    break;
                case 113:
                    strArr2[i2] = str;
                    str = "\u0011\u000b$z.{}U";
                    i = 114;
                    i2 = 4;
                    strArr2 = strArr3;
                    break;
                case 114:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "\u0011\u000f$z*wxY";
                    i = 115;
                    strArr2 = strArr3;
                    break;
                case 115:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "\u0011\u001c$z/u~\\";
                    i = 116;
                    strArr2 = strArr3;
                    break;
                case 116:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "\u0011\u000f$z1{{\\";
                    i = 117;
                    strArr2 = strArr3;
                    break;
                case 117:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "\u0005\u0018A\u001eZw|T";
                    i = 118;
                    strArr2 = strArr3;
                    break;
                case 118:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "\u0011\u000b$z-rxY";
                    i = 119;
                    strArr2 = strArr3;
                    break;
                case 119:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "\u0011\u000fAgW\u0007";
                    i = 120;
                    strArr2 = strArr3;
                    break;
                case 120:
                    strArr2[i2] = str;
                    p = strArr3;
                    strArr = new String[3];
                    str = "\u0005\u0018A\u001eZsuY";
                    i = 121;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i2 = 0;
                    break;
                case 121:
                    strArr2[i2] = str;
                    str = "\u0005\u0018A\u001eZsu\\";
                    i = 122;
                    i2 = 1;
                    strArr2 = strArr3;
                    break;
                case 122:
                    strArr2[i2] = str;
                    str = "\u0005\u0018A\u001eZsu^";
                    i = 123;
                    i2 = 2;
                    strArr2 = strArr3;
                    break;
                case 123:
                    strArr2[i2] = str;
                    t = strArr3;
                    return;
                default:
                    strArr2[i2] = str;
                    str = "5%\u00023\f5";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public int setZoomLevel(int i) {
        try {
            if (i > this.o) {
                return 0;
            }
            try {
                if (VERSION.SDK_INT < 8) {
                    return 0;
                }
                Parameters parameters = this.d.getParameters();
                try {
                    parameters.setZoom(i);
                    this.d.setParameters(parameters);
                    if (this.r == null) {
                        return 0;
                    }
                    if (this.r.size() >= i) {
                        return ((Integer) this.r.get(i)).intValue();
                    }
                    return 0;
                } catch (RuntimeException e) {
                    throw e;
                } catch (RuntimeException e2) {
                    throw e2;
                }
            } catch (RuntimeException e22) {
                throw e22;
            }
        } catch (RuntimeException e222) {
            throw e222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean b(java.io.File r25, int r26) {
        /*
        r24 = this;
        r13 = com.whatsapp.camera.CameraActivity.I;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 72;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r24;
        r3 = r0.g;
        r2 = r2.append(r3);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r2 = new android.media.MediaRecorder;
        r2.<init>();
        r0 = r24;
        r0.k = r2;
        r2 = 0;
        r3 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IOException -> 0x0057 }
        r4 = 8;
        if (r3 < r4) goto L_0x048a;
    L_0x0030:
        r2 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IOException -> 0x0057 }
        r3 = 11;
        if (r2 < r3) goto L_0x007a;
    L_0x0036:
        r0 = r24;
        r2 = r0.f;	 Catch:{ IOException -> 0x0059 }
        r3 = 4;
        r2 = android.media.CamcorderProfile.hasProfile(r2, r3);	 Catch:{ IOException -> 0x0059 }
        if (r2 == 0) goto L_0x005b;
    L_0x0041:
        r0 = r24;
        r2 = r0.f;
        r3 = 4;
        r9 = android.media.CamcorderProfile.get(r2, r3);
    L_0x004a:
        if (r9 != 0) goto L_0x0092;
    L_0x004c:
        r2 = z;	 Catch:{ IOException -> 0x0090 }
        r3 = 91;
        r2 = r2[r3];	 Catch:{ IOException -> 0x0090 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IOException -> 0x0090 }
        r2 = 0;
    L_0x0056:
        return r2;
    L_0x0057:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0059 }
    L_0x0059:
        r2 = move-exception;
        throw r2;
    L_0x005b:
        r0 = r24;
        r2 = r0.f;
        r3 = 5;
        r2 = android.media.CamcorderProfile.hasProfile(r2, r3);
        if (r2 == 0) goto L_0x0070;
    L_0x0066:
        r0 = r24;
        r2 = r0.f;
        r3 = 5;
        r9 = android.media.CamcorderProfile.get(r2, r3);
        goto L_0x004a;
    L_0x0070:
        r0 = r24;
        r2 = r0.f;
        r3 = 1;
        r9 = android.media.CamcorderProfile.get(r2, r3);
        goto L_0x004a;
    L_0x007a:
        r2 = android.os.Build.VERSION.SDK_INT;
        r3 = 9;
        if (r2 < r3) goto L_0x008a;
    L_0x0080:
        r0 = r24;
        r2 = r0.f;
        r3 = 1;
        r9 = android.media.CamcorderProfile.get(r2, r3);
        goto L_0x004a;
    L_0x008a:
        r2 = 1;
        r9 = android.media.CamcorderProfile.get(r2);
        goto L_0x004a;
    L_0x0090:
        r2 = move-exception;
        throw r2;
    L_0x0092:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 78;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = r9.videoFrameWidth;
        r2 = r2.append(r3);
        r3 = "x";
        r2 = r2.append(r3);
        r3 = r9.videoFrameHeight;
        r2 = r2.append(r3);
        r3 = z;
        r4 = 70;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = r9.videoCodec;
        r2 = r2.append(r3);
        r3 = z;
        r4 = 92;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = r9.audioCodec;
        r2 = r2.append(r3);
        r3 = z;
        r4 = 96;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = r9.fileFormat;
        r2 = r2.append(r3);
        r3 = z;
        r4 = 86;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = r9.videoFrameRate;
        r2 = r2.append(r3);
        r3 = z;
        r4 = 93;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = r9.videoBitRate;
        r2 = r2.append(r3);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r0 = r24;
        r2 = r0.d;
        r14 = r2.getParameters();
        r2 = r14.getSupportedPreviewSizes();
        if (r2 != 0) goto L_0x060c;
    L_0x0119:
        r2 = r24.d();
        r3 = r2;
    L_0x011e:
        r2 = 0;
        r4 = android.os.Build.VERSION.SDK_INT;
        r5 = 11;
        if (r4 < r5) goto L_0x0129;
    L_0x0125:
        r2 = r14.getSupportedVideoSizes();
    L_0x0129:
        if (r2 != 0) goto L_0x0609;
    L_0x012b:
        r6 = r3;
    L_0x012c:
        if (r6 == 0) goto L_0x0134;
    L_0x012e:
        r2 = r6.isEmpty();	 Catch:{ IOException -> 0x0140 }
        if (r2 == 0) goto L_0x0144;
    L_0x0134:
        r2 = z;	 Catch:{ IOException -> 0x0142 }
        r3 = 97;
        r2 = r2[r3];	 Catch:{ IOException -> 0x0142 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IOException -> 0x0142 }
        r2 = 0;
        goto L_0x0056;
    L_0x0140:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0142 }
    L_0x0142:
        r2 = move-exception;
        throw r2;
    L_0x0144:
        r4 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r2 = 0;
        r5 = android.os.Build.VERSION.SDK_INT;
        r7 = 11;
        if (r5 < r7) goto L_0x0605;
    L_0x014e:
        r2 = r14.getPreferredPreviewSizeForVideo();
        if (r2 == 0) goto L_0x0190;
    L_0x0154:
        r5 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x022c }
        r5.<init>();	 Catch:{ IOException -> 0x022c }
        r7 = z;	 Catch:{ IOException -> 0x022c }
        r8 = 100;
        r7 = r7[r8];	 Catch:{ IOException -> 0x022c }
        r5 = r5.append(r7);	 Catch:{ IOException -> 0x022c }
        r7 = r2.width;	 Catch:{ IOException -> 0x022c }
        r5 = r5.append(r7);	 Catch:{ IOException -> 0x022c }
        r7 = "x";
        r5 = r5.append(r7);	 Catch:{ IOException -> 0x022c }
        r7 = r2.height;	 Catch:{ IOException -> 0x022c }
        r5 = r5.append(r7);	 Catch:{ IOException -> 0x022c }
        r5 = r5.toString();	 Catch:{ IOException -> 0x022c }
        com.whatsapp.util.Log.i(r5);	 Catch:{ IOException -> 0x022c }
        r5 = r2.width;	 Catch:{ IOException -> 0x022c }
        r7 = 176; // 0xb0 float:2.47E-43 double:8.7E-322;
        if (r5 != r7) goto L_0x0189;
    L_0x0183:
        r5 = r2.height;	 Catch:{ IOException -> 0x022e }
        r7 = 144; // 0x90 float:2.02E-43 double:7.1E-322;
        if (r5 == r7) goto L_0x0601;
    L_0x0189:
        r4 = r2.width;
        r5 = r2.height;
        r4 = r4 * r5;
        if (r13 == 0) goto L_0x0601;
    L_0x0190:
        r5 = z;	 Catch:{ IOException -> 0x0230 }
        r7 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        r5 = r5[r7];	 Catch:{ IOException -> 0x0230 }
        com.whatsapp.util.Log.w(r5);	 Catch:{ IOException -> 0x0230 }
        r5 = r4;
        r4 = r2;
    L_0x019b:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r7 = z;
        r8 = 90;
        r7 = r7[r8];
        r2 = r2.append(r7);
        r7 = a(r6);
        r2 = r2.append(r7);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r7 = z;
        r8 = 82;
        r7 = r7[r8];
        r2 = r2.append(r7);
        r7 = a(r3);
        r2 = r2.append(r7);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r2 = 0;
        r7 = r6.iterator();
        r6 = r2;
    L_0x01dd:
        r2 = r7.hasNext();
        if (r2 == 0) goto L_0x021e;
    L_0x01e3:
        r2 = r7.next();
        r2 = (android.hardware.Camera.Size) r2;
        r8 = r2.height;	 Catch:{ IOException -> 0x0232 }
        r10 = 480; // 0x1e0 float:6.73E-43 double:2.37E-321;
        if (r8 > r10) goto L_0x05fb;
    L_0x01ef:
        r8 = r2.width;	 Catch:{ IOException -> 0x0232 }
        r10 = 720; // 0x2d0 float:1.009E-42 double:3.557E-321;
        if (r8 > r10) goto L_0x05fb;
    L_0x01f5:
        r8 = r2.height;	 Catch:{ IOException -> 0x0234 }
        r10 = r9.videoFrameHeight;	 Catch:{ IOException -> 0x0234 }
        if (r8 > r10) goto L_0x05fb;
    L_0x01fb:
        r8 = r2.width;	 Catch:{ IOException -> 0x0236 }
        r10 = r9.videoFrameWidth;	 Catch:{ IOException -> 0x0236 }
        if (r8 > r10) goto L_0x05fb;
    L_0x0201:
        if (r6 != 0) goto L_0x0206;
    L_0x0203:
        if (r13 == 0) goto L_0x021b;
    L_0x0205:
        r6 = r2;
    L_0x0206:
        r8 = r2.height;	 Catch:{ IOException -> 0x023a }
        r10 = r6.height;	 Catch:{ IOException -> 0x023a }
        if (r8 <= r10) goto L_0x020f;
    L_0x020c:
        if (r13 == 0) goto L_0x021b;
    L_0x020e:
        r6 = r2;
    L_0x020f:
        r8 = r2.height;	 Catch:{ IOException -> 0x023c }
        r10 = r6.height;	 Catch:{ IOException -> 0x023c }
        if (r8 != r10) goto L_0x05fb;
    L_0x0215:
        r8 = r2.width;	 Catch:{ IOException -> 0x023e }
        r10 = r6.width;	 Catch:{ IOException -> 0x023e }
        if (r8 <= r10) goto L_0x05fb;
    L_0x021b:
        if (r13 == 0) goto L_0x05fe;
    L_0x021d:
        r6 = r2;
    L_0x021e:
        if (r6 != 0) goto L_0x0242;
    L_0x0220:
        r2 = z;	 Catch:{ IOException -> 0x0240 }
        r3 = 71;
        r2 = r2[r3];	 Catch:{ IOException -> 0x0240 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IOException -> 0x0240 }
        r2 = 0;
        goto L_0x0056;
    L_0x022c:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x022e }
    L_0x022e:
        r2 = move-exception;
        throw r2;
    L_0x0230:
        r2 = move-exception;
        throw r2;
    L_0x0232:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0234 }
    L_0x0234:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0236 }
    L_0x0236:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0238 }
    L_0x0238:
        r2 = move-exception;
        throw r2;
    L_0x023a:
        r2 = move-exception;
        throw r2;
    L_0x023c:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x023e }
    L_0x023e:
        r2 = move-exception;
        throw r2;
    L_0x0240:
        r2 = move-exception;
        throw r2;
    L_0x0242:
        r7 = 0;
        r8 = r3.iterator();
    L_0x0247:
        r2 = r8.hasNext();
        if (r2 == 0) goto L_0x05f8;
    L_0x024d:
        r2 = r8.next();
        r2 = (android.hardware.Camera.Size) r2;
        r10 = r6.equals(r2);
        if (r10 == 0) goto L_0x0247;
    L_0x0259:
        r0 = r24;
        r7 = r0.g;	 Catch:{ IOException -> 0x0361 }
        if (r7 == 0) goto L_0x05f5;
    L_0x025f:
        r7 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IOException -> 0x0361 }
        r8 = 17;
        if (r7 < r8) goto L_0x05f5;
    L_0x0265:
        r7 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IOException -> 0x0363 }
        r8 = 19;
        if (r7 > r8) goto L_0x05f5;
    L_0x026b:
        r7 = z;	 Catch:{ IOException -> 0x0365 }
        r8 = 76;
        r7 = r7[r8];	 Catch:{ IOException -> 0x0365 }
        r8 = android.os.Build.MANUFACTURER;	 Catch:{ IOException -> 0x0365 }
        r7 = r7.equals(r8);	 Catch:{ IOException -> 0x0365 }
        if (r7 == 0) goto L_0x05f5;
    L_0x0279:
        r7 = p;	 Catch:{ IOException -> 0x0367 }
        r8 = android.os.Build.MODEL;	 Catch:{ IOException -> 0x0367 }
        r7 = com.whatsapp.util.ax.a(r7, r8);	 Catch:{ IOException -> 0x0367 }
        if (r7 == 0) goto L_0x05f5;
    L_0x0283:
        r2 = new android.hardware.Camera$Size;
        r0 = r24;
        r6 = r0.d;
        r6.getClass();
        r7 = 1440; // 0x5a0 float:2.018E-42 double:7.115E-321;
        r8 = 1080; // 0x438 float:1.513E-42 double:5.336E-321;
        r2.<init>(r6, r7, r8);
        r6 = new android.hardware.Camera$Size;
        r0 = r24;
        r7 = r0.d;
        r7.getClass();
        r8 = 640; // 0x280 float:8.97E-43 double:3.16E-321;
        r10 = 480; // 0x1e0 float:6.73E-43 double:2.37E-321;
        r6.<init>(r7, r8, r10);
        r12 = r6;
    L_0x02a4:
        if (r2 != 0) goto L_0x05d1;
    L_0x02a6:
        r6 = 9218868437227405311; // 0x7fefffffffffffff float:NaN double:1.7976931348623157E308;
        r8 = r12.width;
        r10 = (double) r8;
        r8 = r12.height;
        r0 = (double) r8;
        r16 = r0;
        r16 = r10 / r16;
        r15 = r3.iterator();
        r8 = r2;
    L_0x02ba:
        r2 = r15.hasNext();
        if (r2 == 0) goto L_0x05f2;
    L_0x02c0:
        r2 = r15.next();
        r2 = (android.hardware.Camera.Size) r2;
        r10 = r2.width;	 Catch:{ IOException -> 0x0369 }
        r11 = r12.width;	 Catch:{ IOException -> 0x0369 }
        if (r10 < r11) goto L_0x05ec;
    L_0x02cc:
        r10 = r2.height;	 Catch:{ IOException -> 0x0369 }
        r11 = r12.height;	 Catch:{ IOException -> 0x0369 }
        if (r10 < r11) goto L_0x05ec;
    L_0x02d2:
        r10 = r2.height;	 Catch:{ IOException -> 0x036b }
        r11 = r2.width;	 Catch:{ IOException -> 0x036b }
        r10 = r10 * r11;
        if (r10 > r5) goto L_0x05ec;
    L_0x02d9:
        r10 = r2.width;
        r10 = (double) r10;
        r0 = r2.height;
        r18 = r0;
        r0 = r18;
        r0 = (double) r0;
        r18 = r0;
        r10 = r10 / r18;
        if (r8 != 0) goto L_0x02ed;
    L_0x02e9:
        if (r13 == 0) goto L_0x05ef;
    L_0x02eb:
        r6 = r10;
        r8 = r2;
    L_0x02ed:
        r18 = r16 - r10;
        r18 = java.lang.Math.abs(r18);	 Catch:{ IOException -> 0x036d }
        r20 = r16 - r6;
        r20 = java.lang.Math.abs(r20);	 Catch:{ IOException -> 0x036d }
        r18 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1));
        if (r18 >= 0) goto L_0x05ec;
    L_0x02fd:
        r6 = r10;
    L_0x02fe:
        if (r13 == 0) goto L_0x05e9;
    L_0x0300:
        if (r2 != 0) goto L_0x0348;
    L_0x0302:
        r8 = z;
        r10 = 85;
        r8 = r8[r10];
        com.whatsapp.util.Log.i(r8);
        r8 = r3.iterator();
        r3 = r2;
    L_0x0310:
        r2 = r8.hasNext();
        if (r2 == 0) goto L_0x05e6;
    L_0x0316:
        r2 = r8.next();
        r2 = (android.hardware.Camera.Size) r2;
        r10 = r2.height;
        r11 = r2.width;
        r10 = r10 * r11;
        if (r10 > r5) goto L_0x05db;
    L_0x0323:
        r10 = r2.width;
        r10 = (double) r10;
        r15 = r2.height;
        r0 = (double) r15;
        r18 = r0;
        r10 = r10 / r18;
        if (r3 != 0) goto L_0x0333;
    L_0x032f:
        if (r13 == 0) goto L_0x05e2;
    L_0x0331:
        r6 = r10;
        r3 = r2;
    L_0x0333:
        r18 = r16 - r10;
        r18 = java.lang.Math.abs(r18);	 Catch:{ IOException -> 0x036f }
        r20 = r16 - r6;
        r20 = java.lang.Math.abs(r20);	 Catch:{ IOException -> 0x036f }
        r15 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1));
        if (r15 >= 0) goto L_0x05db;
    L_0x0343:
        r6 = r2;
        r2 = r10;
    L_0x0345:
        if (r13 == 0) goto L_0x05d4;
    L_0x0347:
        r2 = r6;
    L_0x0348:
        if (r2 != 0) goto L_0x05d1;
    L_0x034a:
        r2 = z;
        r3 = 79;
        r2 = r2[r3];
        com.whatsapp.util.Log.i(r2);
    L_0x0353:
        if (r4 != 0) goto L_0x0373;
    L_0x0355:
        r2 = z;	 Catch:{ IOException -> 0x0371 }
        r3 = 87;
        r2 = r2[r3];	 Catch:{ IOException -> 0x0371 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IOException -> 0x0371 }
        r2 = 0;
        goto L_0x0056;
    L_0x0361:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0363 }
    L_0x0363:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0365 }
    L_0x0365:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0367 }
    L_0x0367:
        r2 = move-exception;
        throw r2;
    L_0x0369:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x036b }
    L_0x036b:
        r2 = move-exception;
        throw r2;
    L_0x036d:
        r2 = move-exception;
        throw r2;
    L_0x036f:
        r2 = move-exception;
        throw r2;
    L_0x0371:
        r2 = move-exception;
        throw r2;
    L_0x0373:
        r2 = r12.width;
        r9.videoFrameWidth = r2;
        r2 = r12.height;
        r9.videoFrameHeight = r2;
        r2 = r9.videoFrameWidth;
        r3 = r9.videoFrameHeight;
        r2 = r2 * r3;
        r2 = r2 * 4;
        r9.videoBitRate = r2;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r5 = 83;
        r3 = r3[r5];
        r2 = r2.append(r3);
        r3 = r9.videoFrameWidth;
        r2 = r2.append(r3);
        r3 = "x";
        r2 = r2.append(r3);
        r3 = r9.videoFrameHeight;
        r2 = r2.append(r3);
        r3 = z;
        r5 = 77;
        r3 = r3[r5];
        r2 = r2.append(r3);
        r3 = r9.videoBitRate;
        r2 = r2.append(r3);
        r3 = z;
        r5 = 80;
        r3 = r3[r5];
        r2 = r2.append(r3);
        r3 = r4.width;
        r2 = r2.append(r3);
        r3 = "x";
        r2 = r2.append(r3);
        r3 = r4.height;
        r2 = r2.append(r3);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r2 = z;
        r3 = 94;
        r2 = r2[r3];
        r3 = 1;
        r14.set(r2, r3);
        r2 = r14.getSupportedFocusModes();
        if (r2 == 0) goto L_0x043a;
    L_0x03ea:
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x058a }
        r3.<init>();	 Catch:{ IOException -> 0x058a }
        r5 = z;	 Catch:{ IOException -> 0x058a }
        r6 = 75;
        r5 = r5[r6];	 Catch:{ IOException -> 0x058a }
        r3 = r3.append(r5);	 Catch:{ IOException -> 0x058a }
        r5 = r2.toArray();	 Catch:{ IOException -> 0x058a }
        r5 = java.util.Arrays.deepToString(r5);	 Catch:{ IOException -> 0x058a }
        r3 = r3.append(r5);	 Catch:{ IOException -> 0x058a }
        r3 = r3.toString();	 Catch:{ IOException -> 0x058a }
        com.whatsapp.util.Log.i(r3);	 Catch:{ IOException -> 0x058a }
        r3 = z;	 Catch:{ IOException -> 0x058a }
        r5 = 88;
        r3 = r3[r5];	 Catch:{ IOException -> 0x058a }
        r3 = r2.contains(r3);	 Catch:{ IOException -> 0x058a }
        if (r3 == 0) goto L_0x0423;
    L_0x0418:
        r3 = z;	 Catch:{ IOException -> 0x058c }
        r5 = 95;
        r3 = r3[r5];	 Catch:{ IOException -> 0x058c }
        r14.setFocusMode(r3);	 Catch:{ IOException -> 0x058c }
        if (r13 == 0) goto L_0x0443;
    L_0x0423:
        r3 = z;	 Catch:{ IOException -> 0x058e }
        r5 = 73;
        r3 = r3[r5];	 Catch:{ IOException -> 0x058e }
        r2 = r2.contains(r3);	 Catch:{ IOException -> 0x058e }
        if (r2 == 0) goto L_0x0443;
    L_0x042f:
        r2 = z;	 Catch:{ IOException -> 0x0590 }
        r3 = 74;
        r2 = r2[r3];	 Catch:{ IOException -> 0x0590 }
        r14.setFocusMode(r2);	 Catch:{ IOException -> 0x0590 }
        if (r13 == 0) goto L_0x0443;
    L_0x043a:
        r2 = z;	 Catch:{ IOException -> 0x0592 }
        r3 = 84;
        r2 = r2[r3];	 Catch:{ IOException -> 0x0592 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IOException -> 0x0592 }
    L_0x0443:
        r0 = r24;
        r0.a = r4;	 Catch:{ IOException -> 0x0594 }
        r2 = r4.width;	 Catch:{ IOException -> 0x0594 }
        r3 = r4.height;	 Catch:{ IOException -> 0x0594 }
        r14.setPreviewSize(r2, r3);	 Catch:{ IOException -> 0x0594 }
        r0 = r24;
        r2 = r0.n;	 Catch:{ IOException -> 0x0594 }
        r2 = r4.equals(r2);	 Catch:{ IOException -> 0x0594 }
        if (r2 != 0) goto L_0x0596;
    L_0x0458:
        r2 = 1;
    L_0x0459:
        if (r2 == 0) goto L_0x0462;
    L_0x045b:
        r0 = r24;
        r3 = r0.d;	 Catch:{ IOException -> 0x0599 }
        r3.stopPreview();	 Catch:{ IOException -> 0x0599 }
    L_0x0462:
        r0 = r24;
        r3 = r0.d;	 Catch:{ IllegalStateException -> 0x059b }
        r3.setParameters(r14);	 Catch:{ IllegalStateException -> 0x059b }
        if (r2 == 0) goto L_0x0489;
    L_0x046b:
        r2 = z;	 Catch:{ IllegalStateException -> 0x059b }
        r3 = 89;
        r2 = r2[r3];	 Catch:{ IllegalStateException -> 0x059b }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IllegalStateException -> 0x059b }
        r0 = r24;
        r2 = r0.d;	 Catch:{ IOException -> 0x059d }
        r0 = r24;
        r3 = r0.m;	 Catch:{ IOException -> 0x059d }
        r2.setPreviewDisplay(r3);	 Catch:{ IOException -> 0x059d }
    L_0x047f:
        r0 = r24;
        r2 = r0.d;
        r2.startPreview();
        r24.requestLayout();
    L_0x0489:
        r2 = r9;
    L_0x048a:
        r0 = r24;
        r3 = r0.d;	 Catch:{ IOException -> 0x05a9 }
        r3.unlock();	 Catch:{ IOException -> 0x05a9 }
        r0 = r24;
        r3 = r0.k;	 Catch:{ IOException -> 0x05a9 }
        r0 = r24;
        r4 = r0.d;	 Catch:{ IOException -> 0x05a9 }
        r3.setCamera(r4);	 Catch:{ IOException -> 0x05a9 }
        r3 = com.whatsapp.App.p;	 Catch:{ IOException -> 0x05a9 }
        r4 = z;	 Catch:{ IOException -> 0x05a9 }
        r5 = 98;
        r4 = r4[r5];	 Catch:{ IOException -> 0x05a9 }
        r3 = r3.o(r4);	 Catch:{ IOException -> 0x05a9 }
        if (r3 != 0) goto L_0x04b4;
    L_0x04aa:
        r0 = r24;
        r3 = r0.k;	 Catch:{ IOException -> 0x05a9 }
        r4 = 5;
        r3.setAudioSource(r4);	 Catch:{ IOException -> 0x05a9 }
        if (r13 == 0) goto L_0x04bd;
    L_0x04b4:
        r3 = z;	 Catch:{ IOException -> 0x05ab }
        r4 = 69;
        r3 = r3[r4];	 Catch:{ IOException -> 0x05ab }
        com.whatsapp.util.Log.w(r3);	 Catch:{ IOException -> 0x05ab }
    L_0x04bd:
        r0 = r24;
        r3 = r0.k;	 Catch:{ IOException -> 0x05ad }
        r4 = 1;
        r3.setVideoSource(r4);	 Catch:{ IOException -> 0x05ad }
        r3 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IOException -> 0x05ad }
        r4 = 8;
        if (r3 < r4) goto L_0x0515;
    L_0x04cb:
        r3 = com.whatsapp.App.p;	 Catch:{ IOException -> 0x05ad }
        r4 = z;	 Catch:{ IOException -> 0x05ad }
        r5 = 99;
        r4 = r4[r5];	 Catch:{ IOException -> 0x05ad }
        r3 = r3.o(r4);	 Catch:{ IOException -> 0x05ad }
        if (r3 != 0) goto L_0x04e2;
    L_0x04d9:
        r0 = r24;
        r3 = r0.k;	 Catch:{ IOException -> 0x05af }
        r3.setProfile(r2);	 Catch:{ IOException -> 0x05af }
        if (r13 == 0) goto L_0x052d;
    L_0x04e2:
        if (r2 == 0) goto L_0x052d;
    L_0x04e4:
        r0 = r24;
        r3 = r0.k;	 Catch:{ IOException -> 0x05b3 }
        r4 = r2.fileFormat;	 Catch:{ IOException -> 0x05b3 }
        r3.setOutputFormat(r4);	 Catch:{ IOException -> 0x05b3 }
        r0 = r24;
        r3 = r0.k;	 Catch:{ IOException -> 0x05b3 }
        r4 = r2.videoFrameRate;	 Catch:{ IOException -> 0x05b3 }
        r3.setVideoFrameRate(r4);	 Catch:{ IOException -> 0x05b3 }
        r0 = r24;
        r3 = r0.k;	 Catch:{ IOException -> 0x05b3 }
        r4 = r2.videoFrameWidth;	 Catch:{ IOException -> 0x05b3 }
        r5 = r2.videoFrameHeight;	 Catch:{ IOException -> 0x05b3 }
        r3.setVideoSize(r4, r5);	 Catch:{ IOException -> 0x05b3 }
        r0 = r24;
        r3 = r0.k;	 Catch:{ IOException -> 0x05b3 }
        r4 = r2.videoBitRate;	 Catch:{ IOException -> 0x05b3 }
        r3.setVideoEncodingBitRate(r4);	 Catch:{ IOException -> 0x05b3 }
        r0 = r24;
        r3 = r0.k;	 Catch:{ IOException -> 0x05b3 }
        r2 = r2.videoCodec;	 Catch:{ IOException -> 0x05b3 }
        r3.setVideoEncoder(r2);	 Catch:{ IOException -> 0x05b3 }
        if (r13 == 0) goto L_0x052d;
    L_0x0515:
        r0 = r24;
        r2 = r0.k;	 Catch:{ IOException -> 0x05b5 }
        r3 = 2;
        r2.setOutputFormat(r3);	 Catch:{ IOException -> 0x05b5 }
        r0 = r24;
        r2 = r0.k;	 Catch:{ IOException -> 0x05b5 }
        r3 = 0;
        r2.setAudioEncoder(r3);	 Catch:{ IOException -> 0x05b5 }
        r0 = r24;
        r2 = r0.k;	 Catch:{ IOException -> 0x05b5 }
        r3 = 0;
        r2.setVideoEncoder(r3);	 Catch:{ IOException -> 0x05b5 }
    L_0x052d:
        r0 = r24;
        r2 = r0.k;
        r3 = r25.getAbsolutePath();
        r2.setOutputFile(r3);
        r0 = r24;
        r2 = r0.k;
        r3 = r24.getHolder();
        r3 = r3.getSurface();
        r2.setPreviewDisplay(r3);
        r2 = android.os.Build.VERSION.SDK_INT;
        r3 = 9;
        if (r2 < r3) goto L_0x0580;
    L_0x054d:
        r2 = r24.c();
        r0 = r24;
        r3 = r0.g;	 Catch:{ IOException -> 0x05b7 }
        if (r3 == 0) goto L_0x0575;
    L_0x0557:
        r3 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IOException -> 0x05b7 }
        r4 = 14;
        if (r3 == r4) goto L_0x0563;
    L_0x055d:
        r3 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IOException -> 0x05b9 }
        r4 = 15;
        if (r3 != r4) goto L_0x0575;
    L_0x0563:
        r3 = android.os.Build.MANUFACTURER;	 Catch:{ IOException -> 0x05bb }
        r4 = z;	 Catch:{ IOException -> 0x05bb }
        r5 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        r4 = r4[r5];	 Catch:{ IOException -> 0x05bb }
        r3 = r3.equals(r4);	 Catch:{ IOException -> 0x05bb }
        if (r3 == 0) goto L_0x0575;
    L_0x0571:
        r2 = 360 - r2;
        r2 = r2 % 360;
    L_0x0575:
        r2 = r2 + r26;
        r2 = r2 % 360;
        r0 = r24;
        r3 = r0.k;
        r3.setOrientationHint(r2);
    L_0x0580:
        r0 = r24;
        r2 = r0.k;	 Catch:{ IllegalStateException -> 0x05bd, IOException -> 0x05c7 }
        r2.prepare();	 Catch:{ IllegalStateException -> 0x05bd, IOException -> 0x05c7 }
        r2 = 1;
        goto L_0x0056;
    L_0x058a:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x058c }
    L_0x058c:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x058e }
    L_0x058e:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0590 }
    L_0x0590:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0592 }
    L_0x0592:
        r2 = move-exception;
        throw r2;
    L_0x0594:
        r2 = move-exception;
        throw r2;
    L_0x0596:
        r2 = 0;
        goto L_0x0459;
    L_0x0599:
        r2 = move-exception;
        throw r2;
    L_0x059b:
        r2 = move-exception;
        throw r2;
    L_0x059d:
        r2 = move-exception;
        r3 = z;
        r4 = 81;
        r3 = r3[r4];
        com.whatsapp.util.Log.b(r3, r2);
        goto L_0x047f;
    L_0x05a9:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x05ab }
    L_0x05ab:
        r2 = move-exception;
        throw r2;
    L_0x05ad:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x05af }
    L_0x05af:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x05b1 }
    L_0x05b1:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x05b3 }
    L_0x05b3:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x05b5 }
    L_0x05b5:
        r2 = move-exception;
        throw r2;
    L_0x05b7:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x05b9 }
    L_0x05b9:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x05bb }
    L_0x05bb:
        r2 = move-exception;
        throw r2;
    L_0x05bd:
        r2 = move-exception;
        r24.f();
        r24.b();
        r2 = 0;
        goto L_0x0056;
    L_0x05c7:
        r2 = move-exception;
        r24.f();
        r24.b();
        r2 = 0;
        goto L_0x0056;
    L_0x05d1:
        r4 = r2;
        goto L_0x0353;
    L_0x05d4:
        r22 = r2;
        r3 = r6;
        r6 = r22;
        goto L_0x0310;
    L_0x05db:
        r22 = r6;
        r6 = r3;
        r2 = r22;
        goto L_0x0345;
    L_0x05e2:
        r6 = r2;
        r2 = r10;
        goto L_0x0345;
    L_0x05e6:
        r2 = r3;
        goto L_0x0348;
    L_0x05e9:
        r8 = r2;
        goto L_0x02ba;
    L_0x05ec:
        r2 = r8;
        goto L_0x02fe;
    L_0x05ef:
        r6 = r10;
        goto L_0x02fe;
    L_0x05f2:
        r2 = r8;
        goto L_0x0300;
    L_0x05f5:
        r12 = r6;
        goto L_0x02a4;
    L_0x05f8:
        r2 = r7;
        goto L_0x0259;
    L_0x05fb:
        r2 = r6;
        goto L_0x021b;
    L_0x05fe:
        r6 = r2;
        goto L_0x01dd;
    L_0x0601:
        r5 = r4;
        r4 = r2;
        goto L_0x019b;
    L_0x0605:
        r5 = r4;
        r4 = r2;
        goto L_0x019b;
    L_0x0609:
        r6 = r2;
        goto L_0x012c;
    L_0x060c:
        r3 = r2;
        goto L_0x011e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.CameraView.b(java.io.File, int):boolean");
    }

    static boolean l(CameraView cameraView) {
        return cameraView.j;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void h() {
        /*
        r4 = this;
        r2 = 0;
        r1 = com.whatsapp.camera.CameraActivity.I;
        r0 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r4.u = r0;
        r0 = 0;
        r4.o = r0;
        r4.r = r2;
        r0 = r4.d;
        if (r0 != 0) goto L_0x0060;
    L_0x0010:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x0041 }
        r2 = 9;
        if (r0 < r2) goto L_0x0030;
    L_0x0016:
        r0 = r4.f;	 Catch:{ Exception -> 0x0041 }
        r2 = android.hardware.Camera.getNumberOfCameras();	 Catch:{ Exception -> 0x0041 }
        if (r0 < r2) goto L_0x0026;
    L_0x001e:
        r0 = android.hardware.Camera.getNumberOfCameras();	 Catch:{ Exception -> 0x0043 }
        r0 = r0 + -1;
        r4.f = r0;	 Catch:{ Exception -> 0x0043 }
    L_0x0026:
        r0 = r4.f;	 Catch:{ Exception -> 0x0091 }
        r0 = android.hardware.Camera.open(r0);	 Catch:{ Exception -> 0x0091 }
        r4.d = r0;	 Catch:{ Exception -> 0x0091 }
        if (r1 == 0) goto L_0x0036;
    L_0x0030:
        r0 = android.hardware.Camera.open();	 Catch:{ Exception -> 0x0091 }
        r4.d = r0;	 Catch:{ Exception -> 0x0091 }
    L_0x0036:
        r0 = r4.d;	 Catch:{ Exception -> 0x0045 }
        r2 = new com.whatsapp.camera.b;	 Catch:{ Exception -> 0x0045 }
        r2.<init>(r4);	 Catch:{ Exception -> 0x0045 }
        r0.setErrorCallback(r2);	 Catch:{ Exception -> 0x0045 }
    L_0x0040:
        return;
    L_0x0041:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0043 }
    L_0x0043:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0045 }
    L_0x0045:
        r0 = move-exception;
        r2 = r4.d;	 Catch:{ Exception -> 0x0093 }
        if (r2 == 0) goto L_0x004f;
    L_0x004a:
        r2 = r4.d;	 Catch:{ Exception -> 0x0093 }
        r2.release();	 Catch:{ Exception -> 0x0093 }
    L_0x004f:
        r2 = 0;
        r4.d = r2;	 Catch:{ Exception -> 0x0095 }
        r2 = z;	 Catch:{ Exception -> 0x0095 }
        r3 = 67;
        r2 = r2[r3];	 Catch:{ Exception -> 0x0095 }
        com.whatsapp.util.Log.b(r2, r0);	 Catch:{ Exception -> 0x0095 }
        r4.b();	 Catch:{ Exception -> 0x0095 }
        if (r1 == 0) goto L_0x0040;
    L_0x0060:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ RuntimeException -> 0x0097 }
        r2 = 8;
        if (r0 < r2) goto L_0x0083;
    L_0x0066:
        r0 = r4.d;	 Catch:{ IOException -> 0x006c }
        r0.reconnect();	 Catch:{ IOException -> 0x006c }
        goto L_0x0040;
    L_0x006c:
        r0 = move-exception;
        r2 = r4.d;	 Catch:{ Exception -> 0x008f }
        r2.release();	 Catch:{ Exception -> 0x008f }
        r2 = 0;
        r4.d = r2;	 Catch:{ Exception -> 0x008f }
        r2 = z;	 Catch:{ Exception -> 0x008f }
        r3 = 68;
        r2 = r2[r3];	 Catch:{ Exception -> 0x008f }
        com.whatsapp.util.Log.b(r2, r0);	 Catch:{ Exception -> 0x008f }
        r4.b();	 Catch:{ Exception -> 0x008f }
        if (r1 == 0) goto L_0x0040;
    L_0x0083:
        r0 = r4.d;	 Catch:{ Exception -> 0x008f }
        r0.release();	 Catch:{ Exception -> 0x008f }
        r0 = 0;
        r4.d = r0;	 Catch:{ Exception -> 0x008f }
        r4.h();	 Catch:{ Exception -> 0x008f }
        goto L_0x0040;
    L_0x008f:
        r0 = move-exception;
        throw r0;
    L_0x0091:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0045 }
    L_0x0093:
        r0 = move-exception;
        throw r0;
    L_0x0095:
        r0 = move-exception;
        throw r0;	 Catch:{  }
    L_0x0097:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.CameraView.h():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void j() {
        /*
        r14 = this;
        r13 = 8;
        r11 = 2;
        r5 = 2139095039; // 0x7f7fffff float:3.4028235E38 double:1.056853372E-314;
        r2 = 1;
        r1 = 0;
        r8 = com.whatsapp.camera.CameraActivity.I;
        r3 = r14.getWidth();
        r4 = r14.getHeight();
        r0 = r14.d;	 Catch:{ RuntimeException -> 0x0023 }
        if (r0 != 0) goto L_0x0025;
    L_0x0016:
        r0 = z;	 Catch:{ RuntimeException -> 0x0023 }
        r1 = 41;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x0023 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ RuntimeException -> 0x0023 }
        r14.b();	 Catch:{ RuntimeException -> 0x0023 }
    L_0x0022:
        return;
    L_0x0023:
        r0 = move-exception;
        throw r0;
    L_0x0025:
        r0 = r14.i;
        r9 = r0.getOrientation();
        if (r9 == 0) goto L_0x002f;
    L_0x002d:
        if (r9 != r11) goto L_0x0398;
    L_0x002f:
        r0 = r2;
    L_0x0030:
        r6 = r14.d;
        r10 = r6.getParameters();
        r6 = r10.getSupportedPreviewSizes();
        if (r6 != 0) goto L_0x0449;
    L_0x003c:
        r6 = r14.d();
        r7 = r6;
    L_0x0041:
        if (r0 == 0) goto L_0x039b;
    L_0x0043:
        r6 = r4;
    L_0x0044:
        if (r0 == 0) goto L_0x039e;
    L_0x0046:
        r3 = a(r7, r6, r3);	 Catch:{ RuntimeException -> 0x03a1 }
        r14.n = r3;	 Catch:{ RuntimeException -> 0x03a1 }
        r3 = r14.h;	 Catch:{ RuntimeException -> 0x03a1 }
        if (r3 != 0) goto L_0x0056;
    L_0x0050:
        r3 = r10.getFlashMode();	 Catch:{ RuntimeException -> 0x03a1 }
        r14.h = r3;	 Catch:{ RuntimeException -> 0x03a1 }
    L_0x0056:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = z;
        r6 = 33;
        r4 = r4[r6];
        r3 = r3.append(r4);
        r4 = r14.n;
        r4 = r4.width;
        r3 = r3.append(r4);
        r4 = "x";
        r3 = r3.append(r4);
        r4 = r14.n;
        r4 = r4.height;
        r3 = r3.append(r4);
        r3 = r3.toString();
        com.whatsapp.util.Log.i(r3);
        r14.g = r1;
        r3 = android.os.Build.VERSION.SDK_INT;
        r4 = 9;
        if (r3 < r4) goto L_0x00a0;
    L_0x008b:
        r4 = new android.hardware.Camera$CameraInfo;
        r4.<init>();
        r3 = r14.f;	 Catch:{ RuntimeException -> 0x03a3 }
        android.hardware.Camera.getCameraInfo(r3, r4);	 Catch:{ RuntimeException -> 0x03a3 }
        r3 = r4.facing;	 Catch:{ RuntimeException -> 0x03a3 }
        if (r3 != r2) goto L_0x03a5;
    L_0x0099:
        r3 = r2;
    L_0x009a:
        r14.g = r3;
        r3 = r4.orientation;
        if (r8 == 0) goto L_0x0446;
    L_0x00a0:
        if (r9 == 0) goto L_0x00a4;
    L_0x00a2:
        if (r9 != r11) goto L_0x00b2;
    L_0x00a4:
        r3 = r14.i;
        r4 = r3.getWidth();
        r3 = r14.i;
        r3 = r3.getHeight();
        if (r8 == 0) goto L_0x00be;
    L_0x00b2:
        r3 = r14.i;
        r4 = r3.getHeight();
        r3 = r14.i;
        r3 = r3.getWidth();
    L_0x00be:
        if (r4 <= r3) goto L_0x00c2;
    L_0x00c0:
        if (r8 == 0) goto L_0x0443;
    L_0x00c2:
        r3 = 90;
        r6 = r3;
    L_0x00c5:
        switch(r9) {
            case 0: goto L_0x03a8;
            case 1: goto L_0x03aa;
            case 2: goto L_0x03ae;
            case 3: goto L_0x03b2;
            default: goto L_0x00c8;
        };
    L_0x00c8:
        r3 = r1;
    L_0x00c9:
        r4 = r14.g;
        if (r4 == 0) goto L_0x00d7;
    L_0x00cd:
        r4 = r6 + r3;
        r4 = r4 % 360;
        r4 = 360 - r4;
        r4 = r4 % 360;
        if (r8 == 0) goto L_0x00dd;
    L_0x00d7:
        r4 = r6 - r3;
        r4 = r4 + 360;
        r4 = r4 % 360;
    L_0x00dd:
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r9 = z;
        r11 = 34;
        r9 = r9[r11];
        r7 = r7.append(r9);
        r3 = r7.append(r3);
        r7 = z;
        r9 = 36;
        r7 = r7[r9];
        r3 = r3.append(r7);
        r3 = r3.append(r6);
        r6 = z;
        r7 = 42;
        r6 = r6[r7];
        r3 = r3.append(r6);
        r3 = r3.append(r4);
        r6 = z;
        r7 = 29;
        r6 = r6[r7];
        r3 = r3.append(r6);
        r6 = r14.g;
        r3 = r3.append(r6);
        r3 = r3.toString();
        com.whatsapp.util.Log.i(r3);
        r3 = android.os.Build.VERSION.SDK_INT;
        if (r3 < r13) goto L_0x03d7;
    L_0x0127:
        r3 = r14.d;	 Catch:{ RuntimeException -> 0x03b6 }
        r3.setDisplayOrientation(r4);	 Catch:{ RuntimeException -> 0x03b6 }
    L_0x012c:
        r0 = r14.n;
        r0 = r0.width;
        r3 = r14.n;
        r3 = r3.height;
        r10.setPreviewSize(r0, r3);
        r0 = r10.getSupportedFocusModes();
        if (r0 == 0) goto L_0x0440;
    L_0x013d:
        r3 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x03fe }
        r3.<init>();	 Catch:{ RuntimeException -> 0x03fe }
        r4 = z;	 Catch:{ RuntimeException -> 0x03fe }
        r6 = 50;
        r4 = r4[r6];	 Catch:{ RuntimeException -> 0x03fe }
        r3 = r3.append(r4);	 Catch:{ RuntimeException -> 0x03fe }
        r4 = r0.toArray();	 Catch:{ RuntimeException -> 0x03fe }
        r4 = java.util.Arrays.deepToString(r4);	 Catch:{ RuntimeException -> 0x03fe }
        r3 = r3.append(r4);	 Catch:{ RuntimeException -> 0x03fe }
        r3 = r3.toString();	 Catch:{ RuntimeException -> 0x03fe }
        com.whatsapp.util.Log.i(r3);	 Catch:{ RuntimeException -> 0x03fe }
        r3 = z;	 Catch:{ RuntimeException -> 0x03fe }
        r4 = 32;
        r3 = r3[r4];	 Catch:{ RuntimeException -> 0x03fe }
        r0 = r0.contains(r3);	 Catch:{ RuntimeException -> 0x03fe }
        if (r0 == 0) goto L_0x043d;
    L_0x016b:
        r0 = z;
        r1 = 31;
        r0 = r0[r1];
        r10.setFocusMode(r0);
        if (r8 == 0) goto L_0x017f;
    L_0x0176:
        r0 = z;	 Catch:{ RuntimeException -> 0x0400 }
        r1 = 51;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x0400 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ RuntimeException -> 0x0400 }
    L_0x017f:
        r0 = r10.getSupportedFlashModes();
        if (r0 == 0) goto L_0x01a9;
    L_0x0185:
        r1 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x0402 }
        r1.<init>();	 Catch:{ RuntimeException -> 0x0402 }
        r3 = z;	 Catch:{ RuntimeException -> 0x0402 }
        r4 = 39;
        r3 = r3[r4];	 Catch:{ RuntimeException -> 0x0402 }
        r1 = r1.append(r3);	 Catch:{ RuntimeException -> 0x0402 }
        r3 = r0.toArray();	 Catch:{ RuntimeException -> 0x0402 }
        r3 = java.util.Arrays.deepToString(r3);	 Catch:{ RuntimeException -> 0x0402 }
        r1 = r1.append(r3);	 Catch:{ RuntimeException -> 0x0402 }
        r1 = r1.toString();	 Catch:{ RuntimeException -> 0x0402 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ RuntimeException -> 0x0402 }
        if (r8 == 0) goto L_0x01b2;
    L_0x01a9:
        r1 = z;	 Catch:{ RuntimeException -> 0x0402 }
        r3 = 45;
        r1 = r1[r3];	 Catch:{ RuntimeException -> 0x0402 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ RuntimeException -> 0x0402 }
    L_0x01b2:
        r1 = r14.h;	 Catch:{ RuntimeException -> 0x0404 }
        if (r1 == 0) goto L_0x01e1;
    L_0x01b6:
        if (r0 == 0) goto L_0x01e1;
    L_0x01b8:
        r1 = r14.h;	 Catch:{ RuntimeException -> 0x0408 }
        r0 = r0.contains(r1);	 Catch:{ RuntimeException -> 0x0408 }
        if (r0 == 0) goto L_0x01e1;
    L_0x01c0:
        r0 = r14.h;	 Catch:{ RuntimeException -> 0x0408 }
        r10.setFlashMode(r0);	 Catch:{ RuntimeException -> 0x0408 }
        r0 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x0408 }
        r0.<init>();	 Catch:{ RuntimeException -> 0x0408 }
        r1 = z;	 Catch:{ RuntimeException -> 0x0408 }
        r3 = 35;
        r1 = r1[r3];	 Catch:{ RuntimeException -> 0x0408 }
        r0 = r0.append(r1);	 Catch:{ RuntimeException -> 0x0408 }
        r1 = r14.h;	 Catch:{ RuntimeException -> 0x0408 }
        r0 = r0.append(r1);	 Catch:{ RuntimeException -> 0x0408 }
        r0 = r0.toString();	 Catch:{ RuntimeException -> 0x0408 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ RuntimeException -> 0x0408 }
    L_0x01e1:
        r7 = r10.getSupportedPictureSizes();
        r0 = new com.whatsapp.camera.j;
        r0.<init>(r14);
        java.util.Collections.sort(r7, r0);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r3 = 52;
        r1 = r1[r3];
        r0 = r0.append(r1);
        r1 = a(r7);
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r1 = 640; // 0x280 float:8.97E-43 double:3.16E-321;
        r0 = 480; // 0x1e0 float:6.73E-43 double:2.37E-321;
        r3 = r14.n;
        if (r3 == 0) goto L_0x0273;
    L_0x0213:
        r3 = r14.n;
        r3 = r3.height;
        r3 = (float) r3;
        r4 = r14.n;
        r4 = r4.width;
        r4 = (float) r4;
        r9 = r3 / r4;
        r11 = r7.iterator();
        r3 = r0;
        r4 = r1;
        r1 = r5;
    L_0x0226:
        r0 = r11.hasNext();
        if (r0 == 0) goto L_0x042f;
    L_0x022c:
        r0 = r11.next();
        r0 = (android.hardware.Camera.Size) r0;
        r6 = r0.width;	 Catch:{ RuntimeException -> 0x040a }
        r12 = r0.height;	 Catch:{ RuntimeException -> 0x040a }
        r6 = r6 * r12;
        r12 = 10000000; // 0x989680 float:1.4012985E-38 double:4.9406565E-317;
        if (r6 >= r12) goto L_0x0438;
    L_0x023c:
        r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1));
        if (r6 == 0) goto L_0x024d;
    L_0x0240:
        r6 = r0.width;	 Catch:{ RuntimeException -> 0x040e }
        r12 = r0.height;	 Catch:{ RuntimeException -> 0x040e }
        r6 = r6 * r12;
        r6 = r6 * 2;
        r12 = r4 * r3;
        if (r6 >= r12) goto L_0x024d;
    L_0x024b:
        if (r8 == 0) goto L_0x042f;
    L_0x024d:
        r6 = r0.height;
        r6 = (float) r6;
        r12 = r0.width;
        r12 = (float) r12;
        r6 = r6 / r12;
        r6 = r6 - r9;
        r6 = java.lang.Math.abs(r6);
        r12 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1));
        if (r12 >= 0) goto L_0x0438;
    L_0x025d:
        r3 = r0.height;
        r4 = r0.width;
        r0 = 1028443341; // 0x3d4ccccd float:0.05 double:5.081185235E-315;
        r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1));
        if (r0 >= 0) goto L_0x0433;
    L_0x0268:
        if (r8 == 0) goto L_0x042f;
    L_0x026a:
        r0 = r6;
        r1 = r3;
        r3 = r4;
    L_0x026d:
        if (r8 == 0) goto L_0x042a;
    L_0x026f:
        r0 = r1;
        r1 = r3;
    L_0x0271:
        if (r8 == 0) goto L_0x02a0;
    L_0x0273:
        r4 = r7.iterator();
        r3 = r1;
        r1 = r0;
    L_0x0279:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x0426;
    L_0x027f:
        r0 = r4.next();
        r0 = (android.hardware.Camera.Size) r0;
        r5 = r0.width;	 Catch:{ RuntimeException -> 0x0410 }
        r6 = r0.height;	 Catch:{ RuntimeException -> 0x0410 }
        r5 = r5 * r6;
        r6 = r3 * r1;
        if (r5 <= r6) goto L_0x0422;
    L_0x028e:
        r5 = r0.width;	 Catch:{ RuntimeException -> 0x0410 }
        r6 = r0.height;	 Catch:{ RuntimeException -> 0x0410 }
        r5 = r5 * r6;
        r6 = 10000000; // 0x989680 float:1.4012985E-38 double:4.9406565E-317;
        if (r5 >= r6) goto L_0x0422;
    L_0x0298:
        r1 = r0.height;
        r3 = r0.width;
        r0 = r1;
        r1 = r3;
    L_0x029e:
        if (r8 == 0) goto L_0x041e;
    L_0x02a0:
        r3 = r14.g;	 Catch:{ RuntimeException -> 0x0412 }
        if (r3 == 0) goto L_0x02d4;
    L_0x02a4:
        r3 = z;	 Catch:{ RuntimeException -> 0x0414 }
        r4 = 48;
        r3 = r3[r4];	 Catch:{ RuntimeException -> 0x0414 }
        r4 = android.os.Build.MANUFACTURER;	 Catch:{ RuntimeException -> 0x0414 }
        r3 = r3.equals(r4);	 Catch:{ RuntimeException -> 0x0414 }
        if (r3 == 0) goto L_0x02d4;
    L_0x02b2:
        r3 = t;	 Catch:{ RuntimeException -> 0x0414 }
        r4 = android.os.Build.MODEL;	 Catch:{ RuntimeException -> 0x0414 }
        r3 = com.whatsapp.util.ax.a(r3, r4);	 Catch:{ RuntimeException -> 0x0414 }
        if (r3 == 0) goto L_0x02d4;
    L_0x02bc:
        r3 = new android.hardware.Camera$Size;
        r4 = r14.d;
        r4.getClass();
        r5 = 1280; // 0x500 float:1.794E-42 double:6.324E-321;
        r6 = 720; // 0x2d0 float:1.009E-42 double:3.557E-321;
        r3.<init>(r4, r5, r6);
        r4 = r7.contains(r3);
        if (r4 == 0) goto L_0x02d4;
    L_0x02d0:
        r1 = r3.width;
        r0 = r3.height;
    L_0x02d4:
        r3 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x0416 }
        r3.<init>();	 Catch:{ RuntimeException -> 0x0416 }
        r4 = z;	 Catch:{ RuntimeException -> 0x0416 }
        r5 = 43;
        r4 = r4[r5];	 Catch:{ RuntimeException -> 0x0416 }
        r3 = r3.append(r4);	 Catch:{ RuntimeException -> 0x0416 }
        r3 = r3.append(r1);	 Catch:{ RuntimeException -> 0x0416 }
        r4 = "x";
        r3 = r3.append(r4);	 Catch:{ RuntimeException -> 0x0416 }
        r3 = r3.append(r0);	 Catch:{ RuntimeException -> 0x0416 }
        r3 = r3.toString();	 Catch:{ RuntimeException -> 0x0416 }
        com.whatsapp.util.Log.i(r3);	 Catch:{ RuntimeException -> 0x0416 }
        r10.setPictureSize(r1, r0);	 Catch:{ RuntimeException -> 0x0416 }
        r0 = r14.d;	 Catch:{ RuntimeException -> 0x0416 }
        r0.setParameters(r10);	 Catch:{ RuntimeException -> 0x0416 }
        r0 = r14.d;	 Catch:{ RuntimeException -> 0x0416 }
        r0.startPreview();	 Catch:{ RuntimeException -> 0x0416 }
        if (r2 != 0) goto L_0x0312;
    L_0x0308:
        r0 = r14.d;	 Catch:{ RuntimeException -> 0x0416 }
        r1 = new com.whatsapp.camera.h;	 Catch:{ RuntimeException -> 0x0416 }
        r1.<init>(r14);	 Catch:{ RuntimeException -> 0x0416 }
        r0.autoFocus(r1);	 Catch:{ RuntimeException -> 0x0416 }
    L_0x0312:
        r0 = 0;
        r14.o = r0;	 Catch:{ RuntimeException -> 0x0418 }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ RuntimeException -> 0x0418 }
        if (r0 < r13) goto L_0x0388;
    L_0x0319:
        r0 = r14.d;	 Catch:{ RuntimeException -> 0x041a }
        r0 = r0.getParameters();	 Catch:{ RuntimeException -> 0x041a }
        r0 = r0.isZoomSupported();	 Catch:{ RuntimeException -> 0x041a }
        if (r0 == 0) goto L_0x037f;
    L_0x0325:
        r0 = r14.d;	 Catch:{ RuntimeException -> 0x041c }
        r0 = r0.getParameters();	 Catch:{ RuntimeException -> 0x041c }
        r0 = r0.getMaxZoom();	 Catch:{ RuntimeException -> 0x041c }
        r14.o = r0;	 Catch:{ RuntimeException -> 0x041c }
        r0 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x041c }
        r0.<init>();	 Catch:{ RuntimeException -> 0x041c }
        r1 = z;	 Catch:{ RuntimeException -> 0x041c }
        r2 = 44;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x041c }
        r0 = r0.append(r1);	 Catch:{ RuntimeException -> 0x041c }
        r1 = r14.o;	 Catch:{ RuntimeException -> 0x041c }
        r0 = r0.append(r1);	 Catch:{ RuntimeException -> 0x041c }
        r0 = r0.toString();	 Catch:{ RuntimeException -> 0x041c }
        com.whatsapp.util.Log.i(r0);	 Catch:{ RuntimeException -> 0x041c }
        r0 = r14.d;	 Catch:{ RuntimeException -> 0x041c }
        r0 = r0.getParameters();	 Catch:{ RuntimeException -> 0x041c }
        r0 = r0.getZoomRatios();	 Catch:{ RuntimeException -> 0x041c }
        r14.r = r0;	 Catch:{ RuntimeException -> 0x041c }
        r0 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x041c }
        r0.<init>();	 Catch:{ RuntimeException -> 0x041c }
        r1 = z;	 Catch:{ RuntimeException -> 0x041c }
        r2 = 40;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x041c }
        r0 = r0.append(r1);	 Catch:{ RuntimeException -> 0x041c }
        r1 = r14.r;	 Catch:{ RuntimeException -> 0x041c }
        r1 = r1.toArray();	 Catch:{ RuntimeException -> 0x041c }
        r1 = java.util.Arrays.deepToString(r1);	 Catch:{ RuntimeException -> 0x041c }
        r0 = r0.append(r1);	 Catch:{ RuntimeException -> 0x041c }
        r0 = r0.toString();	 Catch:{ RuntimeException -> 0x041c }
        com.whatsapp.util.Log.i(r0);	 Catch:{ RuntimeException -> 0x041c }
        if (r8 == 0) goto L_0x0388;
    L_0x037f:
        r0 = z;	 Catch:{ RuntimeException -> 0x041c }
        r1 = 30;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x041c }
        com.whatsapp.util.Log.i(r0);	 Catch:{ RuntimeException -> 0x041c }
    L_0x0388:
        r0 = 1;
        r14.e = r0;	 Catch:{ RuntimeException -> 0x0396 }
        r0 = r14.l;	 Catch:{ RuntimeException -> 0x0396 }
        if (r0 == 0) goto L_0x0022;
    L_0x038f:
        r0 = r14.l;	 Catch:{ RuntimeException -> 0x0396 }
        r0.a();	 Catch:{ RuntimeException -> 0x0396 }
        goto L_0x0022;
    L_0x0396:
        r0 = move-exception;
        throw r0;
    L_0x0398:
        r0 = r1;
        goto L_0x0030;
    L_0x039b:
        r6 = r3;
        goto L_0x0044;
    L_0x039e:
        r3 = r4;
        goto L_0x0046;
    L_0x03a1:
        r0 = move-exception;
        throw r0;
    L_0x03a3:
        r0 = move-exception;
        throw r0;
    L_0x03a5:
        r3 = r1;
        goto L_0x009a;
    L_0x03a8:
        if (r8 == 0) goto L_0x00c8;
    L_0x03aa:
        r3 = 90;
        if (r8 == 0) goto L_0x00c9;
    L_0x03ae:
        r3 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
        if (r8 == 0) goto L_0x00c9;
    L_0x03b2:
        r3 = 270; // 0x10e float:3.78E-43 double:1.334E-321;
        goto L_0x00c9;
    L_0x03b6:
        r3 = move-exception;
        r6 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x03f3 }
        r6.<init>();	 Catch:{ RuntimeException -> 0x03f3 }
        r7 = z;	 Catch:{ RuntimeException -> 0x03f3 }
        r9 = 47;
        r7 = r7[r9];	 Catch:{ RuntimeException -> 0x03f3 }
        r6 = r6.append(r7);	 Catch:{ RuntimeException -> 0x03f3 }
        r3 = r3.toString();	 Catch:{ RuntimeException -> 0x03f3 }
        r3 = r6.append(r3);	 Catch:{ RuntimeException -> 0x03f3 }
        r3 = r3.toString();	 Catch:{ RuntimeException -> 0x03f3 }
        com.whatsapp.util.Log.e(r3);	 Catch:{ RuntimeException -> 0x03f3 }
        if (r8 == 0) goto L_0x012c;
    L_0x03d7:
        r3 = z;	 Catch:{ RuntimeException -> 0x03f5 }
        r6 = 46;
        r3 = r3[r6];	 Catch:{ RuntimeException -> 0x03f5 }
        r10.set(r3, r4);	 Catch:{ RuntimeException -> 0x03f5 }
        r3 = z;	 Catch:{ RuntimeException -> 0x03f5 }
        r4 = 37;
        r3 = r3[r4];	 Catch:{ RuntimeException -> 0x03f5 }
        if (r0 == 0) goto L_0x03f7;
    L_0x03e8:
        r0 = z;	 Catch:{ RuntimeException -> 0x03f5 }
        r4 = 38;
        r0 = r0[r4];	 Catch:{ RuntimeException -> 0x03f5 }
    L_0x03ee:
        r10.set(r3, r0);
        goto L_0x012c;
    L_0x03f3:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x03f5 }
    L_0x03f5:
        r0 = move-exception;
        throw r0;
    L_0x03f7:
        r0 = z;
        r4 = 49;
        r0 = r0[r4];
        goto L_0x03ee;
    L_0x03fe:
        r0 = move-exception;
        throw r0;
    L_0x0400:
        r0 = move-exception;
        throw r0;
    L_0x0402:
        r0 = move-exception;
        throw r0;
    L_0x0404:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0406 }
    L_0x0406:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0408 }
    L_0x0408:
        r0 = move-exception;
        throw r0;
    L_0x040a:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x040c }
    L_0x040c:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x040e }
    L_0x040e:
        r0 = move-exception;
        throw r0;
    L_0x0410:
        r0 = move-exception;
        throw r0;
    L_0x0412:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0414 }
    L_0x0414:
        r0 = move-exception;
        throw r0;
    L_0x0416:
        r0 = move-exception;
        throw r0;
    L_0x0418:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x041a }
    L_0x041a:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x041c }
    L_0x041c:
        r0 = move-exception;
        throw r0;
    L_0x041e:
        r3 = r1;
        r1 = r0;
        goto L_0x0279;
    L_0x0422:
        r0 = r1;
        r1 = r3;
        goto L_0x029e;
    L_0x0426:
        r0 = r1;
        r1 = r3;
        goto L_0x02a0;
    L_0x042a:
        r4 = r3;
        r3 = r1;
        r1 = r0;
        goto L_0x0226;
    L_0x042f:
        r0 = r3;
        r1 = r4;
        goto L_0x0271;
    L_0x0433:
        r0 = r6;
        r1 = r3;
        r3 = r4;
        goto L_0x026d;
    L_0x0438:
        r0 = r1;
        r1 = r3;
        r3 = r4;
        goto L_0x026d;
    L_0x043d:
        r2 = r1;
        goto L_0x017f;
    L_0x0440:
        r2 = r1;
        goto L_0x0176;
    L_0x0443:
        r6 = r1;
        goto L_0x00c5;
    L_0x0446:
        r6 = r3;
        goto L_0x00c5;
    L_0x0449:
        r7 = r6;
        goto L_0x0041;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.CameraView.j():void");
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        try {
            if (this.d == null) {
                return;
            }
            if (this.o != 0) {
                this.l.a(this.u);
            }
        } catch (RuntimeException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    static Display d(CameraView cameraView) {
        return cameraView.i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(java.util.List r6) {
        /*
        r1 = com.whatsapp.camera.CameraActivity.I;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = r6.iterator();
    L_0x000b:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x0034;
    L_0x0011:
        r0 = r3.next();
        r0 = (android.hardware.Camera.Size) r0;
        r4 = r0.width;
        r4 = r2.append(r4);
        r5 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        r4 = r4.append(r5);
        r0 = r0.height;
        r0 = r4.append(r0);
        r4 = z;
        r5 = 65;
        r4 = r4[r5];
        r0.append(r4);
        if (r1 == 0) goto L_0x000b;
    L_0x0034:
        r0 = r2.length();	 Catch:{ RuntimeException -> 0x0049 }
        r1 = 1;
        if (r0 <= r1) goto L_0x0044;
    L_0x003b:
        r0 = r2.length();	 Catch:{ RuntimeException -> 0x0049 }
        r0 = r0 + -2;
        r2.deleteCharAt(r0);	 Catch:{ RuntimeException -> 0x0049 }
    L_0x0044:
        r0 = r2.toString();
        return r0;
    L_0x0049:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.CameraView.a(java.util.List):java.lang.String");
    }

    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        try {
            if (this.d != null) {
                if (this.o != 0) {
                    float scaleFactor = scaleGestureDetector.getScaleFactor();
                    try {
                        this.u = scaleFactor * (this.u * scaleFactor);
                        if (this.u < 1.0f) {
                            this.u = 1.0f;
                        }
                        this.l.b(this.u);
                    } catch (RuntimeException e) {
                        throw e;
                    }
                }
            }
            return true;
        } catch (RuntimeException e2) {
            throw e2;
        } catch (RuntimeException e22) {
            throw e22;
        }
    }

    static void i(CameraView cameraView) {
        cameraView.m();
    }

    static boolean k(CameraView cameraView) {
        return cameraView.e;
    }

    private void m() {
        Log.i(z[55]);
        if (this.d != null) {
            try {
                this.d.stopPreview();
            } catch (Throwable e) {
                Log.c(z[53], e);
            }
            try {
                this.d.release();
            } catch (Throwable e2) {
                Log.c(z[54], e2);
            }
            this.d = null;
        }
    }

    static void g(CameraView cameraView) {
        cameraView.b();
    }

    public void a(c cVar) {
        if (cVar == null) {
            try {
                throw new IllegalArgumentException(z[4]);
            } catch (Exception e) {
                throw e;
            }
        }
        try {
            if (this.d == null) {
                Log.e(z[6]);
                b();
                return;
            }
            this.e = false;
            this.c = true;
            Log.i(z[7]);
            Parameters parameters = this.d.getParameters();
            parameters.setRotation(c());
            parameters.setJpegQuality(80);
            this.d.setParameters(parameters);
            try {
                PictureCallback yVar = new y(this, cVar);
                this.d.takePicture(new aw(this, cVar), null, yVar);
            } catch (Throwable e2) {
                Log.b(z[5], e2);
                b();
            }
        } catch (Exception e3) {
            throw e3;
        }
    }

    public String g() {
        try {
            if (this.d == null) {
                return null;
            }
            List n = n();
            if (n == null) {
                return null;
            }
            try {
                if (n.isEmpty()) {
                    return null;
                }
                try {
                    if (this.h == null) {
                        this.h = this.d.getParameters().getFlashMode();
                    }
                    int indexOf = n.indexOf(this.h);
                    if (indexOf < 0) {
                        return null;
                    }
                    this.h = (String) n.get((indexOf + 1) % n.size());
                    Log.i(z[57] + this.h);
                    Parameters parameters = this.d.getParameters();
                    parameters.setFlashMode(this.h);
                    this.d.setParameters(parameters);
                    getContext().getSharedPreferences(z[56], 0).edit().putString(z[58], this.h).commit();
                    return this.h;
                } catch (RuntimeException e) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            }
        } catch (RuntimeException e22) {
            throw e22;
        }
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        try {
            if (this.d == null) {
                Log.e(z[10]);
                b();
                return;
            }
            try {
                if (this.m.getSurface() == null) {
                    Log.e(z[8]);
                    b();
                } else if (!this.j) {
                    try {
                        if (!surfaceHolder.isCreating()) {
                            this.d.stopPreview();
                        }
                        this.d.setPreviewDisplay(surfaceHolder);
                        j();
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Throwable e2) {
                        this.d.release();
                        this.d = null;
                        Log.b(z[11], e2);
                        b();
                    } catch (Throwable e22) {
                        this.d.release();
                        this.d = null;
                        Log.b(z[9], e22);
                        b();
                    }
                }
            } catch (RuntimeException e3) {
                throw e3;
            }
        } catch (RuntimeException e32) {
            throw e32;
        }
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        h();
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        try {
            if (this.d != null) {
                if (this.o != 0) {
                    this.l.c(this.u);
                }
            }
            return true;
        } catch (RuntimeException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw e2;
        }
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    static boolean a(CameraView cameraView, boolean z) {
        cameraView.c = z;
        return z;
    }

    public void l() {
        try {
            this.k.stop();
        } catch (RuntimeException e) {
            Log.w(z[66] + e.toString());
        }
        f();
        this.d.lock();
        this.j = false;
        this.a = null;
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        m();
        f();
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    static Camera a(CameraView cameraView, Camera camera) {
        cameraView.d = camera;
        return camera;
    }

    public String k() {
        return this.h;
    }

    public CameraView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b.disable();
    }

    public boolean e() {
        return this.j;
    }

    static void b(CameraView cameraView) {
        cameraView.j();
    }

    public void setCameraCallback(an anVar) {
        this.l = anVar;
    }

    public List n() {
        List list = null;
        try {
            if (this.d != null) {
                List supportedFlashModes = this.d.getParameters().getSupportedFlashModes();
                if (supportedFlashModes != null) {
                    list = new ArrayList();
                    try {
                        if (supportedFlashModes.contains(z[64])) {
                            list.add(z[62]);
                        }
                        try {
                            if (supportedFlashModes.contains(z[59])) {
                                list.add(z[63]);
                            }
                            try {
                                if (supportedFlashModes.contains(z[61])) {
                                    list.add(z[60]);
                                }
                            } catch (RuntimeException e) {
                                throw e;
                            }
                        } catch (RuntimeException e2) {
                            throw e2;
                        }
                    } catch (RuntimeException e22) {
                        throw e22;
                    }
                }
            }
            return list;
        } catch (RuntimeException e222) {
            throw e222;
        }
    }

    public CameraView(Context context) {
        this(context, null);
    }

    public void a() {
        try {
            Log.i(z[arj.Theme_ratingBarStyle]);
            if (VERSION.SDK_INT >= 9 && Camera.getNumberOfCameras() > 1) {
                this.f = (this.f + 1) % Camera.getNumberOfCameras();
                m();
                h();
                requestLayout();
                try {
                    this.d.setPreviewDisplay(this.m);
                    j();
                    getContext().getSharedPreferences(z[arj.Theme_editTextStyle], 0).edit().putInt(z[arj.Theme_checkedTextViewStyle], this.f).commit();
                } catch (Throwable e) {
                    this.d.release();
                    this.d = null;
                    Log.b(z[arj.Theme_seekBarStyle], e);
                    b();
                } catch (Throwable e2) {
                    this.d.release();
                    this.d = null;
                    Log.b(z[arj.Theme_radioButtonStyle], e2);
                    b();
                }
            }
        } catch (RuntimeException e3) {
            throw e3;
        }
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        try {
            if (this.e && this.d != null) {
                this.d.cancelAutoFocus();
                boolean z = false;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (VERSION.SDK_INT >= 14) {
                    Rect rect = new Rect((int) (x - (100.0f / 2.0f)), (int) (y - (100.0f / 2.0f)), (int) ((100.0f / 2.0f) + x), (int) ((100.0f / 2.0f) + y));
                    Rect rect2 = new Rect();
                    try {
                        rect2.set(((rect.left * 2000) / getWidth()) - 1000, ((rect.top * 2000) / getHeight()) - 1000, ((rect.right * 2000) / getWidth()) - 1000, ((rect.bottom * 2000) / getHeight()) - 1000);
                        if (rect2.left < -1000) {
                            rect2.left = -1000;
                        }
                        try {
                            if (rect2.top < -1000) {
                                rect2.top = -1000;
                            }
                            try {
                                if (rect2.right > 1000) {
                                    rect2.right = 1000;
                                }
                                try {
                                    if (rect2.bottom > 1000) {
                                        rect2.bottom = 1000;
                                    }
                                    try {
                                        if (Math.abs(rect2.top - rect2.bottom) < 10) {
                                            rect2.top -= 5;
                                            rect2.bottom += 5;
                                            if (rect2.top < -1000) {
                                                rect2.top = -1000;
                                            }
                                            try {
                                                if (rect2.top > 1000) {
                                                    rect2.top = 1000;
                                                }
                                            } catch (RuntimeException e) {
                                                throw e;
                                            }
                                        }
                                        try {
                                            if (Math.abs(rect2.left - rect2.right) < 10) {
                                                rect2.left -= 5;
                                                rect2.right += 5;
                                                if (rect2.left < -1000) {
                                                    rect2.left = -1000;
                                                }
                                                try {
                                                    if (rect2.right < 1000) {
                                                        rect2.right = 1000;
                                                    }
                                                } catch (RuntimeException e2) {
                                                    throw e2;
                                                }
                                            }
                                            Parameters parameters = this.d.getParameters();
                                            if (parameters.getMaxNumFocusAreas() > 0) {
                                                List arrayList = new ArrayList();
                                                arrayList.add(new Area(rect2, 1000));
                                                parameters.setFocusAreas(arrayList);
                                                arrayList = parameters.getSupportedFocusModes();
                                                if (arrayList != null) {
                                                    try {
                                                        if (arrayList.contains(z[110])) {
                                                            parameters.setFocusMode(z[arj.Theme_switchStyle]);
                                                        }
                                                    } catch (RuntimeException e22) {
                                                        throw e22;
                                                    }
                                                }
                                                this.d.setParameters(parameters);
                                                z = true;
                                            }
                                        } catch (RuntimeException e222) {
                                            throw e222;
                                        } catch (RuntimeException e2222) {
                                            throw e2222;
                                        }
                                    } catch (RuntimeException e22222) {
                                        throw e22222;
                                    } catch (RuntimeException e222222) {
                                        throw e222222;
                                    }
                                } catch (RuntimeException e2222222) {
                                    throw e2222222;
                                }
                            } catch (RuntimeException e22222222) {
                                throw e22222222;
                            }
                        } catch (RuntimeException e222222222) {
                            throw e222222222;
                        }
                    } catch (RuntimeException e2222222222) {
                        throw e2222222222;
                    }
                }
                if (z) {
                    try {
                        this.l.a(x, y);
                    } catch (RuntimeException e22222222222) {
                        throw e22222222222;
                    }
                }
                this.d.autoFocus(new a3(this));
            }
            return true;
        } catch (RuntimeException e222222222222) {
            throw e222222222222;
        }
    }

    public void onShowPress(MotionEvent motionEvent) {
    }
}
