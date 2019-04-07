package br.com.luiz.pontointeligente.services;

import br.com.luiz.pontointeligente.entities.Funcionario;

import java.util.Optional;

public interface FuncionarioService {

    Funcionario persistir (Funcionario funcionario);
    Optional<Funcionario> buscarPorCpf(String cpf);
    Optional<Funcionario> buscarPorEmail(String email);
    Optional<Funcionario> buscarPorId(Long id);

}
