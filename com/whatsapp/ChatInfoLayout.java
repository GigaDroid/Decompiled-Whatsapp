package com.whatsapp;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.appcompat.R;
import android.text.Spanned;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;

public class ChatInfoLayout extends ViewGroup {
    private View a;
    private ScalingTextView b;
    private float c;
    private TextView d;
    private CharSequence e;
    private float f;
    private View g;
    private ListView h;
    private int i;
    private OnClickListener j;
    private boolean k;
    private View l;
    private int m;
    private int n;
    private int o;
    private int p;
    private View q;
    private int r;

    public void a(View view, View view2, View view3, Adapter adapter) {
        this.h.getViewTreeObserver().addOnGlobalLayoutListener(new us(this, view, adapter, view2, view3));
    }

    static ListView e(ChatInfoLayout chatInfoLayout) {
        return chatInfoLayout.h;
    }

    static void c(ChatInfoLayout chatInfoLayout) {
        chatInfoLayout.b();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (i4 - i2 > i3 - i) {
            this.g.layout(i, i2, i3, this.g.getMeasuredHeight() + i2);
            this.h.layout(this.p + i, i2, i3 - this.p, i4);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        this.g.layout(i, i2, this.g.getMeasuredWidth() + i, i4);
        this.h.layout((this.g.getMeasuredWidth() + i) + this.p, i2, i3 - this.p, i4);
    }

    public void c() {
        this.q = findViewById(2131755437);
        this.a = findViewById(2131755439);
        this.b = (ScalingTextView) findViewById(2131755428);
        this.d = (TextView) findViewById(2131755429);
        this.g = findViewById(2131755330);
        this.h = (ListView) findViewById(16908298);
        this.l = findViewById(2131755430);
        this.f = this.b.getTextSize();
        this.b.setMaxTextSize(this.f);
        this.l.setLayoutParams(new LayoutParams(-1, Math.min(((Activity) getContext()).getWindowManager().getDefaultDisplay().getWidth(), ((Activity) getContext()).getWindowManager().getDefaultDisplay().getHeight())));
        this.h.getViewTreeObserver().addOnGlobalLayoutListener(new a2v(this));
    }

    public ChatInfoLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    static void b(ChatInfoLayout chatInfoLayout) {
        chatInfoLayout.a();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
        r2 = this;
        r0 = r2.h;
        r1 = 0;
        r0 = r0.getChildAt(r1);
        if (r0 == 0) goto L_0x0021;
    L_0x0009:
        r1 = r2.h;
        r1 = r1.getFirstVisiblePosition();
        if (r1 != 0) goto L_0x0019;
    L_0x0011:
        r0 = r0.getTop();
        r1 = com.whatsapp.DialogToastActivity.f;
        if (r1 == 0) goto L_0x001e;
    L_0x0019:
        r0 = r2.getHeight();
        r0 = -r0;
    L_0x001e:
        r2.setScrollPos(r0);
    L_0x0021:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ChatInfoLayout.b():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setScrollPos(int r12) {
        /*
        r11 = this;
        r10 = -10066330; // 0xffffffffff666666 float:-3.0625412E38 double:NaN;
        r9 = 1;
        r8 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r6 = 0;
        r7 = 0;
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = r11.getWidth();
        r2 = r11.getHeight();
        if (r1 < r2) goto L_0x0038;
    L_0x0014:
        r0 = r11.k;
        if (r0 != 0) goto L_0x0037;
    L_0x0018:
        r11.k = r9;
        r0 = r11.l;
        r1 = 8;
        r0.setVisibility(r1);
        r0 = r11.q;
        r0.setBackgroundColor(r7);
        r0 = r11.b;
        r0.setTextScale(r8);
        r0 = r11.b;
        r1 = r11.f;
        r0.setTextSize(r7, r1);
        r0 = r11.a;
        com.whatsapp.aam.a(r0, r7, r7);
    L_0x0037:
        return;
    L_0x0038:
        r1 = r11.k;
        if (r1 == 0) goto L_0x003e;
    L_0x003c:
        r11.r = r7;
    L_0x003e:
        r11.k = r7;
        r1 = r11.l;
        r1 = r1.getVisibility();
        if (r1 == 0) goto L_0x004d;
    L_0x0048:
        r1 = r11.l;
        r1.setVisibility(r7);
    L_0x004d:
        r1 = r11.n;
        r2 = r11.getWidth();
        r2 = r2 + r12;
        r1 = java.lang.Math.max(r1, r2);
        r2 = r11.getWidth();
        r2 = (float) r2;
        r3 = 1058013184; // 0x3f100000 float:0.5625 double:5.22727967E-315;
        r2 = r2 * r3;
        r2 = (int) r2;
        r3 = r2 - r1;
        r3 = (float) r3;
        r4 = r11.n;
        r2 = r2 - r4;
        r2 = (float) r2;
        r2 = r3 / r2;
        r2 = java.lang.Math.max(r6, r2);
        r3 = r11.b;
        r3 = r3.getEllipsize();
        r4 = r11.n;
        r4 = r4 * 2;
        if (r1 >= r4) goto L_0x008d;
    L_0x007a:
        r4 = r11.b;
        r4.setSingleLine(r9);
        r4 = r11.b;
        r5 = android.text.TextUtils.TruncateAt.END;
        r4.setEllipsize(r5);
        r4 = r11.d;
        r4.setSingleLine(r9);
        if (r0 == 0) goto L_0x009d;
    L_0x008d:
        r4 = r11.b;
        r4.setSingleLine(r7);
        r4 = r11.b;
        r5 = 0;
        r4.setEllipsize(r5);
        r4 = r11.d;
        r4.setSingleLine(r7);
    L_0x009d:
        r4 = r11.b;
        r4 = r4.getEllipsize();
        if (r3 == r4) goto L_0x00ac;
    L_0x00a5:
        r3 = r11.b;
        r4 = r11.e;
        r3.setText(r4);
    L_0x00ac:
        r3 = r11.r;
        if (r3 == r1) goto L_0x0037;
    L_0x00b0:
        r11.r = r1;
        r1 = r11.m;
        r1 = r1 >> 24;
        r3 = r11.r;
        r4 = r11.n;
        if (r3 != r4) goto L_0x00cb;
    L_0x00bc:
        r3 = -1;
        if (r1 == r3) goto L_0x00d8;
    L_0x00bf:
        r3 = r11.b;
        r3.setShadowLayer(r6, r6, r6, r7);
        r3 = r11.d;
        r3.setShadowLayer(r6, r6, r6, r7);
        if (r0 == 0) goto L_0x00d8;
    L_0x00cb:
        r0 = -1;
        if (r1 != r0) goto L_0x00d8;
    L_0x00ce:
        r0 = r11.b;
        r0.setShadowLayer(r8, r8, r8, r10);
        r0 = r11.d;
        r0.setShadowLayer(r8, r8, r8, r10);
    L_0x00d8:
        r0 = 1132396544; // 0x437f0000 float:255.0 double:5.5947823E-315;
        r0 = r0 * r2;
        r0 = (int) r0;
        r1 = r11.i;
        r1 = (float) r1;
        r1 = r1 * r2;
        r1 = r1 * r2;
        r1 = (int) r1;
        r3 = r11.o;
        r3 = (float) r3;
        r3 = r3 * r2;
        r3 = r3 * r2;
        r3 = (int) r3;
        r4 = r11.f;
        r5 = r11.f;
        r6 = r11.c;
        r5 = r5 - r6;
        r2 = r2 * r5;
        r2 = r4 - r2;
        r4 = r11.b;
        r4.setTextSize(r7, r2);
        r4 = r11.b;
        r5 = r11.f;
        r2 = r2 / r5;
        r4.setTextScale(r2);
        r0 = r0 << 24;
        r2 = r11.m;
        r4 = 16777215; // 0xffffff float:2.3509886E-38 double:8.2890456E-317;
        r2 = r2 & r4;
        r0 = r0 | r2;
        r11.m = r0;
        r0 = r11.q;
        r2 = r11.m;
        r0.setBackgroundColor(r2);
        r0 = r11.a;
        com.whatsapp.aam.a(r0, r1, r3);
        r11.requestLayout();
        goto L_0x0037;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ChatInfoLayout.setScrollPos(int):void");
    }

    public void setCollapsedPadding(int i, int i2) {
        this.i = i;
        this.o = i2;
    }

    private void a(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            this.n = TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        this.c = (float) context.getResources().getDimensionPixelSize(2131427429);
        this.p = 0;
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        if (getMeasuredHeight() >= measuredWidth) {
            if (this.l.getVisibility() != 0) {
                this.q.setOnClickListener(null);
                this.q.setClickable(false);
                this.l.setVisibility(0);
                this.h.getViewTreeObserver().addOnGlobalLayoutListener(new qn(this));
            }
            this.g.measure(MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), MeasureSpec.makeMeasureSpec(Math.max(this.n, this.r), 1073741824));
            this.h.measure(MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824) - (this.p * 2), i2);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        if (this.l.getVisibility() != 8) {
            this.q.setOnClickListener(this.j);
            this.q.setClickable(true);
            this.l.setVisibility(8);
            this.h.post(new le(this));
        }
        this.g.measure(MeasureSpec.makeMeasureSpec(measuredWidth - ((int) (((float) measuredWidth) * 0.618f)), 1073741824), i2);
        this.h.measure(MeasureSpec.makeMeasureSpec(((int) (((float) measuredWidth) * 0.618f)) - (this.p * 2), 1073741824), i2);
    }

    public void setColor(int i) {
        this.m = (this.m & -16777216) | (16777215 & i);
        this.q.setBackgroundColor(this.m);
    }

    public void setTitleText(String str) {
        int i = 0;
        boolean z = DialogToastActivity.f;
        this.e = a28.a(str, getContext(), this.b.getPaint(), 0.82f);
        if (this.e instanceof Spanned) {
            ao7[] com_whatsapp_ao7Arr = (ao7[]) ((Spanned) this.e).getSpans(0, this.e.length(), ao7.class);
            if (com_whatsapp_ao7Arr != null && com_whatsapp_ao7Arr.length > 0) {
                int length = com_whatsapp_ao7Arr.length;
                while (i < length) {
                    com_whatsapp_ao7Arr[i].a(true);
                    i++;
                    if (z) {
                        break;
                    }
                }
            }
        }
        this.b.setText(this.e);
    }

    static boolean a(ChatInfoLayout chatInfoLayout) {
        return chatInfoLayout.k;
    }

    public ChatInfoLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    public ChatInfoLayout(Context context) {
        super(context);
        a(context);
    }

    private void a() {
        if (getWidth() > getHeight()) {
            ((AppCompatActivity) getContext()).supportStartPostponedEnterTransition();
            this.h.setOnScrollListener(new ax6(this));
            if (!DialogToastActivity.f) {
                return;
            }
        }
        int measuredWidth = ((int) (((float) getMeasuredWidth()) * 0.5625f)) - getMeasuredWidth();
        this.h.setSelectionFromTop(0, measuredWidth);
        setScrollPos(measuredWidth);
        this.h.post(new fv(this, measuredWidth));
    }

    static View d(ChatInfoLayout chatInfoLayout) {
        return chatInfoLayout.g;
    }

    public void setOnPhotoClickListener(OnClickListener onClickListener) {
        this.j = onClickListener;
        this.l.setOnClickListener(onClickListener);
    }
}
