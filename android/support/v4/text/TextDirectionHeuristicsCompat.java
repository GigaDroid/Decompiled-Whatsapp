package android.support.v4.text;

import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import java.util.Locale;
import org.v;
import org.whispersystems.at;

public class TextDirectionHeuristicsCompat {
    public static final TextDirectionHeuristicCompat ANYRTL_LTR;
    public static final TextDirectionHeuristicCompat FIRSTSTRONG_LTR;
    public static final TextDirectionHeuristicCompat FIRSTSTRONG_RTL;
    public static final TextDirectionHeuristicCompat LOCALE;
    public static final TextDirectionHeuristicCompat LTR;
    public static final TextDirectionHeuristicCompat RTL;
    public static int a;

    interface TextDirectionAlgorithm {
        int checkRtl(CharSequence charSequence, int i, int i2);
    }

    class AnyStrong implements TextDirectionAlgorithm {
        public static final AnyStrong INSTANCE_LTR;
        public static final AnyStrong INSTANCE_RTL;
        private final boolean mLookForRtl;

        public int checkRtl(CharSequence charSequence, int i, int i2) {
            int i3 = TextDirectionHeuristicsCompat.a;
            int i4 = i + i2;
            int i5 = 0;
            while (i < i4) {
                switch (TextDirectionHeuristicsCompat.access$200(Character.getDirectionality(charSequence.charAt(i)))) {
                    case v.m /*0*/:
                        if (!this.mLookForRtl) {
                            if (i3 == 0) {
                                i5 = 1;
                                break;
                            }
                        }
                        return 0;
                    case at.g /*1*/:
                        if (this.mLookForRtl) {
                            i5 = 1;
                            break;
                        }
                        return 1;
                }
                i++;
                if (i3 != 0) {
                    if (i5 != 0) {
                        return 2;
                    }
                    if (this.mLookForRtl) {
                        return 0;
                    }
                    return 1;
                }
            }
            if (i5 != 0) {
                return 2;
            }
            if (this.mLookForRtl) {
                return 0;
            }
            return 1;
        }

        private AnyStrong(boolean z) {
            this.mLookForRtl = z;
        }

        static {
            INSTANCE_RTL = new AnyStrong(true);
            INSTANCE_LTR = new AnyStrong(false);
        }
    }

    class FirstStrong implements TextDirectionAlgorithm {
        public static final FirstStrong INSTANCE;

        static {
            INSTANCE = new FirstStrong();
        }

        private FirstStrong() {
        }

        public int checkRtl(CharSequence charSequence, int i, int i2) {
            int i3 = TextDirectionHeuristicsCompat.a;
            int i4 = i + i2;
            int i5 = 2;
            while (i < i4 && r0 == 2) {
                i5 = TextDirectionHeuristicsCompat.access$100(Character.getDirectionality(charSequence.charAt(i)));
                i++;
                if (i3 != 0) {
                    break;
                }
            }
            return i5;
        }
    }

    abstract class TextDirectionHeuristicImpl implements TextDirectionHeuristicCompat {
        private final TextDirectionAlgorithm mAlgorithm;

        protected abstract boolean defaultIsRtl();

        public boolean isRtl(CharSequence charSequence, int i, int i2) {
            if (charSequence != null && i >= 0 && i2 >= 0) {
                try {
                    if (charSequence.length() - i2 >= i) {
                        try {
                            if (this.mAlgorithm == null) {
                                return defaultIsRtl();
                            }
                            return doCheck(charSequence, i, i2);
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    }
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            }
            throw new IllegalArgumentException();
        }

        private boolean doCheck(CharSequence charSequence, int i, int i2) {
            try {
                switch (this.mAlgorithm.checkRtl(charSequence, i, i2)) {
                    case v.m /*0*/:
                        return true;
                    case at.g /*1*/:
                        return false;
                    default:
                        return defaultIsRtl();
                }
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }

        public TextDirectionHeuristicImpl(TextDirectionAlgorithm textDirectionAlgorithm) {
            this.mAlgorithm = textDirectionAlgorithm;
        }
    }

    class TextDirectionHeuristicInternal extends TextDirectionHeuristicImpl {
        private final boolean mDefaultIsRtl;

        TextDirectionHeuristicInternal(TextDirectionAlgorithm textDirectionAlgorithm, boolean z, 1 1) {
            this(textDirectionAlgorithm, z);
        }

        protected boolean defaultIsRtl() {
            return this.mDefaultIsRtl;
        }

        private TextDirectionHeuristicInternal(TextDirectionAlgorithm textDirectionAlgorithm, boolean z) {
            super(textDirectionAlgorithm);
            this.mDefaultIsRtl = z;
        }
    }

    class TextDirectionHeuristicLocale extends TextDirectionHeuristicImpl {
        public static final TextDirectionHeuristicLocale INSTANCE;

        protected boolean defaultIsRtl() {
            if (TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                return true;
            }
            return false;
        }

        static {
            INSTANCE = new TextDirectionHeuristicLocale();
        }

        public TextDirectionHeuristicLocale() {
            super(null);
        }
    }

    private static int isRtlText(int i) {
        switch (i) {
            case v.m /*0*/:
                return 1;
            case at.g /*1*/:
            case at.i /*2*/:
                return 0;
            default:
                return 2;
        }
    }

    static int access$200(int i) {
        return isRtlText(i);
    }

    private static int isRtlTextOrFormat(int i) {
        switch (i) {
            case v.m /*0*/:
            case arj.Toolbar_titleMarginEnd /*14*/:
            case arj.Toolbar_titleMarginTop /*15*/:
                return 1;
            case at.g /*1*/:
            case at.i /*2*/:
            case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
            case arj.Toolbar_maxButtonHeight /*17*/:
                return 0;
            default:
                return 2;
        }
    }

    static {
        LTR = new TextDirectionHeuristicInternal(null, false, null);
        RTL = new TextDirectionHeuristicInternal(null, true, null);
        FIRSTSTRONG_LTR = new TextDirectionHeuristicInternal(FirstStrong.INSTANCE, false, null);
        FIRSTSTRONG_RTL = new TextDirectionHeuristicInternal(FirstStrong.INSTANCE, true, null);
        ANYRTL_LTR = new TextDirectionHeuristicInternal(AnyStrong.INSTANCE_RTL, false, null);
        LOCALE = TextDirectionHeuristicLocale.INSTANCE;
    }

    static int access$100(int i) {
        return isRtlTextOrFormat(i);
    }
}
