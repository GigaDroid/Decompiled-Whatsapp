package com.google;

import java.lang.reflect.Field;

enum fd extends eg {
    public String translateName(Field field) {
        return field.getName();
    }

    fd(String str, int i) {
        super(str, i, null);
    }
}
