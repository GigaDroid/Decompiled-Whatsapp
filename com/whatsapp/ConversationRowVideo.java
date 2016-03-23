package com.whatsapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.support.v7.appcompat.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import com.whatsapp.util.ag;
import com.whatsapp.util.bi;
import java.io.File;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public final class ConversationRowVideo extends ConversationRowMedia {
    private static Handler ad;
    private static final String[] bb;
    private final RowVideoView U;
    private final TextView V;
    private final View W;
    private bi X;
    private final View Y;
    private final TextView Z;
    private final TextView aa;
    private ia ab;
    private final CircularProgressBar ac;

    public class RowVideoView extends ImageView {
        private Shader a;
        private Shader b;
        private Shader c;
        private RectF d;
        private Drawable e;
        private Paint f;
        private Shader g;

        protected void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            float f = a4d.a().g * 24.0f;
            this.c = new LinearGradient(0.0f, ((float) i2) - (2.0f * f), 0.0f, ((float) i2) - ((3.0f * f) / 4.0f), -16777216, 0, TileMode.CLAMP);
            this.a = new LinearGradient(0.0f, ((float) i2) - (2.0f * f), 0.0f, ((float) i2) - ((3.0f * f) / 4.0f), -1712062488, 0, TileMode.CLAMP);
            this.g = new LinearGradient(0.0f, ((float) i2) - (2.0f * f), 0.0f, ((float) i2) - ((3.0f * f) / 4.0f), -1724697805, 0, TileMode.CLAMP);
            this.b = new LinearGradient(0.0f, ((float) i2) - ((4.0f * f) / 3.0f), 0.0f, (float) i2, 0, -16777216, TileMode.CLAMP);
        }

        protected void onMeasure(int i, int i2) {
            View decorView = ((Activity) getContext()).getWindow().getDecorView();
            int min = (Math.min(decorView.getWidth(), decorView.getHeight()) * 70) / 100;
            if (MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
                min = Math.min(min, MeasureSpec.getSize(i));
            }
            super.onMeasure(MeasureSpec.makeMeasureSpec(min, 1073741824), MeasureSpec.makeMeasureSpec(min, 1073741824));
        }

        public RowVideoView(Context context) {
            super(context);
            this.f = new Paint(1);
            this.d = new RectF();
        }

        public void setFrameDrawable(Drawable drawable) {
            this.e = drawable;
        }

        public RowVideoView(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f = new Paint(1);
            this.d = new RectF();
        }

        public void onDraw(Canvas canvas) {
            boolean z = DialogToastActivity.f;
            super.onDraw(canvas);
            float f = 24.0f * a4d.a().g;
            float height = ((float) getHeight()) - f;
            int width = getWidth();
            float f2 = a4d.a().g * 30.0f;
            int i = (int) (height / f2);
            float f3 = height / ((float) i);
            this.d.set(0.0f, 0.0f, f2, (float) getHeight());
            this.f.setColor(1711276032);
            this.f.setStyle(Style.FILL);
            this.f.setShader(this.c);
            canvas.drawRect(this.d, this.f);
            this.d.set(((float) width) - f2, 0.0f, (float) width, (float) getHeight());
            canvas.drawRect(this.d, this.f);
            this.f.setShader(this.a);
            height = 0.0f;
            while (height < ((float) i)) {
                float f4 = height * f3;
                this.d.set(f2 / 4.0f, ((f3 / 2.0f) + f4) - (f2 / 4.0f), (3.0f * f2) / 4.0f, (f4 + (f3 / 2.0f)) + (f2 / 4.0f));
                this.f.setColor(-1712062488);
                this.f.setStyle(Style.FILL);
                canvas.drawRoundRect(this.d, f2 / 12.0f, f2 / 12.0f, this.f);
                this.d.offset(((float) width) - f2, 0.0f);
                this.f.setColor(-1712062488);
                this.f.setStyle(Style.FILL);
                canvas.drawRoundRect(this.d, f2 / 12.0f, f2 / 12.0f, this.f);
                height += 1.0f;
                if (z) {
                    break;
                }
            }
            this.f.setShader(this.g);
            height = 0.0f;
            while (height < ((float) i)) {
                f4 = height * f3;
                this.d.set(f2 / 4.0f, ((f3 / 2.0f) + f4) - (f2 / 4.0f), (3.0f * f2) / 4.0f, (f4 + (f3 / 2.0f)) + (f2 / 4.0f));
                this.f.setColor(-1724697805);
                this.f.setStyle(Style.STROKE);
                this.f.setStrokeWidth(f2 / 32.0f);
                canvas.drawRoundRect(this.d, f2 / 12.0f, f2 / 12.0f, this.f);
                this.d.offset(((float) width) - f2, 0.0f);
                this.f.setColor(-1724697805);
                this.f.setStyle(Style.STROKE);
                this.f.setStrokeWidth(f2 / 32.0f);
                canvas.drawRoundRect(this.d, f2 / 12.0f, f2 / 12.0f, this.f);
                height += 1.0f;
                if (z) {
                    break;
                }
            }
            this.f.setColor(1711276032);
            this.f.setShader(this.b);
            this.f.setStyle(Style.FILL);
            this.d.set(0.0f, ((float) getHeight()) - ((f * 4.0f) / 3.0f), (float) width, (float) getHeight());
            canvas.drawRect(this.d, this.f);
            if (this.e != null) {
                this.e.setBounds(0, 0, getWidth(), getHeight());
                this.e.draw(canvas);
            }
        }

        public RowVideoView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f = new Paint(1);
            this.d = new RectF();
        }
    }

    static {
        String[] strArr = new String[18];
        String str = "hsj";
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
                        i3 = 2;
                        break;
                    case at.g /*1*/:
                        i3 = 26;
                        break;
                    case at.i /*2*/:
                        i3 = 14;
                        break;
                    case at.o /*3*/:
                        i3 = 81;
                        break;
                    default:
                        i3 = 2;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\"|g=gQst48";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\"ng<gqno<r8";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "ru}";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "tsk&ogi}0eg5.7pmwQ<g8";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\"n|0lq|k#pktik";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "cvk#v";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "tsk&ogi}0eg5.?m\"|g=g";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "ctj#mk~ 8lv\u007f`%,cyz8ml4X\u0018GU";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\"o|=8";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\"n|0lq|k#pg~4";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "i\u007fw";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\"nw!g8";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    str = "\"j|>ep\u007f}\"8";
                    obj = 13;
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    strArr2 = strArr3;
                    str = "\"wk5kcE}8xg ";
                    obj = 14;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "tsj4m-0";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\"|g=g8";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    bb = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\"to<g8";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static RowVideoView b(ConversationRowVideo conversationRowVideo) {
        return conversationRowVideo.U;
    }

    public void i() {
        a(this.e);
        super.i();
    }

    public void a(co coVar, boolean z) {
        if (coVar != this.e || z) {
            a(coVar);
        }
        super.a(coVar, z);
    }

    static Handler a() {
        return ad;
    }

    public ConversationRowVideo(Context context, co coVar) {
        super(context, coVar);
        this.X = new a9e(this);
        this.aa = (TextView) findViewById(2131755525);
        this.U = (RowVideoView) findViewById(2131755454);
        this.ac = (CircularProgressBar) findViewById(2131755177);
        this.V = (TextView) findViewById(R.id.info);
        this.Y = findViewById(2131755246);
        this.W = findViewById(2131755553);
        this.Z = (TextView) findViewById(2131755554);
        this.ac.setMax(100);
        this.ac.setProgressBarBackgroundColor(0);
        if (ad != null || VERSION.SDK_INT >= 11) {
            a(coVar);
        } else {
            a(coVar);
        }
    }

    protected void f() {
        boolean z = DialogToastActivity.f;
        MediaData mediaData = (MediaData) this.e.Q;
        if (!this.e.k.a && !mediaData.transferred) {
            return;
        }
        if (mediaData.suspiciousContent == MediaData.SUSPICIOUS_CONTENT_YES) {
            App.b(getContext(), 2131231172, 1);
            return;
        }
        boolean exists;
        if (mediaData.file != null) {
            exists = new File(Uri.fromFile(mediaData.file).getPath()).exists();
        } else {
            exists = false;
        }
        Log.i(bb[5] + this.e.k.a + bb[13] + this.e.c + bb[1] + this.e.A + bb[10] + ag.g(this.e.q) + bb[17] + mediaData.file + bb[14] + mediaData.progress + bb[11] + mediaData.transferred + bb[6] + mediaData.transferring + bb[2] + mediaData.fileSize + bb[15] + this.e.z + bb[3] + this.e.b);
        if (exists) {
            i8.f();
            if (this.i) {
                Intent intent = new Intent(bb[9]);
                intent.setDataAndType(Uri.fromFile(mediaData.file), bb[16]);
                App.a(getContext(), intent);
                if (!z) {
                    return;
                }
            }
            getContext().startActivity(MediaView.a(this.e, this.e.k.c, getContext()));
            return;
        }
        Log.w(bb[8]);
        if (this.i) {
            Context context = getContext();
            if (context instanceof DialogToastActivity) {
                App.a((DialogToastActivity) context);
            }
            if (!z) {
                return;
            }
        }
        Intent intent2 = new Intent(getContext(), MediaGallery.class);
        intent2.putExtra(bb[4], -1);
        intent2.putExtra(bb[7], true);
        intent2.putExtra(bb[0], this.e.k.c);
        intent2.putExtra(bb[12], this.e.k.hashCode());
        getContext().startActivity(intent2);
    }

    static ia a(ConversationRowVideo conversationRowVideo, ia iaVar) {
        conversationRowVideo.ab = iaVar;
        return iaVar;
    }

    protected int n() {
        return TextUtils.isEmpty(this.e.a) ? 2130839649 : 2130839648;
    }

    static ia a(ConversationRowVideo conversationRowVideo) {
        return conversationRowVideo.ab;
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (ad != null && this.ab == null) {
            this.ab = new ia(this, (MediaData) this.e.Q);
            ad.postDelayed(this.ab, 2000);
        }
    }

    protected int h() {
        return 2130903138;
    }

    protected int g() {
        return 2130903137;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.whatsapp.protocol.co r12) {
        /*
        r11 = this;
        r10 = 2130839627; // 0x7f02084b float:1.728427E38 double:1.0527746565E-314;
        r9 = 0;
        r8 = 8;
        r3 = 0;
        r4 = com.whatsapp.DialogToastActivity.f;
        r0 = r12.Q;
        r0 = (com.whatsapp.MediaData) r0;
        r1 = r11.V;
        r1.setVisibility(r8);
        r1 = r0.transferring;
        if (r1 == 0) goto L_0x0094;
    L_0x0016:
        r1 = r11.W;
        r1.setVisibility(r3);
        r1 = r11.ac;
        r1.setVisibility(r3);
        r1 = r11.Y;
        r1.setVisibility(r3);
        r1 = r11.aa;
        r2 = "";
        r1.setText(r2);
        r1 = r11.aa;
        r1.setVisibility(r8);
        r1 = r12.k;
        r1 = r1.a;
        if (r1 == 0) goto L_0x0041;
    L_0x0038:
        r1 = r11.U;
        r2 = r11.Q;
        r1.setOnClickListener(r2);
        if (r4 == 0) goto L_0x0046;
    L_0x0041:
        r1 = r11.U;
        r1.setOnClickListener(r9);
    L_0x0046:
        r1 = r11.aa;
        r2 = r11.R;
        r1.setOnClickListener(r2);
        r1 = r11.ac;
        r2 = r11.R;
        r1.setOnClickListener(r2);
        r6 = r0.progress;
        r1 = (int) r6;
        r2 = r0.transcoder;
        if (r2 == 0) goto L_0x006f;
    L_0x005b:
        r2 = r0.transcoder;
        r2 = r2.a();
        if (r2 == 0) goto L_0x006f;
    L_0x0063:
        r2 = r0.uploader;
        if (r2 != 0) goto L_0x006b;
    L_0x0067:
        r1 = r1 / 2;
        if (r4 == 0) goto L_0x006f;
    L_0x006b:
        r1 = r1 / 2;
        r1 = r1 + 50;
    L_0x006f:
        r5 = r11.ac;
        if (r1 == 0) goto L_0x0077;
    L_0x0073:
        r2 = 100;
        if (r1 != r2) goto L_0x020f;
    L_0x0077:
        r2 = 1;
    L_0x0078:
        r5.setIndeterminate(r2);
        r5 = r11.ac;
        if (r1 != 0) goto L_0x0212;
    L_0x007f:
        r2 = r11.getResources();
        r6 = 2131624047; // 0x7f0e006f float:1.8875263E38 double:1.0531622115E-314;
        r2 = r2.getColor(r6);
    L_0x008a:
        r5.setProgressBarColor(r2);
        r2 = r11.ac;
        r2.setProgress(r1);
        if (r4 == 0) goto L_0x013b;
    L_0x0094:
        r1 = r0.transferred;
        if (r1 != 0) goto L_0x00ac;
    L_0x0098:
        r1 = r12.x;
        if (r1 == 0) goto L_0x00d8;
    L_0x009c:
        r1 = r12.k;
        r1 = r1.a;
        if (r1 == 0) goto L_0x00d8;
    L_0x00a2:
        r1 = r12.k;
        r1 = r1.c;
        r1 = com.whatsapp.l5.g(r1);
        if (r1 != 0) goto L_0x00d8;
    L_0x00ac:
        r1 = r11.W;
        r1.setVisibility(r8);
        r1 = r11.aa;
        r2 = 2131231698; // 0x7f0803d2 float:1.8079484E38 double:1.0529683653E-314;
        r1.setText(r2);
        r1 = r11.aa;
        r1.setVisibility(r8);
        r1 = r11.ac;
        r1.setVisibility(r8);
        r1 = r11.Y;
        r1.setVisibility(r8);
        r1 = r11.aa;
        r2 = r11.Q;
        r1.setOnClickListener(r2);
        r1 = r11.U;
        r2 = r11.Q;
        r1.setOnClickListener(r2);
        if (r4 == 0) goto L_0x013b;
    L_0x00d8:
        r1 = r11.W;
        r1.setVisibility(r3);
        r1 = r11.ac;
        r1.setVisibility(r8);
        r1 = r11.Y;
        r1.setVisibility(r8);
        r1 = r11.aa;
        r1.setVisibility(r3);
        r1 = r12.k;
        r1 = r1.a;
        if (r1 == 0) goto L_0x0116;
    L_0x00f2:
        r1 = r0.file;
        if (r1 == 0) goto L_0x0116;
    L_0x00f6:
        r1 = r11.aa;
        r2 = 2131231838; // 0x7f08045e float:1.8079768E38 double:1.0529684345E-314;
        r1.setText(r2);
        r1 = r11.aa;
        r2 = 2130837691; // 0x7f0200bb float:1.7280343E38 double:1.0527737E-314;
        r1.setCompoundDrawablesWithIntrinsicBounds(r2, r3, r3, r3);
        r1 = r11.aa;
        r2 = r11.T;
        r1.setOnClickListener(r2);
        r1 = r11.U;
        r2 = r11.Q;
        r1.setOnClickListener(r2);
        if (r4 == 0) goto L_0x013b;
    L_0x0116:
        r1 = r11.aa;
        r2 = com.whatsapp.App.z();
        r6 = r12.z;
        r2 = android.text.format.Formatter.formatShortFileSize(r2, r6);
        r1.setText(r2);
        r1 = r11.aa;
        r2 = 2130837640; // 0x7f020088 float:1.728024E38 double:1.052773675E-314;
        r1.setCompoundDrawablesWithIntrinsicBounds(r2, r3, r3, r3);
        r1 = r11.aa;
        r2 = r11.S;
        r1.setOnClickListener(r2);
        r1 = r11.U;
        r2 = r11.S;
        r1.setOnClickListener(r2);
    L_0x013b:
        r1 = r11.U;
        r2 = r11.K;
        r1.setOnLongClickListener(r2);
        r2 = r11.U;
        r1 = r12.k;
        r1 = r1.a;
        if (r1 == 0) goto L_0x021f;
    L_0x014a:
        r1 = com.whatsapp.ConversationRowImage.W;
    L_0x014c:
        r2.setFrameDrawable(r1);
        r1 = r11.U;
        r2 = r11.X;
        com.whatsapp.util.bd.b(r12, r1, r2);
        r1 = ad;
        if (r1 == 0) goto L_0x017a;
    L_0x015a:
        r1 = r11.ab;
        if (r1 == 0) goto L_0x016a;
    L_0x015e:
        r1 = ad;
        r2 = r11.ab;
        r1.removeCallbacks(r2);
        r1 = r11.ab;
        r1.a();
    L_0x016a:
        r1 = new com.whatsapp.ia;
        r1.<init>(r11, r0);
        r11.ab = r1;
        r1 = ad;
        r2 = r11.ab;
        r6 = 2000; // 0x7d0 float:2.803E-42 double:9.88E-321;
        r1.postDelayed(r2, r6);
    L_0x017a:
        r1 = r12.H;
        if (r1 != 0) goto L_0x0186;
    L_0x017e:
        r0 = r0.file;
        r0 = com.whatsapp.util.ag.c(r0);
        r12.H = r0;
    L_0x0186:
        r0 = r12.H;
        if (r0 == 0) goto L_0x0193;
    L_0x018a:
        r0 = r12.H;
        r0 = (long) r0;
        r0 = android.text.format.DateUtils.formatElapsedTime(r0);
        if (r4 == 0) goto L_0x019d;
    L_0x0193:
        r0 = com.whatsapp.App.z();
        r6 = r12.z;
        r0 = android.text.format.Formatter.formatShortFileSize(r0, r6);
    L_0x019d:
        r1 = r11.V;
        r1.setText(r0);
        r0 = r11.V;
        r0.setVisibility(r3);
        r0 = com.whatsapp.App.a1();
        if (r0 == 0) goto L_0x01b4;
    L_0x01ad:
        r0 = r11.V;
        r0.setCompoundDrawablesWithIntrinsicBounds(r10, r3, r3, r3);
        if (r4 == 0) goto L_0x01ca;
    L_0x01b4:
        r0 = r11.V;
        r1 = new com.whatsapp.util.bz;
        r2 = r11.getContext();
        r2 = r2.getResources();
        r2 = r2.getDrawable(r10);
        r1.<init>(r2);
        r0.setCompoundDrawablesWithIntrinsicBounds(r9, r9, r1, r9);
    L_0x01ca:
        r0 = r11.x;
        if (r0 == 0) goto L_0x01f1;
    L_0x01ce:
        r0 = r12.x;
        if (r0 == 0) goto L_0x01ec;
    L_0x01d2:
        r0 = r12.k;
        r0 = r0.a;
        if (r0 == 0) goto L_0x01ec;
    L_0x01d8:
        r0 = r12.k;
        r0 = r0.c;
        r0 = com.whatsapp.l5.e(r0);
        if (r0 != 0) goto L_0x01ec;
    L_0x01e2:
        r0 = r11.x;
        r1 = 2130837634; // 0x7f020082 float:1.7280228E38 double:1.052773672E-314;
        r0.setCompoundDrawablesWithIntrinsicBounds(r1, r3, r3, r3);
        if (r4 == 0) goto L_0x01f1;
    L_0x01ec:
        r0 = r11.x;
        r0.setCompoundDrawablesWithIntrinsicBounds(r3, r3, r3, r3);
    L_0x01f1:
        r0 = r12.a;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 != 0) goto L_0x0209;
    L_0x01f9:
        r0 = r11.Z;
        r0.setVisibility(r3);
        r1 = r12.a;
        r0 = r11.Z;
        r0 = (com.whatsapp.TextEmojiLabel) r0;
        r11.setMessageText(r1, r0, r3, r12);
        if (r4 == 0) goto L_0x020e;
    L_0x0209:
        r0 = r11.Z;
        r0.setVisibility(r8);
    L_0x020e:
        return;
    L_0x020f:
        r2 = r3;
        goto L_0x0078;
    L_0x0212:
        r2 = r11.getResources();
        r6 = 2131624046; // 0x7f0e006e float:1.887526E38 double:1.053162211E-314;
        r2 = r2.getColor(r6);
        goto L_0x008a;
    L_0x021f:
        r1 = com.whatsapp.ConversationRowImage.Y;
        goto L_0x014c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationRowVideo.a(com.whatsapp.protocol.co):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected int a(int r5) {
        /*
        r4 = this;
        r1 = 2130839653; // 0x7f020865 float:1.7284323E38 double:1.0527746693E-314;
        r2 = com.whatsapp.DialogToastActivity.f;
        r0 = 13;
        r0 = com.whatsapp.protocol.b7.a(r5, r0);
        if (r0 < 0) goto L_0x0012;
    L_0x000d:
        r0 = 2130839643; // 0x7f02085b float:1.7284302E38 double:1.0527746644E-314;
        if (r2 == 0) goto L_0x002b;
    L_0x0012:
        r0 = 5;
        r0 = com.whatsapp.protocol.b7.a(r5, r0);
        if (r0 < 0) goto L_0x001e;
    L_0x0019:
        r0 = 2130839647; // 0x7f02085f float:1.728431E38 double:1.0527746664E-314;
        if (r2 == 0) goto L_0x002b;
    L_0x001e:
        r0 = 4;
        r0 = com.whatsapp.protocol.b7.a(r5, r0);
        if (r0 != 0) goto L_0x002a;
    L_0x0025:
        r0 = 2130839645; // 0x7f02085d float:1.7284306E38 double:1.0527746654E-314;
        if (r2 == 0) goto L_0x002b;
    L_0x002a:
        r0 = r1;
    L_0x002b:
        r2 = com.whatsapp.App.am;
        r3 = 3;
        if (r2 != r3) goto L_0x0034;
    L_0x0030:
        r2 = 7;
        if (r5 != r2) goto L_0x0034;
    L_0x0033:
        r0 = r1;
    L_0x0034:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationRowVideo.a(int):int");
    }
}
