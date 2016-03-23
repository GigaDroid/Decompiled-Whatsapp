package com.whatsapp;

import android.content.Context;
import com.whatsapp.protocol.co;
import com.whatsapp.util.ap;

public abstract class ConversationRowMedia extends ConversationRow {
    protected ap Q;
    protected ap R;
    protected ap S;
    protected ap T;

    public ConversationRowMedia(Context context, co coVar) {
        super(context, coVar);
        this.S = new yl(this);
        this.T = new y1(this);
        this.R = new yp(this);
        this.Q = new yb(this);
    }

    protected abstract void f();
}
