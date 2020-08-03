package com.costaroot.patterns.builder.builders;

import com.costaroot.patterns.builder.components.Format;
import com.costaroot.patterns.builder.components.Sponsors;
import com.costaroot.patterns.builder.components.SportArena;
import com.costaroot.patterns.builder.components.SportType;
import com.costaroot.patterns.builder.sportcompetition.SportCompetition;

public class SportCompetitionBuilder implements Builder {
    private SportType typeOfSports;
    private Sponsors sponsor;
    private String location;
    private SportArena sportArena;
    private int amountParticipant;
    private Format format;

    @Override
    public void setSportType(SportType typeOfSport) {
        this.typeOfSports = typeOfSport;
    }

    @Override
    public void setSponsor(Sponsors sponsor) {
        this.sponsor = sponsor;
    }

    @Override
    public void setSportArena(SportArena sportArena) {
        this.sportArena = sportArena;
    }

    @Override
    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public void setAmountParticipant(int amountParticipant) {
        this.amountParticipant = amountParticipant;
    }

    @Override
    public void setFormat(Format format) {
        this.format = format;
    }

    public SportCompetition getResult() {
        return new SportCompetition(typeOfSports, sponsor, location,
                amountParticipant, sportArena, format);
    }
}
