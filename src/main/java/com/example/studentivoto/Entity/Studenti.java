package com.example.studentivoto.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Studenti {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long Id;
@Column(name = "nome")
    private String nome;
@Column(name = "cognome")
    private String cognome;
@Column(name = "nome corso")
    private String nomecorso;
@Column(name = "voto")
    private Long voto;
@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "studenti")
    List<Persona> A;
}
