package com.costaroot.patterns.singletone;

public final class SportsArbitrage {
    private static SportsArbitrage arbitrage;
    private String name;

    private SportsArbitrage(String name) {
        this.name = name;
    }

    public static SportsArbitrage getArbitrage(String name) {
        if (arbitrage == null) {
            arbitrage = new SportsArbitrage(name);
        }
        return arbitrage;
    }

    @Override
    public String toString() {
        return name;
    }
}
