package com.br.projetoSolo.projetoSolo.Domain.models;

import com.br.projetoSolo.projetoSolo.DTO.ClienteDTO;
import com.br.projetoSolo.projetoSolo.request.DadosCliente;
import com.br.projetoSolo.projetoSolo.Domain.endereco.Endereco;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "cliente")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String conta;

    @Embedded
    private Endereco endereco;

    public Cliente(DadosCliente dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.telefone = dados.telefone();
        this.conta = dados.conta();
        this.endereco = new Endereco(dados.endereco());
    }
}
