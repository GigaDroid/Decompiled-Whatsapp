package com.whatsapp;

import android.view.View;
import com.whatsapp.fieldstats.cd;
import com.whatsapp.util.ap;
import org.whispersystems.at;

class yk extends ap {
    final CallsFragment b;

    public void a(View view) {
        rd rdVar = (rd) view.getTag();
        if (rdVar != null) {
            cd cdVar;
            l5 f = rdVar.f();
            switch (ar1.a[rdVar.d().ordinal()]) {
                case at.g /*1*/:
                    cdVar = cd.CALLS_TAB_OUTGOING;
                    break;
                case at.i /*2*/:
                    cdVar = cd.CALLS_TAB_INCOMING;
                    break;
                case at.o /*3*/:
                    cdVar = cd.CALLS_TAB_MISSED;
                    break;
                default:
                    cdVar = null;
                    break;
            }
            App.a(f, this.b.getActivity(), cdVar, true);
        }
    }

    yk(CallsFragment callsFragment) {
        this.b = callsFragment;
    }
}
