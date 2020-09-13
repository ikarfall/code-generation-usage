import org.junit.jupiter.api.Test;

public class PersonBuilderTest {

  @Test
  void buildPerson() {
    System.out.println("her");
    new PersonBuilder().setAge(3).setName("name").build();
  }
}
