package com.whatsapp.camera;

import android.content.Context;
import android.content.Intent;
import android.content.Intent.ShortcutIconResource;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.format.DateUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import com.whatsapp.App;
import com.whatsapp.ConversationTextEntry;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.PhotoView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.VideoView;
import com.whatsapp.arj;
import com.whatsapp.l5;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.pz;
import com.whatsapp.util.Log;
import com.whatsapp.util.ag;
import com.whatsapp.util.c_;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class CameraActivity extends DialogToastActivity {
    public static int I;
    private static final String[] U;
    private l5 A;
    private View B;
    private File C;
    private Rect D;
    private long E;
    private ImageView F;
    private TextEmojiLabel G;
    private ImageButton H;
    private ZoomOverlay J;
    private ProgressBar K;
    private Uri L;
    private ShutterOverlay M;
    private int N;
    private boolean O;
    private az P;
    private OnGlobalLayoutListener Q;
    private View R;
    private View S;
    private ImageButton T;
    private CameraView n;
    private pz o;
    private View p;
    private View q;
    private PhotoView r;
    private ViewGroup s;
    private View t;
    private File u;
    private boolean v;
    private ConversationTextEntry w;
    private TextView x;
    private AutofocusOverlay y;
    private Handler z;

    static {
        String[] strArr = new String[40];
        String str = "I\t*iDK\t$x_\\\u00013u\u0019Y\r3yFZ\u0000(xYZ\u001a\"z_O\u001f";
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
                        i3 = 42;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_editTextStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 71;
                        break;
                    case at.o /*3*/:
                        i3 = 12;
                        break;
                    default:
                        i3 = 54;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "I\t*iDK\t$x_\\\u00013u\u0019Y\r3yFZ\u001a\"z_O\u001f";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "K\u000b$iZO\u001a(aS^\r5SDE\u001c&x_E\u0006";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "E\u000e!";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "E\u0006";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "K\u0006#~YC\fieX^\r)x\u0018O\u00103~W\u0004\u001b/cD^\u000b2x\u0018d)\nI";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "K\u0006#~YC\fieX^\r)x\u0018O\u00103~W\u0004\u001b/cD^\u000b2x\u0018c&\u0013Ix~";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "K\u0006#~YC\fieX^\r)x\u0018O\u00103~W\u0004\u001b/cD^\u000b2x\u0018c+\bBix-\u0014Ccx+\u0002";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "I\t*iDK\t$x_\\\u00013u\u0019N\r4xDE\u0011";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "I\t*iDK\t$x_\\\u00013u\u0019Y\u001c&~B\\\u0001#iYI\t7xCX\r";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "K\u000b$iZO\u001a(aS^\r5SDE\u001c&x_E\u0006";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    str = "\u0004\u000578";
                    obj = 11;
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    strArr2 = strArr3;
                    str = "L\u0004.|\u001bB";
                    obj = 12;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "I\t*iDK\t$x_\\\u00013u\u0019Y\r3yFZ\u001a\"z_O\u001f";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "I\t*iDK\t$x_\\\u00013u\u0019Y\r3yFZ\u001a\"z_O\u001fibCF\u0004%eBG\t7";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "I\t*iDK";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "L\u0004.|\u001bB";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "X\r$x";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "Z\u001a\"z_O\u001f";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "I\t*iDK\t$x_\\\u00013u\u0019I\u001a\"mBOG)c\u001bG\rjcD\u0007\u00054kE^\u00075i\u001bN\n";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "I\t*iDK\t$x_\\\u00013u\u0016H\u00072bUOH3c\u0016G\t.b";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "K\u0006#~YC\fieX^\r)x\u0018K\u000b3eYDF\u0004^sk<\u0002Seb'\u0015Xu\u007f<";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "@\u0001#";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "I\t*iDK\t$x_\\\u00013u\u0019I\u001a\"mBO";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "K\n(~BC\u0006 ,R_\rgxY\n\u0006&x_\\\rg`_H\u001a&~_O\u001bga_Y\u001b.bQ";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "\\\u0001#iYZ\u001a\"z_O\u001fhkS^\u001e.hSE\u001c/y[H";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "\\\u0001#iYZ\u001a\"z_O\u001fhkS^\u001e.hSE\u001c/y[H";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "I\t*iDK\t$x_\\\u00013u\u0019Y\r3yF\\\u0001#iYZ\u001a\"z_O\u001f";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "I\t*iDK\t$x_\\\u00013u\u0019Y\u001c(|@C\f\"cUK\u00183yDOH";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "K\u0006#~YC\fieX^\r)x\u0018O\u00103~W\u0004;\u0013^sk%";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "I\t*iDK\t$x_\\\u00013u\u0019Y\u001c(|@C\f\"cUK\u00183yDO";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "d\u0007g\u007fFK\u000b\"";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "Y\u0003.|iZ\u001a\"z_O\u001f";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "I\t*iDK\t$x_\\\u00013u\u0019Y\u001c(|@C\f\"cUK\u00183yDOH";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "B\t7x_I7!iSN\n&o]u\r)mTF\r#";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "\\\u0001#iY\u0005B";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "\\\u0001%~W^\u00075";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "I\t*iDK\t$x_\\\u00013u\u0019^\t,iWD\f4iXN\u0018.oB_\u001a\"";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "I\t*iDK\t$x_\\\u00013u\u0019X\r4xWX\u001c";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    U = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "I\t*iDK\t$x_\\\u00013u\u0019Y\r3yFZ\u001a\"z_O\u001fibCF\u0004%eBG\t7";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private Intent g() {
        Parcelable intent = new Intent(this, CameraActivity.class);
        intent.addFlags(268435456);
        intent.addFlags(67108864);
        intent.addFlags(8388608);
        intent.addFlags(1073741824);
        Intent intent2 = new Intent();
        intent2.putExtra(U[7], intent);
        intent2.putExtra(U[6], getString(2131230878));
        intent2.putExtra(U[8], ShortcutIconResource.fromContext(this, 2130839613));
        return intent2;
    }

    static View v(CameraActivity cameraActivity) {
        return cameraActivity.t;
    }

    static ProgressBar x(CameraActivity cameraActivity) {
        return cameraActivity.K;
    }

    static boolean u(CameraActivity cameraActivity) {
        return cameraActivity.v;
    }

    static CameraView j(CameraActivity cameraActivity) {
        return cameraActivity.n;
    }

    private void c() {
        try {
            Bitmap frameAtTime;
            long j;
            Log.i(U[28]);
            if (this.A == null) {
                this.G.setText(2131230880);
            }
            this.s.removeView(this.n);
            this.B.setVisibility(8);
            this.t.setVisibility(0);
            this.R.setVisibility(8);
            this.q.setVisibility(8);
            this.r.setVisibility(8);
            View findViewById = findViewById(2131755395);
            findViewById.setVisibility(0);
            VideoView videoView = (VideoView) findViewById(2131755396);
            videoView.setVisibility(0);
            videoView.setVideoPath(this.C.getAbsolutePath());
            videoView.requestFocus();
            videoView.seekTo(1);
            long currentTimeMillis = System.currentTimeMillis() - this.E;
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                mediaMetadataRetriever.setDataSource(this.C.getAbsolutePath());
                currentTimeMillis = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
                frameAtTime = mediaMetadataRetriever.getFrameAtTime(0);
                j = currentTimeMillis;
            } catch (Exception e) {
                Log.e(U[27] + e.toString());
                frameAtTime = ag.e(this.C.getAbsolutePath());
                j = currentTimeMillis;
            } catch (NoSuchMethodError e2) {
                Log.e(U[26] + e2.toString());
                frameAtTime = ag.e(this.C.getAbsolutePath());
                j = currentTimeMillis;
            }
            if (frameAtTime != null) {
                try {
                    videoView.setBackgroundDrawable(new BitmapDrawable(getResources(), frameAtTime));
                } catch (Exception e3) {
                    throw e3;
                }
            }
            mediaMetadataRetriever.release();
            View findViewById2 = findViewById(2131755397);
            findViewById(2131755404).setOnClickListener(new u(this));
            findViewById(2131755369).setOnClickListener(new v(this));
            SeekBar seekBar = (SeekBar) findViewById(2131755400);
            seekBar.setProgress(0);
            seekBar.setMax((int) j);
            seekBar.setVisibility(0);
            TextView textView = (TextView) findViewById(2131755399);
            TextView textView2 = (TextView) findViewById(2131755401);
            textView.setText(DateUtils.formatElapsedTime(0));
            textView2.setText(DateUtils.formatElapsedTime(j / 1000));
            seekBar.setOnSeekBarChangeListener(new o(this, videoView, textView));
            OnClickListener zVar = new z(this, videoView, findViewById2, new i(this, videoView, seekBar, findViewById2));
            findViewById.setOnClickListener(zVar);
            findViewById2.setOnClickListener(zVar);
        } catch (Exception e32) {
            throw e32;
        }
    }

    private void d() {
        Log.i(U[38]);
        this.F.setEnabled(false);
        this.S.setEnabled(false);
        this.H.setEnabled(false);
        this.n.a(new g(this));
    }

    static void a(CameraActivity cameraActivity, String str) {
        cameraActivity.a(str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onCreate(android.os.Bundle r12) {
        /*
        r11 = this;
        r10 = 0;
        r9 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r8 = 8;
        r7 = -1;
        r6 = 1;
        r1 = I;
        super.onCreate(r12);
        r0 = U;
        r2 = 24;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        r0 = com.whatsapp.App.ay;
        if (r0 == 0) goto L_0x0028;
    L_0x0019:
        r0 = com.whatsapp.App.aK;
        r0 = r0.E();
        if (r0 == 0) goto L_0x0028;
    L_0x0021:
        r0 = com.whatsapp.App.t(r11);
        r2 = 3;
        if (r0 == r2) goto L_0x0048;
    L_0x0028:
        r0 = U;
        r1 = 20;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = U;
        r1 = 21;
        r0 = r0[r1];
        com.whatsapp.App.v(r0);
        r0 = new android.content.Intent;
        r1 = com.whatsapp.Main.class;
        r0.<init>(r11, r1);
        r11.startActivity(r0);
        r11.finish();
    L_0x0047:
        return;
    L_0x0048:
        r0 = 0;
        r0 = com.whatsapp.util.WhatsAppLibLoader.a(r0);
        if (r0 != 0) goto L_0x005c;
    L_0x004f:
        r0 = U;
        r1 = 25;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r11.finish();
        goto L_0x0047;
    L_0x005c:
        r0 = U;
        r2 = 22;
        r0 = r0[r2];
        r2 = r11.getIntent();
        r2 = r2.getAction();
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x007b;
    L_0x0070:
        r0 = r11.g();
        r11.setResult(r7, r0);
        r11.finish();
        goto L_0x0047;
    L_0x007b:
        r2 = com.whatsapp.App.T();
        r0 = com.whatsapp.a59.e;
        r0 = r0 * 1024;
        r0 = r0 * 1024;
        r4 = (long) r0;
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 >= 0) goto L_0x009a;
    L_0x008a:
        r0 = com.whatsapp.App.p;
        r0 = r11.getApplicationContext();
        r1 = 2131231112; // 0x7f080188 float:1.8078296E38 double:1.052968076E-314;
        com.whatsapp.App.b(r0, r1, r6);
        r11.finish();
        goto L_0x0047;
    L_0x009a:
        r0 = r11.getWindow();
        r0.setFlags(r9, r9);
        r0 = android.os.Build.VERSION.SDK_INT;
        r2 = 21;
        if (r0 >= r2) goto L_0x00b0;
    L_0x00a7:
        r0 = r11.getWindow();
        r2 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        r0.clearFlags(r2);
    L_0x00b0:
        r0 = r11.getWindow();
        r2 = new android.graphics.drawable.ColorDrawable;
        r3 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r2.<init>(r3);
        r0.setBackgroundDrawable(r2);
        r0 = new com.whatsapp.camera.CameraLayout;
        r0.<init>(r11);
        r2 = r11.getWindow();
        r2 = r2.getLayoutInflater();
        r3 = 2130903091; // 0x7f030033 float:1.741299E38 double:1.052806012E-314;
        com.whatsapp.aam.a(r2, r3, r0, r6);
        r11.setContentView(r0);
        r0 = r11.getIntent();
        r2 = U;
        r3 = 19;
        r2 = r2[r3];
        r0 = r0.getBooleanExtra(r2, r6);
        r11.O = r0;
        r0 = r11.getIntent();
        r2 = U;
        r3 = 23;
        r2 = r2[r3];
        r2 = r0.getStringExtra(r2);
        r0 = 2131755127; // 0x7f100077 float:1.9141124E38 double:1.0532269736E-314;
        r0 = r11.findViewById(r0);
        r0 = (com.whatsapp.TextEmojiLabel) r0;
        r11.G = r0;
        if (r2 == 0) goto L_0x0147;
    L_0x00ff:
        r0 = com.whatsapp.App.as;
        r0 = r0.b(r2);
        r11.A = r0;
        r0 = r11.A;
        r0 = r0.c();
        if (r0 != 0) goto L_0x0117;
    L_0x010f:
        r0 = r11.A;
        r0 = r0.m();
        if (r0 == 0) goto L_0x012f;
    L_0x0117:
        r0 = r11.G;
        r2 = 2131231874; // 0x7f080482 float:1.8079841E38 double:1.0529684523E-314;
        r3 = new java.lang.Object[r6];
        r4 = r11.A;
        r4 = r4.a(r11);
        r3[r10] = r4;
        r2 = r11.getString(r2, r3);
        r0.a(r2);
        if (r1 == 0) goto L_0x0153;
    L_0x012f:
        r0 = r11.G;
        r2 = 2131231875; // 0x7f080483 float:1.8079843E38 double:1.052968453E-314;
        r3 = new java.lang.Object[r6];
        r4 = r11.A;
        r4 = r4.a(r11);
        r3[r10] = r4;
        r2 = r11.getString(r2, r3);
        r0.a(r2);
        if (r1 == 0) goto L_0x0153;
    L_0x0147:
        r0 = r11.G;
        r2 = 2131230879; // 0x7f08009f float:1.8077823E38 double:1.0529679607E-314;
        r2 = r11.getString(r2);
        r0.setText(r2);
    L_0x0153:
        r0 = 2131755393; // 0x7f100181 float:1.9141664E38 double:1.053227105E-314;
        r0 = r11.findViewById(r0);
        r11.t = r0;
        r0 = 2131755387; // 0x7f10017b float:1.9141652E38 double:1.053227102E-314;
        r0 = r11.findViewById(r0);
        r11.B = r0;
        r0 = 2131755394; // 0x7f100182 float:1.9141666E38 double:1.0532271055E-314;
        r0 = r11.findViewById(r0);
        r0 = (com.whatsapp.PhotoView) r0;
        r11.r = r0;
        r0 = 2131755389; // 0x7f10017d float:1.9141656E38 double:1.053227103E-314;
        r0 = r11.findViewById(r0);
        r0 = (com.whatsapp.camera.CameraView) r0;
        r11.n = r0;
        r0 = r11.n;
        r2 = new com.whatsapp.camera.d;
        r2.<init>(r11);
        r0.setCameraCallback(r2);
        r0 = 2131755388; // 0x7f10017c float:1.9141654E38 double:1.0532271025E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.view.ViewGroup) r0;
        r11.s = r0;
        r0 = new com.whatsapp.camera.AutofocusOverlay;
        r0.<init>(r11);
        r11.y = r0;
        r0 = r11.y;
        r0.setVisibility(r8);
        r0 = r11.s;
        r2 = r11.y;
        r0.addView(r2, r7, r7);
        r0 = new com.whatsapp.camera.ZoomOverlay;
        r0.<init>(r11);
        r11.J = r0;
        r0 = r11.J;
        r0.setVisibility(r8);
        r0 = r11.s;
        r2 = r11.J;
        r0.addView(r2, r7, r7);
        r0 = new com.whatsapp.camera.ShutterOverlay;
        r0.<init>(r11);
        r11.M = r0;
        r0 = r11.s;
        r2 = r11.M;
        r0.addView(r2, r7, r7);
        r0 = 2131755407; // 0x7f10018f float:1.9141692E38 double:1.053227112E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r11.x = r0;
        r0 = 2131755408; // 0x7f100190 float:1.9141694E38 double:1.0532271124E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.ProgressBar) r0;
        r11.K = r0;
        r0 = r11.K;
        r2 = 100;
        r0.setMax(r2);
        r0 = 2131755409; // 0x7f100191 float:1.9141696E38 double:1.053227113E-314;
        r0 = r11.findViewById(r0);
        r11.p = r0;
        r0 = 2131755391; // 0x7f10017f float:1.914166E38 double:1.053227104E-314;
        r0 = r11.findViewById(r0);
        r11.S = r0;
        r0 = android.os.Build.VERSION.SDK_INT;
        r2 = 9;
        if (r0 < r2) goto L_0x01ff;
    L_0x01f9:
        r0 = android.hardware.Camera.getNumberOfCameras();
        if (r0 > r6) goto L_0x0206;
    L_0x01ff:
        r0 = r11.S;
        r0.setVisibility(r8);
        if (r1 == 0) goto L_0x0210;
    L_0x0206:
        r0 = r11.S;
        r2 = new com.whatsapp.camera.ao;
        r2.<init>(r11);
        r0.setOnClickListener(r2);
    L_0x0210:
        r0 = 2131755392; // 0x7f100180 float:1.9141662E38 double:1.0532271045E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.ImageButton) r0;
        r11.H = r0;
        r0 = r11.H;
        r2 = new com.whatsapp.camera.ak;
        r2.<init>(r11);
        r0.setOnClickListener(r2);
        r0 = new com.whatsapp.camera.az;
        r2 = com.whatsapp.App.z();
        r0.<init>(r11, r2);
        r11.P = r0;
        r0 = r11.P;
        r0 = r0.canDetectOrientation();
        if (r0 == 0) goto L_0x023f;
    L_0x0238:
        r0 = r11.P;
        r0.enable();
        if (r1 == 0) goto L_0x0242;
    L_0x023f:
        r0 = 0;
        r11.P = r0;
    L_0x0242:
        r0 = 2131755390; // 0x7f10017e float:1.9141658E38 double:1.0532271035E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r11.F = r0;
        r0 = r11.F;
        r1 = new com.whatsapp.camera.w;
        r1.<init>(r11);
        r0.setOnClickListener(r1);
        r0 = android.os.Build.VERSION.SDK_INT;
        if (r0 < r8) goto L_0x0265;
    L_0x025b:
        r0 = r11.F;
        r1 = new com.whatsapp.camera.aa;
        r1.<init>(r11);
        r0.setOnLongClickListener(r1);
    L_0x0265:
        r0 = r11.F;
        r1 = new com.whatsapp.camera.a5;
        r1.<init>(r11);
        r0.setOnTouchListener(r1);
        r0 = 2131755508; // 0x7f1001f4 float:1.9141897E38 double:1.053227162E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.ImageButton) r0;
        r11.T = r0;
        r0 = r11.T;
        r1 = new com.whatsapp.camera.q;
        r1.<init>(r11);
        r0.setOnClickListener(r1);
        r0 = 2131755554; // 0x7f100222 float:1.914199E38 double:1.0532271846E-314;
        r0 = r11.findViewById(r0);
        r0 = (com.whatsapp.ConversationTextEntry) r0;
        r11.w = r0;
        r0 = r11.w;
        r0.setInputEnterDone(r6);
        r0 = r11.w;
        r1 = new android.text.InputFilter[r6];
        r2 = new com.whatsapp.aes;
        r2.<init>(r9);
        r1[r10] = r2;
        r0.setFilters(r1);
        r0 = r11.w;
        r1 = new com.whatsapp.camera.e;
        r1.<init>(r11);
        r0.setOnEditorActionListener(r1);
        r1 = r11.w;
        r2 = new com.whatsapp.hu;
        r3 = r11.w;
        r0 = 2131755755; // 0x7f1002eb float:1.9142398E38 double:1.053227284E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r4 = 30;
        r2.<init>(r3, r0, r9, r4);
        r1.addTextChangedListener(r2);
        r0 = new com.whatsapp.camera.m;
        r0.<init>(r11, r11);
        r11.o = r0;
        r0 = r11.o;
        r1 = new com.whatsapp.camera.a;
        r1.<init>(r11);
        r0.a(r1);
        r0 = 2131755405; // 0x7f10018d float:1.9141688E38 double:1.053227111E-314;
        r0 = r11.findViewById(r0);
        r11.R = r0;
        r0 = 2131755406; // 0x7f10018e float:1.914169E38 double:1.0532271114E-314;
        r0 = r11.findViewById(r0);
        r11.q = r0;
        r0 = r11.t;
        r0 = r0.getViewTreeObserver();
        r1 = r11.Q;
        r0.addOnGlobalLayoutListener(r1);
        goto L_0x0047;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.CameraActivity.onCreate(android.os.Bundle):void");
    }

    static ImageView c(CameraActivity cameraActivity) {
        return cameraActivity.F;
    }

    static void a(CameraActivity cameraActivity, boolean z, View view) {
        cameraActivity.a(z, view);
    }

    static void m(CameraActivity cameraActivity) {
        cameraActivity.d();
    }

    static Handler h(CameraActivity cameraActivity) {
        return cameraActivity.z;
    }

    public void onBackPressed() {
        if (this.t.getVisibility() == 0) {
            a();
        } else {
            super.onBackPressed();
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        Throwable e;
        switch (i) {
            case at.g /*1*/:
                if (i2 == -1) {
                    Uri fromFile = Uri.fromFile(App.j(U[16]));
                    if (this.L.getQueryParameter(U[13]) != null) {
                        fromFile = fromFile.buildUpon().appendQueryParameter(U[17], "1").build();
                    }
                    try {
                        Bitmap a = ag.a(fromFile);
                        if (a == null) {
                            try {
                                Log.e(U[15]);
                                App.a((Context) this, 2131230876, 1);
                                return;
                            } catch (OutOfMemoryError e2) {
                                throw e2;
                            }
                        }
                        this.D = (Rect) intent.getParcelableExtra(U[18]);
                        this.r.a(a);
                    } catch (OutOfMemoryError e3) {
                        e = e3;
                        Log.b(U[14], e);
                        App.a((Context) this, 2131230876, 1);
                    } catch (IOException e4) {
                        e = e4;
                        Log.b(U[14], e);
                        App.a((Context) this, 2131230876, 1);
                    } catch (c_ e5) {
                        e = e5;
                        Log.b(U[14], e);
                        App.a((Context) this, 2131230876, 1);
                    }
                }
            default:
        }
    }

    static void a(CameraActivity cameraActivity) {
        cameraActivity.f();
    }

    private void a(String str) {
        int i = I;
        if (U[4].equals(str)) {
            this.H.setImageResource(2130837643);
            if (i == 0) {
                return;
            }
        }
        if (U[5].equals(str)) {
            this.H.setImageResource(2130837644);
            if (i == 0) {
                return;
            }
        }
        this.H.setImageResource(2130837642);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(boolean r9) {
        /*
        r8 = this;
        r7 = I;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = U;
        r2 = 34;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r9);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r8.n;
        r0.l();
        r0 = -1;
        r8.setRequestedOrientation(r0);
        r0 = r8.getContentResolver();	 Catch:{ SettingNotFoundException -> 0x00b8 }
        r1 = U;	 Catch:{ SettingNotFoundException -> 0x00b8 }
        r2 = 35;
        r1 = r1[r2];	 Catch:{ SettingNotFoundException -> 0x00b8 }
        r0 = android.provider.Settings.System.getInt(r0, r1);	 Catch:{ SettingNotFoundException -> 0x00b8 }
        if (r0 == 0) goto L_0x0046;
    L_0x0035:
        r0 = U;	 Catch:{ SettingNotFoundException -> 0x00b8 }
        r1 = 37;
        r0 = r0[r1];	 Catch:{ SettingNotFoundException -> 0x00b8 }
        r0 = r8.getSystemService(r0);	 Catch:{ SettingNotFoundException -> 0x00b8 }
        r0 = (android.os.Vibrator) r0;	 Catch:{ SettingNotFoundException -> 0x00b8 }
        r2 = 75;
        r0.vibrate(r2);	 Catch:{ SettingNotFoundException -> 0x00b8 }
    L_0x0046:
        if (r9 == 0) goto L_0x00af;
    L_0x0048:
        r0 = r8.O;	 Catch:{ SettingNotFoundException -> 0x00c3 }
        if (r0 == 0) goto L_0x0051;
    L_0x004c:
        r8.c();	 Catch:{ SettingNotFoundException -> 0x00c5 }
        if (r7 == 0) goto L_0x00b7;
    L_0x0051:
        r0 = r8.A;	 Catch:{ SettingNotFoundException -> 0x00c7 }
        if (r0 == 0) goto L_0x0071;
    L_0x0055:
        r0 = r8.A;	 Catch:{ IOException -> 0x00cb }
        r1 = r0.p;	 Catch:{ IOException -> 0x00cb }
        r2 = r8.C;	 Catch:{ IOException -> 0x00cb }
        r3 = 3;
        r4 = 0;
        r5 = 0;
        r6 = 0;
        r0 = r8;
        com.whatsapp.util.ag.a(r0, r1, r2, r3, r4, r5, r6);	 Catch:{ IOException -> 0x00cb }
    L_0x0063:
        r0 = r8.C;
        r0 = android.net.Uri.fromFile(r0);
        com.whatsapp.util.ag.a(r8, r0);
        r8.finish();
        if (r7 == 0) goto L_0x00b7;
    L_0x0071:
        r0 = new android.content.Intent;
        r1 = r8.getBaseContext();
        r2 = com.whatsapp.ContactPicker.class;
        r0.<init>(r1, r2);
        r1 = U;	 Catch:{ SettingNotFoundException -> 0x011f }
        r2 = 36;
        r1 = r1[r2];	 Catch:{ SettingNotFoundException -> 0x011f }
        r0.setType(r1);	 Catch:{ SettingNotFoundException -> 0x011f }
        r1 = U;	 Catch:{ SettingNotFoundException -> 0x011f }
        r2 = 30;
        r1 = r1[r2];	 Catch:{ SettingNotFoundException -> 0x011f }
        r2 = r8.C;	 Catch:{ SettingNotFoundException -> 0x011f }
        r2 = android.net.Uri.fromFile(r2);	 Catch:{ SettingNotFoundException -> 0x011f }
        r0.putExtra(r1, r2);	 Catch:{ SettingNotFoundException -> 0x011f }
        r1 = U;	 Catch:{ SettingNotFoundException -> 0x011f }
        r2 = 33;
        r1 = r1[r2];	 Catch:{ SettingNotFoundException -> 0x011f }
        r2 = 1;
        r0.putExtra(r1, r2);	 Catch:{ SettingNotFoundException -> 0x011f }
        r8.startActivity(r0);	 Catch:{ SettingNotFoundException -> 0x011f }
        r0 = r8.C;	 Catch:{ SettingNotFoundException -> 0x011f }
        r0 = android.net.Uri.fromFile(r0);	 Catch:{ SettingNotFoundException -> 0x011f }
        com.whatsapp.util.ag.a(r8, r0);	 Catch:{ SettingNotFoundException -> 0x011f }
        r8.finish();	 Catch:{ SettingNotFoundException -> 0x011f }
        if (r7 == 0) goto L_0x00b7;
    L_0x00af:
        r0 = r8.C;	 Catch:{ SettingNotFoundException -> 0x011f }
        r0.delete();	 Catch:{ SettingNotFoundException -> 0x011f }
        r8.finish();	 Catch:{ SettingNotFoundException -> 0x011f }
    L_0x00b7:
        return;
    L_0x00b8:
        r0 = move-exception;
        r1 = U;
        r2 = 31;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        goto L_0x0046;
    L_0x00c3:
        r0 = move-exception;
        throw r0;	 Catch:{ SettingNotFoundException -> 0x00c5 }
    L_0x00c5:
        r0 = move-exception;
        throw r0;	 Catch:{ SettingNotFoundException -> 0x00c7 }
    L_0x00c7:
        r0 = move-exception;
        throw r0;	 Catch:{ SettingNotFoundException -> 0x00c9 }
    L_0x00c9:
        r0 = move-exception;
        throw r0;
    L_0x00cb:
        r0 = move-exception;
        r1 = r0.getMessage();	 Catch:{ SettingNotFoundException -> 0x0119 }
        if (r1 == 0) goto L_0x00ee;
    L_0x00d2:
        r1 = r0.getMessage();	 Catch:{ SettingNotFoundException -> 0x011b }
        r2 = U;	 Catch:{ SettingNotFoundException -> 0x011b }
        r3 = 32;
        r2 = r2[r3];	 Catch:{ SettingNotFoundException -> 0x011b }
        r1 = r1.contains(r2);	 Catch:{ SettingNotFoundException -> 0x011b }
        if (r1 == 0) goto L_0x00ee;
    L_0x00e2:
        r1 = 2131231112; // 0x7f080188 float:1.8078296E38 double:1.052968076E-314;
        r1 = r8.getString(r1);	 Catch:{ SettingNotFoundException -> 0x011d }
        com.whatsapp.App.a(r8, r1);	 Catch:{ SettingNotFoundException -> 0x011d }
        if (r7 == 0) goto L_0x00f9;
    L_0x00ee:
        r1 = r8.getBaseContext();	 Catch:{ SettingNotFoundException -> 0x011d }
        r2 = 2131232022; // 0x7f080516 float:1.8080142E38 double:1.0529685254E-314;
        r3 = 0;
        com.whatsapp.App.a(r1, r2, r3);	 Catch:{ SettingNotFoundException -> 0x011d }
    L_0x00f9:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = U;
        r3 = 29;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        goto L_0x0063;
    L_0x0119:
        r0 = move-exception;
        throw r0;	 Catch:{ SettingNotFoundException -> 0x011b }
    L_0x011b:
        r0 = move-exception;
        throw r0;	 Catch:{ SettingNotFoundException -> 0x011d }
    L_0x011d:
        r0 = move-exception;
        throw r0;
    L_0x011f:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.CameraActivity.c(boolean):void");
    }

    static ImageButton o(CameraActivity cameraActivity) {
        return cameraActivity.T;
    }

    static boolean a(CameraActivity cameraActivity, boolean z) {
        cameraActivity.v = z;
        return z;
    }

    static int a(CameraActivity cameraActivity, int i) {
        cameraActivity.N = i;
        return i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.net.Uri r9) {
        /*
        r8 = this;
        r7 = 2131230876; // 0x7f08009c float:1.8077817E38 double:1.052967959E-314;
        r6 = 8;
        r5 = 1;
        r4 = 0;
        r0 = U;	 Catch:{ OutOfMemoryError -> 0x0108 }
        r1 = 0;
        r0 = r0[r1];	 Catch:{ OutOfMemoryError -> 0x0108 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ OutOfMemoryError -> 0x0108 }
        r0 = r8.A;	 Catch:{ OutOfMemoryError -> 0x0108 }
        if (r0 != 0) goto L_0x001b;
    L_0x0013:
        r0 = r8.G;	 Catch:{ OutOfMemoryError -> 0x0108 }
        r1 = 2131230877; // 0x7f08009d float:1.807782E38 double:1.0529679597E-314;
        r0.setText(r1);	 Catch:{ OutOfMemoryError -> 0x0108 }
    L_0x001b:
        r8.L = r9;
        r0 = new java.io.File;
        r1 = r9.getPath();
        r0.<init>(r1);
        r8.u = r0;
        r1 = 0;
        r0 = com.whatsapp.util.ag.a(r9);	 Catch:{ OutOfMemoryError -> 0x010a, IOException -> 0x0122, c_ -> 0x0124 }
    L_0x002d:
        if (r0 != 0) goto L_0x0041;
    L_0x002f:
        r1 = U;	 Catch:{ OutOfMemoryError -> 0x011c }
        r2 = 1;
        r1 = r1[r2];	 Catch:{ OutOfMemoryError -> 0x011c }
        com.whatsapp.util.Log.e(r1);	 Catch:{ OutOfMemoryError -> 0x011c }
        r1 = 2131230876; // 0x7f08009c float:1.8077817E38 double:1.052967959E-314;
        r2 = 1;
        com.whatsapp.App.a(r8, r1, r2);	 Catch:{ OutOfMemoryError -> 0x011c }
        r8.finish();	 Catch:{ OutOfMemoryError -> 0x011c }
    L_0x0041:
        r1 = r8.s;
        r2 = r8.n;
        r1.removeView(r2);
        r1 = r8.t;
        r1.setVisibility(r4);
        r1 = r8.R;
        r1.setVisibility(r4);
        r1 = r8.q;
        r1.setVisibility(r4);
        r1 = r8.B;
        r1.setVisibility(r6);
        r1 = 2131755395; // 0x7f100183 float:1.9141668E38 double:1.053227106E-314;
        r1 = r8.findViewById(r1);
        r1.setVisibility(r6);
        r1 = r8.r;
        r1.setVisibility(r4);
        r1 = r8.r;
        r1.b(r5);
        r1 = r8.r;
        r1.a(r0);
        r0 = r8.P;
        if (r0 == 0) goto L_0x00d5;
    L_0x0079:
        r0 = r8.getContentResolver();
        r1 = U;
        r2 = 3;
        r1 = r1[r2];
        r0 = android.provider.Settings.System.getInt(r0, r1, r4);
        if (r0 != 0) goto L_0x00d5;
    L_0x0088:
        r0 = r8.P;	 Catch:{ OutOfMemoryError -> 0x011e }
        r0 = r0.b;	 Catch:{ OutOfMemoryError -> 0x011e }
        r1 = -1;
        if (r0 == r1) goto L_0x00d5;
    L_0x008f:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ OutOfMemoryError -> 0x011e }
        if (r0 >= r6) goto L_0x00a7;
    L_0x0093:
        r0 = r8.getWindowManager();
        r0 = r0.getDefaultDisplay();
        r0 = r0.getOrientation();
        r0 = 4 - r0;
        r0 = r0 % 4;
        r1 = I;
        if (r1 == 0) goto L_0x00b7;
    L_0x00a7:
        r0 = r8.getWindowManager();
        r0 = r0.getDefaultDisplay();
        r0 = r0.getRotation();
        r0 = 4 - r0;
        r0 = r0 % 4;
    L_0x00b7:
        r1 = r8.P;	 Catch:{ OutOfMemoryError -> 0x0120 }
        r1 = r1.b;	 Catch:{ OutOfMemoryError -> 0x0120 }
        r0 = r1 - r0;
        r0 = r0 * 90;
        r0 = r0 % 360;
        r8.N = r0;	 Catch:{ OutOfMemoryError -> 0x0120 }
        r0 = r8.N;	 Catch:{ OutOfMemoryError -> 0x0120 }
        if (r0 >= 0) goto L_0x00cd;
    L_0x00c7:
        r0 = r8.N;	 Catch:{ OutOfMemoryError -> 0x0120 }
        r0 = r0 + 360;
        r8.N = r0;	 Catch:{ OutOfMemoryError -> 0x0120 }
    L_0x00cd:
        r0 = r8.r;
        r1 = r8.N;
        r1 = (float) r1;
        r0.a(r1, r4);
    L_0x00d5:
        r0 = r8.R;
        r1 = new com.whatsapp.camera.r;
        r1.<init>(r8, r9);
        r0.setOnClickListener(r1);
        r0 = r8.q;
        r1 = new com.whatsapp.camera.p;
        r1.<init>(r8);
        r0.setOnClickListener(r1);
        r0 = 2131755404; // 0x7f10018c float:1.9141686E38 double:1.0532271105E-314;
        r0 = r8.findViewById(r0);
        r1 = new com.whatsapp.camera.s;
        r1.<init>(r8, r9);
        r0.setOnClickListener(r1);
        r0 = 2131755369; // 0x7f100169 float:1.9141615E38 double:1.053227093E-314;
        r0 = r8.findViewById(r0);
        r1 = new com.whatsapp.camera.t;
        r1.<init>(r8);
        r0.setOnClickListener(r1);
        return;
    L_0x0108:
        r0 = move-exception;
        throw r0;
    L_0x010a:
        r0 = move-exception;
    L_0x010b:
        r2 = U;
        r3 = 2;
        r2 = r2[r3];
        com.whatsapp.util.Log.b(r2, r0);
        com.whatsapp.App.a(r8, r7, r5);
        r8.finish();
        r0 = r1;
        goto L_0x002d;
    L_0x011c:
        r0 = move-exception;
        throw r0;
    L_0x011e:
        r0 = move-exception;
        throw r0;
    L_0x0120:
        r0 = move-exception;
        throw r0;
    L_0x0122:
        r0 = move-exception;
        goto L_0x010b;
    L_0x0124:
        r0 = move-exception;
        goto L_0x010b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.CameraActivity.a(android.net.Uri):void");
    }

    static int s(CameraActivity cameraActivity) {
        return cameraActivity.N;
    }

    static void b(CameraActivity cameraActivity, boolean z) {
        cameraActivity.c(z);
    }

    static AutofocusOverlay y(CameraActivity cameraActivity) {
        return cameraActivity.y;
    }

    protected void onPause() {
        super.onPause();
        if (this.n.e()) {
            boolean z;
            if (System.currentTimeMillis() - this.E > 1000) {
                z = true;
            } else {
                z = false;
            }
            c(z);
        }
        if (this.P != null) {
            this.P.disable();
        }
    }

    static pz t(CameraActivity cameraActivity) {
        return cameraActivity.o;
    }

    protected void onResume() {
        super.onResume();
        if (this.P != null) {
            this.P.enable();
        }
    }

    static File w(CameraActivity cameraActivity) {
        return cameraActivity.C;
    }

    static TextView k(CameraActivity cameraActivity) {
        return cameraActivity.x;
    }

    private void f() {
        List n = this.n.n();
        if (n == null || n.size() <= 1) {
            this.H.setVisibility(8);
            if (I == 0) {
                return;
            }
        }
        this.H.setVisibility(0);
        a(this.n.k());
    }

    public CameraActivity() {
        this.O = true;
        this.z = new n(this, Looper.getMainLooper());
        this.Q = new x(this);
    }

    static void q(CameraActivity cameraActivity) {
        cameraActivity.b();
    }

    static long l(CameraActivity cameraActivity) {
        return cameraActivity.E;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
        r7 = this;
        r6 = 8;
        r5 = 1;
        r1 = 0;
        r2 = I;
        r0 = U;
        r3 = 10;
        r0 = r0[r3];
        com.whatsapp.util.Log.i(r0);
        r0 = 3;
        r3 = U;
        r4 = 12;
        r3 = r3[r4];
        r0 = com.whatsapp.util.ag.a(r7, r0, r3);
        r7.C = r0;
        r0 = android.os.Build.VERSION.SDK_INT;
        if (r0 >= r6) goto L_0x002e;
    L_0x0020:
        r0 = r7.getWindowManager();
        r0 = r0.getDefaultDisplay();
        r0 = r0.getOrientation();
        if (r2 == 0) goto L_0x003a;
    L_0x002e:
        r0 = r7.getWindowManager();
        r0 = r0.getDefaultDisplay();
        r0 = r0.getRotation();
    L_0x003a:
        r3 = r7.getResources();
        r3 = r3.getConfiguration();
        r3 = r3.orientation;
        switch(r3) {
            case 1: goto L_0x00b9;
            case 2: goto L_0x00c9;
            default: goto L_0x0047;
        };
    L_0x0047:
        r2 = r7.P;
        if (r2 == 0) goto L_0x00d7;
    L_0x004b:
        r2 = r7.getContentResolver();
        r3 = U;
        r4 = 11;
        r3 = r3[r4];
        r2 = android.provider.Settings.System.getInt(r2, r3, r1);
        if (r2 != 0) goto L_0x00d7;
    L_0x005b:
        r2 = r7.P;
        r2 = r2.b;
        r3 = -1;
        if (r2 == r3) goto L_0x00d7;
    L_0x0062:
        r0 = 4 - r0;
        r0 = r0 % 4;
        r2 = r7.P;
        r2 = r2.b;
        r0 = r2 - r0;
        r0 = r0 * 90;
        r0 = r0 % 360;
        if (r0 >= 0) goto L_0x0074;
    L_0x0072:
        r0 = r0 + 360;
    L_0x0074:
        r2 = r7.n;
        r2.setKeepScreenOn(r5);
        r2 = r7.n;
        r3 = r7.C;
        r2.a(r3, r0);
        r0 = r7.z;
        r0.sendEmptyMessage(r1);
        r0 = r7.x;
        r0.setVisibility(r1);
        r0 = r7.K;
        r0.setVisibility(r1);
        r0 = r7.O;
        if (r0 != 0) goto L_0x0098;
    L_0x0093:
        r0 = r7.p;
        r0.setVisibility(r1);
    L_0x0098:
        r0 = r7.S;
        r0.setVisibility(r6);
        r0 = r7.H;
        r0.setVisibility(r6);
        r0 = java.lang.System.currentTimeMillis();
        r7.E = r0;
        r0 = r7.O;
        if (r0 == 0) goto L_0x00b8;
    L_0x00ac:
        r0 = r7.A;
        if (r0 != 0) goto L_0x00b8;
    L_0x00b0:
        r0 = r7.G;
        r1 = "";
        r0.setText(r1);
    L_0x00b8:
        return;
    L_0x00b9:
        if (r0 == 0) goto L_0x00bd;
    L_0x00bb:
        if (r0 != r5) goto L_0x00c2;
    L_0x00bd:
        r7.setRequestedOrientation(r5);
        if (r2 == 0) goto L_0x0047;
    L_0x00c2:
        r3 = 9;
        r7.setRequestedOrientation(r3);
        if (r2 == 0) goto L_0x0047;
    L_0x00c9:
        if (r0 == 0) goto L_0x00cd;
    L_0x00cb:
        if (r0 != r5) goto L_0x00d2;
    L_0x00cd:
        r7.setRequestedOrientation(r1);
        if (r2 == 0) goto L_0x0047;
    L_0x00d2:
        r7.setRequestedOrientation(r6);
        goto L_0x0047;
    L_0x00d7:
        r0 = r1;
        goto L_0x0074;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.CameraActivity.b():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
        r6 = this;
        r5 = 0;
        r4 = 1;
        r3 = 0;
        r2 = 8;
        r0 = U;
        r1 = 39;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = r6.A;
        if (r0 != 0) goto L_0x001a;
    L_0x0012:
        r0 = r6.G;
        r1 = 2131230879; // 0x7f08009f float:1.8077823E38 double:1.0529679607E-314;
        r0.setText(r1);
    L_0x001a:
        r0 = r6.F;
        r1 = 2130837685; // 0x7f0200b5 float:1.7280331E38 double:1.052773697E-314;
        r0.setImageResource(r1);
        r0 = r6.B;
        r0.setVisibility(r3);
        r0 = r6.t;
        r0.setVisibility(r2);
        r0 = r6.R;
        r0.setVisibility(r2);
        r0 = r6.q;
        r0.setVisibility(r2);
        r0 = r6.s;
        r1 = r6.n;
        r0.addView(r1, r3);
        r0 = r6.F;
        r0.setEnabled(r4);
        r0 = r6.S;
        r0.setEnabled(r4);
        r0 = r6.H;
        r0.setEnabled(r4);
        r0 = r6.x;
        r0.setVisibility(r2);
        r0 = r6.K;
        r0.setVisibility(r2);
        r0 = r6.p;
        r0.setVisibility(r2);
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 9;
        if (r0 < r1) goto L_0x0067;
    L_0x0061:
        r0 = android.hardware.Camera.getNumberOfCameras();
        if (r0 > r4) goto L_0x0070;
    L_0x0067:
        r0 = r6.S;
        r0.setVisibility(r2);
        r0 = I;
        if (r0 == 0) goto L_0x0075;
    L_0x0070:
        r0 = r6.S;
        r0.setVisibility(r3);
    L_0x0075:
        r0 = r6.H;
        r0.setVisibility(r3);
        r0 = r6.p;
        r0.setVisibility(r2);
        r0 = 2131755396; // 0x7f100184 float:1.914167E38 double:1.0532271065E-314;
        r0 = r6.findViewById(r0);
        r0 = (com.whatsapp.VideoView) r0;
        r0.setVisibility(r2);
        r0 = r6.C;
        if (r0 == 0) goto L_0x0096;
    L_0x008f:
        r0 = r6.C;
        r0.delete();
        r6.C = r5;
    L_0x0096:
        r0 = r6.u;
        if (r0 == 0) goto L_0x00a1;
    L_0x009a:
        r0 = r6.u;
        r0.delete();
        r6.u = r5;
    L_0x00a1:
        r6.N = r3;
        r6.D = r5;
        r0 = r6.r;
        r1 = 0;
        r0.setRotation(r1, r3);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.camera.CameraActivity.a():void");
    }

    static l5 e(CameraActivity cameraActivity) {
        return cameraActivity.A;
    }

    static View n(CameraActivity cameraActivity) {
        return cameraActivity.p;
    }

    static boolean d(CameraActivity cameraActivity) {
        return cameraActivity.O;
    }

    static void a(CameraActivity cameraActivity, Uri uri) {
        cameraActivity.a(uri);
    }

    protected void onDestroy() {
        Log.i(U[9]);
        super.onDestroy();
        if (this.t != null) {
            this.t.getViewTreeObserver().removeGlobalOnLayoutListener(this.Q);
        }
    }

    static ConversationTextEntry f(CameraActivity cameraActivity) {
        return cameraActivity.w;
    }

    static Rect g(CameraActivity cameraActivity) {
        return cameraActivity.D;
    }

    static ShutterOverlay p(CameraActivity cameraActivity) {
        return cameraActivity.M;
    }

    private void a(boolean z, View view) {
        if (z && view.getVisibility() != 0) {
            view.setVisibility(0);
            Animation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300);
            view.startAnimation(alphaAnimation);
            if (I == 0) {
                return;
            }
        }
        if (!z && view.getVisibility() != 8) {
            view.setVisibility(8);
            alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(300);
            view.startAnimation(alphaAnimation);
        }
    }

    static PhotoView i(CameraActivity cameraActivity) {
        return cameraActivity.r;
    }

    static ZoomOverlay b(CameraActivity cameraActivity) {
        return cameraActivity.J;
    }

    static void r(CameraActivity cameraActivity) {
        cameraActivity.a();
    }
}
