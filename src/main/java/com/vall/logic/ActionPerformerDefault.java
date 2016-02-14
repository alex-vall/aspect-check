package com.vall.logic;

import org.springframework.stereotype.Component;

/**
 *
 * Created by Vall on 14.02.2016.
 */
@Component
public class ActionPerformerDefault implements ActionPerformer {

    public ActionPerformerDefault() {
        System.out.println("ActionPerformerDefault constructor");
    }


    @Override
    public void performAction(int param) {
        System.out.println("Perform some action: " + param);
    }
}
