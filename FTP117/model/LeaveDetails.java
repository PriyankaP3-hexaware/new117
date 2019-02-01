package com.hexaware.FTP117.model;

import java.util.Date;
import java.text.SimpleDateFormat;
import com.hexaware.FTP117.persistence.DbConnection;
import com.hexaware.FTP117.persistence.EmployeeDAO;
import com.hexaware.FTP117.persistence.LeaveDetailsDAO;
import java.util.Objects;
import java.text.ParseException;


/**
 * LeaveDetails class to store Leave Details of employee.
 * @author hexaware.
 */
public class LeaveDetails {
  /**
   * leaveEmpId to store employee id.
   */
  private int leaveEmpId;
  /**
   * leaveId to store employee leave.
   */
  private int leaveId;
  /**
   * leavetype to store employee leavetype.
   */
  private LeaveType leaveType;
  /**
   * LeaveStartDate to store employee Leave Start Date.
   */
  private Date leaveStartDate;
  /**
   * LeaveEndDate to Store employee leave End date.
   */
  private Date leaveEndDate;
  /**
   * LeaveAppliedOn to Store employee leaved applie date.
   */
  private Date leaveAppliedOn;
  /**
   * leaveReason to store employee leave Reason.
   */
  private String leaveReason;
  /**
   * LeaveNoOfDays to store employee applied for no of days.
   */
  private int leaveNoOfDays;
  /**
   * leaStatus to store employee status of applied leave.
   */
  private LeaveStatus leaveStatus;
  /**
   * LeaveMgrComments to store managers comments on leave.
   */
  private String leaveMgrComments;

  @Override
  public final boolean equals(final Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    LeaveDetails lev = (LeaveDetails) obj;
    if (Objects.equals(leaveId, lev.leaveId)) {
      return true;
    }
    return false;
  }

  @Override
  public final int hashCode() {
    return Objects.hash(leaveId);
  }
  @Override
  public final String toString() {
    return " LeaveEmpId:" + leaveEmpId + " Leave Id:" + leaveId + " Leave Type:"
             + leaveType + " leave Start Date: " + leaveStartDate + " leave End Date : "
             + leaveEndDate + " LeaveAppliedOn :" + leaveAppliedOn + "Leave Reason"
             + leaveReason + " LeaveNoOfDays " + leaveNoOfDays + "Leave Status " + leaveStatus
             + "Leave Manager Comments " + leaveMgrComments;
  }


  /**
   * @param argLeaveEmpId to initialize employee id.
   * @param argLeaveId to initialize Leave Id .
   * @param argLeaveType to initialize Leave Type.
   * @param argLeaveStartDate to initialize Start Date Of Leave.
   * @param argLeaveEndDate to initialize End date of Leave.
   * @param argLeaveAppliedOn to initialize Applied on.
   * @param argLeaveReason to initialize Leave  Reason.
   * @param argLeaveNoOfDays to initialize No of days Leave applied.
   * @param argLeaveStatus to initialize Status of applied Leave.
   * @param argLeaveMgrComments to initialize Manager Comments.
   */
  public LeaveDetails(final int argLeaveEmpId, final int argLeaveId, final LeaveType argLeaveType,
                      final Date argLeaveStartDate, final Date argLeaveEndDate, final Date argLeaveAppliedOn,
                      final String argLeaveReason, final int argLeaveNoOfDays, final LeaveStatus argLeaveStatus,
                      final String argLeaveMgrComments) {
    this.leaveEmpId = argLeaveEmpId;
    this.leaveId = argLeaveId;
    this.leaveType = argLeaveType;
    this.leaveStartDate = argLeaveStartDate;
    this.leaveEndDate = argLeaveEndDate;
    this.leaveAppliedOn = argLeaveAppliedOn;
    this.leaveReason = argLeaveReason;
    this.leaveNoOfDays = argLeaveNoOfDays;
    this.leaveStatus = argLeaveStatus;
    this.leaveMgrComments = argLeaveMgrComments;

  }
  /**
   * Gets the Em.
   * @return this Employee's ID.
   */
  public final int getLeaveEmpId() {
    return leaveEmpId;
  }
  /**
   * @param argLeaveEmpId to set Leave id.
   */
  public final void setLeaveEmpId(final int argLeaveEmpId) {
    this.leaveEmpId = argLeaveEmpId;
  }
  /**
   * Gets the LeaveID.
   * @return this Leave ID.
   */
  public final int getLeaveId() {
    return leaveId;
  }
  /**
   * @param argLeaveId to set Leave id.
   */
  public final void setLeaveId(final int argLeaveId) {
    this.leaveId = argLeaveId;
  }
  /**
   * Gets the LeaveTYpe.
   * @return this Employee's ID.
   */
  public final LeaveType getLeaveType() {
    return leaveType;
  }
  /**
   * @param argLeaveType to set Leave Type.
   */
  public final void setLeaveType(final LeaveType argLeaveType) {
    this.leaveType = argLeaveType;
  }
  /**
   * Gets the Leave Start Date.
   * @return this Leave Start Date.
   */
  public final Date getLeaveStartDate() {
    return leaveStartDate;
  }
  /**
   * @param argLeaveStartDate to set Leave StartDate.
   */
  public final void setLeaveStartDate(final Date argLeaveStartDate) {
    this.leaveStartDate = argLeaveStartDate;
  }
  /**
   * Gets the Leave End Date.
   * @return this Leave End Date.
   */
  public final Date getLeaveEndDate() {
    return leaveEndDate;
  }
  /**
   * @param argLeaveEndDate to set Leave EndDate.
   */
  public final void setLeaveEndDate(final Date argLeaveEndDate) {
    this.leaveEndDate = argLeaveEndDate;
  }
  /**
   * Gets the Leave Applied Date.
   * @return this Leave Applied Date.
   */
  public final Date getLeaveAppliedOn() {
    return leaveAppliedOn;
  }
  /**
   * @param argLeaveAppliedOn to set Leave Applied On.
   */
  public final void setLeaveAppliedOn(final Date argLeaveAppliedOn) {
    this.leaveAppliedOn = argLeaveAppliedOn;
  }
  /**
   * Gets the Leave Reason.
   * @return this Leave Reason.
   */
  public final String getLeaveReason() {
    return leaveReason;
  }
  /**
   * @param argLeaveReason to set Leave Reason.
   */
  public final void setLeaveReason(final String argLeaveReason) {
    this.leaveReason = argLeaveReason;
  }
  /**
   * Gets the No of Leaves Applied.
   * @return this No Of leaves Applied.
   */
  public final int getLeaveNoOfDays() {
    return leaveNoOfDays;
  }
  /**
   * @param argLeaveNoOfDays to set No of Days.
   */
  public final void setLeaveNoOfDays(final int argLeaveNoOfDays) {
    this.leaveNoOfDays = argLeaveNoOfDays;
  }
  /**
   * Gets the Leave Status.
   * @return this Leave Status.
   */
  public final LeaveStatus getLeaveStatus() {
    return leaveStatus;
  }
  /**
   * @param argLeaveStatus to set Leave Status.
   */
  public final void setLeaveStatus(final LeaveStatus argLeaveStatus) {
    this.leaveStatus = argLeaveStatus;
  }
  /**
   * Gets the Manager Comments on Leave.
   * @return this Manager Comments on Leave.
   */
  public final String getLeaveMgrComments() {
    return leaveMgrComments;
  }
  /**
   * @param argLeaveMgrComments to set Leave Manager Comments.
   */
  public final void setLeaveMgrComments(final String argLeaveMgrComments) {
    this.leaveMgrComments = argLeaveMgrComments;
  }

  /**
   * The dao for employee.
   */
  private static EmployeeDAO edao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(EmployeeDAO.class);
  }

   /**
   * The dao for LeaveDetails.
   */
  private static LeaveDetailsDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(LeaveDetailsDAO.class);
  }
  /**
   * To apply for leave.
   * @param argLeaveEmpId to set leave ID.
   * @param argLeaveType to set leave type.
   * @param argLeaveStartDate to set start date of leave.
   * @param argLeaveEndDate to set end date of leave.
   * @param argLeaveReason to set reason for leave.
   * @param argLeaveNoOfDays to set no of days of leave.
   * @throws IllegalArgumentException to handle parse exception.
   * @throws ParseException to handle parse exception.
   * @return string from apply leave.
   */

  public static String applyLeave(final int argLeaveEmpId,
                                 final LeaveType argLeaveType,
                                 final String argLeaveStartDate,
                                 final String argLeaveEndDate,
                                 final String argLeaveReason,
                                 final int argLeaveNoOfDays) throws ParseException {
    LeaveStatus ls = LeaveStatus.PENDING;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    Date sDate = sdf.parse(argLeaveStartDate);
    Date eDate = sdf.parse(argLeaveEndDate);
    long diff = eDate.getTime() - sDate.getTime();
    int noDays = (int) diff / (1000 * 60 * 60 * 24);
    System.out.println(noDays);
    String res = "";
    Employee e = edao().find(argLeaveEmpId);
    int levAvail = e.getEmpAvailabeLeave();
    int  dayDif = levAvail - argLeaveNoOfDays;
    if (noDays < 0) {
      res = "StartDate Must Be Greater Than End Date....";
    } else if (dayDif < 0) {
      res = "Insufficent Leave Balance...";
    } else {
      noDays = noDays + 1;
      Date cur = new Date();
      String appliedOn = sdf.format(cur);
      dao().insert(argLeaveEmpId, argLeaveType, ls, argLeaveStartDate,
                argLeaveEndDate, appliedOn, argLeaveReason, argLeaveNoOfDays);
      res = "Leave Applied Successfully....";
    }
    return res;
  }

}

