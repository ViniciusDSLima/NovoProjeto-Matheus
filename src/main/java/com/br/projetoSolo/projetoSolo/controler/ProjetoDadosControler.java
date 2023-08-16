package com.br.projetoSolo.projetoSolo.controler;


import com.br.projetoSolo.projetoSolo.DTO.ClienteDTO;
import com.br.projetoSolo.projetoSolo.request.DadosCliente;
import com.br.projetoSolo.projetoSolo.services.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/home")
@AllArgsConstructor
public class ProjetoDadosControler {

    private ClienteService service;

    @PostMapping("/cadastrar")
    @ResponseStatus(HttpStatus.CREATED)
    public ClienteDTO cadastrarCliente(@RequestBody @Valid DadosCliente dados){
        return service.cadastrarCLiente(dados);
    }
}


