import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(8);



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAna = new Dev();
        devAna.setNome("Ana");
        devAna.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devAna.getConteudosInscritos());

        devAna.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos" + devAna.getConteudosInscritos());
        System.out.println("Conteudos Concluídos" + devAna.getConteudosConcluidos());
        System.out.println("XP:" + devAna.calcularTotalXp());

        System.out.println("----------------");

        Dev devLuiz = new Dev();
        devLuiz.setNome("Luiz");
        devLuiz.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devAna.getConteudosInscritos());

        devLuiz.progredir();
        System.out.println("Conteudos Inscritos" + devAna.getConteudosInscritos());
        System.out.println("Conteudos Concluídos" + devLuiz.getConteudosConcluidos());
        System.out.println("XP:" + devLuiz.calcularTotalXp());

        System.out.println("----------------");
    }
}
