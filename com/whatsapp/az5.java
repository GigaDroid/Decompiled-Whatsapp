package com.whatsapp;

import com.whatsapp.fieldstats.al;
import com.whatsapp.fieldstats.i;

class az5 implements Runnable {
    final al a;
    final SearchFAQ b;

    az5(SearchFAQ searchFAQ, al alVar) {
        this.b = searchFAQ;
        this.a = alVar;
    }

    public void run() {
        i.a(this.b, this.a);
    }
}
