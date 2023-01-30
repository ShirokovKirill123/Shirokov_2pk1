public class Program {
    public static void main(String[] args){
       Figure f1 = new Figure();
       Figure f2 = new Figure(5.8f);
       Triangle tr1 = new Triangle(8f,6f,3f);
       System.out.println(tr1.getArea());
    }
}
