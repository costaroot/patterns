package com.costaroot.patterns.builder.builders;

import com.costaroot.patterns.builder.components.Format;
import com.costaroot.patterns.builder.components.Sponsors;
import com.costaroot.patterns.builder.components.SportArena;
import com.costaroot.patterns.builder.components.SportType;

public interface Builder {
    void setSportType(SportType typeOfSport);

    void setSponsor(Sponsors sponsor);

    void setSportArena(SportArena sportArena);

    void setLocation(String location);

    void setAmountParticipant(int amountParticipant);

    void setFormat(Format format);
}
