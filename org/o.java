package org;

import org.whispersystems.at;

public enum o {
    ;
    
    public static final o ABOR;
    public static final o ABORT;
    public static final o ACCOUNT;
    public static final o ACCT;
    public static final o ALLO;
    public static final o ALLOCATE;
    public static final o APPE;
    public static final o APPEND;
    public static final o CDUP;
    public static final o CHANGE_TO_PARENT_DIRECTORY;
    public static final o CHANGE_WORKING_DIRECTORY;
    public static final o CWD;
    public static final o DATA_PORT;
    public static final o DELE;
    public static final o DELETE;
    public static final o EPRT;
    public static final o EPSV;
    public static final o FEAT;
    public static final o FEATURES;
    public static final o FILE_STRUCTURE;
    public static final o GET_MOD_TIME;
    public static final o HELP;
    public static final o LIST;
    public static final o LOGOUT;
    public static final o MAKE_DIRECTORY;
    public static final o MDTM;
    public static final o MFMT;
    public static final o MKD;
    public static final o MLSD;
    public static final o MLST;
    public static final o MODE;
    public static final o MOD_TIME;
    public static final o NAME_LIST;
    public static final o NLST;
    public static final o NOOP;
    public static final o PASS;
    public static final o PASSIVE;
    public static final o PASSWORD;
    public static final o PASV;
    public static final o PORT;
    public static final o PRINT_WORKING_DIRECTORY;
    public static final o PWD;
    public static final o QUIT;
    public static final o REIN;
    public static final o REINITIALIZE;
    public static final o REMOVE_DIRECTORY;
    public static final o RENAME_FROM;
    public static final o RENAME_TO;
    public static final o REPRESENTATION_TYPE;
    public static final o REST;
    public static final o RESTART;
    public static final o RETR;
    public static final o RETRIEVE;
    public static final o RMD;
    public static final o RNFR;
    public static final o RNTO;
    public static final o SET_MOD_TIME;
    public static final o SITE;
    public static final o SITE_PARAMETERS;
    public static final o SMNT;
    public static final o STAT;
    public static final o STATUS;
    public static final o STOR;
    public static final o STORE;
    public static final o STORE_UNIQUE;
    public static final o STOU;
    public static final o STRU;
    public static final o STRUCTURE_MOUNT;
    public static final o SYST;
    public static final o SYSTEM;
    public static final o TRANSFER_MODE;
    public static final o TYPE;
    public static final o USER;
    public static final o USERNAME;
    private static final String[] z;

    public final String getCommand() {
        return name();
    }

    static {
        int i;
        int i2;
        String[] strArr = new String[40];
        char[] toCharArray = "g\u0004lw".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 64;
                    break;
                case at.i /*2*/:
                    i2 = 56;
                    break;
                case at.o /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "y\u0014wo".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 64;
                    break;
                case at.i /*2*/:
                    i2 = 56;
                    break;
                case at.o /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "y\u0019kn".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 64;
                    break;
                case at.i /*2*/:
                    i2 = 56;
                    break;
                case at.o /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "i\u0017|".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 64;
                    break;
                case at.i /*2*/:
                    i2 = 56;
                    break;
                case at.o /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "y\tl\u007f".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 64;
                    break;
                case at.i /*2*/:
                    i2 = 56;
                    break;
                case at.o /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = "g\u000b|".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 64;
                    break;
                case at.i /*2*/:
                    i2 = 56;
                    break;
                case at.o /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[5] = new String(cArr).intern();
        toCharArray = "z\u0001kl".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 64;
                    break;
                case at.i /*2*/:
                    i2 = 56;
                    break;
                case at.o /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[6] = new String(cArr).intern();
        toCharArray = "y\rvn".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 64;
                    break;
                case at.i /*2*/:
                    i2 = 56;
                    break;
                case at.o /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[7] = new String(cArr).intern();
        toCharArray = "z\u000fjn".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 64;
                    break;
                case at.i /*2*/:
                    i2 = 56;
                    break;
                case at.o /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[8] = new String(cArr).intern();
        toCharArray = "f\tkn".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 64;
                    break;
                case at.i /*2*/:
                    i2 = 56;
                    break;
                case at.o /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[9] = new String(cArr).intern();
        toCharArray = "i\u0004mj".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 64;
                    break;
                case at.i /*2*/:
                    i2 = 56;
                    break;
                case at.o /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[10] = new String(cArr).intern();
        toCharArray = "z\u0001ki".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 64;
                    break;
                case at.i /*2*/:
                    i2 = 56;
                    break;
                case at.o /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[11] = new String(cArr).intern();
        toCharArray = "x\u000e~h".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 64;
                    break;
                case at.i /*2*/:
                    i2 = 56;
                    break;
                case at.o /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[12] = new String(cArr).intern();
        toCharArray = "g\u000f|\u007f".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 64;
                    break;
                case at.i /*2*/:
                    i2 = 56;
                    break;
                case at.o /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[13] = new String(cArr).intern();
        toCharArray = "n\u0005t\u007f".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 64;
                    break;
                case at.i /*2*/:
                    i2 = 56;
                    break;
                case at.o /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[14] = new String(cArr).intern();
        toCharArray = "d\u000fwj".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 64;
                    break;
                case at.i /*2*/:
                    i2 = 56;
                    break;
                case at.o /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[15] = new String(cArr).intern();
        toCharArray = "d\fkn".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 64;
                    break;
                case at.i /*2*/:
                    i2 = 56;
                    break;
                case at.o /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[16] = new String(cArr).intern();
        toCharArray = "k\ftu".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 64;
                    break;
                case at.i /*2*/:
                    i2 = 56;
                    break;
                case at.o /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[17] = new String(cArr).intern();
        toCharArray = "{\u0015qn".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 64;
                    break;
                case at.i /*2*/:
                    i2 = 56;
                    break;
                case at.o /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[18] = new String(cArr).intern();
        toCharArray = "k\u0003{n".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 64;
                    break;
                case at.i /*2*/:
                    i2 = 56;
                    break;
                case at.o /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[19] = new String(cArr).intern();
        toCharArray = "b\u0005tj".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 64;
                    break;
                case at.i /*2*/:
                    i2 = 56;
                    break;
                case at.o /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[20] = new String(cArr).intern();
        toCharArray = "g\u0006un".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 64;
                    break;
                case at.i /*2*/:
                    i2 = 56;
                    break;
                case at.o /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[21] = new String(cArr).intern();
        toCharArray = "x\u0005lh".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 64;
                    break;
                case at.i /*2*/:
                    i2 = 56;
                    break;
                case at.o /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[22] = new String(cArr).intern();
        toCharArray = "k\u0002wh".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 64;
                    break;
                case at.i /*2*/:
                    i2 = 56;
                    break;
                case at.o /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[23] = new String(cArr).intern();
        toCharArray = "\u007f\u0013}h".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 64;
                    break;
                case at.i /*2*/:
                    i2 = 56;
                    break;
                case at.o /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[24] = new String(cArr).intern();
        toCharArray = "x\u0005kn".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 64;
                    break;
                case at.i /*2*/:
                    i2 = 56;
                    break;
                case at.o /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[25] = new String(cArr).intern();
        toCharArray = "~\u0019h\u007f".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 64;
                    break;
                case at.i /*2*/:
                    i2 = 56;
                    break;
                case at.o /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[26] = new String(cArr).intern();
        toCharArray = "g\fkn".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 64;
                    break;
                case at.i /*2*/:
                    i2 = 56;
                    break;
                case at.o /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[27] = new String(cArr).intern();
        toCharArray = "x\u000elu".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 64;
                    break;
                case at.i /*2*/:
                    i2 = 56;
                    break;
                case at.o /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[28] = new String(cArr).intern();
        toCharArray = "g\fk~".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 64;
                    break;
                case at.i /*2*/:
                    i2 = 56;
                    break;
                case at.o /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[29] = new String(cArr).intern();
        toCharArray = "k\u0010h\u007f".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 64;
                    break;
                case at.i /*2*/:
                    i2 = 56;
                    break;
                case at.o /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[30] = new String(cArr).intern();
        toCharArray = "l\u0005yn".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 64;
                    break;
                case at.i /*2*/:
                    i2 = 56;
                    break;
                case at.o /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[31] = new String(cArr).intern();
        toCharArray = "o\u0010jn".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 64;
                    break;
                case at.i /*2*/:
                    i2 = 56;
                    break;
                case at.o /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[32] = new String(cArr).intern();
        toCharArray = "x\r|".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 64;
                    break;
                case at.i /*2*/:
                    i2 = 56;
                    break;
                case at.o /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[33] = new String(cArr).intern();
        toCharArray = "y\u0014jo".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 64;
                    break;
                case at.i /*2*/:
                    i2 = 56;
                    break;
                case at.o /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[34] = new String(cArr).intern();
        toCharArray = "z\u0017|".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 64;
                    break;
                case at.i /*2*/:
                    i2 = 56;
                    break;
                case at.o /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[35] = new String(cArr).intern();
        toCharArray = "y\u0014yn".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 64;
                    break;
                case at.i /*2*/:
                    i2 = 56;
                    break;
                case at.o /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[36] = new String(cArr).intern();
        toCharArray = "y\u0014wh".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 64;
                    break;
                case at.i /*2*/:
                    i2 = 56;
                    break;
                case at.o /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[37] = new String(cArr).intern();
        toCharArray = "o\u0010kl".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 64;
                    break;
                case at.i /*2*/:
                    i2 = 56;
                    break;
                case at.o /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[38] = new String(cArr).intern();
        toCharArray = "x\u0005qt".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 42;
                    break;
                case at.g /*1*/:
                    i2 = 64;
                    break;
                case at.i /*2*/:
                    i2 = 56;
                    break;
                case at.o /*3*/:
                    i2 = 58;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[39] = new String(cArr).intern();
        z = strArr;
        ABOR = new o(z[23], 0);
        ACCT = new o(z[19], 1);
        ALLO = new o(z[17], 2);
        APPE = new o(z[30], 3);
        CDUP = new o(z[10], 4);
        CWD = new o(z[3], 5);
        DELE = new o(z[14], 6);
        EPRT = new o(z[32], 7);
        EPSV = new o(z[38], 8);
        FEAT = new o(z[31], 9);
        HELP = new o(z[20], 10);
        LIST = new o(z[9], 11);
        MDTM = new o(z[0], 12);
        MFMT = new o(z[21], 13);
        MKD = new o(z[5], 14);
        MLSD = new o(z[29], 15);
        MLST = new o(z[27], 16);
        MODE = new o(z[13], 17);
        NLST = new o(z[16], 18);
        NOOP = new o(z[15], 19);
        PASS = new o(z[11], 20);
        PASV = new o(z[6], 21);
        PORT = new o(z[8], 22);
        PWD = new o(z[35], 23);
        QUIT = new o(z[18], 24);
        REIN = new o(z[39], 25);
        REST = new o(z[25], 26);
        RETR = new o(z[22], 27);
        RMD = new o(z[33], 28);
        RNFR = new o(z[12], 29);
        RNTO = new o(z[28], 30);
        SITE = new o(z[4], 31);
        SMNT = new o(z[7], 32);
        STAT = new o(z[36], 33);
        STOR = new o(z[37], 34);
        STOU = new o(z[1], 35);
        STRU = new o(z[34], 36);
        SYST = new o(z[2], 37);
        TYPE = new o(z[26], 38);
        USER = new o(z[24], 39);
        a = new o[]{ABOR, ACCT, ALLO, APPE, CDUP, CWD, DELE, EPRT, EPSV, FEAT, HELP, LIST, MDTM, MFMT, MKD, MLSD, MLST, MODE, NLST, NOOP, PASS, PASV, PORT, PWD, QUIT, REIN, REST, RETR, RMD, RNFR, RNTO, SITE, SMNT, STAT, STOR, STOU, STRU, SYST, TYPE, USER};
        ABORT = ABOR;
        ACCOUNT = ACCT;
        ALLOCATE = ALLO;
        APPEND = APPE;
        CHANGE_TO_PARENT_DIRECTORY = CDUP;
        CHANGE_WORKING_DIRECTORY = CWD;
        DATA_PORT = PORT;
        DELETE = DELE;
        FEATURES = FEAT;
        FILE_STRUCTURE = STRU;
        GET_MOD_TIME = MDTM;
        LOGOUT = QUIT;
        MAKE_DIRECTORY = MKD;
        MOD_TIME = MDTM;
        NAME_LIST = NLST;
        PASSIVE = PASV;
        PASSWORD = PASS;
        PRINT_WORKING_DIRECTORY = PWD;
        REINITIALIZE = REIN;
        REMOVE_DIRECTORY = RMD;
        RENAME_FROM = RNFR;
        RENAME_TO = RNTO;
        REPRESENTATION_TYPE = TYPE;
        RESTART = REST;
        RETRIEVE = RETR;
        SET_MOD_TIME = MFMT;
        SITE_PARAMETERS = SITE;
        STATUS = STAT;
        STORE = STOR;
        STORE_UNIQUE = STOU;
        STRUCTURE_MOUNT = SMNT;
        SYSTEM = SYST;
        TRANSFER_MODE = MODE;
        USERNAME = USER;
    }
}
