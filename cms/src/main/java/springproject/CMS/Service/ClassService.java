/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package springproject.CMS.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springproject.CMS.Repository.ClassRepository;
import springproject.CMS.model.ClassModel;

/**
 *
 * @author REDTECH
 */
@Service
public class ClassService {
    
    @Autowired
    ClassRepository repository;
    
    public boolean save(ClassModel data) {
        try {
            repository.save(data);
            return true;
        } catch (Exception ex) {
            return false;
        }
    
    }
    public List<ClassModel> findAll() {
        return repository.findAll();
    }
    
    public ClassModel findByStdName(String stdName) {
        return repository.findByStdName(stdName);
    }
    
    public ClassModel findByEmail(String email) {
        return repository.findByEmail(email);
    }
    
    public List<ClassModel> findByStdNameLike(String stdName) {
        return repository.findByStdNameLike(stdName);
    }
    
    public List<ClassModel> findByEmailLike(String email) {
        return repository.findByEmailLike(email);
    }
    
    public void deleteById(Long id) {
        repository.deleteById(id);
    
    }
    
    
    

}
