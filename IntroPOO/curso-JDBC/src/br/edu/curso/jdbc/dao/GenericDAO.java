package br.edu.curso.jdbc.dao;

import br.edu.curso.jdbc.excpetion.PersistenciaExcpetion;

import java.util.List;

/**
 * @param <T>
 */
public interface GenericDAO<T> {
    void inserir(T obj) throws PersistenciaExcpetion;

    void atualizar(T obj) throws  PersistenciaExcpetion;

    void deletar(Integer id) throws  PersistenciaExcpetion;

    List<T> listarTodos() throws PersistenciaExcpetion;

    T buscarPorId(Integer id) throws  PersistenciaExcpetion;
}
