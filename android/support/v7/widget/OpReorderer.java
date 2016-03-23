package android.support.v7.widget;

import android.support.v7.widget.RecyclerView.ViewHolder;
import java.util.List;
import org.whispersystems.at;

class OpReorderer {
    final Callback mCallback;

    interface Callback {
        UpdateOp obtainUpdateOp(int i, int i2, int i3, Object obj);

        void recycleUpdateOp(UpdateOp updateOp);
    }

    void reorderOps(List list) {
        int i = ViewHolder.a;
        do {
            int lastMoveOutOfOrder = getLastMoveOutOfOrder(list);
            if (lastMoveOutOfOrder != -1) {
                swapMoveOp(list, lastMoveOutOfOrder, lastMoveOutOfOrder + 1);
            } else {
                return;
            }
        } while (i == 0);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void swapMoveRemove(java.util.List r10, int r11, android.support.v7.widget.AdapterHelper.UpdateOp r12, int r13, android.support.v7.widget.AdapterHelper.UpdateOp r14) {
        /*
        r9 = this;
        r3 = 0;
        r8 = 2;
        r0 = 0;
        r1 = 1;
        r4 = android.support.v7.widget.RecyclerView.ViewHolder.a;
        r2 = r12.positionStart;
        r5 = r12.itemCount;
        if (r2 >= r5) goto L_0x001e;
    L_0x000c:
        r2 = r14.positionStart;
        r5 = r12.positionStart;
        if (r2 != r5) goto L_0x012f;
    L_0x0012:
        r2 = r14.itemCount;
        r5 = r12.itemCount;
        r6 = r12.positionStart;
        r5 = r5 - r6;
        if (r2 != r5) goto L_0x012f;
    L_0x001b:
        if (r4 == 0) goto L_0x012c;
    L_0x001d:
        r0 = r1;
    L_0x001e:
        r2 = r14.positionStart;
        r5 = r12.itemCount;
        r5 = r5 + 1;
        if (r2 != r5) goto L_0x0128;
    L_0x0026:
        r2 = r14.itemCount;
        r5 = r12.positionStart;
        r6 = r12.itemCount;
        r5 = r5 - r6;
        if (r2 != r5) goto L_0x0128;
    L_0x002f:
        r0 = r1;
        r2 = r1;
    L_0x0031:
        r5 = r12.itemCount;
        r6 = r14.positionStart;
        if (r5 >= r6) goto L_0x003f;
    L_0x0037:
        r5 = r14.positionStart;
        r5 = r5 + -1;
        r14.positionStart = r5;
        if (r4 == 0) goto L_0x005f;
    L_0x003f:
        r5 = r12.itemCount;
        r6 = r14.positionStart;
        r7 = r14.itemCount;
        r6 = r6 + r7;
        if (r5 >= r6) goto L_0x005f;
    L_0x0048:
        r0 = r14.itemCount;
        r0 = r0 + -1;
        r14.itemCount = r0;
        r12.cmd = r8;
        r12.itemCount = r1;
        r0 = r14.itemCount;
        if (r0 != 0) goto L_0x005e;
    L_0x0056:
        r10.remove(r13);
        r0 = r9.mCallback;
        r0.recycleUpdateOp(r14);
    L_0x005e:
        return;
    L_0x005f:
        r1 = r12.positionStart;
        r5 = r14.positionStart;
        if (r1 > r5) goto L_0x006d;
    L_0x0065:
        r1 = r14.positionStart;
        r1 = r1 + 1;
        r14.positionStart = r1;
        if (r4 == 0) goto L_0x0125;
    L_0x006d:
        r1 = r12.positionStart;
        r5 = r14.positionStart;
        r6 = r14.itemCount;
        r5 = r5 + r6;
        if (r1 >= r5) goto L_0x0125;
    L_0x0076:
        r1 = r14.positionStart;
        r5 = r14.itemCount;
        r1 = r1 + r5;
        r5 = r12.positionStart;
        r1 = r1 - r5;
        r5 = r9.mCallback;
        r6 = r12.positionStart;
        r6 = r6 + 1;
        r1 = r5.obtainUpdateOp(r8, r6, r1, r3);
        r3 = r12.positionStart;
        r5 = r14.positionStart;
        r3 = r3 - r5;
        r14.itemCount = r3;
    L_0x008f:
        if (r2 == 0) goto L_0x009d;
    L_0x0091:
        r10.set(r11, r14);
        r10.remove(r13);
        r0 = r9.mCallback;
        r0.recycleUpdateOp(r12);
        goto L_0x005e;
    L_0x009d:
        if (r0 == 0) goto L_0x00d7;
    L_0x009f:
        if (r1 == 0) goto L_0x00bb;
    L_0x00a1:
        r0 = r12.positionStart;
        r2 = r1.positionStart;
        if (r0 <= r2) goto L_0x00ae;
    L_0x00a7:
        r0 = r12.positionStart;
        r2 = r1.itemCount;
        r0 = r0 - r2;
        r12.positionStart = r0;
    L_0x00ae:
        r0 = r12.itemCount;
        r2 = r1.positionStart;
        if (r0 <= r2) goto L_0x00bb;
    L_0x00b4:
        r0 = r12.itemCount;
        r2 = r1.itemCount;
        r0 = r0 - r2;
        r12.itemCount = r0;
    L_0x00bb:
        r0 = r12.positionStart;
        r2 = r14.positionStart;
        if (r0 <= r2) goto L_0x00c8;
    L_0x00c1:
        r0 = r12.positionStart;
        r2 = r14.itemCount;
        r0 = r0 - r2;
        r12.positionStart = r0;
    L_0x00c8:
        r0 = r12.itemCount;
        r2 = r14.positionStart;
        if (r0 <= r2) goto L_0x010d;
    L_0x00ce:
        r0 = r12.itemCount;
        r2 = r14.itemCount;
        r0 = r0 - r2;
        r12.itemCount = r0;
        if (r4 == 0) goto L_0x010d;
    L_0x00d7:
        if (r1 == 0) goto L_0x00f3;
    L_0x00d9:
        r0 = r12.positionStart;
        r2 = r1.positionStart;
        if (r0 < r2) goto L_0x00e6;
    L_0x00df:
        r0 = r12.positionStart;
        r2 = r1.itemCount;
        r0 = r0 - r2;
        r12.positionStart = r0;
    L_0x00e6:
        r0 = r12.itemCount;
        r2 = r1.positionStart;
        if (r0 < r2) goto L_0x00f3;
    L_0x00ec:
        r0 = r12.itemCount;
        r2 = r1.itemCount;
        r0 = r0 - r2;
        r12.itemCount = r0;
    L_0x00f3:
        r0 = r12.positionStart;
        r2 = r14.positionStart;
        if (r0 < r2) goto L_0x0100;
    L_0x00f9:
        r0 = r12.positionStart;
        r2 = r14.itemCount;
        r0 = r0 - r2;
        r12.positionStart = r0;
    L_0x0100:
        r0 = r12.itemCount;
        r2 = r14.positionStart;
        if (r0 < r2) goto L_0x010d;
    L_0x0106:
        r0 = r12.itemCount;
        r2 = r14.itemCount;
        r0 = r0 - r2;
        r12.itemCount = r0;
    L_0x010d:
        r10.set(r11, r14);
        r0 = r12.positionStart;
        r2 = r12.itemCount;
        if (r0 == r2) goto L_0x011b;
    L_0x0116:
        r10.set(r13, r12);
        if (r4 == 0) goto L_0x011e;
    L_0x011b:
        r10.remove(r13);
    L_0x011e:
        if (r1 == 0) goto L_0x005e;
    L_0x0120:
        r10.add(r11, r1);
        goto L_0x005e;
    L_0x0125:
        r1 = r3;
        goto L_0x008f;
    L_0x0128:
        r2 = r0;
        r0 = r1;
        goto L_0x0031;
    L_0x012c:
        r2 = r1;
        goto L_0x0031;
    L_0x012f:
        r2 = r0;
        goto L_0x0031;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.OpReorderer.swapMoveRemove(java.util.List, int, android.support.v7.widget.AdapterHelper$UpdateOp, int, android.support.v7.widget.AdapterHelper$UpdateOp):void");
    }

    private int getLastMoveOutOfOrder(List list) {
        int i = ViewHolder.a;
        Object obj = null;
        int size = list.size() - 1;
        while (size >= 0) {
            Object obj2;
            if (((UpdateOp) list.get(size)).cmd != 8) {
                obj2 = 1;
            } else if (obj != null) {
                return size;
            } else {
                obj2 = obj;
            }
            size--;
            if (i != 0) {
                break;
            }
            obj = obj2;
        }
        return -1;
    }

    public OpReorderer(Callback callback) {
        this.mCallback = callback;
    }

    private void swapMoveAdd(List list, int i, UpdateOp updateOp, int i2, UpdateOp updateOp2) {
        int i3 = 0;
        if (updateOp.itemCount < updateOp2.positionStart) {
            i3 = -1;
        }
        if (updateOp.positionStart < updateOp2.positionStart) {
            i3++;
        }
        if (updateOp2.positionStart <= updateOp.positionStart) {
            updateOp.positionStart += updateOp2.itemCount;
        }
        if (updateOp2.positionStart <= updateOp.itemCount) {
            updateOp.itemCount += updateOp2.itemCount;
        }
        updateOp2.positionStart = i3 + updateOp2.positionStart;
        list.set(i, updateOp2);
        list.set(i2, updateOp);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void swapMoveUpdate(java.util.List r8, int r9, android.support.v7.widget.AdapterHelper.UpdateOp r10, int r11, android.support.v7.widget.AdapterHelper.UpdateOp r12) {
        /*
        r7 = this;
        r1 = 0;
        r6 = 4;
        r2 = android.support.v7.widget.RecyclerView.ViewHolder.a;
        r0 = r10.itemCount;
        r3 = r12.positionStart;
        if (r0 >= r3) goto L_0x0012;
    L_0x000a:
        r0 = r12.positionStart;
        r0 = r0 + -1;
        r12.positionStart = r0;
        if (r2 == 0) goto L_0x007d;
    L_0x0012:
        r0 = r10.itemCount;
        r3 = r12.positionStart;
        r4 = r12.itemCount;
        r3 = r3 + r4;
        if (r0 >= r3) goto L_0x007d;
    L_0x001b:
        r0 = r12.itemCount;
        r0 = r0 + -1;
        r12.itemCount = r0;
        r0 = r7.mCallback;
        r3 = r10.positionStart;
        r4 = 1;
        r5 = r12.payload;
        r0 = r0.obtainUpdateOp(r6, r3, r4, r5);
    L_0x002c:
        r3 = r10.positionStart;
        r4 = r12.positionStart;
        if (r3 > r4) goto L_0x003a;
    L_0x0032:
        r3 = r12.positionStart;
        r3 = r3 + 1;
        r12.positionStart = r3;
        if (r2 == 0) goto L_0x005e;
    L_0x003a:
        r3 = r10.positionStart;
        r4 = r12.positionStart;
        r5 = r12.itemCount;
        r4 = r4 + r5;
        if (r3 >= r4) goto L_0x005e;
    L_0x0043:
        r1 = r12.positionStart;
        r3 = r12.itemCount;
        r1 = r1 + r3;
        r3 = r10.positionStart;
        r3 = r1 - r3;
        r1 = r7.mCallback;
        r4 = r10.positionStart;
        r4 = r4 + 1;
        r5 = r12.payload;
        r1 = r1.obtainUpdateOp(r6, r4, r3, r5);
        r4 = r12.itemCount;
        r3 = r4 - r3;
        r12.itemCount = r3;
    L_0x005e:
        r8.set(r11, r10);
        r3 = r12.itemCount;
        if (r3 <= 0) goto L_0x006a;
    L_0x0065:
        r8.set(r9, r12);
        if (r2 == 0) goto L_0x0072;
    L_0x006a:
        r8.remove(r9);
        r2 = r7.mCallback;
        r2.recycleUpdateOp(r12);
    L_0x0072:
        if (r0 == 0) goto L_0x0077;
    L_0x0074:
        r8.add(r9, r0);
    L_0x0077:
        if (r1 == 0) goto L_0x007c;
    L_0x0079:
        r8.add(r9, r1);
    L_0x007c:
        return;
    L_0x007d:
        r0 = r1;
        goto L_0x002c;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.OpReorderer.swapMoveUpdate(java.util.List, int, android.support.v7.widget.AdapterHelper$UpdateOp, int, android.support.v7.widget.AdapterHelper$UpdateOp):void");
    }

    private void swapMoveOp(List list, int i, int i2) {
        int i3 = ViewHolder.a;
        UpdateOp updateOp = (UpdateOp) list.get(i);
        UpdateOp updateOp2 = (UpdateOp) list.get(i2);
        switch (updateOp2.cmd) {
            case at.g /*1*/:
                break;
            case at.i /*2*/:
                swapMoveRemove(list, i, updateOp, i2, updateOp2);
                if (i3 == 0) {
                    return;
                }
                break;
            case at.p /*4*/:
                break;
            default:
                return;
        }
        swapMoveAdd(list, i, updateOp, i2, updateOp2);
        if (i3 == 0) {
            return;
        }
        swapMoveUpdate(list, i, updateOp, i2, updateOp2);
    }
}
