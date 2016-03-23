package com.whatsapp;

import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import com.whatsapp.util.a1;
import java.io.File;
import java.io.IOException;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class Mp4Ops {
    private static final String[] z;

    public class LibMp4CheckAndRepairResult {
        public int errorCode;
        public String errorMessage;
        public boolean ioException;
        public String repairFileName;
        public boolean repaired;
        public boolean success;

        public LibMp4CheckAndRepairResult(boolean z, boolean z2, String str, int i, String str2, boolean z3) {
            this.success = z;
            this.repaired = z2;
            this.repairFileName = str;
            this.errorCode = i;
            this.errorMessage = str2;
            this.ioException = z3;
        }
    }

    public class LibMp4OperationResult {
        public int errorCode;
        public String errorMessage;
        public boolean ioException;
        public boolean success;

        public LibMp4OperationResult(boolean z, boolean z2, int i, String str) {
            this.success = z;
            this.ioException = z2;
            this.errorCode = i;
            this.errorMessage = str;
        }
    }

    static {
        String[] strArr = new String[57];
        String str = ".\u001bKxY0D\u0012bQl\u0018\u000bv[7";
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
                        i3 = 67;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_seekBarStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 127;
                        break;
                    case at.o /*3*/:
                        i3 = 23;
                        break;
                    default:
                        i3 = 41;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = ".\u001bKxY0D\u0012bQl\r\u001e~E&\u000fE7D3_\u0012bQc\u000e\reF1G_rQ*\u001f\u0016yN";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = ".\u001bKxY0D\u0012bQl\u0019\u001ad\\/\u001f_~Zc\u0005\n{E";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "*\u0005\tvE*\u000f_eL0\u001e\u0013c\u0005c";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = ".\u001bKxY0D\u0012bQl\u000e\reF14\u0012rZ0\n\u0018r\u0006";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u000e\u001bKXY04\u0012bQ";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "1\u000e\fbE7K\u0016d\t-\u001e\u0013{";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "c\u0018\u0016mLy";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\r\u0004_dY\"\b\u001a";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = ".\u001bKxY0D\u0012bQl\r\u0016y@0\u0003\u001as\u0013c";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = ".\u001bKxY0D\u0012bQl\u0019\u001ad\\/\u001fE7";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "*\u0005\u000brN1\u0002\u000bn\t \u0003\u001atBc\u000e\reF1";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = ".\u001bKxY0D\u001c\u007fL \u0000Pr[1\u0004\rHD&\u0018\fvN&D";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u000e\u001bKXY04\u0016y]&\f\r~]:(\u0017rJ(";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = ".\u001bKxY0D\u001c\u007fL \u0000Pq@-\u0002\f\u007fL'Q_";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "*\u0005\u000brN1\u0002\u000bn\t \u0003\u001atBc\r\u001e~E&\u000fS7L1\u0019\u0010ev \u0004\u001br\u0013c";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = ".\u001bKxY0D\u001c\u007fL \u0000Pd]\"\u0019\u000b";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = ".\u001bKxY0D\u0016y]&\f\rv]*\u0004\u00117O\"\u0002\u00138";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "1\u000e\fbE7K\u0016d\t-\u001e\u0013{";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "&\u0019\rx[\u001c\b\u0010sLyK";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "c\u0018\u0016mLy";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "c\u001f\u0016zL\u0017\u0004E";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    str = "7\u0002\u0012ro1\u0004\u0012-";
                    obj = 22;
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    strArr2 = strArr3;
                    str = ".\u001bKxY0D\u000be@.D\rrZ6\u0007\u000b-\t";
                    obj = 23;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = ".\u001bKxY0D\u000be@.D\u0019v@/\u000e\u001b-\t.\u001bKz\\;K\u001ae[,\u0019S7L;\u0002\u000b~G$";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "c\u0018\u0016mLy";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "\r\u0004_dY\"\b\u001a";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = ".\u001bKxY0D\u000be@.D\u0019~G*\u0018\u0017rMyK";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "\u000e\u001bKXY04\u000be@.";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "c\u001f\u00107";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = ".\u001bKxY0D\u000be@.D\u001ae[,\u0019 zL0\u0018\u001epLl";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "*\u0005\tvE*\u000f_eL0\u001e\u0013c\u0005c";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = ".\u001bKxY0D\u000be@.D\fcH1\u001f_q[,\u0006_";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = ".\u001bKxY0D\u000be@.D\rrZ6\u0007\u000b7@0K\u0011bE/";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "5\u0002\u001brFm\r\u0010d";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "l\u0018\u001btH1\u000fP@A\"\u001f\fVY3D2rM*\nP@A\"\u001f\fVY3K)~M&\u0004P";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "\u000f\u0002\u001dZYw$\u000fr[\"\u001f\u0016xG0K";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "c\r\u001e~E&\u000fE7";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "\"\u001f\u000bvJ+\u0006\u001ay]";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "\u000f\u0002\u001dZYw$\u000fr[\"\u001f\u0016xG0K";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    str = ".\u001bKxY0D\u0019x[&\u0005\f~Jn\u001e\u000f{F\"\u000fPt[&\n\u000br\t1\u000e\fbE7V";
                    obj = 40;
                    i = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    strArr2 = strArr3;
                    str = ".\u001bKxY0D\u0019x[&\u0005\f~Jn\u001e\u000f{F\"\u000fP";
                    obj = 41;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "\u0016%<V|\u0004#+7l\u001b(:G}\n$1";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "c\r\u001e~E&\u000f_?O*\u0007\u001a>\u0013c";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "5\u0002\u001brF7\u0019\u001eyZ \u0004\u001bsL1D\u0019x[&\u0005\f~Jc\r\u001e~El";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = ".\u001bKxY0D\u0019x[&\u0005\f~Jc\u0019\u001ac\u0014";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = ".\u001bKxY0D\u0016y]&\f\rv]*\u0004\u00117O\"\u0002\u00138";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "\r\u0004_dY\"\b\u001a";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = ".\u001bKxY0D\u001c\u007fL \u0000>yM\u0011\u000e\u000fv@1D\u0019~E&4\u0016dv1\u000e\u000fv@1\u000e\u001b;\t-\u000e\b7O*\u0007\u001a7J1\u000e\u001ecL'Q_";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "\u000e\u001bKXY04\u0016y]&\f\r~]:(\u0017rJ(*\u0011s{&\u001b\u001e~[";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = ".\u001bKxY0D\u001c\u007fL \u0000>yM\u0011\u000e\u000fv@1D\fcH1\u001f";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "*\u0005\u000brN1\u0002\u000bn\t \u0003\u001atBc\u000e\reF1";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = ".\u001bKxY0D\u001c\u007fL \u0000>yM\u0011\u000e\u000fv@1D\u001ae[,\u0019 zL0\u0018\u001epLl";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = ".\u001bKxY0D\u001c\u007fL \u0000>yM\u0011\u000e\u000fv@1D\u0019~E&4\rrY\"\u0002\rHG,\u001f yL&\u000f\u001as";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = ".\u001bKxY0D\u001c\u007fL \u0000>yM\u0011\u000e\u000fv@1D\u0019~G*\u0018\u0017rMyK";
                    obj = 54;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "*\u0005\u000brN1\u0002\u000bn\t \u0003\u001atBl\u0019\u001agH*\u0019_qH*\u0007\u001as\u0005c\u000e\reF14\u001cxM&Q_";
                    obj = 55;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "&\u0019\rx[\u001c\b\u0010sLyK";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private static native LibMp4OperationResult mp4check(String str, boolean z);

    private static native LibMp4CheckAndRepairResult mp4checkAndRepair(String str);

    private static native boolean mp4forensic(int i, String str, String str2);

    private static native LibMp4OperationResult mp4mux(String str, String str2, String str3, float f, float f2, float f3, float f4, boolean z);

    private static boolean a(int i, String str, String str2) {
        try {
            boolean mp4forensic = mp4forensic(i, str, str2);
            Log.e(z[46] + mp4forensic);
            return mp4forensic;
        } catch (Throwable e) {
            Log.b(z[45], e);
            return false;
        }
    }

    public static void a(File file, at_ com_whatsapp_at_, String str) {
        try {
            if (App.am != 0 || App.j != 0) {
                boolean z;
                File file2 = new File(z[36], z[35]);
                boolean a = a(com_whatsapp_at_.a, file2.getAbsolutePath(), file.getAbsolutePath());
                Log.i(z[41] + a);
                if (a) {
                    try {
                        File a2 = a1.a(file2);
                        Log.b(z[43], new RuntimeException(z[40] + str + z[44] + com_whatsapp_at_.getMessage()));
                        App.a(App.z(), false, false, true, false, null, a2, z[39]);
                    } catch (Throwable e) {
                        Log.b(z[42], e);
                        z = false;
                    }
                }
                z = a;
                if (!z) {
                    try {
                        App.a(z[37] + str + z[38] + com_whatsapp_at_.getMessage(), false, null);
                    } catch (IOException e2) {
                        throw e2;
                    }
                }
                file2.delete();
            }
        } catch (IOException e22) {
            throw e22;
        } catch (IOException e222) {
            throw e222;
        }
    }

    public static void a(File file, boolean z) {
        ce a = tp.a(z[14]);
        a.e();
        Log.i(z[17]);
        try {
            LibMp4OperationResult mp4check = mp4check(file.getAbsolutePath(), z);
            try {
                if (mp4check.success) {
                    a.d();
                    Log.i(z[15] + a.a());
                    return;
                }
                Log.e(z[13] + mp4check.errorMessage);
                throw new at_(200, z[16] + mp4check.errorCode, new Throwable());
            } catch (Error e) {
                throw e;
            }
        } catch (Throwable e2) {
            Log.b(z[18], e2);
            throw new at_(200, z[12], new Throwable());
        }
    }

    public static void a(File file, File file2, long j, long j2) {
        ce b = tp.b(z[29]);
        try {
            b.e();
            Log.i(z[33] + j + z[30] + j2 + z[26] + file.length());
            if ((j > 0 || j2 > 0) && j != j2) {
                float f = ((float) j) / 1000.0f;
                try {
                    LibMp4OperationResult mp4mux = mp4mux(file.getAbsolutePath(), file.getAbsolutePath(), file2.getAbsolutePath(), f, f, ((float) (j2 - j)) / 1000.0f, -1.0f, true);
                    if (mp4mux == null) {
                        try {
                            Log.e(z[34]);
                            throw new at_(0, z[19], new Throwable());
                        } catch (Error e) {
                            throw e;
                        }
                    }
                    try {
                        Log.i(z[24] + mp4mux.success);
                        if (mp4mux.success) {
                            b.d();
                            Log.i(z[28] + b.a() + z[21] + file2.length());
                            return;
                        }
                        Log.e(z[31] + mp4mux.errorMessage);
                        if (mp4mux.ioException) {
                            throw new IOException(z[27]);
                        }
                        throw new at_(mp4mux.errorCode, new StringBuilder(z[32]).append(z[20]).append(mp4mux.errorCode).toString(), new Throwable());
                    } catch (Error e2) {
                        throw e2;
                    } catch (Error e22) {
                        throw e22;
                    }
                } catch (Error e222) {
                    Log.e(z[25]);
                    throw new at_(0, e222.getMessage(), new Throwable());
                }
            }
            try {
                throw new IllegalArgumentException(z[23] + j + z[22] + j2);
            } catch (Error e2222) {
                throw e2222;
            }
        } catch (Error e22222) {
            throw e22222;
        } catch (Error e222222) {
            throw e222222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.io.File r12, java.io.File r13, @android.support.annotation.Nullable java.io.File r14, java.io.File r15, long r16, long r18, long r20) {
        /*
        r2 = z;
        r3 = 6;
        r2 = r2[r3];
        r10 = com.whatsapp.tp.b(r2);
        r10.e();
        r2 = z;
        r3 = 0;
        r2 = r2[r3];
        com.whatsapp.util.Log.i(r2);
        if (r14 == 0) goto L_0x001c;
    L_0x0016:
        r5 = 0;
        r9 = 0;
        r2 = com.whatsapp.DialogToastActivity.f;
        if (r2 == 0) goto L_0x0028;
    L_0x001c:
        r0 = r16;
        r2 = (float) r0;
        r3 = 1148846080; // 0x447a0000 float:1000.0 double:5.676053805E-315;
        r5 = r2 / r3;
        if (r12 == 0) goto L_0x0066;
    L_0x0025:
        r2 = 1;
    L_0x0026:
        r9 = r2;
        r14 = r12;
    L_0x0028:
        r6 = 0;
        r0 = r20;
        r2 = (float) r0;
        r3 = 1148846080; // 0x447a0000 float:1000.0 double:5.676053805E-315;
        r7 = r2 / r3;
        r0 = r18;
        r2 = (float) r0;
        r3 = 1148846080; // 0x447a0000 float:1000.0 double:5.676053805E-315;
        r8 = r2 / r3;
        if (r14 != 0) goto L_0x0083;
    L_0x0039:
        r2 = "";
    L_0x003c:
        if (r15 != 0) goto L_0x008a;
    L_0x003e:
        r3 = "";
    L_0x0041:
        r4 = r13.getAbsolutePath();	 Catch:{ Error -> 0x006a }
        r2 = mp4mux(r2, r3, r4, r5, r6, r7, r8, r9);	 Catch:{ Error -> 0x006a }
        if (r2 != 0) goto L_0x008f;
    L_0x004b:
        r2 = z;	 Catch:{ Error -> 0x0064 }
        r3 = 3;
        r2 = r2[r3];	 Catch:{ Error -> 0x0064 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ Error -> 0x0064 }
        r2 = new com.whatsapp.at_;	 Catch:{ Error -> 0x0064 }
        r3 = 0;
        r4 = z;	 Catch:{ Error -> 0x0064 }
        r5 = 7;
        r4 = r4[r5];	 Catch:{ Error -> 0x0064 }
        r5 = new java.lang.Throwable;	 Catch:{ Error -> 0x0064 }
        r5.<init>();	 Catch:{ Error -> 0x0064 }
        r2.<init>(r3, r4, r5);	 Catch:{ Error -> 0x0064 }
        throw r2;	 Catch:{ Error -> 0x0064 }
    L_0x0064:
        r2 = move-exception;
        throw r2;
    L_0x0066:
        r2 = 0;
        goto L_0x0026;
    L_0x0068:
        r2 = move-exception;
        throw r2;	 Catch:{ Error -> 0x006a }
    L_0x006a:
        r2 = move-exception;
        r3 = z;
        r4 = 2;
        r3 = r3[r4];
        com.whatsapp.util.Log.e(r3);
        r3 = new com.whatsapp.at_;
        r4 = 0;
        r2 = r2.getMessage();
        r5 = new java.lang.Throwable;
        r5.<init>();
        r3.<init>(r4, r2, r5);
        throw r3;
    L_0x0083:
        r2 = r14.getAbsolutePath();	 Catch:{ Error -> 0x006a }
        goto L_0x003c;
    L_0x0088:
        r2 = move-exception;
        throw r2;	 Catch:{ Error -> 0x006a }
    L_0x008a:
        r3 = r15.getAbsolutePath();	 Catch:{ Error -> 0x006a }
        goto L_0x0041;
    L_0x008f:
        r3 = new java.lang.StringBuilder;	 Catch:{ Error -> 0x00dc }
        r3.<init>();	 Catch:{ Error -> 0x00dc }
        r4 = z;	 Catch:{ Error -> 0x00dc }
        r5 = 11;
        r4 = r4[r5];	 Catch:{ Error -> 0x00dc }
        r3 = r3.append(r4);	 Catch:{ Error -> 0x00dc }
        r4 = r2.success;	 Catch:{ Error -> 0x00dc }
        r3 = r3.append(r4);	 Catch:{ Error -> 0x00dc }
        r3 = r3.toString();	 Catch:{ Error -> 0x00dc }
        com.whatsapp.util.Log.i(r3);	 Catch:{ Error -> 0x00dc }
        r3 = r2.success;	 Catch:{ Error -> 0x00dc }
        if (r3 != 0) goto L_0x0108;
    L_0x00af:
        r3 = new java.lang.StringBuilder;	 Catch:{ Error -> 0x00da }
        r3.<init>();	 Catch:{ Error -> 0x00da }
        r4 = z;	 Catch:{ Error -> 0x00da }
        r5 = 5;
        r4 = r4[r5];	 Catch:{ Error -> 0x00da }
        r3 = r3.append(r4);	 Catch:{ Error -> 0x00da }
        r4 = r2.errorMessage;	 Catch:{ Error -> 0x00da }
        r3 = r3.append(r4);	 Catch:{ Error -> 0x00da }
        r3 = r3.toString();	 Catch:{ Error -> 0x00da }
        com.whatsapp.util.Log.e(r3);	 Catch:{ Error -> 0x00da }
        r3 = r2.ioException;	 Catch:{ Error -> 0x00da }
        if (r3 == 0) goto L_0x00de;
    L_0x00ce:
        r2 = new java.io.IOException;	 Catch:{ Error -> 0x00da }
        r3 = z;	 Catch:{ Error -> 0x00da }
        r4 = 9;
        r3 = r3[r4];	 Catch:{ Error -> 0x00da }
        r2.<init>(r3);	 Catch:{ Error -> 0x00da }
        throw r2;	 Catch:{ Error -> 0x00da }
    L_0x00da:
        r2 = move-exception;
        throw r2;
    L_0x00dc:
        r2 = move-exception;
        throw r2;	 Catch:{ Error -> 0x00da }
    L_0x00de:
        r3 = new java.lang.StringBuilder;
        r4 = z;
        r5 = 4;
        r4 = r4[r5];
        r3.<init>(r4);
        r4 = z;
        r5 = 1;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r4 = r2.errorCode;
        r3 = r3.append(r4);
        r4 = new com.whatsapp.at_;
        r2 = r2.errorCode;
        r3 = r3.toString();
        r5 = new java.lang.Throwable;
        r5.<init>();
        r4.<init>(r2, r3, r5);
        throw r4;
    L_0x0108:
        r10.d();
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 10;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r4 = r10.a();
        r2 = r2.append(r4);
        r3 = z;
        r4 = 8;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r4 = r13.length();
        r2 = r2.append(r4);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Mp4Ops.a(java.io.File, java.io.File, java.io.File, java.io.File, long, long, long):void");
    }

    public static File a(File file) {
        ce a = tp.a(z[50]);
        a.e();
        Log.i(z[51]);
        try {
            LibMp4CheckAndRepairResult mp4checkAndRepair = mp4checkAndRepair(file.getAbsolutePath());
            try {
                if (mp4checkAndRepair.success) {
                    try {
                        a.d();
                        Log.i(z[55] + a.a());
                        if (mp4checkAndRepair.repaired) {
                            if (!mp4checkAndRepair.repairFileName.equals(file.getAbsolutePath())) {
                                Log.i(z[49] + mp4checkAndRepair.repairFileName);
                                return new File(mp4checkAndRepair.repairFileName);
                            }
                        }
                        Log.i(z[54]);
                        return null;
                    } catch (Error e) {
                        throw e;
                    } catch (Error e2) {
                        throw e2;
                    }
                }
                if (mp4checkAndRepair.repaired) {
                    new File(mp4checkAndRepair.repairFileName).delete();
                }
                try {
                    Log.e(z[53] + mp4checkAndRepair.errorMessage);
                    if (mp4checkAndRepair.ioException) {
                        throw new IOException(z[48]);
                    }
                    throw new at_(400, z[56] + mp4checkAndRepair.errorCode, new Throwable());
                } catch (Error e22) {
                    throw e22;
                }
            } catch (Error e222) {
                throw e222;
            } catch (Error e2222) {
                throw e2222;
            }
        } catch (Throwable e3) {
            Log.b(z[47], e3);
            throw new at_(400, z[52], new Throwable());
        }
    }
}
