package com.example.studentivoto.Repository;

import com.example.studentivoto.Entity.Studenti;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface StudentiRepository extends JpaRepository <Studenti, Long> {
    List<Studenti> findAllById (Long Id);
    Studenti findByNome (String nome);
    Studenti findByNomecorso (String nomecorso);
    Studenti findByVoto (Long voto);

     List<Studenti> findAll();

List<Studenti> findAllByNome(String nome);
List<Studenti> findAllByVoto(Long voto);


}
