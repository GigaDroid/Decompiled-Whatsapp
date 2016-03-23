package android.support.v7.widget;

class RtlSpacingHelper {
    private int mEnd;
    private int mExplicitLeft;
    private int mExplicitRight;
    private boolean mIsRelative;
    private boolean mIsRtl;
    private int mLeft;
    private int mRight;
    private int mStart;

    public void setDirection(boolean z) {
        boolean z2 = LinearLayoutCompat.a;
        if (z != this.mIsRtl) {
            this.mIsRtl = z;
            if (this.mIsRelative) {
                int i;
                if (z) {
                    if (this.mEnd != Integer.MIN_VALUE) {
                        i = this.mEnd;
                    } else {
                        i = this.mExplicitLeft;
                    }
                    this.mLeft = i;
                    this.mRight = this.mStart != Integer.MIN_VALUE ? this.mStart : this.mExplicitRight;
                    if (!z2) {
                        return;
                    }
                }
                if (this.mStart != Integer.MIN_VALUE) {
                    i = this.mStart;
                } else {
                    i = this.mExplicitLeft;
                }
                this.mLeft = i;
                this.mRight = this.mEnd != Integer.MIN_VALUE ? this.mEnd : this.mExplicitRight;
                if (!z2) {
                    return;
                }
            }
            this.mLeft = this.mExplicitLeft;
            this.mRight = this.mExplicitRight;
        }
    }

    public int getRight() {
        return this.mRight;
    }

    public void setAbsolute(int i, int i2) {
        this.mIsRelative = false;
        if (i != Integer.MIN_VALUE) {
            this.mExplicitLeft = i;
            this.mLeft = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.mExplicitRight = i2;
            this.mRight = i2;
        }
    }

    public int getLeft() {
        return this.mLeft;
    }

    public void setRelative(int i, int i2) {
        this.mStart = i;
        this.mEnd = i2;
        this.mIsRelative = true;
        if (this.mIsRtl) {
            if (i2 != Integer.MIN_VALUE) {
                this.mLeft = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.mRight = i;
                if (!LinearLayoutCompat.a) {
                    return;
                }
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.mLeft = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.mRight = i2;
        }
    }

    public int getStart() {
        return this.mIsRtl ? this.mRight : this.mLeft;
    }

    RtlSpacingHelper() {
        this.mLeft = 0;
        this.mRight = 0;
        this.mStart = Integer.MIN_VALUE;
        this.mEnd = Integer.MIN_VALUE;
        this.mExplicitLeft = 0;
        this.mExplicitRight = 0;
        this.mIsRtl = false;
        this.mIsRelative = false;
    }

    public int getEnd() {
        return this.mIsRtl ? this.mLeft : this.mRight;
    }
}
