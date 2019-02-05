package com.hexaware.FTP117.util;
import java.util.Scanner;
import java.text.ParseException;
import com.hexaware.FTP117.model.Employee;
import com.hexaware.FTP117.model.LeaveType;
import com.hexaware.FTP117.model.LeaveDetails;

/**
 * Class CliMain provides the command line interface to the leavemanagement
 * application.
 */
public class CliMain {
  private Scanner option = new Scanner(System.in, "UTF-8");

  private void mainMenu() {
    System.out.println("Leave Management System");
    System.out.println("-----------------------");
    System.out.println("1. List All Employees Info");
    System.out.println("2. Display Employee Info");
    System.out.println("3. Apply Leave");
    System.out.println("4. Approve/Deny");
    System.out.println("5. Exit");
    System.out.println("Enter your choice:");
    int menuOption = option.nextInt();
    mainMenuDetails(menuOption);
  }
  private void mainMenuDetails(final int selectedOption) {
    switch (selectedOption) {
      case 1:
        listEmployeesDetails();
        break;
      case 2:
        listEmployeeDetail();
        break;
      case 3:
        applyLeave();
        break;
      case 4:
        approveDeny();
        break;
      case 5:
        // halt since normal exit throws a stacktrace due to jdbc threads not responding
        Runtime.getRuntime().halt(0);
      default:
        System.out.println("Choose either 1, 2 or 3");
    }
    mainMenu();
  }
  private void listEmployeeDetail() {
    System.out.println("Enter an Employee Id");
    int empId = option.nextInt();
    Employee employee = Employee.listById(empId);
    if (employee == null) {
      System.out.println("Sorry, No such employee");
    } else {
      System.out.println(employee);
    }
  }

  private void approveDeny() {
    System.out.println("Enter Leave Id : ");
    int leavId = option.nextInt();
    System.out.println("Enter Manager Id : ");
    int mgrId = option.nextInt();
    System.out.println("Approved (YES/NO)");
    String status = option.next();
    System.out.println("Manager Comments : ");
    String mgrCon =  option.next();
    String res = LeaveDetails.approveDeny(leavId, mgrId, status, mgrCon);
    System.out.println(res);
  }

  private void listEmployeesDetails() {
    Employee[] employee = Employee.listAll();
    for (Employee e : employee) {
      System.out.println(e);
    }
  }
  private void applyLeave() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Employee Id: ");
    int empId = sc.nextInt();
    System.out.println("Enter StartDate :(yyyy-MM-dd");
    String levStartDate = sc.next();
    System.out.println("Enter EndDate :(yyyy-MM-dd");
    String levEndDate = sc.next();
    System.out.println("Enter no of leave days");
    int levNoOfDays = sc.nextInt();
    System.out.println("Enter leaveType: ");
    String levType = sc.next();
    LeaveType lt = LeaveType.valueOf(levType);
    System.out.println("Enter leave Reason: ");
    String levReason = sc.next();
    String res = "";
    try {
      res = LeaveDetails.applyLeave(empId, lt, levStartDate, levEndDate, levReason, levNoOfDays);
    } catch (ParseException e) {
      System.out.println("Pleae Enter Proper Date");
    }
    System.out.println(res);
  }
  /**
   * The main entry point.
   * @param ar the list of arguments
   */
  public static void main(final String[] ar) {
    final CliMain mainObj = new CliMain();
    mainObj.mainMenu();
  }
}
