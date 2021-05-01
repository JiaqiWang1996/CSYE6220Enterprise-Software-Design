<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <body>

        <div class = "container">
            <div class = "jumbotron">
                <h1>Part 8. Programming Assignment</h1>
                <p>Please fill your TuitionWaiverForm!</p>
                <p>Section 1</p>
            </div>
<form action="HW2_Part8"  method="post">
Acadamic Term:<input type="text" name="acadamic_term" /><br/>
Acadamic Year:<input type="text" name="acadamic_year" /><br/>
 <label for = "inputStatus" class = "col-sm-2 control-label">Employee Status :</label>
                    <div class = "col-sm-10">
                        <label class = "checkbox-inline">
                            <input type = "checkbox" id = "inlineCheckbox1" value = "P/T Staff" name = "eStatus"> P/T Staff
                        </label>

                        <label class = "checkbox-inline">
                            <input type = "checkbox" id = "inlineCheckbox2" value = "P/T Faculty" name = "eStatus">P/T Faculty
                        </label>

                        <label class = "checkbox-inline">
                            <input type = "checkbox" id = "inlineCheckbox3" value = "Retiree" name = "eStatus"> Retiree
                        </label>
                         <label class = "checkbox-inline">
                            <input type = "checkbox" id = "inlineCheckbox4" value = "Other" name = "eStatus"> Other
                        </label>
                        <input type="text" name="eStatus" /><br/>
                    </div>

        <div class = "container">
            <div class = "jumbotron">
                <p>Section 2</p>
            </div>
Student's Name:<input type="text" name="Student_name" /><br/>
Student's NUID:<input type="text" name="Student_NUID" /><br/>
Employee's Name:<input type="text" name="Employee_name" /><br/>
Employee's NUID:<input type="text" name="Employee_NUID" /><br/>
Department:<input type="text" name="Department" /><br/>
Campus Location:<input type="text" name="Campus_location" /><br/>
Phone Number:<input type="text" name="Phone_number" /><br/>
Supervisor's Name:<input type="text" name="Supervisor_name" /><br/>

        <div class = "container">
            <div class = "jumbotron">
                <p>Section 3</p>
            </div>
 <label for = "school/program" class = "col-sm-2 control-label">indicate the applicable school or program :</label>
                    <div class = "col-sm-10">
                        <label class = "checkbox-inline">
                            <input type = "checkbox" id = "inlineCheckbox1" value = "Undergraduate Program" name = "school_program"> Undergraduate Program
                        </label>

                         <label class = "checkbox-inline">
                            <input type = "checkbox" id = "inlineCheckbox2" value = "law school(excludes employees)" name = "school_program">law school(excludes employees)
                        </label>

                        <label class = "checkbox-inline">
                            <input type = "checkbox" id = "inlineCheckbox3" value = "Doctoral Candidate" name = "school_program">Doctoral Candidate
                        </label>

                         <label class = "checkbox-inline">
                            <input type = "checkbox" id = "inlineCheckbox4" value = "College of Professional Studies (CPS) Undergraduate" name = "school_program"> College of Professional Studies (CPS) Undergraduate
                        </label>
                        
              <label class = "checkbox-inline">
                            <input type = "checkbox" id = "inlineCheckbox5" value = "Graduate School " name = "school_program"> Graduate School 
                        </label>

              <label class = "checkbox-inline">
                            <input type = "checkbox" id = "inlineCheckbox6" value = "CPS Graduate School " name = "school_program"> CPS Graduate School
                        </label>
                    </div>

<br/>
Course No. :<input type="text" name="Course_no1" />
Course Name:<input type="text" name="Course_name1" />
Supervisor Signature :<input type="text" name="Supervisor_signature 1" />
Credit Hrs.:<input type="text" name="Credit_hrs1" />
Day(s) :<input type="text" name="days1" />
Time:<input type="text" name="time1" /><B>a.m./p.m. </B>
<br/>
<br/>
Course No. :<input type="text" name="Course_no2" />
Course Name:<input type="text" name="Course_name2" />
Supervisor Signature :<input type="text" name="Supervisor_signature2 " />
Credit Hrs.:<input type="text" name="Credit_hrs2" />
Day(s) :<input type="text" name="days2" />
Time:<input type="text" name="time2" /><B>a.m./p.m. </B>
<br/>
<br/>
Course No. :<input type="text" name="Course_no3" />
Course Name:<input type="text" name="Course_name3" />
Supervisor Signature :<input type="text" name="Supervisor_signature3 " />
Credit Hrs.:<input type="text" name="Credit_hrs3" />
Day(s) :<input type="text" name="days3" />
Time:<input type="text" name="time3" /><B>a.m./p.m. </B>

 <div class = "container">
            <div class = "jumbotron">
                <p>Section 4</p>
            </div>
Employee's Signature  :<input type="text" name="Employee_signature" />
Date:<input type="text" name="date_employee" />

 <div class = "container">
            <div class = "jumbotron">
                <p>Section 5</p>
            </div>
HRM Approval  :<input type="text" name="HRM_approval" />
Date:<input type="text" name="date_HRM" />

<input type="submit" name="submit" value="submit">

</form>

            

    </body>
</html>