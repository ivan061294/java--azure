package com.example.demo.users;

import com.example.demo.interfaces.Iusers;
import com.example.demo.models.usermodels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")

public class Userscontroller {

    @Autowired
    private Iusers iusers;
    @GetMapping
    public ResponseEntity<List<usermodels>>getuser(){
        List<usermodels>user= iusers.findAll();
        return ResponseEntity.ok(user);
    }
    @PostMapping
    public ResponseEntity<usermodels>createuser(@RequestBody usermodels user){
        usermodels newuser = iusers.save(user);
        return ResponseEntity.ok(newuser);
    }
    @DeleteMapping(value = "{id}")
    public ResponseEntity<Void>Deleteuser(@PathVariable("id")long id){
        iusers.deleteById(id);
        return ResponseEntity.ok(null);
    }
    @PutMapping
    public ResponseEntity<usermodels>Updateuser(@RequestBody usermodels user){
        Optional<usermodels>optionaluser = iusers.findById(user.getId());
        if (optionaluser.isPresent()){
            usermodels updateuser = optionaluser.get();
            updateuser.setName(user.getName());
            updateuser.setApellido(user.getApellido());
            updateuser.setPassworf(user.getPassworf());
            updateuser.setNrotelefono(user.getNrotelefono());
            updateuser.setEmail(user.getEmail());
            iusers.save(updateuser);
            return ResponseEntity.ok(updateuser);
        }else{
            return ResponseEntity.notFound().build();
        }
    }


}
