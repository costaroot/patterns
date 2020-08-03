package com.costaroot.patterns;

import com.costaroot.patterns.builder.builders.CompetitionInfoBuilder;
import com.costaroot.patterns.builder.builders.SportCompetitionBuilder;
import com.costaroot.patterns.builder.director.Director;
import com.costaroot.patterns.builder.sportcompetition.CompetitionInfo;
import com.costaroot.patterns.builder.sportcompetition.SportCompetition;

public class Executor {
    private Director director;

    public Executor() {
        director = new Director();
    }

    private void buildFootballCompetition() {
        SportCompetitionBuilder builder = new SportCompetitionBuilder();
        director.constructorFootballChampionship(builder);
        SportCompetition competition = builder.getResult();
        System.out.println("Football competition was created.");
    }

    private void buildFootballCompetitionInfo() {
        CompetitionInfoBuilder info = new CompetitionInfoBuilder();
        director.constructorFootballChampionship(info);
        CompetitionInfo competitionInfo = info.getResult();
        System.out.println(competitionInfo.print());
    }

    private void buildIceHokeyCompetition() {
        SportCompetitionBuilder builder = new SportCompetitionBuilder();
        director.constructorIceHokeyCup(builder);
        SportCompetition competition = builder.getResult();
        System.out.println("Ice_hokey competition was created.");
    }

    private void buildIceHokeyCompetitionInfo() {
        CompetitionInfoBuilder info = new CompetitionInfoBuilder();
        director.constructorIceHokeyCup(info);
        CompetitionInfo competitionInfo = info.getResult();
        System.out.println(competitionInfo.print());
    }

    public void run() {
        buildFootballCompetition();
        buildFootballCompetitionInfo();
        buildIceHokeyCompetition();
        buildIceHokeyCompetitionInfo();
    }
}
