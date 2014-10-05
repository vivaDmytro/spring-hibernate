package org.dmytrij.service;

import org.dmytrij.entity.Instrument;

import java.util.List;

/**
 * Created by Дмитрий on 04.10.14.
 */
public interface InstrumentService {

    List<Instrument> getInstruments();
    void add (Instrument instrument);
    void remove(Instrument instrument);
}
