package cl.previred.desafio.uno.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket api() {
		// @formatter:off
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("cl.previred.desafio.uno.controller"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(getApiInfo());
		// @formatter:on
	}

	private ApiInfo getApiInfo() {
		// @formatter:off
		return new ApiInfoBuilder()
				.title("API Periodos Faltantes")
				.description("Desarrollo Desafio Uno Previred")
				.license("Apache 2.0")
				.licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
				.termsOfServiceUrl("")
				.version("1.0.0")
				.build();
		// @formatter:on
	}

}
