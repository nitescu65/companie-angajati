import java.util.ArrayList;
import java.util.List;

public class Companie {
    private String NumeComp;
    private List<Candidat> angajati;
    private List<Departament> departamente;
    //constructor

    public Companie() {
    }

    public Companie(String numeComp) {
        NumeComp = numeComp;

    }

    //getere,setere


    public List<Departament> getDepartamente() {
        return departamente;
    }

    public void setDepartamente(List<Departament> departamente) {
        this.departamente = departamente;
    }

    public String getNumeComp() {
        return NumeComp;
    }

    public void setNumeComp(String numeComp) {
        NumeComp = numeComp;
    }

    public List<Candidat> getAngajati() {
        return angajati;
    }

    public void setAngajati(List<Candidat> angajati) {
        this.angajati = angajati;
    }

    public void recruteaza(Candidat candidat) {
        if (candidat.getNumeDepartament().equalsIgnoreCase("Marketing")) {
            Marketing m = new Marketing();
            StatusCandidat statusCandidat = m.evalueaza(candidat);
            candidat.setStatusCandidat(statusCandidat);
        } else if (candidat.getNumeDepartament().equalsIgnoreCase("Productie")) {
            Productie p = new Productie();
            p.evalueaza(candidat);

        } else {
            throw new IcapacitateEvaluare("Candidatul nu poate fi evaluat.");
        }
    }
}
