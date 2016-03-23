package com.whatsapp;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import org.v;
import org.whispersystems.at;

final class fj extends ObjectInputStream {
    private static final String z;

    static {
        char[] toCharArray = "Q\u001aiG\u0005Z\u0014p\u001a\u0013B\u0005*\u001d\u0001".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 50;
                    break;
                case at.g /*1*/:
                    i2 = 117;
                    break;
                case at.i /*2*/:
                    i2 = 4;
                    break;
                case at.o /*3*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                default:
                    i2 = 114;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    protected ObjectStreamClass readClassDescriptor() {
        ObjectStreamClass readClassDescriptor = super.readClassDescriptor();
        if (z.equals(readClassDescriptor.getName())) {
            return ObjectStreamClass.lookup(EmojiPicker$EmojiWeight.class);
        }
        return readClassDescriptor;
    }

    fj(InputStream inputStream) {
        super(inputStream);
    }
}
