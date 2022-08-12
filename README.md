# Pyramid-Academy-SpringFramework

public class student
{

   private int id;
   private String name;
   private List<Phone> ph;
   private Address add;
}

public class Phone
{

   private String mob;
}

public class Address
{

  private String city;
  private String state;
  private String country;
  private String zipcode;
}

Use the above student, phone and address classes to demonstrate DI  using all three types of Spring Container configurations(XML, Annotation and Java Config). 
