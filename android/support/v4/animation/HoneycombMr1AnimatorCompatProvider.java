package android.support.v4.animation;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.support.v4.app.NotificationCompatBase;
import android.support.v4.app.RemoteInputCompatBase.RemoteInput;
import android.view.View;

class HoneycombMr1AnimatorCompatProvider implements AnimatorProvider {
    private TimeInterpolator mDefaultInterpolator;

    public void clearInterpolator(View view) {
        boolean z = NotificationCompatBase.a;
        if (this.mDefaultInterpolator == null) {
            this.mDefaultInterpolator = new ValueAnimator().getInterpolator();
        }
        view.animate().setInterpolator(this.mDefaultInterpolator);
        if (z) {
            RemoteInput.a++;
        }
    }

    HoneycombMr1AnimatorCompatProvider() {
    }
}
