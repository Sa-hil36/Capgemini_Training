package com.cg.looseCoupling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
    private String name;
    //@Autowired
    private IEngine engine;
    //@Autowired
    private ITyre tyre;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IEngine getEngine() {
        return engine;
    }

    public void setEngine(IEngine engine) {
        this.engine = engine;
    }

    public ITyre getTyre() {
        return tyre;
    }

    public void setItyre(ITyre tyre) {
        this.tyre = tyre;
    }
    @Autowired
    public Car(@Qualifier("cng") IEngine engine, @Qualifier("mrf") ITyre tyre) {
        super();
        this.engine = engine;
        this.tyre = tyre;
    }

    public Car() {
    }

    public void printCar(){
        System.out.println("Car Name: "+ name);
        System.out.println("BHP: "+ engine.getBHP());
        System.out.println("Tyre Details: "+ tyre.getTyreDetails() );
    }
}
