package org;

import org.whispersystems.at;

public enum b {
    ;
    
    public static final b APPEND;
    public static final b AUTHENTICATE;
    public static final b CAPABILITY;
    public static final b CHECK;
    public static final b CLOSE;
    public static final b COPY;
    public static final b CREATE;
    public static final b DELETE;
    public static final b EXAMINE;
    public static final b EXPUNGE;
    public static final b FETCH;
    public static final b LIST;
    public static final b LOGIN;
    public static final b LOGOUT;
    public static final b LSUB;
    public static final b NOOP;
    public static final b RENAME;
    public static final b SEARCH;
    public static final b SELECT;
    public static final b STARTTLS;
    public static final b STATUS;
    public static final b STORE;
    public static final b SUBSCRIBE;
    public static final b UID;
    public static final b UNSUBSCRIBE;
    public static final b XOAUTH;
    private static final String[] z;
    private final String a;
    private final int c;
    private final int d;

    private b(String str, int i) {
        this(r7, r8, str, i, i);
    }

    public String getIMAPCommand() {
        boolean z = L.d;
        String name = this.a != null ? this.a : name();
        if (z) {
            K.b++;
        }
        return name;
    }

    private b(int i, int i2) {
        this(r7, r8, null, i, i2);
    }

    static {
        int i;
        String[] strArr = new String[26];
        char[] toCharArray = "u\u001fImYt".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 49;
                    break;
                case at.g /*1*/:
                    i2 = 90;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 40;
                    break;
                default:
                    i2 = 13;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "}\u0015BgXe".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 49;
                    break;
                case at.g /*1*/:
                    i2 = 90;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 40;
                    break;
                default:
                    i2 = 13;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "}\tPj".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 49;
                    break;
                case at.g /*1*/:
                    i2 = 90;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 40;
                    break;
                default:
                    i2 = 13;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "b\u000eDzYe\u0016V".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 49;
                    break;
                case at.g /*1*/:
                    i2 = 90;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 40;
                    break;
                default:
                    i2 = 13;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "p\u000fQ`H\u007f\u000eLkLe\u001f".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 49;
                    break;
                case at.g /*1*/:
                    i2 = 90;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 40;
                    break;
                default:
                    i2 = 13;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = "}\u0015BaC".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 49;
                    break;
                case at.g /*1*/:
                    i2 = 90;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 40;
                    break;
                default:
                    i2 = 13;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[5] = new String(cArr).intern();
        toCharArray = "r\u001bUiOx\u0016L|T".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 49;
                    break;
                case at.g /*1*/:
                    i2 = 90;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 40;
                    break;
                default:
                    i2 = 13;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[6] = new String(cArr).intern();
        toCharArray = "b\u000eJzH".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 49;
                    break;
                case at.g /*1*/:
                    i2 = 90;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 40;
                    break;
                default:
                    i2 = 13;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[7] = new String(cArr).intern();
        toCharArray = "r\u0015Uq".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 49;
                    break;
                case at.g /*1*/:
                    i2 = 90;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 40;
                    break;
                default:
                    i2 = 13;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[8] = new String(cArr).intern();
        toCharArray = "d\u0014V}Ob\u0019WaOt".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 49;
                    break;
                case at.g /*1*/:
                    i2 = 90;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 40;
                    break;
                default:
                    i2 = 13;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[9] = new String(cArr).intern();
        toCharArray = "b\u000eD|Xb".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 49;
                    break;
                case at.g /*1*/:
                    i2 = 90;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 40;
                    break;
                default:
                    i2 = 13;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[10] = new String(cArr).intern();
        toCharArray = "c\u001fKi@t".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 49;
                    break;
                case at.g /*1*/:
                    i2 = 90;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 40;
                    break;
                default:
                    i2 = 13;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[11] = new String(cArr).intern();
        toCharArray = "t\u0002DeD\u007f\u001f".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 49;
                    break;
                case at.g /*1*/:
                    i2 = 90;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 40;
                    break;
                default:
                    i2 = 13;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[12] = new String(cArr).intern();
        toCharArray = "r\b@iYt".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 49;
                    break;
                case at.g /*1*/:
                    i2 = 90;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 40;
                    break;
                default:
                    i2 = 13;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[13] = new String(cArr).intern();
        toCharArray = "r\u0012@kF".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 49;
                    break;
                case at.g /*1*/:
                    i2 = 90;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 40;
                    break;
                default:
                    i2 = 13;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[14] = new String(cArr).intern();
        toCharArray = "i\u0015D}Yy".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 49;
                    break;
                case at.g /*1*/:
                    i2 = 90;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 40;
                    break;
                default:
                    i2 = 13;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[15] = new String(cArr).intern();
        toCharArray = "b\u000fG{Nc\u0013Gm".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 49;
                    break;
                case at.g /*1*/:
                    i2 = 90;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 40;
                    break;
                default:
                    i2 = 13;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[16] = new String(cArr).intern();
        toCharArray = "}\u0013V|".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 49;
                    break;
                case at.g /*1*/:
                    i2 = 90;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 40;
                    break;
                default:
                    i2 = 13;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[17] = new String(cArr).intern();
        toCharArray = "p\nUmCu".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 49;
                    break;
                case at.g /*1*/:
                    i2 = 90;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 40;
                    break;
                default:
                    i2 = 13;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[18] = new String(cArr).intern();
        toCharArray = "b\u001fDzNy".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 49;
                    break;
                case at.g /*1*/:
                    i2 = 90;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 40;
                    break;
                default:
                    i2 = 13;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[19] = new String(cArr).intern();
        toCharArray = "t\u0002U}Cv\u001f".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 49;
                    break;
                case at.g /*1*/:
                    i2 = 90;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 40;
                    break;
                default:
                    i2 = 13;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[20] = new String(cArr).intern();
        toCharArray = "r\u0016J{H".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 49;
                    break;
                case at.g /*1*/:
                    i2 = 90;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 40;
                    break;
                default:
                    i2 = 13;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[21] = new String(cArr).intern();
        toCharArray = "b\u001fImNe".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 49;
                    break;
                case at.g /*1*/:
                    i2 = 90;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 40;
                    break;
                default:
                    i2 = 13;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[22] = new String(cArr).intern();
        toCharArray = "d\u0013A".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 49;
                    break;
                case at.g /*1*/:
                    i2 = 90;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 40;
                    break;
                default:
                    i2 = 13;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[23] = new String(cArr).intern();
        toCharArray = "w\u001fQkE".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 49;
                    break;
                case at.g /*1*/:
                    i2 = 90;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 40;
                    break;
                default:
                    i2 = 13;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[24] = new String(cArr).intern();
        toCharArray = "\u007f\u0015Jx".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 49;
                    break;
                case at.g /*1*/:
                    i2 = 90;
                    break;
                case at.i /*2*/:
                    i2 = 5;
                    break;
                case at.o /*3*/:
                    i2 = 40;
                    break;
                default:
                    i2 = 13;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[25] = new String(cArr).intern();
        z = strArr;
        CAPABILITY = new b(z[6], 0, 0);
        NOOP = new b(z[25], 1, 0);
        LOGOUT = new b(z[1], 2, 0);
        STARTTLS = new b(z[3], 3, 0);
        AUTHENTICATE = new b(z[4], 4, 1);
        LOGIN = new b(z[5], 5, 2);
        XOAUTH = new b(z[15], 6, 1);
        SELECT = new b(z[22], 7, 1);
        EXAMINE = new b(z[12], 8, 1);
        CREATE = new b(z[13], 9, 1);
        DELETE = new b(z[0], 10, 1);
        RENAME = new b(z[11], 11, 2);
        SUBSCRIBE = new b(z[16], 12, 1);
        UNSUBSCRIBE = new b(z[9], 13, 1);
        LIST = new b(z[17], 14, 2);
        LSUB = new b(z[2], 15, 2);
        STATUS = new b(z[10], 16, 2);
        APPEND = new b(z[18], 17, 2, 4);
        CHECK = new b(z[14], 18, 0);
        CLOSE = new b(z[21], 19, 0);
        EXPUNGE = new b(z[20], 20, 0);
        SEARCH = new b(z[19], 21, 1, Integer.MAX_VALUE);
        FETCH = new b(z[24], 22, 2);
        STORE = new b(z[7], 23, 3);
        COPY = new b(z[8], 24, 2);
        UID = new b(z[23], 25, 2, Integer.MAX_VALUE);
        b = new b[]{CAPABILITY, NOOP, LOGOUT, STARTTLS, AUTHENTICATE, LOGIN, XOAUTH, SELECT, EXAMINE, CREATE, DELETE, RENAME, SUBSCRIBE, UNSUBSCRIBE, LIST, LSUB, STATUS, APPEND, CHECK, CLOSE, EXPUNGE, SEARCH, FETCH, STORE, COPY, UID};
    }

    private b(int i) {
        this(r7, r8, null, i, i);
    }

    private b(String str, int i, int i2) {
        this.a = str;
        this.d = i;
        this.c = i2;
    }

    public static final String getCommand(b bVar) {
        return bVar.getIMAPCommand();
    }

    private b(String str) {
        this(r2, r3, str, 0);
    }
}
