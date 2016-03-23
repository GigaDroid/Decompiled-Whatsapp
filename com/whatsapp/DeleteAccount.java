package com.whatsapp;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.appcompat.R;
import android.support.v7.widget.TintManager;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.whatsapp.fieldstats.k;
import com.whatsapp.gdrive.GoogleDriveService;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import com.whatsapp.util.Log;
import com.whatsapp.util.bz;
import java.io.IOException;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class DeleteAccount extends DialogToastActivity {
    private static String n;
    private static String q;
    private static final String[] z;
    private TextWatcher o;
    EditText p;
    private int r;
    private String s;
    private int t;
    EditText u;
    TextView v;
    private TextWatcher w;
    private final Handler x;

    public void onPause() {
        super.onPause();
        this.t = RegisterPhone.a(this.u);
        this.r = RegisterPhone.a(this.p);
        Log.i(z[8]);
    }

    private void a(String str) {
        try {
            Log.i(z[2] + str + z[6] + u0.d(str));
        } catch (IOException e) {
            Log.e(z[4] + str + z[1] + e.toString());
        }
        try {
            if (this.o != null) {
                this.u.removeTextChangedListener(this.o);
            }
            this.o = new are(u0.d(str));
            this.u.addTextChangedListener(this.o);
        } catch (IOException e2) {
            throw e2;
        } catch (Throwable e3) {
            Log.b(z[5], e3);
        } catch (Throwable e32) {
            Log.b(z[0] + str + z[3], e32);
        }
    }

    static {
        String[] strArr = new String[18];
        String str = "\ru~GF\f=sAQ\u0006e|V\u001d\n\u007fgLF\u001bi(";
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
                        i3 = 16;
                        break;
                    case at.i /*2*/:
                        i3 = 18;
                        break;
                    case at.o /*3*/:
                        i3 = 34;
                        break;
                    default:
                        i3 = 50;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\ru~GF\f=sAQ\u0006e|V\u001d\n\u007fgLF\u001bi(";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "IssWA\ft2C\\IY]gJ\nubV[\u0006~";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "\ru~GF\f=sAQ\u0006e|V\u001d\n\u007fgLF\u001bi(\u0002";
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "\ru~GF\f=sAQ\u0006e|V\u001d\u000f\u007f`OS\u001ddwP\u001f\fhqGB\u001dy}L";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "Il2";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "\ru~GF\f=sAQ\u0006e|V\u001d\ruaV@\u0006i";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\ru~GF\f=sAQ\u0006e|V\u001d\u0019qgQWI";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\ru~GF\f=sAQ\u0006e|V\u001d\n\u007fgLF\u001bi(";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\ru~GF\f=sAQ\u0006e|V\u001d\n\u007fgLF\u001bi(";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "\ru~GF\f=sAQ\u0006e|V\u001d\nbwCF\f";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "Il2";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "IvsK^\ft2a]\u001c~fPK9x}LW ~tM\u001c\u0005\u007f}IG\u0019S}W\\\u001dbkcP\u000bbP[|\b}w\n\u001b";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\ru~GF\f=sAQ\u0006e|V\u001d\u0000c}\rQ\u0006tw\u0002T\by~GVId}\u0002U\fd2A]\ru2D@\u0006}2a]\u001c~fPK9x}LW ~tM";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\ru~GF\f=sAQ\u0006e|V\u001d\u0019x}LWFbwQG\u0004u";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    str = "\n\u007fgLF\u001biMLS\u0004u";
                    obj = 15;
                    i = 16;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    strArr2 = strArr3;
                    str = "\ns";
                    obj = 16;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    z = strArr3;
                    q = null;
                    n = null;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u000fq{NW\r0fM\u0012\u0005\u007f}IG\u0019S}W\\\u001dbkcP\u000bbP[|\b}w\u0002T\u001b\u007f\u007f\u0002q\u0006e|V@\u0010@zM\\\fY|D]I";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static String a() {
        return n;
    }

    static String b(String str) {
        n = str;
        return str;
    }

    public void onResume() {
        try {
            super.onResume();
            if (q != null) {
                this.p.setText(q);
            }
            try {
                if (this.s != null) {
                    this.v.setText(this.s);
                }
                RegisterPhone.a(this.p, this.r);
                RegisterPhone.a(this.u, this.t);
                Log.i(z[15]);
            } catch (NullPointerException e) {
                throw e;
            }
        } catch (NullPointerException e2) {
            throw e2;
        }
    }

    static String c(DeleteAccount deleteAccount) {
        return deleteAccount.s;
    }

    protected void onCreate(Bundle bundle) {
        Log.i(z[11]);
        super.onCreate(bundle);
        nf.a(k.DELETE_ACCOUNT);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            try {
                supportActionBar.setDisplayHomeAsUpEnabled(true);
            } catch (IOException e) {
                throw e;
            }
        }
        setContentView(aam.a(getLayoutInflater(), 2130903154, null, false, new int[]{2131755413}));
        this.p = (EditText) findViewById(2131755414);
        this.v = (TextView) findViewById(2131755598);
        this.v.setBackgroundDrawable(new bz(TintManager.getDrawable((Context) this, (int) R.drawable.abc_spinner_textfield_background_material)));
        this.u = (EditText) findViewById(2131755415);
        ((TextView) findViewById(2131755597)).setText(2131231028);
        this.p.setFilters(new InputFilter[]{new LengthFilter(3)});
        this.u.setFilters(new InputFilter[]{new LengthFilter(17)});
        String networkCountryIso = App.W.getNetworkCountryIso();
        if (networkCountryIso != null) {
            try {
                q = u0.a(networkCountryIso);
            } catch (IOException e2) {
                Log.e(z[14]);
            } catch (NullPointerException e3) {
                throw e3;
            }
        }
        this.w = new arx(this);
        this.p.addTextChangedListener(this.w);
        this.v.setOnClickListener(new a_u(this));
        this.u.requestFocus();
        this.t = RegisterPhone.a(this.u);
        this.r = RegisterPhone.a(this.p);
        findViewById(2131755596).setOnClickListener(new o_(this));
        try {
            ((Button) findViewById(2131755599)).setOnClickListener(new vp(this));
            if (q != null) {
                this.p.setText(q);
            }
            String charSequence = this.v.getText().toString();
            try {
                if (!TextUtils.isEmpty(charSequence)) {
                    try {
                        Log.i(z[9] + charSequence + z[12] + u0.d(charSequence));
                    } catch (Throwable e4) {
                        Log.b(z[10] + charSequence + z[13], e4);
                    }
                    a(charSequence);
                }
                try {
                    if (GoogleDriveService.X()) {
                        if (GoogleDriveService.g() != null) {
                            return;
                        }
                    }
                    findViewById(2131755595).setVisibility(8);
                } catch (IOException e5) {
                    throw e5;
                } catch (IOException e52) {
                    throw e52;
                }
            } catch (NullPointerException e32) {
                throw e32;
            }
        } catch (IOException e522) {
            throw e522;
        }
    }

    protected void onDestroy() {
        Log.i(z[7]);
        this.x.removeMessages(4);
        super.onDestroy();
    }

    static String b() {
        return q;
    }

    static TextWatcher a(DeleteAccount deleteAccount) {
        return deleteAccount.w;
    }

    static Handler b(DeleteAccount deleteAccount) {
        return deleteAccount.x;
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        if (i == 0 && i2 == -1) {
            try {
                q = intent.getStringExtra(z[17]);
                this.s = intent.getStringExtra(z[16]);
                this.p.setText(q);
                this.v.setText(this.s);
                a(this.s);
                if (this.t == -1) {
                    this.t = Integer.MAX_VALUE;
                }
                this.r = -1;
            } catch (NullPointerException e) {
                throw e;
            }
        }
        this.p.addTextChangedListener(this.w);
    }

    static String c(String str) {
        q = str;
        return str;
    }

    static void a(DeleteAccount deleteAccount, String str) {
        deleteAccount.a(str);
    }

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case at.g /*1*/:
                Dialog progressDialog = new ProgressDialog(this);
                progressDialog.setMessage(getString(2131231749));
                progressDialog.setIndeterminate(true);
                progressDialog.setCancelable(false);
                return progressDialog;
            case arj.Theme_switchStyle /*109*/:
                return new Builder(this).setMessage(2131231791).setPositiveButton(2131230911, new h4(this)).setNegativeButton(2131230884, new av5(this)).create();
            default:
                return super.onCreateDialog(i);
        }
    }

    public DeleteAccount() {
        this.x = new aa3(this);
    }
}
