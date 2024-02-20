package com.gabimiguesamu.appWebDual.service;
import com.gabimiguesamu.appWebDual.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LoginService {


    @Autowired
    private SecurityService securityService;


    public Student userLogin(String email, String password) {
        Student student = securityService.validateEmailAndPassword(email, password);

        if (student != null) {
            // Usuario autenticado, aquí podrías realizar acciones de inicio de sesión
            return student;
        } else {

            return null;
        }
    }
}

