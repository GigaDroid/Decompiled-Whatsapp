package android.support.v4.text;

import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.Locale;
import org.v;
import org.whispersystems.at;

public class TextUtilsCompat {
    private static String ARAB_SCRIPT_SUBTAG;
    private static String HEBR_SCRIPT_SUBTAG;
    private static final TextUtilsCompatImpl IMPL;
    public static final Locale ROOT;

    class TextUtilsCompatImpl {
        private static int getLayoutDirectionFromFirstChar(@NonNull Locale locale) {
            switch (Character.getDirectionality(locale.getDisplayName(locale).charAt(0))) {
                case at.g /*1*/:
                case at.i /*2*/:
                    return 1;
                default:
                    return 0;
            }
        }

        public int getLayoutDirectionFromLocale(@Nullable Locale locale) {
            if (!(locale == null || locale.equals(TextUtilsCompat.ROOT))) {
                String maximizeAndGetScript = ICUCompat.maximizeAndGetScript(locale);
                if (maximizeAndGetScript == null) {
                    return getLayoutDirectionFromFirstChar(locale);
                }
                if (maximizeAndGetScript.equalsIgnoreCase(TextUtilsCompat.access$000()) || maximizeAndGetScript.equalsIgnoreCase(TextUtilsCompat.access$100())) {
                    return 1;
                }
            }
            return 0;
        }

        private TextUtilsCompatImpl() {
        }

        TextUtilsCompatImpl(1 1) {
            this();
        }
    }

    class TextUtilsCompatJellybeanMr1Impl extends TextUtilsCompatImpl {
        private TextUtilsCompatJellybeanMr1Impl() {
            super(null);
        }

        public int getLayoutDirectionFromLocale(@Nullable Locale locale) {
            return TextUtilsCompatJellybeanMr1.getLayoutDirectionFromLocale(locale);
        }

        TextUtilsCompatJellybeanMr1Impl(1 1) {
            this();
        }
    }

    public static int getLayoutDirectionFromLocale(@Nullable Locale locale) {
        return IMPL.getLayoutDirectionFromLocale(locale);
    }

    static String access$000() {
        return ARAB_SCRIPT_SUBTAG;
    }

    static String access$100() {
        return HEBR_SCRIPT_SUBTAG;
    }

    static {
        if (VERSION.SDK_INT >= 17) {
            IMPL = new TextUtilsCompatJellybeanMr1Impl(null);
        } else {
            IMPL = new TextUtilsCompatImpl(null);
        }
        ROOT = new Locale("", "");
        String str = "p=Y$";
        Object obj = -1;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 49;
                        break;
                    case at.g /*1*/:
                        i2 = 79;
                        break;
                    case at.i /*2*/:
                        i2 = 56;
                        break;
                    case at.o /*3*/:
                        i2 = 70;
                        break;
                    default:
                        i2 = 116;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    HEBR_SCRIPT_SUBTAG = str;
                    return;
                default:
                    ARAB_SCRIPT_SUBTAG = str;
                    str = "y*Z4";
                    obj = null;
            }
        }
    }
}
