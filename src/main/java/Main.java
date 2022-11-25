import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("curso java");
        curso.setDescricao("descrição do curso java");
        curso.setCargaHoraria(50);


        Curso curso2 = new Curso();

        curso2.setTitulo("curso react");
        curso2.setDescricao("descrição do curso react");
        curso2.setCargaHoraria(30);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de react");
        mentoria.setDescricao("materia da mentoria de react");
        mentoria.setData(LocalDate.now());

        System.out.println(curso);
        System.out.println(curso2);
        System.out.println(mentoria);


    }
}
