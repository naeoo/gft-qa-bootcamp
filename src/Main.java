import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java Script");
        curso2.setDescricao("Descrição Curso Java Script");
        curso2.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição Mentoria Java");
        mentoria1.setData(LocalDate.now());

//        System.out.println(curso1);
  //      System.out.println(curso2);
    //    System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devNael = new Dev();
        devNael.setNome("Natanael");
        devNael.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos do(a) Dev " + devNael.getNome());
        System.out.println("\nConteúdos Inscritos" + devNael.getConteudosInscritos());
        devNael.progredir();
        System.out.println("=====");
        System.out.println("\nConteúdos Inscritos" + devNael.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devNael.getConteudosConcluidos());
        System.out.println("XP: "+ devNael.calcularTotalXp());

        Dev devJuly = new Dev();
        devJuly.setNome("Julyane");
        devJuly.inscreverBootcamp(bootcamp);
        System.out.println("\nConteúdos do(a) Dev " + devJuly.getNome());
        System.out.println("\nConteúdos Inscritos" + devJuly.getConteudosInscritos());
        devJuly.progredir();
        devJuly.progredir();
        devJuly.progredir();
        System.out.println("=====");
        System.out.println("\nConteúdos Inscritos" + devJuly.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devJuly.getConteudosConcluidos());
        System.out.println("XP: "+ devJuly.calcularTotalXp());
    }
}
