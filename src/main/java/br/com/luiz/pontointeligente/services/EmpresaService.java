package br.com.luiz.pontointeligente.services;

import br.com.luiz.pontointeligente.entities.Empresa;

import java.util.Optional;

public interface EmpresaService {

    Optional<Empresa> buscarPorCnpj(String cnpj);

    Empresa persistir(Empresa empresa);

}
