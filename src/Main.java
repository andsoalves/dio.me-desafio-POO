import br.com.dio.desafio.dominio.Curso;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setDescricao("Java");
        curso1.setTitulo("java");
        curso1.setCargaHoraria(80);

        System.out.println(curso1);
    }
}