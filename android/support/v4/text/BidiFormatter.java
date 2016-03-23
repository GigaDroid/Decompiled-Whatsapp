package android.support.v4.text;

import android.support.v4.app.FragmentActivity;
import java.util.Locale;

public final class BidiFormatter {
    private static final BidiFormatter DEFAULT_LTR_INSTANCE;
    private static final BidiFormatter DEFAULT_RTL_INSTANCE;
    private static TextDirectionHeuristicCompat DEFAULT_TEXT_DIRECTION_HEURISTIC;
    private static final String LRM_STRING;
    private static final String RLM_STRING;
    private final TextDirectionHeuristicCompat mDefaultTextDirectionHeuristicCompat;
    private final int mFlags;
    private final boolean mIsRtlContext;

    public final class Builder {
        private int mFlags;
        private boolean mIsRtlContext;
        private TextDirectionHeuristicCompat mTextDirectionHeuristicCompat;

        private void initialize(boolean z) {
            this.mIsRtlContext = z;
            this.mTextDirectionHeuristicCompat = BidiFormatter.access$100();
            this.mFlags = 2;
        }

        public Builder() {
            initialize(BidiFormatter.access$000(Locale.getDefault()));
        }

        public BidiFormatter build() {
            if (this.mFlags == 2 && this.mTextDirectionHeuristicCompat == BidiFormatter.access$100()) {
                return getDefaultInstanceFromContext(this.mIsRtlContext);
            }
            return new BidiFormatter(this.mIsRtlContext, this.mFlags, this.mTextDirectionHeuristicCompat, null);
        }

        private static BidiFormatter getDefaultInstanceFromContext(boolean z) {
            return z ? BidiFormatter.access$200() : BidiFormatter.access$300();
        }

        public Builder setTextDirectionHeuristic(TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
            this.mTextDirectionHeuristicCompat = textDirectionHeuristicCompat;
            return this;
        }
    }

    class DirectionalityEstimator {
        private static final byte[] DIR_TYPE_CACHE;
        private int charIndex;
        private final boolean isHtml;
        private char lastChar;
        private final int length;
        private final String text;

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        byte dirTypeForward() {
            /*
            r4 = this;
            r1 = android.support.v4.text.TextDirectionHeuristicsCompat.a;
            r0 = r4.text;
            r2 = r4.charIndex;
            r0 = r0.charAt(r2);
            r4.lastChar = r0;
            r0 = r4.lastChar;
            r0 = java.lang.Character.isHighSurrogate(r0);
            if (r0 == 0) goto L_0x002a;
        L_0x0014:
            r0 = r4.text;
            r1 = r4.charIndex;
            r0 = java.lang.Character.codePointAt(r0, r1);
            r1 = r4.charIndex;
            r2 = java.lang.Character.charCount(r0);
            r1 = r1 + r2;
            r4.charIndex = r1;
            r0 = java.lang.Character.getDirectionality(r0);
        L_0x0029:
            return r0;
        L_0x002a:
            r0 = r4.charIndex;
            r0 = r0 + 1;
            r4.charIndex = r0;
            r0 = r4.lastChar;
            r0 = getCachedDirectionality(r0);
            r2 = r4.isHtml;
            if (r2 == 0) goto L_0x0050;
        L_0x003a:
            r2 = r4.lastChar;
            r3 = 60;
            if (r2 != r3) goto L_0x0046;
        L_0x0040:
            r0 = r4.skipTagForward();
            if (r1 == 0) goto L_0x0050;
        L_0x0046:
            r2 = r4.lastChar;
            r3 = 38;
            if (r2 != r3) goto L_0x0050;
        L_0x004c:
            r0 = r4.skipEntityForward();
        L_0x0050:
            r2 = android.support.v4.app.FragmentActivity.a;
            if (r2 == 0) goto L_0x0029;
        L_0x0054:
            r1 = r1 + 1;
            android.support.v4.text.TextDirectionHeuristicsCompat.a = r1;
            goto L_0x0029;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.text.BidiFormatter.DirectionalityEstimator.dirTypeForward():byte");
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        int getEntryDir() {
            /*
            r10 = this;
            r4 = 1;
            r3 = -1;
            r1 = 0;
            r6 = android.support.v4.text.TextDirectionHeuristicsCompat.a;
            r10.charIndex = r1;
            r0 = r1;
            r2 = r1;
            r5 = r1;
        L_0x000a:
            r7 = r10.charIndex;
            r8 = r10.length;
            if (r7 >= r8) goto L_0x0071;
        L_0x0010:
            if (r0 != 0) goto L_0x0071;
        L_0x0012:
            r7 = r10.dirTypeForward();
            switch(r7) {
                case 0: goto L_0x0031;
                case 1: goto L_0x006b;
                case 2: goto L_0x006b;
                case 3: goto L_0x0019;
                case 4: goto L_0x0019;
                case 5: goto L_0x0019;
                case 6: goto L_0x0019;
                case 7: goto L_0x0019;
                case 8: goto L_0x0019;
                case 9: goto L_0x002f;
                case 10: goto L_0x0019;
                case 11: goto L_0x0019;
                case 12: goto L_0x0019;
                case 13: goto L_0x0019;
                case 14: goto L_0x0021;
                case 15: goto L_0x0021;
                case 16: goto L_0x006f;
                case 17: goto L_0x006f;
                case 18: goto L_0x006d;
                default: goto L_0x0019;
            };
        L_0x0019:
            r0 = r5;
        L_0x001a:
            if (r6 == 0) goto L_0x003c;
        L_0x001c:
            r5 = r0;
        L_0x001d:
            if (r5 != 0) goto L_0x003e;
        L_0x001f:
            r4 = r1;
        L_0x0020:
            return r4;
        L_0x0021:
            r2 = r5 + 1;
            if (r6 == 0) goto L_0x0068;
        L_0x0025:
            r2 = r2 + 1;
            if (r6 == 0) goto L_0x0065;
        L_0x0029:
            r2 = r2 + -1;
            if (r6 == 0) goto L_0x0062;
        L_0x002d:
            r5 = r2;
            r2 = r1;
        L_0x002f:
            if (r6 == 0) goto L_0x000a;
        L_0x0031:
            r0 = r5;
            if (r0 != 0) goto L_0x0036;
        L_0x0034:
            r4 = r3;
            goto L_0x0020;
        L_0x0036:
            if (r6 == 0) goto L_0x003c;
        L_0x0038:
            if (r0 == 0) goto L_0x0020;
        L_0x003a:
            if (r6 != 0) goto L_0x001a;
        L_0x003c:
            r5 = r0;
            goto L_0x000a;
        L_0x003e:
            if (r2 == 0) goto L_0x0042;
        L_0x0040:
            r4 = r2;
            goto L_0x0020;
        L_0x0042:
            r2 = r10.charIndex;
            if (r2 <= 0) goto L_0x004f;
        L_0x0046:
            r2 = r10.dirTypeBackward();
            switch(r2) {
                case 14: goto L_0x0051;
                case 15: goto L_0x0051;
                case 16: goto L_0x0059;
                case 17: goto L_0x0059;
                case 18: goto L_0x005f;
                default: goto L_0x004d;
            };
        L_0x004d:
            if (r6 == 0) goto L_0x0042;
        L_0x004f:
            r4 = r1;
            goto L_0x0020;
        L_0x0051:
            if (r5 != r0) goto L_0x0055;
        L_0x0053:
            r4 = r3;
            goto L_0x0020;
        L_0x0055:
            r0 = r0 + -1;
            if (r6 == 0) goto L_0x004d;
        L_0x0059:
            if (r5 == r0) goto L_0x0020;
        L_0x005b:
            r0 = r0 + -1;
            if (r6 == 0) goto L_0x004d;
        L_0x005f:
            r0 = r0 + 1;
            goto L_0x004d;
        L_0x0062:
            r5 = r2;
            r2 = r1;
            goto L_0x000a;
        L_0x0065:
            r5 = r2;
            r2 = r4;
            goto L_0x000a;
        L_0x0068:
            r5 = r2;
            r2 = r3;
            goto L_0x000a;
        L_0x006b:
            r0 = r5;
            goto L_0x0038;
        L_0x006d:
            r2 = r5;
            goto L_0x0029;
        L_0x006f:
            r2 = r5;
            goto L_0x0025;
        L_0x0071:
            r9 = r0;
            r0 = r5;
            r5 = r9;
            goto L_0x001d;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.text.BidiFormatter.DirectionalityEstimator.getEntryDir():int");
        }

        private byte skipEntityBackward() {
            int i = this.charIndex;
            while (this.charIndex > 0) {
                String str = this.text;
                int i2 = this.charIndex - 1;
                this.charIndex = i2;
                this.lastChar = str.charAt(i2);
                if (this.lastChar != '&') {
                    if (this.lastChar == ';') {
                        break;
                    }
                }
                return (byte) 12;
            }
            this.charIndex = i;
            this.lastChar = ';';
            return (byte) 13;
        }

        static {
            DIR_TYPE_CACHE = new byte[1792];
            for (int i = 0; i < 1792; i++) {
                DIR_TYPE_CACHE[i] = Character.getDirectionality(i);
            }
        }

        DirectionalityEstimator(String str, boolean z) {
            this.text = str;
            this.isHtml = z;
            this.length = str.length();
        }

        private static byte getCachedDirectionality(char c) {
            return c < '\u0700' ? DIR_TYPE_CACHE[c] : Character.getDirectionality(c);
        }

        private byte skipTagBackward() {
            int i = TextDirectionHeuristicsCompat.a;
            int i2 = this.charIndex;
            while (this.charIndex > 0) {
                String str = this.text;
                int i3 = this.charIndex - 1;
                this.charIndex = i3;
                this.lastChar = str.charAt(i3);
                if (this.lastChar != '<') {
                    if (this.lastChar == '>' && i == 0) {
                        break;
                    } else if (this.lastChar == '\"' || this.lastChar == '\'') {
                        char c = this.lastChar;
                        while (this.charIndex > 0) {
                            String str2 = this.text;
                            int i4 = this.charIndex - 1;
                            this.charIndex = i4;
                            char charAt = str2.charAt(i4);
                            this.lastChar = charAt;
                            if (charAt == c) {
                                break;
                            }
                        }
                        if (i != 0) {
                            break;
                        }
                    }
                } else {
                    return (byte) 12;
                }
            }
            this.charIndex = i2;
            this.lastChar = '>';
            return (byte) 13;
        }

        private byte skipTagForward() {
            int i = TextDirectionHeuristicsCompat.a;
            int i2 = this.charIndex;
            while (this.charIndex < this.length) {
                String str = this.text;
                int i3 = this.charIndex;
                this.charIndex = i3 + 1;
                this.lastChar = str.charAt(i3);
                if (this.lastChar == '>') {
                    return (byte) 12;
                }
                if (this.lastChar == '\"' || this.lastChar == '\'') {
                    char c = this.lastChar;
                    while (this.charIndex < this.length) {
                        String str2 = this.text;
                        int i4 = this.charIndex;
                        this.charIndex = i4 + 1;
                        char charAt = str2.charAt(i4);
                        this.lastChar = charAt;
                        if (charAt == c) {
                            break;
                        }
                    }
                    if (i != 0) {
                        break;
                    }
                }
            }
            this.charIndex = i2;
            this.lastChar = '<';
            return (byte) 13;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        int getExitDir() {
            /*
            r8 = this;
            r4 = 1;
            r3 = -1;
            r1 = 0;
            r5 = android.support.v4.text.TextDirectionHeuristicsCompat.a;
            r0 = r8.length;
            r8.charIndex = r0;
            r0 = r1;
            r2 = r1;
        L_0x000b:
            r6 = r8.charIndex;
            if (r6 <= 0) goto L_0x001d;
        L_0x000f:
            r6 = r8.dirTypeBackward();
            switch(r6) {
                case 0: goto L_0x001e;
                case 1: goto L_0x002f;
                case 2: goto L_0x002f;
                case 3: goto L_0x0016;
                case 4: goto L_0x0016;
                case 5: goto L_0x0016;
                case 6: goto L_0x0016;
                case 7: goto L_0x0016;
                case 8: goto L_0x0016;
                case 9: goto L_0x0047;
                case 10: goto L_0x0016;
                case 11: goto L_0x0016;
                case 12: goto L_0x0016;
                case 13: goto L_0x0016;
                case 14: goto L_0x0027;
                case 15: goto L_0x0027;
                case 16: goto L_0x003b;
                case 17: goto L_0x003b;
                case 18: goto L_0x0043;
                default: goto L_0x0016;
            };
        L_0x0016:
            r7 = r0;
            r0 = r2;
            r2 = r7;
            if (r2 != 0) goto L_0x004c;
        L_0x001b:
            if (r5 == 0) goto L_0x004a;
        L_0x001d:
            return r1;
        L_0x001e:
            if (r2 != 0) goto L_0x0022;
        L_0x0020:
            r1 = r3;
            goto L_0x001d;
        L_0x0022:
            if (r0 != 0) goto L_0x000b;
        L_0x0024:
            if (r5 == 0) goto L_0x0050;
        L_0x0026:
            r0 = r2;
        L_0x0027:
            if (r0 != r2) goto L_0x002b;
        L_0x0029:
            r1 = r3;
            goto L_0x001d;
        L_0x002b:
            r2 = r2 + -1;
            if (r5 == 0) goto L_0x000b;
        L_0x002f:
            r7 = r0;
            r0 = r2;
            r2 = r7;
            if (r0 != 0) goto L_0x0036;
        L_0x0034:
            r1 = r4;
            goto L_0x001d;
        L_0x0036:
            if (r2 != 0) goto L_0x004c;
        L_0x0038:
            if (r5 == 0) goto L_0x004a;
        L_0x003a:
            r2 = r0;
        L_0x003b:
            if (r0 != r2) goto L_0x003f;
        L_0x003d:
            r1 = r4;
            goto L_0x001d;
        L_0x003f:
            r2 = r2 + -1;
            if (r5 == 0) goto L_0x000b;
        L_0x0043:
            r2 = r2 + 1;
            if (r5 == 0) goto L_0x000b;
        L_0x0047:
            if (r5 == 0) goto L_0x000b;
        L_0x0049:
            goto L_0x0016;
        L_0x004a:
            r2 = r0;
            goto L_0x000b;
        L_0x004c:
            r7 = r2;
            r2 = r0;
            r0 = r7;
            goto L_0x000b;
        L_0x0050:
            r0 = r2;
            goto L_0x000b;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.text.BidiFormatter.DirectionalityEstimator.getExitDir():int");
        }

        private byte skipEntityForward() {
            while (this.charIndex < this.length) {
                String str = this.text;
                int i = this.charIndex;
                this.charIndex = i + 1;
                char charAt = str.charAt(i);
                this.lastChar = charAt;
                if (charAt == ';') {
                    break;
                }
            }
            return (byte) 12;
        }

        byte dirTypeBackward() {
            int i = TextDirectionHeuristicsCompat.a;
            this.lastChar = this.text.charAt(this.charIndex - 1);
            if (Character.isLowSurrogate(this.lastChar)) {
                int codePointBefore = Character.codePointBefore(this.text, this.charIndex);
                this.charIndex -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.charIndex--;
            byte cachedDirectionality = getCachedDirectionality(this.lastChar);
            if (!this.isHtml) {
                return cachedDirectionality;
            }
            if (this.lastChar == '>') {
                cachedDirectionality = skipTagBackward();
                if (i == 0) {
                    return cachedDirectionality;
                }
                FragmentActivity.a++;
            }
            if (this.lastChar == ';') {
                return skipEntityBackward();
            }
            return cachedDirectionality;
        }
    }

    private BidiFormatter(boolean z, int i, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        this.mIsRtlContext = z;
        this.mFlags = i;
        this.mDefaultTextDirectionHeuristicCompat = textDirectionHeuristicCompat;
    }

    public boolean isRtl(String str) {
        return this.mDefaultTextDirectionHeuristicCompat.isRtl(str, 0, str.length());
    }

    static BidiFormatter access$200() {
        return DEFAULT_RTL_INSTANCE;
    }

    private String markAfter(String str, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        boolean isRtl = textDirectionHeuristicCompat.isRtl(str, 0, str.length());
        if (!this.mIsRtlContext && (isRtl || getExitDir(str) == 1)) {
            return LRM_STRING;
        }
        if (!this.mIsRtlContext || (isRtl && getExitDir(str) != -1)) {
            return "";
        }
        return RLM_STRING;
    }

    static {
        DEFAULT_TEXT_DIRECTION_HEURISTIC = TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR;
        LRM_STRING = Character.toString('\u200e');
        RLM_STRING = Character.toString('\u200f');
        DEFAULT_LTR_INSTANCE = new BidiFormatter(false, 2, DEFAULT_TEXT_DIRECTION_HEURISTIC);
        DEFAULT_RTL_INSTANCE = new BidiFormatter(true, 2, DEFAULT_TEXT_DIRECTION_HEURISTIC);
    }

    private static int getEntryDir(String str) {
        return new DirectionalityEstimator(str, false).getEntryDir();
    }

    static boolean access$000(Locale locale) {
        return isRtlLocale(locale);
    }

    private static boolean isRtlLocale(Locale locale) {
        return TextUtilsCompat.getLayoutDirectionFromLocale(locale) == 1;
    }

    private static int getExitDir(String str) {
        return new DirectionalityEstimator(str, false).getExitDir();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String unicodeWrap(java.lang.String r4, android.support.v4.text.TextDirectionHeuristicCompat r5, boolean r6) {
        /*
        r3 = this;
        if (r4 != 0) goto L_0x0004;
    L_0x0002:
        r0 = 0;
    L_0x0003:
        return r0;
    L_0x0004:
        r0 = 0;
        r1 = r4.length();
        r1 = r5.isRtl(r4, r0, r1);
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r0 = r3.getStereoReset();
        if (r0 == 0) goto L_0x0025;
    L_0x0018:
        if (r6 == 0) goto L_0x0025;
    L_0x001a:
        if (r1 == 0) goto L_0x0051;
    L_0x001c:
        r0 = android.support.v4.text.TextDirectionHeuristicsCompat.RTL;
    L_0x001e:
        r0 = r3.markBefore(r4, r0);
        r2.append(r0);
    L_0x0025:
        r0 = r3.mIsRtlContext;
        if (r1 == r0) goto L_0x003c;
    L_0x0029:
        if (r1 == 0) goto L_0x0054;
    L_0x002b:
        r0 = 8235; // 0x202b float:1.154E-41 double:4.0686E-320;
    L_0x002d:
        r2.append(r0);
        r2.append(r4);
        r0 = 8236; // 0x202c float:1.1541E-41 double:4.069E-320;
        r2.append(r0);
        r0 = android.support.v4.text.TextDirectionHeuristicsCompat.a;
        if (r0 == 0) goto L_0x003f;
    L_0x003c:
        r2.append(r4);
    L_0x003f:
        if (r6 == 0) goto L_0x004c;
    L_0x0041:
        if (r1 == 0) goto L_0x0057;
    L_0x0043:
        r0 = android.support.v4.text.TextDirectionHeuristicsCompat.RTL;
    L_0x0045:
        r0 = r3.markAfter(r4, r0);
        r2.append(r0);
    L_0x004c:
        r0 = r2.toString();
        goto L_0x0003;
    L_0x0051:
        r0 = android.support.v4.text.TextDirectionHeuristicsCompat.LTR;
        goto L_0x001e;
    L_0x0054:
        r0 = 8234; // 0x202a float:1.1538E-41 double:4.068E-320;
        goto L_0x002d;
    L_0x0057:
        r0 = android.support.v4.text.TextDirectionHeuristicsCompat.LTR;
        goto L_0x0045;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.text.BidiFormatter.unicodeWrap(java.lang.String, android.support.v4.text.TextDirectionHeuristicCompat, boolean):java.lang.String");
    }

    public String unicodeWrap(String str) {
        return unicodeWrap(str, this.mDefaultTextDirectionHeuristicCompat, true);
    }

    static BidiFormatter access$300() {
        return DEFAULT_LTR_INSTANCE;
    }

    private String markBefore(String str, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        boolean isRtl = textDirectionHeuristicCompat.isRtl(str, 0, str.length());
        if (!this.mIsRtlContext && (isRtl || getEntryDir(str) == 1)) {
            return LRM_STRING;
        }
        if (!this.mIsRtlContext || (isRtl && getEntryDir(str) != -1)) {
            return "";
        }
        return RLM_STRING;
    }

    public boolean getStereoReset() {
        return (this.mFlags & 2) != 0;
    }

    static TextDirectionHeuristicCompat access$100() {
        return DEFAULT_TEXT_DIRECTION_HEURISTIC;
    }

    public static BidiFormatter getInstance() {
        return new Builder().build();
    }

    BidiFormatter(boolean z, int i, TextDirectionHeuristicCompat textDirectionHeuristicCompat, 1 1) {
        this(z, i, textDirectionHeuristicCompat);
    }
}
