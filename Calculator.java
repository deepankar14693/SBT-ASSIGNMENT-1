package knoldus.test1;
import java.util.Date;
import java.util.Scanner;
import java.sql.*;
class Calculator
{
    Scanner sc=new Scanner(System.in);
    public static void main(String[]args) throws SQLException, ClassNotFoundException {
        Scanner sc=new Scanner(System.in);
        System.out.println(" choose operation which you want to perform");
        System.out.println("1. ADD");
        System.out.println("2. SUBTRACT");
        System.out.println("3. MULTIPLICATION");
        System.out.println("4. DIVISION");
        System.out.println("5. POWER");
        System.out.println("6. ABSOLUTE");
        System.out.println("7. MODULUS");
        System.out.println("8. MIN OUT OF TWO");
        System.out.println("9. MAX OUT OF TWO");
        System.out.println("10. VIEW ALL OPERATIONS PERFORMED");
        System.out.println("11. VIEW SPECIFIC OPERATIONS PERFORMED");
            int operator=sc.nextInt();
        switch(operator)
        {
            case 1 :
                add();
                break;

            case 2 :
                subtract();
                break;

            case 3 :
                multiply();
                break;

            case 4 :
                divide();
                break;

            case 5 :
                power();
                break;

            case 6 :
                absolute();
                break;

            case 7 :
                modulus();
                break;

            case 8 :
                min();
                break;

            case 9 :
                    max();
                break;

            case 10 :
                readAllRecords();
                break;

            case 11 :
                readSpecificRecords();
                break;

                default:
                System.out.println("Error! please choose a legal operation");
        }
    }
    public static void add() throws SQLException
    {
        Object o;
        o = timestamp();
        String time=o.toString();
        String operator="add";
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        double first=sc.nextDouble();
        System.out.println("enter the second number");
        double second=sc.nextDouble();
        double result = first+second;
        System.out.println(result);
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Assignment","root","root");
        Statement stmt=con.createStatement();
        stmt.executeUpdate ("insert into calculator(ctime,cfirst,csecond,coperator,cresult)values('"+time+"',"+first+","+second+",'"+operator+"',"+result+")");
        con.close();
    }
    public static void subtract() throws SQLException
    {
        Object o;
        o = timestamp();
        String time=o.toString();
        String operator="subtract";
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        double first=sc.nextDouble();
        System.out.println("enter the second number");
        double second=sc.nextDouble();
        double result=first-second;
        System.out.println(result);
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Assignment","root","root");
        Statement stmt=con.createStatement();
        stmt.executeUpdate ("insert into calculator(ctime,cfirst,csecond,coperator,cresult)values('"+time+"',"+first+","+second+",'"+operator+"',"+result+")");
        con.close();
    }
    public static void multiply() throws SQLException
    {
        Object o;
        o = timestamp();
        String time=o.toString();
        String operator="multiply";
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        double first=sc.nextDouble();
        System.out.println("enter the second number");
        double second=sc.nextDouble();
        double result=first*second;
        System.out.println(result);
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Assignment","root","root");
        Statement stmt=con.createStatement();
        stmt.executeUpdate ("insert into calculator(ctime,cfirst,csecond,coperator,cresult)values('"+time+"',"+first+","+second+",'"+operator+"',"+result+")");
        con.close();
    }
    public static void divide() throws SQLException
    {
        Object o;
        o = timestamp();
        String time=o.toString();
        String operator="divide";
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        double first=sc.nextDouble();
        System.out.println("enter the second number");
        double second=sc.nextDouble();
        double result=first/second;
        System.out.println(result);
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Assignment","root","root");
        Statement stmt=con.createStatement();
        stmt.executeUpdate ("insert into calculator(ctime,cfirst,csecond,coperator,cresult)values('"+time+"',"+first+","+second+",'"+operator+"',"+result+")");
        con.close();
    }
    public static void power() throws SQLException
    {
        Object o;
        o = timestamp();
        String time=o.toString();
        String operator="power";
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the base");
        double first=sc.nextDouble();
        System.out.println("enter the power");
        double second=sc.nextDouble();
        double result=Math.pow(first,second);
        System.out.println(result);
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Assignment","root","root");
        Statement stmt=con.createStatement();
        stmt.executeUpdate ("insert into calculator(ctime,cfirst,csecond,coperator,cresult)values('"+time+"',"+first+","+second+",'"+operator+"',"+result+")");
        con.close();
    }
    public static void absolute() throws SQLException
    {
        Object o;
        o = timestamp();
        String time=o.toString();
        String operator="absolute";
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        double first=sc.nextDouble();
        double result=Math.abs(first);
        System.out.println(result);
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Assignment","root","root");
        Statement stmt=con.createStatement();
        stmt.executeUpdate ("insert into calculator(ctime,cfirst,csecond,coperator,cresult) values('"+time+"',"+first+","+null+",'"+operator+"',"+result+")");
        con.close();
    }
    public static void modulus() throws SQLException
    {
        Object o;
        o = timestamp();
        String time=o.toString();
        String operator="modulus";
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        double first=sc.nextDouble();
        System.out.println("enter the second number");
        double second=sc.nextDouble();
        double result = first%second;
        System.out.println(result);
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Assignment","root","root");
        Statement stmt=con.createStatement();
        stmt.executeUpdate ("insert into calculator(ctime,cfirst,csecond,coperator,cresult)values('"+time+"',"+first+","+second+",'"+operator+"',"+result+")");
        con.close();
    }
    public static void min() throws SQLException
    {
        Object o;
        o = timestamp();
        String time=o.toString();
        String operator="min";
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        double first=sc.nextDouble();
        System.out.println("enter the second number");
        double second=sc.nextDouble();
        double result = Math.min(first,second);
        System.out.println(result);
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Assignment","root","root");
        Statement stmt=con.createStatement();
        stmt.executeUpdate ("insert into calculator(ctime,cfirst,csecond,coperator,cresult)values('"+time+"',"+first+","+second+",'"+operator+"',"+result+")");
        con.close();
    }
    public static void max() throws SQLException
    {
        Object o;
        o = timestamp();
        String time=o.toString();
        String operator="max";
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        double first=sc.nextDouble();
        System.out.println("enter the second number");
        double second=sc.nextDouble();
        double result = Math.max(first,second);
        System.out.println(result);
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Assignment","root","root");
        Statement stmt = con.createStatement();
        stmt.executeUpdate ("insert into calculator(ctime,cfirst,csecond,coperator,cresult)values('"+time+"',"+first+","+second+",'"+operator+"',"+result+")");
        con.close();
    }
    public static Date timestamp()
    {
        java.util.Date date = new java.util.Date();
        return date;
    }
    public static void readAllRecords() throws SQLException, ClassNotFoundException
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Assignment","root","root");
        Statement stmt=con.createStatement();
        String sql="select * from calculator";
        ResultSet rs=stmt.executeQuery(sql);
        while(rs.next())
        {
            System.out.println("id="+rs.getInt(1)+" timestamp="+rs.getString(2)+" first operand="+rs.getDouble(3)+" second operand="+rs.getDouble (4)+" operator used="+rs.getString (5)+" result="+rs.getDouble (6));
        }
        con.close();
    }
    public static void readSpecificRecords() throws SQLException, ClassNotFoundException
    {
        String s;
        System.out.println("enter the operator name as given below to see its all operations record");
        System.out.println("add");
        System.out.println("subtract");
        System.out.println("multiply");
        System.out.println("divide");
        System.out.println("power");
        System.out.println("absolute");
        System.out.println("modulus");
        System.out.println("min");
        System.out.println("max");
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Assignment","root","root");
        Statement stmt=con.createStatement();
        String sql="select * from calculator where coperator = '"+s+"'";
        ResultSet rs=stmt.executeQuery(sql);
        while(rs.next())
        {
            System.out.println("id="+rs.getInt(1)+" timestamp="+rs.getString(2)+" first operand="+rs.getDouble(3)+" second operand="+rs.getDouble (4)+" operator used="+rs.getString (5)+" result="+rs.getDouble (6));
        }
        con.close();
    }
}