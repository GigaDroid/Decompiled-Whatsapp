package com.whatsapp;

import android.net.Uri;
import android.text.TextUtils;
import com.whatsapp.fieldstats.ap;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;
import org.whispersystems.az;
import org.whispersystems.j;

final class qy implements az {
    private static final String[] z;
    final dt a;
    private final boolean b;
    private final ana c;
    private final j d;
    private final co e;
    private final l5 f;
    private final ap g;

    static {
        String[] strArr = new String[55];
        String str = "\u0001\\\u0013Gi\\J\u000bV3AN\u000f";
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
                        i3 = 47;
                        break;
                    case at.g /*1*/:
                        i3 = 43;
                        break;
                    case at.i /*2*/:
                        i3 = 123;
                        break;
                    case at.o /*3*/:
                        i3 = 38;
                        break;
                    default:
                        i3 = 29;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    str = "JF\u000bRd\u000fF\u001eBtN\u000b\u000eTq\u000fY\u001eExF]\u001eB&\u000fF\u001eUnNL\u001e\bvJRF";
                    obj = 1;
                    strArr2 = strArr3;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "\u0014\u000b\u0016Cn\\J\u001cC3DN\u0002\u001b";
                    obj = 2;
                    strArr2 = strArr3;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "FE\rGqFO[U~GN\u0016C=@E[TxLN\u0012PxK\u000b\u0016CyFJ[SoC\u0010[SoC\u0016";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "FE\rGqFO[Nr\\_[Is\u000fY\u001eExF]\u001eB=BN\u001fO|\u000f^\tJ&\u000f^\tJ ";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "G_\u000fVn";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0014\u000b\u0016Cn\\J\u001cC3DN\u0002\u001b";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "HY\u0014Sm\u000fB\u001f\u0006rA\u000b\u0016Cn\\J\u001cC=NE\u001f\u0006z]D\u000eV=FO[Os\u000fH\u0012VuJY\u000fCe[\u000b\u001fI=AD\u000f\u0006pN_\u0018N&\u000fF\u001eUnNL\u001e\bvJRF";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0014\u000b\u0016Cn\\J\u001cC3DN\u0002\u001b";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "BB\bUtAL[KxKB\u001a\u0006vJR@\u0006pJX\bGzJ\u0005\u0010Cd\u0012";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "NS\u0014Jr[G[BrJX\u0015\u0001i\u000f@\u0015Ij\u000fC\u0014Q=[D[N|AO\u0017C=[C\u001e\u0006k\u001d\u000b\u000bTr[D\u0018Iq\u000fI\u000e@{JY[Oi\u000fY\u001eExF]\u001eB&\u000fF\u001eUnNL\u001e\bvJRF";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u0014\u000b\u0016Cn\\J\u001cC3DN\u0002\u001b";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "FF\u001aAx\u0000A\u000bCz";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "MD\u001cSn\u000fF\u001eBtN\u000b\bOgJ\u000b\tC~JB\rCy\u0014\u000b\u001dOqJg\u001eHz[CF";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "ZE\tC~@L\u0015OgJO[GhKB\u0014\u0006pFF\u001e\u0006iV[\u001e\u001d=BB\u0016CIV[\u001e\u001b";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "BN\u001fO|\u000f@\u001e_=FE\u0018Io]N\u0018R=CN\u0015AiG\u0010[JxAL\u000fN ";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "BB\bUtAL[KxKB\u001a\u0006vJR@\u0006pJX\bGzJ\u0005\u0010Cd\u0012";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "NS\u0014Jr[G[TxLN\u0012PxK\u000b\u0012H~@F\u000bJx[N[UxAO\u001eT=DN\u0002\u0006yFX\u000fTtM^\u000fOrA\u000b\u0016Cn\\J\u001cC&\u000fF\u001eUnNL\u001e\bvJRF";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "FE\rGqFO[KtBN[Rd_N@\u0006pFF\u001eRd_NF";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "\u0014\u000b\u0016Cn\\J\u001cC3DN\u0002\u001b";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "MD\u001cSn\u000fF\u001eBtN\u000b\bOgJ\u000b\tC~JB\rCy\u0014\u000b\u001dOqJt\u0017CsH_\u0013\u001b";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "ZE\tC~@L\u0015OgJO[PtKN\u0014\u0006pFF\u001e\u0006iV[\u001e\u001d=BB\u0016CIV[\u001e\u001b";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "NS\u0014Jr[G[Bx]B\rCy\u000fN\u0015Rt]N[VqNB\u0015RxW_[Gn\u000f[\u001aByFE\u001c\u001d=BN\bU|HNUMxV\u0016";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "NS\u0014Jr[G[Bx]B\rCy\u000f[\u0017GtA_\u001e^i\u000fO\u0014Cn\u000fE\u0014R=]N\u000bTx\\N\u0015R=YJ\u0017Oy\u000f[\tIi@H\u0014J=M^\u001d@x]\u0010[Kx\\X\u001aAx\u0001@\u001e_ ";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "XY\u0014Hz\u000fE\u000eK\u007fJY[I{\u000fF\u001eUnNL\u001e\u0006iV[\u001eU&\u000fF\u001eUnNL\u001e\bvJRF";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "MD\u001cSn\u000fX\u0013G0\u001d\u001eM\u0006uNX\u0013\u0006oJH\u001eOkJO@\u0006qJE\u001cRu\u0012";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "BN\u001fO|\u000f@\u001e_=FE\u0018Io]N\u0018R=CN\u0015AiG\u0010[JxAL\u000fN ";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "\u0014\u000b\u0016Cn\\J\u001cC3DN\u0002\u001b";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    str = "\u0014\u000b\u0016Cn\\J\u001cC3DN\u0002\u001b";
                    obj = 28;
                    i = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    strArr2 = strArr3;
                    str = "NS\u0014Jr[G[TxLN\u0012PxK\u000b\u0012HkNG\u0012B=\\N\u0015Bx]\u000b\u0010Cd\u000fO\u0012Ui]B\u0019SiFD\u0015\u0006pJX\bGzJ\u0010[Kx\\X\u001aAx\u0001@\u001e_ ";
                    obj = 29;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "\u0014\u000b\u0016Cn\\J\u001cC3DN\u0002\u001b";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "NS\u0014Jr[G[Bx]B\rCy\u000fE\u000eJq\u000fD\t\u0006xB[\u000f_=_G\u001aOs[N\u0003R=IY\u0014K=BN\bU|HN@\u0006pJX\bGzJ\u0005\u0010Cd\u0012";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "BN\u001fO|\u000f@\u001e_=FE\u0018Io]N\u0018R=CN\u0015AiG\u0010[JxAL\u000fN ";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "NS\u0014Jr[G[TxLN\u0012PxK\u000b\bCsKN\t\u0006vJR[Bt\\_\tO\u007fZ_\u0012Is\u000fF\u001eUnNL\u001e\u001d=BN\bU|HNUMxV\u0016";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "MD\u001cSn\u000fX\u0013G0\u001d\u001eM\u0006uNX\u0013\u0006oJH\u001eOkJO@\u0006qJE\u001cRu\u0012";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "NS\u0014Jr[G[TxLN\u0012PxK\u000b\u0017CzNH\u0002\u0006nJE\u001fCo\u000f@\u001e_=KB\bRoFI\u000eRt@E[Kx\\X\u001aAx\u0014\u000b\u0016Cn\\J\u001cC3DN\u0002\u001b";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "\u0014\u000b\u0016Cn\\J\u001cC3DN\u0002\u001b";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    str = "BB\bUtAL[KxKB\u001a\u0006vJR@\u0006pJX\bGzJ\u0005\u0010Cd\u0012";
                    obj = 37;
                    i = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    strArr2 = strArr3;
                    str = "\u0014\u000b\u0016Cn\\J\u001cC3DN\u0002\u001b";
                    obj = 38;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "\u0014\u000b\u0016Cn\\J\u001cC3DN\u0002\u001b";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "BN\u001fO|\u000f@\u001e_=FE\u0018Io]N\u0018R=CN\u0015AiG\u0010[JxAL\u000fN ";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "NS\u0014Jr[G[Bx]B\rCy\u000f[\u0017GtA_\u001e^i\u000fC\u001aU=FE\rGqFO[V|KO\u0012Hz\u0014\u000b\u0016Cn\\J\u001cC3DN\u0002\u001b";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    str = "MD\u001cSn\u000fX\u0013G0\u001d\u001eM\u0006uNX\u0013\u0006oJH\u001eOkJO@\u0006qJE\u001cRu\u0012";
                    obj = 42;
                    i = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    strArr2 = strArr3;
                    str = "\u0014\u000b\u0016Cn\\J\u001cC3DN\u0002\u001b";
                    obj = 43;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "\u0014\u000b\u0016Cn\\J\u001cC3DN\u0002\u001b";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "MD\u001cSn\u000fX\u0013G0\u001d\u001eM\u0006uNX\u0013\u0006oJH\u001eOkJO@\u0006qJE\u001cRu\u0012";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    str = "\u0014\u000b\u0016Cn\\J\u001cC3DN\u0002\u001b";
                    obj = 46;
                    i = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    strArr2 = strArr3;
                    str = "MD\u001cSn\u000fF\u001eBtN\u000b\bOgJ\u000b\tC~JB\rCy\u0014\u000b\u001dOqJt\u0017CsH_\u0013\u001b";
                    obj = 47;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "BB\bUtAL[KxKB\u001a\u0006vJR@\u0006pJX\bGzJ\u0005\u0010Cd\u0012";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "\u000f^\u0015Ms@\\\u0015r|HXF";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "\u0014\u000b\u0016Cn\\J\u001cC3DN\u0002\u001b";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "MD\u001cSn\u000fF\u001eBtN\u000b\bOgJ\u000b\tC~JB\rCy\u0014\u000b\u001dOqJg\u001eHz[CF";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "\u0014\u000b\u0016Cn\\J\u001cC3DN\u0002\u001b";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "FL\u0015IoFE\u001c\u0006tAI\u0014SsK\u000b\u001eH~]R\u000bRxK\u000b\rOyJD[Kx\\X\u001aAx\u0014\u000b\u0016Cn\\J\u001cC3DN\u0002\u001b";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "\u0014\u000b\u0016Cn\\J\u001cC3DN\u0002\u001b";
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(byte[] r15) {
        /*
        r14 = this;
        r0 = 0;
        r13 = -1;
        r12 = 32;
        r1 = 1;
        r10 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        if (r15 == 0) goto L_0x000e;
    L_0x000b:
        r2 = r15.length;	 Catch:{ fN -> 0x0036 }
        if (r2 != 0) goto L_0x003c;
    L_0x000e:
        r0 = new java.lang.StringBuilder;	 Catch:{ fN -> 0x0038 }
        r0.<init>();	 Catch:{ fN -> 0x0038 }
        r1 = z;	 Catch:{ fN -> 0x0038 }
        r2 = 32;
        r1 = r1[r2];	 Catch:{ fN -> 0x0038 }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x0038 }
        r1 = r14.e;	 Catch:{ fN -> 0x0038 }
        r1 = r1.k;	 Catch:{ fN -> 0x0038 }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x0038 }
        r0 = r0.toString();	 Catch:{ fN -> 0x0038 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ fN -> 0x0038 }
        r0 = r14.b;	 Catch:{ fN -> 0x0038 }
        if (r0 == 0) goto L_0x0035;
    L_0x0030:
        r0 = r14.e;	 Catch:{ fN -> 0x003a }
        com.whatsapp.App.l(r0);	 Catch:{ fN -> 0x003a }
    L_0x0035:
        return;
    L_0x0036:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0038 }
    L_0x0038:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x003a }
    L_0x003a:
        r0 = move-exception;
        throw r0;
    L_0x003c:
        r2 = r15.length;
        r2 = r2 + -1;
        r2 = r15[r2];
        r2 = r2 & 255;
        if (r2 != 0) goto L_0x0088;
    L_0x0045:
        r0 = new java.lang.StringBuilder;	 Catch:{ fN -> 0x0084 }
        r0.<init>();	 Catch:{ fN -> 0x0084 }
        r1 = z;	 Catch:{ fN -> 0x0084 }
        r2 = 42;
        r1 = r1[r2];	 Catch:{ fN -> 0x0084 }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x0084 }
        r1 = r14.e;	 Catch:{ fN -> 0x0084 }
        r1 = r1.k;	 Catch:{ fN -> 0x0084 }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x0084 }
        r0 = r0.toString();	 Catch:{ fN -> 0x0084 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ fN -> 0x0084 }
        r0 = r14.b;	 Catch:{ fN -> 0x0084 }
        if (r0 == 0) goto L_0x006c;
    L_0x0067:
        r0 = r14.e;	 Catch:{ fN -> 0x0086 }
        com.whatsapp.App.l(r0);	 Catch:{ fN -> 0x0086 }
    L_0x006c:
        r0 = r14.g;
        r1 = java.lang.Double.valueOf(r10);
        r0.g = r1;
        r0 = r14.g;
        r1 = com.whatsapp.fieldstats.j.INVALID_PADDING;
        r1 = r1.getCode();
        r2 = (double) r1;
        r1 = java.lang.Double.valueOf(r2);
        r0.e = r1;
        goto L_0x0035;
    L_0x0084:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0086 }
    L_0x0086:
        r0 = move-exception;
        throw r0;
    L_0x0088:
        r4 = r15.length;	 Catch:{ fN -> 0x00cb }
        if (r2 < r4) goto L_0x00cf;
    L_0x008b:
        r0 = new java.lang.StringBuilder;	 Catch:{ fN -> 0x00cb }
        r0.<init>();	 Catch:{ fN -> 0x00cb }
        r1 = z;	 Catch:{ fN -> 0x00cb }
        r2 = 23;
        r1 = r1[r2];	 Catch:{ fN -> 0x00cb }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x00cb }
        r1 = r14.e;	 Catch:{ fN -> 0x00cb }
        r1 = r1.k;	 Catch:{ fN -> 0x00cb }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x00cb }
        r0 = r0.toString();	 Catch:{ fN -> 0x00cb }
        com.whatsapp.util.Log.w(r0);	 Catch:{ fN -> 0x00cb }
        r0 = r14.b;	 Catch:{ fN -> 0x00cb }
        if (r0 == 0) goto L_0x00b2;
    L_0x00ad:
        r0 = r14.e;	 Catch:{ fN -> 0x00cd }
        com.whatsapp.App.l(r0);	 Catch:{ fN -> 0x00cd }
    L_0x00b2:
        r0 = r14.g;
        r1 = java.lang.Double.valueOf(r10);
        r0.g = r1;
        r0 = r14.g;
        r1 = com.whatsapp.fieldstats.j.INVALID_PADDING;
        r1 = r1.getCode();
        r2 = (double) r1;
        r1 = java.lang.Double.valueOf(r2);
        r0.e = r1;
        goto L_0x0035;
    L_0x00cb:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x00cd }
    L_0x00cd:
        r0 = move-exception;
        throw r0;
    L_0x00cf:
        r4 = r15.length;
        r2 = r4 - r2;
        r2 = new byte[r2];
        r4 = r2.length;
        java.lang.System.arraycopy(r15, r0, r2, r0, r4);
        r4 = com.whatsapp.proto.E2E.Message.parseFrom(r2);	 Catch:{ fN -> 0x0161 }
        r2 = r4.getUnknownFields();
        r2 = r2.a();
        r2 = r2.keySet();
        r5 = r2.isEmpty();
        if (r5 != 0) goto L_0x01a6;
    L_0x00ee:
        r1 = r2.size();
        r4 = new int[r1];
        r5 = r2.iterator();
        r1 = r0;
    L_0x00f9:
        r0 = r5.hasNext();
        if (r0 == 0) goto L_0x010f;
    L_0x00ff:
        r0 = r5.next();
        r0 = (java.lang.Integer) r0;
        r2 = r1 + 1;
        r0 = r0.intValue();
        r4[r1] = r0;
        if (r3 == 0) goto L_0x0f3a;
    L_0x010f:
        r0 = new java.lang.StringBuilder;	 Catch:{ fN -> 0x01a4 }
        r0.<init>();	 Catch:{ fN -> 0x01a4 }
        r1 = z;	 Catch:{ fN -> 0x01a4 }
        r2 = 11;
        r1 = r1[r2];	 Catch:{ fN -> 0x01a4 }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x01a4 }
        r1 = r14.e;	 Catch:{ fN -> 0x01a4 }
        r1 = r1.k;	 Catch:{ fN -> 0x01a4 }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x01a4 }
        r1 = z;	 Catch:{ fN -> 0x01a4 }
        r2 = 50;
        r1 = r1[r2];	 Catch:{ fN -> 0x01a4 }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x01a4 }
        r1 = java.util.Arrays.toString(r4);	 Catch:{ fN -> 0x01a4 }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x01a4 }
        r0 = r0.toString();	 Catch:{ fN -> 0x01a4 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ fN -> 0x01a4 }
        r0 = r14.b;	 Catch:{ fN -> 0x01a4 }
        if (r0 == 0) goto L_0x0148;
    L_0x0143:
        r0 = r14.e;	 Catch:{ fN -> 0x01a4 }
        com.whatsapp.App.a(r0, r4);	 Catch:{ fN -> 0x01a4 }
    L_0x0148:
        r0 = r14.g;
        r1 = java.lang.Double.valueOf(r10);
        r0.g = r1;
        r0 = r14.g;
        r1 = com.whatsapp.fieldstats.j.UNKNOWN_V2_TAGS;
        r1 = r1.getCode();
        r2 = (double) r1;
        r1 = java.lang.Double.valueOf(r2);
        r0.e = r1;
        goto L_0x0035;
    L_0x0161:
        r0 = move-exception;
        r0 = new java.lang.StringBuilder;	 Catch:{ fN -> 0x01a2 }
        r0.<init>();	 Catch:{ fN -> 0x01a2 }
        r1 = z;	 Catch:{ fN -> 0x01a2 }
        r2 = 24;
        r1 = r1[r2];	 Catch:{ fN -> 0x01a2 }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x01a2 }
        r1 = r14.e;	 Catch:{ fN -> 0x01a2 }
        r1 = r1.k;	 Catch:{ fN -> 0x01a2 }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x01a2 }
        r0 = r0.toString();	 Catch:{ fN -> 0x01a2 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ fN -> 0x01a2 }
        r0 = r14.b;	 Catch:{ fN -> 0x01a2 }
        if (r0 == 0) goto L_0x0189;
    L_0x0184:
        r0 = r14.e;	 Catch:{ fN -> 0x01a2 }
        com.whatsapp.App.l(r0);	 Catch:{ fN -> 0x01a2 }
    L_0x0189:
        r0 = r14.g;
        r1 = java.lang.Double.valueOf(r10);
        r0.g = r1;
        r0 = r14.g;
        r1 = com.whatsapp.fieldstats.j.INVALID_PROTOCOL_BUFFER;
        r1 = r1.getCode();
        r2 = (double) r1;
        r1 = java.lang.Double.valueOf(r2);
        r0.e = r1;
        goto L_0x0035;
    L_0x01a2:
        r0 = move-exception;
        throw r0;
    L_0x01a4:
        r0 = move-exception;
        throw r0;
    L_0x01a6:
        r2 = r4.hasContactMessage();	 Catch:{ fN -> 0x022f }
        if (r2 == 0) goto L_0x0f37;
    L_0x01ac:
        r2 = r1;
    L_0x01ad:
        r5 = r4.hasConversation();	 Catch:{ fN -> 0x0231 }
        if (r5 == 0) goto L_0x01b5;
    L_0x01b3:
        r2 = r2 + 1;
    L_0x01b5:
        r5 = r4.hasImageMessage();	 Catch:{ fN -> 0x0233 }
        if (r5 == 0) goto L_0x01bd;
    L_0x01bb:
        r2 = r2 + 1;
    L_0x01bd:
        r5 = r4.hasLocationMessage();	 Catch:{ fN -> 0x0235 }
        if (r5 == 0) goto L_0x01c5;
    L_0x01c3:
        r2 = r2 + 1;
    L_0x01c5:
        r5 = r4.hasUrlMessage();	 Catch:{ fN -> 0x0237 }
        if (r5 == 0) goto L_0x01cd;
    L_0x01cb:
        r2 = r2 + 1;
    L_0x01cd:
        r5 = r4.hasDocumentMessage();	 Catch:{ fN -> 0x0239 }
        if (r5 == 0) goto L_0x01d5;
    L_0x01d3:
        r2 = r2 + 1;
    L_0x01d5:
        r5 = r4.hasAudioMessage();	 Catch:{ fN -> 0x023b }
        if (r5 == 0) goto L_0x01dd;
    L_0x01db:
        r2 = r2 + 1;
    L_0x01dd:
        r5 = r4.hasVideoMessage();	 Catch:{ fN -> 0x023d }
        if (r5 == 0) goto L_0x01e5;
    L_0x01e3:
        r2 = r2 + 1;
    L_0x01e5:
        if (r2 == r1) goto L_0x0245;
    L_0x01e7:
        if (r2 != 0) goto L_0x01ef;
    L_0x01e9:
        r5 = r4.hasSenderKeyDistributionMessage();	 Catch:{ fN -> 0x023f }
        if (r5 != 0) goto L_0x0245;
    L_0x01ef:
        r0 = new java.lang.StringBuilder;	 Catch:{ fN -> 0x0241 }
        r0.<init>();	 Catch:{ fN -> 0x0241 }
        r1 = z;	 Catch:{ fN -> 0x0241 }
        r2 = 25;
        r1 = r1[r2];	 Catch:{ fN -> 0x0241 }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x0241 }
        r1 = r14.e;	 Catch:{ fN -> 0x0241 }
        r1 = r1.k;	 Catch:{ fN -> 0x0241 }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x0241 }
        r0 = r0.toString();	 Catch:{ fN -> 0x0241 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ fN -> 0x0241 }
        r0 = r14.b;	 Catch:{ fN -> 0x0241 }
        if (r0 == 0) goto L_0x0216;
    L_0x0211:
        r0 = r14.e;	 Catch:{ fN -> 0x0243 }
        com.whatsapp.App.l(r0);	 Catch:{ fN -> 0x0243 }
    L_0x0216:
        r0 = r14.g;
        r1 = java.lang.Double.valueOf(r10);
        r0.g = r1;
        r0 = r14.g;
        r1 = com.whatsapp.fieldstats.j.INVALID_NUMBER_OF_MESSAGE_TYPES;
        r1 = r1.getCode();
        r2 = (double) r1;
        r1 = java.lang.Double.valueOf(r2);
        r0.e = r1;
        goto L_0x0035;
    L_0x022f:
        r0 = move-exception;
        throw r0;
    L_0x0231:
        r0 = move-exception;
        throw r0;
    L_0x0233:
        r0 = move-exception;
        throw r0;
    L_0x0235:
        r0 = move-exception;
        throw r0;
    L_0x0237:
        r0 = move-exception;
        throw r0;
    L_0x0239:
        r0 = move-exception;
        throw r0;
    L_0x023b:
        r0 = move-exception;
        throw r0;
    L_0x023d:
        r0 = move-exception;
        throw r0;
    L_0x023f:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0241 }
    L_0x0241:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0243 }
    L_0x0243:
        r0 = move-exception;
        throw r0;
    L_0x0245:
        r5 = r4.hasConversation();	 Catch:{ fN -> 0x04c8 }
        if (r5 == 0) goto L_0x0275;
    L_0x024b:
        r5 = r14.g;	 Catch:{ fN -> 0x04c8 }
        r6 = com.whatsapp.fieldstats.cw.NONE;	 Catch:{ fN -> 0x04c8 }
        r6 = r6.getCode();	 Catch:{ fN -> 0x04c8 }
        r6 = (double) r6;	 Catch:{ fN -> 0x04c8 }
        r6 = java.lang.Double.valueOf(r6);	 Catch:{ fN -> 0x04c8 }
        r5.b = r6;	 Catch:{ fN -> 0x04c8 }
        r5 = r14.e;	 Catch:{ fN -> 0x04c8 }
        r6 = r4.getConversation();	 Catch:{ fN -> 0x04c8 }
        r5.b(r6);	 Catch:{ fN -> 0x04c8 }
        r5 = com.whatsapp.App.aK;	 Catch:{ fN -> 0x04c8 }
        r6 = r14.e;	 Catch:{ fN -> 0x04c8 }
        r7 = -1;
        r8 = r14.c;	 Catch:{ fN -> 0x04c8 }
        r8 = r8.a;	 Catch:{ fN -> 0x04c8 }
        r9 = r14.f;	 Catch:{ fN -> 0x04c8 }
        r9 = r9.d;	 Catch:{ fN -> 0x04c8 }
        r5.a(r6, r7, r8, r9);	 Catch:{ fN -> 0x04c8 }
        if (r3 == 0) goto L_0x0e20;
    L_0x0275:
        r5 = r4.hasContactMessage();	 Catch:{ fN -> 0x04ca }
        if (r5 == 0) goto L_0x02c9;
    L_0x027b:
        r5 = r14.g;	 Catch:{ fN -> 0x04cc }
        r6 = com.whatsapp.fieldstats.cw.CONTACT;	 Catch:{ fN -> 0x04cc }
        r6 = r6.getCode();	 Catch:{ fN -> 0x04cc }
        r6 = (double) r6;	 Catch:{ fN -> 0x04cc }
        r6 = java.lang.Double.valueOf(r6);	 Catch:{ fN -> 0x04cc }
        r5.b = r6;	 Catch:{ fN -> 0x04cc }
        r5 = r14.e;	 Catch:{ fN -> 0x04cc }
        r6 = 4;
        r5.c = r6;	 Catch:{ fN -> 0x04cc }
        r5 = r4.getContactMessage();	 Catch:{ fN -> 0x04cc }
        r5 = r5.hasDisplayName();	 Catch:{ fN -> 0x04cc }
        if (r5 == 0) goto L_0x02a5;
    L_0x0299:
        r5 = r14.e;	 Catch:{ fN -> 0x04ce }
        r6 = r4.getContactMessage();	 Catch:{ fN -> 0x04ce }
        r6 = r6.getDisplayName();	 Catch:{ fN -> 0x04ce }
        r5.A = r6;	 Catch:{ fN -> 0x04ce }
    L_0x02a5:
        r5 = r14.e;	 Catch:{ fN -> 0x04d0 }
        r6 = 0;
        r5.u = r6;	 Catch:{ fN -> 0x04d0 }
        r5 = r14.e;	 Catch:{ fN -> 0x04d0 }
        r6 = r4.getContactMessage();	 Catch:{ fN -> 0x04d0 }
        r6 = r6.getVcard();	 Catch:{ fN -> 0x04d0 }
        r5.b(r6);	 Catch:{ fN -> 0x04d0 }
        r5 = com.whatsapp.App.aK;	 Catch:{ fN -> 0x04d0 }
        r6 = r14.e;	 Catch:{ fN -> 0x04d0 }
        r7 = -1;
        r8 = r14.c;	 Catch:{ fN -> 0x04d0 }
        r8 = r8.a;	 Catch:{ fN -> 0x04d0 }
        r9 = r14.f;	 Catch:{ fN -> 0x04d0 }
        r9 = r9.d;	 Catch:{ fN -> 0x04d0 }
        r5.a(r6, r7, r8, r9);	 Catch:{ fN -> 0x04d0 }
        if (r3 == 0) goto L_0x0e20;
    L_0x02c9:
        r5 = r4.hasLocationMessage();	 Catch:{ fN -> 0x04d0 }
        if (r5 == 0) goto L_0x038c;
    L_0x02cf:
        r5 = r14.g;	 Catch:{ fN -> 0x04d2 }
        r6 = com.whatsapp.fieldstats.cw.LOCATION;	 Catch:{ fN -> 0x04d2 }
        r6 = r6.getCode();	 Catch:{ fN -> 0x04d2 }
        r6 = (double) r6;	 Catch:{ fN -> 0x04d2 }
        r6 = java.lang.Double.valueOf(r6);	 Catch:{ fN -> 0x04d2 }
        r5.b = r6;	 Catch:{ fN -> 0x04d2 }
        r5 = r14.e;	 Catch:{ fN -> 0x04d2 }
        r6 = 5;
        r5.c = r6;	 Catch:{ fN -> 0x04d2 }
        r5 = r14.e;	 Catch:{ fN -> 0x04d2 }
        r6 = r4.getLocationMessage();	 Catch:{ fN -> 0x04d2 }
        r6 = r6.getDegreesLatitude();	 Catch:{ fN -> 0x04d2 }
        r5.m = r6;	 Catch:{ fN -> 0x04d2 }
        r5 = r14.e;	 Catch:{ fN -> 0x04d2 }
        r6 = r4.getLocationMessage();	 Catch:{ fN -> 0x04d2 }
        r6 = r6.getDegreesLongitude();	 Catch:{ fN -> 0x04d2 }
        r5.l = r6;	 Catch:{ fN -> 0x04d2 }
        r5 = r4.getLocationMessage();	 Catch:{ fN -> 0x04d2 }
        r5 = r5.hasUrl();	 Catch:{ fN -> 0x04d2 }
        if (r5 == 0) goto L_0x0311;
    L_0x0305:
        r5 = r14.e;	 Catch:{ fN -> 0x04d4 }
        r6 = r4.getLocationMessage();	 Catch:{ fN -> 0x04d4 }
        r6 = r6.getUrl();	 Catch:{ fN -> 0x04d4 }
        r5.q = r6;	 Catch:{ fN -> 0x04d4 }
    L_0x0311:
        r5 = r4.getLocationMessage();	 Catch:{ fN -> 0x04d6 }
        r5 = r5.hasName();	 Catch:{ fN -> 0x04d6 }
        if (r5 != 0) goto L_0x0325;
    L_0x031b:
        r5 = r4.getLocationMessage();	 Catch:{ fN -> 0x04d6 }
        r5 = r5.hasAddress();	 Catch:{ fN -> 0x04d6 }
        if (r5 == 0) goto L_0x0351;
    L_0x0325:
        r5 = r14.e;	 Catch:{ fN -> 0x04d8 }
        r6 = new java.lang.StringBuilder;	 Catch:{ fN -> 0x04d8 }
        r6.<init>();	 Catch:{ fN -> 0x04d8 }
        r7 = r4.getLocationMessage();	 Catch:{ fN -> 0x04d8 }
        r7 = r7.getName();	 Catch:{ fN -> 0x04d8 }
        r6 = r6.append(r7);	 Catch:{ fN -> 0x04d8 }
        r7 = "\n";
        r6 = r6.append(r7);	 Catch:{ fN -> 0x04d8 }
        r7 = r4.getLocationMessage();	 Catch:{ fN -> 0x04d8 }
        r7 = r7.getAddress();	 Catch:{ fN -> 0x04d8 }
        r6 = r6.append(r7);	 Catch:{ fN -> 0x04d8 }
        r6 = r6.toString();	 Catch:{ fN -> 0x04d8 }
        r5.A = r6;	 Catch:{ fN -> 0x04d8 }
    L_0x0351:
        r5 = r4.getLocationMessage();	 Catch:{ fN -> 0x04da }
        r5 = r5.hasJpegThumbnail();	 Catch:{ fN -> 0x04da }
        if (r5 == 0) goto L_0x0371;
    L_0x035b:
        r5 = r14.e;	 Catch:{ fN -> 0x04da }
        r6 = 1;
        r5.u = r6;	 Catch:{ fN -> 0x04da }
        r5 = r14.e;	 Catch:{ fN -> 0x04da }
        r6 = r4.getLocationMessage();	 Catch:{ fN -> 0x04da }
        r6 = r6.getJpegThumbnail();	 Catch:{ fN -> 0x04da }
        r6 = r6.h();	 Catch:{ fN -> 0x04da }
        r5.a(r6);	 Catch:{ fN -> 0x04da }
    L_0x0371:
        r5 = r14.e;	 Catch:{ fN -> 0x04dc }
        r6 = new com.whatsapp.MediaData;	 Catch:{ fN -> 0x04dc }
        r6.<init>();	 Catch:{ fN -> 0x04dc }
        r5.Q = r6;	 Catch:{ fN -> 0x04dc }
        r5 = com.whatsapp.App.aK;	 Catch:{ fN -> 0x04dc }
        r6 = r14.e;	 Catch:{ fN -> 0x04dc }
        r7 = -1;
        r8 = r14.c;	 Catch:{ fN -> 0x04dc }
        r8 = r8.a;	 Catch:{ fN -> 0x04dc }
        r9 = r14.f;	 Catch:{ fN -> 0x04dc }
        r9 = r9.d;	 Catch:{ fN -> 0x04dc }
        r5.a(r6, r7, r8, r9);	 Catch:{ fN -> 0x04dc }
        if (r3 == 0) goto L_0x0e20;
    L_0x038c:
        r5 = r4.hasUrlMessage();	 Catch:{ fN -> 0x04dc }
        if (r5 == 0) goto L_0x043a;
    L_0x0392:
        r5 = r14.g;
        r6 = com.whatsapp.fieldstats.cw.URL;
        r6 = r6.getCode();
        r6 = (double) r6;
        r6 = java.lang.Double.valueOf(r6);
        r5.b = r6;
        r5 = r14.e;
        r6 = r4.getUrlMessage();
        r6 = r6.getText();
        r5.b(r6);
        r5 = r4.getUrlMessage();
        r5 = r5.getMatchedText();
        r6 = r14.e;
        r6 = r6.c();
        r6 = com.whatsapp.util.ac.c(r6);
        r7 = android.text.TextUtils.isEmpty(r5);	 Catch:{ fN -> 0x04de }
        if (r7 != 0) goto L_0x03cc;
    L_0x03c6:
        r5 = r5.equals(r6);	 Catch:{ fN -> 0x04de }
        if (r5 == 0) goto L_0x0428;
    L_0x03cc:
        r5 = r4.getUrlMessage();	 Catch:{ fN -> 0x04e0 }
        r5 = r5.hasTitle();	 Catch:{ fN -> 0x04e0 }
        if (r5 == 0) goto L_0x03e2;
    L_0x03d6:
        r5 = r14.e;	 Catch:{ fN -> 0x04e2 }
        r6 = r4.getUrlMessage();	 Catch:{ fN -> 0x04e2 }
        r6 = r6.getTitle();	 Catch:{ fN -> 0x04e2 }
        r5.a = r6;	 Catch:{ fN -> 0x04e2 }
    L_0x03e2:
        r5 = r4.getUrlMessage();	 Catch:{ fN -> 0x04e4 }
        r5 = r5.hasDescription();	 Catch:{ fN -> 0x04e4 }
        if (r5 == 0) goto L_0x03f8;
    L_0x03ec:
        r5 = r14.e;	 Catch:{ fN -> 0x04e4 }
        r6 = r4.getUrlMessage();	 Catch:{ fN -> 0x04e4 }
        r6 = r6.getDescription();	 Catch:{ fN -> 0x04e4 }
        r5.A = r6;	 Catch:{ fN -> 0x04e4 }
    L_0x03f8:
        r5 = r4.getUrlMessage();	 Catch:{ fN -> 0x04e6 }
        r5 = r5.hasCanonicalUrl();	 Catch:{ fN -> 0x04e6 }
        if (r5 == 0) goto L_0x040e;
    L_0x0402:
        r5 = r14.e;	 Catch:{ fN -> 0x04e6 }
        r6 = r4.getUrlMessage();	 Catch:{ fN -> 0x04e6 }
        r6 = r6.getCanonicalUrl();	 Catch:{ fN -> 0x04e6 }
        r5.q = r6;	 Catch:{ fN -> 0x04e6 }
    L_0x040e:
        r5 = r4.getUrlMessage();	 Catch:{ fN -> 0x04e8 }
        r5 = r5.hasJpegThumbnail();	 Catch:{ fN -> 0x04e8 }
        if (r5 == 0) goto L_0x0428;
    L_0x0418:
        r5 = r14.e;	 Catch:{ fN -> 0x04e8 }
        r6 = r4.getUrlMessage();	 Catch:{ fN -> 0x04e8 }
        r6 = r6.getJpegThumbnail();	 Catch:{ fN -> 0x04e8 }
        r6 = r6.h();	 Catch:{ fN -> 0x04e8 }
        r5.Q = r6;	 Catch:{ fN -> 0x04e8 }
    L_0x0428:
        r5 = com.whatsapp.App.aK;	 Catch:{ fN -> 0x04ea }
        r6 = r14.e;	 Catch:{ fN -> 0x04ea }
        r7 = -1;
        r8 = r14.c;	 Catch:{ fN -> 0x04ea }
        r8 = r8.a;	 Catch:{ fN -> 0x04ea }
        r9 = r14.f;	 Catch:{ fN -> 0x04ea }
        r9 = r9.d;	 Catch:{ fN -> 0x04ea }
        r5.a(r6, r7, r8, r9);	 Catch:{ fN -> 0x04ea }
        if (r3 == 0) goto L_0x0e20;
    L_0x043a:
        r5 = r4.hasImageMessage();	 Catch:{ fN -> 0x04ea }
        if (r5 == 0) goto L_0x06e0;
    L_0x0440:
        r5 = r14.g;
        r6 = com.whatsapp.fieldstats.cw.PHOTO;
        r6 = r6.getCode();
        r6 = (double) r6;
        r6 = java.lang.Double.valueOf(r6);
        r5.b = r6;
        r5 = r4.getImageMessage();
        r6 = r14.e;
        r6.c = r1;
        r6 = r5.getJpegThumbnail();
        r6 = r6.h();
        r7 = r6.length;	 Catch:{ fN -> 0x04ec }
        if (r7 <= 0) goto L_0x046c;
    L_0x0462:
        r7 = r14.e;	 Catch:{ fN -> 0x04ec }
        r7.a(r6);	 Catch:{ fN -> 0x04ec }
        r6 = r14.e;	 Catch:{ fN -> 0x04ec }
        r7 = 1;
        r6.u = r7;	 Catch:{ fN -> 0x04ec }
    L_0x046c:
        r6 = r5.getFileLength();	 Catch:{ fN -> 0x04ee }
        r8 = 0;
        r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r6 > 0) goto L_0x04f2;
    L_0x0476:
        r0 = new java.lang.StringBuilder;	 Catch:{ fN -> 0x04ee }
        r0.<init>();	 Catch:{ fN -> 0x04ee }
        r1 = z;	 Catch:{ fN -> 0x04ee }
        r2 = 52;
        r1 = r1[r2];	 Catch:{ fN -> 0x04ee }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x04ee }
        r2 = r5.getFileLength();	 Catch:{ fN -> 0x04ee }
        r0 = r0.append(r2);	 Catch:{ fN -> 0x04ee }
        r1 = z;	 Catch:{ fN -> 0x04ee }
        r2 = 39;
        r1 = r1[r2];	 Catch:{ fN -> 0x04ee }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x04ee }
        r1 = r14.e;	 Catch:{ fN -> 0x04ee }
        r1 = r1.k;	 Catch:{ fN -> 0x04ee }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x04ee }
        r0 = r0.toString();	 Catch:{ fN -> 0x04ee }
        com.whatsapp.util.Log.w(r0);	 Catch:{ fN -> 0x04ee }
        r0 = r14.b;	 Catch:{ fN -> 0x04ee }
        if (r0 == 0) goto L_0x04af;
    L_0x04aa:
        r0 = r14.e;	 Catch:{ fN -> 0x04f0 }
        com.whatsapp.App.l(r0);	 Catch:{ fN -> 0x04f0 }
    L_0x04af:
        r0 = r14.g;
        r1 = java.lang.Double.valueOf(r10);
        r0.g = r1;
        r0 = r14.g;
        r1 = com.whatsapp.fieldstats.j.INVALID_IMAGE_FILE_LENGTH;
        r1 = r1.getCode();
        r2 = (double) r1;
        r1 = java.lang.Double.valueOf(r2);
        r0.e = r1;
        goto L_0x0035;
    L_0x04c8:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x04ca }
    L_0x04ca:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x04cc }
    L_0x04cc:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x04ce }
    L_0x04ce:
        r0 = move-exception;
        throw r0;
    L_0x04d0:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x04d2 }
    L_0x04d2:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x04d4 }
    L_0x04d4:
        r0 = move-exception;
        throw r0;
    L_0x04d6:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x04d8 }
    L_0x04d8:
        r0 = move-exception;
        throw r0;
    L_0x04da:
        r0 = move-exception;
        throw r0;
    L_0x04dc:
        r0 = move-exception;
        throw r0;
    L_0x04de:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x04e0 }
    L_0x04e0:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x04e2 }
    L_0x04e2:
        r0 = move-exception;
        throw r0;
    L_0x04e4:
        r0 = move-exception;
        throw r0;
    L_0x04e6:
        r0 = move-exception;
        throw r0;
    L_0x04e8:
        r0 = move-exception;
        throw r0;
    L_0x04ea:
        r0 = move-exception;
        throw r0;
    L_0x04ec:
        r0 = move-exception;
        throw r0;
    L_0x04ee:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x04f0 }
    L_0x04f0:
        r0 = move-exception;
        throw r0;
    L_0x04f2:
        r6 = r14.e;
        r8 = r5.getFileLength();
        r6.z = r8;
        r6 = r5.getFileSha256();
        r6 = r6.h();
        r7 = r6.length;	 Catch:{ fN -> 0x0554 }
        if (r7 == r12) goto L_0x0558;
    L_0x0505:
        r0 = new java.lang.StringBuilder;	 Catch:{ fN -> 0x0554 }
        r0.<init>();	 Catch:{ fN -> 0x0554 }
        r1 = z;	 Catch:{ fN -> 0x0554 }
        r2 = 26;
        r1 = r1[r2];	 Catch:{ fN -> 0x0554 }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x0554 }
        r1 = r6.length;	 Catch:{ fN -> 0x0554 }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x0554 }
        r1 = z;	 Catch:{ fN -> 0x0554 }
        r2 = 28;
        r1 = r1[r2];	 Catch:{ fN -> 0x0554 }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x0554 }
        r1 = r14.e;	 Catch:{ fN -> 0x0554 }
        r1 = r1.k;	 Catch:{ fN -> 0x0554 }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x0554 }
        r0 = r0.toString();	 Catch:{ fN -> 0x0554 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ fN -> 0x0554 }
        r0 = r14.b;	 Catch:{ fN -> 0x0554 }
        if (r0 == 0) goto L_0x053b;
    L_0x0536:
        r0 = r14.e;	 Catch:{ fN -> 0x0556 }
        com.whatsapp.App.l(r0);	 Catch:{ fN -> 0x0556 }
    L_0x053b:
        r0 = r14.g;
        r1 = java.lang.Double.valueOf(r10);
        r0.g = r1;
        r0 = r14.g;
        r1 = com.whatsapp.fieldstats.j.INVALID_IMAGE_FILE_SHA256;
        r1 = r1.getCode();
        r2 = (double) r1;
        r1 = java.lang.Double.valueOf(r2);
        r0.e = r1;
        goto L_0x0035;
    L_0x0554:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0556 }
    L_0x0556:
        r0 = move-exception;
        throw r0;
    L_0x0558:
        r7 = r14.e;	 Catch:{ fN -> 0x05e7 }
        r8 = 2;
        r6 = android.backport.util.Base64.encodeToString(r6, r8);	 Catch:{ fN -> 0x05e7 }
        r7.o = r6;	 Catch:{ fN -> 0x05e7 }
        r6 = r5.getUrl();	 Catch:{ fN -> 0x05e7 }
        r6 = r14.a(r6);	 Catch:{ fN -> 0x05e7 }
        if (r6 == 0) goto L_0x0035;
    L_0x056b:
        r6 = r14.e;	 Catch:{ fN -> 0x05e9 }
        r7 = r5.getUrl();	 Catch:{ fN -> 0x05e9 }
        r6.q = r7;	 Catch:{ fN -> 0x05e9 }
        r6 = r5.getCaption();	 Catch:{ fN -> 0x05e9 }
        r6 = android.text.TextUtils.isEmpty(r6);	 Catch:{ fN -> 0x05e9 }
        if (r6 != 0) goto L_0x0585;
    L_0x057d:
        r6 = r14.e;	 Catch:{ fN -> 0x05e9 }
        r7 = r5.getCaption();	 Catch:{ fN -> 0x05e9 }
        r6.a = r7;	 Catch:{ fN -> 0x05e9 }
    L_0x0585:
        r6 = z;	 Catch:{ fN -> 0x05eb }
        r7 = 13;
        r6 = r6[r7];	 Catch:{ fN -> 0x05eb }
        r7 = r5.getMimetype();	 Catch:{ fN -> 0x05eb }
        r6 = r6.equalsIgnoreCase(r7);	 Catch:{ fN -> 0x05eb }
        if (r6 != 0) goto L_0x05ef;
    L_0x0595:
        r0 = new java.lang.StringBuilder;	 Catch:{ fN -> 0x05eb }
        r0.<init>();	 Catch:{ fN -> 0x05eb }
        r1 = z;	 Catch:{ fN -> 0x05eb }
        r2 = 19;
        r1 = r1[r2];	 Catch:{ fN -> 0x05eb }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x05eb }
        r1 = r5.getMimetype();	 Catch:{ fN -> 0x05eb }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x05eb }
        r1 = z;	 Catch:{ fN -> 0x05eb }
        r2 = 47;
        r1 = r1[r2];	 Catch:{ fN -> 0x05eb }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x05eb }
        r1 = r14.e;	 Catch:{ fN -> 0x05eb }
        r1 = r1.k;	 Catch:{ fN -> 0x05eb }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x05eb }
        r0 = r0.toString();	 Catch:{ fN -> 0x05eb }
        com.whatsapp.util.Log.w(r0);	 Catch:{ fN -> 0x05eb }
        r0 = r14.b;	 Catch:{ fN -> 0x05eb }
        if (r0 == 0) goto L_0x05ce;
    L_0x05c9:
        r0 = r14.e;	 Catch:{ fN -> 0x05ed }
        com.whatsapp.App.l(r0);	 Catch:{ fN -> 0x05ed }
    L_0x05ce:
        r0 = r14.g;
        r1 = java.lang.Double.valueOf(r10);
        r0.g = r1;
        r0 = r14.g;
        r1 = com.whatsapp.fieldstats.j.INVALID_IMAGE_MIME_TYPE;
        r1 = r1.getCode();
        r2 = (double) r1;
        r1 = java.lang.Double.valueOf(r2);
        r0.e = r1;
        goto L_0x0035;
    L_0x05e7:
        r0 = move-exception;
        throw r0;
    L_0x05e9:
        r0 = move-exception;
        throw r0;
    L_0x05eb:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x05ed }
    L_0x05ed:
        r0 = move-exception;
        throw r0;
    L_0x05ef:
        r6 = r14.e;	 Catch:{ fN -> 0x063d }
        r7 = r5.getMimetype();	 Catch:{ fN -> 0x063d }
        r6.n = r7;	 Catch:{ fN -> 0x063d }
        r6 = r5.hasMediaKey();	 Catch:{ fN -> 0x063d }
        if (r6 != 0) goto L_0x0641;
    L_0x05fd:
        r0 = new java.lang.StringBuilder;	 Catch:{ fN -> 0x063d }
        r0.<init>();	 Catch:{ fN -> 0x063d }
        r1 = z;	 Catch:{ fN -> 0x063d }
        r2 = 38;
        r1 = r1[r2];	 Catch:{ fN -> 0x063d }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x063d }
        r1 = r14.e;	 Catch:{ fN -> 0x063d }
        r1 = r1.k;	 Catch:{ fN -> 0x063d }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x063d }
        r0 = r0.toString();	 Catch:{ fN -> 0x063d }
        com.whatsapp.util.Log.w(r0);	 Catch:{ fN -> 0x063d }
        r0 = r14.b;	 Catch:{ fN -> 0x063d }
        if (r0 == 0) goto L_0x0624;
    L_0x061f:
        r0 = r14.e;	 Catch:{ fN -> 0x063f }
        com.whatsapp.App.l(r0);	 Catch:{ fN -> 0x063f }
    L_0x0624:
        r0 = r14.g;
        r1 = java.lang.Double.valueOf(r10);
        r0.g = r1;
        r0 = r14.g;
        r1 = com.whatsapp.fieldstats.j.INVALID_IMAGE_MEDIA_KEY;
        r1 = r1.getCode();
        r2 = (double) r1;
        r1 = java.lang.Double.valueOf(r2);
        r0.e = r1;
        goto L_0x0035;
    L_0x063d:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x063f }
    L_0x063f:
        r0 = move-exception;
        throw r0;
    L_0x0641:
        r5 = r5.getMediaKey();
        r5 = r5.h();
        r6 = r5.length;	 Catch:{ fN -> 0x069b }
        if (r6 == r12) goto L_0x069f;
    L_0x064c:
        r0 = new java.lang.StringBuilder;	 Catch:{ fN -> 0x069b }
        r0.<init>();	 Catch:{ fN -> 0x069b }
        r1 = z;	 Catch:{ fN -> 0x069b }
        r2 = 33;
        r1 = r1[r2];	 Catch:{ fN -> 0x069b }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x069b }
        r1 = r5.length;	 Catch:{ fN -> 0x069b }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x069b }
        r1 = z;	 Catch:{ fN -> 0x069b }
        r2 = 20;
        r1 = r1[r2];	 Catch:{ fN -> 0x069b }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x069b }
        r1 = r14.e;	 Catch:{ fN -> 0x069b }
        r1 = r1.k;	 Catch:{ fN -> 0x069b }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x069b }
        r0 = r0.toString();	 Catch:{ fN -> 0x069b }
        com.whatsapp.util.Log.w(r0);	 Catch:{ fN -> 0x069b }
        r0 = r14.b;	 Catch:{ fN -> 0x069b }
        if (r0 == 0) goto L_0x0682;
    L_0x067d:
        r0 = r14.e;	 Catch:{ fN -> 0x069d }
        com.whatsapp.App.l(r0);	 Catch:{ fN -> 0x069d }
    L_0x0682:
        r0 = r14.g;
        r1 = java.lang.Double.valueOf(r10);
        r0.g = r1;
        r0 = r14.g;
        r1 = com.whatsapp.fieldstats.j.INVALID_IMAGE_MEDIA_KEY;
        r1 = r1.getCode();
        r2 = (double) r1;
        r1 = java.lang.Double.valueOf(r2);
        r0.e = r1;
        goto L_0x0035;
    L_0x069b:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x069d }
    L_0x069d:
        r0 = move-exception;
        throw r0;
    L_0x069f:
        r6 = r14.e;
        r6 = r6.c;
        r6 = com.whatsapp.App.a(r6);
        r6 = com.whatsapp.mt.a(r5, r6);
        r7 = new com.whatsapp.MediaData;
        r7.<init>();
        r7.mediaKey = r5;	 Catch:{ fN -> 0x0765 }
        r5 = r6.c();	 Catch:{ fN -> 0x0765 }
        r7.refKey = r5;	 Catch:{ fN -> 0x0765 }
        r5 = r6.a();	 Catch:{ fN -> 0x0765 }
        r7.cipherKey = r5;	 Catch:{ fN -> 0x0765 }
        r5 = r6.d();	 Catch:{ fN -> 0x0765 }
        r7.hmacKey = r5;	 Catch:{ fN -> 0x0765 }
        r5 = r6.b();	 Catch:{ fN -> 0x0765 }
        r7.iv = r5;	 Catch:{ fN -> 0x0765 }
        r5 = r14.e;	 Catch:{ fN -> 0x0765 }
        r5.Q = r7;	 Catch:{ fN -> 0x0765 }
        r5 = com.whatsapp.App.aK;	 Catch:{ fN -> 0x0765 }
        r6 = r14.e;	 Catch:{ fN -> 0x0765 }
        r7 = -1;
        r8 = r14.c;	 Catch:{ fN -> 0x0765 }
        r8 = r8.a;	 Catch:{ fN -> 0x0765 }
        r9 = r14.f;	 Catch:{ fN -> 0x0765 }
        r9 = r9.d;	 Catch:{ fN -> 0x0765 }
        r5.a(r6, r7, r8, r9);	 Catch:{ fN -> 0x0765 }
        if (r3 == 0) goto L_0x0e20;
    L_0x06e0:
        r5 = r4.hasAudioMessage();	 Catch:{ fN -> 0x0765 }
        if (r5 == 0) goto L_0x094a;
    L_0x06e6:
        r5 = r14.g;
        r6 = com.whatsapp.fieldstats.cw.AUDIO;
        r6 = r6.getCode();
        r6 = (double) r6;
        r6 = java.lang.Double.valueOf(r6);
        r5.b = r6;
        r5 = r4.getAudioMessage();
        r6 = r14.e;	 Catch:{ fN -> 0x0767 }
        r7 = 2;
        r6.c = r7;	 Catch:{ fN -> 0x0767 }
        r6 = r14.e;	 Catch:{ fN -> 0x0767 }
        r7 = r5.getPtt();	 Catch:{ fN -> 0x0767 }
        if (r7 == 0) goto L_0x0707;
    L_0x0706:
        r0 = r1;
    L_0x0707:
        r6.r = r0;	 Catch:{ fN -> 0x0769 }
        r0 = r5.getFileLength();	 Catch:{ fN -> 0x0769 }
        r6 = 0;
        r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1));
        if (r0 > 0) goto L_0x076d;
    L_0x0713:
        r0 = new java.lang.StringBuilder;	 Catch:{ fN -> 0x0769 }
        r0.<init>();	 Catch:{ fN -> 0x0769 }
        r1 = z;	 Catch:{ fN -> 0x0769 }
        r2 = 14;
        r1 = r1[r2];	 Catch:{ fN -> 0x0769 }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x0769 }
        r2 = r5.getFileLength();	 Catch:{ fN -> 0x0769 }
        r0 = r0.append(r2);	 Catch:{ fN -> 0x0769 }
        r1 = z;	 Catch:{ fN -> 0x0769 }
        r2 = 51;
        r1 = r1[r2];	 Catch:{ fN -> 0x0769 }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x0769 }
        r1 = r14.e;	 Catch:{ fN -> 0x0769 }
        r1 = r1.k;	 Catch:{ fN -> 0x0769 }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x0769 }
        r0 = r0.toString();	 Catch:{ fN -> 0x0769 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ fN -> 0x0769 }
        r0 = r14.b;	 Catch:{ fN -> 0x0769 }
        if (r0 == 0) goto L_0x074c;
    L_0x0747:
        r0 = r14.e;	 Catch:{ fN -> 0x076b }
        com.whatsapp.App.l(r0);	 Catch:{ fN -> 0x076b }
    L_0x074c:
        r0 = r14.g;
        r1 = java.lang.Double.valueOf(r10);
        r0.g = r1;
        r0 = r14.g;
        r1 = com.whatsapp.fieldstats.j.INVALID_IMAGE_FILE_LENGTH;
        r1 = r1.getCode();
        r2 = (double) r1;
        r1 = java.lang.Double.valueOf(r2);
        r0.e = r1;
        goto L_0x0035;
    L_0x0765:
        r0 = move-exception;
        throw r0;
    L_0x0767:
        r0 = move-exception;
        throw r0;
    L_0x0769:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x076b }
    L_0x076b:
        r0 = move-exception;
        throw r0;
    L_0x076d:
        r0 = r14.e;
        r6 = r5.getFileLength();
        r0.z = r6;
        r0 = r5.getFileSha256();
        r0 = r0.h();
        r1 = r0.length;	 Catch:{ fN -> 0x07cf }
        if (r1 == r12) goto L_0x07d3;
    L_0x0780:
        r1 = new java.lang.StringBuilder;	 Catch:{ fN -> 0x07cf }
        r1.<init>();	 Catch:{ fN -> 0x07cf }
        r2 = z;	 Catch:{ fN -> 0x07cf }
        r3 = 43;
        r2 = r2[r3];	 Catch:{ fN -> 0x07cf }
        r1 = r1.append(r2);	 Catch:{ fN -> 0x07cf }
        r0 = r0.length;	 Catch:{ fN -> 0x07cf }
        r0 = r1.append(r0);	 Catch:{ fN -> 0x07cf }
        r1 = z;	 Catch:{ fN -> 0x07cf }
        r2 = 9;
        r1 = r1[r2];	 Catch:{ fN -> 0x07cf }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x07cf }
        r1 = r14.e;	 Catch:{ fN -> 0x07cf }
        r1 = r1.k;	 Catch:{ fN -> 0x07cf }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x07cf }
        r0 = r0.toString();	 Catch:{ fN -> 0x07cf }
        com.whatsapp.util.Log.w(r0);	 Catch:{ fN -> 0x07cf }
        r0 = r14.b;	 Catch:{ fN -> 0x07cf }
        if (r0 == 0) goto L_0x07b6;
    L_0x07b1:
        r0 = r14.e;	 Catch:{ fN -> 0x07d1 }
        com.whatsapp.App.l(r0);	 Catch:{ fN -> 0x07d1 }
    L_0x07b6:
        r0 = r14.g;
        r1 = java.lang.Double.valueOf(r10);
        r0.g = r1;
        r0 = r14.g;
        r1 = com.whatsapp.fieldstats.j.INVALID_IMAGE_FILE_SHA256;
        r1 = r1.getCode();
        r2 = (double) r1;
        r1 = java.lang.Double.valueOf(r2);
        r0.e = r1;
        goto L_0x0035;
    L_0x07cf:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x07d1 }
    L_0x07d1:
        r0 = move-exception;
        throw r0;
    L_0x07d3:
        r1 = r14.e;	 Catch:{ fN -> 0x0839 }
        r6 = 2;
        r0 = android.backport.util.Base64.encodeToString(r0, r6);	 Catch:{ fN -> 0x0839 }
        r1.o = r0;	 Catch:{ fN -> 0x0839 }
        r0 = r5.getMimetype();	 Catch:{ fN -> 0x0839 }
        r1 = 1;
        r0 = com.whatsapp.util.b.a(r0, r1);	 Catch:{ fN -> 0x0839 }
        if (r0 != 0) goto L_0x083d;
    L_0x07e7:
        r0 = new java.lang.StringBuilder;	 Catch:{ fN -> 0x0839 }
        r0.<init>();	 Catch:{ fN -> 0x0839 }
        r1 = z;	 Catch:{ fN -> 0x0839 }
        r2 = 15;
        r1 = r1[r2];	 Catch:{ fN -> 0x0839 }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x0839 }
        r1 = r5.getMimetype();	 Catch:{ fN -> 0x0839 }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x0839 }
        r1 = z;	 Catch:{ fN -> 0x0839 }
        r2 = 29;
        r1 = r1[r2];	 Catch:{ fN -> 0x0839 }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x0839 }
        r1 = r14.e;	 Catch:{ fN -> 0x0839 }
        r1 = r1.k;	 Catch:{ fN -> 0x0839 }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x0839 }
        r0 = r0.toString();	 Catch:{ fN -> 0x0839 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ fN -> 0x0839 }
        r0 = r14.b;	 Catch:{ fN -> 0x0839 }
        if (r0 == 0) goto L_0x0820;
    L_0x081b:
        r0 = r14.e;	 Catch:{ fN -> 0x083b }
        com.whatsapp.App.l(r0);	 Catch:{ fN -> 0x083b }
    L_0x0820:
        r0 = r14.g;
        r1 = java.lang.Double.valueOf(r10);
        r0.g = r1;
        r0 = r14.g;
        r1 = com.whatsapp.fieldstats.j.INVALID_IMAGE_MIME_TYPE;
        r1 = r1.getCode();
        r2 = (double) r1;
        r1 = java.lang.Double.valueOf(r2);
        r0.e = r1;
        goto L_0x0035;
    L_0x0839:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x083b }
    L_0x083b:
        r0 = move-exception;
        throw r0;
    L_0x083d:
        r0 = r14.e;	 Catch:{ fN -> 0x08a5 }
        r1 = r5.getMimetype();	 Catch:{ fN -> 0x08a5 }
        r0.n = r1;	 Catch:{ fN -> 0x08a5 }
        r0 = r5.getUrl();	 Catch:{ fN -> 0x08a5 }
        r0 = r14.a(r0);	 Catch:{ fN -> 0x08a5 }
        if (r0 == 0) goto L_0x0035;
    L_0x084f:
        r0 = r14.e;	 Catch:{ fN -> 0x08a7 }
        r1 = r5.getUrl();	 Catch:{ fN -> 0x08a7 }
        r0.q = r1;	 Catch:{ fN -> 0x08a7 }
        r0 = r14.e;	 Catch:{ fN -> 0x08a7 }
        r1 = r5.getSeconds();	 Catch:{ fN -> 0x08a7 }
        r0.H = r1;	 Catch:{ fN -> 0x08a7 }
        r0 = r5.hasMediaKey();	 Catch:{ fN -> 0x08a7 }
        if (r0 != 0) goto L_0x08ab;
    L_0x0865:
        r0 = new java.lang.StringBuilder;	 Catch:{ fN -> 0x08a7 }
        r0.<init>();	 Catch:{ fN -> 0x08a7 }
        r1 = z;	 Catch:{ fN -> 0x08a7 }
        r2 = 10;
        r1 = r1[r2];	 Catch:{ fN -> 0x08a7 }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x08a7 }
        r1 = r14.e;	 Catch:{ fN -> 0x08a7 }
        r1 = r1.k;	 Catch:{ fN -> 0x08a7 }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x08a7 }
        r0 = r0.toString();	 Catch:{ fN -> 0x08a7 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ fN -> 0x08a7 }
        r0 = r14.b;	 Catch:{ fN -> 0x08a7 }
        if (r0 == 0) goto L_0x088c;
    L_0x0887:
        r0 = r14.e;	 Catch:{ fN -> 0x08a9 }
        com.whatsapp.App.l(r0);	 Catch:{ fN -> 0x08a9 }
    L_0x088c:
        r0 = r14.g;
        r1 = java.lang.Double.valueOf(r10);
        r0.g = r1;
        r0 = r14.g;
        r1 = com.whatsapp.fieldstats.j.INVALID_IMAGE_MEDIA_KEY;
        r1 = r1.getCode();
        r2 = (double) r1;
        r1 = java.lang.Double.valueOf(r2);
        r0.e = r1;
        goto L_0x0035;
    L_0x08a5:
        r0 = move-exception;
        throw r0;
    L_0x08a7:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x08a9 }
    L_0x08a9:
        r0 = move-exception;
        throw r0;
    L_0x08ab:
        r0 = r5.getMediaKey();
        r0 = r0.h();
        r1 = r0.length;	 Catch:{ fN -> 0x0905 }
        if (r1 == r12) goto L_0x0909;
    L_0x08b6:
        r1 = new java.lang.StringBuilder;	 Catch:{ fN -> 0x0905 }
        r1.<init>();	 Catch:{ fN -> 0x0905 }
        r2 = z;	 Catch:{ fN -> 0x0905 }
        r3 = 27;
        r2 = r2[r3];	 Catch:{ fN -> 0x0905 }
        r1 = r1.append(r2);	 Catch:{ fN -> 0x0905 }
        r0 = r0.length;	 Catch:{ fN -> 0x0905 }
        r0 = r1.append(r0);	 Catch:{ fN -> 0x0905 }
        r1 = z;	 Catch:{ fN -> 0x0905 }
        r2 = 40;
        r1 = r1[r2];	 Catch:{ fN -> 0x0905 }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x0905 }
        r1 = r14.e;	 Catch:{ fN -> 0x0905 }
        r1 = r1.k;	 Catch:{ fN -> 0x0905 }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x0905 }
        r0 = r0.toString();	 Catch:{ fN -> 0x0905 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ fN -> 0x0905 }
        r0 = r14.b;	 Catch:{ fN -> 0x0905 }
        if (r0 == 0) goto L_0x08ec;
    L_0x08e7:
        r0 = r14.e;	 Catch:{ fN -> 0x0907 }
        com.whatsapp.App.l(r0);	 Catch:{ fN -> 0x0907 }
    L_0x08ec:
        r0 = r14.g;
        r1 = java.lang.Double.valueOf(r10);
        r0.g = r1;
        r0 = r14.g;
        r1 = com.whatsapp.fieldstats.j.INVALID_IMAGE_MEDIA_KEY;
        r1 = r1.getCode();
        r2 = (double) r1;
        r1 = java.lang.Double.valueOf(r2);
        r0.e = r1;
        goto L_0x0035;
    L_0x0905:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0907 }
    L_0x0907:
        r0 = move-exception;
        throw r0;
    L_0x0909:
        r1 = r14.e;
        r1 = r1.c;
        r1 = com.whatsapp.App.a(r1);
        r1 = com.whatsapp.mt.a(r0, r1);
        r5 = new com.whatsapp.MediaData;
        r5.<init>();
        r5.mediaKey = r0;	 Catch:{ fN -> 0x09d9 }
        r0 = r1.c();	 Catch:{ fN -> 0x09d9 }
        r5.refKey = r0;	 Catch:{ fN -> 0x09d9 }
        r0 = r1.a();	 Catch:{ fN -> 0x09d9 }
        r5.cipherKey = r0;	 Catch:{ fN -> 0x09d9 }
        r0 = r1.d();	 Catch:{ fN -> 0x09d9 }
        r5.hmacKey = r0;	 Catch:{ fN -> 0x09d9 }
        r0 = r1.b();	 Catch:{ fN -> 0x09d9 }
        r5.iv = r0;	 Catch:{ fN -> 0x09d9 }
        r0 = r14.e;	 Catch:{ fN -> 0x09d9 }
        r0.Q = r5;	 Catch:{ fN -> 0x09d9 }
        r0 = com.whatsapp.App.aK;	 Catch:{ fN -> 0x09d9 }
        r1 = r14.e;	 Catch:{ fN -> 0x09d9 }
        r5 = -1;
        r6 = r14.c;	 Catch:{ fN -> 0x09d9 }
        r6 = r6.a;	 Catch:{ fN -> 0x09d9 }
        r7 = r14.f;	 Catch:{ fN -> 0x09d9 }
        r7 = r7.d;	 Catch:{ fN -> 0x09d9 }
        r0.a(r1, r5, r6, r7);	 Catch:{ fN -> 0x09d9 }
        if (r3 == 0) goto L_0x0e20;
    L_0x094a:
        r0 = r4.hasVideoMessage();	 Catch:{ fN -> 0x09d9 }
        if (r0 == 0) goto L_0x0bef;
    L_0x0950:
        r0 = r14.g;
        r1 = com.whatsapp.fieldstats.cw.VIDEO;
        r1 = r1.getCode();
        r6 = (double) r1;
        r1 = java.lang.Double.valueOf(r6);
        r0.b = r1;
        r0 = r4.getVideoMessage();
        r1 = r14.e;
        r5 = 3;
        r1.c = r5;
        r1 = r0.getJpegThumbnail();
        r1 = r1.h();
        r5 = r1.length;	 Catch:{ fN -> 0x09db }
        if (r5 <= 0) goto L_0x097d;
    L_0x0973:
        r5 = r14.e;	 Catch:{ fN -> 0x09db }
        r5.a(r1);	 Catch:{ fN -> 0x09db }
        r1 = r14.e;	 Catch:{ fN -> 0x09db }
        r5 = 1;
        r1.u = r5;	 Catch:{ fN -> 0x09db }
    L_0x097d:
        r6 = r0.getFileLength();	 Catch:{ fN -> 0x09dd }
        r8 = 0;
        r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r1 > 0) goto L_0x09e1;
    L_0x0987:
        r1 = new java.lang.StringBuilder;	 Catch:{ fN -> 0x09dd }
        r1.<init>();	 Catch:{ fN -> 0x09dd }
        r2 = z;	 Catch:{ fN -> 0x09dd }
        r3 = 48;
        r2 = r2[r3];	 Catch:{ fN -> 0x09dd }
        r1 = r1.append(r2);	 Catch:{ fN -> 0x09dd }
        r2 = r0.getFileLength();	 Catch:{ fN -> 0x09dd }
        r0 = r1.append(r2);	 Catch:{ fN -> 0x09dd }
        r1 = z;	 Catch:{ fN -> 0x09dd }
        r2 = 44;
        r1 = r1[r2];	 Catch:{ fN -> 0x09dd }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x09dd }
        r1 = r14.e;	 Catch:{ fN -> 0x09dd }
        r1 = r1.k;	 Catch:{ fN -> 0x09dd }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x09dd }
        r0 = r0.toString();	 Catch:{ fN -> 0x09dd }
        com.whatsapp.util.Log.w(r0);	 Catch:{ fN -> 0x09dd }
        r0 = r14.b;	 Catch:{ fN -> 0x09dd }
        if (r0 == 0) goto L_0x09c0;
    L_0x09bb:
        r0 = r14.e;	 Catch:{ fN -> 0x09df }
        com.whatsapp.App.l(r0);	 Catch:{ fN -> 0x09df }
    L_0x09c0:
        r0 = r14.g;
        r1 = java.lang.Double.valueOf(r10);
        r0.g = r1;
        r0 = r14.g;
        r1 = com.whatsapp.fieldstats.j.INVALID_IMAGE_FILE_LENGTH;
        r1 = r1.getCode();
        r2 = (double) r1;
        r1 = java.lang.Double.valueOf(r2);
        r0.e = r1;
        goto L_0x0035;
    L_0x09d9:
        r0 = move-exception;
        throw r0;
    L_0x09db:
        r0 = move-exception;
        throw r0;
    L_0x09dd:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x09df }
    L_0x09df:
        r0 = move-exception;
        throw r0;
    L_0x09e1:
        r1 = r14.e;
        r6 = r0.getFileLength();
        r1.z = r6;
        r1 = r0.getFileSha256();
        r1 = r1.h();
        r5 = r1.length;	 Catch:{ fN -> 0x0a42 }
        if (r5 == r12) goto L_0x0a46;
    L_0x09f4:
        r0 = new java.lang.StringBuilder;	 Catch:{ fN -> 0x0a42 }
        r0.<init>();	 Catch:{ fN -> 0x0a42 }
        r2 = z;	 Catch:{ fN -> 0x0a42 }
        r3 = 46;
        r2 = r2[r3];	 Catch:{ fN -> 0x0a42 }
        r0 = r0.append(r2);	 Catch:{ fN -> 0x0a42 }
        r1 = r1.length;	 Catch:{ fN -> 0x0a42 }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x0a42 }
        r1 = z;	 Catch:{ fN -> 0x0a42 }
        r2 = 7;
        r1 = r1[r2];	 Catch:{ fN -> 0x0a42 }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x0a42 }
        r1 = r14.e;	 Catch:{ fN -> 0x0a42 }
        r1 = r1.k;	 Catch:{ fN -> 0x0a42 }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x0a42 }
        r0 = r0.toString();	 Catch:{ fN -> 0x0a42 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ fN -> 0x0a42 }
        r0 = r14.b;	 Catch:{ fN -> 0x0a42 }
        if (r0 == 0) goto L_0x0a29;
    L_0x0a24:
        r0 = r14.e;	 Catch:{ fN -> 0x0a44 }
        com.whatsapp.App.l(r0);	 Catch:{ fN -> 0x0a44 }
    L_0x0a29:
        r0 = r14.g;
        r1 = java.lang.Double.valueOf(r10);
        r0.g = r1;
        r0 = r14.g;
        r1 = com.whatsapp.fieldstats.j.INVALID_IMAGE_FILE_SHA256;
        r1 = r1.getCode();
        r2 = (double) r1;
        r1 = java.lang.Double.valueOf(r2);
        r0.e = r1;
        goto L_0x0035;
    L_0x0a42:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0a44 }
    L_0x0a44:
        r0 = move-exception;
        throw r0;
    L_0x0a46:
        r5 = r14.e;	 Catch:{ fN -> 0x0aac }
        r6 = 2;
        r1 = android.backport.util.Base64.encodeToString(r1, r6);	 Catch:{ fN -> 0x0aac }
        r5.o = r1;	 Catch:{ fN -> 0x0aac }
        r1 = r0.getMimetype();	 Catch:{ fN -> 0x0aac }
        r5 = 1;
        r1 = com.whatsapp.util.b.b(r1, r5);	 Catch:{ fN -> 0x0aac }
        if (r1 != 0) goto L_0x0ab0;
    L_0x0a5a:
        r1 = new java.lang.StringBuilder;	 Catch:{ fN -> 0x0aac }
        r1.<init>();	 Catch:{ fN -> 0x0aac }
        r2 = z;	 Catch:{ fN -> 0x0aac }
        r3 = 22;
        r2 = r2[r3];	 Catch:{ fN -> 0x0aac }
        r1 = r1.append(r2);	 Catch:{ fN -> 0x0aac }
        r0 = r0.getMimetype();	 Catch:{ fN -> 0x0aac }
        r0 = r1.append(r0);	 Catch:{ fN -> 0x0aac }
        r1 = z;	 Catch:{ fN -> 0x0aac }
        r2 = 53;
        r1 = r1[r2];	 Catch:{ fN -> 0x0aac }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x0aac }
        r1 = r14.e;	 Catch:{ fN -> 0x0aac }
        r1 = r1.k;	 Catch:{ fN -> 0x0aac }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x0aac }
        r0 = r0.toString();	 Catch:{ fN -> 0x0aac }
        com.whatsapp.util.Log.w(r0);	 Catch:{ fN -> 0x0aac }
        r0 = r14.b;	 Catch:{ fN -> 0x0aac }
        if (r0 == 0) goto L_0x0a93;
    L_0x0a8e:
        r0 = r14.e;	 Catch:{ fN -> 0x0aae }
        com.whatsapp.App.l(r0);	 Catch:{ fN -> 0x0aae }
    L_0x0a93:
        r0 = r14.g;
        r1 = java.lang.Double.valueOf(r10);
        r0.g = r1;
        r0 = r14.g;
        r1 = com.whatsapp.fieldstats.j.INVALID_IMAGE_MIME_TYPE;
        r1 = r1.getCode();
        r2 = (double) r1;
        r1 = java.lang.Double.valueOf(r2);
        r0.e = r1;
        goto L_0x0035;
    L_0x0aac:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0aae }
    L_0x0aae:
        r0 = move-exception;
        throw r0;
    L_0x0ab0:
        r1 = r14.e;	 Catch:{ fN -> 0x0b2a }
        r5 = r0.getMimetype();	 Catch:{ fN -> 0x0b2a }
        r1.n = r5;	 Catch:{ fN -> 0x0b2a }
        r1 = r0.getUrl();	 Catch:{ fN -> 0x0b2a }
        r1 = r14.a(r1);	 Catch:{ fN -> 0x0b2a }
        if (r1 == 0) goto L_0x0035;
    L_0x0ac2:
        r1 = r14.e;	 Catch:{ fN -> 0x0b2c }
        r5 = r0.getUrl();	 Catch:{ fN -> 0x0b2c }
        r1.q = r5;	 Catch:{ fN -> 0x0b2c }
        r1 = r0.getCaption();	 Catch:{ fN -> 0x0b2c }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ fN -> 0x0b2c }
        if (r1 != 0) goto L_0x0adc;
    L_0x0ad4:
        r1 = r14.e;	 Catch:{ fN -> 0x0b2c }
        r5 = r0.getCaption();	 Catch:{ fN -> 0x0b2c }
        r1.a = r5;	 Catch:{ fN -> 0x0b2c }
    L_0x0adc:
        r1 = r14.e;	 Catch:{ fN -> 0x0b2e }
        r5 = r0.getSeconds();	 Catch:{ fN -> 0x0b2e }
        r1.H = r5;	 Catch:{ fN -> 0x0b2e }
        r1 = r0.hasMediaKey();	 Catch:{ fN -> 0x0b2e }
        if (r1 != 0) goto L_0x0b32;
    L_0x0aea:
        r0 = new java.lang.StringBuilder;	 Catch:{ fN -> 0x0b2e }
        r0.<init>();	 Catch:{ fN -> 0x0b2e }
        r1 = z;	 Catch:{ fN -> 0x0b2e }
        r2 = 49;
        r1 = r1[r2];	 Catch:{ fN -> 0x0b2e }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x0b2e }
        r1 = r14.e;	 Catch:{ fN -> 0x0b2e }
        r1 = r1.k;	 Catch:{ fN -> 0x0b2e }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x0b2e }
        r0 = r0.toString();	 Catch:{ fN -> 0x0b2e }
        com.whatsapp.util.Log.w(r0);	 Catch:{ fN -> 0x0b2e }
        r0 = r14.b;	 Catch:{ fN -> 0x0b2e }
        if (r0 == 0) goto L_0x0b11;
    L_0x0b0c:
        r0 = r14.e;	 Catch:{ fN -> 0x0b30 }
        com.whatsapp.App.l(r0);	 Catch:{ fN -> 0x0b30 }
    L_0x0b11:
        r0 = r14.g;
        r1 = java.lang.Double.valueOf(r10);
        r0.g = r1;
        r0 = r14.g;
        r1 = com.whatsapp.fieldstats.j.INVALID_IMAGE_MEDIA_KEY;
        r1 = r1.getCode();
        r2 = (double) r1;
        r1 = java.lang.Double.valueOf(r2);
        r0.e = r1;
        goto L_0x0035;
    L_0x0b2a:
        r0 = move-exception;
        throw r0;
    L_0x0b2c:
        r0 = move-exception;
        throw r0;
    L_0x0b2e:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0b30 }
    L_0x0b30:
        r0 = move-exception;
        throw r0;
    L_0x0b32:
        r0 = r0.getMediaKey();
        r0 = r0.h();
        r1 = r0.length;	 Catch:{ fN -> 0x0b8c }
        if (r1 == r12) goto L_0x0b90;
    L_0x0b3d:
        r1 = new java.lang.StringBuilder;	 Catch:{ fN -> 0x0b8c }
        r1.<init>();	 Catch:{ fN -> 0x0b8c }
        r2 = z;	 Catch:{ fN -> 0x0b8c }
        r3 = 16;
        r2 = r2[r3];	 Catch:{ fN -> 0x0b8c }
        r1 = r1.append(r2);	 Catch:{ fN -> 0x0b8c }
        r0 = r0.length;	 Catch:{ fN -> 0x0b8c }
        r0 = r1.append(r0);	 Catch:{ fN -> 0x0b8c }
        r1 = z;	 Catch:{ fN -> 0x0b8c }
        r2 = 12;
        r1 = r1[r2];	 Catch:{ fN -> 0x0b8c }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x0b8c }
        r1 = r14.e;	 Catch:{ fN -> 0x0b8c }
        r1 = r1.k;	 Catch:{ fN -> 0x0b8c }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x0b8c }
        r0 = r0.toString();	 Catch:{ fN -> 0x0b8c }
        com.whatsapp.util.Log.w(r0);	 Catch:{ fN -> 0x0b8c }
        r0 = r14.b;	 Catch:{ fN -> 0x0b8c }
        if (r0 == 0) goto L_0x0b73;
    L_0x0b6e:
        r0 = r14.e;	 Catch:{ fN -> 0x0b8e }
        com.whatsapp.App.l(r0);	 Catch:{ fN -> 0x0b8e }
    L_0x0b73:
        r0 = r14.g;
        r1 = java.lang.Double.valueOf(r10);
        r0.g = r1;
        r0 = r14.g;
        r1 = com.whatsapp.fieldstats.j.INVALID_IMAGE_MEDIA_KEY;
        r1 = r1.getCode();
        r2 = (double) r1;
        r1 = java.lang.Double.valueOf(r2);
        r0.e = r1;
        goto L_0x0035;
    L_0x0b8c:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0b8e }
    L_0x0b8e:
        r0 = move-exception;
        throw r0;
    L_0x0b90:
        r1 = r14.e;
        r1 = r1.c;
        r1 = com.whatsapp.App.a(r1);
        r1 = com.whatsapp.mt.a(r0, r1);
        r5 = new com.whatsapp.MediaData;
        r5.<init>();
        r5.mediaKey = r0;	 Catch:{ fN -> 0x0c7f }
        r0 = r1.c();	 Catch:{ fN -> 0x0c7f }
        r5.refKey = r0;	 Catch:{ fN -> 0x0c7f }
        r0 = r1.a();	 Catch:{ fN -> 0x0c7f }
        r5.cipherKey = r0;	 Catch:{ fN -> 0x0c7f }
        r0 = r1.d();	 Catch:{ fN -> 0x0c7f }
        r5.hmacKey = r0;	 Catch:{ fN -> 0x0c7f }
        r0 = r1.b();	 Catch:{ fN -> 0x0c7f }
        r5.iv = r0;	 Catch:{ fN -> 0x0c7f }
        r0 = r14.e;	 Catch:{ fN -> 0x0c7f }
        r0.Q = r5;	 Catch:{ fN -> 0x0c7f }
        r0 = new java.lang.StringBuilder;	 Catch:{ fN -> 0x0c7f }
        r0.<init>();	 Catch:{ fN -> 0x0c7f }
        r1 = z;	 Catch:{ fN -> 0x0c7f }
        r5 = 54;
        r1 = r1[r5];	 Catch:{ fN -> 0x0c7f }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x0c7f }
        r1 = r14.e;	 Catch:{ fN -> 0x0c7f }
        r1 = r1.k;	 Catch:{ fN -> 0x0c7f }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x0c7f }
        r0 = r0.toString();	 Catch:{ fN -> 0x0c7f }
        com.whatsapp.util.Log.w(r0);	 Catch:{ fN -> 0x0c7f }
        r0 = com.whatsapp.App.aK;	 Catch:{ fN -> 0x0c7f }
        r1 = r14.e;	 Catch:{ fN -> 0x0c7f }
        r5 = -1;
        r6 = r14.c;	 Catch:{ fN -> 0x0c7f }
        r6 = r6.a;	 Catch:{ fN -> 0x0c7f }
        r7 = r14.f;	 Catch:{ fN -> 0x0c7f }
        r7 = r7.d;	 Catch:{ fN -> 0x0c7f }
        r0.a(r1, r5, r6, r7);	 Catch:{ fN -> 0x0c7f }
        if (r3 == 0) goto L_0x0e20;
    L_0x0bef:
        r0 = r4.hasDocumentMessage();	 Catch:{ fN -> 0x0c7f }
        if (r0 == 0) goto L_0x0e20;
    L_0x0bf5:
        r0 = r14.g;
        r1 = com.whatsapp.fieldstats.cw.DOCUMENT;
        r1 = r1.getCode();
        r6 = (double) r1;
        r1 = java.lang.Double.valueOf(r6);
        r0.b = r1;
        r0 = r4.getDocumentMessage();
        r1 = r14.e;
        r5 = 9;
        r1.c = r5;
        r1 = r0.getJpegThumbnail();
        r1 = r1.h();
        r5 = r1.length;	 Catch:{ fN -> 0x0c81 }
        if (r5 <= 0) goto L_0x0c23;
    L_0x0c19:
        r5 = r14.e;	 Catch:{ fN -> 0x0c81 }
        r5.a(r1);	 Catch:{ fN -> 0x0c81 }
        r1 = r14.e;	 Catch:{ fN -> 0x0c81 }
        r5 = 1;
        r1.u = r5;	 Catch:{ fN -> 0x0c81 }
    L_0x0c23:
        r6 = r0.getFileLength();	 Catch:{ fN -> 0x0c83 }
        r8 = 0;
        r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r1 > 0) goto L_0x0c87;
    L_0x0c2d:
        r1 = new java.lang.StringBuilder;	 Catch:{ fN -> 0x0c83 }
        r1.<init>();	 Catch:{ fN -> 0x0c83 }
        r2 = z;	 Catch:{ fN -> 0x0c83 }
        r3 = 21;
        r2 = r2[r3];	 Catch:{ fN -> 0x0c83 }
        r1 = r1.append(r2);	 Catch:{ fN -> 0x0c83 }
        r2 = r0.getFileLength();	 Catch:{ fN -> 0x0c83 }
        r0 = r1.append(r2);	 Catch:{ fN -> 0x0c83 }
        r1 = z;	 Catch:{ fN -> 0x0c83 }
        r2 = 45;
        r1 = r1[r2];	 Catch:{ fN -> 0x0c83 }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x0c83 }
        r1 = r14.e;	 Catch:{ fN -> 0x0c83 }
        r1 = r1.k;	 Catch:{ fN -> 0x0c83 }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x0c83 }
        r0 = r0.toString();	 Catch:{ fN -> 0x0c83 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ fN -> 0x0c83 }
        r0 = r14.b;	 Catch:{ fN -> 0x0c83 }
        if (r0 == 0) goto L_0x0c66;
    L_0x0c61:
        r0 = r14.e;	 Catch:{ fN -> 0x0c85 }
        com.whatsapp.App.l(r0);	 Catch:{ fN -> 0x0c85 }
    L_0x0c66:
        r0 = r14.g;
        r1 = java.lang.Double.valueOf(r10);
        r0.g = r1;
        r0 = r14.g;
        r1 = com.whatsapp.fieldstats.j.INVALID_IMAGE_FILE_LENGTH;
        r1 = r1.getCode();
        r2 = (double) r1;
        r1 = java.lang.Double.valueOf(r2);
        r0.e = r1;
        goto L_0x0035;
    L_0x0c7f:
        r0 = move-exception;
        throw r0;
    L_0x0c81:
        r0 = move-exception;
        throw r0;
    L_0x0c83:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0c85 }
    L_0x0c85:
        r0 = move-exception;
        throw r0;
    L_0x0c87:
        r1 = r14.e;
        r6 = r0.getFileLength();
        r1.z = r6;
        r1 = r0.getFileSha256();
        r1 = r1.h();
        r5 = r1.length;	 Catch:{ fN -> 0x0ce9 }
        if (r5 == r12) goto L_0x0ced;
    L_0x0c9a:
        r0 = new java.lang.StringBuilder;	 Catch:{ fN -> 0x0ce9 }
        r0.<init>();	 Catch:{ fN -> 0x0ce9 }
        r2 = z;	 Catch:{ fN -> 0x0ce9 }
        r3 = 35;
        r2 = r2[r3];	 Catch:{ fN -> 0x0ce9 }
        r0 = r0.append(r2);	 Catch:{ fN -> 0x0ce9 }
        r1 = r1.length;	 Catch:{ fN -> 0x0ce9 }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x0ce9 }
        r1 = z;	 Catch:{ fN -> 0x0ce9 }
        r2 = 37;
        r1 = r1[r2];	 Catch:{ fN -> 0x0ce9 }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x0ce9 }
        r1 = r14.e;	 Catch:{ fN -> 0x0ce9 }
        r1 = r1.k;	 Catch:{ fN -> 0x0ce9 }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x0ce9 }
        r0 = r0.toString();	 Catch:{ fN -> 0x0ce9 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ fN -> 0x0ce9 }
        r0 = r14.b;	 Catch:{ fN -> 0x0ce9 }
        if (r0 == 0) goto L_0x0cd0;
    L_0x0ccb:
        r0 = r14.e;	 Catch:{ fN -> 0x0ceb }
        com.whatsapp.App.l(r0);	 Catch:{ fN -> 0x0ceb }
    L_0x0cd0:
        r0 = r14.g;
        r1 = java.lang.Double.valueOf(r10);
        r0.g = r1;
        r0 = r14.g;
        r1 = com.whatsapp.fieldstats.j.INVALID_IMAGE_FILE_SHA256;
        r1 = r1.getCode();
        r2 = (double) r1;
        r1 = java.lang.Double.valueOf(r2);
        r0.e = r1;
        goto L_0x0035;
    L_0x0ce9:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0ceb }
    L_0x0ceb:
        r0 = move-exception;
        throw r0;
    L_0x0ced:
        r5 = r14.e;	 Catch:{ fN -> 0x0d82 }
        r6 = 2;
        r1 = android.backport.util.Base64.encodeToString(r1, r6);	 Catch:{ fN -> 0x0d82 }
        r5.o = r1;	 Catch:{ fN -> 0x0d82 }
        r1 = r0.getUrl();	 Catch:{ fN -> 0x0d82 }
        r1 = r14.a(r1);	 Catch:{ fN -> 0x0d82 }
        if (r1 == 0) goto L_0x0035;
    L_0x0d00:
        r1 = r14.e;	 Catch:{ fN -> 0x0d84 }
        r5 = r0.getUrl();	 Catch:{ fN -> 0x0d84 }
        r1.q = r5;	 Catch:{ fN -> 0x0d84 }
        r1 = r0.getTitle();	 Catch:{ fN -> 0x0d84 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ fN -> 0x0d84 }
        if (r1 != 0) goto L_0x0d1a;
    L_0x0d12:
        r1 = r14.e;	 Catch:{ fN -> 0x0d84 }
        r5 = r0.getTitle();	 Catch:{ fN -> 0x0d84 }
        r1.a = r5;	 Catch:{ fN -> 0x0d84 }
    L_0x0d1a:
        r1 = r14.e;	 Catch:{ fN -> 0x0d86 }
        r5 = r0.getPageCount();	 Catch:{ fN -> 0x0d86 }
        r1.R = r5;	 Catch:{ fN -> 0x0d86 }
        r1 = r0.getFileName();	 Catch:{ fN -> 0x0d86 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ fN -> 0x0d86 }
        if (r1 != 0) goto L_0x0d34;
    L_0x0d2c:
        r1 = r14.e;	 Catch:{ fN -> 0x0d86 }
        r5 = r0.getFileName();	 Catch:{ fN -> 0x0d86 }
        r1.A = r5;	 Catch:{ fN -> 0x0d86 }
    L_0x0d34:
        r1 = r14.e;	 Catch:{ fN -> 0x0d80 }
        r5 = r0.getMimetype();	 Catch:{ fN -> 0x0d80 }
        r1.n = r5;	 Catch:{ fN -> 0x0d80 }
        r1 = r0.hasMediaKey();	 Catch:{ fN -> 0x0d80 }
        if (r1 != 0) goto L_0x0d88;
    L_0x0d42:
        r0 = new java.lang.StringBuilder;	 Catch:{ fN -> 0x0d80 }
        r0.<init>();	 Catch:{ fN -> 0x0d80 }
        r1 = z;	 Catch:{ fN -> 0x0d80 }
        r2 = 17;
        r1 = r1[r2];	 Catch:{ fN -> 0x0d80 }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x0d80 }
        r1 = r14.e;	 Catch:{ fN -> 0x0d80 }
        r1 = r1.k;	 Catch:{ fN -> 0x0d80 }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x0d80 }
        r0 = r0.toString();	 Catch:{ fN -> 0x0d80 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ fN -> 0x0d80 }
        r0 = r14.e;	 Catch:{ fN -> 0x0d80 }
        com.whatsapp.App.l(r0);	 Catch:{ fN -> 0x0d80 }
        r0 = r14.g;	 Catch:{ fN -> 0x0d80 }
        r2 = 0;
        r1 = java.lang.Double.valueOf(r2);	 Catch:{ fN -> 0x0d80 }
        r0.g = r1;	 Catch:{ fN -> 0x0d80 }
        r0 = r14.g;	 Catch:{ fN -> 0x0d80 }
        r1 = com.whatsapp.fieldstats.j.INVALID_IMAGE_MEDIA_KEY;	 Catch:{ fN -> 0x0d80 }
        r1 = r1.getCode();	 Catch:{ fN -> 0x0d80 }
        r2 = (double) r1;	 Catch:{ fN -> 0x0d80 }
        r1 = java.lang.Double.valueOf(r2);	 Catch:{ fN -> 0x0d80 }
        r0.e = r1;	 Catch:{ fN -> 0x0d80 }
        goto L_0x0035;
    L_0x0d80:
        r0 = move-exception;
        throw r0;
    L_0x0d82:
        r0 = move-exception;
        throw r0;
    L_0x0d84:
        r0 = move-exception;
        throw r0;
    L_0x0d86:
        r0 = move-exception;
        throw r0;
    L_0x0d88:
        r0 = r0.getMediaKey();
        r0 = r0.h();
        r1 = r0.length;	 Catch:{ fN -> 0x0de0 }
        if (r1 == r12) goto L_0x0de2;
    L_0x0d93:
        r1 = new java.lang.StringBuilder;	 Catch:{ fN -> 0x0de0 }
        r1.<init>();	 Catch:{ fN -> 0x0de0 }
        r2 = z;	 Catch:{ fN -> 0x0de0 }
        r3 = 41;
        r2 = r2[r3];	 Catch:{ fN -> 0x0de0 }
        r1 = r1.append(r2);	 Catch:{ fN -> 0x0de0 }
        r0 = r0.length;	 Catch:{ fN -> 0x0de0 }
        r0 = r1.append(r0);	 Catch:{ fN -> 0x0de0 }
        r1 = z;	 Catch:{ fN -> 0x0de0 }
        r2 = 31;
        r1 = r1[r2];	 Catch:{ fN -> 0x0de0 }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x0de0 }
        r1 = r14.e;	 Catch:{ fN -> 0x0de0 }
        r1 = r1.k;	 Catch:{ fN -> 0x0de0 }
        r0 = r0.append(r1);	 Catch:{ fN -> 0x0de0 }
        r0 = r0.toString();	 Catch:{ fN -> 0x0de0 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ fN -> 0x0de0 }
        r0 = r14.e;	 Catch:{ fN -> 0x0de0 }
        com.whatsapp.App.l(r0);	 Catch:{ fN -> 0x0de0 }
        r0 = r14.g;	 Catch:{ fN -> 0x0de0 }
        r2 = 0;
        r1 = java.lang.Double.valueOf(r2);	 Catch:{ fN -> 0x0de0 }
        r0.g = r1;	 Catch:{ fN -> 0x0de0 }
        r0 = r14.g;	 Catch:{ fN -> 0x0de0 }
        r1 = com.whatsapp.fieldstats.j.INVALID_IMAGE_MEDIA_KEY;	 Catch:{ fN -> 0x0de0 }
        r1 = r1.getCode();	 Catch:{ fN -> 0x0de0 }
        r2 = (double) r1;	 Catch:{ fN -> 0x0de0 }
        r1 = java.lang.Double.valueOf(r2);	 Catch:{ fN -> 0x0de0 }
        r0.e = r1;	 Catch:{ fN -> 0x0de0 }
        goto L_0x0035;
    L_0x0de0:
        r0 = move-exception;
        throw r0;
    L_0x0de2:
        r1 = r14.e;
        r1 = r1.c;
        r1 = com.whatsapp.App.a(r1);
        r1 = com.whatsapp.mt.a(r0, r1);
        r5 = new com.whatsapp.MediaData;
        r5.<init>();
        r5.mediaKey = r0;
        r0 = r1.c();
        r5.refKey = r0;
        r0 = r1.a();
        r5.cipherKey = r0;
        r0 = r1.d();
        r5.hmacKey = r0;
        r0 = r1.b();
        r5.iv = r0;
        r0 = r14.e;
        r0.Q = r5;
        r0 = com.whatsapp.App.aK;
        r1 = r14.e;
        r5 = r14.c;
        r5 = r5.a;
        r6 = r14.f;
        r6 = r6.d;
        r0.a(r1, r13, r5, r6);
    L_0x0e20:
        r0 = r4.hasSenderKeyDistributionMessage();
        if (r0 == 0) goto L_0x0035;
    L_0x0e26:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r5 = 34;
        r1 = r1[r5];
        r0 = r0.append(r1);
        r1 = r14.e;
        r1 = r1.k;
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = r4.getSenderKeyDistributionMessage();
        r1 = r0.hasGroupId();	 Catch:{ fN -> 0x0eeb }
        if (r1 == 0) goto L_0x0e54;
    L_0x0e4e:
        r1 = r0.hasAxolotlSenderKeyDistributionMessage();	 Catch:{ fN -> 0x0eeb }
        if (r1 != 0) goto L_0x0e74;
    L_0x0e54:
        r1 = new java.lang.StringBuilder;	 Catch:{ fN -> 0x0eed }
        r1.<init>();	 Catch:{ fN -> 0x0eed }
        r4 = z;	 Catch:{ fN -> 0x0eed }
        r5 = 18;
        r4 = r4[r5];	 Catch:{ fN -> 0x0eed }
        r1 = r1.append(r4);	 Catch:{ fN -> 0x0eed }
        r4 = r14.e;	 Catch:{ fN -> 0x0eed }
        r4 = r4.k;	 Catch:{ fN -> 0x0eed }
        r1 = r1.append(r4);	 Catch:{ fN -> 0x0eed }
        r1 = r1.toString();	 Catch:{ fN -> 0x0eed }
        com.whatsapp.util.Log.w(r1);	 Catch:{ fN -> 0x0eed }
        if (r3 == 0) goto L_0x0edc;
    L_0x0e74:
        r1 = r14.e;	 Catch:{ fN -> 0x0eef }
        r1 = r1.k;	 Catch:{ fN -> 0x0eef }
        r1 = r1.c;	 Catch:{ fN -> 0x0eef }
        r1 = com.whatsapp.qm.i(r1);	 Catch:{ fN -> 0x0eef }
        if (r1 == 0) goto L_0x0eb0;
    L_0x0e80:
        r1 = r14.e;	 Catch:{ fN -> 0x0ef1 }
        r1 = r1.k;	 Catch:{ fN -> 0x0ef1 }
        r1 = r1.c;	 Catch:{ fN -> 0x0ef1 }
        r4 = r0.getGroupId();	 Catch:{ fN -> 0x0ef1 }
        r1 = r1.equals(r4);	 Catch:{ fN -> 0x0ef1 }
        if (r1 != 0) goto L_0x0eb0;
    L_0x0e90:
        r1 = new java.lang.StringBuilder;	 Catch:{ fN -> 0x0ef3 }
        r1.<init>();	 Catch:{ fN -> 0x0ef3 }
        r4 = z;	 Catch:{ fN -> 0x0ef3 }
        r5 = 8;
        r4 = r4[r5];	 Catch:{ fN -> 0x0ef3 }
        r1 = r1.append(r4);	 Catch:{ fN -> 0x0ef3 }
        r4 = r14.e;	 Catch:{ fN -> 0x0ef3 }
        r4 = r4.k;	 Catch:{ fN -> 0x0ef3 }
        r1 = r1.append(r4);	 Catch:{ fN -> 0x0ef3 }
        r1 = r1.toString();	 Catch:{ fN -> 0x0ef3 }
        com.whatsapp.util.Log.w(r1);	 Catch:{ fN -> 0x0ef3 }
        if (r3 == 0) goto L_0x0edc;
    L_0x0eb0:
        r1 = new org.whispersystems.aR;
        r3 = r14.a;
        r3 = r3.b;
        r3 = com.whatsapp.adn.b(r3);
        r3 = r3.c();
        r1.<init>(r3);
        r3 = new org.whispersystems.bI;
        r4 = r0.getGroupId();
        r5 = r14.d;
        r3.<init>(r4, r5);
        r4 = new org.whispersystems.bP;	 Catch:{ bH -> 0x0ef5, bF -> 0x0f15 }
        r0 = r0.getAxolotlSenderKeyDistributionMessage();	 Catch:{ bH -> 0x0ef5, bF -> 0x0f15 }
        r0 = r0.h();	 Catch:{ bH -> 0x0ef5, bF -> 0x0f15 }
        r4.<init>(r0);	 Catch:{ bH -> 0x0ef5, bF -> 0x0f15 }
        r1.a(r3, r4);	 Catch:{ bH -> 0x0ef5, bF -> 0x0f15 }
    L_0x0edc:
        r0 = r14.b;	 Catch:{ fN -> 0x0f35 }
        if (r0 == 0) goto L_0x0035;
    L_0x0ee0:
        if (r2 != 0) goto L_0x0035;
    L_0x0ee2:
        r0 = r14.e;	 Catch:{ fN -> 0x0ee9 }
        com.whatsapp.App.l(r0);	 Catch:{ fN -> 0x0ee9 }
        goto L_0x0035;
    L_0x0ee9:
        r0 = move-exception;
        throw r0;
    L_0x0eeb:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0eed }
    L_0x0eed:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0eef }
    L_0x0eef:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0ef1 }
    L_0x0ef1:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0ef3 }
    L_0x0ef3:
        r0 = move-exception;
        throw r0;
    L_0x0ef5:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = z;
        r4 = 30;
        r3 = r3[r4];
        r1 = r1.append(r3);
        r3 = r14.e;
        r3 = r3.k;
        r1 = r1.append(r3);
        r1 = r1.toString();
        com.whatsapp.util.Log.c(r1, r0);
        goto L_0x0edc;
    L_0x0f15:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = z;
        r4 = 36;
        r3 = r3[r4];
        r1 = r1.append(r3);
        r3 = r14.e;
        r3 = r3.k;
        r1 = r1.append(r3);
        r1 = r1.toString();
        com.whatsapp.util.Log.c(r1, r0);
        goto L_0x0edc;
    L_0x0f35:
        r0 = move-exception;
        throw r0;	 Catch:{ fN -> 0x0ee9 }
    L_0x0f37:
        r2 = r0;
        goto L_0x01ad;
    L_0x0f3a:
        r1 = r2;
        goto L_0x00f9;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.qy.a(byte[]):void");
    }

    private boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.w(z[2] + this.e.k);
            if (this.b) {
                App.l(this.e);
            }
            this.g.g = Double.valueOf(0.0d);
            this.g.e = Double.valueOf((double) com.whatsapp.fieldstats.j.INVALID_IMAGE_MEDIA_URL.getCode());
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!z[6].equalsIgnoreCase(parse.getScheme())) {
            Log.w(z[4] + str + z[1] + this.e.k);
            if (this.b) {
                App.l(this.e);
            }
            this.g.g = Double.valueOf(0.0d);
            this.g.e = Double.valueOf((double) com.whatsapp.fieldstats.j.INVALID_IMAGE_MEDIA_URL.getCode());
            return false;
        } else if (!TextUtils.isEmpty(parse.getHost()) && parse.getHost().endsWith(z[0])) {
            return true;
        } else {
            Log.w(z[5] + str + z[3] + this.e.k);
            if (this.b) {
                App.l(this.e);
            }
            this.g.g = Double.valueOf(0.0d);
            this.g.e = Double.valueOf((double) com.whatsapp.fieldstats.j.INVALID_IMAGE_MEDIA_URL.getCode());
            return false;
        }
    }

    public qy(dt dtVar, co coVar, ana com_whatsapp_ana, l5 l5Var, j jVar, ap apVar, boolean z) {
        this.a = dtVar;
        this.e = coVar;
        this.c = com_whatsapp_ana;
        this.f = l5Var;
        this.d = jVar;
        this.g = apVar;
        this.b = z;
    }
}
