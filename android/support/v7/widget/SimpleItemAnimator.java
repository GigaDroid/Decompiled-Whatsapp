package android.support.v7.widget;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.support.v7.widget.RecyclerView.ItemAnimator.ItemHolderInfo;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;

public abstract class SimpleItemAnimator extends ItemAnimator {
    boolean mSupportsChangeAnimations;

    public abstract boolean animateAdd(ViewHolder viewHolder);

    public abstract boolean animateChange(ViewHolder viewHolder, ViewHolder viewHolder2, int i, int i2, int i3, int i4);

    public abstract boolean animateMove(ViewHolder viewHolder, int i, int i2, int i3, int i4);

    public abstract boolean animateRemove(ViewHolder viewHolder);

    public SimpleItemAnimator() {
        this.mSupportsChangeAnimations = true;
    }

    public void onChangeFinished(ViewHolder viewHolder, boolean z) {
    }

    public final void dispatchAddStarting(ViewHolder viewHolder) {
        onAddStarting(viewHolder);
    }

    public final void dispatchRemoveStarting(ViewHolder viewHolder) {
        onRemoveStarting(viewHolder);
    }

    public boolean animateDisappearance(@NonNull ViewHolder viewHolder, @NonNull ItemHolderInfo itemHolderInfo, @Nullable ItemHolderInfo itemHolderInfo2) {
        int left;
        int top;
        int i = itemHolderInfo.left;
        int i2 = itemHolderInfo.top;
        View view = viewHolder.itemView;
        if (itemHolderInfo2 == null) {
            left = view.getLeft();
        } else {
            left = itemHolderInfo2.left;
        }
        if (itemHolderInfo2 == null) {
            top = view.getTop();
        } else {
            top = itemHolderInfo2.top;
        }
        if (viewHolder.isRemoved() || (i == left && i2 == top)) {
            return animateRemove(viewHolder);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return animateMove(viewHolder, i, i2, left, top);
    }

    public final void dispatchMoveFinished(ViewHolder viewHolder) {
        onMoveFinished(viewHolder);
        dispatchAnimationFinished(viewHolder);
    }

    public boolean canReuseUpdatedViewHolder(ViewHolder viewHolder) {
        return !this.mSupportsChangeAnimations || viewHolder.isInvalid();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean animateChange(@android.support.annotation.NonNull android.support.v7.widget.RecyclerView.ViewHolder r8, @android.support.annotation.NonNull android.support.v7.widget.RecyclerView.ViewHolder r9, @android.support.annotation.NonNull android.support.v7.widget.RecyclerView.ItemAnimator.ItemHolderInfo r10, @android.support.annotation.NonNull android.support.v7.widget.RecyclerView.ItemAnimator.ItemHolderInfo r11) {
        /*
        r7 = this;
        r3 = r10.left;
        r4 = r10.top;
        r0 = r9.shouldIgnore();
        if (r0 == 0) goto L_0x0012;
    L_0x000a:
        r5 = r10.left;
        r6 = r10.top;
        r0 = android.support.v7.widget.RecyclerView.ViewHolder.a;
        if (r0 == 0) goto L_0x0016;
    L_0x0012:
        r5 = r11.left;
        r6 = r11.top;
    L_0x0016:
        r0 = r7;
        r1 = r8;
        r2 = r9;
        r0 = r0.animateChange(r1, r2, r3, r4, r5, r6);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SimpleItemAnimator.animateChange(android.support.v7.widget.RecyclerView$ViewHolder, android.support.v7.widget.RecyclerView$ViewHolder, android.support.v7.widget.RecyclerView$ItemAnimator$ItemHolderInfo, android.support.v7.widget.RecyclerView$ItemAnimator$ItemHolderInfo):boolean");
    }

    public boolean animateAppearance(@NonNull ViewHolder viewHolder, @Nullable ItemHolderInfo itemHolderInfo, @NonNull ItemHolderInfo itemHolderInfo2) {
        if (itemHolderInfo == null || (itemHolderInfo.left == itemHolderInfo2.left && itemHolderInfo.top == itemHolderInfo2.top)) {
            return animateAdd(viewHolder);
        }
        return animateMove(viewHolder, itemHolderInfo.left, itemHolderInfo.top, itemHolderInfo2.left, itemHolderInfo2.top);
    }

    public void onAddStarting(ViewHolder viewHolder) {
    }

    public final void dispatchRemoveFinished(ViewHolder viewHolder) {
        onRemoveFinished(viewHolder);
        dispatchAnimationFinished(viewHolder);
    }

    public void onChangeStarting(ViewHolder viewHolder, boolean z) {
    }

    public boolean animatePersistence(@NonNull ViewHolder viewHolder, @NonNull ItemHolderInfo itemHolderInfo, @NonNull ItemHolderInfo itemHolderInfo2) {
        if (itemHolderInfo.left == itemHolderInfo2.left && itemHolderInfo.top == itemHolderInfo2.top) {
            dispatchMoveFinished(viewHolder);
            return false;
        }
        return animateMove(viewHolder, itemHolderInfo.left, itemHolderInfo.top, itemHolderInfo2.left, itemHolderInfo2.top);
    }

    public final void dispatchChangeStarting(ViewHolder viewHolder, boolean z) {
        onChangeStarting(viewHolder, z);
    }

    public final void dispatchMoveStarting(ViewHolder viewHolder) {
        onMoveStarting(viewHolder);
    }

    public void onMoveStarting(ViewHolder viewHolder) {
    }

    public final void dispatchAddFinished(ViewHolder viewHolder) {
        onAddFinished(viewHolder);
        dispatchAnimationFinished(viewHolder);
    }

    public void onRemoveFinished(ViewHolder viewHolder) {
    }

    public final void dispatchChangeFinished(ViewHolder viewHolder, boolean z) {
        onChangeFinished(viewHolder, z);
        dispatchAnimationFinished(viewHolder);
    }

    public void onAddFinished(ViewHolder viewHolder) {
    }

    public void onMoveFinished(ViewHolder viewHolder) {
    }

    public void onRemoveStarting(ViewHolder viewHolder) {
    }
}
