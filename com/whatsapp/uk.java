package com.whatsapp;

import android.support.v4.view.MenuItemCompat;
import android.support.v7.view.ActionMode;
import android.support.v7.view.ActionMode.Callback;
import android.view.Menu;
import org.v;
import org.whispersystems.at;

class uk implements Callback {
    private static final String z;
    final ContactsFragment a;

    static {
        char[] toCharArray = "DQM8".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 46;
                    break;
                case at.g /*1*/:
                    i2 = 56;
                    break;
                case at.i /*2*/:
                    i2 = 41;
                    break;
                case at.o /*3*/:
                    i2 = 75;
                    break;
                default:
                    i2 = 123;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        MenuItemCompat.setShowAsAction(menu.add(0, 2131755039, 0, 2131231543), 6);
        MenuItemCompat.setShowAsAction(menu.add(0, 2131755043, 0, 2131231429), 6);
        return true;
    }

    public void onDestroyActionMode(ActionMode actionMode) {
        ContactsFragment.a(this.a, null);
        ContactsFragment.f(this.a).notifyDataSetChanged();
        ContactsFragment.a(this.a, null);
    }

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return false;
    }

    uk(ContactsFragment contactsFragment) {
        this.a = contactsFragment;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onActionItemClicked(android.support.v7.view.ActionMode r6, android.view.MenuItem r7) {
        /*
        r5 = this;
        r1 = com.whatsapp.DialogToastActivity.f;
        r0 = r7.getItemId();
        r2 = 2131755039; // 0x7f10001f float:1.9140946E38 double:1.05322693E-314;
        if (r0 != r2) goto L_0x0058;
    L_0x000b:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r0 = r5.a;
        r0 = com.whatsapp.ContactsFragment.c(r0);
        r0 = r0.keySet();
        r3 = r0.iterator();
    L_0x001e:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x003b;
    L_0x0024:
        r0 = r3.next();
        r0 = (java.lang.String) r0;
        r4 = r2.length();
        if (r4 == 0) goto L_0x0036;
    L_0x0030:
        r4 = ",";
        r2.append(r4);
    L_0x0036:
        r2.append(r0);
        if (r1 == 0) goto L_0x001e;
    L_0x003b:
        r0 = new android.content.Intent;
        r3 = r5.a;
        r3 = r3.getActivity();
        r4 = com.whatsapp.ListMembersSelector.class;
        r0.<init>(r3, r4);
        r3 = z;
        r2 = r2.toString();
        r0.putExtra(r3, r2);
        r2 = r5.a;
        r2.startActivity(r0);
        if (r1 == 0) goto L_0x0076;
    L_0x0058:
        r0 = r7.getItemId();
        r1 = 2131755043; // 0x7f100023 float:1.9140954E38 double:1.053226932E-314;
        if (r0 != r1) goto L_0x0076;
    L_0x0061:
        r0 = r5.a;
        r0 = r0.getActivity();
        r1 = com.whatsapp.fieldstats.co.MULTISELECT;
        r2 = r5.a;
        r2 = com.whatsapp.ContactsFragment.c(r2);
        r2 = r2.keySet();
        com.whatsapp.NewGroup.a(r0, r1, r2);
    L_0x0076:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.uk.onActionItemClicked(android.support.v7.view.ActionMode, android.view.MenuItem):boolean");
    }
}
