package com.whatsapp;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ScrollView;
import android.widget.TextView;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.v;
import org.whispersystems.at;

public class ContactPickerHelp extends DialogToastListActivity {
    private static final String z;
    TextView t;
    au u;
    boolean v;
    CheckBox w;
    List x;

    static {
        char[] toCharArray = "k?*Gfk$,Vkx\u007f'Abi$!".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case v.m /*0*/:
                    i2 = 8;
                    break;
                case at.g /*1*/:
                    i2 = 80;
                    break;
                case at.i /*2*/:
                    i2 = 68;
                    break;
                case at.o /*3*/:
                    i2 = 51;
                    break;
                default:
                    i2 = 7;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void g(int i) {
        if (i == 2131230966) {
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        Log.i(z);
        super.onCreate(bundle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(2130903104);
        ((Button) findViewById(2131755460)).setOnClickListener(new a_t(this));
        this.t = (TextView) findViewById(2131755465);
        this.x = new ArrayList();
        this.u = new au(this, 2130903105, this.x);
        a().setAdapter(this.u);
        this.t.setVisibility(4);
        a().setVisibility(8);
        this.w = (CheckBox) findViewById(2131755463);
        this.w.setChecked(App.C((Context) this));
        this.w.setOnCheckedChangeListener(new nn(this));
        findViewById(2131755462).setOnClickListener(new avh(this));
        ((ScrollView) findViewById(2131755411)).post(new awh(this));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 16908332:
                finish();
                return true;
            default:
                return false;
        }
    }
}
