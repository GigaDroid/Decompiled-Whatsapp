package com.whatsapp;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.ContactsContract.CommonDataKinds.Email;
import android.provider.ContactsContract.CommonDataKinds.StructuredPostal;
import android.support.v7.app.AlertDialog.Builder;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import c;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import com.whatsapp.util.bu;
import i;
import java.lang.reflect.Method;
import java.util.ArrayList;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;
import q;

public class ViewSharedContactActivity extends DialogToastActivity {
    private static final String[] z;
    private ArrayList n;
    private LinearLayout o;
    private Bitmap p;
    private ArrayList q;
    private String r;
    private q s;
    private boolean t;
    private l5 u;
    private boolean v;
    private a2_ w;
    private String x;
    private String y;

    static {
        String[] strArr = new String[30];
        String str = "\u0013n\\cLGn\\cLH/\u00128\u0013\u0013]t`\u0011f-t9\u0015\u0010]t`\u0011f-\u00008ggq\u00057\u0012\u00149\r1]Vv\u0013*a\u0011/\u0017";
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
                        i3 = 59;
                        break;
                    case at.g /*1*/:
                        i3 = 6;
                        break;
                    case at.i /*2*/:
                        i3 = 40;
                        break;
                    case at.o /*3*/:
                        i3 = 23;
                        break;
                    default:
                        i3 = 60;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "nTd";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "B\u007fQn\u0011vK\u0005sX";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "nTd";
                    obj = 3;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "yBiN";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    str = "\u0016+eZ\u0011_b";
                    obj = 5;
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    strArr2 = strArr3;
                    str = "nTd";
                    obj = 6;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "nTd";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "nTd";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "^kI~P";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "Ki[c]W";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "KnGyY\u0001";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "NhK\u007fYXmMs\u0006";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "KnGyYH";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "QoL";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "MeIeX";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "MoM`OSgZrXXiFc]Xr\u0007tN^g\\r\u0013MeIeX\u001bo[7RNjD6";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "MoM`OSgZrXXiFc]Xr\u0007{SZbwtSUrItHdv@xHTYNvUWcL7";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "{u\u0006`TZr[vLK(FrH";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "XiFc]Xrw~X";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "QoLd";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "MoM`OSgZrXXiFc]XrItHRpAcE\u0014dIdY\r2\u0005sYXiLr\u0013^tZxN";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    str = "^bAccXiFc]Xrw~R]i";
                    obj = 22;
                    i = 23;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    strArr2 = strArr3;
                    str = "UsD{";
                    obj = 23;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "MoM`OSgZrXXiFc]Xr\u0007`]rb\bySO&NxIUb";
                    obj = 24;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "WgQxIOYAyZWg\\rN";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "UsD{";
                    obj = 26;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "UsD{";
                    obj = 27;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "\\c\\CEKcdv^^jzrOTsZtY";
                    obj = 28;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u0016+";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        try {
            switch (menuItem.getItemId()) {
                case 16908332:
                    finish();
                    return true;
                default:
                    return super.onOptionsItemSelected(menuItem);
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
        throw e;
    }

    protected void onDestroy() {
        super.onDestroy();
        this.w.a();
    }

    static boolean a(ViewSharedContactActivity viewSharedContactActivity, boolean z) {
        viewSharedContactActivity.t = z;
        return z;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return false;
    }

    private void a(View view) {
        CheckBox checkBox = (CheckBox) view.findViewById(2131755444);
        try {
            if (checkBox.isChecked()) {
                checkBox.setChecked(false);
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            checkBox.setChecked(true);
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r10) {
        /*
        r9 = this;
        r2 = 0;
        r8 = 8;
        r7 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        super.onCreate(r10);	 Catch:{ IllegalArgumentException -> 0x008d }
        r0 = r9.getSupportActionBar();	 Catch:{ IllegalArgumentException -> 0x008d }
        r1 = 1;
        r0.setDisplayHomeAsUpEnabled(r1);	 Catch:{ IllegalArgumentException -> 0x008d }
        r0 = 2130903288; // 0x7f0300f8 float:1.741339E38 double:1.052806109E-314;
        r9.setContentView(r0);	 Catch:{ IllegalArgumentException -> 0x008d }
        r0 = r9.getIntent();	 Catch:{ IllegalArgumentException -> 0x008d }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x008d }
        r4 = 23;
        r1 = r1[r4];	 Catch:{ IllegalArgumentException -> 0x008d }
        r4 = 0;
        r0 = r0.getBooleanExtra(r1, r4);	 Catch:{ IllegalArgumentException -> 0x008d }
        r9.v = r0;	 Catch:{ IllegalArgumentException -> 0x008d }
        r0 = r9.getIntent();	 Catch:{ IllegalArgumentException -> 0x008d }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x008d }
        r4 = 16;
        r1 = r1[r4];	 Catch:{ IllegalArgumentException -> 0x008d }
        r0 = r0.getStringExtra(r1);	 Catch:{ IllegalArgumentException -> 0x008d }
        r9.r = r0;	 Catch:{ IllegalArgumentException -> 0x008d }
        r0 = r9.getIntent();	 Catch:{ IllegalArgumentException -> 0x008d }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x008d }
        r4 = 15;
        r1 = r1[r4];	 Catch:{ IllegalArgumentException -> 0x008d }
        r0 = r0.getStringExtra(r1);	 Catch:{ IllegalArgumentException -> 0x008d }
        r9.x = r0;	 Catch:{ IllegalArgumentException -> 0x008d }
        r0 = r9.getIntent();	 Catch:{ IllegalArgumentException -> 0x008d }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x008d }
        r4 = 20;
        r1 = r1[r4];	 Catch:{ IllegalArgumentException -> 0x008d }
        r0 = r0.getStringExtra(r1);	 Catch:{ IllegalArgumentException -> 0x008d }
        r9.y = r0;	 Catch:{ IllegalArgumentException -> 0x008d }
        r0 = r9.getIntent();	 Catch:{ IllegalArgumentException -> 0x008d }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x008d }
        r4 = 14;
        r1 = r1[r4];	 Catch:{ IllegalArgumentException -> 0x008d }
        r0 = r0.getStringArrayListExtra(r1);	 Catch:{ IllegalArgumentException -> 0x008d }
        r9.q = r0;	 Catch:{ IllegalArgumentException -> 0x008d }
        r0 = r9.getIntent();	 Catch:{ IllegalArgumentException -> 0x008d }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x008d }
        r4 = 21;
        r1 = r1[r4];	 Catch:{ IllegalArgumentException -> 0x008d }
        r0 = r0.getStringArrayListExtra(r1);	 Catch:{ IllegalArgumentException -> 0x008d }
        r9.n = r0;	 Catch:{ IllegalArgumentException -> 0x008d }
        r0 = r9.r;	 Catch:{ IllegalArgumentException -> 0x008d }
        if (r0 != 0) goto L_0x008f;
    L_0x007c:
        r0 = z;	 Catch:{ IllegalArgumentException -> 0x008d }
        r1 = 17;
        r0 = r0[r1];	 Catch:{ IllegalArgumentException -> 0x008d }
        com.whatsapp.util.Log.e(r0);	 Catch:{ IllegalArgumentException -> 0x008d }
        r0 = 2131232172; // 0x7f0805ac float:1.8080446E38 double:1.0529685995E-314;
        r1 = 0;
        com.whatsapp.App.a(r9, r0, r1);	 Catch:{ IllegalArgumentException -> 0x008d }
    L_0x008c:
        return;
    L_0x008d:
        r0 = move-exception;
        throw r0;
    L_0x008f:
        r0 = 2131755952; // 0x7f1003b0 float:1.9142798E38 double:1.053227381E-314;
        r0 = r9.findViewById(r0);	 Catch:{ IllegalArgumentException -> 0x021f }
        r0 = (android.widget.LinearLayout) r0;	 Catch:{ IllegalArgumentException -> 0x021f }
        r9.o = r0;	 Catch:{ IllegalArgumentException -> 0x021f }
        r0 = r9.r;	 Catch:{ IllegalArgumentException -> 0x021f }
        r0 = r9.a(r0);	 Catch:{ IllegalArgumentException -> 0x021f }
        r9.s = r0;	 Catch:{ IllegalArgumentException -> 0x021f }
        r0 = r9.s;	 Catch:{ IllegalArgumentException -> 0x021f }
        if (r0 != 0) goto L_0x00ac;
    L_0x00a6:
        r0 = 2131231117; // 0x7f08018d float:1.8078306E38 double:1.0529680783E-314;
        r9.a(r0);	 Catch:{ IllegalArgumentException -> 0x021f }
    L_0x00ac:
        r0 = r9.v;	 Catch:{ IllegalArgumentException -> 0x0221 }
        if (r0 == 0) goto L_0x00e5;
    L_0x00b0:
        r0 = 2131755953; // 0x7f1003b1 float:1.91428E38 double:1.0532273817E-314;
        r0 = r9.findViewById(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0223 }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0223 }
        r0 = 2131755954; // 0x7f1003b2 float:1.9142802E38 double:1.053227382E-314;
        r0 = r9.findViewById(r0);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0223 }
        r1 = 0;
        r0.setVisibility(r1);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0223 }
        r0 = r9.s;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0223 }
        if (r0 == 0) goto L_0x00d9;
    L_0x00cb:
        r0 = r9.s;	 Catch:{ IllegalArgumentException -> 0x0225 }
        r1 = r9.getBaseContext();	 Catch:{ IllegalArgumentException -> 0x0225 }
        r4 = r9.y;	 Catch:{ IllegalArgumentException -> 0x0225 }
        r1 = q.a(r1, r4);	 Catch:{ IllegalArgumentException -> 0x0225 }
        r0.e = r1;	 Catch:{ IllegalArgumentException -> 0x0225 }
    L_0x00d9:
        r0 = r9.getSupportActionBar();	 Catch:{ IllegalArgumentException -> 0x0231 }
        r1 = 2131231863; // 0x7f080477 float:1.807982E38 double:1.052968447E-314;
        r0.setTitle(r1);	 Catch:{ IllegalArgumentException -> 0x0231 }
        if (r3 == 0) goto L_0x0106;
    L_0x00e5:
        r0 = 2131755953; // 0x7f1003b1 float:1.91428E38 double:1.0532273817E-314;
        r0 = r9.findViewById(r0);	 Catch:{ IllegalArgumentException -> 0x0231 }
        r1 = 0;
        r0.setVisibility(r1);	 Catch:{ IllegalArgumentException -> 0x0231 }
        r0 = 2131755954; // 0x7f1003b2 float:1.9142802E38 double:1.053227382E-314;
        r0 = r9.findViewById(r0);	 Catch:{ IllegalArgumentException -> 0x0231 }
        r1 = 8;
        r0.setVisibility(r1);	 Catch:{ IllegalArgumentException -> 0x0231 }
        r0 = r9.getSupportActionBar();	 Catch:{ IllegalArgumentException -> 0x0231 }
        r1 = 2131232226; // 0x7f0805e2 float:1.8080555E38 double:1.052968626E-314;
        r0.setTitle(r1);	 Catch:{ IllegalArgumentException -> 0x0231 }
    L_0x0106:
        r0 = r9.s;
        if (r0 == 0) goto L_0x01d7;
    L_0x010a:
        r0 = 2131755123; // 0x7f100073 float:1.9141116E38 double:1.0532269716E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r1 = r9.s;	 Catch:{ IllegalArgumentException -> 0x0233 }
        r1 = r1.e;	 Catch:{ IllegalArgumentException -> 0x0233 }
        if (r1 == 0) goto L_0x0137;
    L_0x0119:
        r1 = r9.s;	 Catch:{ IllegalArgumentException -> 0x0233 }
        r1 = r1.e;	 Catch:{ IllegalArgumentException -> 0x0233 }
        r1 = r1.length;	 Catch:{ IllegalArgumentException -> 0x0233 }
        if (r1 <= 0) goto L_0x0137;
    L_0x0120:
        r1 = r9.v;	 Catch:{ IllegalArgumentException -> 0x0235 }
        if (r1 != 0) goto L_0x0243;
    L_0x0124:
        r1 = r9.s;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0237, StringIndexOutOfBoundsException -> 0x0259, IllegalArgumentException -> 0x0257 }
        r1 = r1.e;	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0237, StringIndexOutOfBoundsException -> 0x0259, IllegalArgumentException -> 0x0257 }
        r4 = 0;
        r1 = android.backport.util.Base64.decode(r1, r4);	 Catch:{ ArrayIndexOutOfBoundsException -> 0x0237, StringIndexOutOfBoundsException -> 0x0259, IllegalArgumentException -> 0x0257 }
    L_0x012d:
        if (r1 == 0) goto L_0x0137;
    L_0x012f:
        r4 = 0;
        r5 = r1.length;	 Catch:{ IllegalArgumentException -> 0x0249 }
        r1 = android.graphics.BitmapFactory.decodeByteArray(r1, r4, r5);	 Catch:{ IllegalArgumentException -> 0x0249 }
        r9.p = r1;	 Catch:{ IllegalArgumentException -> 0x0249 }
    L_0x0137:
        r1 = r9.p;	 Catch:{ IllegalArgumentException -> 0x024b }
        if (r1 != 0) goto L_0x0147;
    L_0x013b:
        r1 = 2130837611; // 0x7f02006b float:1.728018E38 double:1.0527736605E-314;
        r1 = com.whatsapp.l5.b(r1);	 Catch:{ IllegalArgumentException -> 0x024d }
        r0.setImageBitmap(r1);	 Catch:{ IllegalArgumentException -> 0x024d }
        if (r3 == 0) goto L_0x014c;
    L_0x0147:
        r1 = r9.p;	 Catch:{ IllegalArgumentException -> 0x024d }
        r0.setImageBitmap(r1);	 Catch:{ IllegalArgumentException -> 0x024d }
    L_0x014c:
        r1 = r9.n;
        r4 = r1.iterator();
    L_0x0152:
        r1 = r4.hasNext();
        if (r1 == 0) goto L_0x0183;
    L_0x0158:
        r1 = r4.next();
        r1 = (java.lang.String) r1;
        r5 = android.text.TextUtils.isEmpty(r1);	 Catch:{ IllegalArgumentException -> 0x024f }
        if (r5 != 0) goto L_0x0181;
    L_0x0164:
        r5 = z;	 Catch:{ IllegalArgumentException -> 0x024f }
        r6 = 19;
        r5 = r5[r6];	 Catch:{ IllegalArgumentException -> 0x024f }
        r5 = r1.endsWith(r5);	 Catch:{ IllegalArgumentException -> 0x024f }
        if (r5 == 0) goto L_0x0181;
    L_0x0170:
        r5 = com.whatsapp.App.as;
        r1 = r5.f(r1);
        if (r1 == 0) goto L_0x0183;
    L_0x0178:
        r9.u = r1;	 Catch:{ IllegalArgumentException -> 0x0251 }
        r5 = r9.w;	 Catch:{ IllegalArgumentException -> 0x0251 }
        r5.b(r1, r0);	 Catch:{ IllegalArgumentException -> 0x0251 }
        if (r3 == 0) goto L_0x0183;
    L_0x0181:
        if (r3 == 0) goto L_0x0152;
    L_0x0183:
        r0 = r9.s;	 Catch:{ IllegalArgumentException -> 0x0253 }
        r0 = r0.i;	 Catch:{ IllegalArgumentException -> 0x0253 }
        if (r0 == 0) goto L_0x025b;
    L_0x0189:
        r0 = r9.s;	 Catch:{ IllegalArgumentException -> 0x0253 }
        r0 = r0.i;	 Catch:{ IllegalArgumentException -> 0x0253 }
        r0 = r0.size();	 Catch:{ IllegalArgumentException -> 0x0253 }
        if (r0 <= 0) goto L_0x025b;
    L_0x0193:
        r0 = r9.s;
        r0 = r0.i;
        r0 = r0.get(r7);
        r0 = (o) r0;
        r2 = r0.c;
        r0 = r9.s;
        r0 = r0.i;
        r0 = r0.get(r7);
        r0 = (o) r0;
        r0 = r0.a;
    L_0x01ab:
        r1 = r9.s;
        r1 = r1.j;
        r1 = r1.e;
        r9.a(r1, r2, r0);
        r9.b();
        r0 = r9.o;
        r0 = r0.getChildCount();
        if (r0 <= 0) goto L_0x01d7;
    L_0x01bf:
        r0 = r9.o;
        r1 = r9.o;
        r1 = r1.getChildCount();
        r1 = r1 + -1;
        r0 = r0.getChildAt(r1);
        r1 = 2131755376; // 0x7f100170 float:1.914163E38 double:1.0532270966E-314;
        r0 = r0.findViewById(r1);
        r0.setVisibility(r8);
    L_0x01d7:
        r0 = r9.u;	 Catch:{ IllegalArgumentException -> 0x0255 }
        if (r0 == 0) goto L_0x01e6;
    L_0x01db:
        r0 = new com.whatsapp.a9i;	 Catch:{ IllegalArgumentException -> 0x0255 }
        r0.<init>(r9);	 Catch:{ IllegalArgumentException -> 0x0255 }
        r1 = 0;
        r1 = new java.lang.Void[r1];	 Catch:{ IllegalArgumentException -> 0x0255 }
        com.whatsapp.util.bq.a(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0255 }
    L_0x01e6:
        r0 = 2131755544; // 0x7f100218 float:1.914197E38 double:1.0532271796E-314;
        r0 = r9.findViewById(r0);
        r1 = new com.whatsapp.at0;
        r1.<init>(r9);
        r0.setOnClickListener(r1);
        r0 = 2131755628; // 0x7f10026c float:1.914214E38 double:1.053227221E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.Button) r0;
        r1 = 2131231862; // 0x7f080476 float:1.8079817E38 double:1.0529684463E-314;
        r0.setText(r1);
        r1 = new com.whatsapp.xd;
        r1.<init>(r9);
        r0.setOnClickListener(r1);
        r0 = 2131755629; // 0x7f10026d float:1.9142143E38 double:1.0532272216E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.Button) r0;
        r1 = new com.whatsapp.aqn;
        r1.<init>(r9);
        r0.setOnClickListener(r1);
        goto L_0x008c;
    L_0x021f:
        r0 = move-exception;
        throw r0;
    L_0x0221:
        r0 = move-exception;
        throw r0;	 Catch:{  }
    L_0x0223:
        r0 = move-exception;
        throw r0;
    L_0x0225:
        r0 = move-exception;
        r0 = z;
        r1 = 18;
        r0 = r0[r1];
        com.whatsapp.util.Log.e(r0);
        goto L_0x00d9;
    L_0x0231:
        r0 = move-exception;
        throw r0;
    L_0x0233:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0235 }
    L_0x0235:
        r0 = move-exception;
        throw r0;
    L_0x0237:
        r1 = move-exception;
    L_0x0238:
        r4 = z;
        r5 = 22;
        r4 = r4[r5];
        com.whatsapp.util.Log.b(r4, r1);
        if (r3 == 0) goto L_0x025e;
    L_0x0243:
        r1 = r9.s;
        r1 = r1.e;
        goto L_0x012d;
    L_0x0249:
        r0 = move-exception;
        throw r0;
    L_0x024b:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x024d }
    L_0x024d:
        r0 = move-exception;
        throw r0;
    L_0x024f:
        r0 = move-exception;
        throw r0;
    L_0x0251:
        r0 = move-exception;
        throw r0;
    L_0x0253:
        r0 = move-exception;
        throw r0;
    L_0x0255:
        r0 = move-exception;
        throw r0;
    L_0x0257:
        r1 = move-exception;
        goto L_0x0238;
    L_0x0259:
        r1 = move-exception;
        goto L_0x0238;
    L_0x025b:
        r0 = r2;
        goto L_0x01ab;
    L_0x025e:
        r1 = r2;
        goto L_0x012d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ViewSharedContactActivity.onCreate(android.os.Bundle):void");
    }

    public ViewSharedContactActivity() {
        this.s = null;
        this.p = null;
        this.t = false;
        this.v = false;
        this.q = new ArrayList();
        this.n = new ArrayList();
        this.u = null;
        this.w = new a2_();
    }

    static Bitmap a(ViewSharedContactActivity viewSharedContactActivity, Bitmap bitmap) {
        viewSharedContactActivity.p = bitmap;
        return bitmap;
    }

    static void h(ViewSharedContactActivity viewSharedContactActivity) {
        viewSharedContactActivity.f();
    }

    private void b() {
        ArrayList d = d();
        c();
        c(true);
        a(d);
        c(false);
    }

    static l5 f(ViewSharedContactActivity viewSharedContactActivity) {
        return viewSharedContactActivity.u;
    }

    public void g(int i) {
        if (i == 2131231117) {
            try {
                finish();
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.ArrayList d() {
        /*
        r11 = this;
        r3 = com.whatsapp.DialogToastActivity.f;
        r4 = new java.util.ArrayList;
        r4.<init>();
        r0 = r11.s;
        r0 = r0.k;
        if (r0 == 0) goto L_0x0099;
    L_0x000d:
        r0 = r11.s;
        r0 = r0.k;
        r5 = r0.iterator();
    L_0x0015:
        r0 = r5.hasNext();
        if (r0 == 0) goto L_0x0099;
    L_0x001b:
        r0 = r5.next();
        r0 = (g) r0;
        r1 = r0.b;	 Catch:{ IllegalArgumentException -> 0x009a }
        if (r1 != 0) goto L_0x002a;
    L_0x0025:
        r4.add(r0);	 Catch:{ IllegalArgumentException -> 0x009a }
        if (r3 == 0) goto L_0x0015;
    L_0x002a:
        r1 = 2130839440; // 0x7f020790 float:1.728389E38 double:1.052774564E-314;
        r2 = r11.v;
        if (r2 == 0) goto L_0x00ad;
    L_0x0031:
        r1 = 2130839427; // 0x7f020783 float:1.7283864E38 double:1.0527745577E-314;
        r2 = r1;
    L_0x0035:
        r6 = r0.c;	 Catch:{ IllegalArgumentException -> 0x009c }
        r1 = r0.a;	 Catch:{ IllegalArgumentException -> 0x009c }
        if (r1 != 0) goto L_0x009e;
    L_0x003b:
        r1 = r0.d;	 Catch:{ IllegalArgumentException -> 0x009c }
    L_0x003d:
        r7 = 2;
        r2 = r11.a(r6, r1, r2, r7);
        r1 = 2131755440; // 0x7f1001b0 float:1.914176E38 double:1.053227128E-314;
        r6 = r2.findViewById(r1);
        r1 = 2131755445; // 0x7f1001b5 float:1.914177E38 double:1.0532271307E-314;
        r1 = r2.findViewById(r1);
        r1 = (android.widget.ImageView) r1;
        r7 = r11.v;	 Catch:{ IllegalArgumentException -> 0x00a7 }
        if (r7 != 0) goto L_0x0080;
    L_0x0056:
        r7 = r0.b;	 Catch:{ IllegalArgumentException -> 0x00a9 }
        if (r7 == 0) goto L_0x0080;
    L_0x005a:
        r7 = new com.whatsapp.a9s;	 Catch:{ IllegalArgumentException -> 0x00ab }
        r7.<init>(r11, r0);	 Catch:{ IllegalArgumentException -> 0x00ab }
        r6.setOnClickListener(r7);	 Catch:{ IllegalArgumentException -> 0x00ab }
        r6 = new com.whatsapp.gt;	 Catch:{ IllegalArgumentException -> 0x00ab }
        r7 = 1041865114; // 0x3e19999a float:0.15 double:5.147497604E-315;
        r8 = 1041865114; // 0x3e19999a float:0.15 double:5.147497604E-315;
        r9 = 1041865114; // 0x3e19999a float:0.15 double:5.147497604E-315;
        r10 = 1041865114; // 0x3e19999a float:0.15 double:5.147497604E-315;
        r6.<init>(r7, r8, r9, r10);	 Catch:{ IllegalArgumentException -> 0x00ab }
        r1.setOnTouchListener(r6);	 Catch:{ IllegalArgumentException -> 0x00ab }
        r6 = new com.whatsapp.a4j;	 Catch:{ IllegalArgumentException -> 0x00ab }
        r6.<init>(r11, r0);	 Catch:{ IllegalArgumentException -> 0x00ab }
        r1.setOnClickListener(r6);	 Catch:{ IllegalArgumentException -> 0x00ab }
        if (r3 == 0) goto L_0x008f;
    L_0x0080:
        r11.b(r2);	 Catch:{ IllegalArgumentException -> 0x00ab }
        r1 = 1;
        r2.setClickable(r1);	 Catch:{ IllegalArgumentException -> 0x00ab }
        r1 = new com.whatsapp.atf;	 Catch:{ IllegalArgumentException -> 0x00ab }
        r1.<init>(r11, r2);	 Catch:{ IllegalArgumentException -> 0x00ab }
        r2.setOnClickListener(r1);	 Catch:{ IllegalArgumentException -> 0x00ab }
    L_0x008f:
        r2.setTag(r0);
        r0 = r11.o;
        r0.addView(r2);
        if (r3 == 0) goto L_0x0015;
    L_0x0099:
        return r4;
    L_0x009a:
        r0 = move-exception;
        throw r0;
    L_0x009c:
        r0 = move-exception;
        throw r0;
    L_0x009e:
        r1 = android.provider.ContactsContract.CommonDataKinds.Phone.class;
        r7 = r0.a;
        r1 = r11.a(r1, r7);
        goto L_0x003d;
    L_0x00a7:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00a9 }
    L_0x00a9:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x00ab }
    L_0x00ab:
        r0 = move-exception;
        throw r0;
    L_0x00ad:
        r2 = r1;
        goto L_0x0035;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ViewSharedContactActivity.d():java.util.ArrayList");
    }

    private String a(Class cls, int i) {
        try {
            Method method = cls.getMethod(z[29], new Class[]{Integer.TYPE});
            return App.z().getString(((Integer) method.invoke(null, new Object[]{Integer.valueOf(i)})).intValue());
        } catch (Throwable e) {
            Log.a(e);
            return null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.util.ArrayList r8) {
        /*
        r7 = this;
        r2 = com.whatsapp.DialogToastActivity.f;
        r3 = r8.iterator();
    L_0x0006:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x0057;
    L_0x000c:
        r0 = r3.next();
        r0 = (g) r0;
        r4 = r0.c;	 Catch:{ IllegalArgumentException -> 0x0058 }
        r1 = r0.a;	 Catch:{ IllegalArgumentException -> 0x0058 }
        if (r1 != 0) goto L_0x005a;
    L_0x0018:
        r1 = r0.d;	 Catch:{ IllegalArgumentException -> 0x0058 }
    L_0x001a:
        r5 = 2130839427; // 0x7f020783 float:1.7283864E38 double:1.0527745577E-314;
        r6 = 2;
        r4 = r7.a(r4, r1, r5, r6);
        r7.b(r4);
        r1 = r7.v;
        if (r1 != 0) goto L_0x0041;
    L_0x0029:
        r1 = 2131755441; // 0x7f1001b1 float:1.9141761E38 double:1.0532271287E-314;
        r1 = r4.findViewById(r1);
        r1 = (android.widget.ImageView) r1;
        r5 = 4;
        r1.setVisibility(r5);	 Catch:{ IllegalArgumentException -> 0x0063 }
        r1 = z;	 Catch:{ IllegalArgumentException -> 0x0063 }
        r5 = 25;
        r1 = r1[r5];	 Catch:{ IllegalArgumentException -> 0x0063 }
        com.whatsapp.util.Log.w(r1);	 Catch:{ IllegalArgumentException -> 0x0063 }
        if (r2 == 0) goto L_0x004d;
    L_0x0041:
        r1 = 1;
        r4.setClickable(r1);	 Catch:{ IllegalArgumentException -> 0x0063 }
        r1 = new com.whatsapp.h0;	 Catch:{ IllegalArgumentException -> 0x0063 }
        r1.<init>(r7, r4);	 Catch:{ IllegalArgumentException -> 0x0063 }
        r4.setOnClickListener(r1);	 Catch:{ IllegalArgumentException -> 0x0063 }
    L_0x004d:
        r4.setTag(r0);
        r0 = r7.o;
        r0.addView(r4);
        if (r2 == 0) goto L_0x0006;
    L_0x0057:
        return;
    L_0x0058:
        r0 = move-exception;
        throw r0;
    L_0x005a:
        r1 = android.provider.ContactsContract.CommonDataKinds.Phone.class;
        r5 = r0.a;
        r1 = r7.a(r1, r5);
        goto L_0x001a;
    L_0x0063:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ViewSharedContactActivity.a(java.util.ArrayList):void");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        try {
            super.onActivityResult(i, i2, intent);
            switch (i) {
                case at.g /*1*/:
                    if (i2 == -1) {
                        bu.a(this.q, this.n, this.s.a(), intent.getData().getLastPathSegment(), (Activity) this);
                    }
                default:
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    private void a(String str, String str2, String str3) {
        ((TextEmojiLabel) findViewById(2131755466)).a(str);
        TextView textView = (TextView) findViewById(2131755528);
        try {
            if (TextUtils.isEmpty(str2)) {
                textView.setVisibility(8);
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            textView.setText(str2);
            textView.setVisibility(0);
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (IllegalArgumentException e2) {
            throw e2;
        }
    }

    static Bitmap g(ViewSharedContactActivity viewSharedContactActivity) {
        return viewSharedContactActivity.p;
    }

    static ArrayList e(ViewSharedContactActivity viewSharedContactActivity) {
        return viewSharedContactActivity.n;
    }

    private void b(View view) {
        View findViewById = view.findViewById(2131755440);
        View findViewById2 = view.findViewById(2131755445);
        findViewById.setClickable(false);
        findViewById2.setVisibility(8);
        findViewById2.setClickable(false);
    }

    static ArrayList d(ViewSharedContactActivity viewSharedContactActivity) {
        return viewSharedContactActivity.q;
    }

    @TargetApi(11)
    protected void a() {
        new Builder(this).setMessage(2131230787).setPositiveButton(2131231544, new c5(this)).setNeutralButton(2131231135, new az0(this)).create().show();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(boolean r12) {
        /*
        r11 = this;
        r4 = com.whatsapp.DialogToastActivity.f;
        r0 = r11.s;
        r0 = r0.g;
        if (r0 == 0) goto L_0x0174;
    L_0x0008:
        r0 = r11.s;
        r0 = r0.g;
        r0 = r0.keySet();
        r5 = r0.iterator();
    L_0x0014:
        r0 = r5.hasNext();
        if (r0 == 0) goto L_0x0174;
    L_0x001a:
        r0 = r5.next();
        r0 = (java.lang.String) r0;
        r1 = r11.s;
        r1 = r1.g;
        r0 = r1.get(r0);
        r0 = (java.util.List) r0;
        r6 = r0.iterator();
    L_0x002e:
        r0 = r6.hasNext();
        if (r0 == 0) goto L_0x0172;
    L_0x0034:
        r0 = r6.next();
        r0 = (m) r0;
        if (r12 == 0) goto L_0x004b;
    L_0x003c:
        r1 = r0.a;	 Catch:{ ParseException -> 0x0175 }
        r2 = z;	 Catch:{ ParseException -> 0x0175 }
        r3 = 7;
        r2 = r2[r3];	 Catch:{ ParseException -> 0x0175 }
        r1 = r1.equals(r2);	 Catch:{ ParseException -> 0x0175 }
        if (r1 != 0) goto L_0x004b;
    L_0x0049:
        if (r4 == 0) goto L_0x002e;
    L_0x004b:
        if (r12 != 0) goto L_0x005c;
    L_0x004d:
        r1 = r0.a;	 Catch:{ ParseException -> 0x0179 }
        r2 = z;	 Catch:{ ParseException -> 0x0179 }
        r3 = 2;
        r2 = r2[r3];	 Catch:{ ParseException -> 0x0179 }
        r1 = r1.equals(r2);	 Catch:{ ParseException -> 0x0179 }
        if (r1 == 0) goto L_0x005c;
    L_0x005a:
        if (r4 == 0) goto L_0x002e;
    L_0x005c:
        r1 = r0.c;
        r2 = r0.a;
        r3 = z;
        r7 = 4;
        r3 = r3[r7];
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0084;
    L_0x006b:
        r2 = z;
        r3 = 0;
        r2 = r2[r3];
        r2 = java.util.regex.Pattern.compile(r2);
        r3 = r0.c;
        r2 = r2.matcher(r3);
        r2 = r2.matches();
        if (r2 != 0) goto L_0x0082;
    L_0x0080:
        if (r4 == 0) goto L_0x002e;
    L_0x0082:
        if (r4 == 0) goto L_0x0183;
    L_0x0084:
        r2 = r0.a;	 Catch:{ ParseException -> 0x017d }
        r3 = z;	 Catch:{ ParseException -> 0x017d }
        r7 = 5;
        r3 = r3[r7];	 Catch:{ ParseException -> 0x017d }
        r2 = r2.equals(r3);	 Catch:{ ParseException -> 0x017d }
        if (r2 == 0) goto L_0x0183;
    L_0x0091:
        r2 = z;	 Catch:{ ParseException -> 0x017f }
        r3 = 1;
        r2 = r2[r3];	 Catch:{ ParseException -> 0x017f }
        r2 = r1.startsWith(r2);	 Catch:{ ParseException -> 0x017f }
        if (r2 == 0) goto L_0x00a4;
    L_0x009c:
        r2 = z;	 Catch:{ ParseException -> 0x017f }
        r3 = 6;
        r2 = r2[r3];	 Catch:{ ParseException -> 0x017f }
        r3 = 1;
        if (r4 == 0) goto L_0x00aa;
    L_0x00a4:
        r2 = z;	 Catch:{ ParseException -> 0x017f }
        r3 = 3;
        r2 = r2[r3];	 Catch:{ ParseException -> 0x017f }
        r3 = 0;
    L_0x00aa:
        r7 = new java.text.SimpleDateFormat;	 Catch:{ ParseException -> 0x017f }
        r7.<init>(r2);	 Catch:{ ParseException -> 0x017f }
        r2 = r7.parse(r1);	 Catch:{ ParseException -> 0x017f }
        r8 = r2.getTime();	 Catch:{ ParseException -> 0x017f }
        if (r3 == 0) goto L_0x00c3;
    L_0x00b9:
        r2 = com.whatsapp.App.z();	 Catch:{ ParseException -> 0x017f }
        r1 = com.whatsapp.util.cs.e(r2, r8);	 Catch:{ ParseException -> 0x017f }
        if (r4 == 0) goto L_0x00cc;
    L_0x00c3:
        r2 = r1;
        r1 = com.whatsapp.App.z();	 Catch:{ ParseException -> 0x0192 }
        r1 = com.whatsapp.util.cs.m(r1, r8);	 Catch:{ ParseException -> 0x0192 }
    L_0x00cc:
        r2 = r1;
    L_0x00cd:
        r1 = q.b;
        r3 = r0.a;
        r1 = r1.containsKey(r3);
        if (r1 == 0) goto L_0x00e3;
    L_0x00d7:
        r1 = q.c;
        r3 = r0.a;
        r1 = r1.get(r3);
        r1 = (java.lang.String) r1;
        if (r4 == 0) goto L_0x0120;
    L_0x00e3:
        r1 = r0.a;	 Catch:{ ParseException -> 0x0186 }
        r3 = z;	 Catch:{ ParseException -> 0x0186 }
        r7 = 8;
        r3 = r3[r7];	 Catch:{ ParseException -> 0x0186 }
        r1 = r1.equals(r3);	 Catch:{ ParseException -> 0x0186 }
        if (r1 == 0) goto L_0x0116;
    L_0x00f1:
        r1 = r0.d;
        r1 = r1.toArray();
        if (r1 == 0) goto L_0x0109;
    L_0x00f9:
        r1 = r1.length;	 Catch:{ ParseException -> 0x0188 }
        if (r1 <= 0) goto L_0x0109;
    L_0x00fc:
        r1 = r0.d;
        r1 = r1.toArray();
        r3 = 0;
        r1 = r1[r3];
        r1 = (java.lang.String) r1;
        if (r4 == 0) goto L_0x0114;
    L_0x0109:
        r1 = r11.getResources();
        r3 = 2131232236; // 0x7f0805ec float:1.8080576E38 double:1.052968631E-314;
        r1 = r1.getString(r3);
    L_0x0114:
        if (r4 == 0) goto L_0x0120;
    L_0x0116:
        r1 = q.c;
        r3 = r0.a;
        r1 = r1.get(r3);
        r1 = (java.lang.String) r1;
    L_0x0120:
        r3 = 2130837742; // 0x7f0200ee float:1.7280447E38 double:1.052773725E-314;
        r7 = 3;
        r2 = r11.a(r2, r1, r3, r7);
        r1 = 2131755441; // 0x7f1001b1 float:1.9141761E38 double:1.0532271287E-314;
        r1 = r2.findViewById(r1);
        r1 = (android.widget.ImageView) r1;
        r3 = 4;
        r1.setVisibility(r3);	 Catch:{ ParseException -> 0x018a }
        r11.b(r2);	 Catch:{ ParseException -> 0x018a }
        r1 = r11.v;	 Catch:{ ParseException -> 0x018a }
        if (r1 != 0) goto L_0x0158;
    L_0x013c:
        r1 = r0.a;	 Catch:{ ParseException -> 0x018c }
        r3 = z;	 Catch:{ ParseException -> 0x018c }
        r7 = 9;
        r3 = r3[r7];	 Catch:{ ParseException -> 0x018c }
        r1 = r1.equals(r3);	 Catch:{ ParseException -> 0x018c }
        if (r1 == 0) goto L_0x0158;
    L_0x014a:
        r1 = 1;
        r2.setClickable(r1);	 Catch:{ ParseException -> 0x018e }
        r1 = new com.whatsapp.ax;	 Catch:{ ParseException -> 0x018e }
        r1.<init>(r11);	 Catch:{ ParseException -> 0x018e }
        r2.setOnClickListener(r1);	 Catch:{ ParseException -> 0x018e }
        if (r4 == 0) goto L_0x0168;
    L_0x0158:
        r1 = r11.v;	 Catch:{ ParseException -> 0x0190 }
        if (r1 == 0) goto L_0x0168;
    L_0x015c:
        r1 = 1;
        r2.setClickable(r1);	 Catch:{ ParseException -> 0x0190 }
        r1 = new com.whatsapp.atq;	 Catch:{ ParseException -> 0x0190 }
        r1.<init>(r11);	 Catch:{ ParseException -> 0x0190 }
        r2.setOnClickListener(r1);	 Catch:{ ParseException -> 0x0190 }
    L_0x0168:
        r2.setTag(r0);
        r0 = r11.o;
        r0.addView(r2);
        if (r4 == 0) goto L_0x002e;
    L_0x0172:
        if (r4 == 0) goto L_0x0014;
    L_0x0174:
        return;
    L_0x0175:
        r0 = move-exception;
        throw r0;	 Catch:{ ParseException -> 0x0177 }
    L_0x0177:
        r0 = move-exception;
        throw r0;
    L_0x0179:
        r0 = move-exception;
        throw r0;	 Catch:{ ParseException -> 0x017b }
    L_0x017b:
        r0 = move-exception;
        throw r0;
    L_0x017d:
        r0 = move-exception;
        throw r0;
    L_0x017f:
        r2 = move-exception;
    L_0x0180:
        r2.printStackTrace();
    L_0x0183:
        r2 = r1;
        goto L_0x00cd;
    L_0x0186:
        r0 = move-exception;
        throw r0;
    L_0x0188:
        r0 = move-exception;
        throw r0;
    L_0x018a:
        r0 = move-exception;
        throw r0;	 Catch:{ ParseException -> 0x018c }
    L_0x018c:
        r0 = move-exception;
        throw r0;	 Catch:{ ParseException -> 0x018e }
    L_0x018e:
        r0 = move-exception;
        throw r0;	 Catch:{ ParseException -> 0x0190 }
    L_0x0190:
        r0 = move-exception;
        throw r0;
    L_0x0192:
        r1 = move-exception;
        r10 = r1;
        r1 = r2;
        r2 = r10;
        goto L_0x0180;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ViewSharedContactActivity.c(boolean):void");
    }

    static q c(ViewSharedContactActivity viewSharedContactActivity) {
        return viewSharedContactActivity.s;
    }

    static boolean a(ViewSharedContactActivity viewSharedContactActivity) {
        return viewSharedContactActivity.t;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void f() {
        /*
        r7 = this;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = 0;
        r2 = r0;
    L_0x0004:
        r0 = r7.o;
        r0 = r0.getChildCount();
        if (r2 >= r0) goto L_0x0101;
    L_0x000c:
        r0 = r7.o;
        r4 = r0.getChildAt(r2);
        r0 = 2131755444; // 0x7f1001b4 float:1.9141767E38 double:1.05322713E-314;
        r0 = r4.findViewById(r0);
        r0 = (android.widget.CheckBox) r0;
        r0 = r0.isChecked();	 Catch:{ d -> 0x0120 }
        if (r0 != 0) goto L_0x00fd;
    L_0x0021:
        r0 = new java.lang.StringBuilder;	 Catch:{ d -> 0x0120 }
        r0.<init>();	 Catch:{ d -> 0x0120 }
        r1 = z;	 Catch:{ d -> 0x0120 }
        r5 = 13;
        r1 = r1[r5];	 Catch:{ d -> 0x0120 }
        r0 = r0.append(r1);	 Catch:{ d -> 0x0120 }
        r0 = r0.append(r2);	 Catch:{ d -> 0x0120 }
        r0 = r0.toString();	 Catch:{ d -> 0x0120 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ d -> 0x0120 }
        r0 = r4.getTag();	 Catch:{ d -> 0x0120 }
        r0 = r0 instanceof m;	 Catch:{ d -> 0x0120 }
        if (r0 == 0) goto L_0x006b;
    L_0x0043:
        r0 = r4.getTag();
        r0 = (m) r0;
        r1 = r7.s;
        r1 = r1.g;
        r5 = r0.a;
        r1 = r1.get(r5);
        r1 = (java.util.List) r1;
        if (r1 == 0) goto L_0x0069;
    L_0x0057:
        r1.remove(r0);	 Catch:{ d -> 0x0122 }
        r1 = r1.isEmpty();	 Catch:{ d -> 0x0122 }
        if (r1 == 0) goto L_0x0069;
    L_0x0060:
        r1 = r7.s;	 Catch:{ d -> 0x0124 }
        r1 = r1.g;	 Catch:{ d -> 0x0124 }
        r0 = r0.a;	 Catch:{ d -> 0x0124 }
        r1.remove(r0);	 Catch:{ d -> 0x0124 }
    L_0x0069:
        if (r3 == 0) goto L_0x00fd;
    L_0x006b:
        r0 = r4.getTag();	 Catch:{ d -> 0x0126 }
        r0 = r0 instanceof c;	 Catch:{ d -> 0x0126 }
        if (r0 == 0) goto L_0x00cc;
    L_0x0073:
        r0 = r4.getTag();
        r0 = (c) r0;
        r1 = r7.s;	 Catch:{ d -> 0x0128 }
        r1 = r1.l;	 Catch:{ d -> 0x0128 }
        r1.remove(r0);	 Catch:{ d -> 0x0128 }
        r1 = r0.c;	 Catch:{ d -> 0x0128 }
        r5 = android.provider.ContactsContract.CommonDataKinds.Email.class;
        if (r1 != r5) goto L_0x00a6;
    L_0x0086:
        r1 = new java.lang.StringBuilder;	 Catch:{ d -> 0x0128 }
        r1.<init>();	 Catch:{ d -> 0x0128 }
        r5 = z;	 Catch:{ d -> 0x0128 }
        r6 = 10;
        r5 = r5[r6];	 Catch:{ d -> 0x0128 }
        r1 = r1.append(r5);	 Catch:{ d -> 0x0128 }
        r5 = r4.getTag();	 Catch:{ d -> 0x0128 }
        r1 = r1.append(r5);	 Catch:{ d -> 0x0128 }
        r1 = r1.toString();	 Catch:{ d -> 0x0128 }
        com.whatsapp.util.Log.e(r1);	 Catch:{ d -> 0x0128 }
        if (r3 == 0) goto L_0x00ca;
    L_0x00a6:
        r0 = r0.c;	 Catch:{ d -> 0x012a }
        r1 = android.provider.ContactsContract.CommonDataKinds.StructuredPostal.class;
        if (r0 != r1) goto L_0x00ca;
    L_0x00ac:
        r0 = new java.lang.StringBuilder;	 Catch:{ d -> 0x012c }
        r0.<init>();	 Catch:{ d -> 0x012c }
        r1 = z;	 Catch:{ d -> 0x012c }
        r5 = 11;
        r1 = r1[r5];	 Catch:{ d -> 0x012c }
        r0 = r0.append(r1);	 Catch:{ d -> 0x012c }
        r1 = r4.getTag();	 Catch:{ d -> 0x012c }
        r0 = r0.append(r1);	 Catch:{ d -> 0x012c }
        r0 = r0.toString();	 Catch:{ d -> 0x012c }
        com.whatsapp.util.Log.e(r0);	 Catch:{ d -> 0x012c }
    L_0x00ca:
        if (r3 == 0) goto L_0x00fd;
    L_0x00cc:
        r0 = r4.getTag();	 Catch:{ d -> 0x012e }
        r0 = r0 instanceof g;	 Catch:{ d -> 0x012e }
        if (r0 == 0) goto L_0x00fd;
    L_0x00d4:
        r0 = r7.s;	 Catch:{ d -> 0x0130 }
        r0 = r0.k;	 Catch:{ d -> 0x0130 }
        r1 = r4.getTag();	 Catch:{ d -> 0x0130 }
        r0.remove(r1);	 Catch:{ d -> 0x0130 }
        r0 = new java.lang.StringBuilder;	 Catch:{ d -> 0x0130 }
        r0.<init>();	 Catch:{ d -> 0x0130 }
        r1 = z;	 Catch:{ d -> 0x0130 }
        r5 = 12;
        r1 = r1[r5];	 Catch:{ d -> 0x0130 }
        r0 = r0.append(r1);	 Catch:{ d -> 0x0130 }
        r1 = r4.getTag();	 Catch:{ d -> 0x0130 }
        r0 = r0.append(r1);	 Catch:{ d -> 0x0130 }
        r0 = r0.toString();	 Catch:{ d -> 0x0130 }
        com.whatsapp.util.Log.e(r0);	 Catch:{ d -> 0x0130 }
    L_0x00fd:
        r0 = r2 + 1;
        if (r3 == 0) goto L_0x013d;
    L_0x0101:
        r0 = new p;
        r0.<init>();
        r1 = r7.s;	 Catch:{ d -> 0x0132 }
        r2 = 2;
        r0 = r0.a(r7, r1, r2);	 Catch:{ d -> 0x0132 }
        r1 = r7.x;	 Catch:{ d -> 0x0132 }
        r2 = r7.s;	 Catch:{ d -> 0x0132 }
        r2 = r2.j;	 Catch:{ d -> 0x0132 }
        r2 = r2.e;	 Catch:{ d -> 0x0132 }
        com.whatsapp.App.e(r1, r2, r0);	 Catch:{ d -> 0x0132 }
        r0 = -1;
        r7.setResult(r0);	 Catch:{ d -> 0x0132 }
        r7.finish();	 Catch:{ d -> 0x0132 }
    L_0x011f:
        return;
    L_0x0120:
        r0 = move-exception;
        throw r0;
    L_0x0122:
        r0 = move-exception;
        throw r0;	 Catch:{ d -> 0x0124 }
    L_0x0124:
        r0 = move-exception;
        throw r0;
    L_0x0126:
        r0 = move-exception;
        throw r0;
    L_0x0128:
        r0 = move-exception;
        throw r0;	 Catch:{ d -> 0x012a }
    L_0x012a:
        r0 = move-exception;
        throw r0;	 Catch:{ d -> 0x012c }
    L_0x012c:
        r0 = move-exception;
        throw r0;
    L_0x012e:
        r0 = move-exception;
        throw r0;	 Catch:{ d -> 0x0130 }
    L_0x0130:
        r0 = move-exception;
        throw r0;
    L_0x0132:
        r0 = move-exception;
        com.whatsapp.util.Log.a(r0);
        r0 = 2131231503; // 0x7f08030f float:1.8079089E38 double:1.052968269E-314;
        r7.a(r0);
        goto L_0x011f;
    L_0x013d:
        r2 = r0;
        goto L_0x0004;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ViewSharedContactActivity.f():void");
    }

    private void c() {
        boolean z = DialogToastActivity.f;
        if (this.s.l != null) {
            for (c cVar : this.s.l) {
                try {
                    View a;
                    if (cVar.c == Email.class) {
                        a = a(cVar.e, cVar.f == 0 ? cVar.b : a(Email.class, cVar.f), 2130837743, 2);
                        try {
                            b(a);
                            a.setClickable(true);
                            a.setOnClickListener(new als(this));
                            a.setTag(cVar);
                            this.o.addView(a);
                            if (!z) {
                                continue;
                                if (z) {
                                    return;
                                }
                            }
                        } catch (IllegalArgumentException e) {
                            throw e;
                        }
                    }
                    if (cVar.c == StructuredPostal.class) {
                        String a2;
                        i iVar = cVar.a;
                        String str = z[24];
                        if (iVar != null) {
                            a2 = iVar.a();
                        } else {
                            a2 = str;
                        }
                        try {
                            a = a(a2, cVar.f == 0 ? cVar.b : a(StructuredPostal.class, cVar.f), 2130837742, 3);
                            b(a);
                            a.setClickable(true);
                            a.setOnClickListener(new aik(this));
                            a.setTag(cVar);
                            this.o.addView(a);
                            continue;
                        } catch (IllegalArgumentException e2) {
                            throw e2;
                        }
                    }
                    continue;
                    if (z) {
                        return;
                    }
                } catch (IllegalArgumentException e22) {
                    throw e22;
                } catch (IllegalArgumentException e222) {
                    throw e222;
                }
            }
        }
    }

    static boolean b(ViewSharedContactActivity viewSharedContactActivity) {
        return viewSharedContactActivity.v;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.widget.LinearLayout a(java.lang.String r5, java.lang.String r6, int r7, int r8) {
        /*
        r4 = this;
        r3 = 1;
        r0 = z;
        r1 = 26;
        r0 = r0[r1];
        r0 = r4.getSystemService(r0);
        r0 = (android.view.LayoutInflater) r0;
        r1 = 2130903098; // 0x7f03003a float:1.7413004E38 double:1.0528060153E-314;
        r2 = 0;
        r0 = com.whatsapp.aam.a(r0, r1, r2, r3);
        r0 = (android.widget.LinearLayout) r0;
        r1 = 2131755442; // 0x7f1001b2 float:1.9141763E38 double:1.053227129E-314;
        r1 = r0.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        if (r8 <= r3) goto L_0x0029;
    L_0x0022:
        r1.setMaxLines(r8);	 Catch:{ IllegalArgumentException -> 0x0080 }
        r2 = 0;
        r1.setSingleLine(r2);	 Catch:{ IllegalArgumentException -> 0x0080 }
    L_0x0029:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0082 }
        r3 = 27;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0082 }
        r2 = r5.equalsIgnoreCase(r2);	 Catch:{ IllegalArgumentException -> 0x0082 }
        if (r2 != 0) goto L_0x0038;
    L_0x0035:
        r1.setText(r5);	 Catch:{ IllegalArgumentException -> 0x0082 }
    L_0x0038:
        r1 = 2131755443; // 0x7f1001b3 float:1.9141765E38 double:1.0532271297E-314;
        r1 = r0.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        if (r6 == 0) goto L_0x0056;
    L_0x0043:
        r2 = z;	 Catch:{ IllegalArgumentException -> 0x0084 }
        r3 = 28;
        r2 = r2[r3];	 Catch:{ IllegalArgumentException -> 0x0084 }
        r2 = r6.equalsIgnoreCase(r2);	 Catch:{ IllegalArgumentException -> 0x0084 }
        if (r2 != 0) goto L_0x0056;
    L_0x004f:
        r1.setText(r6);	 Catch:{ IllegalArgumentException -> 0x0086 }
        r2 = com.whatsapp.DialogToastActivity.f;	 Catch:{ IllegalArgumentException -> 0x0086 }
        if (r2 == 0) goto L_0x0064;
    L_0x0056:
        r2 = r4.getResources();	 Catch:{ IllegalArgumentException -> 0x0086 }
        r3 = 2131231562; // 0x7f08034a float:1.8079209E38 double:1.052968298E-314;
        r2 = r2.getString(r3);	 Catch:{ IllegalArgumentException -> 0x0086 }
        r1.setText(r2);	 Catch:{ IllegalArgumentException -> 0x0086 }
    L_0x0064:
        r1 = 2131755441; // 0x7f1001b1 float:1.9141761E38 double:1.0532271287E-314;
        r1 = r0.findViewById(r1);
        r1 = (android.widget.ImageView) r1;
        r1.setImageResource(r7);	 Catch:{ IllegalArgumentException -> 0x0088 }
        r1 = r4.v;	 Catch:{ IllegalArgumentException -> 0x0088 }
        if (r1 == 0) goto L_0x007f;
    L_0x0074:
        r1 = 2131755444; // 0x7f1001b4 float:1.9141767E38 double:1.05322713E-314;
        r1 = r0.findViewById(r1);	 Catch:{ IllegalArgumentException -> 0x0088 }
        r2 = 0;
        r1.setVisibility(r2);	 Catch:{ IllegalArgumentException -> 0x0088 }
    L_0x007f:
        return r0;
    L_0x0080:
        r0 = move-exception;
        throw r0;
    L_0x0082:
        r0 = move-exception;
        throw r0;
    L_0x0084:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalArgumentException -> 0x0086 }
    L_0x0086:
        r0 = move-exception;
        throw r0;
    L_0x0088:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ViewSharedContactActivity.a(java.lang.String, java.lang.String, int, int):android.widget.LinearLayout");
    }

    static void a(ViewSharedContactActivity viewSharedContactActivity, View view) {
        viewSharedContactActivity.a(view);
    }

    private q a(String str) {
        try {
            return q.k(str);
        } catch (Throwable e) {
            Log.c(e);
            return null;
        } catch (Throwable e2) {
            Log.a(e2);
            return null;
        } catch (Throwable e22) {
            Log.c(e22);
            return null;
        }
    }
}
