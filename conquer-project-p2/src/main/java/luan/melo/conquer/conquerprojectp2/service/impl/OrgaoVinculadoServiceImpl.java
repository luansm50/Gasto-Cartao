package luan.melo.conquer.conquerprojectp2.service.impl;

import luan.melo.conquer.conquerprojectp2.dao.OrgaoVinculadoDao;
import luan.melo.conquer.conquerprojectp2.domain.OrgaoVinculado;
import luan.melo.conquer.conquerprojectp2.service.OrgaoMaximoService;
import luan.melo.conquer.conquerprojectp2.service.OrgaoVinculadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = false)
public class OrgaoVinculadoServiceImpl implements OrgaoVinculadoService {

    @Autowired
    OrgaoVinculadoDao dao;

    @Autowired
    OrgaoMaximoService orgaoMaximoService;

    @Override
    public void save(OrgaoVinculado orgaoVinculado) {
        if(findById(orgaoVinculado.getCnpj()) == null)
        {
            orgaoMaximoService.save(orgaoVinculado.getOrgaoMaximo());
            dao.save(orgaoVinculado);
        }
    }

    @Override
    public void update(OrgaoVinculado orgaoVinculado) {

    }

    @Override
    public void delete(String cnpj) {

    }

    @Override
    public OrgaoVinculado findById(String cnpj) {
        return dao.findById(cnpj);
    }

    @Override
    public List<OrgaoVinculado> findAll() {
        return null;
    }
}
