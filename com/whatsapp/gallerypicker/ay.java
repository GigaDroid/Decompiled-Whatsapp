package com.whatsapp.gallerypicker;

import java.text.Collator;
import java.util.Comparator;
import java.util.Map.Entry;
import org.v;
import org.whispersystems.at;

class ay implements Comparator {
    private static final String[] z;
    final GalleryPickerFragment a;

    static {
        String[] strArr = new String[4];
        String str = "C[C|:UCR(\u001f}WGg";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = 20;
                        break;
                    case at.g /*1*/:
                        i3 = 51;
                        break;
                    case at.i /*2*/:
                        i3 = 34;
                        break;
                    case at.o /*3*/:
                        i3 = 8;
                        break;
                    default:
                        i3 = 73;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "C[C|:UCR(\u0000yREm:";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "C[C|:UCR(\u001f}WGg";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "C[C|:UCR(\u0000yREm:";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public int a(Entry entry, Entry entry2) {
        int i = -1;
        int i2 = MediaGalleryFragmentBase.e;
        Collator instance = Collator.getInstance();
        instance.setStrength(0);
        instance.setDecomposition(1);
        int compare = instance.compare((String) entry.getValue(), (String) entry2.getValue());
        if (compare == 0) {
            return compare;
        }
        if (z[1].equals(entry.getValue())) {
            if (i2 == 0) {
                return -1;
            }
            compare = -1;
        }
        if (z[2].equals(entry2.getValue())) {
            if (i2 == 0) {
                return 1;
            }
            compare = 1;
        }
        if (!z[3].equals(entry.getValue())) {
            i = compare;
        } else if (i2 == 0) {
            return -1;
        }
        return z[0].equals(entry2.getValue()) ? 1 : i;
    }

    ay(GalleryPickerFragment galleryPickerFragment) {
        this.a = galleryPickerFragment;
    }

    public int compare(Object obj, Object obj2) {
        return a((Entry) obj, (Entry) obj2);
    }
}
