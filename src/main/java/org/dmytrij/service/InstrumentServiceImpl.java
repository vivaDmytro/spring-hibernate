package org.dmytrij.service;

import org.dmytrij.dao.InstrumentDao;
import org.dmytrij.entity.Instrument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Дмитрий on 05.10.2014.
 */
@Service
public class InstrumentServiceImpl implements InstrumentService {

    @Autowired
    private InstrumentDao instrumentDao;

    @Override
    @Transactional(readOnly = true)
    public List<Instrument> getInstruments() {

        return instrumentDao.getInstruments();
    }

    @Override
    @Transactional
    public void add(Instrument instrument) {

        instrumentDao.saveOrUpdate(instrument);
    }

    @Override
    @Transactional
    public void remove(Instrument instrument) {

        instrumentDao.remove(instrument);
    }
}
