package com.whatsapp.gallerypicker;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.ViewPager;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.whatsapp.App;
import com.whatsapp.DialogToastActivity;
import com.whatsapp.MediaGalleryImageView;
import com.whatsapp.PhotoView;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.pz;
import com.whatsapp.util.Log;
import com.whatsapp.util.bf;
import com.whatsapp.util.u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class ImagePreview extends DialogToastActivity {
    private static bf P;
    private static final String[] V;
    private HashMap A;
    private float B;
    private View C;
    private q D;
    private Handler E;
    private ba F;
    private HashMap G;
    private Drawable H;
    private Runnable I;
    private ArrayList J;
    private pz K;
    private int[] L;
    private ViewPager M;
    private boolean N;
    private float O;
    private int Q;
    private boolean R;
    private ImageView S;
    private TextView T;
    private HashMap U;
    private HashMap n;
    private OnGlobalLayoutListener o;
    private View p;
    private ViewGroup q;
    private Uri r;
    private ViewGroup s;
    private ThumbsGrid t;
    private int u;
    private Handler v;
    private ImageView w;
    private Drawable x;
    private int y;
    private View z;

    class 2 extends MediaGalleryImageView {
        final ImagePreview z;

        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (ImagePreview.d(this.z)) {
                canvas.drawColor(1727987712);
            }
        }

        protected void onMeasure(int i, int i2) {
            int defaultSize = getDefaultSize(getSuggestedMinimumWidth(), i);
            setMeasuredDimension(defaultSize, defaultSize);
        }

        2(ImagePreview imagePreview, Context context) {
            this.z = imagePreview;
            super(context);
        }
    }

    class 5 extends ImageView {
        final ImagePreview a;

        protected void onMeasure(int i, int i2) {
            int defaultSize = getDefaultSize(getSuggestedMinimumHeight(), i2);
            setMeasuredDimension(defaultSize, defaultSize);
        }

        5(ImagePreview imagePreview, Context context) {
            this.a = imagePreview;
            super(context);
        }

        public void onDraw(Canvas canvas) {
            if (!(isSelected() || isPressed())) {
                canvas.drawColor(-15658735);
            }
            super.onDraw(canvas);
        }
    }

    class ThumbImageView extends MediaGalleryImageView {
        private Uri A;
        final ImagePreview B;
        private Matrix z;

        public ThumbImageView(ImagePreview imagePreview, Context context, Uri uri) {
            this.B = imagePreview;
            super(context);
            this.z = new Matrix();
            setScaleType(ScaleType.CENTER_CROP);
            a(uri);
            setOnClickListener(new b4(this, imagePreview));
            setOnTouchListener(new bn(this, imagePreview));
        }

        private void a(Uri uri) {
            Uri uri2;
            this.A = uri;
            int i = (int) (72.0f * getResources().getDisplayMetrics().density);
            if (ImagePreview.b(this.B).containsKey(uri)) {
                uri2 = (Uri) ImagePreview.b(this.B).get(uri);
            } else {
                uri2 = uri;
            }
            setBackgroundColor(getResources().getColor(2131624017));
            new a0(this, uri2, i).execute(new Void[0]);
        }

        public void onDraw(Canvas canvas) {
            canvas.save();
            if (ImagePreview.f(this.B) == this) {
                canvas.drawColor(-15658735);
                return;
            }
            this.v = false;
            if (ImagePreview.i(this.B).containsKey(this.A)) {
                this.z.setRotate((float) ((Integer) ImagePreview.i(this.B).get(this.A)).intValue(), (float) (getWidth() / 2), (float) (getHeight() / 2));
                canvas.concat(this.z);
            }
            super.onDraw(canvas);
            canvas.restore();
        }

        protected void onMeasure(int i, int i2) {
            int defaultSize = getDefaultSize(getSuggestedMinimumHeight(), i2);
            setMeasuredDimension(defaultSize, defaultSize);
        }

        static Uri a(ThumbImageView thumbImageView) {
            return thumbImageView.A;
        }

        static void a(ThumbImageView thumbImageView, Uri uri) {
            thumbImageView.a(uri);
        }
    }

    class ThumbsGrid extends ViewGroup {
        int a;
        final ImagePreview b;

        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int i5 = MediaGalleryFragmentBase.e;
            int childCount = getChildCount();
            if (this.a != 0) {
                int i6 = (int) (2.0f * getResources().getDisplayMetrics().density);
                int i7 = (i3 - i) / this.a;
                int i8 = 0;
                while (i8 < childCount) {
                    View childAt = getChildAt(i8);
                    int i9 = (i8 % this.a) * i7;
                    int i10 = (i8 / this.a) * i7;
                    if (!App.a1()) {
                        i9 = (i3 - i9) - i7;
                    }
                    childAt.layout((i + i9) + i6, (i2 + i10) + i6, ((i9 + i) + i7) - i6, ((i10 + i2) + i7) - i6);
                    i9 = i8 + 1;
                    if (i5 == 0) {
                        i8 = i9;
                    } else {
                        return;
                    }
                }
            }
        }

        public void onMeasure(int i, int i2) {
            int i3 = 2;
            super.onMeasure(i, i2);
            int i4 = (int) (72.0f * getResources().getDisplayMetrics().density);
            int childCount = getChildCount();
            int measuredWidth = getMeasuredWidth();
            if (childCount > 0 && measuredWidth > 0) {
                this.a = measuredWidth / i4;
                i4 = ((this.a + childCount) - 1) / this.a;
                if (childCount % this.a == 1) {
                    this.a++;
                    i4 = ((this.a + childCount) - 1) / this.a;
                }
                if (i4 > 2) {
                    this.a = ((childCount + 2) - 1) / 2;
                } else {
                    i3 = i4;
                }
                setMeasuredDimension(getMeasuredWidth(), i3 * (measuredWidth / this.a));
            }
        }

        @SuppressLint({"NewApi"})
        public ThumbsGrid(ImagePreview imagePreview, Context context) {
            this.b = imagePreview;
            super(context);
            if (VERSION.SDK_INT >= 11) {
                setLayoutTransition(new LayoutTransition());
            }
        }
    }

    public ImagePreview() {
        this.U = new HashMap();
        this.A = new HashMap();
        this.n = new HashMap();
        this.G = new HashMap();
        this.E = new Handler(Looper.getMainLooper());
        this.L = new int[2];
        this.o = new bv(this);
        this.v = new Handler(Looper.getMainLooper());
        this.I = new b2(this);
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArrayList(V[3], this.J);
        bundle.putSerializable(V[4], this.U);
        bundle.putSerializable(V[5], this.A);
        bundle.putSerializable(V[6], this.n);
        bundle.putSerializable(V[2], this.G);
    }

    static ViewGroup p(ImagePreview imagePreview) {
        return imagePreview.s;
    }

    private void a(PhotoView photoView, Uri uri) {
        Uri uri2;
        photoView.setTag(uri);
        if (this.A.containsKey(uri)) {
            uri2 = (Uri) this.A.get(uri);
        } else {
            uri2 = uri;
        }
        this.F.a(new bd(this, Math.max(this.M.getMeasuredHeight(), this.M.getMeasuredWidth()), uri2, uri), new am(this, photoView, uri));
        if (this.U.containsKey(uri)) {
            photoView.setRotation((float) ((Integer) this.U.get(uri)).intValue(), false);
        }
    }

    static Uri a(ImagePreview imagePreview, Uri uri) {
        imagePreview.r = uri;
        return uri;
    }

    static Runnable t(ImagePreview imagePreview) {
        return imagePreview.I;
    }

    static ArrayList c(ImagePreview imagePreview) {
        return imagePreview.J;
    }

    static TextView x(ImagePreview imagePreview) {
        return imagePreview.T;
    }

    private void a() {
        int i = MediaGalleryFragmentBase.e;
        if (this.F != null) {
            this.F.b();
            this.F = null;
        }
        ba.c();
        if (this.M != null) {
            int i2 = 0;
            while (i2 < this.M.getChildCount()) {
                View childAt = this.M.getChildAt(i2);
                if (childAt instanceof PhotoView) {
                    ((PhotoView) childAt).b();
                }
                int i3 = i2 + 1;
                if (i != 0) {
                    break;
                }
                i2 = i3;
            }
        }
        App.w(getApplicationContext());
    }

    static View n(ImagePreview imagePreview) {
        return imagePreview.p;
    }

    static ImageView s(ImagePreview imagePreview) {
        return imagePreview.w;
    }

    static int m(ImagePreview imagePreview) {
        return imagePreview.y;
    }

    static {
        String[] strArr = new String[25];
        String str = "f\u001f\u001d\u0000H\u007f\u0000\u0019\u0011Dj\u0005S\u0003H|\u0006\u000e\bT";
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
                        i3 = 15;
                        break;
                    case at.g /*1*/:
                        i3 = 114;
                        break;
                    case at.i /*2*/:
                        i3 = 124;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_checkedTextViewStyle;
                        break;
                    default:
                        i3 = 45;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "l\u0013\f\u0013D`\u001c\u000f";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "z\u0000\u0015\u0014";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "}\u001d\b\u0006Yf\u001d\u0012\u0014";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "l\u0000\u0013\u0017X}\u001b\u000f";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "l\u0000\u0013\u0017_j\u0011\b\u0014";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "f\u001c\u0015\u0013Dn\u001e.\u0002N{";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "b\u0013\u0004$_`\u0002";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "|\u0011\u001d\u000bHZ\u00025\u0001cj\u0017\u0018\u0002I";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "`\u0007\b\u0017X{4\u0013\u0015@n\u0006";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "i\u001e\u001d\u0013Yj\u001c.\bYn\u0006\u0015\bC";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "l\u0000\u0013\u0017ov=\t\u0013]z\u0006/\u000eWj";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "}\u001d\b\u0006Yf\u001d\u0012";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "`\u0007\b\u0017X{";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    str = "n\u001c\u0018\u0015Bf\u0016R\u000eC{\u0017\u0012\u0013\u0003j\n\b\u0015L!!(5hN?";
                    obj = 14;
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    strArr2 = strArr3;
                    str = "f\u001f\u001d\u0000H\u007f\u0000\u0019\u0011Dj\u0005S\u0004_j\u0013\b\u0002";
                    obj = 15;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "b\u0013\u00048D{\u0017\u0011\u0014";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "e\u001b\u0018";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "l\u0000\u0013\u0017_j\u0011\b\u0014";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "}\u001d\b\u0006Yf\u001d\u0012\u0014";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "l\u0000\u0013\u0017X}\u001b\u000f";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "z\u0000\u0015\u0014";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "l\u0013\f\u0013D`\u001c";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "l\u0013\f\u0013D`\u001c\u000f";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    V = strArr3;
                    P = new bf(256);
                    return;
                default:
                    strArr2[i] = str;
                    str = "}\u0017\u001f\u0013";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static pz u(ImagePreview imagePreview) {
        return imagePreview.K;
    }

    static boolean r(ImagePreview imagePreview) {
        return imagePreview.N;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onCreate(android.os.Bundle r9) {
        /*
        r8 = this;
        r7 = 0;
        r6 = 1;
        r2 = com.whatsapp.gallerypicker.MediaGalleryFragmentBase.e;
        r0 = V;
        r1 = 16;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        super.onCreate(r9);
        r0 = r8.getApplicationContext();
        com.whatsapp.App.w(r0);
        r0 = r8.getSupportActionBar();
        r0.setDisplayHomeAsUpEnabled(r6);
        r0 = r8.getSupportActionBar();
        r0.setDisplayShowHomeEnabled(r7);
        if (r9 != 0) goto L_0x027a;
    L_0x0027:
        r0 = r8.getIntent();
        r1 = V;
        r3 = 15;
        r1 = r1[r3];
        r0 = r0.getParcelableArrayListExtra(r1);
        r8.J = r0;
        r0 = r8.getIntent();
        r0 = r0.getExtras();
        if (r2 == 0) goto L_0x004d;
    L_0x0041:
        r1 = V;
        r3 = 22;
        r1 = r1[r3];
        r1 = r9.getParcelableArrayList(r1);
        r8.J = r1;
    L_0x004d:
        r1 = r0;
        r0 = new java.util.HashMap;
        r0.<init>();
        r8.G = r0;
        r0 = r8.J;
        r3 = r0.iterator();
    L_0x005b:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x007e;
    L_0x0061:
        r0 = r3.next();
        r0 = (android.net.Uri) r0;
        r4 = V;
        r5 = 23;
        r4 = r4[r5];
        r4 = r0.getQueryParameter(r4);
        r5 = android.text.TextUtils.isEmpty(r4);
        if (r5 != 0) goto L_0x007c;
    L_0x0077:
        r5 = r8.G;
        r5.put(r0, r4);
    L_0x007c:
        if (r2 == 0) goto L_0x005b;
    L_0x007e:
        if (r1 == 0) goto L_0x00db;
    L_0x0080:
        r0 = V;
        r2 = 20;
        r0 = r0[r2];
        r0 = r1.getSerializable(r0);
        r0 = (java.util.HashMap) r0;
        r8.U = r0;
        r0 = r8.U;
        if (r0 != 0) goto L_0x0099;
    L_0x0092:
        r0 = new java.util.HashMap;
        r0.<init>();
        r8.U = r0;
    L_0x0099:
        r0 = V;
        r2 = 21;
        r0 = r0[r2];
        r0 = r1.getSerializable(r0);
        r0 = (java.util.HashMap) r0;
        r8.A = r0;
        r0 = r8.A;
        if (r0 != 0) goto L_0x00b2;
    L_0x00ab:
        r0 = new java.util.HashMap;
        r0.<init>();
        r8.A = r0;
    L_0x00b2:
        r0 = V;
        r2 = 19;
        r0 = r0[r2];
        r0 = r1.getSerializable(r0);
        r0 = (java.util.HashMap) r0;
        r8.n = r0;
        r0 = r8.n;
        if (r0 != 0) goto L_0x00cb;
    L_0x00c4:
        r0 = new java.util.HashMap;
        r0.<init>();
        r8.n = r0;
    L_0x00cb:
        r0 = V;
        r2 = 24;
        r0 = r0[r2];
        r0 = r1.getSerializable(r0);
        r0 = (java.util.HashMap) r0;
        if (r0 == 0) goto L_0x00db;
    L_0x00d9:
        r8.G = r0;
    L_0x00db:
        r0 = r8.U;
        r1 = P;
        r0.putAll(r1);
        r0 = r8.getIntent();
        r1 = V;
        r2 = 18;
        r1 = r1[r2];
        r0 = r0.getStringExtra(r1);
        r1 = android.text.TextUtils.isEmpty(r0);
        if (r1 != 0) goto L_0x0103;
    L_0x00f6:
        r1 = com.whatsapp.App.as;
        r0 = r1.b(r0);
        r0 = r0.a(r8);
        r8.h(r0);
    L_0x0103:
        r0 = 2131231867; // 0x7f08047b float:1.8079827E38 double:1.052968449E-314;
        r8.setTitle(r0);
        r0 = r8.getIntent();
        r1 = V;
        r2 = 17;
        r1 = r1[r2];
        r2 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r0 = r0.getIntExtra(r1, r2);
        r8.Q = r0;
        r0 = r8.J;
        if (r0 != 0) goto L_0x0124;
    L_0x0120:
        r8.finish();
    L_0x0123:
        return;
    L_0x0124:
        r0 = r8.getResources();
        r1 = 2130839545; // 0x7f0207f9 float:1.7284104E38 double:1.052774616E-314;
        r0 = r0.getDrawable(r1);
        r8.H = r0;
        r0 = r8.getResources();
        r1 = 2130839544; // 0x7f0207f8 float:1.7284102E38 double:1.0527746155E-314;
        r0 = r0.getDrawable(r1);
        r8.x = r0;
        r0 = 2130903205; // 0x7f0300a5 float:1.7413221E38 double:1.052806068E-314;
        r8.setContentView(r0);
        r0 = 2131755717; // 0x7f1002c5 float:1.9142321E38 double:1.053227265E-314;
        r0 = r8.findViewById(r0);
        r0 = (android.view.ViewGroup) r0;
        r8.s = r0;
        r0 = 2131755719; // 0x7f1002c7 float:1.9142325E38 double:1.053227266E-314;
        r0 = r8.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r8.T = r0;
        r0 = 2131755718; // 0x7f1002c6 float:1.9142323E38 double:1.0532272656E-314;
        r0 = r8.findViewById(r0);
        r8.C = r0;
        r0 = 2131755720; // 0x7f1002c8 float:1.9142327E38 double:1.0532272666E-314;
        r0 = r8.findViewById(r0);
        r0 = (android.view.ViewGroup) r0;
        r8.q = r0;
        r0 = new com.whatsapp.gallerypicker.ImagePreview$2;
        r0.<init>(r8, r8);
        r8.w = r0;
        r0 = r8.w;
        r0.setSelected(r6);
        r0 = r8.w;
        r1 = android.widget.ImageView.ScaleType.CENTER_CROP;
        r0.setScaleType(r1);
        r0 = r8.q;
        r1 = r8.w;
        r0.addView(r1);
        r0 = 2131755458; // 0x7f1001c2 float:1.9141796E38 double:1.053227137E-314;
        r0 = r8.findViewById(r0);
        r0 = (android.support.v4.view.ViewPager) r0;
        r8.M = r0;
        r0 = r8.M;
        r1 = 1094713344; // 0x41400000 float:12.0 double:5.408602553E-315;
        r2 = r8.getResources();
        r2 = r2.getDisplayMetrics();
        r2 = r2.density;
        r1 = r1 * r2;
        r1 = (int) r1;
        r0.setPageMargin(r1);
        r0 = new com.whatsapp.gallerypicker.q;
        r1 = 0;
        r0.<init>(r8, r1);
        r8.D = r0;
        r0 = r8.M;
        r1 = r8.D;
        r0.setAdapter(r1);
        r0 = r8.M;
        r1 = new com.whatsapp.gallerypicker.be;
        r1.<init>(r8);
        r0.setOnPageChangeListener(r1);
        r0 = 2131755628; // 0x7f10026c float:1.914214E38 double:1.053227221E-314;
        r0 = r8.findViewById(r0);
        r0 = (android.widget.Button) r0;
        r1 = 2131231862; // 0x7f080476 float:1.8079817E38 double:1.0529684463E-314;
        r0.setText(r1);
        r1 = new com.whatsapp.gallerypicker.z;
        r1.<init>(r8);
        r0.setOnClickListener(r1);
        r0 = new com.whatsapp.gallerypicker.ImagePreview$5;
        r0.<init>(r8, r8);
        r8.S = r0;
        r0 = r8.S;
        r1 = 2131230792; // 0x7f080048 float:1.8077647E38 double:1.0529679177E-314;
        r1 = r8.getString(r1);
        r0.setContentDescription(r1);
        r0 = r8.S;
        r1 = android.widget.ImageView.ScaleType.CENTER;
        r0.setScaleType(r1);
        r0 = r8.S;
        r1 = 2130839421; // 0x7f02077d float:1.7283852E38 double:1.0527745547E-314;
        r0.setImageResource(r1);
        r0 = r8.S;
        r1 = 2130839767; // 0x7f0208d7 float:1.7284554E38 double:1.0527747257E-314;
        r0.setBackgroundResource(r1);
        r0 = r8.S;
        r1 = new com.whatsapp.gallerypicker.ap;
        r1.<init>(r8);
        r0.setOnClickListener(r1);
        r0 = new com.whatsapp.gallerypicker.ax;
        r0.<init>(r8, r8);
        r8.K = r0;
        r0 = r8.K;
        r1 = new com.whatsapp.gallerypicker.as;
        r1.<init>(r8);
        r0.a(r1);
        r0 = 2131755629; // 0x7f10026d float:1.9142143E38 double:1.0532272216E-314;
        r0 = r8.findViewById(r0);
        r0 = (android.widget.Button) r0;
        r1 = new com.whatsapp.gallerypicker.an;
        r1.<init>(r8);
        r0.setOnClickListener(r1);
        r0 = 2131755716; // 0x7f1002c4 float:1.914232E38 double:1.0532272646E-314;
        r0 = r8.findViewById(r0);
        r0 = (android.view.ViewGroup) r0;
        r1 = new com.whatsapp.gallerypicker.ImagePreview$ThumbsGrid;
        r1.<init>(r8, r8);
        r8.t = r1;
        r1 = r8.t;
        r0.addView(r1);
        r1 = r8.Q;
        if (r1 != 0) goto L_0x0251;
    L_0x0245:
        r1 = r8.J;
        r1 = r1.size();
        if (r1 != r6) goto L_0x0251;
    L_0x024d:
        r1 = 4;
        r0.setVisibility(r1);
    L_0x0251:
        r0 = 2131755713; // 0x7f1002c1 float:1.9142313E38 double:1.053227263E-314;
        r0 = r8.findViewById(r0);
        r8.p = r0;
        r0 = r8.p;
        r0 = r0.getViewTreeObserver();
        r1 = r8.o;
        r0.addOnGlobalLayoutListener(r1);
        r8.b();
        r8.b(r7);
        r0 = new com.whatsapp.gallerypicker.ba;
        r1 = r8.getContentResolver();
        r2 = r8.E;
        r0.<init>(r1, r2);
        r8.F = r0;
        goto L_0x0123;
    L_0x027a:
        r0 = r9;
        goto L_0x0041;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.ImagePreview.onCreate(android.os.Bundle):void");
    }

    static int o(ImagePreview imagePreview) {
        return imagePreview.u;
    }

    static Drawable q(ImagePreview imagePreview) {
        return imagePreview.H;
    }

    static HashMap i(ImagePreview imagePreview) {
        return imagePreview.U;
    }

    static float a(ImagePreview imagePreview, float f) {
        imagePreview.O = f;
        return f;
    }

    static int[] a(ImagePreview imagePreview) {
        return imagePreview.L;
    }

    private void a(Uri uri, View view) {
        this.J.remove(uri);
        this.U.remove(uri);
        this.A.remove(uri);
        this.n.remove(uri);
        this.G.remove(uri);
        this.t.removeView(view);
        this.D.notifyDataSetChanged();
        if (this.u >= this.J.size()) {
            this.u = this.J.size() - 1;
        }
        if (this.u >= 0) {
            this.M.setCurrentItem(this.u);
            b(this.u);
        }
        if (this.J.size() == this.Q - 1) {
            this.t.addView(this.S);
        }
        if (this.J.isEmpty()) {
            finish();
        }
    }

    static HashMap b(ImagePreview imagePreview) {
        return imagePreview.A;
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        switch (i) {
            case at.g /*1*/:
                if (i2 == -1) {
                    Uri uri = (Uri) this.J.get(this.u);
                    this.A.put(uri, Uri.fromFile(App.j(uri.getLastPathSegment())));
                    Rect rect = (Rect) intent.getParcelableExtra(V[1]);
                    if (rect != null) {
                        this.n.put(uri, rect);
                    }
                    ba.a(uri.toString());
                    PhotoView photoView = (PhotoView) this.M.findViewWithTag(uri);
                    if (photoView != null) {
                        a(photoView, uri);
                    }
                    ThumbImageView.a((ThumbImageView) this.t.getChildAt(this.u), uri);
                }
            default:
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (App.j != 3 || i != 84) {
            return super.onKeyDown(i, keyEvent);
        }
        u.a((Activity) this, false);
        return true;
    }

    static ViewPager e(ImagePreview imagePreview) {
        return imagePreview.M;
    }

    static View f(ImagePreview imagePreview) {
        return imagePreview.z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r12) {
        /*
        r11 = this;
        r10 = com.whatsapp.gallerypicker.MediaGalleryFragmentBase.e;
        r0 = r11.z;
        if (r0 == 0) goto L_0x01dd;
    L_0x0006:
        r0 = r12.getAction();
        r1 = 2;
        if (r0 != r1) goto L_0x018f;
    L_0x000d:
        r0 = r11.s;
        r1 = 0;
        r0.setVisibility(r1);
        r0 = r11.q;
        r1 = r11.L;
        r0.getLocationOnScreen(r1);
        r0 = r11.q;
        r1 = r12.getX();
        r1 = (int) r1;
        r2 = r11.L;
        r3 = 0;
        r2 = r2[r3];
        r1 = r1 - r2;
        r2 = r11.O;
        r2 = (int) r2;
        r1 = r1 - r2;
        r2 = r12.getY();
        r2 = (int) r2;
        r3 = r11.L;
        r4 = 1;
        r3 = r3[r4];
        r2 = r2 - r3;
        r3 = r11.B;
        r3 = (int) r3;
        r2 = r2 - r3;
        r3 = 0;
        r4 = 0;
        r0.setPadding(r1, r2, r3, r4);
        r0 = r11.C;
        r1 = 0;
        r2 = 0;
        r3 = 0;
        r4 = r11.s;
        r4 = r4.getHeight();
        r5 = r11.M;
        r5 = r5.getHeight();
        r4 = r4 - r5;
        r0.setPadding(r1, r2, r3, r4);
        r0 = r11.T;
        r1 = r11.L;
        r0.getLocationOnScreen(r1);
        r0 = r11.L;
        r1 = 1;
        r0 = r0[r1];
        r1 = r11.T;
        r1 = r1.getHeight();
        r0 = r0 + r1;
        r1 = r11.q;
        r1 = r1.getHeight();
        r1 = r1 - r0;
        if (r1 <= 0) goto L_0x0088;
    L_0x0070:
        r2 = 1120403456; // 0x42c80000 float:100.0 double:5.53552857E-315;
        r3 = 1120403456; // 0x42c80000 float:100.0 double:5.53552857E-315;
        r4 = (float) r1;
        r5 = r12.getY();
        r0 = (float) r0;
        r0 = r5 - r0;
        r0 = r4 - r0;
        r0 = r0 * r3;
        r1 = (float) r1;
        r0 = r0 / r1;
        r0 = java.lang.Math.min(r2, r0);
        r0 = (int) r0;
        if (r10 == 0) goto L_0x0089;
    L_0x0088:
        r0 = 0;
    L_0x0089:
        if (r0 >= 0) goto L_0x008c;
    L_0x008b:
        r0 = 0;
    L_0x008c:
        r1 = 70;
        if (r0 <= r1) goto L_0x00c3;
    L_0x0090:
        r1 = r11.C;
        r2 = r0 * 2;
        r2 = r2 / 3;
        r2 = r2 * 255;
        r2 = r2 / 100;
        r2 = r2 << 24;
        r1.setBackgroundColor(r2);
        r1 = r11.R;
        if (r1 != 0) goto L_0x00b7;
    L_0x00a3:
        r1 = r0 * 255;
        r1 = r1 / 100;
        r2 = r11.T;
        r3 = r1 << 24;
        r4 = 16777215; // 0xffffff float:2.3509886E-38 double:8.2890456E-317;
        r3 = r3 | r4;
        r2.setTextColor(r3);
        r2 = r11.H;
        r2.setAlpha(r1);
    L_0x00b7:
        r1 = r11.C;
        r1.clearAnimation();
        r1 = r11.v;
        r2 = r11.I;
        r1.removeCallbacks(r2);
    L_0x00c3:
        r1 = 100;
        if (r0 != r1) goto L_0x018b;
    L_0x00c7:
        r0 = 1;
        r9 = r0;
    L_0x00c9:
        if (r9 == 0) goto L_0x0128;
    L_0x00cb:
        r0 = r11.R;
        if (r0 != 0) goto L_0x0128;
    L_0x00cf:
        r0 = 1;
        r11.R = r0;
        r0 = r11.T;
        r1 = -65536; // 0xffffffffffff0000 float:NaN double:NaN;
        r0.setTextColor(r1);
        r0 = r11.T;
        r1 = r11.x;
        r2 = 0;
        r3 = 0;
        r4 = 0;
        r0.setCompoundDrawablesWithIntrinsicBounds(r1, r2, r3, r4);
        r0 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r1 = r11.q;
        r1 = r1.getWidth();
        r1 = (float) r1;
        r0 = r0 * r1;
        r1 = r11.T;
        r1 = r1.getWidth();
        r1 = (float) r1;
        r2 = r0 / r1;
        r0 = new android.view.animation.ScaleAnimation;
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r5 = 1;
        r6 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r7 = 1;
        r8 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r4 = r2;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8);
        r1 = new android.view.animation.BounceInterpolator;
        r1.<init>();
        r0.setInterpolator(r1);
        r2 = 800; // 0x320 float:1.121E-42 double:3.953E-321;
        r0.setDuration(r2);
        r1 = 1;
        r0.setFillAfter(r1);
        r1 = r11.T;
        r1.clearAnimation();
        r1 = r11.T;
        r1.startAnimation(r0);
        r0 = r11.w;
        r0.invalidate();
        if (r10 == 0) goto L_0x0184;
    L_0x0128:
        if (r9 != 0) goto L_0x0184;
    L_0x012a:
        r0 = r11.R;
        if (r0 == 0) goto L_0x0184;
    L_0x012e:
        r0 = 0;
        r11.R = r0;
        r0 = r11.T;
        r1 = -1;
        r0.setTextColor(r1);
        r0 = r11.T;
        r1 = r11.H;
        r2 = 0;
        r3 = 0;
        r4 = 0;
        r0.setCompoundDrawablesWithIntrinsicBounds(r1, r2, r3, r4);
        r0 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r1 = r11.q;
        r1 = r1.getWidth();
        r1 = (float) r1;
        r0 = r0 * r1;
        r1 = r11.T;
        r1 = r1.getWidth();
        r1 = (float) r1;
        r1 = r0 / r1;
        r0 = new android.view.animation.ScaleAnimation;
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r5 = 1;
        r6 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r7 = 1;
        r8 = 1056964608; // 0x3f000000 float:0.5 double:5.222099017E-315;
        r3 = r1;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8);
        r1 = new android.view.animation.LinearInterpolator;
        r1.<init>();
        r0.setInterpolator(r1);
        r2 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        r0.setDuration(r2);
        r1 = 1;
        r0.setFillAfter(r1);
        r1 = r11.T;
        r1.clearAnimation();
        r1 = r11.T;
        r1.startAnimation(r0);
        r0 = r11.w;
        r0.invalidate();
    L_0x0184:
        r0 = r11.z;
        r0.invalidate();
        r0 = 1;
    L_0x018a:
        return r0;
    L_0x018b:
        r0 = 0;
        r9 = r0;
        goto L_0x00c9;
    L_0x018f:
        r0 = r12.getAction();
        r1 = 1;
        if (r0 != r1) goto L_0x01a3;
    L_0x0196:
        r0 = r11.R;
        if (r0 == 0) goto L_0x01a3;
    L_0x019a:
        r0 = r11.r;
        r1 = r11.z;
        r11.a(r0, r1);
        if (r10 == 0) goto L_0x01a8;
    L_0x01a3:
        r0 = r11.z;
        r0.invalidate();
    L_0x01a8:
        r0 = 0;
        r11.R = r0;
        r0 = 0;
        r11.r = r0;
        r0 = 0;
        r11.z = r0;
        r0 = r11.s;
        r1 = 8;
        r0.setVisibility(r1);
        r0 = r11.H;
        r1 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r0.setAlpha(r1);
        r0 = r11.T;
        r0.clearAnimation();
        r0 = r11.T;
        r1 = 16777215; // 0xffffff float:2.3509886E-38 double:8.2890456E-317;
        r0.setTextColor(r1);
        r0 = r11.T;
        r1 = r11.H;
        r2 = 0;
        r3 = 0;
        r4 = 0;
        r0.setCompoundDrawablesWithIntrinsicBounds(r1, r2, r3, r4);
        r0 = r11.v;
        r1 = r11.I;
        r0.removeCallbacks(r1);
    L_0x01dd:
        r0 = super.dispatchTouchEvent(r12);
        goto L_0x018a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.ImagePreview.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItemCompat.setShowAsAction(menu.add(0, 2, 0, 2131231020).setIcon(2130839433), 2);
        MenuItemCompat.setShowAsAction(menu.add(0, 0, 0, 2131231010).setIcon(2130839432), 2);
        MenuItemCompat.setShowAsAction(menu.add(0, 1, 0, 2131231840).setIcon(2130839444), 2);
        if (App.j == 3) {
            u.b((Activity) this);
        }
        return true;
    }

    static ViewGroup w(ImagePreview imagePreview) {
        return imagePreview.q;
    }

    static void a(ImagePreview imagePreview, int i) {
        imagePreview.b(i);
    }

    static void k(ImagePreview imagePreview) {
        imagePreview.a();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onOptionsItemSelected(android.view.MenuItem r7) {
        /*
        r6 = this;
        r5 = 0;
        r2 = 1;
        r0 = r7.getItemId();
        switch(r0) {
            case 0: goto L_0x002a;
            case 1: goto L_0x00bf;
            case 2: goto L_0x0013;
            case 16908332: goto L_0x000e;
            default: goto L_0x0009;
        };
    L_0x0009:
        r0 = super.onOptionsItemSelected(r7);
    L_0x000d:
        return r0;
    L_0x000e:
        r6.finish();
        r0 = r2;
        goto L_0x000d;
    L_0x0013:
        r0 = r6.J;
        r1 = r6.u;
        r0 = r0.get(r1);
        r0 = (android.net.Uri) r0;
        r1 = r6.t;
        r3 = r6.u;
        r1 = r1.getChildAt(r3);
        r6.a(r0, r1);
        r0 = r2;
        goto L_0x000d;
    L_0x002a:
        r3 = new android.content.Intent;
        r0 = com.whatsapp.wallpaper.CropImage.class;
        r3.<init>(r6, r0);
        r0 = r6.J;
        r1 = r6.u;
        r0 = r0.get(r1);
        r0 = (android.net.Uri) r0;
        r1 = V;
        r4 = 9;
        r1 = r1[r4];
        r3.putExtra(r1, r5);
        r1 = V;
        r4 = 12;
        r1 = r1[r4];
        r3.putExtra(r1, r5);
        r1 = V;
        r4 = 11;
        r1 = r1[r4];
        r3.putExtra(r1, r5);
        r1 = V;
        r4 = 8;
        r1 = r1[r4];
        r4 = com.whatsapp.a59.f;
        r3.putExtra(r1, r4);
        r1 = V;
        r4 = 14;
        r1 = r1[r4];
        r4 = r0.getLastPathSegment();
        r4 = com.whatsapp.App.j(r4);
        r4 = android.net.Uri.fromFile(r4);
        r3.putExtra(r1, r4);
        r1 = V;
        r4 = 10;
        r1 = r1[r4];
        r4 = android.graphics.Bitmap.CompressFormat.JPEG;
        r4 = r4.toString();
        r3.putExtra(r1, r4);
        r3.setData(r0);
        r1 = r6.n;
        r1 = r1.containsKey(r0);
        if (r1 == 0) goto L_0x00a0;
    L_0x0090:
        r1 = r6.n;
        r1 = r1.get(r0);
        r1 = (android.graphics.Rect) r1;
        r4 = V;
        r5 = 7;
        r4 = r4[r5];
        r3.putExtra(r4, r1);
    L_0x00a0:
        r1 = r6.U;
        r1 = r1.containsKey(r0);
        if (r1 == 0) goto L_0x00b9;
    L_0x00a8:
        r1 = V;
        r4 = 13;
        r1 = r1[r4];
        r4 = r6.U;
        r0 = r4.get(r0);
        r0 = (java.io.Serializable) r0;
        r3.putExtra(r1, r0);
    L_0x00b9:
        r6.startActivityForResult(r3, r2);
        r0 = r2;
        goto L_0x000d;
    L_0x00bf:
        r0 = r6.u;
        if (r0 < 0) goto L_0x0123;
    L_0x00c3:
        r0 = r6.J;
        r1 = r6.u;
        r0 = r0.get(r1);
        r0 = (android.net.Uri) r0;
        r1 = r6.U;
        r1 = r1.get(r0);
        r1 = (java.lang.Integer) r1;
        if (r1 != 0) goto L_0x00db;
    L_0x00d7:
        r1 = java.lang.Integer.valueOf(r5);
    L_0x00db:
        r1 = r1.intValue();
        r1 = r1 + 90;
        r1 = java.lang.Integer.valueOf(r1);
        r3 = r1.intValue();
        r4 = 360; // 0x168 float:5.04E-43 double:1.78E-321;
        if (r3 < r4) goto L_0x00f7;
    L_0x00ed:
        r1 = r1.intValue();
        r1 = r1 + -360;
        r1 = java.lang.Integer.valueOf(r1);
    L_0x00f7:
        r3 = r1.intValue();
        if (r3 != 0) goto L_0x0106;
    L_0x00fd:
        r3 = r6.U;
        r3.remove(r0);
        r3 = com.whatsapp.gallerypicker.MediaGalleryFragmentBase.e;
        if (r3 == 0) goto L_0x010b;
    L_0x0106:
        r3 = r6.U;
        r3.put(r0, r1);
    L_0x010b:
        r1 = r6.t;
        r3 = r6.u;
        r1 = r1.getChildAt(r3);
        r1.invalidate();
        r1 = r6.M;
        r0 = r1.findViewWithTag(r0);
        r0 = (com.whatsapp.PhotoView) r0;
        if (r0 == 0) goto L_0x0123;
    L_0x0120:
        r0.f();
    L_0x0123:
        r0 = r2;
        goto L_0x000d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.ImagePreview.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    static ThumbsGrid h(ImagePreview imagePreview) {
        return imagePreview.t;
    }

    static float b(ImagePreview imagePreview, float f) {
        imagePreview.B = f;
        return f;
    }

    static void a(ImagePreview imagePreview, PhotoView photoView, Uri uri) {
        imagePreview.a(photoView, uri);
    }

    static int b(ImagePreview imagePreview, int i) {
        imagePreview.y = i;
        return i;
    }

    static Handler j(ImagePreview imagePreview) {
        return imagePreview.v;
    }

    static View a(ImagePreview imagePreview, View view) {
        imagePreview.z = view;
        return view;
    }

    static View l(ImagePreview imagePreview) {
        return imagePreview.C;
    }

    private void b(int i) {
        int i2 = MediaGalleryFragmentBase.e;
        this.u = i;
        int childCount = this.t.getChildCount();
        int i3 = 0;
        while (i3 < childCount) {
            boolean z;
            View childAt = this.t.getChildAt(i3);
            if (i3 == i) {
                z = true;
            } else {
                z = false;
            }
            childAt.setSelected(z);
            int i4 = i3 + 1;
            if (i2 == 0) {
                i3 = i4;
            } else {
                return;
            }
        }
    }

    static HashMap g(ImagePreview imagePreview) {
        return imagePreview.G;
    }

    protected void onDestroy() {
        int i = MediaGalleryFragmentBase.e;
        Log.i(V[0]);
        if (this.M != null) {
            int i2 = 0;
            while (i2 < this.M.getChildCount()) {
                int i3;
                View childAt = this.M.getChildAt(i2);
                if (childAt instanceof FrameLayout) {
                    int i4 = 0;
                    while (i4 < ((FrameLayout) childAt).getChildCount()) {
                        View childAt2 = ((FrameLayout) childAt).getChildAt(i4);
                        if (childAt2 instanceof PhotoView) {
                            ((PhotoView) childAt2).b();
                        }
                        i3 = i4 + 1;
                        if (i != 0) {
                            break;
                        }
                        i4 = i3;
                    }
                }
                i3 = i2 + 1;
                if (i != 0) {
                    break;
                }
                i2 = i3;
            }
        }
        super.onDestroy();
        this.p.getViewTreeObserver().removeGlobalOnLayoutListener(this.o);
        P.putAll(this.U);
        if (this.F != null) {
            this.F.b();
            this.F = null;
        }
    }

    private void b() {
        int i = MediaGalleryFragmentBase.e;
        this.t.removeAllViews();
        Iterator it = this.J.iterator();
        while (it.hasNext()) {
            this.t.addView(new ThumbImageView(this, this, (Uri) it.next()));
            if (i != 0) {
                break;
            }
        }
        if (this.J.size() < this.Q) {
            this.t.addView(this.S);
        }
    }

    static boolean a(ImagePreview imagePreview, boolean z) {
        imagePreview.N = z;
        return z;
    }

    static HashMap v(ImagePreview imagePreview) {
        return imagePreview.n;
    }

    static boolean d(ImagePreview imagePreview) {
        return imagePreview.R;
    }
}
