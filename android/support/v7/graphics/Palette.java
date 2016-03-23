package android.support.v7.graphics;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.support.annotation.ColorInt;
import android.support.annotation.Nullable;
import android.support.v4.graphics.ColorUtils;
import android.support.v4.os.AsyncTaskCompat;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.v;
import org.whispersystems.at;

public final class Palette {
    private static final Filter DEFAULT_FILTER;
    public static boolean a;
    private final Generator mGenerator;
    private final List mSwatches;

    abstract class Generator {
        public abstract void generate(List list);

        public Swatch getMutedSwatch() {
            return null;
        }

        Generator() {
        }
    }

    public interface Filter {
        boolean isAllowed(int i, float[] fArr);
    }

    final class 1 implements Filter {
        private boolean isBlack(float[] fArr) {
            return fArr[2] <= 0.05f;
        }

        private boolean isNearRedILine(float[] fArr) {
            return fArr[0] >= 10.0f && fArr[0] <= 37.0f && fArr[1] <= 0.82f;
        }

        private boolean isWhite(float[] fArr) {
            return fArr[2] >= 0.95f;
        }

        1() {
        }

        public boolean isAllowed(int i, float[] fArr) {
            return (isWhite(fArr) || isBlack(fArr) || isNearRedILine(fArr)) ? false : true;
        }
    }

    public final class Builder {
        private static final String[] z;
        private final Bitmap mBitmap;
        private final List mFilters;
        private Generator mGenerator;
        private int mMaxColors;
        private Rect mRegion;
        private int mResizeMaxDimension;
        private final List mSwatches;

        class 1 extends AsyncTask {
            private static final String[] z;
            final Builder this$0;
            final PaletteAsyncListener val$listener;

            static {
                String[] strArr = new String[2];
                String str = "jcQs\n[r]xZ[s@y\rA;Vc\bFuU6\u001b\\b\\uZH~\\s\bNoW";
                Object obj = -1;
                String[] strArr2 = strArr;
                String[] strArr3 = strArr;
                int i = 0;
                while (true) {
                    char[] toCharArray = str.toCharArray();
                    int length = toCharArray.length;
                    char[] cArr = toCharArray;
                    for (int i2 = 0; length > i2; i2++) {
                        int i3;
                        char c = cArr[i2];
                        switch (i2 % 5) {
                            case v.m /*0*/:
                                i3 = 47;
                                break;
                            case at.g /*1*/:
                                i3 = 27;
                                break;
                            case at.i /*2*/:
                                i3 = 50;
                                break;
                            case at.o /*3*/:
                                i3 = 22;
                                break;
                            default:
                                i3 = 122;
                                break;
                        }
                        cArr[i2] = (char) (i3 ^ c);
                    }
                    str = new String(cArr).intern();
                    switch (obj) {
                        case v.m /*0*/:
                            strArr2[i] = str;
                            z = strArr3;
                            return;
                        default:
                            strArr2[i] = str;
                            i = 1;
                            strArr2 = strArr3;
                            str = "\u007fz^s\u000e[~";
                            obj = null;
                    }
                }
            }

            1(Builder builder, PaletteAsyncListener paletteAsyncListener) {
                this.this$0 = builder;
                this.val$listener = paletteAsyncListener;
            }

            protected void onPostExecute(Object obj) {
                onPostExecute((Palette) obj);
            }

            protected Object doInBackground(Object[] objArr) {
                return doInBackground((Bitmap[]) objArr);
            }

            protected void onPostExecute(Palette palette) {
                this.val$listener.onGenerated(palette);
            }

            protected Palette doInBackground(Bitmap[] bitmapArr) {
                try {
                    return this.this$0.generate();
                } catch (Throwable e) {
                    Log.e(z[1], z[0], e);
                    return null;
                }
            }
        }

        static {
            String[] strArr = new String[7];
            String str = "Jp#3srtm>wj|#)whwm)w}|m<qu9??mnc$4y'j%5kk}m)vhl!>>e|md#'(";
            Object obj = -1;
            String[] strArr2 = strArr;
            String[] strArr3 = strArr;
            int i = 0;
            while (true) {
                char[] toCharArray = str.toCharArray();
                int length = toCharArray.length;
                char[] cArr = toCharArray;
                for (int i2 = 0; length > i2; i2++) {
                    int i3;
                    char c = cArr[i2];
                    switch (i2 % 5) {
                        case v.m /*0*/:
                            i3 = 7;
                            break;
                        case at.g /*1*/:
                            i3 = 25;
                            break;
                        case at.i /*2*/:
                            i3 = 77;
                            break;
                        case at.o /*3*/:
                            i3 = 90;
                            break;
                        default:
                            i3 = 30;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "@|#?lfm\"(0`|#?lfm(r7'z\"7nk|9?z";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        str = "Dk(;jb}m\n\u007fk|9.{";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        str = "Wk\"9{tj(>>Ep97\u007fw";
                        i = 4;
                        strArr2 = strArr3;
                        obj = 3;
                        break;
                    case at.o /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        strArr2 = strArr3;
                        str = "Ep97\u007fw9$)>iv9zhfu$>";
                        obj = 4;
                        break;
                    case at.p /*4*/:
                        strArr2[i] = str;
                        i = 6;
                        str = "kp>.{i|?z}fwm4qs9/?>il!6";
                        obj = 5;
                        strArr2 = strArr3;
                        break;
                    case at.m /*5*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "Dv!5l'h8;psp7;jnv#z}ht=6{s|)";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.support.v7.graphics.Palette generate() {
            /*
            r8 = this;
            r1 = 0;
            r2 = 0;
            r0 = r8.mBitmap;	 Catch:{ IllegalArgumentException -> 0x0017 }
            if (r0 == 0) goto L_0x009d;
        L_0x0006:
            r0 = r8.mResizeMaxDimension;	 Catch:{ IllegalArgumentException -> 0x0015 }
            if (r0 > 0) goto L_0x0019;
        L_0x000a:
            r0 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0015 }
            r1 = z;	 Catch:{ IllegalArgumentException -> 0x0015 }
            r2 = 0;
            r1 = r1[r2];	 Catch:{ IllegalArgumentException -> 0x0015 }
            r0.<init>(r1);	 Catch:{ IllegalArgumentException -> 0x0015 }
            throw r0;	 Catch:{ IllegalArgumentException -> 0x0015 }
        L_0x0015:
            r0 = move-exception;
            throw r0;
        L_0x0017:
            r0 = move-exception;
            throw r0;	 Catch:{ IllegalArgumentException -> 0x0015 }
        L_0x0019:
            r0 = r8.mBitmap;
            r3 = r8.mResizeMaxDimension;
            r3 = android.support.v7.graphics.Palette.access$100(r0, r3);
            if (r1 == 0) goto L_0x002b;
        L_0x0023:
            r0 = z;	 Catch:{ IllegalArgumentException -> 0x00ce }
            r4 = 4;
            r0 = r0[r4];	 Catch:{ IllegalArgumentException -> 0x00ce }
            r2.addSplit(r0);	 Catch:{ IllegalArgumentException -> 0x00ce }
        L_0x002b:
            r0 = r8.mRegion;
            r4 = r8.mBitmap;	 Catch:{ IllegalArgumentException -> 0x00d0 }
            if (r3 == r4) goto L_0x0070;
        L_0x0031:
            if (r0 == 0) goto L_0x0070;
        L_0x0033:
            r4 = r3.getWidth();
            r4 = (float) r4;
            r5 = r8.mBitmap;
            r5 = r5.getWidth();
            r5 = (float) r5;
            r4 = r4 / r5;
            r5 = r0.left;
            r5 = (float) r5;
            r5 = r5 * r4;
            r6 = (double) r5;
            r6 = java.lang.Math.floor(r6);
            r5 = (int) r6;
            r0.left = r5;
            r5 = r0.top;
            r5 = (float) r5;
            r5 = r5 * r4;
            r6 = (double) r5;
            r6 = java.lang.Math.floor(r6);
            r5 = (int) r6;
            r0.top = r5;
            r5 = r0.right;
            r5 = (float) r5;
            r5 = r5 * r4;
            r6 = (double) r5;
            r6 = java.lang.Math.ceil(r6);
            r5 = (int) r6;
            r0.right = r5;
            r5 = r0.bottom;
            r5 = (float) r5;
            r4 = r4 * r5;
            r4 = (double) r4;
            r4 = java.lang.Math.ceil(r4);
            r4 = (int) r4;
            r0.bottom = r4;
        L_0x0070:
            r4 = new android.support.v7.graphics.ColorCutQuantizer;	 Catch:{ IllegalArgumentException -> 0x00d2 }
            r5 = r8.getPixelsFromBitmap(r3);	 Catch:{ IllegalArgumentException -> 0x00d2 }
            r6 = r8.mMaxColors;	 Catch:{ IllegalArgumentException -> 0x00d2 }
            r0 = r8.mFilters;	 Catch:{ IllegalArgumentException -> 0x00d2 }
            r0 = r0.isEmpty();	 Catch:{ IllegalArgumentException -> 0x00d2 }
            if (r0 == 0) goto L_0x00d4;
        L_0x0080:
            r0 = r1;
        L_0x0081:
            r4.<init>(r5, r6, r0);
            r0 = r8.mBitmap;	 Catch:{ IllegalArgumentException -> 0x00e5 }
            if (r3 == r0) goto L_0x008b;
        L_0x0088:
            r3.recycle();	 Catch:{ IllegalArgumentException -> 0x00e5 }
        L_0x008b:
            r0 = r4.getQuantizedColors();
            if (r1 == 0) goto L_0x0099;
        L_0x0091:
            r3 = z;	 Catch:{ IllegalArgumentException -> 0x00e7 }
            r4 = 1;
            r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x00e7 }
            r2.addSplit(r3);	 Catch:{ IllegalArgumentException -> 0x00e7 }
        L_0x0099:
            r3 = android.support.v7.graphics.Palette.Swatch.a;
            if (r3 == 0) goto L_0x009f;
        L_0x009d:
            r0 = r8.mSwatches;
        L_0x009f:
            r3 = r8.mGenerator;	 Catch:{ IllegalArgumentException -> 0x00e9 }
            if (r3 != 0) goto L_0x00aa;
        L_0x00a3:
            r3 = new android.support.v7.graphics.DefaultGenerator;	 Catch:{ IllegalArgumentException -> 0x00e9 }
            r3.<init>();	 Catch:{ IllegalArgumentException -> 0x00e9 }
            r8.mGenerator = r3;	 Catch:{ IllegalArgumentException -> 0x00e9 }
        L_0x00aa:
            r3 = r8.mGenerator;	 Catch:{ IllegalArgumentException -> 0x00eb }
            r3.generate(r0);	 Catch:{ IllegalArgumentException -> 0x00eb }
            if (r1 == 0) goto L_0x00b9;
        L_0x00b1:
            r3 = z;	 Catch:{ IllegalArgumentException -> 0x00eb }
            r4 = 2;
            r3 = r3[r4];	 Catch:{ IllegalArgumentException -> 0x00eb }
            r2.addSplit(r3);	 Catch:{ IllegalArgumentException -> 0x00eb }
        L_0x00b9:
            r3 = new android.support.v7.graphics.Palette;
            r4 = r8.mGenerator;
            r3.<init>(r0, r4, r1);
            if (r1 == 0) goto L_0x00cd;
        L_0x00c2:
            r0 = z;	 Catch:{ IllegalArgumentException -> 0x00ed }
            r1 = 3;
            r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x00ed }
            r2.addSplit(r0);	 Catch:{ IllegalArgumentException -> 0x00ed }
            r2.dumpToLog();	 Catch:{ IllegalArgumentException -> 0x00ed }
        L_0x00cd:
            return r3;
        L_0x00ce:
            r0 = move-exception;
            throw r0;
        L_0x00d0:
            r0 = move-exception;
            throw r0;
        L_0x00d2:
            r0 = move-exception;
            throw r0;
        L_0x00d4:
            r0 = r8.mFilters;
            r7 = r8.mFilters;
            r7 = r7.size();
            r7 = new android.support.v7.graphics.Palette.Filter[r7];
            r0 = r0.toArray(r7);
            r0 = (android.support.v7.graphics.Palette.Filter[]) r0;
            goto L_0x0081;
        L_0x00e5:
            r0 = move-exception;
            throw r0;
        L_0x00e7:
            r0 = move-exception;
            throw r0;
        L_0x00e9:
            r0 = move-exception;
            throw r0;
        L_0x00eb:
            r0 = move-exception;
            throw r0;
        L_0x00ed:
            r0 = move-exception;
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.graphics.Palette.Builder.generate():android.support.v7.graphics.Palette");
        }

        private int[] getPixelsFromBitmap(Bitmap bitmap) {
            int i = 0;
            int i2 = Swatch.a;
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            Object obj = new int[(width * height)];
            try {
                if (this.mRegion == null) {
                    bitmap.getPixels(obj, 0, width, 0, 0, width, height);
                    return obj;
                }
                int width2 = this.mRegion.width();
                height = this.mRegion.height();
                bitmap.getPixels(obj, 0, width, this.mRegion.left, this.mRegion.top, width2, height);
                Object obj2 = new int[(width2 * height)];
                while (i < height) {
                    System.arraycopy(obj, ((this.mRegion.top + i) * width) + this.mRegion.left, obj2, i * width2, width2);
                    i++;
                    if (i2 != 0) {
                        break;
                    }
                }
                return obj2;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }

        public AsyncTask generate(PaletteAsyncListener paletteAsyncListener) {
            if (paletteAsyncListener == null) {
                try {
                    throw new IllegalArgumentException(z[6]);
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            return AsyncTaskCompat.executeParallel(new 1(this, paletteAsyncListener), new Bitmap[]{this.mBitmap});
        }

        public Builder(Bitmap bitmap) {
            this.mMaxColors = 16;
            this.mResizeMaxDimension = 192;
            this.mFilters = new ArrayList();
            if (bitmap != null) {
                try {
                    if (!bitmap.isRecycled()) {
                        this.mFilters.add(Palette.access$000());
                        this.mBitmap = bitmap;
                        this.mSwatches = null;
                        return;
                    }
                } catch (IllegalArgumentException e) {
                    throw e;
                }
            }
            throw new IllegalArgumentException(z[5]);
        }
    }

    public interface PaletteAsyncListener {
        void onGenerated(Palette palette);
    }

    public final class Swatch {
        public static int a;
        private static final String[] z;
        private final int mBlue;
        private int mBodyTextColor;
        private boolean mGeneratedTextColors;
        private final int mGreen;
        private float[] mHsl;
        private final int mPopulation;
        private final int mRed;
        private final int mRgb;
        private int mTitleTextColor;

        static {
            String[] strArr = new String[5];
            String str = "\b!Xsa]\u0016ihxG\u00142<";
            Object obj = -1;
            String[] strArr2 = strArr;
            String[] strArr3 = strArr;
            int i = 0;
            while (true) {
                char[] toCharArray = str.toCharArray();
                int length = toCharArray.length;
                char[] cArr = toCharArray;
                for (int i2 = 0; length > i2; i2++) {
                    int i3;
                    char c = cArr[i2];
                    switch (i2 % 5) {
                        case v.m /*0*/:
                            i3 = 40;
                            break;
                        case at.g /*1*/:
                            i3 = 122;
                            break;
                        case at.i /*2*/:
                            i3 = 8;
                            break;
                        case at.o /*3*/:
                            i3 = 28;
                            break;
                        default:
                            i3 = 17;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "\b!Z[S\u0012Z+";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        str = "\b!JsuQZ\\yi\\@(?";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        i = 4;
                        strArr2 = strArr3;
                        str = "\b!\\ueD\u001f(HtP\u000e2<2";
                        obj = 3;
                        break;
                    case at.o /*3*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "\b!@O]\u0012Z";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public int hashCode() {
            return (this.mRgb * 31) + this.mPopulation;
        }

        public float[] getHsl() {
            if (this.mHsl == null) {
                this.mHsl = new float[3];
                ColorUtils.RGBToHSL(this.mRed, this.mGreen, this.mBlue, this.mHsl);
            }
            return this.mHsl;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Swatch swatch = (Swatch) obj;
            if (this.mPopulation == swatch.mPopulation && this.mRgb == swatch.mRgb) {
                return true;
            }
            return false;
        }

        public String toString() {
            return new StringBuilder(getClass().getSimpleName()).append(z[2]).append(Integer.toHexString(getRgb())).append(']').append(z[1]).append(Arrays.toString(getHsl())).append(']').append(z[0]).append(this.mPopulation).append(']').append(z[4]).append(Integer.toHexString(getTitleTextColor())).append(']').append(z[3]).append(Integer.toHexString(getBodyTextColor())).append(']').toString();
        }

        @ColorInt
        public int getRgb() {
            return this.mRgb;
        }

        public Swatch(@ColorInt int i, int i2) {
            this.mRed = Color.red(i);
            this.mGreen = Color.green(i);
            this.mBlue = Color.blue(i);
            this.mRgb = i;
            this.mPopulation = i2;
        }

        public int getPopulation() {
            return this.mPopulation;
        }

        @ColorInt
        public int getTitleTextColor() {
            ensureTextColorsGenerated();
            return this.mTitleTextColor;
        }

        private void ensureTextColorsGenerated() {
            if (!this.mGeneratedTextColors) {
                int calculateMinimumAlpha = ColorUtils.calculateMinimumAlpha(-1, this.mRgb, 4.5f);
                int calculateMinimumAlpha2 = ColorUtils.calculateMinimumAlpha(-1, this.mRgb, 3.0f);
                if (calculateMinimumAlpha == -1 || calculateMinimumAlpha2 == -1) {
                    int calculateMinimumAlpha3 = ColorUtils.calculateMinimumAlpha(-16777216, this.mRgb, 4.5f);
                    int calculateMinimumAlpha4 = ColorUtils.calculateMinimumAlpha(-16777216, this.mRgb, 3.0f);
                    if (calculateMinimumAlpha3 == -1 || calculateMinimumAlpha3 == -1) {
                        this.mBodyTextColor = calculateMinimumAlpha != -1 ? ColorUtils.setAlphaComponent(-1, calculateMinimumAlpha) : ColorUtils.setAlphaComponent(-16777216, calculateMinimumAlpha3);
                        if (calculateMinimumAlpha2 != -1) {
                            calculateMinimumAlpha = ColorUtils.setAlphaComponent(-1, calculateMinimumAlpha2);
                        } else {
                            calculateMinimumAlpha = ColorUtils.setAlphaComponent(-16777216, calculateMinimumAlpha4);
                        }
                        this.mTitleTextColor = calculateMinimumAlpha;
                        this.mGeneratedTextColors = true;
                        return;
                    }
                    this.mBodyTextColor = ColorUtils.setAlphaComponent(-16777216, calculateMinimumAlpha3);
                    this.mTitleTextColor = ColorUtils.setAlphaComponent(-16777216, calculateMinimumAlpha4);
                    this.mGeneratedTextColors = true;
                    return;
                }
                this.mBodyTextColor = ColorUtils.setAlphaComponent(-1, calculateMinimumAlpha);
                this.mTitleTextColor = ColorUtils.setAlphaComponent(-1, calculateMinimumAlpha2);
                this.mGeneratedTextColors = true;
            }
        }

        @ColorInt
        public int getBodyTextColor() {
            ensureTextColorsGenerated();
            return this.mBodyTextColor;
        }
    }

    private Palette(List list, Generator generator) {
        this.mSwatches = list;
        this.mGenerator = generator;
    }

    private static Bitmap scaleBitmapDown(Bitmap bitmap, int i) {
        int max = Math.max(bitmap.getWidth(), bitmap.getHeight());
        if (max <= i) {
            return bitmap;
        }
        double d = ((double) i) / ((double) max);
        return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * d), (int) Math.ceil(d * ((double) bitmap.getHeight())), false);
    }

    public static Builder from(Bitmap bitmap) {
        return new Builder(bitmap);
    }

    static {
        DEFAULT_FILTER = new 1();
    }

    Palette(List list, Generator generator, 1 1) {
        this(list, generator);
    }

    @Nullable
    public Swatch getMutedSwatch() {
        return this.mGenerator.getMutedSwatch();
    }

    @Deprecated
    public static AsyncTask generateAsync(Bitmap bitmap, PaletteAsyncListener paletteAsyncListener) {
        return from(bitmap).generate(paletteAsyncListener);
    }

    static Filter access$000() {
        return DEFAULT_FILTER;
    }

    static Bitmap access$100(Bitmap bitmap, int i) {
        return scaleBitmapDown(bitmap, i);
    }
}
