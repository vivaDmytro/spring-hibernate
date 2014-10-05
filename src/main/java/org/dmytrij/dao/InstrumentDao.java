package org.dmytrij.dao;

import org.dmytrij.entity.Instrument;

import java.util.List;

/**
 * Created by Дмитрий on 04.10.14.
 */
public interface InstrumentDao {

    List<Instrument> getInstruments();
    void saveOrUpdate(Instrument instrument);
    void remove(Instrument instrument);
}
