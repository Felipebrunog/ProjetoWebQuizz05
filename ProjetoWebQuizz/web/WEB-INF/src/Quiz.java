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
            ("Alternativa certa sobre o Brainstorming",
             "A) Tecnica de discussão em grupo onde se dá a contribuição espontânea de ideias por parte de todos os participantes afim de se resolver algum problema.",
                    new String[]{
                                 "A) Tecnica de discussão em grupo onde se dá a contribuição espontânea de ideias por parte de todos os participantes afim de se resolver algum ",
                                 "B) Técnica de decisão em grupo que têm por objetivo conseguir que grupos de peritos discutam um determinado assunto e avaliem múltiplas alternativas de forma a chegar à melhor solução de conjunto.",
                                 "C) Capacidade cognitiva e de autogerenciamento, que complementam as habilidades técnicas dos trabalhadores.",
                                 "D) Conjunto de normas e funções elaboradas para disciplinar elementos de produção."});
            teste.add(q1);
            
            Questao q2 = new Questao
            ("Alternativa certa sobre o Delphi",
             "B) Técnica de decisão em grupo que têm por objetivo conseguir que grupos de peritos discutam um determinado assunto e avaliem múltiplas alternativas de forma a chegar à melhor solução de conjunto.",
                    new String[]{
                                 "A) Tecnica de discussão em grupo onde se dá a contribuição espontânea de ideias por parte de todos os participantes afim de se resolver algum ",
                                 "B) Técnica de decisão em grupo que têm por objetivo conseguir que grupos de peritos discutam um determinado assunto e avaliem múltiplas alternativas de forma a chegar à melhor solução de conjunto.",
                                 "C) Capacidade cognitiva e de autogerenciamento, que complementam as habilidades técnicas dos trabalhadores.",
                                 "D) Conjunto de normas e funções elaboradas para disciplinar elementos de produção."});
            teste.add(q2);
            
            Questao q3 = new Questao
            ("Alternativa certa sobre Habilidadesnão Técnicas",
             "C) Capacidade cognitiva e de autogerenciamento, que complementam as habilidades técnicas dos trabalhadores.",
                    new String[]{
                                 "A) Tecnica de discussão em grupo onde se dá a contribuição espontânea de ideias por parte de todos os participantes afim de se resolver algum ",
                                 "B) Técnica de decisão em grupo que têm por objetivo conseguir que grupos de peritos discutam um determinado assunto e avaliem múltiplas alternativas de forma a chegar à melhor solução de conjunto.",
                                 "C) Capacidade cognitiva e de autogerenciamento, que complementam as habilidades técnicas dos trabalhadores.",
                                 "D) Conjunto de normas e funções elaboradas para disciplinar elementos de produção."});
            teste.add(q3);
            
            Questao q4 = new Questao
            ("Alternativa certa sobre Adminstração?",
             "D) Conjunto de normas e funções elaboradas para disciplinar elementos de produção.",
                    new String[]{
                                 "A) Tecnica de discussão em grupo onde se dá a contribuição espontânea de ideias por parte de todos os participantes afim de se resolver algum problema.",
                                 "B) Técnica de decisão em grupo que têm por objetivo conseguir que grupos de peritos discutam um determinado assunto e avaliem múltiplas alternativas de forma a chegar à melhor solução de conjunto.",
                                 "C) Habilidades sociais, cognitivas e de autogerenciamento, que complementam as habilidades técnicas dos trabalhadores.",
                                 "D) Conjunto de normas e funções elaboradas para disciplinar elementos de produção."});
            teste.add(q4);
            
             Questao q5 = new Questao
            ("São características de um líder exceto",
             "D) A favor da intervenção militar no Brasil.",
                    new String[]{
                                 "A) Carisma",
                                 "B) Persuasivo",
                                 "C) Integridade",
                                 "D) A favor da intervenção militar no Brasil"});
            teste.add(q5);
            
             Questao q6 = new Questao
            ("É correto afirmar sobre a Motivação",
             "A) Conjunto de fatores psicológicos de ordem fisiológica, intelectual ou afetiva, os quais agem entre si e determinam a conduta de um indivíduo.",
                    new String[]{
                                 "A) Conjunto de fatores psicológicos de ordem fisiológica, intelectual ou afetiva, os quais agem entre si e determinam a conduta de um indivíduo.",
                                 "B) Capacidade de o profissional pensar diferente",
                                 "C) Encontro combinado entre duas ou mais pessoas a fim de divulgar ou elucitar atos, ideias, planos etc de um participante.",
                                 "D) Deve ser visto como ponto de partida para a definição dos objetivos e estratégias organizacionais."});
            teste.add(q6);

             Questao q7 = new Questao
            ("É correto afirmar sobre a Criatividade",
             "B) Capacidade de o profissional pensar diferente.",
                    new String[]{
                                 "A) Conjunto de fatores psicológicos de ordem fisiológica, intelectual ou afetiva, os quais agem entre si e determinam a conduta de um indivíduo.",
                                 "B) Capacidade de o profissional pensar diferente",
                                 "C) Encontro combinado entre duas ou mais pessoas a fim de divulgar ou elucitar atos, ideias, planos etc de um participante.",
                                 "D) Deve ser visto como ponto de partida para a definição dos objetivos e estratégias organizacionais."});
            teste.add(q7);

             Questao q8 = new Questao
            ("É correto afirmar sobre a Entrevista",
             "C) Encontro combinado entre duas ou mais pessoas a fim de divulgar ou elucitar atos, ideias, planos etc de um participante.",
                    new String[]{
                                 "A) Conjunto de fatores psicológicos de ordem fisiológica, intelectual ou afetiva, os quais agem entre si e determinam a conduta de um indivíduo.",
                                 "B) Capacidade de o profissional pensar diferente",
                                 "C) Encontro combinado entre duas ou mais pessoas a fim de divulgar ou elucitar atos, ideias, planos etc de um participante.",
                                 "D) Deve ser visto como ponto de partida para a definição dos objetivos e estratégias organizacionais."});
            teste.add(q8);            
            
             Questao q9 = new Questao
            ("É correto afirmar sobre o Planejamento",
             "D) Deve ser visto como ponto de partida para a definição dos objetivos e estratégias organizacionais.",
                    new String[]{
                                 "A) Conjunto de fatores psicológicos de ordem fisiológica, intelectual ou afetiva, os quais agem entre si e determinam a conduta de um indivíduo.",
                                 "B) Capacidade de o profissional pensar diferente",
                                 "C) Encontro combinado entre duas ou mais pessoas a fim de divulgar ou elucitar atos, ideias, planos etc de um participante.",
                                 "D) Deve ser visto como ponto de partida para a definição dos objetivos e estratégias organizacionais."});
            teste.add(q9);                

             Questao q10 = new Questao
            ("É correto afirmar sobre o Scop Creeo",
             "A) É uma previsão que combinado ao Gold Plate asseguram que o escopo não fuja do controle.",
                    new String[]{
                                 "A) É uma previsão que combinado ao Gold Plate asseguram que o escopo não fuja do controle.",
                                 "B) É o nome de um filme de terror",
                                 "C) Não traz benefícios ao projeto",
                                 "D) É irrelevante para a área de TI"});
            teste.add(q10); 
            
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
