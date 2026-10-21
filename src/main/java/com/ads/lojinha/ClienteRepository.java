package com.ads.lojinha;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    // usado no login: busca o cliente pelo e-mail e senha
    Cliente findByEmailAndSenha(String email, String senha);

}
