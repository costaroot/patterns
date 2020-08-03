package com.costaroot.patterns.builder.director;

import com.costaroot.patterns.builder.builders.Builder;
import com.costaroot.patterns.builder.components.Format;
import com.costaroot.patterns.builder.components.Sponsors;
import com.costaroot.patterns.builder.components.SportArena;
import com.costaroot.patterns.builder.components.SportType;

public class Director {
    public void constructorFootballChampionship(Builder builder) {
        builder.setSportType(SportType.FOOTBALL);
        builder.setSponsor(Sponsors.ADIDAS);
        builder.setLocation("England");
        builder.setSportArena(SportArena.STADIUM);
        builder.setAmountParticipant(20);
        builder.setFormat(Format.LEAGUE);
    }

    public void constructorIceHokeyCup(Builder builder) {
        builder.setSportType(SportType.ICE_HOCKEY);
        builder.setSponsor(Sponsors.REEBOK);
        builder.setLocation("Sweden");
        builder.setSportArena(SportArena.INDOOR_ARENA);
        builder.setAmountParticipant(64);
        builder.setFormat(Format.CUP);
    }

    public void constructorBasketballCup(Builder builder) {
        builder.setSportType(SportType.BASKETBALL);
        builder.setSponsor(Sponsors.ADIDAS);
        builder.setLocation("USA");
        builder.setSportArena(SportArena.INDOOR_ARENA);
        builder.setAmountParticipant(24);
        builder.setFormat(Format.MIX);
    }
}
