package luan.melo.portal.transparencia.back.domain;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@ApiModel
@Data
@Entity
@Table(name = "ORGAO_MAXIMO")
public class OrgaoMaximo implements Serializable {

    @Id
    @Column(name = "codigo")
    public String codigo;

    @Column(name = "nome")
    public String nome;

    @Column(name = "sigla")
    public String sigla;

//    @OneToMany(mappedBy = "orgaoMaximo")
//    private List<OrgaoVinculado> orgaoVinculados;

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrgaoMaximo that = (OrgaoMaximo) o;
        return Objects.equals(codigo, that.codigo);
    }

    @Override
    public String toString(){
        return "codigo = " + codigo;
    }
}
