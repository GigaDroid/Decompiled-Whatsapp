package com.whatsapp;

import android.location.Address;
import android.location.Geocoder;
import android.widget.TextView;
import java.util.List;
import org.v;
import org.whispersystems.at;

class anu implements Runnable {
    private static final String z;
    double a;
    final LocationPicker2 b;
    double c;

    static {
        char[] toCharArray = ">\u007f".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 18;
                    break;
                case at.g /*1*/:
                    i2 = 95;
                    break;
                case at.i /*2*/:
                    i2 = 65;
                    break;
                case at.o /*3*/:
                    i2 = arj.Theme_switchStyle;
                    break;
                default:
                    i2 = 17;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    anu(LocationPicker2 locationPicker2, double d, double d2) {
        this.b = locationPicker2;
        this.c = d;
        this.a = d2;
    }

    public void run() {
        boolean z = DialogToastActivity.f;
        TextView textView = (TextView) this.b.findViewById(2131755729);
        List fromLocation = new Geocoder(App.z(), aqu.f()).getFromLocation(this.c, this.a, 1);
        if (fromLocation != null) {
            try {
                if (!fromLocation.isEmpty()) {
                    Address address = (Address) fromLocation.get(0);
                    StringBuilder stringBuilder = new StringBuilder();
                    int i = 0;
                    do {
                        if (i >= address.getMaxAddressLineIndex()) {
                            break;
                        }
                        if (i != 0) {
                            stringBuilder.append(z);
                        }
                        stringBuilder.append(address.getAddressLine(i));
                        i++;
                        break;
                    } while (!z);
                    break;
                    this.b.runOnUiThread(new _t(this, address, stringBuilder, textView));
                    if (!z) {
                        return;
                    }
                }
            } catch (Exception e) {
                throw e;
            } catch (Exception e2) {
                throw e2;
            } catch (Exception e22) {
                throw e22;
            } catch (Exception e3) {
                this.b.runOnUiThread(new awy(this, textView));
                return;
            }
        }
        this.b.runOnUiThread(new a3v(this, textView));
    }
}
