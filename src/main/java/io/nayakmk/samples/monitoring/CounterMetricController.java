package io.nayakmk.samples.monitoring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

@RestController
public class CounterMetricController {

    @Autowired
    MeterRegistry registry;

    @GetMapping
    public void root() {
        registry.counter("hits.counter", "value", "ping").increment();
    }
}
