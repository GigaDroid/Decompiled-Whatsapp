package com.whatsapp.notification;

import android.content.Context;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import com.whatsapp.App;
import com.whatsapp.ConversationRowDivider;
import com.whatsapp.a28;
import com.whatsapp.a3b;
import com.whatsapp.arj;
import com.whatsapp.l5;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.protocol.co;
import com.whatsapp.qm;
import com.whatsapp.util.Log;
import java.util.HashMap;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public final class d {
    public static HashMap a;
    private static final String[] z;

    public static CharSequence a(Context context, co coVar, l5 l5Var, boolean z, boolean z2) {
        if (coVar == null) {
            return "";
        }
        CharSequence c;
        if (coVar.c == null) {
            c = coVar.c();
            if (c != null && ((long) c.length()) > 1024) {
                c = b(c);
            }
            if (l5Var.c()) {
                if (coVar.d == 6) {
                    return z ? l5Var.a(context) + z[13] + ConversationRowDivider.b(coVar) : ConversationRowDivider.b(coVar);
                } else {
                    if (z) {
                        if (coVar.k.a) {
                            return l5Var.a(context) + z[5] + c;
                        }
                        return a(coVar.t, context) + z[0] + l5Var.a(context) + z[11] + c;
                    } else if (z2) {
                        if (coVar.k.a) {
                            return TextUtils.concat(new CharSequence[]{d(context.getString(2131232301) + " "), a28.b(c)});
                        }
                        return TextUtils.concat(new CharSequence[]{d(a28.b(a(coVar.t, context) + " ")), a28.b(c)});
                    } else if (!coVar.k.a) {
                        return Html.fromHtml(z[4] + a(coVar.t, context) + z[10] + c);
                    } else {
                        Log.e(z[9] + Log.a(coVar));
                        return context.getString(2131230940) + z[12] + c;
                    }
                }
            } else if (z) {
                return l5Var.a(context) + z[3] + c;
            } else {
                if (!z2) {
                    return c;
                }
                if (coVar.k.a) {
                    return TextUtils.concat(new CharSequence[]{d(context.getString(2131232301) + " "), a28.b(c)});
                }
                return TextUtils.concat(new CharSequence[]{d(a28.b(l5Var.a(context)) + " "), a28.b(c)});
            }
        }
        c = a(context, coVar);
        if (l5Var.c()) {
            if (z) {
                if (coVar.k.a) {
                    return l5Var.a(context) + z[14] + c;
                }
                return a(coVar.t, context) + z[1] + l5Var.a(context) + z[7] + c;
            } else if (!z2) {
                return Html.fromHtml(z[6] + a(coVar.t, context) + z[8] + c);
            } else {
                if (coVar.k.a) {
                    return TextUtils.concat(new CharSequence[]{d(context.getString(2131232301) + " "), a28.b(c)});
                }
                return TextUtils.concat(new CharSequence[]{d(a28.b(a(coVar.t, context) + " ")), a28.b(c)});
            }
        } else if (z) {
            return l5Var.a(context) + z[2] + c;
        } else {
            if (!z2) {
                return c;
            }
            if (coVar.k.a) {
                return TextUtils.concat(new CharSequence[]{d(context.getString(2131232301) + " "), a28.b(c)});
            }
            return TextUtils.concat(new CharSequence[]{d(a28.b(l5Var.a(context) + " ")), a28.b(c)});
        }
    }

    public static boolean b(Context context, String str) {
        return a3b.a(context).e(str) || c(str);
    }

    private static String b(String str) {
        return str.subSequence(0, 1020) + "\u2026";
    }

    static {
        String[] strArr = new String[40];
        String str = "WEy";
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
                        i3 = 119;
                        break;
                    case at.g /*1*/:
                        i3 = 5;
                        break;
                    case at.i /*2*/:
                        i3 = 89;
                        break;
                    case at.o /*3*/:
                        i3 = 94;
                        break;
                    default:
                        i3 = arj.Theme_checkedTextViewStyle;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "M%";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "M%";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "Kgg";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    str = "M%";
                    obj = 4;
                    i = 5;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    strArr2 = strArr3;
                    str = "Kgg";
                    obj = 5;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "M%";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "M%eq\u0005I";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u001a`*-\u0006\u0010`\t,\u0002\u0001l<)H\u001al*-\u000e\u0019b\u0006,\n\u0003Z*,\u0004M";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "M%eq\u0005I";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "M%";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "M%";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "M%";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "M%";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\ud84b\udfb0";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "^%";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\ud84a\udcf2y";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "W-";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\ud84a\udcc1y";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "^%";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "W-";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "\ud84b\udfa0y";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\ud84b\udfa1";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "\ud84a\udc61y";
                    obj = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "W-";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "M%";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "^%";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "\ud84a\udcc1y";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "\ud84a\udcc9y";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "\ud84a\udcf2y";
                    obj = 29;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "\ud84a\udcc9y";
                    obj = 30;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "^%";
                    obj = 31;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "\ud84b\udfa0y";
                    obj = 32;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "\u0010`-\u0010\b\u0003l?7\u0004\u0016q01\t#l:5\u0002\u0005*47\u0014\u0004l798\u0005h-\u0001\u0014\u0005fc";
                    obj = 33;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "WEy";
                    obj = 34;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "WEy";
                    obj = 35;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "\u0019j-7\u0001\u001ef8*\u000e\u0018kv3\u0002\u0004v89\u0002\u0007w<(\u000e\u0012rv9\u0002\u0003k83\u0002Ww<3\b\u0003`\u0006,\u0002\u0004j,,\u0004\u0012%7+\u000b\u001b";
                    obj = 36;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "WEy";
                    obj = 37;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "WEy";
                    obj = 38;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    z = strArr3;
                    a = new HashMap();
                    return;
                default:
                    strArr2[i] = str;
                    str = "WEy";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public static String a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return context.getString(2131232009);
        }
        Ringtone ringtone = RingtoneManager.getRingtone(context, Uri.parse(str));
        if (ringtone == null) {
            return null;
        }
        return ringtone.getTitle(context);
    }

    public static a4 b(Context context, co coVar, l5 l5Var) {
        if (coVar == null) {
            return new a4("", "");
        }
        if (coVar.c == null) {
            CharSequence c = coVar.c();
            if (c != null && ((long) c.length()) > 1024) {
                c = b(c);
            }
            if (!l5Var.c()) {
                return new a4(l5Var.a(context), c);
            }
            if (coVar.d == 6) {
                return new a4(l5Var.a(context), ConversationRowDivider.b(coVar));
            }
            if (coVar.t == null) {
                return new a4(l5Var.a(context), c);
            }
            return new a4(App.as.b(coVar.t).a(context) + z[39] + l5Var.a(context), c);
        }
        CharSequence a = a(context, coVar);
        if (!l5Var.c() || coVar.t == null) {
            return new a4(l5Var.a(context), a);
        }
        return new a4(App.as.b(coVar.t).a(context) + z[38] + l5Var.a(context), a);
    }

    private static CharSequence d(String str) {
        CharSequence spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(str);
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, str.length(), 0);
        return spannableStringBuilder;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(android.content.Context r9, com.whatsapp.protocol.co r10) {
        /*
        r5 = 1;
        r8 = 2131231001; // 0x7f080119 float:1.807807E38 double:1.052968021E-314;
        r4 = 2131231000; // 0x7f080118 float:1.8078069E38 double:1.0529680205E-314;
        r7 = 2131231003; // 0x7f08011b float:1.8078075E38 double:1.052968022E-314;
        r6 = 16;
        r2 = com.whatsapp.notification.PopupNotification.p;
        r0 = "";
        r1 = r10.c;
        switch(r1) {
            case 1: goto L_0x001e;
            case 2: goto L_0x009a;
            case 3: goto L_0x0107;
            case 4: goto L_0x025a;
            case 5: goto L_0x02a3;
            case 6: goto L_0x0016;
            case 7: goto L_0x0016;
            case 8: goto L_0x0331;
            case 9: goto L_0x01b0;
            default: goto L_0x0016;
        };
    L_0x0016:
        r0 = 2131231002; // 0x7f08011a float:1.8078073E38 double:1.0529680214E-314;
        r0 = r9.getString(r0);
    L_0x001d:
        return r0;
    L_0x001e:
        r0 = android.os.Build.VERSION.SDK_INT;
        if (r0 < r6) goto L_0x0062;
    L_0x0022:
        r0 = r10.a;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x0047;
    L_0x002a:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r3 = 17;
        r1 = r1[r3];
        r0 = r0.append(r1);
        r1 = r9.getString(r4);
        r0 = r0.append(r1);
        r0 = r0.toString();
        if (r2 == 0) goto L_0x001d;
    L_0x0047:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r3 = 30;
        r1 = r1[r3];
        r0 = r0.append(r1);
        r1 = r10.a;
        r0 = r0.append(r1);
        r0 = r0.toString();
        if (r2 == 0) goto L_0x001d;
    L_0x0062:
        r0 = r10.a;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x0070;
    L_0x006a:
        r0 = r9.getString(r4);
        if (r2 == 0) goto L_0x001d;
    L_0x0070:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "(";
        r0 = r0.append(r1);
        r1 = r9.getString(r4);
        r0 = r0.append(r1);
        r1 = z;
        r3 = 27;
        r1 = r1[r3];
        r0 = r0.append(r1);
        r1 = r10.a;
        r0 = r0.append(r1);
        r0 = r0.toString();
        if (r2 == 0) goto L_0x001d;
    L_0x009a:
        r1 = android.os.Build.VERSION.SDK_INT;
        if (r1 < r6) goto L_0x00bc;
    L_0x009e:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = r10.r;
        if (r0 != r5) goto L_0x033c;
    L_0x00a7:
        r0 = z;
        r3 = 23;
        r0 = r0[r3];
    L_0x00ad:
        r0 = r1.append(r0);
        r1 = " ";
        r0 = r0.append(r1);
        r0 = r0.toString();
    L_0x00bc:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1 = r1.append(r0);
        r0 = r10.r;
        if (r0 != r5) goto L_0x0344;
    L_0x00c9:
        r0 = 2131231004; // 0x7f08011c float:1.8078077E38 double:1.0529680224E-314;
    L_0x00cc:
        r0 = r9.getString(r0);
        r0 = r1.append(r0);
        r0 = r0.toString();
        r1 = r10.H;
        if (r1 == 0) goto L_0x001d;
    L_0x00dc:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = r1.append(r0);
        r1 = z;
        r3 = 18;
        r1 = r1[r3];
        r0 = r0.append(r1);
        r1 = r10.H;
        r4 = (long) r1;
        r1 = android.text.format.DateUtils.formatElapsedTime(r4);
        r0 = r0.append(r1);
        r1 = ")";
        r0 = r0.append(r1);
        r0 = r0.toString();
        if (r2 == 0) goto L_0x001d;
    L_0x0107:
        r0 = android.os.Build.VERSION.SDK_INT;
        if (r0 < r6) goto L_0x014b;
    L_0x010b:
        r0 = r10.a;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x0130;
    L_0x0113:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r3 = 22;
        r1 = r1[r3];
        r0 = r0.append(r1);
        r1 = r9.getString(r7);
        r0 = r0.append(r1);
        r0 = r0.toString();
        if (r2 == 0) goto L_0x0181;
    L_0x0130:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r3 = 33;
        r1 = r1[r3];
        r0 = r0.append(r1);
        r1 = r10.a;
        r0 = r0.append(r1);
        r0 = r0.toString();
        if (r2 == 0) goto L_0x0181;
    L_0x014b:
        r0 = r10.a;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x0159;
    L_0x0153:
        r0 = r9.getString(r7);
        if (r2 == 0) goto L_0x0181;
    L_0x0159:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "(";
        r0 = r0.append(r1);
        r1 = r9.getString(r7);
        r0 = r0.append(r1);
        r1 = z;
        r3 = 20;
        r1 = r1[r3];
        r0 = r0.append(r1);
        r1 = r10.a;
        r0 = r0.append(r1);
        r0 = r0.toString();
    L_0x0181:
        r1 = r10.H;
        if (r1 == 0) goto L_0x001d;
    L_0x0185:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = r1.append(r0);
        r1 = z;
        r3 = 21;
        r1 = r1[r3];
        r0 = r0.append(r1);
        r1 = r10.H;
        r4 = (long) r1;
        r1 = android.text.format.DateUtils.formatElapsedTime(r4);
        r0 = r0.append(r1);
        r1 = ")";
        r0 = r0.append(r1);
        r0 = r0.toString();
        if (r2 == 0) goto L_0x001d;
    L_0x01b0:
        r0 = android.os.Build.VERSION.SDK_INT;
        if (r0 < r6) goto L_0x01f4;
    L_0x01b4:
        r0 = r10.a;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x01d9;
    L_0x01bc:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r3 = 28;
        r1 = r1[r3];
        r0 = r0.append(r1);
        r1 = r9.getString(r7);
        r0 = r0.append(r1);
        r0 = r0.toString();
        if (r2 == 0) goto L_0x022e;
    L_0x01d9:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r3 = 19;
        r1 = r1[r3];
        r0 = r0.append(r1);
        r1 = r10.a;
        r0 = r0.append(r1);
        r0 = r0.toString();
        if (r2 == 0) goto L_0x022e;
    L_0x01f4:
        r0 = r10.a;
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x0205;
    L_0x01fc:
        r0 = 2131230999; // 0x7f080117 float:1.8078067E38 double:1.05296802E-314;
        r0 = r9.getString(r0);
        if (r2 == 0) goto L_0x022e;
    L_0x0205:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = "(";
        r0 = r0.append(r1);
        r1 = 2131230999; // 0x7f080117 float:1.8078067E38 double:1.05296802E-314;
        r1 = r9.getString(r1);
        r0 = r0.append(r1);
        r1 = z;
        r1 = r1[r6];
        r0 = r0.append(r1);
        r1 = r10.a;
        r0 = r0.append(r1);
        r0 = r0.toString();
    L_0x022e:
        r1 = r10.R;
        if (r1 == 0) goto L_0x001d;
    L_0x0232:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = r1.append(r0);
        r1 = z;
        r3 = 25;
        r1 = r1[r3];
        r0 = r0.append(r1);
        r1 = com.whatsapp.util.cb.a(r10);
        r0 = r0.append(r1);
        r1 = ")";
        r0 = r0.append(r1);
        r0 = r0.toString();
        if (r2 == 0) goto L_0x001d;
    L_0x025a:
        r1 = android.os.Build.VERSION.SDK_INT;
        if (r1 < r6) goto L_0x0264;
    L_0x025e:
        r0 = z;
        r1 = 24;
        r0 = r0[r1];
    L_0x0264:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = r1.append(r0);
        r1 = 2131230998; // 0x7f080116 float:1.8078065E38 double:1.0529680195E-314;
        r1 = r9.getString(r1);
        r0 = r0.append(r1);
        r0 = r0.toString();
        r1 = r10.A;
        r1 = android.text.TextUtils.isEmpty(r1);
        if (r1 != 0) goto L_0x001d;
    L_0x0284:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = r1.append(r0);
        r1 = z;
        r3 = 26;
        r1 = r1[r3];
        r0 = r0.append(r1);
        r1 = r10.A;
        r0 = r0.append(r1);
        r0 = r0.toString();
        if (r2 == 0) goto L_0x001d;
    L_0x02a3:
        r0 = 0;
        r1 = r10.A;
        r1 = android.text.TextUtils.isEmpty(r1);
        if (r1 != 0) goto L_0x02bd;
    L_0x02ac:
        r1 = r10.A;
        r3 = "\n";
        r1 = r1.split(r3);
        if (r1 == 0) goto L_0x02bd;
    L_0x02b7:
        r3 = r1.length;
        if (r3 == 0) goto L_0x02bd;
    L_0x02ba:
        r0 = 0;
        r0 = r1[r0];
    L_0x02bd:
        r1 = android.os.Build.VERSION.SDK_INT;
        if (r1 < r6) goto L_0x02fd;
    L_0x02c1:
        r1 = android.text.TextUtils.isEmpty(r0);
        if (r1 == 0) goto L_0x02e4;
    L_0x02c7:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = z;
        r4 = 31;
        r3 = r3[r4];
        r1 = r1.append(r3);
        r3 = r9.getString(r8);
        r1 = r1.append(r3);
        r1 = r1.toString();
        if (r2 == 0) goto L_0x0349;
    L_0x02e4:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = z;
        r4 = 29;
        r3 = r3[r4];
        r1 = r1.append(r3);
        r1 = r1.append(r0);
        r1 = r1.toString();
        if (r2 == 0) goto L_0x0349;
    L_0x02fd:
        r1 = android.text.TextUtils.isEmpty(r0);
        if (r1 == 0) goto L_0x0309;
    L_0x0303:
        r1 = r9.getString(r8);
        if (r2 == 0) goto L_0x0349;
    L_0x0309:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = "(";
        r1 = r1.append(r3);
        r3 = r9.getString(r8);
        r1 = r1.append(r3);
        r3 = z;
        r4 = 32;
        r3 = r3[r4];
        r1 = r1.append(r3);
        r0 = r1.append(r0);
        r0 = r0.toString();
        if (r2 == 0) goto L_0x001d;
    L_0x0331:
        r0 = 2131230994; // 0x7f080112 float:1.8078056E38 double:1.0529680175E-314;
        r0 = r9.getString(r0);
        if (r2 == 0) goto L_0x001d;
    L_0x033a:
        goto L_0x0016;
    L_0x033c:
        r0 = z;
        r3 = 15;
        r0 = r0[r3];
        goto L_0x00ad;
    L_0x0344:
        r0 = 2131230993; // 0x7f080111 float:1.8078054E38 double:1.052968017E-314;
        goto L_0x00cc;
    L_0x0349:
        r0 = r1;
        goto L_0x001d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.d.a(android.content.Context, com.whatsapp.protocol.co):java.lang.String");
    }

    public static void a() {
        a.clear();
    }

    public static void a(String str) {
        a.put(str, Long.valueOf(System.currentTimeMillis() + Math.min((30000 + (5000 * ((long) qm.c(str).b()))) - 1, 120000)));
    }

    public static boolean c(String str) {
        Long l = (Long) a.get(str);
        if (l == null) {
            return false;
        }
        if (l.longValue() > System.currentTimeMillis()) {
            return true;
        }
        a.remove(str);
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(android.content.Context r7, com.whatsapp.protocol.co r8, com.whatsapp.l5 r9) {
        /*
        r6 = 2131231579; // 0x7f08035b float:1.8079243E38 double:1.0529683065E-314;
        r5 = 1;
        r4 = 0;
        r1 = com.whatsapp.notification.PopupNotification.p;
        r0 = r9.c();
        if (r0 != 0) goto L_0x001b;
    L_0x000d:
        r0 = new java.lang.Object[r5];
        r2 = r9.a(r7);
        r0[r4] = r2;
        r0 = r7.getString(r6, r0);
        if (r1 == 0) goto L_0x00a3;
    L_0x001b:
        r0 = r8.d;
        r2 = 6;
        if (r0 != r2) goto L_0x0026;
    L_0x0020:
        r0 = com.whatsapp.ConversationRowDivider.b(r8);
        if (r1 == 0) goto L_0x00a3;
    L_0x0026:
        r0 = r8.t;
        if (r0 == 0) goto L_0x0057;
    L_0x002a:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r2 = com.whatsapp.App.as;
        r3 = r8.t;
        r2 = r2.b(r3);
        r2 = r2.a(r7);
        r0 = r0.append(r2);
        r2 = z;
        r3 = 36;
        r2 = r2[r3];
        r0 = r0.append(r2);
        r2 = r9.a(r7);
        r0 = r0.append(r2);
        r0 = r0.toString();
        if (r1 == 0) goto L_0x009b;
    L_0x0057:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = z;
        r2 = 34;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = com.whatsapp.util.Log.a(r8);
        r0 = r0.append(r1);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = 2131230940; // 0x7f0800dc float:1.8077947E38 double:1.052967991E-314;
        r1 = r7.getString(r1);
        r0 = r0.append(r1);
        r1 = z;
        r2 = 35;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r1 = r9.a(r7);
        r0 = r0.append(r1);
        r0 = r0.toString();
    L_0x009b:
        r1 = new java.lang.Object[r5];
        r1[r4] = r0;
        r0 = r7.getString(r6, r1);
    L_0x00a3:
        r0 = com.whatsapp.a28.b(r0);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.notification.d.a(android.content.Context, com.whatsapp.protocol.co, com.whatsapp.l5):java.lang.String");
    }

    private static String a(String str, Context context) {
        if (str != null) {
            return App.as.b(str).a(context);
        }
        Log.w(z[37]);
        return "";
    }
}
