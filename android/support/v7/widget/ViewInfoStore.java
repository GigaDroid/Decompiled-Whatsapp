package android.support.v7.widget;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.ArrayMap;
import android.support.v4.util.LongSparseArray;
import android.support.v4.util.Pools.Pool;
import android.support.v4.util.Pools.SimplePool;
import android.support.v7.widget.RecyclerView.ItemAnimator.ItemHolderInfo;
import android.support.v7.widget.RecyclerView.ViewHolder;

class ViewInfoStore {
    final ArrayMap mLayoutHolderMap;
    final LongSparseArray mOldChangedHolders;

    interface ProcessCallback {
        void processAppeared(ViewHolder viewHolder, @Nullable ItemHolderInfo itemHolderInfo, ItemHolderInfo itemHolderInfo2);

        void processDisappeared(ViewHolder viewHolder, ItemHolderInfo itemHolderInfo, @Nullable ItemHolderInfo itemHolderInfo2);

        void processPersistent(ViewHolder viewHolder, @NonNull ItemHolderInfo itemHolderInfo, @NonNull ItemHolderInfo itemHolderInfo2);

        void unused(ViewHolder viewHolder);
    }

    class InfoRecord {
        static Pool sPool;
        int flags;
        @Nullable
        ItemHolderInfo postInfo;
        @Nullable
        ItemHolderInfo preInfo;

        static InfoRecord obtain() {
            InfoRecord infoRecord = (InfoRecord) sPool.acquire();
            return infoRecord == null ? new InfoRecord() : infoRecord;
        }

        static void recycle(InfoRecord infoRecord) {
            infoRecord.flags = 0;
            infoRecord.preInfo = null;
            infoRecord.postInfo = null;
            sPool.release(infoRecord);
        }

        private InfoRecord() {
        }

        static void drainCache() {
            do {
            } while (sPool.acquire() != null);
        }

        static {
            sPool = new SimplePool(20);
        }
    }

    void removeViewHolder(ViewHolder viewHolder) {
        int i = ViewHolder.a;
        int size = this.mOldChangedHolders.size() - 1;
        while (size >= 0) {
            if (viewHolder == this.mOldChangedHolders.valueAt(size)) {
                this.mOldChangedHolders.removeAt(size);
                if (i == 0) {
                    break;
                }
            }
            size--;
            if (i != 0) {
                break;
            }
        }
        InfoRecord infoRecord = (InfoRecord) this.mLayoutHolderMap.remove(viewHolder);
        if (infoRecord != null) {
            InfoRecord.recycle(infoRecord);
        }
    }

    ViewHolder getFromOldChangeHolders(long j) {
        return (ViewHolder) this.mOldChangedHolders.get(j);
    }

    void addToDisappearedInLayout(ViewHolder viewHolder) {
        InfoRecord infoRecord = (InfoRecord) this.mLayoutHolderMap.get(viewHolder);
        if (infoRecord == null) {
            infoRecord = InfoRecord.obtain();
            this.mLayoutHolderMap.put(viewHolder, infoRecord);
        }
        r0.flags |= 1;
    }

    void addToPostLayout(ViewHolder viewHolder, ItemHolderInfo itemHolderInfo) {
        InfoRecord infoRecord = (InfoRecord) this.mLayoutHolderMap.get(viewHolder);
        if (infoRecord == null) {
            infoRecord = InfoRecord.obtain();
            this.mLayoutHolderMap.put(viewHolder, infoRecord);
        }
        infoRecord.postInfo = itemHolderInfo;
        infoRecord.flags |= 8;
    }

    @Nullable
    ItemHolderInfo popFromPreLayout(ViewHolder viewHolder) {
        int indexOfKey = this.mLayoutHolderMap.indexOfKey(viewHolder);
        if (indexOfKey < 0) {
            return null;
        }
        InfoRecord infoRecord = (InfoRecord) this.mLayoutHolderMap.valueAt(indexOfKey);
        if (infoRecord == null || (infoRecord.flags & 4) == 0) {
            return null;
        }
        infoRecord.flags &= -5;
        ItemHolderInfo itemHolderInfo = infoRecord.preInfo;
        if (infoRecord.flags == 0) {
            this.mLayoutHolderMap.removeAt(indexOfKey);
            InfoRecord.recycle(infoRecord);
        }
        return itemHolderInfo;
    }

    void addToPreLayout(ViewHolder viewHolder, ItemHolderInfo itemHolderInfo) {
        InfoRecord infoRecord = (InfoRecord) this.mLayoutHolderMap.get(viewHolder);
        if (infoRecord == null) {
            infoRecord = InfoRecord.obtain();
            this.mLayoutHolderMap.put(viewHolder, infoRecord);
        }
        infoRecord.preInfo = itemHolderInfo;
        infoRecord.flags |= 4;
    }

    void onDetach() {
        InfoRecord.drainCache();
    }

    void removeFromDisappearedInLayout(ViewHolder viewHolder) {
        InfoRecord infoRecord = (InfoRecord) this.mLayoutHolderMap.get(viewHolder);
        if (infoRecord != null) {
            infoRecord.flags &= -2;
        }
    }

    void addToOldChangeHolders(long j, ViewHolder viewHolder) {
        this.mOldChangedHolders.put(j, viewHolder);
    }

    void addToAppearedInPreLayoutHolders(ViewHolder viewHolder, ItemHolderInfo itemHolderInfo) {
        InfoRecord infoRecord = (InfoRecord) this.mLayoutHolderMap.get(viewHolder);
        if (infoRecord == null) {
            infoRecord = InfoRecord.obtain();
            this.mLayoutHolderMap.put(viewHolder, infoRecord);
        }
        infoRecord.flags |= 2;
        infoRecord.preInfo = itemHolderInfo;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void process(android.support.v7.widget.ViewInfoStore.ProcessCallback r7) {
        /*
        r6 = this;
        r3 = android.support.v7.widget.RecyclerView.ViewHolder.a;
        r0 = r6.mLayoutHolderMap;
        r0 = r0.size();
        r0 = r0 + -1;
        r2 = r0;
    L_0x000b:
        if (r2 < 0) goto L_0x0084;
    L_0x000d:
        r0 = r6.mLayoutHolderMap;
        r0 = r0.keyAt(r2);
        r0 = (android.support.v7.widget.RecyclerView.ViewHolder) r0;
        r1 = r6.mLayoutHolderMap;
        r1 = r1.removeAt(r2);
        r1 = (android.support.v7.widget.ViewInfoStore.InfoRecord) r1;
        r4 = r1.flags;
        r4 = r4 & 3;
        r5 = 3;
        if (r4 != r5) goto L_0x0029;
    L_0x0024:
        r7.unused(r0);
        if (r3 == 0) goto L_0x007d;
    L_0x0029:
        r4 = r1.flags;
        r4 = r4 & 1;
        if (r4 == 0) goto L_0x0038;
    L_0x002f:
        r4 = r1.preInfo;
        r5 = r1.postInfo;
        r7.processDisappeared(r0, r4, r5);
        if (r3 == 0) goto L_0x007d;
    L_0x0038:
        r4 = r1.flags;
        r4 = r4 & 14;
        r5 = 14;
        if (r4 != r5) goto L_0x0049;
    L_0x0040:
        r4 = r1.preInfo;
        r5 = r1.postInfo;
        r7.processAppeared(r0, r4, r5);
        if (r3 == 0) goto L_0x007d;
    L_0x0049:
        r4 = r1.flags;
        r4 = r4 & 12;
        r5 = 12;
        if (r4 != r5) goto L_0x005a;
    L_0x0051:
        r4 = r1.preInfo;
        r5 = r1.postInfo;
        r7.processPersistent(r0, r4, r5);
        if (r3 == 0) goto L_0x007d;
    L_0x005a:
        r4 = r1.flags;
        r4 = r4 & 4;
        if (r4 == 0) goto L_0x0068;
    L_0x0060:
        r4 = r1.preInfo;
        r5 = 0;
        r7.processDisappeared(r0, r4, r5);
        if (r3 == 0) goto L_0x007d;
    L_0x0068:
        r4 = r1.flags;
        r4 = r4 & 8;
        if (r4 == 0) goto L_0x0077;
    L_0x006e:
        r4 = r1.preInfo;
        r5 = r1.postInfo;
        r7.processAppeared(r0, r4, r5);
        if (r3 == 0) goto L_0x007d;
    L_0x0077:
        r0 = r1.flags;
        r0 = r0 & 2;
        if (r0 == 0) goto L_0x007d;
    L_0x007d:
        android.support.v7.widget.ViewInfoStore.InfoRecord.recycle(r1);
        r0 = r2 + -1;
        if (r3 == 0) goto L_0x0085;
    L_0x0084:
        return;
    L_0x0085:
        r2 = r0;
        goto L_0x000b;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ViewInfoStore.process(android.support.v7.widget.ViewInfoStore$ProcessCallback):void");
    }

    ViewInfoStore() {
        this.mLayoutHolderMap = new ArrayMap();
        this.mOldChangedHolders = new LongSparseArray();
    }

    void clear() {
        this.mLayoutHolderMap.clear();
        this.mOldChangedHolders.clear();
    }

    boolean isInPreLayout(ViewHolder viewHolder) {
        InfoRecord infoRecord = (InfoRecord) this.mLayoutHolderMap.get(viewHolder);
        return (infoRecord == null || (infoRecord.flags & 4) == 0) ? false : true;
    }
}
