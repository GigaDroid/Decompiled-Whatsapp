package com.whatsapp;

import android.widget.AdapterView.OnItemClickListener;

class arn implements OnItemClickListener {
    final ContactsFragment a;

    arn(ContactsFragment contactsFragment) {
        this.a = contactsFragment;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onItemClick(android.widget.AdapterView r9, android.view.View r10, int r11, long r12) {
        /*
        r8 = this;
        r7 = 0;
        r1 = com.whatsapp.DialogToastActivity.f;
        r2 = r11 + -1;
        r0 = r8.a;
        r0 = com.whatsapp.ContactsFragment.f(r0);
        r0 = r0.getCount();
        if (r2 >= r0) goto L_0x00b4;
    L_0x0011:
        r0 = r8.a;
        r0 = com.whatsapp.ContactsFragment.c(r0);
        if (r0 != 0) goto L_0x0039;
    L_0x0019:
        r0 = r8.a;
        r0 = com.whatsapp.ContactsFragment.f(r0);
        r0 = r0.a(r2);
        r3 = r0.m;
        if (r3 == 0) goto L_0x0032;
    L_0x0027:
        r3 = r8.a;
        r4 = com.whatsapp.Conversation.a(r0);
        r3.startActivity(r4);
        if (r1 == 0) goto L_0x0037;
    L_0x0032:
        r3 = r8.a;
        com.whatsapp.ContactsFragment.a(r3, r0);
    L_0x0037:
        if (r1 == 0) goto L_0x00e5;
    L_0x0039:
        r0 = r8.a;
        r0 = com.whatsapp.ContactsFragment.f(r0);
        r3 = r0.a(r2);
        r0 = r3.m;
        if (r0 == 0) goto L_0x00b2;
    L_0x0047:
        r0 = r8.a;
        r0 = com.whatsapp.ContactsFragment.c(r0);
        r4 = r3.p;
        r0 = r0.containsKey(r4);
        if (r0 == 0) goto L_0x0065;
    L_0x0055:
        r0 = r8.a;
        r0 = com.whatsapp.ContactsFragment.c(r0);
        r4 = r3.p;
        r0.remove(r4);
        r10.setBackgroundResource(r7);
        if (r1 == 0) goto L_0x00ad;
    L_0x0065:
        r0 = com.whatsapp.a59.j;
        if (r0 <= 0) goto L_0x009c;
    L_0x0069:
        r0 = r8.a;
        r0 = com.whatsapp.ContactsFragment.c(r0);
        r0 = r0.size();
        r4 = com.whatsapp.a59.j;
        if (r0 < r4) goto L_0x009c;
    L_0x0077:
        r0 = r8.a;
        r0 = r0.getActivity();
        r0 = (com.whatsapp.by) r0;
        r4 = r8.a;
        r5 = 2131230852; // 0x7f080084 float:1.8077768E38 double:1.0529679473E-314;
        r4 = r4.getString(r5);
        r5 = 1;
        r5 = new java.lang.Object[r5];
        r6 = com.whatsapp.a59.j;
        r6 = java.lang.Integer.valueOf(r6);
        r5[r7] = r6;
        r4 = java.lang.String.format(r4, r5);
        r0.f(r4);
        if (r1 == 0) goto L_0x00ad;
    L_0x009c:
        r0 = r8.a;
        r0 = com.whatsapp.ContactsFragment.c(r0);
        r4 = r3.p;
        r0.put(r4, r3);
        r0 = 2130837744; // 0x7f0200f0 float:1.728045E38 double:1.052773726E-314;
        r10.setBackgroundResource(r0);
    L_0x00ad:
        r0 = r8.a;
        com.whatsapp.ContactsFragment.h(r0);
    L_0x00b2:
        if (r1 == 0) goto L_0x00e5;
    L_0x00b4:
        r0 = r8.a;
        r0 = com.whatsapp.ContactsFragment.f(r0);
        r0 = r0.getCount();
        if (r2 != r0) goto L_0x00d2;
    L_0x00c0:
        r0 = com.whatsapp.fieldstats.k.TELL_A_FRIEND;
        r3 = com.whatsapp.fieldstats.c.CONTACTS_LIST;
        com.whatsapp.nf.a(r0, r3);
        r0 = r8.a;
        r0 = r0.getActivity();
        com.whatsapp.App.b(r0);
        if (r1 == 0) goto L_0x00e5;
    L_0x00d2:
        r0 = r8.a;
        r0 = com.whatsapp.ContactsFragment.f(r0);
        r0 = r0.getCount();
        r0 = r0 + 1;
        if (r2 != r0) goto L_0x00e5;
    L_0x00e0:
        r0 = r8.a;
        com.whatsapp.ContactsFragment.m(r0);
    L_0x00e5:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.arn.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }
}
