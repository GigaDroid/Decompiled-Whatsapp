package com.google;

import java.lang.reflect.Field;

enum fj extends eg {
    fj(String str, int i) {
        super(str, i, null);
    }

    public String translateName(Field field) {
        return eg.a(field.getName());
    }
}
