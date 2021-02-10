package com.carlosandrade.microservice.fornecedor.repository;

import org.springframework.data.repository.CrudRepository;

import com.carlosandrade.microservice.fornecedor.model.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, Long>{

}
