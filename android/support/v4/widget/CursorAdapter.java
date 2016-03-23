package android.support.v4.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;
import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

public abstract class CursorAdapter extends BaseAdapter implements Filterable, CursorFilterClient {
    public static int a;
    private static final String[] z;
    protected boolean mAutoRequery;
    protected ChangeObserver mChangeObserver;
    protected Context mContext;
    protected Cursor mCursor;
    protected CursorFilter mCursorFilter;
    protected DataSetObserver mDataSetObserver;
    protected boolean mDataValid;
    protected FilterQueryProvider mFilterQueryProvider;
    protected int mRowIDColumn;

    class ChangeObserver extends ContentObserver {
        final CursorAdapter this$0;

        public void onChange(boolean z) {
            this.this$0.onContentChanged();
        }

        public ChangeObserver(CursorAdapter cursorAdapter) {
            this.this$0 = cursorAdapter;
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }
    }

    class MyDataSetObserver extends DataSetObserver {
        final CursorAdapter this$0;

        MyDataSetObserver(CursorAdapter cursorAdapter, 1 1) {
            this(cursorAdapter);
        }

        private MyDataSetObserver(CursorAdapter cursorAdapter) {
            this.this$0 = cursorAdapter;
        }

        public void onInvalidated() {
            this.this$0.mDataValid = false;
            this.this$0.notifyDataSetInvalidated();
        }

        public void onChanged() {
            this.this$0.mDataValid = true;
            this.this$0.notifyDataSetChanged();
        }
    }

    static {
        String[] strArr = new String[4];
        String str = "\u001c\u007ff";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case v.m /*0*/:
                        i3 = 67;
                        break;
                    case at.g /*1*/:
                        i3 = 22;
                        break;
                    case at.i /*2*/:
                        i3 = 2;
                        break;
                    case at.o /*3*/:
                        i3 = arj.Theme_seekBarStyle;
                        break;
                    default:
                        i3 = 99;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "7~k\u0018C0~m\u001e\u000f'6m\u0005\u000f:6`\u000eC wn\u0007\u0006'6u\u0003\u0006-6v\u0003\u0006cuw\u0019\u0010,d\"\u0002\u0010c`c\u0007\n'";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "\u001c\u007ff";
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    z = strArr3;
                    return;
                default:
                    strArr2[i] = str;
                    str = " yw\u0007\u0007-1vK\u000e,`gK\u00006dq\u0004\u0011cbmK\u0013,ek\u001f\n,x\"";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public abstract void bindView(View view, Context context, Cursor cursor);

    public abstract View newView(Context context, Cursor cursor, ViewGroup viewGroup);

    public long getItemId(int i) {
        long j = 0;
        try {
            if (this.mDataValid) {
                if (this.mCursor != null) {
                    try {
                        if (this.mCursor.moveToPosition(i)) {
                            j = this.mCursor.getLong(this.mRowIDColumn);
                        }
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                }
            }
            return j;
        } catch (IllegalStateException e2) {
            throw e2;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    public Cursor getCursor() {
        return this.mCursor;
    }

    public void changeCursor(Cursor cursor) {
        Cursor swapCursor = swapCursor(cursor);
        if (swapCursor != null) {
            try {
                swapCursor.close();
            } catch (IllegalStateException e) {
                throw e;
            }
        }
    }

    public View newDropDownView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return newView(context, cursor, viewGroup);
    }

    protected void onContentChanged() {
        try {
            if (!this.mAutoRequery) {
                return;
            }
            if (this.mCursor != null) {
                try {
                    if (!this.mCursor.isClosed()) {
                        this.mDataValid = this.mCursor.requery();
                    }
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
        } catch (IllegalStateException e2) {
            throw e2;
        } catch (IllegalStateException e22) {
            throw e22;
        }
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            if (!this.mDataValid) {
                return null;
            }
            this.mCursor.moveToPosition(i);
            if (view == null) {
                View newDropDownView = newDropDownView(this.mContext, this.mCursor, viewGroup);
                if (a == 0) {
                    view = newDropDownView;
                }
            }
            bindView(view, this.mContext, this.mCursor);
            return view;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public int getCount() {
        try {
            if (this.mDataValid) {
                if (this.mCursor != null) {
                    return this.mCursor.getCount();
                }
            }
            return 0;
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public Cursor swapCursor(Cursor cursor) {
        try {
            if (cursor == this.mCursor) {
                return null;
            }
            Cursor cursor2 = this.mCursor;
            if (cursor2 != null) {
                try {
                    if (this.mChangeObserver != null) {
                        cursor2.unregisterContentObserver(this.mChangeObserver);
                    }
                    try {
                        if (this.mDataSetObserver != null) {
                            cursor2.unregisterDataSetObserver(this.mDataSetObserver);
                        }
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                } catch (IllegalStateException e2) {
                    throw e2;
                }
            }
            try {
                this.mCursor = cursor;
                if (cursor != null) {
                    if (this.mChangeObserver != null) {
                        cursor.registerContentObserver(this.mChangeObserver);
                    }
                    try {
                        if (this.mDataSetObserver != null) {
                            cursor.registerDataSetObserver(this.mDataSetObserver);
                        }
                        try {
                            this.mRowIDColumn = cursor.getColumnIndexOrThrow(z[0]);
                            this.mDataValid = true;
                            notifyDataSetChanged();
                            if (a == 0) {
                                return cursor2;
                            }
                        } catch (IllegalStateException e22) {
                            throw e22;
                        }
                    } catch (IllegalStateException e222) {
                        throw e222;
                    }
                }
                this.mRowIDColumn = -1;
                this.mDataValid = false;
                notifyDataSetInvalidated();
                return cursor2;
            } catch (IllegalStateException e2222) {
                throw e2222;
            } catch (IllegalStateException e22222) {
                throw e22222;
            }
        } catch (IllegalStateException e222222) {
            throw e222222;
        }
    }

    public Object getItem(int i) {
        try {
            if (this.mDataValid) {
                if (this.mCursor != null) {
                    this.mCursor.moveToPosition(i);
                    return this.mCursor;
                }
            }
            return null;
        } catch (IllegalStateException e) {
            throw e;
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void init(android.content.Context r6, android.database.Cursor r7, int r8) {
        /*
        r5 = this;
        r1 = 0;
        r0 = 1;
        r3 = a;
        r2 = r8 & 1;
        if (r2 != r0) goto L_0x0068;
    L_0x0008:
        r2 = r8 | 2;
        r4 = 1;
        r5.mAutoRequery = r4;	 Catch:{ IllegalStateException -> 0x0058 }
        if (r3 == 0) goto L_0x0012;
    L_0x000f:
        r4 = 0;
        r5.mAutoRequery = r4;	 Catch:{ IllegalStateException -> 0x0058 }
    L_0x0012:
        if (r7 == 0) goto L_0x005a;
    L_0x0014:
        r5.mCursor = r7;	 Catch:{ IllegalStateException -> 0x005c }
        r5.mDataValid = r0;	 Catch:{ IllegalStateException -> 0x005c }
        r5.mContext = r6;	 Catch:{ IllegalStateException -> 0x005c }
        if (r0 == 0) goto L_0x005e;
    L_0x001c:
        r1 = z;	 Catch:{ IllegalStateException -> 0x005c }
        r4 = 3;
        r1 = r1[r4];	 Catch:{ IllegalStateException -> 0x005c }
        r1 = r7.getColumnIndexOrThrow(r1);	 Catch:{ IllegalStateException -> 0x005c }
    L_0x0025:
        r5.mRowIDColumn = r1;	 Catch:{ IllegalStateException -> 0x0060 }
        r1 = r2 & 2;
        r2 = 2;
        if (r1 != r2) goto L_0x003d;
    L_0x002c:
        r1 = new android.support.v4.widget.CursorAdapter$ChangeObserver;	 Catch:{ IllegalStateException -> 0x0062 }
        r1.<init>(r5);	 Catch:{ IllegalStateException -> 0x0062 }
        r5.mChangeObserver = r1;	 Catch:{ IllegalStateException -> 0x0062 }
        r1 = new android.support.v4.widget.CursorAdapter$MyDataSetObserver;	 Catch:{ IllegalStateException -> 0x0062 }
        r2 = 0;
        r1.<init>(r5, r2);	 Catch:{ IllegalStateException -> 0x0062 }
        r5.mDataSetObserver = r1;	 Catch:{ IllegalStateException -> 0x0062 }
        if (r3 == 0) goto L_0x0043;
    L_0x003d:
        r1 = 0;
        r5.mChangeObserver = r1;	 Catch:{ IllegalStateException -> 0x0062 }
        r1 = 0;
        r5.mDataSetObserver = r1;	 Catch:{ IllegalStateException -> 0x0062 }
    L_0x0043:
        if (r0 == 0) goto L_0x0057;
    L_0x0045:
        r0 = r5.mChangeObserver;	 Catch:{ IllegalStateException -> 0x0064 }
        if (r0 == 0) goto L_0x004e;
    L_0x0049:
        r0 = r5.mChangeObserver;	 Catch:{ IllegalStateException -> 0x0064 }
        r7.registerContentObserver(r0);	 Catch:{ IllegalStateException -> 0x0064 }
    L_0x004e:
        r0 = r5.mDataSetObserver;	 Catch:{ IllegalStateException -> 0x0066 }
        if (r0 == 0) goto L_0x0057;
    L_0x0052:
        r0 = r5.mDataSetObserver;	 Catch:{ IllegalStateException -> 0x0066 }
        r7.registerDataSetObserver(r0);	 Catch:{ IllegalStateException -> 0x0066 }
    L_0x0057:
        return;
    L_0x0058:
        r0 = move-exception;
        throw r0;
    L_0x005a:
        r0 = r1;
        goto L_0x0014;
    L_0x005c:
        r0 = move-exception;
        throw r0;
    L_0x005e:
        r1 = -1;
        goto L_0x0025;
    L_0x0060:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0062 }
    L_0x0062:
        r0 = move-exception;
        throw r0;
    L_0x0064:
        r0 = move-exception;
        throw r0;
    L_0x0066:
        r0 = move-exception;
        throw r0;
    L_0x0068:
        r2 = r8;
        goto L_0x000f;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.CursorAdapter.init(android.content.Context, android.database.Cursor, int):void");
    }

    public Cursor runQueryOnBackgroundThread(CharSequence charSequence) {
        try {
            return this.mFilterQueryProvider != null ? this.mFilterQueryProvider.runQuery(charSequence) : this.mCursor;
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            if (this.mDataValid) {
                try {
                    if (this.mCursor.moveToPosition(i)) {
                        if (view == null) {
                            View newView = newView(this.mContext, this.mCursor, viewGroup);
                            if (a == 0) {
                                view = newView;
                            }
                        }
                        bindView(view, this.mContext, this.mCursor);
                        return view;
                    }
                    throw new IllegalStateException(z[1] + i);
                } catch (IllegalStateException e) {
                    throw e;
                }
            }
            throw new IllegalStateException(z[2]);
        } catch (IllegalStateException e2) {
            throw e2;
        }
    }

    public CharSequence convertToString(Cursor cursor) {
        if (cursor != null) {
            return cursor.toString();
        }
        try {
            return "";
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public boolean hasStableIds() {
        return true;
    }

    public CursorAdapter(Context context, Cursor cursor, int i) {
        init(context, cursor, i);
    }

    @Deprecated
    public CursorAdapter(Context context, Cursor cursor) {
        init(context, cursor, 1);
    }

    public Filter getFilter() {
        try {
            if (this.mCursorFilter == null) {
                this.mCursorFilter = new CursorFilter(this);
            }
            return this.mCursorFilter;
        } catch (IllegalStateException e) {
            throw e;
        }
    }
}
