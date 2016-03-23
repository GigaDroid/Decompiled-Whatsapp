package com.whatsapp;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.whatsapp.util.Log;
import de.greenrobot.event.h;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;
import org.whispersystems.bI;
import org.whispersystems.bi;
import org.whispersystems.z;

public final class a5q implements bi {
    private static final String[] z;
    private final a2r a;

    static {
        String[] strArr = new String[11];
        String str = ",\u000fNL&-5KM:,";
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
                        i3 = arj.Theme_ratingBarStyle;
                        break;
                    case at.i /*2*/:
                        i3 = 32;
                        break;
                    case at.o /*3*/:
                        i3 = 40;
                        break;
                    default:
                        i3 = 67;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0012\u001fL\\*/\u0006E\b':\u001cIK&\u007f\u0019UX30\u0018T\b-0\u001e\u0000A./\u0006EE&1\u001eEL";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "-\u000fCG1;";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "8\u0018O]3\u0000\u0003D\b~\u007fU\u0000i\r\u001bJSM-;\u000fRw*;J\u001d\b|";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = ">\u0012OD,+\u0006\u0000A,:\u0012CM3+\u0003OFc(\u0002ID&\u007f\u0018EI'6\u0004G\b0:\u0004DM1\u007f\u0001EQc-\u000fCG1;";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = ",\u000fNL&-5KM:,";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = ",\u000fNL&-5IL";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "-\u000fCG1;";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "8\u0018O]3\u0000\u0003D";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = ",\u000fNL&-5KM:,";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "8\u0018O]3\u0000\u0003D\u0015|\u007f+nlc,\u000fNL&-5IL~`";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public z m720a(bI bIVar) {
        z zVar;
        a(bIVar);
        Cursor query = this.a.getWritableDatabase().query(z[6], new String[]{z[3]}, z[4], new String[]{bIVar.a(), bIVar.b().b()}, null, null, null);
        try {
            if (query.moveToNext()) {
                zVar = new z(query.getBlob(0));
                query.close();
            } else {
                zVar = new z();
            }
        } catch (Throwable e) {
            Log.c(z[5], e);
            zVar = new z();
        } finally {
            query.close();
        }
        return zVar;
    }

    private void a(bI bIVar) {
        if (bIVar == null) {
            try {
                throw new NullPointerException();
            } catch (NullPointerException e) {
                throw e;
            }
        }
        try {
            if (bIVar.b().a() != 0) {
                throw new IllegalArgumentException(z[2]);
            }
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    public void b(bI bIVar) {
        a(bIVar);
        this.a.getWritableDatabase().delete(z[0], z[1], new String[]{bIVar.a(), bIVar.b().b()});
        h.b().a(new f(bIVar.a()));
    }

    a5q(a2r com_whatsapp_a2r) {
        this.a = com_whatsapp_a2r;
    }

    public void a(bI bIVar, z zVar) {
        a(bIVar);
        SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(z[9], bIVar.a());
        contentValues.put(z[7], bIVar.b().b());
        contentValues.put(z[8], zVar.b());
        writableDatabase.replaceOrThrow(z[10], null, contentValues);
        h.b().a(new f(bIVar.a()));
    }
}
