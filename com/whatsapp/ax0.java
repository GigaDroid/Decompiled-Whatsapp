package com.whatsapp;

import com.whatsapp.proto.E2E.Message.VideoMessage;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class ax0 {
    private static final String[] z;

    static {
        String[] strArr = new String[58];
        String str = "\\8";
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
                        i3 = arj.Theme_spinnerStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 111;
                        break;
                    case at.o /*3*/:
                        i3 = 58;
                        break;
                    default:
                        i3 = 14;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "E8";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "A;";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "@5";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "T)";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "T9";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\\ ";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "V-";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "]'";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\\\"";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "E)";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "F+";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "R>";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    str = "_<";
                    obj = 13;
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    strArr2 = strArr3;
                    str = "W(";
                    obj = 14;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "Q)";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "@-";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "A>";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "V#";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "]\"";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    str = "\\(";
                    obj = 20;
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    strArr2 = strArr3;
                    str = "T8";
                    obj = 21;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "R.";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "W)";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "V%";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "V ";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "O-";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "F-";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "X5";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "F5";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "W-";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "R$";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "V$";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "V>";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "P/";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "C)";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "P?";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "M)";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "]>";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "\\>";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "G9";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "^>";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "X4";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "A$";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "P+";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "W>";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "V!";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "^6";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "V\"";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "T>";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "[ ";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "E'";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "S>";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "[+";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "_#";
                    obj = 54;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "Y.";
                    obj = 55;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "Q6";
                    obj = 56;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "@?";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static int b(int i) {
        switch (i) {
            case 57345:
                return 128102;
            case 57346:
                return 128103;
            case 57347:
                return 128139;
            case 57348:
                return 128104;
            case 57349:
                return 128105;
            case 57350:
                return 128085;
            case 57351:
                return 128095;
            case 57352:
                return 128247;
            case 57353:
                return 9742;
            case 57354:
                return 128241;
            case 57355:
                return 128224;
            case 57356:
                return 128187;
            case 57357:
                return 128074;
            case 57358:
                return 128077;
            case 57359:
                return 9757;
            case 57360:
                return 9994;
            case 57361:
                return 9996;
            case 57362:
                return 9995;
            case 57363:
                return 127935;
            case 57364:
                return 9971;
            case 57365:
                return 127934;
            case 57366:
                return 9918;
            case 57367:
                return 127940;
            case 57368:
                return 9917;
            case 57369:
                return 128031;
            case 57370:
                return 128052;
            case 57371:
                return 128663;
            case 57372:
                return 9973;
            case 57373:
                return 9992;
            case 57374:
                return 128643;
            case 57375:
                return 128645;
            case 57376:
                return 10067;
            case 57377:
                return 10071;
            case 57378:
                return 10084;
            case 57379:
                return 128148;
            case 57380:
                return 128336;
            case 57381:
                return 128337;
            case 57382:
                return 128338;
            case 57383:
                return 128339;
            case 57384:
                return 128340;
            case 57385:
                return 128341;
            case 57386:
                return 128342;
            case 57387:
                return 128343;
            case 57388:
                return 128344;
            case 57389:
                return 128345;
            case 57390:
                return 128346;
            case 57391:
                return 128347;
            case 57392:
                return 127800;
            case 57393:
                return 128305;
            case 57394:
                return 127801;
            case 57395:
                return 127876;
            case 57396:
                return 128141;
            case 57397:
                return 128142;
            case 57398:
                return 127968;
            case 57399:
                return 9962;
            case 57400:
                return 127970;
            case 57401:
                return 128649;
            case 57402:
                return 9981;
            case 57403:
                return 128507;
            case 57404:
                return 127908;
            case 57405:
                return 127909;
            case 57406:
                return 127925;
            case 57407:
                return 128273;
            case 57408:
                return 127927;
            case 57409:
                return 127928;
            case 57410:
                return 127930;
            case 57411:
                return 127860;
            case 57412:
                return 127864;
            case 57413:
                return 9749;
            case 57414:
                return 127856;
            case 57415:
                return 127866;
            case 57416:
                return 9924;
            case 57417:
                return 9729;
            case 57418:
                return 9728;
            case 57419:
                return 9748;
            case 57420:
                return 127769;
            case 57421:
                return 127748;
            case 57422:
                return 128124;
            case 57423:
                return 128049;
            case 57424:
                return 128047;
            case 57425:
                return 128059;
            case 57426:
                return 128054;
            case 57427:
                return 128045;
            case 57428:
                return 128051;
            case 57429:
                return 128039;
            case 57430:
                return 128522;
            case 57431:
                return 128515;
            case 57432:
                return 128542;
            case 57433:
                return 128544;
            case 57434:
                return 128169;
            case 57601:
                return 128235;
            case 57602:
                return 128238;
            case 57603:
                return 128233;
            case 57604:
                return 128242;
            case 57605:
                return 128540;
            case 57606:
                return 128525;
            case 57607:
                return 128561;
            case 57608:
                return 128531;
            case 57609:
                return 128053;
            case 57610:
                return 128025;
            case 57611:
                return 128055;
            case 57612:
                return 128125;
            case 57613:
                return 128640;
            case 57614:
                return 128081;
            case 57615:
                return 128161;
            case 57616:
                return 127808;
            case 57617:
                return 128143;
            case 57618:
                return 127873;
            case 57619:
                return 128299;
            case 57620:
                return 128269;
            case 57621:
                return 127939;
            case 57622:
                return 128296;
            case 57623:
                return 127878;
            case 57624:
                return 127809;
            case 57625:
                return 127810;
            case 57626:
                return 128127;
            case 57627:
                return 128123;
            case 57628:
                return 128128;
            case 57629:
                return 128293;
            case 57630:
                return 128188;
            case 57631:
                return 128186;
            case 57632:
                return 127828;
            case 57633:
                return 9970;
            case 57634:
                return 9978;
            case 57635:
                return 9832;
            case 57636:
                return 127905;
            case 57637:
                return 127915;
            case 57638:
                return 128191;
            case 57639:
                return 128192;
            case 57640:
                return 128251;
            case 57641:
                return 128252;
            case 57642:
                return 128250;
            case 57643:
                return 128126;
            case 57644:
                return 12349;
            case 57645:
                return 126980;
            case 57646:
                return 127386;
            case 57647:
                return 128176;
            case 57648:
                return 127919;
            case 57649:
                return 127942;
            case 57650:
                return 127937;
            case 57651:
                return 127920;
            case 57652:
                return 128014;
            case 57653:
                return 128676;
            case 57654:
                return 128690;
            case 57655:
                return 128679;
            case 57656:
                return 128697;
            case 57657:
                return 128698;
            case 57658:
                return 128700;
            case 57659:
                return 128137;
            case 57660:
                return 128164;
            case 57661:
                return 9889;
            case 57662:
                return 128096;
            case 57663:
                return 128704;
            case 57664:
                return 128701;
            case 57665:
                return 128266;
            case 57666:
                return 128226;
            case 57667:
                return 127884;
            case 57668:
                return 128274;
            case 57669:
                return 128275;
            case 57670:
                return 127750;
            case 57671:
                return 127859;
            case 57672:
                return 128214;
            case 57673:
                return 128177;
            case 57674:
                return 128185;
            case 57675:
                return 128225;
            case 57676:
                return 128170;
            case 57677:
                return 127974;
            case 57678:
                return 128677;
            case 57679:
                return 127359;
            case 57680:
                return 128655;
            case 57681:
                return 128699;
            case 57682:
                return 128110;
            case 57683:
                return 127971;
            case 57684:
                return 127975;
            case 57685:
                return 127973;
            case 57686:
                return 127978;
            case 57687:
                return 127979;
            case 57688:
                return 127976;
            case 57689:
                return 128652;
            case 57690:
                return 128661;
            case 57857:
                return 128694;
            case 57858:
                return 128674;
            case 57859:
                return 127489;
            case 57860:
                return 128159;
            case 57861:
                return 10036;
            case 57862:
                return 10035;
            case 57863:
                return 128286;
            case 57864:
                return 128685;
            case 57865:
                return 128304;
            case 57866:
                return 9855;
            case 57867:
                return 128246;
            case 57868:
                return 9829;
            case 57869:
                return 9830;
            case 57870:
                return 9824;
            case 57871:
                return 9827;
            case 57873:
                return 10175;
            case 57874:
                return 127381;
            case 57875:
                return 127385;
            case 57876:
                return 127378;
            case 57877:
                return 127542;
            case 57878:
                return 127514;
            case 57879:
                return 127543;
            case 57880:
                return 127544;
            case 57881:
                return 128308;
            case 57882:
                return 128306;
            case 57883:
                return 128307;
            case 57894:
                return 127568;
            case 57895:
                return 127545;
            case 57896:
                return 127490;
            case 57897:
                return 127380;
            case 57898:
                return 127541;
            case 57899:
                return 127539;
            case 57900:
                return 127535;
            case 57901:
                return 127546;
            case 57902:
                return 128070;
            case 57903:
                return 128071;
            case 57904:
                return 128072;
            case 57905:
                return 128073;
            case 57906:
                return 11014;
            case 57907:
                return 11015;
            case 57908:
                return 10145;
            case 57909:
                return 11013;
            case 57910:
                return 8599;
            case 57911:
                return 8598;
            case 57912:
                return 8600;
            case 57913:
                return 8601;
            case 57914:
                return 9654;
            case 57915:
                return 9664;
            case 57916:
                return 9193;
            case 57917:
                return 9194;
            case 57918:
                return 128303;
            case 57919:
                return 9800;
            case 57920:
                return 9801;
            case 57921:
                return 9802;
            case 57922:
                return 9803;
            case 57923:
                return 9804;
            case 57924:
                return 9805;
            case 57925:
                return 9806;
            case 57926:
                return 9807;
            case 57927:
                return 9808;
            case 57928:
                return 9809;
            case 57929:
                return 9810;
            case 57930:
                return 9811;
            case 57931:
                return 9934;
            case 57932:
                return 128285;
            case 57933:
                return 127383;
            case 57934:
                return 169;
            case 57935:
                return 174;
            case 57936:
                return 128243;
            case 57937:
                return 128244;
            case 57938:
                return 9888;
            case 57939:
                return 128129;
            case 58113:
                return 128221;
            case 58114:
                return 128084;
            case 58115:
                return 127802;
            case 58116:
                return 127799;
            case 58117:
                return 127803;
            case 58118:
                return 128144;
            case 58119:
                return 127796;
            case 58120:
                return 127797;
            case 58121:
                return 128702;
            case 58122:
                return 127911;
            case 58123:
                return 127862;
            case 58124:
                return 127867;
            case 58125:
                return 12951;
            case 58126:
                return 128684;
            case 58127:
                return 128138;
            case 58128:
                return 127880;
            case 58129:
                return 128163;
            case 58130:
                return 127881;
            case 58131:
                return 9986;
            case 58132:
                return 127872;
            case 58133:
                return 12953;
            case 58134:
                return 128189;
            case 58135:
                return 128227;
            case 58136:
                return 128082;
            case 58137:
                return 128087;
            case 58138:
                return 128097;
            case 58139:
                return 128098;
            case 58140:
                return 128132;
            case 58141:
                return 128133;
            case 58142:
                return 128134;
            case 58143:
                return 128135;
            case 58144:
                return 128136;
            case 58145:
                return 128088;
            case 58146:
                return 128089;
            case 58147:
                return 128092;
            case 58148:
                return 127916;
            case 58149:
                return 128276;
            case 58150:
                return 127926;
            case 58151:
                return 128147;
            case 58152:
                return 128151;
            case 58153:
                return 128152;
            case 58154:
                return 128153;
            case 58155:
                return 128154;
            case 58156:
                return 128155;
            case 58157:
                return 128156;
            case 58158:
                return 10024;
            case 58159:
                return 11088;
            case 58160:
                return 128168;
            case 58161:
                return 128166;
            case 58162:
                return 11093;
            case 58163:
                return 10060;
            case 58164:
                return 128162;
            case 58165:
                return 127775;
            case 58166:
                return 10068;
            case 58167:
                return 10069;
            case 58168:
                return 127861;
            case 58169:
                return 127838;
            case 58170:
                return 127846;
            case 58171:
                return 127839;
            case 58172:
                return 127841;
            case 58173:
                return 127832;
            case 58174:
                return 127834;
            case 58175:
                return 127837;
            case 58176:
                return 127836;
            case 58177:
                return 127835;
            case 58178:
                return 127833;
            case 58179:
                return 127842;
            case 58180:
                return 127843;
            case 58181:
                return 127822;
            case 58182:
                return 127818;
            case 58183:
                return 127827;
            case 58184:
                return 127817;
            case 58185:
                return 127813;
            case 58186:
                return 127814;
            case 58187:
                return 127874;
            case 58188:
                return 127857;
            case 58189:
                return 127858;
            case 58369:
                return 128549;
            case 58370:
                return 128527;
            case 58371:
                return 128532;
            case 58372:
                return 128513;
            case 58373:
                return 128521;
            case 58374:
                return 128547;
            case 58375:
                return 128534;
            case 58376:
                return 128554;
            case 58377:
                return 128541;
            case 58378:
                return 128524;
            case 58379:
                return 128552;
            case 58380:
                return 128567;
            case 58381:
                return 128563;
            case 58382:
                return 128530;
            case 58383:
                return 128560;
            case 58384:
                return 128562;
            case 58385:
                return 128557;
            case 58386:
                return 128514;
            case 58387:
                return 128546;
            case 58388:
                return 9786;
            case 58389:
                return 128516;
            case 58390:
                return 128545;
            case 58391:
                return 128538;
            case 58392:
                return 128536;
            case 58393:
                return 128064;
            case 58394:
                return 128067;
            case 58395:
                return 128066;
            case 58396:
                return 128068;
            case 58397:
                return 128591;
            case 58398:
                return 128075;
            case 58399:
                return 128079;
            case 58400:
                return 128076;
            case 58401:
                return 128078;
            case 58402:
                return 128080;
            case 58403:
                return 128581;
            case 58404:
                return 128582;
            case 58405:
                return 128145;
            case 58406:
                return 128583;
            case 58407:
                return 128588;
            case 58408:
                return 128107;
            case 58409:
                return 128111;
            case 58410:
                return 127936;
            case 58411:
                return 127944;
            case 58412:
                return 127921;
            case 58413:
                return 127946;
            case 58414:
                return 128665;
            case 58415:
                return 128666;
            case 58416:
                return 128658;
            case 58417:
                return 128657;
            case 58418:
                return 128659;
            case 58419:
                return 127906;
            case 58420:
                return 128647;
            case 58421:
                return 128644;
            case 58422:
                return 127885;
            case 58423:
                return 128157;
            case 58424:
                return 127886;
            case 58425:
                return 127891;
            case 58426:
                return 127890;
            case 58427:
                return 127887;
            case 58428:
                return 127746;
            case 58429:
                return 128146;
            case 58430:
                return 127754;
            case 58431:
                return 127847;
            case 58432:
                return 127879;
            case 58433:
                return 128026;
            case 58434:
                return 127888;
            case 58435:
                return 127744;
            case 58436:
                return 127806;
            case 58437:
                return 127875;
            case 58438:
                return 127889;
            case 58439:
                return 127811;
            case 58440:
                return 127877;
            case 58441:
                return 127749;
            case 58442:
                return 127751;
            case 58443:
                return 127747;
            case 58444:
                return 127752;
            case 58625:
                return 127977;
            case 58626:
                return 127912;
            case 58627:
                return 127913;
            case 58628:
                return 127980;
            case 58629:
                return 127983;
            case 58630:
                return 127984;
            case 58631:
                return 127910;
            case 58632:
                return 127981;
            case 58633:
                return 128508;
            case 58645:
                return 128113;
            case 58646:
                return 128114;
            case 58647:
                return 128115;
            case 58648:
                return 128116;
            case 58649:
                return 128117;
            case 58650:
                return 128118;
            case 58651:
                return 128119;
            case 58652:
                return 128120;
            case 58653:
                return 128509;
            case 58654:
                return 128130;
            case 58655:
                return 128131;
            case 58656:
                return 128044;
            case 58657:
                return 128038;
            case 58658:
                return 128032;
            case 58659:
                return 128036;
            case 58660:
                return 128057;
            case 58661:
                return 128027;
            case 58662:
                return 128024;
            case 58663:
                return 128040;
            case 58664:
                return 128018;
            case 58665:
                return 128017;
            case 58666:
                return 128058;
            case 58667:
                return 128046;
            case 58668:
                return 128048;
            case 58669:
                return 128013;
            case 58670:
                return 128020;
            case 58671:
                return 128023;
            case 58672:
                return 128043;
            case 58673:
                return 128056;
            case 58674:
                return 127344;
            case 58675:
                return 127345;
            case 58676:
                return 127374;
            case 58677:
                return 127358;
            case 58678:
                return 128099;
            case 58679:
                return 8482;
            default:
                return i;
        }
    }

    public static int[] a(int i) {
        String str;
        switch (i) {
            case 58635:
                str = z[14];
                break;
            case 58636:
                str = z[1];
                break;
            case 58637:
                str = z[53];
                break;
            case 58638:
                str = z[16];
                break;
            case 58639:
                str = z[0];
                break;
            case 58640:
                str = z[23];
                break;
            case 58641:
                str = z[37];
                break;
            case 58642:
                str = z[41];
                break;
            case 58643:
                str = z[49];
                break;
            case 58644:
                str = z[42];
                break;
            case 60417:
                str = z[10];
                break;
            case 60418:
                str = z[43];
                break;
            case 60419:
                str = z[46];
                break;
            case 60420:
                str = z[28];
                break;
            case 60421:
                str = z[27];
                break;
            case 60422:
                str = z[50];
                break;
            case 60423:
                str = z[51];
                break;
            case 60424:
                str = z[18];
                break;
            case 60425:
                str = z[29];
                break;
            case 60426:
                str = z[36];
                break;
            case 60427:
                str = z[19];
                break;
            case 60428:
                str = z[26];
                break;
            case 60429:
                str = z[9];
                break;
            case 60430:
                str = z[54];
                break;
            case 60431:
                str = z[33];
                break;
            case 60432:
                str = z[7];
                break;
            case 60433:
                str = z[44];
                break;
            case 60434:
                str = z[12];
                break;
            case 60435:
                str = z[5];
                break;
            case 60436:
                str = z[3];
                break;
            case 60437:
                str = z[45];
                break;
            case 60438:
                str = z[8];
                break;
            case 60439:
                str = z[21];
                break;
            case 60440:
                str = z[22];
                break;
            case 60441:
                str = z[6];
                break;
            case 60442:
                str = z[31];
                break;
            case 60443:
                str = z[24];
                break;
            case 60444:
                str = z[25];
                break;
            case 60445:
                str = z[47];
                break;
            case 60446:
                str = z[34];
                break;
            case 60447:
                str = z[57];
                break;
            case 60448:
                str = z[35];
                break;
            case 60449:
                str = z[32];
                break;
            case 60450:
                str = z[13];
                break;
            case 60451:
                str = z[20];
                break;
            case 60452:
                str = z[39];
                break;
            case 60453:
                str = z[40];
                break;
            case 60454:
                str = z[55];
                break;
            case 60455:
                str = z[48];
                break;
            case 60456:
                str = z[56];
                break;
            case 60457:
                str = z[11];
                break;
            case 60458:
                str = z[2];
                break;
            case 60459:
                str = z[30];
                break;
            case 60460:
                str = z[17];
                break;
            case 60461:
                str = z[4];
                break;
            case 60462:
                str = z[38];
                break;
            case 60463:
                str = z[52];
                break;
            case 60464:
                str = z[15];
                break;
            default:
                str = null;
                break;
        }
        if (str != null) {
            return new int[]{(str.charAt(0) + 127462) - 65, (str.charAt(1) + 127462) - 65};
        }
        switch (i) {
            case 57872:
                return new int[]{35, 8419};
            case 57884:
                return new int[]{49, 8419};
            case 57885:
                return new int[]{50, 8419};
            case 57886:
                return new int[]{51, 8419};
            case 57887:
                return new int[]{52, 8419};
            case 57888:
                return new int[]{53, 8419};
            case 57889:
                return new int[]{54, 8419};
            case 57890:
                return new int[]{55, 8419};
            case 57891:
                return new int[]{56, 8419};
            case 57892:
                return new int[]{57, 8419};
            case 57893:
                return new int[]{48, 8419};
            default:
                return null;
        }
    }
}
