package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.design.R;
import android.support.design.widget.SwipeDismissBehavior.OnDismissListener;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.v;
import org.whispersystems.at;

public final class Snackbar {
    private static final Handler sHandler;
    private Callback mCallback;
    private final Callback mManagerCallback;
    private final ViewGroup mTargetParent;
    private final SnackbarLayout mView;

    class 10 implements AnimationListener {
        final Snackbar this$0;
        final int val$event;

        10(Snackbar snackbar, int i) {
            this.this$0 = snackbar;
            this.val$event = i;
        }

        public void onAnimationEnd(Animation animation) {
            Snackbar.access$300(this.this$0, this.val$event);
        }

        public void onAnimationStart(Animation animation) {
        }

        public void onAnimationRepeat(Animation animation) {
        }
    }

    final class 1 implements android.os.Handler.Callback {
        public boolean handleMessage(Message message) {
            switch (message.what) {
                case v.m /*0*/:
                    ((Snackbar) message.obj).showView();
                    return true;
                case at.g /*1*/:
                    ((Snackbar) message.obj).hideView(message.arg1);
                    return true;
                default:
                    return false;
            }
        }

        1() {
        }
    }

    class 4 implements OnDismissListener {
        final Snackbar this$0;

        public void onDismiss(View view) {
            Snackbar.access$000(this.this$0, 0);
        }

        public void onDragStateChanged(int i) {
            switch (i) {
                case v.m /*0*/:
                    break;
                case at.g /*1*/:
                case at.i /*2*/:
                    SnackbarManager.getInstance().cancelTimeout(Snackbar.access$200(this.this$0));
                    if (!CoordinatorLayout.a) {
                        return;
                    }
                    break;
                default:
                    return;
            }
            SnackbarManager.getInstance().restoreTimeout(Snackbar.access$200(this.this$0));
        }

        4(Snackbar snackbar) {
            this.this$0 = snackbar;
        }
    }

    class 5 implements OnAttachStateChangeListener {
        final Snackbar this$0;

        class 1 implements Runnable {
            final 5 this$1;

            public void run() {
                Snackbar.access$300(this.this$1.this$0, 3);
            }

            1(5 5) {
                this.this$1 = 5;
            }
        }

        public void onViewDetachedFromWindow(View view) {
            if (this.this$0.isShownOrQueued()) {
                Snackbar.access$100().post(new 1(this));
            }
        }

        public void onViewAttachedToWindow(View view) {
        }

        5(Snackbar snackbar) {
            this.this$0 = snackbar;
        }
    }

    class 6 implements OnLayoutChangeListener {
        final Snackbar this$0;

        public void onLayoutChange(View view, int i, int i2, int i3, int i4) {
            Snackbar.access$400(this.this$0);
            Snackbar.access$500(this.this$0).setOnLayoutChangeListener(null);
        }

        6(Snackbar snackbar) {
            this.this$0 = snackbar;
        }
    }

    class 7 extends ViewPropertyAnimatorListenerAdapter {
        final Snackbar this$0;

        public void onAnimationEnd(View view) {
            if (Snackbar.access$600(this.this$0) != null) {
                Snackbar.access$600(this.this$0).onShown(this.this$0);
            }
            SnackbarManager.getInstance().onShown(Snackbar.access$200(this.this$0));
        }

        7(Snackbar snackbar) {
            this.this$0 = snackbar;
        }

        public void onAnimationStart(View view) {
            Snackbar.access$500(this.this$0).animateChildrenIn(70, 180);
        }
    }

    class 8 implements AnimationListener {
        final Snackbar this$0;

        8(Snackbar snackbar) {
            this.this$0 = snackbar;
        }

        public void onAnimationEnd(Animation animation) {
            if (Snackbar.access$600(this.this$0) != null) {
                Snackbar.access$600(this.this$0).onShown(this.this$0);
            }
            SnackbarManager.getInstance().onShown(Snackbar.access$200(this.this$0));
        }

        public void onAnimationStart(Animation animation) {
        }

        public void onAnimationRepeat(Animation animation) {
        }
    }

    class 9 extends ViewPropertyAnimatorListenerAdapter {
        final Snackbar this$0;
        final int val$event;

        public void onAnimationStart(View view) {
            Snackbar.access$500(this.this$0).animateChildrenOut(0, 180);
        }

        9(Snackbar snackbar, int i) {
            this.this$0 = snackbar;
            this.val$event = i;
        }

        public void onAnimationEnd(View view) {
            Snackbar.access$300(this.this$0, this.val$event);
        }
    }

    final class Behavior extends SwipeDismissBehavior {
        final Snackbar this$0;

        Behavior(Snackbar snackbar) {
            this.this$0 = snackbar;
        }

        public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return onInterceptTouchEvent(coordinatorLayout, (SnackbarLayout) view, motionEvent);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onInterceptTouchEvent(android.support.design.widget.CoordinatorLayout r3, android.support.design.widget.Snackbar.SnackbarLayout r4, android.view.MotionEvent r5) {
            /*
            r2 = this;
            r0 = r5.getX();
            r0 = (int) r0;
            r1 = r5.getY();
            r1 = (int) r1;
            r0 = r3.isPointInChildBounds(r4, r0, r1);
            if (r0 == 0) goto L_0x0017;
        L_0x0010:
            r0 = r5.getActionMasked();
            switch(r0) {
                case 0: goto L_0x001c;
                case 1: goto L_0x002d;
                case 2: goto L_0x0017;
                case 3: goto L_0x002d;
                default: goto L_0x0017;
            };
        L_0x0017:
            r0 = super.onInterceptTouchEvent(r3, r4, r5);
            return r0;
        L_0x001c:
            r0 = android.support.design.widget.SnackbarManager.getInstance();
            r1 = r2.this$0;
            r1 = android.support.design.widget.Snackbar.access$200(r1);
            r0.cancelTimeout(r1);
            r0 = android.support.design.widget.CoordinatorLayout.a;
            if (r0 == 0) goto L_0x0017;
        L_0x002d:
            r0 = android.support.design.widget.SnackbarManager.getInstance();
            r1 = r2.this$0;
            r1 = android.support.design.widget.Snackbar.access$200(r1);
            r0.restoreTimeout(r1);
            goto L_0x0017;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.Snackbar.Behavior.onInterceptTouchEvent(android.support.design.widget.CoordinatorLayout, android.support.design.widget.Snackbar$SnackbarLayout, android.view.MotionEvent):boolean");
        }

        public boolean canSwipeDismissView(View view) {
            return view instanceof SnackbarLayout;
        }
    }

    public abstract class Callback {
        public void onShown(Snackbar snackbar) {
        }

        public void onDismissed(Snackbar snackbar, int i) {
        }
    }

    public class SnackbarLayout extends LinearLayout {
        private Button mActionView;
        private int mMaxInlineActionWidth;
        private int mMaxWidth;
        private TextView mMessageView;
        private OnAttachStateChangeListener mOnAttachStateChangeListener;
        private OnLayoutChangeListener mOnLayoutChangeListener;

        interface OnAttachStateChangeListener {
            void onViewAttachedToWindow(View view);

            void onViewDetachedFromWindow(View view);
        }

        interface OnLayoutChangeListener {
            void onLayoutChange(View view, int i, int i2, int i3, int i4);
        }

        private static void updateTopBottomPadding(View view, int i, int i2) {
            if (ViewCompat.isPaddingRelative(view)) {
                ViewCompat.setPaddingRelative(view, ViewCompat.getPaddingStart(view), i, ViewCompat.getPaddingEnd(view), i2);
                if (!CoordinatorLayout.a) {
                    return;
                }
            }
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }

        private boolean updateViewsWithinLayout(int i, int i2, int i3) {
            boolean z = false;
            if (i != getOrientation()) {
                setOrientation(i);
                z = true;
            }
            if (this.mMessageView.getPaddingTop() == i2 && this.mMessageView.getPaddingBottom() == i3) {
                return z;
            }
            updateTopBottomPadding(this.mMessageView, i2, i3);
            return true;
        }

        void setOnAttachStateChangeListener(OnAttachStateChangeListener onAttachStateChangeListener) {
            this.mOnAttachStateChangeListener = onAttachStateChangeListener;
        }

        public SnackbarLayout(Context context) {
            this(context, null);
        }

        void animateChildrenOut(int i, int i2) {
            ViewCompat.setAlpha(this.mMessageView, 1.0f);
            ViewCompat.animate(this.mMessageView).alpha(0.0f).setDuration((long) i2).setStartDelay((long) i).start();
            if (this.mActionView.getVisibility() == 0) {
                ViewCompat.setAlpha(this.mActionView, 1.0f);
                ViewCompat.animate(this.mActionView).alpha(0.0f).setDuration((long) i2).setStartDelay((long) i).start();
            }
        }

        void setOnLayoutChangeListener(OnLayoutChangeListener onLayoutChangeListener) {
            this.mOnLayoutChangeListener = onLayoutChangeListener;
        }

        protected void onMeasure(int i, int i2) {
            int i3;
            int i4;
            super.onMeasure(i, i2);
            if (this.mMaxWidth > 0 && getMeasuredWidth() > this.mMaxWidth) {
                i = MeasureSpec.makeMeasureSpec(this.mMaxWidth, 1073741824);
                super.onMeasure(i, i2);
            }
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
            if (this.mMessageView.getLayout().getLineCount() > 1) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (i3 == 0 || this.mMaxInlineActionWidth <= 0 || this.mActionView.getMeasuredWidth() <= this.mMaxInlineActionWidth) {
                i4 = 0;
            } else {
                if (!updateViewsWithinLayout(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
                    dimensionPixelSize = 0;
                } else if (CoordinatorLayout.a) {
                    i4 = 1;
                } else {
                    dimensionPixelSize = 1;
                }
                if (dimensionPixelSize != 0) {
                    super.onMeasure(i, i2);
                }
            }
            if (i3 == 0) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            dimensionPixelSize = updateViewsWithinLayout(0, dimensionPixelSize, dimensionPixelSize) ? 1 : i4;
            if (dimensionPixelSize != 0) {
                super.onMeasure(i, i2);
            }
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SnackbarLayout);
            this.mMaxWidth = obtainStyledAttributes.getDimensionPixelSize(R.styleable.SnackbarLayout_android_maxWidth, -1);
            this.mMaxInlineActionWidth = obtainStyledAttributes.getDimensionPixelSize(R.styleable.SnackbarLayout_maxActionInlineWidth, -1);
            if (obtainStyledAttributes.hasValue(R.styleable.SnackbarLayout_elevation)) {
                ViewCompat.setElevation(this, (float) obtainStyledAttributes.getDimensionPixelSize(R.styleable.SnackbarLayout_elevation, 0));
            }
            obtainStyledAttributes.recycle();
            setClickable(true);
            LayoutInflater.from(context).inflate(R.layout.design_layout_snackbar_include, this);
            ViewCompat.setAccessibilityLiveRegion(this, 1);
        }

        void animateChildrenIn(int i, int i2) {
            ViewCompat.setAlpha(this.mMessageView, 0.0f);
            ViewCompat.animate(this.mMessageView).alpha(1.0f).setDuration((long) i2).setStartDelay((long) i).start();
            if (this.mActionView.getVisibility() == 0) {
                ViewCompat.setAlpha(this.mActionView, 0.0f);
                ViewCompat.animate(this.mActionView).alpha(1.0f).setDuration((long) i2).setStartDelay((long) i).start();
            }
        }

        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (this.mOnAttachStateChangeListener != null) {
                this.mOnAttachStateChangeListener.onViewDetachedFromWindow(this);
            }
        }

        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (z && this.mOnLayoutChangeListener != null) {
                this.mOnLayoutChangeListener.onLayoutChange(this, i, i2, i3, i4);
            }
        }

        protected void onFinishInflate() {
            super.onFinishInflate();
            this.mMessageView = (TextView) findViewById(R.id.snackbar_text);
            this.mActionView = (Button) findViewById(R.id.snackbar_action);
        }

        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            if (this.mOnAttachStateChangeListener != null) {
                this.mOnAttachStateChangeListener.onViewAttachedToWindow(this);
            }
        }
    }

    final void hideView(int i) {
        if (this.mView.getVisibility() != 0 || isBeingDragged()) {
            onViewHidden(i);
            if (!CoordinatorLayout.a) {
                return;
            }
        }
        animateViewOut(i);
    }

    static Callback access$600(Snackbar snackbar) {
        return snackbar.mCallback;
    }

    final void showView() {
        if (this.mView.getParent() == null) {
            LayoutParams layoutParams = this.mView.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                android.support.design.widget.CoordinatorLayout.Behavior behavior = new Behavior(this);
                behavior.setStartAlphaSwipeDistance(0.1f);
                behavior.setEndAlphaSwipeDistance(0.6f);
                behavior.setSwipeDirection(0);
                behavior.setListener(new 4(this));
                ((CoordinatorLayout.LayoutParams) layoutParams).setBehavior(behavior);
            }
            this.mTargetParent.addView(this.mView);
        }
        this.mView.setOnAttachStateChangeListener(new 5(this));
        if (ViewCompat.isLaidOut(this.mView)) {
            animateViewIn();
            if (!CoordinatorLayout.a) {
                return;
            }
        }
        this.mView.setOnLayoutChangeListener(new 6(this));
    }

    private void animateViewOut(int i) {
        if (VERSION.SDK_INT >= 14) {
            ViewCompat.animate(this.mView).translationY((float) this.mView.getHeight()).setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR).setDuration(250).setListener(new 9(this, i)).start();
            if (!CoordinatorLayout.a) {
                return;
            }
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(this.mView.getContext(), R.anim.design_snackbar_out);
        loadAnimation.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
        loadAnimation.setDuration(250);
        loadAnimation.setAnimationListener(new 10(this, i));
        this.mView.startAnimation(loadAnimation);
    }

    static {
        sHandler = new Handler(Looper.getMainLooper(), new 1());
    }

    static Handler access$100() {
        return sHandler;
    }

    static void access$300(Snackbar snackbar, int i) {
        snackbar.onViewHidden(i);
    }

    public boolean isShownOrQueued() {
        return SnackbarManager.getInstance().isCurrentOrNext(this.mManagerCallback);
    }

    static Callback access$200(Snackbar snackbar) {
        return snackbar.mManagerCallback;
    }

    private void onViewHidden(int i) {
        SnackbarManager.getInstance().onDismissed(this.mManagerCallback);
        if (this.mCallback != null) {
            this.mCallback.onDismissed(this, i);
        }
        ViewParent parent = this.mView.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.mView);
        }
    }

    private void animateViewIn() {
        if (VERSION.SDK_INT >= 14) {
            ViewCompat.setTranslationY(this.mView, (float) this.mView.getHeight());
            ViewCompat.animate(this.mView).translationY(0.0f).setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR).setDuration(250).setListener(new 7(this)).start();
            if (!CoordinatorLayout.a) {
                return;
            }
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(this.mView.getContext(), R.anim.design_snackbar_in);
        loadAnimation.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
        loadAnimation.setDuration(250);
        loadAnimation.setAnimationListener(new 8(this));
        this.mView.startAnimation(loadAnimation);
    }

    static void access$000(Snackbar snackbar, int i) {
        snackbar.dispatchDismiss(i);
    }

    static SnackbarLayout access$500(Snackbar snackbar) {
        return snackbar.mView;
    }

    static void access$400(Snackbar snackbar) {
        snackbar.animateViewIn();
    }

    private void dispatchDismiss(int i) {
        SnackbarManager.getInstance().dismiss(this.mManagerCallback, i);
    }

    private boolean isBeingDragged() {
        LayoutParams layoutParams = this.mView.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
            android.support.design.widget.CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
            if (behavior instanceof SwipeDismissBehavior) {
                return ((SwipeDismissBehavior) behavior).getDragState() != 0;
            }
        }
        return false;
    }
}
