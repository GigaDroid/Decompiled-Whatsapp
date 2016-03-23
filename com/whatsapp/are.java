package com.whatsapp;

import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import com.google.d2;
import com.google.e2;

public class are implements TextWatcher {
    private boolean a;
    private boolean b;
    private d2 c;
    private int d;

    private String a(CharSequence charSequence, int i) {
        char c;
        boolean z;
        String str;
        boolean z2 = DialogToastActivity.f;
        int i2 = i - 1;
        String str2 = null;
        this.c.f();
        int length = charSequence.length();
        int i3 = 0;
        boolean z3 = false;
        char c2 = '\u0000';
        while (i3 < length) {
            char charAt = charSequence.charAt(i3);
            try {
                String str3;
                char c3;
                if (PhoneNumberUtils.isNonSeparator(charAt)) {
                    if (c2 != '\u0000') {
                        str2 = a(c2, z3);
                        z3 = false;
                    }
                    str3 = str2;
                    c = charAt;
                } else {
                    c3 = c2;
                    str3 = str2;
                    c = c3;
                }
                if (i3 == i2) {
                    z3 = true;
                }
                i3++;
                if (z2) {
                    z = z3;
                    str = str3;
                    break;
                }
                c3 = c;
                str2 = str3;
                c2 = c3;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        z = z3;
        str = str2;
        c = c2;
        if (c != '\u0000') {
            return a(c, z);
        }
        return str;
    }

    public synchronized void afterTextChanged(Editable editable) {
        boolean z = true;
        synchronized (this) {
            try {
                if (this.a) {
                    if (editable.length() == 0) {
                        z = false;
                    }
                    this.a = z;
                } else {
                    try {
                        if (!this.b) {
                            Object a = a((CharSequence) editable, Selection.getSelectionEnd(editable));
                            if (a != null) {
                                int g = this.c.g();
                                this.b = true;
                                editable.replace(0, editable.length(), a, 0, a.length());
                                if (a.equals(editable.toString())) {
                                    Selection.setSelection(editable, g);
                                }
                                this.b = false;
                            }
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    } catch (IllegalArgumentException e2) {
                        throw e2;
                    }
                }
            } catch (IllegalArgumentException e22) {
                throw e22;
            } catch (IllegalArgumentException e222) {
                throw e222;
            }
        }
    }

    private String a(char c, boolean z) {
        if (!z) {
            return this.c.b(c);
        }
        try {
            return this.c.a(c);
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

    public are(String str) {
        this.b = false;
        if (str == null) {
            throw new IllegalArgumentException();
        }
        this.c = e2.a().h(str);
    }

    public are() {
        this(aqu.c());
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z = DialogToastActivity.f;
        try {
            if (!this.b) {
                if (!this.a) {
                    if (i2 == 0) {
                        try {
                            if (charSequence.length() == i) {
                                this.d = 1;
                                if (!z) {
                                    return;
                                }
                            }
                        } catch (IllegalArgumentException e) {
                            throw e;
                        } catch (IllegalArgumentException e2) {
                            try {
                                throw e2;
                            } catch (IllegalArgumentException e22) {
                                throw e22;
                            }
                        }
                    }
                    if (i3 == 0) {
                        try {
                            if (i + i2 == charSequence.length() && i2 > 0) {
                                try {
                                    this.d = 0;
                                    if (!z) {
                                        return;
                                    }
                                } catch (IllegalArgumentException e222) {
                                    try {
                                        throw e222;
                                    } catch (IllegalArgumentException e2222) {
                                        throw e2222;
                                    }
                                }
                            }
                        } catch (IllegalArgumentException e22222) {
                            try {
                                throw e22222;
                            } catch (IllegalArgumentException e222222) {
                                throw e222222;
                            }
                        }
                    }
                    if (i2 > 0) {
                        try {
                            if (!a(charSequence, i, i2)) {
                                try {
                                    this.d = 2;
                                    if (!z) {
                                        return;
                                    }
                                } catch (IllegalArgumentException e2222222) {
                                    throw e2222222;
                                }
                            }
                        } catch (IllegalArgumentException e22222222) {
                            throw e22222222;
                        }
                    }
                    this.d = 3;
                }
            }
        } catch (IllegalArgumentException e222222222) {
            throw e222222222;
        } catch (IllegalArgumentException e2222222222) {
            throw e2222222222;
        }
    }

    private void a() {
        this.a = true;
        this.c.f();
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        try {
            if (!this.b) {
                if (!this.a) {
                    try {
                        if (this.d == 3 && i3 > 0) {
                            try {
                                if (!a(charSequence, i, i3)) {
                                    this.d = 2;
                                }
                            } catch (IllegalArgumentException e) {
                                throw e;
                            }
                        }
                        try {
                            if (this.d == 1 && i3 > 0) {
                                try {
                                    if (a(charSequence, i, i3)) {
                                        try {
                                            a();
                                            if (!DialogToastActivity.f) {
                                                return;
                                            }
                                        } catch (IllegalArgumentException e2) {
                                            throw e2;
                                        }
                                    }
                                } catch (IllegalArgumentException e22) {
                                    throw e22;
                                }
                            }
                            try {
                                if (this.d == 3) {
                                    a();
                                }
                            } catch (IllegalArgumentException e222) {
                                throw e222;
                            }
                        } catch (IllegalArgumentException e2222) {
                            throw e2222;
                        } catch (IllegalArgumentException e22222) {
                            throw e22222;
                        }
                    } catch (IllegalArgumentException e222222) {
                        throw e222222;
                    } catch (IllegalArgumentException e2222222) {
                        throw e2222222;
                    }
                }
            }
        } catch (IllegalArgumentException e22222222) {
            throw e22222222;
        } catch (IllegalArgumentException e222222222) {
            throw e222222222;
        }
    }

    private boolean a(CharSequence charSequence, int i, int i2) {
        boolean z = DialogToastActivity.f;
        int i3 = i;
        while (i3 < i + i2) {
            try {
                if (PhoneNumberUtils.isNonSeparator(charSequence.charAt(i3))) {
                    i3++;
                    if (z) {
                        break;
                    }
                }
                return true;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
        return false;
    }
}
