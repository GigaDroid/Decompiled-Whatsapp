package com.whatsapp;

import android.database.Cursor;
import android.database.CursorWrapper;
import android.database.sqlite.SQLiteDatabaseCorruptException;

class axz extends CursorWrapper {
    private nt a;

    public void deactivate() {
        super.deactivate();
    }

    public boolean requery() {
        try {
            if (this.a != null) {
                this.a.b();
            }
            Boolean valueOf = Boolean.valueOf(super.requery());
            try {
                if (this.a != null) {
                    this.a.a();
                }
                return valueOf.booleanValue();
            } catch (SQLiteDatabaseCorruptException e) {
                throw e;
            }
        } catch (SQLiteDatabaseCorruptException e2) {
            throw e2;
        }
    }

    public int getCount() {
        try {
            return super.getCount();
        } catch (SQLiteDatabaseCorruptException e) {
            App.aK.r();
            throw e;
        }
    }

    public axz(Cursor cursor, nt ntVar) {
        super(cursor);
        this.a = ntVar;
    }
}
