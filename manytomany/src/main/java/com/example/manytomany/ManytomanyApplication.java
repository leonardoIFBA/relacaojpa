package com.example.manytomany;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.manytomany.model.Acessorio;
import com.example.manytomany.model.Veiculo;
import com.example.manytomany.repository.AcessorioRepository;
import com.example.manytomany.repository.VeiculoRepository;

@SpringBootApplication
public class ManytomanyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManytomanyApplication.class, args);
	}

	@Bean
	// public CommandLineRunner demo(Departamentos dep) {
	public CommandLineRunner demo(AcessorioRepository assRep,
			VeiculoRepository veiRep) {
		return (args) -> {

			// testando many-to-many
			// instancia acessórios

			Acessorio roda = new Acessorio();
			roda.setDescricao("Rodas de liga leve");
			Acessorio sensor = new Acessorio();
			sensor.setDescricao("Sensores de estacionamento");
			Acessorio mp3 = new Acessorio();
			mp3.setDescricao("MP3 Player");
			Acessorio pintura = new Acessorio();
			pintura.setDescricao("Pintura metalizada");
			// persiste acessórios
			assRep.save(roda);
			assRep.save(sensor);
			assRep.save(mp3);
			assRep.save(pintura);

			Veiculo veiculo1 = new Veiculo();
			veiculo1.setFabricante("VW");
			veiculo1.setModelo("Gol");
			veiculo1.getAcessorios().add(roda);
			veiculo1.getAcessorios().add(mp3);

			Veiculo veiculo2 = new Veiculo();
			veiculo2.setFabricante("Hyundai");
			veiculo2.setModelo("i30");
			veiculo2.getAcessorios().add(roda);
			veiculo2.getAcessorios().add(sensor);
			veiculo2.getAcessorios().add(mp3);
			veiculo2.getAcessorios().add(pintura);

			veiRep.save(veiculo1);
			veiRep.save(veiculo2);

			Veiculo vei = veiRep.findById(1L).get();
			//System.out.println("Veiculo: " + vei.getModelo());// + " acessorios: " +
			// vei.getAcessorios());
			for (Acessorio acessorio : vei.getAcessorios()) {
				System.out.println("Veiculo: " + vei.getModelo() + " Acessório: " + acessorio.getDescricao());
			}

		};
	}

}
