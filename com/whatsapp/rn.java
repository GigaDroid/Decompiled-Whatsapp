package com.whatsapp;

import android.os.AsyncTask;
import android.view.ViewGroup.LayoutParams;
import android.widget.ListView;
import android.widget.ScrollView;
import com.whatsapp.contact.b;
import com.whatsapp.contact.f;
import com.whatsapp.contact.k;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Set;
import org.v;
import org.whispersystems.at;

class rn extends AsyncTask {
    private static final String z;
    final ContactPickerHelp a;

    static {
        char[] toCharArray = "r\u0015\u0007s\u001ar\u000e\u0001b\u0017aU\u001ao\u0014f\u0013\u0007q\u0012b\u0013\u000bk\u001e>\u0019\u000bt\u000fp\u000e\u001ct[".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 17;
                    break;
                case at.g /*1*/:
                    i2 = 122;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_radioButtonStyle;
                    break;
                case at.o /*3*/:
                    i2 = 7;
                    break;
                default:
                    i2 = 123;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    protected void a(Set set) {
        this.a.e();
        if (set != null) {
            if (!set.isEmpty()) {
                this.a.findViewById(2131755462).setVisibility(0);
                Log.i(z + this.a.w.isChecked());
                this.a.findViewById(2131755461).setVisibility(0);
                this.a.findViewById(2131755464).setVisibility(0);
            }
            this.a.t.setVisibility(0);
            this.a.t.setText(this.a.getString(2131230970, new Object[]{Integer.valueOf(set.size())}));
            this.a.a().setVisibility(0);
            this.a.x.clear();
            this.a.x.addAll(set);
            Collections.sort(this.a.x, new k());
            this.a.u.notifyDataSetChanged();
            ListView a = this.a.a();
            LayoutParams layoutParams = a.getLayoutParams();
            layoutParams.height = (int) (((float) set.size()) * this.a.getResources().getDimension(2131427432));
            a.setLayoutParams(layoutParams);
            if (!set.isEmpty()) {
                ((ScrollView) this.a.findViewById(2131755411)).post(new a49(this));
            }
            if (!DialogToastActivity.f) {
                return;
            }
        }
        this.a.a(2131230969);
    }

    protected void onPreExecute() {
        this.a.f(2131231768);
        this.a.t.setVisibility(4);
        this.a.a().setVisibility(4);
        this.a.findViewById(2131755462).setVisibility(8);
        this.a.findViewById(2131755461).setVisibility(8);
        this.a.findViewById(2131755464).setVisibility(8);
    }

    private rn(ContactPickerHelp contactPickerHelp) {
        this.a = contactPickerHelp;
    }

    protected Set a(Void[] voidArr) {
        return b.b(f.INVISIBLE_ONLY);
    }

    rn(ContactPickerHelp contactPickerHelp, a_t com_whatsapp_a_t) {
        this(contactPickerHelp);
    }

    protected void onPostExecute(Object obj) {
        a((Set) obj);
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }
}
