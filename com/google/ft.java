package com.google;

import java.lang.reflect.Field;

enum ft extends eg {
    public String translateName(Field field) {
        return eg.a(field.getName(), "-").toLowerCase();
    }

    ft(String str, int i) {
        super(str, i, null);
    }
}
