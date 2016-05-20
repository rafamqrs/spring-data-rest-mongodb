package br.com.ong.dao;

import br.com.ong.modelo.Noticia;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "noticias", path = "noticias")
public interface NoticiaRepository extends MongoRepository<Noticia, String> {

}
