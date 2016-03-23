package android.support.v4.widget;

import android.view.View;
import android.widget.ListView;

public class ListViewAutoScrollHelper extends AutoScrollHelper {
    private final ListView mTarget;

    public void scrollTargetBy(int i, int i2) {
        ListView listView = this.mTarget;
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        if (firstVisiblePosition != -1) {
            View childAt = listView.getChildAt(0);
            if (childAt != null) {
                listView.setSelectionFromTop(firstVisiblePosition, childAt.getTop() - i2);
            }
        }
    }

    public boolean canTargetScrollHorizontally(int i) {
        return false;
    }

    public ListViewAutoScrollHelper(ListView listView) {
        super(listView);
        this.mTarget = listView;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean canTargetScrollVertically(int r8) {
        /*
        r7 = this;
        r0 = 0;
        r1 = android.support.v4.widget.CursorAdapter.a;
        r2 = r7.mTarget;
        r3 = r2.getCount();
        if (r3 != 0) goto L_0x000c;
    L_0x000b:
        return r0;
    L_0x000c:
        r4 = r2.getChildCount();
        r5 = r2.getFirstVisiblePosition();
        r6 = r5 + r4;
        if (r8 <= 0) goto L_0x002c;
    L_0x0018:
        if (r6 < r3) goto L_0x003c;
    L_0x001a:
        r3 = r4 + -1;
        r3 = r2.getChildAt(r3);
        r3 = r3.getBottom();
        r4 = r2.getHeight();
        if (r3 <= r4) goto L_0x000b;
    L_0x002a:
        if (r1 == 0) goto L_0x003c;
    L_0x002c:
        if (r8 >= 0) goto L_0x000b;
    L_0x002e:
        if (r5 > 0) goto L_0x003c;
    L_0x0030:
        r2 = r2.getChildAt(r0);
        r2 = r2.getTop();
        if (r2 >= 0) goto L_0x000b;
    L_0x003a:
        if (r1 != 0) goto L_0x000b;
    L_0x003c:
        r0 = 1;
        goto L_0x000b;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.ListViewAutoScrollHelper.canTargetScrollVertically(int):boolean");
    }
}
