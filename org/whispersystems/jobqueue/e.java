package org.whispersystems.jobqueue;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.util.Log;
import com.whatsapp.arj;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class e {
    private static final String d;
    public static int f;
    private static final String[] z;
    private final Context a;
    private final k b;
    private final t c;
    private final u e;

    public List a(j jVar) {
        return a(jVar, z[10]);
    }

    static {
        String[] strArr = new String[14];
        String str = "Bl\u000e\u0013G";
        int i = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i2 = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i3 = 0; length > i3; i3++) {
                int i4;
                char c = cArr[i3];
                switch (i3 % 5) {
                    case v.m /*0*/:
                        i4 = 51;
                        break;
                    case at.g /*1*/:
                        i4 = 25;
                        break;
                    case at.i /*2*/:
                        i4 = arj.Theme_seekBarStyle;
                        break;
                    case at.o /*3*/:
                        i4 = arj.Theme_checkboxStyle;
                        break;
                    default:
                        i4 = 34;
                        break;
                }
                cArr[i3] = (char) (i4 ^ c);
            }
            str = new String(cArr).intern();
            switch (i) {
                case v.m /*0*/:
                    strArr2[i2] = str;
                    str = "Zm\u000e\u000b";
                    i2 = 2;
                    strArr2 = strArr3;
                    i = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i2] = str;
                    str = "Vw\b\u0014[Cm\u000e\u0002";
                    i2 = 3;
                    strArr2 = strArr3;
                    i = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i2] = str;
                    str = "lp\u000f";
                    i2 = 4;
                    strArr2 = strArr3;
                    i = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i2] = str;
                    i2 = 5;
                    strArr2 = strArr3;
                    str = "c|\u0019\u0015K@m\u000e\bV`m\u0004\u0014G";
                    i = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i2] = str;
                    i2 = 6;
                    str = "ls\u0004\u0004SF|\u001e\u0003\u000f";
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i2] = str;
                    i2 = 7;
                    str = "Bl\u000e\u0013G";
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i2] = str;
                    i2 = 8;
                    str = "Zm\u000e\u000b";
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i2] = str;
                    i2 = 9;
                    str = "Vw\b\u0014[Cm\u000e\u0002";
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i2] = str;
                    i2 = 10;
                    str = "Vw\b\u0014[Cm\u000e\u0002\u0002\u000e9Z";
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i2] = str;
                    i2 = 11;
                    str = "lp\u000fF\u001f\u0013&";
                    i = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i2] = str;
                    i2 = 12;
                    str = "Bl\u000e\u0013G";
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i2] = str;
                    i2 = 13;
                    str = "Vw\b\u0014[Cm\u000e\u0002\u0002\u000e9[";
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i2] = str;
                    z = strArr3;
                    char[] toCharArray2 = "pK.'vv9?'`\u007f\\KCQ\u00131N\u0015\u0002zW?#evKK6pzT*4{\u0013R.?\u000e\u0013<\u0018FvvA?Fl|MK(w\u007fUGF\u0007@9\"(vv^.4\u0002w\\-'w\u007fMKV\u000b\b".toCharArray();
                    i2 = toCharArray2.length;
                    toCharArray = toCharArray2;
                    for (int i5 = 0; i2 > i5; i5++) {
                        char c2 = toCharArray[i5];
                        switch (i5 % 5) {
                            case v.m /*0*/:
                                i = 51;
                                break;
                            case at.g /*1*/:
                                i = 25;
                                break;
                            case at.i /*2*/:
                                i = arj.Theme_seekBarStyle;
                                break;
                            case at.o /*3*/:
                                i = arj.Theme_checkboxStyle;
                                break;
                            default:
                                i = 34;
                                break;
                        }
                        toCharArray[i5] = (char) (i ^ c2);
                    }
                    String intern = new String(toCharArray).intern();
                    Object[] objArr = new Object[4];
                    String str2 = "Bl\u000e\u0013G";
                    Object obj = -1;
                    Object[] objArr2 = objArr;
                    Object[] objArr3 = objArr;
                    i4 = 0;
                    while (true) {
                        char[] toCharArray3 = str2.toCharArray();
                        int length2 = toCharArray3.length;
                        char[] cArr2 = toCharArray3;
                        for (length = 0; length2 > length; length++) {
                            int i6;
                            c = cArr2[length];
                            switch (length % 5) {
                                case v.m /*0*/:
                                    i6 = 51;
                                    break;
                                case at.g /*1*/:
                                    i6 = 25;
                                    break;
                                case at.i /*2*/:
                                    i6 = arj.Theme_seekBarStyle;
                                    break;
                                case at.o /*3*/:
                                    i6 = arj.Theme_checkboxStyle;
                                    break;
                                default:
                                    i6 = 34;
                                    break;
                            }
                            cArr2[length] = (char) (i6 ^ c);
                        }
                        str2 = new String(cArr2).intern();
                        switch (obj) {
                            case v.m /*0*/:
                                objArr2[i4] = str2;
                                str2 = "Zm\u000e\u000b";
                                i4 = 2;
                                objArr2 = objArr3;
                                obj = 1;
                                break;
                            case at.g /*1*/:
                                objArr2[i4] = str2;
                                str2 = "Vw\b\u0014[Cm\u000e\u0002";
                                i4 = 3;
                                objArr2 = objArr3;
                                obj = 2;
                                break;
                            case at.i /*2*/:
                                objArr2[i4] = str2;
                                d = String.format(intern, objArr3);
                                return;
                            default:
                                objArr2[i4] = str2;
                                str2 = "lp\u000f";
                                i4 = 1;
                                objArr2 = objArr3;
                                obj = null;
                                break;
                        }
                    }
                default:
                    strArr2[i2] = str;
                    str = "lp\u000fFc`Z";
                    i2 = 1;
                    strArr2 = strArr3;
                    i = 0;
                    break;
            }
        }
    }

    public e(Context context, String str, t tVar, u uVar) {
        int i = f;
        this.b = new k(context, z[6] + str);
        this.a = context;
        this.c = tVar;
        this.e = uVar;
        if (v.d != 0) {
            f = i + 1;
        }
    }

    public void a(long j) {
        this.b.getWritableDatabase().delete(z[12], z[11], new String[]{String.valueOf(j)});
    }

    public List b() {
        return a(null, z[13]);
    }

    static String a() {
        return d;
    }

    public void a(v vVar) {
        int i = f;
        ContentValues contentValues = new ContentValues();
        contentValues.put(z[8], this.c.a(vVar));
        contentValues.put(z[9], Boolean.valueOf(vVar.a() != null));
        vVar.a(this.b.getWritableDatabase().insert(z[7], null, contentValues));
        if (i != 0) {
            v.d++;
        }
    }

    private List a(j jVar, String str) {
        Throwable e;
        int i = f;
        List linkedList = new LinkedList();
        Cursor query;
        try {
            query = this.b.getReadableDatabase().query(z[0], null, str, null, null, null, z[1], null);
            do {
                try {
                    if (!query.moveToNext()) {
                        break;
                    }
                    long j = query.getLong(query.getColumnIndexOrThrow(z[4]));
                    try {
                        v a = this.c.a(jVar, query.getInt(query.getColumnIndexOrThrow(z[3])) == 1, query.getString(query.getColumnIndexOrThrow(z[2])));
                        a.a(j);
                        a.a(jVar);
                        this.e.a(this.a, a);
                        linkedList.add(a);
                        continue;
                    } catch (Throwable e2) {
                        Log.w(z[5], e2);
                        a(j);
                        continue;
                    }
                } catch (IOException e3) {
                    throw e3;
                } catch (Throwable th) {
                    e2 = th;
                }
            } while (i == 0);
            if (query != null) {
                try {
                    query.close();
                } catch (IOException e32) {
                    throw e32;
                }
            }
            return linkedList;
        } catch (Throwable th2) {
            e2 = th2;
            query = null;
            if (query != null) {
                try {
                    query.close();
                } catch (IOException e322) {
                    throw e322;
                }
            }
            throw e2;
        }
    }
}
