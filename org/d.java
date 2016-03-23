package org;

import org.whispersystems.at;

public enum d {
    ;
    
    public static final d ALL;
    public static final d ANSWERED;
    public static final d BCC;
    public static final d BEFORE;
    public static final d BODY;
    public static final d CC;
    public static final d DELETED;
    public static final d DRAFT;
    public static final d FLAGGED;
    public static final d FROM;
    public static final d HEADER;
    public static final d KEYWORD;
    public static final d LARGER;
    public static final d NEW;
    public static final d NOT;
    public static final d OLD;
    public static final d ON;
    public static final d OR;
    public static final d RECENT;
    public static final d SEEN;
    public static final d SENTBEFORE;
    public static final d SENTON;
    public static final d SENTSINCE;
    public static final d SINCE;
    public static final d SMALLER;
    public static final d SUBJECT;
    public static final d TEXT;
    public static final d TO;
    public static final d UID;
    public static final d UNANSWERED;
    public static final d UNDELETED;
    public static final d UNDRAFT;
    public static final d UNFLAGGED;
    public static final d UNKEYWORD;
    public static final d UNSEEN;
    private static final d[] a;
    private static final String[] z;

    static {
        int i;
        int i2;
        String[] strArr = new String[35];
        char[] toCharArray = "!z\u0013(\u001a3s\u0010 ".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 116;
                    break;
                case at.g /*1*/:
                    i2 = 52;
                    break;
                case at.i /*2*/:
                    i2 = 85;
                    break;
                case at.o /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 91;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        strArr[0] = new String(cArr).intern();
        toCharArray = "!z\u0006!\u001e:".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            char c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 116;
                    break;
                case at.g /*1*/:
                    i2 = 52;
                    break;
                case at.i /*2*/:
                    i2 = 85;
                    break;
                case at.o /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 91;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[1] = new String(cArr).intern();
        toCharArray = "5x\u0019".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 116;
                    break;
                case at.g /*1*/:
                    i2 = 52;
                    break;
                case at.i /*2*/:
                    i2 = 85;
                    break;
                case at.o /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 91;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[2] = new String(cArr).intern();
        toCharArray = "6w\u0016".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 116;
                    break;
                case at.g /*1*/:
                    i2 = 52;
                    break;
                case at.i /*2*/:
                    i2 = 85;
                    break;
                case at.o /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 91;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[3] = new String(cArr).intern();
        toCharArray = "0f\u0014\"\u000f".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 116;
                    break;
                case at.g /*1*/:
                    i2 = 52;
                    break;
                case at.i /*2*/:
                    i2 = 85;
                    break;
                case at.o /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 91;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[4] = new String(cArr).intern();
        toCharArray = "'q\u001b0\u00191r\u001a6\u001e".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 116;
                    break;
                case at.g /*1*/:
                    i2 = 52;
                    break;
                case at.i /*2*/:
                    i2 = 85;
                    break;
                case at.o /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 91;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[5] = new String(cArr).intern();
        toCharArray = "'}\u001b'\u001e".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 116;
                    break;
                case at.g /*1*/:
                    i2 = 52;
                    break;
                case at.i /*2*/:
                    i2 = 85;
                    break;
                case at.o /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 91;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[6] = new String(cArr).intern();
        toCharArray = ":q\u0002".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 116;
                    break;
                case at.g /*1*/:
                    i2 = 52;
                    break;
                case at.i /*2*/:
                    i2 = 85;
                    break;
                case at.o /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 91;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[7] = new String(cArr).intern();
        toCharArray = " q\r0".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 116;
                    break;
                case at.g /*1*/:
                    i2 = 52;
                    break;
                case at.i /*2*/:
                    i2 = 85;
                    break;
                case at.o /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 91;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[8] = new String(cArr).intern();
        toCharArray = "2f\u001a)".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 116;
                    break;
                case at.g /*1*/:
                    i2 = 52;
                    break;
                case at.i /*2*/:
                    i2 = 85;
                    break;
                case at.o /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 91;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[9] = new String(cArr).intern();
        toCharArray = "7w".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 116;
                    break;
                case at.g /*1*/:
                    i2 = 52;
                    break;
                case at.i /*2*/:
                    i2 = 85;
                    break;
                case at.o /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 91;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[10] = new String(cArr).intern();
        toCharArray = "&q\u0016!\u0015 ".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 116;
                    break;
                case at.g /*1*/:
                    i2 = 52;
                    break;
                case at.i /*2*/:
                    i2 = 85;
                    break;
                case at.o /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 91;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[11] = new String(cArr).intern();
        toCharArray = "!z\u00116\u001a2`".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 116;
                    break;
                case at.g /*1*/:
                    i2 = 52;
                    break;
                case at.i /*2*/:
                    i2 = 85;
                    break;
                case at.o /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 91;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[12] = new String(cArr).intern();
        toCharArray = "<q\u0014 \u001e&".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 116;
                    break;
                case at.g /*1*/:
                    i2 = 52;
                    break;
                case at.i /*2*/:
                    i2 = 85;
                    break;
                case at.o /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 91;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[13] = new String(cArr).intern();
        toCharArray = " {".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 116;
                    break;
                case at.g /*1*/:
                    i2 = 52;
                    break;
                case at.i /*2*/:
                    i2 = 85;
                    break;
                case at.o /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 91;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[14] = new String(cArr).intern();
        toCharArray = "!}\u0011".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 116;
                    break;
                case at.g /*1*/:
                    i2 = 52;
                    break;
                case at.i /*2*/:
                    i2 = 85;
                    break;
                case at.o /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 91;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[15] = new String(cArr).intern();
        toCharArray = ";z".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 116;
                    break;
                case at.g /*1*/:
                    i2 = 52;
                    break;
                case at.i /*2*/:
                    i2 = 85;
                    break;
                case at.o /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 91;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[16] = new String(cArr).intern();
        toCharArray = "!z\u0011!\u00171`\u0010 ".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 116;
                    break;
                case at.g /*1*/:
                    i2 = 52;
                    break;
                case at.i /*2*/:
                    i2 = 85;
                    break;
                case at.o /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 91;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[17] = new String(cArr).intern();
        toCharArray = "'q\u0010*".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 116;
                    break;
                case at.g /*1*/:
                    i2 = 52;
                    break;
                case at.i /*2*/:
                    i2 = 85;
                    break;
                case at.o /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 91;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[18] = new String(cArr).intern();
        toCharArray = ":{\u0001".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 116;
                    break;
                case at.g /*1*/:
                    i2 = 52;
                    break;
                case at.i /*2*/:
                    i2 = 85;
                    break;
                case at.o /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 91;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[19] = new String(cArr).intern();
        toCharArray = "'q\u001b0\b=z\u0016!".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 116;
                    break;
                case at.g /*1*/:
                    i2 = 52;
                    break;
                case at.i /*2*/:
                    i2 = 85;
                    break;
                case at.o /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 91;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[20] = new String(cArr).intern();
        toCharArray = "6{\u0011=".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 116;
                    break;
                case at.g /*1*/:
                    i2 = 52;
                    break;
                case at.i /*2*/:
                    i2 = 85;
                    break;
                case at.o /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 91;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[21] = new String(cArr).intern();
        toCharArray = "'q\u001b0\u0014:".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 116;
                    break;
                case at.g /*1*/:
                    i2 = 52;
                    break;
                case at.i /*2*/:
                    i2 = 85;
                    break;
                case at.o /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 91;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[22] = new String(cArr).intern();
        toCharArray = "!z\u001e!\u0002#{\u0007 ".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 116;
                    break;
                case at.g /*1*/:
                    i2 = 52;
                    break;
                case at.i /*2*/:
                    i2 = 85;
                    break;
                case at.o /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 91;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[23] = new String(cArr).intern();
        toCharArray = ";x\u0011".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 116;
                    break;
                case at.g /*1*/:
                    i2 = 52;
                    break;
                case at.i /*2*/:
                    i2 = 85;
                    break;
                case at.o /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 91;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[24] = new String(cArr).intern();
        toCharArray = ";f".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 116;
                    break;
                case at.g /*1*/:
                    i2 = 52;
                    break;
                case at.i /*2*/:
                    i2 = 85;
                    break;
                case at.o /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 91;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[25] = new String(cArr).intern();
        toCharArray = "2x\u0014#\u001c1p".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 116;
                    break;
                case at.g /*1*/:
                    i2 = 52;
                    break;
                case at.i /*2*/:
                    i2 = 85;
                    break;
                case at.o /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 91;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[26] = new String(cArr).intern();
        toCharArray = "'y\u0014(\u00171f".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 116;
                    break;
                case at.g /*1*/:
                    i2 = 52;
                    break;
                case at.i /*2*/:
                    i2 = 85;
                    break;
                case at.o /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 91;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[27] = new String(cArr).intern();
        toCharArray = "8u\u0007#\u001e&".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 116;
                    break;
                case at.g /*1*/:
                    i2 = 52;
                    break;
                case at.i /*2*/:
                    i2 = 85;
                    break;
                case at.o /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 91;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[28] = new String(cArr).intern();
        toCharArray = "'a\u0017.\u001e7`".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 116;
                    break;
                case at.g /*1*/:
                    i2 = 52;
                    break;
                case at.i /*2*/:
                    i2 = 85;
                    break;
                case at.o /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 91;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[29] = new String(cArr).intern();
        toCharArray = "!z\u0014*\b#q\u0007!\u001f".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 116;
                    break;
                case at.g /*1*/:
                    i2 = 52;
                    break;
                case at.i /*2*/:
                    i2 = 85;
                    break;
                case at.o /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 91;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[30] = new String(cArr).intern();
        toCharArray = "5z\u00063\u001e&q\u0011".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 116;
                    break;
                case at.g /*1*/:
                    i2 = 52;
                    break;
                case at.i /*2*/:
                    i2 = 85;
                    break;
                case at.o /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 91;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[31] = new String(cArr).intern();
        toCharArray = "0q\u0019!\u000f1p".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 116;
                    break;
                case at.g /*1*/:
                    i2 = 52;
                    break;
                case at.i /*2*/:
                    i2 = 85;
                    break;
                case at.o /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 91;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[32] = new String(cArr).intern();
        toCharArray = "6q\u0013+\t1".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 116;
                    break;
                case at.g /*1*/:
                    i2 = 52;
                    break;
                case at.i /*2*/:
                    i2 = 85;
                    break;
                case at.o /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 91;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[33] = new String(cArr).intern();
        toCharArray = "?q\f3\u0014&p".toCharArray();
        length = toCharArray.length;
        cArr = toCharArray;
        for (i = 0; length > i; i++) {
            c2 = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 116;
                    break;
                case at.g /*1*/:
                    i2 = 52;
                    break;
                case at.i /*2*/:
                    i2 = 85;
                    break;
                case at.o /*3*/:
                    i2 = 100;
                    break;
                default:
                    i2 = 91;
                    break;
            }
            cArr[i] = (char) (i2 ^ c2);
        }
        strArr[34] = new String(cArr).intern();
        z = strArr;
        ALL = new d(z[2], 0);
        ANSWERED = new d(z[31], 1);
        BCC = new d(z[3], 2);
        BEFORE = new d(z[33], 3);
        BODY = new d(z[21], 4);
        CC = new d(z[10], 5);
        DELETED = new d(z[32], 6);
        DRAFT = new d(z[4], 7);
        FLAGGED = new d(z[26], 8);
        FROM = new d(z[9], 9);
        HEADER = new d(z[13], 10);
        KEYWORD = new d(z[34], 11);
        LARGER = new d(z[28], 12);
        NEW = new d(z[7], 13);
        NOT = new d(z[19], 14);
        OLD = new d(z[24], 15);
        ON = new d(z[16], 16);
        OR = new d(z[25], 17);
        RECENT = new d(z[11], 18);
        SEEN = new d(z[18], 19);
        SENTBEFORE = new d(z[5], 20);
        SENTON = new d(z[22], 21);
        SENTSINCE = new d(z[20], 22);
        SINCE = new d(z[6], 23);
        SMALLER = new d(z[27], 24);
        SUBJECT = new d(z[29], 25);
        TEXT = new d(z[8], 26);
        TO = new d(z[14], 27);
        UID = new d(z[15], 28);
        UNANSWERED = new d(z[30], 29);
        UNDELETED = new d(z[17], 30);
        UNDRAFT = new d(z[12], 31);
        UNFLAGGED = new d(z[0], 32);
        UNKEYWORD = new d(z[23], 33);
        UNSEEN = new d(z[1], 34);
        a = new d[]{ALL, ANSWERED, BCC, BEFORE, BODY, CC, DELETED, DRAFT, FLAGGED, FROM, HEADER, KEYWORD, LARGER, NEW, NOT, OLD, ON, OR, RECENT, SEEN, SENTBEFORE, SENTON, SENTSINCE, SINCE, SMALLER, SUBJECT, TEXT, TO, UID, UNANSWERED, UNDELETED, UNDRAFT, UNFLAGGED, UNKEYWORD, UNSEEN};
    }
}
