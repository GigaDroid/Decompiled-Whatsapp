package com.whatsapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build.VERSION;
import android.support.annotation.NonNull;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import com.whatsapp.util.bm;
import org.v;
import org.whispersystems.G;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.aZ;
import org.whispersystems.at;
import org.whispersystems.bb;
import org.whispersystems.k;

final class a2r extends SQLiteOpenHelper {
    private static final String[] z;
    private final Context a;

    static {
        String[] strArr = new String[57];
        String str = "~Use*kA2m'";
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
                        i3 = 31;
                        break;
                    case at.g /*1*/:
                        i3 = 45;
                        break;
                    case at.i /*2*/:
                        i3 = 28;
                        break;
                    case at.o /*3*/:
                        i3 = 9;
                        break;
                    default:
                        i3 = 69;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    str = "\\\u007fYH\u0011Z\rHH\u0007Sh<d l^}n @O}z @Fype7rumeVcHL\u0002Z\u007f<Y\u0017V`][\u001c?fYPe^xHF\fQnNL\bZcH%er^{V.zTC{ rBhl\u001auDx)\u0011ZuH)\u000bPy<G\u0010Sa0)(lJCb frz{*rrqle]bSE\u0000^c<G\nK\rR\\\tS\u0001<d6xrwl<@Dx)\u0011ZuH)\u000bPy<G\u0010Sa0))~^hV$sD\u007fl\u001a}Lol\u001atHe)\u0007Sb^)\u000bPy<G\u0010Sa0)1v@yz1~@l)\fQyYN\u0000M\u0004";
                    obj = 1;
                    strArr2 = strArr3;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "\\\u007fYH\u0011Z\rIG\fNxY)\fQiYQerHoz$xHCk$lHCb frum=?bR)(z^oh\"zr~h6zrwl<?\u0005qz\"@Fyp\u001amHqf1zrv`!3\rqz\"@Fyp\u001ay_sd\u001arH0)(lJCb fruml";
                    obj = 2;
                    strArr2 = strArr3;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "^aHL\u0017?y]K\tZ\rol6lDsg6?lXMe\\bP\\\bQ\rh`(z^hh(o\rUG\u0011ZjY[";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "kDql6kLqy";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "lHoz,pCo";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\\\u007fYH\u0011Z\rIG\fNxY)\fQiYQeVk<G\nK\rYQ\fLyO)6zCxl7@Fyp6@DxqePc<z qIy{\u001atHeze7Jnf0orumi?^yg!z_C`!6";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\\\u007fYH\u0011Z\rHH\u0007Sh<z qIy{\u001atHeze7rumeVcHL\u0002Z\u007f<Y\u0017V`][\u001c?fYPe^xHF\fQnNL\bZcH%ex_s|5@Dx)\u0011ZuH)\u000bPy<G\u0010Sa0)6zCxl7@Dx)\fQyYN\u0000M\rRF\u0011?cIE\t3\rnl&p_x)\u0007Sb^)\u000bPy<G\u0010Sa5";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    str = "\\\u007fYH\u0011Z\rHH\u0007Sh<`!zCh`1vHo)m@Dx)\fQyYN\u0000M\rL[\fRlNPeThE)\u0004JyS@\u000b\\\u007fYD\u0000Qy0)7zNuy,zChV,{\rUG\u0011ZjY[eJcUX\u0010Z\u0001<{ xDo}7~Yuf+@Dx)\fQyYN\u0000M\u0001<y0}Auj\u001atHe)\u0007Sb^%eo_u\u007f$kHCb f\r^E\n]\u0001<g gYCy7zFyp\u001avI<@\u000bKh[L\u00173\rh`(z^hh(o\rUG\u0011ZjY[l";
                    obj = 8;
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    strArr2 = strArr3;
                    str = "qHd}\u001ao_yb frum";
                    obj = 9;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "~Use*kA<`+lHn} {\ro`\"qHx)5mHwl<";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "~Use*kA<n qHnh1zI<;u/\rl{ ?Fyp6";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "kDql6kLqy";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "o_yb frum";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\\\u007fYH\u0011Z\rHH\u0007Sh<y7zFyp6?\u0005C`!?dR]\u0000XhN)\u0015MdQH\u0017F\rWL\u001c?lI]\nVc_[\u0000RhR]i?]nl.zTC`!?dR]\u0000XhN)\u0010QdM\\\u00003\rol+krhf\u001alHn\u007f m\r^F\nSh]Gi?_yj*mI<K\tPo5";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\\\u007fYH\u0011Z\rIG\fNxY)\fQiYQerHoz$xHCk$lHCb frum=?bR)(z^oh\"zr~h6zrwl<?\u0005qz\"@Fyp\u001amHqf1zrv`!3\rqz\"@Fyp\u001ay_sd\u001arH0)(lJCb fruml";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\\\u007fYH\u0011Z\rHH\u0007Sh<z,xCym\u001ao_yb f^<!\u001avI<@\u000bKh[L\u0017?}N@\b^\u007fE)\u000eZt<H\u0010KbUG\u0006MhQL\u000bK\u0001<y7zFyp\u001avI<@\u000bKh[L\u0017?xR@\u0014Jh0)1v@yz1~@l)\fQyYN\u0000M\u0001<{ |Bnme]aSKl";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "kDql6kLqy";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\\\u007fYH\u0011Z\rIG\fNxY)\fQiYQelHrm mrwl<lrum=?bR)6zCxl7@Fyp6?\u0005{{*j]C`!3\rol+{HnV,{\u0004";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "~Use*kA<`+lHn} {\rum qYu}<?FypeoLu{";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "mH{`6k_}},pCC`!";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "mH\u007f`5vHr}\u001avI";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "lD{g {rl{ tHez";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "\\\u007fYH\u0011Z\rHH\u0007Sh<z l^uf+l\r4V,{\rUG\u0011ZjY[eO\u007fUD\u0004Mt<B\u0000F\r]\\\u0011PdRJ\u0017Z`YG\u00113\rnl&v]ul+krumeVcHL\u0002Z\u007f<\\\u000bV|ILi?_yj*mI<K\tPo0)1v@yz1~@l)\fQyYN\u0000M\u0004";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "oX~e,|rwl<";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "mH\u007ff7{";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "vIyg1vYul6";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    str = "|_yh1vC{)$gBpf1s\rxh1~O}z ?[y{6vBr)s";
                    obj = 27;
                    i = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    strArr2 = strArr3;
                    str = "\\\u007fYH\u0011Z\rHH\u0007Sh<d l^}n @O}z @Fype7rumeVcHL\u0002Z\u007f<Y\u0017V`][\u001c?fYPe^xHF\fQnNL\bZcH%er^{V.zTC{ rBhl\u001auDx)\u0011ZuH)\u000bPy<G\u0010Sa0)(lJCb frz{*rrqle]bSE\u0000^c<G\nK\rR\\\tS\u0001<d6xrwl<@Dx)\u0011ZuH)\u000bPy<G\u0010Sa0))~^hV$sD\u007fl\u001a}Lol\u001atHe)\u0007Sb^)\u000bPy<G\u0010Sa0)1v@yz1~@l)\fQyYN\u0000M\u0004";
                    obj = 28;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "|_yh1zI<h=pAs})?I}}$}LoleiHnz,pC<?";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    str = "o_u\u007f$kHCb f";
                    obj = 30;
                    i = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    strArr2 = strArr3;
                    str = "yLue {\rhfep]yge~Use*kA<z1p_y";
                    obj = 31;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "mH\u007f`5vHr}\u001avI<4e ";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "~Use*kA<n qHnh1vC{)w/\u001d<g h\rl{ tHeze~Cx)7zNs{!zI<}-z@<`+?Ytle{O";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "o_yb f^";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "o_yb frum";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "lHr}\u001akBCz m[y{";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "vIyg1vYul6";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "qHd}\u001ao_yb frum";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "qHd}\u001ao_yb frum";
                    obj = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "RDoz,qJ<l+k_e)#p_<z sK<`+?Dxl+kDh` l\rhh'sH";
                    obj = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "~Use*kA<n qHnh1vC{)5mHwl<?O}}&w\ro}$mYug\"?Knf(?";
                    obj = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "mH\u007f`5vHr}\u001avI<4e ";
                    obj = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "mH\u007ff7{";
                    obj = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    str = "vIyg1vYul6";
                    obj = 44;
                    i = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    strArr2 = strArr3;
                    str = "~Use*kA<n qHnh1zI<;u/\rrl2?]nl.zTo)$qI<{ |Bnm {\rha r\rugekEy)!}";
                    obj = 45;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "JCwg*hC<|5x_}m ?Knf(?";
                    obj = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "?Ys)";
                    obj = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "?Ys)";
                    obj = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "~Use*kA<|5x_}m,qJ<m'?Knf(?";
                    obj = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "?\u0000\")";
                    obj = 50;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "~Use*kA<|5x_}m {\ro|&|Hoz#jApp";
                    obj = 51;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "JCwg*hC<|5x_}m ?Iyz1vC}},pC<\u007f m^uf+%\r";
                    obj = 52;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "[\u007fSYeKl^E\u0000?dZ)\u0000GdO]\u0016?^yg!z_Cb f^";
                    obj = 53;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "\\\u007fYH\u0011Z\rIG\fNxY)\fQiYQelHrm mrwl<lrum=?bR)6zCxl7@Fyp6?\u0005{{*j]C`!3\rol+{HnV,{\u0004";
                    obj = 54;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "\\\u007fYH\u0011Z\rHH\u0007Sh<z qIy{\u001atHeze7rumeVcHL\u0002Z\u007f<Y\u0017V`][\u001c?fYPe^xHF\fQnNL\bZcH%ex_s|5@Dx)\u0011ZuH)\u000bPy<G\u0010Sa0)6zCxl7@Dx)\fQyYN\u0000M\rRF\u0011?cIE\t3\rnl&p_x)\u0007Sb^)\u000bPy<G\u0010Sa5";
                    obj = 55;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "yLue {\rhfep]yge~Use*kA<z1p_y";
                    obj = null;
                    break;
            }
        }
    }

    private void d(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(z[2]);
        sQLiteDatabase.execSQL(z[3]);
    }

    public a2r(@NonNull Context context) {
        super(context, z[0], null, 6);
        this.a = (Context) auv.a((Object) context);
        if (VERSION.SDK_INT >= 16) {
            try {
                if (!bm.a()) {
                    setWriteAheadLoggingEnabled(true);
                }
            } catch (RuntimeException e) {
                throw e;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(android.database.sqlite.SQLiteDatabase r13) {
        /*
        r12 = this;
        r11 = 0;
        r9 = 1;
        r8 = 0;
        r10 = com.whatsapp.awc.g;
        r13.beginTransaction();
        r0 = z;	 Catch:{ all -> 0x004a }
        r1 = 38;
        r1 = r0[r1];	 Catch:{ all -> 0x004a }
        r0 = 1;
        r2 = new java.lang.String[r0];	 Catch:{ all -> 0x004a }
        r0 = 0;
        r3 = z;	 Catch:{ all -> 0x004a }
        r4 = 40;
        r3 = r3[r4];	 Catch:{ all -> 0x004a }
        r2[r0] = r3;	 Catch:{ all -> 0x004a }
        r0 = z;	 Catch:{ all -> 0x004a }
        r3 = 43;
        r3 = r0[r3];	 Catch:{ all -> 0x004a }
        r0 = 1;
        r4 = new java.lang.String[r0];	 Catch:{ all -> 0x004a }
        r0 = 0;
        r5 = -1;
        r5 = java.lang.String.valueOf(r5);	 Catch:{ all -> 0x004a }
        r4[r0] = r5;	 Catch:{ all -> 0x004a }
        r5 = 0;
        r6 = 0;
        r7 = 0;
        r0 = r13;
        r0 = r0.query(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ all -> 0x004a }
        r1 = r0.moveToNext();	 Catch:{ RuntimeException -> 0x0048 }
        if (r1 != 0) goto L_0x004f;
    L_0x0039:
        r0.close();	 Catch:{ RuntimeException -> 0x0048 }
        r0 = new android.database.sqlite.SQLiteException;	 Catch:{ RuntimeException -> 0x0048 }
        r1 = z;	 Catch:{ RuntimeException -> 0x0048 }
        r2 = 41;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x0048 }
        r0.<init>(r1);	 Catch:{ RuntimeException -> 0x0048 }
        throw r0;	 Catch:{ RuntimeException -> 0x0048 }
    L_0x0048:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x004a }
    L_0x004a:
        r0 = move-exception;
        r13.endTransaction();
        throw r0;
    L_0x004f:
        r1 = 0;
        r1 = r0.getInt(r1);	 Catch:{ all -> 0x004a }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x004a }
        r2.<init>();	 Catch:{ all -> 0x004a }
        r3 = z;	 Catch:{ all -> 0x004a }
        r4 = 42;
        r3 = r3[r4];	 Catch:{ all -> 0x004a }
        r2 = r2.append(r3);	 Catch:{ all -> 0x004a }
        r2 = r2.append(r1);	 Catch:{ all -> 0x004a }
        r2 = r2.toString();	 Catch:{ all -> 0x004a }
        com.whatsapp.util.Log.i(r2);	 Catch:{ all -> 0x004a }
        r0.close();	 Catch:{ all -> 0x004a }
        r0 = new android.content.ContentValues;	 Catch:{ all -> 0x004a }
        r0.<init>();	 Catch:{ all -> 0x004a }
        r2 = z;	 Catch:{ all -> 0x004a }
        r3 = 39;
        r2 = r2[r3];	 Catch:{ all -> 0x004a }
        r3 = r1 + 200;
        r4 = org.whispersystems.G.a;	 Catch:{ all -> 0x004a }
        r4 = r4 + -1;
        r3 = r3 % r4;
        r3 = r3 + 1;
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ all -> 0x004a }
        r0.put(r2, r3);	 Catch:{ all -> 0x004a }
        r2 = z;	 Catch:{ all -> 0x004a }
        r3 = 45;
        r2 = r2[r3];	 Catch:{ all -> 0x004a }
        r3 = z;	 Catch:{ all -> 0x004a }
        r4 = 33;
        r3 = r3[r4];	 Catch:{ all -> 0x004a }
        r4 = 1;
        r4 = new java.lang.String[r4];	 Catch:{ all -> 0x004a }
        r5 = 0;
        r6 = -1;
        r6 = java.lang.String.valueOf(r6);	 Catch:{ all -> 0x004a }
        r4[r5] = r6;	 Catch:{ all -> 0x004a }
        r13.update(r2, r0, r3, r4);	 Catch:{ all -> 0x004a }
        r13.setTransactionSuccessful();	 Catch:{ all -> 0x004a }
        r13.endTransaction();
        r0 = z;
        r2 = 34;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        r0 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r0 = org.whispersystems.bb.a(r1, r0);
        r1 = new android.content.ContentValues;
        r1.<init>();
        r2 = r0.iterator();
    L_0x00c4:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x0109;
    L_0x00ca:
        r0 = r2.next();
        r0 = (org.whispersystems.b5) r0;
        r1.clear();
        r3 = z;
        r4 = 36;
        r3 = r3[r4];
        r4 = r0.b();
        r4 = java.lang.Integer.valueOf(r4);
        r1.put(r3, r4);
        r3 = z;
        r4 = 44;
        r3 = r3[r4];
        r0 = r0.a();
        r1.put(r3, r0);
        r0 = z;
        r3 = 37;
        r0 = r0[r3];
        r3 = java.lang.Boolean.valueOf(r8);
        r1.put(r0, r3);
        r0 = z;
        r3 = 35;
        r0 = r0[r3];
        r13.insertOrThrow(r0, r11, r1);
        if (r10 == 0) goto L_0x00c4;
    L_0x0109:
        r0 = z;	 Catch:{ RuntimeException -> 0x011c }
        r1 = 46;
        r0 = r0[r1];	 Catch:{ RuntimeException -> 0x011c }
        com.whatsapp.util.Log.i(r0);	 Catch:{ RuntimeException -> 0x011c }
        r0 = com.whatsapp.WAAppCompatActivity.c;	 Catch:{ RuntimeException -> 0x011c }
        if (r0 == 0) goto L_0x011b;
    L_0x0116:
        if (r10 == 0) goto L_0x0120;
    L_0x0118:
        r0 = r8;
    L_0x0119:
        com.whatsapp.awc.g = r0;
    L_0x011b:
        return;
    L_0x011c:
        r0 = move-exception;
        throw r0;	 Catch:{ RuntimeException -> 0x011e }
    L_0x011e:
        r0 = move-exception;
        throw r0;
    L_0x0120:
        r0 = r9;
        goto L_0x0119;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a2r.c(android.database.sqlite.SQLiteDatabase):void");
    }

    private void b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(z[7]);
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(z[54]);
        sQLiteDatabase.execSQL(z[56]);
        sQLiteDatabase.execSQL(z[55]);
    }

    private void a(SQLiteDatabase sQLiteDatabase, long j) {
        sQLiteDatabase.execSQL(z[4]);
        ContentValues contentValues = new ContentValues();
        contentValues.put(z[5], Long.valueOf(j));
        sQLiteDatabase.update(z[6], contentValues, null, null);
    }

    public SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (Throwable e) {
            Log.b(z[1], e);
            awc.a(this.a).e();
            return super.getWritableDatabase();
        }
    }

    public SQLiteDatabase getReadableDatabase() {
        try {
            return super.getReadableDatabase();
        } catch (Throwable e) {
            Log.b(z[32], e);
            awc.a(this.a).e();
            return super.getReadableDatabase();
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
                } catch (RuntimeException e) {
                    throw e;
                }
            }
        } catch (RuntimeException e2) {
            throw e2;
        } catch (RuntimeException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r5, int r6, int r7) {
        /*
        r4 = this;
        r0 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x0056 }
        r0.<init>();	 Catch:{ RuntimeException -> 0x0056 }
        r1 = z;	 Catch:{ RuntimeException -> 0x0056 }
        r2 = 50;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x0056 }
        r0 = r0.append(r1);	 Catch:{ RuntimeException -> 0x0056 }
        r0 = r0.append(r6);	 Catch:{ RuntimeException -> 0x0056 }
        r1 = z;	 Catch:{ RuntimeException -> 0x0056 }
        r2 = 48;
        r1 = r1[r2];	 Catch:{ RuntimeException -> 0x0056 }
        r0 = r0.append(r1);	 Catch:{ RuntimeException -> 0x0056 }
        r0 = r0.append(r7);	 Catch:{ RuntimeException -> 0x0056 }
        r0 = r0.toString();	 Catch:{ RuntimeException -> 0x0056 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ RuntimeException -> 0x0056 }
        r0 = 6;
        if (r7 == r0) goto L_0x0058;
    L_0x002b:
        r0 = new android.database.sqlite.SQLiteException;	 Catch:{ RuntimeException -> 0x0056 }
        r1 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x0056 }
        r1.<init>();	 Catch:{ RuntimeException -> 0x0056 }
        r2 = z;	 Catch:{ RuntimeException -> 0x0056 }
        r3 = 53;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x0056 }
        r1 = r1.append(r2);	 Catch:{ RuntimeException -> 0x0056 }
        r1 = r1.append(r6);	 Catch:{ RuntimeException -> 0x0056 }
        r2 = z;	 Catch:{ RuntimeException -> 0x0056 }
        r3 = 51;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x0056 }
        r1 = r1.append(r2);	 Catch:{ RuntimeException -> 0x0056 }
        r1 = r1.append(r7);	 Catch:{ RuntimeException -> 0x0056 }
        r1 = r1.toString();	 Catch:{ RuntimeException -> 0x0056 }
        r0.<init>(r1);	 Catch:{ RuntimeException -> 0x0056 }
        throw r0;	 Catch:{ RuntimeException -> 0x0056 }
    L_0x0056:
        r0 = move-exception;
        throw r0;
    L_0x0058:
        r0 = java.lang.System.currentTimeMillis();
        r2 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0 = r0 / r2;
        switch(r6) {
            case 1: goto L_0x008f;
            case 2: goto L_0x0092;
            case 3: goto L_0x0095;
            case 4: goto L_0x0095;
            case 5: goto L_0x0098;
            default: goto L_0x0062;
        };
    L_0x0062:
        r0 = new android.database.sqlite.SQLiteException;	 Catch:{ RuntimeException -> 0x008d }
        r1 = new java.lang.StringBuilder;	 Catch:{ RuntimeException -> 0x008d }
        r1.<init>();	 Catch:{ RuntimeException -> 0x008d }
        r2 = z;	 Catch:{ RuntimeException -> 0x008d }
        r3 = 47;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x008d }
        r1 = r1.append(r2);	 Catch:{ RuntimeException -> 0x008d }
        r1 = r1.append(r6);	 Catch:{ RuntimeException -> 0x008d }
        r2 = z;	 Catch:{ RuntimeException -> 0x008d }
        r3 = 49;
        r2 = r2[r3];	 Catch:{ RuntimeException -> 0x008d }
        r1 = r1.append(r2);	 Catch:{ RuntimeException -> 0x008d }
        r1 = r1.append(r7);	 Catch:{ RuntimeException -> 0x008d }
        r1 = r1.toString();	 Catch:{ RuntimeException -> 0x008d }
        r0.<init>(r1);	 Catch:{ RuntimeException -> 0x008d }
        throw r0;	 Catch:{ RuntimeException -> 0x008d }
    L_0x008d:
        r0 = move-exception;
        throw r0;
    L_0x008f:
        r4.a(r5, r0);	 Catch:{ RuntimeException -> 0x00a9 }
    L_0x0092:
        r4.d(r5);
    L_0x0095:
        r4.a(r5);
    L_0x0098:
        r4.b(r5);	 Catch:{ RuntimeException -> 0x008d }
        r0 = com.whatsapp.awc.g;	 Catch:{ RuntimeException -> 0x008d }
        if (r0 != 0) goto L_0x0062;
    L_0x009f:
        r0 = z;
        r1 = 52;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        return;
    L_0x00a9:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a2r.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        boolean z = awc.g;
        Log.i(z[28]);
        sQLiteDatabase.execSQL(z[9]);
        sQLiteDatabase.execSQL(z[15]);
        sQLiteDatabase.execSQL(z[24]);
        sQLiteDatabase.execSQL(z[17]);
        sQLiteDatabase.execSQL(z[29]);
        sQLiteDatabase.execSQL(z[16]);
        sQLiteDatabase.execSQL(z[8]);
        sQLiteDatabase.execSQL(z[19]);
        Log.i(z[30]);
        k b = bb.b();
        ContentValues contentValues = new ContentValues();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        contentValues.put(z[22], Integer.valueOf(-1));
        contentValues.put(z[21], Integer.valueOf(bb.a(true)));
        contentValues.put(z[25], b.b().b());
        contentValues.put(z[31], b.a().b());
        contentValues.put(z[10], Integer.valueOf(bb.a(G.a - 1) + 1));
        contentValues.put(z[13], Long.valueOf(currentTimeMillis));
        sQLiteDatabase.insertOrThrow(z[27], null, contentValues);
        Log.i(z[20]);
        try {
            aZ a = bb.a(b, 0);
            contentValues = new ContentValues();
            contentValues.put(z[14], Integer.valueOf(0));
            contentValues.put(z[18], Long.valueOf(currentTimeMillis));
            contentValues.put(z[26], a.a());
            sQLiteDatabase.insertOrThrow(z[23], null, contentValues);
            Log.i(z[11]);
            c(sQLiteDatabase);
            Log.i(z[12]);
            if (z) {
                WAAppCompatActivity.c++;
            }
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
