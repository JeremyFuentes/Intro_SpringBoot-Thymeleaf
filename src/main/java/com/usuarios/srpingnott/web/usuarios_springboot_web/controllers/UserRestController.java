package com.usuarios.srpingnott.web.usuarios_springboot_web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.usuarios.srpingnott.web.usuarios_springboot_web.controllers.models.DTO.UserDTO;
import com.usuarios.srpingnott.web.usuarios_springboot_web.controllers.models.User;

@RestController
@RequestMapping("/api")
public class UserRestController {

  @GetMapping("/usuarios")
  public UserDTO detalles() {
    User user = new User("Jeremy", "Fuentes", "jeremyfuentes@gmail.com");
    UserDTO userDto = new UserDTO();
    userDto.setUser(user);
    userDto.setTitle("User Details");
    return userDto;
  }
  public String getMethodName(@RequestParam String param) {
      return new String();
  }
}
