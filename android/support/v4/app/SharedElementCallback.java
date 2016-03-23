package android.support.v4.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.whatsapp.arj;
import java.util.List;
import java.util.Map;
import org.v;
import org.whispersystems.at;

public abstract class SharedElementCallback {
    private static int MAX_IMAGE_SIZE;
    private static final String[] z;
    private Matrix mTempMatrix;

    public void onMapSharedElements(List list, Map map) {
    }

    public void onSharedElementStart(List list, List list2, List list3) {
    }

    static {
        String[] strArr = new String[6];
        String str = "\u001e\u0017]\u001cl\t:P\u000bd\b\u0011HTz\u0003\u001eL\u001da\u0002\u000b\u0006\u0007d\f\u0018Y=j\f\u0013Y:p\u001d\u001a";
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
                        i3 = arj.Theme_switchStyle;
                        break;
                    case at.g /*1*/:
                        i3 = 127;
                        break;
                    case at.i /*2*/:
                        i3 = 60;
                        break;
                    case at.o /*3*/:
                        i3 = 110;
                        break;
                    default:
                        i3 = 9;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\u001e\u0017]\u001cl\t:P\u000bd\b\u0011HTz\u0003\u001eL\u001da\u0002\u000b\u0006\f`\u0019\u0012]\u001e";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    str = "\u001e\u0017]\u001cl\t:P\u000bd\b\u0011HTz\u0003\u001eL\u001da\u0002\u000b\u0006\u0007d\f\u0018Y#h\u0019\rU\u0016";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    str = "\u001e\u0017]\u001cl\t:P\u000bd\b\u0011HTz\u0003\u001eL\u001da\u0002\u000b\u0006\u0007d\f\u0018Y=j\f\u0013Y:p\u001d\u001a";
                    i = 4;
                    strArr2 = strArr3;
                    obj = 3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "\u001e\u0017]\u001cl\t:P\u000bd\b\u0011HTz\u0003\u001eL\u001da\u0002\u000b\u0006\f`\u0019\u0012]\u001e";
                    obj = 4;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    z = strArr3;
                    MAX_IMAGE_SIZE = 1048576;
                    return;
                default:
                    strArr2[i] = str;
                    str = "\u001e\u0017]\u001cl\t:P\u000bd\b\u0011HTz\u0003\u001eL\u001da\u0002\u000b\u0006\u0007d\f\u0018Y#h\u0019\rU\u0016";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public void onSharedElementEnd(List list, List list2, List list3) {
    }

    private static Bitmap createDrawableBitmap(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return null;
        }
        float min = Math.min(1.0f, ((float) MAX_IMAGE_SIZE) / ((float) (intrinsicWidth * intrinsicHeight)));
        if ((drawable instanceof BitmapDrawable) && min == 1.0f) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int i = (int) (((float) intrinsicWidth) * min);
        intrinsicHeight = (int) (((float) intrinsicHeight) * min);
        Bitmap createBitmap = Bitmap.createBitmap(i, intrinsicHeight, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Rect bounds = drawable.getBounds();
        int i2 = bounds.left;
        int i3 = bounds.top;
        int i4 = bounds.right;
        int i5 = bounds.bottom;
        drawable.setBounds(0, 0, i, intrinsicHeight);
        drawable.draw(canvas);
        drawable.setBounds(i2, i3, i4, i5);
        return createBitmap;
    }

    public void onRejectSharedElements(List list) {
    }

    public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            Drawable drawable = imageView.getDrawable();
            Drawable background = imageView.getBackground();
            if (drawable != null && background == null) {
                Parcelable createDrawableBitmap = createDrawableBitmap(drawable);
                if (createDrawableBitmap != null) {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable(z[5], createDrawableBitmap);
                    bundle.putString(z[4], imageView.getScaleType().toString());
                    if (imageView.getScaleType() == ScaleType.MATRIX) {
                        float[] fArr = new float[9];
                        imageView.getImageMatrix().getValues(fArr);
                        bundle.putFloatArray(z[3], fArr);
                    }
                    return bundle;
                }
            }
        }
        int round = Math.round(rectF.width());
        int round2 = Math.round(rectF.height());
        if (round <= 0 || round2 <= 0) {
            return null;
        }
        float min = Math.min(1.0f, ((float) MAX_IMAGE_SIZE) / ((float) (round * round2)));
        round = (int) (((float) round) * min);
        round2 = (int) (((float) round2) * min);
        if (this.mTempMatrix == null) {
            this.mTempMatrix = new Matrix();
        }
        this.mTempMatrix.set(matrix);
        this.mTempMatrix.postTranslate(-rectF.left, -rectF.top);
        this.mTempMatrix.postScale(min, min);
        Parcelable createBitmap = Bitmap.createBitmap(round, round2, Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.concat(this.mTempMatrix);
        view.draw(canvas);
        return createBitmap;
    }

    public View onCreateSnapshotView(Context context, Parcelable parcelable) {
        View view;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            Bitmap bitmap = (Bitmap) bundle.getParcelable(z[2]);
            if (bitmap == null) {
                return null;
            }
            View imageView = new ImageView(context);
            imageView.setImageBitmap(bitmap);
            imageView.setScaleType(ScaleType.valueOf(bundle.getString(z[0])));
            if (imageView.getScaleType() == ScaleType.MATRIX) {
                float[] floatArray = bundle.getFloatArray(z[1]);
                Matrix matrix = new Matrix();
                matrix.setValues(floatArray);
                imageView.setImageMatrix(matrix);
            }
            view = imageView;
        } else if (parcelable instanceof Bitmap) {
            Bitmap bitmap2 = (Bitmap) parcelable;
            view = new ImageView(context);
            view.setImageBitmap(bitmap2);
        } else {
            view = null;
        }
        return view;
    }
}
