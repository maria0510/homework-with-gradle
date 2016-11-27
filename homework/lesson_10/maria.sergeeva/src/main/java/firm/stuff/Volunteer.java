package firm.stuff;

import firm.Employee;
import firm.Payable;

public class Volunteer extends Employee {
  private int workingHours1;

  public Volunteer(String name) {
    super(name);
  }

  public float calculatePayment() {
    return 0.0f * (float)workingHours1;
  }

  public void setWorkingHours(int workingHours) {
    workingHours1 = workingHours;
  }

}
