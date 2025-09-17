package psii.senai.dbescola.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import psii.senai.dbescola.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}

