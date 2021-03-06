package br.com.luiz.pontointeligente.repositories;

import br.com.luiz.pontointeligente.entities.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {


    @Transactional(readOnly = true)
    Empresa findByCnpj(String cnpj);

}
