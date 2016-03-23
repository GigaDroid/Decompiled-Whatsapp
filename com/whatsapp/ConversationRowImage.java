package com.whatsapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
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
import com.whatsapp.util.bz;
import java.io.File;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class ConversationRowImage extends ConversationRowMedia {
    public static final Drawable W;
    public static final Drawable Y;
    private static final Drawable aa;
    private static final String[] bb;
    private bi U;
    private final CircularProgressBar V;
    private final TextView X;
    private final TextEmojiLabel Z;
    private final View ab;
    private final RowImageView ac;
    private final View ad;

    public class RowImageView extends ImageView {
        private Paint a;
        private MediaData b;
        private int c;
        private int d;
        private Rect e;
        private Rect f;
        private boolean g;
        private boolean h;
        private Bitmap i;

        static int a(RowImageView rowImageView) {
            return rowImageView.d;
        }

        public RowImageView(Context context) {
            super(context);
            this.a = new Paint();
            this.e = new Rect();
            this.f = new Rect();
            a();
        }

        static int b(RowImageView rowImageView, int i) {
            rowImageView.c = i;
            return i;
        }

        protected void onMeasure(int i, int i2) {
            View decorView = ((Activity) getContext()).getWindow().getDecorView();
            int min = (Math.min(decorView.getWidth(), decorView.getHeight()) * 70) / 100;
            if (MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
                min = Math.min(min, MeasureSpec.getSize(i));
            }
            int i3 = (this.c * min) / this.d;
            if (i3 > min) {
                if (DialogToastActivity.f) {
                    i3 = min;
                } else {
                    i3 = min;
                    setMeasuredDimension(min, i3);
                }
            }
            if (min * 10 > i3 * 24) {
                i3 = (min * 10) / 24;
            }
            setMeasuredDimension(min, i3);
        }

        private void a() {
            this.a.setAntiAlias(true);
            this.a.setDither(true);
            this.a.setFilterBitmap(true);
            this.a.setColor(-1);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        protected void onDraw(android.graphics.Canvas r8) {
            /*
            r7 = this;
            r6 = 0;
            r1 = com.whatsapp.DialogToastActivity.f;
            r0 = r7.a;
            r2 = -1;
            r0.setColor(r2);
            r0 = r7.e;
            r2 = r7.getWidth();
            r3 = r7.getHeight();
            r0.set(r6, r6, r2, r3);
            r0 = r7.i;
            if (r0 == 0) goto L_0x00c4;
        L_0x001a:
            r2 = new android.graphics.Rect;
            r0 = r7.i;
            r0 = r0.getWidth();
            r3 = r7.i;
            r3 = r3.getHeight();
            r2.<init>(r6, r6, r0, r3);
            r0 = r7.i;
            r0 = r0.getHeight();
            r3 = r7.i;
            r3 = r3.getWidth();
            if (r0 <= r3) goto L_0x007d;
        L_0x0039:
            r0 = r7.i;
            r0 = r0.getWidth();
            r2.bottom = r0;
            r0 = r7.b;
            r0 = r0.faceY;
            if (r0 <= 0) goto L_0x013b;
        L_0x0047:
            r0 = r7.b;
            r0 = r0.faceY;
        L_0x004b:
            r3 = r7.d;
            r3 = r3 / 3;
            if (r0 <= r3) goto L_0x007b;
        L_0x0051:
            r3 = r2.bottom;
            r4 = r7.i;
            r4 = r4.getHeight();
            r5 = r7.i;
            r5 = r5.getHeight();
            r0 = r0 * r5;
            r5 = r7.c;
            r0 = r0 / r5;
            r5 = r3 * 2;
            r5 = r5 / 3;
            r0 = r0 + r5;
            r0 = java.lang.Math.min(r4, r0);
            r2.bottom = r0;
            r0 = r2.bottom;
            r0 = r0 - r3;
            r2.top = r0;
            r0 = r2.top;
            if (r0 >= 0) goto L_0x007b;
        L_0x0077:
            r2.top = r6;
            r2.bottom = r3;
        L_0x007b:
            if (r1 == 0) goto L_0x00b9;
        L_0x007d:
            r0 = r7.i;
            r0 = r0.getWidth();
            r0 = r0 * 10;
            r3 = r7.i;
            r3 = r3.getHeight();
            r3 = r3 * 24;
            if (r0 <= r3) goto L_0x00b9;
        L_0x008f:
            r0 = r7.i;
            r0 = r0.getWidth();
            r3 = r7.i;
            r3 = r3.getHeight();
            r3 = r3 * 24;
            r3 = r3 / 10;
            r0 = r0 - r3;
            r0 = r0 / 2;
            r2.left = r0;
            r0 = r7.i;
            r0 = r0.getWidth();
            r3 = r7.i;
            r3 = r3.getHeight();
            r3 = r3 * 24;
            r3 = r3 / 10;
            r0 = r0 + r3;
            r0 = r0 / 2;
            r2.right = r0;
        L_0x00b9:
            r0 = r7.i;
            r3 = r7.e;
            r4 = r7.a;
            r8.drawBitmap(r0, r2, r3, r4);
            if (r1 == 0) goto L_0x00c7;
        L_0x00c4:
            super.onDraw(r8);
        L_0x00c7:
            r0 = r7.h;
            if (r0 == 0) goto L_0x012c;
        L_0x00cb:
            r0 = com.whatsapp.App.a1();
            if (r0 == 0) goto L_0x00fc;
        L_0x00d1:
            r0 = com.whatsapp.ConversationRowImage.a();
            r2 = r7.e;
            r2 = r2.right;
            r3 = com.whatsapp.ConversationRowImage.a();
            r3 = r3.getIntrinsicWidth();
            r2 = r2 - r3;
            r3 = r7.e;
            r3 = r3.bottom;
            r4 = com.whatsapp.ConversationRowImage.a();
            r4 = r4.getIntrinsicHeight();
            r3 = r3 - r4;
            r4 = r7.e;
            r4 = r4.right;
            r5 = r7.e;
            r5 = r5.bottom;
            r0.setBounds(r2, r3, r4, r5);
            if (r1 == 0) goto L_0x0125;
        L_0x00fc:
            r0 = com.whatsapp.ConversationRowImage.a();
            r1 = r7.e;
            r1 = r1.left;
            r2 = r7.e;
            r2 = r2.bottom;
            r3 = com.whatsapp.ConversationRowImage.a();
            r3 = r3.getIntrinsicHeight();
            r2 = r2 - r3;
            r3 = r7.e;
            r3 = r3.left;
            r4 = com.whatsapp.ConversationRowImage.a();
            r4 = r4.getIntrinsicWidth();
            r3 = r3 + r4;
            r4 = r7.e;
            r4 = r4.bottom;
            r0.setBounds(r1, r2, r3, r4);
        L_0x0125:
            r0 = com.whatsapp.ConversationRowImage.a();
            r0.draw(r8);
        L_0x012c:
            r0 = r7.g;
            if (r0 == 0) goto L_0x0141;
        L_0x0130:
            r0 = com.whatsapp.ConversationRowImage.W;
        L_0x0132:
            r1 = r7.e;
            r0.setBounds(r1);
            r0.draw(r8);
            return;
        L_0x013b:
            r0 = r7.c;
            r0 = r0 / 3;
            goto L_0x004b;
        L_0x0141:
            r0 = com.whatsapp.ConversationRowImage.Y;
            goto L_0x0132;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationRowImage.RowImageView.onDraw(android.graphics.Canvas):void");
        }

        static boolean a(RowImageView rowImageView, boolean z) {
            rowImageView.h = z;
            return z;
        }

        public RowImageView(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.a = new Paint();
            this.e = new Rect();
            this.f = new Rect();
            a();
        }

        static MediaData a(RowImageView rowImageView, MediaData mediaData) {
            rowImageView.b = mediaData;
            return mediaData;
        }

        public RowImageView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = new Paint();
            this.e = new Rect();
            this.f = new Rect();
            a();
        }

        static boolean b(RowImageView rowImageView, boolean z) {
            rowImageView.g = z;
            return z;
        }

        static int a(RowImageView rowImageView, int i) {
            rowImageView.d = i;
            return i;
        }

        static Bitmap a(RowImageView rowImageView, Bitmap bitmap) {
            rowImageView.i = bitmap;
            return bitmap;
        }
    }

    static Drawable a() {
        return aa;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected int a(int r5) {
        /*
        r4 = this;
        r0 = 2130839653; // 0x7f020865 float:1.7284323E38 double:1.0527746693E-314;
        r2 = com.whatsapp.DialogToastActivity.f;
        r1 = r4.e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0014 }
        r1 = r1.a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0014 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0014 }
        if (r1 != 0) goto L_0x0016;
    L_0x000f:
        r0 = super.a(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0014 }
    L_0x0013:
        return r0;
    L_0x0014:
        r0 = move-exception;
        throw r0;
    L_0x0016:
        r1 = 13;
        r1 = com.whatsapp.protocol.b7.a(r5, r1);
        if (r1 < 0) goto L_0x0023;
    L_0x001e:
        r1 = 2130839643; // 0x7f02085b float:1.7284302E38 double:1.0527746644E-314;
        if (r2 == 0) goto L_0x003c;
    L_0x0023:
        r1 = 5;
        r1 = com.whatsapp.protocol.b7.a(r5, r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0046 }
        if (r1 < 0) goto L_0x002f;
    L_0x002a:
        r1 = 2130839647; // 0x7f02085f float:1.728431E38 double:1.0527746664E-314;
        if (r2 == 0) goto L_0x003c;
    L_0x002f:
        r1 = 4;
        r1 = com.whatsapp.protocol.b7.a(r5, r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0048 }
        if (r1 != 0) goto L_0x003b;
    L_0x0036:
        r1 = 2130839645; // 0x7f02085d float:1.7284306E38 double:1.0527746654E-314;
        if (r2 == 0) goto L_0x003c;
    L_0x003b:
        r1 = r0;
    L_0x003c:
        r2 = com.whatsapp.App.am;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x004a }
        r3 = 3;
        if (r2 != r3) goto L_0x0044;
    L_0x0041:
        r2 = 7;
        if (r5 == r2) goto L_0x0013;
    L_0x0044:
        r0 = r1;
        goto L_0x0013;
    L_0x0046:
        r0 = move-exception;
        throw r0;
    L_0x0048:
        r0 = move-exception;
        throw r0;
    L_0x004a:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationRowImage.a(int):int");
    }

    public void a(co coVar, boolean z) {
        Object obj;
        if (!z) {
            try {
                if (coVar == this.e) {
                    obj = null;
                    super.a(coVar, z);
                    if (obj != null) {
                        a(coVar);
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                throw e;
            }
        }
        obj = 1;
        try {
            super.a(coVar, z);
            if (obj != null) {
                a(coVar);
            }
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw e2;
        }
    }

    static RowImageView a(ConversationRowImage conversationRowImage) {
        return conversationRowImage.ac;
    }

    static {
        String[] strArr = new String[18];
        String str = "\u0011@\u000fM&*S\u0012A'0";
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
                        i3 = 94;
                        break;
                    case at.g /*1*/:
                        i3 = 50;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_checkboxStyle;
                        break;
                    case at.o /*3*/:
                        i3 = 40;
                        break;
                    default:
                        i3 = 72;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "~F\u001fX-d";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "([\u0003_%;A\u0015I/;\u001dFF'~T\u000fD-";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "0]\u0001I$2W\u0014Q";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "~G\u0014Dr";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "~F\u0014I&-T\u0003Z:7\\\u0001\u0012";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "4[\u0002";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "~B\u0014G/,W\u0015[r";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = ".]\u0015";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "~T\u000fD-d";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "~T\u000fD-\r[\u001cMr";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "~_\u0003L!?m\u0015A2;\b";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "~F\u000fE--F\u0007E8d";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "~F\u0014I&-T\u0003Z:;V\\";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "~\\\u0007E-d";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "5W\u001f";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "([\u0003_%;A\u0015I/;\u001dFN:1_9E-d";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    bb = strArr3;
                    Y = new bz(App.z().getApplicationContext().getResources().getDrawable(2130837618));
                    W = new bz(App.z().getApplicationContext().getResources().getDrawable(2130837624));
                    aa = new bz(App.z().getApplicationContext().getResources().getDrawable(2130837623));
                    return;
                default:
                    strArr2[i] = str;
                    str = "?^\u0003Z<";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void i() {
        super.i();
        a(this.e);
    }

    public ConversationRowImage(Context context, co coVar) {
        super(context, coVar);
        this.U = new bt(this);
        this.X = (TextView) findViewById(2131755525);
        this.ac = (RowImageView) findViewById(R.id.image);
        this.V = (CircularProgressBar) findViewById(2131755177);
        this.V.setProgressBarBackgroundColor(0);
        this.ad = findViewById(2131755246);
        this.ab = findViewById(2131755553);
        this.Z = (TextEmojiLabel) findViewById(2131755554);
        this.Z.setLinkHandler(new vi());
        this.Z.setAutoLinkMask(0);
        this.Z.setLinksClickable(false);
        this.Z.setFocusable(false);
        this.Z.setClickable(false);
        this.Z.setLongClickable(false);
        a(coVar);
    }

    protected int n() {
        try {
            return TextUtils.isEmpty(this.e.a) ? 2130839649 : 2130839648;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        }
    }

    protected int h() {
        return 2130903129;
    }

    protected int g() {
        return 2130903128;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.whatsapp.protocol.co r13) {
        /*
        r12 = this;
        r4 = 0;
        r2 = 1;
        r11 = 8;
        r3 = 0;
        r6 = com.whatsapp.DialogToastActivity.f;
        r0 = r13.Q;
        r0 = (com.whatsapp.MediaData) r0;
        r1 = r12.ac;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0331 }
        r5 = 0;
        com.whatsapp.ConversationRowImage.RowImageView.a(r1, r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0331 }
        r1 = r12.ac;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0331 }
        com.whatsapp.ConversationRowImage.RowImageView.a(r1, r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0331 }
        r1 = r0.transferring;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0331 }
        if (r1 == 0) goto L_0x0082;
    L_0x001a:
        r1 = r12.ab;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0331 }
        r5 = 0;
        r1.setVisibility(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0331 }
        r1 = r12.V;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0331 }
        r5 = 0;
        r1.setVisibility(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0331 }
        r1 = r12.ad;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0331 }
        r5 = 0;
        r1.setVisibility(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0331 }
        r1 = r12.X;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0331 }
        r5 = "";
        r1.setText(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0331 }
        r1 = r12.X;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0331 }
        r5 = 8;
        r1.setVisibility(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0331 }
        r1 = r13.k;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0331 }
        r1 = r1.a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0331 }
        if (r1 == 0) goto L_0x004a;
    L_0x0041:
        r1 = r12.ac;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0333 }
        r5 = r12.Q;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0333 }
        r1.setOnClickListener(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0333 }
        if (r6 == 0) goto L_0x0050;
    L_0x004a:
        r1 = r12.ac;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0335 }
        r5 = 0;
        r1.setOnClickListener(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0335 }
    L_0x0050:
        r1 = r12.X;
        r5 = r12.R;
        r1.setOnClickListener(r5);
        r1 = r12.V;
        r5 = r12.R;
        r1.setOnClickListener(r5);
        r8 = r0.progress;
        r5 = (int) r8;
        r7 = r12.V;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0337 }
        if (r5 != 0) goto L_0x0339;
    L_0x0065:
        r1 = r2;
    L_0x0066:
        r7.setIndeterminate(r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x033c }
        r7 = r12.V;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x033c }
        if (r5 != 0) goto L_0x033e;
    L_0x006d:
        r1 = r12.getResources();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x033c }
        r8 = 2131624047; // 0x7f0e006f float:1.8875263E38 double:1.0531622115E-314;
        r1 = r1.getColor(r8);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x033c }
    L_0x0078:
        r7.setProgressBarColor(r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x034b }
        r1 = r12.V;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x034b }
        r1.setProgress(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x034b }
        if (r6 == 0) goto L_0x014f;
    L_0x0082:
        r1 = r0.transferred;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x034b }
        if (r1 != 0) goto L_0x009a;
    L_0x0086:
        r1 = r13.x;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x034d }
        if (r1 == 0) goto L_0x00ce;
    L_0x008a:
        r1 = r13.k;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x034f }
        r1 = r1.a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x034f }
        if (r1 == 0) goto L_0x00ce;
    L_0x0090:
        r1 = r13.k;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0351 }
        r1 = r1.c;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0351 }
        r1 = com.whatsapp.l5.g(r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0351 }
        if (r1 != 0) goto L_0x00ce;
    L_0x009a:
        r1 = r12.ab;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0353 }
        r5 = 8;
        r1.setVisibility(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0353 }
        r1 = r12.X;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0353 }
        r5 = 2131231698; // 0x7f0803d2 float:1.8079484E38 double:1.0529683653E-314;
        r1.setText(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0353 }
        r1 = r12.X;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0353 }
        r5 = 8;
        r1.setVisibility(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0353 }
        r1 = r12.V;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0353 }
        r5 = 8;
        r1.setVisibility(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0353 }
        r1 = r12.ad;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0353 }
        r5 = 8;
        r1.setVisibility(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0353 }
        r1 = r12.X;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0353 }
        r5 = r12.Q;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0353 }
        r1.setOnClickListener(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0353 }
        r1 = r12.ac;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0353 }
        r5 = r12.Q;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0353 }
        r1.setOnClickListener(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0353 }
        if (r6 == 0) goto L_0x014f;
    L_0x00ce:
        r1 = r12.ab;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0355 }
        r5 = 0;
        r1.setVisibility(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0355 }
        r1 = r12.V;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0355 }
        r5 = 8;
        r1.setVisibility(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0355 }
        r1 = r12.ad;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0355 }
        r5 = 8;
        r1.setVisibility(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0355 }
        r1 = r12.X;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0355 }
        r5 = 0;
        r1.setVisibility(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0355 }
        r1 = r13.k;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0355 }
        r1 = r1.a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0355 }
        if (r1 == 0) goto L_0x035d;
    L_0x00ee:
        r1 = r0.file;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0357 }
        if (r1 != 0) goto L_0x035d;
    L_0x00f2:
        r1 = r13.q;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0359 }
        if (r1 == 0) goto L_0x035d;
    L_0x00f6:
        r1 = r2;
    L_0x00f7:
        r5 = r13.k;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0360 }
        r5 = r5.a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0360 }
        if (r5 == 0) goto L_0x0122;
    L_0x00fd:
        if (r1 != 0) goto L_0x0122;
    L_0x00ff:
        r1 = r12.X;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0362 }
        r5 = 2131231838; // 0x7f08045e float:1.8079768E38 double:1.0529684345E-314;
        r1.setText(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0362 }
        r1 = r12.X;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0362 }
        r5 = 2130837691; // 0x7f0200bb float:1.7280343E38 double:1.0527737E-314;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r1.setCompoundDrawablesWithIntrinsicBounds(r5, r7, r8, r9);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0362 }
        r1 = r12.X;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0362 }
        r5 = r12.T;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0362 }
        r1.setOnClickListener(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0362 }
        r1 = r12.ac;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0362 }
        r5 = r12.Q;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0362 }
        r1.setOnClickListener(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0362 }
        if (r6 == 0) goto L_0x014a;
    L_0x0122:
        r1 = r12.X;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0364 }
        r5 = com.whatsapp.App.z();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0364 }
        r8 = r13.z;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0364 }
        r5 = android.text.format.Formatter.formatShortFileSize(r5, r8);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0364 }
        r1.setText(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0364 }
        r1 = r12.X;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0364 }
        r5 = 2130837640; // 0x7f020088 float:1.728024E38 double:1.052773675E-314;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r1.setCompoundDrawablesWithIntrinsicBounds(r5, r7, r8, r9);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0364 }
        r1 = r12.X;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0364 }
        r5 = r12.S;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0364 }
        r1.setOnClickListener(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0364 }
        r1 = r12.ac;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0364 }
        r5 = r12.S;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0364 }
        r1.setOnClickListener(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0364 }
    L_0x014a:
        r1 = r12.X;
        r1.setVisibility(r3);
    L_0x014f:
        r1 = r12.ac;
        r5 = r12.K;
        r1.setOnLongClickListener(r5);
        r1 = 2131755529; // 0x7f100209 float:1.914194E38 double:1.053227172E-314;
        r7 = r12.findViewById(r1);
        r1 = r13.a;
        r1 = android.text.TextUtils.isEmpty(r1);
        if (r1 != 0) goto L_0x01f5;
    L_0x0165:
        r1 = r12.Z;
        r1.setVisibility(r3);
        r1 = com.whatsapp.App.a1();
        if (r1 == 0) goto L_0x03a8;
    L_0x0170:
        r1 = r13.a;
        r5 = 10;
        r1 = r1.lastIndexOf(r5);
        if (r1 <= 0) goto L_0x0368;
    L_0x017a:
        r5 = r13.a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0366 }
        r1 = r5.substring(r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0366 }
    L_0x0180:
        r5 = com.whatsapp.aam.c;
        r1 = r5.isRtl(r1);
        if (r1 != 0) goto L_0x03a8;
    L_0x0188:
        r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3);
        r5 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3);
        r7.measure(r1, r5);
        r1 = r7.getMeasuredWidth();
    L_0x0197:
        r5 = r13.a;
        if (r1 != 0) goto L_0x01af;
    L_0x019b:
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r5 = r8.append(r5);
        r8 = "\n";
        r5 = r5.append(r8);
        r5 = r5.toString();
    L_0x01af:
        r8 = r12.Z;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x036c }
        r12.setMessageText(r5, r8, r1, r13);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x036c }
        r1 = r12.x;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x036c }
        r5 = r12.getContext();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x036c }
        r5 = r5.getResources();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x036c }
        r8 = 2131623989; // 0x7f0e0035 float:1.8875145E38 double:1.053162183E-314;
        r5 = r5.getColor(r8);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x036c }
        r1.setTextColor(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x036c }
        r1 = r12.getResources();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x036c }
        r5 = 2131427441; // 0x7f0b0071 float:1.8476498E38 double:1.053065075E-314;
        r1 = r1.getDimensionPixelSize(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x036c }
        r5 = 0;
        r8 = r12.getResources();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x036c }
        r9 = 2131427441; // 0x7f0b0071 float:1.8476498E38 double:1.053065075E-314;
        r8 = r8.getDimensionPixelSize(r9);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x036c }
        r9 = r12.getResources();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x036c }
        r10 = 2131427439; // 0x7f0b006f float:1.8476494E38 double:1.053065074E-314;
        r9 = r9.getDimensionPixelSize(r10);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x036c }
        r7.setPadding(r1, r5, r8, r9);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x036c }
        r1 = r12.ac;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x036c }
        r5 = 0;
        com.whatsapp.ConversationRowImage.RowImageView.a(r1, r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x036c }
        if (r6 == 0) goto L_0x023b;
    L_0x01f5:
        r1 = r12.Z;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x036c }
        r5 = 8;
        r1.setVisibility(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x036c }
        r1 = r12.x;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x036c }
        r5 = r12.getContext();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x036c }
        r5 = r5.getResources();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x036c }
        r8 = 2131623990; // 0x7f0e0036 float:1.8875147E38 double:1.0531621833E-314;
        r5 = r5.getColor(r8);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x036c }
        r1.setTextColor(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x036c }
        r1 = r12.getResources();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x036c }
        r5 = 2131427442; // 0x7f0b0072 float:1.84765E38 double:1.0530650757E-314;
        r1 = r1.getDimensionPixelSize(r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x036c }
        r5 = 0;
        r8 = r12.getResources();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x036c }
        r9 = 2131427442; // 0x7f0b0072 float:1.84765E38 double:1.0530650757E-314;
        r8 = r8.getDimensionPixelSize(r9);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x036c }
        r9 = r12.getResources();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x036c }
        r10 = 2131427440; // 0x7f0b0070 float:1.8476496E38 double:1.0530650747E-314;
        r9 = r9.getDimensionPixelSize(r10);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x036c }
        r7.setPadding(r1, r5, r8, r9);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x036c }
        r1 = r12.ac;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x036c }
        r5 = 1;
        com.whatsapp.ConversationRowImage.RowImageView.a(r1, r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x036c }
    L_0x023b:
        r1 = r12.ac;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x036e }
        r5 = r13.k;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x036e }
        r5 = r5.a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x036e }
        com.whatsapp.ConversationRowImage.RowImageView.b(r1, r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x036e }
        r1 = r12.x;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x036e }
        if (r1 == 0) goto L_0x027a;
    L_0x0248:
        r1 = r13.x;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x036e }
        if (r1 == 0) goto L_0x0271;
    L_0x024c:
        r1 = r13.k;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0370 }
        r1 = r1.a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0370 }
        if (r1 == 0) goto L_0x0271;
    L_0x0252:
        r1 = r13.k;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0372 }
        r1 = r1.c;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0372 }
        r1 = com.whatsapp.l5.e(r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0372 }
        if (r1 != 0) goto L_0x0271;
    L_0x025c:
        r5 = r12.x;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0374 }
        r1 = r13.a;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0374 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0374 }
        if (r1 == 0) goto L_0x0378;
    L_0x0266:
        r1 = 2130837634; // 0x7f020082 float:1.7280228E38 double:1.052773672E-314;
    L_0x0269:
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r5.setCompoundDrawablesWithIntrinsicBounds(r1, r7, r8, r9);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x037d }
        if (r6 == 0) goto L_0x027a;
    L_0x0271:
        r1 = r12.x;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x037d }
        r5 = 0;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r1.setCompoundDrawablesWithIntrinsicBounds(r5, r7, r8, r9);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x037d }
    L_0x027a:
        r5 = new android.graphics.BitmapFactory$Options;
        r5.<init>();
        r1 = 1;
        r5.inJustDecodeBounds = r1;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x037f }
        r1 = r0.file;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x037f }
        if (r1 == 0) goto L_0x0383;
    L_0x0286:
        r1 = r0.file;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x037f }
        r1 = r1.exists();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x037f }
        if (r1 == 0) goto L_0x0383;
    L_0x028e:
        if (r2 == 0) goto L_0x029b;
    L_0x0290:
        r1 = r0.file;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0386 }
        r1 = r1.getAbsolutePath();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0386 }
        android.graphics.BitmapFactory.decodeFile(r1, r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0386 }
        if (r6 == 0) goto L_0x02bf;
    L_0x029b:
        r1 = r13.u;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0388 }
        if (r1 != 0) goto L_0x0390;
    L_0x029f:
        r1 = r13.c();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0388 }
        if (r1 == 0) goto L_0x03a5;
    L_0x02a5:
        r1 = r13.c();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x038a }
        r1 = r1.length();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x038a }
        if (r1 <= 0) goto L_0x03a5;
    L_0x02af:
        r1 = r13.c();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x038c, StringIndexOutOfBoundsException -> 0x03a3, IllegalArgumentException -> 0x03a1 }
        r7 = 0;
        r1 = android.backport.util.Base64.decode(r1, r7);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x038c, StringIndexOutOfBoundsException -> 0x03a3, IllegalArgumentException -> 0x03a1 }
    L_0x02b8:
        if (r1 == 0) goto L_0x02bf;
    L_0x02ba:
        r4 = 0;
        r7 = r1.length;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0396 }
        android.graphics.BitmapFactory.decodeByteArray(r1, r4, r7, r5);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0396 }
    L_0x02bf:
        r1 = r5.outWidth;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0398 }
        if (r1 <= 0) goto L_0x030a;
    L_0x02c3:
        r1 = r5.outHeight;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0398 }
        if (r1 <= 0) goto L_0x030a;
    L_0x02c7:
        if (r2 == 0) goto L_0x02de;
    L_0x02c9:
        r1 = new android.media.ExifInterface;	 Catch:{ IOException -> 0x039e }
        r0 = r0.file;	 Catch:{ IOException -> 0x039e }
        r0 = r0.getAbsolutePath();	 Catch:{ IOException -> 0x039e }
        r1.<init>(r0);	 Catch:{ IOException -> 0x039e }
        r0 = bb;	 Catch:{ IOException -> 0x039e }
        r2 = 0;
        r0 = r0[r2];	 Catch:{ IOException -> 0x039e }
        r2 = 1;
        r3 = r1.getAttributeInt(r0, r2);	 Catch:{ IOException -> 0x039e }
    L_0x02de:
        r0 = 6;
        if (r3 == r0) goto L_0x02e3;
    L_0x02e1:
        if (r3 != r11) goto L_0x02f3;
    L_0x02e3:
        r0 = r12.ac;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x039a }
        r1 = r5.outHeight;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x039a }
        com.whatsapp.ConversationRowImage.RowImageView.a(r0, r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x039a }
        r0 = r12.ac;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x039a }
        r1 = r5.outWidth;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x039a }
        com.whatsapp.ConversationRowImage.RowImageView.b(r0, r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x039a }
        if (r6 == 0) goto L_0x0301;
    L_0x02f3:
        r0 = r12.ac;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x039a }
        r1 = r5.outWidth;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x039a }
        com.whatsapp.ConversationRowImage.RowImageView.a(r0, r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x039a }
        r0 = r12.ac;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x039a }
        r1 = r5.outHeight;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x039a }
        com.whatsapp.ConversationRowImage.RowImageView.b(r0, r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x039a }
    L_0x0301:
        r0 = r12.ac;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x039c }
        r1 = r12.U;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x039c }
        com.whatsapp.util.bd.b(r13, r0, r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x039c }
        if (r6 == 0) goto L_0x032b;
    L_0x030a:
        r0 = r12.ac;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x039c }
        r1 = com.whatsapp.a4d.a();	 Catch:{ ArrayIndexOutOfBoundsException -> 0x039c }
        r1 = r1.k;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x039c }
        com.whatsapp.ConversationRowImage.RowImageView.a(r0, r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x039c }
        r0 = r12.ac;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x039c }
        r1 = r12.ac;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x039c }
        r1 = com.whatsapp.ConversationRowImage.RowImageView.a(r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x039c }
        r1 = r1 * 9;
        r1 = r1 / 16;
        com.whatsapp.ConversationRowImage.RowImageView.b(r0, r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x039c }
        r0 = r12.ac;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x039c }
        r1 = r12.U;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x039c }
        com.whatsapp.util.bd.b(r13, r0, r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x039c }
    L_0x032b:
        r0 = r12.ac;
        r0.requestLayout();
        return;
    L_0x0331:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0333 }
    L_0x0333:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0335 }
    L_0x0335:
        r0 = move-exception;
        throw r0;
    L_0x0337:
        r0 = move-exception;
        throw r0;
    L_0x0339:
        r1 = r3;
        goto L_0x0066;
    L_0x033c:
        r0 = move-exception;
        throw r0;
    L_0x033e:
        r1 = r12.getResources();
        r8 = 2131624046; // 0x7f0e006e float:1.887526E38 double:1.053162211E-314;
        r1 = r1.getColor(r8);
        goto L_0x0078;
    L_0x034b:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x034d }
    L_0x034d:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x034f }
    L_0x034f:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0351 }
    L_0x0351:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0353 }
    L_0x0353:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0355 }
    L_0x0355:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0357 }
    L_0x0357:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0359 }
    L_0x0359:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x035b }
    L_0x035b:
        r0 = move-exception;
        throw r0;
    L_0x035d:
        r1 = r3;
        goto L_0x00f7;
    L_0x0360:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0362 }
    L_0x0362:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0364 }
    L_0x0364:
        r0 = move-exception;
        throw r0;
    L_0x0366:
        r0 = move-exception;
        throw r0;
    L_0x0368:
        r1 = r13.a;
        goto L_0x0180;
    L_0x036c:
        r0 = move-exception;
        throw r0;
    L_0x036e:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0370 }
    L_0x0370:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0372 }
    L_0x0372:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0374 }
    L_0x0374:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0376 }
    L_0x0376:
        r0 = move-exception;
        throw r0;
    L_0x0378:
        r1 = 2130837633; // 0x7f020081 float:1.7280226E38 double:1.0527736713E-314;
        goto L_0x0269;
    L_0x037d:
        r0 = move-exception;
        throw r0;
    L_0x037f:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0381 }
    L_0x0381:
        r0 = move-exception;
        throw r0;
    L_0x0383:
        r2 = r3;
        goto L_0x028e;
    L_0x0386:
        r0 = move-exception;
        throw r0;
    L_0x0388:
        r0 = move-exception;
        throw r0;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x038a }
    L_0x038a:
        r0 = move-exception;
        throw r0;
    L_0x038c:
        r1 = move-exception;
    L_0x038d:
        r1 = r4;
        goto L_0x02b8;
    L_0x0390:
        r1 = r13.e();
        goto L_0x02b8;
    L_0x0396:
        r0 = move-exception;
        throw r0;
    L_0x0398:
        r0 = move-exception;
        throw r0;
    L_0x039a:
        r0 = move-exception;
        throw r0;
    L_0x039c:
        r0 = move-exception;
        throw r0;
    L_0x039e:
        r0 = move-exception;
        goto L_0x02de;
    L_0x03a1:
        r1 = move-exception;
        goto L_0x038d;
    L_0x03a3:
        r1 = move-exception;
        goto L_0x038d;
    L_0x03a5:
        r1 = r4;
        goto L_0x02b8;
    L_0x03a8:
        r1 = r3;
        goto L_0x0197;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ConversationRowImage.a(com.whatsapp.protocol.co):void");
    }

    protected void f() {
        boolean z = false;
        MediaData mediaData = (MediaData) this.e.Q;
        try {
            if (!this.e.k.a) {
                if (!mediaData.transferred) {
                    return;
                }
            }
            if (mediaData.file != null) {
                z = new File(Uri.fromFile(mediaData.file).getPath()).exists();
            }
            try {
                Log.i(bb[17] + this.e.k.a + bb[2] + this.e.c + bb[15] + this.e.A + bb[5] + ag.g(this.e.q) + bb[10] + mediaData.file + bb[8] + mediaData.progress + bb[14] + mediaData.transferred + bb[6] + mediaData.transferring + bb[11] + mediaData.fileSize + bb[12] + this.e.z + bb[13] + this.e.b);
                Intent a;
                if (z) {
                    a = MediaView.a(this.e, this.e.k.c, getContext(), this.ac);
                    try {
                        if (this.i) {
                            a.putExtra(bb[4], true);
                        }
                        try {
                            getContext().startActivity(a);
                            if (!MediaView.c()) {
                                return;
                            }
                            if (getContext() instanceof Activity) {
                                ((Activity) getContext()).overridePendingTransition(0, 0);
                                return;
                            }
                            return;
                        } catch (ArrayIndexOutOfBoundsException e) {
                            throw e;
                        } catch (ArrayIndexOutOfBoundsException e2) {
                            throw e2;
                        }
                    } catch (ArrayIndexOutOfBoundsException e22) {
                        throw e22;
                    }
                }
                Log.w(bb[3]);
                if (this.i) {
                    Context context = getContext();
                    try {
                        if (context instanceof DialogToastActivity) {
                            App.a((DialogToastActivity) context);
                        }
                        if (!DialogToastActivity.f) {
                            return;
                        }
                    } catch (ArrayIndexOutOfBoundsException e222) {
                        throw e222;
                    }
                }
                a = new Intent(getContext(), MediaGallery.class);
                a.putExtra(bb[9], -1);
                a.putExtra(bb[1], true);
                a.putExtra(bb[7], this.e.k.c);
                a.putExtra(bb[16], this.e.k.hashCode());
                getContext().startActivity(a);
            } catch (ArrayIndexOutOfBoundsException e2222) {
                throw e2222;
            }
        } catch (ArrayIndexOutOfBoundsException e22222) {
            throw e22222;
        } catch (ArrayIndexOutOfBoundsException e222222) {
            throw e222222;
        }
    }
}
