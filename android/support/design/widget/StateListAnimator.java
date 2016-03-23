package android.support.design.widget;

import android.util.StateSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

final class StateListAnimator {
    private AnimationListener mAnimationListener;
    private Tuple mLastMatch;
    private Animation mRunningAnimation;
    private final ArrayList mTuples;
    private WeakReference mViewRef;

    class 1 implements AnimationListener {
        final StateListAnimator this$0;

        public void onAnimationRepeat(Animation animation) {
        }

        1(StateListAnimator stateListAnimator) {
            this.this$0 = stateListAnimator;
        }

        public void onAnimationEnd(Animation animation) {
            if (StateListAnimator.access$000(this.this$0) == animation) {
                StateListAnimator.access$002(this.this$0, null);
            }
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    class Tuple {
        final Animation mAnimation;
        final int[] mSpecs;

        private Tuple(int[] iArr, Animation animation) {
            this.mSpecs = iArr;
            this.mAnimation = animation;
        }

        Tuple(int[] iArr, Animation animation, 1 1) {
            this(iArr, animation);
        }
    }

    static Animation access$000(StateListAnimator stateListAnimator) {
        return stateListAnimator.mRunningAnimation;
    }

    void setState(int[] iArr) {
        Tuple tuple = null;
        int size = this.mTuples.size();
        for (int i = 0; i < size; i++) {
            Tuple tuple2 = (Tuple) this.mTuples.get(i);
            if (StateSet.stateSetMatches(tuple2.mSpecs, iArr)) {
                tuple = tuple2;
                break;
            }
        }
        if (tuple != this.mLastMatch) {
            if (this.mLastMatch != null) {
                cancel();
            }
            this.mLastMatch = tuple;
            View view = (View) this.mViewRef.get();
            if (tuple != null && view != null && view.getVisibility() == 0) {
                start(tuple);
            }
        }
    }

    StateListAnimator() {
        this.mTuples = new ArrayList();
        this.mLastMatch = null;
        this.mRunningAnimation = null;
        this.mAnimationListener = new 1(this);
    }

    void setTarget(View view) {
        View target = getTarget();
        if (target != view) {
            if (target != null) {
                clearTarget();
            }
            if (view != null) {
                this.mViewRef = new WeakReference(view);
            }
        }
    }

    public void jumpToCurrentState() {
        if (this.mRunningAnimation != null) {
            View target = getTarget();
            if (target != null && target.getAnimation() == this.mRunningAnimation) {
                target.clearAnimation();
            }
        }
    }

    static Animation access$002(StateListAnimator stateListAnimator, Animation animation) {
        stateListAnimator.mRunningAnimation = animation;
        return animation;
    }

    private void clearTarget() {
        boolean z = CoordinatorLayout.a;
        View target = getTarget();
        int size = this.mTuples.size();
        int i = 0;
        while (i < size) {
            if (target.getAnimation() == ((Tuple) this.mTuples.get(i)).mAnimation) {
                target.clearAnimation();
            }
            int i2 = i + 1;
            if (z) {
                break;
            }
            i = i2;
        }
        this.mViewRef = null;
        this.mLastMatch = null;
        this.mRunningAnimation = null;
    }

    public void addState(int[] iArr, Animation animation) {
        Tuple tuple = new Tuple(iArr, animation, null);
        animation.setAnimationListener(this.mAnimationListener);
        this.mTuples.add(tuple);
    }

    private void start(Tuple tuple) {
        this.mRunningAnimation = tuple.mAnimation;
        View target = getTarget();
        if (target != null) {
            target.startAnimation(this.mRunningAnimation);
        }
    }

    View getTarget() {
        return this.mViewRef == null ? null : (View) this.mViewRef.get();
    }

    private void cancel() {
        if (this.mRunningAnimation != null) {
            View target = getTarget();
            if (target != null && target.getAnimation() == this.mRunningAnimation) {
                target.clearAnimation();
            }
            this.mRunningAnimation = null;
        }
    }
}
