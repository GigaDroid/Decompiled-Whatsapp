package android.support.v4.view;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class ViewParentCompatLollipop {
    private static final String[] z;

    static {
        String[] strArr = new String[28];
        String str = "j\u0005\u0014\u000bMc@\u000f\rlb\u0013\u0014\u0006FT\u0003\u0012\fNk";
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
                        i3 = 96;
                        break;
                    case at.i /*2*/:
                        i3 = 96;
                        break;
                    case at.o /*3*/:
                        i3 = 99;
                        break;
                    default:
                        i3 = 34;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "Q\t\u0005\u0014rf\u0012\u0005\rVD\u000f\r\u0013Cs";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "Q\t\u0005\u0014rf\u0012\u0005\rV'";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "j\u0005\u0014\u000bMc@\u000f\rlb\u0013\u0014\u0006FW\u0012\u0005%Nn\u000e\u0007";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "'\u0004\u000f\u0006Q'\u000e\u000f\u0017\u0002n\r\u0010\u000fGj\u0005\u000e\u0017\u0002n\u000e\u0014\u0006Pa\u0001\u0003\u0006\u0002";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "Q\t\u0005\u0014rf\u0012\u0005\rVD\u000f\r\u0013Cs";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    str = "Q\t\u0005\u0014rf\u0012\u0005\rV'";
                    obj = 6;
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    strArr2 = strArr3;
                    str = "Q\t\u0005\u0014rf\u0012\u0005\rVD\u000f\r\u0013Cs";
                    obj = 7;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "Q\t\u0005\u0014rf\u0012\u0005\rV'";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "'\u0004\u000f\u0006Q'\u000e\u000f\u0017\u0002n\r\u0010\u000fGj\u0005\u000e\u0017\u0002n\u000e\u0014\u0006Pa\u0001\u0003\u0006\u0002";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "j\u0005\u0014\u000bMc@\u000f\rqs\u0001\u0012\u0017lb\u0013\u0014\u0006FT\u0003\u0012\fNk";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "Q\t\u0005\u0014rf\u0012\u0005\rVD\u000f\r\u0013Cs";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "j\u0005\u0014\u000bMc@\u000f\rqs\u000f\u0010-Gt\u0014\u0005\u0007qd\u0012\u000f\u000fN";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "Q\t\u0005\u0014rf\u0012\u0005\rV'";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "'\u0004\u000f\u0006Q'\u000e\u000f\u0017\u0002n\r\u0010\u000fGj\u0005\u000e\u0017\u0002n\u000e\u0014\u0006Pa\u0001\u0003\u0006\u0002";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "j\u0005\u0014\u000bMc@\u000f\rlb\u0013\u0014\u0006FW\u0012\u00050Au\u000f\f\u000f";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "Q\t\u0005\u0014rf\u0012\u0005\rV'";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "Q\t\u0005\u0014rf\u0012\u0005\rVD\u000f\r\u0013Cs";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "'\u0004\u000f\u0006Q'\u000e\u000f\u0017\u0002n\r\u0010\u000fGj\u0005\u000e\u0017\u0002n\u000e\u0014\u0006Pa\u0001\u0003\u0006\u0002";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "Q\t\u0005\u0014rf\u0012\u0005\rVD\u000f\r\u0013Cs";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "Q\t\u0005\u0014rf\u0012\u0005\rV'";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "j\u0005\u0014\u000bMc@\u000f\rlb\u0013\u0014\u0006FA\f\t\rE";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "'\u0004\u000f\u0006Q'\u000e\u000f\u0017\u0002n\r\u0010\u000fGj\u0005\u000e\u0017\u0002n\u000e\u0014\u0006Pa\u0001\u0003\u0006\u0002";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "'\u0004\u000f\u0006Q'\u000e\u000f\u0017\u0002n\r\u0010\u000fGj\u0005\u000e\u0017\u0002n\u000e\u0014\u0006Pa\u0001\u0003\u0006\u0002";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "Q\t\u0005\u0014rf\u0012\u0005\rV'";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "j\u0005\u0014\u000bMc@\u000f\rlb\u0013\u0014\u0006FT\u0003\u0012\fNk!\u0003\u0000Gw\u0014\u0005\u0007";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "Q\t\u0005\u0014rf\u0012\u0005\rVD\u000f\r\u0013Cs";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "'\u0004\u000f\u0006Q'\u000e\u000f\u0017\u0002n\r\u0010\u000fGj\u0005\u000e\u0017\u0002n\u000e\u0014\u0006Pa\u0001\u0003\u0006\u0002";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static void onNestedPreScroll(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
        try {
            viewParent.onNestedPreScroll(view, i, i2, iArr);
        } catch (Throwable e) {
            Log.e(z[18], z[17] + viewParent + z[19] + z[16], e);
        }
    }

    public static void onNestedScrollAccepted(ViewParent viewParent, View view, View view2, int i) {
        try {
            viewParent.onNestedScrollAccepted(view, view2, i);
        } catch (Throwable e) {
            Log.e(z[27], z[25] + viewParent + z[24] + z[26], e);
        }
    }

    public static boolean onNestedPreFling(ViewParent viewParent, View view, float f, float f2) {
        try {
            return viewParent.onNestedPreFling(view, f, f2);
        } catch (Throwable e) {
            Log.e(z[6], z[7] + viewParent + z[5] + z[4], e);
            return false;
        }
    }

    public static boolean onStartNestedScroll(ViewParent viewParent, View view, View view2, int i) {
        try {
            return viewParent.onStartNestedScroll(view, view2, i);
        } catch (Throwable e) {
            Log.e(z[8], z[9] + viewParent + z[10] + z[11], e);
            return false;
        }
    }

    public static void onNestedScroll(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
        try {
            viewParent.onNestedScroll(view, i, i2, i3, i4);
        } catch (Throwable e) {
            Log.e(z[2], z[3] + viewParent + z[1] + z[0], e);
        }
    }

    public static void onStopNestedScroll(ViewParent viewParent, View view) {
        try {
            viewParent.onStopNestedScroll(view);
        } catch (Throwable e) {
            Log.e(z[12], z[14] + viewParent + z[15] + z[13], e);
        }
    }

    public static boolean onNestedFling(ViewParent viewParent, View view, float f, float f2, boolean z) {
        try {
            return viewParent.onNestedFling(view, f, f2, z);
        } catch (Throwable e) {
            Log.e(z[20], z[21] + viewParent + z[23] + z[22], e);
            return false;
        }
    }
}
