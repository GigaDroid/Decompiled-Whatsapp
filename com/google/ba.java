package com.google;

public final class ba {
    public static void a(boolean z) {
        if (!z) {
            try {
                throw new IllegalArgumentException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
    }

    public static Object a(Object obj) {
        if (obj != null) {
            return obj;
        }
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            throw e;
        }
    }
}
