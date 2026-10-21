package com.ads.lojinha;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

    // lista os pedidos de um cliente
    List<Pedido> findByCodigoCliente(int codigoCliente);

}
