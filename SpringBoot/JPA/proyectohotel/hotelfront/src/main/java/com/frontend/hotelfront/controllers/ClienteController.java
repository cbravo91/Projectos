package com.frontend.hotelfront.controllers;

import java.util.Arrays;
import java.util.List;

import com.frontend.hotelfront.models.Cliente;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;


@Controller
@RequestMapping("/clients")
public class ClienteController {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    RestTemplate restT = new RestTemplate();
 
    @GetMapping("/")
    public String getClientes(Model model){
        Cliente [] objetos = restT.getForObject("http://localhost:8081/clients/", Cliente[].class);
        List <Cliente> lista = Arrays.asList(objetos);
        model.addAttribute("Cliente", lista);
        model.addAttribute("Cliente", new Cliente());
        return "clients";
    }

    public Cliente getClienteById(int dni){
        
        Cliente cliente= restT.getForObject("http://localhost:8081/clients/find/{"+dni+"}", Cliente.class);
        return cliente;
    }
    
    @PostMapping("/add")
    public String postCliente(@ModelAttribute Cliente cliente){
        //creo los headers de la request
        HttpHeaders headers = new HttpHeaders();
        //seteo los detalles de la request
        headers.setContentType(MediaType.APPLICATION_JSON);
        JSONObject requestBody = new JSONObject();
        requestBody.put("dni", cliente.getDni());
        requestBody.put("nombre",cliente.getNombre());
        requestBody.put("apellido", cliente.getApellido());
        HttpEntity<String> request= new HttpEntity<String>(requestBody.toString(), headers);
         restT.postForObject("http://localhost:8081/clients/add", request, Cliente.class);
        return "exitoso";
    }


   /* @PostMapping("/add")
    public String addCustomer(@ModelAttribute Cliente cliente){
        rt.postForObject("http://localhost:8080/customer/add",cliente, Cliente.class);
        return "succesful";
    }*/

   
}