import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
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

        /*System.out.println(curso);
        System.out.println(curso2);
        System.out.println(mentoria);
     */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Potência Tech powered by iFood - Java Beginners");
        bootcamp.setDescricao("O iFood chegou na DIO com uma super trilha " +
                "para pessoas que querem ingressar no mercado tech! O Potência " +
                "Tech Powered by iFood - Java Beginners já está com inscrições" +
                " abertas para pessoas de todo o Brasil, mas voltado e focado em " +
                "grupos sub-representados e pessoas de baixa renda. Uma trilha com " +
                "conteúdos completos, desafios de projetos, mentorias ao vivo e networking" +
                " com a comunidade.  Ao final do programa, ainda vai acontecer o Minha " +
                "Carreira Tech, uma oportunidade de conhecer as empresas parceiras e ficar " +
                "disponível na plataforma de talentos da DIO e ainda poder ganhar " +
                "prêmios pelo seu desempenho. ");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootcamp(bootcamp);
        System.out.println("conteudos inscritos" + devGabriel.getConteudosInscritos());
        devGabriel.progredir();
        System.out.println("conteudos concluidos" + devGabriel.getConteudosConcluidos());
        System.out.println("conteudos inscritos" + devGabriel.getConteudosInscritos());
        System.out.println("XP" + devGabriel.calcularTotalXp());

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("conteudos inscritos" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("conteudos Concluidos" + devJoao.getConteudosConcluidos());
        System.out.println("conteudos inscritos" + devGabriel.getConteudosInscritos());

        System.out.println("XP" + devJoao.calcularTotalXp());
    }
}
