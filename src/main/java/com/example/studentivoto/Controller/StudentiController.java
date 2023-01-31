package com.example.studentivoto.Controller;

import com.example.studentivoto.Entity.Studenti;
import com.example.studentivoto.Repository.StudentiRepository;
import com.example.studentivoto.Service.StudentiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentiController {
    @Autowired
    private StudentiService studentiService;

    @GetMapping("/studenti")
    public List<Studenti> getAllStudenti() {
        return studentiService.getAllStudenti();
    }
@PostMapping("/studenti")
    public List<Studenti> saveAll(@RequestBody List<Studenti> a){
        return studentiService.saveStudenti(a);
}
@DeleteMapping("/studenti/{id}")
    public void deletebyid (@PathVariable Long id){
        studentiService.deleteById(id);
}
}
