package android.support.v7.widget;

import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.view.View;
import org.v;
import org.whispersystems.at;

public abstract class OrientationHelper {
    private static final String z;
    private int mLastTotalSpace;
    protected final LayoutManager mLayoutManager;

    final class 1 extends OrientationHelper {
        public int getDecoratedMeasurement(View view) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            return layoutParams.rightMargin + (this.mLayoutManager.getDecoratedMeasuredWidth(view) + layoutParams.leftMargin);
        }

        public int getEndAfterPadding() {
            return this.mLayoutManager.getWidth() - this.mLayoutManager.getPaddingRight();
        }

        public int getDecoratedMeasurementInOther(View view) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            return layoutParams.bottomMargin + (this.mLayoutManager.getDecoratedMeasuredHeight(view) + layoutParams.topMargin);
        }

        public int getStartAfterPadding() {
            return this.mLayoutManager.getPaddingLeft();
        }

        public void offsetChildren(int i) {
            this.mLayoutManager.offsetChildrenHorizontal(i);
        }

        public int getDecoratedEnd(View view) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            return layoutParams.rightMargin + this.mLayoutManager.getDecoratedRight(view);
        }

        public int getDecoratedStart(View view) {
            return this.mLayoutManager.getDecoratedLeft(view) - ((LayoutParams) view.getLayoutParams()).leftMargin;
        }

        public int getEnd() {
            return this.mLayoutManager.getWidth();
        }

        public int getTotalSpace() {
            return (this.mLayoutManager.getWidth() - this.mLayoutManager.getPaddingLeft()) - this.mLayoutManager.getPaddingRight();
        }

        1(LayoutManager layoutManager) {
            super(layoutManager, null);
        }

        public int getEndPadding() {
            return this.mLayoutManager.getPaddingRight();
        }
    }

    final class 2 extends OrientationHelper {
        public int getDecoratedStart(View view) {
            return this.mLayoutManager.getDecoratedTop(view) - ((LayoutParams) view.getLayoutParams()).topMargin;
        }

        public void offsetChildren(int i) {
            this.mLayoutManager.offsetChildrenVertical(i);
        }

        2(LayoutManager layoutManager) {
            super(layoutManager, null);
        }

        public int getDecoratedEnd(View view) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            return layoutParams.bottomMargin + this.mLayoutManager.getDecoratedBottom(view);
        }

        public int getEndAfterPadding() {
            return this.mLayoutManager.getHeight() - this.mLayoutManager.getPaddingBottom();
        }

        public int getEndPadding() {
            return this.mLayoutManager.getPaddingBottom();
        }

        public int getEnd() {
            return this.mLayoutManager.getHeight();
        }

        public int getDecoratedMeasurementInOther(View view) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            return layoutParams.rightMargin + (this.mLayoutManager.getDecoratedMeasuredWidth(view) + layoutParams.leftMargin);
        }

        public int getTotalSpace() {
            return (this.mLayoutManager.getHeight() - this.mLayoutManager.getPaddingTop()) - this.mLayoutManager.getPaddingBottom();
        }

        public int getStartAfterPadding() {
            return this.mLayoutManager.getPaddingTop();
        }

        public int getDecoratedMeasurement(View view) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            return layoutParams.bottomMargin + (this.mLayoutManager.getDecoratedMeasuredHeight(view) + layoutParams.topMargin);
        }
    }

    static {
        char[] toCharArray = "u}5ZduwcTzuv-Oihz,U".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 28;
                    break;
                case at.g /*1*/:
                    i2 = 19;
                    break;
                case at.i /*2*/:
                    i2 = 67;
                    break;
                case at.o /*3*/:
                    i2 = 59;
                    break;
                default:
                    i2 = 8;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public abstract int getDecoratedEnd(View view);

    public abstract int getDecoratedMeasurement(View view);

    public abstract int getDecoratedMeasurementInOther(View view);

    public abstract int getDecoratedStart(View view);

    public abstract int getEnd();

    public abstract int getEndAfterPadding();

    public abstract int getEndPadding();

    public abstract int getStartAfterPadding();

    public abstract int getTotalSpace();

    public abstract void offsetChildren(int i);

    OrientationHelper(LayoutManager layoutManager, 1 1) {
        this(layoutManager);
    }

    public static OrientationHelper createVerticalHelper(LayoutManager layoutManager) {
        return new 2(layoutManager);
    }

    private OrientationHelper(LayoutManager layoutManager) {
        this.mLastTotalSpace = Integer.MIN_VALUE;
        this.mLayoutManager = layoutManager;
    }

    public void onLayoutComplete() {
        this.mLastTotalSpace = getTotalSpace();
    }

    public static OrientationHelper createHorizontalHelper(LayoutManager layoutManager) {
        return new 1(layoutManager);
    }

    public int getTotalSpaceChange() {
        try {
            return Integer.MIN_VALUE == this.mLastTotalSpace ? 0 : getTotalSpace() - this.mLastTotalSpace;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public static OrientationHelper createOrientationHelper(LayoutManager layoutManager, int i) {
        switch (i) {
            case v.m /*0*/:
                try {
                    return createHorizontalHelper(layoutManager);
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            case at.g /*1*/:
                return createVerticalHelper(layoutManager);
            default:
                throw new IllegalArgumentException(z);
        }
    }
}
