package com.whatsapp.protocol;

import com.whatsapp.WAAppCompatActivity;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public final class VoipOptions {
    private static final String[] z;
    public final ABTest abTest;
    public final Aec aec;
    public final Agc agc;
    public final AudioRestrict audioRestrict;
    public final BandwidthEstimator bwe;
    public final b4 client;
    public final Decode decode;
    public final Encode encode;
    public final Miscellaneous miscellaneous;
    public final NoiseSuppression noiseSuppression;
    public final RateControl rateControl;
    public final RelayElection re;
    public final Resend resend;

    public final class ABTest {
        private static final String[] z;
        public final String name;

        static {
            String[] strArr = new String[2];
            String str = "\t=@\u0005g<\u0004z\u0001y-B";
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
                            i3 = 72;
                            break;
                        case at.g /*1*/:
                            i3 = 127;
                            break;
                        case at.i /*2*/:
                            i3 = 20;
                            break;
                        case at.o /*3*/:
                            i3 = 96;
                            break;
                        default:
                            i3 = 20;
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
                        str = "&\u001ey\u0005";
                        obj = null;
                }
            }
        }

        public String toString() {
            return z[0] + this.name + "}";
        }

        public ABTest(String str) {
            this.name = str;
        }

        public static ABTest fromProtocolTreeNode(cw cwVar) {
            if (cwVar == null) {
                return null;
            }
            return new ABTest(cwVar.b(z[1]));
        }
    }

    public final class Aec {
        private static final String[] z;
        public final Integer aecmAdaptStepSize;
        public final Integer aecmDataWidth;
        public final Boolean aecmDynamicQ;
        public final Integer aecmSupgainScale;
        public final String algorithm;
        public final Short builtinEnabled;
        public final Boolean disableAgc;
        public final Boolean disableSwEcWhenBuiltinAvailable;
        public final Integer ecOffThreshold;
        public final Integer ecThreshold;
        public final Integer echoDetectorImpl;
        public final Short echoDetectorMode;
        public final Integer length;
        public final Short mode;
        public final Integer offset;
        public final Integer strengthThreshold;
        public final Boolean toneDetectorEnabled;
        public final Boolean useCleanCapture;

        static {
            String[] strArr = new String[47];
            String str = "\"Fwa\tc\"wp\u000bY\u000frp\u00023";
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
                            i3 = 14;
                            break;
                        case at.g /*1*/:
                            i3 = arj.Theme_checkboxStyle;
                            break;
                        case at.i /*2*/:
                            i3 = 22;
                            break;
                        case at.o /*3*/:
                            i3 = 4;
                            break;
                        default:
                            i3 = arj.Theme_ratingBarStyle;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        i = 2;
                        strArr2 = strArr3;
                        str = "\"Fcw\u000fM\nse\u0004M\u0007fp\u001f|\u0003+";
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        i = 3;
                        str = "\"Fsg\u0002a\"sp\u000fm\u0012yv'a\u0002s9";
                        obj = 2;
                        strArr2 = strArr3;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        str = "\"Fwa\tc\"oj\u000bc\u000fuUW";
                        obj = 3;
                        i = 4;
                        strArr2 = strArr3;
                        break;
                    case at.o /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        strArr2 = strArr3;
                        str = "O\u0003u\u007f\u000bb\u0001yv\u0003z\u000e{9M";
                        obj = 4;
                        break;
                    case at.p /*4*/:
                        strArr2[i] = str;
                        i = 6;
                        str = "\"Fyb\f}\u0003b9";
                        obj = 5;
                        strArr2 = strArr3;
                        break;
                    case at.m /*5*/:
                        strArr2[i] = str;
                        i = 7;
                        str = "\"Frm\u0019o\u0004za9y#uS\u0002k\bTq\u0003b\u0012\u007fj+x\u0007\u007fh\u000bl\ns9";
                        obj = 6;
                        strArr2 = strArr3;
                        break;
                    case Y.f /*6*/:
                        strArr2[i] = str;
                        i = 8;
                        str = "\"F{k\u000ek[";
                        obj = 7;
                        strArr2 = strArr3;
                        break;
                    case aF.v /*7*/:
                        strArr2[i] = str;
                        i = 9;
                        str = "\"Fza\u0004i\u0012~9";
                        obj = 8;
                        strArr2 = strArr3;
                        break;
                    case aF.u /*8*/:
                        strArr2[i] = str;
                        i = 10;
                        str = "\"Fwa\tc're\u001az5ba\u001a]\u000flaW";
                        obj = 9;
                        strArr2 = strArr3;
                        break;
                    case Y.l /*9*/:
                        strArr2[i] = str;
                        i = 11;
                        str = "\"Fsg\u0002a\"sp\u000fm\u0012yv#c\u0016z9";
                        obj = 10;
                        strArr2 = strArr3;
                        break;
                    case Y.t /*10*/:
                        strArr2[i] = str;
                        i = 12;
                        str = "\"Ftq\u0003b\u0012\u007fj/`\u0007th\u000fj[";
                        obj = 11;
                        strArr2 = strArr3;
                        break;
                    case Y.j /*11*/:
                        strArr2[i] = str;
                        i = 13;
                        str = "\"Fwa\tc5ct\ro\u000fxW\to\ns9";
                        obj = 12;
                        strArr2 = strArr3;
                        break;
                    case Y.p /*12*/:
                        strArr2[i] = str;
                        str = "\"Fep\u0018k\bqp\u0002Z\u000eda\u0019f\tz`W";
                        obj = 13;
                        i = 14;
                        strArr2 = strArr3;
                        break;
                    case Y.q /*13*/:
                        strArr2[i] = str;
                        i = 15;
                        strArr2 = strArr3;
                        str = "\"Frm\u0019o\u0004za+i\u0005+";
                        obj = 14;
                        break;
                    case arj.Toolbar_titleMarginEnd /*14*/:
                        strArr2[i] = str;
                        i = 16;
                        str = "\"Fsg>f\u0014sw\u0002a\nr9";
                        obj = 15;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_titleMarginTop /*15*/:
                        strArr2[i] = str;
                        i = 17;
                        str = "l\u0013\u007fh\u001eg\b";
                        obj = 16;
                        strArr2 = strArr3;
                        break;
                    case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                        strArr2[i] = str;
                        i = 18;
                        str = "}\u0012da\u0004i\u0012~[\u001ef\u0014sw\u0002a\nr";
                        obj = 17;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_maxButtonHeight /*17*/:
                        strArr2[i] = str;
                        i = 19;
                        str = "o\u0003ui5o\u0002wt\u001eQ\u0015ba\u001aQ\u0015\u007f~\u000f";
                        obj = 18;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_collapseIcon /*18*/:
                        strArr2[i] = str;
                        i = 20;
                        str = "k\u0005Ik\fh9bl\u0018k\u0015~k\u0006j";
                        obj = 19;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_collapseContentDescription /*19*/:
                        strArr2[i] = str;
                        i = 21;
                        str = "l\u0013\u007fh\u001eg\b";
                        obj = 20;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_navigationIcon /*20*/:
                        strArr2[i] = str;
                        str = "k\u0005~k5j\u0003ba\tz\td[\u0003c\u0016z";
                        obj = 21;
                        i = 22;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_navigationContentDescription /*21*/:
                        strArr2[i] = str;
                        i = 23;
                        strArr2 = strArr3;
                        str = "b\u0003xc\u001ef";
                        obj = 22;
                        break;
                    case arj.Toolbar_logoDescription /*22*/:
                        strArr2[i] = str;
                        i = 24;
                        str = "k\u0005Ip\u0002|\u0003el\u0005b\u0002";
                        obj = 23;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_titleTextColor /*23*/:
                        strArr2[i] = str;
                        i = 25;
                        str = "}\u0012da\u0004i\u0012~[\u001ef\u0014sw\u0002a\nr";
                        obj = 24;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_subtitleTextColor /*24*/:
                        strArr2[i] = str;
                        i = 26;
                        str = "{\u0015s[\tb\u0003wj5m\u0007fp\u001f|\u0003";
                        obj = 25;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionMenuTextAppearance /*25*/:
                        strArr2[i] = str;
                        i = 27;
                        str = "o\u0003ui5j\u0007be5y\u000frp\u0002";
                        obj = 26;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionMenuTextColor /*26*/:
                        strArr2[i] = str;
                        i = 28;
                        str = "z\txa\u000ek\u0012sg\u001ea\u0014";
                        obj = 27;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeStyle /*27*/:
                        strArr2[i] = str;
                        i = 29;
                        str = "j\u000fee\bb\u0003Iw\u001dQ\u0003u[\u001df\u0003x[\b{\u000fzp\u0003`9wr\u000bg\nwf\u0006k";
                        obj = 28;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeCloseButtonStyle /*28*/:
                        strArr2[i] = str;
                        i = 30;
                        str = "o\u0003ui5j\u0007be5y\u000frp\u0002";
                        obj = 29;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeBackground /*29*/:
                        strArr2[i] = str;
                        i = 31;
                        str = "k\u0005~k5j\u0003ba\tz\td[\u0007a\u0002s";
                        obj = 30;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeSplitBackground /*30*/:
                        strArr2[i] = str;
                        i = 32;
                        str = "b\u0003xc\u001ef";
                        obj = 31;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeCloseDrawable /*31*/:
                        strArr2[i] = str;
                        i = 33;
                        str = "o\u0003ui5o\u0002wt\u001eQ\u0015ba\u001aQ\u0015\u007f~\u000f";
                        obj = 32;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeCutDrawable /*32*/:
                        strArr2[i] = str;
                        i = 34;
                        str = "o\nqk\u0018g\u0012~i";
                        obj = 33;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeCopyDrawable /*33*/:
                        strArr2[i] = str;
                        i = 35;
                        str = "c\tra";
                        obj = 34;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModePasteDrawable /*34*/:
                        strArr2[i] = str;
                        i = 36;
                        str = "o\u0003ui5}\u0013fc\u000bg\bIw\to\ns";
                        obj = 35;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeSelectAllDrawable /*35*/:
                        strArr2[i] = str;
                        i = 37;
                        str = "a\u0000pw\u000fz";
                        obj = 36;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeShareDrawable /*36*/:
                        strArr2[i] = str;
                        i = 38;
                        str = "j\u000fee\bb\u0003Ie\rm";
                        obj = 37;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeFindDrawable /*37*/:
                        strArr2[i] = str;
                        i = 39;
                        str = "c\tra";
                        obj = 38;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeWebSearchDrawable /*38*/:
                        strArr2[i] = str;
                        i = 40;
                        str = "k\u0005~k5j\u0003ba\tz\td[\u0003c\u0016z";
                        obj = 39;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModePopupWindowStyle /*39*/:
                        strArr2[i] = str;
                        i = 41;
                        str = "a\u0000pw\u000fz";
                        obj = 40;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                        strArr2[i] = str;
                        i = 42;
                        str = "k\u0005Ik\fh9bl\u0018k\u0015~k\u0006j";
                        obj = 41;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                        strArr2[i] = str;
                        i = 43;
                        str = "k\u0005~k5j\u0003ba\tz\td[\u0007a\u0002s";
                        obj = 42;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_dialogTheme /*42*/:
                        strArr2[i] = str;
                        i = 44;
                        str = "k\u0005Ip\u0002|\u0003el\u0005b\u0002";
                        obj = 43;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_dialogPreferredPadding /*43*/:
                        strArr2[i] = str;
                        i = 45;
                        str = "o\u0003ui5}\u0013fc\u000bg\bIw\to\ns";
                        obj = 44;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_listDividerAlertDialog /*44*/:
                        strArr2[i] = str;
                        i = 46;
                        str = "o\u0003ui5j\u001fxe\u0007g\u0005Iu5k\b";
                        obj = 45;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionDropDownStyle /*45*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "\"Fsg%h\u0000Bl\u0018k\u0015~k\u0006j[";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public static Aec fromProtocolTreeNode(cw cwVar) {
            if (cwVar == null) {
                return null;
            }
            String b = cwVar.b(z[34]);
            String b2 = cwVar.b(z[37]);
            String b3 = cwVar.b(z[32]);
            String b4 = cwVar.b(z[35]);
            String b5 = cwVar.b(z[40]);
            String b6 = cwVar.b(z[43]);
            String b7 = cwVar.b(z[44]);
            String b8 = cwVar.b(z[42]);
            String b9 = cwVar.b(z[17]);
            String b10 = cwVar.b(z[29]);
            String b11 = cwVar.b(z[28]);
            Integer access$000 = VoipOptions.access$000(b2, z[41]);
            Integer access$0002 = VoipOptions.access$000(b3, z[23]);
            Short access$100 = VoipOptions.access$100(b4, z[39], 0, 4);
            Integer access$0003 = VoipOptions.access$000(b5, z[22]);
            Short access$1002 = VoipOptions.access$100(b6, z[31], 0, 7);
            Integer access$0004 = VoipOptions.access$000(b7, z[24]);
            Integer access$0005 = VoipOptions.access$000(b8, z[20]);
            Integer access$0006 = VoipOptions.access$000(cwVar.b(z[25]), z[18]);
            Short access$1003 = VoipOptions.access$100(b9, z[21], 0, 7);
            Boolean access$200 = VoipOptions.access$200(b10);
            Boolean access$2002 = VoipOptions.access$200(b11);
            Boolean access$2003 = VoipOptions.access$200(cwVar.b(z[38]));
            Boolean access$2004 = VoipOptions.access$200(cwVar.b(z[26]));
            Boolean access$2005 = VoipOptions.access$200(cwVar.b(z[46]));
            cw cwVar2 = cwVar;
            Integer access$0007 = VoipOptions.access$000(cwVar2.b(z[33]), z[19]);
            cwVar2 = cwVar;
            Integer access$0008 = VoipOptions.access$000(cwVar2.b(z[45]), z[36]);
            cwVar2 = cwVar;
            return new Aec(b, access$000, access$0002, access$100, access$0003, access$1002, access$0004, access$0005, access$0006, access$1003, access$200, access$2002, access$2003, access$2004, access$2005, access$0007, access$0008, VoipOptions.access$000(cwVar2.b(z[27]), z[30]));
        }

        public Aec(String str, Integer num, Integer num2, Short sh, Integer num3, Short sh2, Integer num4, Integer num5, Integer num6, Short sh3, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Integer num7, Integer num8, Integer num9) {
            this.algorithm = str;
            this.offset = num;
            this.length = num2;
            this.mode = sh;
            this.echoDetectorImpl = num3;
            this.echoDetectorMode = sh2;
            this.ecThreshold = num4;
            this.ecOffThreshold = num5;
            this.strengthThreshold = num6;
            this.builtinEnabled = sh3;
            this.disableSwEcWhenBuiltinAvailable = bool;
            this.toneDetectorEnabled = bool2;
            this.disableAgc = bool3;
            this.useCleanCapture = bool4;
            this.aecmDynamicQ = bool5;
            this.aecmAdaptStepSize = num7;
            this.aecmSupgainScale = num8;
            this.aecmDataWidth = num9;
        }

        public String toString() {
            return z[5] + this.algorithm + '\'' + z[6] + this.offset + z[9] + this.length + z[8] + this.mode + z[11] + this.echoDetectorImpl + z[3] + this.echoDetectorMode + z[16] + this.ecThreshold + z[1] + this.ecOffThreshold + z[14] + this.strengthThreshold + z[12] + this.builtinEnabled + z[7] + this.disableSwEcWhenBuiltinAvailable + z[15] + this.disableAgc + z[2] + this.useCleanCapture + z[4] + this.aecmDynamicQ + z[10] + this.aecmAdaptStepSize + z[13] + this.aecmSupgainScale + z[0] + this.aecmDataWidth + '}';
        }
    }

    public final class Agc {
        private static final String[] z;
        public final Boolean builtinEnabled;
        public final Short compressionGain;
        public final Boolean enableLimiter;
        public final Short mode;
        public final Integer strengthThreshold;
        public final Short targetLevel;

        static {
            String[] strArr = new String[16];
            String str = "\u0019!\u0019Vp\u001f=\u0007Om\u0014)\u0015Ol";
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
                            i3 = 122;
                            break;
                        case at.g /*1*/:
                            i3 = 78;
                            break;
                        case at.i /*2*/:
                            i3 = 116;
                            break;
                        case at.o /*3*/:
                            i3 = 38;
                            break;
                        default:
                            i3 = 2;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "\t:\u0006Cl\u001d:\u001cyv\u0012<\u0011Uj\u0015\"\u0010";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        str = "\u0019!\u0019Vp\u001f=\u0007Om\u0014n\u0013Gk\u0014";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        str = "\t:\u0006Cl\u001d:\u001cyv\u0012<\u0011Uj\u0015\"\u0010";
                        i = 4;
                        strArr2 = strArr3;
                        obj = 3;
                        break;
                    case at.o /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        strArr2 = strArr3;
                        str = "\u000e/\u0006Ag\u000e\"\u0011Pg\u0016";
                        obj = 4;
                        break;
                    case at.p /*4*/:
                        strArr2[i] = str;
                        i = 6;
                        str = "\u000e/\u0006Ag\u000en\u0018Ct\u001f\"";
                        obj = 5;
                        strArr2 = strArr3;
                        break;
                    case at.m /*5*/:
                        strArr2[i] = str;
                        i = 7;
                        str = "\u0017!\u0010C";
                        obj = 6;
                        strArr2 = strArr3;
                        break;
                    case Y.f /*6*/:
                        strArr2[i] = str;
                        i = 8;
                        str = "\u0018;\u001dJv\u0013 ";
                        obj = 7;
                        strArr2 = strArr3;
                        break;
                    case aF.v /*7*/:
                        strArr2[i] = str;
                        i = 9;
                        str = "\u0017!\u0010C";
                        obj = 8;
                        strArr2 = strArr3;
                        break;
                    case aF.u /*8*/:
                        strArr2[i] = str;
                        i = 10;
                        str = "Vn\u0016Sk\u0016:\u001dHG\u0014/\u0016Jg\u001es";
                        obj = 9;
                        strArr2 = strArr3;
                        break;
                    case Y.l /*9*/:
                        strArr2[i] = str;
                        i = 11;
                        str = "Vn\u0019If\u001fs";
                        obj = 10;
                        strArr2 = strArr3;
                        break;
                    case Y.t /*10*/:
                        strArr2[i] = str;
                        i = 12;
                        str = ";)\u0017]v\u001b<\u0013Cv6+\u0002CnG";
                        obj = 11;
                        strArr2 = strArr3;
                        break;
                    case Y.j /*11*/:
                        strArr2[i] = str;
                        i = 13;
                        str = "Vn\u0017Io\n<\u0011Uq\u0013!\u001aac\u0013 I";
                        obj = 12;
                        strArr2 = strArr3;
                        break;
                    case Y.p /*12*/:
                        strArr2[i] = str;
                        i = 14;
                        str = "Vn\u0007Rp\u001f \u0013Rj.&\u0006Cq\u0012!\u0018B?";
                        obj = 13;
                        strArr2 = strArr3;
                        break;
                    case Y.q /*13*/:
                        strArr2[i] = str;
                        i = 15;
                        str = "Vn\u0011Hc\u0018\"\u0011jk\u0017'\u0000CpG";
                        obj = 14;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_titleMarginEnd /*14*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "\u0016'\u0019Ov\u001f<\u0011Hc\u0018\"\u0011";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public Agc(Short sh, Short sh2, Boolean bool, Short sh3, Boolean bool2, Integer num) {
            this.targetLevel = sh;
            this.compressionGain = sh2;
            this.enableLimiter = bool;
            this.mode = sh3;
            this.builtinEnabled = bool2;
            this.strengthThreshold = num;
        }

        public String toString() {
            return z[12] + this.targetLevel + z[13] + this.compressionGain + z[15] + this.enableLimiter + z[11] + this.mode + z[10] + this.builtinEnabled + z[14] + this.strengthThreshold + '}';
        }

        public static Agc fromProtocolTreeNode(cw cwVar) {
            if (cwVar == null) {
                return null;
            }
            return new Agc(VoipOptions.access$100(cwVar.b(z[5]), z[6], 0, 31), VoipOptions.access$100(cwVar.b(z[0]), z[3], 0, 90), VoipOptions.access$200(cwVar.b(z[1])), VoipOptions.access$100(cwVar.b(z[9]), z[7], 0, 2), VoipOptions.access$200(cwVar.b(z[8])), VoipOptions.access$000(cwVar.b(z[2]), z[4]));
        }
    }

    public final class AudioRestrict {
        private static final String[] z;
        public final String encoding;
        public final Integer rate;

        static {
            String[] strArr = new String[5];
            String str = "`o'mhs\u007f0puHy7\u007fbOy,`nO}~#";
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
                            i3 = 33;
                            break;
                        case at.g /*1*/:
                            i3 = 26;
                            break;
                        case at.i /*2*/:
                            i3 = 67;
                            break;
                        case at.o /*3*/:
                            i3 = 4;
                            break;
                        default:
                            i3 = 7;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "Dt ";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        str = "S{7a";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        str = "S{7a";
                        i = 4;
                        strArr2 = strArr3;
                        obj = 3;
                        break;
                    case at.o /*3*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "\r:1esD'";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public static AudioRestrict fromProtocolTreeNode(cw cwVar) {
            if (cwVar == null) {
                return null;
            }
            return new AudioRestrict(cwVar.b(z[2]), VoipOptions.access$000(cwVar.b(z[3]), z[4]));
        }

        public String toString() {
            return z[0] + this.encoding + '\'' + z[1] + this.rate + '}';
        }

        public AudioRestrict(String str, Integer num) {
            this.encoding = str;
            this.rate = num;
        }
    }

    public final class BandwidthEstimator {
        private static final String[] z;
        public final Short actionOnRtpMarker;
        public final Boolean maxUnknownOnRateIncrease;
        public final Boolean resetOudTimestampOnBweReset;
        public final Boolean resetRccOnBweReset;
        public final Boolean useAudioPacketRate;

        static {
            String[] strArr = new String[11];
            String str = "\u0002&vbH\u0001,`RJ\u0001\u0018aSb\u001d&zXb\u0006)mOX\u000e4k";
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
                            i3 = 111;
                            break;
                        case at.g /*1*/:
                            i3 = 71;
                            break;
                        case at.i /*2*/:
                            i3 = 14;
                            break;
                        case at.o /*3*/:
                            i3 = 61;
                            break;
                        default:
                            i3 = 61;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "\u000e$zTR\u0001\u0018aSb\u001d3~bP\u000e5eXO";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        str = "\u001d\"}XI05m^b\u0000)Q_J\n\u0018|XN\n3";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        str = "\u000e$zTR\u0001\u0018aSb\u001d3~bP\u000e5eXO";
                        i = 4;
                        strArr2 = strArr3;
                        obj = 3;
                        break;
                    case at.o /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        strArr2 = strArr3;
                        str = "\u001a4kb\\\u001a#gRb\u001f&mVX\u001b\u0018|\\I\n";
                        obj = 4;
                        break;
                    case at.p /*4*/:
                        strArr2[i] = str;
                        i = 6;
                        str = "Cg{NX.2jTR?&mVX\u001b\u0015oIXR";
                        obj = 5;
                        strArr2 = strArr3;
                        break;
                    case at.m /*5*/:
                        strArr2[i] = str;
                        i = 7;
                        str = "-0kFP\u000e?[SV\u0001(ySr\u0001\u0015oIX&)mOX\u000e4k\u0000";
                        obj = 6;
                        strArr2 = strArr3;
                        break;
                    case Y.f /*6*/:
                        strArr2[i] = str;
                        i = 8;
                        str = "Cg|XN\n3AHY;.cXN\u001b&cMr\u0001\u0005yXo\n4kI\u0000";
                        obj = 7;
                        strArr2 = strArr3;
                        break;
                    case aF.v /*7*/:
                        strArr2[i] = str;
                        i = 9;
                        str = "Cgo^I\u0006(`rS=3~p\\\u001d,kO\u0000";
                        obj = 8;
                        strArr2 = strArr3;
                        break;
                    case aF.u /*8*/:
                        strArr2[i] = str;
                        i = 10;
                        str = "Cg|XN\n3\\^^ )LJX=\"}XIR";
                        obj = 9;
                        strArr2 = strArr3;
                        break;
                    case Y.l /*9*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "\u001d\"}XI0({Yb\u001b.cXN\u001b&cMb\u0000)Q_J\n\u0018|XN\n3";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public String toString() {
            return z[7] + this.maxUnknownOnRateIncrease + z[6] + this.useAudioPacketRate + z[10] + this.resetRccOnBweReset + z[8] + this.resetOudTimestampOnBweReset + z[9] + this.actionOnRtpMarker + '}';
        }

        public static BandwidthEstimator fromProtocolTreeNode(cw cwVar) {
            if (cwVar == null) {
                return null;
            }
            return new BandwidthEstimator(VoipOptions.access$200(cwVar.b(z[0])), VoipOptions.access$200(cwVar.b(z[5])), VoipOptions.access$200(cwVar.b(z[3])), VoipOptions.access$200(cwVar.b(z[1])), VoipOptions.access$100(cwVar.b(z[2]), z[4], 0, 15));
        }

        public BandwidthEstimator(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Short sh) {
            this.maxUnknownOnRateIncrease = bool;
            this.useAudioPacketRate = bool2;
            this.resetRccOnBweReset = bool3;
            this.resetOudTimestampOnBweReset = bool4;
            this.actionOnRtpMarker = sh;
        }
    }

    public final class Decode {
        private static final String[] z;
        public final Boolean forwardErrorCorrection;
        public final Short gain;
        public final Short plc;

        static {
            String[] strArr = new String[8];
            String str = "\u0006)sR\u0007'7w\\\n,q";
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
                            i3 = 66;
                            break;
                        case at.g /*1*/:
                            i3 = 76;
                            break;
                        case at.i /*2*/:
                            i3 = 16;
                            break;
                        case at.o /*3*/:
                            i3 = 61;
                            break;
                        default:
                            i3 = 99;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "$#bJ\u00020(UO\u0011->SR\u00110)sI\n-\"-";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        str = "2 s";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        str = "%-yS";
                        i = 4;
                        strArr2 = strArr3;
                        obj = 3;
                        break;
                    case at.o /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        strArr2 = strArr3;
                        str = "$)s";
                        obj = 4;
                        break;
                    case at.p /*4*/:
                        strArr2[i] = str;
                        i = 6;
                        str = "2 s";
                        obj = 5;
                        strArr2 = strArr3;
                        break;
                    case at.m /*5*/:
                        strArr2[i] = str;
                        i = 7;
                        str = "%-yS";
                        obj = 6;
                        strArr2 = strArr3;
                        break;
                    case Y.f /*6*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "2 s\u0000";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public String toString() {
            return z[0] + this.gain + z[2] + this.forwardErrorCorrection + z[1] + this.plc + '}';
        }

        public Decode(Short sh, Boolean bool, Short sh2) {
            this.gain = sh;
            this.forwardErrorCorrection = bool;
            this.plc = sh2;
        }

        public static Decode fromProtocolTreeNode(cw cwVar) {
            if (cwVar == null) {
                return null;
            }
            return new Decode(VoipOptions.access$500(cwVar.b(z[7]), z[4]), VoipOptions.access$200(cwVar.b(z[5])), VoipOptions.access$500(cwVar.b(z[3]), z[6]));
        }
    }

    public final class Encode {
        private static final String[] z;
        public final Short complexity;
        public final Boolean enableConstantBitrate;
        public final Boolean enableDiscontinuousTransmission;
        public final Boolean forwardErrorCorrection;
        public final Integer frameMs;
        public final Integer nonSpeechBitrate;
        public final Integer selectivelySkipNonSpeechFrames;
        public final Integer targetBitrate;
        public final Integer vadThreshold;

        static {
            String[] strArr = new String[25];
            String str = "\"s\u0015";
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
                            i3 = 68;
                            break;
                        case at.g /*1*/:
                            i3 = 22;
                            break;
                        case at.i /*2*/:
                            i3 = 118;
                            break;
                        case at.o /*3*/:
                            i3 = 44;
                            break;
                        default:
                            i3 = 74;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "'y\u001b\\&!n\u001fX3";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        str = "2w\u0012s>,d\u0013_\"+z\u0012";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        i = 4;
                        strArr2 = strArr3;
                        str = "7s\u001aI)0\u007f\u0000I&=I\u0005G#4I\u0018C$\u001be\u0006I/'~)J8%{\u0013_";
                        obj = 3;
                        break;
                    case at.o /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        str = "%c\u0002C";
                        obj = 4;
                        strArr2 = strArr3;
                        break;
                    case at.p /*4*/:
                        strArr2[i] = str;
                        i = 6;
                        str = "\"d\u0017A/\u001b{\u0005";
                        obj = 5;
                        strArr2 = strArr3;
                        break;
                    case at.m /*5*/:
                        strArr2[i] = str;
                        i = 7;
                        str = " b\u000e";
                        obj = 6;
                        strArr2 = strArr3;
                        break;
                    case Y.f /*6*/:
                        strArr2[i] = str;
                        i = 8;
                        str = "&\u007f\u0002^+0s";
                        obj = 7;
                        strArr2 = strArr3;
                        break;
                    case aF.v /*7*/:
                        strArr2[i] = str;
                        i = 9;
                        str = "*y\u0018s94s\u0013O\"\u001bt\u001fX8%b\u0013";
                        obj = 8;
                        strArr2 = strArr3;
                        break;
                    case aF.u /*8*/:
                        strArr2[i] = str;
                        i = 10;
                        str = "\"d\u0017A/\u001b{\u0005";
                        obj = 9;
                        strArr2 = strArr3;
                        break;
                    case Y.l /*9*/:
                        strArr2[i] = str;
                        i = 11;
                        str = "2w\u0012s>,d\u0013_\"+z\u0012";
                        obj = 10;
                        strArr2 = strArr3;
                        break;
                    case Y.t /*10*/:
                        strArr2[i] = str;
                        i = 12;
                        str = "&\u007f\u0002^+0s";
                        obj = 11;
                        strArr2 = strArr3;
                        break;
                    case Y.j /*11*/:
                        strArr2[i] = str;
                        i = 13;
                        str = "*y\u0018s94s\u0013O\"\u001bt\u001fX8%b\u0013";
                        obj = 12;
                        strArr2 = strArr3;
                        break;
                    case Y.p /*12*/:
                        strArr2[i] = str;
                        i = 14;
                        str = "'t\u0004";
                        obj = 13;
                        strArr2 = strArr3;
                        break;
                    case Y.q /*13*/:
                        strArr2[i] = str;
                        i = 15;
                        str = "'y\u001b\\&!n\u001fX3";
                        obj = 14;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_titleMarginEnd /*14*/:
                        strArr2[i] = str;
                        i = 16;
                        str = "\u0001x\u0015C.!m\u0015C'4z\u0013T#0oK";
                        obj = 15;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_titleMarginTop /*15*/:
                        strArr2[i] = str;
                        i = 17;
                        str = "h6\u0005I&!u\u0002E<!z\u000f\u007f!-f8C$\u0017f\u0013I),P\u0004M'!eK";
                        obj = 16;
                        strArr2 = strArr3;
                        break;
                    case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                        strArr2[i] = str;
                        i = 18;
                        str = "h6\u0002M8#s\u0002n#0d\u0017X/y";
                        obj = 17;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_maxButtonHeight /*17*/:
                        strArr2[i] = str;
                        i = 19;
                        str = "h6\u0013B+&z\u0013o%*e\u0002M$0T\u001fX8%b\u0013\u0011";
                        obj = 18;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_collapseIcon /*18*/:
                        strArr2[i] = str;
                        i = 20;
                        str = "h6\u0010C83w\u0004H\u000f6d\u0019^\t+d\u0004I)0\u007f\u0019Bw";
                        obj = 19;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_collapseContentDescription /*19*/:
                        strArr2[i] = str;
                        i = 21;
                        str = "h6\u0010^+)s;_w";
                        obj = 20;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_navigationIcon /*20*/:
                        strArr2[i] = str;
                        str = "h6\u0018C$\u0017f\u0013I),T\u001fX8%b\u0013\u0011";
                        obj = 21;
                        i = 22;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_navigationContentDescription /*21*/:
                        strArr2[i] = str;
                        i = 23;
                        strArr2 = strArr3;
                        str = "h6\u0013B+&z\u0013h#7u\u0019B>-x\u0003C?7B\u0004M$7{\u001f_9-y\u0018\u0011";
                        obj = 22;
                        break;
                    case arj.Toolbar_logoDescription /*22*/:
                        strArr2[i] = str;
                        i = 24;
                        str = "h6\u0000M.\u0010~\u0004I9,y\u001aHw";
                        obj = 23;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_titleTextColor /*23*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "7s\u001aI)0\u007f\u0000I&=I\u0005G#4I\u0018C$\u001be\u0006I/'~)J8%{\u0013_";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public String toString() {
            return z[16] + this.complexity + z[19] + this.enableConstantBitrate + z[23] + this.enableDiscontinuousTransmission + z[18] + this.targetBitrate + z[20] + this.forwardErrorCorrection + z[24] + this.vadThreshold + z[22] + this.nonSpeechBitrate + z[17] + this.selectivelySkipNonSpeechFrames + z[21] + this.frameMs + '}';
        }

        public Encode(Short sh, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Integer num2, Integer num3, Integer num4, Integer num5) {
            this.complexity = sh;
            this.enableConstantBitrate = bool;
            this.enableDiscontinuousTransmission = bool2;
            this.targetBitrate = num;
            this.forwardErrorCorrection = bool3;
            this.vadThreshold = num2;
            this.nonSpeechBitrate = num3;
            this.selectivelySkipNonSpeechFrames = num4;
            this.frameMs = num5;
        }

        public static Encode fromProtocolTreeNode(cw cwVar) {
            Integer num = null;
            if (cwVar == null) {
                return null;
            }
            String b = cwVar.b(z[2]);
            String b2 = cwVar.b(z[14]);
            String b3 = cwVar.b(z[7]);
            String b4 = cwVar.b(z[8]);
            String b5 = cwVar.b(z[0]);
            Short access$100 = VoipOptions.access$100(b, z[15], 1, 10);
            Boolean access$200 = VoipOptions.access$200(b2);
            Boolean access$2002 = VoipOptions.access$200(b3);
            if (!z[5].equals(b4)) {
                num = VoipOptions.access$300(b4, z[12], 6000, 51000);
            }
            return new Encode(access$100, access$200, access$2002, num, VoipOptions.access$200(b5), VoipOptions.access$000(cwVar.b(z[3]), z[11]), VoipOptions.access$000(cwVar.b(z[9]), z[13]), VoipOptions.access$000(cwVar.b(z[4]), z[1]), VoipOptions.access$000(cwVar.b(z[10]), z[6]));
        }
    }

    public final class Miscellaneous {
        private static final String[] z;
        public final Integer androidAudioEngine;
        public final Integer androidAudioModeInCall;
        public final Integer androidAudioPlaybackBufferSize;
        public final Integer androidAudioRecordBufferSize;
        public final Integer androidRecordPreset;
        public final Boolean androidRingFaster;
        public final Boolean androidShowCallConnectedToast;
        public final Boolean androidShowCallConnectingToast;
        public final Integer audioCallbackThreshold;
        public final Boolean audioEncodeOffload;
        public final Integer audioFPSThreshold;
        public final Integer audioLevelAdjust;
        public final Integer audioSamplingRate;
        public final Integer callOfferAckTimeout;
        public final Integer callerEndCallThreshold;
        public final Integer callerTimeout;
        public final Boolean createStreamOnOffer;
        public final Boolean disableP2P;
        public final Boolean e2eDecryptEnable;
        public final Boolean enableComfortNoiseGeneration;
        public final Boolean enableHighPassFiltering;
        public final Boolean enableSilenceDetection;
        public final Integer initialInterruptionSoundDelay;
        public final Integer ipAutoSwitch;
        public final Integer ipConfig;
        public final Integer jitterBufferDiscardAlgo;
        public final Integer jitterBufferImpl;
        public final Integer jitterBufferStretchAlgo;
        public final Integer neteqBgnMode;
        public final Integer neteqMaxDelay;
        public final Integer neteqMinDelay;
        public final Integer networkRestartTimeout;
        public final Integer restartAudioOnWhiteNoise;
        public final Integer ringbackMode;
        public final Integer ringbackTone;
        public final Integer rtpExtType;
        public final String testKey;
        public final String testValue;
        public final Integer udpReceiveSocketBufferSize;

        static {
            String[] strArr = new String[arj.Theme_editTextStyle];
            String str = "_<\u0014v\f\u0014~\u0007|\t>s\u0002z_";
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
                            i3 = 115;
                            break;
                        case at.g /*1*/:
                            i3 = 28;
                            break;
                        case at.i /*2*/:
                            i3 = arj.Theme_checkboxStyle;
                            break;
                        case at.o /*3*/:
                            i3 = 31;
                            break;
                        default:
                            i3 = 98;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        i = 2;
                        str = "_<\u000fo#\u0006h\tL\u0015\u001ah\u0005w_";
                        obj = 1;
                        strArr2 = strArr3;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        i = 3;
                        str = "_<\u0003q\u0003\u0011p\u0003L\u000b\u001fy\b|\u00077y\u0012z\u0001\u0007u\tq_";
                        obj = 2;
                        strArr2 = strArr3;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        i = 4;
                        str = "_<\u000fq\u000b\u0007u\u0007s+\u001dh\u0003m\u0010\u0006l\u0012v\r\u001dO\tj\f\u0017X\u0003s\u0003\n!";
                        obj = 3;
                        strArr2 = strArr3;
                        break;
                    case at.o /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        str = "_<\bz\u0016\u0016m$x\f>s\u0002z_";
                        obj = 4;
                        strArr2 = strArr3;
                        break;
                    case at.p /*4*/:
                        strArr2[i] = str;
                        i = 6;
                        str = "_<\u0003-\u00077y\u0005m\u001b\u0003h#q\u0003\u0011p\u0003\"";
                        obj = 5;
                        strArr2 = strArr3;
                        break;
                    case at.m /*5*/:
                        strArr2[i] = str;
                        i = 7;
                        str = "_<\bz\u0016\u0016m+~\u001a7y\n~\u001bN";
                        obj = 6;
                        strArr2 = strArr3;
                        break;
                    case Y.f /*6*/:
                        strArr2[i] = str;
                        i = 8;
                        str = "_<\u0007q\u0006\u0001s\u000f{1\u001bs\u0011\\\u0003\u001fp%p\f\u001dy\u0005k\u000b\u001d{2p\u0003\u0000h[";
                        obj = 7;
                        strArr2 = strArr3;
                        break;
                    case aF.v /*7*/:
                        strArr2[i] = str;
                        i = 9;
                        str = "_<\u0012z\u0011\u0007J\u0007s\u0017\u0016!";
                        obj = 8;
                        strArr2 = strArr3;
                        break;
                    case aF.u /*8*/:
                        strArr2[i] = str;
                        i = 10;
                        str = "_<\fv\u0016\u0007y\u0014]\u0017\u0015z\u0003m&\u001ao\u0005~\u0010\u0017]\nx\rN";
                        obj = 9;
                        strArr2 = strArr3;
                        break;
                    case Y.l /*9*/:
                        strArr2[i] = str;
                        i = 11;
                        str = "_<\u0007j\u0006\u001as5~\u000f\u0003p\u000fq\u0005!}\u0012z_";
                        obj = 10;
                        strArr2 = strArr3;
                        break;
                    case Y.t /*10*/:
                        strArr2[i] = str;
                        i = 12;
                        str = "_<\u0007q\u0006\u0001s\u000f{1\u001bs\u0011\\\u0003\u001fp%p\f\u001dy\u0005k\u0007\u0017H\t~\u0011\u0007!";
                        obj = 11;
                        strArr2 = strArr3;
                        break;
                    case Y.j /*11*/:
                        strArr2[i] = str;
                        i = 13;
                        str = "_<\bz\u0016\u0004s\u0014t0\u0016o\u0012~\u0010\u0007H\u000fr\u0007\u001ci\u0012\"";
                        obj = 12;
                        strArr2 = strArr3;
                        break;
                    case Y.p /*12*/:
                        strArr2[i] = str;
                        i = 14;
                        str = "_<\bz\u0016\u0016m+v\f7y\n~\u001bN";
                        obj = 13;
                        strArr2 = strArr3;
                        break;
                    case Y.q /*13*/:
                        strArr2[i] = str;
                        i = 15;
                        str = "_<\u0007j\u0006\u001as%~\u000e\u001f~\u0007|\t't\u0014z\u0011\u001bs\n{_";
                        obj = 14;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_titleMarginEnd /*14*/:
                        strArr2[i] = str;
                        i = 16;
                        str = "_<\u0007j\u0006\u001as*z\u0014\u0016p'{\b\u0006o\u0012\"";
                        obj = 15;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_titleMarginTop /*15*/:
                        strArr2[i] = str;
                        i = 17;
                        str = "_<\u0007j\u0006\u001as#q\u0001\u001cx\u0003P\u0004\u0015p\t~\u0006N";
                        obj = 16;
                        strArr2 = strArr3;
                        break;
                    case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                        strArr2[i] = str;
                        i = 18;
                        str = "_<\fv\u0016\u0007y\u0014]\u0017\u0015z\u0003m+\u001el\n\"";
                        obj = 17;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_maxButtonHeight /*17*/:
                        strArr2[i] = str;
                        i = 19;
                        str = "_<\u0012z\u0011\u0007W\u0003f_";
                        obj = 18;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_collapseIcon /*18*/:
                        strArr2[i] = str;
                        i = 20;
                        str = "_<\u0014v\f\u0014~\u0007|\t's\bz_";
                        obj = 19;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_collapseContentDescription /*19*/:
                        strArr2[i] = str;
                        i = 21;
                        str = "_<\u0014k\u00126d\u0012K\u001b\u0003y[";
                        obj = 20;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_navigationIcon /*20*/:
                        strArr2[i] = str;
                        i = 22;
                        str = "_<\u0005~\u000e\u001fS\u0000y\u0007\u0001]\u0005t6\u001aq\u0003p\u0017\u0007!";
                        obj = 21;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_navigationContentDescription /*21*/:
                        strArr2[i] = str;
                        i = 23;
                        str = "_<\fv\u0016\u0007y\u0014]\u0017\u0015z\u0003m1\u0007n\u0003k\u0001\u001b]\nx\rN";
                        obj = 22;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_logoDescription /*22*/:
                        strArr2[i] = str;
                        i = 24;
                        str = "_<\u0014z\u0011\u0007}\u0014k#\u0006x\u000fp-\u001dK\u000ev\u0016\u0016R\tv\u0011\u0016!";
                        obj = 23;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_titleTextColor /*23*/:
                        strArr2[i] = str;
                        i = 25;
                        str = "_<\u0005~\u000e\u001fy\u0014K\u000b\u001ey\tj\u0016N";
                        obj = 24;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_subtitleTextColor /*24*/:
                        strArr2[i] = str;
                        i = 26;
                        str = "_<\u0007q\u0006\u0001s\u000f{#\u0006x\u000fp0\u0016\u007f\tm\u00061i\u0000y\u0007\u0001O\u000fe\u0007N";
                        obj = 25;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionMenuTextAppearance /*25*/:
                        strArr2[i] = str;
                        i = 27;
                        str = "_<\u0007q\u0006\u0001s\u000f{#\u0006x\u000fp/\u001cx\u0003V\f0}\ns_";
                        obj = 26;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionMenuTextColor /*26*/:
                        strArr2[i] = str;
                        str = "_<\u000fo!\u001cr\u0000v\u0005N";
                        obj = 27;
                        i = 28;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeStyle /*27*/:
                        strArr2[i] = str;
                        i = 29;
                        strArr2 = strArr3;
                        str = "_<\u0005~\u000e\u001fy\u0014Z\f\u0017_\u0007s\u000e't\u0014z\u0011\u001bs\n{_";
                        obj = 28;
                        break;
                    case arj.Theme_actionModeCloseButtonStyle /*28*/:
                        strArr2[i] = str;
                        i = 30;
                        str = "_<\u0007q\u0006\u0001s\u000f{#\u0006x\u000fp'\u001d{\u000fq\u0007N";
                        obj = 29;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeBackground /*29*/:
                        strArr2[i] = str;
                        str = "_<\u0007q\u0006\u0001s\u000f{0\u0016\u007f\tm\u0006#n\u0003l\u0007\u0007!";
                        obj = 30;
                        i = 31;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeSplitBackground /*30*/:
                        strArr2[i] = str;
                        i = 32;
                        strArr2 = strArr3;
                        str = "_<\u0003q\u0003\u0011p\u0003W\u000b\u0014t6~\u0011\u0000Z\u000fs\u0016\u0016n\u000fq\u0005N";
                        obj = 31;
                        break;
                    case arj.Theme_actionModeCloseDrawable /*31*/:
                        strArr2[i] = str;
                        i = 33;
                        str = "_<\u0007j\u0006\u001as O1't\u0014z\u0011\u001bs\n{_";
                        obj = 32;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeCutDrawable /*32*/:
                        strArr2[i] = str;
                        i = 34;
                        str = "_<\u0013{\u0012!y\u0005z\u000b\u0005y5p\u0001\u0018y\u0012]\u0017\u0015z\u0003m1\u001af\u0003\"";
                        obj = 33;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeCopyDrawable /*33*/:
                        strArr2[i] = str;
                        i = 35;
                        str = "_<\u0007q\u0006\u0001s\u000f{0\u001ar\u0001Y\u0003\u0000h\u0003m_";
                        obj = 34;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModePasteDrawable /*34*/:
                        strArr2[i] = str;
                        i = 36;
                        str = ">u\u0015|\u0007\u001fp\u0007q\u0007\u001ci\u0015d\u0007\u001d}\u0004s\u00070s\u000by\r\u0001h(p\u000b\u0000y!z\f\u0016n\u0007k\u000b\u001cr[";
                        obj = 35;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeSelectAllDrawable /*35*/:
                        strArr2[i] = str;
                        i = 37;
                        str = "_<\u0002v\u0011\u0012~\nz2AL[";
                        obj = 36;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeShareDrawable /*36*/:
                        strArr2[i] = str;
                        i = 38;
                        str = "\u0001h\u0016@\u0007\u000bh9k\u001b\u0003y";
                        obj = 37;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeFindDrawable /*37*/:
                        strArr2[i] = str;
                        i = 39;
                        str = "\u0012r\u0002m\r\u001ax9|\u0003\u001fp9|\r\u001dr\u0003|\u0016\u001ar\u0001@\u0016\u001c}\u0015k";
                        obj = 38;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeWebSearchDrawable /*38*/:
                        strArr2[i] = str;
                        i = 40;
                        str = "\u0001h\u0016@\u0007\u000bh9k\u001b\u0003y";
                        obj = 39;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModePopupWindowStyle /*39*/:
                        strArr2[i] = str;
                        i = 41;
                        str = "\u001ar\u000fk\u000b\u0012p9v\f\u0007y\u0014m\u0017\u0003h\u000fp\f,o\tj\f\u0017C\u0002z\u000e\u0012e";
                        obj = 40;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                        strArr2[i] = str;
                        i = 42;
                        str = "\u0012i\u0002v\r,\u007f\u0004@\u0016\u001bn\u0003l\n\u001cp\u0002";
                        obj = 41;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                        strArr2[i] = str;
                        i = 43;
                        str = "\u0007y\u0015k=\u0018y\u001f";
                        obj = 42;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_dialogTheme /*42*/:
                        strArr2[i] = str;
                        i = 44;
                        str = "\u0012i\u0002v\r,z\u0016l=\u0007t\u0014z\u0011\u001bs\n{";
                        obj = 43;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_dialogPreferredPadding /*43*/:
                        strArr2[i] = str;
                        i = 45;
                        str = "\u0000s\u0004j\u0004,n\u0005i=\u0000u\u001cz";
                        obj = 44;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_listDividerAlertDialog /*44*/:
                        strArr2[i] = str;
                        i = 46;
                        str = "\u001dy\u0012z\u0013,q\u0007g=\u0017y\n~\u001b";
                        obj = 45;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionDropDownStyle /*45*/:
                        strArr2[i] = str;
                        i = 47;
                        str = "\u0019~9~\u000e\u0014s";
                        obj = 46;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                        strArr2[i] = str;
                        i = 48;
                        str = "\u0019~9l\u0016\u0001y\u0012|\n";
                        obj = 47;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_spinnerDropDownItemStyle /*47*/:
                        strArr2[i] = str;
                        i = 49;
                        str = "\u0007y\u0015k=\u0005}\nj\u0007";
                        obj = 48;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_homeAsUpIndicator /*48*/:
                        strArr2[i] = str;
                        i = 50;
                        str = "\u0012r\u0002m\r\u001ax9|\u0003\u001fp9|\r\u001dr\u0003|\u0016\u0016x9k\r\u0012o\u0012";
                        obj = 49;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionButtonStyle /*49*/:
                        strArr2[i] = str;
                        i = 51;
                        str = "\u0001u\bx\u0000\u0012\u007f\r@\u000f\u001cx\u0003";
                        obj = 50;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_buttonBarStyle /*50*/:
                        strArr2[i] = str;
                        i = 52;
                        str = "\u0000u\nz\f\u0007C\u0002z\u0016\u0016\u007f\u0012v\r\u001d";
                        obj = 51;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_buttonBarButtonStyle /*51*/:
                        strArr2[i] = str;
                        i = 53;
                        str = "\u001dy\u0012z\u0013,q\u000fq=\u0017y\n~\u001b";
                        obj = 52;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_selectableItemBackground /*52*/:
                        strArr2[i] = str;
                        i = 54;
                        str = "\u001dy\u0012z\u0013,q\u000fq=\u0017y\n~\u001b";
                        obj = 53;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                        strArr2[i] = str;
                        i = 55;
                        str = "\u0012i\u0002v\r,y\b|\r\u0017y9p\u0004\u0015p\t~\u0006";
                        obj = 54;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_borderlessButtonStyle /*54*/:
                        strArr2[i] = str;
                        i = 56;
                        str = "\u0010}\ns\u0007\u0001C\u0012v\u000f\u0016s\u0013k";
                        obj = 55;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_dividerVertical /*55*/:
                        strArr2[i] = str;
                        i = 57;
                        str = "\u0012r\u0002m\r\u001ax9~\u0017\u0017u\t@\u000f\u001cx\u0003@\u000b\u001dC\u0005~\u000e\u001f";
                        obj = 56;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_dividerHorizontal /*56*/:
                        strArr2[i] = str;
                        i = 58;
                        str = "\u001dy\u0012h\r\u0001w9k\u0010\u0012r\u0015o\r\u0001h9m\u0007\u0000h\u0007m\u0016,h\u000fr\u0007\u001ci\u0012";
                        obj = 57;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_activityChooserViewStyle /*57*/:
                        strArr2[i] = str;
                        i = 59;
                        str = "\u0012i\u0002v\r,o\u0007r\u0012\u001fu\bx=\u0001}\u0012z";
                        obj = 58;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_toolbarStyle /*58*/:
                        strArr2[i] = str;
                        i = 60;
                        str = "\u0019~9v\u000f\u0003p";
                        obj = 59;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                        strArr2[i] = str;
                        i = 61;
                        str = "\u001cz\u0000z\u0010,}\u0005t=\u0007u\u000bz\r\u0006h";
                        obj = 60;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_popupMenuStyle /*60*/:
                        strArr2[i] = str;
                        i = 62;
                        str = "\u001al9~\u0017\u0007s9l\u0015\u001ah\u0005w\r\u0005y\u0014";
                        obj = 61;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_popupWindowStyle /*61*/:
                        strArr2[i] = str;
                        i = 63;
                        str = "\u0010}\ns\u0007\u0001C\u0012v\u000f\u0016s\u0013k";
                        obj = 62;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_editTextColor /*62*/:
                        strArr2[i] = str;
                        i = 64;
                        str = "\u0012i\u0002v\r,z\u0016l=\u0007t\u0014z\u0011\u001bs\n{";
                        obj = 63;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_editTextBackground /*63*/:
                        strArr2[i] = str;
                        i = 65;
                        str = "\u0012i\u0002v\r,p\u0003i\u0007\u001fC\u0007{\b\u0006o\u0012";
                        obj = 64;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_imageButtonStyle /*64*/:
                        strArr2[i] = str;
                        i = 66;
                        str = "\u0001u\bx\u0000\u0012\u007f\r@\u000f\u001cx\u0003";
                        obj = 65;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                        strArr2[i] = str;
                        i = 67;
                        str = "\u001bl\u0000";
                        obj = 66;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                        strArr2[i] = str;
                        i = 68;
                        str = "\u0016.\u0003@\u0006\u0016\u007f\u0014f\u0012\u0007C\u0003q\u0003\u0011p\u0003";
                        obj = 67;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_textColorSearchUrl /*67*/:
                        strArr2[i] = str;
                        i = 69;
                        str = "\u0012r\u0002m\r\u001ax9m\u0007\u0010s\u0014{=\u0003n\u0003l\u0007\u0007";
                        obj = 68;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_searchViewStyle /*68*/:
                        strArr2[i] = str;
                        i = 70;
                        str = "\u0012r\u0002m\r\u001ax9~\u0017\u0017u\t@\u000f\u001cx\u0003@\u000b\u001dC\u0005~\u000e\u001f";
                        obj = 69;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_listPreferredItemHeight /*69*/:
                        strArr2[i] = str;
                        i = 71;
                        str = "\u0019~9v\u000f\u0003p";
                        obj = 70;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_listPreferredItemHeightSmall /*70*/:
                        strArr2[i] = str;
                        i = 72;
                        str = "\u0012r\u0002m\r\u001ax9m\u000b\u001d{9y\u0003\u0000h\u0003m";
                        obj = 71;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_listPreferredItemHeightLarge /*71*/:
                        strArr2[i] = str;
                        i = 73;
                        str = "\u001ar\u000fk\u000b\u0012p9v\f\u0007y\u0014m\u0017\u0003h\u000fp\f,o\tj\f\u0017C\u0002z\u000e\u0012e";
                        obj = 72;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_listPreferredItemPaddingLeft /*72*/:
                        strArr2[i] = str;
                        i = 74;
                        str = "\u001al9~\u0017\u0007s9l\u0015\u001ah\u0005w\r\u0005y\u0014";
                        obj = 73;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_listPreferredItemPaddingRight /*73*/:
                        strArr2[i] = str;
                        i = 75;
                        str = "\u001cz\u0000z\u0010,}\u0005t=\u0007u\u000bz\r\u0006h";
                        obj = 74;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_dropDownListViewStyle /*74*/:
                        strArr2[i] = str;
                        i = 76;
                        str = "\u0019~9~\u000e\u0014s";
                        obj = 75;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_listPopupWindowStyle /*75*/:
                        strArr2[i] = str;
                        i = 77;
                        str = "\u0012i\u0002v\r,o\u0007r\u0012\u001fu\bx=\u0001}\u0012z";
                        obj = 76;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_textAppearanceListItem /*76*/:
                        strArr2[i] = str;
                        i = 78;
                        str = "\u0012r\u0002m\r\u001ax9m\u0007\u0010s\u0014{=\u0011i\u0000y\u0007\u0001C\u0015v\u0018\u0016";
                        obj = 77;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_textAppearanceListItemSmall /*77*/:
                        strArr2[i] = str;
                        i = 79;
                        str = "\u0001u\bx\u0000\u0012\u007f\r@\u0016\u001cr\u0003";
                        obj = 78;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_panelBackground /*78*/:
                        strArr2[i] = str;
                        i = 80;
                        str = "\u001dy\u0012z\u0013,~\u0001q=\u001es\u0002z";
                        obj = 79;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_panelMenuListWidth /*79*/:
                        strArr2[i] = str;
                        i = 81;
                        str = "\u0010}\ns\u0007\u0001C\u0003q\u0006,\u007f\u0007s\u000e,h\u000em\u0007\u0000t\ts\u0006";
                        obj = 80;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_panelMenuListTheme /*80*/:
                        strArr2[i] = str;
                        i = 82;
                        str = "\u0019~9l\u0016\u0001y\u0012|\n";
                        obj = 81;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_listChoiceBackgroundIndicator /*81*/:
                        strArr2[i] = str;
                        i = 83;
                        str = "\u0000s\u0004j\u0004,n\u0005i=\u0000u\u001cz";
                        obj = 82;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_colorPrimary /*82*/:
                        strArr2[i] = str;
                        i = 84;
                        str = "\u0001u\bx\u0000\u0012\u007f\r@\u0016\u001cr\u0003";
                        obj = 83;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_colorPrimaryDark /*83*/:
                        strArr2[i] = str;
                        i = 85;
                        str = "\u0012r\u0002m\r\u001ax9m\u0007\u0010s\u0014{=\u0003n\u0003l\u0007\u0007";
                        obj = 84;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_colorAccent /*84*/:
                        strArr2[i] = str;
                        i = 86;
                        str = "\u0012r\u0002m\r\u001ax9o\u000e\u0012e\u0004~\u0001\u0018C\u0004j\u0004\u0015y\u0014@\u0011\u001af\u0003";
                        obj = 85;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_colorControlNormal /*85*/:
                        strArr2[i] = str;
                        i = 87;
                        str = "\u0012i\u0002v\r,\u007f\u0004@\u0016\u001bn\u0003l\n\u001cp\u0002";
                        obj = 86;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_colorControlActivated /*86*/:
                        strArr2[i] = str;
                        i = 88;
                        str = "\u0012r\u0002m\r\u001ax9m\u0007\u0010s\u0014{=\u0011i\u0000y\u0007\u0001C\u0015v\u0018\u0016";
                        obj = 87;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_colorControlHighlight /*87*/:
                        strArr2[i] = str;
                        i = 89;
                        str = "\u0010n\u0003~\u0016\u0016C\u0015k\u0010\u0016}\u000b@\r\u001dC\ty\u0004\u0016n";
                        obj = 88;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_colorButtonNormal /*88*/:
                        strArr2[i] = str;
                        i = 90;
                        str = "\u0012i\u0002v\r,p\u0003i\u0007\u001fC\u0007{\b\u0006o\u0012";
                        obj = 89;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_colorSwitchThumbNormal /*89*/:
                        strArr2[i] = str;
                        i = 91;
                        str = "\u0001y\u0015k\u0003\u0001h9~\u0017\u0017u\t@\r\u001dC\u0011w\u000b\u0007y9q\r\u001ao\u0003";
                        obj = 90;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_controlBackground /*90*/:
                        strArr2[i] = str;
                        i = 92;
                        str = "\u0010}\ns\u0007\u0001C\u0003q\u0006,\u007f\u0007s\u000e,h\u000em\u0007\u0000t\ts\u0006";
                        obj = 91;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_alertDialogStyle /*91*/:
                        strArr2[i] = str;
                        i = 93;
                        str = "\u001dy\u0012z\u0013,q\u0007g=\u0017y\n~\u001b";
                        obj = 92;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_alertDialogButtonGroupStyle /*92*/:
                        strArr2[i] = str;
                        i = 94;
                        str = "\u001dy\u0012h\r\u0001w9k\u0010\u0012r\u0015o\r\u0001h9m\u0007\u0000h\u0007m\u0016,h\u000fr\u0007\u001ci\u0012";
                        obj = 93;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_alertDialogCenterButtons /*93*/:
                        strArr2[i] = str;
                        i = 95;
                        str = "\u0012r\u0002m\r\u001ax9~\u0017\u0017u\t@\u0007\u001d{\u000fq\u0007";
                        obj = 94;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_alertDialogTheme /*94*/:
                        strArr2[i] = str;
                        i = 96;
                        str = "\u0017u\u0015~\u0000\u001fy9oP\u0003";
                        obj = 95;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_textColorAlertDialogListItem /*95*/:
                        strArr2[i] = str;
                        i = 97;
                        str = "\u001dy\u0012z\u0013,~\u0001q=\u001es\u0002z";
                        obj = 96;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_buttonBarPositiveButtonStyle /*96*/:
                        strArr2[i] = str;
                        str = "\u001al9|\r\u001dz\u000fx";
                        obj = 97;
                        i = 98;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_buttonBarNegativeButtonStyle /*97*/:
                        strArr2[i] = str;
                        i = 99;
                        strArr2 = strArr3;
                        str = "\u0012r\u0002m\r\u001ax9o\u000e\u0012e\u0004~\u0001\u0018C\u0004j\u0004\u0015y\u0014@\u0011\u001af\u0003";
                        obj = 98;
                        break;
                    case arj.Theme_buttonBarNeutralButtonStyle /*98*/:
                        strArr2[i] = str;
                        i = 100;
                        str = "\u0001y\u0015k\u0003\u0001h9~\u0017\u0017u\t@\r\u001dC\u0011w\u000b\u0007y9q\r\u001ao\u0003";
                        obj = 99;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_autoCompleteTextViewStyle /*99*/:
                        strArr2[i] = str;
                        i = arj.Theme_buttonStyleSmall;
                        str = "\u0010r\u0001";
                        obj = 100;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_buttonStyle /*100*/:
                        strArr2[i] = str;
                        str = "\u0012r\u0002m\r\u001ax9~\u0017\u0017u\t@\u0007\u001d{\u000fq\u0007";
                        obj = arj.Theme_buttonStyleSmall;
                        i = arj.Theme_checkboxStyle;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_buttonStyleSmall /*101*/:
                        strArr2[i] = str;
                        i = arj.Theme_checkedTextViewStyle;
                        strArr2 = strArr3;
                        str = "\u001al9|\r\u001dz\u000fx";
                        obj = 102;
                        break;
                    case arj.Theme_checkboxStyle /*102*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        i = 1;
                        strArr2 = strArr3;
                        str = "_<\u0007q\u0006\u0001s\u000f{#\u0006x\u000fp2\u001f}\u001f}\u0003\u0010w$j\u0004\u0015y\u0014L\u000b\ty[";
                        obj = null;
                        break;
                }
            }
        }

        public static Miscellaneous fromProtocolTreeNode(cw cwVar) {
            if (cwVar == null) {
                return null;
            }
            Boolean access$200 = VoipOptions.access$200(cwVar.b(z[arj.Theme_buttonStyleSmall]));
            Boolean access$2002 = VoipOptions.access$200(cwVar.b(z[67]));
            Boolean access$2003 = VoipOptions.access$200(cwVar.b(z[52]));
            Integer access$000 = VoipOptions.access$000(cwVar.b(z[56]), z[63]);
            Integer access$0002 = VoipOptions.access$000(cwVar.b(z[60]), z[71]);
            Integer access$0003 = VoipOptions.access$000(cwVar.b(z[47]), z[76]);
            Integer access$0004 = VoipOptions.access$000(cwVar.b(z[48]), z[82]);
            Integer access$0005 = VoipOptions.access$000(cwVar.b(z[42]), z[87]);
            Integer access$0006 = VoipOptions.access$000(cwVar.b(z[66]), z[51]);
            Integer access$0007 = VoipOptions.access$000(cwVar.b(z[79]), z[84]);
            Integer access$0008 = VoipOptions.access$000(cwVar.b(z[92]), z[81]);
            Integer access$0009 = VoipOptions.access$000(cwVar.b(z[77]), z[59]);
            Integer access$00010 = VoipOptions.access$000(cwVar.b(z[arj.Theme_checkboxStyle]), z[95]);
            Integer access$00011 = VoipOptions.access$000(cwVar.b(z[70]), z[57]);
            cw cwVar2 = cwVar;
            Integer access$00012 = VoipOptions.access$000(cwVar2.b(z[69]), z[85]);
            cwVar2 = cwVar;
            Integer access$00013 = VoipOptions.access$000(cwVar2.b(z[78]), z[88]);
            cwVar2 = cwVar;
            Integer access$00014 = VoipOptions.access$000(cwVar2.b(z[99]), z[86]);
            Boolean access$2004 = VoipOptions.access$200(cwVar.b(z[50]));
            Boolean access$2005 = VoipOptions.access$200(cwVar.b(z[39]));
            Boolean access$2006 = VoipOptions.access$200(cwVar.b(z[72]));
            cwVar2 = cwVar;
            Integer access$00015 = VoipOptions.access$000(cwVar2.b(z[83]), z[45]);
            Boolean access$2007 = VoipOptions.access$200(cwVar.b(z[55]));
            Boolean access$2008 = VoipOptions.access$200(cwVar.b(z[96]));
            Boolean access$2009 = VoipOptions.access$200(cwVar.b(z[89]));
            cwVar2 = cwVar;
            Integer access$00016 = VoipOptions.access$000(cwVar2.b(z[41]), z[73]);
            cwVar2 = cwVar;
            Integer access$00017 = VoipOptions.access$000(cwVar2.b(z[64]), z[44]);
            cwVar2 = cwVar;
            Integer access$00018 = VoipOptions.access$000(cwVar2.b(z[94]), z[58]);
            cwVar2 = cwVar;
            Integer access$00019 = VoipOptions.access$000(cwVar2.b(z[53]), z[54]);
            cwVar2 = cwVar;
            Integer access$00020 = VoipOptions.access$000(cwVar2.b(z[46]), z[93]);
            cwVar2 = cwVar;
            Integer access$00021 = VoipOptions.access$000(cwVar2.b(z[97]), z[80]);
            cwVar2 = cwVar;
            Integer access$00022 = VoipOptions.access$000(cwVar2.b(z[65]), z[90]);
            cwVar2 = cwVar;
            Integer access$00023 = VoipOptions.access$000(cwVar2.b(z[100]), z[91]);
            cwVar2 = cwVar;
            Integer access$00024 = VoipOptions.access$000(cwVar2.b(z[75]), z[61]);
            String b = cwVar.b(z[43]);
            String b2 = cwVar.b(z[49]);
            cwVar2 = cwVar;
            Integer access$00025 = VoipOptions.access$000(cwVar2.b(z[arj.Theme_checkedTextViewStyle]), z[98]);
            cwVar2 = cwVar;
            Integer access$00026 = VoipOptions.access$000(cwVar2.b(z[74]), z[62]);
            cwVar2 = cwVar;
            return new Miscellaneous(access$200, access$2002, access$2003, access$000, access$0002, access$0003, access$0004, access$0005, access$0006, access$0007, access$0008, access$0009, access$00010, access$00011, access$00012, access$00013, access$00014, access$2004, access$2005, access$2006, access$00015, access$2007, access$2008, access$2009, access$00016, access$00017, access$00018, access$00019, access$00020, access$00021, access$00022, access$00023, access$00024, b, b2, access$00025, access$00026, VoipOptions.access$000(cwVar2.b(z[40]), z[38]), VoipOptions.access$200(cwVar.b(z[68])));
        }

        public String toString() {
            boolean z = co.s;
            String str = z[36] + this.enableComfortNoiseGeneration + z[32] + this.enableHighPassFiltering + z[3] + this.enableSilenceDetection + z[25] + this.callerTimeout + z[18] + this.jitterBufferImpl + z[10] + this.jitterBufferDiscardAlgo + z[23] + this.jitterBufferStretchAlgo + z[15] + this.audioCallbackThreshold + z[0] + this.ringbackMode + z[20] + this.ringbackTone + z[29] + this.callerEndCallThreshold + z[11] + this.audioSamplingRate + z[30] + this.androidAudioEngine + z[27] + this.androidAudioModeInCall + z[31] + this.androidRecordPreset + z[26] + this.androidAudioRecordBufferSize + z[1] + this.androidAudioPlaybackBufferSize + z[12] + this.androidShowCallConnectedToast + z[8] + this.androidShowCallConnectingToast + z[35] + this.androidRingFaster + z[34] + this.udpReceiveSocketBufferSize + z[17] + this.audioEncodeOffload + z[37] + this.disableP2P + z[4] + this.initialInterruptionSoundDelay + z[33] + this.audioFPSThreshold + z[13] + this.networkRestartTimeout + z[14] + this.neteqMinDelay + z[7] + this.neteqMaxDelay + z[5] + this.neteqBgnMode + z[16] + this.audioLevelAdjust + z[24] + this.restartAudioOnWhiteNoise + z[22] + this.callOfferAckTimeout + z[19] + this.testKey + z[9] + this.testValue + z[28] + this.ipConfig + z[2] + this.ipAutoSwitch + z[21] + this.rtpExtType + z[6] + this.e2eDecryptEnable + '}';
            if (z) {
                WAAppCompatActivity.c++;
            }
            return str;
        }

        public Miscellaneous(Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Boolean bool4, Boolean bool5, Boolean bool6, Integer num15, Boolean bool7, Boolean bool8, Boolean bool9, Integer num16, Integer num17, Integer num18, Integer num19, Integer num20, Integer num21, Integer num22, Integer num23, Integer num24, String str, String str2, Integer num25, Integer num26, Integer num27, Boolean bool10) {
            this.enableComfortNoiseGeneration = bool;
            this.enableHighPassFiltering = bool2;
            this.enableSilenceDetection = bool3;
            this.callerTimeout = num;
            this.jitterBufferImpl = num2;
            this.jitterBufferDiscardAlgo = num3;
            this.jitterBufferStretchAlgo = num4;
            this.audioCallbackThreshold = num5;
            this.ringbackMode = num6;
            this.ringbackTone = num7;
            this.callerEndCallThreshold = num8;
            this.audioSamplingRate = num9;
            this.androidAudioEngine = num10;
            this.androidAudioModeInCall = num11;
            this.androidRecordPreset = num12;
            this.androidAudioRecordBufferSize = num13;
            this.androidAudioPlaybackBufferSize = num14;
            this.androidShowCallConnectedToast = bool4;
            this.androidShowCallConnectingToast = bool5;
            this.androidRingFaster = bool6;
            this.udpReceiveSocketBufferSize = num15;
            this.audioEncodeOffload = bool7;
            this.disableP2P = bool8;
            this.createStreamOnOffer = bool9;
            this.initialInterruptionSoundDelay = num16;
            this.audioFPSThreshold = num17;
            this.networkRestartTimeout = num18;
            this.neteqMinDelay = num19;
            this.neteqMaxDelay = num20;
            this.neteqBgnMode = num21;
            this.audioLevelAdjust = num22;
            this.restartAudioOnWhiteNoise = num23;
            this.callOfferAckTimeout = num24;
            this.testKey = str;
            this.testValue = str2;
            this.ipConfig = num25;
            this.ipAutoSwitch = num26;
            this.rtpExtType = num27;
            this.e2eDecryptEnable = bool10;
        }
    }

    public final class NoiseSuppression {
        private static final String[] z;
        public final Boolean builtinEnabled;
        public final Short mode;
        public final Integer suppressThreshold;

        static {
            String[] strArr = new String[8];
            String str = "9prkke\"dmhA8s{h}?mz&";
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
                            i3 = 21;
                            break;
                        case at.g /*1*/:
                            i3 = 80;
                            break;
                        case at.i /*2*/:
                            i3 = 1;
                            break;
                        case at.o /*3*/:
                            i3 = 30;
                            break;
                        default:
                            i3 = 27;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "9pckry$hp^{1cr~qm";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        str = "x?e{";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        str = "f%qnip#rAo}\"dmsz<e";
                        i = 4;
                        strArr2 = strArr3;
                        obj = 3;
                        break;
                    case at.o /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        strArr2 = strArr3;
                        str = "f%qnip#rAo}\"dmsz<e";
                        obj = 4;
                        break;
                    case at.p /*4*/:
                        strArr2[i] = str;
                        i = 6;
                        str = "w%hro|>";
                        obj = 5;
                        strArr2 = strArr3;
                        break;
                    case at.m /*5*/:
                        strArr2[i] = str;
                        i = 7;
                        str = "x?e{";
                        obj = 6;
                        strArr2 = strArr3;
                        break;
                    case Y.f /*6*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "[?hm~F%qnip#rwt{+lq\u007fpm";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public String toString() {
            return z[1] + this.mode + z[0] + this.suppressThreshold + z[2] + this.builtinEnabled + '}';
        }

        public NoiseSuppression(Short sh, Boolean bool, Integer num) {
            this.mode = sh;
            this.builtinEnabled = bool;
            this.suppressThreshold = num;
        }

        public static NoiseSuppression fromProtocolTreeNode(cw cwVar) {
            if (cwVar == null) {
                return null;
            }
            String b = cwVar.b(z[7]);
            return new NoiseSuppression(VoipOptions.access$100(b, z[3], 0, 3), VoipOptions.access$200(cwVar.b(z[6])), VoipOptions.access$000(cwVar.b(z[4]), z[5]));
        }
    }

    public final class RateControl {
        private static final String[] z;
        public final Integer cellularBitrate;
        public final Boolean disableRateControl;
        public final Integer dtxBweThreshold;
        public final Integer dtxRttThreshold;
        public final Integer dtxWaitPeriod;
        public final Boolean earlyRtt;
        public final Integer fppRttThreshold;
        public final Integer framesPerPacket;
        public final Integer initBitrate;
        public final Integer initBitrateOnCellular;
        public final Integer lowDataUsageBitrate;
        public final Integer maxBWE;
        public final Integer maxFramesPerPacket;
        public final Integer maxFramesPerPacketDuration;
        public final Integer maxRTT;
        public final Integer maxrttBitrateCap;
        public final Boolean maxrttPauseOnRttIncrease;
        public final Integer maxrttRateIncrease;
        public final Integer minFramesPerPacket;
        public final Integer minRTT;
        public final Integer pktSizeThresholdBitrate;
        public final Boolean sendEarlyBWE;

        static {
            String[] strArr = new String[62];
            String str = "\u0017j\u0004\u0002r\u001cm\u0019\u0004L\na";
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
                            i3 = 126;
                            break;
                        case at.g /*1*/:
                            i3 = 4;
                            break;
                        case at.i /*2*/:
                            i3 = arj.Theme_switchStyle;
                            break;
                        case at.o /*3*/:
                            i3 = 118;
                            break;
                        default:
                            i3 = 45;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "\u0012k\u001a)I\u001fp\f)X\re\n\u0013r\u001cm\u0019\u0004L\na";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        i = 3;
                        strArr2 = strArr3;
                        str = "\u0013e\u0015\u0004Y\n[\u001d\u0017X\ra2\u0019C!v\u0019\u0002r\u0017j\u000e\u0004H\u001fw\b";
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        str = "\u0013e\u0015\u0010]\u000e[\t\u0003_\u001fp\u0004\u0019C";
                        obj = 3;
                        i = 4;
                        strArr2 = strArr3;
                        break;
                    case at.o /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        strArr2 = strArr3;
                        str = "\u0013m\u0003\u0004Y\n";
                        obj = 4;
                        break;
                    case at.p /*4*/:
                        strArr2[i] = str;
                        i = 6;
                        str = "\u0013e\u0015\u0010]\u000e[\t\u0003_\u001fp\u0004\u0019C";
                        obj = 5;
                        strArr2 = strArr3;
                        break;
                    case at.m /*5*/:
                        strArr2[i] = str;
                        i = 7;
                        str = "\u0013e\u0015\u0014Z\u001b";
                        obj = 6;
                        strArr2 = strArr3;
                        break;
                    case Y.f /*6*/:
                        strArr2[i] = str;
                        i = 8;
                        str = "\u0013m\u0003\u0010]\u000e";
                        obj = 7;
                        strArr2 = strArr3;
                        break;
                    case aF.v /*7*/:
                        strArr2[i] = str;
                        i = 9;
                        str = "\u000eo\u0019)^\u0017~\b)Y\u0016v\b\u0005E!f\u0004\u0002_\u001fp\b";
                        obj = 8;
                        strArr2 = strArr3;
                        break;
                    case aF.u /*8*/:
                        strArr2[i] = str;
                        i = 10;
                        str = "\u001ap\u0015)_\np2\u0002E\fa\u001e\u001eB\u0012`";
                        obj = 9;
                        strArr2 = strArr3;
                        break;
                    case Y.l /*9*/:
                        strArr2[i] = str;
                        i = 11;
                        str = "\u0013e\u0015\u0004Y\n[\u000f\u001fY\fe\u0019\u0013r\u001de\u001d";
                        obj = 10;
                        strArr2 = strArr3;
                        break;
                    case Y.t /*10*/:
                        strArr2[i] = str;
                        i = 12;
                        str = "\u0012k\u001a)I\u001fp\f)X\re\n\u0013r\u001cm\u0019\u0004L\na";
                        obj = 11;
                        strArr2 = strArr3;
                        break;
                    case Y.j /*11*/:
                        strArr2[i] = str;
                        i = 13;
                        str = "\u0018t\u001d)_\np2\u0002E\fa\u001e\u001eB\u0012`";
                        obj = 12;
                        strArr2 = strArr3;
                        break;
                    case Y.p /*12*/:
                        strArr2[i] = str;
                        i = 14;
                        str = "\u0013m\u0003\u0004Y\n";
                        obj = 13;
                        strArr2 = strArr3;
                        break;
                    case Y.q /*13*/:
                        strArr2[i] = str;
                        i = 15;
                        str = "\u001ap\u0015)Z\u001fm\u0019)]\u001bv\u0004\u0019I";
                        obj = 14;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_titleMarginEnd /*14*/:
                        strArr2[i] = str;
                        i = 16;
                        str = "\u001bj\f\u0014A\u001b";
                        obj = 15;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_titleMarginTop /*15*/:
                        strArr2[i] = str;
                        i = 17;
                        str = "\u0018t\u001d)_\np2\u0002E\fa\u001e\u001eB\u0012`";
                        obj = 16;
                        strArr2 = strArr3;
                        break;
                    case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                        strArr2[i] = str;
                        i = 18;
                        str = "\u0013e\u0015\u0010]\u000e";
                        obj = 17;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_maxButtonHeight /*17*/:
                        strArr2[i] = str;
                        i = 19;
                        str = "\u0017j\u0004\u0002r\u001cm\u0019\u0004L\na";
                        obj = 18;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_collapseIcon /*18*/:
                        strArr2[i] = str;
                        i = 20;
                        str = "\u0018t\u001d";
                        obj = 19;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_collapseContentDescription /*19*/:
                        strArr2[i] = str;
                        i = 21;
                        str = "\u0013m\u0003\u0010]\u000e";
                        obj = 20;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_navigationIcon /*20*/:
                        strArr2[i] = str;
                        i = 22;
                        str = "\u001da\u0001\u001aX\u0012e\u001f)O\u0017p\u001f\u0017Y\u001b";
                        obj = 21;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_navigationContentDescription /*21*/:
                        strArr2[i] = str;
                        i = 23;
                        str = "\u0018t\u001d";
                        obj = 22;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_logoDescription /*22*/:
                        strArr2[i] = str;
                        i = 24;
                        str = "\u0017j\u0004\u0002r\u001cm\u0019\u0004L\na2\u0019C!g\b\u001aA\u000bh\f\u0004";
                        obj = 23;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_titleTextColor /*23*/:
                        strArr2[i] = str;
                        i = 25;
                        str = "\u0013e\u0015\u0004Y\n[\u001f\u0017Y\u001b[\u0004\u0018N\fa\f\u0005H";
                        obj = 24;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_subtitleTextColor /*24*/:
                        strArr2[i] = str;
                        i = 26;
                        str = "\u0013e\u0015\u0004Y\n";
                        obj = 25;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionMenuTextAppearance /*25*/:
                        strArr2[i] = str;
                        i = 27;
                        str = "\u0013e\u0015\u0004Y\n[\u000f\u001fY\fe\u0019\u0013r\u001de\u001d";
                        obj = 26;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionMenuTextColor /*26*/:
                        strArr2[i] = str;
                        i = 28;
                        str = "\u001ap\u0015)O\ta2\u0002E\fa\u001e\u001eB\u0012`";
                        obj = 27;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeStyle /*27*/:
                        strArr2[i] = str;
                        i = 29;
                        str = "\u001ap\u0015)Z\u001fm\u0019)]\u001bv\u0004\u0019I";
                        obj = 28;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeCloseButtonStyle /*28*/:
                        strArr2[i] = str;
                        i = 30;
                        str = "\u0017j\u0004\u0002r\u001cm\u0019\u0004L\na2\u0019C!g\b\u001aA\u000bh\f\u0004";
                        obj = 29;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeBackground /*29*/:
                        strArr2[i] = str;
                        i = 31;
                        str = "\u001ap\u0015)_\np2\u0002E\fa\u001e\u001eB\u0012`";
                        obj = 30;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeSplitBackground /*30*/:
                        strArr2[i] = str;
                        i = 32;
                        str = "\u001ap\u0015)O\ta2\u0002E\fa\u001e\u001eB\u0012`";
                        obj = 31;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeCloseDrawable /*31*/:
                        strArr2[i] = str;
                        i = 33;
                        str = "\u000eo\u0019)^\u0017~\b)Y\u0016v\b\u0005E!f\u0004\u0002_\u001fp\b";
                        obj = 32;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeCutDrawable /*32*/:
                        strArr2[i] = str;
                        i = 34;
                        str = "\u001be\u001f\u001aT!v\u0019\u0002r\u001dk\u0000\u0006X\ne\u0019\u001fB\u0010";
                        obj = 33;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeCopyDrawable /*33*/:
                        strArr2[i] = str;
                        i = 35;
                        str = "\ra\u0003\u0012r\u001be\u001f\u001aT!f\u0004\u0002_\u001fp\b)H\rp\u0004\u001bL\na";
                        obj = 34;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModePasteDrawable /*34*/:
                        strArr2[i] = str;
                        i = 36;
                        str = "\u0013e\u0015\u0004Y\n";
                        obj = 35;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeSelectAllDrawable /*35*/:
                        strArr2[i] = str;
                        i = 37;
                        str = "\u001da\u0001\u001aX\u0012e\u001f)O\u0017p\u001f\u0017Y\u001b";
                        obj = 36;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeShareDrawable /*36*/:
                        strArr2[i] = str;
                        i = 38;
                        str = "\u0013e\u0015\u0010]\u000e";
                        obj = 37;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeFindDrawable /*37*/:
                        strArr2[i] = str;
                        i = 39;
                        str = "\u0013e\u0015\u0004Y\n[\u001f\u0017Y\u001b[\u0004\u0018N\fa\f\u0005H";
                        obj = 38;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModeWebSearchDrawable /*38*/:
                        strArr2[i] = str;
                        i = 40;
                        str = "R$\u0000\u0017U\u0018t\u001dK";
                        obj = 39;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionModePopupWindowStyle /*39*/:
                        strArr2[i] = str;
                        i = 41;
                        str = "R$\u001e\u0013C\u001aA\f\u0004A\u0007F:3\u0010";
                        obj = 40;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                        strArr2[i] = str;
                        i = 42;
                        str = "R$\u0000\u0017U\fp\u00194D\nv\f\u0002H=e\u001dK";
                        obj = 41;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                        strArr2[i] = str;
                        i = 43;
                        str = "R$\t\u0002U<s\b\"E\fa\u001e\u001eB\u0012`P";
                        obj = 42;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_dialogTheme /*42*/:
                        strArr2[i] = str;
                        i = 44;
                        str = "R$\u000b\u0004L\u0013a\u001e&H\fT\f\u0015F\u001bpP";
                        obj = 43;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_dialogPreferredPadding /*43*/:
                        strArr2[i] = str;
                        str = ",e\u0019\u0013n\u0011j\u0019\u0004B\u0012\u007fAVI\u0017w\f\u0014A\u001bV\f\u0002H=k\u0003\u0002_\u0011hP";
                        obj = 44;
                        i = 45;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_listDividerAlertDialog /*44*/:
                        strArr2[i] = str;
                        i = 46;
                        strArr2 = strArr3;
                        str = "R$\u0004\u0018D\nF\u0004\u0002_\u001fp\bK";
                        obj = 45;
                        break;
                    case arj.Theme_actionDropDownStyle /*45*/:
                        strArr2[i] = str;
                        i = 47;
                        str = "R$\u0000\u0017U\fp\u0019$L\na$\u0018N\fa\f\u0005HC";
                        obj = 46;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                        strArr2[i] = str;
                        i = 48;
                        str = "R$\u0000\u0017U<S(K";
                        obj = 47;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_spinnerDropDownItemStyle /*47*/:
                        strArr2[i] = str;
                        i = 49;
                        str = "R$\u0000\u001fC\fp\u0019K";
                        obj = 48;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_homeAsUpIndicator /*48*/:
                        strArr2[i] = str;
                        i = 50;
                        str = "R$\u0000\u001fC\u0018t\u001dK";
                        obj = 49;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_actionButtonStyle /*49*/:
                        strArr2[i] = str;
                        i = 51;
                        str = "R$\u0004\u0018D\nF\u0004\u0002_\u001fp\b9C=a\u0001\u001aX\u0012e\u001fK";
                        obj = 50;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_buttonBarStyle /*50*/:
                        strArr2[i] = str;
                        i = 52;
                        str = "R$\t\u0002U)e\u0004\u0002}\u001bv\u0004\u0019IC";
                        obj = 51;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_buttonBarButtonStyle /*51*/:
                        strArr2[i] = str;
                        i = 53;
                        str = "R$\u000e\u0013A\u0012q\u0001\u0017_<m\u0019\u0004L\naP";
                        obj = 52;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_selectableItemBackground /*52*/:
                        strArr2[i] = str;
                        i = 54;
                        str = "R$\u001d\u001dY-m\u0017\u0013y\u0016v\b\u0005E\u0011h\t4D\nv\f\u0002HC";
                        obj = 53;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                        strArr2[i] = str;
                        i = 55;
                        str = "R$\u0000\u0017U\fp\u0019&L\u000bw\b9C,p\u0019?C\u001dv\b\u0017^\u001b9";
                        obj = 54;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_borderlessButtonStyle /*54*/:
                        strArr2[i] = str;
                        i = 56;
                        str = "R$\u0001\u0019Z:e\u0019\u0017x\re\n\u0013o\u0017p\u001f\u0017Y\u001b9";
                        obj = 55;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_dividerVertical /*55*/:
                        strArr2[i] = str;
                        i = 57;
                        str = "R$\u000b\u0006],p\u0019\"E\fa\u001e\u001eB\u0012`P";
                        obj = 56;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_dividerHorizontal /*56*/:
                        strArr2[i] = str;
                        i = 58;
                        str = "R$\u0000\u0017U\fp\u0019K";
                        obj = 57;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_activityChooserViewStyle /*57*/:
                        strArr2[i] = str;
                        i = 59;
                        str = "R$\b\u0017_\u0012}?\u0002YC";
                        obj = 58;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_toolbarStyle /*58*/:
                        strArr2[i] = str;
                        i = 60;
                        str = "R$\t\u0002U,p\u0019\"E\fa\u001e\u001eB\u0012`P";
                        obj = 59;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                        strArr2[i] = str;
                        i = 61;
                        str = "R$\u0000\u0017U\u0018t\u001d)I\u000bv\f\u0002D\u0011jP";
                        obj = 60;
                        strArr2 = strArr3;
                        break;
                    case arj.Theme_popupMenuStyle /*60*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "\u0013e\u0015\u0014Z\u001b";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public RateControl(Boolean bool, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, Integer num14, Boolean bool2, Boolean bool3, Boolean bool4, Integer num15, Integer num16, Integer num17, Integer num18) {
            this.disableRateControl = bool;
            this.framesPerPacket = num;
            this.minRTT = num2;
            this.maxRTT = num3;
            this.initBitrate = num4;
            this.minFramesPerPacket = num5;
            this.maxFramesPerPacket = num6;
            this.maxFramesPerPacketDuration = num7;
            this.cellularBitrate = num8;
            this.pktSizeThresholdBitrate = num9;
            this.lowDataUsageBitrate = num10;
            this.maxrttRateIncrease = num11;
            this.initBitrateOnCellular = num12;
            this.maxrttBitrateCap = num13;
            this.maxBWE = num14;
            this.maxrttPauseOnRttIncrease = bool2;
            this.earlyRtt = bool3;
            this.sendEarlyBWE = bool4;
            this.dtxRttThreshold = num15;
            this.dtxBweThreshold = num16;
            this.dtxWaitPeriod = num17;
            this.fppRttThreshold = num18;
        }

        public static RateControl fromProtocolTreeNode(cw cwVar) {
            if (cwVar == null) {
                return null;
            }
            String b = cwVar.b(z[16]);
            String b2 = cwVar.b(z[20]);
            String b3 = cwVar.b(z[8]);
            String b4 = cwVar.b(z[18]);
            String b5 = cwVar.b(z[5]);
            String b6 = cwVar.b(z[26]);
            String b7 = cwVar.b(z[0]);
            String b8 = cwVar.b(z[22]);
            String b9 = cwVar.b(z[9]);
            String b10 = cwVar.b(z[2]);
            Boolean access$400 = VoipOptions.access$400(VoipOptions.access$200(b));
            Integer access$300 = VoipOptions.access$300(b2, z[23], 0, 8);
            Integer access$000 = VoipOptions.access$000(b5, z[14]);
            Integer access$0002 = VoipOptions.access$000(b6, z[36]);
            Integer access$0003 = VoipOptions.access$000(b7, z[19]);
            Integer access$0004 = VoipOptions.access$000(b8, z[37]);
            Integer access$0005 = VoipOptions.access$000(b9, z[33]);
            Integer access$3002 = VoipOptions.access$300(b3, z[21], 0, 8);
            Integer access$3003 = VoipOptions.access$300(b4, z[38], 0, 8);
            Integer access$0006 = VoipOptions.access$000(cwVar.b(z[6]), z[4]);
            Integer access$0007 = VoipOptions.access$000(b10, z[12]);
            Integer access$0008 = VoipOptions.access$000(cwVar.b(z[25]), z[39]);
            Integer access$0009 = VoipOptions.access$000(cwVar.b(z[24]), z[30]);
            Integer access$00010 = VoipOptions.access$000(cwVar.b(z[11]), z[27]);
            cw cwVar2 = cwVar;
            Integer access$00011 = VoipOptions.access$000(cwVar2.b(z[1]), z[7]);
            Boolean access$200 = VoipOptions.access$200(cwVar.b(z[3]));
            Boolean access$2002 = VoipOptions.access$200(cwVar.b(z[34]));
            Boolean access$2003 = VoipOptions.access$200(cwVar.b(z[35]));
            cwVar2 = cwVar;
            Integer access$00012 = VoipOptions.access$000(cwVar2.b(z[31]), z[10]);
            cwVar2 = cwVar;
            Integer access$00013 = VoipOptions.access$000(cwVar2.b(z[32]), z[28]);
            cwVar2 = cwVar;
            Integer access$00014 = VoipOptions.access$000(cwVar2.b(z[29]), z[15]);
            cwVar2 = cwVar;
            return new RateControl(access$400, access$300, access$000, access$0002, access$0003, access$3002, access$3003, access$0006, access$0004, access$0005, access$0007, access$0008, access$0009, access$00010, access$00011, access$200, access$2002, access$2003, access$00012, access$00013, access$00014, VoipOptions.access$000(cwVar2.b(z[17]), z[13]));
        }

        public String toString() {
            return z[45] + this.disableRateControl + z[44] + this.framesPerPacket + z[49] + this.minRTT + z[58] + this.maxRTT + z[46] + this.initBitrate + z[53] + this.cellularBitrate + z[54] + this.pktSizeThresholdBitrate + z[50] + this.minFramesPerPacket + z[40] + this.maxFramesPerPacket + z[61] + this.maxFramesPerPacketDuration + z[56] + this.lowDataUsageBitrate + z[47] + this.maxrttRateIncrease + z[51] + this.initBitrateOnCellular + z[42] + this.maxrttBitrateCap + z[48] + this.maxBWE + z[55] + this.maxrttPauseOnRttIncrease + z[59] + this.earlyRtt + z[41] + this.sendEarlyBWE + z[60] + this.dtxRttThreshold + z[43] + this.dtxBweThreshold + z[52] + this.dtxWaitPeriod + z[57] + this.fppRttThreshold + '}';
        }
    }

    public final class RelayElection {
        private static final String[] z;
        public final Short mode;
        public final Integer p2pRequestTimeout;
        public final Short pingCalcMode;
        public final Integer pingInterval;
        public final Integer pingRounds;
        public final Integer pingUpdateInterval;
        public final Short timestampSource;

        static {
            String[] strArr = new String[21];
            String str = "L\u00029Eh2G8\u0002}\u0013V\u001d\u001eu\u0005M<\u0003%";
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
                            i3 = 96;
                            break;
                        case at.g /*1*/:
                            i3 = 34;
                            break;
                        case at.i /*2*/:
                            i3 = 73;
                            break;
                        case at.o /*3*/:
                            i3 = 119;
                            break;
                        default:
                            i3 = 24;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "2G%\u0016a%N,\u0014l\tM'\fu\u000fF,J";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        str = "L\u00029\u001ev\u0007k'\u0003}\u0012T(\u001b%";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        str = "L\u0002=\u001eu\u0005Q=\u0016u\u0010q&\u0002j\u0003Gt";
                        i = 4;
                        strArr2 = strArr3;
                        obj = 3;
                        break;
                    case at.o /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        strArr2 = strArr3;
                        str = "L\u00029\u001ev\u0007w9\u0013y\u0014G\u0000\u0019l\u0005P?\u0016t]";
                        obj = 4;
                        break;
                    case at.p /*4*/:
                        strArr2[i] = str;
                        i = 6;
                        str = "L\u00029\u001ev\u0007p&\u0002v\u0004Qt";
                        obj = 5;
                        strArr2 = strArr3;
                        break;
                    case at.m /*5*/:
                        strArr2[i] = str;
                        i = 7;
                        str = "\u0010}*\u0016t\u0003";
                        obj = 6;
                        strArr2 = strArr3;
                        break;
                    case Y.f /*6*/:
                        strArr2[i] = str;
                        i = 8;
                        str = "\u0010};\u0018m\u000eF:";
                        obj = 7;
                        strArr2 = strArr3;
                        break;
                    case aF.v /*7*/:
                        strArr2[i] = str;
                        i = 9;
                        str = "\u0010};\u0018m\u000eF:";
                        obj = 8;
                        strArr2 = strArr3;
                        break;
                    case aF.u /*8*/:
                        strArr2[i] = str;
                        i = 10;
                        str = "\rM-\u0012";
                        obj = 9;
                        strArr2 = strArr3;
                        break;
                    case Y.l /*9*/:
                        strArr2[i] = str;
                        i = 11;
                        str = "\u0010}*\u0016t\u0003";
                        obj = 10;
                        strArr2 = strArr3;
                        break;
                    case Y.t /*10*/:
                        strArr2[i] = str;
                        i = 12;
                        str = "\u0010} \u0019l\u0005P?\u0016t";
                        obj = 11;
                        strArr2 = strArr3;
                        break;
                    case Y.j /*11*/:
                        strArr2[i] = str;
                        i = 13;
                        str = "\u0010\u00109(j\u0005S<\u0012k\u0014}=\u001eu\u0005M<\u0003";
                        obj = 12;
                        strArr2 = strArr3;
                        break;
                    case Y.p /*12*/:
                        strArr2[i] = str;
                        i = 14;
                        str = "\rM-\u0012";
                        obj = 13;
                        strArr2 = strArr3;
                        break;
                    case Y.q /*13*/:
                        strArr2[i] = str;
                        i = 15;
                        str = "\u0010} \u0019l\u0005P?\u0016t";
                        obj = 14;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_titleMarginEnd /*14*/:
                        strArr2[i] = str;
                        i = 16;
                        str = "\u0010}<\u0007|\u0001V,(q\u000eV,\u0005n\u0001N";
                        obj = 15;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_titleMarginTop /*15*/:
                        strArr2[i] = str;
                        i = 17;
                        str = "\u0010}<\u0007|\u0001V,(q\u000eV,\u0005n\u0001N";
                        obj = 16;
                        strArr2 = strArr3;
                        break;
                    case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                        strArr2[i] = str;
                        i = 18;
                        str = "\u0014K$\u0012k\u0014C$\u0007";
                        obj = 17;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_maxButtonHeight /*17*/:
                        strArr2[i] = str;
                        i = 19;
                        str = "\u0014K$\u0012k\u0014C$\u0007";
                        obj = 18;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_collapseIcon /*18*/:
                        strArr2[i] = str;
                        i = 20;
                        str = "\u0010\u00109(j\u0005S<\u0012k\u0014}=\u001eu\u0005M<\u0003";
                        obj = 19;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_collapseContentDescription /*19*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "L\u00029\u001ev\u0007a(\u001b{-M-\u0012%";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public RelayElection(Short sh, Short sh2, Short sh3, Integer num, Integer num2, Integer num3, Integer num4) {
            this.mode = sh;
            this.timestampSource = sh2;
            this.pingCalcMode = sh3;
            this.pingInterval = num;
            this.pingRounds = num2;
            this.pingUpdateInterval = num3;
            this.p2pRequestTimeout = num4;
        }

        public static RelayElection fromProtocolTreeNode(cw cwVar) {
            if (cwVar == null) {
                return null;
            }
            return new RelayElection(VoipOptions.access$100(cwVar.b(z[14]), z[10], 0, 7), VoipOptions.access$100(cwVar.b(z[18]), z[19], 0, 7), VoipOptions.access$100(cwVar.b(z[7]), z[11], 0, 7), VoipOptions.access$000(cwVar.b(z[15]), z[12]), VoipOptions.access$000(cwVar.b(z[9]), z[8]), VoipOptions.access$000(cwVar.b(z[16]), z[17]), VoipOptions.access$000(cwVar.b(z[20]), z[13]));
        }

        public String toString() {
            return z[2] + this.mode + z[4] + this.timestampSource + z[1] + this.pingCalcMode + z[6] + this.pingRounds + z[3] + this.pingInterval + z[5] + this.pingUpdateInterval + z[0] + this.p2pRequestTimeout + '}';
        }
    }

    public final class Resend {
        private static final String[] z;
        public final Integer bweThreshold;
        public final Integer delayPackets;
        public final Boolean dryRun;
        public final Boolean forceDtx;
        public final Integer maxBitrate;
        public final Integer packetLossThreshold;

        static {
            String[] strArr = new String[16];
            String str = "_IvnQfBpu";
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
                            i3 = 57;
                            break;
                        case at.g /*1*/:
                            i3 = 38;
                            break;
                        case at.i /*2*/:
                            i3 = 4;
                            break;
                        case at.o /*3*/:
                            i3 = 13;
                            break;
                        default:
                            i3 = 52;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "]ChlMfVoyG";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        i = 3;
                        strArr2 = strArr3;
                        str = "[QaR@QTa~\\VJ`";
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        str = "[QaR@QTa~\\VJ`";
                        obj = 3;
                        i = 4;
                        strArr2 = strArr3;
                        break;
                    case at.o /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        strArr2 = strArr3;
                        str = "IJ";
                        obj = 4;
                        break;
                    case at.p /*4*/:
                        strArr2[i] = str;
                        i = 6;
                        str = "TG|RVPRvl@\\";
                        obj = 5;
                        strArr2 = strArr3;
                        break;
                    case at.m /*5*/:
                        strArr2[i] = str;
                        i = 7;
                        str = "]ChlMfVoyG";
                        obj = 6;
                        strArr2 = strArr3;
                        break;
                    case Y.f /*6*/:
                        strArr2[i] = str;
                        i = 8;
                        str = "IJ";
                        obj = 7;
                        strArr2 = strArr3;
                        break;
                    case aF.v /*7*/:
                        strArr2[i] = str;
                        i = 9;
                        str = "TG|RVPRvl@\\";
                        obj = 8;
                        strArr2 = strArr3;
                        break;
                    case aF.u /*8*/:
                        strArr2[i] = str;
                        i = 10;
                        str = "kCwhZ]]tlWRCpA[JUPeF\\UlbX]\u001b";
                        obj = 9;
                        strArr2 = strArr3;
                        break;
                    case Y.l /*9*/:
                        strArr2[i] = str;
                        i = 11;
                        str = "[QaY\\KCwe[UB9";
                        obj = 10;
                        strArr2 = strArr3;
                        break;
                    case Y.t /*10*/:
                        strArr2[i] = str;
                        i = 12;
                        str = "]T}_AW\u001b";
                        obj = 11;
                        strArr2 = strArr3;
                        break;
                    case Y.j /*11*/:
                        strArr2[i] = str;
                        str = "_IvnQ}R|0";
                        obj = 12;
                        i = 13;
                        strArr2 = strArr3;
                        break;
                    case Y.p /*12*/:
                        strArr2[i] = str;
                        i = 14;
                        strArr2 = strArr3;
                        str = "TG|O]MTeyQ\u0004";
                        obj = 13;
                        break;
                    case Y.q /*13*/:
                        strArr2[i] = str;
                        i = 15;
                        str = "]ChlMiGgfQMU9";
                        obj = 14;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_titleMarginEnd /*14*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "]T}RFLH";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public String toString() {
            return z[10] + this.packetLossThreshold + z[11] + this.bweThreshold + z[14] + this.maxBitrate + z[15] + this.delayPackets + z[13] + this.forceDtx + z[12] + this.dryRun + '}';
        }

        public static Resend fromProtocolTreeNode(cw cwVar) {
            if (cwVar == null) {
                return null;
            }
            return new Resend(VoipOptions.access$000(cwVar.b(z[5]), z[8]), VoipOptions.access$000(cwVar.b(z[3]), z[4]), VoipOptions.access$000(cwVar.b(z[6]), z[9]), VoipOptions.access$000(cwVar.b(z[7]), z[2]), VoipOptions.access$200(cwVar.b(z[0])), VoipOptions.access$200(cwVar.b(z[1])));
        }

        public Resend(Integer num, Integer num2, Integer num3, Integer num4, Boolean bool, Boolean bool2) {
            this.packetLossThreshold = num;
            this.bweThreshold = num2;
            this.maxBitrate = num3;
            this.delayPackets = num4;
            this.forceDtx = bool;
            this.dryRun = bool2;
        }
    }

    static {
        String[] strArr = new String[54];
        String str = "::V(\u0018\u001c!V79\u001f.^=4Q";
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
                        i3 = arj.Theme_spinnerStyle;
                        break;
                    case at.g /*1*/:
                        i3 = 85;
                        break;
                    case at.i /*2*/:
                        i3 = 63;
                        break;
                    case at.o /*3*/:
                        i3 = 88;
                        break;
                    default:
                        i3 = 87;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "@uM=$\t;[e";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "@u^-3\u0005:m=$\u0018'V;#Q";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "@uZ64\u00031Ze";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "@u[=4\u00031Ze";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "@u\\4>\t;Ke";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "@u^?4Q";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "@u^:\u0003\t&Ke";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "@uM9#\t\u0016P6#\u001e:Se";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "@uQ7>\u001f0l-'\u001c'Z+$\u0005:Qe";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "@uM=;\r,z42\u000f!V79Q";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "@u]/2Q";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "Vu";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u0005;I9;\u00051\u001fsw";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\n4S+2";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "L}";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "EuP-#\u001f<[=w\u00033\u001f.6\u0000<[x%\r;X=w7";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "%\u001bi\u0019\u001b%\u0011`68\u00020`";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "%\u001bi\u0019\u001b%\u0011`";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "\u0002&";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "\u0003%K18\u0002&";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "\u001e0L=9\b";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "%\u001bi\u0019\u001b%\u0011`";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "\u000f9V=9\u0018";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\u000f9V=9\u0018";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "\u001e6";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "\r0\\";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "\t;\\73\t";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "\u000e\"Z";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "\u0002&";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "\r2\\";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "\r [18";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "\t;\\73\t";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "%\u001bi\u0019\u001b%\u0011`68\u00020`";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "\u0003%K18\u0002&";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "\r2\\";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "%\u001bi\u0019\u001b%\u0011`";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "\u00180L,";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "\u001e0";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "\b0\\73\t";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "\u001e0L=9\b";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "\u000e\"Z";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "\r0\\";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "\u001e0";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "\b0\\73\t";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "\r [18";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "\u00180L,";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "\u001e6";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "%\u001bi\u0019\u001b%\u0011`68\u00020`";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "EuP-#\u001f<[=w\u00033\u001f.6\u0000<[x%\r;X=w7";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "L}";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "\u0005;I9;\u00051\u001fsw";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "Vu";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "@uR1$\u000f0S46\u00020P-$Q";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private static Short convertAttributeToShort(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return new Short(Short.parseShort(str));
        } catch (NumberFormatException e) {
            throw new cz(z[52] + str2 + z[53] + str);
        }
    }

    public VoipOptions() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    private static Boolean convertAttributeToBoolean(String str) {
        try {
            if (!"0".equals(str)) {
                if (!z[15].equals(str)) {
                    if (str == null) {
                        return null;
                    }
                    try {
                        return Boolean.TRUE;
                    } catch (NumberFormatException e) {
                        throw e;
                    }
                }
            }
            return Boolean.FALSE;
        } catch (NumberFormatException e2) {
            throw e2;
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    public VoipOptions(Aec aec, Encode encode, Decode decode, Miscellaneous miscellaneous, Agc agc, AudioRestrict audioRestrict, NoiseSuppression noiseSuppression, ABTest aBTest, b4 b4Var, RateControl rateControl, Resend resend, BandwidthEstimator bandwidthEstimator, RelayElection relayElection) {
        this.aec = aec;
        this.encode = encode;
        this.decode = decode;
        this.miscellaneous = miscellaneous;
        this.agc = agc;
        this.audioRestrict = audioRestrict;
        this.noiseSuppression = noiseSuppression;
        this.abTest = aBTest;
        this.client = b4Var;
        this.rateControl = rateControl;
        this.resend = resend;
        this.bwe = bandwidthEstimator;
        this.re = relayElection;
    }

    static Boolean access$200(String str) {
        return convertAttributeToBoolean(str);
    }

    public static VoipOptions fromProtocolTreeNode(cw cwVar, boolean z) {
        Aec fromProtocolTreeNode;
        Encode fromProtocolTreeNode2;
        Decode fromProtocolTreeNode3;
        Miscellaneous fromProtocolTreeNode4;
        Agc fromProtocolTreeNode5;
        NoiseSuppression fromProtocolTreeNode6;
        b4 a;
        RateControl fromProtocolTreeNode7;
        Resend fromProtocolTreeNode8;
        BandwidthEstimator fromProtocolTreeNode9;
        RelayElection fromProtocolTreeNode10;
        ABTest aBTest;
        String str = null;
        try {
            fromProtocolTreeNode = Aec.fromProtocolTreeNode(cwVar.f(z[27]));
        } catch (cz e) {
            fromProtocolTreeNode = null;
            str = z[43];
        }
        try {
            fromProtocolTreeNode2 = Encode.fromProtocolTreeNode(cwVar.f(z[33]));
        } catch (cz e2) {
            fromProtocolTreeNode2 = null;
            str = z[28];
        }
        try {
            fromProtocolTreeNode3 = Decode.fromProtocolTreeNode(cwVar.f(z[45]));
        } catch (cz e3) {
            fromProtocolTreeNode3 = null;
            str = z[40];
        }
        try {
            fromProtocolTreeNode4 = Miscellaneous.fromProtocolTreeNode(cwVar.f(z[35]));
        } catch (cz e4) {
            fromProtocolTreeNode4 = null;
            str = z[21];
        }
        try {
            fromProtocolTreeNode5 = Agc.fromProtocolTreeNode(cwVar.f(z[36]));
        } catch (cz e5) {
            fromProtocolTreeNode5 = null;
            str = z[31];
        }
        AudioRestrict audioRestrict = null;
        if (z) {
            try {
                audioRestrict = AudioRestrict.fromProtocolTreeNode(cwVar.f(z[46]));
            } catch (cz e6) {
                audioRestrict = null;
                str = z[32];
            }
        }
        try {
            fromProtocolTreeNode6 = NoiseSuppression.fromProtocolTreeNode(cwVar.f(z[30]));
        } catch (cz e7) {
            fromProtocolTreeNode6 = null;
            str = z[20];
        }
        try {
            a = b4.a(cwVar.f(z[24]));
        } catch (cz e8) {
            a = null;
            str = z[25];
        }
        try {
            fromProtocolTreeNode7 = RateControl.fromProtocolTreeNode(cwVar.f(z[48]));
        } catch (cz e9) {
            fromProtocolTreeNode7 = null;
            str = z[26];
        }
        try {
            fromProtocolTreeNode8 = Resend.fromProtocolTreeNode(cwVar.f(z[41]));
        } catch (cz e10) {
            fromProtocolTreeNode8 = null;
            str = z[22];
        }
        try {
            fromProtocolTreeNode9 = BandwidthEstimator.fromProtocolTreeNode(cwVar.f(z[42]));
        } catch (cz e11) {
            fromProtocolTreeNode9 = null;
            str = z[29];
        }
        try {
            fromProtocolTreeNode10 = RelayElection.fromProtocolTreeNode(cwVar.f(z[44]));
        } catch (cz e12) {
            fromProtocolTreeNode10 = null;
            str = z[39];
        }
        ABTest aBTest2;
        StringBuilder append;
        try {
            ABTest fromProtocolTreeNode11 = ABTest.fromProtocolTreeNode(cwVar.f(z[47]));
            if (str != null) {
                if (fromProtocolTreeNode11 == null) {
                    try {
                        aBTest2 = new ABTest((z[18] + str).toUpperCase());
                    } catch (cz e13) {
                        throw e13;
                    }
                }
                append = new StringBuilder().append(z[19]);
                aBTest2 = new ABTest(r16.append(fromProtocolTreeNode11.name).append("_").append(str).toString().toUpperCase());
                aBTest = aBTest2;
            } else {
                aBTest = fromProtocolTreeNode11;
            }
        } catch (cz e14) {
            aBTest = null;
            String str2 = z[38];
            if (str2 != null) {
                if (null == null) {
                    try {
                        aBTest2 = new ABTest((z[34] + str2).toUpperCase());
                    } catch (cz e132) {
                        throw e132;
                    }
                }
                append = new StringBuilder().append(z[23]);
                String str3 = "_";
                aBTest2 = new ABTest(r16.append(null.name).append(r16).append(str2).toString().toUpperCase());
                aBTest = aBTest2;
            }
        } catch (Throwable th) {
            if (str != null) {
                ABTest aBTest3;
                if (null == null) {
                    try {
                        aBTest3 = new ABTest((z[49] + str).toUpperCase());
                    } catch (cz e1322) {
                        throw e1322;
                    }
                }
                aBTest3 = new ABTest((z[37] + null.name + "_" + str).toUpperCase());
            }
        }
        return new VoipOptions(fromProtocolTreeNode, fromProtocolTreeNode2, fromProtocolTreeNode3, fromProtocolTreeNode4, fromProtocolTreeNode5, audioRestrict, fromProtocolTreeNode6, aBTest, a, fromProtocolTreeNode7, fromProtocolTreeNode8, fromProtocolTreeNode9, fromProtocolTreeNode10);
    }

    private static Integer convertAttributeToInteger(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException e) {
            throw new cz(z[14] + str2 + z[13] + str);
        }
    }

    static Short access$500(String str, String str2) {
        return convertAttributeToShort(str, str2);
    }

    static Integer access$000(String str, String str2) {
        return convertAttributeToInteger(str, str2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Short convertAttributeToShort(java.lang.String r5, java.lang.String r6, int r7, int r8) {
        /*
        r0 = convertAttributeToShort(r5, r6);
        if (r0 == 0) goto L_0x0057;
    L_0x0006:
        r1 = r0.shortValue();	 Catch:{ NumberFormatException -> 0x0055 }
        if (r1 < r7) goto L_0x0012;
    L_0x000c:
        r1 = r0.shortValue();	 Catch:{ NumberFormatException -> 0x0053 }
        if (r1 <= r8) goto L_0x0057;
    L_0x0012:
        r1 = new com.whatsapp.protocol.cz;	 Catch:{ NumberFormatException -> 0x0053 }
        r2 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0053 }
        r2.<init>();	 Catch:{ NumberFormatException -> 0x0053 }
        r2 = r2.append(r6);	 Catch:{ NumberFormatException -> 0x0053 }
        r3 = z;	 Catch:{ NumberFormatException -> 0x0053 }
        r4 = 51;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x0053 }
        r2 = r2.append(r3);	 Catch:{ NumberFormatException -> 0x0053 }
        r0 = r2.append(r0);	 Catch:{ NumberFormatException -> 0x0053 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0053 }
        r3 = 50;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0053 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0053 }
        r0 = r0.append(r7);	 Catch:{ NumberFormatException -> 0x0053 }
        r2 = ",";
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0053 }
        r0 = r0.append(r8);	 Catch:{ NumberFormatException -> 0x0053 }
        r2 = "]";
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0053 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x0053 }
        r1.<init>(r0);	 Catch:{ NumberFormatException -> 0x0053 }
        throw r1;	 Catch:{ NumberFormatException -> 0x0053 }
    L_0x0053:
        r0 = move-exception;
        throw r0;
    L_0x0055:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0053 }
    L_0x0057:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.VoipOptions.convertAttributeToShort(java.lang.String, java.lang.String, int, int):java.lang.Short");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Integer convertAttributeToInteger(java.lang.String r5, java.lang.String r6, int r7, int r8) {
        /*
        r0 = convertAttributeToInteger(r5, r6);
        if (r0 == 0) goto L_0x0057;
    L_0x0006:
        r1 = r0.intValue();	 Catch:{ NumberFormatException -> 0x0055 }
        if (r1 < r7) goto L_0x0012;
    L_0x000c:
        r1 = r0.intValue();	 Catch:{ NumberFormatException -> 0x0053 }
        if (r1 <= r8) goto L_0x0057;
    L_0x0012:
        r1 = new com.whatsapp.protocol.cz;	 Catch:{ NumberFormatException -> 0x0053 }
        r2 = new java.lang.StringBuilder;	 Catch:{ NumberFormatException -> 0x0053 }
        r2.<init>();	 Catch:{ NumberFormatException -> 0x0053 }
        r2 = r2.append(r6);	 Catch:{ NumberFormatException -> 0x0053 }
        r3 = z;	 Catch:{ NumberFormatException -> 0x0053 }
        r4 = 16;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x0053 }
        r2 = r2.append(r3);	 Catch:{ NumberFormatException -> 0x0053 }
        r0 = r2.append(r0);	 Catch:{ NumberFormatException -> 0x0053 }
        r2 = z;	 Catch:{ NumberFormatException -> 0x0053 }
        r3 = 17;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0053 }
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0053 }
        r0 = r0.append(r7);	 Catch:{ NumberFormatException -> 0x0053 }
        r2 = ",";
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0053 }
        r0 = r0.append(r8);	 Catch:{ NumberFormatException -> 0x0053 }
        r2 = "]";
        r0 = r0.append(r2);	 Catch:{ NumberFormatException -> 0x0053 }
        r0 = r0.toString();	 Catch:{ NumberFormatException -> 0x0053 }
        r1.<init>(r0);	 Catch:{ NumberFormatException -> 0x0053 }
        throw r1;	 Catch:{ NumberFormatException -> 0x0053 }
    L_0x0053:
        r0 = move-exception;
        throw r0;
    L_0x0055:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0053 }
    L_0x0057:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.VoipOptions.convertAttributeToInteger(java.lang.String, java.lang.String, int, int):java.lang.Integer");
    }

    static Boolean access$400(Boolean bool) {
        return negate(bool);
    }

    static Short access$100(String str, String str2, int i, int i2) {
        return convertAttributeToShort(str, str2, i, i2);
    }

    private static Boolean negate(Boolean bool) {
        try {
            if (Boolean.TRUE.equals(bool)) {
                return Boolean.FALSE;
            }
            try {
                if (Boolean.FALSE.equals(bool)) {
                    return Boolean.TRUE;
                }
                return null;
            } catch (NumberFormatException e) {
                throw e;
            }
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    static Integer access$300(String str, String str2, int i, int i2) {
        return convertAttributeToInteger(str, str2, i, i2);
    }

    public String toString() {
        return z[0] + this.aec + z[4] + this.encode + z[5] + this.decode + z[1] + this.miscellaneous + z[7] + this.agc + z[3] + this.audioRestrict + z[10] + this.noiseSuppression + z[8] + this.abTest + z[6] + this.client + z[9] + this.rateControl + z[2] + this.resend + z[12] + this.bwe + z[11] + this.re + '}';
    }
}
