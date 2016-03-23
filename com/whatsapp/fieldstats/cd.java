package com.whatsapp.fieldstats;

import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public enum cd {
    ;
    
    public static final cd ANDROID_BROADCAST_DETAILS;
    public static final cd ANDROID_CONTACTS_APPLICATION;
    public static final cd ANDROID_LIST_CHAT_INFO;
    public static final cd CALLS_TAB_INCOMING;
    public static final cd CALLS_TAB_MISSED;
    public static final cd CALLS_TAB_OUTGOING;
    public static final cd CALL_INFO;
    public static final cd CONTACT_INFO;
    public static final cd CONTACT_VCARD;
    public static final cd CONVERSATION;
    public static final cd GROUP_CHAT_INFO;
    public static final cd GROUP_CHAT_RECENT_LOCATION;
    public static final cd NOTIFICATION_MISSED;
    public static final cd QUICK_CONTACT_INFO;
    public static final cd SELECT_CONTACT;
    private static final cd[] a;
    private static final String[] z;
    private final int b;

    private cd(int i) {
        this.b = i;
    }

    static {
        String[] strArr = new String[15];
        String str = "\u000e\u0001H\r2\t\u001bG\u0007?\t\u0005G\u001c";
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
                        i4 = 93;
                        break;
                    case at.g /*1*/:
                        i4 = 68;
                        break;
                    case at.i /*2*/:
                        i4 = 4;
                        break;
                    case at.o /*3*/:
                        i4 = 72;
                        break;
                    default:
                        i4 = 113;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "\u001e\u000bJ\u001c0\u001e\u0010[\u001e2\u001c\u0016@";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "\u001e\u0005H\u0004\"\u0002\u0010E\n.\u0014\nG\u0007<\u0014\nC";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "\u001c\n@\u001a>\u0014\u0000[\u00048\u000e\u0010[\u000b9\u001c\u0010[\u0001?\u001b\u000b";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "\u001a\u0016K\u001d!\u0002\u0007L\t%\u0002\u0016A\u000b4\u0013\u0010[\u0004>\u001e\u0005P\u0001>\u0013";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "\u001c\n@\u001a>\u0014\u0000[\u000b>\u0013\u0010E\u000b%\u000e\u001bE\u0018!\u0011\rG\t%\u0014\u000bJ";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "\u001a\u0016K\u001d!\u0002\u0007L\t%\u0002\rJ\u000e>";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "\u001e\u000bJ\u001c0\u001e\u0010[\u0001?\u001b\u000b";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "\u001e\u0005H\u0004\"\u0002\u0010E\n.\u0012\u0011P\u000f>\u0014\nC";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "\u0013\u000bP\u00017\u0014\u0007E\u001c8\u0012\n[\u00058\u000e\u0017A\f";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "\u001e\u000bJ\u001e4\u000f\u0017E\u001c8\u0012\n";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "\u001e\u0005H\u0004\"\u0002\u0010E\n.\u0010\rW\u001b4\u0019";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "\u001e\u0005H\u0004.\u0014\nB\u0007";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "\u001c\n@\u001a>\u0014\u0000[\n#\u0012\u0005@\u000b0\u000e\u0010[\f4\t\u0005M\u0004\"";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    CALLS_TAB_MISSED = new cd(z[12], 0, 1);
                    CALLS_TAB_OUTGOING = new cd(z[9], 1, 2);
                    SELECT_CONTACT = new cd(z[0], 2, 3);
                    CALL_INFO = new cd(z[13], 3, 4);
                    NOTIFICATION_MISSED = new cd(z[10], 4, 5);
                    CONTACT_INFO = new cd(z[8], 5, 6);
                    QUICK_CONTACT_INFO = new cd(z[1], 6, 7);
                    CONVERSATION = new cd(z[11], 7, 8);
                    CALLS_TAB_INCOMING = new cd(z[3], 8, 9);
                    GROUP_CHAT_INFO = new cd(z[7], 9, 10);
                    GROUP_CHAT_RECENT_LOCATION = new cd(z[5], 10, 11);
                    ANDROID_BROADCAST_DETAILS = new cd(z[14], 11, 12);
                    ANDROID_LIST_CHAT_INFO = new cd(z[4], 12, 13);
                    ANDROID_CONTACTS_APPLICATION = new cd(z[6], 13, 14);
                    CONTACT_VCARD = new cd(z[2], 14, 15);
                    a = new cd[]{CALLS_TAB_MISSED, CALLS_TAB_OUTGOING, SELECT_CONTACT, CALL_INFO, NOTIFICATION_MISSED, CONTACT_INFO, QUICK_CONTACT_INFO, CONVERSATION, CALLS_TAB_INCOMING, GROUP_CHAT_INFO, GROUP_CHAT_RECENT_LOCATION, ANDROID_BROADCAST_DETAILS, ANDROID_LIST_CHAT_INFO, ANDROID_CONTACTS_APPLICATION, CONTACT_VCARD};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\f\u0011M\u000b:\u0002\u0007K\u0006%\u001c\u0007P\u00178\u0013\u0002K";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public int getCode() {
        return this.b;
    }
}
