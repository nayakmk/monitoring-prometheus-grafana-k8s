package io.nayakmk.samples.monitoring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.micrometer.core.instrument.MeterRegistry;

@SpringBootApplication
public class GradleK8sApplication {


	public static void main(String[] args) {
		SpringApplication.run(GradleK8sApplication.class, args);
	}

}
