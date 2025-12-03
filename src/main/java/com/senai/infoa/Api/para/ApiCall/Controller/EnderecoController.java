package com.senai.infoa.Api.para.ApiCall.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.senai.infoa.Api.para.ApiCall.Models.Endereco;
import com.senai.infoa.Api.para.ApiCall.Services.EnderecoService;

@RestController
@RequestMapping("/Endereco")
public class EnderecoController {
    @Autowired
    private EnderecoService enderecoService;

    @PostMapping("/salvar")
    public Endereco salvar(@RequestParam String cep, @RequestParam(required=false) String numero, @RequestParam(required=false) String complemento) {
        return enderecoService.salvar(cep, numero, complemento);
    }
}
