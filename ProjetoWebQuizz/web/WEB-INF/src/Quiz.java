package WEB

-INF.src;
import java.util.ArrayList;
public class Quiz {
    private static int testeCount = 0;
    private static double testeGradeSum = 0.0;
    private static double lastGrade = 0.0;
    private static ArrayList<Questao> teste;

    public static ArrayList<Questao> getTest(){
        if(teste == null){
            teste = new ArrayList<>();
            Questao q1 = new Questao
            ("1+1?", "2", new String[]{"0","2","1"});
            teste.add(q1);
            Questao q2 = new Questao
            ("1+2?", "3", new String[]{"3","2","1"});
            teste.add(q2);
            Questao q3 = new Questao
            ("3+4?", "7", new String[]{"7","1","12"});
            teste.add(q3);
            Questao q4 = new Questao
            ("2+3?", "5", new String[]{"3","2","5"});
            teste.add(q4);
        }
        return teste;
    }

    public static double validaTeste(String userResposta[]){
        int contador = 0;
        for(int i=0; i<teste.size(); i++){
            if(teste.get(i).getResposta().equals(userResposta[i])){
                contador++;
            }
        }
        double grade = (double)contador / (double)teste.size();
        Quiz.lastGrade = grade;
        Quiz.testeGradeSum += grade;
        Quiz.testeCount++;
        return grade;
    }

    public static double getLastGrade(){
        return Quiz.lastGrade;
    }
    public static double getGradeAverage(){
        return Quiz.testeGradeSum / (double)Quiz.testeCount;
    }
}
