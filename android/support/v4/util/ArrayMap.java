package android.support.v4.util;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ArrayMap extends SimpleArrayMap implements Map {
    MapCollections mCollections;

    class 1 extends MapCollections {
        final ArrayMap this$0;

        protected void colRemoveAt(int i) {
            this.this$0.removeAt(i);
        }

        protected int colIndexOfKey(Object obj) {
            return this.this$0.indexOfKey(obj);
        }

        protected void colClear() {
            this.this$0.clear();
        }

        protected Object colSetValue(int i, Object obj) {
            return this.this$0.setValueAt(i, obj);
        }

        protected int colGetSize() {
            return this.this$0.mSize;
        }

        protected Map colGetMap() {
            return this.this$0;
        }

        protected void colPut(Object obj, Object obj2) {
            this.this$0.put(obj, obj2);
        }

        1(ArrayMap arrayMap) {
            this.this$0 = arrayMap;
        }

        protected Object colGetEntry(int i, int i2) {
            return this.this$0.mArray[(i << 1) + i2];
        }

        protected int colIndexOfValue(Object obj) {
            return this.this$0.indexOfValue(obj);
        }
    }

    public Collection values() {
        return getCollection().getValues();
    }

    private MapCollections getCollection() {
        if (this.mCollections == null) {
            this.mCollections = new 1(this);
        }
        return this.mCollections;
    }

    public void putAll(Map map) {
        boolean z = LruCache.a;
        ensureCapacity(this.mSize + map.size());
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
            if (z) {
                return;
            }
        }
    }

    public ArrayMap(int i) {
        super(i);
    }

    public Set entrySet() {
        return getCollection().getEntrySet();
    }

    public boolean retainAll(Collection collection) {
        return MapCollections.retainAllHelper(this, collection);
    }

    public Set keySet() {
        return getCollection().getKeySet();
    }
}
