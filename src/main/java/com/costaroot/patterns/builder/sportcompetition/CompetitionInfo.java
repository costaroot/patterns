package com.costaroot.patterns.builder.sportcompetition;

import com.costaroot.patterns.builder.components.Format;
import com.costaroot.patterns.builder.components.Sponsors;
import com.costaroot.patterns.builder.components.SportArena;
import com.costaroot.patterns.builder.components.SportType;
import com.costaroot.patterns.singletone.SportsArbitrage;

public class CompetitionInfo {
    private SportType typeOfSports;
    private Sponsors sponsor;
    private String location;
    private SportArena sportArena;
    private int amountParticipant;
    private Format format;
    private SportsArbitrage arbitrage;
    private String name;


    public CompetitionInfo(SportType typeOfSports, Sponsors sponsor,
                           String location, SportArena sportArena, int amountParticipant,
                           Format format) {
        this.typeOfSports = typeOfSports;
        this.sponsor = sponsor;
        this.location = location;
        this.sportArena = sportArena;
        this.amountParticipant = amountParticipant;
        this.format = format;
        arbitrage = SportsArbitrage.getArbitrage("CAS");
        name = "Competition";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String print() {
        String info = "";
        info += "Name: " + name + "\n";
        info += "Type of sport: " + typeOfSports + "\n";
        info += "Format: " + format + "\n";
        info += "Amount Participant: " + amountParticipant + "\n";
        info += "Sponsor: " + sponsor + "\n";
        info += "Sport Arena: " + sportArena + "\n";
        info += "Location: " + location + "\n";
        info += "Arbitrage: " + arbitrage + "\n";
        return info;
    }
}
