<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
    <head>
        <title>Student Registration Form</title>
        <spring:url value="/resources/css/default.css" var="mainCss" />
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
        <link href="${mainCss}" rel="stylesheet" />
    </head>
    <body>    
        <f:form action="registerStudentSave.htm" commandName="student" class="register">
            <h1>Student Registration</h1>
            <fieldset class="row1">
                <legend>Account Details
                </legend>
                <p>
                    <label>Email *
                    </label>
                    <f:input path="email" required="true"/>
                    <label>Student Id *
                    </label>
                    <f:input path="student_id" required="true"/>
                </p>
                <p>
                    <label>Password*
                    </label>
                    <input type="password" name="password" required="true"/>
                    <label>Confirm Password*
                    </label>
                    <input type="password" required="true"/>
                    <label class="obinfo">* obligatory fields
                    </label>
                </p>
            </fieldset>
            <fieldset class="row2">
                <legend>Personal Details
                </legend>
                <p>
                    <label>First Name *
                    </label>
                    <f:input class="long" path="first_name"/>
                </p>
		<p>
                    <label>Last Name 
                    </label>
                    <f:input class="long" path="last_name"/>
                </p>
                <p>
                    <label>Contact Number *
                    </label>
                    <f:input maxlength="10" path="contact_number"/>
                </p>
                <p>
                    <label class="optional">Address
                    </label>
                    <f:textarea maxlength="50" class="long" path="address"/>
                </p>
                <p>
                    <label>City *
                    </label>
                    <f:input type="text" class="long" path="city"/>
                </p>
		<p>
                    <label>State *
                    </label>
                    <f:input type="text" class="long" path="state"/>
                </p>
                <p>
                    <label>Section *
                    </label>
                    <f:input type="text" class="long" path="section"/>
                </p>
                <p>
                    <label>Gender *</label>
                    <f:input type="radio" value="male" path="gender"/>
                    <label class="gender">Male</label>
                    <f:input type="radio" value="female" path="gender"/>
                    <label class="gender">Female</label>
                </p>
		<p>
			<label>admission_date *
                    </label>
                    <select class="date" name="admission_date_day">
                        <option value="1">01
                        </option>
                        <option value="2">02
                        </option>
                        <option value="3">03
                        </option>
                        <option value="4">04
                        </option>
                        <option value="5">05
                        </option>
                        <option value="6">06
                        </option>
                        <option value="7">07
                        </option>
                        <option value="8">08
                        </option>
                        <option value="9">09
                        </option>
                        <option value="10">10
                        </option>
                        <option value="11">11
                        </option>
                        <option value="12">12
                        </option>
                        <option value="13">13
                        </option>
                        <option value="14">14
                        </option>
                        <option value="15">15
                        </option>
                        <option value="16">16
                        </option>
                        <option value="17">17
                        </option>
                        <option value="18">18
                        </option>
                        <option value="19">19
                        </option>
                        <option value="20">20
                        </option>
                        <option value="21">21
                        </option>
                        <option value="22">22
                        </option>
                        <option value="23">23
                        </option>
                        <option value="24">24
                        </option>
                        <option value="25">25
                        </option>
                        <option value="26">26
                        </option>
                        <option value="27">27
                        </option>
                        <option value="28">28
                        </option>
                        <option value="29">29
                        </option>
                        <option value="30">30
                        </option>
                        <option value="31">31
                        </option>
                    </select>
                    <select name="admission_day_month">
                        <option value="1">January
                        </option>
                        <option value="2">February
                        </option>
                        <option value="3">March
                        </option>
                        <option value="4">April
                        </option>
                        <option value="5">May
                        </option>
                        <option value="6">June
                        </option>
                        <option value="7">July
                        </option>
                        <option value="8">August
                        </option>
                        <option value="9">September
                        </option>
                        <option value="10">October
                        </option>
                        <option value="11">November
                        </option>
                        <option value="12">December
                        </option>
                    </select>
                    <input class="year" type="text" size="4" maxlength="4" name="admission_date_year"/>e.g 2013
		</p>
                <p>
                    <label>Birthdate *
                    </label>
                    <select class="date" name="DOB_day">
                        <option value="1">01
                        </option>
                        <option value="2">02
                        </option>
                        <option value="3">03
                        </option>
                        <option value="4">04
                        </option>
                        <option value="5">05
                        </option>
                        <option value="6">06
                        </option>
                        <option value="7">07
                        </option>
                        <option value="8">08
                        </option>
                        <option value="9">09
                        </option>
                        <option value="10">10
                        </option>
                        <option value="11">11
                        </option>
                        <option value="12">12
                        </option>
                        <option value="13">13
                        </option>
                        <option value="14">14
                        </option>
                        <option value="15">15
                        </option>
                        <option value="16">16
                        </option>
                        <option value="17">17
                        </option>
                        <option value="18">18
                        </option>
                        <option value="19">19
                        </option>
                        <option value="20">20
                        </option>
                        <option value="21">21
                        </option>
                        <option value="22">22
                        </option>
                        <option value="23">23
                        </option>
                        <option value="24">24
                        </option>
                        <option value="25">25
                        </option>
                        <option value="26">26
                        </option>
                        <option value="27">27
                        </option>
                        <option value="28">28
                        </option>
                        <option value="29">29
                        </option>
                        <option value="30">30
                        </option>
                        <option value="31">31
                        </option>
                    </select>
                    <select name="DOB_month">
                        <option value="1">January
                        </option>
                        <option value="2">February
                        </option>
                        <option value="3">March
                        </option>
                        <option value="4">April
                        </option>
                        <option value="5">May
                        </option>
                        <option value="6">June
                        </option>
                        <option value="7">July
                        </option>
                        <option value="8">August
                        </option>
                        <option value="9">September
                        </option>
                        <option value="10">October
                        </option>
                        <option value="11">November
                        </option>
                        <option value="12">December
                        </option>
                    </select>
                    <input class="year" type="text" size="4" maxlength="4" name="DOB_year"/>e.g 1997
                </p>
<!--                <p>
                    <label>Nationality *
                    </label>
                    <select name="nationality">
                        <option value="0">
                        </option>
                        <option value="1">India
                        </option>
                    </select>
                </p>-->
		<p>
			<label>Father's Name *
                    </label>
                    <f:input type="text" class="long" path="father_name"/>
		</p>
		<p>
			<label>Program *
                    </label>
                    <f:input type="text" class="long" path="program"/>
		</p>
		<p>
			<label>branch *
                    </label>
                    <f:input type="text" class="long" path="branch"/>
		</p>
                
                <div class="infobox"><h4>Warning !!!!</h4>
                    <p>
			please Make sure that data entered is correct before you press register button
		    </p>
                </div>
            
            <div><input class="button" value="Register" type="submit"/></div>
        </f:form>
    </body>
</html>