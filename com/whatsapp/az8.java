package com.whatsapp;

import java.util.Comparator;
import java.util.Map.Entry;

class az8 implements Comparator {
    final SearchFAQ a;

    az8(SearchFAQ searchFAQ) {
        this.a = searchFAQ;
    }

    public int a(Entry entry, Entry entry2) {
        return (int) Math.signum((float) (((Long) entry.getValue()).longValue() - ((Long) entry2.getValue()).longValue()));
    }

    public int compare(Object obj, Object obj2) {
        return a((Entry) obj, (Entry) obj2);
    }
}
