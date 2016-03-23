package android.support.v7.graphics;

import android.graphics.Color;
import android.support.v4.graphics.ColorUtils;
import android.support.v7.graphics.Palette.Filter;
import android.support.v7.graphics.Palette.Swatch;
import android.util.TimingLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import org.v;
import org.whispersystems.at;

final class ColorCutQuantizer {
    private static final Comparator VBOX_COMPARATOR_VOLUME;
    final int[] mColors;
    final Filter[] mFilters;
    final int[] mHistogram;
    final List mQuantizedColors;
    private final float[] mTempHsl;
    final TimingLogger mTimingLogger;

    final class 1 implements Comparator {
        public int compare(Vbox vbox, Vbox vbox2) {
            return vbox2.getVolume() - vbox.getVolume();
        }

        public int compare(Object obj, Object obj2) {
            return compare((Vbox) obj, (Vbox) obj2);
        }

        1() {
        }
    }

    class Vbox {
        private static final String z;
        private int mLowerIndex;
        private int mMaxBlue;
        private int mMaxGreen;
        private int mMaxRed;
        private int mMinBlue;
        private int mMinGreen;
        private int mMinRed;
        private int mPopulation;
        private int mUpperIndex;
        final ColorCutQuantizer this$0;

        static {
            char[] toCharArray = "}f;SBQsu\u0000\\Rn!SM\u001ee:\u000b\fIn!\u001b\fQi9\n\f\u000f'6\u001c@Qu".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 62;
                        break;
                    case at.g /*1*/:
                        i2 = 7;
                        break;
                    case at.i /*2*/:
                        i2 = 85;
                        break;
                    case at.o /*3*/:
                        i2 = 115;
                        break;
                    default:
                        i2 = 44;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        final Vbox splitBox() {
            try {
                if (canSplit()) {
                    int findSplitPoint = findSplitPoint();
                    Vbox vbox = new Vbox(this.this$0, findSplitPoint + 1, this.mUpperIndex);
                    this.mUpperIndex = findSplitPoint;
                    fitBox();
                    return vbox;
                }
                throw new IllegalStateException(z);
            } catch (IllegalStateException e) {
                throw e;
            }
        }

        final int getColorCount() {
            return (this.mUpperIndex + 1) - this.mLowerIndex;
        }

        final Swatch getAverageColor() {
            int i = 0;
            int i2 = Swatch.a;
            int[] iArr = this.this$0.mColors;
            int[] iArr2 = this.this$0.mHistogram;
            int i3 = this.mLowerIndex;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (i3 <= this.mUpperIndex) {
                int i7 = iArr[i3];
                int i8 = iArr2[i7];
                i += i8;
                i6 += ColorCutQuantizer.access$000(i7) * i8;
                i5 += ColorCutQuantizer.access$100(i7) * i8;
                i4 += ColorCutQuantizer.access$200(i7) * i8;
                i3++;
                if (i2 != 0) {
                    break;
                }
            }
            return new Swatch(ColorCutQuantizer.access$400(Math.round(((float) i6) / ((float) i)), Math.round(((float) i5) / ((float) i)), Math.round(((float) i4) / ((float) i))), i);
        }

        final int findSplitPoint() {
            int i = Swatch.a;
            int longestColorDimension = getLongestColorDimension();
            int[] iArr = this.this$0.mColors;
            int[] iArr2 = this.this$0.mHistogram;
            ColorCutQuantizer.access$300(iArr, longestColorDimension, this.mLowerIndex, this.mUpperIndex);
            Arrays.sort(iArr, this.mLowerIndex, this.mUpperIndex + 1);
            ColorCutQuantizer.access$300(iArr, longestColorDimension, this.mLowerIndex, this.mUpperIndex);
            int i2 = this.mPopulation / 2;
            int i3 = this.mLowerIndex;
            longestColorDimension = 0;
            while (i3 <= this.mUpperIndex) {
                longestColorDimension += iArr2[iArr[i3]];
                if (longestColorDimension < i2) {
                    i3++;
                    if (i != 0) {
                        break;
                    }
                }
                return i3;
            }
            return this.mLowerIndex;
        }

        final int getLongestColorDimension() {
            int i = this.mMaxRed - this.mMinRed;
            int i2 = this.mMaxGreen - this.mMinGreen;
            int i3 = this.mMaxBlue - this.mMinBlue;
            if (i >= i2 && i >= i3) {
                return -3;
            }
            if (i2 < i || i2 < i3) {
                return -1;
            }
            return -2;
        }

        final int getVolume() {
            return (((this.mMaxRed - this.mMinRed) + 1) * ((this.mMaxGreen - this.mMinGreen) + 1)) * ((this.mMaxBlue - this.mMinBlue) + 1);
        }

        final boolean canSplit() {
            try {
                return getColorCount() > 1;
            } catch (IllegalStateException e) {
                throw e;
            }
        }

        Vbox(ColorCutQuantizer colorCutQuantizer, int i, int i2) {
            this.this$0 = colorCutQuantizer;
            this.mLowerIndex = i;
            this.mUpperIndex = i2;
            fitBox();
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        final void fitBox() {
            /*
            r14 = this;
            r11 = android.support.v7.graphics.Palette.Swatch.a;
            r0 = r14.this$0;
            r12 = r0.mColors;
            r0 = r14.this$0;
            r13 = r0.mHistogram;
            r3 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
            r2 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
            r1 = 0;
            r0 = r14.mLowerIndex;
            r4 = r2;
            r5 = r3;
            r6 = r3;
            r7 = r3;
            r3 = r2;
        L_0x0017:
            r8 = r14.mUpperIndex;
            if (r0 > r8) goto L_0x0042;
        L_0x001b:
            r8 = r12[r0];
            r9 = r13[r8];
            r1 = r1 + r9;
            r10 = android.support.v7.graphics.ColorCutQuantizer.access$000(r8);
            r9 = android.support.v7.graphics.ColorCutQuantizer.access$100(r8);
            r8 = android.support.v7.graphics.ColorCutQuantizer.access$200(r8);
            if (r10 <= r4) goto L_0x002f;
        L_0x002e:
            r4 = r10;
        L_0x002f:
            if (r10 >= r7) goto L_0x0032;
        L_0x0031:
            r7 = r10;
        L_0x0032:
            if (r9 <= r3) goto L_0x0035;
        L_0x0034:
            r3 = r9;
        L_0x0035:
            if (r9 >= r6) goto L_0x0038;
        L_0x0037:
            r6 = r9;
        L_0x0038:
            if (r8 <= r2) goto L_0x003b;
        L_0x003a:
            r2 = r8;
        L_0x003b:
            if (r8 >= r5) goto L_0x003e;
        L_0x003d:
            r5 = r8;
        L_0x003e:
            r0 = r0 + 1;
            if (r11 == 0) goto L_0x0017;
        L_0x0042:
            r14.mMinRed = r7;	 Catch:{ IllegalStateException -> 0x0059 }
            r14.mMaxRed = r4;	 Catch:{ IllegalStateException -> 0x0059 }
            r14.mMinGreen = r6;	 Catch:{ IllegalStateException -> 0x0059 }
            r14.mMaxGreen = r3;	 Catch:{ IllegalStateException -> 0x0059 }
            r14.mMinBlue = r5;	 Catch:{ IllegalStateException -> 0x0059 }
            r14.mMaxBlue = r2;	 Catch:{ IllegalStateException -> 0x0059 }
            r14.mPopulation = r1;	 Catch:{ IllegalStateException -> 0x0059 }
            r0 = android.support.v7.graphics.Palette.a;	 Catch:{ IllegalStateException -> 0x0059 }
            if (r0 == 0) goto L_0x0058;
        L_0x0054:
            r0 = r11 + 1;
            android.support.v7.graphics.Palette.Swatch.a = r0;	 Catch:{ IllegalStateException -> 0x0059 }
        L_0x0058:
            return;
        L_0x0059:
            r0 = move-exception;
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.graphics.ColorCutQuantizer.Vbox.fitBox():void");
        }
    }

    static int access$000(int i) {
        return quantizedRed(i);
    }

    private static void modifySignificantOctet(int[] iArr, int i, int i2, int i3) {
        int i4 = Swatch.a;
        switch (i) {
            case -3:
                if (i4 == 0) {
                    return;
                }
                break;
            case -2:
                break;
            case -1:
                break;
            default:
                return;
        }
        int i5 = i2;
        while (i5 <= i3) {
            int i6 = iArr[i5];
            iArr[i5] = quantizedBlue(i6) | ((quantizedGreen(i6) << 10) | (quantizedRed(i6) << 5));
            i5++;
            if (i4 != 0) {
                if (i4 == 0) {
                    return;
                }
                while (i2 <= i3) {
                    i5 = iArr[i2];
                    iArr[i2] = quantizedRed(i5) | ((quantizedBlue(i5) << 10) | (quantizedGreen(i5) << 5));
                    i2++;
                    if (i4 != 0) {
                        return;
                    }
                }
            }
        }
        if (i4 == 0) {
            return;
        }
        while (i2 <= i3) {
            i5 = iArr[i2];
            iArr[i2] = quantizedRed(i5) | ((quantizedBlue(i5) << 10) | (quantizedGreen(i5) << 5));
            i2++;
            if (i4 != 0) {
                return;
            }
        }
    }

    private boolean shouldIgnoreColor(int i) {
        int approximateToRgb888 = approximateToRgb888(i);
        ColorUtils.colorToHSL(approximateToRgb888, this.mTempHsl);
        return shouldIgnoreColor(approximateToRgb888, this.mTempHsl);
    }

    static void access$300(int[] iArr, int i, int i2, int i3) {
        modifySignificantOctet(iArr, i, i2, i3);
    }

    private void splitBoxes(PriorityQueue priorityQueue, int i) {
        int i2 = Swatch.a;
        while (priorityQueue.size() < i) {
            Vbox vbox = (Vbox) priorityQueue.poll();
            if (vbox != null && vbox.canSplit()) {
                priorityQueue.offer(vbox.splitBox());
                priorityQueue.offer(vbox);
                if (i2 == 0) {
                    if (i2 != 0) {
                        return;
                    }
                }
                return;
            }
            return;
        }
    }

    private static int quantizedRed(int i) {
        return (i >> 10) & 31;
    }

    private List generateAverageColors(Collection collection) {
        int i = Swatch.a;
        List arrayList = new ArrayList(collection.size());
        for (Vbox averageColor : collection) {
            Swatch averageColor2 = averageColor.getAverageColor();
            if (!shouldIgnoreColor(averageColor2)) {
                arrayList.add(averageColor2);
                continue;
            }
            if (i != 0) {
                break;
            }
        }
        return arrayList;
    }

    private static int quantizedGreen(int i) {
        return (i >> 5) & 31;
    }

    private boolean shouldIgnoreColor(Swatch swatch) {
        return shouldIgnoreColor(swatch.getRgb(), swatch.getHsl());
    }

    ColorCutQuantizer(int[] iArr, int i, Filter[] filterArr) {
        int quantizeFromRgb888;
        int[] iArr2;
        int i2;
        int i3 = 0;
        int i4 = Swatch.a;
        this.mTempHsl = new float[3];
        this.mTimingLogger = null;
        this.mFilters = filterArr;
        int[] iArr3 = new int[32768];
        this.mHistogram = iArr3;
        int i5 = 0;
        while (i5 < iArr.length) {
            quantizeFromRgb888 = quantizeFromRgb888(iArr[i5]);
            iArr[i5] = quantizeFromRgb888;
            iArr3[quantizeFromRgb888] = iArr3[quantizeFromRgb888] + 1;
            i5++;
            if (i4 != 0) {
                Palette.a = !Palette.a;
                i5 = 0;
                quantizeFromRgb888 = 0;
                while (i5 < iArr3.length) {
                    if (iArr3[i5] > 0 && shouldIgnoreColor(i5)) {
                        iArr3[i5] = 0;
                    }
                    if (iArr3[i5] > 0) {
                        quantizeFromRgb888++;
                    }
                    i5++;
                    if (i4 != 0) {
                        break;
                    }
                }
                iArr2 = new int[quantizeFromRgb888];
                this.mColors = iArr2;
                i5 = 0;
                i2 = 0;
                while (i5 < iArr3.length) {
                    if (iArr3[i5] > 0) {
                        int i6 = i2 + 1;
                        iArr2[i2] = i5;
                        i2 = i6;
                    }
                    i5++;
                    if (i4 != 0) {
                        break;
                    }
                }
                if (quantizeFromRgb888 <= i) {
                    this.mQuantizedColors = new ArrayList();
                    i5 = iArr2.length;
                    while (i3 < i5) {
                        quantizeFromRgb888 = iArr2[i3];
                        this.mQuantizedColors.add(new Swatch(approximateToRgb888(quantizeFromRgb888), iArr3[quantizeFromRgb888]));
                        i3++;
                        if (i4 != 0) {
                            return;
                        }
                    }
                    return;
                }
                this.mQuantizedColors = quantizePixels(i);
            }
        }
        i5 = 0;
        quantizeFromRgb888 = 0;
        while (i5 < iArr3.length) {
            iArr3[i5] = 0;
            if (iArr3[i5] > 0) {
                quantizeFromRgb888++;
            }
            i5++;
            if (i4 != 0) {
                break;
                iArr2 = new int[quantizeFromRgb888];
                this.mColors = iArr2;
                i5 = 0;
                i2 = 0;
                while (i5 < iArr3.length) {
                    if (iArr3[i5] > 0) {
                        int i62 = i2 + 1;
                        iArr2[i2] = i5;
                        i2 = i62;
                    }
                    i5++;
                    if (i4 != 0) {
                        break;
                        if (quantizeFromRgb888 <= i) {
                            this.mQuantizedColors = quantizePixels(i);
                        }
                        this.mQuantizedColors = new ArrayList();
                        i5 = iArr2.length;
                        while (i3 < i5) {
                            quantizeFromRgb888 = iArr2[i3];
                            this.mQuantizedColors.add(new Swatch(approximateToRgb888(quantizeFromRgb888), iArr3[quantizeFromRgb888]));
                            i3++;
                            if (i4 != 0) {
                                return;
                            }
                        }
                        return;
                    }
                }
                if (quantizeFromRgb888 <= i) {
                    this.mQuantizedColors = new ArrayList();
                    i5 = iArr2.length;
                    while (i3 < i5) {
                        quantizeFromRgb888 = iArr2[i3];
                        this.mQuantizedColors.add(new Swatch(approximateToRgb888(quantizeFromRgb888), iArr3[quantizeFromRgb888]));
                        i3++;
                        if (i4 != 0) {
                            return;
                        }
                    }
                    return;
                }
                this.mQuantizedColors = quantizePixels(i);
            }
        }
        iArr2 = new int[quantizeFromRgb888];
        this.mColors = iArr2;
        i5 = 0;
        i2 = 0;
        while (i5 < iArr3.length) {
            if (iArr3[i5] > 0) {
                int i622 = i2 + 1;
                iArr2[i2] = i5;
                i2 = i622;
            }
            i5++;
            if (i4 != 0) {
                break;
                if (quantizeFromRgb888 <= i) {
                    this.mQuantizedColors = quantizePixels(i);
                }
                this.mQuantizedColors = new ArrayList();
                i5 = iArr2.length;
                while (i3 < i5) {
                    quantizeFromRgb888 = iArr2[i3];
                    this.mQuantizedColors.add(new Swatch(approximateToRgb888(quantizeFromRgb888), iArr3[quantizeFromRgb888]));
                    i3++;
                    if (i4 != 0) {
                        return;
                    }
                }
                return;
            }
        }
        if (quantizeFromRgb888 <= i) {
            this.mQuantizedColors = new ArrayList();
            i5 = iArr2.length;
            while (i3 < i5) {
                quantizeFromRgb888 = iArr2[i3];
                this.mQuantizedColors.add(new Swatch(approximateToRgb888(quantizeFromRgb888), iArr3[quantizeFromRgb888]));
                i3++;
                if (i4 != 0) {
                    return;
                }
            }
            return;
        }
        this.mQuantizedColors = quantizePixels(i);
    }

    private List quantizePixels(int i) {
        Collection priorityQueue = new PriorityQueue(i, VBOX_COMPARATOR_VOLUME);
        priorityQueue.offer(new Vbox(this, 0, this.mColors.length - 1));
        splitBoxes(priorityQueue, i);
        return generateAverageColors(priorityQueue);
    }

    List getQuantizedColors() {
        return this.mQuantizedColors;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int modifyWordWidth(int r2, int r3, int r4) {
        /*
        if (r4 <= r3) goto L_0x000a;
    L_0x0002:
        r0 = r4 - r3;
        r0 = r2 << r0;
        r1 = android.support.v7.graphics.Palette.Swatch.a;
        if (r1 == 0) goto L_0x000e;
    L_0x000a:
        r0 = r3 - r4;
        r0 = r2 >> r0;
    L_0x000e:
        r1 = 1;
        r1 = r1 << r4;
        r1 = r1 + -1;
        r0 = r0 & r1;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.graphics.ColorCutQuantizer.modifyWordWidth(int, int, int):int");
    }

    static {
        VBOX_COMPARATOR_VOLUME = new 1();
    }

    static int access$400(int i, int i2, int i3) {
        return approximateToRgb888(i, i2, i3);
    }

    private static int quantizedBlue(int i) {
        return i & 31;
    }

    static int access$100(int i) {
        return quantizedGreen(i);
    }

    private static int approximateToRgb888(int i) {
        return approximateToRgb888(quantizedRed(i), quantizedGreen(i), quantizedBlue(i));
    }

    private static int quantizeFromRgb888(int i) {
        return ((modifyWordWidth(Color.red(i), 8, 5) << 10) | (modifyWordWidth(Color.green(i), 8, 5) << 5)) | modifyWordWidth(Color.blue(i), 8, 5);
    }

    private boolean shouldIgnoreColor(int i, float[] fArr) {
        int i2 = Swatch.a;
        if (this.mFilters == null || this.mFilters.length <= 0) {
            return false;
        }
        int length = this.mFilters.length;
        int i3 = 0;
        while (i3 < length) {
            if (!this.mFilters[i3].isAllowed(i, fArr)) {
                return true;
            }
            i3++;
            if (i2 != 0) {
                return false;
            }
        }
        return false;
    }

    static int access$200(int i) {
        return quantizedBlue(i);
    }

    private static int approximateToRgb888(int i, int i2, int i3) {
        return Color.rgb(modifyWordWidth(i, 5, 8), modifyWordWidth(i2, 5, 8), modifyWordWidth(i3, 5, 8));
    }
}
