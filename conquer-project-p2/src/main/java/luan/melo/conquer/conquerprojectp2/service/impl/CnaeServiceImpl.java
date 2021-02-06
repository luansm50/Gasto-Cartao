package luan.melo.conquer.conquerprojectp2.service.impl;

import luan.melo.conquer.conquerprojectp2.dao.CnaeDao;
import luan.melo.conquer.conquerprojectp2.domain.Cnae;
import luan.melo.conquer.conquerprojectp2.service.CnaeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional(readOnly = false)
public class CnaeServiceImpl implements CnaeService {

    @Autowired
    CnaeDao dao;

    @Override
    public void save(Cnae cnae) {
        if(findById(cnae.getCodigoClasse()) == null )
            dao.save(cnae);
    }

    @Override
    public void update(Cnae cnae) {

    }

    @Override
    public void delete(String codigoClasse) {

    }

    @Override
    @Transactional(readOnly = true)
    public Cnae findById(String codigoClasse) {
        return dao.findById(codigoClasse);
    }

    @Override
    public List<Cnae> findAll() {
        return null;
    }
}
