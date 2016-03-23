package com.whatsapp.gdrive;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.whatsapp.App;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

final class b6 {
    private static final String[] z;
    private fs a;
    private File b;
    private final List c;
    private final String d;
    private JSONObject e;
    private final String f;
    private JSONObject g;
    private ConcurrentHashMap h;
    private final bc i;

    static {
        String[] strArr = new String[91];
        String str = "f\u0006z\u001c\u0001dMk\u0014\u001bbOi\u0005\u0007s\rpX\u0003n\u0016i\u0019Ze\r\u007f\u001b\u001bn\u0003lU\u0003n\u0016i\u0019Wr\u000br\u0010M";
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
                        i3 = 1;
                        break;
                    case at.g /*1*/:
                        i3 = 98;
                        break;
                    case at.i /*2*/:
                        i3 = 8;
                        break;
                    case at.o /*3*/:
                        i3 = 117;
                        break;
                    default:
                        i3 = 119;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "!\u0006j&\u001e{\u00072U";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "f\u0006z\u001c\u0001dMk\u0014\u001bbOi\u0005\u0007s\rpX\u0003n\u0016i\u0019Ze\r\u007f\u001b\u001bn\u0003lU\u0003n\u0016i\u0019$h\u0018mU\u001erBf\u0010\u0010`\u0016a\u0003\u0012/";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "!\u000bf\u0016\u001bt\u0006m1\u0015R\u000br\u0010M!";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u000bf\u001c\u0003,\u000fm\u0001\u0016";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u000bf\u001c\u0003,\u000fm\u0001\u0016!\u000fL\u0007\u001ew\u0007N\u001c\u001bdBa\u0006Wo\u0017d\u0019Y";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u0014a\u0011\u0012nO{\u001c\rdBe\u0010\u0003`\u0006i\u0001\u0016!\u000b{U\u0019t\u000ed[";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    str = "w\u000bl\u0010\u0018R\u000br\u0010";
                    obj = 7;
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    strArr2 = strArr3;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u000bf\u001c\u0003!\u0004g\u0000\u0019eBo\u0011\u0005h\u0014m*\u0011h\u000em*\u001a`\u0012(\u0017\u0002uB{\u0001\u001em\u000e(\u0001\u001fdBf\u0000\u001ac\u0007zU\u0018gBm\u001b\u0003s\u000bm\u0006Wh\f(\u0012\u0013s\u000b~\u00101h\u000em8\u0016qBa\u0006W{\u0007z\u001aY!5mU\u0000h\u000edU\u0010d\fm\u0007\u0016u\u0007(\u0014Wo\u0007\u007fU\u001a`\u0012(\u0017\u000e!\u0010m\u0014\u0013h\foU\u0016m\u000e(\u0010\u0019u\u0010a\u0010\u0004/";
                    obj = 8;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u000bf\u001c\u0003.\u0004a\u0019\u0012,\fg\u0001Zg\r}\u001b\u0013";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u000bf\u001c\u0003.\u0006g\u0002\u0019m\ri\u0011Zf\u0006z\u001c\u0001dOn\u001c\u001bdOe\u0014\u0007,\u0004a\u0019\u0012";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "!\u000b{U\u0004u\rz\u0010\u0013!\rfU\u001eo\u0016m\u0007\u0019`\u000e(\u0006\u0003n\u0010i\u0012\u0012-Bz\u0010\u0016eB{\u0001\u0018s\u0003o\u0010Wq\u0007z\u0018\u001er\u0011a\u001a\u0019!\u0001i\u001b\u0019n\u0016(\u001c\u0019u\u0007z\u0013\u0012s\u0007(\u0002\u001eu\n(\u0001\u001f`\u0016";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u000bf\u001c\u0003!\u0004i\u001c\u001bd\u0006(\u0001\u0018!\u0010m\u0014\u0013!\u0005l\u0007\u001ew\u0007N\u001c\u001bd/i\u0005Y";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u0001i\u0019\u0014,\u0003x\u0005\u0005n\u001a%\u0018\u0012e\u000biX\u0013n\u0015f\u0019\u0018`\u0006%\u0006\u001e{\u0007(\u0013\u001em\u0007(\u0000\u0007m\ri\u0011Wq\u0003|\u001dWh\u0011(\u001b\u0002m\u000e$U\u0002o\u0007p\u0005\u0012b\u0016m\u0011Y";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u0001i\u0019\u0014,\u0003x\u0005\u0005n\u001a%\u0018\u0012e\u000biX\u0013n\u0015f\u0019\u0018`\u0006%\u0006\u001e{\u0007'\u001c\u0019,\u000fm\u0011\u001e`On\u001a\u001be\u0007zU";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u0001i\u0019\u0014,\u0003x\u0005\u0005n\u001a%\u0018\u0012e\u000biX\u0013n\u0015f\u0019\u0018`\u0006(\u0000\u0019d\u001ax\u0010\u0014u\u0007lU\u0004h\u0016}\u0014\u0003h\rfYWi\r\u007fU\u0014`\f(\u0001\u0018C\u0007L\u001a\u0000o\u000eg\u0014\u0013d\u0006[\u0014\u001aq\u000em&\u001e{\u00075";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u0001i\u0019\u0014,\u0003x\u0005\u0005n\u001a%\u0018\u0012e\u000biX\u0013n\u0015f\u0019\u0018`\u0006%\u0006\u001e{\u0007'\u001c\u0019u\u0007z\u0007\u0002q\u0016m\u0011";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u0001i\u0019\u0014,\u0003x\u0005\u0005n\u001a%\u0018\u0012e\u000biX\u0013n\u0015f\u0019\u0018`\u0006%\u0006\u001e{\u0007'\u001b\u0018,\u000eg\u0016\u0016mOx\u0014\u0003iOe\u0014\u0007q\u000bf\u0012W";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "!\u0000mU\u0010s\u0007i\u0001\u0012sB|\u001d\u0016oB|\u001a\u0003`\u000e[\u0014\u001aq\u000em&\u001e{\u00075";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u0005m\u0001Zm\rk\u0014\u001b,\u0011m\u0001\u0003h\fo\u0006";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "m\rk\u0014\u001bR\u0007|\u0001\u001eo\u0005{";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u0005m\u0001Zm\rk\u0014\u001b,\u0011m\u0001\u0003h\fo\u0006Wl\u0007|\u0014\u0013`\u0016iU\u001erBf\u0000\u001bmL";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "c\u0003k\u001e\u0002q,m\u0001\u0000n\u0010c&\u0012u\u0016a\u001b\u0010r";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\fm\u0001\u0000n\u0010cX\u0004d\u0016|\u001c\u0019f\u0011(\u0018\u0012u\u0003l\u0014\u0003`Ba\u0006Wo\u0017d\u0019Y";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u0001`\u0014\u0003,\u0011a\u000f\u0012!\u000fm\u0001\u0016e\u0003|\u0014Wh\u0011(\u001b\u0002m\u000e&";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "b\ni\u0001\u0013c1a\u000f\u0012";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u0010m\u0014\u0013";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u0010m\u0014\u0013!\u0017f\u001e\u0019n\u0015fU\u0011h\u0007d\u0011M!";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u0010m\u0014\u0013!$A92^7X98@&W%6U*W3>D.LU\u0011h\u0007d\u0011Wh\u0011(\u0018\u001er\u0011a\u001b\u0010-Ba\u0012\u0019n\u0010a\u001b\u0010!\u0007f\u0001\u0005xL";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u0010m\u0014\u0013!/L@(G+M93!\u0004a\u0010\u001beBa\u0006Wl\u000b{\u0006\u001eo\u0005$U\u001ef\fg\u0007\u001eo\u0005(\u0010\u0019u\u0010q[";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u0010m\u0014\u0013!0M&(H&W3>D.LU\u0011h\u0007d\u0011Wh\u0011(\u0018\u001er\u0011a\u001b\u0010-Ba\u0012\u0019n\u0010a\u001b\u0010!\u0007f\u0001\u0005xL";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "f\u0006z\u001c\u0001d=n\u001c\u001bd=e\u0014\u0007!\u000b{U\u0014n\u0010z\u0000\u0007u";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "!\u0015a\u0001\u001f!\u0014i\u0019\u0002dX(";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u0010m\u0014\u0013";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u0010m\u0014\u0013!$A92^1A/2^$A0;EBn\u001c\u0012m\u0006(\u001c\u0004!\u000fa\u0006\u0004h\foYWh\u0005f\u001a\u0005h\foU\u0012o\u0016z\fY";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u0010m\u0014\u0013";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u0010m\u0014\u0013";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "o\u0017e:\u0011Q\ng\u0001\u0018r";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u0011i\u0003\u0012,\u0004a\u0019\u0012.\u000eg\u0016\u0016mO{\u0010\u0003u\u000bf\u0012\u0004!";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "m\rk\u0014\u001bR\u0007|\u0001\u001eo\u0005{";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "o\u0017e:\u0011L\u0007l\u001c\u0016G\u000bd\u0010\u0004";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "!\u0004z\u001a\u001a!\u0016`\u0010Wl\u0003x[";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "c\u0003k\u001e\u0002q1a\u000f\u0012";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "b\ni\u0001\u0013c1a\u000f\u0012";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "l\u0007l\u001c\u0016R\u000br\u0010";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u0011i\u0003\u0012,\u000fi\u0005Xu\u000be\u0010\u0018t\u0016%\u0002\u001fh\u000emX\u0000`\u000b|\u001c\u0019fM";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u0011i\u0003\u0012,\u0004a\u0019\u0012!\u000bo\u001b\u0018s\u0007lU\u0011h\u000emU\u0011s\reU\u0015d\u000bf\u0012Wh\f{\u0010\u0005u\u0007lU\u001eo\u0016gU\u0010e\u0010a\u0003\u0012!\u0004a\u0019\u0012!\u000fi\u0005M!";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u0011i\u0003\u0012,\u0004a\u0019\u0012";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "f\rg\u0012\u001bdBl\u0007\u001ew\u0007(\u001b\u0012f\u0003|\u001c\u0001dB{\u001c\rdBm\u001b\u0014n\u0017f\u0001\u0012s\u0007lU";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u0011i\u0003\u0012,\u0004a\u0019\u0012.\f}\u0018Zn\u0004%\u0005\u001fn\u0016g\u0006Zb\r}\u001b\u0003.";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u0011i\u0003\u0012,\u0004a\u0019\u0012.\u0001`\u0014\u0003,\u0006jX\u0004h\u0018mZ";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u0011i\u0003\u0012,\u0004a\u0019\u0012.\u0016g\u0001\u0016mO{\u001c\rdM";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "!\u0011a\u000f\u0012;B";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u0011i\u0003\u0012,\u0004a\u0019\u0012.\u0004a\u0019\u0012,\u0011a\u000f\u0012,\u000b{X\u0019n\u0016%\u0005\u0018r\u000b|\u001c\u0001d";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u0011i\u0003\u0012,\u0004a\u0019\u0012.\u0014a\u0011\u0012nO{\u001c\rdM";
                    obj = 54;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "f\u0006z\u001c\u0001d=n\u001c\u001bd=e\u0014\u0007";
                    obj = 55;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "w\u000bl\u0010\u0018R\u000br\u0010";
                    obj = 56;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u0011i\u0003\u0012,\u0004a\u0019\u0012.\fm\u0012\u0016u\u000b~\u0010Zr\u000br\u0010Wu\r|\u0014\u001b,\u0011a\u000f\u0012;GlU\u0014i\u0003|\u0011\u0015,\u0011a\u000f\u0012;GlU\u001ad\u0006a\u0014Zr\u000br\u0010M$\u0006(\u0003\u001ee\u0007gX\u0004h\u0018mORe";
                    obj = 57;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u0011i\u0003\u0012,\u0004a\u0019\u0012.\u000fm\u0011\u001e`O{\u001c\rdM";
                    obj = 58;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u0011i\u0003\u0012,\u000fi\u0005Ws\u0007e\u001a\u0001h\foU\u0019n\f%\u0010\u000fh\u0011|\u0010\u0019uB";
                    obj = 59;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u0011i\u0003\u0012,\u000fi\u0005Xt\fm\r\u0007d\u0001|\u0010\u0013,\u0004a\u0019\u0012,\u0017f\u0011\u0012sOe\u0010\u0013h\u0003%\u001c\u0019,\u000fi\u0005Xs\u0007e\u001a\u0001h\foX\u001euBx\u0014\u0003iX";
                    obj = 60;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u0011i\u0003\u0012,\u0004a\u0019\u0012.\f}\u0018Zn\u0004%\u0018\u0012e\u000biX\u0011h\u000em\u0006Zb\r}\u001b\u0003.";
                    obj = 61;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u0017x\u0011\u0016u\u0007%\u0011\u0005h\u0014mX\u0011h\u000emU";
                    obj = 62;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "!O6U";
                    obj = 63;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u0010m\u0018\u0018w\u0007'\u001b\u0018uOn\u001a\u0002o\u0006(";
                    obj = 64;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "c\u0003k\u001e\u0002q,m\u0001\u0000n\u0010c&\u0012u\u0016a\u001b\u0010r";
                    obj = 65;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "o\u0017e:\u0011L\u0007{\u0006\u0016f\u0007{";
                    obj = 66;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "h\fk\u0019\u0002e\u0007^\u001c\u0013d\r{<\u0019C\u0003k\u001e\u0002q";
                    obj = 67;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    strArr2[i] = str;
                    i = 69;
                    str = "c\u0003k\u001e\u0002q$z\u0010\u0006t\u0007f\u0016\u000e";
                    obj = 68;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    strArr2[i] = str;
                    i = 70;
                    str = "c\u0003k\u001e\u0002q4m\u0007\u0004h\rf";
                    obj = 69;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeight /*69*/:
                    strArr2[i] = str;
                    i = 71;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u0005m\u0001Zl\u0007|\u0014\u0013`\u0016iU\u001aO\u0007\u007f8\u0012u\u0003l\u0014\u0003`Ba\u0006Wo\u0017d\u0019[!\u0006a\u0011Wx\r}U\u0004`\u0014mU\u0010e\u0010a\u0003\u0012!\u0004a\u0019\u0012!\u000fi\u0005H";
                    obj = 70;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightSmall /*70*/:
                    strArr2[i] = str;
                    i = 72;
                    str = "f\u0006z\u001c\u0001d=n\u001c\u001bd=e\u0014\u0007";
                    obj = 71;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightLarge /*71*/:
                    strArr2[i] = str;
                    i = 73;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u0000i\u0016\u001ct\u0012%\u0013\u0005d\u0013}\u0010\u0019b\u001b(\u0018\u0012u\u0003l\u0014\u0003`Ba\u0006Wo\u0017d\u0019Y";
                    obj = 72;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingLeft /*72*/:
                    strArr2[i] = str;
                    i = 74;
                    str = "c\u0003k\u001e\u0002q$z\u0010\u0006t\u0007f\u0016\u000e";
                    obj = 73;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingRight /*73*/:
                    strArr2[i] = str;
                    i = 75;
                    str = "o\u0017e:\u0011L\u0007l\u001c\u0016G\u000bd\u0010\u0004";
                    obj = 74;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropDownListViewStyle /*74*/:
                    strArr2[i] = str;
                    i = 76;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\f}\u0018Zn\u0004%\u0018\u0012e\u000biX\u0011h\u000em\u0006Wl\u0007|\u0014\u0013`\u0016iU\u001erBf\u0000\u001bmL";
                    obj = 75;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPopupWindowStyle /*75*/:
                    strArr2[i] = str;
                    i = 77;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u000fm\u0011\u001e`O{\u001c\rdBe\u0010\u0003`\u0006i\u0001\u0016!\u000b{U\u0019t\u000ed[";
                    obj = 76;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItem /*76*/:
                    strArr2[i] = str;
                    i = 78;
                    str = "l\u0007l\u001c\u0016R\u000br\u0010";
                    obj = 77;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItemSmall /*77*/:
                    strArr2[i] = str;
                    i = 79;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u000fl@Zh\u0011%\u001b\u0002m\u000e'U";
                    obj = 78;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelBackground /*78*/:
                    strArr2[i] = str;
                    i = 80;
                    str = "c\u0003k\u001e\u0002q1a\u000f\u0012";
                    obj = 79;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListWidth /*79*/:
                    strArr2[i] = str;
                    i = 81;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u0006g\u0002\u0019m\ri\u0011Zr\u000br\u0010Wl\u0007|\u0014\u0013`\u0016iU\u001erBf\u0000\u001bmL";
                    obj = 80;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListTheme /*80*/:
                    strArr2[i] = str;
                    i = 82;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u000ea\u0006\u0003h\foX\u0016m\u000e%\u0010\u0019u\u0010a\u0010\u0004!\u0001}\u0007\u0005d\f|U\u0014n\u0017f\u0001Wn\u0004(\u0010\u0019u\u0010a\u0010\u0004!\u000bfU\u0010e\u0010a\u0003\u0012G\u000bd\u0010:`\u00122U";
                    obj = 81;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listChoiceBackgroundIndicator /*81*/:
                    strArr2[i] = str;
                    i = 83;
                    str = "!\u0005l\u0007\u001ew\u0007N\u001c\u001bd/i\u0005Yr\u000br\u0010M!";
                    obj = 82;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimary /*82*/:
                    strArr2[i] = str;
                    i = 84;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u000ea\u0006\u0003h\foX\u0016m\u000e%\u0010\u0019u\u0010a\u0010\u0004!\u0015mU\u001f`\u0014mU\u0003v\r(\u0013\u001em\u0007{U_e\u000bn\u0013\u0012s\u0007f\u0001Wl\u0006=\\Wv\u000b|\u001dWr\u0003e\u0010Wu\u000b|\u0019\u0012;B";
                    obj = 83;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimaryDark /*83*/:
                    strArr2[i] = str;
                    i = 85;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u000ea\u0006\u0003h\foX\u0016m\u000e%\u0010\u0019u\u0010a\u0010\u0004-B}\u001b\u0012y\u0012m\u0016\u0003d\u0006(\u0010\u0005s\rzYWo\u0017d\u0019Wu\u000b|\u0019\u0012!\u0004g\u0007Wg\u000bd\u0010W";
                    obj = 84;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorAccent /*84*/:
                    strArr2[i] = str;
                    i = 86;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u000ea\u0006\u0003h\foX\u0016m\u000e%\u0010\u0019u\u0010a\u0010\u0004.\u0001`\u0010\u0014j\u0011}\u0018Zh\u0011%\u001b\u0002m\u000e(";
                    obj = 85;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlNormal /*85*/:
                    strArr2[i] = str;
                    i = 87;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u000ea\u0006\u0003h\foX\u0016m\u000e%\u0010\u0019u\u0010a\u0010\u0004!\u0006z\u001c\u0001d#x\u001cYm\u000b{\u00011h\u000em\u0006W)\u0012z\u001c\u001a`\u0010qU\u0015`\u0011mU\u0011n\u000el\u0010\u0005-B{\u0010\u0014n\fl\u0014\u0005xBj\u0014\u0004dBn\u001a\u001be\u0007z\\Ws\u0007|\u0000\u0005o\u0007lU\u0019t\u000ed[";
                    obj = 86;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlActivated /*86*/:
                    strArr2[i] = str;
                    i = 88;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u000ea\u0006\u0003h\foX\u0016m\u000e%\u0010\u0019u\u0010a\u0010\u0004.\u0006}\u0005\u001bh\u0001i\u0001\u0012!";
                    obj = 87;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlHighlight /*87*/:
                    strArr2[i] = str;
                    i = 89;
                    str = "f\u0006z\u001c\u0001dOe\u0014\u0007.\u000bf\u0016\u001bt\u0006mX\u0001h\u0006m\u001a\u0004,\u0011m\u0001\u0003h\fo\u0006Wl\u0007|\u0014\u0013`\u0016iU\u001erBf\u0000\u001bmL";
                    obj = 88;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorButtonNormal /*88*/:
                    strArr2[i] = str;
                    i = 90;
                    str = "h\fk\u0019\u0002e\u0007^\u001c\u0013d\r{<\u0019C\u0003k\u001e\u0002q";
                    obj = 89;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorSwitchThumbNormal /*89*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "f\u0006z\u001c\u0001dMk\u0014\u001bbOi\u0005\u0007s\rpX\u0003n\u0016i\u0019Ze\r\u007f\u001b\u001bn\u0003lU\u0013c1a\u000f\u0012!\u000b{U\u0019d\u0005i\u0001\u001ew\u0007&";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(@android.support.annotation.NonNull com.whatsapp.gdrive.bs r9) {
        /*
        r8 = this;
        r1 = 1;
        r0 = 0;
        r3 = com.whatsapp.gdrive.GoogleDriveService.c;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r4 = z;
        r5 = 82;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r4 = r8.h;
        r4 = r4.size();
        r2 = r2.append(r4);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        r2 = r8.d;
        if (r2 == 0) goto L_0x003b;
    L_0x0028:
        r2 = r8.i;
        r4 = 2;
        r4 = new java.lang.String[r4];
        r5 = r8.f;
        r4[r0] = r5;
        r5 = r8.d;
        r4[r1] = r5;
        r2 = r2.a(r4, r9);
        if (r3 == 0) goto L_0x0047;
    L_0x003b:
        r2 = r8.i;
        r4 = new java.lang.String[r1];
        r5 = r8.f;
        r4[r0] = r5;
        r2 = r2.a(r4, r9);
    L_0x0047:
        if (r2 != 0) goto L_0x0055;
    L_0x0049:
        r1 = z;	 Catch:{ IllegalStateException -> 0x0053 }
        r2 = 87;
        r1 = r1[r2];	 Catch:{ IllegalStateException -> 0x0053 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ IllegalStateException -> 0x0053 }
    L_0x0052:
        return r0;
    L_0x0053:
        r0 = move-exception;
        throw r0;
    L_0x0055:
        r2 = r2.iterator();
    L_0x0059:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x0137;
    L_0x005f:
        r0 = r2.next();
        r0 = (com.whatsapp.gdrive.fs) r0;
        r4 = r0.e();	 Catch:{ IllegalStateException -> 0x013a }
        if (r4 != 0) goto L_0x008b;
    L_0x006b:
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x013c }
        r4.<init>();	 Catch:{ IllegalStateException -> 0x013c }
        r5 = z;	 Catch:{ IllegalStateException -> 0x013c }
        r6 = 85;
        r5 = r5[r6];	 Catch:{ IllegalStateException -> 0x013c }
        r4 = r4.append(r5);	 Catch:{ IllegalStateException -> 0x013c }
        r5 = r0.toString();	 Catch:{ IllegalStateException -> 0x013c }
        r4 = r4.append(r5);	 Catch:{ IllegalStateException -> 0x013c }
        r4 = r4.toString();	 Catch:{ IllegalStateException -> 0x013c }
        com.whatsapp.util.Log.e(r4);	 Catch:{ IllegalStateException -> 0x013c }
        if (r3 == 0) goto L_0x0135;
    L_0x008b:
        r4 = r0.e();	 Catch:{ IllegalStateException -> 0x013e }
        r4 = r8.b(r4);	 Catch:{ IllegalStateException -> 0x013e }
        if (r4 == 0) goto L_0x0132;
    L_0x0095:
        r4 = r0.h();	 Catch:{ IllegalStateException -> 0x0140 }
        if (r4 != 0) goto L_0x00b7;
    L_0x009b:
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0142 }
        r4.<init>();	 Catch:{ IllegalStateException -> 0x0142 }
        r5 = z;	 Catch:{ IllegalStateException -> 0x0142 }
        r6 = 86;
        r5 = r5[r6];	 Catch:{ IllegalStateException -> 0x0142 }
        r4 = r4.append(r5);	 Catch:{ IllegalStateException -> 0x0142 }
        r4 = r4.append(r0);	 Catch:{ IllegalStateException -> 0x0142 }
        r4 = r4.toString();	 Catch:{ IllegalStateException -> 0x0142 }
        com.whatsapp.util.Log.e(r4);	 Catch:{ IllegalStateException -> 0x0142 }
        if (r3 == 0) goto L_0x0135;
    L_0x00b7:
        r4 = r0.h();	 Catch:{ IllegalStateException -> 0x0144 }
        r5 = r0.e();	 Catch:{ IllegalStateException -> 0x0144 }
        r5 = r8.a(r5);	 Catch:{ IllegalStateException -> 0x0144 }
        r4 = r4.equals(r5);	 Catch:{ IllegalStateException -> 0x0144 }
        if (r4 == 0) goto L_0x00f9;
    L_0x00c9:
        r4 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x0144 }
        r4.<init>();	 Catch:{ IllegalStateException -> 0x0144 }
        r5 = z;	 Catch:{ IllegalStateException -> 0x0144 }
        r6 = 88;
        r5 = r5[r6];	 Catch:{ IllegalStateException -> 0x0144 }
        r4 = r4.append(r5);	 Catch:{ IllegalStateException -> 0x0144 }
        r4 = r4.append(r0);	 Catch:{ IllegalStateException -> 0x0144 }
        r5 = z;	 Catch:{ IllegalStateException -> 0x0144 }
        r6 = 83;
        r5 = r5[r6];	 Catch:{ IllegalStateException -> 0x0144 }
        r4 = r4.append(r5);	 Catch:{ IllegalStateException -> 0x0144 }
        r5 = r8.h;	 Catch:{ IllegalStateException -> 0x0144 }
        r5 = r5.size();	 Catch:{ IllegalStateException -> 0x0144 }
        r4 = r4.append(r5);	 Catch:{ IllegalStateException -> 0x0144 }
        r4 = r4.toString();	 Catch:{ IllegalStateException -> 0x0144 }
        com.whatsapp.util.Log.i(r4);	 Catch:{ IllegalStateException -> 0x0144 }
        if (r3 == 0) goto L_0x0135;
    L_0x00f9:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 84;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r5 = r0.e();
        r4 = r4.append(r5);
        r4 = r4.toString();
        com.whatsapp.util.Log.e(r4);
        r4 = r0.e();
        r4 = r8.c(r4);
        if (r4 == 0) goto L_0x012d;
    L_0x0121:
        r4 = r4.c();	 Catch:{ IllegalStateException -> 0x0146 }
        r6 = r0.c();	 Catch:{ IllegalStateException -> 0x0146 }
        r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r4 >= 0) goto L_0x0130;
    L_0x012d:
        r8.a(r0);	 Catch:{ IllegalStateException -> 0x0146 }
    L_0x0130:
        if (r3 == 0) goto L_0x0135;
    L_0x0132:
        r8.a(r0);	 Catch:{ IllegalStateException -> 0x0148 }
    L_0x0135:
        if (r3 == 0) goto L_0x0059;
    L_0x0137:
        r0 = r1;
        goto L_0x0052;
    L_0x013a:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x013c }
    L_0x013c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x013e }
    L_0x013e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0140 }
    L_0x0140:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0142 }
    L_0x0142:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0144 }
    L_0x0144:
        r0 = move-exception;
        throw r0;
    L_0x0146:
        r0 = move-exception;
        throw r0;
    L_0x0148:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.b6.a(com.whatsapp.gdrive.bs):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long a(long r20, boolean r22, java.util.concurrent.BlockingQueue r23, java.util.concurrent.atomic.AtomicBoolean r24) {
        /*
        r19 = this;
        r7 = com.whatsapp.gdrive.GoogleDriveService.c;
        r2 = com.whatsapp.dg.g();	 Catch:{ IOException -> 0x000d }
        r2 = r2.exists();	 Catch:{ IOException -> 0x000d }
        if (r2 != 0) goto L_0x000f;
    L_0x000c:
        return r20;
    L_0x000d:
        r2 = move-exception;
        throw r2;
    L_0x000f:
        r8 = new java.util.concurrent.atomic.AtomicLong;
        r2 = 0;
        r8.<init>(r2);
        r9 = new java.util.concurrent.atomic.AtomicLong;
        r2 = 0;
        r9.<init>(r2);
        r0 = r19;
        r2 = r0.h;
        r2 = r2.keySet();
        r0 = r19;
        r3 = r0.h;
        r3 = r3.size();
        r3 = new java.lang.String[r3];
        r2 = r2.toArray(r3);
        r2 = (java.lang.String[]) r2;
        r3 = 20;
        r0 = r19;
        r4 = r0.h;
        r4 = r4.size();
        r5 = 10;
        if (r4 >= r5) goto L_0x01d8;
    L_0x0043:
        r3 = 1;
        r4 = r3;
    L_0x0045:
        r10 = new java.util.concurrent.atomic.AtomicLong;
        r3 = r2.length;
        r12 = (long) r3;
        r10.<init>(r12);
        r3 = 0;
        r5 = r3;
    L_0x004e:
        r3 = r2.length;
        if (r5 >= r3) goto L_0x0121;
    L_0x0051:
        r3 = r24.get();	 Catch:{ IOException -> 0x0063 }
        if (r3 == 0) goto L_0x0065;
    L_0x0057:
        r2 = z;	 Catch:{ IOException -> 0x0063 }
        r3 = 17;
        r2 = r2[r3];	 Catch:{ IOException -> 0x0063 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ IOException -> 0x0063 }
        r20 = -1;
        goto L_0x000c;
    L_0x0063:
        r2 = move-exception;
        throw r2;
    L_0x0065:
        r3 = r2[r5];
        if (r3 != 0) goto L_0x0074;
    L_0x0069:
        r6 = z;	 Catch:{ IOException -> 0x0169 }
        r11 = 14;
        r6 = r6[r11];	 Catch:{ IOException -> 0x0169 }
        com.whatsapp.util.Log.e(r6);	 Catch:{ IOException -> 0x0169 }
        if (r7 == 0) goto L_0x011d;
    L_0x0074:
        r11 = com.whatsapp.gdrive.fn.c(r3);
        if (r11 != 0) goto L_0x0096;
    L_0x007a:
        r6 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x016b }
        r6.<init>();	 Catch:{ IOException -> 0x016b }
        r12 = z;	 Catch:{ IOException -> 0x016b }
        r13 = 18;
        r12 = r12[r13];	 Catch:{ IOException -> 0x016b }
        r6 = r6.append(r12);	 Catch:{ IOException -> 0x016b }
        r6 = r6.append(r3);	 Catch:{ IOException -> 0x016b }
        r6 = r6.toString();	 Catch:{ IOException -> 0x016b }
        com.whatsapp.util.Log.i(r6);	 Catch:{ IOException -> 0x016b }
        if (r7 == 0) goto L_0x011d;
    L_0x0096:
        r0 = r19;
        r6 = r0.h;
        r3 = r6.get(r3);
        r3 = (com.whatsapp.gdrive.fs) r3;
        r12 = new java.io.File;
        r12.<init>(r11);
        r6 = com.whatsapp.dg.d(r12);	 Catch:{ IOException -> 0x016d }
    L_0x00a9:
        if (r6 != 0) goto L_0x00b2;
    L_0x00ab:
        r14 = -1;
        r10.addAndGet(r14);	 Catch:{ IOException -> 0x018b }
        if (r7 == 0) goto L_0x011d;
    L_0x00b2:
        r6 = r12.exists();	 Catch:{ IOException -> 0x018d }
        if (r6 == 0) goto L_0x00c2;
    L_0x00b8:
        r14 = r12.length();	 Catch:{ IOException -> 0x018f }
        r16 = 0;
        r6 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1));
        if (r6 != 0) goto L_0x00e7;
    L_0x00c2:
        r14 = r3.b();	 Catch:{ IOException -> 0x0191 }
        r8.addAndGet(r14);	 Catch:{ IOException -> 0x0191 }
        r14 = r3.b();	 Catch:{ IOException -> 0x0191 }
        r9.addAndGet(r14);	 Catch:{ IOException -> 0x0191 }
        r6 = r23.isEmpty();	 Catch:{ IOException -> 0x0191 }
        if (r6 == 0) goto L_0x00e0;
    L_0x00d6:
        r6 = 0;
        r6 = java.lang.Boolean.valueOf(r6);	 Catch:{ IOException -> 0x0191 }
        r0 = r23;
        r0.add(r6);	 Catch:{ IOException -> 0x0191 }
    L_0x00e0:
        r14 = -1;
        r10.addAndGet(r14);	 Catch:{ IOException -> 0x0193 }
        if (r7 == 0) goto L_0x011d;
    L_0x00e7:
        r6 = r12.exists();	 Catch:{ IOException -> 0x0195 }
        if (r6 == 0) goto L_0x00fd;
    L_0x00ed:
        if (r22 != 0) goto L_0x00fd;
    L_0x00ef:
        r12 = r3.b();	 Catch:{ IOException -> 0x0199 }
        r8.addAndGet(r12);	 Catch:{ IOException -> 0x0199 }
        r12 = -1;
        r10.addAndGet(r12);	 Catch:{ IOException -> 0x0199 }
        if (r7 == 0) goto L_0x011d;
    L_0x00fd:
        r6 = r5 % r4;
        if (r6 == 0) goto L_0x0108;
    L_0x0101:
        r12 = -1;
        r10.addAndGet(r12);	 Catch:{ IOException -> 0x019b }
        if (r7 == 0) goto L_0x011d;
    L_0x0108:
        r12 = r3.b();
        r8.addAndGet(r12);
        r0 = r19;
        r6 = r0.a(r11, r3);
        switch(r6) {
            case 1: goto L_0x019d;
            case 2: goto L_0x0118;
            case 3: goto L_0x0118;
            case 4: goto L_0x019f;
            default: goto L_0x0118;
        };
    L_0x0118:
        r12 = -1;
        r10.addAndGet(r12);
    L_0x011d:
        r3 = r5 + 1;
        if (r7 == 0) goto L_0x01d5;
    L_0x0121:
        r2 = r8.get();	 Catch:{ IOException -> 0x01ba }
        r4 = 0;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 != 0) goto L_0x01be;
    L_0x012b:
        r2 = r9.get();	 Catch:{ IOException -> 0x01bc }
        r4 = 0;
        r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r2 <= 0) goto L_0x0165;
    L_0x0135:
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x01bc }
        r2.<init>();	 Catch:{ IOException -> 0x01bc }
        r3 = z;	 Catch:{ IOException -> 0x01bc }
        r4 = 16;
        r3 = r3[r4];	 Catch:{ IOException -> 0x01bc }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x01bc }
        r4 = r9.get();	 Catch:{ IOException -> 0x01bc }
        r2 = r2.append(r4);	 Catch:{ IOException -> 0x01bc }
        r3 = z;	 Catch:{ IOException -> 0x01bc }
        r4 = 19;
        r3 = r3[r4];	 Catch:{ IOException -> 0x01bc }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x01bc }
        r4 = r8.get();	 Catch:{ IOException -> 0x01bc }
        r2 = r2.append(r4);	 Catch:{ IOException -> 0x01bc }
        r2 = r2.toString();	 Catch:{ IOException -> 0x01bc }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IOException -> 0x01bc }
    L_0x0165:
        r20 = 0;
        goto L_0x000c;
    L_0x0169:
        r2 = move-exception;
        throw r2;
    L_0x016b:
        r2 = move-exception;
        throw r2;
    L_0x016d:
        r6 = move-exception;
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r13 = z;
        r14 = 15;
        r13 = r13[r14];
        r6 = r6.append(r13);
        r6 = r6.append(r12);
        r6 = r6.toString();
        com.whatsapp.util.Log.e(r6);
        r6 = 0;
        goto L_0x00a9;
    L_0x018b:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x018d }
    L_0x018d:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x018f }
    L_0x018f:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0191 }
    L_0x0191:
        r2 = move-exception;
        throw r2;
    L_0x0193:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0195 }
    L_0x0195:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0197 }
    L_0x0197:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0199 }
    L_0x0199:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x019b }
    L_0x019b:
        r2 = move-exception;
        throw r2;
    L_0x019d:
        if (r7 == 0) goto L_0x0118;
    L_0x019f:
        r12 = r3.b();	 Catch:{ IOException -> 0x01b8 }
        r9.addAndGet(r12);	 Catch:{ IOException -> 0x01b8 }
        r3 = r23.isEmpty();	 Catch:{ IOException -> 0x01b8 }
        if (r3 == 0) goto L_0x0118;
    L_0x01ac:
        r3 = 0;
        r3 = java.lang.Boolean.valueOf(r3);	 Catch:{ IOException -> 0x01b8 }
        r0 = r23;
        r0.add(r3);	 Catch:{ IOException -> 0x01b8 }
        goto L_0x0118;
    L_0x01b8:
        r2 = move-exception;
        throw r2;
    L_0x01ba:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x01bc }
    L_0x01bc:
        r2 = move-exception;
        throw r2;
    L_0x01be:
        r2 = r9.get();
        r2 = (double) r2;
        r4 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        r2 = r2 * r4;
        r4 = r8.get();
        r4 = (double) r4;
        r2 = r2 / r4;
        r0 = r20;
        r4 = (double) r0;
        r2 = r2 * r4;
        r0 = (long) r2;
        r20 = r0;
        goto L_0x000c;
    L_0x01d5:
        r5 = r3;
        goto L_0x004e;
    L_0x01d8:
        r4 = r3;
        goto L_0x0045;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.b6.a(long, boolean, java.util.concurrent.BlockingQueue, java.util.concurrent.atomic.AtomicBoolean):long");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean a(boolean r5, @android.support.annotation.NonNull com.whatsapp.gdrive.bs r6) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = new java.util.concurrent.ConcurrentHashMap;	 Catch:{ ez -> 0x0010 }
        r0.<init>();	 Catch:{ ez -> 0x0010 }
        r4.h = r0;	 Catch:{ ez -> 0x0010 }
        if (r5 == 0) goto L_0x0015;
    L_0x000a:
        r0 = r4.a(r6);	 Catch:{ ez -> 0x0010 }
    L_0x000e:
        monitor-exit(r4);
        return r0;
    L_0x0010:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0012 }
    L_0x0012:
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
    L_0x0015:
        r0 = r4.a;	 Catch:{ ez -> 0x001e }
        if (r0 != 0) goto L_0x0020;
    L_0x0019:
        r0 = r4.a(r6);	 Catch:{ ez -> 0x001e }
        goto L_0x000e;
    L_0x001e:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0012 }
    L_0x0020:
        r0 = r4.b;	 Catch:{ ez -> 0x0048 }
        r0 = com.whatsapp.gdrive.fn.a(r0);	 Catch:{ ez -> 0x0048 }
        if (r0 == 0) goto L_0x006c;
    L_0x0028:
        r1 = r4.a;	 Catch:{ ez -> 0x0068 }
        r1 = r1.h();	 Catch:{ ez -> 0x0068 }
        r0 = r0.equals(r1);	 Catch:{ ez -> 0x0068 }
        if (r0 == 0) goto L_0x006c;
    L_0x0034:
        r0 = r4.p();	 Catch:{ ez -> 0x00a1 }
        if (r0 != 0) goto L_0x00a3;
    L_0x003a:
        r0 = z;	 Catch:{ ez -> 0x00a1 }
        r1 = 13;
        r0 = r0[r1];	 Catch:{ ez -> 0x00a1 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ ez -> 0x00a1 }
        r0 = r4.a(r6);	 Catch:{ ez -> 0x00a1 }
        goto L_0x000e;
    L_0x0048:
        r0 = move-exception;
        r0 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0012 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0012 }
        r1.<init>();	 Catch:{ all -> 0x0012 }
        r2 = r4.b;	 Catch:{ all -> 0x0012 }
        r1 = r1.append(r2);	 Catch:{ all -> 0x0012 }
        r2 = z;	 Catch:{ all -> 0x0012 }
        r3 = 12;
        r2 = r2[r3];	 Catch:{ all -> 0x0012 }
        r1 = r1.append(r2);	 Catch:{ all -> 0x0012 }
        r1 = r1.toString();	 Catch:{ all -> 0x0012 }
        r0.<init>(r1);	 Catch:{ all -> 0x0012 }
        throw r0;	 Catch:{ all -> 0x0012 }
    L_0x0068:
        r0 = move-exception;
        throw r0;	 Catch:{ ez -> 0x006a }
    L_0x006a:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0012 }
    L_0x006c:
        r0 = new com.whatsapp.gdrive.k;	 Catch:{ ee -> 0x00bf, ez -> 0x008f }
        r0.<init>(r4);	 Catch:{ ee -> 0x00bf, ez -> 0x008f }
        r1 = z;	 Catch:{ ee -> 0x00bf, ez -> 0x008f }
        r2 = 11;
        r1 = r1[r2];	 Catch:{ ee -> 0x00bf, ez -> 0x008f }
        r0 = com.whatsapp.gdrive.by.a(r6, r0, r1);	 Catch:{ ee -> 0x00bf, ez -> 0x008f }
        r0 = (java.lang.Boolean) r0;	 Catch:{ ee -> 0x00bf, ez -> 0x008f }
        if (r0 != 0) goto L_0x0084;
    L_0x007f:
        r0 = 0;
        r0 = java.lang.Boolean.valueOf(r0);	 Catch:{ ee -> 0x00bf, ez -> 0x008f }
    L_0x0084:
        r0 = r0.booleanValue();	 Catch:{ ez -> 0x009f }
        if (r0 != 0) goto L_0x0034;
    L_0x008a:
        r0 = r4.a(r6);	 Catch:{ ez -> 0x009f }
        goto L_0x000e;
    L_0x008f:
        r0 = move-exception;
    L_0x0090:
        r1 = z;	 Catch:{ all -> 0x0012 }
        r2 = 10;
        r1 = r1[r2];	 Catch:{ all -> 0x0012 }
        com.whatsapp.util.Log.b(r1, r0);	 Catch:{ all -> 0x0012 }
        r0 = 0;
        r0 = java.lang.Boolean.valueOf(r0);	 Catch:{ all -> 0x0012 }
        goto L_0x0084;
    L_0x009f:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0012 }
    L_0x00a1:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0012 }
    L_0x00a3:
        r0 = r4.h;	 Catch:{ ez -> 0x00ba }
        r0 = r0.size();	 Catch:{ ez -> 0x00ba }
        if (r0 != 0) goto L_0x00bc;
    L_0x00ab:
        r0 = z;	 Catch:{ ez -> 0x00ba }
        r1 = 9;
        r0 = r0[r1];	 Catch:{ ez -> 0x00ba }
        com.whatsapp.util.Log.e(r0);	 Catch:{ ez -> 0x00ba }
        r0 = r4.a(r6);	 Catch:{ ez -> 0x00ba }
        goto L_0x000e;
    L_0x00ba:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0012 }
    L_0x00bc:
        r0 = 1;
        goto L_0x000e;
    L_0x00bf:
        r0 = move-exception;
        goto L_0x0090;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.b6.a(boolean, com.whatsapp.gdrive.bs):boolean");
    }

    public JSONObject g() {
        JSONObject jSONObject = null;
        try {
            if (this.g != null) {
                try {
                    jSONObject = this.g.getJSONObject(z[21]);
                } catch (Throwable e) {
                    Log.b(z[20], e);
                }
            } else {
                Log.e(z[22]);
            }
            return jSONObject;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public void f() {
        this.c.clear();
    }

    private String a(String str) {
        fs fsVar = (fs) this.h.get(str);
        if (fsVar == null) {
            return null;
        }
        try {
            return fsVar.h();
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public Set s() {
        return this.h.keySet();
    }

    public int n() {
        int i = -1;
        try {
            if (this.g != null) {
                i = this.g.optInt(z[23], -1);
            } else {
                Log.e(z[24]);
            }
            return i;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private boolean o() {
        try {
            if (this.a != null) {
                try {
                    this.g = new JSONObject(this.a.i());
                    this.e = null;
                    return true;
                } catch (Throwable e) {
                    Log.b(z[5], e);
                    return false;
                }
            }
            Log.e(z[6]);
            return false;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public long q() {
        try {
            return this.b.exists() ? this.b.length() : -1;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public int i() {
        return this.h.size();
    }

    public long j() {
        long j = -1;
        try {
            if (this.g != null) {
                j = this.g.optLong(z[80], -1);
            } else {
                Log.e(z[81]);
            }
            return j;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public long m() {
        long j = -1;
        try {
            if (this.g != null) {
                j = this.g.optLong(z[8], -1);
            } else {
                Log.e(z[7]);
            }
            return j;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public boolean h() {
        boolean z = true;
        try {
            if (this.g != null) {
                z = this.g.optBoolean(z[90], true);
            } else {
                Log.e(z[89]);
            }
            return z;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public long a(boolean z, long j, @NonNull BlockingQueue blockingQueue, @NonNull AtomicBoolean atomicBoolean, @NonNull bs bsVar) {
        try {
            long j2;
            if (this.h == null) {
                a(false, bsVar);
            }
            long b = b();
            if (z) {
                j2 = b;
            } else {
                j2 = 0;
            }
            if (j2 > 0) {
                try {
                    blockingQueue.add(Boolean.valueOf(false));
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
            try {
                Log.i(z[0] + j + z[2] + b + z[4] + z);
                if (j < 0) {
                    Log.e(z[3]);
                }
                if (b < 0) {
                    try {
                        Log.e(z[1]);
                    } catch (IllegalStateException e2) {
                        throw e2;
                    }
                }
                long a = j2 + a(j - b, z, blockingQueue, atomicBoolean);
                try {
                    if (blockingQueue.isEmpty()) {
                        boolean z2;
                        if (a == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        blockingQueue.add(Boolean.valueOf(z2));
                    }
                    return a;
                } catch (IllegalStateException e22) {
                    throw e22;
                } catch (IllegalStateException e222) {
                    throw e222;
                }
            } catch (IllegalStateException e2222) {
                throw e2222;
            }
        } catch (IllegalStateException e22222) {
            throw e22222;
        }
    }

    public Collection d() {
        return this.h.values();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File b(@android.support.annotation.NonNull com.whatsapp.gdrive.bs r26) {
        /*
        r25 = this;
        r14 = com.whatsapp.gdrive.GoogleDriveService.c;
        r4 = 0;
        r2 = new org.json.JSONObject;
        r2.<init>();
        r0 = r25;
        r0.e = r2;
        r5 = 0;
        r2 = 0;
        r12 = 0;
        r10 = 0;
        r8 = 0;
        r6 = 0;
        r3 = new com.google.eE;	 Catch:{ IOException -> 0x03bb, all -> 0x03b8 }
        r15 = new java.io.FileWriter;	 Catch:{ IOException -> 0x03bb, all -> 0x03b8 }
        r0 = r25;
        r0 = r0.b;	 Catch:{ IOException -> 0x03bb, all -> 0x03b8 }
        r16 = r0;
        r15.<init>(r16);	 Catch:{ IOException -> 0x03bb, all -> 0x03b8 }
        r3.<init>(r15);	 Catch:{ IOException -> 0x03bb, all -> 0x03b8 }
        r3.c();	 Catch:{ IOException -> 0x0383 }
        r0 = r25;
        r4 = r0.h;	 Catch:{ IOException -> 0x0383 }
        r4 = r4.values();	 Catch:{ IOException -> 0x0383 }
        r15 = r4.iterator();	 Catch:{ IOException -> 0x0383 }
        r23 = r6;
        r6 = r8;
        r8 = r10;
        r10 = r12;
        r12 = r2;
        r13 = r5;
        r4 = r23;
    L_0x003e:
        r2 = r15.hasNext();	 Catch:{ IOException -> 0x0383 }
        if (r2 == 0) goto L_0x03c6;
    L_0x0044:
        r2 = r15.next();	 Catch:{ IOException -> 0x0383 }
        r2 = (com.whatsapp.gdrive.fs) r2;	 Catch:{ IOException -> 0x0383 }
        r16 = r2.e();	 Catch:{ IOException -> 0x0383 }
        r17 = r2.g();	 Catch:{ IOException -> 0x0383 }
        r18 = r2.h();	 Catch:{ IOException -> 0x0383 }
        r19 = com.whatsapp.gdrive.fn.c(r16);	 Catch:{ IOException -> 0x0383 }
        r20 = r26.a();	 Catch:{ IOException -> 0x0383 }
        if (r20 != 0) goto L_0x0083;
    L_0x0060:
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0383 }
        r2.<init>();	 Catch:{ IOException -> 0x0383 }
        r4 = z;	 Catch:{ IOException -> 0x0383 }
        r5 = 46;
        r4 = r4[r5];	 Catch:{ IOException -> 0x0383 }
        r2 = r2.append(r4);	 Catch:{ IOException -> 0x0383 }
        r4 = r26.toString();	 Catch:{ IOException -> 0x0383 }
        r2 = r2.append(r4);	 Catch:{ IOException -> 0x0383 }
        r2 = r2.toString();	 Catch:{ IOException -> 0x0383 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IOException -> 0x0383 }
        r2 = 0;
        com.whatsapp.util.ao.a(r3);
    L_0x0082:
        return r2;
    L_0x0083:
        if (r19 == 0) goto L_0x0094;
    L_0x0085:
        r20 = new java.io.File;	 Catch:{ JSONException -> 0x0381 }
        r0 = r20;
        r1 = r19;
        r0.<init>(r1);	 Catch:{ JSONException -> 0x0381 }
        r20 = r20.exists();	 Catch:{ JSONException -> 0x0381 }
        if (r20 != 0) goto L_0x00c3;
    L_0x0094:
        r20 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0383 }
        r20.<init>();	 Catch:{ IOException -> 0x0383 }
        r21 = z;	 Catch:{ IOException -> 0x0383 }
        r22 = 60;
        r21 = r21[r22];	 Catch:{ IOException -> 0x0383 }
        r20 = r20.append(r21);	 Catch:{ IOException -> 0x0383 }
        r0 = r20;
        r1 = r19;
        r20 = r0.append(r1);	 Catch:{ IOException -> 0x0383 }
        r21 = z;	 Catch:{ IOException -> 0x0383 }
        r22 = 42;
        r21 = r21[r22];	 Catch:{ IOException -> 0x0383 }
        r20 = r20.append(r21);	 Catch:{ IOException -> 0x0383 }
        r20 = r20.toString();	 Catch:{ IOException -> 0x0383 }
        com.whatsapp.util.Log.w(r20);	 Catch:{ IOException -> 0x0383 }
        r0 = r25;
        r0.b(r2);	 Catch:{ IOException -> 0x0383 }
        if (r14 == 0) goto L_0x003e;
    L_0x00c3:
        r20 = new java.io.File;	 Catch:{ IOException -> 0x0383 }
        r0 = r20;
        r1 = r19;
        r0.<init>(r1);	 Catch:{ IOException -> 0x0383 }
        r19 = com.whatsapp.dg.d(r20);	 Catch:{ JSONException -> 0x0392 }
        if (r19 == 0) goto L_0x011f;
    L_0x00d2:
        r19 = com.whatsapp.gdrive.GoogleDriveService.a(r20);	 Catch:{ JSONException -> 0x0392 }
        if (r19 != 0) goto L_0x011f;
    L_0x00d8:
        r19 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x0394 }
        r19.<init>();	 Catch:{ JSONException -> 0x0394 }
        r21 = z;	 Catch:{ JSONException -> 0x0394 }
        r22 = 61;
        r21 = r21[r22];	 Catch:{ JSONException -> 0x0394 }
        r0 = r19;
        r1 = r21;
        r19 = r0.append(r1);	 Catch:{ JSONException -> 0x0394 }
        r21 = r20.getAbsolutePath();	 Catch:{ JSONException -> 0x0394 }
        r0 = r19;
        r1 = r21;
        r19 = r0.append(r1);	 Catch:{ JSONException -> 0x0394 }
        r21 = z;	 Catch:{ JSONException -> 0x0394 }
        r22 = 53;
        r21 = r21[r22];	 Catch:{ JSONException -> 0x0394 }
        r0 = r19;
        r1 = r21;
        r19 = r0.append(r1);	 Catch:{ JSONException -> 0x0394 }
        r21 = r20.getAbsolutePath();	 Catch:{ JSONException -> 0x0394 }
        r0 = r19;
        r1 = r21;
        r19 = r0.append(r1);	 Catch:{ JSONException -> 0x0394 }
        r19 = r19.toString();	 Catch:{ JSONException -> 0x0394 }
        com.whatsapp.util.Log.w(r19);	 Catch:{ JSONException -> 0x0394 }
        r0 = r25;
        r0.b(r2);	 Catch:{ JSONException -> 0x0394 }
        if (r14 == 0) goto L_0x003e;
    L_0x011f:
        if (r16 == 0) goto L_0x016d;
    L_0x0121:
        if (r17 == 0) goto L_0x016d;
    L_0x0123:
        if (r18 == 0) goto L_0x016d;
    L_0x0125:
        r3.a();	 Catch:{ JSONException -> 0x039b }
        r19 = "f";
        r0 = r19;
        r19 = r3.c(r0);	 Catch:{ JSONException -> 0x039b }
        r0 = r19;
        r1 = r16;
        r0.b(r1);	 Catch:{ JSONException -> 0x039b }
        r16 = "r";
        r0 = r16;
        r16 = r3.c(r0);	 Catch:{ JSONException -> 0x039b }
        r16.b(r17);	 Catch:{ JSONException -> 0x039b }
        r16 = "m";
        r0 = r16;
        r16 = r3.c(r0);	 Catch:{ JSONException -> 0x039b }
        r0 = r16;
        r1 = r18;
        r0.b(r1);	 Catch:{ JSONException -> 0x039b }
        r16 = "s";
        r0 = r16;
        r16 = r3.c(r0);	 Catch:{ JSONException -> 0x039b }
        r18 = r2.b();	 Catch:{ JSONException -> 0x039b }
        r17 = java.lang.String.valueOf(r18);	 Catch:{ JSONException -> 0x039b }
        r16.b(r17);	 Catch:{ JSONException -> 0x039b }
        r3.g();	 Catch:{ JSONException -> 0x039b }
        if (r14 == 0) goto L_0x019b;
    L_0x016d:
        r16 = z;	 Catch:{ JSONException -> 0x039d }
        r17 = 56;
        r16 = r16[r17];	 Catch:{ JSONException -> 0x039d }
        r17 = r2.e();	 Catch:{ JSONException -> 0x039d }
        r16 = r16.equals(r17);	 Catch:{ JSONException -> 0x039d }
        if (r16 == 0) goto L_0x017f;
    L_0x017d:
        if (r14 == 0) goto L_0x003e;
    L_0x017f:
        r16 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0383 }
        r16.<init>();	 Catch:{ IOException -> 0x0383 }
        r17 = z;	 Catch:{ IOException -> 0x0383 }
        r18 = 47;
        r17 = r17[r18];	 Catch:{ IOException -> 0x0383 }
        r16 = r16.append(r17);	 Catch:{ IOException -> 0x0383 }
        r0 = r16;
        r16 = r0.append(r2);	 Catch:{ IOException -> 0x0383 }
        r16 = r16.toString();	 Catch:{ IOException -> 0x0383 }
        com.whatsapp.util.Log.e(r16);	 Catch:{ IOException -> 0x0383 }
    L_0x019b:
        r16 = r2.b();	 Catch:{ JSONException -> 0x03a1 }
        r18 = 0;
        r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1));
        if (r16 >= 0) goto L_0x01c3;
    L_0x01a5:
        r16 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x03a1 }
        r16.<init>();	 Catch:{ JSONException -> 0x03a1 }
        r17 = z;	 Catch:{ JSONException -> 0x03a1 }
        r18 = 54;
        r17 = r17[r18];	 Catch:{ JSONException -> 0x03a1 }
        r16 = r16.append(r17);	 Catch:{ JSONException -> 0x03a1 }
        r0 = r16;
        r16 = r0.append(r2);	 Catch:{ JSONException -> 0x03a1 }
        r16 = r16.toString();	 Catch:{ JSONException -> 0x03a1 }
        com.whatsapp.util.Log.e(r16);	 Catch:{ JSONException -> 0x03a1 }
        if (r14 == 0) goto L_0x03c2;
    L_0x01c3:
        r16 = com.whatsapp.azf.f();	 Catch:{ JSONException -> 0x03a3 }
        r16 = java.util.Arrays.asList(r16);	 Catch:{ JSONException -> 0x03a3 }
        r0 = r16;
        r1 = r20;
        r16 = r0.contains(r1);	 Catch:{ JSONException -> 0x03a3 }
        if (r16 == 0) goto L_0x01d9;
    L_0x01d5:
        r8 = r2.b();	 Catch:{ IOException -> 0x0383 }
    L_0x01d9:
        r16 = com.whatsapp.dg.d(r20);	 Catch:{ IOException -> 0x0383 }
        if (r16 == 0) goto L_0x01e7;
    L_0x01df:
        r16 = r2.b();	 Catch:{ IOException -> 0x0383 }
        r6 = r6 + r16;
        r12 = r12 + 1;
    L_0x01e7:
        r16 = com.whatsapp.dg.e(r20);	 Catch:{ IOException -> 0x0383 }
        if (r16 == 0) goto L_0x01f3;
    L_0x01ed:
        r16 = r2.b();	 Catch:{ IOException -> 0x0383 }
        r4 = r4 + r16;
    L_0x01f3:
        r16 = com.whatsapp.dg.c(r20);	 Catch:{ JSONException -> 0x03a5 }
        if (r16 == 0) goto L_0x01fb;
    L_0x01f9:
        r13 = r13 + 1;
    L_0x01fb:
        r16 = r2.b();	 Catch:{ IOException -> 0x0383 }
        r10 = r10 + r16;
        r2 = r12;
        r12 = r13;
    L_0x0203:
        if (r14 == 0) goto L_0x03be;
    L_0x0205:
        r3.e();	 Catch:{ IOException -> 0x0383 }
        r3.close();	 Catch:{ IOException -> 0x0383 }
        r13 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x03a9 }
        r13.<init>();	 Catch:{ JSONException -> 0x03a9 }
        r14 = z;	 Catch:{ JSONException -> 0x03a9 }
        r15 = 50;
        r14 = r14[r15];	 Catch:{ JSONException -> 0x03a9 }
        r13 = r13.append(r14);	 Catch:{ JSONException -> 0x03a9 }
        r13 = r13.append(r12);	 Catch:{ JSONException -> 0x03a9 }
        r13 = r13.toString();	 Catch:{ JSONException -> 0x03a9 }
        com.whatsapp.util.Log.i(r13);	 Catch:{ JSONException -> 0x03a9 }
        r13 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x03a9 }
        r13.<init>();	 Catch:{ JSONException -> 0x03a9 }
        r14 = z;	 Catch:{ JSONException -> 0x03a9 }
        r15 = 62;
        r14 = r14[r15];	 Catch:{ JSONException -> 0x03a9 }
        r13 = r13.append(r14);	 Catch:{ JSONException -> 0x03a9 }
        r13 = r13.append(r2);	 Catch:{ JSONException -> 0x03a9 }
        r13 = r13.toString();	 Catch:{ JSONException -> 0x03a9 }
        com.whatsapp.util.Log.i(r13);	 Catch:{ JSONException -> 0x03a9 }
        r13 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x03a9 }
        r13.<init>();	 Catch:{ JSONException -> 0x03a9 }
        r14 = z;	 Catch:{ JSONException -> 0x03a9 }
        r15 = 51;
        r14 = r14[r15];	 Catch:{ JSONException -> 0x03a9 }
        r13 = r13.append(r14);	 Catch:{ JSONException -> 0x03a9 }
        r13 = r13.append(r8);	 Catch:{ JSONException -> 0x03a9 }
        r13 = r13.toString();	 Catch:{ JSONException -> 0x03a9 }
        com.whatsapp.util.Log.i(r13);	 Catch:{ JSONException -> 0x03a9 }
        r13 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x03a9 }
        r13.<init>();	 Catch:{ JSONException -> 0x03a9 }
        r14 = z;	 Catch:{ JSONException -> 0x03a9 }
        r15 = 55;
        r14 = r14[r15];	 Catch:{ JSONException -> 0x03a9 }
        r13 = r13.append(r14);	 Catch:{ JSONException -> 0x03a9 }
        r13 = r13.append(r4);	 Catch:{ JSONException -> 0x03a9 }
        r13 = r13.toString();	 Catch:{ JSONException -> 0x03a9 }
        com.whatsapp.util.Log.i(r13);	 Catch:{ JSONException -> 0x03a9 }
        r13 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x03a9 }
        r13.<init>();	 Catch:{ JSONException -> 0x03a9 }
        r14 = z;	 Catch:{ JSONException -> 0x03a9 }
        r15 = 52;
        r14 = r14[r15];	 Catch:{ JSONException -> 0x03a9 }
        r13 = r13.append(r14);	 Catch:{ JSONException -> 0x03a9 }
        r13 = r13.append(r10);	 Catch:{ JSONException -> 0x03a9 }
        r13 = r13.toString();	 Catch:{ JSONException -> 0x03a9 }
        com.whatsapp.util.Log.i(r13);	 Catch:{ JSONException -> 0x03a9 }
        r13 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x03a9 }
        r13.<init>();	 Catch:{ JSONException -> 0x03a9 }
        r14 = z;	 Catch:{ JSONException -> 0x03a9 }
        r15 = 59;
        r14 = r14[r15];	 Catch:{ JSONException -> 0x03a9 }
        r13 = r13.append(r14);	 Catch:{ JSONException -> 0x03a9 }
        r13 = r13.append(r6);	 Catch:{ JSONException -> 0x03a9 }
        r13 = r13.toString();	 Catch:{ JSONException -> 0x03a9 }
        com.whatsapp.util.Log.i(r13);	 Catch:{ JSONException -> 0x03a9 }
        r0 = r25;
        r13 = r0.e;	 Catch:{ JSONException -> 0x03a9 }
        r14 = z;	 Catch:{ JSONException -> 0x03a9 }
        r15 = 38;
        r14 = r14[r15];	 Catch:{ JSONException -> 0x03a9 }
        r13.put(r14, r12);	 Catch:{ JSONException -> 0x03a9 }
        r0 = r25;
        r12 = r0.e;	 Catch:{ JSONException -> 0x03a9 }
        r13 = z;	 Catch:{ JSONException -> 0x03a9 }
        r14 = 41;
        r13 = r13[r14];	 Catch:{ JSONException -> 0x03a9 }
        r12.put(r13, r2);	 Catch:{ JSONException -> 0x03a9 }
        r0 = r25;
        r2 = r0.e;	 Catch:{ JSONException -> 0x03a9 }
        r12 = z;	 Catch:{ JSONException -> 0x03a9 }
        r13 = 43;
        r12 = r12[r13];	 Catch:{ JSONException -> 0x03a9 }
        r2.put(r12, r10);	 Catch:{ JSONException -> 0x03a9 }
        r0 = r25;
        r2 = r0.e;	 Catch:{ JSONException -> 0x03a9 }
        r12 = z;	 Catch:{ JSONException -> 0x03a9 }
        r13 = 44;
        r12 = r12[r13];	 Catch:{ JSONException -> 0x03a9 }
        r2.put(r12, r8);	 Catch:{ JSONException -> 0x03a9 }
        r0 = r25;
        r2 = r0.e;	 Catch:{ JSONException -> 0x03a9 }
        r12 = z;	 Catch:{ JSONException -> 0x03a9 }
        r13 = 45;
        r12 = r12[r13];	 Catch:{ JSONException -> 0x03a9 }
        r2.put(r12, r6);	 Catch:{ JSONException -> 0x03a9 }
        r0 = r25;
        r2 = r0.e;	 Catch:{ JSONException -> 0x03a9 }
        r12 = z;	 Catch:{ JSONException -> 0x03a9 }
        r13 = 57;
        r12 = r12[r13];	 Catch:{ JSONException -> 0x03a9 }
        r2.put(r12, r4);	 Catch:{ JSONException -> 0x03a9 }
        r2 = com.whatsapp.rw.a();	 Catch:{ JSONException -> 0x03a9 }
        if (r2 == 0) goto L_0x0322;
    L_0x02fb:
        r12 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x03a7 }
        r12.<init>();	 Catch:{ JSONException -> 0x03a7 }
        r13 = z;	 Catch:{ JSONException -> 0x03a7 }
        r14 = 39;
        r13 = r13[r14];	 Catch:{ JSONException -> 0x03a7 }
        r12 = r12.append(r13);	 Catch:{ JSONException -> 0x03a7 }
        r12 = r12.append(r2);	 Catch:{ JSONException -> 0x03a7 }
        r12 = r12.toString();	 Catch:{ JSONException -> 0x03a7 }
        com.whatsapp.util.Log.i(r12);	 Catch:{ JSONException -> 0x03a7 }
        r0 = r25;
        r12 = r0.e;	 Catch:{ JSONException -> 0x03a7 }
        r13 = z;	 Catch:{ JSONException -> 0x03a7 }
        r14 = 40;
        r13 = r13[r14];	 Catch:{ JSONException -> 0x03a7 }
        r12.put(r13, r2);	 Catch:{ JSONException -> 0x03a7 }
    L_0x0322:
        r12 = 0;
        r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r2 < 0) goto L_0x033a;
    L_0x0328:
        r12 = 0;
        r2 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1));
        if (r2 < 0) goto L_0x033a;
    L_0x032e:
        r12 = 0;
        r2 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1));
        if (r2 < 0) goto L_0x033a;
    L_0x0334:
        r12 = 0;
        r2 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1));
        if (r2 >= 0) goto L_0x0378;
    L_0x033a:
        r2 = com.whatsapp.App.j;	 Catch:{ JSONException -> 0x03b4 }
        r12 = 1;
        if (r2 != r12) goto L_0x0378;
    L_0x033f:
        r2 = java.util.Locale.ENGLISH;	 Catch:{ JSONException -> 0x03b6 }
        r12 = z;	 Catch:{ JSONException -> 0x03b6 }
        r13 = 58;
        r12 = r12[r13];	 Catch:{ JSONException -> 0x03b6 }
        r13 = 4;
        r13 = new java.lang.Object[r13];	 Catch:{ JSONException -> 0x03b6 }
        r14 = 0;
        r10 = java.lang.Long.valueOf(r10);	 Catch:{ JSONException -> 0x03b6 }
        r13[r14] = r10;	 Catch:{ JSONException -> 0x03b6 }
        r10 = 1;
        r8 = java.lang.Long.valueOf(r8);	 Catch:{ JSONException -> 0x03b6 }
        r13[r10] = r8;	 Catch:{ JSONException -> 0x03b6 }
        r8 = 2;
        r6 = java.lang.Long.valueOf(r6);	 Catch:{ JSONException -> 0x03b6 }
        r13[r8] = r6;	 Catch:{ JSONException -> 0x03b6 }
        r6 = 3;
        r4 = java.lang.Long.valueOf(r4);	 Catch:{ JSONException -> 0x03b6 }
        r13[r6] = r4;	 Catch:{ JSONException -> 0x03b6 }
        r2 = java.lang.String.format(r2, r12, r13);	 Catch:{ JSONException -> 0x03b6 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ JSONException -> 0x03b6 }
        r2 = z;	 Catch:{ JSONException -> 0x03b6 }
        r4 = 49;
        r2 = r2[r4];	 Catch:{ JSONException -> 0x03b6 }
        r4 = 0;
        r5 = 0;
        com.whatsapp.App.a(r2, r4, r5);	 Catch:{ JSONException -> 0x03b6 }
    L_0x0378:
        com.whatsapp.util.ao.a(r3);
        r0 = r25;
        r2 = r0.b;
        goto L_0x0082;
    L_0x0381:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0383 }
    L_0x0383:
        r2 = move-exception;
    L_0x0384:
        com.whatsapp.util.Log.a(r2);	 Catch:{ all -> 0x0396 }
        r2 = 0;
        r0 = r25;
        r0.e = r2;	 Catch:{ all -> 0x0396 }
        r2 = 0;
        com.whatsapp.util.ao.a(r3);
        goto L_0x0082;
    L_0x0392:
        r2 = move-exception;
        throw r2;	 Catch:{ JSONException -> 0x0394 }
    L_0x0394:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0383 }
    L_0x0396:
        r2 = move-exception;
    L_0x0397:
        com.whatsapp.util.ao.a(r3);
        throw r2;
    L_0x039b:
        r2 = move-exception;
        throw r2;	 Catch:{ JSONException -> 0x039d }
    L_0x039d:
        r2 = move-exception;
        throw r2;	 Catch:{ JSONException -> 0x039f }
    L_0x039f:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0383 }
    L_0x03a1:
        r2 = move-exception;
        throw r2;	 Catch:{ JSONException -> 0x03a3 }
    L_0x03a3:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0383 }
    L_0x03a5:
        r2 = move-exception;
        throw r2;	 Catch:{ IOException -> 0x0383 }
    L_0x03a7:
        r2 = move-exception;
        throw r2;	 Catch:{ JSONException -> 0x03a9 }
    L_0x03a9:
        r2 = move-exception;
        r4 = z;	 Catch:{ IOException -> 0x0383 }
        r5 = 48;
        r4 = r4[r5];	 Catch:{ IOException -> 0x0383 }
        com.whatsapp.util.Log.b(r4, r2);	 Catch:{ IOException -> 0x0383 }
        goto L_0x0378;
    L_0x03b4:
        r2 = move-exception;
        throw r2;	 Catch:{ JSONException -> 0x03b6 }
    L_0x03b6:
        r2 = move-exception;
        throw r2;	 Catch:{ JSONException -> 0x03a9 }
    L_0x03b8:
        r2 = move-exception;
        r3 = r4;
        goto L_0x0397;
    L_0x03bb:
        r2 = move-exception;
        r3 = r4;
        goto L_0x0384;
    L_0x03be:
        r13 = r12;
        r12 = r2;
        goto L_0x003e;
    L_0x03c2:
        r2 = r12;
        r12 = r13;
        goto L_0x0203;
    L_0x03c6:
        r2 = r12;
        r12 = r13;
        goto L_0x0205;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.b6.b(com.whatsapp.gdrive.bs):java.io.File");
    }

    static bc a(b6 b6Var) {
        return b6Var.i;
    }

    @db
    public int a(@NonNull String str, @Nullable fs fsVar) {
        File file = new File(str);
        try {
            if (!file.exists()) {
                return 1;
            }
            if (fsVar == null) {
                return 2;
            }
            try {
                if (file.length() != fsVar.b()) {
                    return 4;
                }
                String a = fn.a(file);
                if (a == null) {
                    try {
                        Log.i(z[79] + file);
                        return 1;
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
                try {
                    if (a.equals(fsVar.h())) {
                        return 3;
                    }
                    return 4;
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            } catch (IllegalStateException e22) {
                throw e22;
            }
        } catch (IllegalStateException e222) {
            throw e222;
        }
    }

    public void c(@NonNull fs fsVar) {
        Log.i(z[63] + this.a + z[64] + fsVar);
        this.a = fsVar;
        o();
    }

    static File b(b6 b6Var) {
        return b6Var.b;
    }

    public b6(@NonNull bc bcVar, @NonNull String str, @Nullable String str2, @Nullable fs fsVar) {
        this.c = new ArrayList();
        this.i = bcVar;
        this.a = fsVar;
        this.f = str;
        this.d = str2;
        if (fsVar != null) {
            o();
        }
        this.b = new File(App.z().getCacheDir(), z[72]);
    }

    public int c() {
        int i = -1;
        try {
            if (this.g != null) {
                i = this.g.optInt(z[74], -1);
            } else {
                Log.e(z[73]);
            }
            return i;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public List e() {
        return Collections.unmodifiableList(this.c);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean p() {
        /*
        r14 = this;
        r11 = com.whatsapp.gdrive.GoogleDriveService.c;
        r0 = r14.b;
        r12 = new com.google.fh;	 Catch:{ IOException -> 0x00be }
        r1 = new java.io.InputStreamReader;	 Catch:{ IOException -> 0x00be }
        r2 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x00be }
        r2.<init>(r0);	 Catch:{ IOException -> 0x00be }
        r1.<init>(r2);	 Catch:{ IOException -> 0x00be }
        r12.<init>(r1);	 Catch:{ IOException -> 0x00be }
        r12.c();	 Catch:{ IOException -> 0x010f, IllegalStateException -> 0x0169, NumberFormatException -> 0x0120 }
    L_0x0016:
        r0 = r12.d();	 Catch:{ IOException -> 0x010f, IllegalStateException -> 0x0169, NumberFormatException -> 0x0120 }
        if (r0 == 0) goto L_0x00b6;
    L_0x001c:
        r5 = 0;
        r4 = 0;
        r1 = 0;
        r2 = -1;
        r12.l();	 Catch:{ IllegalStateException -> 0x00fc, IOException -> 0x010f, NumberFormatException -> 0x0120 }
    L_0x0024:
        r0 = r12.d();	 Catch:{ IllegalStateException -> 0x00fc, IOException -> 0x010f, NumberFormatException -> 0x0120 }
        if (r0 == 0) goto L_0x0067;
    L_0x002a:
        r6 = r12.i();	 Catch:{ IllegalStateException -> 0x00fc, IOException -> 0x010f, NumberFormatException -> 0x0120 }
        r0 = -1;
        r7 = r6.hashCode();	 Catch:{ IOException -> 0x00fa, IllegalStateException -> 0x00fc, NumberFormatException -> 0x0120 }
        switch(r7) {
            case 102: goto L_0x00ca;
            case 109: goto L_0x00e2;
            case 114: goto L_0x00d6;
            case 115: goto L_0x00ee;
            default: goto L_0x0036;
        };
    L_0x0036:
        switch(r0) {
            case 0: goto L_0x0147;
            case 1: goto L_0x014d;
            case 2: goto L_0x0153;
            case 3: goto L_0x0159;
            default: goto L_0x0039;
        };
    L_0x0039:
        r0 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0165, IllegalStateException -> 0x00fc, NumberFormatException -> 0x0120 }
        r0.<init>();	 Catch:{ IOException -> 0x0165, IllegalStateException -> 0x00fc, NumberFormatException -> 0x0120 }
        r7 = z;	 Catch:{ IOException -> 0x0165, IllegalStateException -> 0x00fc, NumberFormatException -> 0x0120 }
        r8 = 28;
        r7 = r7[r8];	 Catch:{ IOException -> 0x0165, IllegalStateException -> 0x00fc, NumberFormatException -> 0x0120 }
        r0 = r0.append(r7);	 Catch:{ IOException -> 0x0165, IllegalStateException -> 0x00fc, NumberFormatException -> 0x0120 }
        r0 = r0.append(r6);	 Catch:{ IOException -> 0x0165, IllegalStateException -> 0x00fc, NumberFormatException -> 0x0120 }
        r6 = z;	 Catch:{ IOException -> 0x0165, IllegalStateException -> 0x00fc, NumberFormatException -> 0x0120 }
        r7 = 33;
        r6 = r6[r7];	 Catch:{ IOException -> 0x0165, IllegalStateException -> 0x00fc, NumberFormatException -> 0x0120 }
        r0 = r0.append(r6);	 Catch:{ IOException -> 0x0165, IllegalStateException -> 0x00fc, NumberFormatException -> 0x0120 }
        r6 = r12.f();	 Catch:{ IOException -> 0x0165, IllegalStateException -> 0x00fc, NumberFormatException -> 0x0120 }
        r0 = r0.append(r6);	 Catch:{ IOException -> 0x0165, IllegalStateException -> 0x00fc, NumberFormatException -> 0x0120 }
        r0 = r0.toString();	 Catch:{ IOException -> 0x0165, IllegalStateException -> 0x00fc, NumberFormatException -> 0x0120 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IOException -> 0x0165, IllegalStateException -> 0x00fc, NumberFormatException -> 0x0120 }
    L_0x0065:
        if (r11 == 0) goto L_0x0024;
    L_0x0067:
        r12.k();	 Catch:{ IllegalStateException -> 0x00fc, IOException -> 0x010f, NumberFormatException -> 0x0120 }
        r0 = r4;
        r13 = r1;
        r1 = r5;
        r4 = r2;
        r3 = r13;
    L_0x006f:
        if (r1 != 0) goto L_0x007c;
    L_0x0071:
        r2 = z;	 Catch:{ IOException -> 0x0167, IllegalStateException -> 0x0169, NumberFormatException -> 0x0120 }
        r6 = 29;
        r2 = r2[r6];	 Catch:{ IOException -> 0x0167, IllegalStateException -> 0x0169, NumberFormatException -> 0x0120 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IOException -> 0x0167, IllegalStateException -> 0x0169, NumberFormatException -> 0x0120 }
        if (r11 == 0) goto L_0x0016;
    L_0x007c:
        if (r0 != 0) goto L_0x0089;
    L_0x007e:
        r2 = z;	 Catch:{ IOException -> 0x016b, IllegalStateException -> 0x0169, NumberFormatException -> 0x0120 }
        r6 = 31;
        r2 = r2[r6];	 Catch:{ IOException -> 0x016b, IllegalStateException -> 0x0169, NumberFormatException -> 0x0120 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IOException -> 0x016b, IllegalStateException -> 0x0169, NumberFormatException -> 0x0120 }
        if (r11 == 0) goto L_0x0016;
    L_0x0089:
        if (r3 != 0) goto L_0x0096;
    L_0x008b:
        r2 = z;	 Catch:{ IOException -> 0x016d, IllegalStateException -> 0x0169, NumberFormatException -> 0x0120 }
        r6 = 30;
        r2 = r2[r6];	 Catch:{ IOException -> 0x016d, IllegalStateException -> 0x0169, NumberFormatException -> 0x0120 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IOException -> 0x016d, IllegalStateException -> 0x0169, NumberFormatException -> 0x0120 }
        if (r11 == 0) goto L_0x0016;
    L_0x0096:
        r6 = 0;
        r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r2 >= 0) goto L_0x00a7;
    L_0x009c:
        r2 = z;	 Catch:{ IOException -> 0x016f, IllegalStateException -> 0x0169, NumberFormatException -> 0x0120 }
        r6 = 35;
        r2 = r2[r6];	 Catch:{ IOException -> 0x016f, IllegalStateException -> 0x0169, NumberFormatException -> 0x0120 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IOException -> 0x016f, IllegalStateException -> 0x0169, NumberFormatException -> 0x0120 }
        if (r11 == 0) goto L_0x0016;
    L_0x00a7:
        r2 = 0;
        r6 = 0;
        r7 = -1;
        r9 = 0;
        r10 = 0;
        r0 = com.whatsapp.gdrive.fs.a(r0, r1, r2, r3, r4, r6, r7, r9, r10);	 Catch:{ IOException -> 0x010f, IllegalStateException -> 0x0169, NumberFormatException -> 0x0120 }
        r14.a(r0);	 Catch:{ IOException -> 0x010f, IllegalStateException -> 0x0169, NumberFormatException -> 0x0120 }
        if (r11 == 0) goto L_0x0016;
    L_0x00b6:
        r12.g();	 Catch:{ IOException -> 0x010f, IllegalStateException -> 0x0169, NumberFormatException -> 0x0120 }
        com.whatsapp.util.ao.a(r12);
        r0 = 1;
    L_0x00bd:
        return r0;
    L_0x00be:
        r0 = move-exception;
        r1 = z;
        r2 = 27;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        r0 = 0;
        goto L_0x00bd;
    L_0x00ca:
        r7 = "f";
        r7 = r6.equals(r7);	 Catch:{ IOException -> 0x00fa, IllegalStateException -> 0x00fc, NumberFormatException -> 0x0120 }
        if (r7 == 0) goto L_0x0036;
    L_0x00d3:
        r0 = 0;
        if (r11 == 0) goto L_0x0036;
    L_0x00d6:
        r7 = "r";
        r7 = r6.equals(r7);	 Catch:{ IOException -> 0x010d, IllegalStateException -> 0x00fc, NumberFormatException -> 0x0120 }
        if (r7 == 0) goto L_0x0036;
    L_0x00df:
        r0 = 1;
        if (r11 == 0) goto L_0x0036;
    L_0x00e2:
        r7 = "m";
        r7 = r6.equals(r7);	 Catch:{ IOException -> 0x011e, IllegalStateException -> 0x00fc, NumberFormatException -> 0x0120 }
        if (r7 == 0) goto L_0x0036;
    L_0x00eb:
        r0 = 2;
        if (r11 == 0) goto L_0x0036;
    L_0x00ee:
        r7 = "s";
        r7 = r6.equals(r7);	 Catch:{ IOException -> 0x0140, IllegalStateException -> 0x00fc, NumberFormatException -> 0x0120 }
        if (r7 == 0) goto L_0x0036;
    L_0x00f7:
        r0 = 3;
        goto L_0x0036;
    L_0x00fa:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00fc, IOException -> 0x010f, NumberFormatException -> 0x0120 }
    L_0x00fc:
        r0 = move-exception;
        r6 = z;	 Catch:{ IOException -> 0x010f, IllegalStateException -> 0x0169, NumberFormatException -> 0x0120 }
        r7 = 34;
        r6 = r6[r7];	 Catch:{ IOException -> 0x010f, IllegalStateException -> 0x0169, NumberFormatException -> 0x0120 }
        com.whatsapp.util.Log.b(r6, r0);	 Catch:{ IOException -> 0x010f, IllegalStateException -> 0x0169, NumberFormatException -> 0x0120 }
        r0 = r4;
        r13 = r1;
        r1 = r5;
        r4 = r2;
        r3 = r13;
        goto L_0x006f;
    L_0x010d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00fc, IOException -> 0x010f, NumberFormatException -> 0x0120 }
    L_0x010f:
        r0 = move-exception;
        r1 = z;	 Catch:{ all -> 0x0142 }
        r2 = 36;
        r1 = r1[r2];	 Catch:{ all -> 0x0142 }
        com.whatsapp.util.Log.b(r1, r0);	 Catch:{ all -> 0x0142 }
        r0 = 0;
        com.whatsapp.util.ao.a(r12);
        goto L_0x00bd;
    L_0x011e:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00fc, IOException -> 0x010f, NumberFormatException -> 0x0120 }
    L_0x0120:
        r0 = move-exception;
    L_0x0121:
        r1 = z;	 Catch:{ IOException -> 0x0171 }
        r2 = 37;
        r1 = r1[r2];	 Catch:{ IOException -> 0x0171 }
        com.whatsapp.util.Log.b(r1, r0);	 Catch:{ IOException -> 0x0171 }
        r0 = com.whatsapp.App.j;	 Catch:{ IOException -> 0x0171 }
        r1 = 1;
        if (r0 != r1) goto L_0x013a;
    L_0x012f:
        r0 = z;	 Catch:{ IOException -> 0x0171 }
        r1 = 32;
        r0 = r0[r1];	 Catch:{ IOException -> 0x0171 }
        r1 = 0;
        r2 = 0;
        com.whatsapp.App.a(r0, r1, r2);	 Catch:{ IOException -> 0x0171 }
    L_0x013a:
        r0 = 0;
        com.whatsapp.util.ao.a(r12);
        goto L_0x00bd;
    L_0x0140:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00fc, IOException -> 0x010f, NumberFormatException -> 0x0120 }
    L_0x0142:
        r0 = move-exception;
        com.whatsapp.util.ao.a(r12);
        throw r0;
    L_0x0147:
        r5 = r12.f();	 Catch:{ IllegalStateException -> 0x00fc, IOException -> 0x010f, NumberFormatException -> 0x0120 }
        if (r11 == 0) goto L_0x0065;
    L_0x014d:
        r4 = r12.f();	 Catch:{ IllegalStateException -> 0x00fc, IOException -> 0x010f, NumberFormatException -> 0x0120 }
        if (r11 == 0) goto L_0x0065;
    L_0x0153:
        r1 = r12.f();	 Catch:{ IllegalStateException -> 0x00fc, IOException -> 0x010f, NumberFormatException -> 0x0120 }
        if (r11 == 0) goto L_0x0065;
    L_0x0159:
        r0 = r12.f();	 Catch:{ IllegalStateException -> 0x00fc, IOException -> 0x010f, NumberFormatException -> 0x0120 }
        r2 = java.lang.Long.parseLong(r0);	 Catch:{ IllegalStateException -> 0x00fc, IOException -> 0x010f, NumberFormatException -> 0x0120 }
        if (r11 == 0) goto L_0x0065;
    L_0x0163:
        goto L_0x0039;
    L_0x0165:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00fc, IOException -> 0x010f, NumberFormatException -> 0x0120 }
    L_0x0167:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x010f, IllegalStateException -> 0x0169, NumberFormatException -> 0x0120 }
    L_0x0169:
        r0 = move-exception;
        goto L_0x0121;
    L_0x016b:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x010f, IllegalStateException -> 0x0169, NumberFormatException -> 0x0120 }
    L_0x016d:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x010f, IllegalStateException -> 0x0169, NumberFormatException -> 0x0120 }
    L_0x016f:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x010f, IllegalStateException -> 0x0169, NumberFormatException -> 0x0120 }
    L_0x0171:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0142 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.b6.p():boolean");
    }

    public boolean b(@NonNull fs fsVar) {
        try {
            if (this.h.remove(fsVar.e(), fsVar)) {
                this.c.add(fsVar);
                return true;
            }
            Log.e(z[65] + fsVar);
            return false;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public long b() {
        long j = -1;
        try {
            if (this.g != null) {
                j = this.g.optLong(z[26], -1);
            } else {
                Log.e(z[25]);
            }
            return j;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    private boolean b(String str) {
        return this.h.containsKey(str);
    }

    @Nullable
    public fs c(@NonNull String str) {
        return (fs) this.h.get(str);
    }

    public fs r() {
        return this.a;
    }

    public JSONObject a(long j, int i, int i2, boolean z) {
        try {
            if (this.e == null) {
                Log.e(z[71]);
            }
            this.e.put(z[70], 1);
            this.e.put(z[67], j);
            this.e.put(z[69], i);
            this.e.put(z[66], i2);
            this.e.put(z[68], z);
            return this.e;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public int a() {
        int i = -1;
        try {
            if (this.g != null) {
                i = this.g.optInt(z[75], -1);
            } else {
                Log.e(z[76]);
            }
            return i;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public boolean k() {
        try {
            return this.h != null;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    static fs c(b6 b6Var) {
        return b6Var.a;
    }

    public void a(@NonNull fs fsVar) {
        fs fsVar2 = (fs) this.h.get(fsVar.e());
        if (fsVar2 != null) {
            try {
                this.c.add(fsVar2);
            } catch (IllegalStateException e) {
                throw e;
            }
        }
        this.h.put(fsVar.e(), fsVar);
    }

    public long l() {
        long j = -1;
        try {
            if (this.g != null) {
                j = this.g.optLong(z[78], -1);
            } else {
                Log.e(z[77]);
            }
            return j;
        } catch (IllegalStateException e) {
            throw e;
        }
    }
}
