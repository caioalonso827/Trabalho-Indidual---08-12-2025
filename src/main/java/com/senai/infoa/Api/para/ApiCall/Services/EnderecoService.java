package com.senai.infoa.Api.para.ApiCall.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.senai.infoa.Api.para.ApiCall.Models.Endereco;
import com.senai.infoa.Api.para.ApiCall.Repositories.EnderecoRepository;

@Service
public class EnderecoService {
    @Autowired
    private EnderecoRepository enderecoRepository;

       public Endereco salvar(String cep, String rua, String numero, String complemento, String bairro, String cidade , String estado) {
        Endereco endereco = buscarViaCep(cep);
        endereco.setRua(rua);
        endereco.setBairro(bairro);
        endereco.setCidade(cidade);
        endereco.setEstado(estado);
        endereco.setNumero(numero);
        endereco.setComplemento(complemento);
        return enderecoRepository.save(endereco);
    }

    public Endereco buscarViaCep(String cep) {
        RestTemplate template = new RestTemplate();
        Endereco endereco = template.getForObject("https://viacep.com.br/ws/{cep}/json", Endereco.class, cep);
        return endereco;
    }
}
