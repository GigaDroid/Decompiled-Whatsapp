package android.support.design.widget;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;

class ViewGroupUtils {
    private static final ViewGroupUtilsImpl IMPL;

    interface ViewGroupUtilsImpl {
        void offsetDescendantRect(ViewGroup viewGroup, View view, Rect rect);
    }

    class ViewGroupUtilsImplBase implements ViewGroupUtilsImpl {
        ViewGroupUtilsImplBase(1 1) {
            this();
        }

        private ViewGroupUtilsImplBase() {
        }

        public void offsetDescendantRect(ViewGroup viewGroup, View view, Rect rect) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect);
        }
    }

    class ViewGroupUtilsImplHoneycomb implements ViewGroupUtilsImpl {
        public void offsetDescendantRect(ViewGroup viewGroup, View view, Rect rect) {
            ViewGroupUtilsHoneycomb.offsetDescendantRect(viewGroup, view, rect);
        }

        ViewGroupUtilsImplHoneycomb(1 1) {
            this();
        }

        private ViewGroupUtilsImplHoneycomb() {
        }
    }

    static void getDescendantRect(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        offsetDescendantRect(viewGroup, view, rect);
    }

    static void offsetDescendantRect(ViewGroup viewGroup, View view, Rect rect) {
        IMPL.offsetDescendantRect(viewGroup, view, rect);
    }

    static {
        if (VERSION.SDK_INT >= 11) {
            IMPL = new ViewGroupUtilsImplHoneycomb(null);
        } else {
            IMPL = new ViewGroupUtilsImplBase(null);
        }
    }
}
