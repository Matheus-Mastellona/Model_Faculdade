package POO;

import java.util.ArrayList;

class HorarioAula {
    private Disciplina disciplina;
    private Professor professor;
    protected ArrayList<Aluno> lstAluno = new ArrayList<Aluno>();
    private String diaSemana,horaInicio, horaFim;
    private int sala;

    public String getHoraInicio() {
        return this.horaInicio;
    }

    public String getHoraFim() {
        return this.horaFim;
    }


    public String getDiaSemana() {
        return this.diaSemana;
    }

    public int getSala() {
        return this.sala;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setHoraFim(String horaFim) {
        this.horaFim = horaFim;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public void AdicionarAluno(Aluno aluno) {
        this.lstAluno.add(aluno);
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getLstAluno() {
        return lstAluno;
    }

    public void setLstAluno(ArrayList<Aluno> lstAluno) {
        this.lstAluno = lstAluno;
    }

    public HorarioAula() {
        super();
    }

    public HorarioAula(String horaInicio, String horaFim, String diaSemana, int sala, Disciplina disciplina, Professor professor) {
        super();
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.diaSemana = diaSemana;
        this.sala = sala;
        this.disciplina = disciplina;
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "" +
                 getDisciplina() +
                 getProfessor() +
                "\n| Alunos |" + getLstAluno() +
                "\n| Hora que Inicia a aula: " + getHoraInicio() +
                ", Hora que termina a aula: " + getHoraFim() +
                ", Dia da Semana: " + getDiaSemana() +
                ", Sala: " + getSala();
    }
}
