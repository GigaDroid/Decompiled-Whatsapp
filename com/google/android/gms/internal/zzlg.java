package com.google.android.gms.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

abstract class zzlg {
    zzb zzaeE;
    zzc zzaeF;
    zze zzaeG;

    final class zza implements Iterator {
        boolean mCanRemove;
        int mIndex;
        final int mOffset;
        int mSize;
        final zzlg zzaeH;

        zza(zzlg com_google_android_gms_internal_zzlg, int i) {
            this.zzaeH = com_google_android_gms_internal_zzlg;
            this.mCanRemove = false;
            this.mOffset = i;
            this.mSize = com_google_android_gms_internal_zzlg.colGetSize();
        }

        public boolean hasNext() {
            try {
                return this.mIndex < this.mSize;
            } catch (IllegalStateException e) {
                throw e;
            }
        }

        public Object next() {
            Object colGetEntry = this.zzaeH.colGetEntry(this.mIndex, this.mOffset);
            this.mIndex++;
            this.mCanRemove = true;
            return colGetEntry;
        }

        public void remove() {
            try {
                if (this.mCanRemove) {
                    this.mIndex--;
                    this.mSize--;
                    this.mCanRemove = false;
                    this.zzaeH.colRemoveAt(this.mIndex);
                    return;
                }
                throw new IllegalStateException();
            } catch (IllegalStateException e) {
                throw e;
            }
        }
    }

    final class zzb implements Set {
        final zzlg zzaeH;

        zzb(zzlg com_google_android_gms_internal_zzlg) {
            this.zzaeH = com_google_android_gms_internal_zzlg;
        }

        public boolean add(Object obj) {
            return add((Entry) obj);
        }

        public boolean add(Entry entry) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean addAll(java.util.Collection r7) {
            /*
            r6 = this;
            r1 = com.google.android.gms.internal.zzkq.a;
            r0 = r6.zzaeH;
            r2 = r0.colGetSize();
            r3 = r7.iterator();
        L_0x000c:
            r0 = r3.hasNext();
            if (r0 == 0) goto L_0x0027;
        L_0x0012:
            r0 = r3.next();
            r0 = (java.util.Map.Entry) r0;
            r4 = r6.zzaeH;
            r5 = r0.getKey();
            r0 = r0.getValue();
            r4.colPut(r5, r0);
            if (r1 == 0) goto L_0x000c;
        L_0x0027:
            r0 = r6.zzaeH;	 Catch:{ UnsupportedOperationException -> 0x0031 }
            r0 = r0.colGetSize();	 Catch:{ UnsupportedOperationException -> 0x0031 }
            if (r2 == r0) goto L_0x0033;
        L_0x002f:
            r0 = 1;
        L_0x0030:
            return r0;
        L_0x0031:
            r0 = move-exception;
            throw r0;
        L_0x0033:
            r0 = 0;
            goto L_0x0030;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzlg.zzb.addAll(java.util.Collection):boolean");
        }

        public void clear() {
            this.zzaeH.colClear();
        }

        public boolean contains(Object obj) {
            try {
                if (!(obj instanceof Entry)) {
                    return false;
                }
                Entry entry = (Entry) obj;
                int colIndexOfKey = this.zzaeH.colIndexOfKey(entry.getKey());
                return colIndexOfKey >= 0 ? zzle.equal(this.zzaeH.colGetEntry(colIndexOfKey, 1), entry.getValue()) : false;
            } catch (UnsupportedOperationException e) {
                throw e;
            }
        }

        public boolean containsAll(Collection collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return zzlg.equalsSetHelper(this, obj);
        }

        public int hashCode() {
            boolean z = zzkq.a;
            int colGetSize = this.zzaeH.colGetSize() - 1;
            int i = 0;
            while (colGetSize >= 0) {
                Object colGetEntry = this.zzaeH.colGetEntry(colGetSize, 0);
                Object colGetEntry2 = this.zzaeH.colGetEntry(colGetSize, 1);
                i += (colGetEntry2 == null ? 0 : colGetEntry2.hashCode()) ^ (colGetEntry == null ? 0 : colGetEntry.hashCode());
                int i2 = colGetSize - 1;
                if (z) {
                    break;
                }
                colGetSize = i2;
            }
            return i;
        }

        public boolean isEmpty() {
            try {
                return this.zzaeH.colGetSize() == 0;
            } catch (UnsupportedOperationException e) {
                throw e;
            }
        }

        public Iterator iterator() {
            return new zzd(this.zzaeH);
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return this.zzaeH.colGetSize();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public Object[] toArray(Object[] objArr) {
            throw new UnsupportedOperationException();
        }
    }

    final class zzc implements Set {
        final zzlg zzaeH;

        zzc(zzlg com_google_android_gms_internal_zzlg) {
            this.zzaeH = com_google_android_gms_internal_zzlg;
        }

        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            this.zzaeH.colClear();
        }

        public boolean contains(Object obj) {
            try {
                return this.zzaeH.colIndexOfKey(obj) >= 0;
            } catch (UnsupportedOperationException e) {
                throw e;
            }
        }

        public boolean containsAll(Collection collection) {
            return zzlg.containsAllHelper(this.zzaeH.colGetMap(), collection);
        }

        public boolean equals(Object obj) {
            return zzlg.equalsSetHelper(this, obj);
        }

        public int hashCode() {
            boolean z = zzkq.a;
            int colGetSize = this.zzaeH.colGetSize() - 1;
            int i = 0;
            while (colGetSize >= 0) {
                Object colGetEntry = this.zzaeH.colGetEntry(colGetSize, 0);
                i += colGetEntry == null ? 0 : colGetEntry.hashCode();
                int i2 = colGetSize - 1;
                if (z) {
                    break;
                }
                colGetSize = i2;
            }
            return i;
        }

        public boolean isEmpty() {
            try {
                return this.zzaeH.colGetSize() == 0;
            } catch (UnsupportedOperationException e) {
                throw e;
            }
        }

        public Iterator iterator() {
            return new zza(this.zzaeH, 0);
        }

        public boolean remove(Object obj) {
            int colIndexOfKey = this.zzaeH.colIndexOfKey(obj);
            if (colIndexOfKey < 0) {
                return false;
            }
            try {
                this.zzaeH.colRemoveAt(colIndexOfKey);
                return true;
            } catch (UnsupportedOperationException e) {
                throw e;
            }
        }

        public boolean removeAll(Collection collection) {
            return zzlg.removeAllHelper(this.zzaeH.colGetMap(), collection);
        }

        public boolean retainAll(Collection collection) {
            return zzlg.retainAllHelper(this.zzaeH.colGetMap(), collection);
        }

        public int size() {
            return this.zzaeH.colGetSize();
        }

        public Object[] toArray() {
            return this.zzaeH.toArrayHelper(0);
        }

        public Object[] toArray(Object[] objArr) {
            return this.zzaeH.toArrayHelper(objArr, 0);
        }
    }

    final class zzd implements Iterator, Entry {
        int mEnd;
        boolean mEntryValid;
        int mIndex;
        final zzlg zzaeH;

        zzd(zzlg com_google_android_gms_internal_zzlg) {
            this.zzaeH = com_google_android_gms_internal_zzlg;
            this.mEntryValid = false;
            this.mEnd = com_google_android_gms_internal_zzlg.colGetSize() - 1;
            this.mIndex = -1;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r7) {
            /*
            r6 = this;
            r0 = 1;
            r1 = 0;
            r2 = r6.mEntryValid;	 Catch:{ IllegalStateException -> 0x000f }
            if (r2 != 0) goto L_0x0011;
        L_0x0006:
            r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x000f }
            r1 = "This container does not support retaining Map.Entry objects";
            r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x000f }
            throw r0;	 Catch:{ IllegalStateException -> 0x000f }
        L_0x000f:
            r0 = move-exception;
            throw r0;
        L_0x0011:
            r2 = r7 instanceof java.util.Map.Entry;	 Catch:{ IllegalStateException -> 0x0016 }
            if (r2 != 0) goto L_0x0018;
        L_0x0015:
            return r1;
        L_0x0016:
            r0 = move-exception;
            throw r0;
        L_0x0018:
            r7 = (java.util.Map.Entry) r7;
            r2 = r7.getKey();	 Catch:{ IllegalStateException -> 0x0042 }
            r3 = r6.zzaeH;	 Catch:{ IllegalStateException -> 0x0042 }
            r4 = r6.mIndex;	 Catch:{ IllegalStateException -> 0x0042 }
            r5 = 0;
            r3 = r3.colGetEntry(r4, r5);	 Catch:{ IllegalStateException -> 0x0042 }
            r2 = com.google.android.gms.internal.zzle.equal(r2, r3);	 Catch:{ IllegalStateException -> 0x0042 }
            if (r2 == 0) goto L_0x0046;
        L_0x002d:
            r2 = r7.getValue();	 Catch:{ IllegalStateException -> 0x0044 }
            r3 = r6.zzaeH;	 Catch:{ IllegalStateException -> 0x0044 }
            r4 = r6.mIndex;	 Catch:{ IllegalStateException -> 0x0044 }
            r5 = 1;
            r3 = r3.colGetEntry(r4, r5);	 Catch:{ IllegalStateException -> 0x0044 }
            r2 = com.google.android.gms.internal.zzle.equal(r2, r3);	 Catch:{ IllegalStateException -> 0x0044 }
            if (r2 == 0) goto L_0x0046;
        L_0x0040:
            r1 = r0;
            goto L_0x0015;
        L_0x0042:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalStateException -> 0x0044 }
        L_0x0044:
            r0 = move-exception;
            throw r0;
        L_0x0046:
            r0 = r1;
            goto L_0x0040;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzlg.zzd.equals(java.lang.Object):boolean");
        }

        public Object getKey() {
            try {
                if (this.mEntryValid) {
                    return this.zzaeH.colGetEntry(this.mIndex, 0);
                }
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } catch (IllegalStateException e) {
                throw e;
            }
        }

        public Object getValue() {
            try {
                if (this.mEntryValid) {
                    return this.zzaeH.colGetEntry(this.mIndex, 1);
                }
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } catch (IllegalStateException e) {
                throw e;
            }
        }

        public boolean hasNext() {
            try {
                return this.mIndex < this.mEnd;
            } catch (IllegalStateException e) {
                throw e;
            }
        }

        public final int hashCode() {
            int i = 0;
            try {
                if (this.mEntryValid) {
                    Object colGetEntry = this.zzaeH.colGetEntry(this.mIndex, 0);
                    Object colGetEntry2 = this.zzaeH.colGetEntry(this.mIndex, 1);
                    int hashCode = colGetEntry == null ? 0 : colGetEntry.hashCode();
                    if (colGetEntry2 != null) {
                        i = colGetEntry2.hashCode();
                    }
                    return i ^ hashCode;
                }
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } catch (IllegalStateException e) {
                throw e;
            }
        }

        public Object next() {
            return next();
        }

        public Entry m116next() {
            this.mIndex++;
            this.mEntryValid = true;
            return this;
        }

        public void remove() {
            try {
                if (this.mEntryValid) {
                    this.zzaeH.colRemoveAt(this.mIndex);
                    this.mIndex--;
                    this.mEnd--;
                    this.mEntryValid = false;
                    return;
                }
                throw new IllegalStateException();
            } catch (IllegalStateException e) {
                throw e;
            }
        }

        public Object setValue(Object obj) {
            try {
                if (this.mEntryValid) {
                    return this.zzaeH.colSetValue(this.mIndex, obj);
                }
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } catch (IllegalStateException e) {
                throw e;
            }
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    final class zze implements Collection {
        final zzlg zzaeH;

        zze(zzlg com_google_android_gms_internal_zzlg) {
            this.zzaeH = com_google_android_gms_internal_zzlg;
        }

        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            this.zzaeH.colClear();
        }

        public boolean contains(Object obj) {
            try {
                return this.zzaeH.colIndexOfValue(obj) >= 0;
            } catch (UnsupportedOperationException e) {
                throw e;
            }
        }

        public boolean containsAll(Collection collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            try {
                return this.zzaeH.colGetSize() == 0;
            } catch (UnsupportedOperationException e) {
                throw e;
            }
        }

        public Iterator iterator() {
            return new zza(this.zzaeH, 1);
        }

        public boolean remove(Object obj) {
            int colIndexOfValue = this.zzaeH.colIndexOfValue(obj);
            if (colIndexOfValue < 0) {
                return false;
            }
            try {
                this.zzaeH.colRemoveAt(colIndexOfValue);
                return true;
            } catch (UnsupportedOperationException e) {
                throw e;
            }
        }

        public boolean removeAll(Collection collection) {
            int i = 0;
            boolean z = zzkq.a;
            int colGetSize = this.zzaeH.colGetSize();
            boolean z2 = false;
            while (i < colGetSize) {
                if (collection.contains(this.zzaeH.colGetEntry(i, 1))) {
                    this.zzaeH.colRemoveAt(i);
                    colGetSize--;
                    i--;
                    z2 = true;
                }
                i++;
                if (z) {
                    break;
                }
            }
            return z2;
        }

        public boolean retainAll(Collection collection) {
            int i = 0;
            boolean z = zzkq.a;
            int colGetSize = this.zzaeH.colGetSize();
            boolean z2 = false;
            while (i < colGetSize) {
                if (!collection.contains(this.zzaeH.colGetEntry(i, 1))) {
                    this.zzaeH.colRemoveAt(i);
                    colGetSize--;
                    i--;
                    z2 = true;
                }
                i++;
                if (z) {
                    break;
                }
            }
            return z2;
        }

        public int size() {
            return this.zzaeH.colGetSize();
        }

        public Object[] toArray() {
            return this.zzaeH.toArrayHelper(1);
        }

        public Object[] toArray(Object[] objArr) {
            return this.zzaeH.toArrayHelper(objArr, 1);
        }
    }

    zzlg() {
    }

    public static boolean containsAllHelper(Map map, Collection collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean equalsSetHelper(java.util.Set r4, java.lang.Object r5) {
        /*
        r0 = 1;
        r1 = 0;
        if (r4 != r5) goto L_0x0006;
    L_0x0004:
        r1 = r0;
    L_0x0005:
        return r1;
    L_0x0006:
        r2 = r5 instanceof java.util.Set;
        if (r2 == 0) goto L_0x0005;
    L_0x000a:
        r5 = (java.util.Set) r5;
        r2 = r4.size();	 Catch:{ NullPointerException -> 0x001e, ClassCastException -> 0x0026 }
        r3 = r5.size();	 Catch:{ NullPointerException -> 0x001e, ClassCastException -> 0x0026 }
        if (r2 != r3) goto L_0x0024;
    L_0x0016:
        r2 = r4.containsAll(r5);	 Catch:{ NullPointerException -> 0x001e, ClassCastException -> 0x0026 }
        if (r2 == 0) goto L_0x0024;
    L_0x001c:
        r1 = r0;
        goto L_0x0005;
    L_0x001e:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0020, ClassCastException -> 0x0026 }
    L_0x0020:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0022, ClassCastException -> 0x0026 }
    L_0x0022:
        r0 = move-exception;
        goto L_0x0005;
    L_0x0024:
        r0 = r1;
        goto L_0x001c;
    L_0x0026:
        r0 = move-exception;
        goto L_0x0005;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzlg.equalsSetHelper(java.util.Set, java.lang.Object):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean removeAllHelper(java.util.Map r4, java.util.Collection r5) {
        /*
        r0 = com.google.android.gms.internal.zzkq.a;
        r1 = r4.size();
        r2 = r5.iterator();
    L_0x000a:
        r3 = r2.hasNext();
        if (r3 == 0) goto L_0x0019;
    L_0x0010:
        r3 = r2.next();
        r4.remove(r3);
        if (r0 == 0) goto L_0x000a;
    L_0x0019:
        r0 = r4.size();	 Catch:{ ClassCastException -> 0x0021 }
        if (r1 == r0) goto L_0x0023;
    L_0x001f:
        r0 = 1;
    L_0x0020:
        return r0;
    L_0x0021:
        r0 = move-exception;
        throw r0;
    L_0x0023:
        r0 = 0;
        goto L_0x0020;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzlg.removeAllHelper(java.util.Map, java.util.Collection):boolean");
    }

    public static boolean retainAllHelper(Map map, Collection collection) {
        boolean z = zzkq.a;
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                if (!z) {
                }
            }
        }
        try {
            break;
            return size != map.size();
        } catch (ClassCastException e) {
            throw e;
        }
    }

    protected abstract void colClear();

    protected abstract Object colGetEntry(int i, int i2);

    protected abstract Map colGetMap();

    protected abstract int colGetSize();

    protected abstract int colIndexOfKey(Object obj);

    protected abstract int colIndexOfValue(Object obj);

    protected abstract void colPut(Object obj, Object obj2);

    protected abstract void colRemoveAt(int i);

    protected abstract Object colSetValue(int i, Object obj);

    public Set getEntrySet() {
        try {
            if (this.zzaeE == null) {
                this.zzaeE = new zzb(this);
            }
            return this.zzaeE;
        } catch (ClassCastException e) {
            throw e;
        }
    }

    public Set getKeySet() {
        try {
            if (this.zzaeF == null) {
                this.zzaeF = new zzc(this);
            }
            return this.zzaeF;
        } catch (ClassCastException e) {
            throw e;
        }
    }

    public Collection getValues() {
        try {
            if (this.zzaeG == null) {
                this.zzaeG = new zze(this);
            }
            return this.zzaeG;
        } catch (ClassCastException e) {
            throw e;
        }
    }

    public Object[] toArrayHelper(int i) {
        boolean z = zzkq.a;
        int colGetSize = colGetSize();
        Object[] objArr = new Object[colGetSize];
        int i2 = 0;
        while (i2 < colGetSize) {
            objArr[i2] = colGetEntry(i2, i);
            i2++;
            if (z) {
                break;
            }
        }
        return objArr;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object[] toArrayHelper(java.lang.Object[] r6, int r7) {
        /*
        r5 = this;
        r2 = com.google.android.gms.internal.zzkq.a;
        r3 = r5.colGetSize();
        r0 = r6.length;
        if (r0 >= r3) goto L_0x002f;
    L_0x0009:
        r0 = r6.getClass();
        r0 = r0.getComponentType();
        r0 = java.lang.reflect.Array.newInstance(r0, r3);
        r0 = (java.lang.Object[]) r0;
        r0 = (java.lang.Object[]) r0;
    L_0x0019:
        r1 = 0;
    L_0x001a:
        if (r1 >= r3) goto L_0x0026;
    L_0x001c:
        r4 = r5.colGetEntry(r1, r7);
        r0[r1] = r4;
        r1 = r1 + 1;
        if (r2 == 0) goto L_0x001a;
    L_0x0026:
        r1 = r0.length;	 Catch:{ ClassCastException -> 0x002d }
        if (r1 <= r3) goto L_0x002c;
    L_0x0029:
        r1 = 0;
        r0[r3] = r1;	 Catch:{ ClassCastException -> 0x002d }
    L_0x002c:
        return r0;
    L_0x002d:
        r0 = move-exception;
        throw r0;
    L_0x002f:
        r0 = r6;
        goto L_0x0019;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzlg.toArrayHelper(java.lang.Object[], int):java.lang.Object[]");
    }
}
