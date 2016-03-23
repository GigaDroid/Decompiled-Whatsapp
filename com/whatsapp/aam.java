package com.whatsapp;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v4.text.BidiFormatter;
import android.support.v4.text.BidiFormatter.Builder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import com.whatsapp.util.bz;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class aam {
    public static final boolean a;
    private static final String[] b;
    public static final BidiFormatter c;
    public static final boolean d;
    private static final String[] z;

    @Nullable
    public static String a(@Nullable String str) {
        try {
            if (App.a1() || str == null) {
                return str;
            }
            return z[3] + str + "\u202c";
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public static int a(int i) {
        if ((8388608 & i) != 0) {
            return i;
        }
        if ((i & 7) == 5) {
            return (i & -8) | 3;
        }
        if ((i & 7) == 3) {
            return (i & -8) | 5;
        }
        return i;
    }

    @SuppressLint({"NewApi"})
    public static void a(Window window) {
        try {
            if (a) {
                window.getDecorView().setLayoutDirection(3);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public static View a(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z) {
        return a(layoutInflater, i, viewGroup, z, null);
    }

    static {
        boolean z = true;
        String[] strArr = new String[10];
        String str = "\u001ft";
        boolean z2 = true;
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
                        i3 = arj.Theme_ratingBarStyle;
                        break;
                    case at.g /*1*/:
                        i3 = 6;
                        break;
                    case at.i /*2*/:
                        i3 = 74;
                        break;
                    case at.o /*3*/:
                        i3 = 45;
                        break;
                    default:
                        i3 = 12;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z2) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u000bt";
                    i = 2;
                    strArr2 = strArr3;
                    z2 = true;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u2065\u202c";
                    i = 3;
                    strArr2 = strArr3;
                    z2 = true;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\tn/Ng\u0018r&";
                    z2 = true;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = ">c2YI\u0007i D@\u000bd/A#\u0003u\u001eHt\u001eJ\u001e\u007f,\u001ec2Y,\u0003ujHa\u001ar3\rc\u0018&$X`\u0006";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    str = "\u000fh.`m\u0018a#C";
                    z2 = true;
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    strArr2 = strArr3;
                    str = "\u0007A8Lz\u0003r3";
                    z2 = true;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0007A8Lz\u0003r3";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0019r+_x'g8Je\u0004";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    z = strArr3;
                    strArr = new String[48];
                    str = "-O\u0004jI8D\u0018hM.(\u0002w@)7";
                    z2 = true;
                    strArr2 = strArr;
                    strArr3 = strArr;
                    i = 0;
                    break;
                case Y.l /*9*/:
                    try {
                        strArr2[i] = str;
                        str = "-O\u0004jI8D\u0018hM.(\u0000eG-4";
                        z2 = true;
                        i = 1;
                        strArr2 = strArr3;
                        break;
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                case Y.t /*10*/:
                    strArr2[i] = str;
                    str = "-O\u0004jI8D\u0018hM.(\u0000eG 7";
                    z2 = true;
                    i = 2;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    str = "-O\u0004jI8D\u0018hM.(\u0000e@(4";
                    z2 = true;
                    i = 3;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "-O\u0004jI8D\u0018hM.(\u0000dG-5";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "-O\u0004jI8D\u0018hM.(\u0000dG 7";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    str = "-O\u0004jI8D\u0018hM.(\u0000gG-7";
                    z2 = true;
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "-O\u0004jI8D\u0018hM.(\u0000gG 7";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "#\\\u000biC8(\u001c\u00038D@\u0003cM&";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 9;
                    str = ",O\u0018hJ.Ud{=DA\u0003cK/T\b\u007fI+BduE&Gx";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "-O\u0004jI8D\u0018hM.(\u0000e@'7";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "2Q\u0001yDDN\u000fo^/Q";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "-O\u0004jI8D\u0018hM.(\u0000eG/2";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 13;
                    str = ",T\r\u0015?";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "$c2Y^\u0005k";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "^(\u007f\u0003=G7y\u0019S.@\u001a\u0000>Y7";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "9M\u000b\u007fN$O\u0001\r^%Kj\u001c\"Y(z";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 17;
                    str = ",T\u0005tCDL\u0002g\\)";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "-O\u0004jI8D\u0018hM.(\u0000dF<>";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "-O\u0004jI8D\u0018hM.(\u0000eF<D";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "-O\u0004jI8D\u0018hM.(\u0000eF<?";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "-O\u0004jI8D\u0018hM.(\u0000eF<A";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "\\(\u007f\u0003=51y\u0000_:Bgd^.+x\u001c";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "-O\u0004jI8D\u0018hM.(\u0000gF<D";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "-O\u0004jI8D\u0018hM.(\u0000dF<A";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "-O\u0004jI8D\u0018hM.(\u0012uG#0";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 26;
                    str = " T\u000ecI'Y\u001f\u001eSX(\u007f\u0014\"Z";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 27;
                    str = ",T\u0005tCDL\u0003g\\)";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "-O\u0004jI8D\u0018hM.(\u0000eG;2";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "-O\u0004jI8D\u0018hM.(\u0012u@'0";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "\\(\u007f\u0003=G7|\u001a!9V\u000e\u0000E8Bg\u0019<";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 31;
                    str = ",T\u0005tCDL\u0002g\\.";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "-O\u0004jI8D\u0018hM.(\u0012uG:M";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "-O\u0004jI8D\u0018hM.(\u0000dG;1";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 34;
                    str = ",O\u0018hJ.Ud{=DA\u0003cK/T\b\u007fI+Bdu[!J{";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "%J\u0013hA5S~r8D>d\u001d";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "-O\u0004jI8D\u0018hM.(\u0000gG;3";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "^(z\u0003>DGd\u001d\"\\4";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "\"c(`E?Oj{:";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "-O\u0004jI8D\u0018hM.(\u0000d@(5";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 40;
                    str = ",O\u0018hJ.Ud{=DA\u0003cK/T\b\u007fI+Bdu[!Lx";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "-T\u0000\u0014<";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "^(z\u0003MD4d\u001e:R";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "-O\u0004jI8D\u0018hM.(\u0000}@+4";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "-O\u0004jI8D\u0018hM.(\u0000}G:4";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "-O\u0004jI8D\u0018hM.(\u0000}G:C";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "-O\u0004jI8D\u0018hM.(\u0000}@)7";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "-O\u0004jI8D\u0018hM.(\u0000}G 4";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i] = str;
                    b = strArr3;
                    if (VERSION.SDK_INT < 17) {
                        z = false;
                    }
                    a = z;
                    d = a();
                    c = new Builder().setTextDirectionHeuristic(new atc()).build();
                    return;
                default:
                    strArr2[i] = str;
                    str = "\fg";
                    i = 1;
                    strArr2 = strArr3;
                    z2 = false;
                    break;
            }
        }
    }

    public static View a(LayoutInflater layoutInflater, int i, ViewGroup viewGroup) {
        return a(layoutInflater, i, viewGroup, viewGroup != null);
    }

    public static void a(TextView textView, int i) {
        try {
            if (App.av) {
                textView.setCompoundDrawablesWithIntrinsicBounds(new bz(ContextCompat.getDrawable(textView.getContext(), i)), null, null, null);
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, i, 0);
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public static void a(EditText editText) {
        try {
            if (App.av) {
                editText.setPadding(editText.getResources().getDimensionPixelSize(2131427458), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            editText.setPadding(editText.getPaddingLeft(), editText.getPaddingTop(), editText.getResources().getDimensionPixelSize(2131427458), editText.getPaddingBottom());
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.widget.TextView r3, java.lang.CharSequence r4) {
        /*
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = d;	 Catch:{ IllegalArgumentException -> 0x0007 }
        if (r0 == 0) goto L_0x0009;
    L_0x0006:
        return;
    L_0x0007:
        r0 = move-exception;
        throw r0;
    L_0x0009:
        if (r3 == 0) goto L_0x0006;
    L_0x000b:
        r0 = r3.getGravity();
        r0 = r0 & -8;
        r2 = android.text.TextUtils.isEmpty(r4);	 Catch:{ IllegalArgumentException -> 0x0035 }
        if (r2 == 0) goto L_0x0025;
    L_0x0017:
        r2 = com.whatsapp.App.a1();	 Catch:{ IllegalArgumentException -> 0x0035 }
        if (r2 == 0) goto L_0x0021;
    L_0x001d:
        r0 = r0 | 3;
        if (r1 == 0) goto L_0x0031;
    L_0x0021:
        r0 = r0 | 5;
        if (r1 == 0) goto L_0x0031;
    L_0x0025:
        r2 = a(r4);	 Catch:{ IllegalArgumentException -> 0x0037 }
        if (r2 == 0) goto L_0x002f;
    L_0x002b:
        r0 = r0 | 3;
        if (r1 == 0) goto L_0x0031;
    L_0x002f:
        r0 = r0 | 5;
    L_0x0031:
        r3.setGravity(r0);
        goto L_0x0006;
    L_0x0035:
        r0 = move-exception;
        throw r0;
    L_0x0037:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.aam.a(android.widget.TextView, java.lang.CharSequence):void");
    }

    public static View a(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z, int[] iArr) {
        View inflate = layoutInflater.inflate(i, viewGroup, z);
        a(inflate, iArr);
        return inflate;
    }

    public static void a(View view, int i, int i2) {
        a(view, i, view.getPaddingTop(), i2, view.getPaddingBottom());
    }

    public static boolean a(CharSequence charSequence) {
        boolean z = false;
        try {
            if (TextUtils.isEmpty(charSequence)) {
                Log.w(z[5]);
                return true;
            }
            int codePointAt = charSequence.toString().codePointAt(0);
            if (codePointAt < 1424 || codePointAt > 1791) {
                z = true;
            }
            return z;
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public static void a(TextView textView) {
        if (textView != null) {
            try {
                a(textView, textView.getText());
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.view.View r12, int[] r13) {
        /*
        r11 = 11;
        r10 = 9;
        r9 = 7;
        r2 = 0;
        r8 = 1;
        r4 = com.whatsapp.DialogToastActivity.f;
        r0 = com.whatsapp.App.a1();	 Catch:{ NoSuchFieldException -> 0x0010 }
        if (r0 == 0) goto L_0x0012;
    L_0x000f:
        return;
    L_0x0010:
        r0 = move-exception;
        throw r0;
    L_0x0012:
        if (r13 == 0) goto L_0x0024;
    L_0x0014:
        r1 = r12.getId();
        r3 = r13.length;
        r0 = r2;
    L_0x001a:
        if (r0 >= r3) goto L_0x0024;
    L_0x001c:
        r5 = r13[r0];
        if (r5 == r1) goto L_0x000f;
    L_0x0020:
        r0 = r0 + 1;
        if (r4 == 0) goto L_0x001a;
    L_0x0024:
        r0 = r12.getPaddingRight();
        r1 = r12.getPaddingTop();
        r3 = r12.getPaddingLeft();
        r5 = r12.getPaddingBottom();
        r12.setPadding(r0, r1, r3, r5);
        r1 = r12.getLayoutParams();
        r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams;
        if (r0 == 0) goto L_0x0082;
    L_0x003f:
        r0 = r1;
        r0 = (android.view.ViewGroup.MarginLayoutParams) r0;
        r3 = r0.leftMargin;	 Catch:{ NoSuchFieldException -> 0x01ab }
        r5 = r0.rightMargin;	 Catch:{ NoSuchFieldException -> 0x01ab }
        if (r3 == r5) goto L_0x0082;
    L_0x0048:
        r3 = r0.rightMargin;	 Catch:{ NoSuchFieldException -> 0x01ab }
        r5 = r0.topMargin;	 Catch:{ NoSuchFieldException -> 0x01ab }
        r6 = r0.leftMargin;	 Catch:{ NoSuchFieldException -> 0x01ab }
        r7 = r0.bottomMargin;	 Catch:{ NoSuchFieldException -> 0x01ab }
        r0.setMargins(r3, r5, r6, r7);	 Catch:{ NoSuchFieldException -> 0x01ab }
        r3 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NoSuchFieldException -> 0x01ab }
        r5 = 17;
        if (r3 >= r5) goto L_0x0082;
    L_0x0059:
        r3 = android.view.ViewGroup.MarginLayoutParams.class;
        r5 = z;	 Catch:{ NoSuchFieldException -> 0x01c8, IllegalArgumentException -> 0x01ce, IllegalAccessException -> 0x01cb }
        r6 = 9;
        r5 = r5[r6];	 Catch:{ NoSuchFieldException -> 0x01c8, IllegalArgumentException -> 0x01ce, IllegalAccessException -> 0x01cb }
        r3 = r3.getDeclaredField(r5);	 Catch:{ NoSuchFieldException -> 0x01c8, IllegalArgumentException -> 0x01ce, IllegalAccessException -> 0x01cb }
        r5 = 1;
        r3.setAccessible(r5);	 Catch:{ NoSuchFieldException -> 0x01c8, IllegalArgumentException -> 0x01ce, IllegalAccessException -> 0x01cb }
        r5 = r0.leftMargin;	 Catch:{ NoSuchFieldException -> 0x01c8, IllegalArgumentException -> 0x01ce, IllegalAccessException -> 0x01cb }
        r3.setInt(r0, r5);	 Catch:{ NoSuchFieldException -> 0x01c8, IllegalArgumentException -> 0x01ce, IllegalAccessException -> 0x01cb }
        r3 = android.view.ViewGroup.MarginLayoutParams.class;
        r5 = z;	 Catch:{ NoSuchFieldException -> 0x01c8, IllegalArgumentException -> 0x01ce, IllegalAccessException -> 0x01cb }
        r6 = 6;
        r5 = r5[r6];	 Catch:{ NoSuchFieldException -> 0x01c8, IllegalArgumentException -> 0x01ce, IllegalAccessException -> 0x01cb }
        r3 = r3.getDeclaredField(r5);	 Catch:{ NoSuchFieldException -> 0x01c8, IllegalArgumentException -> 0x01ce, IllegalAccessException -> 0x01cb }
        r5 = 1;
        r3.setAccessible(r5);	 Catch:{ NoSuchFieldException -> 0x01c8, IllegalArgumentException -> 0x01ce, IllegalAccessException -> 0x01cb }
        r5 = r0.rightMargin;	 Catch:{ NoSuchFieldException -> 0x01c8, IllegalArgumentException -> 0x01ce, IllegalAccessException -> 0x01cb }
        r3.setInt(r0, r5);	 Catch:{ NoSuchFieldException -> 0x01c8, IllegalArgumentException -> 0x01ce, IllegalAccessException -> 0x01cb }
    L_0x0082:
        r0 = r1 instanceof android.widget.RelativeLayout.LayoutParams;
        if (r0 == 0) goto L_0x00a9;
    L_0x0086:
        r0 = r1;
        r0 = (android.widget.RelativeLayout.LayoutParams) r0;
        r3 = r0.getRules();
        r5 = r3[r2];
        r6 = r3[r8];
        r3[r8] = r5;
        r3[r2] = r6;
        r5 = 5;
        r5 = r3[r5];
        r6 = r3[r9];
        r7 = 5;
        r0.addRule(r7, r6);
        r0.addRule(r9, r5);
        r0 = r3[r10];
        r5 = r3[r11];
        r3[r10] = r5;
        r3[r11] = r0;
    L_0x00a9:
        r0 = r1 instanceof android.widget.FrameLayout.LayoutParams;
        if (r0 == 0) goto L_0x00b8;
    L_0x00ad:
        r0 = r1;
        r0 = (android.widget.FrameLayout.LayoutParams) r0;
        r3 = r0.gravity;
        r3 = a(r3);
        r0.gravity = r3;
    L_0x00b8:
        r0 = r1 instanceof android.widget.LinearLayout.LayoutParams;
        if (r0 == 0) goto L_0x00c6;
    L_0x00bc:
        r1 = (android.widget.LinearLayout.LayoutParams) r1;
        r0 = r1.gravity;
        r0 = a(r0);
        r1.gravity = r0;
    L_0x00c6:
        r0 = r12 instanceof android.widget.TextView;	 Catch:{ NoSuchFieldException -> 0x01ad }
        if (r0 == 0) goto L_0x00e4;
    L_0x00ca:
        r0 = r12 instanceof android.widget.EditText;	 Catch:{ NoSuchFieldException -> 0x01ad }
        if (r0 != 0) goto L_0x00e4;
    L_0x00ce:
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NoSuchFieldException -> 0x01af }
        if (r0 >= r11) goto L_0x00d6;
    L_0x00d2:
        r0 = d;	 Catch:{ NoSuchFieldException -> 0x01b1 }
        if (r0 != 0) goto L_0x00e4;
    L_0x00d6:
        r0 = r12;
        r0 = (android.widget.TextView) r0;
        r1 = r0.getGravity();
        r1 = a(r1);
        r0.setGravity(r1);
    L_0x00e4:
        r0 = r12 instanceof android.widget.RelativeLayout;
        if (r0 == 0) goto L_0x011f;
    L_0x00e8:
        r0 = r12;
        r0 = (android.widget.RelativeLayout) r0;
        r1 = android.os.Build.VERSION.SDK_INT;	 Catch:{ NoSuchFieldException -> 0x01b3 }
        r3 = 16;
        if (r1 < r3) goto L_0x00fe;
    L_0x00f1:
        r1 = r0.getGravity();	 Catch:{ NoSuchFieldException -> 0x01b3 }
        r1 = a(r1);	 Catch:{ NoSuchFieldException -> 0x01b3 }
        r0.setGravity(r1);	 Catch:{ NoSuchFieldException -> 0x01b3 }
        if (r4 == 0) goto L_0x011f;
    L_0x00fe:
        r1 = android.widget.RelativeLayout.class;
        r3 = z;	 Catch:{ NoSuchFieldException -> 0x01bf, IllegalArgumentException -> 0x01c5, IllegalAccessException -> 0x01c2 }
        r5 = 8;
        r3 = r3[r5];	 Catch:{ NoSuchFieldException -> 0x01bf, IllegalArgumentException -> 0x01c5, IllegalAccessException -> 0x01c2 }
        r1 = r1.getDeclaredField(r3);	 Catch:{ NoSuchFieldException -> 0x01bf, IllegalArgumentException -> 0x01c5, IllegalAccessException -> 0x01c2 }
        r3 = 1;
        r1.setAccessible(r3);	 Catch:{ NoSuchFieldException -> 0x01bf, IllegalArgumentException -> 0x01c5, IllegalAccessException -> 0x01c2 }
        r1 = r1.get(r0);	 Catch:{ NoSuchFieldException -> 0x01bf, IllegalArgumentException -> 0x01c5, IllegalAccessException -> 0x01c2 }
        r1 = (java.lang.Integer) r1;	 Catch:{ NoSuchFieldException -> 0x01bf, IllegalArgumentException -> 0x01c5, IllegalAccessException -> 0x01c2 }
        r1 = r1.intValue();	 Catch:{ NoSuchFieldException -> 0x01bf, IllegalArgumentException -> 0x01c5, IllegalAccessException -> 0x01c2 }
        r1 = a(r1);	 Catch:{ NoSuchFieldException -> 0x01bf, IllegalArgumentException -> 0x01c5, IllegalAccessException -> 0x01c2 }
        r0.setGravity(r1);	 Catch:{ NoSuchFieldException -> 0x01bf, IllegalArgumentException -> 0x01c5, IllegalAccessException -> 0x01c2 }
    L_0x011f:
        r0 = r12 instanceof android.widget.LinearLayout;
        if (r0 == 0) goto L_0x017c;
    L_0x0123:
        r0 = r12;
        r0 = (android.widget.LinearLayout) r0;
        r1 = android.widget.LinearLayout.class;
        r3 = z;	 Catch:{ NoSuchFieldException -> 0x01b9, IllegalArgumentException -> 0x01bd, IllegalAccessException -> 0x01bb }
        r5 = 7;
        r3 = r3[r5];	 Catch:{ NoSuchFieldException -> 0x01b9, IllegalArgumentException -> 0x01bd, IllegalAccessException -> 0x01bb }
        r1 = r1.getDeclaredField(r3);	 Catch:{ NoSuchFieldException -> 0x01b9, IllegalArgumentException -> 0x01bd, IllegalAccessException -> 0x01bb }
        r3 = 1;
        r1.setAccessible(r3);	 Catch:{ NoSuchFieldException -> 0x01b9, IllegalArgumentException -> 0x01bd, IllegalAccessException -> 0x01bb }
        r1 = r1.get(r0);	 Catch:{ NoSuchFieldException -> 0x01b9, IllegalArgumentException -> 0x01bd, IllegalAccessException -> 0x01bb }
        r1 = (java.lang.Integer) r1;	 Catch:{ NoSuchFieldException -> 0x01b9, IllegalArgumentException -> 0x01bd, IllegalAccessException -> 0x01bb }
        r1 = r1.intValue();	 Catch:{ NoSuchFieldException -> 0x01b9, IllegalArgumentException -> 0x01bd, IllegalAccessException -> 0x01bb }
        r1 = a(r1);	 Catch:{ NoSuchFieldException -> 0x01b9, IllegalArgumentException -> 0x01bd, IllegalAccessException -> 0x01bb }
        r0.setGravity(r1);	 Catch:{ NoSuchFieldException -> 0x01b9, IllegalArgumentException -> 0x01bd, IllegalAccessException -> 0x01bb }
    L_0x0146:
        r1 = r0.getOrientation();	 Catch:{ NoSuchFieldException -> 0x01b5 }
        if (r1 != 0) goto L_0x017c;
    L_0x014c:
        r1 = a;	 Catch:{ NoSuchFieldException -> 0x01b5 }
        if (r1 != 0) goto L_0x017c;
    L_0x0150:
        r3 = r0.getChildCount();
        r5 = new java.util.ArrayList;
        r5.<init>(r3);
        r1 = r2;
    L_0x015a:
        if (r1 >= r3) goto L_0x0167;
    L_0x015c:
        r6 = r0.getChildAt(r1);
        r5.add(r6);
        r1 = r1 + 1;
        if (r4 == 0) goto L_0x015a;
    L_0x0167:
        r0.removeAllViews();
        r1 = r3 + -1;
        r3 = r1;
    L_0x016d:
        if (r3 < 0) goto L_0x017c;
    L_0x016f:
        r1 = r5.get(r3);
        r1 = (android.view.View) r1;
        r0.addView(r1);
        r1 = r3 + -1;
        if (r4 == 0) goto L_0x01d1;
    L_0x017c:
        r0 = r12 instanceof android.widget.ListView;
        if (r0 == 0) goto L_0x0191;
    L_0x0180:
        r0 = r12;
        r0 = (android.widget.ListView) r0;
        r1 = r0.getDivider();
        if (r1 == 0) goto L_0x0191;
    L_0x0189:
        r3 = new com.whatsapp.util.bz;	 Catch:{ NoSuchFieldException -> 0x01b7 }
        r3.<init>(r1);	 Catch:{ NoSuchFieldException -> 0x01b7 }
        r0.setDivider(r3);	 Catch:{ NoSuchFieldException -> 0x01b7 }
    L_0x0191:
        r0 = r12 instanceof android.view.ViewGroup;
        if (r0 == 0) goto L_0x000f;
    L_0x0195:
        r12 = (android.view.ViewGroup) r12;
        r1 = r12.getChildCount();
        r0 = r2;
    L_0x019c:
        if (r0 >= r1) goto L_0x000f;
    L_0x019e:
        r2 = r12.getChildAt(r0);
        a(r2, r13);
        r0 = r0 + 1;
        if (r4 == 0) goto L_0x019c;
    L_0x01a9:
        goto L_0x000f;
    L_0x01ab:
        r0 = move-exception;
        throw r0;
    L_0x01ad:
        r0 = move-exception;
        throw r0;	 Catch:{ NoSuchFieldException -> 0x01af }
    L_0x01af:
        r0 = move-exception;
        throw r0;	 Catch:{ NoSuchFieldException -> 0x01b1 }
    L_0x01b1:
        r0 = move-exception;
        throw r0;
    L_0x01b3:
        r0 = move-exception;
        throw r0;
    L_0x01b5:
        r0 = move-exception;
        throw r0;
    L_0x01b7:
        r0 = move-exception;
        throw r0;
    L_0x01b9:
        r1 = move-exception;
        goto L_0x0146;
    L_0x01bb:
        r1 = move-exception;
        goto L_0x0146;
    L_0x01bd:
        r1 = move-exception;
        goto L_0x0146;
    L_0x01bf:
        r0 = move-exception;
        goto L_0x011f;
    L_0x01c2:
        r0 = move-exception;
        goto L_0x011f;
    L_0x01c5:
        r0 = move-exception;
        goto L_0x011f;
    L_0x01c8:
        r0 = move-exception;
        goto L_0x0082;
    L_0x01cb:
        r0 = move-exception;
        goto L_0x0082;
    L_0x01ce:
        r0 = move-exception;
        goto L_0x0082;
    L_0x01d1:
        r3 = r1;
        goto L_0x016d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.aam.a(android.view.View, int[]):void");
    }

    public static char b() {
        String g = aqu.g();
        try {
            if (!z[2].equals(g)) {
                if (!z[1].equals(g)) {
                    try {
                        if (!z[0].equals(g)) {
                            return ',';
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    }
                }
            }
            return '\u060c';
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (IllegalArgumentException e22) {
            throw e22;
        }
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        try {
            int i5;
            if (App.av) {
                i5 = i3;
            } else {
                i5 = i;
            }
            try {
                if (!App.av) {
                    i = i3;
                }
                view.setPadding(i5, i2, i, i4);
            } catch (IllegalArgumentException e) {
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    public static void a(View view) {
        a(view, null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a() {
        /*
        r8 = 1;
        r10 = -1;
        r9 = 0;
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x000a }
        r1 = 11;
        if (r0 < r1) goto L_0x000c;
    L_0x0009:
        return r8;
    L_0x000a:
        r0 = move-exception;
        throw r0;
    L_0x000c:
        r0 = android.os.Build.DISPLAY;	 Catch:{ Exception -> 0x00a9 }
        if (r0 == 0) goto L_0x001a;
    L_0x0010:
        r0 = b;	 Catch:{ Exception -> 0x00a9 }
        r1 = android.os.Build.DISPLAY;	 Catch:{ Exception -> 0x00a9 }
        r0 = com.whatsapp.util.ax.a(r0, r1);	 Catch:{ Exception -> 0x00a9 }
        if (r0 != 0) goto L_0x0009;
    L_0x001a:
        r0 = com.whatsapp.App.av;	 Catch:{ Exception -> 0x00ad }
        if (r0 == 0) goto L_0x00bd;
    L_0x001e:
        r0 = com.whatsapp.App.z();	 Catch:{ Exception -> 0x00ad }
        r1 = 2131232298; // 0x7f08062a float:1.8080701E38 double:1.0529686617E-314;
        r0 = r0.getText(r1);	 Catch:{ Exception -> 0x00ad }
    L_0x0029:
        r1 = new android.widget.TextView;	 Catch:{ Exception -> 0x00af }
        r2 = com.whatsapp.App.z();	 Catch:{ Exception -> 0x00af }
        r1.<init>(r2);	 Catch:{ Exception -> 0x00af }
        r2 = 5;
        r1.setGravity(r2);	 Catch:{ Exception -> 0x00af }
        r1.setText(r0);	 Catch:{ Exception -> 0x00af }
        r2 = -16777216; // 0xffffffffff000000 float:-1.7014118E38 double:NaN;
        r1.setTextColor(r2);	 Catch:{ Exception -> 0x00af }
        r2 = -1;
        r1.setBackgroundColor(r2);	 Catch:{ Exception -> 0x00af }
        r2 = r1.getPaint();	 Catch:{ Exception -> 0x00af }
        r0 = r0.toString();	 Catch:{ Exception -> 0x00af }
        r0 = r2.measureText(r0);	 Catch:{ Exception -> 0x00af }
        r0 = (int) r0;	 Catch:{ Exception -> 0x00af }
        r0 = r0 * 3;
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2);	 Catch:{ Exception -> 0x00af }
        r2 = 0;
        r3 = 0;
        r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r3);	 Catch:{ Exception -> 0x00af }
        r1.measure(r0, r2);	 Catch:{ Exception -> 0x00af }
        r0 = r1.getMeasuredWidth();	 Catch:{ Exception -> 0x00af }
        r0 = r0 / 2;
        r2 = r1.getMeasuredHeight();	 Catch:{ Exception -> 0x00af }
        r3 = android.graphics.Bitmap.Config.RGB_565;	 Catch:{ Exception -> 0x00af }
        r0 = android.graphics.Bitmap.createBitmap(r0, r2, r3);	 Catch:{ Exception -> 0x00af }
        r2 = new android.graphics.Canvas;	 Catch:{ Exception -> 0x00af }
        r2.<init>(r0);	 Catch:{ Exception -> 0x00af }
        r3 = -1;
        r2.drawColor(r3);	 Catch:{ Exception -> 0x00af }
        r1 = r1.getLayout();	 Catch:{ Exception -> 0x00af }
        r1.draw(r2);	 Catch:{ Exception -> 0x00af }
        r1 = r0.getWidth();	 Catch:{ Exception -> 0x00af }
        r2 = r0.getHeight();	 Catch:{ Exception -> 0x00af }
        r1 = r1 * r2;
        r1 = new int[r1];	 Catch:{ Exception -> 0x00af }
        r2 = 0;
        r3 = r0.getWidth();	 Catch:{ Exception -> 0x00af }
        r4 = 0;
        r5 = 0;
        r6 = r0.getWidth();	 Catch:{ Exception -> 0x00af }
        r7 = r0.getHeight();	 Catch:{ Exception -> 0x00af }
        r0.getPixels(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ Exception -> 0x00af }
        r2 = r1.length;	 Catch:{ Exception -> 0x00af }
        r0 = r9;
    L_0x009f:
        if (r9 >= r2) goto L_0x00ba;
    L_0x00a1:
        r3 = r1[r9];	 Catch:{ Exception -> 0x00c2 }
        if (r3 == r10) goto L_0x00a6;
    L_0x00a5:
        r0 = r8;
    L_0x00a6:
        r9 = r9 + 1;
        goto L_0x009f;
    L_0x00a9:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00ab }
    L_0x00ab:
        r0 = move-exception;
        throw r0;
    L_0x00ad:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x00af }
    L_0x00af:
        r0 = move-exception;
        r1 = r0;
        r0 = r9;
    L_0x00b2:
        r2 = z;
        r3 = 4;
        r2 = r2[r3];
        com.whatsapp.util.Log.b(r2, r1);
    L_0x00ba:
        r8 = r0;
        goto L_0x0009;
    L_0x00bd:
        r0 = "\u0623";
        goto L_0x0029;
    L_0x00c2:
        r1 = move-exception;
        goto L_0x00b2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.aam.a():boolean");
    }
}
