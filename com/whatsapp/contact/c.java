package com.whatsapp.contact;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;
import com.whatsapp.WAAppCompatActivity;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import com.whatsapp.util.bm;
import java.io.File;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class c extends SQLiteOpenHelper {
    private static final String[] z;
    private final Context a;

    static {
        String[] strArr = new String[78];
        String str = "o=\u007fnK";
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
                        i3 = 24;
                        break;
                    case at.g /*1*/:
                        i3 = 92;
                        break;
                    case at.i /*2*/:
                        i3 = 81;
                        break;
                    case at.o /*3*/:
                        i3 = 10;
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
                    i = 2;
                    strArr2 = strArr3;
                    str = "[3?~H{(\"*My(0hHk9qcZ89?i[a,%oM6|\u0003oDw*8dN6r\u007f";
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "[3?~H{(\"*My(0hHk9qcZ8?>x[m,%$\tJ9<e_q26$\u00076";
                    obj = 2;
                    strArr2 = strArr3;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "K(0iBW*4xOt3&O[j3#*Mm.8dN883*@v5%*Jp92a";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "[3?~H{(\"*My(0hHk9qcZ8?>x[m,%$\t^3$dM8*8k\tK(0iBW*4xOt3&O[j3#$\tJ9<e_q26$\u00076";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "~5=o\tq/qoG{.(z]}8";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "w2\u0012e[j)!~@w2";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "m,6xH|9qxLy8|eGt%qnHl=3kZ}";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "[3?~H{(\"*My(0hHk9qcZ8?>x[m,%$\t^3$dM8*8k\tK(0iBW*4xOt3&O[j3#$\tJ9<e_q26$\u00076";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    str = "~5=o\tq/qoG{.(z]}8";
                    obj = 9;
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    strArr2 = strArr3;
                    str = "[08oGl|0i]m==fP83!oG}8qnHl=3kZ}|0y\tj90n\u0004w2=s\ty25*Jy2v~\tm,6xH|9\u007f*zo5%iAq26*]w|&x@l=3fL6r\u007f";
                    obj = 10;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "K(0iBW*4xOt3&O[j3#*Mm.8dN883*@v5%*Jp92a";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "w2\u0012e[j)!~@w2";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "[3?~H{(\"*My(0hHk9qcZ89?i[a,%oM6|\u0003oDw*8dN6r\u007f";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "[3?~H{(\"*My(0hHk9qcZ8?>x[m,%$\tJ9<e_q26$\u00076";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "56>\u007f[v==";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "~5=o\tv3%*Ow)?n\t~3#*My(0hHk9qiFh%";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "q3qoQ{9!~@w2qn\\j5?m\t|=%kKy/4*Jw,(";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "5+0f";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "\\\u000e\u001eZ\tQ\u0012\u0015Oq868nvq25oQ";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "8(>*";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "M2#oJw;?cS}8qeE||5k]y>0yL8*4xZq3?";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\\\u000e\u001eZ\tQ\u0012\u0015Oq85\"U^y\u00038dM}$";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    str = "Y\u0010\u0005O{8\b\u0010He]|&kv{3?~H{(\"*h\\\u0018qiHt00h@t5%s\tL\u0019\t^";
                    obj = 23;
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    strArr2 = strArr3;
                    str = "\\\u000e\u001eZ\tQ\u0012\u0015Oq8+0UJw2%kJl\u00032kYy>8f@l54yvr55U@v84r";
                    obj = 24;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "{=!kKq08~P";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "M,6xH|5?m\t{3?~H{(\"*My(0hHk9ql[w1q|Lj/8eG8";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "8\u001a\u0003Ed83=nv";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "o=\u000eiFv(0i]G?0zHz5=c]q9\"";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "r55";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "r55*\u00148cqKg\\|2kYy>8f@l%q7\t'";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "Y\u0010\u0005O{8\b\u0010He]|&kv{3?~H{(\"*h\\\u0018qy]y($yvl5<oZl=<z\tQ\u0012\u0005On]\u000e";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "Y\u0010\u0005O{8\b\u0010He]|&kv{3?~H{(\"*{]\u0012\u0010Gl8\b\u001e*Ft8\u000e}HG?>d]y?%y";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "Q\u0012\u0002O{L|\u0018D}W|&kv{3?~H{(\"*z]\u0010\u0014I}8";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "o=\u000eiFv(0i]k";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "\\\u000e\u001eZ\tL\u001d\u0013Fl83=nvo=\u000eiFv(0i]k";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "o=\u000eiFv(0i]G?0zHz5=c]q9\"";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "u56xHl5?m\t{==fHz5=c]a|%e\t{=!kKq08~@}/q~Hz04*Ow.qiFv(0i]k|5k]y>0yL8*4xZq3?*\u0011";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "r55";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "n==\u007fL";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    str = "K\u0019\u001dOjL|;cM4|2kEt=3cEq((*oJ\u0013\u001c*^y\u00032eGl=2~Z8\u000b\u0019O{]|2kEt=3cEq((*`K|\u001fE}8\u0012\u0004Fe";
                    obj = 40;
                    i = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    strArr2 = strArr3;
                    str = "m,5k]}8\u000ek]";
                    obj = 41;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "o=\u000eiFv(0i]G?0zHz5=c]q9\"";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "{=!kKq08~P";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "n38z";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "{.4k]q26*Jw2%kJl|2kYy>8f@l54y\tl=3fL8:>x\t{3?~H{(\"*My(0hHk9q|Lj/8eG8d";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "[\u000e\u0014K}]|\u0005KkT\u0019q}HG?>d]y?%UJy,0h@t5%cLk|yU@||\u0018D}]\u001b\u0014X\tH\u000e\u0018GhJ\u0005qAlA|\u0010_}W\u0015\u001fI{]\u0011\u0014D}4|;cM8\b\u0014R}8\u0012\u001e^\tV\t\u001dF\u00058?0zHz5=c]a|\u0005OqL|\u001fE}8\u0012\u0004Fe4|'kEm9q^l@\bqDfL|\u001f_eTpq\u007fY|=%oMG=%*`V\b\u0014MlJ|\u001fE}8\u0012\u0004Fe1";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "\\\u000e\u001eZ\tL\u001d\u0013Fl8\u0015\u0017*l@\u0015\u0002^z8+0UJw2%kJl\u00032kYy>8f@l54y";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "o=\u007fnK";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "h4>~FG(\"";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "r55";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "q/\u000e}Ay(\"kYh\u0003$yLj";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "k(0~\\k";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "h4>dLG((zL";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "h4>~FG55U]q14y]y1!";
                    obj = 54;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "j=&UJw2%kJl\u00038n";
                    obj = 55;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "m2\"oLv\u0003<yNG?>\u007fGl";
                    obj = 56;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "v)<hLj";
                    obj = 57;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "k(0~\\k\u0003%cD}/%kDh";
                    obj = 58;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "\u007f5'oGG20gL";
                    obj = 59;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "~=<cEa\u0003?kD}";
                    obj = 60;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "h4>dLG00hLt";
                    obj = 61;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "l4$gKG(\"";
                    obj = 62;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "|5\"zEy%\u000edHu9";
                    obj = 63;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "G55";
                    obj = 64;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "o=\u000edHu9";
                    obj = 65;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "k3#~vv=<o";
                    obj = 66;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "|9=o]}8qiFv(0i]880~Hz=\"o\t0.4y\\t(l";
                    obj = 67;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    strArr2[i] = str;
                    i = 69;
                    str = "|9=o]q26*Jw2%kJl|5k]y>0yL6r\u007f";
                    obj = 68;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    strArr2[i] = str;
                    i = 70;
                    str = "[\u000e\u0014K}]|\u0004D`I\t\u0014*`V\u0018\u0014R\to=\u000eiFv(0i]G?0zHz5=c]q9\"UCq8\u000eiHh=3cEq((U@v84r\tW\u0012q}HG?>d]y?%UJy,0h@t5%cLkt;cM4?0zHz5=c]au";
                    obj = 69;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeight /*69*/:
                    strArr2[i] = str;
                    i = 71;
                    str = "{.4k]q26*Jw2%kJl/q~Hz04*Ow.qiFv(0i]k|5k]y>0yL8*4xZq3?*\u0011";
                    obj = 70;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightSmall /*70*/:
                    strArr2[i] = str;
                    i = 72;
                    str = "[\u000e\u0014K}]|\u0018Dm]\u0004q`@|\u00038dM}$qEg8+0UJw2%kJl/y`@|uj";
                    obj = 71;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightLarge /*71*/:
                    strArr2[i] = str;
                    i = 73;
                    str = "\\\u000e\u001eZ\tL\u001d\u0013Fl8\u0015\u0017*l@\u0015\u0002^z8+0UJw2%kJl/";
                    obj = 72;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingLeft /*72*/:
                    strArr2[i] = str;
                    i = 74;
                    str = "[\u000e\u0014K}]|\u0018Dm]\u0004qcZG+0U@v84r\tW\u0012q}HG?>d]y?%y\u0001q/\u000e}Ay(\"kYh\u0003$yLjuj";
                    obj = 73;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingRight /*73*/:
                    strArr2[i] = str;
                    i = 75;
                    str = "[\u000e\u0014K}]|\u0005KkT\u0019q}HG?>d]y?%y\t0\u00038n\tQ\u0012\u0005On]\u000eqZ{Q\u0011\u0010Xp8\u0017\u0014S\tY\t\u0005E`V\u001f\u0003Od]\u0012\u0005&\tr55*}]\u0004\u0005*gW\bqD|T\u0010}*@k\u0003&bHl/0zYG)\"o[8\u001e\u001eEe]\u001d\u001f*gW\bqD|T\u0010}*Zl=%\u007fZ8\b\u0014R}4|\"~Hl)\"U]q14y]y1!*`V\b\u0014MlJpqd\\u>4x\tL\u0019\t^\u00058.0}v{3?~H{(\u000ecM8\u0015\u001f^l_\u0019\u0003&\t|5\"zEy%\u000edHu9q^l@\b}*Yp3?ovl%!o\tQ\u0012\u0005On]\u000e}*Yp3?ovt=3oE8\b\u0014R}4|$dZ}9?UDk;\u000eiFm2%*`V\b\u0014MlJpqzAw(>U]k|\u0018D}]\u001b\u0014X\u00058(9\u007fDz\u0003%y\tQ\u0012\u0005On]\u000e}*Yp3%evq8\u000e~@u9\"~Hu,qCgL\u0019\u0016O{4|6c_}2\u000edHu9q^l@\b}*Oy18fPG20gL8\b\u0014R}4|&kvv=<o\tL\u0019\t^\u00058/>x]G20gL8\b\u0014R}1";
                    obj = 74;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropDownListViewStyle /*74*/:
                    strArr2[i] = str;
                    i = 76;
                    str = "\\3&dNj=5cG\u007f|2eGl=2~Z880~Hz=\"o\t~.>g\tn9#y@w2q";
                    obj = 75;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPopupWindowStyle /*75*/:
                    strArr2[i] = str;
                    i = 77;
                    str = "8(>*";
                    obj = 76;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItem /*76*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "{.4k]q26*Jw2%kJl/qnHl=3kZ}|'o[k5>d\t ";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        try {
            super.onOpen(sQLiteDatabase);
            if (VERSION.SDK_INT < 11) {
                return;
            }
            if (VERSION.SDK_INT < 16) {
                try {
                    if (!bm.a()) {
                        sQLiteDatabase.enableWriteAheadLogging();
                    }
                } catch (SQLiteDatabaseCorruptException e) {
                    throw e;
                }
            }
        } catch (SQLiteDatabaseCorruptException e2) {
            throw e2;
        } catch (SQLiteDatabaseCorruptException e22) {
            throw e22;
        }
    }

    private void c(SQLiteDatabase sQLiteDatabase) {
        Log.i(z[46]);
        sQLiteDatabase.execSQL(z[48]);
        sQLiteDatabase.execSQL(z[47]);
        b(sQLiteDatabase);
    }

    private void d(SQLiteDatabase sQLiteDatabase) {
        boolean z = ContactProvider.c;
        Log.i(z[38]);
        Cursor rawQuery = sQLiteDatabase.rawQuery(z[41], null);
        try {
            long currentTimeMillis = System.currentTimeMillis();
            ContentValues contentValues = new ContentValues();
            contentValues.put(z[44], z[45]);
            contentValues.put(z[42], Long.valueOf(currentTimeMillis));
            while (rawQuery.moveToNext()) {
                String string = rawQuery.getString(0);
                String string2 = rawQuery.getString(1);
                contentValues.put(z[39], string);
                contentValues.put(z[40], string2);
                sQLiteDatabase.insert(z[43], null, contentValues);
                if (z) {
                    break;
                }
            }
            rawQuery.close();
        } catch (Throwable th) {
            rawQuery.close();
        }
    }

    public SQLiteDatabase getWritableDatabase() {
        boolean z = ContactProvider.c;
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseCorruptException e) {
            Log.w(z[3]);
            b();
            return super.getWritableDatabase();
        } catch (SQLiteException e2) {
            try {
                if (e2.toString().contains(z[6])) {
                    Log.w(z[2]);
                    b();
                    return super.getWritableDatabase();
                }
                throw e2;
            } catch (SQLiteDatabaseCorruptException e3) {
                throw e3;
            }
        } catch (StackOverflowError e4) {
            Log.w(z[4]);
            StackTraceElement[] stackTrace = e4.getStackTrace();
            int length = stackTrace.length;
            int i = 0;
            while (i < length) {
                try {
                    if (!stackTrace[i].getMethodName().equals(z[7])) {
                        i++;
                        if (z) {
                            break;
                        }
                    }
                    Log.w(z[5]);
                    b();
                    return super.getWritableDatabase();
                } catch (SQLiteDatabaseCorruptException e32) {
                    throw e32;
                }
            }
            throw e4;
        }
    }

    private void b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(z[70]);
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        Log.i(z[71]);
        sQLiteDatabase.execSQL(z[73]);
        sQLiteDatabase.execSQL(z[75]);
        sQLiteDatabase.execSQL(z[74]);
        sQLiteDatabase.execSQL(z[72]);
    }

    public c(Context context) {
        super(context, z[49], null, 8);
        if (VERSION.SDK_INT >= 16) {
            try {
                if (!bm.a()) {
                    setWriteAheadLoggingEnabled(true);
                }
            } catch (SQLiteDatabaseCorruptException e) {
                throw e;
            }
        }
        this.a = context;
    }

    private String d() {
        int i = 0;
        boolean z = ContactProvider.c;
        StringBuilder stringBuilder = new StringBuilder();
        String[] strArr = new String[]{z[65], z[51], z[52], z[53], z[59], z[58], z[56], z[64], z[54], z[62], z[57], z[50], z[63], z[55], z[60], z[61], z[66], z[67]};
        int length = strArr.length;
        while (i < length) {
            stringBuilder.append(strArr[i]).append(',');
            i++;
            if (z) {
                break;
            }
        }
        stringBuilder.setLength(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }

    boolean b() {
        boolean delete;
        boolean z = ContactProvider.c;
        synchronized (this) {
            close();
            Log.i(z[69]);
            delete = e().delete();
            c().delete();
            a().delete();
            Log.i(z[68] + delete + ')');
        }
        if (z) {
            WAAppCompatActivity.c++;
        }
        return delete;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r11, int r12, int r13) {
        /*
        r10 = this;
        r6 = 2;
        r4 = 1;
        r5 = 0;
        r3 = 0;
        r8 = com.whatsapp.contact.ContactProvider.c;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 27;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r12);
        r1 = z;
        r2 = 21;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r13);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        switch(r12) {
            case 3: goto L_0x003e;
            case 4: goto L_0x0047;
            case 5: goto L_0x0050;
            case 6: goto L_0x0139;
            case 7: goto L_0x00c3;
            default: goto L_0x0031;
        };
    L_0x0031:
        r0 = z;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0137 }
        r1 = 22;
        r0 = r0[r1];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0137 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0137 }
        r10.onCreate(r11);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0137 }
    L_0x003d:
        return;
    L_0x003e:
        r0 = z;	 Catch:{ SQLiteDatabaseCorruptException -> 0x0129 }
        r1 = 32;
        r0 = r0[r1];	 Catch:{ SQLiteDatabaseCorruptException -> 0x0129 }
        r11.execSQL(r0);	 Catch:{ SQLiteDatabaseCorruptException -> 0x0129 }
    L_0x0047:
        r0 = z;
        r1 = 24;
        r0 = r0[r1];
        r11.execSQL(r0);
    L_0x0050:
        r10.c(r11);
        r10.d(r11);
        r0 = r4;
    L_0x0057:
        if (r0 != 0) goto L_0x00c3;
    L_0x0059:
        r0 = z;
        r1 = 25;
        r0 = r0[r1];
        r11.execSQL(r0);
        r9 = new java.util.HashSet;
        r9.<init>();
        r0 = z;
        r1 = 29;
        r1 = r0[r1];
        r2 = new java.lang.String[r6];
        r0 = z;
        r6 = 30;
        r0 = r0[r6];
        r2[r5] = r0;
        r0 = z;
        r5 = 26;
        r0 = r0[r5];
        r2[r4] = r0;
        r0 = r11;
        r4 = r3;
        r5 = r3;
        r6 = r3;
        r7 = r3;
        r1 = r0.query(r1, r2, r3, r4, r5, r6, r7);
    L_0x0088:
        r0 = r1.moveToNext();	 Catch:{ all -> 0x012d }
        if (r0 == 0) goto L_0x00bd;
    L_0x008e:
        r0 = 0;
        r0 = r1.getString(r0);	 Catch:{ all -> 0x012d }
        r2 = 1;
        r2 = r1.getString(r2);	 Catch:{ all -> 0x012d }
        r3 = new android.util.Pair;	 Catch:{ all -> 0x012d }
        r3.<init>(r0, r2);	 Catch:{ all -> 0x012d }
        r3 = r9.add(r3);	 Catch:{ all -> 0x012d }
        if (r3 != 0) goto L_0x00bb;
    L_0x00a3:
        r3 = z;	 Catch:{ SQLiteDatabaseCorruptException -> 0x012b }
        r4 = 37;
        r3 = r3[r4];	 Catch:{ SQLiteDatabaseCorruptException -> 0x012b }
        r4 = z;	 Catch:{ SQLiteDatabaseCorruptException -> 0x012b }
        r5 = 31;
        r4 = r4[r5];	 Catch:{ SQLiteDatabaseCorruptException -> 0x012b }
        r5 = 2;
        r5 = new java.lang.String[r5];	 Catch:{ SQLiteDatabaseCorruptException -> 0x012b }
        r6 = 0;
        r5[r6] = r0;	 Catch:{ SQLiteDatabaseCorruptException -> 0x012b }
        r0 = 1;
        r5[r0] = r2;	 Catch:{ SQLiteDatabaseCorruptException -> 0x012b }
        r11.delete(r3, r4, r5);	 Catch:{ SQLiteDatabaseCorruptException -> 0x012b }
    L_0x00bb:
        if (r8 == 0) goto L_0x0088;
    L_0x00bd:
        r1.close();
        r10.b(r11);
    L_0x00c3:
        r11.beginTransaction();
        r0 = z;	 Catch:{ all -> 0x0132 }
        r1 = 33;
        r0 = r0[r1];	 Catch:{ all -> 0x0132 }
        r11.execSQL(r0);	 Catch:{ all -> 0x0132 }
        r0 = z;	 Catch:{ all -> 0x0132 }
        r1 = 23;
        r0 = r0[r1];	 Catch:{ all -> 0x0132 }
        r11.execSQL(r0);	 Catch:{ all -> 0x0132 }
        r0 = z;	 Catch:{ all -> 0x0132 }
        r1 = 20;
        r0 = r0[r1];	 Catch:{ all -> 0x0132 }
        r11.execSQL(r0);	 Catch:{ all -> 0x0132 }
        r10.a(r11);	 Catch:{ all -> 0x0132 }
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0132 }
        r0.<init>();	 Catch:{ all -> 0x0132 }
        r1 = z;	 Catch:{ all -> 0x0132 }
        r2 = 34;
        r1 = r1[r2];	 Catch:{ all -> 0x0132 }
        r0 = r0.append(r1);	 Catch:{ all -> 0x0132 }
        r1 = r10.d();	 Catch:{ all -> 0x0132 }
        r0 = r0.append(r1);	 Catch:{ all -> 0x0132 }
        r1 = z;	 Catch:{ all -> 0x0132 }
        r2 = 28;
        r1 = r1[r2];	 Catch:{ all -> 0x0132 }
        r0 = r0.append(r1);	 Catch:{ all -> 0x0132 }
        r1 = z;	 Catch:{ all -> 0x0132 }
        r2 = 35;
        r1 = r1[r2];	 Catch:{ all -> 0x0132 }
        r0 = r0.append(r1);	 Catch:{ all -> 0x0132 }
        r0 = r0.toString();	 Catch:{ all -> 0x0132 }
        r11.execSQL(r0);	 Catch:{ all -> 0x0132 }
        r0 = z;	 Catch:{ all -> 0x0132 }
        r1 = 36;
        r0 = r0[r1];	 Catch:{ all -> 0x0132 }
        r11.execSQL(r0);	 Catch:{ all -> 0x0132 }
        r11.setTransactionSuccessful();	 Catch:{ all -> 0x0132 }
        r11.endTransaction();
        if (r8 == 0) goto L_0x003d;
    L_0x0127:
        goto L_0x0031;
    L_0x0129:
        r0 = move-exception;
        throw r0;
    L_0x012b:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x012d }
    L_0x012d:
        r0 = move-exception;
        r1.close();
        throw r0;
    L_0x0132:
        r0 = move-exception;
        r11.endTransaction();
        throw r0;
    L_0x0137:
        r0 = move-exception;
        throw r0;
    L_0x0139:
        r0 = r5;
        goto L_0x0057;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.c.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }

    public SQLiteDatabase getReadableDatabase() {
        boolean z = ContactProvider.c;
        try {
            return super.getReadableDatabase();
        } catch (SQLiteDatabaseCorruptException e) {
            Log.w(z[15]);
            b();
            return super.getReadableDatabase();
        } catch (SQLiteException e2) {
            String sQLiteException = e2.toString();
            try {
                if (sQLiteException.contains(z[10])) {
                    Log.w(z[14]);
                    b();
                    return super.getReadableDatabase();
                }
                try {
                    if (sQLiteException.contains(z[8])) {
                        Log.w(z[11]);
                        return getWritableDatabase();
                    }
                    throw e2;
                } catch (SQLiteDatabaseCorruptException e3) {
                    throw e3;
                }
            } catch (SQLiteDatabaseCorruptException e32) {
                throw e32;
            }
        } catch (StackOverflowError e4) {
            Log.w(z[12]);
            StackTraceElement[] stackTrace = e4.getStackTrace();
            int length = stackTrace.length;
            int i = 0;
            while (i < length) {
                try {
                    if (!stackTrace[i].getMethodName().equals(z[13])) {
                        i++;
                        if (z) {
                            break;
                        }
                    }
                    Log.w(z[9]);
                    b();
                    return super.getReadableDatabase();
                } catch (SQLiteDatabaseCorruptException e322) {
                    throw e322;
                }
            }
            throw e4;
        }
    }

    private File c() {
        File e = e();
        return new File(e.getPath(), e.getName() + z[16]);
    }

    void a(java.io.File r8) {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:com.whatsapp.contact.c.a(java.io.File):void. bs: [B:19:0x0038, B:37:0x0054, B:53:0x006e, B:64:0x007a, B:67:0x007f]
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:86)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:57)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:281)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:161)
*/
        /*
        r7 = this;
        r2 = 0;
        monitor-enter(r7);
        r7.close();	 Catch:{ all -> 0x003f }
        r0 = new java.io.FileInputStream;	 Catch:{ FileNotFoundException -> 0x0042, IOException -> 0x005c, all -> 0x0076 }
        r1 = r7.e();	 Catch:{ FileNotFoundException -> 0x0042, IOException -> 0x005c, all -> 0x0076 }
        r0.<init>(r1);	 Catch:{ FileNotFoundException -> 0x0042, IOException -> 0x005c, all -> 0x0076 }
        r1 = r0.getChannel();	 Catch:{ FileNotFoundException -> 0x0042, IOException -> 0x005c, all -> 0x0076 }
        r0 = r8.exists();	 Catch:{ FileNotFoundException -> 0x00a6, IOException -> 0x009f }
        if (r0 != 0) goto L_0x001f;	 Catch:{ FileNotFoundException -> 0x00a6, IOException -> 0x009f }
    L_0x0018:
        r0 = r8.createNewFile();	 Catch:{ FileNotFoundException -> 0x00a6, IOException -> 0x009f }
        com.whatsapp.util.Log.b(r0);	 Catch:{ FileNotFoundException -> 0x00a6, IOException -> 0x009f }
    L_0x001f:
        r0 = new java.io.FileOutputStream;	 Catch:{ FileNotFoundException -> 0x00a6, IOException -> 0x009f }
        r0.<init>(r8);	 Catch:{ FileNotFoundException -> 0x00a6, IOException -> 0x009f }
        r0 = r0.getChannel();	 Catch:{ FileNotFoundException -> 0x00a6, IOException -> 0x009f }
        r2 = 0;
        r4 = r1.size();	 Catch:{ FileNotFoundException -> 0x00ab, IOException -> 0x00a1, all -> 0x0095 }
        r0.transferFrom(r1, r2, r4);	 Catch:{ FileNotFoundException -> 0x00ab, IOException -> 0x00a1, all -> 0x0095 }
        if (r1 == 0) goto L_0x0036;
    L_0x0033:
        r1.close();	 Catch:{ IOException -> 0x0087 }
    L_0x0036:
        if (r0 == 0) goto L_0x003b;
    L_0x0038:
        r0.close();	 Catch:{ IOException -> 0x0089, SQLiteDatabaseCorruptException -> 0x003d }
    L_0x003b:
        monitor-exit(r7);	 Catch:{ all -> 0x003f }
        return;	 Catch:{ all -> 0x003f }
    L_0x003d:
        r0 = move-exception;	 Catch:{ all -> 0x003f }
        throw r0;	 Catch:{ all -> 0x003f }
    L_0x003f:
        r0 = move-exception;	 Catch:{ all -> 0x003f }
        monitor-exit(r7);	 Catch:{ all -> 0x003f }
        throw r0;
    L_0x0042:
        r0 = move-exception;
        r1 = r2;
    L_0x0044:
        r3 = z;	 Catch:{ all -> 0x009a }
        r4 = 17;	 Catch:{ all -> 0x009a }
        r3 = r3[r4];	 Catch:{ all -> 0x009a }
        com.whatsapp.util.Log.b(r3, r0);	 Catch:{ all -> 0x009a }
        if (r2 == 0) goto L_0x0052;
    L_0x004f:
        r2.close();	 Catch:{ IOException -> 0x008b }
    L_0x0052:
        if (r1 == 0) goto L_0x003b;
    L_0x0054:
        r1.close();	 Catch:{ IOException -> 0x0058, SQLiteDatabaseCorruptException -> 0x005a }
        goto L_0x003b;
    L_0x0058:
        r0 = move-exception;
        goto L_0x003b;
    L_0x005a:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x003f }
    L_0x005c:
        r0 = move-exception;
        r1 = r2;
    L_0x005e:
        r3 = z;	 Catch:{ all -> 0x0093 }
        r4 = 18;	 Catch:{ all -> 0x0093 }
        r3 = r3[r4];	 Catch:{ all -> 0x0093 }
        com.whatsapp.util.Log.b(r3, r0);	 Catch:{ all -> 0x0093 }
        if (r1 == 0) goto L_0x006c;
    L_0x0069:
        r1.close();	 Catch:{ IOException -> 0x008d }
    L_0x006c:
        if (r2 == 0) goto L_0x003b;
    L_0x006e:
        r2.close();	 Catch:{ IOException -> 0x0072, SQLiteDatabaseCorruptException -> 0x0074 }
        goto L_0x003b;
    L_0x0072:
        r0 = move-exception;
        goto L_0x003b;
    L_0x0074:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x003f }
    L_0x0076:
        r0 = move-exception;
        r1 = r2;
    L_0x0078:
        if (r1 == 0) goto L_0x007d;
    L_0x007a:
        r1.close();	 Catch:{ IOException -> 0x008f, SQLiteDatabaseCorruptException -> 0x0083 }
    L_0x007d:
        if (r2 == 0) goto L_0x0082;
    L_0x007f:
        r2.close();	 Catch:{ IOException -> 0x0091, SQLiteDatabaseCorruptException -> 0x0085 }
    L_0x0082:
        throw r0;	 Catch:{ all -> 0x003f }
    L_0x0083:
        r0 = move-exception;	 Catch:{ all -> 0x003f }
        throw r0;	 Catch:{ all -> 0x003f }
    L_0x0085:
        r0 = move-exception;	 Catch:{ all -> 0x003f }
        throw r0;	 Catch:{ all -> 0x003f }
    L_0x0087:
        r1 = move-exception;
        goto L_0x0036;
    L_0x0089:
        r0 = move-exception;
        goto L_0x003b;
    L_0x008b:
        r0 = move-exception;
        goto L_0x0052;
    L_0x008d:
        r0 = move-exception;
        goto L_0x006c;
    L_0x008f:
        r1 = move-exception;
        goto L_0x007d;
    L_0x0091:
        r1 = move-exception;
        goto L_0x0082;
    L_0x0093:
        r0 = move-exception;
        goto L_0x0078;
    L_0x0095:
        r2 = move-exception;
        r6 = r2;
        r2 = r0;
        r0 = r6;
        goto L_0x0078;
    L_0x009a:
        r0 = move-exception;
        r6 = r1;
        r1 = r2;
        r2 = r6;
        goto L_0x0078;
    L_0x009f:
        r0 = move-exception;
        goto L_0x005e;
    L_0x00a1:
        r2 = move-exception;
        r6 = r2;
        r2 = r0;
        r0 = r6;
        goto L_0x005e;
    L_0x00a6:
        r0 = move-exception;
        r6 = r2;
        r2 = r1;
        r1 = r6;
        goto L_0x0044;
    L_0x00ab:
        r2 = move-exception;
        r6 = r2;
        r2 = r1;
        r1 = r0;
        r0 = r6;
        goto L_0x0044;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.c.a(java.io.File):void");
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        Log.i(z[1]);
        a(sQLiteDatabase);
        c(sQLiteDatabase);
    }

    private File a() {
        File e = e();
        return new File(e.getPath(), e.getName() + z[19]);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Log.w(z[76] + i + z[77] + i2);
        onCreate(sQLiteDatabase);
    }

    private File e() {
        return this.a.getDatabasePath(z[0]);
    }
}
