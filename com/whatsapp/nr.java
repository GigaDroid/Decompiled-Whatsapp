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

class nr extends SQLiteOpenHelper {
    private static final String[] z;
    private final Context a;

    static {
        String[] strArr = new String[27];
        String str = "\u0002nB\"\u001eAeA";
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
                        i3 = 4;
                        break;
                    case at.i /*2*/:
                        i3 = 45;
                        break;
                    case at.o /*3*/:
                        i3 = 87;
                        break;
                    default:
                        i3 = arj.Theme_spinnerStyle;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "@jn8\u001e]q]#\u0005@j";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "LlL#\u001fJpY>\u0002Hw^$\u0018@vHx\u001f[eN<\u0003Ya_1\u0000@sH%\u001e@v\u00024\u0003]vX'\u0018\u0000vH:\u0003YmC0";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "LlL#\u001fJpY>\u0002Hw^$\u0018@vHx\u001f[eN<\u0003Ya_1\u0000@sH%\u001e@v";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "LlL#\u001fJpY>\u0002Hw^$\u0018@vHx\u000f@v_\"\u001c[+_2\u0001@rD9\u000b";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "ImA2LFw\r2\u0002LvT'\u0018J`";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u000fpBw";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "LlL#\u001fJpY>\u0002Hw^$\u0018@vHx\u0019_c_6\bJ$X9\u0007AkZ9L@hIw\u001aJv^>\u0003A";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "LlL#\u001fJpY>\u0002Hw^$\u0018@vHx\u0019_c_6\bJ$K%\u0003B$";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "LlL#\u001fJpY>\u0002Hw\u00033\u000e";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "LlL#\u001fJpY>\u0002Hw\u00033\u000e";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u000fpBw";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "LlL#\u001fJpY>\u0002Hw^$\u0018@vHx\b@sC0\u001eN`Hw\n]k@w";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "ZtJ%\rKa\r%\tN`\u00008\u0002C}\r3\r[eO6\u001fJ";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "LlL#\u001fJpY>\u0002Hw^$\u0018@vHx\tAg_.\u001c[aIx\u001eJiB!\u0005Ac";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "@jn8\u001e]q]#\u0005@j";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "ImA2LFw\r2\u0002LvT'\u0018J`";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "LlL#\u001fJpY>\u0002Hw^$\u0018@vHx\u001fXmY4\u0004FjJz\u0018@)Z%\u0005[eO;\t";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "LlL#\u001fJpY>\u0002Hw^$\u0018@vHx\u001f[eN<\u0003Ya_1\u0000@sH%\u001e@v\u00024\u0003]vX'\u0018\u0000vH:\u0003YmC0";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "LlL#\u001fJpY>\u0002Hw^$\u0018@vHx\u000f@v_\"\u001c[+_2\u0001@rD9\u000b";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "LlL#\u001fJpY>\u0002Hw^$\u0018@vHx\u001f[eN<\u0003Ya_1\u0000@sH%\u001e@v";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "lVh\u00168j$y\u0016.cA\r$\t[pD9\u000b\\$\u0005\b\u0005K$d\u00198jCh\u0005L\u007fVd\u001a-}]\r\u001c)v$l\u00028`Mc\u0014>jIh\u00198\u0003nD3L{Au\u0003@KaA2\u0018J`\r\u001e\"{Aj\u0012>\u0003iX#\tpaC3LfJy\u0012+jV\u0001:\u0019[aI\b\u0002@pD1\u0005LeY>\u0003Aw\r\u0015#`Hh\u0016\"\u0003q^23Lq^#\u0003B[C8\u0018FbD4\r[mB9\u001f\u000fFb\u0018 jEc{\u0001Jw^6\u000bJ[Y8\u0002J$y\u00124{(@2\u001f\\eJ23YmO%\r[a\r\u001e\"{Aj\u0012>\u0003iH$\u001fNcH\b\u001c@tX'LfJy\u0012+jV\u0001:\t\\wL0\tphD0\u0004[$d\u00198jCh\u0005@LeA;3[kC2L{Au\u0003@LeA;3YmO%\r[a\r\u001e\"{Aj\u0012>\u0006?";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "kVb\u0007L{Eo\u001b)\u000fMkw)wM~\u0003?\u000fwH#\u0018FjJ$";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "lVh\u00168j$x\u0019%~Qhw%a@h\u000fLEmI\b\u0005A`H/L`J\r$\t[pD9\u000b\\,G>\b\u0006?";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "LlL#\u001fJpY>\u0002Hw^$\u0018@vHx\bJhH#\t\u0002`L#\rMe^2";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "LlL#\u001fJpY>\u0002Hw^$\u0018@vHx\bJhH#\t\u0002`L#\rMe^2C]a^\"\u0000[9";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "LlL#\u001fJpY>\u0002Hw^$\u0018@vHx\tAg_.\u001c[aIx\u001eJiB!\u0005Ac";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    private File a() {
        return this.a.getDatabasePath(z[11]);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Log.i(z[13] + i + z[12] + i2);
        onCreate(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Log.i(z[9] + i + z[7] + i2);
        Log.e(z[8]);
        onCreate(sQLiteDatabase);
    }

    public SQLiteDatabase getWritableDatabase() {
        boolean z = DialogToastActivity.f;
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseCorruptException e) {
            Log.w(z[5]);
            c();
            return super.getWritableDatabase();
        } catch (SQLiteException e2) {
            try {
                if (e2.toString().contains(z[6])) {
                    Log.w(z[1]);
                    c();
                    return super.getWritableDatabase();
                }
                throw e2;
            } catch (SQLiteDatabaseCorruptException e3) {
                throw e3;
            }
        } catch (StackOverflowError e4) {
            Log.w(z[4]);
            StackTraceElement[] stackTrace = e4.getStackTrace();
            int length = stackTrace.length;
            int i = 0;
            while (i < length) {
                try {
                    if (!stackTrace[i].getMethodName().equals(z[2])) {
                        i++;
                        if (z) {
                            break;
                        }
                    }
                    Log.w(z[3]);
                    c();
                    return super.getWritableDatabase();
                } catch (SQLiteDatabaseCorruptException e32) {
                    throw e32;
                }
            }
            throw e4;
        }
    }

    boolean c() {
        boolean delete;
        synchronized (this) {
            close();
            Log.i(z[25]);
            delete = a().delete();
            b().delete();
            Log.i(z[26] + delete);
        }
        return delete;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(z[23]);
        sQLiteDatabase.execSQL(z[22]);
        sQLiteDatabase.execSQL(z[24]);
    }

    nr(Context context) {
        super(context, z[10], null, 1);
        this.a = context;
    }

    private File b() {
        File a = a();
        return new File(a.getPath(), a.getName() + z[0]);
    }

    public SQLiteDatabase getReadableDatabase() {
        boolean z = DialogToastActivity.f;
        try {
            return super.getReadableDatabase();
        } catch (SQLiteDatabaseCorruptException e) {
            Log.w(z[20]);
            c();
            return super.getReadableDatabase();
        } catch (SQLiteException e2) {
            String sQLiteException = e2.toString();
            try {
                if (sQLiteException.contains(z[17])) {
                    Log.w(z[15]);
                    c();
                    return super.getReadableDatabase();
                }
                try {
                    if (sQLiteException.contains(z[14])) {
                        Log.w(z[18]);
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
            Log.w(z[21]);
            StackTraceElement[] stackTrace = e4.getStackTrace();
            int length = stackTrace.length;
            int i = 0;
            while (i < length) {
                try {
                    if (!stackTrace[i].getMethodName().equals(z[16])) {
                        i++;
                        if (z) {
                            break;
                        }
                    }
                    Log.w(z[19]);
                    c();
                    return super.getReadableDatabase();
                } catch (SQLiteDatabaseCorruptException e322) {
                    throw e322;
                }
            }
            throw e4;
        }
    }
}
