package com.petland.petland_api.start;

import com.petland.petland_api.model.Cadastro;
import com.petland.petland_api.repository.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements ApplicationRunner {

    @Autowired
    private CadastroRepository cadastroRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Cadastro firstCadastro = new Cadastro();
        firstCadastro.setNome("João Pedro");
        cadastroRepository.save(firstCadastro);
    }
}
