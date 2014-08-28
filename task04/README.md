<pre>
Task04:
-------
1. Spring bean & context
2. Spring configuration file
3. Bean wiring.
4. Bean Autowiring.
5. Spring XML Based Configuration
6. Spring Annotation Based Configuration
7. Spring Java Based Configuration


================================
Q: What is bean wiring?
Q: What is Auto wiring? What are different types of Autowire types?
Q: What are different Modes of auto wiring?
Q  Annotation & Description
Q: What are the limitations with autowiring?


Q: What is bean wiring?
Ans: Combining beans together within the Spring container is known as bean wiring. When wiring beans, the programmer should tell the container what beans are needed and how the container should use dependency injection to tie them together.


Q:  What is Auto wiring? What are different types of Autowire types?
A: The Spring container is able to autowire relationships between collaborating beans. This means that it is possible to automatically let Spring resolve collaborators (other beans) for your bean by inspecting the contents of the BeanFactory without using &lt;constructor-arg> and &lt;property> elements.

Q: What are different Modes of auto wiring?
A: The autowiring functionality has five modes which can be used to instruct Spring container to use autowiring for dependency injection. You use the autowire attribute of the &lt;bean/> element to specify autowire mode for a bean definition.
·  no: This is default setting which means no autowiring and you should use explicit bean reference for wiring. You have nothing to do special for this wiring. This is what you already have seen in Dependency Injection chapter.
·  byName: Autowiring by property name. Spring container looks at the properties of the beans on which autowire attribute is set to byName in the XML configuration file. It then tries to match and wire its properties with the beans defined by the same names in the configuration file.
·  byType: Autowiring by property datatype. Spring container looks at the properties of the beans on which autowire attribute is set to byType in the XML configuration file. It then tries to match and wire a property if its type matches with exactly one of the beans name in configuration file. If more than one such beans exist, a fatal exception is thrown.
·  constructor: Similar to byType, but type applies to constructor arguments. If there is not exactly one bean of the constructor argument type in the container, a fatal error is raised.
·  autodetect: Spring first tries to wire using autowire by constructor, if it does not work, Spring tries to autowire by byType.


Annotation & Description

1	@Required
		The @Required annotation applies to bean property setter methods.
2	@Autowired
		The @Autowired annotation can apply to bean property setter methods, non-setter methods, constructor and properties.
3	@Qualifier
		The @Qualifier annotation along with @Autowired can be used to remove the confusion by specifiying which exact bean will be wired.
4	JSR-250 Annotations
		Spring supports JSR-250 based annotations which include @Resource, @PostConstruct and @PreDestroy annotations.


Q: What are the limitations with autowiring?
·  A: Limitations of autowiring are:
·  Overriding possibility: You can still specify dependencies using &lt;constructor-arg> and &lt;property> settings which will always override autowiring.
·  Primitive data types: You cannot autowire so-called simple properties such as primitives, Strings, and Classes.
·  Confusing nature: Autowiring is less exact than explicit wiring, so if possible prefer using explicit wiring.

Q: What are Inner Beans?
A: A &lt;bean/> element inside the &lt;property/> or &lt;constructor-arg/> elements defines a so-called inner bean. An inner bean definition does not require a defined id or name; the container ignores these values. It also ignores the scope flag. Inner beans are always anonymous and they are always scoped as prototypes.

</pre>