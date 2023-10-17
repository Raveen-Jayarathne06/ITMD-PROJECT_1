/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package springproject.CMS.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springproject.CMS.Service.ClassService;
import springproject.CMS.model.ClassModel;

/**
 *
 * @author REDTECH
 */
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ClassController {
    
    @Autowired
    ClassService service;
    
    @RequestMapping(path = "/save", produces = {MediaType.APPLICATION_JSON_VALUE}, method = RequestMethod.POST)
    private String save(ClassModel data) {
        service.save(data);
        return "Data saved";
    }
    
    @RequestMapping(value = "/view/all", produces = {MediaType.APPLICATION_JSON_VALUE}, method = RequestMethod.GET)
    public ResponseEntity<List<ClassModel>> findAll() {
        //this method is use for get all students list from db
        List<ClassModel> outputData = service.findAll();
        if (outputData.isEmpty()) {
            return new ResponseEntity<List<ClassModel>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<ClassModel>>(outputData, HttpStatus.OK);

    }
    
    @RequestMapping(value = "/select/by/stdname/{stdName}", produces = {MediaType.APPLICATION_JSON_VALUE}, method = RequestMethod.GET)
    public ResponseEntity<ClassModel> findByStdName(@PathVariable String stdName) {
        //this method is use for get one student from db. 
        //ex: place student stdname as a parameter.
        
        ClassModel outputData = service.findByStdName(stdName);
        if (outputData == null) {
            return new ResponseEntity<ClassModel>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<ClassModel>(outputData, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/select/by/stdname/like/{stdName}", produces = {MediaType.APPLICATION_JSON_VALUE}, method = RequestMethod.GET)
    public ResponseEntity<List<ClassModel>> findByStdNameLike(@PathVariable String stdName) {
        //this method is use for student list like from db. 
        //ex: place student stdname as a parameter.
        
        List<ClassModel> outputData = service.findByStdNameLike(stdName);
        if (outputData == null) {
            return new ResponseEntity<List<ClassModel>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<ClassModel>>(outputData, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/select/by/email/{email}", produces = {MediaType.APPLICATION_JSON_VALUE}, method = RequestMethod.GET)
    public ResponseEntity<ClassModel> findByEmail(@PathVariable String email) {
        //this method is use for get one student from db. 
        //ex: place student stdname as a parameter.
        
        ClassModel outputData = service.findByEmail(email);
        if (outputData == null) {
            return new ResponseEntity<ClassModel>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<ClassModel>(outputData, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/select/by/email/like/{stdName}", produces = {MediaType.APPLICATION_JSON_VALUE}, method = RequestMethod.GET)
    public ResponseEntity<List<ClassModel>> findByStdemailLike(@PathVariable String stdName) {
        //this method is use for student list like from db. 
        //ex: place student stdname as a parameter.
        
        List<ClassModel> outputData = service.findByEmailLike(stdName);
        if (outputData == null) {
            return new ResponseEntity<List<ClassModel>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<ClassModel>>(outputData, HttpStatus.OK);
    }
    
    @RequestMapping("/delete/by/id/{id}")
        public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }
}
