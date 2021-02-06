package luan.melo.conquer.conquerprojectp2.service.impl;

import luan.melo.conquer.conquerprojectp2.dao.UfDao;
import luan.melo.conquer.conquerprojectp2.domain.Uf;
import luan.melo.conquer.conquerprojectp2.service.UfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = false)
public class UfServiceImpl implements UfService {

    @Autowired
    UfDao dao;

    @Override
    public void save(Uf uf) {
        if(findById(uf.getSigla()) == null)
            dao.save(uf);
    }

    @Override
    public void update(Uf uf) {

    }

    @Override
    public void delete(String sigla) {

    }

    @Override
    @Transactional(readOnly = true)
    public Uf findById(String sigla) {
        return dao.findById(sigla);
    }

    @Override
    public List<Uf> findAll() {
        return null;
    }
}
