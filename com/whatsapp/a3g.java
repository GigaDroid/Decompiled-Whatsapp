package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import java.util.Iterator;

class a3g implements OnClickListener {
    final GroupChatLiveLocationsActivity a;

    public void onClick(View view) {
        boolean z = DialogToastActivity.f;
        GroupChatLiveLocationsActivity.a(this.a, null);
        GroupChatLiveLocationsActivity.f(this.a).d();
        Iterator it = GroupChatLiveLocationsActivity.h(this.a).iterator();
        while (it.hasNext()) {
            ((ViewGroup) ((View) it.next())).getChildAt(0).setSelected(false);
            if (z) {
                break;
            }
        }
        GroupChatLiveLocationsActivity.b(this.a).runOnFirstFix(new a9c(this));
    }

    a3g(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        this.a = groupChatLiveLocationsActivity;
    }
}
