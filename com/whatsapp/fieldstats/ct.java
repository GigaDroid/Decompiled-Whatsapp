package com.whatsapp.fieldstats;

import com.whatsapp.arj;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public enum ct {
    ;
    
    public static final ct ACCOUNT_MISSING_FROM_DEVICE;
    public static final ct AUTH_FAILED;
    public static final ct BACKUP_SERVER_NOT_WORKING;
    public static final ct BACKUP_SERVER_UNREACHABLE;
    public static final ct BASE_FOLDER_DOES_NOT_EXIST;
    public static final ct DATA_CONNECTION_REQUIRED_BUT_MISSING;
    public static final ct FILE_NOT_FOUND;
    public static final ct LOCAL_STORAGE_IS_FULL;
    public static final ct MISSING_CHAT_STORE;
    public static final ct OK;
    public static final ct READ_STORAGE_PERMISSION_DENIED;
    public static final ct REMOTE_STORAGE_IS_FULL;
    public static final ct SUPPORT_SERVICE_UNAVAILABLE_ON_DEVICE;
    public static final ct UNKNOWN_ERROR;
    public static final ct WHATSAPP_SERVER_UNREACHABLE;
    public static final ct WIFI_REQUIRED_BUT_MISSING;
    private static final ct[] a;
    private static final String[] z;
    private final int b;

    static {
        String[] strArr = new String[16];
        String str = "\u001e{RHb\u001fz]Kh\u001fxK[h\u0012{LY{\fgNYo\u0001k]Wc\u0012jGNd\u000ek";
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
                        i4 = 77;
                        break;
                    case at.g /*1*/:
                        i4 = 46;
                        break;
                    case at.i /*2*/:
                        i4 = 2;
                        break;
                    case at.o /*3*/:
                        i4 = 24;
                        break;
                    default:
                        i4 = 45;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "\u001afCL~\f~RG~\b|T]\u007f\u0012{LJh\fmJYo\u0001k";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "\u0000gQKd\u0003i][e\fz]Ky\u0002|G";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "\u0001aAYa\u0012}VW\u007f\fiGGd\u001eqDMa\u0001";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "\u001fkOWy\bqQLb\u001foE]r\u0004}]^x\u0001b";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "\u000foQ]r\u000baN\\h\u001fqFWh\u001eqLWy\u0012kZQ~\u0019";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "\f{VPr\u000boKTh\t";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "\u000bgN]r\u0003aVGk\u0002{L\\";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "\u000foASx\u001dqQ]\u007f\u001bkPGc\u0002z]Ob\u001feKVj";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "\u000foASx\u001dqQ]\u007f\u001bkPGx\u0003|GYn\u0005o@Th";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "\u0002e";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "\u001agDQr\u001fkSMd\u001fkFGo\u0018z]Ud\u001e}KVj";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "\fmAWx\u0003z]Ud\u001e}KVj\u0012hPW`\u0012jGNd\u000ek";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "\toVYr\u000eaLVh\u000ezKWc\u0012|GIx\u0004|G\\r\u000f{VG`\u0004}QQc\n";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "\u0018`IVb\u001a`]]\u007f\u001faP";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    OK = new ct(z[11], 0, 1);
                    UNKNOWN_ERROR = new ct(z[15], 1, 2);
                    REMOTE_STORAGE_IS_FULL = new ct(z[5], 2, 3);
                    DATA_CONNECTION_REQUIRED_BUT_MISSING = new ct(z[14], 3, 7);
                    WIFI_REQUIRED_BUT_MISSING = new ct(z[12], 4, 4);
                    BACKUP_SERVER_UNREACHABLE = new ct(z[10], 5, 5);
                    ACCOUNT_MISSING_FROM_DEVICE = new ct(z[13], 6, 15);
                    AUTH_FAILED = new ct(z[7], 7, 6);
                    LOCAL_STORAGE_IS_FULL = new ct(z[4], 8, 8);
                    MISSING_CHAT_STORE = new ct(z[3], 9, 9);
                    FILE_NOT_FOUND = new ct(z[8], 10, 10);
                    BASE_FOLDER_DOES_NOT_EXIST = new ct(z[6], 11, 11);
                    BACKUP_SERVER_NOT_WORKING = new ct(z[9], 12, 12);
                    WHATSAPP_SERVER_UNREACHABLE = new ct(z[2], 13, 13);
                    SUPPORT_SERVICE_UNAVAILABLE_ON_DEVICE = new ct(z[0], 14, 14);
                    READ_STORAGE_PERMISSION_DENIED = new ct(z[1], 15, 16);
                    a = new ct[]{OK, UNKNOWN_ERROR, REMOTE_STORAGE_IS_FULL, DATA_CONNECTION_REQUIRED_BUT_MISSING, WIFI_REQUIRED_BUT_MISSING, BACKUP_SERVER_UNREACHABLE, ACCOUNT_MISSING_FROM_DEVICE, AUTH_FAILED, LOCAL_STORAGE_IS_FULL, MISSING_CHAT_STORE, FILE_NOT_FOUND, BASE_FOLDER_DOES_NOT_EXIST, BACKUP_SERVER_NOT_WORKING, WHATSAPP_SERVER_UNREACHABLE, SUPPORT_SERVICE_UNAVAILABLE_ON_DEVICE, READ_STORAGE_PERMISSION_DENIED};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\u001fkC\\r\u001ezMJl\nk]Hh\u001fcKK~\u0004aLGi\b`K]i";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    private ct(int i) {
        this.b = i;
    }

    public int getCode() {
        return this.b;
    }
}
