package com.example.studentivoto.Service;

import com.example.studentivoto.Entity.Studenti;
import com.example.studentivoto.Repository.StudentiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentiService {

    @Autowired
    private StudentiRepository studentiRepository;

    public List<Studenti> saveStudenti(List<Studenti> studentiList) {
        return studentiRepository.saveAll(studentiList);

    }
    public List<Studenti> findById(Long Id){
        return studentiRepository.findAllById(Id);
    }
    public List<Studenti> getAllStudenti(){
        return studentiRepository.findAll();
    }
    public void deleteById(Long Id){
        studentiRepository.deleteById(Id);
    }
}
