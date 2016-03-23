package android.support.v7.view;

import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

public class ViewPropertyAnimatorCompatSet {
    private final ArrayList mAnimators;
    private long mDuration;
    private Interpolator mInterpolator;
    private boolean mIsStarted;
    private ViewPropertyAnimatorListener mListener;
    private final ViewPropertyAnimatorListenerAdapter mProxyListener;

    class 1 extends ViewPropertyAnimatorListenerAdapter {
        private int mProxyEndCount;
        private boolean mProxyStarted;
        final ViewPropertyAnimatorCompatSet this$0;

        public void onAnimationEnd(View view) {
            int i = this.mProxyEndCount + 1;
            this.mProxyEndCount = i;
            if (i == ViewPropertyAnimatorCompatSet.access$200(this.this$0).size()) {
                if (ViewPropertyAnimatorCompatSet.access$000(this.this$0) != null) {
                    ViewPropertyAnimatorCompatSet.access$000(this.this$0).onAnimationEnd(null);
                }
                onEnd();
            }
        }

        1(ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet) {
            this.this$0 = viewPropertyAnimatorCompatSet;
            this.mProxyStarted = false;
            this.mProxyEndCount = 0;
        }

        void onEnd() {
            this.mProxyEndCount = 0;
            this.mProxyStarted = false;
            ViewPropertyAnimatorCompatSet.access$100(this.this$0);
        }

        public void onAnimationStart(View view) {
            if (!this.mProxyStarted) {
                this.mProxyStarted = true;
                if (ViewPropertyAnimatorCompatSet.access$000(this.this$0) != null) {
                    ViewPropertyAnimatorCompatSet.access$000(this.this$0).onAnimationStart(null);
                }
            }
        }
    }

    public ViewPropertyAnimatorCompatSet setListener(ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        if (!this.mIsStarted) {
            this.mListener = viewPropertyAnimatorListener;
        }
        return this;
    }

    public void cancel() {
        int i = ActionMode.a;
        if (this.mIsStarted) {
            Iterator it = this.mAnimators.iterator();
            while (it.hasNext()) {
                ((ViewPropertyAnimatorCompat) it.next()).cancel();
                if (i != 0) {
                    break;
                }
            }
            this.mIsStarted = false;
        }
    }

    public ViewPropertyAnimatorCompatSet play(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat) {
        if (!this.mIsStarted) {
            this.mAnimators.add(viewPropertyAnimatorCompat);
        }
        return this;
    }

    private void onAnimationsEnded() {
        this.mIsStarted = false;
    }

    static void access$100(ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet) {
        viewPropertyAnimatorCompatSet.onAnimationsEnded();
    }

    public ViewPropertyAnimatorCompatSet() {
        this.mDuration = -1;
        this.mProxyListener = new 1(this);
        this.mAnimators = new ArrayList();
    }

    static ArrayList access$200(ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet) {
        return viewPropertyAnimatorCompatSet.mAnimators;
    }

    public ViewPropertyAnimatorCompatSet playSequentially(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat, ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2) {
        this.mAnimators.add(viewPropertyAnimatorCompat);
        viewPropertyAnimatorCompat2.setStartDelay(viewPropertyAnimatorCompat.getDuration());
        this.mAnimators.add(viewPropertyAnimatorCompat2);
        return this;
    }

    static ViewPropertyAnimatorListener access$000(ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet) {
        return viewPropertyAnimatorCompatSet.mListener;
    }

    public void start() {
        int i = ActionMode.a;
        if (!this.mIsStarted) {
            Iterator it = this.mAnimators.iterator();
            while (it.hasNext()) {
                ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = (ViewPropertyAnimatorCompat) it.next();
                if (this.mDuration >= 0) {
                    viewPropertyAnimatorCompat.setDuration(this.mDuration);
                }
                if (this.mInterpolator != null) {
                    viewPropertyAnimatorCompat.setInterpolator(this.mInterpolator);
                }
                if (this.mListener != null) {
                    viewPropertyAnimatorCompat.setListener(this.mProxyListener);
                }
                viewPropertyAnimatorCompat.start();
                if (i != 0) {
                    break;
                }
            }
            this.mIsStarted = true;
        }
    }

    public ViewPropertyAnimatorCompatSet setInterpolator(Interpolator interpolator) {
        if (!this.mIsStarted) {
            this.mInterpolator = interpolator;
        }
        return this;
    }

    public ViewPropertyAnimatorCompatSet setDuration(long j) {
        if (!this.mIsStarted) {
            this.mDuration = j;
        }
        return this;
    }
}
