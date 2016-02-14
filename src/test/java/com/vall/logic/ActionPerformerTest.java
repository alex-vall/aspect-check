package com.vall.logic;

import com.vall.config.AspectCheckConfig;
import com.vall.logic.ActionPerformer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.TestCase.assertNotNull;


/**
 *
 * Created by Vall on 14.02.2016.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AspectCheckConfig.class)
public class ActionPerformerTest {

    @Autowired
    private ActionPerformer actionPerformer;


    @Test
    public void testActionPerformer() {
        assertNotNull(actionPerformer);

        actionPerformer.performAction(10);

    }

}
