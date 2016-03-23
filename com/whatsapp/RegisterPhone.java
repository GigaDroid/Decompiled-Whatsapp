package com.whatsapp;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.support.v7.app.AlertDialog.Builder;
import android.text.Editable;
import android.text.Html;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class RegisterPhone extends EnterPhoneNumber {
    private static boolean E;
    private static boolean P;
    private static final String[] T;
    private boolean D;
    private long F;
    protected TextView G;
    private String H;
    private int I;
    private boolean J;
    protected ScrollView K;
    private o6 L;
    private Dialog M;
    private boolean N;
    private long O;
    private int Q;
    private boolean R;
    private boolean S;

    public static int a(EditText editText) {
        int i = 0;
        boolean z = DialogToastActivity.f;
        try {
            if (!editText.isFocused()) {
                return -1;
            }
            String obj = editText.getText().toString();
            int i2 = 0;
            while (i < editText.getSelectionEnd()) {
                try {
                    if (i > obj.length() && !z) {
                        return i2;
                    }
                    try {
                        if (obj.charAt(i) <= '9') {
                            try {
                                if (obj.charAt(i) >= '0') {
                                    i2++;
                                }
                            } catch (NullPointerException e) {
                                throw e;
                            }
                        }
                        i++;
                        if (z) {
                            return i2;
                        }
                    } catch (NullPointerException e2) {
                        throw e2;
                    }
                } catch (NullPointerException e22) {
                    throw e22;
                } catch (NullPointerException e222) {
                    throw e222;
                }
            }
            return i2;
        } catch (NullPointerException e2222) {
            throw e2222;
        }
    }

    protected void c() {
        Editor edit = getPreferences(0).edit();
        try {
            edit.putInt(T[3], C);
            if (!edit.commit()) {
                Log.w(T[2]);
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    static String a(RegisterPhone registerPhone, int i, String str, String str2) {
        return registerPhone.a(i, str, str2);
    }

    public static void a(EditText editText, int i) {
        boolean z = DialogToastActivity.f;
        int length = editText.getText().length();
        if (i > -1 && i <= length) {
            try {
                editText.requestFocus();
                b(editText, i);
                if (!z) {
                    return;
                }
            } catch (NullPointerException e) {
                throw e;
            } catch (NullPointerException e2) {
                throw e2;
            }
        }
        if (i > length) {
            try {
                editText.requestFocus();
                editText.setSelection(length);
                if (!z) {
                    return;
                }
            } catch (NullPointerException e22) {
                throw e22;
            }
        }
        editText.setSelection(length);
    }

    static boolean b(boolean z) {
        E = z;
        return z;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        try {
            String replaceAll;
            switch (menuItem.getItemId()) {
                case v.m /*0*/:
                    q();
                    return true;
                case at.g /*1*/:
                    App.l((Context) this);
                    finish();
                    return true;
                case at.i /*2*/:
                    replaceAll = this.v.e.getText().toString().replaceAll(T[18], "");
                    ve.a(ve.d(), App.D(replaceAll + this.v.c.getText().toString().replaceAll(T[19], "")));
                    return true;
                case at.o /*3*/:
                    ve.H();
                    return true;
                case at.p /*4*/:
                    replaceAll = this.v.e.getText().toString().replaceAll(T[22], "");
                    Log.i(T[21] + a(ve.g(App.D(replaceAll + this.v.c.getText().toString().replaceAll(T[20], "")))));
                    return true;
                default:
                    return super.onOptionsItemSelected(menuItem);
            }
        } catch (NullPointerException e) {
            throw e;
        }
        throw e;
    }

    static void a(RegisterPhone registerPhone, String str) {
        registerPhone.b(str);
    }

    private void q() {
        try {
            if (this.B != null) {
                super.a(T[1] + this.B);
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            super.a(T[0]);
        } catch (NullPointerException e) {
            throw e;
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    static boolean c(boolean z) {
        P = z;
        return z;
    }

    static Dialog a(RegisterPhone registerPhone) {
        return registerPhone.M;
    }

    private void n() {
        C = 0;
        c();
        App.d((Context) this, 4);
        Intent intent = new Intent(this, VerifySms.class);
        intent.putExtra(T[81], this.u);
        intent.putExtra(T[80], this.F);
        intent.putExtra(T[79], this.O);
        startActivity(intent);
        finish();
    }

    static o6 e(RegisterPhone registerPhone) {
        return registerPhone.L;
    }

    protected String o() {
        Editable text = this.v.e.getText();
        if (text == null) {
            return null;
        }
        return text.toString();
    }

    private static boolean b(String str, String str2) {
        int i = 0;
        boolean z = DialogToastActivity.f;
        int abs = Math.abs(str.length() - str2.length());
        if (abs == 1) {
            try {
                String str3 = str.length() < str2.length() ? str : str2;
                try {
                    if (!str3.equals(str)) {
                        str2 = str;
                    }
                    while (i < str3.length()) {
                        try {
                            if (str3.charAt(i) == str2.charAt(i)) {
                                i++;
                                if (z) {
                                    break;
                                }
                            }
                            return str2.substring(i + 1).equals(str3.substring(i));
                        } catch (NullPointerException e) {
                            throw e;
                        }
                    }
                    return true;
                } catch (NullPointerException e2) {
                    throw e2;
                }
            } catch (NullPointerException e22) {
                throw e22;
            }
        } else if (abs != 0) {
            return false;
        } else {
            abs = 0;
            while (abs < str.length()) {
                try {
                    if (str.charAt(abs) == str2.charAt(abs)) {
                        abs++;
                        if (z) {
                            return false;
                        }
                    } else if (abs == str.length() - 1) {
                        return true;
                    } else {
                        return str.substring(abs + 1).equals(str2.substring(abs + 1));
                    }
                } catch (NullPointerException e222) {
                    throw e222;
                } catch (NullPointerException e2222) {
                    throw e2222;
                }
            }
            return false;
        }
    }

    static {
        String[] strArr = new String[94];
        String str = "\u0002T9 ;\u0004T,d8\u0018^0,";
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
                        i3 = 112;
                        break;
                    case at.g /*1*/:
                        i3 = 49;
                        break;
                    case at.i /*2*/:
                        i3 = 94;
                        break;
                    case at.o /*3*/:
                        i3 = 73;
                        break;
                    default:
                        i3 = 72;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    strArr2 = strArr3;
                    str = "\u0002T9 ;\u0004T,9 \u001f_;f;\u0011G;:<\u0011E;f+\u001f\\3 <PW? $\u0015U";
                    z = true;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "\u0013^3g?\u0018P*:)\u0000Ap\u001b-\u0017X-=-\u0002a6&&\u0015\u001f(,:\u0019W7*)\u0004X1'\u0017\u0003E?=-";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "\u0013^3g?\u0018P*:)\u0000Ap\u001b-\u0017X-=-\u0002a6&&\u0015\u001f7'8\u0005E\u0001*'\u0005_*;1/R1--";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\u0002T9 ;\u0004T,f8\u0018^0,g\u0002T-<%\u0015\u0011";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\u0013^3g?\u0018P*:)\u0000Ap\u001b-\u0017X-=-\u0002a6&&\u0015\u001f=&=\u001eE,0\u0017\u0013^:,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\u0013^3g?\u0018P*:)\u0000Ap\u001b-\u0017X-=-\u0002a6&&\u0015\u001f(,:\u0019W7*)\u0004X1'\u0017\u0003E?=-";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0013^3g?\u0018P*:)\u0000Ap\u001b-\u0017X-=-\u0002a6&&\u0015\u001f.!'\u001eT\u0001'=\u001dS;;";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0013^3g?\u0018P*:)\u0000Ap\u001b-\u0017X-=-\u0002a6&&\u0015\u001f.!'\u001eT\u0001'=\u001dS;;\u0017\u0000^- <\u0019^0";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u0013^3g?\u0018P*:)\u0000Ap\u001b-\u0017X-=-\u0002a6&&\u0015\u001f=&=\u001eE,0\u0017\u0013^:,\u0017\u0000^- <\u0019^0";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0002T9 ;\u0004T,f8\u0018^0,g\u0002T-,<]B*(<\u0015";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "\u0013^3g?\u0018P*:)\u0000Ap\u001b-\u0017X-=-\u0002a6&&\u0015\u001f7'8\u0005E\u00019 \u001f_;\u0016&\u0005\\<,:";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "<^9i\u001a\u0015R1?-\u0002H";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "3C;(<\u0015\u0011\f,+\u001fG;;1";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "4T2,<\u0015\u0011\f,+\u001fG;;1";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "\"T-,<";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\u0002T9 ;\u0004T,f8\u0018^0,g\u0002T-,<]B*(<\u0015";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = ",u";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = ",u";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = ",u";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "\u0002T9 ;\u0004T,d8\u0018^0,h\u0002Rc";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = ",u";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "PM~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "\u0002T9 ;\u0004T,f8\u0018^0,g\u0016^,$)\u0004E;;e\u0015I=,8\u0004X1'";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\u0002T9 ;\u0004T,f8\u0018^0,g\u0013^+'<\u0002Hd";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "PW? $\u0015U~='P]1&#\u0005A\u001d&=\u001eE,0\t\u0012S,\u000b1>P3,h\u0016C1$h3^+'<\u0002H\u000e!'\u001eT\u0017'.\u001f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "\u0002T9 ;\u0004T,f8\u0018^0,g\u0013^+'<\u0002Hd";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "\u0002T9 ;\u0004T,d8\u0018^0,{";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "\u0002T9 ;\u0004T,d8\u0018^0,z";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "z;";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "\u0002T9 ;\u0004T,f8\u0018^0,g\u0014X?%'\u0017\u001e<(&";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "A\u0004k|}B\u0000fx{E";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "\u0002T9 ;\u0004T,f8\u0018^0,g\u0005_,,+\u001fG;;)\u0012];f8\u001fB- *\u001cTs=)\u0012];=";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "\u0002T9 ;\u0004T,f8\u0018^0,g\u0014X?%'\u0017\u001e+':\u0015R1?-\u0002P<%-]T,;'\u0002";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "C\u0000npqE\u0001nyx@\u0001nyx";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "\u0002T9 ;\u0004T,f8\u0018^0,g\u0014X?%'\u0017\u001e0<%/R1'.\u0019C3";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = ",u";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "\u0002T9 ;\u0004T,9 \u001f_;f!\u001eU;1g\u0003Z79";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = ",u";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "X_+%$Y";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "U\u0001l\u0011";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = ",u";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = ",u";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "\u0002T9 ;\u0004T,f8\u0018^0,g\u0013C;(<\u0015";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "\u0002T9 ;\u0004T,f8\u0018^0,g\u001cX0\"g\u0019_-=:\u0005R* '\u001eBq-!\u0011]1.";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "\u0013^3g?\u0018P*:)\u0000Ap\u001b-\u0017X-=-\u0002a6&&\u0015\u001f*(8\u0000T:\u0016;\u001dB\u0001%!\u001eZ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "\u0002T9 ;\u0004T,f8\u0018^0,g\u0013C;(<\u0015\u001e);'\u001eVs:<\u0011E;i*\u001fD0*-PE1i%\u0011X0";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "\u0013^3g?\u0018P*:)\u0000Ap\u001b-\u0017X-=-\u0002a6&&\u0015\u001f,,;\u0015E-=)\u0004T";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    str = "\u0002T9 ;\u0004T,f8\u0018^0,g\u0013]1*#]F,&&\u0017";
                    z = true;
                    i = 49;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    strArr2 = strArr3;
                    str = "\u0013^3g?\u0018P*:)\u0000Ap\u001b-\u0017X-=-\u0002a6&&\u0015\u001f=%-\u0011C\u00019 \u001f_;\u0016&\u0005\\<,:";
                    z = true;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "PW? $\u0015U~='P]1&#\u0005A\u001d($\u001cX0.\u000b\u001fU;i.\u0002^3i\u000b\u001fD0=:\ta6&&\u0015x0/'";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "\u0013^3g?\u0018P*:)\u0000Ap\u001b-\u0017X-=-\u0002a6&&\u0015\u001f7'8\u0005E\u0001*'\u0005_*;1/R1--";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "\u0002T9 ;\u0004T,f8\u0018^0,g\u0019B1sh";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "\u0002T9 ;\u0004T,f8\u0018^0,g\u0003Fs,0\u0000X,,,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "\u0002T9 ;\u0004T,f8\u0018^0,g\u0019_.<</R=f+\u001f\\3 <PW? $\u0015U";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "\u0013^3g?\u0018P*:)\u0000Ap\u001b-\u0017X-=-\u0002a6&&\u0015\u001f7'8\u0005E\u0001*'\u0005_*;1/R1--";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "\u0002T9 ;\u0004T,f8\u0018^0,g\u001eT) &\u0004T0=g\u001cX0\"g\u0019_-=:\u0005R* '\u001eBq-!\u0011]1.";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "\u0013^3g?\u0018P*:)\u0000Ap\u001b-\u0017X-=-\u0002a6&&\u0015\u001f*(8\u0000T:\u0016;\u001dB\u0001%!\u001eZ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "\u0014T0 -\u0014";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "\u0013^+'<\u0002H\u0001')\u001dT";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "\u0013^3g?\u0018P*:)\u0000Ap\u001b-\u0017X-=-\u0002a6&&\u0015\u001f=&=\u001eE,0\u0017\u0013^:,\u0017\u0000^- <\u0019^0";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "\u0002T9 ;\u0004T,9 \u001f_;f)\u0013E,,;\u0005]*f+\u001f\\3 <PW? $\u0015U";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "\u0017C?'<\u0015U";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "\u0013^3g?\u0018P*:)\u0000Ap\u001b-\u0017X-=-\u0002a6&&\u0015\u001f=&=\u001eE,0\u0017\u0013^:,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "\u0013^3g?\u0018P*:)\u0000Ap\u001b-\u0017X-=-\u0002a6&&\u0015\u001f7'8\u0005E\u0001*'\u0005_*;1/R1--";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "\u0013^3g?\u0018P*:)\u0000Ap\u001b-\u0017X-=-\u0002a6&&\u0015\u001f.!'\u001eT\u0001'=\u001dS;;\u0017\u0000^- <\u0019^0";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "\u0013^3g?\u0018P*:)\u0000Ap\u001b-\u0017X-=-\u0002a6&&\u0015\u001f.!'\u001eT\u0001'=\u001dS;;\u0017\u0000^- <\u0019^0";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "\u0002T9 ;\u0004T,f8\u0018^0,g\u0003\\-i8\u0015C3 ;\u0003X1'h";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    strArr2[i] = str;
                    i = 69;
                    str = "\u0013R";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    strArr2[i] = str;
                    i = 70;
                    str = "\u0013^3g?\u0018P*:)\u0000Ap\u001b-\u0017X-=-\u0002a6&&\u0015\u001f=&=\u001eE,0\u0017\u0013^:,\u0017\u0000^- <\u0019^0";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeight /*69*/:
                    strArr2[i] = str;
                    i = 71;
                    str = "\u0013^3g?\u0018P*:)\u0000Ap\u001b-\u0017X-=-\u0002a6&&\u0015\u001f=&=\u001eE,0\u0017\u0013^:,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightSmall /*70*/:
                    strArr2[i] = str;
                    str = "\u0013^3g?\u0018P*:)\u0000Ap\u001b-\u0017X-=-\u0002a6&&\u0015\u001f(,:\u0019W7*)\u0004X1'\u0017\u0003E?=-";
                    z = true;
                    i = 72;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightLarge /*71*/:
                    strArr2[i] = str;
                    str = "\u0013^3g?\u0018P*:)\u0000Ap\u001b-\u0017X-=-\u0002a6&&\u0015\u001f.!'\u001eT\u0001'=\u001dS;;\u0017\u0000^- <\u0019^0";
                    i = 73;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case arj.Theme_listPreferredItemPaddingLeft /*72*/:
                    strArr2[i] = str;
                    i = 74;
                    strArr2 = strArr3;
                    str = "\u0013^3g?\u0018P*:)\u0000Ap\u001b-\u0017X-=-\u0002a6&&\u0015\u001f7'8\u0005E\u00019 \u001f_;\u0016&\u0005\\<,:";
                    z = true;
                    break;
                case arj.Theme_listPreferredItemPaddingRight /*73*/:
                    strArr2[i] = str;
                    i = 75;
                    str = "\u0002T9 ;\u0004T,f8\u0018^0,g\u0000P+:-_R1$%\u0019E~/)\u0019];-";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropDownListViewStyle /*74*/:
                    strArr2[i] = str;
                    i = 76;
                    str = "\u0002T9 ;\u0004T,f8\u0018^0,g\u0000P+:-P";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPopupWindowStyle /*75*/:
                    strArr2[i] = str;
                    i = 77;
                    str = "\u0013^3g?\u0018P*:)\u0000Ap\u001b-\u0017X-=-\u0002a6&&\u0015\u001f.!'\u001eT\u0001'=\u001dS;;";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItem /*76*/:
                    strArr2[i] = str;
                    i = 78;
                    str = "\u0013^3g?\u0018P*:)\u0000Ap\u001b-\u0017X-=-\u0002a6&&\u0015\u001f7'8\u0005E\u0001*'\u0005_*;1/R1--";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItemSmall /*77*/:
                    strArr2[i] = str;
                    i = 79;
                    str = "\u0006^7*-/C;=:\tn* %\u0015";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelBackground /*78*/:
                    strArr2[i] = str;
                    i = 80;
                    str = "\u0003\\-\u0016:\u0015E,0\u0017\u0004X3,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListWidth /*79*/:
                    strArr2[i] = str;
                    i = 81;
                    str = "\u0002^?$!\u001eV";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListTheme /*80*/:
                    strArr2[i] = str;
                    i = 82;
                    str = "\u0000T,$!\u0003B7&&\u0003";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listChoiceBackgroundIndicator /*81*/:
                    strArr2[i] = str;
                    i = 83;
                    str = "\u0011_:;'\u0019Up9-\u0002\\7:;\u0019^0g\u001f\"x\n\f\u00175i\n\f\u001a>p\u0012\u0016\u001b$~\f\b\u000f5";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimary /*82*/:
                    strArr2[i] = str;
                    i = 84;
                    str = "\u0011_:;'\u0019Up9-\u0002\\7:;\u0019^0g\u001a5p\u001a\u0016\r(e\u001b\u001b\u00061}\u0001\u001a\u001c?c\u001f\u000e\r";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimaryDark /*83*/:
                    strArr2[i] = str;
                    i = 85;
                    str = "\u0014C?>)\u0012];\u0016!\u0014B";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorAccent /*84*/:
                    strArr2[i] = str;
                    i = 86;
                    str = "\u0011_:;'\u0019Up9-\u0002\\7:;\u0019^0g\u001f\"x\n\f\u00173~\u0010\u001d\t3e\r";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlNormal /*85*/:
                    strArr2[i] = str;
                    i = 87;
                    str = "\u0011_:;'\u0019Up9-\u0002\\7:;\u0019^0g\u001a5p\u001a\u0016\u000b?\u007f\n\b\u000b$b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlActivated /*86*/:
                    strArr2[i] = str;
                    i = 88;
                    str = "\u0011_:;'\u0019Up9-\u0002\\7:;\u0019^0g\u000f5e\u0001\b\u000b3~\u000b\u0007\u001c#";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlHighlight /*87*/:
                    strArr2[i] = str;
                    i = 89;
                    str = "\u001dT-:)\u0017T\u0001 ,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorButtonNormal /*88*/:
                    strArr2[i] = str;
                    i = 90;
                    str = "\u0016^,*-/D7";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorSwitchThumbNormal /*89*/:
                    strArr2[i] = str;
                    i = 91;
                    str = ",u";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_controlBackground /*90*/:
                    strArr2[i] = str;
                    i = 92;
                    str = ",u";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogStyle /*91*/:
                    strArr2[i] = str;
                    i = 93;
                    str = "\u0002T9 ;\u0004T,f8\u0018^0,g\u0014T-=:\u001fH";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogButtonGroupStyle /*92*/:
                    strArr2[i] = str;
                    T = strArr3;
                    P = false;
                    E = false;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0012]1*#\u0015U~";
                    i = 1;
                    strArr2 = strArr3;
                    z = false;
                    break;
            }
        }
    }

    static boolean f(RegisterPhone registerPhone) {
        return registerPhone.N;
    }

    public void onPause() {
        super.onPause();
        Log.i(T[76] + C);
        Editor edit = getPreferences(0).edit();
        try {
            edit.putString(T[71], w);
            edit.putString(T[77], A);
            edit.putInt(T[72], C);
            edit.putString(T[74], this.v.c.getText().toString());
            edit.putString(T[78], this.v.e.getText().toString());
            edit.putInt(T[70], a(this.v.e));
            edit.putInt(T[73], a(this.v.c));
            if (!edit.commit()) {
                Log.w(T[75]);
            }
            App.b((Context) this, b(z));
        } catch (NullPointerException e) {
            throw e;
        }
    }

    private static void b(EditText editText, int i) {
        int i2 = 0;
        boolean z = DialogToastActivity.f;
        String obj = editText.getText().toString();
        int i3 = 0;
        while (i2 < obj.length() && i > 0) {
            try {
                if (obj.charAt(i2) <= '9') {
                    if (obj.charAt(i2) >= '0') {
                        i--;
                    }
                }
                i3++;
                i2++;
                if (z) {
                    break;
                }
            } catch (NullPointerException e) {
                throw e;
            } catch (NullPointerException e2) {
                throw e2;
            }
        }
        editText.setSelection(i3);
    }

    protected Dialog onCreateDialog(int i) {
        String str;
        switch (i) {
            case arj.Toolbar_navigationContentDescription /*21*/:
                Log.i(T[36]);
                this.M = new Builder(this).setMessage(Html.fromHtml(getString(2131231766, new Object[]{aam.a(b(w, A))}))).setCancelable(false).setPositiveButton(2131231580, new an7(this)).setNeutralButton(2131231751, new aqg(this)).create();
                this.M.setOnDismissListener(new avl(this));
                return this.M;
            case arj.Toolbar_logoDescription /*22*/:
                Log.w(T[34]);
                CharSequence string = getString(2131231794);
                str = T[29];
                try {
                    if (T[32].equals(VerifyNumber.j()) && T[35].equals(App.W.getSubscriberId())) {
                        string = string + T[30] + getString(2131231132);
                        Log.i(T[33]);
                        str = T[28];
                    }
                    return new Builder(this).setMessage(string).setPositiveButton(2131231750, new ct(this, str)).setNegativeButton(2131230884, new n8(this)).create();
                } catch (NullPointerException e) {
                    throw e;
                }
            case arj.Toolbar_titleTextColor /*23*/:
                Log.w(T[31]);
                str = aam.a(VerifyNumber.b(w, A));
                return new Builder(this).setMessage(getString(2131231796) + "\n" + str + "\n" + getString(2131231795)).setPositiveButton(2131230884, new arb(this)).setNeutralButton(2131231797, new xt(this, str)).create();
            default:
                return super.onCreateDialog(i);
        }
    }

    static long a(RegisterPhone registerPhone, long j) {
        registerPhone.O = j;
        return j;
    }

    protected void r() {
        E = false;
        String o = o();
        String m = m();
        if (!(o == null || m == null)) {
            try {
                if (!o.equals("")) {
                    if (a(m, o, VerifyNumber.j()) != null) {
                        new an5(this, 200, 200).start();
                        return;
                    }
                }
            } catch (NullPointerException e) {
                throw e;
            } catch (NullPointerException e2) {
                throw e2;
            }
        }
        k();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
        r6 = this;
        r5 = 1;
        r1 = 0;
        r0 = com.whatsapp.DialogToastActivity.f;
        super.onResume();
        r1 = r6.getPreferences(r1);
        r2 = T;	 Catch:{ NullPointerException -> 0x00c2 }
        r3 = 6;
        r2 = r2[r3];	 Catch:{ NullPointerException -> 0x00c2 }
        r3 = 0;
        r2 = r1.getString(r2, r3);	 Catch:{ NullPointerException -> 0x00c2 }
        w = r2;	 Catch:{ NullPointerException -> 0x00c2 }
        r2 = T;	 Catch:{ NullPointerException -> 0x00c2 }
        r3 = 8;
        r2 = r2[r3];	 Catch:{ NullPointerException -> 0x00c2 }
        r3 = 0;
        r2 = r1.getString(r2, r3);	 Catch:{ NullPointerException -> 0x00c2 }
        A = r2;	 Catch:{ NullPointerException -> 0x00c2 }
        r2 = T;	 Catch:{ NullPointerException -> 0x00c2 }
        r3 = 7;
        r2 = r2[r3];	 Catch:{ NullPointerException -> 0x00c2 }
        r3 = 7;
        r2 = r1.getInt(r2, r3);	 Catch:{ NullPointerException -> 0x00c2 }
        C = r2;	 Catch:{ NullPointerException -> 0x00c2 }
        r2 = com.whatsapp.App.d(r6);	 Catch:{ NullPointerException -> 0x00c2 }
        r2 = com.whatsapp.VerifyNumber.c(r2);	 Catch:{ NullPointerException -> 0x00c2 }
        z = r2;	 Catch:{ NullPointerException -> 0x00c2 }
        r2 = r6.S;	 Catch:{ NullPointerException -> 0x00c2 }
        if (r2 == 0) goto L_0x004d;
    L_0x003e:
        r2 = 0;
        r6.S = r2;	 Catch:{ NullPointerException -> 0x00c4 }
        r2 = r6.v;	 Catch:{ NullPointerException -> 0x00c4 }
        r2 = r2.c;	 Catch:{ NullPointerException -> 0x00c4 }
        r3 = "";
        r2.setText(r3);	 Catch:{ NullPointerException -> 0x00c4 }
        if (r0 == 0) goto L_0x005f;
    L_0x004d:
        r2 = r6.v;	 Catch:{ NullPointerException -> 0x00c4 }
        r2 = r2.c;	 Catch:{ NullPointerException -> 0x00c4 }
        r3 = T;	 Catch:{ NullPointerException -> 0x00c4 }
        r4 = 12;
        r3 = r3[r4];	 Catch:{ NullPointerException -> 0x00c4 }
        r4 = 0;
        r3 = r1.getString(r3, r4);	 Catch:{ NullPointerException -> 0x00c4 }
        r2.setText(r3);	 Catch:{ NullPointerException -> 0x00c4 }
    L_0x005f:
        r2 = r6.v;	 Catch:{ NullPointerException -> 0x00e7 }
        r2 = r2.e;	 Catch:{ NullPointerException -> 0x00e7 }
        r3 = T;	 Catch:{ NullPointerException -> 0x00e7 }
        r4 = 4;
        r3 = r3[r4];	 Catch:{ NullPointerException -> 0x00e7 }
        r4 = 0;
        r3 = r1.getString(r3, r4);	 Catch:{ NullPointerException -> 0x00e7 }
        r2.setText(r3);	 Catch:{ NullPointerException -> 0x00e7 }
        r2 = r6.v;	 Catch:{ NullPointerException -> 0x00e7 }
        r2 = r2.c;	 Catch:{ NullPointerException -> 0x00e7 }
        r3 = T;	 Catch:{ NullPointerException -> 0x00e7 }
        r4 = 9;
        r3 = r3[r4];	 Catch:{ NullPointerException -> 0x00e7 }
        r4 = -1;
        r3 = r1.getInt(r3, r4);	 Catch:{ NullPointerException -> 0x00e7 }
        a(r2, r3);	 Catch:{ NullPointerException -> 0x00e7 }
        r2 = r6.v;	 Catch:{ NullPointerException -> 0x00e7 }
        r2 = r2.e;	 Catch:{ NullPointerException -> 0x00e7 }
        r3 = T;	 Catch:{ NullPointerException -> 0x00e7 }
        r4 = 10;
        r3 = r3[r4];	 Catch:{ NullPointerException -> 0x00e7 }
        r4 = -1;
        r1 = r1.getInt(r3, r4);	 Catch:{ NullPointerException -> 0x00e7 }
        a(r2, r1);	 Catch:{ NullPointerException -> 0x00e7 }
        r1 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x00e7 }
        r1.<init>();	 Catch:{ NullPointerException -> 0x00e7 }
        r2 = T;	 Catch:{ NullPointerException -> 0x00e7 }
        r3 = 5;
        r2 = r2[r3];	 Catch:{ NullPointerException -> 0x00e7 }
        r1 = r1.append(r2);	 Catch:{ NullPointerException -> 0x00e7 }
        r2 = C;	 Catch:{ NullPointerException -> 0x00e7 }
        r1 = r1.append(r2);	 Catch:{ NullPointerException -> 0x00e7 }
        r1 = r1.toString();	 Catch:{ NullPointerException -> 0x00e7 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NullPointerException -> 0x00e7 }
        r1 = C;	 Catch:{ NullPointerException -> 0x00e7 }
        switch(r1) {
            case 15: goto L_0x00c6;
            default: goto L_0x00b4;
        };
    L_0x00b4:
        r0 = android.support.v4.app.NotificationManagerCompat.from(r6);
        r0.cancel(r5);
        com.whatsapp.App.d(r6, r5);
        com.whatsapp.qa.l();
        return;
    L_0x00c2:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00c4 }
    L_0x00c4:
        r0 = move-exception;
        throw r0;
    L_0x00c6:
        r1 = w;	 Catch:{ NullPointerException -> 0x00e9 }
        if (r1 == 0) goto L_0x00ce;
    L_0x00ca:
        r1 = A;	 Catch:{ NullPointerException -> 0x00eb }
        if (r1 != 0) goto L_0x00df;
    L_0x00ce:
        r1 = T;	 Catch:{ NullPointerException -> 0x00e5 }
        r2 = 11;
        r1 = r1[r2];	 Catch:{ NullPointerException -> 0x00e5 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ NullPointerException -> 0x00e5 }
        r1 = 7;
        C = r1;	 Catch:{ NullPointerException -> 0x00e5 }
        r6.c();	 Catch:{ NullPointerException -> 0x00e5 }
        if (r0 == 0) goto L_0x00b4;
    L_0x00df:
        r0 = 21;
        r6.showDialog(r0);	 Catch:{ NullPointerException -> 0x00e5 }
        goto L_0x00b4;
    L_0x00e5:
        r0 = move-exception;
        throw r0;
    L_0x00e7:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00e9 }
    L_0x00e9:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00eb }
    L_0x00eb:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00e5 }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.RegisterPhone.onResume():void");
    }

    static long b(RegisterPhone registerPhone, long j) {
        registerPhone.F = j;
        return j;
    }

    private static String a(byte[] bArr) {
        boolean z = DialogToastActivity.f;
        if (bArr == null) {
            try {
                return T[40];
            } catch (NullPointerException e) {
                throw e;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            byte b = bArr[i];
            stringBuilder.append(String.format(T[41], new Object[]{Byte.valueOf(b)}));
            i++;
            if (z) {
                break;
            }
        }
        return stringBuilder.toString();
    }

    static void b(RegisterPhone registerPhone) {
        registerPhone.n();
    }

    static int d(RegisterPhone registerPhone) {
        return registerPhone.I;
    }

    static boolean b(RegisterPhone registerPhone, boolean z) {
        registerPhone.N = z;
        return z;
    }

    protected void k() {
        this.J = false;
        this.I = 30;
        if (this.G.getVisibility() == 0) {
            Animation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            try {
                alphaAnimation.setDuration(150);
                this.G.startAnimation(alphaAnimation);
                alphaAnimation.setAnimationListener(new a9x(this));
                if (!DialogToastActivity.f) {
                    return;
                }
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.G.setVisibility(8);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void m465c(boolean r3) {
        /*
        r2 = this;
        r0 = w;	 Catch:{ NullPointerException -> 0x0036 }
        r1 = A;	 Catch:{ NullPointerException -> 0x0036 }
        com.whatsapp.App.a(r2, r0, r1);	 Catch:{ NullPointerException -> 0x0036 }
        r0 = 7;
        C = r0;	 Catch:{ NullPointerException -> 0x0036 }
        r2.c();	 Catch:{ NullPointerException -> 0x0036 }
        if (r3 == 0) goto L_0x001a;
    L_0x000f:
        r0 = r2.t;	 Catch:{ NullPointerException -> 0x0038 }
        if (r0 == 0) goto L_0x001a;
    L_0x0013:
        r2.b();	 Catch:{ NullPointerException -> 0x003a }
        r0 = com.whatsapp.DialogToastActivity.f;	 Catch:{ NullPointerException -> 0x003a }
        if (r0 == 0) goto L_0x0028;
    L_0x001a:
        r0 = 2;
        com.whatsapp.App.d(r2, r0);	 Catch:{ NullPointerException -> 0x003a }
        r0 = new android.content.Intent;	 Catch:{ NullPointerException -> 0x003a }
        r1 = com.whatsapp.RegisterName.class;
        r0.<init>(r2, r1);	 Catch:{ NullPointerException -> 0x003a }
        r2.startActivity(r0);	 Catch:{ NullPointerException -> 0x003a }
    L_0x0028:
        r0 = com.whatsapp.App.p;
        r0 = r0.aS;
        r0.c(r2);
        com.whatsapp.VerifyNumber.d();
        r2.finish();
        return;
    L_0x0036:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0038 }
    L_0x0038:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x003a }
    L_0x003a:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.RegisterPhone.c(boolean):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onCreate(android.os.Bundle r11) {
        /*
        r10 = this;
        r9 = 3;
        r1 = 0;
        r6 = 2131755413; // 0x7f100195 float:1.9141705E38 double:1.053227115E-314;
        r8 = 1;
        r7 = 0;
        r2 = com.whatsapp.DialogToastActivity.f;
        r0 = T;
        r3 = 44;
        r0 = r0[r3];
        com.whatsapp.util.Log.i(r0);
        super.onCreate(r11);
        r0 = r10.getLayoutInflater();
        r3 = 2130903259; // 0x7f0300db float:1.741333E38 double:1.052806095E-314;
        r4 = new int[r8];
        r4[r7] = r6;
        r0 = com.whatsapp.aam.a(r0, r3, r1, r7, r4);
        r10.setContentView(r0);
        r0 = com.whatsapp.App.t(r10);
        if (r0 == r8) goto L_0x0044;
    L_0x002d:
        r0 = T;
        r1 = 47;
        r0 = r0[r1];
        com.whatsapp.util.Log.e(r0);
        r0 = new android.content.Intent;
        r1 = com.whatsapp.Main.class;
        r0.<init>(r10, r1);
        r10.startActivity(r0);
        r10.finish();
    L_0x0043:
        return;
    L_0x0044:
        r0 = r10.getIntent();	 Catch:{ IOException -> 0x0260 }
        r0 = r0.getExtras();	 Catch:{ IOException -> 0x0260 }
        if (r0 == 0) goto L_0x00ae;
    L_0x004e:
        r0 = r10.getIntent();	 Catch:{ IOException -> 0x0260 }
        r3 = T;	 Catch:{ IOException -> 0x0260 }
        r4 = 48;
        r3 = r3[r4];	 Catch:{ IOException -> 0x0260 }
        r4 = 0;
        r0 = r0.getBooleanExtra(r3, r4);	 Catch:{ IOException -> 0x0260 }
        if (r0 == 0) goto L_0x0062;
    L_0x005f:
        r10.p();	 Catch:{ IOException -> 0x0262 }
    L_0x0062:
        r0 = r10.getIntent();	 Catch:{ IOException -> 0x0264 }
        r3 = T;	 Catch:{ IOException -> 0x0264 }
        r4 = 50;
        r3 = r3[r4];	 Catch:{ IOException -> 0x0264 }
        r4 = 0;
        r0 = r0.getBooleanExtra(r3, r4);	 Catch:{ IOException -> 0x0264 }
        if (r0 == 0) goto L_0x0078;
    L_0x0073:
        r0 = 1;
        r10.S = r0;	 Catch:{ IOException -> 0x0264 }
        if (r2 == 0) goto L_0x007b;
    L_0x0078:
        r0 = 0;
        r10.S = r0;	 Catch:{ IOException -> 0x0266 }
    L_0x007b:
        r0 = r10.getIntent();	 Catch:{ IOException -> 0x0268 }
        r3 = T;	 Catch:{ IOException -> 0x0268 }
        r4 = 46;
        r3 = r3[r4];	 Catch:{ IOException -> 0x0268 }
        r4 = 0;
        r0 = r0.getBooleanExtra(r3, r4);	 Catch:{ IOException -> 0x0268 }
        if (r0 == 0) goto L_0x00b1;
    L_0x008c:
        r0 = T;	 Catch:{ IOException -> 0x0268 }
        r3 = 45;
        r0 = r0[r3];	 Catch:{ IOException -> 0x0268 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x0268 }
        r0 = 2131231788; // 0x7f08042c float:1.8079667E38 double:1.05296841E-314;
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ IOException -> 0x0268 }
        r4 = 0;
        r5 = 2131231580; // 0x7f08035c float:1.8079245E38 double:1.052968307E-314;
        r5 = r10.getString(r5);	 Catch:{ IOException -> 0x0268 }
        r3[r4] = r5;	 Catch:{ IOException -> 0x0268 }
        r0 = r10.getString(r0, r3);	 Catch:{ IOException -> 0x0268 }
        r10.f(r0);	 Catch:{ IOException -> 0x0268 }
        if (r2 == 0) goto L_0x00b1;
    L_0x00ae:
        r0 = 0;
        r10.S = r0;	 Catch:{ IOException -> 0x026a }
    L_0x00b1:
        r10.i();
        r0 = new com.whatsapp.at6;
        r0.<init>();
        r10.v = r0;
        r3 = r10.v;
        r0 = 2131755414; // 0x7f100196 float:1.9141707E38 double:1.0532271154E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.EditText) r0;
        r3.e = r0;
        r3 = r10.v;
        r0 = 2131755598; // 0x7f10024e float:1.914208E38 double:1.0532272063E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r3.g = r0;
        r0 = r10.v;
        r0 = r0.g;
        r3 = new com.whatsapp.util.bz;
        r4 = 2130837562; // 0x7f02003a float:1.7280082E38 double:1.0527736363E-314;
        r4 = android.support.v7.widget.TintManager.getDrawable(r10, r4);
        r3.<init>(r4);
        r0.setBackgroundDrawable(r3);
        r3 = r10.v;
        r0 = 2131755415; // 0x7f100197 float:1.9141709E38 double:1.053227116E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.EditText) r0;
        r3.c = r0;
        r0 = com.whatsapp.App.av;
        if (r0 == 0) goto L_0x011b;
    L_0x00f9:
        r0 = r10.findViewById(r6);
        r3 = r10.findViewById(r6);
        r4 = r10.getResources();
        r5 = 2131427422; // 0x7f0b005e float:1.847646E38 double:1.053065066E-314;
        r4 = r4.getDimensionPixelSize(r5);
        r5 = r0.getPaddingTop();
        r6 = r0.getPaddingRight();
        r0 = r0.getPaddingBottom();
        r3.setPadding(r4, r5, r6, r0);
    L_0x011b:
        r0 = 2131755411; // 0x7f100193 float:1.91417E38 double:1.053227114E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.ScrollView) r0;
        r10.K = r0;
        r0 = 2131755884; // 0x7f10036c float:1.914266E38 double:1.0532273476E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        r10.G = r0;
        r0 = r10.G;
        r3 = 8;
        r0.setVisibility(r3);
        r0 = new android.text.InputFilter[r8];
        r3 = new android.text.InputFilter$LengthFilter;
        r3.<init>(r9);
        r0[r7] = r3;
        r3 = r10.v;
        r3 = r3.e;
        r3.setFilters(r0);
        r0 = 17;
        r3 = new android.text.InputFilter[r8];
        r4 = new android.text.InputFilter$LengthFilter;
        r4.<init>(r0);
        r3[r7] = r4;
        r0 = r10.v;
        r0 = r0.c;
        r0.setFilters(r3);
        r0 = r10.getPreferences(r7);
        r3 = T;
        r4 = 56;
        r3 = r3[r4];
        r0 = r0.getString(r3, r1);
        if (r0 != 0) goto L_0x0198;
    L_0x016a:
        r0 = com.whatsapp.App.W;
        r0 = r0.getNetworkCountryIso();
        if (r0 == 0) goto L_0x0198;
    L_0x0172:
        r0 = com.whatsapp.u0.a(r0);	 Catch:{ IOException -> 0x026c }
    L_0x0176:
        if (r0 == 0) goto L_0x0198;
    L_0x0178:
        r1 = r10.getPreferences(r7);
        r1 = r1.edit();
        r3 = T;	 Catch:{ IOException -> 0x0294 }
        r4 = 52;
        r3 = r3[r4];	 Catch:{ IOException -> 0x0294 }
        r1.putString(r3, r0);	 Catch:{ IOException -> 0x0294 }
        r0 = r1.commit();	 Catch:{ IOException -> 0x0294 }
        if (r0 != 0) goto L_0x0198;
    L_0x018f:
        r0 = T;	 Catch:{ IOException -> 0x0294 }
        r1 = 55;
        r0 = r0[r1];	 Catch:{ IOException -> 0x0294 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ IOException -> 0x0294 }
    L_0x0198:
        r0 = r10.v;
        r1 = new com.whatsapp.f7;
        r1.<init>(r10);
        r0.a = r1;
        r0 = r10.v;
        r0 = r0.e;
        r1 = r10.v;
        r1 = r1.a;
        r0.addTextChangedListener(r1);
        r0 = new com.whatsapp.zi;
        r0.<init>(r10);
        r1 = r10.v;
        r1 = r1.g;
        r1.setOnClickListener(r0);
        r0 = r10.v;
        r0 = r0.c;
        r0.requestFocus();
        r0 = r10.v;
        r0 = r0.c;
        r0.setCursorVisible(r8);
        r0 = new com.whatsapp.pj;
        r0.<init>(r10);
        r10.L = r0;
        r0 = 2131755599; // 0x7f10024f float:1.9142082E38 double:1.053227207E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.ImageButton) r0;
        r1 = new com.whatsapp.util.bz;	 Catch:{ IOException -> 0x0296 }
        r3 = r10.getResources();	 Catch:{ IOException -> 0x0296 }
        r4 = 2130839425; // 0x7f020781 float:1.728386E38 double:1.0527745567E-314;
        r3 = r3.getDrawable(r4);	 Catch:{ IOException -> 0x0296 }
        r1.<init>(r3);	 Catch:{ IOException -> 0x0296 }
        r0.setImageDrawable(r1);	 Catch:{ IOException -> 0x0296 }
        r1 = new com.whatsapp.za;	 Catch:{ IOException -> 0x0296 }
        r1.<init>(r10);	 Catch:{ IOException -> 0x0296 }
        r0.setOnClickListener(r1);	 Catch:{ IOException -> 0x0296 }
        r0 = w;	 Catch:{ IOException -> 0x0296 }
        if (r0 == 0) goto L_0x01fe;
    L_0x01f5:
        r0 = r10.v;	 Catch:{ IOException -> 0x0296 }
        r0 = r0.e;	 Catch:{ IOException -> 0x0296 }
        r1 = w;	 Catch:{ IOException -> 0x0296 }
        r0.setText(r1);	 Catch:{ IOException -> 0x0296 }
    L_0x01fe:
        r0 = r10.v;
        r0 = r0.g;
        r0 = r0.getText();
        r0 = r0.toString();
        if (r0 == 0) goto L_0x0215;
    L_0x020c:
        r1 = r0.length();	 Catch:{ IOException -> 0x0298 }
        if (r1 <= 0) goto L_0x0215;
    L_0x0212:
        r10.b(r0);	 Catch:{ IOException -> 0x0298 }
    L_0x0215:
        r0 = r10.getWindowManager();	 Catch:{ IOException -> 0x029a }
        r0 = r0.getDefaultDisplay();	 Catch:{ IOException -> 0x029a }
        r0 = r0.getHeight();	 Catch:{ IOException -> 0x029a }
        r1 = 480; // 0x1e0 float:6.73E-43 double:2.37E-321;
        if (r0 > r1) goto L_0x022d;
    L_0x0225:
        r0 = r10.getWindow();	 Catch:{ IOException -> 0x029a }
        r1 = 3;
        r0.setSoftInputMode(r1);	 Catch:{ IOException -> 0x029a }
    L_0x022d:
        r0 = com.whatsapp.App.p;	 Catch:{ IOException -> 0x029c }
        r0 = r0.F();	 Catch:{ IOException -> 0x029c }
        if (r0 == 0) goto L_0x0243;
    L_0x0235:
        r0 = T;	 Catch:{ IOException -> 0x029e }
        r1 = 49;
        r0 = r0[r1];	 Catch:{ IOException -> 0x029e }
        com.whatsapp.util.Log.w(r0);	 Catch:{ IOException -> 0x029e }
        r10.d();	 Catch:{ IOException -> 0x029e }
        if (r2 == 0) goto L_0x0043;
    L_0x0243:
        r0 = com.whatsapp.App.a4();	 Catch:{ IOException -> 0x02a0 }
        if (r0 == 0) goto L_0x0257;
    L_0x0249:
        r0 = T;	 Catch:{ IOException -> 0x02a2 }
        r1 = 54;
        r0 = r0[r1];	 Catch:{ IOException -> 0x02a2 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ IOException -> 0x02a2 }
        r10.f();	 Catch:{ IOException -> 0x02a2 }
        if (r2 == 0) goto L_0x0043;
    L_0x0257:
        if (r11 != 0) goto L_0x0043;
    L_0x0259:
        r10.l();	 Catch:{ IOException -> 0x025e }
        goto L_0x0043;
    L_0x025e:
        r0 = move-exception;
        throw r0;
    L_0x0260:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0262 }
    L_0x0262:
        r0 = move-exception;
        throw r0;
    L_0x0264:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0266 }
    L_0x0266:
        r0 = move-exception;
        throw r0;
    L_0x0268:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x026a }
    L_0x026a:
        r0 = move-exception;
        throw r0;
    L_0x026c:
        r3 = move-exception;
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = T;
        r5 = 53;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r0 = r3.append(r0);
        r3 = T;
        r4 = 51;
        r3 = r3[r4];
        r0 = r0.append(r3);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = r1;
        goto L_0x0176;
    L_0x0294:
        r0 = move-exception;
        throw r0;
    L_0x0296:
        r0 = move-exception;
        throw r0;
    L_0x0298:
        r0 = move-exception;
        throw r0;
    L_0x029a:
        r0 = move-exception;
        throw r0;
    L_0x029c:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x029e }
    L_0x029e:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x02a0 }
    L_0x02a0:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x02a2 }
    L_0x02a2:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x025e }
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.RegisterPhone.onCreate(android.os.Bundle):void");
    }

    protected void onDestroy() {
        Log.i(T[93]);
        f();
        super.onDestroy();
    }

    static int i(RegisterPhone registerPhone) {
        return registerPhone.Q;
    }

    static boolean c(RegisterPhone registerPhone, boolean z) {
        registerPhone.R = z;
        return z;
    }

    protected String m() {
        Editable text = this.v.c.getText();
        if (text == null) {
            return null;
        }
        return text.toString();
    }

    public RegisterPhone() {
        this.I = 30;
        this.F = 0;
        this.O = 0;
        this.S = false;
        this.R = false;
        this.D = false;
    }

    static int b(RegisterPhone registerPhone, int i) {
        registerPhone.I = i;
        return i;
    }

    static int a(RegisterPhone registerPhone, int i) {
        registerPhone.Q = i;
        return i;
    }

    protected void onNewIntent(Intent intent) {
        try {
            super.onNewIntent(intent);
            if (intent.getBooleanExtra(T[58], false)) {
                Log.i(T[57]);
                f(getString(2131231788, new Object[]{getString(2131231580)}));
            }
        } catch (NullPointerException e) {
            throw e;
        }
    }

    private void l() {
        Object obj = 1;
        boolean z = DialogToastActivity.f;
        try {
            Object obj2 = !App.aO() ? 1 : null;
            try {
                if (App.v((Context) this)) {
                    obj = null;
                }
                if (!(obj2 == null || obj == null)) {
                    try {
                        startActivity(new Intent(this, RequestPermissionActivity.class).putExtra(T[85], new int[]{2130839704, 2130839702, 2130839699}).putExtra(T[82], new String[]{T[83], T[84], T[87], T[86], T[88]}).putExtra(T[89], 2131231642).putExtra(T[90], true));
                        if (!z) {
                            return;
                        }
                    } catch (NullPointerException e) {
                        throw e;
                    } catch (NullPointerException e2) {
                        throw e2;
                    }
                }
                if (obj2 != null) {
                    try {
                        RequestPermissionActivity.b(this, 2131231677, 2131231648, true);
                        if (!z) {
                            return;
                        }
                    } catch (NullPointerException e22) {
                        throw e22;
                    }
                }
                if (obj != null) {
                    try {
                        RequestPermissionActivity.a((Activity) this, 2131231618, 2131231619, true);
                    } catch (NullPointerException e222) {
                        throw e222;
                    }
                }
            } catch (NullPointerException e2222) {
                throw e2222;
            }
        } catch (NullPointerException e22222) {
            throw e22222;
        }
    }

    protected static int a(String str, String str2, int i) {
        int i2 = 0;
        boolean z = DialogToastActivity.f;
        int i3 = -1;
        if (!(str == null || str2 == null)) {
            try {
                if (str.length() >= i && str2.length() >= i) {
                    int length = str.length() - i;
                    int length2 = str2.length() - i;
                    i3 = 0;
                    while (i2 < i) {
                        try {
                            if (str.charAt(length + i2) != str2.charAt(length2 + i2)) {
                                i3++;
                            }
                            i2++;
                            if (z) {
                                break;
                            }
                        } catch (NullPointerException e) {
                            throw e;
                        }
                    }
                }
            } catch (NullPointerException e2) {
                throw e2;
            }
        }
        return i3;
    }

    private static boolean a(String str, String str2, String str3, boolean z) {
        try {
            if (!TextUtils.isEmpty(str)) {
                if (str.length() >= str2.length()) {
                    if (z) {
                        try {
                            if (b(str3, str)) {
                                if (EnterPhoneNumber.a(str2, str.substring(str2.length())) == 1) {
                                    return true;
                                }
                            }
                            return false;
                        } catch (NullPointerException e) {
                            throw e;
                        } catch (NullPointerException e2) {
                            throw e2;
                        }
                    }
                    try {
                        if (b(str3, str)) {
                            if (EnterPhoneNumber.a(str2, str) == 1) {
                                return true;
                            }
                        }
                        return false;
                    } catch (NullPointerException e22) {
                        throw e22;
                    } catch (NullPointerException e222) {
                        throw e222;
                    }
                }
            }
            return false;
        } catch (NullPointerException e2222) {
            throw e2222;
        } catch (NullPointerException e22222) {
            throw e22222;
        }
    }

    static int b(String str, String str2, String str3) {
        int i = 0;
        boolean z = DialogToastActivity.f;
        String replaceAll = str2.replaceAll(T[39], "");
        String replaceAll2 = str.replaceAll(T[37], "");
        int abs = Math.abs(replaceAll2.length() - replaceAll.length());
        if (abs == 1) {
            try {
                if (replaceAll2.length() > replaceAll.length()) {
                    return -1;
                }
            } catch (StringIndexOutOfBoundsException e) {
                throw e;
            } catch (StringIndexOutOfBoundsException e2) {
                throw e2;
            }
        }
        int i2 = 0;
        do {
            try {
                if (i2 >= replaceAll2.length()) {
                    break;
                }
                while (str3.charAt(i) != replaceAll.charAt(i2)) {
                    i++;
                    if (z) {
                        break;
                    }
                }
                if (replaceAll2.charAt(i2) != replaceAll.charAt(i2)) {
                    return i;
                }
                i++;
                i2++;
            } catch (StringIndexOutOfBoundsException e22) {
                Log.e(T[38] + e22);
                return -2;
            }
        } while (!z);
        if (abs == 0) {
            return -1;
        }
        int i3 = i;
        do {
            if (str3.charAt(i3) == replaceAll.charAt(replaceAll2.length())) {
                return i3;
            }
            i3++;
        } while (!z);
        return i3;
    }

    static boolean d(RegisterPhone registerPhone, boolean z) {
        registerPhone.J = z;
        return z;
    }

    static void g(RegisterPhone registerPhone) {
        registerPhone.p();
    }

    static boolean a(RegisterPhone registerPhone, boolean z) {
        registerPhone.D = z;
        return z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
        r5 = this;
        r2 = 0;
        r4 = -1;
        if (r6 != 0) goto L_0x008c;
    L_0x0004:
        if (r7 != r4) goto L_0x0085;
    L_0x0006:
        r0 = T;
        r1 = 69;
        r0 = r0[r1];
        r0 = r8.getStringExtra(r0);
        w = r0;
        r0 = T;
        r1 = 60;
        r0 = r0[r1];
        r0 = r8.getStringExtra(r0);
        r5.H = r0;
        r0 = r5.v;
        r0 = r0.e;
        r1 = w;
        r0.setText(r1);
        r0 = r5.v;
        r0 = r0.g;
        r1 = r5.H;
        r0.setText(r1);
        r0 = r5.H;
        r5.b(r0);
        r0 = r5.getPreferences(r2);
        r1 = r0.edit();
        r2 = T;	 Catch:{ NullPointerException -> 0x00c0 }
        r3 = 65;
        r2 = r2[r3];	 Catch:{ NullPointerException -> 0x00c0 }
        r3 = w;	 Catch:{ NullPointerException -> 0x00c0 }
        r1.putString(r2, r3);	 Catch:{ NullPointerException -> 0x00c0 }
        r2 = T;	 Catch:{ NullPointerException -> 0x00c0 }
        r3 = 64;
        r2 = r2[r3];	 Catch:{ NullPointerException -> 0x00c0 }
        r3 = w;	 Catch:{ NullPointerException -> 0x00c0 }
        r1.putString(r2, r3);	 Catch:{ NullPointerException -> 0x00c0 }
        r2 = T;	 Catch:{ NullPointerException -> 0x00c0 }
        r3 = 67;
        r2 = r2[r3];	 Catch:{ NullPointerException -> 0x00c0 }
        r3 = -1;
        r0 = r0.getInt(r2, r3);	 Catch:{ NullPointerException -> 0x00c0 }
        if (r0 != r4) goto L_0x006c;
    L_0x0060:
        r0 = T;	 Catch:{ NullPointerException -> 0x00c0 }
        r2 = 66;
        r0 = r0[r2];	 Catch:{ NullPointerException -> 0x00c0 }
        r2 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r1.putInt(r0, r2);	 Catch:{ NullPointerException -> 0x00c0 }
    L_0x006c:
        r0 = T;	 Catch:{ NullPointerException -> 0x00c2 }
        r2 = 61;
        r0 = r0[r2];	 Catch:{ NullPointerException -> 0x00c2 }
        r2 = -1;
        r1.putInt(r0, r2);	 Catch:{ NullPointerException -> 0x00c2 }
        r0 = r1.commit();	 Catch:{ NullPointerException -> 0x00c2 }
        if (r0 != 0) goto L_0x0085;
    L_0x007c:
        r0 = T;	 Catch:{ NullPointerException -> 0x00c2 }
        r1 = 62;
        r0 = r0[r1];	 Catch:{ NullPointerException -> 0x00c2 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ NullPointerException -> 0x00c2 }
    L_0x0085:
        r0 = 0;
        r5.N = r0;	 Catch:{ NullPointerException -> 0x00c4 }
        r0 = com.whatsapp.DialogToastActivity.f;	 Catch:{ NullPointerException -> 0x00c4 }
        if (r0 == 0) goto L_0x00b4;
    L_0x008c:
        r0 = 1;
        if (r6 != r0) goto L_0x00b4;
    L_0x008f:
        r0 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x00c8 }
        r0.<init>();	 Catch:{ NullPointerException -> 0x00c8 }
        r1 = T;	 Catch:{ NullPointerException -> 0x00c8 }
        r2 = 68;
        r1 = r1[r2];	 Catch:{ NullPointerException -> 0x00c8 }
        r1 = r0.append(r1);	 Catch:{ NullPointerException -> 0x00c8 }
        if (r7 != r4) goto L_0x00ca;
    L_0x00a0:
        r0 = T;	 Catch:{ NullPointerException -> 0x00c8 }
        r2 = 63;
        r0 = r0[r2];	 Catch:{ NullPointerException -> 0x00c8 }
    L_0x00a6:
        r0 = r1.append(r0);
        r0 = r0.toString();
        com.whatsapp.util.Log.i(r0);
        r5.n();
    L_0x00b4:
        r0 = r5.v;
        r0 = r0.e;
        r1 = r5.v;
        r1 = r1.a;
        r0.addTextChangedListener(r1);
        return;
    L_0x00c0:
        r0 = move-exception;
        throw r0;
    L_0x00c2:
        r0 = move-exception;
        throw r0;
    L_0x00c4:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00c6 }
    L_0x00c6:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x00c8 }
    L_0x00c8:
        r0 = move-exception;
        throw r0;
    L_0x00ca:
        r0 = T;
        r2 = 59;
        r0 = r0[r2];
        goto L_0x00a6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.RegisterPhone.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static java.lang.String a(java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
        r0 = 1;
        r1 = 0;
        r2 = 0;
        r3 = android.text.TextUtils.isEmpty(r11);	 Catch:{ NullPointerException -> 0x0015 }
        if (r3 != 0) goto L_0x0013;
    L_0x0009:
        r3 = r11.length();	 Catch:{ NullPointerException -> 0x0017 }
        r4 = r10.length();	 Catch:{ NullPointerException -> 0x0017 }
        if (r3 >= r4) goto L_0x0019;
    L_0x0013:
        r0 = r2;
    L_0x0014:
        return r0;
    L_0x0015:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0017 }
    L_0x0017:
        r0 = move-exception;
        throw r0;
    L_0x0019:
        r3 = T;
        r4 = 42;
        r3 = r3[r4];
        r4 = "";
        r3 = r11.replaceAll(r3, r4);
        r4 = T;
        r5 = 43;
        r4 = r4[r5];
        r5 = "";
        r5 = r9.replaceAll(r4, r5);
        r6 = com.whatsapp.aak.a(r10, r5);
        r4 = com.whatsapp.aak.a(r10, r3);
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r7 = r7.append(r10);
        r7 = r7.append(r6);
        r7 = r7.toString();
        r8 = 6;
        r8 = a(r6, r4, r8);
        if (r8 != 0) goto L_0x0080;
    L_0x0053:
        r8 = r4.equals(r6);	 Catch:{ NullPointerException -> 0x0067 }
        if (r8 != 0) goto L_0x0065;
    L_0x0059:
        r8 = r4.equals(r7);	 Catch:{ NullPointerException -> 0x0069 }
        if (r8 != 0) goto L_0x0065;
    L_0x005f:
        r8 = com.whatsapp.aak.a(r3, r6, r4, r10);	 Catch:{ NullPointerException -> 0x006b }
        if (r8 == 0) goto L_0x006d;
    L_0x0065:
        r0 = r2;
        goto L_0x0014;
    L_0x0067:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0069 }
    L_0x0069:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x006b }
    L_0x006b:
        r0 = move-exception;
        throw r0;
    L_0x006d:
        r5 = r5.endsWith(r4);	 Catch:{ NullPointerException -> 0x007c }
        if (r5 == 0) goto L_0x0080;
    L_0x0073:
        r5 = com.whatsapp.EnterPhoneNumber.a(r10, r4);	 Catch:{ NullPointerException -> 0x007e }
        r8 = 5;
        if (r5 != r8) goto L_0x0080;
    L_0x007a:
        r0 = r2;
        goto L_0x0014;
    L_0x007c:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x007e }
    L_0x007e:
        r0 = move-exception;
        throw r0;
    L_0x0080:
        if (r4 == 0) goto L_0x0093;
    L_0x0082:
        r5 = r3.equals(r4);	 Catch:{ NullPointerException -> 0x0091 }
        if (r5 != 0) goto L_0x0093;
    L_0x0088:
        r1 = 1;
        r1 = a(r3, r10, r7, r1);	 Catch:{ NullPointerException -> 0x0095 }
        if (r1 == 0) goto L_0x0097;
    L_0x008f:
        r0 = r3;
        goto L_0x0014;
    L_0x0091:
        r0 = move-exception;
        throw r0;
    L_0x0093:
        r0 = r1;
        goto L_0x0088;
    L_0x0095:
        r0 = move-exception;
        throw r0;
    L_0x0097:
        if (r0 == 0) goto L_0x00a5;
    L_0x0099:
        r1 = 1;
        r1 = a(r4, r10, r7, r1);	 Catch:{ NullPointerException -> 0x00a3 }
        if (r1 == 0) goto L_0x00a5;
    L_0x00a0:
        r0 = r4;
        goto L_0x0014;
    L_0x00a3:
        r0 = move-exception;
        throw r0;
    L_0x00a5:
        r1 = 0;
        r1 = a(r3, r10, r6, r1);	 Catch:{ NullPointerException -> 0x00bf }
        if (r1 == 0) goto L_0x00c1;
    L_0x00ac:
        r0 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x00bf }
        r0.<init>();	 Catch:{ NullPointerException -> 0x00bf }
        r0 = r0.append(r10);	 Catch:{ NullPointerException -> 0x00bf }
        r0 = r0.append(r3);	 Catch:{ NullPointerException -> 0x00bf }
        r0 = r0.toString();	 Catch:{ NullPointerException -> 0x00bf }
        goto L_0x0014;
    L_0x00bf:
        r0 = move-exception;
        throw r0;
    L_0x00c1:
        if (r0 == 0) goto L_0x00df;
    L_0x00c3:
        r0 = 0;
        r0 = a(r4, r10, r6, r0);	 Catch:{ NullPointerException -> 0x00dd }
        if (r0 == 0) goto L_0x00df;
    L_0x00ca:
        r0 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x00dd }
        r0.<init>();	 Catch:{ NullPointerException -> 0x00dd }
        r0 = r0.append(r10);	 Catch:{ NullPointerException -> 0x00dd }
        r0 = r0.append(r4);	 Catch:{ NullPointerException -> 0x00dd }
        r0 = r0.toString();	 Catch:{ NullPointerException -> 0x00dd }
        goto L_0x0014;
    L_0x00dd:
        r0 = move-exception;
        throw r0;
    L_0x00df:
        r0 = r2;
        goto L_0x0014;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.RegisterPhone.a(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    static boolean c(RegisterPhone registerPhone) {
        return registerPhone.J;
    }

    static Dialog a(RegisterPhone registerPhone, Dialog dialog) {
        registerPhone.M = dialog;
        return dialog;
    }

    static String h(RegisterPhone registerPhone) {
        return registerPhone.H;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String a(int r8, java.lang.String r9, java.lang.String r10) {
        /*
        r7 = this;
        r6 = 30;
        r1 = 1;
        r2 = 0;
        r3 = com.whatsapp.VerifyNumber.j();
        r0 = a(r10, r9, r3);	 Catch:{ NullPointerException -> 0x0023 }
        if (r0 == 0) goto L_0x0025;
    L_0x000e:
        r0 = r1;
    L_0x000f:
        if (r3 == 0) goto L_0x001f;
    L_0x0011:
        r4 = P;	 Catch:{ NullPointerException -> 0x0027 }
        if (r4 != 0) goto L_0x002f;
    L_0x0015:
        r4 = E;	 Catch:{ NullPointerException -> 0x0029 }
        if (r4 != 0) goto L_0x002f;
    L_0x0019:
        if (r0 != 0) goto L_0x002f;
    L_0x001b:
        r4 = r7.R;	 Catch:{ NullPointerException -> 0x002d }
        if (r4 != 0) goto L_0x002f;
    L_0x001f:
        r0 = "6";
    L_0x0022:
        return r0;
    L_0x0023:
        r0 = move-exception;
        throw r0;
    L_0x0025:
        r0 = r2;
        goto L_0x000f;
    L_0x0027:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0029 }
    L_0x0029:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x002b }
    L_0x002b:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x002d }
    L_0x002d:
        r0 = move-exception;
        throw r0;
    L_0x002f:
        r4 = T;
        r5 = 92;
        r4 = r4[r5];
        r5 = "";
        r3 = r3.replaceAll(r4, r5);
        r4 = T;
        r5 = 91;
        r4 = r4[r5];
        r5 = "";
        r4 = r10.replaceAll(r4, r5);
        if (r0 != 0) goto L_0x0064;
    L_0x004b:
        r5 = 6;
        r3 = a(r4, r3, r5);	 Catch:{ NullPointerException -> 0x0062 }
        if (r3 != 0) goto L_0x0064;
    L_0x0052:
        if (r8 != r6) goto L_0x0078;
    L_0x0054:
        r2 = r7.D;	 Catch:{ NullPointerException -> 0x0066 }
        if (r2 == 0) goto L_0x0078;
    L_0x0058:
        r0 = r7.R;	 Catch:{ NullPointerException -> 0x0068 }
        if (r0 == 0) goto L_0x006c;
    L_0x005c:
        if (r1 == 0) goto L_0x006c;
    L_0x005e:
        r0 = "0";
        goto L_0x0022;
    L_0x0062:
        r0 = move-exception;
        throw r0;
    L_0x0064:
        r1 = r2;
        goto L_0x0052;
    L_0x0066:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x0068 }
    L_0x0068:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x006a }
    L_0x006a:
        r0 = move-exception;
        throw r0;
    L_0x006c:
        if (r1 == 0) goto L_0x00a9;
    L_0x006e:
        r0 = P;	 Catch:{ NullPointerException -> 0x0076 }
        if (r0 == 0) goto L_0x00a9;
    L_0x0072:
        r0 = "3";
        goto L_0x0022;
    L_0x0076:
        r0 = move-exception;
        throw r0;
    L_0x0078:
        if (r8 != r6) goto L_0x0082;
    L_0x007a:
        if (r0 == 0) goto L_0x0082;
    L_0x007c:
        r0 = "4";
        goto L_0x0022;
    L_0x0080:
        r0 = move-exception;
        throw r0;
    L_0x0082:
        r0 = 31;
        if (r8 != r0) goto L_0x0094;
    L_0x0086:
        r0 = r7.R;	 Catch:{ NullPointerException -> 0x008e }
        if (r0 != 0) goto L_0x0090;
    L_0x008a:
        r0 = "2";
        goto L_0x0022;
    L_0x008e:
        r0 = move-exception;
        throw r0;
    L_0x0090:
        r0 = "1";
        goto L_0x0022;
    L_0x0094:
        r0 = 32;
        if (r8 != r0) goto L_0x00a9;
    L_0x0098:
        if (r1 != 0) goto L_0x00a9;
    L_0x009a:
        r0 = r7.R;	 Catch:{ NullPointerException -> 0x00a2 }
        if (r0 == 0) goto L_0x00a4;
    L_0x009e:
        r0 = "1";
        goto L_0x0022;
    L_0x00a2:
        r0 = move-exception;
        throw r0;
    L_0x00a4:
        r0 = "2";
        goto L_0x0022;
    L_0x00a9:
        r0 = "5";
        goto L_0x0022;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.RegisterPhone.a(int, java.lang.String, java.lang.String):java.lang.String");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        try {
            menu.add(0, 0, 0, 2131231750).setIcon(2130839514);
            if (App.am == 3) {
                menu.add(0, 1, 0, T[16]);
                menu.add(0, 2, 0, T[14]);
                menu.add(0, 3, 0, T[15]);
                menu.add(0, 4, 0, T[13]);
            }
            return super.onCreateOptionsMenu(menu);
        } catch (NullPointerException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(java.lang.String r5) {
        /*
        r4 = this;
        r0 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0056 }
        r0.<init>();	 Catch:{ IOException -> 0x0056 }
        r1 = T;	 Catch:{ IOException -> 0x0056 }
        r2 = 27;
        r1 = r1[r2];	 Catch:{ IOException -> 0x0056 }
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x0056 }
        r0 = r0.append(r5);	 Catch:{ IOException -> 0x0056 }
        r1 = T;	 Catch:{ IOException -> 0x0056 }
        r2 = 23;
        r1 = r1[r2];	 Catch:{ IOException -> 0x0056 }
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x0056 }
        r1 = com.whatsapp.u0.d(r5);	 Catch:{ IOException -> 0x0056 }
        r0 = r0.append(r1);	 Catch:{ IOException -> 0x0056 }
        r0 = r0.toString();	 Catch:{ IOException -> 0x0056 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ IOException -> 0x0056 }
    L_0x002c:
        r0 = r4.v;	 Catch:{ IOException -> 0x007c, NullPointerException -> 0x007e }
        r0 = r0.b;	 Catch:{ IOException -> 0x007c, NullPointerException -> 0x007e }
        if (r0 == 0) goto L_0x003d;
    L_0x0032:
        r0 = r4.v;	 Catch:{ IOException -> 0x007c, NullPointerException -> 0x007e }
        r0 = r0.c;	 Catch:{ IOException -> 0x007c, NullPointerException -> 0x007e }
        r1 = r4.v;	 Catch:{ IOException -> 0x007c, NullPointerException -> 0x007e }
        r1 = r1.b;	 Catch:{ IOException -> 0x007c, NullPointerException -> 0x007e }
        r0.removeTextChangedListener(r1);	 Catch:{ IOException -> 0x007c, NullPointerException -> 0x007e }
    L_0x003d:
        r0 = r4.v;	 Catch:{ NullPointerException -> 0x007e, IOException -> 0x0089 }
        r1 = new com.whatsapp.ar9;	 Catch:{ NullPointerException -> 0x007e, IOException -> 0x0089 }
        r2 = com.whatsapp.u0.d(r5);	 Catch:{ NullPointerException -> 0x007e, IOException -> 0x0089 }
        r1.<init>(r4, r4, r2);	 Catch:{ NullPointerException -> 0x007e, IOException -> 0x0089 }
        r0.b = r1;	 Catch:{ NullPointerException -> 0x007e, IOException -> 0x0089 }
        r0 = r4.v;	 Catch:{ NullPointerException -> 0x007e, IOException -> 0x0089 }
        r0 = r0.c;	 Catch:{ NullPointerException -> 0x007e, IOException -> 0x0089 }
        r1 = r4.v;	 Catch:{ NullPointerException -> 0x007e, IOException -> 0x0089 }
        r1 = r1.b;	 Catch:{ NullPointerException -> 0x007e, IOException -> 0x0089 }
        r0.addTextChangedListener(r1);	 Catch:{ NullPointerException -> 0x007e, IOException -> 0x0089 }
    L_0x0055:
        return;
    L_0x0056:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = T;
        r3 = 25;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.append(r5);
        r2 = T;
        r3 = 26;
        r2 = r2[r3];
        r1 = r1.append(r2);
        r1 = r1.toString();
        com.whatsapp.util.Log.b(r1, r0);
        goto L_0x002c;
    L_0x007c:
        r0 = move-exception;
        throw r0;	 Catch:{ NullPointerException -> 0x007e, IOException -> 0x0089 }
    L_0x007e:
        r0 = move-exception;
    L_0x007f:
        r1 = T;
        r2 = 24;
        r1 = r1[r2];
        com.whatsapp.util.Log.b(r1, r0);
        goto L_0x0055;
    L_0x0089:
        r0 = move-exception;
        goto L_0x007f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.RegisterPhone.b(java.lang.String):void");
    }

    private void p() {
        Log.i(T[17]);
        C = 7;
        c();
        d("");
        z = null;
        y = 0;
        App.b((Context) this, b(z));
        App.f(this, null);
    }
}
