package com.gabimiguesamu.appWebDual.service;
import com.gabimiguesamu.appWebDual.model.Student;
import com.gabimiguesamu.appWebDual.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**Metodo para validar el email y la contraseña del usuario**/
@Service
public class SecurityService {

    @Autowired
    private StudentRepository studentRepository;

    public Student validateEmailAndPassword(String email, String password) {
        Student student = studentRepository.findByEmailAndPassword(email,password);

        // Devolver el objeto Student si las credenciales son válidas, de lo contrario, devolver null
        return (student != null && student.getPassword().equals(password)) ? student : null;
    }
}

