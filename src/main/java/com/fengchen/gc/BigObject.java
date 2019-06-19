package com.fengchen.gc;

/**
 * 观察大对象直接进入老年代
 * 虚拟机参数：-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:SurvivorRatio=8 -XX:PretenureSizeThreshold=1572864 -XX:+UseConcMarkSweepGC -XX:+UseCMSCompactAtFullCollection
 *
 * 目前看来，参数设置并没有生效
 */
public class BigObject {
    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        byte[] a = new byte[2 * _1MB];
    }
}
