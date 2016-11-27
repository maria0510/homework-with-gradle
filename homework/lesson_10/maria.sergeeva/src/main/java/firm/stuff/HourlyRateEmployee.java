package firm.stuff;

import firm.Employee;
import firm.Payable;

public class HourlyRateEmployee extends Employee {
  private float hourlyrate;
  private int workingHours;

  public HourlyRateEmployee(String name, float hourlyrate) {
    super(name);
    this.hourlyrate = hourlyrate;
  }

  public void setWorkingHours(int workingHours) {
    this.workingHours = workingHours;
  }

  public float calculatePayment() {
    return (float)workingHours * hourlyrate; 
  }

}
