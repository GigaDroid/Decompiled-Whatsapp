package com.whatsapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Messenger;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.whatsapp.adm.ADMMessageHandler;
import com.whatsapp.contact.n;
import com.whatsapp.fieldstats.ap;
import com.whatsapp.fieldstats.bg;
import com.whatsapp.fieldstats.c2;
import com.whatsapp.gcm.RegistrationIntentService;
import com.whatsapp.jobqueue.job.ContactSyncJob;
import com.whatsapp.messaging.m;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.protocol.b1;
import com.whatsapp.protocol.c3;
import com.whatsapp.protocol.co;
import com.whatsapp.protocol.ct;
import com.whatsapp.util.Log;
import com.whatsapp.util.bq;
import de.greenrobot.event.h;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.aG;
import org.whispersystems.at;
import org.whispersystems.aw;
import org.whispersystems.az;
import org.whispersystems.b;
import org.whispersystems.bI;
import org.whispersystems.bX;
import org.whispersystems.i;
import org.whispersystems.j;
import org.whispersystems.w;

final class adn implements m {
    private static final String[] z;
    private final App a;
    private final awc b;
    private final Context c;

    static {
        String[] strArr = new String[89];
        String str = "\nzE]2\u001fn";
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
                        i3 = arj.Theme_seekBarStyle;
                        break;
                    case at.g /*1*/:
                        i3 = 2;
                        break;
                    case at.i /*2*/:
                        i3 = 42;
                        break;
                    case at.o /*3*/:
                        i3 = 49;
                        break;
                    default:
                        i3 = 93;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "P\"EC4\fkDP1&gYB<\fgaT$V";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u0003cDU1\u000eMDu4\u0019vS\u001d}\bcF]}\u0004lyT3\u000fEOE\u001a\u0019m_A.";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "\fpED-\u0018";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\nrZ\u001e2\u0005fCC)\u0012-ZC8\u001dgDEp\u000f`\u0007P>\bgYBr\u0018iCA";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u001bcYB*\u0004pN";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\nrZ\u001e%\u0006rZ\u001e/\u000ea\\\u001e2\u0005r]B8\u001f\"@P?\tgX\u000b";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\nrZ\u001e%\u0006rZ\u001e/\u000ea\\\u001e2\u0005r]B8\u001f\"OC/\u0004p";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0006qMn4\u000f";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\bcZP?\u0002nCE$KlEE4\rkIP)\u0002mD\u000b}";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\nrZ\u001e%\u0006rZ\u001e/\u000ea\\\u001e5\nlN]84wDP+\nkFP?\u0007g\n";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "KnKB)Q";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\u001bkIE(\u0019g";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u001bkIE(\u0019g";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\nrZ\u001e%\u0006rZ\u001e/\u000ea\\\u001e>\u0007kO_)(mDW4\fGXC2\u0019-";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "%m^r<\u0007a_]<\u001fgN";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\nlNC2\u0002f\u0004C8\u0018m_C>\u000e8\u0005\u001e>\u0004o\u0004F5\nvYP-\u001b-\u0018\u0000nZ3\u001c\u0004lS:";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "P\"XT>\u0002rCT3\u001fAED3\u001f?";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\u0006gYB<\fg\nC8\bgCG8\u000f\"HH}\u0018gXG8\u0019\"CV3\u0004pOUfKiOH`";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "P\"^X0\u000eq^P0\u001b?";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "P\"ZP/\u001fkIX-\nl^\f";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "\u001bjKB5";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "P\"YT/\u001dgXa<\u0019vCR4\u001bcDE\u0015\nqB\f";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "\nrZ\u001e%\u0006rZ\u001e/\u000ea\\\u001e0\u000eqYP:\u000e\"";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "Z7\u001f\u0004m[2\u001b\u0003lYBY\u001f*\u0003c^B<\u001br\u0004_8\u001f";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "\nzE]2\u001fn";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "\nzE]2\u001fn";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "\nzE]2\u001fn";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "\nrZ\u001e%\u0006rZ\u001e/\u000ea\\\u001e:\u000ev\u0007R6DdC]8KkY\u00113\u001enF";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "DdKX1\u000ef";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "\nrZ\u001e%\u0006rZ\u001e/\u000ea\\\u001e5\nlN]84rX^;\u0002nOn-\u0003m^^\u0002\u0007mYEr\u0001kN\u0011";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "\u001bkIE(\u0019g";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "\nrZ\u001e%\u0006rZ\u001e/\u000ea\\\u001e0\u000eqYP:\u000egXC2\u0019-ZY<\u0018jGX.\u0006c^R5KdED3\u000f\"GP)\bj\nW2\u0019\"MC2\u001er\nA<\u0019vCR4\u001bcDE.KdEC}";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "Kc^\u0011-\u0003cYY}";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "\nrZ\u001e%\u0006rZ\u001e/\u000ea\\\u001e0\u000eqYP:\u000egXC2\u0019-ZY<\u0018jGX.\u0006c^R5KcF]}\u0006gGS8\u0019q\nR<\u001bcH]8KmL\u0011/\u000eaOX+\u0002lM\u00118\u0005aXH-\u001fgN\u0011:\u0019m_A}\u0006gYB<\fg\u0006\u0011.\u000elNX3\f\"I]4\u000el^\u0011lF3\nTo\u000e\"LP3\u0004w^";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "\nrZ\u001e%\u0006rZ\u001e/\u000ea\\\u001e0\u000eqYP:\u000egXC2\u0019-ZY<\u0018jGX.\u0006c^R5KwDP?\u0007g\nE2KaE\\-\u001evO\u0011:\u0019m_A}\u001bcXE4\bkZP3\u001fq\nW2\u0019\"";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "\nrZ\u001e%\u0006rZ\u001e/\u000ea\\\u001e0\u000eqYP:\u000egXC2\u0019-H^(\u0005aO\u0011(\u0005cH]8KvE\u0011;\u0002lN\u00110\u000eqYP:\u000e\"";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "\nrZ\u001e%\u0006rZ\u001e/\u000ea\\\u001e0\u000eqYP:\u000egXC2\u0019-ZY<\u0018jGX.\u0006c^R5KwDP?\u0007g\nE2KdC_9KoOB.\neO\u0011";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "Kc^\u0011-\u0003cYY}";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "\nzE]2\u001fn\nV2\u001f\"XT)\u0019{\nC8\u001awOB)K";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "KuCE5K";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    str = "KdEC}";
                    obj = 41;
                    i = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    strArr2 = strArr3;
                    str = "\nzE]2\u001fn\nB6\u0002rZX3\f\"XT)\u0019{\nW2\u0019\"";
                    obj = 42;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "KmXX:\u0002lK]1\u0012\"YT3\u001f\"KE}";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "P\"EC4\fkDP1&gYB<\fgaT$V";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "\nzE]2\u001fn\nV2\u001f\"K\u0011.\u000ep\\T/KgDR}\u001d0\nD3\u0000lEF3KvKV.KpOR8\u0002r^\n}\u0018vK_'\nIOH`";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "\u000elIC$\u001bvu]2\bc^X2\u0005";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "\u000elIC$\u001bvuD/\u0007";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    str = "\u000elIC$\u001bvuR2\u0005vKR)";
                    obj = 48;
                    i = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    strArr2 = strArr3;
                    str = "\u000fm\n_2\u001f\"A_2\u001c\"]Y<\u001f\"^^}\u000fm\nF4\u001fj\nE5\u000eqO\u0011(\u0005iD^*\u0005\"^P:\u00189\nB)\nlPP\u0016\u000e{\u0017";
                    obj = 49;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "P\"__6\u0005m]_\t\neY\f";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "P\"EC4\fkDP1&gYB<\fgaT$V";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "P\"__6\u0005m]_\t\neY\f";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "\u000elIC$\u001bvuX0\neO";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "\u000elIC$\u001bvuP(\u000fkE";
                    obj = 54;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "\u000fmID0\u000el^";
                    obj = 55;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "\u000elIC$\u001bvuG4\u000fgE";
                    obj = 56;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "KmXX:\u0002lK]1\u0012\"YT3\u001f\"KE}";
                    obj = 57;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "KuCE5K";
                    obj = 58;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "\nzE]2\u001fn\nV2\u001f\"K\u0011.\u000ep\\T/KpO[8\bv\nW2\u0019\"XT)\u0019{\nC8\u001awOB)K";
                    obj = 59;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "KdEC}";
                    obj = 60;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "\nzE]2\u001fn\nV2\u001f\"K\u0011.\u000ep\\T/KgDR}\u001d3\nC8\bgCA)P\"YE<\u0005xKz8\u0012?";
                    obj = 61;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "P\"EC4\fkDP1&gYB<\fgaT$V";
                    obj = 62;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "\nrZ\u001e%\u0006rZ\u001e/\u000ea\\\u001e5\nlN]84wDB(\tqIC4\tg";
                    obj = 63;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "\nrZ\u001e%\u0006rZ\u001e/\u000ea\\\u001e0\u000eqYP:\u000e-YT/\u001dgXT/\u0019mXW2\u0019vKC:\u000ev\u0005B6\u0002rXT(\u001bnEP9P\"KR)\u0002tO\u007f8\u001fuEC6?{ZT`";
                    obj = 64;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "\nrZ\u001e%\u0006rZ\u001e/\u000ea\\\u001e0\u000eqYP:\u000e-YT/\u001dgXT/\u0019mXW2\u0019vKC:\u000ev\u0005F/\u0004lME$\u001bg";
                    obj = 65;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "P\"GT.\u0018cMTs\u0004pCV4\u0005?";
                    obj = 66;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "P\"GT.\u0018cMTs\u0006gNX<4qCK8V";
                    obj = 67;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    strArr2[i] = str;
                    i = 69;
                    str = "\tpEP9\bcYE";
                    obj = 68;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    strArr2[i] = str;
                    i = 70;
                    str = "\nrZ\u001e%\u0006rZ\u001e/\u000ea\\\u001e0\u000eqYP:\u000e-YT/\u001dgXT/\u0019mXW2\u0019vKC:\u000ev\u0005W4\u0007gGX.\u0018kDV";
                    obj = 69;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeight /*69*/:
                    strArr2[i] = str;
                    i = 71;
                    str = "\nrZ\u001e%\u0006rZ\u001e/\u000ea\\\u001e0\u000eqYP:\u000e-YT/\u001dgXT/\u0019mXW2\u0019vKC:\u000ev\u0005W4\u0007gXT-\u0007cIT9P\"GT9\u0002cnP)\n,LX1\u000eQCK8V";
                    obj = 70;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightSmall /*70*/:
                    strArr2[i] = str;
                    i = 72;
                    str = "\nrZ\u001e%\u0006rZ\u001e/\u000ea\\\u001e0\u000eqYP:\u000e-YT/\u001dgXT/\u0019mXW2\u0019vKC:\u000ev\u0005\\8\u0018qKV8\u0006kYB4\u0005e";
                    obj = 71;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightLarge /*71*/:
                    strArr2[i] = str;
                    i = 73;
                    str = "P\"GT9\u0002cnP)\n,LX1\u000e,FT3\fvB\f";
                    obj = 72;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingLeft /*72*/:
                    strArr2[i] = str;
                    i = 74;
                    str = "\nrZ\u001e%\u0006rZ\u001e/\u000ea\\\u001e0\u000eqYP:\u000e-YT/\u001dgXT/\u0019mXW2\u0019vKC:\u000ev\n";
                    obj = 73;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingRight /*73*/:
                    strArr2[i] = str;
                    i = 75;
                    str = "P\"GT.\u0018cMTs\u0006gNX<4uKn)\u0012rO\f";
                    obj = 74;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropDownListViewStyle /*74*/:
                    strArr2[i] = str;
                    i = 76;
                    str = "KrFP$\u000efu[4\u000f8";
                    obj = 75;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPopupWindowStyle /*75*/:
                    strArr2[i] = str;
                    i = 77;
                    str = "\nrZ\u001e%\u0006rZ\u001e/\u000ea\\\u001e0\u000eqYP:\u000e-YT/\u001dgXT/\u0019mXW2\u0019vKC:\u000ev\u0005S<\u000foOU4\nfKE<P\"GT9\u0002cnP)\n?";
                    obj = 76;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItem /*76*/:
                    strArr2[i] = str;
                    i = 78;
                    str = "\bcZP?\u0002nCE$KpOP9KgXC2\u00198\n";
                    obj = 77;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItemSmall /*77*/:
                    strArr2[i] = str;
                    i = 79;
                    str = "\nzE]2\u001fn";
                    obj = 78;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelBackground /*78*/:
                    strArr2[i] = str;
                    i = 80;
                    str = "\nrZ\u001e%\u0006rZ\u001e/\u000ea\\\u001e5\nlN]84c\\P4\u0007cH]8K";
                    obj = 79;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListWidth /*79*/:
                    strArr2[i] = str;
                    i = 81;
                    str = "\bcZP?\u0002nCE$KgXC2\u0019\"XT.\u001bmDB8Q\"";
                    obj = 80;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListTheme /*80*/:
                    strArr2[i] = str;
                    i = 82;
                    str = "\bmDE<\bvY";
                    obj = 81;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listChoiceBackgroundIndicator /*81*/:
                    strArr2[i] = str;
                    i = 83;
                    str = "\u0006kYB4\u0005e\n\\8\u000fkK\u00119\nvK\u0011;\u0004p\n\\8\u000fkK\u00110\u000eqYP:\u000e9\nB)\nlPP\u0016\u000e{\u0017";
                    obj = 82;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimary /*82*/:
                    strArr2[i] = str;
                    i = 84;
                    str = "P\"AT$V";
                    obj = 83;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimaryDark /*83*/:
                    strArr2[i] = str;
                    i = 85;
                    str = "P\"AT$V";
                    obj = 84;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorAccent /*84*/:
                    strArr2[i] = str;
                    i = 86;
                    str = "P\"AT$V";
                    obj = 85;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlNormal /*85*/:
                    strArr2[i] = str;
                    i = 87;
                    str = "\u0006gNX<KpOE/\u0012\"D^)\u0002dCR<\u001fkE_}\u0019gIT4\u001dgN\n}\u0018vK_'\nIOH`";
                    obj = 86;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlActivated /*86*/:
                    strArr2[i] = str;
                    i = 88;
                    str = "\u0006gNX<Kc_E2KfEF3\u0007mKU}\u0019g\u0007T3\n`FT9P\"YE<\u0005xKz8\u0012?";
                    obj = 87;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlHighlight /*87*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\nzE]2\u001fn\nV2\u001f\"K\u0011.\u000ep\\T/KrFP4\u0005vOI)KpOR8\u0002r^\n}\u0018vK_'\nIOH`";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(String str, String str2, int i) {
        App.a1.a(str, str2, i);
        App.i(str);
    }

    public void b(Hashtable hashtable) {
        SettingsPrivacy.a(hashtable);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.protocol.co r10) {
        /*
        r9 = this;
        r8 = 32;
        r1 = 1;
        r2 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = r10.k;
        r4 = r0.c;
        r5 = com.whatsapp.qa.d(r4);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r6 = z;
        r7 = 24;
        r6 = r6[r7];
        r0 = r0.append(r6);
        r6 = r10.k;
        r6 = r6.b;
        r0 = r0.append(r6);
        r0 = r0.append(r8);
        r6 = r10.b;
        r0 = r0.append(r6);
        r0 = r0.append(r8);
        r6 = java.lang.System.currentTimeMillis();
        r0 = r0.append(r6);
        r0 = r0.append(r8);
        r6 = r10.C;
        r0 = r0.append(r6);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = z;
        r6 = 25;
        r0 = r0[r6];
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x005e;
    L_0x0058:
        r6 = java.lang.System.currentTimeMillis();
        r10.b = r6;
    L_0x005e:
        com.whatsapp.App.b(r10);
        r0 = de.greenrobot.event.h.b();
        r6 = com.whatsapp.ana.class;
        r0 = r0.b(r6);
        r0 = (com.whatsapp.ana) r0;
        r6 = r10.c;
        r6 = com.whatsapp.App.b(r6);
        if (r6 == 0) goto L_0x0080;
    L_0x0075:
        r6 = r10.M;
        if (r6 == 0) goto L_0x0080;
    L_0x0079:
        r6 = com.whatsapp.App.aK;
        r6.h(r10);
        if (r3 == 0) goto L_0x00c3;
    L_0x0080:
        r6 = r10.c;
        if (r6 != 0) goto L_0x0090;
    L_0x0084:
        r6 = r10.f();
        if (r6 == 0) goto L_0x0090;
    L_0x008a:
        r6 = android.text.TextUtils.isEmpty(r4);
        if (r6 == 0) goto L_0x00b9;
    L_0x0090:
        r6 = com.whatsapp.Conversation.F();
        r7 = r6.a();
        if (r7 == 0) goto L_0x00b2;
    L_0x009a:
        r7 = r0.a;
        if (r7 != 0) goto L_0x00b2;
    L_0x009e:
        r6 = r6.b();
        r6 = r6.ae;
        r4 = r6.equals(r4);
        if (r4 == 0) goto L_0x00b2;
    L_0x00aa:
        r4 = r5.d;
        if (r4 > 0) goto L_0x00b2;
    L_0x00ae:
        r4 = 13;
        r10.d = r4;
    L_0x00b2:
        r4 = com.whatsapp.App.aK;
        r4.a(r10);
        if (r3 == 0) goto L_0x00c3;
    L_0x00b9:
        r3 = com.whatsapp.awc.e;
        r4 = new com.whatsapp.dt;
        r4.<init>(r9, r10, r0, r5);
        r3.execute(r4);
    L_0x00c3:
        r3 = com.whatsapp.u1.a();
        r0 = r10.j;
        if (r0 == 0) goto L_0x0133;
    L_0x00cb:
        r0 = r1;
    L_0x00cc:
        r3.a(r0);
        r0 = r5.m;
        if (r0 != 0) goto L_0x00dd;
    L_0x00d3:
        r5.m = r1;
        r0 = new com.whatsapp.ae3;
        r0.<init>(r9, r5);
        com.whatsapp.util.bq.a(r0);
    L_0x00dd:
        r0 = r5.c();
        if (r0 == 0) goto L_0x00fe;
    L_0x00e3:
        r0 = r5.p;
        r0 = com.whatsapp.qm.h(r0);
        if (r0 != 0) goto L_0x00fe;
    L_0x00eb:
        r0 = r5.p;
        r3 = com.whatsapp.App.as;
        r3 = r3.e();
        r3 = r3.p;
        com.whatsapp.qm.d(r0, r3);
        r0 = r5.p;
        r3 = 2;
        com.whatsapp.App.a(r0, r2, r3);
    L_0x00fe:
        r0 = r10.c;
        r3 = 5;
        if (r0 != r3) goto L_0x0119;
    L_0x0103:
        r0 = r10.a();
        if (r0 != 0) goto L_0x0119;
    L_0x0109:
        r0 = r10.Q;
        r0 = (com.whatsapp.MediaData) r0;
        r0.transferring = r1;
        r0 = new com.whatsapp.xn;
        r0.<init>(r9, r10);
        r1 = new java.lang.Void[r2];
        com.whatsapp.util.bq.a(r0, r1);
    L_0x0119:
        r0 = de.greenrobot.event.h.b();
        r1 = com.whatsapp.amm.class;
        r0 = r0.b(r1);
        r0 = (com.whatsapp.amm) r0;
        r0 = r0.a();
        r2 = r10.b;
        r0 = r0 - r2;
        com.whatsapp.wo.a(r10, r0);
        com.whatsapp.amd.b(r10);
        return;
    L_0x0133:
        r0 = r2;
        goto L_0x00cc;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.adn.a(com.whatsapp.protocol.co):void");
    }

    public void a(String str, String str2, String str3) {
        App.b(str, str2, str3);
    }

    public void b(String str, int i) {
        c2 c2Var;
        Long a = App.Q.a(str);
        if (a != null) {
            Context z = App.z();
            if (i == 401) {
                c2Var = c2.FAILED_ACCESS_DENIED;
            } else {
                c2Var = c2.FAILED_SERVER_ERROR;
            }
            nf.a(z, c2Var, bg.FULL, SystemClock.elapsedRealtime() - a.longValue(), 0);
        }
        a = App.a2.a(str);
        if (a != null) {
            z = App.z();
            if (i == 401) {
                c2Var = c2.FAILED_ACCESS_DENIED;
            } else {
                c2Var = c2.FAILED_SERVER_ERROR;
            }
            nf.a(z, c2Var, bg.THUMB, SystemClock.elapsedRealtime() - a.longValue(), 0);
        }
        App.d(str, i);
    }

    static Context a(adn com_whatsapp_adn) {
        return com_whatsapp_adn.c;
    }

    static void b(adn com_whatsapp_adn, ap apVar, j jVar, az azVar, co coVar, b1 b1Var) {
        com_whatsapp_adn.a(apVar, jVar, azVar, coVar, b1Var);
    }

    public void b(String str) {
        aup.d(str);
    }

    public void b(int i) {
        Log.e(z[15] + i);
    }

    public void a(c3 c3Var) {
    }

    private void a(ap apVar, j jVar, az azVar, co coVar, b1 b1Var) {
        try {
            new i(this.b, this.b, this.b.i(), this.b, jVar).a(new w(b1Var.c), azVar);
        } catch (Throwable e) {
            Log.c(z[27], e);
            coVar.a(true);
            apVar.g = Double.valueOf(0.0d);
            apVar.e = Double.valueOf((double) com.whatsapp.fieldstats.j.PRE_KEY_MESSAGE_MISSING_PRE_KEY.getCode());
        } catch (Throwable e2) {
            Log.c(z[26], e2);
            apVar.g = Double.valueOf(0.0d);
            apVar.e = Double.valueOf((double) com.whatsapp.fieldstats.j.UNTRUSTED_IDENTITY.getCode());
        } catch (Throwable e22) {
            Log.c(z[28], e22);
            coVar.a(true);
            apVar.g = Double.valueOf(0.0d);
            apVar.e = Double.valueOf((double) com.whatsapp.fieldstats.j.PRE_KEY_MESSAGE_INVALID_KEY.getCode());
        }
    }

    public void a(c3 c3Var, String str) {
        Log.i(z[74] + c3Var.b + z[76] + str);
        if (c3Var.c.endsWith(z[69]) && str != null) {
            c3Var = new c3(str, c3Var.a, c3Var.b);
        }
        this.a.aV.remove(c3Var);
        co a = App.aK.a(c3Var);
        if (a == null) {
            Log.i(z[72]);
        } else if (App.b(a.c)) {
            MediaData mediaData;
            if (a.Q == null || !(a.Q instanceof MediaData)) {
                mediaData = null;
            } else {
                mediaData = new MediaData((MediaData) a.Q);
            }
            if (mediaData == null || mediaData.file == null) {
                Log.e(z[77] + mediaData);
            } else if (!mediaData.file.exists()) {
                Log.i(z[70]);
            } else if (mediaData.fileSize == 0 || mediaData.fileSize == mediaData.file.length()) {
                int az = App.az();
                if (App.a(az, a) || !(a.c != (byte) 1 || az == 0 || az == 3)) {
                    co coVar = new co(a);
                    coVar.Q = mediaData;
                    coVar.q = null;
                    mediaData.uploader = new sd(this, coVar, true, false, coVar);
                    mediaData.autodownloadRetryEnabled = true;
                    mediaData.uploader.d();
                    return;
                }
                Log.i(z[65] + az + z[75] + a.c + z[67] + a.r + z[68] + a.z);
            } else {
                Log.i(z[71] + mediaData.fileSize + z[73] + mediaData.file.length());
            }
        } else {
            Log.e(z[66]);
        }
    }

    public void c(String str, String str2) {
        App.a(new a2o(this, str2, str));
    }

    public void a(String str, String str2, long j) {
        Log.i(z[11] + str + ' ' + str2 + z[12] + j);
        qa.d(str);
        String a = App.a1.a(str, j);
        App.a1.a(str, true);
        if (a != null) {
            App.i(a);
        }
        App.i(str);
    }

    public void a(c3 c3Var, String str, int i, long j) {
        int i2 = 5;
        if (i == 5 || i == 13 || i == 8) {
            if (i != 13 || App.C(c3Var.c)) {
                i2 = i;
            }
            App.aK.a(c3Var, str, i2, j);
            this.a.a(c3Var);
            if (DialogToastActivity.f) {
                i = i2;
            } else {
                return;
            }
        }
        App.aK.b(c3Var, i);
    }

    public void b(String str, String str2, String str3) {
        l5 f = App.as.f(str3);
        if (f != null) {
            App.a(new sk(this, f));
            if (!App.a1.a(str3)) {
                App.a1.a(str3, 0);
                App.i(str3);
            }
            a4r F = Conversation.F();
            if (F.a() && App.h != 3 && f.p.equals(F.b().ae)) {
                App.a(f);
            }
            App.a(f.p, f.r, new Messenger(App.aT));
            App.a(new String[]{f.p});
        }
        App.c(str2, str, z[82]);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.protocol.ct r8, com.whatsapp.protocol.c3 r9, int[] r10) {
        /*
        r7 = this;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = z;
        r3 = 46;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r0 = r0.append(r8);
        r2 = z;
        r3 = 52;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r0 = r0.append(r9);
        r2 = z;
        r3 = 51;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r2 = java.util.Arrays.toString(r10);
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r2 = new java.util.Vector;
        r0 = 1;
        r2.<init>(r0);
        if (r10 == 0) goto L_0x0051;
    L_0x0044:
        r3 = r10.length;
        r0 = 0;
    L_0x0046:
        if (r0 >= r3) goto L_0x0051;
    L_0x0048:
        r4 = r10[r0];
        switch(r4) {
            case 3: goto L_0x00cd;
            case 4: goto L_0x00e3;
            case 5: goto L_0x00b7;
            case 6: goto L_0x00a1;
            case 7: goto L_0x00f9;
            case 8: goto L_0x010f;
            case 9: goto L_0x0125;
            default: goto L_0x004d;
        };
    L_0x004d:
        r0 = r0 + 1;
        if (r1 == 0) goto L_0x0046;
    L_0x0051:
        r0 = r2.isEmpty();
        if (r0 != 0) goto L_0x0063;
    L_0x0057:
        r0 = com.whatsapp.awc.e;
        r3 = new com.whatsapp.qh;
        r3.<init>(r7, r9, r8, r2);
        r0.execute(r3);
        if (r1 == 0) goto L_0x00a0;
    L_0x0063:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 50;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r8);
        r1 = z;
        r2 = 45;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r9);
        r1 = z;
        r2 = 53;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = java.util.Arrays.toString(r10);
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        com.whatsapp.App.b(r8);
    L_0x00a0:
        return;
    L_0x00a1:
        r4 = new com.whatsapp.protocol.ce;
        r5 = z;
        r6 = 48;
        r5 = r5[r6];
        r6 = com.whatsapp.uq.NONE;
        r6 = r6.getText();
        r4.<init>(r5, r6);
        r2.add(r4);
        if (r1 == 0) goto L_0x004d;
    L_0x00b7:
        r4 = new com.whatsapp.protocol.ce;
        r5 = z;
        r6 = 47;
        r5 = r5[r6];
        r6 = com.whatsapp.asu.NONE;
        r6 = r6.getText();
        r4.<init>(r5, r6);
        r2.add(r4);
        if (r1 == 0) goto L_0x004d;
    L_0x00cd:
        r4 = new com.whatsapp.protocol.ce;
        r5 = z;
        r6 = 54;
        r5 = r5[r6];
        r6 = com.whatsapp.tq.NONE;
        r6 = r6.getText();
        r4.<init>(r5, r6);
        r2.add(r4);
        if (r1 == 0) goto L_0x004d;
    L_0x00e3:
        r4 = new com.whatsapp.protocol.ce;
        r5 = z;
        r6 = 49;
        r5 = r5[r6];
        r6 = com.whatsapp.a2t.NONE;
        r6 = r6.getText();
        r4.<init>(r5, r6);
        r2.add(r4);
        if (r1 == 0) goto L_0x004d;
    L_0x00f9:
        r4 = new com.whatsapp.protocol.ce;
        r5 = z;
        r6 = 56;
        r5 = r5[r6];
        r6 = com.whatsapp.air.NONE;
        r6 = r6.getText();
        r4.<init>(r5, r6);
        r2.add(r4);
        if (r1 == 0) goto L_0x004d;
    L_0x010f:
        r4 = new com.whatsapp.protocol.ce;
        r5 = z;
        r6 = 55;
        r5 = r5[r6];
        r6 = com.whatsapp.a3m.NONE;
        r6 = r6.getText();
        r4.<init>(r5, r6);
        r2.add(r4);
        if (r1 == 0) goto L_0x004d;
    L_0x0125:
        r4 = new com.whatsapp.protocol.ce;
        r5 = z;
        r6 = 57;
        r5 = r5[r6];
        r6 = com.whatsapp.c7.NONE;
        r6 = r6.getText();
        r4.<init>(r5, r6);
        r2.add(r4);
        goto L_0x004d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.adn.a(com.whatsapp.protocol.ct, com.whatsapp.protocol.c3, int[]):void");
    }

    public void c(int i) {
        Log.w(z[81] + i);
    }

    public void a(String str, int i, n[] nVarArr) {
        com.whatsapp.contact.i.a(str, i, nVarArr);
    }

    public void a(ct ctVar, byte[] bArr) {
        this.a.ai.a(new ContactSyncJob(bArr));
        App.b(ctVar);
    }

    public void c(String str) {
        com.whatsapp.contact.i.c(str);
    }

    public void a(c3 c3Var, String str, String str2, int i, long j) {
        if (TextUtils.isEmpty(str)) {
            this.a.aV.remove(c3Var);
            if (!(TextUtils.isEmpty(str2) || !qm.i(c3Var.c) || TextUtils.equals(qm.c(c3Var.c).a(), str2))) {
                App.c(c3Var.c, z[22]);
            }
            boolean a = App.aK.a(c3Var, i, j);
            ana com_whatsapp_ana = (ana) h.b().b(ana.class);
            a4r F = Conversation.F();
            if (F.a() && !com_whatsapp_ana.a && F.b().ae.equals(c3Var.c) && a && Conversation.bz) {
                App.a(Uri.parse(z[17]));
            }
            com.whatsapp.notification.at.b(App.z());
            return;
        }
        Log.i(z[19] + c3Var + z[21] + str + z[23] + str2 + z[18] + i + z[20] + j);
    }

    public void a(boolean z) {
        if (z) {
            App.aK.b();
        }
    }

    static void a(adn com_whatsapp_adn, ap apVar, j jVar, az azVar, co coVar, b1 b1Var) {
        com_whatsapp_adn.c(apVar, jVar, azVar, coVar, b1Var);
    }

    public void a(String str, int i, int i2, long j) {
        com.whatsapp.contact.i.a(App.z(), str, i, i2, j);
    }

    public void a(ct ctVar, c3 c3Var) {
        Log.i(z[1] + ctVar + z[2] + c3Var);
        awc.e.execute(new au1(this, c3Var, ctVar));
    }

    public void c(ct ctVar) {
        Log.i(asx.a(App.z(), "", null, null, true, -1, -1, z[16], null));
        App.a(App.z(), false, true, false, false, null);
        App.b(ctVar);
    }

    public void b(ct ctVar) {
        App.b(ctVar);
    }

    public void a(String str, long j, String str2) {
        com.whatsapp.contact.i.a(str, j, str2);
    }

    public void c(Hashtable hashtable) {
        if (App.Z) {
            if (hashtable.containsKey(z[4])) {
                Log.i(z[3]);
                synchronized (App.ab) {
                    qm.b = true;
                    if (!qm.d) {
                        bq.a(new jc(this));
                    }
                }
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            return;
        }
        Log.i(z[5]);
    }

    public void a(Hashtable hashtable) {
        bq.a(new q0(this, hashtable));
    }

    public void a(Bundle bundle) {
    }

    private void c(ap apVar, j jVar, az azVar, co coVar, b1 b1Var) {
        try {
            String str;
            if (co.a(coVar.t)) {
                str = coVar.t;
            } else {
                str = coVar.k.c;
            }
            new aG(this.b.c(), new bI(str, jVar)).a(b1Var.c, azVar);
        } catch (bX e) {
            throw e;
        } catch (Throwable e2) {
            Log.c(z[79], e2);
            coVar.a(true);
            apVar.g = Double.valueOf(0.0d);
            apVar.e = Double.valueOf((double) com.whatsapp.fieldstats.j.NO_SESSION_AVAILABLE.getCode());
        }
    }

    public void a(String str) {
        com.whatsapp.contact.i.a(str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.protocol.ct r5, long r6, long r8) {
        /*
        r4 = this;
        r2 = 0;
        r1 = 0;
        r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1));
        if (r0 <= 0) goto L_0x001a;
    L_0x0007:
        r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1));
        if (r0 <= 0) goto L_0x001a;
    L_0x000b:
        r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1));
        if (r0 <= 0) goto L_0x001a;
    L_0x000f:
        r0 = com.whatsapp.App.I;
        r2 = r8 - r6;
        r0.sendEmptyMessageDelayed(r1, r2);
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x001f;
    L_0x001a:
        r0 = com.whatsapp.App.I;
        r0.sendEmptyMessage(r1);
    L_0x001f:
        r0 = com.whatsapp.App.I;
        r1 = 1;
        r0 = android.os.Message.obtain(r0, r1, r5);
        r0.sendToTarget();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.adn.a(com.whatsapp.protocol.ct, long, long):void");
    }

    public void a(Integer num, String[] strArr, String[] strArr2) {
        com.whatsapp.contact.i.a(num, strArr, strArr2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12, int r13) {
        /*
        r8 = this;
        r2 = com.whatsapp.DialogToastActivity.f;
        r0 = com.whatsapp.App.as;
        r0 = r0.b(r10);
        if (r11 == 0) goto L_0x0014;
    L_0x000a:
        r1 = com.whatsapp.App.ad();
        r1 = r11.startsWith(r1);
        if (r1 != 0) goto L_0x0017;
    L_0x0014:
        r8.c(r10, r12);
    L_0x0017:
        r0 = r0.c();
        if (r0 == 0) goto L_0x008c;
    L_0x001d:
        if (r9 == 0) goto L_0x002c;
    L_0x001f:
        r0 = new com.whatsapp.protocol.co;
        r1 = new com.whatsapp.protocol.c3;
        r3 = 1;
        r1.<init>(r10, r3, r9);
        r0.<init>(r1);
        if (r2 == 0) goto L_0x009b;
    L_0x002c:
        r1 = new com.whatsapp.protocol.co;
        r0 = 0;
        r0 = (byte[]) r0;
        r3 = 0;
        r1.<init>(r10, r0, r3);
    L_0x0035:
        r0 = -1;
        if (r12 != r0) goto L_0x0096;
    L_0x0038:
        r0 = 0;
    L_0x0039:
        r1.b(r0);
        r0 = 6;
        r1.d = r0;
        r4 = 6;
        r1.z = r4;
        r1.t = r11;
        r4 = (long) r13;
        r6 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r4 = r4 * r6;
        r1.b = r4;
        r0 = com.whatsapp.App.aK;
        r0 = r0.m(r10);
        if (r0 == 0) goto L_0x007a;
    L_0x0053:
        r3 = r0.d;
        r4 = 6;
        if (r3 != r4) goto L_0x007a;
    L_0x0058:
        r4 = r0.z;
        r6 = 6;
        r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r3 == 0) goto L_0x0068;
    L_0x0060:
        r4 = r0.z;
        r6 = 11;
        r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r3 != 0) goto L_0x007a;
    L_0x0068:
        r3 = r0.t;
        r3 = r11.equals(r3);
        if (r3 == 0) goto L_0x007a;
    L_0x0070:
        r3 = r1.a();
        r0 = r0.a();
        if (r3 == r0) goto L_0x0081;
    L_0x007a:
        r0 = com.whatsapp.App.aK;
        r0.a(r1);
        if (r2 == 0) goto L_0x008a;
    L_0x0081:
        r0 = z;
        r1 = 14;
        r0 = r0[r1];
        com.whatsapp.App.c(r9, r10, r0);
    L_0x008a:
        if (r2 == 0) goto L_0x0095;
    L_0x008c:
        r0 = z;
        r1 = 13;
        r0 = r0[r1];
        com.whatsapp.App.c(r9, r10, r0);
    L_0x0095:
        return;
    L_0x0096:
        r0 = java.lang.Integer.toString(r12);
        goto L_0x0039;
    L_0x009b:
        r1 = r0;
        goto L_0x0035;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.adn.a(java.lang.String, java.lang.String, java.lang.String, int, int):void");
    }

    private void c(String str, int i) {
        l5 b = App.as.b(str);
        if (b.c != i || b.o != i) {
            if (i == -1) {
                App.f(str);
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            App.a(new amy(this, b, i));
        }
    }

    static App c(adn com_whatsapp_adn) {
        return com_whatsapp_adn.a;
    }

    static awc b(adn com_whatsapp_adn) {
        return com_whatsapp_adn.b;
    }

    public void b(Bundle bundle) {
        boolean z;
        boolean z2 = true;
        String string = bundle.getString(z[9]);
        byte[] byteArray = bundle.getByteArray(z[6]);
        if (App.ay != null) {
            z = true;
        } else {
            z = false;
        }
        Log.b(z);
        if (App.ay.jabber_id == null) {
            z2 = false;
        }
        Log.b(z2);
        Log.i(z[7] + App.ay.jabber_id);
        if (ve.b(byteArray, App.ay.jabber_id)) {
            App.a(App.ay.jabber_id, byteArray);
            App.F(string);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        Log.e(z[8]);
    }

    public void a(ct ctVar, Vector vector) {
        Log.i(z[10] + ctVar);
        bq.a(new pb(this, ctVar, vector));
    }

    public void a(long j, int i) {
        boolean z = true;
        Context z2 = App.z();
        if (i != 1) {
            z = false;
        }
        vh.a(z2, j, z);
        h.b().a(new q9(j, i));
    }

    public void a() {
        aup.a();
    }

    private void b(ap apVar, j jVar, az azVar, co coVar, b1 b1Var) {
        try {
            new i(this.b, this.b, this.b.i(), this.b, jVar).a(new b(b1Var.c), azVar);
        } catch (Throwable e) {
            Log.c(z[0], e);
            coVar.a(true);
            apVar.g = Double.valueOf(0.0d);
            apVar.e = Double.valueOf((double) com.whatsapp.fieldstats.j.NO_SESSION_AVAILABLE.getCode());
        }
    }

    public void b(String str, String str2) {
        if (App.be()) {
            new ADMMessageHandler().b(str2);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        RegistrationIntentService.a(App.z(), str2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.protocol.ct r8) {
        /*
        r7 = this;
        r6 = 1;
        r1 = new com.whatsapp.protocol.c3;
        r0 = r8.e;
        r2 = 0;
        r3 = r8.b;
        r1.<init>(r0, r2, r3);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = z;
        r3 = 87;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r0 = r0.append(r8);
        r2 = z;
        r3 = 85;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = com.whatsapp.App.aK;
        r2 = r0.a(r1);
        if (r2 == 0) goto L_0x00bd;
    L_0x003b:
        r0 = r2.c;
        if (r0 == r6) goto L_0x0049;
    L_0x003f:
        r0 = r2.c;
        r3 = 2;
        if (r0 == r3) goto L_0x0049;
    L_0x0044:
        r0 = r2.c;
        r3 = 3;
        if (r0 != r3) goto L_0x00bd;
    L_0x0049:
        r0 = r2.Q;
        r0 = (com.whatsapp.MediaData) r0;
        if (r0 == 0) goto L_0x0095;
    L_0x004f:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = z;
        r5 = 88;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r3 = r3.append(r8);
        r4 = z;
        r5 = 86;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r3 = r3.append(r1);
        r3 = r3.toString();
        com.whatsapp.util.Log.i(r3);
        r0.autodownloadRetryEnabled = r6;
        r0 = com.whatsapp.App.aK;
        r0.c(r2);
        r0 = com.whatsapp.App.p(r2);
        if (r0 == 0) goto L_0x00bd;
    L_0x0084:
        r0 = com.whatsapp.App.i(r2);
        if (r0 == 0) goto L_0x00bd;
    L_0x008a:
        r0 = com.whatsapp.u1.a();
        r0.a(r2);
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x00bd;
    L_0x0095:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = z;
        r3 = 83;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r0 = r0.append(r8);
        r2 = z;
        r3 = 84;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.w(r0);
    L_0x00bd:
        com.whatsapp.App.a(r8);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.adn.a(com.whatsapp.protocol.ct):void");
    }

    public void a(String str, String str2) {
        App.a1.b(str, str2);
        App.i(str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r7, byte[] r8, java.lang.String r9, byte[] r10, byte[] r11, java.lang.Runnable r12) {
        /*
        r6 = this;
        if (r9 == 0) goto L_0x0012;
    L_0x0002:
        if (r10 == 0) goto L_0x0012;
    L_0x0004:
        r0 = com.whatsapp.App.aK;
        r1 = r7;
        r2 = r8;
        r3 = r9;
        r4 = r10;
        r5 = r11;
        r0.a(r1, r2, r3, r4, r5);
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x001b;
    L_0x0012:
        r0 = z;
        r1 = 29;
        r0 = r0[r1];
        com.whatsapp.util.Log.w(r0);
    L_0x001b:
        if (r12 == 0) goto L_0x0020;
    L_0x001d:
        r12.run();
    L_0x0020:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.adn.a(int, byte[], java.lang.String, byte[], byte[], java.lang.Runnable):void");
    }

    public void a(ct ctVar, c3 c3Var, byte[] bArr, int i, long j, boolean z) {
        int a = aw.a(bArr);
        Log.i(z[40] + i + z[42] + c3Var + z[41] + a + z[44] + j);
        if (i > 4) {
            Log.w(z[43] + c3Var);
            App.b(ctVar);
            return;
        }
        awc.e.execute(new t6(this, c3Var, ctVar, i, a, j));
    }

    public void a(String str, String str2, long j, String str3) {
        App.a(new mp(this, str2, j, str3, str));
    }

    public void a(Exception exception) {
        Log.w(z[78] + exception);
    }

    public void f(String str, String str2) {
        Throwable e;
        FileInputStream fileInputStream = null;
        int i = 0;
        boolean z = DialogToastActivity.f;
        App.c(str, str2, z[32]);
        if (!aw2.a(str2)) {
            l5 e2 = App.as.e();
            if (e2 != null) {
                try {
                    if (str2.equals(e2.p)) {
                        File x = e2.x();
                        File r = e2.r();
                        try {
                            if (x.exists() && r.exists()) {
                                FileInputStream fileInputStream2;
                                FileInputStream fileInputStream3;
                                try {
                                    byte[] bArr;
                                    fileInputStream2 = new FileInputStream(r);
                                    try {
                                        bArr = new byte[((int) r.length())];
                                        int i2 = 0;
                                        while (i2 < bArr.length) {
                                            int read = fileInputStream2.read(bArr, i2, bArr.length - i2);
                                            if (read == -1 && !z) {
                                                break;
                                            }
                                            i2 += read;
                                            if (z) {
                                                break;
                                            }
                                        }
                                        fileInputStream3 = new FileInputStream(x);
                                    } catch (IOException e3) {
                                        e = e3;
                                        fileInputStream3 = fileInputStream2;
                                        try {
                                            Log.b(z[31] + str2 + z[30], e);
                                            if (fileInputStream3 != null) {
                                                try {
                                                    fileInputStream3.close();
                                                } catch (IOException e4) {
                                                }
                                            }
                                            if (fileInputStream == null) {
                                                try {
                                                    fileInputStream.close();
                                                } catch (IOException e5) {
                                                    return;
                                                }
                                            }
                                        } catch (Throwable th) {
                                            e = th;
                                            fileInputStream2 = fileInputStream3;
                                            if (fileInputStream2 != null) {
                                                try {
                                                    fileInputStream2.close();
                                                } catch (IOException e6) {
                                                }
                                            }
                                            if (fileInputStream != null) {
                                                try {
                                                    fileInputStream.close();
                                                } catch (IOException e7) {
                                                }
                                            }
                                            throw e;
                                        }
                                    } catch (Throwable th2) {
                                        e = th2;
                                        if (fileInputStream2 != null) {
                                            fileInputStream2.close();
                                        }
                                        if (fileInputStream != null) {
                                            fileInputStream.close();
                                        }
                                        throw e;
                                    }
                                    try {
                                        byte[] bArr2 = new byte[((int) x.length())];
                                        while (i < bArr2.length) {
                                            int read2 = fileInputStream3.read(bArr2, i, bArr2.length - i);
                                            if (read2 == -1 && !z) {
                                                break;
                                            }
                                            i += read2;
                                            if (z) {
                                                break;
                                            }
                                        }
                                        aw2 com_whatsapp_aw2 = new aw2(str2, bArr2, bArr);
                                        com_whatsapp_aw2.i = true;
                                        App.a(com_whatsapp_aw2);
                                        if (fileInputStream2 != null) {
                                            try {
                                                fileInputStream2.close();
                                            } catch (IOException e8) {
                                            }
                                        }
                                        if (fileInputStream3 != null) {
                                            try {
                                                fileInputStream3.close();
                                            } catch (IOException e9) {
                                            }
                                        }
                                    } catch (IOException e10) {
                                        e = e10;
                                        fileInputStream = fileInputStream3;
                                        fileInputStream3 = fileInputStream2;
                                        Log.b(z[31] + str2 + z[30], e);
                                        if (fileInputStream3 != null) {
                                            fileInputStream3.close();
                                        }
                                        if (fileInputStream == null) {
                                            fileInputStream.close();
                                        }
                                    } catch (Throwable th3) {
                                        e = th3;
                                        fileInputStream = fileInputStream3;
                                        if (fileInputStream2 != null) {
                                            fileInputStream2.close();
                                        }
                                        if (fileInputStream != null) {
                                            fileInputStream.close();
                                        }
                                        throw e;
                                    }
                                } catch (IOException e11) {
                                    e = e11;
                                    fileInputStream3 = null;
                                    Log.b(z[31] + str2 + z[30], e);
                                    if (fileInputStream3 != null) {
                                        fileInputStream3.close();
                                    }
                                    if (fileInputStream == null) {
                                        fileInputStream.close();
                                    }
                                } catch (Throwable th4) {
                                    e = th4;
                                    fileInputStream2 = null;
                                    if (fileInputStream2 != null) {
                                        fileInputStream2.close();
                                    }
                                    if (fileInputStream != null) {
                                        fileInputStream.close();
                                    }
                                    throw e;
                                }
                            }
                        } catch (IOException e12) {
                            throw e12;
                        }
                    }
                } catch (IOException e122) {
                    throw e122;
                }
            }
        }
    }

    public void a(c3 c3Var, byte[] bArr, int i, long j) {
        int a = aw.a(bArr);
        Log.i(z[60] + i + z[61] + c3Var + z[59] + a + z[58] + j);
        awc.e.execute(new auh(this, i, c3Var, j, a));
    }

    public adn(@NonNull Context context, @NonNull App app) {
        this.c = context;
        this.a = app;
        this.b = awc.a(context);
    }

    public void b() {
        aup.e();
    }

    public void d(String str, String str2) {
        Log.i(z[64] + str + ' ' + str2);
        App.a1.a(qa.d(str).p, false);
        App.i(str);
    }

    public void b(ct ctVar, c3 c3Var) {
        Log.i(z[62] + ctVar + z[63] + c3Var);
        a(ctVar, c3Var);
    }

    public void a(bv bvVar) {
        if (bvVar.a == -1) {
            Long l = null;
            if (bvVar.c == 1) {
                l = App.Q.a(bvVar.d);
            } else if (bvVar.c == 2) {
                l = App.a2.a(bvVar.d);
            }
            if (l != null) {
                bg bgVar;
                Context z = App.z();
                c2 c2Var = c2.OK_MISSING;
                if (bvVar.c == 1) {
                    bgVar = bg.FULL;
                } else {
                    bgVar = bg.THUMB;
                }
                nf.a(z, c2Var, bgVar, SystemClock.elapsedRealtime() - l.longValue(), 0);
            }
            App.f(bvVar.d);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        App.a(new a3y(this, bvVar));
    }

    public void c() {
        DeleteAccountConfirmation.a(this.c, this.b);
    }

    public void a(int i) {
        App.aK.U();
        if (App.c(App.az()) != 0) {
            u1 a = u1.a();
            a.a(false);
            bq.a(new w8(this, a), new Void[0]);
        }
        App.aJ = true;
    }

    public void e(String str, String str2) {
        Log.i(z[80] + str + ' ' + str2);
        l5 d = qa.d(str);
        boolean a = App.a1.a(str);
        App.a1.c(str);
        App.a1.a(str, true);
        if (!a) {
            App.L.removeMessages(2, App.A(d.p));
        }
        App.i(str);
    }

    public void b(String str, String str2, long j) {
        com.whatsapp.contact.i.a(App.z(), str, str2, j);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.whatsapp.protocol.c3 r24, java.lang.String r25, int r26, java.lang.String r27) {
        /*
        r23 = this;
        r16 = com.whatsapp.DialogToastActivity.f;
        r0 = r23;
        r2 = r0.a;
        r2 = r2.aV;
        r0 = r24;
        r2.remove(r0);
        r0 = r24;
        r2 = r0.c;
        r2 = com.whatsapp.qm.i(r2);
        if (r2 == 0) goto L_0x007b;
    L_0x0017:
        r3 = 401; // 0x191 float:5.62E-43 double:1.98E-321;
        r0 = r26;
        if (r0 != r3) goto L_0x007b;
    L_0x001d:
        r3 = com.whatsapp.App.aK;
        r0 = r24;
        r4 = r0.c;
        r4 = com.whatsapp.qm.e(r4);
        r3.a(r4);
        r3 = com.whatsapp.App.aK;
        r0 = r24;
        r3 = r3.a(r0);
        if (r3 == 0) goto L_0x003e;
    L_0x0034:
        r4 = 7;
        r3.d = r4;
        r4 = com.whatsapp.App.aK;
        r4.c(r3);
        if (r16 == 0) goto L_0x005a;
    L_0x003e:
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = z;
        r5 = 37;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r0 = r24;
        r3 = r3.append(r0);
        r3 = r3.toString();
        com.whatsapp.util.Log.w(r3);
    L_0x005a:
        r0 = r24;
        r3 = r0.c;
        r3 = com.whatsapp.qm.h(r3);
        if (r3 != 0) goto L_0x0079;
    L_0x0064:
        r0 = r24;
        r3 = r0.c;
        r4 = com.whatsapp.App.as;
        r4 = r4.e();
        r4 = r4.p;
        com.whatsapp.qm.b(r3, r4);
        r3 = com.whatsapp.App.aB;
        r4 = 0;
        r3.sendEmptyMessage(r4);
    L_0x0079:
        if (r16 == 0) goto L_0x01d0;
    L_0x007b:
        if (r2 == 0) goto L_0x01d0;
    L_0x007d:
        r2 = 409; // 0x199 float:5.73E-43 double:2.02E-321;
        r0 = r26;
        if (r0 != r2) goto L_0x01d0;
    L_0x0083:
        r0 = r24;
        r2 = r0.c;
        r3 = 0;
        com.whatsapp.App.c(r2, r3);
        r2 = com.whatsapp.App.aK;
        r0 = r24;
        r17 = r2.a(r0);
        if (r17 == 0) goto L_0x01b4;
    L_0x0095:
        r2 = com.whatsapp.App.aK;
        r0 = r24;
        r3 = r0.c;
        r0 = r17;
        r4 = r0.g;
        r18 = r2.b(r3, r4);
        if (r18 == 0) goto L_0x0184;
    L_0x00a5:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 33;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r24;
        r2 = r2.append(r0);
        r3 = z;
        r4 = 34;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r17;
        r3 = r0.g;
        r2 = r2.append(r3);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r2 = com.whatsapp.App.as;
        r2 = r2.e();
        if (r2 == 0) goto L_0x00e2;
    L_0x00db:
        r2 = r2.p;
        r0 = r18;
        r0.remove(r2);
    L_0x00e2:
        r2 = com.whatsapp.App.as;
        r3 = com.whatsapp.ms.ALLOW;
        r0 = r18;
        r2 = r2.a(r0, r3);
        r0 = r17;
        r3 = r0.c;
        if (r3 != 0) goto L_0x0159;
    L_0x00f2:
        if (r2 == 0) goto L_0x0159;
    L_0x00f4:
        r2 = z;
        r3 = 35;
        r2 = r2[r3];
        com.whatsapp.util.Log.i(r2);
        r2 = de.greenrobot.event.h.b();
        r3 = com.whatsapp.amm.class;
        r2 = r2.b(r3);
        r2 = (com.whatsapp.amm) r2;
        r20 = r2.a();
        r2 = com.whatsapp.proto.E2E.Message.newBuilder();
        r3 = r17.c();
        r2 = r2.setConversation(r3);
        r3 = r2.build();
        r19 = r18.iterator();
    L_0x0121:
        r2 = r19.hasNext();
        if (r2 == 0) goto L_0x0157;
    L_0x0127:
        r6 = r19.next();
        r6 = (java.lang.String) r6;
        r2 = com.whatsapp.App.p;
        r0 = r2.ai;
        r22 = r0;
        r2 = new com.whatsapp.jobqueue.job.SendE2EMessageJob;
        r0 = r17;
        r4 = r0.k;
        r4 = r4.b;
        r0 = r17;
        r5 = r0.k;
        r5 = r5.c;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r11 = 0;
        r12 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r12 = r12 + r20;
        r14 = 0;
        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14);
        r0 = r22;
        r0.a(r2);
        if (r16 == 0) goto L_0x0121;
    L_0x0157:
        if (r16 == 0) goto L_0x0182;
    L_0x0159:
        r2 = 0;
        r0 = r17;
        r0.d = r2;
        r2 = r18.size();
        r2 = new java.lang.String[r2];
        r0 = r18;
        r2 = com.whatsapp.util.ax.a(r0, r2);
        r2 = (java.lang.String[]) r2;
        r0 = r17;
        r0.h = r2;
        r2 = com.whatsapp.App.aK;
        r0 = r17;
        r2.g(r0);
        r2 = com.whatsapp.App.aK;
        r3 = -1;
        r0 = r17;
        r2.d(r0, r3);
        com.whatsapp.App.aM();
    L_0x0182:
        if (r16 == 0) goto L_0x01b2;
    L_0x0184:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 36;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r24;
        r2 = r2.append(r0);
        r3 = z;
        r4 = 39;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r17;
        r3 = r0.g;
        r2 = r2.append(r3);
        r2 = r2.toString();
        com.whatsapp.util.Log.w(r2);
    L_0x01b2:
        if (r16 == 0) goto L_0x01d0;
    L_0x01b4:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 38;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r24;
        r2 = r2.append(r0);
        r2 = r2.toString();
        com.whatsapp.util.Log.w(r2);
    L_0x01d0:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.adn.a(com.whatsapp.protocol.c3, java.lang.String, int, java.lang.String):void");
    }

    public void a(String str, int i) {
        c(str, i);
    }

    static void c(adn com_whatsapp_adn, ap apVar, j jVar, az azVar, co coVar, b1 b1Var) {
        com_whatsapp_adn.b(apVar, jVar, azVar, coVar, b1Var);
    }

    public void a(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, @Nullable Runnable runnable) {
        ve.a(str, bArr, bArr2, bArr3, bArr4, null);
        if (runnable != null) {
            runnable.run();
        }
    }
}
