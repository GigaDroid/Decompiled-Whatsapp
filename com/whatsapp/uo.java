package com.whatsapp;

import android.os.AsyncTask;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.List;
import org.json.JSONException;

class uo extends AsyncTask {
    final aon a;

    protected void onPostExecute(Object obj) {
        a((List) obj);
    }

    uo(aon com_whatsapp_aon, h9 h9Var) {
        this(com_whatsapp_aon);
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    protected List a(Void[] voidArr) {
        Throwable e;
        try {
            return WebImagePicker.b(this.a.c).b();
        } catch (IOException e2) {
            e = e2;
            Log.a(e);
            return null;
        } catch (JSONException e3) {
            e = e3;
            Log.a(e);
            return null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a(java.util.List r8) {
        /*
        r7 = this;
        r6 = 8;
        r1 = 1;
        r2 = 0;
        r3 = com.whatsapp.DialogToastActivity.f;
        r4 = r7.a;
        r0 = r7.a;
        r0 = r0.c;
        r0 = com.whatsapp.WebImagePicker.b(r0);
        r0 = r0.c();
        if (r0 == 0) goto L_0x00c8;
    L_0x0016:
        r0 = r7.a;
        r0 = r0.c;
        r0 = com.whatsapp.WebImagePicker.f(r0);
        r0 = r0.size();
        r5 = 100;
        if (r0 >= r5) goto L_0x00c8;
    L_0x0026:
        r0 = r1;
    L_0x0027:
        com.whatsapp.aon.a(r4, r0);
        r0 = r7.a;
        r0 = com.whatsapp.aon.b(r0);
        if (r0 == 0) goto L_0x004a;
    L_0x0032:
        r0 = r7.a;
        r0 = r0.c;
        r0 = com.whatsapp.WebImagePicker.j(r0);
        r0.setVisibility(r6);
        r0 = r7.a;
        r0 = r0.c;
        r0 = com.whatsapp.WebImagePicker.l(r0);
        r0.setVisibility(r2);
        if (r3 == 0) goto L_0x0060;
    L_0x004a:
        r0 = r7.a;
        r0 = r0.c;
        r0 = com.whatsapp.WebImagePicker.j(r0);
        r0.setVisibility(r2);
        r0 = r7.a;
        r0 = r0.c;
        r0 = com.whatsapp.WebImagePicker.l(r0);
        r0.setVisibility(r6);
    L_0x0060:
        r0 = r7.a;
        r4 = 0;
        com.whatsapp.aon.a(r0, r4);
        if (r8 == 0) goto L_0x007e;
    L_0x0068:
        r0 = r7.a;
        r0 = r0.c;
        r0 = com.whatsapp.WebImagePicker.f(r0);
        r8.removeAll(r0);
        r0 = r7.a;
        r0 = r0.c;
        r0 = com.whatsapp.WebImagePicker.f(r0);
        r0.addAll(r8);
    L_0x007e:
        r0 = r7.a;
        r0 = r0.c;
        r0 = com.whatsapp.WebImagePicker.f(r0);
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x00c2;
    L_0x008c:
        r0 = r7.a;
        r0 = r0.c;
        r0 = r0.a();
        r0 = r0.getEmptyView();
        r0 = (android.widget.TextView) r0;
        if (r8 != 0) goto L_0x00a4;
    L_0x009c:
        r4 = 2131231690; // 0x7f0803ca float:1.8079468E38 double:1.0529683614E-314;
        r0.setText(r4);
        if (r3 == 0) goto L_0x00c2;
    L_0x00a4:
        r3 = r7.a;
        r3 = r3.c;
        r4 = 2131231685; // 0x7f0803c5 float:1.8079458E38 double:1.052968359E-314;
        r1 = new java.lang.Object[r1];
        r5 = r7.a;
        r5 = r5.c;
        r5 = com.whatsapp.WebImagePicker.b(r5);
        r5 = r5.d();
        r1[r2] = r5;
        r1 = r3.getString(r4, r1);
        r0.setText(r1);
    L_0x00c2:
        r0 = r7.a;
        r0.notifyDataSetChanged();
        return;
    L_0x00c8:
        r0 = r2;
        goto L_0x0027;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.uo.a(java.util.List):void");
    }

    private uo(aon com_whatsapp_aon) {
        this.a = com_whatsapp_aon;
    }
}
