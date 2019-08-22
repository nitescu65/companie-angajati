public class Marketing extends Departament implements Evaluator {

    private static final String nume = "Marketing";

    public Marketing() {
    }

    public Marketing(String nume, int nivelMinimDeCompetente) {
        super("Marketing", 4);
    }

    public StatusCandidat evalueaza(Candidat candidat) {

        if (candidat.getNivelDeComp() > super.getNivelMinimDeCompetente()) {
            return StatusCandidat.ACCEPTAT;
        } else if (candidat.getNivelDeComp() < super.getNivelMinimDeCompetente()){

            return StatusCandidat.RESPINS;

        }else{
            return StatusCandidat.IN_ASTEPTARE;
        }

    }
}
