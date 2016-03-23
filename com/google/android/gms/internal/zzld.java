package com.google.android.gms.internal;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class zzld extends zzlh implements Map {
    zzlg zzaev;

    class 1 extends zzlg {
        final zzld zzaew;

        1(zzld com_google_android_gms_internal_zzld) {
            this.zzaew = com_google_android_gms_internal_zzld;
        }

        protected void colClear() {
            this.zzaew.clear();
        }

        protected Object colGetEntry(int i, int i2) {
            return this.zzaew.mArray[(i << 1) + i2];
        }

        protected Map colGetMap() {
            return this.zzaew;
        }

        protected int colGetSize() {
            return this.zzaew.mSize;
        }

        protected int colIndexOfKey(Object obj) {
            return obj == null ? this.zzaew.indexOfNull() : this.zzaew.indexOf(obj, obj.hashCode());
        }

        protected int colIndexOfValue(Object obj) {
            return this.zzaew.indexOfValue(obj);
        }

        protected void colPut(Object obj, Object obj2) {
            this.zzaew.put(obj, obj2);
        }

        protected void colRemoveAt(int i) {
            this.zzaew.removeAt(i);
        }

        protected Object colSetValue(int i, Object obj) {
            return this.zzaew.setValueAt(i, obj);
        }
    }

    private zzlg zzoV() {
        if (this.zzaev == null) {
            this.zzaev = new 1(this);
        }
        return this.zzaev;
    }

    public Set entrySet() {
        return zzoV().getEntrySet();
    }

    public Set keySet() {
        return zzoV().getKeySet();
    }

    public void putAll(Map map) {
        boolean z = zzkq.a;
        ensureCapacity(this.mSize + map.size());
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
            if (z) {
                return;
            }
        }
    }

    public Collection values() {
        return zzoV().getValues();
    }
}
