package de.greenrobot.event.util;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import de.greenrobot.event.h;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class c {
    protected static final String a;
    public static final String b;
    protected static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static g g;
    public static final String h;
    private static final String[] z;

    static {
        String[] strArr = new String[11];
        String str = "@F\u0015PaAFUE|FLO\u0019vRFUCqQP\u0015RaVLISzEOTP=BJU^`L|ZQgAQdSzEOTP";
        Object obj = 10;
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
                        i3 = 36;
                        break;
                    case at.g /*1*/:
                        i3 = 35;
                        break;
                    case at.i /*2*/:
                        i3 = 59;
                        break;
                    case at.o /*3*/:
                        i3 = 55;
                        break;
                    default:
                        i3 = 19;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\npSRaHLX\\CVF]RaAMXRRGWRAzPZ";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\npSRaHLX\\RGWRAzPZ";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\npSRaHLX\\_MPOvpPJM^g]";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "mOWRtEO\u001bVpPJM^g]\u0003L^gLLNC3BQZP~AMO\u0017`QSKXaP\r\u001brzPK^E3QP^\u0017RJGIXz@\u0003\b\u0019#\u000f\u0003TE3EM_E|MG\u0015DfTSTEg\nU\u000f\u0019rTS\u0015qaEDVR}PbXCzRJON=";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "mOWRtEO\u001bVpPJM^g]\u0003ONcA\u0019\u001b";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "GLV\u0019rGWRX}FBID{AQWXpO\rZGc";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "tO^V`A\u0003NDv\u0004pSRaHLX\\UVB\\ZvJWzTgMURCj\n\u0003r[\u007fADZ[3E@O^eMWB\r3";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "aQIXa\u0004GRV\u007fKD\u001bZrJB\\Ra\u0004Q^TvMU^S3A[XRcPJTY";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "}LN\u0017~QPO\u0017`AW\u001bC{A\u0003HCrPJX\u0017uE@OXa]\u0003]^vHG\u001bC|\u0004@TYuMDNEv\u0004FIE|V\u0003_^rHL\\D3BLI\u0017jKVI\u0017rTS\u0015";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                case Y.t /*10*/:
                    f = str;
                    str = "@F\u0015PaAFUE|FLO\u0019vRFUCqQP\u0015RaVLISzEOTP=IFHDrCF";
                    obj = 11;
                    break;
                case Y.j /*11*/:
                    d = str;
                    str = "@F\u0015PaAFUE|FLO\u0019vRFUCqQP\u0015RaVLISzEOTP=AU^Yg{WBGv{LUhpHLHR";
                    obj = 12;
                    break;
                case Y.p /*12*/:
                    e = str;
                    str = "@F\u0015PaAFUE|FLO\u0019vRFUCqQP\u0015RaVLISzEOTP=M@TYLMG";
                    obj = 13;
                    break;
                case Y.q /*13*/:
                    h = str;
                    str = "@F\u0015PaAFUE|FLO\u0019vRFUCqQP\u0015RaVLIhwMBWXt";
                    obj = 14;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    a = str;
                    str = "@F\u0015PaAFUE|FLO\u0019vRFUCqQP\u0015RaVLISzEOTP=PJO[v";
                    obj = 15;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    b = str;
                    str = "@F\u0015PaAFUE|FLO\u0019vRFUCqQP\u0015RaVLIhwMBWXt{NZYrCFI";
                    obj = 16;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    c = str;
                    str = "EM_E|MG\u0015DfTSTEg\nU\u000f\u0019rTS\u0015qaEDVR}PbXCzRJON";
                    obj = -1;
                    break;
                default:
                    strArr2[i] = str;
                    str = "EM_E|MG\u0015VcT\rzTgMURCj";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected static void a(f fVar) {
        if (g.a.g) {
            String str = g.a.h;
            if (str == null) {
                str = h.q;
            }
            Log.i(str, z[9], fVar.c);
        }
    }

    public static void a(Activity activity, boolean z) {
        a(activity, z, null);
    }

    static boolean b(Object obj, f fVar) {
        return a(obj, fVar);
    }

    private static boolean a(Activity activity) {
        boolean z = g.b;
        Class superclass = activity.getClass().getSuperclass();
        int i = 0;
        while (superclass != null) {
            String name = superclass.getName();
            if (name.equals(z[0])) {
                if (!z) {
                    return true;
                }
                i = true;
            }
            try {
                if (name.startsWith(z[7])) {
                    if (!name.endsWith(z[3])) {
                        try {
                            if (!name.endsWith(z[4])) {
                                try {
                                    if (name.endsWith(z[2])) {
                                    }
                                } catch (RuntimeException e) {
                                    throw e;
                                }
                            }
                        } catch (RuntimeException e2) {
                            throw e2;
                        }
                    }
                    throw new RuntimeException(z[8] + name);
                }
                try {
                    if (!name.equals(z[1])) {
                        superclass = superclass.getSuperclass();
                        if (z) {
                        }
                    } else if (VERSION.SDK_INT < 11) {
                        throw new RuntimeException(z[5]);
                    }
                    return r1;
                } catch (RuntimeException e22) {
                    throw e22;
                } catch (RuntimeException e222) {
                    throw e222;
                }
            } catch (RuntimeException e2222) {
                throw e2222;
            } catch (RuntimeException e22222) {
                throw e22222;
            }
        }
        throw new RuntimeException(z[6] + activity.getClass());
    }

    public static void a(Activity activity, boolean z, Bundle bundle) {
        a(activity, activity.getClass(), z, bundle);
    }

    public static void a(Activity activity, Object obj, boolean z, Bundle bundle) {
        try {
            if (g == null) {
                throw new RuntimeException(z[10]);
            }
            try {
                if (a(activity)) {
                    ErrorDialogManager$SupportManagerFragment.a(activity, obj, z, bundle);
                    if (!g.b) {
                        return;
                    }
                }
                ErrorDialogManager$HoneycombManagerFragment.a(activity, obj, z, bundle);
            } catch (RuntimeException e) {
                throw e;
            } catch (RuntimeException e2) {
                throw e2;
            }
        } catch (RuntimeException e22) {
            throw e22;
        }
    }

    private static boolean a(Object obj, f fVar) {
        if (fVar != null) {
            Object a = fVar.a();
            if (a != null) {
                try {
                    if (!a.equals(obj)) {
                        return false;
                    }
                } catch (RuntimeException e) {
                    throw e;
                }
            }
        }
        return true;
    }

    public static void b(Activity activity) {
        a(activity, false, null);
    }
}
