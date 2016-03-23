package com.whatsapp.fieldstats;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

public enum cu {
    ;
    
    public static final cu CONFLICT;
    public static final cu MAIN;
    public static final cu OFFLINE;
    public static final cu PROXYBLOCK;
    public static final cu QR;
    public static final cu SYNCING;
    private static final cu[] a;
    private static final String[] z;
    private final int b;

    public int getCode() {
        return this.b;
    }

    private cu(int i) {
        this.b = i;
    }

    static {
        String[] strArr = new String[6];
        String str = "wO<+LjQ";
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
                        i4 = 36;
                        break;
                    case at.g /*1*/:
                        i4 = 22;
                        break;
                    case at.i /*2*/:
                        i4 = 114;
                        break;
                    case at.o /*3*/:
                        i4 = arj.Theme_editTextStyle;
                        break;
                    default:
                        i4 = 5;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "gY<.ImU&";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "iW;&";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "kP4$LjS";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "uD";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    QR = new cu(z[5], 0, 0);
                    MAIN = new cu(z[3], 1, 1);
                    SYNCING = new cu(z[0], 2, 2);
                    OFFLINE = new cu(z[4], 3, 3);
                    CONFLICT = new cu(z[2], 4, 4);
                    PROXYBLOCK = new cu(z[1], 5, 5);
                    a = new cu[]{QR, MAIN, SYNCING, OFFLINE, CONFLICT, PROXYBLOCK};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "tD=0\\fZ=+N";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }
}
