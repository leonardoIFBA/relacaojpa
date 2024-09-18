package com.example.onetomany;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.onetomany.model.Proprietario;
import com.example.onetomany.model.Veiculo;
import com.example.onetomany.repository.ProprietarioRepository;
import com.example.onetomany.repository.VeiculoRepository;

@SpringBootApplication
public class OnetomanyApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnetomanyApplication.class, args);
	}

	@Bean
	// public CommandLineRunner demo(Departamentos dep) {
	public CommandLineRunner demo(ProprietarioRepository proRep,
			VeiculoRepository veiRep) {
		return (args) -> {

			//testando many-to-one
			
			Proprietario proprietario = new Proprietario();
			proprietario.setNome("João das Couves");
			proprietario.setTelefone("(34) 1234-5678");
			proRep.save(proprietario);

			Veiculo veiculo1 = new Veiculo();
			veiculo1.setFabricante("VW");
			veiculo1.setModelo("Fox");
			veiculo1.setProprietario(proprietario);

			veiRep.save(veiculo1);

			Veiculo veiculo2 = new Veiculo();
			veiculo2.setFabricante("VW");
			veiculo2.setModelo("Gol");
			veiculo2.setProprietario(proprietario);

			veiRep.save(veiculo2);

			//System.out.println(veiRep.findAll()); 
			Proprietario p1 = proRep.findById(2L).get();
			System.out.println("Proprietário: " + p1.getNome() + " veículo: " + p1.getVeiculos());				
			

		};
	}

}
