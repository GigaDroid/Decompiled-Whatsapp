package com.whatsapp;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog.Builder;
import android.view.MenuItem;
import com.whatsapp.accountsync.PerformSyncManager;
import com.whatsapp.gdrive.GoogleDriveService;
import com.whatsapp.util.Log;
import java.io.File;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class DeleteAccountConfirmation extends DialogToastActivity {
    private static DeleteAccountConfirmation n;
    private static GoogleDriveService p;
    private static final String[] z;
    private final Handler o;

    private static void c(Context context, awc com_whatsapp_awc) {
        com_whatsapp_awc.e();
        App.ay = null;
        new File(context.getFilesDir(), z[11]).delete();
        ve.c();
        App.f(context, null);
        App.d(context, 0);
        App.aK.r();
        App.as.l();
        App.Z = false;
        ve.w();
        PerformSyncManager.a(false);
        vh.l(context);
    }

    static Handler a(DeleteAccountConfirmation deleteAccountConfirmation) {
        return deleteAccountConfirmation.o;
    }

    protected void onResume() {
        super.onResume();
        n = this;
        int t = App.t((Context) this);
        if (t != 3 && t != 6) {
            Log.e(z[10] + t);
            startActivity(new Intent(this, Main.class));
            finish();
        }
    }

    protected void onDestroy() {
        super.onDestroy();
        this.o.removeMessages(0);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                finish();
                return true;
            default:
                return false;
        }
    }

    public DeleteAccountConfirmation() {
        this.o = new ave(this);
    }

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case at.g /*1*/:
                Dialog progressDialog = new ProgressDialog(this);
                progressDialog.setMessage(getString(2131231034));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return progressDialog;
            case at.i /*2*/:
                return new Builder(this).setMessage(getString(2131231746, new Object[]{getString(2131230939)})).setPositiveButton(2131231580, new m7(this)).create();
            case at.o /*3*/:
                return new Builder(this).setMessage(2131231026).setPositiveButton(2131231580, new asz(this)).create();
            default:
                return super.onCreateDialog(i);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.i(z[9]);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        setContentView(aam.a(getLayoutInflater(), 2130903155, null, false));
        findViewById(2131755601).setOnClickListener(new amz(this));
        if (!GoogleDriveService.X() || GoogleDriveService.g() == null) {
            findViewById(2131755600).setVisibility(8);
        }
    }

    static {
        String[] strArr = new String[12];
        String str = "\r\u0000\u0001 z\f\u0004\u000e&z\n\n\u0003#g\u001b\bB v\u001d\u0000\u001f+o\u0005\b\b!g\bH\u001e1o\u001d\u0000M";
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
                        i3 = arj.Theme_radioButtonStyle;
                        break;
                    case at.g /*1*/:
                        i3 = arj.Theme_buttonStyleSmall;
                        break;
                    case at.i /*2*/:
                        i3 = arj.Theme_switchStyle;
                        break;
                    case at.o /*3*/:
                        i3 = 69;
                        break;
                    default:
                        i3 = 14;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\b\u0006\u000e*{\u0007\u00112+o\u0004\u0000";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u0003\f\t";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\b\u0006\u0019,a\u0007:\t b\f\u0011\b";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "?\u0000\u001f,h\u00106\u00006";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = ";\u0000\n,}\u001d\u0000\u001f\u0015f\u0006\u000b\b";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\r\u0000\u0001 z\f\u0004\u000e&z\n\n\u0003#g\u001b\bB7k\u000e\u0015\u0005*`\fJ\u000e*c\u0004\f\u0019eh\b\f\u0001 j";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\r\u0000\u0001 z\f\u0004\u000e&z\n\n\u0003#g\u001b\bB3k\u001b\f\u000b<}\u0004\u0016B&a\u0004\b\u00041.\u000f\u0004\u0004)k\r";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\r\u0000\u0001 z\f\u0004\u000e&a\u001c\u000b\u0019&a\u0007\u0003\u00047cF\u0006\u001f o\u001d\u0000";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\r\u0000\u0001 z\f\u0004\u000e&z\n\n\u0003#g\u001b\bB2|\u0006\u000b\nh}\u001d\u0004\u0019 .\u000b\n\u0018+m\fE\u0019*.\u0004\u0004\u0004+.";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\u0004\u0000";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    z = strArr3;
                    n = null;
                    p = null;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\r\u0000\u0001 z\f\u0004\u000e&z\n\n\u0003#g\u001b\bB$~\u0019K\u0000 .\u0000\u0016M+{\u0005\tB+aI\u0002\u0002*i\u0005\u0000M!|\u0000\u0013\bel\b\u0006\u00060~I\u0001\b)k\u001d\f\u0002+";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static GoogleDriveService a(GoogleDriveService googleDriveService) {
        p = googleDriveService;
        return googleDriveService;
    }

    static GoogleDriveService b() {
        return p;
    }

    static void b(Context context, awc com_whatsapp_awc) {
        c(context, com_whatsapp_awc);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r10, com.whatsapp.awc r11) {
        /*
        r8 = 1;
        r6 = 0;
        r4 = com.whatsapp.DialogToastActivity.f;
        r0 = 6;
        com.whatsapp.App.d(r10, r0);
        r0 = n;
        if (r0 == 0) goto L_0x0013;
    L_0x000c:
        r0 = n;
        r0 = r0.o;
        r0.removeMessages(r6);
    L_0x0013:
        r0 = com.whatsapp.notification.ao.c();
        r0.a();
        r2 = new android.os.ConditionVariable;
        r2.<init>(r6);
        r3 = new com.whatsapp.rs;
        r3.<init>(r2);
        r1 = new android.os.ConditionVariable;
        r1.<init>(r6);
        r0 = new com.whatsapp.au5;
        r0.<init>(r1, r3);
        r5 = new android.content.Intent;
        r7 = com.whatsapp.gdrive.GoogleDriveService.class;
        r5.<init>(r10, r7);
        r10.bindService(r5, r0, r8);
        r0 = new android.content.Intent;
        r5 = com.whatsapp.gdrive.GoogleDriveService.class;
        r0.<init>(r10, r5);
        r5 = com.whatsapp.App.ay;
        if (r5 == 0) goto L_0x006d;
    L_0x0043:
        r5 = z;
        r7 = 2;
        r5 = r5[r7];
        r7 = com.whatsapp.gdrive.GoogleDriveService.g();
        r0.putExtra(r5, r7);
        r5 = z;
        r7 = 3;
        r5 = r5[r7];
        r7 = com.whatsapp.App.ay;
        r7 = r7.jabber_id;
        r0.putExtra(r5, r7);
        r5 = z;
        r7 = 4;
        r5 = r5[r7];
        r0.setAction(r5);
        r5 = new com.whatsapp.axx;
        r5.<init>(r1, r10, r0);
        com.whatsapp.util.bq.a(r5);
        if (r4 == 0) goto L_0x0074;
    L_0x006d:
        r0 = z;
        r0 = r0[r8];
        com.whatsapp.util.Log.i(r0);
    L_0x0074:
        r5 = r10.getFilesDir();
        r7 = r10.fileList();
        r8 = r7.length;
        r0 = r6;
    L_0x007e:
        if (r0 >= r8) goto L_0x0086;
    L_0x0080:
        r9 = r7[r0];
        r0 = r0 + 1;
        if (r4 == 0) goto L_0x007e;
    L_0x0086:
        com.whatsapp.ael.d(r5);
        r0 = new com.whatsapp.a5_;
        r0.<init>();
        com.whatsapp.util.bq.a(r0);
        r0 = android.os.Environment.getExternalStorageState();
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = z;
        r5 = r5[r6];
        r4 = r4.append(r5);
        r4 = r4.append(r0);
        r4 = r4.toString();
        com.whatsapp.util.Log.i(r4);
        r0 = com.whatsapp.App.p(r0);
        if (r0 == 0) goto L_0x00b8;
    L_0x00b3:
        r0 = com.whatsapp.App.aK;
        r0.N();
    L_0x00b8:
        com.whatsapp.App.ae();
        com.whatsapp.App.aL();
        r0 = new com.whatsapp.au4;
        r4 = r10;
        r5 = r11;
        r0.<init>(r1, r2, r3, r4, r5);
        r1 = new java.lang.Void[r6];
        com.whatsapp.util.bq.a(r0, r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.DeleteAccountConfirmation.a(android.content.Context, com.whatsapp.awc):void");
    }

    static void a(Context context) {
        if (!context.getSharedPreferences(z[6], 0).edit().clear().commit()) {
            Log.e(z[7]);
        }
        if (!context.getSharedPreferences(z[5], 0).edit().clear().commit()) {
            Log.e(z[8]);
        }
    }

    static DeleteAccountConfirmation a() {
        return n;
    }

    protected void onPause() {
        super.onPause();
        n = null;
    }
}
