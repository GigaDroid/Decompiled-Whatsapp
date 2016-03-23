package com.whatsapp.util;

import java.text.BreakIterator;

final class bn extends ThreadLocal {
    protected BreakIterator a() {
        return BreakIterator.getWordInstance();
    }

    protected Object initialValue() {
        return a();
    }

    bn() {
    }
}
