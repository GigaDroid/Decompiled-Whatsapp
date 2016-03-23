package android.support.v7.graphics;

import android.support.v4.graphics.ColorUtils;
import android.support.v7.graphics.Palette.Swatch;
import java.util.List;

class DefaultGenerator extends Generator {
    private Swatch mDarkMutedSwatch;
    private Swatch mDarkVibrantSwatch;
    private int mHighestPopulation;
    private Swatch mLightMutedSwatch;
    private Swatch mLightVibrantSwatch;
    private Swatch mMutedSwatch;
    private List mSwatches;
    private Swatch mVibrantSwatch;

    private static float[] copyHslValues(Swatch swatch) {
        Object obj = new float[3];
        System.arraycopy(swatch.getHsl(), 0, obj, 0, 3);
        return obj;
    }

    private int findMaxPopulation() {
        int i = Swatch.a;
        int i2 = 0;
        for (Swatch population : this.mSwatches) {
            int max = Math.max(i2, population.getPopulation());
            if (i != 0) {
                return max;
            }
            i2 = max;
        }
        return i2;
    }

    private void generateVariationColors() {
        this.mVibrantSwatch = findColorVariation(0.5f, 0.3f, 0.7f, 1.0f, 0.35f, 1.0f);
        this.mLightVibrantSwatch = findColorVariation(0.74f, 0.55f, 1.0f, 1.0f, 0.35f, 1.0f);
        this.mDarkVibrantSwatch = findColorVariation(0.26f, 0.0f, 0.45f, 1.0f, 0.35f, 1.0f);
        this.mMutedSwatch = findColorVariation(0.5f, 0.3f, 0.7f, 0.3f, 0.0f, 0.4f);
        this.mLightMutedSwatch = findColorVariation(0.74f, 0.55f, 1.0f, 0.3f, 0.0f, 0.4f);
        this.mDarkMutedSwatch = findColorVariation(0.26f, 0.0f, 0.45f, 0.3f, 0.0f, 0.4f);
    }

    public Swatch getMutedSwatch() {
        return this.mMutedSwatch;
    }

    private Swatch findColorVariation(float f, float f2, float f3, float f4, float f5, float f6) {
        int i = Swatch.a;
        float f7 = 0.0f;
        Swatch swatch = null;
        for (Swatch swatch2 : this.mSwatches) {
            Swatch swatch3;
            float f8 = swatch2.getHsl()[1];
            float f9 = swatch2.getHsl()[2];
            if (f8 >= f5 && f8 <= f6 && f9 >= f2 && f9 <= f3 && !isAlreadySelected(swatch2)) {
                f8 = createComparisonValue(f8, f4, f9, f, swatch2.getPopulation(), this.mHighestPopulation);
                if (swatch == null || f8 > f7) {
                    swatch3 = swatch2;
                    if (i != 0) {
                        return swatch3;
                    }
                    f7 = f8;
                    swatch = swatch3;
                }
            }
            f8 = f7;
            swatch3 = swatch;
            if (i != 0) {
                return swatch3;
            }
            f7 = f8;
            swatch = swatch3;
        }
        return swatch;
    }

    private static float invertDiff(float f, float f2) {
        return 1.0f - Math.abs(f - f2);
    }

    private static float weightedMean(float[] fArr) {
        float f = 0.0f;
        int i = Swatch.a;
        int i2 = 0;
        float f2 = 0.0f;
        while (i2 < fArr.length) {
            float f3 = fArr[i2];
            float f4 = fArr[i2 + 1];
            f2 += f3 * f4;
            f += f4;
            i2 += 2;
            if (i != 0) {
                break;
            }
        }
        return f2 / f;
    }

    private void generateEmptySwatches() {
        if (this.mVibrantSwatch == null && this.mDarkVibrantSwatch != null) {
            float[] copyHslValues = copyHslValues(this.mDarkVibrantSwatch);
            copyHslValues[2] = 0.5f;
            this.mVibrantSwatch = new Swatch(ColorUtils.HSLToColor(copyHslValues), 0);
        }
        if (this.mDarkVibrantSwatch == null && this.mVibrantSwatch != null) {
            copyHslValues = copyHslValues(this.mVibrantSwatch);
            copyHslValues[2] = 0.26f;
            this.mDarkVibrantSwatch = new Swatch(ColorUtils.HSLToColor(copyHslValues), 0);
        }
    }

    DefaultGenerator() {
    }

    private static float createComparisonValue(float f, float f2, float f3, float f4, float f5, float f6, int i, int i2, float f7) {
        return weightedMean(new float[]{invertDiff(f, f2), f3, invertDiff(f4, f5), f6, ((float) i) / ((float) i2), f7});
    }

    private static float createComparisonValue(float f, float f2, float f3, float f4, int i, int i2) {
        return createComparisonValue(f, f2, 3.0f, f3, f4, 6.0f, i, i2, 1.0f);
    }

    private boolean isAlreadySelected(Swatch swatch) {
        return this.mVibrantSwatch == swatch || this.mDarkVibrantSwatch == swatch || this.mLightVibrantSwatch == swatch || this.mMutedSwatch == swatch || this.mDarkMutedSwatch == swatch || this.mLightMutedSwatch == swatch;
    }

    public void generate(List list) {
        this.mSwatches = list;
        this.mHighestPopulation = findMaxPopulation();
        generateVariationColors();
        generateEmptySwatches();
    }
}
