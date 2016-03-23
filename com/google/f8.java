package com.google;

import java.lang.reflect.Field;

enum f8 extends eg {
    f8(String str, int i) {
        super(str, i, null);
    }

    public String translateName(Field field) {
        return eg.a(field.getName(), "_").toLowerCase();
    }
}
