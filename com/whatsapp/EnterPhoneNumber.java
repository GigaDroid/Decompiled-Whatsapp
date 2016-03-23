package com.whatsapp;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.support.v7.app.AlertDialog.Builder;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import java.io.IOException;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class EnterPhoneNumber extends VerifyNumber {
    protected static String A;
    protected static int C;
    private static final String[] D;
    protected static String w;
    protected static long y;
    protected static String z;
    protected String B;
    protected at6 v;
    protected ProgressDialog x;

    protected void j() {
        removeDialog(9);
        this.x = null;
    }

    protected void c() {
    }

    static {
        String[] strArr = new String[19];
        String str = "k*b# ~,y(7! \u007f'>a#93<|!u)$k6w$>kis4 a6";
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
                        i4 = 14;
                        break;
                    case at.g /*1*/:
                        i4 = 68;
                        break;
                    case at.i /*2*/:
                        i4 = 22;
                        break;
                    case at.o /*3*/:
                        i4 = 70;
                        break;
                    default:
                        i4 = 82;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    i2 = 2;
                    strArr2 = strArr3;
                    str = "=u&\u007fk;t&vb>t&vb";
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    i2 = 3;
                    str = "|!q/!z!dk\"f+x#a";
                    i = 2;
                    strArr2 = strArr3;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    str = "k*b# ~,y(7! \u007f'>a#9$3`";
                    i = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "\u0004N";
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "|!q/!z!dk\"f+x#`";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    str = "k*b# ~,y(7!1x47m+`# o&z#}~+e5;l(sk&o&z#&";
                    i = 6;
                    i2 = 7;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    strArr2 = strArr3;
                    str = "k*b# ~,y(7!'ui0o ;*7`#b.rm'+";
                    i = 7;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "k*b# ~,y(7!*c+}k6d) !!{6&wdu%o";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "k*b# ~,y(7!'ui0o ;(3c!6";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = ".4~)<ky";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "R\u0000";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "k*b# ~,y(7!*c+}k6d) !(s(5z,6%13";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    str = "k*b# ~,y(7!*c+}k6d) !-x03b-rf1my";
                    i = 13;
                    i2 = 14;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    strArr2 = strArr3;
                    str = ".6s5o";
                    i = 14;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "R\u0000";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i2] = str;
                    i2 = 17;
                    str = "k*b# ~,y(7!!d4=|db4;c\bs'6g*q\u001c7|+6) .(y)9{4U)'`0d?\u001co)sf4|+{f\u0011a1x2 w\u0014~)<k\rx =.\rY\u0003*m!f2;a*";
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    str = ".4~{";
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i2] = str;
                    D = strArr3;
                    w = null;
                    A = null;
                    C = 7;
                    z = null;
                    return;
                default:
                    strArr2[i2] = str;
                    str = "?q#sg<u.wa;";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public static int a(String str, String str2) {
        try {
            if (str.length() < 1 || str.length() > 3) {
                Log.w(D[8] + str);
                return 2;
            } else if (u0.c(str) == null) {
                Log.w(D[10] + str);
                return 3;
            } else {
                if (str2 != null) {
                    try {
                        if (str2.length() != 0) {
                            if (str2.replaceAll(D[12], "").length() != 0) {
                                int parseInt = Integer.parseInt(str);
                                String a = u0.a(parseInt, str2.replaceAll(D[16], ""));
                                int a2 = u0.a(parseInt, a.length());
                                if (a2 != 0) {
                                    try {
                                        Log.w(D[14] + parseInt + D[11] + a + D[15] + a2);
                                        return a2 < 0 ? 5 : 6;
                                    } catch (IOException e) {
                                        throw e;
                                    } catch (IOException e2) {
                                        throw e2;
                                    }
                                } else if (str.length() + a.length() <= 15 && str.length() + a.length() >= 8) {
                                    return 1;
                                } else {
                                    Log.w(D[13] + str + D[18] + a);
                                    return 7;
                                }
                            }
                        }
                    } catch (IOException e22) {
                        throw e22;
                    } catch (IOException e222) {
                        throw e222;
                    }
                }
                Log.w(D[9] + str);
                return 4;
            }
        } catch (IOException e2222) {
            throw e2222;
        } catch (IOException e22222) {
            throw e22222;
        } catch (IOException e222222) {
            Log.e(D[17] + e222222);
            return 7;
        }
    }

    protected void c(boolean z) {
    }

    protected Dialog onCreateDialog(int i) {
        String str;
        switch (i) {
            case Y.l /*9*/:
                Dialog progressDialog = new ProgressDialog(this);
                progressDialog.setMessage(getString(2131231749));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                this.x = progressDialog;
                return progressDialog;
            case arj.Toolbar_logoDescription /*22*/:
                Log.w(D[0]);
                CharSequence string = getString(2131231794);
                str = D[6];
                if (D[1].equals(VerifyNumber.j()) && D[2].equals(App.W.getSubscriberId())) {
                    string = string + D[5] + getString(2131231132);
                    Log.i(D[7]);
                    str = D[3];
                }
                return new Builder(this).setMessage(string).setPositiveButton(2131231750, new ls(this, str)).setNegativeButton(2131230884, new au8(this)).create();
            case arj.Toolbar_titleTextColor /*23*/:
                Log.w(D[4]);
                str = aam.a(VerifyNumber.b(w, A));
                return new Builder(this).setMessage(getString(2131231796) + "\n" + str + "\n" + getString(2131231795)).setPositiveButton(2131230884, new qq(this)).setNeutralButton(2131231797, new tv(this, str)).create();
            default:
                return super.onCreateDialog(i);
        }
    }
}
