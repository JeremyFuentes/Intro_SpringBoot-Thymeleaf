package com.usuarios.srpingnott.web.usuarios_springboot_web.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.usuarios.srpingnott.web.usuarios_springboot_web.controllers.models.DTO.UserDTO;
import com.usuarios.srpingnott.web.usuarios_springboot_web.controllers.models.User;

@Controller
public class UserController {

    @GetMapping("/usuarios2")
    public String getMethodName(Model model) {

        User identificarUsuario = new User("Jeremy", "Fuentes");

        UserDTO dtoEmailUserTitleCorreo = new UserDTO(
            "Titulo desde DTO",
            identificarUsuario,
            "correo@servidor"
        );

        model.addAttribute("userDTO", dtoEmailUserTitleCorreo);
        return "usuarios2";
    }

    @GetMapping("/lista")
    public String lista(ModelMap model) {
        List<User> user = Arrays.asList(
            new User("Felix","Palacios", "felix@servidor"),
            new User("Jonathan","Alas", "jonathan@servidor"),
            new User("Jeremy","Fuentes")
        );
        model.addAttribute("user", user);
        model.addAttribute("title","Lista de usuarios");
        return "lista";
    }
    
}
