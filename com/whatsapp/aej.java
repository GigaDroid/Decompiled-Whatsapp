package com.whatsapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import java.io.File;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

class aej extends SQLiteOpenHelper {
    private static final String[] z;
    private final Context a;

    static {
        String[] strArr = new String[29];
        String str = "V\r\u0018`#R\u001b\u0013|(R\u001c\u0015a#\u000e\f\u0015d(F\u001a\u001bw#\u0001\u000e\b|+\u0001";
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
                        i3 = 33;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_editTextStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 122;
                        break;
                    case at.o /*3*/:
                        i3 = 19;
                        break;
                    default:
                        i3 = 70;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "V\r\u0018`#R\u001b\u0013|(R\u001c\u0015a#\u000e\f\u001f\u007f#U\rWw'U\t\u0018r5D";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "V\r\u0018`#R\u001b\u0013|(R\u001c\u0015a#\u000e\f\u001f\u007f#U\rWw'U\t\u0018r5DG\bv5T\u0004\u000e.";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "V\r\u0018`#R\u001b\u0013|(R\u001c\u0015a#\u000e\r\u0014p4X\u0018\u000ev\"\u000e\u001a\u001f~)W\u0001\u0014t";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "G\u0001\u0016vfH\u001bZv(B\u001a\u0003c2D\f";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "V\r\u0018`#R\u001b\u0013|(R\u001c\u0015a#\u000e\u001b\u000er%J\u0007\fv4G\u0004\u0015d#S\u001a\u0015aiB\u0007\ba3Q\u001cUa#L\u0007\fz(F";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "V\r\u0018`#R\u001b\u0013|(R\u001c\u0015a#\u000e\u001b\u000er%J\u0007\fv4G\u0004\u0015d#S\u001a\u0015a";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "V\r\u0018`#R\u001b\u0013|(R\u001c\u0015a#\u000e\u000b\u0015a4T\u0018\u000e<4D\u0005\u0015e/O\u000f";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "N\u00069|4S\u001d\ng/N\u0006";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "V\r\u0018`#R\u001b\u0013|(R\u001c\u0015a#\u000e\u001d\nt4@\f\u001f3 S\u0007\u00173";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0001\u001c\u00153";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "`$.V\u0014\u0001<;Q\ndH\tv5R\u0001\u0015}5\u0001)>WfD\u0010\nz4@\u001c\u0013|(\u0001!4G\u0003f-(";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "`$.V\u0014\u0001<;Q\ndH\tv5R\u0001\u0015}5\u0001)>WfU\u0001\u0017v)T\u001cZQ\tn$?R\b";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "V\r\u0018`#R\u001b\u0013|(R\u001c\u0015a#\u000e\u001d\nt4@\f\u001f33O\u0003\u0014|1OH\u0015\u007f\"\u0001\u001e\u001fa5H\u0007\u0014";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "V\r\u0018L5D\u001b\tz)O\u001bTw$";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "V\r\u0018`#R\u001b\u0013|(R\u001c\u0015a#\u000e\u000b\u0015a4T\u0018\u000e<4D\u0005\u0015e/O\u000f";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "G\u0001\u0016vfH\u001bZv(B\u001a\u0003c2D\f";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "T\u0018\u001da'E\rZa#@\fW|(M\u0011Zw'U\t\u0018r5D";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    str = "V\r\u0018`#R\u001b\u0013|(R\u001c\u0015a#\u000e\u001b\u000er%J\u0007\fv4G\u0004\u0015d#S\u001a\u0015a";
                    obj = 18;
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    strArr2 = strArr3;
                    str = "V\r\u0018`#R\u001b\u0013|(R\u001c\u0015a#\u000e\u001b\u000er%J\u0007\fv4G\u0004\u0015d#S\u001a\u0015aiB\u0007\ba3Q\u001cUa#L\u0007\fz(F";
                    obj = 19;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "V\r\u0018`#R\u001b\u0013|(R\u001c\u0015a#\u000e\r\u0014p4X\u0018\u000ev\"\u000e\u001a\u001f~)W\u0001\u0014t";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "V\r\u0018`#R\u001b\u0013|(R\u001c\u0015a#\u000e\u001b\rz2B\u0000\u0013}!\f\u001c\u0015>1S\u0001\u000er$M\r";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "N\u00069|4S\u001d\ng/N\u0006";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "\f\u0002\u0015f4O\t\u0016";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "V\r\u0018L5D\u001b\tz)O\u001bTw$";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "e:5Cfu)8_\u0003\u0001!<3\u0003y!)G\u0015\u0001\u001b\u001f`5H\u0007\u0014`";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "b:?R\u0012dH/]\u000fp=?3\u000fo,?KfC\u001a\u0015d5D\u001a%z\"~\u0001\u0014w#YH5]fR\r\t`/N\u0006\t;$S\u0007\r`#S7\u0013wo\u001a";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "b:?R\u0012dH.R\u0004m-Z`#R\u001b\u0013|(RHRL/EH3]\u0012d/?Afq:3^\u0007s1ZX\u0003xH;F\u0012n!4P\u0014d%?]\u0012\r\n\b|1R\r\bL/EH.V\u001euD\tv%S\r\u000e3\u0012d0.?2N\u0003\u001f}fu-\"GjN\u001bZG\u0003y<Vq4N\u001f\tv4~\u001c\u0003c#\u0001<?K\u0012\r\u0004\u001bgfs-;_jM\u0007\u00143\u0014d)6?'B\u000b\u000fa'B\u0011ZA\u0003`$Vc*@\u000b\u001fL(@\u0005\u001f3\u0012d0.?*@\u001b\u000eL'B\u001c\u0013e#\u0001!4G\u0003f-(?2H\u0005\u001f|3UH8\\\tm-;]jD\u0010\nz4@\u001c\u0013|(\u0001!4G\u0003f-(:}";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0001\u001c\u00153";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private File b() {
        File c = c();
        return new File(c.getPath(), c.getName() + z[24]);
    }

    public SQLiteDatabase getWritableDatabase() {
        boolean z = DialogToastActivity.f;
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseCorruptException e) {
            Log.w(z[8]);
            a();
            return super.getWritableDatabase();
        } catch (SQLiteException e2) {
            try {
                if (e2.toString().contains(z[5])) {
                    Log.w(z[4]);
                    a();
                    return super.getWritableDatabase();
                }
                throw e2;
            } catch (SQLiteDatabaseCorruptException e3) {
                throw e3;
            }
        } catch (StackOverflowError e4) {
            Log.w(z[7]);
            StackTraceElement[] stackTrace = e4.getStackTrace();
            int length = stackTrace.length;
            int i = 0;
            while (i < length) {
                try {
                    if (!stackTrace[i].getMethodName().equals(z[9])) {
                        i++;
                        if (z) {
                            break;
                        }
                    }
                    Log.w(z[6]);
                    a();
                    return super.getWritableDatabase();
                } catch (SQLiteDatabaseCorruptException e32) {
                    throw e32;
                }
            }
            throw e4;
        }
    }

    boolean a() {
        boolean delete;
        synchronized (this) {
            close();
            Log.i(z[2]);
            delete = c().delete();
            b().delete();
            Log.i(z[3] + delete);
        }
        return delete;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(z[26]);
        sQLiteDatabase.execSQL(z[28]);
        sQLiteDatabase.execSQL(z[27]);
    }

    public SQLiteDatabase getReadableDatabase() {
        boolean z = DialogToastActivity.f;
        try {
            return super.getReadableDatabase();
        } catch (SQLiteDatabaseCorruptException e) {
            Log.w(z[16]);
            a();
            return super.getReadableDatabase();
        } catch (SQLiteException e2) {
            String sQLiteException = e2.toString();
            try {
                if (sQLiteException.contains(z[17])) {
                    Log.w(z[21]);
                    a();
                    return super.getReadableDatabase();
                }
                try {
                    if (sQLiteException.contains(z[18])) {
                        Log.w(z[22]);
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
            Log.w(z[19]);
            StackTraceElement[] stackTrace = e4.getStackTrace();
            int length = stackTrace.length;
            int i = 0;
            while (i < length) {
                try {
                    if (!stackTrace[i].getMethodName().equals(z[23])) {
                        i++;
                        if (z) {
                            break;
                        }
                    }
                    Log.w(z[20]);
                    a();
                    return super.getReadableDatabase();
                } catch (SQLiteDatabaseCorruptException e322) {
                    throw e322;
                }
            }
            throw e4;
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            Log.i(z[10] + i + z[11] + i2);
            switch (i) {
                case at.g /*1*/:
                    sQLiteDatabase.execSQL(z[13]);
                    sQLiteDatabase.execSQL(z[12]);
                    if (DialogToastActivity.f) {
                        break;
                    }
                    return;
            }
            Log.e(z[14]);
            onCreate(sQLiteDatabase);
        } catch (SQLiteDatabaseCorruptException e) {
            throw e;
        } catch (SQLiteDatabaseCorruptException e2) {
            throw e2;
        }
    }

    aej(Context context) {
        super(context, z[25], null, 2);
        this.a = context;
    }

    private File c() {
        return this.a.getDatabasePath(z[15]);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Log.i(z[0] + i + z[1] + i2);
        onCreate(sQLiteDatabase);
    }
}
