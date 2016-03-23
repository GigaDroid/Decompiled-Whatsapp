package android.support.v4.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class ContentLoadingProgressBar extends ProgressBar {
    private final Runnable mDelayedHide;
    private final Runnable mDelayedShow;
    private boolean mDismissed;
    private boolean mPostedHide;
    private boolean mPostedShow;
    private long mStartTime;

    class 1 implements Runnable {
        final ContentLoadingProgressBar this$0;

        1(ContentLoadingProgressBar contentLoadingProgressBar) {
            this.this$0 = contentLoadingProgressBar;
        }

        public void run() {
            ContentLoadingProgressBar.access$002(this.this$0, false);
            ContentLoadingProgressBar.access$102(this.this$0, -1);
            this.this$0.setVisibility(8);
        }
    }

    class 2 implements Runnable {
        final ContentLoadingProgressBar this$0;

        2(ContentLoadingProgressBar contentLoadingProgressBar) {
            this.this$0 = contentLoadingProgressBar;
        }

        public void run() {
            ContentLoadingProgressBar.access$202(this.this$0, false);
            if (!ContentLoadingProgressBar.access$300(this.this$0)) {
                ContentLoadingProgressBar.access$102(this.this$0, System.currentTimeMillis());
                this.this$0.setVisibility(0);
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks();
    }

    static boolean access$002(ContentLoadingProgressBar contentLoadingProgressBar, boolean z) {
        contentLoadingProgressBar.mPostedHide = z;
        return z;
    }

    static boolean access$202(ContentLoadingProgressBar contentLoadingProgressBar, boolean z) {
        contentLoadingProgressBar.mPostedShow = z;
        return z;
    }

    static boolean access$300(ContentLoadingProgressBar contentLoadingProgressBar) {
        return contentLoadingProgressBar.mDismissed;
    }

    private void removeCallbacks() {
        removeCallbacks(this.mDelayedHide);
        removeCallbacks(this.mDelayedShow);
    }

    static long access$102(ContentLoadingProgressBar contentLoadingProgressBar, long j) {
        contentLoadingProgressBar.mStartTime = j;
        return j;
    }

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.mStartTime = -1;
        this.mPostedHide = false;
        this.mPostedShow = false;
        this.mDismissed = false;
        this.mDelayedHide = new 1(this);
        this.mDelayedShow = new 2(this);
    }

    public ContentLoadingProgressBar(Context context) {
        this(context, null);
    }
}
