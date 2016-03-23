package com.tonicartos.widget.stickygridheaders;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.whatsapp.WAAppCompatActivity;

public class StickyGridHeadersGridView extends GridView implements OnScrollListener, OnItemClickListener, OnItemSelectedListener, OnItemLongClickListener {
    public static boolean a;
    private boolean A;
    protected int B;
    private final Rect C;
    private long D;
    private OnScrollListener E;
    private View F;
    private float G;
    private int b;
    public f c;
    private boolean d;
    private int e;
    private boolean f;
    private t g;
    public s h;
    private int i;
    private int j;
    private DataSetObserver k;
    private OnItemSelectedListener l;
    private int m;
    private Runnable n;
    private boolean o;
    private OnItemLongClickListener p;
    private boolean q;
    private g r;
    private int s;
    protected a t;
    private OnItemClickListener u;
    private q v;
    protected int w;
    protected boolean x;
    private int y;
    private int z;

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.u.onItemClick(adapterView, view, this.t.a(i).b, j);
    }

    public void setAdapter(Adapter adapter) {
        setAdapter((ListAdapter) adapter);
    }

    private int a() {
        return this.F != null ? this.F.getMeasuredHeight() : 0;
    }

    public boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        return this.p.onItemLongClick(adapterView, view, this.t.a(i).b, j);
    }

    public void onNothingSelected(AdapterView adapterView) {
        this.l.onNothingSelected(adapterView);
    }

    public void setOnItemLongClickListener(OnItemLongClickListener onItemLongClickListener) {
        this.p = onItemLongClickListener;
        super.setOnItemLongClickListener(this);
    }

    public void setColumnWidth(int i) {
        super.setColumnWidth(i);
        this.j = i;
    }

    public void setNumColumns(int i) {
        super.setNumColumns(i);
        this.A = true;
        this.s = i;
        if (i != -1 && this.t != null) {
            this.t.b(i);
        }
    }

    public boolean a(View view, long j) {
        if (this.v == null) {
            return false;
        }
        playSoundEffect(0);
        if (view != null) {
            view.sendAccessibilityEvent(1);
        }
        this.v.a(this, view, j);
        return true;
    }

    public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.l.onItemSelected(adapterView, view, this.t.a(i).b, j);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(int r11) {
        /*
        r10 = this;
        r5 = 0;
        r6 = a;
        r0 = r10.t;
        if (r0 == 0) goto L_0x0013;
    L_0x0007:
        r0 = r10.t;
        r0 = r0.getCount();
        if (r0 == 0) goto L_0x0013;
    L_0x000f:
        r0 = r10.d;
        if (r0 != 0) goto L_0x0014;
    L_0x0013:
        return;
    L_0x0014:
        r0 = r10.getChildAt(r5);
        r0 = (com.tonicartos.widget.stickygridheaders.StickyGridHeadersBaseAdapterWrapper$ReferenceView) r0;
        if (r0 == 0) goto L_0x0013;
    L_0x001c:
        r0 = r10.z;
        r0 = r11 - r0;
        if (r0 >= 0) goto L_0x0023;
    L_0x0022:
        r0 = r11;
    L_0x0023:
        r1 = r10.z;
        r1 = r1 + r11;
        r2 = r10.t;
        r2 = r2.getCount();
        if (r1 < r2) goto L_0x002f;
    L_0x002e:
        r1 = r11;
    L_0x002f:
        r2 = r10.m;
        if (r2 != 0) goto L_0x003b;
    L_0x0033:
        r2 = r10.t;
        r2 = r2.c(r11);
        if (r6 == 0) goto L_0x0148;
    L_0x003b:
        r2 = r10.m;
        if (r2 >= 0) goto L_0x0145;
    L_0x003f:
        r2 = r10.t;
        r2.c(r11);
        r2 = r10.z;
        r2 = r10.getChildAt(r2);
        r2 = r2.getTop();
        if (r2 > 0) goto L_0x0142;
    L_0x0050:
        r2 = r10.t;
        r2 = r2.c(r1);
        if (r6 == 0) goto L_0x005e;
    L_0x0058:
        r2 = r10.t;
        r2 = r2.c(r11);
    L_0x005e:
        if (r6 == 0) goto L_0x007d;
    L_0x0060:
        r2 = r10.getChildAt(r5);
        r2 = r2.getTop();
        if (r2 <= 0) goto L_0x0077;
    L_0x006a:
        r3 = r10.m;
        if (r2 >= r3) goto L_0x0077;
    L_0x006e:
        r1 = r10.t;
        r2 = r1.c(r0);
        if (r6 == 0) goto L_0x013f;
    L_0x0076:
        r1 = r0;
    L_0x0077:
        r0 = r10.t;
        r2 = r0.c(r11);
    L_0x007d:
        r8 = r10.D;
        r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1));
        if (r0 == 0) goto L_0x0092;
    L_0x0083:
        r0 = r10.t;
        r4 = r10.F;
        r0 = r0.b(r1, r4, r10);
        r10.F = r0;
        r10.b();
        r10.D = r2;
    L_0x0092:
        r7 = r10.getChildCount();
        if (r7 == 0) goto L_0x0013;
    L_0x0098:
        r3 = 0;
        r1 = 99999; // 0x1869f float:1.40128E-40 double:4.9406E-319;
        r4 = r5;
    L_0x009d:
        if (r4 >= r7) goto L_0x0138;
    L_0x009f:
        r0 = super.getChildAt(r4);
        r0 = (com.tonicartos.widget.stickygridheaders.StickyGridHeadersBaseAdapterWrapper$ReferenceView) r0;
        r2 = r10.q;
        if (r2 == 0) goto L_0x00b4;
    L_0x00a9:
        r2 = r0.getTop();
        r8 = r10.getPaddingTop();
        r2 = r2 - r8;
        if (r6 == 0) goto L_0x00b8;
    L_0x00b4:
        r2 = r0.getTop();
    L_0x00b8:
        if (r2 >= 0) goto L_0x00bc;
    L_0x00ba:
        if (r6 == 0) goto L_0x0135;
    L_0x00bc:
        r8 = r0.a();
        r8 = r8 instanceof com.tonicartos.widget.stickygridheaders.StickyGridHeadersBaseAdapterWrapper$HeaderFillerView;
        if (r8 == 0) goto L_0x0135;
    L_0x00c4:
        if (r2 >= r1) goto L_0x0135;
    L_0x00c6:
        r1 = r0;
        r0 = r2;
    L_0x00c8:
        r2 = r10.z;
        r2 = r2 + r4;
        if (r6 == 0) goto L_0x013a;
    L_0x00cd:
        r2 = r10.a();
        if (r1 == 0) goto L_0x011e;
    L_0x00d3:
        if (r11 != 0) goto L_0x00e7;
    L_0x00d5:
        r0 = super.getChildAt(r5);
        r0 = r0.getTop();
        if (r0 <= 0) goto L_0x00e7;
    L_0x00df:
        r0 = r10.q;
        if (r0 != 0) goto L_0x00e7;
    L_0x00e3:
        r10.i = r5;
        if (r6 == 0) goto L_0x0013;
    L_0x00e7:
        r0 = r10.q;
        if (r0 == 0) goto L_0x010b;
    L_0x00eb:
        r0 = r1.getTop();
        r3 = r10.getPaddingTop();
        r3 = r3 + r2;
        r0 = java.lang.Math.min(r0, r3);
        r10.i = r0;
        r0 = r10.i;
        r3 = r10.getPaddingTop();
        if (r0 >= r3) goto L_0x012f;
    L_0x0102:
        r0 = r10.getPaddingTop();
        r0 = r0 + r2;
    L_0x0107:
        r10.i = r0;
        if (r6 == 0) goto L_0x0013;
    L_0x010b:
        r0 = r1.getTop();
        r0 = java.lang.Math.min(r0, r2);
        r10.i = r0;
        r0 = r10.i;
        if (r0 >= 0) goto L_0x0132;
    L_0x0119:
        r0 = r2;
    L_0x011a:
        r10.i = r0;
        if (r6 == 0) goto L_0x0013;
    L_0x011e:
        r10.i = r2;
        r0 = r10.q;
        if (r0 == 0) goto L_0x0013;
    L_0x0124:
        r0 = r10.i;
        r1 = r10.getPaddingTop();
        r0 = r0 + r1;
        r10.i = r0;
        goto L_0x0013;
    L_0x012f:
        r0 = r10.i;
        goto L_0x0107;
    L_0x0132:
        r0 = r10.i;
        goto L_0x011a;
    L_0x0135:
        r0 = r1;
        r1 = r3;
        goto L_0x00c8;
    L_0x0138:
        r1 = r3;
        goto L_0x00cd;
    L_0x013a:
        r4 = r2;
        r3 = r1;
        r1 = r0;
        goto L_0x009d;
    L_0x013f:
        r1 = r0;
        goto L_0x007d;
    L_0x0142:
        r1 = r11;
        goto L_0x0058;
    L_0x0145:
        r1 = r11;
        goto L_0x0060;
    L_0x0148:
        r1 = r11;
        goto L_0x007d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tonicartos.widget.stickygridheaders.StickyGridHeadersGridView.a(int):void");
    }

    static int a(StickyGridHeadersGridView stickyGridHeadersGridView) {
        return stickyGridHeadersGridView.getWindowAttachCount();
    }

    public StickyGridHeadersGridView(Context context) {
        this(context, null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
        r9 = this;
        r6 = 0;
        r1 = 1;
        r8 = -1;
        r2 = a;
        r0 = r10.getAction();
        r0 = r0 & 255;
        switch(r0) {
            case 0: goto L_0x0013;
            case 1: goto L_0x0078;
            case 2: goto L_0x0046;
            default: goto L_0x000e;
        };
    L_0x000e:
        r0 = super.onTouchEvent(r10);
    L_0x0012:
        return r0;
    L_0x0013:
        r0 = r9.h;
        if (r0 != 0) goto L_0x001e;
    L_0x0017:
        r0 = new com.tonicartos.widget.stickygridheaders.s;
        r0.<init>(r9);
        r9.h = r0;
    L_0x001e:
        r0 = r9.h;
        r3 = android.view.ViewConfiguration.getTapTimeout();
        r4 = (long) r3;
        r9.postDelayed(r0, r4);
        r0 = r10.getY();
        r0 = (int) r0;
        r3 = (float) r0;
        r9.G = r3;
        r0 = (float) r0;
        r0 = r9.a(r0);
        r9.B = r0;
        r0 = r9.B;
        if (r0 == r8) goto L_0x000e;
    L_0x003b:
        r0 = r9.b;
        r3 = 2;
        if (r0 != r3) goto L_0x0042;
    L_0x0040:
        if (r2 == 0) goto L_0x000e;
    L_0x0042:
        r9.w = r6;
        r0 = r1;
        goto L_0x0012;
    L_0x0046:
        r0 = r9.B;
        if (r0 == r8) goto L_0x000e;
    L_0x004a:
        r0 = r10.getY();
        r3 = r9.G;
        r0 = r0 - r3;
        r0 = java.lang.Math.abs(r0);
        r3 = r9.y;
        r3 = (float) r3;
        r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r0 <= 0) goto L_0x000e;
    L_0x005c:
        r9.w = r8;
        r0 = r9.B;
        r0 = r9.b(r0);
        if (r0 == 0) goto L_0x0069;
    L_0x0066:
        r0.setPressed(r6);
    L_0x0069:
        r0 = r9.getHandler();
        if (r0 == 0) goto L_0x0074;
    L_0x006f:
        r3 = r9.c;
        r0.removeCallbacks(r3);
    L_0x0074:
        r9.B = r8;
        if (r2 == 0) goto L_0x000e;
    L_0x0078:
        r0 = r9.w;
        r3 = -2;
        if (r0 != r3) goto L_0x007f;
    L_0x007d:
        r0 = r1;
        goto L_0x0012;
    L_0x007f:
        r0 = r9.w;
        if (r0 == r8) goto L_0x000e;
    L_0x0083:
        r0 = r9.B;
        if (r0 != r8) goto L_0x0089;
    L_0x0087:
        if (r2 == 0) goto L_0x000e;
    L_0x0089:
        r0 = r9.B;
        r3 = r9.b(r0);
        if (r3 == 0) goto L_0x00fd;
    L_0x0091:
        r0 = r3.hasFocusable();
        if (r0 != 0) goto L_0x00fd;
    L_0x0097:
        r0 = r9.w;
        if (r0 == 0) goto L_0x009e;
    L_0x009b:
        r3.setPressed(r6);
    L_0x009e:
        r0 = r9.r;
        if (r0 != 0) goto L_0x00aa;
    L_0x00a2:
        r0 = new com.tonicartos.widget.stickygridheaders.g;
        r4 = 0;
        r0.<init>(r9, r4);
        r9.r = r0;
    L_0x00aa:
        r4 = r9.r;
        r0 = r9.B;
        r4.c = r0;
        r4.b();
        r0 = r9.w;
        if (r0 != 0) goto L_0x00bb;
    L_0x00b7:
        r0 = r9.w;
        if (r0 == r1) goto L_0x00f6;
    L_0x00bb:
        r5 = r9.getHandler();
        if (r5 == 0) goto L_0x00ca;
    L_0x00c1:
        r0 = r9.w;
        if (r0 != 0) goto L_0x0102;
    L_0x00c5:
        r0 = r9.h;
    L_0x00c7:
        r5.removeCallbacks(r0);
    L_0x00ca:
        r0 = r9.x;
        if (r0 != 0) goto L_0x00f2;
    L_0x00ce:
        r9.w = r1;
        r3.setPressed(r1);
        r9.setPressed(r1);
        r0 = r9.n;
        if (r0 == 0) goto L_0x00df;
    L_0x00da:
        r0 = r9.n;
        r9.removeCallbacks(r0);
    L_0x00df:
        r0 = new com.tonicartos.widget.stickygridheaders.b;
        r0.<init>(r9, r3, r4);
        r9.n = r0;
        r0 = r9.n;
        r3 = android.view.ViewConfiguration.getPressedStateDuration();
        r6 = (long) r3;
        r9.postDelayed(r0, r6);
        if (r2 == 0) goto L_0x00f4;
    L_0x00f2:
        r9.w = r8;
    L_0x00f4:
        if (r2 == 0) goto L_0x00fd;
    L_0x00f6:
        r0 = r9.x;
        if (r0 != 0) goto L_0x00fd;
    L_0x00fa:
        r4.run();
    L_0x00fd:
        r9.w = r8;
        r0 = r1;
        goto L_0x0012;
    L_0x0102:
        r0 = r9.c;
        goto L_0x00c7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tonicartos.widget.stickygridheaders.StickyGridHeadersGridView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private int a(float f) {
        boolean z = a;
        if (this.F != null && f <= ((float) this.F.getBottom())) {
            return -2;
        }
        int i = 0;
        int firstVisiblePosition = getFirstVisiblePosition();
        while (firstVisiblePosition <= getLastVisiblePosition()) {
            if (getItemIdAtPosition(firstVisiblePosition) == -1) {
                View childAt = getChildAt(i);
                int bottom = childAt.getBottom();
                int top = childAt.getTop();
                if (f <= ((float) bottom) && f >= ((float) top)) {
                    return i;
                }
            }
            firstVisiblePosition += this.z;
            i += this.z;
            if (z) {
                break;
            }
        }
        return -1;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        this.d = cVar.a;
        requestLayout();
    }

    private void c() {
        this.i = 0;
        this.F = null;
        this.D = Long.MIN_VALUE;
    }

    public StickyGridHeadersGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842865);
    }

    static int b(StickyGridHeadersGridView stickyGridHeadersGridView) {
        return stickyGridHeadersGridView.getWindowAttachCount();
    }

    static long a(StickyGridHeadersGridView stickyGridHeadersGridView, int i) {
        return stickyGridHeadersGridView.c(i);
    }

    public Parcelable onSaveInstanceState() {
        Parcelable cVar = new c(super.onSaveInstanceState());
        cVar.a = this.d;
        return cVar;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        if (this.E != null) {
            this.E.onScroll(absListView, i, i2, i3);
        }
        if (VERSION.SDK_INT >= 8) {
            a(i);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onMeasure(int r8, int r9) {
        /*
        r7 = this;
        r0 = 1;
        r2 = a;
        r1 = r7.s;
        r3 = -1;
        if (r1 != r3) goto L_0x003d;
    L_0x0008:
        r1 = r7.j;
        if (r1 <= 0) goto L_0x0038;
    L_0x000c:
        r1 = android.view.View.MeasureSpec.getSize(r8);
        r3 = r7.getPaddingLeft();
        r1 = r1 - r3;
        r3 = r7.getPaddingRight();
        r1 = r1 - r3;
        r3 = 0;
        r3 = java.lang.Math.max(r1, r3);
        r1 = r7.j;
        r1 = r3 / r1;
        if (r1 <= 0) goto L_0x0036;
    L_0x0025:
        if (r1 == r0) goto L_0x0053;
    L_0x0027:
        r4 = r7.j;
        r4 = r4 * r1;
        r5 = r1 + -1;
        r6 = r7.e;
        r5 = r5 * r6;
        r4 = r4 + r5;
        if (r4 <= r3) goto L_0x0053;
    L_0x0032:
        r1 = r1 + -1;
        if (r2 == 0) goto L_0x0025;
    L_0x0036:
        if (r2 == 0) goto L_0x0039;
    L_0x0038:
        r0 = 2;
    L_0x0039:
        r7.z = r0;
        if (r2 == 0) goto L_0x0041;
    L_0x003d:
        r0 = r7.s;
        r7.z = r0;
    L_0x0041:
        r0 = r7.t;
        if (r0 == 0) goto L_0x004c;
    L_0x0045:
        r0 = r7.t;
        r1 = r7.z;
        r0.b(r1);
    L_0x004c:
        r7.b();
        super.onMeasure(r8, r9);
        return;
    L_0x0053:
        r0 = r1;
        goto L_0x0036;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tonicartos.widget.stickygridheaders.StickyGridHeadersGridView.onMeasure(int, int):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
        r5 = this;
        r3 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r4 = 0;
        r0 = r5.F;
        if (r0 != 0) goto L_0x0008;
    L_0x0007:
        return;
    L_0x0008:
        r0 = r5.getWidth();
        r1 = r5.getPaddingLeft();
        r0 = r0 - r1;
        r1 = r5.getPaddingRight();
        r0 = r0 - r1;
        r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3);
        r0 = r5.F;
        r0 = r0.getLayoutParams();
        if (r0 == 0) goto L_0x0030;
    L_0x0022:
        r2 = r0.height;
        if (r2 <= 0) goto L_0x0030;
    L_0x0026:
        r0 = r0.height;
        r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3);
        r2 = a;
        if (r2 == 0) goto L_0x0034;
    L_0x0030:
        r0 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r4);
    L_0x0034:
        r2 = r5.F;
        r2.measure(r1, r0);
        r0 = r5.F;
        r1 = r5.getLeft();
        r2 = r5.getPaddingLeft();
        r1 = r1 + r2;
        r2 = r5.getRight();
        r3 = r5.getPaddingRight();
        r2 = r2 - r3;
        r3 = r5.F;
        r3 = r3.getMeasuredHeight();
        r0.layout(r1, r4, r2, r3);
        goto L_0x0007;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tonicartos.widget.stickygridheaders.StickyGridHeadersGridView.b():void");
    }

    private long c(int i) {
        if (i == -2) {
            return this.D;
        }
        return this.t.c(getFirstVisiblePosition() + i);
    }

    public boolean b(View view, long j) {
        boolean a;
        if (this.g != null) {
            a = this.g.a(this, view, j);
        } else {
            a = false;
        }
        if (a) {
            if (view != null) {
                view.sendAccessibilityEvent(2);
            }
            performHapticFeedback(0);
        }
        return a;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setAdapter(android.widget.ListAdapter r4) {
        /*
        r3 = this;
        r2 = a;
        r0 = r3.t;
        if (r0 == 0) goto L_0x0011;
    L_0x0006:
        r0 = r3.k;
        if (r0 == 0) goto L_0x0011;
    L_0x000a:
        r0 = r3.t;
        r1 = r3.k;
        r0.unregisterDataSetObserver(r1);
    L_0x0011:
        r0 = r3.o;
        if (r0 != 0) goto L_0x0018;
    L_0x0015:
        r0 = 1;
        r3.q = r0;
    L_0x0018:
        r0 = r4 instanceof com.tonicartos.widget.stickygridheaders.r;
        if (r0 == 0) goto L_0x0021;
    L_0x001c:
        r0 = r4;
        r0 = (com.tonicartos.widget.stickygridheaders.r) r0;
        if (r2 == 0) goto L_0x0034;
    L_0x0021:
        r0 = r4 instanceof com.tonicartos.widget.stickygridheaders.h;
        if (r0 == 0) goto L_0x002f;
    L_0x0025:
        r1 = new com.tonicartos.widget.stickygridheaders.k;
        r0 = r4;
        r0 = (com.tonicartos.widget.stickygridheaders.h) r0;
        r1.<init>(r0);
        if (r2 == 0) goto L_0x004f;
    L_0x002f:
        r0 = new com.tonicartos.widget.stickygridheaders.l;
        r0.<init>(r4);
    L_0x0034:
        r1 = new com.tonicartos.widget.stickygridheaders.a;
        r2 = r3.getContext();
        r1.<init>(r2, r3, r0);
        r3.t = r1;
        r0 = r3.t;
        r1 = r3.k;
        r0.registerDataSetObserver(r1);
        r3.c();
        r0 = r3.t;
        super.setAdapter(r0);
        return;
    L_0x004f:
        r0 = r1;
        goto L_0x0034;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tonicartos.widget.stickygridheaders.StickyGridHeadersGridView.setAdapter(android.widget.ListAdapter):void");
    }

    static void c(StickyGridHeadersGridView stickyGridHeadersGridView) {
        stickyGridHeadersGridView.c();
    }

    public void setHorizontalSpacing(int i) {
        super.setHorizontalSpacing(i);
        this.e = i;
    }

    public StickyGridHeadersGridView(Context context, AttributeSet attributeSet, int i) {
        boolean z = false;
        boolean z2 = a;
        super(context, attributeSet, i);
        this.d = true;
        this.C = new Rect();
        this.D = -1;
        this.k = new m(this);
        this.z = 1;
        this.b = 0;
        this.f = true;
        super.setOnScrollListener(this);
        setVerticalFadingEdgeEnabled(false);
        if (!this.A) {
            this.s = -1;
        }
        this.y = ViewConfiguration.get(context).getScaledTouchSlop();
        if (WAAppCompatActivity.c != 0) {
            if (!z2) {
                z = true;
            }
            a = z;
        }
    }

    public void setOnItemSelectedListener(OnItemSelectedListener onItemSelectedListener) {
        this.l = onItemSelectedListener;
        super.setOnItemSelectedListener(this);
    }

    public void setClipToPadding(boolean z) {
        super.setClipToPadding(z);
        this.q = z;
        this.o = true;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.u = onItemClickListener;
        super.setOnItemClickListener(this);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void dispatchDraw(android.graphics.Canvas r15) {
        /*
        r14 = this;
        r5 = a;
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x0154 }
        r1 = 8;
        if (r0 >= r1) goto L_0x000f;
    L_0x0008:
        r0 = r14.getFirstVisiblePosition();	 Catch:{ Exception -> 0x0154 }
        r14.a(r0);	 Catch:{ Exception -> 0x0154 }
    L_0x000f:
        r0 = r14.F;	 Catch:{ Exception -> 0x0156 }
        if (r0 == 0) goto L_0x015c;
    L_0x0013:
        r0 = r14.d;	 Catch:{ Exception -> 0x0156 }
        if (r0 == 0) goto L_0x015c;
    L_0x0017:
        r0 = r14.F;	 Catch:{ Exception -> 0x0158 }
        r0 = r0.getVisibility();	 Catch:{ Exception -> 0x0158 }
        if (r0 != 0) goto L_0x015c;
    L_0x001f:
        r0 = 1;
        r3 = r0;
    L_0x0021:
        r6 = r14.a();
        r0 = r14.i;
        r7 = r0 - r6;
        if (r3 == 0) goto L_0x005a;
    L_0x002b:
        r0 = r14.f;	 Catch:{ Exception -> 0x0160 }
        if (r0 == 0) goto L_0x005a;
    L_0x002f:
        r0 = r14.C;	 Catch:{ Exception -> 0x0162 }
        r1 = r14.getPaddingLeft();	 Catch:{ Exception -> 0x0162 }
        r0.left = r1;	 Catch:{ Exception -> 0x0162 }
        r0 = r14.C;	 Catch:{ Exception -> 0x0162 }
        r1 = r14.getWidth();	 Catch:{ Exception -> 0x0162 }
        r2 = r14.getPaddingRight();	 Catch:{ Exception -> 0x0162 }
        r1 = r1 - r2;
        r0.right = r1;	 Catch:{ Exception -> 0x0162 }
        r0 = r14.C;	 Catch:{ Exception -> 0x0162 }
        r1 = r14.i;	 Catch:{ Exception -> 0x0162 }
        r0.top = r1;	 Catch:{ Exception -> 0x0162 }
        r0 = r14.C;	 Catch:{ Exception -> 0x0162 }
        r1 = r14.getHeight();	 Catch:{ Exception -> 0x0162 }
        r0.bottom = r1;	 Catch:{ Exception -> 0x0162 }
        r15.save();	 Catch:{ Exception -> 0x0162 }
        r0 = r14.C;	 Catch:{ Exception -> 0x0162 }
        r15.clipRect(r0);	 Catch:{ Exception -> 0x0162 }
    L_0x005a:
        super.dispatchDraw(r15);
        r8 = new java.util.ArrayList;
        r8.<init>();
        r1 = 0;
        r0 = r14.getFirstVisiblePosition();
    L_0x0067:
        r2 = r14.getLastVisiblePosition();
        if (r0 > r2) goto L_0x0086;
    L_0x006d:
        r10 = r14.getItemIdAtPosition(r0);
        r12 = -1;
        r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r2 != 0) goto L_0x007e;
    L_0x0077:
        r2 = java.lang.Integer.valueOf(r1);	 Catch:{ Exception -> 0x0164 }
        r8.add(r2);	 Catch:{ Exception -> 0x0164 }
    L_0x007e:
        r2 = r14.z;
        r0 = r0 + r2;
        r2 = r14.z;
        r1 = r1 + r2;
        if (r5 == 0) goto L_0x0067;
    L_0x0086:
        r0 = 0;
        r4 = r0;
    L_0x0088:
        r0 = r8.size();
        if (r4 >= r0) goto L_0x0146;
    L_0x008e:
        r0 = r8.get(r4);
        r0 = (java.lang.Integer) r0;
        r0 = r0.intValue();
        r0 = r14.getChildAt(r0);
        r0 = (com.tonicartos.widget.stickygridheaders.StickyGridHeadersBaseAdapterWrapper$ReferenceView) r0;
        r1 = r0.getTag();	 Catch:{ Exception -> 0x0236 }
        r1 = (android.view.View) r1;	 Catch:{ Exception -> 0x0236 }
        r2 = 0;
        r2 = r0.getChildAt(r2);	 Catch:{ Exception -> 0x0166 }
        r2 = (com.tonicartos.widget.stickygridheaders.StickyGridHeadersBaseAdapterWrapper$HeaderFillerView) r2;	 Catch:{ Exception -> 0x0166 }
        r2 = r2.a();	 Catch:{ Exception -> 0x0166 }
        r10 = (long) r2;	 Catch:{ Exception -> 0x0166 }
        r12 = r14.D;	 Catch:{ Exception -> 0x0166 }
        r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r2 != 0) goto L_0x016c;
    L_0x00b6:
        r2 = r0.getTop();	 Catch:{ Exception -> 0x0168 }
        if (r2 >= 0) goto L_0x016c;
    L_0x00bc:
        r2 = r14.d;	 Catch:{ Exception -> 0x016a }
        if (r2 == 0) goto L_0x016c;
    L_0x00c0:
        r2 = 1;
    L_0x00c1:
        r9 = r1.getVisibility();	 Catch:{ Exception -> 0x016f }
        if (r9 != 0) goto L_0x0142;
    L_0x00c7:
        if (r2 == 0) goto L_0x00cb;
    L_0x00c9:
        if (r5 == 0) goto L_0x0142;
    L_0x00cb:
        r2 = r14.getWidth();
        r9 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r10 = r14.getPaddingLeft();
        r9 = r9 - r10;
        r10 = r14.getPaddingRight();
        r9 = r9 - r10;
        r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r9);
        r9 = 0;
        r10 = 0;
        r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r10);
        r1.measure(r2, r9);
        r2 = r14.getLeft();
        r9 = r14.getPaddingLeft();
        r2 = r2 + r9;
        r9 = 0;
        r10 = r14.getRight();
        r11 = r14.getPaddingRight();
        r10 = r10 - r11;
        r11 = r0.getHeight();
        r1.layout(r2, r9, r10, r11);
        r2 = r14.C;
        r9 = r14.getPaddingLeft();
        r2.left = r9;
        r2 = r14.C;
        r9 = r14.getWidth();
        r10 = r14.getPaddingRight();
        r9 = r9 - r10;
        r2.right = r9;
        r2 = r14.C;
        r9 = r0.getBottom();
        r2.bottom = r9;
        r2 = r14.C;
        r9 = r0.getTop();
        r2.top = r9;
        r15.save();
        r2 = r14.C;
        r15.clipRect(r2);
        r2 = r14.getPaddingLeft();
        r2 = (float) r2;
        r0 = r0.getTop();
        r0 = (float) r0;
        r15.translate(r2, r0);
        r1.draw(r15);
        r15.restore();
    L_0x0142:
        r0 = r4 + 1;
        if (r5 == 0) goto L_0x0239;
    L_0x0146:
        if (r3 == 0) goto L_0x0151;
    L_0x0148:
        r0 = r14.f;	 Catch:{ Exception -> 0x0173 }
        if (r0 == 0) goto L_0x0151;
    L_0x014c:
        r15.restore();	 Catch:{ Exception -> 0x0175 }
        if (r5 == 0) goto L_0x0179;
    L_0x0151:
        if (r3 != 0) goto L_0x0179;
    L_0x0153:
        return;
    L_0x0154:
        r0 = move-exception;
        throw r0;
    L_0x0156:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0158 }
    L_0x0158:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x015a }
    L_0x015a:
        r0 = move-exception;
        throw r0;
    L_0x015c:
        r0 = 0;
        r3 = r0;
        goto L_0x0021;
    L_0x0160:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0162 }
    L_0x0162:
        r0 = move-exception;
        throw r0;
    L_0x0164:
        r0 = move-exception;
        throw r0;
    L_0x0166:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0168 }
    L_0x0168:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x016a }
    L_0x016a:
        r0 = move-exception;
        throw r0;
    L_0x016c:
        r2 = 0;
        goto L_0x00c1;
    L_0x016f:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0171 }
    L_0x0171:
        r0 = move-exception;
        throw r0;
    L_0x0173:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0175 }
    L_0x0175:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0177 }
    L_0x0177:
        r0 = move-exception;
        throw r0;
    L_0x0179:
        r0 = r14.F;
        r0 = r0.getWidth();
        r1 = r14.getWidth();
        r2 = r14.getPaddingLeft();
        r1 = r1 - r2;
        r2 = r14.getPaddingRight();
        r1 = r1 - r2;
        if (r0 == r1) goto L_0x01cc;
    L_0x018f:
        r0 = r14.getWidth();
        r1 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = r14.getPaddingLeft();
        r1 = r1 - r2;
        r2 = r14.getPaddingRight();
        r1 = r1 - r2;
        r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1);
        r1 = 0;
        r2 = 0;
        r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r2);
        r2 = r14.F;
        r2.measure(r0, r1);
        r0 = r14.F;
        r1 = r14.getLeft();
        r2 = r14.getPaddingLeft();
        r1 = r1 + r2;
        r2 = 0;
        r3 = r14.getRight();
        r4 = r14.getPaddingRight();
        r3 = r3 - r4;
        r4 = r14.F;
        r4 = r4.getHeight();
        r0.layout(r1, r2, r3, r4);
    L_0x01cc:
        r0 = r14.C;	 Catch:{ Exception -> 0x0232 }
        r1 = r14.getPaddingLeft();	 Catch:{ Exception -> 0x0232 }
        r0.left = r1;	 Catch:{ Exception -> 0x0232 }
        r0 = r14.C;	 Catch:{ Exception -> 0x0232 }
        r1 = r14.getWidth();	 Catch:{ Exception -> 0x0232 }
        r2 = r14.getPaddingRight();	 Catch:{ Exception -> 0x0232 }
        r1 = r1 - r2;
        r0.right = r1;	 Catch:{ Exception -> 0x0232 }
        r0 = r14.C;	 Catch:{ Exception -> 0x0232 }
        r1 = r7 + r6;
        r0.bottom = r1;	 Catch:{ Exception -> 0x0232 }
        r0 = r14.q;	 Catch:{ Exception -> 0x0232 }
        if (r0 == 0) goto L_0x01f5;
    L_0x01eb:
        r0 = r14.C;	 Catch:{ Exception -> 0x0234 }
        r1 = r14.getPaddingTop();	 Catch:{ Exception -> 0x0234 }
        r0.top = r1;	 Catch:{ Exception -> 0x0234 }
        if (r5 == 0) goto L_0x01fa;
    L_0x01f5:
        r0 = r14.C;	 Catch:{ Exception -> 0x0234 }
        r1 = 0;
        r0.top = r1;	 Catch:{ Exception -> 0x0234 }
    L_0x01fa:
        r15.save();
        r0 = r14.C;
        r15.clipRect(r0);
        r0 = r14.getPaddingLeft();
        r0 = (float) r0;
        r1 = (float) r7;
        r15.translate(r0, r1);
        r1 = 0;
        r2 = 0;
        r0 = r15.getWidth();
        r3 = (float) r0;
        r0 = r15.getHeight();
        r4 = (float) r0;
        r0 = 1132396544; // 0x437f0000 float:255.0 double:5.5947823E-315;
        r5 = r14.i;
        r5 = (float) r5;
        r0 = r0 * r5;
        r5 = (float) r6;
        r0 = r0 / r5;
        r5 = (int) r0;
        r6 = 4;
        r0 = r15;
        r0.saveLayerAlpha(r1, r2, r3, r4, r5, r6);
        r0 = r14.F;
        r0.draw(r15);
        r15.restore();
        r15.restore();
        goto L_0x0153;
    L_0x0232:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x0234 }
    L_0x0234:
        r0 = move-exception;
        throw r0;
    L_0x0236:
        r0 = move-exception;
        goto L_0x0153;
    L_0x0239:
        r4 = r0;
        goto L_0x0088;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tonicartos.widget.stickygridheaders.StickyGridHeadersGridView.dispatchDraw(android.graphics.Canvas):void");
    }

    public View b(int i) {
        if (i == -2) {
            try {
                return this.F;
            } catch (Exception e) {
                throw e;
            }
        }
        try {
            return (View) getChildAt(i).getTag();
        } catch (Exception e2) {
            return null;
        }
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        if (this.E != null) {
            this.E.onScrollStateChanged(absListView, i);
        }
        this.b = i;
    }

    public void setOnScrollListener(OnScrollListener onScrollListener) {
        this.E = onScrollListener;
    }

    public void setVerticalSpacing(int i) {
        super.setVerticalSpacing(i);
        this.m = i;
    }
}
