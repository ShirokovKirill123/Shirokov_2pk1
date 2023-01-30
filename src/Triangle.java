import static java.lang.Math.*;
public class Triangle extends Figure{
    private float b;
    private float c;

    void setB(float b){
        if(b <= 0 &&  b > 1000f) {
            System.out.println("длина должна быть в диапозоне от 0 до 1000");
        }
        this.b = b;
    }
    float getB() {
        return  this.b;
    } //геттер
    void setC(float c){
        if(c <= 0 &&  c > 1000f) {
            System.out.println("длина должна быть в диапозоне от 0 до 1000");
        }
        this.c = c;
    }
    float getC() {
        return  this.c;
}
    Triangle(float a,float bb, float cc) {
        super(a);
        b = bb;
        c = cc;
    }

}
