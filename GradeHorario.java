package POO;

import java.util.ArrayList;

class GradeHorario {
    private Curso curso;
    protected ArrayList<HorarioAula> lstHorarioAula = new ArrayList<HorarioAula>();
    private int semestre, ano;
    private String turno;

    public String getTurno() {
        return this.turno;
    }

    public int getAno() {
        return this.ano;
    }

    public int getSemestre() {
        return this.semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void AdicionarHorarioAula(HorarioAula horarioAula) {
        this.lstHorarioAula.add(horarioAula);
    }

    public ArrayList<HorarioAula> getLstHorarioAula() {
        return lstHorarioAula;
    }

    public void setLstHorarioAula(ArrayList<HorarioAula> lstHorarioAula) {
        this.lstHorarioAula = lstHorarioAula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public GradeHorario() {
        super();
    }

    public GradeHorario(int semestre, int ano, String turno, Curso curso) {
        super();
        this.semestre = semestre;
        this.ano = ano;
        this.turno = turno;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "\n| GradeHorario | " +
                "Semestre: " + getSemestre() +
                ", Ano: " + getAno() +
                ", Turno: " + getTurno() +
                "\n" + getCurso() +
                "\n| Horario Aula |" + getLstHorarioAula() ;
    }
}