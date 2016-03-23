package com.whatsapp;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.support.v7.app.AlertDialog.Builder;
import android.text.TextUtils;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class Main extends VerifyMessageStoreActivity {
    private static boolean o;
    private static final String[] z;
    private boolean p;
    private long q;
    private ce r;
    private Uri s;
    private fl t;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onCreate(android.os.Bundle r9) {
        /*
        r8 = this;
        r1 = 1;
        r2 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = z;
        r4 = 14;
        r0 = r0[r4];
        r0 = com.whatsapp.tp.a(r0);
        r8.r = r0;
        r0 = r8.r;
        r4 = r8.q;
        r0.b(r4);
        r0 = r8.r;
        r4 = com.whatsapp.t4.PRE_CREATE;
        r6 = r8.q;
        r0.a(r4, r6);
        r0 = r8.r;
        r4 = com.whatsapp.t4.PRE_CREATE;
        r0.a(r4);
        r0 = r8.r;
        r4 = com.whatsapp.t4.ON_CREATE;
        r0.b(r4);
        r4 = r8.r;
        r5 = com.whatsapp.tb.FROM_SAVED_STATE;
        if (r9 == 0) goto L_0x0066;
    L_0x0034:
        r0 = r1;
    L_0x0035:
        r4.a(r5, r0);
        r0 = r8.r;
        r4 = com.whatsapp.tb.FIRST_INIT;
        r5 = o;
        r0.a(r4, r5);
        o = r2;
        r8.b(r2);
        super.onCreate(r9);
        r0 = z;
        r4 = 11;
        r0 = r0[r4];
        com.whatsapp.util.Log.i(r0);
        r0 = 0;
        r0 = com.whatsapp.util.WhatsAppLibLoader.a(r0);
        if (r0 != 0) goto L_0x0068;
    L_0x0059:
        r0 = z;
        r1 = 16;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r8.finish();
    L_0x0065:
        return;
    L_0x0066:
        r0 = r2;
        goto L_0x0035;
    L_0x0068:
        r0 = com.whatsapp.App.U();
        if (r0 == 0) goto L_0x0079;
    L_0x006e:
        r0 = r8.isFinishing();
        if (r0 != 0) goto L_0x0065;
    L_0x0074:
        r0 = 3;
        r8.showDialog(r0);
        goto L_0x0065;
    L_0x0079:
        r0 = com.whatsapp.App.t(r8);
        r4 = com.whatsapp.App.ay;
        if (r4 != 0) goto L_0x00b0;
    L_0x0081:
        if (r0 != 0) goto L_0x00b0;
    L_0x0083:
        r0 = r8.isFinishing();
        if (r0 != 0) goto L_0x0065;
    L_0x0089:
        r0 = new android.content.Intent;
        r3 = com.whatsapp.EULA.class;
        r0.<init>(r8, r3);
        r3 = r8.getIntent();
        r4 = z;
        r5 = 13;
        r4 = r4[r5];
        r2 = r3.getBooleanExtra(r4, r2);
        if (r2 == 0) goto L_0x00a9;
    L_0x00a0:
        r2 = z;
        r3 = 15;
        r2 = r2[r3];
        r0.putExtra(r2, r1);
    L_0x00a9:
        r8.startActivity(r0);
        r8.finish();
        goto L_0x0065;
    L_0x00b0:
        r4 = 6;
        if (r0 != r4) goto L_0x00c7;
    L_0x00b3:
        r0 = r8.isFinishing();
        if (r0 != 0) goto L_0x0065;
    L_0x00b9:
        r0 = new android.content.Intent;
        r1 = com.whatsapp.DeleteAccountConfirmation.class;
        r0.<init>(r8, r1);
        r8.startActivity(r0);
        r8.finish();
        goto L_0x0065;
    L_0x00c7:
        r0 = com.whatsapp.App.ay;
        if (r0 == 0) goto L_0x010d;
    L_0x00cb:
        r0 = com.whatsapp.App.aK;
        r0 = r0.E();
        if (r0 != 0) goto L_0x010d;
    L_0x00d3:
        r0 = r8.a();
        if (r0 == 0) goto L_0x0105;
    L_0x00d9:
        r0 = com.whatsapp.App.aK;
        r0 = r0.F();
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r6 = 12;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r4 = r4.append(r0);
        r4 = r4.toString();
        com.whatsapp.util.Log.i(r4);
        if (r0 <= 0) goto L_0x0102;
    L_0x00fb:
        r0 = 105; // 0x69 float:1.47E-43 double:5.2E-322;
        r8.showDialog(r0);
        if (r3 == 0) goto L_0x0105;
    L_0x0102:
        r8.c(r2);
    L_0x0105:
        r8.b(r1);
        r8.g();
        if (r3 == 0) goto L_0x0110;
    L_0x010d:
        r8.b();
    L_0x0110:
        r0 = r8.r;
        r1 = com.whatsapp.t4.ON_CREATE;
        r0.a(r1);
        r0 = r8.r;
        r0.d();
        r0 = r8.p;
        if (r0 == 0) goto L_0x0065;
    L_0x0120:
        r0 = com.whatsapp.a42.a();
        r0.b();
        goto L_0x0065;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Main.onCreate(android.os.Bundle):void");
    }

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case v.m /*0*/:
                Log.i(z[17]);
                return new Builder(this).setTitle(2131232190).setMessage(2131232189).setCancelable(false).setPositiveButton(2131232298, new a45(this)).setNeutralButton(2131231578, new arh(this)).setNegativeButton(2131231390, new a50(this)).create();
            case at.g /*1*/:
                Log.i(z[18]);
                return new Builder(this).setTitle(2131230798).setCancelable(false).setMessage(2131231798).setPositiveButton(2131231580, new ep(this)).create();
            case at.i /*2*/:
                Log.i(z[19]);
                return new Builder(this).setTitle(2131230798).setCancelable(false).setMessage(2131231416).setPositiveButton(2131231580, new azz(this)).create();
            case at.o /*3*/:
                Log.i(z[20]);
                return new Builder(this).setTitle(2131232306).setCancelable(false).setMessage(2131231069).setPositiveButton(2131231580, new aem(this)).create();
            default:
                return super.onCreateDialog(i);
        }
    }

    static {
        String[] strArr = new String[28];
        String str = "{\u000f6\u001aq`\u000b-\u001d8\u007f\u000b;[-s\u001a-\u00119`\u000b-\u001d8\u007f\u000b;";
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
                        i3 = 22;
                        break;
                    case at.g /*1*/:
                        i3 = 110;
                        break;
                    case at.i /*2*/:
                        i3 = 95;
                        break;
                    case at.o /*3*/:
                        i3 = 116;
                        break;
                    default:
                        i3 = 94;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "{\u000f6\u001aqx\u0001r\u0019;9\u001c:\u00130w\u0003:";
                    i = 2;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "{\u000f6\u001aqq\u0001+\u001b\u001fu\u001a6\u00027b\u0017";
                    i = 3;
                    strArr2 = strArr3;
                    z = true;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "{\u000f6\u001aq{\u000b\u007f5.f@2\u0011~\u007f\u001d\u007f\u001a+z\u0002sT=w\u0000x\u0000~f\u001c0\u0017;s\nq";
                    z = true;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "e\u00060\u0003\u0001d\u000b8\u001d-b\u001c>\u00007y\u0000\u0000\u00127d\u001d++:z\t";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "u\u0006>\u001a9s\u0000*\u0019<s\u001c";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "{\u000f6\u001aq\u007f\u0000)\u00152\u007f\np\u0006;q\u0007,\u0000,w\u001a6\u001b06\u001d+\u0015*sS";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "{\u000f6\u001aqe\u00060\u0003~r\u0007>\u00181qN,\r0u";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "e\u00060\u0003\u0001d\u000b8\u001d-b\u001c>\u00007y\u0000\u0000\u00127d\u001d++:z\t";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "{\u000f6\u001aq{\u000bp\u0006;q\u0000>\u0019;";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "{\u000f6\u001aqu\u001c:\u0015*s";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "{\u000f6\u001aqu\u001c:\u0015*sA=\u0015=}\u001b/\u00127z\u000b,\u00121c\u0000;T";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "e\u00060\u0003\u0001d\u000b8\u001d-b\u001c>\u00007y\u0000\u0000\u00127d\u001d++:z\t";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "[\u000f6\u001a\u001fu\u001a6\u00027b\u0017\u0016\u001a7b";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "e\u00060\u0003\u0001d\u000b8\u001d-b\u001c>\u00007y\u0000\u0000\u00127d\u001d++:z\t";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "w\f0\u0006*\u007f\u00008T:c\u000b\u007f\u000016\u0000>\u00007`\u000b\u007f\u00187t\u001c>\u00067s\u001d\u007f\u00197e\u001d6\u001a9";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "{\u000f6\u001aqr\u0007>\u00181qA*\u00049d\u000f;\u0011";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "{\u000f6\u001aqr\u0007>\u00181qA/\u0015-e\u00190\u0006:";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "{\u000f6\u001aqr\u0007>\u00181qA,\u001c+b\n0\u00030";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "{\u000f6\u001aqr\u0007>\u00181qA*\u001a-c\u001e/\u001b,b\u000b;";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "e\u00060\u0006*u\u001b++(s\u001c,\u001d1x";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    str = "u\u00012Z)~\u000f+\u0007?f\u001e\u0000\u0004,s\b:\u0006;x\r:\u0007";
                    z = true;
                    i = 22;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    strArr2 = strArr3;
                    str = "|\u0007;";
                    z = true;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "w\u0000;\u00061\u007f\nq\u001d0b\u000b1\u0000pw\r+\u001d1x@\u00125\u0017X";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "{\u000f6\u001aqd\u000b<\u0006;w\u001a:+-~\u0001-\u0000=c\u001a";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "e\u00060\u0006*u\u001b++(s\u001c,\u001d1x";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "|\u0007;";
                    z = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    z = strArr3;
                    o = true;
                    return;
                default:
                    strArr2[i] = str;
                    str = "-N;\u00118w\u001b3\u0000~b\u0001\u007f1\u000bZ/";
                    i = 1;
                    strArr2 = strArr3;
                    z = false;
                    break;
            }
        }
    }

    static Uri b(Main main) {
        return main.s;
    }

    private void d() {
        if (!isFinishing()) {
            Intent intent = getIntent();
            if (!(intent == null || z[24].equals(intent.getAction()) || (intent.getFlags() & 67108864) == 0 || intent.hasExtra(z[23]))) {
                SharedPreferences sharedPreferences = getSharedPreferences(z[22], 0);
                if (sharedPreferences != null && sharedPreferences.getInt(z[21], 0) == 0) {
                    Log.i(z[25]);
                    RegisterName.a(this, getString(2131232306), 0);
                    RegisterName.a((Context) this, getString(2131232306));
                    Editor edit = sharedPreferences.edit();
                    edit.putInt(z[26], 1);
                    edit.commit();
                }
            }
            startActivity(new Intent(this, e()));
            finish();
            this.p = true;
        }
    }

    public static Class e() {
        return HomeActivity.class;
    }

    static void c(Main main) {
        main.d();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void b() {
        /*
        r7 = this;
        r3 = 3;
        r2 = 2;
        r6 = 1;
        r5 = 0;
        r1 = com.whatsapp.DialogToastActivity.f;
        super.b();
        r0 = com.whatsapp.App.ay;
        if (r0 != 0) goto L_0x00c2;
    L_0x000d:
        r0 = r7.isFinishing();
        if (r0 != 0) goto L_0x0055;
    L_0x0013:
        r0 = com.whatsapp.App.t(r7);
        switch(r0) {
            case 0: goto L_0x005e;
            case 1: goto L_0x007e;
            case 2: goto L_0x0089;
            case 3: goto L_0x001a;
            case 4: goto L_0x00a4;
            case 5: goto L_0x007e;
            case 6: goto L_0x00ba;
            default: goto L_0x001a;
        };
    L_0x001a:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r4 = 7;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r0 = r2.append(r0);
        r2 = z;
        r2 = r2[r6];
        r0 = r0.append(r2);
        r0 = r0.toString();
        com.whatsapp.util.Log.e(r0);
        com.whatsapp.App.d(r7, r5);
        r0 = new android.content.Intent;
        r2 = com.whatsapp.EULA.class;
        r0.<init>(r7, r2);
    L_0x0045:
        if (r0 == 0) goto L_0x004f;
    L_0x0047:
        r7.startActivity(r0);
        r7.finish();
        if (r1 == 0) goto L_0x0055;
    L_0x004f:
        r7.b(r6);
        r7.g();
    L_0x0055:
        r0 = z;
        r1 = 4;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
    L_0x005d:
        return;
    L_0x005e:
        r0 = new android.content.Intent;
        r2 = com.whatsapp.EULA.class;
        r0.<init>(r7, r2);
        r2 = r7.getIntent();
        r3 = z;
        r4 = 5;
        r3 = r3[r4];
        r2 = r2.getBooleanExtra(r3, r5);
        if (r2 == 0) goto L_0x0045;
    L_0x0074:
        r2 = z;
        r3 = 9;
        r2 = r2[r3];
        r0.putExtra(r2, r6);
        goto L_0x0045;
    L_0x007e:
        com.whatsapp.App.d(r7, r5);
        r0 = new android.content.Intent;
        r2 = com.whatsapp.EULA.class;
        r0.<init>(r7, r2);
        goto L_0x0045;
    L_0x0089:
        r0 = z;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        r0 = new android.content.Intent;
        r2 = com.whatsapp.RegisterName.class;
        r0.<init>(r7, r2);
        r2 = com.whatsapp.gdrive.GoogleDriveService.X();
        if (r2 == 0) goto L_0x0045;
    L_0x009d:
        r2 = 32768; // 0x8000 float:4.5918E-41 double:1.61895E-319;
        r0.setFlags(r2);
        goto L_0x0045;
    L_0x00a4:
        r0 = new android.content.Intent;
        r2 = com.whatsapp.VerifySms.class;
        r0.<init>(r7, r2);
        r2 = com.whatsapp.ChangeNumber.g();
        if (r2 == 0) goto L_0x0045;
    L_0x00b1:
        r2 = z;
        r3 = 6;
        r2 = r2[r3];
        r0.putExtra(r2, r6);
        goto L_0x0045;
    L_0x00ba:
        r0 = new android.content.Intent;
        r2 = com.whatsapp.DeleteAccountConfirmation.class;
        r0.<init>(r7, r2);
        goto L_0x0045;
    L_0x00c2:
        r0 = com.whatsapp.App.t(r7);
        if (r0 != r2) goto L_0x00e0;
    L_0x00c8:
        r0 = z;
        r1 = 10;
        r0 = r0[r1];
        com.whatsapp.util.Log.i(r0);
        r0 = new android.content.Intent;
        r1 = com.whatsapp.RegisterName.class;
        r0.<init>(r7, r1);
        r7.startActivity(r0);
        r7.finish();
        goto L_0x005d;
    L_0x00e0:
        com.whatsapp.App.d(r7, r3);
        r0 = z;
        r0 = r0[r5];
        com.whatsapp.util.Log.i(r0);
        r0 = com.whatsapp.auc.e();
        r7.s = r0;
        r0 = com.whatsapp.App.j;
        if (r0 != r6) goto L_0x0103;
    L_0x00f4:
        r0 = r7.s;
        if (r0 == 0) goto L_0x0103;
    L_0x00f8:
        r0 = r7.isFinishing();
        if (r0 != 0) goto L_0x005d;
    L_0x00fe:
        r7.showDialog(r5);
        if (r1 == 0) goto L_0x005d;
    L_0x0103:
        r0 = com.whatsapp.App.K;
        if (r0 != 0) goto L_0x0112;
    L_0x0107:
        r0 = r7.isFinishing();
        if (r0 != 0) goto L_0x005d;
    L_0x010d:
        r7.showDialog(r6);
        if (r1 == 0) goto L_0x005d;
    L_0x0112:
        r0 = com.whatsapp.App.D;
        if (r0 == 0) goto L_0x0121;
    L_0x0116:
        r0 = r7.isFinishing();
        if (r0 != 0) goto L_0x005d;
    L_0x011c:
        r7.showDialog(r2);
        if (r1 == 0) goto L_0x005d;
    L_0x0121:
        r0 = com.whatsapp.qm.d;
        if (r0 == 0) goto L_0x0153;
    L_0x0125:
        r0 = r7.t;
        if (r0 == 0) goto L_0x0133;
    L_0x0129:
        r0 = r7.t;
        r0 = r0.getStatus();
        r2 = android.os.AsyncTask.Status.RUNNING;
        if (r0 == r2) goto L_0x0143;
    L_0x0133:
        r0 = new com.whatsapp.fl;
        r0.<init>(r7);
        r7.t = r0;
        r0 = r7.t;
        r2 = new java.lang.Void[r5];
        com.whatsapp.util.bq.a(r0, r2);
        if (r1 == 0) goto L_0x005d;
    L_0x0143:
        r0 = z;
        r2 = 8;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        r0 = 104; // 0x68 float:1.46E-43 double:5.14E-322;
        r7.showDialog(r0);
        if (r1 == 0) goto L_0x005d;
    L_0x0153:
        r0 = z;
        r0 = r0[r3];
        com.whatsapp.util.Log.i(r0);
        r7.a();
        goto L_0x005d;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.Main.b():void");
    }

    static void a(Main main) {
        main.a();
    }

    private void a() {
        String stringExtra = getIntent().getStringExtra(z[27]);
        if (!TextUtils.isEmpty(stringExtra)) {
            l5 b = App.as.b(stringExtra);
            if (!(b == null || ((b.c() || b.A()) && b.q == null))) {
                if (!isFinishing()) {
                    startActivity(Conversation.a(b));
                    finish();
                    return;
                }
                return;
            }
        }
        d();
    }

    public Main() {
        this.q = a2c.a();
        this.s = null;
        this.t = null;
        this.p = false;
    }
}
