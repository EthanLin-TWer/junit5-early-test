package com.thoughtworks.cn.condition;

import org.junit.jupiter.api.extension.*;
import org.junit.platform.commons.util.AnnotationUtils;

import java.lang.reflect.AnnotatedElement;
import java.util.Optional;

public class DisabledCondition implements ContainerExecutionCondition, TestExecutionCondition {

    @Override
    public ConditionEvaluationResult evaluate(ContainerExtensionContext context) {
        return evaluateIfAnnotated(context.getElement());
    }

    @Override
    public ConditionEvaluationResult evaluate(TestExtensionContext context) {
        return evaluateIfAnnotated(context.getElement());
    }

    private ConditionEvaluationResult evaluateIfAnnotated(Optional<AnnotatedElement> element) {
        Optional<Disabled> disabled = AnnotationUtils.findAnnotation(element, Disabled.class);
        if (disabled.isPresent()) {
            return ConditionEvaluationResult.disabled(element + " is @Disabled");
        }
        return ConditionEvaluationResult.enabled("@Disabled is not present");
    }
}
