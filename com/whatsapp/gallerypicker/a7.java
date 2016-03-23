package com.whatsapp.gallerypicker;

import com.whatsapp.App;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.whispersystems.at;

public class a7 extends GregorianCalendar {
    public int a;
    public int b;

    public a7(a7 a7Var) {
        this.a = a7Var.a;
        this.b = a7Var.b;
        setTime(a7Var.getTime());
    }

    public a7(int i, Calendar calendar) {
        this.a = i;
        setTime(calendar.getTime());
    }

    public String toString() {
        switch (this.a) {
            case at.g /*1*/:
                return App.z().getString(2131231725);
            case at.i /*2*/:
                return App.z().getString(2131232285);
            case at.o /*3*/:
                return App.z().getString(2131231466);
            case at.p /*4*/:
                return aw.a().format(getTime());
            default:
                return Integer.toString(get(1));
        }
    }
}
