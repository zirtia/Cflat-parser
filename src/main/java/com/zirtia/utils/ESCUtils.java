package com.zirtia.utils;

import com.zirtia.exception.CompileException;
import com.zirtia.exception.FileException;

public class ESCUtils {

    public static long integerValue(String image) {
        String s = image.replaceFirst("[UL]+", "");
        if (s.startsWith("0x") || s.startsWith("0X")) {
            return Long.parseLong(s.substring(2), 16);
        }
        else if (s.startsWith("0") && !s.equals("0")) {
            return Long.parseLong(s.substring(1), 8);
        }
        else {
            return Long.parseLong(s, 10);
        }
    }
    public static long characterCode(String image) {
        String s = stringValue(image);
        if (s.length() != 1) {
            throw new Error("must not happen: character length > 1");
        }
        return (long)s.charAt(0);
    }

    public static String stringValue(String _image) {
        int pos = 0;
        int idx;
        StringBuilder buf = new StringBuilder();
        String image = _image.substring(1, _image.length() - 1);

        while ((idx = image.indexOf("\\", pos)) >= 0) {
            buf.append(image.substring(pos, idx));
            if (image.length() >= idx + 4
                    && Character.isDigit(image.charAt(idx+1))
                    && Character.isDigit(image.charAt(idx+2))
                    && Character.isDigit(image.charAt(idx+3))) {
                buf.append(unescapeOctal(image.substring(idx+1, idx+4)));
                pos = idx + 4;
            }
            else {
                buf.append(unescapeSeq(image.charAt(idx+1)));
                pos = idx + 2;
            }
        }
        if (pos < image.length()) {
            buf.append(image.substring(pos, image.length()));
        }
        return buf.toString();
    }

    private static final int charMax = 255;

    private static char unescapeOctal(String digits){
        int i = Integer.parseInt(digits, 8);
        if (i > charMax) {
            throw new Error(
                    "octal character sequence too big: \\" + digits);
        }
        return (char)i;
    }

    private static final char bell = 7;
    private static final char backspace = 8;
    private static final char escape = 27;
    private static final char vt = 11;

    private static char unescapeSeq(char c) {
        switch (c) {
            case '0': return '\0';
            case '"': return '"';
            case '\'': return '\'';
            case 'a': return bell;
            case 'b': return backspace;
            case 'e': return escape;
            case 'f': return '\f';
            case 'n': return '\n';
            case 'r': return '\r';
            case 't': return '\t';
            case 'v': return vt;
            default:  throw new Error("unknown escape sequence: \"\\" + c);
        }
    }

    public static void main(String[] args){
        System.out.println(integerValue("012"));
        System.out.println(stringValue("\u0061\u0073\u0064\u0061\u0073\u0064\u0061\u0073"));
        System.out.println(characterCode("\u0061"));
    }
}
