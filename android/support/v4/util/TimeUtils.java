package android.support.v4.util;

import java.io.PrintWriter;
import org.v;
import org.whispersystems.at;

public class TimeUtils {
    private static char[] sFormatStr;
    private static final Object sFormatSync;
    private static final String z;

    private static int accumField(int i, int i2, boolean z, int i3) {
        if (i > 99 || (z && i3 >= 3)) {
            return i2 + 3;
        }
        if (i > 9 || (z && i3 >= 2)) {
            return i2 + 2;
        }
        if (z || i > 0) {
            return i2 + 1;
        }
        return 0;
    }

    static {
        char[] toCharArray = "lV".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 65;
                    break;
                case at.g /*1*/:
                    i2 = 123;
                    break;
                case at.i /*2*/:
                    i2 = 31;
                    break;
                case at.o /*3*/:
                    i2 = 113;
                    break;
                default:
                    i2 = 75;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
        sFormatSync = new Object();
        sFormatStr = new char[24];
    }

    private static int formatDurationLocked(long j, int i) {
        boolean z = LruCache.a;
        if (sFormatStr.length < i) {
            sFormatStr = new char[i];
        }
        char[] cArr = sFormatStr;
        if (j == 0) {
            int i2 = i - 1;
            while (0 < i2) {
                cArr[0] = ' ';
                if (z) {
                    break;
                }
            }
            cArr[0] = '0';
            return 1;
        }
        char c;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Object obj;
        boolean z2;
        if (j <= 0 || z) {
            j = -j;
            c = '-';
        } else {
            c = '+';
        }
        int i8 = (int) (j % 1000);
        int floor = (int) Math.floor((double) (j / 1000));
        int i9 = 0;
        if (floor > 86400) {
            i9 = floor / 86400;
            floor -= 86400 * i9;
        }
        if (floor > 3600) {
            i3 = floor / 3600;
            i4 = i3;
            i3 = floor - (i3 * 3600);
        } else {
            i4 = 0;
            i3 = floor;
        }
        if (i3 > 60) {
            i5 = i3 / 60;
            i6 = i5;
            i7 = i3 - (i5 * 60);
        } else {
            i6 = 0;
            i7 = i3;
        }
        if (i != 0) {
            boolean z3;
            floor = accumField(i9, 1, false, 0);
            if (floor > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            floor += accumField(i4, 1, z3, 2);
            if (floor > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            floor += accumField(i6, 1, z3, 2);
            if (floor > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            floor += accumField(i7, 1, z3, 2);
            i5 = 0;
            i3 = (accumField(i8, 2, true, floor > 0 ? 3 : 0) + 1) + floor;
            while (i3 < i) {
                cArr[i5] = ' ';
                i5++;
                i3++;
                if (z) {
                    break;
                }
            }
        }
        i5 = 0;
        cArr[i5] = c;
        i5++;
        if (i != 0) {
            obj = 1;
        } else {
            obj = null;
        }
        int printField = printField(cArr, i9, 'd', i5, false, 0);
        if (printField != i5) {
            z2 = true;
        } else {
            z2 = false;
        }
        printField = printField(cArr, i4, 'h', printField, z2, obj != null ? 2 : 0);
        if (printField != i5) {
            z2 = true;
        } else {
            z2 = false;
        }
        printField = printField(cArr, i6, 'm', printField, z2, obj != null ? 2 : 0);
        if (printField != i5) {
            z2 = true;
        } else {
            z2 = false;
        }
        int printField2 = printField(cArr, i7, 's', printField, z2, obj != null ? 2 : 0);
        if (obj == null || printField2 == i5) {
            floor = 0;
        } else {
            floor = 3;
        }
        i9 = printField(cArr, i8, 'm', printField2, true, floor);
        cArr[i9] = 's';
        return i9 + 1;
    }

    public static void formatDuration(long j, PrintWriter printWriter, int i) {
        synchronized (sFormatSync) {
            printWriter.print(new String(sFormatStr, 0, formatDurationLocked(j, i)));
        }
    }

    public static void formatDuration(long j, PrintWriter printWriter) {
        formatDuration(j, printWriter, 0);
    }

    public static void formatDuration(long j, long j2, PrintWriter printWriter) {
        if (j == 0) {
            printWriter.print(z);
        } else {
            formatDuration(j - j2, printWriter, 0);
        }
    }

    private static int printField(char[] cArr, int i, char c, int i2, boolean z, int i3) {
        if (!z && i <= 0) {
            return i2;
        }
        int i4;
        int i5;
        if ((!z || i3 < 3) && i <= 99) {
            i4 = i2;
            i5 = i;
        } else {
            i5 = i / 100;
            cArr[i2] = (char) (i5 + 48);
            i4 = i2 + 1;
            i5 = i - (i5 * 100);
        }
        if ((z && i3 >= 2) || i5 > 9 || i2 != i4) {
            int i6 = i5 / 10;
            cArr[i4] = (char) (i6 + 48);
            i4++;
            i5 -= i6 * 10;
        }
        cArr[i4] = (char) (i5 + 48);
        i4++;
        cArr[i4] = c;
        return i4 + 1;
    }
}
