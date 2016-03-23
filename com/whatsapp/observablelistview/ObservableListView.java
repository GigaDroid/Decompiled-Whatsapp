package com.whatsapp.observablelistview;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ListView;
import com.whatsapp.WAAppCompatActivity;

public class ObservableListView extends ListView implements k, j {
    public static int j;
    private ViewGroup a;
    private int b;
    private MotionEvent c;
    private int d;
    private int e;
    private boolean f;
    private int g;
    private int h;
    private boolean i;
    private SparseIntArray k;
    private g l;
    private h m;
    private boolean n;
    private d o;
    private e p;
    private OnScrollListener q;
    private OnScrollListener r;

    public Parcelable onSaveInstanceState() {
        int i = j;
        Parcelable fVar = new f(super.onSaveInstanceState(), null);
        fVar.e = this.e;
        fVar.d = this.d;
        fVar.b = this.g;
        fVar.f = this.b;
        fVar.a = this.h;
        fVar.c = this.k;
        if (WAAppCompatActivity.c != 0) {
            j = i + 1;
        }
        return fVar;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r4) {
        /*
        r3 = this;
        r1 = j;
        r0 = r3.m;
        if (r0 == 0) goto L_0x0019;
    L_0x0006:
        r0 = android.os.Build.VERSION.SDK_INT;
        r2 = 8;
        if (r0 < r2) goto L_0x0012;
    L_0x000c:
        r0 = r4.getActionMasked();
        if (r1 == 0) goto L_0x0016;
    L_0x0012:
        r0 = r4.getAction();
    L_0x0016:
        switch(r0) {
            case 0: goto L_0x001e;
            case 1: goto L_0x002a;
            case 2: goto L_0x0019;
            case 3: goto L_0x002a;
            default: goto L_0x0019;
        };
    L_0x0019:
        r0 = super.onInterceptTouchEvent(r4);
        return r0;
    L_0x001e:
        r0 = 1;
        r3.i = r0;
        r3.n = r0;
        r0 = r3.m;
        r0.a();
        if (r1 == 0) goto L_0x0019;
    L_0x002a:
        r0 = 0;
        r3.i = r0;
        goto L_0x0019;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.observablelistview.ObservableListView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        this.o.a();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
        r8 = this;
        r2 = 0;
        r4 = 0;
        r6 = j;
        r0 = r8.m;
        if (r0 == 0) goto L_0x001b;
    L_0x0008:
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 8;
        if (r0 < r1) goto L_0x0014;
    L_0x000e:
        r0 = r9.getActionMasked();
        if (r6 == 0) goto L_0x0018;
    L_0x0014:
        r0 = r9.getAction();
    L_0x0018:
        switch(r0) {
            case 1: goto L_0x0020;
            case 2: goto L_0x002d;
            case 3: goto L_0x0020;
            default: goto L_0x001b;
        };
    L_0x001b:
        r0 = super.onTouchEvent(r9);
    L_0x001f:
        return r0;
    L_0x0020:
        r8.f = r4;
        r8.i = r4;
        r0 = r8.m;
        r1 = r8.p;
        r0.a(r1);
        if (r6 == 0) goto L_0x001b;
    L_0x002d:
        r0 = r8.c;
        if (r0 != 0) goto L_0x0033;
    L_0x0031:
        r8.c = r9;
    L_0x0033:
        r0 = r9.getY();
        r1 = r8.c;
        r1 = r1.getY();
        r0 = r0 - r1;
        r1 = android.view.MotionEvent.obtainNoHistory(r9);
        r8.c = r1;
        r1 = r8.a();
        r1 = (float) r1;
        r0 = r1 - r0;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 > 0) goto L_0x001b;
    L_0x004f:
        r0 = r8.f;
        if (r0 == 0) goto L_0x0055;
    L_0x0053:
        r0 = r4;
        goto L_0x001f;
    L_0x0055:
        r0 = r8.a;
        if (r0 != 0) goto L_0x0061;
    L_0x0059:
        r0 = r8.getParent();
        r0 = (android.view.ViewGroup) r0;
        if (r6 == 0) goto L_0x00b2;
    L_0x0061:
        r0 = r8.a;
        r1 = r0;
    L_0x0064:
        r5 = r8;
        r0 = r2;
    L_0x0066:
        if (r5 == 0) goto L_0x008a;
    L_0x0068:
        if (r5 == r1) goto L_0x008a;
    L_0x006a:
        r3 = r5.getLeft();
        r7 = r5.getScrollX();
        r3 = r3 - r7;
        r3 = (float) r3;
        r3 = r3 + r2;
        r2 = r5.getTop();
        r7 = r5.getScrollY();
        r2 = r2 - r7;
        r2 = (float) r2;
        r2 = r2 + r0;
        r0 = r5.getParent();
        r0 = (android.view.View) r0;
        if (r6 == 0) goto L_0x00ae;
    L_0x0088:
        r0 = r2;
        r2 = r3;
    L_0x008a:
        r3 = android.view.MotionEvent.obtainNoHistory(r9);
        r3.offsetLocation(r2, r0);
        r0 = r1.onInterceptTouchEvent(r3);
        if (r0 == 0) goto L_0x00a8;
    L_0x0097:
        r0 = 1;
        r8.f = r0;
        r3.setAction(r4);
        r0 = new com.whatsapp.observablelistview.a;
        r0.<init>(r8, r1, r3);
        r8.post(r0);
        r0 = r4;
        goto L_0x001f;
    L_0x00a8:
        r0 = super.onTouchEvent(r9);
        goto L_0x001f;
    L_0x00ae:
        r5 = r0;
        r0 = r2;
        r2 = r3;
        goto L_0x0066;
    L_0x00b2:
        r1 = r0;
        goto L_0x0064;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.observablelistview.ObservableListView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
        r8 = this;
        r7 = 1;
        r1 = 0;
        r3 = j;
        r0 = r8.m;
        if (r0 == 0) goto L_0x0112;
    L_0x0008:
        r0 = r8.getChildCount();
        if (r0 <= 0) goto L_0x0112;
    L_0x000e:
        r4 = r8.getFirstVisiblePosition();
        r0 = r8.getFirstVisiblePosition();
        r2 = r0;
        r0 = r1;
    L_0x0018:
        r5 = r8.getLastVisiblePosition();
        if (r2 > r5) goto L_0x0049;
    L_0x001e:
        r5 = r8.k;
        r5 = r5.indexOfKey(r2);
        if (r5 < 0) goto L_0x0036;
    L_0x0026:
        r5 = r8.getChildAt(r0);
        r5 = r5.getHeight();
        r6 = r8.k;
        r6 = r6.get(r2);
        if (r5 == r6) goto L_0x0043;
    L_0x0036:
        r5 = r8.k;
        r6 = r8.getChildAt(r0);
        r6 = r6.getHeight();
        r5.put(r2, r6);
    L_0x0043:
        r2 = r2 + 1;
        r0 = r0 + 1;
        if (r3 == 0) goto L_0x0018;
    L_0x0049:
        r5 = r8.getChildAt(r1);
        if (r5 == 0) goto L_0x0112;
    L_0x004f:
        r0 = r8.e;
        if (r0 >= r4) goto L_0x008a;
    L_0x0053:
        r0 = r8.e;
        r0 = r4 - r0;
        if (r0 == r7) goto L_0x0115;
    L_0x0059:
        r0 = r4 + -1;
        r2 = r1;
    L_0x005c:
        r6 = r8.e;
        if (r0 <= r6) goto L_0x007a;
    L_0x0060:
        r6 = r8.k;
        r6 = r6.indexOfKey(r0);
        if (r6 <= 0) goto L_0x0071;
    L_0x0068:
        r6 = r8.k;
        r6 = r6.get(r0);
        r2 = r2 + r6;
        if (r3 == 0) goto L_0x0076;
    L_0x0071:
        r6 = r5.getHeight();
        r2 = r2 + r6;
    L_0x0076:
        r0 = r0 + -1;
        if (r3 == 0) goto L_0x005c;
    L_0x007a:
        r0 = r8.g;
        r6 = r8.d;
        r2 = r2 + r6;
        r0 = r0 + r2;
        r8.g = r0;
        r0 = r5.getHeight();
        r8.d = r0;
        if (r3 == 0) goto L_0x00d0;
    L_0x008a:
        r0 = r8.e;
        if (r4 >= r0) goto L_0x00c8;
    L_0x008e:
        r0 = r8.e;
        r0 = r0 - r4;
        if (r0 == r7) goto L_0x0113;
    L_0x0093:
        r0 = r8.e;
        r0 = r0 + -1;
        r2 = r0;
        r0 = r1;
    L_0x0099:
        if (r2 <= r4) goto L_0x00b5;
    L_0x009b:
        r6 = r8.k;
        r6 = r6.indexOfKey(r2);
        if (r6 <= 0) goto L_0x00ac;
    L_0x00a3:
        r6 = r8.k;
        r6 = r6.get(r2);
        r0 = r0 + r6;
        if (r3 == 0) goto L_0x00b1;
    L_0x00ac:
        r6 = r5.getHeight();
        r0 = r0 + r6;
    L_0x00b1:
        r2 = r2 + -1;
        if (r3 == 0) goto L_0x0099;
    L_0x00b5:
        r2 = r8.g;
        r6 = r5.getHeight();
        r0 = r0 + r6;
        r0 = r2 - r0;
        r8.g = r0;
        r0 = r5.getHeight();
        r8.d = r0;
        if (r3 == 0) goto L_0x00d0;
    L_0x00c8:
        if (r4 != 0) goto L_0x00d0;
    L_0x00ca:
        r0 = r5.getHeight();
        r8.d = r0;
    L_0x00d0:
        r0 = r8.d;
        if (r0 >= 0) goto L_0x00d6;
    L_0x00d4:
        r8.d = r1;
    L_0x00d6:
        r0 = r8.g;
        r2 = r5.getTop();
        r0 = r0 - r2;
        r8.h = r0;
        r8.e = r4;
        r0 = r8.m;
        r2 = r8.h;
        r4 = r8.n;
        r5 = r8.i;
        r0.a(r8, r2, r4, r5);
        r0 = r8.n;
        if (r0 == 0) goto L_0x00f2;
    L_0x00f0:
        r8.n = r1;
    L_0x00f2:
        r0 = r8.b;
        r1 = r8.h;
        if (r0 >= r1) goto L_0x00fe;
    L_0x00f8:
        r0 = com.whatsapp.observablelistview.e.UP;
        r8.p = r0;
        if (r3 == 0) goto L_0x010e;
    L_0x00fe:
        r0 = r8.h;
        r1 = r8.b;
        if (r0 >= r1) goto L_0x010a;
    L_0x0104:
        r0 = com.whatsapp.observablelistview.e.DOWN;
        r8.p = r0;
        if (r3 == 0) goto L_0x010e;
    L_0x010a:
        r0 = com.whatsapp.observablelistview.e.STOP;
        r8.p = r0;
    L_0x010e:
        r0 = r8.h;
        r8.b = r0;
    L_0x0112:
        return;
    L_0x0113:
        r0 = r1;
        goto L_0x00b5;
    L_0x0115:
        r2 = r1;
        goto L_0x007a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.observablelistview.ObservableListView.b():void");
    }

    static OnScrollListener a(ObservableListView observableListView) {
        return observableListView.r;
    }

    public void setScrollViewCallbacks(h hVar) {
        this.m = hVar;
    }

    public ObservableListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = -1;
        this.q = new l(this);
        c();
    }

    public int a() {
        return this.h;
    }

    public ObservableListView(Context context) {
        super(context);
        this.d = -1;
        this.q = new l(this);
        c();
    }

    public void setOnScrollListener(OnScrollListener onScrollListener) {
        this.r = onScrollListener;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        f fVar = (f) parcelable;
        this.e = fVar.e;
        this.d = fVar.d;
        this.g = fVar.b;
        this.b = fVar.f;
        this.h = fVar.a;
        this.k = fVar.c;
        super.onRestoreInstanceState(fVar.getSuperState());
    }

    private void c() {
        this.k = new SparseIntArray();
        this.l = new g();
        this.o = new d();
        super.setOnScrollListener(this.q);
    }

    public void a(b bVar) {
        this.o.a(bVar);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.l.a();
        super.onLayout(z, i, i2, i3, i4);
        this.l.b();
    }

    static void b(ObservableListView observableListView) {
        observableListView.b();
    }

    public void a(c cVar) {
        this.l.a(cVar);
    }

    public ObservableListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = -1;
        this.q = new l(this);
        c();
    }

    static h c(ObservableListView observableListView) {
        return observableListView.m;
    }
}
