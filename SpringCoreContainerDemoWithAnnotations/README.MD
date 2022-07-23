# Spring Core 


*Spring Container with Annotation Config*

- Make bean classes and annotate then with @Component("optional_name")
- For dependency injection mark the Variable declaration or setter as @Autowired

```java
	@Autowired 
	private Address address;
	
	// OR
	
	@Autowired
	public setAddress(Address address){
		this.address = address;
	}

```
**For Client Class**
- Mark Client class with @ComponentScan("package.name.of.bean.classes")
- Mark CLient class with @Configuration to inform container that it is a configuration class.
- Use ApplicationCOntext to manage the bean class (*refer Client.java*)
- Spring Container is also called IOC container

