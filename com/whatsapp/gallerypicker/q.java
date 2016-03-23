package com.whatsapp.gallerypicker;

import android.net.Uri;
import android.support.v4.view.PagerAdapter;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.whatsapp.ConversationTextEntry;
import com.whatsapp.PhotoView;
import com.whatsapp.WAAppCompatActivity;
import com.whatsapp.aam;
import com.whatsapp.aes;
import com.whatsapp.arj;
import org.v;
import org.whispersystems.at;

class q extends PagerAdapter {
    private static final String z;
    final ImagePreview a;

    static {
        char[] toCharArray = "/9 \u001e".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 74;
                    break;
                case at.g /*1*/:
                    i2 = 93;
                    break;
                case at.i /*2*/:
                    i2 = 73;
                    break;
                case at.o /*3*/:
                    i2 = arj.Theme_ratingBarStyle;
                    break;
                default:
                    i2 = 111;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    private q(ImagePreview imagePreview) {
        this.a = imagePreview;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public int getCount() {
        return ImagePreview.c(this.a).size();
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        int i2 = MediaGalleryFragmentBase.e;
        View a = aam.a(this.a.getLayoutInflater(), 2130903204, null, false);
        PhotoView photoView = (PhotoView) a.findViewById(2131755394);
        if (ImagePreview.r(this.a)) {
            photoView.setHeightForInitialScaleCalculation(ImagePreview.m(this.a));
        }
        Uri uri = (Uri) ImagePreview.c(this.a).get(i);
        ImagePreview.a(this.a, photoView, uri);
        TextView textView = (ConversationTextEntry) a.findViewById(2131755554);
        textView.setInputEnterDone(true);
        textView.setOnEditorActionListener(new y(this, textView));
        textView.setTag(uri.toString() + z);
        textView.setFilters(new InputFilter[]{new aes(1024)});
        textView.setText((CharSequence) ImagePreview.g(this.a).get(uri));
        textView.addTextChangedListener(new az(this, textView, (TextView) a.findViewById(2131755755), 1024, 30, uri));
        aam.a(textView);
        ImageButton imageButton = (ImageButton) a.findViewById(2131755508);
        imageButton.setOnClickListener(new bu(this, imageButton, textView));
        viewGroup.addView(a, 0);
        if (WAAppCompatActivity.c != 0) {
            MediaGalleryFragmentBase.e = i2 + 1;
        }
        return a;
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    q(ImagePreview imagePreview, bv bvVar) {
        this(imagePreview);
    }

    public int getItemPosition(Object obj) {
        int indexOf = ImagePreview.c(this.a).indexOf((Uri) ((View) obj).getTag());
        if (indexOf < 0) {
            return -2;
        }
        return indexOf;
    }
}
