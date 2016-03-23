package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public enum cw {
    ;
    
    public static final cw AUDIO;
    public static final cw CONTACT;
    public static final cw DOCUMENT;
    public static final cw LOCATION;
    public static final cw NONE;
    public static final cw PHOTO;
    public static final cw PTT;
    public static final cw URL;
    public static final cw VIDEO;
    private static final cw[] b;
    private static final String[] z;
    private final int a;

    public int getCode() {
        return this.a;
    }

    static {
        String[] strArr = new String[9];
        String str = "@kf\u0004\u0018";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case v.m /*0*/:
                        i4 = 1;
                        break;
                    case at.g /*1*/:
                        i4 = 62;
                        break;
                    case at.i /*2*/:
                        i4 = 34;
                        break;
                    case at.o /*3*/:
                        i4 = 77;
                        break;
                    default:
                        i4 = 87;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "Mqa\f\u0003Hql";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "Eqa\u0018\u001aDpv";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "Qvm\u0019\u0018";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "Wwf\b\u0018";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "Qjv";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "Bql\u0019\u0016Bj";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "Oql\b";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    NONE = new cw(z[8], 0, 1);
                    PHOTO = new cw(z[4], 1, 2);
                    VIDEO = new cw(z[5], 2, 3);
                    AUDIO = new cw(z[0], 3, 4);
                    PTT = new cw(z[6], 4, 5);
                    LOCATION = new cw(z[2], 5, 6);
                    CONTACT = new cw(z[7], 6, 7);
                    DOCUMENT = new cw(z[3], 7, 8);
                    URL = new cw(z[1], 8, 9);
                    b = new cw[]{NONE, PHOTO, VIDEO, AUDIO, PTT, LOCATION, CONTACT, DOCUMENT, URL};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "Tln";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private cw(int i) {
        this.a = i;
    }
}
