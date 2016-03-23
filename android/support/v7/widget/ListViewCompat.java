package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.graphics.drawable.DrawableWrapper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;
import java.lang.reflect.Field;
import org.v;
import org.whispersystems.at;

public class ListViewCompat extends ListView {
    private static final int[] STATE_SET_NOTHING;
    private static final String z;
    private Field mIsChildViewEnabled;
    protected int mMotionPosition;
    int mSelectionBottomPadding;
    int mSelectionLeftPadding;
    int mSelectionRightPadding;
    int mSelectionTopPadding;
    private GateKeeperDrawable mSelector;
    final Rect mSelectorRect;

    class GateKeeperDrawable extends DrawableWrapper {
        private boolean mEnabled;

        public boolean setState(int[] iArr) {
            if (this.mEnabled) {
                return super.setState(iArr);
            }
            return false;
        }

        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.mEnabled) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        void setEnabled(boolean z) {
            this.mEnabled = z;
        }

        public void draw(Canvas canvas) {
            if (this.mEnabled) {
                super.draw(canvas);
            }
        }

        public void setHotspot(float f, float f2) {
            if (this.mEnabled) {
                super.setHotspot(f, f2);
            }
        }

        public GateKeeperDrawable(Drawable drawable) {
            super(drawable);
            this.mEnabled = true;
        }

        public boolean setVisible(boolean z, boolean z2) {
            if (this.mEnabled) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    public ListViewCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mSelectorRect = new Rect();
        this.mSelectionLeftPadding = 0;
        this.mSelectionTopPadding = 0;
        this.mSelectionRightPadding = 0;
        this.mSelectionBottomPadding = 0;
        try {
            this.mIsChildViewEnabled = AbsListView.class.getDeclaredField(z);
            this.mIsChildViewEnabled.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    static {
        char[] toCharArray = "\t\n\u0007q \r/\u0010d!\u000141\\)\u0006/\u0011V".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 100;
                    break;
                case at.g /*1*/:
                    i2 = 67;
                    break;
                case at.i /*2*/:
                    i2 = 116;
                    break;
                case at.o /*3*/:
                    i2 = 50;
                    break;
                default:
                    i2 = 72;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
        STATE_SET_NOTHING = new int[]{0};
    }

    public ListViewCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    protected void dispatchDraw(Canvas canvas) {
        drawSelectorCompat(canvas);
        super.dispatchDraw(canvas);
    }

    public ListViewCompat(Context context) {
        this(context, null);
    }

    protected boolean touchModeDrawsInPressedStateCompat() {
        return false;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        setSelectorEnabled(true);
        updateSelectorStateCompat();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int measureHeightOfChildrenCompat(int r14, int r15, int r16, int r17, int r18) {
        /*
        r13 = this;
        r8 = android.support.v7.widget.LinearLayoutCompat.a;
        r2 = r13.getListPaddingTop();
        r3 = r13.getListPaddingBottom();
        r13.getListPaddingLeft();
        r13.getListPaddingRight();
        r1 = r13.getDividerHeight();
        r4 = r13.getDivider();
        r9 = r13.getAdapter();
        if (r9 != 0) goto L_0x0021;
    L_0x001e:
        r17 = r2 + r3;
    L_0x0020:
        return r17;
    L_0x0021:
        r3 = r3 + r2;
        if (r1 <= 0) goto L_0x0082;
    L_0x0024:
        if (r4 == 0) goto L_0x0082;
    L_0x0026:
        r4 = 0;
        r6 = 0;
        r5 = 0;
        r10 = r9.getCount();
        r2 = 0;
        r7 = r2;
    L_0x002f:
        if (r7 >= r10) goto L_0x008f;
    L_0x0031:
        r2 = r9.getItemViewType(r7);
        if (r2 == r5) goto L_0x0092;
    L_0x0037:
        r5 = 0;
        r12 = r2;
        r2 = r5;
        r5 = r12;
    L_0x003b:
        r6 = r9.getView(r7, r2, r13);
        r2 = r6.getLayoutParams();
        if (r2 != 0) goto L_0x004c;
    L_0x0045:
        r2 = r13.generateDefaultLayoutParams();
        r6.setLayoutParams(r2);
    L_0x004c:
        r11 = r2.height;
        if (r11 <= 0) goto L_0x005a;
    L_0x0050:
        r2 = r2.height;
        r11 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r11);
        if (r8 == 0) goto L_0x0060;
    L_0x005a:
        r2 = 0;
        r11 = 0;
        r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r11);
    L_0x0060:
        r6.measure(r14, r2);
        r6.forceLayout();
        if (r7 <= 0) goto L_0x0096;
    L_0x0068:
        r2 = r3 + r1;
    L_0x006a:
        r3 = r6.getMeasuredHeight();
        r3 = r3 + r2;
        r0 = r17;
        if (r3 < r0) goto L_0x0084;
    L_0x0073:
        if (r18 < 0) goto L_0x0020;
    L_0x0075:
        r0 = r18;
        if (r7 <= r0) goto L_0x0020;
    L_0x0079:
        if (r4 <= 0) goto L_0x0020;
    L_0x007b:
        r0 = r17;
        if (r3 == r0) goto L_0x0020;
    L_0x007f:
        r17 = r4;
        goto L_0x0020;
    L_0x0082:
        r1 = 0;
        goto L_0x0026;
    L_0x0084:
        if (r18 < 0) goto L_0x008b;
    L_0x0086:
        r0 = r18;
        if (r7 < r0) goto L_0x008b;
    L_0x008a:
        r4 = r3;
    L_0x008b:
        r2 = r7 + 1;
        if (r8 == 0) goto L_0x0094;
    L_0x008f:
        r17 = r3;
        goto L_0x0020;
    L_0x0092:
        r2 = r6;
        goto L_0x003b;
    L_0x0094:
        r7 = r2;
        goto L_0x002f;
    L_0x0096:
        r2 = r3;
        goto L_0x006a;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ListViewCompat.measureHeightOfChildrenCompat(int, int, int, int, int):int");
    }

    protected void positionSelectorLikeFocusCompat(int i, View view) {
        boolean z;
        boolean z2 = true;
        Drawable selector = getSelector();
        if (selector == null || i == -1) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            selector.setVisible(false, false);
        }
        positionSelectorCompat(i, view);
        if (z) {
            Rect rect = this.mSelectorRect;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z2 = false;
            }
            selector.setVisible(z2, false);
            DrawableCompat.setHotspot(selector, exactCenterX, exactCenterY);
        }
    }

    public void setSelector(Drawable drawable) {
        GateKeeperDrawable gateKeeperDrawable;
        if (drawable != null) {
            gateKeeperDrawable = new GateKeeperDrawable(drawable);
        } else {
            gateKeeperDrawable = null;
        }
        this.mSelector = gateKeeperDrawable;
        super.setSelector(this.mSelector);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.mSelectionLeftPadding = rect.left;
        this.mSelectionTopPadding = rect.top;
        this.mSelectionRightPadding = rect.right;
        this.mSelectionBottomPadding = rect.bottom;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case v.m /*0*/:
                this.mMotionPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    protected boolean shouldShowSelectorCompat() {
        return touchModeDrawsInPressedStateCompat() && isPressed();
    }

    protected void updateSelectorStateCompat() {
        Drawable selector = getSelector();
        if (selector != null && shouldShowSelectorCompat()) {
            selector.setState(getDrawableState());
        }
    }

    protected void drawSelectorCompat(Canvas canvas) {
        if (!this.mSelectorRect.isEmpty()) {
            Drawable selector = getSelector();
            if (selector != null) {
                selector.setBounds(this.mSelectorRect);
                selector.draw(canvas);
            }
        }
    }

    protected void positionSelectorCompat(int i, View view) {
        Rect rect = this.mSelectorRect;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.mSelectionLeftPadding;
        rect.top -= this.mSelectionTopPadding;
        rect.right += this.mSelectionRightPadding;
        rect.bottom += this.mSelectionBottomPadding;
        try {
            boolean z = this.mIsChildViewEnabled.getBoolean(this);
            try {
                if (view.isEnabled() != z) {
                    Field field = this.mIsChildViewEnabled;
                    if (z) {
                        z = false;
                    } else {
                        z = true;
                    }
                    field.set(this, Boolean.valueOf(z));
                    if (i != -1) {
                        refreshDrawableState();
                    }
                }
            } catch (IllegalAccessException e) {
                throw e;
            } catch (IllegalAccessException e2) {
                throw e2;
            }
        } catch (IllegalAccessException e22) {
            throw e22;
        } catch (IllegalAccessException e222) {
            e222.printStackTrace();
        }
    }

    protected void setSelectorEnabled(boolean z) {
        if (this.mSelector != null) {
            this.mSelector.setEnabled(z);
        }
    }

    protected void positionSelectorLikeTouchCompat(int i, View view, float f, float f2) {
        positionSelectorLikeFocusCompat(i, view);
        Drawable selector = getSelector();
        if (selector != null && i != -1) {
            DrawableCompat.setHotspot(selector, f, f2);
        }
    }
}
