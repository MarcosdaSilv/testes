package Aluno;
 /* @author Marcos
 */
public class testeAluno {
  
    public static void main(String[] args) throws MyException {
         Aluno2 aluno1 = new Aluno2();
try{aluno1.setNota1(-3.5f);
aluno1.setNota2(7.4f);
aluno1.calculaMedia();}
catch(MyException e){
    aluno1.setNota1(-3.5f);
aluno1.setNota2(7.4f);
aluno1.calculaMedia();
}
System.out.println("Media do aluno = " + aluno1.getMedia());
       } 
}
class Aluno2  {
    private float nota1;
private float nota2;
private float media;
public void setNota1(float nota1)throws MyException {
this.nota1 = nota1;
if(nota1 < 0 || nota1 >10){
throw new MyException();}
}
public void setNota2(float nota2) throws MyException {
this.nota2 = nota2;
if(nota2 < 0 || nota2 >10){
throw new MyException("nota inválida");}
}
public void calculaMedia() {
media = ((nota1 * 2) + (nota2 * 3)) / 5;
}
public float getMedia() {
return media;
}}


class MyException extends Exception{
public MyException(){
super("valor proibido");}
public MyException(String msg){
super(msg);}
}