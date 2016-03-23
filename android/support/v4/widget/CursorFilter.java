package android.support.v4.widget;

import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filter.FilterResults;

class CursorFilter extends Filter {
    CursorFilterClient mClient;

    interface CursorFilterClient {
        void changeCursor(Cursor cursor);

        CharSequence convertToString(Cursor cursor);

        Cursor getCursor();

        Cursor runQueryOnBackgroundThread(CharSequence charSequence);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r4) {
        /*
        r3 = this;
        r0 = r3.mClient;
        r0 = r0.runQueryOnBackgroundThread(r4);
        r1 = new android.widget.Filter$FilterResults;
        r1.<init>();
        if (r0 == 0) goto L_0x0019;
    L_0x000d:
        r2 = r0.getCount();
        r1.count = r2;
        r1.values = r0;
        r0 = android.support.v4.widget.CursorAdapter.a;
        if (r0 == 0) goto L_0x001f;
    L_0x0019:
        r0 = 0;
        r1.count = r0;
        r0 = 0;
        r1.values = r0;
    L_0x001f:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.CursorFilter.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    CursorFilter(CursorFilterClient cursorFilterClient) {
        this.mClient = cursorFilterClient;
    }

    protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
        Cursor cursor = this.mClient.getCursor();
        if (filterResults.values != null && filterResults.values != cursor) {
            this.mClient.changeCursor((Cursor) filterResults.values);
        }
    }

    public CharSequence convertResultToString(Object obj) {
        return this.mClient.convertToString((Cursor) obj);
    }
}
