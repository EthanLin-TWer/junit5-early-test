package com.thoughtworks.cn.condition;

import org.junit.jupiter.api.extension.*;
import org.junit.platform.commons.util.AnnotationUtils;

import java.lang.reflect.AnnotatedElement;
import java.util.Arrays;
import java.util.Optional;

public class OsCondition implements ContainerExecutionCondition, TestExecutionCondition {

    @Override
    public ConditionEvaluationResult evaluate(ContainerExtensionContext context) {
        return evaluateIfAnnotated(context.getElement());
    }

    @Override
    public ConditionEvaluationResult evaluate(TestExtensionContext context) {
        return evaluateIfAnnotated(context.getElement());
    }

    private ConditionEvaluationResult evaluateIfAnnotated(Optional<AnnotatedElement> element) {
        Optional<DisabledOnOs> disabledOs = AnnotationUtils.findAnnotation(element, DisabledOnOs.class);
        if (disabledOs.isPresent()) {
            return disabledIfOn(disabledOs.get().value());
        }
        return ConditionEvaluationResult.enabled("@DisabledOnOs is not present");
    }

    private ConditionEvaluationResult disabledIfOn(OS[] disabledOs) {
        OS current = OS.determine();
        if (Arrays.asList(disabledOs).contains(current)) {
            return ConditionEvaluationResult.disabled("Test on os " + current + " is disabled");
        }
        return ConditionEvaluationResult.enabled("Test is not disabled on " + current + " os.");
    }
}
