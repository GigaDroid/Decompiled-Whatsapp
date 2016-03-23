package com.whatsapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.ActivityCompat;
import android.support.v4.view.MenuItemCompat;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import com.whatsapp.util.ag;
import com.whatsapp.util.ao;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class ViewProfilePhoto extends DialogToastActivity implements tm {
    private static final String[] z;
    private boolean n;
    private l5 o;
    private Handler p;

    public class SavePhoto extends Activity {
        private static final String[] z;

        static {
            String[] strArr = new String[5];
            String str = "\u0006f\u0011\u000ew2{\f(r7r\u0005\u0004I";
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
                            i3 = 127;
                            break;
                        case at.g /*1*/:
                            i3 = 31;
                            break;
                        case at.i /*2*/:
                            i3 = arj.Theme_editTextStyle;
                            break;
                        case at.o /*3*/:
                            i3 = 119;
                            break;
                        default:
                            i3 = 58;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "\u0011~\u0005\u0012";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        str = "\u001eq\f\u0005U\u0016{F\u001eT\u000bz\u0006\u0003\u0014\u001ag\u001c\u0005[QL<%\u007f>R";
                        i = 3;
                        strArr2 = strArr3;
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        i = 4;
                        strArr2 = strArr3;
                        str = "$ R+\u0015U=TIF\"";
                        obj = 3;
                        break;
                    case at.o /*3*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "Qu\u0018\u0010";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            Uri uri = (Uri) getIntent().getParcelableExtra(z[3]);
            File file = new File(dg.j(), getIntent().getStringExtra(z[2]).replaceAll(z[4], "") + " " + new SimpleDateFormat(z[0], Locale.US).format(new Date()) + z[1]);
            try {
                ag.a(new File(uri.getPath()), file);
                ag.a((Context) this, Uri.fromFile(file));
                App.a(getApplicationContext(), 2131231689, 0);
            } catch (FileNotFoundException e) {
                App.a(getApplicationContext(), 2131231683, 1);
            } catch (IOException e2) {
                App.a(getApplicationContext(), 2131231683, 1);
            }
            finish();
        }
    }

    static {
        String[] strArr = new String[20];
        String str = "{\u001549o\u007f\u00137'sh\f9!kbS> o\u007f\u00137'sh\f9!kb\u001f9/qj\u00195noe\u0013%!@k\t=\"@d\u0018k";
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
                        i3 = 13;
                        break;
                    case at.g /*1*/:
                        i3 = 124;
                        break;
                    case at.i /*2*/:
                        i3 = 81;
                        break;
                    case at.o /*3*/:
                        i3 = 78;
                        break;
                    default:
                        i3 = 31;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "n\u0015#-ja\u001d#\u0011k\u007f\u001d?=vy\u0015> ";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "g\u00155";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "{\u001549o\u007f\u00137'sh\f9!kbS2<zl\b4n";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "{\u001549o\u007f\u00137'sh\f9!kbS2<zl\b4";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "-\f9!kb#7;sa#8*%";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "n\u0013?8z\u007f\u000f0:vb\u0012\"n}b\t?-z-\b>nrl\u0015?";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "n\u0015#-ja\u001d#\u0011k\u007f\u001d?=vy\u0015> ";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "l\u00125<pd\u0018\u007f'qy\u0019?:1h\u0004%<~#/\u0005\u001cZL1";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "l\u00125<pd\u0018\u007f'qy\u0019?:1h\u0004%<~#5\u001f\u0007KD=\u001d\u0011VC(\u0014\u0000K^";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "l\u00125<pd\u0018\u007f'qy\u0019?:1l\u001f%'pcR\u0002\u000bQI";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "l\u00125<pd\u0018\u007f'qy\u0019?:1h\u0004%<~#/\u0005\u001cZL1";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    str = "d\u00110)z\"V";
                    obj = 12;
                    i = 13;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    strArr2 = strArr3;
                    str = "n\u0013<`he\u001d%=~}\f\u007f'qy\u0019?:1l\u001f%'pcR\u0002\u000fIH#\u0001\u0006PY3";
                    obj = 13;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "c\u001d<+";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "`\u0019\u007f$oj";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "n\u0015#-ja\u001d#\u0011k\u007f\u001d?=vy\u0015> ";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "d\u000f\u000e<z~\u0019%";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "{\u001549o\u007f\u00137'sh\f9!kbS5+ly\u000e>7";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "{\u001549o\u007f\u00137'sh\f9!kbS2<zl\b4aqbQ<+";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static l5 b(ViewProfilePhoto viewProfilePhoto) {
        return viewProfilePhoto.o;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.o.c() || this.o.equals(App.as.e())) {
            MenuItemCompat.setShowAsAction(menu.add(0, 0, 0, 2131231081).setIcon(2130839434), 2);
        }
        MenuItemCompat.setShowAsAction(menu.add(0, 1, 0, 2131232015).setIcon(2130839448), 2);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        if (menu.size() == 0) {
            return false;
        }
        menu.findItem(1).setVisible(this.o.x().exists());
        return super.onPrepareOptionsMenu(menu);
    }

    private Transition a(View view) {
        Transition transitionSet = new TransitionSet();
        Transition com_whatsapp_ama = new ama(view);
        com_whatsapp_ama.addTarget(findViewById(2131755434));
        transitionSet.addTransition(com_whatsapp_ama);
        return transitionSet;
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        boolean z = DialogToastActivity.f;
        switch (i) {
            case Y.p /*12*/:
                if (i2 == -1) {
                    if (intent != null && intent.getBooleanExtra(z[18], false)) {
                        r.a(this.o, (Activity) this);
                        finish();
                        if (!z) {
                            return;
                        }
                    }
                    r.a(intent, this.o, this, 13, this);
                    if (!z) {
                        return;
                    }
                }
                return;
                break;
            case Y.q /*13*/:
                break;
            default:
                return;
        }
        r.a().delete();
        if (i2 == -1) {
            if (r.b(this.o, this)) {
                b();
                if (!z) {
                    return;
                }
            }
            return;
        }
        if (i2 == 0 && intent != null) {
            r.a(intent, (by) this);
        }
    }

    public void a(String str) {
    }

    static boolean a(ViewProfilePhoto viewProfilePhoto) {
        return viewProfilePhoto.n;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Throwable th;
        try {
            switch (menuItem.getItemId()) {
                case v.m /*0*/:
                    r.a(this.o, this, 12);
                    return true;
                case at.g /*1*/:
                    File j;
                    Intent intent = new Intent(z[11]);
                    intent.setType(z[13]);
                    if (this.o.equals(App.as.e())) {
                        j = App.j(z[16]);
                        Closeable fileInputStream;
                        try {
                            fileInputStream = new FileInputStream(this.o.x());
                            try {
                                ag.a((InputStream) fileInputStream, new FileOutputStream(j));
                            } catch (Throwable th2) {
                                th = th2;
                                ao.a(fileInputStream);
                                throw th;
                            }
                            try {
                                ao.a(fileInputStream);
                            } catch (Throwable th3) {
                                Log.a(th3);
                                App.a(getApplicationContext(), 2131231683, 1);
                                return true;
                            }
                        } catch (Throwable th4) {
                            th3 = th4;
                            fileInputStream = null;
                            ao.a(fileInputStream);
                            throw th3;
                        }
                    }
                    j = this.o.x();
                    intent.putExtra(z[9], Uri.fromFile(j));
                    Intent createChooser = Intent.createChooser(intent, null);
                    intent = new Intent(z[14], null);
                    intent.putExtra(z[12], Uri.fromFile(j));
                    intent.putExtra(z[15], this.o.a((Context) this));
                    createChooser.putExtra(z[10], new Intent[]{intent});
                    startActivity(createChooser);
                    return true;
                case 16908332:
                    ActivityCompat.finishAfterTransition(this);
                    return true;
                default:
                    return super.onOptionsItemSelected(menuItem);
            }
        } catch (IOException e) {
            throw e;
        }
        throw e;
    }

    public void b(String str) {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r11) {
        /*
        r10 = this;
        r9 = 21;
        r8 = 4;
        r7 = -1;
        r5 = 0;
        r6 = 1;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = r10.getWindow();
        r2 = 12;
        r0.requestFeature(r2);
        r0 = r10.getWindow();
        r2 = 13;
        r0.requestFeature(r2);
        r0 = android.os.Build.VERSION.SDK_INT;
        if (r0 < r9) goto L_0x0079;
    L_0x001e:
        r0 = new android.transition.Fade;
        r0.<init>();
        r2 = 16908335; // 0x102002f float:2.387736E-38 double:8.3538275E-317;
        r0.excludeTarget(r2, r6);
        r2 = 16908336; // 0x1020030 float:2.3877364E-38 double:8.353828E-317;
        r0.excludeTarget(r2, r6);
        r2 = r10.getWindow();
        r2.setExitTransition(r0);
        r2 = r10.getWindow();
        r2.setEnterTransition(r0);
        r0 = r10.getIntent();
        r2 = z;
        r3 = 8;
        r2 = r2[r3];
        r0 = r0.getBooleanExtra(r2, r5);
        if (r0 == 0) goto L_0x0079;
    L_0x004d:
        r0 = r10.getWindow();
        r2 = android.transition.TransitionInflater.from(r10);
        r3 = 17760257; // 0x10f0001 float:2.6264955E-38 double:8.774733E-317;
        r2 = r2.inflateTransition(r3);
        r0.setSharedElementEnterTransition(r2);
        r0 = r10.getWindow();
        r2 = android.transition.TransitionInflater.from(r10);
        r3 = 17760257; // 0x10f0001 float:2.6264955E-38 double:8.774733E-317;
        r2 = r2.inflateTransition(r3);
        r0.setSharedElementReturnTransition(r2);
        r0 = new com.whatsapp.s5;
        r0.<init>(r10);
        r10.setEnterSharedElementCallback(r0);
    L_0x0079:
        super.onCreate(r11);
        r0 = z;
        r2 = 5;
        r0 = r0[r2];
        com.whatsapp.util.Log.i(r0);
        r0 = r10.getSupportActionBar();
        r0.setDisplayHomeAsUpEnabled(r6);
        r0 = 2130903287; // 0x7f0300f7 float:1.7413388E38 double:1.0528061087E-314;
        r10.setContentView(r0);
        r0 = r10.getIntent();
        r2 = z;
        r3 = 3;
        r2 = r2[r3];
        r0 = r0.getStringExtra(r2);
        r2 = com.whatsapp.App.as;
        r2 = r2.b(r0);
        r10.o = r2;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = z;
        r3 = r3[r8];
        r2 = r2.append(r3);
        r2 = r2.append(r0);
        r3 = z;
        r4 = 6;
        r3 = r3[r4];
        r2 = r2.append(r3);
        r3 = r10.o;
        r3 = r3.c;
        r2 = r2.append(r3);
        r2 = r2.toString();
        com.whatsapp.util.Log.i(r2);
        com.whatsapp.App.b(r10);
        r2 = com.whatsapp.App.as;
        r2 = r2.e();
        if (r2 != 0) goto L_0x00f7;
    L_0x00da:
        r0 = z;
        r0 = r0[r6];
        com.whatsapp.util.Log.i(r0);
        r0 = z;
        r1 = 7;
        r0 = r0[r1];
        com.whatsapp.App.v(r0);
        r0 = new android.content.Intent;
        r1 = com.whatsapp.Main.class;
        r0.<init>(r10, r1);
        r10.startActivity(r0);
        r10.finish();
    L_0x00f6:
        return;
    L_0x00f7:
        r3 = r10.getSupportActionBar();
        r3.setDisplayHomeAsUpEnabled(r6);
        r3 = r10.o;
        r3 = r3.c();
        if (r3 == 0) goto L_0x010e;
    L_0x0106:
        r3 = 2131231342; // 0x7f08026e float:1.8078762E38 double:1.0529681894E-314;
        r10.setTitle(r3);
        if (r1 == 0) goto L_0x0127;
    L_0x010e:
        r3 = r2.p;
        r3 = r0.equals(r3);
        if (r3 == 0) goto L_0x011e;
    L_0x0116:
        r3 = 2131231711; // 0x7f0803df float:1.807951E38 double:1.0529683717E-314;
        r10.setTitle(r3);
        if (r1 == 0) goto L_0x0127;
    L_0x011e:
        r3 = r10.o;
        r3 = r3.a(r10);
        r10.i(r3);
    L_0x0127:
        r2 = r2.p;
        r0 = r0.equals(r2);
        if (r0 == 0) goto L_0x0159;
    L_0x012f:
        r0 = r10.o;
        r0 = r0.c;
        if (r0 <= 0) goto L_0x0192;
    L_0x0135:
        r0 = r10.o;
        r0 = r0.x();
        r0 = r0.exists();
        if (r0 != 0) goto L_0x0192;
    L_0x0141:
        r0 = r10.o;
        r0.c = r5;
        r0 = r10.o;
        r0 = r0.p;
        r2 = r10.o;
        r2 = r2.c;
        com.whatsapp.App.a(r0, r2, r6);
        r0 = r10.p;
        r2 = 32000; // 0x7d00 float:4.4842E-41 double:1.581E-319;
        r0.sendEmptyMessageDelayed(r5, r2);
        if (r1 == 0) goto L_0x0192;
    L_0x0159:
        r0 = new com.whatsapp.atl;
        r0.<init>(r10);
        r0 = com.whatsapp.App.a(r0);
        if (r0 == 0) goto L_0x0192;
    L_0x0164:
        r0 = r10.o;
        r0 = r0.c;
        if (r0 <= 0) goto L_0x017a;
    L_0x016a:
        r0 = r10.o;
        r0 = r0.x();
        r0 = r0.exists();
        if (r0 != 0) goto L_0x017a;
    L_0x0176:
        r0 = r10.o;
        r0.c = r5;
    L_0x017a:
        r0 = r10.o;
        r0 = r0.p;
        r2 = r10.o;
        r2 = r2.c;
        com.whatsapp.App.a(r0, r2, r6);
        r0 = r10.o;
        r0 = r0.c;
        if (r0 != 0) goto L_0x0192;
    L_0x018b:
        r0 = r10.p;
        r2 = 32000; // 0x7d00 float:4.4842E-41 double:1.581E-319;
        r0.sendEmptyMessageDelayed(r5, r2);
    L_0x0192:
        r0 = android.os.Build.VERSION.SDK_INT;
        if (r0 < r9) goto L_0x01f6;
    L_0x0196:
        r0 = r10.getIntent();
        r2 = z;
        r3 = 2;
        r2 = r2[r3];
        r0 = r0.getBooleanExtra(r2, r5);
        if (r0 == 0) goto L_0x01e5;
    L_0x01a5:
        r0 = 2131755951; // 0x7f1003af float:1.9142796E38 double:1.0532273807E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r2 = 2131232335; // 0x7f08064f float:1.8080776E38 double:1.05296868E-314;
        r2 = r10.getString(r2);
        r0.setTransitionName(r2);
        r2 = r10.o;
        r3 = com.whatsapp.App.z();
        r3 = r3.getResources();
        r4 = 2131427544; // 0x7f0b00d8 float:1.8476707E38 double:1.053065126E-314;
        r3 = r3.getDimensionPixelSize(r4);
        r4 = com.whatsapp.App.z();
        r4 = r4.getResources();
        r5 = 2131427359; // 0x7f0b001f float:1.8476332E38 double:1.0530650347E-314;
        r4 = r4.getDimensionPixelSize(r5);
        r4 = (float) r4;
        r2 = r2.a(r3, r4, r6);
        r0.setImageBitmap(r2);
        r0.setVisibility(r8);
        if (r1 == 0) goto L_0x01f6;
    L_0x01e5:
        r0 = 2131755434; // 0x7f1001aa float:1.9141747E38 double:1.0532271253E-314;
        r0 = r10.findViewById(r0);
        r1 = 2131232335; // 0x7f08064f float:1.8080776E38 double:1.05296868E-314;
        r1 = r10.getString(r1);
        r0.setTransitionName(r1);
    L_0x01f6:
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 10;
        if (r0 > r1) goto L_0x020d;
    L_0x01fc:
        r0 = 2131755434; // 0x7f1001aa float:1.9141747E38 double:1.0532271253E-314;
        r0 = r10.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r1 = new android.widget.FrameLayout$LayoutParams;
        r1.<init>(r7, r7);
        r0.setLayoutParams(r1);
    L_0x020d:
        r10.b();
        goto L_0x00f6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ViewProfilePhoto.onCreate(android.os.Bundle):void");
    }

    public void c(String str) {
    }

    public void d(String str) {
        this.o = App.as.b(this.o.p);
        if (str.equals(this.o.p)) {
            Log.i(z[0] + this.o.c);
            boolean p = App.p(Environment.getExternalStorageState());
            this.p.removeMessages(0);
            if (p && this.o.c == 0) {
                App.a(this.o.p, this.o.c, 1);
                this.p.sendEmptyMessageDelayed(0, 32000);
            }
            b();
            invalidateOptionsMenu();
        }
    }

    public void a() {
        this.o = App.as.b(this.o.p);
        if (this.o.c()) {
            setTitle(2131231342);
            if (!DialogToastActivity.f) {
                return;
            }
        }
        i(this.o.a((Context) this));
    }

    public ViewProfilePhoto() {
        this.n = true;
        this.p = new kb(this, Looper.getMainLooper());
    }

    static Transition a(ViewProfilePhoto viewProfilePhoto, View view) {
        return viewProfilePhoto.a(view);
    }

    public void onDestroy() {
        super.onDestroy();
        Log.i(z[19]);
        this.p.removeMessages(0);
        App.a((tm) this);
    }

    public void finishAfterTransition() {
        this.n = false;
        super.finishAfterTransition();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
        r7 = this;
        r6 = 1;
        r3 = com.whatsapp.DialogToastActivity.f;
        r0 = 2131755177; // 0x7f1000a9 float:1.9141226E38 double:1.0532269983E-314;
        r4 = r7.findViewById(r0);
        r0 = 2131755434; // 0x7f1001aa float:1.9141747E38 double:1.0532271253E-314;
        r0 = r7.findViewById(r0);
        r0 = (android.widget.ImageView) r0;
        r1 = 2131755606; // 0x7f100256 float:1.9142096E38 double:1.0532272103E-314;
        r1 = r7.findViewById(r1);
        r1 = (android.widget.TextView) r1;
        r2 = 2131755951; // 0x7f1003af float:1.9142796E38 double:1.0532273807E-314;
        r2 = r7.findViewById(r2);
        r2 = (android.widget.ImageView) r2;
        r5 = r7.o;	 Catch:{ IOException -> 0x00e0 }
        r5 = r5.p;	 Catch:{ IOException -> 0x00e0 }
        r5 = com.whatsapp.aw2.a(r5);	 Catch:{ IOException -> 0x00e0 }
        if (r5 == 0) goto L_0x0044;
    L_0x002f:
        r5 = 0;
        r4.setVisibility(r5);	 Catch:{ IOException -> 0x00e0 }
        r5 = 8;
        r0.setVisibility(r5);	 Catch:{ IOException -> 0x00e0 }
        r5 = 8;
        r1.setVisibility(r5);	 Catch:{ IOException -> 0x00e0 }
        r5 = 8;
        r2.setVisibility(r5);	 Catch:{ IOException -> 0x00e0 }
        if (r3 == 0) goto L_0x00df;
    L_0x0044:
        r5 = r7.o;
        r5 = r5.b(r6);
        if (r5 != 0) goto L_0x0072;
    L_0x004c:
        r6 = 8;
        r0.setVisibility(r6);	 Catch:{ IOException -> 0x00e2 }
        r6 = 8;
        r4.setVisibility(r6);	 Catch:{ IOException -> 0x00e2 }
        r6 = 0;
        r1.setVisibility(r6);	 Catch:{ IOException -> 0x00e2 }
        r6 = r7.o;	 Catch:{ IOException -> 0x00e2 }
        r6 = r6.c();	 Catch:{ IOException -> 0x00e2 }
        if (r6 == 0) goto L_0x006a;
    L_0x0062:
        r6 = 2131231556; // 0x7f080344 float:1.8079196E38 double:1.052968295E-314;
        r1.setText(r6);	 Catch:{ IOException -> 0x00e4 }
        if (r3 == 0) goto L_0x00da;
    L_0x006a:
        r6 = 2131231564; // 0x7f08034c float:1.8079213E38 double:1.052968299E-314;
        r1.setText(r6);	 Catch:{ IOException -> 0x00e6 }
        if (r3 == 0) goto L_0x00da;
    L_0x0072:
        r6 = 0;
        r0.setVisibility(r6);	 Catch:{ IOException -> 0x00e8 }
        r6 = 8;
        r1.setVisibility(r6);	 Catch:{ IOException -> 0x00e8 }
        r1 = r7.o;	 Catch:{ IOException -> 0x00e8 }
        r1 = r1.c;	 Catch:{ IOException -> 0x00e8 }
        if (r1 != 0) goto L_0x0087;
    L_0x0081:
        r1 = 0;
        r4.setVisibility(r1);	 Catch:{ IOException -> 0x00ea }
        if (r3 == 0) goto L_0x008c;
    L_0x0087:
        r1 = 8;
        r4.setVisibility(r1);	 Catch:{ IOException -> 0x00ec }
    L_0x008c:
        r1 = new android.graphics.BitmapFactory$Options;	 Catch:{ all -> 0x00ee }
        r1.<init>();	 Catch:{ all -> 0x00ee }
        r3 = 1;
        r1.inDither = r3;	 Catch:{ all -> 0x00ee }
        r3 = 1;
        r1.inInputShareable = r3;	 Catch:{ all -> 0x00ee }
        r3 = 1;
        r1.inPurgeable = r3;	 Catch:{ all -> 0x00ee }
        r3 = com.whatsapp.qi.a(r5);	 Catch:{ IOException -> 0x00f5 }
        r4 = 0;
        r6 = r3.length;	 Catch:{ all -> 0x00ee }
        r1 = android.graphics.BitmapFactory.decodeByteArray(r3, r4, r6, r1);	 Catch:{ all -> 0x00ee }
        r0.setImageBitmap(r1);	 Catch:{ IOException -> 0x0101 }
        r0 = android.os.Build.VERSION.SDK_INT;	 Catch:{ IOException -> 0x0101 }
        r3 = 21;
        if (r0 < r3) goto L_0x00da;
    L_0x00ad:
        r0 = r7.getIntent();	 Catch:{ IOException -> 0x0101 }
        r3 = z;	 Catch:{ IOException -> 0x0101 }
        r4 = 17;
        r3 = r3[r4];	 Catch:{ IOException -> 0x0101 }
        r4 = 0;
        r0 = r0.getBooleanExtra(r3, r4);	 Catch:{ IOException -> 0x0101 }
        if (r0 == 0) goto L_0x00da;
    L_0x00be:
        r0 = r7.o;	 Catch:{ all -> 0x00ee }
        r3 = r1.getWidth();	 Catch:{ all -> 0x00ee }
        r1 = r1.getHeight();	 Catch:{ all -> 0x00ee }
        r1 = java.lang.Math.min(r3, r1);	 Catch:{ all -> 0x00ee }
        r3 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r4 = 0;
        r0 = r0.a(r1, r3, r4);	 Catch:{ all -> 0x00ee }
        r2.setImageBitmap(r0);	 Catch:{ all -> 0x00ee }
        r0 = 0;
        r2.setVisibility(r0);	 Catch:{ all -> 0x00ee }
    L_0x00da:
        if (r5 == 0) goto L_0x00df;
    L_0x00dc:
        r5.close();	 Catch:{ IOException -> 0x0103 }
    L_0x00df:
        return;
    L_0x00e0:
        r0 = move-exception;
        throw r0;
    L_0x00e2:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00e4 }
    L_0x00e4:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00e6 }
    L_0x00e6:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00e8 }
    L_0x00e8:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00ea }
    L_0x00ea:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x00ec }
    L_0x00ec:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00ee }
    L_0x00ee:
        r0 = move-exception;
        if (r5 == 0) goto L_0x00f4;
    L_0x00f1:
        r5.close();	 Catch:{ IOException -> 0x0105 }
    L_0x00f4:
        throw r0;
    L_0x00f5:
        r0 = move-exception;
        com.whatsapp.util.Log.a(r0);	 Catch:{ all -> 0x00ee }
        if (r5 == 0) goto L_0x00df;
    L_0x00fb:
        r5.close();	 Catch:{ IOException -> 0x00ff }
        goto L_0x00df;
    L_0x00ff:
        r0 = move-exception;
        goto L_0x00df;
    L_0x0101:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00ee }
    L_0x0103:
        r0 = move-exception;
        goto L_0x00df;
    L_0x0105:
        r1 = move-exception;
        goto L_0x00f4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ViewProfilePhoto.b():void");
    }

    public void a(Collection collection) {
    }
}
