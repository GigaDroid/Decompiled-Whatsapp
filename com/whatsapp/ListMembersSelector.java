package com.whatsapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.widget.ListView;
import android.widget.TextView;
import com.whatsapp.fieldstats.k;
import com.whatsapp.protocol.co;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;
import org.v;
import org.whispersystems.at;

public class ListMembersSelector extends MultipleContactsSelector {
    private static final String[] z;

    static {
        String[] strArr = new String[4];
        String str = "<%}/\u000e5!l>\u0011#?k7\u000638a)L4)}/\u0011?5";
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
                        i3 = 80;
                        break;
                    case at.g /*1*/:
                        i3 = 76;
                        break;
                    case at.i /*2*/:
                        i3 = 14;
                        break;
                    case at.o /*3*/:
                        i3 = 91;
                        break;
                    default:
                        i3 = 99;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "<%}/\u000e5!l>\u0011#?k7\u000638a)L3>k:\u00175";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u0010? ,\u000b18}:\u0013 b`>\u0017";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = "<%}/\u000e5!l>\u0011#?k7\u000638a)L )|6\n#?g4\r#lj>\r9)j";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    protected int k() {
        return 2131230852;
    }

    public void onCreate(Bundle bundle) {
        Log.i(z[2]);
        super.onCreate(bundle);
        nf.a(k.NEW_BROADCAST_LIST);
        ActionBar supportActionBar = getSupportActionBar();
        supportActionBar.setDisplayHomeAsUpEnabled(true);
        supportActionBar.setTitle(2131231547);
        if (bundle == null && !App.v((Context) this)) {
            RequestPermissionActivity.b(this, 2131231611, 2131231610);
        }
    }

    protected int e() {
        if (a59.j == 0) {
            return -1;
        }
        return a59.j;
    }

    protected void i() {
        super.i();
    }

    protected int g() {
        return 2;
    }

    public void onDestroy() {
        Log.i(z[0]);
        super.onDestroy();
    }

    protected int f() {
        return 2131231009;
    }

    protected String j() {
        return getString(2131231547);
    }

    protected void d() {
        boolean z = DialogToastActivity.f;
        String k = qa.k();
        Vector vector = new Vector(this.w.size());
        Iterator it = this.w.iterator();
        while (it.hasNext()) {
            vector.add(((l5) it.next()).p);
            if (z) {
                break;
            }
        }
        qm.a(k, vector);
        co coVar = new co(k, "", null);
        coVar.b = App.av();
        coVar.d = 6;
        coVar.z = 9;
        coVar.Q = vector;
        coVar.t = App.ad() + z[3];
        App.aK.a(coVar);
        HashSet hashSet = new HashSet();
        it = this.w.iterator();
        while (it.hasNext()) {
            hashSet.add(((l5) it.next()).p);
            if (z) {
                break;
            }
        }
        App.a(k, false);
        startActivity(Conversation.a(qa.a(k, "", System.currentTimeMillis())));
        finish();
    }

    protected String c() {
        return getString(2131231397).toUpperCase();
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        if (i == 150) {
            if (i2 != -1) {
                Log.i(z[1]);
                finish();
                if (!DialogToastActivity.f) {
                    return;
                }
            }
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    protected void a(ListView listView) {
        TextView textView = new TextView(this);
        textView.setTextSize(ConversationRow.a(getResources()));
        textView.setPadding(0, getResources().getDimensionPixelSize(2131427451), 0, getResources().getDimensionPixelSize(2131427451));
        textView.setText(getString(2131230855, new Object[]{"\u202a" + VerifyNumber.b(App.ay.cc, App.ay.jabber_id.substring(App.ay.cc.length())) + "\u202c"}));
        aam.a(textView);
        listView.addFooterView(textView);
    }
}
