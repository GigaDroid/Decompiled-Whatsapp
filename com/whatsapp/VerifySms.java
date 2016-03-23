package com.whatsapp;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.CountDownTimer;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.telephony.ServiceState;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.registration.CodeInputField;
import com.whatsapp.util.Log;
import com.whatsapp.util.bq;
import com.whatsapp.util.cs;
import com.whatsapp.util.u;
import de.greenrobot.event.h;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class VerifySms extends VerifyNumber {
    private static int B;
    private static int I;
    private static boolean J;
    private static int O;
    private static String Q;
    private static final String[] U;
    private int A;
    private ImageButton C;
    boolean D;
    private h7 E;
    private final xm F;
    BroadcastReceiver G;
    private boolean H;
    private CodeInputField K;
    private String L;
    private boolean M;
    private String N;
    private int P;
    ProgressDialog R;
    private String S;
    private String T;
    private boolean v;
    private long w;
    private BroadcastReceiver x;
    private CountDownTimer y;
    private h7 z;

    class 1 extends BroadcastReceiver {
        private static final String[] z;
        final VerifySms a;
        private boolean b;

        static {
            String[] strArr = new String[26];
            String str = "U\u000bKa^Z\u001dT{\u0017Q\u000bZmQU\u000b]%JF\r\\aNF\u001c\u0016iTQ\u000bXlA\u0003\u001c\\k]J\u0018\\l";
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
                            i3 = 35;
                            break;
                        case at.g /*1*/:
                            i3 = 110;
                            break;
                        case at.i /*2*/:
                            i3 = 57;
                            break;
                        case at.o /*3*/:
                            i3 = 8;
                            break;
                        default:
                            i3 = 56;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "t\u0006X|Kb\u001eI&\u0012\u001cFb8\u0015\u001a3B;E\nC\u0011S\b\u000eWds\u000b^G";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        str = "U\u000bKa^Z\u001dT{\u0017W\u000bA|\u0015Q\u000bZmQU\u000bK'VL\u001af{UP1OmJJ\bPkYW\u0007Vf";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        i = 4;
                        strArr2 = strArr3;
                        str = "U\u000bKa^Z\u001dT{\u0017Q\u000bZmQU\u000b]%JF\r\\aNF\u001c\u0016x\\V\u001d\u0014d]M\tM`\u0017";
                        obj = 3;
                        break;
                    case at.o /*3*/:
                        strArr2[i] = str;
                        i = 5;
                        str = "U\u000bKa^Z\u001dT{\u0017G\u0007JxTB\u0017tmKP\u000f^mzL\n@(";
                        obj = 4;
                        strArr2 = strArr3;
                        break;
                    case at.p /*4*/:
                        strArr2[i] = str;
                        i = 6;
                        str = "U\u000bKa^Z\u001dT{\u0017W\u000bA|\u0015Q\u000bZmQU\u000bK'VLCZg\\F";
                        obj = 5;
                        strArr2 = strArr3;
                        break;
                    case at.m /*5*/:
                        strArr2[i] = str;
                        i = 7;
                        str = "U\u000bKa^Z\u001dT{\u0017G\u0007JxTB\u0017vzQD\u0007WiLJ\u0000^I\\G\u001c\\{K\u0003";
                        obj = 6;
                        strArr2 = strArr3;
                        break;
                    case Y.f /*6*/:
                        strArr2[i] = str;
                        str = "U\u000bKa^Z\u001dT{\u0017Q\u000bZmQU\u000b]%JF\r\\aNF\u001c\u0016l]P\u001aKgAF\n";
                        obj = 7;
                        i = 8;
                        strArr2 = strArr3;
                        break;
                    case aF.v /*7*/:
                        strArr2[i] = str;
                        i = 9;
                        strArr2 = strArr3;
                        str = "S\nL{";
                        obj = 8;
                        break;
                    case aF.u /*8*/:
                        strArr2[i] = str;
                        i = 10;
                        str = "U\u000bKa^Z\u001dT{\u0017D\u000bME]P\u001dXo]a\u0001]q\u0018";
                        obj = 9;
                        strArr2 = strArr3;
                        break;
                    case Y.l /*9*/:
                        strArr2[i] = str;
                        i = 11;
                        str = "U\u000bKa^Z\u001dT{";
                        obj = 10;
                        strArr2 = strArr3;
                        break;
                    case Y.t /*10*/:
                        strArr2[i] = str;
                        i = 12;
                        str = "U\u000bKa^Z\u001dT{\u0017Q\u000bZmQU\u000b]%JF\r\\aNF\u001c\u0016x\\V\u001d\u0014fMO\u0002";
                        obj = 11;
                        strArr2 = strArr3;
                        break;
                    case Y.j /*11*/:
                        strArr2[i] = str;
                        i = 13;
                        str = "U\u000bKa^Z\u001dT{\u0017D\u000bMXKF\u001b]gkV\fSm[WN";
                        obj = 12;
                        strArr2 = strArr3;
                        break;
                    case Y.p /*12*/:
                        strArr2[i] = str;
                        i = 14;
                        str = "U\u000bKa^Z\u001dT{\u0017Q\u000bZmQU\u000b]%JF\r\\aNF\u001c\u0016jMM\nUm\u0015M\u001bUd";
                        obj = 13;
                        strArr2 = strArr3;
                        break;
                    case Y.q /*13*/:
                        strArr2[i] = str;
                        i = 15;
                        str = "U\u000bKa^Z\u001dT{\u0017Q\u000bZmQU\u000b]%JF\r\\aNF\u001c\u0016e]P\u001dXo]\u000e\u0000LdT";
                        obj = 14;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_titleMarginEnd /*14*/:
                        strArr2[i] = str;
                        i = 16;
                        str = "U\u000bKa^Z\u001dT{\u0017Q\u000bZmQU\u000b]%JF\r\\aNF\u001c\u0016|][\u001a\u0016aVW\u000bW|";
                        obj = 15;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_titleMarginTop /*15*/:
                        strArr2[i] = str;
                        i = 17;
                        str = "U\u000bKa^Z\u001dT{\u0017D\u000bM[]Q\u0018Pk]`\u000bW|]Q/]lJF\u001dJ(";
                        obj = 16;
                        strArr2 = strArr3;
                        break;
                    case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                        strArr2[i] = str;
                        i = 18;
                        str = "\u0003\rVl]\u001e";
                        obj = 17;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_maxButtonHeight /*17*/:
                        strArr2[i] = str;
                        i = 19;
                        str = "P\u000bK~]QCJmVGCTaKN\u000fMkP\u000e\u000bTxLZ";
                        obj = 18;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_collapseIcon /*18*/:
                        strArr2[i] = str;
                        i = 20;
                        str = "U\u000bKa^Z\u001dT{\u0017F\u0003XaTe\u001cVe\u0018";
                        obj = 19;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_collapseContentDescription /*19*/:
                        strArr2[i] = str;
                        i = 21;
                        str = "U\u000bKa^Z\u001dT{\u0017W\u000bA|\u0017L\u001bM%WECTmUL\u001c@(";
                        obj = 20;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_navigationIcon /*20*/:
                        strArr2[i] = str;
                        i = 22;
                        str = "B\u001bMg";
                        obj = 21;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_navigationContentDescription /*21*/:
                        strArr2[i] = str;
                        i = 23;
                        str = "U\u000bKa^Z\u001dT{\u0017F\u0003XaTa\u0001]q\u0018";
                        obj = 22;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_logoDescription /*22*/:
                        strArr2[i] = str;
                        i = 24;
                        str = "U\u000bKa^Z\u001dT{\u0017W\u000bA|\u0015Q\u000bZmQU\u000bK'";
                        obj = 23;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_titleTextColor /*23*/:
                        strArr2[i] = str;
                        i = 25;
                        str = "U\u000bKa^Z\u001dT{\u0017D\u000bMGJJ\tPfYW\u0007WoyG\nKmKPN";
                        obj = 24;
                        strArr2 = strArr3;
                        break;
                    case arj.Toolbar_subtitleTextColor /*24*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "U\u000bKa^Z\u001dT{\u0017W\u000bA|\u0015Q\u000bZmQU\u000bK']Q\u001cVz\u0018";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onReceive(android.content.Context r13, android.content.Intent r14) {
            /*
            r12 = this;
            r4 = 0;
            r5 = -1;
            r11 = 2;
            r1 = 0;
            r10 = 1;
            r7 = com.whatsapp.DialogToastActivity.f;
            r0 = z;	 Catch:{ OutOfMemoryError -> 0x001d }
            r2 = 16;
            r0 = r0[r2];	 Catch:{ OutOfMemoryError -> 0x001d }
            com.whatsapp.util.Log.i(r0);	 Catch:{ OutOfMemoryError -> 0x001d }
            r0 = r12.b;	 Catch:{ OutOfMemoryError -> 0x001d }
            if (r0 == 0) goto L_0x001f;
        L_0x0014:
            r0 = z;	 Catch:{ OutOfMemoryError -> 0x001d }
            r1 = 0;
            r0 = r0[r1];	 Catch:{ OutOfMemoryError -> 0x001d }
            com.whatsapp.util.Log.i(r0);	 Catch:{ OutOfMemoryError -> 0x001d }
        L_0x001c:
            return;
        L_0x001d:
            r0 = move-exception;
            throw r0;
        L_0x001f:
            r0 = r12.a;
            r0 = r0.D;
            if (r0 != 0) goto L_0x020d;
        L_0x0025:
            r0 = r14.getExtras();
            if (r0 == 0) goto L_0x0202;
        L_0x002b:
            r2 = z;
            r3 = 9;
            r2 = r2[r3];
            r0 = r0.get(r2);
            r0 = (java.lang.Object[]) r0;
            r0 = (java.lang.Object[]) r0;
            if (r0 == 0) goto L_0x01f7;
        L_0x003b:
            r2 = new java.lang.StringBuilder;
            r2.<init>();
            r3 = z;
            r6 = 4;
            r3 = r3[r6];
            r2 = r2.append(r3);
            r3 = r0.length;
            r2 = r2.append(r3);
            r2 = r2.toString();
            com.whatsapp.util.Log.i(r2);
            r2 = r1;
        L_0x0056:
            r1 = r0.length;
            if (r2 >= r1) goto L_0x01f5;
        L_0x0059:
            r1 = r0[r2];	 Catch:{ OutOfMemoryError -> 0x021a }
            r1 = (byte[]) r1;	 Catch:{ OutOfMemoryError -> 0x021a }
            r1 = (byte[]) r1;	 Catch:{ OutOfMemoryError -> 0x021a }
            r1 = android.telephony.SmsMessage.createFromPdu(r1);	 Catch:{ OutOfMemoryError -> 0x021a }
            r6 = r1;
        L_0x0064:
            if (r6 == 0) goto L_0x0286;
        L_0x0066:
            r3 = r6.getMessageBody();	 Catch:{ NullPointerException -> 0x023c }
            r1 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x0281 }
            r1.<init>();	 Catch:{ NullPointerException -> 0x0281 }
            r8 = z;	 Catch:{ NullPointerException -> 0x0281 }
            r9 = 10;
            r8 = r8[r9];	 Catch:{ NullPointerException -> 0x0281 }
            r1 = r1.append(r8);	 Catch:{ NullPointerException -> 0x0281 }
            r1 = r1.append(r3);	 Catch:{ NullPointerException -> 0x0281 }
            r1 = r1.toString();	 Catch:{ NullPointerException -> 0x0281 }
            com.whatsapp.util.Log.i(r1);	 Catch:{ NullPointerException -> 0x0281 }
            r1 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x0281 }
            r1.<init>();	 Catch:{ NullPointerException -> 0x0281 }
            r8 = z;	 Catch:{ NullPointerException -> 0x0281 }
            r9 = 5;
            r8 = r8[r9];	 Catch:{ NullPointerException -> 0x0281 }
            r1 = r1.append(r8);	 Catch:{ NullPointerException -> 0x0281 }
            r8 = r6.getDisplayMessageBody();	 Catch:{ NullPointerException -> 0x0281 }
            r1 = r1.append(r8);	 Catch:{ NullPointerException -> 0x0281 }
            r1 = r1.toString();	 Catch:{ NullPointerException -> 0x0281 }
            com.whatsapp.util.Log.i(r1);	 Catch:{ NullPointerException -> 0x0281 }
            r1 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x0281 }
            r1.<init>();	 Catch:{ NullPointerException -> 0x0281 }
            r8 = z;	 Catch:{ NullPointerException -> 0x0281 }
            r9 = 7;
            r8 = r8[r9];	 Catch:{ NullPointerException -> 0x0281 }
            r1 = r1.append(r8);	 Catch:{ NullPointerException -> 0x0281 }
            r8 = r6.getDisplayOriginatingAddress();	 Catch:{ NullPointerException -> 0x0281 }
            r1 = r1.append(r8);	 Catch:{ NullPointerException -> 0x0281 }
            r1 = r1.toString();	 Catch:{ NullPointerException -> 0x0281 }
            com.whatsapp.util.Log.i(r1);	 Catch:{ NullPointerException -> 0x0281 }
            r1 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x0281 }
            r1.<init>();	 Catch:{ NullPointerException -> 0x0281 }
            r8 = z;	 Catch:{ NullPointerException -> 0x0281 }
            r9 = 23;
            r8 = r8[r9];	 Catch:{ NullPointerException -> 0x0281 }
            r1 = r1.append(r8);	 Catch:{ NullPointerException -> 0x0281 }
            r8 = r6.getEmailBody();	 Catch:{ NullPointerException -> 0x0281 }
            r1 = r1.append(r8);	 Catch:{ NullPointerException -> 0x0281 }
            r1 = r1.toString();	 Catch:{ NullPointerException -> 0x0281 }
            com.whatsapp.util.Log.i(r1);	 Catch:{ NullPointerException -> 0x0281 }
            r1 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x0281 }
            r1.<init>();	 Catch:{ NullPointerException -> 0x0281 }
            r8 = z;	 Catch:{ NullPointerException -> 0x0281 }
            r9 = 20;
            r8 = r8[r9];	 Catch:{ NullPointerException -> 0x0281 }
            r1 = r1.append(r8);	 Catch:{ NullPointerException -> 0x0281 }
            r8 = r6.getEmailFrom();	 Catch:{ NullPointerException -> 0x0281 }
            r1 = r1.append(r8);	 Catch:{ NullPointerException -> 0x0281 }
            r1 = r1.toString();	 Catch:{ NullPointerException -> 0x0281 }
            com.whatsapp.util.Log.i(r1);	 Catch:{ NullPointerException -> 0x0281 }
            r1 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x0281 }
            r1.<init>();	 Catch:{ NullPointerException -> 0x0281 }
            r8 = z;	 Catch:{ NullPointerException -> 0x0281 }
            r9 = 25;
            r8 = r8[r9];	 Catch:{ NullPointerException -> 0x0281 }
            r1 = r1.append(r8);	 Catch:{ NullPointerException -> 0x0281 }
            r8 = r6.getOriginatingAddress();	 Catch:{ NullPointerException -> 0x0281 }
            r1 = r1.append(r8);	 Catch:{ NullPointerException -> 0x0281 }
            r1 = r1.toString();	 Catch:{ NullPointerException -> 0x0281 }
            com.whatsapp.util.Log.i(r1);	 Catch:{ NullPointerException -> 0x0281 }
            r1 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x0281 }
            r1.<init>();	 Catch:{ NullPointerException -> 0x0281 }
            r8 = z;	 Catch:{ NullPointerException -> 0x0281 }
            r9 = 13;
            r8 = r8[r9];	 Catch:{ NullPointerException -> 0x0281 }
            r1 = r1.append(r8);	 Catch:{ NullPointerException -> 0x0281 }
            r8 = r6.getPseudoSubject();	 Catch:{ NullPointerException -> 0x0281 }
            r1 = r1.append(r8);	 Catch:{ NullPointerException -> 0x0281 }
            r1 = r1.toString();	 Catch:{ NullPointerException -> 0x0281 }
            com.whatsapp.util.Log.i(r1);	 Catch:{ NullPointerException -> 0x0281 }
            r1 = new java.lang.StringBuilder;	 Catch:{ NullPointerException -> 0x0281 }
            r1.<init>();	 Catch:{ NullPointerException -> 0x0281 }
            r8 = z;	 Catch:{ NullPointerException -> 0x0281 }
            r9 = 17;
            r8 = r8[r9];	 Catch:{ NullPointerException -> 0x0281 }
            r1 = r1.append(r8);	 Catch:{ NullPointerException -> 0x0281 }
            r8 = r6.getServiceCenterAddress();	 Catch:{ NullPointerException -> 0x0281 }
            r1 = r1.append(r8);	 Catch:{ NullPointerException -> 0x0281 }
            r1 = r1.toString();	 Catch:{ NullPointerException -> 0x0281 }
            com.whatsapp.util.Log.i(r1);	 Catch:{ NullPointerException -> 0x0281 }
        L_0x0154:
            if (r6 == 0) goto L_0x01e8;
        L_0x0156:
            if (r3 == 0) goto L_0x01e8;
        L_0x0158:
            r1 = new java.lang.StringBuilder;
            r1.<init>();
            r6 = z;
            r8 = 24;
            r6 = r6[r8];
            r1 = r1.append(r6);
            r1 = r1.append(r3);
            r1 = r1.toString();
            com.whatsapp.util.Log.i(r1);
            r1 = z;
            r1 = r1[r11];
            r1 = java.util.regex.Pattern.compile(r1);
            r1 = r1.matcher(r3);
            r3 = r1.find();
            if (r3 == 0) goto L_0x01de;
        L_0x0184:
            r3 = new java.lang.StringBuilder;
            r3.<init>();
            r6 = r1.group(r10);
            r3 = r3.append(r6);
            r1 = r1.group(r11);
            r1 = r3.append(r1);
            r3 = r1.toString();
            r1 = java.lang.Integer.parseInt(r3);	 Catch:{ Exception -> 0x0249 }
        L_0x01a1:
            if (r1 == r5) goto L_0x01c9;
        L_0x01a3:
            r1 = 1;
            r12.b = r1;	 Catch:{ OutOfMemoryError -> 0x0277 }
            r12.abortBroadcast();	 Catch:{ OutOfMemoryError -> 0x0277 }
            r1 = r12.a;	 Catch:{ OutOfMemoryError -> 0x0277 }
            com.whatsapp.VerifySms.b(r1, r3);	 Catch:{ OutOfMemoryError -> 0x0277 }
            r1 = new com.whatsapp.aze;	 Catch:{ OutOfMemoryError -> 0x0277 }
            r6 = r12.a;	 Catch:{ OutOfMemoryError -> 0x0277 }
            r1.<init>(r6);	 Catch:{ OutOfMemoryError -> 0x0277 }
            r6 = 2;
            r6 = new java.lang.String[r6];	 Catch:{ OutOfMemoryError -> 0x0277 }
            r8 = 0;
            r6[r8] = r3;	 Catch:{ OutOfMemoryError -> 0x0277 }
            r3 = 1;
            r8 = z;	 Catch:{ OutOfMemoryError -> 0x0277 }
            r9 = 22;
            r8 = r8[r9];	 Catch:{ OutOfMemoryError -> 0x0277 }
            r6[r3] = r8;	 Catch:{ OutOfMemoryError -> 0x0277 }
            com.whatsapp.util.bq.a(r1, r6);	 Catch:{ OutOfMemoryError -> 0x0277 }
            if (r7 == 0) goto L_0x01dc;
        L_0x01c9:
            r1 = z;	 Catch:{ OutOfMemoryError -> 0x0277 }
            r3 = 6;
            r1 = r1[r3];	 Catch:{ OutOfMemoryError -> 0x0277 }
            com.whatsapp.util.Log.w(r1);	 Catch:{ OutOfMemoryError -> 0x0277 }
            r1 = r12.a;	 Catch:{ OutOfMemoryError -> 0x0277 }
            r3 = z;	 Catch:{ OutOfMemoryError -> 0x0277 }
            r6 = 19;
            r3 = r3[r6];	 Catch:{ OutOfMemoryError -> 0x0277 }
            r1.d(r3);	 Catch:{ OutOfMemoryError -> 0x0277 }
        L_0x01dc:
            if (r7 == 0) goto L_0x01e6;
        L_0x01de:
            r1 = z;	 Catch:{ OutOfMemoryError -> 0x0279 }
            r3 = 3;
            r1 = r1[r3];	 Catch:{ OutOfMemoryError -> 0x0279 }
            com.whatsapp.util.Log.w(r1);	 Catch:{ OutOfMemoryError -> 0x0279 }
        L_0x01e6:
            if (r7 == 0) goto L_0x01f1;
        L_0x01e8:
            r1 = z;	 Catch:{ OutOfMemoryError -> 0x027b }
            r3 = 15;
            r1 = r1[r3];	 Catch:{ OutOfMemoryError -> 0x027b }
            com.whatsapp.util.Log.i(r1);	 Catch:{ OutOfMemoryError -> 0x027b }
        L_0x01f1:
            r1 = r2 + 1;
            if (r7 == 0) goto L_0x0283;
        L_0x01f5:
            if (r7 == 0) goto L_0x0200;
        L_0x01f7:
            r0 = z;	 Catch:{ OutOfMemoryError -> 0x027d }
            r1 = 12;
            r0 = r0[r1];	 Catch:{ OutOfMemoryError -> 0x027d }
            com.whatsapp.util.Log.i(r0);	 Catch:{ OutOfMemoryError -> 0x027d }
        L_0x0200:
            if (r7 == 0) goto L_0x020b;
        L_0x0202:
            r0 = z;	 Catch:{ OutOfMemoryError -> 0x027f }
            r1 = 14;
            r0 = r0[r1];	 Catch:{ OutOfMemoryError -> 0x027f }
            com.whatsapp.util.Log.i(r0);	 Catch:{ OutOfMemoryError -> 0x027f }
        L_0x020b:
            if (r7 == 0) goto L_0x001c;
        L_0x020d:
            r0 = z;	 Catch:{ OutOfMemoryError -> 0x0218 }
            r1 = 8;
            r0 = r0[r1];	 Catch:{ OutOfMemoryError -> 0x0218 }
            com.whatsapp.util.Log.i(r0);	 Catch:{ OutOfMemoryError -> 0x0218 }
            goto L_0x001c;
        L_0x0218:
            r0 = move-exception;
            throw r0;
        L_0x021a:
            r1 = move-exception;
            r3 = new java.lang.StringBuilder;
            r3.<init>();
            r6 = z;
            r8 = 21;
            r6 = r6[r8];
            r3 = r3.append(r6);
            r1 = r1.toString();
            r1 = r3.append(r1);
            r1 = r1.toString();
            com.whatsapp.util.Log.e(r1);
            r6 = r4;
            goto L_0x0064;
        L_0x023c:
            r1 = move-exception;
            r3 = r4;
        L_0x023e:
            r8 = z;
            r9 = 11;
            r8 = r8[r9];
            com.whatsapp.util.Log.b(r8, r1);
            goto L_0x0154;
        L_0x0249:
            r1 = move-exception;
            r6 = new java.lang.StringBuilder;
            r6.<init>();
            r8 = z;
            r8 = r8[r10];
            r6 = r6.append(r8);
            r1 = r1.toString();
            r1 = r6.append(r1);
            r6 = z;
            r8 = 18;
            r6 = r6[r8];
            r1 = r1.append(r6);
            r1 = r1.append(r3);
            r1 = r1.toString();
            com.whatsapp.util.Log.w(r1);
            r1 = r5;
            goto L_0x01a1;
        L_0x0277:
            r0 = move-exception;
            throw r0;
        L_0x0279:
            r0 = move-exception;
            throw r0;
        L_0x027b:
            r0 = move-exception;
            throw r0;
        L_0x027d:
            r0 = move-exception;
            throw r0;
        L_0x027f:
            r0 = move-exception;
            throw r0;
        L_0x0281:
            r1 = move-exception;
            goto L_0x023e;
        L_0x0283:
            r2 = r1;
            goto L_0x0056;
        L_0x0286:
            r3 = r4;
            goto L_0x0154;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VerifySms.1.onReceive(android.content.Context, android.content.Intent):void");
        }

        1(VerifySms verifySms) {
            this.a = verifySms;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
        r7 = this;
        r6 = 1;
        r1 = 0;
        r0 = com.whatsapp.DialogToastActivity.f;
        super.onResume();
        r1 = r7.getPreferences(r1);
        r2 = U;	 Catch:{ ActivityNotFoundException -> 0x0048 }
        r3 = 83;
        r2 = r2[r3];	 Catch:{ ActivityNotFoundException -> 0x0048 }
        r3 = 0;
        r1 = r1.getInt(r2, r3);	 Catch:{ ActivityNotFoundException -> 0x0048 }
        O = r1;	 Catch:{ ActivityNotFoundException -> 0x0048 }
        r1 = com.whatsapp.App.d(r7);	 Catch:{ ActivityNotFoundException -> 0x0048 }
        r1 = c(r1);	 Catch:{ ActivityNotFoundException -> 0x0048 }
        Q = r1;	 Catch:{ ActivityNotFoundException -> 0x0048 }
        r1 = com.whatsapp.App.g(r7);	 Catch:{ ActivityNotFoundException -> 0x0048 }
        I = r1;	 Catch:{ ActivityNotFoundException -> 0x0048 }
        r1 = com.whatsapp.App.k(r7);	 Catch:{ ActivityNotFoundException -> 0x0048 }
        B = r1;	 Catch:{ ActivityNotFoundException -> 0x0048 }
        r1 = B;	 Catch:{ ActivityNotFoundException -> 0x0048 }
        com.whatsapp.registration.CodeInputField.setRegistrationVoiceCodeLength(r1);	 Catch:{ ActivityNotFoundException -> 0x0048 }
        r1 = r7.N;	 Catch:{ ActivityNotFoundException -> 0x0048 }
        if (r1 == 0) goto L_0x003b;
    L_0x0037:
        r1 = r7.L;	 Catch:{ ActivityNotFoundException -> 0x004a }
        if (r1 != 0) goto L_0x004c;
    L_0x003b:
        r0 = U;	 Catch:{ ActivityNotFoundException -> 0x004a }
        r1 = 82;
        r0 = r0[r1];	 Catch:{ ActivityNotFoundException -> 0x004a }
        com.whatsapp.util.Log.w(r0);	 Catch:{ ActivityNotFoundException -> 0x004a }
        r7.w();	 Catch:{ ActivityNotFoundException -> 0x004a }
    L_0x0047:
        return;
    L_0x0048:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x004a }
    L_0x004a:
        r0 = move-exception;
        throw r0;
    L_0x004c:
        r1 = 4;
        com.whatsapp.App.d(r7, r1);	 Catch:{ ActivityNotFoundException -> 0x00f1 }
        r1 = r7.c();	 Catch:{ ActivityNotFoundException -> 0x00f1 }
        if (r1 != 0) goto L_0x0062;
    L_0x0056:
        r1 = 2131755940; // 0x7f1003a4 float:1.9142773E38 double:1.0532273753E-314;
        r1 = r7.findViewById(r1);	 Catch:{ ActivityNotFoundException -> 0x00f1 }
        r2 = 8;
        r1.setVisibility(r2);	 Catch:{ ActivityNotFoundException -> 0x00f1 }
    L_0x0062:
        r1 = new java.lang.StringBuilder;	 Catch:{ ActivityNotFoundException -> 0x0114 }
        r1.<init>();	 Catch:{ ActivityNotFoundException -> 0x0114 }
        r2 = U;	 Catch:{ ActivityNotFoundException -> 0x0114 }
        r3 = 84;
        r2 = r2[r3];	 Catch:{ ActivityNotFoundException -> 0x0114 }
        r1 = r1.append(r2);	 Catch:{ ActivityNotFoundException -> 0x0114 }
        r2 = O;	 Catch:{ ActivityNotFoundException -> 0x0114 }
        r1 = r1.append(r2);	 Catch:{ ActivityNotFoundException -> 0x0114 }
        r1 = r1.toString();	 Catch:{ ActivityNotFoundException -> 0x0114 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ ActivityNotFoundException -> 0x0114 }
        r1 = O;	 Catch:{ ActivityNotFoundException -> 0x0114 }
        switch(r1) {
            case 4: goto L_0x00ff;
            case 5: goto L_0x0083;
            case 6: goto L_0x00f9;
            case 7: goto L_0x00f3;
            case 8: goto L_0x0106;
            case 9: goto L_0x0083;
            case 10: goto L_0x0083;
            case 11: goto L_0x0083;
            case 12: goto L_0x010d;
            default: goto L_0x0083;
        };
    L_0x0083:
        r2 = r7.o();
        r4 = java.lang.System.currentTimeMillis();
        r2 = r2 - r4;
        r4 = 0;
        r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r1 <= 0) goto L_0x0099;
    L_0x0092:
        r1 = r7.E;	 Catch:{ ActivityNotFoundException -> 0x011e }
        r1.a(r2);	 Catch:{ ActivityNotFoundException -> 0x011e }
        if (r0 == 0) goto L_0x00aa;
    L_0x0099:
        r7.y();	 Catch:{ ActivityNotFoundException -> 0x0120 }
        r0 = r7.H;	 Catch:{ ActivityNotFoundException -> 0x0120 }
        if (r0 != 0) goto L_0x00aa;
    L_0x00a0:
        r0 = r7.c();	 Catch:{ ActivityNotFoundException -> 0x0122 }
        if (r0 == 0) goto L_0x00aa;
    L_0x00a6:
        r0 = 0;
        r7.d(r0);	 Catch:{ ActivityNotFoundException -> 0x0122 }
    L_0x00aa:
        r7.F();	 Catch:{ ActivityNotFoundException -> 0x0124 }
        r0 = r7.y;	 Catch:{ ActivityNotFoundException -> 0x0124 }
        if (r0 != 0) goto L_0x00bd;
    L_0x00b1:
        r0 = r7.z();	 Catch:{ ActivityNotFoundException -> 0x0124 }
        r2 = java.lang.System.currentTimeMillis();	 Catch:{ ActivityNotFoundException -> 0x0124 }
        r0 = r0 - r2;
        r7.c(r0);	 Catch:{ ActivityNotFoundException -> 0x0124 }
    L_0x00bd:
        r0 = android.support.v4.app.NotificationManagerCompat.from(r7);	 Catch:{ ActivityNotFoundException -> 0x0126 }
        r1 = 1;
        r0.cancel(r1);	 Catch:{ ActivityNotFoundException -> 0x0126 }
        r0 = r7.S;	 Catch:{ ActivityNotFoundException -> 0x0126 }
        if (r0 == 0) goto L_0x00ed;
    L_0x00c9:
        r0 = new java.lang.StringBuilder;	 Catch:{ ActivityNotFoundException -> 0x0126 }
        r0.<init>();	 Catch:{ ActivityNotFoundException -> 0x0126 }
        r1 = U;	 Catch:{ ActivityNotFoundException -> 0x0126 }
        r2 = 85;
        r1 = r1[r2];	 Catch:{ ActivityNotFoundException -> 0x0126 }
        r0 = r0.append(r1);	 Catch:{ ActivityNotFoundException -> 0x0126 }
        r1 = r7.S;	 Catch:{ ActivityNotFoundException -> 0x0126 }
        r0 = r0.append(r1);	 Catch:{ ActivityNotFoundException -> 0x0126 }
        r0 = r0.toString();	 Catch:{ ActivityNotFoundException -> 0x0126 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ ActivityNotFoundException -> 0x0126 }
        r0 = r7.S;	 Catch:{ ActivityNotFoundException -> 0x0126 }
        r7.k(r0);	 Catch:{ ActivityNotFoundException -> 0x0126 }
        r0 = 0;
        r7.S = r0;	 Catch:{ ActivityNotFoundException -> 0x0126 }
    L_0x00ed:
        r7.H = r6;
        goto L_0x0047;
    L_0x00f1:
        r0 = move-exception;
        throw r0;
    L_0x00f3:
        r1 = 7;
        r7.showDialog(r1);	 Catch:{ ActivityNotFoundException -> 0x0116 }
        if (r0 == 0) goto L_0x00bd;
    L_0x00f9:
        r1 = 4;
        r7.showDialog(r1);	 Catch:{ ActivityNotFoundException -> 0x0118 }
        if (r0 == 0) goto L_0x00bd;
    L_0x00ff:
        r1 = 21;
        r7.showDialog(r1);	 Catch:{ ActivityNotFoundException -> 0x011a }
        if (r0 == 0) goto L_0x00bd;
    L_0x0106:
        r1 = 23;
        r7.showDialog(r1);	 Catch:{ ActivityNotFoundException -> 0x011c }
        if (r0 == 0) goto L_0x00bd;
    L_0x010d:
        r7.s();	 Catch:{ ActivityNotFoundException -> 0x011c }
        if (r0 == 0) goto L_0x00bd;
    L_0x0112:
        goto L_0x0083;
    L_0x0114:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0116 }
    L_0x0116:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0118 }
    L_0x0118:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x011a }
    L_0x011a:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x011c }
    L_0x011c:
        r0 = move-exception;
        throw r0;
    L_0x011e:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0120 }
    L_0x0120:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0122 }
    L_0x0122:
        r0 = move-exception;
        throw r0;
    L_0x0124:
        r0 = move-exception;
        throw r0;
    L_0x0126:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VerifySms.onResume():void");
    }

    private String v() {
        SharedPreferences preferences = getPreferences(0);
        String string = preferences.getString(U[71], null);
        String string2 = preferences.getString(U[72], null);
        try {
            if (this.N.equals(string) && this.L.equals(string2)) {
                return preferences.getString(U[73], null);
            }
            return null;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    static void i(VerifySms verifySms) {
        verifySms.E();
    }

    public void l(String str) {
        try {
            if (e(str)) {
                bq.a(new _k(this), new String[]{str});
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            try {
                if (!isFinishing()) {
                    showDialog(33);
                }
            } catch (ActivityNotFoundException e) {
                throw e;
            }
        } catch (ActivityNotFoundException e2) {
            throw e2;
        } catch (ActivityNotFoundException e22) {
            throw e22;
        }
    }

    public VerifySms() {
        this.w = 0;
        this.y = null;
        this.D = false;
        this.F = new xm(this, Looper.getMainLooper());
        this.G = new 1(this);
        this.A = -2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(boolean r6) {
        /*
        r5 = this;
        r0 = 1;
        r1 = 0;
        r2 = com.whatsapp.DialogToastActivity.f;
        r3 = r5.N;
        r4 = r5.L;
        com.whatsapp.App.a(r5, r3, r4);
        O = r1;
        r5.G();
        r3 = r5.q;
        if (r3 == 0) goto L_0x0083;
    L_0x0014:
        r3 = U;
        r4 = 74;
        r3 = r3[r4];
        com.whatsapp.util.Log.i(r3);
        r3 = com.whatsapp.App.n(r5);
        r4 = com.whatsapp.App.A(r5);	 Catch:{ ActivityNotFoundException -> 0x0038 }
        r3.jabber_id = r4;	 Catch:{ ActivityNotFoundException -> 0x0038 }
        r4 = r3.jabber_id;	 Catch:{ ActivityNotFoundException -> 0x0038 }
        if (r4 == 0) goto L_0x003a;
    L_0x002b:
        com.whatsapp.util.Log.b(r0);	 Catch:{ ActivityNotFoundException -> 0x003c }
        r0 = com.whatsapp.App.b(r3);	 Catch:{ ActivityNotFoundException -> 0x003c }
        if (r0 != 0) goto L_0x003e;
    L_0x0034:
        r5.finish();	 Catch:{ ActivityNotFoundException -> 0x003c }
    L_0x0037:
        return;
    L_0x0038:
        r0 = move-exception;
        throw r0;
    L_0x003a:
        r0 = r1;
        goto L_0x002b;
    L_0x003c:
        r0 = move-exception;
        throw r0;
    L_0x003e:
        com.whatsapp.App.ay = r3;
        r0 = com.whatsapp.App.aK;
        r0 = r0.E();
        if (r0 != 0) goto L_0x005e;
    L_0x0048:
        r1 = com.whatsapp.App.aK;	 Catch:{ ActivityNotFoundException -> 0x00ca }
        r1 = r1.c();	 Catch:{ ActivityNotFoundException -> 0x00ca }
        if (r1 == 0) goto L_0x005e;
    L_0x0050:
        r1 = U;	 Catch:{ ActivityNotFoundException -> 0x00ca }
        r3 = 76;
        r1 = r1[r3];	 Catch:{ ActivityNotFoundException -> 0x00ca }
        com.whatsapp.util.Log.i(r1);	 Catch:{ ActivityNotFoundException -> 0x00ca }
        r1 = com.whatsapp.App.aK;	 Catch:{ ActivityNotFoundException -> 0x00ca }
        r1.m();	 Catch:{ ActivityNotFoundException -> 0x00ca }
    L_0x005e:
        r1 = r5.getApplication();	 Catch:{ ActivityNotFoundException -> 0x00cc }
        com.whatsapp.App.e(r1);	 Catch:{ ActivityNotFoundException -> 0x00cc }
        com.whatsapp.App.a3();	 Catch:{ ActivityNotFoundException -> 0x00cc }
        com.whatsapp.messaging.MessageService.b(r5);	 Catch:{ ActivityNotFoundException -> 0x00cc }
        if (r0 != 0) goto L_0x0070;
    L_0x006d:
        com.whatsapp.App.x();	 Catch:{ ActivityNotFoundException -> 0x00cc }
    L_0x0070:
        r0 = 3;
        com.whatsapp.App.d(r5, r0);	 Catch:{ ActivityNotFoundException -> 0x00ce }
        r0 = U;	 Catch:{ ActivityNotFoundException -> 0x00ce }
        r1 = 75;
        r0 = r0[r1];	 Catch:{ ActivityNotFoundException -> 0x00ce }
        com.whatsapp.util.Log.i(r0);	 Catch:{ ActivityNotFoundException -> 0x00ce }
        r0 = 0;
        com.whatsapp.ChangeNumber.a(r5, r0);	 Catch:{ ActivityNotFoundException -> 0x00ce }
        if (r2 == 0) goto L_0x008a;
    L_0x0083:
        r0 = com.whatsapp.App.p;	 Catch:{ ActivityNotFoundException -> 0x00ce }
        r0 = r0.aS;	 Catch:{ ActivityNotFoundException -> 0x00ce }
        r0.c(r5);	 Catch:{ ActivityNotFoundException -> 0x00ce }
    L_0x008a:
        r0 = r5.F;	 Catch:{ ActivityNotFoundException -> 0x00d0 }
        r1 = 1;
        r0.removeMessages(r1);	 Catch:{ ActivityNotFoundException -> 0x00d0 }
        r5.E();	 Catch:{ ActivityNotFoundException -> 0x00d0 }
        if (r6 == 0) goto L_0x009e;
    L_0x0095:
        r0 = r5.t;	 Catch:{ ActivityNotFoundException -> 0x00d2 }
        if (r0 == 0) goto L_0x009e;
    L_0x0099:
        r5.b();	 Catch:{ ActivityNotFoundException -> 0x00d4 }
        if (r2 == 0) goto L_0x00c2;
    L_0x009e:
        r0 = r5.q;	 Catch:{ ActivityNotFoundException -> 0x00d4 }
        if (r0 == 0) goto L_0x00b4;
    L_0x00a2:
        com.whatsapp.App.aY();
        com.whatsapp.ve.w();
        r0 = new android.content.Intent;
        r1 = com.whatsapp.Main.class;
        r0.<init>(r5, r1);
        r5.startActivity(r0);	 Catch:{ ActivityNotFoundException -> 0x00d6 }
        if (r2 == 0) goto L_0x00c2;
    L_0x00b4:
        r0 = 2;
        com.whatsapp.App.d(r5, r0);	 Catch:{ ActivityNotFoundException -> 0x00d6 }
        r0 = new android.content.Intent;	 Catch:{ ActivityNotFoundException -> 0x00d6 }
        r1 = com.whatsapp.RegisterName.class;
        r0.<init>(r5, r1);	 Catch:{ ActivityNotFoundException -> 0x00d6 }
        r5.startActivity(r0);	 Catch:{ ActivityNotFoundException -> 0x00d6 }
    L_0x00c2:
        com.whatsapp.VerifyNumber.d();
        r5.finish();
        goto L_0x0037;
    L_0x00ca:
        r0 = move-exception;
        throw r0;
    L_0x00cc:
        r0 = move-exception;
        throw r0;
    L_0x00ce:
        r0 = move-exception;
        throw r0;
    L_0x00d0:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00d2 }
    L_0x00d2:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x00d4 }
    L_0x00d4:
        r0 = move-exception;
        throw r0;
    L_0x00d6:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VerifySms.c(boolean):void");
    }

    private void E() {
        Editor edit = getPreferences(0).edit();
        try {
            edit.remove(U[26]);
            edit.remove(U[27]);
            edit.remove(U[28]);
            if (!edit.commit()) {
                Log.w(U[25]);
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    public void onBackPressed() {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected android.app.Dialog onCreateDialog(int r9) {
        /*
        r8 = this;
        r2 = 2131231750; // 0x7f080406 float:1.807959E38 double:1.052968391E-314;
        r7 = 2131230884; // 0x7f0800a4 float:1.8077833E38 double:1.052967963E-314;
        r5 = 2131231580; // 0x7f08035c float:1.8079245E38 double:1.052968307E-314;
        r4 = 1;
        r6 = 0;
        r1 = com.whatsapp.DialogToastActivity.f;
        switch(r9) {
            case 4: goto L_0x008b;
            case 7: goto L_0x0015;
            case 9: goto L_0x00ad;
            case 21: goto L_0x003b;
            case 23: goto L_0x007e;
            case 24: goto L_0x00c6;
            case 25: goto L_0x00df;
            case 26: goto L_0x0111;
            case 27: goto L_0x0111;
            case 28: goto L_0x0111;
            case 29: goto L_0x015b;
            case 30: goto L_0x01cb;
            case 31: goto L_0x0230;
            case 32: goto L_0x0295;
            case 33: goto L_0x02ee;
            case 34: goto L_0x0064;
            case 35: goto L_0x01f7;
            case 36: goto L_0x025c;
            case 37: goto L_0x0331;
            case 38: goto L_0x0139;
            case 39: goto L_0x00f8;
            case 40: goto L_0x01af;
            case 41: goto L_0x0193;
            case 42: goto L_0x0177;
            case 43: goto L_0x0396;
            case 500: goto L_0x0317;
            default: goto L_0x0010;
        };
    L_0x0010:
        r0 = super.onCreateDialog(r9);
    L_0x0014:
        return r0;
    L_0x0015:
        r0 = new android.support.v7.app.AlertDialog$Builder;	 Catch:{ ActivityNotFoundException -> 0x0039 }
        r0.<init>(r8);	 Catch:{ ActivityNotFoundException -> 0x0039 }
        r1 = 2131230798; // 0x7f08004e float:1.8077659E38 double:1.0529679207E-314;
        r0 = r0.setTitle(r1);	 Catch:{ ActivityNotFoundException -> 0x0039 }
        r1 = 2131231785; // 0x7f080429 float:1.807966E38 double:1.0529684083E-314;
        r0 = r0.setMessage(r1);	 Catch:{ ActivityNotFoundException -> 0x0039 }
        r1 = 2131231580; // 0x7f08035c float:1.8079245E38 double:1.052968307E-314;
        r2 = new com.whatsapp.axd;	 Catch:{ ActivityNotFoundException -> 0x0039 }
        r2.<init>(r8);	 Catch:{ ActivityNotFoundException -> 0x0039 }
        r0 = r0.setPositiveButton(r1, r2);	 Catch:{ ActivityNotFoundException -> 0x0039 }
        r0 = r0.create();	 Catch:{ ActivityNotFoundException -> 0x0039 }
        goto L_0x0014;
    L_0x0039:
        r0 = move-exception;
        throw r0;
    L_0x003b:
        r0 = new android.support.v7.app.AlertDialog$Builder;
        r0.<init>(r8);
        r1 = 2131231746; // 0x7f080402 float:1.8079582E38 double:1.052968389E-314;
        r2 = new java.lang.Object[r4];
        r3 = 2131230939; // 0x7f0800db float:1.8077945E38 double:1.0529679903E-314;
        r3 = r8.getString(r3);
        r2[r6] = r3;
        r1 = r8.getString(r1, r2);
        r0 = r0.setMessage(r1);
        r1 = new com.whatsapp.zh;
        r1.<init>(r8);
        r0 = r0.setPositiveButton(r5, r1);
        r0 = r0.create();
        goto L_0x0014;
    L_0x0064:
        r0 = new android.support.v7.app.AlertDialog$Builder;
        r0.<init>(r8);
        r1 = 2131231798; // 0x7f080436 float:1.8079687E38 double:1.0529684147E-314;
        r0 = r0.setMessage(r1);
        r1 = new com.whatsapp.ur;
        r1.<init>(r8);
        r0 = r0.setPositiveButton(r5, r1);
        r0 = r0.create();
        goto L_0x0014;
    L_0x007e:
        O = r6;
        r8.G();
        com.whatsapp.App.d(r8, r4);
        r0 = com.whatsapp.aro.a(r8);
        goto L_0x0014;
    L_0x008b:
        r0 = new android.support.v7.app.AlertDialog$Builder;
        r0.<init>(r8);
        r1 = 2131230798; // 0x7f08004e float:1.8077659E38 double:1.0529679207E-314;
        r0 = r0.setTitle(r1);
        r1 = 2131232329; // 0x7f080649 float:1.8080764E38 double:1.052968677E-314;
        r0 = r0.setMessage(r1);
        r1 = new com.whatsapp.alk;
        r1.<init>(r8);
        r0 = r0.setPositiveButton(r5, r1);
        r0 = r0.create();
        goto L_0x0014;
    L_0x00ad:
        r0 = new android.app.ProgressDialog;
        r0.<init>(r8);
        r1 = 2131231749; // 0x7f080405 float:1.8079588E38 double:1.0529683905E-314;
        r1 = r8.getString(r1);
        r0.setMessage(r1);
        r0.setIndeterminate(r4);
        r0.setCancelable(r6);
        r8.R = r0;
        goto L_0x0014;
    L_0x00c6:
        r0 = new android.app.ProgressDialog;
        r0.<init>(r8);
        r1 = 2131231812; // 0x7f080444 float:1.8079716E38 double:1.0529684216E-314;
        r1 = r8.getString(r1);
        r0.setMessage(r1);
        r0.setIndeterminate(r4);
        r0.setCancelable(r6);
        r8.R = r0;
        goto L_0x0014;
    L_0x00df:
        r0 = new android.app.ProgressDialog;
        r0.<init>(r8);
        r1 = 2131231811; // 0x7f080443 float:1.8079714E38 double:1.052968421E-314;
        r1 = r8.getString(r1);
        r0.setMessage(r1);
        r0.setIndeterminate(r4);
        r0.setCancelable(r6);
        r8.R = r0;
        goto L_0x0014;
    L_0x00f8:
        r0 = new android.app.ProgressDialog;
        r0.<init>(r8);
        r1 = 2131231786; // 0x7f08042a float:1.8079663E38 double:1.052968409E-314;
        r1 = r8.getString(r1);
        r0.setMessage(r1);
        r0.setIndeterminate(r4);
        r0.setCancelable(r6);
        r8.R = r0;
        goto L_0x0014;
    L_0x0111:
        r0 = new android.support.v7.app.AlertDialog$Builder;
        r0.<init>(r8);
        r1 = 2131231794; // 0x7f080432 float:1.807968E38 double:1.0529684127E-314;
        r0 = r0.setMessage(r1);
        r0 = r0.setCancelable(r6);
        r1 = new com.whatsapp.a9j;
        r1.<init>(r8, r9);
        r0 = r0.setPositiveButton(r2, r1);
        r1 = new com.whatsapp.nw;
        r1.<init>(r8, r9);
        r0 = r0.setNegativeButton(r7, r1);
        r0 = r0.create();
        goto L_0x0014;
    L_0x0139:
        r0 = new android.support.v7.app.AlertDialog$Builder;
        r0.<init>(r8);
        r1 = 2131231741; // 0x7f0803fd float:1.8079572E38 double:1.0529683866E-314;
        r0 = r0.setMessage(r1);
        r0 = r0.setCancelable(r6);
        r1 = 2131231582; // 0x7f08035e float:1.807925E38 double:1.052968308E-314;
        r2 = new com.whatsapp.xh;
        r2.<init>(r8, r9);
        r0 = r0.setNeutralButton(r1, r2);
        r0 = r0.create();
        goto L_0x0014;
    L_0x015b:
        r0 = new android.support.v7.app.AlertDialog$Builder;
        r0.<init>(r8);
        r1 = r8.H();
        r0 = r0.setMessage(r1);
        r1 = new com.whatsapp.amw;
        r1.<init>(r8, r9);
        r0 = r0.setPositiveButton(r5, r1);
        r0 = r0.create();
        goto L_0x0014;
    L_0x0177:
        r0 = new android.support.v7.app.AlertDialog$Builder;
        r0.<init>(r8);
        r1 = r8.D();
        r0 = r0.setMessage(r1);
        r1 = new com.whatsapp.da;
        r1.<init>(r8, r9);
        r0 = r0.setPositiveButton(r5, r1);
        r0 = r0.create();
        goto L_0x0014;
    L_0x0193:
        r0 = new android.support.v7.app.AlertDialog$Builder;
        r0.<init>(r8);
        r1 = r8.x();
        r0 = r0.setMessage(r1);
        r1 = new com.whatsapp.vo;
        r1.<init>(r8, r9);
        r0 = r0.setPositiveButton(r5, r1);
        r0 = r0.create();
        goto L_0x0014;
    L_0x01af:
        r0 = new android.support.v7.app.AlertDialog$Builder;
        r0.<init>(r8);
        r1 = r8.a();
        r0 = r0.setMessage(r1);
        r1 = new com.whatsapp.hb;
        r1.<init>(r8, r9);
        r0 = r0.setPositiveButton(r5, r1);
        r0 = r0.create();
        goto L_0x0014;
    L_0x01cb:
        r0 = new android.support.v7.app.AlertDialog$Builder;
        r0.<init>(r8);
        r1 = 2131231775; // 0x7f08041f float:1.807964E38 double:1.0529684034E-314;
        r1 = r8.getString(r1);
        r0 = r0.setMessage(r1);
        r0 = r0.setCancelable(r6);
        r1 = new com.whatsapp.r0;
        r1.<init>(r8, r9);
        r0 = r0.setPositiveButton(r2, r1);
        r1 = new com.whatsapp.a55;
        r1.<init>(r8, r9);
        r0 = r0.setNegativeButton(r7, r1);
        r0 = r0.create();
        goto L_0x0014;
    L_0x01f7:
        r0 = new android.support.v7.app.AlertDialog$Builder;
        r0.<init>(r8);
        r1 = 2131231810; // 0x7f080442 float:1.8079712E38 double:1.0529684206E-314;
        r2 = new java.lang.Object[r4];
        r4 = r8.w;
        r3 = com.whatsapp.util.cs.f(r8, r4);
        r2[r6] = r3;
        r1 = r8.getString(r1, r2);
        r0 = r0.setMessage(r1);
        r0 = r0.setCancelable(r6);
        r1 = 2131231756; // 0x7f08040c float:1.8079602E38 double:1.052968394E-314;
        r2 = new com.whatsapp.z;
        r2.<init>(r8, r9);
        r0 = r0.setPositiveButton(r1, r2);
        r1 = new com.whatsapp.amx;
        r1.<init>(r8, r9);
        r0 = r0.setNegativeButton(r7, r1);
        r0 = r0.create();
        goto L_0x0014;
    L_0x0230:
        r0 = new android.support.v7.app.AlertDialog$Builder;
        r0.<init>(r8);
        r1 = 2131231800; // 0x7f080438 float:1.8079691E38 double:1.0529684157E-314;
        r1 = r8.getString(r1);
        r0 = r0.setMessage(r1);
        r0 = r0.setCancelable(r6);
        r1 = new com.whatsapp.arq;
        r1.<init>(r8, r9);
        r0 = r0.setPositiveButton(r2, r1);
        r1 = new com.whatsapp.a2i;
        r1.<init>(r8, r9);
        r0 = r0.setNegativeButton(r7, r1);
        r0 = r0.create();
        goto L_0x0014;
    L_0x025c:
        r0 = new android.support.v7.app.AlertDialog$Builder;
        r0.<init>(r8);
        r1 = 2131231801; // 0x7f080439 float:1.8079693E38 double:1.052968416E-314;
        r2 = new java.lang.Object[r4];
        r4 = r8.w;
        r3 = com.whatsapp.util.cs.f(r8, r4);
        r2[r6] = r3;
        r1 = r8.getString(r1, r2);
        r0 = r0.setMessage(r1);
        r0 = r0.setCancelable(r6);
        r1 = 2131231756; // 0x7f08040c float:1.8079602E38 double:1.052968394E-314;
        r2 = new com.whatsapp.mx;
        r2.<init>(r8, r9);
        r0 = r0.setPositiveButton(r1, r2);
        r1 = new com.whatsapp.ari;
        r1.<init>(r8, r9);
        r0 = r0.setNegativeButton(r7, r1);
        r0 = r0.create();
        goto L_0x0014;
    L_0x0295:
        r0 = new android.widget.EditText;
        r0.<init>(r8);
        r1 = new android.text.InputFilter[r4];
        r2 = new android.text.InputFilter$LengthFilter;
        r3 = B;
        r2.<init>(r3);
        r1[r6] = r2;
        r2 = 2;
        r0.setInputType(r2);
        r0.setFilters(r1);
        r1 = 17;
        r0.setGravity(r1);
        r1 = new android.support.v7.app.AlertDialog$Builder;
        r1.<init>(r8);
        r2 = 2131231805; // 0x7f08043d float:1.8079701E38 double:1.052968418E-314;
        r1 = r1.setTitle(r2);
        r2 = 2131231804; // 0x7f08043c float:1.80797E38 double:1.0529684177E-314;
        r3 = new java.lang.Object[r4];
        r4 = B;
        r4 = java.lang.Integer.valueOf(r4);
        r3[r6] = r4;
        r2 = r8.getString(r2, r3);
        r1 = r1.setMessage(r2);
        r1 = r1.setView(r0);
        r2 = new com.whatsapp.ase;
        r2.<init>(r8, r0);
        r0 = r1.setPositiveButton(r5, r2);
        r1 = new com.whatsapp.a9_;
        r1.<init>(r8);
        r0 = r0.setNegativeButton(r7, r1);
        r0 = r0.create();
        goto L_0x0014;
    L_0x02ee:
        r0 = new android.support.v7.app.AlertDialog$Builder;
        r0.<init>(r8);
        r1 = 2131231799; // 0x7f080437 float:1.807969E38 double:1.052968415E-314;
        r2 = new java.lang.Object[r4];
        r3 = B;
        r3 = java.lang.Integer.valueOf(r3);
        r2[r6] = r3;
        r1 = r8.getString(r1, r2);
        r0 = r0.setMessage(r1);
        r1 = new com.whatsapp.aal;
        r1.<init>(r8);
        r0 = r0.setPositiveButton(r5, r1);
        r0 = r0.create();
        goto L_0x0014;
    L_0x0317:
        r0 = super.onCreateDialog(r9);
        if (r0 == 0) goto L_0x0014;
    L_0x031d:
        r1 = r8.M;	 Catch:{ ActivityNotFoundException -> 0x032f }
        if (r1 == 0) goto L_0x0014;
    L_0x0321:
        r1 = 0;
        r0.setCancelable(r1);	 Catch:{ ActivityNotFoundException -> 0x032f }
        r1 = new com.whatsapp.ex;	 Catch:{ ActivityNotFoundException -> 0x032f }
        r1.<init>(r8);	 Catch:{ ActivityNotFoundException -> 0x032f }
        r0.setOnDismissListener(r1);	 Catch:{ ActivityNotFoundException -> 0x032f }
        goto L_0x0014;
    L_0x032f:
        r0 = move-exception;
        throw r0;
    L_0x0331:
        r0 = r8.N;
        r1 = r8.L;
        r0 = com.whatsapp.VerifyNumber.b(r0, r1);
        r0 = com.whatsapp.aam.a(r0);
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = 2131231796; // 0x7f080434 float:1.8079683E38 double:1.0529684137E-314;
        r2 = r8.getString(r2);
        r1 = r1.append(r2);
        r2 = "\n";
        r1 = r1.append(r2);
        r1 = r1.append(r0);
        r2 = "\n";
        r1 = r1.append(r2);
        r2 = 2131231795; // 0x7f080433 float:1.8079681E38 double:1.052968413E-314;
        r2 = r8.getString(r2);
        r1 = r1.append(r2);
        r1 = r1.toString();
        r2 = new android.support.v7.app.AlertDialog$Builder;
        r2.<init>(r8);
        r1 = r2.setMessage(r1);
        r1 = r1.setCancelable(r6);
        r2 = new com.whatsapp.bi;
        r2.<init>(r8);
        r1 = r1.setPositiveButton(r7, r2);
        r2 = 2131231797; // 0x7f080435 float:1.8079685E38 double:1.052968414E-314;
        r3 = new com.whatsapp.aso;
        r3.<init>(r8, r0);
        r0 = r1.setNeutralButton(r2, r3);
        r0 = r0.create();
        goto L_0x0014;
    L_0x0396:
        r0 = com.whatsapp.App.j;
        r2 = 2;
        if (r0 != r2) goto L_0x03a4;
    L_0x039b:
        r0 = 2131231778; // 0x7f080422 float:1.8079647E38 double:1.052968405E-314;
        r0 = r8.getString(r0);
        if (r1 == 0) goto L_0x03c2;
    L_0x03a4:
        r0 = com.whatsapp.App.j;	 Catch:{ ActivityNotFoundException -> 0x03e9 }
        if (r0 != 0) goto L_0x03b1;
    L_0x03a8:
        r0 = 2131231779; // 0x7f080423 float:1.8079649E38 double:1.0529684053E-314;
        r0 = r8.getString(r0);
        if (r1 == 0) goto L_0x03c2;
    L_0x03b1:
        r0 = 2131231780; // 0x7f080424 float:1.807965E38 double:1.052968406E-314;
        r1 = new java.lang.Object[r4];
        r2 = U;
        r3 = 90;
        r2 = r2[r3];
        r1[r6] = r2;
        r0 = r8.getString(r0, r1);
    L_0x03c2:
        r1 = new android.support.v7.app.AlertDialog$Builder;
        r1.<init>(r8);
        r2 = 2131231745; // 0x7f080401 float:1.807958E38 double:1.0529683885E-314;
        r3 = new java.lang.Object[r4];
        r3[r6] = r0;
        r0 = r8.getString(r2, r3);
        r0 = r1.setMessage(r0);
        r0 = r0.setCancelable(r6);
        r1 = new com.whatsapp.alo;
        r1.<init>(r8);
        r0 = r0.setPositiveButton(r5, r1);
        r0 = r0.create();
        goto L_0x0014;
    L_0x03e9:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VerifySms.onCreateDialog(int):android.app.Dialog");
    }

    private void k(String str) {
        try {
            if (this.v) {
                Log.i(U[31]);
                c(str);
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            Log.i(U[32] + O);
            this.K.setText(str);
        } catch (ActivityNotFoundException e) {
            throw e;
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    static String v(VerifySms verifySms) {
        return verifySms.L;
    }

    private int l() {
        double random = Math.random();
        int i = this.P;
        this.P = i + 1;
        return (int) (random * ((Math.pow(2.0d, (double) i) - 1.0d) * 4000.0d));
    }

    private void A() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) getSystemService(U[95])).getActiveNetworkInfo();
        try {
            int i;
            Log.i(U[94] + activeNetworkInfo);
            App.bc();
            if (activeNetworkInfo == null) {
                i = -1;
            } else {
                i = activeNetworkInfo.getType();
            }
            try {
                if (i != this.A) {
                    try {
                        Log.i(U[92] + this.A + U[91] + i);
                        this.A = i;
                        if (this.A != -1 && this.F.hasMessages(1)) {
                            Log.i(U[96]);
                            this.F.removeMessages(1);
                            u();
                            String v = v();
                            if (v != null) {
                                try {
                                    this.F.sendMessage(this.F.obtainMessage(1, v));
                                    if (!DialogToastActivity.f) {
                                        return;
                                    }
                                } catch (ActivityNotFoundException e) {
                                    throw e;
                                }
                            }
                            Log.e(U[93]);
                        }
                    } catch (ActivityNotFoundException e2) {
                        throw e2;
                    }
                }
            } catch (ActivityNotFoundException e22) {
                throw e22;
            }
        } catch (ActivityNotFoundException e222) {
            throw e222;
        }
    }

    static int d(VerifySms verifySms) {
        return verifySms.l();
    }

    private void a(long j) {
        Editor edit = getPreferences(0).edit();
        try {
            edit.putLong(U[79], j);
            if (!edit.commit()) {
                Log.e(U[80]);
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    static void d(VerifySms verifySms, long j) {
        verifySms.d(j);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onNewIntent(android.content.Intent r6) {
        /*
        r5 = this;
        r0 = com.whatsapp.DialogToastActivity.f;
        r1 = U;
        r2 = 64;
        r1 = r1[r2];
        com.whatsapp.util.Log.i(r1);
        super.onNewIntent(r6);
        r1 = r5.a(r6);
        if (r1 == 0) goto L_0x003b;
    L_0x0014:
        r2 = r5.H;	 Catch:{ ActivityNotFoundException -> 0x0064 }
        if (r2 == 0) goto L_0x001d;
    L_0x0018:
        r5.k(r1);	 Catch:{ ActivityNotFoundException -> 0x0066 }
        if (r0 == 0) goto L_0x0063;
    L_0x001d:
        r2 = new java.lang.StringBuilder;	 Catch:{ ActivityNotFoundException -> 0x0066 }
        r2.<init>();	 Catch:{ ActivityNotFoundException -> 0x0066 }
        r3 = U;	 Catch:{ ActivityNotFoundException -> 0x0066 }
        r4 = 67;
        r3 = r3[r4];	 Catch:{ ActivityNotFoundException -> 0x0066 }
        r2 = r2.append(r3);	 Catch:{ ActivityNotFoundException -> 0x0066 }
        r2 = r2.append(r1);	 Catch:{ ActivityNotFoundException -> 0x0066 }
        r2 = r2.toString();	 Catch:{ ActivityNotFoundException -> 0x0066 }
        com.whatsapp.util.Log.i(r2);	 Catch:{ ActivityNotFoundException -> 0x0066 }
        r5.S = r1;	 Catch:{ ActivityNotFoundException -> 0x0066 }
        if (r0 == 0) goto L_0x0063;
    L_0x003b:
        r1 = U;
        r2 = 66;
        r1 = r1[r2];
        r2 = 0;
        r1 = r6.getIntExtra(r1, r2);
        switch(r1) {
            case 4: goto L_0x006e;
            case 7: goto L_0x0068;
            case 21: goto L_0x0074;
            case 23: goto L_0x007b;
            default: goto L_0x0049;
        };
    L_0x0049:
        r0 = new java.lang.StringBuilder;	 Catch:{ ActivityNotFoundException -> 0x0089 }
        r0.<init>();	 Catch:{ ActivityNotFoundException -> 0x0089 }
        r2 = U;	 Catch:{ ActivityNotFoundException -> 0x0089 }
        r3 = 65;
        r2 = r2[r3];	 Catch:{ ActivityNotFoundException -> 0x0089 }
        r0 = r0.append(r2);	 Catch:{ ActivityNotFoundException -> 0x0089 }
        r0 = r0.append(r1);	 Catch:{ ActivityNotFoundException -> 0x0089 }
        r0 = r0.toString();	 Catch:{ ActivityNotFoundException -> 0x0089 }
        com.whatsapp.util.Log.i(r0);	 Catch:{ ActivityNotFoundException -> 0x0089 }
    L_0x0063:
        return;
    L_0x0064:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0066 }
    L_0x0066:
        r0 = move-exception;
        throw r0;
    L_0x0068:
        r2 = 7;
        r5.showDialog(r2);	 Catch:{ ActivityNotFoundException -> 0x0083 }
        if (r0 == 0) goto L_0x0063;
    L_0x006e:
        r2 = 4;
        r5.showDialog(r2);	 Catch:{ ActivityNotFoundException -> 0x0085 }
        if (r0 == 0) goto L_0x0063;
    L_0x0074:
        r2 = 21;
        r5.showDialog(r2);	 Catch:{ ActivityNotFoundException -> 0x0087 }
        if (r0 == 0) goto L_0x0063;
    L_0x007b:
        r2 = 23;
        r5.showDialog(r2);	 Catch:{ ActivityNotFoundException -> 0x0089 }
        if (r0 == 0) goto L_0x0063;
    L_0x0082:
        goto L_0x0049;
    L_0x0083:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0085 }
    L_0x0085:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0087 }
    L_0x0087:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0089 }
    L_0x0089:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VerifySms.onNewIntent(android.content.Intent):void");
    }

    static String a(VerifySms verifySms, String str) {
        verifySms.L = str;
        return str;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onPrepareDialog(int r4, android.app.Dialog r5) {
        /*
        r3 = this;
        r1 = com.whatsapp.DialogToastActivity.f;
        switch(r4) {
            case 29: goto L_0x0006;
            case 40: goto L_0x002a;
            case 41: goto L_0x001e;
            case 42: goto L_0x0012;
            default: goto L_0x0005;
        };
    L_0x0005:
        return;
    L_0x0006:
        r0 = r5;
        r0 = (android.support.v7.app.AlertDialog) r0;
        r2 = r3.H();
        r0.setMessage(r2);
        if (r1 == 0) goto L_0x0005;
    L_0x0012:
        r0 = r5;
        r0 = (android.support.v7.app.AlertDialog) r0;
        r2 = r3.D();
        r0.setMessage(r2);
        if (r1 == 0) goto L_0x0005;
    L_0x001e:
        r0 = r5;
        r0 = (android.support.v7.app.AlertDialog) r0;
        r2 = r3.x();
        r0.setMessage(r2);
        if (r1 == 0) goto L_0x0005;
    L_0x002a:
        r5 = (android.support.v7.app.AlertDialog) r5;
        r0 = r3.a();
        r5.setMessage(r0);
        goto L_0x0005;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VerifySms.onPrepareDialog(int, android.app.Dialog):void");
    }

    private String x() {
        long j = -1;
        long o = o();
        long currentTimeMillis = System.currentTimeMillis();
        if (o != -1) {
            j = o - currentTimeMillis;
        }
        try {
            Log.i(U[29] + j);
            if (j > 0) {
                return getString(2131231774, new Object[]{getString(2131232208), cs.f(this, j)});
            }
            return getString(2131231773, new Object[]{getString(2131232208)});
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    static xm b(VerifySms verifySms) {
        return verifySms.F;
    }

    private void b(String str) {
        c(str);
        u();
    }

    static long g(VerifySms verifySms) {
        return verifySms.w;
    }

    private void u() {
        this.P = 0;
    }

    private boolean e(String str) {
        boolean z = DialogToastActivity.f;
        if (str == null) {
            return false;
        }
        try {
            if (str.length() != B) {
                return false;
            }
            int i = 0;
            while (i < str.length()) {
                try {
                    if (Character.isDigit(str.charAt(i))) {
                        i++;
                        if (z) {
                            break;
                        }
                    }
                    return false;
                } catch (ActivityNotFoundException e) {
                    throw e;
                }
            }
            return true;
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    public void onEvent(a_3 com_whatsapp_a_3) {
        A();
    }

    static void m(VerifySms verifySms) {
        verifySms.s();
    }

    static void l(VerifySms verifySms) {
        verifySms.I();
    }

    private void d(boolean z) {
        try {
            ((InputMethodManager) getSystemService(U[9])).toggleSoftInput(0, 0);
            if (c()) {
                Log.i(U[10]);
                Q = null;
                App.b((Context) this, b(Q));
                bq.a(new mj(this, z), new String[0]);
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            Log.e(U[11]);
            w();
        } catch (ActivityNotFoundException e) {
            throw e;
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    private void J() {
        try {
            if (this.x != null) {
                unregisterReceiver(this.x);
                this.x = null;
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    private String a() {
        long j = -1;
        long B = B();
        long currentTimeMillis = System.currentTimeMillis();
        if (B != -1) {
            j = B - currentTimeMillis;
        }
        try {
            Log.i(U[arj.Theme_buttonStyleSmall] + j);
            if (j > 0) {
                return getString(2131231770, new Object[]{getString(2131232215), cs.f(this, j)});
            }
            return getString(2131231769, new Object[]{getString(2131232215)});
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    static void s(VerifySms verifySms) {
        verifySms.u();
    }

    static void j(VerifySms verifySms) {
        verifySms.q();
    }

    private String a(Intent intent) {
        Uri data;
        if (U[36].equals(intent.getScheme())) {
            data = intent.getData();
            if (data == null) {
                return null;
            }
            try {
                if (!"r".equals(data.getHost())) {
                    return null;
                }
                String queryParameter = data.getQueryParameter("c");
                Log.i(U[38] + queryParameter);
                return queryParameter;
            } catch (ActivityNotFoundException e) {
                throw e;
            }
        }
        try {
            if (!U[33].equals(intent.getScheme()) && !U[34].equals(intent.getScheme())) {
                return null;
            }
            data = intent.getData();
            if (data == null) {
                return null;
            }
            try {
                if (!U[35].equals(data.getHost())) {
                    return null;
                }
                queryParameter = data.getPath();
                queryParameter = queryParameter.substring(queryParameter.lastIndexOf("/") + 1);
                Log.i(U[37] + queryParameter);
                return queryParameter;
            } catch (ActivityNotFoundException e2) {
                throw e2;
            }
        } catch (ActivityNotFoundException e22) {
            throw e22;
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        try {
            if (J && menu.findItem(1) == null) {
                menu.add(0, 1, 0, 2131232217).setIcon(2130839603);
            }
            return true;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    static void r(VerifySms verifySms) {
        verifySms.G();
    }

    static void c(VerifySms verifySms, long j) {
        verifySms.b(j);
    }

    static boolean b(boolean z) {
        J = z;
        return z;
    }

    private void d(long j) {
        Log.i(U[100] + j);
        Editor edit = getPreferences(0).edit();
        try {
            edit.putLong(U[98], j);
            if (!edit.commit()) {
                Log.e(U[99]);
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    static CountDownTimer a(VerifySms verifySms, CountDownTimer countDownTimer) {
        verifySms.y = countDownTimer;
        return countDownTimer;
    }

    static void w(VerifySms verifySms) {
        verifySms.t();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r12) {
        /*
        r11 = this;
        r10 = 2131755873; // 0x7f100361 float:1.9142638E38 double:1.053227342E-314;
        r0 = 1;
        r1 = 0;
        r9 = 0;
        r2 = U;
        r3 = 44;
        r2 = r2[r3];
        com.whatsapp.util.Log.i(r2);
        super.onCreate(r12);
        r2 = de.greenrobot.event.h.b();
        r2.e(r11);
        r2 = 2130903285; // 0x7f0300f5 float:1.7413384E38 double:1.0528061077E-314;
        r11.setContentView(r2);
        r2 = r11.getIntent();
        r3 = U;	 Catch:{ ActivityNotFoundException -> 0x0070 }
        r4 = 46;
        r3 = r3[r4];	 Catch:{ ActivityNotFoundException -> 0x0070 }
        r4 = r2.getScheme();	 Catch:{ ActivityNotFoundException -> 0x0070 }
        r3 = r3.equals(r4);	 Catch:{ ActivityNotFoundException -> 0x0070 }
        if (r3 != 0) goto L_0x0053;
    L_0x0033:
        r3 = U;	 Catch:{ ActivityNotFoundException -> 0x0072 }
        r4 = 42;
        r3 = r3[r4];	 Catch:{ ActivityNotFoundException -> 0x0072 }
        r4 = r2.getScheme();	 Catch:{ ActivityNotFoundException -> 0x0072 }
        r3 = r3.equals(r4);	 Catch:{ ActivityNotFoundException -> 0x0072 }
        if (r3 != 0) goto L_0x0053;
    L_0x0043:
        r3 = U;	 Catch:{ ActivityNotFoundException -> 0x0072 }
        r4 = 54;
        r3 = r3[r4];	 Catch:{ ActivityNotFoundException -> 0x0072 }
        r4 = r2.getScheme();	 Catch:{ ActivityNotFoundException -> 0x0072 }
        r3 = r3.equals(r4);	 Catch:{ ActivityNotFoundException -> 0x0072 }
        if (r3 == 0) goto L_0x009a;
    L_0x0053:
        r3 = com.whatsapp.App.t(r11);
        if (r3 != r0) goto L_0x0074;
    L_0x0059:
        r1 = new android.content.Intent;
        r2 = com.whatsapp.RegisterPhone.class;
        r1.<init>(r11, r2);
        r2 = U;
        r3 = 51;
        r2 = r2[r3];
        r1.putExtra(r2, r0);
        r11.startActivity(r1);
        r11.finish();
    L_0x006f:
        return;
    L_0x0070:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0072 }
    L_0x0072:
        r0 = move-exception;
        throw r0;
    L_0x0074:
        r2 = r11.a(r2);	 Catch:{ ActivityNotFoundException -> 0x00cc }
        r11.S = r2;	 Catch:{ ActivityNotFoundException -> 0x00cc }
        r2 = new java.lang.StringBuilder;	 Catch:{ ActivityNotFoundException -> 0x00cc }
        r2.<init>();	 Catch:{ ActivityNotFoundException -> 0x00cc }
        r3 = U;	 Catch:{ ActivityNotFoundException -> 0x00cc }
        r4 = 52;
        r3 = r3[r4];	 Catch:{ ActivityNotFoundException -> 0x00cc }
        r2 = r2.append(r3);	 Catch:{ ActivityNotFoundException -> 0x00cc }
        r3 = r11.S;	 Catch:{ ActivityNotFoundException -> 0x00cc }
        r2 = r2.append(r3);	 Catch:{ ActivityNotFoundException -> 0x00cc }
        r2 = r2.toString();	 Catch:{ ActivityNotFoundException -> 0x00cc }
        com.whatsapp.util.Log.i(r2);	 Catch:{ ActivityNotFoundException -> 0x00cc }
        r2 = com.whatsapp.DialogToastActivity.f;	 Catch:{ ActivityNotFoundException -> 0x00cc }
        if (r2 == 0) goto L_0x009d;
    L_0x009a:
        r2 = 0;
        r11.S = r2;	 Catch:{ ActivityNotFoundException -> 0x00cc }
    L_0x009d:
        r2 = com.whatsapp.App.t(r11);
        r3 = 4;
        if (r2 == r3) goto L_0x00ce;
    L_0x00a4:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = U;
        r3 = 47;
        r1 = r1[r3];
        r0 = r0.append(r1);
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        r0 = new android.content.Intent;
        r1 = com.whatsapp.Main.class;
        r0.<init>(r11, r1);
        r11.startActivity(r0);
        r11.finish();
        goto L_0x006f;
    L_0x00cc:
        r0 = move-exception;
        throw r0;
    L_0x00ce:
        r2 = 0;
        r11.T = r2;	 Catch:{ ActivityNotFoundException -> 0x0194 }
        if (r12 == 0) goto L_0x0196;
    L_0x00d3:
        r11.H = r0;	 Catch:{ ActivityNotFoundException -> 0x0199 }
        r0 = r11.getIntent();	 Catch:{ ActivityNotFoundException -> 0x0199 }
        r0 = r0.getExtras();	 Catch:{ ActivityNotFoundException -> 0x0199 }
        if (r0 == 0) goto L_0x0158;
    L_0x00df:
        r0 = r11.getIntent();	 Catch:{ ActivityNotFoundException -> 0x019b }
        r2 = U;	 Catch:{ ActivityNotFoundException -> 0x019b }
        r3 = 60;
        r2 = r2[r3];	 Catch:{ ActivityNotFoundException -> 0x019b }
        r3 = r11.u;	 Catch:{ ActivityNotFoundException -> 0x019b }
        r0 = r0.getBooleanExtra(r2, r3);	 Catch:{ ActivityNotFoundException -> 0x019b }
        if (r0 != 0) goto L_0x00f5;
    L_0x00f1:
        r0 = r11.u;	 Catch:{ ActivityNotFoundException -> 0x019d }
        if (r0 == 0) goto L_0x0109;
    L_0x00f5:
        r0 = U;	 Catch:{ ActivityNotFoundException -> 0x019d }
        r2 = 57;
        r0 = r0[r2];	 Catch:{ ActivityNotFoundException -> 0x019d }
        com.whatsapp.util.Log.i(r0);	 Catch:{ ActivityNotFoundException -> 0x019d }
        r0 = 2131755933; // 0x7f10039d float:1.914276E38 double:1.053227372E-314;
        r0 = r11.findViewById(r0);	 Catch:{ ActivityNotFoundException -> 0x019d }
        r2 = 0;
        r0.setVisibility(r2);	 Catch:{ ActivityNotFoundException -> 0x019d }
    L_0x0109:
        r0 = r11.getIntent();	 Catch:{ ActivityNotFoundException -> 0x019f }
        r2 = U;	 Catch:{ ActivityNotFoundException -> 0x019f }
        r3 = 59;
        r2 = r2[r3];	 Catch:{ ActivityNotFoundException -> 0x019f }
        r3 = 0;
        r0 = r0.getBooleanExtra(r2, r3);	 Catch:{ ActivityNotFoundException -> 0x019f }
        if (r0 == 0) goto L_0x011d;
    L_0x011a:
        r0 = 1;
        r11.q = r0;	 Catch:{ ActivityNotFoundException -> 0x019f }
    L_0x011d:
        r0 = U;
        r2 = 49;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        if (r12 != 0) goto L_0x014e;
    L_0x0128:
        r0 = r11.getIntent();
        r2 = U;
        r3 = 45;
        r2 = r2[r3];
        r4 = 0;
        r2 = r0.getLongExtra(r2, r4);
        r0 = r11.getIntent();
        r4 = U;
        r5 = 50;
        r4 = r4[r5];
        r6 = 0;
        r4 = r0.getLongExtra(r4, r6);
        r11.d(r2);
        r11.b(r4);
    L_0x014e:
        r0 = new android.content.Intent;
        r2 = com.whatsapp.VerifySms.class;
        r0.<init>(r11, r2);
        r11.setIntent(r0);
    L_0x0158:
        r0 = U;
        r2 = 61;
        r0 = r0[r2];
        r0 = r11.getSharedPreferences(r0, r1);
        r1 = U;	 Catch:{ ActivityNotFoundException -> 0x01a1 }
        r2 = 41;
        r1 = r1[r2];	 Catch:{ ActivityNotFoundException -> 0x01a1 }
        r2 = 0;
        r1 = r0.getString(r1, r2);	 Catch:{ ActivityNotFoundException -> 0x01a1 }
        r11.N = r1;	 Catch:{ ActivityNotFoundException -> 0x01a1 }
        r1 = U;	 Catch:{ ActivityNotFoundException -> 0x01a1 }
        r2 = 55;
        r1 = r1[r2];	 Catch:{ ActivityNotFoundException -> 0x01a1 }
        r2 = 0;
        r0 = r0.getString(r1, r2);	 Catch:{ ActivityNotFoundException -> 0x01a1 }
        r11.L = r0;	 Catch:{ ActivityNotFoundException -> 0x01a1 }
        r0 = r11.N;	 Catch:{ ActivityNotFoundException -> 0x01a1 }
        if (r0 == 0) goto L_0x0184;
    L_0x0180:
        r0 = r11.L;	 Catch:{ ActivityNotFoundException -> 0x0192 }
        if (r0 != 0) goto L_0x01a3;
    L_0x0184:
        r0 = U;	 Catch:{ ActivityNotFoundException -> 0x0192 }
        r1 = 56;
        r0 = r0[r1];	 Catch:{ ActivityNotFoundException -> 0x0192 }
        com.whatsapp.util.Log.w(r0);	 Catch:{ ActivityNotFoundException -> 0x0192 }
        r11.w();	 Catch:{ ActivityNotFoundException -> 0x0192 }
        goto L_0x006f;
    L_0x0192:
        r0 = move-exception;
        throw r0;
    L_0x0194:
        r0 = move-exception;
        throw r0;
    L_0x0196:
        r0 = r1;
        goto L_0x00d3;
    L_0x0199:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x019b }
    L_0x019b:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x019d }
    L_0x019d:
        r0 = move-exception;
        throw r0;
    L_0x019f:
        r0 = move-exception;
        throw r0;
    L_0x01a1:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0192 }
    L_0x01a3:
        r11.i();
        r0 = 2131755936; // 0x7f1003a0 float:1.9142765E38 double:1.0532273733E-314;
        r0 = r11.findViewById(r0);
        r0 = (com.whatsapp.registration.CodeInputField) r0;
        r11.K = r0;
        r0 = r11.K;
        r0.a(r11);
        r0 = 2131755937; // 0x7f1003a1 float:1.9142767E38 double:1.053227374E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.ProgressBar) r0;
        r1 = 100;
        r0.setProgress(r1);
        r0 = r11.findViewById(r10);
        r1 = new com.whatsapp.a41;
        r1.<init>(r11);
        r0.setOnClickListener(r1);
        r0 = 2131755938; // 0x7f1003a2 float:1.914277E38 double:1.0532273743E-314;
        r0 = r11.findViewById(r0);
        r0 = (android.widget.ImageButton) r0;
        r11.C = r0;
        r0 = r11.C;
        r1 = new com.whatsapp.util.bz;
        r2 = r11.getResources();
        r3 = 2130839425; // 0x7f020781 float:1.728386E38 double:1.0527745567E-314;
        r2 = r2.getDrawable(r3);
        r1.<init>(r2);
        r0.setImageDrawable(r1);
        r0 = r11.C;
        r1 = new com.whatsapp.t5;
        r1.<init>(r11);
        r0.setOnClickListener(r1);
        r0 = 2131755941; // 0x7f1003a5 float:1.9142775E38 double:1.053227376E-314;
        r0 = r11.findViewById(r0);
        r1 = new com.whatsapp.ady;
        r1.<init>(r11);
        r0.setOnClickListener(r1);
        r0 = new com.whatsapp.h7;
        r1 = U;
        r2 = 58;
        r2 = r1[r2];
        r3 = 2131755941; // 0x7f1003a5 float:1.9142775E38 double:1.053227376E-314;
        r4 = 2131755942; // 0x7f1003a6 float:1.9142778E38 double:1.0532273763E-314;
        r5 = 2130839542; // 0x7f0207f6 float:1.7284098E38 double:1.0527746145E-314;
        r6 = 2130839541; // 0x7f0207f5 float:1.7284095E38 double:1.052774614E-314;
        r7 = 2131232208; // 0x7f0805d0 float:1.8080519E38 double:1.0529686173E-314;
        r8 = 2131232209; // 0x7f0805d1 float:1.808052E38 double:1.052968618E-314;
        r1 = r11;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9);
        r11.E = r0;
        r0 = new com.whatsapp.h7;
        r1 = U;
        r2 = 43;
        r2 = r1[r2];
        r4 = 2131755944; // 0x7f1003a8 float:1.9142782E38 double:1.0532273772E-314;
        r5 = 2130839540; // 0x7f0207f4 float:1.7284093E38 double:1.0527746135E-314;
        r6 = 2130839539; // 0x7f0207f3 float:1.7284091E38 double:1.052774613E-314;
        r7 = 2131232215; // 0x7f0805d7 float:1.8080533E38 double:1.0529686207E-314;
        r8 = 2131232216; // 0x7f0805d8 float:1.8080535E38 double:1.052968621E-314;
        r1 = r11;
        r3 = r10;
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9);
        r11.z = r0;
        r11.r();
        r11.A();
        r0 = r11.getResources();
        r0 = r0.getDisplayMetrics();
        r1 = r0.heightPixels;	 Catch:{ ActivityNotFoundException -> 0x02a5 }
        r1 = (float) r1;	 Catch:{ ActivityNotFoundException -> 0x02a5 }
        r0 = r0.density;	 Catch:{ ActivityNotFoundException -> 0x02a5 }
        r0 = r1 / r0;
        r1 = 1140457472; // 0x43fa0000 float:500.0 double:5.634608575E-315;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 >= 0) goto L_0x026a;
    L_0x0262:
        r0 = r11.getWindow();	 Catch:{ ActivityNotFoundException -> 0x02a5 }
        r1 = 2;
        r0.setSoftInputMode(r1);	 Catch:{ ActivityNotFoundException -> 0x02a5 }
    L_0x026a:
        r0 = r11.v();
        if (r0 == 0) goto L_0x006f;
    L_0x0270:
        r1 = new java.lang.StringBuilder;	 Catch:{ ActivityNotFoundException -> 0x02a3 }
        r1.<init>();	 Catch:{ ActivityNotFoundException -> 0x02a3 }
        r2 = U;	 Catch:{ ActivityNotFoundException -> 0x02a3 }
        r3 = 53;
        r2 = r2[r3];	 Catch:{ ActivityNotFoundException -> 0x02a3 }
        r1 = r1.append(r2);	 Catch:{ ActivityNotFoundException -> 0x02a3 }
        r1 = r1.append(r0);	 Catch:{ ActivityNotFoundException -> 0x02a3 }
        r1 = r1.toString();	 Catch:{ ActivityNotFoundException -> 0x02a3 }
        com.whatsapp.util.Log.i(r1);	 Catch:{ ActivityNotFoundException -> 0x02a3 }
        r1 = new com.whatsapp.aze;	 Catch:{ ActivityNotFoundException -> 0x02a3 }
        r1.<init>(r11);	 Catch:{ ActivityNotFoundException -> 0x02a3 }
        r2 = 2;
        r2 = new java.lang.String[r2];	 Catch:{ ActivityNotFoundException -> 0x02a3 }
        r3 = 0;
        r2[r3] = r0;	 Catch:{ ActivityNotFoundException -> 0x02a3 }
        r0 = 1;
        r3 = U;	 Catch:{ ActivityNotFoundException -> 0x02a3 }
        r4 = 48;
        r3 = r3[r4];	 Catch:{ ActivityNotFoundException -> 0x02a3 }
        r2[r0] = r3;	 Catch:{ ActivityNotFoundException -> 0x02a3 }
        com.whatsapp.util.bq.a(r1, r2);	 Catch:{ ActivityNotFoundException -> 0x02a3 }
        goto L_0x006f;
    L_0x02a3:
        r0 = move-exception;
        throw r0;
    L_0x02a5:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VerifySms.onCreate(android.os.Bundle):void");
    }

    static boolean b(VerifySms verifySms, boolean z) {
        verifySms.M = z;
        return z;
    }

    public void onPause() {
        super.onPause();
        Log.i(U[20] + O);
        Editor edit = getPreferences(0).edit();
        try {
            edit.putInt(U[21], O);
            if (!edit.commit()) {
                Log.w(U[22]);
            }
            App.b((Context) this, b(Q));
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    static void h(VerifySms verifySms) {
        verifySms.n();
    }

    protected void a(ServiceState serviceState) {
        try {
            findViewById(2131755933).setVisibility(this.u ? 0 : 8);
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    static void x(VerifySms verifySms) {
        verifySms.c();
    }

    static int a(int i) {
        B = i;
        return i;
    }

    private void G() {
        Editor edit = getPreferences(0).edit();
        try {
            edit.putInt(U[24], O);
            if (!edit.commit()) {
                Log.w(U[23]);
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    static String k(VerifySms verifySms) {
        return verifySms.N;
    }

    static long a(VerifySms verifySms, long j) {
        verifySms.w = j;
        return j;
    }

    static void t(VerifySms verifySms) {
        verifySms.w();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void w() {
        /*
        r4 = this;
        r3 = 1;
        r0 = 0;
        O = r0;
        r4.G();
        r0 = r4.F;
        r0.removeMessages(r3);
        r0 = r4.q;
        if (r0 != 0) goto L_0x0027;
    L_0x0010:
        com.whatsapp.App.d(r4, r3);
        r0 = new android.content.Intent;
        r1 = com.whatsapp.RegisterPhone.class;
        r0.<init>(r4, r1);
        r1 = U;
        r2 = 18;
        r1 = r1[r2];
        r0.putExtra(r1, r3);
        r1 = com.whatsapp.DialogToastActivity.f;
        if (r1 == 0) goto L_0x003e;
    L_0x0027:
        r0 = 3;
        com.whatsapp.App.d(r4, r0);
        r0 = U;
        r1 = 19;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        com.whatsapp.ChangeNumber.a(r4);
        r0 = new android.content.Intent;
        r1 = com.whatsapp.ChangeNumber.class;
        r0.<init>(r4, r1);
    L_0x003e:
        r4.I();
        r4.y();
        r4.t();
        r4.startActivity(r0);
        r4.finish();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VerifySms.w():void");
    }

    protected void onDestroy() {
        try {
            Log.i(U[13]);
            f();
            this.D = true;
            J();
            if (this.y != null) {
                this.y.cancel();
                this.y = null;
            }
            try {
                if (this.z != null) {
                    this.z.a(true);
                }
                try {
                    if (this.E != null) {
                        this.E.a(true);
                    }
                    h.b().c(this);
                    super.onDestroy();
                } catch (ActivityNotFoundException e) {
                    throw e;
                }
            } catch (ActivityNotFoundException e2) {
                throw e2;
            }
        } catch (ActivityNotFoundException e22) {
            throw e22;
        }
    }

    private void q() {
        try {
            switch (O) {
                case Y.p /*12*/:
                    findViewById(2131755934).setVisibility(8);
                    findViewById(2131755940).setVisibility(8);
                    findViewById(2131755943).setVisibility(8);
                    if (DialogToastActivity.f) {
                        break;
                    }
                    return;
            }
            findViewById(2131755934).setVisibility(0);
            F();
        } catch (ActivityNotFoundException e) {
            throw e;
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    static void u(VerifySms verifySms) {
        verifySms.j();
    }

    static void d(VerifySms verifySms, boolean z) {
        verifySms.d(z);
    }

    private void c(long j) {
        try {
            if (this.y != null) {
                this.y.cancel();
                this.y = null;
            }
            if (j < 1000) {
                try {
                    t();
                    return;
                } catch (ActivityNotFoundException e) {
                    throw e;
                }
            }
            this.v = true;
            a(System.currentTimeMillis() + j);
            this.K.setEnabled(false);
            ProgressBar progressBar = (ProgressBar) findViewById(2131755937);
            progressBar.setProgress(0);
            TextView textView = (TextView) findViewById(2131755939);
            textView.setText(2131232199);
            this.y = new jd(this, j, 1000, progressBar, j, textView).start();
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    static CodeInputField p(VerifySms verifySms) {
        return verifySms.K;
    }

    private long B() {
        return getPreferences(0).getLong(U[30], -1);
    }

    private void C() {
        long j = -1;
        long o = o();
        long currentTimeMillis = System.currentTimeMillis();
        if (o != -1) {
            j = o - currentTimeMillis;
        }
        if (o > currentTimeMillis) {
            try {
                App.p.a(j);
            } catch (ActivityNotFoundException e) {
                throw e;
            }
        }
    }

    private void b(long j) {
        Editor edit = getPreferences(0).edit();
        try {
            edit.putLong(U[63], j);
            if (!edit.commit()) {
                Log.e(U[62]);
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    static int c(int i) {
        I = i;
        return i;
    }

    private void s() {
        this.T = "+" + this.N + this.L;
        ((TextView) findViewById(2131755932)).setText(getString(2131231796));
        ((TextView) findViewById(2131755939)).setText(getString(2131231795));
        findViewById(2131755940).setVisibility(8);
        findViewById(2131755943).setVisibility(8);
        findViewById(2131755939).setVisibility(0);
        findViewById(2131755934).setVisibility(8);
        showDialog(37);
    }

    private void j() {
        if (this.x == null) {
            IntentFilter intentFilter = new IntentFilter(U[97]);
            intentFilter.setPriority(Integer.MAX_VALUE);
            registerReceiver(this.G, intentFilter);
            this.x = this.G;
        }
    }

    private void n() {
        try {
            if (this.y != null) {
                this.y.cancel();
                this.y = null;
                t();
                ((ProgressBar) findViewById(2131755937)).setProgress(100);
                ((TextView) findViewById(2131755939)).setText(getString(2131232198, new Object[]{Integer.valueOf(I)}));
                this.v = false;
                this.K.setEnabled(true);
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        try {
            switch (menuItem.getItemId()) {
                case v.m /*0*/:
                    p();
                    return true;
                case at.g /*1*/:
                    showDialog(32);
                    return true;
                case at.i /*2*/:
                    App.l((Context) this);
                    y();
                    I();
                    t();
                    finish();
                    return true;
                default:
                    return super.onOptionsItemSelected(menuItem);
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
        throw e;
    }

    private void I() {
        Editor edit = getPreferences(0).edit();
        try {
            edit.remove(U[16]);
            if (!edit.commit()) {
                Log.e(U[17]);
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    static void a(VerifySms verifySms, boolean z) {
        verifySms.c(z);
    }

    static void b(VerifySms verifySms, long j) {
        verifySms.c(j);
    }

    private String H() {
        long j = -1;
        long o = o();
        long currentTimeMillis = System.currentTimeMillis();
        if (o != -1) {
            j = o - currentTimeMillis;
        }
        Log.i(U[81] + j);
        if (o > currentTimeMillis) {
            String string = getString(2131231777, new Object[]{getString(2131232208), cs.f(this, j)});
            if (!DialogToastActivity.f) {
                return string;
            }
        }
        return getString(2131231776, new Object[]{getString(2131232208)});
    }

    static void o(VerifySms verifySms) {
        verifySms.C();
    }

    private long o() {
        return getPreferences(0).getLong(U[77], -1);
    }

    private void c() {
        try {
            startActivity(new Intent(U[1], Uri.parse(new StringBuilder(U[5]).append('?').append(U[2]).append(U[3]).append('&').append(U[4]).append(aqu.c()).append('&').append(U[6]).append(aqu.g()).toString())));
        } catch (ActivityNotFoundException e) {
            App.a((Context) this, 2131230782, 0);
        }
    }

    private void p() {
        try {
            if (this.T != null) {
                super.a(U[39] + this.T);
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            super.a(U[40]);
        } catch (ActivityNotFoundException e) {
            throw e;
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        try {
            if (App.j != 3 || i != 84) {
                return super.onKeyDown(i, keyEvent);
            }
            u.a((Activity) this, false);
            return true;
        } catch (ActivityNotFoundException e) {
            throw e;
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    static ImageButton q(VerifySms verifySms) {
        return verifySms.C;
    }

    private void F() {
        long B = B();
        if (B != -1) {
            B -= System.currentTimeMillis();
            if (B > 0) {
                try {
                    this.z.a(B);
                    if (!DialogToastActivity.f) {
                        return;
                    }
                } catch (ActivityNotFoundException e) {
                    throw e;
                }
            }
            I();
        }
    }

    static int k() {
        return B;
    }

    private void c(String str) {
        Editor edit = getPreferences(0).edit();
        try {
            edit.putString(U[86], str);
            edit.putString(U[89], this.N);
            edit.putString(U[87], this.L);
            if (!edit.commit()) {
                Log.w(U[88]);
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    private long z() {
        return getPreferences(0).getLong(U[78], -1);
    }

    static void c(VerifySms verifySms) {
        verifySms.y();
    }

    private String D() {
        long j = -1;
        long B = B();
        if (B != -1) {
            try {
                j = B - System.currentTimeMillis();
            } catch (ActivityNotFoundException e) {
                throw e;
            }
        }
        try {
            Log.i(U[0] + j);
            if (j > 0) {
                return getString(2131231772, new Object[]{getString(2131232215), cs.f(this, j)});
            }
            return getString(2131231771, new Object[]{getString(2131232215)});
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    static void b(VerifySms verifySms, String str) {
        verifySms.b(str);
    }

    static int b(int i) {
        O = i;
        return i;
    }

    static h7 f(VerifySms verifySms) {
        return verifySms.E;
    }

    static {
        String[] strArr = new String[arj.Theme_checkboxStyle];
        String str = "z\u0014c7\u0001u\u0002|-Hz\u001ex=\u0002!\u0003t*\u0015u\\e7\ni^u7\u0001j^";
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
                        i3 = 12;
                        break;
                    case at.g /*1*/:
                        i3 = 113;
                        break;
                    case at.i /*2*/:
                        i3 = 17;
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
            switch (z) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    i = 2;
                    str = "|\u001dp*\u0001c\u0003|c";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    str = "m\u001fu,\be\u0015";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "`\u0012,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "d\u0005e.\u00146^>)\u0010{_f6\u0006x\u0002p.\u0017\"\u0012~3Hj\u0010`q\u000be\u001fzq\u0011i\u0003x8\u000eo\u0010e7\bb_a6\u0017";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    str = "`\u0016,";
                    z = true;
                    i = 6;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    strArr2 = strArr3;
                    str = "z\u0014c7\u0001u\u0002|-Ho\u001dt?\u0015!\u0012~:\u0002!\u0007t,\u000ej\u0018r?\u0013e\u001e\u007fs\u0015i\u0005c'Jx\u0018|;Hi\u0003c1\u0015";
                    z = true;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "o\u001e|p\u0010d\u0010e-\u0006|\u0001?\b\u0002~\u0018w'4a\u0002?=\bh\u0014N(\u0002~\u0018w7\u0004m\u0005x1\tS\u0003t*\u0015u.e7\ni";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "e\u001fa+\u0013S\u001ct*\u000fc\u0015";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "z\u0014c7\u0001u\u0002|-H~\u0014`+\u0002\u007f\u0005<-\n\u007f";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "z\u0014c7\u0001u\u0002|-Hb\u0004|<\u0002~^x0J{\u0003~0\u0000!\u0002e?\u0013iQs1\u0012b\u0012t~\u0013cQc;\u0000|\u0019~0\u0002";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    str = "*\u001fs-\u00177";
                    z = true;
                    i = 12;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    strArr2 = strArr3;
                    str = "z\u0014c7\u0001u\u0002|-Hh\u0014b*\u0015c\b";
                    z = true;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "z\u0014c7\u0001u\u0002|-Ho\u001dt?\u0015!\u0002|-J~\u0014e,\u001e!\u0005x3\u0002#\u0014c,\b~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "o\u001e|p\u0010d\u0010e-\u0006|\u0001?\b\u0002~\u0018w'4a\u0002?-\n\u007f.c;\u0016y\u0014b*8j\u0010x2\u0002h.c;\u0013~\bN*\u000ea\u0014";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "o\u001e|p\u0010d\u0010e-\u0006|\u0001?\b\u0002~\u0018w'4a\u0002?=\u0006`\u001dN=\by\u001fe:\b{\u001fN;\th.e7\ni";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    str = "z\u0014c7\u0001u\u0002|-Ho\u001dt?\u0015!\u0007~7\u0004i\\c;\u0013~\b<*\u000ea\u0014>;\u0015~\u001ec";
                    z = true;
                    i = 17;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    strArr2 = strArr3;
                    str = "o\u001e|p\u0010d\u0010e-\u0006|\u0001?\f\u0002k\u0018b*\u0002~!y1\ti_r2\u0002m\u0003N.\u000fc\u001ft\u0001\ty\u001cs;\u0015";
                    z = true;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "z\u0014c7\u0001u\u0002|-H~\u0014e+\u0015b\u0005~,\u0002k\u0001y1\ti^r6\u0006b\u0016t0\u0012a\u0013t,H\u007f\u0014e,\u0002k\u0007t,\u000ej\u0018t:";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "z\u0014c7\u0001u\u0002|-H|\u0010d-\u0002,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "o\u001e|p\u0010d\u0010e-\u0006|\u0001?\b\u0002~\u0018w'4a\u0002?(\u0002~\u0018w7\u0004m\u0005x1\tS\u0002e?\u0013i";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "z\u0014c7\u0001u\u0002|-H|\u0010d-\u0002#\u0012~3\ne\u000518\u0006e\u001dt:";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "z\u0014c7\u0001u\u0002|-H\u007f\u0010g;\u0014x\u0010e;Ho\u001e|3\u000exQw?\u000e`\u0014u";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "o\u001e|p\u0010d\u0010e-\u0006|\u0001?\b\u0002~\u0018w'4a\u0002?(\u0002~\u0018w7\u0004m\u0005x1\tS\u0002e?\u0013i";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "z\u0014c7\u0001u\u0002|-H\u007f\u0010g;\u0003o\u001eu;Ho\u001dt?\u0015#\u0012~3\ne\u000518\u0006e\u001dt:";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "o\u001e|p\u0010d\u0010e-\u0006|\u0001?\b\u0002~\u0018w'4a\u0002?-\n\u007f.r1\u0003i";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "o\u001e|p\u0010d\u0010e-\u0006|\u0001?\b\u0002~\u0018w'4a\u0002?-\n\u007f.r=";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "o\u001e|p\u0010d\u0010e-\u0006|\u0001?\b\u0002~\u0018w'4a\u0002?-\n\u007f.a6\bb\u0014N0\u0012a\u0013t,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "z\u0014c7\u0001u\u0002|-H\u007f\u001cbs\u0015i\u0005c'Jx\u0018|;Hh\u0018w8H";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "o\u001e|p\u0010d\u0010e-\u0006|\u0001?\b\u0002~\u0018w'4a\u0002?=\u0006`\u001dN=\by\u001fe:\b{\u001fN;\th.e7\ni";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "z\u0014c7\u0001u\u0002|-Hz\u0014c7\u0001e\u0012p*\u000ec\u001f}7\tg^g1\u000eo\u0014>=\bh\u0014<;\tx\u0003hs\u0005`\u001er5\u0002h\\c;\u0013~\b<2\u0006x\u0014c";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "z\u0014c7\u0001u\u0002|-Hz\u0014c7\u0001e\u0012p*\u000ec\u001f}7\tg^g1\u000eo\u0014>-\u0013m\u0005t~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "d\u0005e.";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "d\u0005e.\u0014";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "z_f6\u0006x\u0002p.\u0017\"\u0012~3";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = "{\u0019p*\u0014m\u0001a";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    i = 37;
                    str = "z\u0014c7\u0001u\u0002|-Ho\u001eu;\u0001~\u001e|(\u0002~\u0018w7\u0004m\u0005x1\t`\u0018\u007f5Ho\u001eu;H";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeShareDrawable /*36*/:
                    strArr2[i] = str;
                    i = 38;
                    str = "z\u0014c7\u0001u\u0002|-Ho\u001eu;\u0001~\u001e|(\u0002~\u0018w7\u0004m\u0005x1\t`\u0018\u007f5Ho\u001eu;H";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeFindDrawable /*37*/:
                    strArr2[i] = str;
                    i = 39;
                    str = "z\u0014c7\u0001u\\g1\u000eo\u0014%~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeWebSearchDrawable /*38*/:
                    strArr2[i] = str;
                    i = 40;
                    str = "z\u0014c7\u0001u\\b3\u0014";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePopupWindowStyle /*39*/:
                    strArr2[i] = str;
                    i = 41;
                    str = "o\u0012";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceLargePopupMenu /*40*/:
                    strArr2[i] = str;
                    i = 42;
                    str = "d\u0005e.";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSmallPopupMenu /*41*/:
                    strArr2[i] = str;
                    i = 43;
                    str = "z\u001ex=\u0002";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogTheme /*42*/:
                    strArr2[i] = str;
                    i = 44;
                    str = "z\u0014c7\u0001u\u0002|-Ho\u0003t?\u0013i";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dialogPreferredPadding /*43*/:
                    strArr2[i] = str;
                    i = 45;
                    str = "\u007f\u001cb\u0001\u0015i\u0005c'8x\u0018|;";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listDividerAlertDialog /*44*/:
                    strArr2[i] = str;
                    i = 46;
                    str = "{\u0019p*\u0014m\u0001a";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionDropDownStyle /*45*/:
                    strArr2[i] = str;
                    i = 47;
                    str = "z\u0014c7\u0001u\u0002|-H{\u0003~0\u0000!\u0002e?\u0013iQs1\u0012b\u0012t~\u0013cQ|?\u000ebQ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropdownListPreferredItemHeight /*46*/:
                    strArr2[i] = str;
                    i = 48;
                    str = "~\u0014e,\u000ei\u0015";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_spinnerDropDownItemStyle /*47*/:
                    strArr2[i] = str;
                    i = 49;
                    str = "z\u0014c7\u0001u\u0002|-Ho\u0003t?\u0013i^b-\u0002b\u0015";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_homeAsUpIndicator /*48*/:
                    strArr2[i] = str;
                    i = 50;
                    str = "z\u001ex=\u0002S\u0003t*\u0015u.e7\ni";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionButtonStyle /*49*/:
                    strArr2[i] = str;
                    i = 51;
                    str = "o\u001e|p\u0010d\u0010e-\u0006|\u0001?\f\u0002k\u0018b*\u0002~!y1\ti_e?\u0017|\u0014u\u0001\u0014a\u0002N2\u000eb\u001a";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarStyle /*50*/:
                    strArr2[i] = str;
                    i = 52;
                    str = "z\u0014c7\u0001u\u0002|-Ho\u0003t?\u0013i^r1\u0003iQ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarButtonStyle /*51*/:
                    strArr2[i] = str;
                    i = 53;
                    str = "z\u0014c7\u0001u\u0002|-Ho\u0003t?\u0013i^b?\u0011i\u0015r1\u0003iQ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackground /*52*/:
                    strArr2[i] = str;
                    i = 54;
                    str = "d\u0005e.\u0014";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_selectableItemBackgroundBorderless /*53*/:
                    strArr2[i] = str;
                    i = 55;
                    str = "|\u0019";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_borderlessButtonStyle /*54*/:
                    strArr2[i] = str;
                    i = 56;
                    str = "z\u0014c7\u0001u\u0002|-Ho\u0003t?\u0013i^r=Gc\u000310\u0012aQx-Ga\u0018b-\u000eb\u0016=~\u0005c\u0004\u007f=\u0002,\u0005~~\u0015i\u0016a6\bb\u0014";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerVertical /*55*/:
                    strArr2[i] = str;
                    i = 57;
                    str = "z\u0014c7\u0001u\u0002|-Ho\u0003t?\u0013i^u7\u0014|\u001dp'J~\u001ep3\u000eb\u0016";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dividerHorizontal /*56*/:
                    strArr2[i] = str;
                    i = 58;
                    str = "\u007f\u001cb";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_activityChooserViewStyle /*57*/:
                    strArr2[i] = str;
                    i = 59;
                    str = "o\u0019p0\u0000i\u001fd3\u0005i\u0003";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarStyle /*58*/:
                    strArr2[i] = str;
                    i = 60;
                    str = "~\u001ep3\u000eb\u0016";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_toolbarNavigationButtonStyle /*59*/:
                    strArr2[i] = str;
                    i = 61;
                    str = "o\u001e|p\u0010d\u0010e-\u0006|\u0001N.\u0015i\u0017t,\u0002b\u0012t-";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupMenuStyle /*60*/:
                    strArr2[i] = str;
                    i = 62;
                    str = "z\u0014c7\u0001u\u0002|-H\u007f\u0010g;Jz\u001ex=\u0002!\u0003t*\u0015u\\e7\ni^t,\u0015c\u0003";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_popupWindowStyle /*61*/:
                    strArr2[i] = str;
                    i = 63;
                    str = "o\u001e|p\u0010d\u0010e-\u0006|\u0001?\b\u0002~\u0018w'4a\u0002?=\u0006`\u001dN=\by\u001fe:\b{\u001fN;\th.e7\ni";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextColor /*62*/:
                    strArr2[i] = str;
                    i = 64;
                    str = "z\u0014c7\u0001u\u0002|-He\u001fe;\tx";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_editTextBackground /*63*/:
                    strArr2[i] = str;
                    i = 65;
                    str = "z\u0014c7\u0001u\u0002|-He\u001fe;\tx^d0\fb\u001ef0G";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_imageButtonStyle /*64*/:
                    strArr2[i] = str;
                    i = 66;
                    str = "o\u001e|p\u0010d\u0010e-\u0006|\u0001?(\u0002~\u0018w'\ty\u001cs;\u0015\"\u0015x?\u000bc\u0016";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultTitle /*65*/:
                    strArr2[i] = str;
                    i = 67;
                    str = "z\u0014c7\u0001u\u0002|-He\u001fe;\tx^u;\u0001i\u0003<=\bh\u0014>";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceSearchResultSubtitle /*66*/:
                    strArr2[i] = str;
                    i = 68;
                    str = "z\u0014c7\u0001u\u0002|-Hi\u0015x*Gb\u0004|<\u0002~Q}7\tgQw1\u0012b\u0015";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorSearchUrl /*67*/:
                    strArr2[i] = str;
                    i = 69;
                    str = "i\u0015x*Jb\u0004|<\u0002~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_searchViewStyle /*68*/:
                    strArr2[i] = str;
                    i = 70;
                    str = "^\u0014b;\u0013";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeight /*69*/:
                    strArr2[i] = str;
                    i = 71;
                    str = "o\u001e|p\u0010d\u0010e-\u0006|\u0001?\b\u0002~\u0018w'4a\u0002?-\n\u007f.r=";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightSmall /*70*/:
                    strArr2[i] = str;
                    i = 72;
                    str = "o\u001e|p\u0010d\u0010e-\u0006|\u0001?\b\u0002~\u0018w'4a\u0002?-\n\u007f.a6\bb\u0014N0\u0012a\u0013t,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemHeightLarge /*71*/:
                    strArr2[i] = str;
                    i = 73;
                    str = "o\u001e|p\u0010d\u0010e-\u0006|\u0001?\b\u0002~\u0018w'4a\u0002?-\n\u007f.r1\u0003i";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingLeft /*72*/:
                    strArr2[i] = str;
                    i = 74;
                    str = "z\u0014c7\u0001u\u0002|-Hz\u0014c7\u0001e\u0014uq\u0004d\u0010\u007f9\u0002b\u0004|<\u0002~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPreferredItemPaddingRight /*73*/:
                    strArr2[i] = str;
                    i = 75;
                    str = "z\u0014c7\u0001u\u0002|-Hz\u0014c7\u0001e\u0014uq\u0004d\u0010\u007f9\u0002b\u0004|<\u0002~^b;\u0013~\u0014v(\u0002~\u0018w7\u0002h";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_dropDownListViewStyle /*74*/:
                    strArr2[i] = str;
                    i = 76;
                    str = "z\u0014c7\u0001u\u0002|-Hz\u0014c7\u0001e\u0014uq\u0004d\u0010\u007f9\u0002b\u0004|<\u0002~^|-\u0000\u007f\u0005~,\u0002h\u0013>6\u0002m\u001de6\u001e";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listPopupWindowStyle /*75*/:
                    strArr2[i] = str;
                    i = 77;
                    str = "o\u001e|p\u0010d\u0010e-\u0006|\u0001?\b\u0002~\u0018w'4a\u0002?-\n\u007f.c;\u0016y\u0014b*8j\u0010x2\u0002h.c;\u0013~\bN*\u000ea\u0014";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItem /*76*/:
                    strArr2[i] = str;
                    i = 78;
                    str = "o\u001e|p\u0010d\u0010e-\u0006|\u0001?\b\u0002~\u0018w'4a\u0002?=\bh\u0014N(\u0002~\u0018w7\u0004m\u0005x1\tS\u0003t*\u0015u.e7\ni";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textAppearanceListItemSmall /*77*/:
                    strArr2[i] = str;
                    i = 79;
                    str = "o\u001e|p\u0010d\u0010e-\u0006|\u0001?\b\u0002~\u0018w'4a\u0002?=\bh\u0014N(\u0002~\u0018w7\u0004m\u0005x1\tS\u0003t*\u0015u.e7\ni";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelBackground /*78*/:
                    strArr2[i] = str;
                    i = 80;
                    str = "z\u0014c7\u0001u\u0002|-H\u007f\u0010g;Jo\u001eu;Jz\u0014c7\u0001e\u0012p*\u000ec\u001f<,\u0002x\u0003hs\u0013e\u001ctq\u0002~\u0003~,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListWidth /*79*/:
                    strArr2[i] = str;
                    i = 81;
                    str = "z\u0014c7\u0001u\u0002|-H\u007f\u001cbs\u0015i\u0005c'Jx\u0018|;Hh\u0018w8H";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_panelMenuListTheme /*80*/:
                    strArr2[i] = str;
                    i = 82;
                    str = "z\u0014c7\u0001u\u0002|-H~\u0014b+\ni^r=Gc\u000310\u0012aQx-Ga\u0018b-\u000eb\u0016=~\u0005c\u0004\u007f=\u0002,\u0005~~\u0015i\u0016a6\bb\u0014";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_listChoiceBackgroundIndicator /*81*/:
                    strArr2[i] = str;
                    i = 83;
                    str = "o\u001e|p\u0010d\u0010e-\u0006|\u0001?\b\u0002~\u0018w'4a\u0002?(\u0002~\u0018w7\u0004m\u0005x1\tS\u0002e?\u0013i";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimary /*82*/:
                    strArr2[i] = str;
                    i = 84;
                    str = "z\u0014c7\u0001u\u0002|-H~\u0014b+\niQ";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorPrimaryDark /*83*/:
                    strArr2[i] = str;
                    i = 85;
                    str = "z\u0014c7\u0001u\u0002|-H~\u0014b+\ni^b=\u000fi\u001ctq\u0004c\u0015t~";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorAccent /*84*/:
                    strArr2[i] = str;
                    i = 86;
                    str = "o\u001e|p\u0010d\u0010e-\u0006|\u0001?\b\u0002~\u0018w'4a\u0002?-\n\u007f.r1\u0003i";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlNormal /*85*/:
                    strArr2[i] = str;
                    i = 87;
                    str = "o\u001e|p\u0010d\u0010e-\u0006|\u0001?\b\u0002~\u0018w'4a\u0002?-\n\u007f.a6\bb\u0014N0\u0012a\u0013t,";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlActivated /*86*/:
                    strArr2[i] = str;
                    i = 88;
                    str = "z\u0014c7\u0001u\u0002|-H\u007f\u0010g;\u0003o\u001eu;H\u007f\u0010g;Ho\u001e|3\u000exQw?\u000e`\u0014u";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorControlHighlight /*87*/:
                    strArr2[i] = str;
                    i = 89;
                    str = "o\u001e|p\u0010d\u0010e-\u0006|\u0001?\b\u0002~\u0018w'4a\u0002?-\n\u007f.r=";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorButtonNormal /*88*/:
                    strArr2[i] = str;
                    i = 90;
                    str = "d\u0005e.\u00146^>)\u000fm\u0005b?\u0017|_r1\n#\u0010\u007f:\u0015c\u0018u";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_colorSwitchThumbNormal /*89*/:
                    strArr2[i] = str;
                    i = 91;
                    str = ",\u001ft)Z";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_controlBackground /*90*/:
                    strArr2[i] = str;
                    i = 92;
                    str = "z\u0014c7\u0001u\u0002|-Hb\u0014e)\b~\u001a>-\u0010e\u0005r6Gc\u001duc";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogStyle /*91*/:
                    strArr2[i] = str;
                    i = 93;
                    str = "z\u0014c7\u0001u\u0002|-Hb\u0014e)\b~\u001a>-\u0010e\u0005r6Hb\u001e<-\u0006z\u0014us\u0004c\u0015t";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogButtonGroupStyle /*92*/:
                    strArr2[i] = str;
                    str = "z\u0014c7\u0001u\u0002|-Hb\u0014e)\b~\u001a>?\u0004x\u0018g;G";
                    z = true;
                    i = 94;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_alertDialogCenterButtons /*93*/:
                    strArr2[i] = str;
                    i = 95;
                    strArr2 = strArr3;
                    str = "o\u001e\u007f0\u0002o\u0005x(\u000ex\b";
                    z = true;
                    break;
                case arj.Theme_alertDialogTheme /*94*/:
                    strArr2[i] = str;
                    i = 96;
                    str = "z\u0014c7\u0001u\u0002|-Hb\u0014e)\b~\u001a>-\u0010e\u0005r6Hd\u0010bs\u0015i\u0005c'J|\u0014\u007f:\u000eb\u0016";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_textColorAlertDialogListItem /*95*/:
                    strArr2[i] = str;
                    i = 97;
                    str = "m\u001fu,\be\u0015?.\u0015c\u0007x:\u0002~_E;\u000bi\u0001y1\tu_B\u00134S#T\u001d\"E'T\u001a";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarPositiveButtonStyle /*96*/:
                    strArr2[i] = str;
                    i = 98;
                    str = "o\u001e|p\u0010d\u0010e-\u0006|\u0001?\b\u0002~\u0018w'4a\u0002?-\n\u007f.c;\u0016y\u0014b*8j\u0010x2\u0002h.c;\u0013~\bN*\u000ea\u0014";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNegativeButtonStyle /*97*/:
                    strArr2[i] = str;
                    i = 99;
                    str = "z\u0014c7\u0001u\u0002|-H\u007f\u0010g;J\u007f\u001cbs\u0015i\u0005c'Jx\u0018|;Hi\u0003c1\u0015";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonBarNeutralButtonStyle /*98*/:
                    strArr2[i] = str;
                    i = 100;
                    str = "z\u0014c7\u0001u\u0002|-H\u007f\u0010g;J\u007f\u001cbs\u0015i\u0005c'Jx\u0018|;H";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_autoCompleteTextViewStyle /*99*/:
                    strArr2[i] = str;
                    i = arj.Theme_buttonStyleSmall;
                    str = "z\u0014c7\u0001u\u0002|-Hz\u001ex=\u0002!\u0003t*\u0015u\\e7\ni^u7\u0001j^";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_buttonStyle /*100*/:
                    strArr2[i] = str;
                    U = strArr3;
                    O = 0;
                    B = 6;
                    I = 6;
                    Q = null;
                    J = false;
                    return;
                default:
                    strArr2[i] = str;
                    i = 1;
                    strArr2 = strArr3;
                    str = "m\u001fu,\be\u0015?7\tx\u0014\u007f*Im\u0012e7\bb_G\u0017\"[";
                    z = false;
                    break;
            }
        }
    }

    static void n(VerifySms verifySms) {
        verifySms.J();
    }

    static boolean c(VerifySms verifySms, boolean z) {
        verifySms.v = z;
        return z;
    }

    private void y() {
        Editor edit = getPreferences(0).edit();
        try {
            edit.remove(U[15]);
            if (!edit.commit()) {
                Log.e(U[14]);
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    private void t() {
        Editor edit = getPreferences(0).edit();
        try {
            edit.remove(U[8]);
            if (!edit.commit()) {
                Log.e(U[7]);
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    static h7 a(VerifySms verifySms) {
        return verifySms.z;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        try {
            menu.add(0, 0, 0, 2131231750).setIcon(2130839514);
            if (App.am == 3) {
                menu.add(0, 2, 0, U[70]);
            }
            return super.onCreateOptionsMenu(menu);
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void r() {
        /*
        r9 = this;
        r8 = 2131755939; // 0x7f1003a3 float:1.9142771E38 double:1.053227375E-314;
        r7 = 1;
        r1 = 0;
        r2 = com.whatsapp.DialogToastActivity.f;
        r0 = r9.N;
        r3 = r9.L;
        r0 = com.whatsapp.VerifyNumber.b(r0, r3);
        r3 = com.whatsapp.aam.a(r0);
        r0 = r9.getSupportActionBar();
        if (r0 == 0) goto L_0x0029;
    L_0x0019:
        r4 = 2131232213; // 0x7f0805d5 float:1.8080529E38 double:1.05296862E-314;
        r5 = 1;
        r5 = new java.lang.Object[r5];	 Catch:{ ActivityNotFoundException -> 0x0104 }
        r6 = 0;
        r5[r6] = r3;	 Catch:{ ActivityNotFoundException -> 0x0104 }
        r4 = r9.getString(r4, r5);	 Catch:{ ActivityNotFoundException -> 0x0104 }
        r0.setTitle(r4);	 Catch:{ ActivityNotFoundException -> 0x0104 }
    L_0x0029:
        r0 = 2131755940; // 0x7f1003a4 float:1.9142773E38 double:1.0532273753E-314;
        r4 = r9.findViewById(r0);	 Catch:{ ActivityNotFoundException -> 0x0106 }
        r0 = r9.c();	 Catch:{ ActivityNotFoundException -> 0x0106 }
        if (r0 == 0) goto L_0x0108;
    L_0x0036:
        r0 = r1;
    L_0x0037:
        r4.setVisibility(r0);
        r0 = 2131755943; // 0x7f1003a7 float:1.914278E38 double:1.053227377E-314;
        r0 = r9.findViewById(r0);
        r0.setVisibility(r1);
        r0 = 2131755931; // 0x7f10039b float:1.9142755E38 double:1.053227371E-314;
        r0 = r9.findViewById(r0);
        r0.setVisibility(r1);
        r0 = r9.findViewById(r8);
        r0 = (android.widget.TextView) r0;
        r4 = 2131232198; // 0x7f0805c6 float:1.8080498E38 double:1.0529686123E-314;
        r5 = new java.lang.Object[r7];
        r6 = I;
        r6 = java.lang.Integer.valueOf(r6);
        r5[r1] = r6;
        r4 = r9.getString(r4, r5);
        r0.setText(r4);
        r0 = r9.findViewById(r8);
        r0.setVisibility(r1);
        r0 = 2131755934; // 0x7f10039e float:1.9142761E38 double:1.0532273723E-314;
        r0 = r9.findViewById(r0);
        r0.setVisibility(r1);
        r0 = 2131755932; // 0x7f10039c float:1.9142757E38 double:1.0532273713E-314;
        r0 = r9.findViewById(r0);
        r0 = (android.widget.TextView) r0;
        if (r3 == 0) goto L_0x010e;
    L_0x0084:
        r1 = " ";
        r4 = U;	 Catch:{ ActivityNotFoundException -> 0x010c }
        r5 = 12;
        r4 = r4[r5];	 Catch:{ ActivityNotFoundException -> 0x010c }
        r1 = r3.replaceAll(r1, r4);	 Catch:{ ActivityNotFoundException -> 0x010c }
    L_0x0091:
        r4 = java.lang.System.currentTimeMillis();
        r6 = r9.o();	 Catch:{ ActivityNotFoundException -> 0x0110 }
        r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1));
        if (r3 <= 0) goto L_0x00d5;
    L_0x009d:
        r6 = r9.B();	 Catch:{ ActivityNotFoundException -> 0x0112 }
        r4 = r6 - r4;
        r6 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;
        r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r3 >= 0) goto L_0x00bf;
    L_0x00a9:
        r3 = 2131232211; // 0x7f0805d3 float:1.8080525E38 double:1.052968619E-314;
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ ActivityNotFoundException -> 0x0114 }
        r5 = 0;
        r4[r5] = r1;	 Catch:{ ActivityNotFoundException -> 0x0114 }
        r3 = r9.getString(r3, r4);	 Catch:{ ActivityNotFoundException -> 0x0114 }
        r3 = r9.d(r3);	 Catch:{ ActivityNotFoundException -> 0x0114 }
        r0.setText(r3);	 Catch:{ ActivityNotFoundException -> 0x0114 }
        if (r2 == 0) goto L_0x00e9;
    L_0x00bf:
        r3 = 2131232212; // 0x7f0805d4 float:1.8080527E38 double:1.0529686193E-314;
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ ActivityNotFoundException -> 0x0116 }
        r5 = 0;
        r4[r5] = r1;	 Catch:{ ActivityNotFoundException -> 0x0116 }
        r3 = r9.getString(r3, r4);	 Catch:{ ActivityNotFoundException -> 0x0116 }
        r3 = r9.d(r3);	 Catch:{ ActivityNotFoundException -> 0x0116 }
        r0.setText(r3);	 Catch:{ ActivityNotFoundException -> 0x0116 }
        if (r2 == 0) goto L_0x00e9;
    L_0x00d5:
        r2 = 2131232210; // 0x7f0805d2 float:1.8080523E38 double:1.0529686183E-314;
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ ActivityNotFoundException -> 0x0116 }
        r4 = 0;
        r3[r4] = r1;	 Catch:{ ActivityNotFoundException -> 0x0116 }
        r1 = r9.getString(r2, r3);	 Catch:{ ActivityNotFoundException -> 0x0116 }
        r1 = r9.d(r1);	 Catch:{ ActivityNotFoundException -> 0x0116 }
        r0.setText(r1);	 Catch:{ ActivityNotFoundException -> 0x0116 }
    L_0x00e9:
        r1 = com.whatsapp.App.j;	 Catch:{ ActivityNotFoundException -> 0x0118 }
        r2 = 3;
        if (r1 != r2) goto L_0x00f6;
    L_0x00ee:
        r1 = new com.whatsapp.ql;	 Catch:{ ActivityNotFoundException -> 0x0118 }
        r1.<init>(r9);	 Catch:{ ActivityNotFoundException -> 0x0118 }
        r0.setOnClickListener(r1);	 Catch:{ ActivityNotFoundException -> 0x0118 }
    L_0x00f6:
        r1 = android.text.method.LinkMovementMethod.getInstance();
        r0.setMovementMethod(r1);
        r0 = r9.C;
        r1 = 4;
        r0.setVisibility(r1);
        return;
    L_0x0104:
        r0 = move-exception;
        throw r0;
    L_0x0106:
        r0 = move-exception;
        throw r0;
    L_0x0108:
        r0 = 8;
        goto L_0x0037;
    L_0x010c:
        r0 = move-exception;
        throw r0;
    L_0x010e:
        r1 = 0;
        goto L_0x0091;
    L_0x0110:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0112 }
    L_0x0112:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0114 }
    L_0x0114:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0116 }
    L_0x0116:
        r0 = move-exception;
        throw r0;
    L_0x0118:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.VerifySms.r():void");
    }

    static String e(VerifySms verifySms) {
        return verifySms.v();
    }

    static int m() {
        return I;
    }

    @NonNull
    private SpannableStringBuilder d(String str) {
        int i = 0;
        boolean z = DialogToastActivity.f;
        Spanned fromHtml = Html.fromHtml(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fromHtml);
        URLSpan[] uRLSpanArr = (URLSpan[]) fromHtml.getSpans(0, fromHtml.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            int length = uRLSpanArr.length;
            while (i < length) {
                URLSpan uRLSpan = uRLSpanArr[i];
                if (U[69].equals(uRLSpan.getURL())) {
                    Log.i(U[68]);
                    int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                    int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                    int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(new auw(this), spanStart, spanEnd, spanFlags);
                }
                i++;
                if (z) {
                    break;
                }
            }
        }
        return spannableStringBuilder;
    }
}
