package com.zirtia.utils;

public final class AsmUtils {
    private AsmUtils() {}

    static public long align(long n, long alignment) {
        return (n + alignment - 1) / alignment * alignment;
    }
}
