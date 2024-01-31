package com.utilities;

import java.util.Map;

public record TestContext(String scenarioName, Map<String, String> testData) {
}
