package com.google.android.gms.common.data;

import com.google.android.gms.common.api.Releasable;
import java.util.Iterator;

public interface DataBuffer extends Releasable, Iterable {
    Object get(int i);

    int getCount();

    Iterator iterator();

    void release();
}
