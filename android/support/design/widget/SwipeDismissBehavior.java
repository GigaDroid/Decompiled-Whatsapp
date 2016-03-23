package android.support.design.widget;

import android.support.annotation.NonNull;
import android.support.design.widget.CoordinatorLayout.Behavior;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.ViewDragHelper;
import android.support.v4.widget.ViewDragHelper.Callback;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import org.whispersystems.at;

public class SwipeDismissBehavior extends Behavior {
    private float mAlphaEndSwipeDistance;
    private float mAlphaStartSwipeDistance;
    private final Callback mDragCallback;
    private float mDragDismissThreshold;
    private boolean mIgnoreEvents;
    private OnDismissListener mListener;
    private float mSensitivity;
    private boolean mSensitivitySet;
    private int mSwipeDirection;
    private ViewDragHelper mViewDragHelper;

    public interface OnDismissListener {
        void onDismiss(View view);

        void onDragStateChanged(int i);
    }

    class 1 extends Callback {
        private int mOriginalCapturedViewLeft;
        final SwipeDismissBehavior this$0;

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int clampViewPositionHorizontal(android.view.View r7, int r8, int r9) {
            /*
            r6 = this;
            r1 = 1;
            r4 = android.support.design.widget.CoordinatorLayout.a;
            r0 = android.support.v4.view.ViewCompat.getLayoutDirection(r7);
            if (r0 != r1) goto L_0x0060;
        L_0x0009:
            r0 = r1;
        L_0x000a:
            r2 = r6.this$0;
            r2 = android.support.design.widget.SwipeDismissBehavior.access$200(r2);
            if (r2 != 0) goto L_0x002b;
        L_0x0012:
            if (r0 == 0) goto L_0x0020;
        L_0x0014:
            r2 = r6.mOriginalCapturedViewLeft;
            r3 = r7.getWidth();
            r3 = r2 - r3;
            r2 = r6.mOriginalCapturedViewLeft;
            if (r4 == 0) goto L_0x0062;
        L_0x0020:
            r3 = r6.mOriginalCapturedViewLeft;
            r2 = r6.mOriginalCapturedViewLeft;
            r5 = r7.getWidth();
            r2 = r2 + r5;
            if (r4 == 0) goto L_0x0062;
        L_0x002b:
            r2 = r6.this$0;
            r2 = android.support.design.widget.SwipeDismissBehavior.access$200(r2);
            if (r2 != r1) goto L_0x004c;
        L_0x0033:
            if (r0 == 0) goto L_0x0040;
        L_0x0035:
            r1 = r6.mOriginalCapturedViewLeft;
            r0 = r6.mOriginalCapturedViewLeft;
            r2 = r7.getWidth();
            r0 = r0 + r2;
            if (r4 == 0) goto L_0x005b;
        L_0x0040:
            r0 = r6.mOriginalCapturedViewLeft;
            r1 = r7.getWidth();
            r1 = r0 - r1;
            r0 = r6.mOriginalCapturedViewLeft;
            if (r4 == 0) goto L_0x005b;
        L_0x004c:
            r0 = r6.mOriginalCapturedViewLeft;
            r1 = r7.getWidth();
            r1 = r0 - r1;
            r0 = r6.mOriginalCapturedViewLeft;
            r2 = r7.getWidth();
            r0 = r0 + r2;
        L_0x005b:
            r0 = android.support.design.widget.SwipeDismissBehavior.access$400(r1, r8, r0);
            return r0;
        L_0x0060:
            r0 = 0;
            goto L_0x000a;
        L_0x0062:
            r0 = r2;
            r1 = r3;
            goto L_0x005b;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.SwipeDismissBehavior.1.clampViewPositionHorizontal(android.view.View, int, int):int");
        }

        private boolean shouldDismiss(View view, float f) {
            if (f != 0.0f) {
                boolean z;
                if (ViewCompat.getLayoutDirection(view) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (SwipeDismissBehavior.access$200(this.this$0) == 2) {
                    return true;
                }
                if (SwipeDismissBehavior.access$200(this.this$0) == 0) {
                    if (z) {
                        if (f >= 0.0f) {
                            return false;
                        }
                        return true;
                    } else if (f <= 0.0f) {
                        return false;
                    } else {
                        return true;
                    }
                } else if (SwipeDismissBehavior.access$200(this.this$0) == 1) {
                    if (z) {
                        if (f <= 0.0f) {
                            return false;
                        }
                        return true;
                    } else if (f >= 0.0f) {
                        return false;
                    } else {
                        return true;
                    }
                } else if (!CoordinatorLayout.a) {
                    return false;
                }
            }
            int left = view.getLeft() - this.mOriginalCapturedViewLeft;
            if (Math.abs(left) < Math.round(((float) view.getWidth()) * SwipeDismissBehavior.access$300(this.this$0))) {
                return false;
            }
            return true;
        }

        public int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }

        public void onViewDragStateChanged(int i) {
            if (SwipeDismissBehavior.access$000(this.this$0) != null) {
                SwipeDismissBehavior.access$000(this.this$0).onDragStateChanged(i);
            }
        }

        public int getViewHorizontalDragRange(View view) {
            return view.getWidth();
        }

        public void onViewCaptured(View view, int i) {
            this.mOriginalCapturedViewLeft = view.getLeft();
        }

        1(SwipeDismissBehavior swipeDismissBehavior) {
            this.this$0 = swipeDismissBehavior;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onViewReleased(android.view.View r6, float r7, float r8) {
            /*
            r5 = this;
            r2 = android.support.design.widget.CoordinatorLayout.a;
            r1 = r6.getWidth();
            r0 = 0;
            r3 = r5.shouldDismiss(r6, r7);
            if (r3 == 0) goto L_0x001c;
        L_0x000d:
            r0 = r6.getLeft();
            r3 = r5.mOriginalCapturedViewLeft;
            if (r0 >= r3) goto L_0x004e;
        L_0x0015:
            r0 = r5.mOriginalCapturedViewLeft;
            r1 = r0 - r1;
        L_0x0019:
            r0 = 1;
            if (r2 == 0) goto L_0x001e;
        L_0x001c:
            r1 = r5.mOriginalCapturedViewLeft;
        L_0x001e:
            r3 = r5.this$0;
            r3 = android.support.design.widget.SwipeDismissBehavior.access$100(r3);
            r4 = r6.getTop();
            r1 = r3.settleCapturedViewAt(r1, r4);
            if (r1 == 0) goto L_0x003a;
        L_0x002e:
            r1 = new android.support.design.widget.SwipeDismissBehavior$SettleRunnable;
            r3 = r5.this$0;
            r1.<init>(r3, r6, r0);
            android.support.v4.view.ViewCompat.postOnAnimation(r6, r1);
            if (r2 == 0) goto L_0x004d;
        L_0x003a:
            if (r0 == 0) goto L_0x004d;
        L_0x003c:
            r0 = r5.this$0;
            r0 = android.support.design.widget.SwipeDismissBehavior.access$000(r0);
            if (r0 == 0) goto L_0x004d;
        L_0x0044:
            r0 = r5.this$0;
            r0 = android.support.design.widget.SwipeDismissBehavior.access$000(r0);
            r0.onDismiss(r6);
        L_0x004d:
            return;
        L_0x004e:
            r0 = r5.mOriginalCapturedViewLeft;
            r1 = r1 + r0;
            goto L_0x0019;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.SwipeDismissBehavior.1.onViewReleased(android.view.View, float, float):void");
        }

        public boolean tryCaptureView(View view, int i) {
            return this.this$0.canSwipeDismissView(view);
        }

        public void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            boolean z = CoordinatorLayout.a;
            float width = ((float) this.mOriginalCapturedViewLeft) + (((float) view.getWidth()) * SwipeDismissBehavior.access$500(this.this$0));
            float width2 = ((float) this.mOriginalCapturedViewLeft) + (((float) view.getWidth()) * SwipeDismissBehavior.access$600(this.this$0));
            if (((float) i) <= width) {
                ViewCompat.setAlpha(view, 1.0f);
                if (!z) {
                    return;
                }
            }
            if (((float) i) >= width2) {
                ViewCompat.setAlpha(view, 0.0f);
                if (!z) {
                    return;
                }
            }
            ViewCompat.setAlpha(view, SwipeDismissBehavior.access$700(0.0f, 1.0f - SwipeDismissBehavior.fraction(width, width2, (float) i), 1.0f));
        }
    }

    class SettleRunnable implements Runnable {
        private final boolean mDismiss;
        private final View mView;
        final SwipeDismissBehavior this$0;

        SettleRunnable(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
            this.this$0 = swipeDismissBehavior;
            this.mView = view;
            this.mDismiss = z;
        }

        public void run() {
            if (SwipeDismissBehavior.access$100(this.this$0) != null && SwipeDismissBehavior.access$100(this.this$0).continueSettling(true)) {
                ViewCompat.postOnAnimation(this.mView, this);
                if (!CoordinatorLayout.a) {
                    return;
                }
            }
            if (this.mDismiss && SwipeDismissBehavior.access$000(this.this$0) != null) {
                SwipeDismissBehavior.access$000(this.this$0).onDismiss(this.mView);
            }
        }
    }

    static OnDismissListener access$000(SwipeDismissBehavior swipeDismissBehavior) {
        return swipeDismissBehavior.mListener;
    }

    public SwipeDismissBehavior() {
        this.mSensitivity = 0.0f;
        this.mSwipeDirection = 2;
        this.mDragDismissThreshold = 0.5f;
        this.mAlphaStartSwipeDistance = 0.0f;
        this.mAlphaEndSwipeDistance = 0.5f;
        this.mDragCallback = new 1(this);
    }

    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        switch (MotionEventCompat.getActionMasked(motionEvent)) {
            case at.g /*1*/:
            case at.o /*3*/:
                if (this.mIgnoreEvents) {
                    this.mIgnoreEvents = false;
                    return false;
                }
                break;
            default:
                boolean z;
                if (coordinatorLayout.isPointInChildBounds(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    z = false;
                } else {
                    z = true;
                }
                this.mIgnoreEvents = z;
                break;
        }
        if (this.mIgnoreEvents) {
            return false;
        }
        ensureViewDragHelper(coordinatorLayout);
        return this.mViewDragHelper.shouldInterceptTouchEvent(motionEvent);
    }

    public void setEndAlphaSwipeDistance(float f) {
        this.mAlphaEndSwipeDistance = clamp(0.0f, f, 1.0f);
    }

    private void ensureViewDragHelper(ViewGroup viewGroup) {
        if (this.mViewDragHelper == null) {
            ViewDragHelper create;
            if (this.mSensitivitySet) {
                create = ViewDragHelper.create(viewGroup, this.mSensitivity, this.mDragCallback);
            } else {
                create = ViewDragHelper.create(viewGroup, this.mDragCallback);
            }
            this.mViewDragHelper = create;
        }
    }

    private static float clamp(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.mViewDragHelper == null) {
            return false;
        }
        this.mViewDragHelper.processTouchEvent(motionEvent);
        return true;
    }

    static float access$700(float f, float f2, float f3) {
        return clamp(f, f2, f3);
    }

    static float fraction(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    static float access$600(SwipeDismissBehavior swipeDismissBehavior) {
        return swipeDismissBehavior.mAlphaEndSwipeDistance;
    }

    static int access$400(int i, int i2, int i3) {
        return clamp(i, i2, i3);
    }

    public void setListener(OnDismissListener onDismissListener) {
        this.mListener = onDismissListener;
    }

    public int getDragState() {
        return this.mViewDragHelper != null ? this.mViewDragHelper.getViewDragState() : 0;
    }

    static int access$200(SwipeDismissBehavior swipeDismissBehavior) {
        return swipeDismissBehavior.mSwipeDirection;
    }

    static float access$300(SwipeDismissBehavior swipeDismissBehavior) {
        return swipeDismissBehavior.mDragDismissThreshold;
    }

    static float access$500(SwipeDismissBehavior swipeDismissBehavior) {
        return swipeDismissBehavior.mAlphaStartSwipeDistance;
    }

    static ViewDragHelper access$100(SwipeDismissBehavior swipeDismissBehavior) {
        return swipeDismissBehavior.mViewDragHelper;
    }

    public boolean canSwipeDismissView(@NonNull View view) {
        return true;
    }

    public void setStartAlphaSwipeDistance(float f) {
        this.mAlphaStartSwipeDistance = clamp(0.0f, f, 1.0f);
    }

    private static int clamp(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    public void setSwipeDirection(int i) {
        this.mSwipeDirection = i;
    }
}
