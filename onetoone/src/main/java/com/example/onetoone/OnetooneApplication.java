package com.example.onetoone;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.onetoone.model.Proprietario;
import com.example.onetoone.model.Veiculo;
import com.example.onetoone.repository.ProprietarioRepository;
import com.example.onetoone.repository.VeiculoRepository;

@SpringBootApplication
public class OnetooneApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnetooneApplication.class, args);
	}

	@Bean
	// public CommandLineRunner demo(Departamentos dep) {
	public CommandLineRunner demo(ProprietarioRepository proRep,
			VeiculoRepository veiRep) {
		return (args) -> {

			//testando one-to-one
			Proprietario proprietario = new Proprietario();
			proprietario.setNome("João das Couves");
			proprietario.setTelefone("(34) 1234-5678");
			//proRep.save(proprietario);

			Veiculo veiculo = new Veiculo();
			veiculo.setFabricante("VW");
			veiculo.setModelo("Fox");
			veiculo.setProprietario(proprietario);

			veiRep.save(veiculo);

			List<Veiculo> vs = veiRep.findAll();
			System.out.println(vs); 
			Proprietario p1 = proRep.findById(2L).get();
			System.out.println("Proprietário: " + p1.getNome() + " veículo: " + p1.getVeiculo().getModelo());				


		};
	}


}
