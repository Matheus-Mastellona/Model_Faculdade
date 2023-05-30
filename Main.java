package POO;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //                                           --- Listas ---
        ArrayList<Professor> lstProf = new ArrayList<>();
        ArrayList<Aluno> lstAluno = new ArrayList<>();
        ArrayList<Administrativo> lstAdmin = new ArrayList<>();
        ArrayList<Curso> lstCurso = new ArrayList<>();
        ArrayList<Disciplina> lstDisciplina = new ArrayList<>();
        ArrayList<GradeHorario> lstGradeHorario = new ArrayList<>();
        ArrayList<HorarioAula> lstHorarioAula = new ArrayList<>();

        //                                          ---- Endereço dos Professores ----
        Endereco endereco1 = new Endereco("Rua tal", "Savassi", 10000, 1);
        Endereco endereco2 = new Endereco("Rua tal do tal", "Savassi do ouro", 20000, 2);


        //                                          ---- Endereço dos Admin ----
        Endereco endereco3 = new Endereco("Rua tal de ti", "Barreiro", 30000, 3);


        //                                          ---- Endereço dos Alunos ----
        Endereco endereco4 = new Endereco("Rua olivia", "Palmeiras", 40000, 4);
        Endereco endereco5 = new Endereco("Rua berserk", "Palmeiras", 40400, 5);
        Endereco endereco6 = new Endereco("Rua iriri", "Funcionarios", 80400, 6);
        Endereco endereco7 = new Endereco("Rua savassi", "Palmares", 90400, 7);

        //                                          ---- Professores ----
        Professor prof1 = new Professor("Jose", 111221333, 00000000001, 3000, "Doutorado", "Matemática", endereco1);
        Professor prof2 = new Professor("Juana", 111221353, 00000000002, 4000, "Pós Doc", "Português", endereco2);
        lstProf.add(prof1);
        lstProf.add(prof2);


        //                                          ---- Admin's ----
        Administrativo admin1 = new Administrativo("Jose", 111553333, 00000000002, 5000, "Analista func", "TI", endereco3);
        lstAdmin.add(admin1);

        //                                          ---- Cursos ----
        Curso curso1 = new Curso("Ciências da Computação", 2300, 1);
        Curso curso2 = new Curso("Direito", 2800, 2);
        lstCurso.add(curso1);
        lstCurso.add(curso2);

        //                                          ---- Disciplinas ----
        Disciplina disciplina1 = new Disciplina("Linguagem de programação", 5, 2023, 1, 48, 1);
        Disciplina disciplina2 = new Disciplina("Calculo 2", 5, 2023, 1, 72, 2);
        Disciplina disciplina3 = new Disciplina("Direito Penal", 4, 2023, 1, 72, 3);
        lstDisciplina.add(disciplina1);
        lstDisciplina.add(disciplina2);
        lstDisciplina.add(disciplina3);

        //                                          ---- Alunos ----
        Aluno aluno1 = new Aluno("Luan", 65, "11110", 1115535151, "Cursando", curso2, endereco4);
        Aluno aluno2 = new Aluno("Gustavo", 80, "13210", 1115536541, "Cursando", curso1, endereco5);
        Aluno aluno3 = new Aluno("Matheus", 75, "12210", 1875536541, "Cursando", curso1, endereco5);
        Aluno aluno4 = new Aluno("Marcos", 80, "15210", 1335536541, "Cursando", curso1, endereco6);
        Aluno aluno5 = new Aluno("Maria", 90, "10210", 1335500541, "Cursando", curso2, endereco7);
        aluno1.lstDisciplinaACursar.add(disciplina3);
        aluno2.lstDisciplinaACursar.add(disciplina2);
        aluno3.lstDisciplinaACursar.add(disciplina2);
        aluno4.lstDisciplinaCursada.add(disciplina1);
        aluno5.lstDisciplinaCursada.add(disciplina3);
        lstAluno.add(aluno1);
        lstAluno.add(aluno2);
        lstAluno.add(aluno3);
        lstAluno.add(aluno4);
        lstAluno.add(aluno5);

        //                                          ---- Horário de Aula ----
        HorarioAula horarioAula1 = new HorarioAula("18:30", "20:10", "Segunda e Quarta", 24, disciplina1, prof1);
        lstHorarioAula.add(horarioAula1);

        //                                          ---- Grade de Horário ----
        GradeHorario gradeHorario1 = new GradeHorario(2, 2023, "Noite", curso1);
        GradeHorario gradeHorario2 = new GradeHorario(4, 2023, "Noite", curso2);
        gradeHorario1.lstHorarioAula.add(horarioAula1);
        lstGradeHorario.add(gradeHorario1);
        lstGradeHorario.add(gradeHorario2);

        //                                         ---- Exibição do trabalho ------
        System.out.println("---------------- Professores ----------------");
        for (Professor prof : lstProf) {
            System.out.println(prof);
        }
        System.out.println("\n---------------- Administrativos ----------------");
        for (Administrativo administrativo : lstAdmin) {
            System.out.println(administrativo);
        }
        System.out.println("\n---------------- Alunos ----------------");
        for (Aluno aluno : lstAluno) {
            System.out.println(aluno);
        }
        System.out.println("\n---------------- Grade Horário ----------------");
        for (GradeHorario gradeHorario : lstGradeHorario) {
            System.out.println(gradeHorario);
        }
    }
}
