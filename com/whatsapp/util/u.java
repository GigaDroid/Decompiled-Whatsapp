package com.whatsapp.util;

import android.app.Activity;
import android.support.v7.app.AlertDialog.Builder;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import com.whatsapp.App;
import com.whatsapp.WAAppCompatActivity;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class u {
    private static boolean a;
    private static JSONArray b;
    private static int c;
    private static String d;
    public static File e;
    private static Map f;
    private static JSONObject g;
    private static FileWriter h;
    private static String i;
    private static Set j;
    private static String k;
    private static String l;
    private static Map m;
    public static boolean n;
    private static Map o;
    private static final String[] z;

    public static void a(Activity activity) {
        try {
            if (LayoutInflater.from(activity).getFactory() != null) {
                Log.i(z[54]);
            } else {
                LayoutInflater.from(activity).setFactory(new e(activity));
            }
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    static boolean a(View view) {
        return b(view);
    }

    public static void d() {
        int i = Log.h;
        try {
            if (h != null) {
                g.put(z[47], z[50]);
                g.put(z[45], k);
                g.put(z[46], b);
                h.write(g.toString() + "\n");
                h.flush();
                h.close();
            }
        } catch (UnsupportedOperationException e) {
            throw e;
        } catch (IOException e2) {
            Log.e(z[49] + e2.toString());
        } catch (JSONException e3) {
            Log.e(z[43] + e3.toString());
        }
        o.put(i, Integer.valueOf(c));
        int i2 = c + 1;
        while (true) {
            String str;
            if (i2 < 10) {
                str = "0" + i2;
            } else {
                str = String.valueOf(i2);
            }
            File file = new File(e, d + l + "-" + i + "-" + str + z[44]);
            try {
                if (!file.exists() && i == 0) {
                    break;
                }
                file.delete();
                int i3 = i2 + 1;
                if (i != 0) {
                    break;
                }
                i2 = i3;
            } catch (IOException e22) {
                throw e22;
            } catch (IOException e222) {
                throw e222;
            }
        }
        try {
            h = null;
            i = null;
            c = 0;
            g = null;
            b = null;
            f = null;
            m = null;
            e = null;
            Log.i(z[48]);
            if (WAAppCompatActivity.c != 0) {
                Log.h = i + 1;
            }
        } catch (IOException e2222) {
            throw e2222;
        }
    }

    static String a(String str) {
        l = str;
        return str;
    }

    static JSONArray b() {
        return b;
    }

    public static Builder c(Activity activity) {
        Builder builder = new Builder(activity);
        builder.setTitle(z[51]);
        builder.setMessage(z[53]);
        View inflate = activity.getLayoutInflater().inflate(2130903283, null);
        builder.setView(inflate);
        builder.setPositiveButton(z[52], new af((EditText) inflate.findViewById(2131755924), (CheckBox) inflate.findViewById(2131755925), (CheckBox) inflate.findViewById(2131755926), activity));
        return builder;
    }

    static String c() {
        return i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.view.ViewGroup r11, android.app.Activity r12, boolean r13) {
        /*
        r10 = 0;
        r3 = com.whatsapp.util.Log.h;
        r0 = i;	 Catch:{ UnsupportedOperationException -> 0x0008 }
        if (r0 != 0) goto L_0x000a;
    L_0x0007:
        return;
    L_0x0008:
        r0 = move-exception;
        throw r0;
    L_0x000a:
        r0 = z;
        r1 = 24;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = r11.getHeight();
        r1 = r11.getWidth();
        r0 = r0 * r1;
        r0 = (long) r0;
        r2 = r11.hashCode();
        r4 = (long) r2;
        r6 = r11.getDrawingTime();
        r4 = r4 + r6;
        r0 = r0 + r4;
        r2 = new java.lang.StringBuilder;	 Catch:{ UnsupportedOperationException -> 0x0061 }
        r2.<init>();	 Catch:{ UnsupportedOperationException -> 0x0061 }
        r4 = z;	 Catch:{ UnsupportedOperationException -> 0x0061 }
        r5 = 26;
        r4 = r4[r5];	 Catch:{ UnsupportedOperationException -> 0x0061 }
        r2 = r2.append(r4);	 Catch:{ UnsupportedOperationException -> 0x0061 }
        r2 = r2.append(r0);	 Catch:{ UnsupportedOperationException -> 0x0061 }
        r2 = r2.toString();	 Catch:{ UnsupportedOperationException -> 0x0061 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ UnsupportedOperationException -> 0x0061 }
        a(r11, r0, r13, r12);	 Catch:{ UnsupportedOperationException -> 0x0061 }
        r2 = f;	 Catch:{ UnsupportedOperationException -> 0x0061 }
        if (r2 == 0) goto L_0x0055;
    L_0x0049:
        r2 = f;	 Catch:{ UnsupportedOperationException -> 0x005f }
        r4 = java.lang.Long.valueOf(r0);	 Catch:{ UnsupportedOperationException -> 0x005f }
        r2 = r2.containsKey(r4);	 Catch:{ UnsupportedOperationException -> 0x005f }
        if (r2 != 0) goto L_0x0063;
    L_0x0055:
        r0 = z;	 Catch:{ UnsupportedOperationException -> 0x005f }
        r1 = 23;
        r0 = r0[r1];	 Catch:{ UnsupportedOperationException -> 0x005f }
        com.whatsapp.util.Log.i(r0);	 Catch:{ UnsupportedOperationException -> 0x005f }
        goto L_0x0007;
    L_0x005f:
        r0 = move-exception;
        throw r0;
    L_0x0061:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x005f }
    L_0x0063:
        r2 = f;
        r0 = java.lang.Long.valueOf(r0);
        r0 = r2.get(r0);
        r0 = (java.lang.Integer) r0;
        r4 = r0.intValue();
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 25;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.append(r4);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r0 = new java.util.ArrayList;
        r0.<init>();
        a(r11, r0);
        r5 = r0.iterator();
    L_0x0099:
        r0 = r5.hasNext();
        if (r0 == 0) goto L_0x0007;
    L_0x009f:
        r0 = r5.next();
        r0 = (android.widget.TextView) r0;
        r1 = r0.getLayout();
        r6 = r0.getPaint();
        r2 = r0.getText();
        r7 = a;	 Catch:{ UnsupportedOperationException -> 0x0182 }
        if (r7 == 0) goto L_0x00bb;
    L_0x00b5:
        r7 = -16711936; // 0xffffffffff00ff00 float:-1.7146522E38 double:NaN;
        r0.setTextColor(r7);	 Catch:{ UnsupportedOperationException -> 0x0182 }
    L_0x00bb:
        r7 = r0.getLineCount();
        if (r7 <= 0) goto L_0x00d3;
    L_0x00c1:
        r8 = r7 + -1;
        r8 = r1.getLineStart(r8);
        r7 = r7 + -1;
        r1 = r1.getLineEnd(r7);
        r1 = r2.subSequence(r8, r1);
        if (r3 == 0) goto L_0x00d4;
    L_0x00d3:
        r1 = r2;
    L_0x00d4:
        r7 = r1.length();
        r1 = r6.measureText(r1, r10, r7);
        r6 = r0.getWidth();
        r7 = r0.getCompoundPaddingLeft();
        r6 = r6 - r7;
        r7 = r0.getCompoundPaddingRight();
        r6 = r6 - r7;
        r6 = (float) r6;
        r2 = r2.toString();
        r7 = new java.lang.StringBuilder;	 Catch:{ UnsupportedOperationException -> 0x0184 }
        r7.<init>();	 Catch:{ UnsupportedOperationException -> 0x0184 }
        r8 = z;	 Catch:{ UnsupportedOperationException -> 0x0184 }
        r9 = 22;
        r8 = r8[r9];	 Catch:{ UnsupportedOperationException -> 0x0184 }
        r7 = r7.append(r8);	 Catch:{ UnsupportedOperationException -> 0x0184 }
        r7 = r7.append(r2);	 Catch:{ UnsupportedOperationException -> 0x0184 }
        r7 = r7.toString();	 Catch:{ UnsupportedOperationException -> 0x0184 }
        com.whatsapp.util.Log.i(r7);	 Catch:{ UnsupportedOperationException -> 0x0184 }
        r7 = 0;
        r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1));
        if (r7 <= 0) goto L_0x017e;
    L_0x010e:
        r0 = b(r0);	 Catch:{ UnsupportedOperationException -> 0x0186 }
        if (r0 == 0) goto L_0x017e;
    L_0x0114:
        r0 = android.text.TextUtils.isEmpty(r2);	 Catch:{ UnsupportedOperationException -> 0x0188 }
        if (r0 != 0) goto L_0x017e;
    L_0x011a:
        r0 = h;	 Catch:{ UnsupportedOperationException -> 0x0188 }
        if (r0 == 0) goto L_0x017e;
    L_0x011e:
        r7 = new org.json.JSONArray;
        r7.<init>();
        r0 = 10;
        if (r4 >= r0) goto L_0x018c;
    L_0x0127:
        r0 = new java.lang.StringBuilder;	 Catch:{ UnsupportedOperationException -> 0x018a }
        r0.<init>();	 Catch:{ UnsupportedOperationException -> 0x018a }
        r8 = "0";
        r0 = r0.append(r8);	 Catch:{ UnsupportedOperationException -> 0x018a }
        r0 = r0.append(r4);	 Catch:{ UnsupportedOperationException -> 0x018a }
        r0 = r0.toString();	 Catch:{ UnsupportedOperationException -> 0x018a }
    L_0x013b:
        r8 = new java.lang.StringBuilder;	 Catch:{ UnsupportedOperationException -> 0x0191 }
        r8.<init>();	 Catch:{ UnsupportedOperationException -> 0x0191 }
        r9 = i;	 Catch:{ UnsupportedOperationException -> 0x0191 }
        r8 = r8.append(r9);	 Catch:{ UnsupportedOperationException -> 0x0191 }
        r9 = "-";
        r8 = r8.append(r9);	 Catch:{ UnsupportedOperationException -> 0x0191 }
        r0 = r8.append(r0);	 Catch:{ UnsupportedOperationException -> 0x0191 }
        r0 = r0.toString();	 Catch:{ UnsupportedOperationException -> 0x0191 }
        r7.put(r0);	 Catch:{ UnsupportedOperationException -> 0x0191 }
        r7.put(r2);	 Catch:{ UnsupportedOperationException -> 0x0191 }
        r8 = (double) r6;	 Catch:{ UnsupportedOperationException -> 0x0191 }
        r0 = java.lang.Double.valueOf(r8);	 Catch:{ UnsupportedOperationException -> 0x0191 }
        r7.put(r0);	 Catch:{ UnsupportedOperationException -> 0x0191 }
        r8 = (double) r1;	 Catch:{ UnsupportedOperationException -> 0x0191 }
        r0 = java.lang.Double.valueOf(r8);	 Catch:{ UnsupportedOperationException -> 0x0191 }
        r7.put(r0);	 Catch:{ UnsupportedOperationException -> 0x0191 }
        r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1));
        if (r0 <= 0) goto L_0x0175;
    L_0x016f:
        r0 = 1;
        r7.put(r0);	 Catch:{ UnsupportedOperationException -> 0x0193 }
        if (r3 == 0) goto L_0x0179;
    L_0x0175:
        r0 = 0;
        r7.put(r0);	 Catch:{ UnsupportedOperationException -> 0x0193 }
    L_0x0179:
        r0 = b;
        r0.put(r7);
    L_0x017e:
        if (r3 == 0) goto L_0x0099;
    L_0x0180:
        goto L_0x0007;
    L_0x0182:
        r0 = move-exception;
        throw r0;
    L_0x0184:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x0186 }
    L_0x0186:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x0188 }
    L_0x0188:
        r0 = move-exception;
        throw r0;
    L_0x018a:
        r0 = move-exception;
        throw r0;
    L_0x018c:
        r0 = java.lang.String.valueOf(r4);
        goto L_0x013b;
    L_0x0191:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x0193 }
    L_0x0193:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.u.a(android.view.ViewGroup, android.app.Activity, boolean):void");
    }

    public static void b(Activity activity) {
        try {
            if (App.j != 3) {
                throw new UnsupportedOperationException();
            }
            try {
                Log.i(z[28]);
                if (i != null) {
                    LayoutInflater layoutInflater = activity.getLayoutInflater();
                    try {
                        if (layoutInflater.getFactory() != null) {
                            Log.i(z[27]);
                        } else {
                            layoutInflater.setFactory(new c3(activity));
                        }
                    } catch (UnsupportedOperationException e) {
                        throw e;
                    }
                }
            } catch (UnsupportedOperationException e2) {
                throw e2;
            }
        } catch (UnsupportedOperationException e22) {
            throw e22;
        }
    }

    static boolean a(boolean z) {
        a = z;
        return z;
    }

    static FileWriter f() {
        return h;
    }

    private static void a(View view, List list) {
        int i = Log.h;
        if (view instanceof ViewGroup) {
            int childCount = ((ViewGroup) view).getChildCount();
            int i2 = 0;
            while (i2 < childCount) {
                a(((ViewGroup) view).getChildAt(i2), list);
                int i3 = i2 + 1;
                if (i != 0) {
                    break;
                }
                i2 = i3;
            }
            if (i == 0) {
                return;
            }
        }
        try {
            if (view instanceof TextView) {
                list.add((TextView) view);
            }
        } catch (UnsupportedOperationException e) {
            throw e;
        }
    }

    public static void a(Activity activity, boolean z) {
        a((ViewGroup) activity.findViewById(16908290).getRootView(), activity, z);
    }

    static void b(View view, long j, boolean z, Activity activity) {
        a(view, j, z, activity);
    }

    static {
        String[] strArr = new String[55];
        String str = "'y0Y8";
        boolean z = true;
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
                        i3 = 9;
                        break;
                    case at.g /*1*/:
                        i3 = 19;
                        break;
                    case at.i /*2*/:
                        i3 = 67;
                        break;
                    case at.o /*3*/:
                        i3 = 54;
                        break;
                    default:
                        i3 = 86;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    str = "}a6X5hg*Y8\\g*Z%&`&B\u0003y3 D3hg*X1)g1C8jr7_9g`cP?evcS.jv3B?f}c";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "`d";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "av";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = ")w*D3jg,D/";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "}a6X5hg*Y8z";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "s{";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "}a6X5hg*Y8z>";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    str = "`}";
                    z = true;
                    i = 9;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    strArr2 = strArr3;
                    str = "'y0Y8";
                    z = true;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "`w";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "}a6X5hg*Y8\\g*Z%&`&B\u0003y3.W2l3";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "}a6X5hg*Y8\\g*Z%&`&B#y3 Y;y\u007f&B333";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "Zp1S3g`+Y\"z";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "}a6X5hg*Y8\\g*Z%&`&B\u0003y3.W2l3\u0010U$lv-E>fg0\u00162`a&U\"fa:";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "yg";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "}a6X5hg*Y8\\g*Z%&u*X2Gv4w8ma,_2)`(_&yv'";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "}a6X5hg*Y8\\g*Z%&u*X2Gv4w8ma,_2)g&N\"33";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    str = "}a6X5hg*Y8\\g*Z%&u*X2Gv4w8ma,_2)x&Ol)";
                    z = true;
                    i = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    strArr2 = strArr3;
                    str = "}a6X5hg*Y8\\g*Z%&u*X2Gv4w8ma,_2";
                    z = true;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "}a6X5hg*Y8\\g*Z%&u*X2Gv4w8ma,_2)`*Rl)";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "}a6X5hg*Y8\\g*Z%&u*X2]a6X5hg*Y8z37S.})c";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "}a6X5hg*Y8\\g*Z%&u*X2]a6X5hg*Y8z30]?yc&R";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "}a6X5hg*Y8\\g*Z%&u*X2]a6X5hg*Y8z";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "}a6X5hg*Y8\\g*Z%&u*X2]a6X5hg*Y8z30_233";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "}a6X5hg*Y8\\g*Z%&u*X2]a6X5hg*Y8z3(S/33";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "}a6X5hg*Y8\\g*Z%&u*X2Dv-C\u0002{f-U7}z,X%)u\"U\"fa:\u00167ea&W2p3&N?zg0";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "}a6X5hg*Y8\\g*Z%&u*X2Dv-C\u0002{f-U7}z,X%";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "}a6X5hg*Y8\\g*Z%&g\"]3Zp1S3g`+Y\")` D3l}0^9}30C5jv0Ev~z7^vzz'\u0016";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = ")a,Y\"33";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "}a6X5hg*Y8\\g*Z%&g\"]3Zp1S3g`+Y\")r7B3dc7\u0016%ja&S8z{,Bvfuc[3gf";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "~z-R9~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "}a6X5hg*Y8\\g*Z%&g\"]3Zp1S3g`+Y\")`&D?l`c_%)}6Z:";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "}a6X5hg*Y8\\g*Z%&g\"]3Zp1S3g`+Y\")v;U3yg*Y8)p1S7}z-Qvoz/Sv";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "}a6X5hg*Y8\\g*Z%&g\"]3Zp1S3g`+Y\")`*Rv431Y9}G,e\u001fM=$S\"!x&O\u007f230_2)z0\u0016";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "}a6X5hg*Y8\\g*Z%&g\"]3Zp1S3g`+Y\")q*B;hccE7dvx\u0016\"fL4D?}vy\u0016";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "}a6X5hg*Y8\\g*Z%&g\"]3Zp1S3g`+Y\")z-U$l~&X\"lw\u0010\u007f\u0012``cB$|vx\u0016%`wc_%)";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "}a6X5hg*Y8\\g*Z%&g\"]3Zp1S3g`+Y\")r7B3dc7\u0016%ja&S8z{,BvfucP#e\u007fcW5}z5_\"p";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "}a6X5hg*Y8\\g*Z%&g\"]3Zp1S3g`+Y\")z,\u00163qp&F\"`|-";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "}a6X5hg*Y8\\g*Z%&g\"]3Zp1S3g`+Y\"){&_1agcB9f3/W$nvc\u001bh)\u007f*]3ejcX9}3\"\u0016;l}6\rvk~\u001c^3`t+Bv43";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "}a6X5hg*Y8\\g*Z%&g\"]3Zp1S3g`+Y\")>nB$|} W\"`|-E\u0005ja&S8z{,B\u001fM(";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "'c-Q";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "}a6X5hg*Y8\\g*Z%&u*X7ez9SvC@\fxvlk S&}z,Xv";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "'c-Q";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "e| W:l";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "zg1_8n`";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "y\u007f\"B0fa.";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "}a6X5hg*Y8\\g*Z%&u*X7ez9Svj|.F:lg&";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "}a6X5hg*Y8\\g*Z%&u*X7ez9Svlk S&}z,Xvj\u007f,E?gtcB$|} W\"`|-Evoz/Sv";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "H}'D9`w";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "Gv4\u0016\u0005la*S%";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "Kv$_8)@&D?l`";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "!vmQx)P\u000bw\u0002Z:";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    str = "}a6X5hg*Y8\\g*Z%&z-E\"h\u007f/{3gf\nX%yv B9{3%W5}|1Ovh\u007f1S7mjcS.``7E";
                    z = true;
                    i = 54;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i] = str;
                    z = strArr3;
                    h = null;
                    i = null;
                    char[] toCharArray2 = "h}'D9`wn".toCharArray();
                    i = toCharArray2.length;
                    toCharArray = toCharArray2;
                    for (int i4 = 0; i > i4; i4++) {
                        int i5;
                        char c2 = toCharArray[i4];
                        switch (i4 % 5) {
                            case v.m /*0*/:
                                i5 = 9;
                                break;
                            case at.g /*1*/:
                                i5 = 19;
                                break;
                            case at.i /*2*/:
                                i5 = 67;
                                break;
                            case at.o /*3*/:
                                i5 = 54;
                                break;
                            default:
                                i5 = 86;
                                break;
                        }
                        toCharArray[i4] = (char) (i5 ^ c2);
                    }
                    d = new String(toCharArray).intern();
                    l = null;
                    c = -1;
                    g = null;
                    b = null;
                    n = false;
                    j = new HashSet();
                    f = null;
                    m = null;
                    o = new HashMap();
                    a = false;
                    k = "";
                    e = null;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "KA";
                    z = false;
                    break;
            }
        }
    }

    private static void a(String str, AttributeSet attributeSet, LayoutInflater layoutInflater, View[] viewArr) {
        try {
            layoutInflater.inflate(new k(viewArr, layoutInflater, str, attributeSet), null, false);
        } catch (InflateException e) {
        }
    }

    static void a(CharSequence charSequence, Activity activity) {
        b(charSequence, activity);
    }

    static void b(String str, AttributeSet attributeSet, LayoutInflater layoutInflater, View[] viewArr) {
        a(str, attributeSet, layoutInflater, viewArr);
    }

    static Set a() {
        return j;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void b(java.lang.CharSequence r8, android.app.Activity r9) {
        /*
        r4 = 0;
        r2 = com.whatsapp.util.Log.h;
        r0 = r8.toString();
        r1 = 32;
        r3 = 95;
        r3 = r0.replace(r1, r3);
        r0 = z;
        r1 = 6;
        r0 = r0[r1];
        r0 = z;
        r0 = r0[r4];
        r0 = com.whatsapp.aqu.g();
        r1 = com.whatsapp.aqu.c();
        r4 = z;
        r5 = 9;
        r4 = r4[r5];
        r4 = r0.equalsIgnoreCase(r4);
        if (r4 == 0) goto L_0x0034;
    L_0x002c:
        r0 = z;
        r4 = 11;
        r0 = r0[r4];
        if (r2 == 0) goto L_0x01d5;
    L_0x0034:
        r4 = z;	 Catch:{ IOException -> 0x01a2 }
        r5 = 3;
        r4 = r4[r5];	 Catch:{ IOException -> 0x01a2 }
        r4 = r0.equalsIgnoreCase(r4);	 Catch:{ IOException -> 0x01a2 }
        if (r4 == 0) goto L_0x0046;
    L_0x003f:
        r0 = z;
        r4 = 4;
        r0 = r0[r4];
        if (r2 == 0) goto L_0x01d5;
    L_0x0046:
        r4 = z;	 Catch:{ IOException -> 0x01a4 }
        r5 = 7;
        r4 = r4[r5];	 Catch:{ IOException -> 0x01a4 }
        r4 = r0.equalsIgnoreCase(r4);	 Catch:{ IOException -> 0x01a4 }
        if (r4 == 0) goto L_0x006b;
    L_0x0051:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r0 = r4.append(r0);
        r4 = "_";
        r0 = r0.append(r4);
        r0 = r0.append(r1);
        r0 = r0.toString();
        if (r2 == 0) goto L_0x01d5;
    L_0x006b:
        r4 = z;	 Catch:{ IOException -> 0x01a6 }
        r5 = 16;
        r4 = r4[r5];	 Catch:{ IOException -> 0x01a6 }
        r4 = r0.equalsIgnoreCase(r4);	 Catch:{ IOException -> 0x01a6 }
        if (r4 == 0) goto L_0x01d5;
    L_0x0077:
        r4 = z;	 Catch:{ IOException -> 0x01a8 }
        r5 = 1;
        r4 = r4[r5];	 Catch:{ IOException -> 0x01a8 }
        r4 = r4.equalsIgnoreCase(r1);	 Catch:{ IOException -> 0x01a8 }
        if (r4 == 0) goto L_0x01d5;
    L_0x0082:
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r0 = r4.append(r0);
        r4 = "_";
        r0 = r0.append(r4);
        r0 = r0.append(r1);
        r0 = r0.toString();
        r1 = r0;
    L_0x009b:
        r0 = k;	 Catch:{ IOException -> 0x01aa }
        r0 = r1.equalsIgnoreCase(r0);	 Catch:{ IOException -> 0x01aa }
        if (r0 != 0) goto L_0x00a8;
    L_0x00a3:
        r0 = o;	 Catch:{ IOException -> 0x01aa }
        r0.clear();	 Catch:{ IOException -> 0x01aa }
    L_0x00a8:
        r0 = com.whatsapp.App.a3;
        r4 = new java.io.File;
        r5 = z;
        r6 = 14;
        r5 = r5[r6];
        r4.<init>(r0, r5);
        r0 = r4.exists();	 Catch:{ IOException -> 0x01ac }
        if (r0 != 0) goto L_0x00c7;
    L_0x00bb:
        r4.mkdir();	 Catch:{ IOException -> 0x01ac }
        r0 = z;	 Catch:{ IOException -> 0x01ac }
        r5 = 15;
        r0 = r0[r5];	 Catch:{ IOException -> 0x01ac }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x01ac }
    L_0x00c7:
        r0 = new java.io.File;
        r0.<init>(r4, r1);
        r4 = r0.exists();	 Catch:{ IOException -> 0x01ae }
        if (r4 != 0) goto L_0x00fd;
    L_0x00d2:
        r0.mkdir();	 Catch:{ IOException -> 0x01ae }
        r4 = o;	 Catch:{ IOException -> 0x01ae }
        r4.clear();	 Catch:{ IOException -> 0x01ae }
        r4 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x01ae }
        r4.<init>();	 Catch:{ IOException -> 0x01ae }
        r5 = z;	 Catch:{ IOException -> 0x01ae }
        r6 = 12;
        r5 = r5[r6];	 Catch:{ IOException -> 0x01ae }
        r4 = r4.append(r5);	 Catch:{ IOException -> 0x01ae }
        r4 = r4.append(r1);	 Catch:{ IOException -> 0x01ae }
        r5 = z;	 Catch:{ IOException -> 0x01ae }
        r6 = 5;
        r5 = r5[r6];	 Catch:{ IOException -> 0x01ae }
        r4 = r4.append(r5);	 Catch:{ IOException -> 0x01ae }
        r4 = r4.toString();	 Catch:{ IOException -> 0x01ae }
        com.whatsapp.util.Log.i(r4);	 Catch:{ IOException -> 0x01ae }
    L_0x00fd:
        e = r0;
        r4 = new java.io.File;
        r0 = e;
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r6 = z;
        r7 = 8;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r5 = r5.append(r1);
        r6 = z;
        r7 = 10;
        r6 = r6[r7];
        r5 = r5.append(r6);
        r5 = r5.toString();
        r4.<init>(r0, r5);
        i = r3;	 Catch:{ IOException -> 0x01b0 }
        r0 = o;	 Catch:{ IOException -> 0x01b0 }
        r3 = i;	 Catch:{ IOException -> 0x01b0 }
        r0 = r0.containsKey(r3);	 Catch:{ IOException -> 0x01b0 }
        if (r0 == 0) goto L_0x0145;
    L_0x0133:
        r0 = o;	 Catch:{ IOException -> 0x01b0 }
        r3 = i;	 Catch:{ IOException -> 0x01b0 }
        r0 = r0.get(r3);	 Catch:{ IOException -> 0x01b0 }
        r0 = (java.lang.Integer) r0;	 Catch:{ IOException -> 0x01b0 }
        r0 = r0.intValue();	 Catch:{ IOException -> 0x01b0 }
        c = r0;	 Catch:{ IOException -> 0x01b0 }
        if (r2 == 0) goto L_0x0148;
    L_0x0145:
        r0 = 0;
        c = r0;	 Catch:{ IOException -> 0x01b2 }
    L_0x0148:
        r0 = r4.exists();	 Catch:{ IOException -> 0x01b4 }
        if (r0 != 0) goto L_0x0151;
    L_0x014e:
        r4.createNewFile();	 Catch:{ IOException -> 0x01b4 }
    L_0x0151:
        r0 = new java.io.FileWriter;	 Catch:{ IOException -> 0x01b6 }
        r2 = r4.getAbsoluteFile();	 Catch:{ IOException -> 0x01b6 }
        r3 = 1;
        r0.<init>(r2, r3);	 Catch:{ IOException -> 0x01b6 }
        h = r0;	 Catch:{ IOException -> 0x01b6 }
    L_0x015d:
        k = r1;
        r0 = new java.util.HashMap;
        r0.<init>();
        f = r0;
        r0 = new java.util.HashMap;
        r0.<init>();
        m = r0;
        r0 = new org.json.JSONObject;
        r0.<init>();
        g = r0;
        r0 = new org.json.JSONArray;
        r0.<init>();
        b = r0;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 13;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = i;
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r9.finish();
        r0 = r9.getIntent();
        r9.startActivity(r0);
        return;
    L_0x01a2:
        r0 = move-exception;
        throw r0;
    L_0x01a4:
        r0 = move-exception;
        throw r0;
    L_0x01a6:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01a8 }
    L_0x01a8:
        r0 = move-exception;
        throw r0;
    L_0x01aa:
        r0 = move-exception;
        throw r0;
    L_0x01ac:
        r0 = move-exception;
        throw r0;
    L_0x01ae:
        r0 = move-exception;
        throw r0;
    L_0x01b0:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01b2 }
    L_0x01b2:
        r0 = move-exception;
        throw r0;
    L_0x01b4:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x01b6 }
    L_0x01b6:
        r0 = move-exception;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 2;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r0.toString();
        r0 = r2.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        goto L_0x015d;
    L_0x01d5:
        r1 = r0;
        goto L_0x009b;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.u.b(java.lang.CharSequence, android.app.Activity):void");
    }

    private static boolean b(View view) {
        View rootView = view.getRootView();
        while (view != rootView) {
            try {
                if (view.getVisibility() != 0) {
                    return false;
                }
                ViewParent parent = view.getParent();
                if (parent == null) {
                    return false;
                }
                try {
                    if (!(parent instanceof View)) {
                        return true;
                    }
                    View view2 = (View) parent;
                    if (view2 == null) {
                        return false;
                    }
                    view = view2;
                } catch (UnsupportedOperationException e) {
                    throw e;
                }
            } catch (UnsupportedOperationException e2) {
                throw e2;
            }
        }
        return true;
    }

    static Map e() {
        return f;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(android.view.View r11, long r12, boolean r14, android.app.Activity r15) {
        /*
        r8 = com.whatsapp.util.Log.h;
        r0 = z;
        r1 = 32;
        r0 = r0[r1];
        r0 = r15.getSystemService(r0);
        r0 = (android.view.WindowManager) r0;
        r0 = r0.getDefaultDisplay();
        r2 = r0.getHeight();
        r3 = r0.getWidth();
        r5 = r11.getRootView();
        if (r5 != 0) goto L_0x0021;
    L_0x0020:
        return;
    L_0x0021:
        r0 = 1;
        r5.setDrawingCacheEnabled(r0);
        r6 = r5.getDrawingCache();
        if (r6 == 0) goto L_0x0020;
    L_0x002b:
        r0 = r6.getHeight();
        if (r14 == 0) goto L_0x0052;
    L_0x0031:
        r1 = r2 + -25;
        if (r0 < r1) goto L_0x0052;
    L_0x0035:
        r1 = new java.lang.StringBuilder;	 Catch:{ OutOfMemoryError -> 0x0050 }
        r1.<init>();	 Catch:{ OutOfMemoryError -> 0x0050 }
        r2 = z;	 Catch:{ OutOfMemoryError -> 0x0050 }
        r3 = 40;
        r2 = r2[r3];	 Catch:{ OutOfMemoryError -> 0x0050 }
        r1 = r1.append(r2);	 Catch:{ OutOfMemoryError -> 0x0050 }
        r0 = r1.append(r0);	 Catch:{ OutOfMemoryError -> 0x0050 }
        r0 = r0.toString();	 Catch:{ OutOfMemoryError -> 0x0050 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ OutOfMemoryError -> 0x0050 }
        goto L_0x0020;
    L_0x0050:
        r0 = move-exception;
        throw r0;
    L_0x0052:
        r0 = f;	 Catch:{ OutOfMemoryError -> 0x0078 }
        if (r0 != 0) goto L_0x005d;
    L_0x0056:
        r0 = new java.util.HashMap;	 Catch:{ OutOfMemoryError -> 0x0078 }
        r0.<init>();	 Catch:{ OutOfMemoryError -> 0x0078 }
        f = r0;	 Catch:{ OutOfMemoryError -> 0x0078 }
    L_0x005d:
        r0 = m;	 Catch:{ OutOfMemoryError -> 0x007a }
        if (r0 != 0) goto L_0x0068;
    L_0x0061:
        r0 = new java.util.HashMap;	 Catch:{ OutOfMemoryError -> 0x007a }
        r0.<init>();	 Catch:{ OutOfMemoryError -> 0x007a }
        m = r0;	 Catch:{ OutOfMemoryError -> 0x007a }
    L_0x0068:
        r0 = i;	 Catch:{ OutOfMemoryError -> 0x0076 }
        if (r0 != 0) goto L_0x007c;
    L_0x006c:
        r0 = z;	 Catch:{ OutOfMemoryError -> 0x0076 }
        r1 = 33;
        r0 = r0[r1];	 Catch:{ OutOfMemoryError -> 0x0076 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ OutOfMemoryError -> 0x0076 }
        goto L_0x0020;
    L_0x0076:
        r0 = move-exception;
        throw r0;
    L_0x0078:
        r0 = move-exception;
        throw r0;
    L_0x007a:
        r0 = move-exception;
        throw r0;
    L_0x007c:
        r1 = 0;
        r0 = f;
        r4 = java.lang.Long.valueOf(r12);
        r0 = r0.containsKey(r4);
        if (r0 == 0) goto L_0x00b5;
    L_0x0089:
        r0 = f;
        r4 = java.lang.Long.valueOf(r12);
        r0 = r0.get(r4);
        r0 = (java.lang.Integer) r0;
        r4 = r0.intValue();
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r7 = z;
        r9 = 35;
        r7 = r7[r9];
        r0 = r0.append(r7);
        r0 = r0.append(r4);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        if (r8 == 0) goto L_0x02e1;
    L_0x00b5:
        r0 = c;
        r4 = r0 + 1;
        c = r4;
        r0 = 1;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r7 = z;
        r9 = 37;
        r7 = r7[r9];
        r1 = r1.append(r7);
        r1 = r1.append(r4);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r7 = r0;
    L_0x00d7:
        if (r14 == 0) goto L_0x010f;
    L_0x00d9:
        r0 = z;	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r1 = 31;
        r0 = r0[r1];	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r0 = android.graphics.Bitmap.Config.RGB_565;	 Catch:{ OutOfMemoryError -> 0x0290 }
        r0 = android.graphics.Bitmap.createBitmap(r3, r2, r0);	 Catch:{ OutOfMemoryError -> 0x0290 }
    L_0x00e8:
        r1 = new android.graphics.Canvas;	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r1.<init>(r0);	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r2 = 16908290; // 0x1020002 float:2.3877235E-38 double:8.353805E-317;
        r2 = r15.findViewById(r2);	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r2 = r2.getRootView();	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r2.draw(r1);	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r2 = 2;
        r2 = new int[r2];	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r5.getLocationOnScreen(r2);	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r3 = 0;
        r3 = r2[r3];	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r3 = (float) r3;	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r5 = 1;
        r2 = r2[r5];	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r2 = (float) r2;	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r5 = 0;
        r1.drawBitmap(r6, r3, r2, r5);	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        if (r8 == 0) goto L_0x02de;
    L_0x010f:
        r0 = z;	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r1 = 38;
        r0 = r0[r1];	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r5 = r6;
    L_0x0119:
        r2 = 0;
        r9 = new java.util.HashSet;	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r9.<init>();	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r0 = m;	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r0 = r0.keySet();	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r10 = r0.iterator();	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
    L_0x0129:
        r0 = r10.hasNext();	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        if (r0 == 0) goto L_0x02da;
    L_0x012f:
        r0 = r10.next();	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r0 = (android.graphics.Bitmap) r0;	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r1 = m;	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r1 = r1.get(r0);	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r1 = (java.lang.Integer) r1;	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r3 = r1.intValue();	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        if (r14 == 0) goto L_0x02d6;
    L_0x0143:
        r1 = r0.sameAs(r5);	 Catch:{ OutOfMemoryError -> 0x029c }
        if (r1 != 0) goto L_0x014f;
    L_0x0149:
        r1 = r0.sameAs(r6);	 Catch:{ OutOfMemoryError -> 0x029e }
        if (r1 == 0) goto L_0x02d6;
    L_0x014f:
        r1 = new java.lang.StringBuilder;	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r1.<init>();	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r2 = z;	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r4 = 36;
        r2 = r2[r4];	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r1 = r1.append(r2);	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r2 = r0.sameAs(r5);	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r1 = r1.append(r2);	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r2 = z;	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r4 = 30;
        r2 = r2[r4];	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r1 = r1.append(r2);	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r2 = r0.sameAs(r6);	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r1 = r1.append(r2);	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r1 = r1.toString();	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r1 = 1;
        if (r8 == 0) goto L_0x02d3;
    L_0x0182:
        r2 = r3;
    L_0x0183:
        r4 = c;	 Catch:{ OutOfMemoryError -> 0x02c1 }
        r3 = r4 - r3;
        r4 = 3;
        if (r3 <= r4) goto L_0x018d;
    L_0x018a:
        r9.add(r0);	 Catch:{ OutOfMemoryError -> 0x02c3 }
    L_0x018d:
        if (r8 == 0) goto L_0x02cf;
    L_0x018f:
        r3 = r9.iterator();	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
    L_0x0193:
        r0 = r3.hasNext();	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        if (r0 == 0) goto L_0x01a6;
    L_0x0199:
        r0 = r3.next();	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r0 = (android.graphics.Bitmap) r0;	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r4 = m;	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r4.remove(r0);	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        if (r8 == 0) goto L_0x0193;
    L_0x01a6:
        if (r1 == 0) goto L_0x01cc;
    L_0x01a8:
        if (r7 == 0) goto L_0x01cc;
    L_0x01aa:
        r0 = c;	 Catch:{ OutOfMemoryError -> 0x02c5 }
        r0 = r0 + -1;
        c = r0;	 Catch:{ OutOfMemoryError -> 0x02c5 }
        r0 = new java.lang.StringBuilder;	 Catch:{ OutOfMemoryError -> 0x02c5 }
        r0.<init>();	 Catch:{ OutOfMemoryError -> 0x02c5 }
        r1 = z;	 Catch:{ OutOfMemoryError -> 0x02c5 }
        r3 = 41;
        r1 = r1[r3];	 Catch:{ OutOfMemoryError -> 0x02c5 }
        r0 = r0.append(r1);	 Catch:{ OutOfMemoryError -> 0x02c5 }
        r1 = c;	 Catch:{ OutOfMemoryError -> 0x02c5 }
        r0 = r0.append(r1);	 Catch:{ OutOfMemoryError -> 0x02c5 }
        r0 = r0.toString();	 Catch:{ OutOfMemoryError -> 0x02c5 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ OutOfMemoryError -> 0x02c5 }
    L_0x01cc:
        r0 = 10;
        if (r2 >= r0) goto L_0x02c9;
    L_0x01d0:
        r0 = new java.lang.StringBuilder;	 Catch:{ OutOfMemoryError -> 0x02c7 }
        r0.<init>();	 Catch:{ OutOfMemoryError -> 0x02c7 }
        r1 = "0";
        r0 = r0.append(r1);	 Catch:{ OutOfMemoryError -> 0x02c7 }
        r0 = r0.append(r2);	 Catch:{ OutOfMemoryError -> 0x02c7 }
        r0 = r0.toString();	 Catch:{ OutOfMemoryError -> 0x02c7 }
    L_0x01e4:
        r1 = new java.io.File;	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r3 = e;	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r4 = new java.lang.StringBuilder;	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r4.<init>();	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r7 = d;	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r4 = r4.append(r7);	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r7 = l;	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r4 = r4.append(r7);	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r7 = "-";
        r4 = r4.append(r7);	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r7 = i;	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r4 = r4.append(r7);	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r7 = "-";
        r4 = r4.append(r7);	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r0 = r4.append(r0);	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r4 = z;	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r7 = 42;
        r4 = r4[r7];	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r0 = r0.append(r4);	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r0 = r0.toString();	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r1.<init>(r3, r0);	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r0 = new java.io.FileOutputStream;	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r0.<init>(r1);	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r1 = android.graphics.Bitmap.CompressFormat.PNG;	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r3 = 100;
        r5.compress(r1, r3, r0);	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r1 = f;	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r3 = java.lang.Long.valueOf(r12);	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r4 = java.lang.Integer.valueOf(r2);	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r1.put(r3, r4);	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r1 = m;	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r3 = java.lang.Integer.valueOf(r2);	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r1.put(r6, r3);	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r1 = m;	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r3 = java.lang.Integer.valueOf(r2);	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r1.put(r5, r3);	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r0.flush();	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r0.close();	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r0 = new java.lang.StringBuilder;	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r0.<init>();	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r1 = z;	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r3 = 29;
        r1 = r1[r3];	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r0 = r0.append(r1);	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r0 = r0.append(r2);	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r0 = r0.toString();	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        goto L_0x0020;
    L_0x026f:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 34;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        goto L_0x0020;
    L_0x0290:
        r0 = move-exception;
        java.lang.System.gc();	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r0 = android.graphics.Bitmap.Config.ARGB_4444;	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        r0 = android.graphics.Bitmap.createBitmap(r3, r2, r0);	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        goto L_0x00e8;
    L_0x029c:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x029e }
    L_0x029e:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
    L_0x02a0:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r3 = 39;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r0 = r0.toString();
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        goto L_0x0020;
    L_0x02c1:
        r0 = move-exception;
        throw r0;	 Catch:{ OutOfMemoryError -> 0x02c3 }
    L_0x02c3:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
    L_0x02c5:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
    L_0x02c7:
        r0 = move-exception;
        throw r0;	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
    L_0x02c9:
        r0 = java.lang.String.valueOf(r2);	 Catch:{ FileNotFoundException -> 0x026f, IOException -> 0x02a0 }
        goto L_0x01e4;
    L_0x02cf:
        r4 = r2;
        r2 = r1;
        goto L_0x0129;
    L_0x02d3:
        r2 = r3;
        goto L_0x018f;
    L_0x02d6:
        r1 = r2;
        r2 = r4;
        goto L_0x0183;
    L_0x02da:
        r1 = r2;
        r2 = r4;
        goto L_0x018f;
    L_0x02de:
        r5 = r0;
        goto L_0x0119;
    L_0x02e1:
        r7 = r1;
        goto L_0x00d7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.u.a(android.view.View, long, boolean, android.app.Activity):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.app.Activity r13, android.view.ViewGroup r14) {
        /*
        r12 = 0;
        r3 = com.whatsapp.util.Log.h;
        r0 = z;
        r1 = 20;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = new java.util.ArrayList;
        r0.<init>();
        a(r14, r0);
        r4 = r0.iterator();
    L_0x0018:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x002e;
    L_0x001e:
        r0 = r4.next();
        r0 = (android.widget.TextView) r0;
        r1 = r0.getText();	 Catch:{ UnsupportedOperationException -> 0x002f }
        r1 = r1.length();	 Catch:{ UnsupportedOperationException -> 0x002f }
        if (r1 > 0) goto L_0x0031;
    L_0x002e:
        return;
    L_0x002f:
        r0 = move-exception;
        throw r0;
    L_0x0031:
        r1 = r0.getRootView();
        r2 = j;
        r2.add(r1);
        r2 = r1.getHeight();
        r5 = r1.getWidth();
        r2 = r2 * r5;
        r6 = (long) r2;
        r2 = r1.hashCode();
        r8 = (long) r2;
        r10 = r1.getDrawingTime();
        r8 = r8 + r10;
        r6 = r6 + r8;
        r1 = new java.lang.StringBuilder;	 Catch:{ UnsupportedOperationException -> 0x0089 }
        r1.<init>();	 Catch:{ UnsupportedOperationException -> 0x0089 }
        r2 = z;	 Catch:{ UnsupportedOperationException -> 0x0089 }
        r5 = 19;
        r2 = r2[r5];	 Catch:{ UnsupportedOperationException -> 0x0089 }
        r1 = r1.append(r2);	 Catch:{ UnsupportedOperationException -> 0x0089 }
        r1 = r1.append(r6);	 Catch:{ UnsupportedOperationException -> 0x0089 }
        r1 = r1.toString();	 Catch:{ UnsupportedOperationException -> 0x0089 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ UnsupportedOperationException -> 0x0089 }
        r1 = 1;
        a(r0, r6, r1, r13);	 Catch:{ UnsupportedOperationException -> 0x0089 }
        r1 = f;	 Catch:{ UnsupportedOperationException -> 0x0089 }
        if (r1 == 0) goto L_0x007d;
    L_0x0071:
        r1 = f;	 Catch:{ UnsupportedOperationException -> 0x0087 }
        r2 = java.lang.Long.valueOf(r6);	 Catch:{ UnsupportedOperationException -> 0x0087 }
        r1 = r1.containsKey(r2);	 Catch:{ UnsupportedOperationException -> 0x0087 }
        if (r1 != 0) goto L_0x008b;
    L_0x007d:
        r0 = z;	 Catch:{ UnsupportedOperationException -> 0x0087 }
        r1 = 17;
        r0 = r0[r1];	 Catch:{ UnsupportedOperationException -> 0x0087 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ UnsupportedOperationException -> 0x0087 }
        goto L_0x002e;
    L_0x0087:
        r0 = move-exception;
        throw r0;
    L_0x0089:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x0087 }
    L_0x008b:
        r1 = f;
        r2 = java.lang.Long.valueOf(r6);
        r1 = r1.get(r2);
        r1 = (java.lang.Integer) r1;
        r5 = r1.intValue();
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = z;
        r6 = 21;
        r2 = r2[r6];
        r1 = r1.append(r2);
        r1 = r1.append(r5);
        r1 = r1.toString();
        com.whatsapp.util.Log.i(r1);
        r1 = r0.getLayout();
        r6 = r0.getPaint();
        r2 = r0.getText();
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r8 = z;
        r9 = 18;
        r8 = r8[r9];
        r7 = r7.append(r8);
        r7 = r7.append(r2);
        r7 = r7.toString();
        com.whatsapp.util.Log.i(r7);
        r7 = r0.getLineCount();
        if (r7 <= 0) goto L_0x00f3;
    L_0x00e1:
        r8 = r7 + -1;
        r8 = r1.getLineStart(r8);
        r7 = r7 + -1;
        r1 = r1.getLineEnd(r7);
        r1 = r2.subSequence(r8, r1);
        if (r3 == 0) goto L_0x00f4;
    L_0x00f3:
        r1 = r2;
    L_0x00f4:
        r2 = r2.toString();
        r7 = r0.getWidth();
        r8 = r0.getCompoundPaddingLeft();
        r7 = r7 - r8;
        r8 = r0.getCompoundPaddingRight();
        r7 = r7 - r8;
        r7 = (float) r7;
        r8 = r1.length();
        r1 = r6.measureText(r1, r12, r8);
        r6 = 0;
        r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1));
        if (r6 <= 0) goto L_0x0184;
    L_0x0114:
        r0 = b(r0);	 Catch:{ UnsupportedOperationException -> 0x0188 }
        if (r0 == 0) goto L_0x0184;
    L_0x011a:
        r0 = android.text.TextUtils.isEmpty(r2);	 Catch:{ UnsupportedOperationException -> 0x018a }
        if (r0 != 0) goto L_0x0184;
    L_0x0120:
        r0 = h;	 Catch:{ UnsupportedOperationException -> 0x018a }
        if (r0 == 0) goto L_0x0184;
    L_0x0124:
        r6 = new org.json.JSONArray;
        r6.<init>();
        r0 = 10;
        if (r5 >= r0) goto L_0x018e;
    L_0x012d:
        r0 = new java.lang.StringBuilder;	 Catch:{ UnsupportedOperationException -> 0x018c }
        r0.<init>();	 Catch:{ UnsupportedOperationException -> 0x018c }
        r8 = "0";
        r0 = r0.append(r8);	 Catch:{ UnsupportedOperationException -> 0x018c }
        r0 = r0.append(r5);	 Catch:{ UnsupportedOperationException -> 0x018c }
        r0 = r0.toString();	 Catch:{ UnsupportedOperationException -> 0x018c }
    L_0x0141:
        r5 = new java.lang.StringBuilder;	 Catch:{ UnsupportedOperationException -> 0x0193 }
        r5.<init>();	 Catch:{ UnsupportedOperationException -> 0x0193 }
        r8 = i;	 Catch:{ UnsupportedOperationException -> 0x0193 }
        r5 = r5.append(r8);	 Catch:{ UnsupportedOperationException -> 0x0193 }
        r8 = "-";
        r5 = r5.append(r8);	 Catch:{ UnsupportedOperationException -> 0x0193 }
        r0 = r5.append(r0);	 Catch:{ UnsupportedOperationException -> 0x0193 }
        r0 = r0.toString();	 Catch:{ UnsupportedOperationException -> 0x0193 }
        r6.put(r0);	 Catch:{ UnsupportedOperationException -> 0x0193 }
        r6.put(r2);	 Catch:{ UnsupportedOperationException -> 0x0193 }
        r8 = (double) r7;	 Catch:{ UnsupportedOperationException -> 0x0193 }
        r0 = java.lang.Double.valueOf(r8);	 Catch:{ UnsupportedOperationException -> 0x0193 }
        r6.put(r0);	 Catch:{ UnsupportedOperationException -> 0x0193 }
        r8 = (double) r1;	 Catch:{ UnsupportedOperationException -> 0x0193 }
        r0 = java.lang.Double.valueOf(r8);	 Catch:{ UnsupportedOperationException -> 0x0193 }
        r6.put(r0);	 Catch:{ UnsupportedOperationException -> 0x0193 }
        r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1));
        if (r0 <= 0) goto L_0x017b;
    L_0x0175:
        r0 = 1;
        r6.put(r0);	 Catch:{ UnsupportedOperationException -> 0x0195 }
        if (r3 == 0) goto L_0x017f;
    L_0x017b:
        r0 = 0;
        r6.put(r0);	 Catch:{ UnsupportedOperationException -> 0x0195 }
    L_0x017f:
        r0 = b;
        r0.put(r6);
    L_0x0184:
        if (r3 == 0) goto L_0x0018;
    L_0x0186:
        goto L_0x002e;
    L_0x0188:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x018a }
    L_0x018a:
        r0 = move-exception;
        throw r0;
    L_0x018c:
        r0 = move-exception;
        throw r0;
    L_0x018e:
        r0 = java.lang.String.valueOf(r5);
        goto L_0x0141;
    L_0x0193:
        r0 = move-exception;
        throw r0;	 Catch:{ UnsupportedOperationException -> 0x0195 }
    L_0x0195:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.u.a(android.app.Activity, android.view.ViewGroup):void");
    }
}
