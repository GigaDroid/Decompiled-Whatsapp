package com.whatsapp;

import android.content.Context;
import com.whatsapp.protocol.co;

public class ConversationRowCall extends ConversationRow {
    protected int h() {
        return 2130903121;
    }

    public void a(co coVar, boolean z) {
        if (this.e != coVar || z) {
            a(coVar);
        }
        super.a(coVar, z);
    }

    public ConversationRowCall(Context context, co coVar) {
        super(context, coVar);
    }

    protected int g() {
        return 2130903120;
    }

    private void a(co coVar) {
    }
}
