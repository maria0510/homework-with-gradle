package firm.stuff;

import firm.Employee;
import firm.Payable;
import firm.PaymentPeriod;

public class Manager extends Employee {
  private float dayrate;
  private PaymentPeriod period;
  private int countday = 0;
  private int workingdays;
  private float salary;
  private float bonus;
  private int count;

  public Manager(String name, float dayrate, PaymentPeriod period) {
    super(name);
    this.dayrate = dayrate;
    this.period = period;
  }

  public void setWorkingHours(int workingHours) {
    countday = workingHours / Payable.WORKING_HOURS_PER_DAY;
    int period = intPeiod();
    count = countday / period;
  }

  public float calculatePayment() {
    intPeiod();
    if (countday == 0 || countday >= (workingdays * count)) {
      salary = dayrate * (float)(workingdays * count) + bonus;
    } else {
      salary = 0.0f;
    }
    return salary;
  }

  public void setBonus(float bonus) {
    this.bonus = bonus;
  }

  private int intPeiod() {
    switch (period) {
      case WEEKLY: workingdays = 5; 
                   break; 
      case BIWEEKLY: workingdays = 10; 
                     break;
      case MONTHLY: workingdays = 20; 
                    break;
      default : workingdays = 0;
    }
    return workingdays;
  }

}
