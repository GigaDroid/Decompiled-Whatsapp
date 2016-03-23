package com.whatsapp.gallerypicker;

import android.graphics.Bitmap;
import android.net.Uri;
import com.whatsapp.a59;
import com.whatsapp.util.ag;
import com.whatsapp.util.c_;
import java.io.FileNotFoundException;
import java.io.IOException;

class bd implements b7 {
    final Uri a;
    final int b;
    final Uri c;
    final ImagePreview d;

    bd(ImagePreview imagePreview, int i, Uri uri, Uri uri2) {
        this.d = imagePreview;
        this.b = i;
        this.a = uri;
        this.c = uri2;
    }

    public String a() {
        return this.c.toString();
    }

    public Bitmap b() {
        try {
            int min = this.b == 0 ? a59.f : Math.min(this.b, a59.f);
            return ag.a(this.a, min, min);
        } catch (FileNotFoundException e) {
            throw e;
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
            return null;
        } catch (IOException e3) {
            e3.printStackTrace();
            return null;
        } catch (c_ e4) {
            e4.printStackTrace();
            return null;
        } catch (FileNotFoundException e5) {
            e5.printStackTrace();
            return null;
        }
    }
}
