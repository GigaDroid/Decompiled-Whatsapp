package com.whatsapp;

import android.os.AsyncTask;
import java.util.ArrayList;

class ar8 extends AsyncTask {
    final ContactsFragment a;

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a(java.util.ArrayList r3) {
        /*
        r2 = this;
        r0 = r2.a;
        r1 = 0;
        com.whatsapp.ContactsFragment.a(r0, r1);
        r0 = r2.a;
        r1 = com.whatsapp.ContactsFragment.d(r0);
        monitor-enter(r1);
        r0 = r2.a;	 Catch:{ all -> 0x0067 }
        r0 = com.whatsapp.ContactsFragment.d(r0);	 Catch:{ all -> 0x0067 }
        r0.clear();	 Catch:{ all -> 0x0067 }
        r0 = r2.a;	 Catch:{ all -> 0x0067 }
        r0 = com.whatsapp.ContactsFragment.d(r0);	 Catch:{ all -> 0x0067 }
        r0.addAll(r3);	 Catch:{ all -> 0x0067 }
        monitor-exit(r1);	 Catch:{ all -> 0x0067 }
        r0 = r2.a;
        r0 = com.whatsapp.ContactsFragment.g(r0);
        r0.clear();
        r0 = r3.isEmpty();
        if (r0 != 0) goto L_0x0053;
    L_0x002f:
        r0 = r2.a;
        r0 = com.whatsapp.ContactsFragment.i(r0);
        r0 = android.text.TextUtils.isEmpty(r0);
        if (r0 == 0) goto L_0x0048;
    L_0x003b:
        r0 = r2.a;
        r0 = com.whatsapp.ContactsFragment.g(r0);
        r0.addAll(r3);
        r0 = com.whatsapp.DialogToastActivity.f;
        if (r0 == 0) goto L_0x0053;
    L_0x0048:
        r0 = r2.a;
        r1 = r2.a;
        r1 = com.whatsapp.ContactsFragment.i(r1);
        r0.a(r1);
    L_0x0053:
        r0 = r2.a;
        com.whatsapp.ContactsFragment.a(r0);
        r0 = r2.a;
        com.whatsapp.ContactsFragment.b(r0);
        r0 = r2.a;
        r0 = com.whatsapp.ContactsFragment.f(r0);
        r0.notifyDataSetChanged();
        return;
    L_0x0067:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0067 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ar8.a(java.util.ArrayList):void");
    }

    ar8(ContactsFragment contactsFragment, yn ynVar) {
        this(contactsFragment);
    }

    protected Object doInBackground(Object[] objArr) {
        return a((Void[]) objArr);
    }

    protected void onPostExecute(Object obj) {
        a((ArrayList) obj);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected java.util.ArrayList a(java.lang.Void[] r6) {
        /*
        r5 = this;
        r1 = com.whatsapp.DialogToastActivity.f;
        r2 = new java.util.ArrayList;
        r2.<init>();
        r0 = com.whatsapp.App.as;
        r0.d(r2);
        r0 = r5.isCancelled();
        if (r0 != 0) goto L_0x0039;
    L_0x0012:
        r3 = new java.util.HashSet;
        r0 = r2.size();
        r4 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r3.<init>(r0, r4);
        r4 = r2.iterator();
    L_0x0021:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x0034;
    L_0x0027:
        r0 = r4.next();
        r0 = (com.whatsapp.l5) r0;
        r0 = r0.q;
        r3.add(r0);
        if (r1 == 0) goto L_0x0021;
    L_0x0034:
        r0 = com.whatsapp.App.as;
        r0.a(r2, r3);
    L_0x0039:
        r0 = r5.isCancelled();
        if (r0 != 0) goto L_0x005a;
    L_0x003f:
        r0 = r5.a;
        r0 = r0.getActivity();
        if (r0 == 0) goto L_0x0055;
    L_0x0047:
        r3 = new com.whatsapp.a3s;
        r0 = r0.getApplicationContext();
        r3.<init>(r5, r0);
        java.util.Collections.sort(r2, r3);
        if (r1 == 0) goto L_0x0058;
    L_0x0055:
        r2.clear();
    L_0x0058:
        if (r1 == 0) goto L_0x005d;
    L_0x005a:
        r2.clear();
    L_0x005d:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.ar8.a(java.lang.Void[]):java.util.ArrayList");
    }

    private ar8(ContactsFragment contactsFragment) {
        this.a = contactsFragment;
    }
}
