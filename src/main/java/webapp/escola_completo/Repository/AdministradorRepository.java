package webapp.escola_completo.Repository;

import org.springframework.data.repository.CrudRepository;

import webapp.escola_completo.Controller.Aluno;
import webapp.escola_completo.Model.Administrador;

public interface AdministradorRepository extends CrudRepository<Administrador, String> {
    Administrador findByCpf(String cpf);
    Administrador findBySenha(String senha);

    @Override
    <S extends Administrador> S save(Aluno aluno);
}
