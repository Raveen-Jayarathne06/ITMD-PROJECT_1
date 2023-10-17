/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package springproject.CMS.Repository;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import springproject.CMS.model.ClassModel;

/**
 *
 * @author REDTECH
 */
@Repository
public interface ClassRepository extends CrudRepository<ClassModel, String> {
    
    @Override
    ClassModel save(ClassModel data);
    
    @Override
    List<ClassModel> findAll();
    
    @Query("select u from classDetails u where stdName = :stdName")
    ClassModel findByStdName(@Param("stdName") String stdName); 
    
    @Query("select u from classDetails u where email = :email")
    ClassModel findByEmail(@Param("email") String email); 
    
    @Query("select u from classDetails u where stdName  LIKE CONCAT('%',:stdName,'%')")
    List<ClassModel> findByStdNameLike(@Param("stdName") String stdName); 
    
    @Query("select u from classDetails u where email LIKE CONCAT('%',:email,'%')")
    List<ClassModel> findByEmailLike(@Param("email")String email);
    
    @Modifying
    @Transactional
    @Query("DELETE FROM classDetails WHERE id= :id")
    void deleteById(Long id);
    
    
    
    
}
