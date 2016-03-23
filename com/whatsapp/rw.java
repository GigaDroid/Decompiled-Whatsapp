package com.whatsapp;

import android.content.SharedPreferences;
import android.support.v4.util.Pair;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class rw {
    private static final String[] z;

    static {
        String[] strArr = new String[20];
        String str = "7\\\u0014\u000b>*^\u0013 ;%W\u0007\n6#\\";
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
                        i3 = 68;
                        break;
                    case at.g /*1*/:
                        i3 = 57;
                        break;
                    case at.i /*2*/:
                        i3 = 96;
                        break;
                    case at.o /*3*/:
                        i3 = 127;
                        break;
                    default:
                        i3 = 87;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "7\\\u0003\n%-M\u0019 9+M\t\u0019>'X\u0014\u00168*J";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "2V\t\u000f\b(V\u0017 3%M\u0001 \"7X\u0007\u001a";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "%L\u0014\u00103+N\u000e\u00138%]?\r8%T\t\u00110\u001bT\u0001\f<";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "%L\u0014\u00103+N\u000e\u00138%]?\u001c2(U\u0015\u001366f\r\u001e$/";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "'V\u000e\t26J\u0001\u000b>+W?\f81W\u0004";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "-W\u0014\u001a%\"X\u0003\u001a\b\"V\u000e\u000b\b7P\u001a\u001a";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "-W\u0010\n#\u001b\\\u000e\u000b26f\u0013\u001a9 ";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "%L\u0014\u00103+N\u000e\u00138%]?\b>\"P?\u001267R";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "'V\rQ ,X\u0014\f64I?\u000f%!_\u0005\r2*Z\u0005\f";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "7\\\u0014\u000b>*^\u0013R\"0P\fP0!MM\u00138'X\fR$!M\u0014\u00169#JO\u001a%6V\u0012R ,P\f\u001az-W\u0013\u001a%0P\u000e\u0018w";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "7\\\u0014\u000b>*^\u0013R\"0P\fP0!MM\u00138'X\fR$!M\u0014\u00169#JO\u001a%6V\u0012R ,P\f\u001az-W\u0013\u001a%0P\u000e\u0018w";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "7\\\u0014\u000b>*^\u0013R\"0P\fP0!MM\u00138'X\fR$!M\u0014\u00169#JO\u001a%6V\u0012R ,P\f\u001az-W\u0013\u001a%0P\u000e\u0018w";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\u0011W\u0005\u0007'!Z\u0014\u001a3dR\u0005\u0006w0@\u0010\u001amd";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "7\\\u0014\u000b>*^\u0013R\"0P\fP$!MM\u00138'X\fR$!M\u0014\u00169#JO\u001a%6V\u0012R ,P\f\u001az-W\u0013\u001a%0P\u000e\u0018w";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "7\\\u0014\u000b>*^\u0013R\"0P\fP$!MM\u00138'X\fR$!M\u0014\u00169#JO\u00196-U\u0005\u001bz0VM\u001c8)T\t\u000b";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "7\\\u0014\u000b>*^\u0013R\"0P\fP$!MM\u00138'X\fR$!M\u0014\u00169#JO\u001a%6V\u0012R ,P\f\u001az-W\u0013\u001a%0P\u000e\u0018w";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "'V\rQ ,X\u0014\f64I?\u000f%!_\u0005\r2*Z\u0005\f";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "7\\\u0014\u000b>*^\u0013R\"0P\fP$!MM\u00138'X\fR$!M\u0014\u00169#JO\u001a%6V\u0012R ,P\f\u001az-W\u0013\u001a%0P\u000e\u0018w";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "7Q\u000f\b\b%U\f 4+W\u0014\u001e40J";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static JSONObject a() {
        boolean z = DialogToastActivity.f;
        SharedPreferences sharedPreferences = App.z().getSharedPreferences(z[10], 0);
        List<Pair> b = b();
        JSONObject jSONObject = new JSONObject();
        for (Pair pair : b) {
            String str = (String) pair.first;
            int intValue = ((Integer) pair.second).intValue();
            try {
                if (sharedPreferences.contains(str)) {
                    switch (intValue) {
                        case v.m /*0*/:
                            try {
                                jSONObject.put(str, sharedPreferences.getInt(str, 0));
                                continue;
                            } catch (Throwable e) {
                                try {
                                    Log.b(z[13] + str + ":" + sharedPreferences.getInt(str, 0), e);
                                    if (!z) {
                                        continue;
                                    }
                                } catch (IllegalStateException e2) {
                                    throw e2;
                                }
                            }
                        case at.g /*1*/:
                            try {
                                jSONObject.put(str, sharedPreferences.getBoolean(str, false));
                                continue;
                            } catch (Throwable e3) {
                                try {
                                    Log.b(z[12] + str + ":" + sharedPreferences.getBoolean(str, false), e3);
                                    if (!z) {
                                        continue;
                                    }
                                } catch (IllegalStateException e22) {
                                    throw e22;
                                }
                            }
                        case at.i /*2*/:
                            try {
                                jSONObject.put(str, sharedPreferences.getString(str, null));
                                continue;
                            } catch (Throwable e32) {
                                try {
                                    Log.b(z[11] + str + ":" + sharedPreferences.getString(str, null), e32);
                                    if (!z) {
                                        break;
                                    }
                                    break;
                                } catch (JSONException e4) {
                                    throw e4;
                                }
                            }
                    }
                    throw new IllegalStateException(z[14] + str + " " + intValue);
                }
                if (z) {
                    return jSONObject;
                }
            } catch (JSONException e42) {
                throw e42;
            } catch (IllegalStateException e222) {
                throw e222;
            }
        }
        return jSONObject;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(@android.support.annotation.NonNull org.json.JSONObject r10) {
        /*
        r2 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = com.whatsapp.App.z();
        r1 = z;
        r4 = 18;
        r1 = r1[r4];
        r4 = r0.getSharedPreferences(r1, r2);
        r5 = r4.edit();
        r0 = b();
        r6 = r0.iterator();
    L_0x001d:
        r0 = r6.hasNext();
        if (r0 == 0) goto L_0x0040;
    L_0x0023:
        r0 = r6.next();
        r0 = (android.support.v4.util.Pair) r0;
        r1 = r0.first;
        r1 = (java.lang.String) r1;
        r0 = r0.second;
        r0 = (java.lang.Integer) r0;
        r0 = r0.intValue();
        r7 = r10.has(r1);	 Catch:{ JSONException -> 0x0051 }
        if (r7 == 0) goto L_0x003e;
    L_0x003b:
        switch(r0) {
            case 0: goto L_0x0055;
            case 1: goto L_0x008a;
            case 2: goto L_0x00bf;
            default: goto L_0x003e;
        };
    L_0x003e:
        if (r3 == 0) goto L_0x001d;
    L_0x0040:
        r0 = r5.commit();	 Catch:{ JSONException -> 0x00f9 }
        if (r0 != 0) goto L_0x00fb;
    L_0x0046:
        r0 = z;	 Catch:{ JSONException -> 0x00f9 }
        r1 = 16;
        r0 = r0[r1];	 Catch:{ JSONException -> 0x00f9 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ JSONException -> 0x00f9 }
        r0 = r2;
    L_0x0050:
        return r0;
    L_0x0051:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0053 }
    L_0x0053:
        r0 = move-exception;
        throw r0;
    L_0x0055:
        r0 = r10.getInt(r1);	 Catch:{ JSONException -> 0x005d }
        r5.putInt(r1, r0);	 Catch:{ JSONException -> 0x005d }
        goto L_0x003e;
    L_0x005d:
        r0 = move-exception;
        r7 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x00f5 }
        r7.<init>();	 Catch:{ IllegalStateException -> 0x00f5 }
        r8 = z;	 Catch:{ IllegalStateException -> 0x00f5 }
        r9 = 15;
        r8 = r8[r9];	 Catch:{ IllegalStateException -> 0x00f5 }
        r7 = r7.append(r8);	 Catch:{ IllegalStateException -> 0x00f5 }
        r7 = r7.append(r1);	 Catch:{ IllegalStateException -> 0x00f5 }
        r8 = ":";
        r7 = r7.append(r8);	 Catch:{ IllegalStateException -> 0x00f5 }
        r8 = 0;
        r8 = r4.getInt(r1, r8);	 Catch:{ IllegalStateException -> 0x00f5 }
        r7 = r7.append(r8);	 Catch:{ IllegalStateException -> 0x00f5 }
        r7 = r7.toString();	 Catch:{ IllegalStateException -> 0x00f5 }
        com.whatsapp.util.Log.b(r7, r0);	 Catch:{ IllegalStateException -> 0x00f5 }
        if (r3 == 0) goto L_0x003e;
    L_0x008a:
        r0 = r10.getBoolean(r1);	 Catch:{ JSONException -> 0x0092 }
        r5.putBoolean(r1, r0);	 Catch:{ JSONException -> 0x0092 }
        goto L_0x003e;
    L_0x0092:
        r0 = move-exception;
        r7 = new java.lang.StringBuilder;	 Catch:{ IllegalStateException -> 0x00f7 }
        r7.<init>();	 Catch:{ IllegalStateException -> 0x00f7 }
        r8 = z;	 Catch:{ IllegalStateException -> 0x00f7 }
        r9 = 17;
        r8 = r8[r9];	 Catch:{ IllegalStateException -> 0x00f7 }
        r7 = r7.append(r8);	 Catch:{ IllegalStateException -> 0x00f7 }
        r7 = r7.append(r1);	 Catch:{ IllegalStateException -> 0x00f7 }
        r8 = ":";
        r7 = r7.append(r8);	 Catch:{ IllegalStateException -> 0x00f7 }
        r8 = 0;
        r8 = r4.getBoolean(r1, r8);	 Catch:{ IllegalStateException -> 0x00f7 }
        r7 = r7.append(r8);	 Catch:{ IllegalStateException -> 0x00f7 }
        r7 = r7.toString();	 Catch:{ IllegalStateException -> 0x00f7 }
        com.whatsapp.util.Log.b(r7, r0);	 Catch:{ IllegalStateException -> 0x00f7 }
        if (r3 == 0) goto L_0x003e;
    L_0x00bf:
        r0 = r10.getString(r1);	 Catch:{ JSONException -> 0x00c8 }
        r5.putString(r1, r0);	 Catch:{ JSONException -> 0x00c8 }
        goto L_0x003e;
    L_0x00c8:
        r0 = move-exception;
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r8 = z;
        r9 = 19;
        r8 = r8[r9];
        r7 = r7.append(r8);
        r7 = r7.append(r1);
        r8 = ":";
        r7 = r7.append(r8);
        r8 = 0;
        r1 = r4.getString(r1, r8);
        r1 = r7.append(r1);
        r1 = r1.toString();
        com.whatsapp.util.Log.b(r1, r0);
        goto L_0x003e;
    L_0x00f5:
        r0 = move-exception;
        throw r0;
    L_0x00f7:
        r0 = move-exception;
        throw r0;
    L_0x00f9:
        r0 = move-exception;
        throw r0;
    L_0x00fb:
        r0 = 1;
        goto L_0x0050;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.rw.a(org.json.JSONObject):boolean");
    }

    private static List b() {
        List arrayList = new ArrayList();
        arrayList.add(new Pair(z[2], Integer.valueOf(1)));
        arrayList.add(new Pair(z[8], Integer.valueOf(1)));
        arrayList.add(new Pair(z[7], Integer.valueOf(2)));
        arrayList.add(new Pair(z[0], Integer.valueOf(2)));
        arrayList.add(new Pair(z[6], Integer.valueOf(1)));
        arrayList.add(new Pair(z[9], Integer.valueOf(0)));
        arrayList.add(new Pair(z[5], Integer.valueOf(0)));
        arrayList.add(new Pair(z[4], Integer.valueOf(0)));
        arrayList.add(new Pair(z[3], Integer.valueOf(1)));
        arrayList.add(new Pair(z[1], Integer.valueOf(1)));
        return arrayList;
    }
}
