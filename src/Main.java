import br.dio.desafio.dominio.Bootcamp;
import br.dio.desafio.dominio.Curso;
import br.dio.desafio.dominio.Dev;
import br.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("descrição Mentoria java");
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

        Dev devJeferson = new Dev();
        devJeferson.setNome("Jeferson");
        devJeferson.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Jeferson:" + devJeferson.getConteudosInscritos());
        devJeferson.progredir();
        devJeferson.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Jeferson:" + devJeferson.getConteudosInscritos());
        System.out.println("Conteudos concluidos Jeferson:" + devJeferson.getConteudosConclidos());
        System.out.println("XP:" + devJeferson.cacularTotalXp());

        System.out.println("--------");

        Dev devJaqueline = new Dev();
        devJaqueline.setNome("Jaqueline");
        devJaqueline.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Jeferson:" + devJaqueline.getConteudosInscritos());
        devJaqueline.progredir();
        System.out.println("-");
        System.out.println("-");
        System.out.println("-");
        System.out.println("Conteudos Inscritos Jeferson:" + devJaqueline.getConteudosInscritos());
        System.out.println("Conteudos concluidos Jaqueline:" + devJaqueline.getConteudosConclidos());
        System.out.println("XP:" + devJaqueline.cacularTotalXp());
    }
}