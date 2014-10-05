package org.dmytrij.service;

import org.dmytrij.dao.CompositionDao;
import org.dmytrij.entity.Composition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Дмитрий on 05.10.14.
 */

@Service
public class CompositionServiceImpl implements CompositionService {

    @Autowired
    private CompositionDao compositionDao;

    @Override
    @Transactional
    public List<Composition> getCompositions() {

        return compositionDao.getCompositions();
    }

    @Override
    @Transactional
    public void saveOrUpdate(Composition composition) {

        compositionDao.saveOrUpdate(composition);
    }

    @Override
    @Transactional
    public void remove(Composition composition) {

        compositionDao.remove(composition);
    }
}
