package com.whatsapp.contact;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import com.whatsapp.App;
import com.whatsapp.arj;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class b {
    private static final String[] z;

    static {
        String[] strArr = new String[9];
        String str = "?^\bOr2E\\\u001485R\u0005\u0014v8_";
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
                        i3 = 92;
                        break;
                    case at.g /*1*/:
                        i3 = 49;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_checkboxStyle;
                        break;
                    case at.o /*3*/:
                        i3 = 59;
                        break;
                    default:
                        i3 = 23;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "9I\u0005^g(X\tU7+Y\u000fWr|C\u0003Oe5T\u0010Ry;\u0011\u0015Rz|R\u0007Is|R\tUc=R\u0012H;|F\u000fW{|R\tUc5_\u0013^7+X\u0012Sx)EFO\u007f9\\F";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "0V\u0003";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "2D\u000bYr.";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "2P\u000b^";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = ",Y\tUr>^\tP8;T\u0012dt3D\bO8";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = ",Y\tUr>^\tP80^\tPb,\u001e";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = ",Y\tUr>^\tP8;T\u0012dg4^\b^ds";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = ",Y\tUr>^\tP8;T\u0012dd5\\9Xv.U9K\u007f3_\u0003H80V\u0003";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static Set b(f fVar) {
        boolean z = i.d;
        Set hashSet = new HashSet();
        Cursor cursor = null;
        try {
            cursor = d.a(fVar, z[8]);
            if (cursor != null) {
                while (cursor.moveToNext()) {
                    d a = d.a(cursor);
                    if (a != null) {
                        hashSet.add(a);
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return hashSet;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    public static d a(String str) {
        Cursor a;
        Throwable th;
        d dVar = null;
        if (str != null) {
            try {
                a = d.a(str, z[7]);
                if (a != null) {
                    try {
                        if (a.moveToNext()) {
                            dVar = d.a(a);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (a != null) {
                            a.close();
                        }
                        throw th;
                    }
                }
                if (a != null) {
                    a.close();
                }
            } catch (Throwable th3) {
                Throwable th4 = th3;
                a = null;
                th = th4;
                if (a != null) {
                    a.close();
                }
                throw th;
            }
        }
        return dVar;
    }

    private static Set c(Context context) {
        return b(App.C(context) ? f.BOTH : f.VISIBLE_ONLY);
    }

    public static Integer a(f fVar) {
        Throwable th;
        Integer num = null;
        Cursor a;
        try {
            a = d.a(fVar, z[6]);
            if (a != null) {
                try {
                    num = Integer.valueOf(a.getCount());
                } catch (Throwable th2) {
                    th = th2;
                    if (a != null) {
                        a.close();
                    }
                    throw th;
                }
            }
            if (a != null) {
                a.close();
            }
            return num;
        } catch (Throwable th3) {
            Throwable th4 = th3;
            a = null;
            th = th4;
            if (a != null) {
                a.close();
            }
            throw th;
        }
    }

    public static Map a(Context context) {
        Set hashSet = new HashSet();
        hashSet.addAll(c(context));
        hashSet.addAll(b(context));
        return a(hashSet);
    }

    private static Map a(Set set) {
        boolean z = i.d;
        Map hashMap = new HashMap();
        for (d dVar : set) {
            if (!hashMap.containsKey(dVar.a())) {
                hashMap.put(dVar.a(), new ArrayList());
            }
            ((List) hashMap.get(dVar.a())).add(dVar);
            if (z) {
                break;
            }
        }
        return hashMap;
    }

    private static Set b(Context context) {
        Cursor query;
        Object e;
        Throwable th;
        boolean z = i.d;
        Set hashSet = new HashSet();
        if (Build.MANUFACTURER.equalsIgnoreCase(z[3])) {
            Log.i(z[1]);
            try {
                query = App.at.query(Uri.parse(z[0]), null, null, null, null);
                try {
                    int columnIndex = query.getColumnIndex(z[5]);
                    int columnIndex2 = query.getColumnIndex(z[4]);
                    while (query.moveToNext()) {
                        String string = query.getString(columnIndex);
                        String string2 = query.getString(columnIndex2);
                        if (string2 != null) {
                            d a = d.a(context, string, string2);
                            if (a != null) {
                                hashSet.add(a);
                            } else {
                                continue;
                            }
                        }
                        if (z) {
                            break;
                        }
                    }
                    if (query != null) {
                        try {
                            query.close();
                        } catch (Exception e2) {
                            throw e2;
                        }
                    }
                } catch (Exception e22) {
                    throw e22;
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (Exception e4) {
                e = e4;
                query = null;
                try {
                    Log.w(z[2] + e);
                    if (query != null) {
                        query.close();
                    }
                    return hashSet;
                } catch (Throwable th2) {
                    th = th2;
                    if (query != null) {
                        try {
                            query.close();
                        } catch (Exception e222) {
                            throw e222;
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                query = null;
                if (query != null) {
                    query.close();
                }
                throw th;
            }
        }
        return hashSet;
    }
}
