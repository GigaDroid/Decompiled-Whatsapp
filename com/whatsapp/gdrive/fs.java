package com.whatsapp.gdrive;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.fh;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONObject;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

final class fs implements Comparable {
    private static final String[] z;
    @NonNull
    private final String a;
    @NonNull
    private final String b;
    @NonNull
    private final String c;
    @Nullable
    private final String[] d;
    @Nullable
    private final String e;
    private final long f;
    private final long g;
    private final boolean h;
    @Nullable
    private HashMap i;

    static {
        String[] strArr = new String[59];
        String str = "KGI2\fI\u000e]2\u0016I\f\\>\u000e\u0001SI4\nIQO\"UBLOv\u0013BJO2\u001b@JA>\u001e\u0003";
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
                        i3 = 44;
                        break;
                    case at.g /*1*/:
                        i3 = 35;
                        break;
                    case at.i /*2*/:
                        i3 = 59;
                        break;
                    case at.o /*3*/:
                        i3 = 91;
                        break;
                    default:
                        i3 = 122;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "HFH8\bESO2\u0015B";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "JJW>)EY^";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "XJO7\u001f";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "AG\u000e\u0018\u0012I@P(\u000fA";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "_SZ8\u001f_";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "AJV>.US^";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\\BI>\u0014XP";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "EG";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "AL_2\u001cEF_\u001f\u001bXF";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\tP\u0013~\t\u0005";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "EG";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "EG";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\fJH{\u0014CW\u001b\u001c\u0015CDW>>^JM><EO^{\u0015NI^8\u000e\u0002";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "kLT<\u0016IgI2\fIeR7\u001f\f@Z5ZCMW\"ZNF\u001b8\u0015ASZ)\u001fH\u0003O4ZMMT/\u0012IQ\u001b\u001c\u0015CDW>>^JM><EO^aZ";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "ZBW.\u001f";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "GFB";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "^FH\u0012\u001e\u0016\u0003\u001e(ZXJO7\u001f\u0016\u0006H{\u0017H\u0016\u0001~\t\fPR!\u001f\u0016\u0006_{\u000eUS^a__\u0003K:\bIMO(@\tP";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "JLW?\u001f^";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "JJW>";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "yMP5\u0015[M";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "\f\u000b\u001e(V\f\u0006Hr";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\fSI4\nIQO2\u001f_\u0019";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "EG";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "KGI2\fI\u000e]2\u0016I\fX4\u0014_WI.\u0019X\fL>\u0013^G\u00164\u0018FFX/UXJO7\u001f\u0001JHv\u0014YOW{";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "MSK7\u0013OBO2\u0015B\fM5\u001e\u0002DT4\u001d@F\u0016:\n\\P\u0015=\u0015@G^)";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "AG\u000e\u0018\u0012I@P(\u000fA";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "AL_2\u001cEF_\u001f\u001bXF";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "\\QT+\u001f^WR>\t";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "XJO7\u001f";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "HFH8\bESO2\u0015B";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "\\BI>\u0014XP";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "AJV>.US^";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "JJW>)EY^";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    str = "MSK7\u0013OBO2\u0015B\fM5\u001e\u0002DT4\u001d@F\u0016:\n\\P\u0015=\u0015@G^)";
                    obj = 34;
                    i = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    strArr2 = strArr3;
                    str = "AG\u000e\u0018\u0012I@P(\u000fA";
                    obj = 35;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "ZBW.\u001f";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "KGI2\fI\u000e]2\u0016I\fX4\u0014_WI.\u0019X\f])\u0015A\u000eQ(\u0015B\u000eT9\u0010I@O";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "GFB";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "EG";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "KGI2\fI\u000e]2\u0016I\fX4\u0014_WI.\u0019X\f])\u0015A\u000eQ(\u0015B\u000eT9\u0010I@O";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "\\BI>\u0014XP";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "EG";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    str = "XJO7\u001f";
                    obj = 43;
                    i = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    strArr2 = strArr3;
                    str = "AL_2\u001cEF_\u001f\u001bXF";
                    obj = 44;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "JJW>)EY^";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "\\BI>\u0014XP";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "AJV>.US^";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "\\QT+\u001f^WR>\t";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "HFH8\bESO2\u0015B";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "AL_2\u001cEF_\u001f\u001bXF";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "KGI2\fI\u000e]2\u0016I\fX4\u0014_WI.\u0019X\f])\u0015A\u000eQ(\u0015B\u000eT9\u0010I@O";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "\\QT+\u001f^WR>\t";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "ZBW.\u001f";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "\tP\u0013~\t\u0000\u0006Hr";
                    obj = 54;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "GFB";
                    obj = 55;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "\\QT+\u001f^WR>\t";
                    obj = 56;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "KGI2\fI\u000e]2\u0016I\fH>\u000e\u0001SI4\nIQO\"UBLOv\u0013BJO2\u001b@JA>\u001e\u0003JU2\u000eEBW2\u0000EM\\v\u0014CT";
                    obj = 57;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\\BI>\u0014XP\u001b,\u001f^F\u001b5\u0015X\u0003K)\u0015ZJ_>\u001e\fBO{\u000eDF\u001b/\u0013AF\u001b4\u001c\f@I>\u001bXJT5T";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private fs(org.json.JSONObject r10) {
        /*
        r9 = this;
        r6 = -1;
        r2 = 0;
        r0 = 0;
        r4 = com.whatsapp.gdrive.GoogleDriveService.c;
        r9.<init>();
        r1 = z;
        r3 = 43;
        r1 = r1[r3];
        r1 = r10.optString(r1, r0);
        r9.b = r1;
        r1 = z;
        r3 = 44;
        r1 = r1[r3];
        r1 = r10.optString(r1, r0);
        r9.c = r1;
        r1 = z;
        r3 = 50;
        r1 = r1[r3];
        r1 = r10.optString(r1, r0);
        r9.e = r1;
        r1 = z;
        r3 = 36;
        r1 = r1[r3];
        r1 = r10.optString(r1, r0);
        r9.a = r1;
        r1 = z;
        r3 = 46;
        r1 = r1[r3];
        r6 = r10.optLong(r1, r6);
        r9.g = r6;
        r1 = z;
        r3 = 35;
        r1 = r1[r3];
        r3 = z;
        r5 = 48;
        r3 = r3[r5];
        r3 = r10.optString(r3, r0);
        r1 = r1.equals(r3);
        r9.h = r1;
        r1 = z;
        r3 = 51;
        r1 = r1[r3];
        r1 = r10.has(r1);
        if (r1 == 0) goto L_0x0083;
    L_0x0067:
        r1 = new android.text.format.Time;
        r1.<init>();
        r3 = z;	 Catch:{ JSONException -> 0x0103 }
        r5 = 45;
        r3 = r3[r5];	 Catch:{ JSONException -> 0x0103 }
        r5 = 0;
        r3 = r10.optString(r3, r5);	 Catch:{ JSONException -> 0x0103 }
        r1.parse3339(r3);	 Catch:{ JSONException -> 0x0103 }
        r3 = 1;
        r6 = r1.toMillis(r3);	 Catch:{ JSONException -> 0x0103 }
        r9.f = r6;	 Catch:{ JSONException -> 0x0103 }
        if (r4 == 0) goto L_0x0087;
    L_0x0083:
        r6 = -1;
        r9.f = r6;	 Catch:{ JSONException -> 0x0103 }
    L_0x0087:
        r1 = z;
        r3 = 47;
        r1 = r1[r3];
        r1 = r10.has(r1);
        if (r1 == 0) goto L_0x00bb;
    L_0x0093:
        r1 = z;	 Catch:{ JSONException -> 0x0114 }
        r3 = 42;
        r1 = r1[r3];	 Catch:{ JSONException -> 0x0114 }
        r5 = r10.getJSONArray(r1);	 Catch:{ JSONException -> 0x0114 }
        r1 = r5.length();	 Catch:{ JSONException -> 0x0114 }
        r0 = new java.lang.String[r1];	 Catch:{ JSONException -> 0x0114 }
        r3 = r2;
    L_0x00a4:
        r1 = r0.length;	 Catch:{ JSONException -> 0x0114 }
        if (r3 >= r1) goto L_0x00bb;
    L_0x00a7:
        r1 = r5.getJSONObject(r3);	 Catch:{ JSONException -> 0x0105 }
        r6 = z;	 Catch:{ JSONException -> 0x0105 }
        r7 = 40;
        r6 = r6[r7];	 Catch:{ JSONException -> 0x0105 }
        r1 = r1.getString(r6);	 Catch:{ JSONException -> 0x0105 }
        r0[r3] = r1;	 Catch:{ JSONException -> 0x0105 }
    L_0x00b7:
        r1 = r3 + 1;
        if (r4 == 0) goto L_0x0131;
    L_0x00bb:
        r1 = z;
        r3 = 53;
        r1 = r1[r3];
        r1 = r10.has(r1);
        if (r1 == 0) goto L_0x012b;
    L_0x00c7:
        r1 = new java.util.HashMap;
        r1.<init>();
        r9.i = r1;
        r1 = z;	 Catch:{ JSONException -> 0x011f }
        r3 = 49;
        r1 = r1[r3];	 Catch:{ JSONException -> 0x011f }
        r3 = r10.getJSONArray(r1);	 Catch:{ JSONException -> 0x011f }
        r1 = r2;
    L_0x00d9:
        r2 = r3.length();	 Catch:{ JSONException -> 0x011f }
        if (r1 >= r2) goto L_0x0100;
    L_0x00df:
        r2 = r3.getJSONObject(r1);	 Catch:{ JSONException -> 0x011f }
        r5 = r9.i;	 Catch:{ JSONException -> 0x011f }
        r6 = z;	 Catch:{ JSONException -> 0x011f }
        r7 = 39;
        r6 = r6[r7];	 Catch:{ JSONException -> 0x011f }
        r6 = r2.getString(r6);	 Catch:{ JSONException -> 0x011f }
        r7 = z;	 Catch:{ JSONException -> 0x011f }
        r8 = 37;
        r7 = r7[r8];	 Catch:{ JSONException -> 0x011f }
        r2 = r2.getString(r7);	 Catch:{ JSONException -> 0x011f }
        r5.put(r6, r2);	 Catch:{ JSONException -> 0x011f }
        r1 = r1 + 1;
        if (r4 == 0) goto L_0x00d9;
    L_0x0100:
        r9.d = r0;
        return;
    L_0x0103:
        r0 = move-exception;
        throw r0;
    L_0x0105:
        r1 = move-exception;
        r6 = z;	 Catch:{ JSONException -> 0x0112 }
        r7 = 38;
        r6 = r6[r7];	 Catch:{ JSONException -> 0x0112 }
        com.whatsapp.util.Log.b(r6, r1);	 Catch:{ JSONException -> 0x0112 }
        if (r4 == 0) goto L_0x00bb;
    L_0x0111:
        goto L_0x00b7;
    L_0x0112:
        r1 = move-exception;
        throw r1;	 Catch:{ JSONException -> 0x0114 }
    L_0x0114:
        r1 = move-exception;
        r3 = z;
        r5 = 52;
        r3 = r3[r5];
        com.whatsapp.util.Log.b(r3, r1);
        goto L_0x00bb;
    L_0x011f:
        r1 = move-exception;
        r2 = z;	 Catch:{ JSONException -> 0x012f }
        r3 = 41;
        r2 = r2[r3];	 Catch:{ JSONException -> 0x012f }
        com.whatsapp.util.Log.b(r2, r1);	 Catch:{ JSONException -> 0x012f }
        if (r4 == 0) goto L_0x0100;
    L_0x012b:
        r1 = 0;
        r9.i = r1;	 Catch:{ JSONException -> 0x012f }
        goto L_0x0100;
    L_0x012f:
        r0 = move-exception;
        throw r0;
    L_0x0131:
        r3 = r1;
        goto L_0x00a4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.fs.<init>(org.json.JSONObject):void");
    }

    public String toString() {
        boolean z = GoogleDriveService.c;
        try {
            String str;
            if (this.d == null) {
                str = z[21];
            } else {
                str = TextUtils.join(",", this.d);
            }
            try {
                Object obj;
                Locale locale = Locale.ENGLISH;
                String str2 = z[18];
                Object[] objArr = new Object[6];
                objArr[0] = this.b;
                objArr[1] = this.c;
                objArr[2] = this.a;
                objArr[3] = Long.valueOf(this.g);
                if (this.h) {
                    obj = z[19];
                } else {
                    obj = z[20];
                }
                objArr[4] = obj;
                objArr[5] = str;
                str = String.format(locale, str2, objArr);
                if (this.i == null) {
                    return str;
                }
                str = str + z[23];
                String str3 = str;
                for (String str4 : this.i.keySet()) {
                    str4 = str3 + String.format(z[22], new Object[]{str4, this.i.get(str4)});
                    if (z) {
                        return str4;
                    }
                    str3 = str4;
                }
                return str3;
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public static fs a(@NonNull fh fhVar) {
        return new fs(fhVar);
    }

    public boolean a(String str) {
        boolean z = GoogleDriveService.c;
        try {
            if (this.d == null) {
                throw new IllegalStateException(z[1]);
            }
            String[] strArr = this.d;
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                try {
                    if (!strArr[i].equals(str)) {
                        i++;
                        if (z) {
                            break;
                        }
                    }
                    return true;
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
            return false;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public static String[] d() {
        String[] strArr = new String[9];
        strArr[0] = z[9];
        strArr[1] = z[4];
        strArr[2] = z[2];
        strArr[3] = z[5];
        strArr[4] = z[3];
        strArr[5] = z[7];
        strArr[6] = z[10];
        strArr[7] = String.format(z[11], new Object[]{z[8], z[12]});
        strArr[8] = z[6];
        return strArr;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String b(com.google.fh r7) {
        /*
        r6 = this;
        r2 = com.whatsapp.gdrive.GoogleDriveService.c;
        r0 = 0;
    L_0x0003:
        r1 = r7.d();
        if (r1 == 0) goto L_0x001d;
    L_0x0009:
        r3 = r7.i();
        r1 = -1;
        r4 = r3.hashCode();	 Catch:{ IllegalStateException -> 0x002c }
        switch(r4) {
            case 3355: goto L_0x001e;
            default: goto L_0x0015;
        };
    L_0x0015:
        switch(r1) {
            case 0: goto L_0x002e;
            default: goto L_0x0018;
        };
    L_0x0018:
        r7.v();	 Catch:{ IllegalStateException -> 0x0035 }
    L_0x001b:
        if (r2 == 0) goto L_0x0003;
    L_0x001d:
        return r0;
    L_0x001e:
        r4 = z;	 Catch:{ IllegalStateException -> 0x002c }
        r5 = 13;
        r4 = r4[r5];	 Catch:{ IllegalStateException -> 0x002c }
        r3 = r3.equals(r4);	 Catch:{ IllegalStateException -> 0x002c }
        if (r3 == 0) goto L_0x0015;
    L_0x002a:
        r1 = 0;
        goto L_0x0015;
    L_0x002c:
        r0 = move-exception;
        throw r0;
    L_0x002e:
        r0 = r7.f();
        if (r2 == 0) goto L_0x001b;
    L_0x0034:
        goto L_0x0018;
    L_0x0035:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.fs.b(com.google.fh):java.lang.String");
    }

    public static fs a(JSONObject jSONObject) {
        return new fs(jSONObject);
    }

    public int compareTo(@NonNull Object obj) {
        try {
            if (obj instanceof fs) {
                return e().compareTo(((fs) obj).e());
            }
            throw new ClassCastException(z[15] + obj + z[14]);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public void a(@NonNull String str, @NonNull String str2) {
        try {
            if (this.i == null) {
                Log.i(z[58]);
                this.i = new HashMap();
            }
            this.i.put(str, str2);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof fs)) {
            return false;
        }
        fs fsVar = (fs) obj;
        try {
            if (!TextUtils.equals(g(), fsVar.g())) {
                return false;
            }
            if (!TextUtils.equals(e(), fsVar.e())) {
                return false;
            }
            try {
                if (TextUtils.equals(h(), fsVar.h())) {
                    return true;
                }
                return false;
            } catch (IllegalStateException e) {
                throw e;
            }
        } catch (IllegalStateException e2) {
            throw e2;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    public String e() {
        return this.c;
    }

    public String g() {
        return this.b;
    }

    public long b() {
        return this.g;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private fs(@android.support.annotation.NonNull com.google.fh r20) {
        /*
        r19 = this;
        r14 = com.whatsapp.gdrive.GoogleDriveService.c;
        r19.<init>();
        r12 = -1;
        r10 = -1;
        r8 = 0;
        r7 = 0;
        r6 = 0;
        r5 = 0;
        r4 = 0;
        r3 = 0;
        r2 = 0;
        r18 = r2;
        r2 = r3;
        r3 = r18;
    L_0x0015:
        r9 = r20.d();
        if (r9 == 0) goto L_0x01bd;
    L_0x001b:
        r15 = r20.i();
        r9 = -1;
        r16 = r15.hashCode();	 Catch:{ IllegalStateException -> 0x0101 }
        switch(r16) {
            case -1724546052: goto L_0x0097;
            case -1392120434: goto L_0x00c4;
            case -926053069: goto L_0x00f1;
            case -793375479: goto L_0x00e2;
            case -735564899: goto L_0x00b5;
            case -626009577: goto L_0x00d3;
            case -474937375: goto L_0x00a6;
            case 3355: goto L_0x0079;
            case 110371416: goto L_0x0088;
            default: goto L_0x0027;
        };
    L_0x0027:
        switch(r9) {
            case 0: goto L_0x0113;
            case 1: goto L_0x0119;
            case 2: goto L_0x011f;
            case 3: goto L_0x0125;
            case 4: goto L_0x012b;
            case 5: goto L_0x0131;
            case 6: goto L_0x0141;
            case 7: goto L_0x0154;
            case 8: goto L_0x0184;
            default: goto L_0x002a;
        };
    L_0x002a:
        r20.v();	 Catch:{ IllegalStateException -> 0x01b9 }
        r18 = r3;
        r3 = r2;
        r2 = r18;
    L_0x0032:
        if (r14 == 0) goto L_0x01c4;
    L_0x0034:
        r0 = r19;
        r0.b = r7;	 Catch:{ IllegalStateException -> 0x01bb }
        r0 = r19;
        r0.c = r6;	 Catch:{ IllegalStateException -> 0x01bb }
        r0 = r19;
        r0.e = r5;	 Catch:{ IllegalStateException -> 0x01bb }
        r0 = r19;
        r0.a = r4;	 Catch:{ IllegalStateException -> 0x01bb }
        r0 = r19;
        r0.g = r10;	 Catch:{ IllegalStateException -> 0x01bb }
        r0 = r19;
        r0.h = r8;	 Catch:{ IllegalStateException -> 0x01bb }
        r0 = r19;
        r0.f = r12;	 Catch:{ IllegalStateException -> 0x01bb }
        r0 = r19;
        r0.d = r3;	 Catch:{ IllegalStateException -> 0x01bb }
        r0 = r19;
        r0.i = r2;	 Catch:{ IllegalStateException -> 0x01bb }
        if (r6 != 0) goto L_0x0078;
    L_0x005a:
        r2 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x01bb }
        r2.<init>();	 Catch:{ IllegalStateException -> 0x01bb }
        r3 = z;	 Catch:{ IllegalStateException -> 0x01bb }
        r4 = 25;
        r3 = r3[r4];	 Catch:{ IllegalStateException -> 0x01bb }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x01bb }
        r3 = r19.toString();	 Catch:{ IllegalStateException -> 0x01bb }
        r2 = r2.append(r3);	 Catch:{ IllegalStateException -> 0x01bb }
        r2 = r2.toString();	 Catch:{ IllegalStateException -> 0x01bb }
        com.whatsapp.util.Log.e(r2);	 Catch:{ IllegalStateException -> 0x01bb }
    L_0x0078:
        return;
    L_0x0079:
        r16 = z;	 Catch:{ IllegalStateException -> 0x0101 }
        r17 = 24;
        r16 = r16[r17];	 Catch:{ IllegalStateException -> 0x0101 }
        r16 = r15.equals(r16);	 Catch:{ IllegalStateException -> 0x0101 }
        if (r16 == 0) goto L_0x0027;
    L_0x0085:
        r9 = 0;
        if (r14 == 0) goto L_0x0027;
    L_0x0088:
        r16 = z;	 Catch:{ IllegalStateException -> 0x0103 }
        r17 = 30;
        r16 = r16[r17];	 Catch:{ IllegalStateException -> 0x0103 }
        r16 = r15.equals(r16);	 Catch:{ IllegalStateException -> 0x0103 }
        if (r16 == 0) goto L_0x0027;
    L_0x0094:
        r9 = 1;
        if (r14 == 0) goto L_0x0027;
    L_0x0097:
        r16 = z;	 Catch:{ IllegalStateException -> 0x0105 }
        r17 = 31;
        r16 = r16[r17];	 Catch:{ IllegalStateException -> 0x0105 }
        r16 = r15.equals(r16);	 Catch:{ IllegalStateException -> 0x0105 }
        if (r16 == 0) goto L_0x0027;
    L_0x00a3:
        r9 = 2;
        if (r14 == 0) goto L_0x0027;
    L_0x00a6:
        r16 = z;	 Catch:{ IllegalStateException -> 0x0107 }
        r17 = 27;
        r16 = r16[r17];	 Catch:{ IllegalStateException -> 0x0107 }
        r16 = r15.equals(r16);	 Catch:{ IllegalStateException -> 0x0107 }
        if (r16 == 0) goto L_0x0027;
    L_0x00b2:
        r9 = 3;
        if (r14 == 0) goto L_0x0027;
    L_0x00b5:
        r16 = z;	 Catch:{ IllegalStateException -> 0x0109 }
        r17 = 34;
        r16 = r16[r17];	 Catch:{ IllegalStateException -> 0x0109 }
        r16 = r15.equals(r16);	 Catch:{ IllegalStateException -> 0x0109 }
        if (r16 == 0) goto L_0x0027;
    L_0x00c1:
        r9 = 4;
        if (r14 == 0) goto L_0x0027;
    L_0x00c4:
        r16 = z;	 Catch:{ IllegalStateException -> 0x010b }
        r17 = 33;
        r16 = r16[r17];	 Catch:{ IllegalStateException -> 0x010b }
        r16 = r15.equals(r16);	 Catch:{ IllegalStateException -> 0x010b }
        if (r16 == 0) goto L_0x0027;
    L_0x00d0:
        r9 = 5;
        if (r14 == 0) goto L_0x0027;
    L_0x00d3:
        r16 = z;	 Catch:{ IllegalStateException -> 0x010d }
        r17 = 28;
        r16 = r16[r17];	 Catch:{ IllegalStateException -> 0x010d }
        r16 = r15.equals(r16);	 Catch:{ IllegalStateException -> 0x010d }
        if (r16 == 0) goto L_0x0027;
    L_0x00df:
        r9 = 6;
        if (r14 == 0) goto L_0x0027;
    L_0x00e2:
        r16 = z;	 Catch:{ IllegalStateException -> 0x010f }
        r17 = 32;
        r16 = r16[r17];	 Catch:{ IllegalStateException -> 0x010f }
        r16 = r15.equals(r16);	 Catch:{ IllegalStateException -> 0x010f }
        if (r16 == 0) goto L_0x0027;
    L_0x00ee:
        r9 = 7;
        if (r14 == 0) goto L_0x0027;
    L_0x00f1:
        r16 = z;	 Catch:{ IllegalStateException -> 0x0111 }
        r17 = 29;
        r16 = r16[r17];	 Catch:{ IllegalStateException -> 0x0111 }
        r15 = r15.equals(r16);	 Catch:{ IllegalStateException -> 0x0111 }
        if (r15 == 0) goto L_0x0027;
    L_0x00fd:
        r9 = 8;
        goto L_0x0027;
    L_0x0101:
        r2 = move-exception;
        throw r2;
    L_0x0103:
        r2 = move-exception;
        throw r2;
    L_0x0105:
        r2 = move-exception;
        throw r2;
    L_0x0107:
        r2 = move-exception;
        throw r2;
    L_0x0109:
        r2 = move-exception;
        throw r2;
    L_0x010b:
        r2 = move-exception;
        throw r2;
    L_0x010d:
        r2 = move-exception;
        throw r2;
    L_0x010f:
        r2 = move-exception;
        throw r2;
    L_0x0111:
        r2 = move-exception;
        throw r2;
    L_0x0113:
        r7 = r20.f();
        if (r14 == 0) goto L_0x01ae;
    L_0x0119:
        r6 = r20.f();
        if (r14 == 0) goto L_0x01ae;
    L_0x011f:
        r5 = r20.f();
        if (r14 == 0) goto L_0x01ae;
    L_0x0125:
        r4 = r20.f();
        if (r14 == 0) goto L_0x01ae;
    L_0x012b:
        r10 = r20.r();
        if (r14 == 0) goto L_0x01ae;
    L_0x0131:
        r8 = z;
        r9 = 26;
        r8 = r8[r9];
        r9 = r20.f();
        r8 = r8.equals(r9);
        if (r14 == 0) goto L_0x01ae;
    L_0x0141:
        r9 = new android.text.format.Time;
        r9.<init>();
        r12 = r20.f();
        r9.parse3339(r12);
        r12 = 1;
        r12 = r9.toMillis(r12);
        if (r14 == 0) goto L_0x01ae;
    L_0x0154:
        r20.c();
        r2 = new java.util.ArrayList;
        r2.<init>();
    L_0x015c:
        r9 = r20.d();
        if (r9 == 0) goto L_0x0173;
    L_0x0162:
        r20.l();
        r9 = r19.b(r20);
        r20.k();	 Catch:{ IllegalStateException -> 0x01b5 }
        if (r9 == 0) goto L_0x0171;
    L_0x016e:
        r2.add(r9);	 Catch:{ IllegalStateException -> 0x01b5 }
    L_0x0171:
        if (r14 == 0) goto L_0x015c;
    L_0x0173:
        r20.g();
        r9 = r2.size();
        r9 = new java.lang.String[r9];
        r2 = r2.toArray(r9);
        r2 = (java.lang.String[]) r2;
        if (r14 == 0) goto L_0x01ae;
    L_0x0184:
        r20.c();
        r3 = new java.util.HashMap;
        r3.<init>();
    L_0x018c:
        r9 = r20.d();
        if (r9 == 0) goto L_0x01a9;
    L_0x0192:
        r20.l();
        r9 = r19.c(r20);
        r15 = r9.first;	 Catch:{ IllegalStateException -> 0x01b7 }
        if (r15 == 0) goto L_0x01a4;
    L_0x019d:
        r15 = r9.first;	 Catch:{ IllegalStateException -> 0x01b7 }
        r9 = r9.second;	 Catch:{ IllegalStateException -> 0x01b7 }
        r3.put(r15, r9);	 Catch:{ IllegalStateException -> 0x01b7 }
    L_0x01a4:
        r20.k();
        if (r14 == 0) goto L_0x018c;
    L_0x01a9:
        r20.g();	 Catch:{ IllegalStateException -> 0x01b9 }
        if (r14 != 0) goto L_0x002a;
    L_0x01ae:
        r18 = r3;
        r3 = r2;
        r2 = r18;
        goto L_0x0032;
    L_0x01b5:
        r2 = move-exception;
        throw r2;
    L_0x01b7:
        r2 = move-exception;
        throw r2;
    L_0x01b9:
        r2 = move-exception;
        throw r2;
    L_0x01bb:
        r2 = move-exception;
        throw r2;
    L_0x01bd:
        r18 = r3;
        r3 = r2;
        r2 = r18;
        goto L_0x0034;
    L_0x01c4:
        r18 = r2;
        r2 = r3;
        r3 = r18;
        goto L_0x0015;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.fs.<init>(com.google.fh):void");
    }

    public boolean f() {
        return this.h;
    }

    private fs(@NonNull String str, @NonNull String str2, @Nullable String str3, @NonNull String str4, long j, boolean z, long j2, @Nullable String[] strArr, @Nullable HashMap hashMap) {
        this.b = str;
        this.c = str2;
        this.e = str3;
        this.a = str4;
        this.g = j;
        this.h = z;
        this.f = j2;
        this.d = strArr;
        this.i = hashMap;
    }

    public String b(@NonNull String str) {
        try {
            if (this.i != null) {
                return (String) this.i.get(str);
            }
            Log.e(z[0] + str);
            return null;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public long c() {
        return this.f;
    }

    public String h() {
        return this.a;
    }

    public static fs a(@NonNull String str, @NonNull String str2, @Nullable String str3, @NonNull String str4, long j, boolean z, long j2, @Nullable String[] strArr, @Nullable HashMap hashMap) {
        return new fs(str, str2, str3, str4, j, z, j2, strArr, hashMap);
    }

    public int hashCode() {
        return (g().hashCode() ^ e().hashCode()) ^ h().hashCode();
    }

    public String i() {
        return this.e;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.util.Pair c(com.google.fh r8) {
        /*
        r7 = this;
        r0 = 0;
        r3 = com.whatsapp.gdrive.GoogleDriveService.c;
        r1 = r0;
    L_0x0004:
        r2 = r8.d();
        if (r2 == 0) goto L_0x001b;
    L_0x000a:
        r4 = r8.i();
        r2 = -1;
        r5 = r4.hashCode();	 Catch:{ IllegalStateException -> 0x003e }
        switch(r5) {
            case 106079: goto L_0x0021;
            case 111972721: goto L_0x0030;
            default: goto L_0x0016;
        };
    L_0x0016:
        switch(r2) {
            case 0: goto L_0x0042;
            case 1: goto L_0x0048;
            default: goto L_0x0019;
        };
    L_0x0019:
        if (r3 == 0) goto L_0x0004;
    L_0x001b:
        r2 = new android.util.Pair;
        r2.<init>(r1, r0);
        return r2;
    L_0x0021:
        r5 = z;	 Catch:{ IllegalStateException -> 0x003e }
        r6 = 17;
        r5 = r5[r6];	 Catch:{ IllegalStateException -> 0x003e }
        r5 = r4.equals(r5);	 Catch:{ IllegalStateException -> 0x003e }
        if (r5 == 0) goto L_0x0016;
    L_0x002d:
        r2 = 0;
        if (r3 == 0) goto L_0x0016;
    L_0x0030:
        r5 = z;	 Catch:{ IllegalStateException -> 0x0040 }
        r6 = 16;
        r5 = r5[r6];	 Catch:{ IllegalStateException -> 0x0040 }
        r4 = r4.equals(r5);	 Catch:{ IllegalStateException -> 0x0040 }
        if (r4 == 0) goto L_0x0016;
    L_0x003c:
        r2 = 1;
        goto L_0x0016;
    L_0x003e:
        r0 = move-exception;
        throw r0;
    L_0x0040:
        r0 = move-exception;
        throw r0;
    L_0x0042:
        r1 = r8.f();
        if (r3 == 0) goto L_0x0019;
    L_0x0048:
        r0 = r8.f();
        goto L_0x0019;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gdrive.fs.c(com.google.fh):android.util.Pair");
    }

    public static String a() {
        return String.format(z[55], new Object[]{z[57], z[56], z[54]});
    }
}
