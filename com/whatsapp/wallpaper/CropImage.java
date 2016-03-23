package com.whatsapp.wallpaper;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import com.whatsapp.App;
import com.whatsapp.WAActivity;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class CropImage extends WAActivity {
    public static int c;
    private static final String[] z;
    boolean a;
    private Matrix b;
    private int d;
    private Matrix e;
    private boolean f;
    private CropImageView g;
    private int h;
    private int i;
    private int j;
    private Uri k;
    public boolean l;
    private Rect m;
    private int n;
    private boolean o;
    private int p;
    protected l q;
    private boolean r;
    private int s;
    protected boolean t;
    private Bitmap u;
    private boolean v;
    private CompressFormat w;
    private int x;
    private int y;

    static {
        String[] strArr = new String[62];
        String str = "1Z(/\u000b-\u00128;\r\"";
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
                        i3 = 67;
                        break;
                    case at.g /*1*/:
                        i3 = 63;
                        break;
                    case at.i /*2*/:
                        i3 = 92;
                        break;
                    case at.o /*3*/:
                        i3 = 90;
                        break;
                    default:
                        i3 = 121;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = " M3*\u0010.^;?V,P1`Y";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "'^(;";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = " M3*\u0010.^;?V ^24\u00167\u001f?6\u00160Z|>\f1V2=Y1Z/;\u00143S9`Y";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = " M3*\u0010.^;?V,P1`Y";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = " M3*\u0010.^;?V ^24\u00167\u001f?6\u00160Z|>\f1V2=Y1Z/;\u00143S9`Y";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = " M3*\u0010.^;?V ^24\u00167\u001f?6\u00160Z|>\f1V2=Y1Z/;\u00143S9`Y";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = " M3*\u0010.^;?V ^24\u00167`.?\n\"R,6\u001cy\u001f";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "*Q03\u0017&\u00128;\r\"";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "'^(;";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = " M3*\u0010.^;?V ^24\u00167\u001f?6\u00160Z|>\f1V2=Y1Z/;\u00143S9`Y";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = " M3*\u0010.^;?V ^24\u00167`.?\n\"R,6\u001cy\u001f";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = " M3*\u0010.^;?V ^24\u00167\u001f?6\u00160Z|>\f1V2=Y1Z/;\u00143S9`Y";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = " M3*\u0010.^;?V ^24\u00167\u001f?6\u00160Z|>\f1V2=Y1Z/;\u00143S9`Y";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = " M3*\u0010.^;?V ^24\u00167\u001f?6\u00160Z|>\f1V2=Y1Z/;\u00143S9`Y";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "*Pq?\u000b1P.";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = " M3*\u0010.^;?V-P/*\u0018 Z";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\rP|)\t\"\\9";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\fM5?\u00177^(3\u0016-";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "1Z?.";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = " M3*\u0010.^;?V&G5<V ^24\u00167\u001f/;\u000f&\u0005|";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = " M3*\u0010.^;?V ^24\u00167\u001f/;\u000f&\u0005|";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "-Pq)\t\"\\9";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "-Pq)\t\"\\9";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "1Z?.";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = ",J(*\f7g";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "0\\=6\u001c\u0016O\u0015<7&Z8?\u001d";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "1P(;\r*P2";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = ",J(*\f7y3(\u0014\"K";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "&M.5\u000bnP37";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = " M3*;:p).\t6K\u000f3\u0003&";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "*Pq?\u000b1P.";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = " M3*\u0010.^;?";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "*Pq?\u000b1P.";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = " M3*V,Q?(\u001c\"K9";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "-P(w\u0018nV1;\u001e&";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "*Q5.\u0010\"S\u000e?\u001a7";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = " M3*\u0010.^;?V.^7?\u001d&Y=/\u00157\u001035\u0014";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "\"L,?\u001a7f";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = ",J(*\f7";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "\"L,?\u001a7g";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "-Pq)\t\"\\9";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = ".V2\u0019\u000b,O";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "\rP|)\t\"\\9";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "%S5*1";
                    obj = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "-P(w\u0018nV1;\u001e&";
                    obj = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = " V.9\u0015&|.5\t";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "%S5*/";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "%S=.\r&Q\u000e5\r\"K55\u0017";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = " M3*\u0010.^;?V-P(w\u0018nV1;\u001e&";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "'^(;";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "0\\=6\u001c";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = " M3*\u0010.^;?V,P1";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "&M.5\u000bnP37";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = ".^$\u0019\u000b,O";
                    obj = 54;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = " M3*\u0010.^;?V-P(w\u0018nV1;\u001e&";
                    obj = 55;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = " M3*V,Q?(\u001c\"K9u\u001c-[";
                    obj = 56;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = ",J(*\f7f";
                    obj = 57;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = ".^$\u001c\u0010/Z\u000f3\u0003&";
                    obj = 58;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = " M3*\u0010.^;?V!V(7\u00183l((\u001c\"R|3\ncQ)6\u0015";
                    obj = 59;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = " M3*V,Q8?\n7M3#";
                    obj = 60;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = " M3*\u0010.^;?V ^24\u00167\u001f?6\u00160Z|>\f1V2=Y1Z/;\u00143S9`Y";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public CropImage() {
        this.w = CompressFormat.JPEG;
        this.k = null;
        this.f = false;
        this.r = true;
        this.n = 1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
        r12 = this;
        r7 = c;
        r0 = r12.q;	 Catch:{ IOException -> 0x0007 }
        if (r0 != 0) goto L_0x0009;
    L_0x0006:
        return;
    L_0x0007:
        r0 = move-exception;
        throw r0;
    L_0x0009:
        r0 = r12.l;	 Catch:{ IOException -> 0x01da }
        if (r0 != 0) goto L_0x0006;
    L_0x000d:
        r0 = 1;
        r12.l = r0;
        r0 = 0;
        r8 = new android.graphics.Paint;
        r8.<init>();
        r1 = 1;
        r8.setAntiAlias(r1);
        r1 = 1;
        r8.setFilterBitmap(r1);
        r1 = 1;
        r8.setDither(r1);
        r1 = r12.q;
        r9 = r1.c();
        r1 = r12.j;	 Catch:{ IOException -> 0x01dc }
        if (r1 == 0) goto L_0x0289;
    L_0x002c:
        r1 = r12.y;	 Catch:{ IOException -> 0x01dc }
        if (r1 == 0) goto L_0x0289;
    L_0x0030:
        r0 = r12.n;	 Catch:{ IOException -> 0x01de }
        r1 = 1;
        if (r0 <= r1) goto L_0x0051;
    L_0x0035:
        r0 = r9.left;	 Catch:{ IOException -> 0x01e0 }
        r1 = r12.n;	 Catch:{ IOException -> 0x01e0 }
        r0 = r0 * r1;
        r9.left = r0;	 Catch:{ IOException -> 0x01e0 }
        r0 = r9.right;	 Catch:{ IOException -> 0x01e0 }
        r1 = r12.n;	 Catch:{ IOException -> 0x01e0 }
        r0 = r0 * r1;
        r9.right = r0;	 Catch:{ IOException -> 0x01e0 }
        r0 = r9.top;	 Catch:{ IOException -> 0x01e0 }
        r1 = r12.n;	 Catch:{ IOException -> 0x01e0 }
        r0 = r0 * r1;
        r9.top = r0;	 Catch:{ IOException -> 0x01e0 }
        r0 = r9.bottom;	 Catch:{ IOException -> 0x01e0 }
        r1 = r12.n;	 Catch:{ IOException -> 0x01e0 }
        r0 = r0 * r1;
        r9.bottom = r0;	 Catch:{ IOException -> 0x01e0 }
    L_0x0051:
        r1 = r12.j;
        r0 = r12.y;
        r2 = r12.r;	 Catch:{ IOException -> 0x01e2 }
        if (r2 != 0) goto L_0x0069;
    L_0x0059:
        r2 = r9.width();	 Catch:{ IOException -> 0x01e2 }
        r3 = r12.j;	 Catch:{ IOException -> 0x01e2 }
        if (r2 >= r3) goto L_0x0069;
    L_0x0061:
        r1 = r9.width();
        r0 = r9.height();
    L_0x0069:
        r2 = r12.t;
        if (r2 != 0) goto L_0x00e9;
    L_0x006d:
        r2 = 1;
    L_0x006e:
        r3 = r9.width();
        r3 = r3 / 2;
        r4 = r12.j;
        if (r3 > r4) goto L_0x0082;
    L_0x0078:
        r3 = r9.height();
        r3 = r3 / 2;
        r4 = r12.y;
        if (r3 <= r4) goto L_0x009e;
    L_0x0082:
        r2 = r2 * 2;
        r3 = r9.left;
        r3 = r3 / 2;
        r9.left = r3;
        r3 = r9.right;
        r3 = r3 / 2;
        r9.right = r3;
        r3 = r9.top;
        r3 = r3 / 2;
        r9.top = r3;
        r3 = r9.bottom;
        r3 = r3 / 2;
        r9.bottom = r3;
        if (r7 == 0) goto L_0x006e;
    L_0x009e:
        r3 = r2;
        r2 = r12.n;	 Catch:{ IOException -> 0x01e4 }
        r4 = 1;
        if (r2 > r4) goto L_0x00a7;
    L_0x00a4:
        r2 = 1;
        if (r3 <= r2) goto L_0x00e9;
    L_0x00a7:
        r2 = r12.u;
        r2.recycle();
        r2 = r3;
    L_0x00ad:
        r4 = r12.n;
        r4 = java.lang.Math.max(r4, r3);
        if (r2 > r4) goto L_0x00e9;
    L_0x00b5:
        r4 = new android.graphics.BitmapFactory$Options;
        r4.<init>();
        r4.inSampleSize = r2;	 Catch:{ IOException -> 0x01e6 }
        r5 = 1;
        r4.inDither = r5;	 Catch:{ IOException -> 0x01e6 }
        r5 = 0;
        r4.inJustDecodeBounds = r5;	 Catch:{ IOException -> 0x01e6 }
        r5 = 0;
        r4.inScaled = r5;	 Catch:{ IOException -> 0x01e6 }
        r5 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IOException -> 0x01e6 }
        r6 = 10;
        if (r5 < r6) goto L_0x00ce;
    L_0x00cb:
        r5 = 1;
        r4.inPreferQualityOverSpeed = r5;	 Catch:{ IOException -> 0x01e6 }
    L_0x00ce:
        r5 = 0;
        r6 = com.whatsapp.App.at;	 Catch:{ OutOfMemoryError -> 0x01f3, FileNotFoundException -> 0x025c }
        r10 = r12.getIntent();	 Catch:{ OutOfMemoryError -> 0x01f3, FileNotFoundException -> 0x025c }
        r10 = r10.getData();	 Catch:{ OutOfMemoryError -> 0x01f3, FileNotFoundException -> 0x025c }
        r5 = r6.openInputStream(r10);	 Catch:{ OutOfMemoryError -> 0x01f3, FileNotFoundException -> 0x025c }
        r6 = 0;
        r4 = android.graphics.BitmapFactory.decodeStream(r5, r6, r4);	 Catch:{ OutOfMemoryError -> 0x01f3, FileNotFoundException -> 0x025c }
        r12.u = r4;	 Catch:{ OutOfMemoryError -> 0x01f3, FileNotFoundException -> 0x025c }
        if (r5 == 0) goto L_0x00e9;
    L_0x00e6:
        r5.close();	 Catch:{ IOException -> 0x01e8 }
    L_0x00e9:
        r2 = r12.u;
        r2 = r2.getConfig();
        if (r2 != 0) goto L_0x00f3;
    L_0x00f1:
        r2 = android.graphics.Bitmap.Config.ARGB_8888;	 Catch:{ IOException -> 0x0285 }
    L_0x00f3:
        r2 = android.graphics.Bitmap.createBitmap(r1, r0, r2);
        r3 = new android.graphics.Canvas;
        r3.<init>(r2);
        r4 = new android.graphics.RectF;
        r5 = 0;
        r6 = 0;
        r1 = (float) r1;
        r0 = (float) r0;
        r4.<init>(r5, r6, r1, r0);
        r0 = r12.o;
        if (r0 != 0) goto L_0x0141;
    L_0x0109:
        r0 = r9.width();
        r0 = (float) r0;
        r1 = r4.width();
        r0 = r0 - r1;
        r0 = (int) r0;
        r0 = r0 / 2;
        r1 = r9.height();
        r1 = (float) r1;
        r5 = r4.height();
        r1 = r1 - r5;
        r1 = (int) r1;
        r1 = r1 / 2;
        r5 = 0;
        r5 = java.lang.Math.max(r5, r0);
        r6 = 0;
        r6 = java.lang.Math.max(r6, r1);
        r9.inset(r5, r6);
        r5 = 0;
        r0 = -r0;
        r0 = java.lang.Math.max(r5, r0);
        r0 = (float) r0;
        r5 = 0;
        r1 = -r1;
        r1 = java.lang.Math.max(r5, r1);
        r1 = (float) r1;
        r4.inset(r0, r1);
    L_0x0141:
        r0 = r12.b;	 Catch:{ IOException -> 0x0287 }
        if (r0 == 0) goto L_0x0181;
    L_0x0145:
        r0 = r12.v;	 Catch:{ IOException -> 0x0287 }
        if (r0 == 0) goto L_0x0181;
    L_0x0149:
        r0 = new android.graphics.Matrix;
        r0.<init>();
        r1 = r4.left;
        r5 = r4.right;
        r1 = r1 + r5;
        r1 = -r1;
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r1 = r1 / r5;
        r5 = r4.top;
        r6 = r4.bottom;
        r5 = r5 + r6;
        r5 = -r5;
        r6 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r5 = r5 / r6;
        r0.preTranslate(r1, r5);
        r1 = r12.b;
        r0.postConcat(r1);
        r1 = r4.left;
        r5 = r4.right;
        r1 = r1 + r5;
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r1 = r1 / r5;
        r5 = r4.top;
        r6 = r4.bottom;
        r5 = r5 + r6;
        r6 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r5 = r5 / r6;
        r0.postTranslate(r1, r5);
        r0.mapRect(r4);
        r3.setMatrix(r0);
    L_0x0181:
        r0 = r12.u;
        r3.drawBitmap(r0, r9, r4, r8);
    L_0x0186:
        r0 = r12.g;
        r0.d();
        r0 = r12.u;
        r0.recycle();
        r0 = r12.getIntent();
        r0 = r0.getExtras();
        if (r0 == 0) goto L_0x04c1;
    L_0x019a:
        r1 = z;	 Catch:{ IOException -> 0x04bf }
        r3 = 10;
        r1 = r1[r3];	 Catch:{ IOException -> 0x04bf }
        r1 = r0.getParcelable(r1);	 Catch:{ IOException -> 0x04bf }
        if (r1 != 0) goto L_0x01b1;
    L_0x01a6:
        r1 = z;	 Catch:{ IOException -> 0x04bf }
        r3 = 0;
        r1 = r1[r3];	 Catch:{ IOException -> 0x04bf }
        r0 = r0.getBoolean(r1);	 Catch:{ IOException -> 0x04bf }
        if (r0 == 0) goto L_0x04c1;
    L_0x01b1:
        r0 = new android.os.Bundle;
        r0.<init>();
        r1 = z;
        r3 = 3;
        r1 = r1[r3];
        r0.putParcelable(r1, r2);
        r1 = -1;
        r2 = new android.content.Intent;
        r2.<init>();
        r3 = z;
        r4 = 9;
        r3 = r3[r4];
        r2 = r2.setAction(r3);
        r0 = r2.putExtras(r0);
        r12.setResult(r1, r0);
        r12.finish();
        goto L_0x0006;
    L_0x01da:
        r0 = move-exception;
        throw r0;
    L_0x01dc:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01de }
    L_0x01de:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01e0 }
    L_0x01e0:
        r0 = move-exception;
        throw r0;
    L_0x01e2:
        r0 = move-exception;
        throw r0;
    L_0x01e4:
        r0 = move-exception;
        throw r0;
    L_0x01e6:
        r0 = move-exception;
        throw r0;
    L_0x01e8:
        r2 = move-exception;
        r3 = z;
        r4 = 4;
        r3 = r3[r4];
        com.whatsapp.util.Log.b(r3, r2);
        goto L_0x00e9;
    L_0x01f3:
        r4 = move-exception;
        r6 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0244 }
        r6.<init>();	 Catch:{ IOException -> 0x0244 }
        r10 = z;	 Catch:{ IOException -> 0x0244 }
        r11 = 2;
        r10 = r10[r11];	 Catch:{ IOException -> 0x0244 }
        r6 = r6.append(r10);	 Catch:{ IOException -> 0x0244 }
        r6 = r6.append(r2);	 Catch:{ IOException -> 0x0244 }
        r6 = r6.toString();	 Catch:{ IOException -> 0x0244 }
        com.whatsapp.util.Log.b(r6, r4);	 Catch:{ IOException -> 0x0244 }
        r4 = r12.u;	 Catch:{ IOException -> 0x0244 }
        if (r4 == 0) goto L_0x0221;
    L_0x0211:
        r4 = r12.u;	 Catch:{ IOException -> 0x0244 }
        r4 = r4.isRecycled();	 Catch:{ IOException -> 0x0244 }
        if (r4 != 0) goto L_0x0221;
    L_0x0219:
        r4 = r12.u;	 Catch:{ IOException -> 0x0246 }
        r4.recycle();	 Catch:{ IOException -> 0x0246 }
        r4 = 0;
        r12.u = r4;	 Catch:{ IOException -> 0x0246 }
    L_0x0221:
        if (r5 == 0) goto L_0x0226;
    L_0x0223:
        r5.close();	 Catch:{ IOException -> 0x0251, OutOfMemoryError -> 0x024f }
    L_0x0226:
        r4 = r9.left;
        r4 = r4 / 2;
        r9.left = r4;
        r4 = r9.right;
        r4 = r4 / 2;
        r9.right = r4;
        r4 = r9.top;
        r4 = r4 / 2;
        r9.top = r4;
        r4 = r9.bottom;
        r4 = r4 / 2;
        r9.bottom = r4;
        r2 = r2 * 2;
        if (r7 == 0) goto L_0x00ad;
    L_0x0242:
        goto L_0x00e9;
    L_0x0244:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0246 }
    L_0x0246:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0248 }
    L_0x0248:
        r0 = move-exception;
        if (r5 == 0) goto L_0x024e;
    L_0x024b:
        r5.close();	 Catch:{ IOException -> 0x027b, OutOfMemoryError -> 0x0279 }
    L_0x024e:
        throw r0;
    L_0x024f:
        r0 = move-exception;
        throw r0;
    L_0x0251:
        r4 = move-exception;
        r5 = z;
        r6 = 15;
        r5 = r5[r6];
        com.whatsapp.util.Log.b(r5, r4);
        goto L_0x0226;
    L_0x025c:
        r2 = move-exception;
        r3 = z;	 Catch:{ all -> 0x0248 }
        r4 = 12;
        r3 = r3[r4];	 Catch:{ all -> 0x0248 }
        com.whatsapp.util.Log.b(r3, r2);	 Catch:{ all -> 0x0248 }
        if (r5 == 0) goto L_0x00e9;
    L_0x0268:
        r5.close();	 Catch:{ IOException -> 0x026d }
        goto L_0x00e9;
    L_0x026d:
        r2 = move-exception;
        r3 = z;
        r4 = 11;
        r3 = r3[r4];
        com.whatsapp.util.Log.b(r3, r2);
        goto L_0x00e9;
    L_0x0279:
        r0 = move-exception;
        throw r0;
    L_0x027b:
        r1 = move-exception;
        r2 = z;
        r3 = 6;
        r2 = r2[r3];
        com.whatsapp.util.Log.b(r2, r1);
        goto L_0x024e;
    L_0x0285:
        r0 = move-exception;
        throw r0;
    L_0x0287:
        r0 = move-exception;
        throw r0;
    L_0x0289:
        r1 = r12.n;	 Catch:{ IOException -> 0x03f4 }
        r2 = 1;
        if (r1 <= r2) goto L_0x02aa;
    L_0x028e:
        r1 = r9.left;	 Catch:{ IOException -> 0x03f4 }
        r2 = r12.n;	 Catch:{ IOException -> 0x03f4 }
        r1 = r1 * r2;
        r9.left = r1;	 Catch:{ IOException -> 0x03f4 }
        r1 = r9.right;	 Catch:{ IOException -> 0x03f4 }
        r2 = r12.n;	 Catch:{ IOException -> 0x03f4 }
        r1 = r1 * r2;
        r9.right = r1;	 Catch:{ IOException -> 0x03f4 }
        r1 = r9.top;	 Catch:{ IOException -> 0x03f4 }
        r2 = r12.n;	 Catch:{ IOException -> 0x03f4 }
        r1 = r1 * r2;
        r9.top = r1;	 Catch:{ IOException -> 0x03f4 }
        r1 = r9.bottom;	 Catch:{ IOException -> 0x03f4 }
        r2 = r12.n;	 Catch:{ IOException -> 0x03f4 }
        r1 = r1 * r2;
        r9.bottom = r1;	 Catch:{ IOException -> 0x03f4 }
    L_0x02aa:
        r1 = 1;
        r2 = r12.x;	 Catch:{ IOException -> 0x03f6 }
        if (r2 == 0) goto L_0x02df;
    L_0x02af:
        r2 = r9.width();	 Catch:{ IOException -> 0x03f6 }
        r2 = r2 / 2;
        r3 = r12.x;	 Catch:{ IOException -> 0x03f6 }
        if (r2 > r3) goto L_0x02c3;
    L_0x02b9:
        r2 = r9.height();
        r2 = r2 / 2;
        r3 = r12.x;
        if (r2 <= r3) goto L_0x02df;
    L_0x02c3:
        r1 = r1 * 2;
        r2 = r9.left;
        r2 = r2 / 2;
        r9.left = r2;
        r2 = r9.right;
        r2 = r2 / 2;
        r9.right = r2;
        r2 = r9.top;
        r2 = r2 / 2;
        r9.top = r2;
        r2 = r9.bottom;
        r2 = r2 / 2;
        r9.bottom = r2;
        if (r7 == 0) goto L_0x02af;
    L_0x02df:
        r2 = r12.n;	 Catch:{ IOException -> 0x03f8 }
        r3 = 1;
        if (r2 > r3) goto L_0x02e7;
    L_0x02e4:
        r2 = 1;
        if (r1 <= r2) goto L_0x04ce;
    L_0x02e7:
        r2 = r12.u;
        r2.recycle();
        r2 = r0;
        r0 = r1;
    L_0x02ee:
        r3 = r12.n;
        r3 = java.lang.Math.max(r3, r1);
        if (r0 > r3) goto L_0x0362;
    L_0x02f6:
        r3 = new android.graphics.BitmapFactory$Options;
        r3.<init>();
        r3.inSampleSize = r0;	 Catch:{ IOException -> 0x03fa }
        r4 = 1;
        r3.inDither = r4;	 Catch:{ IOException -> 0x03fa }
        r4 = 0;
        r3.inJustDecodeBounds = r4;	 Catch:{ IOException -> 0x03fa }
        r4 = 0;
        r3.inScaled = r4;	 Catch:{ IOException -> 0x03fa }
        r4 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IOException -> 0x03fa }
        r5 = 10;
        if (r4 < r5) goto L_0x030f;
    L_0x030c:
        r4 = 1;
        r3.inPreferQualityOverSpeed = r4;	 Catch:{ IOException -> 0x03fa }
    L_0x030f:
        r4 = 0;
        r5 = com.whatsapp.App.at;	 Catch:{ OutOfMemoryError -> 0x0402, FileNotFoundException -> 0x0463 }
        r6 = r12.getIntent();	 Catch:{ OutOfMemoryError -> 0x0402, FileNotFoundException -> 0x0463 }
        r6 = r6.getData();	 Catch:{ OutOfMemoryError -> 0x0402, FileNotFoundException -> 0x0463 }
        r4 = r5.openInputStream(r6);	 Catch:{ OutOfMemoryError -> 0x0402, FileNotFoundException -> 0x0463 }
        r5 = 0;
        r3 = android.graphics.BitmapFactory.decodeStream(r4, r5, r3);	 Catch:{ OutOfMemoryError -> 0x0402, FileNotFoundException -> 0x0463 }
        r12.u = r3;	 Catch:{ OutOfMemoryError -> 0x0402, FileNotFoundException -> 0x0463 }
        r5 = r9.width();	 Catch:{ OutOfMemoryError -> 0x0402, FileNotFoundException -> 0x0463 }
        r3 = r9.height();	 Catch:{ OutOfMemoryError -> 0x0402, FileNotFoundException -> 0x0463 }
        r6 = r12.x;	 Catch:{ IOException -> 0x03fc }
        if (r6 == 0) goto L_0x04ca;
    L_0x0331:
        r6 = r12.x;	 Catch:{ IOException -> 0x03fc }
        if (r5 > r6) goto L_0x0339;
    L_0x0335:
        r6 = r12.x;	 Catch:{ IOException -> 0x03fe }
        if (r3 <= r6) goto L_0x04ca;
    L_0x0339:
        if (r5 <= r3) goto L_0x0343;
    L_0x033b:
        r6 = r12.x;	 Catch:{ OutOfMemoryError -> 0x0402, FileNotFoundException -> 0x0463 }
        r3 = r3 * r6;
        r3 = r3 / r5;
        r5 = r12.x;	 Catch:{ OutOfMemoryError -> 0x0402, FileNotFoundException -> 0x0463 }
        if (r7 == 0) goto L_0x04ca;
    L_0x0343:
        r6 = r12.x;	 Catch:{ OutOfMemoryError -> 0x0402, FileNotFoundException -> 0x0463 }
        r5 = r5 * r6;
        r5 = r5 / r3;
        r3 = r12.x;	 Catch:{ OutOfMemoryError -> 0x0402, FileNotFoundException -> 0x0463 }
        r6 = r5;
        r5 = r3;
    L_0x034b:
        r3 = r12.u;	 Catch:{ OutOfMemoryError -> 0x0402, FileNotFoundException -> 0x0463 }
        r3 = r3.getConfig();	 Catch:{ OutOfMemoryError -> 0x0402, FileNotFoundException -> 0x0463 }
        r10 = r12.f;	 Catch:{ IOException -> 0x045f }
        if (r10 != 0) goto L_0x0357;
    L_0x0355:
        if (r3 != 0) goto L_0x0359;
    L_0x0357:
        r3 = android.graphics.Bitmap.Config.ARGB_8888;	 Catch:{ IOException -> 0x0461 }
    L_0x0359:
        r2 = android.graphics.Bitmap.createBitmap(r6, r5, r3);	 Catch:{ OutOfMemoryError -> 0x0402, FileNotFoundException -> 0x0463 }
        if (r4 == 0) goto L_0x0362;
    L_0x035f:
        r4.close();	 Catch:{ IOException -> 0x0482, OutOfMemoryError -> 0x0480 }
    L_0x0362:
        r1 = r9.width();
        r0 = r9.height();
        r3 = r12.x;	 Catch:{ IOException -> 0x04b3 }
        if (r3 == 0) goto L_0x04c6;
    L_0x036e:
        r3 = r12.x;	 Catch:{ IOException -> 0x04b5 }
        if (r1 > r3) goto L_0x0376;
    L_0x0372:
        r3 = r12.x;	 Catch:{ IOException -> 0x04b7 }
        if (r0 <= r3) goto L_0x04c6;
    L_0x0376:
        if (r1 <= r0) goto L_0x0380;
    L_0x0378:
        r3 = r12.x;
        r0 = r0 * r3;
        r0 = r0 / r1;
        r1 = r12.x;
        if (r7 == 0) goto L_0x04c6;
    L_0x0380:
        r3 = r12.x;
        r1 = r1 * r3;
        r1 = r1 / r0;
        r0 = r12.x;
        r3 = r1;
        r1 = r0;
    L_0x0388:
        if (r2 != 0) goto L_0x039c;
    L_0x038a:
        r0 = r12.u;
        r0 = r0.getConfig();
        r2 = r12.f;	 Catch:{ IOException -> 0x04b9 }
        if (r2 != 0) goto L_0x0396;
    L_0x0394:
        if (r0 != 0) goto L_0x0398;
    L_0x0396:
        r0 = android.graphics.Bitmap.Config.ARGB_8888;	 Catch:{ IOException -> 0x04bb }
    L_0x0398:
        r2 = android.graphics.Bitmap.createBitmap(r3, r1, r0);
    L_0x039c:
        r0 = new android.graphics.Canvas;
        r0.<init>(r2);
        r4 = new android.graphics.Rect;
        r5 = 0;
        r6 = 0;
        r4.<init>(r5, r6, r3, r1);
        r1 = r12.b;	 Catch:{ IOException -> 0x04bd }
        if (r1 == 0) goto L_0x03ed;
    L_0x03ac:
        r1 = r12.v;	 Catch:{ IOException -> 0x04bd }
        if (r1 == 0) goto L_0x03ed;
    L_0x03b0:
        r1 = new android.graphics.Matrix;
        r1.<init>();
        r3 = r4.left;
        r5 = r4.right;
        r3 = r3 + r5;
        r3 = -r3;
        r3 = r3 / 2;
        r3 = (float) r3;
        r5 = r4.top;
        r6 = r4.bottom;
        r5 = r5 + r6;
        r5 = -r5;
        r5 = r5 / 2;
        r5 = (float) r5;
        r1.preTranslate(r3, r5);
        r3 = r12.b;
        r1.postConcat(r3);
        r3 = r4.left;
        r5 = r4.right;
        r3 = r3 + r5;
        r3 = r3 / 2;
        r3 = (float) r3;
        r5 = r4.top;
        r6 = r4.bottom;
        r5 = r5 + r6;
        r5 = r5 / 2;
        r5 = (float) r5;
        r1.postTranslate(r3, r5);
        r3 = new android.graphics.RectF;
        r3.<init>(r4);
        r1.mapRect(r3);
        r0.setMatrix(r1);
    L_0x03ed:
        r1 = r12.u;
        r0.drawBitmap(r1, r9, r4, r8);
        goto L_0x0186;
    L_0x03f4:
        r0 = move-exception;
        throw r0;
    L_0x03f6:
        r0 = move-exception;
        throw r0;
    L_0x03f8:
        r0 = move-exception;
        throw r0;
    L_0x03fa:
        r0 = move-exception;
        throw r0;
    L_0x03fc:
        r3 = move-exception;
        throw r3;	 Catch:{ IOException -> 0x03fe }
    L_0x03fe:
        r3 = move-exception;
        throw r3;	 Catch:{ IOException -> 0x0400 }
    L_0x0400:
        r3 = move-exception;
        throw r3;	 Catch:{ OutOfMemoryError -> 0x0402, FileNotFoundException -> 0x0463 }
    L_0x0402:
        r3 = move-exception;
        r5 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x048d }
        r5.<init>();	 Catch:{ IOException -> 0x048d }
        r6 = z;	 Catch:{ IOException -> 0x048d }
        r10 = 5;
        r6 = r6[r10];	 Catch:{ IOException -> 0x048d }
        r5 = r5.append(r6);	 Catch:{ IOException -> 0x048d }
        r5 = r5.append(r0);	 Catch:{ IOException -> 0x048d }
        r5 = r5.toString();	 Catch:{ IOException -> 0x048d }
        com.whatsapp.util.Log.b(r5, r3);	 Catch:{ IOException -> 0x048d }
        r3 = r12.u;	 Catch:{ IOException -> 0x048d }
        if (r3 == 0) goto L_0x0430;
    L_0x0420:
        r3 = r12.u;	 Catch:{ IOException -> 0x048d }
        r3 = r3.isRecycled();	 Catch:{ IOException -> 0x048d }
        if (r3 != 0) goto L_0x0430;
    L_0x0428:
        r3 = r12.u;	 Catch:{ IOException -> 0x048f }
        r3.recycle();	 Catch:{ IOException -> 0x048f }
        r3 = 0;
        r12.u = r3;	 Catch:{ IOException -> 0x048f }
    L_0x0430:
        if (r2 == 0) goto L_0x043c;
    L_0x0432:
        r3 = r2.isRecycled();	 Catch:{ IOException -> 0x0498 }
        if (r3 != 0) goto L_0x043c;
    L_0x0438:
        r2.recycle();	 Catch:{ all -> 0x0491 }
        r2 = 0;
    L_0x043c:
        if (r4 == 0) goto L_0x0441;
    L_0x043e:
        r4.close();	 Catch:{ IOException -> 0x049c, OutOfMemoryError -> 0x049a }
    L_0x0441:
        r3 = r9.left;
        r3 = r3 / 2;
        r9.left = r3;
        r3 = r9.right;
        r3 = r3 / 2;
        r9.right = r3;
        r3 = r9.top;
        r3 = r3 / 2;
        r9.top = r3;
        r3 = r9.bottom;
        r3 = r3 / 2;
        r9.bottom = r3;
        r0 = r0 * 2;
        if (r7 == 0) goto L_0x02ee;
    L_0x045d:
        goto L_0x0362;
    L_0x045f:
        r3 = move-exception;
        throw r3;	 Catch:{ IOException -> 0x0461 }
    L_0x0461:
        r3 = move-exception;
        throw r3;	 Catch:{ OutOfMemoryError -> 0x0402, FileNotFoundException -> 0x0463 }
    L_0x0463:
        r0 = move-exception;
        r1 = z;	 Catch:{ all -> 0x0491 }
        r3 = 8;
        r1 = r1[r3];	 Catch:{ all -> 0x0491 }
        com.whatsapp.util.Log.b(r1, r0);	 Catch:{ all -> 0x0491 }
        if (r4 == 0) goto L_0x0362;
    L_0x046f:
        r4.close();	 Catch:{ IOException -> 0x0474 }
        goto L_0x0362;
    L_0x0474:
        r0 = move-exception;
        r1 = z;
        r3 = 13;
        r1 = r1[r3];
        com.whatsapp.util.Log.b(r1, r0);
        goto L_0x0362;
    L_0x0480:
        r0 = move-exception;
        throw r0;
    L_0x0482:
        r0 = move-exception;
        r1 = z;
        r3 = 1;
        r1 = r1[r3];
        com.whatsapp.util.Log.b(r1, r0);
        goto L_0x0362;
    L_0x048d:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x048f }
    L_0x048f:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0491 }
    L_0x0491:
        r0 = move-exception;
        if (r4 == 0) goto L_0x0497;
    L_0x0494:
        r4.close();	 Catch:{ IOException -> 0x04a8, OutOfMemoryError -> 0x04a6 }
    L_0x0497:
        throw r0;
    L_0x0498:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0491 }
    L_0x049a:
        r0 = move-exception;
        throw r0;
    L_0x049c:
        r3 = move-exception;
        r4 = z;
        r5 = 7;
        r4 = r4[r5];
        com.whatsapp.util.Log.b(r4, r3);
        goto L_0x0441;
    L_0x04a6:
        r0 = move-exception;
        throw r0;
    L_0x04a8:
        r1 = move-exception;
        r2 = z;
        r3 = 14;
        r2 = r2[r3];
        com.whatsapp.util.Log.b(r2, r1);
        goto L_0x0497;
    L_0x04b3:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x04b5 }
    L_0x04b5:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x04b7 }
    L_0x04b7:
        r0 = move-exception;
        throw r0;
    L_0x04b9:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x04bb }
    L_0x04bb:
        r0 = move-exception;
        throw r0;
    L_0x04bd:
        r0 = move-exception;
        throw r0;
    L_0x04bf:
        r0 = move-exception;
        throw r0;
    L_0x04c1:
        r12.a(r2);
        goto L_0x0006;
    L_0x04c6:
        r3 = r1;
        r1 = r0;
        goto L_0x0388;
    L_0x04ca:
        r6 = r5;
        r5 = r3;
        goto L_0x034b;
    L_0x04ce:
        r2 = r0;
        goto L_0x0362;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wallpaper.CropImage.b():void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
        r11 = this;
        r5 = 0;
        r10 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r6 = c;
        r0 = new com.whatsapp.wallpaper.l;
        r1 = r11.g;
        r0.<init>(r1);
        r1 = r11.u;
        r7 = r1.getWidth();
        r1 = r11.u;
        r4 = r1.getHeight();
        r2 = new android.graphics.Rect;
        r2.<init>(r5, r5, r7, r4);
        r1 = java.lang.Math.min(r7, r4);
        r1 = r1 * 4;
        r3 = r1 / 5;
        r1 = r11.a;
        if (r1 == 0) goto L_0x0114;
    L_0x0029:
        r1 = r11.j;
        if (r1 >= r3) goto L_0x003d;
    L_0x002d:
        r1 = r11.y;
        if (r1 >= r3) goto L_0x003d;
    L_0x0031:
        r1 = (float) r3;
        r8 = r11.y;
        r8 = (float) r8;
        r1 = r1 * r8;
        r8 = r11.j;
        r8 = (float) r8;
        r1 = r1 / r8;
        r1 = (int) r1;
        if (r6 == 0) goto L_0x0041;
    L_0x003d:
        r3 = r11.j;
        r1 = r11.y;
    L_0x0041:
        r8 = r11.p;
        if (r8 == 0) goto L_0x005d;
    L_0x0045:
        r8 = r11.d;
        if (r8 == 0) goto L_0x005d;
    L_0x0049:
        r8 = r11.p;
        r9 = r11.d;
        if (r8 <= r9) goto L_0x0057;
    L_0x004f:
        r1 = r11.d;
        r1 = r1 * r3;
        r8 = r11.p;
        r1 = r1 / r8;
        if (r6 == 0) goto L_0x005d;
    L_0x0057:
        r3 = r11.p;
        r3 = r3 * r1;
        r6 = r11.d;
        r3 = r3 / r6;
    L_0x005d:
        if (r1 <= r4) goto L_0x0068;
    L_0x005f:
        r1 = (float) r1;
        r6 = (float) r4;
        r1 = r1 / r6;
        r3 = (float) r3;
        r1 = r3 / r1;
        r1 = (int) r1;
        r3 = r1;
        r1 = r4;
    L_0x0068:
        r6 = r11.h;
        if (r6 <= 0) goto L_0x00a0;
    L_0x006c:
        r6 = r11.h;
        r8 = r11.n;
        r6 = r6 / r8;
        if (r3 >= r6) goto L_0x0086;
    L_0x0073:
        r3 = r11.h;
        r6 = r11.n;
        r3 = r3 / r6;
        r6 = r11.p;
        if (r6 == 0) goto L_0x0086;
    L_0x007c:
        r6 = r11.d;
        if (r6 == 0) goto L_0x0086;
    L_0x0080:
        r1 = r11.d;
        r1 = r1 * r3;
        r6 = r11.p;
        r1 = r1 / r6;
    L_0x0086:
        r6 = r11.h;
        r8 = r11.n;
        r6 = r6 / r8;
        if (r1 >= r6) goto L_0x00a0;
    L_0x008d:
        r1 = r11.h;
        r6 = r11.n;
        r1 = r1 / r6;
        r6 = r11.p;
        if (r6 == 0) goto L_0x00a0;
    L_0x0096:
        r6 = r11.d;
        if (r6 == 0) goto L_0x00a0;
    L_0x009a:
        r3 = r11.p;
        r3 = r3 * r1;
        r6 = r11.d;
        r3 = r3 / r6;
    L_0x00a0:
        r6 = r7 - r3;
        r6 = r6 / 2;
        r4 = r4 - r1;
        r7 = r4 / 2;
        r4 = new android.graphics.RectF;
        r8 = (float) r6;
        r9 = (float) r7;
        r3 = r3 + r6;
        r3 = (float) r3;
        r1 = r1 + r7;
        r1 = (float) r1;
        r4.<init>(r8, r9, r3, r1);
        r1 = new android.graphics.Matrix;
        r1.<init>();
        r3 = r4.left;
        r6 = r4.right;
        r3 = r3 + r6;
        r3 = -r3;
        r3 = r3 / r10;
        r6 = r4.top;
        r7 = r4.bottom;
        r6 = r6 + r7;
        r6 = -r6;
        r6 = r6 / r10;
        r1.preTranslate(r3, r6);
        r3 = r11.b;
        r1.postConcat(r3);
        r3 = r11.e;
        r1.postConcat(r3);
        r3 = r4.left;
        r6 = r4.right;
        r3 = r3 + r6;
        r3 = r3 / r10;
        r6 = r4.top;
        r7 = r4.bottom;
        r6 = r6 + r7;
        r6 = r6 / r10;
        r1.postTranslate(r3, r6);
        r1.mapRect(r4);
        r1 = r11.m;
        if (r1 == 0) goto L_0x0112;
    L_0x00e8:
        r3 = new android.graphics.RectF;
        r1 = r11.m;
        r3.<init>(r1);
    L_0x00ef:
        r1 = r11.g;
        r1 = r1.getImageMatrix();
        r4 = r11.f;
        r6 = r11.p;
        if (r6 == 0) goto L_0x0100;
    L_0x00fb:
        r6 = r11.d;
        if (r6 == 0) goto L_0x0100;
    L_0x00ff:
        r5 = 1;
    L_0x0100:
        r6 = r11.a;
        r7 = r11.h;
        r8 = r11.n;
        r7 = r7 / r8;
        r0.a(r1, r2, r3, r4, r5, r6, r7);
        r1 = r11.g;
        r1.b(r0);
        r11.q = r0;
        return;
    L_0x0112:
        r3 = r4;
        goto L_0x00ef;
    L_0x0114:
        r1 = r3;
        goto L_0x0041;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wallpaper.CropImage.a():void");
    }

    protected void onDestroy() {
        super.onDestroy();
        if (!(this.u == null || this.u.isRecycled())) {
            this.g.m = true;
            this.u.recycle();
            this.u = null;
        }
        Log.i(z[61]);
        App.w(getApplicationContext());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r11) {
        /*
        r10 = this;
        r9 = 9;
        r5 = 0;
        r2 = 0;
        r1 = 1;
        r3 = c;
        r0 = z;
        r4 = 35;
        r0 = r0[r4];
        com.whatsapp.util.Log.i(r0);
        super.onCreate(r11);
        r0 = r10.getApplicationContext();
        com.whatsapp.App.w(r0);
        r10.requestWindowFeature(r1);
        r0 = r10.getLayoutInflater();
        r4 = 2130903153; // 0x7f030071 float:1.7413116E38 double:1.0528060425E-314;
        r0 = com.whatsapp.aam.a(r0, r4, r5);
        r10.setContentView(r0);
        r0 = 2131755123; // 0x7f100073 float:1.9141116E38 double:1.0532269716E-314;
        r0 = r10.findViewById(r0);
        r0 = (com.whatsapp.wallpaper.CropImageView) r0;
        r10.g = r0;
        r4 = r10.getIntent();
        r5 = r4.getExtras();
        if (r5 == 0) goto L_0x0128;
    L_0x0040:
        r0 = z;	 Catch:{ OutOfMemoryError -> 0x0170 }
        r6 = 47;
        r0 = r0[r6];	 Catch:{ OutOfMemoryError -> 0x0170 }
        r0 = r5.getString(r0);	 Catch:{ OutOfMemoryError -> 0x0170 }
        if (r0 == 0) goto L_0x0055;
    L_0x004c:
        r0 = 1;
        r10.f = r0;	 Catch:{ OutOfMemoryError -> 0x0172 }
        r0 = 1;
        r10.p = r0;	 Catch:{ OutOfMemoryError -> 0x0172 }
        r0 = 1;
        r10.d = r0;	 Catch:{ OutOfMemoryError -> 0x0172 }
    L_0x0055:
        r0 = z;
        r6 = 40;
        r0 = r0[r6];
        r0 = r5.getParcelable(r0);
        r0 = (android.net.Uri) r0;
        r10.k = r0;
        r0 = r10.k;
        if (r0 == 0) goto L_0x0079;
    L_0x0067:
        r0 = z;
        r6 = 29;
        r0 = r0[r6];
        r0 = r5.getString(r0);
        if (r0 == 0) goto L_0x0079;
    L_0x0073:
        r0 = android.graphics.Bitmap.CompressFormat.valueOf(r0);	 Catch:{ OutOfMemoryError -> 0x0174 }
        r10.w = r0;	 Catch:{ OutOfMemoryError -> 0x0174 }
    L_0x0079:
        r0 = z;	 Catch:{ OutOfMemoryError -> 0x0176 }
        r6 = 51;
        r0 = r0[r6];	 Catch:{ OutOfMemoryError -> 0x0176 }
        r0 = r5.getParcelable(r0);	 Catch:{ OutOfMemoryError -> 0x0176 }
        r0 = (android.graphics.Bitmap) r0;	 Catch:{ OutOfMemoryError -> 0x0176 }
        r10.u = r0;	 Catch:{ OutOfMemoryError -> 0x0176 }
        r0 = z;	 Catch:{ OutOfMemoryError -> 0x0176 }
        r6 = 41;
        r0 = r0[r6];	 Catch:{ OutOfMemoryError -> 0x0176 }
        r0 = r5.getInt(r0);	 Catch:{ OutOfMemoryError -> 0x0176 }
        r10.p = r0;	 Catch:{ OutOfMemoryError -> 0x0176 }
        r0 = z;	 Catch:{ OutOfMemoryError -> 0x0176 }
        r6 = 39;
        r0 = r0[r6];	 Catch:{ OutOfMemoryError -> 0x0176 }
        r0 = r5.getInt(r0);	 Catch:{ OutOfMemoryError -> 0x0176 }
        r10.d = r0;	 Catch:{ OutOfMemoryError -> 0x0176 }
        r0 = z;	 Catch:{ OutOfMemoryError -> 0x0176 }
        r6 = 26;
        r0 = r0[r6];	 Catch:{ OutOfMemoryError -> 0x0176 }
        r0 = r5.getInt(r0);	 Catch:{ OutOfMemoryError -> 0x0176 }
        r10.j = r0;	 Catch:{ OutOfMemoryError -> 0x0176 }
        r0 = z;	 Catch:{ OutOfMemoryError -> 0x0176 }
        r6 = 58;
        r0 = r0[r6];	 Catch:{ OutOfMemoryError -> 0x0176 }
        r0 = r5.getInt(r0);	 Catch:{ OutOfMemoryError -> 0x0176 }
        r10.y = r0;	 Catch:{ OutOfMemoryError -> 0x0176 }
        r0 = z;	 Catch:{ OutOfMemoryError -> 0x0176 }
        r6 = 43;
        r0 = r0[r6];	 Catch:{ OutOfMemoryError -> 0x0176 }
        r0 = r5.getInt(r0);	 Catch:{ OutOfMemoryError -> 0x0176 }
        r10.h = r0;	 Catch:{ OutOfMemoryError -> 0x0176 }
        r0 = z;	 Catch:{ OutOfMemoryError -> 0x0176 }
        r6 = 55;
        r0 = r0[r6];	 Catch:{ OutOfMemoryError -> 0x0176 }
        r0 = r5.getInt(r0);	 Catch:{ OutOfMemoryError -> 0x0176 }
        r10.x = r0;	 Catch:{ OutOfMemoryError -> 0x0176 }
        r0 = z;	 Catch:{ OutOfMemoryError -> 0x0176 }
        r6 = 37;
        r0 = r0[r6];	 Catch:{ OutOfMemoryError -> 0x0176 }
        r0 = r5.getParcelable(r0);	 Catch:{ OutOfMemoryError -> 0x0176 }
        r0 = (android.graphics.Rect) r0;	 Catch:{ OutOfMemoryError -> 0x0176 }
        r10.m = r0;	 Catch:{ OutOfMemoryError -> 0x0176 }
        r0 = r10.g;	 Catch:{ OutOfMemoryError -> 0x0176 }
        r6 = z;	 Catch:{ OutOfMemoryError -> 0x0176 }
        r7 = 31;
        r6 = r6[r7];	 Catch:{ OutOfMemoryError -> 0x0176 }
        r7 = 1;
        r6 = r5.getBoolean(r6, r7);	 Catch:{ OutOfMemoryError -> 0x0176 }
        r10.a = r6;	 Catch:{ OutOfMemoryError -> 0x0176 }
        r0.o = r6;	 Catch:{ OutOfMemoryError -> 0x0176 }
        r0 = z;	 Catch:{ OutOfMemoryError -> 0x0176 }
        r6 = 52;
        r0 = r0[r6];	 Catch:{ OutOfMemoryError -> 0x0176 }
        r6 = 1;
        r0 = r5.getBoolean(r0, r6);	 Catch:{ OutOfMemoryError -> 0x0176 }
        r10.o = r0;	 Catch:{ OutOfMemoryError -> 0x0176 }
        r0 = z;	 Catch:{ OutOfMemoryError -> 0x0176 }
        r6 = 27;
        r0 = r0[r6];	 Catch:{ OutOfMemoryError -> 0x0176 }
        r6 = 1;
        r0 = r5.getBoolean(r0, r6);	 Catch:{ OutOfMemoryError -> 0x0176 }
        r10.r = r0;	 Catch:{ OutOfMemoryError -> 0x0176 }
        r0 = z;	 Catch:{ OutOfMemoryError -> 0x0176 }
        r6 = 59;
        r0 = r0[r6];	 Catch:{ OutOfMemoryError -> 0x0176 }
        r0 = r5.getInt(r0);	 Catch:{ OutOfMemoryError -> 0x0176 }
        r10.s = r0;	 Catch:{ OutOfMemoryError -> 0x0176 }
        r0 = z;	 Catch:{ OutOfMemoryError -> 0x0176 }
        r6 = 49;
        r0 = r0[r6];	 Catch:{ OutOfMemoryError -> 0x0176 }
        r6 = 1;
        r0 = r5.getBoolean(r0, r6);	 Catch:{ OutOfMemoryError -> 0x0176 }
        r10.v = r0;	 Catch:{ OutOfMemoryError -> 0x0176 }
        r0 = r10.u;	 Catch:{ OutOfMemoryError -> 0x0176 }
        if (r0 == 0) goto L_0x0178;
    L_0x0125:
        r0 = r1;
    L_0x0126:
        r10.t = r0;
    L_0x0128:
        r0 = r10.u;
        if (r0 != 0) goto L_0x0253;
    L_0x012c:
        r5 = r4.getData();
        r0 = com.whatsapp.util.ag.g(r5);	 Catch:{ OutOfMemoryError -> 0x017a }
        r10.i = r0;	 Catch:{ OutOfMemoryError -> 0x017a }
        r0 = r10.i;	 Catch:{ OutOfMemoryError -> 0x017a }
        r0 = com.whatsapp.util.ag.a(r0);	 Catch:{ OutOfMemoryError -> 0x017a }
        r10.b = r0;	 Catch:{ OutOfMemoryError -> 0x017a }
        r0 = r10.b;	 Catch:{ OutOfMemoryError -> 0x017a }
        if (r0 != 0) goto L_0x0149;
    L_0x0142:
        r0 = new android.graphics.Matrix;	 Catch:{ OutOfMemoryError -> 0x017a }
        r0.<init>();	 Catch:{ OutOfMemoryError -> 0x017a }
        r10.b = r0;	 Catch:{ OutOfMemoryError -> 0x017a }
    L_0x0149:
        r0 = com.whatsapp.util.ag.c(r5);	 Catch:{ IOException -> 0x017c }
        if (r0 != 0) goto L_0x01ca;
    L_0x014f:
        r0 = z;	 Catch:{ IOException -> 0x017c }
        r1 = 60;
        r0 = r0[r1];	 Catch:{ IOException -> 0x017c }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IOException -> 0x017c }
        r0 = 0;
        r1 = new android.content.Intent;	 Catch:{ IOException -> 0x017c }
        r1.<init>();	 Catch:{ IOException -> 0x017c }
        r2 = z;	 Catch:{ IOException -> 0x017c }
        r4 = 34;
        r2 = r2[r4];	 Catch:{ IOException -> 0x017c }
        r4 = 1;
        r1 = r1.putExtra(r2, r4);	 Catch:{ IOException -> 0x017c }
        r10.setResult(r0, r1);	 Catch:{ IOException -> 0x017c }
        r10.finish();	 Catch:{ IOException -> 0x017c }
    L_0x016f:
        return;
    L_0x0170:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x0172 }
    L_0x0172:
        r0 = move-exception;
        throw r0;
    L_0x0174:
        r0 = move-exception;
        throw r0;
    L_0x0176:
        r0 = move-exception;
        throw r0;
    L_0x0178:
        r0 = r2;
        goto L_0x0126;
    L_0x017a:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x017c }
    L_0x017c:
        r0 = move-exception;
        r1 = r0.getMessage();	 Catch:{ OutOfMemoryError -> 0x02b6 }
        if (r1 == 0) goto L_0x01a9;
    L_0x0183:
        r1 = r0.getMessage();	 Catch:{ OutOfMemoryError -> 0x02b6 }
        r2 = z;	 Catch:{ OutOfMemoryError -> 0x02b6 }
        r4 = 44;
        r2 = r2[r4];	 Catch:{ OutOfMemoryError -> 0x02b6 }
        r1 = r1.contains(r2);	 Catch:{ OutOfMemoryError -> 0x02b6 }
        if (r1 == 0) goto L_0x01a9;
    L_0x0193:
        r1 = 0;
        r2 = new android.content.Intent;	 Catch:{ OutOfMemoryError -> 0x02b8 }
        r2.<init>();	 Catch:{ OutOfMemoryError -> 0x02b8 }
        r4 = z;	 Catch:{ OutOfMemoryError -> 0x02b8 }
        r5 = 42;
        r4 = r4[r5];	 Catch:{ OutOfMemoryError -> 0x02b8 }
        r5 = 1;
        r2 = r2.putExtra(r4, r5);	 Catch:{ OutOfMemoryError -> 0x02b8 }
        r10.setResult(r1, r2);	 Catch:{ OutOfMemoryError -> 0x02b8 }
        if (r3 == 0) goto L_0x01bd;
    L_0x01a9:
        r1 = 0;
        r2 = new android.content.Intent;	 Catch:{ OutOfMemoryError -> 0x02ba }
        r2.<init>();	 Catch:{ OutOfMemoryError -> 0x02ba }
        r3 = z;	 Catch:{ OutOfMemoryError -> 0x02ba }
        r4 = 32;
        r3 = r3[r4];	 Catch:{ OutOfMemoryError -> 0x02ba }
        r4 = 1;
        r2 = r2.putExtra(r3, r4);	 Catch:{ OutOfMemoryError -> 0x02ba }
        r10.setResult(r1, r2);	 Catch:{ OutOfMemoryError -> 0x02ba }
    L_0x01bd:
        r1 = z;
        r2 = 33;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        r10.finish();
        goto L_0x016f;
    L_0x01ca:
        r6 = new android.graphics.BitmapFactory$Options;	 Catch:{ IOException -> 0x017c }
        r6.<init>();	 Catch:{ IOException -> 0x017c }
        r7 = 1;
        r6.inJustDecodeBounds = r7;	 Catch:{ OutOfMemoryError -> 0x0203 }
        r7 = 0;
        android.graphics.BitmapFactory.decodeStream(r0, r7, r6);	 Catch:{ OutOfMemoryError -> 0x0203 }
        r0.close();	 Catch:{ OutOfMemoryError -> 0x0203 }
        r0 = r6.outWidth;	 Catch:{ OutOfMemoryError -> 0x0203 }
        if (r0 <= 0) goto L_0x01e1;
    L_0x01dd:
        r0 = r6.outHeight;	 Catch:{ OutOfMemoryError -> 0x0203 }
        if (r0 > 0) goto L_0x0205;
    L_0x01e1:
        r0 = z;	 Catch:{ IOException -> 0x017c }
        r1 = 56;
        r0 = r0[r1];	 Catch:{ IOException -> 0x017c }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IOException -> 0x017c }
        r0 = 0;
        r1 = new android.content.Intent;	 Catch:{ IOException -> 0x017c }
        r1.<init>();	 Catch:{ IOException -> 0x017c }
        r2 = z;	 Catch:{ IOException -> 0x017c }
        r4 = 36;
        r2 = r2[r4];	 Catch:{ IOException -> 0x017c }
        r4 = 1;
        r1 = r1.putExtra(r2, r4);	 Catch:{ IOException -> 0x017c }
        r10.setResult(r0, r1);	 Catch:{ IOException -> 0x017c }
        r10.finish();	 Catch:{ IOException -> 0x017c }
        goto L_0x016f;
    L_0x0203:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x017c }
    L_0x0205:
        r0 = 1;
        r6.inSampleSize = r0;	 Catch:{ IOException -> 0x017c }
        r0 = r6.outWidth;	 Catch:{ IOException -> 0x017c }
        r7 = r6.outHeight;	 Catch:{ IOException -> 0x017c }
        r0 = java.lang.Math.max(r0, r7);	 Catch:{ IOException -> 0x017c }
        r7 = r10.getWindowManager();	 Catch:{ IOException -> 0x017c }
        r7 = r7.getDefaultDisplay();	 Catch:{ IOException -> 0x017c }
        r7 = r7.getWidth();	 Catch:{ IOException -> 0x017c }
        r8 = r10.getWindowManager();	 Catch:{ IOException -> 0x017c }
        r8 = r8.getDefaultDisplay();	 Catch:{ IOException -> 0x017c }
        r8 = r8.getHeight();	 Catch:{ IOException -> 0x017c }
        r7 = java.lang.Math.max(r7, r8);	 Catch:{ IOException -> 0x017c }
    L_0x022c:
        if (r0 <= r7) goto L_0x0238;
    L_0x022e:
        r0 = r0 / 2;
        r8 = r6.inSampleSize;	 Catch:{ IOException -> 0x017c }
        r8 = r8 * 2;
        r6.inSampleSize = r8;	 Catch:{ IOException -> 0x017c }
        if (r3 == 0) goto L_0x022c;
    L_0x0238:
        r0 = 1;
        r6.inDither = r0;	 Catch:{ IOException -> 0x017c }
        r0 = 0;
        r6.inJustDecodeBounds = r0;	 Catch:{ IOException -> 0x017c }
        r0 = 0;
        r6.inScaled = r0;	 Catch:{ IOException -> 0x017c }
        r0 = r6.inSampleSize;	 Catch:{ IOException -> 0x017c }
        r10.n = r0;	 Catch:{ IOException -> 0x017c }
        r5 = com.whatsapp.util.ag.c(r5);	 Catch:{ IOException -> 0x017c }
        r0 = 0;
        r0 = android.graphics.BitmapFactory.decodeStream(r5, r0, r6);	 Catch:{ OutOfMemoryError -> 0x028b }
        r10.u = r0;	 Catch:{ OutOfMemoryError -> 0x028b }
        r5.close();	 Catch:{ IOException -> 0x017c }
    L_0x0253:
        r0 = r10.u;	 Catch:{ OutOfMemoryError -> 0x02bc }
        if (r0 == 0) goto L_0x0267;
    L_0x0257:
        r0 = r10.u;	 Catch:{ OutOfMemoryError -> 0x02bc }
        r0 = r0.getWidth();	 Catch:{ OutOfMemoryError -> 0x02bc }
        if (r0 == 0) goto L_0x0267;
    L_0x025f:
        r0 = r10.u;	 Catch:{ OutOfMemoryError -> 0x02be }
        r0 = r0.getHeight();	 Catch:{ OutOfMemoryError -> 0x02be }
        if (r0 != 0) goto L_0x02c0;
    L_0x0267:
        r0 = z;	 Catch:{ OutOfMemoryError -> 0x0289 }
        r1 = 50;
        r0 = r0[r1];	 Catch:{ OutOfMemoryError -> 0x0289 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ OutOfMemoryError -> 0x0289 }
        r0 = 0;
        r1 = new android.content.Intent;	 Catch:{ OutOfMemoryError -> 0x0289 }
        r1.<init>();	 Catch:{ OutOfMemoryError -> 0x0289 }
        r2 = z;	 Catch:{ OutOfMemoryError -> 0x0289 }
        r3 = 46;
        r2 = r2[r3];	 Catch:{ OutOfMemoryError -> 0x0289 }
        r3 = 1;
        r1 = r1.putExtra(r2, r3);	 Catch:{ OutOfMemoryError -> 0x0289 }
        r10.setResult(r0, r1);	 Catch:{ OutOfMemoryError -> 0x0289 }
        r10.finish();	 Catch:{ OutOfMemoryError -> 0x0289 }
        goto L_0x016f;
    L_0x0289:
        r0 = move-exception;
        throw r0;
    L_0x028b:
        r0 = move-exception;
        r0 = z;	 Catch:{ all -> 0x02b1 }
        r1 = 53;
        r0 = r0[r1];	 Catch:{ all -> 0x02b1 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ all -> 0x02b1 }
        r0 = 0;
        r1 = new android.content.Intent;	 Catch:{ all -> 0x02b1 }
        r1.<init>();	 Catch:{ all -> 0x02b1 }
        r2 = z;	 Catch:{ all -> 0x02b1 }
        r4 = 54;
        r2 = r2[r4];	 Catch:{ all -> 0x02b1 }
        r4 = 1;
        r1 = r1.putExtra(r2, r4);	 Catch:{ all -> 0x02b1 }
        r10.setResult(r0, r1);	 Catch:{ all -> 0x02b1 }
        r10.finish();	 Catch:{ all -> 0x02b1 }
        r5.close();	 Catch:{ IOException -> 0x017c }
        goto L_0x016f;
    L_0x02b1:
        r0 = move-exception;
        r5.close();	 Catch:{ IOException -> 0x017c }
        throw r0;	 Catch:{ IOException -> 0x017c }
    L_0x02b6:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x02b8 }
    L_0x02b8:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x02ba }
    L_0x02ba:
        r0 = move-exception;
        throw r0;
    L_0x02bc:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x02be }
    L_0x02be:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x0289 }
    L_0x02c0:
        r0 = z;
        r3 = 28;
        r0 = r0[r3];
        r0 = r4.getIntExtra(r0, r2);
        r3 = z;
        r5 = 45;
        r3 = r3[r5];
        r3 = r4.getBooleanExtra(r3, r2);
        r5 = z;
        r6 = 48;
        r5 = r5[r6];
        r4 = r4.getBooleanExtra(r5, r2);
        r5 = new android.graphics.Matrix;	 Catch:{ OutOfMemoryError -> 0x036f }
        r5.<init>();	 Catch:{ OutOfMemoryError -> 0x036f }
        r10.e = r5;	 Catch:{ OutOfMemoryError -> 0x036f }
        if (r0 == 0) goto L_0x02ed;
    L_0x02e7:
        r5 = r10.e;	 Catch:{ OutOfMemoryError -> 0x036f }
        r0 = (float) r0;	 Catch:{ OutOfMemoryError -> 0x036f }
        r5.postRotate(r0);	 Catch:{ OutOfMemoryError -> 0x036f }
    L_0x02ed:
        if (r3 == 0) goto L_0x0301;
    L_0x02ef:
        r0 = new android.graphics.Matrix;
        r0.<init>();
        r3 = new float[r9];
        r3 = {-1082130432, 0, 0, 0, 1065353216, 0, 0, 0, 1065353216};
        r0.setValues(r3);
        r3 = r10.e;
        r3.postConcat(r0);
    L_0x0301:
        if (r4 == 0) goto L_0x0315;
    L_0x0303:
        r0 = new android.graphics.Matrix;
        r0.<init>();
        r3 = new float[r9];
        r3 = {1065353216, 0, 0, 0, -1082130432, 0, 0, 0, 1065353216};
        r0.setValues(r3);
        r3 = r10.e;
        r3.postConcat(r0);
    L_0x0315:
        r0 = new com.whatsapp.wallpaper.p;
        r3 = r10.u;
        r0.<init>(r3);
        r3 = new android.graphics.Matrix;
        r3.<init>();
        r4 = r10.b;
        r3.set(r4);
        r4 = r10.e;
        r3.postConcat(r4);
        r0.a(r3);
        r3 = r10.g;
        r3.setImageRotateBitmapResetBase(r0, r1);
        r10.a();	 Catch:{ OutOfMemoryError -> 0x0371 }
        r0 = r10.getWindow();
        r1 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r0.addFlags(r1);
        r0 = 2131755629; // 0x7f10026d float:1.9142143E38 double:1.0532272216E-314;
        r0 = r10.findViewById(r0);
        r1 = new com.whatsapp.wallpaper.r;
        r1.<init>(r10);
        r0.setOnClickListener(r1);
        r0 = 2131755628; // 0x7f10026c float:1.914214E38 double:1.053227221E-314;
        r0 = r10.findViewById(r0);
        r1 = new com.whatsapp.wallpaper.n;
        r1.<init>(r10);
        r0.setOnClickListener(r1);
        r0 = z;
        r1 = 57;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = r10.getApplicationContext();
        com.whatsapp.App.w(r0);
        goto L_0x016f;
    L_0x036f:
        r0 = move-exception;
        throw r0;
    L_0x0371:
        r0 = move-exception;
        r0 = z;
        r3 = 38;
        r0 = r0[r3];
        com.whatsapp.util.Log.e(r0);
        r0 = new android.content.Intent;
        r0.<init>();
        r3 = z;
        r4 = 30;
        r3 = r3[r4];
        r0 = r0.putExtra(r3, r1);
        r10.setResult(r2, r0);
        r10.finish();
        goto L_0x016f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wallpaper.CropImage.onCreate(android.os.Bundle):void");
    }

    protected void onPause() {
        super.onPause();
    }

    static void a(CropImage cropImage) {
        cropImage.b();
    }

    protected void onResume() {
        super.onResume();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.graphics.Bitmap r15) {
        /*
        r14 = this;
        r12 = 0;
        r10 = -1;
        r3 = 0;
        r2 = 1;
        r4 = c;
        r0 = r14.k;
        if (r0 == 0) goto L_0x00c2;
    L_0x000b:
        r5 = new java.io.File;
        r0 = r14.k;
        r0 = r0.getPath();
        r5.<init>(r0);
        r0 = 75;
    L_0x0018:
        r1 = 0;
        r6 = com.whatsapp.App.at;	 Catch:{ IOException -> 0x00e8 }
        r7 = r14.k;	 Catch:{ IOException -> 0x00e8 }
        r1 = r6.openOutputStream(r7);	 Catch:{ IOException -> 0x00e8 }
        if (r1 == 0) goto L_0x0028;
    L_0x0023:
        r6 = r14.w;	 Catch:{ IOException -> 0x00e8 }
        r15.compress(r6, r0, r1);	 Catch:{ IOException -> 0x00e8 }
    L_0x0028:
        r0 = r0 + -10;
        com.whatsapp.util.ao.a(r1);
        r1 = r14.s;	 Catch:{ IOException -> 0x0156 }
        if (r1 == 0) goto L_0x0184;
    L_0x0031:
        if (r0 <= 0) goto L_0x0184;
    L_0x0033:
        r1 = r5.exists();	 Catch:{ IOException -> 0x0158 }
        if (r1 == 0) goto L_0x0184;
    L_0x0039:
        r6 = r5.length();	 Catch:{ IOException -> 0x015a }
        r1 = r14.s;	 Catch:{ IOException -> 0x015a }
        r8 = (long) r1;
        r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r1 > 0) goto L_0x0018;
    L_0x0044:
        r0 = r3;
    L_0x0045:
        r6 = r5.length();	 Catch:{ IOException -> 0x015c }
        r1 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1));
        if (r1 != 0) goto L_0x0071;
    L_0x004d:
        r6 = com.whatsapp.App.T();	 Catch:{ IOException -> 0x015c }
        r1 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1));
        if (r1 != 0) goto L_0x0071;
    L_0x0055:
        r0 = z;
        r1 = 17;
        r0 = r0[r1];
        com.whatsapp.util.Log.e(r0);
        r0 = new android.content.Intent;
        r0.<init>();
        r1 = z;
        r6 = 24;
        r1 = r1[r6];
        r0 = r0.putExtra(r1, r2);
        r14.setResult(r3, r0);
        r0 = r2;
    L_0x0071:
        if (r0 != 0) goto L_0x009a;
    L_0x0073:
        r1 = r14.v;	 Catch:{ IOException -> 0x015e }
        if (r1 != 0) goto L_0x009a;
    L_0x0077:
        r1 = r14.i;	 Catch:{ IOException -> 0x0160 }
        if (r1 == r2) goto L_0x009a;
    L_0x007b:
        r1 = r14.i;	 Catch:{ IOException -> 0x0162 }
        if (r1 == 0) goto L_0x009a;
    L_0x007f:
        r1 = new android.media.ExifInterface;	 Catch:{ IOException -> 0x0164 }
        r3 = r5.getAbsolutePath();	 Catch:{ IOException -> 0x0164 }
        r1.<init>(r3);	 Catch:{ IOException -> 0x0164 }
        r3 = z;	 Catch:{ IOException -> 0x0164 }
        r5 = 19;
        r3 = r3[r5];	 Catch:{ IOException -> 0x0164 }
        r5 = r14.i;	 Catch:{ IOException -> 0x0164 }
        r5 = java.lang.Integer.toString(r5);	 Catch:{ IOException -> 0x0164 }
        r1.setAttribute(r3, r5);	 Catch:{ IOException -> 0x0164 }
        r1.saveAttributes();	 Catch:{ IOException -> 0x0164 }
    L_0x009a:
        if (r0 != 0) goto L_0x00c0;
    L_0x009c:
        r0 = new android.content.Intent;
        r0.<init>();
        r1 = r14.k;
        r0.setData(r1);
        r1 = new android.os.Bundle;
        r1.<init>();
        r2 = z;
        r3 = 20;
        r2 = r2[r3];
        r3 = r14.q;
        r3 = r3.c();
        r1.putParcelable(r2, r3);
        r0.putExtras(r1);
        r14.setResult(r10, r0);
    L_0x00c0:
        if (r4 == 0) goto L_0x00e1;
    L_0x00c2:
        r0 = new android.os.Bundle;
        r0.<init>();
        r1 = z;
        r2 = 25;
        r1 = r1[r2];
        r2 = r14.q;
        r2 = r2.c();
        r0.putParcelable(r1, r2);
        r1 = new android.content.Intent;
        r1.<init>();
        r1.putExtras(r0);
        r14.setResult(r10, r1);
    L_0x00e1:
        r15.recycle();
        r14.finish();
        return;
    L_0x00e8:
        r0 = move-exception;
        r6 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x014b }
        r6.<init>();	 Catch:{ IOException -> 0x014b }
        r7 = z;	 Catch:{ IOException -> 0x014b }
        r8 = 22;
        r7 = r7[r8];	 Catch:{ IOException -> 0x014b }
        r6 = r6.append(r7);	 Catch:{ IOException -> 0x014b }
        r7 = r14.k;	 Catch:{ IOException -> 0x014b }
        r6 = r6.append(r7);	 Catch:{ IOException -> 0x014b }
        r6 = r6.toString();	 Catch:{ IOException -> 0x014b }
        com.whatsapp.util.Log.b(r6, r0);	 Catch:{ IOException -> 0x014b }
        r6 = r0.getMessage();	 Catch:{ IOException -> 0x014b }
        if (r6 == 0) goto L_0x0131;
    L_0x010b:
        r0 = r0.getMessage();	 Catch:{ IOException -> 0x014b }
        r6 = z;	 Catch:{ IOException -> 0x014b }
        r7 = 18;
        r6 = r6[r7];	 Catch:{ IOException -> 0x014b }
        r0 = r0.contains(r6);	 Catch:{ IOException -> 0x014b }
        if (r0 == 0) goto L_0x0131;
    L_0x011b:
        r0 = 0;
        r6 = new android.content.Intent;	 Catch:{ IOException -> 0x014d }
        r6.<init>();	 Catch:{ IOException -> 0x014d }
        r7 = z;	 Catch:{ IOException -> 0x014d }
        r8 = 23;
        r7 = r7[r8];	 Catch:{ IOException -> 0x014d }
        r8 = 1;
        r6 = r6.putExtra(r7, r8);	 Catch:{ IOException -> 0x014d }
        r14.setResult(r0, r6);	 Catch:{ IOException -> 0x014d }
        if (r4 == 0) goto L_0x0145;
    L_0x0131:
        r0 = 0;
        r6 = new android.content.Intent;	 Catch:{ IOException -> 0x014f }
        r6.<init>();	 Catch:{ IOException -> 0x014f }
        r7 = z;	 Catch:{ IOException -> 0x014f }
        r8 = 16;
        r7 = r7[r8];	 Catch:{ IOException -> 0x014f }
        r8 = 1;
        r6 = r6.putExtra(r7, r8);	 Catch:{ IOException -> 0x014f }
        r14.setResult(r0, r6);	 Catch:{ IOException -> 0x014f }
    L_0x0145:
        com.whatsapp.util.ao.a(r1);
        r0 = r2;
        goto L_0x0045;
    L_0x014b:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x014d }
    L_0x014d:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x014f }
    L_0x014f:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0151 }
    L_0x0151:
        r0 = move-exception;
        com.whatsapp.util.ao.a(r1);
        throw r0;
    L_0x0156:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0158 }
    L_0x0158:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x015a }
    L_0x015a:
        r0 = move-exception;
        throw r0;
    L_0x015c:
        r0 = move-exception;
        throw r0;
    L_0x015e:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0160 }
    L_0x0160:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0162 }
    L_0x0162:
        r0 = move-exception;
        throw r0;
    L_0x0164:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = z;
        r5 = 21;
        r3 = r3[r5];
        r1 = r1.append(r3);
        r3 = r14.k;
        r1 = r1.append(r3);
        r1 = r1.toString();
        com.whatsapp.util.Log.b(r1, r0);
        r0 = r2;
        goto L_0x009a;
    L_0x0184:
        r0 = r3;
        goto L_0x0045;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wallpaper.CropImage.a(android.graphics.Bitmap):void");
    }
}
