package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.whatsapp.gallerypicker.MediaGalleryFragmentBase.MediaItemView;
import com.whatsapp.protocol.co;
import org.v;
import org.whispersystems.at;

class xf implements OnItemClickListener {
    private static final String z;
    final MediaGalleryFragment a;

    static {
        char[] toCharArray = "HcI\u001b\u0004]{".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 47;
                    break;
                case at.g /*1*/:
                    i2 = 2;
                    break;
                case at.i /*2*/:
                    i2 = 37;
                    break;
                case at.o /*3*/:
                    i2 = 119;
                    break;
                default:
                    i2 = 97;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        co b = MediaGalleryFragment.e(this.a).b(i);
        MediaItemView mediaItemView = (MediaItemView) view.findViewById(2131755454);
        if (MediaGalleryFragment.a(this.a).a()) {
            mediaItemView.setChecked(MediaGalleryFragment.a(this.a).c(b));
            if (!DialogToastActivity.f) {
                return;
            }
        }
        this.a.startActivity(MediaView.a(b, MediaGalleryFragment.b(this.a), this.a.getActivity(), view).putExtra(z, true));
        if (b.c == (byte) 1 && MediaView.c()) {
            this.a.getActivity().overridePendingTransition(0, 0);
        }
    }

    xf(MediaGalleryFragment mediaGalleryFragment) {
        this.a = mediaGalleryFragment;
    }
}
