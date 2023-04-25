package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso de Java");
		curso1.setDescricao("Descrição curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso de JS");
		curso2.setDescricao("Descrição curso JS");
		curso2.setCargaHoraria(4);

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Descrição mentoria Java");
		mentoria.setData(LocalDate.now());
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devMoi = new Dev();
		devMoi.setNome("Moisés");
		devMoi.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos de Moisés " + devMoi.getConteudosInscritos());
		devMoi.progredir();
		devMoi.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos de Moisés " + devMoi.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos de Moisés" + devMoi.getConteudosConcluidos());
		System.out.println("XP: " + devMoi.calcularTotalXp());
		
		System.out.println("------------");
		
		Dev devCarlos = new Dev();
		devCarlos.setNome("Carlos");
		devCarlos.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos de Carlos " + devCarlos.getConteudosInscritos());
		devCarlos.progredir();
		devCarlos.progredir();
		devCarlos.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos de Carlos " + devCarlos.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos de Carlos " + devMoi.getConteudosConcluidos());
		System.out.println("XP: " + devCarlos.calcularTotalXp());
	}

}
