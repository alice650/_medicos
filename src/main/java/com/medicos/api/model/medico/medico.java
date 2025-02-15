package com.medicos.api.model.medico;

import com.medicos.api.model.Especialidade;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class medico {
    private String nome;
    private String email;
    private String crm;
    private Especialidade especialidade;
    private String endereco;



}
