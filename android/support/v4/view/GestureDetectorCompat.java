package android.support.v4.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import org.v;
import org.whispersystems.at;

public class GestureDetectorCompat {
    private final GestureDetectorCompatImpl mImpl;

    interface GestureDetectorCompatImpl {
        boolean onTouchEvent(MotionEvent motionEvent);
    }

    class GestureDetectorCompatImplBase implements GestureDetectorCompatImpl {
        private static final int DOUBLE_TAP_TIMEOUT;
        private static final int LONGPRESS_TIMEOUT;
        private static final int TAP_TIMEOUT;
        private static final String[] z;
        private boolean mAlwaysInBiggerTapRegion;
        private boolean mAlwaysInTapRegion;
        private MotionEvent mCurrentDownEvent;
        private boolean mDeferConfirmSingleTap;
        private OnDoubleTapListener mDoubleTapListener;
        private int mDoubleTapSlopSquare;
        private float mDownFocusX;
        private float mDownFocusY;
        private final Handler mHandler;
        private boolean mInLongPress;
        private boolean mIsDoubleTapping;
        private boolean mIsLongpressEnabled;
        private float mLastFocusX;
        private float mLastFocusY;
        private final OnGestureListener mListener;
        private int mMaximumFlingVelocity;
        private int mMinimumFlingVelocity;
        private MotionEvent mPreviousUpEvent;
        private boolean mStillDown;
        private int mTouchSlopSquare;
        private VelocityTracker mVelocityTracker;

        class GestureHandler extends Handler {
            private static final String z;
            final GestureDetectorCompatImplBase this$0;

            static {
                char[] toCharArray = "\u00127_{v07\u0014x|4*Ur|g".toCharArray();
                int length = toCharArray.length;
                char[] cArr = toCharArray;
                for (int i = 0; length > i; i++) {
                    int i2;
                    char c = cArr[i];
                    switch (i % 5) {
                        case v.m /*0*/:
                            i2 = 71;
                            break;
                        case at.g /*1*/:
                            i2 = 89;
                            break;
                        case at.i /*2*/:
                            i2 = 52;
                            break;
                        case at.o /*3*/:
                            i2 = 21;
                            break;
                        default:
                            i2 = 25;
                            break;
                    }
                    cArr[i] = (char) (i2 ^ c);
                }
                z = new String(cArr).intern();
            }

            GestureHandler(GestureDetectorCompatImplBase gestureDetectorCompatImplBase) {
                this.this$0 = gestureDetectorCompatImplBase;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void handleMessage(android.os.Message r4) {
                /*
                r3 = this;
                r0 = android.support.v4.view.ViewCompat.a;
                r1 = r4.what;	 Catch:{ RuntimeException -> 0x0064 }
                switch(r1) {
                    case 1: goto L_0x0022;
                    case 2: goto L_0x0033;
                    case 3: goto L_0x003a;
                    default: goto L_0x0007;
                };
            L_0x0007:
                r0 = new java.lang.RuntimeException;	 Catch:{ RuntimeException -> 0x0020 }
                r1 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x0020 }
                r1.<init>();	 Catch:{ RuntimeException -> 0x0020 }
                r2 = z;	 Catch:{ RuntimeException -> 0x0020 }
                r1 = r1.append(r2);	 Catch:{ RuntimeException -> 0x0020 }
                r1 = r1.append(r4);	 Catch:{ RuntimeException -> 0x0020 }
                r1 = r1.toString();	 Catch:{ RuntimeException -> 0x0020 }
                r0.<init>(r1);	 Catch:{ RuntimeException -> 0x0020 }
                throw r0;	 Catch:{ RuntimeException -> 0x0020 }
            L_0x0020:
                r0 = move-exception;
                throw r0;
            L_0x0022:
                r1 = r3.this$0;	 Catch:{ RuntimeException -> 0x0066 }
                r1 = android.support.v4.view.GestureDetectorCompat.GestureDetectorCompatImplBase.access$100(r1);	 Catch:{ RuntimeException -> 0x0066 }
                r2 = r3.this$0;	 Catch:{ RuntimeException -> 0x0066 }
                r2 = android.support.v4.view.GestureDetectorCompat.GestureDetectorCompatImplBase.access$000(r2);	 Catch:{ RuntimeException -> 0x0066 }
                r1.onShowPress(r2);	 Catch:{ RuntimeException -> 0x0066 }
                if (r0 == 0) goto L_0x0063;
            L_0x0033:
                r1 = r3.this$0;	 Catch:{ RuntimeException -> 0x0068 }
                android.support.v4.view.GestureDetectorCompat.GestureDetectorCompatImplBase.access$200(r1);	 Catch:{ RuntimeException -> 0x0068 }
                if (r0 == 0) goto L_0x0063;
            L_0x003a:
                r1 = r3.this$0;	 Catch:{ RuntimeException -> 0x006a }
                r1 = android.support.v4.view.GestureDetectorCompat.GestureDetectorCompatImplBase.access$300(r1);	 Catch:{ RuntimeException -> 0x006a }
                if (r1 == 0) goto L_0x0063;
            L_0x0042:
                r1 = r3.this$0;	 Catch:{ RuntimeException -> 0x006c }
                r1 = android.support.v4.view.GestureDetectorCompat.GestureDetectorCompatImplBase.access$400(r1);	 Catch:{ RuntimeException -> 0x006c }
                if (r1 != 0) goto L_0x005b;
            L_0x004a:
                r1 = r3.this$0;	 Catch:{ RuntimeException -> 0x006e }
                r1 = android.support.v4.view.GestureDetectorCompat.GestureDetectorCompatImplBase.access$300(r1);	 Catch:{ RuntimeException -> 0x006e }
                r2 = r3.this$0;	 Catch:{ RuntimeException -> 0x006e }
                r2 = android.support.v4.view.GestureDetectorCompat.GestureDetectorCompatImplBase.access$000(r2);	 Catch:{ RuntimeException -> 0x006e }
                r1.onSingleTapConfirmed(r2);	 Catch:{ RuntimeException -> 0x006e }
                if (r0 == 0) goto L_0x0063;
            L_0x005b:
                r1 = r3.this$0;	 Catch:{ RuntimeException -> 0x0020 }
                r2 = 1;
                android.support.v4.view.GestureDetectorCompat.GestureDetectorCompatImplBase.access$502(r1, r2);	 Catch:{ RuntimeException -> 0x0020 }
                if (r0 != 0) goto L_0x0007;
            L_0x0063:
                return;
            L_0x0064:
                r0 = move-exception;
                throw r0;	 Catch:{ RuntimeException -> 0x0066 }
            L_0x0066:
                r0 = move-exception;
                throw r0;	 Catch:{ RuntimeException -> 0x0068 }
            L_0x0068:
                r0 = move-exception;
                throw r0;	 Catch:{ RuntimeException -> 0x006a }
            L_0x006a:
                r0 = move-exception;
                throw r0;	 Catch:{ RuntimeException -> 0x006c }
            L_0x006c:
                r0 = move-exception;
                throw r0;	 Catch:{ RuntimeException -> 0x006e }
            L_0x006e:
                r0 = move-exception;
                throw r0;	 Catch:{ RuntimeException -> 0x0020 }
                */
                throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.GestureDetectorCompat.GestureDetectorCompatImplBase.GestureHandler.handleMessage(android.os.Message):void");
            }

            GestureHandler(GestureDetectorCompatImplBase gestureDetectorCompatImplBase, Handler handler) {
                this.this$0 = gestureDetectorCompatImplBase;
                super(handler.getLooper());
            }
        }

        private void dispatchLongPress() {
            this.mHandler.removeMessages(3);
            this.mDeferConfirmSingleTap = false;
            this.mInLongPress = true;
            this.mListener.onLongPress(this.mCurrentDownEvent);
        }

        static MotionEvent access$000(GestureDetectorCompatImplBase gestureDetectorCompatImplBase) {
            return gestureDetectorCompatImplBase.mCurrentDownEvent;
        }

        private boolean isConsideredDoubleTap(MotionEvent motionEvent, MotionEvent motionEvent2, MotionEvent motionEvent3) {
            try {
                if (!this.mAlwaysInBiggerTapRegion) {
                    return false;
                }
                try {
                    if (motionEvent3.getEventTime() - motionEvent2.getEventTime() > ((long) DOUBLE_TAP_TIMEOUT)) {
                        return false;
                    }
                    int x = ((int) motionEvent.getX()) - ((int) motionEvent3.getX());
                    int y = ((int) motionEvent.getY()) - ((int) motionEvent3.getY());
                    try {
                        if ((x * x) + (y * y) < this.mDoubleTapSlopSquare) {
                            return true;
                        }
                        return false;
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            } catch (IllegalArgumentException e22) {
                throw e22;
            }
        }

        public void setOnDoubleTapListener(OnDoubleTapListener onDoubleTapListener) {
            this.mDoubleTapListener = onDoubleTapListener;
        }

        static OnGestureListener access$100(GestureDetectorCompatImplBase gestureDetectorCompatImplBase) {
            return gestureDetectorCompatImplBase.mListener;
        }

        static void access$200(GestureDetectorCompatImplBase gestureDetectorCompatImplBase) {
            gestureDetectorCompatImplBase.dispatchLongPress();
        }

        private void init(Context context) {
            if (context == null) {
                try {
                    throw new IllegalArgumentException(z[0]);
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            try {
                if (this.mListener == null) {
                    throw new IllegalArgumentException(z[1]);
                }
                this.mIsLongpressEnabled = true;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
                this.mMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                this.mMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                this.mTouchSlopSquare = scaledTouchSlop * scaledTouchSlop;
                this.mDoubleTapSlopSquare = scaledDoubleTapSlop * scaledDoubleTapSlop;
            } catch (IllegalArgumentException e2) {
                throw e2;
            }
        }

        static boolean access$400(GestureDetectorCompatImplBase gestureDetectorCompatImplBase) {
            return gestureDetectorCompatImplBase.mStillDown;
        }

        static {
            String[] strArr = new String[2];
            String str = "KP[eipK\u0015|y{K\u0015\u007fc|\u001fWt,fJY}";
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
                            i3 = 8;
                            break;
                        case at.g /*1*/:
                            i3 = 63;
                            break;
                        case at.i /*2*/:
                            i3 = 53;
                            break;
                        case at.o /*3*/:
                            i3 = 17;
                            break;
                        default:
                            i3 = 12;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        z = strArr3;
                        LONGPRESS_TIMEOUT = ViewConfiguration.getLongPressTimeout();
                        TAP_TIMEOUT = ViewConfiguration.getTapTimeout();
                        DOUBLE_TAP_TIMEOUT = ViewConfiguration.getDoubleTapTimeout();
                        return;
                    default:
                        strArr2[i] = str;
                        i = 1;
                        strArr2 = strArr3;
                        str = "GQrt\u007f|JGt@aLAtbmM\u0015|y{K\u0015\u007fc|\u001fWt,fJY}";
                        obj = null;
                }
            }
        }

        static boolean access$502(GestureDetectorCompatImplBase gestureDetectorCompatImplBase, boolean z) {
            gestureDetectorCompatImplBase.mDeferConfirmSingleTap = z;
            return z;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r14) {
            /*
            r13 = this;
            r6 = android.support.v4.view.ViewCompat.a;
            r7 = r14.getAction();
            r0 = r13.mVelocityTracker;	 Catch:{ IllegalArgumentException -> 0x0046 }
            if (r0 != 0) goto L_0x0010;
        L_0x000a:
            r0 = android.view.VelocityTracker.obtain();	 Catch:{ IllegalArgumentException -> 0x0046 }
            r13.mVelocityTracker = r0;	 Catch:{ IllegalArgumentException -> 0x0046 }
        L_0x0010:
            r0 = r13.mVelocityTracker;	 Catch:{ IllegalArgumentException -> 0x0048 }
            r0.addMovement(r14);	 Catch:{ IllegalArgumentException -> 0x0048 }
            r0 = r7 & 255;
            r1 = 6;
            if (r0 != r1) goto L_0x004a;
        L_0x001a:
            r0 = 1;
        L_0x001b:
            if (r0 == 0) goto L_0x004e;
        L_0x001d:
            r1 = android.support.v4.view.MotionEventCompat.getActionIndex(r14);	 Catch:{ IllegalArgumentException -> 0x004c }
        L_0x0021:
            r5 = 0;
            r4 = 0;
            r2 = android.support.v4.view.MotionEventCompat.getPointerCount(r14);
            r3 = 0;
            r12 = r3;
            r3 = r4;
            r4 = r5;
            r5 = r12;
        L_0x002c:
            if (r5 >= r2) goto L_0x0034;
        L_0x002e:
            if (r1 != r5) goto L_0x0050;
        L_0x0030:
            r5 = r5 + 1;
            if (r6 == 0) goto L_0x002c;
        L_0x0034:
            r1 = r3;
            r3 = r4;
            if (r0 == 0) goto L_0x005b;
        L_0x0038:
            r0 = r2 + -1;
        L_0x003a:
            r4 = (float) r0;
            r3 = r3 / r4;
            r0 = (float) r0;
            r4 = r1 / r0;
            r0 = 0;
            r1 = r7 & 255;
            switch(r1) {
                case 0: goto L_0x009b;
                case 1: goto L_0x01b7;
                case 2: goto L_0x013d;
                case 3: goto L_0x0253;
                case 4: goto L_0x0045;
                case 5: goto L_0x005d;
                case 6: goto L_0x006a;
                default: goto L_0x0045;
            };
        L_0x0045:
            return r0;
        L_0x0046:
            r0 = move-exception;
            throw r0;
        L_0x0048:
            r0 = move-exception;
            throw r0;
        L_0x004a:
            r0 = 0;
            goto L_0x001b;
        L_0x004c:
            r0 = move-exception;
            throw r0;
        L_0x004e:
            r1 = -1;
            goto L_0x0021;
        L_0x0050:
            r8 = android.support.v4.view.MotionEventCompat.getX(r14, r5);
            r4 = r4 + r8;
            r8 = android.support.v4.view.MotionEventCompat.getY(r14, r5);
            r3 = r3 + r8;
            goto L_0x0030;
        L_0x005b:
            r0 = r2;
            goto L_0x003a;
        L_0x005d:
            r13.mLastFocusX = r3;	 Catch:{ IllegalArgumentException -> 0x025a }
            r13.mDownFocusX = r3;	 Catch:{ IllegalArgumentException -> 0x025a }
            r13.mLastFocusY = r4;	 Catch:{ IllegalArgumentException -> 0x025a }
            r13.mDownFocusY = r4;	 Catch:{ IllegalArgumentException -> 0x025a }
            r13.cancelTaps();	 Catch:{ IllegalArgumentException -> 0x025a }
            if (r6 == 0) goto L_0x0045;
        L_0x006a:
            r13.mLastFocusX = r3;
            r13.mDownFocusX = r3;
            r13.mLastFocusY = r4;
            r13.mDownFocusY = r4;
            r1 = r13.mVelocityTracker;
            r5 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
            r7 = r13.mMaximumFlingVelocity;
            r7 = (float) r7;
            r1.computeCurrentVelocity(r5, r7);
            r5 = android.support.v4.view.MotionEventCompat.getActionIndex(r14);
            r1 = android.support.v4.view.MotionEventCompat.getPointerId(r14, r5);
            r7 = r13.mVelocityTracker;
            r7 = android.support.v4.view.VelocityTrackerCompat.getXVelocity(r7, r1);
            r8 = r13.mVelocityTracker;
            r8 = android.support.v4.view.VelocityTrackerCompat.getYVelocity(r8, r1);
            r1 = 0;
        L_0x0091:
            if (r1 >= r2) goto L_0x0099;
        L_0x0093:
            if (r1 != r5) goto L_0x025c;
        L_0x0095:
            r1 = r1 + 1;
            if (r6 == 0) goto L_0x0091;
        L_0x0099:
            if (r6 == 0) goto L_0x0045;
        L_0x009b:
            r1 = r13.mDoubleTapListener;	 Catch:{ IllegalArgumentException -> 0x027f }
            if (r1 == 0) goto L_0x00e0;
        L_0x009f:
            r1 = r13.mHandler;
            r2 = 3;
            r1 = r1.hasMessages(r2);
            if (r1 == 0) goto L_0x00ae;
        L_0x00a8:
            r2 = r13.mHandler;	 Catch:{ IllegalArgumentException -> 0x0281 }
            r5 = 3;
            r2.removeMessages(r5);	 Catch:{ IllegalArgumentException -> 0x0281 }
        L_0x00ae:
            r2 = r13.mCurrentDownEvent;	 Catch:{ IllegalArgumentException -> 0x0283 }
            if (r2 == 0) goto L_0x00d7;
        L_0x00b2:
            r2 = r13.mPreviousUpEvent;	 Catch:{ IllegalArgumentException -> 0x0285 }
            if (r2 == 0) goto L_0x00d7;
        L_0x00b6:
            if (r1 == 0) goto L_0x00d7;
        L_0x00b8:
            r1 = r13.mCurrentDownEvent;	 Catch:{ IllegalArgumentException -> 0x0287 }
            r2 = r13.mPreviousUpEvent;	 Catch:{ IllegalArgumentException -> 0x0287 }
            r1 = r13.isConsideredDoubleTap(r1, r2, r14);	 Catch:{ IllegalArgumentException -> 0x0287 }
            if (r1 == 0) goto L_0x00d7;
        L_0x00c2:
            r1 = 1;
            r13.mIsDoubleTapping = r1;
            r1 = r13.mDoubleTapListener;
            r2 = r13.mCurrentDownEvent;
            r1 = r1.onDoubleTap(r2);
            r0 = r0 | r1;
            r1 = r13.mDoubleTapListener;
            r1 = r1.onDoubleTapEvent(r14);
            r0 = r0 | r1;
            if (r6 == 0) goto L_0x00e0;
        L_0x00d7:
            r1 = r13.mHandler;	 Catch:{ IllegalArgumentException -> 0x0289 }
            r2 = 3;
            r5 = DOUBLE_TAP_TIMEOUT;	 Catch:{ IllegalArgumentException -> 0x0289 }
            r8 = (long) r5;	 Catch:{ IllegalArgumentException -> 0x0289 }
            r1.sendEmptyMessageDelayed(r2, r8);	 Catch:{ IllegalArgumentException -> 0x0289 }
        L_0x00e0:
            r13.mLastFocusX = r3;	 Catch:{ IllegalArgumentException -> 0x028b }
            r13.mDownFocusX = r3;	 Catch:{ IllegalArgumentException -> 0x028b }
            r13.mLastFocusY = r4;	 Catch:{ IllegalArgumentException -> 0x028b }
            r13.mDownFocusY = r4;	 Catch:{ IllegalArgumentException -> 0x028b }
            r1 = r13.mCurrentDownEvent;	 Catch:{ IllegalArgumentException -> 0x028b }
            if (r1 == 0) goto L_0x00f1;
        L_0x00ec:
            r1 = r13.mCurrentDownEvent;	 Catch:{ IllegalArgumentException -> 0x028b }
            r1.recycle();	 Catch:{ IllegalArgumentException -> 0x028b }
        L_0x00f1:
            r1 = android.view.MotionEvent.obtain(r14);	 Catch:{ IllegalArgumentException -> 0x028d }
            r13.mCurrentDownEvent = r1;	 Catch:{ IllegalArgumentException -> 0x028d }
            r1 = 1;
            r13.mAlwaysInTapRegion = r1;	 Catch:{ IllegalArgumentException -> 0x028d }
            r1 = 1;
            r13.mAlwaysInBiggerTapRegion = r1;	 Catch:{ IllegalArgumentException -> 0x028d }
            r1 = 1;
            r13.mStillDown = r1;	 Catch:{ IllegalArgumentException -> 0x028d }
            r1 = 0;
            r13.mInLongPress = r1;	 Catch:{ IllegalArgumentException -> 0x028d }
            r1 = 0;
            r13.mDeferConfirmSingleTap = r1;	 Catch:{ IllegalArgumentException -> 0x028d }
            r1 = r13.mIsLongpressEnabled;	 Catch:{ IllegalArgumentException -> 0x028d }
            if (r1 == 0) goto L_0x0124;
        L_0x010a:
            r1 = r13.mHandler;	 Catch:{ IllegalArgumentException -> 0x028d }
            r2 = 2;
            r1.removeMessages(r2);	 Catch:{ IllegalArgumentException -> 0x028d }
            r1 = r13.mHandler;	 Catch:{ IllegalArgumentException -> 0x028d }
            r2 = 2;
            r5 = r13.mCurrentDownEvent;	 Catch:{ IllegalArgumentException -> 0x028d }
            r8 = r5.getDownTime();	 Catch:{ IllegalArgumentException -> 0x028d }
            r5 = TAP_TIMEOUT;	 Catch:{ IllegalArgumentException -> 0x028d }
            r10 = (long) r5;	 Catch:{ IllegalArgumentException -> 0x028d }
            r8 = r8 + r10;
            r5 = LONGPRESS_TIMEOUT;	 Catch:{ IllegalArgumentException -> 0x028d }
            r10 = (long) r5;	 Catch:{ IllegalArgumentException -> 0x028d }
            r8 = r8 + r10;
            r1.sendEmptyMessageAtTime(r2, r8);	 Catch:{ IllegalArgumentException -> 0x028d }
        L_0x0124:
            r1 = r13.mHandler;
            r2 = 1;
            r5 = r13.mCurrentDownEvent;
            r8 = r5.getDownTime();
            r5 = TAP_TIMEOUT;
            r10 = (long) r5;
            r8 = r8 + r10;
            r1.sendEmptyMessageAtTime(r2, r8);
            r1 = r13.mListener;
            r1 = r1.onDown(r14);
            r0 = r0 | r1;
            if (r6 == 0) goto L_0x0045;
        L_0x013d:
            r1 = r13.mInLongPress;	 Catch:{ IllegalArgumentException -> 0x028f }
            if (r1 == 0) goto L_0x0143;
        L_0x0141:
            if (r6 == 0) goto L_0x0045;
        L_0x0143:
            r1 = r13.mLastFocusX;
            r1 = r1 - r3;
            r2 = r13.mLastFocusY;
            r2 = r2 - r4;
            r5 = r13.mIsDoubleTapping;
            if (r5 == 0) goto L_0x0156;
        L_0x014d:
            r5 = r13.mDoubleTapListener;
            r5 = r5.onDoubleTapEvent(r14);
            r0 = r0 | r5;
            if (r6 == 0) goto L_0x0045;
        L_0x0156:
            r5 = r13.mAlwaysInTapRegion;	 Catch:{ IllegalArgumentException -> 0x0291 }
            if (r5 == 0) goto L_0x0195;
        L_0x015a:
            r5 = r13.mDownFocusX;
            r5 = r3 - r5;
            r5 = (int) r5;
            r7 = r13.mDownFocusY;
            r7 = r4 - r7;
            r7 = (int) r7;
            r5 = r5 * r5;
            r7 = r7 * r7;
            r5 = r5 + r7;
            r7 = r13.mTouchSlopSquare;
            if (r5 <= r7) goto L_0x018c;
        L_0x016b:
            r0 = r13.mListener;
            r7 = r13.mCurrentDownEvent;
            r0 = r0.onScroll(r7, r14, r1, r2);
            r13.mLastFocusX = r3;
            r13.mLastFocusY = r4;
            r7 = 0;
            r13.mAlwaysInTapRegion = r7;
            r7 = r13.mHandler;
            r8 = 3;
            r7.removeMessages(r8);
            r7 = r13.mHandler;
            r8 = 1;
            r7.removeMessages(r8);
            r7 = r13.mHandler;
            r8 = 2;
            r7.removeMessages(r8);
        L_0x018c:
            r7 = r13.mTouchSlopSquare;	 Catch:{ IllegalArgumentException -> 0x0293 }
            if (r5 <= r7) goto L_0x0193;
        L_0x0190:
            r5 = 0;
            r13.mAlwaysInBiggerTapRegion = r5;	 Catch:{ IllegalArgumentException -> 0x0293 }
        L_0x0193:
            if (r6 == 0) goto L_0x0045;
        L_0x0195:
            r5 = java.lang.Math.abs(r1);	 Catch:{ IllegalArgumentException -> 0x0295 }
            r7 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
            r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
            if (r5 >= 0) goto L_0x01a9;
        L_0x019f:
            r5 = java.lang.Math.abs(r2);	 Catch:{ IllegalArgumentException -> 0x0295 }
            r7 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
            r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
            if (r5 < 0) goto L_0x0045;
        L_0x01a9:
            r0 = r13.mListener;
            r5 = r13.mCurrentDownEvent;
            r0 = r0.onScroll(r5, r14, r1, r2);
            r13.mLastFocusX = r3;
            r13.mLastFocusY = r4;
            if (r6 == 0) goto L_0x0045;
        L_0x01b7:
            r1 = 0;
            r13.mStillDown = r1;
            r1 = android.view.MotionEvent.obtain(r14);
            r2 = r13.mIsDoubleTapping;
            if (r2 == 0) goto L_0x01cb;
        L_0x01c2:
            r2 = r13.mDoubleTapListener;
            r2 = r2.onDoubleTapEvent(r14);
            r0 = r0 | r2;
            if (r6 == 0) goto L_0x0228;
        L_0x01cb:
            r2 = r13.mInLongPress;	 Catch:{ IllegalArgumentException -> 0x0297 }
            if (r2 == 0) goto L_0x01da;
        L_0x01cf:
            r2 = r13.mHandler;	 Catch:{ IllegalArgumentException -> 0x0299 }
            r3 = 3;
            r2.removeMessages(r3);	 Catch:{ IllegalArgumentException -> 0x0299 }
            r2 = 0;
            r13.mInLongPress = r2;	 Catch:{ IllegalArgumentException -> 0x0299 }
            if (r6 == 0) goto L_0x0228;
        L_0x01da:
            r2 = r13.mAlwaysInTapRegion;	 Catch:{ IllegalArgumentException -> 0x0299 }
            if (r2 == 0) goto L_0x01f3;
        L_0x01de:
            r0 = r13.mListener;
            r0 = r0.onSingleTapUp(r14);
            r2 = r13.mDeferConfirmSingleTap;	 Catch:{ IllegalArgumentException -> 0x029b }
            if (r2 == 0) goto L_0x0228;
        L_0x01e8:
            r2 = r13.mDoubleTapListener;	 Catch:{ IllegalArgumentException -> 0x029d }
            if (r2 == 0) goto L_0x0228;
        L_0x01ec:
            r2 = r13.mDoubleTapListener;	 Catch:{ IllegalArgumentException -> 0x029d }
            r2.onSingleTapConfirmed(r14);	 Catch:{ IllegalArgumentException -> 0x029d }
            if (r6 == 0) goto L_0x0228;
        L_0x01f3:
            r2 = r13.mVelocityTracker;
            r3 = 0;
            r3 = android.support.v4.view.MotionEventCompat.getPointerId(r14, r3);
            r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
            r5 = r13.mMaximumFlingVelocity;
            r5 = (float) r5;
            r2.computeCurrentVelocity(r4, r5);
            r4 = android.support.v4.view.VelocityTrackerCompat.getYVelocity(r2, r3);
            r2 = android.support.v4.view.VelocityTrackerCompat.getXVelocity(r2, r3);
            r3 = java.lang.Math.abs(r4);	 Catch:{ IllegalArgumentException -> 0x029f }
            r5 = r13.mMinimumFlingVelocity;	 Catch:{ IllegalArgumentException -> 0x029f }
            r5 = (float) r5;	 Catch:{ IllegalArgumentException -> 0x029f }
            r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
            if (r3 > 0) goto L_0x0220;
        L_0x0215:
            r3 = java.lang.Math.abs(r2);	 Catch:{ IllegalArgumentException -> 0x029f }
            r5 = r13.mMinimumFlingVelocity;	 Catch:{ IllegalArgumentException -> 0x029f }
            r5 = (float) r5;
            r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
            if (r3 <= 0) goto L_0x0228;
        L_0x0220:
            r0 = r13.mListener;
            r3 = r13.mCurrentDownEvent;
            r0 = r0.onFling(r3, r14, r2, r4);
        L_0x0228:
            r2 = r13.mPreviousUpEvent;	 Catch:{ IllegalArgumentException -> 0x02a1 }
            if (r2 == 0) goto L_0x0231;
        L_0x022c:
            r2 = r13.mPreviousUpEvent;	 Catch:{ IllegalArgumentException -> 0x02a1 }
            r2.recycle();	 Catch:{ IllegalArgumentException -> 0x02a1 }
        L_0x0231:
            r13.mPreviousUpEvent = r1;	 Catch:{ IllegalArgumentException -> 0x02a3 }
            r1 = r13.mVelocityTracker;	 Catch:{ IllegalArgumentException -> 0x02a3 }
            if (r1 == 0) goto L_0x023f;
        L_0x0237:
            r1 = r13.mVelocityTracker;	 Catch:{ IllegalArgumentException -> 0x02a3 }
            r1.recycle();	 Catch:{ IllegalArgumentException -> 0x02a3 }
            r1 = 0;
            r13.mVelocityTracker = r1;	 Catch:{ IllegalArgumentException -> 0x02a3 }
        L_0x023f:
            r1 = 0;
            r13.mIsDoubleTapping = r1;	 Catch:{ IllegalArgumentException -> 0x0258 }
            r1 = 0;
            r13.mDeferConfirmSingleTap = r1;	 Catch:{ IllegalArgumentException -> 0x0258 }
            r1 = r13.mHandler;	 Catch:{ IllegalArgumentException -> 0x0258 }
            r2 = 1;
            r1.removeMessages(r2);	 Catch:{ IllegalArgumentException -> 0x0258 }
            r1 = r13.mHandler;	 Catch:{ IllegalArgumentException -> 0x0258 }
            r2 = 2;
            r1.removeMessages(r2);	 Catch:{ IllegalArgumentException -> 0x0258 }
            if (r6 == 0) goto L_0x0045;
        L_0x0253:
            r13.cancel();	 Catch:{ IllegalArgumentException -> 0x0258 }
            goto L_0x0045;
        L_0x0258:
            r0 = move-exception;
            throw r0;
        L_0x025a:
            r0 = move-exception;
            throw r0;
        L_0x025c:
            r9 = android.support.v4.view.MotionEventCompat.getPointerId(r14, r1);
            r10 = r13.mVelocityTracker;
            r10 = android.support.v4.view.VelocityTrackerCompat.getXVelocity(r10, r9);
            r10 = r10 * r7;
            r11 = r13.mVelocityTracker;
            r9 = android.support.v4.view.VelocityTrackerCompat.getYVelocity(r11, r9);
            r9 = r9 * r8;
            r9 = r9 + r10;
            r10 = 0;
            r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1));
            if (r9 >= 0) goto L_0x0095;
        L_0x0274:
            r9 = r13.mVelocityTracker;	 Catch:{ IllegalArgumentException -> 0x027d }
            r9.clear();	 Catch:{ IllegalArgumentException -> 0x027d }
            if (r6 == 0) goto L_0x0099;
        L_0x027b:
            goto L_0x0095;
        L_0x027d:
            r0 = move-exception;
            throw r0;
        L_0x027f:
            r0 = move-exception;
            throw r0;
        L_0x0281:
            r0 = move-exception;
            throw r0;
        L_0x0283:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x0285 }
        L_0x0285:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x0287 }
        L_0x0287:
            r0 = move-exception;
            throw r0;
        L_0x0289:
            r0 = move-exception;
            throw r0;
        L_0x028b:
            r0 = move-exception;
            throw r0;
        L_0x028d:
            r0 = move-exception;
            throw r0;
        L_0x028f:
            r0 = move-exception;
            throw r0;
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
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x0299 }
        L_0x0299:
            r0 = move-exception;
            throw r0;
        L_0x029b:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x029d }
        L_0x029d:
            r0 = move-exception;
            throw r0;
        L_0x029f:
            r0 = move-exception;
            throw r0;
        L_0x02a1:
            r0 = move-exception;
            throw r0;
        L_0x02a3:
            r0 = move-exception;
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.GestureDetectorCompat.GestureDetectorCompatImplBase.onTouchEvent(android.view.MotionEvent):boolean");
        }

        static OnDoubleTapListener access$300(GestureDetectorCompatImplBase gestureDetectorCompatImplBase) {
            return gestureDetectorCompatImplBase.mDoubleTapListener;
        }

        private void cancel() {
            try {
                this.mHandler.removeMessages(1);
                this.mHandler.removeMessages(2);
                this.mHandler.removeMessages(3);
                this.mVelocityTracker.recycle();
                this.mVelocityTracker = null;
                this.mIsDoubleTapping = false;
                this.mStillDown = false;
                this.mAlwaysInTapRegion = false;
                this.mAlwaysInBiggerTapRegion = false;
                this.mDeferConfirmSingleTap = false;
                if (this.mInLongPress) {
                    this.mInLongPress = false;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }

        private void cancelTaps() {
            try {
                this.mHandler.removeMessages(1);
                this.mHandler.removeMessages(2);
                this.mHandler.removeMessages(3);
                this.mIsDoubleTapping = false;
                this.mAlwaysInTapRegion = false;
                this.mAlwaysInBiggerTapRegion = false;
                this.mDeferConfirmSingleTap = false;
                if (this.mInLongPress) {
                    this.mInLongPress = false;
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public GestureDetectorCompatImplBase(android.content.Context r2, android.view.GestureDetector.OnGestureListener r3, android.os.Handler r4) {
            /*
            r1 = this;
            r1.<init>();
            if (r4 == 0) goto L_0x0010;
        L_0x0005:
            r0 = new android.support.v4.view.GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler;	 Catch:{ IllegalArgumentException -> 0x0026 }
            r0.<init>(r1, r4);	 Catch:{ IllegalArgumentException -> 0x0026 }
            r1.mHandler = r0;	 Catch:{ IllegalArgumentException -> 0x0026 }
            r0 = android.support.v4.view.ViewCompat.a;	 Catch:{ IllegalArgumentException -> 0x0026 }
            if (r0 == 0) goto L_0x0017;
        L_0x0010:
            r0 = new android.support.v4.view.GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler;	 Catch:{ IllegalArgumentException -> 0x0026 }
            r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0026 }
            r1.mHandler = r0;	 Catch:{ IllegalArgumentException -> 0x0026 }
        L_0x0017:
            r1.mListener = r3;	 Catch:{ IllegalArgumentException -> 0x0028 }
            r0 = r3 instanceof android.view.GestureDetector.OnDoubleTapListener;	 Catch:{ IllegalArgumentException -> 0x0028 }
            if (r0 == 0) goto L_0x0022;
        L_0x001d:
            r3 = (android.view.GestureDetector.OnDoubleTapListener) r3;	 Catch:{ IllegalArgumentException -> 0x0028 }
            r1.setOnDoubleTapListener(r3);	 Catch:{ IllegalArgumentException -> 0x0028 }
        L_0x0022:
            r1.init(r2);
            return;
        L_0x0026:
            r0 = move-exception;
            throw r0;
        L_0x0028:
            r0 = move-exception;
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.GestureDetectorCompat.GestureDetectorCompatImplBase.<init>(android.content.Context, android.view.GestureDetector$OnGestureListener, android.os.Handler):void");
        }
    }

    class GestureDetectorCompatImplJellybeanMr2 implements GestureDetectorCompatImpl {
        private final GestureDetector mDetector;

        public boolean onTouchEvent(MotionEvent motionEvent) {
            return this.mDetector.onTouchEvent(motionEvent);
        }

        public GestureDetectorCompatImplJellybeanMr2(Context context, OnGestureListener onGestureListener, Handler handler) {
            this.mDetector = new GestureDetector(context, onGestureListener, handler);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.mImpl.onTouchEvent(motionEvent);
    }

    public GestureDetectorCompat(Context context, OnGestureListener onGestureListener, Handler handler) {
        if (VERSION.SDK_INT > 17) {
            this.mImpl = new GestureDetectorCompatImplJellybeanMr2(context, onGestureListener, handler);
            if (ViewCompat.a == 0) {
                return;
            }
        }
        this.mImpl = new GestureDetectorCompatImplBase(context, onGestureListener, handler);
    }
}
