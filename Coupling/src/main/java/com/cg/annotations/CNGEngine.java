package com.cg.annotations;

import org.springframework.stereotype.Component;

@Component("cng")
public class CNGEngine implements IEngine {
    @Override
    public String getBHP(){
        return "110 BHP";
    }
}
