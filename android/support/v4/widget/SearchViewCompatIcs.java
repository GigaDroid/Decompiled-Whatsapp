package android.support.v4.widget;

import android.content.Context;
import android.widget.SearchView;

class SearchViewCompatIcs {

    public class MySearchView extends SearchView {
        public static int a;

        public MySearchView(Context context) {
            super(context);
        }

        public void onActionViewCollapsed() {
            setQuery("", false);
            super.onActionViewCollapsed();
        }
    }
}
