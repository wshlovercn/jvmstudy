package com.fengchen.gc;

/**
 * 观察GC 过程
 * 设置虚拟机参数：-verbose:gc -XX:+PrintGCDetails -Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8 -XX:+UseConcMarkSweepGC -XX:+UseConcMarkSweepGC
 */
public class GcVisitor {
    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        byte[] a1 = new byte[2 * _1MB];
        byte[] a2 = new byte[2 * _1MB];
        byte[] a3 = new byte[2 * _1MB];
        byte[] a4 = new byte[4 * _1MB];
    }
}
