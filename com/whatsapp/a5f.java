package com.whatsapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.os.Build.VERSION;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import com.whatsapp.util.bm;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

final class a5f extends SQLiteOpenHelper {
    @SuppressLint({"InlinedApi"})
    private static final int a;
    private static final String[] z;
    private boolean b;
    private SQLiteDatabase c;
    private boolean d;
    private boolean e;

    static boolean b(a5f com_whatsapp_a5f) {
        return com_whatsapp_a5f.a();
    }

    public synchronized SQLiteDatabase getReadableDatabase() {
        return getWritableDatabase();
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        boolean z = true;
        boolean z2 = l5.s;
        Log.i(z[arj.Theme_ratingBarStyle]);
        sQLiteDatabase.execSQL(z[124]);
        sQLiteDatabase.execSQL(z[112]);
        sQLiteDatabase.execSQL(z[129]);
        sQLiteDatabase.execSQL(z[133]);
        sQLiteDatabase.execSQL(z[132]);
        sQLiteDatabase.execSQL(z[110]);
        sQLiteDatabase.execSQL(z[arj.Theme_spinnerStyle]);
        sQLiteDatabase.execSQL(z[117]);
        sQLiteDatabase.execSQL(z[114]);
        try {
            sQLiteDatabase.execSQL(z[120]);
            sQLiteDatabase.execSQL(z[100]);
            sQLiteDatabase.execSQL(z[113]);
            sQLiteDatabase.execSQL(z[arj.Theme_seekBarStyle]);
            if (ael.z()) {
                sQLiteDatabase.execSQL(z[121]);
                sQLiteDatabase.execSQL(z[123]);
                sQLiteDatabase.execSQL(z[122]);
                sQLiteDatabase.execSQL(z[arj.Theme_checkboxStyle]);
                sQLiteDatabase.execSQL(z[119]);
            }
            try {
                sQLiteDatabase.execSQL(z[125]);
                sQLiteDatabase.execSQL(z[115]);
                sQLiteDatabase.execSQL(z[arj.Theme_buttonStyleSmall]);
                sQLiteDatabase.execSQL(z[127]);
                sQLiteDatabase.execSQL(z[111]);
                sQLiteDatabase.execSQL(z[arj.Theme_editTextStyle]);
                sQLiteDatabase.execSQL(z[arj.Theme_switchStyle]);
                sQLiteDatabase.execSQL(z[135]);
                sQLiteDatabase.execSQL(z[116]);
                sQLiteDatabase.execSQL(z[118]);
                sQLiteDatabase.execSQL(z[126]);
                sQLiteDatabase.execSQL(z[130]);
                sQLiteDatabase.execSQL(z[131]);
                sQLiteDatabase.execSQL(z[99]);
                sQLiteDatabase.execSQL(z[arj.Theme_checkedTextViewStyle]);
                sQLiteDatabase.execSQL(z[134]);
                sQLiteDatabase.execSQL(z[128]);
                sQLiteDatabase.execSQL(z[98]);
                sQLiteDatabase.execSQL(z[arj.Theme_radioButtonStyle]);
                sQLiteDatabase.setVersion(1);
                if (WAAppCompatActivity.c != 0) {
                    if (z2) {
                        z = false;
                    }
                    l5.s = z;
                }
            } catch (SQLiteDiskIOException e) {
                throw e;
            } catch (SQLiteDiskIOException e2) {
                throw e2;
            }
        } catch (SQLiteDiskIOException e22) {
            throw e22;
        }
    }

    static {
        int i = 0;
        String[] strArr = new String[155];
        String str = "~\u0002\u0014?kn\u0003";
        int i2 = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i3 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i4 = 0; length > i4; i4++) {
                int i5;
                char c = cArr[i4];
                switch (i4 % 5) {
                    case v.m /*0*/:
                        i5 = 13;
                        break;
                    case at.g /*1*/:
                        i5 = 119;
                        break;
                    case at.i /*2*/:
                        i5 = 118;
                        break;
                    case at.o /*3*/:
                        i5 = 85;
                        break;
                    default:
                        i5 = 14;
                        break;
                }
                cArr[i4] = (char) (i5 ^ c);
            }
            str = new String(cArr).intern();
            switch (i2) {
                case v.m /*0*/:
                    strArr2[i3] = str;
                    i3 = 2;
                    str = "n\u001f\u0017!Qa\u001e\u0005!";
                    i2 = 1;
                    strArr2 = strArr3;
                    break;
                case at.g /*1*/:
                    strArr2[i3] = str;
                    i3 = 3;
                    str = "b\u0005\u001f2gc";
                    i2 = 2;
                    strArr2 = strArr3;
                    break;
                case at.i /*2*/:
                    strArr2[i3] = str;
                    i3 = 4;
                    str = "D9\"\u0010IH%";
                    i2 = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i3] = str;
                    i3 = 5;
                    str = "`\u0012\u0012<oR\u0014\u0017%zd\u0018\u0018";
                    i2 = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i3] = str;
                    i3 = 6;
                    str = "}\u001b\u0017<`y\u0012\u000e!Qi\u001e\u00054la\u0012\u0012";
                    i2 = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i3] = str;
                    i3 = 7;
                    str = "`\u0012\u0005&oj\u0012\u0005";
                    i2 = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i3] = str;
                    i3 = 8;
                    str = "n\u001f\u0017!Qa\u001e\u0005!";
                    i2 = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i3] = str;
                    i3 = 9;
                    str = "`\u0012\u0005&oj\u0012\u0005";
                    i2 = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i3] = str;
                    i3 = 10;
                    str = "n\u001f\u0017!Qa\u001e\u0005!";
                    i2 = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i3] = str;
                    i3 = 11;
                    str = "`\u0012\u0012<oR\u0003\u000f%kR\u001e\u00181ku";
                    i2 = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i3] = str;
                    i3 = 12;
                    str = "`\u0004\u0011&zb\u0005\u0013zih\u0003\u0001'gy\u0016\u00149ki\u0015Y9g~\u0003V";
                    i2 = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i3] = str;
                    str = "Y2.\u0001";
                    i2 = 12;
                    i3 = 13;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i3] = str;
                    str = "\u007f\u0016\u0001\njl\u0003\u0017";
                    i3 = 14;
                    strArr2 = strArr3;
                    i2 = 13;
                    break;
                case Y.q /*13*/:
                    strArr2[i3] = str;
                    i3 = 15;
                    strArr2 = strArr3;
                    str = "Y2.\u0001";
                    i2 = 14;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i3] = str;
                    str = "`\u0012\u0012<oR\u0005\u00133}";
                    i2 = 15;
                    i3 = 16;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i3] = str;
                    i3 = 17;
                    strArr2 = strArr3;
                    str = "_27\u0019";
                    i2 = 16;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i3] = str;
                    i3 = 18;
                    str = "D9\"\u0010IH%";
                    i2 = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i3] = str;
                    i3 = 19;
                    str = "}\u0005\u0019%}";
                    i2 = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i3] = str;
                    i3 = 20;
                    str = "D9\"\u0010IH%";
                    i2 = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i3] = str;
                    i3 = 21;
                    str = "~\u0012\u0018!Q~\u0012\u00181k\u007f(\u001d0w";
                    i2 = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i3] = str;
                    i3 = 22;
                    str = "`\u0004\u0011&zb\u0005\u0013zih\u0003\u0001'gy\u0016\u00149ki\u0015Y1ac\u0012Y9g~\u0003V";
                    i2 = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i3] = str;
                    i3 = 23;
                    str = "`\u0004\u0011&zb\u0005\u0013zih\u0003\u0001'gy\u0016\u00149ki\u0015V<}-\u0005\u00134j-\u0018\u00189w";
                    i2 = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i3] = str;
                    i3 = 24;
                    str = "N%3\u0014ZHW\"\u0007GJ03\u0007.D1V\u001bAYW3\rG^#%uch\u0004\u00054ih\u0004)7jR\u0011\u0019'Q\u007f\u0012\u00150g}\u0003\u0005\nz\u007f\u001e\u00112k\u007fW4\u0010HB%3uJH;3\u0001K-88uch\u0004\u00054ih\u0004V\u0017KJ>8uJH;3\u0001K-1$\u001aC-\u0005\u00136kd\u0007\u0002&.Z?3\u0007K-\u001c\u0013,Q\u007f\u0012\u001b:zh(\u001c<j0\u0018\u001a1 f\u0012\u000f\n|h\u001a\u0019!kR\u001d\u001f1.L92ueh\u000e)<j0\u0018\u001a1 f\u0012\u000f\ngiLV\u0010@I";
                    i2 = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i3] = str;
                    i3 = 25;
                    str = "`\u0004\u0011&zb\u0005\u0013zih\u0003\u0001'gy\u0016\u00149ki\u0015Y1ac\u0012Y9g~\u0003V";
                    i2 = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i3] = str;
                    i3 = 26;
                    str = "N%3\u0014ZHW?\u001bJH/V2|b\u0002\u0006\n~l\u0005\u0002<md\u0007\u0017;z~(\u001e<}y\u0018\u0004,Qd\u0019\u00120v-\u0018\u0018ui\u007f\u0018\u0003%Q}\u0016\u0004!gn\u001e\u00064`y\u0004)=g~\u0003\u0019'w-_\u0011?gi^";
                    i2 = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i3] = str;
                    i3 = 27;
                    str = "N%3\u0014ZHW\"\u0014LA2V%|b\u0007\u0005u&R\u001e\u0012uGC#3\u0012K_W&\u0007G@6$\f.F2/uOX#9\u001c@N%3\u0018KC#Zueh\u000eV\u0001KU#V\u0000@D&#\u0010\"-\u0001\u00179{hW\"\u0010VY^";
                    i2 = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i3] = str;
                    i3 = 28;
                    str = "l\u0005\u0015=g{\u0012\u0012";
                    i2 = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i3] = str;
                    i3 = 29;
                    str = "}\u0016\u0004!gn\u001e\u00064`y(\u001e4}e";
                    i2 = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i3] = str;
                    i3 = 30;
                    str = "n\u001f\u0017!Qa\u001e\u0005!";
                    i2 = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i3] = str;
                    i3 = 31;
                    str = "N%3\u0014ZHW \u001c\\Y\"7\u0019.Y64\u0019K-\u001a\u0013&}l\u0010\u0013&Qk\u0003\u0005u[^>8\u0012.K#%f&$";
                    i2 = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i3] = str;
                    i3 = 32;
                    str = "D9\"\u0010IH%";
                    i2 = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i3] = str;
                    i3 = 33;
                    str = "D9\"\u0010IH%";
                    i2 = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i3] = str;
                    i3 = 34;
                    str = "`\u0012\u0012<oR\u001f\u0017&fR\u001e\u00181ku";
                    i2 = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i3] = str;
                    i3 = 35;
                    str = "`\u0012\u0012<oR\u001f\u0017&f";
                    i2 = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i3] = str;
                    i3 = 36;
                    str = "\u007f\u0012\u0015<~d\u0012\u0018!Qn\u0018\u0003;z";
                    i2 = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i3] = str;
                    i3 = 37;
                    str = "D9\"\u0010IH%";
                    i2 = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i3] = str;
                    i3 = 38;
                    str = "`\u0018\u0012\nzl\u0010";
                    i2 = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i3] = str;
                    i3 = 39;
                    str = "N%3\u0014ZHW\"\u0014LA2V'kn\u0012\u001f%z~W^\ngiW?\u001bZH03\u0007.]%?\u0018O_.V\u001eKTW7\u0000ZB>8\u0016\\H:3\u001bZ!W\u001d0wR\u0005\u00138ay\u0012)?giW\"\u0010VYW8\u001aZ-9#\u0019B!W\u001d0wR\u001e\u0012uZH/\"u@B#V\u001b[A;Zu|h\u001a\u0019!kR\u0005\u0013&ax\u0005\u00150.Y2.\u0001\"-\u0005\u00136kd\u0007\u0002\njh\u0001\u001f6kR\u0003\u001f8k~\u0003\u00178~->8\u0001KJ2$y.\u007f\u0012\u00171Qi\u0012\u0000<mh(\u0002<ch\u0004\u00024c}W?\u001bZH03\u0007\"-\u0007\u001a4wh\u0013)1k{\u001e\u00150Qy\u001e\u001b0}y\u0016\u001b%.D9\"\u0010IH%_";
                    i2 = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i3] = str;
                    i3 = 40;
                    str = "D9\"\u0010IH%";
                    i2 = 39;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i3] = str;
                    i3 = 41;
                    str = "N%3\u0014ZHW\"\u0014LA2V8ki\u001e\u0017\n|h\u0011\u0005u&R\u001e\u0012uGC#3\u0012K_W&\u0007G@6$\f.F2/uOX#9\u001c@N%3\u0018KC#Zu~l\u0003\u001euZH/\"u[C>'\u0000K!W\u00040hR\u0014\u0019 `yW?\u001bZH03\u0007'";
                    i2 = 40;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i3] = str;
                    i3 = 42;
                    str = "`\u0004\u0011&zb\u0005\u0013zih\u0003\u0001'gy\u0016\u00149ki\u0015Y:`b\u0007\u0013;";
                    i2 = 41;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i3] = str;
                    i3 = 43;
                    str = "D9\"\u0010IH%";
                    i2 = 42;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i3] = str;
                    i3 = 44;
                    str = "~\u0018\u0004!Qy\u001e\u001b0}y\u0016\u001b%";
                    i2 = 43;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i3] = str;
                    i3 = 45;
                    str = "`\u0012\u0005&oj\u0012\u0005";
                    i2 = 44;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i3] = str;
                    i3 = 46;
                    str = "Y2.\u0001";
                    i2 = 45;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i3] = str;
                    i3 = 47;
                    str = "D9\"\u0010IH%";
                    i2 = 46;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i3] = str;
                    i3 = 48;
                    str = "O89\u0019KL9";
                    i2 = 47;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i3] = str;
                    i3 = 49;
                    str = "N%3\u0014ZHW\"\u0007GJ03\u0007.`\u0012\u0005&oj\u0012\u0005\nli(\u0002'gj\u0010\u0013'.O20\u001a\\HW2\u0010BH#3uACW\u001b0}~\u0016\u00110}-53\u0012GCW2\u0010BH#3uH_8;uch\u0004\u00054ih\u0004)3z~W!\u001dK_2V1an\u001e\u0012haa\u0013X\ngiLV\u0010@I";
                    i2 = 48;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i3] = str;
                    i3 = 50;
                    str = "`\u0012\u0005&oj\u0012\u0005";
                    i2 = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i3] = str;
                    i3 = 51;
                    str = "a\u0016\u0005!Q\u007f\u0012\u00171Q\u007f\u0012\u00150g}\u0003)&kc\u0003)8k~\u0004\u00172kR\u0003\u00177bh(\u001f1";
                    i2 = 50;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i3] = str;
                    i3 = 52;
                    str = "j\u0012\u0018";
                    i2 = 51;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i3] = str;
                    i3 = 53;
                    str = "j\u0005\u0019 ~R\u0007\u0017'zd\u0014\u001f%oc\u0003\u0005\nfd\u0004\u0002:|t";
                    i2 = 52;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i3] = str;
                    i3 = 54;
                    str = "D9\"\u0010IH%";
                    i2 = 53;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i3] = str;
                    i3 = 55;
                    str = "n\u001f\u0017!Qa\u001e\u0005!";
                    i2 = 54;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i3] = str;
                    i3 = 56;
                    str = "j\u0005\u0019 ~R\u0007\u0017'zd\u0014\u001f%oc\u0003\u0005";
                    i2 = 55;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i3] = str;
                    i3 = 57;
                    str = "N%3\u0014ZHW#\u001bG\\\"3uGC33\r.j\u0005\u0019 ~R\u0007\u0017'zd\u0014\u001f%oc\u0003\u0005\ngc\u0013\u0013-.b\u0019V2|b\u0002\u0006\n~l\u0005\u0002<md\u0007\u0017;z~W^2dd\u0013Zudd\u0013_";
                    i2 = 56;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i3] = str;
                    i3 = 58;
                    str = "`\u0012\u0012<oR\u0003\u000f%kR\u001d\u001f1Qd\u0019\u00120v";
                    i2 = 57;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i3] = str;
                    i3 = 59;
                    str = "`\u0012\u0005&oj\u0012\u0005";
                    i2 = 58;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i3] = str;
                    i3 = 60;
                    str = "O;9\u0017";
                    i2 = 59;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i3] = str;
                    i3 = 61;
                    str = "`\u0012\u0005&oj\u0012\u0005";
                    i2 = 60;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i3] = str;
                    i3 = 62;
                    str = "`\u0012\u0005&oj\u0012\u0005";
                    i2 = 61;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i3] = str;
                    i3 = 63;
                    str = "~\u0003\u0017'|h\u0013";
                    i2 = 62;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i3] = str;
                    i3 = 64;
                    str = "N%3\u0014ZHW?\u001bJH/V'kn\u0012\u001f%z~(\u001d0wR\u001e\u00181kuW\u0019;.\u007f\u0012\u00150g}\u0003\u0005u&f\u0012\u000f\n|h\u001a\u0019!kR\u001d\u001f1\"-\u001c\u0013,Qd\u0013_";
                    i2 = 63;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i3] = str;
                    i3 = 65;
                    str = "D9\"\u0010IH%";
                    i2 = 64;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i3] = str;
                    i3 = 66;
                    str = "n\u0005\u00134zd\u0018\u0018";
                    i2 = 65;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr2[i3] = str;
                    i3 = 67;
                    str = "}\u001b\u0017,ki(\u00120xd\u0014\u0013\nzd\u001a\u0013&zl\u001a\u0006";
                    i2 = 66;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    strArr2[i3] = str;
                    i3 = 68;
                    str = "n\u001f\u0017!Qa\u001e\u0005!";
                    i2 = 67;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    strArr2[i3] = str;
                    i3 = 69;
                    str = "N%3\u0014ZHW\"\u0014LA2V2|b\u0002\u0006\n~l\u0005\u0002<md\u0007\u0017;z~W^\ngiW?\u001bZH03\u0007.]%?\u0018O_.V\u001eKTW7\u0000ZB>8\u0016\\H:3\u001bZ!W\u0011?giW\"\u0010VYW8\u001aZ-9#\u0019B!W\u001c<j-#3\rZ-99\u0001.C\":\u0019\"-\u0016\u00128gcW?\u001bZH03\u0007\"-\u0007\u0013;jd\u0019\u0011uGC#3\u0012K_[V&kc\u0003)&kc\u0013\u0013'Qf\u0012\u000fuGC#3\u0012K_^";
                    i2 = 68;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    strArr2[i3] = str;
                    i3 = 70;
                    str = "n\u001f\u0017!Qa\u001e\u0005!";
                    i2 = 69;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeight /*69*/:
                    strArr2[i3] = str;
                    i3 = 71;
                    str = "n\u001f\u0017!Qa\u001e\u0005!";
                    i2 = 70;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightSmall /*70*/:
                    strArr2[i3] = str;
                    i3 = 72;
                    str = "j\u0005\u0019 ~R\u0007\u0017'zd\u0014\u001f%oc\u0003\u0005";
                    i2 = 71;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightLarge /*71*/:
                    strArr2[i3] = str;
                    i3 = 73;
                    str = "`\u0004\u0011&zb\u0005\u0013zih\u0003\u0001'gy\u0016\u00149ki\u0015Y0vd\u0004\u0002&";
                    i2 = 72;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingLeft /*72*/:
                    strArr2[i3] = str;
                    i3 = 74;
                    str = "`\u0012\u0005&oj\u0012\u0005";
                    i2 = 73;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingRight /*73*/:
                    strArr2[i3] = str;
                    i3 = 75;
                    str = "n\u001f\u0017!Qa\u001e\u0005!";
                    i2 = 74;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropDownListViewStyle /*74*/:
                    strArr2[i3] = str;
                    i3 = 76;
                    str = "N%3\u0014ZHW\"\u0007GJ03\u0007.`\u0012\u0005&oj\u0012\u0005\nli(\u0010:|R\u001b\u001f;e~(\u0002'gj\u0010\u0013'.O20\u001a\\HW2\u0010BH#3uACW\u001b0}~\u0016\u00110}-53\u0012GCW2\u0010BH#3uH_8;uch\u0004\u00054ih\u0004)9gc\u001c\u0005uYE2$\u0010.`\u0012\u0005&oj\u0012)'az(\u001f13b\u001b\u0012{Qd\u0013MuKC3";
                    i2 = 75;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPopupWindowStyle /*75*/:
                    strArr2[i3] = str;
                    i3 = 77;
                    str = "D9\"\u0010IH%";
                    i2 = 76;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItem /*76*/:
                    strArr2[i3] = str;
                    i3 = 78;
                    str = "N%3\u0014ZHW\"\u0014LA2V2|b\u0002\u0006\n~l\u0005\u0002<md\u0007\u0017;z~(\u001e<}y\u0018\u0004,.%(\u001f1.D9\"\u0010IH%V\u0005\\D:7\u0007W-<3\f.L\"\"\u001aGC4$\u0010CH9\"y.y\u001e\u001b0}y\u0016\u001b%.I6\"\u0010ZD:3u@B#V\u001b[A;Zuig\u001e\u0012uZH/\"u@B#V\u001b[A;Zudd\u0013V\u0001KU#V\u001bAYW8\u0000BA[V4my\u001e\u0019;.D9\"\u0010IH%V\u001bAYW8\u0000BA[V:bi(\u0006=o~\u001fV\u0001KU#V\u001bAYW8\u0000BA[V;kz(\u0006=o~\u001fV\u0001KU#V\u001bAYW8\u0000BA^";
                    i2 = 77;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItemSmall /*77*/:
                    strArr2[i3] = str;
                    i3 = 79;
                    str = "Y2.\u0001";
                    i2 = 78;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelBackground /*78*/:
                    strArr2[i3] = str;
                    i3 = 80;
                    str = "`\u0012\u0005&oj\u0012\u0005";
                    i2 = 79;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListWidth /*79*/:
                    strArr2[i3] = str;
                    i3 = 81;
                    str = "a\u0016\u0005!Q\u007f\u0012\u00171Q`\u0012\u0005&oj\u0012)!oo\u001b\u0013\ngi";
                    i2 = 80;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListTheme /*80*/:
                    strArr2[i3] = str;
                    i3 = 82;
                    str = "\u007f\u0012\u00150g}\u0003\u0005";
                    i2 = 81;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listChoiceBackgroundIndicator /*81*/:
                    strArr2[i3] = str;
                    i3 = 83;
                    str = "`\u0012\u0005&oj\u0012\u0005\nbd\u0019\u001d&";
                    i2 = 82;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimary /*82*/:
                    strArr2[i3] = str;
                    i3 = 84;
                    str = "n\u001f\u0017!Qa\u001e\u0005!";
                    i2 = 83;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimaryDark /*83*/:
                    strArr2[i3] = str;
                    str = "\u007f\u0012\u00171Qi\u0012\u0000<mh(\u0002<ch\u0004\u00024c}";
                    i2 = 84;
                    i3 = 85;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorAccent /*84*/:
                    strArr2[i3] = str;
                    i3 = 86;
                    strArr2 = strArr3;
                    str = "`\u0012\u0012<oR\u0013\u0003'oy\u001e\u0019;";
                    i2 = 85;
                    break;
                case arj.Theme_colorControlNormal /*85*/:
                    strArr2[i3] = str;
                    i3 = 87;
                    str = "`\u000e)8k~\u0004\u00172k~";
                    i2 = 86;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlActivated /*86*/:
                    strArr2[i3] = str;
                    i3 = 88;
                    str = "N%3\u0014ZHW\"\u0014LA2V8k~\u0004\u00172k~(\u001a<`f\u0004V}Qd\u0013V\u001c@Y21\u0010\\-'$\u001cCL%/uEH.V\u0014[Y8?\u001bM_2;\u0010@Y[V>kt(\u00040cb\u0003\u0013\ndd\u0013V\u0001KU#Zuch\u0004\u00054ih(\u0004:yR\u001e\u0012uGC#3\u0012K_[V9gc\u001c)<`i\u0012\u000euGC#3\u0012K_^";
                    i2 = 87;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlHighlight /*87*/:
                    strArr2[i3] = str;
                    i3 = 89;
                    str = "D9\"\u0010IH%";
                    i2 = 88;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorButtonNormal /*88*/:
                    strArr2[i3] = str;
                    i3 = 90;
                    str = "`\u0012\u0005&oj\u0012\u0005";
                    i2 = 89;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorSwitchThumbNormal /*89*/:
                    strArr2[i3] = str;
                    i3 = 91;
                    str = "D9\"\u0010IH%";
                    i2 = 90;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_controlBackground /*90*/:
                    strArr2[i3] = str;
                    i3 = 92;
                    str = "`\u0004\u0011&zb\u0005\u0013zih\u0003\u0001'gy\u0016\u00149ki\u0015V1ah\u0004\u0018rz-\u0012\u000e<}y";
                    i2 = 91;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogStyle /*91*/:
                    strArr2[i3] = str;
                    i3 = 93;
                    str = "`\u0012\u0005&oj\u0012\u0005";
                    i2 = 92;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogButtonGroupStyle /*92*/:
                    strArr2[i3] = str;
                    i3 = 94;
                    str = "`\u0012\u0005&oj\u0012\u0005\nhy\u0004";
                    i2 = 93;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogCenterButtons /*93*/:
                    strArr2[i3] = str;
                    i3 = 95;
                    str = "*L";
                    i2 = 94;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogTheme /*94*/:
                    strArr2[i3] = str;
                    i3 = 96;
                    str = "~\u0012\u001a0myW\u0005$b-\u0011\u0004:c-\u0004\u00079gy\u0012)8o~\u0003\u0013'.z\u001f\u0013'k-\u0003\u000f%k0P\u001f;jh\u000fQuoc\u0013V;o`\u0012Kr";
                    i2 = 95;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorAlertDialogListItem /*95*/:
                    strArr2[i3] = str;
                    i3 = 97;
                    str = "`\u0004\u0011&zb\u0005\u0013zih\u0003\u0001'gy\u0016\u00149ki\u0015Y8ki\u001e\u0017!w}\u0012\u001f;jh\u000fV";
                    i2 = 96;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarPositiveButtonStyle /*96*/:
                    strArr2[i3] = str;
                    i3 = 98;
                    str = "I%9\u0005.Y64\u0019K->0uKU>%\u0001]-\u001a\u00131gl(\u00040h~";
                    i2 = 97;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNegativeButtonStyle /*97*/:
                    strArr2[i3] = str;
                    i3 = 99;
                    str = "N%3\u0014ZHW#\u001bG\\\"3uGC33\r.j\u0005\u0019 ~R\u0007\u0017'zd\u0014\u001f%oc\u0003\u0005\ngc\u0013\u0013-.b\u0019V2|b\u0002\u0006\n~l\u0005\u0002<md\u0007\u0017;z~W^2dd\u0013Zudd\u0013_";
                    i2 = 98;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNeutralButtonStyle /*98*/:
                    strArr2[i3] = str;
                    i3 = 100;
                    str = "I%9\u0005.Y64\u0019K->0uKU>%\u0001]-\u0007\u0004:~~";
                    i2 = 99;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_autoCompleteTextViewStyle /*99*/:
                    strArr2[i3] = str;
                    i3 = arj.Theme_buttonStyleSmall;
                    str = "D9%\u0010\\YW?\u001bZBW\u0006'a}\u0004^>kt[V#oa\u0002\u0013|.[6:\u0000K^W^rbd\u0019\u001d&Q\u007f\u0012\u00171w*[Vd'";
                    i2 = 100;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyle /*100*/:
                    strArr2[i3] = str;
                    i3 = arj.Theme_checkboxStyle;
                    str = "I%9\u0005.Y%?\u0012IH%V\u001cH-2.\u001c]Y$V8k~\u0004\u00172k~(\u00141Qy\u0005\u001f2ih\u0005";
                    i2 = arj.Theme_buttonStyleSmall;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyleSmall /*101*/:
                    strArr2[i3] = str;
                    i3 = arj.Theme_checkedTextViewStyle;
                    str = "I%9\u0005.Y64\u0019K->0uKU>%\u0001]-\u0010\u0004:{}(\u00064|y\u001e\u0015<~l\u0019\u0002&Qe\u001e\u0005!a\u007f\u000e";
                    i2 = arj.Theme_checkboxStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_checkboxStyle /*102*/:
                    strArr2[i3] = str;
                    i3 = arj.Theme_editTextStyle;
                    str = "N%3\u0014ZHW\"\u0007GJ03\u0007.`\u0012\u0005&oj\u0012\u0005\nli(\u0010:|R\u001b\u001f;e~(\u0002'gj\u0010\u0013'.O20\u001a\\HW2\u0010BH#3uACW\u001b0}~\u0016\u00110}-53\u0012GCW2\u0010BH#3uH_8;uch\u0004\u00054ih\u0004)9gc\u001c\u0005uYE2$\u0010.`\u0012\u0005&oj\u0012)'az(\u001f13b\u001b\u0012{Qd\u0013MuKC3";
                    i2 = arj.Theme_checkedTextViewStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_checkedTextViewStyle /*103*/:
                    strArr2[i3] = str;
                    i3 = arj.Theme_radioButtonStyle;
                    str = "N%3\u0014ZHW\"\u0014LA2V8ki\u001e\u0017\n|h\u0011\u0005u&R\u001e\u0012uGC#3\u0012K_W&\u0007G@6$\f.F2/uOX#9\u001c@N%3\u0018KC#Zu~l\u0003\u001euZH/\"u[C>'\u0000K!W\u00040hR\u0014\u0019 `yW?\u001bZH03\u0007'";
                    i2 = arj.Theme_editTextStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextStyle /*104*/:
                    strArr2[i3] = str;
                    i3 = arj.Theme_ratingBarStyle;
                    str = "`\u0004\u0011&zb\u0005\u0013zm\u007f\u0012\u0017!k-";
                    i2 = arj.Theme_radioButtonStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_radioButtonStyle /*105*/:
                    strArr2[i3] = str;
                    i3 = arj.Theme_seekBarStyle;
                    str = "I%9\u0005.Y64\u0019K->0uKU>%\u0001]-\u001a\u0013&}l\u0010\u0013&Qk\u0003\u0005";
                    i2 = arj.Theme_ratingBarStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_ratingBarStyle /*106*/:
                    strArr2[i3] = str;
                    i3 = arj.Theme_spinnerStyle;
                    str = "N%3\u0014ZHW?\u001bJH/V\u001cH-99\u0001.H/?\u0006Z^W\u0005!o\u007f\u0005\u00131Qd\u0019\u00120v-\u0018\u0018uch\u0004\u00054ih\u0004V}}y\u0016\u0004'ki^";
                    i2 = arj.Theme_seekBarStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_seekBarStyle /*107*/:
                    strArr2[i3] = str;
                    i3 = arj.Theme_switchStyle;
                    str = "I%9\u0005.Y64\u0019K->0uKU>%\u0001]-\u0005\u00136kd\u0007\u0002&";
                    i2 = arj.Theme_spinnerStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerStyle /*108*/:
                    strArr2[i3] = str;
                    i3 = 110;
                    str = "N%3\u0014ZHW?\u001bJH/V8ki\u001e\u0017\nzt\u0007\u0013\ndd\u0013)<`i\u0012\u000euacW\u001b0}~\u0016\u00110}-_\u001d0wR\u0005\u00138ay\u0012)?gi[V8ki\u001e\u0017\nyl(\u0002,~h^";
                    i2 = arj.Theme_switchStyle;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_switchStyle /*109*/:
                    strArr2[i3] = str;
                    i3 = 111;
                    str = "I%9\u0005.Y%?\u0012IH%V\u001cH-2.\u001c]Y$V8k~\u0004\u00172k~(\u00141Qk\u0018\u0004\nbd\u0019\u001d&Qy\u0005\u001f2ih\u0005";
                    i2 = 110;
                    strArr2 = strArr3;
                    break;
                case 110:
                    strArr2[i3] = str;
                    i3 = 112;
                    str = "N%3\u0014ZHW\"\u0014LA2V8k~\u0004\u00172k~W^\ngiW?\u001bZH03\u0007.]%?\u0018O_.V\u001eKTW7\u0000ZB>8\u0016\\H:3\u001bZ!W\u001d0wR\u0005\u00138ay\u0012)?giW\"\u0010VYW8\u001aZ-9#\u0019B!W\u001d0wR\u0011\u0004:cR\u001a\u0013uGC#3\u0012K_[V>kt(\u001f1.Y2.\u0001.C8\"u@X;:y.~\u0003\u0017!{~W?\u001bZH03\u0007\"-\u0019\u00130j~(\u0006 }eW?\u001bZH03\u0007\"-\u0013\u0017!o-#3\rZ!W\u0002<ch\u0004\u00024c}W?\u001bZH03\u0007\"-\u001a\u00131gl(\u0003'b-#3\rZ!W\u001b0jd\u0016)8g`\u0012)!w}\u0012V\u0001KU#Zuch\u0013\u001f4Qz\u0016)!w}\u0012V\u0001KU#Zuch\u0013\u001f4Q~\u001e\f0.D9\"\u0010IH%Zuch\u0013\u001f4Qc\u0016\u001b0.Y2.\u0001\"-\u001a\u00131gl(\u00154~y\u001e\u0019;.Y2.\u0001\"-\u001a\u00131gl(\u001e4}eW\"\u0010VY[V8ki\u001e\u0017\njx\u0005\u0017!gb\u0019V\u001c@Y21\u0010\\!W\u0019'gj\u001e\u0018uGC#3\u0012K_[V9oy\u001e\u0002 jhW$\u0010OA[V9ac\u0010\u001f!{i\u0012V\u0007KL;Zuze\u0002\u001b7Qd\u001a\u00172k-#3\rZ!W\u00040cb\u0003\u0013\n|h\u0004\u0019 |n\u0012V\u0001KU#Zu|h\u0014\u0013<xh\u0013)!g`\u0012\u0005!o`\u0007V\u001c@Y21\u0010\\!W\u00050`i(\u0002<ch\u0004\u00024c}W?\u001bZH03\u0007\"-\u0005\u00136kd\u0007\u0002\n}h\u0005\u00000|R\u0003\u001f8k~\u0003\u00178~->8\u0001KJ2$y.\u007f\u0012\u00150g}\u0003)1k{\u001e\u00150Qy\u001e\u001b0}y\u0016\u001b%.D9\"\u0010IH%Zu|h\u0016\u0012\njh\u0001\u001f6kR\u0003\u001f8k~\u0003\u00178~->8\u0001KJ2$y.}\u001b\u0017,ki(\u00120xd\u0014\u0013\nzd\u001a\u0013&zl\u001a\u0006uGC#3\u0012K_[V'oz(\u00124zlW4\u0019AO[V'kn\u001e\u0006<kc\u0003)6ax\u0019\u0002uGC#3\u0012K_[V%o\u007f\u0003\u001f6g}\u0016\u0018!Qe\u0016\u0005=.Y2.\u0001\"-\u0004\u00024|\u007f\u0012\u0012uGC#3\u0012K_^";
                    i2 = 111;
                    strArr2 = strArr3;
                    break;
                case 111:
                    strArr2[i3] = str;
                    i3 = 113;
                    str = "N%3\u0014ZHW\"\u0014LA2V%|b\u0007\u0005u&R\u001e\u0012uGC#3\u0012K_W&\u0007G@6$\f.F2/uOX#9\u001c@N%3\u0018KC#Zueh\u000eV\u0001KU#V\u0000@D&#\u0010\"-\u0001\u00179{hW\"\u0010VY^";
                    i2 = 112;
                    strArr2 = strArr3;
                    break;
                case 112:
                    strArr2[i3] = str;
                    i3 = 114;
                    str = "I%9\u0005.Y64\u0019K->0uKU>%\u0001]-\u0014\u001e4zR\u001b\u001f&z";
                    i2 = 113;
                    strArr2 = strArr3;
                    break;
                case 113:
                    strArr2[i3] = str;
                    i3 = 115;
                    str = "N%3\u0014ZHW\"\u0014LA2V8k~\u0004\u00172k~(\u001a<`f\u0004V}Qd\u0013V\u001c@Y21\u0010\\-'$\u001cCL%/uEH.V\u0014[Y8?\u001bM_2;\u0010@Y[V>kt(\u00040cb\u0003\u0013\ndd\u0013V\u0001KU#Zuch\u0004\u00054ih(\u0004:yR\u001e\u0012uGC#3\u0012K_[V9gc\u001c)<`i\u0012\u000euGC#3\u0012K_^";
                    i2 = 114;
                    strArr2 = strArr3;
                    break;
                case 114:
                    strArr2[i3] = str;
                    i3 = 116;
                    str = "N%3\u0014ZHW?\u001bJH/V'kn\u0012\u001f%z~(\u001d0wR\u001e\u00181kuW\u0019;.\u007f\u0012\u00150g}\u0003\u0005u&f\u0012\u000f\n|h\u001a\u0019!kR\u001d\u001f1\"-\u001c\u0013,Qd\u0013_";
                    i2 = 115;
                    strArr2 = strArr3;
                    break;
                case 115:
                    strArr2[i3] = str;
                    i3 = 117;
                    str = "D9%\u0010\\YW?\u001bZBW\u001b0}~\u0016\u00110}%(\u001f1\"-\u001c\u0013,Q\u007f\u0012\u001b:zh(\u001c<j!W\u001d0wR\u0011\u0004:cR\u001a\u0013y.f\u0012\u000f\ngi[V&zl\u0003\u0003&\"-\u0019\u00130j~(\u0006 }e[V1oy\u0016Zuzd\u001a\u0013&zl\u001a\u0006y.`\u0012\u0012<oR\u0002\u00049\"-\u001a\u00131gl(\u001b<ch(\u0002,~h[V8ki\u001e\u0017\nyl(\u0002,~h[V8ki\u001e\u0017\n}d\r\u0013y.`\u0012\u0012<oR\u0019\u00178k!W\u001b0jd\u0016)=o~\u001fZuch\u0013\u001f4Qi\u0002\u00044zd\u0018\u0018y.b\u0005\u001f2gc[V9oy\u001e\u0002 jh[V9ac\u0010\u001f!{i\u0012Zuze\u0002\u001b7Qd\u001a\u00172k!W\u00040mh\u001e\u00000jR\u0003\u001f8k~\u0003\u00178~!W\u00050`i(\u0002<ch\u0004\u00024c}[V'kn\u0012\u001f%zR\u0004\u0013'xh\u0005)!g`\u0012\u0005!o`\u0007Zu|h\u0014\u0013<~y(\u00120xd\u0014\u0013\nzd\u001a\u0013&zl\u001a\u0006y.\u007f\u0012\u00171Qi\u0012\u0000<mh(\u0002<ch\u0004\u00024c}[V%bl\u000e\u00131Qi\u0012\u0000<mh(\u0002<ch\u0004\u00024c}^V\u0003OA\"3\u0006.%FZu) FQy.=[Vr#<PZu#<[Ve\"-9#\u0019B!WFy.C\":\u0019\"-9#\u0019B!W[d\"-ZGy.C\":\u0019\"-9#\u0019B!WFy.=[Ve\"-GZu@X;:y. FZu#<[Vx?!W[d\"-ZGy. F_";
                    i2 = 116;
                    strArr2 = strArr3;
                    break;
                case 116:
                    strArr2[i3] = str;
                    i3 = 118;
                    str = "I%9\u0005.Y%?\u0012IH%V\u001cH-2.\u001c]Y$V8k~\u0004\u00172k~(\u00141Qk\u0018\u0004\n|h\u0014\u0013<~y\u0004)!|d\u0010\u00110|";
                    i2 = 117;
                    strArr2 = strArr3;
                    break;
                case 117:
                    strArr2[i3] = str;
                    i3 = 119;
                    str = "N%3\u0014ZHW\"\u0007GJ03\u0007.`\u0012\u0005&oj\u0012\u0005\nli(\u0002'gj\u0010\u0013'.O20\u001a\\HW2\u0010BH#3uACW\u001b0}~\u0016\u00110}-53\u0012GCW2\u0010BH#3uH_8;uch\u0004\u00054ih\u0004)3z~W!\u001dK_2V1an\u001e\u0012haa\u0013X\ngiLV\u0010@I";
                    i2 = 118;
                    strArr2 = strArr3;
                    break;
                case 118:
                    strArr2[i3] = str;
                    i3 = 120;
                    str = "N%3\u0014ZHW\"\u0014LA2V6fl\u0003)9g~\u0003V}Qd\u0013V\u001c@Y21\u0010\\-'$\u001cCL%/uEH.V\u0014[Y8?\u001bM_2;\u0010@Y[V>kt(\u00040cb\u0003\u0013\ndd\u0013V\u0001KU#V\u0000@D&#\u0010\"-\u001a\u0013&}l\u0010\u0013\nzl\u0015\u001a0Qd\u0013V\u001c@Y21\u0010\\!W\u0005 lg\u0012\u0015!.Y2.\u0001\"-\u0014\u00040oy\u001e\u0019;.D9\"\u0010IH%Zubl\u0004\u0002\n|h\u0016\u0012\nch\u0004\u00054ih(\u00024la\u0012)<j->8\u0001KJ2$y.a\u0016\u0005!Q\u007f\u0012\u00171Q\u007f\u0012\u00150g}\u0003)&kc\u0003)8k~\u0004\u00172kR\u0003\u00177bh(\u001f1.D9\"\u0010IH%Zuo\u007f\u0014\u001e<xh\u0013V\u001c@Y21\u0010\\!W\u0005:|y(\u0002<ch\u0004\u00024c}W?\u001bZH03\u0007\"-\u001a\u00191Qy\u0016\u0011uGC#3\u0012K_[V2kcW$\u0010OA[V8wR\u001a\u0013&}l\u0010\u0013&.D9\"\u0010IH%Zu~a\u0016\u001f;zh\u000f\u0002\njd\u0004\u00177bh\u0013V\u0017AB;3\u0014@$";
                    i2 = 119;
                    strArr2 = strArr3;
                    break;
                case 119:
                    strArr2[i3] = str;
                    i3 = 121;
                    str = "N%3\u0014ZHW \u001c\\Y\"7\u0019.Y64\u0019K-\u001a\u0013&}l\u0010\u0013&Qk\u0003\u0005u[^>8\u0012.K#%f&$";
                    i2 = 120;
                    strArr2 = strArr3;
                    break;
                case 120:
                    strArr2[i3] = str;
                    i3 = 122;
                    str = "D9%\u0010\\YW?\u001bZBW\u0006'a}\u0004^>kt[V#oa\u0002\u0013|.[6:\u0000K^W^rhy\u0004)!af\u0012\u0018<th\u0005)#k\u007f\u0004\u001f:`*[Vd'";
                    i2 = 121;
                    strArr2 = strArr3;
                    break;
                case 121:
                    strArr2[i3] = str;
                    i3 = 123;
                    str = "D9%\u0010\\YW?\u001bZBW\u0006'a}\u0004^>kt[V#oa\u0002\u0013|.[6:\u0000K^W^rhy\u0004)'kl\u0013\u000fr\"-F_";
                    i2 = 122;
                    strArr2 = strArr3;
                    break;
                case 122:
                    strArr2[i3] = str;
                    i3 = 124;
                    str = "I%9\u0005.Y64\u0019K->0uKU>%\u0001]-\u001a\u0013&}l\u0010\u0013&";
                    i2 = 123;
                    strArr2 = strArr3;
                    break;
                case 123:
                    strArr2[i3] = str;
                    i3 = 125;
                    str = "I%9\u0005.Y64\u0019K->0uKU>%\u0001]-\u001a\u0013&}l\u0010\u0013&Qa\u001e\u0018>}";
                    i2 = 124;
                    strArr2 = strArr3;
                    break;
                case 124:
                    strArr2[i3] = str;
                    i3 = 126;
                    str = "N%3\u0014ZHW\"\u0007GJ03\u0007.D1V\u001bAYW3\rG^#%uch\u0004\u00054ih\u0004)7jR\u0011\u0019'Q\u007f\u0012\u00150g}\u0003\u0005\nz\u007f\u001e\u00112k\u007fW4\u0010HB%3uJH;3\u0001K-88uch\u0004\u00054ih\u0004V\u0017KJ>8uJH;3\u0001K-1$\u001aC-\u0005\u00136kd\u0007\u0002&.Z?3\u0007K-\u001c\u0013,Q\u007f\u0012\u001b:zh(\u001c<j0\u0018\u001a1 f\u0012\u000f\n|h\u001a\u0019!kR\u001d\u001f1.L92ueh\u000e)<j0\u0018\u001a1 f\u0012\u000f\ngiLV\u0010@I";
                    i2 = 125;
                    strArr2 = strArr3;
                    break;
                case 125:
                    strArr2[i3] = str;
                    i3 = 127;
                    str = "D9%\u0010\\YW?\u001bZBW\u0006'a}\u0004^>kt[V#oa\u0002\u0013|.[6:\u0000K^W^rbd\u0019\u001d&Q{\u0012\u0004&gb\u0019Qy.<^";
                    i2 = 126;
                    strArr2 = strArr3;
                    break;
                case 126:
                    strArr2[i3] = str;
                    i3 = 128;
                    str = "N%3\u0014ZHW?\u001bJH/V2|b\u0002\u0006\n~l\u0005\u0002<md\u0007\u0017;z~(\u001e<}y\u0018\u0004,Qd\u0019\u00120v-\u0018\u0018ui\u007f\u0018\u0003%Q}\u0016\u0004!gn\u001e\u00064`y\u0004)=g~\u0003\u0019'w-_\u0011?gi^";
                    i2 = 127;
                    strArr2 = strArr3;
                    break;
                case 127:
                    strArr2[i3] = str;
                    i3 = 129;
                    str = "N%3\u0014ZHW#\u001bG\\\"3uGC33\r.`\u0012\u0005&oj\u0012\u0005\neh\u000e)<`i\u0012\u000euacW\u001b0}~\u0016\u00110}-_\u001d0wR\u0005\u00138ay\u0012)?gi[V>kt(\u0010'a`(\u001b0\"-\u001c\u0013,Qd\u0013_";
                    i2 = 128;
                    strArr2 = strArr3;
                    break;
                case 128:
                    strArr2[i3] = str;
                    i3 = 130;
                    str = "I%9\u0005.Y64\u0019K->0uKU>%\u0001]-\u0010\u0004:{}(\u00064|y\u001e\u0015<~l\u0019\u0002&";
                    i2 = 129;
                    strArr2 = strArr3;
                    break;
                case 129:
                    strArr2[i3] = str;
                    i3 = 131;
                    str = "N%3\u0014ZHW\"\u0014LA2V2|b\u0002\u0006\n~l\u0005\u0002<md\u0007\u0017;z~W^\ngiW?\u001bZH03\u0007.]%?\u0018O_.V\u001eKTW7\u0000ZB>8\u0016\\H:3\u001bZ!W\u0011?giW\"\u0010VYW8\u001aZ-9#\u0019B!W\u001c<j-#3\rZ-99\u0001.C\":\u0019\"-\u0016\u00128gcW?\u001bZH03\u0007\"-\u0007\u0013;jd\u0019\u0011uGC#3\u0012K_[V&kc\u0003)&kc\u0013\u0013'Qf\u0012\u000fuGC#3\u0012K_^";
                    i2 = 130;
                    strArr2 = strArr3;
                    break;
                case 130:
                    strArr2[i3] = str;
                    i3 = 132;
                    str = "N%3\u0014ZHW?\u001bJH/V8ki\u001e\u0017\nzt\u0007\u0013\ngc\u0013\u0013-.b\u0019V8k~\u0004\u00172k~W^8ki\u001e\u0017\nyl(\u0002,~h^";
                    i2 = 131;
                    strArr2 = strArr3;
                    break;
                case 131:
                    strArr2[i3] = str;
                    i3 = 133;
                    str = "N%3\u0014ZHW?\u001bJH/V8ki\u001e\u0017\nfl\u0004\u001e\ngc\u0013\u0013-.b\u0019V8k~\u0004\u00172k~W^8ki\u001e\u0017\nfl\u0004\u001e|";
                    i2 = 132;
                    strArr2 = strArr3;
                    break;
                case 132:
                    strArr2[i3] = str;
                    i3 = 134;
                    str = "N%3\u0014ZHW\"\u0014LA2V2|b\u0002\u0006\n~l\u0005\u0002<md\u0007\u0017;z~(\u001e<}y\u0018\u0004,.%(\u001f1.D9\"\u0010IH%V\u0005\\D:7\u0007W-<3\f.L\"\"\u001aGC4$\u0010CH9\"y.y\u001e\u001b0}y\u0016\u001b%.I6\"\u0010ZD:3u@B#V\u001b[A;Zuig\u001e\u0012uZH/\"u@B#V\u001b[A;Zudd\u0013V\u0001KU#V\u001bAYW8\u0000BA[V4my\u001e\u0019;.D9\"\u0010IH%V\u001bAYW8\u0000BA[V:bi(\u0006=o~\u001fV\u0001KU#V\u001bAYW8\u0000BA[V;kz(\u0006=o~\u001fV\u0001KU#V\u001bAYW8\u0000BA^";
                    i2 = 133;
                    strArr2 = strArr3;
                    break;
                case 133:
                    strArr2[i3] = str;
                    i3 = 135;
                    str = "N%3\u0014ZHW\"\u0014LA2V'kn\u0012\u001f%z~W^\ngiW?\u001bZH03\u0007.]%?\u0018O_.V\u001eKTW7\u0000ZB>8\u0016\\H:3\u001bZ!W\u001d0wR\u0005\u00138ay\u0012)?giW\"\u0010VYW8\u001aZ-9#\u0019B!W\u001d0wR\u001e\u0012uZH/\"u@B#V\u001b[A;Zu|h\u001a\u0019!kR\u0005\u0013&ax\u0005\u00150.Y2.\u0001\"-\u0005\u00136kd\u0007\u0002\njh\u0001\u001f6kR\u0003\u001f8k~\u0003\u00178~->8\u0001KJ2$y.\u007f\u0012\u00171Qi\u0012\u0000<mh(\u0002<ch\u0004\u00024c}W?\u001bZH03\u0007\"-\u0007\u001a4wh\u0013)1k{\u001e\u00150Qy\u001e\u001b0}y\u0016\u001b%.D9\"\u0010IH%_";
                    i2 = 134;
                    strArr2 = strArr3;
                    break;
                case 134:
                    strArr2[i3] = str;
                    i3 = 136;
                    str = " \u0004\u001e8";
                    i2 = 135;
                    strArr2 = strArr3;
                    break;
                case 135:
                    strArr2[i3] = str;
                    i3 = 137;
                    str = " \u001d\u0019 |c\u0016\u001a";
                    i2 = 136;
                    strArr2 = strArr3;
                    break;
                case 136:
                    strArr2[i3] = str;
                    i3 = 138;
                    str = " \u0000\u00179";
                    i2 = 137;
                    strArr2 = strArr3;
                    break;
                case 137:
                    strArr2[i3] = str;
                    i3 = 139;
                    str = "N%3\u0014ZHW?\u001bJH/V8ki\u001e\u0017\nzt\u0007\u0013\ndd\u0013)<`i\u0012\u000euacW\u001b0}~\u0016\u00110}-_\u001d0wR\u0005\u00138ay\u0012)?gi[V8ki\u001e\u0017\nyl(\u0002,~h^";
                    i2 = 138;
                    strArr2 = strArr3;
                    break;
                case 138:
                    strArr2[i3] = str;
                    i3 = 140;
                    str = "`\u0004\u0011&zb\u0005\u0013zih\u0003\u0001'gy\u0016\u00149ki\u0015Y8k~\u0004\u00172k~W\u00056fh\u001a\u0017u";
                    i2 = 139;
                    strArr2 = strArr3;
                    break;
                case 139:
                    strArr2[i3] = str;
                    i3 = 141;
                    str = "~\u0012\u001a0myW\u0005$b-\u0011\u0004:c-\u0004\u00079gy\u0012)8o~\u0003\u0013'.z\u001f\u0013'k-\u0003\u000f%k0P\u00024la\u0012Quoc\u0013V;o`\u0012Kr";
                    i2 = 140;
                    strArr2 = strArr3;
                    break;
                case 140:
                    strArr2[i3] = str;
                    i3 = 142;
                    str = "*L";
                    i2 = 141;
                    strArr2 = strArr3;
                    break;
                case 141:
                    strArr2[i3] = str;
                    i3 = 143;
                    str = "N%3\u0014ZHW?\u001bJH/V\u001cH-99\u0001.H/?\u0006Z^W\u0005!o\u007f\u0005\u00131Qd\u0019\u00120v-\u0018\u0018uch\u0004\u00054ih\u0004V}}y\u0016\u0004'ki^";
                    i2 = 142;
                    strArr2 = strArr3;
                    break;
                case 142:
                    strArr2[i3] = str;
                    i3 = 144;
                    str = "N%3\u0014ZHW?\u001bJH/V8ki\u001e\u0017\nzt\u0007\u0013\ngc\u0013\u0013-.b\u0019V8k~\u0004\u00172k~W^8ki\u001e\u0017\nyl(\u0002,~h^";
                    i2 = 143;
                    strArr2 = strArr3;
                    break;
                case 143:
                    strArr2[i3] = str;
                    i3 = 145;
                    str = "]%7\u0012CLW\u00050mx\u0005\u0013\njh\u001b\u0013!k0F";
                    i2 = 144;
                    strArr2 = strArr3;
                    break;
                case 144:
                    strArr2[i3] = str;
                    i3 = 146;
                    str = "`\u0004\u0011&zb\u0005\u0013zkc\u0016\u00149kR\u0004\u00136{\u007f\u0012)1ka\u0012\u00020";
                    i2 = 145;
                    strArr2 = strArr3;
                    break;
                case 145:
                    strArr2[i3] = str;
                    i3 = 147;
                    str = "L;\"\u0010\\-#7\u0017BHW";
                    i2 = 146;
                    strArr2 = strArr3;
                    break;
                case 146:
                    strArr2[i3] = str;
                    i3 = 148;
                    str = "-62\u0011.";
                    i2 = 147;
                    strArr2 = strArr3;
                    break;
                case 147:
                    strArr2[i3] = str;
                    i3 = 149;
                    str = "`\u0004\u0011&zb\u0005\u0013zoa\u0003\u0013'Qy\u0016\u00149k-";
                    i2 = 148;
                    strArr2 = strArr3;
                    break;
                case 148:
                    strArr2[i3] = str;
                    i3 = 150;
                    str = "`\u0004\u0011&zb\u0005\u0013{jo";
                    i2 = 149;
                    strArr2 = strArr3;
                    break;
                case 149:
                    strArr2[i3] = str;
                    i3 = 151;
                    str = "N%3\u0014ZHW?\u001bJH/V8ki\u001e\u0017\nfl\u0004\u001e\ngc\u0013\u0013-.b\u0019V8k~\u0004\u00172k~W^8ki\u001e\u0017\nfl\u0004\u001e|";
                    i2 = 150;
                    strArr2 = strArr3;
                    break;
                case 150:
                    strArr2[i3] = str;
                    i3 = 152;
                    str = "-\u0003\u0019u";
                    i2 = 151;
                    strArr2 = strArr3;
                    break;
                case 151:
                    strArr2[i3] = str;
                    i3 = 153;
                    str = "`\u0004\u0011&zb\u0005\u0013z{}\u0010\u00044jhW\u00000|~\u001e\u0019;.";
                    i2 = 152;
                    strArr2 = strArr3;
                    break;
                case 152:
                    strArr2[i3] = str;
                    i3 = 154;
                    str = "]%7\u0012CLW\u0005,`n\u001f\u0004:`b\u0002\u0005h@B%;\u0014B6";
                    i2 = 153;
                    strArr2 = strArr3;
                    break;
                case 153:
                    strArr2[i3] = str;
                    z = strArr3;
                    try {
                        if (VERSION.SDK_INT >= 16) {
                            i = 536870912;
                        }
                        a = i | 16;
                        return;
                    } catch (SQLiteDiskIOException e) {
                        throw e;
                    }
                default:
                    strArr2[i3] = str;
                    i3 = 1;
                    strArr2 = strArr3;
                    str = "n\u001f\u0017!Qa\u001e\u0005!";
                    i2 = 0;
                    break;
            }
        }
    }

    static void c(a5f com_whatsapp_a5f) {
        com_whatsapp_a5f.d();
    }

    private void b() {
        try {
            if (this.c == null) {
                return;
            }
            if (this.c.isOpen()) {
                this.c.execSQL(z[143]);
            }
        } catch (SQLiteDiskIOException e) {
            throw e;
        } catch (SQLiteDiskIOException e2) {
            throw e2;
        }
    }

    a5f(Context context) {
        super(context, z[150], null, 1);
        this.c = null;
    }

    public static void a(int i, Object obj, SQLiteStatement sQLiteStatement) {
        if (obj == null) {
            try {
                sQLiteStatement.bindNull(i);
                if (!l5.s) {
                    return;
                }
            } catch (SQLiteDiskIOException e) {
                throw e;
            }
        }
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new ObjectOutputStream(byteArrayOutputStream).writeObject(obj);
        sQLiteStatement.bindBlob(i, byteArrayOutputStream.toByteArray());
    }

    private void e() {
        try {
            if (!this.d) {
                if (this.c != null) {
                    try {
                        if (this.c.isOpen()) {
                            this.c.execSQL(z[139]);
                            this.d = true;
                        }
                    } catch (SQLiteDiskIOException e) {
                        throw e;
                    }
                }
            }
        } catch (SQLiteDiskIOException e2) {
            throw e2;
        } catch (SQLiteDiskIOException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.database.sqlite.SQLiteDatabase r5) {
        /*
        r4 = this;
        r0 = com.whatsapp.l5.s;
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ SQLiteDiskIOException -> 0x0009 }
        r2 = 10;
        if (r1 >= r2) goto L_0x000b;
    L_0x0008:
        return;
    L_0x0009:
        r0 = move-exception;
        throw r0;
    L_0x000b:
        r1 = z;
        r2 = 145; // 0x91 float:2.03E-43 double:7.16E-322;
        r1 = r1[r2];
        r2 = 0;
        r1 = r5.rawQuery(r1, r2);
        if (r1 == 0) goto L_0x0008;
    L_0x0018:
        r2 = r1.moveToNext();	 Catch:{ SQLiteDiskIOException -> 0x0028 }
        if (r2 == 0) goto L_0x0024;
    L_0x001e:
        r2 = 0;
        r1.getInt(r2);	 Catch:{ SQLiteDiskIOException -> 0x0028 }
        if (r0 == 0) goto L_0x0018;
    L_0x0024:
        r1.close();
        goto L_0x0008;
    L_0x0028:
        r0 = move-exception;
        r2 = z;	 Catch:{ all -> 0x0036 }
        r3 = 146; // 0x92 float:2.05E-43 double:7.2E-322;
        r2 = r2[r3];	 Catch:{ all -> 0x0036 }
        com.whatsapp.util.Log.b(r2, r0);	 Catch:{ all -> 0x0036 }
        r1.close();
        goto L_0x0008;
    L_0x0036:
        r0 = move-exception;
        r1.close();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a5f.a(android.database.sqlite.SQLiteDatabase):void");
    }

    public static void a(int i, String str, SQLiteStatement sQLiteStatement) {
        if (str == null) {
            try {
                sQLiteStatement.bindNull(i);
                if (!l5.s) {
                    return;
                }
            } catch (SQLiteDiskIOException e) {
                throw e;
            }
        }
        sQLiteStatement.bindString(i, str);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String a(java.lang.String r7) {
        /*
        r6 = this;
        r0 = "";
        r1 = r6.c;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 141; // 0x8d float:1.98E-43 double:6.97E-322;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.append(r7);
        r3 = z;
        r4 = 142; // 0x8e float:1.99E-43 double:7.0E-322;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r2 = r2.toString();
        r3 = 0;
        r2 = r1.rawQuery(r2, r3);
        if (r2 == 0) goto L_0x003b;
    L_0x002d:
        r1 = r2.moveToNext();	 Catch:{ Exception -> 0x003c }
        if (r1 == 0) goto L_0x0038;
    L_0x0033:
        r1 = 0;
        r0 = r2.getString(r1);	 Catch:{ Exception -> 0x003c }
    L_0x0038:
        r2.close();
    L_0x003b:
        return r0;
    L_0x003c:
        r1 = move-exception;
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x006a }
        r3.<init>();	 Catch:{ all -> 0x006a }
        r4 = z;	 Catch:{ all -> 0x006a }
        r5 = 140; // 0x8c float:1.96E-43 double:6.9E-322;
        r4 = r4[r5];	 Catch:{ all -> 0x006a }
        r3 = r3.append(r4);	 Catch:{ all -> 0x006a }
        r3 = r3.append(r7);	 Catch:{ all -> 0x006a }
        r4 = " ";
        r3 = r3.append(r4);	 Catch:{ all -> 0x006a }
        r1 = r1.toString();	 Catch:{ all -> 0x006a }
        r1 = r3.append(r1);	 Catch:{ all -> 0x006a }
        r1 = r1.toString();	 Catch:{ all -> 0x006a }
        com.whatsapp.util.Log.e(r1);	 Catch:{ all -> 0x006a }
        r2.close();
        goto L_0x003b;
    L_0x006a:
        r0 = move-exception;
        r2.close();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a5f.a(java.lang.String):java.lang.String");
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(z[154]);
            a(sQLiteDatabase);
            if (VERSION.SDK_INT < 11) {
                return;
            }
            if (VERSION.SDK_INT < 16) {
                try {
                    if (!bm.a()) {
                        sQLiteDatabase.enableWriteAheadLogging();
                    }
                } catch (SQLiteDiskIOException e) {
                    throw e;
                }
            }
        } catch (SQLiteDiskIOException e2) {
            throw e2;
        } catch (SQLiteDiskIOException e22) {
            throw e22;
        }
    }

    private void a(String str, String str2, String str3, String str4) {
        if (!str.contains(str3 + " " + str4)) {
            try {
                this.c.execSQL(z[147] + str2 + z[148] + str3 + " " + str4);
            } catch (SQLiteException e) {
                Log.e(z[149] + str3 + " " + e.toString());
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean b(java.lang.String r8) {
        /*
        r7 = this;
        r1 = 0;
        r0 = "";
        r2 = r7.c;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = z;
        r5 = 96;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r3 = r3.append(r8);
        r4 = z;
        r5 = 95;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r3 = r3.toString();
        r4 = 0;
        r3 = r2.rawQuery(r3, r4);
        if (r3 == 0) goto L_0x003c;
    L_0x002e:
        r2 = r3.moveToNext();	 Catch:{ Exception -> 0x0044 }
        if (r2 == 0) goto L_0x0039;
    L_0x0034:
        r2 = 0;
        r0 = r3.getString(r2);	 Catch:{ Exception -> 0x0044 }
    L_0x0039:
        r3.close();
    L_0x003c:
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ Exception -> 0x006c }
        if (r0 != 0) goto L_0x006e;
    L_0x0042:
        r0 = 1;
    L_0x0043:
        return r0;
    L_0x0044:
        r2 = move-exception;
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0067 }
        r4.<init>();	 Catch:{ all -> 0x0067 }
        r5 = z;	 Catch:{ all -> 0x0067 }
        r6 = 97;
        r5 = r5[r6];	 Catch:{ all -> 0x0067 }
        r4 = r4.append(r5);	 Catch:{ all -> 0x0067 }
        r2 = r2.toString();	 Catch:{ all -> 0x0067 }
        r2 = r4.append(r2);	 Catch:{ all -> 0x0067 }
        r2 = r2.toString();	 Catch:{ all -> 0x0067 }
        com.whatsapp.util.Log.e(r2);	 Catch:{ all -> 0x0067 }
        r3.close();
        goto L_0x003c;
    L_0x0067:
        r0 = move-exception;
        r3.close();
        throw r0;
    L_0x006c:
        r0 = move-exception;
        throw r0;
    L_0x006e:
        r0 = r1;
        goto L_0x0043;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a5f.b(java.lang.String):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.database.sqlite.SQLiteDatabase getWritableDatabase() {
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = com.whatsapp.l5.s;	 Catch:{ all -> 0x0017 }
        r1 = r6.c;	 Catch:{ SQLiteException -> 0x0013 }
        if (r1 == 0) goto L_0x001a;
    L_0x0007:
        r1 = r6.c;	 Catch:{ SQLiteException -> 0x0013 }
        r1 = r1.isOpen();	 Catch:{ SQLiteException -> 0x0013 }
        if (r1 == 0) goto L_0x001a;
    L_0x000f:
        r0 = r6.c;	 Catch:{ SQLiteException -> 0x0015 }
    L_0x0011:
        monitor-exit(r6);
        return r0;
    L_0x0013:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteException -> 0x0015 }
    L_0x0015:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0017 }
    L_0x0017:
        r0 = move-exception;
        monitor-exit(r6);
        throw r0;
    L_0x001a:
        r1 = com.whatsapp.ael.X;	 Catch:{ all -> 0x0017 }
        r1 = com.whatsapp.ael.b(r1);	 Catch:{ all -> 0x0017 }
        if (r1 != 0) goto L_0x0096;
    L_0x0022:
        r1 = z;	 Catch:{ all -> 0x0017 }
        r2 = 92;
        r1 = r1[r2];	 Catch:{ all -> 0x0017 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ all -> 0x0017 }
        r1 = com.whatsapp.ael.X;	 Catch:{ all -> 0x03be }
        r1 = r1.getParentFile();	 Catch:{ all -> 0x03be }
        r1 = r1.exists();	 Catch:{ all -> 0x03be }
        if (r1 != 0) goto L_0x0040;
    L_0x0037:
        r1 = com.whatsapp.ael.X;	 Catch:{ all -> 0x03be }
        r1 = r1.getParentFile();	 Catch:{ all -> 0x03be }
        r1.mkdirs();	 Catch:{ all -> 0x03be }
    L_0x0040:
        r6.a();	 Catch:{ all -> 0x03be }
        r1 = com.whatsapp.ael.X;	 Catch:{ all -> 0x03be }
        r2 = z;	 Catch:{ all -> 0x03be }
        r3 = 12;
        r2 = r2[r3];	 Catch:{ all -> 0x03be }
        com.whatsapp.ael.a(r1, r2);	 Catch:{ all -> 0x03be }
        r1 = com.whatsapp.ael.X;	 Catch:{ all -> 0x03be }
        r1 = r1.getAbsolutePath();	 Catch:{ all -> 0x03be }
        r2 = 0;
        r3 = a;	 Catch:{ all -> 0x03be }
        r4 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
        r3 = r3 | r4;
        r1 = android.database.sqlite.SQLiteDatabase.openDatabase(r1, r2, r3);	 Catch:{ all -> 0x03be }
        r6.c = r1;	 Catch:{ all -> 0x03be }
        r1 = r6.c;	 Catch:{ all -> 0x03be }
        r1.beginTransaction();	 Catch:{ all -> 0x03be }
        r1 = r6.c;	 Catch:{ all -> 0x03be }
        r6.onCreate(r1);	 Catch:{ all -> 0x03be }
        r1 = r6.c;	 Catch:{ all -> 0x03be }
        r1.setTransactionSuccessful();	 Catch:{ all -> 0x03be }
        r1 = r6.c;	 Catch:{ all -> 0x0017 }
        if (r1 == 0) goto L_0x0080;
    L_0x0073:
        r1 = r6.c;	 Catch:{ SQLiteException -> 0x03bc }
        r1 = r1.inTransaction();	 Catch:{ SQLiteException -> 0x03bc }
        if (r1 == 0) goto L_0x0080;
    L_0x007b:
        r1 = r6.c;	 Catch:{ SQLiteException -> 0x03bc }
        r1.endTransaction();	 Catch:{ SQLiteException -> 0x03bc }
    L_0x0080:
        r1 = com.whatsapp.ael.X;	 Catch:{ all -> 0x0017 }
        r2 = z;	 Catch:{ all -> 0x0017 }
        r3 = 22;
        r2 = r2[r3];	 Catch:{ all -> 0x0017 }
        com.whatsapp.ael.a(r1, r2);	 Catch:{ all -> 0x0017 }
        r1 = 1;
        r6.b = r1;	 Catch:{ SQLiteException -> 0x03e0 }
        r1 = 1;
        r6.e = r1;	 Catch:{ SQLiteException -> 0x03e0 }
        r1 = 1;
        r6.d = r1;	 Catch:{ SQLiteException -> 0x03e0 }
        if (r0 == 0) goto L_0x03af;
    L_0x0096:
        r1 = z;	 Catch:{ SQLiteException -> 0x03e0 }
        r2 = 73;
        r1 = r1[r2];	 Catch:{ SQLiteException -> 0x03e0 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ SQLiteException -> 0x03e0 }
        r1 = com.whatsapp.ael.X;	 Catch:{ SQLiteException -> 0x03e0 }
        r1 = r1.getAbsolutePath();	 Catch:{ SQLiteException -> 0x03e0 }
        r2 = 0;
        r3 = a;	 Catch:{ SQLiteException -> 0x03e0 }
        r1 = android.database.sqlite.SQLiteDatabase.openDatabase(r1, r2, r3);	 Catch:{ SQLiteException -> 0x03e0 }
        r6.c = r1;	 Catch:{ SQLiteException -> 0x03e0 }
        r1 = r6.c;	 Catch:{ SQLiteException -> 0x03e0 }
        r1 = r1.isReadOnly();	 Catch:{ SQLiteException -> 0x03e0 }
        if (r1 == 0) goto L_0x00bf;
    L_0x00b6:
        r1 = z;	 Catch:{ SQLiteException -> 0x03e2 }
        r2 = 23;
        r1 = r1[r2];	 Catch:{ SQLiteException -> 0x03e2 }
        com.whatsapp.util.Log.w(r1);	 Catch:{ SQLiteException -> 0x03e2 }
    L_0x00bf:
        r1 = z;	 Catch:{ all -> 0x0017 }
        r2 = 45;
        r1 = r1[r2];	 Catch:{ all -> 0x0017 }
        r1 = r6.a(r1);	 Catch:{ all -> 0x0017 }
        r2 = z;	 Catch:{ all -> 0x0017 }
        r3 = 50;
        r2 = r2[r3];	 Catch:{ all -> 0x0017 }
        r3 = z;	 Catch:{ all -> 0x0017 }
        r4 = 14;
        r3 = r3[r4];	 Catch:{ all -> 0x0017 }
        r4 = z;	 Catch:{ all -> 0x0017 }
        r5 = 60;
        r4 = r4[r5];	 Catch:{ all -> 0x0017 }
        r6.a(r1, r2, r3, r4);	 Catch:{ all -> 0x0017 }
        r2 = z;	 Catch:{ all -> 0x0017 }
        r3 = 9;
        r2 = r2[r3];	 Catch:{ all -> 0x0017 }
        r3 = z;	 Catch:{ all -> 0x0017 }
        r4 = 35;
        r3 = r3[r4];	 Catch:{ all -> 0x0017 }
        r4 = z;	 Catch:{ all -> 0x0017 }
        r5 = 15;
        r4 = r4[r5];	 Catch:{ all -> 0x0017 }
        r6.a(r1, r2, r3, r4);	 Catch:{ all -> 0x0017 }
        r2 = z;	 Catch:{ all -> 0x0017 }
        r3 = 74;
        r2 = r2[r3];	 Catch:{ all -> 0x0017 }
        r3 = z;	 Catch:{ all -> 0x0017 }
        r4 = 86;
        r3 = r3[r4];	 Catch:{ all -> 0x0017 }
        r4 = z;	 Catch:{ all -> 0x0017 }
        r5 = 43;
        r4 = r4[r5];	 Catch:{ all -> 0x0017 }
        r6.a(r1, r2, r3, r4);	 Catch:{ all -> 0x0017 }
        r2 = z;	 Catch:{ all -> 0x0017 }
        r3 = 93;
        r2 = r2[r3];	 Catch:{ all -> 0x0017 }
        r3 = z;	 Catch:{ all -> 0x0017 }
        r4 = 3;
        r3 = r3[r4];	 Catch:{ all -> 0x0017 }
        r4 = z;	 Catch:{ all -> 0x0017 }
        r5 = 20;
        r4 = r4[r5];	 Catch:{ all -> 0x0017 }
        r6.a(r1, r2, r3, r4);	 Catch:{ all -> 0x0017 }
        r2 = z;	 Catch:{ all -> 0x0017 }
        r3 = 90;
        r2 = r2[r3];	 Catch:{ all -> 0x0017 }
        r3 = z;	 Catch:{ all -> 0x0017 }
        r4 = 36;
        r3 = r3[r4];	 Catch:{ all -> 0x0017 }
        r4 = z;	 Catch:{ all -> 0x0017 }
        r5 = 32;
        r4 = r4[r5];	 Catch:{ all -> 0x0017 }
        r6.a(r1, r2, r3, r4);	 Catch:{ all -> 0x0017 }
        r2 = z;	 Catch:{ all -> 0x0017 }
        r3 = 62;
        r2 = r2[r3];	 Catch:{ all -> 0x0017 }
        r3 = z;	 Catch:{ all -> 0x0017 }
        r4 = 85;
        r3 = r3[r4];	 Catch:{ all -> 0x0017 }
        r4 = z;	 Catch:{ all -> 0x0017 }
        r5 = 40;
        r4 = r4[r5];	 Catch:{ all -> 0x0017 }
        r6.a(r1, r2, r3, r4);	 Catch:{ all -> 0x0017 }
        r2 = z;	 Catch:{ all -> 0x0017 }
        r3 = 59;
        r2 = r2[r3];	 Catch:{ all -> 0x0017 }
        r3 = z;	 Catch:{ all -> 0x0017 }
        r4 = 67;
        r3 = r3[r4];	 Catch:{ all -> 0x0017 }
        r4 = z;	 Catch:{ all -> 0x0017 }
        r5 = 33;
        r4 = r4[r5];	 Catch:{ all -> 0x0017 }
        r6.a(r1, r2, r3, r4);	 Catch:{ all -> 0x0017 }
        r2 = z;	 Catch:{ all -> 0x0017 }
        r3 = 61;
        r2 = r2[r3];	 Catch:{ all -> 0x0017 }
        r3 = z;	 Catch:{ all -> 0x0017 }
        r4 = 5;
        r3 = r3[r4];	 Catch:{ all -> 0x0017 }
        r4 = z;	 Catch:{ all -> 0x0017 }
        r5 = 13;
        r4 = r4[r5];	 Catch:{ all -> 0x0017 }
        r6.a(r1, r2, r3, r4);	 Catch:{ all -> 0x0017 }
        r2 = z;	 Catch:{ all -> 0x0017 }
        r3 = 80;
        r2 = r2[r3];	 Catch:{ all -> 0x0017 }
        r3 = z;	 Catch:{ all -> 0x0017 }
        r4 = 29;
        r3 = r3[r4];	 Catch:{ all -> 0x0017 }
        r4 = z;	 Catch:{ all -> 0x0017 }
        r5 = 79;
        r4 = r4[r5];	 Catch:{ all -> 0x0017 }
        r6.a(r1, r2, r3, r4);	 Catch:{ all -> 0x0017 }
        r2 = z;	 Catch:{ all -> 0x0017 }
        r3 = 7;
        r2 = r2[r3];	 Catch:{ all -> 0x0017 }
        r3 = z;	 Catch:{ all -> 0x0017 }
        r4 = 63;
        r3 = r3[r4];	 Catch:{ all -> 0x0017 }
        r4 = z;	 Catch:{ all -> 0x0017 }
        r5 = 37;
        r4 = r4[r5];	 Catch:{ all -> 0x0017 }
        r6.a(r1, r2, r3, r4);	 Catch:{ all -> 0x0017 }
        r1 = z;	 Catch:{ all -> 0x0017 }
        r2 = 30;
        r1 = r1[r2];	 Catch:{ all -> 0x0017 }
        r1 = r6.a(r1);	 Catch:{ all -> 0x0017 }
        r2 = z;	 Catch:{ all -> 0x0017 }
        r3 = 75;
        r2 = r2[r3];	 Catch:{ all -> 0x0017 }
        r3 = z;	 Catch:{ all -> 0x0017 }
        r4 = 0;
        r3 = r3[r4];	 Catch:{ all -> 0x0017 }
        r4 = z;	 Catch:{ all -> 0x0017 }
        r5 = 46;
        r4 = r4[r5];	 Catch:{ all -> 0x0017 }
        r6.a(r1, r2, r3, r4);	 Catch:{ all -> 0x0017 }
        r2 = z;	 Catch:{ all -> 0x0017 }
        r3 = 84;
        r2 = r2[r3];	 Catch:{ all -> 0x0017 }
        r3 = z;	 Catch:{ all -> 0x0017 }
        r4 = 66;
        r3 = r3[r4];	 Catch:{ all -> 0x0017 }
        r4 = z;	 Catch:{ all -> 0x0017 }
        r5 = 65;
        r4 = r4[r5];	 Catch:{ all -> 0x0017 }
        r6.a(r1, r2, r3, r4);	 Catch:{ all -> 0x0017 }
        r2 = z;	 Catch:{ all -> 0x0017 }
        r3 = 68;
        r2 = r2[r3];	 Catch:{ all -> 0x0017 }
        r3 = z;	 Catch:{ all -> 0x0017 }
        r4 = 81;
        r3 = r3[r4];	 Catch:{ all -> 0x0017 }
        r4 = z;	 Catch:{ all -> 0x0017 }
        r5 = 54;
        r4 = r4[r5];	 Catch:{ all -> 0x0017 }
        r6.a(r1, r2, r3, r4);	 Catch:{ all -> 0x0017 }
        r2 = z;	 Catch:{ all -> 0x0017 }
        r3 = 71;
        r2 = r2[r3];	 Catch:{ all -> 0x0017 }
        r3 = z;	 Catch:{ all -> 0x0017 }
        r4 = 51;
        r3 = r3[r4];	 Catch:{ all -> 0x0017 }
        r4 = z;	 Catch:{ all -> 0x0017 }
        r5 = 4;
        r4 = r4[r5];	 Catch:{ all -> 0x0017 }
        r6.a(r1, r2, r3, r4);	 Catch:{ all -> 0x0017 }
        r2 = z;	 Catch:{ all -> 0x0017 }
        r3 = 55;
        r2 = r2[r3];	 Catch:{ all -> 0x0017 }
        r3 = z;	 Catch:{ all -> 0x0017 }
        r4 = 28;
        r3 = r3[r4];	 Catch:{ all -> 0x0017 }
        r4 = z;	 Catch:{ all -> 0x0017 }
        r5 = 77;
        r4 = r4[r5];	 Catch:{ all -> 0x0017 }
        r6.a(r1, r2, r3, r4);	 Catch:{ all -> 0x0017 }
        r2 = z;	 Catch:{ all -> 0x0017 }
        r3 = 70;
        r2 = r2[r3];	 Catch:{ all -> 0x0017 }
        r3 = z;	 Catch:{ all -> 0x0017 }
        r4 = 44;
        r3 = r3[r4];	 Catch:{ all -> 0x0017 }
        r4 = z;	 Catch:{ all -> 0x0017 }
        r5 = 47;
        r4 = r4[r5];	 Catch:{ all -> 0x0017 }
        r6.a(r1, r2, r3, r4);	 Catch:{ all -> 0x0017 }
        r2 = z;	 Catch:{ all -> 0x0017 }
        r3 = 10;
        r2 = r2[r3];	 Catch:{ all -> 0x0017 }
        r3 = z;	 Catch:{ all -> 0x0017 }
        r4 = 38;
        r3 = r3[r4];	 Catch:{ all -> 0x0017 }
        r4 = z;	 Catch:{ all -> 0x0017 }
        r5 = 89;
        r4 = r4[r5];	 Catch:{ all -> 0x0017 }
        r6.a(r1, r2, r3, r4);	 Catch:{ all -> 0x0017 }
        r2 = z;	 Catch:{ all -> 0x0017 }
        r3 = 8;
        r2 = r2[r3];	 Catch:{ all -> 0x0017 }
        r3 = z;	 Catch:{ all -> 0x0017 }
        r4 = 52;
        r3 = r3[r4];	 Catch:{ all -> 0x0017 }
        r4 = z;	 Catch:{ all -> 0x0017 }
        r5 = 17;
        r4 = r4[r5];	 Catch:{ all -> 0x0017 }
        r6.a(r1, r2, r3, r4);	 Catch:{ all -> 0x0017 }
        r2 = z;	 Catch:{ all -> 0x0017 }
        r3 = 1;
        r2 = r2[r3];	 Catch:{ all -> 0x0017 }
        r3 = z;	 Catch:{ all -> 0x0017 }
        r4 = 87;
        r3 = r3[r4];	 Catch:{ all -> 0x0017 }
        r4 = z;	 Catch:{ all -> 0x0017 }
        r5 = 91;
        r4 = r4[r5];	 Catch:{ all -> 0x0017 }
        r6.a(r1, r2, r3, r4);	 Catch:{ all -> 0x0017 }
        r2 = z;	 Catch:{ all -> 0x0017 }
        r3 = 2;
        r2 = r2[r3];	 Catch:{ all -> 0x0017 }
        r3 = z;	 Catch:{ all -> 0x0017 }
        r4 = 6;
        r3 = r3[r4];	 Catch:{ all -> 0x0017 }
        r4 = z;	 Catch:{ all -> 0x0017 }
        r5 = 48;
        r4 = r4[r5];	 Catch:{ all -> 0x0017 }
        r6.a(r1, r2, r3, r4);	 Catch:{ all -> 0x0017 }
        r1 = z;	 Catch:{ all -> 0x0017 }
        r2 = 16;
        r1 = r1[r2];	 Catch:{ all -> 0x0017 }
        r1 = r6.a(r1);	 Catch:{ all -> 0x0017 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ SQLiteException -> 0x03e4 }
        if (r1 == 0) goto L_0x028a;
    L_0x027f:
        r1 = r6.c;	 Catch:{ SQLiteException -> 0x03e4 }
        r2 = z;	 Catch:{ SQLiteException -> 0x03e4 }
        r3 = 41;
        r2 = r2[r3];	 Catch:{ SQLiteException -> 0x03e4 }
        r1.execSQL(r2);	 Catch:{ SQLiteException -> 0x03e4 }
    L_0x028a:
        r1 = z;	 Catch:{ all -> 0x0017 }
        r2 = 82;
        r1 = r1[r2];	 Catch:{ all -> 0x0017 }
        r1 = r6.a(r1);	 Catch:{ all -> 0x0017 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ SQLiteException -> 0x03e6 }
        if (r1 == 0) goto L_0x02b0;
    L_0x029a:
        r1 = r6.c;	 Catch:{ SQLiteException -> 0x03e6 }
        r2 = z;	 Catch:{ SQLiteException -> 0x03e6 }
        r3 = 39;
        r2 = r2[r3];	 Catch:{ SQLiteException -> 0x03e6 }
        r1.execSQL(r2);	 Catch:{ SQLiteException -> 0x03e6 }
        r1 = r6.c;	 Catch:{ SQLiteException -> 0x03e6 }
        r2 = z;	 Catch:{ SQLiteException -> 0x03e6 }
        r3 = 64;
        r2 = r2[r3];	 Catch:{ SQLiteException -> 0x03e6 }
        r1.execSQL(r2);	 Catch:{ SQLiteException -> 0x03e6 }
    L_0x02b0:
        r1 = r6.c;	 Catch:{ all -> 0x0017 }
        r2 = z;	 Catch:{ all -> 0x0017 }
        r3 = 24;
        r2 = r2[r3];	 Catch:{ all -> 0x0017 }
        r1.execSQL(r2);	 Catch:{ all -> 0x0017 }
        r1 = z;	 Catch:{ all -> 0x0017 }
        r2 = 56;
        r1 = r1[r2];	 Catch:{ all -> 0x0017 }
        r1 = r6.a(r1);	 Catch:{ all -> 0x0017 }
        r2 = android.text.TextUtils.isEmpty(r1);	 Catch:{ SQLiteException -> 0x03e8 }
        if (r2 == 0) goto L_0x02e3;
    L_0x02cb:
        r2 = r6.c;	 Catch:{ SQLiteException -> 0x03e8 }
        r3 = z;	 Catch:{ SQLiteException -> 0x03e8 }
        r4 = 69;
        r3 = r3[r4];	 Catch:{ SQLiteException -> 0x03e8 }
        r2.execSQL(r3);	 Catch:{ SQLiteException -> 0x03e8 }
        r2 = r6.c;	 Catch:{ SQLiteException -> 0x03e8 }
        r3 = z;	 Catch:{ SQLiteException -> 0x03e8 }
        r4 = 57;
        r3 = r3[r4];	 Catch:{ SQLiteException -> 0x03e8 }
        r2.execSQL(r3);	 Catch:{ SQLiteException -> 0x03e8 }
        if (r0 == 0) goto L_0x02f8;
    L_0x02e3:
        r0 = z;	 Catch:{ SQLiteException -> 0x03ea }
        r2 = 72;
        r0 = r0[r2];	 Catch:{ SQLiteException -> 0x03ea }
        r2 = z;	 Catch:{ SQLiteException -> 0x03ea }
        r3 = 21;
        r2 = r2[r3];	 Catch:{ SQLiteException -> 0x03ea }
        r3 = z;	 Catch:{ SQLiteException -> 0x03ea }
        r4 = 18;
        r3 = r3[r4];	 Catch:{ SQLiteException -> 0x03ea }
        r6.a(r1, r0, r2, r3);	 Catch:{ SQLiteException -> 0x03ea }
    L_0x02f8:
        r0 = z;	 Catch:{ all -> 0x0017 }
        r1 = 53;
        r0 = r0[r1];	 Catch:{ all -> 0x0017 }
        r0 = r6.a(r0);	 Catch:{ all -> 0x0017 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ SQLiteException -> 0x03ec }
        if (r0 == 0) goto L_0x031e;
    L_0x0308:
        r0 = r6.c;	 Catch:{ SQLiteException -> 0x03ec }
        r1 = z;	 Catch:{ SQLiteException -> 0x03ec }
        r2 = 78;
        r1 = r1[r2];	 Catch:{ SQLiteException -> 0x03ec }
        r0.execSQL(r1);	 Catch:{ SQLiteException -> 0x03ec }
        r0 = r6.c;	 Catch:{ SQLiteException -> 0x03ec }
        r1 = z;	 Catch:{ SQLiteException -> 0x03ec }
        r2 = 26;
        r1 = r1[r2];	 Catch:{ SQLiteException -> 0x03ec }
        r0.execSQL(r1);	 Catch:{ SQLiteException -> 0x03ec }
    L_0x031e:
        r0 = z;	 Catch:{ all -> 0x0017 }
        r1 = 19;
        r0 = r0[r1];	 Catch:{ all -> 0x0017 }
        r0 = r6.a(r0);	 Catch:{ all -> 0x0017 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ SQLiteException -> 0x03ee }
        if (r0 == 0) goto L_0x0339;
    L_0x032e:
        r0 = r6.c;	 Catch:{ SQLiteException -> 0x03ee }
        r1 = z;	 Catch:{ SQLiteException -> 0x03ee }
        r2 = 27;
        r1 = r1[r2];	 Catch:{ SQLiteException -> 0x03ee }
        r0.execSQL(r1);	 Catch:{ SQLiteException -> 0x03ee }
    L_0x0339:
        r0 = com.whatsapp.ael.z();	 Catch:{ all -> 0x0017 }
        if (r0 == 0) goto L_0x0365;
    L_0x033f:
        r0 = z;	 Catch:{ all -> 0x0017 }
        r1 = 94;
        r0 = r0[r1];	 Catch:{ all -> 0x0017 }
        r0 = r6.a(r0);	 Catch:{ all -> 0x0017 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ SQLiteException -> 0x03f0 }
        if (r0 == 0) goto L_0x0365;
    L_0x034f:
        r0 = r6.c;	 Catch:{ SQLiteException -> 0x03f0 }
        r1 = z;	 Catch:{ SQLiteException -> 0x03f0 }
        r2 = 31;
        r1 = r1[r2];	 Catch:{ SQLiteException -> 0x03f0 }
        r0.execSQL(r1);	 Catch:{ SQLiteException -> 0x03f0 }
        r0 = r6.c;	 Catch:{ SQLiteException -> 0x03f0 }
        r1 = z;	 Catch:{ SQLiteException -> 0x03f0 }
        r2 = 49;
        r1 = r1[r2];	 Catch:{ SQLiteException -> 0x03f0 }
        r0.execSQL(r1);	 Catch:{ SQLiteException -> 0x03f0 }
    L_0x0365:
        r0 = z;	 Catch:{ all -> 0x0017 }
        r1 = 83;
        r0 = r0[r1];	 Catch:{ all -> 0x0017 }
        r0 = r6.a(r0);	 Catch:{ all -> 0x0017 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ SQLiteException -> 0x03f2 }
        if (r0 == 0) goto L_0x038b;
    L_0x0375:
        r0 = r6.c;	 Catch:{ SQLiteException -> 0x03f2 }
        r1 = z;	 Catch:{ SQLiteException -> 0x03f2 }
        r2 = 88;
        r1 = r1[r2];	 Catch:{ SQLiteException -> 0x03f2 }
        r0.execSQL(r1);	 Catch:{ SQLiteException -> 0x03f2 }
        r0 = r6.c;	 Catch:{ SQLiteException -> 0x03f2 }
        r1 = z;	 Catch:{ SQLiteException -> 0x03f2 }
        r2 = 76;
        r1 = r1[r2];	 Catch:{ SQLiteException -> 0x03f2 }
        r0.execSQL(r1);	 Catch:{ SQLiteException -> 0x03f2 }
    L_0x038b:
        r0 = z;	 Catch:{ all -> 0x0017 }
        r1 = 34;
        r0 = r0[r1];	 Catch:{ all -> 0x0017 }
        r0 = r6.b(r0);	 Catch:{ all -> 0x0017 }
        r6.b = r0;	 Catch:{ all -> 0x0017 }
        r0 = z;	 Catch:{ all -> 0x0017 }
        r1 = 11;
        r0 = r0[r1];	 Catch:{ all -> 0x0017 }
        r0 = r6.b(r0);	 Catch:{ all -> 0x0017 }
        r6.e = r0;	 Catch:{ all -> 0x0017 }
        r0 = z;	 Catch:{ all -> 0x0017 }
        r1 = 58;
        r0 = r0[r1];	 Catch:{ all -> 0x0017 }
        r0 = r6.b(r0);	 Catch:{ all -> 0x0017 }
        r6.d = r0;	 Catch:{ all -> 0x0017 }
    L_0x03af:
        r0 = r6.c;	 Catch:{ all -> 0x0017 }
        if (r0 == 0) goto L_0x03b8;
    L_0x03b3:
        r0 = r6.c;	 Catch:{ SQLiteException -> 0x03f4 }
        r6.onOpen(r0);	 Catch:{ SQLiteException -> 0x03f4 }
    L_0x03b8:
        r0 = r6.c;	 Catch:{ all -> 0x0017 }
        goto L_0x0011;
    L_0x03bc:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0017 }
    L_0x03be:
        r0 = move-exception;
        r1 = r6.c;	 Catch:{ SQLiteException -> 0x03dc }
        if (r1 == 0) goto L_0x03d0;
    L_0x03c3:
        r1 = r6.c;	 Catch:{ SQLiteException -> 0x03dc }
        r1 = r1.inTransaction();	 Catch:{ SQLiteException -> 0x03dc }
        if (r1 == 0) goto L_0x03d0;
    L_0x03cb:
        r1 = r6.c;	 Catch:{ SQLiteException -> 0x03de }
        r1.endTransaction();	 Catch:{ SQLiteException -> 0x03de }
    L_0x03d0:
        r1 = com.whatsapp.ael.X;	 Catch:{ all -> 0x0017 }
        r2 = z;	 Catch:{ all -> 0x0017 }
        r3 = 25;
        r2 = r2[r3];	 Catch:{ all -> 0x0017 }
        com.whatsapp.ael.a(r1, r2);	 Catch:{ all -> 0x0017 }
        throw r0;	 Catch:{ all -> 0x0017 }
    L_0x03dc:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteException -> 0x03de }
    L_0x03de:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0017 }
    L_0x03e0:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteException -> 0x03e2 }
    L_0x03e2:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0017 }
    L_0x03e4:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0017 }
    L_0x03e6:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0017 }
    L_0x03e8:
        r0 = move-exception;
        throw r0;	 Catch:{ SQLiteException -> 0x03ea }
    L_0x03ea:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0017 }
    L_0x03ec:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0017 }
    L_0x03ee:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0017 }
    L_0x03f0:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0017 }
    L_0x03f2:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0017 }
    L_0x03f4:
        r0 = move-exception;
        r1 = z;	 Catch:{ all -> 0x0017 }
        r2 = 42;
        r1 = r1[r2];	 Catch:{ all -> 0x0017 }
        com.whatsapp.util.Log.b(r1, r0);	 Catch:{ all -> 0x0017 }
        goto L_0x03b8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.a5f.getWritableDatabase():android.database.sqlite.SQLiteDatabase");
    }

    static void a(a5f com_whatsapp_a5f) {
        com_whatsapp_a5f.b();
    }

    public static void a(int i, byte[] bArr, SQLiteStatement sQLiteStatement) {
        if (bArr == null) {
            try {
                sQLiteStatement.bindNull(i);
                if (!l5.s) {
                    return;
                }
            } catch (SQLiteDiskIOException e) {
                throw e;
            }
        }
        sQLiteStatement.bindBlob(i, bArr);
    }

    private void d() {
        try {
            if (!this.b) {
                if (this.c != null) {
                    try {
                        if (this.c.isOpen()) {
                            this.c.execSQL(z[151]);
                            this.b = true;
                        }
                    } catch (SQLiteDiskIOException e) {
                        throw e;
                    }
                }
            }
        } catch (SQLiteDiskIOException e2) {
            throw e2;
        } catch (SQLiteDiskIOException e22) {
            throw e22;
        }
    }

    private void c() {
        try {
            if (!this.e) {
                if (this.c != null) {
                    try {
                        if (this.c.isOpen()) {
                            this.c.execSQL(z[144]);
                            this.e = true;
                        }
                    } catch (SQLiteDiskIOException e) {
                        throw e;
                    }
                }
            }
        } catch (SQLiteDiskIOException e2) {
            throw e2;
        } catch (SQLiteDiskIOException e22) {
            throw e22;
        }
    }

    private boolean a() {
        return (((0 | ael.X.delete()) | new File(ael.X.getPath() + z[137]).delete()) | new File(ael.X.getPath() + z[136]).delete()) | new File(ael.X.getPath() + z[138]).delete();
    }

    static void e(a5f com_whatsapp_a5f) {
        com_whatsapp_a5f.c();
    }

    static void d(a5f com_whatsapp_a5f) {
        com_whatsapp_a5f.e();
    }

    public synchronized void close() {
        try {
            if (this.c != null) {
                if (this.c.isOpen()) {
                    this.c.close();
                }
            }
            this.c = null;
        } catch (SQLiteDiskIOException e) {
            throw e;
        } catch (SQLiteDiskIOException e2) {
            throw e2;
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Log.i(z[153] + i + z[152] + i2);
        onCreate(sQLiteDatabase);
    }
}
