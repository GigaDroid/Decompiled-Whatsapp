package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.ColorUtils;
import android.support.v4.util.LruCache;
import android.support.v7.appcompat.R;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.v;
import org.whispersystems.at;

public final class TintManager {
    private static final int[] COLORFILTER_COLOR_BACKGROUND_MULTIPLY;
    private static final int[] COLORFILTER_COLOR_CONTROL_ACTIVATED;
    private static final int[] COLORFILTER_TINT_COLOR_CONTROL_NORMAL;
    private static final ColorFilterLruCache COLOR_FILTER_CACHE;
    private static final Mode DEFAULT_MODE;
    private static final WeakHashMap INSTANCE_CACHE;
    public static final boolean SHOULD_BE_USED;
    private static final int[] TINT_CHECKABLE_BUTTON_LIST;
    private static final int[] TINT_COLOR_CONTROL_NORMAL;
    private static final int[] TINT_COLOR_CONTROL_STATE_LIST;
    private static final String[] z;
    private final WeakReference mContextRef;
    private ColorStateList mDefaultColorStateList;
    private SparseArray mTintLists;

    class ColorFilterLruCache extends LruCache {
        PorterDuffColorFilter put(int i, Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) put(Integer.valueOf(generateCacheKey(i, mode)), porterDuffColorFilter);
        }

        public ColorFilterLruCache(int i) {
            super(i);
        }

        private static int generateCacheKey(int i, Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter get(int i, Mode mode) {
            return (PorterDuffColorFilter) get(Integer.valueOf(generateCacheKey(i, mode)));
        }
    }

    static {
        String[] strArr = new String[2];
        String str = "(+Kv>\u001d,De\u0016\u000e";
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
                        i4 = 124;
                        break;
                    case at.g /*1*/:
                        i4 = 66;
                        break;
                    case at.i /*2*/:
                        i4 = 37;
                        break;
                    case at.o /*3*/:
                        i4 = 2;
                        break;
                    default:
                        i4 = 115;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    boolean z;
                    strArr2[i2] = str;
                    z = strArr3;
                    if (VERSION.SDK_INT < 21) {
                        z = true;
                    } else {
                        z = false;
                    }
                    SHOULD_BE_USED = z;
                    DEFAULT_MODE = Mode.SRC_IN;
                    INSTANCE_CACHE = new WeakHashMap();
                    COLOR_FILTER_CACHE = new ColorFilterLruCache(6);
                    COLORFILTER_TINT_COLOR_CONTROL_NORMAL = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
                    TINT_COLOR_CONTROL_NORMAL = new int[]{R.drawable.abc_ic_ab_back_mtrl_am_alpha, R.drawable.abc_ic_go_search_api_mtrl_alpha, R.drawable.abc_ic_search_api_mtrl_alpha, R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_ic_clear_mtrl_alpha, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha, R.drawable.abc_ic_menu_moreoverflow_mtrl_alpha, R.drawable.abc_ic_voice_search_api_mtrl_alpha};
                    COLORFILTER_COLOR_CONTROL_ACTIVATED = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material};
                    COLORFILTER_COLOR_BACKGROUND_MULTIPLY = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
                    TINT_COLOR_CONTROL_STATE_LIST = new int[]{R.drawable.abc_edit_text_material, R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material, R.drawable.abc_spinner_mtrl_am_alpha, R.drawable.abc_spinner_textfield_background_material, R.drawable.abc_ratingbar_full_material, R.drawable.abc_switch_track_mtrl_alpha, R.drawable.abc_switch_thumb_material, R.drawable.abc_btn_default_mtrl_shape, R.drawable.abc_btn_borderless_material};
                    TINT_CHECKABLE_BUTTON_LIST = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "17Qc\u0007\u0019&\u0005f\u0001\u001d5D`\u001f\u0019bLqS\u0012-Q\"\u0007\u0014'\u0005q\u0012\u0011'\u0005k\u001d\u000f6Dl\u0010\u0019bDqS\b*@\"\u001a\u00122Pv]";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
            }
        }
    }

    public static TintManager get(Context context) {
        TintManager tintManager = (TintManager) INSTANCE_CACHE.get(context);
        if (tintManager != null) {
            return tintManager;
        }
        tintManager = new TintManager(context);
        INSTANCE_CACHE.put(context, tintManager);
        return tintManager;
    }

    private ColorStateList createSwitchTrackColorStateList(Context context) {
        r0 = new int[3][];
        int[] iArr = new int[]{ThemeUtils.DISABLED_STATE_SET, ThemeUtils.getThemeAttrColor(context, 16842800, 0.1f), ThemeUtils.CHECKED_STATE_SET};
        iArr[1] = ThemeUtils.getThemeAttrColor(context, R.attr.colorControlActivated, 0.3f);
        r0[2] = ThemeUtils.EMPTY_STATE_SET;
        iArr[2] = ThemeUtils.getThemeAttrColor(context, 16842800, 0.3f);
        return new ColorStateList(r0, iArr);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable getDrawable(int r9, boolean r10) {
        /*
        r8 = this;
        r3 = 0;
        r4 = android.support.v7.widget.LinearLayoutCompat.a;
        r0 = r8.mContextRef;
        r0 = r0.get();
        r0 = (android.content.Context) r0;
        if (r0 != 0) goto L_0x000e;
    L_0x000d:
        return r3;
    L_0x000e:
        r1 = android.support.v4.content.ContextCompat.getDrawable(r0, r9);
        if (r1 == 0) goto L_0x00a1;
    L_0x0014:
        r2 = android.os.Build.VERSION.SDK_INT;
        r5 = 8;
        if (r2 < r5) goto L_0x001e;
    L_0x001a:
        r1 = r1.mutate();
    L_0x001e:
        r5 = r8.getTintList(r9);
        if (r5 == 0) goto L_0x009f;
    L_0x0024:
        r2 = android.support.v4.graphics.drawable.DrawableCompat.wrap(r1);
        android.support.v4.graphics.drawable.DrawableCompat.setTintList(r2, r5);
        r1 = r8.getTintMode(r9);
        if (r1 == 0) goto L_0x0034;
    L_0x0031:
        android.support.v4.graphics.drawable.DrawableCompat.setTintMode(r2, r1);
    L_0x0034:
        if (r4 == 0) goto L_0x009c;
    L_0x0036:
        r1 = android.support.v7.appcompat.R.drawable.abc_cab_background_top_material;
        if (r9 != r1) goto L_0x0055;
    L_0x003a:
        r3 = new android.graphics.drawable.LayerDrawable;
        r0 = 2;
        r0 = new android.graphics.drawable.Drawable[r0];
        r1 = 0;
        r2 = android.support.v7.appcompat.R.drawable.abc_cab_background_internal_bg;
        r2 = r8.getDrawable(r2);
        r0[r1] = r2;
        r1 = 1;
        r2 = android.support.v7.appcompat.R.drawable.abc_cab_background_top_mtrl_alpha;
        r2 = r8.getDrawable(r2);
        r0[r1] = r2;
        r3.<init>(r0);
        goto L_0x000d;
    L_0x0055:
        r1 = android.support.v7.appcompat.R.drawable.abc_seekbar_track_material;
        if (r9 != r1) goto L_0x0093;
    L_0x0059:
        r1 = r2;
        r1 = (android.graphics.drawable.LayerDrawable) r1;
        r5 = 16908288; // 0x1020000 float:2.387723E-38 double:8.353804E-317;
        r5 = r1.findDrawableByLayerId(r5);
        r6 = android.support.v7.appcompat.R.attr.colorControlNormal;
        r6 = android.support.v7.widget.ThemeUtils.getThemeAttrColor(r0, r6);
        r7 = DEFAULT_MODE;
        setPorterDuffColorFilter(r5, r6, r7);
        r5 = 16908303; // 0x102000f float:2.387727E-38 double:8.3538116E-317;
        r5 = r1.findDrawableByLayerId(r5);
        r6 = android.support.v7.appcompat.R.attr.colorControlNormal;
        r6 = android.support.v7.widget.ThemeUtils.getThemeAttrColor(r0, r6);
        r7 = DEFAULT_MODE;
        setPorterDuffColorFilter(r5, r6, r7);
        r5 = 16908301; // 0x102000d float:2.3877265E-38 double:8.3538107E-317;
        r1 = r1.findDrawableByLayerId(r5);
        r5 = android.support.v7.appcompat.R.attr.colorControlActivated;
        r0 = android.support.v7.widget.ThemeUtils.getThemeAttrColor(r0, r5);
        r5 = DEFAULT_MODE;
        setPorterDuffColorFilter(r1, r0, r5);
        if (r4 == 0) goto L_0x009c;
    L_0x0093:
        r0 = r8.tintDrawableUsingColorFilter(r9, r2);
        if (r0 != 0) goto L_0x009c;
    L_0x0099:
        if (r10 == 0) goto L_0x009c;
    L_0x009b:
        r2 = r3;
    L_0x009c:
        r3 = r2;
        goto L_0x000d;
    L_0x009f:
        r2 = r1;
        goto L_0x0036;
    L_0x00a1:
        r2 = r1;
        goto L_0x009c;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.TintManager.getDrawable(int, boolean):android.graphics.drawable.Drawable");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.res.ColorStateList getTintList(int r5) {
        /*
        r4 = this;
        r1 = 0;
        r2 = android.support.v7.widget.LinearLayoutCompat.a;
        r0 = r4.mContextRef;
        r0 = r0.get();
        r0 = (android.content.Context) r0;
        if (r0 != 0) goto L_0x000e;
    L_0x000d:
        return r1;
    L_0x000e:
        r3 = r4.mTintLists;
        if (r3 == 0) goto L_0x001a;
    L_0x0012:
        r1 = r4.mTintLists;
        r1 = r1.get(r5);
        r1 = (android.content.res.ColorStateList) r1;
    L_0x001a:
        if (r1 != 0) goto L_0x000d;
    L_0x001c:
        r3 = android.support.v7.appcompat.R.drawable.abc_edit_text_material;
        if (r5 != r3) goto L_0x0026;
    L_0x0020:
        r1 = r4.createEditTextColorStateList(r0);
        if (r2 == 0) goto L_0x0094;
    L_0x0026:
        r3 = android.support.v7.appcompat.R.drawable.abc_switch_track_mtrl_alpha;
        if (r5 != r3) goto L_0x0030;
    L_0x002a:
        r1 = r4.createSwitchTrackColorStateList(r0);
        if (r2 == 0) goto L_0x0094;
    L_0x0030:
        r3 = android.support.v7.appcompat.R.drawable.abc_switch_thumb_material;
        if (r5 != r3) goto L_0x003a;
    L_0x0034:
        r1 = r4.createSwitchThumbColorStateList(r0);
        if (r2 == 0) goto L_0x0094;
    L_0x003a:
        r3 = android.support.v7.appcompat.R.drawable.abc_btn_default_mtrl_shape;
        if (r5 == r3) goto L_0x0042;
    L_0x003e:
        r3 = android.support.v7.appcompat.R.drawable.abc_btn_borderless_material;
        if (r5 != r3) goto L_0x0048;
    L_0x0042:
        r1 = r4.createDefaultButtonColorStateList(r0);
        if (r2 == 0) goto L_0x0094;
    L_0x0048:
        r3 = android.support.v7.appcompat.R.drawable.abc_btn_colored_material;
        if (r5 != r3) goto L_0x0052;
    L_0x004c:
        r1 = r4.createColoredButtonColorStateList(r0);
        if (r2 == 0) goto L_0x0094;
    L_0x0052:
        r3 = android.support.v7.appcompat.R.drawable.abc_spinner_mtrl_am_alpha;
        if (r5 == r3) goto L_0x005a;
    L_0x0056:
        r3 = android.support.v7.appcompat.R.drawable.abc_spinner_textfield_background_material;
        if (r5 != r3) goto L_0x0060;
    L_0x005a:
        r1 = r4.createSpinnerColorStateList(r0);
        if (r2 == 0) goto L_0x0094;
    L_0x0060:
        r3 = TINT_COLOR_CONTROL_NORMAL;
        r3 = arrayContains(r3, r5);
        if (r3 == 0) goto L_0x0070;
    L_0x0068:
        r1 = android.support.v7.appcompat.R.attr.colorControlNormal;
        r1 = android.support.v7.widget.ThemeUtils.getThemeAttrColorStateList(r0, r1);
        if (r2 == 0) goto L_0x0094;
    L_0x0070:
        r3 = TINT_COLOR_CONTROL_STATE_LIST;
        r3 = arrayContains(r3, r5);
        if (r3 == 0) goto L_0x007e;
    L_0x0078:
        r1 = r4.getDefaultColorStateList(r0);
        if (r2 == 0) goto L_0x0094;
    L_0x007e:
        r3 = TINT_CHECKABLE_BUTTON_LIST;
        r3 = arrayContains(r3, r5);
        if (r3 == 0) goto L_0x008c;
    L_0x0086:
        r1 = r4.createCheckableButtonColorStateList(r0);
        if (r2 == 0) goto L_0x0094;
    L_0x008c:
        r2 = android.support.v7.appcompat.R.drawable.abc_seekbar_thumb_material;
        if (r5 != r2) goto L_0x0094;
    L_0x0090:
        r1 = r4.createSeekbarThumbColorStateList(r0);
    L_0x0094:
        if (r1 == 0) goto L_0x000d;
    L_0x0096:
        r0 = r4.mTintLists;
        if (r0 != 0) goto L_0x00a1;
    L_0x009a:
        r0 = new android.util.SparseArray;
        r0.<init>();
        r4.mTintLists = r0;
    L_0x00a1:
        r0 = r4.mTintLists;
        r0.append(r5, r1);
        goto L_0x000d;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.TintManager.getTintList(int):android.content.res.ColorStateList");
    }

    private static PorterDuffColorFilter createTintFilter(ColorStateList colorStateList, Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return getPorterDuffColorFilter(colorStateList.getColorForState(iArr, 0), mode);
    }

    final Mode getTintMode(int i) {
        if (i == R.drawable.abc_switch_thumb_material) {
            return Mode.MULTIPLY;
        }
        return null;
    }

    private static PorterDuffColorFilter getPorterDuffColorFilter(int i, Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter = COLOR_FILTER_CACHE.get(i, mode);
        if (porterDuffColorFilter != null) {
            return porterDuffColorFilter;
        }
        porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        COLOR_FILTER_CACHE.put(i, mode, porterDuffColorFilter);
        return porterDuffColorFilter;
    }

    private ColorStateList createSpinnerColorStateList(Context context) {
        r0 = new int[3][];
        int[] iArr = new int[]{ThemeUtils.DISABLED_STATE_SET, ThemeUtils.getDisabledThemeAttrColor(context, R.attr.colorControlNormal), ThemeUtils.NOT_PRESSED_OR_FOCUSED_STATE_SET};
        iArr[1] = ThemeUtils.getThemeAttrColor(context, R.attr.colorControlNormal);
        r0[2] = ThemeUtils.EMPTY_STATE_SET;
        iArr[2] = ThemeUtils.getThemeAttrColor(context, R.attr.colorControlActivated);
        return new ColorStateList(r0, iArr);
    }

    private ColorStateList createSeekbarThumbColorStateList(Context context) {
        r0 = new int[2][];
        int[] iArr = new int[]{ThemeUtils.DISABLED_STATE_SET, ThemeUtils.getDisabledThemeAttrColor(context, R.attr.colorControlActivated)};
        r0[1] = ThemeUtils.EMPTY_STATE_SET;
        iArr[1] = ThemeUtils.getThemeAttrColor(context, R.attr.colorControlActivated);
        return new ColorStateList(r0, iArr);
    }

    private static boolean arrayContains(int[] iArr, int i) {
        boolean z = LinearLayoutCompat.a;
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            if (iArr[i2] == i) {
                return true;
            }
            i2++;
            if (z) {
                return false;
            }
        }
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void tintDrawable(android.graphics.drawable.Drawable r3, android.support.v7.widget.TintInfo r4, int[] r5) {
        /*
        r0 = shouldMutateBackground(r3);
        if (r0 == 0) goto L_0x001a;
    L_0x0006:
        r0 = r3.mutate();
        if (r0 == r3) goto L_0x001a;
    L_0x000c:
        r0 = z;
        r1 = 0;
        r0 = r0[r1];
        r1 = z;
        r2 = 1;
        r1 = r1[r2];
        android.util.Log.d(r0, r1);
    L_0x0019:
        return;
    L_0x001a:
        r0 = r4.mHasTintList;
        if (r0 != 0) goto L_0x0022;
    L_0x001e:
        r0 = r4.mHasTintMode;
        if (r0 == 0) goto L_0x0039;
    L_0x0022:
        r0 = r4.mHasTintList;
        if (r0 == 0) goto L_0x0046;
    L_0x0026:
        r0 = r4.mTintList;
    L_0x0028:
        r1 = r4.mHasTintMode;
        if (r1 == 0) goto L_0x0048;
    L_0x002c:
        r1 = r4.mTintMode;
    L_0x002e:
        r0 = createTintFilter(r0, r1, r5);
        r3.setColorFilter(r0);
        r0 = android.support.v7.widget.LinearLayoutCompat.a;
        if (r0 == 0) goto L_0x003c;
    L_0x0039:
        r3.clearColorFilter();
    L_0x003c:
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 10;
        if (r0 > r1) goto L_0x0019;
    L_0x0042:
        r3.invalidateSelf();
        goto L_0x0019;
    L_0x0046:
        r0 = 0;
        goto L_0x0028;
    L_0x0048:
        r1 = DEFAULT_MODE;
        goto L_0x002e;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.TintManager.tintDrawable(android.graphics.drawable.Drawable, android.support.v7.widget.TintInfo, int[]):void");
    }

    public Drawable getDrawable(int i) {
        return getDrawable(i, false);
    }

    private static void setPorterDuffColorFilter(Drawable drawable, int i, Mode mode) {
        if (mode == null) {
            mode = DEFAULT_MODE;
        }
        drawable.setColorFilter(getPorterDuffColorFilter(i, mode));
    }

    private TintManager(Context context) {
        this.mContextRef = new WeakReference(context);
    }

    private ColorStateList createCheckableButtonColorStateList(Context context) {
        r0 = new int[3][];
        int[] iArr = new int[]{ThemeUtils.DISABLED_STATE_SET, ThemeUtils.getDisabledThemeAttrColor(context, R.attr.colorControlNormal), ThemeUtils.CHECKED_STATE_SET};
        iArr[1] = ThemeUtils.getThemeAttrColor(context, R.attr.colorControlActivated);
        r0[2] = ThemeUtils.EMPTY_STATE_SET;
        iArr[2] = ThemeUtils.getThemeAttrColor(context, R.attr.colorControlNormal);
        return new ColorStateList(r0, iArr);
    }

    private ColorStateList createButtonColorStateList(Context context, int i) {
        r0 = new int[4][];
        r1 = new int[4];
        int themeAttrColor = ThemeUtils.getThemeAttrColor(context, i);
        int themeAttrColor2 = ThemeUtils.getThemeAttrColor(context, R.attr.colorControlHighlight);
        r0[0] = ThemeUtils.DISABLED_STATE_SET;
        r1[0] = ThemeUtils.getDisabledThemeAttrColor(context, R.attr.colorButtonNormal);
        r0[1] = ThemeUtils.PRESSED_STATE_SET;
        r1[1] = ColorUtils.compositeColors(themeAttrColor2, themeAttrColor);
        r0[2] = ThemeUtils.FOCUSED_STATE_SET;
        r1[2] = ColorUtils.compositeColors(themeAttrColor2, themeAttrColor);
        r0[3] = ThemeUtils.EMPTY_STATE_SET;
        r1[3] = themeAttrColor;
        return new ColorStateList(r0, r1);
    }

    private static boolean isInTintList(int i) {
        return arrayContains(TINT_COLOR_CONTROL_NORMAL, i) || arrayContains(COLORFILTER_TINT_COLOR_CONTROL_NORMAL, i) || arrayContains(COLORFILTER_COLOR_CONTROL_ACTIVATED, i) || arrayContains(TINT_COLOR_CONTROL_STATE_LIST, i) || arrayContains(COLORFILTER_COLOR_BACKGROUND_MULTIPLY, i) || arrayContains(TINT_CHECKABLE_BUTTON_LIST, i) || i == R.drawable.abc_cab_background_top_material;
    }

    private ColorStateList getDefaultColorStateList(Context context) {
        if (this.mDefaultColorStateList == null) {
            int themeAttrColor = ThemeUtils.getThemeAttrColor(context, R.attr.colorControlNormal);
            int themeAttrColor2 = ThemeUtils.getThemeAttrColor(context, R.attr.colorControlActivated);
            r2 = new int[7][];
            int[] iArr = new int[]{ThemeUtils.DISABLED_STATE_SET, ThemeUtils.getDisabledThemeAttrColor(context, R.attr.colorControlNormal), ThemeUtils.FOCUSED_STATE_SET, themeAttrColor2, ThemeUtils.ACTIVATED_STATE_SET, themeAttrColor2, ThemeUtils.PRESSED_STATE_SET};
            iArr[3] = themeAttrColor2;
            r2[4] = ThemeUtils.CHECKED_STATE_SET;
            iArr[4] = themeAttrColor2;
            r2[5] = ThemeUtils.SELECTED_STATE_SET;
            iArr[5] = themeAttrColor2;
            r2[6] = ThemeUtils.EMPTY_STATE_SET;
            iArr[6] = themeAttrColor;
            this.mDefaultColorStateList = new ColorStateList(r2, iArr);
        }
        return this.mDefaultColorStateList;
    }

    private static boolean shouldMutateBackground(Drawable drawable) {
        boolean z = LinearLayoutCompat.a;
        if (VERSION.SDK_INT >= 16) {
            return true;
        }
        if (drawable instanceof LayerDrawable) {
            return VERSION.SDK_INT >= 16;
        } else if (drawable instanceof InsetDrawable) {
            if (VERSION.SDK_INT < 14) {
                return false;
            }
            return true;
        } else if (!(drawable instanceof DrawableContainer)) {
            return true;
        } else {
            ConstantState constantState = drawable.getConstantState();
            if (!(constantState instanceof DrawableContainerState)) {
                return true;
            }
            Drawable[] children = ((DrawableContainerState) constantState).getChildren();
            int length = children.length;
            int i = 0;
            while (i < length) {
                if (!shouldMutateBackground(children[i])) {
                    return false;
                }
                i++;
                if (z) {
                    return true;
                }
            }
            return true;
        }
    }

    private ColorStateList createColoredButtonColorStateList(Context context) {
        return createButtonColorStateList(context, R.attr.colorAccent);
    }

    private ColorStateList createDefaultButtonColorStateList(Context context) {
        return createButtonColorStateList(context, R.attr.colorButtonNormal);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.content.res.ColorStateList createSwitchThumbColorStateList(android.content.Context r7) {
        /*
        r6 = this;
        r1 = 0;
        r0 = 3;
        r2 = new int[r0][];
        r3 = new int[r0];
        r4 = android.support.v7.appcompat.R.attr.colorSwitchThumbNormal;
        r4 = android.support.v7.widget.ThemeUtils.getThemeAttrColorStateList(r7, r4);
        if (r4 == 0) goto L_0x006c;
    L_0x000e:
        r5 = r4.isStateful();
        if (r5 == 0) goto L_0x006c;
    L_0x0014:
        r5 = android.support.v7.widget.ThemeUtils.DISABLED_STATE_SET;
        r2[r1] = r5;
        r5 = r2[r1];
        r5 = r4.getColorForState(r5, r1);
        r3[r1] = r5;
        r1 = 1;
        r5 = android.support.v7.widget.ThemeUtils.CHECKED_STATE_SET;
        r2[r1] = r5;
        r5 = android.support.v7.appcompat.R.attr.colorControlActivated;
        r5 = android.support.v7.widget.ThemeUtils.getThemeAttrColor(r7, r5);
        r3[r1] = r5;
        r1 = 2;
        r5 = android.support.v7.widget.ThemeUtils.EMPTY_STATE_SET;
        r2[r1] = r5;
        r4 = r4.getDefaultColor();
        r3[r1] = r4;
        r1 = android.support.v7.widget.LinearLayoutCompat.a;
        if (r1 == 0) goto L_0x0066;
    L_0x003c:
        r1 = android.support.v7.widget.ThemeUtils.DISABLED_STATE_SET;
        r2[r0] = r1;
        r1 = android.support.v7.appcompat.R.attr.colorSwitchThumbNormal;
        r1 = android.support.v7.widget.ThemeUtils.getDisabledThemeAttrColor(r7, r1);
        r3[r0] = r1;
        r0 = r0 + 1;
        r1 = android.support.v7.widget.ThemeUtils.CHECKED_STATE_SET;
        r2[r0] = r1;
        r1 = android.support.v7.appcompat.R.attr.colorControlActivated;
        r1 = android.support.v7.widget.ThemeUtils.getThemeAttrColor(r7, r1);
        r3[r0] = r1;
        r0 = r0 + 1;
        r1 = android.support.v7.widget.ThemeUtils.EMPTY_STATE_SET;
        r2[r0] = r1;
        r1 = android.support.v7.appcompat.R.attr.colorSwitchThumbNormal;
        r1 = android.support.v7.widget.ThemeUtils.getThemeAttrColor(r7, r1);
        r3[r0] = r1;
        r0 = r0 + 1;
    L_0x0066:
        r0 = new android.content.res.ColorStateList;
        r0.<init>(r2, r3);
        return r0;
    L_0x006c:
        r0 = r1;
        goto L_0x003c;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.TintManager.createSwitchThumbColorStateList(android.content.Context):android.content.res.ColorStateList");
    }

    public final boolean tintDrawableUsingColorFilter(int i, Drawable drawable) {
        boolean z = LinearLayoutCompat.a;
        Context context = (Context) this.mContextRef.get();
        if (context == null) {
            return false;
        }
        boolean z2;
        Mode mode = DEFAULT_MODE;
        int i2;
        int i3;
        Mode mode2;
        if (arrayContains(COLORFILTER_TINT_COLOR_CONTROL_NORMAL, i)) {
            i2 = R.attr.colorControlNormal;
            if (z) {
                boolean z3 = true;
            }
            i3 = i2;
            mode2 = mode;
            z2 = true;
            i2 = -1;
            if (!z2) {
                return false;
            }
            drawable.setColorFilter(getPorterDuffColorFilter(ThemeUtils.getThemeAttrColor(context, i3), mode2));
            if (i2 != -1) {
                drawable.setAlpha(i2);
            }
            return true;
        }
        i2 = 0;
        z3 = false;
        if (arrayContains(COLORFILTER_COLOR_CONTROL_ACTIVATED, i)) {
            i2 = R.attr.colorControlActivated;
            if (z) {
                z3 = true;
            }
            i3 = i2;
            mode2 = mode;
            z2 = true;
            i2 = -1;
            if (!z2) {
                return false;
            }
            drawable.setColorFilter(getPorterDuffColorFilter(ThemeUtils.getThemeAttrColor(context, i3), mode2));
            if (i2 != -1) {
                drawable.setAlpha(i2);
            }
            return true;
        }
        if (arrayContains(COLORFILTER_COLOR_BACKGROUND_MULTIPLY, i)) {
            i2 = 16842801;
            Mode mode3 = Mode.MULTIPLY;
            if (z) {
                mode = mode3;
                z3 = true;
            } else {
                z2 = true;
                mode2 = mode3;
                i3 = 16842801;
                i2 = -1;
                if (!z2) {
                    return false;
                }
                drawable.setColorFilter(getPorterDuffColorFilter(ThemeUtils.getThemeAttrColor(context, i3), mode2));
                if (i2 != -1) {
                    drawable.setAlpha(i2);
                }
                return true;
            }
        }
        if (i == R.drawable.abc_list_divider_mtrl_alpha) {
            i3 = 16842800;
            i2 = Math.round(40.8f);
            mode2 = mode;
            z2 = true;
        } else {
            mode2 = mode;
            z2 = z3;
            i3 = i2;
            i2 = -1;
        }
        if (!z2) {
            return false;
        }
        drawable.setColorFilter(getPorterDuffColorFilter(ThemeUtils.getThemeAttrColor(context, i3), mode2));
        if (i2 != -1) {
            drawable.setAlpha(i2);
        }
        return true;
    }

    private ColorStateList createEditTextColorStateList(Context context) {
        r0 = new int[3][];
        int[] iArr = new int[]{ThemeUtils.DISABLED_STATE_SET, ThemeUtils.getDisabledThemeAttrColor(context, R.attr.colorControlNormal), ThemeUtils.NOT_PRESSED_OR_FOCUSED_STATE_SET};
        iArr[1] = ThemeUtils.getThemeAttrColor(context, R.attr.colorControlNormal);
        r0[2] = ThemeUtils.EMPTY_STATE_SET;
        iArr[2] = ThemeUtils.getThemeAttrColor(context, R.attr.colorControlActivated);
        return new ColorStateList(r0, iArr);
    }

    public static Drawable getDrawable(Context context, int i) {
        return isInTintList(i) ? get(context).getDrawable(i) : ContextCompat.getDrawable(context, i);
    }
}
