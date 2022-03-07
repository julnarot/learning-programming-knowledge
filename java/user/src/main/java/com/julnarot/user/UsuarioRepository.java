package com.julnarot.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public class UsuarioRepository extends CrudRepository<UsuarioModel, Long> {

}
