import com.dlmv.desafio.dominio.Bootcamp;
import com.dlmv.desafio.dominio.Curso;
import com.dlmv.desafio.dominio.Dev;
import com.dlmv.desafio.dominio.Mentoria;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        //Cursos
        Curso cursoJava = new Curso("Curso Java",
                "Descrição do curso Java", 12);
        Curso cursoJs = new Curso("Curso JavaScript",
                "Descrição do curso JavaScript", 10);

        //Mentorias
        Mentoria mentoriaJava = new Mentoria("Mentoria Java",
                "Descrição da mentoria Java", LocalDate.now());
        Mentoria mentoriaJs = new Mentoria("Mentoria JavaScript",
                "Descrição da mentoria JavaScript", LocalDate.now());

        //Bootcamps
        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer",
                "Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoJs);
        bootcamp.getConteudos().add(mentoriaJava);

        //Devs
        Dev devLucas = new Dev("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos de Lucas: " + devLucas.getConteudosInscritos());
        devLucas.progredir();
        devLucas.progredir();
        System.out.println("Após progredir:");
        System.out.println("Conteudos Inscritos de Lucas: " + devLucas.getConteudosInscritos());
        System.out.println("Conteudos Concluidos de Lucas: " + devLucas.getConteudosConcluidos());
        System.out.println("XP: " + devLucas.calcularTotalXp());
        System.out.println("-----");

        Dev devAline = new Dev("Aline");
        devAline.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos de Aline: " + devAline.getConteudosInscritos());
        devAline.progredir();
        devAline.progredir();
        devAline.progredir();
        System.out.println("Após progredir:");
        System.out.println("Conteudos Inscritos de Aline: " + devAline.getConteudosInscritos());
        System.out.println("Conteudos concluidos de Aline: " + devAline.getConteudosConcluidos());
        System.out.println("XP: " + devAline.calcularTotalXp());
        System.out.println("-----");


    }

}
