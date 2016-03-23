package android.support.v7.widget;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.view.KeyEventCompat;
import android.support.v4.widget.CursorAdapter;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.appcompat.R;
import android.support.v7.view.CollapsibleActionView;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.whatsapp.arj;
import com.whatsapp.proto.E2E.Message.VideoMessage;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.v;
import org.whispersystems.Y;
import org.whispersystems.aF;
import org.whispersystems.at;

public class SearchView extends LinearLayoutCompat implements CollapsibleActionView {
    static final AutoCompleteTextViewReflector HIDDEN_METHOD_INVOKER;
    private static final boolean IS_AT_LEAST_FROYO;
    private static final String[] z;
    private Bundle mAppSearchData;
    private boolean mClearingFocus;
    private final ImageView mCloseButton;
    private final ImageView mCollapsedIcon;
    private int mCollapsedImeOptions;
    private final CharSequence mDefaultQueryHint;
    private final View mDropDownAnchor;
    private boolean mExpandedInActionView;
    private final ImageView mGoButton;
    private boolean mIconified;
    private boolean mIconifiedByDefault;
    private int mMaxWidth;
    private CharSequence mOldQueryText;
    private final OnClickListener mOnClickListener;
    private OnCloseListener mOnCloseListener;
    private final OnEditorActionListener mOnEditorActionListener;
    private final OnItemClickListener mOnItemClickListener;
    private final OnItemSelectedListener mOnItemSelectedListener;
    private OnQueryTextListener mOnQueryChangeListener;
    private OnFocusChangeListener mOnQueryTextFocusChangeListener;
    private OnClickListener mOnSearchClickListener;
    private OnSuggestionListener mOnSuggestionListener;
    private final WeakHashMap mOutsideDrawablesCache;
    private CharSequence mQueryHint;
    private Runnable mReleaseCursorRunnable;
    private final ImageView mSearchButton;
    private final View mSearchEditFrame;
    private final Drawable mSearchHintIcon;
    private final View mSearchPlate;
    private final SearchAutoComplete mSearchSrcTextView;
    private SearchableInfo mSearchable;
    private Runnable mShowImeRunnable;
    private final View mSubmitArea;
    private boolean mSubmitButtonEnabled;
    private final int mSuggestionCommitIconResId;
    private final int mSuggestionRowLayout;
    private CursorAdapter mSuggestionsAdapter;
    OnKeyListener mTextKeyListener;
    private TextWatcher mTextWatcher;
    private final TintManager mTintManager;
    private final Runnable mUpdateDrawableStateRunnable;
    private CharSequence mUserQuery;
    private final Intent mVoiceAppSearchIntent;
    private final ImageView mVoiceButton;
    private boolean mVoiceButtonEnabled;
    private final Intent mVoiceWebSearchIntent;

    class 10 implements OnItemClickListener {
        final SearchView this$0;

        10(SearchView searchView) {
            this.this$0 = searchView;
        }

        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            SearchView.access$1800(this.this$0, i, 0, null);
        }
    }

    class 11 implements OnItemSelectedListener {
        final SearchView this$0;

        public void onNothingSelected(AdapterView adapterView) {
        }

        11(SearchView searchView) {
            this.this$0 = searchView;
        }

        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            SearchView.access$1900(this.this$0, i);
        }
    }

    class 12 implements TextWatcher {
        final SearchView this$0;

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView.access$2000(this.this$0, charSequence);
        }

        12(SearchView searchView) {
            this.this$0 = searchView;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    class 1 implements Runnable {
        private static final String z;
        final SearchView this$0;

        static {
            char[] toCharArray = "aa\u0004JnWb\u0011Krgk".toCharArray();
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
                        i2 = 15;
                        break;
                    case at.i /*2*/:
                        i2 = 116;
                        break;
                    case at.o /*3*/:
                        i2 = 63;
                        break;
                    default:
                        i2 = 26;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        public void run() {
            InputMethodManager inputMethodManager = (InputMethodManager) this.this$0.getContext().getSystemService(z);
            if (inputMethodManager != null) {
                SearchView.HIDDEN_METHOD_INVOKER.showSoftInputUnchecked(inputMethodManager, this.this$0, 0);
            }
        }

        1(SearchView searchView) {
            this.this$0 = searchView;
        }
    }

    class 2 implements Runnable {
        final SearchView this$0;

        2(SearchView searchView) {
            this.this$0 = searchView;
        }

        public void run() {
            SearchView.access$000(this.this$0);
        }
    }

    class 3 implements Runnable {
        final SearchView this$0;

        3(SearchView searchView) {
            this.this$0 = searchView;
        }

        public void run() {
            if (SearchView.access$100(this.this$0) != null && (SearchView.access$100(this.this$0) instanceof SuggestionsAdapter)) {
                SearchView.access$100(this.this$0).changeCursor(null);
            }
        }
    }

    class 4 implements OnFocusChangeListener {
        final SearchView this$0;

        public void onFocusChange(View view, boolean z) {
            if (SearchView.access$200(this.this$0) != null) {
                SearchView.access$200(this.this$0).onFocusChange(this.this$0, z);
            }
        }

        4(SearchView searchView) {
            this.this$0 = searchView;
        }
    }

    class 5 implements OnLayoutChangeListener {
        final SearchView this$0;

        5(SearchView searchView) {
            this.this$0 = searchView;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView.access$300(this.this$0);
        }
    }

    class 6 implements OnGlobalLayoutListener {
        final SearchView this$0;

        public void onGlobalLayout() {
            SearchView.access$300(this.this$0);
        }

        6(SearchView searchView) {
            this.this$0 = searchView;
        }
    }

    class 7 implements OnClickListener {
        final SearchView this$0;

        public void onClick(View view) {
            boolean z = LinearLayoutCompat.a;
            if (view == SearchView.access$400(this.this$0)) {
                SearchView.access$500(this.this$0);
                if (!z) {
                    return;
                }
            }
            if (view == SearchView.access$600(this.this$0)) {
                SearchView.access$700(this.this$0);
                if (!z) {
                    return;
                }
            }
            if (view == SearchView.access$800(this.this$0)) {
                SearchView.access$900(this.this$0);
                if (!z) {
                    return;
                }
            }
            if (view == SearchView.access$1000(this.this$0)) {
                SearchView.access$1100(this.this$0);
                if (!z) {
                    return;
                }
            }
            if (view == SearchView.access$1200(this.this$0)) {
                SearchView.access$1300(this.this$0);
            }
        }

        7(SearchView searchView) {
            this.this$0 = searchView;
        }
    }

    class 8 implements OnKeyListener {
        final SearchView this$0;

        8(SearchView searchView) {
            this.this$0 = searchView;
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (SearchView.access$1400(this.this$0) == null) {
                return false;
            }
            if (SearchView.access$1200(this.this$0).isPopupShowing() && SearchView.access$1200(this.this$0).getListSelection() != -1) {
                return SearchView.access$1500(this.this$0, view, i, keyEvent);
            }
            if (SearchAutoComplete.access$1600(SearchView.access$1200(this.this$0)) || !KeyEventCompat.hasNoModifiers(keyEvent) || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView.access$1700(this.this$0, 0, null, SearchView.access$1200(this.this$0).getText().toString());
            return true;
        }
    }

    class 9 implements OnEditorActionListener {
        final SearchView this$0;

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.access$900(this.this$0);
            return true;
        }

        9(SearchView searchView) {
            this.this$0 = searchView;
        }
    }

    class AutoCompleteTextViewReflector {
        private static final String[] z;
        private Method doAfterTextChanged;
        private Method doBeforeTextChanged;
        private Method ensureImeVisible;
        private Method showSoftInputUnchecked;

        static {
            String[] strArr = new String[4];
            String str = "G~\u001a=\bFc\u000f>\u0004WR3:\u0012Dt?";
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
                            i3 = 35;
                            break;
                        case at.g /*1*/:
                            i3 = 17;
                            break;
                        case at.i /*2*/:
                            i3 = 91;
                            break;
                        case at.o /*3*/:
                            i3 = 91;
                            break;
                        default:
                            i3 = 124;
                            break;
                    }
                    cArr[i2] = (char) (i3 ^ c);
                }
                str = new String(cArr).intern();
                switch (obj) {
                    case v.m /*0*/:
                        strArr2[i] = str;
                        str = "G~\u0019>\u001aLc>\u000f\u0019[e\u00183\u001dMv>?";
                        i = 2;
                        strArr2 = strArr3;
                        obj = 1;
                        break;
                    case at.g /*1*/:
                        strArr2[i] = str;
                        i = 3;
                        strArr2 = strArr3;
                        str = "Py4,/Lw/\u0012\u0012Sd/\u000e\u0012@y>8\u0017Fu";
                        obj = 2;
                        break;
                    case at.i /*2*/:
                        strArr2[i] = str;
                        z = strArr3;
                        return;
                    default:
                        strArr2[i] = str;
                        str = "F\u007f(.\u000eFX6>*Jb29\u0010F";
                        i = 1;
                        strArr2 = strArr3;
                        obj = null;
                        break;
                }
            }
        }

        void doBeforeTextChanged(AutoCompleteTextView autoCompleteTextView) {
            if (this.doBeforeTextChanged != null) {
                try {
                    this.doBeforeTextChanged.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception e) {
                }
            }
        }

        void ensureImeVisible(AutoCompleteTextView autoCompleteTextView, boolean z) {
            if (this.ensureImeVisible != null) {
                try {
                    this.ensureImeVisible.invoke(autoCompleteTextView, new Object[]{Boolean.valueOf(z)});
                } catch (Exception e) {
                }
            }
        }

        void showSoftInputUnchecked(InputMethodManager inputMethodManager, View view, int i) {
            if (this.showSoftInputUnchecked != null) {
                try {
                    this.showSoftInputUnchecked.invoke(inputMethodManager, new Object[]{Integer.valueOf(i), null});
                    return;
                } catch (Exception e) {
                }
            }
            inputMethodManager.showSoftInput(view, i);
        }

        void doAfterTextChanged(AutoCompleteTextView autoCompleteTextView) {
            if (this.doAfterTextChanged != null) {
                try {
                    this.doAfterTextChanged.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception e) {
                }
            }
        }

        AutoCompleteTextViewReflector() {
            try {
                this.doBeforeTextChanged = AutoCompleteTextView.class.getDeclaredMethod(z[2], new Class[0]);
                this.doBeforeTextChanged.setAccessible(true);
            } catch (NoSuchMethodException e) {
            }
            try {
                this.doAfterTextChanged = AutoCompleteTextView.class.getDeclaredMethod(z[0], new Class[0]);
                this.doAfterTextChanged.setAccessible(true);
            } catch (NoSuchMethodException e2) {
            }
            try {
                this.ensureImeVisible = AutoCompleteTextView.class.getMethod(z[1], new Class[]{Boolean.TYPE});
                this.ensureImeVisible.setAccessible(true);
            } catch (NoSuchMethodException e3) {
            }
            try {
                this.showSoftInputUnchecked = InputMethodManager.class.getMethod(z[3], new Class[]{Integer.TYPE, ResultReceiver.class});
                this.showSoftInputUnchecked.setAccessible(true);
            } catch (NoSuchMethodException e4) {
            }
        }
    }

    public interface OnCloseListener {
        boolean onClose();
    }

    public interface OnQueryTextListener {
        boolean onQueryTextChange(String str);

        boolean onQueryTextSubmit(String str);
    }

    public interface OnSuggestionListener {
        boolean onSuggestionClick(int i);

        boolean onSuggestionSelect(int i);
    }

    public class SearchAutoComplete extends AppCompatAutoCompleteTextView {
        private static final String z;
        private SearchView mSearchView;
        private int mThreshold;

        static {
            char[] toCharArray = "U#>Y]c +XAS)".toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i = 0; length > i; i++) {
                int i2;
                char c = cArr[i];
                switch (i % 5) {
                    case v.m /*0*/:
                        i2 = 60;
                        break;
                    case at.g /*1*/:
                        i2 = 77;
                        break;
                    case at.i /*2*/:
                        i2 = 78;
                        break;
                    case at.o /*3*/:
                        i2 = 44;
                        break;
                    default:
                        i2 = 41;
                        break;
                }
                cArr[i] = (char) (i2 ^ c);
            }
            z = new String(cArr).intern();
        }

        private boolean isEmpty() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        protected void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.mSearchView.onTextFocusChanged();
        }

        public boolean enoughToFilter() {
            return this.mThreshold <= 0 || super.enoughToFilter();
        }

        protected void replaceText(CharSequence charSequence) {
        }

        static boolean access$1600(SearchAutoComplete searchAutoComplete) {
            return searchAutoComplete.isEmpty();
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        void setSearchView(SearchView searchView) {
            this.mSearchView = searchView;
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                DispatcherState keyDispatcherState;
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState == null) {
                        return true;
                    }
                    keyDispatcherState.startTracking(keyEvent, this);
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.mSearchView.clearFocus();
                        SearchView.access$2100(this.mSearchView, false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.mThreshold = getThreshold();
        }

        public void performCompletion() {
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.mThreshold = i;
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.mSearchView.hasFocus() && getVisibility() == 0) {
                ((InputMethodManager) getContext().getSystemService(z)).showSoftInput(this, 0);
                if (SearchView.isLandscapeMode(getContext())) {
                    SearchView.HIDDEN_METHOD_INVOKER.ensureImeVisible(this, true);
                }
            }
        }
    }

    static ImageView access$800(SearchView searchView) {
        return searchView.mGoButton;
    }

    private void forceSuggestionQuery() {
        HIDDEN_METHOD_INVOKER.doBeforeTextChanged(this.mSearchSrcTextView);
        HIDDEN_METHOD_INVOKER.doAfterTextChanged(this.mSearchSrcTextView);
    }

    static {
        boolean z = true;
        String[] strArr = new String[37];
        String str = "cYW";
        boolean z2 = true;
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
                        i3 = 67;
                        break;
                    case at.g /*1*/:
                        i3 = 121;
                        break;
                    case at.i /*2*/:
                        i3 = 119;
                        break;
                    case at.o /*3*/:
                        i3 = 117;
                        break;
                    default:
                        i3 = 11;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (z2) {
                case v.m /*0*/:
                    strArr2[i] = str;
                    str = "\"\u0017\u0013\u0007d*\u001dY\u001ce7\u001c\u0019\u0001%\"\u001a\u0003\u001cd-W$0J\u0011:?";
                    i = 2;
                    strArr2 = strArr3;
                    z2 = true;
                    break;
                case at.g /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "0\f\u0010\u0012n0\r(\u001ce7\u001c\u0019\u0001T'\u0018\u0003\u0014T*\u001d";
                    z2 = true;
                    break;
                case at.i /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    str = "\u0010\u001c\u0016\u0007h+/\u001e\u0010|";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case at.o /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "c\u000b\u0012\u0001~1\u0017\u0012\u0011+&\u0001\u0014\u0010{7\u0010\u0018\u001b%";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case at.p /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "0\f\u0010\u0012n0\r(\u001ce7\u001c\u0019\u0001T'\u0018\u0003\u0014";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case at.m /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "0\f\u0010\u0012n0\r(\u001ce7\u001c\u0019\u0001T&\u0001\u0003\u0007j\u001c\u001d\u0016\u0001j";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case Y.f /*6*/:
                    strArr2[i] = str;
                    str = "\u0010\u001c\u0016\u0007h+Y\u0004\u0000l$\u001c\u0004\u0001b,\u0017\u0004Uh6\u000b\u0004\u001ayc\u0018\u0003Uy,\u000eW";
                    z2 = true;
                    i = 8;
                    strArr2 = strArr3;
                    break;
                case aF.v /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    strArr2 = strArr3;
                    str = "0\f\u0010\u0012n0\r(\u001ce7\u001c\u0019\u0001T2\f\u0012\u0007r";
                    z2 = true;
                    break;
                case aF.u /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "\u0000\u0016\u0002\u0019oc\u0017\u0018\u0001+%\u0010\u0019\u0011+5\u0016\u001e\u0016nc\n\u0012\u0014y \u0011W\u0014h7\u0010\u0001\u001c\u007f:";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case Y.l /*9*/:
                    strArr2[i] = str;
                    str = "\u0010\u001c\u0016\u0007h+/\u001e\u0010|";
                    z2 = true;
                    i = 11;
                    strArr2 = strArr3;
                    break;
                case Y.t /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    strArr2 = strArr3;
                    str = " \u0018\u001b\u0019b-\u001e(\u0005j \u0012\u0016\u0012n";
                    z2 = true;
                    break;
                case Y.j /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "\"\u0017\u0013\u0007d*\u001dY\u0006{&\u001c\u0014\u001d%&\u0001\u0003\u0007jm56;L\u0016800";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case Y.p /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "\"\u0017\u0013\u0007d*\u001dY\u0006{&\u001c\u0014\u001d%&\u0001\u0003\u0007jm)%:F\u0013-";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case Y.q /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "\"\u0017\u0013\u0007d*\u001dY\u0006{&\u001c\u0014\u001d%&\u0001\u0003\u0007jm+2&^\u000f-$*[\u000673<E\u000409!N\r-";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginEnd /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "%\u000b\u0012\u0010T%\u0016\u0005\u0018";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleMarginTop /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "\"\u0017\u0013\u0007d*\u001dY\u0006{&\u001c\u0014\u001d%&\u0001\u0003\u0007jm56;L\u0016800T\u000e630G";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case VideoMessage.JPEG_THUMBNAIL_FIELD_NUMBER /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "\"\u0017\u0013\u0007d*\u001dY\u0006{&\u001c\u0014\u001d%&\u0001\u0003\u0007jm46-T\u0011<$ G\u0017*";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_maxButtonHeight /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "\"\u0017\u0013\u0007d*\u001dY\u001ce7\u001c\u0019\u0001%\"\u001a\u0003\u001cd-W$0J\u0011:?";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseIcon /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "\"\t\u0007*o\"\r\u0016";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_collapseContentDescription /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "\"\u0017\u0013\u0007d*\u001dY\u0006{&\u001c\u0014\u001d%&\u0001\u0003\u0007jm+2&^\u000f-$*[\u000673<E\u000409!N\r-(7^\r=;0";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationIcon /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "\"\u0017\u0013\u0007d*\u001dY\u0006{&\u001c\u0014\u001d%\"\u001a\u0003\u001cd-W 0I\u001c*24Y\u00001";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_navigationContentDescription /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "\"\u0017\u0013\u0007d*\u001dY\u0006{&\u001c\u0014\u001d%&\u0001\u0003\u0007jm56;L\u0016800T\u000e630G";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_logoDescription /*22*/:
                    strArr2[i] = str;
                    i = 24;
                    str = "4\u001c\u0015*x&\u0018\u0005\u0016c";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_titleTextColor /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    str = "\"\u0017\u0013\u0007d*\u001dY\u0006{&\u001c\u0014\u001d%\"\u001a\u0003\u001cd-W%0H\f>9<Q\u0006&$%N\u0006:?";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Toolbar_subtitleTextColor /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "\u0005\u0018\u001e\u0019n'Y\u001b\u0014~-\u001a\u001fUj \r\u001e\u0003b7\u0000MU";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextAppearance /*25*/:
                    strArr2[i] = str;
                    i = 27;
                    str = "\u0010\u001c\u0016\u0007h+/\u001e\u0010|";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionMenuTextColor /*26*/:
                    strArr2[i] = str;
                    i = 28;
                    str = "\"\u0017\u0013\u0007d*\u001dY\u001ce7\u001c\u0019\u0001%\"\u001a\u0003\u001cd-W$0J\u0011:?";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeStyle /*27*/:
                    strArr2[i] = str;
                    i = 29;
                    str = "*\u0017\u0003\u0010e7&\u0012\r\u007f1\u0018(\u0011j7\u0018(\u001en:";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseButtonStyle /*28*/:
                    strArr2[i] = str;
                    i = 30;
                    str = "\"\t\u0007*o\"\r\u0016";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeBackground /*29*/:
                    strArr2[i] = str;
                    i = 31;
                    str = "2\f\u0012\u0007r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSplitBackground /*30*/:
                    strArr2[i] = str;
                    i = 32;
                    str = "\"\u001a\u0003\u001cd-&\u001c\u0010r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCloseDrawable /*31*/:
                    strArr2[i] = str;
                    i = 33;
                    str = "\"\u001a\u0003\u001cd-&\u001a\u0006l";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCutDrawable /*32*/:
                    strArr2[i] = str;
                    i = 34;
                    str = "6\n\u0012\u0007T2\f\u0012\u0007r";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeCopyDrawable /*33*/:
                    strArr2[i] = str;
                    i = 35;
                    str = "*\u0017\u0007\u0000\u007f\u001c\u0014\u0012\u0001c,\u001d";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModePasteDrawable /*34*/:
                    strArr2[i] = str;
                    i = 36;
                    str = " \u0018\u001b\u0019b-\u001e(\u0005j \u0012\u0016\u0012n";
                    z2 = true;
                    strArr2 = strArr3;
                    break;
                case arj.Theme_actionModeSelectAllDrawable /*35*/:
                    strArr2[i] = str;
                    z = strArr3;
                    try {
                        if (VERSION.SDK_INT < 8) {
                            z = false;
                        }
                        IS_AT_LEAST_FROYO = z;
                        HIDDEN_METHOD_INVOKER = new AutoCompleteTextViewReflector();
                        return;
                    } catch (ActivityNotFoundException e) {
                        throw e;
                    }
                default:
                    strArr2[i] = str;
                    str = "0\f\u0010\u0012n0\r(\u001ce7\u001c\u0019\u0001T\"\u001a\u0003\u001cd-";
                    i = 1;
                    strArr2 = strArr3;
                    z2 = false;
                    break;
            }
        }
    }

    static void access$000(SearchView searchView) {
        searchView.updateFocusedState();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence;
        boolean z = LinearLayoutCompat.a;
        if (this.mQueryHint != null) {
            charSequence = this.mQueryHint;
            if (!z) {
                return charSequence;
            }
        }
        try {
            if (IS_AT_LEAST_FROYO) {
                if (!(this.mSearchable == null || this.mSearchable.getHintId() == 0)) {
                    charSequence = getContext().getText(this.mSearchable.getHintId());
                    if (!z) {
                        return charSequence;
                    }
                }
            }
            return this.mDefaultQueryHint;
        } catch (ActivityNotFoundException e) {
            throw e;
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    static void access$1100(SearchView searchView) {
        searchView.onVoiceClicked();
    }

    private void onTextChanged(CharSequence charSequence) {
        boolean z = true;
        CharSequence text = this.mSearchSrcTextView.getText();
        try {
            boolean z2;
            this.mUserQuery = text;
            if (TextUtils.isEmpty(text)) {
                z2 = false;
            } else {
                z2 = true;
            }
            try {
                updateSubmitButton(z2);
                if (z2) {
                    z = false;
                }
                try {
                    updateVoiceButton(z);
                    updateCloseButton();
                    updateSubmitArea();
                    if (this.mOnQueryChangeListener != null) {
                        if (!TextUtils.equals(charSequence, this.mOldQueryText)) {
                            this.mOnQueryChangeListener.onQueryTextChange(charSequence.toString());
                        }
                    }
                    this.mOldQueryText = charSequence.toString();
                } catch (ActivityNotFoundException e) {
                    throw e;
                } catch (ActivityNotFoundException e2) {
                    throw e2;
                }
            } catch (ActivityNotFoundException e22) {
                throw e22;
            }
        } catch (ActivityNotFoundException e222) {
            throw e222;
        }
    }

    private Intent createIntentFromSuggestion(Cursor cursor, int i, String str) {
        try {
            Uri uri;
            String columnString = SuggestionsAdapter.getColumnString(cursor, z[1]);
            if (columnString == null) {
                if (VERSION.SDK_INT >= 8) {
                    columnString = this.mSearchable.getSuggestIntentAction();
                }
            }
            if (columnString == null) {
                columnString = z[2];
            }
            String columnString2 = SuggestionsAdapter.getColumnString(cursor, z[6]);
            if (IS_AT_LEAST_FROYO && columnString2 == null) {
                columnString2 = this.mSearchable.getSuggestIntentData();
            }
            if (columnString2 != null) {
                String columnString3 = SuggestionsAdapter.getColumnString(cursor, z[3]);
                if (columnString3 != null) {
                    columnString2 = columnString2 + "/" + Uri.encode(columnString3);
                }
            }
            if (columnString2 == null) {
                uri = null;
            } else {
                uri = Uri.parse(columnString2);
            }
            String columnString4 = SuggestionsAdapter.getColumnString(cursor, z[9]);
            return createIntent(columnString, uri, SuggestionsAdapter.getColumnString(cursor, z[7]), columnString4, i, str);
        } catch (RuntimeException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Throwable e3) {
            int position;
            Throwable th = e3;
            try {
                position = cursor.getPosition();
            } catch (RuntimeException e4) {
                position = -1;
            }
            Log.w(z[4], z[8] + position + z[5], th);
            return null;
        }
    }

    private void updateSubmitArea() {
        int i = 8;
        try {
            if (isSubmitAreaEnabled()) {
                if (this.mGoButton.getVisibility() == 0 || this.mVoiceButton.getVisibility() == 0) {
                    i = 0;
                }
            }
            this.mSubmitArea.setVisibility(i);
        } catch (ActivityNotFoundException e) {
            throw e;
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    public void setInputType(int i) {
        this.mSearchSrcTextView.setInputType(i);
    }

    public void setQuery(CharSequence charSequence, boolean z) {
        try {
            this.mSearchSrcTextView.setText(charSequence);
            if (charSequence != null) {
                this.mSearchSrcTextView.setSelection(this.mSearchSrcTextView.length());
                this.mUserQuery = charSequence;
            }
            if (z) {
                try {
                    if (!TextUtils.isEmpty(charSequence)) {
                        onSubmitQuery();
                    }
                } catch (ActivityNotFoundException e) {
                    throw e;
                }
            }
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    private void postUpdateFocusedState() {
        post(this.mUpdateDrawableStateRunnable);
    }

    protected void onDetachedFromWindow() {
        removeCallbacks(this.mUpdateDrawableStateRunnable);
        post(this.mReleaseCursorRunnable);
        super.onDetachedFromWindow();
    }

    public void setOnSearchClickListener(OnClickListener onClickListener) {
        this.mOnSearchClickListener = onClickListener;
    }

    public void setOnQueryTextListener(OnQueryTextListener onQueryTextListener) {
        this.mOnQueryChangeListener = onQueryTextListener;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        postUpdateFocusedState();
    }

    @TargetApi(8)
    private Intent createVoiceWebSearchIntent(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        try {
            String str;
            String str2 = z[36];
            if (searchActivity == null) {
                str = null;
            } else {
                str = searchActivity.flattenToShortString();
            }
            intent2.putExtra(str2, str);
            return intent2;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void adjustDropDownSizeAndPosition() {
        /*
        r6 = this;
        r0 = r6.mDropDownAnchor;
        r0 = r0.getWidth();
        r1 = 1;
        if (r0 <= r1) goto L_0x0060;
    L_0x0009:
        r0 = r6.getContext();
        r0 = r0.getResources();
        r1 = r6.mSearchPlate;
        r2 = r1.getPaddingLeft();
        r3 = new android.graphics.Rect;
        r3.<init>();
        r1 = android.support.v7.widget.ViewUtils.isLayoutRtl(r6);
        r4 = r6.mIconifiedByDefault;	 Catch:{ ActivityNotFoundException -> 0x0061 }
        if (r4 == 0) goto L_0x0063;
    L_0x0024:
        r4 = android.support.v7.appcompat.R.dimen.abc_dropdownitem_icon_width;	 Catch:{ ActivityNotFoundException -> 0x0061 }
        r4 = r0.getDimensionPixelSize(r4);	 Catch:{ ActivityNotFoundException -> 0x0061 }
        r5 = android.support.v7.appcompat.R.dimen.abc_dropdownitem_text_padding_left;	 Catch:{ ActivityNotFoundException -> 0x0061 }
        r0 = r0.getDimensionPixelSize(r5);	 Catch:{ ActivityNotFoundException -> 0x0061 }
        r0 = r0 + r4;
    L_0x0031:
        r4 = r6.mSearchSrcTextView;
        r4 = r4.getDropDownBackground();
        r4.getPadding(r3);
        if (r1 == 0) goto L_0x0043;
    L_0x003c:
        r1 = r3.left;
        r1 = -r1;
        r4 = android.support.v7.widget.LinearLayoutCompat.a;
        if (r4 == 0) goto L_0x0048;
    L_0x0043:
        r1 = r3.left;
        r1 = r1 + r0;
        r1 = r2 - r1;
    L_0x0048:
        r4 = r6.mSearchSrcTextView;
        r4.setDropDownHorizontalOffset(r1);
        r1 = r6.mDropDownAnchor;
        r1 = r1.getWidth();
        r4 = r3.left;
        r1 = r1 + r4;
        r3 = r3.right;
        r1 = r1 + r3;
        r0 = r0 + r1;
        r0 = r0 - r2;
        r1 = r6.mSearchSrcTextView;
        r1.setDropDownWidth(r0);
    L_0x0060:
        return;
    L_0x0061:
        r0 = move-exception;
        throw r0;
    L_0x0063:
        r0 = 0;
        goto L_0x0031;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SearchView.adjustDropDownSizeAndPosition():void");
    }

    private void updateQueryHint() {
        CharSequence queryHint = getQueryHint();
        try {
            SearchAutoComplete searchAutoComplete = this.mSearchSrcTextView;
            if (queryHint == null) {
                queryHint = "";
            }
            searchAutoComplete.setHint(getDecoratedHint(queryHint));
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    private CharSequence getDecoratedHint(CharSequence charSequence) {
        try {
            if (!this.mIconifiedByDefault) {
                return charSequence;
            }
            if (this.mSearchHintIcon == null) {
                return charSequence;
            }
            int textSize = (int) (((double) this.mSearchSrcTextView.getTextSize()) * 1.25d);
            this.mSearchHintIcon.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(z[0]);
            spannableStringBuilder.setSpan(new ImageSpan(this.mSearchHintIcon), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            return spannableStringBuilder;
        } catch (ActivityNotFoundException e) {
            throw e;
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    static OnFocusChangeListener access$200(SearchView searchView) {
        return searchView.mOnQueryTextFocusChangeListener;
    }

    static void access$1300(SearchView searchView) {
        searchView.forceSuggestionQuery();
    }

    static void access$500(SearchView searchView) {
        searchView.onSearchClicked();
    }

    public void onActionViewExpanded() {
        try {
            if (!this.mExpandedInActionView) {
                this.mExpandedInActionView = true;
                this.mCollapsedImeOptions = this.mSearchSrcTextView.getImeOptions();
                this.mSearchSrcTextView.setImeOptions(this.mCollapsedImeOptions | 33554432);
                this.mSearchSrcTextView.setText("");
                setIconified(false);
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    static boolean access$1500(SearchView searchView, View view, int i, KeyEvent keyEvent) {
        return searchView.onSuggestionsKey(view, i, keyEvent);
    }

    public void clearFocus() {
        this.mClearingFocus = true;
        setImeVisibility(false);
        super.clearFocus();
        this.mSearchSrcTextView.clearFocus();
        this.mClearingFocus = false;
    }

    static CursorAdapter access$100(SearchView searchView) {
        return searchView.mSuggestionsAdapter;
    }

    static void access$700(SearchView searchView) {
        searchView.onCloseClicked();
    }

    private void updateViewsVisibility(boolean z) {
        boolean z2 = true;
        int i = 8;
        try {
            this.mIconified = z;
            int i2 = z ? 0 : 8;
            try {
                boolean z3;
                if (TextUtils.isEmpty(this.mSearchSrcTextView.getText())) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                try {
                    this.mSearchButton.setVisibility(i2);
                    updateSubmitButton(z3);
                    try {
                        this.mSearchEditFrame.setVisibility(z ? 8 : 0);
                        if (!(this.mCollapsedIcon.getDrawable() == null || this.mIconifiedByDefault) || LinearLayoutCompat.a) {
                            i = 0;
                        }
                        try {
                            this.mCollapsedIcon.setVisibility(i);
                            updateCloseButton();
                            if (z3) {
                                z2 = false;
                            }
                            updateVoiceButton(z2);
                            updateSubmitArea();
                        } catch (ActivityNotFoundException e) {
                            throw e;
                        }
                    } catch (ActivityNotFoundException e2) {
                        throw e2;
                    }
                } catch (ActivityNotFoundException e22) {
                    throw e22;
                }
            } catch (ActivityNotFoundException e222) {
                throw e222;
            }
        } catch (ActivityNotFoundException e2222) {
            throw e2222;
        }
    }

    private Intent createIntent(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        try {
            intent.addFlags(268435456);
            if (uri != null) {
                intent.setData(uri);
            }
            try {
                intent.putExtra(z[34], this.mUserQuery);
                if (str3 != null) {
                    intent.putExtra(z[31], str3);
                }
                if (str2 != null) {
                    try {
                        intent.putExtra(z[29], str2);
                    } catch (ActivityNotFoundException e) {
                        throw e;
                    }
                }
                try {
                    if (this.mAppSearchData != null) {
                        intent.putExtra(z[30], this.mAppSearchData);
                    }
                    if (i != 0) {
                        try {
                            intent.putExtra(z[32], i);
                            intent.putExtra(z[33], str4);
                        } catch (ActivityNotFoundException e2) {
                            throw e2;
                        }
                    }
                    try {
                        if (IS_AT_LEAST_FROYO) {
                            intent.setComponent(this.mSearchable.getSearchActivity());
                        }
                        return intent;
                    } catch (ActivityNotFoundException e22) {
                        throw e22;
                    }
                } catch (ActivityNotFoundException e222) {
                    throw e222;
                }
            } catch (ActivityNotFoundException e2222) {
                throw e2222;
            }
        } catch (ActivityNotFoundException e22222) {
            throw e22222;
        }
    }

    static boolean access$1900(SearchView searchView, int i) {
        return searchView.onItemSelected(i);
    }

    public CharSequence getQuery() {
        return this.mSearchSrcTextView.getText();
    }

    public void setImeOptions(int i) {
        this.mSearchSrcTextView.setImeOptions(i);
    }

    void onQueryRefine(CharSequence charSequence) {
        setQuery(charSequence);
    }

    private void onSearchClicked() {
        try {
            updateViewsVisibility(false);
            this.mSearchSrcTextView.requestFocus();
            setImeVisibility(true);
            if (this.mOnSearchClickListener != null) {
                this.mOnSearchClickListener.onClick(this);
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    public void setQueryHint(CharSequence charSequence) {
        this.mQueryHint = charSequence;
        updateQueryHint();
    }

    public boolean requestFocus(int i, Rect rect) {
        try {
            if (this.mClearingFocus) {
                return false;
            }
            try {
                if (!isFocusable()) {
                    return false;
                }
                if (isIconified()) {
                    return super.requestFocus(i, rect);
                }
                boolean requestFocus = this.mSearchSrcTextView.requestFocus(i, rect);
                if (!requestFocus) {
                    return requestFocus;
                }
                try {
                    updateViewsVisibility(false);
                    return requestFocus;
                } catch (ActivityNotFoundException e) {
                    throw e;
                }
            } catch (ActivityNotFoundException e2) {
                throw e2;
            }
        } catch (ActivityNotFoundException e22) {
            throw e22;
        }
    }

    static void access$900(SearchView searchView) {
        searchView.onSubmitQuery();
    }

    private boolean launchSuggestion(int i, int i2, String str) {
        Cursor cursor = this.mSuggestionsAdapter.getCursor();
        if (cursor != null) {
            try {
                if (cursor.moveToPosition(i)) {
                    launchIntent(createIntentFromSuggestion(cursor, i2, str));
                    return true;
                }
            } catch (ActivityNotFoundException e) {
                throw e;
            }
        }
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void updateCloseButton() {
        /*
        r4 = this;
        r1 = 1;
        r2 = 0;
        r0 = r4.mSearchSrcTextView;	 Catch:{ ActivityNotFoundException -> 0x0030 }
        r0 = r0.getText();	 Catch:{ ActivityNotFoundException -> 0x0030 }
        r0 = android.text.TextUtils.isEmpty(r0);	 Catch:{ ActivityNotFoundException -> 0x0030 }
        if (r0 != 0) goto L_0x0032;
    L_0x000e:
        r0 = r1;
    L_0x000f:
        if (r0 != 0) goto L_0x0019;
    L_0x0011:
        r3 = r4.mIconifiedByDefault;	 Catch:{ ActivityNotFoundException -> 0x0034 }
        if (r3 == 0) goto L_0x0038;
    L_0x0015:
        r3 = r4.mExpandedInActionView;	 Catch:{ ActivityNotFoundException -> 0x0036 }
        if (r3 != 0) goto L_0x0038;
    L_0x0019:
        r3 = r4.mCloseButton;	 Catch:{ ActivityNotFoundException -> 0x003a }
        if (r1 == 0) goto L_0x003c;
    L_0x001d:
        r3.setVisibility(r2);
        r1 = r4.mCloseButton;
        r1 = r1.getDrawable();
        if (r1 == 0) goto L_0x002f;
    L_0x0028:
        if (r0 == 0) goto L_0x0041;
    L_0x002a:
        r0 = ENABLED_STATE_SET;	 Catch:{ ActivityNotFoundException -> 0x003f }
    L_0x002c:
        r1.setState(r0);
    L_0x002f:
        return;
    L_0x0030:
        r0 = move-exception;
        throw r0;
    L_0x0032:
        r0 = r2;
        goto L_0x000f;
    L_0x0034:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0036 }
    L_0x0036:
        r0 = move-exception;
        throw r0;
    L_0x0038:
        r1 = r2;
        goto L_0x0019;
    L_0x003a:
        r0 = move-exception;
        throw r0;
    L_0x003c:
        r2 = 8;
        goto L_0x001d;
    L_0x003f:
        r0 = move-exception;
        throw r0;
    L_0x0041:
        r0 = EMPTY_STATE_SET;
        goto L_0x002c;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SearchView.updateCloseButton():void");
    }

    static void access$1700(SearchView searchView, int i, String str, String str2) {
        searchView.launchQuerySearch(i, str, str2);
    }

    public void setMaxWidth(int i) {
        this.mMaxWidth = i;
        requestLayout();
    }

    private boolean onItemSelected(int i) {
        try {
            if (this.mOnSuggestionListener != null) {
                if (this.mOnSuggestionListener.onSuggestionSelect(i)) {
                    return false;
                }
            }
            rewriteQueryFromSuggestion(i);
            return true;
        } catch (ActivityNotFoundException e) {
            throw e;
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    void onTextFocusChanged() {
        try {
            updateViewsVisibility(isIconified());
            postUpdateFocusedState();
            if (this.mSearchSrcTextView.hasFocus()) {
                forceSuggestionQuery();
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    private void launchQuerySearch(int i, String str, String str2) {
        getContext().startActivity(createIntent(z[28], null, null, str2, i, str));
    }

    private void addOnLayoutChangeListenerToDropDownAnchorBase() {
        this.mDropDownAnchor.getViewTreeObserver().addOnGlobalLayoutListener(new 6(this));
    }

    @TargetApi(8)
    private Intent createVoiceAppSearchIntent(Intent intent, SearchableInfo searchableInfo) {
        String str = null;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent(z[19]);
        intent2.setComponent(searchActivity);
        Parcelable activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        try {
            String string;
            String string2;
            String str2;
            int voiceMaxResults;
            if (this.mAppSearchData != null) {
                bundle.putParcelable(z[20], this.mAppSearchData);
            }
            Intent intent3 = new Intent(intent);
            String str3 = z[16];
            if (VERSION.SDK_INT >= 8) {
                Resources resources = getResources();
                if (searchableInfo.getVoiceLanguageModeId() != 0) {
                    str3 = resources.getString(searchableInfo.getVoiceLanguageModeId());
                }
                if (searchableInfo.getVoicePromptTextId() != 0) {
                    string = resources.getString(searchableInfo.getVoicePromptTextId());
                } else {
                    string = null;
                }
                if (searchableInfo.getVoiceLanguageId() != 0) {
                    string2 = resources.getString(searchableInfo.getVoiceLanguageId());
                } else {
                    string2 = null;
                }
                if (searchableInfo.getVoiceMaxResults() != 0) {
                    str2 = str3;
                    voiceMaxResults = searchableInfo.getVoiceMaxResults();
                } else {
                    str2 = str3;
                    voiceMaxResults = 1;
                }
            } else {
                string2 = null;
                string = null;
                str2 = str3;
                voiceMaxResults = 1;
            }
            try {
                intent3.putExtra(z[17], str2);
                intent3.putExtra(z[14], string);
                intent3.putExtra(z[13], string2);
                intent3.putExtra(z[18], voiceMaxResults);
                str3 = z[12];
                if (searchActivity != null) {
                    str = searchActivity.flattenToShortString();
                }
                intent3.putExtra(str3, str);
                intent3.putExtra(z[15], activity);
                intent3.putExtra(z[21], bundle);
                return intent3;
            } catch (ActivityNotFoundException e) {
                throw e;
            }
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        boolean z = LinearLayoutCompat.a;
        super(context, attributeSet, i);
        this.mShowImeRunnable = new 1(this);
        this.mUpdateDrawableStateRunnable = new 2(this);
        this.mReleaseCursorRunnable = new 3(this);
        this.mOutsideDrawablesCache = new WeakHashMap();
        this.mOnClickListener = new 7(this);
        this.mTextKeyListener = new 8(this);
        this.mOnEditorActionListener = new 9(this);
        this.mOnItemClickListener = new 10(this);
        this.mOnItemSelectedListener = new 11(this);
        this.mTextWatcher = new 12(this);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, R.styleable.SearchView, i, 0);
        this.mTintManager = obtainStyledAttributes.getTintManager();
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(R.styleable.SearchView_layout, R.layout.abc_search_view), this, true);
        this.mSearchSrcTextView = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.mSearchSrcTextView.setSearchView(this);
        this.mSearchEditFrame = findViewById(R.id.search_edit_frame);
        this.mSearchPlate = findViewById(R.id.search_plate);
        this.mSubmitArea = findViewById(R.id.submit_area);
        this.mSearchButton = (ImageView) findViewById(R.id.search_button);
        this.mGoButton = (ImageView) findViewById(R.id.search_go_btn);
        this.mCloseButton = (ImageView) findViewById(R.id.search_close_btn);
        this.mVoiceButton = (ImageView) findViewById(R.id.search_voice_btn);
        this.mCollapsedIcon = (ImageView) findViewById(R.id.search_mag_icon);
        this.mSearchPlate.setBackgroundDrawable(obtainStyledAttributes.getDrawable(R.styleable.SearchView_queryBackground));
        this.mSubmitArea.setBackgroundDrawable(obtainStyledAttributes.getDrawable(R.styleable.SearchView_submitBackground));
        this.mSearchButton.setImageDrawable(obtainStyledAttributes.getDrawable(R.styleable.SearchView_searchIcon));
        this.mGoButton.setImageDrawable(obtainStyledAttributes.getDrawable(R.styleable.SearchView_goIcon));
        this.mCloseButton.setImageDrawable(obtainStyledAttributes.getDrawable(R.styleable.SearchView_closeIcon));
        this.mVoiceButton.setImageDrawable(obtainStyledAttributes.getDrawable(R.styleable.SearchView_voiceIcon));
        this.mCollapsedIcon.setImageDrawable(obtainStyledAttributes.getDrawable(R.styleable.SearchView_searchIcon));
        this.mSearchHintIcon = obtainStyledAttributes.getDrawable(R.styleable.SearchView_searchHintIcon);
        this.mSuggestionRowLayout = obtainStyledAttributes.getResourceId(R.styleable.SearchView_suggestionRowLayout, R.layout.abc_search_dropdown_item_icons_2line);
        this.mSuggestionCommitIconResId = obtainStyledAttributes.getResourceId(R.styleable.SearchView_commitIcon, 0);
        this.mSearchButton.setOnClickListener(this.mOnClickListener);
        this.mCloseButton.setOnClickListener(this.mOnClickListener);
        this.mGoButton.setOnClickListener(this.mOnClickListener);
        this.mVoiceButton.setOnClickListener(this.mOnClickListener);
        this.mSearchSrcTextView.setOnClickListener(this.mOnClickListener);
        this.mSearchSrcTextView.addTextChangedListener(this.mTextWatcher);
        this.mSearchSrcTextView.setOnEditorActionListener(this.mOnEditorActionListener);
        this.mSearchSrcTextView.setOnItemClickListener(this.mOnItemClickListener);
        this.mSearchSrcTextView.setOnItemSelectedListener(this.mOnItemSelectedListener);
        this.mSearchSrcTextView.setOnKeyListener(this.mTextKeyListener);
        this.mSearchSrcTextView.setOnFocusChangeListener(new 4(this));
        setIconifiedByDefault(obtainStyledAttributes.getBoolean(R.styleable.SearchView_iconifiedByDefault, true));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.SearchView_android_maxWidth, -1);
        if (dimensionPixelSize != -1) {
            try {
                setMaxWidth(dimensionPixelSize);
            } catch (ActivityNotFoundException e) {
                throw e;
            }
        }
        this.mDefaultQueryHint = obtainStyledAttributes.getText(R.styleable.SearchView_defaultQueryHint);
        this.mQueryHint = obtainStyledAttributes.getText(R.styleable.SearchView_queryHint);
        dimensionPixelSize = obtainStyledAttributes.getInt(R.styleable.SearchView_android_imeOptions, -1);
        if (dimensionPixelSize != -1) {
            try {
                setImeOptions(dimensionPixelSize);
            } catch (ActivityNotFoundException e2) {
                throw e2;
            }
        }
        dimensionPixelSize = obtainStyledAttributes.getInt(R.styleable.SearchView_android_inputType, -1);
        if (dimensionPixelSize != -1) {
            try {
                setInputType(dimensionPixelSize);
            } catch (ActivityNotFoundException e22) {
                throw e22;
            }
        }
        try {
            setFocusable(obtainStyledAttributes.getBoolean(R.styleable.SearchView_android_focusable, true));
            obtainStyledAttributes.recycle();
            this.mVoiceWebSearchIntent = new Intent(z[22]);
            this.mVoiceWebSearchIntent.addFlags(268435456);
            this.mVoiceWebSearchIntent.putExtra(z[23], z[24]);
            this.mVoiceAppSearchIntent = new Intent(z[25]);
            this.mVoiceAppSearchIntent.addFlags(268435456);
            this.mDropDownAnchor = findViewById(this.mSearchSrcTextView.getDropDownAnchor());
            if (this.mDropDownAnchor != null) {
                if (VERSION.SDK_INT >= 11) {
                    addOnLayoutChangeListenerToDropDownAnchorSDK11();
                    if (z) {
                        AppCompatActivity.b++;
                    }
                }
                addOnLayoutChangeListenerToDropDownAnchorBase();
            }
            updateViewsVisibility(this.mIconifiedByDefault);
            updateQueryHint();
        } catch (ActivityNotFoundException e222) {
            throw e222;
        } catch (ActivityNotFoundException e2222) {
            throw e2222;
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private boolean onItemClicked(int i, int i2, String str) {
        try {
            if (this.mOnSuggestionListener != null) {
                if (this.mOnSuggestionListener.onSuggestionClick(i)) {
                    return false;
                }
            }
            launchSuggestion(i, 0, null);
            setImeVisibility(false);
            dismissSuggestions();
            return true;
        } catch (ActivityNotFoundException e) {
            throw e;
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    static ImageView access$400(SearchView searchView) {
        return searchView.mSearchButton;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void updateSubmitButton(boolean r3) {
        /*
        r2 = this;
        r0 = 8;
        r1 = r2.mSubmitButtonEnabled;	 Catch:{ ActivityNotFoundException -> 0x001f }
        if (r1 == 0) goto L_0x0019;
    L_0x0006:
        r1 = r2.isSubmitAreaEnabled();	 Catch:{ ActivityNotFoundException -> 0x0021 }
        if (r1 == 0) goto L_0x0019;
    L_0x000c:
        r1 = r2.hasFocus();	 Catch:{ ActivityNotFoundException -> 0x0023 }
        if (r1 == 0) goto L_0x0019;
    L_0x0012:
        if (r3 != 0) goto L_0x0018;
    L_0x0014:
        r1 = r2.mVoiceButtonEnabled;	 Catch:{ ActivityNotFoundException -> 0x0025 }
        if (r1 != 0) goto L_0x0019;
    L_0x0018:
        r0 = 0;
    L_0x0019:
        r1 = r2.mGoButton;
        r1.setVisibility(r0);
        return;
    L_0x001f:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0021 }
    L_0x0021:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0023 }
    L_0x0023:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0025 }
    L_0x0025:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SearchView.updateSubmitButton(boolean):void");
    }

    static boolean isLandscapeMode(Context context) {
        try {
            return context.getResources().getConfiguration().orientation == 2;
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    private void setImeVisibility(boolean z) {
        if (z) {
            try {
                post(this.mShowImeRunnable);
                if (!LinearLayoutCompat.a) {
                    return;
                }
            } catch (ActivityNotFoundException e) {
                throw e;
            }
        }
        removeCallbacks(this.mShowImeRunnable);
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService(z[35]);
        if (inputMethodManager != null) {
            try {
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } catch (ActivityNotFoundException e2) {
                throw e2;
            }
        }
    }

    private void onCloseClicked() {
        try {
            if (TextUtils.isEmpty(this.mSearchSrcTextView.getText())) {
                if (this.mIconifiedByDefault) {
                    try {
                        if (this.mOnCloseListener != null) {
                            try {
                                if (this.mOnCloseListener.onClose()) {
                                    return;
                                }
                            } catch (ActivityNotFoundException e) {
                                throw e;
                            }
                        }
                        try {
                            clearFocus();
                            updateViewsVisibility(true);
                            if (!LinearLayoutCompat.a) {
                                return;
                            }
                        } catch (ActivityNotFoundException e2) {
                            throw e2;
                        }
                    } catch (ActivityNotFoundException e22) {
                        throw e22;
                    }
                } else {
                    return;
                }
            }
            this.mSearchSrcTextView.setText("");
            this.mSearchSrcTextView.requestFocus();
            setImeVisibility(true);
        } catch (ActivityNotFoundException e222) {
            throw e222;
        } catch (ActivityNotFoundException e2222) {
            throw e2222;
        }
    }

    static ImageView access$600(SearchView searchView) {
        return searchView.mCloseButton;
    }

    public boolean isIconified() {
        return this.mIconified;
    }

    private void onSubmitQuery() {
        CharSequence text = this.mSearchSrcTextView.getText();
        if (text != null) {
            try {
                if (TextUtils.getTrimmedLength(text) > 0) {
                    if (this.mOnQueryChangeListener != null) {
                        try {
                            if (this.mOnQueryChangeListener.onQueryTextSubmit(text.toString())) {
                                return;
                            }
                        } catch (ActivityNotFoundException e) {
                            throw e;
                        }
                    }
                    try {
                        if (this.mSearchable != null) {
                            launchQuerySearch(0, null, text.toString());
                        }
                        setImeVisibility(false);
                        dismissSuggestions();
                    } catch (ActivityNotFoundException e2) {
                        throw e2;
                    }
                }
            } catch (ActivityNotFoundException e22) {
                throw e22;
            } catch (ActivityNotFoundException e222) {
                throw e222;
            }
        }
    }

    @TargetApi(8)
    private void onVoiceClicked() {
        try {
            if (this.mSearchable != null) {
                SearchableInfo searchableInfo = this.mSearchable;
                try {
                    if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                        getContext().startActivity(createVoiceWebSearchIntent(this.mVoiceWebSearchIntent, searchableInfo));
                        if (!LinearLayoutCompat.a) {
                            return;
                        }
                    }
                    if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                        getContext().startActivity(createVoiceAppSearchIntent(this.mVoiceAppSearchIntent, searchableInfo));
                    }
                } catch (ActivityNotFoundException e) {
                    throw e;
                } catch (ActivityNotFoundException e2) {
                    Log.w(z[11], z[10]);
                }
            }
        } catch (ActivityNotFoundException e3) {
            throw e3;
        }
    }

    public void setIconified(boolean z) {
        if (z) {
            try {
                onCloseClicked();
                if (!LinearLayoutCompat.a) {
                    return;
                }
            } catch (ActivityNotFoundException e) {
                throw e;
            }
        }
        onSearchClicked();
    }

    static void access$2000(SearchView searchView, CharSequence charSequence) {
        searchView.onTextChanged(charSequence);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void onMeasure(int r4, int r5) {
        /*
        r3 = this;
        r1 = android.support.v7.widget.LinearLayoutCompat.a;
        r0 = r3.isIconified();	 Catch:{ ActivityNotFoundException -> 0x000c }
        if (r0 == 0) goto L_0x000e;
    L_0x0008:
        super.onMeasure(r4, r5);	 Catch:{ ActivityNotFoundException -> 0x000c }
    L_0x000b:
        return;
    L_0x000c:
        r0 = move-exception;
        throw r0;
    L_0x000e:
        r2 = android.view.View.MeasureSpec.getMode(r4);
        r0 = android.view.View.MeasureSpec.getSize(r4);
        switch(r2) {
            case -2147483648: goto L_0x0023;
            case 0: goto L_0x0045;
            case 1073741824: goto L_0x0039;
            default: goto L_0x0019;
        };
    L_0x0019:
        r1 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1);
        super.onMeasure(r0, r5);
        goto L_0x000b;
    L_0x0023:
        r2 = r3.mMaxWidth;	 Catch:{ ActivityNotFoundException -> 0x004c }
        if (r2 <= 0) goto L_0x002f;
    L_0x0027:
        r2 = r3.mMaxWidth;
        r0 = java.lang.Math.min(r2, r0);
        if (r1 == 0) goto L_0x0019;
    L_0x002f:
        r2 = r3.getPreferredWidth();
        r0 = java.lang.Math.min(r2, r0);
        if (r1 == 0) goto L_0x0019;
    L_0x0039:
        r2 = r3.mMaxWidth;	 Catch:{ ActivityNotFoundException -> 0x004e }
        if (r2 <= 0) goto L_0x0019;
    L_0x003d:
        r2 = r3.mMaxWidth;
        r0 = java.lang.Math.min(r2, r0);
        if (r1 == 0) goto L_0x0019;
    L_0x0045:
        r0 = r3.mMaxWidth;	 Catch:{ ActivityNotFoundException -> 0x0050 }
        if (r0 <= 0) goto L_0x0052;
    L_0x0049:
        r0 = r3.mMaxWidth;	 Catch:{ ActivityNotFoundException -> 0x0050 }
        goto L_0x0019;
    L_0x004c:
        r0 = move-exception;
        throw r0;
    L_0x004e:
        r0 = move-exception;
        throw r0;
    L_0x0050:
        r0 = move-exception;
        throw r0;
    L_0x0052:
        r0 = r3.getPreferredWidth();
        goto L_0x0019;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SearchView.onMeasure(int, int):void");
    }

    private void launchIntent(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (Throwable e) {
                Log.e(z[27], z[26] + intent, e);
            }
        }
    }

    static SearchableInfo access$1400(SearchView searchView) {
        return searchView.mSearchable;
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    static ImageView access$1000(SearchView searchView) {
        return searchView.mVoiceButton;
    }

    public void setOnCloseListener(OnCloseListener onCloseListener) {
        this.mOnCloseListener = onCloseListener;
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    static boolean access$1800(SearchView searchView, int i, int i2, String str) {
        return searchView.onItemClicked(i, i2, str);
    }

    private boolean onSuggestionsKey(View view, int i, KeyEvent keyEvent) {
        try {
            if (this.mSearchable == null) {
                return false;
            }
            try {
                if (this.mSuggestionsAdapter == null) {
                    return false;
                }
                try {
                    if (keyEvent.getAction() != 0) {
                        return false;
                    }
                    if (!KeyEventCompat.hasNoModifiers(keyEvent)) {
                        return false;
                    }
                    if (i == 66 || i == 84 || i == 61) {
                        return onItemClicked(this.mSearchSrcTextView.getListSelection(), 0, null);
                    }
                    if (i == 21 || i == 22) {
                        int i2;
                        if (i == 21) {
                            i2 = 0;
                        } else {
                            i2 = this.mSearchSrcTextView.length();
                        }
                        this.mSearchSrcTextView.setSelection(i2);
                        this.mSearchSrcTextView.setListSelection(0);
                        this.mSearchSrcTextView.clearListSelection();
                        HIDDEN_METHOD_INVOKER.ensureImeVisible(this.mSearchSrcTextView, true);
                        return true;
                    } else if (i != 19) {
                        return false;
                    } else {
                        try {
                            return this.mSearchSrcTextView.getListSelection() == 0 ? false : false;
                        } catch (ActivityNotFoundException e) {
                            throw e;
                        }
                    }
                } catch (ActivityNotFoundException e2) {
                    throw e2;
                } catch (ActivityNotFoundException e22) {
                    try {
                        throw e22;
                    } catch (ActivityNotFoundException e222) {
                        try {
                            throw e222;
                        } catch (ActivityNotFoundException e2222) {
                            throw e2222;
                        }
                    }
                }
            } catch (ActivityNotFoundException e22222) {
                throw e22222;
            }
        } catch (ActivityNotFoundException e222222) {
            throw e222222;
        }
    }

    private void dismissSuggestions() {
        this.mSearchSrcTextView.dismissDropDown();
    }

    static void access$300(SearchView searchView) {
        searchView.adjustDropDownSizeAndPosition();
    }

    public void onActionViewCollapsed() {
        setQuery("", false);
        clearFocus();
        updateViewsVisibility(true);
        this.mSearchSrcTextView.setImeOptions(this.mCollapsedImeOptions);
        this.mExpandedInActionView = false;
    }

    @TargetApi(11)
    private void addOnLayoutChangeListenerToDropDownAnchorSDK11() {
        this.mDropDownAnchor.addOnLayoutChangeListener(new 5(this));
    }

    static void access$2100(SearchView searchView, boolean z) {
        searchView.setImeVisibility(z);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean isSubmitAreaEnabled() {
        /*
        r1 = this;
        r0 = r1.mSubmitButtonEnabled;	 Catch:{ ActivityNotFoundException -> 0x0010 }
        if (r0 != 0) goto L_0x0008;
    L_0x0004:
        r0 = r1.mVoiceButtonEnabled;	 Catch:{ ActivityNotFoundException -> 0x0012 }
        if (r0 == 0) goto L_0x0016;
    L_0x0008:
        r0 = r1.isIconified();	 Catch:{ ActivityNotFoundException -> 0x0014 }
        if (r0 != 0) goto L_0x0016;
    L_0x000e:
        r0 = 1;
    L_0x000f:
        return r0;
    L_0x0010:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0012 }
    L_0x0012:
        r0 = move-exception;
        throw r0;	 Catch:{ ActivityNotFoundException -> 0x0014 }
    L_0x0014:
        r0 = move-exception;
        throw r0;
    L_0x0016:
        r0 = 0;
        goto L_0x000f;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SearchView.isSubmitAreaEnabled():boolean");
    }

    private void updateFocusedState() {
        if (this.mSearchSrcTextView.hasFocus()) {
            try {
                int[] iArr = FOCUSED_STATE_SET;
            } catch (ActivityNotFoundException e) {
                throw e;
            }
        }
        iArr = EMPTY_STATE_SET;
        Drawable background = this.mSearchPlate.getBackground();
        if (background != null) {
            try {
                background.setState(iArr);
            } catch (ActivityNotFoundException e2) {
                throw e2;
            }
        }
        background = this.mSubmitArea.getBackground();
        if (background != null) {
            try {
                background.setState(iArr);
            } catch (ActivityNotFoundException e22) {
                throw e22;
            }
        }
        invalidate();
    }

    private void updateVoiceButton(boolean z) {
        try {
            int i;
            if (this.mVoiceButtonEnabled) {
                if (!isIconified() && z) {
                    i = 0;
                    this.mGoButton.setVisibility(8);
                    this.mVoiceButton.setVisibility(i);
                }
            }
            i = 8;
            this.mVoiceButton.setVisibility(i);
        } catch (ActivityNotFoundException e) {
            throw e;
        } catch (ActivityNotFoundException e2) {
            throw e2;
        }
    }

    public void setIconifiedByDefault(boolean z) {
        try {
            if (this.mIconifiedByDefault != z) {
                this.mIconifiedByDefault = z;
                updateViewsVisibility(z);
                updateQueryHint();
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    private void setQuery(CharSequence charSequence) {
        try {
            int i;
            this.mSearchSrcTextView.setText(charSequence);
            SearchAutoComplete searchAutoComplete = this.mSearchSrcTextView;
            if (TextUtils.isEmpty(charSequence)) {
                i = 0;
            } else {
                i = charSequence.length();
            }
            searchAutoComplete.setSelection(i);
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    static SearchAutoComplete access$1200(SearchView searchView) {
        return searchView.mSearchSrcTextView;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void rewriteQueryFromSuggestion(int r5) {
        /*
        r4 = this;
        r0 = android.support.v7.widget.LinearLayoutCompat.a;
        r1 = r4.mSearchSrcTextView;
        r1 = r1.getText();
        r2 = r4.mSuggestionsAdapter;
        r2 = r2.getCursor();
        if (r2 != 0) goto L_0x0011;
    L_0x0010:
        return;
    L_0x0011:
        r3 = r2.moveToPosition(r5);
        if (r3 == 0) goto L_0x0029;
    L_0x0017:
        r3 = r4.mSuggestionsAdapter;
        r2 = r3.convertToString(r2);
        if (r2 == 0) goto L_0x0024;
    L_0x001f:
        r4.setQuery(r2);	 Catch:{ ActivityNotFoundException -> 0x002f }
        if (r0 == 0) goto L_0x0027;
    L_0x0024:
        r4.setQuery(r1);	 Catch:{ ActivityNotFoundException -> 0x002f }
    L_0x0027:
        if (r0 == 0) goto L_0x0010;
    L_0x0029:
        r4.setQuery(r1);	 Catch:{ ActivityNotFoundException -> 0x002d }
        goto L_0x0010;
    L_0x002d:
        r0 = move-exception;
        throw r0;
    L_0x002f:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SearchView.rewriteQueryFromSuggestion(int):void");
    }
}
