public class Figure {
    public float a;

    void setA(float a){
        if(a <= 0 &&  a > 1000f) {
            System.out.println("длина должна быть в диапозоне от 0 до 1000");
        }
        this.a = a;
    }
    float getA() {
        return  this.a;
    } //геттер
    Figure(float a){ //конструктор с параметром
        this.a = a;
    }
    Figure(){ //явное использование конструктора по умолчанию
        a = 1;
    }

     float getArea(){
        return 0;
     };

    float getPerimetr(){
        return 0;
    }
}
//модификаторы доступа в Java: public, private, protected, private  protected (по умолчанию).
