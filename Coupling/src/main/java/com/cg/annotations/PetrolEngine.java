package com.cg.annotations;

import org.springframework.stereotype.Component;

@Component
public class PetrolEngine implements IEngine {
    public String getBHP(){
        return "150 BHP";
    }
}
