package com.br.projetoSolo.projetoSolo.services;

import com.br.projetoSolo.projetoSolo.DTO.ClienteDTO;
import com.br.projetoSolo.projetoSolo.Domain.models.Cliente;
import com.br.projetoSolo.projetoSolo.repository.ClienteRepository;
import com.br.projetoSolo.projetoSolo.request.DadosCliente;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@AllArgsConstructor
public class ClienteService {

    private ClienteRepository repository;

    @Transactional
    public ClienteDTO cadastrarCLiente(DadosCliente dados) {
        var clienteCadastrado = repository.save(new Cliente(dados));
        return new ClienteDTO(clienteCadastrado);
    }
}
