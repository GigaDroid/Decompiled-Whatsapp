package org.whispersystems;

public final class br {
    public static Object a(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        try {
            throw new NullPointerException(String.valueOf(obj2));
        } catch (NullPointerException e) {
            throw e;
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
