import java.sql.{Connection, DriverManager, ResultSet}

object JDBCExample extends App {
   println("Checing.....")

  Class.forName("com.mysql.jdbc.Driver")
  var connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/menagerie","root","root")
  var statement = connection.createStatement();
  var resultSet = statement.executeQuery("select * from employee")
  while(resultSet.next()){
      println(resultSet.getString(1))
  }
 /* Class.forName("com.mysql.jdbc.Driver")
  var con = DriverManager.getConnection("jdbc:mysql://localhost:3306/menagerie","root","root")
 var statement =  con.createStatement();
  val resultSet :ResultSet = statement.executeQuery("select * from employee")
  while(resultSet.next()){
       println(resultSet.getString(1))
  }*/
  println("Done....")

}
