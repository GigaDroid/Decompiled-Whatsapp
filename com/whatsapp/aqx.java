package com.whatsapp;

import android.support.v7.appcompat.R;
import android.support.v7.view.ActionMode;
import android.support.v7.view.ActionMode.Callback;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.EditText;
import org.v;
import org.whispersystems.at;

class aqx implements Callback {
    private static final String z;
    final Conversation a;

    static {
        char[] toCharArray = "h\n\u0014E5p4\u0004D&h\n\u0019O2".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 4;
                    break;
                case at.g /*1*/:
                    i2 = arj.Theme_seekBarStyle;
                    break;
                case at.i /*2*/:
                    i2 = arj.Theme_switchStyle;
                    break;
                case at.o /*3*/:
                    i2 = 42;
                    break;
                default:
                    i2 = 64;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return false;
    }

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return false;
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        ViewGroup viewGroup = (ViewGroup) aam.a((LayoutInflater) this.a.getSupportActionBar().getThemedContext().getSystemService(z), 2130903142, null, false);
        actionMode.setCustomView(viewGroup);
        EditText editText = (EditText) viewGroup.findViewById(R.id.search_src_text);
        editText.addTextChangedListener(new a2j(this, editText));
        editText.setOnEditorActionListener(new rm(this));
        viewGroup.findViewById(2131755566).setOnClickListener(new avb(this));
        this.a.findViewById(2131755567).setOnClickListener(new w(this));
        editText.setText(Conversation.z(this.a));
        editText.selectAll();
        editText.requestFocus();
        editText.setSelected(true);
        return true;
    }

    public void onDestroyActionMode(ActionMode actionMode) {
        Conversation.a(this.a, null);
        Conversation.c(this.a, null);
        Conversation.a(this.a, null);
        if (!Conversation.g(this.a) || qm.h(this.a.aI.p)) {
            Conversation.H(this.a).setVisibility(0);
        }
        Conversation.c(this.a);
        this.a.bd.notifyDataSetChanged();
        Conversation.o(this.a).requestFocus();
    }

    aqx(Conversation conversation) {
        this.a = conversation;
    }
}
