package android.support.design.widget;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

class ViewGroupUtilsHoneycomb {
    private static final Matrix IDENTITY;
    private static final ThreadLocal sMatrix;
    private static final ThreadLocal sRectF;

    static void offsetDescendantMatrix(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            offsetDescendantMatrix(viewParent, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }

    static {
        sMatrix = new ThreadLocal();
        sRectF = new ThreadLocal();
        IDENTITY = new Matrix();
    }

    public static void offsetDescendantRect(ViewGroup viewGroup, View view, Rect rect) {
        Matrix matrix;
        RectF rectF;
        Matrix matrix2 = (Matrix) sMatrix.get();
        if (matrix2 == null) {
            matrix2 = new Matrix();
            sMatrix.set(matrix2);
            if (!CoordinatorLayout.a) {
                matrix = matrix2;
                offsetDescendantMatrix(viewGroup, view, matrix);
                rectF = (RectF) sRectF.get();
                if (rectF == null) {
                    rectF = new RectF();
                }
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            }
        }
        matrix2.set(IDENTITY);
        matrix = matrix2;
        offsetDescendantMatrix(viewGroup, view, matrix);
        rectF = (RectF) sRectF.get();
        if (rectF == null) {
            rectF = new RectF();
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }
}
