package br.edu.curso.jdbc.dao;

import br.edu.curso.jdbc.br.edu.curso.jdbc.dto.PessoaDTO;
import br.edu.curso.jdbc.excpetion.PersistenciaExcpetion;

import java.util.List;

public class PessoaDAO implements  GenericDAO<PessoaDTO> {

    public void inserir (PessoaDTO obj)  {

    }
    public void atualizar (PessoaDTO obj){

    }
    public void deletar (Integer id){

    }
    public List<PessoaDTO> listarTodos(){
        return null;
    }

    @Override
    public PessoaDTO buscarPorId(Integer id) {
        return null;
    }
}
