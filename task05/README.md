<pre>
Task05:
-------
1. Bean Autowiring.
2. Spring XML Based Configuration
3. Spring Annotation Based Configuration
4. Spring Java Based Configuration
5. @Autowired, @Resource, @Inject
6. @Autowired, @Required, @Qualifier

================================

Annotation & Description

1	@Required
		The @Required annotation applies to bean property setter methods.
2	@Autowired
		The @Autowired annotation can apply to bean property setter methods, non-setter methods, constructor and properties.
3	@Qualifier
		The @Qualifier annotation along with @Autowired can be used to remove the confusion by specifiying which exact bean will be wired.
4	JSR-250 Annotations
		Spring supports JSR-250 based annotations which include @Resource, @PostConstruct and @PreDestroy annotations.
====================================================================================================================================================
Q: How do you turn on annotation wiring?
A: Annotation wiring is not turned on in the Spring container by default. So, before we can use annotation-based wiring, we will need to enable it in our Spring configuration file by configuring <context:annotation-config/>.

Q: What does @Required annotation mean?
A: This annotation simply indicates that the affected bean property must be populated at configuration time, through an explicit property value in a bean definition or through autowiring. The container throws BeanInitializationException if the affected bean property has not been populated.

Q: What does @Autowired annotation mean?
A: This annotation provides more fine-grained control over where and how autowiring should be accomplished. The @Autowired annotation can be used to autowire bean on the setter method just like @Required annotation, constructor, a property or methods with arbitrary names and/or multiple arguments.

Q: What does @Qualifier annotation mean?
A: There may be a situation when you create more than one bean of the same type and want to wire only one of them with a property, in such case you can use @Qualifier annotation along with @Autowired to remove the confusion by specifying which exact bean will be wired.

Q: Use of @Resource

A: This annotation can be used on fields or setter methods. The @Resource annotation takes a 'name' attribute which will be interpreted as the bean name to be injected. You can say, it follows by-name autowiring semantics.
====================================================================================================================================================
If you @Autowire without component scanning, an explicit XML configuration of a dependency will override @Autowired, so avoiding any exceptions. 

@Resource is an explicit request for injection of a dependency by name, so is not only more concise than @Autowired with @Qualifier, but clearer in its intent. 

@Autowired allows you to specify a "required" attribute which can be true (the default) or false. In the latter case, there will be no exception if there is no matching bean, but a null will be injected. @Inject does not have an equivalent attribute. 

The main reason to use JSR-330 @Inject is to allow classes to be annotated for automatic dependency injection with Spring or without (e.g. with EJB CDI). If you do not need to support injection without Spring, I'd suggest that you should stick with @Autowired. If you do need this facility, the JSR-330 equivalent of @Qualifier is @Named. @Named at class level is equivalent to @Component. There is no JSR-330 equivalent to @Value. 

@Qualifier can be used in a more sophisticated way than just using the bean name , but .... 
In most circumstances, I'd strongly suggest that if you're having to use @Qualifier or @Resource much at all, you are defeating the purpose of dependency injection, and so should go back to using XML, or perhaps investigate Java @Configuration.
====================================================================================================================================================
</pre>