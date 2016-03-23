package com.whatsapp.registration;

import android.support.annotation.NonNull;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import com.whatsapp.VerifySms;
import com.whatsapp.WAAppCompatActivity;

final class c implements TextWatcher {
    private String a;
    @NonNull
    private final VerifySms b;
    @NonNull
    private final CodeInputField c;

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence != null) {
            this.a = charSequence.toString();
        }
    }

    public void afterTextChanged(Editable editable) {
        String replace;
        int length;
        Object obj;
        CharSequence spannableStringBuilder;
        int i = 0;
        int i2 = CodeInputField.b;
        this.c.removeTextChangedListener(this);
        int selectionStart = this.c.getSelectionStart();
        String replace2 = editable.toString().replace(Character.toString('\u2013'), "");
        int c = CodeInputField.c() / 2;
        if (replace2.length() > 0 && this.a.startsWith(replace2.substring(0, 1)) && this.a.indexOf(160) >= 0 && replace2.indexOf(160) < 0) {
            replace2 = replace2.substring(0, replace2.length() - 1);
            selectionStart--;
            if (i2 != 0) {
                WAAppCompatActivity.c++;
            }
            replace = replace2.replace(Character.toString('\u00a0'), "");
            length = replace.length();
            if (length > c) {
                length++;
            }
            while (replace.length() < c) {
                replace = replace + '\u2013';
                if (i2 != 0) {
                    break;
                }
            }
            obj = replace.substring(0, c) + '\u00a0' + replace.substring(c, Math.min(CodeInputField.c(), replace.length()));
            while (obj.length() < CodeInputField.c() + 1) {
                obj = obj + '\u2013';
                if (i2 != 0) {
                    break;
                }
            }
            spannableStringBuilder = new SpannableStringBuilder(obj);
            while (i < spannableStringBuilder.length()) {
                if (spannableStringBuilder.charAt(i) == '\u2013') {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(1277571640), i, i + 1, 33);
                }
                i++;
                if (i2 != 0) {
                    break;
                }
            }
            this.c.setText(spannableStringBuilder);
            this.c.setSelection(Math.min(selectionStart, Math.min(length, obj.length())));
            this.c.addTextChangedListener(this);
        }
        if (replace2.length() > selectionStart && replace2.indexOf(160) == selectionStart && selectionStart == c + 1) {
            selectionStart++;
        }
        replace = replace2.replace(Character.toString('\u00a0'), "");
        length = replace.length();
        if (length > c) {
            length++;
        }
        while (replace.length() < c) {
            replace = replace + '\u2013';
            if (i2 != 0) {
                break;
                obj = replace.substring(0, c) + '\u00a0' + replace.substring(c, Math.min(CodeInputField.c(), replace.length()));
                while (obj.length() < CodeInputField.c() + 1) {
                    obj = obj + '\u2013';
                    if (i2 != 0) {
                        break;
                        spannableStringBuilder = new SpannableStringBuilder(obj);
                        while (i < spannableStringBuilder.length()) {
                            if (spannableStringBuilder.charAt(i) == '\u2013') {
                                spannableStringBuilder.setSpan(new ForegroundColorSpan(1277571640), i, i + 1, 33);
                            }
                            i++;
                            if (i2 != 0) {
                                break;
                                this.c.setText(spannableStringBuilder);
                                this.c.setSelection(Math.min(selectionStart, Math.min(length, obj.length())));
                                this.c.addTextChangedListener(this);
                            }
                        }
                        this.c.setText(spannableStringBuilder);
                        this.c.setSelection(Math.min(selectionStart, Math.min(length, obj.length())));
                        this.c.addTextChangedListener(this);
                    }
                }
                spannableStringBuilder = new SpannableStringBuilder(obj);
                while (i < spannableStringBuilder.length()) {
                    if (spannableStringBuilder.charAt(i) == '\u2013') {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(1277571640), i, i + 1, 33);
                    }
                    i++;
                    if (i2 != 0) {
                        break;
                        this.c.setText(spannableStringBuilder);
                        this.c.setSelection(Math.min(selectionStart, Math.min(length, obj.length())));
                        this.c.addTextChangedListener(this);
                    }
                }
                this.c.setText(spannableStringBuilder);
                this.c.setSelection(Math.min(selectionStart, Math.min(length, obj.length())));
                this.c.addTextChangedListener(this);
            }
        }
        obj = replace.substring(0, c) + '\u00a0' + replace.substring(c, Math.min(CodeInputField.c(), replace.length()));
        while (obj.length() < CodeInputField.c() + 1) {
            obj = obj + '\u2013';
            if (i2 != 0) {
                break;
                spannableStringBuilder = new SpannableStringBuilder(obj);
                while (i < spannableStringBuilder.length()) {
                    if (spannableStringBuilder.charAt(i) == '\u2013') {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(1277571640), i, i + 1, 33);
                    }
                    i++;
                    if (i2 != 0) {
                        break;
                        this.c.setText(spannableStringBuilder);
                        this.c.setSelection(Math.min(selectionStart, Math.min(length, obj.length())));
                        this.c.addTextChangedListener(this);
                    }
                }
                this.c.setText(spannableStringBuilder);
                this.c.setSelection(Math.min(selectionStart, Math.min(length, obj.length())));
                this.c.addTextChangedListener(this);
            }
        }
        spannableStringBuilder = new SpannableStringBuilder(obj);
        while (i < spannableStringBuilder.length()) {
            if (spannableStringBuilder.charAt(i) == '\u2013') {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(1277571640), i, i + 1, 33);
            }
            i++;
            if (i2 != 0) {
                break;
                this.c.setText(spannableStringBuilder);
                this.c.setSelection(Math.min(selectionStart, Math.min(length, obj.length())));
                this.c.addTextChangedListener(this);
            }
        }
        this.c.setText(spannableStringBuilder);
        this.c.setSelection(Math.min(selectionStart, Math.min(length, obj.length())));
        this.c.addTextChangedListener(this);
    }

    c(VerifySms verifySms, CodeInputField codeInputField, b bVar) {
        this(verifySms, codeInputField);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence != null) {
            String a = CodeInputField.a(charSequence);
            if (a.length() == CodeInputField.c()) {
                this.b.l(a);
            }
        }
    }

    private c(@NonNull VerifySms verifySms, @NonNull CodeInputField codeInputField) {
        this.a = "";
        this.b = verifySms;
        this.c = codeInputField;
    }
}
