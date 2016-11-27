package firm;

public abstract class Employee implements Payable {
  private String name;

  public Employee(String name) {
    this.name = name;
  }
}
