package com.gestion.autoloc.Service;

import com.gestion.autoloc.entities.Employe;
import com.gestion.autoloc.repositories.EmployeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class IEmployeServiceImp implements IEmployeService {

    private final EmployeRepository employeRepository;

    @Override
    public Employe ajouterEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public Employe modifierEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public List<Employe> consulterEmployes() {
        return employeRepository.findAll();
    }

    @Override
    public Employe consulterEmployeById(Long idEmploye) {
        return employeRepository.findById(idEmploye).orElse(null);
    }

    @Override
    public void supprimerEmployeById(Long idEmploye) {
        employeRepository.deleteById(idEmploye);
    }
}
