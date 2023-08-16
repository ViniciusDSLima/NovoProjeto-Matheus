package com.br.projetoSolo.projetoSolo.DTO;

import com.br.projetoSolo.projetoSolo.Domain.endereco.Endereco;
import com.br.projetoSolo.projetoSolo.Domain.models.Cliente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDTO {
    private String nome;
    private String email;
    private String telefone;
    private String conta;
    private Endereco endereco;

    public ClienteDTO(Cliente clienteCadastrado) {
        this.nome = clienteCadastrado.getNome();
        this.email = clienteCadastrado.getEmail();
        this.telefone = clienteCadastrado.getTelefone();
        this.conta = clienteCadastrado.getConta();
    }
}
