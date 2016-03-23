package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.design.R;
import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.WindowInsetsCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class ScrimInsetsFrameLayout extends FrameLayout {
    private Drawable mInsetForeground;
    private Rect mInsets;
    private Rect mTempRect;

    class 1 implements OnApplyWindowInsetsListener {
        final ScrimInsetsFrameLayout this$0;

        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            boolean z;
            if (ScrimInsetsFrameLayout.access$000(this.this$0) == null) {
                ScrimInsetsFrameLayout.access$002(this.this$0, new Rect());
            }
            ScrimInsetsFrameLayout.access$000(this.this$0).set(windowInsetsCompat.getSystemWindowInsetLeft(), windowInsetsCompat.getSystemWindowInsetTop(), windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
            ScrimInsetsFrameLayout scrimInsetsFrameLayout = this.this$0;
            if (ScrimInsetsFrameLayout.access$000(this.this$0).isEmpty() || ScrimInsetsFrameLayout.access$100(this.this$0) == null) {
                z = true;
            } else {
                z = false;
            }
            scrimInsetsFrameLayout.setWillNotDraw(z);
            ViewCompat.postInvalidateOnAnimation(this.this$0);
            return windowInsetsCompat.consumeSystemWindowInsets();
        }

        1(ScrimInsetsFrameLayout scrimInsetsFrameLayout) {
            this.this$0 = scrimInsetsFrameLayout;
        }
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mTempRect = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ScrimInsetsFrameLayout, i, R.style.Widget_Design_ScrimInsetsFrameLayout);
        this.mInsetForeground = obtainStyledAttributes.getDrawable(R.styleable.ScrimInsetsFrameLayout_insetForeground);
        obtainStyledAttributes.recycle();
        setWillNotDraw(true);
        ViewCompat.setOnApplyWindowInsetsListener(this, new 1(this));
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    static Rect access$000(ScrimInsetsFrameLayout scrimInsetsFrameLayout) {
        return scrimInsetsFrameLayout.mInsets;
    }

    public ScrimInsetsFrameLayout(Context context) {
        this(context, null);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mInsetForeground != null) {
            this.mInsetForeground.setCallback(this);
        }
    }

    static Rect access$002(ScrimInsetsFrameLayout scrimInsetsFrameLayout, Rect rect) {
        scrimInsetsFrameLayout.mInsets = rect;
        return rect;
    }

    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.mInsets != null && this.mInsetForeground != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            this.mTempRect.set(0, 0, width, this.mInsets.top);
            this.mInsetForeground.setBounds(this.mTempRect);
            this.mInsetForeground.draw(canvas);
            this.mTempRect.set(0, height - this.mInsets.bottom, width, height);
            this.mInsetForeground.setBounds(this.mTempRect);
            this.mInsetForeground.draw(canvas);
            this.mTempRect.set(0, this.mInsets.top, this.mInsets.left, height - this.mInsets.bottom);
            this.mInsetForeground.setBounds(this.mTempRect);
            this.mInsetForeground.draw(canvas);
            this.mTempRect.set(width - this.mInsets.right, this.mInsets.top, width, height - this.mInsets.bottom);
            this.mInsetForeground.setBounds(this.mTempRect);
            this.mInsetForeground.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mInsetForeground != null) {
            this.mInsetForeground.setCallback(null);
        }
    }

    static Drawable access$100(ScrimInsetsFrameLayout scrimInsetsFrameLayout) {
        return scrimInsetsFrameLayout.mInsetForeground;
    }
}
