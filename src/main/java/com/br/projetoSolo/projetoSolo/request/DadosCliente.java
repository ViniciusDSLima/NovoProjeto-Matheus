package com.br.projetoSolo.projetoSolo.request;

import com.br.projetoSolo.projetoSolo.Domain.endereco.DadosEndereco;
import com.br.projetoSolo.projetoSolo.Domain.models.Cliente;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public record DadosCliente(
        @NotBlank
        String nome,
        @NotBlank @Email
        String email,
        @NotBlank
        String telefone,
        @NotBlank
        String conta,
        @NotNull
        DadosEndereco endereco
) {
}
