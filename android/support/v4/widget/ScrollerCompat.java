package android.support.v4.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.animation.Interpolator;
import android.widget.Scroller;

public class ScrollerCompat {
    ScrollerCompatImpl mImpl;
    Object mScroller;

    interface ScrollerCompatImpl {
        void abortAnimation(Object obj);

        boolean computeScrollOffset(Object obj);

        Object createScroller(Context context, Interpolator interpolator);

        void fling(Object obj, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

        void fling(Object obj, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10);

        float getCurrVelocity(Object obj);

        int getCurrX(Object obj);

        int getCurrY(Object obj);

        int getFinalX(Object obj);

        int getFinalY(Object obj);

        boolean isFinished(Object obj);

        boolean springBack(Object obj, int i, int i2, int i3, int i4, int i5, int i6);

        void startScroll(Object obj, int i, int i2, int i3, int i4);

        void startScroll(Object obj, int i, int i2, int i3, int i4, int i5);
    }

    class ScrollerCompatImplBase implements ScrollerCompatImpl {
        public void fling(Object obj, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
            ((Scroller) obj).fling(i, i2, i3, i4, i5, i6, i7, i8);
        }

        public int getFinalX(Object obj) {
            return ((Scroller) obj).getFinalX();
        }

        public void abortAnimation(Object obj) {
            ((Scroller) obj).abortAnimation();
        }

        public int getFinalY(Object obj) {
            return ((Scroller) obj).getFinalY();
        }

        public void fling(Object obj, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            ((Scroller) obj).fling(i, i2, i3, i4, i5, i6, i7, i8);
        }

        public boolean isFinished(Object obj) {
            return ((Scroller) obj).isFinished();
        }

        public float getCurrVelocity(Object obj) {
            return 0.0f;
        }

        public void startScroll(Object obj, int i, int i2, int i3, int i4, int i5) {
            ((Scroller) obj).startScroll(i, i2, i3, i4, i5);
        }

        public void startScroll(Object obj, int i, int i2, int i3, int i4) {
            ((Scroller) obj).startScroll(i, i2, i3, i4);
        }

        public int getCurrY(Object obj) {
            return ((Scroller) obj).getCurrY();
        }

        public int getCurrX(Object obj) {
            return ((Scroller) obj).getCurrX();
        }

        ScrollerCompatImplBase() {
        }

        public boolean computeScrollOffset(Object obj) {
            return ((Scroller) obj).computeScrollOffset();
        }

        public Object createScroller(Context context, Interpolator interpolator) {
            return interpolator != null ? new Scroller(context, interpolator) : new Scroller(context);
        }

        public boolean springBack(Object obj, int i, int i2, int i3, int i4, int i5, int i6) {
            return false;
        }
    }

    class ScrollerCompatImplGingerbread implements ScrollerCompatImpl {
        public float getCurrVelocity(Object obj) {
            return 0.0f;
        }

        public boolean computeScrollOffset(Object obj) {
            return ScrollerCompatGingerbread.computeScrollOffset(obj);
        }

        public int getCurrY(Object obj) {
            return ScrollerCompatGingerbread.getCurrY(obj);
        }

        public void startScroll(Object obj, int i, int i2, int i3, int i4, int i5) {
            ScrollerCompatGingerbread.startScroll(obj, i, i2, i3, i4, i5);
        }

        ScrollerCompatImplGingerbread() {
        }

        public Object createScroller(Context context, Interpolator interpolator) {
            return ScrollerCompatGingerbread.createScroller(context, interpolator);
        }

        public int getFinalY(Object obj) {
            return ScrollerCompatGingerbread.getFinalY(obj);
        }

        public void abortAnimation(Object obj) {
            ScrollerCompatGingerbread.abortAnimation(obj);
        }

        public boolean springBack(Object obj, int i, int i2, int i3, int i4, int i5, int i6) {
            return ScrollerCompatGingerbread.springBack(obj, i, i2, i3, i4, i5, i6);
        }

        public int getFinalX(Object obj) {
            return ScrollerCompatGingerbread.getFinalX(obj);
        }

        public void fling(Object obj, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            ScrollerCompatGingerbread.fling(obj, i, i2, i3, i4, i5, i6, i7, i8);
        }

        public void startScroll(Object obj, int i, int i2, int i3, int i4) {
            ScrollerCompatGingerbread.startScroll(obj, i, i2, i3, i4);
        }

        public void fling(Object obj, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
            ScrollerCompatGingerbread.fling(obj, i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
        }

        public boolean isFinished(Object obj) {
            return ScrollerCompatGingerbread.isFinished(obj);
        }

        public int getCurrX(Object obj) {
            return ScrollerCompatGingerbread.getCurrX(obj);
        }
    }

    class ScrollerCompatImplIcs extends ScrollerCompatImplGingerbread {
        ScrollerCompatImplIcs() {
        }

        public float getCurrVelocity(Object obj) {
            return ScrollerCompatIcs.getCurrVelocity(obj);
        }
    }

    public void abortAnimation() {
        this.mImpl.abortAnimation(this.mScroller);
    }

    public int getCurrY() {
        return this.mImpl.getCurrY(this.mScroller);
    }

    public void startScroll(int i, int i2, int i3, int i4) {
        this.mImpl.startScroll(this.mScroller, i, i2, i3, i4);
    }

    public void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.mImpl.fling(this.mScroller, i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
    }

    public int getCurrX() {
        return this.mImpl.getCurrX(this.mScroller);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private ScrollerCompat(int r3, android.content.Context r4, android.view.animation.Interpolator r5) {
        /*
        r2 = this;
        r0 = android.support.v4.widget.CursorAdapter.a;
        r2.<init>();
        r1 = 14;
        if (r3 < r1) goto L_0x0012;
    L_0x0009:
        r1 = new android.support.v4.widget.ScrollerCompat$ScrollerCompatImplIcs;
        r1.<init>();
        r2.mImpl = r1;
        if (r0 == 0) goto L_0x0026;
    L_0x0012:
        r1 = 9;
        if (r3 < r1) goto L_0x001f;
    L_0x0016:
        r1 = new android.support.v4.widget.ScrollerCompat$ScrollerCompatImplGingerbread;
        r1.<init>();
        r2.mImpl = r1;
        if (r0 == 0) goto L_0x0026;
    L_0x001f:
        r0 = new android.support.v4.widget.ScrollerCompat$ScrollerCompatImplBase;
        r0.<init>();
        r2.mImpl = r0;
    L_0x0026:
        r0 = r2.mImpl;
        r0 = r0.createScroller(r4, r5);
        r2.mScroller = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.ScrollerCompat.<init>(int, android.content.Context, android.view.animation.Interpolator):void");
    }

    public static ScrollerCompat create(Context context, Interpolator interpolator) {
        return new ScrollerCompat(context, interpolator);
    }

    public int getFinalX() {
        return this.mImpl.getFinalX(this.mScroller);
    }

    ScrollerCompat(Context context, Interpolator interpolator) {
        this(VERSION.SDK_INT, context, interpolator);
    }

    public void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.mImpl.fling(this.mScroller, i, i2, i3, i4, i5, i6, i7, i8);
    }

    public boolean isFinished() {
        return this.mImpl.isFinished(this.mScroller);
    }

    public int getFinalY() {
        return this.mImpl.getFinalY(this.mScroller);
    }

    public static ScrollerCompat create(Context context) {
        return create(context, null);
    }

    public boolean computeScrollOffset() {
        return this.mImpl.computeScrollOffset(this.mScroller);
    }

    public float getCurrVelocity() {
        return this.mImpl.getCurrVelocity(this.mScroller);
    }

    public boolean springBack(int i, int i2, int i3, int i4, int i5, int i6) {
        return this.mImpl.springBack(this.mScroller, i, i2, i3, i4, i5, i6);
    }

    public void startScroll(int i, int i2, int i3, int i4, int i5) {
        this.mImpl.startScroll(this.mScroller, i, i2, i3, i4, i5);
    }
}
