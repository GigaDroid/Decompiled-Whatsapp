package com.whatsapp;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

public class ArchivedConversationsFragment extends ConversationsFragment {
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    protected void a(View view) {
        super.a(view);
        if (qa.f() != 0) {
            getListView().getViewTreeObserver().addOnGlobalLayoutListener(new ty(this, view.getTop()));
        }
    }

    protected ArrayList a() {
        boolean z = DialogToastActivity.f;
        ArrayList j = qa.j();
        ArrayList arrayList = new ArrayList(j.size());
        Iterator it = j.iterator();
        while (it.hasNext()) {
            arrayList.add(new wu((String) it.next()));
            if (z) {
                break;
            }
        }
        return arrayList;
    }

    public void b() {
        super.b();
        if (qa.f() == 0) {
            getActivity().finish();
        }
    }

    protected void e() {
        this.f.setVisibility(8);
        this.b.setVisibility(8);
        this.t.setVisibility(8);
    }
}
