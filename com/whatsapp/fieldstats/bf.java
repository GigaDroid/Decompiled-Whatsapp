package com.whatsapp.fieldstats;

import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public enum bf {
    ;
    
    public static final bf ADDRESSBOOK_SYNC;
    public static final bf ANDROID_PERF_EVENT;
    public static final bf ANDROID_PERF_HOME_ACTIVITY;
    public static final bf ANDROID_VACUUM_DB_CHECK_EVENT;
    public static final bf BACKUP;
    public static final bf BAN;
    public static final bf BBX_BBID_CALL;
    public static final bf BBX_HUB_UPDATE_INBOX;
    public static final bf BB_OPUS_DECODE;
    public static final bf BROADCAST_FANOUT;
    public static final bf CALL;
    public static final bf CALL_OFFER;
    public static final bf CDB_GET;
    public static final bf CDB_REGENERATION;
    public static final bf CHATD_ACKED_RETRIES;
    public static final bf CHATD_DROPPED_RETRIES;
    public static final bf CHATD_LAST_SEEN;
    public static final bf CHATD_OFFLINE_DELIVERY;
    public static final bf CHATD_OFFLINE_FETCH;
    public static final bf CHAT_CONNECTION;
    public static final bf CONTACT_US_SESSION;
    public static final bf CRASH_LOG;
    public static final bf DATABASE_ERROR;
    public static final bf E2E_MESSAGE_RECV;
    public static final bf E2E_MESSAGE_SEND;
    public static final bf E2E_RETRY_AFTER_DELIVERY;
    public static final bf FS_BUFFER;
    public static final bf GROUP_CREATE;
    public static final bf GROUP_MUTE;
    public static final bf IPHONE_BACKGROUND_FETCH;
    public static final bf IPHONE_FAILED_TO_LAUNCH;
    public static final bf I_CLOUD_AUTO_BACKUP_ERROR;
    public static final bf I_CLOUD_BACKUP;
    public static final bf I_CLOUD_RESTORE;
    public static final bf LOCATION_PICKER;
    public static final bf LOGIN;
    public static final bf MEDIA_DOWNLOAD;
    public static final bf MEDIA_UPLOAD;
    public static final bf MESSAGE_RECEIVE;
    public static final bf MESSAGE_SEND;
    public static final bf MMD_DOWNLOAD;
    public static final bf MMD_EVERSTORE_API_CALL;
    public static final bf MMD_EVERSTORE_EDGE_PATH;
    public static final bf NETWORK_CHANGE;
    public static final bf OFFLINE_MESSAGES;
    public static final bf OOM_MEMORY_HEAP_UPLOAD;
    public static final bf PAY_CHURN;
    public static final bf PAY_FREE_EXTENSION;
    public static final bf PAY_PAYMENT;
    public static final bf PLACES_API_QUERY;
    public static final bf PLAINTEXT_DELIVERY_BLOCKED;
    public static final bf PROFILE_PIC_DOWNLOAD;
    public static final bf PROFILE_PIC_UPLOAD;
    public static final bf PSEUDO_HTTP_SESSION;
    public static final bf PTT;
    public static final bf PUSH_RECEIVE;
    public static final bf RECEIPTS_RECV;
    public static final bf RECEIPTS_SEND;
    public static final bf REG_CODE;
    public static final bf REG_COST_EVENT;
    public static final bf REG_EXIST;
    public static final bf REG_REGISTER;
    public static final bf REG_SUMMARY;
    public static final bf RESTORE;
    public static final bf REVIEWED_BAN;
    public static final bf SUPPORT_EMAIL;
    public static final bf TEST;
    public static final bf UI_ACTION;
    public static final bf UI_USAGE;
    public static final bf UNBAN;
    public static final bf WEBC_AVAILABLE_CHANGE;
    public static final bf WEBC_BAD_L10N_KEY;
    public static final bf WEBC_CHAT_OPEN;
    public static final bf WEBC_IDB_OPEN;
    public static final bf WEBC_MANUAL_WEBSOCKET_ATTEMPT;
    public static final bf WEBC_MEDIA_ANALYZED;
    public static final bf WEBC_NOTIFICATION_SET;
    public static final bf WEBC_PAGE_LOAD;
    public static final bf WEBC_PAGE_RESUME;
    public static final bf WEBC_PHONE_DISCONNECTED;
    public static final bf WEBC_RESOURCE_LOAD;
    public static final bf WEBC_STREAM_INFO_CHANGE;
    public static final bf WEBC_STREAM_MODE_CHANGE;
    public static final bf WEBC_WAM_UPLOAD;
    public static final bf WEBC_WS_OPEN;
    public static final bf WEBC_WS_OPEN_TIMER;
    public static final bf WEBC_WS_TIMEOUT;
    public static final bf WEBD_PAGE_LOAD;
    public static final bf WEBD_PAGE_REQUEST;
    public static final bf WEBD_TERMINATE;
    public static final bf WEBD_UNNAMED_PAGE_LOAD;
    private static final bf[] a;
    private static final String[] z;
    private final int b;

    private bf(int i) {
        this.b = i;
    }

    static {
        String[] strArr = new String[91];
        String str = "\u0006cR\u0010<\u001axN\u000e6\u001ch^\u000e6";
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
                        i4 = 79;
                        break;
                    case at.g /*1*/:
                        i4 = 60;
                        break;
                    case at.i /*2*/:
                        i4 = 17;
                        break;
                    case at.o /*3*/:
                        i4 = 92;
                        break;
                    default:
                        i4 = 115;
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
                    str = "\u001auN\t \u000e{T";
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    i2 = 3;
                    str = "\u0018yS\u001f,\u0002}_\t2\u0003cF\u00191\u001csR\u00176\u001bcP\b'\nqA\b";
                    i = 2;
                    strArr2 = strArr3;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    i2 = 4;
                    str = "\u0006lY\u0013=\ncW\u001d:\u0003yU\u0003'\u0000c]\u001d&\u0001\u007fY";
                    i = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    str = "\u000b}E\u001d1\u000eoT\u00036\u001dn^\u000e";
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "\ftP\b7\u0010sW\u001a?\u0006rT\u00035\nhR\u0014";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "\u001fn^\u001a:\u0003yN\f:\fcD\f?\u0000}U";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "\u0018yS\u001f,\u001f}V\u0019,\u001dyB\t>\n";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "\bn^\t#\u0010\u007fC\u00192\u001by";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "\u0018yS\u001f,\u0002yU\u00152\u0010}_\u001d?\u0016fT\u0018";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "\u000erU\u000e<\u0006xN\f6\u001dzN\u0019%\nrE";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "\f}]\u0010";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "\u0018yS\u001f,\u001chC\u00192\u0002c\\\u00137\ncR\u00142\u0001{T";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    i2 = 14;
                    str = "\u0018yS\u0018,\u001ar_\u001d>\nxN\f2\byN\u0010<\u000ex";
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i2] = str;
                    i2 = 15;
                    str = "\ftP\b,\fs_\u00126\fhX\u0013=";
                    i = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i2] = str;
                    i2 = 16;
                    str = "\u0006cR\u0010<\u001axN\u001e2\fwD\f";
                    i = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i2] = str;
                    str = "\fs_\b2\fhN\t \u0010oT\u000f \u0006s_";
                    i = 16;
                    i2 = 17;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i2] = str;
                    i2 = 18;
                    strArr2 = strArr3;
                    str = "\u001dyR\u0019:\u001fhB\u0003 \nrU";
                    i = 17;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i2] = str;
                    i2 = 19;
                    str = "\u0018yS\u001f,\u001f}V\u0019,\u0003sP\u0018";
                    i = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i2] = str;
                    i2 = 20;
                    str = "\u0018yS\u001f,\u0018oN\u0013#\nr";
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i2] = str;
                    i2 = 21;
                    str = "\u0018yS\u001f,\u0018oN\b:\u0002y^\t'";
                    i = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i2] = str;
                    i2 = 22;
                    str = "\u0003sV\u0015=";
                    i = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i2] = str;
                    i2 = 23;
                    str = "\u001ciA\f<\u001dhN\u0019>\u000eu]";
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i2] = str;
                    i2 = 24;
                    str = "\u0018yS\u0018,\u001byC\u0011:\u0001}E\u0019";
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i2] = str;
                    i2 = 25;
                    str = "\u001foT\t7\u0000cY\b'\u001fcB\u0019 \u001cu^\u0012";
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i2] = str;
                    i2 = 26;
                    str = "\u001f}H\u00030\u0007iC\u0012";
                    i = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i2] = str;
                    i2 = 27;
                    str = "\bn^\t#\u0010qD\b6";
                    i = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i2] = str;
                    i2 = 28;
                    str = "\r~I\u00031\ruU\u00030\u000ep]";
                    i = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i2] = str;
                    i2 = 29;
                    str = "\u001dyR\u0019:\u001fhB\u0003!\n\u007fG";
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i2] = str;
                    i2 = 30;
                    str = "\u0018yS\u001f,\u001ft^\u00126\u0010xX\u000f0\u0000r_\u00190\u001byU";
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i2] = str;
                    i2 = 31;
                    str = "\u001dyV\u00030\u0000oE\u00036\u0019y_\b";
                    i = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i2] = str;
                    i2 = 32;
                    str = "\u0018yS\u001f,\u0001sE\u00155\u0006\u007fP\b:\u0000rN\u000f6\u001b";
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i2] = str;
                    i2 = 33;
                    str = "\u0002yB\u000f2\byN\u000f6\u0001x";
                    i = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i2] = str;
                    i2 = 34;
                    str = "\u0002qU\u00037\u0000k_\u0010<\u000ex";
                    i = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i2] = str;
                    i2 = 35;
                    str = "\u0003sR\u001d'\u0006s_\u0003#\u0006\u007fZ\u0019!";
                    i = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i2] = str;
                    i2 = 36;
                    str = "\u001byB\b";
                    i = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i2] = str;
                    i2 = 37;
                    str = "\fxS\u0003!\n{T\u00126\u001d}E\u0015<\u0001";
                    i = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i2] = str;
                    i2 = 38;
                    str = "\u000erU\u000e<\u0006xN\f6\u001dzN\u0014<\u0002yN\u001d0\u001buG\u0015'\u0016";
                    i = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i2] = str;
                    i2 = 39;
                    str = "\fxS\u00034\nh";
                    i = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i2] = str;
                    i2 = 40;
                    str = "\n\u000eT\u0003>\noB\u001d4\ncB\u0019=\u000b";
                    i = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i2] = str;
                    i2 = 41;
                    str = "\u001f}H\u00035\u001dyT\u00036\u0017hT\u0012 \u0006s_";
                    i = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i2] = str;
                    i2 = 42;
                    str = "\u001fpP\u001f6\u001ccP\f:\u0010mD\u0019!\u0016";
                    i = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i2] = str;
                    i2 = 43;
                    str = "\u001dyV\u00036\u0017uB\b";
                    i = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i2] = str;
                    i2 = 44;
                    str = "\u001dyG\u00156\u0018yU\u00031\u000er";
                    i = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i2] = str;
                    i2 = 45;
                    str = "\u0001yE\u000b<\u001dwN\u001f;\u000erV\u0019";
                    i = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i2] = str;
                    i2 = 46;
                    str = "\u0018yS\u001f,\u0018oN\u0013#\nrN\b:\u0002yC";
                    i = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i2] = str;
                    i2 = 47;
                    str = "\ftP\b7\u0010sW\u001a?\u0006rT\u00037\npX\n6\u001de";
                    i = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i2] = str;
                    i2 = 48;
                    str = "\u001f}H\u0003#\u000ee\\\u0019=\u001b";
                    i = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i2] = str;
                    i2 = 49;
                    str = "\u001arS\u001d=";
                    i = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i2] = str;
                    i2 = 50;
                    str = "\u0002qU\u00036\u0019yC\u000f'\u0000nT\u00036\u000b{T\u0003#\u000ehY";
                    i = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i2] = str;
                    i2 = 51;
                    str = "\u0000s\\\u0003>\nq^\u000e*\u0010tT\u001d#\u0010iA\u0010<\u000ex";
                    i = 50;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i2] = str;
                    i2 = 52;
                    str = "\rn^\u001d7\f}B\b,\t}_\u0013&\u001b";
                    i = 51;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i2] = str;
                    i2 = 53;
                    str = "\u0002yB\u000f2\byN\u000e6\fyX\n6";
                    i = 52;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i2] = str;
                    i2 = 54;
                    str = "\u001fpP\u0015=\u001byI\b,\u000by]\u0015%\nnH\u00031\u0003sR\u00176\u000b";
                    i = 53;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i2] = str;
                    i2 = 55;
                    str = "\u001dyV\u0003 \u001aq\\\u001d!\u0016";
                    i = 54;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i2] = str;
                    i2 = 56;
                    str = "\u0000zW\u0010:\u0001yN\u00116\u001coP\u001b6\u001c";
                    i = 55;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i2] = str;
                    i2 = 57;
                    str = "\u001fhE";
                    i = 56;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i2] = str;
                    i2 = 58;
                    str = "\u0018yS\u001f,\r}U\u0003?~\f_\u00038\ne";
                    i = 57;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i2] = str;
                    i2 = 59;
                    str = "\u0018yS\u001f,\u0018}\\\u0003&\u001fp^\u001d7";
                    i = 58;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i2] = str;
                    str = "\u0002yU\u00152\u0010x^\u000b=\u0003sP\u0018";
                    i = 59;
                    i2 = 60;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i2] = str;
                    i2 = 61;
                    strArr2 = strArr3;
                    str = "\u0018yS\u001f,\u000ejP\u0015?\u000e~]\u0019,\ftP\u00124\n";
                    i = 60;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i2] = str;
                    i2 = 62;
                    str = "\ftP\b7\u0010}R\u00176\u000bcC\u0019'\u001duT\u000f";
                    i = 61;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i2] = str;
                    i2 = 63;
                    str = "\r~N\u0013#\u001aoN\u00186\fsU\u0019";
                    i = 62;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i2] = str;
                    i2 = 64;
                    str = "\r}_";
                    i = 63;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i2] = str;
                    i2 = 65;
                    str = "\u001dyV\u0003!\n{X\u000f'\nn";
                    i = 64;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i2] = str;
                    i2 = 66;
                    str = "\u0018yS\u001f,\u001dyB\u0013&\u001d\u007fT\u0003?\u0000}U";
                    i = 65;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr2[i2] = str;
                    i2 = 67;
                    str = "\toN\u001e&\tzT\u000e";
                    i = 66;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    strArr2[i2] = str;
                    i2 = 68;
                    str = "\u0002qU\u00036\u0019yC\u000f'\u0000nT\u00032\u001fuN\u001f2\u0003p";
                    i = 67;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    strArr2[i2] = str;
                    i2 = 69;
                    str = "\u0018yS\u0018,\u001f}V\u0019,\u0003sP\u0018";
                    i = 68;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    strArr2[i2] = str;
                    i2 = 70;
                    str = "\u0018yS\u001f,\ftP\b,\u0000lT\u0012";
                    i = 69;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeight /*69*/:
                    strArr2[i2] = str;
                    i2 = 71;
                    str = "\n\u000eT\u0003!\nhC\u0005,\u000ezE\u0019!\u0010xT\u0010:\u0019yC\u0005";
                    i = 70;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightSmall /*70*/:
                    strArr2[i2] = str;
                    i2 = 72;
                    str = "\fnP\u000f;\u0010p^\u001b";
                    i = 71;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightLarge /*71*/:
                    strArr2[i2] = str;
                    i2 = 73;
                    str = "\u0018yS\u0018,\u001f}V\u0019,\u001dy@\t6\u001ch";
                    i = 72;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingLeft /*72*/:
                    strArr2[i2] = str;
                    i2 = 74;
                    str = "\u0006lY\u0013=\ncS\u001d0\u0004{C\u0013&\u0001xN\u001a6\u001b\u007fY";
                    i = 73;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingRight /*73*/:
                    strArr2[i2] = str;
                    i2 = 75;
                    str = "\n\u000eT\u0003>\noB\u001d4\ncC\u00190\u0019";
                    i = 74;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropDownListViewStyle /*74*/:
                    strArr2[i2] = str;
                    i2 = 76;
                    str = "\u001dyV\u00030\u0000xT";
                    i = 75;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPopupWindowStyle /*75*/:
                    strArr2[i2] = str;
                    i2 = 77;
                    str = "\r}R\u0017&\u001f";
                    i = 76;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItem /*76*/:
                    strArr2[i2] = str;
                    i2 = 78;
                    str = "\u001fn^\u001a:\u0003yN\f:\fcU\u0013$\u0001p^\u001d7";
                    i = 77;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItemSmall /*77*/:
                    strArr2[i2] = str;
                    str = "\r~I\u0003;\u001a~N\t#\u000b}E\u0019,\u0006rS\u0013+";
                    i = 78;
                    i2 = 79;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelBackground /*78*/:
                    strArr2[i2] = str;
                    i2 = 80;
                    strArr2 = strArr3;
                    str = "\u0018yS\u001f,\u0006xS\u0003<\u001fy_";
                    i = 79;
                    break;
                case arj.Theme_panelMenuListWidth /*79*/:
                    strArr2[i2] = str;
                    i2 = 81;
                    str = "\ftP\b7\u0010xC\u0013#\u001fyU\u0003!\nhC\u00156\u001c";
                    i = 80;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListTheme /*80*/:
                    strArr2[i2] = str;
                    i2 = 82;
                    str = "\u001dyB\b<\u001dy";
                    i = 81;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listChoiceBackgroundIndicator /*81*/:
                    strArr2[i2] = str;
                    i2 = 83;
                    str = "\u001auN\u001d0\u001bu^\u0012";
                    i = 82;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimary /*82*/:
                    strArr2[i2] = str;
                    i2 = 84;
                    str = "\u000exU\u000e6\u001coS\u0013<\u0004cB\u0005=\f";
                    i = 83;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimaryDark /*83*/:
                    strArr2[i2] = str;
                    i2 = 85;
                    str = "\u0002yU\u00152\u0010iA\u0010<\u000ex";
                    i = 84;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorAccent /*84*/:
                    strArr2[i2] = str;
                    i2 = 86;
                    str = "\u000erU\u000e<\u0006xN\n2\fiD\u0011,\u000b~N\u001f;\n\u007fZ\u00036\u0019y_\b";
                    i = 85;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlNormal /*85*/:
                    strArr2[i2] = str;
                    i2 = 87;
                    str = "\f}]\u0010,\u0000zW\u0019!";
                    i = 86;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlActivated /*86*/:
                    strArr2[i2] = str;
                    i2 = 88;
                    str = "\u001fiB\u0014,\u001dyR\u0019:\u0019y";
                    i = 87;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlHighlight /*87*/:
                    strArr2[i2] = str;
                    i2 = 89;
                    str = "\u0018yS\u001f,\u001chC\u00192\u0002cX\u00125\u0000cR\u00142\u0001{T";
                    i = 88;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorButtonNormal /*88*/:
                    strArr2[i2] = str;
                    i2 = 90;
                    str = "\ftP\b7\u0010pP\u000f'\u0010oT\u0019=";
                    i = 89;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorSwitchThumbNormal /*89*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    ADDRESSBOOK_SYNC = new bf(z[84], 0, 31);
                    ANDROID_PERF_EVENT = new bf(z[11], 1, 73);
                    ANDROID_PERF_HOME_ACTIVITY = new bf(z[38], 2, 70);
                    ANDROID_VACUUM_DB_CHECK_EVENT = new bf(z[86], 3, 85);
                    BACKUP = new bf(z[77], 4, 41);
                    BAN = new bf(z[64], 5, 47);
                    BB_OPUS_DECODE = new bf(z[63], 6, 55);
                    BBX_BBID_CALL = new bf(z[28], 7, 20);
                    BBX_HUB_UPDATE_INBOX = new bf(z[79], 8, 19);
                    BROADCAST_FANOUT = new bf(z[52], 9, 28);
                    CALL = new bf(z[12], 10, 15);
                    CALL_OFFER = new bf(z[87], 11, 16);
                    CDB_GET = new bf(z[39], 12, 27);
                    CDB_REGENERATION = new bf(z[37], 13, 26);
                    CHAT_CONNECTION = new bf(z[15], 14, 40);
                    CHATD_ACKED_RETRIES = new bf(z[62], 15, 74);
                    CHATD_DROPPED_RETRIES = new bf(z[81], 16, 77);
                    CHATD_LAST_SEEN = new bf(z[90], 17, 53);
                    CHATD_OFFLINE_DELIVERY = new bf(z[47], 18, 51);
                    CHATD_OFFLINE_FETCH = new bf(z[6], 19, 50);
                    CONTACT_US_SESSION = new bf(z[17], 20, 25);
                    CRASH_LOG = new bf(z[72], 21, 32);
                    DATABASE_ERROR = new bf(z[5], 22, 37);
                    E2E_MESSAGE_RECV = new bf(z[75], 23, 24);
                    E2E_MESSAGE_SEND = new bf(z[40], 24, 23);
                    E2E_RETRY_AFTER_DELIVERY = new bf(z[71], 25, 86);
                    FS_BUFFER = new bf(z[67], 26, 46);
                    GROUP_CREATE = new bf(z[9], 27, 52);
                    GROUP_MUTE = new bf(z[27], 28, 17);
                    I_CLOUD_AUTO_BACKUP_ERROR = new bf(z[1], 29, 36);
                    I_CLOUD_BACKUP = new bf(z[16], 30, 21);
                    I_CLOUD_RESTORE = new bf(z[0], 31, 35);
                    IPHONE_BACKGROUND_FETCH = new bf(z[74], 32, 38);
                    IPHONE_FAILED_TO_LAUNCH = new bf(z[4], 33, 39);
                    LOCATION_PICKER = new bf(z[35], 34, 43);
                    LOGIN = new bf(z[22], 35, 14);
                    MEDIA_DOWNLOAD = new bf(z[60], 36, 12);
                    MEDIA_UPLOAD = new bf(z[85], 37, 11);
                    MESSAGE_RECEIVE = new bf(z[53], 38, 10);
                    MESSAGE_SEND = new bf(z[33], 39, 9);
                    MMD_DOWNLOAD = new bf(z[34], 40, 8);
                    MMD_EVERSTORE_API_CALL = new bf(z[68], 41, 71);
                    MMD_EVERSTORE_EDGE_PATH = new bf(z[50], 42, 72);
                    NETWORK_CHANGE = new bf(z[45], 43, 75);
                    OFFLINE_MESSAGES = new bf(z[56], 44, 30);
                    OOM_MEMORY_HEAP_UPLOAD = new bf(z[51], 45, 69);
                    PAY_CHURN = new bf(z[26], 46, 6);
                    PAY_FREE_EXTENSION = new bf(z[41], 47, 5);
                    PAY_PAYMENT = new bf(z[48], 48, 4);
                    PLACES_API_QUERY = new bf(z[42], 49, 78);
                    PLAINTEXT_DELIVERY_BLOCKED = new bf(z[54], 50, 89);
                    PROFILE_PIC_DOWNLOAD = new bf(z[78], 51, 79);
                    PROFILE_PIC_UPLOAD = new bf(z[7], 52, 18);
                    PSEUDO_HTTP_SESSION = new bf(z[25], 53, 62);
                    PTT = new bf(z[57], 54, 13);
                    PUSH_RECEIVE = new bf(z[88], 55, 44);
                    RECEIPTS_RECV = new bf(z[29], 56, 33);
                    RECEIPTS_SEND = new bf(z[18], 57, 34);
                    REG_CODE = new bf(z[76], 58, 2);
                    REG_COST_EVENT = new bf(z[31], 59, 54);
                    REG_EXIST = new bf(z[43], 60, 1);
                    REG_REGISTER = new bf(z[65], 61, 3);
                    REG_SUMMARY = new bf(z[55], 62, 88);
                    RESTORE = new bf(z[82], 63, 42);
                    REVIEWED_BAN = new bf(z[44], 64, 49);
                    SUPPORT_EMAIL = new bf(z[23], 65, 7);
                    TEST = new bf(z[36], 66, 45);
                    UI_ACTION = new bf(z[83], 67, 22);
                    UI_USAGE = new bf(z[2], 68, 29);
                    UNBAN = new bf(z[49], 69, 48);
                    WEBC_AVAILABLE_CHANGE = new bf(z[61], 70, 68);
                    WEBC_BAD_L10N_KEY = new bf(z[58], 71, 81);
                    WEBC_CHAT_OPEN = new bf(z[70], 72, 80);
                    WEBC_IDB_OPEN = new bf(z[80], 73, 82);
                    WEBC_MANUAL_WEBSOCKET_ATTEMPT = new bf(z[3], 74, 87);
                    WEBC_MEDIA_ANALYZED = new bf(z[10], 75, 90);
                    WEBC_NOTIFICATION_SET = new bf(z[32], 76, 76);
                    WEBC_PAGE_LOAD = new bf(z[19], 77, 59);
                    WEBC_PAGE_RESUME = new bf(z[8], 78, 84);
                    WEBC_PHONE_DISCONNECTED = new bf(z[30], 79, 83);
                    WEBC_RESOURCE_LOAD = new bf(z[66], 80, 60);
                    WEBC_STREAM_INFO_CHANGE = new bf(z[89], 81, 66);
                    WEBC_STREAM_MODE_CHANGE = new bf(z[13], 82, 67);
                    WEBC_WAM_UPLOAD = new bf(z[59], 83, 91);
                    WEBC_WS_OPEN = new bf(z[20], 84, 64);
                    WEBC_WS_OPEN_TIMER = new bf(z[46], 85, 63);
                    WEBC_WS_TIMEOUT = new bf(z[21], 86, 65);
                    WEBD_PAGE_LOAD = new bf(z[69], 87, 56);
                    WEBD_PAGE_REQUEST = new bf(z[73], 88, 61);
                    WEBD_TERMINATE = new bf(z[24], 89, 58);
                    WEBD_UNNAMED_PAGE_LOAD = new bf(z[14], 90, 57);
                    a = new bf[]{ADDRESSBOOK_SYNC, ANDROID_PERF_EVENT, ANDROID_PERF_HOME_ACTIVITY, ANDROID_VACUUM_DB_CHECK_EVENT, BACKUP, BAN, BB_OPUS_DECODE, BBX_BBID_CALL, BBX_HUB_UPDATE_INBOX, BROADCAST_FANOUT, CALL, CALL_OFFER, CDB_GET, CDB_REGENERATION, CHAT_CONNECTION, CHATD_ACKED_RETRIES, CHATD_DROPPED_RETRIES, CHATD_LAST_SEEN, CHATD_OFFLINE_DELIVERY, CHATD_OFFLINE_FETCH, CONTACT_US_SESSION, CRASH_LOG, DATABASE_ERROR, E2E_MESSAGE_RECV, E2E_MESSAGE_SEND, E2E_RETRY_AFTER_DELIVERY, FS_BUFFER, GROUP_CREATE, GROUP_MUTE, I_CLOUD_AUTO_BACKUP_ERROR, I_CLOUD_BACKUP, I_CLOUD_RESTORE, IPHONE_BACKGROUND_FETCH, IPHONE_FAILED_TO_LAUNCH, LOCATION_PICKER, LOGIN, MEDIA_DOWNLOAD, MEDIA_UPLOAD, MESSAGE_RECEIVE, MESSAGE_SEND, MMD_DOWNLOAD, MMD_EVERSTORE_API_CALL, MMD_EVERSTORE_EDGE_PATH, NETWORK_CHANGE, OFFLINE_MESSAGES, OOM_MEMORY_HEAP_UPLOAD, PAY_CHURN, PAY_FREE_EXTENSION, PAY_PAYMENT, PLACES_API_QUERY, PLAINTEXT_DELIVERY_BLOCKED, PROFILE_PIC_DOWNLOAD, PROFILE_PIC_UPLOAD, PSEUDO_HTTP_SESSION, PTT, PUSH_RECEIVE, RECEIPTS_RECV, RECEIPTS_SEND, REG_CODE, REG_COST_EVENT, REG_EXIST, REG_REGISTER, REG_SUMMARY, RESTORE, REVIEWED_BAN, SUPPORT_EMAIL, TEST, UI_ACTION, UI_USAGE, UNBAN, WEBC_AVAILABLE_CHANGE, WEBC_BAD_L10N_KEY, WEBC_CHAT_OPEN, WEBC_IDB_OPEN, WEBC_MANUAL_WEBSOCKET_ATTEMPT, WEBC_MEDIA_ANALYZED, WEBC_NOTIFICATION_SET, WEBC_PAGE_LOAD, WEBC_PAGE_RESUME, WEBC_PHONE_DISCONNECTED, WEBC_RESOURCE_LOAD, WEBC_STREAM_INFO_CHANGE, WEBC_STREAM_MODE_CHANGE, WEBC_WAM_UPLOAD, WEBC_WS_OPEN, WEBC_WS_OPEN_TIMER, WEBC_WS_TIMEOUT, WEBD_PAGE_LOAD, WEBD_PAGE_REQUEST, WEBD_TERMINATE, WEBD_UNNAMED_PAGE_LOAD};
                    return;
                default:
                    strArr2[i2] = str;
                    str = "\u0006cR\u0010<\u001axN\u001d&\u001bsN\u001e2\fwD\f,\nnC\u0013!";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public int getCode() {
        return this.b;
    }
}
