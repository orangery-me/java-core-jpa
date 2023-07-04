package model;

public class CalculatorModel {
    private Double a;
    private Double b;
    private Double answer;

    public Double getA() {
        return a;
    }
    public void setA(Double a) {
        this.a = a;
    }
    public Double getB() {
        return b;
    }
    public void setB(Double b) {
        this.b = b;
    }
    public Double getAnswer() {
        return answer;
    }
    public void setAnswer(Double answer) {
        this.answer = answer;
    }

    public void phepCong(){
        this.answer= this.a+this.b;
    }
    public void phepTru(){
        this.answer= this.a-this.b;
    }
    public void phepNhan(){
        this.answer= this.a*this.b;
    }
    public void phepChia(){
        this.answer= this.a/this.b;
    }
    public void phepMu(){
        this.answer= Math.pow(this.a, this.b);
    }
    public void phepDu(){
        this.answer= (this.a)%(this.b);
    }
    

}
