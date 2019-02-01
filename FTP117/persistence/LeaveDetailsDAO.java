package com.hexaware.FTP117.persistence;

import com.hexaware.FTP117.model.LeaveDetails;
import com.hexaware.FTP117.model.LeaveType;
import com.hexaware.FTP117.model.LeaveStatus;


import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

import java.util.List;

/**
 * The DAO class for LeaveDetails.
 */
public interface LeaveDetailsDAO  {
  /**
   * return all the details of all the LeaveDetailss.
   * @return the LeaveDetails array
   */
  @SqlQuery("SELECT * FROM LeaveDetails")
  @Mapper(LeaveDetailsMapper.class)
  List<LeaveDetails> list();

  /**
   * return all the details of the selected LeaveDetails.
   * @param empID the id of the LeaveDetails
   * @return the LeaveDetails object
   */

  @SqlQuery("SELECT * FROM LeaveDetails WHERE EMP_ID = :empID")
  @Mapper(LeaveDetailsMapper.class)
  LeaveDetails find(@Bind("empID") int empID);
    /**
   * insert all the details of the employee.
   * @param leaempid the employee id.
   * @param lealeavetype the type of leave.
   * @param lealeavestatus the leave status.
   * @param leastartdate the starting date of leave.
   * @param leaenddate the ending date of leave.
   * @param leaappliedon the date leave is applied on.
   * @param leareason the reason for leave.
   * @param leanoofdays the no of days of leave.
   */


  @SqlUpdate("INSERT INTO LEAVE_DETAILS"
            +
            "             (LEA_EMP_ID, "
            +
            "              LEA_LEAVE_TYPE, "
            +
            "              LEA_LEAVE_STATUS, "
            +
            "              LEA_START_DATE, "
            +
            "              LEA_END_DATE, "
            +
            "              LEA_APPLIED_ON, "
            +
            "              LEA_REASON, "
            +
            "              LEA_NO_OF_DAYS) "
            +
            "values       ( "
            +
            "              :leaempid, "
            +
            "              :lealeavetype, "
            +
            "              :lealeavestatus, "
            +
            "              :leastartdate, "
            +
            "              :leaenddate, "
            +
            "              :leaappliedon, "
            +
            "              :leareason, "
            +
            "              :leanoofdays)")
  void insert(@Bind("leaempid") int leaempid,
         @Bind("lealeavetype") LeaveType lealeavetype,
         @Bind("lealeavestatus") LeaveStatus lealeavestatus,
         @Bind("leastartdate") String leastartdate,
         @Bind("leaenddate") String leaenddate,
         @Bind("leaappliedon") String leaappliedon,
         @Bind("leareason") String leareason,
         @Bind("leanoofdays") int leanoofdays);

  /**
  * close with no args is used to close the connection.
  */
  void close();
}
