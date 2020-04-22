<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
  <head>
      <meta charset="utf-8">
      <title>Create an account</title>
      <style type="text/css">

* {
    box-sizing: border-box;
}
body {
    font-family: consolas;
}
input[type=text], input[type=number], input[type=password]{
    width: 100%;
    padding: 12px;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
    resize: vertical;
}
label {
    padding: 12px 12px 12px 0;
    display: inline-block;
    font-weight: bold;
    color: #ffffff;
    text-shadow: 2px 2px black;
}
h1 {
    color: #ffffff;
    font-family: sans-serif;
    font-size: 62px;
    font-weight: 800;
    line-height: 72px;
    margin: 0 0 24px;
    text-align: center;
    text-shadow: 3px 2px black;
}
button {
    background-color: white;
    color: black;
    padding: 12px 20px;
    border: none;
    border-radius: 8px;
    cursor: pointer;
}
.container {
    background-color: #808080;
    padding: 20px;
    width: 65%;
}
.col-25 {
    float: left;
    width: 15%;
    margin-top: 6px;
}
.col-75 {
    float: left;
    width: 70%;
    margin-top: 6px;
}
.row:after {
    content: "";
    display: table;
    clear: both;
}
@media (max-width: 600px) {
  .col-25, .col-75, button {
        width: 100%;
        margin-top: 0;
  }
}

  </style>
  </head>

  <body>
            <div class="container">
            <h1>Create your account</h1>

            <form:form method="POST" modelAttribute="organization" action="AddOrganization">

              <div class="row">
                <div class="col-25">
                    <label for="Organization Name">Organization Name:</label>
                </div>
                <div class="col-75">
                    <form:input type="text" path="organizationName"></form:input>
                </div>
              </div>

              <div class="row">
                <div class="col-25">
                    <label for="Organization Contact Number">Organization Contact Number:</label>
                </div>
                <div class="col-75">
                    <form:input type="text" path="organizationContactNumber"></form:input>
                </div>
              </div>

              <div class="row">
                <div class="col-25">
                    <label for="Organization Address">Organization Address:</label>
                </div>
                <div class="col-75">
                    <form:input type="text" path="organizationAddress"></form:input>
                </div>
              </div>

              <div class="row">
                  <button type="submit">Submit</button>
              </div>

            </form:form>
            </div>
  </body>
</html>

