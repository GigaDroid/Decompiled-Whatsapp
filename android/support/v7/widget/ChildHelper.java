package android.support.v7.widget;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import java.util.List;
import org.v;
import org.whispersystems.at;

class ChildHelper {
    private static final String[] z;
    final Bucket mBucket;
    final Callback mCallback;
    final List mHiddenViews;

    class Bucket {
        private static final String z;
        long mData;
        Bucket next;

        static {
            char[] toCharArray = "7E".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 79;
                        break;
                    case at.g /*1*/:
                        i2 = 61;
                        break;
                    case at.i /*2*/:
                        i2 = 82;
                        break;
                    case at.o /*3*/:
                        i2 = 1;
                        break;
                    default:
                        i2 = 31;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        boolean remove(int i) {
            if (i >= 64) {
                ensureNext();
                return this.next.remove(i - 64);
            }
            boolean z;
            long j = 1 << i;
            if ((this.mData & j) != 0) {
                z = true;
            } else {
                z = false;
            }
            this.mData &= j ^ -1;
            j--;
            this.mData = Long.rotateRight((j ^ -1) & this.mData, 1) | (this.mData & j);
            if (this.next == null) {
                return z;
            }
            if (this.next.get(0)) {
                set(63);
            }
            this.next.remove(0);
            return z;
        }

        void set(int i) {
            if (i >= 64) {
                ensureNext();
                this.next.set(i - 64);
                if (ViewHolder.a == 0) {
                    return;
                }
            }
            this.mData |= 1 << i;
        }

        void clear(int i) {
            if (i >= 64) {
                if (this.next != null) {
                    this.next.clear(i - 64);
                    if (ViewHolder.a == 0) {
                        return;
                    }
                }
                return;
            }
            this.mData &= (1 << i) ^ -1;
        }

        Bucket() {
            this.mData = 0;
        }

        void reset() {
            this.mData = 0;
            if (this.next != null) {
                this.next.reset();
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        void insert(int r13, boolean r14) {
            /*
            r12 = this;
            r8 = 1;
            r1 = 1;
            r2 = 0;
            r3 = android.support.v7.widget.RecyclerView.ViewHolder.a;
            r0 = 64;
            if (r13 < r0) goto L_0x0016;
        L_0x000a:
            r12.ensureNext();
            r0 = r12.next;
            r4 = r13 + -64;
            r0.insert(r4, r14);
            if (r3 == 0) goto L_0x004a;
        L_0x0016:
            r4 = r12.mData;
            r6 = -9223372036854775808;
            r4 = r4 & r6;
            r6 = 0;
            r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
            if (r0 == 0) goto L_0x004b;
        L_0x0021:
            r0 = r1;
        L_0x0022:
            r4 = r8 << r13;
            r4 = r4 - r8;
            r6 = r12.mData;
            r6 = r6 & r4;
            r8 = r12.mData;
            r10 = -1;
            r4 = r4 ^ r10;
            r4 = r4 & r8;
            r4 = r4 << r1;
            r4 = r4 | r6;
            r12.mData = r4;
            if (r14 == 0) goto L_0x0039;
        L_0x0034:
            r12.set(r13);
            if (r3 == 0) goto L_0x003c;
        L_0x0039:
            r12.clear(r13);
        L_0x003c:
            if (r0 != 0) goto L_0x0042;
        L_0x003e:
            r1 = r12.next;
            if (r1 == 0) goto L_0x004a;
        L_0x0042:
            r12.ensureNext();
            r1 = r12.next;
            r1.insert(r2, r0);
        L_0x004a:
            return;
        L_0x004b:
            r0 = r2;
            goto L_0x0022;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ChildHelper.Bucket.insert(int, boolean):void");
        }

        boolean get(int i) {
            if (i < 64) {
                return (this.mData & (1 << i)) != 0;
            } else {
                ensureNext();
                return this.next.get(i - 64);
            }
        }

        private void ensureNext() {
            if (this.next == null) {
                this.next = new Bucket();
            }
        }

        int countOnesBefore(int i) {
            return this.next == null ? i >= 64 ? Long.bitCount(this.mData) : Long.bitCount(this.mData & ((1 << i) - 1)) : i < 64 ? Long.bitCount(this.mData & ((1 << i) - 1)) : this.next.countOnesBefore(i - 64) + Long.bitCount(this.mData);
        }

        public String toString() {
            return this.next == null ? Long.toBinaryString(this.mData) : this.next.toString() + z + Long.toBinaryString(this.mData);
        }
    }

    interface Callback {
        void addView(View view, int i);

        void attachViewToParent(View view, int i, LayoutParams layoutParams);

        void detachViewFromParent(int i);

        View getChildAt(int i);

        int getChildCount();

        ViewHolder getChildViewHolder(View view);

        int indexOfChild(View view);

        void onEnteredHiddenState(View view);

        void onLeftHiddenState(View view);

        void removeAllViews();

        void removeViewAt(int i);
    }

    static {
        String[] strArr = new String[4];
        String str = "3iE\u0006s ;H\u0000=2uT\u0006y\";]Ok.~KOi/zHOj&h\u001c\u0001r3;T\u0006y#~R";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = 71;
                        break;
                    case at.g /*1*/:
                        i3 = 27;
                        break;
                    case at.i /*2*/:
                        i3 = 60;
                        break;
                    case at.o /*3*/:
                        i3 = 111;
                        break;
                    default:
                        i3 = 29;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "k;T\u0006y#~ROq.hHU";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "1rY\u0018=.h\u001c\u0001r3;]O~/rP\u000b1gx]\u0001s(o\u001c\u0007t#~\u001c";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "1rY\u0018=.h\u001c\u0001r3;]O~/rP\u000b1gx]\u0001s(o\u001c\u0007t#~\u001c";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    void removeView(View view) {
        int indexOfChild = this.mCallback.indexOfChild(view);
        if (indexOfChild >= 0) {
            try {
                if (this.mBucket.remove(indexOfChild)) {
                    unhideViewInternal(view);
                }
                this.mCallback.removeViewAt(indexOfChild);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    private void hideViewInternal(View view) {
        this.mHiddenViews.add(view);
        this.mCallback.onEnteredHiddenState(view);
    }

    View findHiddenNonRemovedView(int i, int i2) {
        int i3 = ViewHolder.a;
        int size = this.mHiddenViews.size();
        int i4 = 0;
        while (i4 < size) {
            View view = (View) this.mHiddenViews.get(i4);
            ViewHolder childViewHolder = this.mCallback.getChildViewHolder(view);
            try {
                if (childViewHolder.getLayoutPosition() == i) {
                    if (!childViewHolder.isInvalid()) {
                        try {
                            if (!childViewHolder.isRemoved()) {
                                if (i2 == -1) {
                                    return view;
                                }
                                try {
                                    if (childViewHolder.getItemViewType() == i2) {
                                        return view;
                                    }
                                } catch (IllegalArgumentException e) {
                                    throw e;
                                }
                            }
                        } catch (IllegalArgumentException e2) {
                            try {
                                throw e2;
                            } catch (IllegalArgumentException e22) {
                                throw e22;
                            }
                        }
                    }
                }
                int i5 = i4 + 1;
                if (i3 != 0) {
                    break;
                }
                i4 = i5;
            } catch (IllegalArgumentException e222) {
                throw e222;
            } catch (IllegalArgumentException e2222) {
                throw e2222;
            }
        }
        return null;
    }

    private int getOffset(int i) {
        int i2 = -1;
        int i3 = ViewHolder.a;
        if (i >= 0) {
            int childCount = this.mCallback.getChildCount();
            int i4 = i;
            while (i4 < childCount) {
                int countOnesBefore = i - (i4 - this.mBucket.countOnesBefore(i4));
                if (countOnesBefore != 0) {
                    i4 += countOnesBefore;
                    if (i3 != 0) {
                        break;
                    }
                }
                i2 = i4;
                do {
                    try {
                        if (!this.mBucket.get(i2)) {
                            break;
                        }
                        i2++;
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                } while (i3 == 0);
            }
        }
        return i2;
    }

    void detachViewFromParent(int i) {
        int offset = getOffset(i);
        this.mBucket.remove(offset);
        this.mCallback.detachViewFromParent(offset);
    }

    void addView(View view, boolean z) {
        addView(view, -1, z);
    }

    View getUnfilteredChildAt(int i) {
        return this.mCallback.getChildAt(i);
    }

    private boolean unhideViewInternal(View view) {
        try {
            if (!this.mHiddenViews.remove(view)) {
                return false;
            }
            this.mCallback.onLeftHiddenState(view);
            return true;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    int getChildCount() {
        return this.mCallback.getChildCount() - this.mHiddenViews.size();
    }

    void unhide(View view) {
        int indexOfChild = this.mCallback.indexOfChild(view);
        if (indexOfChild < 0) {
            try {
                throw new IllegalArgumentException(z[1] + view);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        try {
            if (this.mBucket.get(indexOfChild)) {
                this.mBucket.clear(indexOfChild);
                unhideViewInternal(view);
                return;
            }
            throw new RuntimeException(z[0] + view);
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public String toString() {
        return this.mBucket.toString() + z[2] + this.mHiddenViews.size();
    }

    ChildHelper(Callback callback) {
        this.mCallback = callback;
        this.mBucket = new Bucket();
        this.mHiddenViews = new ArrayList();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void addView(android.view.View r3, int r4, boolean r5) {
        /*
        r2 = this;
        if (r4 >= 0) goto L_0x000c;
    L_0x0002:
        r0 = r2.mCallback;
        r0 = r0.getChildCount();
        r1 = android.support.v7.widget.RecyclerView.ViewHolder.a;
        if (r1 == 0) goto L_0x0010;
    L_0x000c:
        r0 = r2.getOffset(r4);
    L_0x0010:
        r1 = r2.mBucket;	 Catch:{ IllegalArgumentException -> 0x0020 }
        r1.insert(r0, r5);	 Catch:{ IllegalArgumentException -> 0x0020 }
        if (r5 == 0) goto L_0x001a;
    L_0x0017:
        r2.hideViewInternal(r3);	 Catch:{ IllegalArgumentException -> 0x0020 }
    L_0x001a:
        r1 = r2.mCallback;
        r1.addView(r3, r0);
        return;
    L_0x0020:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ChildHelper.addView(android.view.View, int, boolean):void");
    }

    boolean isHidden(View view) {
        return this.mHiddenViews.contains(view);
    }

    void removeAllViewsUnfiltered() {
        int i = ViewHolder.a;
        this.mBucket.reset();
        int size = this.mHiddenViews.size() - 1;
        while (size >= 0) {
            this.mCallback.onLeftHiddenState((View) this.mHiddenViews.get(size));
            this.mHiddenViews.remove(size);
            int i2 = size - 1;
            if (i != 0) {
                break;
            }
            size = i2;
        }
        this.mCallback.removeAllViews();
    }

    int getUnfilteredChildCount() {
        return this.mCallback.getChildCount();
    }

    boolean removeViewIfHidden(View view) {
        int indexOfChild = this.mCallback.indexOfChild(view);
        if (indexOfChild == -1) {
            try {
                return unhideViewInternal(view) ? true : true;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        try {
            if (!this.mBucket.get(indexOfChild)) {
                return false;
            }
            this.mBucket.remove(indexOfChild);
            if (unhideViewInternal(view)) {
                this.mCallback.removeViewAt(indexOfChild);
            } else {
                this.mCallback.removeViewAt(indexOfChild);
            }
            return true;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    void hide(View view) {
        int indexOfChild = this.mCallback.indexOfChild(view);
        if (indexOfChild < 0) {
            try {
                throw new IllegalArgumentException(z[3] + view);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        this.mBucket.set(indexOfChild);
        hideViewInternal(view);
    }

    View getChildAt(int i) {
        return this.mCallback.getChildAt(getOffset(i));
    }

    int indexOfChild(View view) {
        int indexOfChild = this.mCallback.indexOfChild(view);
        if (indexOfChild == -1) {
            return -1;
        }
        try {
            if (this.mBucket.get(indexOfChild)) {
                return -1;
            }
            return indexOfChild - this.mBucket.countOnesBefore(indexOfChild);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    void removeViewAt(int i) {
        int offset = getOffset(i);
        View childAt = this.mCallback.getChildAt(offset);
        if (childAt != null) {
            try {
                if (this.mBucket.remove(offset)) {
                    unhideViewInternal(childAt);
                }
                this.mCallback.removeViewAt(offset);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void attachViewToParent(android.view.View r3, int r4, android.view.ViewGroup.LayoutParams r5, boolean r6) {
        /*
        r2 = this;
        if (r4 >= 0) goto L_0x000c;
    L_0x0002:
        r0 = r2.mCallback;
        r0 = r0.getChildCount();
        r1 = android.support.v7.widget.RecyclerView.ViewHolder.a;
        if (r1 == 0) goto L_0x0010;
    L_0x000c:
        r0 = r2.getOffset(r4);
    L_0x0010:
        r1 = r2.mBucket;	 Catch:{ IllegalArgumentException -> 0x0020 }
        r1.insert(r0, r6);	 Catch:{ IllegalArgumentException -> 0x0020 }
        if (r6 == 0) goto L_0x001a;
    L_0x0017:
        r2.hideViewInternal(r3);	 Catch:{ IllegalArgumentException -> 0x0020 }
    L_0x001a:
        r1 = r2.mCallback;
        r1.attachViewToParent(r3, r0, r5);
        return;
    L_0x0020:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ChildHelper.attachViewToParent(android.view.View, int, android.view.ViewGroup$LayoutParams, boolean):void");
    }
}
