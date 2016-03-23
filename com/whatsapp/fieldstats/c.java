package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public enum c {
    ;
    
    public static final c CONTACTPICKER_LIST;
    public static final c CONTACTPICKER_MENU;
    public static final c CONTACTS_LIST;
    public static final c CONTACTS_MENU;
    public static final c EMPTY_CALLS;
    public static final c EMPTY_CONTACTS;
    public static final c EMPTY_CONVERSATIONS;
    public static final c INVITE_NON_WA_CONTACT;
    public static final c SETTINGS_CONTACTS;
    private static final c[] b;
    private static final String[] z;
    private final int a;

    static {
        String[] strArr = new String[9];
        String str = "'g\u0003IR=i\u0012QG1";
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
                        i4 = 98;
                        break;
                    case at.g /*1*/:
                        i4 = 42;
                        break;
                    case at.i /*2*/:
                        i4 = 83;
                        break;
                    case at.o /*3*/:
                        i4 = 29;
                        break;
                    default:
                        i4 = 11;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "+d\u0005T_'u\u001dRE=}\u0012BH-d\u0007\\H6";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "'g\u0003IR=i\u001cS]'x\u0000\\_+e\u001dN";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "!e\u001dIJ!~\u0003TH)o\u0001BG+y\u0007";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "'g\u0003IR=i\u001cS_#i\u0007N";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "!e\u001dIJ!~\u0000BF'd\u0006";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "1o\u0007IB,m\u0000BH-d\u0007\\H6y";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "!e\u001dIJ!~\u0003TH)o\u0001BF'd\u0006";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    SETTINGS_CONTACTS = new c(z[7], 0, 1);
                    CONTACTS_LIST = new c(z[1], 1, 2);
                    CONTACTS_MENU = new c(z[6], 2, 3);
                    CONTACTPICKER_LIST = new c(z[4], 3, 4);
                    CONTACTPICKER_MENU = new c(z[8], 4, 5);
                    EMPTY_CONVERSATIONS = new c(z[3], 5, 6);
                    EMPTY_CONTACTS = new c(z[5], 6, 7);
                    INVITE_NON_WA_CONTACT = new c(z[2], 7, 8);
                    EMPTY_CALLS = new c(z[0], 8, 9);
                    b = new c[]{SETTINGS_CONTACTS, CONTACTS_LIST, CONTACTS_MENU, CONTACTPICKER_LIST, CONTACTPICKER_MENU, EMPTY_CONVERSATIONS, EMPTY_CONTACTS, INVITE_NON_WA_CONTACT, EMPTY_CALLS};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "!e\u001dIJ!~\u0000BG+y\u0007";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public int getCode() {
        return this.a;
    }

    private c(int i) {
        this.a = i;
    }
}
