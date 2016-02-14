package com.vall.aspect;

import com.vall.config.TestAspectCheckConfig1;
import com.vall.logic.ActionPerformer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 *
 * Created by Vall on 14.02.2016.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestAspectCheckConfig1.class)
@ActiveProfiles("test-config-1")
public class ActionPerformerAspectTest {

    @Autowired
    private ActionPerformer actionPerformer;

    @Autowired
    private ActionPerformerAspect actionPerformerAspect;

    @Test
    public void checkAspectCall() {

        actionPerformer.performAction(20);

//        verify(actionPerformerAspect, times(1)).beforePerformAction(20);
    }

}
