package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v7.app.ActionBar;
import android.support.v7.appcompat.R;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.whatsapp.util.Log;
import com.whatsapp.util.a3;
import com.whatsapp.util.bb;
import com.whatsapp.util.bq;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class WebImagePicker extends DialogToastListActivity {
    private static final String[] I;
    private aon A;
    private OnClickListener B;
    private br C;
    private SearchView D;
    private int E;
    private View F;
    private final as8 G;
    private int H;
    private bb t;
    private final File u;
    private Uri v;
    private ArrayList w;
    private a4d x;
    private aqt y;
    private View z;

    class 3 extends SearchView {
        final WebImagePicker b;

        public boolean isIconified() {
            return false;
        }

        3(WebImagePicker webImagePicker, Context context) {
            this.b = webImagePicker;
            super(context);
        }
    }

    static {
        String[] strArr = new String[11];
        String str = "\u0015d#\nY";
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
                        i3 = 100;
                        break;
                    case at.g /*1*/:
                        i3 = 17;
                        break;
                    case at.i /*2*/:
                        i3 = 70;
                        break;
                    case at.o /*3*/:
                        i3 = 120;
                        break;
                    default:
                        i3 = 32;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u0013t$\u0011M\u0005v#\u000bE\u0005c%\u0010\u000f\u0007c#\u0019T\u0001";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\r\u007f6\rT;|#\fH\u000bu";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u0015d#\nY";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u0017y)\u000fs\u000bw21N\u0014d2-N\u0007y#\u001bK\u0001u";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "\r\u007f6\rT;|#\fH\u000bu";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "0y3\u0015B\u0017";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "\u0013t$\u0011M\u0005v#\u000bE\u0005c%\u0010\u000f\u0007p(\u001bE\bN\"\u0011A\b~!";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "\u0013t$\u0011M\u0005v#\u000bE\u0005c%\u0010\u000f\u0007p(\u001bE\bN/\u0015A\u0003t\u0019\u001cO\u0013\u007f*\u0017A\u0000N2\u0019S\u000f";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u0013t$\u0011M\u0005v#\u000bE\u0005c%\u0010\u000f\u0000t5\fR\u000bh";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    I = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u000bd2\bU\u0010";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    static bb a(WebImagePicker webImagePicker, bb bbVar) {
        webImagePicker.t = bbVar;
        return bbVar;
    }

    static ArrayList f(WebImagePicker webImagePicker) {
        return webImagePicker.w;
    }

    private void d() {
        Method method = null;
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(I[6]);
        if (inputMethodManager != null) {
            try {
                method = inputMethodManager.getClass().getMethod(I[5], new Class[]{Integer.TYPE, ResultReceiver.class});
            } catch (NoSuchMethodException e) {
            }
            if (method != null) {
                try {
                    method.invoke(inputMethodManager, new Object[]{Integer.valueOf(0), null});
                } catch (IllegalAccessException e2) {
                } catch (InvocationTargetException e3) {
                } catch (NoSuchMethodException e4) {
                    throw e4;
                }
            }
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    static View j(WebImagePicker webImagePicker) {
        return webImagePicker.F;
    }

    static Uri k(WebImagePicker webImagePicker) {
        return webImagePicker.v;
    }

    static OnClickListener e(WebImagePicker webImagePicker) {
        return webImagePicker.B;
    }

    static View l(WebImagePicker webImagePicker) {
        return webImagePicker.z;
    }

    static void n(WebImagePicker webImagePicker) {
        webImagePicker.d();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        boolean z = DialogToastActivity.f;
        if (i == 151) {
            if (i2 == -1) {
                a();
                if (!z) {
                    return;
                }
            }
            finish();
            if (!z) {
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    static bb d(WebImagePicker webImagePicker) {
        return webImagePicker.t;
    }

    static int a(WebImagePicker webImagePicker) {
        return webImagePicker.E;
    }

    public WebImagePicker() {
        this.w = new ArrayList();
        this.y = new aqt("");
        this.H = 4;
        this.u = new File(App.z().getCacheDir(), I[7]);
        this.G = new h9(this);
    }

    static void a(WebImagePicker webImagePicker, anw com_whatsapp_anw) {
        webImagePicker.a(com_whatsapp_anw);
    }

    public void onDestroy() {
        super.onDestroy();
        Log.i(I[10]);
        this.w.clear();
        this.t.a(true);
        if (this.C != null) {
            this.C.cancel(true);
            Log.i(I[9]);
            if (br.a(this.C) != null) {
                Log.i(I[8]);
                br.a(this.C).dismiss();
                br.a(this.C, null);
            }
            this.C = null;
        }
        aon.a(this.A);
    }

    static File i(WebImagePicker webImagePicker) {
        return webImagePicker.u;
    }

    public void onCreate(Bundle bundle) {
        String a;
        Log.i(I[2]);
        super.onCreate(bundle);
        ActionBar supportActionBar = getSupportActionBar();
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        supportActionBar.setDisplayShowTitleEnabled(false);
        supportActionBar.setDisplayShowCustomEnabled(true);
        this.x = a4d.a();
        this.u.mkdirs();
        aqt.a();
        setContentView(2130903294);
        CharSequence stringExtra = getIntent().getStringExtra(I[0]);
        if (stringExtra != null) {
            a = a28.a(stringExtra);
        } else {
            CharSequence charSequence = stringExtra;
        }
        OnClickListener dxVar = new dx(this);
        this.D = new 3(this, getSupportActionBar().getThemedContext());
        ((TextView) this.D.findViewById(R.id.search_src_text)).setTextColor(getResources().getColor(R.color.primary_text_default_material_dark));
        this.D.setQueryHint(getString(2131231848));
        this.D.setIconified(false);
        this.D.setOnCloseListener(new tf(this));
        this.D.setQuery(a, false);
        this.D.setOnSearchClickListener(dxVar);
        this.D.setOnQueryTextListener(new axs(this));
        getSupportActionBar().setCustomView(this.D);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.v = (Uri) extras.getParcelable(I[1]);
        }
        ListView a2 = a();
        a2.requestFocus();
        a2.setClickable(false);
        a2.setBackgroundDrawable(null);
        a2.setDividerHeight(0);
        View inflate = getLayoutInflater().inflate(2130903295, null);
        a2.addFooterView(inflate, null, false);
        a2.setFooterDividersEnabled(false);
        this.z = inflate.findViewById(2131755623);
        this.F = inflate.findViewById(2131755984);
        this.A = new aon(this);
        a(this.A);
        this.B = new xe(this);
        b();
        if (App.b(this.G) && !TextUtils.isEmpty(a)) {
            aon.a(this.A, a);
        }
    }

    static aqt b(WebImagePicker webImagePicker) {
        return webImagePicker.y;
    }

    static a4d g(WebImagePicker webImagePicker) {
        return webImagePicker.x;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
        this.A.notifyDataSetChanged();
    }

    static int c(WebImagePicker webImagePicker) {
        return webImagePicker.H;
    }

    private void b() {
        this.E = (this.x.k + (this.x.r * 2)) + ((int) this.x.x);
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        this.H = defaultDisplay.getWidth() / this.E;
        this.E = (defaultDisplay.getWidth() / this.H) - ((int) this.x.x);
        if (this.t != null) {
            this.t.b();
        }
        this.t = new a3(this.u).a(this.E).a(4194304).b(getResources().getDrawable(2130839707)).a(getResources().getDrawable(2130839525)).a();
    }

    private void a() {
        String charSequence = this.D.getQuery().toString();
        if (TextUtils.isEmpty(charSequence)) {
            Toast.makeText(getApplicationContext(), getString(2131231686), 0).show();
            if (!DialogToastActivity.f) {
                return;
            }
        }
        ((InputMethodManager) App.z().getSystemService(I[3])).hideSoftInputFromWindow(this.D.getWindowToken(), 0);
        aon.a(this.A, charSequence);
    }

    static void m(WebImagePicker webImagePicker) {
        webImagePicker.a();
    }

    static br a(WebImagePicker webImagePicker, br brVar) {
        webImagePicker.C = brVar;
        return brVar;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (TextUtils.isEmpty(getIntent().getStringExtra(I[4]))) {
            this.D.requestFocus();
            this.D.post(new r5(this));
        }
        return super.onCreateOptionsMenu(menu);
    }

    private void a(anw com_whatsapp_anw) {
        if (this.C != null) {
            this.C.cancel(true);
        }
        this.C = new br(this, com_whatsapp_anw);
        bq.a(this.C, new Void[0]);
    }

    static aqt a(WebImagePicker webImagePicker, aqt com_whatsapp_aqt) {
        webImagePicker.y = com_whatsapp_aqt;
        return com_whatsapp_aqt;
    }

    static br h(WebImagePicker webImagePicker) {
        return webImagePicker.C;
    }
}
