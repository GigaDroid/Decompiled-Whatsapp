package com.tonicartos.widget.stickygridheaders;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.v;
import org.whispersystems.at;

public class a extends BaseAdapter {
    private static boolean h;
    private static final String z;
    private int a;
    private final r b;
    private final Context c;
    private final List d;
    private DataSetObserver e;
    private View[] f;
    private StickyGridHeadersGridView g;
    private int i;

    static {
        char[] toCharArray = "\u0007V\u0011=w\rE\n7x\u001cG\u0019:y\u0006Q\u001a?o\u0011C\u001c?l\u0000G\n)n\u0015R\b;n[E\u001d*z\u001dN\u0014;n\u0002K\u001d)<\u0003P\u00170{TV\u0001.y".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 116;
                    break;
                case at.g /*1*/:
                    i2 = 34;
                    break;
                case at.i /*2*/:
                    i2 = 120;
                    break;
                case at.o /*3*/:
                    i2 = 94;
                    break;
                default:
                    i2 = 28;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    protected long c(int i) {
        return (long) a(i).a;
    }

    protected u a(int i) {
        boolean z = StickyGridHeadersGridView.a;
        int a = this.b.a();
        if (a != 0) {
            int i2 = 0;
            int i3 = i;
            while (i2 < a) {
                int a2 = this.b.a(i2);
                if (i != 0) {
                    int i4 = i - this.i;
                    if (i4 >= 0) {
                        int i5 = i3 - this.i;
                        if (i4 >= a2) {
                            int d = d(i2);
                            i3 = i5 - d;
                            i = i4 - (a2 + d);
                            i2++;
                            if (z) {
                                break;
                            }
                        }
                        return new u(this, i5, i2);
                    }
                    return new u(this, -1, i2);
                }
                return new u(this, -2, i2);
            }
            return new u(this, -1, i2);
        } else if (i >= this.b.getCount()) {
            return new u(this, -1, 0);
        } else {
            return new u(this, i, 0);
        }
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.b.unregisterDataSetObserver(dataSetObserver);
    }

    public int getCount() {
        int i = 0;
        boolean z = StickyGridHeadersGridView.a;
        this.a = 0;
        int a = this.b.a();
        if (a == 0) {
            return this.b.getCount();
        }
        while (i < a) {
            this.a += (this.b.a(i) + d(i)) + this.i;
            i++;
            if (z) {
                break;
            }
        }
        return this.a;
    }

    private int d(int i) {
        int a = this.b.a(i) % this.i;
        return a == 0 ? 0 : this.i - a;
    }

    public void b(int i) {
        this.i = i;
        e(i);
    }

    private void e(int i) {
        this.f = new View[i];
        Arrays.fill(this.f, null);
    }

    protected View b(int i, View view, ViewGroup viewGroup) {
        if (this.b.a() == 0) {
            return null;
        }
        return this.b.a(a(i).a, view, viewGroup);
    }

    public boolean isEmpty() {
        return this.b.isEmpty();
    }

    public boolean isEnabled(int i) {
        u a = a(i);
        if (a.b == -1 || a.b == -2) {
            return false;
        }
        return this.b.isEnabled(a.b);
    }

    public int getItemViewType(int i) {
        u a = a(i);
        if (a.b == -2) {
            return 1;
        }
        if (a.b == -1) {
            return 0;
        }
        int itemViewType = this.b.getItemViewType(a.b);
        if (itemViewType != -1) {
            return itemViewType + 2;
        }
        return itemViewType;
    }

    static List a(a aVar) {
        return aVar.d;
    }

    public a(Context context, StickyGridHeadersGridView stickyGridHeadersGridView, r rVar) {
        this.e = new i(this);
        this.d = new ArrayList();
        this.i = 1;
        this.c = context;
        this.b = rVar;
        this.g = stickyGridHeadersGridView;
        rVar.registerDataSetObserver(this.e);
    }

    public boolean hasStableIds() {
        return this.b.hasStableIds();
    }

    public long getItemId(int i) {
        u a = a(i);
        if (a.b == -2) {
            return -1;
        }
        if (a.b == -1) {
            return -2;
        }
        return this.b.getItemId(a.b);
    }

    private StickyGridHeadersBaseAdapterWrapper$FillerView a(View view, ViewGroup viewGroup) {
        View view2;
        if (view == null || (view instanceof StickyGridHeadersBaseAdapterWrapper$FillerView)) {
            view2 = view;
        } else {
            Log.e(z + view + " " + view.getTag());
            view2 = null;
        }
        StickyGridHeadersBaseAdapterWrapper$FillerView stickyGridHeadersBaseAdapterWrapper$FillerView = (StickyGridHeadersBaseAdapterWrapper$FillerView) view2;
        return stickyGridHeadersBaseAdapterWrapper$FillerView == null ? new StickyGridHeadersBaseAdapterWrapper$FillerView(this, this.c) : stickyGridHeadersBaseAdapterWrapper$FillerView;
    }

    private View a(int i, View view, ViewGroup viewGroup) {
        StickyGridHeadersBaseAdapterWrapper$HeaderFillerView stickyGridHeadersBaseAdapterWrapper$HeaderFillerView = (StickyGridHeadersBaseAdapterWrapper$HeaderFillerView) view;
        View stickyGridHeadersBaseAdapterWrapper$HeaderFillerView2 = new StickyGridHeadersBaseAdapterWrapper$HeaderFillerView(this, this.c);
        stickyGridHeadersBaseAdapterWrapper$HeaderFillerView2.setHeaderWidth(this.g.getWidth());
        return stickyGridHeadersBaseAdapterWrapper$HeaderFillerView2;
    }

    public int getViewTypeCount() {
        return this.b.getViewTypeCount() + 2;
    }

    public Object getItem(int i) {
        u a = a(i);
        if (a.b == -1 || a.b == -2) {
            return null;
        }
        return this.b.getItem(a.b);
    }

    protected void a() {
        int i = 0;
        boolean z = StickyGridHeadersGridView.a;
        this.a = 0;
        int a = this.b.a();
        if (a == 0) {
            this.a = this.b.getCount();
            return;
        }
        while (i < a) {
            this.a += this.b.a(i) + this.i;
            i++;
            if (z) {
                return;
            }
        }
    }

    static View[] b(a aVar) {
        return aVar.f;
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.b.registerDataSetObserver(dataSetObserver);
    }

    public boolean areAllItemsEnabled() {
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r8, android.view.View r9, android.view.ViewGroup r10) {
        /*
        r7 = this;
        r2 = com.tonicartos.widget.stickygridheaders.StickyGridHeadersGridView.a;
        r0 = 0;
        r1 = r9 instanceof com.tonicartos.widget.stickygridheaders.StickyGridHeadersBaseAdapterWrapper$ReferenceView;
        if (r1 == 0) goto L_0x0093;
    L_0x0007:
        r9 = (com.tonicartos.widget.stickygridheaders.StickyGridHeadersBaseAdapterWrapper$ReferenceView) r9;
        r0 = 0;
        r0 = r9.getChildAt(r0);
    L_0x000e:
        r3 = r7.a(r8);
        r1 = r3.b;
        r4 = -2;
        if (r1 != r4) goto L_0x0091;
    L_0x0017:
        r1 = r3.a;
        r1 = r7.a(r1, r0, r10);
        r0 = r1;
        r0 = (com.tonicartos.widget.stickygridheaders.StickyGridHeadersBaseAdapterWrapper$HeaderFillerView) r0;
        r4 = r3.a;
        r0.setHeaderId(r4);
        r0 = r1.getTag();
        r0 = (android.view.View) r0;
        r4 = r7.b;
        r5 = r3.a;
        r0 = r4.a(r5, r0, r10);
        r1.setTag(r0);
        if (r2 == 0) goto L_0x0051;
    L_0x0038:
        r0 = com.whatsapp.WAAppCompatActivity.c;
        r0 = r0 + 1;
        com.whatsapp.WAAppCompatActivity.c = r0;
    L_0x003e:
        r0 = r3.b;
        r4 = -1;
        if (r0 != r4) goto L_0x0049;
    L_0x0043:
        r1 = r7.a(r1, r10);
        if (r2 == 0) goto L_0x0051;
    L_0x0049:
        r0 = r7.b;
        r2 = r3.b;
        r1 = r0.getView(r2, r1, r10);
    L_0x0051:
        if (r9 != 0) goto L_0x005a;
    L_0x0053:
        r9 = new com.tonicartos.widget.stickygridheaders.StickyGridHeadersBaseAdapterWrapper$ReferenceView;
        r0 = r7.c;
        r9.<init>(r7, r0);
    L_0x005a:
        r9.removeAllViews();
        r9.addView(r1);
        r9.setPosition(r8);
        r0 = r7.i;
        r9.setNumColumns(r0);
        r0 = r7.f;
        r1 = r7.i;
        r1 = r8 % r1;
        r0[r1] = r9;
        r0 = r7.f;
        r9.setRowSiblings(r0);
        r0 = h;
        if (r0 != 0) goto L_0x0090;
    L_0x0079:
        r0 = r7.i;
        r0 = r8 % r0;
        r1 = r7.i;
        r1 = r1 + -1;
        if (r0 == r1) goto L_0x008b;
    L_0x0083:
        r0 = r7.getCount();
        r0 = r0 + -1;
        if (r8 != r0) goto L_0x0090;
    L_0x008b:
        r0 = r7.i;
        r7.e(r0);
    L_0x0090:
        return r9;
    L_0x0091:
        r1 = r0;
        goto L_0x003e;
    L_0x0093:
        r6 = r0;
        r0 = r9;
        r9 = r6;
        goto L_0x000e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tonicartos.widget.stickygridheaders.a.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
