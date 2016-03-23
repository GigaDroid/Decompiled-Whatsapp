package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.hardware.Camera.PreviewCallback;
import android.hardware.Camera.Size;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.ViewCompat;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.google.aK;
import com.google.b1;
import com.google.b3;
import com.google.dG;
import com.google.dj;
import com.google.e;
import com.google.ee;
import com.google.f6;
import com.google.fY;
import com.google.gg;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.qrcode.QrCodeView;
import com.whatsapp.util.Log;
import de.greenrobot.event.h;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import org.v;
import org.whispersystems.B;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.aP;
import org.whispersystems.at;
import org.whispersystems.ax;

public class IdentityVerificationActivity extends DialogToastActivity {
    private static final String[] A;
    private final ee n;
    private MenuItem o;
    private final PreviewCallback p;
    private fY q;
    private boolean r;
    private HandlerThread s;
    private l5 t;
    private Handler u;
    private B v;
    private QrCodeView w;
    private final Runnable x;
    private String y;
    private TextView z;

    public class QrImageView extends View {
        private static final Random e;
        private ArrayList a;
        private Paint b;
        private fY c;
        private a4u d;

        public QrImageView(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.b = new Paint();
        }

        static {
            e = new Random();
        }

        static void a(QrImageView qrImageView, fY fYVar) {
            qrImageView.a(fYVar);
        }

        public void onDraw(Canvas canvas) {
            boolean z = DialogToastActivity.f;
            if (this.c != null) {
                Canvas canvas2;
                dG a = this.c.a();
                int b = a.b();
                int c = a.c();
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                float f = (1.0f * ((float) width)) / ((float) b);
                float f2 = (1.0f * ((float) height)) / ((float) c);
                this.b.setColor(-1);
                canvas.drawRect((float) getPaddingLeft(), (float) getPaddingTop(), (float) (width + getPaddingLeft()), (float) (getPaddingTop() + height), this.b);
                this.b.setColor(-16777216);
                int i = 0;
                while (i < b) {
                    int i2 = 0;
                    while (i2 < c) {
                        if (a.a(i, i2) == 1) {
                            canvas2 = canvas;
                            canvas2.drawRect((((float) i) * f) + ((float) getPaddingLeft()), (((float) i2) * f2) + ((float) getPaddingTop()), (((float) (i + 1)) * f) + ((float) getPaddingLeft()), (((float) (i2 + 1)) * f2) + ((float) getPaddingTop()), this.b);
                        }
                        width = i2 + 1;
                        if (z) {
                            break;
                        }
                        i2 = width;
                    }
                    width = i + 1;
                    if (z) {
                        break;
                    }
                    i = width;
                }
                this.b.setColor(-1);
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    width = ((Integer) it.next()).intValue();
                    int i3 = width % b;
                    width /= b;
                    canvas2 = canvas;
                    canvas2.drawRect(((float) getPaddingLeft()) + (((float) i3) * f), ((float) getPaddingTop()) + (((float) width) * f2), (((float) (i3 + 1)) * f) + ((float) getPaddingLeft()), ((float) getPaddingTop()) + (((float) (width + 1)) * f2), this.b);
                    if (z) {
                        return;
                    }
                }
            }
        }

        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.a = null;
            clearAnimation();
        }

        static ArrayList b(QrImageView qrImageView) {
            return qrImageView.a;
        }

        public QrImageView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = new Paint();
        }

        public QrImageView(Context context) {
            super(context);
            this.b = new Paint();
        }

        private void b() {
            boolean z = DialogToastActivity.f;
            if (this.a == null) {
                int c = this.c.a().c() * this.c.a().b();
                this.a = new ArrayList(c);
                int i = 0;
                while (i < c) {
                    this.a.add(Integer.valueOf(i));
                    i++;
                    if (z) {
                        break;
                    }
                }
            }
            this.d = new a4u(this, null);
            this.d.setDuration(1200);
            this.d.setInterpolator(new LinearInterpolator());
            startAnimation(this.d);
        }

        static Random a() {
            return e;
        }

        private void a(fY fYVar) {
            this.c = fYVar;
            if (ViewCompat.isAttachedToWindow(this) && fYVar != null) {
                b();
            }
        }

        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            if (this.c != null) {
                b();
            }
        }

        static fY a(QrImageView qrImageView) {
            return qrImageView.c;
        }

        public QrImageView(Context context, AttributeSet attributeSet, int i, int i2) {
            super(context, attributeSet, i, i2);
            this.b = new Paint();
        }
    }

    static {
        String[] strArr = new String[33];
        String str = "x/\u00036\\x-\u001c0Oe\"\u001a=\u0001g.\u0007 G~%\u0018:]|*\u00010F";
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
                        i3 = 17;
                        break;
                    case at.g /*1*/:
                        i3 = 75;
                        break;
                    case at.i /*2*/:
                        i3 = 117;
                        break;
                    case at.o /*3*/:
                        i3 = 83;
                        break;
                    default:
                        i3 = 46;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "{\"\u0011";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "x/\u00036\\x-\u001c0Oe\"\u001a=\u0001\u007f$\u001f:J";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "y?\u0001#]+dZ$Yfe\u0002;Oe8\u0014#^?(\u001a>\u0001b.\u0016&\\x?\flBvv";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "X/16M~/\u0010";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "7'\u0016n";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "X\u0018:~\u0016)~L~\u001f";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "x/\u00036\\x-\u001c0Oe\"\u001a=\u0001r9\u00102Zt";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "1kUs\u000e";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "x/\u00036\\x-\u001c0Oe\"\u001a=\u0001";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "x/\u00036\\x-\u001c0Oe\"\u001a=\u0001\u007f$\u001e6Wb<\u001c?Bc.\u0004&Kb?";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "X\u0018:~\u0016)~L~\u001f";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "x/\u00036\\x-\u001c0Oe\"\u001a=\u0001\u007f$\u00010Oa*\u0017?K";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "x/\u00036\\x-\u001c0Oe\"\u001a=\u0001u.\u0006'\\~2";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "p%\u0011!Ax/[#Kc&\u001c ]x$\u001b}mP\u00060\u0001o";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "p%\u0011!Ax/[#Kc&\u001c ]x$\u001b}mP\u00060\u0001o";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    str = "|.\u0006 Ov.*:J";
                    obj = 16;
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    strArr2 = strArr3;
                    str = "u9\u0014$Os'\u0010\fGu";
                    obj = 17;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "a.\u0007>Gb8\u001c<@b";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "a.\u0007>qu.\u001b:O}\u0014\u00186]b*\u00126qx/";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "X\u0018:~\u0016)~L~\u001f";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "19\u0010 [}?O";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "x/\u00036\\x-\u001c0Oe\"\u001a=\u0001b(\u0014=@t/6<Jtk";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "p%\u0011!Ax/[:@e.\u001b'\u0000t3\u0001!O?\u001f0\u000bz";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "p%\u0011!Ax/[:@e.\u001b'\u0000t3\u0001!O?\u0018!\u0001kP\u0006";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "p%\u0011!Ax/[:@e.\u001b'\u0000p(\u0001:A\u007fe&\u0016`U";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "w\"\u00196\u0014>d";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "|*\u001c?Z~q";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "x&\u00144K>;\u001b4";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "x/\u00036\\x-\u001c0Oe\"\u001a=\u0001b#\u0014!Kw*\u001c?Ku";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "r$\u00116\u0000a%\u0012";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "p%\u0011!Ax/[:@e.\u001b'\u0000t3\u0001!O?\u0018 \u0011dT\b!";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    A = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "x/\u00036\\x-\u001c0Oe\"\u001a=\u0001x%\u00032Bx/\u0005!Ae$\u0017&H";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void i() {
        /*
        r18 = this;
        r9 = com.whatsapp.DialogToastActivity.f;
        r1 = r18.getWindowManager();
        r1 = r1.getDefaultDisplay();
        r2 = r1.getWidth();
        r1 = r1.getHeight();
        r1 = java.lang.Math.min(r2, r1);
        r1 = r1 * 2;
        r2 = r1 / 3;
        r1 = android.graphics.Bitmap.Config.RGB_565;
        r10 = android.graphics.Bitmap.createBitmap(r2, r2, r1);
        r1 = new android.graphics.Canvas;
        r1.<init>(r10);
        r3 = -1;
        r1.drawColor(r3);
        r0 = r18;
        r3 = r0.q;
        r11 = r3.a();
        r12 = r11.b();
        r13 = r11.c();
        r14 = r2 / 12;
        r3 = r14 * 2;
        r3 = r2 - r3;
        r4 = r14 * 2;
        r2 = r2 - r4;
        r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r3 = (float) r3;
        r3 = r3 * r4;
        r4 = (float) r12;
        r15 = r3 / r4;
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r2 = (float) r2;
        r2 = r2 * r3;
        r3 = (float) r13;
        r16 = r2 / r3;
        r6 = new android.graphics.Paint;
        r6.<init>();
        r2 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r6.setColor(r2);
        r2 = 0;
        r8 = r2;
    L_0x005c:
        if (r8 >= r12) goto L_0x008f;
    L_0x005e:
        r2 = 0;
        r7 = r2;
    L_0x0060:
        if (r7 >= r13) goto L_0x008b;
    L_0x0062:
        r2 = r11.a(r8, r7);	 Catch:{ FileNotFoundException -> 0x018e }
        r3 = 1;
        if (r2 != r3) goto L_0x0087;
    L_0x0069:
        r2 = (float) r14;	 Catch:{ FileNotFoundException -> 0x018e }
        r3 = (float) r8;	 Catch:{ FileNotFoundException -> 0x018e }
        r3 = r3 * r15;
        r2 = r2 + r3;
        r3 = (float) r14;	 Catch:{ FileNotFoundException -> 0x018e }
        r4 = (float) r7;	 Catch:{ FileNotFoundException -> 0x018e }
        r4 = r4 * r16;
        r3 = r3 + r4;
        r4 = (float) r14;	 Catch:{ FileNotFoundException -> 0x018e }
        r5 = r8 + 1;
        r5 = (float) r5;	 Catch:{ FileNotFoundException -> 0x018e }
        r5 = r5 * r15;
        r4 = r4 + r5;
        r5 = (float) r14;	 Catch:{ FileNotFoundException -> 0x018e }
        r17 = r7 + 1;
        r0 = r17;
        r0 = (float) r0;	 Catch:{ FileNotFoundException -> 0x018e }
        r17 = r0;
        r17 = r17 * r16;
        r5 = r5 + r17;
        r1.drawRect(r2, r3, r4, r5, r6);	 Catch:{ FileNotFoundException -> 0x018e }
    L_0x0087:
        r2 = r7 + 1;
        if (r9 == 0) goto L_0x01c3;
    L_0x008b:
        r2 = r8 + 1;
        if (r9 == 0) goto L_0x01c0;
    L_0x008f:
        r1 = A;
        r2 = 31;
        r1 = r1[r2];
        r4 = com.whatsapp.App.j(r1);
        r3 = 0;
        r2 = new java.io.FileOutputStream;	 Catch:{ FileNotFoundException -> 0x0190, all -> 0x01ab }
        r2.<init>(r4);	 Catch:{ FileNotFoundException -> 0x0190, all -> 0x01ab }
        r1 = android.graphics.Bitmap.CompressFormat.PNG;	 Catch:{ FileNotFoundException -> 0x01be }
        r3 = 0;
        r10.compress(r1, r3, r2);	 Catch:{ FileNotFoundException -> 0x01be }
        com.whatsapp.util.ao.a(r2);
        r10.recycle();
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r0 = r18;
        r1 = r0.y;
        r3 = r1.length();
        r1 = 1;
    L_0x00b9:
        if (r1 > r3) goto L_0x00e3;
    L_0x00bb:
        r0 = r18;
        r5 = r0.y;	 Catch:{ FileNotFoundException -> 0x01b4 }
        r6 = r1 + -1;
        r5 = r5.charAt(r6);	 Catch:{ FileNotFoundException -> 0x01b4 }
        r2.append(r5);	 Catch:{ FileNotFoundException -> 0x01b4 }
        if (r1 == r3) goto L_0x00df;
    L_0x00ca:
        r5 = r1 % 20;
        if (r5 != 0) goto L_0x00d5;
    L_0x00ce:
        r5 = 10;
        r2.append(r5);	 Catch:{ FileNotFoundException -> 0x01b8 }
        if (r9 == 0) goto L_0x00df;
    L_0x00d5:
        r5 = r1 % 5;
        if (r5 != 0) goto L_0x00df;
    L_0x00d9:
        r5 = " ";
        r2.append(r5);	 Catch:{ FileNotFoundException -> 0x01ba }
    L_0x00df:
        r1 = r1 + 1;
        if (r9 == 0) goto L_0x00b9;
    L_0x00e3:
        r1 = new android.content.Intent;
        r3 = A;
        r5 = 26;
        r3 = r3[r5];
        r5 = A;
        r6 = 28;
        r5 = r5[r6];
        r5 = android.net.Uri.parse(r5);
        r1.<init>(r3, r5);
        r3 = A;
        r5 = 32;
        r3 = r3[r5];
        r5 = 2131231360; // 0x7f080280 float:1.8078799E38 double:1.0529681983E-314;
        r6 = 2;
        r6 = new java.lang.Object[r6];
        r7 = 0;
        r8 = com.whatsapp.App.h(r18);
        r6[r7] = r8;
        r7 = 1;
        r8 = com.whatsapp.App.ay;
        r8 = r8.jabber_id;
        r8 = com.whatsapp.l5.c(r8);
        r6[r7] = r8;
        r0 = r18;
        r5 = r0.getString(r5, r6);
        r1.putExtra(r3, r5);
        r3 = A;
        r5 = 24;
        r3 = r3[r5];
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = 2131231359; // 0x7f08027f float:1.8078797E38 double:1.052968198E-314;
        r0 = r18;
        r6 = r0.getString(r6);
        r5 = r5.append(r6);
        r6 = "\n";
        r5 = r5.append(r6);
        r2 = r2.toString();
        r2 = r5.append(r2);
        r2 = r2.toString();
        r1.putExtra(r3, r2);
        r2 = A;
        r3 = 25;
        r2 = r2[r3];
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r5 = A;
        r6 = 27;
        r5 = r5[r6];
        r3 = r3.append(r5);
        r4 = r4.getAbsolutePath();
        r3 = r3.append(r4);
        r3 = r3.toString();
        r3 = android.net.Uri.parse(r3);
        r1.putExtra(r2, r3);
        r2 = A;
        r3 = 29;
        r2 = r2[r3];
        r1.setType(r2);
        r2 = 524288; // 0x80000 float:7.34684E-40 double:2.590327E-318;
        r1.addFlags(r2);
        r2 = 0;
        r1 = android.content.Intent.createChooser(r1, r2);
        r0 = r18;
        r0.startActivity(r1);
    L_0x018d:
        return;
    L_0x018e:
        r1 = move-exception;
        throw r1;
    L_0x0190:
        r1 = move-exception;
        r2 = r3;
    L_0x0192:
        r3 = A;	 Catch:{ all -> 0x01bc }
        r4 = 30;
        r3 = r3[r4];	 Catch:{ all -> 0x01bc }
        com.whatsapp.util.Log.b(r3, r1);	 Catch:{ all -> 0x01bc }
        r1 = 2131232022; // 0x7f080516 float:1.8080142E38 double:1.0529685254E-314;
        r3 = 0;
        r0 = r18;
        com.whatsapp.App.a(r0, r1, r3);	 Catch:{ all -> 0x01bc }
        com.whatsapp.util.ao.a(r2);
        r10.recycle();
        goto L_0x018d;
    L_0x01ab:
        r1 = move-exception;
        r2 = r3;
    L_0x01ad:
        com.whatsapp.util.ao.a(r2);
        r10.recycle();
        throw r1;
    L_0x01b4:
        r1 = move-exception;
        throw r1;	 Catch:{ FileNotFoundException -> 0x01b6 }
    L_0x01b6:
        r1 = move-exception;
        throw r1;	 Catch:{ FileNotFoundException -> 0x01b8 }
    L_0x01b8:
        r1 = move-exception;
        throw r1;	 Catch:{ FileNotFoundException -> 0x01ba }
    L_0x01ba:
        r1 = move-exception;
        throw r1;
    L_0x01bc:
        r1 = move-exception;
        goto L_0x01ad;
    L_0x01be:
        r1 = move-exception;
        goto L_0x0192;
    L_0x01c0:
        r8 = r2;
        goto L_0x005c;
    L_0x01c3:
        r7 = r2;
        goto L_0x0060;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.IdentityVerificationActivity.i():void");
    }

    private void d() {
        if (!k() && a()) {
            findViewById(2131755703).setVisibility(0);
            this.w.setVisibility(0);
            this.z.setVisibility(8);
            App.p.M().removeCallbacks(this.x);
            if (this.r) {
                this.w.b().setOneShotPreviewCallback(this.p);
            }
        }
    }

    static void g(IdentityVerificationActivity identityVerificationActivity) {
        identityVerificationActivity.f();
    }

    public void onEvent(ji jiVar) {
        if (this.t != null && this.t.p.equals(jiVar.a)) {
            l();
        }
    }

    private void b(byte[] bArr) {
        f6 a;
        String c;
        byte[] bytes;
        ro a2;
        Size c2 = this.w.c();
        int i = (c2.width * 3) / 4;
        if (i < 320) {
            i = c2.width;
        }
        int i2 = (c2.height * 3) / 4;
        if (i2 < 320) {
            i2 = c2.height;
        }
        int i3 = (c2.width - i) / 2;
        int i4 = (c2.height - i2) / 2;
        try {
            a = this.n.a(new b1(new dj(new e(bArr, c2.width, c2.height, i3, i4, i, i2, false))));
        } catch (aK e) {
            a = null;
            if (a != null) {
                c = a.c();
                if (c != null) {
                    try {
                        bytes = c.getBytes(A[21]);
                        a2 = a(bytes);
                        try {
                            Log.i(A[23] + Arrays.toString(bytes) + A[22] + a2);
                            if (a2 != ro.INVALID) {
                                runOnUiThread(new asc(this, a2));
                            } else {
                                j();
                            }
                        } catch (aK e2) {
                            throw e2;
                        }
                    } catch (UnsupportedEncodingException e3) {
                        j();
                        return;
                    }
                }
                try {
                    j();
                    return;
                } catch (aK e22) {
                    throw e22;
                }
            }
            try {
                j();
                return;
            } catch (aK e222) {
                throw e222;
            }
        } finally {
            this.n.a();
        }
        if (a != null) {
            j();
            return;
        }
        c = a.c();
        if (c != null) {
            j();
            return;
        }
        bytes = c.getBytes(A[21]);
        a2 = a(bytes);
        Log.i(A[23] + Arrays.toString(bytes) + A[22] + a2);
        if (a2 != ro.INVALID) {
            j();
        } else {
            runOnUiThread(new asc(this, a2));
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 2131755050) {
            i();
            return true;
        } else if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            finish();
            return true;
        }
    }

    static void e(IdentityVerificationActivity identityVerificationActivity) {
        identityVerificationActivity.d();
    }

    public IdentityVerificationActivity() {
        this.n = new ee();
        this.p = new axi(this);
        this.x = new cu(this);
    }

    private void d(boolean z) {
        int i;
        ImageView imageView = (ImageView) findViewById(2131755707);
        imageView.setVisibility(0);
        if (z) {
            i = 2130839414;
        } else {
            i = 2130839737;
        }
        imageView.setBackgroundResource(i);
        if (z) {
            i = 2130839577;
        } else {
            i = 2130839576;
        }
        imageView.setImageResource(i);
        Animation animationSet = new AnimationSet(true);
        Animation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        Animation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setInterpolator(new OvershootInterpolator());
        animationSet.setDuration((long) getResources().getInteger(17694721));
        imageView.startAnimation(animationSet);
        App.p.M().postDelayed(this.x, 4000);
    }

    static boolean i(IdentityVerificationActivity identityVerificationActivity) {
        return identityVerificationActivity.k();
    }

    static l5 a(IdentityVerificationActivity identityVerificationActivity) {
        return identityVerificationActivity.t;
    }

    private boolean c() {
        return this.v != null;
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            if (i2 == -1) {
                d();
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        this.o = menu.add(0, 2131755050, 0, 2131232015).setIcon(2130839448);
        MenuItemCompat.setShowAsAction(this.o, 2);
        this.o.setVisible(c());
        return super.onCreateOptionsMenu(menu);
    }

    static PreviewCallback d(IdentityVerificationActivity identityVerificationActivity) {
        return identityVerificationActivity.p;
    }

    public void finish() {
        if (k()) {
            f();
            if (!DialogToastActivity.f) {
                return;
            }
        }
        super.finish();
    }

    static TextView c(IdentityVerificationActivity identityVerificationActivity) {
        return identityVerificationActivity.z;
    }

    private boolean a() {
        if (App.h(this, A[16]) == 0) {
            return true;
        }
        startActivityForResult(new Intent(this, RequestPermissionActivity.class).putExtra(A[18], 2130839697).putExtra(A[17], 2131231603).putExtra(A[20], 2131231602).putExtra(A[19], new String[]{A[15]}), 1);
        return false;
    }

    static void a(IdentityVerificationActivity identityVerificationActivity, byte[] bArr) {
        identityVerificationActivity.b(bArr);
    }

    private ro a(byte[] bArr) {
        try {
            if (!this.v.a(bArr)) {
                return ro.MISMATCH;
            }
            try {
                return ro.OK;
            } catch (aP e) {
                throw e;
            }
        } catch (Throwable e2) {
            Log.c(A[0], e2);
            return ro.INVALID;
        } catch (ax e3) {
            try {
                if (e3.c().equals(e3.a())) {
                    return ro.WRONG_YOU;
                }
                return ro.WRONG_CONTACT;
            } catch (aP e4) {
                throw e4;
            }
        } catch (Throwable e22) {
            Log.c(A[1], e22);
            return ro.INVALID;
        }
    }

    public void onCreate(Bundle bundle) {
        int i = 0;
        boolean z = DialogToastActivity.f;
        Log.i(A[8]);
        super.onCreate(bundle);
        getSupportActionBar().setElevation(getResources().getDimension(2131427411));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        String stringExtra = getIntent().getStringExtra(A[2]);
        if (stringExtra == null) {
            Log.e(A[3]);
            finish();
            return;
        }
        this.t = App.as.b(stringExtra);
        h(getString(2131232201, new Object[]{this.t.i()}));
        setContentView(2130903201);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(2131755709);
        textEmojiLabel.setFocusable(false);
        textEmojiLabel.setLinkHandler(new vi());
        CharSequence spannableStringBuilder = new SpannableStringBuilder(Html.fromHtml(getString(2131232207, new Object[]{A[4] + aqu.g() + A[6] + aqu.c()})));
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            int length = uRLSpanArr.length;
            int i2 = 0;
            while (i2 < length) {
                URLSpan uRLSpan = uRLSpanArr[i2];
                spannableStringBuilder.setSpan(new g3(uRLSpan.getURL(), ContextCompat.getColor(this, 2131623943)), spannableStringBuilder.getSpanStart(uRLSpan), spannableStringBuilder.getSpanEnd(uRLSpan), spannableStringBuilder.getSpanFlags(uRLSpan));
                i2++;
                if (z) {
                    break;
                }
            }
            i2 = uRLSpanArr.length;
            while (i < i2) {
                spannableStringBuilder.removeSpan(uRLSpanArr[i]);
                i++;
                if (z) {
                    break;
                }
            }
        }
        textEmojiLabel.setText(spannableStringBuilder, BufferType.SPANNABLE);
        Map hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add(gg.QR_CODE);
        hashMap.put(b3.POSSIBLE_FORMATS, arrayList);
        hashMap.put(b3.CHARACTER_SET, A[7]);
        this.n.a(hashMap);
        this.s = new HandlerThread(A[5]);
        this.s.start();
        this.u = new Handler(this.s.getLooper());
        this.z = (TextView) findViewById(2131755704);
        this.w = (QrCodeView) findViewById(2131755389);
        this.w.setThreadHandler(this.u);
        this.w.setCameraCallback(new k0(this));
        l();
        findViewById(2131755711).setOnClickListener(new a9g(this));
        h.b().e(this);
    }

    static void a(IdentityVerificationActivity identityVerificationActivity, boolean z) {
        identityVerificationActivity.d(z);
    }

    public void onDestroy() {
        Log.i(A[14]);
        super.onDestroy();
        this.s.quit();
        h.b().c(this);
        App.p.M().removeCallbacks(this.x);
    }

    static QrCodeView b(IdentityVerificationActivity identityVerificationActivity) {
        return identityVerificationActivity.w;
    }

    private void c(boolean z) {
        int i;
        int i2 = 0;
        if (this.o != null) {
            this.o.setVisible(z);
        }
        View findViewById = findViewById(2131755481);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        findViewById.setVisibility(i);
        findViewById = findViewById(2131755709);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        findViewById.setVisibility(i);
        View findViewById2 = findViewById(2131755705);
        if (!z) {
            i2 = 8;
        }
        findViewById2.setVisibility(i2);
    }

    static void a(IdentityVerificationActivity identityVerificationActivity, Runnable runnable) {
        identityVerificationActivity.a(runnable);
    }

    static Handler f(IdentityVerificationActivity identityVerificationActivity) {
        return identityVerificationActivity.u;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void l() {
        /*
        r12 = this;
        r11 = 10;
        r10 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r4 = 1;
        r5 = com.whatsapp.DialogToastActivity.f;
        r0 = 2131755708; // 0x7f1002bc float:1.9142303E38 double:1.0532272606E-314;
        r0 = r12.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r1 = com.whatsapp.App.as;
        r2 = r12.t;
        r1.l(r2);
        r1 = r12.t;
        r2 = com.whatsapp.it.class;
        r1 = r1.a(r2);
        r1 = (com.whatsapp.it) r1;
        r2 = com.whatsapp.it.ALLOW;	 Catch:{ dC -> 0x0049 }
        if (r1 == r2) goto L_0x004b;
    L_0x0025:
        r1 = A;	 Catch:{ dC -> 0x0049 }
        r2 = 13;
        r1 = r1[r2];	 Catch:{ dC -> 0x0049 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ dC -> 0x0049 }
        r1 = 0;
        r12.c(r1);	 Catch:{ dC -> 0x0049 }
        r1 = 2131232203; // 0x7f0805cb float:1.8080509E38 double:1.052968615E-314;
        r2 = 1;
        r2 = new java.lang.Object[r2];	 Catch:{ dC -> 0x0049 }
        r3 = 0;
        r4 = r12.t;	 Catch:{ dC -> 0x0049 }
        r4 = r4.i();	 Catch:{ dC -> 0x0049 }
        r2[r3] = r4;	 Catch:{ dC -> 0x0049 }
        r1 = r12.getString(r1, r2);	 Catch:{ dC -> 0x0049 }
        r0.setText(r1);	 Catch:{ dC -> 0x0049 }
    L_0x0048:
        return;
    L_0x0049:
        r0 = move-exception;
        throw r0;
    L_0x004b:
        r1 = r12.t;
        r1 = r1.p;
        r1 = com.whatsapp.awc.e(r1);
        r2 = com.whatsapp.awc.a(r12);
        r3 = r1.b();
        r3 = r2.c(r3);
        r6 = r3.b();	 Catch:{ dC -> 0x0089 }
        if (r6 != 0) goto L_0x008b;
    L_0x0065:
        r1 = A;	 Catch:{ dC -> 0x0089 }
        r2 = 11;
        r1 = r1[r2];	 Catch:{ dC -> 0x0089 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ dC -> 0x0089 }
        r1 = 0;
        r12.c(r1);	 Catch:{ dC -> 0x0089 }
        r1 = 2131232202; // 0x7f0805ca float:1.8080507E38 double:1.0529686143E-314;
        r2 = 1;
        r2 = new java.lang.Object[r2];	 Catch:{ dC -> 0x0089 }
        r3 = 0;
        r4 = r12.t;	 Catch:{ dC -> 0x0089 }
        r4 = r4.i();	 Catch:{ dC -> 0x0089 }
        r2[r3] = r4;	 Catch:{ dC -> 0x0089 }
        r1 = r12.getString(r1, r2);	 Catch:{ dC -> 0x0089 }
        r0.setText(r1);	 Catch:{ dC -> 0x0089 }
        goto L_0x0048;
    L_0x0089:
        r0 = move-exception;
        throw r0;
    L_0x008b:
        r6 = new org.whispersystems.bW;
        r8 = 5200; // 0x1450 float:7.287E-42 double:2.569E-320;
        r6.<init>(r8);
        r7 = com.whatsapp.App.ad();
        r7 = com.whatsapp.App.D(r7);
        r2 = r2.b();
        r2 = r2.b();
        r1 = r1.b();
        r1 = com.whatsapp.App.D(r1);
        r3 = r3.b();
        r1 = r6.a(r7, r2, r1, r3);
        r2 = r1.a();
        r12.v = r2;
        r1 = r1.b();
        r1 = r1.a();
        r12.y = r1;
        r1 = 2131755706; // 0x7f1002ba float:1.9142299E38 double:1.0532272597E-314;
        r1 = r12.findViewById(r1);
        r1 = (com.whatsapp.IdentityVerificationActivity.QrImageView) r1;
        r2 = new java.util.EnumMap;	 Catch:{ dC -> 0x0185, UnsupportedEncodingException -> 0x0199 }
        r3 = com.google.i8.class;
        r2.<init>(r3);	 Catch:{ dC -> 0x0185, UnsupportedEncodingException -> 0x0199 }
        r3 = new java.lang.String;	 Catch:{ dC -> 0x0185, UnsupportedEncodingException -> 0x0199 }
        r6 = r12.v;	 Catch:{ dC -> 0x0185, UnsupportedEncodingException -> 0x0199 }
        r6 = r6.a();	 Catch:{ dC -> 0x0185, UnsupportedEncodingException -> 0x0199 }
        r7 = A;	 Catch:{ dC -> 0x0185, UnsupportedEncodingException -> 0x0199 }
        r8 = 12;
        r7 = r7[r8];	 Catch:{ dC -> 0x0185, UnsupportedEncodingException -> 0x0199 }
        r3.<init>(r6, r7);	 Catch:{ dC -> 0x0185, UnsupportedEncodingException -> 0x0199 }
        r6 = com.google.hP.L;	 Catch:{ dC -> 0x0185, UnsupportedEncodingException -> 0x0199 }
        r2 = com.google.dD.a(r3, r6, r2);	 Catch:{ dC -> 0x0185, UnsupportedEncodingException -> 0x0199 }
        r12.q = r2;	 Catch:{ dC -> 0x0185, UnsupportedEncodingException -> 0x0199 }
        r2 = r12.q;	 Catch:{ dC -> 0x0185, UnsupportedEncodingException -> 0x0199 }
        com.whatsapp.IdentityVerificationActivity.QrImageView.a(r1, r2);	 Catch:{ dC -> 0x0185, UnsupportedEncodingException -> 0x0199 }
    L_0x00f0:
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r1 = r12.y;
        r3 = r1.length();
        r1 = 0;
        r2 = r4;
    L_0x00fd:
        if (r2 > r3) goto L_0x0135;
    L_0x00ff:
        r7 = r12.y;	 Catch:{ dC -> 0x018f }
        r8 = r2 + -1;
        r7 = r7.charAt(r8);	 Catch:{ dC -> 0x018f }
        r6.append(r7);	 Catch:{ dC -> 0x018f }
        if (r2 == r3) goto L_0x0131;
    L_0x010c:
        r7 = r2 % 20;
        if (r7 != 0) goto L_0x011d;
    L_0x0110:
        if (r1 != 0) goto L_0x0116;
    L_0x0112:
        r1 = r6.toString();
    L_0x0116:
        r7 = 10;
        r6.append(r7);	 Catch:{ dC -> 0x0193 }
        if (r5 == 0) goto L_0x0131;
    L_0x011d:
        r7 = r2 % 5;
        if (r7 != 0) goto L_0x012c;
    L_0x0121:
        r7 = A;	 Catch:{ dC -> 0x0197 }
        r8 = 9;
        r7 = r7[r8];	 Catch:{ dC -> 0x0197 }
        r6.append(r7);	 Catch:{ dC -> 0x0197 }
        if (r5 == 0) goto L_0x0131;
    L_0x012c:
        r7 = 32;
        r6.append(r7);	 Catch:{ dC -> 0x0197 }
    L_0x0131:
        r2 = r2 + 1;
        if (r5 == 0) goto L_0x00fd;
    L_0x0135:
        r3 = r0.getTextSize();
        r2 = r0.getPaint();
        r2 = r2.measureText(r1);
        r7 = r12.getWindowManager();
        r7 = r7.getDefaultDisplay();
        r8 = r7.getWidth();
        r7 = r7.getHeight();
        r7 = java.lang.Math.min(r8, r7);
        r7 = (float) r7;
        r8 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r9 = com.whatsapp.a4d.a();
        r9 = r9.g;
        r8 = r8 * r9;
        r9 = 1098907648; // 0x41800000 float:16.0 double:5.42932517E-315;
        r8 = r8 * r9;
        r7 = r7 - r8;
    L_0x0163:
        r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1));
        if (r2 <= 0) goto L_0x0179;
    L_0x0167:
        r2 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1));
        if (r2 <= 0) goto L_0x0179;
    L_0x016b:
        r3 = r3 - r10;
        r0.setTextSize(r3);
        r2 = r0.getPaint();
        r2 = r2.measureText(r1);
        if (r5 == 0) goto L_0x0163;
    L_0x0179:
        r1 = r6.toString();
        r0.setText(r1);
        r12.c(r4);
        goto L_0x0048;
    L_0x0185:
        r1 = move-exception;
    L_0x0186:
        r2 = A;
        r2 = r2[r11];
        com.whatsapp.util.Log.a(r2, r1);
        goto L_0x00f0;
    L_0x018f:
        r0 = move-exception;
        throw r0;	 Catch:{ dC -> 0x0191 }
    L_0x0191:
        r0 = move-exception;
        throw r0;
    L_0x0193:
        r0 = move-exception;
        throw r0;	 Catch:{ dC -> 0x0195 }
    L_0x0195:
        r0 = move-exception;
        throw r0;	 Catch:{ dC -> 0x0197 }
    L_0x0197:
        r0 = move-exception;
        throw r0;
    L_0x0199:
        r1 = move-exception;
        goto L_0x0186;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.IdentityVerificationActivity.l():void");
    }

    private void a(Runnable runnable) {
        if (k()) {
            findViewById(2131755562).setVisibility(0);
            findViewById(2131755711).setVisibility(0);
            findViewById(2131755710).setVisibility(8);
            findViewById(2131755703).setVisibility(8);
            this.z.setVisibility(8);
            Animation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
            translateAnimation.setInterpolator(new DecelerateInterpolator());
            translateAnimation.setDuration((long) getResources().getInteger(17694721));
            translateAnimation.setAnimationListener(new a4c(this, runnable));
            findViewById(2131755562).startAnimation(translateAnimation);
            this.r = false;
        }
    }

    static void h(IdentityVerificationActivity identityVerificationActivity) {
        identityVerificationActivity.j();
    }

    static boolean b(IdentityVerificationActivity identityVerificationActivity, boolean z) {
        identityVerificationActivity.r = z;
        return z;
    }

    private void j() {
        runOnUiThread(new aaj(this));
    }

    private boolean k() {
        return this.w != null && this.w.getVisibility() == 0;
    }

    private void f() {
        a(null);
    }
}
