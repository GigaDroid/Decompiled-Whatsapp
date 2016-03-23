package com.whatsapp.qrcode;

import android.content.Context;
import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera.Size;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import java.io.IOException;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class QrCodeView extends SurfaceView implements Callback {
    public static boolean g;
    private static final String[] z;
    private SurfaceHolder a;
    final AutoFocusCallback b;
    private Camera c;
    private Handler d;
    private Size e;
    private h f;

    static {
        String[] strArr = new String[34];
        String str = "SVH+\u0011U\u000bM6\u0015PP]#\u0019GV_b\u0011PVQ0TPA]-\u001aLA]6\u001dLC\u001e!\u0015OAL#";
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
                        i3 = 34;
                        break;
                    case at.g /*1*/:
                        i3 = 36;
                        break;
                    case at.i /*2*/:
                        i3 = 62;
                        break;
                    case at.o /*3*/:
                        i3 = 66;
                        break;
                    default:
                        i3 = 116;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "SVH+\u0011U\u000bM6\u0015PPN0\u0011TM[5TQQN2\u001bPP[&TDH_1\u001c\u0018";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "MVW'\u001aVEJ+\u001bL";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "MBX";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "SVH+\u0011U\u000bM6\u0015PPN0\u0011TM[5TAES'\u0006C\u0004W1TLQR.";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0002G_/\u0011PE\u0004";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "NEP&\u0007AEN'";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "UMP&\u001bU";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "SVH+\u0011U\u000bM6\u0015PPN0\u0011TM[5TQQN2\u001bPP[&TDH_1\u001c\u0018JK.\u0018";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "SVH+\u0011U\u000bM6\u0015PPN0\u0011TM[5TQQN2\u001bPP[&TDK]7\u0007\u0018JK.\u0018";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0002TL'\u0002KAIx";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "G@Q$";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "SVH+\u0011U\u000bM6\u0015PPN0\u0011TM[5TFMM2\u0018C]\u0004";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "OE]0\u001b";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "SVH+\u0011U\u000bX#\u0018NF_!\u001fQQN2\u001bPP[&\u0004PAH+\u0011UWW8\u0011Q";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "CQJ-";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "RKL6\u0006CMJ";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "SVH+\u0011U\u000bM6\u0015PPN0\u0011TM[5TQQN2\u001bPP[&TDK]7\u0007\u0018";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "G@Q$";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "MBX";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "SVH+\u0011U\u000bM6\u0015PPN0\u0011TM[5[QAJ&\u001dQTR#\rMVW'\u001aVEJ+\u001bL\u0004";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "SVH+\u0011U\u000bM6\u0015PPN0\u0011TM[5TMTJ+\u0019CH\u001e2\u0006GRW'\u0003\u0002WW8\u0011\u0018";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\u0002BL-\u001aV\u001e";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "OE]0\u001b";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "CQJ-";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "SVH+\u0011U\u000bM6\u001bRG_/\u0011PE\u001e'\u0006PKLb\u0007VKN2\u001dLC\u001e!\u0015OAL#TRV[4\u001dGS";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "SVH+\u0011U\u000bM6\u001bRG_/\u0011PE";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "SVH+\u0011U\u000bM6\u001bRG_/\u0011PE\u001e'\u0006PKLb\u0006GH[#\u0007GMP%TAES'\u0006C";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "SVH+\u0011U\u000bM6\u0015PP]#\u0019GV_b\u0011PVQ0TMT[,\u001dLC\u001e!\u0015OAL#";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "SVH+\u0011U\u000bM7\u0006DE]'\u0017JEP%\u0011F\u001e\u001e,\u001b\u0002G_/\u0011PE";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "SVH+\u0011U\u000bM7\u0006DE]'\u0017JEP%\u0011F\u001e\u001e'\u0006PKLb\u0007GPJ+\u001aE\u0004N0\u0011TM[5TFMM2\u0018C]";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "SVH+\u0011U\u000bM7\u0006DE]'\u0017JEP%\u0011F\u001e\u001e,\u001b\u0002WK0\u0012CG[";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "SVH+\u0011U\u000bM7\u0006DE]'\u0017JEP%\u0011F\u0004";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "PKJ#\u0000KKP";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public Size c() {
        return this.e;
    }

    public void setCameraCallback(h hVar) {
        this.f = hVar;
    }

    public Camera b() {
        return this.c;
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        try {
            if (this.c != null) {
                try {
                    if (this.a.getSurface() == null) {
                        Log.e(z[32]);
                        a();
                        return;
                    }
                    try {
                        if (!surfaceHolder.isCreating()) {
                            this.c.stopPreview();
                        }
                        this.c.setPreviewDisplay(surfaceHolder);
                        g();
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Throwable e2) {
                        this.c.release();
                        this.c = null;
                        Log.b(z[31], e2);
                        a();
                    } catch (Throwable e22) {
                        this.c.release();
                        this.c = null;
                        Log.b(z[33], e22);
                        a();
                    }
                } catch (RuntimeException e3) {
                    throw e3;
                }
            } else if (this.d == null) {
                Log.e(z[30]);
                a();
            }
        } catch (RuntimeException e32) {
            throw e32;
        } catch (RuntimeException e322) {
            throw e322;
        }
    }

    static SurfaceHolder a(QrCodeView qrCodeView) {
        return qrCodeView.a;
    }

    public void setThreadHandler(Handler handler) {
        this.d = handler;
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void g() {
        /*
        r12 = this;
        r5 = g;
        r1 = r12.getWidth();
        r2 = r12.getHeight();
        r0 = r12.c;	 Catch:{ RuntimeException -> 0x001a }
        if (r0 != 0) goto L_0x001c;
    L_0x000e:
        r0 = z;	 Catch:{ RuntimeException -> 0x001a }
        r1 = 5;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x001a }
        com.whatsapp.util.Log.e(r0);	 Catch:{ RuntimeException -> 0x001a }
        r12.a();	 Catch:{ RuntimeException -> 0x001a }
    L_0x0019:
        return;
    L_0x001a:
        r0 = move-exception;
        throw r0;
    L_0x001c:
        r0 = r12.getContext();
        r3 = z;
        r4 = 8;
        r3 = r3[r4];
        r0 = r0.getSystemService(r3);
        r0 = (android.view.WindowManager) r0;
        r6 = r0.getDefaultDisplay();
        r7 = r6.getOrientation();
        if (r7 == 0) goto L_0x0039;
    L_0x0036:
        r0 = 2;
        if (r7 != r0) goto L_0x0224;
    L_0x0039:
        r0 = 1;
    L_0x003a:
        r3 = r12.c;
        r8 = r3.getParameters();
        r3 = r8.getSupportedPreviewSizes();
        if (r3 != 0) goto L_0x029b;
    L_0x0046:
        r3 = z;
        r4 = 15;
        r3 = r3[r4];
        com.whatsapp.util.Log.i(r3);
        r3 = new java.util.ArrayList;
        r3.<init>();
        r4 = new android.hardware.Camera$Size;
        r9 = r12.c;
        r9.getClass();
        r10 = 640; // 0x280 float:8.97E-43 double:3.16E-321;
        r11 = 480; // 0x1e0 float:6.73E-43 double:2.37E-321;
        r4.<init>(r9, r10, r11);
        r3.add(r4);
        r4 = r3;
    L_0x0066:
        if (r0 == 0) goto L_0x0227;
    L_0x0068:
        r3 = r2;
    L_0x0069:
        if (r0 == 0) goto L_0x022a;
    L_0x006b:
        r1 = com.whatsapp.camera.CameraView.a(r4, r3, r1);
        r12.e = r1;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 22;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r2 = r12.e;
        r2 = r2.width;
        r1 = r1.append(r2);
        r2 = "x";
        r1 = r1.append(r2);
        r2 = r12.e;
        r2 = r2.height;
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r1 = 0;
        r2 = android.os.Build.VERSION.SDK_INT;
        r3 = 9;
        if (r2 < r3) goto L_0x00b8;
    L_0x00a5:
        r2 = new android.hardware.Camera$CameraInfo;
        r2.<init>();
        r1 = 0;
        android.hardware.Camera.getCameraInfo(r1, r2);	 Catch:{ RuntimeException -> 0x022d }
        r1 = r2.facing;	 Catch:{ RuntimeException -> 0x022d }
        r3 = 1;
        if (r1 != r3) goto L_0x022f;
    L_0x00b3:
        r1 = 1;
    L_0x00b4:
        r2 = r2.orientation;
        if (r5 == 0) goto L_0x0297;
    L_0x00b8:
        if (r7 == 0) goto L_0x00bd;
    L_0x00ba:
        r2 = 2;
        if (r7 != r2) goto L_0x00c7;
    L_0x00bd:
        r3 = r6.getWidth();
        r2 = r6.getHeight();
        if (r5 == 0) goto L_0x00cf;
    L_0x00c7:
        r3 = r6.getHeight();
        r2 = r6.getWidth();
    L_0x00cf:
        if (r3 <= r2) goto L_0x00d4;
    L_0x00d1:
        r2 = 0;
        if (r5 == 0) goto L_0x0297;
    L_0x00d4:
        r2 = 90;
        r3 = r2;
        r4 = r1;
    L_0x00d8:
        r1 = 0;
        switch(r7) {
            case 0: goto L_0x0232;
            case 1: goto L_0x0235;
            case 2: goto L_0x0239;
            case 3: goto L_0x023d;
            default: goto L_0x00dc;
        };
    L_0x00dc:
        r2 = r1;
    L_0x00dd:
        if (r4 == 0) goto L_0x00e9;
    L_0x00df:
        r1 = r3 + r2;
        r1 = r1 % 360;
        r1 = 360 - r1;
        r1 = r1 % 360;
        if (r5 == 0) goto L_0x00ef;
    L_0x00e9:
        r1 = r3 - r2;
        r1 = r1 + 360;
        r1 = r1 % 360;
    L_0x00ef:
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r7 = z;
        r9 = 13;
        r7 = r7[r9];
        r6 = r6.append(r7);
        r2 = r6.append(r2);
        r6 = z;
        r7 = 6;
        r6 = r6[r7];
        r2 = r2.append(r6);
        r2 = r2.append(r3);
        r3 = z;
        r6 = 11;
        r3 = r3[r6];
        r2 = r2.append(r3);
        r2 = r2.append(r1);
        r3 = z;
        r6 = 23;
        r3 = r3[r6];
        r2 = r2.append(r3);
        r2 = r2.append(r4);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r2 = android.os.Build.VERSION.SDK_INT;
        r3 = 8;
        if (r2 < r3) goto L_0x0263;
    L_0x0138:
        r2 = r12.c;	 Catch:{ RuntimeException -> 0x0242 }
        r2.setDisplayOrientation(r1);	 Catch:{ RuntimeException -> 0x0242 }
    L_0x013d:
        r0 = r12.e;
        r0 = r0.width;
        r1 = r12.e;
        r1 = r1.height;
        r8.setPreviewSize(r0, r1);
        r0 = r8.getSupportedFocusModes();
        if (r0 == 0) goto L_0x01b5;
    L_0x014e:
        r1 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x0287 }
        r1.<init>();	 Catch:{ RuntimeException -> 0x0287 }
        r2 = z;	 Catch:{ RuntimeException -> 0x0287 }
        r3 = 18;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x0287 }
        r1 = r1.append(r2);	 Catch:{ RuntimeException -> 0x0287 }
        r2 = r0.toArray();	 Catch:{ RuntimeException -> 0x0287 }
        r2 = java.util.Arrays.deepToString(r2);	 Catch:{ RuntimeException -> 0x0287 }
        r1 = r1.append(r2);	 Catch:{ RuntimeException -> 0x0287 }
        r1 = r1.toString();	 Catch:{ RuntimeException -> 0x0287 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ RuntimeException -> 0x0287 }
        r1 = z;	 Catch:{ RuntimeException -> 0x0287 }
        r2 = 25;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x0287 }
        r1 = r0.contains(r1);	 Catch:{ RuntimeException -> 0x0287 }
        if (r1 == 0) goto L_0x0187;
    L_0x017c:
        r1 = z;	 Catch:{ RuntimeException -> 0x0289 }
        r2 = 16;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x0289 }
        r8.setFocusMode(r1);	 Catch:{ RuntimeException -> 0x0289 }
        if (r5 == 0) goto L_0x01be;
    L_0x0187:
        r1 = z;	 Catch:{ RuntimeException -> 0x028b }
        r2 = 14;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x028b }
        r1 = r0.contains(r1);	 Catch:{ RuntimeException -> 0x028b }
        if (r1 == 0) goto L_0x019e;
    L_0x0193:
        r1 = z;	 Catch:{ RuntimeException -> 0x028d }
        r2 = 24;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x028d }
        r8.setFocusMode(r1);	 Catch:{ RuntimeException -> 0x028d }
        if (r5 == 0) goto L_0x01be;
    L_0x019e:
        r1 = z;	 Catch:{ RuntimeException -> 0x028f }
        r2 = 12;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x028f }
        r0 = r0.contains(r1);	 Catch:{ RuntimeException -> 0x028f }
        if (r0 == 0) goto L_0x01be;
    L_0x01aa:
        r0 = z;	 Catch:{ RuntimeException -> 0x0291 }
        r1 = 19;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x0291 }
        r8.setFocusMode(r0);	 Catch:{ RuntimeException -> 0x0291 }
        if (r5 == 0) goto L_0x01be;
    L_0x01b5:
        r0 = z;	 Catch:{ RuntimeException -> 0x0291 }
        r1 = 10;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x0291 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ RuntimeException -> 0x0291 }
    L_0x01be:
        r0 = r8.getSupportedFlashModes();
        if (r0 == 0) goto L_0x01e7;
    L_0x01c4:
        r1 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x0293 }
        r1.<init>();	 Catch:{ RuntimeException -> 0x0293 }
        r2 = z;	 Catch:{ RuntimeException -> 0x0293 }
        r3 = 2;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x0293 }
        r1 = r1.append(r2);	 Catch:{ RuntimeException -> 0x0293 }
        r2 = r0.toArray();	 Catch:{ RuntimeException -> 0x0293 }
        r2 = java.util.Arrays.deepToString(r2);	 Catch:{ RuntimeException -> 0x0293 }
        r1 = r1.append(r2);	 Catch:{ RuntimeException -> 0x0293 }
        r1 = r1.toString();	 Catch:{ RuntimeException -> 0x0293 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ RuntimeException -> 0x0293 }
        if (r5 == 0) goto L_0x01f0;
    L_0x01e7:
        r1 = z;	 Catch:{ RuntimeException -> 0x0293 }
        r2 = 9;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x0293 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ RuntimeException -> 0x0293 }
    L_0x01f0:
        if (r0 == 0) goto L_0x0206;
    L_0x01f2:
        r1 = z;	 Catch:{ RuntimeException -> 0x0295 }
        r2 = 4;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x0295 }
        r0 = r0.contains(r1);	 Catch:{ RuntimeException -> 0x0295 }
        if (r0 == 0) goto L_0x0206;
    L_0x01fd:
        r0 = z;	 Catch:{ RuntimeException -> 0x0295 }
        r1 = 20;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x0295 }
        r8.setFlashMode(r0);	 Catch:{ RuntimeException -> 0x0295 }
    L_0x0206:
        r0 = r12.c;	 Catch:{ RuntimeException -> 0x0222 }
        r0.setParameters(r8);	 Catch:{ RuntimeException -> 0x0222 }
        r0 = r12.c;	 Catch:{ RuntimeException -> 0x0222 }
        r0.startPreview();	 Catch:{ RuntimeException -> 0x0222 }
        r0 = r12.c;	 Catch:{ RuntimeException -> 0x0222 }
        r1 = r12.b;	 Catch:{ RuntimeException -> 0x0222 }
        r0.autoFocus(r1);	 Catch:{ RuntimeException -> 0x0222 }
        r0 = r12.f;	 Catch:{ RuntimeException -> 0x0222 }
        if (r0 == 0) goto L_0x0019;
    L_0x021b:
        r0 = r12.f;	 Catch:{ RuntimeException -> 0x0222 }
        r0.b();	 Catch:{ RuntimeException -> 0x0222 }
        goto L_0x0019;
    L_0x0222:
        r0 = move-exception;
        throw r0;
    L_0x0224:
        r0 = 0;
        goto L_0x003a;
    L_0x0227:
        r3 = r1;
        goto L_0x0069;
    L_0x022a:
        r1 = r2;
        goto L_0x006b;
    L_0x022d:
        r0 = move-exception;
        throw r0;
    L_0x022f:
        r1 = 0;
        goto L_0x00b4;
    L_0x0232:
        r1 = 0;
        if (r5 == 0) goto L_0x00dc;
    L_0x0235:
        r1 = 90;
        if (r5 == 0) goto L_0x00dc;
    L_0x0239:
        r1 = 180; // 0xb4 float:2.52E-43 double:8.9E-322;
        if (r5 == 0) goto L_0x00dc;
    L_0x023d:
        r1 = 270; // 0x10e float:3.78E-43 double:1.334E-321;
        r2 = r1;
        goto L_0x00dd;
    L_0x0242:
        r2 = move-exception;
        r3 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x027d }
        r3.<init>();	 Catch:{ RuntimeException -> 0x027d }
        r4 = z;	 Catch:{ RuntimeException -> 0x027d }
        r6 = 21;
        r4 = r4[r6];	 Catch:{ RuntimeException -> 0x027d }
        r3 = r3.append(r4);	 Catch:{ RuntimeException -> 0x027d }
        r2 = r2.toString();	 Catch:{ RuntimeException -> 0x027d }
        r2 = r3.append(r2);	 Catch:{ RuntimeException -> 0x027d }
        r2 = r2.toString();	 Catch:{ RuntimeException -> 0x027d }
        com.whatsapp.util.Log.e(r2);	 Catch:{ RuntimeException -> 0x027d }
        if (r5 == 0) goto L_0x013d;
    L_0x0263:
        r2 = z;	 Catch:{ RuntimeException -> 0x027f }
        r3 = 1;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x027f }
        r8.set(r2, r1);	 Catch:{ RuntimeException -> 0x027f }
        r1 = z;	 Catch:{ RuntimeException -> 0x027f }
        r2 = 3;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x027f }
        if (r0 == 0) goto L_0x0281;
    L_0x0272:
        r0 = z;	 Catch:{ RuntimeException -> 0x027f }
        r2 = 17;
        r0 = r0[r2];	 Catch:{ RuntimeException -> 0x027f }
    L_0x0278:
        r8.set(r1, r0);
        goto L_0x013d;
    L_0x027d:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x027f }
    L_0x027f:
        r0 = move-exception;
        throw r0;
    L_0x0281:
        r0 = z;
        r2 = 7;
        r0 = r0[r2];
        goto L_0x0278;
    L_0x0287:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0289 }
    L_0x0289:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x028b }
    L_0x028b:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x028d }
    L_0x028d:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x028f }
    L_0x028f:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x0291 }
    L_0x0291:
        r0 = move-exception;
        throw r0;
    L_0x0293:
        r0 = move-exception;
        throw r0;
    L_0x0295:
        r0 = move-exception;
        throw r0;
    L_0x0297:
        r3 = r2;
        r4 = r1;
        goto L_0x00d8;
    L_0x029b:
        r4 = r3;
        goto L_0x0066;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.qrcode.QrCodeView.g():void");
    }

    public QrCodeView(Context context) {
        this(context, null);
    }

    private void f() {
        try {
            if (this.c == null) {
                try {
                    this.c = Camera.open();
                    if (this.c == null && VERSION.SDK_INT >= 9) {
                        this.c = Camera.open(0);
                    }
                    try {
                        this.c.setErrorCallback(new i(this));
                    } catch (Throwable e) {
                        try {
                            if (this.c != null) {
                                this.c.release();
                            }
                            this.c = null;
                            Log.b(z[29], e);
                            a();
                        } catch (Exception e2) {
                            throw e2;
                        }
                    }
                } catch (Exception e22) {
                    throw e22;
                } catch (Exception e222) {
                    throw e222;
                }
            }
        } catch (Exception e2222) {
            throw e2222;
        }
    }

    private void d() {
        boolean z = g;
        try {
            if (this.c == null) {
                if (this.d != null) {
                    this.d.post(new n(this));
                    if (!z) {
                        return;
                    }
                }
                try {
                    f();
                    if (!z) {
                        return;
                    }
                } catch (IOException e) {
                    try {
                        throw e;
                    } catch (IOException e2) {
                        throw e2;
                    }
                }
            }
            try {
                if (VERSION.SDK_INT >= 8) {
                    try {
                        this.c.reconnect();
                        return;
                    } catch (Throwable e3) {
                        try {
                            this.c.release();
                            this.c = null;
                            Log.b(z[0], e3);
                            a();
                            if (!z) {
                                return;
                            }
                        } catch (IOException e22) {
                            throw e22;
                        }
                    }
                }
                this.c.release();
                this.c = null;
                d();
            } catch (RuntimeException e4) {
                throw e4;
            }
        } catch (IOException e222) {
            throw e222;
        } catch (IOException e2222) {
            throw e2222;
        }
    }

    public QrCodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new m(this);
        this.a = getHolder();
        this.a.addCallback(this);
        this.a.setType(3);
    }

    private void a() {
        try {
            if (this.f != null) {
                this.f.a();
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    private void e() {
        Log.i(z[27]);
        if (this.c != null) {
            try {
                this.c.stopPreview();
            } catch (Throwable e) {
                Log.c(z[26], e);
            }
            try {
                this.c.release();
            } catch (Throwable e2) {
                Log.c(z[28], e2);
            }
            this.c = null;
        }
    }

    static Camera f(QrCodeView qrCodeView) {
        return qrCodeView.c;
    }

    static Camera a(QrCodeView qrCodeView, Camera camera) {
        qrCodeView.c = camera;
        return camera;
    }

    public QrCodeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    static void c(QrCodeView qrCodeView) {
        qrCodeView.f();
    }

    static void b(QrCodeView qrCodeView) {
        qrCodeView.a();
    }

    static void d(QrCodeView qrCodeView) {
        qrCodeView.e();
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        e();
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        d();
    }

    static void e(QrCodeView qrCodeView) {
        qrCodeView.d();
    }
}
