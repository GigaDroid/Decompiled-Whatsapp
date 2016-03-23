package com.whatsapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import java.util.ArrayList;
import java.util.List;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class i_ {
    private static i_ a;
    private static final Object b;
    private static final String[] z;
    private aej c;

    public static i_ a(Context context) {
        if (a == null) {
            synchronized (b) {
                if (a == null) {
                    a = new i_(context);
                }
            }
        }
        return a;
    }

    public void a(String str, String str2, String str3, String str4, String str5, boolean z) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(z[1], str);
        contentValues.put(z[7], str2);
        contentValues.put(z[3], str3);
        contentValues.put(z[2], str4);
        contentValues.put(z[4], str5);
        contentValues.put(z[6], Long.valueOf(System.currentTimeMillis()));
        contentValues.put(z[5], Boolean.valueOf(z));
        this.c.getWritableDatabase().replaceOrThrow(z[0], null, contentValues);
    }

    public void a(String str) {
        this.c.getWritableDatabase().delete(z[28], z[29], new String[]{str});
    }

    static {
        String[] strArr = new String[36];
        String str = ",0mqn0;m";
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
                        i3 = 95;
                        break;
                    case at.g /*1*/:
                        i3 = 85;
                        break;
                    case at.i /*2*/:
                        i3 = 30;
                        break;
                    case at.o /*3*/:
                        i3 = 2;
                        break;
                    default:
                        i3 = 7;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "0&";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "+:ugi";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "='qut:'Av~/0";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "+<sgh*!";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "34mvX>6jkq:";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    str = ",0}pb+";
                    obj = 6;
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    strArr2 = strArr3;
                    str = ",0}pb+";
                    obj = 7;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "/9\u007fab\u0000;\u007fob";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "='qut:'Akc";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "0&";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = ">6}wu>6g";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "34j";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = ":-nku>!wmi";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "3:p";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = ",0mqn0;m";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "+:ugi";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "='qut:'Av~/0";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "34mvX>6jkq:";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "+<sgh*!";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = ",0mqn0;m";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = ">6}wu>6g";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "34j";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = ",0mqn0;m";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "3:p";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "='qut:'Akc\u007fh>=";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "/9\u007fab\u0000;\u007fob";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = ",0mqn0;m";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "='qut:'Akc\u007fh>=";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    str = ",0mqn0;m";
                    obj = 29;
                    i = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    strArr2 = strArr3;
                    str = "34mvX>6jkq:";
                    obj = 30;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "='qut:'Akc\u007fh>=";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = ":-nku>!wmi";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = ",0mqn0;m";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "='qut:'Akc\u007fh>=";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    z = strArr3;
                    b = new Object();
                    return;
                default:
                    strArr2[i] = str;
                    str = "='qut:'Akc";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void a(String str, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(z[33], Long.valueOf(j));
        this.c.getWritableDatabase().update(z[34], contentValues, z[35], new String[]{str});
    }

    public void a(String str, double d, double d2, double d3, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(z[23], Double.valueOf(d));
        contentValues.put(z[25], Double.valueOf(d2));
        contentValues.put(z[22], Double.valueOf(d3));
        contentValues.put(z[27], str2);
        this.c.getWritableDatabase().update(z[24], contentValues, z[26], new String[]{str});
    }

    public void b() {
        this.c.getWritableDatabase().delete(z[21], null, null);
    }

    public void b(String str, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(z[31], Long.valueOf(j));
        this.c.getWritableDatabase().update(z[30], contentValues, z[32], new String[]{str});
    }

    public List a() {
        boolean z = DialogToastActivity.f;
        List arrayList = new ArrayList();
        Cursor query = this.c.getReadableDatabase().query(z[16], new String[]{z[10], z[8], z[17], z[11], z[18], z[13], z[15], z[12], z[9], z[19], z[20], z[14]}, null, null, null, null, null);
        while (query != null) {
            try {
                if (!query.moveToNext()) {
                    break;
                }
                boolean z2;
                i6 i6Var = new i6();
                i6Var.c = query.getString(0);
                i6Var.h = query.getString(1);
                i6Var.i = query.getString(2);
                i6Var.d = query.getString(3);
                i6Var.b = query.getString(4);
                i6Var.l = query.getDouble(5);
                i6Var.e = query.getDouble(6);
                i6Var.a = query.getDouble(7);
                i6Var.j = query.getString(8);
                i6Var.f = query.getLong(9);
                if (query.getInt(10) > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                i6Var.g = z2;
                i6Var.k = query.getLong(11);
                arrayList.add(i6Var);
                if (z) {
                    break;
                }
            } catch (Throwable th) {
                if (query != null) {
                    query.close();
                }
            }
        }
        if (query != null) {
            query.close();
        }
        return arrayList;
    }

    private i_(Context context) {
        this.c = new aej(context);
    }
}
