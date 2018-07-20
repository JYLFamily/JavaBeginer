package com.company.strategy;

//import com.company.strategy.Add;
//import com.company.strategy.Minus;

public class Enviroment {

    private int a;
    private int b;
    private StrategyTest st;

    public Enviroment(int a, int b, StrategyTest st) {
        this.a = a;
        this.b = b;
        this.st = st;
    }

    public int output() {
        return this.st.calculate(this.a, this.b);
    }

    public static void main(String[] args) {
        Enviroment e1 = new Enviroment(10, 10, new Add());
        System.out.println(e1.output());

        Enviroment e2 = new Enviroment(10, 10, new Minus());
        System.out.println(e2.output());
    }
}
