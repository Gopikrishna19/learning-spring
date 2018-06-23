import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.http.MediaType;
import org.springframework.oxm.xstream.XStreamMarshaller;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.accept.PathExtensionContentNegotiationStrategy;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;
import org.springframework.web.servlet.view.xml.MarshallingView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@Configuration
@EnableWebMvc // enables mvc in addition to regular spring app
@ComponentScan("com.gopikrishna19.learningSpring")
public class ApplicationConfig implements WebMvcConfigurer {
    @Bean
    static BeanNameViewResolver getBeanNameViewResolver() {
        BeanNameViewResolver resolver = new BeanNameViewResolver();
        resolver.setOrder(0);
        return resolver;
    }

    @Bean
    public static ContentNegotiatingViewResolver getContentNegotiatingViewResolver() {
        ContentNegotiatingViewResolver resolver = new ContentNegotiatingViewResolver();
        ArrayList<View> views = new ArrayList<>();

        views.add(getMarshallingJSONView());
        views.add(getMarshallingXMLView());

        resolver.setContentNegotiationManager(getContentNegotiationManager());
        resolver.setOrder(1);
        resolver.setDefaultViews(views);

        return resolver;
    }

    @Bean
    public static ContentNegotiationManager getContentNegotiationManager() {
        return new ContentNegotiationManager(getPathExtensionContentNegotiationStrategy());
    }

    @Bean
    public static InternalResourceViewResolver getInternalResourceViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/views/");
        resolver.setSuffix(".jsp");
        resolver.setOrder(2);
        return resolver;
    }

    private static MappingJackson2JsonView getMarshallingJSONView() {
        return new MappingJackson2JsonView();
    }

    @Bean
    public static MarshallingView getMarshallingXMLView() {
        return new MarshallingView(getXStreamMarshaller());
    }

    @Bean(name = "messageSource")
    public static MessageSource getMessageSource() {
        ResourceBundleMessageSource source = new ResourceBundleMessageSource();
        source.setBasename("messages");
        source.setUseCodeAsDefaultMessage(true);
        source.setDefaultEncoding("UTF-8");
        return source;
    }

    @Bean
    public static PathExtensionContentNegotiationStrategy getPathExtensionContentNegotiationStrategy() {
        Map<String, MediaType> strategies = new HashMap<>();
        strategies.put("json", new MediaType("application", "json"));
        strategies.put("xml", new MediaType("application", "xml"));
        return new PathExtensionContentNegotiationStrategy(strategies);
    }

    @Bean(name = "localeResolver")
    public static SessionLocaleResolver getSessionLocaleResolver() {
        SessionLocaleResolver resolver = new SessionLocaleResolver();
        resolver.setDefaultLocale(new Locale("en"));
        return resolver;
    }

    @Bean
    public static XStreamMarshaller getXStreamMarshaller() {
        XStreamMarshaller marshaller = new XStreamMarshaller();
        marshaller.setAutodetectAnnotations(true);
        return marshaller;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getLocaleChangeInterceptor());
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/assets/**").addResourceLocations("/assets/");
    }

    private LocaleChangeInterceptor getLocaleChangeInterceptor() {
        LocaleChangeInterceptor interceptor = new LocaleChangeInterceptor();
        interceptor.setParamName("lang");
        return interceptor;
    }
}
