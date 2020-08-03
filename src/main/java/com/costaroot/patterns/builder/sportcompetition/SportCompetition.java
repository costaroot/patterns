package com.costaroot.patterns.builder.sportcompetition;

import com.costaroot.patterns.builder.components.Format;
import com.costaroot.patterns.builder.components.Sponsors;
import com.costaroot.patterns.builder.components.SportArena;
import com.costaroot.patterns.builder.components.SportType;

public class SportCompetition {
    private final SportType typeOfSports;
    private Sponsors sponsor;
    private String location;
    private int amountParticipant;
    private SportArena sportArena;
    private Format format;


    public SportCompetition(SportType typeOfSports, Sponsors sponsor, String location,
                            int amountParticipant, SportArena sportArena, Format format) {
        this.typeOfSports = typeOfSports;
        this.sponsor = sponsor;
        this.location = location;
        this.amountParticipant = amountParticipant;
        this.sportArena = sportArena;
        this.format = format;
    }

    public SportType getTypeOfSports() {
        return typeOfSports;
    }

    public Sponsors getSponsor() {
        return sponsor;
    }

    public String getLocation() {
        return location;
    }

    public int getAmountParticipant() {
        return amountParticipant;
    }

    public SportArena getSportArena() {
        return sportArena;
    }

    public Format getFormat() {
        return format;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
